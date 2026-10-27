package androidx.camera.camera2.internal.compat.quirk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class DeviceQuirksLoader {
    private DeviceQuirksLoader() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    static java.util.List<androidx.camera.core.impl.Quirk> loadQuirks() {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk.load()
            if (r1 == 0) goto L13
            androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk r1 = new androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk
            r1.<init>()
            r0.add(r1)
        L13:
            boolean r1 = androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk.load()
            if (r1 == 0) goto L21
            androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk r1 = new androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk
            r1.<init>()
            r0.add(r1)
        L21:
            boolean r1 = androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk.load()
            if (r1 == 0) goto L2f
            androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk r1 = new androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk
            r1.<init>()
            r0.add(r1)
        L2f:
            boolean r1 = androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk.load()
            if (r1 == 0) goto L3d
            androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk r1 = new androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk
            r1.<init>()
            r0.add(r1)
        L3d:
            boolean r1 = androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.load()
            if (r1 == 0) goto L4b
            androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk r1 = new androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk
            r1.<init>()
            r0.add(r1)
        L4b:
            boolean r1 = androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk.load()
            if (r1 == 0) goto L59
            androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk r1 = new androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk
            r1.<init>()
            r0.add(r1)
        L59:
            boolean r1 = androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk.load()
            if (r1 == 0) goto L67
            androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk r1 = new androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk
            r1.<init>()
            r0.add(r1)
        L67:
            boolean r1 = androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.load()
            if (r1 == 0) goto L75
            androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk r1 = new androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk
            r1.<init>()
            r0.add(r1)
        L75:
            boolean r1 = androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk.load()
            if (r1 == 0) goto L83
            androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk r1 = new androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk
            r1.<init>()
            r0.add(r1)
        L83:
            boolean r1 = androidx.camera.camera2.internal.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk.load()
            if (r1 == 0) goto L91
            androidx.camera.camera2.internal.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk r1 = new androidx.camera.camera2.internal.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk
            r1.<init>()
            r0.add(r1)
        L91:
            boolean r1 = androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk.load()
            if (r1 == 0) goto L9f
            androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk r1 = new androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk
            r1.<init>()
            r0.add(r1)
        L9f:
            boolean r1 = androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk.load()
            if (r1 == 0) goto Lad
            androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk r1 = new androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk
            r1.<init>()
            r0.add(r1)
        Lad:
            boolean r1 = androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk.load()
            if (r1 == 0) goto Lbb
            androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk r1 = new androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk
            r1.<init>()
            r0.add(r1)
        Lbb:
            boolean r1 = androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk.load()
            if (r1 == 0) goto Lc9
            androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk r1 = new androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk
            r1.<init>()
            r0.add(r1)
        Lc9:
            boolean r1 = androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk.load()
            if (r1 == 0) goto Ld7
            androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk r1 = new androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk
            r1.<init>()
            r0.add(r1)
        Ld7:
            boolean r1 = androidx.camera.camera2.internal.compat.quirk.InvalidVideoProfilesQuirk.load()
            if (r1 == 0) goto Le5
            androidx.camera.camera2.internal.compat.quirk.InvalidVideoProfilesQuirk r1 = new androidx.camera.camera2.internal.compat.quirk.InvalidVideoProfilesQuirk
            r1.<init>()
            r0.add(r1)
        Le5:
            boolean r1 = androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk.load()
            if (r1 == 0) goto Lf3
            androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk r1 = new androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk
            r1.<init>()
            r0.add(r1)
        Lf3:
            return r0
    }
}
