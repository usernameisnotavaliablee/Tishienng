# -*- coding: utf-8 -*-
import os, math, json, collections

ROOT = r"C:\Users\Administrator\Downloads\tishineng.apk\assets"
OUT  = r"C:\Users\Administrator\Downloads\tishineng.apk\tsn\assets_scan.txt"

def entropy(data):
    if not data:
        return 0.0
    cnt = collections.Counter(data)
    n = len(data)
    e = 0.0
    for c in cnt.values():
        p = c / n
        e -= p * math.log2(p)
    return e

def magic_id(head):
    sigs = [
        (b"\x89PNG", "PNG"),
        (b"\xff\xd8\xff", "JPEG"),
        (b"GIF8", "GIF"),
        (b"PK\x03\x04", "ZIP/JAR/APK"),
        (b"PK\x05\x06", "ZIP(empty)"),
        (b"\x7fELF", "ELF"),
        (b"dex\n", "DEX"),
        (b"%PDF", "PDF"),
        (b"\x1f\x8b", "GZIP"),
        (b"BZh", "BZIP2"),
        (b"\x42\x4b\x53\x30", "BKS?"),  # not real
        (b"MSL2", "MNN-MSL2 model"),
        (b"<?xml", "XML"),
        (b"<svg", "SVG"),
        (b"{", "JSON?(brace)"),
        (b"[", "JSON?(bracket)"),
        (b"\x04\x22\x4d\x18", "LZ4"),
        (b"\x28\xb5\x2f\xfd", "ZSTD"),
        (b"RIFF", "RIFF/WAV/WEBP"),
        (b"OggS", "OGG"),
        (b"\x00\x00\x00\x18ftyp", "MP4"),
        (b"glTF", "glTF"),
    ]
    for sig, name in sigs:
        if head.startswith(sig):
            return name
    return ""

def printable_ratio(data):
    if not data:
        return 0.0
    pr = sum(1 for b in data if 9 <= b <= 13 or 32 <= b <= 126)
    return pr / len(data)

rows = []
for dirpath, dirnames, filenames in os.walk(ROOT):
    for fn in filenames:
        fp = os.path.join(dirpath, fn)
        rel = os.path.relpath(fp, ROOT)
        try:
            sz = os.path.getsize(fp)
            with open(fp, "rb") as f:
                head = f.read(64)
                f.seek(0)
                # entropy sample: up to 256KB
                sample = f.read(262144)
            ent = entropy(sample)
            pr = printable_ratio(sample)
            mg = magic_id(head)
            rows.append((rel, sz, mg, round(ent,2), round(pr,2), head[:16].hex()))
        except Exception as e:
            rows.append((rel, -1, "ERR:"+str(e), 0, 0, ""))

# sort by extension type
rows.sort(key=lambda r: (os.path.splitext(r[0])[1].lower(), r[0].lower()))

with open(OUT, "w", encoding="utf-8") as o:
    o.write("TOTAL FILES: %d\n\n" % len(rows))
    o.write("%-70s %10s %-18s %5s %5s %s\n" % ("REL_PATH","SIZE","MAGIC","ENT","PRINT","HEAD16HEX"))
    o.write("-"*140 + "\n")
    for r in rows:
        o.write("%-70s %10s %-18s %5s %5s %s\n" % r)

# also a type histogram by extension
ext_hist = collections.Counter(os.path.splitext(r[0])[1].lower() for r in rows)
with open(OUT, "a", encoding="utf-8") as o:
    o.write("\n\n=== EXTENSION HISTOGRAM ===\n")
    for ext, c in sorted(ext_hist.items(), key=lambda x:-x[1]):
        o.write("%-15s %d\n" % (ext if ext else "(none)", c))

print("written", OUT, "rows", len(rows))
