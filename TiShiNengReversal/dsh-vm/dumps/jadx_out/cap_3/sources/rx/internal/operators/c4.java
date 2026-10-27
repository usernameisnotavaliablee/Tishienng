package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class c4<T> implements rx.e.b<rx.e<T>, T> {
    static final java.lang.Object f = null;
    final long a;
    final long b;
    final java.util.concurrent.TimeUnit c;
    final rx.h d;
    final int e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a<T> {
        final rx.f<T> a;
        final rx.e<T> b;
        int c;

        public a(rx.f<T> r2, rx.e<T> r3) {
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
    final class b extends rx.l<T> {
        final rx.l<? super rx.e<T>> a;
        final rx.h.a b;
        final java.lang.Object c;
        java.util.List<java.lang.Object> d;
        boolean e;
        volatile rx.internal.operators.c4.d<T> f;
        final /* synthetic */ rx.internal.operators.c4 g;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements rx.functions.a {
            final /* synthetic */ rx.internal.operators.c4 a;
            final /* synthetic */ rx.internal.operators.c4.b b;

            a(rx.internal.operators.c4.b r1, rx.internal.operators.c4 r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            public void call() {
                    r1 = this;
                    rx.internal.operators.c4$b r0 = r1.b
                    rx.internal.operators.c4$d<T> r0 = r0.f
                    rx.f<T> r0 = r0.a
                    if (r0 != 0) goto Ld
                    rx.internal.operators.c4$b r0 = r1.b
                    r0.unsubscribe()
                Ld:
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: rx.internal.operators.c4$b$b, reason: collision with other inner class name */
        class C0006b implements rx.functions.a {
            final /* synthetic */ rx.internal.operators.c4.b a;

            C0006b(rx.internal.operators.c4.b r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public void call() {
                    r1 = this;
                    rx.internal.operators.c4$b r0 = r1.a
                    r0.B()
                    return
            }
        }

        public b(rx.internal.operators.c4 r2, rx.l<? super rx.e<T>> r3, rx.h.a r4) {
                r1 = this;
                r1.g = r2
                r1.<init>()
                rx.observers.g r0 = new rx.observers.g
                r0.<init>(r3)
                r1.a = r0
                r1.b = r4
                java.lang.Object r4 = new java.lang.Object
                r4.<init>()
                r1.c = r4
                rx.internal.operators.c4$d r4 = rx.internal.operators.c4.d.c()
                r1.f = r4
                rx.internal.operators.c4$b$a r4 = new rx.internal.operators.c4$b$a
                r4.<init>(r1, r2)
                rx.m r2 = rx.subscriptions.f.a(r4)
                r3.add(r2)
                return
        }

        void A(java.lang.Throwable r3) {
                r2 = this;
                rx.internal.operators.c4$d<T> r0 = r2.f
                rx.f<T> r0 = r0.a
                rx.internal.operators.c4$d<T> r1 = r2.f
                rx.internal.operators.c4$d r1 = r1.a()
                r2.f = r1
                if (r0 == 0) goto L11
                r0.onError(r3)
            L11:
                rx.l<? super rx.e<T>> r0 = r2.a
                r0.onError(r3)
                r2.unsubscribe()
                return
        }

        void B() {
                r6 = this;
                java.lang.Object r0 = r6.c
                monitor-enter(r0)
                boolean r1 = r6.e     // Catch: java.lang.Throwable -> L13
                if (r1 == 0) goto L1e
                java.util.List<java.lang.Object> r1 = r6.d     // Catch: java.lang.Throwable -> L13
                if (r1 != 0) goto L15
                java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L13
                r1.<init>()     // Catch: java.lang.Throwable -> L13
                r6.d = r1     // Catch: java.lang.Throwable -> L13
                goto L15
            L13:
                r1 = move-exception
                goto L6d
            L15:
                java.util.List<java.lang.Object> r1 = r6.d     // Catch: java.lang.Throwable -> L13
                java.lang.Object r2 = rx.internal.operators.c4.f     // Catch: java.lang.Throwable -> L13
                r1.add(r2)     // Catch: java.lang.Throwable -> L13
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                return
            L1e:
                r1 = 1
                r6.e = r1     // Catch: java.lang.Throwable -> L13
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                r0 = 0
                boolean r2 = r6.G()     // Catch: java.lang.Throwable -> L57
                if (r2 != 0) goto L33
                java.lang.Object r2 = r6.c
                monitor-enter(r2)
                r6.e = r0     // Catch: java.lang.Throwable -> L30
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L30
                return
            L30:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L30
                throw r0
            L33:
                java.lang.Object r2 = r6.c     // Catch: java.lang.Throwable -> L57
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L57
                java.util.List<java.lang.Object> r3 = r6.d     // Catch: java.lang.Throwable -> L40
                if (r3 != 0) goto L43
                r6.e = r0     // Catch: java.lang.Throwable -> L40
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L3e
                return
            L3e:
                r3 = move-exception
                goto L5a
            L40:
                r3 = move-exception
                r1 = 0
                goto L5a
            L43:
                r4 = 0
                r6.d = r4     // Catch: java.lang.Throwable -> L40
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L40
                boolean r2 = r6.j(r3)     // Catch: java.lang.Throwable -> L57
                if (r2 != 0) goto L33
                java.lang.Object r2 = r6.c
                monitor-enter(r2)
                r6.e = r0     // Catch: java.lang.Throwable -> L54
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L54
                return
            L54:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L54
                throw r0
            L57:
                r1 = move-exception
                r2 = 0
                goto L60
            L5a:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L3e
                throw r3     // Catch: java.lang.Throwable -> L5c
            L5c:
                r2 = move-exception
                r5 = r2
                r2 = r1
                r1 = r5
            L60:
                if (r2 != 0) goto L6c
                java.lang.Object r2 = r6.c
                monitor-enter(r2)
                r6.e = r0     // Catch: java.lang.Throwable -> L69
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L69
                goto L6c
            L69:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L69
                throw r0
            L6c:
                throw r1
            L6d:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                throw r1
        }

        boolean G() {
                r2 = this;
                rx.internal.operators.c4$d<T> r0 = r2.f
                rx.f<T> r0 = r0.a
                if (r0 == 0) goto L9
                r0.onCompleted()
            L9:
                rx.l<? super rx.e<T>> r0 = r2.a
                boolean r0 = r0.isUnsubscribed()
                if (r0 == 0) goto L1e
                rx.internal.operators.c4$d<T> r0 = r2.f
                rx.internal.operators.c4$d r0 = r0.a()
                r2.f = r0
                r2.unsubscribe()
                r0 = 0
                return r0
            L1e:
                rx.subjects.i r0 = rx.subjects.i.y7()
                rx.internal.operators.c4$d<T> r1 = r2.f
                rx.internal.operators.c4$d r1 = r1.b(r0, r0)
                r2.f = r1
                rx.l<? super rx.e<T>> r1 = r2.a
                r1.onNext(r0)
                r0 = 1
                return r0
        }

        void H() {
                r7 = this;
                rx.h$a r0 = r7.b
                rx.internal.operators.c4$b$b r1 = new rx.internal.operators.c4$b$b
                r1.<init>(r7)
                rx.internal.operators.c4 r2 = r7.g
                long r4 = r2.a
                java.util.concurrent.TimeUnit r6 = r2.c
                r2 = 0
                r0.f(r1, r2, r4, r6)
                return
        }

        void g() {
                r2 = this;
                rx.internal.operators.c4$d<T> r0 = r2.f
                rx.f<T> r0 = r0.a
                rx.internal.operators.c4$d<T> r1 = r2.f
                rx.internal.operators.c4$d r1 = r1.a()
                r2.f = r1
                if (r0 == 0) goto L11
                r0.onCompleted()
            L11:
                rx.l<? super rx.e<T>> r0 = r2.a
                r0.onCompleted()
                r2.unsubscribe()
                return
        }

        boolean j(java.util.List<java.lang.Object> r5) {
                r4 = this;
                r0 = 1
                if (r5 != 0) goto L4
                return r0
            L4:
                java.util.Iterator r5 = r5.iterator()
            L8:
                boolean r1 = r5.hasNext()
                if (r1 == 0) goto L3d
                java.lang.Object r1 = r5.next()
                java.lang.Object r2 = rx.internal.operators.c4.f
                r3 = 0
                if (r1 != r2) goto L1e
                boolean r1 = r4.G()
                if (r1 != 0) goto L8
                return r3
            L1e:
                boolean r2 = rx.internal.operators.v.g(r1)
                if (r2 == 0) goto L2c
                java.lang.Throwable r5 = rx.internal.operators.v.d(r1)
                r4.A(r5)
                goto L3d
            L2c:
                boolean r2 = rx.internal.operators.v.f(r1)
                if (r2 == 0) goto L36
                r4.g()
                goto L3d
            L36:
                boolean r1 = r4.s(r1)
                if (r1 != 0) goto L8
                return r3
            L3d:
                return r0
        }

        public void onCompleted() {
                r3 = this;
                java.lang.Object r0 = r3.c
                monitor-enter(r0)
                boolean r1 = r3.e     // Catch: java.lang.Throwable -> L13
                if (r1 == 0) goto L20
                java.util.List<java.lang.Object> r1 = r3.d     // Catch: java.lang.Throwable -> L13
                if (r1 != 0) goto L15
                java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L13
                r1.<init>()     // Catch: java.lang.Throwable -> L13
                r3.d = r1     // Catch: java.lang.Throwable -> L13
                goto L15
            L13:
                r1 = move-exception
                goto L35
            L15:
                java.util.List<java.lang.Object> r1 = r3.d     // Catch: java.lang.Throwable -> L13
                java.lang.Object r2 = rx.internal.operators.v.b()     // Catch: java.lang.Throwable -> L13
                r1.add(r2)     // Catch: java.lang.Throwable -> L13
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                return
            L20:
                java.util.List<java.lang.Object> r1 = r3.d     // Catch: java.lang.Throwable -> L13
                r2 = 0
                r3.d = r2     // Catch: java.lang.Throwable -> L13
                r2 = 1
                r3.e = r2     // Catch: java.lang.Throwable -> L13
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                r3.j(r1)     // Catch: java.lang.Throwable -> L30
                r3.g()
                return
            L30:
                r0 = move-exception
                r3.A(r0)
                return
            L35:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                throw r1
        }

        public void onError(java.lang.Throwable r3) {
                r2 = this;
                java.lang.Object r0 = r2.c
                monitor-enter(r0)
                boolean r1 = r2.e     // Catch: java.lang.Throwable -> L13
                if (r1 == 0) goto L15
                java.lang.Object r3 = rx.internal.operators.v.c(r3)     // Catch: java.lang.Throwable -> L13
                java.util.List r3 = java.util.Collections.singletonList(r3)     // Catch: java.lang.Throwable -> L13
                r2.d = r3     // Catch: java.lang.Throwable -> L13
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                return
            L13:
                r3 = move-exception
                goto L20
            L15:
                r1 = 0
                r2.d = r1     // Catch: java.lang.Throwable -> L13
                r1 = 1
                r2.e = r1     // Catch: java.lang.Throwable -> L13
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                r2.A(r3)
                return
            L20:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                throw r3
        }

        public void onNext(T r5) {
                r4 = this;
                java.lang.Object r0 = r4.c
                monitor-enter(r0)
                boolean r1 = r4.e     // Catch: java.lang.Throwable -> L13
                if (r1 == 0) goto L1c
                java.util.List<java.lang.Object> r1 = r4.d     // Catch: java.lang.Throwable -> L13
                if (r1 != 0) goto L15
                java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L13
                r1.<init>()     // Catch: java.lang.Throwable -> L13
                r4.d = r1     // Catch: java.lang.Throwable -> L13
                goto L15
            L13:
                r5 = move-exception
                goto L68
            L15:
                java.util.List<java.lang.Object> r1 = r4.d     // Catch: java.lang.Throwable -> L13
                r1.add(r5)     // Catch: java.lang.Throwable -> L13
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                return
            L1c:
                r1 = 1
                r4.e = r1     // Catch: java.lang.Throwable -> L13
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                r0 = 0
                boolean r5 = r4.s(r5)     // Catch: java.lang.Throwable -> L55
                if (r5 != 0) goto L31
                java.lang.Object r5 = r4.c
                monitor-enter(r5)
                r4.e = r0     // Catch: java.lang.Throwable -> L2e
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L2e
                return
            L2e:
                r0 = move-exception
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L2e
                throw r0
            L31:
                java.lang.Object r5 = r4.c     // Catch: java.lang.Throwable -> L55
                monitor-enter(r5)     // Catch: java.lang.Throwable -> L55
                java.util.List<java.lang.Object> r2 = r4.d     // Catch: java.lang.Throwable -> L3e
                if (r2 != 0) goto L41
                r4.e = r0     // Catch: java.lang.Throwable -> L3e
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L3c
                return
            L3c:
                r2 = move-exception
                goto L58
            L3e:
                r2 = move-exception
                r1 = 0
                goto L58
            L41:
                r3 = 0
                r4.d = r3     // Catch: java.lang.Throwable -> L3e
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L3e
                boolean r5 = r4.j(r2)     // Catch: java.lang.Throwable -> L55
                if (r5 != 0) goto L31
                java.lang.Object r5 = r4.c
                monitor-enter(r5)
                r4.e = r0     // Catch: java.lang.Throwable -> L52
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L52
                return
            L52:
                r0 = move-exception
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L52
                throw r0
            L55:
                r5 = move-exception
                r1 = 0
                goto L5b
            L58:
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L3c
                throw r2     // Catch: java.lang.Throwable -> L5a
            L5a:
                r5 = move-exception
            L5b:
                if (r1 != 0) goto L67
                java.lang.Object r1 = r4.c
                monitor-enter(r1)
                r4.e = r0     // Catch: java.lang.Throwable -> L64
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L64
                goto L67
            L64:
                r5 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L64
                throw r5
            L67:
                throw r5
            L68:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                throw r5
        }

        public void onStart() {
                r2 = this;
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r2.request(r0)
                return
        }

        boolean s(T r4) {
                r3 = this;
                rx.internal.operators.c4$d<T> r0 = r3.f
                rx.f<T> r1 = r0.a
                if (r1 != 0) goto L10
                boolean r0 = r3.G()
                if (r0 != 0) goto Le
                r4 = 0
                return r4
            Le:
                rx.internal.operators.c4$d<T> r0 = r3.f
            L10:
                rx.f<T> r1 = r0.a
                r1.onNext(r4)
                int r4 = r0.c
                rx.internal.operators.c4 r1 = r3.g
                int r1 = r1.e
                r2 = 1
                int r1 = r1 - r2
                if (r4 != r1) goto L29
                rx.f<T> r4 = r0.a
                r4.onCompleted()
                rx.internal.operators.c4$d r4 = r0.a()
                goto L2d
            L29:
                rx.internal.operators.c4$d r4 = r0.d()
            L2d:
                r3.f = r4
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class c extends rx.l<T> {
        final rx.l<? super rx.e<T>> a;
        final rx.h.a b;
        final java.lang.Object c;
        final java.util.List<rx.internal.operators.c4.a<T>> d;
        boolean e;
        final /* synthetic */ rx.internal.operators.c4 f;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements rx.functions.a {
            final /* synthetic */ rx.internal.operators.c4.c a;

            a(rx.internal.operators.c4.c r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public void call() {
                    r1 = this;
                    rx.internal.operators.c4$c r0 = r1.a
                    r0.s()
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class b implements rx.functions.a {
            final /* synthetic */ rx.internal.operators.c4.a a;
            final /* synthetic */ rx.internal.operators.c4.c b;

            b(rx.internal.operators.c4.c r1, rx.internal.operators.c4.a r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            public void call() {
                    r2 = this;
                    rx.internal.operators.c4$c r0 = r2.b
                    rx.internal.operators.c4$a r1 = r2.a
                    r0.A(r1)
                    return
            }
        }

        public c(rx.internal.operators.c4 r1, rx.l<? super rx.e<T>> r2, rx.h.a r3) {
                r0 = this;
                r0.f = r1
                r0.<init>(r2)
                r0.a = r2
                r0.b = r3
                java.lang.Object r1 = new java.lang.Object
                r1.<init>()
                r0.c = r1
                java.util.LinkedList r1 = new java.util.LinkedList
                r1.<init>()
                r0.d = r1
                return
        }

        void A(rx.internal.operators.c4.a<T> r4) {
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
                java.util.List<rx.internal.operators.c4$a<T>> r1 = r3.d     // Catch: java.lang.Throwable -> L9
                java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L9
            L11:
                boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L9
                if (r2 == 0) goto L24
                java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L9
                rx.internal.operators.c4$a r2 = (rx.internal.operators.c4.a) r2     // Catch: java.lang.Throwable -> L9
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

        rx.internal.operators.c4.a<T> g() {
                r2 = this;
                rx.subjects.i r0 = rx.subjects.i.y7()
                rx.internal.operators.c4$a r1 = new rx.internal.operators.c4$a
                r1.<init>(r0, r0)
                return r1
        }

        void j() {
                r7 = this;
                rx.h$a r0 = r7.b
                rx.internal.operators.c4$c$a r1 = new rx.internal.operators.c4$c$a
                r1.<init>(r7)
                rx.internal.operators.c4 r2 = r7.f
                r4 = r2
                long r2 = r4.b
                java.util.concurrent.TimeUnit r6 = r4.c
                r4 = r2
                r0.f(r1, r2, r4, r6)
                return
        }

        public void onCompleted() {
                r3 = this;
                java.lang.Object r0 = r3.c
                monitor-enter(r0)
                boolean r1 = r3.e     // Catch: java.lang.Throwable -> L9
                if (r1 == 0) goto Lb
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
                return
            L9:
                r1 = move-exception
                goto L37
            Lb:
                r1 = 1
                r3.e = r1     // Catch: java.lang.Throwable -> L9
                java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L9
                java.util.List<rx.internal.operators.c4$a<T>> r2 = r3.d     // Catch: java.lang.Throwable -> L9
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L9
                java.util.List<rx.internal.operators.c4$a<T>> r2 = r3.d     // Catch: java.lang.Throwable -> L9
                r2.clear()     // Catch: java.lang.Throwable -> L9
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
                java.util.Iterator r0 = r1.iterator()
            L1f:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L31
                java.lang.Object r1 = r0.next()
                rx.internal.operators.c4$a r1 = (rx.internal.operators.c4.a) r1
                rx.f<T> r1 = r1.a
                r1.onCompleted()
                goto L1f
            L31:
                rx.l<? super rx.e<T>> r0 = r3.a
                r0.onCompleted()
                return
            L37:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
                throw r1
        }

        public void onError(java.lang.Throwable r4) {
                r3 = this;
                java.lang.Object r0 = r3.c
                monitor-enter(r0)
                boolean r1 = r3.e     // Catch: java.lang.Throwable -> L9
                if (r1 == 0) goto Lb
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
                return
            L9:
                r4 = move-exception
                goto L37
            Lb:
                r1 = 1
                r3.e = r1     // Catch: java.lang.Throwable -> L9
                java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L9
                java.util.List<rx.internal.operators.c4$a<T>> r2 = r3.d     // Catch: java.lang.Throwable -> L9
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L9
                java.util.List<rx.internal.operators.c4$a<T>> r2 = r3.d     // Catch: java.lang.Throwable -> L9
                r2.clear()     // Catch: java.lang.Throwable -> L9
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
                java.util.Iterator r0 = r1.iterator()
            L1f:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L31
                java.lang.Object r1 = r0.next()
                rx.internal.operators.c4$a r1 = (rx.internal.operators.c4.a) r1
                rx.f<T> r1 = r1.a
                r1.onError(r4)
                goto L1f
            L31:
                rx.l<? super rx.e<T>> r0 = r3.a
                r0.onError(r4)
                return
            L37:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
                throw r4
        }

        public void onNext(T r6) {
                r5 = this;
                java.lang.Object r0 = r5.c
                monitor-enter(r0)
                boolean r1 = r5.e     // Catch: java.lang.Throwable -> L9
                if (r1 == 0) goto Lb
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
                return
            L9:
                r6 = move-exception
                goto L59
            Lb:
                java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L9
                java.util.List<rx.internal.operators.c4$a<T>> r2 = r5.d     // Catch: java.lang.Throwable -> L9
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L9
                java.util.List<rx.internal.operators.c4$a<T>> r2 = r5.d     // Catch: java.lang.Throwable -> L9
                java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L9
            L18:
                boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L9
                if (r3 == 0) goto L34
                java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L9
                rx.internal.operators.c4$a r3 = (rx.internal.operators.c4.a) r3     // Catch: java.lang.Throwable -> L9
                int r4 = r3.c     // Catch: java.lang.Throwable -> L9
                int r4 = r4 + 1
                r3.c = r4     // Catch: java.lang.Throwable -> L9
                rx.internal.operators.c4 r3 = r5.f     // Catch: java.lang.Throwable -> L9
                int r3 = r3.e     // Catch: java.lang.Throwable -> L9
                if (r4 != r3) goto L18
                r2.remove()     // Catch: java.lang.Throwable -> L9
                goto L18
            L34:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
                java.util.Iterator r0 = r1.iterator()
            L39:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L58
                java.lang.Object r1 = r0.next()
                rx.internal.operators.c4$a r1 = (rx.internal.operators.c4.a) r1
                rx.f<T> r2 = r1.a
                r2.onNext(r6)
                int r2 = r1.c
                rx.internal.operators.c4 r3 = r5.f
                int r3 = r3.e
                if (r2 != r3) goto L39
                rx.f<T> r1 = r1.a
                r1.onCompleted()
                goto L39
            L58:
                return
            L59:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
                throw r6
        }

        public void onStart() {
                r2 = this;
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r2.request(r0)
                return
        }

        void s() {
                r5 = this;
                rx.internal.operators.c4$a r0 = r5.g()
                java.lang.Object r1 = r5.c
                monitor-enter(r1)
                boolean r2 = r5.e     // Catch: java.lang.Throwable -> Ld
                if (r2 == 0) goto Lf
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
                return
            Ld:
                r0 = move-exception
                goto L32
            Lf:
                java.util.List<rx.internal.operators.c4$a<T>> r2 = r5.d     // Catch: java.lang.Throwable -> Ld
                r2.add(r0)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
                rx.l<? super rx.e<T>> r1 = r5.a     // Catch: java.lang.Throwable -> L2d
                rx.e<T> r2 = r0.b     // Catch: java.lang.Throwable -> L2d
                r1.onNext(r2)     // Catch: java.lang.Throwable -> L2d
                rx.h$a r1 = r5.b
                rx.internal.operators.c4$c$b r2 = new rx.internal.operators.c4$c$b
                r2.<init>(r5, r0)
                rx.internal.operators.c4 r0 = r5.f
                long r3 = r0.a
                java.util.concurrent.TimeUnit r0 = r0.c
                r1.e(r2, r3, r0)
                return
            L2d:
                r0 = move-exception
                r5.onError(r0)
                return
            L32:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class d<T> {
        static final rx.internal.operators.c4.d<java.lang.Object> d = null;
        final rx.f<T> a;
        final rx.e<T> b;
        final int c;

        static {
                rx.internal.operators.c4$d r0 = new rx.internal.operators.c4$d
                r1 = 0
                r2 = 0
                r0.<init>(r1, r1, r2)
                rx.internal.operators.c4.d.d = r0
                return
        }

        public d(rx.f<T> r1, rx.e<T> r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                r0.c = r3
                return
        }

        public static <T> rx.internal.operators.c4.d<T> c() {
                rx.internal.operators.c4$d<java.lang.Object> r0 = rx.internal.operators.c4.d.d
                return r0
        }

        public rx.internal.operators.c4.d<T> a() {
                r1 = this;
                rx.internal.operators.c4$d r0 = c()
                return r0
        }

        public rx.internal.operators.c4.d<T> b(rx.f<T> r3, rx.e<T> r4) {
                r2 = this;
                rx.internal.operators.c4$d r0 = new rx.internal.operators.c4$d
                r1 = 0
                r0.<init>(r3, r4, r1)
                return r0
        }

        public rx.internal.operators.c4.d<T> d() {
                r4 = this;
                rx.internal.operators.c4$d r0 = new rx.internal.operators.c4$d
                rx.f<T> r1 = r4.a
                rx.e<T> r2 = r4.b
                int r3 = r4.c
                int r3 = r3 + 1
                r0.<init>(r1, r2, r3)
                return r0
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            rx.internal.operators.c4.f = r0
            return
    }

    public c4(long r1, long r3, java.util.concurrent.TimeUnit r5, int r6, rx.h r7) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r3
            r0.c = r5
            r0.e = r6
            r0.d = r7
            return
    }

    public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            rx.l r1 = r0.call(r1)
            return r1
    }

    public rx.l<? super T> call(rx.l<? super rx.e<T>> r7) {
            r6 = this;
            rx.h r0 = r6.d
            rx.h$a r0 = r0.a()
            long r1 = r6.a
            long r3 = r6.b
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L1a
            rx.internal.operators.c4$b r1 = new rx.internal.operators.c4$b
            r1.<init>(r6, r7, r0)
            r1.add(r0)
            r1.H()
            return r1
        L1a:
            rx.internal.operators.c4$c r1 = new rx.internal.operators.c4$c
            r1.<init>(r6, r7, r0)
            r1.add(r0)
            r1.s()
            r1.j()
            return r1
    }
}
