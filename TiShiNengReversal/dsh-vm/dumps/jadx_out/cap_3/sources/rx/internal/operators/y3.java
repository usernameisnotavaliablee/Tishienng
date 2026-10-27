package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class y3<T, U> implements rx.e.b<rx.e<T>, T> {
    static final java.lang.Object b = null;
    final rx.e<U> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a<T, U> extends rx.l<U> {
        final rx.internal.operators.y3.b<T> a;

        public a(rx.internal.operators.y3.b<T> r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        public void onCompleted() {
                r1 = this;
                rx.internal.operators.y3$b<T> r0 = r1.a
                r0.onCompleted()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.internal.operators.y3$b<T> r0 = r1.a
                r0.onError(r2)
                return
        }

        public void onNext(U r1) {
                r0 = this;
                rx.internal.operators.y3$b<T> r1 = r0.a
                r1.H()
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
    static final class b<T> extends rx.l<T> {
        final rx.l<? super rx.e<T>> a;
        final java.lang.Object b;
        rx.f<T> c;
        rx.e<T> d;
        boolean e;
        java.util.List<java.lang.Object> f;

        public b(rx.l<? super rx.e<T>> r2) {
                r1 = this;
                r1.<init>()
                rx.observers.g r0 = new rx.observers.g
                r0.<init>(r2)
                r1.a = r0
                java.lang.Object r2 = new java.lang.Object
                r2.<init>()
                r1.b = r2
                return
        }

        void A(T r2) {
                r1 = this;
                rx.f<T> r0 = r1.c
                if (r0 == 0) goto L7
                r0.onNext(r2)
            L7:
                return
        }

        void B(java.lang.Throwable r3) {
                r2 = this;
                rx.f<T> r0 = r2.c
                r1 = 0
                r2.c = r1
                r2.d = r1
                if (r0 == 0) goto Lc
                r0.onError(r3)
            Lc:
                rx.l<? super rx.e<T>> r0 = r2.a
                r0.onError(r3)
                r2.unsubscribe()
                return
        }

        void G() {
                r2 = this;
                rx.f<T> r0 = r2.c
                if (r0 == 0) goto L7
                r0.onCompleted()
            L7:
                r2.j()
                rx.l<? super rx.e<T>> r0 = r2.a
                rx.e<T> r1 = r2.d
                r0.onNext(r1)
                return
        }

        void H() {
                r6 = this;
                java.lang.Object r0 = r6.b
                monitor-enter(r0)
                boolean r1 = r6.e     // Catch: java.lang.Throwable -> L13
                if (r1 == 0) goto L1e
                java.util.List<java.lang.Object> r1 = r6.f     // Catch: java.lang.Throwable -> L13
                if (r1 != 0) goto L15
                java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L13
                r1.<init>()     // Catch: java.lang.Throwable -> L13
                r6.f = r1     // Catch: java.lang.Throwable -> L13
                goto L15
            L13:
                r1 = move-exception
                goto L6d
            L15:
                java.util.List<java.lang.Object> r1 = r6.f     // Catch: java.lang.Throwable -> L13
                java.lang.Object r2 = rx.internal.operators.y3.b     // Catch: java.lang.Throwable -> L13
                r1.add(r2)     // Catch: java.lang.Throwable -> L13
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                return
            L1e:
                java.util.List<java.lang.Object> r1 = r6.f     // Catch: java.lang.Throwable -> L13
                r2 = 0
                r6.f = r2     // Catch: java.lang.Throwable -> L13
                r3 = 1
                r6.e = r3     // Catch: java.lang.Throwable -> L13
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                r0 = 1
            L28:
                r4 = 0
                r6.s(r1)     // Catch: java.lang.Throwable -> L33
                if (r0 == 0) goto L36
                r6.G()     // Catch: java.lang.Throwable -> L33
                r0 = 0
                goto L36
            L33:
                r0 = move-exception
                r3 = 0
                goto L60
            L36:
                java.lang.Object r1 = r6.b     // Catch: java.lang.Throwable -> L33
                monitor-enter(r1)     // Catch: java.lang.Throwable -> L33
                java.util.List<java.lang.Object> r5 = r6.f     // Catch: java.lang.Throwable -> L45
                r6.f = r2     // Catch: java.lang.Throwable -> L45
                if (r5 != 0) goto L48
                r6.e = r4     // Catch: java.lang.Throwable -> L45
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L43
                return
            L43:
                r0 = move-exception
                goto L5d
            L45:
                r0 = move-exception
                r3 = 0
                goto L5d
            L48:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L45
                rx.l<? super rx.e<T>> r1 = r6.a     // Catch: java.lang.Throwable -> L33
                boolean r1 = r1.isUnsubscribed()     // Catch: java.lang.Throwable -> L33
                if (r1 == 0) goto L5b
                java.lang.Object r1 = r6.b
                monitor-enter(r1)
                r6.e = r4     // Catch: java.lang.Throwable -> L58
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L58
                return
            L58:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L58
                throw r0
            L5b:
                r1 = r5
                goto L28
            L5d:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L43
                throw r0     // Catch: java.lang.Throwable -> L5f
            L5f:
                r0 = move-exception
            L60:
                if (r3 != 0) goto L6c
                java.lang.Object r1 = r6.b
                monitor-enter(r1)
                r6.e = r4     // Catch: java.lang.Throwable -> L69
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L69
                goto L6c
            L69:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L69
                throw r0
            L6c:
                throw r0
            L6d:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                throw r1
        }

        void g() {
                r2 = this;
                rx.f<T> r0 = r2.c
                r1 = 0
                r2.c = r1
                r2.d = r1
                if (r0 == 0) goto Lc
                r0.onCompleted()
            Lc:
                rx.l<? super rx.e<T>> r0 = r2.a
                r0.onCompleted()
                r2.unsubscribe()
                return
        }

        void j() {
                r1 = this;
                rx.subjects.i r0 = rx.subjects.i.y7()
                r1.c = r0
                r1.d = r0
                return
        }

        public void onCompleted() {
                r3 = this;
                java.lang.Object r0 = r3.b
                monitor-enter(r0)
                boolean r1 = r3.e     // Catch: java.lang.Throwable -> L13
                if (r1 == 0) goto L20
                java.util.List<java.lang.Object> r1 = r3.f     // Catch: java.lang.Throwable -> L13
                if (r1 != 0) goto L15
                java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L13
                r1.<init>()     // Catch: java.lang.Throwable -> L13
                r3.f = r1     // Catch: java.lang.Throwable -> L13
                goto L15
            L13:
                r1 = move-exception
                goto L35
            L15:
                java.util.List<java.lang.Object> r1 = r3.f     // Catch: java.lang.Throwable -> L13
                java.lang.Object r2 = rx.internal.operators.v.b()     // Catch: java.lang.Throwable -> L13
                r1.add(r2)     // Catch: java.lang.Throwable -> L13
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                return
            L20:
                java.util.List<java.lang.Object> r1 = r3.f     // Catch: java.lang.Throwable -> L13
                r2 = 0
                r3.f = r2     // Catch: java.lang.Throwable -> L13
                r2 = 1
                r3.e = r2     // Catch: java.lang.Throwable -> L13
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                r3.s(r1)     // Catch: java.lang.Throwable -> L30
                r3.g()
                return
            L30:
                r0 = move-exception
                r3.B(r0)
                return
            L35:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                throw r1
        }

        public void onError(java.lang.Throwable r3) {
                r2 = this;
                java.lang.Object r0 = r2.b
                monitor-enter(r0)
                boolean r1 = r2.e     // Catch: java.lang.Throwable -> L13
                if (r1 == 0) goto L15
                java.lang.Object r3 = rx.internal.operators.v.c(r3)     // Catch: java.lang.Throwable -> L13
                java.util.List r3 = java.util.Collections.singletonList(r3)     // Catch: java.lang.Throwable -> L13
                r2.f = r3     // Catch: java.lang.Throwable -> L13
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                return
            L13:
                r3 = move-exception
                goto L20
            L15:
                r1 = 0
                r2.f = r1     // Catch: java.lang.Throwable -> L13
                r1 = 1
                r2.e = r1     // Catch: java.lang.Throwable -> L13
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                r2.B(r3)
                return
            L20:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                throw r3
        }

        public void onNext(T r7) {
                r6 = this;
                java.lang.Object r0 = r6.b
                monitor-enter(r0)
                boolean r1 = r6.e     // Catch: java.lang.Throwable -> L13
                if (r1 == 0) goto L1c
                java.util.List<java.lang.Object> r1 = r6.f     // Catch: java.lang.Throwable -> L13
                if (r1 != 0) goto L15
                java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L13
                r1.<init>()     // Catch: java.lang.Throwable -> L13
                r6.f = r1     // Catch: java.lang.Throwable -> L13
                goto L15
            L13:
                r7 = move-exception
                goto L6b
            L15:
                java.util.List<java.lang.Object> r1 = r6.f     // Catch: java.lang.Throwable -> L13
                r1.add(r7)     // Catch: java.lang.Throwable -> L13
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                return
            L1c:
                java.util.List<java.lang.Object> r1 = r6.f     // Catch: java.lang.Throwable -> L13
                r2 = 0
                r6.f = r2     // Catch: java.lang.Throwable -> L13
                r3 = 1
                r6.e = r3     // Catch: java.lang.Throwable -> L13
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                r0 = 1
            L26:
                r4 = 0
                r6.s(r1)     // Catch: java.lang.Throwable -> L31
                if (r0 == 0) goto L34
                r6.A(r7)     // Catch: java.lang.Throwable -> L31
                r0 = 0
                goto L34
            L31:
                r7 = move-exception
                r3 = 0
                goto L5e
            L34:
                java.lang.Object r1 = r6.b     // Catch: java.lang.Throwable -> L31
                monitor-enter(r1)     // Catch: java.lang.Throwable -> L31
                java.util.List<java.lang.Object> r5 = r6.f     // Catch: java.lang.Throwable -> L43
                r6.f = r2     // Catch: java.lang.Throwable -> L43
                if (r5 != 0) goto L46
                r6.e = r4     // Catch: java.lang.Throwable -> L43
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L41
                return
            L41:
                r7 = move-exception
                goto L5b
            L43:
                r7 = move-exception
                r3 = 0
                goto L5b
            L46:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L43
                rx.l<? super rx.e<T>> r1 = r6.a     // Catch: java.lang.Throwable -> L31
                boolean r1 = r1.isUnsubscribed()     // Catch: java.lang.Throwable -> L31
                if (r1 == 0) goto L59
                java.lang.Object r1 = r6.b
                monitor-enter(r1)
                r6.e = r4     // Catch: java.lang.Throwable -> L56
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L56
                return
            L56:
                r7 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L56
                throw r7
            L59:
                r1 = r5
                goto L26
            L5b:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L41
                throw r7     // Catch: java.lang.Throwable -> L5d
            L5d:
                r7 = move-exception
            L5e:
                if (r3 != 0) goto L6a
                java.lang.Object r0 = r6.b
                monitor-enter(r0)
                r6.e = r4     // Catch: java.lang.Throwable -> L67
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L67
                goto L6a
            L67:
                r7 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L67
                throw r7
            L6a:
                throw r7
            L6b:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                throw r7
        }

        public void onStart() {
                r2 = this;
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r2.request(r0)
                return
        }

        void s(java.util.List<java.lang.Object> r3) {
                r2 = this;
                if (r3 != 0) goto L3
                goto L35
            L3:
                java.util.Iterator r3 = r3.iterator()
            L7:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L35
                java.lang.Object r0 = r3.next()
                java.lang.Object r1 = rx.internal.operators.y3.b
                if (r0 != r1) goto L19
                r2.G()
                goto L7
            L19:
                boolean r1 = rx.internal.operators.v.g(r0)
                if (r1 == 0) goto L27
                java.lang.Throwable r3 = rx.internal.operators.v.d(r0)
                r2.B(r3)
                return
            L27:
                boolean r1 = rx.internal.operators.v.f(r0)
                if (r1 == 0) goto L31
                r2.g()
                return
            L31:
                r2.A(r0)
                goto L7
            L35:
                return
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            rx.internal.operators.y3.b = r0
            return
    }

    public y3(rx.e<U> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
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
            rx.internal.operators.y3$b r0 = new rx.internal.operators.y3$b
            r0.<init>(r3)
            rx.internal.operators.y3$a r1 = new rx.internal.operators.y3$a
            r1.<init>(r0)
            r3.add(r0)
            r3.add(r1)
            r0.H()
            rx.e<U> r3 = r2.a
            r3.J6(r1)
            return r0
    }
}
