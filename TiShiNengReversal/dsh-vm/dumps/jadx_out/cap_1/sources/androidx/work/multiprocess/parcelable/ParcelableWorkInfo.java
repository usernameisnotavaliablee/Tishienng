package androidx.work.multiprocess.parcelable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"BanParcelableUsage"})
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ParcelableWorkInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.work.multiprocess.parcelable.ParcelableWorkInfo> CREATOR = null;
    private static final java.lang.String[] sEMPTY = null;
    private final androidx.work.WorkInfo mWorkInfo;


    static {
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            androidx.work.multiprocess.parcelable.ParcelableWorkInfo.sEMPTY = r0
            androidx.work.multiprocess.parcelable.ParcelableWorkInfo$1 r0 = new androidx.work.multiprocess.parcelable.ParcelableWorkInfo$1
            r0.<init>()
            androidx.work.multiprocess.parcelable.ParcelableWorkInfo.CREATOR = r0
            return
    }

    protected ParcelableWorkInfo(@androidx.annotation.NonNull android.os.Parcel r9) {
            r8 = this;
            r8.<init>()
            java.lang.String r0 = r9.readString()
            java.util.UUID r2 = java.util.UUID.fromString(r0)
            int r0 = r9.readInt()
            androidx.work.WorkInfo$State r3 = androidx.work.impl.model.WorkTypeConverters.intToState(r0)
            androidx.work.multiprocess.parcelable.ParcelableData r0 = new androidx.work.multiprocess.parcelable.ParcelableData
            r0.<init>(r9)
            androidx.work.Data r4 = r0.getData()
            java.lang.String[] r0 = r9.createStringArray()
            java.util.List r5 = java.util.Arrays.asList(r0)
            androidx.work.multiprocess.parcelable.ParcelableData r0 = new androidx.work.multiprocess.parcelable.ParcelableData
            r0.<init>(r9)
            androidx.work.Data r6 = r0.getData()
            int r7 = r9.readInt()
            androidx.work.WorkInfo r1 = new androidx.work.WorkInfo
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.mWorkInfo = r1
            return
    }

    public ParcelableWorkInfo(@androidx.annotation.NonNull androidx.work.WorkInfo r1) {
            r0 = this;
            r0.<init>()
            r0.mWorkInfo = r1
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.work.WorkInfo getWorkInfo() {
            r1 = this;
            androidx.work.WorkInfo r0 = r1.mWorkInfo
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.NonNull android.os.Parcel r3, int r4) {
            r2 = this;
            androidx.work.WorkInfo r0 = r2.mWorkInfo
            java.util.UUID r0 = r0.getId()
            java.lang.String r0 = r0.toString()
            r3.writeString(r0)
            androidx.work.WorkInfo r0 = r2.mWorkInfo
            androidx.work.WorkInfo$State r0 = r0.getState()
            int r0 = androidx.work.impl.model.WorkTypeConverters.stateToInt(r0)
            r3.writeInt(r0)
            androidx.work.multiprocess.parcelable.ParcelableData r0 = new androidx.work.multiprocess.parcelable.ParcelableData
            androidx.work.WorkInfo r1 = r2.mWorkInfo
            androidx.work.Data r1 = r1.getOutputData()
            r0.<init>(r1)
            r0.writeToParcel(r3, r4)
            java.util.ArrayList r0 = new java.util.ArrayList
            androidx.work.WorkInfo r1 = r2.mWorkInfo
            java.util.Set r1 = r1.getTags()
            r0.<init>(r1)
            java.lang.String[] r1 = androidx.work.multiprocess.parcelable.ParcelableWorkInfo.sEMPTY
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r3.writeStringArray(r0)
            androidx.work.multiprocess.parcelable.ParcelableData r0 = new androidx.work.multiprocess.parcelable.ParcelableData
            androidx.work.WorkInfo r1 = r2.mWorkInfo
            androidx.work.Data r1 = r1.getProgress()
            r0.<init>(r1)
            r0.writeToParcel(r3, r4)
            androidx.work.WorkInfo r4 = r2.mWorkInfo
            int r4 = r4.getRunAttemptCount()
            r3.writeInt(r4)
            return
    }
}
