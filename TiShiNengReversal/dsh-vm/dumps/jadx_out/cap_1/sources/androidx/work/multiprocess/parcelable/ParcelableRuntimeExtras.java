package androidx.work.multiprocess.parcelable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"BanParcelableUsage"})
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ParcelableRuntimeExtras implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.work.multiprocess.parcelable.ParcelableRuntimeExtras> CREATOR = null;
    private androidx.work.WorkerParameters.RuntimeExtras mRuntimeExtras;


    static {
            androidx.work.multiprocess.parcelable.ParcelableRuntimeExtras$1 r0 = new androidx.work.multiprocess.parcelable.ParcelableRuntimeExtras$1
            r0.<init>()
            androidx.work.multiprocess.parcelable.ParcelableRuntimeExtras.CREATOR = r0
            return
    }

    public ParcelableRuntimeExtras(@androidx.annotation.NonNull android.os.Parcel r8) {
            r7 = this;
            r7.<init>()
            java.lang.Class r0 = r7.getClass()
            java.lang.ClassLoader r0 = r0.getClassLoader()
            boolean r1 = androidx.work.multiprocess.parcelable.ParcelUtils.readBooleanValue(r8)
            r2 = 0
            if (r1 == 0) goto L19
            android.os.Parcelable r1 = r8.readParcelable(r0)
            android.net.Network r1 = (android.net.Network) r1
            goto L1a
        L19:
            r1 = r2
        L1a:
            boolean r3 = androidx.work.multiprocess.parcelable.ParcelUtils.readBooleanValue(r8)
            if (r3 == 0) goto L38
            android.os.Parcelable[] r0 = r8.readParcelableArray(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r0.length
            r3.<init>(r4)
            int r4 = r0.length
            r5 = 0
        L2c:
            if (r5 >= r4) goto L39
            r6 = r0[r5]
            android.net.Uri r6 = (android.net.Uri) r6
            r3.add(r6)
            int r5 = r5 + 1
            goto L2c
        L38:
            r3 = r2
        L39:
            boolean r0 = androidx.work.multiprocess.parcelable.ParcelUtils.readBooleanValue(r8)
            if (r0 == 0) goto L43
            java.util.ArrayList r2 = r8.createStringArrayList()
        L43:
            androidx.work.WorkerParameters$RuntimeExtras r8 = new androidx.work.WorkerParameters$RuntimeExtras
            r8.<init>()
            r7.mRuntimeExtras = r8
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r0 < r4) goto L52
            r8.network = r1
        L52:
            r1 = 24
            if (r0 < r1) goto L5e
            if (r3 == 0) goto L5a
            r8.triggeredContentUris = r3
        L5a:
            if (r2 == 0) goto L5e
            r8.triggeredContentAuthorities = r2
        L5e:
            return
    }

    public ParcelableRuntimeExtras(@androidx.annotation.NonNull androidx.work.WorkerParameters.RuntimeExtras r1) {
            r0 = this;
            r0.<init>()
            r0.mRuntimeExtras = r1
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.work.WorkerParameters.RuntimeExtras getRuntimeExtras() {
            r1 = this;
            androidx.work.WorkerParameters$RuntimeExtras r0 = r1.mRuntimeExtras
            return r0
    }

    @Override // android.os.Parcelable
    @android.annotation.SuppressLint({"NewApi"})
    public void writeToParcel(@androidx.annotation.NonNull android.os.Parcel r9, int r10) {
            r8 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            r2 = 0
            if (r0 < r1) goto Lc
            androidx.work.WorkerParameters$RuntimeExtras r1 = r8.mRuntimeExtras
            android.net.Network r1 = r1.network
            goto Ld
        Lc:
            r1 = r2
        Ld:
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L13
            r5 = 1
            goto L14
        L13:
            r5 = 0
        L14:
            androidx.work.multiprocess.parcelable.ParcelUtils.writeBooleanValue(r9, r5)
            if (r5 == 0) goto L1c
            r9.writeParcelable(r1, r10)
        L1c:
            r1 = 24
            if (r0 < r1) goto L27
            androidx.work.WorkerParameters$RuntimeExtras r0 = r8.mRuntimeExtras
            java.util.List<android.net.Uri> r2 = r0.triggeredContentUris
            java.util.List<java.lang.String> r0 = r0.triggeredContentAuthorities
            goto L28
        L27:
            r0 = r2
        L28:
            if (r2 == 0) goto L32
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L32
            r1 = 1
            goto L33
        L32:
            r1 = 0
        L33:
            androidx.work.multiprocess.parcelable.ParcelUtils.writeBooleanValue(r9, r1)
            if (r1 == 0) goto L4f
            int r1 = r2.size()
            android.net.Uri[] r5 = new android.net.Uri[r1]
            r6 = 0
        L3f:
            if (r6 >= r1) goto L4c
            java.lang.Object r7 = r2.get(r6)
            android.net.Uri r7 = (android.net.Uri) r7
            r5[r6] = r7
            int r6 = r6 + 1
            goto L3f
        L4c:
            r9.writeParcelableArray(r5, r10)
        L4f:
            if (r0 == 0) goto L58
            boolean r10 = r0.isEmpty()
            if (r10 != 0) goto L58
            r3 = 1
        L58:
            androidx.work.multiprocess.parcelable.ParcelUtils.writeBooleanValue(r9, r3)
            if (r3 == 0) goto L60
            r9.writeStringList(r0)
        L60:
            return
    }
}
