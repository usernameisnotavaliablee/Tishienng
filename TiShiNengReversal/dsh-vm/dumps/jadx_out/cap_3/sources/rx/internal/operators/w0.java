package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class w0<T> implements rx.e.a<T> {
    static final rx.functions.p<rx.e<? extends rx.Notification<?>>, rx.e<?>> f = null;
    final rx.e<T> a;
    private final rx.functions.p<? super rx.e<? extends rx.Notification<?>>, ? extends rx.e<?>> b;
    final boolean c;
    final boolean d;
    private final rx.h e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a implements rx.functions.p<rx.e<? extends rx.Notification<?>>, rx.e<?>> {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: rx.internal.operators.w0$a$a, reason: collision with other inner class name */
        class C0028a implements rx.functions.p<rx.Notification<?>, rx.Notification<?>> {
            final /* synthetic */ rx.internal.operators.w0.a a;

            C0028a(rx.internal.operators.w0.a r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
                    r0 = this;
                    rx.Notification r1 = (rx.Notification) r1
                    rx.Notification r1 = r0.call(r1)
                    return r1
            }

            public rx.Notification<?> call(rx.Notification<?> r1) {
                    r0 = this;
                    r1 = 0
                    rx.Notification r1 = rx.Notification.e(r1)
                    return r1
            }
        }

        a() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
                r0 = this;
                rx.e r1 = (rx.e) r1
                rx.e r1 = r0.call(r1)
                return r1
        }

        public rx.e<?> call(rx.e<? extends rx.Notification<?>> r2) {
                r1 = this;
                rx.internal.operators.w0$a$a r0 = new rx.internal.operators.w0$a$a
                r0.<init>(r1)
                rx.e r2 = r2.c3(r0)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements rx.functions.a {
        final /* synthetic */ rx.l a;
        final /* synthetic */ rx.subjects.f b;
        final /* synthetic */ rx.internal.producers.a c;
        final /* synthetic */ java.util.concurrent.atomic.AtomicLong d;
        final /* synthetic */ rx.subscriptions.e e;
        final /* synthetic */ rx.internal.operators.w0 f;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a extends rx.l<T> {
            boolean a;
            final /* synthetic */ rx.internal.operators.w0.b b;

            a(rx.internal.operators.w0.b r1) {
                    r0 = this;
                    r0.b = r1
                    r0.<init>()
                    return
            }

            private void g() {
                    r5 = this;
                L0:
                    rx.internal.operators.w0$b r0 = r5.b
                    java.util.concurrent.atomic.AtomicLong r0 = r0.d
                    long r0 = r0.get()
                    r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                    int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    if (r4 == 0) goto L1f
                    rx.internal.operators.w0$b r2 = r5.b
                    java.util.concurrent.atomic.AtomicLong r2 = r2.d
                    r3 = 1
                    long r3 = r0 - r3
                    boolean r0 = r2.compareAndSet(r0, r3)
                    if (r0 == 0) goto L0
                L1f:
                    return
            }

            public void onCompleted() {
                    r2 = this;
                    boolean r0 = r2.a
                    if (r0 != 0) goto L15
                    r0 = 1
                    r2.a = r0
                    r2.unsubscribe()
                    rx.internal.operators.w0$b r0 = r2.b
                    rx.subjects.f r0 = r0.b
                    rx.Notification r1 = rx.Notification.b()
                    r0.onNext(r1)
                L15:
                    return
            }

            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    boolean r0 = r1.a
                    if (r0 != 0) goto L15
                    r0 = 1
                    r1.a = r0
                    r1.unsubscribe()
                    rx.internal.operators.w0$b r0 = r1.b
                    rx.subjects.f r0 = r0.b
                    rx.Notification r2 = rx.Notification.d(r2)
                    r0.onNext(r2)
                L15:
                    return
            }

            public void onNext(T r3) {
                    r2 = this;
                    boolean r0 = r2.a
                    if (r0 != 0) goto L17
                    rx.internal.operators.w0$b r0 = r2.b
                    rx.l r0 = r0.a
                    r0.onNext(r3)
                    r2.g()
                    rx.internal.operators.w0$b r3 = r2.b
                    rx.internal.producers.a r3 = r3.c
                    r0 = 1
                    r3.b(r0)
                L17:
                    return
            }

            public void setProducer(rx.g r2) {
                    r1 = this;
                    rx.internal.operators.w0$b r0 = r1.b
                    rx.internal.producers.a r0 = r0.c
                    r0.c(r2)
                    return
            }
        }

        b(rx.internal.operators.w0 r1, rx.l r2, rx.subjects.f r3, rx.internal.producers.a r4, java.util.concurrent.atomic.AtomicLong r5, rx.subscriptions.e r6) {
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

        public void call() {
                r2 = this;
                rx.l r0 = r2.a
                boolean r0 = r0.isUnsubscribed()
                if (r0 == 0) goto L9
                return
            L9:
                rx.internal.operators.w0$b$a r0 = new rx.internal.operators.w0$b$a
                r0.<init>(r2)
                rx.subscriptions.e r1 = r2.e
                r1.b(r0)
                rx.internal.operators.w0 r1 = r2.f
                rx.e<T> r1 = r1.a
                r1.J6(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements rx.e.b<rx.Notification<?>, rx.Notification<?>> {
        final /* synthetic */ rx.internal.operators.w0 a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a extends rx.l<rx.Notification<?>> {
            final /* synthetic */ rx.l a;
            final /* synthetic */ rx.internal.operators.w0.c b;

            a(rx.internal.operators.w0.c r1, rx.l r2, rx.l r3) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r3
                    r0.<init>(r2)
                    return
            }

            public void g(rx.Notification<?> r2) {
                    r1 = this;
                    boolean r0 = r2.k()
                    if (r0 == 0) goto L14
                    rx.internal.operators.w0$c r0 = r1.b
                    rx.internal.operators.w0 r0 = r0.a
                    boolean r0 = r0.c
                    if (r0 == 0) goto L14
                    rx.l r2 = r1.a
                    r2.onCompleted()
                    return
                L14:
                    boolean r0 = r2.l()
                    if (r0 == 0) goto L2c
                    rx.internal.operators.w0$c r0 = r1.b
                    rx.internal.operators.w0 r0 = r0.a
                    boolean r0 = r0.d
                    if (r0 == 0) goto L2c
                    rx.l r0 = r1.a
                    java.lang.Throwable r2 = r2.g()
                    r0.onError(r2)
                    return
                L2c:
                    rx.l r0 = r1.a
                    r0.onNext(r2)
                    return
            }

            public void onCompleted() {
                    r1 = this;
                    rx.l r0 = r1.a
                    r0.onCompleted()
                    return
            }

            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    rx.l r0 = r1.a
                    r0.onError(r2)
                    return
            }

            public /* bridge */ /* synthetic */ void onNext(java.lang.Object r1) {
                    r0 = this;
                    rx.Notification r1 = (rx.Notification) r1
                    r0.g(r1)
                    return
            }

            public void setProducer(rx.g r3) {
                    r2 = this;
                    r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                    r3.request(r0)
                    return
            }
        }

        c(rx.internal.operators.w0 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
                r0 = this;
                rx.l r1 = (rx.l) r1
                rx.l r1 = r0.call(r1)
                return r1
        }

        public rx.l<? super rx.Notification<?>> call(rx.l<? super rx.Notification<?>> r2) {
                r1 = this;
                rx.internal.operators.w0$c$a r0 = new rx.internal.operators.w0$c$a
                r0.<init>(r1, r2, r2)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d implements rx.functions.a {
        final /* synthetic */ rx.e a;
        final /* synthetic */ rx.l b;
        final /* synthetic */ java.util.concurrent.atomic.AtomicLong c;
        final /* synthetic */ rx.h.a d;
        final /* synthetic */ rx.functions.a e;
        final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f;
        final /* synthetic */ rx.internal.operators.w0 g;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a extends rx.l<java.lang.Object> {
            final /* synthetic */ rx.internal.operators.w0.d a;

            a(rx.internal.operators.w0.d r1, rx.l r2) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>(r2)
                    return
            }

            public void onCompleted() {
                    r1 = this;
                    rx.internal.operators.w0$d r0 = r1.a
                    rx.l r0 = r0.b
                    r0.onCompleted()
                    return
            }

            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    rx.internal.operators.w0$d r0 = r1.a
                    rx.l r0 = r0.b
                    r0.onError(r2)
                    return
            }

            public void onNext(java.lang.Object r5) {
                    r4 = this;
                    rx.internal.operators.w0$d r5 = r4.a
                    rx.l r5 = r5.b
                    boolean r5 = r5.isUnsubscribed()
                    if (r5 != 0) goto L2b
                    rx.internal.operators.w0$d r5 = r4.a
                    java.util.concurrent.atomic.AtomicLong r5 = r5.c
                    long r0 = r5.get()
                    r2 = 0
                    int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    if (r5 <= 0) goto L22
                    rx.internal.operators.w0$d r5 = r4.a
                    rx.h$a r0 = r5.d
                    rx.functions.a r5 = r5.e
                    r0.d(r5)
                    return
                L22:
                    rx.internal.operators.w0$d r5 = r4.a
                    java.util.concurrent.atomic.AtomicBoolean r5 = r5.f
                    r0 = 0
                    r1 = 1
                    r5.compareAndSet(r0, r1)
                L2b:
                    return
            }

            public void setProducer(rx.g r3) {
                    r2 = this;
                    r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                    r3.request(r0)
                    return
            }
        }

        d(rx.internal.operators.w0 r1, rx.e r2, rx.l r3, java.util.concurrent.atomic.AtomicLong r4, rx.h.a r5, rx.functions.a r6, java.util.concurrent.atomic.AtomicBoolean r7) {
                r0 = this;
                r0.g = r1
                r0.a = r2
                r0.b = r3
                r0.c = r4
                r0.d = r5
                r0.e = r6
                r0.f = r7
                r0.<init>()
                return
        }

        public void call() {
                r3 = this;
                rx.e r0 = r3.a
                rx.internal.operators.w0$d$a r1 = new rx.internal.operators.w0$d$a
                rx.l r2 = r3.b
                r1.<init>(r3, r2)
                r0.J6(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class e implements rx.g {
        final /* synthetic */ java.util.concurrent.atomic.AtomicLong a;
        final /* synthetic */ rx.internal.producers.a b;
        final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean c;
        final /* synthetic */ rx.h.a d;
        final /* synthetic */ rx.functions.a e;
        final /* synthetic */ rx.internal.operators.w0 f;

        e(rx.internal.operators.w0 r1, java.util.concurrent.atomic.AtomicLong r2, rx.internal.producers.a r3, java.util.concurrent.atomic.AtomicBoolean r4, rx.h.a r5, rx.functions.a r6) {
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

        public void request(long r4) {
                r3 = this;
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 <= 0) goto L21
                java.util.concurrent.atomic.AtomicLong r0 = r3.a
                rx.internal.operators.a.b(r0, r4)
                rx.internal.producers.a r0 = r3.b
                r0.request(r4)
                java.util.concurrent.atomic.AtomicBoolean r4 = r3.c
                r5 = 1
                r0 = 0
                boolean r4 = r4.compareAndSet(r5, r0)
                if (r4 == 0) goto L21
                rx.h$a r4 = r3.d
                rx.functions.a r5 = r3.e
                r4.d(r5)
            L21:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class f implements rx.functions.p<rx.e<? extends rx.Notification<?>>, rx.e<?>> {
        final long a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements rx.functions.p<rx.Notification<?>, rx.Notification<?>> {
            int a;
            final /* synthetic */ rx.internal.operators.w0.f b;

            a(rx.internal.operators.w0.f r1) {
                    r0 = this;
                    r0.b = r1
                    r0.<init>()
                    return
            }

            public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
                    r0 = this;
                    rx.Notification r1 = (rx.Notification) r1
                    rx.Notification r1 = r0.call(r1)
                    return r1
            }

            public rx.Notification<?> call(rx.Notification<?> r7) {
                    r6 = this;
                    rx.internal.operators.w0$f r0 = r6.b
                    long r0 = r0.a
                    r2 = 0
                    int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    if (r4 != 0) goto Lb
                    goto L1e
                Lb:
                    int r2 = r6.a
                    int r2 = r2 + 1
                    r6.a = r2
                    long r3 = (long) r2
                    int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                    if (r5 > 0) goto L1e
                    java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
                    rx.Notification r7 = rx.Notification.e(r7)
                L1e:
                    return r7
            }
        }

        public f(long r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
                r0 = this;
                rx.e r1 = (rx.e) r1
                rx.e r1 = r0.call(r1)
                return r1
        }

        public rx.e<?> call(rx.e<? extends rx.Notification<?>> r2) {
                r1 = this;
                rx.internal.operators.w0$f$a r0 = new rx.internal.operators.w0$f$a
                r0.<init>(r1)
                rx.e r2 = r2.c3(r0)
                rx.e r2 = r2.A1()
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class g implements rx.functions.p<rx.e<? extends rx.Notification<?>>, rx.e<? extends rx.Notification<?>>> {
        final rx.functions.q<java.lang.Integer, java.lang.Throwable, java.lang.Boolean> a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements rx.functions.q<rx.Notification<java.lang.Integer>, rx.Notification<?>, rx.Notification<java.lang.Integer>> {
            final /* synthetic */ rx.internal.operators.w0.g a;

            a(rx.internal.operators.w0.g r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1, java.lang.Object r2) {
                    r0 = this;
                    rx.Notification r1 = (rx.Notification) r1
                    rx.Notification r2 = (rx.Notification) r2
                    rx.Notification r1 = r0.call(r1, r2)
                    return r1
            }

            public rx.Notification<java.lang.Integer> call(rx.Notification<java.lang.Integer> r4, rx.Notification<?> r5) {
                    r3 = this;
                    java.lang.Object r4 = r4.h()
                    java.lang.Integer r4 = (java.lang.Integer) r4
                    int r0 = r4.intValue()
                    rx.internal.operators.w0$g r1 = r3.a
                    rx.functions.q<java.lang.Integer, java.lang.Throwable, java.lang.Boolean> r1 = r1.a
                    java.lang.Throwable r2 = r5.g()
                    java.lang.Object r4 = r1.call(r4, r2)
                    java.lang.Boolean r4 = (java.lang.Boolean) r4
                    boolean r4 = r4.booleanValue()
                    if (r4 == 0) goto L29
                    int r0 = r0 + 1
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
                    rx.Notification r4 = rx.Notification.e(r4)
                    return r4
                L29:
                    return r5
            }
        }

        public g(rx.functions.q<java.lang.Integer, java.lang.Throwable, java.lang.Boolean> r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
                r0 = this;
                rx.e r1 = (rx.e) r1
                rx.e r1 = r0.call(r1)
                return r1
        }

        public rx.e<? extends rx.Notification<?>> call(rx.e<? extends rx.Notification<?>> r3) {
                r2 = this;
                r0 = 0
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                rx.Notification r0 = rx.Notification.e(r0)
                rx.internal.operators.w0$g$a r1 = new rx.internal.operators.w0$g$a
                r1.<init>(r2)
                rx.e r3 = r3.K4(r0, r1)
                return r3
        }
    }

    static {
            rx.internal.operators.w0$a r0 = new rx.internal.operators.w0$a
            r0.<init>()
            rx.internal.operators.w0.f = r0
            return
    }

    private w0(rx.e<T> r1, rx.functions.p<? super rx.e<? extends rx.Notification<?>>, ? extends rx.e<?>> r2, boolean r3, boolean r4, rx.h r5) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            return
    }

    public static <T> rx.e<T> a(rx.e<T> r6, rx.functions.p<? super rx.e<? extends rx.Notification<?>>, ? extends rx.e<?>> r7, rx.h r8) {
            rx.internal.operators.w0 r0 = new rx.internal.operators.w0
            r3 = 0
            r4 = 0
            r1 = r6
            r2 = r7
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            rx.e r6 = rx.e.I6(r0)
            return r6
    }

    public static <T> rx.e<T> b(rx.e<T> r1) {
            rx.h r0 = rx.schedulers.c.m()
            rx.e r1 = e(r1, r0)
            return r1
    }

    public static <T> rx.e<T> c(rx.e<T> r1, long r2) {
            rx.h r0 = rx.schedulers.c.m()
            rx.e r1 = d(r1, r2, r0)
            return r1
    }

    public static <T> rx.e<T> d(rx.e<T> r3, long r4, rx.h r6) {
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto Lb
            rx.e r3 = rx.e.S1()
            return r3
        Lb:
            if (r2 < 0) goto L1a
            rx.internal.operators.w0$f r0 = new rx.internal.operators.w0$f
            r1 = 1
            long r4 = r4 - r1
            r0.<init>(r4)
            rx.e r3 = g(r3, r0, r6)
            return r3
        L1a:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "count >= 0 expected"
            r3.<init>(r4)
            throw r3
    }

    public static <T> rx.e<T> e(rx.e<T> r1, rx.h r2) {
            rx.functions.p<rx.e<? extends rx.Notification<?>>, rx.e<?>> r0 = rx.internal.operators.w0.f
            rx.e r1 = g(r1, r0, r2)
            return r1
    }

    public static <T> rx.e<T> f(rx.e<T> r6, rx.functions.p<? super rx.e<? extends rx.Notification<?>>, ? extends rx.e<?>> r7) {
            rx.internal.operators.w0 r0 = new rx.internal.operators.w0
            r4 = 1
            rx.h r5 = rx.schedulers.c.m()
            r3 = 0
            r1 = r6
            r2 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            rx.e r6 = rx.e.I6(r0)
            return r6
    }

    public static <T> rx.e<T> g(rx.e<T> r6, rx.functions.p<? super rx.e<? extends rx.Notification<?>>, ? extends rx.e<?>> r7, rx.h r8) {
            rx.internal.operators.w0 r0 = new rx.internal.operators.w0
            r3 = 0
            r4 = 1
            r1 = r6
            r2 = r7
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            rx.e r6 = rx.e.I6(r0)
            return r6
    }

    public static <T> rx.e<T> h(rx.e<T> r1) {
            rx.functions.p<rx.e<? extends rx.Notification<?>>, rx.e<?>> r0 = rx.internal.operators.w0.f
            rx.e r1 = j(r1, r0)
            return r1
    }

    public static <T> rx.e<T> i(rx.e<T> r3, long r4) {
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L13
            if (r2 != 0) goto L9
            return r3
        L9:
            rx.internal.operators.w0$f r0 = new rx.internal.operators.w0$f
            r0.<init>(r4)
            rx.e r3 = j(r3, r0)
            return r3
        L13:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "count >= 0 expected"
            r3.<init>(r4)
            throw r3
    }

    public static <T> rx.e<T> j(rx.e<T> r6, rx.functions.p<? super rx.e<? extends rx.Notification<?>>, ? extends rx.e<?>> r7) {
            rx.internal.operators.w0 r0 = new rx.internal.operators.w0
            r4 = 0
            rx.h r5 = rx.schedulers.c.m()
            r3 = 1
            r1 = r6
            r2 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            rx.e r6 = rx.e.I6(r0)
            return r6
    }

    public static <T> rx.e<T> k(rx.e<T> r6, rx.functions.p<? super rx.e<? extends rx.Notification<?>>, ? extends rx.e<?>> r7, rx.h r8) {
            rx.internal.operators.w0 r0 = new rx.internal.operators.w0
            r3 = 1
            r4 = 0
            r1 = r6
            r2 = r7
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            rx.e r6 = rx.e.I6(r0)
            return r6
    }

    public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            r0.call(r1)
            return
    }

    public void call(rx.l<? super T> r13) {
            r12 = this;
            java.util.concurrent.atomic.AtomicBoolean r4 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 1
            r4.<init>(r0)
            java.util.concurrent.atomic.AtomicLong r2 = new java.util.concurrent.atomic.AtomicLong
            r2.<init>()
            rx.h r0 = r12.e
            rx.h$a r0 = r0.a()
            r13.add(r0)
            rx.subscriptions.e r11 = new rx.subscriptions.e
            r11.<init>()
            r13.add(r11)
            rx.subjects.b r1 = rx.subjects.b.y7()
            rx.subjects.e r8 = r1.x7()
            rx.l r1 = rx.observers.h.d()
            r8.r5(r1)
            rx.internal.producers.a r3 = new rx.internal.producers.a
            r3.<init>()
            rx.internal.operators.w0$b r6 = new rx.internal.operators.w0$b
            r7 = r13
            r10 = r2
            r9 = r3
            r5 = r6
            r6 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r1 = r6
            r3 = r7
            r6 = r5
            rx.functions.p<? super rx.e<? extends rx.Notification<?>>, ? extends rx.e<?>> r13 = r1.b
            rx.internal.operators.w0$c r5 = new rx.internal.operators.w0$c
            r5.<init>(r12)
            rx.e r5 = r8.a3(r5)
            java.lang.Object r13 = r13.call(r5)
            rx.e r13 = (rx.e) r13
            r5 = r0
            rx.internal.operators.w0$d r0 = new rx.internal.operators.w0$d
            r7 = r4
            r4 = r2
            r2 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r2 = r4
            r4 = r7
            r7 = r3
            r5.d(r0)
            rx.internal.operators.w0$e r0 = new rx.internal.operators.w0$e
            r1 = r12
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.setProducer(r0)
            return
    }
}
