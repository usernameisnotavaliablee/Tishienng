package androidx.work.multiprocess.parcelable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"BanParcelableUsage"})
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ParcelableResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.work.multiprocess.parcelable.ParcelableResult> CREATOR = null;
    private final androidx.work.ListenableWorker.Result mResult;


    static {
            androidx.work.multiprocess.parcelable.ParcelableResult$1 r0 = new androidx.work.multiprocess.parcelable.ParcelableResult$1
            r0.<init>()
            androidx.work.multiprocess.parcelable.ParcelableResult.CREATOR = r0
            return
    }

    public ParcelableResult(@androidx.annotation.NonNull android.os.Parcel r3) {
            r2 = this;
            r2.<init>()
            int r0 = r3.readInt()
            androidx.work.multiprocess.parcelable.ParcelableData r1 = new androidx.work.multiprocess.parcelable.ParcelableData
            r1.<init>(r3)
            androidx.work.Data r3 = r1.getData()
            androidx.work.ListenableWorker$Result r3 = intToResultType(r0, r3)
            r2.mResult = r3
            return
    }

    public ParcelableResult(@androidx.annotation.NonNull androidx.work.ListenableWorker.Result r1) {
            r0 = this;
            r0.<init>()
            r0.mResult = r1
            return
    }

    @androidx.annotation.NonNull
    private static androidx.work.ListenableWorker.Result intToResultType(int r2, @androidx.annotation.NonNull androidx.work.Data r3) {
            r0 = 1
            if (r2 != r0) goto L8
            androidx.work.ListenableWorker$Result r2 = androidx.work.ListenableWorker.Result.retry()
            return r2
        L8:
            r1 = 2
            if (r2 != r1) goto L10
            androidx.work.ListenableWorker$Result r2 = androidx.work.ListenableWorker.Result.success(r3)
            return r2
        L10:
            r1 = 3
            if (r2 != r1) goto L18
            androidx.work.ListenableWorker$Result r2 = androidx.work.ListenableWorker.Result.failure(r3)
            return r2
        L18:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            java.lang.String r2 = "Unknown result type %s"
            java.lang.String r2 = java.lang.String.format(r2, r0)
            r3.<init>(r2)
            throw r3
    }

    private static int resultTypeOf(androidx.work.ListenableWorker.Result r3) {
            boolean r0 = r3 instanceof androidx.work.ListenableWorker.Result.Retry
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            boolean r0 = r3 instanceof androidx.work.ListenableWorker.Result.Success
            if (r0 == 0) goto Lc
            r3 = 2
            return r3
        Lc:
            boolean r0 = r3 instanceof androidx.work.ListenableWorker.Result.Failure
            if (r0 == 0) goto L12
            r3 = 3
            return r3
        L12:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            java.lang.String r3 = "Unknown Result %s"
            java.lang.String r3 = java.lang.String.format(r3, r1)
            r0.<init>(r3)
            throw r0
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.work.ListenableWorker.Result getResult() {
            r1 = this;
            androidx.work.ListenableWorker$Result r0 = r1.mResult
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.NonNull android.os.Parcel r3, int r4) {
            r2 = this;
            androidx.work.ListenableWorker$Result r0 = r2.mResult
            int r0 = resultTypeOf(r0)
            r3.writeInt(r0)
            androidx.work.ListenableWorker$Result r0 = r2.mResult
            androidx.work.Data r0 = r0.getOutputData()
            androidx.work.multiprocess.parcelable.ParcelableData r1 = new androidx.work.multiprocess.parcelable.ParcelableData
            r1.<init>(r0)
            r1.writeToParcel(r3, r4)
            return
    }
}
