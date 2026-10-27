package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class j implements rx.b.j0 {
    final rx.functions.b<rx.c> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a extends java.util.concurrent.atomic.AtomicBoolean implements rx.c, rx.m {
        private static final long serialVersionUID = 5539301318568668881L;
        final rx.d a;
        final rx.internal.subscriptions.SequentialSubscription b;

        public a(rx.d r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                rx.internal.subscriptions.SequentialSubscription r1 = new rx.internal.subscriptions.SequentialSubscription
                r1.<init>()
                r0.b = r1
                return
        }

        public void a(rx.functions.n r2) {
                r1 = this;
                rx.internal.subscriptions.CancellableSubscription r0 = new rx.internal.subscriptions.CancellableSubscription
                r0.<init>(r2)
                r1.b(r0)
                return
        }

        public void b(rx.m r2) {
                r1 = this;
                rx.internal.subscriptions.SequentialSubscription r0 = r1.b
                r0.update(r2)
                return
        }

        public boolean isUnsubscribed() {
                r1 = this;
                boolean r0 = r1.get()
                return r0
        }

        public void onCompleted() {
                r2 = this;
                r0 = 0
                r1 = 1
                boolean r0 = r2.compareAndSet(r0, r1)
                if (r0 == 0) goto L1a
                rx.d r0 = r2.a     // Catch: java.lang.Throwable -> L13
                r0.onCompleted()     // Catch: java.lang.Throwable -> L13
                rx.internal.subscriptions.SequentialSubscription r0 = r2.b
                r0.unsubscribe()
                return
            L13:
                r0 = move-exception
                rx.internal.subscriptions.SequentialSubscription r1 = r2.b
                r1.unsubscribe()
                throw r0
            L1a:
                return
        }

        public void onError(java.lang.Throwable r3) {
                r2 = this;
                r0 = 0
                r1 = 1
                boolean r0 = r2.compareAndSet(r0, r1)
                if (r0 == 0) goto L1a
                rx.d r0 = r2.a     // Catch: java.lang.Throwable -> L13
                r0.onError(r3)     // Catch: java.lang.Throwable -> L13
                rx.internal.subscriptions.SequentialSubscription r3 = r2.b
                r3.unsubscribe()
                return
            L13:
                r3 = move-exception
                rx.internal.subscriptions.SequentialSubscription r0 = r2.b
                r0.unsubscribe()
                throw r3
            L1a:
                rx.plugins.c.I(r3)
                return
        }

        public void unsubscribe() {
                r2 = this;
                r0 = 0
                r1 = 1
                boolean r0 = r2.compareAndSet(r0, r1)
                if (r0 == 0) goto Ld
                rx.internal.subscriptions.SequentialSubscription r0 = r2.b
                r0.unsubscribe()
            Ld:
                return
        }
    }

    public j(rx.functions.b<rx.c> r1) {
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

    public void call(rx.d r2) {
            r1 = this;
            rx.internal.operators.j$a r0 = new rx.internal.operators.j$a
            r0.<init>(r2)
            r2.a(r0)
            rx.functions.b<rx.c> r2 = r1.a     // Catch: java.lang.Throwable -> Le
            r2.call(r0)     // Catch: java.lang.Throwable -> Le
            return
        Le:
            r2 = move-exception
            rx.exceptions.a.e(r2)
            r0.onError(r2)
            return
    }
}
