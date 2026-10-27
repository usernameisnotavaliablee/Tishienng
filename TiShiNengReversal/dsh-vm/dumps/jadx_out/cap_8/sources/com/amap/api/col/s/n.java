package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class n {

    /* renamed from: b, reason: collision with root package name */
    private static volatile com.amap.api.col.s.n f4569b;
    private java.util.HashMap<java.lang.String, com.amap.api.col.s.o> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a {
        private boolean a;

        /* renamed from: b, reason: collision with root package name */
        private long f4570b;

        /* renamed from: c, reason: collision with root package name */
        private int f4571c;

        /* renamed from: d, reason: collision with root package name */
        private double f4572d;

        a() {
                r2 = this;
                r2.<init>()
                r0 = 1
                r2.a = r0
                r0 = 86400(0x15180, double:4.26873E-319)
                r2.f4570b = r0
                r0 = 10
                r2.f4571c = r0
                r0 = 0
                r2.f4572d = r0
                return
        }

        public final void a(double r1) {
                r0 = this;
                r0.f4572d = r1
                return
        }

        public final void b(int r1) {
                r0 = this;
                r0.f4571c = r1
                return
        }

        public final void c(long r1) {
                r0 = this;
                r0.f4570b = r1
                return
        }

        public final void d(boolean r1) {
                r0 = this;
                r0.a = r1
                return
        }

        public final boolean e() {
                r1 = this;
                boolean r0 = r1.a
                return r0
        }

        public final long f() {
                r2 = this;
                long r0 = r2.f4570b
                return r0
        }

        public final int g() {
                r1 = this;
                int r0 = r1.f4571c
                return r0
        }

        public final double h() {
                r2 = this;
                double r0 = r2.f4572d
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class b {
        java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        java.lang.Object f4573b;

        b() {
                r0 = this;
                r0.<init>()
                return
        }

        public final boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 == 0) goto L32
                java.lang.Class<com.amap.api.col.s.n$b> r2 = com.amap.api.col.s.n.b.class
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L10
                goto L32
            L10:
                com.amap.api.col.s.n$b r5 = (com.amap.api.col.s.n.b) r5
                java.lang.String r2 = r4.a
                if (r2 != 0) goto L23
                java.lang.String r2 = r5.a
                if (r2 == 0) goto L1b
                return r1
            L1b:
                java.lang.Object r2 = r4.f4573b
                java.lang.Object r5 = r5.f4573b
                if (r2 != r5) goto L22
                return r0
            L22:
                return r1
            L23:
                java.lang.String r3 = r5.a
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L32
                java.lang.Object r2 = r4.f4573b
                java.lang.Object r5 = r5.f4573b
                if (r2 != r5) goto L32
                return r0
            L32:
                return r1
        }

        public final int hashCode() {
                r3 = this;
                java.lang.String r0 = r3.a
                r1 = 0
                if (r0 != 0) goto L7
                r0 = 0
                goto Lb
            L7:
                int r0 = r0.hashCode()
            Lb:
                int r0 = r0 + 31
                int r0 = r0 * 31
                java.lang.Object r2 = r3.f4573b
                if (r2 != 0) goto L14
                goto L18
            L14:
                int r1 = r2.hashCode()
            L18:
                int r0 = r0 + r1
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class c {
        java.lang.Object a;

        /* renamed from: b, reason: collision with root package name */
        boolean f4574b;

        public c(java.lang.Object r1, boolean r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.f4574b = r2
                return
        }
    }

    public n() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.a = r0
            return
    }

    public static com.amap.api.col.s.n b() {
            com.amap.api.col.s.n r0 = com.amap.api.col.s.n.f4569b
            if (r0 != 0) goto L19
            java.lang.Class<com.amap.api.col.s.n> r0 = com.amap.api.col.s.n.class
            monitor-enter(r0)
            com.amap.api.col.s.n r1 = com.amap.api.col.s.n.f4569b     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.amap.api.col.s.n r1 = new com.amap.api.col.s.n     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.amap.api.col.s.n.f4569b = r1     // Catch: java.lang.Throwable -> L13
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
            com.amap.api.col.s.n r0 = com.amap.api.col.s.n.f4569b
            return r0
    }

    public final com.amap.api.col.s.n.c a(com.amap.api.col.s.n.b r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.util.HashMap<java.lang.String, com.amap.api.col.s.o> r1 = r3.a
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        Le:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L23
            java.lang.Object r2 = r1.next()
            com.amap.api.col.s.o r2 = (com.amap.api.col.s.o) r2
            if (r2 == 0) goto Le
            com.amap.api.col.s.n$c r2 = r2.a(r4)
            if (r2 == 0) goto Le
            return r2
        L23:
            return r0
    }

    public final synchronized com.amap.api.col.s.o c(java.lang.String r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.HashMap<java.lang.String, com.amap.api.col.s.o> r0 = r1.a     // Catch: java.lang.Throwable -> Lb
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> Lb
            com.amap.api.col.s.o r2 = (com.amap.api.col.s.o) r2     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return r2
        Lb:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r2
    }

    public final void d(com.amap.api.col.s.n.a r3) {
            r2 = this;
            if (r3 != 0) goto L3
            goto L1f
        L3:
            java.util.HashMap<java.lang.String, com.amap.api.col.s.o> r0 = r2.a
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()
            com.amap.api.col.s.o r1 = (com.amap.api.col.s.o) r1
            if (r1 == 0) goto Ld
            r1.c(r3)
            goto Ld
        L1f:
            return
    }

    public final void e(com.amap.api.col.s.n.b r3, java.lang.Object r4) {
            r2 = this;
            java.util.HashMap<java.lang.String, com.amap.api.col.s.o> r0 = r2.a
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            com.amap.api.col.s.o r1 = (com.amap.api.col.s.o) r1
            if (r1 == 0) goto La
            r1.d(r3, r4)
            goto La
        L1c:
            return
    }

    public final void f(java.lang.String r2, com.amap.api.col.s.n.a r3) {
            r1 = this;
            if (r2 == 0) goto L12
            if (r3 != 0) goto L5
            goto L12
        L5:
            java.util.HashMap<java.lang.String, com.amap.api.col.s.o> r0 = r1.a
            java.lang.Object r2 = r0.get(r2)
            com.amap.api.col.s.o r2 = (com.amap.api.col.s.o) r2
            if (r2 == 0) goto L12
            r2.c(r3)
        L12:
            return
    }

    public final synchronized void g(java.lang.String r2, com.amap.api.col.s.o r3) {
            r1 = this;
            monitor-enter(r1)
            java.util.HashMap<java.lang.String, com.amap.api.col.s.o> r0 = r1.a     // Catch: java.lang.Throwable -> L8
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r2
    }

    public final boolean h(com.amap.api.col.s.n.b r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.util.HashMap<java.lang.String, com.amap.api.col.s.o> r1 = r3.a
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        Le:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L24
            java.lang.Object r2 = r1.next()
            com.amap.api.col.s.o r2 = (com.amap.api.col.s.o) r2
            if (r2 == 0) goto Le
            boolean r2 = r2.j(r4)
            if (r2 == 0) goto Le
            r4 = 1
            return r4
        L24:
            return r0
    }
}
