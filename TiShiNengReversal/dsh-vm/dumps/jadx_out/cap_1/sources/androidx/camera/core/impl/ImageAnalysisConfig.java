package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ImageAnalysisConfig implements androidx.camera.core.impl.UseCaseConfig<androidx.camera.core.ImageAnalysis>, androidx.camera.core.impl.ImageOutputConfig, androidx.camera.core.internal.ThreadConfig {
    public static final androidx.camera.core.impl.Config.Option<java.lang.Integer> OPTION_BACKPRESSURE_STRATEGY = null;
    public static final androidx.camera.core.impl.Config.Option<java.lang.Integer> OPTION_IMAGE_QUEUE_DEPTH = null;
    public static final androidx.camera.core.impl.Config.Option<androidx.camera.core.ImageReaderProxyProvider> OPTION_IMAGE_READER_PROXY_PROVIDER = null;
    public static final androidx.camera.core.impl.Config.Option<java.lang.Boolean> OPTION_ONE_PIXEL_SHIFT_ENABLED = null;
    public static final androidx.camera.core.impl.Config.Option<java.lang.Integer> OPTION_OUTPUT_IMAGE_FORMAT = null;
    public static final androidx.camera.core.impl.Config.Option<java.lang.Boolean> OPTION_OUTPUT_IMAGE_ROTATION_ENABLED = null;
    private final androidx.camera.core.impl.OptionsBundle mConfig;

    static {
            java.lang.String r0 = "camerax.core.imageAnalysis.backpressureStrategy"
            java.lang.Class<androidx.camera.core.ImageAnalysis$BackpressureStrategy> r1 = androidx.camera.core.ImageAnalysis.BackpressureStrategy.class
            androidx.camera.core.impl.Config$Option r0 = androidx.camera.core.impl.Config.Option.create(r0, r1)
            androidx.camera.core.impl.ImageAnalysisConfig.OPTION_BACKPRESSURE_STRATEGY = r0
            java.lang.String r0 = "camerax.core.imageAnalysis.imageQueueDepth"
            java.lang.Class r1 = java.lang.Integer.TYPE
            androidx.camera.core.impl.Config$Option r0 = androidx.camera.core.impl.Config.Option.create(r0, r1)
            androidx.camera.core.impl.ImageAnalysisConfig.OPTION_IMAGE_QUEUE_DEPTH = r0
            java.lang.String r0 = "camerax.core.imageAnalysis.imageReaderProxyProvider"
            java.lang.Class<androidx.camera.core.ImageReaderProxyProvider> r1 = androidx.camera.core.ImageReaderProxyProvider.class
            androidx.camera.core.impl.Config$Option r0 = androidx.camera.core.impl.Config.Option.create(r0, r1)
            androidx.camera.core.impl.ImageAnalysisConfig.OPTION_IMAGE_READER_PROXY_PROVIDER = r0
            java.lang.String r0 = "camerax.core.imageAnalysis.outputImageFormat"
            java.lang.Class<androidx.camera.core.ImageAnalysis$OutputImageFormat> r1 = androidx.camera.core.ImageAnalysis.OutputImageFormat.class
            androidx.camera.core.impl.Config$Option r0 = androidx.camera.core.impl.Config.Option.create(r0, r1)
            androidx.camera.core.impl.ImageAnalysisConfig.OPTION_OUTPUT_IMAGE_FORMAT = r0
            java.lang.String r0 = "camerax.core.imageAnalysis.onePixelShiftEnabled"
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            androidx.camera.core.impl.Config$Option r0 = androidx.camera.core.impl.Config.Option.create(r0, r1)
            androidx.camera.core.impl.ImageAnalysisConfig.OPTION_ONE_PIXEL_SHIFT_ENABLED = r0
            java.lang.String r0 = "camerax.core.imageAnalysis.outputImageRotationEnabled"
            androidx.camera.core.impl.Config$Option r0 = androidx.camera.core.impl.Config.Option.create(r0, r1)
            androidx.camera.core.impl.ImageAnalysisConfig.OPTION_OUTPUT_IMAGE_ROTATION_ENABLED = r0
            return
    }

    public ImageAnalysisConfig(@androidx.annotation.NonNull androidx.camera.core.impl.OptionsBundle r1) {
            r0 = this;
            r0.<init>()
            r0.mConfig = r1
            return
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public /* synthetic */ boolean containsOption(androidx.camera.core.impl.Config.Option r1) {
            r0 = this;
            boolean r1 = androidx.camera.core.impl.g0.a(r0, r1)
            return r1
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public /* synthetic */ void findOptions(java.lang.String r1, androidx.camera.core.impl.Config.OptionMatcher r2) {
            r0 = this;
            androidx.camera.core.impl.g0.b(r0, r1, r2)
            return
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public /* synthetic */ int getAppTargetRotation(int r1) {
            r0 = this;
            int r1 = androidx.camera.core.impl.z.a(r0, r1)
            return r1
    }

    @Override // androidx.camera.core.internal.ThreadConfig
    public /* synthetic */ java.util.concurrent.Executor getBackgroundExecutor() {
            r1 = this;
            java.util.concurrent.Executor r0 = androidx.camera.core.internal.e.a(r1)
            return r0
    }

    @Override // androidx.camera.core.internal.ThreadConfig
    public /* synthetic */ java.util.concurrent.Executor getBackgroundExecutor(java.util.concurrent.Executor r1) {
            r0 = this;
            java.util.concurrent.Executor r1 = androidx.camera.core.internal.e.b(r0, r1)
            return r1
    }

    public int getBackpressureStrategy() {
            r1 = this;
            androidx.camera.core.impl.Config$Option<java.lang.Integer> r0 = androidx.camera.core.impl.ImageAnalysisConfig.OPTION_BACKPRESSURE_STRATEGY
            java.lang.Object r0 = r1.retrieveOption(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
    }

    public int getBackpressureStrategy(int r2) {
            r1 = this;
            androidx.camera.core.impl.Config$Option<java.lang.Integer> r0 = androidx.camera.core.impl.ImageAnalysisConfig.OPTION_BACKPRESSURE_STRATEGY
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r1.retrieveOption(r0, r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            return r2
    }

    @Override // androidx.camera.core.impl.UseCaseConfig
    public /* synthetic */ androidx.camera.core.CameraSelector getCameraSelector() {
            r1 = this;
            androidx.camera.core.CameraSelector r0 = androidx.camera.core.impl.n0.a(r1)
            return r0
    }

    @Override // androidx.camera.core.impl.UseCaseConfig
    public /* synthetic */ androidx.camera.core.CameraSelector getCameraSelector(androidx.camera.core.CameraSelector r1) {
            r0 = this;
            androidx.camera.core.CameraSelector r1 = androidx.camera.core.impl.n0.b(r0, r1)
            return r1
    }

    @Override // androidx.camera.core.impl.UseCaseConfig
    public /* synthetic */ androidx.camera.core.impl.CaptureConfig.OptionUnpacker getCaptureOptionUnpacker() {
            r1 = this;
            androidx.camera.core.impl.CaptureConfig$OptionUnpacker r0 = androidx.camera.core.impl.n0.c(r1)
            return r0
    }

    @Override // androidx.camera.core.impl.UseCaseConfig
    public /* synthetic */ androidx.camera.core.impl.CaptureConfig.OptionUnpacker getCaptureOptionUnpacker(androidx.camera.core.impl.CaptureConfig.OptionUnpacker r1) {
            r0 = this;
            androidx.camera.core.impl.CaptureConfig$OptionUnpacker r1 = androidx.camera.core.impl.n0.d(r0, r1)
            return r1
    }

    @Override // androidx.camera.core.impl.UseCaseConfig
    public /* synthetic */ androidx.camera.core.impl.UseCaseConfigFactory.CaptureType getCaptureType() {
            r1 = this;
            androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r0 = androidx.camera.core.impl.n0.e(r1)
            return r0
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    @androidx.annotation.NonNull
    public androidx.camera.core.impl.Config getConfig() {
            r1 = this;
            androidx.camera.core.impl.OptionsBundle r0 = r1.mConfig
            return r0
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public /* synthetic */ java.util.List getCustomOrderedResolutions() {
            r1 = this;
            java.util.List r0 = androidx.camera.core.impl.z.b(r1)
            return r0
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public /* synthetic */ java.util.List getCustomOrderedResolutions(java.util.List r1) {
            r0 = this;
            java.util.List r1 = androidx.camera.core.impl.z.c(r0, r1)
            return r1
    }

    @Override // androidx.camera.core.impl.UseCaseConfig
    public /* synthetic */ androidx.camera.core.impl.CaptureConfig getDefaultCaptureConfig() {
            r1 = this;
            androidx.camera.core.impl.CaptureConfig r0 = androidx.camera.core.impl.n0.f(r1)
            return r0
    }

    @Override // androidx.camera.core.impl.UseCaseConfig
    public /* synthetic */ androidx.camera.core.impl.CaptureConfig getDefaultCaptureConfig(androidx.camera.core.impl.CaptureConfig r1) {
            r0 = this;
            androidx.camera.core.impl.CaptureConfig r1 = androidx.camera.core.impl.n0.g(r0, r1)
            return r1
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public /* synthetic */ android.util.Size getDefaultResolution() {
            r1 = this;
            android.util.Size r0 = androidx.camera.core.impl.z.d(r1)
            return r0
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public /* synthetic */ android.util.Size getDefaultResolution(android.util.Size r1) {
            r0 = this;
            android.util.Size r1 = androidx.camera.core.impl.z.e(r0, r1)
            return r1
    }

    @Override // androidx.camera.core.impl.UseCaseConfig
    public /* synthetic */ androidx.camera.core.impl.SessionConfig getDefaultSessionConfig() {
            r1 = this;
            androidx.camera.core.impl.SessionConfig r0 = androidx.camera.core.impl.n0.h(r1)
            return r0
    }

    @Override // androidx.camera.core.impl.UseCaseConfig
    public /* synthetic */ androidx.camera.core.impl.SessionConfig getDefaultSessionConfig(androidx.camera.core.impl.SessionConfig r1) {
            r0 = this;
            androidx.camera.core.impl.SessionConfig r1 = androidx.camera.core.impl.n0.i(r0, r1)
            return r1
    }

    @Override // androidx.camera.core.impl.ImageInputConfig
    public /* synthetic */ androidx.camera.core.DynamicRange getDynamicRange() {
            r1 = this;
            androidx.camera.core.DynamicRange r0 = androidx.camera.core.impl.y.a(r1)
            return r0
    }

    public int getImageQueueDepth() {
            r1 = this;
            androidx.camera.core.impl.Config$Option<java.lang.Integer> r0 = androidx.camera.core.impl.ImageAnalysisConfig.OPTION_IMAGE_QUEUE_DEPTH
            java.lang.Object r0 = r1.retrieveOption(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
    }

    public int getImageQueueDepth(int r2) {
            r1 = this;
            androidx.camera.core.impl.Config$Option<java.lang.Integer> r0 = androidx.camera.core.impl.ImageAnalysisConfig.OPTION_IMAGE_QUEUE_DEPTH
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r1.retrieveOption(r0, r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            return r2
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.camera.core.ImageReaderProxyProvider getImageReaderProxyProvider() {
            r2 = this;
            androidx.camera.core.impl.Config$Option<androidx.camera.core.ImageReaderProxyProvider> r0 = androidx.camera.core.impl.ImageAnalysisConfig.OPTION_IMAGE_READER_PROXY_PROVIDER
            r1 = 0
            java.lang.Object r0 = r2.retrieveOption(r0, r1)
            androidx.camera.core.ImageReaderProxyProvider r0 = (androidx.camera.core.ImageReaderProxyProvider) r0
            return r0
    }

    @Override // androidx.camera.core.impl.ImageInputConfig
    public int getInputFormat() {
            r1 = this;
            r0 = 35
            return r0
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public /* synthetic */ android.util.Size getMaxResolution() {
            r1 = this;
            android.util.Size r0 = androidx.camera.core.impl.z.f(r1)
            return r0
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public /* synthetic */ android.util.Size getMaxResolution(android.util.Size r1) {
            r0 = this;
            android.util.Size r1 = androidx.camera.core.impl.z.g(r0, r1)
            return r1
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public /* synthetic */ int getMirrorMode(int r1) {
            r0 = this;
            int r1 = androidx.camera.core.impl.z.h(r0, r1)
            return r1
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public java.lang.Boolean getOnePixelShiftEnabled(@androidx.annotation.Nullable java.lang.Boolean r2) {
            r1 = this;
            androidx.camera.core.impl.Config$Option<java.lang.Boolean> r0 = androidx.camera.core.impl.ImageAnalysisConfig.OPTION_ONE_PIXEL_SHIFT_ENABLED
            java.lang.Object r2 = r1.retrieveOption(r0, r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            return r2
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public /* synthetic */ androidx.camera.core.impl.Config.OptionPriority getOptionPriority(androidx.camera.core.impl.Config.Option r1) {
            r0 = this;
            androidx.camera.core.impl.Config$OptionPriority r1 = androidx.camera.core.impl.g0.c(r0, r1)
            return r1
    }

    public int getOutputImageFormat(int r2) {
            r1 = this;
            androidx.camera.core.impl.Config$Option<java.lang.Integer> r0 = androidx.camera.core.impl.ImageAnalysisConfig.OPTION_OUTPUT_IMAGE_FORMAT
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r1.retrieveOption(r0, r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            return r2
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public /* synthetic */ java.util.Set getPriorities(androidx.camera.core.impl.Config.Option r1) {
            r0 = this;
            java.util.Set r1 = androidx.camera.core.impl.g0.d(r0, r1)
            return r1
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public /* synthetic */ androidx.camera.core.resolutionselector.ResolutionSelector getResolutionSelector() {
            r1 = this;
            androidx.camera.core.resolutionselector.ResolutionSelector r0 = androidx.camera.core.impl.z.i(r1)
            return r0
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public /* synthetic */ androidx.camera.core.resolutionselector.ResolutionSelector getResolutionSelector(androidx.camera.core.resolutionselector.ResolutionSelector r1) {
            r0 = this;
            androidx.camera.core.resolutionselector.ResolutionSelector r1 = androidx.camera.core.impl.z.j(r0, r1)
            return r1
    }

    @Override // androidx.camera.core.impl.UseCaseConfig
    public /* synthetic */ androidx.camera.core.impl.SessionConfig.OptionUnpacker getSessionOptionUnpacker() {
            r1 = this;
            androidx.camera.core.impl.SessionConfig$OptionUnpacker r0 = androidx.camera.core.impl.n0.j(r1)
            return r0
    }

    @Override // androidx.camera.core.impl.UseCaseConfig
    public /* synthetic */ androidx.camera.core.impl.SessionConfig.OptionUnpacker getSessionOptionUnpacker(androidx.camera.core.impl.SessionConfig.OptionUnpacker r1) {
            r0 = this;
            androidx.camera.core.impl.SessionConfig$OptionUnpacker r1 = androidx.camera.core.impl.n0.k(r0, r1)
            return r1
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public /* synthetic */ java.util.List getSupportedResolutions() {
            r1 = this;
            java.util.List r0 = androidx.camera.core.impl.z.k(r1)
            return r0
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public /* synthetic */ java.util.List getSupportedResolutions(java.util.List r1) {
            r0 = this;
            java.util.List r1 = androidx.camera.core.impl.z.l(r0, r1)
            return r1
    }

    @Override // androidx.camera.core.impl.UseCaseConfig
    public /* synthetic */ int getSurfaceOccupancyPriority() {
            r1 = this;
            int r0 = androidx.camera.core.impl.n0.l(r1)
            return r0
    }

    @Override // androidx.camera.core.impl.UseCaseConfig
    public /* synthetic */ int getSurfaceOccupancyPriority(int r1) {
            r0 = this;
            int r1 = androidx.camera.core.impl.n0.m(r0, r1)
            return r1
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public /* synthetic */ int getTargetAspectRatio() {
            r1 = this;
            int r0 = androidx.camera.core.impl.z.m(r1)
            return r0
    }

    @Override // androidx.camera.core.internal.TargetConfig
    public /* synthetic */ java.lang.Class getTargetClass() {
            r1 = this;
            java.lang.Class r0 = androidx.camera.core.internal.d.a(r1)
            return r0
    }

    @Override // androidx.camera.core.internal.TargetConfig
    public /* synthetic */ java.lang.Class getTargetClass(java.lang.Class r1) {
            r0 = this;
            java.lang.Class r1 = androidx.camera.core.internal.d.b(r0, r1)
            return r1
    }

    @Override // androidx.camera.core.impl.UseCaseConfig
    public /* synthetic */ android.util.Range getTargetFrameRate() {
            r1 = this;
            android.util.Range r0 = androidx.camera.core.impl.n0.n(r1)
            return r0
    }

    @Override // androidx.camera.core.impl.UseCaseConfig
    public /* synthetic */ android.util.Range getTargetFrameRate(android.util.Range r1) {
            r0 = this;
            android.util.Range r1 = androidx.camera.core.impl.n0.o(r0, r1)
            return r1
    }

    @Override // androidx.camera.core.internal.TargetConfig
    public /* synthetic */ java.lang.String getTargetName() {
            r1 = this;
            java.lang.String r0 = androidx.camera.core.internal.d.c(r1)
            return r0
    }

    @Override // androidx.camera.core.internal.TargetConfig
    public /* synthetic */ java.lang.String getTargetName(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = androidx.camera.core.internal.d.d(r0, r1)
            return r1
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public /* synthetic */ android.util.Size getTargetResolution() {
            r1 = this;
            android.util.Size r0 = androidx.camera.core.impl.z.n(r1)
            return r0
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public /* synthetic */ android.util.Size getTargetResolution(android.util.Size r1) {
            r0 = this;
            android.util.Size r1 = androidx.camera.core.impl.z.o(r0, r1)
            return r1
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public /* synthetic */ int getTargetRotation() {
            r1 = this;
            int r0 = androidx.camera.core.impl.z.p(r1)
            return r0
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public /* synthetic */ int getTargetRotation(int r1) {
            r0 = this;
            int r1 = androidx.camera.core.impl.z.q(r0, r1)
            return r1
    }

    @Override // androidx.camera.core.internal.UseCaseEventConfig
    public /* synthetic */ androidx.camera.core.UseCase.EventCallback getUseCaseEventCallback() {
            r1 = this;
            androidx.camera.core.UseCase$EventCallback r0 = androidx.camera.core.internal.f.a(r1)
            return r0
    }

    @Override // androidx.camera.core.internal.UseCaseEventConfig
    public /* synthetic */ androidx.camera.core.UseCase.EventCallback getUseCaseEventCallback(androidx.camera.core.UseCase.EventCallback r1) {
            r0 = this;
            androidx.camera.core.UseCase$EventCallback r1 = androidx.camera.core.internal.f.b(r0, r1)
            return r1
    }

    @Override // androidx.camera.core.impl.ImageInputConfig
    public /* synthetic */ boolean hasDynamicRange() {
            r1 = this;
            boolean r0 = androidx.camera.core.impl.y.c(r1)
            return r0
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public /* synthetic */ boolean hasTargetAspectRatio() {
            r1 = this;
            boolean r0 = androidx.camera.core.impl.z.r(r1)
            return r0
    }

    @Override // androidx.camera.core.impl.UseCaseConfig
    public /* synthetic */ boolean isHigResolutionDisabled(boolean r1) {
            r0 = this;
            boolean r1 = androidx.camera.core.impl.n0.p(r0, r1)
            return r1
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public java.lang.Boolean isOutputImageRotationEnabled(@androidx.annotation.Nullable java.lang.Boolean r2) {
            r1 = this;
            androidx.camera.core.impl.Config$Option<java.lang.Boolean> r0 = androidx.camera.core.impl.ImageAnalysisConfig.OPTION_OUTPUT_IMAGE_ROTATION_ENABLED
            java.lang.Object r2 = r1.retrieveOption(r0, r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            return r2
    }

    @Override // androidx.camera.core.impl.UseCaseConfig
    public /* synthetic */ boolean isZslDisabled(boolean r1) {
            r0 = this;
            boolean r1 = androidx.camera.core.impl.n0.q(r0, r1)
            return r1
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public /* synthetic */ java.util.Set listOptions() {
            r1 = this;
            java.util.Set r0 = androidx.camera.core.impl.g0.e(r1)
            return r0
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public /* synthetic */ java.lang.Object retrieveOption(androidx.camera.core.impl.Config.Option r1) {
            r0 = this;
            java.lang.Object r1 = androidx.camera.core.impl.g0.f(r0, r1)
            return r1
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public /* synthetic */ java.lang.Object retrieveOption(androidx.camera.core.impl.Config.Option r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Object r1 = androidx.camera.core.impl.g0.g(r0, r1, r2)
            return r1
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public /* synthetic */ java.lang.Object retrieveOptionWithPriority(androidx.camera.core.impl.Config.Option r1, androidx.camera.core.impl.Config.OptionPriority r2) {
            r0 = this;
            java.lang.Object r1 = androidx.camera.core.impl.g0.h(r0, r1, r2)
            return r1
    }
}
