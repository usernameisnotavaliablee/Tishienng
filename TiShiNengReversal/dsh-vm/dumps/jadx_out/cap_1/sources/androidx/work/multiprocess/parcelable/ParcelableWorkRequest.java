package androidx.work.multiprocess.parcelable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"BanParcelableUsage"})
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ParcelableWorkRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.work.multiprocess.parcelable.ParcelableWorkRequest> CREATOR = null;
    private final androidx.work.WorkRequest mWorkRequest;


    static {
            androidx.work.multiprocess.parcelable.ParcelableWorkRequest$1 r0 = new androidx.work.multiprocess.parcelable.ParcelableWorkRequest$1
            r0.<init>()
            androidx.work.multiprocess.parcelable.ParcelableWorkRequest.CREATOR = r0
            return
    }

    protected ParcelableWorkRequest(@androidx.annotation.NonNull android.os.Parcel r7) {
            r6 = this;
            r6.<init>()
            java.lang.String r0 = r7.readString()
            java.util.HashSet r1 = new java.util.HashSet
            java.util.ArrayList r2 = r7.createStringArrayList()
            r1.<init>(r2)
            java.lang.String r2 = r7.readString()
            androidx.work.impl.model.WorkSpec r3 = new androidx.work.impl.model.WorkSpec
            r3.<init>(r0, r2)
            java.lang.String r2 = r7.readString()
            r3.inputMergerClassName = r2
            int r2 = r7.readInt()
            androidx.work.WorkInfo$State r2 = androidx.work.impl.model.WorkTypeConverters.intToState(r2)
            r3.state = r2
            androidx.work.multiprocess.parcelable.ParcelableData r2 = new androidx.work.multiprocess.parcelable.ParcelableData
            r2.<init>(r7)
            androidx.work.Data r2 = r2.getData()
            r3.input = r2
            androidx.work.multiprocess.parcelable.ParcelableData r2 = new androidx.work.multiprocess.parcelable.ParcelableData
            r2.<init>(r7)
            androidx.work.Data r2 = r2.getData()
            r3.output = r2
            long r4 = r7.readLong()
            r3.initialDelay = r4
            long r4 = r7.readLong()
            r3.intervalDuration = r4
            long r4 = r7.readLong()
            r3.flexDuration = r4
            int r2 = r7.readInt()
            r3.runAttemptCount = r2
            java.lang.Class r2 = r6.getClass()
            java.lang.ClassLoader r2 = r2.getClassLoader()
            android.os.Parcelable r2 = r7.readParcelable(r2)
            androidx.work.multiprocess.parcelable.ParcelableConstraints r2 = (androidx.work.multiprocess.parcelable.ParcelableConstraints) r2
            androidx.work.Constraints r2 = r2.getConstraints()
            r3.constraints = r2
            int r2 = r7.readInt()
            androidx.work.BackoffPolicy r2 = androidx.work.impl.model.WorkTypeConverters.intToBackoffPolicy(r2)
            r3.backoffPolicy = r2
            long r4 = r7.readLong()
            r3.backoffDelayDuration = r4
            long r4 = r7.readLong()
            r3.minimumRetentionDuration = r4
            long r4 = r7.readLong()
            r3.scheduleRequestedAt = r4
            boolean r2 = androidx.work.multiprocess.parcelable.ParcelUtils.readBooleanValue(r7)
            r3.expedited = r2
            int r7 = r7.readInt()
            androidx.work.OutOfQuotaPolicy r7 = androidx.work.impl.model.WorkTypeConverters.intToOutOfQuotaPolicy(r7)
            r3.outOfQuotaPolicy = r7
            androidx.work.impl.WorkRequestHolder r7 = new androidx.work.impl.WorkRequestHolder
            java.util.UUID r0 = java.util.UUID.fromString(r0)
            r7.<init>(r0, r3, r1)
            r6.mWorkRequest = r7
            return
    }

    public ParcelableWorkRequest(@androidx.annotation.NonNull androidx.work.WorkRequest r1) {
            r0 = this;
            r0.<init>()
            r0.mWorkRequest = r1
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.work.WorkRequest getWorkRequest() {
            r1 = this;
            androidx.work.WorkRequest r0 = r1.mWorkRequest
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.NonNull android.os.Parcel r4, int r5) {
            r3 = this;
            androidx.work.WorkRequest r0 = r3.mWorkRequest
            java.lang.String r0 = r0.getStringId()
            r4.writeString(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            androidx.work.WorkRequest r1 = r3.mWorkRequest
            java.util.Set r1 = r1.getTags()
            r0.<init>(r1)
            r4.writeStringList(r0)
            androidx.work.WorkRequest r0 = r3.mWorkRequest
            androidx.work.impl.model.WorkSpec r0 = r0.getWorkSpec()
            java.lang.String r1 = r0.workerClassName
            r4.writeString(r1)
            java.lang.String r1 = r0.inputMergerClassName
            r4.writeString(r1)
            androidx.work.WorkInfo$State r1 = r0.state
            int r1 = androidx.work.impl.model.WorkTypeConverters.stateToInt(r1)
            r4.writeInt(r1)
            androidx.work.multiprocess.parcelable.ParcelableData r1 = new androidx.work.multiprocess.parcelable.ParcelableData
            androidx.work.Data r2 = r0.input
            r1.<init>(r2)
            r1.writeToParcel(r4, r5)
            androidx.work.multiprocess.parcelable.ParcelableData r1 = new androidx.work.multiprocess.parcelable.ParcelableData
            androidx.work.Data r2 = r0.output
            r1.<init>(r2)
            r1.writeToParcel(r4, r5)
            long r1 = r0.initialDelay
            r4.writeLong(r1)
            long r1 = r0.intervalDuration
            r4.writeLong(r1)
            long r1 = r0.flexDuration
            r4.writeLong(r1)
            int r1 = r0.runAttemptCount
            r4.writeInt(r1)
            androidx.work.multiprocess.parcelable.ParcelableConstraints r1 = new androidx.work.multiprocess.parcelable.ParcelableConstraints
            androidx.work.Constraints r2 = r0.constraints
            r1.<init>(r2)
            r4.writeParcelable(r1, r5)
            androidx.work.BackoffPolicy r5 = r0.backoffPolicy
            int r5 = androidx.work.impl.model.WorkTypeConverters.backoffPolicyToInt(r5)
            r4.writeInt(r5)
            long r1 = r0.backoffDelayDuration
            r4.writeLong(r1)
            long r1 = r0.minimumRetentionDuration
            r4.writeLong(r1)
            long r1 = r0.scheduleRequestedAt
            r4.writeLong(r1)
            boolean r5 = r0.expedited
            androidx.work.multiprocess.parcelable.ParcelUtils.writeBooleanValue(r4, r5)
            androidx.work.OutOfQuotaPolicy r5 = r0.outOfQuotaPolicy
            int r5 = androidx.work.impl.model.WorkTypeConverters.outOfQuotaPolicyToInt(r5)
            r4.writeInt(r5)
            return
    }
}
