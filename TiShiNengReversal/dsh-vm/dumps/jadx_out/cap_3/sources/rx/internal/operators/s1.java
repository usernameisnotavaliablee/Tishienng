package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class s1<T, TOpening, TClosing> implements rx.e.b<java.util.List<T>, T> {
    final rx.e<? extends TOpening> a;
    final rx.functions.p<? super TOpening, ? extends rx.e<? extends TClosing>> b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends rx.l<TOpening> {
        final /* synthetic */ rx.internal.operators.s1.b a;
        final /* synthetic */ rx.internal.operators.s1 b;

        a(rx.internal.operators.s1 r1, rx.internal.operators.s1.b r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void onCompleted() {
                r1 = this;
                rx.internal.operators.s1$b r0 = r1.a
                r0.onCompleted()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.internal.operators.s1$b r0 = r1.a
                r0.onError(r2)
                return
        }

        public void onNext(TOpening r2) {
                r1 = this;
                rx.internal.operators.s1$b r0 = r1.a
                r0.j(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class b extends rx.l<T> {
        final rx.l<? super java.util.List<T>> a;
        final java.util.List<java.util.List<T>> b;
        boolean c;
        final rx.subscriptions.b d;
        final /* synthetic */ rx.internal.operators.s1 e;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a extends rx.l<TClosing> {
            final /* synthetic */ java.util.List a;
            final /* synthetic */ rx.internal.operators.s1.b b;

            a(rx.internal.operators.s1.b r1, java.util.List r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            public void onCompleted() {
                    r2 = this;
                    rx.internal.operators.s1$b r0 = r2.b
                    rx.subscriptions.b r0 = r0.d
                    r0.f(r2)
                    rx.internal.operators.s1$b r0 = r2.b
                    java.util.List r1 = r2.a
                    r0.g(r1)
                    return
            }

            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    rx.internal.operators.s1$b r0 = r1.b
                    r0.onError(r2)
                    return
            }

            public void onNext(TClosing r2) {
                    r1 = this;
                    rx.internal.operators.s1$b r2 = r1.b
                    rx.subscriptions.b r2 = r2.d
                    r2.f(r1)
                    rx.internal.operators.s1$b r2 = r1.b
                    java.util.List r0 = r1.a
                    r2.g(r0)
                    return
            }
        }

        public b(rx.internal.operators.s1 r1, rx.l<? super java.util.List<T>> r2) {
                r0 = this;
                r0.e = r1
                r0.<init>()
                r0.a = r2
                java.util.LinkedList r1 = new java.util.LinkedList
                r1.<init>()
                r0.b = r1
                rx.subscriptions.b r1 = new rx.subscriptions.b
                r1.<init>()
                r0.d = r1
                r0.add(r1)
                return
        }

        void g(java.util.List<T> r3) {
                r2 = this;
                monitor-enter(r2)
                boolean r0 = r2.c     // Catch: java.lang.Throwable -> L7
                if (r0 == 0) goto L9
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L7
                return
            L7:
                r3 = move-exception
                goto L2c
            L9:
                java.util.List<java.util.List<T>> r0 = r2.b     // Catch: java.lang.Throwable -> L7
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
                if (r0 == 0) goto L2b
                rx.l<? super java.util.List<T>> r0 = r2.a
                r0.onNext(r3)
            L2b:
                return
            L2c:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L7
                throw r3
        }

        void j(TOpening r3) {
                r2 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                monitor-enter(r2)
                boolean r1 = r2.c     // Catch: java.lang.Throwable -> Lc
                if (r1 == 0) goto Le
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
                return
            Lc:
                r3 = move-exception
                goto L31
            Le:
                java.util.List<java.util.List<T>> r1 = r2.b     // Catch: java.lang.Throwable -> Lc
                r1.add(r0)     // Catch: java.lang.Throwable -> Lc
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
                rx.internal.operators.s1 r1 = r2.e     // Catch: java.lang.Throwable -> L2c
                rx.functions.p<? super TOpening, ? extends rx.e<? extends TClosing>> r1 = r1.b     // Catch: java.lang.Throwable -> L2c
                java.lang.Object r3 = r1.call(r3)     // Catch: java.lang.Throwable -> L2c
                rx.e r3 = (rx.e) r3     // Catch: java.lang.Throwable -> L2c
                rx.internal.operators.s1$b$a r1 = new rx.internal.operators.s1$b$a
                r1.<init>(r2, r0)
                rx.subscriptions.b r0 = r2.d
                r0.a(r1)
                r3.J6(r1)
                return
            L2c:
                r3 = move-exception
                rx.exceptions.a.f(r3, r2)
                return
            L31:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
                throw r3
        }

        public void onCompleted() {
                r3 = this;
                monitor-enter(r3)     // Catch: java.lang.Throwable -> L2f
                boolean r0 = r3.c     // Catch: java.lang.Throwable -> L7
                if (r0 == 0) goto L9
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L7
                return
            L7:
                r0 = move-exception
                goto L3a
            L9:
                r0 = 1
                r3.c = r0     // Catch: java.lang.Throwable -> L7
                java.util.LinkedList r0 = new java.util.LinkedList     // Catch: java.lang.Throwable -> L7
                java.util.List<java.util.List<T>> r1 = r3.b     // Catch: java.lang.Throwable -> L7
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L7
                java.util.List<java.util.List<T>> r1 = r3.b     // Catch: java.lang.Throwable -> L7
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
                boolean r0 = r1.c     // Catch: java.lang.Throwable -> L7
                if (r0 == 0) goto L9
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
                return
            L7:
                r2 = move-exception
                goto L1b
            L9:
                r0 = 1
                r1.c = r0     // Catch: java.lang.Throwable -> L7
                java.util.List<java.util.List<T>> r0 = r1.b     // Catch: java.lang.Throwable -> L7
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

        public void onNext(T r3) {
                r2 = this;
                monitor-enter(r2)
                java.util.List<java.util.List<T>> r0 = r2.b     // Catch: java.lang.Throwable -> L17
                java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L17
            L7:
                boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L17
                if (r1 == 0) goto L19
                java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L17
                java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L17
                r1.add(r3)     // Catch: java.lang.Throwable -> L17
                goto L7
            L17:
                r3 = move-exception
                goto L1b
            L19:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
                return
            L1b:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
                throw r3
        }
    }

    public s1(rx.e<? extends TOpening> r1, rx.functions.p<? super TOpening, ? extends rx.e<? extends TClosing>> r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            rx.l r1 = r0.call(r1)
            return r1
    }

    public rx.l<? super T> call(rx.l<? super java.util.List<T>> r3) {
            r2 = this;
            rx.internal.operators.s1$b r0 = new rx.internal.operators.s1$b
            rx.observers.g r1 = new rx.observers.g
            r1.<init>(r3)
            r0.<init>(r2, r1)
            rx.internal.operators.s1$a r1 = new rx.internal.operators.s1$a
            r1.<init>(r2, r0)
            r3.add(r1)
            r3.add(r0)
            rx.e<? extends TOpening> r3 = r2.a
            r3.J6(r1)
            return r0
    }
}
