package rx.subscriptions;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class a implements rx.m {
    static final rx.functions.a b = null;
    final java.util.concurrent.atomic.AtomicReference<rx.functions.a> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: rx.subscriptions.a$a, reason: collision with other inner class name */
    static class C0056a implements rx.functions.a {
        C0056a() {
                r0 = this;
                r0.<init>()
                return
        }

        public void call() {
                r0 = this;
                return
        }
    }

    static {
            rx.subscriptions.a$a r0 = new rx.subscriptions.a$a
            r0.<init>()
            rx.subscriptions.a.b = r0
            return
    }

    public a() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r1.a = r0
            return
    }

    private a(rx.functions.a r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>(r2)
            r1.a = r0
            return
    }

    public static rx.subscriptions.a a() {
            rx.subscriptions.a r0 = new rx.subscriptions.a
            r0.<init>()
            return r0
    }

    public static rx.subscriptions.a b(rx.functions.a r1) {
            rx.subscriptions.a r0 = new rx.subscriptions.a
            r0.<init>(r1)
            return r0
    }

    public boolean isUnsubscribed() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<rx.functions.a> r0 = r2.a
            java.lang.Object r0 = r0.get()
            rx.functions.a r1 = rx.subscriptions.a.b
            if (r0 != r1) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public void unsubscribe() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<rx.functions.a> r0 = r2.a
            java.lang.Object r0 = r0.get()
            rx.functions.a r0 = (rx.functions.a) r0
            rx.functions.a r1 = rx.subscriptions.a.b
            if (r0 == r1) goto L1b
            java.util.concurrent.atomic.AtomicReference<rx.functions.a> r0 = r2.a
            java.lang.Object r0 = r0.getAndSet(r1)
            rx.functions.a r0 = (rx.functions.a) r0
            if (r0 == 0) goto L1b
            if (r0 == r1) goto L1b
            r0.call()
        L1b:
            return
    }
}
