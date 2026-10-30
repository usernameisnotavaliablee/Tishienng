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
  echo "try$i R=$R code=[$CODE]"
  if [[ "$CODE" =~ ^[A-Za-z0-9]{4,6}$ ]]; then break; fi
  CODE=""
done
if [ -z "$CODE" ]; then echo "OCR failed after retries"; exit 1; fi
ENC=$(python3 -c "import sys;sys.path.insert(0,'/Users/mac/Desktop');from tsn_ctf_probe import aes_password;print(aes_password('''$2'''))")
$C -b $J -c $J -X POST "https://a.tsnkj.com/auth/oauth/token?grant_type=password&scope=server&code=$CODE&randomStr=$R" \
  -H "Authorization: Basic $B64" -H 'Content-Type: application/x-www-form-urlencoded' -H 'model: Pixel-7' \
  --data-urlencode "username=$1" --data-urlencode "password=$ENC" --data-urlencode "grant_type=password" --data-urlencode "type=app" --data-urlencode "appType=stuApp" \
  -w '\nHTTP %{http_code}\n'
