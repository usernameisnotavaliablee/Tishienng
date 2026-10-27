package androidx.camera.camera2.internal.compat.quirk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ImageCaptureWashedOutImageQuirk implements androidx.camera.camera2.internal.compat.quirk.UseTorchAsFlashQuirk {

    @androidx.annotation.VisibleForTesting
    public static final java.util.List<java.lang.String> BUILD_MODELS = null;

    static {
            java.lang.String r15 = "SM-G935U"
            java.lang.String r16 = "SM-G935P"
            java.lang.String r1 = "SM-G9300"
            java.lang.String r2 = "SM-G930R"
            java.lang.String r3 = "SM-G930A"
            java.lang.String r4 = "SM-G930V"
            java.lang.String r5 = "SM-G930T"
            java.lang.String r6 = "SM-G930U"
            java.lang.String r7 = "SM-G930P"
            java.lang.String r8 = "SM-SC02H"
            java.lang.String r9 = "SM-SCV33"
            java.lang.String r10 = "SM-G9350"
            java.lang.String r11 = "SM-G935R"
            java.lang.String r12 = "SM-G935A"
            java.lang.String r13 = "SM-G935V"
            java.lang.String r14 = "SM-G935T"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16}
            java.util.List r0 = java.util.Arrays.asList(r0)
            androidx.camera.camera2.internal.compat.quirk.ImageCaptureWashedOutImageQuirk.BUILD_MODELS = r0
            return
    }

    public ImageCaptureWashedOutImageQuirk() {
            r0 = this;
            r0.<init>()
            return
    }

    static boolean load(@androidx.annotation.NonNull androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r3) {
            java.util.List<java.lang.String> r0 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureWashedOutImageQuirk.BUILD_MODELS
            java.lang.String r1 = android.os.Build.MODEL
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r1 = r1.toUpperCase(r2)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L20
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r3 = r3.get(r0)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0 = 1
            if (r3 != r0) goto L20
            return r0
        L20:
            r3 = 0
            return r3
    }
}
