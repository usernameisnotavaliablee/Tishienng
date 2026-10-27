package com.umeng.socialize.net.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class UClient {
    private static final java.lang.String END = "\r\n";
    private static final java.lang.String TAG = "UClient";

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    protected static class ResponseObj {
        public int httpResponseCode;
        public org.json.JSONObject jsonObject;

        protected ResponseObj() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public UClient() {
            r0 = this;
            r0.<init>()
            return
    }

    private void addBodyParams(com.umeng.socialize.net.utils.URequest r7, java.io.OutputStream r8, java.lang.String r9) throws java.io.IOException {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Map r1 = r7.getBodyPair()
            java.util.Set r2 = r1.keySet()
            java.util.Iterator r2 = r2.iterator()
        L11:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2f
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r1.get(r3)
            if (r4 == 0) goto L11
            java.lang.Object r4 = r1.get(r3)
            java.lang.String r4 = r4.toString()
            r6.addFormField(r0, r3, r4, r9)
            goto L11
        L2f:
            int r1 = r0.length()
            r2 = 1
            if (r1 <= 0) goto L49
            java.io.DataOutputStream r1 = new java.io.DataOutputStream
            r1.<init>(r8)
            java.lang.String r8 = r0.toString()
            byte[] r8 = r8.getBytes()
            r1.write(r8)
            r8 = r1
            r0 = 1
            goto L4a
        L49:
            r0 = 0
        L4a:
            java.util.Map r7 = r7.getFilePair()
            if (r7 == 0) goto L7f
            int r1 = r7.size()
            if (r1 <= 0) goto L7f
            java.util.Set r1 = r7.keySet()
            java.util.Iterator r1 = r1.iterator()
        L5e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L7f
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r3 = r7.get(r3)
            com.umeng.socialize.net.utils.URequest$FilePair r3 = (com.umeng.socialize.net.utils.URequest.FilePair) r3
            byte[] r4 = r3.mBinaryData
            if (r4 == 0) goto L5e
            int r5 = r4.length
            if (r5 >= r2) goto L78
            goto L5e
        L78:
            java.lang.String r0 = r3.mFileName
            r6.addFilePart(r0, r4, r9, r8)
            r0 = 1
            goto L5e
        L7f:
            if (r0 == 0) goto L84
            r6.finishWrite(r8, r9)
        L84:
            return
    }

    private void addFilePart(java.lang.String r3, byte[] r4, java.lang.String r5, java.io.OutputStream r6) throws java.io.IOException {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "--"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = "\r\n"
            r0.append(r5)
            java.lang.String r1 = "Content-Disposition: form-data; name=\""
            r0.append(r1)
            java.lang.String r1 = "pic"
            r0.append(r1)
            java.lang.String r1 = "\"; filename=\""
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = "\""
            r0.append(r3)
            r0.append(r5)
            java.lang.String r3 = "Content-Type: "
            r0.append(r3)
            java.lang.String r3 = "application/octet-stream"
            r0.append(r3)
            r0.append(r5)
            java.lang.String r3 = "Content-Transfer-Encoding: binary"
            r0.append(r3)
            r0.append(r5)
            r0.append(r5)
            java.lang.String r3 = r0.toString()
            byte[] r3 = r3.getBytes()
            r6.write(r3)
            r6.write(r4)
            byte[] r3 = r5.getBytes()
            r6.write(r3)
            return
    }

    private void addFormField(java.lang.StringBuilder r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r1 = this;
            java.lang.String r0 = "--"
            r2.append(r0)
            r2.append(r5)
            java.lang.String r5 = "\r\n"
            r2.append(r5)
            java.lang.String r0 = "Content-Disposition: form-data; name=\""
            r2.append(r0)
            r2.append(r3)
            java.lang.String r3 = "\""
            r2.append(r3)
            r2.append(r5)
            java.lang.String r3 = "Content-Type: text/plain; charset="
            r2.append(r3)
            java.lang.String r3 = "UTF-8"
            r2.append(r3)
            r2.append(r5)
            r2.append(r5)
            r2.append(r4)
            r2.append(r5)
            return
    }

    private org.json.JSONObject decryptData(com.umeng.socialize.net.utils.URequest r1, java.lang.String r2) {
            r0 = this;
            java.lang.String r1 = r1.getDecryptString(r2)     // Catch: java.lang.Throwable -> La
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> La
            r2.<init>(r1)     // Catch: java.lang.Throwable -> La
            return r2
        La:
            r1 = move-exception
            java.lang.String r2 = com.umeng.socialize.utils.UmengText.NET.CREATE
            com.umeng.socialize.utils.SLog.error(r2, r1)
            r1 = 0
            return r1
    }

    private void finishWrite(java.io.OutputStream r4, java.lang.String r5) throws java.io.IOException {
            r3 = this;
            java.lang.String r0 = "\r\n"
            byte[] r1 = r0.getBytes()
            r4.write(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "--"
            r1.append(r2)
            r1.append(r5)
            r1.append(r2)
            java.lang.String r5 = r1.toString()
            byte[] r5 = r5.getBytes()
            r4.write(r5)
            byte[] r5 = r0.getBytes()
            r4.write(r5)
            r4.flush()
            r4.close()
            return
    }

    private com.umeng.socialize.net.utils.UClient.ResponseObj httpGetRequest(com.umeng.socialize.net.utils.URequest r7) {
            r6 = this;
            r0 = 0
            java.net.HttpURLConnection r1 = r6.openUrlConnection(r7)     // Catch: java.lang.Throwable -> L49
            if (r1 != 0) goto L10
            r6.closeQuietly(r0)
            if (r1 == 0) goto Lf
            r1.disconnect()
        Lf:
            return r0
        L10:
            int r2 = r1.getResponseCode()     // Catch: java.lang.Throwable -> L3f
            com.umeng.socialize.net.utils.UClient$ResponseObj r3 = new com.umeng.socialize.net.utils.UClient$ResponseObj     // Catch: java.lang.Throwable -> L3f
            r3.<init>()     // Catch: java.lang.Throwable -> L3f
            r3.httpResponseCode = r2     // Catch: java.lang.Throwable -> L3f
            r4 = 200(0xc8, float:2.8E-43)
            if (r2 != r4) goto L42
            java.io.InputStream r2 = r1.getInputStream()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r4 = r1.getContentEncoding()     // Catch: java.lang.Throwable -> L3d
            java.lang.String r5 = r1.getRequestMethod()     // Catch: java.lang.Throwable -> L3d
            org.json.JSONObject r7 = r6.parseResult(r7, r5, r4, r2)     // Catch: java.lang.Throwable -> L3d
            r3.jsonObject = r7     // Catch: java.lang.Throwable -> L3d
            java.lang.String r7 = com.umeng.socialize.utils.UmengText.NET.JSONRESULT     // Catch: java.lang.Throwable -> L3d
            com.umeng.socialize.utils.SLog.debug(r7)     // Catch: java.lang.Throwable -> L3d
            r6.closeQuietly(r2)
            r1.disconnect()
            return r3
        L3d:
            r7 = move-exception
            goto L4c
        L3f:
            r7 = move-exception
            r2 = r0
            goto L4c
        L42:
            r6.closeQuietly(r0)
            r1.disconnect()
            return r0
        L49:
            r7 = move-exception
            r1 = r0
            r2 = r1
        L4c:
            java.lang.String r3 = com.umeng.socialize.utils.UmengText.NET.PARSEERROR     // Catch: java.lang.Throwable -> L5a
            com.umeng.socialize.utils.SLog.error(r3, r7)     // Catch: java.lang.Throwable -> L5a
            r6.closeQuietly(r2)
            if (r1 == 0) goto L59
            r1.disconnect()
        L59:
            return r0
        L5a:
            r7 = move-exception
            r6.closeQuietly(r2)
            if (r1 == 0) goto L63
            r1.disconnect()
        L63:
            throw r7
    }

    private com.umeng.socialize.net.utils.UClient.ResponseObj httpPostRequest(com.umeng.socialize.net.utils.URequest r10) {
            r9 = this;
            org.json.JSONObject r0 = r10.toJson()
            if (r0 != 0) goto L9
            java.lang.String r0 = ""
            goto L11
        L9:
            org.json.JSONObject r0 = r10.toJson()
            java.lang.String r0 = r0.toString()
        L11:
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.net.HttpURLConnection r3 = r9.openUrlConnection(r10)     // Catch: java.lang.Throwable -> L196
            if (r3 != 0) goto L2c
            r9.closeQuietly(r2)
            r9.closeQuietly(r2)
            if (r3 == 0) goto L2b
            r3.disconnect()
        L2b:
            return r2
        L2c:
            java.util.Map r4 = r10.getBodyPair()     // Catch: java.lang.Throwable -> L5e
            com.umeng.socialize.net.utils.URequest$MIME r5 = r10.mMimeType     // Catch: java.lang.Throwable -> L5e
            java.lang.String r6 = "Content-Type"
            if (r5 == 0) goto L63
            java.lang.String r0 = "data"
            java.lang.Object r0 = r4.get(r0)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L5e
            com.umeng.socialize.net.utils.URequest$MIME r1 = r10.mMimeType     // Catch: java.lang.Throwable -> L5e
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L5e
            r3.setRequestProperty(r6, r1)     // Catch: java.lang.Throwable -> L5e
            java.io.OutputStream r1 = r3.getOutputStream()     // Catch: java.lang.Throwable -> L5e
            boolean r4 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L5a
            if (r4 != 0) goto L111
            byte[] r0 = r0.getBytes()     // Catch: java.lang.Throwable -> L5a
            r1.write(r0)     // Catch: java.lang.Throwable -> L5a
            goto L111
        L5a:
            r10 = move-exception
        L5b:
            r0 = r2
            goto L19a
        L5e:
            r10 = move-exception
            r0 = r2
            r1 = r0
            goto L19a
        L63:
            com.umeng.socialize.net.utils.URequest$PostStyle r5 = r10.postStyle     // Catch: java.lang.Throwable -> L5e
            com.umeng.socialize.net.utils.URequest$PostStyle r7 = com.umeng.socialize.net.utils.URequest.PostStyle.APPLICATION     // Catch: java.lang.Throwable -> L5e
            java.lang.String r8 = "application/x-www-form-urlencoded"
            if (r5 != r7) goto Lb7
            r3.setRequestProperty(r6, r8)     // Catch: java.lang.Throwable -> L5e
            android.net.Uri$Builder r0 = new android.net.Uri$Builder     // Catch: java.lang.Throwable -> L5e
            r0.<init>()     // Catch: java.lang.Throwable -> L5e
            java.util.Set r1 = r4.keySet()     // Catch: java.lang.Throwable -> L5e
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L5e
        L7b:
            boolean r5 = r1.hasNext()     // Catch: java.lang.Throwable -> L5e
            if (r5 == 0) goto L98
            java.lang.Object r5 = r1.next()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r6 = r4.get(r5)     // Catch: java.lang.Throwable -> L93
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L93
            r0.appendQueryParameter(r5, r6)     // Catch: java.lang.Throwable -> L93
            goto L7b
        L93:
            r5 = move-exception
            com.umeng.socialize.utils.SLog.error(r5)     // Catch: java.lang.Throwable -> L5e
            goto L7b
        L98:
            android.net.Uri r0 = r0.build()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r0 = r0.getEncodedQuery()     // Catch: java.lang.Throwable -> L5e
            java.io.DataOutputStream r1 = new java.io.DataOutputStream     // Catch: java.lang.Throwable -> L5e
            java.io.OutputStream r4 = r3.getOutputStream()     // Catch: java.lang.Throwable -> L5e
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L5e
            boolean r4 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L5a
            if (r4 != 0) goto L111
            byte[] r0 = r0.getBytes()     // Catch: java.lang.Throwable -> L5a
            r1.write(r0)     // Catch: java.lang.Throwable -> L5a
            goto L111
        Lb7:
            if (r4 == 0) goto Lbf
            int r4 = r4.size()     // Catch: java.lang.Throwable -> L5e
            if (r4 > 0) goto Lc5
        Lbf:
            com.umeng.socialize.net.utils.URequest$PostStyle r4 = r10.postStyle     // Catch: java.lang.Throwable -> L5e
            com.umeng.socialize.net.utils.URequest$PostStyle r5 = com.umeng.socialize.net.utils.URequest.PostStyle.MULTIPART     // Catch: java.lang.Throwable -> L5e
            if (r4 != r5) goto Le6
        Lc5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5e
            r0.<init>()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r4 = "multipart/form-data; boundary="
            r0.append(r4)     // Catch: java.lang.Throwable -> L5e
            r0.append(r1)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L5e
            r3.setRequestProperty(r6, r0)     // Catch: java.lang.Throwable -> L5e
            java.io.OutputStream r0 = r3.getOutputStream()     // Catch: java.lang.Throwable -> L5e
            r9.addBodyParams(r10, r0, r1)     // Catch: java.lang.Throwable -> Le2
            r1 = r0
            goto L111
        Le2:
            r10 = move-exception
            r1 = r0
            goto L5b
        Le6:
            r3.setRequestProperty(r6, r8)     // Catch: java.lang.Throwable -> L5e
            android.net.Uri$Builder r1 = new android.net.Uri$Builder     // Catch: java.lang.Throwable -> L5e
            r1.<init>()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r4 = "content"
            r1.appendQueryParameter(r4, r0)     // Catch: java.lang.Throwable -> L5e
            android.net.Uri r0 = r1.build()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r0 = r0.getEncodedQuery()     // Catch: java.lang.Throwable -> L5e
            java.io.DataOutputStream r1 = new java.io.DataOutputStream     // Catch: java.lang.Throwable -> L5e
            java.io.OutputStream r4 = r3.getOutputStream()     // Catch: java.lang.Throwable -> L5e
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L5e
            boolean r4 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L5a
            if (r4 != 0) goto L111
            byte[] r0 = r0.getBytes()     // Catch: java.lang.Throwable -> L5a
            r1.write(r0)     // Catch: java.lang.Throwable -> L5a
        L111:
            r1.flush()     // Catch: java.lang.Throwable -> L5a
            int r0 = r3.getResponseCode()     // Catch: java.lang.Throwable -> L5a
            com.umeng.socialize.net.utils.UClient$ResponseObj r4 = new com.umeng.socialize.net.utils.UClient$ResponseObj     // Catch: java.lang.Throwable -> L5a
            r4.<init>()     // Catch: java.lang.Throwable -> L5a
            r4.httpResponseCode = r0     // Catch: java.lang.Throwable -> L5a
            r5 = 200(0xc8, float:2.8E-43)
            if (r0 != r5) goto L18c
            java.io.InputStream r0 = r3.getInputStream()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r5 = r3.getContentEncoding()     // Catch: java.lang.Throwable -> L16c
            java.io.InputStream r6 = r9.wrapStream(r5, r0)     // Catch: java.lang.Throwable -> L16c
            java.lang.String r6 = r9.convertStreamToString(r6)     // Catch: java.lang.Throwable -> L16c
            java.lang.String r7 = "success"
            boolean r7 = r6.startsWith(r7)     // Catch: java.lang.Throwable -> L16c
            if (r7 != 0) goto L16e
            java.lang.String r7 = "fail"
            boolean r7 = r6.startsWith(r7)     // Catch: java.lang.Throwable -> L16c
            if (r7 == 0) goto L144
            goto L16e
        L144:
            java.lang.String r6 = r3.getRequestMethod()     // Catch: java.lang.Throwable -> L16c
            org.json.JSONObject r10 = r9.parseResult(r10, r6, r5, r0)     // Catch: java.lang.Throwable -> L16c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L16c
            r5.<init>()     // Catch: java.lang.Throwable -> L16c
            java.lang.String r6 = com.umeng.socialize.utils.UmengText.NET.POSTJSON     // Catch: java.lang.Throwable -> L16c
            r5.append(r6)     // Catch: java.lang.Throwable -> L16c
            r5.append(r10)     // Catch: java.lang.Throwable -> L16c
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L16c
            com.umeng.socialize.utils.SLog.debug(r5)     // Catch: java.lang.Throwable -> L16c
            r4.jsonObject = r10     // Catch: java.lang.Throwable -> L16c
        L162:
            r9.closeQuietly(r0)
            r9.closeQuietly(r1)
            r3.disconnect()
            return r4
        L16c:
            r10 = move-exception
            goto L19a
        L16e:
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L16c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L16c
            r5.<init>()     // Catch: java.lang.Throwable -> L16c
            java.lang.String r7 = "{\"result\":\""
            r5.append(r7)     // Catch: java.lang.Throwable -> L16c
            r5.append(r6)     // Catch: java.lang.Throwable -> L16c
            java.lang.String r6 = "\"}"
            r5.append(r6)     // Catch: java.lang.Throwable -> L16c
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L16c
            r10.<init>(r5)     // Catch: java.lang.Throwable -> L16c
            r4.jsonObject = r10     // Catch: java.lang.Throwable -> L16c
            goto L162
        L18c:
            r9.closeQuietly(r2)
            r9.closeQuietly(r1)
            r3.disconnect()
            return r2
        L196:
            r10 = move-exception
            r0 = r2
            r1 = r0
            r3 = r1
        L19a:
            java.lang.String r4 = com.umeng.socialize.utils.UmengText.NET.PARSEERROR     // Catch: java.lang.Throwable -> L1ab
            com.umeng.socialize.utils.SLog.error(r4, r10)     // Catch: java.lang.Throwable -> L1ab
            r9.closeQuietly(r0)
            r9.closeQuietly(r1)
            if (r3 == 0) goto L1aa
            r3.disconnect()
        L1aa:
            return r2
        L1ab:
            r10 = move-exception
            r9.closeQuietly(r0)
            r9.closeQuietly(r1)
            if (r3 == 0) goto L1b7
            r3.disconnect()
        L1b7:
            throw r10
    }

    private java.net.HttpURLConnection openUrlConnection(com.umeng.socialize.net.utils.URequest r5) throws java.io.IOException {
            r4 = this;
            java.lang.String r0 = r5.getHttpMethod()
            java.lang.String r0 = r0.trim()
            java.lang.String r1 = com.umeng.socialize.net.utils.URequest.GET
            boolean r1 = r1.equals(r0)
            r2 = 0
            if (r1 == 0) goto L16
            java.lang.String r1 = r5.toGetUrl()
            goto L22
        L16:
            java.lang.String r1 = com.umeng.socialize.net.utils.URequest.POST
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L21
            java.lang.String r1 = r5.mBaseUrl
            goto L22
        L21:
            r1 = r2
        L22:
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 == 0) goto L29
            return r2
        L29:
            java.net.URL r2 = new java.net.URL
            r2.<init>(r1)
            java.lang.String r1 = r2.getProtocol()
            java.lang.String r3 = "https"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L41
            java.net.URLConnection r1 = r2.openConnection()
            javax.net.ssl.HttpsURLConnection r1 = (javax.net.ssl.HttpsURLConnection) r1
            goto L47
        L41:
            java.net.URLConnection r1 = r2.openConnection()
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1
        L47:
            int r2 = com.umeng.socialize.Config.connectionTimeOut
            r1.setConnectTimeout(r2)
            int r2 = com.umeng.socialize.Config.readSocketTimeOut
            r1.setReadTimeout(r2)
            r1.setRequestMethod(r0)
            java.lang.String r2 = com.umeng.socialize.net.utils.URequest.GET
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L8f
            java.lang.String r0 = "Accept-Encoding"
            java.lang.String r2 = "gzip"
            r1.setRequestProperty(r0, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r5.mHeaders
            if (r0 == 0) goto L9e
            int r0 = r0.size()
            if (r0 <= 0) goto L9e
            java.util.Map<java.lang.String, java.lang.String> r0 = r5.mHeaders
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L77:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L9e
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.util.Map<java.lang.String, java.lang.String> r3 = r5.mHeaders
            java.lang.Object r3 = r3.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            r1.setRequestProperty(r2, r3)
            goto L77
        L8f:
            java.lang.String r5 = com.umeng.socialize.net.utils.URequest.POST
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L9e
            r5 = 1
            r1.setDoOutput(r5)
            r1.setDoInput(r5)
        L9e:
            return r1
    }

    private void verifyMethod(java.lang.String r4) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L1d
            java.lang.String r0 = com.umeng.socialize.net.utils.URequest.GET
            java.lang.String r1 = r4.trim()
            boolean r0 = r0.equals(r1)
            java.lang.String r1 = com.umeng.socialize.net.utils.URequest.POST
            java.lang.String r2 = r4.trim()
            boolean r1 = r1.equals(r2)
            if (r0 == r1) goto L1d
            return
        L1d:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r4 = com.umeng.socialize.utils.UmengText.netMethodError(r4)
            r0.<init>(r4)
            throw r0
    }

    protected void closeQuietly(java.io.Closeable r2) {
            r1 = this;
            if (r2 == 0) goto Lc
            r2.close()     // Catch: java.lang.Throwable -> L6
            return
        L6:
            r2 = move-exception
            java.lang.String r0 = com.umeng.socialize.utils.UmengText.NET.CLOSE
            com.umeng.socialize.utils.SLog.error(r0, r2)
        Lc:
            return
    }

    protected java.lang.String convertStreamToString(java.io.InputStream r5) {
            r4 = this;
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            r0.<init>(r5)
            java.io.BufferedReader r5 = new java.io.BufferedReader
            r1 = 512(0x200, float:7.17E-43)
            r5.<init>(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
        L11:
            java.lang.String r2 = r5.readLine()     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L2e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2c
            r3.<init>()     // Catch: java.lang.Throwable -> L2c
            r3.append(r2)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r2 = "\n"
            r3.append(r2)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L2c
            r1.append(r2)     // Catch: java.lang.Throwable -> L2c
            goto L11
        L2c:
            r1 = move-exception
            goto L39
        L2e:
            r4.closeQuietly(r0)
            r4.closeQuietly(r5)
            java.lang.String r5 = r1.toString()
            return r5
        L39:
            java.lang.String r2 = com.umeng.socialize.utils.UmengText.NET.TOOL     // Catch: java.lang.Throwable -> L46
            com.umeng.socialize.utils.SLog.error(r2, r1)     // Catch: java.lang.Throwable -> L46
            r4.closeQuietly(r0)
            r4.closeQuietly(r5)
            r5 = 0
            return r5
        L46:
            r1 = move-exception
            r4.closeQuietly(r0)
            r4.closeQuietly(r5)
            throw r1
    }

    protected <T extends com.umeng.socialize.net.utils.UResponse> T createResponse(com.umeng.socialize.net.utils.UClient.ResponseObj r7, java.lang.Class<T> r8) {
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            r1 = 2
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L2a
            java.lang.Class<java.lang.Integer> r3 = java.lang.Integer.class
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.Throwable -> L2a
            java.lang.Class<org.json.JSONObject> r3 = org.json.JSONObject.class
            r5 = 1
            r2[r5] = r3     // Catch: java.lang.Throwable -> L2a
            java.lang.reflect.Constructor r8 = r8.getConstructor(r2)     // Catch: java.lang.Throwable -> L2a
            int r2 = r7.httpResponseCode     // Catch: java.lang.Throwable -> L2a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L2a
            org.json.JSONObject r7 = r7.jsonObject     // Catch: java.lang.Throwable -> L2a
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L2a
            r1[r4] = r2     // Catch: java.lang.Throwable -> L2a
            r1[r5] = r7     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r7 = r8.newInstance(r1)     // Catch: java.lang.Throwable -> L2a
            com.umeng.socialize.net.utils.UResponse r7 = (com.umeng.socialize.net.utils.UResponse) r7     // Catch: java.lang.Throwable -> L2a
            return r7
        L2a:
            r7 = move-exception
            java.lang.String r8 = com.umeng.socialize.utils.UmengText.NET.CREATE
            com.umeng.socialize.utils.SLog.error(r8, r7)
            return r0
    }

    public <T extends com.umeng.socialize.net.utils.UResponse> T execute(com.umeng.socialize.net.utils.URequest r3, java.lang.Class<T> r4) {
            r2 = this;
            r3.onPrepareRequest()
            java.lang.String r0 = r3.getHttpMethod()
            java.lang.String r0 = r0.trim()
            r2.verifyMethod(r0)
            java.lang.String r1 = com.umeng.socialize.net.utils.URequest.GET
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L1b
            com.umeng.socialize.net.utils.UClient$ResponseObj r3 = r2.httpGetRequest(r3)
            goto L29
        L1b:
            java.lang.String r1 = com.umeng.socialize.net.utils.URequest.POST
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L28
            com.umeng.socialize.net.utils.UClient$ResponseObj r3 = r2.httpPostRequest(r3)
            goto L29
        L28:
            r3 = 0
        L29:
            com.umeng.socialize.net.utils.UResponse r3 = r2.createResponse(r3, r4)
            return r3
    }

    protected org.json.JSONObject parseResult(com.umeng.socialize.net.utils.URequest r3, java.lang.String r4, java.lang.String r5, java.io.InputStream r6) {
            r2 = this;
            r0 = 0
            java.io.InputStream r5 = r2.wrapStream(r5, r6)     // Catch: java.lang.Throwable -> L48
            java.lang.String r6 = r2.convertStreamToString(r5)     // Catch: java.lang.Throwable -> L28
            java.lang.String r1 = "POST"
            boolean r1 = r1.equals(r4)     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L2a
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1a
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L1a
            r2.closeQuietly(r5)
            return r4
        L1a:
            r4 = move-exception
            java.lang.String r1 = com.umeng.socialize.utils.UmengText.NET.PARSEERROR     // Catch: java.lang.Throwable -> L28
            com.umeng.socialize.utils.SLog.error(r1, r4)     // Catch: java.lang.Throwable -> L28
            org.json.JSONObject r3 = r2.decryptData(r3, r6)     // Catch: java.lang.Throwable -> L28
            r2.closeQuietly(r5)
            return r3
        L28:
            r3 = move-exception
            goto L4a
        L2a:
            java.lang.String r1 = "GET"
            boolean r4 = r1.equals(r4)     // Catch: java.lang.Throwable -> L28
            if (r4 == 0) goto L44
            boolean r4 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L28
            if (r4 == 0) goto L3c
            r2.closeQuietly(r5)
            return r0
        L3c:
            org.json.JSONObject r3 = r2.decryptData(r3, r6)     // Catch: java.lang.Throwable -> L28
            r2.closeQuietly(r5)
            return r3
        L44:
            r2.closeQuietly(r5)
            goto L50
        L48:
            r3 = move-exception
            r5 = r0
        L4a:
            java.lang.String r4 = com.umeng.socialize.utils.UmengText.NET.PARSEERROR     // Catch: java.lang.Throwable -> L51
            com.umeng.socialize.utils.SLog.error(r4, r3)     // Catch: java.lang.Throwable -> L51
            goto L44
        L50:
            return r0
        L51:
            r3 = move-exception
            r2.closeQuietly(r5)
            throw r3
    }

    protected java.io.InputStream wrapStream(java.lang.String r3, java.io.InputStream r4) throws java.io.IOException {
            r2 = this;
            if (r3 == 0) goto L46
            java.lang.String r0 = "identity"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto Lb
            goto L46
        Lb:
            java.lang.String r0 = "gzip"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L19
            java.util.zip.GZIPInputStream r3 = new java.util.zip.GZIPInputStream
            r3.<init>(r4)
            return r3
        L19:
            java.lang.String r0 = "deflate"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L2f
            java.util.zip.InflaterInputStream r3 = new java.util.zip.InflaterInputStream
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r1 = 0
            r0.<init>(r1)
            r1 = 512(0x200, float:7.17E-43)
            r3.<init>(r4, r0, r1)
            return r3
        L2f:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "unsupported content-encoding: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
        L46:
            return r4
    }
}
