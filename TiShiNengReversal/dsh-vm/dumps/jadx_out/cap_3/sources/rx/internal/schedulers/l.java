package rx.internal.schedulers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
class l implements rx.functions.a {
    private final rx.functions.a a;
    private final rx.h.a b;
    private final long c;

    public l(rx.functions.a r1, rx.h.a r2, long r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public void call() {
            r5 = this;
            rx.h$a r0 = r5.b
            boolean r0 = r0.isUnsubscribed()
            if (r0 == 0) goto L9
            goto L2f
        L9:
            long r0 = r5.c
            rx.h$a r2 = r5.b
            long r2 = r2.b()
            long r0 = r0 - r2
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L27
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> L1c
            goto L27
        L1c:
            r0 = move-exception
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
            rx.exceptions.a.c(r0)
        L27:
            rx.h$a r0 = r5.b
            boolean r0 = r0.isUnsubscribed()
            if (r0 == 0) goto L30
        L2f:
            return
        L30:
            rx.functions.a r0 = r5.a
            r0.call()
            return
    }
}
