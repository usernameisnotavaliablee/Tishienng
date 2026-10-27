package androidx.camera.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class Preview extends androidx.camera.core.UseCase {

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static final androidx.camera.core.Preview.Defaults DEFAULT_CONFIG = null;
    private static final java.util.concurrent.Executor DEFAULT_SURFACE_PROVIDER_EXECUTOR = null;
    private static final java.lang.String TAG = "Preview";

    @androidx.annotation.Nullable
    private androidx.camera.core.processing.SurfaceEdge mCameraEdge;

    @androidx.annotation.Nullable
    @androidx.annotation.VisibleForTesting
    androidx.camera.core.SurfaceRequest mCurrentSurfaceRequest;

    @androidx.annotation.Nullable
    private androidx.camera.core.processing.SurfaceProcessorNode mNode;
    androidx.camera.core.impl.SessionConfig.Builder mSessionConfigBuilder;
    private androidx.camera.core.impl.DeferrableSurface mSessionDeferrableSurface;

    @androidx.annotation.Nullable
    private androidx.camera.core.Preview.SurfaceProvider mSurfaceProvider;

    @androidx.annotation.NonNull
    private java.util.concurrent.Executor mSurfaceProviderExecutor;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Builder implements androidx.camera.core.impl.UseCaseConfig.Builder<androidx.camera.core.Preview, androidx.camera.core.impl.PreviewConfig, androidx.camera.core.Preview.Builder>, androidx.camera.core.impl.ImageOutputConfig.Builder<androidx.camera.core.Preview.Builder>, androidx.camera.core.internal.ThreadConfig.Builder<androidx.camera.core.Preview.Builder> {
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
                java.lang.Object r0 = r4.retrieveOption(r0, r1)
                java.lang.Class r0 = (java.lang.Class) r0
                java.lang.Class<androidx.camera.core.Preview> r1 = androidx.camera.core.Preview.class
                if (r0 == 0) goto L38
                boolean r2 = r0.equals(r1)
                if (r2 == 0) goto L19
                goto L38
            L19:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Invalid target class configuration for "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = ": "
                r1.append(r2)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                r4.<init>(r0)
                throw r4
            L38:
                r3.setTargetClass(r1)
                androidx.camera.core.impl.Config$Option<java.lang.Integer> r0 = androidx.camera.core.impl.ImageOutputConfig.OPTION_MIRROR_MODE
                r1 = 2
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r4.insertOption(r0, r1)
                return
        }

        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        static androidx.camera.core.Preview.Builder fromConfig(@androidx.annotation.NonNull androidx.camera.core.impl.Config r1) {
                androidx.camera.core.Preview$Builder r0 = new androidx.camera.core.Preview$Builder
                androidx.camera.core.impl.MutableOptionsBundle r1 = androidx.camera.core.impl.MutableOptionsBundle.from(r1)
                r0.<init>(r1)
                return r0
        }

        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public static androidx.camera.core.Preview.Builder fromConfig(@androidx.annotation.NonNull androidx.camera.core.impl.PreviewConfig r1) {
                androidx.camera.core.Preview$Builder r0 = new androidx.camera.core.Preview$Builder
                androidx.camera.core.impl.MutableOptionsBundle r1 = androidx.camera.core.impl.MutableOptionsBundle.from(r1)
                r0.<init>(r1)
                return r0
        }

        @Override // androidx.camera.core.ExtendableBuilder
        @androidx.annotation.NonNull
        public androidx.camera.core.Preview build() {
                r2 = this;
                androidx.camera.core.impl.PreviewConfig r0 = r2.getUseCaseConfig()
                androidx.camera.core.impl.z.s(r0)
                androidx.camera.core.Preview r1 = new androidx.camera.core.Preview
                r1.<init>(r0)
                return r1
        }

        @Override // androidx.camera.core.ExtendableBuilder
        @androidx.annotation.NonNull
        public /* bridge */ /* synthetic */ java.lang.Object build() {
                r1 = this;
                androidx.camera.core.Preview r0 = r1.build()
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
        public androidx.camera.core.impl.PreviewConfig getUseCaseConfig() {
                r2 = this;
                androidx.camera.core.impl.PreviewConfig r0 = new androidx.camera.core.impl.PreviewConfig
                androidx.camera.core.impl.MutableOptionsBundle r1 = r2.mMutableConfig
                androidx.camera.core.impl.OptionsBundle r1 = androidx.camera.core.impl.OptionsBundle.from(r1)
                r0.<init>(r1)
                return r0
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ androidx.camera.core.impl.PreviewConfig getUseCaseConfig() {
                r1 = this;
                androidx.camera.core.impl.PreviewConfig r0 = r1.getUseCaseConfig()
                return r0
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.internal.ThreadConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.Preview.Builder setBackgroundExecutor(@androidx.annotation.NonNull java.util.concurrent.Executor r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<java.util.concurrent.Executor> r1 = androidx.camera.core.internal.ThreadConfig.OPTION_BACKGROUND_EXECUTOR
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.internal.ThreadConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ androidx.camera.core.Preview.Builder setBackgroundExecutor(@androidx.annotation.NonNull java.util.concurrent.Executor r1) {
                r0 = this;
                androidx.camera.core.Preview$Builder r1 = r0.setBackgroundExecutor(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.Preview.Builder setCameraSelector(@androidx.annotation.NonNull androidx.camera.core.CameraSelector r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<androidx.camera.core.CameraSelector> r1 = androidx.camera.core.impl.UseCaseConfig.OPTION_CAMERA_SELECTOR
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ androidx.camera.core.Preview.Builder setCameraSelector(@androidx.annotation.NonNull androidx.camera.core.CameraSelector r1) {
                r0 = this;
                androidx.camera.core.Preview$Builder r1 = r0.setCameraSelector(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.Preview.Builder setCaptureOptionUnpacker(@androidx.annotation.NonNull androidx.camera.core.impl.CaptureConfig.OptionUnpacker r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<androidx.camera.core.impl.CaptureConfig$OptionUnpacker> r1 = androidx.camera.core.impl.UseCaseConfig.OPTION_CAPTURE_CONFIG_UNPACKER
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ androidx.camera.core.Preview.Builder setCaptureOptionUnpacker(@androidx.annotation.NonNull androidx.camera.core.impl.CaptureConfig.OptionUnpacker r1) {
                r0 = this;
                androidx.camera.core.Preview$Builder r1 = r0.setCaptureOptionUnpacker(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.Preview.Builder setCaptureType(@androidx.annotation.NonNull androidx.camera.core.impl.UseCaseConfigFactory.CaptureType r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<androidx.camera.core.impl.UseCaseConfigFactory$CaptureType> r1 = androidx.camera.core.impl.UseCaseConfig.OPTION_CAPTURE_TYPE
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ androidx.camera.core.Preview.Builder setCaptureType(@androidx.annotation.NonNull androidx.camera.core.impl.UseCaseConfigFactory.CaptureType r1) {
                r0 = this;
                androidx.camera.core.Preview$Builder r1 = r0.setCaptureType(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.Preview.Builder setCustomOrderedResolutions(@androidx.annotation.NonNull java.util.List<android.util.Size> r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<java.util.List<android.util.Size>> r1 = androidx.camera.core.impl.ImageOutputConfig.OPTION_CUSTOM_ORDERED_RESOLUTIONS
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ androidx.camera.core.Preview.Builder setCustomOrderedResolutions(@androidx.annotation.NonNull java.util.List r1) {
                r0 = this;
                androidx.camera.core.Preview$Builder r1 = r0.setCustomOrderedResolutions(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.Preview.Builder setDefaultCaptureConfig(@androidx.annotation.NonNull androidx.camera.core.impl.CaptureConfig r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<androidx.camera.core.impl.CaptureConfig> r1 = androidx.camera.core.impl.UseCaseConfig.OPTION_DEFAULT_CAPTURE_CONFIG
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ androidx.camera.core.Preview.Builder setDefaultCaptureConfig(@androidx.annotation.NonNull androidx.camera.core.impl.CaptureConfig r1) {
                r0 = this;
                androidx.camera.core.Preview$Builder r1 = r0.setDefaultCaptureConfig(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.Preview.Builder setDefaultResolution(@androidx.annotation.NonNull android.util.Size r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<android.util.Size> r1 = androidx.camera.core.impl.ImageOutputConfig.OPTION_DEFAULT_RESOLUTION
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ androidx.camera.core.Preview.Builder setDefaultResolution(@androidx.annotation.NonNull android.util.Size r1) {
                r0 = this;
                androidx.camera.core.Preview$Builder r1 = r0.setDefaultResolution(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.Preview.Builder setDefaultSessionConfig(@androidx.annotation.NonNull androidx.camera.core.impl.SessionConfig r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<androidx.camera.core.impl.SessionConfig> r1 = androidx.camera.core.impl.UseCaseConfig.OPTION_DEFAULT_SESSION_CONFIG
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ androidx.camera.core.Preview.Builder setDefaultSessionConfig(@androidx.annotation.NonNull androidx.camera.core.impl.SessionConfig r1) {
                r0 = this;
                androidx.camera.core.Preview$Builder r1 = r0.setDefaultSessionConfig(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.Preview.Builder setHighResolutionDisabled(boolean r3) {
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
        public /* bridge */ /* synthetic */ androidx.camera.core.Preview.Builder setHighResolutionDisabled(boolean r1) {
                r0 = this;
                androidx.camera.core.Preview$Builder r1 = r0.setHighResolutionDisabled(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.Preview.Builder setMaxResolution(@androidx.annotation.NonNull android.util.Size r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<android.util.Size> r1 = androidx.camera.core.impl.ImageOutputConfig.OPTION_MAX_RESOLUTION
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ androidx.camera.core.Preview.Builder setMaxResolution(@androidx.annotation.NonNull android.util.Size r1) {
                r0 = this;
                androidx.camera.core.Preview$Builder r1 = r0.setMaxResolution(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.Preview.Builder setMirrorMode(int r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "setMirrorMode is not supported."
                r2.<init>(r0)
                throw r2
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ androidx.camera.core.Preview.Builder setMirrorMode(int r1) {
                r0 = this;
                androidx.camera.core.Preview$Builder r1 = r0.setMirrorMode(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        public androidx.camera.core.Preview.Builder setResolutionSelector(@androidx.annotation.NonNull androidx.camera.core.resolutionselector.ResolutionSelector r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<androidx.camera.core.resolutionselector.ResolutionSelector> r1 = androidx.camera.core.impl.ImageOutputConfig.OPTION_RESOLUTION_SELECTOR
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        public /* bridge */ /* synthetic */ androidx.camera.core.Preview.Builder setResolutionSelector(@androidx.annotation.NonNull androidx.camera.core.resolutionselector.ResolutionSelector r1) {
                r0 = this;
                androidx.camera.core.Preview$Builder r1 = r0.setResolutionSelector(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.Preview.Builder setSessionOptionUnpacker(@androidx.annotation.NonNull androidx.camera.core.impl.SessionConfig.OptionUnpacker r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<androidx.camera.core.impl.SessionConfig$OptionUnpacker> r1 = androidx.camera.core.impl.UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ androidx.camera.core.Preview.Builder setSessionOptionUnpacker(@androidx.annotation.NonNull androidx.camera.core.impl.SessionConfig.OptionUnpacker r1) {
                r0 = this;
                androidx.camera.core.Preview$Builder r1 = r0.setSessionOptionUnpacker(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.Preview.Builder setSupportedResolutions(@androidx.annotation.NonNull java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>>> r1 = androidx.camera.core.impl.ImageOutputConfig.OPTION_SUPPORTED_RESOLUTIONS
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ androidx.camera.core.Preview.Builder setSupportedResolutions(@androidx.annotation.NonNull java.util.List r1) {
                r0 = this;
                androidx.camera.core.Preview$Builder r1 = r0.setSupportedResolutions(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.Preview.Builder setSurfaceOccupancyPriority(int r3) {
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
        public /* bridge */ /* synthetic */ androidx.camera.core.Preview.Builder setSurfaceOccupancyPriority(int r1) {
                r0 = this;
                androidx.camera.core.Preview$Builder r1 = r0.setSurfaceOccupancyPriority(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        @java.lang.Deprecated
        public androidx.camera.core.Preview.Builder setTargetAspectRatio(int r3) {
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
        public /* bridge */ /* synthetic */ androidx.camera.core.Preview.Builder setTargetAspectRatio(int r1) {
                r0 = this;
                androidx.camera.core.Preview$Builder r1 = r0.setTargetAspectRatio(r1)
                return r1
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.Preview.Builder setTargetClass(@androidx.annotation.NonNull java.lang.Class<androidx.camera.core.Preview> r4) {
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
                androidx.camera.core.Preview$Builder r1 = r0.setTargetClass(r1)
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.Preview.Builder setTargetFrameRate(@androidx.annotation.NonNull android.util.Range<java.lang.Integer> r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<android.util.Range<java.lang.Integer>> r1 = androidx.camera.core.impl.UseCaseConfig.OPTION_TARGET_FRAME_RATE
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        @androidx.annotation.NonNull
        public androidx.camera.core.Preview.Builder setTargetName(@androidx.annotation.NonNull java.lang.String r3) {
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
                androidx.camera.core.Preview$Builder r1 = r0.setTargetName(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        @java.lang.Deprecated
        public androidx.camera.core.Preview.Builder setTargetResolution(@androidx.annotation.NonNull android.util.Size r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<android.util.Size> r1 = androidx.camera.core.impl.ImageOutputConfig.OPTION_TARGET_RESOLUTION
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        @java.lang.Deprecated
        public /* bridge */ /* synthetic */ androidx.camera.core.Preview.Builder setTargetResolution(@androidx.annotation.NonNull android.util.Size r1) {
                r0 = this;
                androidx.camera.core.Preview$Builder r1 = r0.setTargetResolution(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        public androidx.camera.core.Preview.Builder setTargetRotation(int r4) {
                r3 = this;
                androidx.camera.core.impl.MutableConfig r0 = r3.getMutableConfig()
                androidx.camera.core.impl.Config$Option<java.lang.Integer> r1 = androidx.camera.core.impl.ImageOutputConfig.OPTION_TARGET_ROTATION
                java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
                r0.insertOption(r1, r2)
                androidx.camera.core.impl.MutableConfig r0 = r3.getMutableConfig()
                androidx.camera.core.impl.Config$Option<java.lang.Integer> r1 = androidx.camera.core.impl.ImageOutputConfig.OPTION_APP_TARGET_ROTATION
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r0.insertOption(r1, r4)
                return r3
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        public /* bridge */ /* synthetic */ androidx.camera.core.Preview.Builder setTargetRotation(int r1) {
                r0 = this;
                androidx.camera.core.Preview$Builder r1 = r0.setTargetRotation(r1)
                return r1
        }

        @Override // androidx.camera.core.internal.UseCaseEventConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.Preview.Builder setUseCaseEventCallback(@androidx.annotation.NonNull androidx.camera.core.UseCase.EventCallback r3) {
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
                androidx.camera.core.Preview$Builder r1 = r0.setUseCaseEventCallback(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.Preview.Builder setZslDisabled(boolean r3) {
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
        public /* bridge */ /* synthetic */ androidx.camera.core.Preview.Builder setZslDisabled(boolean r1) {
                r0 = this;
                androidx.camera.core.Preview$Builder r1 = r0.setZslDisabled(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static final class Defaults implements androidx.camera.core.impl.ConfigProvider<androidx.camera.core.impl.PreviewConfig> {
        private static final int DEFAULT_ASPECT_RATIO = 0;
        private static final androidx.camera.core.impl.PreviewConfig DEFAULT_CONFIG = null;
        private static final int DEFAULT_MIRROR_MODE = 2;
        private static final androidx.camera.core.resolutionselector.ResolutionSelector DEFAULT_RESOLUTION_SELECTOR = null;
        private static final int DEFAULT_SURFACE_OCCUPANCY_PRIORITY = 2;

        static {
                androidx.camera.core.resolutionselector.ResolutionSelector$Builder r0 = new androidx.camera.core.resolutionselector.ResolutionSelector$Builder
                r0.<init>()
                androidx.camera.core.resolutionselector.AspectRatioStrategy r1 = androidx.camera.core.resolutionselector.AspectRatioStrategy.RATIO_4_3_FALLBACK_AUTO_STRATEGY
                androidx.camera.core.resolutionselector.ResolutionSelector$Builder r0 = r0.setAspectRatioStrategy(r1)
                androidx.camera.core.resolutionselector.ResolutionStrategy r1 = androidx.camera.core.resolutionselector.ResolutionStrategy.HIGHEST_AVAILABLE_STRATEGY
                androidx.camera.core.resolutionselector.ResolutionSelector$Builder r0 = r0.setResolutionStrategy(r1)
                androidx.camera.core.resolutionselector.ResolutionSelector r0 = r0.build()
                androidx.camera.core.Preview.Defaults.DEFAULT_RESOLUTION_SELECTOR = r0
                androidx.camera.core.Preview$Builder r1 = new androidx.camera.core.Preview$Builder
                r1.<init>()
                r2 = 2
                androidx.camera.core.Preview$Builder r1 = r1.setSurfaceOccupancyPriority(r2)
                r2 = 0
                androidx.camera.core.Preview$Builder r1 = r1.setTargetAspectRatio(r2)
                androidx.camera.core.Preview$Builder r0 = r1.setResolutionSelector(r0)
                androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r1 = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.PREVIEW
                androidx.camera.core.Preview$Builder r0 = r0.setCaptureType(r1)
                androidx.camera.core.impl.PreviewConfig r0 = r0.getUseCaseConfig()
                androidx.camera.core.Preview.Defaults.DEFAULT_CONFIG = r0
                return
        }

        public Defaults() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.camera.core.impl.ConfigProvider
        @androidx.annotation.NonNull
        public /* bridge */ /* synthetic */ androidx.camera.core.impl.PreviewConfig getConfig() {
                r1 = this;
                androidx.camera.core.impl.PreviewConfig r0 = r1.getConfig2()
                return r0
        }

        @Override // androidx.camera.core.impl.ConfigProvider
        @androidx.annotation.NonNull
        /* renamed from: getConfig, reason: avoid collision after fix types in other method */
        public androidx.camera.core.impl.PreviewConfig getConfig2() {
                r1 = this;
                androidx.camera.core.impl.PreviewConfig r0 = androidx.camera.core.Preview.Defaults.DEFAULT_CONFIG
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface SurfaceProvider {
        void onSurfaceRequested(@androidx.annotation.NonNull androidx.camera.core.SurfaceRequest r1);
    }

    static {
            androidx.camera.core.Preview$Defaults r0 = new androidx.camera.core.Preview$Defaults
            r0.<init>()
            androidx.camera.core.Preview.DEFAULT_CONFIG = r0
            java.util.concurrent.ScheduledExecutorService r0 = androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor()
            androidx.camera.core.Preview.DEFAULT_SURFACE_PROVIDER_EXECUTOR = r0
            return
    }

    @androidx.annotation.MainThread
    Preview(@androidx.annotation.NonNull androidx.camera.core.impl.PreviewConfig r1) {
            r0 = this;
            r0.<init>(r1)
            java.util.concurrent.Executor r1 = androidx.camera.core.Preview.DEFAULT_SURFACE_PROVIDER_EXECUTOR
            r0.mSurfaceProviderExecutor = r1
            return
    }

    public static /* synthetic */ void a(androidx.camera.core.Preview.SurfaceProvider r0, androidx.camera.core.SurfaceRequest r1) {
            r0.onSurfaceRequested(r1)
            return
    }

    private void addCameraSurfaceAndErrorListener(@androidx.annotation.NonNull androidx.camera.core.impl.SessionConfig.Builder r3, @androidx.annotation.NonNull java.lang.String r4, @androidx.annotation.NonNull androidx.camera.core.impl.PreviewConfig r5, @androidx.annotation.NonNull androidx.camera.core.impl.StreamSpec r6) {
            r2 = this;
            androidx.camera.core.Preview$SurfaceProvider r0 = r2.mSurfaceProvider
            if (r0 == 0) goto Ld
            androidx.camera.core.impl.DeferrableSurface r0 = r2.mSessionDeferrableSurface
            androidx.camera.core.DynamicRange r1 = r6.getDynamicRange()
            r3.addSurface(r0, r1)
        Ld:
            androidx.camera.core.o0 r0 = new androidx.camera.core.o0
            r0.<init>(r2, r4, r5, r6)
            r3.addErrorListener(r0)
            return
    }

    public static /* synthetic */ void b(androidx.camera.core.Preview r0, java.lang.String r1, androidx.camera.core.impl.PreviewConfig r2, androidx.camera.core.impl.StreamSpec r3, androidx.camera.core.impl.SessionConfig r4, androidx.camera.core.impl.SessionConfig.SessionError r5) {
            boolean r4 = r0.isCurrentCamera(r1)
            if (r4 == 0) goto L14
            androidx.camera.core.impl.SessionConfig$Builder r1 = r0.createPipeline(r1, r2, r3)
            androidx.camera.core.impl.SessionConfig r1 = r1.build()
            r0.updateSessionConfig(r1)
            r0.notifyReset()
        L14:
            return
    }

    public static /* synthetic */ void c(androidx.camera.core.Preview r0, androidx.camera.core.processing.SurfaceEdge r1, androidx.camera.core.impl.CameraInternal r2) {
            r0.onAppEdgeInvalidated(r1, r2)
            return
    }

    private void clearPipeline() {
            r2 = this;
            androidx.camera.core.impl.DeferrableSurface r0 = r2.mSessionDeferrableSurface
            r1 = 0
            if (r0 == 0) goto La
            r0.close()
            r2.mSessionDeferrableSurface = r1
        La:
            androidx.camera.core.processing.SurfaceProcessorNode r0 = r2.mNode
            if (r0 == 0) goto L13
            r0.release()
            r2.mNode = r1
        L13:
            androidx.camera.core.processing.SurfaceEdge r0 = r2.mCameraEdge
            if (r0 == 0) goto L1c
            r0.close()
            r2.mCameraEdge = r1
        L1c:
            r2.mCurrentSurfaceRequest = r1
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.MainThread
    private androidx.camera.core.impl.SessionConfig.Builder createPipeline(@androidx.annotation.NonNull java.lang.String r13, @androidx.annotation.NonNull androidx.camera.core.impl.PreviewConfig r14, @androidx.annotation.NonNull androidx.camera.core.impl.StreamSpec r15) {
            r12 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.core.impl.CameraInternal r0 = r12.getCamera()
            java.util.Objects.requireNonNull(r0)
            androidx.camera.core.impl.CameraInternal r0 = (androidx.camera.core.impl.CameraInternal) r0
            r12.clearPipeline()
            androidx.camera.core.processing.SurfaceEdge r1 = r12.mCameraEdge
            if (r1 != 0) goto L15
            r1 = 1
            goto L16
        L15:
            r1 = 0
        L16:
            androidx.core.util.Preconditions.checkState(r1)
            androidx.camera.core.processing.SurfaceEdge r2 = new androidx.camera.core.processing.SurfaceEdge
            android.graphics.Matrix r6 = r12.getSensorToBufferTransformMatrix()
            boolean r7 = r0.getHasTransform()
            android.util.Size r1 = r15.getResolution()
            android.graphics.Rect r8 = r12.getCropRect(r1)
            java.util.Objects.requireNonNull(r8)
            boolean r1 = r12.isMirroringRequired(r0)
            int r9 = r12.getRelativeRotation(r0, r1)
            int r10 = r12.getAppTargetRotation()
            boolean r11 = r12.shouldMirror(r0)
            r3 = 1
            r4 = 34
            r5 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.mCameraEdge = r2
            androidx.camera.core.CameraEffect r15 = r12.getEffect()
            if (r15 == 0) goto L98
            androidx.camera.core.processing.SurfaceProcessorNode r1 = new androidx.camera.core.processing.SurfaceProcessorNode
            androidx.camera.core.processing.SurfaceProcessorInternal r15 = r15.createSurfaceProcessorInternal()
            r1.<init>(r0, r15)
            r12.mNode = r1
            androidx.camera.core.processing.SurfaceEdge r15 = r12.mCameraEdge
            androidx.camera.core.m0 r1 = new androidx.camera.core.m0
            r1.<init>(r12)
            r15.addOnInvalidatedListener(r1)
            androidx.camera.core.processing.SurfaceEdge r15 = r12.mCameraEdge
            androidx.camera.core.processing.SurfaceProcessorNode$OutConfig r15 = androidx.camera.core.processing.SurfaceProcessorNode.OutConfig.of(r15)
            androidx.camera.core.processing.SurfaceEdge r1 = r12.mCameraEdge
            java.util.List r2 = java.util.Collections.singletonList(r15)
            androidx.camera.core.processing.SurfaceProcessorNode$In r1 = androidx.camera.core.processing.SurfaceProcessorNode.In.of(r1, r2)
            androidx.camera.core.processing.SurfaceProcessorNode r2 = r12.mNode
            androidx.camera.core.processing.SurfaceProcessorNode$Out r1 = r2.transform2(r1)
            java.lang.Object r15 = r1.get(r15)
            androidx.camera.core.processing.SurfaceEdge r15 = (androidx.camera.core.processing.SurfaceEdge) r15
            java.util.Objects.requireNonNull(r15)
            androidx.camera.core.n0 r1 = new androidx.camera.core.n0
            r1.<init>(r12, r15, r0)
            r15.addOnInvalidatedListener(r1)
            androidx.camera.core.SurfaceRequest r15 = r15.createSurfaceRequest(r0)
            r12.mCurrentSurfaceRequest = r15
            androidx.camera.core.processing.SurfaceEdge r15 = r12.mCameraEdge
            androidx.camera.core.impl.DeferrableSurface r15 = r15.getDeferrableSurface()
            r12.mSessionDeferrableSurface = r15
            goto Lb0
        L98:
            androidx.camera.core.processing.SurfaceEdge r15 = r12.mCameraEdge
            androidx.camera.core.m0 r1 = new androidx.camera.core.m0
            r1.<init>(r12)
            r15.addOnInvalidatedListener(r1)
            androidx.camera.core.processing.SurfaceEdge r15 = r12.mCameraEdge
            androidx.camera.core.SurfaceRequest r15 = r15.createSurfaceRequest(r0)
            r12.mCurrentSurfaceRequest = r15
            androidx.camera.core.impl.DeferrableSurface r15 = r15.getDeferrableSurface()
            r12.mSessionDeferrableSurface = r15
        Lb0:
            androidx.camera.core.Preview$SurfaceProvider r15 = r12.mSurfaceProvider
            if (r15 == 0) goto Lb7
            r12.sendSurfaceRequest()
        Lb7:
            android.util.Size r15 = r5.getResolution()
            androidx.camera.core.impl.SessionConfig$Builder r15 = androidx.camera.core.impl.SessionConfig.Builder.createFrom(r14, r15)
            android.util.Range r0 = r5.getExpectedFrameRateRange()
            r15.setExpectedFrameRateRange(r0)
            androidx.camera.core.impl.Config r0 = r5.getImplementationOptions()
            if (r0 == 0) goto Ld3
            androidx.camera.core.impl.Config r0 = r5.getImplementationOptions()
            r15.addImplementationOptions(r0)
        Ld3:
            r12.addCameraSurfaceAndErrorListener(r15, r13, r14, r5)
            return r15
    }

    @androidx.annotation.Nullable
    private android.graphics.Rect getCropRect(@androidx.annotation.Nullable android.util.Size r4) {
            r3 = this;
            android.graphics.Rect r0 = r3.getViewPortCropRect()
            if (r0 == 0) goto Lb
            android.graphics.Rect r4 = r3.getViewPortCropRect()
            return r4
        Lb:
            if (r4 == 0) goto L1c
            android.graphics.Rect r0 = new android.graphics.Rect
            int r1 = r4.getWidth()
            int r4 = r4.getHeight()
            r2 = 0
            r0.<init>(r2, r2, r1, r4)
            return r0
        L1c:
            r4 = 0
            return r4
    }

    @androidx.annotation.MainThread
    private void onAppEdgeInvalidated(@androidx.annotation.NonNull androidx.camera.core.processing.SurfaceEdge r2, @androidx.annotation.NonNull androidx.camera.core.impl.CameraInternal r3) {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.core.impl.CameraInternal r0 = r1.getCamera()
            if (r3 != r0) goto L12
            androidx.camera.core.SurfaceRequest r2 = r2.createSurfaceRequest(r3)
            r1.mCurrentSurfaceRequest = r2
            r1.sendSurfaceRequest()
        L12:
            return
    }

    private void sendSurfaceRequest() {
            r4 = this;
            r4.sendTransformationInfoIfReady()
            androidx.camera.core.Preview$SurfaceProvider r0 = r4.mSurfaceProvider
            java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r0)
            androidx.camera.core.Preview$SurfaceProvider r0 = (androidx.camera.core.Preview.SurfaceProvider) r0
            androidx.camera.core.SurfaceRequest r1 = r4.mCurrentSurfaceRequest
            java.lang.Object r1 = androidx.core.util.Preconditions.checkNotNull(r1)
            androidx.camera.core.SurfaceRequest r1 = (androidx.camera.core.SurfaceRequest) r1
            java.util.concurrent.Executor r2 = r4.mSurfaceProviderExecutor
            androidx.camera.core.l0 r3 = new androidx.camera.core.l0
            r3.<init>(r0, r1)
            r2.execute(r3)
            return
    }

    private void sendTransformationInfoIfReady() {
            r3 = this;
            androidx.camera.core.impl.CameraInternal r0 = r3.getCamera()
            androidx.camera.core.processing.SurfaceEdge r1 = r3.mCameraEdge
            if (r0 == 0) goto L19
            if (r1 == 0) goto L19
            boolean r2 = r3.isMirroringRequired(r0)
            int r0 = r3.getRelativeRotation(r0, r2)
            int r2 = r3.getAppTargetRotation()
            r1.updateTransformation(r0, r2)
        L19:
            return
    }

    private boolean shouldMirror(@androidx.annotation.NonNull androidx.camera.core.impl.CameraInternal r2) {
            r1 = this;
            boolean r0 = r2.getHasTransform()
            if (r0 == 0) goto Le
            boolean r2 = r1.isMirroringRequired(r2)
            if (r2 == 0) goto Le
            r2 = 1
            return r2
        Le:
            r2 = 0
            return r2
    }

    private void updateConfigAndOutput(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull androidx.camera.core.impl.PreviewConfig r2, @androidx.annotation.NonNull androidx.camera.core.impl.StreamSpec r3) {
            r0 = this;
            androidx.camera.core.impl.SessionConfig$Builder r1 = r0.createPipeline(r1, r2, r3)
            r0.mSessionConfigBuilder = r1
            androidx.camera.core.impl.SessionConfig r1 = r1.build()
            r0.updateSessionConfig(r1)
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    @androidx.annotation.VisibleForTesting
    public androidx.camera.core.processing.SurfaceEdge getCameraEdge() {
            r1 = this;
            androidx.camera.core.processing.SurfaceEdge r0 = r1.mCameraEdge
            java.util.Objects.requireNonNull(r0)
            return r0
    }

    @Override // androidx.camera.core.UseCase
    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.camera.core.impl.UseCaseConfig<?> getDefaultConfig(boolean r4, @androidx.annotation.NonNull androidx.camera.core.impl.UseCaseConfigFactory r5) {
            r3 = this;
            androidx.camera.core.Preview$Defaults r0 = androidx.camera.core.Preview.DEFAULT_CONFIG
            androidx.camera.core.impl.PreviewConfig r1 = r0.getConfig2()
            androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r1 = r1.getCaptureType()
            r2 = 1
            androidx.camera.core.impl.Config r5 = r5.getConfig(r1, r2)
            if (r4 == 0) goto L19
            androidx.camera.core.impl.PreviewConfig r4 = r0.getConfig2()
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

    @Override // androidx.camera.core.UseCase
    @androidx.annotation.IntRange(from = 0, to = 359)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    protected int getRelativeRotation(@androidx.annotation.NonNull androidx.camera.core.impl.CameraInternal r2, boolean r3) {
            r1 = this;
            boolean r0 = r2.getHasTransform()
            if (r0 == 0) goto Lb
            int r2 = super.getRelativeRotation(r2, r3)
            return r2
        Lb:
            r2 = 0
            return r2
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

    @Override // androidx.camera.core.UseCase
    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public java.util.Set<java.lang.Integer> getSupportedEffectTargets() {
            r2 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            return r0
    }

    @androidx.annotation.NonNull
    public android.util.Range<java.lang.Integer> getTargetFrameRate() {
            r1 = this;
            android.util.Range r0 = r1.getTargetFrameRateInternal()
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
            androidx.camera.core.Preview$Builder r1 = androidx.camera.core.Preview.Builder.fromConfig(r1)
            return r1
    }

    @Override // androidx.camera.core.UseCase
    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    protected androidx.camera.core.impl.UseCaseConfig<?> onMergeConfig(@androidx.annotation.NonNull androidx.camera.core.impl.CameraInfoInternal r3, @androidx.annotation.NonNull androidx.camera.core.impl.UseCaseConfig.Builder<?, ?, ?> r4) {
            r2 = this;
            androidx.camera.core.impl.MutableConfig r3 = r4.getMutableConfig()
            androidx.camera.core.impl.Config$Option<java.lang.Integer> r0 = androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_FORMAT
            r1 = 34
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.insertOption(r0, r1)
            androidx.camera.core.impl.UseCaseConfig r3 = r4.getUseCaseConfig()
            return r3
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
            java.lang.String r0 = r2.getCameraId()
            androidx.camera.core.impl.UseCaseConfig r1 = r2.getCurrentConfig()
            androidx.camera.core.impl.PreviewConfig r1 = (androidx.camera.core.impl.PreviewConfig) r1
            r2.updateConfigAndOutput(r0, r1, r3)
            return r3
    }

    @Override // androidx.camera.core.UseCase
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void onUnbind() {
            r0 = this;
            r0.clearPipeline()
            return
    }

    @androidx.annotation.UiThread
    public void setSurfaceProvider(@androidx.annotation.Nullable androidx.camera.core.Preview.SurfaceProvider r2) {
            r1 = this;
            java.util.concurrent.Executor r0 = androidx.camera.core.Preview.DEFAULT_SURFACE_PROVIDER_EXECUTOR
            r1.setSurfaceProvider(r0, r2)
            return
    }

    @androidx.annotation.UiThread
    public void setSurfaceProvider(@androidx.annotation.NonNull java.util.concurrent.Executor r2, @androidx.annotation.Nullable androidx.camera.core.Preview.SurfaceProvider r3) {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            if (r3 != 0) goto Lc
            r2 = 0
            r1.mSurfaceProvider = r2
            r1.notifyInactive()
            return
        Lc:
            r1.mSurfaceProvider = r3
            r1.mSurfaceProviderExecutor = r2
            android.util.Size r2 = r1.getAttachedSurfaceResolution()
            if (r2 == 0) goto L2a
            java.lang.String r2 = r1.getCameraId()
            androidx.camera.core.impl.UseCaseConfig r3 = r1.getCurrentConfig()
            androidx.camera.core.impl.PreviewConfig r3 = (androidx.camera.core.impl.PreviewConfig) r3
            androidx.camera.core.impl.StreamSpec r0 = r1.getAttachedStreamSpec()
            r1.updateConfigAndOutput(r2, r3, r0)
            r1.notifyReset()
        L2a:
            r1.notifyActive()
            return
    }

    public void setTargetRotation(int r1) {
            r0 = this;
            boolean r1 = r0.setTargetRotationInternal(r1)
            if (r1 == 0) goto L9
            r0.sendTransformationInfoIfReady()
        L9:
            return
    }

    @Override // androidx.camera.core.UseCase
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public void setViewPortCropRect(@androidx.annotation.NonNull android.graphics.Rect r1) {
            r0 = this;
            super.setViewPortCropRect(r1)
            r0.sendTransformationInfoIfReady()
            return
    }

    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Preview:"
            r0.append(r1)
            java.lang.String r1 = r2.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
