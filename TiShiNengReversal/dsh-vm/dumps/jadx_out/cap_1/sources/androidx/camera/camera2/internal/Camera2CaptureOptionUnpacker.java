package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class Camera2CaptureOptionUnpacker implements androidx.camera.core.impl.CaptureConfig.OptionUnpacker {
    static final androidx.camera.camera2.internal.Camera2CaptureOptionUnpacker INSTANCE = null;

    static {
            androidx.camera.camera2.internal.Camera2CaptureOptionUnpacker r0 = new androidx.camera.camera2.internal.Camera2CaptureOptionUnpacker
            r0.<init>()
            androidx.camera.camera2.internal.Camera2CaptureOptionUnpacker.INSTANCE = r0
            return
    }

    Camera2CaptureOptionUnpacker() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.camera.core.impl.CaptureConfig.OptionUnpacker
    @androidx.annotation.OptIn(markerClass = {androidx.camera.camera2.interop.ExperimentalCamera2Interop.class})
    public void unpack(@androidx.annotation.NonNull androidx.camera.core.impl.UseCaseConfig<?> r4, @androidx.annotation.NonNull androidx.camera.core.impl.CaptureConfig.Builder r5) {
            r3 = this;
            r0 = 0
            androidx.camera.core.impl.CaptureConfig r0 = r4.getDefaultCaptureConfig(r0)
            androidx.camera.core.impl.OptionsBundle r1 = androidx.camera.core.impl.OptionsBundle.emptyBundle()
            androidx.camera.core.impl.CaptureConfig r2 = androidx.camera.core.impl.CaptureConfig.defaultEmptyCaptureConfig()
            int r2 = r2.getTemplateType()
            if (r0 == 0) goto L22
            int r2 = r0.getTemplateType()
            java.util.List r1 = r0.getCameraCaptureCallbacks()
            r5.addAllCameraCaptureCallbacks(r1)
            androidx.camera.core.impl.Config r1 = r0.getImplementationOptions()
        L22:
            r5.setImplementationOptions(r1)
            androidx.camera.camera2.impl.Camera2ImplConfig r0 = new androidx.camera.camera2.impl.Camera2ImplConfig
            r0.<init>(r4)
            int r4 = r0.getCaptureRequestTemplate(r2)
            r5.setTemplateType(r4)
            android.hardware.camera2.CameraCaptureSession$CaptureCallback r4 = androidx.camera.camera2.internal.Camera2CaptureCallbacks.createNoOpCallback()
            android.hardware.camera2.CameraCaptureSession$CaptureCallback r4 = r0.getSessionCaptureCallback(r4)
            androidx.camera.camera2.internal.CaptureCallbackContainer r4 = androidx.camera.camera2.internal.CaptureCallbackContainer.create(r4)
            r5.addCameraCaptureCallback(r4)
            androidx.camera.camera2.interop.CaptureRequestOptions r4 = r0.getCaptureRequestOptions()
            r5.addImplementationOptions(r4)
            return
    }
}
