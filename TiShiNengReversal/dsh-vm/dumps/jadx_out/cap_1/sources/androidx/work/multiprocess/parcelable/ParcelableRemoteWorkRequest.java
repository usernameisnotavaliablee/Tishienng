package androidx.work.multiprocess.parcelable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"BanParcelableUsage"})
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ParcelableRemoteWorkRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.work.multiprocess.parcelable.ParcelableRemoteWorkRequest> CREATOR = null;
    private final androidx.work.multiprocess.parcelable.ParcelableWorkerParameters mParcelableWorkerParameters;
    private final java.lang.String mWorkerClassName;


    static {
            androidx.work.multiprocess.parcelable.ParcelableRemoteWorkRequest$1 r0 = new androidx.work.multiprocess.parcelable.ParcelableRemoteWorkRequest$1
            r0.<init>()
            androidx.work.multiprocess.parcelable.ParcelableRemoteWorkRequest.CREATOR = r0
            return
    }

    protected ParcelableRemoteWorkRequest(@androidx.annotation.NonNull android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = r2.readString()
            r1.mWorkerClassName = r0
            androidx.work.multiprocess.parcelable.ParcelableWorkerParameters r0 = new androidx.work.multiprocess.parcelable.ParcelableWorkerParameters
            r0.<init>(r2)
            r1.mParcelableWorkerParameters = r0
            return
    }

    public ParcelableRemoteWorkRequest(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull androidx.work.WorkerParameters r2) {
            r0 = this;
            r0.<init>()
            r0.mWorkerClassName = r1
            androidx.work.multiprocess.parcelable.ParcelableWorkerParameters r1 = new androidx.work.multiprocess.parcelable.ParcelableWorkerParameters
            r1.<init>(r2)
            r0.mParcelableWorkerParameters = r1
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.work.multiprocess.parcelable.ParcelableWorkerParameters getParcelableWorkerParameters() {
            r1 = this;
            androidx.work.multiprocess.parcelable.ParcelableWorkerParameters r0 = r1.mParcelableWorkerParameters
            return r0
    }

    @androidx.annotation.NonNull
    public java.lang.String getWorkerClassName() {
            r1 = this;
            java.lang.String r0 = r1.mWorkerClassName
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.NonNull android.os.Parcel r2, int r3) {
            r1 = this;
            java.lang.String r0 = r1.mWorkerClassName
            r2.writeString(r0)
            androidx.work.multiprocess.parcelable.ParcelableWorkerParameters r0 = r1.mParcelableWorkerParameters
            r0.writeToParcel(r2, r3)
            return
    }
}
