package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class m implements rx.b.j0 {
    final java.lang.Iterable<? extends rx.b> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a extends java.util.concurrent.atomic.AtomicInteger implements rx.d {
        private static final long serialVersionUID = -7965400327305809232L;
        final rx.d a;
        final java.util.Iterator<? extends rx.b> b;
        final rx.internal.subscriptions.SequentialSubscription c;

        public a(rx.d r1, java.util.Iterator<? extends rx.b> r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                rx.internal.subscriptions.SequentialSubscription r1 = new rx.internal.subscriptions.SequentialSubscription
                r1.<init>()
                r0.c = r1
                return
        }

        public void a(rx.m r2) {
                r1 = this;
                rx.internal.subscriptions.SequentialSubscription r0 = r1.c
                r0.replace(r2)
                return
        }

        void b() {
                r3 = this;
                rx.internal.subscriptions.SequentialSubscription r0 = r3.c
                boolean r0 = r0.isUnsubscribed()
                if (r0 == 0) goto L9
                goto L45
            L9:
                int r0 = r3.getAndIncrement()
                if (r0 == 0) goto L10
                goto L45
            L10:
                java.util.Iterator<? extends rx.b> r0 = r3.b
            L12:
                rx.internal.subscriptions.SequentialSubscription r1 = r3.c
                boolean r1 = r1.isUnsubscribed()
                if (r1 == 0) goto L1b
                goto L45
            L1b:
                boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L4d
                if (r1 != 0) goto L27
                rx.d r0 = r3.a
                r0.onCompleted()
                return
            L27:
                java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L46
                rx.b r1 = (rx.b) r1     // Catch: java.lang.Throwable -> L46
                if (r1 != 0) goto L3c
                rx.d r0 = r3.a
                java.lang.NullPointerException r1 = new java.lang.NullPointerException
                java.lang.String r2 = "The completable returned is null"
                r1.<init>(r2)
                r0.onError(r1)
                return
            L3c:
                r1.G0(r3)
                int r1 = r3.decrementAndGet()
                if (r1 != 0) goto L12
            L45:
                return
            L46:
                r0 = move-exception
                rx.d r1 = r3.a
                r1.onError(r0)
                return
            L4d:
                r0 = move-exception
                rx.d r1 = r3.a
                r1.onError(r0)
                return
        }

        public void onCompleted() {
                r0 = this;
                r0.b()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.d r0 = r1.a
                r0.onError(r2)
                return
        }
    }

    public m(java.lang.Iterable<? extends rx.b> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
            r0 = this;
            rx.d r1 = (rx.d) r1
            r0.call(r1)
            return
    }

    public void call(rx.d r3) {
            r2 = this;
            java.lang.Iterable<? extends rx.b> r0 = r2.a     // Catch: java.lang.Throwable -> L28
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L28
            if (r0 != 0) goto L1a
            rx.m r0 = rx.subscriptions.f.e()
            r3.a(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "The iterator returned is null"
            r0.<init>(r1)
            r3.onError(r0)
            return
        L1a:
            rx.internal.operators.m$a r1 = new rx.internal.operators.m$a
            r1.<init>(r3, r0)
            rx.internal.subscriptions.SequentialSubscription r0 = r1.c
            r3.a(r0)
            r1.b()
            return
        L28:
            r0 = move-exception
            rx.m r1 = rx.subscriptions.f.e()
            r3.a(r1)
            r3.onError(r0)
            return
    }
}
