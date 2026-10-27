package rx.subscriptions;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class d implements rx.m {
    static final rx.subscriptions.d.b c = null;
    private final rx.m a;
    final java.util.concurrent.atomic.AtomicReference<rx.subscriptions.d.b> b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a extends java.util.concurrent.atomic.AtomicInteger implements rx.m {
        private static final long serialVersionUID = 7005765588239987643L;
        final rx.subscriptions.d a;

        public a(rx.subscriptions.d r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        public boolean isUnsubscribed() {
                r1 = this;
                int r0 = r1.get()
                if (r0 == 0) goto L8
                r0 = 1
                return r0
            L8:
                r0 = 0
                return r0
        }

        public void unsubscribe() {
                r2 = this;
                r0 = 0
                r1 = 1
                boolean r0 = r2.compareAndSet(r0, r1)
                if (r0 == 0) goto Ld
                rx.subscriptions.d r0 = r2.a
                r0.b()
            Ld:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b {
        final boolean a;
        final int b;

        b(boolean r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }

        rx.subscriptions.d.b a() {
                r3 = this;
                rx.subscriptions.d$b r0 = new rx.subscriptions.d$b
                boolean r1 = r3.a
                int r2 = r3.b
                int r2 = r2 + 1
                r0.<init>(r1, r2)
                return r0
        }

        rx.subscriptions.d.b b() {
                r3 = this;
                rx.subscriptions.d$b r0 = new rx.subscriptions.d$b
                boolean r1 = r3.a
                int r2 = r3.b
                int r2 = r2 + (-1)
                r0.<init>(r1, r2)
                return r0
        }

        rx.subscriptions.d.b c() {
                r3 = this;
                rx.subscriptions.d$b r0 = new rx.subscriptions.d$b
                r1 = 1
                int r2 = r3.b
                r0.<init>(r1, r2)
                return r0
        }
    }

    static {
            rx.subscriptions.d$b r0 = new rx.subscriptions.d$b
            r1 = 0
            r0.<init>(r1, r1)
            rx.subscriptions.d.c = r0
            return
    }

    public d(rx.m r3) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            rx.subscriptions.d$b r1 = rx.subscriptions.d.c
            r0.<init>(r1)
            r2.b = r0
            if (r3 == 0) goto L11
            r2.a = r3
            return
        L11:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "s"
            r3.<init>(r0)
            throw r3
    }

    private void d(rx.subscriptions.d.b r2) {
            r1 = this;
            boolean r0 = r2.a
            if (r0 == 0) goto Ld
            int r2 = r2.b
            if (r2 != 0) goto Ld
            rx.m r2 = r1.a
            r2.unsubscribe()
        Ld:
            return
    }

    public rx.m a() {
            r3 = this;
            java.util.concurrent.atomic.AtomicReference<rx.subscriptions.d$b> r0 = r3.b
        L2:
            java.lang.Object r1 = r0.get()
            rx.subscriptions.d$b r1 = (rx.subscriptions.d.b) r1
            boolean r2 = r1.a
            if (r2 == 0) goto L11
            rx.m r0 = rx.subscriptions.f.e()
            return r0
        L11:
            rx.subscriptions.d$b r2 = r1.a()
            boolean r1 = androidx.camera.view.p.a(r0, r1, r2)
            if (r1 == 0) goto L2
            rx.subscriptions.d$a r0 = new rx.subscriptions.d$a
            r0.<init>(r3)
            return r0
    }

    void b() {
            r3 = this;
            java.util.concurrent.atomic.AtomicReference<rx.subscriptions.d$b> r0 = r3.b
        L2:
            java.lang.Object r1 = r0.get()
            rx.subscriptions.d$b r1 = (rx.subscriptions.d.b) r1
            rx.subscriptions.d$b r2 = r1.b()
            boolean r1 = androidx.camera.view.p.a(r0, r1, r2)
            if (r1 == 0) goto L2
            r3.d(r2)
            return
    }

    public boolean isUnsubscribed() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<rx.subscriptions.d$b> r0 = r1.b
            java.lang.Object r0 = r0.get()
            rx.subscriptions.d$b r0 = (rx.subscriptions.d.b) r0
            boolean r0 = r0.a
            return r0
    }

    public void unsubscribe() {
            r3 = this;
            java.util.concurrent.atomic.AtomicReference<rx.subscriptions.d$b> r0 = r3.b
        L2:
            java.lang.Object r1 = r0.get()
            rx.subscriptions.d$b r1 = (rx.subscriptions.d.b) r1
            boolean r2 = r1.a
            if (r2 == 0) goto Ld
            return
        Ld:
            rx.subscriptions.d$b r2 = r1.c()
            boolean r1 = androidx.camera.view.p.a(r0, r1, r2)
            if (r1 == 0) goto L2
            r3.d(r2)
            return
    }
}
