#!/bin/bash
J=/tmp/lg2_cookies.txt
C="/usr/bin/curl -x http://127.0.0.1:7897 -sk --max-time 15"
for i in 1 2 3; do
  rm -f $J
  $C -c $J 'https://m.boxkj.com/admin/login' -o /dev/null
  $C -b $J -c $J 'https://m.boxkj.com/code/captcha-image' -o /tmp/lg2_cap.jpg
  CODE=$(/tmp/ocrvenv/bin/python - <<'PY'
from PIL import Image
import numpy as np, ddddocr, re
im=Image.open('/tmp/lg2_cap.jpg').convert('RGB'); a=np.array(im).astype(int)
R,G,B=a[:,:,0],a[:,:,1],a[:,:,2]
m=(R>110)&((R-G)>40)&((R-B)>40)
Image.fromarray(np.where(m,0,255).astype('uint8')).save('/tmp/lg2_mask.png')
s=ddddocr.DdddOcr(show_ad=False).classification(open('/tmp/lg2_mask.png','rb').read()).strip().lower()
print(s if re.fullmatch(r'[a-z0-9]{3,6}',s) else '')
PY
)
  [ -z "$CODE" ] && { echo "try$i OCRFAIL"; continue; }
  RESP=$($C -b $J -c $J -X POST 'https://m.boxkj.com/admin/login' -H 'X-Requested-With: XMLHttpRequest' -H 'Referer: https://m.boxkj.com/' --data-urlencode "uname=$1" --data-urlencode "pwd=$2" --data-urlencode "code=$CODE")
  echo "try$i code=[$CODE] resp: $RESP"
  ! echo "$RESP" | grep -q '验证码错误' && exit 0
  /bin/sleep 1
done
echo RETRY_EXHAUSTED
