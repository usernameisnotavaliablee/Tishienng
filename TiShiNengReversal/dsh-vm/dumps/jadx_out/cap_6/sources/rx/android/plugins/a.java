package rx.android.plugins;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class a {
    private static final rx.android.plugins.a b = null;
    private final java.util.concurrent.atomic.AtomicReference<rx.android.plugins.b> a;

    static {
            rx.android.plugins.a r0 = new rx.android.plugins.a
            r0.<init>()
            rx.android.plugins.a.b = r0
            return
    }

    a() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r1.a = r0
            return
    }

    public static rx.android.plugins.a a() {
            rx.android.plugins.a r0 = rx.android.plugins.a.b
            return r0
    }

    public rx.android.plugins.b b() {
            r3 = this;
            java.util.concurrent.atomic.AtomicReference<rx.android.plugins.b> r0 = r3.a
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L12
            java.util.concurrent.atomic.AtomicReference<rx.android.plugins.b> r0 = r3.a
            r1 = 0
            rx.android.plugins.b r2 = rx.android.plugins.b.a()
            androidx.camera.view.p.a(r0, r1, r2)
        L12:
            java.util.concurrent.atomic.AtomicReference<rx.android.plugins.b> r0 = r3.a
            java.lang.Object r0 = r0.get()
            rx.android.plugins.b r0 = (rx.android.plugins.b) r0
            return r0
    }

    public void c(rx.android.plugins.b r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<rx.android.plugins.b> r0 = r2.a
            r1 = 0
            boolean r3 = androidx.camera.view.p.a(r0, r1, r3)
            if (r3 == 0) goto La
            return
        La:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Another strategy was already registered: "
            r0.append(r1)
            java.util.concurrent.atomic.AtomicReference<rx.android.plugins.b> r1 = r2.a
            java.lang.Object r1 = r1.get()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    @rx.annotations.Experimental
    public void d() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<rx.android.plugins.b> r0 = r2.a
            r1 = 0
            r0.set(r1)
            return
    }
}
