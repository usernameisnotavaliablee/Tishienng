package androidx.camera.core.impl.utils.executor;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class IoExecutor implements java.util.concurrent.Executor {
    private static volatile java.util.concurrent.Executor sExecutor;
    private final java.util.concurrent.ExecutorService mIoService;


    IoExecutor() {
            r2 = this;
            r2.<init>()
            androidx.camera.core.impl.utils.executor.IoExecutor$1 r0 = new androidx.camera.core.impl.utils.executor.IoExecutor$1
            r0.<init>(r2)
            r1 = 2
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newFixedThreadPool(r1, r0)
            r2.mIoService = r0
            return
    }

    static java.util.concurrent.Executor getInstance() {
            java.util.concurrent.Executor r0 = androidx.camera.core.impl.utils.executor.IoExecutor.sExecutor
            if (r0 == 0) goto L7
            java.util.concurrent.Executor r0 = androidx.camera.core.impl.utils.executor.IoExecutor.sExecutor
            return r0
        L7:
            java.lang.Class<androidx.camera.core.impl.utils.executor.IoExecutor> r0 = androidx.camera.core.impl.utils.executor.IoExecutor.class
            monitor-enter(r0)
            java.util.concurrent.Executor r1 = androidx.camera.core.impl.utils.executor.IoExecutor.sExecutor     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L18
            androidx.camera.core.impl.utils.executor.IoExecutor r1 = new androidx.camera.core.impl.utils.executor.IoExecutor     // Catch: java.lang.Throwable -> L16
            r1.<init>()     // Catch: java.lang.Throwable -> L16
            androidx.camera.core.impl.utils.executor.IoExecutor.sExecutor = r1     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r1 = move-exception
            goto L1c
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            java.util.concurrent.Executor r0 = androidx.camera.core.impl.utils.executor.IoExecutor.sExecutor
            return r0
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r1
    }

    @Override // java.util.concurrent.Executor
    public void execute(@androidx.annotation.NonNull java.lang.Runnable r2) {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.mIoService
            r0.execute(r2)
            return
    }
}
