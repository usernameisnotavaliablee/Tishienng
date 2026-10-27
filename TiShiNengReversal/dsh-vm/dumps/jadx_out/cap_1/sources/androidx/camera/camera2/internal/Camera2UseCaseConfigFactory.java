package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class Camera2UseCaseConfigFactory implements androidx.camera.core.impl.UseCaseConfigFactory {
    final androidx.camera.camera2.internal.DisplayInfoManager mDisplayInfoManager;

    public Camera2UseCaseConfigFactory(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            r0.<init>()
            androidx.camera.camera2.internal.DisplayInfoManager r1 = androidx.camera.camera2.internal.DisplayInfoManager.getInstance(r1)
            r0.mDisplayInfoManager = r1
            return
    }

    @Override // androidx.camera.core.impl.UseCaseConfigFactory
    @androidx.annotation.NonNull
    public androidx.camera.core.impl.Config getConfig(@androidx.annotation.NonNull androidx.camera.core.impl.UseCaseConfigFactory.CaptureType r4, int r5) {
            r3 = this;
            androidx.camera.core.impl.MutableOptionsBundle r0 = androidx.camera.core.impl.MutableOptionsBundle.create()
            androidx.camera.core.impl.SessionConfig$Builder r1 = new androidx.camera.core.impl.SessionConfig$Builder
            r1.<init>()
            int r2 = androidx.camera.camera2.internal.TemplateTypeUtil.getSessionConfigTemplateType(r4, r5)
            r1.setTemplateType(r2)
            androidx.camera.core.impl.Config$Option<androidx.camera.core.impl.SessionConfig> r2 = androidx.camera.core.impl.UseCaseConfig.OPTION_DEFAULT_SESSION_CONFIG
            androidx.camera.core.impl.SessionConfig r1 = r1.build()
            r0.insertOption(r2, r1)
            androidx.camera.core.impl.Config$Option<androidx.camera.core.impl.SessionConfig$OptionUnpacker> r1 = androidx.camera.core.impl.UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER
            androidx.camera.camera2.internal.Camera2SessionOptionUnpacker r2 = androidx.camera.camera2.internal.Camera2SessionOptionUnpacker.INSTANCE
            r0.insertOption(r1, r2)
            androidx.camera.core.impl.CaptureConfig$Builder r1 = new androidx.camera.core.impl.CaptureConfig$Builder
            r1.<init>()
            int r5 = androidx.camera.camera2.internal.TemplateTypeUtil.getCaptureConfigTemplateType(r4, r5)
            r1.setTemplateType(r5)
            androidx.camera.core.impl.Config$Option<androidx.camera.core.impl.CaptureConfig> r5 = androidx.camera.core.impl.UseCaseConfig.OPTION_DEFAULT_CAPTURE_CONFIG
            androidx.camera.core.impl.CaptureConfig r1 = r1.build()
            r0.insertOption(r5, r1)
            androidx.camera.core.impl.Config$Option<androidx.camera.core.impl.CaptureConfig$OptionUnpacker> r5 = androidx.camera.core.impl.UseCaseConfig.OPTION_CAPTURE_CONFIG_UNPACKER
            androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r1 = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE
            if (r4 != r1) goto L3e
            androidx.camera.camera2.internal.ImageCaptureOptionUnpacker r1 = androidx.camera.camera2.internal.ImageCaptureOptionUnpacker.INSTANCE
            goto L40
        L3e:
            androidx.camera.camera2.internal.Camera2CaptureOptionUnpacker r1 = androidx.camera.camera2.internal.Camera2CaptureOptionUnpacker.INSTANCE
        L40:
            r0.insertOption(r5, r1)
            androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r5 = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.PREVIEW
            if (r4 != r5) goto L52
            androidx.camera.camera2.internal.DisplayInfoManager r5 = r3.mDisplayInfoManager
            android.util.Size r5 = r5.getPreviewSize()
            androidx.camera.core.impl.Config$Option<android.util.Size> r1 = androidx.camera.core.impl.ImageOutputConfig.OPTION_MAX_RESOLUTION
            r0.insertOption(r1, r5)
        L52:
            androidx.camera.camera2.internal.DisplayInfoManager r5 = r3.mDisplayInfoManager
            r1 = 1
            android.view.Display r5 = r5.getMaxSizeDisplay(r1)
            int r5 = r5.getRotation()
            androidx.camera.core.impl.Config$Option<java.lang.Integer> r1 = androidx.camera.core.impl.ImageOutputConfig.OPTION_TARGET_ROTATION
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.insertOption(r1, r5)
            androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r5 = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE
            if (r4 == r5) goto L6e
            androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r5 = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.STREAM_SHARING
            if (r4 != r5) goto L75
        L6e:
            androidx.camera.core.impl.Config$Option<java.lang.Boolean> r4 = androidx.camera.core.impl.UseCaseConfig.OPTION_ZSL_DISABLED
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r0.insertOption(r4, r5)
        L75:
            androidx.camera.core.impl.OptionsBundle r4 = androidx.camera.core.impl.OptionsBundle.from(r0)
            return r4
    }
}
