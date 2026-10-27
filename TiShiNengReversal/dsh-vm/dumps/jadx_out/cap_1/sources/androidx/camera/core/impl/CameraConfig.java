package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface CameraConfig extends androidx.camera.core.impl.ReadableConfig {
    public static final androidx.camera.core.impl.Config.Option<androidx.camera.core.impl.Identifier> OPTION_COMPATIBILITY_ID = null;
    public static final androidx.camera.core.impl.Config.Option<androidx.camera.core.impl.SessionProcessor> OPTION_SESSION_PROCESSOR = null;
    public static final androidx.camera.core.impl.Config.Option<androidx.camera.core.impl.UseCaseConfigFactory> OPTION_USECASE_CONFIG_FACTORY = null;
    public static final androidx.camera.core.impl.Config.Option<java.lang.Integer> OPTION_USE_CASE_COMBINATION_REQUIRED_RULE = null;
    public static final androidx.camera.core.impl.Config.Option<java.lang.Boolean> OPTION_ZSL_DISABLED = null;
    public static final int REQUIRED_RULE_COEXISTING_PREVIEW_AND_IMAGE_CAPTURE = 1;
    public static final int REQUIRED_RULE_NONE = 0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface Builder<B> {
        @androidx.annotation.NonNull
        B setCompatibilityId(@androidx.annotation.NonNull androidx.camera.core.impl.Identifier r1);

        @androidx.annotation.NonNull
        B setSessionProcessor(@androidx.annotation.NonNull androidx.camera.core.impl.SessionProcessor r1);

        @androidx.annotation.NonNull
        B setUseCaseCombinationRequiredRule(int r1);

        @androidx.annotation.NonNull
        B setUseCaseConfigFactory(@androidx.annotation.NonNull androidx.camera.core.impl.UseCaseConfigFactory r1);

        @androidx.annotation.NonNull
        B setZslDisabled(boolean r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface RequiredRule {
    }

    static {
            java.lang.String r0 = "camerax.core.camera.useCaseConfigFactory"
            java.lang.Class<androidx.camera.core.impl.UseCaseConfigFactory> r1 = androidx.camera.core.impl.UseCaseConfigFactory.class
            androidx.camera.core.impl.Config$Option r0 = androidx.camera.core.impl.Config.Option.create(r0, r1)
            androidx.camera.core.impl.CameraConfig.OPTION_USECASE_CONFIG_FACTORY = r0
            java.lang.String r0 = "camerax.core.camera.compatibilityId"
            java.lang.Class<androidx.camera.core.impl.Identifier> r1 = androidx.camera.core.impl.Identifier.class
            androidx.camera.core.impl.Config$Option r0 = androidx.camera.core.impl.Config.Option.create(r0, r1)
            androidx.camera.core.impl.CameraConfig.OPTION_COMPATIBILITY_ID = r0
            java.lang.String r0 = "camerax.core.camera.useCaseCombinationRequiredRule"
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            androidx.camera.core.impl.Config$Option r0 = androidx.camera.core.impl.Config.Option.create(r0, r1)
            androidx.camera.core.impl.CameraConfig.OPTION_USE_CASE_COMBINATION_REQUIRED_RULE = r0
            java.lang.String r0 = "camerax.core.camera.SessionProcessor"
            java.lang.Class<androidx.camera.core.impl.SessionProcessor> r1 = androidx.camera.core.impl.SessionProcessor.class
            androidx.camera.core.impl.Config$Option r0 = androidx.camera.core.impl.Config.Option.create(r0, r1)
            androidx.camera.core.impl.CameraConfig.OPTION_SESSION_PROCESSOR = r0
            java.lang.String r0 = "camerax.core.camera.isZslDisabled"
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            androidx.camera.core.impl.Config$Option r0 = androidx.camera.core.impl.Config.Option.create(r0, r1)
            androidx.camera.core.impl.CameraConfig.OPTION_ZSL_DISABLED = r0
            return
    }

    @androidx.annotation.NonNull
    androidx.camera.core.impl.Identifier getCompatibilityId();

    @androidx.annotation.NonNull
    androidx.camera.core.impl.SessionProcessor getSessionProcessor();

    @androidx.annotation.Nullable
    androidx.camera.core.impl.SessionProcessor getSessionProcessor(@androidx.annotation.Nullable androidx.camera.core.impl.SessionProcessor r1);

    int getUseCaseCombinationRequiredRule();

    @androidx.annotation.NonNull
    androidx.camera.core.impl.UseCaseConfigFactory getUseCaseConfigFactory();
}
