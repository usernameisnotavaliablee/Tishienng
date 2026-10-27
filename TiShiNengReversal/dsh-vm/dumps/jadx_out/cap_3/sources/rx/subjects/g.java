package rx.subjects;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
final class g<T> extends java.util.concurrent.atomic.AtomicReference<rx.subjects.g.b<T>> implements rx.e.a<T> {
    private static final long serialVersionUID = 6035251036011671568L;
    volatile java.lang.Object a;
    boolean b;
    rx.functions.b<rx.subjects.g.c<T>> c;
    rx.functions.b<rx.subjects.g.c<T>> d;
    rx.functions.b<rx.subjects.g.c<T>> e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements rx.functions.a {
        final /* synthetic */ rx.subjects.g.c a;
        final /* synthetic */ rx.subjects.g b;

        a(rx.subjects.g r1, rx.subjects.g.c r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void call() {
                r2 = this;
                rx.subjects.g r0 = r2.b
                rx.subjects.g$c r1 = r2.a
                r0.f(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    protected static final class b<T> {
        static final rx.subjects.g.c[] c = null;
        static final rx.subjects.g.b d = null;
        static final rx.subjects.g.b e = null;
        final boolean a;
        final rx.subjects.g.c[] b;

        static {
                r0 = 0
                rx.subjects.g$c[] r1 = new rx.subjects.g.c[r0]
                rx.subjects.g.b.c = r1
                rx.subjects.g$b r2 = new rx.subjects.g$b
                r3 = 1
                r2.<init>(r3, r1)
                rx.subjects.g.b.d = r2
                rx.subjects.g$b r2 = new rx.subjects.g$b
                r2.<init>(r0, r1)
                rx.subjects.g.b.e = r2
                return
        }

        public b(boolean r1, rx.subjects.g.c[] r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }

        public rx.subjects.g.b a(rx.subjects.g.c r5) {
                r4 = this;
                rx.subjects.g$c[] r0 = r4.b
                int r1 = r0.length
                int r2 = r1 + 1
                rx.subjects.g$c[] r2 = new rx.subjects.g.c[r2]
                r3 = 0
                java.lang.System.arraycopy(r0, r3, r2, r3, r1)
                r2[r1] = r5
                rx.subjects.g$b r5 = new rx.subjects.g$b
                boolean r0 = r4.a
                r5.<init>(r0, r2)
                return r5
        }

        public rx.subjects.g.b b(rx.subjects.g.c r10) {
                r9 = this;
                rx.subjects.g$c[] r0 = r9.b
                int r1 = r0.length
                r2 = 1
                r3 = 0
                if (r1 != r2) goto Le
                r2 = r0[r3]
                if (r2 != r10) goto Le
                rx.subjects.g$b r10 = rx.subjects.g.b.e
                return r10
            Le:
                if (r1 != 0) goto L11
                goto L1f
            L11:
                int r2 = r1 + (-1)
                rx.subjects.g$c[] r4 = new rx.subjects.g.c[r2]
                r5 = 0
                r6 = 0
            L17:
                if (r5 >= r1) goto L28
                r7 = r0[r5]
                if (r7 == r10) goto L25
                if (r6 != r2) goto L20
            L1f:
                return r9
            L20:
                int r8 = r6 + 1
                r4[r6] = r7
                r6 = r8
            L25:
                int r5 = r5 + 1
                goto L17
            L28:
                if (r6 != 0) goto L2d
                rx.subjects.g$b r10 = rx.subjects.g.b.e
                return r10
            L2d:
                if (r6 >= r2) goto L35
                rx.subjects.g$c[] r10 = new rx.subjects.g.c[r6]
                java.lang.System.arraycopy(r4, r3, r10, r3, r6)
                r4 = r10
            L35:
                rx.subjects.g$b r10 = new rx.subjects.g$b
                boolean r0 = r9.a
                r10.<init>(r0, r4)
                return r10
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    protected static final class c<T> implements rx.f<T> {
        final rx.l<? super T> a;
        boolean b;
        boolean c;
        java.util.List<java.lang.Object> d;
        boolean e;
        volatile boolean f;
        private volatile java.lang.Object g;

        public c(rx.l<? super T> r2) {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.b = r0
                r1.a = r2
                return
        }

        public void A(java.lang.Object r1) {
                r0 = this;
                r0.g = r1
                return
        }

        void d(java.lang.Object r2) {
                r1 = this;
                if (r2 == 0) goto L7
                rx.l<? super T> r0 = r1.a
                rx.internal.operators.v.a(r0, r2)
            L7:
                return
        }

        void e(java.lang.Object r2) {
                r1 = this;
                monitor-enter(r1)
                boolean r0 = r1.b     // Catch: java.lang.Throwable -> L1a
                if (r0 == 0) goto L1c
                boolean r0 = r1.c     // Catch: java.lang.Throwable -> L1a
                if (r0 == 0) goto La
                goto L1c
            La:
                r0 = 0
                r1.b = r0     // Catch: java.lang.Throwable -> L1a
                if (r2 == 0) goto L10
                r0 = 1
            L10:
                r1.c = r0     // Catch: java.lang.Throwable -> L1a
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
                if (r2 == 0) goto L19
                r0 = 0
                r1.f(r0, r2)
            L19:
                return
            L1a:
                r2 = move-exception
                goto L1e
            L1c:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
                return
            L1e:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
                throw r2
        }

        void f(java.util.List<java.lang.Object> r5, java.lang.Object r6) {
                r4 = this;
                r0 = 1
                r1 = 1
            L2:
                r2 = 0
                if (r5 == 0) goto L1a
                java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L17
            L9:
                boolean r3 = r5.hasNext()     // Catch: java.lang.Throwable -> L17
                if (r3 == 0) goto L1a
                java.lang.Object r3 = r5.next()     // Catch: java.lang.Throwable -> L17
                r4.d(r3)     // Catch: java.lang.Throwable -> L17
                goto L9
            L17:
                r5 = move-exception
                r0 = 0
                goto L36
            L1a:
                if (r1 == 0) goto L20
                r4.d(r6)     // Catch: java.lang.Throwable -> L17
                r1 = 0
            L20:
                monitor-enter(r4)     // Catch: java.lang.Throwable -> L17
                java.util.List<java.lang.Object> r5 = r4.d     // Catch: java.lang.Throwable -> L2e
                r3 = 0
                r4.d = r3     // Catch: java.lang.Throwable -> L2e
                if (r5 != 0) goto L31
                r4.c = r2     // Catch: java.lang.Throwable -> L2e
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L2c
                return
            L2c:
                r5 = move-exception
                goto L33
            L2e:
                r5 = move-exception
                r0 = 0
                goto L33
            L31:
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L2e
                goto L2
            L33:
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L2c
                throw r5     // Catch: java.lang.Throwable -> L35
            L35:
                r5 = move-exception
            L36:
                if (r0 != 0) goto L40
                monitor-enter(r4)
                r4.c = r2     // Catch: java.lang.Throwable -> L3d
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L3d
                goto L40
            L3d:
                r5 = move-exception
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L3d
                throw r5
            L40:
                throw r5
        }

        void g(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r1.e
                if (r0 != 0) goto L28
                monitor-enter(r1)
                r0 = 0
                r1.b = r0     // Catch: java.lang.Throwable -> L18
                boolean r0 = r1.c     // Catch: java.lang.Throwable -> L18
                if (r0 == 0) goto L21
                java.util.List<java.lang.Object> r0 = r1.d     // Catch: java.lang.Throwable -> L18
                if (r0 != 0) goto L1a
                java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L18
                r0.<init>()     // Catch: java.lang.Throwable -> L18
                r1.d = r0     // Catch: java.lang.Throwable -> L18
                goto L1a
            L18:
                r2 = move-exception
                goto L26
            L1a:
                java.util.List<java.lang.Object> r0 = r1.d     // Catch: java.lang.Throwable -> L18
                r0.add(r2)     // Catch: java.lang.Throwable -> L18
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L18
                return
            L21:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L18
                r0 = 1
                r1.e = r0
                goto L28
            L26:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L18
                throw r2
            L28:
                rx.l<? super T> r0 = r1.a
                rx.internal.operators.v.a(r0, r2)
                return
        }

        rx.f<? super T> j() {
                r1 = this;
                rx.l<? super T> r0 = r1.a
                return r0
        }

        public void onCompleted() {
                r1 = this;
                rx.l<? super T> r0 = r1.a
                r0.onCompleted()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.l<? super T> r0 = r1.a
                r0.onError(r2)
                return
        }

        public void onNext(T r2) {
                r1 = this;
                rx.l<? super T> r0 = r1.a
                r0.onNext(r2)
                return
        }

        public <I> I s() {
                r1 = this;
                java.lang.Object r0 = r1.g
                return r0
        }
    }

    public g() {
            r1 = this;
            rx.subjects.g$b r0 = rx.subjects.g.b.e
            r1.<init>(r0)
            r0 = 1
            r1.b = r0
            rx.functions.m$m r0 = rx.functions.m.a()
            r1.c = r0
            rx.functions.m$m r0 = rx.functions.m.a()
            r1.d = r0
            rx.functions.m$m r0 = rx.functions.m.a()
            r1.e = r0
            return
    }

    boolean a(rx.subjects.g.c<T> r3) {
            r2 = this;
        L0:
            java.lang.Object r0 = r2.get()
            rx.subjects.g$b r0 = (rx.subjects.g.b) r0
            boolean r1 = r0.a
            if (r1 == 0) goto L11
            rx.functions.b<rx.subjects.g$c<T>> r0 = r2.e
            r0.call(r3)
            r3 = 0
            return r3
        L11:
            rx.subjects.g$b r1 = r0.a(r3)
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 == 0) goto L0
            rx.functions.b<rx.subjects.g$c<T>> r0 = r2.d
            r0.call(r3)
            r3 = 1
            return r3
    }

    void b(rx.l<? super T> r2, rx.subjects.g.c<T> r3) {
            r1 = this;
            rx.subjects.g$a r0 = new rx.subjects.g$a
            r0.<init>(r1, r3)
            rx.m r3 = rx.subscriptions.f.a(r0)
            r2.add(r3)
            return
    }

    java.lang.Object c() {
            r1 = this;
            java.lang.Object r0 = r1.a
            return r0
    }

    public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            r0.call(r1)
            return
    }

    public void call(rx.l<? super T> r3) {
            r2 = this;
            rx.subjects.g$c r0 = new rx.subjects.g$c
            r0.<init>(r3)
            r2.b(r3, r0)
            rx.functions.b<rx.subjects.g$c<T>> r1 = r2.c
            r1.call(r0)
            boolean r1 = r3.isUnsubscribed()
            if (r1 != 0) goto L22
            boolean r1 = r2.a(r0)
            if (r1 == 0) goto L22
            boolean r3 = r3.isUnsubscribed()
            if (r3 == 0) goto L22
            r2.f(r0)
        L22:
            return
    }

    rx.subjects.g.c<T>[] d(java.lang.Object r1) {
            r0 = this;
            r0.g(r1)
            java.lang.Object r1 = r0.get()
            rx.subjects.g$b r1 = (rx.subjects.g.b) r1
            rx.subjects.g$c[] r1 = r1.b
            return r1
    }

    rx.subjects.g.c<T>[] e() {
            r1 = this;
            java.lang.Object r0 = r1.get()
            rx.subjects.g$b r0 = (rx.subjects.g.b) r0
            rx.subjects.g$c[] r0 = r0.b
            return r0
    }

    void f(rx.subjects.g.c<T> r3) {
            r2 = this;
        L0:
            java.lang.Object r0 = r2.get()
            rx.subjects.g$b r0 = (rx.subjects.g.b) r0
            boolean r1 = r0.a
            if (r1 == 0) goto Lb
            goto L17
        Lb:
            rx.subjects.g$b r1 = r0.b(r3)
            if (r1 == r0) goto L17
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 == 0) goto L0
        L17:
            return
    }

    void g(java.lang.Object r1) {
            r0 = this;
            r0.a = r1
            return
    }

    rx.subjects.g.c<T>[] h(java.lang.Object r1) {
            r0 = this;
            r0.g(r1)
            r1 = 0
            r0.b = r1
            java.lang.Object r1 = r0.get()
            rx.subjects.g$b r1 = (rx.subjects.g.b) r1
            boolean r1 = r1.a
            if (r1 == 0) goto L13
            rx.subjects.g$c[] r1 = rx.subjects.g.b.c
            return r1
        L13:
            rx.subjects.g$b r1 = rx.subjects.g.b.d
            java.lang.Object r1 = r0.getAndSet(r1)
            rx.subjects.g$b r1 = (rx.subjects.g.b) r1
            rx.subjects.g$c[] r1 = r1.b
            return r1
    }
}
