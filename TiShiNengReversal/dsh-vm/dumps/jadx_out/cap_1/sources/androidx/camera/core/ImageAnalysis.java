package androidx.camera.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ImageAnalysis extends androidx.camera.core.UseCase {
    public static final int COORDINATE_SYSTEM_ORIGINAL = 0;
    private static final int DEFAULT_BACKPRESSURE_STRATEGY = 0;

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static final androidx.camera.core.ImageAnalysis.Defaults DEFAULT_CONFIG = null;
    private static final int DEFAULT_IMAGE_QUEUE_DEPTH = 6;
    private static final java.lang.Boolean DEFAULT_ONE_PIXEL_SHIFT_ENABLED = null;
    private static final int DEFAULT_OUTPUT_IMAGE_FORMAT = 1;
    private static final boolean DEFAULT_OUTPUT_IMAGE_ROTATION_ENABLED = false;
    private static final int NON_BLOCKING_IMAGE_DEPTH = 4;
    public static final int OUTPUT_IMAGE_FORMAT_RGBA_8888 = 2;
    public static final int OUTPUT_IMAGE_FORMAT_YUV_420_888 = 1;
    public static final int STRATEGY_BLOCK_PRODUCER = 1;
    public static final int STRATEGY_KEEP_ONLY_LATEST = 0;
    private static final java.lang.String TAG = "ImageAnalysis";
    private final java.lang.Object mAnalysisLock;

    @androidx.annotation.Nullable
    private androidx.camera.core.impl.DeferrableSurface mDeferrableSurface;
    final androidx.camera.core.ImageAnalysisAbstractAnalyzer mImageAnalysisAbstractAnalyzer;
    androidx.camera.core.impl.SessionConfig.Builder mSessionConfigBuilder;

    @androidx.annotation.GuardedBy("mAnalysisLock")
    private androidx.camera.core.ImageAnalysis.Analyzer mSubscribedAnalyzer;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface Analyzer {
        void analyze(@androidx.annotation.NonNull androidx.camera.core.ImageProxy r1);

        @androidx.annotation.Nullable
        android.util.Size getDefaultTargetResolution();

        int getTargetCoordinateSystem();

        void updateTransform(@androidx.annotation.Nullable android.graphics.Matrix r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public @interface BackpressureStrategy {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Builder implements androidx.camera.core.impl.ImageOutputConfig.Builder<androidx.camera.core.ImageAnalysis.Builder>, androidx.camera.core.internal.ThreadConfig.Builder<androidx.camera.core.ImageAnalysis.Builder>, androidx.camera.core.impl.UseCaseConfig.Builder<androidx.camera.core.ImageAnalysis, androidx.camera.core.impl.ImageAnalysisConfig, androidx.camera.core.ImageAnalysis.Builder>, androidx.camera.core.impl.ImageInputConfig.Builder<androidx.camera.core.ImageAnalysis.Builder> {
        private final androidx.camera.core.impl.MutableOptionsBundle mMutableConfig;

        public Builder() {
                r1 = this;
                androidx.camera.core.impl.MutableOptionsBundle r0 = androidx.camera.core.impl.MutableOptionsBundle.create()
                r1.<init>(r0)
                return
        }

        private Builder(androidx.camera.core.impl.MutableOptionsBundle r4) {
                r3 = this;
                r3.<init>()
                r3.mMutableConfig = r4
                androidx.camera.core.impl.Config$Option<java.lang.Class<?>> r0 = androidx.camera.core.internal.TargetConfig.OPTION_TARGET_CLASS
                r1 = 0
                java.lang.Object r4 = r4.retrieveOption(r0, r1)
                java.lang.Class r4 = (java.lang.Class) r4
                java.lang.Class<androidx.camera.core.ImageAnalysis> r0 = androidx.camera.core.ImageAnalysis.class
                if (r4 == 0) goto L38
                boolean r1 = r4.equals(r0)
                if (r1 == 0) goto L19
                goto L38
            L19:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Invalid target class configuration for "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = ": "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
            L38:
                r3.setTargetClass(r0)
                return
        }

        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        static androidx.camera.core.ImageAnalysis.Builder fromConfig(@androidx.annotation.NonNull androidx.camera.core.impl.Config r1) {
                androidx.camera.core.ImageAnalysis$Builder r0 = new androidx.camera.core.ImageAnalysis$Builder
                androidx.camera.core.impl.MutableOptionsBundle r1 = androidx.camera.core.impl.MutableOptionsBundle.from(r1)
                r0.<init>(r1)
                return r0
        }

        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public static androidx.camera.core.ImageAnalysis.Builder fromConfig(@androidx.annotation.NonNull androidx.camera.core.impl.ImageAnalysisConfig r1) {
                androidx.camera.core.ImageAnalysis$Builder r0 = new androidx.camera.core.ImageAnalysis$Builder
                androidx.camera.core.impl.MutableOptionsBundle r1 = androidx.camera.core.impl.MutableOptionsBundle.from(r1)
                r0.<init>(r1)
                return r0
        }

        @Override // androidx.camera.core.ExtendableBuilder
        @androidx.annotation.NonNull
        public androidx.camera.core.ImageAnalysis build() {
                r2 = this;
                androidx.camera.core.impl.ImageAnalysisConfig r0 = r2.getUseCaseConfig()
                androidx.camera.core.impl.z.s(r0)
                androidx.camera.core.ImageAnalysis r1 = new androidx.camera.core.ImageAnalysis
                r1.<init>(r0)
                return r1
        }

        @Override // androidx.camera.core.ExtendableBuilder
        @androidx.annotation.NonNull
        public /* bridge */ /* synthetic */ java.lang.Object build() {
                r1 = this;
                androidx.camera.core.ImageAnalysis r0 = r1.build()
                return r0
        }

        @Override // androidx.camera.core.ExtendableBuilder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.impl.MutableConfig getMutableConfig() {
                r1 = this;
                androidx.camera.core.impl.MutableOptionsBundle r0 = r1.mMutableConfig
                return r0
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.impl.ImageAnalysisConfig getUseCaseConfig() {
                r2 = this;
                androidx.camera.core.impl.ImageAnalysisConfig r0 = new androidx.camera.core.impl.ImageAnalysisConfig
                androidx.camera.core.impl.MutableOptionsBundle r1 = r2.mMutableConfig
                androidx.camera.core.impl.OptionsBundle r1 = androidx.camera.core.impl.OptionsBundle.from(r1)
                r0.<init>(r1)
                return r0
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ androidx.camera.core.impl.ImageAnalysisConfig getUseCaseConfig() {
                r1 = this;
                androidx.camera.core.impl.ImageAnalysisConfig r0 = r1.getUseCaseConfig()
                return r0
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.internal.ThreadConfig.Builder
        @androidx.annotation.NonNull
        public androidx.camera.core.ImageAnalysis.Builder setBackgroundExecutor(@androidx.annotation.NonNull java.util.concurrent.Executor r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<java.util.concurrent.Executor> r1 = androidx.camera.core.internal.ThreadConfig.OPTION_BACKGROUND_EXECUTOR
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.internal.ThreadConfig.Builder
        @androidx.annotation.NonNull
        public /* bridge */ /* synthetic */ androidx.camera.core.ImageAnalysis.Builder setBackgroundExecutor(@androidx.annotation.NonNull java.util.concurrent.Executor r1) {
                r0 = this;
                androidx.camera.core.ImageAnalysis$Builder r1 = r0.setBackgroundExecutor(r1)
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.ImageAnalysis.Builder setBackpressureStrategy(int r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<java.lang.Integer> r1 = androidx.camera.core.impl.ImageAnalysisConfig.OPTION_BACKPRESSURE_STRATEGY
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r0.insertOption(r1, r3)
                return r2
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
        public androidx.camera.core.ImageAnalysis.Builder setCameraSelector(@androidx.annotation.NonNull androidx.camera.core.CameraSelector r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<androidx.camera.core.CameraSelector> r1 = androidx.camera.core.impl.UseCaseConfig.OPTION_CAMERA_SELECTOR
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
        public /* bridge */ /* synthetic */ androidx.camera.core.ImageAnalysis.Builder setCameraSelector(@androidx.annotation.NonNull androidx.camera.core.CameraSelector r1) {
                r0 = this;
                androidx.camera.core.ImageAnalysis$Builder r1 = r0.setCameraSelector(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.ImageAnalysis.Builder setCaptureOptionUnpacker(@androidx.annotation.NonNull androidx.camera.core.impl.CaptureConfig.OptionUnpacker r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<androidx.camera.core.impl.CaptureConfig$OptionUnpacker> r1 = androidx.camera.core.impl.UseCaseConfig.OPTION_CAPTURE_CONFIG_UNPACKER
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ androidx.camera.core.ImageAnalysis.Builder setCaptureOptionUnpacker(@androidx.annotation.NonNull androidx.camera.core.impl.CaptureConfig.OptionUnpacker r1) {
                r0 = this;
                androidx.camera.core.ImageAnalysis$Builder r1 = r0.setCaptureOptionUnpacker(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.ImageAnalysis.Builder setCaptureType(@androidx.annotation.NonNull androidx.camera.core.impl.UseCaseConfigFactory.CaptureType r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<androidx.camera.core.impl.UseCaseConfigFactory$CaptureType> r1 = androidx.camera.core.impl.UseCaseConfig.OPTION_CAPTURE_TYPE
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ androidx.camera.core.ImageAnalysis.Builder setCaptureType(@androidx.annotation.NonNull androidx.camera.core.impl.UseCaseConfigFactory.CaptureType r1) {
                r0 = this;
                androidx.camera.core.ImageAnalysis$Builder r1 = r0.setCaptureType(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.ImageAnalysis.Builder setCustomOrderedResolutions(@androidx.annotation.NonNull java.util.List<android.util.Size> r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<java.util.List<android.util.Size>> r1 = androidx.camera.core.impl.ImageOutputConfig.OPTION_CUSTOM_ORDERED_RESOLUTIONS
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ androidx.camera.core.ImageAnalysis.Builder setCustomOrderedResolutions(@androidx.annotation.NonNull java.util.List r1) {
                r0 = this;
                androidx.camera.core.ImageAnalysis$Builder r1 = r0.setCustomOrderedResolutions(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.ImageAnalysis.Builder setDefaultCaptureConfig(@androidx.annotation.NonNull androidx.camera.core.impl.CaptureConfig r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<androidx.camera.core.impl.CaptureConfig> r1 = androidx.camera.core.impl.UseCaseConfig.OPTION_DEFAULT_CAPTURE_CONFIG
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ androidx.camera.core.ImageAnalysis.Builder setDefaultCaptureConfig(@androidx.annotation.NonNull androidx.camera.core.impl.CaptureConfig r1) {
                r0 = this;
                androidx.camera.core.ImageAnalysis$Builder r1 = r0.setDefaultCaptureConfig(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.ImageAnalysis.Builder setDefaultResolution(@androidx.annotation.NonNull android.util.Size r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<android.util.Size> r1 = androidx.camera.core.impl.ImageOutputConfig.OPTION_DEFAULT_RESOLUTION
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ androidx.camera.core.ImageAnalysis.Builder setDefaultResolution(@androidx.annotation.NonNull android.util.Size r1) {
                r0 = this;
                androidx.camera.core.ImageAnalysis$Builder r1 = r0.setDefaultResolution(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.ImageAnalysis.Builder setDefaultSessionConfig(@androidx.annotation.NonNull androidx.camera.core.impl.SessionConfig r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<androidx.camera.core.impl.SessionConfig> r1 = androidx.camera.core.impl.UseCaseConfig.OPTION_DEFAULT_SESSION_CONFIG
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ androidx.camera.core.ImageAnalysis.Builder setDefaultSessionConfig(@androidx.annotation.NonNull androidx.camera.core.impl.SessionConfig r1) {
                r0 = this;
                androidx.camera.core.ImageAnalysis$Builder r1 = r0.setDefaultSessionConfig(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageInputConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
        public androidx.camera.core.ImageAnalysis.Builder setDynamicRange(@androidx.annotation.NonNull androidx.camera.core.DynamicRange r3) {
                r2 = this;
                androidx.camera.core.DynamicRange r0 = androidx.camera.core.DynamicRange.SDR
                boolean r0 = java.util.Objects.equals(r0, r3)
                if (r0 == 0) goto L12
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<androidx.camera.core.DynamicRange> r1 = androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_DYNAMIC_RANGE
                r0.insertOption(r1, r3)
                return r2
            L12:
                java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "ImageAnalysis currently only supports SDR"
                r3.<init>(r0)
                throw r3
        }

        @Override // androidx.camera.core.impl.ImageInputConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
        public /* bridge */ /* synthetic */ androidx.camera.core.ImageAnalysis.Builder setDynamicRange(@androidx.annotation.NonNull androidx.camera.core.DynamicRange r1) {
                r0 = this;
                androidx.camera.core.ImageAnalysis$Builder r1 = r0.setDynamicRange(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.ImageAnalysis.Builder setHighResolutionDisabled(boolean r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<java.lang.Boolean> r1 = androidx.camera.core.impl.UseCaseConfig.OPTION_HIGH_RESOLUTION_DISABLED
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ androidx.camera.core.ImageAnalysis.Builder setHighResolutionDisabled(boolean r1) {
                r0 = this;
                androidx.camera.core.ImageAnalysis$Builder r1 = r0.setHighResolutionDisabled(r1)
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.ImageAnalysis.Builder setImageQueueDepth(int r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<java.lang.Integer> r1 = androidx.camera.core.impl.ImageAnalysisConfig.OPTION_IMAGE_QUEUE_DEPTH
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r0.insertOption(r1, r3)
                return r2
        }

        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.ImageAnalysis.Builder setImageReaderProxyProvider(@androidx.annotation.NonNull androidx.camera.core.ImageReaderProxyProvider r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<androidx.camera.core.ImageReaderProxyProvider> r1 = androidx.camera.core.impl.ImageAnalysisConfig.OPTION_IMAGE_READER_PROXY_PROVIDER
                r0.insertOption(r1, r3)
                return r2
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.ImageAnalysis.Builder setMaxResolution(@androidx.annotation.NonNull android.util.Size r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<android.util.Size> r1 = androidx.camera.core.impl.ImageOutputConfig.OPTION_MAX_RESOLUTION
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ androidx.camera.core.ImageAnalysis.Builder setMaxResolution(@androidx.annotation.NonNull android.util.Size r1) {
                r0 = this;
                androidx.camera.core.ImageAnalysis$Builder r1 = r0.setMaxResolution(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.ImageAnalysis.Builder setMirrorMode(int r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "setMirrorMode is not supported."
                r2.<init>(r0)
                throw r2
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ androidx.camera.core.ImageAnalysis.Builder setMirrorMode(int r1) {
                r0 = this;
                androidx.camera.core.ImageAnalysis$Builder r1 = r0.setMirrorMode(r1)
                return r1
        }

        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.ImageAnalysis.Builder setOnePixelShiftEnabled(boolean r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<java.lang.Boolean> r1 = androidx.camera.core.impl.ImageAnalysisConfig.OPTION_ONE_PIXEL_SHIFT_ENABLED
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                r0.insertOption(r1, r3)
                return r2
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.ImageAnalysis.Builder setOutputImageFormat(int r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<java.lang.Integer> r1 = androidx.camera.core.impl.ImageAnalysisConfig.OPTION_OUTPUT_IMAGE_FORMAT
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r0.insertOption(r1, r3)
                return r2
        }

        @androidx.annotation.NonNull
        @androidx.annotation.RequiresApi(23)
        public androidx.camera.core.ImageAnalysis.Builder setOutputImageRotationEnabled(boolean r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<java.lang.Boolean> r1 = androidx.camera.core.impl.ImageAnalysisConfig.OPTION_OUTPUT_IMAGE_ROTATION_ENABLED
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                r0.insertOption(r1, r3)
                return r2
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        public androidx.camera.core.ImageAnalysis.Builder setResolutionSelector(@androidx.annotation.NonNull androidx.camera.core.resolutionselector.ResolutionSelector r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<androidx.camera.core.resolutionselector.ResolutionSelector> r1 = androidx.camera.core.impl.ImageOutputConfig.OPTION_RESOLUTION_SELECTOR
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        public /* bridge */ /* synthetic */ androidx.camera.core.ImageAnalysis.Builder setResolutionSelector(@androidx.annotation.NonNull androidx.camera.core.resolutionselector.ResolutionSelector r1) {
                r0 = this;
                androidx.camera.core.ImageAnalysis$Builder r1 = r0.setResolutionSelector(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.ImageAnalysis.Builder setSessionOptionUnpacker(@androidx.annotation.NonNull androidx.camera.core.impl.SessionConfig.OptionUnpacker r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<androidx.camera.core.impl.SessionConfig$OptionUnpacker> r1 = androidx.camera.core.impl.UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ androidx.camera.core.ImageAnalysis.Builder setSessionOptionUnpacker(@androidx.annotation.NonNull androidx.camera.core.impl.SessionConfig.OptionUnpacker r1) {
                r0 = this;
                androidx.camera.core.ImageAnalysis$Builder r1 = r0.setSessionOptionUnpacker(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.ImageAnalysis.Builder setSupportedResolutions(@androidx.annotation.NonNull java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>>> r1 = androidx.camera.core.impl.ImageOutputConfig.OPTION_SUPPORTED_RESOLUTIONS
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ androidx.camera.core.ImageAnalysis.Builder setSupportedResolutions(@androidx.annotation.NonNull java.util.List r1) {
                r0 = this;
                androidx.camera.core.ImageAnalysis$Builder r1 = r0.setSupportedResolutions(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.ImageAnalysis.Builder setSurfaceOccupancyPriority(int r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<java.lang.Integer> r1 = androidx.camera.core.impl.UseCaseConfig.OPTION_SURFACE_OCCUPANCY_PRIORITY
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ androidx.camera.core.ImageAnalysis.Builder setSurfaceOccupancyPriority(int r1) {
                r0 = this;
                androidx.camera.core.ImageAnalysis$Builder r1 = r0.setSurfaceOccupancyPriority(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        @java.lang.Deprecated
        public androidx.camera.core.ImageAnalysis.Builder setTargetAspectRatio(int r3) {
                r2 = this;
                r0 = -1
                if (r3 != r0) goto L4
                r3 = 0
            L4:
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<java.lang.Integer> r1 = androidx.camera.core.impl.ImageOutputConfig.OPTION_TARGET_ASPECT_RATIO
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        @java.lang.Deprecated
        public /* bridge */ /* synthetic */ androidx.camera.core.ImageAnalysis.Builder setTargetAspectRatio(int r1) {
                r0 = this;
                androidx.camera.core.ImageAnalysis$Builder r1 = r0.setTargetAspectRatio(r1)
                return r1
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.ImageAnalysis.Builder setTargetClass(@androidx.annotation.NonNull java.lang.Class<androidx.camera.core.ImageAnalysis> r4) {
                r3 = this;
                androidx.camera.core.impl.MutableConfig r0 = r3.getMutableConfig()
                androidx.camera.core.impl.Config$Option<java.lang.Class<?>> r1 = androidx.camera.core.internal.TargetConfig.OPTION_TARGET_CLASS
                r0.insertOption(r1, r4)
                androidx.camera.core.impl.MutableConfig r0 = r3.getMutableConfig()
                androidx.camera.core.impl.Config$Option<java.lang.String> r1 = androidx.camera.core.internal.TargetConfig.OPTION_TARGET_NAME
                r2 = 0
                java.lang.Object r0 = r0.retrieveOption(r1, r2)
                if (r0 != 0) goto L35
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r4 = r4.getCanonicalName()
                r0.append(r4)
                java.lang.String r4 = "-"
                r0.append(r4)
                java.util.UUID r4 = java.util.UUID.randomUUID()
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r3.setTargetName(r4)
            L35:
                return r3
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ java.lang.Object setTargetClass(@androidx.annotation.NonNull java.lang.Class r1) {
                r0 = this;
                androidx.camera.core.ImageAnalysis$Builder r1 = r0.setTargetClass(r1)
                return r1
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        @androidx.annotation.NonNull
        public androidx.camera.core.ImageAnalysis.Builder setTargetName(@androidx.annotation.NonNull java.lang.String r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<java.lang.String> r1 = androidx.camera.core.internal.TargetConfig.OPTION_TARGET_NAME
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        @androidx.annotation.NonNull
        public /* bridge */ /* synthetic */ java.lang.Object setTargetName(@androidx.annotation.NonNull java.lang.String r1) {
                r0 = this;
                androidx.camera.core.ImageAnalysis$Builder r1 = r0.setTargetName(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        @java.lang.Deprecated
        public androidx.camera.core.ImageAnalysis.Builder setTargetResolution(@androidx.annotation.NonNull android.util.Size r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<android.util.Size> r1 = androidx.camera.core.impl.ImageOutputConfig.OPTION_TARGET_RESOLUTION
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        @java.lang.Deprecated
        public /* bridge */ /* synthetic */ androidx.camera.core.ImageAnalysis.Builder setTargetResolution(@androidx.annotation.NonNull android.util.Size r1) {
                r0 = this;
                androidx.camera.core.ImageAnalysis$Builder r1 = r0.setTargetResolution(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        public androidx.camera.core.ImageAnalysis.Builder setTargetRotation(int r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<java.lang.Integer> r1 = androidx.camera.core.impl.ImageOutputConfig.OPTION_TARGET_ROTATION
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        public /* bridge */ /* synthetic */ androidx.camera.core.ImageAnalysis.Builder setTargetRotation(int r1) {
                r0 = this;
                androidx.camera.core.ImageAnalysis$Builder r1 = r0.setTargetRotation(r1)
                return r1
        }

        @Override // androidx.camera.core.internal.UseCaseEventConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.ImageAnalysis.Builder setUseCaseEventCallback(@androidx.annotation.NonNull androidx.camera.core.UseCase.EventCallback r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<androidx.camera.core.UseCase$EventCallback> r1 = androidx.camera.core.internal.UseCaseEventConfig.OPTION_USE_CASE_EVENT_CALLBACK
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.internal.UseCaseEventConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ java.lang.Object setUseCaseEventCallback(@androidx.annotation.NonNull androidx.camera.core.UseCase.EventCallback r1) {
                r0 = this;
                androidx.camera.core.ImageAnalysis$Builder r1 = r0.setUseCaseEventCallback(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.ImageAnalysis.Builder setZslDisabled(boolean r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<java.lang.Boolean> r1 = androidx.camera.core.impl.UseCaseConfig.OPTION_ZSL_DISABLED
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ androidx.camera.core.ImageAnalysis.Builder setZslDisabled(boolean r1) {
                r0 = this;
                androidx.camera.core.ImageAnalysis$Builder r1 = r0.setZslDisabled(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static final class Defaults implements androidx.camera.core.impl.ConfigProvider<androidx.camera.core.impl.ImageAnalysisConfig> {
        private static final int DEFAULT_ASPECT_RATIO = 0;
        private static final androidx.camera.core.impl.ImageAnalysisConfig DEFAULT_CONFIG = null;
        private static final androidx.camera.core.DynamicRange DEFAULT_DYNAMIC_RANGE = null;
        private static final androidx.camera.core.resolutionselector.ResolutionSelector DEFAULT_RESOLUTION_SELECTOR = null;
        private static final int DEFAULT_SURFACE_OCCUPANCY_PRIORITY = 1;
        private static final android.util.Size DEFAULT_TARGET_RESOLUTION = null;

        static {
                android.util.Size r0 = new android.util.Size
                r1 = 640(0x280, float:8.97E-43)
                r2 = 480(0x1e0, float:6.73E-43)
                r0.<init>(r1, r2)
                androidx.camera.core.ImageAnalysis.Defaults.DEFAULT_TARGET_RESOLUTION = r0
                androidx.camera.core.DynamicRange r1 = androidx.camera.core.DynamicRange.SDR
                androidx.camera.core.ImageAnalysis.Defaults.DEFAULT_DYNAMIC_RANGE = r1
                androidx.camera.core.resolutionselector.ResolutionSelector$Builder r2 = new androidx.camera.core.resolutionselector.ResolutionSelector$Builder
                r2.<init>()
                androidx.camera.core.resolutionselector.AspectRatioStrategy r3 = androidx.camera.core.resolutionselector.AspectRatioStrategy.RATIO_4_3_FALLBACK_AUTO_STRATEGY
                androidx.camera.core.resolutionselector.ResolutionSelector$Builder r2 = r2.setAspectRatioStrategy(r3)
                androidx.camera.core.resolutionselector.ResolutionStrategy r3 = new androidx.camera.core.resolutionselector.ResolutionStrategy
                android.util.Size r4 = androidx.camera.core.internal.utils.SizeUtil.RESOLUTION_VGA
                r5 = 1
                r3.<init>(r4, r5)
                androidx.camera.core.resolutionselector.ResolutionSelector$Builder r2 = r2.setResolutionStrategy(r3)
                androidx.camera.core.resolutionselector.ResolutionSelector r2 = r2.build()
                androidx.camera.core.ImageAnalysis.Defaults.DEFAULT_RESOLUTION_SELECTOR = r2
                androidx.camera.core.ImageAnalysis$Builder r3 = new androidx.camera.core.ImageAnalysis$Builder
                r3.<init>()
                androidx.camera.core.ImageAnalysis$Builder r0 = r3.setDefaultResolution(r0)
                androidx.camera.core.ImageAnalysis$Builder r0 = r0.setSurfaceOccupancyPriority(r5)
                r3 = 0
                androidx.camera.core.ImageAnalysis$Builder r0 = r0.setTargetAspectRatio(r3)
                androidx.camera.core.ImageAnalysis$Builder r0 = r0.setResolutionSelector(r2)
                androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r2 = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.IMAGE_ANALYSIS
                androidx.camera.core.ImageAnalysis$Builder r0 = r0.setCaptureType(r2)
                androidx.camera.core.ImageAnalysis$Builder r0 = r0.setDynamicRange(r1)
                androidx.camera.core.impl.ImageAnalysisConfig r0 = r0.getUseCaseConfig()
                androidx.camera.core.ImageAnalysis.Defaults.DEFAULT_CONFIG = r0
                return
        }

        public Defaults() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.camera.core.impl.ConfigProvider
        @androidx.annotation.NonNull
        public /* bridge */ /* synthetic */ androidx.camera.core.impl.ImageAnalysisConfig getConfig() {
                r1 = this;
                androidx.camera.core.impl.ImageAnalysisConfig r0 = r1.getConfig2()
                return r0
        }

        @Override // androidx.camera.core.impl.ConfigProvider
        @androidx.annotation.NonNull
        /* renamed from: getConfig, reason: avoid collision after fix types in other method */
        public androidx.camera.core.impl.ImageAnalysisConfig getConfig2() {
                r1 = this;
                androidx.camera.core.impl.ImageAnalysisConfig r0 = androidx.camera.core.ImageAnalysis.Defaults.DEFAULT_CONFIG
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public @interface OutputImageFormat {
    }

    static {
            androidx.camera.core.ImageAnalysis$Defaults r0 = new androidx.camera.core.ImageAnalysis$Defaults
            r0.<init>()
            androidx.camera.core.ImageAnalysis.DEFAULT_CONFIG = r0
            r0 = 0
            androidx.camera.core.ImageAnalysis.DEFAULT_ONE_PIXEL_SHIFT_ENABLED = r0
            return
    }

    ImageAnalysis(@androidx.annotation.NonNull androidx.camera.core.impl.ImageAnalysisConfig r3) {
            r2 = this;
            r2.<init>(r3)
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.mAnalysisLock = r0
            androidx.camera.core.impl.UseCaseConfig r0 = r2.getCurrentConfig()
            androidx.camera.core.impl.ImageAnalysisConfig r0 = (androidx.camera.core.impl.ImageAnalysisConfig) r0
            r1 = 0
            int r0 = r0.getBackpressureStrategy(r1)
            r1 = 1
            if (r0 != r1) goto L20
            androidx.camera.core.ImageAnalysisBlockingAnalyzer r3 = new androidx.camera.core.ImageAnalysisBlockingAnalyzer
            r3.<init>()
            r2.mImageAnalysisAbstractAnalyzer = r3
            goto L2f
        L20:
            androidx.camera.core.ImageAnalysisNonBlockingAnalyzer r0 = new androidx.camera.core.ImageAnalysisNonBlockingAnalyzer
            java.util.concurrent.Executor r1 = androidx.camera.core.impl.utils.executor.CameraXExecutors.highPriorityExecutor()
            java.util.concurrent.Executor r3 = r3.getBackgroundExecutor(r1)
            r0.<init>(r3)
            r2.mImageAnalysisAbstractAnalyzer = r0
        L2f:
            androidx.camera.core.ImageAnalysisAbstractAnalyzer r3 = r2.mImageAnalysisAbstractAnalyzer
            int r0 = r2.getOutputImageFormat()
            r3.setOutputImageFormat(r0)
            androidx.camera.core.ImageAnalysisAbstractAnalyzer r3 = r2.mImageAnalysisAbstractAnalyzer
            boolean r0 = r2.isOutputImageRotationEnabled()
            r3.setOutputImageRotationEnabled(r0)
            return
    }

    public static /* synthetic */ void a(androidx.camera.core.SafeCloseImageReaderProxy r0, androidx.camera.core.SafeCloseImageReaderProxy r1) {
            r0.safeClose()
            if (r1 == 0) goto L8
            r1.safeClose()
        L8:
            return
    }

    public static /* synthetic */ void b(androidx.camera.core.ImageAnalysis.Analyzer r0, androidx.camera.core.ImageProxy r1) {
            r0.analyze(r1)
            return
    }

    public static /* synthetic */ void c(androidx.camera.core.ImageAnalysis r0, java.lang.String r1, androidx.camera.core.impl.ImageAnalysisConfig r2, androidx.camera.core.impl.StreamSpec r3, androidx.camera.core.impl.SessionConfig r4, androidx.camera.core.impl.SessionConfig.SessionError r5) {
            r0.clearPipeline()
            androidx.camera.core.ImageAnalysisAbstractAnalyzer r4 = r0.mImageAnalysisAbstractAnalyzer
            r4.clearCache()
            boolean r4 = r0.isCurrentCamera(r1)
            if (r4 == 0) goto L1c
            androidx.camera.core.impl.SessionConfig$Builder r1 = r0.createPipeline(r1, r2, r3)
            androidx.camera.core.impl.SessionConfig r1 = r1.build()
            r0.updateSessionConfig(r1)
            r0.notifyReset()
        L1c:
            return
    }

    public static /* synthetic */ java.util.List d(android.util.Size r0, java.util.List r1, int r2) {
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            boolean r1 = r2.contains(r0)
            if (r1 == 0) goto L12
            r2.remove(r0)
            r1 = 0
            r2.add(r1, r0)
        L12:
            return r2
    }

    private boolean isFlipWH(@androidx.annotation.NonNull androidx.camera.core.impl.CameraInternal r3) {
            r2 = this;
            boolean r0 = r2.isOutputImageRotationEnabled()
            r1 = 0
            if (r0 == 0) goto L11
            int r3 = r2.getRelativeRotation(r3)
            int r3 = r3 % 180
            if (r3 == 0) goto L11
            r3 = 1
            return r3
        L11:
            return r1
    }

    private void tryUpdateRelativeRotation() {
            r2 = this;
            androidx.camera.core.impl.CameraInternal r0 = r2.getCamera()
            if (r0 == 0) goto Lf
            androidx.camera.core.ImageAnalysisAbstractAnalyzer r1 = r2.mImageAnalysisAbstractAnalyzer
            int r0 = r2.getRelativeRotation(r0)
            r1.setRelativeRotation(r0)
        Lf:
            return
    }

    public void clearAnalyzer() {
            r3 = this;
            java.lang.Object r0 = r3.mAnalysisLock
            monitor-enter(r0)
            androidx.camera.core.ImageAnalysisAbstractAnalyzer r1 = r3.mImageAnalysisAbstractAnalyzer     // Catch: java.lang.Throwable -> L11
            r2 = 0
            r1.setAnalyzer(r2, r2)     // Catch: java.lang.Throwable -> L11
            androidx.camera.core.ImageAnalysis$Analyzer r1 = r3.mSubscribedAnalyzer     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L13
            r3.notifyInactive()     // Catch: java.lang.Throwable -> L11
            goto L13
        L11:
            r1 = move-exception
            goto L17
        L13:
            r3.mSubscribedAnalyzer = r2     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1
    }

    void clearPipeline() {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.core.impl.DeferrableSurface r0 = r1.mDeferrableSurface
            if (r0 == 0) goto Ld
            r0.close()
            r0 = 0
            r1.mDeferrableSurface = r0
        Ld:
            return
    }

    androidx.camera.core.impl.SessionConfig.Builder createPipeline(@androidx.annotation.NonNull java.lang.String r12, @androidx.annotation.NonNull androidx.camera.core.impl.ImageAnalysisConfig r13, @androidx.annotation.NonNull androidx.camera.core.impl.StreamSpec r14) {
            r11 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            android.util.Size r0 = r14.getResolution()
            java.util.concurrent.Executor r1 = androidx.camera.core.impl.utils.executor.CameraXExecutors.highPriorityExecutor()
            java.util.concurrent.Executor r1 = r13.getBackgroundExecutor(r1)
            java.lang.Object r1 = androidx.core.util.Preconditions.checkNotNull(r1)
            java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
            int r2 = r11.getBackpressureStrategy()
            r3 = 1
            if (r2 != r3) goto L22
            int r2 = r11.getImageQueueDepth()
            r8 = r2
            goto L24
        L22:
            r2 = 4
            r8 = 4
        L24:
            androidx.camera.core.ImageReaderProxyProvider r2 = r13.getImageReaderProxyProvider()
            if (r2 == 0) goto L46
            androidx.camera.core.SafeCloseImageReaderProxy r2 = new androidx.camera.core.SafeCloseImageReaderProxy
            androidx.camera.core.ImageReaderProxyProvider r4 = r13.getImageReaderProxyProvider()
            int r5 = r0.getWidth()
            int r6 = r0.getHeight()
            int r7 = r11.getImageFormat()
            r9 = 0
            androidx.camera.core.impl.ImageReaderProxy r4 = r4.newInstance(r5, r6, r7, r8, r9)
            r2.<init>(r4)
            goto L5b
        L46:
            androidx.camera.core.SafeCloseImageReaderProxy r2 = new androidx.camera.core.SafeCloseImageReaderProxy
            int r4 = r0.getWidth()
            int r5 = r0.getHeight()
            int r6 = r11.getImageFormat()
            androidx.camera.core.impl.ImageReaderProxy r4 = androidx.camera.core.ImageReaderProxys.createIsolatedReader(r4, r5, r6, r8)
            r2.<init>(r4)
        L5b:
            androidx.camera.core.impl.CameraInternal r4 = r11.getCamera()
            r5 = 0
            if (r4 == 0) goto L6b
            androidx.camera.core.impl.CameraInternal r4 = r11.getCamera()
            boolean r4 = r11.isFlipWH(r4)
            goto L6c
        L6b:
            r4 = 0
        L6c:
            if (r4 == 0) goto L73
            int r6 = r0.getHeight()
            goto L77
        L73:
            int r6 = r0.getWidth()
        L77:
            if (r4 == 0) goto L7e
            int r4 = r0.getWidth()
            goto L82
        L7e:
            int r4 = r0.getHeight()
        L82:
            int r7 = r11.getOutputImageFormat()
            r8 = 2
            r9 = 35
            if (r7 != r8) goto L8d
            r7 = 1
            goto L8f
        L8d:
            r7 = 35
        L8f:
            int r10 = r11.getImageFormat()
            if (r10 != r9) goto L9d
            int r10 = r11.getOutputImageFormat()
            if (r10 != r8) goto L9d
            r8 = 1
            goto L9e
        L9d:
            r8 = 0
        L9e:
            int r10 = r11.getImageFormat()
            if (r10 != r9) goto Lc1
            androidx.camera.core.impl.CameraInternal r9 = r11.getCamera()
            if (r9 == 0) goto Lb4
            androidx.camera.core.impl.CameraInternal r9 = r11.getCamera()
            int r9 = r11.getRelativeRotation(r9)
            if (r9 != 0) goto Lc2
        Lb4:
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            java.lang.Boolean r10 = r11.getOnePixelShiftEnabled()
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto Lc1
            goto Lc2
        Lc1:
            r3 = 0
        Lc2:
            if (r8 != 0) goto Lc9
            if (r3 == 0) goto Lc7
            goto Lc9
        Lc7:
            r3 = 0
            goto Ld6
        Lc9:
            androidx.camera.core.SafeCloseImageReaderProxy r3 = new androidx.camera.core.SafeCloseImageReaderProxy
            int r5 = r2.getMaxImages()
            androidx.camera.core.impl.ImageReaderProxy r4 = androidx.camera.core.ImageReaderProxys.createIsolatedReader(r6, r4, r7, r5)
            r3.<init>(r4)
        Ld6:
            if (r3 == 0) goto Ldd
            androidx.camera.core.ImageAnalysisAbstractAnalyzer r4 = r11.mImageAnalysisAbstractAnalyzer
            r4.setProcessedImageReaderProxy(r3)
        Ldd:
            r11.tryUpdateRelativeRotation()
            androidx.camera.core.ImageAnalysisAbstractAnalyzer r4 = r11.mImageAnalysisAbstractAnalyzer
            r2.setOnImageAvailableListener(r4, r1)
            android.util.Size r1 = r14.getResolution()
            androidx.camera.core.impl.SessionConfig$Builder r1 = androidx.camera.core.impl.SessionConfig.Builder.createFrom(r13, r1)
            androidx.camera.core.impl.Config r4 = r14.getImplementationOptions()
            if (r4 == 0) goto Lfa
            androidx.camera.core.impl.Config r4 = r14.getImplementationOptions()
            r1.addImplementationOptions(r4)
        Lfa:
            androidx.camera.core.impl.DeferrableSurface r4 = r11.mDeferrableSurface
            if (r4 == 0) goto L101
            r4.close()
        L101:
            androidx.camera.core.impl.ImmediateSurface r4 = new androidx.camera.core.impl.ImmediateSurface
            android.view.Surface r5 = r2.getSurface()
            int r6 = r11.getImageFormat()
            r4.<init>(r5, r0, r6)
            r11.mDeferrableSurface = r4
            com.google.common.util.concurrent.ListenableFuture r0 = r4.getTerminationFuture()
            androidx.camera.core.l r4 = new androidx.camera.core.l
            r4.<init>(r2, r3)
            java.util.concurrent.ScheduledExecutorService r2 = androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor()
            r0.addListener(r4, r2)
            android.util.Range r0 = r14.getExpectedFrameRateRange()
            r1.setExpectedFrameRateRange(r0)
            androidx.camera.core.impl.DeferrableSurface r0 = r11.mDeferrableSurface
            androidx.camera.core.DynamicRange r2 = r14.getDynamicRange()
            r1.addSurface(r0, r2)
            androidx.camera.core.m r0 = new androidx.camera.core.m
            r0.<init>(r11, r12, r13, r14)
            r1.addErrorListener(r0)
            return r1
    }

    @androidx.annotation.Nullable
    @androidx.camera.core.ExperimentalUseCaseApi
    public java.util.concurrent.Executor getBackgroundExecutor() {
            r2 = this;
            androidx.camera.core.impl.UseCaseConfig r0 = r2.getCurrentConfig()
            androidx.camera.core.impl.ImageAnalysisConfig r0 = (androidx.camera.core.impl.ImageAnalysisConfig) r0
            r1 = 0
            java.util.concurrent.Executor r0 = r0.getBackgroundExecutor(r1)
            return r0
    }

    public int getBackpressureStrategy() {
            r2 = this;
            androidx.camera.core.impl.UseCaseConfig r0 = r2.getCurrentConfig()
            androidx.camera.core.impl.ImageAnalysisConfig r0 = (androidx.camera.core.impl.ImageAnalysisConfig) r0
            r1 = 0
            int r0 = r0.getBackpressureStrategy(r1)
            return r0
    }

    @Override // androidx.camera.core.UseCase
    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.camera.core.impl.UseCaseConfig<?> getDefaultConfig(boolean r4, @androidx.annotation.NonNull androidx.camera.core.impl.UseCaseConfigFactory r5) {
            r3 = this;
            androidx.camera.core.ImageAnalysis$Defaults r0 = androidx.camera.core.ImageAnalysis.DEFAULT_CONFIG
            androidx.camera.core.impl.ImageAnalysisConfig r1 = r0.getConfig2()
            androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r1 = r1.getCaptureType()
            r2 = 1
            androidx.camera.core.impl.Config r5 = r5.getConfig(r1, r2)
            if (r4 == 0) goto L19
            androidx.camera.core.impl.ImageAnalysisConfig r4 = r0.getConfig2()
            androidx.camera.core.impl.Config r5 = androidx.camera.core.impl.o.b(r5, r4)
        L19:
            if (r5 != 0) goto L1d
            r4 = 0
            return r4
        L1d:
            androidx.camera.core.impl.UseCaseConfig$Builder r4 = r3.getUseCaseConfigBuilder(r5)
            androidx.camera.core.impl.UseCaseConfig r4 = r4.getUseCaseConfig()
            return r4
    }

    public int getImageQueueDepth() {
            r2 = this;
            androidx.camera.core.impl.UseCaseConfig r0 = r2.getCurrentConfig()
            androidx.camera.core.impl.ImageAnalysisConfig r0 = (androidx.camera.core.impl.ImageAnalysisConfig) r0
            r1 = 6
            int r0 = r0.getImageQueueDepth(r1)
            return r0
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public java.lang.Boolean getOnePixelShiftEnabled() {
            r2 = this;
            androidx.camera.core.impl.UseCaseConfig r0 = r2.getCurrentConfig()
            androidx.camera.core.impl.ImageAnalysisConfig r0 = (androidx.camera.core.impl.ImageAnalysisConfig) r0
            java.lang.Boolean r1 = androidx.camera.core.ImageAnalysis.DEFAULT_ONE_PIXEL_SHIFT_ENABLED
            java.lang.Boolean r0 = r0.getOnePixelShiftEnabled(r1)
            return r0
    }

    public int getOutputImageFormat() {
            r2 = this;
            androidx.camera.core.impl.UseCaseConfig r0 = r2.getCurrentConfig()
            androidx.camera.core.impl.ImageAnalysisConfig r0 = (androidx.camera.core.impl.ImageAnalysisConfig) r0
            r1 = 1
            int r0 = r0.getOutputImageFormat(r1)
            return r0
    }

    @androidx.annotation.Nullable
    public androidx.camera.core.ResolutionInfo getResolutionInfo() {
            r1 = this;
            androidx.camera.core.ResolutionInfo r0 = r1.getResolutionInfoInternal()
            return r0
    }

    @androidx.annotation.Nullable
    public androidx.camera.core.resolutionselector.ResolutionSelector getResolutionSelector() {
            r2 = this;
            androidx.camera.core.impl.UseCaseConfig r0 = r2.getCurrentConfig()
            androidx.camera.core.impl.ImageOutputConfig r0 = (androidx.camera.core.impl.ImageOutputConfig) r0
            r1 = 0
            androidx.camera.core.resolutionselector.ResolutionSelector r0 = r0.getResolutionSelector(r1)
            return r0
    }

    public int getTargetRotation() {
            r1 = this;
            int r0 = r1.getTargetRotationInternal()
            return r0
    }

    @Override // androidx.camera.core.UseCase
    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.camera.core.impl.UseCaseConfig.Builder<?, ?, ?> getUseCaseConfigBuilder(@androidx.annotation.NonNull androidx.camera.core.impl.Config r1) {
            r0 = this;
            androidx.camera.core.ImageAnalysis$Builder r1 = androidx.camera.core.ImageAnalysis.Builder.fromConfig(r1)
            return r1
    }

    public boolean isOutputImageRotationEnabled() {
            r2 = this;
            androidx.camera.core.impl.UseCaseConfig r0 = r2.getCurrentConfig()
            androidx.camera.core.impl.ImageAnalysisConfig r0 = (androidx.camera.core.impl.ImageAnalysisConfig) r0
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            java.lang.Boolean r0 = r0.isOutputImageRotationEnabled(r1)
            boolean r0 = r0.booleanValue()
            return r0
    }

    @Override // androidx.camera.core.UseCase
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void onBind() {
            r1 = this;
            androidx.camera.core.ImageAnalysisAbstractAnalyzer r0 = r1.mImageAnalysisAbstractAnalyzer
            r0.attach()
            return
    }

    @Override // androidx.camera.core.UseCase
    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    protected androidx.camera.core.impl.UseCaseConfig<?> onMergeConfig(@androidx.annotation.NonNull androidx.camera.core.impl.CameraInfoInternal r6, @androidx.annotation.NonNull androidx.camera.core.impl.UseCaseConfig.Builder<?, ?, ?> r7) {
            r5 = this;
            java.lang.Boolean r0 = r5.getOnePixelShiftEnabled()
            androidx.camera.core.impl.Quirks r1 = r6.getCameraQuirks()
            java.lang.Class<androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk> r2 = androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk.class
            boolean r1 = r1.contains(r2)
            androidx.camera.core.ImageAnalysisAbstractAnalyzer r2 = r5.mImageAnalysisAbstractAnalyzer
            if (r0 != 0) goto L13
            goto L17
        L13:
            boolean r1 = r0.booleanValue()
        L17:
            r2.setOnePixelShiftEnabled(r1)
            java.lang.Object r0 = r5.mAnalysisLock
            monitor-enter(r0)
            androidx.camera.core.ImageAnalysis$Analyzer r1 = r5.mSubscribedAnalyzer     // Catch: java.lang.Throwable -> L27
            r2 = 0
            if (r1 == 0) goto L2a
            android.util.Size r1 = r1.getDefaultTargetResolution()     // Catch: java.lang.Throwable -> L27
            goto L2b
        L27:
            r6 = move-exception
            goto Lc0
        L2a:
            r1 = r2
        L2b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            if (r1 != 0) goto L33
            androidx.camera.core.impl.UseCaseConfig r6 = r7.getUseCaseConfig()
            return r6
        L33:
            androidx.camera.core.impl.MutableConfig r0 = r7.getMutableConfig()
            androidx.camera.core.impl.Config$Option<java.lang.Integer> r3 = androidx.camera.core.impl.ImageOutputConfig.OPTION_TARGET_ROTATION
            r4 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r0 = r0.retrieveOption(r3, r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            int r6 = r6.getSensorRotationDegrees(r0)
            int r6 = r6 % 180
            r0 = 90
            if (r6 != r0) goto L60
            android.util.Size r6 = new android.util.Size
            int r0 = r1.getHeight()
            int r1 = r1.getWidth()
            r6.<init>(r0, r1)
            r1 = r6
        L60:
            androidx.camera.core.impl.UseCaseConfig r6 = r7.getUseCaseConfig()
            androidx.camera.core.impl.Config$Option<android.util.Size> r0 = androidx.camera.core.impl.ImageOutputConfig.OPTION_TARGET_RESOLUTION
            boolean r6 = r6.containsOption(r0)
            if (r6 != 0) goto L73
            androidx.camera.core.impl.MutableConfig r6 = r7.getMutableConfig()
            r6.insertOption(r0, r1)
        L73:
            androidx.camera.core.impl.UseCaseConfig r6 = r7.getUseCaseConfig()
            androidx.camera.core.impl.Config$Option<androidx.camera.core.resolutionselector.ResolutionSelector> r0 = androidx.camera.core.impl.ImageOutputConfig.OPTION_RESOLUTION_SELECTOR
            boolean r6 = r6.containsOption(r0)
            if (r6 == 0) goto Lbb
            androidx.camera.core.impl.UseCaseConfig r6 = r5.getAppConfig()
            java.lang.Object r6 = r6.retrieveOption(r0, r2)
            androidx.camera.core.resolutionselector.ResolutionSelector r6 = (androidx.camera.core.resolutionselector.ResolutionSelector) r6
            if (r6 != 0) goto L91
            androidx.camera.core.resolutionselector.ResolutionSelector$Builder r2 = new androidx.camera.core.resolutionselector.ResolutionSelector$Builder
            r2.<init>()
            goto L95
        L91:
            androidx.camera.core.resolutionselector.ResolutionSelector$Builder r2 = androidx.camera.core.resolutionselector.ResolutionSelector.Builder.fromResolutionSelector(r6)
        L95:
            if (r6 == 0) goto L9d
            androidx.camera.core.resolutionselector.ResolutionStrategy r3 = r6.getResolutionStrategy()
            if (r3 != 0) goto La6
        L9d:
            androidx.camera.core.resolutionselector.ResolutionStrategy r3 = new androidx.camera.core.resolutionselector.ResolutionStrategy
            r4 = 1
            r3.<init>(r1, r4)
            r2.setResolutionStrategy(r3)
        La6:
            if (r6 != 0) goto Lb0
            androidx.camera.core.o r6 = new androidx.camera.core.o
            r6.<init>(r1)
            r2.setResolutionFilter(r6)
        Lb0:
            androidx.camera.core.impl.MutableConfig r6 = r7.getMutableConfig()
            androidx.camera.core.resolutionselector.ResolutionSelector r1 = r2.build()
            r6.insertOption(r0, r1)
        Lbb:
            androidx.camera.core.impl.UseCaseConfig r6 = r7.getUseCaseConfig()
            return r6
        Lc0:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            throw r6
    }

    @Override // androidx.camera.core.UseCase
    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    protected androidx.camera.core.impl.StreamSpec onSuggestedStreamSpecImplementationOptionsUpdated(@androidx.annotation.NonNull androidx.camera.core.impl.Config r2) {
            r1 = this;
            androidx.camera.core.impl.SessionConfig$Builder r0 = r1.mSessionConfigBuilder
            r0.addImplementationOptions(r2)
            androidx.camera.core.impl.SessionConfig$Builder r0 = r1.mSessionConfigBuilder
            androidx.camera.core.impl.SessionConfig r0 = r0.build()
            r1.updateSessionConfig(r0)
            androidx.camera.core.impl.StreamSpec r0 = r1.getAttachedStreamSpec()
            androidx.camera.core.impl.StreamSpec$Builder r0 = r0.toBuilder()
            androidx.camera.core.impl.StreamSpec$Builder r2 = r0.setImplementationOptions(r2)
            androidx.camera.core.impl.StreamSpec r2 = r2.build()
            return r2
    }

    @Override // androidx.camera.core.UseCase
    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    protected androidx.camera.core.impl.StreamSpec onSuggestedStreamSpecUpdated(@androidx.annotation.NonNull androidx.camera.core.impl.StreamSpec r3) {
            r2 = this;
            androidx.camera.core.impl.UseCaseConfig r0 = r2.getCurrentConfig()
            androidx.camera.core.impl.ImageAnalysisConfig r0 = (androidx.camera.core.impl.ImageAnalysisConfig) r0
            java.lang.String r1 = r2.getCameraId()
            androidx.camera.core.impl.SessionConfig$Builder r0 = r2.createPipeline(r1, r0, r3)
            r2.mSessionConfigBuilder = r0
            androidx.camera.core.impl.SessionConfig r0 = r0.build()
            r2.updateSessionConfig(r0)
            return r3
    }

    @Override // androidx.camera.core.UseCase
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void onUnbind() {
            r1 = this;
            r1.clearPipeline()
            androidx.camera.core.ImageAnalysisAbstractAnalyzer r0 = r1.mImageAnalysisAbstractAnalyzer
            r0.detach()
            return
    }

    public void setAnalyzer(@androidx.annotation.NonNull java.util.concurrent.Executor r4, @androidx.annotation.NonNull androidx.camera.core.ImageAnalysis.Analyzer r5) {
            r3 = this;
            java.lang.Object r0 = r3.mAnalysisLock
            monitor-enter(r0)
            androidx.camera.core.ImageAnalysisAbstractAnalyzer r1 = r3.mImageAnalysisAbstractAnalyzer     // Catch: java.lang.Throwable -> L15
            androidx.camera.core.n r2 = new androidx.camera.core.n     // Catch: java.lang.Throwable -> L15
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L15
            r1.setAnalyzer(r4, r2)     // Catch: java.lang.Throwable -> L15
            androidx.camera.core.ImageAnalysis$Analyzer r4 = r3.mSubscribedAnalyzer     // Catch: java.lang.Throwable -> L15
            if (r4 != 0) goto L17
            r3.notifyActive()     // Catch: java.lang.Throwable -> L15
            goto L17
        L15:
            r4 = move-exception
            goto L1b
        L17:
            r3.mSubscribedAnalyzer = r5     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r4
    }

    @Override // androidx.camera.core.UseCase
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void setSensorToBufferTransformMatrix(@androidx.annotation.NonNull android.graphics.Matrix r2) {
            r1 = this;
            super.setSensorToBufferTransformMatrix(r2)
            androidx.camera.core.ImageAnalysisAbstractAnalyzer r0 = r1.mImageAnalysisAbstractAnalyzer
            r0.setSensorToBufferTransformMatrix(r2)
            return
    }

    public void setTargetRotation(int r1) {
            r0 = this;
            boolean r1 = r0.setTargetRotationInternal(r1)
            if (r1 == 0) goto L9
            r0.tryUpdateRelativeRotation()
        L9:
            return
    }

    @Override // androidx.camera.core.UseCase
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void setViewPortCropRect(@androidx.annotation.NonNull android.graphics.Rect r2) {
            r1 = this;
            super.setViewPortCropRect(r2)
            androidx.camera.core.ImageAnalysisAbstractAnalyzer r0 = r1.mImageAnalysisAbstractAnalyzer
            r0.setViewPortCropRect(r2)
            return
    }

    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ImageAnalysis:"
            r0.append(r1)
            java.lang.String r1 = r2.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
