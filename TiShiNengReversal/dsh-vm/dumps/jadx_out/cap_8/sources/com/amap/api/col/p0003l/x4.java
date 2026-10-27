package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class x4 extends com.amap.api.col.p0003l.z4 {
    public java.lang.String A;
    protected byte[] B;
    public java.lang.String s;
    public java.lang.String t;
    public java.lang.String u;
    public java.lang.String v;
    public java.lang.String w;
    public java.lang.String x;
    public java.lang.String y;
    public java.lang.String z;

    public x4(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.amap.api.col.p0003l.Cif
    public final byte[] getEntityBytes() {
            r3 = this;
            byte[] r0 = r3.B
            if (r0 == 0) goto L5
            return r0
        L5:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L15e
            r0.<init>()     // Catch: java.lang.Throwable -> L15e
            java.lang.String r1 = "method"
            java.lang.String r2 = "remap"
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L15e
            java.lang.String r1 = "package_name"
            android.content.Context r2 = r3.r     // Catch: java.lang.Throwable -> L15e
            java.lang.String r2 = com.amap.api.col.p0003l.f4.g(r2)     // Catch: java.lang.Throwable -> L15e
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L15e
            java.lang.String r1 = "model"
            java.lang.String r2 = android.os.Build.MODEL     // Catch: java.lang.Throwable -> L15e
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L15e
            java.lang.String r1 = "os_version"
            java.lang.String r2 = android.os.Build.VERSION.RELEASE     // Catch: java.lang.Throwable -> L15e
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L15e
            java.lang.String r1 = "os_type"
            java.lang.String r2 = "Android"
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L15e
            java.lang.String r1 = "sdk_version"
            java.lang.String r2 = "4.3.11"
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L15e
            java.lang.String r1 = com.amap.api.col.p0003l.v4.a()     // Catch: java.lang.Throwable -> L15e
            r3.s = r1     // Catch: java.lang.Throwable -> L15e
            java.lang.String r2 = "t1"
            r0.put(r2, r1)     // Catch: java.lang.Throwable -> L15e
            java.lang.String r1 = "old_t1"
            android.content.Context r2 = r3.r     // Catch: java.lang.Throwable -> L15e
            java.lang.String r2 = com.amap.api.col.p0003l.r4.n(r2)     // Catch: java.lang.Throwable -> L15e
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L15e
            java.lang.String r1 = com.amap.api.col.p0003l.v4.e()     // Catch: java.lang.Throwable -> L15e
            r3.t = r1     // Catch: java.lang.Throwable -> L15e
            java.lang.String r2 = "t2"
            r0.put(r2, r1)     // Catch: java.lang.Throwable -> L15e
            java.lang.String r1 = "old_t2"
            android.content.Context r2 = r3.r     // Catch: java.lang.Throwable -> L15e
            java.lang.String r2 = com.amap.api.col.p0003l.r4.p(r2)     // Catch: java.lang.Throwable -> L15e
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L15e
            java.lang.String r1 = com.amap.api.col.p0003l.v4.h()     // Catch: java.lang.Throwable -> L15e
            r3.u = r1     // Catch: java.lang.Throwable -> L15e
            java.lang.String r2 = "t3"
            r0.put(r2, r1)     // Catch: java.lang.Throwable -> L15e
            java.lang.String r1 = "old_t3"
            android.content.Context r2 = r3.r     // Catch: java.lang.Throwable -> L15e
            java.lang.String r2 = com.amap.api.col.p0003l.r4.r(r2)     // Catch: java.lang.Throwable -> L15e
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L15e
            java.lang.String r1 = com.amap.api.col.p0003l.v4.i()     // Catch: java.lang.Throwable -> L15e
            r3.v = r1     // Catch: java.lang.Throwable -> L15e
            java.lang.String r2 = "s1"
            r0.put(r2, r1)     // Catch: java.lang.Throwable -> L15e
            java.lang.String r1 = "old_s1"
            android.content.Context r2 = r3.r     // Catch: java.lang.Throwable -> L15e
            java.lang.String r2 = com.amap.api.col.p0003l.r4.t(r2)     // Catch: java.lang.Throwable -> L15e
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L15e
            java.lang.String r1 = com.amap.api.col.p0003l.v4.j()     // Catch: java.lang.Throwable -> L15e
            r3.w = r1     // Catch: java.lang.Throwable -> L15e
            java.lang.String r2 = "s2"
            r0.put(r2, r1)     // Catch: java.lang.Throwable -> L15e
            java.lang.String r1 = "old_s2"
            android.content.Context r2 = r3.r     // Catch: java.lang.Throwable -> L15e
            java.lang.String r2 = com.amap.api.col.p0003l.r4.v(r2)     // Catch: java.lang.Throwable -> L15e
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L15e
            java.lang.String r1 = com.amap.api.col.p0003l.v4.k()     // Catch: java.lang.Throwable -> L15e
            r3.x = r1     // Catch: java.lang.Throwable -> L15e
            java.lang.String r2 = "s3"
            r0.put(r2, r1)     // Catch: java.lang.Throwable -> L15e
            java.lang.String r1 = "old_s3"
            android.content.Context r2 = r3.r     // Catch: java.lang.Throwable -> L15e
            java.lang.String r2 = com.amap.api.col.p0003l.r4.x(r2)     // Catch: java.lang.Throwable -> L15e
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L15e
            java.lang.String r1 = com.amap.api.col.p0003l.v4.l()     // Catch: java.lang.Throwable -> L15e
            r3.y = r1     // Catch: java.lang.Throwable -> L15e
            java.lang.String r2 = "s4"
            r0.put(r2, r1)     // Catch: java.lang.Throwable -> L15e
            java.lang.String r1 = "old_s4"
            android.content.Context r2 = r3.r     // Catch: java.lang.Throwable -> L15e
            java.lang.String r2 = com.amap.api.col.p0003l.r4.z(r2)     // Catch: java.lang.Throwable -> L15e
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L15e
            java.lang.String r1 = "uuid"
            android.content.Context r2 = r3.r     // Catch: java.lang.Throwable -> L15e
            java.lang.String r2 = com.amap.api.col.p0003l.v4.b(r2)     // Catch: java.lang.Throwable -> L15e
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L15e
            java.lang.String r1 = "android_id"
            java.lang.String r2 = com.amap.api.col.p0003l.i4.G()     // Catch: java.lang.Throwable -> L15e
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L15e
            java.lang.String r1 = "hostname"
            java.lang.String r2 = com.amap.api.col.p0003l.v4.m()     // Catch: java.lang.Throwable -> L15e
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L15e
            android.content.Context r1 = r3.r     // Catch: java.lang.Throwable -> L15e
            java.lang.String r1 = com.amap.api.col.p0003l.i4.f0(r1)     // Catch: java.lang.Throwable -> L15e
            r3.z = r1     // Catch: java.lang.Throwable -> L15e
            java.lang.String r2 = "gaid"
            r0.put(r2, r1)     // Catch: java.lang.Throwable -> L15e
            java.lang.String r1 = "old_gaid"
            android.content.Context r2 = r3.r     // Catch: java.lang.Throwable -> L15e
            java.lang.String r2 = com.amap.api.col.p0003l.r4.B(r2)     // Catch: java.lang.Throwable -> L15e
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L15e
            android.content.Context r1 = r3.r     // Catch: java.lang.Throwable -> L15e
            java.lang.String r1 = com.amap.api.col.p0003l.i4.D(r1)     // Catch: java.lang.Throwable -> L15e
            r3.A = r1     // Catch: java.lang.Throwable -> L15e
            java.lang.String r2 = "oaid"
            r0.put(r2, r1)     // Catch: java.lang.Throwable -> L15e
            java.lang.String r1 = "old_oaid"
            android.content.Context r2 = r3.r     // Catch: java.lang.Throwable -> L15e
            java.lang.String r2 = com.amap.api.col.p0003l.r4.d(r2)     // Catch: java.lang.Throwable -> L15e
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L15e
            java.lang.String r1 = "aaid"
            android.content.Context r2 = r3.r     // Catch: java.lang.Throwable -> L15e
            java.lang.String r2 = com.amap.api.col.p0003l.r4.f(r2)     // Catch: java.lang.Throwable -> L15e
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L15e
            java.lang.String r1 = "resetToken"
            android.content.Context r2 = r3.r     // Catch: java.lang.Throwable -> L15e
            java.lang.String r2 = com.amap.api.col.p0003l.r4.l(r2)     // Catch: java.lang.Throwable -> L15e
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L15e
            java.lang.String r1 = "uabc"
            android.content.Context r2 = r3.r     // Catch: java.lang.Throwable -> L15e
            java.lang.String r2 = com.amap.api.col.p0003l.r4.j(r2)     // Catch: java.lang.Throwable -> L15e
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L15e
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L15e
            java.lang.String r1 = "utf-8"
            byte[] r0 = r0.getBytes(r1)     // Catch: java.lang.Throwable -> L15e
            byte[] r0 = com.amap.api.col.p0003l.q4.z(r0)     // Catch: java.lang.Throwable -> L15e
            java.lang.String r1 = "YWDR1a2R2WEd0M3RXdHRocg=="
            java.lang.String r1 = com.amap.api.col.p0003l.q4.u(r1)     // Catch: java.lang.Throwable -> L15e
            byte[] r1 = r1.getBytes()     // Catch: java.lang.Throwable -> L15e
            byte[] r0 = com.amap.api.col.p0003l.v4.d(r0, r1)     // Catch: java.lang.Throwable -> L15e
            r3.B = r0     // Catch: java.lang.Throwable -> L15e
        L15e:
            byte[] r0 = r3.B
            return r0
    }
}
