package rx.subscriptions;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class f {
    private static final rx.subscriptions.f.b a = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a implements rx.m {
        final java.util.concurrent.Future<?> a;

        public a(java.util.concurrent.Future<?> r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        public boolean isUnsubscribed() {
                r1 = this;
                java.util.concurrent.Future<?> r0 = r1.a
                boolean r0 = r0.isCancelled()
                return r0
        }

        public void unsubscribe() {
                r2 = this;
                java.util.concurrent.Future<?> r0 = r2.a
                r1 = 1
                r0.cancel(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b implements rx.m {
        b() {
                r0 = this;
                r0.<init>()
                return
        }

        public boolean isUnsubscribed() {
                r1 = this;
                r0 = 1
                return r0
        }

        public void unsubscribe() {
                r0 = this;
                return
        }
    }

    static {
            rx.subscriptions.f$b r0 = new rx.subscriptions.f$b
            r0.<init>()
            rx.subscriptions.f.a = r0
            return
    }

    private f() {
            r2 = this;
            r2.<init>()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No instances!"
            r0.<init>(r1)
            throw r0
    }

    public static rx.m a(rx.functions.a r0) {
            rx.subscriptions.a r0 = rx.subscriptions.a.b(r0)
            return r0
    }

    public static rx.m b() {
            rx.subscriptions.a r0 = rx.subscriptions.a.a()
            return r0
    }

    public static rx.m c(java.util.concurrent.Future<?> r1) {
            rx.subscriptions.f$a r0 = new rx.subscriptions.f$a
            r0.<init>(r1)
            return r0
    }

    public static rx.subscriptions.b d(rx.m... r1) {
            rx.subscriptions.b r0 = new rx.subscriptions.b
            r0.<init>(r1)
            return r0
    }

    public static rx.m e() {
            rx.subscriptions.f$b r0 = rx.subscriptions.f.a
            return r0
    }
}
