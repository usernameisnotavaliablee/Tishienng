package androidx.work;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class WorkRequest {
    public static final long DEFAULT_BACKOFF_DELAY_MILLIS = 30000;

    @android.annotation.SuppressLint({"MinMaxConstant"})
    public static final long MAX_BACKOFF_MILLIS = 18000000;

    @android.annotation.SuppressLint({"MinMaxConstant"})
    public static final long MIN_BACKOFF_MILLIS = 10000;

    @androidx.annotation.NonNull
    private java.util.UUID mId;

    @androidx.annotation.NonNull
    private java.util.Set<java.lang.String> mTags;

    @androidx.annotation.NonNull
    private androidx.work.impl.model.WorkSpec mWorkSpec;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class Builder<B extends androidx.work.WorkRequest.Builder<?, ?>, W extends androidx.work.WorkRequest> {
        boolean mBackoffCriteriaSet;
        java.util.UUID mId;
        java.util.Set<java.lang.String> mTags;
        androidx.work.impl.model.WorkSpec mWorkSpec;
        java.lang.Class<? extends androidx.work.ListenableWorker> mWorkerClass;

        Builder(@androidx.annotation.NonNull java.lang.Class<? extends androidx.work.ListenableWorker> r4) {
                r3 = this;
                r3.<init>()
                r0 = 0
                r3.mBackoffCriteriaSet = r0
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r3.mTags = r0
                java.util.UUID r0 = java.util.UUID.randomUUID()
                r3.mId = r0
                r3.mWorkerClass = r4
                androidx.work.impl.model.WorkSpec r0 = new androidx.work.impl.model.WorkSpec
                java.util.UUID r1 = r3.mId
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = r4.getName()
                r0.<init>(r1, r2)
                r3.mWorkSpec = r0
                java.lang.String r4 = r4.getName()
                r3.addTag(r4)
                return
        }

        @androidx.annotation.NonNull
        public final B addTag(@androidx.annotation.NonNull java.lang.String r2) {
                r1 = this;
                java.util.Set<java.lang.String> r0 = r1.mTags
                r0.add(r2)
                androidx.work.WorkRequest$Builder r2 = r1.getThis()
                return r2
        }

        @androidx.annotation.NonNull
        public final W build() {
                r6 = this;
                androidx.work.WorkRequest r0 = r6.buildInternal()
                androidx.work.impl.model.WorkSpec r1 = r6.mWorkSpec
                androidx.work.Constraints r1 = r1.constraints
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 24
                if (r2 < r3) goto L14
                boolean r3 = r1.hasContentUriTriggers()
                if (r3 != 0) goto L2d
            L14:
                boolean r3 = r1.requiresBatteryNotLow()
                if (r3 != 0) goto L2d
                boolean r3 = r1.requiresCharging()
                if (r3 != 0) goto L2d
                r3 = 23
                if (r2 < r3) goto L2b
                boolean r1 = r1.requiresDeviceIdle()
                if (r1 == 0) goto L2b
                goto L2d
            L2b:
                r1 = 0
                goto L2e
            L2d:
                r1 = 1
            L2e:
                androidx.work.impl.model.WorkSpec r2 = r6.mWorkSpec
                boolean r3 = r2.expedited
                if (r3 == 0) goto L4f
                if (r1 != 0) goto L47
                long r1 = r2.initialDelay
                r3 = 0
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 > 0) goto L3f
                goto L4f
            L3f:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Expedited jobs cannot be delayed"
                r0.<init>(r1)
                throw r0
            L47:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Expedited jobs only support network and storage constraints"
                r0.<init>(r1)
                throw r0
            L4f:
                java.util.UUID r1 = java.util.UUID.randomUUID()
                r6.mId = r1
                androidx.work.impl.model.WorkSpec r1 = new androidx.work.impl.model.WorkSpec
                androidx.work.impl.model.WorkSpec r2 = r6.mWorkSpec
                r1.<init>(r2)
                r6.mWorkSpec = r1
                java.util.UUID r2 = r6.mId
                java.lang.String r2 = r2.toString()
                r1.id = r2
                return r0
        }

        @androidx.annotation.NonNull
        abstract W buildInternal();

        @androidx.annotation.NonNull
        abstract B getThis();

        @androidx.annotation.NonNull
        public final B keepResultsForAtLeast(long r2, @androidx.annotation.NonNull java.util.concurrent.TimeUnit r4) {
                r1 = this;
                androidx.work.impl.model.WorkSpec r0 = r1.mWorkSpec
                long r2 = r4.toMillis(r2)
                r0.minimumRetentionDuration = r2
                androidx.work.WorkRequest$Builder r2 = r1.getThis()
                return r2
        }

        @androidx.annotation.NonNull
        @androidx.annotation.RequiresApi(26)
        public final B keepResultsForAtLeast(@androidx.annotation.NonNull java.time.Duration r4) {
                r3 = this;
                androidx.work.impl.model.WorkSpec r0 = r3.mWorkSpec
                long r1 = androidx.work.a.a(r4)
                r0.minimumRetentionDuration = r1
                androidx.work.WorkRequest$Builder r4 = r3.getThis()
                return r4
        }

        @androidx.annotation.NonNull
        public final B setBackoffCriteria(@androidx.annotation.NonNull androidx.work.BackoffPolicy r2, long r3, @androidx.annotation.NonNull java.util.concurrent.TimeUnit r5) {
                r1 = this;
                r0 = 1
                r1.mBackoffCriteriaSet = r0
                androidx.work.impl.model.WorkSpec r0 = r1.mWorkSpec
                r0.backoffPolicy = r2
                long r2 = r5.toMillis(r3)
                r0.setBackoffDelayDuration(r2)
                androidx.work.WorkRequest$Builder r2 = r1.getThis()
                return r2
        }

        @androidx.annotation.NonNull
        @androidx.annotation.RequiresApi(26)
        public final B setBackoffCriteria(@androidx.annotation.NonNull androidx.work.BackoffPolicy r2, @androidx.annotation.NonNull java.time.Duration r3) {
                r1 = this;
                r0 = 1
                r1.mBackoffCriteriaSet = r0
                androidx.work.impl.model.WorkSpec r0 = r1.mWorkSpec
                r0.backoffPolicy = r2
                long r2 = androidx.work.a.a(r3)
                r0.setBackoffDelayDuration(r2)
                androidx.work.WorkRequest$Builder r2 = r1.getThis()
                return r2
        }

        @androidx.annotation.NonNull
        public final B setConstraints(@androidx.annotation.NonNull androidx.work.Constraints r2) {
                r1 = this;
                androidx.work.impl.model.WorkSpec r0 = r1.mWorkSpec
                r0.constraints = r2
                androidx.work.WorkRequest$Builder r2 = r1.getThis()
                return r2
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"MissingGetterMatchingBuilder"})
        public B setExpedited(@androidx.annotation.NonNull androidx.work.OutOfQuotaPolicy r3) {
                r2 = this;
                androidx.work.impl.model.WorkSpec r0 = r2.mWorkSpec
                r1 = 1
                r0.expedited = r1
                r0.outOfQuotaPolicy = r3
                androidx.work.WorkRequest$Builder r3 = r2.getThis()
                return r3
        }

        @androidx.annotation.NonNull
        public B setInitialDelay(long r3, @androidx.annotation.NonNull java.util.concurrent.TimeUnit r5) {
                r2 = this;
                androidx.work.impl.model.WorkSpec r0 = r2.mWorkSpec
                long r3 = r5.toMillis(r3)
                r0.initialDelay = r3
                r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                long r0 = java.lang.System.currentTimeMillis()
                long r3 = r3 - r0
                androidx.work.impl.model.WorkSpec r5 = r2.mWorkSpec
                long r0 = r5.initialDelay
                int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r5 <= 0) goto L1f
                androidx.work.WorkRequest$Builder r3 = r2.getThis()
                return r3
            L1f:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r4 = "The given initial delay is too large and will cause an overflow!"
                r3.<init>(r4)
                throw r3
        }

        @androidx.annotation.NonNull
        @androidx.annotation.RequiresApi(26)
        public B setInitialDelay(@androidx.annotation.NonNull java.time.Duration r5) {
                r4 = this;
                androidx.work.impl.model.WorkSpec r0 = r4.mWorkSpec
                long r1 = androidx.work.a.a(r5)
                r0.initialDelay = r1
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                long r2 = java.lang.System.currentTimeMillis()
                long r0 = r0 - r2
                androidx.work.impl.model.WorkSpec r5 = r4.mWorkSpec
                long r2 = r5.initialDelay
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 <= 0) goto L1f
                androidx.work.WorkRequest$Builder r5 = r4.getThis()
                return r5
            L1f:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "The given initial delay is too large and will cause an overflow!"
                r5.<init>(r0)
                throw r5
        }

        @androidx.annotation.NonNull
        @androidx.annotation.VisibleForTesting
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public final B setInitialRunAttemptCount(int r2) {
                r1 = this;
                androidx.work.impl.model.WorkSpec r0 = r1.mWorkSpec
                r0.runAttemptCount = r2
                androidx.work.WorkRequest$Builder r2 = r1.getThis()
                return r2
        }

        @androidx.annotation.NonNull
        @androidx.annotation.VisibleForTesting
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public final B setInitialState(@androidx.annotation.NonNull androidx.work.WorkInfo.State r2) {
                r1 = this;
                androidx.work.impl.model.WorkSpec r0 = r1.mWorkSpec
                r0.state = r2
                androidx.work.WorkRequest$Builder r2 = r1.getThis()
                return r2
        }

        @androidx.annotation.NonNull
        public final B setInputData(@androidx.annotation.NonNull androidx.work.Data r2) {
                r1 = this;
                androidx.work.impl.model.WorkSpec r0 = r1.mWorkSpec
                r0.input = r2
                androidx.work.WorkRequest$Builder r2 = r1.getThis()
                return r2
        }

        @androidx.annotation.NonNull
        @androidx.annotation.VisibleForTesting
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public final B setPeriodStartTime(long r2, @androidx.annotation.NonNull java.util.concurrent.TimeUnit r4) {
                r1 = this;
                androidx.work.impl.model.WorkSpec r0 = r1.mWorkSpec
                long r2 = r4.toMillis(r2)
                r0.periodStartTime = r2
                androidx.work.WorkRequest$Builder r2 = r1.getThis()
                return r2
        }

        @androidx.annotation.NonNull
        @androidx.annotation.VisibleForTesting
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public final B setScheduleRequestedAt(long r2, @androidx.annotation.NonNull java.util.concurrent.TimeUnit r4) {
                r1 = this;
                androidx.work.impl.model.WorkSpec r0 = r1.mWorkSpec
                long r2 = r4.toMillis(r2)
                r0.scheduleRequestedAt = r2
                androidx.work.WorkRequest$Builder r2 = r1.getThis()
                return r2
        }
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    protected WorkRequest(@androidx.annotation.NonNull java.util.UUID r1, @androidx.annotation.NonNull androidx.work.impl.model.WorkSpec r2, @androidx.annotation.NonNull java.util.Set<java.lang.String> r3) {
            r0 = this;
            r0.<init>()
            r0.mId = r1
            r0.mWorkSpec = r2
            r0.mTags = r3
            return
    }

    @androidx.annotation.NonNull
    public java.util.UUID getId() {
            r1 = this;
            java.util.UUID r0 = r1.mId
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public java.lang.String getStringId() {
            r1 = this;
            java.util.UUID r0 = r1.mId
            java.lang.String r0 = r0.toString()
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public java.util.Set<java.lang.String> getTags() {
            r1 = this;
            java.util.Set<java.lang.String> r0 = r1.mTags
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.work.impl.model.WorkSpec getWorkSpec() {
            r1 = this;
            androidx.work.impl.model.WorkSpec r0 = r1.mWorkSpec
            return r0
    }
}
