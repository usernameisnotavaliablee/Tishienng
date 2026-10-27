package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class c5<T> implements rx.i.t<T> {
    final rx.i.t<T> a;
    final long b;
    final java.util.concurrent.TimeUnit c;
    final rx.h d;
    final rx.i.t<? extends T> e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a<T> extends rx.k<T> implements rx.functions.a {
        final rx.k<? super T> b;
        final java.util.concurrent.atomic.AtomicBoolean c;
        final rx.i.t<? extends T> d;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: rx.internal.operators.c5$a$a, reason: collision with other inner class name */
        static final class C0007a<T> extends rx.k<T> {
            final rx.k<? super T> b;

            C0007a(rx.k<? super T> r1) {
                    r0 = this;
                    r0.<init>()
                    r0.b = r1
                    return
            }

            public void d(T r2) {
                    r1 = this;
                    rx.k<? super T> r0 = r1.b
                    r0.d(r2)
                    return
            }

            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    rx.k<? super T> r0 = r1.b
                    r0.onError(r2)
                    return
            }
        }

        a(rx.k<? super T> r1, rx.i.t<? extends T> r2) {
                r0 = this;
                r0.<init>()
                r0.b = r1
                r0.d = r2
                java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
                r1.<init>()
                r0.c = r1
                return
        }

        public void call() {
                r3 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r3.c
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L32
                rx.i$t<? extends T> r0 = r3.d     // Catch: java.lang.Throwable -> L19
                if (r0 != 0) goto L1b
                rx.k<? super T> r0 = r3.b     // Catch: java.lang.Throwable -> L19
                java.util.concurrent.TimeoutException r1 = new java.util.concurrent.TimeoutException     // Catch: java.lang.Throwable -> L19
                r1.<init>()     // Catch: java.lang.Throwable -> L19
                r0.onError(r1)     // Catch: java.lang.Throwable -> L19
                goto L2a
            L19:
                r0 = move-exception
                goto L2e
            L1b:
                rx.internal.operators.c5$a$a r1 = new rx.internal.operators.c5$a$a     // Catch: java.lang.Throwable -> L19
                rx.k<? super T> r2 = r3.b     // Catch: java.lang.Throwable -> L19
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L19
                rx.k<? super T> r2 = r3.b     // Catch: java.lang.Throwable -> L19
                r2.b(r1)     // Catch: java.lang.Throwable -> L19
                r0.call(r1)     // Catch: java.lang.Throwable -> L19
            L2a:
                r3.unsubscribe()
                return
            L2e:
                r3.unsubscribe()
                throw r0
            L32:
                return
        }

        public void d(T r4) {
                r3 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r3.c
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L18
                rx.k<? super T> r0 = r3.b     // Catch: java.lang.Throwable -> L13
                r0.d(r4)     // Catch: java.lang.Throwable -> L13
                r3.unsubscribe()
                return
            L13:
                r4 = move-exception
                r3.unsubscribe()
                throw r4
            L18:
                return
        }

        public void onError(java.lang.Throwable r4) {
                r3 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r3.c
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L18
                rx.k<? super T> r0 = r3.b     // Catch: java.lang.Throwable -> L13
                r0.onError(r4)     // Catch: java.lang.Throwable -> L13
                r3.unsubscribe()
                return
            L13:
                r4 = move-exception
                r3.unsubscribe()
                throw r4
            L18:
                rx.plugins.c.I(r4)
                return
        }
    }

    public c5(rx.i.t<T> r1, long r2, java.util.concurrent.TimeUnit r4, rx.h r5, rx.i.t<? extends T> r6) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r4
            r0.d = r5
            r0.e = r6
            return
    }

    public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
            r0 = this;
            rx.k r1 = (rx.k) r1
            r0.call(r1)
            return
    }

    public void call(rx.k<? super T> r5) {
            r4 = this;
            rx.internal.operators.c5$a r0 = new rx.internal.operators.c5$a
            rx.i$t<? extends T> r1 = r4.e
            r0.<init>(r5, r1)
            rx.h r1 = r4.d
            rx.h$a r1 = r1.a()
            r0.b(r1)
            r5.b(r0)
            long r2 = r4.b
            java.util.concurrent.TimeUnit r5 = r4.c
            r1.e(r0, r2, r5)
            rx.i$t<T> r5 = r4.a
            r5.call(r0)
            return
    }
}
