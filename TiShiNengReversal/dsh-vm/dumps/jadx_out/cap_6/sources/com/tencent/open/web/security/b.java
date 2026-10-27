package com.tencent.open.web.security;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class b extends com.tencent.open.b {
    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.tencent.open.b
    public void a(java.lang.String r6, java.lang.String r7, java.util.List<java.lang.String> r8, com.tencent.open.b.a r9) {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "-->getResult, objectName: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = " | methodName: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "openSDK_LOG.SecureJsBridge"
            com.tencent.open.log.SLog.v(r1, r0)
            int r0 = r8.size()
            r2 = 0
        L23:
            if (r2 >= r0) goto L37
            java.lang.Object r3 = r8.get(r2)     // Catch: java.io.UnsupportedEncodingException -> L34
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.io.UnsupportedEncodingException -> L34
            java.lang.String r4 = "UTF-8"
            java.lang.String r3 = java.net.URLDecoder.decode(r3, r4)     // Catch: java.io.UnsupportedEncodingException -> L34
            r8.set(r2, r3)     // Catch: java.io.UnsupportedEncodingException -> L34
        L34:
            int r2 = r2 + 1
            goto L23
        L37:
            java.util.HashMap<java.lang.String, com.tencent.open.b$b> r0 = r5.a
            java.lang.Object r0 = r0.get(r6)
            com.tencent.open.b$b r0 = (com.tencent.open.b.C0035b) r0
            if (r0 == 0) goto L4a
            java.lang.String r6 = "-->handler != null"
            com.tencent.open.log.SLog.d(r1, r6)
            r0.call(r7, r8, r9)
            goto L63
        L4a:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "-->handler == null objName: "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.tencent.open.log.SLog.e(r1, r6)
            if (r9 == 0) goto L63
            r9.a()
        L63:
            return
    }

    @Override // com.tencent.open.b
    public boolean a(android.webkit.WebView r14, java.lang.String r15) {
            r13 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "-->canHandleUrl---url = "
            r0.append(r1)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "openSDK_LOG.SecureJsBridge"
            com.tencent.open.log.SLog.i(r1, r0)
            r0 = 0
            if (r15 != 0) goto L1a
            return r0
        L1a:
            android.net.Uri r2 = android.net.Uri.parse(r15)
            java.lang.String r2 = r2.getScheme()
            java.lang.String r3 = "jsbridge"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2b
            return r0
        L2b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r15)
            java.lang.String r3 = "/#"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "/"
            java.lang.String[] r2 = r2.split(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            java.util.List r2 = java.util.Arrays.asList(r2)
            r3.<init>(r2)
            int r2 = r3.size()
            r4 = 7
            if (r2 >= r4) goto L53
            return r0
        L53:
            r2 = 2
            java.lang.Object r2 = r3.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r4 = 3
            java.lang.Object r4 = r3.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            r5 = 4
            java.lang.Object r5 = r3.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r6 = 5
            java.lang.Object r6 = r3.get(r6)
            r12 = r6
            java.lang.String r12 = (java.lang.String) r12
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "-->canHandleUrl, objectName: "
            r6.append(r7)
            r6.append(r2)
            java.lang.String r7 = " | methodName: "
            r6.append(r7)
            r6.append(r4)
            java.lang.String r7 = " | snStr: "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            com.tencent.open.log.SLog.i(r1, r6)
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto Lc1
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto Lc1
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 == 0) goto La7
            goto Lc1
        La7:
            long r9 = java.lang.Long.parseLong(r5)     // Catch: java.lang.Exception -> Lc1
            com.tencent.open.web.security.c r7 = new com.tencent.open.web.security.c
            r8 = r14
            r11 = r15
            r7.<init>(r8, r9, r11, r12)
            int r14 = r3.size()
            r15 = 1
            int r14 = r14 - r15
            r0 = 6
            java.util.List r14 = r3.subList(r0, r14)
            r13.a(r2, r4, r14, r7)
            return r15
        Lc1:
            return r0
    }
}
