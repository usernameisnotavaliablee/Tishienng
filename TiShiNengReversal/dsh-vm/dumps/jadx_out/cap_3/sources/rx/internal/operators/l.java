package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class l implements rx.b.j0 {
    final rx.b[] a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a extends java.util.concurrent.atomic.AtomicInteger implements rx.d {
        private static final long serialVersionUID = -7965400327305809232L;
        final rx.d a;
        final rx.b[] b;
        int c;
        final rx.internal.subscriptions.SequentialSubscription d;

        public a(rx.d r1, rx.b[] r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                rx.internal.subscriptions.SequentialSubscription r1 = new rx.internal.subscriptions.SequentialSubscription
                r1.<init>()
                r0.d = r1
                return
        }

        public void a(rx.m r2) {
                r1 = this;
                rx.internal.subscriptions.SequentialSubscription r0 = r1.d
                r0.replace(r2)
                return
        }

        void b() {
                r3 = this;
                rx.internal.subscriptions.SequentialSubscription r0 = r3.d
                boolean r0 = r0.isUnsubscribed()
                if (r0 == 0) goto L9
                goto L35
            L9:
                int r0 = r3.getAndIncrement()
                if (r0 == 0) goto L10
                goto L35
            L10:
                rx.b[] r0 = r3.b
            L12:
                rx.internal.subscriptions.SequentialSubscription r1 = r3.d
                boolean r1 = r1.isUnsubscribed()
                if (r1 == 0) goto L1b
                goto L35
            L1b:
                int r1 = r3.c
                int r2 = r1 + 1
                r3.c = r2
                int r2 = r0.length
                if (r1 != r2) goto L2a
                rx.d r0 = r3.a
                r0.onCompleted()
                return
            L2a:
                r1 = r0[r1]
                r1.G0(r3)
                int r1 = r3.decrementAndGet()
                if (r1 != 0) goto L12
            L35:
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

    public l(rx.b[] r1) {
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
            rx.internal.operators.l$a r0 = new rx.internal.operators.l$a
            rx.b[] r1 = r2.a
            r0.<init>(r3, r1)
            rx.internal.subscriptions.SequentialSubscription r1 = r0.d
            r3.a(r1)
            r0.b()
            return
    }
}
