package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
class o {
    private boolean a;

    /* renamed from: b, reason: collision with root package name */
    private long f4582b;

    /* renamed from: c, reason: collision with root package name */
    private int f4583c;

    /* renamed from: d, reason: collision with root package name */
    private long f4584d;

    /* renamed from: e, reason: collision with root package name */
    private final java.util.LinkedHashMap<com.amap.api.col.s.n.b, java.lang.Object> f4585e;

    /* renamed from: f, reason: collision with root package name */
    private final java.lang.Object f4586f;

    /* renamed from: g, reason: collision with root package name */
    private final java.util.LinkedHashMap<com.amap.api.col.s.n.b, java.lang.Object> f4587g;

    /* renamed from: h, reason: collision with root package name */
    private final java.lang.Object f4588h;

    /* renamed from: i, reason: collision with root package name */
    private java.util.ArrayList<java.lang.String> f4589i;

    public o(java.lang.String... r3) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.a = r0
            r0 = 86400(0x15180, double:4.26873E-319)
            r2.f4582b = r0
            r0 = 10
            r2.f4583c = r0
            r0 = 0
            r2.f4584d = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r2.f4585e = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.f4586f = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r2.f4587g = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.f4588h = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f4589i = r0
            r2.e(r3)
            return
    }

    private void b() {
            r2 = this;
            java.util.LinkedHashMap<com.amap.api.col.s.n$b, java.lang.Object> r0 = r2.f4585e
            int r0 = r0.size()
            if (r0 <= 0) goto L2b
            int r1 = r2.f4583c
            if (r0 < r1) goto L2b
            java.util.LinkedHashMap<com.amap.api.col.s.n$b, java.lang.Object> r0 = r2.f4585e
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L16:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r0.next()
            com.amap.api.col.s.n$b r1 = (com.amap.api.col.s.n.b) r1
            if (r1 == 0) goto L16
            goto L26
        L25:
            r1 = 0
        L26:
            java.util.LinkedHashMap<com.amap.api.col.s.n$b, java.lang.Object> r0 = r2.f4585e
            r2.k(r0, r1)
        L2b:
            return
    }

    private void e(java.lang.String... r5) {
            r4 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r4.f4584d = r0
            java.util.LinkedHashMap<com.amap.api.col.s.n$b, java.lang.Object> r0 = r4.f4585e
            r0.clear()
            java.util.ArrayList<java.lang.String> r0 = r4.f4589i
            r0.clear()
            int r0 = r5.length
            r1 = 0
        L12:
            if (r1 >= r0) goto L20
            r2 = r5[r1]
            if (r2 == 0) goto L1d
            java.util.ArrayList<java.lang.String> r3 = r4.f4589i
            r3.add(r2)
        L1d:
            int r1 = r1 + 1
            goto L12
        L20:
            return
    }

    private void h() {
            r7 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r7.f4584d
            long r2 = r0 - r2
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r4
            long r4 = r7.f4582b
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L18
            java.util.LinkedHashMap<com.amap.api.col.s.n$b, java.lang.Object> r2 = r7.f4585e
            r2.clear()
            r7.f4584d = r0
        L18:
            return
    }

    private void i(com.amap.api.col.s.n.b r3, java.lang.Object r4) {
            r2 = this;
            java.lang.Object r0 = r2.f4586f
            monitor-enter(r0)
            r2.b()     // Catch: java.lang.Throwable -> L10
            r2.h()     // Catch: java.lang.Throwable -> L10
            java.util.LinkedHashMap<com.amap.api.col.s.n$b, java.lang.Object> r1 = r2.f4585e     // Catch: java.lang.Throwable -> L10
            r1.put(r3, r4)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r3
    }

    public final com.amap.api.col.s.n.c a(com.amap.api.col.s.n.b r6) {
            r5 = this;
            boolean r0 = r5.a
            r1 = 0
            if (r0 == 0) goto L6a
            if (r6 != 0) goto L8
            goto L6a
        L8:
            boolean r0 = r5.j(r6)
            if (r0 != 0) goto Lf
            return r1
        Lf:
            r5.h()
            java.lang.Object r0 = r5.f4586f
            monitor-enter(r0)
            java.util.LinkedHashMap<com.amap.api.col.s.n$b, java.lang.Object> r2 = r5.f4585e     // Catch: java.lang.Throwable -> L2b
            boolean r2 = r5.f(r2, r6)     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L2d
            com.amap.api.col.s.n$c r1 = new com.amap.api.col.s.n$c     // Catch: java.lang.Throwable -> L2b
            java.util.LinkedHashMap<com.amap.api.col.s.n$b, java.lang.Object> r2 = r5.f4585e     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r6 = r5.g(r2, r6)     // Catch: java.lang.Throwable -> L2b
            r2 = 1
            r1.<init>(r6, r2)     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            return r1
        L2b:
            r6 = move-exception
            goto L68
        L2d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r2 = r5.f4588h
            monitor-enter(r2)
            java.util.LinkedHashMap<com.amap.api.col.s.n$b, java.lang.Object> r0 = r5.f4587g     // Catch: java.lang.Throwable -> L51
            boolean r0 = r5.f(r0, r6)     // Catch: java.lang.Throwable -> L51
            if (r0 == 0) goto L53
        L39:
            java.util.LinkedHashMap<com.amap.api.col.s.n$b, java.lang.Object> r0 = r5.f4585e     // Catch: java.lang.Throwable -> L51
            boolean r0 = r5.f(r0, r6)     // Catch: java.lang.Throwable -> L51
            if (r0 != 0) goto L58
            java.util.LinkedHashMap<com.amap.api.col.s.n$b, java.lang.Object> r0 = r5.f4587g     // Catch: java.lang.Throwable -> L51
            boolean r0 = r5.f(r0, r6)     // Catch: java.lang.Throwable -> L51
            if (r0 == 0) goto L58
            java.lang.Object r0 = r5.f4588h     // Catch: java.lang.InterruptedException -> L39 java.lang.Throwable -> L51
            r3 = 1000(0x3e8, double:4.94E-321)
            r0.wait(r3)     // Catch: java.lang.InterruptedException -> L39 java.lang.Throwable -> L51
            goto L39
        L51:
            r6 = move-exception
            goto L66
        L53:
            java.util.LinkedHashMap<com.amap.api.col.s.n$b, java.lang.Object> r0 = r5.f4587g     // Catch: java.lang.Throwable -> L51
            r0.put(r6, r1)     // Catch: java.lang.Throwable -> L51
        L58:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L51
            com.amap.api.col.s.n$c r0 = new com.amap.api.col.s.n$c
            java.util.LinkedHashMap<com.amap.api.col.s.n$b, java.lang.Object> r1 = r5.f4585e
            java.lang.Object r6 = r5.g(r1, r6)
            r1 = 0
            r0.<init>(r6, r1)
            return r0
        L66:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L51
            throw r6
        L68:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            throw r6
        L6a:
            return r1
    }

    public void c(com.amap.api.col.s.n.a r3) {
            r2 = this;
            if (r3 == 0) goto L14
            boolean r0 = r3.e()
            r2.a = r0
            long r0 = r3.f()
            r2.f4582b = r0
            int r3 = r3.g()
            r2.f4583c = r3
        L14:
            return
    }

    public final void d(com.amap.api.col.s.n.b r2, java.lang.Object r3) {
            r1 = this;
            boolean r0 = r1.a
            if (r0 == 0) goto L23
            if (r2 != 0) goto L7
            goto L23
        L7:
            boolean r0 = r1.j(r2)
            if (r0 != 0) goto Le
            goto L23
        Le:
            r1.i(r2, r3)
            java.lang.Object r3 = r1.f4588h
            monitor-enter(r3)
            java.util.LinkedHashMap<com.amap.api.col.s.n$b, java.lang.Object> r0 = r1.f4587g     // Catch: java.lang.Throwable -> L20
            r1.k(r0, r2)     // Catch: java.lang.Throwable -> L20
            java.lang.Object r2 = r1.f4588h     // Catch: java.lang.Throwable -> L20
            r2.notify()     // Catch: java.lang.Throwable -> L20
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L20
            return
        L20:
            r2 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L20
            throw r2
        L23:
            return
    }

    protected boolean f(java.util.LinkedHashMap<com.amap.api.col.s.n.b, java.lang.Object> r1, com.amap.api.col.s.n.b r2) {
            r0 = this;
            if (r1 == 0) goto L9
            if (r2 == 0) goto L9
            boolean r1 = r1.containsKey(r2)
            return r1
        L9:
            r1 = 0
            return r1
    }

    protected java.lang.Object g(java.util.LinkedHashMap<com.amap.api.col.s.n.b, java.lang.Object> r1, com.amap.api.col.s.n.b r2) {
            r0 = this;
            if (r1 == 0) goto L9
            if (r2 == 0) goto L9
            java.lang.Object r1 = r1.get(r2)
            return r1
        L9:
            r1 = 0
            return r1
    }

    public final boolean j(com.amap.api.col.s.n.b r5) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L26
            java.lang.String r1 = r5.a
            if (r1 != 0) goto L8
            goto L26
        L8:
            java.util.ArrayList<java.lang.String> r1 = r4.f4589i
            java.util.Iterator r1 = r1.iterator()
        Le:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L26
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto Le
            java.lang.String r3 = r5.a
            boolean r2 = r3.contains(r2)
            if (r2 == 0) goto Le
            r5 = 1
            return r5
        L26:
            return r0
    }

    protected java.lang.Object k(java.util.LinkedHashMap<com.amap.api.col.s.n.b, java.lang.Object> r1, com.amap.api.col.s.n.b r2) {
            r0 = this;
            if (r1 == 0) goto L9
            if (r2 == 0) goto L9
            java.lang.Object r1 = r1.remove(r2)
            return r1
        L9:
            r1 = 0
            return r1
    }
}
