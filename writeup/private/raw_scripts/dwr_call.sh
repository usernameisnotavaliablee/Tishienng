#!/bin/bash
M=$1; shift
BODY="callCount=1
page=/dwr/test/dwrUploadService
httpSessionId=
scriptSessionId=
batchId=0
instanceId=0
c0-scriptName=dwrUploadService
c0-methodName=$M
c0-id=0"
i=0
for p in "$@"; do BODY="$BODY
c0-param$i=string:$p"; i=$((i+1)); done
/usr/bin/curl -x http://127.0.0.1:7897 -sk --max-time 20 -X POST "https://m.boxkj.com/dwr/call/plaincall/dwrUploadService.$M.dwr" -H 'Content-Type: text/plain' --data-binary "$BODY"
