# -*- coding: utf-8 -*-
import os, re, gzip
A=r"C:\Users\Administrator\Downloads\tishineng.apk\assets"

def strings(data, minlen=5):
    out=[]
    cur=bytearray()
    for b in data:
        if 32<=b<=126:
            cur.append(b)
        else:
            if len(cur)>=minlen:
                out.append(cur.decode('latin1'))
            cur=bytearray()
    if len(cur)>=minlen:
        out.append(cur.decode('latin1'))
    return out

print("################ libwbsafeedit (arm32) strings ################")
d=open(os.path.join(A,'libwbsafeedit'),'rb').read()
ss=strings(d,5)
# filter interesting
kw=re.compile(r'(http|\.com|\.cn|host|url|key|secret|token|sign|aes|des|rsa|md5|sha|weibo|sina|tencent|qq|appid|encrypt|decrypt|password|Java_|safeedit|wb)',re.I)
seen=set()
for s in ss:
    if kw.search(s) and s not in seen:
        seen.add(s)
        print(" ",s)
print("---- total strings:",len(ss),"  showing JNI/symbol-ish ----")
for s in ss:
    if s.startswith('Java_') or 'JNI' in s or s.startswith('_Z'):
        print("  SYM:",s)
