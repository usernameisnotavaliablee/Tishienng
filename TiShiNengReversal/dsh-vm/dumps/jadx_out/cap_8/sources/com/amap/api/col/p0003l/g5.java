package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class g5 {

    /* renamed from: c, reason: collision with root package name */
    private static com.amap.api.col.p0003l.g5 f3409c;
    private final android.content.Context a;

    /* renamed from: b, reason: collision with root package name */
    private final java.lang.String f3410b;

    private g5(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            r0.a = r1
            java.lang.String r1 = "RYW1hcF9kZXZpY2VfYWRpdQ"
            java.lang.String r1 = com.amap.api.col.p0003l.q4.u(r1)
            java.lang.String r1 = com.amap.api.col.p0003l.o5.d(r1)
            r0.f3410b = r1
            return
    }

    public static com.amap.api.col.p0003l.g5 a(android.content.Context r2) {
            com.amap.api.col.3l.g5 r0 = com.amap.api.col.p0003l.g5.f3409c
            if (r0 != 0) goto L19
            java.lang.Class<com.amap.api.col.3l.g5> r0 = com.amap.api.col.p0003l.g5.class
            monitor-enter(r0)
            com.amap.api.col.3l.g5 r1 = com.amap.api.col.p0003l.g5.f3409c     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.amap.api.col.3l.g5 r1 = new com.amap.api.col.3l.g5     // Catch: java.lang.Throwable -> L13
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L13
            com.amap.api.col.p0003l.g5.f3409c = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r2 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r2
        L19:
            com.amap.api.col.3l.g5 r2 = com.amap.api.col.p0003l.g5.f3409c
            return r2
    }

    public final synchronized void b() {
            r1 = this;
            monitor-enter(r1)
            com.amap.api.col.3l.i4$c r0 = com.amap.api.col.p0003l.i4.z()     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto Le
            com.amap.api.col.3l.i4$c r0 = com.amap.api.col.p0003l.l5.a()     // Catch: java.lang.Throwable -> L10
            com.amap.api.col.p0003l.i4.q(r0)     // Catch: java.lang.Throwable -> L10
        Le:
            monitor-exit(r1)
            return
        L10:
            monitor-exit(r1)
            return
    }

    public final void c(java.lang.String r3) {
            r2 = this;
            android.content.Context r0 = r2.a
            com.amap.api.col.3l.i5 r0 = com.amap.api.col.p0003l.i5.b(r0)
            java.lang.String r1 = r2.f3410b
            r0.d(r1)
            android.content.Context r0 = r2.a
            com.amap.api.col.3l.i5 r0 = com.amap.api.col.p0003l.i5.b(r0)
            r0.g(r3)
            return
    }
}
