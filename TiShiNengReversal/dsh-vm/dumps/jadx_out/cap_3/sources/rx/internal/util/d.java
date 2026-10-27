package rx.internal.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class d {
    private d() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a(java.util.concurrent.CountDownLatch r5, rx.m r6) {
            long r0 = r5.getCount()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lb
            return
        Lb:
            r5.await()     // Catch: java.lang.InterruptedException -> Lf
            return
        Lf:
            r5 = move-exception
            r6.unsubscribe()
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            r6.interrupt()
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Interrupted while waiting for subscription to complete."
            r6.<init>(r0, r5)
            throw r6
    }
}
