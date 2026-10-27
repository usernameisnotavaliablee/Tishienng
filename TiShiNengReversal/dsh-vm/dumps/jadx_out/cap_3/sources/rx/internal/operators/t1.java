package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class t1<T> implements rx.e.b<java.util.List<T>, T> {
    final long a;
    final long b;
    final java.util.concurrent.TimeUnit c;
    final int d;
    final rx.h e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a extends rx.l<T> {
        final rx.l<? super java.util.List<T>> a;
        final rx.h.a b;
        java.util.List<T> c;
        boolean d;
        final /* synthetic */ rx.internal.operators.t1 e;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: rx.internal.operators.t1$a$a, reason: collision with other inner class name */
        class C0025a implements rx.functions.a {
            final /* synthetic */ rx.internal.operators.t1.a a;

            C0025a(rx.internal.operators.t1.a r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public void call() {
                    r1 = this;
                    rx.internal.operators.t1$a r0 = r1.a
                    r0.g()
                    return
            }
        }

        public a(rx.internal.operators.t1 r1, rx.l<? super java.util.List<T>> r2, rx.h.a r3) {
                r0 = this;
                r0.e = r1
                r0.<init>()
                r0.a = r2
                r0.b = r3
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.c = r1
                return
        }

        void g() {
                r2 = this;
                monitor-enter(r2)
                boolean r0 = r2.d     // Catch: java.lang.Throwable -> L7
                if (r0 == 0) goto L9
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L7
                return
            L7:
                r0 = move-exception
                goto L1e
            L9:
                java.util.List<T> r0 = r2.c     // Catch: java.lang.Throwable -> L7
                java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L7
                r1.<init>()     // Catch: java.lang.Throwable -> L7
                r2.c = r1     // Catch: java.lang.Throwable -> L7
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L7
                rx.l<? super java.util.List<T>> r1 = r2.a     // Catch: java.lang.Throwable -> L19
                r1.onNext(r0)     // Catch: java.lang.Throwable -> L19
                return
            L19:
                r0 = move-exception
                rx.exceptions.a.f(r0, r2)
                return
            L1e:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L7
                throw r0
        }

        void j() {
                r7 = this;
                rx.h$a r0 = r7.b
                rx.internal.operators.t1$a$a r1 = new rx.internal.operators.t1$a$a
                r1.<init>(r7)
                rx.internal.operators.t1 r2 = r7.e
                r4 = r2
                long r2 = r4.a
                java.util.concurrent.TimeUnit r6 = r4.c
                r4 = r2
                r0.f(r1, r2, r4, r6)
                return
        }

        public void onCompleted() {
                r2 = this;
                rx.h$a r0 = r2.b     // Catch: java.lang.Throwable -> L25
                r0.unsubscribe()     // Catch: java.lang.Throwable -> L25
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L25
                boolean r0 = r2.d     // Catch: java.lang.Throwable -> Lc
                if (r0 == 0) goto Le
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
                return
            Lc:
                r0 = move-exception
                goto L27
            Le:
                r0 = 1
                r2.d = r0     // Catch: java.lang.Throwable -> Lc
                java.util.List<T> r0 = r2.c     // Catch: java.lang.Throwable -> Lc
                r1 = 0
                r2.c = r1     // Catch: java.lang.Throwable -> Lc
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
                rx.l<? super java.util.List<T>> r1 = r2.a     // Catch: java.lang.Throwable -> L25
                r1.onNext(r0)     // Catch: java.lang.Throwable -> L25
                rx.l<? super java.util.List<T>> r0 = r2.a
                r0.onCompleted()
                r2.unsubscribe()
                return
            L25:
                r0 = move-exception
                goto L29
            L27:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
                throw r0     // Catch: java.lang.Throwable -> L25
            L29:
                rx.l<? super java.util.List<T>> r1 = r2.a
                rx.exceptions.a.f(r0, r1)
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                monitor-enter(r1)
                boolean r0 = r1.d     // Catch: java.lang.Throwable -> L7
                if (r0 == 0) goto L9
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
                return
            L7:
                r2 = move-exception
                goto L19
            L9:
                r0 = 1
                r1.d = r0     // Catch: java.lang.Throwable -> L7
                r0 = 0
                r1.c = r0     // Catch: java.lang.Throwable -> L7
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
                rx.l<? super java.util.List<T>> r0 = r1.a
                r0.onError(r2)
                r1.unsubscribe()
                return
            L19:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
                throw r2
        }

        public void onNext(T r2) {
                r1 = this;
                monitor-enter(r1)
                boolean r0 = r1.d     // Catch: java.lang.Throwable -> L7
                if (r0 == 0) goto L9
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
                return
            L7:
                r2 = move-exception
                goto L2e
            L9:
                java.util.List<T> r0 = r1.c     // Catch: java.lang.Throwable -> L7
                r0.add(r2)     // Catch: java.lang.Throwable -> L7
                java.util.List<T> r2 = r1.c     // Catch: java.lang.Throwable -> L7
                int r2 = r2.size()     // Catch: java.lang.Throwable -> L7
                rx.internal.operators.t1 r0 = r1.e     // Catch: java.lang.Throwable -> L7
                int r0 = r0.d     // Catch: java.lang.Throwable -> L7
                if (r2 != r0) goto L24
                java.util.List<T> r2 = r1.c     // Catch: java.lang.Throwable -> L7
                java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L7
                r0.<init>()     // Catch: java.lang.Throwable -> L7
                r1.c = r0     // Catch: java.lang.Throwable -> L7
                goto L25
            L24:
                r2 = 0
            L25:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
                if (r2 == 0) goto L2d
                rx.l<? super java.util.List<T>> r0 = r1.a
                r0.onNext(r2)
            L2d:
                return
            L2e:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
                throw r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class b extends rx.l<T> {
        final rx.l<? super java.util.List<T>> a;
        final rx.h.a b;
        final java.util.List<java.util.List<T>> c;
        boolean d;
        final /* synthetic */ rx.internal.operators.t1 e;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements rx.functions.a {
            final /* synthetic */ rx.internal.operators.t1.b a;

            a(rx.internal.operators.t1.b r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public void call() {
                    r1 = this;
                    rx.internal.operators.t1$b r0 = r1.a
                    r0.s()
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: rx.internal.operators.t1$b$b, reason: collision with other inner class name */
        class C0026b implements rx.functions.a {
            final /* synthetic */ java.util.List a;
            final /* synthetic */ rx.internal.operators.t1.b b;

            C0026b(rx.internal.operators.t1.b r1, java.util.List r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            public void call() {
                    r2 = this;
                    rx.internal.operators.t1$b r0 = r2.b
                    java.util.List r1 = r2.a
                    r0.g(r1)
                    return
            }
        }

        public b(rx.internal.operators.t1 r1, rx.l<? super java.util.List<T>> r2, rx.h.a r3) {
                r0 = this;
                r0.e = r1
                r0.<init>()
                r0.a = r2
                r0.b = r3
                java.util.LinkedList r1 = new java.util.LinkedList
                r1.<init>()
                r0.c = r1
                return
        }

        void g(java.util.List<T> r3) {
                r2 = this;
                monitor-enter(r2)
                boolean r0 = r2.d     // Catch: java.lang.Throwable -> L7
                if (r0 == 0) goto L9
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L7
                return
            L7:
                r3 = move-exception
                goto L31
            L9:
                java.util.List<java.util.List<T>> r0 = r2.c     // Catch: java.lang.Throwable -> L7
                java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L7
            Lf:
                boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L7
                if (r1 == 0) goto L22
                java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L7
                java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L7
                if (r1 != r3) goto Lf
                r0.remove()     // Catch: java.lang.Throwable -> L7
                r0 = 1
                goto L23
            L22:
                r0 = 0
            L23:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L7
                if (r0 == 0) goto L30
                rx.l<? super java.util.List<T>> r0 = r2.a     // Catch: java.lang.Throwable -> L2c
                r0.onNext(r3)     // Catch: java.lang.Throwable -> L2c
                return
            L2c:
                r3 = move-exception
                rx.exceptions.a.f(r3, r2)
            L30:
                return
            L31:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L7
                throw r3
        }

        void j() {
                r7 = this;
                rx.h$a r0 = r7.b
                rx.internal.operators.t1$b$a r1 = new rx.internal.operators.t1$b$a
                r1.<init>(r7)
                rx.internal.operators.t1 r2 = r7.e
                r4 = r2
                long r2 = r4.b
                java.util.concurrent.TimeUnit r6 = r4.c
                r4 = r2
                r0.f(r1, r2, r4, r6)
                return
        }

        public void onCompleted() {
                r3 = this;
                monitor-enter(r3)     // Catch: java.lang.Throwable -> L2f
                boolean r0 = r3.d     // Catch: java.lang.Throwable -> L7
                if (r0 == 0) goto L9
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L7
                return
            L7:
                r0 = move-exception
                goto L3a
            L9:
                r0 = 1
                r3.d = r0     // Catch: java.lang.Throwable -> L7
                java.util.LinkedList r0 = new java.util.LinkedList     // Catch: java.lang.Throwable -> L7
                java.util.List<java.util.List<T>> r1 = r3.c     // Catch: java.lang.Throwable -> L7
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L7
                java.util.List<java.util.List<T>> r1 = r3.c     // Catch: java.lang.Throwable -> L7
                r1.clear()     // Catch: java.lang.Throwable -> L7
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L7
                java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L2f
            L1d:
                boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L2f
                if (r1 == 0) goto L31
                java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L2f
                java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L2f
                rx.l<? super java.util.List<T>> r2 = r3.a     // Catch: java.lang.Throwable -> L2f
                r2.onNext(r1)     // Catch: java.lang.Throwable -> L2f
                goto L1d
            L2f:
                r0 = move-exception
                goto L3c
            L31:
                rx.l<? super java.util.List<T>> r0 = r3.a
                r0.onCompleted()
                r3.unsubscribe()
                return
            L3a:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L7
                throw r0     // Catch: java.lang.Throwable -> L2f
            L3c:
                rx.l<? super java.util.List<T>> r1 = r3.a
                rx.exceptions.a.f(r0, r1)
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                monitor-enter(r1)
                boolean r0 = r1.d     // Catch: java.lang.Throwable -> L7
                if (r0 == 0) goto L9
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
                return
            L7:
                r2 = move-exception
                goto L1b
            L9:
                r0 = 1
                r1.d = r0     // Catch: java.lang.Throwable -> L7
                java.util.List<java.util.List<T>> r0 = r1.c     // Catch: java.lang.Throwable -> L7
                r0.clear()     // Catch: java.lang.Throwable -> L7
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
                rx.l<? super java.util.List<T>> r0 = r1.a
                r0.onError(r2)
                r1.unsubscribe()
                return
            L1b:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
                throw r2
        }

        public void onNext(T r6) {
                r5 = this;
                monitor-enter(r5)
                boolean r0 = r5.d     // Catch: java.lang.Throwable -> L7
                if (r0 == 0) goto L9
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L7
                return
            L7:
                r6 = move-exception
                goto L51
            L9:
                java.util.List<java.util.List<T>> r0 = r5.c     // Catch: java.lang.Throwable -> L7
                java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L7
                r1 = 0
            L10:
                boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L7
                if (r2 == 0) goto L37
                java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L7
                java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> L7
                r2.add(r6)     // Catch: java.lang.Throwable -> L7
                int r3 = r2.size()     // Catch: java.lang.Throwable -> L7
                rx.internal.operators.t1 r4 = r5.e     // Catch: java.lang.Throwable -> L7
                int r4 = r4.d     // Catch: java.lang.Throwable -> L7
                if (r3 != r4) goto L10
                r0.remove()     // Catch: java.lang.Throwable -> L7
                if (r1 != 0) goto L33
                java.util.LinkedList r1 = new java.util.LinkedList     // Catch: java.lang.Throwable -> L7
                r1.<init>()     // Catch: java.lang.Throwable -> L7
            L33:
                r1.add(r2)     // Catch: java.lang.Throwable -> L7
                goto L10
            L37:
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L7
                if (r1 == 0) goto L50
                java.util.Iterator r6 = r1.iterator()
            L3e:
                boolean r0 = r6.hasNext()
                if (r0 == 0) goto L50
                java.lang.Object r0 = r6.next()
                java.util.List r0 = (java.util.List) r0
                rx.l<? super java.util.List<T>> r1 = r5.a
                r1.onNext(r0)
                goto L3e
            L50:
                return
            L51:
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L7
                throw r6
        }

        void s() {
                r5 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                monitor-enter(r5)
                boolean r1 = r5.d     // Catch: java.lang.Throwable -> Lc
                if (r1 == 0) goto Le
                monitor-exit(r5)     // Catch: java.lang.Throwable -> Lc
                return
            Lc:
                r0 = move-exception
                goto L25
            Le:
                java.util.List<java.util.List<T>> r1 = r5.c     // Catch: java.lang.Throwable -> Lc
                r1.add(r0)     // Catch: java.lang.Throwable -> Lc
                monitor-exit(r5)     // Catch: java.lang.Throwable -> Lc
                rx.h$a r1 = r5.b
                rx.internal.operators.t1$b$b r2 = new rx.internal.operators.t1$b$b
                r2.<init>(r5, r0)
                rx.internal.operators.t1 r0 = r5.e
                long r3 = r0.a
                java.util.concurrent.TimeUnit r0 = r0.c
                r1.e(r2, r3, r0)
                return
            L25:
                monitor-exit(r5)     // Catch: java.lang.Throwable -> Lc
                throw r0
        }
    }

    public t1(long r1, long r3, java.util.concurrent.TimeUnit r5, int r6, rx.h r7) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r3
            r0.c = r5
            r0.d = r6
            r0.e = r7
            return
    }

    public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            rx.l r1 = r0.call(r1)
            return r1
    }

    public rx.l<? super T> call(rx.l<? super java.util.List<T>> r8) {
            r7 = this;
            rx.h r0 = r7.e
            rx.h$a r0 = r0.a()
            rx.observers.g r1 = new rx.observers.g
            r1.<init>(r8)
            long r2 = r7.a
            long r4 = r7.b
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L22
            rx.internal.operators.t1$a r2 = new rx.internal.operators.t1$a
            r2.<init>(r7, r1, r0)
            r2.add(r0)
            r8.add(r2)
            r2.j()
            return r2
        L22:
            rx.internal.operators.t1$b r2 = new rx.internal.operators.t1$b
            r2.<init>(r7, r1, r0)
            r2.add(r0)
            r8.add(r2)
            r2.s()
            r2.j()
            return r2
    }
}
