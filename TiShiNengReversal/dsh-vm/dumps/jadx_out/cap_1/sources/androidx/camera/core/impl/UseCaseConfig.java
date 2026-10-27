package androidx.camera.core.impl;

import androidx.camera.core.UseCase;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface UseCaseConfig<T extends androidx.camera.core.UseCase> extends androidx.camera.core.internal.TargetConfig<T>, androidx.camera.core.internal.UseCaseEventConfig, androidx.camera.core.impl.ImageInputConfig {
    public static final androidx.camera.core.impl.Config.Option<androidx.camera.core.CameraSelector> OPTION_CAMERA_SELECTOR = null;
    public static final androidx.camera.core.impl.Config.Option<androidx.camera.core.impl.CaptureConfig.OptionUnpacker> OPTION_CAPTURE_CONFIG_UNPACKER = null;
    public static final androidx.camera.core.impl.Config.Option<androidx.camera.core.impl.UseCaseConfigFactory.CaptureType> OPTION_CAPTURE_TYPE = null;
    public static final androidx.camera.core.impl.Config.Option<androidx.camera.core.impl.CaptureConfig> OPTION_DEFAULT_CAPTURE_CONFIG = null;
    public static final androidx.camera.core.impl.Config.Option<androidx.camera.core.impl.SessionConfig> OPTION_DEFAULT_SESSION_CONFIG = null;
    public static final androidx.camera.core.impl.Config.Option<java.lang.Boolean> OPTION_HIGH_RESOLUTION_DISABLED = null;
    public static final androidx.camera.core.impl.Config.Option<androidx.camera.core.impl.SessionConfig.OptionUnpacker> OPTION_SESSION_CONFIG_UNPACKER = null;
    public static final androidx.camera.core.impl.Config.Option<java.lang.Integer> OPTION_SURFACE_OCCUPANCY_PRIORITY = null;
    public static final androidx.camera.core.impl.Config.Option<android.util.Range<java.lang.Integer>> OPTION_TARGET_FRAME_RATE = null;
    public static final androidx.camera.core.impl.Config.Option<java.lang.Boolean> OPTION_ZSL_DISABLED = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface Builder<T extends androidx.camera.core.UseCase, C extends androidx.camera.core.impl.UseCaseConfig<T>, B> extends androidx.camera.core.internal.TargetConfig.Builder<T, B>, androidx.camera.core.ExtendableBuilder<T>, androidx.camera.core.internal.UseCaseEventConfig.Builder<B> {
        @androidx.annotation.NonNull
        C getUseCaseConfig();

        @androidx.annotation.NonNull
        B setCameraSelector(@androidx.annotation.NonNull androidx.camera.core.CameraSelector r1);

        @androidx.annotation.NonNull
        B setCaptureOptionUnpacker(@androidx.annotation.NonNull androidx.camera.core.impl.CaptureConfig.OptionUnpacker r1);

        @androidx.annotation.NonNull
        B setCaptureType(@androidx.annotation.NonNull androidx.camera.core.impl.UseCaseConfigFactory.CaptureType r1);

        @androidx.annotation.NonNull
        B setDefaultCaptureConfig(@androidx.annotation.NonNull androidx.camera.core.impl.CaptureConfig r1);

        @androidx.annotation.NonNull
        B setDefaultSessionConfig(@androidx.annotation.NonNull androidx.camera.core.impl.SessionConfig r1);

        @androidx.annotation.NonNull
        B setHighResolutionDisabled(boolean r1);

        @androidx.annotation.NonNull
        B setSessionOptionUnpacker(@androidx.annotation.NonNull androidx.camera.core.impl.SessionConfig.OptionUnpacker r1);

        @androidx.annotation.NonNull
        B setSurfaceOccupancyPriority(int r1);

        @androidx.annotation.NonNull
        B setZslDisabled(boolean r1);
    }

    static {
            java.lang.String r0 = "camerax.core.useCase.defaultSessionConfig"
            java.lang.Class<androidx.camera.core.impl.SessionConfig> r1 = androidx.camera.core.impl.SessionConfig.class
            androidx.camera.core.impl.Config$Option r0 = androidx.camera.core.impl.Config.Option.create(r0, r1)
            androidx.camera.core.impl.UseCaseConfig.OPTION_DEFAULT_SESSION_CONFIG = r0
            java.lang.String r0 = "camerax.core.useCase.defaultCaptureConfig"
            java.lang.Class<androidx.camera.core.impl.CaptureConfig> r1 = androidx.camera.core.impl.CaptureConfig.class
            androidx.camera.core.impl.Config$Option r0 = androidx.camera.core.impl.Config.Option.create(r0, r1)
            androidx.camera.core.impl.UseCaseConfig.OPTION_DEFAULT_CAPTURE_CONFIG = r0
            java.lang.String r0 = "camerax.core.useCase.sessionConfigUnpacker"
            java.lang.Class<androidx.camera.core.impl.SessionConfig$OptionUnpacker> r1 = androidx.camera.core.impl.SessionConfig.OptionUnpacker.class
            androidx.camera.core.impl.Config$Option r0 = androidx.camera.core.impl.Config.Option.create(r0, r1)
            androidx.camera.core.impl.UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER = r0
            java.lang.String r0 = "camerax.core.useCase.captureConfigUnpacker"
            java.lang.Class<androidx.camera.core.impl.CaptureConfig$OptionUnpacker> r1 = androidx.camera.core.impl.CaptureConfig.OptionUnpacker.class
            androidx.camera.core.impl.Config$Option r0 = androidx.camera.core.impl.Config.Option.create(r0, r1)
            androidx.camera.core.impl.UseCaseConfig.OPTION_CAPTURE_CONFIG_UNPACKER = r0
            java.lang.String r0 = "camerax.core.useCase.surfaceOccupancyPriority"
            java.lang.Class r1 = java.lang.Integer.TYPE
            androidx.camera.core.impl.Config$Option r0 = androidx.camera.core.impl.Config.Option.create(r0, r1)
            androidx.camera.core.impl.UseCaseConfig.OPTION_SURFACE_OCCUPANCY_PRIORITY = r0
            java.lang.String r0 = "camerax.core.useCase.cameraSelector"
            java.lang.Class<androidx.camera.core.CameraSelector> r1 = androidx.camera.core.CameraSelector.class
            androidx.camera.core.impl.Config$Option r0 = androidx.camera.core.impl.Config.Option.create(r0, r1)
            androidx.camera.core.impl.UseCaseConfig.OPTION_CAMERA_SELECTOR = r0
            java.lang.String r0 = "camerax.core.useCase.targetFrameRate"
            java.lang.Class<android.util.Range> r1 = android.util.Range.class
            androidx.camera.core.impl.Config$Option r0 = androidx.camera.core.impl.Config.Option.create(r0, r1)
            androidx.camera.core.impl.UseCaseConfig.OPTION_TARGET_FRAME_RATE = r0
            java.lang.String r0 = "camerax.core.useCase.zslDisabled"
            java.lang.Class r1 = java.lang.Boolean.TYPE
            androidx.camera.core.impl.Config$Option r0 = androidx.camera.core.impl.Config.Option.create(r0, r1)
            androidx.camera.core.impl.UseCaseConfig.OPTION_ZSL_DISABLED = r0
            java.lang.String r0 = "camerax.core.useCase.highResolutionDisabled"
            androidx.camera.core.impl.Config$Option r0 = androidx.camera.core.impl.Config.Option.create(r0, r1)
            androidx.camera.core.impl.UseCaseConfig.OPTION_HIGH_RESOLUTION_DISABLED = r0
            java.lang.String r0 = "camerax.core.useCase.captureType"
            java.lang.Class<androidx.camera.core.impl.UseCaseConfigFactory$CaptureType> r1 = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.class
            androidx.camera.core.impl.Config$Option r0 = androidx.camera.core.impl.Config.Option.create(r0, r1)
            androidx.camera.core.impl.UseCaseConfig.OPTION_CAPTURE_TYPE = r0
            return
    }

    @androidx.annotation.NonNull
    androidx.camera.core.CameraSelector getCameraSelector();

    @androidx.annotation.Nullable
    androidx.camera.core.CameraSelector getCameraSelector(@androidx.annotation.Nullable androidx.camera.core.CameraSelector r1);

    @androidx.annotation.NonNull
    androidx.camera.core.impl.CaptureConfig.OptionUnpacker getCaptureOptionUnpacker();

    @androidx.annotation.Nullable
    androidx.camera.core.impl.CaptureConfig.OptionUnpacker getCaptureOptionUnpacker(@androidx.annotation.Nullable androidx.camera.core.impl.CaptureConfig.OptionUnpacker r1);

    @androidx.annotation.NonNull
    androidx.camera.core.impl.UseCaseConfigFactory.CaptureType getCaptureType();

    @androidx.annotation.NonNull
    androidx.camera.core.impl.CaptureConfig getDefaultCaptureConfig();

    @androidx.annotation.Nullable
    androidx.camera.core.impl.CaptureConfig getDefaultCaptureConfig(@androidx.annotation.Nullable androidx.camera.core.impl.CaptureConfig r1);

    @androidx.annotation.NonNull
    androidx.camera.core.impl.SessionConfig getDefaultSessionConfig();

    @androidx.annotation.Nullable
    androidx.camera.core.impl.SessionConfig getDefaultSessionConfig(@androidx.annotation.Nullable androidx.camera.core.impl.SessionConfig r1);

    @androidx.annotation.NonNull
    androidx.camera.core.impl.SessionConfig.OptionUnpacker getSessionOptionUnpacker();

    @androidx.annotation.Nullable
    androidx.camera.core.impl.SessionConfig.OptionUnpacker getSessionOptionUnpacker(@androidx.annotation.Nullable androidx.camera.core.impl.SessionConfig.OptionUnpacker r1);

    int getSurfaceOccupancyPriority();

    int getSurfaceOccupancyPriority(int r1);

    @androidx.annotation.NonNull
    android.util.Range<java.lang.Integer> getTargetFrameRate();

    @androidx.annotation.Nullable
    android.util.Range<java.lang.Integer> getTargetFrameRate(@androidx.annotation.Nullable android.util.Range<java.lang.Integer> r1);

    boolean isHigResolutionDisabled(boolean r1);

    boolean isZslDisabled(boolean r1);
}
