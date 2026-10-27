package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class g9 {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a implements com.amap.api.col.p0003l.e9 {
        private int a;

        /* renamed from: b, reason: collision with root package name */
        private int f3415b;

        /* renamed from: c, reason: collision with root package name */
        private int f3416c;

        a(int r1, int r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.f3415b = r2
                r0.f3416c = r3
                return
        }

        @Override // com.amap.api.col.p0003l.e9
        public final long a() {
                r2 = this;
                int r0 = r2.a
                int r1 = r2.f3415b
                long r0 = com.amap.api.col.p0003l.g9.a(r0, r1)
                return r0
        }

        @Override // com.amap.api.col.p0003l.e9
        public final int b() {
                r1 = this;
                int r0 = r1.f3416c
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class b implements com.amap.api.col.p0003l.e9 {
        private long a;

        /* renamed from: b, reason: collision with root package name */
        private int f3417b;

        b(long r1, int r3) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.f3417b = r3
                return
        }

        @Override // com.amap.api.col.p0003l.e9
        public final long a() {
                r2 = this;
                long r0 = r2.a
                return r0
        }

        @Override // com.amap.api.col.p0003l.e9
        public final int b() {
                r1 = this;
                int r0 = r1.f3417b
                return r0
        }
    }

    public g9() {
            r1 = this;
            r1.<init>()
            return
    }

    public static long a(int r4, int r5) {
            long r0 = (long) r4
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            r4 = 32
            long r0 = r0 << r4
            long r4 = (long) r5
            long r4 = r4 & r2
            long r4 = r4 | r0
            return r4
    }

    public static synchronized short b(long r2) {
            java.lang.Class<com.amap.api.col.3l.g9> r0 = com.amap.api.col.p0003l.g9.class
            monitor-enter(r0)
            com.amap.api.col.3l.f9 r1 = com.amap.api.col.p0003l.f9.a()     // Catch: java.lang.Throwable -> Ld
            short r2 = r1.b(r2)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)
            return r2
        Ld:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r2
    }

    public static synchronized void c(java.util.List<com.amap.api.col.p0003l.ko> r6) {
            java.lang.Class<com.amap.api.col.3l.g9> r0 = com.amap.api.col.p0003l.g9.class
            monitor-enter(r0)
            if (r6 == 0) goto L87
            boolean r1 = r6.isEmpty()     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto Ld
            goto L87
        Ld:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3b
            int r2 = r6.size()     // Catch: java.lang.Throwable -> L3b
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L3b
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L3b
        L1a:
            boolean r2 = r6.hasNext()     // Catch: java.lang.Throwable -> L3b
            if (r2 == 0) goto L7c
            java.lang.Object r2 = r6.next()     // Catch: java.lang.Throwable -> L3b
            com.amap.api.col.3l.ko r2 = (com.amap.api.col.p0003l.ko) r2     // Catch: java.lang.Throwable -> L3b
            boolean r3 = r2 instanceof com.amap.api.col.p0003l.kq     // Catch: java.lang.Throwable -> L3b
            if (r3 == 0) goto L3d
            com.amap.api.col.3l.kq r2 = (com.amap.api.col.p0003l.kq) r2     // Catch: java.lang.Throwable -> L3b
            com.amap.api.col.3l.g9$a r3 = new com.amap.api.col.3l.g9$a     // Catch: java.lang.Throwable -> L3b
            int r4 = r2.f3656j     // Catch: java.lang.Throwable -> L3b
            int r5 = r2.f3657k     // Catch: java.lang.Throwable -> L3b
            int r2 = r2.f3647c     // Catch: java.lang.Throwable -> L3b
            r3.<init>(r4, r5, r2)     // Catch: java.lang.Throwable -> L3b
            r1.add(r3)     // Catch: java.lang.Throwable -> L3b
            goto L1a
        L3b:
            r6 = move-exception
            goto L85
        L3d:
            boolean r3 = r2 instanceof com.amap.api.col.p0003l.kr     // Catch: java.lang.Throwable -> L3b
            if (r3 == 0) goto L52
            com.amap.api.col.3l.kr r2 = (com.amap.api.col.p0003l.kr) r2     // Catch: java.lang.Throwable -> L3b
            com.amap.api.col.3l.g9$a r3 = new com.amap.api.col.3l.g9$a     // Catch: java.lang.Throwable -> L3b
            int r4 = r2.f3658j     // Catch: java.lang.Throwable -> L3b
            int r5 = r2.f3659k     // Catch: java.lang.Throwable -> L3b
            int r2 = r2.f3647c     // Catch: java.lang.Throwable -> L3b
            r3.<init>(r4, r5, r2)     // Catch: java.lang.Throwable -> L3b
            r1.add(r3)     // Catch: java.lang.Throwable -> L3b
            goto L1a
        L52:
            boolean r3 = r2 instanceof com.amap.api.col.p0003l.ks     // Catch: java.lang.Throwable -> L3b
            if (r3 == 0) goto L67
            com.amap.api.col.3l.ks r2 = (com.amap.api.col.p0003l.ks) r2     // Catch: java.lang.Throwable -> L3b
            com.amap.api.col.3l.g9$a r3 = new com.amap.api.col.3l.g9$a     // Catch: java.lang.Throwable -> L3b
            int r4 = r2.f3660j     // Catch: java.lang.Throwable -> L3b
            int r5 = r2.f3661k     // Catch: java.lang.Throwable -> L3b
            int r2 = r2.f3647c     // Catch: java.lang.Throwable -> L3b
            r3.<init>(r4, r5, r2)     // Catch: java.lang.Throwable -> L3b
            r1.add(r3)     // Catch: java.lang.Throwable -> L3b
            goto L1a
        L67:
            boolean r3 = r2 instanceof com.amap.api.col.p0003l.kp     // Catch: java.lang.Throwable -> L3b
            if (r3 == 0) goto L1a
            com.amap.api.col.3l.kp r2 = (com.amap.api.col.p0003l.kp) r2     // Catch: java.lang.Throwable -> L3b
            com.amap.api.col.3l.g9$a r3 = new com.amap.api.col.3l.g9$a     // Catch: java.lang.Throwable -> L3b
            int r4 = r2.f3655k     // Catch: java.lang.Throwable -> L3b
            int r5 = r2.l     // Catch: java.lang.Throwable -> L3b
            int r2 = r2.f3647c     // Catch: java.lang.Throwable -> L3b
            r3.<init>(r4, r5, r2)     // Catch: java.lang.Throwable -> L3b
            r1.add(r3)     // Catch: java.lang.Throwable -> L3b
            goto L1a
        L7c:
            com.amap.api.col.3l.f9 r6 = com.amap.api.col.p0003l.f9.a()     // Catch: java.lang.Throwable -> L3b
            r6.d(r1)     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r0)
            return
        L85:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3b
            throw r6
        L87:
            monitor-exit(r0)
            return
    }

    public static synchronized short d(long r2) {
            java.lang.Class<com.amap.api.col.3l.g9> r0 = com.amap.api.col.p0003l.g9.class
            monitor-enter(r0)
            com.amap.api.col.3l.f9 r1 = com.amap.api.col.p0003l.f9.a()     // Catch: java.lang.Throwable -> Ld
            short r2 = r1.g(r2)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)
            return r2
        Ld:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r2
    }

    public static synchronized void e(java.util.List<com.amap.api.col.p0003l.m9> r6) {
            java.lang.Class<com.amap.api.col.3l.g9> r0 = com.amap.api.col.p0003l.g9.class
            monitor-enter(r0)
            if (r6 == 0) goto L3f
            boolean r1 = r6.isEmpty()     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto Lc
            goto L3f
        Lc:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L32
            int r2 = r6.size()     // Catch: java.lang.Throwable -> L32
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L32
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L32
        L19:
            boolean r2 = r6.hasNext()     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L34
            java.lang.Object r2 = r6.next()     // Catch: java.lang.Throwable -> L32
            com.amap.api.col.3l.m9 r2 = (com.amap.api.col.p0003l.m9) r2     // Catch: java.lang.Throwable -> L32
            com.amap.api.col.3l.g9$b r3 = new com.amap.api.col.3l.g9$b     // Catch: java.lang.Throwable -> L32
            long r4 = r2.a     // Catch: java.lang.Throwable -> L32
            int r2 = r2.f3686c     // Catch: java.lang.Throwable -> L32
            r3.<init>(r4, r2)     // Catch: java.lang.Throwable -> L32
            r1.add(r3)     // Catch: java.lang.Throwable -> L32
            goto L19
        L32:
            r6 = move-exception
            goto L3d
        L34:
            com.amap.api.col.3l.f9 r6 = com.amap.api.col.p0003l.f9.a()     // Catch: java.lang.Throwable -> L32
            r6.h(r1)     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)
            return
        L3d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r6
        L3f:
            monitor-exit(r0)
            return
    }
}
