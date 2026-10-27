package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class y3 extends com.amap.api.col.s.a4 {

    /* renamed from: d, reason: collision with root package name */
    private static com.amap.api.col.s.y3 f4894d;

    static {
            com.amap.api.col.s.y3 r0 = new com.amap.api.col.s.y3
            com.amap.api.col.s.x3$b r1 = new com.amap.api.col.s.x3$b
            r1.<init>()
            java.lang.String r2 = "amap-global-threadPool"
            com.amap.api.col.s.x3$b r1 = r1.a(r2)
            com.amap.api.col.s.x3 r1 = r1.b()
            r0.<init>(r1)
            com.amap.api.col.s.y3.f4894d = r0
            return
    }

    private y3(com.amap.api.col.s.x3 r9) {
            r8 = this;
            r8.<init>()
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor     // Catch: java.lang.Throwable -> L23
            int r1 = r9.a()     // Catch: java.lang.Throwable -> L23
            int r2 = r9.b()     // Catch: java.lang.Throwable -> L23
            int r3 = r9.d()     // Catch: java.lang.Throwable -> L23
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L23
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L23
            java.util.concurrent.BlockingQueue r6 = r9.c()     // Catch: java.lang.Throwable -> L23
            r7 = r9
            r0.<init>(r1, r2, r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L23
            r8.a = r0     // Catch: java.lang.Throwable -> L23
            r9 = 1
            r0.allowCoreThreadTimeOut(r9)     // Catch: java.lang.Throwable -> L23
            return
        L23:
            r0 = move-exception
            r9 = r0
            java.lang.String r0 = "TPool"
            java.lang.String r1 = "ThreadPool"
            com.amap.api.col.s.g2.o(r9, r0, r1)
            return
    }

    public static com.amap.api.col.s.y3 e() {
            com.amap.api.col.s.y3 r0 = com.amap.api.col.s.y3.f4894d
            return r0
    }
}
