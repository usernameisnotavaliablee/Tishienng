package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class b4<T, V> extends com.amap.api.col.s.a3<T, V> {
    public b4(android.content.Context r1, T r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private static java.lang.String S(java.lang.String r7) {
            java.lang.String r0 = "&"
            java.lang.String[] r1 = r7.split(r0)
            java.util.Arrays.sort(r1)
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            int r3 = r1.length
            r4 = 0
            r5 = 0
        L11:
            if (r5 >= r3) goto L22
            r6 = r1[r5]
            java.lang.String r6 = T(r6)
            r2.append(r6)
            r2.append(r0)
            int r5 = r5 + 1
            goto L11
        L22:
            java.lang.String r0 = r2.toString()
            int r1 = r0.length()
            r2 = 1
            if (r1 <= r2) goto L38
            int r7 = r0.length()
            int r7 = r7 - r2
            java.lang.CharSequence r7 = r0.subSequence(r4, r7)
            java.lang.String r7 = (java.lang.String) r7
        L38:
            return r7
    }

    private static java.lang.String T(java.lang.String r2) {
            java.lang.String r0 = "ProtocalHandler"
            if (r2 != 0) goto L5
            return r2
        L5:
            java.lang.String r1 = "utf-8"
            java.lang.String r2 = java.net.URLDecoder.decode(r2, r1)     // Catch: java.lang.Exception -> Lc java.io.UnsupportedEncodingException -> Le
            return r2
        Lc:
            r2 = move-exception
            goto L10
        Le:
            r2 = move-exception
            goto L16
        L10:
            java.lang.String r1 = "strReEncoderException"
            com.amap.api.col.s.j4.i(r2, r0, r1)
            goto L1b
        L16:
            java.lang.String r1 = "strReEncoder"
            com.amap.api.col.s.j4.i(r2, r0, r1)
        L1b:
            java.lang.String r2 = ""
            return r2
    }

    protected static java.lang.String i(java.lang.String r2) {
            java.lang.String r0 = "ProtocalHandler"
            if (r2 != 0) goto L5
            return r2
        L5:
            java.lang.String r1 = "utf-8"
            java.lang.String r2 = java.net.URLEncoder.encode(r2, r1)     // Catch: java.lang.Exception -> Lc java.io.UnsupportedEncodingException -> Le
            return r2
        Lc:
            r2 = move-exception
            goto L10
        Le:
            r2 = move-exception
            goto L16
        L10:
            java.lang.String r1 = "strEncoderException"
            com.amap.api.col.s.j4.i(r2, r0, r1)
            goto L1b
        L16:
            java.lang.String r1 = "strEncoderUnsupportedEncodingException"
            com.amap.api.col.s.j4.i(r2, r0, r1)
        L1b:
            java.lang.String r2 = ""
            return r2
    }

    @Override // com.amap.api.col.s.a3
    protected abstract V I(java.lang.String r1) throws com.amap.api.services.core.AMapException;

    @Override // com.amap.api.col.s.a3
    protected abstract java.lang.String M();

    @Override // com.amap.api.col.s.a3, com.amap.api.col.s.dz
    public java.util.Map<java.lang.String, java.lang.String> o() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.amap.api.col.s.a3, com.amap.api.col.s.dz
    public java.util.Map<java.lang.String, java.lang.String> p() {
            r4 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "Content-Type"
            java.lang.String r2 = "application/x-www-form-urlencoded"
            r0.put(r1, r2)
            java.lang.String r1 = "Accept-Encoding"
            java.lang.String r2 = "gzip"
            r0.put(r1, r2)
            java.lang.String r1 = "User-Agent"
            java.lang.String r2 = "AMAP SDK Android Search 9.7.0"
            r0.put(r1, r2)
            android.content.Context r1 = r4.q
            java.lang.String r1 = com.amap.api.col.s.a1.b(r1)
            java.lang.String r2 = "X-INFO"
            r0.put(r2, r1)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "9.7.0"
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "sea"
            r3 = 1
            r1[r3] = r2
            java.lang.String r2 = "platform=Android&sdkversion=%s&product=%s"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            java.lang.String r2 = "platinfo"
            r0.put(r2, r1)
            java.lang.String r1 = "logversion"
            java.lang.String r2 = "2.1"
            r0.put(r1, r2)
            return r0
    }

    @Override // com.amap.api.col.s.dz
    public byte[] q() {
            r5 = this;
            java.lang.String r0 = r5.M()     // Catch: java.lang.Throwable -> L14
            java.lang.StringBuffer r1 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L14
            r1.<init>()     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L16
            r1.append(r0)     // Catch: java.lang.Throwable -> L14
            java.lang.String r0 = "&"
            r1.append(r0)     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            r0 = move-exception
            goto L69
        L16:
            java.lang.String r0 = "language="
            r1.append(r0)     // Catch: java.lang.Throwable -> L14
            com.amap.api.services.core.ServiceSettings r0 = com.amap.api.services.core.ServiceSettings.getInstance()     // Catch: java.lang.Throwable -> L14
            java.lang.String r0 = r0.getLanguage()     // Catch: java.lang.Throwable -> L14
            r1.append(r0)     // Catch: java.lang.Throwable -> L14
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = S(r0)     // Catch: java.lang.Throwable -> L14
            java.lang.StringBuffer r2 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L14
            r2.<init>()     // Catch: java.lang.Throwable -> L14
            r2.append(r0)     // Catch: java.lang.Throwable -> L14
            java.lang.String r0 = com.amap.api.col.s.a1.a()     // Catch: java.lang.Throwable -> L14
            java.lang.String r3 = "&ts="
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L14
            java.lang.String r3 = r3.concat(r4)     // Catch: java.lang.Throwable -> L14
            r2.append(r3)     // Catch: java.lang.Throwable -> L14
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L14
            java.lang.String r4 = "&scode="
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L14
            android.content.Context r4 = r5.q     // Catch: java.lang.Throwable -> L14
            java.lang.String r0 = com.amap.api.col.s.a1.c(r4, r0, r1)     // Catch: java.lang.Throwable -> L14
            r3.append(r0)     // Catch: java.lang.Throwable -> L14
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L14
            r2.append(r0)     // Catch: java.lang.Throwable -> L14
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = "utf-8"
            byte[] r0 = r0.getBytes(r1)     // Catch: java.lang.Throwable -> L14
            return r0
        L69:
            java.lang.String r1 = "ProtocalHandler"
            java.lang.String r2 = "getEntity"
            com.amap.api.col.s.j4.i(r0, r1, r2)
            r0 = 0
            return r0
    }
}
