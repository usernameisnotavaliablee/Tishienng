package androidx.camera.video.internal.compat.quirk;

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
            boolean r1 = androidx.camera.video.internal.compat.quirk.MediaFormatMustNotUseFrameRateToFindEncoderQuirk.load()
            if (r1 == 0) goto L13
            androidx.camera.video.internal.compat.quirk.MediaFormatMustNotUseFrameRateToFindEncoderQuirk r1 = new androidx.camera.video.internal.compat.quirk.MediaFormatMustNotUseFrameRateToFindEncoderQuirk
            r1.<init>()
            r0.add(r1)
        L13:
            boolean r1 = androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk.load()
            if (r1 == 0) goto L21
            androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk r1 = new androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk
            r1.<init>()
            r0.add(r1)
        L21:
            boolean r1 = androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk.load()
            if (r1 == 0) goto L2f
            androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk r1 = new androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk
            r1.<init>()
            r0.add(r1)
        L2f:
            boolean r1 = androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk.load()
            if (r1 == 0) goto L3d
            androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk r1 = new androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk
            r1.<init>()
            r0.add(r1)
        L3d:
            boolean r1 = androidx.camera.video.internal.compat.quirk.ReportedVideoQualityNotSupportedQuirk.load()
            if (r1 == 0) goto L4b
            androidx.camera.video.internal.compat.quirk.ReportedVideoQualityNotSupportedQuirk r1 = new androidx.camera.video.internal.compat.quirk.ReportedVideoQualityNotSupportedQuirk
            r1.<init>()
            r0.add(r1)
        L4b:
            boolean r1 = androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk.load()
            if (r1 == 0) goto L59
            androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk r1 = new androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk
            r1.<init>()
            r0.add(r1)
        L59:
            boolean r1 = androidx.camera.video.internal.compat.quirk.VideoEncoderCrashQuirk.load()
            if (r1 == 0) goto L67
            androidx.camera.video.internal.compat.quirk.VideoEncoderCrashQuirk r1 = new androidx.camera.video.internal.compat.quirk.VideoEncoderCrashQuirk
            r1.<init>()
            r0.add(r1)
        L67:
            boolean r1 = androidx.camera.video.internal.compat.quirk.ExcludeStretchedVideoQualityQuirk.load()
            if (r1 == 0) goto L75
            androidx.camera.video.internal.compat.quirk.ExcludeStretchedVideoQualityQuirk r1 = new androidx.camera.video.internal.compat.quirk.ExcludeStretchedVideoQualityQuirk
            r1.<init>()
            r0.add(r1)
        L75:
            boolean r1 = androidx.camera.video.internal.compat.quirk.MediaStoreVideoCannotWrite.load()
            if (r1 == 0) goto L83
            androidx.camera.video.internal.compat.quirk.MediaStoreVideoCannotWrite r1 = new androidx.camera.video.internal.compat.quirk.MediaStoreVideoCannotWrite
            r1.<init>()
            r0.add(r1)
        L83:
            boolean r1 = androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk.load()
            if (r1 == 0) goto L91
            androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk r1 = new androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk
            r1.<init>()
            r0.add(r1)
        L91:
            boolean r1 = androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.load()
            if (r1 == 0) goto L9f
            androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk r1 = new androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk
            r1.<init>()
            r0.add(r1)
        L9f:
            boolean r1 = androidx.camera.video.internal.compat.quirk.NegativeLatLongSavesIncorrectlyQuirk.load()
            if (r1 == 0) goto Lad
            androidx.camera.video.internal.compat.quirk.NegativeLatLongSavesIncorrectlyQuirk r1 = new androidx.camera.video.internal.compat.quirk.NegativeLatLongSavesIncorrectlyQuirk
            r1.<init>()
            r0.add(r1)
        Lad:
            boolean r1 = androidx.camera.video.internal.compat.quirk.PreviewStretchWhenVideoCaptureIsBoundQuirk.load()
            if (r1 == 0) goto Lbb
            androidx.camera.video.internal.compat.quirk.PreviewStretchWhenVideoCaptureIsBoundQuirk r1 = new androidx.camera.video.internal.compat.quirk.PreviewStretchWhenVideoCaptureIsBoundQuirk
            r1.<init>()
            r0.add(r1)
        Lbb:
            boolean r1 = androidx.camera.video.internal.compat.quirk.PreviewDelayWhenVideoCaptureIsBoundQuirk.load()
            if (r1 == 0) goto Lc9
            androidx.camera.video.internal.compat.quirk.PreviewDelayWhenVideoCaptureIsBoundQuirk r1 = new androidx.camera.video.internal.compat.quirk.PreviewDelayWhenVideoCaptureIsBoundQuirk
            r1.<init>()
            r0.add(r1)
        Lc9:
            boolean r1 = androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk.load()
            if (r1 == 0) goto Ld7
            androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk r1 = new androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk
            r1.<init>()
            r0.add(r1)
        Ld7:
            boolean r1 = androidx.camera.video.internal.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.load()
            if (r1 == 0) goto Le5
            androidx.camera.video.internal.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk r1 = new androidx.camera.video.internal.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk
            r1.<init>()
            r0.add(r1)
        Le5:
            boolean r1 = androidx.camera.video.internal.compat.quirk.ExtraSupportedResolutionQuirk.load()
            if (r1 == 0) goto Lf3
            androidx.camera.video.internal.compat.quirk.ExtraSupportedResolutionQuirk r1 = new androidx.camera.video.internal.compat.quirk.ExtraSupportedResolutionQuirk
            r1.<init>()
            r0.add(r1)
        Lf3:
            return r0
    }
}
