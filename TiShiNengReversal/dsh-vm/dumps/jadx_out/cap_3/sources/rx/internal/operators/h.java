package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class h<T> extends rx.e<T> {
    private final rx.internal.operators.h.a<T> b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a<T> extends rx.internal.util.f implements rx.f<T> {
        static final rx.internal.operators.h.c<?>[] k = null;
        final rx.e<? extends T> f;
        final rx.subscriptions.e g;
        volatile rx.internal.operators.h.c<?>[] h;
        volatile boolean i;
        boolean j;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: rx.internal.operators.h$a$a, reason: collision with other inner class name */
        class C0010a extends rx.l<T> {
            final /* synthetic */ rx.internal.operators.h.a a;

            C0010a(rx.internal.operators.h.a r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public void onCompleted() {
                    r1 = this;
                    rx.internal.operators.h$a r0 = r1.a
                    r0.onCompleted()
                    return
            }

            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    rx.internal.operators.h$a r0 = r1.a
                    r0.onError(r2)
                    return
            }

            public void onNext(T r2) {
                    r1 = this;
                    rx.internal.operators.h$a r0 = r1.a
                    r0.onNext(r2)
                    return
            }
        }

        static {
                r0 = 0
                rx.internal.operators.h$c[] r0 = new rx.internal.operators.h.c[r0]
                rx.internal.operators.h.a.k = r0
                return
        }

        public a(rx.e<? extends T> r1, int r2) {
                r0 = this;
                r0.<init>(r2)
                r0.f = r1
                rx.internal.operators.h$c<?>[] r1 = rx.internal.operators.h.a.k
                r0.h = r1
                rx.subscriptions.e r1 = new rx.subscriptions.e
                r1.<init>()
                r0.g = r1
                return
        }

        public void B(rx.internal.operators.h.c<T> r6) {
                r5 = this;
                rx.subscriptions.e r0 = r5.g
                monitor-enter(r0)
                rx.internal.operators.h$c<?>[] r1 = r5.h     // Catch: java.lang.Throwable -> L14
                int r2 = r1.length     // Catch: java.lang.Throwable -> L14
                int r3 = r2 + 1
                rx.internal.operators.h$c[] r3 = new rx.internal.operators.h.c[r3]     // Catch: java.lang.Throwable -> L14
                r4 = 0
                java.lang.System.arraycopy(r1, r4, r3, r4, r2)     // Catch: java.lang.Throwable -> L14
                r3[r2] = r6     // Catch: java.lang.Throwable -> L14
                r5.h = r3     // Catch: java.lang.Throwable -> L14
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
                return
            L14:
                r6 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
                throw r6
        }

        public void G() {
                r2 = this;
                rx.internal.operators.h$a$a r0 = new rx.internal.operators.h$a$a
                r0.<init>(r2)
                rx.subscriptions.e r1 = r2.g
                r1.b(r0)
                rx.e<? extends T> r1 = r2.f
                r1.J6(r0)
                r0 = 1
                r2.i = r0
                return
        }

        void H() {
                r4 = this;
                rx.internal.operators.h$c<?>[] r0 = r4.h
                int r1 = r0.length
                r2 = 0
            L4:
                if (r2 >= r1) goto Le
                r3 = r0[r2]
                r3.b()
                int r2 = r2 + 1
                goto L4
            Le:
                return
        }

        public void N(rx.internal.operators.h.c<T> r7) {
                r6 = this;
                rx.subscriptions.e r0 = r6.g
                monitor-enter(r0)
                rx.internal.operators.h$c<?>[] r1 = r6.h     // Catch: java.lang.Throwable -> L16
                int r2 = r1.length     // Catch: java.lang.Throwable -> L16
                r3 = 0
                r4 = 0
            L8:
                if (r4 >= r2) goto L18
                r5 = r1[r4]     // Catch: java.lang.Throwable -> L16
                boolean r5 = r5.equals(r7)     // Catch: java.lang.Throwable -> L16
                if (r5 == 0) goto L13
                goto L19
            L13:
                int r4 = r4 + 1
                goto L8
            L16:
                r7 = move-exception
                goto L38
            L18:
                r4 = -1
            L19:
                if (r4 >= 0) goto L1d
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
                return
            L1d:
                r7 = 1
                if (r2 != r7) goto L26
                rx.internal.operators.h$c<?>[] r7 = rx.internal.operators.h.a.k     // Catch: java.lang.Throwable -> L16
                r6.h = r7     // Catch: java.lang.Throwable -> L16
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
                return
            L26:
                int r5 = r2 + (-1)
                rx.internal.operators.h$c[] r5 = new rx.internal.operators.h.c[r5]     // Catch: java.lang.Throwable -> L16
                java.lang.System.arraycopy(r1, r3, r5, r3, r4)     // Catch: java.lang.Throwable -> L16
                int r3 = r4 + 1
                int r2 = r2 - r4
                int r2 = r2 - r7
                java.lang.System.arraycopy(r1, r3, r5, r4, r2)     // Catch: java.lang.Throwable -> L16
                r6.h = r5     // Catch: java.lang.Throwable -> L16
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
                return
            L38:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
                throw r7
        }

        public void onCompleted() {
                r1 = this;
                boolean r0 = r1.j
                if (r0 != 0) goto L16
                r0 = 1
                r1.j = r0
                java.lang.Object r0 = rx.internal.operators.v.b()
                r1.d(r0)
                rx.subscriptions.e r0 = r1.g
                r0.unsubscribe()
                r1.H()
            L16:
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.j
                if (r0 != 0) goto L16
                r0 = 1
                r1.j = r0
                java.lang.Object r2 = rx.internal.operators.v.c(r2)
                r1.d(r2)
                rx.subscriptions.e r2 = r1.g
                r2.unsubscribe()
                r1.H()
            L16:
                return
        }

        public void onNext(T r2) {
                r1 = this;
                boolean r0 = r1.j
                if (r0 != 0) goto Le
                java.lang.Object r2 = rx.internal.operators.v.j(r2)
                r1.d(r2)
                r1.H()
            Le:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b<T> extends java.util.concurrent.atomic.AtomicBoolean implements rx.e.a<T> {
        private static final long serialVersionUID = -2817751667698696782L;
        final rx.internal.operators.h.a<T> a;

        public b(rx.internal.operators.h.a<T> r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
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
                rx.internal.operators.h$c r0 = new rx.internal.operators.h$c
                rx.internal.operators.h$a<T> r1 = r2.a
                r0.<init>(r3, r1)
                rx.internal.operators.h$a<T> r1 = r2.a
                r1.B(r0)
                r3.add(r0)
                r3.setProducer(r0)
                boolean r3 = r2.get()
                if (r3 != 0) goto L25
                r3 = 0
                r0 = 1
                boolean r3 = r2.compareAndSet(r3, r0)
                if (r3 == 0) goto L25
                rx.internal.operators.h$a<T> r3 = r2.a
                r3.G()
            L25:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class c<T> extends java.util.concurrent.atomic.AtomicLong implements rx.g, rx.m {
        private static final long serialVersionUID = -2557562030197141021L;
        final rx.l<? super T> a;
        final rx.internal.operators.h.a<T> b;
        java.lang.Object[] c;
        int d;
        int e;
        boolean f;
        boolean g;

        public c(rx.l<? super T> r1, rx.internal.operators.h.a<T> r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }

        public long a(long r1) {
                r0 = this;
                long r1 = -r1
                long r1 = r0.addAndGet(r1)
                return r1
        }

        public void b() {
                r15 = this;
                monitor-enter(r15)
                boolean r0 = r15.f     // Catch: java.lang.Throwable -> La
                r1 = 1
                if (r0 == 0) goto Ld
                r15.g = r1     // Catch: java.lang.Throwable -> La
                monitor-exit(r15)     // Catch: java.lang.Throwable -> La
                return
            La:
                r0 = move-exception
                goto Lea
            Ld:
                r15.f = r1     // Catch: java.lang.Throwable -> La
                monitor-exit(r15)     // Catch: java.lang.Throwable -> La
                r0 = 0
                rx.l<? super T> r2 = r15.a     // Catch: java.lang.Throwable -> L33
            L13:
                long r3 = r15.get()     // Catch: java.lang.Throwable -> L33
                r5 = 0
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 >= 0) goto L1e
                return
            L1e:
                rx.internal.operators.h$a<T> r8 = r15.b     // Catch: java.lang.Throwable -> L33
                int r8 = r8.j()     // Catch: java.lang.Throwable -> L33
                if (r8 == 0) goto Lc7
                java.lang.Object[] r9 = r15.c     // Catch: java.lang.Throwable -> L33
                if (r9 != 0) goto L37
                rx.internal.operators.h$a<T> r9 = r15.b     // Catch: java.lang.Throwable -> L33
                java.lang.Object[] r9 = r9.f()     // Catch: java.lang.Throwable -> L33
                r15.c = r9     // Catch: java.lang.Throwable -> L33
                goto L37
            L33:
                r1 = move-exception
                r4 = 0
                goto Ldf
            L37:
                int r10 = r9.length     // Catch: java.lang.Throwable -> L33
                int r10 = r10 - r1
                int r11 = r15.e     // Catch: java.lang.Throwable -> L33
                int r12 = r15.d     // Catch: java.lang.Throwable -> L33
                if (r7 != 0) goto L64
                r3 = r9[r12]     // Catch: java.lang.Throwable -> L33
                boolean r4 = rx.internal.operators.v.f(r3)     // Catch: java.lang.Throwable -> L33
                if (r4 == 0) goto L53
                r2.onCompleted()     // Catch: java.lang.Throwable -> L33
                r15.unsubscribe()     // Catch: java.lang.Throwable -> L4e
                return
            L4e:
                r2 = move-exception
                r1 = r2
                r4 = 1
                goto Ldf
            L53:
                boolean r4 = rx.internal.operators.v.g(r3)     // Catch: java.lang.Throwable -> L33
                if (r4 == 0) goto Lc7
                java.lang.Throwable r3 = rx.internal.operators.v.d(r3)     // Catch: java.lang.Throwable -> L33
                r2.onError(r3)     // Catch: java.lang.Throwable -> L33
                r15.unsubscribe()     // Catch: java.lang.Throwable -> L4e
                return
            L64:
                if (r7 <= 0) goto Lc7
                r7 = 0
            L67:
                if (r11 >= r8) goto Lb6
                int r13 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r13 <= 0) goto Lb6
                boolean r13 = r2.isUnsubscribed()     // Catch: java.lang.Throwable -> L33
                if (r13 == 0) goto L74
                return
            L74:
                if (r12 != r10) goto L7b
                r9 = r9[r10]     // Catch: java.lang.Throwable -> L33
                java.lang.Object[] r9 = (java.lang.Object[]) r9     // Catch: java.lang.Throwable -> L33
                r12 = 0
            L7b:
                r13 = r9[r12]     // Catch: java.lang.Throwable -> L33
                boolean r14 = rx.internal.operators.v.a(r2, r13)     // Catch: java.lang.Throwable -> L94
                if (r14 == 0) goto L8a
                r15.unsubscribe()     // Catch: java.lang.Throwable -> L87
                return
            L87:
                r3 = move-exception
                r4 = 1
                goto L96
            L8a:
                int r12 = r12 + 1
                int r11 = r11 + 1
                r13 = 1
                long r3 = r3 - r13
                int r7 = r7 + 1
                goto L67
            L94:
                r3 = move-exception
                r4 = 0
            L96:
                rx.exceptions.a.e(r3)     // Catch: java.lang.Throwable -> Lb4
                r15.unsubscribe()     // Catch: java.lang.Throwable -> L4e
                boolean r4 = rx.internal.operators.v.g(r13)     // Catch: java.lang.Throwable -> L4e
                if (r4 != 0) goto Lb3
                boolean r4 = rx.internal.operators.v.f(r13)     // Catch: java.lang.Throwable -> L4e
                if (r4 != 0) goto Lb3
                java.lang.Object r4 = rx.internal.operators.v.e(r13)     // Catch: java.lang.Throwable -> L4e
                java.lang.Throwable r3 = rx.exceptions.OnErrorThrowable.addValueAsLastCause(r3, r4)     // Catch: java.lang.Throwable -> L4e
                r2.onError(r3)     // Catch: java.lang.Throwable -> L4e
            Lb3:
                return
            Lb4:
                r1 = move-exception
                goto Ldf
            Lb6:
                boolean r3 = r2.isUnsubscribed()     // Catch: java.lang.Throwable -> L33
                if (r3 == 0) goto Lbd
                return
            Lbd:
                r15.e = r11     // Catch: java.lang.Throwable -> L33
                r15.d = r12     // Catch: java.lang.Throwable -> L33
                r15.c = r9     // Catch: java.lang.Throwable -> L33
                long r3 = (long) r7     // Catch: java.lang.Throwable -> L33
                r15.a(r3)     // Catch: java.lang.Throwable -> L33
            Lc7:
                monitor-enter(r15)     // Catch: java.lang.Throwable -> L33
                boolean r3 = r15.g     // Catch: java.lang.Throwable -> Ld2
                if (r3 != 0) goto Ld5
                r15.f = r0     // Catch: java.lang.Throwable -> Ld2
                monitor-exit(r15)     // Catch: java.lang.Throwable -> Ld0
                return
            Ld0:
                r2 = move-exception
                goto Lda
            Ld2:
                r2 = move-exception
                r1 = 0
                goto Lda
            Ld5:
                r15.g = r0     // Catch: java.lang.Throwable -> Ld2
                monitor-exit(r15)     // Catch: java.lang.Throwable -> Ld2
                goto L13
            Lda:
                monitor-exit(r15)     // Catch: java.lang.Throwable -> Ld0
                throw r2     // Catch: java.lang.Throwable -> Ldc
            Ldc:
                r2 = move-exception
                r4 = r1
                r1 = r2
            Ldf:
                if (r4 != 0) goto Le9
                monitor-enter(r15)
                r15.f = r0     // Catch: java.lang.Throwable -> Le6
                monitor-exit(r15)     // Catch: java.lang.Throwable -> Le6
                goto Le9
            Le6:
                r0 = move-exception
                monitor-exit(r15)     // Catch: java.lang.Throwable -> Le6
                throw r0
            Le9:
                throw r1
            Lea:
                monitor-exit(r15)     // Catch: java.lang.Throwable -> La
                throw r0
        }

        public boolean isUnsubscribed() {
                r5 = this;
                long r0 = r5.get()
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 >= 0) goto Lc
                r0 = 1
                return r0
            Lc:
                r0 = 0
                return r0
        }

        public void request(long r8) {
                r7 = this;
            L0:
                long r0 = r7.get()
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 >= 0) goto Lb
                return
            Lb:
                long r4 = r0 + r8
                int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r6 >= 0) goto L16
                r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            L16:
                boolean r0 = r7.compareAndSet(r0, r4)
                if (r0 == 0) goto L0
                r7.b()
                return
        }

        public void unsubscribe() {
                r5 = this;
                long r0 = r5.get()
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 < 0) goto L19
                r0 = -1
                long r0 = r5.getAndSet(r0)
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 < 0) goto L19
                rx.internal.operators.h$a<T> r0 = r5.b
                r0.N(r5)
            L19:
                return
        }
    }

    private h(rx.e.a<T> r1, rx.internal.operators.h.a<T> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.b = r2
            return
    }

    public static <T> rx.internal.operators.h<T> w7(rx.e<? extends T> r1) {
            r0 = 16
            rx.internal.operators.h r1 = x7(r1, r0)
            return r1
    }

    public static <T> rx.internal.operators.h<T> x7(rx.e<? extends T> r1, int r2) {
            r0 = 1
            if (r2 < r0) goto L13
            rx.internal.operators.h$a r0 = new rx.internal.operators.h$a
            r0.<init>(r1, r2)
            rx.internal.operators.h$b r1 = new rx.internal.operators.h$b
            r1.<init>(r0)
            rx.internal.operators.h r2 = new rx.internal.operators.h
            r2.<init>(r1, r0)
            return r2
        L13:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "capacityHint > 0 required"
            r1.<init>(r2)
            throw r1
    }

    boolean y7() {
            r1 = this;
            rx.internal.operators.h$a<T> r0 = r1.b
            rx.internal.operators.h$c<?>[] r0 = r0.h
            int r0 = r0.length
            if (r0 == 0) goto L9
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }

    boolean z7() {
            r1 = this;
            rx.internal.operators.h$a<T> r0 = r1.b
            boolean r0 = r0.i
            return r0
    }
}
