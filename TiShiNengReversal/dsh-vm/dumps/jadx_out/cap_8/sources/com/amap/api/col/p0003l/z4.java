package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class z4 extends com.amap.api.col.p0003l.l4 {
    public android.content.Context r;

    public z4(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.r = r1
            r1 = 5000(0x1388, float:7.006E-42)
            r0.setConnectionTimeout(r1)
            r0.setSoTimeout(r1)
            return
    }

    @Override // com.amap.api.col.p0003l.Cif
    public java.util.Map<java.lang.String, java.lang.String> getParams() {
            r4 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            android.content.Context r1 = r4.r
            java.lang.String r1 = com.amap.api.col.p0003l.f4.j(r1)
            java.lang.String r2 = "key"
            r0.put(r2, r1)
            java.lang.String r1 = com.amap.api.col.p0003l.h4.a()
            android.content.Context r2 = r4.r
            java.lang.String r3 = com.amap.api.col.p0003l.q4.r(r0)
            java.lang.String r2 = com.amap.api.col.p0003l.h4.c(r2, r1, r3)
            java.lang.String r3 = "ts"
            r0.put(r3, r1)
            java.lang.String r1 = "scode"
            r0.put(r1, r2)
            return r0
    }

    @Override // com.amap.api.col.p0003l.Cif
    public java.util.Map<java.lang.String, java.lang.String> getRequestHead() {
            r4 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "Content-Type"
            java.lang.String r2 = "application/json"
            r0.put(r1, r2)
            java.lang.String r1 = "Accept-Encoding"
            java.lang.String r2 = "gzip"
            r0.put(r1, r2)
            java.lang.String r1 = "User-Agent"
            java.lang.String r2 = "AMAP SDK Android core 4.3.11"
            r0.put(r1, r2)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "4.3.11"
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

    @Override // com.amap.api.col.p0003l.Cif
    public java.lang.String getSDKName() {
            r1 = this;
            java.lang.String r0 = "core"
            return r0
    }

    @Override // com.amap.api.col.p0003l.Cif
    public java.lang.String getURL() {
            r1 = this;
            com.amap.api.col.3l.k4 r0 = com.amap.api.col.p0003l.k4.a()
            boolean r0 = r0.h()
            if (r0 == 0) goto Ld
            java.lang.String r0 = "https://restapi.amap.com/rest/aaid/get"
            return r0
        Ld:
            java.lang.String r0 = "http://restapi.amap.com/rest/aaid/get"
            return r0
    }
}
