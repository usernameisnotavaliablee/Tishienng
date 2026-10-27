package androidx.camera.camera2.internal.compat.workaround;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class PreviewPixelHDRnet {
    public static final android.util.Rational ASPECT_RATIO_16_9 = null;

    static {
            android.util.Rational r0 = new android.util.Rational
            r1 = 16
            r2 = 9
            r0.<init>(r1, r2)
            androidx.camera.camera2.internal.compat.workaround.PreviewPixelHDRnet.ASPECT_RATIO_16_9 = r0
            return
    }

    private PreviewPixelHDRnet() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean isAspectRatioMatch(@androidx.annotation.NonNull android.util.Size r2, @androidx.annotation.NonNull android.util.Rational r3) {
            android.util.Rational r0 = new android.util.Rational
            int r1 = r2.getWidth()
            int r2 = r2.getHeight()
            r0.<init>(r1, r2)
            boolean r2 = r3.equals(r0)
            return r2
    }

    @androidx.annotation.OptIn(markerClass = {androidx.camera.camera2.interop.ExperimentalCamera2Interop.class})
    public static void setHDRnet(@androidx.annotation.NonNull android.util.Size r2, @androidx.annotation.NonNull androidx.camera.core.impl.SessionConfig.Builder r3) {
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk> r0 = androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk.class
            androidx.camera.core.impl.Quirk r0 = androidx.camera.camera2.internal.compat.quirk.DeviceQuirks.get(r0)
            androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk r0 = (androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk) r0
            if (r0 != 0) goto Lb
            goto L13
        Lb:
            android.util.Rational r0 = androidx.camera.camera2.internal.compat.workaround.PreviewPixelHDRnet.ASPECT_RATIO_16_9
            boolean r2 = isAspectRatioMatch(r2, r0)
            if (r2 == 0) goto L14
        L13:
            return
        L14:
            androidx.camera.camera2.impl.Camera2ImplConfig$Builder r2 = new androidx.camera.camera2.impl.Camera2ImplConfig$Builder
            r2.<init>()
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.TONEMAP_MODE
            r1 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.setCaptureRequestOption(r0, r1)
            androidx.camera.camera2.impl.Camera2ImplConfig r2 = r2.build()
            r3.addImplementationOptions(r2)
            return
    }
}
