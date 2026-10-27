package androidx.camera.camera2.internal.compat.quirk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ImageCaptureFailWithAutoFlashQuirk implements androidx.camera.core.impl.Quirk {
    private static final java.util.List<java.lang.String> BUILD_MODELS_FRONT_CAMERA = null;

    static {
            java.lang.String r0 = "sm-j700f"
            java.lang.String r1 = "sm-j710f"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.List r0 = java.util.Arrays.asList(r0)
            androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk.BUILD_MODELS_FRONT_CAMERA = r0
            return
    }

    public ImageCaptureFailWithAutoFlashQuirk() {
            r0 = this;
            r0.<init>()
            return
    }

    static boolean load(@androidx.annotation.NonNull androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r3) {
            java.util.List<java.lang.String> r0 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk.BUILD_MODELS_FRONT_CAMERA
            java.lang.String r1 = android.os.Build.MODEL
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r2)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L20
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r3 = r3.get(r0)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r3 != 0) goto L20
            r3 = 1
            return r3
        L20:
            r3 = 0
            return r3
    }
}
