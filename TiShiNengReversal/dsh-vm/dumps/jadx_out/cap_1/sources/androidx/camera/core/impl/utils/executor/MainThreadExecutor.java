package androidx.camera.core.impl.utils.executor;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class MainThreadExecutor {
    private static volatile java.util.concurrent.ScheduledExecutorService sInstance;

    private MainThreadExecutor() {
            r0 = this;
            r0.<init>()
            return
    }

    static java.util.concurrent.ScheduledExecutorService getInstance() {
            java.util.concurrent.ScheduledExecutorService r0 = androidx.camera.core.impl.utils.executor.MainThreadExecutor.sInstance
            if (r0 == 0) goto L7
            java.util.concurrent.ScheduledExecutorService r0 = androidx.camera.core.impl.utils.executor.MainThreadExecutor.sInstance
            return r0
        L7:
            java.lang.Class<androidx.camera.core.impl.utils.executor.MainThreadExecutor> r0 = androidx.camera.core.impl.utils.executor.MainThreadExecutor.class
            monitor-enter(r0)
            java.util.concurrent.ScheduledExecutorService r1 = androidx.camera.core.impl.utils.executor.MainThreadExecutor.sInstance     // Catch: java.lang.Throwable -> L1f
            if (r1 != 0) goto L21
            androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService r1 = new androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService     // Catch: java.lang.Throwable -> L1f
            android.os.Handler r2 = new android.os.Handler     // Catch: java.lang.Throwable -> L1f
            android.os.Looper r3 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L1f
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L1f
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1f
            androidx.camera.core.impl.utils.executor.MainThreadExecutor.sInstance = r1     // Catch: java.lang.Throwable -> L1f
            goto L21
        L1f:
            r1 = move-exception
            goto L25
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            java.util.concurrent.ScheduledExecutorService r0 = androidx.camera.core.impl.utils.executor.MainThreadExecutor.sInstance
            return r0
        L25:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            throw r1
    }
}
