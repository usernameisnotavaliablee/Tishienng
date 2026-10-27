package androidx.core.app;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class BundleCompat {
    private BundleCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    public static android.os.IBinder getBinder(@androidx.annotation.NonNull android.os.Bundle r0, @androidx.annotation.Nullable java.lang.String r1) {
            android.os.IBinder r0 = r0.getBinder(r1)
            return r0
    }

    public static void putBinder(@androidx.annotation.NonNull android.os.Bundle r0, @androidx.annotation.Nullable java.lang.String r1, @androidx.annotation.Nullable android.os.IBinder r2) {
            r0.putBinder(r1, r2)
            return
    }
}
