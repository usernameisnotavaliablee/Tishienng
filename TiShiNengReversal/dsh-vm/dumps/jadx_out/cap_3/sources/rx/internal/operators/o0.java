package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class o0<T1, T2, D1, D2, R> implements rx.e.a<R> {
    final rx.e<T1> a;
    final rx.e<T2> b;
    final rx.functions.p<? super T1, ? extends rx.e<D1>> c;
    final rx.functions.p<? super T2, ? extends rx.e<D2>> d;
    final rx.functions.q<? super T1, ? super rx.e<T2>, ? extends R> e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a extends java.util.HashMap<java.lang.Integer, rx.f<T2>> implements rx.m {
        private static final long serialVersionUID = -3035156013812425335L;
        final rx.subscriptions.d a;
        final rx.l<? super R> b;
        final rx.subscriptions.b c;
        int d;
        int e;
        final java.util.Map<java.lang.Integer, T2> f;
        boolean g;
        boolean h;
        final /* synthetic */ rx.internal.operators.o0 i;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: rx.internal.operators.o0$a$a, reason: collision with other inner class name */
        final class C0019a extends rx.l<D1> {
            final int a;
            boolean b;
            final /* synthetic */ rx.internal.operators.o0.a c;

            public C0019a(rx.internal.operators.o0.a r1, int r2) {
                    r0 = this;
                    r0.c = r1
                    r0.<init>()
                    r1 = 1
                    r0.b = r1
                    r0.a = r2
                    return
            }

            public void onCompleted() {
                    r3 = this;
                    boolean r0 = r3.b
                    if (r0 == 0) goto L2d
                    r0 = 0
                    r3.b = r0
                    rx.internal.operators.o0$a r0 = r3.c
                    monitor-enter(r0)
                    rx.internal.operators.o0$a r1 = r3.c     // Catch: java.lang.Throwable -> L2a
                    java.util.Map r1 = r1.g()     // Catch: java.lang.Throwable -> L2a
                    int r2 = r3.a     // Catch: java.lang.Throwable -> L2a
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L2a
                    java.lang.Object r1 = r1.remove(r2)     // Catch: java.lang.Throwable -> L2a
                    rx.f r1 = (rx.f) r1     // Catch: java.lang.Throwable -> L2a
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
                    if (r1 == 0) goto L22
                    r1.onCompleted()
                L22:
                    rx.internal.operators.o0$a r0 = r3.c
                    rx.subscriptions.b r0 = r0.c
                    r0.f(r3)
                    return
                L2a:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
                    throw r1
                L2d:
                    return
            }

            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    rx.internal.operators.o0$a r0 = r1.c
                    r0.e(r2)
                    return
            }

            public void onNext(D1 r1) {
                    r0 = this;
                    r0.onCompleted()
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        final class b extends rx.l<T1> {
            final /* synthetic */ rx.internal.operators.o0.a a;

            b(rx.internal.operators.o0.a r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public void onCompleted() {
                    r3 = this;
                    rx.internal.operators.o0$a r0 = r3.a
                    monitor-enter(r0)
                    rx.internal.operators.o0$a r1 = r3.a     // Catch: java.lang.Throwable -> L2c
                    r2 = 1
                    r1.g = r2     // Catch: java.lang.Throwable -> L2c
                    boolean r1 = r1.h     // Catch: java.lang.Throwable -> L2c
                    if (r1 == 0) goto L2e
                    java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2c
                    rx.internal.operators.o0$a r2 = r3.a     // Catch: java.lang.Throwable -> L2c
                    java.util.Map r2 = r2.g()     // Catch: java.lang.Throwable -> L2c
                    java.util.Collection r2 = r2.values()     // Catch: java.lang.Throwable -> L2c
                    r1.<init>(r2)     // Catch: java.lang.Throwable -> L2c
                    rx.internal.operators.o0$a r2 = r3.a     // Catch: java.lang.Throwable -> L2c
                    java.util.Map r2 = r2.g()     // Catch: java.lang.Throwable -> L2c
                    r2.clear()     // Catch: java.lang.Throwable -> L2c
                    rx.internal.operators.o0$a r2 = r3.a     // Catch: java.lang.Throwable -> L2c
                    java.util.Map<java.lang.Integer, T2> r2 = r2.f     // Catch: java.lang.Throwable -> L2c
                    r2.clear()     // Catch: java.lang.Throwable -> L2c
                    goto L2f
                L2c:
                    r1 = move-exception
                    goto L36
                L2e:
                    r1 = 0
                L2f:
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
                    rx.internal.operators.o0$a r0 = r3.a
                    r0.a(r1)
                    return
                L36:
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
                    throw r1
            }

            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    rx.internal.operators.o0$a r0 = r1.a
                    r0.b(r2)
                    return
            }

            public void onNext(T1 r7) {
                    r6 = this;
                    rx.subjects.c r0 = rx.subjects.c.y7()     // Catch: java.lang.Throwable -> L7e
                    rx.observers.f r1 = new rx.observers.f     // Catch: java.lang.Throwable -> L7e
                    r1.<init>(r0)     // Catch: java.lang.Throwable -> L7e
                    rx.internal.operators.o0$a r2 = r6.a     // Catch: java.lang.Throwable -> L7e
                    monitor-enter(r2)     // Catch: java.lang.Throwable -> L7e
                    rx.internal.operators.o0$a r3 = r6.a     // Catch: java.lang.Throwable -> L84
                    int r4 = r3.d     // Catch: java.lang.Throwable -> L84
                    int r5 = r4 + 1
                    r3.d = r5     // Catch: java.lang.Throwable -> L84
                    java.util.Map r3 = r3.g()     // Catch: java.lang.Throwable -> L84
                    java.lang.Integer r5 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L84
                    r3.put(r5, r1)     // Catch: java.lang.Throwable -> L84
                    monitor-exit(r2)     // Catch: java.lang.Throwable -> L84
                    rx.internal.operators.o0$b r2 = new rx.internal.operators.o0$b     // Catch: java.lang.Throwable -> L7e
                    rx.internal.operators.o0$a r3 = r6.a     // Catch: java.lang.Throwable -> L7e
                    rx.subscriptions.d r3 = r3.a     // Catch: java.lang.Throwable -> L7e
                    r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> L7e
                    rx.e r0 = rx.e.I6(r2)     // Catch: java.lang.Throwable -> L7e
                    rx.internal.operators.o0$a r2 = r6.a     // Catch: java.lang.Throwable -> L7e
                    rx.internal.operators.o0 r2 = r2.i     // Catch: java.lang.Throwable -> L7e
                    rx.functions.p<? super T1, ? extends rx.e<D1>> r2 = r2.c     // Catch: java.lang.Throwable -> L7e
                    java.lang.Object r2 = r2.call(r7)     // Catch: java.lang.Throwable -> L7e
                    rx.e r2 = (rx.e) r2     // Catch: java.lang.Throwable -> L7e
                    rx.internal.operators.o0$a$a r3 = new rx.internal.operators.o0$a$a     // Catch: java.lang.Throwable -> L7e
                    rx.internal.operators.o0$a r5 = r6.a     // Catch: java.lang.Throwable -> L7e
                    r3.<init>(r5, r4)     // Catch: java.lang.Throwable -> L7e
                    rx.internal.operators.o0$a r4 = r6.a     // Catch: java.lang.Throwable -> L7e
                    rx.subscriptions.b r4 = r4.c     // Catch: java.lang.Throwable -> L7e
                    r4.a(r3)     // Catch: java.lang.Throwable -> L7e
                    r2.J6(r3)     // Catch: java.lang.Throwable -> L7e
                    rx.internal.operators.o0$a r2 = r6.a     // Catch: java.lang.Throwable -> L7e
                    rx.internal.operators.o0 r2 = r2.i     // Catch: java.lang.Throwable -> L7e
                    rx.functions.q<? super T1, ? super rx.e<T2>, ? extends R> r2 = r2.e     // Catch: java.lang.Throwable -> L7e
                    java.lang.Object r7 = r2.call(r7, r0)     // Catch: java.lang.Throwable -> L7e
                    rx.internal.operators.o0$a r0 = r6.a     // Catch: java.lang.Throwable -> L7e
                    monitor-enter(r0)     // Catch: java.lang.Throwable -> L7e
                    java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L81
                    rx.internal.operators.o0$a r3 = r6.a     // Catch: java.lang.Throwable -> L81
                    java.util.Map<java.lang.Integer, T2> r3 = r3.f     // Catch: java.lang.Throwable -> L81
                    java.util.Collection r3 = r3.values()     // Catch: java.lang.Throwable -> L81
                    r2.<init>(r3)     // Catch: java.lang.Throwable -> L81
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L81
                    rx.internal.operators.o0$a r0 = r6.a     // Catch: java.lang.Throwable -> L7e
                    rx.l<? super R> r0 = r0.b     // Catch: java.lang.Throwable -> L7e
                    r0.onNext(r7)     // Catch: java.lang.Throwable -> L7e
                    java.util.Iterator r7 = r2.iterator()     // Catch: java.lang.Throwable -> L7e
                L70:
                    boolean r0 = r7.hasNext()     // Catch: java.lang.Throwable -> L7e
                    if (r0 == 0) goto L80
                    java.lang.Object r0 = r7.next()     // Catch: java.lang.Throwable -> L7e
                    r1.onNext(r0)     // Catch: java.lang.Throwable -> L7e
                    goto L70
                L7e:
                    r7 = move-exception
                    goto L87
                L80:
                    return
                L81:
                    r7 = move-exception
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L81
                    throw r7     // Catch: java.lang.Throwable -> L7e
                L84:
                    r7 = move-exception
                    monitor-exit(r2)     // Catch: java.lang.Throwable -> L84
                    throw r7     // Catch: java.lang.Throwable -> L7e
                L87:
                    rx.exceptions.a.f(r7, r6)
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        final class c extends rx.l<D2> {
            final int a;
            boolean b;
            final /* synthetic */ rx.internal.operators.o0.a c;

            public c(rx.internal.operators.o0.a r1, int r2) {
                    r0 = this;
                    r0.c = r1
                    r0.<init>()
                    r1 = 1
                    r0.b = r1
                    r0.a = r2
                    return
            }

            public void onCompleted() {
                    r3 = this;
                    boolean r0 = r3.b
                    if (r0 == 0) goto L23
                    r0 = 0
                    r3.b = r0
                    rx.internal.operators.o0$a r0 = r3.c
                    monitor-enter(r0)
                    rx.internal.operators.o0$a r1 = r3.c     // Catch: java.lang.Throwable -> L20
                    java.util.Map<java.lang.Integer, T2> r1 = r1.f     // Catch: java.lang.Throwable -> L20
                    int r2 = r3.a     // Catch: java.lang.Throwable -> L20
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L20
                    r1.remove(r2)     // Catch: java.lang.Throwable -> L20
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
                    rx.internal.operators.o0$a r0 = r3.c
                    rx.subscriptions.b r0 = r0.c
                    r0.f(r3)
                    return
                L20:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
                    throw r1
                L23:
                    return
            }

            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    rx.internal.operators.o0$a r0 = r1.c
                    r0.e(r2)
                    return
            }

            public void onNext(D2 r1) {
                    r0 = this;
                    r0.onCompleted()
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        final class d extends rx.l<T2> {
            final /* synthetic */ rx.internal.operators.o0.a a;

            d(rx.internal.operators.o0.a r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public void onCompleted() {
                    r3 = this;
                    rx.internal.operators.o0$a r0 = r3.a
                    monitor-enter(r0)
                    rx.internal.operators.o0$a r1 = r3.a     // Catch: java.lang.Throwable -> L2c
                    r2 = 1
                    r1.h = r2     // Catch: java.lang.Throwable -> L2c
                    boolean r1 = r1.g     // Catch: java.lang.Throwable -> L2c
                    if (r1 == 0) goto L2e
                    java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2c
                    rx.internal.operators.o0$a r2 = r3.a     // Catch: java.lang.Throwable -> L2c
                    java.util.Map r2 = r2.g()     // Catch: java.lang.Throwable -> L2c
                    java.util.Collection r2 = r2.values()     // Catch: java.lang.Throwable -> L2c
                    r1.<init>(r2)     // Catch: java.lang.Throwable -> L2c
                    rx.internal.operators.o0$a r2 = r3.a     // Catch: java.lang.Throwable -> L2c
                    java.util.Map r2 = r2.g()     // Catch: java.lang.Throwable -> L2c
                    r2.clear()     // Catch: java.lang.Throwable -> L2c
                    rx.internal.operators.o0$a r2 = r3.a     // Catch: java.lang.Throwable -> L2c
                    java.util.Map<java.lang.Integer, T2> r2 = r2.f     // Catch: java.lang.Throwable -> L2c
                    r2.clear()     // Catch: java.lang.Throwable -> L2c
                    goto L2f
                L2c:
                    r1 = move-exception
                    goto L36
                L2e:
                    r1 = 0
                L2f:
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
                    rx.internal.operators.o0$a r0 = r3.a
                    r0.a(r1)
                    return
                L36:
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
                    throw r1
            }

            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    rx.internal.operators.o0$a r0 = r1.a
                    r0.b(r2)
                    return
            }

            public void onNext(T2 r5) {
                    r4 = this;
                    rx.internal.operators.o0$a r0 = r4.a     // Catch: java.lang.Throwable -> L59
                    monitor-enter(r0)     // Catch: java.lang.Throwable -> L59
                    rx.internal.operators.o0$a r1 = r4.a     // Catch: java.lang.Throwable -> L5f
                    int r2 = r1.e     // Catch: java.lang.Throwable -> L5f
                    int r3 = r2 + 1
                    r1.e = r3     // Catch: java.lang.Throwable -> L5f
                    java.util.Map<java.lang.Integer, T2> r1 = r1.f     // Catch: java.lang.Throwable -> L5f
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L5f
                    r1.put(r3, r5)     // Catch: java.lang.Throwable -> L5f
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L5f
                    rx.internal.operators.o0$a r0 = r4.a     // Catch: java.lang.Throwable -> L59
                    rx.internal.operators.o0 r0 = r0.i     // Catch: java.lang.Throwable -> L59
                    rx.functions.p<? super T2, ? extends rx.e<D2>> r0 = r0.d     // Catch: java.lang.Throwable -> L59
                    java.lang.Object r0 = r0.call(r5)     // Catch: java.lang.Throwable -> L59
                    rx.e r0 = (rx.e) r0     // Catch: java.lang.Throwable -> L59
                    rx.internal.operators.o0$a$c r1 = new rx.internal.operators.o0$a$c     // Catch: java.lang.Throwable -> L59
                    rx.internal.operators.o0$a r3 = r4.a     // Catch: java.lang.Throwable -> L59
                    r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L59
                    rx.internal.operators.o0$a r2 = r4.a     // Catch: java.lang.Throwable -> L59
                    rx.subscriptions.b r2 = r2.c     // Catch: java.lang.Throwable -> L59
                    r2.a(r1)     // Catch: java.lang.Throwable -> L59
                    r0.J6(r1)     // Catch: java.lang.Throwable -> L59
                    rx.internal.operators.o0$a r0 = r4.a     // Catch: java.lang.Throwable -> L59
                    monitor-enter(r0)     // Catch: java.lang.Throwable -> L59
                    java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L5c
                    rx.internal.operators.o0$a r2 = r4.a     // Catch: java.lang.Throwable -> L5c
                    java.util.Map r2 = r2.g()     // Catch: java.lang.Throwable -> L5c
                    java.util.Collection r2 = r2.values()     // Catch: java.lang.Throwable -> L5c
                    r1.<init>(r2)     // Catch: java.lang.Throwable -> L5c
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L5c
                    java.util.Iterator r0 = r1.iterator()     // Catch: java.lang.Throwable -> L59
                L49:
                    boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L59
                    if (r1 == 0) goto L5b
                    java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L59
                    rx.f r1 = (rx.f) r1     // Catch: java.lang.Throwable -> L59
                    r1.onNext(r5)     // Catch: java.lang.Throwable -> L59
                    goto L49
                L59:
                    r5 = move-exception
                    goto L62
                L5b:
                    return
                L5c:
                    r5 = move-exception
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L5c
                    throw r5     // Catch: java.lang.Throwable -> L59
                L5f:
                    r5 = move-exception
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L5f
                    throw r5     // Catch: java.lang.Throwable -> L59
                L62:
                    rx.exceptions.a.f(r5, r4)
                    return
            }
        }

        public a(rx.internal.operators.o0 r1, rx.l<? super R> r2) {
                r0 = this;
                r0.i = r1
                r0.<init>()
                java.util.HashMap r1 = new java.util.HashMap
                r1.<init>()
                r0.f = r1
                r0.b = r2
                rx.subscriptions.b r1 = new rx.subscriptions.b
                r1.<init>()
                r0.c = r1
                rx.subscriptions.d r2 = new rx.subscriptions.d
                r2.<init>(r1)
                r0.a = r2
                return
        }

        void a(java.util.List<rx.f<T2>> r2) {
                r1 = this;
                if (r2 == 0) goto L20
                java.util.Iterator r2 = r2.iterator()
            L6:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L16
                java.lang.Object r0 = r2.next()
                rx.f r0 = (rx.f) r0
                r0.onCompleted()
                goto L6
            L16:
                rx.l<? super R> r2 = r1.b
                r2.onCompleted()
                rx.subscriptions.d r2 = r1.a
                r2.unsubscribe()
            L20:
                return
        }

        void b(java.lang.Throwable r3) {
                r2 = this;
                monitor-enter(r2)
                java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3a
                java.util.Map r1 = r2.g()     // Catch: java.lang.Throwable -> L3a
                java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L3a
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L3a
                java.util.Map r1 = r2.g()     // Catch: java.lang.Throwable -> L3a
                r1.clear()     // Catch: java.lang.Throwable -> L3a
                java.util.Map<java.lang.Integer, T2> r1 = r2.f     // Catch: java.lang.Throwable -> L3a
                r1.clear()     // Catch: java.lang.Throwable -> L3a
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L3a
                java.util.Iterator r0 = r0.iterator()
            L1f:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L2f
                java.lang.Object r1 = r0.next()
                rx.f r1 = (rx.f) r1
                r1.onError(r3)
                goto L1f
            L2f:
                rx.l<? super R> r0 = r2.b
                r0.onError(r3)
                rx.subscriptions.d r3 = r2.a
                r3.unsubscribe()
                return
            L3a:
                r3 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L3a
                throw r3
        }

        void e(java.lang.Throwable r2) {
                r1 = this;
                monitor-enter(r1)
                java.util.Map r0 = r1.g()     // Catch: java.lang.Throwable -> L19
                r0.clear()     // Catch: java.lang.Throwable -> L19
                java.util.Map<java.lang.Integer, T2> r0 = r1.f     // Catch: java.lang.Throwable -> L19
                r0.clear()     // Catch: java.lang.Throwable -> L19
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L19
                rx.l<? super R> r0 = r1.b
                r0.onError(r2)
                rx.subscriptions.d r2 = r1.a
                r2.unsubscribe()
                return
            L19:
                r2 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L19
                throw r2
        }

        public void f() {
                r3 = this;
                rx.internal.operators.o0$a$b r0 = new rx.internal.operators.o0$a$b
                r0.<init>(r3)
                rx.internal.operators.o0$a$d r1 = new rx.internal.operators.o0$a$d
                r1.<init>(r3)
                rx.subscriptions.b r2 = r3.c
                r2.a(r0)
                rx.subscriptions.b r2 = r3.c
                r2.a(r1)
                rx.internal.operators.o0 r2 = r3.i
                rx.e<T1> r2 = r2.a
                r2.J6(r0)
                rx.internal.operators.o0 r0 = r3.i
                rx.e<T2> r0 = r0.b
                r0.J6(r1)
                return
        }

        java.util.Map<java.lang.Integer, rx.f<T2>> g() {
                r0 = this;
                return r0
        }

        public boolean isUnsubscribed() {
                r1 = this;
                rx.subscriptions.d r0 = r1.a
                boolean r0 = r0.isUnsubscribed()
                return r0
        }

        public void unsubscribe() {
                r1 = this;
                rx.subscriptions.d r0 = r1.a
                r0.unsubscribe()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b<T> implements rx.e.a<T> {
        final rx.subscriptions.d a;
        final rx.e<T> b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        final class a extends rx.l<T> {
            final rx.l<? super T> a;
            private final rx.m b;
            final /* synthetic */ rx.internal.operators.o0.b c;

            public a(rx.internal.operators.o0.b r1, rx.l<? super T> r2, rx.m r3) {
                    r0 = this;
                    r0.c = r1
                    r0.<init>(r2)
                    r0.a = r2
                    r0.b = r3
                    return
            }

            public void onCompleted() {
                    r1 = this;
                    rx.l<? super T> r0 = r1.a
                    r0.onCompleted()
                    rx.m r0 = r1.b
                    r0.unsubscribe()
                    return
            }

            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    rx.l<? super T> r0 = r1.a
                    r0.onError(r2)
                    rx.m r2 = r1.b
                    r2.unsubscribe()
                    return
            }

            public void onNext(T r2) {
                    r1 = this;
                    rx.l<? super T> r0 = r1.a
                    r0.onNext(r2)
                    return
            }
        }

        public b(rx.e<T> r1, rx.subscriptions.d r2) {
                r0 = this;
                r0.<init>()
                r0.a = r2
                r0.b = r1
                return
        }

        public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
                r0 = this;
                rx.l r1 = (rx.l) r1
                r0.call(r1)
                return
        }

        public void call(rx.l<? super T> r3) {
                r2 = this;
                rx.subscriptions.d r0 = r2.a
                rx.m r0 = r0.a()
                rx.internal.operators.o0$b$a r1 = new rx.internal.operators.o0$b$a
                r1.<init>(r2, r3, r0)
                r1.add(r0)
                rx.e<T> r3 = r2.b
                r3.J6(r1)
                return
        }
    }

    public o0(rx.e<T1> r1, rx.e<T2> r2, rx.functions.p<? super T1, ? extends rx.e<D1>> r3, rx.functions.p<? super T2, ? extends rx.e<D2>> r4, rx.functions.q<? super T1, ? super rx.e<T2>, ? extends R> r5) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            return
    }

    public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            r0.call(r1)
            return
    }

    public void call(rx.l<? super R> r3) {
            r2 = this;
            rx.internal.operators.o0$a r0 = new rx.internal.operators.o0$a
            rx.observers.g r1 = new rx.observers.g
            r1.<init>(r3)
            r0.<init>(r2, r1)
            r3.add(r0)
            r0.f()
            return
    }
}
