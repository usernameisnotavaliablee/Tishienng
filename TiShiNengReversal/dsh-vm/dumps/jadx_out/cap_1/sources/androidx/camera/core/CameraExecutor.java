package androidx.camera.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class CameraExecutor implements java.util.concurrent.Executor {
    private static final int DEFAULT_CORE_THREADS = 1;
    private static final int DEFAULT_MAX_THREADS = 1;
    private static final java.lang.String TAG = "CameraExecutor";
    private static final java.util.concurrent.ThreadFactory THREAD_FACTORY = null;
    private final java.lang.Object mExecutorLock;

    @androidx.annotation.NonNull
    @androidx.annotation.GuardedBy("mExecutorLock")
    private java.util.concurrent.ThreadPoolExecutor mThreadPoolExecutor;


    static {
            androidx.camera.core.CameraExecutor$1 r0 = new androidx.camera.core.CameraExecutor$1
            r0.<init>()
            androidx.camera.core.CameraExecutor.THREAD_FACTORY = r0
            return
    }

    CameraExecutor() {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.mExecutorLock = r0
            java.util.concurrent.ThreadPoolExecutor r0 = createExecutor()
            r1.mThreadPoolExecutor = r0
            return
    }

    public static /* synthetic */ void a(java.lang.Runnable r0, java.util.concurrent.ThreadPoolExecutor r1) {
            java.lang.String r0 = "CameraExecutor"
            java.lang.String r1 = "A rejected execution occurred in CameraExecutor!"
            androidx.camera.core.Logger.e(r0, r1)
            return
    }

    private static java.util.concurrent.ThreadPoolExecutor createExecutor() {
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.LinkedBlockingQueue r6 = new java.util.concurrent.LinkedBlockingQueue
            r6.<init>()
            java.util.concurrent.ThreadFactory r7 = androidx.camera.core.CameraExecutor.THREAD_FACTORY
            r1 = 1
            r2 = 1
            r3 = 0
            r0.<init>(r1, r2, r3, r5, r6, r7)
            androidx.camera.core.d r1 = new androidx.camera.core.d
            r1.<init>()
            r0.setRejectedExecutionHandler(r1)
            return r0
    }

    void deinit() {
            r2 = this;
            java.lang.Object r0 = r2.mExecutorLock
            monitor-enter(r0)
            java.util.concurrent.ThreadPoolExecutor r1 = r2.mThreadPoolExecutor     // Catch: java.lang.Throwable -> L11
            boolean r1 = r1.isShutdown()     // Catch: java.lang.Throwable -> L11
            if (r1 != 0) goto L13
            java.util.concurrent.ThreadPoolExecutor r1 = r2.mThreadPoolExecutor     // Catch: java.lang.Throwable -> L11
            r1.shutdown()     // Catch: java.lang.Throwable -> L11
            goto L13
        L11:
            r1 = move-exception
            goto L15
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1
    }

    @Override // java.util.concurrent.Executor
    public void execute(@androidx.annotation.NonNull java.lang.Runnable r3) {
            r2 = this;
            androidx.core.util.Preconditions.checkNotNull(r3)
            java.lang.Object r0 = r2.mExecutorLock
            monitor-enter(r0)
            java.util.concurrent.ThreadPoolExecutor r1 = r2.mThreadPoolExecutor     // Catch: java.lang.Throwable -> Ld
            r1.execute(r3)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r3
    }

    void init(@androidx.annotation.NonNull androidx.camera.core.impl.CameraFactory r3) {
            r2 = this;
            androidx.core.util.Preconditions.checkNotNull(r3)
            java.lang.Object r0 = r2.mExecutorLock
            monitor-enter(r0)
            java.util.concurrent.ThreadPoolExecutor r1 = r2.mThreadPoolExecutor     // Catch: java.lang.Throwable -> L15
            boolean r1 = r1.isShutdown()     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L17
            java.util.concurrent.ThreadPoolExecutor r1 = createExecutor()     // Catch: java.lang.Throwable -> L15
            r2.mThreadPoolExecutor = r1     // Catch: java.lang.Throwable -> L15
            goto L17
        L15:
            r3 = move-exception
            goto L2e
        L17:
            java.util.concurrent.ThreadPoolExecutor r1 = r2.mThreadPoolExecutor     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            java.util.Set r3 = r3.getAvailableCameraIds()
            int r3 = r3.size()
            r0 = 1
            int r3 = java.lang.Math.max(r0, r3)
            r1.setMaximumPoolSize(r3)
            r1.setCorePoolSize(r3)
            return
        L2e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r3
    }
}
