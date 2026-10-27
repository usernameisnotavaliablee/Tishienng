package androidx.camera.core.impl.utils.executor;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class AudioExecutor implements java.util.concurrent.Executor {
    private static volatile java.util.concurrent.Executor sExecutor;
    private final java.util.concurrent.ExecutorService mAudioService;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.camera.core.impl.utils.executor.AudioExecutor$1, reason: invalid class name */
    class AnonymousClass1 implements java.util.concurrent.ThreadFactory {
        private static final java.lang.String THREAD_NAME_STEM = "CameraX-camerax_audio_%d";
        private final java.util.concurrent.atomic.AtomicInteger mThreadId;
        final /* synthetic */ androidx.camera.core.impl.utils.executor.AudioExecutor this$0;

        AnonymousClass1(androidx.camera.core.impl.utils.executor.AudioExecutor r2) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
                r0 = 0
                r2.<init>(r0)
                r1.mThreadId = r2
                return
        }

        public static /* synthetic */ void a(java.lang.Runnable r1) {
                r0 = -16
                android.os.Process.setThreadPriority(r0)
                r1.run()
                return
        }

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(java.lang.Runnable r5) {
                r4 = this;
                androidx.camera.core.impl.utils.executor.a r0 = new androidx.camera.core.impl.utils.executor.a
                r0.<init>(r5)
                java.lang.Thread r5 = new java.lang.Thread
                r5.<init>(r0)
                java.util.Locale r0 = java.util.Locale.US
                java.util.concurrent.atomic.AtomicInteger r1 = r4.mThreadId
                int r1 = r1.getAndIncrement()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                r2[r3] = r1
                java.lang.String r1 = "CameraX-camerax_audio_%d"
                java.lang.String r0 = java.lang.String.format(r0, r1, r2)
                r5.setName(r0)
                return r5
        }
    }

    public AudioExecutor() {
            r2 = this;
            r2.<init>()
            androidx.camera.core.impl.utils.executor.AudioExecutor$1 r0 = new androidx.camera.core.impl.utils.executor.AudioExecutor$1
            r0.<init>(r2)
            r1 = 2
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newFixedThreadPool(r1, r0)
            r2.mAudioService = r0
            return
    }

    static java.util.concurrent.Executor getInstance() {
            java.util.concurrent.Executor r0 = androidx.camera.core.impl.utils.executor.AudioExecutor.sExecutor
            if (r0 == 0) goto L7
            java.util.concurrent.Executor r0 = androidx.camera.core.impl.utils.executor.AudioExecutor.sExecutor
            return r0
        L7:
            java.lang.Class<androidx.camera.core.impl.utils.executor.AudioExecutor> r0 = androidx.camera.core.impl.utils.executor.AudioExecutor.class
            monitor-enter(r0)
            java.util.concurrent.Executor r1 = androidx.camera.core.impl.utils.executor.AudioExecutor.sExecutor     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L18
            androidx.camera.core.impl.utils.executor.AudioExecutor r1 = new androidx.camera.core.impl.utils.executor.AudioExecutor     // Catch: java.lang.Throwable -> L16
            r1.<init>()     // Catch: java.lang.Throwable -> L16
            androidx.camera.core.impl.utils.executor.AudioExecutor.sExecutor = r1     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r1 = move-exception
            goto L1c
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            java.util.concurrent.Executor r0 = androidx.camera.core.impl.utils.executor.AudioExecutor.sExecutor
            return r0
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r1
    }

    @Override // java.util.concurrent.Executor
    public void execute(@androidx.annotation.NonNull java.lang.Runnable r2) {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.mAudioService
            r0.execute(r2)
            return
    }
}
