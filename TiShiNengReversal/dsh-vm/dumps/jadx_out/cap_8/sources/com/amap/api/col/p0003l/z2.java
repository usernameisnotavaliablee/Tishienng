package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class z2 {

    /* renamed from: b, reason: collision with root package name */
    private static volatile com.amap.api.col.p0003l.z2 f4290b;
    private com.amap.api.col.p0003l.b8 a;

    private z2() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            java.lang.String r0 = "AMapThreadUtil"
            com.amap.api.col.3l.b8 r0 = com.amap.api.col.p0003l.a3.b(r0)
            r1.a = r0
            return
    }

    public static com.amap.api.col.p0003l.z2 a() {
            com.amap.api.col.3l.z2 r0 = com.amap.api.col.p0003l.z2.f4290b
            if (r0 != 0) goto L19
            java.lang.Class<com.amap.api.col.3l.z2> r0 = com.amap.api.col.p0003l.z2.class
            monitor-enter(r0)
            com.amap.api.col.3l.z2 r1 = com.amap.api.col.p0003l.z2.f4290b     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.amap.api.col.3l.z2 r1 = new com.amap.api.col.3l.z2     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.amap.api.col.p0003l.z2.f4290b = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.amap.api.col.3l.z2 r0 = com.amap.api.col.p0003l.z2.f4290b
            return r0
    }

    public static void c() {
            com.amap.api.col.3l.z2 r0 = com.amap.api.col.p0003l.z2.f4290b
            if (r0 == 0) goto L18
            com.amap.api.col.3l.z2 r0 = com.amap.api.col.p0003l.z2.f4290b     // Catch: java.lang.Throwable -> L11
            com.amap.api.col.3l.b8 r0 = r0.a     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L11
            com.amap.api.col.3l.z2 r0 = com.amap.api.col.p0003l.z2.f4290b     // Catch: java.lang.Throwable -> L11
            com.amap.api.col.3l.b8 r0 = r0.a     // Catch: java.lang.Throwable -> L11
            r0.g()     // Catch: java.lang.Throwable -> L11
        L11:
            com.amap.api.col.3l.z2 r0 = com.amap.api.col.p0003l.z2.f4290b
            r1 = 0
            r0.a = r1
            com.amap.api.col.p0003l.z2.f4290b = r1
        L18:
            return
    }

    public static void d(com.amap.api.col.p0003l.c8 r0) {
            if (r0 == 0) goto L5
            r0.cancelTask()     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void b(com.amap.api.col.p0003l.c8 r2) {
            r1 = this;
            com.amap.api.col.3l.b8 r0 = r1.a     // Catch: java.lang.Exception -> L5
            r0.b(r2)     // Catch: java.lang.Exception -> L5
        L5:
            return
    }
}
