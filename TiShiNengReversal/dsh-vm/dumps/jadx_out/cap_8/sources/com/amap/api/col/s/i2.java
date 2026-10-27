package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class i2 extends com.amap.api.col.s.f1 {
    public org.json.JSONObject m;
    public android.content.Context n;

    public i2() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.m = r0
            r1.n = r0
            return
    }

    @Override // com.amap.api.col.s.dz
    public final java.lang.String h() {
            r1 = this;
            com.amap.api.col.s.e1 r0 = com.amap.api.col.s.e1.a()
            boolean r0 = r0.h()
            if (r0 == 0) goto Ld
            java.lang.String r0 = "https://restsdk.amap.com/sdk/compliance/params"
            return r0
        Ld:
            java.lang.String r0 = "http://restsdk.amap.com/sdk/compliance/params"
            return r0
    }

    @Override // com.amap.api.col.s.dz
    public final java.lang.String m() {
            r1 = this;
            java.lang.String r0 = "core"
            return r0
    }

    @Override // com.amap.api.col.s.dz
    public final java.util.Map<java.lang.String, java.lang.String> o() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.amap.api.col.s.dz
    public final java.util.Map<java.lang.String, java.lang.String> p() {
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
            java.lang.String r2 = "AMAP SDK Android core 4.3.5"
            r0.put(r1, r2)
            android.content.Context r1 = r4.n
            java.lang.String r1 = com.amap.api.col.s.a1.b(r1)
            java.lang.String r2 = "X-INFO"
            r0.put(r2, r1)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "4.3.5"
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "core"
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
    public final byte[] q() {
            r7 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L99
            r0.<init>()     // Catch: java.lang.Throwable -> L99
            org.json.JSONObject r1 = r7.m     // Catch: java.lang.Throwable -> L99
            java.lang.String r2 = "utf-8"
            if (r1 == 0) goto L46
            java.util.Iterator r1 = r1.keys()     // Catch: java.lang.Throwable -> L99
        Lf:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L99
            if (r3 == 0) goto L46
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L99
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L99
            org.json.JSONObject r4 = r7.m     // Catch: java.lang.Throwable -> L99
            java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.Throwable -> L99
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L99
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L99
            r5.<init>()     // Catch: java.lang.Throwable -> L99
            r5.append(r3)     // Catch: java.lang.Throwable -> L99
            java.lang.String r3 = "="
            r5.append(r3)     // Catch: java.lang.Throwable -> L99
            java.lang.String r3 = java.net.URLEncoder.encode(r4, r2)     // Catch: java.lang.Throwable -> L99
            r5.append(r3)     // Catch: java.lang.Throwable -> L99
            java.lang.String r3 = "&"
            r5.append(r3)     // Catch: java.lang.Throwable -> L99
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L99
            r0.append(r3)     // Catch: java.lang.Throwable -> L99
            goto Lf
        L46:
            java.lang.String r1 = "output=json"
            r0.append(r1)     // Catch: java.lang.Throwable -> L99
            android.content.Context r1 = r7.n     // Catch: java.lang.Throwable -> L99
            java.lang.String r1 = com.amap.api.col.s.x0.i(r1)     // Catch: java.lang.Throwable -> L99
            java.lang.String r3 = "&key="
            java.lang.String r4 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L99
            java.lang.String r3 = r3.concat(r4)     // Catch: java.lang.Throwable -> L99
            r0.append(r3)     // Catch: java.lang.Throwable -> L99
            java.lang.String r3 = com.amap.api.col.s.a1.a()     // Catch: java.lang.Throwable -> L99
            java.lang.String r4 = "&ts="
            java.lang.String r5 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L99
            java.lang.String r4 = r4.concat(r5)     // Catch: java.lang.Throwable -> L99
            r0.append(r4)     // Catch: java.lang.Throwable -> L99
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L99
            java.lang.String r5 = "&scode="
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L99
            android.content.Context r5 = r7.n     // Catch: java.lang.Throwable -> L99
            java.lang.String r6 = "key="
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L99
            java.lang.String r1 = r6.concat(r1)     // Catch: java.lang.Throwable -> L99
            java.lang.String r1 = com.amap.api.col.s.a1.c(r5, r3, r1)     // Catch: java.lang.Throwable -> L99
            r4.append(r1)     // Catch: java.lang.Throwable -> L99
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L99
            r0.append(r1)     // Catch: java.lang.Throwable -> L99
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L99
            byte[] r0 = r0.getBytes(r2)     // Catch: java.lang.Throwable -> L99
            return r0
        L99:
            r0 = 0
            return r0
    }
}
