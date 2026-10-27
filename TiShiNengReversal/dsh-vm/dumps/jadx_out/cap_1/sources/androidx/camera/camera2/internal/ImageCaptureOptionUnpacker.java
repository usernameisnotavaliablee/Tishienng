package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class ImageCaptureOptionUnpacker extends androidx.camera.camera2.internal.Camera2CaptureOptionUnpacker {
    static final androidx.camera.camera2.internal.ImageCaptureOptionUnpacker INSTANCE = null;

    @androidx.annotation.NonNull
    private final androidx.camera.camera2.internal.compat.workaround.ImageCapturePixelHDRPlus mImageCapturePixelHDRPlus;

    static {
            androidx.camera.camera2.internal.ImageCaptureOptionUnpacker r0 = new androidx.camera.camera2.internal.ImageCaptureOptionUnpacker
            androidx.camera.camera2.internal.compat.workaround.ImageCapturePixelHDRPlus r1 = new androidx.camera.camera2.internal.compat.workaround.ImageCapturePixelHDRPlus
            r1.<init>()
            r0.<init>(r1)
            androidx.camera.camera2.internal.ImageCaptureOptionUnpacker.INSTANCE = r0
            return
    }

    private ImageCaptureOptionUnpacker(@androidx.annotation.NonNull androidx.camera.camera2.internal.compat.workaround.ImageCapturePixelHDRPlus r1) {
            r0 = this;
            r0.<init>()
            r0.mImageCapturePixelHDRPlus = r1
            return
    }

    @Override // androidx.camera.camera2.internal.Camera2CaptureOptionUnpacker, androidx.camera.core.impl.CaptureConfig.OptionUnpacker
    public void unpack(@androidx.annotation.NonNull androidx.camera.core.impl.UseCaseConfig<?> r3, @androidx.annotation.NonNull androidx.camera.core.impl.CaptureConfig.Builder r4) {
            r2 = this;
            super.unpack(r3, r4)
            boolean r0 = r3 instanceof androidx.camera.core.impl.ImageCaptureConfig
            if (r0 == 0) goto L25
            androidx.camera.core.impl.ImageCaptureConfig r3 = (androidx.camera.core.impl.ImageCaptureConfig) r3
            androidx.camera.camera2.impl.Camera2ImplConfig$Builder r0 = new androidx.camera.camera2.impl.Camera2ImplConfig$Builder
            r0.<init>()
            boolean r1 = r3.hasCaptureMode()
            if (r1 == 0) goto L1d
            androidx.camera.camera2.internal.compat.workaround.ImageCapturePixelHDRPlus r1 = r2.mImageCapturePixelHDRPlus
            int r3 = r3.getCaptureMode()
            r1.toggleHDRPlus(r3, r0)
        L1d:
            androidx.camera.camera2.impl.Camera2ImplConfig r3 = r0.build()
            r4.addImplementationOptions(r3)
            return
        L25:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "config is not ImageCaptureConfig"
            r3.<init>(r4)
            throw r3
    }
}
