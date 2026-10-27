package androidx.work.impl.utils.taskexecutor;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class WorkManagerTaskExecutor implements androidx.work.impl.utils.taskexecutor.TaskExecutor {
    private final androidx.work.impl.utils.SerialExecutor mBackgroundExecutor;
    private final java.util.concurrent.Executor mMainThreadExecutor;
    private final android.os.Handler mMainThreadHandler;


    public WorkManagerTaskExecutor(@androidx.annotation.NonNull java.util.concurrent.Executor r3) {
            r2 = this;
            r2.<init>()
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.mMainThreadHandler = r0
            androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor$1 r0 = new androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor$1
            r0.<init>(r2)
            r2.mMainThreadExecutor = r0
            androidx.work.impl.utils.SerialExecutor r0 = new androidx.work.impl.utils.SerialExecutor
            r0.<init>(r3)
            r2.mBackgroundExecutor = r0
            return
    }

    @Override // androidx.work.impl.utils.taskexecutor.TaskExecutor
    public void executeOnBackgroundThread(java.lang.Runnable r2) {
            r1 = this;
            androidx.work.impl.utils.SerialExecutor r0 = r1.mBackgroundExecutor
            r0.execute(r2)
            return
    }

    @Override // androidx.work.impl.utils.taskexecutor.TaskExecutor
    @androidx.annotation.NonNull
    public androidx.work.impl.utils.SerialExecutor getBackgroundExecutor() {
            r1 = this;
            androidx.work.impl.utils.SerialExecutor r0 = r1.mBackgroundExecutor
            return r0
    }

    @Override // androidx.work.impl.utils.taskexecutor.TaskExecutor
    public java.util.concurrent.Executor getMainThreadExecutor() {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.mMainThreadExecutor
            return r0
    }

    @Override // androidx.work.impl.utils.taskexecutor.TaskExecutor
    public void postToMainThread(java.lang.Runnable r2) {
            r1 = this;
            android.os.Handler r0 = r1.mMainThreadHandler
            r0.post(r2)
            return
    }
}
