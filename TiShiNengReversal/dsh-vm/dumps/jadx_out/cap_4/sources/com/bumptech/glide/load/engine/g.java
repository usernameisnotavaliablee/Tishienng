package com.bumptech.glide.load.engine;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class g<Transcode> {
    private final java.util.List<com.bumptech.glide.load.model.n.a<?>> a;
    private final java.util.List<com.bumptech.glide.load.c> b;
    private com.bumptech.glide.d c;
    private java.lang.Object d;
    private int e;
    private int f;
    private java.lang.Class<?> g;
    private com.bumptech.glide.load.engine.h.e h;
    private com.bumptech.glide.load.f i;
    private java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.i<?>> j;
    private java.lang.Class<Transcode> k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f396l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f397m;

    /* renamed from: n, reason: collision with root package name */
    private com.bumptech.glide.load.c f398n;

    /* renamed from: o, reason: collision with root package name */
    private com.bumptech.glide.Priority f399o;

    /* renamed from: p, reason: collision with root package name */
    private com.bumptech.glide.load.engine.j f400p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f401q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f402r;

    g() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.b = r0
            return
    }

    void a() {
            r2 = this;
            r0 = 0
            r2.c = r0
            r2.d = r0
            r2.f398n = r0
            r2.g = r0
            r2.k = r0
            r2.i = r0
            r2.f399o = r0
            r2.j = r0
            r2.f400p = r0
            java.util.List<com.bumptech.glide.load.model.n$a<?>> r0 = r2.a
            r0.clear()
            r0 = 0
            r2.f396l = r0
            java.util.List<com.bumptech.glide.load.c> r1 = r2.b
            r1.clear()
            r2.f397m = r0
            return
    }

    com.bumptech.glide.load.engine.bitmap_recycle.b b() {
            r1 = this;
            com.bumptech.glide.d r0 = r1.c
            com.bumptech.glide.load.engine.bitmap_recycle.b r0 = r0.b()
            return r0
    }

    java.util.List<com.bumptech.glide.load.c> c() {
            r8 = this;
            boolean r0 = r8.f397m
            if (r0 != 0) goto L57
            r0 = 1
            r8.f397m = r0
            java.util.List<com.bumptech.glide.load.c> r0 = r8.b
            r0.clear()
            java.util.List r0 = r8.g()
            int r1 = r0.size()
            r2 = 0
            r3 = 0
        L16:
            if (r3 >= r1) goto L57
            java.lang.Object r4 = r0.get(r3)
            com.bumptech.glide.load.model.n$a r4 = (com.bumptech.glide.load.model.n.a) r4
            java.util.List<com.bumptech.glide.load.c> r5 = r8.b
            com.bumptech.glide.load.c r6 = r4.a
            boolean r5 = r5.contains(r6)
            if (r5 != 0) goto L2f
            java.util.List<com.bumptech.glide.load.c> r5 = r8.b
            com.bumptech.glide.load.c r6 = r4.a
            r5.add(r6)
        L2f:
            r5 = 0
        L30:
            java.util.List<com.bumptech.glide.load.c> r6 = r4.b
            int r6 = r6.size()
            if (r5 >= r6) goto L54
            java.util.List<com.bumptech.glide.load.c> r6 = r8.b
            java.util.List<com.bumptech.glide.load.c> r7 = r4.b
            java.lang.Object r7 = r7.get(r5)
            boolean r6 = r6.contains(r7)
            if (r6 != 0) goto L51
            java.util.List<com.bumptech.glide.load.c> r6 = r8.b
            java.util.List<com.bumptech.glide.load.c> r7 = r4.b
            java.lang.Object r7 = r7.get(r5)
            r6.add(r7)
        L51:
            int r5 = r5 + 1
            goto L30
        L54:
            int r3 = r3 + 1
            goto L16
        L57:
            java.util.List<com.bumptech.glide.load.c> r0 = r8.b
            return r0
    }

    com.bumptech.glide.load.engine.cache.a d() {
            r1 = this;
            com.bumptech.glide.load.engine.h$e r0 = r1.h
            com.bumptech.glide.load.engine.cache.a r0 = r0.a()
            return r0
    }

    com.bumptech.glide.load.engine.j e() {
            r1 = this;
            com.bumptech.glide.load.engine.j r0 = r1.f400p
            return r0
    }

    int f() {
            r1 = this;
            int r0 = r1.f
            return r0
    }

    java.util.List<com.bumptech.glide.load.model.n.a<?>> g() {
            r8 = this;
            boolean r0 = r8.f396l
            if (r0 != 0) goto L3b
            r0 = 1
            r8.f396l = r0
            java.util.List<com.bumptech.glide.load.model.n$a<?>> r0 = r8.a
            r0.clear()
            com.bumptech.glide.d r0 = r8.c
            com.bumptech.glide.Registry r0 = r0.i()
            java.lang.Object r1 = r8.d
            java.util.List r0 = r0.i(r1)
            int r1 = r0.size()
            r2 = 0
        L1d:
            if (r2 >= r1) goto L3b
            java.lang.Object r3 = r0.get(r2)
            com.bumptech.glide.load.model.n r3 = (com.bumptech.glide.load.model.n) r3
            java.lang.Object r4 = r8.d
            int r5 = r8.e
            int r6 = r8.f
            com.bumptech.glide.load.f r7 = r8.i
            com.bumptech.glide.load.model.n$a r3 = r3.a(r4, r5, r6, r7)
            if (r3 == 0) goto L38
            java.util.List<com.bumptech.glide.load.model.n$a<?>> r4 = r8.a
            r4.add(r3)
        L38:
            int r2 = r2 + 1
            goto L1d
        L3b:
            java.util.List<com.bumptech.glide.load.model.n$a<?>> r0 = r8.a
            return r0
    }

    <Data> com.bumptech.glide.load.engine.s<Data, ?, Transcode> h(java.lang.Class<Data> r4) {
            r3 = this;
            com.bumptech.glide.d r0 = r3.c
            com.bumptech.glide.Registry r0 = r0.i()
            java.lang.Class<?> r1 = r3.g
            java.lang.Class<Transcode> r2 = r3.k
            com.bumptech.glide.load.engine.s r4 = r0.h(r4, r1, r2)
            return r4
    }

    java.lang.Class<?> i() {
            r1 = this;
            java.lang.Object r0 = r1.d
            java.lang.Class r0 = r0.getClass()
            return r0
    }

    java.util.List<com.bumptech.glide.load.model.n<java.io.File, ?>> j(java.io.File r2) throws com.bumptech.glide.Registry.NoModelLoaderAvailableException {
            r1 = this;
            com.bumptech.glide.d r0 = r1.c
            com.bumptech.glide.Registry r0 = r0.i()
            java.util.List r2 = r0.i(r2)
            return r2
    }

    com.bumptech.glide.load.f k() {
            r1 = this;
            com.bumptech.glide.load.f r0 = r1.i
            return r0
    }

    com.bumptech.glide.Priority l() {
            r1 = this;
            com.bumptech.glide.Priority r0 = r1.f399o
            return r0
    }

    java.util.List<java.lang.Class<?>> m() {
            r4 = this;
            com.bumptech.glide.d r0 = r4.c
            com.bumptech.glide.Registry r0 = r0.i()
            java.lang.Object r1 = r4.d
            java.lang.Class r1 = r1.getClass()
            java.lang.Class<?> r2 = r4.g
            java.lang.Class<Transcode> r3 = r4.k
            java.util.List r0 = r0.j(r1, r2, r3)
            return r0
    }

    <Z> com.bumptech.glide.load.h<Z> n(com.bumptech.glide.load.engine.u<Z> r2) {
            r1 = this;
            com.bumptech.glide.d r0 = r1.c
            com.bumptech.glide.Registry r0 = r0.i()
            com.bumptech.glide.load.h r2 = r0.k(r2)
            return r2
    }

    com.bumptech.glide.load.c o() {
            r1 = this;
            com.bumptech.glide.load.c r0 = r1.f398n
            return r0
    }

    <X> com.bumptech.glide.load.a<X> p(X r2) throws com.bumptech.glide.Registry.NoSourceEncoderAvailableException {
            r1 = this;
            com.bumptech.glide.d r0 = r1.c
            com.bumptech.glide.Registry r0 = r0.i()
            com.bumptech.glide.load.a r2 = r0.m(r2)
            return r2
    }

    java.lang.Class<?> q() {
            r1 = this;
            java.lang.Class<Transcode> r0 = r1.k
            return r0
    }

    <Z> com.bumptech.glide.load.i<Z> r(java.lang.Class<Z> r5) {
            r4 = this;
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.i<?>> r0 = r4.j
            java.lang.Object r0 = r0.get(r5)
            com.bumptech.glide.load.i r0 = (com.bumptech.glide.load.i) r0
            if (r0 != 0) goto L32
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.i<?>> r1 = r4.j
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L14:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L32
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Class r3 = (java.lang.Class) r3
            boolean r3 = r3.isAssignableFrom(r5)
            if (r3 == 0) goto L14
            java.lang.Object r0 = r2.getValue()
            com.bumptech.glide.load.i r0 = (com.bumptech.glide.load.i) r0
        L32:
            if (r0 != 0) goto L62
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.i<?>> r0 = r4.j
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5d
            boolean r0 = r4.f401q
            if (r0 != 0) goto L41
            goto L5d
        L41:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Missing transformation for "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = ". If you wish to ignore unknown resource types, use the optional transformation methods."
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L5d:
            com.bumptech.glide.load.resource.m r5 = com.bumptech.glide.load.resource.m.c()
            return r5
        L62:
            return r0
    }

    int s() {
            r1 = this;
            int r0 = r1.e
            return r0
    }

    boolean t(java.lang.Class<?> r1) {
            r0 = this;
            com.bumptech.glide.load.engine.s r1 = r0.h(r1)
            if (r1 == 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    <R> void u(com.bumptech.glide.d r1, java.lang.Object r2, com.bumptech.glide.load.c r3, int r4, int r5, com.bumptech.glide.load.engine.j r6, java.lang.Class<?> r7, java.lang.Class<R> r8, com.bumptech.glide.Priority r9, com.bumptech.glide.load.f r10, java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.i<?>> r11, boolean r12, boolean r13, com.bumptech.glide.load.engine.h.e r14) {
            r0 = this;
            r0.c = r1
            r0.d = r2
            r0.f398n = r3
            r0.e = r4
            r0.f = r5
            r0.f400p = r6
            r0.g = r7
            r0.h = r14
            r0.k = r8
            r0.f399o = r9
            r0.i = r10
            r0.j = r11
            r0.f401q = r12
            r0.f402r = r13
            return
    }

    boolean v(com.bumptech.glide.load.engine.u<?> r2) {
            r1 = this;
            com.bumptech.glide.d r0 = r1.c
            com.bumptech.glide.Registry r0 = r0.i()
            boolean r2 = r0.n(r2)
            return r2
    }

    boolean w() {
            r1 = this;
            boolean r0 = r1.f402r
            return r0
    }

    boolean x(com.bumptech.glide.load.c r6) {
            r5 = this;
            java.util.List r0 = r5.g()
            int r1 = r0.size()
            r2 = 0
            r3 = 0
        La:
            if (r3 >= r1) goto L1f
            java.lang.Object r4 = r0.get(r3)
            com.bumptech.glide.load.model.n$a r4 = (com.bumptech.glide.load.model.n.a) r4
            com.bumptech.glide.load.c r4 = r4.a
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L1c
            r6 = 1
            return r6
        L1c:
            int r3 = r3 + 1
            goto La
        L1f:
            return r2
    }
}
