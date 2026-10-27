package rx.internal.schedulers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class f extends rx.h {
    public static final rx.internal.schedulers.f a = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a extends rx.h.a implements rx.m {
        final rx.subscriptions.a a;
        final /* synthetic */ rx.internal.schedulers.f b;

        a(rx.internal.schedulers.f r1) {
                r0 = this;
                r0.b = r1
                r0.<init>()
                rx.subscriptions.a r1 = new rx.subscriptions.a
                r1.<init>()
                r0.a = r1
                return
        }

        public rx.m d(rx.functions.a r1) {
                r0 = this;
                r1.call()
                rx.m r1 = rx.subscriptions.f.e()
                return r1
        }

        public rx.m e(rx.functions.a r3, long r4, java.util.concurrent.TimeUnit r6) {
                r2 = this;
                rx.internal.schedulers.f r0 = r2.b
                long r0 = r0.b()
                long r4 = r6.toMillis(r4)
                long r0 = r0 + r4
                rx.internal.schedulers.l r4 = new rx.internal.schedulers.l
                r4.<init>(r3, r2, r0)
                rx.m r3 = r2.d(r4)
                return r3
        }

        public boolean isUnsubscribed() {
                r1 = this;
                rx.subscriptions.a r0 = r1.a
                boolean r0 = r0.isUnsubscribed()
                return r0
        }

        public void unsubscribe() {
                r1 = this;
                rx.subscriptions.a r0 = r1.a
                r0.unsubscribe()
                return
        }
    }

    static {
            rx.internal.schedulers.f r0 = new rx.internal.schedulers.f
            r0.<init>()
            rx.internal.schedulers.f.a = r0
            return
    }

    private f() {
            r0 = this;
            r0.<init>()
            return
    }

    public rx.h.a a() {
            r1 = this;
            rx.internal.schedulers.f$a r0 = new rx.internal.schedulers.f$a
            r0.<init>(r1)
            return r0
    }
}
