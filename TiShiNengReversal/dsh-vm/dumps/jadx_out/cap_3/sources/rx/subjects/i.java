package rx.subjects;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class i<T> extends rx.subjects.f<T, T> {
    final rx.subjects.i.a<T> b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a<T> extends java.util.concurrent.atomic.AtomicLong implements rx.g, rx.f<T>, rx.e.a<T>, rx.m {
        private static final long serialVersionUID = -9044104859202255786L;
        final java.util.concurrent.atomic.AtomicReference<rx.l<? super T>> a;
        final java.util.Queue<java.lang.Object> b;
        final boolean c;
        final java.util.concurrent.atomic.AtomicReference<rx.functions.a> d;
        java.lang.Throwable e;
        volatile boolean f;
        boolean g;
        boolean h;
        volatile boolean i;

        public a(int r2, boolean r3, rx.functions.a r4) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
                r0.<init>()
                r1.a = r0
                if (r4 == 0) goto L12
                java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
                r0.<init>(r4)
                goto L13
            L12:
                r0 = 0
            L13:
                r1.d = r0
                r1.c = r3
                r3 = 1
                if (r2 <= r3) goto L2c
                boolean r3 = rx.internal.util.unsafe.n0.f()
                if (r3 == 0) goto L26
                rx.internal.util.unsafe.h0 r3 = new rx.internal.util.unsafe.h0
                r3.<init>(r2)
                goto L3f
            L26:
                rx.internal.util.atomic.g r3 = new rx.internal.util.atomic.g
                r3.<init>(r2)
                goto L3f
            L2c:
                boolean r2 = rx.internal.util.unsafe.n0.f()
                if (r2 == 0) goto L39
                rx.internal.util.unsafe.g0 r2 = new rx.internal.util.unsafe.g0
                r2.<init>()
            L37:
                r3 = r2
                goto L3f
            L39:
                rx.internal.util.atomic.f r2 = new rx.internal.util.atomic.f
                r2.<init>()
                goto L37
            L3f:
                r1.b = r3
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
                java.util.concurrent.atomic.AtomicReference<rx.l<? super T>> r0 = r2.a
                r1 = 0
                boolean r0 = androidx.camera.view.p.a(r0, r1, r3)
                if (r0 == 0) goto L10
                r3.add(r2)
                r3.setProducer(r2)
                return
            L10:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Only a single subscriber is allowed"
                r0.<init>(r1)
                r3.onError(r0)
                return
        }

        boolean d(boolean r3, boolean r4, boolean r5, rx.l<? super T> r6) {
                r2 = this;
                boolean r0 = r6.isUnsubscribed()
                r1 = 1
                if (r0 == 0) goto Ld
                java.util.Queue<java.lang.Object> r3 = r2.b
                r3.clear()
                return r1
            Ld:
                if (r3 == 0) goto L2a
                java.lang.Throwable r3 = r2.e
                if (r3 == 0) goto L1e
                if (r5 != 0) goto L1e
                java.util.Queue<java.lang.Object> r4 = r2.b
                r4.clear()
                r6.onError(r3)
                return r1
            L1e:
                if (r4 == 0) goto L2a
                if (r3 == 0) goto L26
                r6.onError(r3)
                goto L29
            L26:
                r6.onCompleted()
            L29:
                return r1
            L2a:
                r3 = 0
                return r3
        }

        void e() {
                r3 = this;
                java.util.concurrent.atomic.AtomicReference<rx.functions.a> r0 = r3.d
                if (r0 == 0) goto L16
                java.lang.Object r1 = r0.get()
                rx.functions.a r1 = (rx.functions.a) r1
                if (r1 == 0) goto L16
                r2 = 0
                boolean r0 = androidx.camera.view.p.a(r0, r1, r2)
                if (r0 == 0) goto L16
                r1.call()
            L16:
                return
        }

        void f() {
                r15 = this;
                monitor-enter(r15)
                boolean r0 = r15.g     // Catch: java.lang.Throwable -> La
                r1 = 1
                if (r0 == 0) goto Ld
                r15.h = r1     // Catch: java.lang.Throwable -> La
                monitor-exit(r15)     // Catch: java.lang.Throwable -> La
                return
            La:
                r0 = move-exception
                goto L9c
            Ld:
                r15.g = r1     // Catch: java.lang.Throwable -> La
                monitor-exit(r15)     // Catch: java.lang.Throwable -> La
                java.util.Queue<java.lang.Object> r0 = r15.b
                boolean r2 = r15.c
            L14:
                java.util.concurrent.atomic.AtomicReference<rx.l<? super T>> r3 = r15.a
                java.lang.Object r3 = r3.get()
                rx.l r3 = (rx.l) r3
                r4 = 0
                if (r3 == 0) goto L7e
                boolean r5 = r15.f
                boolean r6 = r0.isEmpty()
                boolean r5 = r15.d(r5, r6, r2, r3)
                if (r5 == 0) goto L2c
                goto L54
            L2c:
                long r5 = r15.get()
                r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r9 != 0) goto L3b
                r7 = 1
                goto L3c
            L3b:
                r7 = 0
            L3c:
                r8 = 0
                r10 = r8
            L3f:
                int r12 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
                if (r12 == 0) goto L73
                boolean r12 = r15.f
                java.lang.Object r13 = r0.poll()
                if (r13 != 0) goto L4d
                r14 = 1
                goto L4e
            L4d:
                r14 = 0
            L4e:
                boolean r12 = r15.d(r12, r14, r2, r3)
                if (r12 == 0) goto L55
            L54:
                return
            L55:
                if (r14 == 0) goto L58
                goto L73
            L58:
                java.lang.Object r12 = rx.internal.operators.v.e(r13)
                r3.onNext(r12)     // Catch: java.lang.Throwable -> L64
                r12 = 1
                long r5 = r5 - r12
                long r10 = r10 + r12
                goto L3f
            L64:
                r1 = move-exception
                r0.clear()
                rx.exceptions.a.e(r1)
                java.lang.Throwable r0 = rx.exceptions.OnErrorThrowable.addValueAsLastCause(r1, r12)
                r3.onError(r0)
                return
            L73:
                if (r7 != 0) goto L7f
                int r3 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
                if (r3 == 0) goto L7f
                long r5 = -r10
                r15.addAndGet(r5)
                goto L7f
            L7e:
                r7 = 0
            L7f:
                monitor-enter(r15)
                boolean r3 = r15.h     // Catch: java.lang.Throwable -> L8f
                if (r3 != 0) goto L95
                if (r7 == 0) goto L91
                boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L8f
                if (r0 == 0) goto L91
                r15.i = r1     // Catch: java.lang.Throwable -> L8f
                goto L91
            L8f:
                r0 = move-exception
                goto L9a
            L91:
                r15.g = r4     // Catch: java.lang.Throwable -> L8f
                monitor-exit(r15)     // Catch: java.lang.Throwable -> L8f
                return
            L95:
                r15.h = r4     // Catch: java.lang.Throwable -> L8f
                monitor-exit(r15)     // Catch: java.lang.Throwable -> L8f
                goto L14
            L9a:
                monitor-exit(r15)     // Catch: java.lang.Throwable -> L8f
                throw r0
            L9c:
                monitor-exit(r15)     // Catch: java.lang.Throwable -> La
                throw r0
        }

        public boolean isUnsubscribed() {
                r1 = this;
                boolean r0 = r1.f
                return r0
        }

        public void onCompleted() {
                r1 = this;
                boolean r0 = r1.f
                if (r0 != 0) goto L26
                r1.e()
                r0 = 1
                r1.f = r0
                boolean r0 = r1.i
                if (r0 != 0) goto L1b
                monitor-enter(r1)
                boolean r0 = r1.i     // Catch: java.lang.Throwable -> L18
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L18
                if (r0 != 0) goto L1b
                r1.f()
                return
            L18:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L18
                throw r0
            L1b:
                java.util.concurrent.atomic.AtomicReference<rx.l<? super T>> r0 = r1.a
                java.lang.Object r0 = r0.get()
                rx.l r0 = (rx.l) r0
                r0.onCompleted()
            L26:
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.f
                if (r0 != 0) goto L28
                r1.e()
                r1.e = r2
                r0 = 1
                r1.f = r0
                boolean r0 = r1.i
                if (r0 != 0) goto L1d
                monitor-enter(r1)
                boolean r0 = r1.i     // Catch: java.lang.Throwable -> L1a
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
                if (r0 != 0) goto L1d
                r1.f()
                return
            L1a:
                r2 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
                throw r2
            L1d:
                java.util.concurrent.atomic.AtomicReference<rx.l<? super T>> r0 = r1.a
                java.lang.Object r0 = r0.get()
                rx.l r0 = (rx.l) r0
                r0.onError(r2)
            L28:
                return
        }

        public void onNext(T r3) {
                r2 = this;
                boolean r0 = r2.f
                if (r0 != 0) goto L34
                boolean r0 = r2.i
                if (r0 != 0) goto L24
                monitor-enter(r2)
                boolean r0 = r2.i     // Catch: java.lang.Throwable -> L18
                if (r0 != 0) goto L1a
                java.util.Queue<java.lang.Object> r0 = r2.b     // Catch: java.lang.Throwable -> L18
                java.lang.Object r1 = rx.internal.operators.v.j(r3)     // Catch: java.lang.Throwable -> L18
                r0.offer(r1)     // Catch: java.lang.Throwable -> L18
                r0 = 1
                goto L1b
            L18:
                r3 = move-exception
                goto L22
            L1a:
                r0 = 0
            L1b:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L18
                if (r0 == 0) goto L24
                r2.f()
                return
            L22:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L18
                throw r3
            L24:
                java.util.concurrent.atomic.AtomicReference<rx.l<? super T>> r0 = r2.a
                java.lang.Object r0 = r0.get()
                rx.l r0 = (rx.l) r0
                r0.onNext(r3)     // Catch: java.lang.Throwable -> L30
                return
            L30:
                r1 = move-exception
                rx.exceptions.a.g(r1, r0, r3)
            L34:
                return
        }

        public void request(long r4) {
                r3 = this;
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 < 0) goto L17
                if (r2 <= 0) goto Lf
                rx.internal.operators.a.b(r3, r4)
                r3.f()
                return
            Lf:
                boolean r4 = r3.f
                if (r4 == 0) goto L16
                r3.f()
            L16:
                return
            L17:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r5 = "n >= 0 required"
                r4.<init>(r5)
                throw r4
        }

        public void unsubscribe() {
                r2 = this;
                r2.e()
                r0 = 1
                r2.f = r0
                monitor-enter(r2)
                boolean r1 = r2.g     // Catch: java.lang.Throwable -> Ld
                if (r1 == 0) goto Lf
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                return
            Ld:
                r0 = move-exception
                goto L18
            Lf:
                r2.g = r0     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                java.util.Queue<java.lang.Object> r0 = r2.b
                r0.clear()
                return
            L18:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                throw r0
        }
    }

    private i(rx.subjects.i.a<T> r1) {
            r0 = this;
            r0.<init>(r1)
            r0.b = r1
            return
    }

    public static <T> rx.subjects.i<T> A7(int r2, rx.functions.a r3) {
            rx.subjects.i$a r0 = new rx.subjects.i$a
            r1 = 0
            r0.<init>(r2, r1, r3)
            rx.subjects.i r2 = new rx.subjects.i
            r2.<init>(r0)
            return r2
    }

    public static <T> rx.subjects.i<T> B7(int r1, rx.functions.a r2, boolean r3) {
            rx.subjects.i$a r0 = new rx.subjects.i$a
            r0.<init>(r1, r3, r2)
            rx.subjects.i r1 = new rx.subjects.i
            r1.<init>(r0)
            return r1
    }

    public static <T> rx.subjects.i<T> C7(boolean r3) {
            rx.subjects.i$a r0 = new rx.subjects.i$a
            r1 = 16
            r2 = 0
            r0.<init>(r1, r3, r2)
            rx.subjects.i r3 = new rx.subjects.i
            r3.<init>(r0)
            return r3
    }

    public static <T> rx.subjects.i<T> y7() {
            r0 = 16
            rx.subjects.i r0 = z7(r0)
            return r0
    }

    public static <T> rx.subjects.i<T> z7(int r3) {
            rx.subjects.i$a r0 = new rx.subjects.i$a
            r1 = 0
            r2 = 0
            r0.<init>(r3, r1, r2)
            rx.subjects.i r3 = new rx.subjects.i
            r3.<init>(r0)
            return r3
    }

    public void onCompleted() {
            r1 = this;
            rx.subjects.i$a<T> r0 = r1.b
            r0.onCompleted()
            return
    }

    public void onError(java.lang.Throwable r2) {
            r1 = this;
            rx.subjects.i$a<T> r0 = r1.b
            r0.onError(r2)
            return
    }

    public void onNext(T r2) {
            r1 = this;
            rx.subjects.i$a<T> r0 = r1.b
            r0.onNext(r2)
            return
    }

    @Override // rx.subjects.f
    public boolean w7() {
            r1 = this;
            rx.subjects.i$a<T> r0 = r1.b
            java.util.concurrent.atomic.AtomicReference<rx.l<? super T>> r0 = r0.a
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }
}
