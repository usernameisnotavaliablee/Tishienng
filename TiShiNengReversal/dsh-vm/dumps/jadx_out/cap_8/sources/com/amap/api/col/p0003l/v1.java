package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class v1 {
    private com.amap.api.col.3l.v1.a a;

    /* renamed from: b, reason: collision with root package name */
    private com.amap.api.col.3l.v1.b f4047b;

    /* renamed from: c, reason: collision with root package name */
    private com.amap.api.col.3l.v1.b f4048c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a extends com.amap.api.col.p0003l.u1 {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class b extends com.amap.api.col.p0003l.u1 {
    }

    public v1() {
            r0 = this;
            r0.<init>()
            return
    }

    public final synchronized void a() {
            r2 = this;
            monitor-enter(r2)
            com.amap.api.col.3l.v1$a r0 = r2.a     // Catch: java.lang.Throwable -> Lc
            r1 = 0
            if (r0 == 0) goto Le
            r0.a()     // Catch: java.lang.Throwable -> Lc
            r2.a = r1     // Catch: java.lang.Throwable -> Lc
            goto Le
        Lc:
            r0 = move-exception
            goto L22
        Le:
            com.amap.api.col.3l.v1$b r0 = r2.f4047b     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto L17
            r0.a()     // Catch: java.lang.Throwable -> Lc
            r2.f4047b = r1     // Catch: java.lang.Throwable -> Lc
        L17:
            com.amap.api.col.3l.v1$b r0 = r2.f4048c     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto L20
            r0.a()     // Catch: java.lang.Throwable -> Lc
            r2.f4048c = r1     // Catch: java.lang.Throwable -> Lc
        L20:
            monitor-exit(r2)
            return
        L22:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r0
    }
}
