package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface ImageOutputConfig extends androidx.camera.core.impl.ReadableConfig {
    public static final int INVALID_ROTATION = -1;
    public static final androidx.camera.core.impl.Config.Option<java.lang.Integer> OPTION_APP_TARGET_ROTATION = null;
    public static final androidx.camera.core.impl.Config.Option<java.util.List<android.util.Size>> OPTION_CUSTOM_ORDERED_RESOLUTIONS = null;
    public static final androidx.camera.core.impl.Config.Option<android.util.Size> OPTION_DEFAULT_RESOLUTION = null;
    public static final androidx.camera.core.impl.Config.Option<android.util.Size> OPTION_MAX_RESOLUTION = null;
    public static final androidx.camera.core.impl.Config.Option<java.lang.Integer> OPTION_MIRROR_MODE = null;
    public static final androidx.camera.core.impl.Config.Option<androidx.camera.core.resolutionselector.ResolutionSelector> OPTION_RESOLUTION_SELECTOR = null;
    public static final androidx.camera.core.impl.Config.Option<java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>>> OPTION_SUPPORTED_RESOLUTIONS = null;
    public static final androidx.camera.core.impl.Config.Option<java.lang.Integer> OPTION_TARGET_ASPECT_RATIO = null;
    public static final androidx.camera.core.impl.Config.Option<android.util.Size> OPTION_TARGET_RESOLUTION = null;
    public static final androidx.camera.core.impl.Config.Option<java.lang.Integer> OPTION_TARGET_ROTATION = null;
    public static final int ROTATION_NOT_SPECIFIED = -1;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface Builder<B> {
        @androidx.annotation.NonNull
        B setCustomOrderedResolutions(@androidx.annotation.NonNull java.util.List<android.util.Size> r1);

        @androidx.annotation.NonNull
        B setDefaultResolution(@androidx.annotation.NonNull android.util.Size r1);

        @androidx.annotation.NonNull
        B setMaxResolution(@androidx.annotation.NonNull android.util.Size r1);

        @androidx.annotation.NonNull
        B setMirrorMode(int r1);

        @androidx.annotation.NonNull
        B setResolutionSelector(@androidx.annotation.NonNull androidx.camera.core.resolutionselector.ResolutionSelector r1);

        @androidx.annotation.NonNull
        B setSupportedResolutions(@androidx.annotation.NonNull java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> r1);

        @androidx.annotation.NonNull
        B setTargetAspectRatio(int r1);

        @androidx.annotation.NonNull
        B setTargetResolution(@androidx.annotation.NonNull android.util.Size r1);

        @androidx.annotation.NonNull
        B setTargetRotation(int r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface OptionalRotationValue {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface RotationDegreesValue {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface RotationValue {
    }

    static {
            java.lang.String r0 = "camerax.core.imageOutput.targetAspectRatio"
            java.lang.Class<androidx.camera.core.AspectRatio> r1 = androidx.camera.core.AspectRatio.class
            androidx.camera.core.impl.Config$Option r0 = androidx.camera.core.impl.Config.Option.create(r0, r1)
            androidx.camera.core.impl.ImageOutputConfig.OPTION_TARGET_ASPECT_RATIO = r0
            java.lang.String r0 = "camerax.core.imageOutput.targetRotation"
            java.lang.Class r1 = java.lang.Integer.TYPE
            androidx.camera.core.impl.Config$Option r0 = androidx.camera.core.impl.Config.Option.create(r0, r1)
            androidx.camera.core.impl.ImageOutputConfig.OPTION_TARGET_ROTATION = r0
            java.lang.String r0 = "camerax.core.imageOutput.appTargetRotation"
            androidx.camera.core.impl.Config$Option r0 = androidx.camera.core.impl.Config.Option.create(r0, r1)
            androidx.camera.core.impl.ImageOutputConfig.OPTION_APP_TARGET_ROTATION = r0
            java.lang.String r0 = "camerax.core.imageOutput.mirrorMode"
            androidx.camera.core.impl.Config$Option r0 = androidx.camera.core.impl.Config.Option.create(r0, r1)
            androidx.camera.core.impl.ImageOutputConfig.OPTION_MIRROR_MODE = r0
            java.lang.String r0 = "camerax.core.imageOutput.targetResolution"
            java.lang.Class<android.util.Size> r1 = android.util.Size.class
            androidx.camera.core.impl.Config$Option r0 = androidx.camera.core.impl.Config.Option.create(r0, r1)
            androidx.camera.core.impl.ImageOutputConfig.OPTION_TARGET_RESOLUTION = r0
            java.lang.String r0 = "camerax.core.imageOutput.defaultResolution"
            androidx.camera.core.impl.Config$Option r0 = androidx.camera.core.impl.Config.Option.create(r0, r1)
            androidx.camera.core.impl.ImageOutputConfig.OPTION_DEFAULT_RESOLUTION = r0
            java.lang.String r0 = "camerax.core.imageOutput.maxResolution"
            androidx.camera.core.impl.Config$Option r0 = androidx.camera.core.impl.Config.Option.create(r0, r1)
            androidx.camera.core.impl.ImageOutputConfig.OPTION_MAX_RESOLUTION = r0
            java.lang.String r0 = "camerax.core.imageOutput.supportedResolutions"
            java.lang.Class<java.util.List> r1 = java.util.List.class
            androidx.camera.core.impl.Config$Option r0 = androidx.camera.core.impl.Config.Option.create(r0, r1)
            androidx.camera.core.impl.ImageOutputConfig.OPTION_SUPPORTED_RESOLUTIONS = r0
            java.lang.String r0 = "camerax.core.imageOutput.resolutionSelector"
            java.lang.Class<androidx.camera.core.resolutionselector.ResolutionSelector> r2 = androidx.camera.core.resolutionselector.ResolutionSelector.class
            androidx.camera.core.impl.Config$Option r0 = androidx.camera.core.impl.Config.Option.create(r0, r2)
            androidx.camera.core.impl.ImageOutputConfig.OPTION_RESOLUTION_SELECTOR = r0
            java.lang.String r0 = "camerax.core.imageOutput.customOrderedResolutions"
            androidx.camera.core.impl.Config$Option r0 = androidx.camera.core.impl.Config.Option.create(r0, r1)
            androidx.camera.core.impl.ImageOutputConfig.OPTION_CUSTOM_ORDERED_RESOLUTIONS = r0
            return
    }

    int getAppTargetRotation(int r1);

    @androidx.annotation.NonNull
    java.util.List<android.util.Size> getCustomOrderedResolutions();

    @androidx.annotation.Nullable
    java.util.List<android.util.Size> getCustomOrderedResolutions(@androidx.annotation.Nullable java.util.List<android.util.Size> r1);

    @androidx.annotation.NonNull
    android.util.Size getDefaultResolution();

    @androidx.annotation.Nullable
    android.util.Size getDefaultResolution(@androidx.annotation.Nullable android.util.Size r1);

    @androidx.annotation.NonNull
    android.util.Size getMaxResolution();

    @androidx.annotation.Nullable
    android.util.Size getMaxResolution(@androidx.annotation.Nullable android.util.Size r1);

    int getMirrorMode(int r1);

    @androidx.annotation.NonNull
    androidx.camera.core.resolutionselector.ResolutionSelector getResolutionSelector();

    @androidx.annotation.Nullable
    androidx.camera.core.resolutionselector.ResolutionSelector getResolutionSelector(@androidx.annotation.Nullable androidx.camera.core.resolutionselector.ResolutionSelector r1);

    @androidx.annotation.NonNull
    java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> getSupportedResolutions();

    @androidx.annotation.Nullable
    java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> getSupportedResolutions(@androidx.annotation.Nullable java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> r1);

    int getTargetAspectRatio();

    @androidx.annotation.NonNull
    android.util.Size getTargetResolution();

    @androidx.annotation.Nullable
    android.util.Size getTargetResolution(@androidx.annotation.Nullable android.util.Size r1);

    int getTargetRotation();

    int getTargetRotation(int r1);

    boolean hasTargetAspectRatio();
}
