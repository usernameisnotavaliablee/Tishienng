package androidx.core.location;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final /* synthetic */ class m {
    public static void a(androidx.core.location.LocationListenerCompat r0, int r1) {
            return
    }

    public static void b(androidx.core.location.LocationListenerCompat r3, @androidx.annotation.NonNull java.util.List r4) {
            int r0 = r4.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L13
            java.lang.Object r2 = r4.get(r1)
            android.location.Location r2 = (android.location.Location) r2
            r3.onLocationChanged(r2)
            int r1 = r1 + 1
            goto L5
        L13:
            return
    }

    public static void c(androidx.core.location.LocationListenerCompat r0, @androidx.annotation.NonNull java.lang.String r1) {
            return
    }

    public static void d(androidx.core.location.LocationListenerCompat r0, @androidx.annotation.NonNull java.lang.String r1) {
            return
    }

    public static void e(androidx.core.location.LocationListenerCompat r0, @androidx.annotation.NonNull java.lang.String r1, int r2, @androidx.annotation.Nullable android.os.Bundle r3) {
            return
    }
}
