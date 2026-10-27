package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class z2 extends com.amap.api.col.s.u2 {

    /* renamed from: h, reason: collision with root package name */
    private static com.amap.api.col.s.z2 f4898h;

    /* renamed from: g, reason: collision with root package name */
    private android.os.Handler f4899g;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a extends android.os.Handler {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        private a(android.os.Looper r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        /* synthetic */ a(android.os.Looper r1, byte r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.os.Handler
        public final void handleMessage(android.os.Message r1) {
                r0 = this;
                int r1 = r1.what     // Catch: java.lang.Throwable -> L2
            L2:
                return
        }
    }

    private z2() {
            r3 = this;
            r3.<init>()
            android.os.Looper r0 = android.os.Looper.myLooper()     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L18
            com.amap.api.col.s.z2$a r0 = new com.amap.api.col.s.z2$a     // Catch: java.lang.Throwable -> L16
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L16
            r2 = 0
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L16
            r3.f4899g = r0     // Catch: java.lang.Throwable -> L16
            return
        L16:
            r0 = move-exception
            goto L20
        L18:
            com.amap.api.col.s.z2$a r0 = new com.amap.api.col.s.z2$a     // Catch: java.lang.Throwable -> L16
            r0.<init>()     // Catch: java.lang.Throwable -> L16
            r3.f4899g = r0     // Catch: java.lang.Throwable -> L16
            return
        L20:
            java.lang.String r1 = "NetManger"
            java.lang.String r2 = "NetManger1"
            com.amap.api.col.s.g2.o(r0, r1, r2)
            return
    }

    private static com.amap.api.col.s.b3 e(com.amap.api.col.s.dz r0, com.amap.api.col.s.dz.b r1, int r2) throws com.amap.api.col.s.bv {
            com.amap.api.col.s.u2.k(r0)     // Catch: java.lang.Throwable -> L13 com.amap.api.col.s.bv -> L1b
            r0.f(r1)     // Catch: java.lang.Throwable -> L13 com.amap.api.col.s.bv -> L1b
            r0.l(r2)     // Catch: java.lang.Throwable -> L13 com.amap.api.col.s.bv -> L1b
            com.amap.api.col.s.x2 r1 = new com.amap.api.col.s.x2     // Catch: java.lang.Throwable -> L13 com.amap.api.col.s.bv -> L1b
            r1.<init>()     // Catch: java.lang.Throwable -> L13 com.amap.api.col.s.bv -> L1b
            com.amap.api.col.s.b3 r0 = r1.d(r0)     // Catch: java.lang.Throwable -> L13 com.amap.api.col.s.bv -> L1b
            return r0
        L13:
            com.amap.api.col.s.bv r0 = new com.amap.api.col.s.bv
            java.lang.String r1 = "未知的错误"
            r0.<init>(r1)
            throw r0
        L1b:
            r0 = move-exception
            throw r0
    }

    @java.lang.Deprecated
    private static com.amap.api.col.s.b3 j(com.amap.api.col.s.dz r6, boolean r7) throws com.amap.api.col.s.bv {
            com.amap.api.col.s.u2.k(r6)
            if (r7 == 0) goto L8
            com.amap.api.col.s.dz$c r7 = com.amap.api.col.s.dz.c.f4428b
            goto La
        L8:
            com.amap.api.col.s.dz$c r7 = com.amap.api.col.s.dz.c.a
        La:
            r6.g(r7)
            boolean r7 = com.amap.api.col.s.u2.g(r6)
            r0 = 0
            r1 = 0
            r3 = 0
            if (r7 == 0) goto L44
            boolean r7 = com.amap.api.col.s.u2.i(r6)
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch: com.amap.api.col.s.bv -> L2c
            com.amap.api.col.s.dz$b r4 = com.amap.api.col.s.u2.c(r6, r7)     // Catch: com.amap.api.col.s.bv -> L2c
            int r5 = com.amap.api.col.s.u2.h(r6, r7)     // Catch: com.amap.api.col.s.bv -> L2c
            com.amap.api.col.s.b3 r0 = e(r6, r4, r5)     // Catch: com.amap.api.col.s.bv -> L2c
            goto L44
        L2c:
            r3 = move-exception
            int r4 = r3.f()
            r5 = 21
            if (r4 != r5) goto L3f
            com.amap.api.col.s.dz$a r4 = r6.w()
            com.amap.api.col.s.dz$a r5 = com.amap.api.col.s.dz.a.f4414b
            if (r4 == r5) goto L3e
            goto L3f
        L3e:
            throw r3
        L3f:
            if (r7 == 0) goto L43
            r3 = 1
            goto L44
        L43:
            throw r3
        L44:
            if (r0 == 0) goto L4f
            byte[] r7 = r0.a
            if (r7 == 0) goto L4f
            int r7 = r7.length
            if (r7 > 0) goto L4e
            goto L4f
        L4e:
            return r0
        L4f:
            com.amap.api.col.s.dz$b r7 = com.amap.api.col.s.u2.f(r6, r3)
            int r0 = com.amap.api.col.s.u2.a(r6, r1)
            com.amap.api.col.s.b3 r6 = e(r6, r7, r0)
            return r6
    }

    public static com.amap.api.col.s.z2 l() {
            com.amap.api.col.s.z2 r0 = m()
            return r0
    }

    private static synchronized com.amap.api.col.s.z2 m() {
            java.lang.Class<com.amap.api.col.s.z2> r0 = com.amap.api.col.s.z2.class
            monitor-enter(r0)
            com.amap.api.col.s.z2 r1 = com.amap.api.col.s.z2.f4898h     // Catch: java.lang.Throwable -> Le
            if (r1 != 0) goto Le
            com.amap.api.col.s.z2 r1 = new com.amap.api.col.s.z2     // Catch: java.lang.Throwable -> Le
            r1.<init>()     // Catch: java.lang.Throwable -> Le
            com.amap.api.col.s.z2.f4898h = r1     // Catch: java.lang.Throwable -> Le
        Le:
            com.amap.api.col.s.z2 r1 = com.amap.api.col.s.z2.f4898h     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)
            return r1
        L12:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r1
    }

    public static com.amap.api.col.s.b3 n(com.amap.api.col.s.dz r1) throws com.amap.api.col.s.bv {
            boolean r0 = r1.z()
            com.amap.api.col.s.b3 r1 = j(r1, r0)
            return r1
    }
}
