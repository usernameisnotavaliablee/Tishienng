package androidx.camera.camera2.internal.compat.quirk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class CameraQuirks {
    private CameraQuirks() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.impl.Quirks get(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r2) {
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            boolean r0 = androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk.load(r2)
            if (r0 == 0) goto L13
            androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk r0 = new androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk
            r0.<init>(r2)
            r1.add(r0)
        L13:
            boolean r0 = androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk.load(r2)
            if (r0 == 0) goto L21
            androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk r0 = new androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk
            r0.<init>()
            r1.add(r0)
        L21:
            boolean r0 = androidx.camera.camera2.internal.compat.quirk.JpegHalCorruptImageQuirk.load(r2)
            if (r0 == 0) goto L2f
            androidx.camera.camera2.internal.compat.quirk.JpegHalCorruptImageQuirk r0 = new androidx.camera.camera2.internal.compat.quirk.JpegHalCorruptImageQuirk
            r0.<init>()
            r1.add(r0)
        L2f:
            boolean r0 = androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk.load(r2)
            if (r0 == 0) goto L3d
            androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk r0 = new androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk
            r0.<init>(r2)
            r1.add(r0)
        L3d:
            boolean r0 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureWashedOutImageQuirk.load(r2)
            if (r0 == 0) goto L4b
            androidx.camera.camera2.internal.compat.quirk.ImageCaptureWashedOutImageQuirk r0 = new androidx.camera.camera2.internal.compat.quirk.ImageCaptureWashedOutImageQuirk
            r0.<init>()
            r1.add(r0)
        L4b:
            boolean r0 = androidx.camera.camera2.internal.compat.quirk.CameraNoResponseWhenEnablingFlashQuirk.load(r2)
            if (r0 == 0) goto L59
            androidx.camera.camera2.internal.compat.quirk.CameraNoResponseWhenEnablingFlashQuirk r0 = new androidx.camera.camera2.internal.compat.quirk.CameraNoResponseWhenEnablingFlashQuirk
            r0.<init>()
            r1.add(r0)
        L59:
            boolean r0 = androidx.camera.camera2.internal.compat.quirk.YuvImageOnePixelShiftQuirk.load(r2)
            if (r0 == 0) goto L67
            androidx.camera.camera2.internal.compat.quirk.YuvImageOnePixelShiftQuirk r0 = new androidx.camera.camera2.internal.compat.quirk.YuvImageOnePixelShiftQuirk
            r0.<init>()
            r1.add(r0)
        L67:
            boolean r0 = androidx.camera.camera2.internal.compat.quirk.FlashTooSlowQuirk.load(r2)
            if (r0 == 0) goto L75
            androidx.camera.camera2.internal.compat.quirk.FlashTooSlowQuirk r0 = new androidx.camera.camera2.internal.compat.quirk.FlashTooSlowQuirk
            r0.<init>()
            r1.add(r0)
        L75:
            boolean r0 = androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk.load(r2)
            if (r0 == 0) goto L83
            androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk r0 = new androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk
            r0.<init>()
            r1.add(r0)
        L83:
            boolean r0 = androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk.load(r2)
            if (r0 == 0) goto L91
            androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk r0 = new androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk
            r0.<init>()
            r1.add(r0)
        L91:
            boolean r0 = androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk.load(r2)
            if (r0 == 0) goto L9f
            androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk r0 = new androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk
            r0.<init>()
            r1.add(r0)
        L9f:
            boolean r0 = androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk.load(r2)
            if (r0 == 0) goto Lad
            androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk r0 = new androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk
            r0.<init>()
            r1.add(r0)
        Lad:
            boolean r0 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureFlashNotFireQuirk.load(r2)
            if (r0 == 0) goto Lbb
            androidx.camera.camera2.internal.compat.quirk.ImageCaptureFlashNotFireQuirk r0 = new androidx.camera.camera2.internal.compat.quirk.ImageCaptureFlashNotFireQuirk
            r0.<init>()
            r1.add(r0)
        Lbb:
            boolean r0 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureWithFlashUnderexposureQuirk.load(r2)
            if (r0 == 0) goto Lc9
            androidx.camera.camera2.internal.compat.quirk.ImageCaptureWithFlashUnderexposureQuirk r0 = new androidx.camera.camera2.internal.compat.quirk.ImageCaptureWithFlashUnderexposureQuirk
            r0.<init>()
            r1.add(r0)
        Lc9:
            boolean r2 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk.load(r2)
            if (r2 == 0) goto Ld7
            androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk r2 = new androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk
            r2.<init>()
            r1.add(r2)
        Ld7:
            androidx.camera.core.impl.Quirks r2 = new androidx.camera.core.impl.Quirks
            r2.<init>(r1)
            return r2
    }
}
