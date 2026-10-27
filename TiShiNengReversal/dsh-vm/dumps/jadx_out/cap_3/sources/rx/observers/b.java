package rx.observers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public abstract class b implements rx.d, rx.m {
    static final rx.observers.b.a b = null;
    private final java.util.concurrent.atomic.AtomicReference<rx.m> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a implements rx.m {
        a() {
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
            rx.observers.b$a r0 = new rx.observers.b$a
            r0.<init>()
            rx.observers.b.b = r0
            return
    }

    public b() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r1.a = r0
            return
    }

    public final void a(rx.m r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<rx.m> r0 = r2.a
            r1 = 0
            boolean r0 = androidx.camera.view.p.a(r0, r1, r3)
            if (r0 != 0) goto L21
            r3.unsubscribe()
            java.util.concurrent.atomic.AtomicReference<rx.m> r3 = r2.a
            java.lang.Object r3 = r3.get()
            rx.observers.b$a r0 = rx.observers.b.b
            if (r3 == r0) goto L20
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Subscription already set!"
            r3.<init>(r0)
            rx.plugins.c.I(r3)
        L20:
            return
        L21:
            r2.onStart()
            return
    }

    protected final void b() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<rx.m> r0 = r2.a
            rx.observers.b$a r1 = rx.observers.b.b
            r0.set(r1)
            return
    }

    public final boolean isUnsubscribed() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<rx.m> r0 = r2.a
            java.lang.Object r0 = r0.get()
            rx.observers.b$a r1 = rx.observers.b.b
            if (r0 != r1) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    protected void onStart() {
            r0 = this;
            return
    }

    public final void unsubscribe() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<rx.m> r0 = r2.a
            java.lang.Object r0 = r0.get()
            rx.m r0 = (rx.m) r0
            rx.observers.b$a r1 = rx.observers.b.b
            if (r0 == r1) goto L1b
            java.util.concurrent.atomic.AtomicReference<rx.m> r0 = r2.a
            java.lang.Object r0 = r0.getAndSet(r1)
            rx.m r0 = (rx.m) r0
            if (r0 == 0) goto L1b
            if (r0 == r1) goto L1b
            r0.unsubscribe()
        L1b:
            return
    }
}
