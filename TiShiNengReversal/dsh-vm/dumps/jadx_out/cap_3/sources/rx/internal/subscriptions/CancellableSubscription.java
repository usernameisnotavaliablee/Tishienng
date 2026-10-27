package rx.internal.subscriptions;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class CancellableSubscription extends java.util.concurrent.atomic.AtomicReference<rx.functions.n> implements rx.m {
    private static final long serialVersionUID = 5718521705281392066L;

    public CancellableSubscription(rx.functions.n r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public boolean isUnsubscribed() {
            r1 = this;
            java.lang.Object r0 = r1.get()
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public void unsubscribe() {
            r1 = this;
            java.lang.Object r0 = r1.get()
            if (r0 == 0) goto L1a
            r0 = 0
            java.lang.Object r0 = r1.getAndSet(r0)
            rx.functions.n r0 = (rx.functions.n) r0
            if (r0 == 0) goto L1a
            r0.cancel()     // Catch: java.lang.Exception -> L13
            return
        L13:
            r0 = move-exception
            rx.exceptions.a.e(r0)
            rx.plugins.c.I(r0)
        L1a:
            return
    }
}
