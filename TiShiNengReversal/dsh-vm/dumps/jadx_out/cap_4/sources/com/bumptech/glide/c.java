package com.bumptech.glide;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class c {
    private final java.util.Map<java.lang.Class<?>, com.bumptech.glide.j<?, ?>> a;
    private final com.bumptech.glide.e.a b;
    private com.bumptech.glide.load.engine.k c;
    private com.bumptech.glide.load.engine.bitmap_recycle.e d;
    private com.bumptech.glide.load.engine.bitmap_recycle.b e;
    private com.bumptech.glide.load.engine.cache.j f;
    private com.bumptech.glide.load.engine.executor.a g;
    private com.bumptech.glide.load.engine.executor.a h;
    private com.bumptech.glide.load.engine.cache.a.InterfaceC0019a i;
    private com.bumptech.glide.load.engine.cache.l j;
    private com.bumptech.glide.manager.d k;

    /* renamed from: l, reason: collision with root package name */
    private int f333l;

    /* renamed from: m, reason: collision with root package name */
    private com.bumptech.glide.b.a f334m;

    /* renamed from: n, reason: collision with root package name */
    @androidx.annotation.Nullable
    private com.bumptech.glide.manager.q.b f335n;

    /* renamed from: o, reason: collision with root package name */
    private com.bumptech.glide.load.engine.executor.a f336o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f337p;

    /* renamed from: q, reason: collision with root package name */
    @androidx.annotation.Nullable
    private java.util.List<com.bumptech.glide.request.g<java.lang.Object>> f338q;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements com.bumptech.glide.b.a {
        final /* synthetic */ com.bumptech.glide.c a;

        a(com.bumptech.glide.c r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.b.a
        @androidx.annotation.NonNull
        public com.bumptech.glide.request.h build() {
                r1 = this;
                com.bumptech.glide.request.h r0 = new com.bumptech.glide.request.h
                r0.<init>()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements com.bumptech.glide.b.a {
        final /* synthetic */ com.bumptech.glide.request.h a;
        final /* synthetic */ com.bumptech.glide.c b;

        b(com.bumptech.glide.c r1, com.bumptech.glide.request.h r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.b.a
        @androidx.annotation.NonNull
        public com.bumptech.glide.request.h build() {
                r1 = this;
                com.bumptech.glide.request.h r0 = r1.a
                if (r0 == 0) goto L5
                return r0
            L5:
                com.bumptech.glide.request.h r0 = new com.bumptech.glide.request.h
                r0.<init>()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.bumptech.glide.c$c, reason: collision with other inner class name */
    static final class C0014c implements com.bumptech.glide.e.b {
        C0014c() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class d implements com.bumptech.glide.e.b {
        public d() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class e implements com.bumptech.glide.e.b {
        final int a;

        e(int r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class f implements com.bumptech.glide.e.b {
        private f() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public c() {
            r1 = this;
            r1.<init>()
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            r1.a = r0
            com.bumptech.glide.e$a r0 = new com.bumptech.glide.e$a
            r0.<init>()
            r1.b = r0
            r0 = 4
            r1.f333l = r0
            com.bumptech.glide.c$a r0 = new com.bumptech.glide.c$a
            r0.<init>(r1)
            r1.f334m = r0
            return
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.c a(@androidx.annotation.NonNull com.bumptech.glide.request.g<java.lang.Object> r2) {
            r1 = this;
            java.util.List<com.bumptech.glide.request.g<java.lang.Object>> r0 = r1.f338q
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f338q = r0
        Lb:
            java.util.List<com.bumptech.glide.request.g<java.lang.Object>> r0 = r1.f338q
            r0.add(r2)
            return r1
    }

    @androidx.annotation.NonNull
    com.bumptech.glide.b b(@androidx.annotation.NonNull android.content.Context r15) {
            r14 = this;
            com.bumptech.glide.load.engine.executor.a r0 = r14.g
            if (r0 != 0) goto La
            com.bumptech.glide.load.engine.executor.a r0 = com.bumptech.glide.load.engine.executor.a.j()
            r14.g = r0
        La:
            com.bumptech.glide.load.engine.executor.a r0 = r14.h
            if (r0 != 0) goto L14
            com.bumptech.glide.load.engine.executor.a r0 = com.bumptech.glide.load.engine.executor.a.f()
            r14.h = r0
        L14:
            com.bumptech.glide.load.engine.executor.a r0 = r14.f336o
            if (r0 != 0) goto L1e
            com.bumptech.glide.load.engine.executor.a r0 = com.bumptech.glide.load.engine.executor.a.c()
            r14.f336o = r0
        L1e:
            com.bumptech.glide.load.engine.cache.l r0 = r14.j
            if (r0 != 0) goto L2d
            com.bumptech.glide.load.engine.cache.l$a r0 = new com.bumptech.glide.load.engine.cache.l$a
            r0.<init>(r15)
            com.bumptech.glide.load.engine.cache.l r0 = r0.a()
            r14.j = r0
        L2d:
            com.bumptech.glide.manager.d r0 = r14.k
            if (r0 != 0) goto L38
            com.bumptech.glide.manager.f r0 = new com.bumptech.glide.manager.f
            r0.<init>()
            r14.k = r0
        L38:
            com.bumptech.glide.load.engine.bitmap_recycle.e r0 = r14.d
            if (r0 != 0) goto L54
            com.bumptech.glide.load.engine.cache.l r0 = r14.j
            int r0 = r0.b()
            if (r0 <= 0) goto L4d
            com.bumptech.glide.load.engine.bitmap_recycle.l r1 = new com.bumptech.glide.load.engine.bitmap_recycle.l
            long r2 = (long) r0
            r1.<init>(r2)
            r14.d = r1
            goto L54
        L4d:
            com.bumptech.glide.load.engine.bitmap_recycle.f r0 = new com.bumptech.glide.load.engine.bitmap_recycle.f
            r0.<init>()
            r14.d = r0
        L54:
            com.bumptech.glide.load.engine.bitmap_recycle.b r0 = r14.e
            if (r0 != 0) goto L65
            com.bumptech.glide.load.engine.bitmap_recycle.j r0 = new com.bumptech.glide.load.engine.bitmap_recycle.j
            com.bumptech.glide.load.engine.cache.l r1 = r14.j
            int r1 = r1.a()
            r0.<init>(r1)
            r14.e = r0
        L65:
            com.bumptech.glide.load.engine.cache.j r0 = r14.f
            if (r0 != 0) goto L77
            com.bumptech.glide.load.engine.cache.i r0 = new com.bumptech.glide.load.engine.cache.i
            com.bumptech.glide.load.engine.cache.l r1 = r14.j
            int r1 = r1.d()
            long r1 = (long) r1
            r0.<init>(r1)
            r14.f = r0
        L77:
            com.bumptech.glide.load.engine.cache.a$a r0 = r14.i
            if (r0 != 0) goto L82
            com.bumptech.glide.load.engine.cache.h r0 = new com.bumptech.glide.load.engine.cache.h
            r0.<init>(r15)
            r14.i = r0
        L82:
            com.bumptech.glide.load.engine.k r0 = r14.c
            if (r0 != 0) goto L9d
            com.bumptech.glide.load.engine.k r1 = new com.bumptech.glide.load.engine.k
            com.bumptech.glide.load.engine.cache.j r2 = r14.f
            com.bumptech.glide.load.engine.cache.a$a r3 = r14.i
            com.bumptech.glide.load.engine.executor.a r4 = r14.h
            com.bumptech.glide.load.engine.executor.a r5 = r14.g
            com.bumptech.glide.load.engine.executor.a r6 = com.bumptech.glide.load.engine.executor.a.m()
            com.bumptech.glide.load.engine.executor.a r7 = r14.f336o
            boolean r8 = r14.f337p
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r14.c = r1
        L9d:
            java.util.List<com.bumptech.glide.request.g<java.lang.Object>> r0 = r14.f338q
            if (r0 != 0) goto La6
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            r14.f338q = r0
            goto Lac
        La6:
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r14.f338q = r0
        Lac:
            com.bumptech.glide.e$a r0 = r14.b
            com.bumptech.glide.e r13 = r0.c()
            com.bumptech.glide.manager.q r7 = new com.bumptech.glide.manager.q
            com.bumptech.glide.manager.q$b r0 = r14.f335n
            r7.<init>(r0, r13)
            com.bumptech.glide.b r1 = new com.bumptech.glide.b
            com.bumptech.glide.load.engine.k r3 = r14.c
            com.bumptech.glide.load.engine.cache.j r4 = r14.f
            com.bumptech.glide.load.engine.bitmap_recycle.e r5 = r14.d
            com.bumptech.glide.load.engine.bitmap_recycle.b r6 = r14.e
            com.bumptech.glide.manager.d r8 = r14.k
            int r9 = r14.f333l
            com.bumptech.glide.b$a r10 = r14.f334m
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.j<?, ?>> r11 = r14.a
            java.util.List<com.bumptech.glide.request.g<java.lang.Object>> r12 = r14.f338q
            r2 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r1
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.c c(@androidx.annotation.Nullable com.bumptech.glide.load.engine.executor.a r1) {
            r0 = this;
            r0.f336o = r1
            return r0
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.c d(@androidx.annotation.Nullable com.bumptech.glide.load.engine.bitmap_recycle.b r1) {
            r0 = this;
            r0.e = r1
            return r0
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.c e(@androidx.annotation.Nullable com.bumptech.glide.load.engine.bitmap_recycle.e r1) {
            r0 = this;
            r0.d = r1
            return r0
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.c f(@androidx.annotation.Nullable com.bumptech.glide.manager.d r1) {
            r0 = this;
            r0.k = r1
            return r0
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.c g(@androidx.annotation.NonNull com.bumptech.glide.b.a r1) {
            r0 = this;
            java.lang.Object r1 = com.bumptech.glide.util.k.d(r1)
            com.bumptech.glide.b$a r1 = (com.bumptech.glide.b.a) r1
            r0.f334m = r1
            return r0
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.c h(@androidx.annotation.Nullable com.bumptech.glide.request.h r2) {
            r1 = this;
            com.bumptech.glide.c$b r0 = new com.bumptech.glide.c$b
            r0.<init>(r1, r2)
            com.bumptech.glide.c r2 = r1.g(r0)
            return r2
    }

    @androidx.annotation.NonNull
    public <T> com.bumptech.glide.c i(@androidx.annotation.NonNull java.lang.Class<T> r2, @androidx.annotation.Nullable com.bumptech.glide.j<?, T> r3) {
            r1 = this;
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.j<?, ?>> r0 = r1.a
            r0.put(r2, r3)
            return r1
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.c j(@androidx.annotation.Nullable com.bumptech.glide.load.engine.cache.a.InterfaceC0019a r1) {
            r0 = this;
            r0.i = r1
            return r0
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.c k(@androidx.annotation.Nullable com.bumptech.glide.load.engine.executor.a r1) {
            r0 = this;
            r0.h = r1
            return r0
    }

    com.bumptech.glide.c l(com.bumptech.glide.load.engine.k r1) {
            r0 = this;
            r0.c = r1
            return r0
    }

    public com.bumptech.glide.c m(boolean r4) {
            r3 = this;
            com.bumptech.glide.e$a r0 = r3.b
            com.bumptech.glide.c$c r1 = new com.bumptech.glide.c$c
            r1.<init>()
            if (r4 == 0) goto L11
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r4 < r2) goto L11
            r4 = 1
            goto L12
        L11:
            r4 = 0
        L12:
            r0.update(r1, r4)
            return r3
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.c n(boolean r1) {
            r0 = this;
            r0.f337p = r1
            return r0
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.c o(int r2) {
            r1 = this;
            r0 = 2
            if (r2 < r0) goto L9
            r0 = 6
            if (r2 > r0) goto L9
            r1.f333l = r2
            return r1
        L9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Log level must be one of Log.VERBOSE, Log.DEBUG, Log.INFO, Log.WARN, or Log.ERROR"
            r2.<init>(r0)
            throw r2
    }

    public com.bumptech.glide.c p(boolean r3) {
            r2 = this;
            com.bumptech.glide.e$a r0 = r2.b
            com.bumptech.glide.c$d r1 = new com.bumptech.glide.c$d
            r1.<init>()
            r0.update(r1, r3)
            return r2
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.c q(@androidx.annotation.Nullable com.bumptech.glide.load.engine.cache.j r1) {
            r0 = this;
            r0.f = r1
            return r0
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.c r(@androidx.annotation.NonNull com.bumptech.glide.load.engine.cache.l.a r1) {
            r0 = this;
            com.bumptech.glide.load.engine.cache.l r1 = r1.a()
            com.bumptech.glide.c r1 = r0.s(r1)
            return r1
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.c s(@androidx.annotation.Nullable com.bumptech.glide.load.engine.cache.l r1) {
            r0 = this;
            r0.j = r1
            return r0
    }

    void t(@androidx.annotation.Nullable com.bumptech.glide.manager.q.b r1) {
            r0 = this;
            r0.f335n = r1
            return
    }

    @java.lang.Deprecated
    public com.bumptech.glide.c u(@androidx.annotation.Nullable com.bumptech.glide.load.engine.executor.a r1) {
            r0 = this;
            com.bumptech.glide.c r1 = r0.v(r1)
            return r1
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.c v(@androidx.annotation.Nullable com.bumptech.glide.load.engine.executor.a r1) {
            r0 = this;
            r0.g = r1
            return r0
    }
}
