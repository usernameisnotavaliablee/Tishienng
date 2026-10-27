package androidx.camera.core.streamsharing;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(api = 21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class VirtualCameraControl extends androidx.camera.core.impl.ForwardingCameraControl {
    private static final int DEFAULT_JPEG_QUALITY = 100;
    private static final int DEFAULT_ROTATION_DEGREES = 0;
    private final androidx.camera.core.streamsharing.StreamSharing.Control mStreamSharingControl;

    VirtualCameraControl(@androidx.annotation.NonNull androidx.camera.core.impl.CameraControlInternal r1, @androidx.annotation.NonNull androidx.camera.core.streamsharing.StreamSharing.Control r2) {
            r0 = this;
            r0.<init>(r1)
            r0.mStreamSharingControl = r2
            return
    }

    private int getJpegQuality(@androidx.annotation.NonNull androidx.camera.core.impl.CaptureConfig r3) {
            r2 = this;
            androidx.camera.core.impl.Config r3 = r3.getImplementationOptions()
            androidx.camera.core.impl.Config$Option<java.lang.Integer> r0 = androidx.camera.core.impl.CaptureConfig.OPTION_JPEG_QUALITY
            r1 = 100
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r3 = r3.retrieveOption(r0, r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            java.util.Objects.requireNonNull(r3)
            int r3 = r3.intValue()
            return r3
    }

    private int getRotationDegrees(@androidx.annotation.NonNull androidx.camera.core.impl.CaptureConfig r3) {
            r2 = this;
            androidx.camera.core.impl.Config r3 = r3.getImplementationOptions()
            androidx.camera.core.impl.Config$Option<java.lang.Integer> r0 = androidx.camera.core.impl.CaptureConfig.OPTION_ROTATION
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r3 = r3.retrieveOption(r0, r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            java.util.Objects.requireNonNull(r3)
            int r3 = r3.intValue()
            return r3
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.impl.CameraControlInternal
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.util.List<java.lang.Void>> submitStillCaptureRequests(@androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.CaptureConfig> r2, int r3, int r4) {
            r1 = this;
            int r3 = r2.size()
            r4 = 0
            r0 = 1
            if (r3 != r0) goto L9
            goto La
        L9:
            r0 = 0
        La:
            java.lang.String r3 = "Only support one capture config."
            androidx.core.util.Preconditions.checkArgument(r0, r3)
            androidx.camera.core.streamsharing.StreamSharing$Control r3 = r1.mStreamSharingControl
            java.lang.Object r0 = r2.get(r4)
            androidx.camera.core.impl.CaptureConfig r0 = (androidx.camera.core.impl.CaptureConfig) r0
            int r0 = r1.getJpegQuality(r0)
            java.lang.Object r2 = r2.get(r4)
            androidx.camera.core.impl.CaptureConfig r2 = (androidx.camera.core.impl.CaptureConfig) r2
            int r2 = r1.getRotationDegrees(r2)
            com.google.common.util.concurrent.ListenableFuture r2 = r3.jpegSnapshot(r0, r2)
            java.util.List r2 = java.util.Collections.singletonList(r2)
            com.google.common.util.concurrent.ListenableFuture r2 = androidx.camera.core.impl.utils.futures.Futures.allAsList(r2)
            return r2
    }
}
