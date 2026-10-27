#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
probe_blob_cipher.py
针对 classes.dex 夹带 blob 的前部"轻混淆头"做密钥探测,并检查内嵌 ELF/PK 区域是否为真实文件。
- 在 blob 头部 (0x714c 起) 尝试单字节 XOR / 加法 / 滚动多字节key, 检测是否出现 dex 魔数或可读 ASCII
- dump 内嵌 ELF(0x24380e3) 与若干 PK 偏移, 判断是否真实可提取
"""
import sys, struct, collections

PATH = r"C:\Users\Administrator\Downloads\tishineng.apk\classes.dex"
with open(PATH,'rb') as f: data = f.read()
sz = len(data)

BLOB = 0x7140
hdr12 = data[BLOB:BLOB+12]
print("[preamble 12B]", ' '.join(f'{b:02x}' for b in hdr12))
v0 = struct.unpack_from('<I',data,BLOB)[0]
v1 = struct.unpack_from('<I',data,BLOB+4)[0]
v2 = struct.unpack_from('<I',data,BLOB+8)[0]
print(f"  as u32: 0x{v0:x}={v0}  0x{v1:x}={v1}  0x{v2:x}={v2}")
print(f"  blob_start=0x{BLOB:x}  file_sz=0x{sz:x}  blob_len={sz-BLOB}=0x{sz-BLOB:x}")

# region right after preamble
region = data[BLOB+12: BLOB+12+512]

def ascii_ratio(b):
    if not b: return 0
    return sum(1 for x in b if 32<=x<127 or x in (9,10,13))/len(b)

print("\n[single-byte XOR scan on first 512B after preamble]")
best=[]
for k in range(256):
    dec = bytes(x^k for x in region)
    r = ascii_ratio(dec)
    has_dex = b'dex\n' in dec
    best.append((r,k,has_dex))
best.sort(reverse=True)
for r,k,hd in best[:6]:
    dec=bytes(x^k for x in region)
    sample=''.join(chr(c) if 32<=c<127 else '.' for c in dec[:64])
    print(f"  key=0x{k:02x} ascii={r:.2f} dex_magic={hd}  '{sample}'")

print("\n[single-byte ADD/SUB scan]")
best=[]
for k in range(256):
    dec = bytes((x-k)&0xff for x in region)
    r = ascii_ratio(dec)
    best.append((r,k))
best.sort(reverse=True)
for r,k in best[:4]:
    dec=bytes((x-k)&0xff for x in region)
    sample=''.join(chr(c) if 32<=c<127 else '.' for c in dec[:64])
    print(f"  sub=0x{k:02x} ascii={r:.2f}  '{sample}'")

# try to find period of the obfuscation by autocorrelation on the 0xc6 runs
print("\n[byte histogram of first 4KB of blob]")
h=collections.Counter(data[BLOB:BLOB+4096])
for b,c in h.most_common(8):
    print(f"  0x{b:02x}: {c}")

# embedded ELF check
def check_elf(off):
    print(f"\n[ELF @0x{off:x}]")
    if data[off:off+4]!=b'\x7fELF':
        print("  not ELF"); return
    ei_class=data[off+4]; ei_data=data[off+5]
    e_type=struct.unpack_from('<H',data,off+16)[0]
    e_machine=struct.unpack_from('<H',data,off+18)[0]
    print(f"  ei_class={ei_class}(1=32,2=64) ei_data={ei_data} e_type={e_type} e_machine={e_machine}(0x28=ARM,0xb7=AARCH64)")
    print("  head:", ' '.join(f'{b:02x}' for b in data[off:off+32]))

for off in (0x24380e3,0x24381cd):
    check_elf(off)

def check_pk(off):
    print(f"\n[PK @0x{off:x}]")
    sig=data[off:off+4]
    print("  sig:",' '.join(f'{b:02x}' for b in sig))
    if sig==b'PK\x03\x04':
        method=struct.unpack_from('<H',data,off+8)[0]
        nlen=struct.unpack_from('<H',data,off+26)[0]
        name=data[off+30:off+30+nlen]
        print(f"  local file header method={method} namelen={nlen} name={name!r}")
    else:
        print("  not a local file header (maybe central dir / random)")

for off in (0x8661cf,0x10c528b,0x10ff066,0x133016b):
    check_pk(off)
