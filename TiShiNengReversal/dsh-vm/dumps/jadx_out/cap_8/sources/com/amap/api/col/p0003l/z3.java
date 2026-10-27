package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class z3<T, V> extends com.amap.api.col.p0003l.y3<T, V> {
    public z3(android.content.Context r1, T r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // com.amap.api.col.p0003l.y3
    protected abstract V g(java.lang.String r1) throws com.amap.api.col.p0003l.fc;

    @Override // com.amap.api.col.p0003l.Cif
    public byte[] getEntityBytes() {
            r2 = this;
            java.lang.String r0 = r2.l()     // Catch: java.lang.Throwable -> Lb
            java.lang.String r1 = "utf-8"
            byte[] r0 = r0.getBytes(r1)     // Catch: java.lang.Throwable -> Lb
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @Override // com.amap.api.col.p0003l.g2, com.amap.api.col.p0003l.Cif
    public java.util.Map<java.lang.String, java.lang.String> getParams() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.amap.api.col.p0003l.y3, com.amap.api.col.p0003l.Cif
    public java.util.Map<java.lang.String, java.lang.String> getRequestHead() {
            r5 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r1 = 16
            r0.<init>(r1)
            java.lang.String r1 = "Content-Type"
            java.lang.String r2 = " application/json"
            r0.put(r1, r2)
            java.lang.String r1 = "Accept-Encoding"
            java.lang.String r2 = "gzip"
            r0.put(r1, r2)
            java.lang.String r1 = "User-Agent"
            java.lang.String r2 = "AMAP SDK Android Trace 10.0.600"
            r0.put(r1, r2)
            android.content.Context r1 = r5.t
            java.lang.String r1 = com.amap.api.col.p0003l.h4.i(r1)
            java.lang.String r2 = "x-INFO"
            r0.put(r2, r1)
            java.util.Locale r1 = java.util.Locale.US
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "10.0.600"
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "trace"
            r4 = 1
            r2[r4] = r3
            java.lang.String r3 = "platform=Android&sdkversion=%s&product=%s"
            java.lang.String r1 = java.lang.String.format(r1, r3, r2)
            java.lang.String r2 = "platinfo"
            r0.put(r2, r1)
            java.lang.String r1 = "logversion"
            java.lang.String r2 = "2.1"
            r0.put(r1, r2)
            return r0
    }

    @Override // com.amap.api.col.p0003l.y3
    protected abstract java.lang.String l();
}
