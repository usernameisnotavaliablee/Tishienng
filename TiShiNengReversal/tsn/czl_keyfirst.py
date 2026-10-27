# -*- coding: utf-8 -*-
import os
A=r"C:\Users\Administrator\Downloads\tishineng.apk\assets"
d=open(os.path.join(A,'na.czl'),'rb').read()

# Re-parse with tolerant scan
i=0; recs=[]
while i < len(d)-6:
    if d[i:i+4]==b'\x00\x01\x01\x00':
        ln=d[i+4]
        val=d[i+6:i+6+ln+1]  # grab a bit extra
        recs.append((i,ln,val))
        # advance to next header
        j=i+6
        nxt=d.find(b'\x00\x01\x01\x00', j)
        i = nxt if nxt!=-1 else len(d)
    else:
        i+=1

print("records:",len(recs))
print("--- hypothesis A: key = value[0], decode value[1:] ---")
for idx,(off,ln,val) in enumerate(recs):
    if not val: continue
    key=val[0]
    dec=bytes(c^key for c in val[1:])
    try: txt=dec.decode('utf-8')
    except: txt=dec.decode('latin1')
    print("rec%02d len=%d key=%02x  %r"%(idx,ln,key,txt))
