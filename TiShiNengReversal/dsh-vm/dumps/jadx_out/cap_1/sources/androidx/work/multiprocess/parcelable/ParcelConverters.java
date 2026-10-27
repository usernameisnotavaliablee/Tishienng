package androidx.work.multiprocess.parcelable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ParcelConverters {
    private ParcelConverters() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static byte[] marshall(@androidx.annotation.NonNull android.os.Parcelable r2) {
            android.os.Parcel r0 = android.os.Parcel.obtain()
            r1 = 0
            r2.writeToParcel(r0, r1)     // Catch: java.lang.Throwable -> L10
            byte[] r2 = r0.marshall()     // Catch: java.lang.Throwable -> L10
            r0.recycle()
            return r2
        L10:
            r2 = move-exception
            r0.recycle()
            throw r2
    }

    @androidx.annotation.NonNull
    public static <T> T unmarshall(@androidx.annotation.NonNull byte[] r3, @androidx.annotation.NonNull android.os.Parcelable.Creator<T> r4) {
            android.os.Parcel r0 = android.os.Parcel.obtain()
            int r1 = r3.length     // Catch: java.lang.Throwable -> L14
            r2 = 0
            r0.unmarshall(r3, r2, r1)     // Catch: java.lang.Throwable -> L14
            r0.setDataPosition(r2)     // Catch: java.lang.Throwable -> L14
            java.lang.Object r3 = r4.createFromParcel(r0)     // Catch: java.lang.Throwable -> L14
            r0.recycle()
            return r3
        L14:
            r3 = move-exception
            r0.recycle()
            throw r3
    }
}
