#!/bin/bash
J=/tmp/new_cookies.txt
C="curl -x http://127.0.0.1:7897 -sk --max-time 15"
rm -f $J
$C -c $J 'https://a.tsnkj.com/' -o /dev/null
R=$(python3 -c "import random;print(random.randint(10**15,10**16-1))")
$C -b $J -c $J "https://a.tsnkj.com/code?randomStr=$R&send=0" -o /tmp/new_cap.jpg
CODE=$(/tmp/ocrvenv/bin/python -c "import ddddocr;print(ddddocr.DdddOcr(show_ad=False).classification(open('/tmp/new_cap.jpg','rb').read()).strip())")
echo "captcha=[$CODE]"
ENC=$(python3 - "$1" <<'PY'
import sys,base64,json,urllib.parse
from cryptography.hazmat.primitives import serialization
from cryptography.hazmat.primitives.asymmetric import padding
j=json.load(open('/tmp/rsa_key.json')); pub=serialization.load_der_public_key(base64.b64decode(j['data']))
s='RSA:'+base64.b64encode(pub.encrypt(sys.argv[1].encode(),padding.PKCS1v15())).decode()
print(urllib.parse.quote(s,safe=''))
PY
)
USR=$(python3 -c "import urllib.parse,sys;print(urllib.parse.quote(sys.argv[1],safe=''))" "$2")
$C -b $J -c $J -X POST "https://a.tsnkj.com/auth/oauth/token?grant_type=password&scope=server&code=$CODE&randomStr=$R&username=$USR&password=$ENC" \
  -H "Authorization: Basic $(printf 'sxqzy:pig'|base64)" -H 'Content-Type: application/x-www-form-urlencoded' -H 'model: Pixel-7' \
  -d 'type=app' -w '\nHTTP %{http_code}\n'
