package rx.internal.subscriptions;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class SequentialSubscription extends java.util.concurrent.atomic.AtomicReference<rx.m> implements rx.m {
    private static final long serialVersionUID = 995205034283130269L;

    public SequentialSubscription() {
            r0 = this;
            r0.<init>()
            return
    }

    public SequentialSubscription(rx.m r1) {
            r0 = this;
            r0.<init>()
            r0.lazySet(r1)
            return
    }

    public rx.m current() {
            r2 = this;
            java.lang.Object r0 = super.get()
            rx.m r0 = (rx.m) r0
            rx.internal.subscriptions.Unsubscribed r1 = rx.internal.subscriptions.Unsubscribed.INSTANCE
            if (r0 != r1) goto Le
            rx.m r0 = rx.subscriptions.f.e()
        Le:
            return r0
    }

    public boolean isUnsubscribed() {
            r2 = this;
            java.lang.Object r0 = r2.get()
            rx.internal.subscriptions.Unsubscribed r1 = rx.internal.subscriptions.Unsubscribed.INSTANCE
            if (r0 != r1) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public boolean replace(rx.m r3) {
            r2 = this;
        L0:
            java.lang.Object r0 = r2.get()
            rx.m r0 = (rx.m) r0
            rx.internal.subscriptions.Unsubscribed r1 = rx.internal.subscriptions.Unsubscribed.INSTANCE
            if (r0 != r1) goto L11
            if (r3 == 0) goto Lf
            r3.unsubscribe()
        Lf:
            r3 = 0
            return r3
        L11:
            boolean r0 = r2.compareAndSet(r0, r3)
            if (r0 == 0) goto L0
            r3 = 1
            return r3
    }

    public boolean replaceWeak(rx.m r5) {
            r4 = this;
            java.lang.Object r0 = r4.get()
            rx.m r0 = (rx.m) r0
            rx.internal.subscriptions.Unsubscribed r1 = rx.internal.subscriptions.Unsubscribed.INSTANCE
            r2 = 0
            if (r0 != r1) goto L11
            if (r5 == 0) goto L10
            r5.unsubscribe()
        L10:
            return r2
        L11:
            boolean r0 = r4.compareAndSet(r0, r5)
            r3 = 1
            if (r0 == 0) goto L19
            return r3
        L19:
            java.lang.Object r0 = r4.get()
            rx.m r0 = (rx.m) r0
            if (r0 != r1) goto L27
            if (r5 == 0) goto L26
            r5.unsubscribe()
        L26:
            return r2
        L27:
            return r3
    }

    public void unsubscribe() {
            r2 = this;
            java.lang.Object r0 = r2.get()
            rx.m r0 = (rx.m) r0
            rx.internal.subscriptions.Unsubscribed r1 = rx.internal.subscriptions.Unsubscribed.INSTANCE
            if (r0 == r1) goto L17
            java.lang.Object r0 = r2.getAndSet(r1)
            rx.m r0 = (rx.m) r0
            if (r0 == 0) goto L17
            if (r0 == r1) goto L17
            r0.unsubscribe()
        L17:
            return
    }

    public boolean update(rx.m r3) {
            r2 = this;
        L0:
            java.lang.Object r0 = r2.get()
            rx.m r0 = (rx.m) r0
            rx.internal.subscriptions.Unsubscribed r1 = rx.internal.subscriptions.Unsubscribed.INSTANCE
            if (r0 != r1) goto L11
            if (r3 == 0) goto Lf
            r3.unsubscribe()
        Lf:
            r3 = 0
            return r3
        L11:
            boolean r1 = r2.compareAndSet(r0, r3)
            if (r1 == 0) goto L0
            if (r0 == 0) goto L1c
            r0.unsubscribe()
        L1c:
            r3 = 1
            return r3
    }

    public boolean updateWeak(rx.m r5) {
            r4 = this;
            java.lang.Object r0 = r4.get()
            rx.m r0 = (rx.m) r0
            rx.internal.subscriptions.Unsubscribed r1 = rx.internal.subscriptions.Unsubscribed.INSTANCE
            r2 = 0
            if (r0 != r1) goto L11
            if (r5 == 0) goto L10
            r5.unsubscribe()
        L10:
            return r2
        L11:
            boolean r0 = r4.compareAndSet(r0, r5)
            r3 = 1
            if (r0 == 0) goto L19
            return r3
        L19:
            java.lang.Object r0 = r4.get()
            rx.m r0 = (rx.m) r0
            if (r5 == 0) goto L24
            r5.unsubscribe()
        L24:
            if (r0 != r1) goto L27
            return r3
        L27:
            return r2
    }
}
