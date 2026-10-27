package androidx.camera.camera2.internal.compat.quirk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class AspectRatioLegacyApi21Quirk implements androidx.camera.core.impl.Quirk {
    public AspectRatioLegacyApi21Quirk() {
            r0 = this;
            r0.<init>()
            return
    }

    static boolean load(@androidx.annotation.NonNull androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r1) {
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL
            java.lang.Object r1 = r1.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L19
            int r1 = r1.intValue()
            r0 = 2
            if (r1 != r0) goto L19
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 != r0) goto L19
            r1 = 1
            return r1
        L19:
            r1 = 0
            return r1
    }

    public int getCorrectedAspectRatio() {
            r1 = this;
            r0 = 2
            return r0
    }
}
