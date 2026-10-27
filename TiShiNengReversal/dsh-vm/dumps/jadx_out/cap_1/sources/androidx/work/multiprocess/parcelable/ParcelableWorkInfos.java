package androidx.work.multiprocess.parcelable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"BanParcelableUsage"})
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ParcelableWorkInfos implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.work.multiprocess.parcelable.ParcelableWorkInfos> CREATOR = null;
    private final java.util.List<androidx.work.WorkInfo> mInfos;


    static {
            androidx.work.multiprocess.parcelable.ParcelableWorkInfos$1 r0 = new androidx.work.multiprocess.parcelable.ParcelableWorkInfos$1
            r0.<init>()
            androidx.work.multiprocess.parcelable.ParcelableWorkInfos.CREATOR = r0
            return
    }

    protected ParcelableWorkInfos(@androidx.annotation.NonNull android.os.Parcel r5) {
            r4 = this;
            r4.<init>()
            java.lang.Class r0 = r4.getClass()
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable[] r5 = r5.readParcelableArray(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r5.length
            r0.<init>(r1)
            r4.mInfos = r0
            int r0 = r5.length
            r1 = 0
        L19:
            if (r1 >= r0) goto L2b
            r2 = r5[r1]
            androidx.work.multiprocess.parcelable.ParcelableWorkInfo r2 = (androidx.work.multiprocess.parcelable.ParcelableWorkInfo) r2
            java.util.List<androidx.work.WorkInfo> r3 = r4.mInfos
            androidx.work.WorkInfo r2 = r2.getWorkInfo()
            r3.add(r2)
            int r1 = r1 + 1
            goto L19
        L2b:
            return
    }

    public ParcelableWorkInfos(@androidx.annotation.NonNull java.util.List<androidx.work.WorkInfo> r1) {
            r0 = this;
            r0.<init>()
            r0.mInfos = r1
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @androidx.annotation.NonNull
    public java.util.List<androidx.work.WorkInfo> getWorkInfos() {
            r1 = this;
            java.util.List<androidx.work.WorkInfo> r0 = r1.mInfos
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.NonNull android.os.Parcel r5, int r6) {
            r4 = this;
            java.util.List<androidx.work.WorkInfo> r0 = r4.mInfos
            int r0 = r0.size()
            androidx.work.multiprocess.parcelable.ParcelableWorkInfo[] r0 = new androidx.work.multiprocess.parcelable.ParcelableWorkInfo[r0]
            r1 = 0
        L9:
            java.util.List<androidx.work.WorkInfo> r2 = r4.mInfos
            int r2 = r2.size()
            if (r1 >= r2) goto L23
            androidx.work.multiprocess.parcelable.ParcelableWorkInfo r2 = new androidx.work.multiprocess.parcelable.ParcelableWorkInfo
            java.util.List<androidx.work.WorkInfo> r3 = r4.mInfos
            java.lang.Object r3 = r3.get(r1)
            androidx.work.WorkInfo r3 = (androidx.work.WorkInfo) r3
            r2.<init>(r3)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L9
        L23:
            r5.writeParcelableArray(r0, r6)
            return
    }
}
