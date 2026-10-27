package androidx.work;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class PeriodicWorkRequest extends androidx.work.WorkRequest {

    @android.annotation.SuppressLint({"MinMaxConstant"})
    public static final long MIN_PERIODIC_FLEX_MILLIS = 300000;

    @android.annotation.SuppressLint({"MinMaxConstant"})
    public static final long MIN_PERIODIC_INTERVAL_MILLIS = 900000;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Builder extends androidx.work.WorkRequest.Builder<androidx.work.PeriodicWorkRequest.Builder, androidx.work.PeriodicWorkRequest> {
        public Builder(@androidx.annotation.NonNull java.lang.Class<? extends androidx.work.ListenableWorker> r1, long r2, @androidx.annotation.NonNull java.util.concurrent.TimeUnit r4) {
                r0 = this;
                r0.<init>(r1)
                androidx.work.impl.model.WorkSpec r1 = r0.mWorkSpec
                long r2 = r4.toMillis(r2)
                r1.setPeriodic(r2)
                return
        }

        public Builder(@androidx.annotation.NonNull java.lang.Class<? extends androidx.work.ListenableWorker> r1, long r2, @androidx.annotation.NonNull java.util.concurrent.TimeUnit r4, long r5, @androidx.annotation.NonNull java.util.concurrent.TimeUnit r7) {
                r0 = this;
                r0.<init>(r1)
                androidx.work.impl.model.WorkSpec r1 = r0.mWorkSpec
                long r2 = r4.toMillis(r2)
                long r4 = r7.toMillis(r5)
                r1.setPeriodic(r2, r4)
                return
        }

        @androidx.annotation.RequiresApi(26)
        public Builder(@androidx.annotation.NonNull java.lang.Class<? extends androidx.work.ListenableWorker> r3, @androidx.annotation.NonNull java.time.Duration r4) {
                r2 = this;
                r2.<init>(r3)
                androidx.work.impl.model.WorkSpec r3 = r2.mWorkSpec
                long r0 = androidx.work.a.a(r4)
                r3.setPeriodic(r0)
                return
        }

        @androidx.annotation.RequiresApi(26)
        public Builder(@androidx.annotation.NonNull java.lang.Class<? extends androidx.work.ListenableWorker> r3, @androidx.annotation.NonNull java.time.Duration r4, @androidx.annotation.NonNull java.time.Duration r5) {
                r2 = this;
                r2.<init>(r3)
                androidx.work.impl.model.WorkSpec r3 = r2.mWorkSpec
                long r0 = androidx.work.a.a(r4)
                long r4 = androidx.work.a.a(r5)
                r3.setPeriodic(r0, r4)
                return
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.work.WorkRequest.Builder
        @androidx.annotation.NonNull
        androidx.work.PeriodicWorkRequest buildInternal() {
                r2 = this;
                boolean r0 = r2.mBackoffCriteriaSet
                if (r0 == 0) goto L1d
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 23
                if (r0 < r1) goto L1d
                androidx.work.impl.model.WorkSpec r0 = r2.mWorkSpec
                androidx.work.Constraints r0 = r0.constraints
                boolean r0 = r0.requiresDeviceIdle()
                if (r0 != 0) goto L15
                goto L1d
            L15:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Cannot set backoff criteria on an idle mode job"
                r0.<init>(r1)
                throw r0
            L1d:
                androidx.work.impl.model.WorkSpec r0 = r2.mWorkSpec
                boolean r0 = r0.expedited
                if (r0 != 0) goto L29
                androidx.work.PeriodicWorkRequest r0 = new androidx.work.PeriodicWorkRequest
                r0.<init>(r2)
                return r0
            L29:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "PeriodicWorkRequests cannot be expedited"
                r0.<init>(r1)
                throw r0
        }

        @Override // androidx.work.WorkRequest.Builder
        @androidx.annotation.NonNull
        /* bridge */ /* synthetic */ androidx.work.PeriodicWorkRequest buildInternal() {
                r1 = this;
                androidx.work.PeriodicWorkRequest r0 = r1.buildInternal()
                return r0
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.work.WorkRequest.Builder
        @androidx.annotation.NonNull
        androidx.work.PeriodicWorkRequest.Builder getThis() {
                r0 = this;
                return r0
        }

        @Override // androidx.work.WorkRequest.Builder
        @androidx.annotation.NonNull
        /* bridge */ /* synthetic */ androidx.work.PeriodicWorkRequest.Builder getThis() {
                r1 = this;
                androidx.work.PeriodicWorkRequest$Builder r0 = r1.getThis()
                return r0
        }
    }

    PeriodicWorkRequest(androidx.work.PeriodicWorkRequest.Builder r3) {
            r2 = this;
            java.util.UUID r0 = r3.mId
            androidx.work.impl.model.WorkSpec r1 = r3.mWorkSpec
            java.util.Set<java.lang.String> r3 = r3.mTags
            r2.<init>(r0, r1, r3)
            return
    }
}
