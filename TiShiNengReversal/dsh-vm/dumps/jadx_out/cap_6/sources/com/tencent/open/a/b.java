package com.tencent.open.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class b implements com.tencent.open.a.a {
    private int a;
    private int b;
    private final java.lang.String c;

    public b(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            r0 = 15000(0x3a98, float:2.102E-41)
            r1.a = r0
            r0 = 30000(0x7530, float:4.2039E-41)
            r1.b = r0
            r1.c = r2
            return
    }

    private com.tencent.open.a.g a(java.lang.String r12, int r13) throws java.io.IOException {
            r11 = this;
            r1 = 0
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Throwable -> L9f
            r0.<init>(r12)     // Catch: java.lang.Throwable -> L9f
            java.net.URLConnection r12 = r0.openConnection()     // Catch: java.lang.Throwable -> L9f
            r3 = r12
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch: java.lang.Throwable -> L9f
            java.lang.String r12 = "GET"
            r3.setRequestMethod(r12)     // Catch: java.lang.Throwable -> L68
            r11.a(r3)     // Catch: java.lang.Throwable -> L68
            r12 = 1
            r3.setDoInput(r12)     // Catch: java.lang.Throwable -> L68
            r12 = 0
            r3.setDoOutput(r12)     // Catch: java.lang.Throwable -> L68
            r3.setUseCaches(r12)     // Catch: java.lang.Throwable -> L68
            r3.connect()     // Catch: java.lang.Throwable -> L68
            int r0 = r3.getResponseCode()     // Catch: java.lang.Throwable -> L68
            r2 = 200(0xc8, float:2.8E-43)
            if (r0 != r2) goto L6c
            java.io.InputStream r9 = r3.getInputStream()     // Catch: java.lang.Throwable -> L68
            java.io.ByteArrayOutputStream r10 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L65
            r10.<init>()     // Catch: java.lang.Throwable -> L65
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L43
        L38:
            int r1 = r9.read(r0)     // Catch: java.lang.Throwable -> L43
            r2 = -1
            if (r1 == r2) goto L47
            r10.write(r0, r12, r1)     // Catch: java.lang.Throwable -> L43
            goto L38
        L43:
            r0 = move-exception
            r12 = r0
            r1 = r10
            goto La3
        L47:
            java.lang.String r4 = r10.toString()     // Catch: java.lang.Throwable -> L43
            com.tencent.open.a.c r2 = new com.tencent.open.a.c     // Catch: java.lang.Throwable -> L43
            int r5 = r3.getContentLength()     // Catch: java.lang.Throwable -> L43
            int r7 = r3.getResponseCode()     // Catch: java.lang.Throwable -> L43
            java.lang.String r8 = ""
            r6 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L43
            a(r10)
            a(r9)
        L61:
            b(r3)
            return r2
        L65:
            r0 = move-exception
            r12 = r0
            goto La3
        L68:
            r0 = move-exception
            r12 = r0
            r9 = r1
            goto La3
        L6c:
            r6 = r13
            java.lang.String r12 = r3.getResponseMessage()     // Catch: java.lang.Throwable -> L68
            if (r12 != 0) goto L88
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L68
            r12.<init>()     // Catch: java.lang.Throwable -> L68
            java.lang.String r13 = "请求失败 code:"
            r12.append(r13)     // Catch: java.lang.Throwable -> L68
            int r13 = r3.getResponseCode()     // Catch: java.lang.Throwable -> L68
            r12.append(r13)     // Catch: java.lang.Throwable -> L68
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L68
        L88:
            r8 = r12
            com.tencent.open.a.c r2 = new com.tencent.open.a.c     // Catch: java.lang.Throwable -> L68
            java.lang.String r4 = ""
            int r5 = r3.getContentLength()     // Catch: java.lang.Throwable -> L68
            int r7 = r3.getResponseCode()     // Catch: java.lang.Throwable -> L68
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L68
            a(r1)
            a(r1)
            goto L61
        L9f:
            r0 = move-exception
            r12 = r0
            r3 = r1
            r9 = r3
        La3:
            a(r1)
            a(r9)
            b(r3)
            throw r12
    }

    private com.tencent.open.a.g a(java.lang.String r11, int r12, java.lang.String r13) throws java.io.IOException {
            r10 = this;
            r1 = 0
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Throwable -> Lb4
            r0.<init>(r11)     // Catch: java.lang.Throwable -> Lb4
            java.net.URLConnection r11 = r0.openConnection()     // Catch: java.lang.Throwable -> Lb4
            r3 = r11
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r11 = "POST"
            r3.setRequestMethod(r11)     // Catch: java.lang.Throwable -> L80
            r10.a(r3)     // Catch: java.lang.Throwable -> L80
            r11 = 1
            r3.setDoInput(r11)     // Catch: java.lang.Throwable -> L80
            r3.setDoOutput(r11)     // Catch: java.lang.Throwable -> L80
            r11 = 0
            r3.setUseCaches(r11)     // Catch: java.lang.Throwable -> L80
            java.lang.String r0 = "Content-Type"
            java.lang.String r2 = "application/x-www-form-urlencoded"
            r3.setRequestProperty(r0, r2)     // Catch: java.lang.Throwable -> L80
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> L80
            java.io.OutputStream r2 = r3.getOutputStream()     // Catch: java.lang.Throwable -> L80
            java.lang.String r4 = "UTF-8"
            r0.<init>(r2, r4)     // Catch: java.lang.Throwable -> L80
            r0.write(r13)     // Catch: java.lang.Throwable -> L80
            r0.flush()     // Catch: java.lang.Throwable -> L80
            r3.connect()     // Catch: java.lang.Throwable -> L80
            int r5 = r3.getContentLength()     // Catch: java.lang.Throwable -> L80
            int r13 = r3.getResponseCode()     // Catch: java.lang.Throwable -> L80
            r0 = 200(0xc8, float:2.8E-43)
            if (r13 != r0) goto L84
            java.io.InputStream r13 = r3.getInputStream()     // Catch: java.lang.Throwable -> L80
            java.io.ByteArrayOutputStream r9 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L7d
            r9.<init>()     // Catch: java.lang.Throwable -> L7d
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L5f
        L54:
            int r1 = r13.read(r0)     // Catch: java.lang.Throwable -> L5f
            r2 = -1
            if (r1 == r2) goto L63
            r9.write(r0, r11, r1)     // Catch: java.lang.Throwable -> L5f
            goto L54
        L5f:
            r0 = move-exception
            r11 = r0
            r1 = r9
            goto Lb8
        L63:
            java.lang.String r4 = r9.toString()     // Catch: java.lang.Throwable -> L5f
            com.tencent.open.a.c r2 = new com.tencent.open.a.c     // Catch: java.lang.Throwable -> L5f
            int r7 = r3.getResponseCode()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r8 = ""
            r6 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L5f
            a(r9)
            a(r13)
        L79:
            b(r3)
            return r2
        L7d:
            r0 = move-exception
            r11 = r0
            goto Lb8
        L80:
            r0 = move-exception
            r11 = r0
            r13 = r1
            goto Lb8
        L84:
            r6 = r12
            java.lang.String r11 = r3.getResponseMessage()     // Catch: java.lang.Throwable -> L80
            if (r11 != 0) goto La0
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L80
            r11.<init>()     // Catch: java.lang.Throwable -> L80
            java.lang.String r12 = "Unknown fail: "
            r11.append(r12)     // Catch: java.lang.Throwable -> L80
            int r12 = r3.getResponseCode()     // Catch: java.lang.Throwable -> L80
            r11.append(r12)     // Catch: java.lang.Throwable -> L80
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L80
        La0:
            r8 = r11
            com.tencent.open.a.c r2 = new com.tencent.open.a.c     // Catch: java.lang.Throwable -> L80
            java.lang.String r4 = ""
            int r7 = r3.getResponseCode()     // Catch: java.lang.Throwable -> L80
            r5 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L80
            a(r1)
            a(r1)
            goto L79
        Lb4:
            r0 = move-exception
            r11 = r0
            r13 = r1
            r3 = r13
        Lb8:
            a(r1)
            a(r13)
            b(r3)
            throw r11
    }

    private static void a(java.io.Closeable r0) {
            if (r0 == 0) goto L5
            r0.close()     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    private void a(java.net.HttpURLConnection r3) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            java.lang.String r0 = "User-Agent"
            java.lang.String r1 = r2.c
            r3.setRequestProperty(r0, r1)
            int r0 = r2.a
            r3.setConnectTimeout(r0)
            int r0 = r2.b
            r3.setReadTimeout(r0)
            java.lang.String r0 = "Accept-Language"
            java.lang.String r1 = "zh-CN"
            r3.setRequestProperty(r0, r1)
            java.lang.String r0 = "Connection"
            java.lang.String r1 = "Keep-Alive"
            r3.setRequestProperty(r0, r1)
            java.lang.String r0 = "Charset"
            java.lang.String r1 = "UTF-8"
            r3.setRequestProperty(r0, r1)
            return
    }

    private static void b(java.net.HttpURLConnection r0) {
            if (r0 != 0) goto L3
            return
        L3:
            r0.disconnect()     // Catch: java.lang.Exception -> L6
        L6:
            return
    }

    @Override // com.tencent.open.a.a
    public com.tencent.open.a.g a(java.lang.String r4, java.lang.String r5) throws java.io.IOException {
            r3 = this;
            java.lang.String r0 = "DefaultHttpServiceImpl"
            java.lang.String r1 = "get. "
            com.tencent.open.log.SLog.i(r0, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L4e
            java.lang.String r0 = "?"
            int r1 = r5.indexOf(r0)
            r2 = -1
            if (r1 != r2) goto L26
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            r1.append(r0)
            java.lang.String r4 = r1.toString()
            goto L3f
        L26:
            int r0 = r4.length()
            int r0 = r0 + (-1)
            if (r1 == r0) goto L3f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r4 = "&"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
        L3f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = r0.toString()
        L4e:
            int r5 = r5.length()
            com.tencent.open.a.g r4 = r3.a(r4, r5)
            return r4
    }

    @Override // com.tencent.open.a.a
    public com.tencent.open.a.g a(java.lang.String r6, java.util.Map<java.lang.String, java.lang.String> r7) throws java.io.IOException {
            r5 = this;
            java.lang.String r0 = "DefaultHttpServiceImpl"
            java.lang.String r1 = "post. "
            com.tencent.open.log.SLog.i(r0, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
            r1 = 1
        L15:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L4c
            java.lang.Object r2 = r7.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            if (r1 == 0) goto L25
            r1 = 0
            goto L2a
        L25:
            r3 = 38
            r0.append(r3)
        L2a:
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "UTF-8"
            java.lang.String r3 = java.net.URLEncoder.encode(r3, r4)
            r0.append(r3)
            r3 = 61
            r0.append(r3)
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = java.net.URLEncoder.encode(r2, r4)
            r0.append(r2)
            goto L15
        L4c:
            java.lang.String r7 = r0.toString()
            int r0 = r7.length()
            com.tencent.open.a.g r6 = r5.a(r6, r0, r7)
            return r6
    }

    public com.tencent.open.a.g a(java.lang.String r20, java.util.Map<java.lang.String, java.lang.String> r21, java.lang.String r22, byte[] r23) throws java.io.IOException {
            r19 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            java.lang.String r3 = ""
            java.lang.String r4 = "UTF-8"
            java.lang.String r5 = "文件上传"
            java.lang.String r6 = "DefaultHttpServiceImpl"
            com.tencent.open.log.SLog.i(r6, r5)
            java.util.UUID r5 = java.util.UUID.randomUUID()
            java.lang.String r5 = r5.toString()
            java.lang.String r7 = "multipart/form-data"
            java.net.URL r9 = new java.net.URL     // Catch: java.lang.Throwable -> L206
            r10 = r20
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L206
            java.net.URLConnection r9 = r9.openConnection()     // Catch: java.lang.Throwable -> L206
            r11 = r9
            java.net.HttpURLConnection r11 = (java.net.HttpURLConnection) r11     // Catch: java.lang.Throwable -> L206
            r9 = 1
            r11.setDoInput(r9)     // Catch: java.lang.Throwable -> L202
            r11.setDoOutput(r9)     // Catch: java.lang.Throwable -> L202
            java.lang.String r9 = "POST"
            r11.setRequestMethod(r9)     // Catch: java.lang.Throwable -> L202
            r9 = 0
            r11.setUseCaches(r9)     // Catch: java.lang.Throwable -> L202
            r11.setInstanceFollowRedirects(r9)     // Catch: java.lang.Throwable -> L202
            java.lang.String r10 = "Content-Type"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L202
            r12.<init>()     // Catch: java.lang.Throwable -> L202
            r12.append(r7)     // Catch: java.lang.Throwable -> L202
            java.lang.String r7 = ";boundary="
            r12.append(r7)     // Catch: java.lang.Throwable -> L202
            r12.append(r5)     // Catch: java.lang.Throwable -> L202
            java.lang.String r7 = r12.toString()     // Catch: java.lang.Throwable -> L202
            r11.setRequestProperty(r10, r7)     // Catch: java.lang.Throwable -> L202
            r7 = r19
            r7.a(r11)     // Catch: java.lang.Throwable -> L1fd
            r11.connect()     // Catch: java.lang.Throwable -> L1fd
            java.io.DataOutputStream r10 = new java.io.DataOutputStream     // Catch: java.lang.Throwable -> L1fd
            java.io.OutputStream r12 = r11.getOutputStream()     // Catch: java.lang.Throwable -> L1fd
            r10.<init>(r12)     // Catch: java.lang.Throwable -> L1fd
            java.lang.String r12 = "\""
            java.lang.String r13 = "Content-Disposition: form-data; name=\""
            java.lang.String r14 = "--"
            java.lang.String r15 = "\r\n"
            if (r0 == 0) goto Lf1
            int r16 = r0.size()     // Catch: java.lang.Throwable -> Lea
            if (r16 <= 0) goto Lf1
            java.util.Set r16 = r0.keySet()     // Catch: java.lang.Throwable -> Lea
            java.util.Iterator r16 = r16.iterator()     // Catch: java.lang.Throwable -> Lea
        L7e:
            boolean r17 = r16.hasNext()     // Catch: java.lang.Throwable -> Lea
            if (r17 == 0) goto Lf1
            java.lang.StringBuffer r8 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> Lea
            r8.<init>()     // Catch: java.lang.Throwable -> Lea
            java.lang.Object r18 = r16.next()     // Catch: java.lang.Throwable -> Lea
            r9 = r18
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> Lea
            java.lang.String r9 = java.net.URLEncoder.encode(r9, r4)     // Catch: java.lang.Throwable -> Lea
            java.lang.Object r18 = r0.get(r9)     // Catch: java.lang.Throwable -> Lea
            r0 = r18
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> Lea
            java.lang.String r0 = java.net.URLEncoder.encode(r0, r4)     // Catch: java.lang.Throwable -> Lea
            r8.append(r14)     // Catch: java.lang.Throwable -> Lea
            r8.append(r5)     // Catch: java.lang.Throwable -> Lea
            r8.append(r15)     // Catch: java.lang.Throwable -> Lea
            r8.append(r13)     // Catch: java.lang.Throwable -> Lea
            r8.append(r9)     // Catch: java.lang.Throwable -> Lea
            r8.append(r12)     // Catch: java.lang.Throwable -> Lea
            r8.append(r15)     // Catch: java.lang.Throwable -> Lea
            r8.append(r15)     // Catch: java.lang.Throwable -> Lea
            r8.append(r0)     // Catch: java.lang.Throwable -> Lea
            r8.append(r15)     // Catch: java.lang.Throwable -> Lea
            java.lang.String r0 = r8.toString()     // Catch: java.lang.Throwable -> Lea
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lea
            r8.<init>()     // Catch: java.lang.Throwable -> Lea
            r8.append(r9)     // Catch: java.lang.Throwable -> Lea
            java.lang.String r9 = "="
            r8.append(r9)     // Catch: java.lang.Throwable -> Lea
            r8.append(r0)     // Catch: java.lang.Throwable -> Lea
            java.lang.String r9 = "##"
            r8.append(r9)     // Catch: java.lang.Throwable -> Lea
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> Lea
            com.tencent.open.log.SLog.i(r6, r8)     // Catch: java.lang.Throwable -> Lea
            byte[] r0 = r0.getBytes()     // Catch: java.lang.Throwable -> Lea
            r10.write(r0)     // Catch: java.lang.Throwable -> Lea
            r0 = r21
            r9 = 0
            goto L7e
        Lea:
            r0 = move-exception
            r8 = r10
        Lec:
            r2 = 0
        Led:
            r17 = 0
            goto L20e
        Lf1:
            if (r2 == 0) goto L174
            int r0 = r2.length     // Catch: java.lang.Throwable -> Lea
            if (r0 <= 0) goto L174
            java.lang.StringBuffer r0 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> Lea
            r0.<init>()     // Catch: java.lang.Throwable -> Lea
            r0.append(r14)     // Catch: java.lang.Throwable -> Lea
            r0.append(r5)     // Catch: java.lang.Throwable -> Lea
            r0.append(r15)     // Catch: java.lang.Throwable -> Lea
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lea
            r4.<init>()     // Catch: java.lang.Throwable -> Lea
            r4.append(r13)     // Catch: java.lang.Throwable -> Lea
            r4.append(r1)     // Catch: java.lang.Throwable -> Lea
            java.lang.String r8 = "\"; filename=\""
            r4.append(r8)     // Catch: java.lang.Throwable -> Lea
            r4.append(r1)     // Catch: java.lang.Throwable -> Lea
            r4.append(r12)     // Catch: java.lang.Throwable -> Lea
            r4.append(r15)     // Catch: java.lang.Throwable -> Lea
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> Lea
            r0.append(r1)     // Catch: java.lang.Throwable -> Lea
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lea
            r1.<init>()     // Catch: java.lang.Throwable -> Lea
            java.lang.String r4 = "Content-Type: application/octet-stream; charset=UTF-8"
            r1.append(r4)     // Catch: java.lang.Throwable -> Lea
            r1.append(r15)     // Catch: java.lang.Throwable -> Lea
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lea
            r0.append(r1)     // Catch: java.lang.Throwable -> Lea
            r0.append(r15)     // Catch: java.lang.Throwable -> Lea
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lea
            byte[] r0 = r0.getBytes()     // Catch: java.lang.Throwable -> Lea
            r10.write(r0)     // Catch: java.lang.Throwable -> Lea
            int r0 = r2.length     // Catch: java.lang.Throwable -> Lea
            r1 = 0
            r10.write(r2, r1, r0)     // Catch: java.lang.Throwable -> Lea
            byte[] r0 = r15.getBytes()     // Catch: java.lang.Throwable -> Lea
            r10.write(r0)     // Catch: java.lang.Throwable -> Lea
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lea
            r0.<init>()     // Catch: java.lang.Throwable -> Lea
            r0.append(r14)     // Catch: java.lang.Throwable -> Lea
            r0.append(r5)     // Catch: java.lang.Throwable -> Lea
            r0.append(r14)     // Catch: java.lang.Throwable -> Lea
            r0.append(r15)     // Catch: java.lang.Throwable -> Lea
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lea
            byte[] r0 = r0.getBytes()     // Catch: java.lang.Throwable -> Lea
            r10.write(r0)     // Catch: java.lang.Throwable -> Lea
            int r1 = r0.length     // Catch: java.lang.Throwable -> Lea
            r10.flush()     // Catch: java.lang.Throwable -> Lea
            r14 = r1
            goto L175
        L174:
            r14 = 0
        L175:
            int r0 = r11.getResponseCode()     // Catch: java.lang.Throwable -> L1f8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1f8
            r1.<init>()     // Catch: java.lang.Throwable -> L1f8
            r1.append(r0)     // Catch: java.lang.Throwable -> L1f8
            r1.append(r3)     // Catch: java.lang.Throwable -> L1f8
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1f8
            com.tencent.open.log.SLog.i(r6, r1)     // Catch: java.lang.Throwable -> L1f8
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 != r1) goto L1be
            java.io.InputStream r1 = r11.getInputStream()     // Catch: java.lang.Throwable -> Lea
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L1b8
            r2.<init>()     // Catch: java.lang.Throwable -> L1b8
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L1a8
        L19c:
            int r3 = r1.read(r0)     // Catch: java.lang.Throwable -> L1a8
            r4 = -1
            if (r3 == r4) goto L1ae
            r4 = 0
            r2.write(r0, r4, r3)     // Catch: java.lang.Throwable -> L1a8
            goto L19c
        L1a8:
            r0 = move-exception
            r17 = r1
            r8 = r10
            goto L20e
        L1ae:
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L1a8
            r8 = r1
            r17 = r2
        L1b5:
            r12 = r0
            r1 = r10
            goto L1d5
        L1b8:
            r0 = move-exception
            r17 = r1
            r8 = r10
            r2 = 0
            goto L20e
        L1be:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1f8
            r0.<init>()     // Catch: java.lang.Throwable -> L1f8
            int r1 = r11.getResponseCode()     // Catch: java.lang.Throwable -> L1f8
            r0.append(r1)     // Catch: java.lang.Throwable -> L1f8
            r0.append(r3)     // Catch: java.lang.Throwable -> L1f8
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L1f8
            r8 = 0
            r17 = 0
            goto L1b5
        L1d5:
            com.tencent.open.a.c r10 = new com.tencent.open.a.c     // Catch: java.lang.Throwable -> L1f1
            int r13 = r11.getContentLength()     // Catch: java.lang.Throwable -> L1f1
            int r15 = r11.getResponseCode()     // Catch: java.lang.Throwable -> L1f1
            java.lang.String r16 = ""
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L1f1
            a(r1)
            a(r8)
            a(r17)
            b(r11)
            return r10
        L1f1:
            r0 = move-exception
            r2 = r17
            r17 = r8
            r8 = r1
            goto L20e
        L1f8:
            r0 = move-exception
            r1 = r10
            r8 = r1
            goto Lec
        L1fd:
            r0 = move-exception
        L1fe:
            r2 = 0
            r8 = 0
            goto Led
        L202:
            r0 = move-exception
            r7 = r19
            goto L1fe
        L206:
            r0 = move-exception
            r7 = r19
            r2 = 0
            r8 = 0
            r11 = 0
            goto Led
        L20e:
            a(r8)
            a(r17)
            a(r2)
            b(r11)
            throw r0
    }

    @Override // com.tencent.open.a.a
    public com.tencent.open.a.g a(java.lang.String r2, java.util.Map<java.lang.String, java.lang.String> r3, java.util.Map<java.lang.String, byte[]> r4) throws java.io.IOException {
            r1 = this;
            if (r4 == 0) goto L30
            int r0 = r4.size()
            if (r0 > 0) goto L9
            goto L30
        L9:
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L2e
            java.lang.Object r4 = r4.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r0 = r4.getKey()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r4 = r4.getValue()
            byte[] r4 = (byte[]) r4
            com.tencent.open.a.g r2 = r1.a(r2, r3, r0, r4)
            return r2
        L2e:
            r2 = 0
            return r2
        L30:
            com.tencent.open.a.g r2 = r1.a(r2, r3)
            return r2
    }

    @Override // com.tencent.open.a.a
    public void a(long r4, long r6) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L11
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 > 0) goto Lb
            goto L11
        Lb:
            int r5 = (int) r4
            r3.a = r5
            int r4 = (int) r6
            r3.b = r4
        L11:
            return
    }
}
