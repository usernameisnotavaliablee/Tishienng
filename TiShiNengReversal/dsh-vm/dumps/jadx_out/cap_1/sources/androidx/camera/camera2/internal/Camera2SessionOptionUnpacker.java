package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class Camera2SessionOptionUnpacker implements androidx.camera.core.impl.SessionConfig.OptionUnpacker {
    static final androidx.camera.camera2.internal.Camera2SessionOptionUnpacker INSTANCE = null;

    static {
            androidx.camera.camera2.internal.Camera2SessionOptionUnpacker r0 = new androidx.camera.camera2.internal.Camera2SessionOptionUnpacker
            r0.<init>()
            androidx.camera.camera2.internal.Camera2SessionOptionUnpacker.INSTANCE = r0
            return
    }

    Camera2SessionOptionUnpacker() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.camera.core.impl.SessionConfig.OptionUnpacker
    @androidx.annotation.OptIn(markerClass = {androidx.camera.camera2.interop.ExperimentalCamera2Interop.class})
    public void unpack(@androidx.annotation.NonNull android.util.Size r5, @androidx.annotation.NonNull androidx.camera.core.impl.UseCaseConfig<?> r6, @androidx.annotation.NonNull androidx.camera.core.impl.SessionConfig.Builder r7) {
            r4 = this;
            r0 = 0
            androidx.camera.core.impl.SessionConfig r1 = r6.getDefaultSessionConfig(r0)
            androidx.camera.core.impl.OptionsBundle r2 = androidx.camera.core.impl.OptionsBundle.emptyBundle()
            androidx.camera.core.impl.SessionConfig r3 = androidx.camera.core.impl.SessionConfig.defaultEmptySessionConfig()
            int r3 = r3.getTemplateType()
            if (r1 == 0) goto L30
            int r3 = r1.getTemplateType()
            java.util.List r2 = r1.getDeviceStateCallbacks()
            r7.addAllDeviceStateCallbacks(r2)
            java.util.List r2 = r1.getSessionStateCallbacks()
            r7.addAllSessionStateCallbacks(r2)
            java.util.List r2 = r1.getRepeatingCameraCaptureCallbacks()
            r7.addAllRepeatingCameraCaptureCallbacks(r2)
            androidx.camera.core.impl.Config r2 = r1.getImplementationOptions()
        L30:
            r7.setImplementationOptions(r2)
            boolean r1 = r6 instanceof androidx.camera.core.impl.PreviewConfig
            if (r1 == 0) goto L3a
            androidx.camera.camera2.internal.compat.workaround.PreviewPixelHDRnet.setHDRnet(r5, r7)
        L3a:
            androidx.camera.camera2.impl.Camera2ImplConfig r5 = new androidx.camera.camera2.impl.Camera2ImplConfig
            r5.<init>(r6)
            int r6 = r5.getCaptureRequestTemplate(r3)
            r7.setTemplateType(r6)
            android.hardware.camera2.CameraDevice$StateCallback r6 = androidx.camera.camera2.internal.CameraDeviceStateCallbacks.createNoOpCallback()
            android.hardware.camera2.CameraDevice$StateCallback r6 = r5.getDeviceStateCallback(r6)
            r7.addDeviceStateCallback(r6)
            android.hardware.camera2.CameraCaptureSession$StateCallback r6 = androidx.camera.camera2.internal.CameraCaptureSessionStateCallbacks.createNoOpCallback()
            android.hardware.camera2.CameraCaptureSession$StateCallback r6 = r5.getSessionStateCallback(r6)
            r7.addSessionStateCallback(r6)
            android.hardware.camera2.CameraCaptureSession$CaptureCallback r6 = androidx.camera.camera2.internal.Camera2CaptureCallbacks.createNoOpCallback()
            android.hardware.camera2.CameraCaptureSession$CaptureCallback r6 = r5.getSessionCaptureCallback(r6)
            androidx.camera.camera2.internal.CaptureCallbackContainer r6 = androidx.camera.camera2.internal.CaptureCallbackContainer.create(r6)
            r7.addCameraCaptureCallback(r6)
            androidx.camera.core.impl.MutableOptionsBundle r6 = androidx.camera.core.impl.MutableOptionsBundle.create()
            androidx.camera.core.impl.Config$Option<androidx.camera.camera2.impl.CameraEventCallbacks> r1 = androidx.camera.camera2.impl.Camera2ImplConfig.CAMERA_EVENT_CALLBACK_OPTION
            androidx.camera.camera2.impl.CameraEventCallbacks r2 = androidx.camera.camera2.impl.CameraEventCallbacks.createEmptyCallback()
            androidx.camera.camera2.impl.CameraEventCallbacks r2 = r5.getCameraEventCallback(r2)
            r6.insertOption(r1, r2)
            androidx.camera.core.impl.Config$Option<java.lang.String> r1 = androidx.camera.camera2.impl.Camera2ImplConfig.SESSION_PHYSICAL_CAMERA_ID_OPTION
            java.lang.String r0 = r5.getPhysicalCameraId(r0)
            r6.insertOption(r1, r0)
            androidx.camera.core.impl.Config$Option<java.lang.Long> r0 = androidx.camera.camera2.impl.Camera2ImplConfig.STREAM_USE_CASE_OPTION
            r1 = -1
            long r1 = r5.getStreamUseCase(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r6.insertOption(r0, r1)
            r7.addImplementationOptions(r6)
            androidx.camera.camera2.interop.CaptureRequestOptions r5 = r5.getCaptureRequestOptions()
            r7.addImplementationOptions(r5)
            return
    }
}
