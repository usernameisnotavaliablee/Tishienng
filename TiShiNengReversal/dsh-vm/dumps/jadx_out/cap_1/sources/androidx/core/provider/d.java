package androidx.core.provider;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final /* synthetic */ class d {
    public static /* synthetic */ void a(java.util.concurrent.ExecutorService r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 <= r1) goto Ld
            java.util.concurrent.ForkJoinPool r0 = java.util.concurrent.ForkJoinPool.commonPool()
            if (r5 != r0) goto Ld
            goto L33
        Ld:
            boolean r0 = r5.isTerminated()
            if (r0 != 0) goto L33
            r5.shutdown()
            r1 = 0
        L17:
            if (r0 != 0) goto L2a
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.DAYS     // Catch: java.lang.InterruptedException -> L22
            r3 = 1
            boolean r0 = r5.awaitTermination(r3, r2)     // Catch: java.lang.InterruptedException -> L22
            goto L17
        L22:
            if (r1 != 0) goto L17
            r5.shutdownNow()
            r1 = 1
            goto L17
        L2a:
            if (r1 == 0) goto L33
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            r5.interrupt()
        L33:
            return
    }
}
