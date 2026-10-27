package rx.subjects;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class c<T> extends rx.subjects.f<T, T> {
    final rx.subjects.c.b<T> b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a<T> extends java.util.concurrent.atomic.AtomicLong implements rx.g, rx.m, rx.f<T> {
        private static final long serialVersionUID = 6451806817170721536L;
        final rx.subjects.c.b<T> a;
        final rx.l<? super T> b;
        long c;

        public a(rx.subjects.c.b<T> r1, rx.l<? super T> r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }

        public boolean isUnsubscribed() {
                r5 = this;
                long r0 = r5.get()
                r2 = -9223372036854775808
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto Lc
                r0 = 1
                return r0
            Lc:
                r0 = 0
                return r0
        }

        public void onCompleted() {
                r5 = this;
                long r0 = r5.get()
                r2 = -9223372036854775808
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto Lf
                rx.l<? super T> r0 = r5.b
                r0.onCompleted()
            Lf:
                return
        }

        public void onError(java.lang.Throwable r6) {
                r5 = this;
                long r0 = r5.get()
                r2 = -9223372036854775808
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto Lf
                rx.l<? super T> r0 = r5.b
                r0.onError(r6)
            Lf:
                return
        }

        public void onNext(T r6) {
                r5 = this;
                long r0 = r5.get()
                r2 = -9223372036854775808
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L2a
                long r2 = r5.c
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L1b
                r0 = 1
                long r2 = r2 + r0
                r5.c = r2
                rx.l<? super T> r0 = r5.b
                r0.onNext(r6)
                return
            L1b:
                r5.unsubscribe()
                rx.l<? super T> r6 = r5.b
                rx.exceptions.MissingBackpressureException r0 = new rx.exceptions.MissingBackpressureException
                java.lang.String r1 = "PublishSubject: could not emit value due to lack of requests"
                r0.<init>(r1)
                r6.onError(r0)
            L2a:
                return
        }

        public void request(long r6) {
                r5 = this;
                boolean r0 = rx.internal.operators.a.j(r6)
                if (r0 == 0) goto L1b
            L6:
                long r0 = r5.get()
                r2 = -9223372036854775808
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L11
                goto L1b
            L11:
                long r2 = rx.internal.operators.a.a(r0, r6)
                boolean r0 = r5.compareAndSet(r0, r2)
                if (r0 == 0) goto L6
            L1b:
                return
        }

        public void unsubscribe() {
                r5 = this;
                r0 = -9223372036854775808
                long r2 = r5.getAndSet(r0)
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 == 0) goto Lf
                rx.subjects.c$b<T> r0 = r5.a
                r0.e(r5)
            Lf:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b<T> extends java.util.concurrent.atomic.AtomicReference<rx.subjects.c.a<T>[]> implements rx.e.a<T>, rx.f<T> {
        static final rx.subjects.c.a[] b = null;
        static final rx.subjects.c.a[] c = null;
        private static final long serialVersionUID = -7568940796666027140L;
        java.lang.Throwable a;

        static {
                r0 = 0
                rx.subjects.c$a[] r1 = new rx.subjects.c.a[r0]
                rx.subjects.c.b.b = r1
                rx.subjects.c$a[] r0 = new rx.subjects.c.a[r0]
                rx.subjects.c.b.c = r0
                return
        }

        public b() {
                r1 = this;
                r1.<init>()
                rx.subjects.c$a[] r0 = rx.subjects.c.b.b
                r1.lazySet(r0)
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
                rx.subjects.c$a r0 = new rx.subjects.c$a
                r0.<init>(r2, r3)
                r3.add(r0)
                r3.setProducer(r0)
                boolean r1 = r2.d(r0)
                if (r1 == 0) goto L1b
                boolean r3 = r0.isUnsubscribed()
                if (r3 == 0) goto L1a
                r2.e(r0)
            L1a:
                return
            L1b:
                java.lang.Throwable r0 = r2.a
                if (r0 == 0) goto L23
                r3.onError(r0)
                return
            L23:
                r3.onCompleted()
                return
        }

        boolean d(rx.subjects.c.a<T> r5) {
                r4 = this;
            L0:
                java.lang.Object r0 = r4.get()
                rx.subjects.c$a[] r0 = (rx.subjects.c.a[]) r0
                rx.subjects.c$a[] r1 = rx.subjects.c.b.c
                r2 = 0
                if (r0 != r1) goto Lc
                return r2
            Lc:
                int r1 = r0.length
                int r3 = r1 + 1
                rx.subjects.c$a[] r3 = new rx.subjects.c.a[r3]
                java.lang.System.arraycopy(r0, r2, r3, r2, r1)
                r3[r1] = r5
                boolean r0 = r4.compareAndSet(r0, r3)
                if (r0 == 0) goto L0
                r5 = 1
                return r5
        }

        void e(rx.subjects.c.a<T> r7) {
                r6 = this;
            L0:
                java.lang.Object r0 = r6.get()
                rx.subjects.c$a[] r0 = (rx.subjects.c.a[]) r0
                rx.subjects.c$a[] r1 = rx.subjects.c.b.c
                if (r0 == r1) goto L3b
                rx.subjects.c$a[] r1 = rx.subjects.c.b.b
                if (r0 != r1) goto Lf
                goto L3b
            Lf:
                int r1 = r0.length
                r2 = 0
                r3 = 0
            L12:
                if (r3 >= r1) goto L1c
                r4 = r0[r3]
                if (r4 != r7) goto L19
                goto L1d
            L19:
                int r3 = r3 + 1
                goto L12
            L1c:
                r3 = -1
            L1d:
                if (r3 >= 0) goto L20
                goto L3b
            L20:
                r4 = 1
                if (r1 != r4) goto L26
                rx.subjects.c$a[] r1 = rx.subjects.c.b.b
                goto L35
            L26:
                int r5 = r1 + (-1)
                rx.subjects.c$a[] r5 = new rx.subjects.c.a[r5]
                java.lang.System.arraycopy(r0, r2, r5, r2, r3)
                int r2 = r3 + 1
                int r1 = r1 - r3
                int r1 = r1 - r4
                java.lang.System.arraycopy(r0, r2, r5, r3, r1)
                r1 = r5
            L35:
                boolean r0 = r6.compareAndSet(r0, r1)
                if (r0 == 0) goto L0
            L3b:
                return
        }

        public void onCompleted() {
                r4 = this;
                rx.subjects.c$a[] r0 = rx.subjects.c.b.c
                java.lang.Object r0 = r4.getAndSet(r0)
                rx.subjects.c$a[] r0 = (rx.subjects.c.a[]) r0
                int r1 = r0.length
                r2 = 0
            La:
                if (r2 >= r1) goto L14
                r3 = r0[r2]
                r3.onCompleted()
                int r2 = r2 + 1
                goto La
            L14:
                return
        }

        public void onError(java.lang.Throwable r7) {
                r6 = this;
                r6.a = r7
                rx.subjects.c$a[] r0 = rx.subjects.c.b.c
                java.lang.Object r0 = r6.getAndSet(r0)
                rx.subjects.c$a[] r0 = (rx.subjects.c.a[]) r0
                int r1 = r0.length
                r2 = 0
                r3 = 0
            Ld:
                if (r3 >= r1) goto L24
                r4 = r0[r3]
                r4.onError(r7)     // Catch: java.lang.Throwable -> L15
                goto L21
            L15:
                r4 = move-exception
                if (r2 != 0) goto L1e
                java.util.ArrayList r2 = new java.util.ArrayList
                r5 = 1
                r2.<init>(r5)
            L1e:
                r2.add(r4)
            L21:
                int r3 = r3 + 1
                goto Ld
            L24:
                rx.exceptions.a.d(r2)
                return
        }

        public void onNext(T r5) {
                r4 = this;
                java.lang.Object r0 = r4.get()
                rx.subjects.c$a[] r0 = (rx.subjects.c.a[]) r0
                int r1 = r0.length
                r2 = 0
            L8:
                if (r2 >= r1) goto L12
                r3 = r0[r2]
                r3.onNext(r5)
                int r2 = r2 + 1
                goto L8
            L12:
                return
        }
    }

    protected c(rx.subjects.c.b<T> r1) {
            r0 = this;
            r0.<init>(r1)
            r0.b = r1
            return
    }

    public static <T> rx.subjects.c<T> y7() {
            rx.subjects.c r0 = new rx.subjects.c
            rx.subjects.c$b r1 = new rx.subjects.c$b
            r1.<init>()
            r0.<init>(r1)
            return r0
    }

    public boolean A7() {
            r2 = this;
            rx.subjects.c$b<T> r0 = r2.b
            java.lang.Object r0 = r0.get()
            rx.subjects.c$a[] r1 = rx.subjects.c.b.c
            if (r0 != r1) goto L12
            rx.subjects.c$b<T> r0 = r2.b
            java.lang.Throwable r0 = r0.a
            if (r0 != 0) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }

    public boolean B7() {
            r2 = this;
            rx.subjects.c$b<T> r0 = r2.b
            java.lang.Object r0 = r0.get()
            rx.subjects.c$a[] r1 = rx.subjects.c.b.c
            if (r0 != r1) goto L12
            rx.subjects.c$b<T> r0 = r2.b
            java.lang.Throwable r0 = r0.a
            if (r0 == 0) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }

    public void onCompleted() {
            r1 = this;
            rx.subjects.c$b<T> r0 = r1.b
            r0.onCompleted()
            return
    }

    public void onError(java.lang.Throwable r2) {
            r1 = this;
            rx.subjects.c$b<T> r0 = r1.b
            r0.onError(r2)
            return
    }

    public void onNext(T r2) {
            r1 = this;
            rx.subjects.c$b<T> r0 = r1.b
            r0.onNext(r2)
            return
    }

    @Override // rx.subjects.f
    public boolean w7() {
            r1 = this;
            rx.subjects.c$b<T> r0 = r1.b
            java.lang.Object r0 = r0.get()
            rx.subjects.c$a[] r0 = (rx.subjects.c.a[]) r0
            int r0 = r0.length
            if (r0 == 0) goto Ld
            r0 = 1
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public java.lang.Throwable z7() {
            r2 = this;
            rx.subjects.c$b<T> r0 = r2.b
            java.lang.Object r0 = r0.get()
            rx.subjects.c$a[] r1 = rx.subjects.c.b.c
            if (r0 != r1) goto Lf
            rx.subjects.c$b<T> r0 = r2.b
            java.lang.Throwable r0 = r0.a
            return r0
        Lf:
            r0 = 0
            return r0
    }
}
