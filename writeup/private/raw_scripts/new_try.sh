#!/bin/bash
J=/tmp/new_cookies.txt
C="/usr/bin/curl -x http://127.0.0.1:7897 -sk --max-time 15"
rm -f $J
$C -c $J 'https://a.tsnkj.com/' -o /dev/null
for i in 1 2 3 4 5 6; do
  R=$(python3 -c "import random;print(random.randint(10**15,10**16-1))")
  $C -b $J -c $J "https://a.tsnkj.com/code?randomStr=$R&send=0" -o /tmp/new_cap.jpg
  CODE=$(/tmp/ocrvenv/bin/python - <<'PY'
import ddddocr, re
data=open('/tmp/new_cap.jpg','rb').read()
for beta in (False,True):
    try:
        s=ddddocr.DdddOcr(show_ad=False,beta=beta).classification(data).strip()
    except Exception:
        continue
    if re.fullmatch(r'[A-Za-z0-9]{4,6}', s):
        print(s); break
else:
    print('')
PY
)
  echo "try$i code=[$CODE]"
  [ -z "$CODE" ] && continue
  ENC=$(python3 - "$2" <<'PY'
import sys,base64,json,urllib.parse
from cryptography.hazmat.primitives import serialization
from cryptography.hazmat.primitives.asymmetric import padding
j=json.load(open('/tmp/rsa_key.json')); pub=serialization.load_der_public_key(base64.b64decode(j['data']))
print(urllib.parse.quote('RSA:'+base64.b64encode(pub.encrypt(sys.argv[1].encode(),padding.PKCS1v15())).decode(),safe=''))
PY
)
  USR=$(python3 -c "import urllib.parse,sys;print(urllib.parse.quote(sys.argv[1],safe=''))" "$1")
  RESP=$($C -b $J -c $J -X POST "https://a.tsnkj.com/auth/oauth/token?grant_type=password&scope=server&code=$CODE&randomStr=$R&username=$USR&password=$ENC" \
    -H "Authorization: Basic $(printf 'sxqzy:pig'|base64)" -H 'Content-Type: application/x-www-form-urlencoded' -H 'model: Pixel-7' -d 'type=app')
  echo "resp: $RESP"
  if ! echo "$RESP" | grep -q '验证码'; then exit 0; fi
  /bin/sleep 1
done
echo "NO_VALID_CAPTCHA"
