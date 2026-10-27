package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class z6 extends com.amap.api.col.p0003l.s6 {

    /* renamed from: i, reason: collision with root package name */
    private static com.amap.api.col.p0003l.z6 f4295i;

    /* renamed from: g, reason: collision with root package name */
    private com.amap.api.col.p0003l.b8 f4296g;

    /* renamed from: h, reason: collision with root package name */
    private android.os.Handler f4297h;

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

    private z6(boolean r3) {
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L1d
            com.amap.api.col.3l.a8$b r3 = new com.amap.api.col.3l.a8$b     // Catch: java.lang.Throwable -> L1b
            r3.<init>()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r0 = "amap-netmanger-threadpool-%d"
            com.amap.api.col.3l.a8$b r3 = r3.c(r0)     // Catch: java.lang.Throwable -> L1b
            com.amap.api.col.3l.a8 r3 = r3.h()     // Catch: java.lang.Throwable -> L1b
            com.amap.api.col.3l.b8 r3 = com.amap.api.col.p0003l.b8.i(r3)     // Catch: java.lang.Throwable -> L1b
            r2.f4296g = r3     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r3 = move-exception
            goto L38
        L1d:
            android.os.Looper r3 = android.os.Looper.myLooper()     // Catch: java.lang.Throwable -> L1b
            if (r3 != 0) goto L30
            com.amap.api.col.3l.z6$a r3 = new com.amap.api.col.3l.z6$a     // Catch: java.lang.Throwable -> L1b
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L1b
            r1 = 0
            r3.<init>(r0, r1)     // Catch: java.lang.Throwable -> L1b
            r2.f4297h = r3     // Catch: java.lang.Throwable -> L1b
            return
        L30:
            com.amap.api.col.3l.z6$a r3 = new com.amap.api.col.3l.z6$a     // Catch: java.lang.Throwable -> L1b
            r3.<init>()     // Catch: java.lang.Throwable -> L1b
            r2.f4297h = r3     // Catch: java.lang.Throwable -> L1b
            return
        L38:
            java.lang.String r0 = "NetManger"
            java.lang.String r1 = "NetManger1"
            com.amap.api.col.p0003l.w5.p(r3, r0, r1)
            return
    }

    private static synchronized com.amap.api.col.p0003l.z6 l(boolean r3) {
            java.lang.Class<com.amap.api.col.3l.z6> r0 = com.amap.api.col.p0003l.z6.class
            monitor-enter(r0)
            com.amap.api.col.3l.z6 r1 = com.amap.api.col.p0003l.z6.f4295i     // Catch: java.lang.Throwable -> L2a
            if (r1 != 0) goto Lf
            com.amap.api.col.3l.z6 r1 = new com.amap.api.col.3l.z6     // Catch: java.lang.Throwable -> L2a
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L2a
            com.amap.api.col.p0003l.z6.f4295i = r1     // Catch: java.lang.Throwable -> L2a
            goto L2a
        Lf:
            if (r3 == 0) goto L2a
            com.amap.api.col.3l.b8 r3 = r1.f4296g     // Catch: java.lang.Throwable -> L2a
            if (r3 != 0) goto L2a
            com.amap.api.col.3l.a8$b r3 = new com.amap.api.col.3l.a8$b     // Catch: java.lang.Throwable -> L2a
            r3.<init>()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r2 = "amap-netmanger-threadpool-%d"
            com.amap.api.col.3l.a8$b r3 = r3.c(r2)     // Catch: java.lang.Throwable -> L2a
            com.amap.api.col.3l.a8 r3 = r3.h()     // Catch: java.lang.Throwable -> L2a
            com.amap.api.col.3l.b8 r3 = com.amap.api.col.p0003l.b8.i(r3)     // Catch: java.lang.Throwable -> L2a
            r1.f4296g = r3     // Catch: java.lang.Throwable -> L2a
        L2a:
            com.amap.api.col.3l.z6 r3 = com.amap.api.col.p0003l.z6.f4295i     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r0)
            return r3
        L2e:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
            throw r3
    }

    private static java.util.Map<java.lang.String, java.lang.String> m(com.amap.api.col.p0003l.Cif r0, com.amap.api.col.p0003l.Cif.b r1, int r2) throws com.amap.api.col.p0003l.fk {
            com.amap.api.col.p0003l.s6.k(r0)     // Catch: java.lang.Throwable -> L13 com.amap.api.col.p0003l.fk -> L1b
            r0.setDegradeType(r1)     // Catch: java.lang.Throwable -> L13 com.amap.api.col.p0003l.fk -> L1b
            r0.setReal_max_timeout(r2)     // Catch: java.lang.Throwable -> L13 com.amap.api.col.p0003l.fk -> L1b
            com.amap.api.col.3l.x6 r1 = new com.amap.api.col.3l.x6     // Catch: java.lang.Throwable -> L13 com.amap.api.col.p0003l.fk -> L1b
            r1.<init>()     // Catch: java.lang.Throwable -> L13 com.amap.api.col.p0003l.fk -> L1b
            java.util.Map r0 = r1.j(r0)     // Catch: java.lang.Throwable -> L13 com.amap.api.col.p0003l.fk -> L1b
            return r0
        L13:
            com.amap.api.col.3l.fk r0 = new com.amap.api.col.3l.fk
            java.lang.String r1 = "未知的错误"
            r0.<init>(r1)
            throw r0
        L1b:
            r0 = move-exception
            throw r0
    }

    public static com.amap.api.col.p0003l.z6 n() {
            r0 = 1
            com.amap.api.col.3l.z6 r0 = l(r0)
            return r0
    }

    private static com.amap.api.col.p0003l.a7 o(com.amap.api.col.p0003l.Cif r0, com.amap.api.col.p0003l.Cif.b r1, int r2) throws com.amap.api.col.p0003l.fk {
            com.amap.api.col.p0003l.s6.k(r0)     // Catch: java.lang.Throwable -> L13 com.amap.api.col.p0003l.fk -> L1b
            r0.setDegradeType(r1)     // Catch: java.lang.Throwable -> L13 com.amap.api.col.p0003l.fk -> L1b
            r0.setReal_max_timeout(r2)     // Catch: java.lang.Throwable -> L13 com.amap.api.col.p0003l.fk -> L1b
            com.amap.api.col.3l.x6 r1 = new com.amap.api.col.3l.x6     // Catch: java.lang.Throwable -> L13 com.amap.api.col.p0003l.fk -> L1b
            r1.<init>()     // Catch: java.lang.Throwable -> L13 com.amap.api.col.p0003l.fk -> L1b
            com.amap.api.col.3l.a7 r0 = r1.q(r0)     // Catch: java.lang.Throwable -> L13 com.amap.api.col.p0003l.fk -> L1b
            return r0
        L13:
            com.amap.api.col.3l.fk r0 = new com.amap.api.col.3l.fk
            java.lang.String r1 = "未知的错误"
            r0.<init>(r1)
            throw r0
        L1b:
            r0 = move-exception
            throw r0
    }

    public static com.amap.api.col.p0003l.z6 p() {
            r0 = 0
            com.amap.api.col.3l.z6 r0 = l(r0)
            return r0
    }

    @java.lang.Deprecated
    public static java.util.Map<java.lang.String, java.lang.String> q(com.amap.api.col.p0003l.Cif r6, boolean r7) throws com.amap.api.col.p0003l.fk {
            com.amap.api.col.p0003l.s6.k(r6)
            if (r7 == 0) goto L8
            com.amap.api.col.3l.if$c r7 = com.amap.api.col.p0003l.Cif.c.f3539b
            goto La
        L8:
            com.amap.api.col.3l.if$c r7 = com.amap.api.col.p0003l.Cif.c.a
        La:
            r6.setHttpProtocol(r7)
            boolean r7 = com.amap.api.col.p0003l.s6.g(r6)
            r0 = 0
            r1 = 0
            r3 = 0
            if (r7 == 0) goto L32
            boolean r7 = com.amap.api.col.p0003l.s6.i(r6)
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch: com.amap.api.col.p0003l.fk -> L2c
            com.amap.api.col.3l.if$b r4 = com.amap.api.col.p0003l.s6.c(r6, r7)     // Catch: com.amap.api.col.p0003l.fk -> L2c
            int r5 = com.amap.api.col.p0003l.s6.h(r6, r7)     // Catch: com.amap.api.col.p0003l.fk -> L2c
            java.util.Map r0 = m(r6, r4, r5)     // Catch: com.amap.api.col.p0003l.fk -> L2c
            goto L32
        L2c:
            r3 = move-exception
            if (r7 == 0) goto L31
            r3 = 1
            goto L32
        L31:
            throw r3
        L32:
            if (r0 != 0) goto L41
            com.amap.api.col.3l.if$b r7 = com.amap.api.col.p0003l.s6.f(r6, r3)
            int r0 = com.amap.api.col.p0003l.s6.a(r6, r1)
            java.util.Map r6 = m(r6, r7, r0)
            return r6
        L41:
            return r0
    }

    public static com.amap.api.col.p0003l.a7 r(com.amap.api.col.p0003l.Cif r1) throws com.amap.api.col.p0003l.fk {
            boolean r0 = r1.isHttps()
            com.amap.api.col.3l.a7 r1 = s(r1, r0)
            return r1
    }

    @java.lang.Deprecated
    private static com.amap.api.col.p0003l.a7 s(com.amap.api.col.p0003l.Cif r6, boolean r7) throws com.amap.api.col.p0003l.fk {
            com.amap.api.col.p0003l.s6.k(r6)
            if (r7 == 0) goto L8
            com.amap.api.col.3l.if$c r7 = com.amap.api.col.p0003l.Cif.c.f3539b
            goto La
        L8:
            com.amap.api.col.3l.if$c r7 = com.amap.api.col.p0003l.Cif.c.a
        La:
            r6.setHttpProtocol(r7)
            boolean r7 = com.amap.api.col.p0003l.s6.g(r6)
            r0 = 0
            r1 = 0
            r3 = 0
            if (r7 == 0) goto L44
            boolean r7 = com.amap.api.col.p0003l.s6.i(r6)
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch: com.amap.api.col.p0003l.fk -> L2c
            com.amap.api.col.3l.if$b r4 = com.amap.api.col.p0003l.s6.c(r6, r7)     // Catch: com.amap.api.col.p0003l.fk -> L2c
            int r5 = com.amap.api.col.p0003l.s6.h(r6, r7)     // Catch: com.amap.api.col.p0003l.fk -> L2c
            com.amap.api.col.3l.a7 r0 = o(r6, r4, r5)     // Catch: com.amap.api.col.p0003l.fk -> L2c
            goto L44
        L2c:
            r3 = move-exception
            int r4 = r3.f()
            r5 = 21
            if (r4 != r5) goto L3f
            com.amap.api.col.3l.if$a r4 = r6.getDegradeAbility()
            com.amap.api.col.3l.if$a r5 = com.amap.api.col.p0003l.Cif.a.f3525b
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
            com.amap.api.col.3l.if$b r7 = com.amap.api.col.p0003l.s6.f(r6, r3)
            int r0 = com.amap.api.col.p0003l.s6.a(r6, r1)
            com.amap.api.col.3l.a7 r6 = o(r6, r7, r0)
            return r6
    }
}
