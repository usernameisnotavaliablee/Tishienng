package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class b4<T, U, V> implements rx.e.b<rx.e<T>, T> {
    final rx.e<? extends U> a;
    final rx.functions.p<? super U, ? extends rx.e<? extends V>> b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends rx.l<U> {
        final /* synthetic */ rx.internal.operators.b4.c a;
        final /* synthetic */ rx.internal.operators.b4 b;

        a(rx.internal.operators.b4 r1, rx.internal.operators.b4.c r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void onCompleted() {
                r1 = this;
                rx.internal.operators.b4$c r0 = r1.a
                r0.onCompleted()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.internal.operators.b4$c r0 = r1.a
                r0.onError(r2)
                return
        }

        public void onNext(U r2) {
                r1 = this;
                rx.internal.operators.b4$c r0 = r1.a
                r0.g(r2)
                return
        }

        public void onStart() {
                r2 = this;
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r2.request(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b<T> {
        final rx.f<T> a;
        final rx.e<T> b;

        public b(rx.f<T> r2, rx.e<T> r3) {
                r1 = this;
                r1.<init>()
                rx.observers.f r0 = new rx.observers.f
                r0.<init>(r2)
                r1.a = r0
                r1.b = r3
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class c extends rx.l<T> {
        final rx.l<? super rx.e<T>> a;
        final rx.subscriptions.b b;
        final java.lang.Object c;
        final java.util.List<rx.internal.operators.b4.b<T>> d;
        boolean e;
        final /* synthetic */ rx.internal.operators.b4 f;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a extends rx.l<V> {
            boolean a;
            final /* synthetic */ rx.internal.operators.b4.b b;
            final /* synthetic */ rx.internal.operators.b4.c c;

            a(rx.internal.operators.b4.c r1, rx.internal.operators.b4.b r2) {
                    r0 = this;
                    r0.c = r1
                    r0.b = r2
                    r0.<init>()
                    r1 = 1
                    r0.a = r1
                    return
            }

            public void onCompleted() {
                    r2 = this;
                    boolean r0 = r2.a
                    if (r0 == 0) goto L15
                    r0 = 0
                    r2.a = r0
                    rx.internal.operators.b4$c r0 = r2.c
                    rx.internal.operators.b4$b r1 = r2.b
                    r0.s(r1)
                    rx.internal.operators.b4$c r0 = r2.c
                    rx.subscriptions.b r0 = r0.b
                    r0.f(r2)
                L15:
                    return
            }

            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    rx.internal.operators.b4$c r0 = r1.c
                    r0.onError(r2)
                    return
            }

            public void onNext(V r1) {
                    r0 = this;
                    r0.onCompleted()
                    return
            }
        }

        public c(rx.internal.operators.b4 r1, rx.l<? super rx.e<T>> r2, rx.subscriptions.b r3) {
                r0 = this;
                r0.f = r1
                r0.<init>()
                rx.observers.g r1 = new rx.observers.g
                r1.<init>(r2)
                r0.a = r1
                java.lang.Object r1 = new java.lang.Object
                r1.<init>()
                r0.c = r1
                java.util.LinkedList r1 = new java.util.LinkedList
                r1.<init>()
                r0.d = r1
                r0.b = r3
                return
        }

        void g(U r4) {
                r3 = this;
                rx.internal.operators.b4$b r0 = r3.j()
                java.lang.Object r1 = r3.c
                monitor-enter(r1)
                boolean r2 = r3.e     // Catch: java.lang.Throwable -> Ld
                if (r2 == 0) goto Lf
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
                return
            Ld:
                r4 = move-exception
                goto L39
            Lf:
                java.util.List<rx.internal.operators.b4$b<T>> r2 = r3.d     // Catch: java.lang.Throwable -> Ld
                r2.add(r0)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
                rx.l<? super rx.e<T>> r1 = r3.a
                rx.e<T> r2 = r0.b
                r1.onNext(r2)
                rx.internal.operators.b4 r1 = r3.f     // Catch: java.lang.Throwable -> L34
                rx.functions.p<? super U, ? extends rx.e<? extends V>> r1 = r1.b     // Catch: java.lang.Throwable -> L34
                java.lang.Object r4 = r1.call(r4)     // Catch: java.lang.Throwable -> L34
                rx.e r4 = (rx.e) r4     // Catch: java.lang.Throwable -> L34
                rx.internal.operators.b4$c$a r1 = new rx.internal.operators.b4$c$a
                r1.<init>(r3, r0)
                rx.subscriptions.b r0 = r3.b
                r0.a(r1)
                r4.J6(r1)
                return
            L34:
                r4 = move-exception
                r3.onError(r4)
                return
            L39:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
                throw r4
        }

        rx.internal.operators.b4.b<T> j() {
                r2 = this;
                rx.subjects.i r0 = rx.subjects.i.y7()
                rx.internal.operators.b4$b r1 = new rx.internal.operators.b4$b
                r1.<init>(r0, r0)
                return r1
        }

        public void onCompleted() {
                r3 = this;
                java.lang.Object r0 = r3.c     // Catch: java.lang.Throwable -> L36
                monitor-enter(r0)     // Catch: java.lang.Throwable -> L36
                boolean r1 = r3.e     // Catch: java.lang.Throwable -> Le
                if (r1 == 0) goto L10
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            L8:
                rx.subscriptions.b r0 = r3.b
                r0.unsubscribe()
                return
            Le:
                r1 = move-exception
                goto L3e
            L10:
                r1 = 1
                r3.e = r1     // Catch: java.lang.Throwable -> Le
                java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Le
                java.util.List<rx.internal.operators.b4$b<T>> r2 = r3.d     // Catch: java.lang.Throwable -> Le
                r1.<init>(r2)     // Catch: java.lang.Throwable -> Le
                java.util.List<rx.internal.operators.b4$b<T>> r2 = r3.d     // Catch: java.lang.Throwable -> Le
                r2.clear()     // Catch: java.lang.Throwable -> Le
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
                java.util.Iterator r0 = r1.iterator()     // Catch: java.lang.Throwable -> L36
            L24:
                boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L36
                if (r1 == 0) goto L38
                java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L36
                rx.internal.operators.b4$b r1 = (rx.internal.operators.b4.b) r1     // Catch: java.lang.Throwable -> L36
                rx.f<T> r1 = r1.a     // Catch: java.lang.Throwable -> L36
                r1.onCompleted()     // Catch: java.lang.Throwable -> L36
                goto L24
            L36:
                r0 = move-exception
                goto L40
            L38:
                rx.l<? super rx.e<T>> r0 = r3.a     // Catch: java.lang.Throwable -> L36
                r0.onCompleted()     // Catch: java.lang.Throwable -> L36
                goto L8
            L3e:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
                throw r1     // Catch: java.lang.Throwable -> L36
            L40:
                rx.subscriptions.b r1 = r3.b
                r1.unsubscribe()
                throw r0
        }

        public void onError(java.lang.Throwable r4) {
                r3 = this;
                java.lang.Object r0 = r3.c     // Catch: java.lang.Throwable -> L36
                monitor-enter(r0)     // Catch: java.lang.Throwable -> L36
                boolean r1 = r3.e     // Catch: java.lang.Throwable -> Le
                if (r1 == 0) goto L10
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            L8:
                rx.subscriptions.b r4 = r3.b
                r4.unsubscribe()
                return
            Le:
                r4 = move-exception
                goto L3e
            L10:
                r1 = 1
                r3.e = r1     // Catch: java.lang.Throwable -> Le
                java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Le
                java.util.List<rx.internal.operators.b4$b<T>> r2 = r3.d     // Catch: java.lang.Throwable -> Le
                r1.<init>(r2)     // Catch: java.lang.Throwable -> Le
                java.util.List<rx.internal.operators.b4$b<T>> r2 = r3.d     // Catch: java.lang.Throwable -> Le
                r2.clear()     // Catch: java.lang.Throwable -> Le
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
                java.util.Iterator r0 = r1.iterator()     // Catch: java.lang.Throwable -> L36
            L24:
                boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L36
                if (r1 == 0) goto L38
                java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L36
                rx.internal.operators.b4$b r1 = (rx.internal.operators.b4.b) r1     // Catch: java.lang.Throwable -> L36
                rx.f<T> r1 = r1.a     // Catch: java.lang.Throwable -> L36
                r1.onError(r4)     // Catch: java.lang.Throwable -> L36
                goto L24
            L36:
                r4 = move-exception
                goto L40
            L38:
                rx.l<? super rx.e<T>> r0 = r3.a     // Catch: java.lang.Throwable -> L36
                r0.onError(r4)     // Catch: java.lang.Throwable -> L36
                goto L8
            L3e:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
                throw r4     // Catch: java.lang.Throwable -> L36
            L40:
                rx.subscriptions.b r0 = r3.b
                r0.unsubscribe()
                throw r4
        }

        public void onNext(T r4) {
                r3 = this;
                java.lang.Object r0 = r3.c
                monitor-enter(r0)
                boolean r1 = r3.e     // Catch: java.lang.Throwable -> L9
                if (r1 == 0) goto Lb
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
                return
            L9:
                r4 = move-exception
                goto L2a
            Lb:
                java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L9
                java.util.List<rx.internal.operators.b4$b<T>> r2 = r3.d     // Catch: java.lang.Throwable -> L9
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L9
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
                java.util.Iterator r0 = r1.iterator()
            L17:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L29
                java.lang.Object r1 = r0.next()
                rx.internal.operators.b4$b r1 = (rx.internal.operators.b4.b) r1
                rx.f<T> r1 = r1.a
                r1.onNext(r4)
                goto L17
            L29:
                return
            L2a:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
                throw r4
        }

        public void onStart() {
                r2 = this;
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r2.request(r0)
                return
        }

        void s(rx.internal.operators.b4.b<T> r4) {
                r3 = this;
                java.lang.Object r0 = r3.c
                monitor-enter(r0)
                boolean r1 = r3.e     // Catch: java.lang.Throwable -> L9
                if (r1 == 0) goto Lb
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
                return
            L9:
                r4 = move-exception
                goto L2e
            Lb:
                java.util.List<rx.internal.operators.b4$b<T>> r1 = r3.d     // Catch: java.lang.Throwable -> L9
                java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L9
            L11:
                boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L9
                if (r2 == 0) goto L24
                java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L9
                rx.internal.operators.b4$b r2 = (rx.internal.operators.b4.b) r2     // Catch: java.lang.Throwable -> L9
                if (r2 != r4) goto L11
                r1.remove()     // Catch: java.lang.Throwable -> L9
                r1 = 1
                goto L25
            L24:
                r1 = 0
            L25:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
                if (r1 == 0) goto L2d
                rx.f<T> r4 = r4.a
                r4.onCompleted()
            L2d:
                return
            L2e:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
                throw r4
        }
    }

    public b4(rx.e<? extends U> r1, rx.functions.p<? super U, ? extends rx.e<? extends V>> r2) {
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

    public rx.l<? super T> call(rx.l<? super rx.e<T>> r3) {
            r2 = this;
            rx.subscriptions.b r0 = new rx.subscriptions.b
            r0.<init>()
            r3.add(r0)
            rx.internal.operators.b4$c r1 = new rx.internal.operators.b4$c
            r1.<init>(r2, r3, r0)
            rx.internal.operators.b4$a r3 = new rx.internal.operators.b4$a
            r3.<init>(r2, r1)
            r0.a(r1)
            r0.a(r3)
            rx.e<? extends U> r0 = r2.a
            r0.J6(r3)
            return r1
    }
}
