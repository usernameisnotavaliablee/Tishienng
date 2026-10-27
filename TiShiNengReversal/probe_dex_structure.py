#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
probe_dex_structure.py
探测 360 加固 classes.dex 的结构:
- 解析 dex header (file_size / data_off / data_size / map_off / class_defs)
- 定位 map_list 结尾 => 合法 dex 结构终点
- 扫描从结构终点到文件尾的"夹带数据区"(embedded blob)
- 在 blob 中搜常见魔数: dex / ELF / zlib(78 9c/78 01/78 da) / gzip(1f 8b) / PK(zip) / 360 自有标记
- 分段计算香农熵, 找加密/压缩边界
用法: python probe_dex_structure.py <path-to-classes.dex>
"""
import sys, struct, math, collections

def u32(b, o): return struct.unpack_from('<I', b, o)[0]
def u16(b, o): return struct.unpack_from('<H', b, o)[0]

def entropy(data):
    if not data: return 0.0
    c = collections.Counter(data)
    n = len(data)
    return -sum((v/n)*math.log2(v/n) for v in c.values())

def main():
    path = sys.argv[1] if len(sys.argv) > 1 else r"C:\Users\Administrator\Downloads\tishineng.apk\classes.dex"
    with open(path, 'rb') as f:
        data = f.read()
    sz = len(data)
    print(f"[file] {path}  size={sz} (0x{sz:x})")

    magic = data[:8]
    print(f"[magic] {magic!r}")
    # dex header fields
    header_size   = u32(data, 0x24)
    endian_tag    = u32(data, 0x28)
    file_size     = u32(data, 0x20)
    map_off       = u32(data, 0x34)
    class_defs_sz = u32(data, 0x60)
    class_defs_off= u32(data, 0x64)
    data_size     = u32(data, 0x68)
    data_off      = u32(data, 0x6c)
    print(f"[header] header_size=0x{header_size:x} endian=0x{endian_tag:x}")
    print(f"[header] file_size(field)={file_size} (0x{file_size:x})  actual={sz}")
    print(f"[header] class_defs_size={class_defs_sz}  class_defs_off=0x{class_defs_off:x}")
    print(f"[header] data_size={data_size} (0x{data_size:x})  data_off=0x{data_off:x}")
    print(f"[header] map_off=0x{map_off:x}")

    # parse map_list
    if map_off and map_off < sz:
        nitems = u32(data, map_off)
        print(f"\n[map_list] off=0x{map_off:x} n_items={nitems}")
        end = map_off + 4
        last = end
        for i in range(nitems):
            base = map_off + 4 + i*12
            if base+12 > sz: break
            t = u16(data, base)
            size = u32(data, base+4)
            off  = u32(data, base+8)
            tname = MAP_TYPES.get(t, f"0x{t:04x}")
            print(f"  [{i}] type={tname:22} size={size:8} off=0x{off:x}")
            last = max(last, base+12)
        print(f"[map_list] structure ends ~0x{last:x}")
        struct_end = last
    else:
        struct_end = data_off + data_size

    # the "embedded blob" begins after legitimate dex structures
    blob_start = struct_end
    # round up a touch to look at what's after
    print(f"\n[blob] legitimate dex structures end ~0x{struct_end:x}; "
          f"embedded region = 0x{blob_start:x}..0x{sz:x}  ({sz-blob_start} bytes, {(sz-blob_start)/1048576:.1f} MB)")

    # show bytes right at blob start
    print(f"\n[blob head @0x{blob_start:x}]")
    dump(data, blob_start, 128)

    # scan for magics across whole file beyond struct_end
    print("\n[magic scan in embedded region]")
    scan_magics(data, blob_start, sz)

    # entropy profile of embedded region in 64 segments
    print("\n[entropy profile of embedded region — 64 segments]")
    region = data[blob_start:sz]
    nseg = 64
    seglen = max(1, len(region)//nseg)
    rows = []
    for i in range(nseg):
        seg = region[i*seglen:(i+1)*seglen]
        if not seg: break
        rows.append((blob_start + i*seglen, entropy(seg)))
    for off, e in rows:
        bar = '#' * int(e*4)
        print(f"  0x{off:08x}  {e:5.2f}  {bar}")

MAP_TYPES = {
 0x0000:'HEADER_ITEM',0x0001:'STRING_ID',0x0002:'TYPE_ID',0x0003:'PROTO_ID',
 0x0004:'FIELD_ID',0x0005:'METHOD_ID',0x0006:'CLASS_DEF',0x1000:'MAP_LIST',
 0x1001:'TYPE_LIST',0x1002:'ANNOTATION_SET_REF',0x1003:'ANNOTATION_SET',
 0x2000:'CLASS_DATA',0x2001:'CODE',0x2002:'STRING_DATA',0x2003:'DEBUG_INFO',
 0x2004:'ANNOTATION',0x2005:'ENCODED_ARRAY',0x2006:'ANNOTATIONS_DIR',
}

def dump(data, off, n):
    end = min(off+n, len(data))
    for base in range(off, end, 16):
        chunk = data[base:base+16]
        hexs = ' '.join(f'{b:02x}' for b in chunk)
        asc = ''.join(chr(b) if 32<=b<127 else '.' for b in chunk)
        print(f"  0x{base:08x}  {hexs:<48}  {asc}")

def scan_magics(data, start, end):
    sigs = {
        b'dex\n':'DEX', b'\x7fELF':'ELF', b'PK\x03\x04':'ZIP/PK',
        b'\x1f\x8b':'GZIP', b'\x78\x9c':'ZLIB(default)', b'\x78\x01':'ZLIB(none)',
        b'\x78\xda':'ZLIB(best)', b'\x78\x5e':'ZLIB(fast)',
        b'BZh':'BZIP2', b'\xfd7zXZ':'XZ', b'\x04\x22\x4d\x18':'LZ4',
        b'\x28\xb5\x2f\xfd':'ZSTD', b'QLOD':'QIHOO?', b'\x53\x4f\x48\x00':'SOH?',
    }
    found = collections.Counter()
    samples = collections.defaultdict(list)
    i = start
    chunk = data[start:end]
    for sig, name in sigs.items():
        idx = 0
        cnt = 0
        while True:
            p = chunk.find(sig, idx)
            if p < 0: break
            cnt += 1
            if len(samples[name]) < 5:
                samples[name].append(start+p)
            idx = p+1
            if cnt > 100000: break
        if cnt:
            found[name] = cnt
    if not found:
        print("  (no known magic found)")
    for name, cnt in found.most_common():
        s = ', '.join(f'0x{x:x}' for x in samples[name])
        print(f"  {name:16} count={cnt:8}  first offsets: {s}")

if __name__ == '__main__':
    main()
