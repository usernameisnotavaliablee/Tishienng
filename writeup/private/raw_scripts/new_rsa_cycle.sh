#!/bin/bash
J=/tmp/new_cookies.txt
C="curl -x http://127.0.0.1:7897 -sk --max-time 15"
SCHOOL=${3:-sxqzy}
B64=$(printf '%s:pig' "$SCHOOL" | base64)
rm -f $J
$C -c $J 'https://a.tsnkj.com/' -o /dev/null
CODE=""; R=""
for i in 1 2 3; do
  R=$(python3 -c "import random;print(random.randint(10**15,10**16-1))")
  $C -b $J -c $J "https://a.tsnkj.com/code?randomStr=$R&send=0" -o /tmp/new_cap.jpg
  CODE=$(/tmp/ocrvenv/bin/python -c "import ddddocr;print(ddddocr.DdddOcr(show_ad=False).classification(open('/tmp/new_cap.jpg','rb').read()).strip())")
  echo "try$i code=[$CODE]"
  [[ "$CODE" =~ ^[A-Za-z0-9]{4,6}$ ]] && break
  CODE=""
done
[ -z "$CODE" ] && { echo OCRFAIL; exit 1; }
ENC=$(python3 - "$2" <<'PY'
import sys,base64,json
from cryptography.hazmat.primitives import serialization
from cryptography.hazmat.primitives.asymmetric import padding
j=json.load(open('/tmp/rsa_key.json')); der=base64.b64decode(j['data'])
pub=serialization.load_der_public_key(der)
ct=pub.encrypt(sys.argv[1].encode(),padding.PKCS1v15())
print('RSA:'+base64.b64encode(ct).decode())
PY
)
echo "user=$1 school=$SCHOOL"
$C -b $J -c $J -X POST "https://a.tsnkj.com/auth/oauth/token?grant_type=password&scope=server&code=$CODE&randomStr=$R" \
  -H "Authorization: Basic $B64" -H 'Content-Type: application/x-www-form-urlencoded' -H 'model: Pixel-7' \
  --data-urlencode "username=$1" --data-urlencode "password=$ENC" --data-urlencode "grant_type=password" --data-urlencode "type=app" --data-urlencode "appType=stuApp" \
  -w '\nHTTP %{http_code}\n'
