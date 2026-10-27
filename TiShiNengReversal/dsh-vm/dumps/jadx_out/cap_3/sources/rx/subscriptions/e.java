package rx.subscriptions;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class e implements rx.m {
    final rx.internal.subscriptions.SequentialSubscription a;

    public e() {
            r1 = this;
            r1.<init>()
            rx.internal.subscriptions.SequentialSubscription r0 = new rx.internal.subscriptions.SequentialSubscription
            r0.<init>()
            r1.a = r0
            return
    }

    public rx.m a() {
            r1 = this;
            rx.internal.subscriptions.SequentialSubscription r0 = r1.a
            rx.m r0 = r0.current()
            return r0
    }

    public void b(rx.m r2) {
            r1 = this;
            if (r2 == 0) goto L8
            rx.internal.subscriptions.SequentialSubscription r0 = r1.a
            r0.update(r2)
            return
        L8:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Subscription can not be null"
            r2.<init>(r0)
            throw r2
    }

    public boolean isUnsubscribed() {
            r1 = this;
            rx.internal.subscriptions.SequentialSubscription r0 = r1.a
            boolean r0 = r0.isUnsubscribed()
            return r0
    }

    public void unsubscribe() {
            r1 = this;
            rx.internal.subscriptions.SequentialSubscription r0 = r1.a
            r0.unsubscribe()
            return
    }
}
