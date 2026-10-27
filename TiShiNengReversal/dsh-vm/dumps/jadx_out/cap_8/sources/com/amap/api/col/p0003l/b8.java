package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class b8 extends com.amap.api.col.p0003l.d8 {

    /* renamed from: d, reason: collision with root package name */
    private static java.lang.Thread.UncaughtExceptionHandler f3021d;

    /* renamed from: e, reason: collision with root package name */
    private static com.amap.api.col.p0003l.b8 f3022e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a implements java.lang.Thread.UncaughtExceptionHandler {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public final void uncaughtException(java.lang.Thread r2, java.lang.Throwable r3) {
                r1 = this;
                java.lang.String r2 = "TPool"
                java.lang.String r0 = "ThreadPool"
                com.amap.api.col.p0003l.w5.p(r3, r2, r0)
                return
        }
    }

    static {
            com.amap.api.col.3l.b8$a r0 = new com.amap.api.col.3l.b8$a
            r0.<init>()
            com.amap.api.col.p0003l.b8.f3021d = r0
            com.amap.api.col.3l.b8 r0 = new com.amap.api.col.3l.b8
            com.amap.api.col.3l.a8$b r1 = new com.amap.api.col.3l.a8$b
            r1.<init>()
            java.lang.Thread$UncaughtExceptionHandler r2 = com.amap.api.col.p0003l.b8.f3021d
            com.amap.api.col.3l.a8$b r1 = r1.d(r2)
            java.lang.String r2 = "amap-global-threadPool"
            com.amap.api.col.3l.a8$b r1 = r1.c(r2)
            com.amap.api.col.3l.a8 r1 = r1.h()
            r0.<init>(r1)
            com.amap.api.col.p0003l.b8.f3022e = r0
            return
    }

    private b8(com.amap.api.col.p0003l.a8 r9) {
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
            com.amap.api.col.p0003l.w5.p(r9, r0, r1)
            return
    }

    public static com.amap.api.col.p0003l.b8 h() {
            com.amap.api.col.3l.b8 r0 = com.amap.api.col.p0003l.b8.f3022e
            return r0
    }

    public static com.amap.api.col.p0003l.b8 i(com.amap.api.col.p0003l.a8 r1) {
            com.amap.api.col.3l.b8 r0 = new com.amap.api.col.3l.b8
            r0.<init>(r1)
            return r0
    }

    @java.lang.Deprecated
    public static synchronized com.amap.api.col.p0003l.b8 j() {
            java.lang.Class<com.amap.api.col.3l.b8> r0 = com.amap.api.col.p0003l.b8.class
            monitor-enter(r0)
            com.amap.api.col.3l.b8 r1 = com.amap.api.col.p0003l.b8.f3022e     // Catch: java.lang.Throwable -> L1e
            if (r1 != 0) goto L20
            com.amap.api.col.3l.b8 r1 = new com.amap.api.col.3l.b8     // Catch: java.lang.Throwable -> L1e
            com.amap.api.col.3l.a8$b r2 = new com.amap.api.col.3l.a8$b     // Catch: java.lang.Throwable -> L1e
            r2.<init>()     // Catch: java.lang.Throwable -> L1e
            java.lang.Thread$UncaughtExceptionHandler r3 = com.amap.api.col.p0003l.b8.f3021d     // Catch: java.lang.Throwable -> L1e
            com.amap.api.col.3l.a8$b r2 = r2.d(r3)     // Catch: java.lang.Throwable -> L1e
            com.amap.api.col.3l.a8 r2 = r2.h()     // Catch: java.lang.Throwable -> L1e
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1e
            com.amap.api.col.p0003l.b8.f3022e = r1     // Catch: java.lang.Throwable -> L1e
            goto L20
        L1e:
            r1 = move-exception
            goto L24
        L20:
            com.amap.api.col.3l.b8 r1 = com.amap.api.col.p0003l.b8.f3022e     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r0)
            return r1
        L24:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r1
    }

    @java.lang.Deprecated
    public static com.amap.api.col.p0003l.b8 k() {
            com.amap.api.col.3l.b8 r0 = new com.amap.api.col.3l.b8
            com.amap.api.col.3l.a8$b r1 = new com.amap.api.col.3l.a8$b
            r1.<init>()
            java.lang.Thread$UncaughtExceptionHandler r2 = com.amap.api.col.p0003l.b8.f3021d
            com.amap.api.col.3l.a8$b r1 = r1.d(r2)
            com.amap.api.col.3l.a8 r1 = r1.h()
            r0.<init>(r1)
            return r0
    }
}
