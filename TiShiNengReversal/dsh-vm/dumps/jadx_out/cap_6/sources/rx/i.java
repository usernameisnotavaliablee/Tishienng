package rx;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class i<T> {
    final rx.i.t<T> a;

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a<R> implements rx.functions.y<R> {
        final /* synthetic */ rx.functions.x a;

        a(rx.functions.x r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // rx.functions.y
        public R call(java.lang.Object... r11) {
                r10 = this;
                rx.functions.x r0 = r10.a
                r1 = 0
                r1 = r11[r1]
                r2 = 1
                r2 = r11[r2]
                r3 = 2
                r3 = r11[r3]
                r4 = 3
                r4 = r11[r4]
                r5 = 4
                r5 = r11[r5]
                r6 = 5
                r6 = r11[r6]
                r7 = 6
                r7 = r11[r7]
                r8 = 7
                r8 = r11[r8]
                r9 = 8
                r9 = r11[r9]
                java.lang.Object r11 = r0.call(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                return r11
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends rx.k<T> {
        final /* synthetic */ rx.functions.b b;
        final /* synthetic */ rx.functions.b c;
        final /* synthetic */ rx.i d;

        b(rx.i r1, rx.functions.b r2, rx.functions.b r3) {
                r0 = this;
                r0.d = r1
                r0.b = r2
                r0.c = r3
                r0.<init>()
                return
        }

        @Override // rx.k
        public final void d(T r2) {
                r1 = this;
                rx.functions.b r0 = r1.c     // Catch: java.lang.Throwable -> L9
                r0.call(r2)     // Catch: java.lang.Throwable -> L9
                r1.unsubscribe()
                return
            L9:
                r2 = move-exception
                r1.unsubscribe()
                throw r2
        }

        @Override // rx.k
        public final void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.functions.b r0 = r1.b     // Catch: java.lang.Throwable -> L9
                r0.call(r2)     // Catch: java.lang.Throwable -> L9
                r1.unsubscribe()
                return
            L9:
                r2 = move-exception
                r1.unsubscribe()
                throw r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends rx.k<T> {
        final /* synthetic */ rx.f b;
        final /* synthetic */ rx.i c;

        c(rx.i r1, rx.f r2) {
                r0 = this;
                r0.c = r1
                r0.b = r2
                r0.<init>()
                return
        }

        @Override // rx.k
        public void d(T r2) {
                r1 = this;
                rx.f r0 = r1.b
                r0.onNext(r2)
                rx.f r2 = r1.b
                r2.onCompleted()
                return
        }

        @Override // rx.k
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.f r0 = r1.b
                r0.onError(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d implements rx.i.t<T> {
        final /* synthetic */ rx.h a;
        final /* synthetic */ rx.i b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements rx.functions.a {
            final /* synthetic */ rx.k a;
            final /* synthetic */ rx.h.a b;
            final /* synthetic */ rx.i.d c;

            /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
            /* renamed from: rx.i$d$a$a, reason: collision with other inner class name */
            class C0112a extends rx.k<T> {
                final /* synthetic */ rx.i.d.a b;

                C0112a(rx.i.d.a r1) {
                        r0 = this;
                        r0.b = r1
                        r0.<init>()
                        return
                }

                @Override // rx.k
                public void d(T r2) {
                        r1 = this;
                        rx.i$d$a r0 = r1.b     // Catch: java.lang.Throwable -> Lf
                        rx.k r0 = r0.a     // Catch: java.lang.Throwable -> Lf
                        r0.d(r2)     // Catch: java.lang.Throwable -> Lf
                        rx.i$d$a r2 = r1.b
                        rx.h$a r2 = r2.b
                        r2.unsubscribe()
                        return
                    Lf:
                        r2 = move-exception
                        rx.i$d$a r0 = r1.b
                        rx.h$a r0 = r0.b
                        r0.unsubscribe()
                        throw r2
                }

                @Override // rx.k
                public void onError(java.lang.Throwable r2) {
                        r1 = this;
                        rx.i$d$a r0 = r1.b     // Catch: java.lang.Throwable -> Lf
                        rx.k r0 = r0.a     // Catch: java.lang.Throwable -> Lf
                        r0.onError(r2)     // Catch: java.lang.Throwable -> Lf
                        rx.i$d$a r2 = r1.b
                        rx.h$a r2 = r2.b
                        r2.unsubscribe()
                        return
                    Lf:
                        r2 = move-exception
                        rx.i$d$a r0 = r1.b
                        rx.h$a r0 = r0.b
                        r0.unsubscribe()
                        throw r2
                }
            }

            a(rx.i.d r1, rx.k r2, rx.h.a r3) {
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
                    rx.i$d$a$a r0 = new rx.i$d$a$a
                    r0.<init>(r2)
                    rx.k r1 = r2.a
                    r1.b(r0)
                    rx.i$d r1 = r2.c
                    rx.i r1 = r1.b
                    r1.j0(r0)
                    return
            }
        }

        d(rx.i r1, rx.h r2) {
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
                rx.h r0 = r2.a
                rx.h$a r0 = r0.a()
                r3.b(r0)
                rx.i$d$a r1 = new rx.i$d$a
                r1.<init>(r2, r3, r0)
                r0.d(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class e implements rx.functions.o<rx.i<T>> {
        final /* synthetic */ rx.i a;

        e(rx.i r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // rx.functions.o, java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ java.lang.Object call() {
                r1 = this;
                rx.i r0 = r1.call()
                return r0
        }

        @Override // rx.functions.o, java.util.concurrent.Callable
        public rx.i<T> call() {
                r1 = this;
                java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException
                r0.<init>()
                rx.i r0 = rx.i.y(r0)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class f implements rx.functions.b<java.lang.Throwable> {
        final /* synthetic */ rx.functions.b a;
        final /* synthetic */ rx.i b;

        f(rx.i r1, rx.functions.b r2) {
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
                r0.call(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class g implements rx.functions.b<T> {
        final /* synthetic */ rx.functions.b a;
        final /* synthetic */ rx.i b;

        g(rx.i r1, rx.functions.b r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // rx.functions.b
        public void call(T r2) {
                r1 = this;
                rx.functions.b r0 = r1.a
                rx.Notification r2 = rx.Notification.e(r2)
                r0.call(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class h implements rx.functions.b<java.lang.Throwable> {
        final /* synthetic */ rx.functions.b a;
        final /* synthetic */ rx.i b;

        h(rx.i r1, rx.functions.b r2) {
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
    /* renamed from: rx.i$i, reason: collision with other inner class name */
    static class C0113i implements rx.i.t<T> {
        final /* synthetic */ java.util.concurrent.Callable a;

        C0113i(java.util.concurrent.Callable r1) {
                r0 = this;
                r0.a = r1
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

        public void call(rx.k<? super T> r2) {
                r1 = this;
                java.util.concurrent.Callable r0 = r1.a     // Catch: java.lang.Throwable -> Lc
                java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> Lc
                rx.i r0 = (rx.i) r0     // Catch: java.lang.Throwable -> Lc
                r0.j0(r2)
                return
            Lc:
                r0 = move-exception
                rx.exceptions.a.e(r0)
                r2.onError(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class j implements rx.i.t<T> {
        final /* synthetic */ rx.h a;
        final /* synthetic */ rx.i b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a extends rx.k<T> {
            final /* synthetic */ rx.k b;
            final /* synthetic */ rx.i.j c;

            a(rx.i.j r1, rx.k r2) {
                    r0 = this;
                    r0.c = r1
                    r0.b = r2
                    r0.<init>()
                    return
            }

            @Override // rx.k
            public void d(T r2) {
                    r1 = this;
                    rx.k r0 = r1.b
                    r0.d(r2)
                    return
            }

            @Override // rx.k
            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    rx.k r0 = r1.b
                    r0.onError(r2)
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class b implements rx.functions.a {
            final /* synthetic */ rx.k a;
            final /* synthetic */ rx.i.j b;

            /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
            class a implements rx.functions.a {
                final /* synthetic */ rx.h.a a;
                final /* synthetic */ rx.i.j.b b;

                a(rx.i.j.b r1, rx.h.a r2) {
                        r0 = this;
                        r0.b = r1
                        r0.a = r2
                        r0.<init>()
                        return
                }

                @Override // rx.functions.a
                public void call() {
                        r2 = this;
                        rx.i$j$b r0 = r2.b     // Catch: java.lang.Throwable -> Ld
                        rx.k r0 = r0.a     // Catch: java.lang.Throwable -> Ld
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

            b(rx.i.j r1, rx.k r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            @Override // rx.functions.a
            public void call() {
                    r2 = this;
                    rx.i$j r0 = r2.b
                    rx.h r0 = r0.a
                    rx.h$a r0 = r0.a()
                    rx.i$j$b$a r1 = new rx.i$j$b$a
                    r1.<init>(r2, r0)
                    r0.d(r1)
                    return
            }
        }

        j(rx.i r1, rx.h r2) {
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
                rx.i$j$a r0 = new rx.i$j$a
                r0.<init>(r2, r3)
                rx.i$j$b r1 = new rx.i$j$b
                r1.<init>(r2, r0)
                rx.m r1 = rx.subscriptions.f.a(r1)
                r3.b(r1)
                rx.i r3 = r2.b
                r3.j0(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class k implements rx.i.t<T> {
        final /* synthetic */ java.lang.Throwable a;

        k(java.lang.Throwable r1) {
                r0 = this;
                r0.a = r1
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

        public void call(rx.k<? super T> r2) {
                r1 = this;
                java.lang.Throwable r0 = r1.a
                r2.onError(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class l implements rx.i.t<T> {
        final /* synthetic */ rx.i a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a extends rx.k<rx.i<? extends T>> {
            final /* synthetic */ rx.k b;
            final /* synthetic */ rx.i.l c;

            a(rx.i.l r1, rx.k r2) {
                    r0 = this;
                    r0.c = r1
                    r0.b = r2
                    r0.<init>()
                    return
            }

            @Override // rx.k
            public /* bridge */ /* synthetic */ void d(java.lang.Object r1) {
                    r0 = this;
                    rx.i r1 = (rx.i) r1
                    r0.e(r1)
                    return
            }

            public void e(rx.i<? extends T> r2) {
                    r1 = this;
                    rx.k r0 = r1.b
                    r2.j0(r0)
                    return
            }

            @Override // rx.k
            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    rx.k r0 = r1.b
                    r0.onError(r2)
                    return
            }
        }

        l(rx.i r1) {
                r0 = this;
                r0.a = r1
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

        public void call(rx.k<? super T> r2) {
                r1 = this;
                rx.i$l$a r0 = new rx.i$l$a
                r0.<init>(r1, r2)
                r2.b(r0)
                rx.i r2 = r1.a
                r2.j0(r0)
                return
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class m<R> implements rx.functions.y<R> {
        final /* synthetic */ rx.functions.q a;

        m(rx.functions.q r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // rx.functions.y
        public R call(java.lang.Object... r4) {
                r3 = this;
                rx.functions.q r0 = r3.a
                r1 = 0
                r1 = r4[r1]
                r2 = 1
                r4 = r4[r2]
                java.lang.Object r4 = r0.call(r1, r4)
                return r4
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class n<R> implements rx.functions.y<R> {
        final /* synthetic */ rx.functions.r a;

        n(rx.functions.r r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // rx.functions.y
        public R call(java.lang.Object... r5) {
                r4 = this;
                rx.functions.r r0 = r4.a
                r1 = 0
                r1 = r5[r1]
                r2 = 1
                r2 = r5[r2]
                r3 = 2
                r5 = r5[r3]
                java.lang.Object r5 = r0.call(r1, r2, r5)
                return r5
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class o<R> implements rx.functions.y<R> {
        final /* synthetic */ rx.functions.s a;

        o(rx.functions.s r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // rx.functions.y
        public R call(java.lang.Object... r6) {
                r5 = this;
                rx.functions.s r0 = r5.a
                r1 = 0
                r1 = r6[r1]
                r2 = 1
                r2 = r6[r2]
                r3 = 2
                r3 = r6[r3]
                r4 = 3
                r6 = r6[r4]
                java.lang.Object r6 = r0.call(r1, r2, r3, r6)
                return r6
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class p<R> implements rx.functions.y<R> {
        final /* synthetic */ rx.functions.t a;

        p(rx.functions.t r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // rx.functions.y
        public R call(java.lang.Object... r7) {
                r6 = this;
                rx.functions.t r0 = r6.a
                r1 = 0
                r1 = r7[r1]
                r2 = 1
                r2 = r7[r2]
                r3 = 2
                r3 = r7[r3]
                r4 = 3
                r4 = r7[r4]
                r5 = 4
                r5 = r7[r5]
                java.lang.Object r7 = r0.call(r1, r2, r3, r4, r5)
                return r7
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class q<R> implements rx.functions.y<R> {
        final /* synthetic */ rx.functions.u a;

        q(rx.functions.u r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // rx.functions.y
        public R call(java.lang.Object... r8) {
                r7 = this;
                rx.functions.u r0 = r7.a
                r1 = 0
                r1 = r8[r1]
                r2 = 1
                r2 = r8[r2]
                r3 = 2
                r3 = r8[r3]
                r4 = 3
                r4 = r8[r4]
                r5 = 4
                r5 = r8[r5]
                r6 = 5
                r6 = r8[r6]
                java.lang.Object r8 = r0.call(r1, r2, r3, r4, r5, r6)
                return r8
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class r<R> implements rx.functions.y<R> {
        final /* synthetic */ rx.functions.v a;

        r(rx.functions.v r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // rx.functions.y
        public R call(java.lang.Object... r9) {
                r8 = this;
                rx.functions.v r0 = r8.a
                r1 = 0
                r1 = r9[r1]
                r2 = 1
                r2 = r9[r2]
                r3 = 2
                r3 = r9[r3]
                r4 = 3
                r4 = r9[r4]
                r5 = 4
                r5 = r9[r5]
                r6 = 5
                r6 = r9[r6]
                r7 = 6
                r7 = r9[r7]
                java.lang.Object r9 = r0.call(r1, r2, r3, r4, r5, r6, r7)
                return r9
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class s<R> implements rx.functions.y<R> {
        final /* synthetic */ rx.functions.w a;

        s(rx.functions.w r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // rx.functions.y
        public R call(java.lang.Object... r10) {
                r9 = this;
                rx.functions.w r0 = r9.a
                r1 = 0
                r1 = r10[r1]
                r2 = 1
                r2 = r10[r2]
                r3 = 2
                r3 = r10[r3]
                r4 = 3
                r4 = r10[r4]
                r5 = 4
                r5 = r10[r5]
                r6 = 5
                r6 = r10[r6]
                r7 = 6
                r7 = r10[r7]
                r8 = 7
                r8 = r10[r8]
                java.lang.Object r10 = r0.call(r1, r2, r3, r4, r5, r6, r7, r8)
                return r10
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface t<T> extends rx.functions.b<rx.k<? super T>> {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface u<T, R> extends rx.functions.p<rx.i<T>, rx.i<R>> {
    }

    @java.lang.Deprecated
    protected i(rx.e.a<T> r2) {
            r1 = this;
            r1.<init>()
            rx.internal.operators.p4 r0 = new rx.internal.operators.p4
            r0.<init>(r2)
            rx.i$t r2 = rx.plugins.c.H(r0)
            r1.a = r2
            return
    }

    protected i(rx.i.t<T> r1) {
            r0 = this;
            r0.<init>()
            rx.i$t r1 = rx.plugins.c.H(r1)
            r0.a = r1
            return
    }

    private rx.m B0(rx.l<? super T> r4, boolean r5) {
            r3 = this;
            if (r5 == 0) goto L8
            r4.onStart()     // Catch: java.lang.Throwable -> L6
            goto L8
        L6:
            r5 = move-exception
            goto L1a
        L8:
            rx.i$t<T> r5 = r3.a     // Catch: java.lang.Throwable -> L6
            rx.i$t r5 = rx.plugins.c.T(r3, r5)     // Catch: java.lang.Throwable -> L6
            rx.k r0 = rx.internal.operators.q4.a(r4)     // Catch: java.lang.Throwable -> L6
            r5.call(r0)     // Catch: java.lang.Throwable -> L6
            rx.m r4 = rx.plugins.c.S(r4)     // Catch: java.lang.Throwable -> L6
            return r4
        L1a:
            rx.exceptions.a.e(r5)
            java.lang.Throwable r0 = rx.plugins.c.Q(r5)     // Catch: java.lang.Throwable -> L29
            r4.onError(r0)     // Catch: java.lang.Throwable -> L29
            rx.m r4 = rx.subscriptions.f.e()
            return r4
        L29:
            r4 = move-exception
            rx.exceptions.a.e(r4)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Error occurred attempting to subscribe ["
            r1.append(r2)
            java.lang.String r5 = r5.getMessage()
            r1.append(r5)
            java.lang.String r5 = "] and then again while trying to pass to onError."
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5, r4)
            rx.plugins.c.Q(r0)
            throw r0
    }

    public static <T> rx.i<T> C(java.util.concurrent.Future<? extends T> r4) {
            rx.internal.operators.o4 r0 = new rx.internal.operators.o4
            r1 = 0
            r3 = 0
            r0.<init>(r4, r1, r3)
            rx.i r4 = n(r0)
            return r4
    }

    public static <T> rx.i<T> D(java.util.concurrent.Future<? extends T> r1, long r2, java.util.concurrent.TimeUnit r4) {
            if (r4 == 0) goto Lc
            rx.internal.operators.o4 r0 = new rx.internal.operators.o4
            r0.<init>(r1, r2, r4)
            rx.i r1 = n(r0)
            return r1
        Lc:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "unit is null"
            r1.<init>(r2)
            throw r1
    }

    public static <T, Resource> rx.i<T> D0(rx.functions.o<Resource> r1, rx.functions.p<? super Resource, ? extends rx.i<? extends T>> r2, rx.functions.b<? super Resource> r3) {
            r0 = 0
            rx.i r1 = E0(r1, r2, r3, r0)
            return r1
    }

    public static <T> rx.i<T> E(java.util.concurrent.Future<? extends T> r0, rx.h r1) {
            rx.i r0 = C(r0)
            rx.i r0 = r0.n0(r1)
            return r0
    }

    public static <T, Resource> rx.i<T> E0(rx.functions.o<Resource> r1, rx.functions.p<? super Resource, ? extends rx.i<? extends T>> r2, rx.functions.b<? super Resource> r3, boolean r4) {
            if (r1 == 0) goto L20
            if (r2 == 0) goto L18
            if (r3 == 0) goto L10
            rx.internal.operators.v4 r0 = new rx.internal.operators.v4
            r0.<init>(r1, r2, r3, r4)
            rx.i r1 = n(r0)
            return r1
        L10:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "disposeAction is null"
            r1.<init>(r2)
            throw r1
        L18:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "singleFactory is null"
            r1.<init>(r2)
            throw r1
        L20:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "resourceFactory is null"
            r1.<init>(r2)
            throw r1
    }

    public static <T> rx.i<T> F(java.util.concurrent.Callable<? extends T> r1) {
            rx.internal.operators.m4 r0 = new rx.internal.operators.m4
            r0.<init>(r1)
            rx.i r1 = n(r0)
            return r1
    }

    public static <R> rx.i<R> F0(java.lang.Iterable<? extends rx.i<?>> r0, rx.functions.y<? extends R> r1) {
            rx.i[] r0 = H(r0)
            rx.i r0 = rx.internal.operators.y4.a(r0, r1)
            return r0
    }

    public static <T> rx.i<T> G(rx.functions.b<rx.j<T>> r1) {
            if (r1 == 0) goto Lc
            rx.internal.operators.n4 r0 = new rx.internal.operators.n4
            r0.<init>(r1)
            rx.i r1 = n(r0)
            return r1
        Lc:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "producer is null"
            r1.<init>(r0)
            throw r1
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> rx.i<R> G0(rx.i<? extends T1> r2, rx.i<? extends T2> r3, rx.i<? extends T3> r4, rx.i<? extends T4> r5, rx.i<? extends T5> r6, rx.i<? extends T6> r7, rx.i<? extends T7> r8, rx.i<? extends T8> r9, rx.i<? extends T9> r10, rx.functions.x<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> r11) {
            r0 = 9
            rx.i[] r0 = new rx.i[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            r2 = 3
            r0[r2] = r5
            r2 = 4
            r0[r2] = r6
            r2 = 5
            r0[r2] = r7
            r2 = 6
            r0[r2] = r8
            r2 = 7
            r0[r2] = r9
            r2 = 8
            r0[r2] = r10
            rx.i$a r2 = new rx.i$a
            r2.<init>(r11)
            rx.i r2 = rx.internal.operators.y4.a(r0, r2)
            return r2
    }

    static <T> rx.i<? extends T>[] H(java.lang.Iterable<? extends rx.i<? extends T>> r5) {
            boolean r0 = r5 instanceof java.util.Collection
            if (r0 == 0) goto L13
            java.util.Collection r5 = (java.util.Collection) r5
            int r0 = r5.size()
            rx.i[] r0 = new rx.i[r0]
            java.lang.Object[] r5 = r5.toArray(r0)
            rx.i[] r5 = (rx.i[]) r5
            return r5
        L13:
            r0 = 8
            rx.i[] r0 = new rx.i[r0]
            java.util.Iterator r5 = r5.iterator()
            r1 = 0
            r2 = 0
        L1d:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L3a
            java.lang.Object r3 = r5.next()
            rx.i r3 = (rx.i) r3
            int r4 = r0.length
            if (r2 != r4) goto L35
            int r4 = r2 >> 2
            int r4 = r4 + r2
            rx.i[] r4 = new rx.i[r4]
            java.lang.System.arraycopy(r0, r1, r4, r1, r2)
            r0 = r4
        L35:
            r0[r2] = r3
            int r2 = r2 + 1
            goto L1d
        L3a:
            int r5 = r0.length
            if (r5 != r2) goto L3e
            return r0
        L3e:
            rx.i[] r5 = new rx.i[r2]
            java.lang.System.arraycopy(r0, r1, r5, r1, r2)
            return r5
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> rx.i<R> H0(rx.i<? extends T1> r2, rx.i<? extends T2> r3, rx.i<? extends T3> r4, rx.i<? extends T4> r5, rx.i<? extends T5> r6, rx.i<? extends T6> r7, rx.i<? extends T7> r8, rx.i<? extends T8> r9, rx.functions.w<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> r10) {
            r0 = 8
            rx.i[] r0 = new rx.i[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            r2 = 3
            r0[r2] = r5
            r2 = 4
            r0[r2] = r6
            r2 = 5
            r0[r2] = r7
            r2 = 6
            r0[r2] = r8
            r2 = 7
            r0[r2] = r9
            rx.i$s r2 = new rx.i$s
            r2.<init>(r10)
            rx.i r2 = rx.internal.operators.y4.a(r0, r2)
            return r2
    }

    public static <T> rx.i<T> I(T r0) {
            rx.internal.util.l r0 = rx.internal.util.l.P0(r0)
            return r0
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> rx.i<R> I0(rx.i<? extends T1> r2, rx.i<? extends T2> r3, rx.i<? extends T3> r4, rx.i<? extends T4> r5, rx.i<? extends T5> r6, rx.i<? extends T6> r7, rx.i<? extends T7> r8, rx.functions.v<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> r9) {
            r0 = 7
            rx.i[] r0 = new rx.i[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            r2 = 3
            r0[r2] = r5
            r2 = 4
            r0[r2] = r6
            r2 = 5
            r0[r2] = r7
            r2 = 6
            r0[r2] = r8
            rx.i$r r2 = new rx.i$r
            r2.<init>(r9)
            rx.i r2 = rx.internal.operators.y4.a(r0, r2)
            return r2
    }

    public static <T1, T2, T3, T4, T5, T6, R> rx.i<R> J0(rx.i<? extends T1> r2, rx.i<? extends T2> r3, rx.i<? extends T3> r4, rx.i<? extends T4> r5, rx.i<? extends T5> r6, rx.i<? extends T6> r7, rx.functions.u<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> r8) {
            r0 = 6
            rx.i[] r0 = new rx.i[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            r2 = 3
            r0[r2] = r5
            r2 = 4
            r0[r2] = r6
            r2 = 5
            r0[r2] = r7
            rx.i$q r2 = new rx.i$q
            r2.<init>(r8)
            rx.i r2 = rx.internal.operators.y4.a(r0, r2)
            return r2
    }

    public static <T1, T2, T3, T4, T5, R> rx.i<R> K0(rx.i<? extends T1> r2, rx.i<? extends T2> r3, rx.i<? extends T3> r4, rx.i<? extends T4> r5, rx.i<? extends T5> r6, rx.functions.t<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> r7) {
            r0 = 5
            rx.i[] r0 = new rx.i[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            r2 = 3
            r0[r2] = r5
            r2 = 4
            r0[r2] = r6
            rx.i$p r2 = new rx.i$p
            r2.<init>(r7)
            rx.i r2 = rx.internal.operators.y4.a(r0, r2)
            return r2
    }

    public static <T> rx.e<T> L(rx.e<? extends rx.i<? extends T>> r1) {
            r0 = 2147483647(0x7fffffff, float:NaN)
            rx.e r1 = M(r1, r0)
            return r1
    }

    public static <T1, T2, T3, T4, R> rx.i<R> L0(rx.i<? extends T1> r2, rx.i<? extends T2> r3, rx.i<? extends T3> r4, rx.i<? extends T4> r5, rx.functions.s<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> r6) {
            r0 = 4
            rx.i[] r0 = new rx.i[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            r2 = 3
            r0[r2] = r5
            rx.i$o r2 = new rx.i$o
            r2.<init>(r6)
            rx.i r2 = rx.internal.operators.y4.a(r0, r2)
            return r2
    }

    public static <T> rx.e<T> M(rx.e<? extends rx.i<? extends T>> r2, int r3) {
            rx.functions.p r0 = rx.internal.util.n.c()
            r1 = 0
            rx.e r2 = r2.q2(r0, r1, r3)
            return r2
    }

    public static <T1, T2, T3, R> rx.i<R> M0(rx.i<? extends T1> r2, rx.i<? extends T2> r3, rx.i<? extends T3> r4, rx.functions.r<? super T1, ? super T2, ? super T3, ? extends R> r5) {
            r0 = 3
            rx.i[] r0 = new rx.i[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            rx.i$n r2 = new rx.i$n
            r2.<init>(r5)
            rx.i r2 = rx.internal.operators.y4.a(r0, r2)
            return r2
    }

    public static <T> rx.e<T> N(rx.i<? extends T> r0, rx.i<? extends T> r1) {
            rx.e r0 = a(r0)
            rx.e r1 = a(r1)
            rx.e r0 = rx.e.j3(r0, r1)
            return r0
    }

    public static <T1, T2, R> rx.i<R> N0(rx.i<? extends T1> r2, rx.i<? extends T2> r3, rx.functions.q<? super T1, ? super T2, ? extends R> r4) {
            r0 = 2
            rx.i[] r0 = new rx.i[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            rx.i$m r2 = new rx.i$m
            r2.<init>(r4)
            rx.i r2 = rx.internal.operators.y4.a(r0, r2)
            return r2
    }

    public static <T> rx.e<T> O(rx.i<? extends T> r0, rx.i<? extends T> r1, rx.i<? extends T> r2) {
            rx.e r0 = a(r0)
            rx.e r1 = a(r1)
            rx.e r2 = a(r2)
            rx.e r0 = rx.e.k3(r0, r1, r2)
            return r0
    }

    public static <T> rx.e<T> P(rx.i<? extends T> r0, rx.i<? extends T> r1, rx.i<? extends T> r2, rx.i<? extends T> r3) {
            rx.e r0 = a(r0)
            rx.e r1 = a(r1)
            rx.e r2 = a(r2)
            rx.e r3 = a(r3)
            rx.e r0 = rx.e.l3(r0, r1, r2, r3)
            return r0
    }

    public static <T> rx.e<T> Q(rx.i<? extends T> r0, rx.i<? extends T> r1, rx.i<? extends T> r2, rx.i<? extends T> r3, rx.i<? extends T> r4) {
            rx.e r0 = a(r0)
            rx.e r1 = a(r1)
            rx.e r2 = a(r2)
            rx.e r3 = a(r3)
            rx.e r4 = a(r4)
            rx.e r0 = rx.e.m3(r0, r1, r2, r3, r4)
            return r0
    }

    public static <T> rx.e<T> R(rx.i<? extends T> r0, rx.i<? extends T> r1, rx.i<? extends T> r2, rx.i<? extends T> r3, rx.i<? extends T> r4, rx.i<? extends T> r5) {
            rx.e r0 = a(r0)
            rx.e r1 = a(r1)
            rx.e r2 = a(r2)
            rx.e r3 = a(r3)
            rx.e r4 = a(r4)
            rx.e r5 = a(r5)
            rx.e r0 = rx.e.n3(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static <T> rx.e<T> S(rx.i<? extends T> r0, rx.i<? extends T> r1, rx.i<? extends T> r2, rx.i<? extends T> r3, rx.i<? extends T> r4, rx.i<? extends T> r5, rx.i<? extends T> r6) {
            rx.e r0 = a(r0)
            rx.e r1 = a(r1)
            rx.e r2 = a(r2)
            rx.e r3 = a(r3)
            rx.e r4 = a(r4)
            rx.e r5 = a(r5)
            rx.e r6 = a(r6)
            rx.e r0 = rx.e.o3(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    public static <T> rx.e<T> T(rx.i<? extends T> r0, rx.i<? extends T> r1, rx.i<? extends T> r2, rx.i<? extends T> r3, rx.i<? extends T> r4, rx.i<? extends T> r5, rx.i<? extends T> r6, rx.i<? extends T> r7) {
            rx.e r0 = a(r0)
            rx.e r1 = a(r1)
            rx.e r2 = a(r2)
            rx.e r3 = a(r3)
            rx.e r4 = a(r4)
            rx.e r5 = a(r5)
            rx.e r6 = a(r6)
            rx.e r7 = a(r7)
            rx.e r0 = rx.e.p3(r0, r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    public static <T> rx.e<T> U(rx.i<? extends T> r0, rx.i<? extends T> r1, rx.i<? extends T> r2, rx.i<? extends T> r3, rx.i<? extends T> r4, rx.i<? extends T> r5, rx.i<? extends T> r6, rx.i<? extends T> r7, rx.i<? extends T> r8) {
            rx.e r0 = a(r0)
            rx.e r1 = a(r1)
            rx.e r2 = a(r2)
            rx.e r3 = a(r3)
            rx.e r4 = a(r4)
            rx.e r5 = a(r5)
            rx.e r6 = a(r6)
            rx.e r7 = a(r7)
            rx.e r8 = a(r8)
            rx.e r0 = rx.e.q3(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    public static <T> rx.i<T> V(rx.i<? extends rx.i<? extends T>> r1) {
            boolean r0 = r1 instanceof rx.internal.util.l
            if (r0 == 0) goto Lf
            rx.internal.util.l r1 = (rx.internal.util.l) r1
            rx.functions.p r0 = rx.internal.util.n.c()
            rx.i r1 = r1.R0(r0)
            return r1
        Lf:
            rx.i$l r0 = new rx.i$l
            r0.<init>(r1)
            rx.i r1 = n(r0)
            return r1
    }

    public static <T> rx.e<T> W(rx.e<? extends rx.i<? extends T>> r1) {
            r0 = 2147483647(0x7fffffff, float:NaN)
            rx.e r1 = M(r1, r0)
            return r1
    }

    public static <T> rx.e<T> X(rx.e<? extends rx.i<? extends T>> r2, int r3) {
            rx.functions.p r0 = rx.internal.util.n.c()
            r1 = 1
            rx.e r2 = r2.q2(r0, r1, r3)
            return r2
    }

    private static <T> rx.e<T> a(rx.i<T> r1) {
            rx.internal.operators.d5 r0 = new rx.internal.operators.d5
            rx.i$t<T> r1 = r1.a
            r0.<init>(r1)
            rx.e r1 = rx.e.I6(r0)
            return r1
    }

    public static <T> rx.e<T> e(rx.i<? extends T> r0, rx.i<? extends T> r1) {
            rx.e r0 = a(r0)
            rx.e r1 = a(r1)
            rx.e r0 = rx.e.v0(r0, r1)
            return r0
    }

    public static <T> rx.e<T> f(rx.i<? extends T> r0, rx.i<? extends T> r1, rx.i<? extends T> r2) {
            rx.e r0 = a(r0)
            rx.e r1 = a(r1)
            rx.e r2 = a(r2)
            rx.e r0 = rx.e.w0(r0, r1, r2)
            return r0
    }

    public static <T> rx.e<T> g(rx.i<? extends T> r0, rx.i<? extends T> r1, rx.i<? extends T> r2, rx.i<? extends T> r3) {
            rx.e r0 = a(r0)
            rx.e r1 = a(r1)
            rx.e r2 = a(r2)
            rx.e r3 = a(r3)
            rx.e r0 = rx.e.x0(r0, r1, r2, r3)
            return r0
    }

    public static <T> rx.e<T> h(rx.i<? extends T> r0, rx.i<? extends T> r1, rx.i<? extends T> r2, rx.i<? extends T> r3, rx.i<? extends T> r4) {
            rx.e r0 = a(r0)
            rx.e r1 = a(r1)
            rx.e r2 = a(r2)
            rx.e r3 = a(r3)
            rx.e r4 = a(r4)
            rx.e r0 = rx.e.y0(r0, r1, r2, r3, r4)
            return r0
    }

    public static <T> rx.e<T> i(rx.i<? extends T> r0, rx.i<? extends T> r1, rx.i<? extends T> r2, rx.i<? extends T> r3, rx.i<? extends T> r4, rx.i<? extends T> r5) {
            rx.e r0 = a(r0)
            rx.e r1 = a(r1)
            rx.e r2 = a(r2)
            rx.e r3 = a(r3)
            rx.e r4 = a(r4)
            rx.e r5 = a(r5)
            rx.e r0 = rx.e.z0(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static <T> rx.e<T> j(rx.i<? extends T> r0, rx.i<? extends T> r1, rx.i<? extends T> r2, rx.i<? extends T> r3, rx.i<? extends T> r4, rx.i<? extends T> r5, rx.i<? extends T> r6) {
            rx.e r0 = a(r0)
            rx.e r1 = a(r1)
            rx.e r2 = a(r2)
            rx.e r3 = a(r3)
            rx.e r4 = a(r4)
            rx.e r5 = a(r5)
            rx.e r6 = a(r6)
            rx.e r0 = rx.e.A0(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    public static <T> rx.e<T> k(rx.i<? extends T> r0, rx.i<? extends T> r1, rx.i<? extends T> r2, rx.i<? extends T> r3, rx.i<? extends T> r4, rx.i<? extends T> r5, rx.i<? extends T> r6, rx.i<? extends T> r7) {
            rx.e r0 = a(r0)
            rx.e r1 = a(r1)
            rx.e r2 = a(r2)
            rx.e r3 = a(r3)
            rx.e r4 = a(r4)
            rx.e r5 = a(r5)
            rx.e r6 = a(r6)
            rx.e r7 = a(r7)
            rx.e r0 = rx.e.B0(r0, r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    public static <T> rx.e<T> l(rx.i<? extends T> r0, rx.i<? extends T> r1, rx.i<? extends T> r2, rx.i<? extends T> r3, rx.i<? extends T> r4, rx.i<? extends T> r5, rx.i<? extends T> r6, rx.i<? extends T> r7, rx.i<? extends T> r8) {
            rx.e r0 = a(r0)
            rx.e r1 = a(r1)
            rx.e r2 = a(r2)
            rx.e r3 = a(r3)
            rx.e r4 = a(r4)
            rx.e r5 = a(r5)
            rx.e r6 = a(r6)
            rx.e r7 = a(r7)
            rx.e r8 = a(r8)
            rx.e r0 = rx.e.C0(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    public static <T> rx.i<T> n(rx.i.t<T> r1) {
            rx.i r0 = new rx.i
            r0.<init>(r1)
            return r0
    }

    public static <T> rx.i<T> o(java.util.concurrent.Callable<rx.i<T>> r1) {
            rx.i$i r0 = new rx.i$i
            r0.<init>(r1)
            rx.i r1 = n(r0)
            return r1
    }

    public static <T> rx.i<T> y(java.lang.Throwable r1) {
            rx.i$k r0 = new rx.i$k
            r0.<init>(r1)
            rx.i r1 = n(r0)
            return r1
    }

    public final rx.b A(rx.functions.p<? super T, ? extends rx.b> r2) {
            r1 = this;
            rx.internal.operators.i r0 = new rx.internal.operators.i
            r0.<init>(r1, r2)
            rx.b r2 = rx.b.p(r0)
            return r2
    }

    public final rx.m A0(rx.l<? super T> r2) {
            r1 = this;
            r0 = 1
            rx.m r2 = r1.B0(r2, r0)
            return r2
    }

    public final <R> rx.e<R> B(rx.functions.p<? super T, ? extends rx.e<? extends R>> r1) {
            r0 = this;
            rx.i r1 = r0.K(r1)
            rx.e r1 = a(r1)
            rx.e r1 = rx.e.h3(r1)
            return r1
    }

    @rx.annotations.Experimental
    public final rx.i<T> C0(rx.h r2) {
            r1 = this;
            rx.i$j r0 = new rx.i$j
            r0.<init>(r1, r2)
            rx.i r2 = n(r0)
            return r2
    }

    public final <R> rx.i<R> J(rx.e.b<? extends R, ? super T> r3) {
            r2 = this;
            rx.internal.operators.q4 r0 = new rx.internal.operators.q4
            rx.i$t<T> r1 = r2.a
            r0.<init>(r1, r3)
            rx.i r3 = n(r0)
            return r3
    }

    public final <R> rx.i<R> K(rx.functions.p<? super T, ? extends R> r2) {
            r1 = this;
            rx.internal.operators.u4 r0 = new rx.internal.operators.u4
            r0.<init>(r1, r2)
            rx.i r2 = n(r0)
            return r2
    }

    public final <T2, R> rx.i<R> O0(rx.i<? extends T2> r1, rx.functions.q<? super T, ? super T2, ? extends R> r2) {
            r0 = this;
            rx.i r1 = N0(r0, r1, r2)
            return r1
    }

    public final rx.e<T> Y(rx.i<? extends T> r1) {
            r0 = this;
            rx.e r1 = N(r0, r1)
            return r1
    }

    public final rx.i<T> Z(rx.h r3) {
            r2 = this;
            boolean r0 = r2 instanceof rx.internal.util.l
            if (r0 == 0) goto Lc
            r0 = r2
            rx.internal.util.l r0 = (rx.internal.util.l) r0
            rx.i r3 = r0.S0(r3)
            return r3
        Lc:
            if (r3 == 0) goto L1a
            rx.internal.operators.r4 r0 = new rx.internal.operators.r4
            rx.i$t<T> r1 = r2.a
            r0.<init>(r1, r3)
            rx.i r3 = n(r0)
            return r3
        L1a:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "scheduler is null"
            r3.<init>(r0)
            throw r3
    }

    public final rx.i<T> a0(rx.i<? extends T> r2) {
            r1 = this;
            rx.i r0 = new rx.i
            rx.internal.operators.x4 r2 = rx.internal.operators.x4.b(r1, r2)
            r0.<init>(r2)
            return r0
    }

    public final rx.i<T> b() {
            r2 = this;
            rx.e r0 = r2.z0()
            r1 = 1
            rx.e r0 = r0.e0(r1)
            rx.i r0 = r0.D6()
            return r0
    }

    public final rx.i<T> b0(rx.functions.p<java.lang.Throwable, ? extends rx.i<? extends T>> r2) {
            r1 = this;
            rx.i r0 = new rx.i
            rx.internal.operators.x4 r2 = rx.internal.operators.x4.a(r1, r2)
            r0.<init>(r2)
            return r0
    }

    @rx.annotations.Experimental
    public final <R> rx.i<R> c(java.lang.Class<R> r2) {
            r1 = this;
            rx.internal.operators.w4 r0 = new rx.internal.operators.w4
            r0.<init>(r2)
            rx.i r2 = r1.K(r0)
            return r2
    }

    public final rx.i<T> c0(rx.functions.p<java.lang.Throwable, ? extends T> r3) {
            r2 = this;
            rx.internal.operators.s4 r0 = new rx.internal.operators.s4
            rx.i$t<T> r1 = r2.a
            r0.<init>(r1, r3)
            rx.i r3 = n(r0)
            return r3
    }

    public <R> rx.i<R> d(rx.i.u<? super T, ? extends R> r1) {
            r0 = this;
            java.lang.Object r1 = r1.call(r0)
            rx.i r1 = (rx.i) r1
            return r1
    }

    public final rx.i<T> d0() {
            r1 = this;
            rx.e r0 = r1.z0()
            rx.e r0 = r0.C4()
            rx.i r0 = r0.D6()
            return r0
    }

    public final rx.i<T> e0(long r2) {
            r1 = this;
            rx.e r0 = r1.z0()
            rx.e r2 = r0.D4(r2)
            rx.i r2 = r2.D6()
            return r2
    }

    public final rx.i<T> f0(rx.functions.q<java.lang.Integer, java.lang.Throwable, java.lang.Boolean> r2) {
            r1 = this;
            rx.e r0 = r1.z0()
            rx.e r2 = r0.E4(r2)
            rx.i r2 = r2.D6()
            return r2
    }

    public final rx.i<T> g0(rx.functions.p<rx.e<? extends java.lang.Throwable>, ? extends rx.e<?>> r2) {
            r1 = this;
            rx.e r0 = r1.z0()
            rx.e r2 = r0.F4(r2)
            rx.i r2 = r2.D6()
            return r2
    }

    public final rx.m h0() {
            r2 = this;
            rx.functions.m$m r0 = rx.functions.m.a()
            rx.functions.b r1 = rx.functions.m.b()
            rx.m r0 = r2.m0(r0, r1)
            return r0
    }

    public final rx.m i0(rx.f<? super T> r2) {
            r1 = this;
            if (r2 == 0) goto Lc
            rx.i$c r0 = new rx.i$c
            r0.<init>(r1, r2)
            rx.m r2 = r1.j0(r0)
            return r2
        Lc:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "observer is null"
            r2.<init>(r0)
            throw r2
    }

    public final rx.m j0(rx.k<? super T> r5) {
            r4 = this;
            if (r5 == 0) goto L47
            rx.i$t<T> r0 = r4.a     // Catch: java.lang.Throwable -> L10
            rx.i$t r0 = rx.plugins.c.T(r4, r0)     // Catch: java.lang.Throwable -> L10
            r0.call(r5)     // Catch: java.lang.Throwable -> L10
            rx.m r5 = rx.plugins.c.S(r5)     // Catch: java.lang.Throwable -> L10
            return r5
        L10:
            r0 = move-exception
            rx.exceptions.a.e(r0)
            java.lang.Throwable r1 = rx.plugins.c.Q(r0)     // Catch: java.lang.Throwable -> L20
            r5.onError(r1)     // Catch: java.lang.Throwable -> L20
            rx.m r5 = rx.subscriptions.f.b()
            return r5
        L20:
            r5 = move-exception
            rx.exceptions.a.e(r5)
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error occurred attempting to subscribe ["
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = "] and then again while trying to pass to onError."
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0, r5)
            rx.plugins.c.Q(r1)
            throw r1
        L47:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "te is null"
            r5.<init>(r0)
            throw r5
    }

    public final rx.m k0(rx.l<? super T> r2) {
            r1 = this;
            if (r2 == 0) goto L1a
            r2.onStart()
            boolean r0 = r2 instanceof rx.observers.e
            if (r0 != 0) goto L14
            rx.observers.e r0 = new rx.observers.e
            r0.<init>(r2)
            r2 = 0
            rx.m r2 = r1.B0(r0, r2)
            return r2
        L14:
            r0 = 1
            rx.m r2 = r1.B0(r2, r0)
            return r2
        L1a:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "observer can not be null"
            r2.<init>(r0)
            throw r2
    }

    public final rx.m l0(rx.functions.b<? super T> r2) {
            r1 = this;
            rx.functions.b r0 = rx.functions.m.b()
            rx.m r2 = r1.m0(r2, r0)
            return r2
    }

    public final rx.e<T> m(rx.i<? extends T> r1) {
            r0 = this;
            rx.e r1 = e(r0, r1)
            return r1
    }

    public final rx.m m0(rx.functions.b<? super T> r2, rx.functions.b<java.lang.Throwable> r3) {
            r1 = this;
            if (r2 == 0) goto L16
            if (r3 == 0) goto Le
            rx.i$b r0 = new rx.i$b
            r0.<init>(r1, r3, r2)
            rx.m r2 = r1.j0(r0)
            return r2
        Le:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "onError can not be null"
            r2.<init>(r3)
            throw r2
        L16:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "onSuccess can not be null"
            r2.<init>(r3)
            throw r2
    }

    public final rx.i<T> n0(rx.h r2) {
            r1 = this;
            boolean r0 = r1 instanceof rx.internal.util.l
            if (r0 == 0) goto Lc
            r0 = r1
            rx.internal.util.l r0 = (rx.internal.util.l) r0
            rx.i r2 = r0.S0(r2)
            return r2
        Lc:
            rx.i$d r0 = new rx.i$d
            r0.<init>(r1, r2)
            rx.i r2 = n(r0)
            return r2
    }

    public final rx.i<T> o0(rx.b r3) {
            r2 = this;
            rx.internal.operators.z4 r0 = new rx.internal.operators.z4
            rx.i$t<T> r1 = r2.a
            r0.<init>(r1, r3)
            rx.i r3 = n(r0)
            return r3
    }

    public final rx.i<T> p(long r2, java.util.concurrent.TimeUnit r4) {
            r1 = this;
            rx.h r0 = rx.schedulers.c.a()
            rx.i r2 = r1.q(r2, r4, r0)
            return r2
    }

    public final <E> rx.i<T> p0(rx.e<? extends E> r3) {
            r2 = this;
            rx.internal.operators.a5 r0 = new rx.internal.operators.a5
            rx.i$t<T> r1 = r2.a
            r0.<init>(r1, r3)
            rx.i r3 = n(r0)
            return r3
    }

    public final rx.i<T> q(long r7, java.util.concurrent.TimeUnit r9, rx.h r10) {
            r6 = this;
            rx.internal.operators.h4 r0 = new rx.internal.operators.h4
            rx.i$t<T> r1 = r6.a
            r2 = r7
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r4, r5)
            rx.i r7 = n(r0)
            return r7
    }

    public final <E> rx.i<T> q0(rx.i<? extends E> r3) {
            r2 = this;
            rx.internal.operators.b5 r0 = new rx.internal.operators.b5
            rx.i$t<T> r1 = r2.a
            r0.<init>(r1, r3)
            rx.i r3 = n(r0)
            return r3
    }

    public final rx.i<T> r(rx.e<?> r2) {
            r1 = this;
            r2.getClass()
            rx.internal.operators.t4 r0 = new rx.internal.operators.t4
            r0.<init>(r1, r2)
            rx.i r2 = n(r0)
            return r2
    }

    public final rx.observers.a<T> r0() {
            r2 = this;
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            k5.a r0 = k5.a.g(r0)
            r2.k0(r0)
            return r0
    }

    public final rx.i<T> s(rx.functions.a r2) {
            r1 = this;
            rx.internal.operators.i4 r0 = new rx.internal.operators.i4
            r0.<init>(r1, r2)
            rx.i r2 = n(r0)
            return r2
    }

    public final rx.i<T> s0(long r7, java.util.concurrent.TimeUnit r9) {
            r6 = this;
            r4 = 0
            rx.h r5 = rx.schedulers.c.a()
            r0 = r6
            r1 = r7
            r3 = r9
            rx.i r7 = r0.v0(r1, r3, r4, r5)
            return r7
    }

    public final rx.i<T> t(rx.functions.b<rx.Notification<? extends T>> r4) {
            r3 = this;
            if (r4 == 0) goto L16
            rx.internal.operators.j4 r0 = new rx.internal.operators.j4
            rx.i$g r1 = new rx.i$g
            r1.<init>(r3, r4)
            rx.i$h r2 = new rx.i$h
            r2.<init>(r3, r4)
            r0.<init>(r3, r1, r2)
            rx.i r4 = n(r0)
            return r4
        L16:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "onNotification is null"
            r4.<init>(r0)
            throw r4
    }

    public final rx.i<T> t0(long r7, java.util.concurrent.TimeUnit r9, rx.h r10) {
            r6 = this;
            r4 = 0
            r0 = r6
            r1 = r7
            r3 = r9
            r5 = r10
            rx.i r7 = r0.v0(r1, r3, r4, r5)
            return r7
    }

    public final rx.i<T> u(rx.functions.b<java.lang.Throwable> r4) {
            r3 = this;
            if (r4 == 0) goto L15
            rx.internal.operators.j4 r0 = new rx.internal.operators.j4
            rx.functions.m$m r1 = rx.functions.m.a()
            rx.i$f r2 = new rx.i$f
            r2.<init>(r3, r4)
            r0.<init>(r3, r1, r2)
            rx.i r4 = n(r0)
            return r4
        L15:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "onError is null"
            r4.<init>(r0)
            throw r4
    }

    public final rx.i<T> u0(long r7, java.util.concurrent.TimeUnit r9, rx.i<? extends T> r10) {
            r6 = this;
            rx.h r5 = rx.schedulers.c.a()
            r0 = r6
            r1 = r7
            r3 = r9
            r4 = r10
            rx.i r7 = r0.v0(r1, r3, r4, r5)
            return r7
    }

    public final rx.i<T> v(rx.functions.a r3) {
            r2 = this;
            rx.internal.operators.k4 r0 = new rx.internal.operators.k4
            rx.i$t<T> r1 = r2.a
            r0.<init>(r1, r3)
            rx.i r3 = n(r0)
            return r3
    }

    public final rx.i<T> v0(long r8, java.util.concurrent.TimeUnit r10, rx.i<? extends T> r11, rx.h r12) {
            r7 = this;
            if (r11 != 0) goto Lb
            rx.i$e r11 = new rx.i$e
            r11.<init>(r7)
            rx.i r11 = o(r11)
        Lb:
            rx.internal.operators.c5 r0 = new rx.internal.operators.c5
            rx.i$t<T> r1 = r7.a
            rx.i$t<T> r6 = r11.a
            r2 = r8
            r4 = r10
            r5 = r12
            r0.<init>(r1, r2, r4, r5, r6)
            rx.i r8 = n(r0)
            return r8
    }

    public final rx.i<T> w(rx.functions.b<? super T> r3) {
            r2 = this;
            if (r3 == 0) goto L10
            rx.functions.m$m r0 = rx.functions.m.a()
            rx.internal.operators.j4 r1 = new rx.internal.operators.j4
            r1.<init>(r2, r3, r0)
            rx.i r3 = n(r1)
            return r3
        L10:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "onSuccess is null"
            r3.<init>(r0)
            throw r3
    }

    public final <R> R w0(rx.functions.p<? super rx.i<T>, R> r1) {
            r0 = this;
            java.lang.Object r1 = r1.call(r0)
            return r1
    }

    public final rx.i<T> x(rx.functions.a r3) {
            r2 = this;
            rx.internal.operators.l4 r0 = new rx.internal.operators.l4
            rx.i$t<T> r1 = r2.a
            r0.<init>(r1, r3)
            rx.i r3 = n(r0)
            return r3
    }

    public final rx.singles.a<T> x0() {
            r1 = this;
            rx.singles.a r0 = rx.singles.a.a(r1)
            return r0
    }

    public final rx.b y0() {
            r1 = this;
            rx.b r0 = rx.b.K(r1)
            return r0
    }

    public final <R> rx.i<R> z(rx.functions.p<? super T, ? extends rx.i<? extends R>> r2) {
            r1 = this;
            boolean r0 = r1 instanceof rx.internal.util.l
            if (r0 == 0) goto Lc
            r0 = r1
            rx.internal.util.l r0 = (rx.internal.util.l) r0
            rx.i r2 = r0.R0(r2)
            return r2
        Lc:
            rx.i r2 = r1.K(r2)
            rx.i r2 = V(r2)
            return r2
    }

    public final rx.e<T> z0() {
            r1 = this;
            rx.e r0 = a(r1)
            return r0
    }
}
