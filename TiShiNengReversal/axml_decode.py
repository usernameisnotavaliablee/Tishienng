#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Minimal Android Binary XML (AXML) decoder. Read-only, local."""
import struct, sys

def u16(b, o): return struct.unpack_from('<H', b, o)[0]
def u32(b, o): return struct.unpack_from('<I', b, o)[0]

def parse_string_pool(b, off):
    # chunk header at off: type(u16) headerSize(u16) chunkSize(u32)
    chunk_size = u32(b, off + 4)
    string_count = u32(b, off + 8)
    flags = u32(b, off + 16)
    strings_start = u32(b, off + 20)
    is_utf8 = (flags & (1 << 8)) != 0
    offs = [u32(b, off + 28 + i * 4) for i in range(string_count)]
    data_base = off + strings_start
    out = []
    for so in offs:
        p = data_base + so
        if is_utf8:
            # u8 char-len (maybe high-bit), u8 byte-len, bytes, \x00
            n = b[p]; q = p + 1
            if n & 0x80: n = ((n & 0x7f) << 8) | b[q]; q += 1
            blen = b[q]; q += 1
            if blen & 0x80: blen = ((blen & 0x7f) << 8) | b[q]; q += 1
            s = b[q:q+blen].decode('utf-8', 'replace')
        else:
            n = u16(b, p); q = p + 2
            if n & 0x8000: n = ((n & 0x7fff) << 16) | u16(b, q); q += 2
            s = b[q:q+n*2].decode('utf-16-le', 'replace')
        out.append(s)
    return out, off + chunk_size

def res_val(b, off, strs):
    # Res_value: size(u16) res0(u8) dataType(u8) data(u32)
    dtype = b[off + 3]; data = u32(b, off + 4)
    if dtype == 0x03:  # string
        return strs[data] if data < len(strs) else f"@str/{data}"
    if dtype == 0x12:  # bool
        return "true" if data else "false"
    if dtype == 0x10:  # int dec
        return str(struct.unpack('<i', struct.pack('<I', data))[0])
    if dtype == 0x11:  # int hex
        return hex(data)
    if dtype in (0x01, 0x02):  # reference / attribute
        return f"@{'' if dtype==1 else '?'}{hex(data)}"
    return str(data)

def main(path):
    b = open(path, 'rb').read()
    # file header: type(u16=0x0003) header(u16) size(u32); then string pool chunk
    assert u16(b, 0) == 0x0003, "not AXML"
    pos = 8
    strs, pos = parse_string_pool(b, pos)
    # skip resource map chunk if present (type 0x0180)
    while pos < len(b):
        ctype = u16(b, pos); csize = u32(b, pos + 4)
        if ctype == 0x0180:  # RES_XML_RESOURCE_MAP
            pos += csize; continue
        break
    depth = 0
    out = []
    while pos < len(b):
        ctype = u16(b, pos); hsize = u16(b, pos + 2); csize = u32(b, pos + 4)
        if ctype == 0x0102:  # START_ELEMENT
            ns = u32(b, pos + 16); name = u32(b, pos + 20)
            attr_start = u16(b, pos + 24)
            attr_count = u16(b, pos + 28)
            ename = strs[name]
            attrs = []
            ao = pos + 16 + attr_start  # attrExt base (pos+16) + attributeStart
            for i in range(attr_count):
                a_ns = u32(b, ao); a_name = u32(b, ao + 4)
                a_val = res_val(b, ao + 12, strs)
                an = strs[a_name] if a_name < len(strs) else f"attr{a_name}"
                attrs.append(f'{an}="{a_val}"')
                ao += 20
            indent = "  " * depth
            astr = (" " + " ".join(attrs)) if attrs else ""
            out.append(f"{indent}<{ename}{astr}>")
            depth += 1
        elif ctype == 0x0103:  # END_ELEMENT
            depth -= 1
            name = u32(b, pos + 20)
            out.append("  " * depth + f"</{strs[name]}>")
        pos += csize
    print("\n".join(out))

if __name__ == '__main__':
    main(sys.argv[1])
