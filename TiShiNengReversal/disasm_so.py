#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
disasm_so.py —— ARM64 SO 函数级反汇编 + 静态数据流辅助。
纯静态、离线。专为还原博星自研 libtsnsecret 的加密/鉴权算法设计。

能力：
  1. 按函数名/地址定位（解析 .dynsym + .symtab），拿到 st_value/st_size
  2. capstone 反汇编该函数
  3. 解析 ADRP(+ADD/LDR) → 计算被引用的绝对地址，若指向只读数据则把那里的
     C 字符串/字节打印出来（这是还原硬编码密钥/盐/格式串的关键）
  4. 把 BL/B 的目标地址映射回符号名（认出 EVP_* / RSA_* / strcmp 等调用）
  5. 统计该函数调用了哪些 OpenSSL/libc 函数 → 反推算法
用法:
  python disasm_so.py <so> --func <name>            # 反汇编单个函数
  python disasm_so.py <so> --func <name> --raw      # 含原始字节
  python disasm_so.py <so> --addr 0x1234 --size 0x200
  python disasm_so.py <so> --list <regex>           # 列匹配的符号+地址
"""
import sys, argparse, re, struct
from elftools.elf.elffile import ELFFile
from elftools.elf.relocation import RelocationSection
from capstone import Cs, CS_ARCH_ARM64, CS_MODE_ARM, CS_OP_IMM, CS_OP_REG

class SO:
    def __init__(self, path):
        self.path = path
        self.f = open(path, 'rb')
        self.elf = ELFFile(self.f)
        self.f.seek(0); self.data = self.f.read()
        self.sym_by_name = {}   # name -> (addr, size)
        self.name_by_addr = {}  # addr -> name (函数)
        self.got_by_slot = {}   # GOT槽位vaddr -> 目标符号名(解析重定位)
        self._load_syms()
        self._load_segments()
        self._load_relocs()
        self.md = Cs(CS_ARCH_ARM64, CS_MODE_ARM)
        self.md.detail = True
        self._plt_cache = {}

    def resolve_plt(self, addr):
        """解析 PLT stub (adrp x16,page; ldr x17,[x16,#off]; br x17) -> 外部符号名。
        OLLVM 下业务函数对 OpenSSL 的调用都走 PLT，这是最可靠的还原途径。"""
        if addr in self._plt_cache:
            return self._plt_cache[addr]
        off = self.va_to_off(addr)
        if off is None:
            self._plt_cache[addr] = None
            return None
        code = self.data[off:off + 16]
        page = None; slot = None
        for ins in self.md.disasm(code, addr):
            if ins.mnemonic == 'adrp':
                page = ins.operands[1].imm
            elif ins.mnemonic == 'ldr' and page is not None and ins.operands[1].type == 3:
                slot = page + ins.operands[1].mem.disp; break
            elif ins.mnemonic in ('br', 'b', 'ret'):
                break
        name = self.got_by_slot.get(slot) if slot is not None else None
        self._plt_cache[addr] = name
        return name


    def _load_syms(self):
        for secname in ('.symtab', '.dynsym'):
            sec = self.elf.get_section_by_name(secname)
            if not sec:
                continue
            for s in sec.iter_symbols():
                if not s.name:
                    continue
                a = s['st_value']
                if a:
                    self.sym_by_name.setdefault(s.name, (a, s['st_size']))
                    if s['st_info']['type'] == 'STT_FUNC':
                        self.name_by_addr.setdefault(a & ~1, s.name)

    def _load_segments(self):
        self.segs = []
        for seg in self.elf.iter_segments():
            if seg['p_type'] == 'PT_LOAD':
                self.segs.append((seg['p_vaddr'], seg['p_offset'],
                                  seg['p_filesz'], seg['p_memsz']))

    def va_to_off(self, va):
        for vaddr, off, filesz, memsz in self.segs:
            if vaddr <= va < vaddr + filesz:
                return off + (va - vaddr)
        return None

    def _load_relocs(self):
        # 解析 .rela.plt / .rela.dyn：GOT槽位地址 -> 目标符号名。
        # 用于把 OLLVM 下 "ldr x8,[GOT_slot]; blr x8" 的间接调用还原成 OpenSSL/libc 名。
        try:
            dynsym = self.elf.get_section_by_name('.dynsym')
        except Exception:
            dynsym = None
        for secname in ('.rela.plt', '.rela.dyn'):
            sec = self.elf.get_section_by_name(secname)
            if not isinstance(sec, RelocationSection):
                continue
            symsec = self.elf.get_section(sec['sh_link']) if sec['sh_link'] else dynsym
            for r in sec.iter_relocations():
                symidx = r['r_info_sym']
                nm = ''
                if symsec and symidx:
                    try:
                        nm = symsec.get_symbol(symidx).name
                    except Exception:
                        nm = ''
                if not nm:
                    # 相对重定位(R_AARCH64_RELATIVE)：值=addend，可能指向本地函数
                    add = r['r_addend']
                    nm = self.name_by_addr.get(add & ~1, '')
                if nm:
                    self.got_by_slot[r['r_offset']] = nm


    def read_cstr(self, va, maxlen=200):
        off = self.va_to_off(va)
        if off is None:
            return None
        end = self.data.find(b'\x00', off, off + maxlen)
        if end < 0:
            end = off + maxlen
        raw = self.data[off:end]
        # 只有当大部分可打印才当字符串
        printable = sum(1 for b in raw if 32 <= b < 127 or b in (9, 10, 13))
        if len(raw) >= 2 and printable >= len(raw) * 0.8:
            return raw.decode('latin1')
        return None

    def read_bytes(self, va, n):
        off = self.va_to_off(va)
        if off is None:
            return None
        return self.data[off:off + n]

    def resolve(self, name=None, addr=None, size=None):
        if name:
            if name not in self.sym_by_name:
                # 模糊匹配
                cand = [k for k in self.sym_by_name if name in k]
                if not cand:
                    raise SystemExit(f"符号未找到: {name}")
                name = sorted(cand, key=len)[0]
            a, sz = self.sym_by_name[name]
            return name, a & ~1, (sz or (size or 0x400))
        return f"sub_{addr:x}", addr & ~1, (size or 0x400)

    def disasm_func(self, name=None, addr=None, size=None, show_raw=False):
        fname, fa, fsz = self.resolve(name, addr, size)
        if fsz == 0:
            fsz = 0x600
        code = self.read_bytes(fa, fsz)
        if code is None:
            raise SystemExit(f"地址不在文件映射内: 0x{fa:x}")
        print(f"### {fname}  @0x{fa:x}  size={fsz}")
        # 记录 adrp 的页基址（每个寄存器）
        adrp_page = {}
        calls = {}
        strings_found = []
        reg_sym = {}   # 寄存器 -> 经GOT加载的目标符号名(用于还原 blr Xn 间接调用)
        for ins in self.md.disasm(code, fa):
            line = f"0x{ins.address:08x}  {ins.mnemonic:<8} {ins.op_str}"
            note = ""
            mn = ins.mnemonic
            if mn == 'adrp' and len(ins.operands) == 2:
                reg = ins.reg_name(ins.operands[0].reg)
                imm = ins.operands[1].imm
                adrp_page[reg] = imm
                reg_sym.pop(reg, None)
            elif mn in ('add', 'ldr') and len(ins.operands) >= 2:
                # add Xd, Xn, #imm  /  ldr Xd, [Xn, #imm]
                ops = ins.operands
                base_reg = None; disp = 0
                dst_reg = ins.reg_name(ops[0].reg) if ops[0].type == CS_OP_REG else None
                if mn == 'add' and ops[1].type == CS_OP_REG and ops[2].type == CS_OP_IMM:
                    base_reg = ins.reg_name(ops[1].reg); disp = ops[2].imm
                elif mn == 'ldr' and ops[1].type == 3:  # mem
                    base_reg = ins.reg_name(ops[1].mem.base); disp = ops[1].mem.disp
                if base_reg in adrp_page:
                    target = adrp_page[base_reg] + disp
                    # 命中 GOT 槽位 → 记录该寄存器现在持有的外部符号
                    gsym = self.got_by_slot.get(target)
                    if gsym and dst_reg:
                        reg_sym[dst_reg] = gsym
                    s = self.read_cstr(target)
                    if gsym:
                        note = f"   ; -> [GOT] {gsym}"
                    elif s is not None:
                        note = f"   ; -> 0x{target:x} = {s!r}"
                        strings_found.append((ins.address, target, s))
                    else:
                        symn = self.name_by_addr.get(target)
                        note = f"   ; -> {symn}" if symn else f"   ; -> 0x{target:x}"
                elif dst_reg:
                    reg_sym.pop(dst_reg, None)
            elif mn in ('bl', 'b') and len(ins.operands) >= 1 and ins.operands[0].type == CS_OP_IMM:
                tgt = ins.operands[0].imm
                symn = self.name_by_addr.get(tgt & ~1)
                if symn:
                    note = f"   ; {symn}"
                    if mn == 'bl':
                        calls[symn] = calls.get(symn, 0) + 1
                else:
                    plt = self.resolve_plt(tgt)
                    if plt:
                        note = f"   ; [PLT] {plt}"
                        if mn == 'bl':
                            calls[plt] = calls.get(plt, 0) + 1
                    else:
                        note = f"   ; sub_{tgt:x}"
            elif mn == 'blr' and len(ins.operands) >= 1 and ins.operands[0].type == CS_OP_REG:
                r = ins.reg_name(ins.operands[0].reg)
                gsym = reg_sym.get(r)
                if gsym:
                    note = f"   ; [GOT] {gsym}"
                    calls[gsym] = calls.get(gsym, 0) + 1
            if show_raw:
                raw = ins.bytes.hex()
                print(f"{line}{note}    [{raw}]")
            else:
                print(f"{line}{note}")
        if calls:
            print("\n--- 该函数调用的已命名符号(bl) ---")
            for k, v in sorted(calls.items(), key=lambda x: -x[1]):
                print(f"   {v:>3}x  {k}")
        if strings_found:
            print("\n--- 引用的字符串常量 ---")
            seen = set()
            for _, t, s in strings_found:
                if (t, s) not in seen:
                    seen.add((t, s)); print(f"   0x{t:x}: {s!r}")

def main():
    ap = argparse.ArgumentParser()
    ap.add_argument('so')
    ap.add_argument('--func')
    ap.add_argument('--addr')
    ap.add_argument('--size')
    ap.add_argument('--list')
    ap.add_argument('--raw', action='store_true')
    a = ap.parse_args()
    so = SO(a.so)
    if a.list:
        rx = re.compile(a.list)
        hits = [(n, v[0], v[1]) for n, v in so.sym_by_name.items() if rx.search(n)]
        for n, addr, sz in sorted(hits, key=lambda x: x[1]):
            print(f"0x{addr:08x}  size={sz:<6}  {n}")
        print(f"\n[{len(hits)} 个匹配]")
        return
    addr = int(a.addr, 16) if a.addr else None
    size = int(a.size, 16) if a.size else None
    so.disasm_func(name=a.func, addr=addr, size=size, show_raw=a.raw)

if __name__ == '__main__':
    main()
