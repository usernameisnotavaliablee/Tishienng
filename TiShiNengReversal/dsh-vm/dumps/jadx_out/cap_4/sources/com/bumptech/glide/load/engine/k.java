package com.bumptech.glide.load.engine;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class k implements com.bumptech.glide.load.engine.m, com.bumptech.glide.load.engine.cache.j.a, com.bumptech.glide.load.engine.p.a {
    private static final java.lang.String i = "Engine";
    private static final int j = 150;
    private static final boolean k = false;
    private final com.bumptech.glide.load.engine.r a;
    private final com.bumptech.glide.load.engine.o b;
    private final com.bumptech.glide.load.engine.cache.j c;
    private final com.bumptech.glide.load.engine.k.b d;
    private final com.bumptech.glide.load.engine.x e;
    private final com.bumptech.glide.load.engine.k.c f;
    private final com.bumptech.glide.load.engine.k.a g;
    private final com.bumptech.glide.load.engine.a h;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.VisibleForTesting
    static class a {
        final com.bumptech.glide.load.engine.h.e a;
        final androidx.core.util.Pools.Pool<com.bumptech.glide.load.engine.h<?>> b;
        private int c;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bumptech.glide.load.engine.k$a$a, reason: collision with other inner class name */
        class C0025a implements com.bumptech.glide.util.pool.a.d<com.bumptech.glide.load.engine.h<?>> {
            final /* synthetic */ com.bumptech.glide.load.engine.k.a a;

            C0025a(com.bumptech.glide.load.engine.k.a r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // com.bumptech.glide.util.pool.a.d
            public /* bridge */ /* synthetic */ com.bumptech.glide.load.engine.h<?> a() {
                    r1 = this;
                    com.bumptech.glide.load.engine.h r0 = r1.b()
                    return r0
            }

            public com.bumptech.glide.load.engine.h<?> b() {
                    r3 = this;
                    com.bumptech.glide.load.engine.h r0 = new com.bumptech.glide.load.engine.h
                    com.bumptech.glide.load.engine.k$a r1 = r3.a
                    com.bumptech.glide.load.engine.h$e r2 = r1.a
                    androidx.core.util.Pools$Pool<com.bumptech.glide.load.engine.h<?>> r1 = r1.b
                    r0.<init>(r2, r1)
                    return r0
            }
        }

        a(com.bumptech.glide.load.engine.h.e r3) {
                r2 = this;
                r2.<init>()
                com.bumptech.glide.load.engine.k$a$a r0 = new com.bumptech.glide.load.engine.k$a$a
                r0.<init>(r2)
                r1 = 150(0x96, float:2.1E-43)
                androidx.core.util.Pools$Pool r0 = com.bumptech.glide.util.pool.a.e(r1, r0)
                r2.b = r0
                r2.a = r3
                return
        }

        <R> com.bumptech.glide.load.engine.h<R> a(com.bumptech.glide.d r21, java.lang.Object r22, com.bumptech.glide.load.engine.n r23, com.bumptech.glide.load.c r24, int r25, int r26, java.lang.Class<?> r27, java.lang.Class<R> r28, com.bumptech.glide.Priority r29, com.bumptech.glide.load.engine.j r30, java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.i<?>> r31, boolean r32, boolean r33, boolean r34, com.bumptech.glide.load.f r35, com.bumptech.glide.load.engine.h.b<R> r36) {
                r20 = this;
                r0 = r20
                androidx.core.util.Pools$Pool<com.bumptech.glide.load.engine.h<?>> r1 = r0.b
                java.lang.Object r1 = r1.acquire()
                com.bumptech.glide.load.engine.h r1 = (com.bumptech.glide.load.engine.h) r1
                java.lang.Object r1 = com.bumptech.glide.util.k.d(r1)
                r2 = r1
                com.bumptech.glide.load.engine.h r2 = (com.bumptech.glide.load.engine.h) r2
                int r1 = r0.c
                int r3 = r1 + 1
                r0.c = r3
                r3 = r21
                r4 = r22
                r5 = r23
                r6 = r24
                r7 = r25
                r8 = r26
                r9 = r27
                r10 = r28
                r11 = r29
                r12 = r30
                r13 = r31
                r14 = r32
                r15 = r33
                r16 = r34
                r17 = r35
                r18 = r36
                r19 = r1
                com.bumptech.glide.load.engine.h r1 = r2.p(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.VisibleForTesting
    static class b {
        final com.bumptech.glide.load.engine.executor.a a;
        final com.bumptech.glide.load.engine.executor.a b;
        final com.bumptech.glide.load.engine.executor.a c;
        final com.bumptech.glide.load.engine.executor.a d;
        final com.bumptech.glide.load.engine.m e;
        final com.bumptech.glide.load.engine.p.a f;
        final androidx.core.util.Pools.Pool<com.bumptech.glide.load.engine.l<?>> g;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements com.bumptech.glide.util.pool.a.d<com.bumptech.glide.load.engine.l<?>> {
            final /* synthetic */ com.bumptech.glide.load.engine.k.b a;

            a(com.bumptech.glide.load.engine.k.b r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // com.bumptech.glide.util.pool.a.d
            public /* bridge */ /* synthetic */ com.bumptech.glide.load.engine.l<?> a() {
                    r1 = this;
                    com.bumptech.glide.load.engine.l r0 = r1.b()
                    return r0
            }

            public com.bumptech.glide.load.engine.l<?> b() {
                    r8 = this;
                    com.bumptech.glide.load.engine.l r0 = new com.bumptech.glide.load.engine.l
                    com.bumptech.glide.load.engine.k$b r1 = r8.a
                    r2 = r1
                    com.bumptech.glide.load.engine.executor.a r1 = r2.a
                    r3 = r2
                    com.bumptech.glide.load.engine.executor.a r2 = r3.b
                    r4 = r3
                    com.bumptech.glide.load.engine.executor.a r3 = r4.c
                    r5 = r4
                    com.bumptech.glide.load.engine.executor.a r4 = r5.d
                    r6 = r5
                    com.bumptech.glide.load.engine.m r5 = r6.e
                    r7 = r6
                    com.bumptech.glide.load.engine.p$a r6 = r7.f
                    androidx.core.util.Pools$Pool<com.bumptech.glide.load.engine.l<?>> r7 = r7.g
                    r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                    return r0
            }
        }

        b(com.bumptech.glide.load.engine.executor.a r3, com.bumptech.glide.load.engine.executor.a r4, com.bumptech.glide.load.engine.executor.a r5, com.bumptech.glide.load.engine.executor.a r6, com.bumptech.glide.load.engine.m r7, com.bumptech.glide.load.engine.p.a r8) {
                r2 = this;
                r2.<init>()
                com.bumptech.glide.load.engine.k$b$a r0 = new com.bumptech.glide.load.engine.k$b$a
                r0.<init>(r2)
                r1 = 150(0x96, float:2.1E-43)
                androidx.core.util.Pools$Pool r0 = com.bumptech.glide.util.pool.a.e(r1, r0)
                r2.g = r0
                r2.a = r3
                r2.b = r4
                r2.c = r5
                r2.d = r6
                r2.e = r7
                r2.f = r8
                return
        }

        <R> com.bumptech.glide.load.engine.l<R> a(com.bumptech.glide.load.c r8, boolean r9, boolean r10, boolean r11, boolean r12) {
                r7 = this;
                androidx.core.util.Pools$Pool<com.bumptech.glide.load.engine.l<?>> r0 = r7.g
                java.lang.Object r0 = r0.acquire()
                com.bumptech.glide.load.engine.l r0 = (com.bumptech.glide.load.engine.l) r0
                java.lang.Object r0 = com.bumptech.glide.util.k.d(r0)
                r1 = r0
                com.bumptech.glide.load.engine.l r1 = (com.bumptech.glide.load.engine.l) r1
                r2 = r8
                r3 = r9
                r4 = r10
                r5 = r11
                r6 = r12
                com.bumptech.glide.load.engine.l r8 = r1.l(r2, r3, r4, r5, r6)
                return r8
        }

        @androidx.annotation.VisibleForTesting
        void b() {
                r1 = this;
                com.bumptech.glide.load.engine.executor.a r0 = r1.a
                com.bumptech.glide.util.e.c(r0)
                com.bumptech.glide.load.engine.executor.a r0 = r1.b
                com.bumptech.glide.util.e.c(r0)
                com.bumptech.glide.load.engine.executor.a r0 = r1.c
                com.bumptech.glide.util.e.c(r0)
                com.bumptech.glide.load.engine.executor.a r0 = r1.d
                com.bumptech.glide.util.e.c(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class c implements com.bumptech.glide.load.engine.h.e {
        private final com.bumptech.glide.load.engine.cache.a.InterfaceC0019a a;
        private volatile com.bumptech.glide.load.engine.cache.a b;

        c(com.bumptech.glide.load.engine.cache.a.InterfaceC0019a r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        @Override // com.bumptech.glide.load.engine.h.e
        public com.bumptech.glide.load.engine.cache.a a() {
                r1 = this;
                com.bumptech.glide.load.engine.cache.a r0 = r1.b
                if (r0 != 0) goto L23
                monitor-enter(r1)
                com.bumptech.glide.load.engine.cache.a r0 = r1.b     // Catch: java.lang.Throwable -> L12
                if (r0 != 0) goto L14
                com.bumptech.glide.load.engine.cache.a$a r0 = r1.a     // Catch: java.lang.Throwable -> L12
                com.bumptech.glide.load.engine.cache.a r0 = r0.build()     // Catch: java.lang.Throwable -> L12
                r1.b = r0     // Catch: java.lang.Throwable -> L12
                goto L14
            L12:
                r0 = move-exception
                goto L21
            L14:
                com.bumptech.glide.load.engine.cache.a r0 = r1.b     // Catch: java.lang.Throwable -> L12
                if (r0 != 0) goto L1f
                com.bumptech.glide.load.engine.cache.b r0 = new com.bumptech.glide.load.engine.cache.b     // Catch: java.lang.Throwable -> L12
                r0.<init>()     // Catch: java.lang.Throwable -> L12
                r1.b = r0     // Catch: java.lang.Throwable -> L12
            L1f:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
                goto L23
            L21:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
                throw r0
            L23:
                com.bumptech.glide.load.engine.cache.a r0 = r1.b
                return r0
        }

        @androidx.annotation.VisibleForTesting
        synchronized void b() {
                r1 = this;
                monitor-enter(r1)
                com.bumptech.glide.load.engine.cache.a r0 = r1.b     // Catch: java.lang.Throwable -> Le
                if (r0 != 0) goto L7
                monitor-exit(r1)
                return
            L7:
                com.bumptech.glide.load.engine.cache.a r0 = r1.b     // Catch: java.lang.Throwable -> Le
                r0.clear()     // Catch: java.lang.Throwable -> Le
                monitor-exit(r1)
                return
            Le:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class d {
        private final com.bumptech.glide.load.engine.l<?> a;
        private final com.bumptech.glide.request.i b;
        final /* synthetic */ com.bumptech.glide.load.engine.k c;

        d(com.bumptech.glide.load.engine.k r1, com.bumptech.glide.request.i r2, com.bumptech.glide.load.engine.l<?> r3) {
                r0 = this;
                r0.c = r1
                r0.<init>()
                r0.b = r2
                r0.a = r3
                return
        }

        public void a() {
                r3 = this;
                com.bumptech.glide.load.engine.k r0 = r3.c
                monitor-enter(r0)
                com.bumptech.glide.load.engine.l<?> r1 = r3.a     // Catch: java.lang.Throwable -> Lc
                com.bumptech.glide.request.i r2 = r3.b     // Catch: java.lang.Throwable -> Lc
                r1.s(r2)     // Catch: java.lang.Throwable -> Lc
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
                return
            Lc:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
                throw r1
        }
    }

    static {
            java.lang.String r0 = "Engine"
            r1 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            com.bumptech.glide.load.engine.k.k = r0
            return
    }

    @androidx.annotation.VisibleForTesting
    k(com.bumptech.glide.load.engine.cache.j r9, com.bumptech.glide.load.engine.cache.a.InterfaceC0019a r10, com.bumptech.glide.load.engine.executor.a r11, com.bumptech.glide.load.engine.executor.a r12, com.bumptech.glide.load.engine.executor.a r13, com.bumptech.glide.load.engine.executor.a r14, com.bumptech.glide.load.engine.r r15, com.bumptech.glide.load.engine.o r16, com.bumptech.glide.load.engine.a r17, com.bumptech.glide.load.engine.k.b r18, com.bumptech.glide.load.engine.k.a r19, com.bumptech.glide.load.engine.x r20, boolean r21) {
            r8 = this;
            r8.<init>()
            r8.c = r9
            com.bumptech.glide.load.engine.k$c r0 = new com.bumptech.glide.load.engine.k$c
            r0.<init>(r10)
            r8.f = r0
            if (r17 != 0) goto L16
            com.bumptech.glide.load.engine.a r10 = new com.bumptech.glide.load.engine.a
            r1 = r21
            r10.<init>(r1)
            goto L18
        L16:
            r10 = r17
        L18:
            r8.h = r10
            r10.g(r8)
            if (r16 != 0) goto L25
            com.bumptech.glide.load.engine.o r10 = new com.bumptech.glide.load.engine.o
            r10.<init>()
            goto L27
        L25:
            r10 = r16
        L27:
            r8.b = r10
            if (r15 != 0) goto L30
            com.bumptech.glide.load.engine.r r15 = new com.bumptech.glide.load.engine.r
            r15.<init>()
        L30:
            r8.a = r15
            if (r18 != 0) goto L40
            com.bumptech.glide.load.engine.k$b r1 = new com.bumptech.glide.load.engine.k$b
            r7 = r8
            r6 = r8
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7)
            goto L42
        L40:
            r1 = r18
        L42:
            r8.d = r1
            if (r19 != 0) goto L4c
            com.bumptech.glide.load.engine.k$a r10 = new com.bumptech.glide.load.engine.k$a
            r10.<init>(r0)
            goto L4e
        L4c:
            r10 = r19
        L4e:
            r8.g = r10
            if (r20 != 0) goto L58
            com.bumptech.glide.load.engine.x r10 = new com.bumptech.glide.load.engine.x
            r10.<init>()
            goto L5a
        L58:
            r10 = r20
        L5a:
            r8.e = r10
            r9.f(r8)
            return
    }

    public k(com.bumptech.glide.load.engine.cache.j r15, com.bumptech.glide.load.engine.cache.a.InterfaceC0019a r16, com.bumptech.glide.load.engine.executor.a r17, com.bumptech.glide.load.engine.executor.a r18, com.bumptech.glide.load.engine.executor.a r19, com.bumptech.glide.load.engine.executor.a r20, boolean r21) {
            r14 = this;
            r11 = 0
            r12 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r13 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
    }

    private com.bumptech.glide.load.engine.p<?> f(com.bumptech.glide.load.c r8) {
            r7 = this;
            com.bumptech.glide.load.engine.cache.j r0 = r7.c
            com.bumptech.glide.load.engine.u r2 = r0.e(r8)
            if (r2 != 0) goto La
            r8 = 0
            return r8
        La:
            boolean r0 = r2 instanceof com.bumptech.glide.load.engine.p
            if (r0 == 0) goto L11
            com.bumptech.glide.load.engine.p r2 = (com.bumptech.glide.load.engine.p) r2
            return r2
        L11:
            com.bumptech.glide.load.engine.p r1 = new com.bumptech.glide.load.engine.p
            r3 = 1
            r4 = 1
            r6 = r7
            r5 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
    }

    @androidx.annotation.Nullable
    private com.bumptech.glide.load.engine.p<?> h(com.bumptech.glide.load.c r2) {
            r1 = this;
            com.bumptech.glide.load.engine.a r0 = r1.h
            com.bumptech.glide.load.engine.p r2 = r0.e(r2)
            if (r2 == 0) goto Lb
            r2.b()
        Lb:
            return r2
    }

    private com.bumptech.glide.load.engine.p<?> i(com.bumptech.glide.load.c r3) {
            r2 = this;
            com.bumptech.glide.load.engine.p r0 = r2.f(r3)
            if (r0 == 0) goto Le
            r0.b()
            com.bumptech.glide.load.engine.a r1 = r2.h
            r1.a(r3, r0)
        Le:
            return r0
    }

    @androidx.annotation.Nullable
    private com.bumptech.glide.load.engine.p<?> j(com.bumptech.glide.load.engine.n r2, boolean r3, long r4) {
            r1 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            com.bumptech.glide.load.engine.p r3 = r1.h(r2)
            if (r3 == 0) goto L14
            boolean r0 = com.bumptech.glide.load.engine.k.k
            if (r0 == 0) goto L13
            java.lang.String r0 = "Loaded resource from active resources"
            k(r0, r4, r2)
        L13:
            return r3
        L14:
            com.bumptech.glide.load.engine.p r3 = r1.i(r2)
            if (r3 == 0) goto L24
            boolean r0 = com.bumptech.glide.load.engine.k.k
            if (r0 == 0) goto L23
            java.lang.String r0 = "Loaded resource from cache"
            k(r0, r4, r2)
        L23:
            return r3
        L24:
            return r0
    }

    private static void k(java.lang.String r0, long r1, com.bumptech.glide.load.c r3) {
            com.bumptech.glide.util.g.a(r1)
            java.util.Objects.toString(r3)
            return
    }

    private <R> com.bumptech.glide.load.engine.k.d n(com.bumptech.glide.d r21, java.lang.Object r22, com.bumptech.glide.load.c r23, int r24, int r25, java.lang.Class<?> r26, java.lang.Class<R> r27, com.bumptech.glide.Priority r28, com.bumptech.glide.load.engine.j r29, java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.i<?>> r30, boolean r31, boolean r32, com.bumptech.glide.load.f r33, boolean r34, boolean r35, boolean r36, boolean r37, com.bumptech.glide.request.i r38, java.util.concurrent.Executor r39, com.bumptech.glide.load.engine.n r40, long r41) {
            r20 = this;
            r0 = r20
            r1 = r38
            r2 = r39
            r4 = r40
            r9 = r41
            com.bumptech.glide.load.engine.r r3 = r0.a
            r8 = r37
            com.bumptech.glide.load.engine.l r3 = r3.a(r4, r8)
            if (r3 == 0) goto L26
            r3.a(r1, r2)
            boolean r2 = com.bumptech.glide.load.engine.k.k
            if (r2 == 0) goto L20
            java.lang.String r2 = "Added to existing load"
            k(r2, r9, r4)
        L20:
            com.bumptech.glide.load.engine.k$d r2 = new com.bumptech.glide.load.engine.k$d
            r2.<init>(r0, r1, r3)
            return r2
        L26:
            com.bumptech.glide.load.engine.k$b r3 = r0.d
            r5 = r34
            r6 = r35
            r7 = r36
            com.bumptech.glide.load.engine.l r19 = r3.a(r4, r5, r6, r7, r8)
            com.bumptech.glide.load.engine.k$a r3 = r0.g
            r4 = r21
            r5 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r26
            r11 = r27
            r12 = r28
            r13 = r29
            r14 = r30
            r15 = r31
            r16 = r32
            r18 = r33
            r17 = r37
            r6 = r40
            com.bumptech.glide.load.engine.h r3 = r3.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r4 = r6
            r5 = r19
            com.bumptech.glide.load.engine.r r6 = r0.a
            r6.d(r4, r5)
            r5.a(r1, r2)
            r5.t(r3)
            boolean r2 = com.bumptech.glide.load.engine.k.k
            if (r2 == 0) goto L6f
            java.lang.String r2 = "Started new load"
            r9 = r41
            k(r2, r9, r4)
        L6f:
            com.bumptech.glide.load.engine.k$d r2 = new com.bumptech.glide.load.engine.k$d
            r2.<init>(r0, r1, r5)
            return r2
    }

    @Override // com.bumptech.glide.load.engine.m
    public synchronized void a(com.bumptech.glide.load.engine.l<?> r2, com.bumptech.glide.load.c r3, com.bumptech.glide.load.engine.p<?> r4) {
            r1 = this;
            monitor-enter(r1)
            if (r4 == 0) goto L11
            boolean r0 = r4.d()     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L11
            com.bumptech.glide.load.engine.a r0 = r1.h     // Catch: java.lang.Throwable -> Lf
            r0.a(r3, r4)     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r2 = move-exception
            goto L18
        L11:
            com.bumptech.glide.load.engine.r r4 = r1.a     // Catch: java.lang.Throwable -> Lf
            r4.e(r3, r2)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r1)
            return
        L18:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            throw r2
    }

    @Override // com.bumptech.glide.load.engine.m
    public synchronized void b(com.bumptech.glide.load.engine.l<?> r2, com.bumptech.glide.load.c r3) {
            r1 = this;
            monitor-enter(r1)
            com.bumptech.glide.load.engine.r r0 = r1.a     // Catch: java.lang.Throwable -> L8
            r0.e(r3, r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r2
    }

    @Override // com.bumptech.glide.load.engine.p.a
    public void c(com.bumptech.glide.load.c r2, com.bumptech.glide.load.engine.p<?> r3) {
            r1 = this;
            com.bumptech.glide.load.engine.a r0 = r1.h
            r0.d(r2)
            boolean r0 = r3.d()
            if (r0 == 0) goto L11
            com.bumptech.glide.load.engine.cache.j r0 = r1.c
            r0.d(r2, r3)
            return
        L11:
            com.bumptech.glide.load.engine.x r2 = r1.e
            r0 = 0
            r2.a(r3, r0)
            return
    }

    @Override // com.bumptech.glide.load.engine.cache.j.a
    public void d(@androidx.annotation.NonNull com.bumptech.glide.load.engine.u<?> r3) {
            r2 = this;
            com.bumptech.glide.load.engine.x r0 = r2.e
            r1 = 1
            r0.a(r3, r1)
            return
    }

    public void e() {
            r1 = this;
            com.bumptech.glide.load.engine.k$c r0 = r1.f
            com.bumptech.glide.load.engine.cache.a r0 = r0.a()
            r0.clear()
            return
    }

    public <R> com.bumptech.glide.load.engine.k.d g(com.bumptech.glide.d r26, java.lang.Object r27, com.bumptech.glide.load.c r28, int r29, int r30, java.lang.Class<?> r31, java.lang.Class<R> r32, com.bumptech.glide.Priority r33, com.bumptech.glide.load.engine.j r34, java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.i<?>> r35, boolean r36, boolean r37, com.bumptech.glide.load.f r38, boolean r39, boolean r40, boolean r41, boolean r42, com.bumptech.glide.request.i r43, java.util.concurrent.Executor r44) {
            r25 = this;
            r2 = r25
            boolean r0 = com.bumptech.glide.load.engine.k.k
            if (r0 == 0) goto Lb
            long r0 = com.bumptech.glide.util.g.b()
            goto Ld
        Lb:
            r0 = 0
        Ld:
            com.bumptech.glide.load.engine.o r3 = r2.b
            r4 = r27
            r5 = r28
            r6 = r29
            r7 = r30
            r9 = r31
            r10 = r32
            r8 = r35
            r11 = r38
            com.bumptech.glide.load.engine.n r3 = r3.a(r4, r5, r6, r7, r8, r9, r10, r11)
            monitor-enter(r25)
            r4 = r39
            com.bumptech.glide.load.engine.p r5 = r2.j(r3, r4, r0)     // Catch: java.lang.Throwable -> L5c
            if (r5 != 0) goto L5e
            r5 = r28
            r6 = r29
            r7 = r30
            r8 = r31
            r9 = r32
            r10 = r33
            r11 = r34
            r12 = r35
            r13 = r36
            r14 = r37
            r15 = r38
            r17 = r40
            r18 = r41
            r19 = r42
            r20 = r43
            r21 = r44
            r23 = r0
            r22 = r3
            r16 = r4
            r3 = r26
            r4 = r27
            com.bumptech.glide.load.engine.k$d r0 = r2.n(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)     // Catch: java.lang.Throwable -> L5c
            monitor-exit(r25)     // Catch: java.lang.Throwable -> L5c
            return r0
        L5c:
            r0 = move-exception
            goto L6a
        L5e:
            r0 = r5
            monitor-exit(r25)     // Catch: java.lang.Throwable -> L5c
            com.bumptech.glide.load.DataSource r1 = com.bumptech.glide.load.DataSource.MEMORY_CACHE
            r2 = 0
            r3 = r43
            r3.c(r0, r1, r2)
            r0 = 0
            return r0
        L6a:
            monitor-exit(r25)     // Catch: java.lang.Throwable -> L5c
            throw r0
    }

    public void l(com.bumptech.glide.load.engine.u<?> r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.bumptech.glide.load.engine.p
            if (r0 == 0) goto La
            com.bumptech.glide.load.engine.p r2 = (com.bumptech.glide.load.engine.p) r2
            r2.e()
            return
        La:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Cannot release anything but an EngineResource"
            r2.<init>(r0)
            throw r2
    }

    @androidx.annotation.VisibleForTesting
    public void m() {
            r1 = this;
            com.bumptech.glide.load.engine.k$b r0 = r1.d
            r0.b()
            com.bumptech.glide.load.engine.k$c r0 = r1.f
            r0.b()
            com.bumptech.glide.load.engine.a r0 = r1.h
            r0.h()
            return
    }
}
