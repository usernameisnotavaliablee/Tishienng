package androidx.camera.core.impl.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class Threads {
    private static final long TIMEOUT_RUN_ON_MAIN_MS = 30000;

    private Threads() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void a(java.lang.Runnable r0, java.util.concurrent.CountDownLatch r1) {
            r0.run()     // Catch: java.lang.Throwable -> L7
            r1.countDown()
            return
        L7:
            r0 = move-exception
            r1.countDown()
            throw r0
    }

    public static void checkBackgroundThread() {
            boolean r0 = isBackgroundThread()
            java.lang.String r1 = "In application's main thread"
            androidx.core.util.Preconditions.checkState(r0, r1)
            return
    }

    public static void checkMainThread() {
            boolean r0 = isMainThread()
            java.lang.String r1 = "Not in application's main thread"
            androidx.core.util.Preconditions.checkState(r0, r1)
            return
    }

    @androidx.annotation.NonNull
    private static android.os.Handler getMainHandler() {
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            return r0
    }

    public static boolean isBackgroundThread() {
            boolean r0 = isMainThread()
            r0 = r0 ^ 1
            return r0
    }

    public static boolean isMainThread() {
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 != r1) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    public static void runOnMain(@androidx.annotation.NonNull java.lang.Runnable r1) {
            boolean r0 = isMainThread()
            if (r0 == 0) goto La
            r1.run()
            return
        La:
            android.os.Handler r0 = getMainHandler()
            boolean r1 = r0.post(r1)
            java.lang.String r0 = "Unable to post to main thread"
            androidx.core.util.Preconditions.checkState(r1, r0)
            return
    }

    public static void runOnMainSync(@androidx.annotation.NonNull java.lang.Runnable r3) {
            boolean r0 = isMainThread()
            if (r0 == 0) goto La
            r3.run()
            return
        La:
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r1 = 1
            r0.<init>(r1)
            android.os.Handler r1 = getMainHandler()
            androidx.camera.core.impl.utils.a r2 = new androidx.camera.core.impl.utils.a
            r2.<init>(r3, r0)
            boolean r3 = r1.post(r2)
            java.lang.String r1 = "Unable to post to main thread"
            androidx.core.util.Preconditions.checkState(r3, r1)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.InterruptedException -> L35
            r1 = 30000(0x7530, double:1.4822E-319)
            boolean r3 = r0.await(r1, r3)     // Catch: java.lang.InterruptedException -> L35
            if (r3 == 0) goto L2d
            return
        L2d:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.InterruptedException -> L35
            java.lang.String r0 = "Timeout to wait main thread execution"
            r3.<init>(r0)     // Catch: java.lang.InterruptedException -> L35
            throw r3     // Catch: java.lang.InterruptedException -> L35
        L35:
            r3 = move-exception
            androidx.camera.core.impl.utils.InterruptedRuntimeException r0 = new androidx.camera.core.impl.utils.InterruptedRuntimeException
            r0.<init>(r3)
            throw r0
    }
}
