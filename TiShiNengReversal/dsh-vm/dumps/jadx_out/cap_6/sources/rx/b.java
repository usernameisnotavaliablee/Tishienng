package rx;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class b {
    static final rx.b b = null;
    static final rx.b c = null;
    private final rx.b.j0 a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a implements rx.b.j0 {
        final /* synthetic */ rx.e a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: rx.b$a$a, reason: collision with other inner class name */
        class C0100a extends rx.l<java.lang.Object> {
            final /* synthetic */ rx.d a;
            final /* synthetic */ rx.b.a b;

            C0100a(rx.b.a r1, rx.d r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            @Override // rx.f
            public void onCompleted() {
                    r1 = this;
                    rx.d r0 = r1.a
                    r0.onCompleted()
                    return
            }

            @Override // rx.f
            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    rx.d r0 = r1.a
                    r0.onError(r2)
                    return
            }

            @Override // rx.f
            public void onNext(java.lang.Object r1) {
                    r0 = this;
                    return
            }
        }

        a(rx.e r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // rx.functions.b
        public /* bridge */ /* synthetic */ void call(rx.d r1) {
                r0 = this;
                rx.d r1 = (rx.d) r1
                r0.call2(r1)
                return
        }

        /* renamed from: call, reason: avoid collision after fix types in other method */
        public void call2(rx.d r2) {
                r1 = this;
                rx.b$a$a r0 = new rx.b$a$a
                r0.<init>(r1, r2)
                r2.a(r0)
                rx.e r2 = r1.a
                r2.J6(r0)
                return
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a0<T> implements rx.i.t<T> {
        final /* synthetic */ rx.functions.o a;
        final /* synthetic */ rx.b b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements rx.d {
            final /* synthetic */ rx.k a;
            final /* synthetic */ rx.b.a0 b;

            a(rx.b.a0 r1, rx.k r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            @Override // rx.d
            public void a(rx.m r2) {
                    r1 = this;
                    rx.k r0 = r1.a
                    r0.b(r2)
                    return
            }

            @Override // rx.d
            public void onCompleted() {
                    r3 = this;
                    rx.b$a0 r0 = r3.b     // Catch: java.lang.Throwable -> L1d
                    rx.functions.o r0 = r0.a     // Catch: java.lang.Throwable -> L1d
                    java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L1d
                    if (r0 != 0) goto L17
                    rx.k r0 = r3.a
                    java.lang.NullPointerException r1 = new java.lang.NullPointerException
                    java.lang.String r2 = "The value supplied is null"
                    r1.<init>(r2)
                    r0.onError(r1)
                    return
                L17:
                    rx.k r1 = r3.a
                    r1.d(r0)
                    return
                L1d:
                    r0 = move-exception
                    rx.k r1 = r3.a
                    r1.onError(r0)
                    return
            }

            @Override // rx.d
            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    rx.k r0 = r1.a
                    r0.onError(r2)
                    return
            }
        }

        a0(rx.b r1, rx.functions.o r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // rx.functions.b
        public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
                r0 = this;
                rx.k r1 = (rx.k) r1
                r0.call(r1)
                return
        }

        public void call(rx.k<? super T> r3) {
                r2 = this;
                rx.b r0 = r2.b
                rx.b$a0$a r1 = new rx.b$a0$a
                r1.<init>(r2, r3)
                r0.G0(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: rx.b$b, reason: collision with other inner class name */
    static class C0101b implements rx.b.j0 {
        final /* synthetic */ rx.i a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: rx.b$b$a */
        class a extends rx.k<java.lang.Object> {
            final /* synthetic */ rx.d b;
            final /* synthetic */ rx.b.C0101b c;

            a(rx.b.C0101b r1, rx.d r2) {
                    r0 = this;
                    r0.c = r1
                    r0.b = r2
                    r0.<init>()
                    return
            }

            @Override // rx.k
            public void d(java.lang.Object r1) {
                    r0 = this;
                    rx.d r1 = r0.b
                    r1.onCompleted()
                    return
            }

            @Override // rx.k
            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    rx.d r0 = r1.b
                    r0.onError(r2)
                    return
            }
        }

        C0101b(rx.i r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // rx.functions.b
        public /* bridge */ /* synthetic */ void call(rx.d r1) {
                r0 = this;
                rx.d r1 = (rx.d) r1
                r0.call2(r1)
                return
        }

        /* renamed from: call, reason: avoid collision after fix types in other method */
        public void call2(rx.d r2) {
                r1 = this;
                rx.b$b$a r0 = new rx.b$b$a
                r0.<init>(r1, r2)
                r2.a(r0)
                rx.i r2 = r1.a
                r2.j0(r0)
                return
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b0<T> implements rx.functions.o<T> {
        final /* synthetic */ java.lang.Object a;
        final /* synthetic */ rx.b b;

        b0(rx.b r1, java.lang.Object r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // rx.functions.o, java.util.concurrent.Callable
        public T call() {
                r1 = this;
                java.lang.Object r0 = r1.a
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class c implements rx.b.j0 {
        final /* synthetic */ rx.h a;
        final /* synthetic */ long b;
        final /* synthetic */ java.util.concurrent.TimeUnit c;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements rx.functions.a {
            final /* synthetic */ rx.d a;
            final /* synthetic */ rx.h.a b;
            final /* synthetic */ rx.b.c c;

            a(rx.b.c r1, rx.d r2, rx.h.a r3) {
                    r0 = this;
                    r0.c = r1
                    r0.a = r2
                    r0.b = r3
                    r0.<init>()
                    return
            }

            @Override // rx.functions.a
            public void call() {
                    r2 = this;
                    rx.d r0 = r2.a     // Catch: java.lang.Throwable -> Lb
                    r0.onCompleted()     // Catch: java.lang.Throwable -> Lb
                    rx.h$a r0 = r2.b
                    r0.unsubscribe()
                    return
                Lb:
                    r0 = move-exception
                    rx.h$a r1 = r2.b
                    r1.unsubscribe()
                    throw r0
            }
        }

        c(rx.h r1, long r2, java.util.concurrent.TimeUnit r4) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.c = r4
                r0.<init>()
                return
        }

        @Override // rx.functions.b
        public /* bridge */ /* synthetic */ void call(rx.d r1) {
                r0 = this;
                rx.d r1 = (rx.d) r1
                r0.call2(r1)
                return
        }

        /* renamed from: call, reason: avoid collision after fix types in other method */
        public void call2(rx.d r5) {
                r4 = this;
                rx.subscriptions.c r0 = new rx.subscriptions.c
                r0.<init>()
                r5.a(r0)
                boolean r1 = r0.isUnsubscribed()
                if (r1 != 0) goto L23
                rx.h r1 = r4.a
                rx.h$a r1 = r1.a()
                r0.b(r1)
                rx.b$c$a r0 = new rx.b$c$a
                r0.<init>(r4, r5, r1)
                long r2 = r4.b
                java.util.concurrent.TimeUnit r5 = r4.c
                r1.e(r0, r2, r5)
            L23:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c0 implements rx.b.j0 {
        final /* synthetic */ rx.h a;
        final /* synthetic */ rx.b b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements rx.d {
            final /* synthetic */ rx.d a;
            final /* synthetic */ rx.b.c0 b;

            /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
            /* renamed from: rx.b$c0$a$a, reason: collision with other inner class name */
            class C0102a implements rx.functions.a {
                final /* synthetic */ rx.m a;
                final /* synthetic */ rx.b.c0.a b;

                /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
                /* renamed from: rx.b$c0$a$a$a, reason: collision with other inner class name */
                class C0103a implements rx.functions.a {
                    final /* synthetic */ rx.h.a a;
                    final /* synthetic */ rx.b.c0.a.C0102a b;

                    C0103a(rx.b.c0.a.C0102a r1, rx.h.a r2) {
                            r0 = this;
                            r0.b = r1
                            r0.a = r2
                            r0.<init>()
                            return
                    }

                    @Override // rx.functions.a
                    public void call() {
                            r2 = this;
                            rx.b$c0$a$a r0 = r2.b     // Catch: java.lang.Throwable -> Ld
                            rx.m r0 = r0.a     // Catch: java.lang.Throwable -> Ld
                            r0.unsubscribe()     // Catch: java.lang.Throwable -> Ld
                            rx.h$a r0 = r2.a
                            r0.unsubscribe()
                            return
                        Ld:
                            r0 = move-exception
                            rx.h$a r1 = r2.a
                            r1.unsubscribe()
                            throw r0
                    }
                }

                C0102a(rx.b.c0.a r1, rx.m r2) {
                        r0 = this;
                        r0.b = r1
                        r0.a = r2
                        r0.<init>()
                        return
                }

                @Override // rx.functions.a
                public void call() {
                        r2 = this;
                        rx.b$c0$a r0 = r2.b
                        rx.b$c0 r0 = r0.b
                        rx.h r0 = r0.a
                        rx.h$a r0 = r0.a()
                        rx.b$c0$a$a$a r1 = new rx.b$c0$a$a$a
                        r1.<init>(r2, r0)
                        r0.d(r1)
                        return
                }
            }

            a(rx.b.c0 r1, rx.d r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            @Override // rx.d
            public void a(rx.m r3) {
                    r2 = this;
                    rx.d r0 = r2.a
                    rx.b$c0$a$a r1 = new rx.b$c0$a$a
                    r1.<init>(r2, r3)
                    rx.m r3 = rx.subscriptions.f.a(r1)
                    r0.a(r3)
                    return
            }

            @Override // rx.d
            public void onCompleted() {
                    r1 = this;
                    rx.d r0 = r1.a
                    r0.onCompleted()
                    return
            }

            @Override // rx.d
            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    rx.d r0 = r1.a
                    r0.onError(r2)
                    return
            }
        }

        c0(rx.b r1, rx.h r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // rx.functions.b
        public /* bridge */ /* synthetic */ void call(rx.d r1) {
                r0 = this;
                rx.d r1 = (rx.d) r1
                r0.call2(r1)
                return
        }

        /* renamed from: call, reason: avoid collision after fix types in other method */
        public void call2(rx.d r3) {
                r2 = this;
                rx.b r0 = r2.b
                rx.b$c0$a r1 = new rx.b$c0$a
                r1.<init>(r2, r3)
                r0.G0(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class d implements rx.b.j0 {
        final /* synthetic */ rx.functions.o a;
        final /* synthetic */ rx.functions.p b;
        final /* synthetic */ rx.functions.b c;
        final /* synthetic */ boolean d;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements rx.d {
            rx.m a;
            final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean b;
            final /* synthetic */ java.lang.Object c;
            final /* synthetic */ rx.d d;
            final /* synthetic */ rx.b.d e;

            /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
            /* renamed from: rx.b$d$a$a, reason: collision with other inner class name */
            class C0104a implements rx.functions.a {
                final /* synthetic */ rx.b.d.a a;

                C0104a(rx.b.d.a r1) {
                        r0 = this;
                        r0.a = r1
                        r0.<init>()
                        return
                }

                @Override // rx.functions.a
                public void call() {
                        r1 = this;
                        rx.b$d$a r0 = r1.a
                        r0.b()
                        return
                }
            }

            a(rx.b.d r1, java.util.concurrent.atomic.AtomicBoolean r2, java.lang.Object r3, rx.d r4) {
                    r0 = this;
                    r0.e = r1
                    r0.b = r2
                    r0.c = r3
                    r0.d = r4
                    r0.<init>()
                    return
            }

            @Override // rx.d
            public void a(rx.m r2) {
                    r1 = this;
                    r1.a = r2
                    rx.d r2 = r1.d
                    rx.b$d$a$a r0 = new rx.b$d$a$a
                    r0.<init>(r1)
                    rx.m r0 = rx.subscriptions.f.a(r0)
                    r2.a(r0)
                    return
            }

            void b() {
                    r3 = this;
                    rx.m r0 = r3.a
                    r0.unsubscribe()
                    java.util.concurrent.atomic.AtomicBoolean r0 = r3.b
                    r1 = 0
                    r2 = 1
                    boolean r0 = r0.compareAndSet(r1, r2)
                    if (r0 == 0) goto L1d
                    rx.b$d r0 = r3.e     // Catch: java.lang.Throwable -> L19
                    rx.functions.b r0 = r0.c     // Catch: java.lang.Throwable -> L19
                    java.lang.Object r1 = r3.c     // Catch: java.lang.Throwable -> L19
                    r0.call(r1)     // Catch: java.lang.Throwable -> L19
                    return
                L19:
                    r0 = move-exception
                    rx.plugins.c.I(r0)
                L1d:
                    return
            }

            @Override // rx.d
            public void onCompleted() {
                    r3 = this;
                    rx.b$d r0 = r3.e
                    boolean r0 = r0.d
                    if (r0 == 0) goto L21
                    java.util.concurrent.atomic.AtomicBoolean r0 = r3.b
                    r1 = 0
                    r2 = 1
                    boolean r0 = r0.compareAndSet(r1, r2)
                    if (r0 == 0) goto L21
                    rx.b$d r0 = r3.e     // Catch: java.lang.Throwable -> L1a
                    rx.functions.b r0 = r0.c     // Catch: java.lang.Throwable -> L1a
                    java.lang.Object r1 = r3.c     // Catch: java.lang.Throwable -> L1a
                    r0.call(r1)     // Catch: java.lang.Throwable -> L1a
                    goto L21
                L1a:
                    r0 = move-exception
                    rx.d r1 = r3.d
                    r1.onError(r0)
                    return
                L21:
                    rx.d r0 = r3.d
                    r0.onCompleted()
                    rx.b$d r0 = r3.e
                    boolean r0 = r0.d
                    if (r0 != 0) goto L2f
                    r3.b()
                L2f:
                    return
            }

            @Override // rx.d
            public void onError(java.lang.Throwable r6) {
                    r5 = this;
                    rx.b$d r0 = r5.e
                    boolean r0 = r0.d
                    if (r0 == 0) goto L2c
                    java.util.concurrent.atomic.AtomicBoolean r0 = r5.b
                    r1 = 0
                    r2 = 1
                    boolean r0 = r0.compareAndSet(r1, r2)
                    if (r0 == 0) goto L2c
                    rx.b$d r0 = r5.e     // Catch: java.lang.Throwable -> L1a
                    rx.functions.b r0 = r0.c     // Catch: java.lang.Throwable -> L1a
                    java.lang.Object r3 = r5.c     // Catch: java.lang.Throwable -> L1a
                    r0.call(r3)     // Catch: java.lang.Throwable -> L1a
                    goto L2c
                L1a:
                    r0 = move-exception
                    rx.exceptions.CompositeException r3 = new rx.exceptions.CompositeException
                    r4 = 2
                    java.lang.Throwable[] r4 = new java.lang.Throwable[r4]
                    r4[r1] = r6
                    r4[r2] = r0
                    java.util.List r6 = java.util.Arrays.asList(r4)
                    r3.<init>(r6)
                    r6 = r3
                L2c:
                    rx.d r0 = r5.d
                    r0.onError(r6)
                    rx.b$d r6 = r5.e
                    boolean r6 = r6.d
                    if (r6 != 0) goto L3a
                    r5.b()
                L3a:
                    return
            }
        }

        d(rx.functions.o r1, rx.functions.p r2, rx.functions.b r3, boolean r4) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.d = r4
                r0.<init>()
                return
        }

        @Override // rx.functions.b
        public /* bridge */ /* synthetic */ void call(rx.d r1) {
                r0 = this;
                rx.d r1 = (rx.d) r1
                r0.call2(r1)
                return
        }

        /* renamed from: call, reason: avoid collision after fix types in other method */
        public void call2(rx.d r8) {
                r7 = this;
                java.lang.String r0 = "The completable supplied is null"
                rx.functions.o r1 = r7.a     // Catch: java.lang.Throwable -> L90
                java.lang.Object r1 = r1.call()     // Catch: java.lang.Throwable -> L90
                r2 = 1
                r3 = 0
                r4 = 2
                rx.functions.p r5 = r7.b     // Catch: java.lang.Throwable -> L5b
                java.lang.Object r5 = r5.call(r1)     // Catch: java.lang.Throwable -> L5b
                rx.b r5 = (rx.b) r5     // Catch: java.lang.Throwable -> L5b
                if (r5 != 0) goto L4d
                rx.functions.b r5 = r7.c     // Catch: java.lang.Throwable -> L2a
                r5.call(r1)     // Catch: java.lang.Throwable -> L2a
                rx.m r1 = rx.subscriptions.f.e()
                r8.a(r1)
                java.lang.NullPointerException r1 = new java.lang.NullPointerException
                r1.<init>(r0)
                r8.onError(r1)
                return
            L2a:
                r1 = move-exception
                rx.exceptions.a.e(r1)
                rx.m r5 = rx.subscriptions.f.e()
                r8.a(r5)
                rx.exceptions.CompositeException r5 = new rx.exceptions.CompositeException
                java.lang.NullPointerException r6 = new java.lang.NullPointerException
                r6.<init>(r0)
                java.lang.Throwable[] r0 = new java.lang.Throwable[r4]
                r0[r3] = r6
                r0[r2] = r1
                java.util.List r0 = java.util.Arrays.asList(r0)
                r5.<init>(r0)
                r8.onError(r5)
                return
            L4d:
                java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
                r0.<init>()
                rx.b$d$a r2 = new rx.b$d$a
                r2.<init>(r7, r0, r1, r8)
                r5.G0(r2)
                return
            L5b:
                r0 = move-exception
                rx.functions.b r5 = r7.c     // Catch: java.lang.Throwable -> L6f
                r5.call(r1)     // Catch: java.lang.Throwable -> L6f
                rx.exceptions.a.e(r0)
                rx.m r1 = rx.subscriptions.f.e()
                r8.a(r1)
                r8.onError(r0)
                return
            L6f:
                r1 = move-exception
                rx.exceptions.a.e(r0)
                rx.exceptions.a.e(r1)
                rx.m r5 = rx.subscriptions.f.e()
                r8.a(r5)
                rx.exceptions.CompositeException r5 = new rx.exceptions.CompositeException
                java.lang.Throwable[] r4 = new java.lang.Throwable[r4]
                r4[r3] = r0
                r4[r2] = r1
                java.util.List r0 = java.util.Arrays.asList(r4)
                r5.<init>(r0)
                r8.onError(r5)
                return
            L90:
                r0 = move-exception
                rx.m r1 = rx.subscriptions.f.e()
                r8.a(r1)
                r8.onError(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class d0 implements rx.b.j0 {
        final /* synthetic */ java.lang.Iterable a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements rx.d {
            final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean a;
            final /* synthetic */ rx.subscriptions.b b;
            final /* synthetic */ rx.d c;
            final /* synthetic */ rx.b.d0 d;

            a(rx.b.d0 r1, java.util.concurrent.atomic.AtomicBoolean r2, rx.subscriptions.b r3, rx.d r4) {
                    r0 = this;
                    r0.d = r1
                    r0.a = r2
                    r0.b = r3
                    r0.c = r4
                    r0.<init>()
                    return
            }

            @Override // rx.d
            public void a(rx.m r2) {
                    r1 = this;
                    rx.subscriptions.b r0 = r1.b
                    r0.a(r2)
                    return
            }

            @Override // rx.d
            public void onCompleted() {
                    r3 = this;
                    java.util.concurrent.atomic.AtomicBoolean r0 = r3.a
                    r1 = 0
                    r2 = 1
                    boolean r0 = r0.compareAndSet(r1, r2)
                    if (r0 == 0) goto L14
                    rx.subscriptions.b r0 = r3.b
                    r0.unsubscribe()
                    rx.d r0 = r3.c
                    r0.onCompleted()
                L14:
                    return
            }

            @Override // rx.d
            public void onError(java.lang.Throwable r4) {
                    r3 = this;
                    java.util.concurrent.atomic.AtomicBoolean r0 = r3.a
                    r1 = 0
                    r2 = 1
                    boolean r0 = r0.compareAndSet(r1, r2)
                    if (r0 == 0) goto L15
                    rx.subscriptions.b r0 = r3.b
                    r0.unsubscribe()
                    rx.d r0 = r3.c
                    r0.onError(r4)
                    return
                L15:
                    rx.plugins.c.I(r4)
                    return
            }
        }

        d0(java.lang.Iterable r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // rx.functions.b
        public /* bridge */ /* synthetic */ void call(rx.d r1) {
                r0 = this;
                rx.d r1 = (rx.d) r1
                r0.call2(r1)
                return
        }

        /* renamed from: call, reason: avoid collision after fix types in other method */
        public void call2(rx.d r9) {
                r8 = this;
                rx.subscriptions.b r0 = new rx.subscriptions.b
                r0.<init>()
                r9.a(r0)
                java.lang.Iterable r1 = r8.a     // Catch: java.lang.Throwable -> La5
                java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> La5
                if (r1 != 0) goto L1b
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r1 = "The iterator returned is null"
                r0.<init>(r1)
                r9.onError(r0)
                return
            L1b:
                java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
                r2.<init>()
                rx.b$d0$a r3 = new rx.b$d0$a
                r3.<init>(r8, r2, r0, r9)
                r4 = 1
                r5 = 1
            L27:
                boolean r6 = r2.get()
                if (r6 != 0) goto La4
                boolean r6 = r0.isUnsubscribed()
                if (r6 == 0) goto L35
                goto La4
            L35:
                r6 = 0
                boolean r7 = r1.hasNext()     // Catch: java.lang.Throwable -> L93
                if (r7 != 0) goto L42
                if (r5 == 0) goto La4
                r9.onCompleted()
                return
            L42:
                boolean r5 = r2.get()
                if (r5 != 0) goto La4
                boolean r5 = r0.isUnsubscribed()
                if (r5 == 0) goto L4f
                goto La4
            L4f:
                java.lang.Object r5 = r1.next()     // Catch: java.lang.Throwable -> L81
                rx.b r5 = (rx.b) r5     // Catch: java.lang.Throwable -> L81
                if (r5 != 0) goto L6f
                java.lang.NullPointerException r1 = new java.lang.NullPointerException
                java.lang.String r3 = "One of the sources is null"
                r1.<init>(r3)
                boolean r2 = r2.compareAndSet(r6, r4)
                if (r2 == 0) goto L6b
                r0.unsubscribe()
                r9.onError(r1)
                return
            L6b:
                rx.plugins.c.I(r1)
                return
            L6f:
                boolean r7 = r2.get()
                if (r7 != 0) goto La4
                boolean r7 = r0.isUnsubscribed()
                if (r7 == 0) goto L7c
                goto La4
            L7c:
                r5.G0(r3)
                r5 = 0
                goto L27
            L81:
                r1 = move-exception
                boolean r2 = r2.compareAndSet(r6, r4)
                if (r2 == 0) goto L8f
                r0.unsubscribe()
                r9.onError(r1)
                goto La4
            L8f:
                rx.plugins.c.I(r1)
                goto La4
            L93:
                r1 = move-exception
                boolean r2 = r2.compareAndSet(r6, r4)
                if (r2 == 0) goto La1
                r0.unsubscribe()
                r9.onError(r1)
                goto La4
            La1:
                rx.plugins.c.I(r1)
            La4:
                return
            La5:
                r0 = move-exception
                r9.onError(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class e implements rx.d {
        final /* synthetic */ java.util.concurrent.CountDownLatch a;
        final /* synthetic */ java.lang.Throwable[] b;
        final /* synthetic */ rx.b c;

        e(rx.b r1, java.util.concurrent.CountDownLatch r2, java.lang.Throwable[] r3) {
                r0 = this;
                r0.c = r1
                r0.a = r2
                r0.b = r3
                r0.<init>()
                return
        }

        @Override // rx.d
        public void a(rx.m r1) {
                r0 = this;
                return
        }

        @Override // rx.d
        public void onCompleted() {
                r1 = this;
                java.util.concurrent.CountDownLatch r0 = r1.a
                r0.countDown()
                return
        }

        @Override // rx.d
        public void onError(java.lang.Throwable r3) {
                r2 = this;
                java.lang.Throwable[] r0 = r2.b
                r1 = 0
                r0[r1] = r3
                java.util.concurrent.CountDownLatch r3 = r2.a
                r3.countDown()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class e0 implements rx.b.j0 {
        final /* synthetic */ rx.functions.o a;

        e0(rx.functions.o r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // rx.functions.b
        public /* bridge */ /* synthetic */ void call(rx.d r1) {
                r0 = this;
                rx.d r1 = (rx.d) r1
                r0.call2(r1)
                return
        }

        /* renamed from: call, reason: avoid collision after fix types in other method */
        public void call2(rx.d r3) {
                r2 = this;
                rx.functions.o r0 = r2.a     // Catch: java.lang.Throwable -> L20
                java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L20
                rx.b r0 = (rx.b) r0     // Catch: java.lang.Throwable -> L20
                if (r0 != 0) goto L1c
                rx.m r0 = rx.subscriptions.f.e()
                r3.a(r0)
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r1 = "The completable returned is null"
                r0.<init>(r1)
                r3.onError(r0)
                return
            L1c:
                r0.G0(r3)
                return
            L20:
                r0 = move-exception
                rx.m r1 = rx.subscriptions.f.e()
                r3.a(r1)
                r3.onError(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class f implements rx.d {
        final /* synthetic */ java.util.concurrent.CountDownLatch a;
        final /* synthetic */ java.lang.Throwable[] b;
        final /* synthetic */ rx.b c;

        f(rx.b r1, java.util.concurrent.CountDownLatch r2, java.lang.Throwable[] r3) {
                r0 = this;
                r0.c = r1
                r0.a = r2
                r0.b = r3
                r0.<init>()
                return
        }

        @Override // rx.d
        public void a(rx.m r1) {
                r0 = this;
                return
        }

        @Override // rx.d
        public void onCompleted() {
                r1 = this;
                java.util.concurrent.CountDownLatch r0 = r1.a
                r0.countDown()
                return
        }

        @Override // rx.d
        public void onError(java.lang.Throwable r3) {
                r2 = this;
                java.lang.Throwable[] r0 = r2.b
                r1 = 0
                r0[r1] = r3
                java.util.concurrent.CountDownLatch r3 = r2.a
                r3.countDown()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class f0 implements rx.b.j0 {
        final /* synthetic */ rx.functions.o a;

        f0(rx.functions.o r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // rx.functions.b
        public /* bridge */ /* synthetic */ void call(rx.d r1) {
                r0 = this;
                rx.d r1 = (rx.d) r1
                r0.call2(r1)
                return
        }

        /* renamed from: call, reason: avoid collision after fix types in other method */
        public void call2(rx.d r3) {
                r2 = this;
                rx.m r0 = rx.subscriptions.f.e()
                r3.a(r0)
                rx.functions.o r0 = r2.a     // Catch: java.lang.Throwable -> L10
                java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L10
                java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch: java.lang.Throwable -> L10
                goto L11
            L10:
                r0 = move-exception
            L11:
                if (r0 != 0) goto L1a
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r1 = "The error supplied is null"
                r0.<init>(r1)
            L1a:
                r3.onError(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class g implements rx.b.j0 {
        final /* synthetic */ rx.h a;
        final /* synthetic */ long b;
        final /* synthetic */ java.util.concurrent.TimeUnit c;
        final /* synthetic */ boolean d;
        final /* synthetic */ rx.b e;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements rx.d {
            final /* synthetic */ rx.subscriptions.b a;
            final /* synthetic */ rx.h.a b;
            final /* synthetic */ rx.d c;
            final /* synthetic */ rx.b.g d;

            /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
            /* renamed from: rx.b$g$a$a, reason: collision with other inner class name */
            class C0105a implements rx.functions.a {
                final /* synthetic */ rx.b.g.a a;

                C0105a(rx.b.g.a r1) {
                        r0 = this;
                        r0.a = r1
                        r0.<init>()
                        return
                }

                @Override // rx.functions.a
                public void call() {
                        r2 = this;
                        rx.b$g$a r0 = r2.a     // Catch: java.lang.Throwable -> Lf
                        rx.d r0 = r0.c     // Catch: java.lang.Throwable -> Lf
                        r0.onCompleted()     // Catch: java.lang.Throwable -> Lf
                        rx.b$g$a r0 = r2.a
                        rx.h$a r0 = r0.b
                        r0.unsubscribe()
                        return
                    Lf:
                        r0 = move-exception
                        rx.b$g$a r1 = r2.a
                        rx.h$a r1 = r1.b
                        r1.unsubscribe()
                        throw r0
                }
            }

            /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
            /* renamed from: rx.b$g$a$b, reason: collision with other inner class name */
            class C0106b implements rx.functions.a {
                final /* synthetic */ java.lang.Throwable a;
                final /* synthetic */ rx.b.g.a b;

                C0106b(rx.b.g.a r1, java.lang.Throwable r2) {
                        r0 = this;
                        r0.b = r1
                        r0.a = r2
                        r0.<init>()
                        return
                }

                @Override // rx.functions.a
                public void call() {
                        r2 = this;
                        rx.b$g$a r0 = r2.b     // Catch: java.lang.Throwable -> L11
                        rx.d r0 = r0.c     // Catch: java.lang.Throwable -> L11
                        java.lang.Throwable r1 = r2.a     // Catch: java.lang.Throwable -> L11
                        r0.onError(r1)     // Catch: java.lang.Throwable -> L11
                        rx.b$g$a r0 = r2.b
                        rx.h$a r0 = r0.b
                        r0.unsubscribe()
                        return
                    L11:
                        r0 = move-exception
                        rx.b$g$a r1 = r2.b
                        rx.h$a r1 = r1.b
                        r1.unsubscribe()
                        throw r0
                }
            }

            a(rx.b.g r1, rx.subscriptions.b r2, rx.h.a r3, rx.d r4) {
                    r0 = this;
                    r0.d = r1
                    r0.a = r2
                    r0.b = r3
                    r0.c = r4
                    r0.<init>()
                    return
            }

            @Override // rx.d
            public void a(rx.m r2) {
                    r1 = this;
                    rx.subscriptions.b r0 = r1.a
                    r0.a(r2)
                    rx.d r2 = r1.c
                    rx.subscriptions.b r0 = r1.a
                    r2.a(r0)
                    return
            }

            @Override // rx.d
            public void onCompleted() {
                    r6 = this;
                    rx.subscriptions.b r0 = r6.a
                    rx.h$a r1 = r6.b
                    rx.b$g$a$a r2 = new rx.b$g$a$a
                    r2.<init>(r6)
                    rx.b$g r3 = r6.d
                    long r4 = r3.b
                    java.util.concurrent.TimeUnit r3 = r3.c
                    rx.m r1 = r1.e(r2, r4, r3)
                    r0.a(r1)
                    return
            }

            @Override // rx.d
            public void onError(java.lang.Throwable r6) {
                    r5 = this;
                    rx.b$g r0 = r5.d
                    boolean r0 = r0.d
                    if (r0 == 0) goto L1d
                    rx.subscriptions.b r0 = r5.a
                    rx.h$a r1 = r5.b
                    rx.b$g$a$b r2 = new rx.b$g$a$b
                    r2.<init>(r5, r6)
                    rx.b$g r6 = r5.d
                    long r3 = r6.b
                    java.util.concurrent.TimeUnit r6 = r6.c
                    rx.m r6 = r1.e(r2, r3, r6)
                    r0.a(r6)
                    return
                L1d:
                    rx.d r0 = r5.c
                    r0.onError(r6)
                    return
            }
        }

        g(rx.b r1, rx.h r2, long r3, java.util.concurrent.TimeUnit r5, boolean r6) {
                r0 = this;
                r0.e = r1
                r0.a = r2
                r0.b = r3
                r0.c = r5
                r0.d = r6
                r0.<init>()
                return
        }

        @Override // rx.functions.b
        public /* bridge */ /* synthetic */ void call(rx.d r1) {
                r0 = this;
                rx.d r1 = (rx.d) r1
                r0.call2(r1)
                return
        }

        /* renamed from: call, reason: avoid collision after fix types in other method */
        public void call2(rx.d r5) {
                r4 = this;
                rx.subscriptions.b r0 = new rx.subscriptions.b
                r0.<init>()
                rx.h r1 = r4.a
                rx.h$a r1 = r1.a()
                r0.a(r1)
                rx.b r2 = r4.e
                rx.b$g$a r3 = new rx.b$g$a
                r3.<init>(r4, r0, r1, r5)
                r2.G0(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class g0 implements rx.b.j0 {
        final /* synthetic */ java.lang.Throwable a;

        g0(java.lang.Throwable r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // rx.functions.b
        public /* bridge */ /* synthetic */ void call(rx.d r1) {
                r0 = this;
                rx.d r1 = (rx.d) r1
                r0.call2(r1)
                return
        }

        /* renamed from: call, reason: avoid collision after fix types in other method */
        public void call2(rx.d r2) {
                r1 = this;
                rx.m r0 = rx.subscriptions.f.e()
                r2.a(r0)
                java.lang.Throwable r0 = r1.a
                r2.onError(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class h implements rx.functions.b<java.lang.Throwable> {
        final /* synthetic */ rx.functions.b a;
        final /* synthetic */ rx.b b;

        h(rx.b r1, rx.functions.b r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // rx.functions.b
        public /* bridge */ /* synthetic */ void call(java.lang.Throwable r1) {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r0.call2(r1)
                return
        }

        /* renamed from: call, reason: avoid collision after fix types in other method */
        public void call2(java.lang.Throwable r2) {
                r1 = this;
                rx.functions.b r0 = r1.a
                rx.Notification r2 = rx.Notification.d(r2)
                r0.call(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class h0 implements rx.b.j0 {
        final /* synthetic */ rx.functions.a a;

        h0(rx.functions.a r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // rx.functions.b
        public /* bridge */ /* synthetic */ void call(rx.d r1) {
                r0 = this;
                rx.d r1 = (rx.d) r1
                r0.call2(r1)
                return
        }

        /* renamed from: call, reason: avoid collision after fix types in other method */
        public void call2(rx.d r3) {
                r2 = this;
                rx.subscriptions.a r0 = new rx.subscriptions.a
                r0.<init>()
                r3.a(r0)
                rx.functions.a r1 = r2.a     // Catch: java.lang.Throwable -> L17
                r1.call()     // Catch: java.lang.Throwable -> L17
                boolean r0 = r0.isUnsubscribed()
                if (r0 != 0) goto L21
                r3.onCompleted()
                return
            L17:
                r1 = move-exception
                boolean r0 = r0.isUnsubscribed()
                if (r0 != 0) goto L21
                r3.onError(r1)
            L21:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class i implements rx.functions.a {
        final /* synthetic */ rx.functions.b a;
        final /* synthetic */ rx.b b;

        i(rx.b r1, rx.functions.b r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // rx.functions.a
        public void call() {
                r2 = this;
                rx.functions.b r0 = r2.a
                rx.Notification r1 = rx.Notification.b()
                r0.call(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class i0 implements rx.b.j0 {
        final /* synthetic */ java.util.concurrent.Callable a;

        i0(java.util.concurrent.Callable r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // rx.functions.b
        public /* bridge */ /* synthetic */ void call(rx.d r1) {
                r0 = this;
                rx.d r1 = (rx.d) r1
                r0.call2(r1)
                return
        }

        /* renamed from: call, reason: avoid collision after fix types in other method */
        public void call2(rx.d r3) {
                r2 = this;
                rx.subscriptions.a r0 = new rx.subscriptions.a
                r0.<init>()
                r3.a(r0)
                java.util.concurrent.Callable r1 = r2.a     // Catch: java.lang.Throwable -> L17
                r1.call()     // Catch: java.lang.Throwable -> L17
                boolean r0 = r0.isUnsubscribed()
                if (r0 != 0) goto L21
                r3.onCompleted()
                return
            L17:
                r1 = move-exception
                boolean r0 = r0.isUnsubscribed()
                if (r0 != 0) goto L21
                r3.onError(r1)
            L21:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class j implements rx.b.j0 {
        final /* synthetic */ rx.functions.a a;
        final /* synthetic */ rx.functions.a b;
        final /* synthetic */ rx.functions.b c;
        final /* synthetic */ rx.functions.b d;
        final /* synthetic */ rx.functions.a e;
        final /* synthetic */ rx.b f;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements rx.d {
            final /* synthetic */ rx.d a;
            final /* synthetic */ rx.b.j b;

            /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
            /* renamed from: rx.b$j$a$a, reason: collision with other inner class name */
            class C0107a implements rx.functions.a {
                final /* synthetic */ rx.m a;
                final /* synthetic */ rx.b.j.a b;

                C0107a(rx.b.j.a r1, rx.m r2) {
                        r0 = this;
                        r0.b = r1
                        r0.a = r2
                        r0.<init>()
                        return
                }

                @Override // rx.functions.a
                public void call() {
                        r1 = this;
                        rx.b$j$a r0 = r1.b     // Catch: java.lang.Throwable -> La
                        rx.b$j r0 = r0.b     // Catch: java.lang.Throwable -> La
                        rx.functions.a r0 = r0.e     // Catch: java.lang.Throwable -> La
                        r0.call()     // Catch: java.lang.Throwable -> La
                        goto Le
                    La:
                        r0 = move-exception
                        rx.plugins.c.I(r0)
                    Le:
                        rx.m r0 = r1.a
                        r0.unsubscribe()
                        return
                }
            }

            a(rx.b.j r1, rx.d r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            @Override // rx.d
            public void a(rx.m r3) {
                    r2 = this;
                    rx.b$j r0 = r2.b     // Catch: java.lang.Throwable -> L16
                    rx.functions.b r0 = r0.d     // Catch: java.lang.Throwable -> L16
                    r0.call(r3)     // Catch: java.lang.Throwable -> L16
                    rx.d r0 = r2.a
                    rx.b$j$a$a r1 = new rx.b$j$a$a
                    r1.<init>(r2, r3)
                    rx.m r3 = rx.subscriptions.f.a(r1)
                    r0.a(r3)
                    return
                L16:
                    r0 = move-exception
                    r3.unsubscribe()
                    rx.d r3 = r2.a
                    rx.m r1 = rx.subscriptions.f.e()
                    r3.a(r1)
                    rx.d r3 = r2.a
                    r3.onError(r0)
                    return
            }

            @Override // rx.d
            public void onCompleted() {
                    r2 = this;
                    rx.b$j r0 = r2.b     // Catch: java.lang.Throwable -> L19
                    rx.functions.a r0 = r0.a     // Catch: java.lang.Throwable -> L19
                    r0.call()     // Catch: java.lang.Throwable -> L19
                    rx.d r0 = r2.a
                    r0.onCompleted()
                    rx.b$j r0 = r2.b     // Catch: java.lang.Throwable -> L14
                    rx.functions.a r0 = r0.b     // Catch: java.lang.Throwable -> L14
                    r0.call()     // Catch: java.lang.Throwable -> L14
                    return
                L14:
                    r0 = move-exception
                    rx.plugins.c.I(r0)
                    return
                L19:
                    r0 = move-exception
                    rx.d r1 = r2.a
                    r1.onError(r0)
                    return
            }

            @Override // rx.d
            public void onError(java.lang.Throwable r5) {
                    r4 = this;
                    rx.b$j r0 = r4.b     // Catch: java.lang.Throwable -> L8
                    rx.functions.b r0 = r0.c     // Catch: java.lang.Throwable -> L8
                    r0.call(r5)     // Catch: java.lang.Throwable -> L8
                    goto L1c
                L8:
                    r0 = move-exception
                    rx.exceptions.CompositeException r1 = new rx.exceptions.CompositeException
                    r2 = 2
                    java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
                    r3 = 0
                    r2[r3] = r5
                    r5 = 1
                    r2[r5] = r0
                    java.util.List r5 = java.util.Arrays.asList(r2)
                    r1.<init>(r5)
                    r5 = r1
                L1c:
                    rx.d r0 = r4.a
                    r0.onError(r5)
                    rx.b$j r5 = r4.b     // Catch: java.lang.Throwable -> L29
                    rx.functions.a r5 = r5.b     // Catch: java.lang.Throwable -> L29
                    r5.call()     // Catch: java.lang.Throwable -> L29
                    goto L2d
                L29:
                    r5 = move-exception
                    rx.plugins.c.I(r5)
                L2d:
                    return
            }
        }

        j(rx.b r1, rx.functions.a r2, rx.functions.a r3, rx.functions.b r4, rx.functions.b r5, rx.functions.a r6) {
                r0 = this;
                r0.f = r1
                r0.a = r2
                r0.b = r3
                r0.c = r4
                r0.d = r5
                r0.e = r6
                r0.<init>()
                return
        }

        @Override // rx.functions.b
        public /* bridge */ /* synthetic */ void call(rx.d r1) {
                r0 = this;
                rx.d r1 = (rx.d) r1
                r0.call2(r1)
                return
        }

        /* renamed from: call, reason: avoid collision after fix types in other method */
        public void call2(rx.d r3) {
                r2 = this;
                rx.b r0 = r2.f
                rx.b$j$a r1 = new rx.b$j$a
                r1.<init>(r2, r3)
                r0.G0(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface j0 extends rx.functions.b<rx.d> {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class k implements rx.b.j0 {
        k() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // rx.functions.b
        public /* bridge */ /* synthetic */ void call(rx.d r1) {
                r0 = this;
                rx.d r1 = (rx.d) r1
                r0.call2(r1)
                return
        }

        /* renamed from: call, reason: avoid collision after fix types in other method */
        public void call2(rx.d r2) {
                r1 = this;
                rx.m r0 = rx.subscriptions.f.e()
                r2.a(r0)
                r2.onCompleted()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface k0 extends rx.functions.p<rx.d, rx.d> {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class l implements rx.functions.b<java.lang.Throwable> {
        final /* synthetic */ rx.functions.a a;
        final /* synthetic */ rx.b b;

        l(rx.b r1, rx.functions.a r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // rx.functions.b
        public /* bridge */ /* synthetic */ void call(java.lang.Throwable r1) {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r0.call2(r1)
                return
        }

        /* renamed from: call, reason: avoid collision after fix types in other method */
        public void call2(java.lang.Throwable r1) {
                r0 = this;
                rx.functions.a r1 = r0.a
                r1.call()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface l0 extends rx.functions.p<rx.b, rx.b> {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class m implements rx.d {
        final /* synthetic */ java.util.concurrent.CountDownLatch a;
        final /* synthetic */ java.lang.Throwable[] b;
        final /* synthetic */ rx.b c;

        m(rx.b r1, java.util.concurrent.CountDownLatch r2, java.lang.Throwable[] r3) {
                r0 = this;
                r0.c = r1
                r0.a = r2
                r0.b = r3
                r0.<init>()
                return
        }

        @Override // rx.d
        public void a(rx.m r1) {
                r0 = this;
                return
        }

        @Override // rx.d
        public void onCompleted() {
                r1 = this;
                java.util.concurrent.CountDownLatch r0 = r1.a
                r0.countDown()
                return
        }

        @Override // rx.d
        public void onError(java.lang.Throwable r3) {
                r2 = this;
                java.lang.Throwable[] r0 = r2.b
                r1 = 0
                r0[r1] = r3
                java.util.concurrent.CountDownLatch r3 = r2.a
                r3.countDown()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class n implements rx.d {
        final /* synthetic */ java.util.concurrent.CountDownLatch a;
        final /* synthetic */ java.lang.Throwable[] b;
        final /* synthetic */ rx.b c;

        n(rx.b r1, java.util.concurrent.CountDownLatch r2, java.lang.Throwable[] r3) {
                r0 = this;
                r0.c = r1
                r0.a = r2
                r0.b = r3
                r0.<init>()
                return
        }

        @Override // rx.d
        public void a(rx.m r1) {
                r0 = this;
                return
        }

        @Override // rx.d
        public void onCompleted() {
                r1 = this;
                java.util.concurrent.CountDownLatch r0 = r1.a
                r0.countDown()
                return
        }

        @Override // rx.d
        public void onError(java.lang.Throwable r3) {
                r2 = this;
                java.lang.Throwable[] r0 = r2.b
                r1 = 0
                r0[r1] = r3
                java.util.concurrent.CountDownLatch r3 = r2.a
                r3.countDown()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class o implements rx.b.j0 {
        final /* synthetic */ rx.b.k0 a;
        final /* synthetic */ rx.b b;

        o(rx.b r1, rx.b.k0 r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // rx.functions.b
        public /* bridge */ /* synthetic */ void call(rx.d r1) {
                r0 = this;
                rx.d r1 = (rx.d) r1
                r0.call2(r1)
                return
        }

        /* renamed from: call, reason: avoid collision after fix types in other method */
        public void call2(rx.d r2) {
                r1 = this;
                rx.b$k0 r0 = r1.a     // Catch: java.lang.Throwable -> L12 java.lang.NullPointerException -> L14
                rx.b$k0 r0 = rx.plugins.c.C(r0)     // Catch: java.lang.Throwable -> L12 java.lang.NullPointerException -> L14
                java.lang.Object r2 = r0.call(r2)     // Catch: java.lang.Throwable -> L12 java.lang.NullPointerException -> L14
                rx.d r2 = (rx.d) r2     // Catch: java.lang.Throwable -> L12 java.lang.NullPointerException -> L14
                rx.b r0 = r1.b     // Catch: java.lang.Throwable -> L12 java.lang.NullPointerException -> L14
                r0.G0(r2)     // Catch: java.lang.Throwable -> L12 java.lang.NullPointerException -> L14
                return
            L12:
                r2 = move-exception
                goto L16
            L14:
                r2 = move-exception
                goto L1b
            L16:
                java.lang.NullPointerException r2 = rx.b.C0(r2)
                throw r2
            L1b:
                throw r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class p implements rx.b.j0 {
        final /* synthetic */ rx.h a;
        final /* synthetic */ rx.b b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements rx.d {
            final /* synthetic */ rx.h.a a;
            final /* synthetic */ rx.d b;
            final /* synthetic */ rx.internal.util.m c;
            final /* synthetic */ rx.b.p d;

            /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
            /* renamed from: rx.b$p$a$a, reason: collision with other inner class name */
            class C0108a implements rx.functions.a {
                final /* synthetic */ rx.b.p.a a;

                C0108a(rx.b.p.a r1) {
                        r0 = this;
                        r0.a = r1
                        r0.<init>()
                        return
                }

                @Override // rx.functions.a
                public void call() {
                        r2 = this;
                        rx.b$p$a r0 = r2.a     // Catch: java.lang.Throwable -> Lf
                        rx.d r0 = r0.b     // Catch: java.lang.Throwable -> Lf
                        r0.onCompleted()     // Catch: java.lang.Throwable -> Lf
                        rx.b$p$a r0 = r2.a
                        rx.internal.util.m r0 = r0.c
                        r0.unsubscribe()
                        return
                    Lf:
                        r0 = move-exception
                        rx.b$p$a r1 = r2.a
                        rx.internal.util.m r1 = r1.c
                        r1.unsubscribe()
                        throw r0
                }
            }

            /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
            /* renamed from: rx.b$p$a$b, reason: collision with other inner class name */
            class C0109b implements rx.functions.a {
                final /* synthetic */ java.lang.Throwable a;
                final /* synthetic */ rx.b.p.a b;

                C0109b(rx.b.p.a r1, java.lang.Throwable r2) {
                        r0 = this;
                        r0.b = r1
                        r0.a = r2
                        r0.<init>()
                        return
                }

                @Override // rx.functions.a
                public void call() {
                        r2 = this;
                        rx.b$p$a r0 = r2.b     // Catch: java.lang.Throwable -> L11
                        rx.d r0 = r0.b     // Catch: java.lang.Throwable -> L11
                        java.lang.Throwable r1 = r2.a     // Catch: java.lang.Throwable -> L11
                        r0.onError(r1)     // Catch: java.lang.Throwable -> L11
                        rx.b$p$a r0 = r2.b
                        rx.internal.util.m r0 = r0.c
                        r0.unsubscribe()
                        return
                    L11:
                        r0 = move-exception
                        rx.b$p$a r1 = r2.b
                        rx.internal.util.m r1 = r1.c
                        r1.unsubscribe()
                        throw r0
                }
            }

            a(rx.b.p r1, rx.h.a r2, rx.d r3, rx.internal.util.m r4) {
                    r0 = this;
                    r0.d = r1
                    r0.a = r2
                    r0.b = r3
                    r0.c = r4
                    r0.<init>()
                    return
            }

            @Override // rx.d
            public void a(rx.m r2) {
                    r1 = this;
                    rx.internal.util.m r0 = r1.c
                    r0.a(r2)
                    return
            }

            @Override // rx.d
            public void onCompleted() {
                    r2 = this;
                    rx.h$a r0 = r2.a
                    rx.b$p$a$a r1 = new rx.b$p$a$a
                    r1.<init>(r2)
                    r0.d(r1)
                    return
            }

            @Override // rx.d
            public void onError(java.lang.Throwable r3) {
                    r2 = this;
                    rx.h$a r0 = r2.a
                    rx.b$p$a$b r1 = new rx.b$p$a$b
                    r1.<init>(r2, r3)
                    r0.d(r1)
                    return
            }
        }

        p(rx.b r1, rx.h r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // rx.functions.b
        public /* bridge */ /* synthetic */ void call(rx.d r1) {
                r0 = this;
                rx.d r1 = (rx.d) r1
                r0.call2(r1)
                return
        }

        /* renamed from: call, reason: avoid collision after fix types in other method */
        public void call2(rx.d r5) {
                r4 = this;
                rx.internal.util.m r0 = new rx.internal.util.m
                r0.<init>()
                rx.h r1 = r4.a
                rx.h$a r1 = r1.a()
                r0.a(r1)
                r5.a(r0)
                rx.b r2 = r4.b
                rx.b$p$a r3 = new rx.b$p$a
                r3.<init>(r4, r1, r5, r0)
                r2.G0(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class q implements rx.b.j0 {
        final /* synthetic */ rx.functions.p a;
        final /* synthetic */ rx.b b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements rx.d {
            final /* synthetic */ rx.d a;
            final /* synthetic */ rx.b.q b;

            a(rx.b.q r1, rx.d r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            @Override // rx.d
            public void a(rx.m r2) {
                    r1 = this;
                    rx.d r0 = r1.a
                    r0.a(r2)
                    return
            }

            @Override // rx.d
            public void onCompleted() {
                    r1 = this;
                    rx.d r0 = r1.a
                    r0.onCompleted()
                    return
            }

            @Override // rx.d
            public void onError(java.lang.Throwable r5) {
                    r4 = this;
                    rx.b$q r0 = r4.b     // Catch: java.lang.Throwable -> Lf
                    rx.functions.p r0 = r0.a     // Catch: java.lang.Throwable -> Lf
                    java.lang.Object r0 = r0.call(r5)     // Catch: java.lang.Throwable -> Lf
                    java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> Lf
                    boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> Lf
                    goto L27
                Lf:
                    r0 = move-exception
                    rx.exceptions.a.e(r0)
                    rx.exceptions.CompositeException r1 = new rx.exceptions.CompositeException
                    r2 = 2
                    java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
                    r3 = 0
                    r2[r3] = r5
                    r5 = 1
                    r2[r5] = r0
                    java.util.List r5 = java.util.Arrays.asList(r2)
                    r1.<init>(r5)
                    r5 = r1
                    r0 = 0
                L27:
                    if (r0 == 0) goto L2f
                    rx.d r5 = r4.a
                    r5.onCompleted()
                    goto L34
                L2f:
                    rx.d r0 = r4.a
                    r0.onError(r5)
                L34:
                    return
            }
        }

        q(rx.b r1, rx.functions.p r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // rx.functions.b
        public /* bridge */ /* synthetic */ void call(rx.d r1) {
                r0 = this;
                rx.d r1 = (rx.d) r1
                r0.call2(r1)
                return
        }

        /* renamed from: call, reason: avoid collision after fix types in other method */
        public void call2(rx.d r3) {
                r2 = this;
                rx.b r0 = r2.b
                rx.b$q$a r1 = new rx.b$q$a
                r1.<init>(r2, r3)
                r0.G0(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class r implements rx.b.j0 {
        final /* synthetic */ rx.functions.p a;
        final /* synthetic */ rx.b b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements rx.d {
            final /* synthetic */ rx.d a;
            final /* synthetic */ rx.subscriptions.e b;
            final /* synthetic */ rx.b.r c;

            /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
            /* renamed from: rx.b$r$a$a, reason: collision with other inner class name */
            class C0110a implements rx.d {
                final /* synthetic */ rx.b.r.a a;

                C0110a(rx.b.r.a r1) {
                        r0 = this;
                        r0.a = r1
                        r0.<init>()
                        return
                }

                @Override // rx.d
                public void a(rx.m r2) {
                        r1 = this;
                        rx.b$r$a r0 = r1.a
                        rx.subscriptions.e r0 = r0.b
                        r0.b(r2)
                        return
                }

                @Override // rx.d
                public void onCompleted() {
                        r1 = this;
                        rx.b$r$a r0 = r1.a
                        rx.d r0 = r0.a
                        r0.onCompleted()
                        return
                }

                @Override // rx.d
                public void onError(java.lang.Throwable r2) {
                        r1 = this;
                        rx.b$r$a r0 = r1.a
                        rx.d r0 = r0.a
                        r0.onError(r2)
                        return
                }
            }

            a(rx.b.r r1, rx.d r2, rx.subscriptions.e r3) {
                    r0 = this;
                    r0.c = r1
                    r0.a = r2
                    r0.b = r3
                    r0.<init>()
                    return
            }

            @Override // rx.d
            public void a(rx.m r2) {
                    r1 = this;
                    rx.subscriptions.e r0 = r1.b
                    r0.b(r2)
                    return
            }

            @Override // rx.d
            public void onCompleted() {
                    r1 = this;
                    rx.d r0 = r1.a
                    r0.onCompleted()
                    return
            }

            @Override // rx.d
            public void onError(java.lang.Throwable r6) {
                    r5 = this;
                    r0 = 1
                    r1 = 0
                    r2 = 2
                    rx.b$r r3 = r5.c     // Catch: java.lang.Throwable -> L34
                    rx.functions.p r3 = r3.a     // Catch: java.lang.Throwable -> L34
                    java.lang.Object r3 = r3.call(r6)     // Catch: java.lang.Throwable -> L34
                    rx.b r3 = (rx.b) r3     // Catch: java.lang.Throwable -> L34
                    if (r3 != 0) goto L2b
                    java.lang.NullPointerException r3 = new java.lang.NullPointerException
                    java.lang.String r4 = "The completable returned is null"
                    r3.<init>(r4)
                    rx.exceptions.CompositeException r4 = new rx.exceptions.CompositeException
                    java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
                    r2[r1] = r6
                    r2[r0] = r3
                    java.util.List r6 = java.util.Arrays.asList(r2)
                    r4.<init>(r6)
                    rx.d r6 = r5.a
                    r6.onError(r4)
                    return
                L2b:
                    rx.b$r$a$a r6 = new rx.b$r$a$a
                    r6.<init>(r5)
                    r3.G0(r6)
                    return
                L34:
                    r3 = move-exception
                    rx.exceptions.CompositeException r4 = new rx.exceptions.CompositeException
                    java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
                    r2[r1] = r6
                    r2[r0] = r3
                    java.util.List r6 = java.util.Arrays.asList(r2)
                    r4.<init>(r6)
                    rx.d r6 = r5.a
                    r6.onError(r4)
                    return
            }
        }

        r(rx.b r1, rx.functions.p r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // rx.functions.b
        public /* bridge */ /* synthetic */ void call(rx.d r1) {
                r0 = this;
                rx.d r1 = (rx.d) r1
                r0.call2(r1)
                return
        }

        /* renamed from: call, reason: avoid collision after fix types in other method */
        public void call2(rx.d r4) {
                r3 = this;
                rx.subscriptions.e r0 = new rx.subscriptions.e
                r0.<init>()
                r4.a(r0)
                rx.b r1 = r3.b
                rx.b$r$a r2 = new rx.b$r$a
                r2.<init>(r3, r4, r0)
                r1.G0(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class s implements rx.d {
        final /* synthetic */ rx.subscriptions.c a;
        final /* synthetic */ rx.b b;

        s(rx.b r1, rx.subscriptions.c r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // rx.d
        public void a(rx.m r2) {
                r1 = this;
                rx.subscriptions.c r0 = r1.a
                r0.b(r2)
                return
        }

        @Override // rx.d
        public void onCompleted() {
                r1 = this;
                rx.subscriptions.c r0 = r1.a
                r0.unsubscribe()
                return
        }

        @Override // rx.d
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.plugins.c.I(r2)
                rx.subscriptions.c r0 = r1.a
                r0.unsubscribe()
                rx.b.u(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class t implements rx.d {
        boolean a;
        final /* synthetic */ rx.functions.a b;
        final /* synthetic */ rx.subscriptions.c c;
        final /* synthetic */ rx.b d;

        t(rx.b r1, rx.functions.a r2, rx.subscriptions.c r3) {
                r0 = this;
                r0.d = r1
                r0.b = r2
                r0.c = r3
                r0.<init>()
                return
        }

        @Override // rx.d
        public void a(rx.m r2) {
                r1 = this;
                rx.subscriptions.c r0 = r1.c
                r0.b(r2)
                return
        }

        @Override // rx.d
        public void onCompleted() {
                r2 = this;
                boolean r0 = r2.a
                if (r0 != 0) goto L21
                r0 = 1
                r2.a = r0
                rx.functions.a r0 = r2.b     // Catch: java.lang.Throwable -> L12
                r0.call()     // Catch: java.lang.Throwable -> L12
            Lc:
                rx.subscriptions.c r0 = r2.c
                r0.unsubscribe()
                return
            L12:
                r0 = move-exception
                rx.plugins.c.I(r0)     // Catch: java.lang.Throwable -> L1a
                rx.b.u(r0)     // Catch: java.lang.Throwable -> L1a
                goto Lc
            L1a:
                r0 = move-exception
                rx.subscriptions.c r1 = r2.c
                r1.unsubscribe()
                throw r0
            L21:
                return
        }

        @Override // rx.d
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.plugins.c.I(r2)
                rx.subscriptions.c r0 = r1.c
                r0.unsubscribe()
                rx.b.u(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class u implements rx.d {
        boolean a;
        final /* synthetic */ rx.functions.a b;
        final /* synthetic */ rx.subscriptions.c c;
        final /* synthetic */ rx.functions.b d;
        final /* synthetic */ rx.b e;

        u(rx.b r1, rx.functions.a r2, rx.subscriptions.c r3, rx.functions.b r4) {
                r0 = this;
                r0.e = r1
                r0.b = r2
                r0.c = r3
                r0.d = r4
                r0.<init>()
                return
        }

        @Override // rx.d
        public void a(rx.m r2) {
                r1 = this;
                rx.subscriptions.c r0 = r1.c
                r0.b(r2)
                return
        }

        void b(java.lang.Throwable r5) {
                r4 = this;
                rx.functions.b r0 = r4.d     // Catch: java.lang.Throwable -> Lb
                r0.call(r5)     // Catch: java.lang.Throwable -> Lb
            L5:
                rx.subscriptions.c r5 = r4.c
                r5.unsubscribe()
                return
            Lb:
                r0 = move-exception
                rx.exceptions.CompositeException r1 = new rx.exceptions.CompositeException     // Catch: java.lang.Throwable -> L25
                r2 = 2
                java.lang.Throwable[] r2 = new java.lang.Throwable[r2]     // Catch: java.lang.Throwable -> L25
                r3 = 0
                r2[r3] = r5     // Catch: java.lang.Throwable -> L25
                r5 = 1
                r2[r5] = r0     // Catch: java.lang.Throwable -> L25
                java.util.List r5 = java.util.Arrays.asList(r2)     // Catch: java.lang.Throwable -> L25
                r1.<init>(r5)     // Catch: java.lang.Throwable -> L25
                rx.plugins.c.I(r1)     // Catch: java.lang.Throwable -> L25
                rx.b.u(r1)     // Catch: java.lang.Throwable -> L25
                goto L5
            L25:
                r5 = move-exception
                rx.subscriptions.c r0 = r4.c
                r0.unsubscribe()
                throw r5
        }

        @Override // rx.d
        public void onCompleted() {
                r1 = this;
                boolean r0 = r1.a
                if (r0 != 0) goto L16
                r0 = 1
                r1.a = r0
                rx.functions.a r0 = r1.b     // Catch: java.lang.Throwable -> L12
                r0.call()     // Catch: java.lang.Throwable -> L12
                rx.subscriptions.c r0 = r1.c
                r0.unsubscribe()
                return
            L12:
                r0 = move-exception
                r1.b(r0)
            L16:
                return
        }

        @Override // rx.d
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.a
                if (r0 != 0) goto Lb
                r0 = 1
                r1.a = r0
                r1.b(r2)
                return
            Lb:
                rx.plugins.c.I(r2)
                rx.b.u(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class v implements rx.b.j0 {
        v() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // rx.functions.b
        public /* bridge */ /* synthetic */ void call(rx.d r1) {
                r0 = this;
                rx.d r1 = (rx.d) r1
                r0.call2(r1)
                return
        }

        /* renamed from: call, reason: avoid collision after fix types in other method */
        public void call2(rx.d r2) {
                r1 = this;
                rx.m r0 = rx.subscriptions.f.e()
                r2.a(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class w implements rx.b.j0 {
        final /* synthetic */ rx.b[] a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements rx.d {
            final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean a;
            final /* synthetic */ rx.subscriptions.b b;
            final /* synthetic */ rx.d c;
            final /* synthetic */ rx.b.w d;

            a(rx.b.w r1, java.util.concurrent.atomic.AtomicBoolean r2, rx.subscriptions.b r3, rx.d r4) {
                    r0 = this;
                    r0.d = r1
                    r0.a = r2
                    r0.b = r3
                    r0.c = r4
                    r0.<init>()
                    return
            }

            @Override // rx.d
            public void a(rx.m r2) {
                    r1 = this;
                    rx.subscriptions.b r0 = r1.b
                    r0.a(r2)
                    return
            }

            @Override // rx.d
            public void onCompleted() {
                    r3 = this;
                    java.util.concurrent.atomic.AtomicBoolean r0 = r3.a
                    r1 = 0
                    r2 = 1
                    boolean r0 = r0.compareAndSet(r1, r2)
                    if (r0 == 0) goto L14
                    rx.subscriptions.b r0 = r3.b
                    r0.unsubscribe()
                    rx.d r0 = r3.c
                    r0.onCompleted()
                L14:
                    return
            }

            @Override // rx.d
            public void onError(java.lang.Throwable r4) {
                    r3 = this;
                    java.util.concurrent.atomic.AtomicBoolean r0 = r3.a
                    r1 = 0
                    r2 = 1
                    boolean r0 = r0.compareAndSet(r1, r2)
                    if (r0 == 0) goto L15
                    rx.subscriptions.b r0 = r3.b
                    r0.unsubscribe()
                    rx.d r0 = r3.c
                    r0.onError(r4)
                    return
                L15:
                    rx.plugins.c.I(r4)
                    return
            }
        }

        w(rx.b[] r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // rx.functions.b
        public /* bridge */ /* synthetic */ void call(rx.d r1) {
                r0 = this;
                rx.d r1 = (rx.d) r1
                r0.call2(r1)
                return
        }

        /* renamed from: call, reason: avoid collision after fix types in other method */
        public void call2(rx.d r10) {
                r9 = this;
                rx.subscriptions.b r0 = new rx.subscriptions.b
                r0.<init>()
                r10.a(r0)
                java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
                r1.<init>()
                rx.b$w$a r2 = new rx.b$w$a
                r2.<init>(r9, r1, r0, r10)
                rx.b[] r3 = r9.a
                int r4 = r3.length
                r5 = 0
                r6 = 0
            L17:
                if (r6 >= r4) goto L50
                r7 = r3[r6]
                boolean r8 = r0.isUnsubscribed()
                if (r8 == 0) goto L22
                goto L50
            L22:
                if (r7 != 0) goto L3d
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r3 = "One of the sources is null"
                r2.<init>(r3)
                r3 = 1
                boolean r1 = r1.compareAndSet(r5, r3)
                if (r1 == 0) goto L39
                r0.unsubscribe()
                r10.onError(r2)
                return
            L39:
                rx.plugins.c.I(r2)
                return
            L3d:
                boolean r8 = r1.get()
                if (r8 != 0) goto L50
                boolean r8 = r0.isUnsubscribed()
                if (r8 == 0) goto L4a
                goto L50
            L4a:
                r7.G0(r2)
                int r6 = r6 + 1
                goto L17
            L50:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class x implements rx.d {
        final /* synthetic */ rx.l a;
        final /* synthetic */ rx.b b;

        x(rx.b r1, rx.l r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // rx.d
        public void a(rx.m r2) {
                r1 = this;
                rx.l r0 = r1.a
                r0.add(r2)
                return
        }

        @Override // rx.d
        public void onCompleted() {
                r1 = this;
                rx.l r0 = r1.a
                r0.onCompleted()
                return
        }

        @Override // rx.d
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.l r0 = r1.a
                r0.onError(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class y implements rx.b.j0 {
        final /* synthetic */ rx.h a;
        final /* synthetic */ rx.b b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements rx.functions.a {
            final /* synthetic */ rx.d a;
            final /* synthetic */ rx.h.a b;
            final /* synthetic */ rx.b.y c;

            a(rx.b.y r1, rx.d r2, rx.h.a r3) {
                    r0 = this;
                    r0.c = r1
                    r0.a = r2
                    r0.b = r3
                    r0.<init>()
                    return
            }

            @Override // rx.functions.a
            public void call() {
                    r2 = this;
                    rx.b$y r0 = r2.c     // Catch: java.lang.Throwable -> Lf
                    rx.b r0 = r0.b     // Catch: java.lang.Throwable -> Lf
                    rx.d r1 = r2.a     // Catch: java.lang.Throwable -> Lf
                    r0.G0(r1)     // Catch: java.lang.Throwable -> Lf
                    rx.h$a r0 = r2.b
                    r0.unsubscribe()
                    return
                Lf:
                    r0 = move-exception
                    rx.h$a r1 = r2.b
                    r1.unsubscribe()
                    throw r0
            }
        }

        y(rx.b r1, rx.h r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // rx.functions.b
        public /* bridge */ /* synthetic */ void call(rx.d r1) {
                r0 = this;
                rx.d r1 = (rx.d) r1
                r0.call2(r1)
                return
        }

        /* renamed from: call, reason: avoid collision after fix types in other method */
        public void call2(rx.d r3) {
                r2 = this;
                rx.h r0 = r2.a
                rx.h$a r0 = r0.a()
                rx.b$y$a r1 = new rx.b$y$a
                r1.<init>(r2, r3, r0)
                r0.d(r1)
                return
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class z<T> implements rx.e.a<T> {
        final /* synthetic */ rx.b a;

        z(rx.b r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // rx.functions.b
        public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
                r0 = this;
                rx.l r1 = (rx.l) r1
                r0.call(r1)
                return
        }

        public void call(rx.l<? super T> r2) {
                r1 = this;
                rx.b r0 = r1.a
                r0.H0(r2)
                return
        }
    }

    static {
            rx.b r0 = new rx.b
            rx.b$k r1 = new rx.b$k
            r1.<init>()
            r2 = 0
            r0.<init>(r1, r2)
            rx.b.b = r0
            rx.b r0 = new rx.b
            rx.b$v r1 = new rx.b$v
            r1.<init>()
            r0.<init>(r1, r2)
            rx.b.c = r0
            return
    }

    protected b(rx.b.j0 r1) {
            r0 = this;
            r0.<init>()
            rx.b$j0 r1 = rx.plugins.c.F(r1)
            r0.a = r1
            return
    }

    protected b(rx.b.j0 r1, boolean r2) {
            r0 = this;
            r0.<init>()
            if (r2 == 0) goto L9
            rx.b$j0 r1 = rx.plugins.c.F(r1)
        L9:
            r0.a = r1
            return
    }

    public static rx.b A0(long r1, java.util.concurrent.TimeUnit r3, rx.h r4) {
            g0(r3)
            g0(r4)
            rx.b$c r0 = new rx.b$c
            r0.<init>(r4, r1, r3)
            rx.b r1 = p(r0)
            return r1
    }

    static java.lang.NullPointerException C0(java.lang.Throwable r2) {
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Actually not, but can't pass out an exception otherwise..."
            r0.<init>(r1)
            r0.initCause(r2)
            return r0
    }

    public static rx.b D(java.lang.Throwable r1) {
            g0(r1)
            rx.b$g0 r0 = new rx.b$g0
            r0.<init>(r1)
            rx.b r1 = p(r0)
            return r1
    }

    public static rx.b E(rx.functions.o<? extends java.lang.Throwable> r1) {
            g0(r1)
            rx.b$f0 r0 = new rx.b$f0
            r0.<init>(r1)
            rx.b r1 = p(r0)
            return r1
    }

    public static rx.b F(rx.functions.a r1) {
            g0(r1)
            rx.b$h0 r0 = new rx.b$h0
            r0.<init>(r1)
            rx.b r1 = p(r0)
            return r1
    }

    public static rx.b G(java.util.concurrent.Callable<?> r1) {
            g0(r1)
            rx.b$i0 r0 = new rx.b$i0
            r0.<init>(r1)
            rx.b r1 = p(r0)
            return r1
    }

    public static rx.b H(rx.functions.b<rx.c> r1) {
            rx.internal.operators.j r0 = new rx.internal.operators.j
            r0.<init>(r1)
            rx.b r1 = p(r0)
            return r1
    }

    public static rx.b I(java.util.concurrent.Future<?> r0) {
            g0(r0)
            rx.e r0 = rx.e.v2(r0)
            rx.b r0 = J(r0)
            return r0
    }

    private <T> void I0(rx.l<T> r1, boolean r2) {
            r0 = this;
            g0(r1)
            if (r2 == 0) goto Ld
            r1.onStart()     // Catch: java.lang.Throwable -> L9 java.lang.NullPointerException -> Lb
            goto Ld
        L9:
            r1 = move-exception
            goto L19
        Lb:
            r1 = move-exception
            goto L28
        Ld:
            rx.b$x r2 = new rx.b$x     // Catch: java.lang.Throwable -> L9 java.lang.NullPointerException -> Lb
            r2.<init>(r0, r1)     // Catch: java.lang.Throwable -> L9 java.lang.NullPointerException -> Lb
            r0.G0(r2)     // Catch: java.lang.Throwable -> L9 java.lang.NullPointerException -> Lb
            rx.plugins.c.N(r1)     // Catch: java.lang.Throwable -> L9 java.lang.NullPointerException -> Lb
            return
        L19:
            rx.exceptions.a.e(r1)
            java.lang.Throwable r1 = rx.plugins.c.L(r1)
            rx.plugins.c.I(r1)
            java.lang.NullPointerException r1 = C0(r1)
            throw r1
        L28:
            throw r1
    }

    public static rx.b J(rx.e<?> r1) {
            g0(r1)
            rx.b$a r0 = new rx.b$a
            r0.<init>(r1)
            rx.b r1 = p(r0)
            return r1
    }

    public static rx.b K(rx.i<?> r1) {
            g0(r1)
            rx.b$b r0 = new rx.b$b
            r0.<init>(r1)
            rx.b r1 = p(r0)
            return r1
    }

    public static <R> rx.b K0(rx.functions.o<R> r1, rx.functions.p<? super R, ? extends rx.b> r2, rx.functions.b<? super R> r3) {
            r0 = 1
            rx.b r1 = L0(r1, r2, r3, r0)
            return r1
    }

    public static <R> rx.b L0(rx.functions.o<R> r1, rx.functions.p<? super R, ? extends rx.b> r2, rx.functions.b<? super R> r3, boolean r4) {
            g0(r1)
            g0(r2)
            g0(r3)
            rx.b$d r0 = new rx.b$d
            r0.<init>(r1, r2, r3, r4)
            rx.b r1 = p(r0)
            return r1
    }

    public static rx.b O(java.lang.Iterable<? extends rx.b> r1) {
            g0(r1)
            rx.internal.operators.r r0 = new rx.internal.operators.r
            r0.<init>(r1)
            rx.b r1 = p(r0)
            return r1
    }

    public static rx.b P(rx.e<? extends rx.b> r2) {
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1 = 0
            rx.b r2 = S(r2, r0, r1)
            return r2
    }

    public static rx.b Q(rx.e<? extends rx.b> r1, int r2) {
            r0 = 0
            rx.b r1 = S(r1, r2, r0)
            return r1
    }

    public static rx.b R(rx.b... r2) {
            g0(r2)
            int r0 = r2.length
            if (r0 != 0) goto Lb
            rx.b r2 = i()
            return r2
        Lb:
            int r0 = r2.length
            r1 = 1
            if (r0 != r1) goto L13
            r0 = 0
            r2 = r2[r0]
            return r2
        L13:
            rx.internal.operators.o r0 = new rx.internal.operators.o
            r0.<init>(r2)
            rx.b r2 = p(r0)
            return r2
    }

    protected static rx.b S(rx.e<? extends rx.b> r1, int r2, boolean r3) {
            g0(r1)
            r0 = 1
            if (r2 < r0) goto L10
            rx.internal.operators.n r0 = new rx.internal.operators.n
            r0.<init>(r1, r2, r3)
            rx.b r1 = p(r0)
            return r1
        L10:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "maxConcurrency > 0 required but it was "
            r3.append(r0)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
    }

    public static rx.b T(java.lang.Iterable<? extends rx.b> r1) {
            g0(r1)
            rx.internal.operators.q r0 = new rx.internal.operators.q
            r0.<init>(r1)
            rx.b r1 = p(r0)
            return r1
    }

    public static rx.b U(rx.e<? extends rx.b> r2) {
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1 = 1
            rx.b r2 = S(r2, r0, r1)
            return r2
    }

    public static rx.b V(rx.e<? extends rx.b> r1, int r2) {
            r0 = 1
            rx.b r1 = S(r1, r2, r0)
            return r1
    }

    public static rx.b W(rx.b... r1) {
            g0(r1)
            rx.internal.operators.p r0 = new rx.internal.operators.p
            r0.<init>(r1)
            rx.b r1 = p(r0)
            return r1
    }

    public static rx.b Y() {
            rx.b r0 = rx.b.c
            rx.b$j0 r1 = r0.a
            rx.b$j0 r1 = rx.plugins.c.F(r1)
            rx.b$j0 r2 = r0.a
            if (r1 != r2) goto Ld
            return r0
        Ld:
            rx.b r0 = new rx.b
            r2 = 0
            r0.<init>(r1, r2)
            return r0
    }

    public static rx.b a(java.lang.Iterable<? extends rx.b> r1) {
            g0(r1)
            rx.b$d0 r0 = new rx.b$d0
            r0.<init>(r1)
            rx.b r1 = p(r0)
            return r1
    }

    public static rx.b b(rx.b... r2) {
            g0(r2)
            int r0 = r2.length
            if (r0 != 0) goto Lb
            rx.b r2 = i()
            return r2
        Lb:
            int r0 = r2.length
            r1 = 1
            if (r0 != r1) goto L13
            r0 = 0
            r2 = r2[r0]
            return r2
        L13:
            rx.b$w r0 = new rx.b$w
            r0.<init>(r2)
            rx.b r2 = p(r0)
            return r2
    }

    static <T> T g0(T r0) {
            r0.getClass()
            return r0
    }

    public static rx.b i() {
            rx.b r0 = rx.b.b
            rx.b$j0 r1 = r0.a
            rx.b$j0 r1 = rx.plugins.c.F(r1)
            rx.b$j0 r2 = r0.a
            if (r1 != r2) goto Ld
            return r0
        Ld:
            rx.b r0 = new rx.b
            r2 = 0
            r0.<init>(r1, r2)
            return r0
    }

    public static rx.b k(java.lang.Iterable<? extends rx.b> r1) {
            g0(r1)
            rx.internal.operators.m r0 = new rx.internal.operators.m
            r0.<init>(r1)
            rx.b r1 = p(r0)
            return r1
    }

    public static rx.b l(rx.e<? extends rx.b> r1) {
            r0 = 2
            rx.b r1 = m(r1, r0)
            return r1
    }

    public static rx.b m(rx.e<? extends rx.b> r2, int r3) {
            g0(r2)
            r0 = 1
            if (r3 < r0) goto L10
            rx.internal.operators.k r0 = new rx.internal.operators.k
            r0.<init>(r2, r3)
            rx.b r2 = p(r0)
            return r2
        L10:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "prefetch > 0 required but it was "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    public static rx.b n(rx.b... r2) {
            g0(r2)
            int r0 = r2.length
            if (r0 != 0) goto Lb
            rx.b r2 = i()
            return r2
        Lb:
            int r0 = r2.length
            r1 = 1
            if (r0 != r1) goto L13
            r0 = 0
            r2 = r2[r0]
            return r2
        L13:
            rx.internal.operators.l r0 = new rx.internal.operators.l
            r0.<init>(r2)
            rx.b r2 = p(r0)
            return r2
    }

    public static rx.b p(rx.b.j0 r1) {
            g0(r1)
            rx.b r0 = new rx.b     // Catch: java.lang.Throwable -> L9 java.lang.NullPointerException -> L12
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L9 java.lang.NullPointerException -> L12
            return r0
        L9:
            r1 = move-exception
            rx.plugins.c.I(r1)
            java.lang.NullPointerException r1 = C0(r1)
            throw r1
        L12:
            r1 = move-exception
            throw r1
    }

    public static rx.b q(rx.functions.o<? extends rx.b> r1) {
            g0(r1)
            rx.b$e0 r0 = new rx.b$e0
            r0.<init>(r1)
            rx.b r1 = p(r0)
            return r1
    }

    static void u(java.lang.Throwable r2) {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r1 = r0.getUncaughtExceptionHandler()
            r1.uncaughtException(r0, r2)
            return
    }

    public static rx.b z0(long r1, java.util.concurrent.TimeUnit r3) {
            rx.h r0 = rx.schedulers.c.a()
            rx.b r1 = A0(r1, r3, r0)
            return r1
    }

    public final rx.b A(rx.functions.b<? super rx.m> r7) {
            r6 = this;
            rx.functions.m$m r2 = rx.functions.m.a()
            rx.functions.m$m r3 = rx.functions.m.a()
            rx.functions.m$m r4 = rx.functions.m.a()
            rx.functions.m$m r5 = rx.functions.m.a()
            r0 = r6
            r1 = r7
            rx.b r7 = r0.z(r1, r2, r3, r4, r5)
            return r7
    }

    public final rx.b B(rx.functions.a r7) {
            r6 = this;
            rx.functions.m$m r1 = rx.functions.m.a()
            rx.b$l r2 = new rx.b$l
            r2.<init>(r6, r7)
            rx.functions.m$m r4 = rx.functions.m.a()
            rx.functions.m$m r5 = rx.functions.m.a()
            r0 = r6
            r3 = r7
            rx.b r7 = r0.z(r1, r2, r3, r4, r5)
            return r7
    }

    public final <R> R B0(rx.functions.p<? super rx.b, R> r1) {
            r0 = this;
            java.lang.Object r1 = r1.call(r0)
            return r1
    }

    public final rx.b C(rx.functions.a r7) {
            r6 = this;
            rx.functions.m$m r1 = rx.functions.m.a()
            rx.functions.m$m r2 = rx.functions.m.a()
            rx.functions.m$m r3 = rx.functions.m.a()
            rx.functions.m$m r4 = rx.functions.m.a()
            r0 = r6
            r5 = r7
            rx.b r7 = r0.z(r1, r2, r3, r4, r5)
            return r7
    }

    public final <T> rx.e<T> D0() {
            r1 = this;
            rx.b$z r0 = new rx.b$z
            r0.<init>(r1)
            rx.e r0 = rx.e.I6(r0)
            return r0
    }

    public final <T> rx.i<T> E0(rx.functions.o<? extends T> r2) {
            r1 = this;
            g0(r2)
            rx.b$a0 r0 = new rx.b$a0
            r0.<init>(r1, r2)
            rx.i r2 = rx.i.n(r0)
            return r2
    }

    public final <T> rx.i<T> F0(T r2) {
            r1 = this;
            g0(r2)
            rx.b$b0 r0 = new rx.b$b0
            r0.<init>(r1, r2)
            rx.i r2 = r1.E0(r0)
            return r2
    }

    public final void G0(rx.d r2) {
            r1 = this;
            g0(r2)
            rx.b$j0 r0 = r1.a     // Catch: java.lang.Throwable -> Ld java.lang.NullPointerException -> Lf
            rx.b$j0 r0 = rx.plugins.c.D(r1, r0)     // Catch: java.lang.Throwable -> Ld java.lang.NullPointerException -> Lf
            r0.call(r2)     // Catch: java.lang.Throwable -> Ld java.lang.NullPointerException -> Lf
            return
        Ld:
            r2 = move-exception
            goto L11
        Lf:
            r2 = move-exception
            goto L20
        L11:
            rx.exceptions.a.e(r2)
            java.lang.Throwable r2 = rx.plugins.c.B(r2)
            rx.plugins.c.I(r2)
            java.lang.NullPointerException r2 = C0(r2)
            throw r2
        L20:
            throw r2
    }

    public final <T> void H0(rx.l<T> r2) {
            r1 = this;
            r0 = 1
            r1.I0(r2, r0)
            return
    }

    public final rx.b J0(rx.h r2) {
            r1 = this;
            g0(r2)
            rx.b$c0 r0 = new rx.b$c0
            r0.<init>(r1, r2)
            rx.b r2 = p(r0)
            return r2
    }

    public final java.lang.Throwable L() {
            r8 = this;
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r1 = 1
            r0.<init>(r1)
            java.lang.Throwable[] r1 = new java.lang.Throwable[r1]
            rx.b$m r2 = new rx.b$m
            r2.<init>(r8, r0, r1)
            r8.G0(r2)
            long r2 = r0.getCount()
            r4 = 0
            r6 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto L1e
            r0 = r1[r6]
            return r0
        L1e:
            r0.await()     // Catch: java.lang.InterruptedException -> L24
            r0 = r1[r6]
            return r0
        L24:
            r0 = move-exception
            java.lang.RuntimeException r0 = rx.exceptions.a.c(r0)
            throw r0
    }

    public final java.lang.Throwable M(long r9, java.util.concurrent.TimeUnit r11) {
            r8 = this;
            g0(r11)
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r1 = 1
            r0.<init>(r1)
            java.lang.Throwable[] r1 = new java.lang.Throwable[r1]
            rx.b$n r2 = new rx.b$n
            r2.<init>(r8, r0, r1)
            r8.G0(r2)
            long r2 = r0.getCount()
            r4 = 0
            r6 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto L21
            r9 = r1[r6]
            return r9
        L21:
            boolean r9 = r0.await(r9, r11)     // Catch: java.lang.InterruptedException -> L34
            if (r9 == 0) goto L2a
            r9 = r1[r6]
            return r9
        L2a:
            java.util.concurrent.TimeoutException r9 = new java.util.concurrent.TimeoutException
            r9.<init>()
            rx.exceptions.a.c(r9)
            r9 = 0
            return r9
        L34:
            r9 = move-exception
            java.lang.RuntimeException r9 = rx.exceptions.a.c(r9)
            throw r9
    }

    public final rx.b N(rx.b.k0 r2) {
            r1 = this;
            g0(r2)
            rx.b$o r0 = new rx.b$o
            r0.<init>(r1, r2)
            rx.b r2 = p(r0)
            return r2
    }

    public final rx.b X(rx.b r3) {
            r2 = this;
            g0(r3)
            r0 = 2
            rx.b[] r0 = new rx.b[r0]
            r1 = 0
            r0[r1] = r2
            r1 = 1
            r0[r1] = r3
            rx.b r3 = R(r0)
            return r3
    }

    public final rx.b Z(rx.h r2) {
            r1 = this;
            g0(r2)
            rx.b$p r0 = new rx.b$p
            r0.<init>(r1, r2)
            rx.b r2 = p(r0)
            return r2
    }

    public final rx.b a0() {
            r1 = this;
            rx.functions.p r0 = rx.internal.util.n.b()
            rx.b r0 = r1.b0(r0)
            return r0
    }

    public final rx.b b0(rx.functions.p<? super java.lang.Throwable, java.lang.Boolean> r2) {
            r1 = this;
            g0(r2)
            rx.b$q r0 = new rx.b$q
            r0.<init>(r1, r2)
            rx.b r2 = p(r0)
            return r2
    }

    public final rx.b c(rx.b r3) {
            r2 = this;
            g0(r3)
            r0 = 2
            rx.b[] r0 = new rx.b[r0]
            r1 = 0
            r0[r1] = r2
            r1 = 1
            r0[r1] = r3
            rx.b r3 = b(r0)
            return r3
    }

    public final rx.b c0(rx.functions.p<? super java.lang.Throwable, ? extends rx.b> r2) {
            r1 = this;
            g0(r2)
            rx.b$r r0 = new rx.b$r
            r0.<init>(r1, r2)
            rx.b r2 = p(r0)
            return r2
    }

    public final rx.b d(rx.b r1) {
            r0 = this;
            rx.b r1 = r0.o(r1)
            return r1
    }

    public final rx.b d0() {
            r1 = this;
            rx.e r0 = r1.D0()
            rx.e r0 = r0.g4()
            rx.b r0 = J(r0)
            return r0
    }

    public final <T> rx.e<T> e(rx.e<T> r2) {
            r1 = this;
            g0(r2)
            rx.e r0 = r1.D0()
            rx.e r2 = r2.y1(r0)
            return r2
    }

    public final rx.b e0(long r2) {
            r1 = this;
            rx.e r0 = r1.D0()
            rx.e r2 = r0.h4(r2)
            rx.b r2 = J(r2)
            return r2
    }

    public final <T> rx.i<T> f(rx.i<T> r2) {
            r1 = this;
            g0(r2)
            rx.e r0 = r1.D0()
            rx.i r2 = r2.r(r0)
            return r2
    }

    public final rx.b f0(rx.functions.p<? super rx.e<? extends java.lang.Void>, ? extends rx.e<?>> r2) {
            r1 = this;
            g0(r2)
            rx.e r0 = r1.D0()
            rx.e r2 = r0.k4(r2)
            rx.b r2 = J(r2)
            return r2
    }

    public final void g() {
            r8 = this;
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r1 = 1
            r0.<init>(r1)
            java.lang.Throwable[] r1 = new java.lang.Throwable[r1]
            rx.b$e r2 = new rx.b$e
            r2.<init>(r8, r0, r1)
            r8.G0(r2)
            long r2 = r0.getCount()
            r4 = 0
            r6 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto L23
            r0 = r1[r6]
            if (r0 == 0) goto L2d
            rx.exceptions.a.c(r0)
            return
        L23:
            r0.await()     // Catch: java.lang.InterruptedException -> L2e
            r0 = r1[r6]
            if (r0 == 0) goto L2d
            rx.exceptions.a.c(r0)
        L2d:
            return
        L2e:
            r0 = move-exception
            java.lang.RuntimeException r0 = rx.exceptions.a.c(r0)
            throw r0
    }

    public final boolean h(long r10, java.util.concurrent.TimeUnit r12) {
            r9 = this;
            g0(r12)
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r1 = 1
            r0.<init>(r1)
            java.lang.Throwable[] r2 = new java.lang.Throwable[r1]
            rx.b$f r3 = new rx.b$f
            r3.<init>(r9, r0, r2)
            r9.G0(r3)
            long r3 = r0.getCount()
            r5 = 0
            r7 = 0
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L26
            r10 = r2[r7]
            if (r10 == 0) goto L25
            rx.exceptions.a.c(r10)
        L25:
            return r1
        L26:
            boolean r10 = r0.await(r10, r12)     // Catch: java.lang.InterruptedException -> L34
            if (r10 == 0) goto L33
            r11 = r2[r7]
            if (r11 == 0) goto L33
            rx.exceptions.a.c(r11)
        L33:
            return r10
        L34:
            r10 = move-exception
            java.lang.RuntimeException r10 = rx.exceptions.a.c(r10)
            throw r10
    }

    public final rx.b h0() {
            r1 = this;
            rx.e r0 = r1.D0()
            rx.e r0 = r0.C4()
            rx.b r0 = J(r0)
            return r0
    }

    public final rx.b i0(long r2) {
            r1 = this;
            rx.e r0 = r1.D0()
            rx.e r2 = r0.D4(r2)
            rx.b r2 = J(r2)
            return r2
    }

    public final rx.b j(rx.b.l0 r1) {
            r0 = this;
            java.lang.Object r1 = r0.B0(r1)
            rx.b r1 = (rx.b) r1
            return r1
    }

    public final rx.b j0(rx.functions.q<java.lang.Integer, java.lang.Throwable, java.lang.Boolean> r2) {
            r1 = this;
            rx.e r0 = r1.D0()
            rx.e r2 = r0.E4(r2)
            rx.b r2 = J(r2)
            return r2
    }

    public final rx.b k0(rx.functions.p<? super rx.e<? extends java.lang.Throwable>, ? extends rx.e<?>> r2) {
            r1 = this;
            rx.e r0 = r1.D0()
            rx.e r2 = r0.F4(r2)
            rx.b r2 = J(r2)
            return r2
    }

    public final rx.b l0(rx.b r3) {
            r2 = this;
            g0(r3)
            r0 = 2
            rx.b[] r0 = new rx.b[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r2
            rx.b r3 = n(r0)
            return r3
    }

    public final <T> rx.e<T> m0(rx.e<T> r2) {
            r1 = this;
            g0(r2)
            rx.e r0 = r1.D0()
            rx.e r2 = r0.o5(r2)
            return r2
    }

    public final rx.m n0() {
            r2 = this;
            rx.subscriptions.c r0 = new rx.subscriptions.c
            r0.<init>()
            rx.b$s r1 = new rx.b$s
            r1.<init>(r2, r0)
            r2.G0(r1)
            return r0
    }

    public final rx.b o(rx.b r3) {
            r2 = this;
            g0(r3)
            r0 = 2
            rx.b[] r0 = new rx.b[r0]
            r1 = 0
            r0[r1] = r2
            r1 = 1
            r0[r1] = r3
            rx.b r3 = n(r0)
            return r3
    }

    public final rx.m o0(rx.functions.a r3) {
            r2 = this;
            g0(r3)
            rx.subscriptions.c r0 = new rx.subscriptions.c
            r0.<init>()
            rx.b$t r1 = new rx.b$t
            r1.<init>(r2, r3, r0)
            r2.G0(r1)
            return r0
    }

    public final rx.m p0(rx.functions.a r3, rx.functions.b<? super java.lang.Throwable> r4) {
            r2 = this;
            g0(r3)
            g0(r4)
            rx.subscriptions.c r0 = new rx.subscriptions.c
            r0.<init>()
            rx.b$u r1 = new rx.b$u
            r1.<init>(r2, r3, r0, r4)
            r2.G0(r1)
            return r0
    }

    public final void q0(rx.d r2) {
            r1 = this;
            boolean r0 = r2 instanceof rx.observers.d
            if (r0 != 0) goto La
            rx.observers.d r0 = new rx.observers.d
            r0.<init>(r2)
            r2 = r0
        La:
            r1.G0(r2)
            return
    }

    public final rx.b r(long r7, java.util.concurrent.TimeUnit r9) {
            r6 = this;
            rx.h r4 = rx.schedulers.c.a()
            r5 = 0
            r0 = r6
            r1 = r7
            r3 = r9
            rx.b r7 = r0.t(r1, r3, r4, r5)
            return r7
    }

    public final <T> void r0(rx.l<T> r2) {
            r1 = this;
            r2.onStart()
            boolean r0 = r2 instanceof rx.observers.e
            if (r0 != 0) goto Ld
            rx.observers.e r0 = new rx.observers.e
            r0.<init>(r2)
            r2 = r0
        Ld:
            r0 = 0
            r1.I0(r2, r0)
            return
    }

    public final rx.b s(long r7, java.util.concurrent.TimeUnit r9, rx.h r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r3 = r9
            r4 = r10
            rx.b r7 = r0.t(r1, r3, r4, r5)
            return r7
    }

    public final rx.b s0(rx.h r2) {
            r1 = this;
            g0(r2)
            rx.b$y r0 = new rx.b$y
            r0.<init>(r1, r2)
            rx.b r2 = p(r0)
            return r2
    }

    public final rx.b t(long r8, java.util.concurrent.TimeUnit r10, rx.h r11, boolean r12) {
            r7 = this;
            g0(r10)
            g0(r11)
            rx.b$g r0 = new rx.b$g
            r1 = r7
            r3 = r8
            r5 = r10
            r2 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r5, r6)
            rx.b r8 = p(r0)
            return r8
    }

    public final rx.observers.a<java.lang.Void> t0() {
            r2 = this;
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            k5.a r0 = k5.a.g(r0)
            r2.r0(r0)
            return r0
    }

    public final rx.b u0(long r7, java.util.concurrent.TimeUnit r9) {
            r6 = this;
            rx.h r4 = rx.schedulers.c.a()
            r5 = 0
            r0 = r6
            r1 = r7
            r3 = r9
            rx.b r7 = r0.y0(r1, r3, r4, r5)
            return r7
    }

    public final rx.b v(rx.functions.a r7) {
            r6 = this;
            rx.functions.m$m r1 = rx.functions.m.a()
            rx.functions.m$m r2 = rx.functions.m.a()
            rx.functions.m$m r3 = rx.functions.m.a()
            rx.functions.m$m r5 = rx.functions.m.a()
            r0 = r6
            r4 = r7
            rx.b r7 = r0.z(r1, r2, r3, r4, r5)
            return r7
    }

    public final rx.b v0(long r7, java.util.concurrent.TimeUnit r9, rx.b r10) {
            r6 = this;
            g0(r10)
            rx.h r4 = rx.schedulers.c.a()
            r0 = r6
            r1 = r7
            r3 = r9
            r5 = r10
            rx.b r7 = r0.y0(r1, r3, r4, r5)
            return r7
    }

    public final rx.b w(rx.functions.a r7) {
            r6 = this;
            rx.functions.m$m r1 = rx.functions.m.a()
            rx.functions.m$m r2 = rx.functions.m.a()
            rx.functions.m$m r4 = rx.functions.m.a()
            rx.functions.m$m r5 = rx.functions.m.a()
            r0 = r6
            r3 = r7
            rx.b r7 = r0.z(r1, r2, r3, r4, r5)
            return r7
    }

    public final rx.b w0(long r7, java.util.concurrent.TimeUnit r9, rx.h r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r3 = r9
            r4 = r10
            rx.b r7 = r0.y0(r1, r3, r4, r5)
            return r7
    }

    public final rx.b x(rx.functions.b<rx.Notification<java.lang.Object>> r7) {
            r6 = this;
            if (r7 == 0) goto L1e
            rx.functions.m$m r1 = rx.functions.m.a()
            rx.b$h r2 = new rx.b$h
            r2.<init>(r6, r7)
            rx.b$i r3 = new rx.b$i
            r3.<init>(r6, r7)
            rx.functions.m$m r4 = rx.functions.m.a()
            rx.functions.m$m r5 = rx.functions.m.a()
            r0 = r6
            rx.b r7 = r0.z(r1, r2, r3, r4, r5)
            return r7
        L1e:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "onNotification is null"
            r7.<init>(r0)
            throw r7
    }

    public final rx.b x0(long r1, java.util.concurrent.TimeUnit r3, rx.h r4, rx.b r5) {
            r0 = this;
            g0(r5)
            rx.b r1 = r0.y0(r1, r3, r4, r5)
            return r1
    }

    public final rx.b y(rx.functions.b<? super java.lang.Throwable> r7) {
            r6 = this;
            rx.functions.m$m r1 = rx.functions.m.a()
            rx.functions.m$m r3 = rx.functions.m.a()
            rx.functions.m$m r4 = rx.functions.m.a()
            rx.functions.m$m r5 = rx.functions.m.a()
            r0 = r6
            r2 = r7
            rx.b r7 = r0.z(r1, r2, r3, r4, r5)
            return r7
    }

    public final rx.b y0(long r8, java.util.concurrent.TimeUnit r10, rx.h r11, rx.b r12) {
            r7 = this;
            g0(r10)
            g0(r11)
            rx.internal.operators.s r0 = new rx.internal.operators.s
            r1 = r7
            r2 = r8
            r4 = r10
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r4, r5, r6)
            rx.b r8 = p(r0)
            return r8
    }

    protected final rx.b z(rx.functions.b<? super rx.m> r8, rx.functions.b<? super java.lang.Throwable> r9, rx.functions.a r10, rx.functions.a r11, rx.functions.a r12) {
            r7 = this;
            g0(r8)
            g0(r9)
            g0(r10)
            g0(r11)
            g0(r12)
            rx.b$j r0 = new rx.b$j
            r1 = r7
            r5 = r8
            r4 = r9
            r2 = r10
            r3 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            rx.b r8 = p(r0)
            return r8
    }
}
