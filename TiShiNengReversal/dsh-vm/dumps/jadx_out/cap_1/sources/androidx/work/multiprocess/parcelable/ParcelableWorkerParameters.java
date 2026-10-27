package androidx.work.multiprocess.parcelable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"BanParcelableUsage"})
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ParcelableWorkerParameters implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.work.multiprocess.parcelable.ParcelableWorkerParameters> CREATOR = null;

    @androidx.annotation.NonNull
    private final androidx.work.Data mData;

    @androidx.annotation.NonNull
    private final java.util.UUID mId;
    private final int mRunAttemptCount;

    @androidx.annotation.NonNull
    private final androidx.work.WorkerParameters.RuntimeExtras mRuntimeExtras;

    @androidx.annotation.NonNull
    private final java.util.Set<java.lang.String> mTags;


    static {
            androidx.work.multiprocess.parcelable.ParcelableWorkerParameters$1 r0 = new androidx.work.multiprocess.parcelable.ParcelableWorkerParameters$1
            r0.<init>()
            androidx.work.multiprocess.parcelable.ParcelableWorkerParameters.CREATOR = r0
            return
    }

    public ParcelableWorkerParameters(@androidx.annotation.NonNull android.os.Parcel r3) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = r3.readString()
            java.util.UUID r0 = java.util.UUID.fromString(r0)
            r2.mId = r0
            androidx.work.multiprocess.parcelable.ParcelableData r0 = new androidx.work.multiprocess.parcelable.ParcelableData
            r0.<init>(r3)
            androidx.work.Data r0 = r0.getData()
            r2.mData = r0
            java.util.HashSet r0 = new java.util.HashSet
            java.util.ArrayList r1 = r3.createStringArrayList()
            r0.<init>(r1)
            r2.mTags = r0
            androidx.work.multiprocess.parcelable.ParcelableRuntimeExtras r0 = new androidx.work.multiprocess.parcelable.ParcelableRuntimeExtras
            r0.<init>(r3)
            androidx.work.WorkerParameters$RuntimeExtras r0 = r0.getRuntimeExtras()
            r2.mRuntimeExtras = r0
            int r3 = r3.readInt()
            r2.mRunAttemptCount = r3
            return
    }

    public ParcelableWorkerParameters(@androidx.annotation.NonNull androidx.work.WorkerParameters r2) {
            r1 = this;
            r1.<init>()
            java.util.UUID r0 = r2.getId()
            r1.mId = r0
            androidx.work.Data r0 = r2.getInputData()
            r1.mData = r0
            java.util.Set r0 = r2.getTags()
            r1.mTags = r0
            androidx.work.WorkerParameters$RuntimeExtras r0 = r2.getRuntimeExtras()
            r1.mRuntimeExtras = r0
            int r2 = r2.getRunAttemptCount()
            r1.mRunAttemptCount = r2
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.work.Data getData() {
            r1 = this;
            androidx.work.Data r0 = r1.mData
            return r0
    }

    @androidx.annotation.NonNull
    public java.util.UUID getId() {
            r1 = this;
            java.util.UUID r0 = r1.mId
            return r0
    }

    public int getRunAttemptCount() {
            r1 = this;
            int r0 = r1.mRunAttemptCount
            return r0
    }

    @androidx.annotation.NonNull
    public java.util.Set<java.lang.String> getTags() {
            r1 = this;
            java.util.Set<java.lang.String> r0 = r1.mTags
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.work.WorkerParameters toWorkerParameters(@androidx.annotation.NonNull androidx.work.impl.WorkManagerImpl r14) {
            r13 = this;
            androidx.work.Configuration r0 = r14.getConfiguration()
            androidx.work.impl.WorkDatabase r1 = r14.getWorkDatabase()
            androidx.work.impl.utils.taskexecutor.TaskExecutor r9 = r14.getWorkTaskExecutor()
            androidx.work.impl.Processor r14 = r14.getProcessor()
            androidx.work.WorkerParameters r2 = new androidx.work.WorkerParameters
            java.util.UUID r3 = r13.mId
            androidx.work.Data r4 = r13.mData
            java.util.Set<java.lang.String> r5 = r13.mTags
            androidx.work.WorkerParameters$RuntimeExtras r6 = r13.mRuntimeExtras
            int r7 = r13.mRunAttemptCount
            java.util.concurrent.Executor r8 = r0.getExecutor()
            androidx.work.WorkerFactory r10 = r0.getWorkerFactory()
            androidx.work.impl.utils.WorkProgressUpdater r11 = new androidx.work.impl.utils.WorkProgressUpdater
            r11.<init>(r1, r9)
            androidx.work.impl.utils.WorkForegroundUpdater r12 = new androidx.work.impl.utils.WorkForegroundUpdater
            r12.<init>(r1, r14, r9)
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r2
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.NonNull android.os.Parcel r3, int r4) {
            r2 = this;
            java.util.UUID r0 = r2.mId
            java.lang.String r0 = r0.toString()
            r3.writeString(r0)
            androidx.work.multiprocess.parcelable.ParcelableData r0 = new androidx.work.multiprocess.parcelable.ParcelableData
            androidx.work.Data r1 = r2.mData
            r0.<init>(r1)
            r0.writeToParcel(r3, r4)
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.Set<java.lang.String> r1 = r2.mTags
            r0.<init>(r1)
            r3.writeStringList(r0)
            androidx.work.multiprocess.parcelable.ParcelableRuntimeExtras r0 = new androidx.work.multiprocess.parcelable.ParcelableRuntimeExtras
            androidx.work.WorkerParameters$RuntimeExtras r1 = r2.mRuntimeExtras
            r0.<init>(r1)
            r0.writeToParcel(r3, r4)
            int r4 = r2.mRunAttemptCount
            r3.writeInt(r4)
            return
    }
}
