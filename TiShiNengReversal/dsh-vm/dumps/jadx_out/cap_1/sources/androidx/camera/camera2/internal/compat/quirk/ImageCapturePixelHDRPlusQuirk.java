package androidx.camera.camera2.internal.compat.quirk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ImageCapturePixelHDRPlusQuirk implements androidx.camera.core.impl.Quirk {
    public static final java.util.List<java.lang.String> BUILD_MODELS = null;

    static {
            java.lang.String r0 = "Pixel 3"
            java.lang.String r1 = "Pixel 3 XL"
            java.lang.String r2 = "Pixel 2"
            java.lang.String r3 = "Pixel 2 XL"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r0, r1}
            java.util.List r0 = java.util.Arrays.asList(r0)
            androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk.BUILD_MODELS = r0
            return
    }

    public ImageCapturePixelHDRPlusQuirk() {
            r0 = this;
            r0.<init>()
            return
    }

    static boolean load() {
            java.util.List<java.lang.String> r0 = androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk.BUILD_MODELS
            java.lang.String r1 = android.os.Build.MODEL
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L1c
            java.lang.String r0 = "Google"
            java.lang.String r1 = android.os.Build.MANUFACTURER
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1c
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L1c
            r0 = 1
            return r0
        L1c:
            r0 = 0
            return r0
    }
}
