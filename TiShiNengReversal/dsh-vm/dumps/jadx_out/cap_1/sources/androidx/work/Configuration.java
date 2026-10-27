package androidx.work;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class Configuration {

    @android.annotation.SuppressLint({"MinMaxConstant"})
    public static final int MIN_SCHEDULER_LIMIT = 20;

    @androidx.annotation.Nullable
    final java.lang.String mDefaultProcessName;

    @androidx.annotation.Nullable
    final androidx.work.InitializationExceptionHandler mExceptionHandler;

    @androidx.annotation.NonNull
    final java.util.concurrent.Executor mExecutor;

    @androidx.annotation.NonNull
    final androidx.work.InputMergerFactory mInputMergerFactory;
    private final boolean mIsUsingDefaultTaskExecutor;
    final int mLoggingLevel;
    final int mMaxJobSchedulerId;
    final int mMaxSchedulerLimit;
    final int mMinJobSchedulerId;

    @androidx.annotation.NonNull
    final androidx.work.RunnableScheduler mRunnableScheduler;

    @androidx.annotation.NonNull
    final java.util.concurrent.Executor mTaskExecutor;

    @androidx.annotation.NonNull
    final androidx.work.WorkerFactory mWorkerFactory;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Builder {

        @androidx.annotation.Nullable
        java.lang.String mDefaultProcessName;

        @androidx.annotation.Nullable
        androidx.work.InitializationExceptionHandler mExceptionHandler;
        java.util.concurrent.Executor mExecutor;
        androidx.work.InputMergerFactory mInputMergerFactory;
        int mLoggingLevel;
        int mMaxJobSchedulerId;
        int mMaxSchedulerLimit;
        int mMinJobSchedulerId;
        androidx.work.RunnableScheduler mRunnableScheduler;
        java.util.concurrent.Executor mTaskExecutor;
        androidx.work.WorkerFactory mWorkerFactory;

        public Builder() {
                r1 = this;
                r1.<init>()
                r0 = 4
                r1.mLoggingLevel = r0
                r0 = 0
                r1.mMinJobSchedulerId = r0
                r0 = 2147483647(0x7fffffff, float:NaN)
                r1.mMaxJobSchedulerId = r0
                r0 = 20
                r1.mMaxSchedulerLimit = r0
                return
        }

        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public Builder(@androidx.annotation.NonNull androidx.work.Configuration r2) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.Executor r0 = r2.mExecutor
                r1.mExecutor = r0
                androidx.work.WorkerFactory r0 = r2.mWorkerFactory
                r1.mWorkerFactory = r0
                androidx.work.InputMergerFactory r0 = r2.mInputMergerFactory
                r1.mInputMergerFactory = r0
                java.util.concurrent.Executor r0 = r2.mTaskExecutor
                r1.mTaskExecutor = r0
                int r0 = r2.mLoggingLevel
                r1.mLoggingLevel = r0
                int r0 = r2.mMinJobSchedulerId
                r1.mMinJobSchedulerId = r0
                int r0 = r2.mMaxJobSchedulerId
                r1.mMaxJobSchedulerId = r0
                int r0 = r2.mMaxSchedulerLimit
                r1.mMaxSchedulerLimit = r0
                androidx.work.RunnableScheduler r0 = r2.mRunnableScheduler
                r1.mRunnableScheduler = r0
                androidx.work.InitializationExceptionHandler r0 = r2.mExceptionHandler
                r1.mExceptionHandler = r0
                java.lang.String r2 = r2.mDefaultProcessName
                r1.mDefaultProcessName = r2
                return
        }

        @androidx.annotation.NonNull
        public androidx.work.Configuration build() {
                r1 = this;
                androidx.work.Configuration r0 = new androidx.work.Configuration
                r0.<init>(r1)
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.work.Configuration.Builder setDefaultProcessName(@androidx.annotation.NonNull java.lang.String r1) {
                r0 = this;
                r0.mDefaultProcessName = r1
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.work.Configuration.Builder setExecutor(@androidx.annotation.NonNull java.util.concurrent.Executor r1) {
                r0 = this;
                r0.mExecutor = r1
                return r0
        }

        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.work.Configuration.Builder setInitializationExceptionHandler(@androidx.annotation.NonNull androidx.work.InitializationExceptionHandler r1) {
                r0 = this;
                r0.mExceptionHandler = r1
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.work.Configuration.Builder setInputMergerFactory(@androidx.annotation.NonNull androidx.work.InputMergerFactory r1) {
                r0 = this;
                r0.mInputMergerFactory = r1
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.work.Configuration.Builder setJobSchedulerJobIdRange(int r3, int r4) {
                r2 = this;
                int r0 = r4 - r3
                r1 = 1000(0x3e8, float:1.401E-42)
                if (r0 < r1) goto Lb
                r2.mMinJobSchedulerId = r3
                r2.mMaxJobSchedulerId = r4
                return r2
            Lb:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r4 = "WorkManager needs a range of at least 1000 job ids."
                r3.<init>(r4)
                throw r3
        }

        @androidx.annotation.NonNull
        public androidx.work.Configuration.Builder setMaxSchedulerLimit(int r2) {
                r1 = this;
                r0 = 20
                if (r2 < r0) goto Ld
                r0 = 50
                int r2 = java.lang.Math.min(r2, r0)
                r1.mMaxSchedulerLimit = r2
                return r1
            Ld:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "WorkManager needs to be able to schedule at least 20 jobs in JobScheduler."
                r2.<init>(r0)
                throw r2
        }

        @androidx.annotation.NonNull
        public androidx.work.Configuration.Builder setMinimumLoggingLevel(int r1) {
                r0 = this;
                r0.mLoggingLevel = r1
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.work.Configuration.Builder setRunnableScheduler(@androidx.annotation.NonNull androidx.work.RunnableScheduler r1) {
                r0 = this;
                r0.mRunnableScheduler = r1
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.work.Configuration.Builder setTaskExecutor(@androidx.annotation.NonNull java.util.concurrent.Executor r1) {
                r0 = this;
                r0.mTaskExecutor = r1
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.work.Configuration.Builder setWorkerFactory(@androidx.annotation.NonNull androidx.work.WorkerFactory r1) {
                r0 = this;
                r0.mWorkerFactory = r1
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface Provider {
        @androidx.annotation.NonNull
        androidx.work.Configuration getWorkManagerConfiguration();
    }

    Configuration(@androidx.annotation.NonNull androidx.work.Configuration.Builder r3) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.Executor r0 = r3.mExecutor
            r1 = 0
            if (r0 != 0) goto Lf
            java.util.concurrent.Executor r0 = r2.createDefaultExecutor(r1)
            r2.mExecutor = r0
            goto L11
        Lf:
            r2.mExecutor = r0
        L11:
            java.util.concurrent.Executor r0 = r3.mTaskExecutor
            if (r0 != 0) goto L1f
            r0 = 1
            r2.mIsUsingDefaultTaskExecutor = r0
            java.util.concurrent.Executor r0 = r2.createDefaultExecutor(r0)
            r2.mTaskExecutor = r0
            goto L23
        L1f:
            r2.mIsUsingDefaultTaskExecutor = r1
            r2.mTaskExecutor = r0
        L23:
            androidx.work.WorkerFactory r0 = r3.mWorkerFactory
            if (r0 != 0) goto L2e
            androidx.work.WorkerFactory r0 = androidx.work.WorkerFactory.getDefaultWorkerFactory()
            r2.mWorkerFactory = r0
            goto L30
        L2e:
            r2.mWorkerFactory = r0
        L30:
            androidx.work.InputMergerFactory r0 = r3.mInputMergerFactory
            if (r0 != 0) goto L3b
            androidx.work.InputMergerFactory r0 = androidx.work.InputMergerFactory.getDefaultInputMergerFactory()
            r2.mInputMergerFactory = r0
            goto L3d
        L3b:
            r2.mInputMergerFactory = r0
        L3d:
            androidx.work.RunnableScheduler r0 = r3.mRunnableScheduler
            if (r0 != 0) goto L49
            androidx.work.impl.DefaultRunnableScheduler r0 = new androidx.work.impl.DefaultRunnableScheduler
            r0.<init>()
            r2.mRunnableScheduler = r0
            goto L4b
        L49:
            r2.mRunnableScheduler = r0
        L4b:
            int r0 = r3.mLoggingLevel
            r2.mLoggingLevel = r0
            int r0 = r3.mMinJobSchedulerId
            r2.mMinJobSchedulerId = r0
            int r0 = r3.mMaxJobSchedulerId
            r2.mMaxJobSchedulerId = r0
            int r0 = r3.mMaxSchedulerLimit
            r2.mMaxSchedulerLimit = r0
            androidx.work.InitializationExceptionHandler r0 = r3.mExceptionHandler
            r2.mExceptionHandler = r0
            java.lang.String r3 = r3.mDefaultProcessName
            r2.mDefaultProcessName = r3
            return
    }

    @androidx.annotation.NonNull
    private java.util.concurrent.Executor createDefaultExecutor(boolean r3) {
            r2 = this;
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            int r0 = r0.availableProcessors()
            int r0 = r0 + (-1)
            r1 = 4
            int r0 = java.lang.Math.min(r0, r1)
            r1 = 2
            int r0 = java.lang.Math.max(r1, r0)
            java.util.concurrent.ThreadFactory r3 = r2.createDefaultThreadFactory(r3)
            java.util.concurrent.ExecutorService r3 = java.util.concurrent.Executors.newFixedThreadPool(r0, r3)
            return r3
    }

    @androidx.annotation.NonNull
    private java.util.concurrent.ThreadFactory createDefaultThreadFactory(boolean r2) {
            r1 = this;
            androidx.work.Configuration$1 r0 = new androidx.work.Configuration$1
            r0.<init>(r1, r2)
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.String getDefaultProcessName() {
            r1 = this;
            java.lang.String r0 = r1.mDefaultProcessName
            return r0
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.work.InitializationExceptionHandler getExceptionHandler() {
            r1 = this;
            androidx.work.InitializationExceptionHandler r0 = r1.mExceptionHandler
            return r0
    }

    @androidx.annotation.NonNull
    public java.util.concurrent.Executor getExecutor() {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.mExecutor
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.work.InputMergerFactory getInputMergerFactory() {
            r1 = this;
            androidx.work.InputMergerFactory r0 = r1.mInputMergerFactory
            return r0
    }

    public int getMaxJobSchedulerId() {
            r1 = this;
            int r0 = r1.mMaxJobSchedulerId
            return r0
    }

    @androidx.annotation.IntRange(from = 20, to = 50)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public int getMaxSchedulerLimit() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 != r1) goto Lb
            int r0 = r2.mMaxSchedulerLimit
            int r0 = r0 / 2
            return r0
        Lb:
            int r0 = r2.mMaxSchedulerLimit
            return r0
    }

    public int getMinJobSchedulerId() {
            r1 = this;
            int r0 = r1.mMinJobSchedulerId
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public int getMinimumLoggingLevel() {
            r1 = this;
            int r0 = r1.mLoggingLevel
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.work.RunnableScheduler getRunnableScheduler() {
            r1 = this;
            androidx.work.RunnableScheduler r0 = r1.mRunnableScheduler
            return r0
    }

    @androidx.annotation.NonNull
    public java.util.concurrent.Executor getTaskExecutor() {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.mTaskExecutor
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.work.WorkerFactory getWorkerFactory() {
            r1 = this;
            androidx.work.WorkerFactory r0 = r1.mWorkerFactory
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isUsingDefaultTaskExecutor() {
            r1 = this;
            boolean r0 = r1.mIsUsingDefaultTaskExecutor
            return r0
    }
}
