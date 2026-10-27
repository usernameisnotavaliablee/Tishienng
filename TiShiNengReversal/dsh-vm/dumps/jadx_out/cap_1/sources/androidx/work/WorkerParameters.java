package androidx.work;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class WorkerParameters {

    @androidx.annotation.NonNull
    private java.util.concurrent.Executor mBackgroundExecutor;

    @androidx.annotation.NonNull
    private androidx.work.ForegroundUpdater mForegroundUpdater;

    @androidx.annotation.NonNull
    private java.util.UUID mId;

    @androidx.annotation.NonNull
    private androidx.work.Data mInputData;

    @androidx.annotation.NonNull
    private androidx.work.ProgressUpdater mProgressUpdater;
    private int mRunAttemptCount;

    @androidx.annotation.NonNull
    private androidx.work.WorkerParameters.RuntimeExtras mRuntimeExtras;

    @androidx.annotation.NonNull
    private java.util.Set<java.lang.String> mTags;

    @androidx.annotation.NonNull
    private androidx.work.impl.utils.taskexecutor.TaskExecutor mWorkTaskExecutor;

    @androidx.annotation.NonNull
    private androidx.work.WorkerFactory mWorkerFactory;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static class RuntimeExtras {

        @androidx.annotation.RequiresApi(28)
        public android.net.Network network;

        @androidx.annotation.NonNull
        public java.util.List<java.lang.String> triggeredContentAuthorities;

        @androidx.annotation.NonNull
        public java.util.List<android.net.Uri> triggeredContentUris;

        public RuntimeExtras() {
                r1 = this;
                r1.<init>()
                java.util.List r0 = java.util.Collections.EMPTY_LIST
                r1.triggeredContentAuthorities = r0
                r1.triggeredContentUris = r0
                return
        }
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public WorkerParameters(@androidx.annotation.NonNull java.util.UUID r1, @androidx.annotation.NonNull androidx.work.Data r2, @androidx.annotation.NonNull java.util.Collection<java.lang.String> r3, @androidx.annotation.NonNull androidx.work.WorkerParameters.RuntimeExtras r4, @androidx.annotation.IntRange(from = 0) int r5, @androidx.annotation.NonNull java.util.concurrent.Executor r6, @androidx.annotation.NonNull androidx.work.impl.utils.taskexecutor.TaskExecutor r7, @androidx.annotation.NonNull androidx.work.WorkerFactory r8, @androidx.annotation.NonNull androidx.work.ProgressUpdater r9, @androidx.annotation.NonNull androidx.work.ForegroundUpdater r10) {
            r0 = this;
            r0.<init>()
            r0.mId = r1
            r0.mInputData = r2
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>(r3)
            r0.mTags = r1
            r0.mRuntimeExtras = r4
            r0.mRunAttemptCount = r5
            r0.mBackgroundExecutor = r6
            r0.mWorkTaskExecutor = r7
            r0.mWorkerFactory = r8
            r0.mProgressUpdater = r9
            r0.mForegroundUpdater = r10
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public java.util.concurrent.Executor getBackgroundExecutor() {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.mBackgroundExecutor
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.work.ForegroundUpdater getForegroundUpdater() {
            r1 = this;
            androidx.work.ForegroundUpdater r0 = r1.mForegroundUpdater
            return r0
    }

    @androidx.annotation.NonNull
    public java.util.UUID getId() {
            r1 = this;
            java.util.UUID r0 = r1.mId
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.work.Data getInputData() {
            r1 = this;
            androidx.work.Data r0 = r1.mInputData
            return r0
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RequiresApi(28)
    public android.net.Network getNetwork() {
            r1 = this;
            androidx.work.WorkerParameters$RuntimeExtras r0 = r1.mRuntimeExtras
            android.net.Network r0 = r0.network
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.work.ProgressUpdater getProgressUpdater() {
            r1 = this;
            androidx.work.ProgressUpdater r0 = r1.mProgressUpdater
            return r0
    }

    @androidx.annotation.IntRange(from = 0)
    public int getRunAttemptCount() {
            r1 = this;
            int r0 = r1.mRunAttemptCount
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.work.WorkerParameters.RuntimeExtras getRuntimeExtras() {
            r1 = this;
            androidx.work.WorkerParameters$RuntimeExtras r0 = r1.mRuntimeExtras
            return r0
    }

    @androidx.annotation.NonNull
    public java.util.Set<java.lang.String> getTags() {
            r1 = this;
            java.util.Set<java.lang.String> r0 = r1.mTags
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.work.impl.utils.taskexecutor.TaskExecutor getTaskExecutor() {
            r1 = this;
            androidx.work.impl.utils.taskexecutor.TaskExecutor r0 = r1.mWorkTaskExecutor
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RequiresApi(24)
    public java.util.List<java.lang.String> getTriggeredContentAuthorities() {
            r1 = this;
            androidx.work.WorkerParameters$RuntimeExtras r0 = r1.mRuntimeExtras
            java.util.List<java.lang.String> r0 = r0.triggeredContentAuthorities
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RequiresApi(24)
    public java.util.List<android.net.Uri> getTriggeredContentUris() {
            r1 = this;
            androidx.work.WorkerParameters$RuntimeExtras r0 = r1.mRuntimeExtras
            java.util.List<android.net.Uri> r0 = r0.triggeredContentUris
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.work.WorkerFactory getWorkerFactory() {
            r1 = this;
            androidx.work.WorkerFactory r0 = r1.mWorkerFactory
            return r0
    }
}
