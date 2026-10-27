package androidx.work.multiprocess.parcelable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"BanParcelableUsage"})
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ParcelableWorkRequests implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.work.multiprocess.parcelable.ParcelableWorkRequests> CREATOR = null;
    private final java.util.List<androidx.work.WorkRequest> mRequests;


    static {
            androidx.work.multiprocess.parcelable.ParcelableWorkRequests$1 r0 = new androidx.work.multiprocess.parcelable.ParcelableWorkRequests$1
            r0.<init>()
            androidx.work.multiprocess.parcelable.ParcelableWorkRequests.CREATOR = r0
            return
    }

    protected ParcelableWorkRequests(@androidx.annotation.NonNull android.os.Parcel r5) {
            r4 = this;
            r4.<init>()
            java.lang.Class r0 = r4.getClass()
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable[] r5 = r5.readParcelableArray(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r5.length
            r0.<init>(r1)
            r4.mRequests = r0
            int r0 = r5.length
            r1 = 0
        L19:
            if (r1 >= r0) goto L2b
            r2 = r5[r1]
            androidx.work.multiprocess.parcelable.ParcelableWorkRequest r2 = (androidx.work.multiprocess.parcelable.ParcelableWorkRequest) r2
            java.util.List<androidx.work.WorkRequest> r3 = r4.mRequests
            androidx.work.WorkRequest r2 = r2.getWorkRequest()
            r3.add(r2)
            int r1 = r1 + 1
            goto L19
        L2b:
            return
    }

    public ParcelableWorkRequests(@androidx.annotation.NonNull java.util.List<androidx.work.WorkRequest> r1) {
            r0 = this;
            r0.<init>()
            r0.mRequests = r1
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @androidx.annotation.NonNull
    public java.util.List<androidx.work.WorkRequest> getRequests() {
            r1 = this;
            java.util.List<androidx.work.WorkRequest> r0 = r1.mRequests
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.NonNull android.os.Parcel r5, int r6) {
            r4 = this;
            java.util.List<androidx.work.WorkRequest> r0 = r4.mRequests
            int r0 = r0.size()
            androidx.work.multiprocess.parcelable.ParcelableWorkRequest[] r0 = new androidx.work.multiprocess.parcelable.ParcelableWorkRequest[r0]
            r1 = 0
        L9:
            java.util.List<androidx.work.WorkRequest> r2 = r4.mRequests
            int r2 = r2.size()
            if (r1 >= r2) goto L23
            androidx.work.multiprocess.parcelable.ParcelableWorkRequest r2 = new androidx.work.multiprocess.parcelable.ParcelableWorkRequest
            java.util.List<androidx.work.WorkRequest> r3 = r4.mRequests
            java.lang.Object r3 = r3.get(r1)
            androidx.work.WorkRequest r3 = (androidx.work.WorkRequest) r3
            r2.<init>(r3)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L9
        L23:
            r5.writeParcelableArray(r0, r6)
            return
    }
}
