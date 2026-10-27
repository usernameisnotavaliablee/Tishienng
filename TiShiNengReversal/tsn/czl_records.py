# -*- coding: utf-8 -*-
import os
A=r"C:\Users\Administrator\Downloads\tishineng.apk\assets"
d=open(os.path.join(A,'na.czl'),'rb').read()

# Parse records: header 00 01 01 00 LL 00 then LL bytes value
i=0
recs=[]
while i < len(d)-6:
    if d[i:i+4]==b'\x00\x01\x01\x00':
        ln=d[i+4]
        # d[i+5] seems to be 0x00
        val=d[i+6:i+6+ln]
        recs.append((i,ln,d[i+5],val))
        i=i+6+ln
    else:
        i+=1

print("records parsed:",len(recs))
def pr(b):
    return sum(1 for x in b if 32<=x<=126)/len(b) if b else 0

for idx,(off,ln,mid,val) in enumerate(recs):
    # try single byte xor
    best=None
    for k in range(256):
        x=bytes(c^k for c in val)
        s=pr(x)
        if best is None or s>best[0]:
            best=(s,k,x)
    s,k,x=best
    try:
        txt=x.decode('utf-8')
    except:
        txt=x.decode('latin1')
    print("rec%02d off=0x%x len=%d mid=%02x  xorkey=0x%02x score=%.2f  %r"%(idx,off,ln,mid,k,s,txt))
