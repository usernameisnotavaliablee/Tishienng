package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class s implements rx.b.j0 {
    final rx.b a;
    final long b;
    final java.util.concurrent.TimeUnit c;
    final rx.h d;
    final rx.b e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements rx.functions.a {
        final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean a;
        final /* synthetic */ rx.subscriptions.b b;
        final /* synthetic */ rx.d c;
        final /* synthetic */ rx.internal.operators.s d;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: rx.internal.operators.s$a$a, reason: collision with other inner class name */
        class C0024a implements rx.d {
            final /* synthetic */ rx.internal.operators.s.a a;

            C0024a(rx.internal.operators.s.a r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public void a(rx.m r2) {
                    r1 = this;
                    rx.internal.operators.s$a r0 = r1.a
                    rx.subscriptions.b r0 = r0.b
                    r0.a(r2)
                    return
            }

            public void onCompleted() {
                    r1 = this;
                    rx.internal.operators.s$a r0 = r1.a
                    rx.subscriptions.b r0 = r0.b
                    r0.unsubscribe()
                    rx.internal.operators.s$a r0 = r1.a
                    rx.d r0 = r0.c
                    r0.onCompleted()
                    return
            }

            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    rx.internal.operators.s$a r0 = r1.a
                    rx.subscriptions.b r0 = r0.b
                    r0.unsubscribe()
                    rx.internal.operators.s$a r0 = r1.a
                    rx.d r0 = r0.c
                    r0.onError(r2)
                    return
            }
        }

        a(rx.internal.operators.s r1, java.util.concurrent.atomic.AtomicBoolean r2, rx.subscriptions.b r3, rx.d r4) {
                r0 = this;
                r0.d = r1
                r0.a = r2
                r0.b = r3
                r0.c = r4
                r0.<init>()
                return
        }

        public void call() {
                r3 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r3.a
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L28
                rx.subscriptions.b r0 = r3.b
                r0.d()
                rx.internal.operators.s r0 = r3.d
                rx.b r0 = r0.e
                if (r0 != 0) goto L20
                rx.d r0 = r3.c
                java.util.concurrent.TimeoutException r1 = new java.util.concurrent.TimeoutException
                r1.<init>()
                r0.onError(r1)
                return
            L20:
                rx.internal.operators.s$a$a r1 = new rx.internal.operators.s$a$a
                r1.<init>(r3)
                r0.G0(r1)
            L28:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements rx.d {
        final /* synthetic */ rx.subscriptions.b a;
        final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean b;
        final /* synthetic */ rx.d c;
        final /* synthetic */ rx.internal.operators.s d;

        b(rx.internal.operators.s r1, rx.subscriptions.b r2, java.util.concurrent.atomic.AtomicBoolean r3, rx.d r4) {
                r0 = this;
                r0.d = r1
                r0.a = r2
                r0.b = r3
                r0.c = r4
                r0.<init>()
                return
        }

        public void a(rx.m r2) {
                r1 = this;
                rx.subscriptions.b r0 = r1.a
                r0.a(r2)
                return
        }

        public void onCompleted() {
                r3 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r3.b
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L14
                rx.subscriptions.b r0 = r3.a
                r0.unsubscribe()
                rx.d r0 = r3.c
                r0.onCompleted()
            L14:
                return
        }

        public void onError(java.lang.Throwable r4) {
                r3 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r3.b
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L15
                rx.subscriptions.b r0 = r3.a
                r0.unsubscribe()
                rx.d r0 = r3.c
                r0.onError(r4)
                return
            L15:
                rx.plugins.c.I(r4)
                return
        }
    }

    public s(rx.b r1, long r2, java.util.concurrent.TimeUnit r4, rx.h r5, rx.b r6) {
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
            rx.d r1 = (rx.d) r1
            r0.call(r1)
            return
    }

    public void call(rx.d r8) {
            r7 = this;
            rx.subscriptions.b r0 = new rx.subscriptions.b
            r0.<init>()
            r8.a(r0)
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
            r1.<init>()
            rx.h r2 = r7.d
            rx.h$a r2 = r2.a()
            r0.a(r2)
            rx.internal.operators.s$a r3 = new rx.internal.operators.s$a
            r3.<init>(r7, r1, r0, r8)
            long r4 = r7.b
            java.util.concurrent.TimeUnit r6 = r7.c
            r2.e(r3, r4, r6)
            rx.b r2 = r7.a
            rx.internal.operators.s$b r3 = new rx.internal.operators.s$b
            r3.<init>(r7, r0, r1, r8)
            r2.G0(r3)
            return
    }
}
