#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""key_hunt.py —— 定位硬编码常量字符串，判断它是"密钥值"还是"JSON键名/标签"。
做法：找到字符串地址；扫 .text 里所有 adrp+add 指向它的引用点；
并打印该字符串周围 rodata 上下文(看附近有没有同组真·key 值/base64/hex)。"""
import sys, re, struct
from elftools.elf.elffile import ELFFile
from capstone import Cs, CS_ARCH_ARM64, CS_MODE_ARM

PATH = sys.argv[1]
TARGETS = sys.argv[2:] or ['AUTH_KEY','QR_CODE_KEY','WJXY_NFC_KEY','BJYDDXSJXY_NFC_KEY','SIGNATRUE_QZONE']

f = open(PATH,'rb'); elf = ELFFile(f); f.seek(0); data = f.read()
segs=[]
for s in elf.iter_segments():
    if s['p_type']=='PT_LOAD':
        segs.append((s['p_vaddr'],s['p_offset'],s['p_filesz']))
def off2va(off):
    for v,o,sz in segs:
        if o<=off<o+sz: return v+(off-o)
    return None
def va2off(va):
    for v,o,sz in segs:
        if v<=va<v+sz: return o+(va-v)
    return None

text = elf.get_section_by_name('.text')
tstart=text['sh_addr']; toff=text['sh_offset']; tsz=text['sh_size']
tcode=data[toff:toff+tsz]
md=Cs(CS_ARCH_ARM64,CS_MODE_ARM); md.detail=True

# 预扫所有字符串位置
def find_str_va(name):
    pat=name.encode()
    res=[]
    i=0
    while True:
        j=data.find(pat,i)
        if j<0: break
        # 要求是完整C串(前一字节为0或不可见, 后面有\0界定)
        va=off2va(j)
        if va is not None:
            res.append((j,va))
        i=j+1
    return res

# 建 adrp 页表 -> 找引用: 简单线性扫 text，跟踪每寄存器 adrp 页
def xrefs_to(va_target):
    refs=[]
    page={}
    for ins in md.disasm(tcode,tstart):
        if ins.mnemonic=='adrp' and len(ins.operands)==2:
            page[ins.reg_name(ins.operands[0].reg)]=ins.operands[1].imm
        elif ins.mnemonic in('add','ldr') and len(ins.operands)>=2:
            ops=ins.operands
            br=None;disp=0
            if ins.mnemonic=='add' and ops[1].type==2 and ops[2].type==1:
                br=ins.reg_name(ops[1].reg);disp=ops[2].imm
            elif ins.mnemonic=='ldr' and ops[1].type==3:
                br=ins.reg_name(ops[1].mem.base);disp=ops[1].mem.disp
            if br in page and page[br]+disp==va_target:
                refs.append(ins.address)
    return refs

for name in TARGETS:
    print("="*70); print("TARGET:",name)
    locs=find_str_va(name)
    if not locs:
        print("  (字符串未找到)"); continue
    for off,va in locs[:3]:
        # rodata 上下文：前后 64 字节
        ctx=data[max(0,off-48):off+len(name)+80]
        printable=''.join(chr(b) if 32<=b<127 else '.' for b in ctx)
        print(f"  @file=0x{off:x} va=0x{va:x}")
        print(f"    ctx: {printable!r}")
        refs=xrefs_to(va)
        print(f"    .text 引用点: {[hex(r) for r in refs[:12]]}  (共{len(refs)})")
