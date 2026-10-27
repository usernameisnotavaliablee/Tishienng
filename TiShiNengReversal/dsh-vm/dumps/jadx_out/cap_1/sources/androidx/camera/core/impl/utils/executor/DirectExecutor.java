package androidx.camera.core.impl.utils.executor;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class DirectExecutor implements java.util.concurrent.Executor {
    private static volatile androidx.camera.core.impl.utils.executor.DirectExecutor sDirectExecutor;

    DirectExecutor() {
            r0 = this;
            r0.<init>()
            return
    }

    static java.util.concurrent.Executor getInstance() {
            androidx.camera.core.impl.utils.executor.DirectExecutor r0 = androidx.camera.core.impl.utils.executor.DirectExecutor.sDirectExecutor
            if (r0 == 0) goto L7
            androidx.camera.core.impl.utils.executor.DirectExecutor r0 = androidx.camera.core.impl.utils.executor.DirectExecutor.sDirectExecutor
            return r0
        L7:
            java.lang.Class<androidx.camera.core.impl.utils.executor.DirectExecutor> r0 = androidx.camera.core.impl.utils.executor.DirectExecutor.class
            monitor-enter(r0)
            androidx.camera.core.impl.utils.executor.DirectExecutor r1 = androidx.camera.core.impl.utils.executor.DirectExecutor.sDirectExecutor     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L18
            androidx.camera.core.impl.utils.executor.DirectExecutor r1 = new androidx.camera.core.impl.utils.executor.DirectExecutor     // Catch: java.lang.Throwable -> L16
            r1.<init>()     // Catch: java.lang.Throwable -> L16
            androidx.camera.core.impl.utils.executor.DirectExecutor.sDirectExecutor = r1     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r1 = move-exception
            goto L1c
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            androidx.camera.core.impl.utils.executor.DirectExecutor r0 = androidx.camera.core.impl.utils.executor.DirectExecutor.sDirectExecutor
            return r0
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r1
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable r1) {
            r0 = this;
            r1.run()
            return
    }
}
