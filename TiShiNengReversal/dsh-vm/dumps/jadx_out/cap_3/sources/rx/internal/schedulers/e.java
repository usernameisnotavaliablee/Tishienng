package rx.internal.schedulers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
enum e extends java.lang.Enum<rx.internal.schedulers.e> {
    static final java.lang.String a = "RxScheduledExecutorPool-";
    static final rx.internal.util.RxThreadFactory b = null;
    private static final /* synthetic */ rx.internal.schedulers.e[] c = null;

    static {
            r0 = 0
            rx.internal.schedulers.e[] r0 = new rx.internal.schedulers.e[r0]
            rx.internal.schedulers.e.c = r0
            rx.internal.util.RxThreadFactory r0 = new rx.internal.util.RxThreadFactory
            java.lang.String r1 = "RxScheduledExecutorPool-"
            r0.<init>(r1)
            rx.internal.schedulers.e.b = r0
            return
    }

    e(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static java.util.concurrent.ScheduledExecutorService a() {
            rx.functions.o r0 = rx.plugins.c.j()
            if (r0 != 0) goto Lb
            java.util.concurrent.ScheduledExecutorService r0 = b()
            return r0
        Lb:
            java.lang.Object r0 = r0.call()
            java.util.concurrent.ScheduledExecutorService r0 = (java.util.concurrent.ScheduledExecutorService) r0
            return r0
    }

    static java.util.concurrent.ScheduledExecutorService b() {
            r0 = 1
            java.util.concurrent.ThreadFactory r1 = c()
            java.util.concurrent.ScheduledExecutorService r0 = java.util.concurrent.Executors.newScheduledThreadPool(r0, r1)
            return r0
    }

    static java.util.concurrent.ThreadFactory c() {
            rx.internal.util.RxThreadFactory r0 = rx.internal.schedulers.e.b
            return r0
    }

    public static rx.internal.schedulers.e valueOf(java.lang.String r1) {
            java.lang.Class<rx.internal.schedulers.e> r0 = rx.internal.schedulers.e.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            rx.internal.schedulers.e r1 = (rx.internal.schedulers.e) r1
            return r1
    }

    public static rx.internal.schedulers.e[] values() {
            rx.internal.schedulers.e[] r0 = rx.internal.schedulers.e.c
            java.lang.Object r0 = r0.clone()
            rx.internal.schedulers.e[] r0 = (rx.internal.schedulers.e[]) r0
            return r0
    }
}
