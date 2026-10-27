package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class ZslUtil {
    private ZslUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.RequiresApi(21)
    public static boolean isCapabilitySupported(@androidx.annotation.NonNull androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r4, int r5) {
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES
            java.lang.Object r4 = r4.get(r0)
            int[] r4 = (int[]) r4
            r0 = 0
            if (r4 == 0) goto L18
            int r1 = r4.length
            r2 = 0
        Ld:
            if (r2 >= r1) goto L18
            r3 = r4[r2]
            if (r3 != r5) goto L15
            r4 = 1
            return r4
        L15:
            int r2 = r2 + 1
            goto Ld
        L18:
            return r0
    }
}
