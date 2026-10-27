package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class w1<T> implements rx.e.b<T, T> {
    final long a;
    final java.util.concurrent.TimeUnit b;
    final rx.h c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends rx.l<T> {
        final rx.internal.operators.w1.b<T> a;
        final rx.l<?> b;
        final /* synthetic */ rx.subscriptions.e c;
        final /* synthetic */ rx.h.a d;
        final /* synthetic */ rx.observers.g e;
        final /* synthetic */ rx.internal.operators.w1 f;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: rx.internal.operators.w1$a$a, reason: collision with other inner class name */
        class C0029a implements rx.functions.a {
            final /* synthetic */ int a;
            final /* synthetic */ rx.internal.operators.w1.a b;

            C0029a(rx.internal.operators.w1.a r1, int r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            public void call() {
                    r4 = this;
                    rx.internal.operators.w1$a r0 = r4.b
                    rx.internal.operators.w1$b<T> r1 = r0.a
                    int r2 = r4.a
                    rx.observers.g r3 = r0.e
                    rx.l<?> r0 = r0.b
                    r1.b(r2, r3, r0)
                    return
            }
        }

        a(rx.internal.operators.w1 r1, rx.l r2, rx.subscriptions.e r3, rx.h.a r4, rx.observers.g r5) {
                r0 = this;
                r0.f = r1
                r0.c = r3
                r0.d = r4
                r0.e = r5
                r0.<init>(r2)
                rx.internal.operators.w1$b r1 = new rx.internal.operators.w1$b
                r1.<init>()
                r0.a = r1
                r0.b = r0
                return
        }

        public void onCompleted() {
                r2 = this;
                rx.internal.operators.w1$b<T> r0 = r2.a
                rx.observers.g r1 = r2.e
                r0.c(r1, r2)
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.observers.g r0 = r1.e
                r0.onError(r2)
                r1.unsubscribe()
                rx.internal.operators.w1$b<T> r2 = r1.a
                r2.a()
                return
        }

        public void onNext(T r6) {
                r5 = this;
                rx.internal.operators.w1$b<T> r0 = r5.a
                int r6 = r0.d(r6)
                rx.subscriptions.e r0 = r5.c
                rx.h$a r1 = r5.d
                rx.internal.operators.w1$a$a r2 = new rx.internal.operators.w1$a$a
                r2.<init>(r5, r6)
                rx.internal.operators.w1 r6 = r5.f
                long r3 = r6.a
                java.util.concurrent.TimeUnit r6 = r6.b
                rx.m r6 = r1.e(r2, r3, r6)
                r0.b(r6)
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
        int a;
        T b;
        boolean c;
        boolean d;
        boolean e;

        b() {
                r0 = this;
                r0.<init>()
                return
        }

        public synchronized void a() {
                r1 = this;
                monitor-enter(r1)
                int r0 = r1.a     // Catch: java.lang.Throwable -> Lf
                int r0 = r0 + 1
                r1.a = r0     // Catch: java.lang.Throwable -> Lf
                r0 = 0
                r1.b = r0     // Catch: java.lang.Throwable -> Lf
                r0 = 0
                r1.c = r0     // Catch: java.lang.Throwable -> Lf
                monitor-exit(r1)
                return
            Lf:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
                throw r0
        }

        public void b(int r3, rx.l<T> r4, rx.l<?> r5) {
                r2 = this;
                monitor-enter(r2)
                boolean r0 = r2.e     // Catch: java.lang.Throwable -> L34
                if (r0 != 0) goto L36
                boolean r0 = r2.c     // Catch: java.lang.Throwable -> L34
                if (r0 == 0) goto L36
                int r0 = r2.a     // Catch: java.lang.Throwable -> L34
                if (r3 == r0) goto Le
                goto L36
            Le:
                T r3 = r2.b     // Catch: java.lang.Throwable -> L34
                r0 = 0
                r2.b = r0     // Catch: java.lang.Throwable -> L34
                r0 = 0
                r2.c = r0     // Catch: java.lang.Throwable -> L34
                r1 = 1
                r2.e = r1     // Catch: java.lang.Throwable -> L34
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L34
                r4.onNext(r3)     // Catch: java.lang.Throwable -> L2f
                monitor-enter(r2)
                boolean r3 = r2.d     // Catch: java.lang.Throwable -> L26
                if (r3 != 0) goto L28
                r2.e = r0     // Catch: java.lang.Throwable -> L26
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L26
                return
            L26:
                r3 = move-exception
                goto L2d
            L28:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L26
                r4.onCompleted()
                return
            L2d:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L26
                throw r3
            L2f:
                r4 = move-exception
                rx.exceptions.a.g(r4, r5, r3)
                return
            L34:
                r3 = move-exception
                goto L38
            L36:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L34
                return
            L38:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L34
                throw r3
        }

        public void c(rx.l<T> r5, rx.l<?> r6) {
                r4 = this;
                monitor-enter(r4)
                boolean r0 = r4.e     // Catch: java.lang.Throwable -> La
                r1 = 1
                if (r0 == 0) goto Lc
                r4.d = r1     // Catch: java.lang.Throwable -> La
                monitor-exit(r4)     // Catch: java.lang.Throwable -> La
                return
            La:
                r5 = move-exception
                goto L28
            Lc:
                T r0 = r4.b     // Catch: java.lang.Throwable -> La
                boolean r2 = r4.c     // Catch: java.lang.Throwable -> La
                r3 = 0
                r4.b = r3     // Catch: java.lang.Throwable -> La
                r3 = 0
                r4.c = r3     // Catch: java.lang.Throwable -> La
                r4.e = r1     // Catch: java.lang.Throwable -> La
                monitor-exit(r4)     // Catch: java.lang.Throwable -> La
                if (r2 == 0) goto L24
                r5.onNext(r0)     // Catch: java.lang.Throwable -> L1f
                goto L24
            L1f:
                r5 = move-exception
                rx.exceptions.a.g(r5, r6, r0)
                return
            L24:
                r5.onCompleted()
                return
            L28:
                monitor-exit(r4)     // Catch: java.lang.Throwable -> La
                throw r5
        }

        public synchronized int d(T r2) {
                r1 = this;
                monitor-enter(r1)
                r1.b = r2     // Catch: java.lang.Throwable -> Ld
                r2 = 1
                r1.c = r2     // Catch: java.lang.Throwable -> Ld
                int r0 = r1.a     // Catch: java.lang.Throwable -> Ld
                int r0 = r0 + r2
                r1.a = r0     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r1)
                return r0
            Ld:
                r2 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
                throw r2
        }
    }

    public w1(long r1, java.util.concurrent.TimeUnit r3, rx.h r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r3
            r0.c = r4
            return
    }

    public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            rx.l r1 = r0.call(r1)
            return r1
    }

    public rx.l<? super T> call(rx.l<? super T> r8) {
            r7 = this;
            rx.h r0 = r7.c
            rx.h$a r5 = r0.a()
            rx.observers.g r6 = new rx.observers.g
            r6.<init>(r8)
            rx.subscriptions.e r4 = new rx.subscriptions.e
            r4.<init>()
            r6.add(r5)
            r6.add(r4)
            rx.internal.operators.w1$a r1 = new rx.internal.operators.w1$a
            r2 = r7
            r3 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
    }
}
