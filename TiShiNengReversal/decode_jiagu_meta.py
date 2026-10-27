#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
decode_jiagu_meta.py
360 加固 classes.dex 夹带区头部(0x714c 起)是 XOR 混淆的【容器索引/元数据】。
观察: 0xc6 出现极频 => 0xc6 是 0x00 在该 XOR 下的密文 => key 字节 = 0xc6。
本脚本用 0xc6 整体 XOR 解头部, 提取可读字符串(类名/activity/包名/marker),
并尝试把开头解读为 (count + 若干 u32 字段) 的索引表, 推断分段结构。
注意: 高熵正文(entropy 8.00 段)是真正加密的 dex, 不可用此 key 解开。
"""
import struct, collections, re, sys, os

# 2026-08-15 修订: 原硬编码 Win11 路径改为 CLI 参数, 默认指向本机 cap_0 壳 dex
DEFAULT_PATH = os.path.join(os.path.dirname(os.path.abspath(__file__)),
                            "dsh-vm", "dumps", "dexcap", "dexcap", "cap_0_sz45352584.dex")
PATH = sys.argv[1] if len(sys.argv) > 1 else DEFAULT_PATH
print(f"[input] {PATH}  (size={os.path.getsize(PATH)})")
with open(PATH,'rb') as f: data=f.read()
BLOB=0x7140
preamble=data[BLOB:BLOB+12]
print("[preamble]", ' '.join(f'{b:02x}' for b in preamble),
      "=> u32:", [hex(struct.unpack_from('<I',preamble,i)[0]) for i in (0,4,8)])

# decode a window of the metadata with XOR 0xc6
KEY=0xc6
WIN=0x4000
meta = bytes(b^KEY for b in data[BLOB+12:BLOB+12+WIN])

# interpret leading u32s
print("\n[leading u32 (XOR 0xc6) — possible index/length table]")
for i in range(0,64,4):
    v=struct.unpack_from('<I',meta,i)[0]
    print(f"  +0x{i:02x}: 0x{v:08x} = {v}")

# extract printable ascii strings from decoded metadata
print("\n[readable strings in XOR-0xc6 decoded metadata head (len>=4)]")
cur=bytearray(); out=[]
for b in meta:
    if 32<=b<127:
        cur.append(b)
    else:
        if len(cur)>=4: out.append(cur.decode('latin1'))
        cur=bytearray()
if len(cur)>=4: out.append(cur.decode('latin1'))
# dedupe-ish but keep order
seen=set()
for s in out:
    if s in seen: continue
    seen.add(s)
    print("   ", s)

# Also: the text portions used case-flipped key (0x86). Re-decode trying to fix case.
print("\n[same region XOR 0x86 (text-oriented key) strings]")
KEY2=0x86
meta2=bytes(b^KEY2 for b in data[BLOB+12:BLOB+12+WIN])
cur=bytearray(); out2=[]
for b in meta2:
    if 32<=b<127:
        cur.append(b)
    else:
        if len(cur)>=5: out2.append(cur.decode('latin1'))
        cur=bytearray()
seen=set()
for s in out2:
    if s in seen: continue
    seen.add(s)
    if re.search(r'[A-Za-z]{3}', s):
        print("   ", s)
