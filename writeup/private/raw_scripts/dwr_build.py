import uuid, sys
method=sys.argv[1]; p0=sys.argv[2]; content=open(sys.argv[3],'rb').read(); mpname=sys.argv[4]
params=[p0,'']; file_idx=1
b='----DWR'+uuid.uuid4().hex
out=bytearray()
def field(n,v): out.extend((f'--{b}\r\nContent-Disposition: form-data; name="{n}"\r\n\r\n{v}\r\n').encode())
field('callCount','1'); field('page','/dwr/test/dwrUploadService'); field('httpSessionId',''); field('scriptSessionId',''); field('batchId','0'); field('instanceId','0')
field('c0-scriptName','dwrUploadService'); field('c0-methodName',method); field('c0-id','0')
for i,p in enumerate(params):
    if i==file_idx: continue
    field(f'c0-param{i}',p)
out.extend((f'--{b}\r\nContent-Disposition: form-data; name="c0-param{file_idx}"; filename="{mpname}"\r\nContent-Type: application/octet-stream\r\n\r\n').encode())
out.extend(content); out.extend(b'\r\n'); out.extend(f'--{b}--\r\n'.encode())
open('/tmp/dwr_body2.bin','wb').write(bytes(out))
open('/tmp/dwr_ct2.txt','w').write(f'multipart/form-data; boundary={b}')
print('ok',len(out))
