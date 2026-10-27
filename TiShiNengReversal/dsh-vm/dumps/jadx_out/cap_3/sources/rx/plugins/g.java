package rx.plugins;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class g {
    private static final rx.plugins.g a = null;

    static {
            rx.plugins.g r0 = new rx.plugins.g
            r0.<init>()
            rx.plugins.g.a = r0
            return
    }

    public g() {
            r0 = this;
            r0.<init>()
            return
    }

    public static rx.h a() {
            rx.internal.util.RxThreadFactory r0 = new rx.internal.util.RxThreadFactory
            java.lang.String r1 = "RxComputationScheduler-"
            r0.<init>(r1)
            rx.h r0 = b(r0)
            return r0
    }

    public static rx.h b(java.util.concurrent.ThreadFactory r1) {
            if (r1 == 0) goto L8
            rx.internal.schedulers.b r0 = new rx.internal.schedulers.b
            r0.<init>(r1)
            return r0
        L8:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "threadFactory == null"
            r1.<init>(r0)
            throw r1
    }

    public static rx.h c() {
            rx.internal.util.RxThreadFactory r0 = new rx.internal.util.RxThreadFactory
            java.lang.String r1 = "RxIoScheduler-"
            r0.<init>(r1)
            rx.h r0 = d(r0)
            return r0
    }

    public static rx.h d(java.util.concurrent.ThreadFactory r1) {
            if (r1 == 0) goto L8
            rx.internal.schedulers.a r0 = new rx.internal.schedulers.a
            r0.<init>(r1)
            return r0
        L8:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "threadFactory == null"
            r1.<init>(r0)
            throw r1
    }

    public static rx.h e() {
            rx.internal.util.RxThreadFactory r0 = new rx.internal.util.RxThreadFactory
            java.lang.String r1 = "RxNewThreadScheduler-"
            r0.<init>(r1)
            rx.h r0 = f(r0)
            return r0
    }

    public static rx.h f(java.util.concurrent.ThreadFactory r1) {
            if (r1 == 0) goto L8
            rx.internal.schedulers.g r0 = new rx.internal.schedulers.g
            r0.<init>(r1)
            return r0
        L8:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "threadFactory == null"
            r1.<init>(r0)
            throw r1
    }

    public static rx.plugins.g h() {
            rx.plugins.g r0 = rx.plugins.g.a
            return r0
    }

    public rx.h g() {
            r1 = this;
            r0 = 0
            return r0
    }

    public rx.h i() {
            r1 = this;
            r0 = 0
            return r0
    }

    public rx.h j() {
            r1 = this;
            r0 = 0
            return r0
    }

    @java.lang.Deprecated
    public rx.functions.a k(rx.functions.a r1) {
            r0 = this;
            return r1
    }
}
