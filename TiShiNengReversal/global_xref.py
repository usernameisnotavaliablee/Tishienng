#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""global_xref.py —— 对一组全局变量地址：判段(.data/.bss)、读初值、扫.text里
所有 adrp+add/ldr 指向它们的引用点(读/写)。用于找出 KEY 全局是在哪初始化的。"""
import sys
from elftools.elf.elffile import ELFFile
from capstone import Cs, CS_ARCH_ARM64, CS_MODE_ARM

PATH=sys.argv[1]
ADDRS=[int(x,16) for x in sys.argv[2:]] or [0x490010,0x490018,0x490020,0x490028,0x490030]
f=open(PATH,'rb');elf=ELFFile(f);f.seek(0);data=f.read()
segs=[]
for s in elf.iter_segments():
    if s['p_type']=='PT_LOAD':
        segs.append((s['p_vaddr'],s['p_offset'],s['p_filesz'],s['p_memsz']))
def va2off(va):
    for v,o,fz,mz in segs:
        if v<=va<v+fz: return o+(va-v)
    return None
# 段归属
def sec_of(va):
    for sec in elf.iter_sections():
        a=sec['sh_addr']
        if a and a<=va<a+sec['sh_size']:
            return sec.name
    return '?'
# 读全局当前(磁盘)值: 8字节小端 -> 可能是指针
for a in ADDRS:
    off=va2off(a); sec=sec_of(a)
    if off is None:
        print(f"0x{a:x} [{sec}] 不在文件(.bss?) -> 运行时初始化, 磁盘无值"); continue
    raw=data[off:off+8]
    ptr=int.from_bytes(raw,'little')
    print(f"0x{a:x} [{sec}] bytes={raw.hex()} as_ptr=0x{ptr:x}")
    # 若指针落在文件里, 把它指向的字符串读出来
    po=va2off(ptr)
    if po:
        end=data.find(b'\x00',po,po+128); end=end if end>=0 else po+64
        s=data[po:end]
        if all(32<=b<127 for b in s) and len(s)>0:
            print(f"      -> 指向字符串: {s.decode('latin1')!r}")

# 扫 .text 找引用
text=elf.get_section_by_name('.text')
tstart=text['sh_addr'];toff=text['sh_offset'];tsz=text['sh_size']
tcode=data[toff:toff+tsz]
md=Cs(CS_ARCH_ARM64,CS_MODE_ARM);md.detail=True
page={}
targets=set(ADDRS)
print("\n=== .text 引用点(地址: 指令) ===")
for ins in md.disasm(tcode,tstart):
    if ins.mnemonic=='adrp' and len(ins.operands)==2:
        page[ins.reg_name(ins.operands[0].reg)]=ins.operands[1].imm
    elif ins.mnemonic in('add','ldr','str') and len(ins.operands)>=2:
        ops=ins.operands;br=None;disp=0
        if ins.mnemonic=='add' and ops[1].type==2 and ops[2].type==1:
            br=ins.reg_name(ops[1].reg);disp=ops[2].imm
        elif ins.mnemonic in('ldr','str') and ops[1].type==3:
            br=ins.reg_name(ops[1].mem.base);disp=ops[1].mem.disp
        if br in page and (page[br]+disp) in targets:
            tgt=page[br]+disp
            print(f"  0x{ins.address:x}: {ins.mnemonic} {ins.op_str}   -> 0x{tgt:x}")
