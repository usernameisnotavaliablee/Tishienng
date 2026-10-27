# -*- coding: utf-8 -*-
import os, collections, math

A = r"C:\Users\Administrator\Downloads\tishineng.apk\assets"

def hexdump(data, n=512):
    out=[]
    for i in range(0, min(len(data),n), 16):
        chunk=data[i:i+16]
        hexs=' '.join('%02x'%b for b in chunk)
        asc=''.join(chr(b) if 32<=b<=126 else '.' for b in chunk)
        out.append('%06x  %-47s  %s'%(i,hexs,asc))
    return '\n'.join(out)

# ---- na.czl ----
p=os.path.join(A,'na.czl')
d=open(p,'rb').read()
print("=== na.czl size",len(d),"===")
print(hexdump(d,256))
print()
# try XOR with common single bytes, look for printable / 'http' / amap
def score(b):
    pr=sum(1 for x in b if 9<=x<=13 or 32<=x<=126)
    return pr/len(b)
print("raw printable ratio %.2f"%score(d))
best=[]
for k in range(256):
    x=bytes(b^k for b in d)
    s=score(x)
    has=any(t in x for t in [b'http',b'amap',b'.com',b'host',b'url',b'key'])
    best.append((s,k,has))
best.sort(reverse=True)
print("top XOR single-byte keys (score,key,has_kw):")
for s,k,h in best[:8]:
    print("  key=0x%02x score=%.2f kw=%s"%(k,s,h))
# show best decode head
s,k,h=best[0]
x=bytes(b^k for b in d)
print("--- best xor 0x%02x head ---"%k)
print(hexdump(x,256))
