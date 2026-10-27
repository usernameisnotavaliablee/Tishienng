package androidx.work.multiprocess.parcelable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ParcelUtils {
    private ParcelUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean readBooleanValue(@androidx.annotation.NonNull android.os.Parcel r1) {
            int r1 = r1.readInt()
            r0 = 1
            if (r1 != r0) goto L8
            return r0
        L8:
            r1 = 0
            return r1
    }

    public static void writeBooleanValue(@androidx.annotation.NonNull android.os.Parcel r0, boolean r1) {
            r0.writeInt(r1)
            return
    }
}
