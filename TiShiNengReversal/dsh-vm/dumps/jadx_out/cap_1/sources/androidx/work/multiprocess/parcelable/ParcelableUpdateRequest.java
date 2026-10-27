package androidx.work.multiprocess.parcelable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"BanParcelableUsage"})
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ParcelableUpdateRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.work.multiprocess.parcelable.ParcelableUpdateRequest> CREATOR = null;
    private final java.lang.String mId;
    private final androidx.work.multiprocess.parcelable.ParcelableData mParcelableData;


    static {
            androidx.work.multiprocess.parcelable.ParcelableUpdateRequest$1 r0 = new androidx.work.multiprocess.parcelable.ParcelableUpdateRequest$1
            r0.<init>()
            androidx.work.multiprocess.parcelable.ParcelableUpdateRequest.CREATOR = r0
            return
    }

    protected ParcelableUpdateRequest(@androidx.annotation.NonNull android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = r2.readString()
            r1.mId = r0
            androidx.work.multiprocess.parcelable.ParcelableData r0 = new androidx.work.multiprocess.parcelable.ParcelableData
            r0.<init>(r2)
            r1.mParcelableData = r0
            return
    }

    public ParcelableUpdateRequest(@androidx.annotation.NonNull java.util.UUID r1, @androidx.annotation.NonNull androidx.work.Data r2) {
            r0 = this;
            r0.<init>()
            java.lang.String r1 = r1.toString()
            r0.mId = r1
            androidx.work.multiprocess.parcelable.ParcelableData r1 = new androidx.work.multiprocess.parcelable.ParcelableData
            r1.<init>(r2)
            r0.mParcelableData = r1
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
            androidx.work.multiprocess.parcelable.ParcelableData r0 = r1.mParcelableData
            androidx.work.Data r0 = r0.getData()
            return r0
    }

    @androidx.annotation.NonNull
    public java.lang.String getId() {
            r1 = this;
            java.lang.String r0 = r1.mId
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.NonNull android.os.Parcel r2, int r3) {
            r1 = this;
            java.lang.String r0 = r1.mId
            r2.writeString(r0)
            androidx.work.multiprocess.parcelable.ParcelableData r0 = r1.mParcelableData
            r0.writeToParcel(r2, r3)
            return
    }
}
