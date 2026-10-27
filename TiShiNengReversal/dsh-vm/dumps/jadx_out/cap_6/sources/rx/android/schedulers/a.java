package rx.android.schedulers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class a {
    private static final rx.android.schedulers.a b = null;
    private final rx.h a;

    static {
            rx.android.schedulers.a r0 = new rx.android.schedulers.a
            r0.<init>()
            rx.android.schedulers.a.b = r0
            return
    }

    private a() {
            r2 = this;
            r2.<init>()
            rx.android.plugins.a r0 = rx.android.plugins.a.a()
            rx.android.plugins.b r0 = r0.b()
            rx.h r0 = r0.b()
            if (r0 == 0) goto L14
            r2.a = r0
            return
        L14:
            rx.android.schedulers.c r0 = new rx.android.schedulers.c
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.a = r0
            return
    }

    public static rx.h a(android.os.Looper r1) {
            if (r1 == 0) goto L8
            rx.android.schedulers.c r0 = new rx.android.schedulers.c
            r0.<init>(r1)
            return r0
        L8:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "looper == null"
            r1.<init>(r0)
            throw r1
    }

    public static rx.h b() {
            rx.android.schedulers.a r0 = rx.android.schedulers.a.b
            rx.h r0 = r0.a
            return r0
    }
}
