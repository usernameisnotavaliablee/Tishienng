package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class e3 {
    private android.content.Context a;

    /* renamed from: b, reason: collision with root package name */
    private com.amap.api.col.s.i1 f4446b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f4447c;

    public e3() {
            r1 = this;
            r1.<init>()
            return
    }

    private static java.lang.String a(android.content.Context r2, com.amap.api.col.s.i1 r3, java.lang.String r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "\"sdkversion\":\""
            r0.append(r1)     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = r3.f()     // Catch: java.lang.Throwable -> L31
            r0.append(r1)     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = "\",\"product\":\""
            r0.append(r1)     // Catch: java.lang.Throwable -> L31
            java.lang.String r3 = r3.d()     // Catch: java.lang.Throwable -> L31
            r0.append(r3)     // Catch: java.lang.Throwable -> L31
            java.lang.String r3 = "\",\"nt\":\""
            r0.append(r3)     // Catch: java.lang.Throwable -> L31
            int r2 = com.amap.api.col.s.c1.r(r2)     // Catch: java.lang.Throwable -> L31
            r0.append(r2)     // Catch: java.lang.Throwable -> L31
            java.lang.String r2 = "\",\"details\":"
            r0.append(r2)     // Catch: java.lang.Throwable -> L31
            r0.append(r4)     // Catch: java.lang.Throwable -> L31
        L31:
            java.lang.String r2 = r0.toString()
            return r2
    }

    final byte[] b() {
            r3 = this;
            android.content.Context r0 = r3.a
            com.amap.api.col.s.i1 r1 = r3.f4446b
            java.lang.String r2 = r3.f4447c
            java.lang.String r0 = a(r0, r1, r2)
            byte[] r0 = com.amap.api.col.s.j1.o(r0)
            return r0
    }
}
