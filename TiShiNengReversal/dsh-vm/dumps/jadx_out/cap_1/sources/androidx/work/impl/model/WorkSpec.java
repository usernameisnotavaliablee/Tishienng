package androidx.work.impl.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.room.Entity(indices = {@androidx.room.Index({"schedule_requested_at"}), @androidx.room.Index({"period_start_time"})})
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class WorkSpec {
    public static final long SCHEDULE_NOT_REQUESTED_YET = -1;
    private static final java.lang.String TAG = null;
    public static final androidx.arch.core.util.Function<java.util.List<androidx.work.impl.model.WorkSpec.WorkInfoPojo>, java.util.List<androidx.work.WorkInfo>> WORK_INFO_MAPPER = null;

    @androidx.room.ColumnInfo(name = "backoff_delay_duration")
    public long backoffDelayDuration;

    @androidx.annotation.NonNull
    @androidx.room.ColumnInfo(name = "backoff_policy")
    public androidx.work.BackoffPolicy backoffPolicy;

    @androidx.annotation.NonNull
    @androidx.room.Embedded
    public androidx.work.Constraints constraints;

    @androidx.room.ColumnInfo(name = "run_in_foreground")
    public boolean expedited;

    @androidx.room.ColumnInfo(name = "flex_duration")
    public long flexDuration;

    @androidx.annotation.NonNull
    @androidx.room.PrimaryKey
    @androidx.room.ColumnInfo(name = "id")
    public java.lang.String id;

    @androidx.room.ColumnInfo(name = "initial_delay")
    public long initialDelay;

    @androidx.annotation.NonNull
    @androidx.room.ColumnInfo(name = "input")
    public androidx.work.Data input;

    @androidx.room.ColumnInfo(name = "input_merger_class_name")
    public java.lang.String inputMergerClassName;

    @androidx.room.ColumnInfo(name = "interval_duration")
    public long intervalDuration;

    @androidx.room.ColumnInfo(name = "minimum_retention_duration")
    public long minimumRetentionDuration;

    @androidx.annotation.NonNull
    @androidx.room.ColumnInfo(name = "out_of_quota_policy")
    public androidx.work.OutOfQuotaPolicy outOfQuotaPolicy;

    @androidx.annotation.NonNull
    @androidx.room.ColumnInfo(name = "output")
    public androidx.work.Data output;

    @androidx.room.ColumnInfo(name = "period_start_time")
    public long periodStartTime;

    @androidx.annotation.IntRange(from = 0)
    @androidx.room.ColumnInfo(name = "run_attempt_count")
    public int runAttemptCount;

    @androidx.room.ColumnInfo(name = "schedule_requested_at")
    public long scheduleRequestedAt;

    @androidx.annotation.NonNull
    @androidx.room.ColumnInfo(name = "state")
    public androidx.work.WorkInfo.State state;

    @androidx.annotation.NonNull
    @androidx.room.ColumnInfo(name = "worker_class_name")
    public java.lang.String workerClassName;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class IdAndState {

        @androidx.room.ColumnInfo(name = "id")
        public java.lang.String id;

        @androidx.room.ColumnInfo(name = "state")
        public androidx.work.WorkInfo.State state;

        public IdAndState() {
                r0 = this;
                r0.<init>()
                return
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                if (r3 != r4) goto L4
                r4 = 1
                return r4
            L4:
                boolean r0 = r4 instanceof androidx.work.impl.model.WorkSpec.IdAndState
                r1 = 0
                if (r0 != 0) goto La
                return r1
            La:
                androidx.work.impl.model.WorkSpec$IdAndState r4 = (androidx.work.impl.model.WorkSpec.IdAndState) r4
                androidx.work.WorkInfo$State r0 = r3.state
                androidx.work.WorkInfo$State r2 = r4.state
                if (r0 == r2) goto L13
                return r1
            L13:
                java.lang.String r0 = r3.id
                java.lang.String r4 = r4.id
                boolean r4 = r0.equals(r4)
                return r4
        }

        public int hashCode() {
                r2 = this;
                java.lang.String r0 = r2.id
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                androidx.work.WorkInfo$State r1 = r2.state
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class WorkInfoPojo {

        @androidx.room.ColumnInfo(name = "id")
        public java.lang.String id;

        @androidx.room.ColumnInfo(name = "output")
        public androidx.work.Data output;

        @androidx.room.Relation(entity = androidx.work.impl.model.WorkProgress.class, entityColumn = "work_spec_id", parentColumn = "id", projection = {"progress"})
        public java.util.List<androidx.work.Data> progress;

        @androidx.room.ColumnInfo(name = "run_attempt_count")
        public int runAttemptCount;

        @androidx.room.ColumnInfo(name = "state")
        public androidx.work.WorkInfo.State state;

        @androidx.room.Relation(entity = androidx.work.impl.model.WorkTag.class, entityColumn = "work_spec_id", parentColumn = "id", projection = {"tag"})
        public java.util.List<java.lang.String> tags;

        public WorkInfoPojo() {
                r0 = this;
                r0.<init>()
                return
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof androidx.work.impl.model.WorkSpec.WorkInfoPojo
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                androidx.work.impl.model.WorkSpec$WorkInfoPojo r5 = (androidx.work.impl.model.WorkSpec.WorkInfoPojo) r5
                int r1 = r4.runAttemptCount
                int r3 = r5.runAttemptCount
                if (r1 == r3) goto L13
                return r2
            L13:
                java.lang.String r1 = r4.id
                if (r1 == 0) goto L20
                java.lang.String r3 = r5.id
                boolean r1 = r1.equals(r3)
                if (r1 != 0) goto L25
                goto L24
            L20:
                java.lang.String r1 = r5.id
                if (r1 == 0) goto L25
            L24:
                return r2
            L25:
                androidx.work.WorkInfo$State r1 = r4.state
                androidx.work.WorkInfo$State r3 = r5.state
                if (r1 == r3) goto L2c
                return r2
            L2c:
                androidx.work.Data r1 = r4.output
                if (r1 == 0) goto L39
                androidx.work.Data r3 = r5.output
                boolean r1 = r1.equals(r3)
                if (r1 != 0) goto L3e
                goto L3d
            L39:
                androidx.work.Data r1 = r5.output
                if (r1 == 0) goto L3e
            L3d:
                return r2
            L3e:
                java.util.List<java.lang.String> r1 = r4.tags
                if (r1 == 0) goto L4b
                java.util.List<java.lang.String> r3 = r5.tags
                boolean r1 = r1.equals(r3)
                if (r1 != 0) goto L50
                goto L4f
            L4b:
                java.util.List<java.lang.String> r1 = r5.tags
                if (r1 == 0) goto L50
            L4f:
                return r2
            L50:
                java.util.List<androidx.work.Data> r1 = r4.progress
                java.util.List<androidx.work.Data> r5 = r5.progress
                if (r1 == 0) goto L5b
                boolean r5 = r1.equals(r5)
                return r5
            L5b:
                if (r5 != 0) goto L5e
                return r0
            L5e:
                return r2
        }

        public int hashCode() {
                r3 = this;
                java.lang.String r0 = r3.id
                r1 = 0
                if (r0 == 0) goto La
                int r0 = r0.hashCode()
                goto Lb
            La:
                r0 = 0
            Lb:
                int r0 = r0 * 31
                androidx.work.WorkInfo$State r2 = r3.state
                if (r2 == 0) goto L16
                int r2 = r2.hashCode()
                goto L17
            L16:
                r2 = 0
            L17:
                int r0 = r0 + r2
                int r0 = r0 * 31
                androidx.work.Data r2 = r3.output
                if (r2 == 0) goto L23
                int r2 = r2.hashCode()
                goto L24
            L23:
                r2 = 0
            L24:
                int r0 = r0 + r2
                int r0 = r0 * 31
                int r2 = r3.runAttemptCount
                int r0 = r0 + r2
                int r0 = r0 * 31
                java.util.List<java.lang.String> r2 = r3.tags
                if (r2 == 0) goto L35
                int r2 = r2.hashCode()
                goto L36
            L35:
                r2 = 0
            L36:
                int r0 = r0 + r2
                int r0 = r0 * 31
                java.util.List<androidx.work.Data> r2 = r3.progress
                if (r2 == 0) goto L41
                int r1 = r2.hashCode()
            L41:
                int r0 = r0 + r1
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.work.WorkInfo toWorkInfo() {
                r8 = this;
                java.util.List<androidx.work.Data> r0 = r8.progress
                if (r0 == 0) goto L15
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L15
                java.util.List<androidx.work.Data> r0 = r8.progress
                r1 = 0
                java.lang.Object r0 = r0.get(r1)
                androidx.work.Data r0 = (androidx.work.Data) r0
            L13:
                r6 = r0
                goto L18
            L15:
                androidx.work.Data r0 = androidx.work.Data.EMPTY
                goto L13
            L18:
                androidx.work.WorkInfo r1 = new androidx.work.WorkInfo
                java.lang.String r0 = r8.id
                java.util.UUID r2 = java.util.UUID.fromString(r0)
                androidx.work.WorkInfo$State r3 = r8.state
                androidx.work.Data r4 = r8.output
                java.util.List<java.lang.String> r5 = r8.tags
                int r7 = r8.runAttemptCount
                r1.<init>(r2, r3, r4, r5, r6, r7)
                return r1
        }
    }

    static {
            java.lang.String r0 = "WorkSpec"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.impl.model.WorkSpec.TAG = r0
            androidx.work.impl.model.WorkSpec$1 r0 = new androidx.work.impl.model.WorkSpec$1
            r0.<init>()
            androidx.work.impl.model.WorkSpec.WORK_INFO_MAPPER = r0
            return
    }

    public WorkSpec(@androidx.annotation.NonNull androidx.work.impl.model.WorkSpec r3) {
            r2 = this;
            r2.<init>()
            androidx.work.WorkInfo$State r0 = androidx.work.WorkInfo.State.ENQUEUED
            r2.state = r0
            androidx.work.Data r0 = androidx.work.Data.EMPTY
            r2.input = r0
            r2.output = r0
            androidx.work.Constraints r0 = androidx.work.Constraints.NONE
            r2.constraints = r0
            androidx.work.BackoffPolicy r0 = androidx.work.BackoffPolicy.EXPONENTIAL
            r2.backoffPolicy = r0
            r0 = 30000(0x7530, double:1.4822E-319)
            r2.backoffDelayDuration = r0
            r0 = -1
            r2.scheduleRequestedAt = r0
            androidx.work.OutOfQuotaPolicy r0 = androidx.work.OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST
            r2.outOfQuotaPolicy = r0
            java.lang.String r0 = r3.id
            r2.id = r0
            java.lang.String r0 = r3.workerClassName
            r2.workerClassName = r0
            androidx.work.WorkInfo$State r0 = r3.state
            r2.state = r0
            java.lang.String r0 = r3.inputMergerClassName
            r2.inputMergerClassName = r0
            androidx.work.Data r0 = new androidx.work.Data
            androidx.work.Data r1 = r3.input
            r0.<init>(r1)
            r2.input = r0
            androidx.work.Data r0 = new androidx.work.Data
            androidx.work.Data r1 = r3.output
            r0.<init>(r1)
            r2.output = r0
            long r0 = r3.initialDelay
            r2.initialDelay = r0
            long r0 = r3.intervalDuration
            r2.intervalDuration = r0
            long r0 = r3.flexDuration
            r2.flexDuration = r0
            androidx.work.Constraints r0 = new androidx.work.Constraints
            androidx.work.Constraints r1 = r3.constraints
            r0.<init>(r1)
            r2.constraints = r0
            int r0 = r3.runAttemptCount
            r2.runAttemptCount = r0
            androidx.work.BackoffPolicy r0 = r3.backoffPolicy
            r2.backoffPolicy = r0
            long r0 = r3.backoffDelayDuration
            r2.backoffDelayDuration = r0
            long r0 = r3.periodStartTime
            r2.periodStartTime = r0
            long r0 = r3.minimumRetentionDuration
            r2.minimumRetentionDuration = r0
            long r0 = r3.scheduleRequestedAt
            r2.scheduleRequestedAt = r0
            boolean r0 = r3.expedited
            r2.expedited = r0
            androidx.work.OutOfQuotaPolicy r3 = r3.outOfQuotaPolicy
            r2.outOfQuotaPolicy = r3
            return
    }

    public WorkSpec(@androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.NonNull java.lang.String r4) {
            r2 = this;
            r2.<init>()
            androidx.work.WorkInfo$State r0 = androidx.work.WorkInfo.State.ENQUEUED
            r2.state = r0
            androidx.work.Data r0 = androidx.work.Data.EMPTY
            r2.input = r0
            r2.output = r0
            androidx.work.Constraints r0 = androidx.work.Constraints.NONE
            r2.constraints = r0
            androidx.work.BackoffPolicy r0 = androidx.work.BackoffPolicy.EXPONENTIAL
            r2.backoffPolicy = r0
            r0 = 30000(0x7530, double:1.4822E-319)
            r2.backoffDelayDuration = r0
            r0 = -1
            r2.scheduleRequestedAt = r0
            androidx.work.OutOfQuotaPolicy r0 = androidx.work.OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST
            r2.outOfQuotaPolicy = r0
            r2.id = r3
            r2.workerClassName = r4
            return
    }

    public long calculateNextRunTime() {
            r11 = this;
            boolean r0 = r11.isBackedOff()
            if (r0 == 0) goto L2b
            androidx.work.BackoffPolicy r0 = r11.backoffPolicy
            androidx.work.BackoffPolicy r1 = androidx.work.BackoffPolicy.LINEAR
            if (r0 != r1) goto L14
            long r0 = r11.backoffDelayDuration
            int r2 = r11.runAttemptCount
            long r2 = (long) r2
            long r0 = r0 * r2
            goto L20
        L14:
            long r0 = r11.backoffDelayDuration
            float r0 = (float) r0
            int r1 = r11.runAttemptCount
            int r1 = r1 + (-1)
            float r0 = java.lang.Math.scalb(r0, r1)
            long r0 = (long) r0
        L20:
            long r2 = r11.periodStartTime
            r4 = 18000000(0x112a880, double:8.8931816E-317)
            long r0 = java.lang.Math.min(r4, r0)
            long r2 = r2 + r0
            return r2
        L2b:
            boolean r0 = r11.isPeriodic()
            r1 = 0
            if (r0 == 0) goto L5d
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = r11.periodStartTime
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L41
            long r7 = r11.initialDelay
            long r3 = r3 + r7
            goto L42
        L41:
            r3 = r5
        L42:
            long r7 = r11.flexDuration
            long r9 = r11.intervalDuration
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 == 0) goto L55
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L52
            r0 = -1
            long r1 = r7 * r0
        L52:
            long r3 = r3 + r9
            long r3 = r3 + r1
            return r3
        L55:
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L5a
            goto L5b
        L5a:
            r1 = r9
        L5b:
            long r3 = r3 + r1
            return r3
        L5d:
            long r3 = r11.periodStartTime
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L67
            long r3 = java.lang.System.currentTimeMillis()
        L67:
            long r0 = r11.initialDelay
            long r3 = r3 + r0
            return r3
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            r1 = 0
            if (r8 == 0) goto Lbe
            java.lang.Class<androidx.work.impl.model.WorkSpec> r2 = androidx.work.impl.model.WorkSpec.class
            java.lang.Class r3 = r8.getClass()
            if (r2 == r3) goto L11
            goto Lbe
        L11:
            androidx.work.impl.model.WorkSpec r8 = (androidx.work.impl.model.WorkSpec) r8
            long r2 = r7.initialDelay
            long r4 = r8.initialDelay
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L1c
            return r1
        L1c:
            long r2 = r7.intervalDuration
            long r4 = r8.intervalDuration
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L25
            return r1
        L25:
            long r2 = r7.flexDuration
            long r4 = r8.flexDuration
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L2e
            return r1
        L2e:
            int r2 = r7.runAttemptCount
            int r3 = r8.runAttemptCount
            if (r2 == r3) goto L35
            return r1
        L35:
            long r2 = r7.backoffDelayDuration
            long r4 = r8.backoffDelayDuration
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L3e
            return r1
        L3e:
            long r2 = r7.periodStartTime
            long r4 = r8.periodStartTime
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L47
            return r1
        L47:
            long r2 = r7.minimumRetentionDuration
            long r4 = r8.minimumRetentionDuration
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L50
            return r1
        L50:
            long r2 = r7.scheduleRequestedAt
            long r4 = r8.scheduleRequestedAt
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L59
            return r1
        L59:
            boolean r2 = r7.expedited
            boolean r3 = r8.expedited
            if (r2 == r3) goto L60
            return r1
        L60:
            java.lang.String r2 = r7.id
            java.lang.String r3 = r8.id
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L6b
            return r1
        L6b:
            androidx.work.WorkInfo$State r2 = r7.state
            androidx.work.WorkInfo$State r3 = r8.state
            if (r2 == r3) goto L72
            return r1
        L72:
            java.lang.String r2 = r7.workerClassName
            java.lang.String r3 = r8.workerClassName
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L7d
            return r1
        L7d:
            java.lang.String r2 = r7.inputMergerClassName
            if (r2 == 0) goto L8a
            java.lang.String r3 = r8.inputMergerClassName
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L8f
            goto L8e
        L8a:
            java.lang.String r2 = r8.inputMergerClassName
            if (r2 == 0) goto L8f
        L8e:
            return r1
        L8f:
            androidx.work.Data r2 = r7.input
            androidx.work.Data r3 = r8.input
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L9a
            return r1
        L9a:
            androidx.work.Data r2 = r7.output
            androidx.work.Data r3 = r8.output
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto La5
            return r1
        La5:
            androidx.work.Constraints r2 = r7.constraints
            androidx.work.Constraints r3 = r8.constraints
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Lb0
            return r1
        Lb0:
            androidx.work.BackoffPolicy r2 = r7.backoffPolicy
            androidx.work.BackoffPolicy r3 = r8.backoffPolicy
            if (r2 == r3) goto Lb7
            return r1
        Lb7:
            androidx.work.OutOfQuotaPolicy r2 = r7.outOfQuotaPolicy
            androidx.work.OutOfQuotaPolicy r8 = r8.outOfQuotaPolicy
            if (r2 != r8) goto Lbe
            return r0
        Lbe:
            return r1
    }

    public boolean hasConstraints() {
            r2 = this;
            androidx.work.Constraints r0 = androidx.work.Constraints.NONE
            androidx.work.Constraints r1 = r2.constraints
            boolean r0 = r0.equals(r1)
            r0 = r0 ^ 1
            return r0
    }

    public int hashCode() {
            r6 = this;
            java.lang.String r0 = r6.id
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            androidx.work.WorkInfo$State r1 = r6.state
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r6.workerClassName
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r6.inputMergerClassName
            if (r1 == 0) goto L23
            int r1 = r1.hashCode()
            goto L24
        L23:
            r1 = 0
        L24:
            int r0 = r0 + r1
            int r0 = r0 * 31
            androidx.work.Data r1 = r6.input
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            androidx.work.Data r1 = r6.output
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            long r1 = r6.initialDelay
            r3 = 32
            long r4 = r1 >>> r3
            long r1 = r1 ^ r4
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            long r1 = r6.intervalDuration
            long r4 = r1 >>> r3
            long r1 = r1 ^ r4
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            long r1 = r6.flexDuration
            long r4 = r1 >>> r3
            long r1 = r1 ^ r4
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            androidx.work.Constraints r1 = r6.constraints
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r6.runAttemptCount
            int r0 = r0 + r1
            int r0 = r0 * 31
            androidx.work.BackoffPolicy r1 = r6.backoffPolicy
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            long r1 = r6.backoffDelayDuration
            long r4 = r1 >>> r3
            long r1 = r1 ^ r4
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            long r1 = r6.periodStartTime
            long r4 = r1 >>> r3
            long r1 = r1 ^ r4
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            long r1 = r6.minimumRetentionDuration
            long r4 = r1 >>> r3
            long r1 = r1 ^ r4
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            long r1 = r6.scheduleRequestedAt
            long r3 = r1 >>> r3
            long r1 = r1 ^ r3
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            boolean r1 = r6.expedited
            int r0 = r0 + r1
            int r0 = r0 * 31
            androidx.work.OutOfQuotaPolicy r1 = r6.outOfQuotaPolicy
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public boolean isBackedOff() {
            r2 = this;
            androidx.work.WorkInfo$State r0 = r2.state
            androidx.work.WorkInfo$State r1 = androidx.work.WorkInfo.State.ENQUEUED
            if (r0 != r1) goto Lc
            int r0 = r2.runAttemptCount
            if (r0 <= 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public boolean isPeriodic() {
            r5 = this;
            long r0 = r5.intervalDuration
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public void setBackoffDelayDuration(long r6) {
            r5 = this;
            r0 = 0
            r1 = 18000000(0x112a880, double:8.8931816E-317)
            int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r3 <= 0) goto L16
            androidx.work.Logger r6 = androidx.work.Logger.get()
            java.lang.String r7 = androidx.work.impl.model.WorkSpec.TAG
            java.lang.String r3 = "Backoff delay duration exceeds maximum value"
            java.lang.Throwable[] r4 = new java.lang.Throwable[r0]
            r6.warning(r7, r3, r4)
            r6 = r1
        L16:
            r1 = 10000(0x2710, double:4.9407E-320)
            int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r3 >= 0) goto L2a
            androidx.work.Logger r6 = androidx.work.Logger.get()
            java.lang.String r7 = androidx.work.impl.model.WorkSpec.TAG
            java.lang.String r3 = "Backoff delay duration less than minimum value"
            java.lang.Throwable[] r0 = new java.lang.Throwable[r0]
            r6.warning(r7, r3, r0)
            r6 = r1
        L2a:
            r5.backoffDelayDuration = r6
            return
    }

    public void setPeriodic(long r6) {
            r5 = this;
            r0 = 900000(0xdbba0, double:4.44659E-318)
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 >= 0) goto L23
            androidx.work.Logger r6 = androidx.work.Logger.get()
            java.lang.String r7 = androidx.work.impl.model.WorkSpec.TAG
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r2
            java.lang.String r2 = "Interval duration lesser than minimum allowed value; Changed to %s"
            java.lang.String r2 = java.lang.String.format(r2, r3)
            java.lang.Throwable[] r3 = new java.lang.Throwable[r4]
            r6.warning(r7, r2, r3)
            r6 = r0
        L23:
            r5.setPeriodic(r6, r6)
            return
    }

    public void setPeriodic(long r7, long r9) {
            r6 = this;
            r0 = 1
            r1 = 0
            r2 = 900000(0xdbba0, double:4.44659E-318)
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 >= 0) goto L23
            androidx.work.Logger r7 = androidx.work.Logger.get()
            java.lang.String r8 = androidx.work.impl.model.WorkSpec.TAG
            java.lang.Long r4 = java.lang.Long.valueOf(r2)
            java.lang.Object[] r5 = new java.lang.Object[r0]
            r5[r1] = r4
            java.lang.String r4 = "Interval duration lesser than minimum allowed value; Changed to %s"
            java.lang.String r4 = java.lang.String.format(r4, r5)
            java.lang.Throwable[] r5 = new java.lang.Throwable[r1]
            r7.warning(r8, r4, r5)
            r7 = r2
        L23:
            r2 = 300000(0x493e0, double:1.482197E-318)
            int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r4 >= 0) goto L44
            androidx.work.Logger r9 = androidx.work.Logger.get()
            java.lang.String r10 = androidx.work.impl.model.WorkSpec.TAG
            java.lang.Long r4 = java.lang.Long.valueOf(r2)
            java.lang.Object[] r5 = new java.lang.Object[r0]
            r5[r1] = r4
            java.lang.String r4 = "Flex duration lesser than minimum allowed value; Changed to %s"
            java.lang.String r4 = java.lang.String.format(r4, r5)
            java.lang.Throwable[] r5 = new java.lang.Throwable[r1]
            r9.warning(r10, r4, r5)
            r9 = r2
        L44:
            int r2 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r2 <= 0) goto L62
            androidx.work.Logger r9 = androidx.work.Logger.get()
            java.lang.String r10 = androidx.work.impl.model.WorkSpec.TAG
            java.lang.Long r2 = java.lang.Long.valueOf(r7)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r1] = r2
            java.lang.String r2 = "Flex duration greater than interval duration; Changed to %s"
            java.lang.String r0 = java.lang.String.format(r2, r0)
            java.lang.Throwable[] r1 = new java.lang.Throwable[r1]
            r9.warning(r10, r0, r1)
            r9 = r7
        L62:
            r6.intervalDuration = r7
            r6.flexDuration = r9
            return
    }

    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "{WorkSpec: "
            r0.append(r1)
            java.lang.String r1 = r2.id
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
