package androidx.camera.video;

import androidx.camera.video.VideoOutput;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class VideoCapture<T extends androidx.camera.video.VideoOutput> extends androidx.camera.core.UseCase {
    private static final androidx.camera.video.VideoCapture.Defaults DEFAULT_CONFIG = null;
    private static final java.lang.String SURFACE_UPDATE_KEY = "androidx.camera.video.VideoCapture.streamUpdate";
    private static final java.lang.String TAG = "VideoCapture";
    private static final boolean USE_TEMPLATE_PREVIEW_BY_QUIRK = false;

    @androidx.annotation.VisibleForTesting
    static boolean sEnableSurfaceProcessingByQuirk;

    @androidx.annotation.Nullable
    private androidx.camera.core.processing.SurfaceEdge mCameraEdge;

    @androidx.annotation.Nullable
    private android.graphics.Rect mCropRect;
    androidx.camera.core.impl.DeferrableSurface mDeferrableSurface;
    private boolean mHasCompensatingTransformation;

    @androidx.annotation.Nullable
    private androidx.camera.core.processing.SurfaceProcessorNode mNode;
    private int mRotationDegrees;

    @androidx.annotation.NonNull
    androidx.camera.core.impl.SessionConfig.Builder mSessionConfigBuilder;
    androidx.camera.video.VideoOutput.SourceState mSourceState;
    androidx.camera.video.StreamInfo mStreamInfo;
    private final androidx.camera.core.impl.Observable.Observer<androidx.camera.video.StreamInfo> mStreamInfoObserver;
    private androidx.camera.core.SurfaceRequest mSurfaceRequest;
    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> mSurfaceUpdateFuture;

    @androidx.annotation.Nullable
    private androidx.camera.video.internal.encoder.VideoEncoderInfo mVideoEncoderInfo;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.camera.video.VideoCapture$2, reason: invalid class name */
    class AnonymousClass2 extends androidx.camera.core.impl.CameraCaptureCallback {
        private boolean mIsFirstCaptureResult;
        final /* synthetic */ androidx.camera.video.VideoCapture this$0;
        final /* synthetic */ androidx.concurrent.futures.CallbackToFutureAdapter.Completer val$completer;
        final /* synthetic */ androidx.camera.core.impl.SessionConfig.Builder val$sessionConfigBuilder;
        final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean val$surfaceUpdateComplete;

        AnonymousClass2(androidx.camera.video.VideoCapture r1, java.util.concurrent.atomic.AtomicBoolean r2, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r3, androidx.camera.core.impl.SessionConfig.Builder r4) {
                r0 = this;
                r0.this$0 = r1
                r0.val$surfaceUpdateComplete = r2
                r0.val$completer = r3
                r0.val$sessionConfigBuilder = r4
                r0.<init>()
                r1 = 1
                r0.mIsFirstCaptureResult = r1
                return
        }

        public static /* synthetic */ void a(androidx.camera.video.VideoCapture.AnonymousClass2 r0, androidx.camera.core.impl.SessionConfig.Builder r1) {
                r0.getClass()
                r1.removeCameraCaptureCallback(r0)
                return
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureCompleted(@androidx.annotation.NonNull androidx.camera.core.impl.CameraCaptureResult r4) {
                r3 = this;
                super.onCaptureCompleted(r4)
                boolean r0 = r3.mIsFirstCaptureResult
                if (r0 == 0) goto L3c
                r0 = 0
                r3.mIsFirstCaptureResult = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "cameraCaptureResult timestampNs = "
                r0.append(r1)
                long r1 = r4.getTimestamp()
                r0.append(r1)
                java.lang.String r1 = ", current system uptimeMs = "
                r0.append(r1)
                long r1 = android.os.SystemClock.uptimeMillis()
                r0.append(r1)
                java.lang.String r1 = ", current system realtimeMs = "
                r0.append(r1)
                long r1 = android.os.SystemClock.elapsedRealtime()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "VideoCapture"
                androidx.camera.core.Logger.d(r1, r0)
            L3c:
                java.util.concurrent.atomic.AtomicBoolean r0 = r3.val$surfaceUpdateComplete
                boolean r0 = r0.get()
                if (r0 != 0) goto L7e
                androidx.camera.core.impl.TagBundle r4 = r4.getTagBundle()
                java.lang.String r0 = "androidx.camera.video.VideoCapture.streamUpdate"
                java.lang.Object r4 = r4.getTag(r0)
                if (r4 == 0) goto L7e
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
                androidx.concurrent.futures.CallbackToFutureAdapter$Completer r0 = r3.val$completer
                int r0 = r0.hashCode()
                if (r4 != r0) goto L7e
                androidx.concurrent.futures.CallbackToFutureAdapter$Completer r4 = r3.val$completer
                r0 = 0
                boolean r4 = r4.set(r0)
                if (r4 == 0) goto L7e
                java.util.concurrent.atomic.AtomicBoolean r4 = r3.val$surfaceUpdateComplete
                r0 = 1
                boolean r4 = r4.getAndSet(r0)
                if (r4 != 0) goto L7e
                java.util.concurrent.ScheduledExecutorService r4 = androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor()
                androidx.camera.core.impl.SessionConfig$Builder r0 = r3.val$sessionConfigBuilder
                androidx.camera.video.o0 r1 = new androidx.camera.video.o0
                r1.<init>(r3, r0)
                r4.execute(r1)
            L7e:
                return
        }
    }


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    public static final class Builder<T extends androidx.camera.video.VideoOutput> implements androidx.camera.core.impl.UseCaseConfig.Builder<androidx.camera.video.VideoCapture<T>, androidx.camera.video.impl.VideoCaptureConfig<T>, androidx.camera.video.VideoCapture.Builder<T>>, androidx.camera.core.impl.ImageOutputConfig.Builder<androidx.camera.video.VideoCapture.Builder<T>>, androidx.camera.core.impl.ImageInputConfig.Builder<androidx.camera.video.VideoCapture.Builder<T>>, androidx.camera.core.internal.ThreadConfig.Builder<androidx.camera.video.VideoCapture.Builder<T>> {
        private final androidx.camera.core.impl.MutableOptionsBundle mMutableConfig;

        private Builder(@androidx.annotation.NonNull androidx.camera.core.impl.MutableOptionsBundle r4) {
                r3 = this;
                r3.<init>()
                r3.mMutableConfig = r4
                androidx.camera.core.impl.Config$Option<androidx.camera.video.VideoOutput> r0 = androidx.camera.video.impl.VideoCaptureConfig.OPTION_VIDEO_OUTPUT
                boolean r0 = r4.containsOption(r0)
                if (r0 == 0) goto L44
                androidx.camera.core.impl.Config$Option<java.lang.Class<?>> r0 = androidx.camera.core.internal.TargetConfig.OPTION_TARGET_CLASS
                r1 = 0
                java.lang.Object r4 = r4.retrieveOption(r0, r1)
                java.lang.Class r4 = (java.lang.Class) r4
                java.lang.Class<androidx.camera.video.VideoCapture> r0 = androidx.camera.video.VideoCapture.class
                if (r4 == 0) goto L40
                boolean r1 = r4.equals(r0)
                if (r1 == 0) goto L21
                goto L40
            L21:
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
            L40:
                r3.setTargetClass(r0)
                return
            L44:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "VideoOutput is required"
                r4.<init>(r0)
                throw r4
        }

        public Builder(@androidx.annotation.NonNull T r1) {
                r0 = this;
                androidx.camera.core.impl.MutableOptionsBundle r1 = createInitialBundle(r1)
                r0.<init>(r1)
                return
        }

        @androidx.annotation.NonNull
        private static <T extends androidx.camera.video.VideoOutput> androidx.camera.core.impl.MutableOptionsBundle createInitialBundle(@androidx.annotation.NonNull T r2) {
                androidx.camera.core.impl.MutableOptionsBundle r0 = androidx.camera.core.impl.MutableOptionsBundle.create()
                androidx.camera.core.impl.Config$Option<androidx.camera.video.VideoOutput> r1 = androidx.camera.video.impl.VideoCaptureConfig.OPTION_VIDEO_OUTPUT
                r0.insertOption(r1, r2)
                return r0
        }

        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        static androidx.camera.video.VideoCapture.Builder<? extends androidx.camera.video.VideoOutput> fromConfig(@androidx.annotation.NonNull androidx.camera.core.impl.Config r1) {
                androidx.camera.video.VideoCapture$Builder r0 = new androidx.camera.video.VideoCapture$Builder
                androidx.camera.core.impl.MutableOptionsBundle r1 = androidx.camera.core.impl.MutableOptionsBundle.from(r1)
                r0.<init>(r1)
                return r0
        }

        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public static <T extends androidx.camera.video.VideoOutput> androidx.camera.video.VideoCapture.Builder<T> fromConfig(@androidx.annotation.NonNull androidx.camera.video.impl.VideoCaptureConfig<T> r1) {
                androidx.camera.video.VideoCapture$Builder r0 = new androidx.camera.video.VideoCapture$Builder
                androidx.camera.core.impl.MutableOptionsBundle r1 = androidx.camera.core.impl.MutableOptionsBundle.from(r1)
                r0.<init>(r1)
                return r0
        }

        @Override // androidx.camera.core.ExtendableBuilder
        @androidx.annotation.NonNull
        public androidx.camera.video.VideoCapture<T> build() {
                r2 = this;
                androidx.camera.video.VideoCapture r0 = new androidx.camera.video.VideoCapture
                androidx.camera.video.impl.VideoCaptureConfig r1 = r2.getUseCaseConfig()
                r0.<init>(r1)
                return r0
        }

        @Override // androidx.camera.core.ExtendableBuilder
        @androidx.annotation.NonNull
        public /* bridge */ /* synthetic */ java.lang.Object build() {
                r1 = this;
                androidx.camera.video.VideoCapture r0 = r1.build()
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

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ androidx.camera.core.impl.UseCaseConfig getUseCaseConfig() {
                r1 = this;
                androidx.camera.video.impl.VideoCaptureConfig r0 = r1.getUseCaseConfig()
                return r0
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.video.impl.VideoCaptureConfig<T> getUseCaseConfig() {
                r2 = this;
                androidx.camera.video.impl.VideoCaptureConfig r0 = new androidx.camera.video.impl.VideoCaptureConfig
                androidx.camera.core.impl.MutableOptionsBundle r1 = r2.mMutableConfig
                androidx.camera.core.impl.OptionsBundle r1 = androidx.camera.core.impl.OptionsBundle.from(r1)
                r0.<init>(r1)
                return r0
        }

        @Override // androidx.camera.core.internal.ThreadConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.video.VideoCapture.Builder<T> setBackgroundExecutor(@androidx.annotation.NonNull java.util.concurrent.Executor r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<java.util.concurrent.Executor> r1 = androidx.camera.core.internal.ThreadConfig.OPTION_BACKGROUND_EXECUTOR
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.internal.ThreadConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ java.lang.Object setBackgroundExecutor(@androidx.annotation.NonNull java.util.concurrent.Executor r1) {
                r0 = this;
                androidx.camera.video.VideoCapture$Builder r1 = r0.setBackgroundExecutor(r1)
                return r1
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.video.VideoCapture.Builder<T> setCameraSelector(@androidx.annotation.NonNull androidx.camera.core.CameraSelector r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<androidx.camera.core.CameraSelector> r1 = androidx.camera.core.impl.UseCaseConfig.OPTION_CAMERA_SELECTOR
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ java.lang.Object setCameraSelector(@androidx.annotation.NonNull androidx.camera.core.CameraSelector r1) {
                r0 = this;
                androidx.camera.video.VideoCapture$Builder r1 = r0.setCameraSelector(r1)
                return r1
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.video.VideoCapture.Builder<T> setCaptureOptionUnpacker(@androidx.annotation.NonNull androidx.camera.core.impl.CaptureConfig.OptionUnpacker r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<androidx.camera.core.impl.CaptureConfig$OptionUnpacker> r1 = androidx.camera.core.impl.UseCaseConfig.OPTION_CAPTURE_CONFIG_UNPACKER
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ java.lang.Object setCaptureOptionUnpacker(@androidx.annotation.NonNull androidx.camera.core.impl.CaptureConfig.OptionUnpacker r1) {
                r0 = this;
                androidx.camera.video.VideoCapture$Builder r1 = r0.setCaptureOptionUnpacker(r1)
                return r1
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.video.VideoCapture.Builder<T> setCaptureType(@androidx.annotation.NonNull androidx.camera.core.impl.UseCaseConfigFactory.CaptureType r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<androidx.camera.core.impl.UseCaseConfigFactory$CaptureType> r1 = androidx.camera.core.impl.UseCaseConfig.OPTION_CAPTURE_TYPE
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ java.lang.Object setCaptureType(@androidx.annotation.NonNull androidx.camera.core.impl.UseCaseConfigFactory.CaptureType r1) {
                r0 = this;
                androidx.camera.video.VideoCapture$Builder r1 = r0.setCaptureType(r1)
                return r1
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.video.VideoCapture.Builder<T> setCustomOrderedResolutions(@androidx.annotation.NonNull java.util.List<android.util.Size> r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<java.util.List<android.util.Size>> r1 = androidx.camera.core.impl.ImageOutputConfig.OPTION_CUSTOM_ORDERED_RESOLUTIONS
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ java.lang.Object setCustomOrderedResolutions(@androidx.annotation.NonNull java.util.List r1) {
                r0 = this;
                androidx.camera.video.VideoCapture$Builder r1 = r0.setCustomOrderedResolutions(r1)
                return r1
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.video.VideoCapture.Builder<T> setDefaultCaptureConfig(@androidx.annotation.NonNull androidx.camera.core.impl.CaptureConfig r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<androidx.camera.core.impl.CaptureConfig> r1 = androidx.camera.core.impl.UseCaseConfig.OPTION_DEFAULT_CAPTURE_CONFIG
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ java.lang.Object setDefaultCaptureConfig(@androidx.annotation.NonNull androidx.camera.core.impl.CaptureConfig r1) {
                r0 = this;
                androidx.camera.video.VideoCapture$Builder r1 = r0.setDefaultCaptureConfig(r1)
                return r1
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.video.VideoCapture.Builder<T> setDefaultResolution(@androidx.annotation.NonNull android.util.Size r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<android.util.Size> r1 = androidx.camera.core.impl.ImageOutputConfig.OPTION_DEFAULT_RESOLUTION
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ java.lang.Object setDefaultResolution(@androidx.annotation.NonNull android.util.Size r1) {
                r0 = this;
                androidx.camera.video.VideoCapture$Builder r1 = r0.setDefaultResolution(r1)
                return r1
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.video.VideoCapture.Builder<T> setDefaultSessionConfig(@androidx.annotation.NonNull androidx.camera.core.impl.SessionConfig r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<androidx.camera.core.impl.SessionConfig> r1 = androidx.camera.core.impl.UseCaseConfig.OPTION_DEFAULT_SESSION_CONFIG
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ java.lang.Object setDefaultSessionConfig(@androidx.annotation.NonNull androidx.camera.core.impl.SessionConfig r1) {
                r0 = this;
                androidx.camera.video.VideoCapture$Builder r1 = r0.setDefaultSessionConfig(r1)
                return r1
        }

        @Override // androidx.camera.core.impl.ImageInputConfig.Builder
        @androidx.annotation.NonNull
        public androidx.camera.video.VideoCapture.Builder<T> setDynamicRange(@androidx.annotation.NonNull androidx.camera.core.DynamicRange r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<androidx.camera.core.DynamicRange> r1 = androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_DYNAMIC_RANGE
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.impl.ImageInputConfig.Builder
        @androidx.annotation.NonNull
        public /* bridge */ /* synthetic */ java.lang.Object setDynamicRange(@androidx.annotation.NonNull androidx.camera.core.DynamicRange r1) {
                r0 = this;
                androidx.camera.video.VideoCapture$Builder r1 = r0.setDynamicRange(r1)
                return r1
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.video.VideoCapture.Builder<T> setHighResolutionDisabled(boolean r3) {
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
        public /* bridge */ /* synthetic */ java.lang.Object setHighResolutionDisabled(boolean r1) {
                r0 = this;
                androidx.camera.video.VideoCapture$Builder r1 = r0.setHighResolutionDisabled(r1)
                return r1
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.video.VideoCapture.Builder<T> setMaxResolution(@androidx.annotation.NonNull android.util.Size r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<android.util.Size> r1 = androidx.camera.core.impl.ImageOutputConfig.OPTION_MAX_RESOLUTION
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ java.lang.Object setMaxResolution(@androidx.annotation.NonNull android.util.Size r1) {
                r0 = this;
                androidx.camera.video.VideoCapture$Builder r1 = r0.setMaxResolution(r1)
                return r1
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        public androidx.camera.video.VideoCapture.Builder<T> setMirrorMode(int r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<java.lang.Integer> r1 = androidx.camera.core.impl.ImageOutputConfig.OPTION_MIRROR_MODE
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        public /* bridge */ /* synthetic */ java.lang.Object setMirrorMode(int r1) {
                r0 = this;
                androidx.camera.video.VideoCapture$Builder r1 = r0.setMirrorMode(r1)
                return r1
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.video.VideoCapture.Builder<T> setResolutionSelector(@androidx.annotation.NonNull androidx.camera.core.resolutionselector.ResolutionSelector r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<androidx.camera.core.resolutionselector.ResolutionSelector> r1 = androidx.camera.core.impl.ImageOutputConfig.OPTION_RESOLUTION_SELECTOR
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ java.lang.Object setResolutionSelector(@androidx.annotation.NonNull androidx.camera.core.resolutionselector.ResolutionSelector r1) {
                r0 = this;
                androidx.camera.video.VideoCapture$Builder r1 = r0.setResolutionSelector(r1)
                return r1
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.video.VideoCapture.Builder<T> setSessionOptionUnpacker(@androidx.annotation.NonNull androidx.camera.core.impl.SessionConfig.OptionUnpacker r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<androidx.camera.core.impl.SessionConfig$OptionUnpacker> r1 = androidx.camera.core.impl.UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ java.lang.Object setSessionOptionUnpacker(@androidx.annotation.NonNull androidx.camera.core.impl.SessionConfig.OptionUnpacker r1) {
                r0 = this;
                androidx.camera.video.VideoCapture$Builder r1 = r0.setSessionOptionUnpacker(r1)
                return r1
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.video.VideoCapture.Builder<T> setSupportedResolutions(@androidx.annotation.NonNull java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>>> r1 = androidx.camera.core.impl.ImageOutputConfig.OPTION_SUPPORTED_RESOLUTIONS
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ java.lang.Object setSupportedResolutions(@androidx.annotation.NonNull java.util.List r1) {
                r0 = this;
                androidx.camera.video.VideoCapture$Builder r1 = r0.setSupportedResolutions(r1)
                return r1
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.video.VideoCapture.Builder<T> setSurfaceOccupancyPriority(int r3) {
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
        public /* bridge */ /* synthetic */ java.lang.Object setSurfaceOccupancyPriority(int r1) {
                r0 = this;
                androidx.camera.video.VideoCapture$Builder r1 = r0.setSurfaceOccupancyPriority(r1)
                return r1
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.video.VideoCapture.Builder<T> setTargetAspectRatio(int r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "setTargetAspectRatio is not supported."
                r2.<init>(r0)
                throw r2
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ java.lang.Object setTargetAspectRatio(int r1) {
                r0 = this;
                androidx.camera.video.VideoCapture$Builder r1 = r0.setTargetAspectRatio(r1)
                return r1
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.video.VideoCapture.Builder<T> setTargetClass(@androidx.annotation.NonNull java.lang.Class<androidx.camera.video.VideoCapture<T>> r4) {
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
                androidx.camera.video.VideoCapture$Builder r1 = r0.setTargetClass(r1)
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.camera.video.VideoCapture.Builder<T> setTargetFrameRate(@androidx.annotation.NonNull android.util.Range<java.lang.Integer> r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<android.util.Range<java.lang.Integer>> r1 = androidx.camera.core.impl.UseCaseConfig.OPTION_TARGET_FRAME_RATE
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.video.VideoCapture.Builder<T> setTargetName(@androidx.annotation.NonNull java.lang.String r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<java.lang.String> r1 = androidx.camera.core.internal.TargetConfig.OPTION_TARGET_NAME
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ java.lang.Object setTargetName(@androidx.annotation.NonNull java.lang.String r1) {
                r0 = this;
                androidx.camera.video.VideoCapture$Builder r1 = r0.setTargetName(r1)
                return r1
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.video.VideoCapture.Builder<T> setTargetResolution(@androidx.annotation.NonNull android.util.Size r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "setTargetResolution is not supported."
                r2.<init>(r0)
                throw r2
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ java.lang.Object setTargetResolution(@androidx.annotation.NonNull android.util.Size r1) {
                r0 = this;
                androidx.camera.video.VideoCapture$Builder r1 = r0.setTargetResolution(r1)
                return r1
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        public androidx.camera.video.VideoCapture.Builder<T> setTargetRotation(int r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<java.lang.Integer> r1 = androidx.camera.core.impl.ImageOutputConfig.OPTION_TARGET_ROTATION
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        public /* bridge */ /* synthetic */ java.lang.Object setTargetRotation(int r1) {
                r0 = this;
                androidx.camera.video.VideoCapture$Builder r1 = r0.setTargetRotation(r1)
                return r1
        }

        @Override // androidx.camera.core.internal.UseCaseEventConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.video.VideoCapture.Builder<T> setUseCaseEventCallback(@androidx.annotation.NonNull androidx.camera.core.UseCase.EventCallback r3) {
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
                androidx.camera.video.VideoCapture$Builder r1 = r0.setUseCaseEventCallback(r1)
                return r1
        }

        @androidx.annotation.NonNull
        androidx.camera.video.VideoCapture.Builder<T> setVideoEncoderInfoFinder(@androidx.annotation.NonNull androidx.arch.core.util.Function<androidx.camera.video.internal.encoder.VideoEncoderConfig, androidx.camera.video.internal.encoder.VideoEncoderInfo> r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<androidx.arch.core.util.Function<androidx.camera.video.internal.encoder.VideoEncoderConfig, androidx.camera.video.internal.encoder.VideoEncoderInfo>> r1 = androidx.camera.video.impl.VideoCaptureConfig.OPTION_VIDEO_ENCODER_INFO_FINDER
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.video.VideoCapture.Builder<T> setZslDisabled(boolean r3) {
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
        public /* bridge */ /* synthetic */ java.lang.Object setZslDisabled(boolean r1) {
                r0 = this;
                androidx.camera.video.VideoCapture$Builder r1 = r0.setZslDisabled(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static final class Defaults implements androidx.camera.core.impl.ConfigProvider<androidx.camera.video.impl.VideoCaptureConfig<?>> {
        private static final androidx.camera.video.impl.VideoCaptureConfig<?> DEFAULT_CONFIG = null;
        static final androidx.camera.core.DynamicRange DEFAULT_DYNAMIC_RANGE = null;
        static final android.util.Range<java.lang.Integer> DEFAULT_FPS_RANGE = null;
        private static final int DEFAULT_SURFACE_OCCUPANCY_PRIORITY = 5;
        private static final androidx.arch.core.util.Function<androidx.camera.video.internal.encoder.VideoEncoderConfig, androidx.camera.video.internal.encoder.VideoEncoderInfo> DEFAULT_VIDEO_ENCODER_INFO_FINDER = null;
        private static final androidx.camera.video.VideoOutput DEFAULT_VIDEO_OUTPUT = null;

        static {
                androidx.camera.video.q0 r0 = new androidx.camera.video.q0
                r0.<init>()
                androidx.camera.video.VideoCapture.Defaults.DEFAULT_VIDEO_OUTPUT = r0
                androidx.arch.core.util.Function r1 = createFinder()
                androidx.camera.video.VideoCapture.Defaults.DEFAULT_VIDEO_ENCODER_INFO_FINDER = r1
                android.util.Range r2 = new android.util.Range
                r3 = 30
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r2.<init>(r3, r3)
                androidx.camera.video.VideoCapture.Defaults.DEFAULT_FPS_RANGE = r2
                androidx.camera.core.DynamicRange r2 = androidx.camera.core.DynamicRange.SDR
                androidx.camera.video.VideoCapture.Defaults.DEFAULT_DYNAMIC_RANGE = r2
                androidx.camera.video.VideoCapture$Builder r3 = new androidx.camera.video.VideoCapture$Builder
                r3.<init>(r0)
                r0 = 5
                androidx.camera.video.VideoCapture$Builder r0 = r3.setSurfaceOccupancyPriority(r0)
                androidx.camera.video.VideoCapture$Builder r0 = r0.setVideoEncoderInfoFinder(r1)
                androidx.camera.video.VideoCapture$Builder r0 = r0.setDynamicRange(r2)
                androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r1 = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE
                androidx.camera.video.VideoCapture$Builder r0 = r0.setCaptureType(r1)
                androidx.camera.video.impl.VideoCaptureConfig r0 = r0.getUseCaseConfig()
                androidx.camera.video.VideoCapture.Defaults.DEFAULT_CONFIG = r0
                return
        }

        public Defaults() {
                r0 = this;
                r0.<init>()
                return
        }

        public static /* synthetic */ androidx.camera.video.internal.encoder.VideoEncoderInfo a(androidx.camera.video.internal.encoder.VideoEncoderConfig r2) {
                androidx.camera.video.internal.encoder.VideoEncoderInfoImpl r2 = androidx.camera.video.internal.encoder.VideoEncoderInfoImpl.from(r2)     // Catch: androidx.camera.video.internal.encoder.InvalidConfigException -> L5
                return r2
            L5:
                r2 = move-exception
                java.lang.String r0 = "VideoCapture"
                java.lang.String r1 = "Unable to find VideoEncoderInfo"
                androidx.camera.core.Logger.w(r0, r1, r2)
                r2 = 0
                return r2
        }

        @androidx.annotation.NonNull
        private static androidx.arch.core.util.Function<androidx.camera.video.internal.encoder.VideoEncoderConfig, androidx.camera.video.internal.encoder.VideoEncoderInfo> createFinder() {
                androidx.camera.video.p0 r0 = new androidx.camera.video.p0
                r0.<init>()
                return r0
        }

        @Override // androidx.camera.core.impl.ConfigProvider
        @androidx.annotation.NonNull
        public /* bridge */ /* synthetic */ androidx.camera.video.impl.VideoCaptureConfig<?> getConfig() {
                r1 = this;
                androidx.camera.video.impl.VideoCaptureConfig r0 = r1.getConfig2()
                return r0
        }

        @Override // androidx.camera.core.impl.ConfigProvider
        @androidx.annotation.NonNull
        /* renamed from: getConfig, reason: avoid collision after fix types in other method */
        public androidx.camera.video.impl.VideoCaptureConfig<?> getConfig2() {
                r1 = this;
                androidx.camera.video.impl.VideoCaptureConfig<?> r0 = androidx.camera.video.VideoCapture.Defaults.DEFAULT_CONFIG
                return r0
        }
    }

    static {
            androidx.camera.video.VideoCapture$Defaults r0 = new androidx.camera.video.VideoCapture$Defaults
            r0.<init>()
            androidx.camera.video.VideoCapture.DEFAULT_CONFIG = r0
            java.lang.Class<androidx.camera.video.internal.compat.quirk.PreviewStretchWhenVideoCaptureIsBoundQuirk> r0 = androidx.camera.video.internal.compat.quirk.PreviewStretchWhenVideoCaptureIsBoundQuirk.class
            androidx.camera.core.impl.Quirk r0 = androidx.camera.video.internal.compat.quirk.DeviceQuirks.get(r0)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            java.lang.Class<androidx.camera.video.internal.compat.quirk.PreviewDelayWhenVideoCaptureIsBoundQuirk> r3 = androidx.camera.video.internal.compat.quirk.PreviewDelayWhenVideoCaptureIsBoundQuirk.class
            androidx.camera.core.impl.Quirk r3 = androidx.camera.video.internal.compat.quirk.DeviceQuirks.get(r3)
            if (r3 == 0) goto L1e
            r3 = 1
            goto L1f
        L1e:
            r3 = 0
        L1f:
            java.lang.Class<androidx.camera.video.internal.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk> r4 = androidx.camera.video.internal.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.class
            androidx.camera.core.impl.Quirk r4 = androidx.camera.video.internal.compat.quirk.DeviceQuirks.get(r4)
            if (r4 == 0) goto L29
            r4 = 1
            goto L2a
        L29:
            r4 = 0
        L2a:
            boolean r5 = hasVideoQualityQuirkAndWorkaroundBySurfaceProcessing()
            java.lang.Class<androidx.camera.video.internal.compat.quirk.ExtraSupportedResolutionQuirk> r6 = androidx.camera.video.internal.compat.quirk.ExtraSupportedResolutionQuirk.class
            androidx.camera.core.impl.Quirk r6 = androidx.camera.video.internal.compat.quirk.DeviceQuirks.get(r6)
            if (r6 == 0) goto L38
            r6 = 1
            goto L39
        L38:
            r6 = 0
        L39:
            if (r0 != 0) goto L42
            if (r3 != 0) goto L42
            if (r4 == 0) goto L40
            goto L42
        L40:
            r0 = 0
            goto L43
        L42:
            r0 = 1
        L43:
            androidx.camera.video.VideoCapture.USE_TEMPLATE_PREVIEW_BY_QUIRK = r0
            if (r3 != 0) goto L4d
            if (r4 != 0) goto L4d
            if (r5 != 0) goto L4d
            if (r6 == 0) goto L4e
        L4d:
            r1 = 1
        L4e:
            androidx.camera.video.VideoCapture.sEnableSurfaceProcessingByQuirk = r1
            return
    }

    VideoCapture(@androidx.annotation.NonNull androidx.camera.video.impl.VideoCaptureConfig<T> r1) {
            r0 = this;
            r0.<init>(r1)
            androidx.camera.video.StreamInfo r1 = androidx.camera.video.StreamInfo.STREAM_INFO_ANY_INACTIVE
            r0.mStreamInfo = r1
            androidx.camera.core.impl.SessionConfig$Builder r1 = new androidx.camera.core.impl.SessionConfig$Builder
            r1.<init>()
            r0.mSessionConfigBuilder = r1
            r1 = 0
            r0.mSurfaceUpdateFuture = r1
            androidx.camera.video.VideoOutput$SourceState r1 = androidx.camera.video.VideoOutput.SourceState.INACTIVE
            r0.mSourceState = r1
            r1 = 0
            r0.mHasCompensatingTransformation = r1
            androidx.camera.video.VideoCapture$1 r1 = new androidx.camera.video.VideoCapture$1
            r1.<init>(r0)
            r0.mStreamInfoObserver = r1
            return
    }

    public static /* synthetic */ void a(androidx.camera.video.VideoCapture r0, java.lang.String r1, androidx.camera.video.impl.VideoCaptureConfig r2, androidx.camera.core.impl.StreamSpec r3, androidx.camera.core.impl.SessionConfig r4, androidx.camera.core.impl.SessionConfig.SessionError r5) {
            r0.resetPipeline(r1, r2, r3)
            return
    }

    static /* synthetic */ java.lang.String access$000(androidx.camera.video.VideoCapture r0) {
            java.lang.String r0 = r0.getCameraId()
            return r0
    }

    static /* synthetic */ void access$100(androidx.camera.video.VideoCapture r0, androidx.camera.core.impl.SessionConfig r1) {
            r0.updateSessionConfig(r1)
            return
    }

    static /* synthetic */ void access$200(androidx.camera.video.VideoCapture r0) {
            r0.notifyReset()
            return
    }

    static /* synthetic */ void access$300(androidx.camera.video.VideoCapture r0, androidx.camera.core.impl.SessionConfig r1) {
            r0.updateSessionConfig(r1)
            return
    }

    static /* synthetic */ void access$400(androidx.camera.video.VideoCapture r0) {
            r0.notifyUpdated()
            return
    }

    private static void addBySupportedSize(@androidx.annotation.NonNull java.util.Set<android.util.Size> r3, int r4, int r5, @androidx.annotation.NonNull android.util.Size r6, @androidx.annotation.NonNull androidx.camera.video.internal.encoder.VideoEncoderInfo r7) {
            java.lang.String r0 = "VideoCapture"
            int r1 = r6.getWidth()
            if (r4 > r1) goto L6f
            int r6 = r6.getHeight()
            if (r5 <= r6) goto Lf
            goto L6f
        Lf:
            android.util.Range r6 = r7.getSupportedHeightsFor(r4)     // Catch: java.lang.IllegalArgumentException -> L2a
            android.util.Size r1 = new android.util.Size     // Catch: java.lang.IllegalArgumentException -> L2a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.IllegalArgumentException -> L2a
            java.lang.Comparable r6 = r6.clamp(r2)     // Catch: java.lang.IllegalArgumentException -> L2a
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: java.lang.IllegalArgumentException -> L2a
            int r6 = r6.intValue()     // Catch: java.lang.IllegalArgumentException -> L2a
            r1.<init>(r4, r6)     // Catch: java.lang.IllegalArgumentException -> L2a
            r3.add(r1)     // Catch: java.lang.IllegalArgumentException -> L2a
            goto L3f
        L2a:
            r6 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No supportedHeights for width: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            androidx.camera.core.Logger.w(r0, r1, r6)
        L3f:
            android.util.Range r6 = r7.getSupportedWidthsFor(r5)     // Catch: java.lang.IllegalArgumentException -> L5a
            android.util.Size r7 = new android.util.Size     // Catch: java.lang.IllegalArgumentException -> L5a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.IllegalArgumentException -> L5a
            java.lang.Comparable r4 = r6.clamp(r4)     // Catch: java.lang.IllegalArgumentException -> L5a
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.IllegalArgumentException -> L5a
            int r4 = r4.intValue()     // Catch: java.lang.IllegalArgumentException -> L5a
            r7.<init>(r4, r5)     // Catch: java.lang.IllegalArgumentException -> L5a
            r3.add(r7)     // Catch: java.lang.IllegalArgumentException -> L5a
            goto L6f
        L5a:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "No supportedWidths for height: "
            r4.append(r6)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            androidx.camera.core.Logger.w(r0, r4, r3)
        L6f:
            return
    }

    @androidx.annotation.NonNull
    private static android.graphics.Rect adjustCropRectToValidSize(@androidx.annotation.NonNull android.graphics.Rect r10, @androidx.annotation.NonNull android.util.Size r11, @androidx.annotation.NonNull androidx.camera.video.internal.encoder.VideoEncoderInfo r12) {
            java.lang.String r0 = androidx.camera.core.impl.utils.TransformUtils.rectToString(r10)
            int r1 = r12.getWidthAlignment()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r2 = r12.getHeightAlignment()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            android.util.Range r3 = r12.getSupportedWidths()
            android.util.Range r4 = r12.getSupportedHeights()
            r5 = 5
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r6 = 0
            r5[r6] = r0
            r0 = 1
            r5[r0] = r1
            r1 = 2
            r5[r1] = r2
            r2 = 3
            r5[r2] = r3
            r2 = 4
            r5[r2] = r4
            java.lang.String r2 = "Adjust cropRect %s by width/height alignment %d/%d and supported widths %s / supported heights %s"
            java.lang.String r2 = java.lang.String.format(r2, r5)
            java.lang.String r3 = "VideoCapture"
            androidx.camera.core.Logger.d(r3, r2)
            int r2 = r12.getWidthAlignment()
            int r4 = r12.getHeightAlignment()
            android.util.Range r5 = r12.getSupportedWidths()
            android.util.Range r7 = r12.getSupportedHeights()
            int r8 = r10.width()
            int r8 = alignDown(r8, r2, r5)
            int r9 = r10.width()
            int r2 = alignUp(r9, r2, r5)
            int r5 = r10.height()
            int r5 = alignDown(r5, r4, r7)
            int r9 = r10.height()
            int r4 = alignUp(r9, r4, r7)
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            addBySupportedSize(r7, r8, r5, r11, r12)
            addBySupportedSize(r7, r8, r4, r11, r12)
            addBySupportedSize(r7, r2, r5, r11, r12)
            addBySupportedSize(r7, r2, r4, r11, r12)
            boolean r12 = r7.isEmpty()
            if (r12 == 0) goto L86
            java.lang.String r11 = "Can't find valid cropped size"
            androidx.camera.core.Logger.w(r3, r11)
            return r10
        L86:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>(r7)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "candidatesList = "
            r2.append(r4)
            r2.append(r12)
            java.lang.String r2 = r2.toString()
            androidx.camera.core.Logger.d(r3, r2)
            androidx.camera.video.i0 r2 = new androidx.camera.video.i0
            r2.<init>(r10)
            java.util.Collections.sort(r12, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "sorted candidatesList = "
            r2.append(r4)
            r2.append(r12)
            java.lang.String r2 = r2.toString()
            androidx.camera.core.Logger.d(r3, r2)
            java.lang.Object r12 = r12.get(r6)
            android.util.Size r12 = (android.util.Size) r12
            int r2 = r12.getWidth()
            int r12 = r12.getHeight()
            int r4 = r10.width()
            if (r2 != r4) goto Ldb
            int r4 = r10.height()
            if (r12 != r4) goto Ldb
            java.lang.String r11 = "No need to adjust cropRect because crop size is valid."
            androidx.camera.core.Logger.d(r3, r11)
            return r10
        Ldb:
            int r4 = r2 % 2
            if (r4 != 0) goto Lf1
            int r4 = r12 % 2
            if (r4 != 0) goto Lf1
            int r4 = r11.getWidth()
            if (r2 > r4) goto Lf1
            int r4 = r11.getHeight()
            if (r12 > r4) goto Lf1
            r4 = 1
            goto Lf2
        Lf1:
            r4 = 0
        Lf2:
            androidx.core.util.Preconditions.checkState(r4)
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>(r10)
            int r5 = r10.width()
            if (r2 == r5) goto L11f
            int r5 = r10.centerX()
            int r7 = r2 / 2
            int r5 = r5 - r7
            int r5 = java.lang.Math.max(r6, r5)
            r4.left = r5
            int r5 = r5 + r2
            r4.right = r5
            int r7 = r11.getWidth()
            if (r5 <= r7) goto L11f
            int r5 = r11.getWidth()
            r4.right = r5
            int r5 = r5 - r2
            r4.left = r5
        L11f:
            int r2 = r10.height()
            if (r12 == r2) goto L144
            int r2 = r10.centerY()
            int r5 = r12 / 2
            int r2 = r2 - r5
            int r2 = java.lang.Math.max(r6, r2)
            r4.top = r2
            int r2 = r2 + r12
            r4.bottom = r2
            int r5 = r11.getHeight()
            if (r2 <= r5) goto L144
            int r11 = r11.getHeight()
            r4.bottom = r11
            int r11 = r11 - r12
            r4.top = r11
        L144:
            java.lang.String r10 = androidx.camera.core.impl.utils.TransformUtils.rectToString(r10)
            java.lang.String r11 = androidx.camera.core.impl.utils.TransformUtils.rectToString(r4)
            java.lang.Object[] r12 = new java.lang.Object[r1]
            r12[r6] = r10
            r12[r0] = r11
            java.lang.String r10 = "Adjust cropRect from %s to %s"
            java.lang.String r10 = java.lang.String.format(r10, r12)
            androidx.camera.core.Logger.d(r3, r10)
            return r4
    }

    @androidx.annotation.NonNull
    private android.graphics.Rect adjustCropRectWithInProgressTransformation(@androidx.annotation.NonNull android.graphics.Rect r2, int r3) {
            r1 = this;
            boolean r0 = r1.shouldCompensateTransformation()
            if (r0 == 0) goto L1e
            androidx.camera.video.StreamInfo r2 = r1.mStreamInfo
            androidx.camera.core.SurfaceRequest$TransformationInfo r2 = r2.getInProgressTransformationInfo()
            java.lang.Object r2 = androidx.core.util.Preconditions.checkNotNull(r2)
            androidx.camera.core.SurfaceRequest$TransformationInfo r2 = (androidx.camera.core.SurfaceRequest.TransformationInfo) r2
            android.graphics.Rect r2 = r2.getCropRect()
            android.util.Size r2 = androidx.camera.core.impl.utils.TransformUtils.getRotatedSize(r2, r3)
            android.graphics.Rect r2 = androidx.camera.core.impl.utils.TransformUtils.sizeToRect(r2)
        L1e:
            return r2
    }

    @androidx.annotation.NonNull
    private android.util.Size adjustResolutionWithInProgressTransformation(@androidx.annotation.NonNull android.util.Size r4, @androidx.annotation.NonNull android.graphics.Rect r5, @androidx.annotation.NonNull android.graphics.Rect r6) {
            r3 = this;
            boolean r0 = r3.shouldCompensateTransformation()
            if (r0 == 0) goto L37
            boolean r0 = r6.equals(r5)
            if (r0 != 0) goto L37
            int r6 = r6.height()
            float r6 = (float) r6
            int r5 = r5.height()
            float r5 = (float) r5
            float r6 = r6 / r5
            android.util.Size r5 = new android.util.Size
            int r0 = r4.getWidth()
            float r0 = (float) r0
            float r0 = r0 * r6
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            int r0 = (int) r0
            int r4 = r4.getHeight()
            float r4 = (float) r4
            float r4 = r4 * r6
            double r1 = (double) r4
            double r1 = java.lang.Math.ceil(r1)
            int r4 = (int) r1
            r5.<init>(r0, r4)
            return r5
        L37:
            return r4
    }

    private int adjustRotationWithInProgressTransformation(int r2) {
            r1 = this;
            boolean r0 = r1.shouldCompensateTransformation()
            if (r0 == 0) goto L15
            androidx.camera.video.StreamInfo r0 = r1.mStreamInfo
            androidx.camera.core.SurfaceRequest$TransformationInfo r0 = r0.getInProgressTransformationInfo()
            int r0 = r0.getRotationDegrees()
            int r2 = r2 - r0
            int r2 = androidx.camera.core.impl.utils.TransformUtils.within360(r2)
        L15:
            return r2
    }

    private static int align(boolean r1, int r2, int r3, @androidx.annotation.NonNull android.util.Range<java.lang.Integer> r4) {
            int r0 = r2 % r3
            if (r0 != 0) goto L5
            goto Lb
        L5:
            if (r1 == 0) goto L9
            int r2 = r2 - r0
            goto Lb
        L9:
            int r3 = r3 - r0
            int r2 = r2 + r3
        Lb:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.Comparable r1 = r4.clamp(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            return r1
    }

    private static int alignDown(int r1, int r2, @androidx.annotation.NonNull android.util.Range<java.lang.Integer> r3) {
            r0 = 1
            int r1 = align(r0, r1, r2, r3)
            return r1
    }

    private static int alignUp(int r1, int r2, @androidx.annotation.NonNull android.util.Range<java.lang.Integer> r3) {
            r0 = 0
            int r1 = align(r0, r1, r2, r3)
            return r1
    }

    public static /* synthetic */ int b(android.graphics.Rect r2, android.util.Size r3, android.util.Size r4) {
            int r0 = r3.getWidth()
            int r1 = r2.width()
            int r0 = r0 - r1
            int r0 = java.lang.Math.abs(r0)
            int r3 = r3.getHeight()
            int r1 = r2.height()
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            int r0 = r0 + r3
            int r3 = r4.getWidth()
            int r1 = r2.width()
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            int r4 = r4.getHeight()
            int r2 = r2.height()
            int r4 = r4 - r2
            int r2 = java.lang.Math.abs(r4)
            int r3 = r3 + r2
            int r0 = r0 - r3
            return r0
    }

    public static /* synthetic */ void c(androidx.camera.video.VideoCapture r1, androidx.camera.core.impl.DeferrableSurface r2) {
            androidx.camera.core.impl.DeferrableSurface r0 = r1.mDeferrableSurface
            if (r2 != r0) goto L7
            r1.clearPipeline()
        L7:
            return
    }

    @androidx.annotation.NonNull
    private android.graphics.Rect calculateCropRect(@androidx.annotation.NonNull android.util.Size r5, @androidx.annotation.Nullable androidx.camera.video.internal.encoder.VideoEncoderInfo r6) {
            r4 = this;
            android.graphics.Rect r0 = r4.getViewPortCropRect()
            if (r0 == 0) goto Lb
            android.graphics.Rect r0 = r4.getViewPortCropRect()
            goto L19
        Lb:
            android.graphics.Rect r0 = new android.graphics.Rect
            int r1 = r5.getWidth()
            int r2 = r5.getHeight()
            r3 = 0
            r0.<init>(r3, r3, r1, r2)
        L19:
            if (r6 == 0) goto L2f
            int r1 = r0.width()
            int r2 = r0.height()
            boolean r1 = r6.isSizeSupported(r1, r2)
            if (r1 == 0) goto L2a
            goto L2f
        L2a:
            android.graphics.Rect r5 = adjustCropRectToValidSize(r0, r5, r6)
            return r5
        L2f:
            return r0
    }

    @androidx.annotation.MainThread
    private void clearPipeline() {
            r2 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.core.impl.DeferrableSurface r0 = r2.mDeferrableSurface
            r1 = 0
            if (r0 == 0) goto Ld
            r0.close()
            r2.mDeferrableSurface = r1
        Ld:
            androidx.camera.core.processing.SurfaceProcessorNode r0 = r2.mNode
            if (r0 == 0) goto L16
            r0.release()
            r2.mNode = r1
        L16:
            androidx.camera.core.processing.SurfaceEdge r0 = r2.mCameraEdge
            if (r0 == 0) goto L1f
            r0.close()
            r2.mCameraEdge = r1
        L1f:
            r2.mVideoEncoderInfo = r1
            r2.mCropRect = r1
            r2.mSurfaceRequest = r1
            androidx.camera.video.StreamInfo r0 = androidx.camera.video.StreamInfo.STREAM_INFO_ANY_INACTIVE
            r2.mStreamInfo = r0
            r0 = 0
            r2.mRotationDegrees = r0
            r2.mHasCompensatingTransformation = r0
            return
    }

    @androidx.annotation.Nullable
    private androidx.camera.core.processing.SurfaceProcessorNode createNodeIfNeeded(@androidx.annotation.NonNull androidx.camera.core.impl.CameraInternal r2, @androidx.annotation.NonNull android.graphics.Rect r3, @androidx.annotation.NonNull android.util.Size r4, @androidx.annotation.NonNull androidx.camera.core.DynamicRange r5) {
            r1 = this;
            androidx.camera.core.CameraEffect r0 = r1.getEffect()
            if (r0 != 0) goto L21
            boolean r0 = shouldEnableSurfaceProcessingByQuirk(r2)
            if (r0 != 0) goto L21
            boolean r3 = shouldCrop(r3, r4)
            if (r3 != 0) goto L21
            boolean r2 = r1.shouldMirror(r2)
            if (r2 != 0) goto L21
            boolean r2 = r1.shouldCompensateTransformation()
            if (r2 == 0) goto L1f
            goto L21
        L1f:
            r2 = 0
            return r2
        L21:
            java.lang.String r2 = "VideoCapture"
            java.lang.String r3 = "Surface processing is enabled."
            androidx.camera.core.Logger.d(r2, r3)
            androidx.camera.core.processing.SurfaceProcessorNode r2 = new androidx.camera.core.processing.SurfaceProcessorNode
            androidx.camera.core.impl.CameraInternal r3 = r1.getCamera()
            java.util.Objects.requireNonNull(r3)
            androidx.camera.core.impl.CameraInternal r3 = (androidx.camera.core.impl.CameraInternal) r3
            androidx.camera.core.CameraEffect r4 = r1.getEffect()
            if (r4 == 0) goto L42
            androidx.camera.core.CameraEffect r4 = r1.getEffect()
            androidx.camera.core.processing.SurfaceProcessorInternal r4 = r4.createSurfaceProcessorInternal()
            goto L46
        L42:
            androidx.camera.core.processing.SurfaceProcessorInternal r4 = androidx.camera.core.processing.DefaultSurfaceProcessor.Factory.newInstance(r5)
        L46:
            r2.<init>(r3, r4)
            return r2
    }

    @androidx.annotation.NonNull
    @android.annotation.SuppressLint({"WrongConstant"})
    @androidx.annotation.MainThread
    private androidx.camera.core.impl.SessionConfig.Builder createPipeline(@androidx.annotation.NonNull java.lang.String r22, @androidx.annotation.NonNull androidx.camera.video.impl.VideoCaptureConfig<T> r23, @androidx.annotation.NonNull androidx.camera.core.impl.StreamSpec r24) {
            r21 = this;
            r0 = r21
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.core.impl.CameraInternal r1 = r0.getCamera()
            java.lang.Object r1 = androidx.core.util.Preconditions.checkNotNull(r1)
            r7 = r1
            androidx.camera.core.impl.CameraInternal r7 = (androidx.camera.core.impl.CameraInternal) r7
            android.util.Size r5 = r24.getResolution()
            androidx.camera.video.k0 r8 = new androidx.camera.video.k0
            r8.<init>(r0)
            android.util.Range r1 = r24.getExpectedFrameRateRange()
            android.util.Range<java.lang.Integer> r2 = androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED
            boolean r2 = java.util.Objects.equals(r1, r2)
            if (r2 == 0) goto L27
            android.util.Range<java.lang.Integer> r1 = androidx.camera.video.VideoCapture.Defaults.DEFAULT_FPS_RANGE
        L27:
            r6 = r1
            androidx.camera.video.MediaSpec r4 = r0.getMediaSpec()
            java.util.Objects.requireNonNull(r4)
            androidx.camera.core.CameraInfo r1 = r7.getCameraInfo()
            androidx.camera.video.VideoCapabilities r2 = r0.getVideoCapabilities(r1)
            androidx.camera.core.DynamicRange r3 = r24.getDynamicRange()
            androidx.arch.core.util.Function r1 = r23.getVideoEncoderInfoFinder()
            androidx.camera.video.internal.encoder.VideoEncoderInfo r1 = r0.getVideoEncoderInfo(r1, r2, r3, r4, r5, r6)
            boolean r2 = r0.isMirroringRequired(r7)
            int r2 = r0.getRelativeRotation(r7, r2)
            int r2 = r0.adjustRotationWithInProgressTransformation(r2)
            r0.mRotationDegrees = r2
            android.graphics.Rect r1 = r0.calculateCropRect(r5, r1)
            int r2 = r0.mRotationDegrees
            android.graphics.Rect r2 = r0.adjustCropRectWithInProgressTransformation(r1, r2)
            r0.mCropRect = r2
            android.util.Size r1 = r0.adjustResolutionWithInProgressTransformation(r5, r1, r2)
            boolean r2 = r0.shouldCompensateTransformation()
            r9 = 1
            if (r2 == 0) goto L6a
            r0.mHasCompensatingTransformation = r9
        L6a:
            android.graphics.Rect r2 = r0.mCropRect
            androidx.camera.core.processing.SurfaceProcessorNode r2 = r0.createNodeIfNeeded(r7, r2, r5, r3)
            r0.mNode = r2
            if (r2 != 0) goto L7f
            boolean r2 = r7.getHasTransform()
            if (r2 != 0) goto L7b
            goto L7f
        L7b:
            androidx.camera.core.impl.Timebase r2 = androidx.camera.core.impl.Timebase.UPTIME
        L7d:
            r5 = r2
            goto L88
        L7f:
            androidx.camera.core.impl.CameraInfoInternal r2 = r7.getCameraInfoInternal()
            androidx.camera.core.impl.Timebase r2 = r2.getTimebase()
            goto L7d
        L88:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "camera timebase = "
            r2.append(r3)
            androidx.camera.core.impl.CameraInfoInternal r3 = r7.getCameraInfoInternal()
            androidx.camera.core.impl.Timebase r3 = r3.getTimebase()
            r2.append(r3)
            java.lang.String r3 = ", processing timebase = "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "VideoCapture"
            androidx.camera.core.Logger.d(r3, r2)
            androidx.camera.core.impl.StreamSpec$Builder r2 = r24.toBuilder()
            androidx.camera.core.impl.StreamSpec$Builder r1 = r2.setResolution(r1)
            androidx.camera.core.impl.StreamSpec$Builder r1 = r1.setExpectedFrameRateRange(r6)
            androidx.camera.core.impl.StreamSpec r13 = r1.build()
            androidx.camera.core.processing.SurfaceEdge r1 = r0.mCameraEdge
            if (r1 != 0) goto Lc4
            r1 = 1
            goto Lc5
        Lc4:
            r1 = 0
        Lc5:
            androidx.core.util.Preconditions.checkState(r1)
            androidx.camera.core.processing.SurfaceEdge r10 = new androidx.camera.core.processing.SurfaceEdge
            android.graphics.Matrix r14 = r0.getSensorToBufferTransformMatrix()
            boolean r15 = r7.getHasTransform()
            android.graphics.Rect r1 = r0.mCropRect
            int r2 = r0.mRotationDegrees
            int r18 = r0.getAppTargetRotation()
            boolean r19 = r0.shouldMirror(r7)
            r11 = 2
            r12 = 34
            r16 = r1
            r17 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r0.mCameraEdge = r10
            r10.addOnInvalidatedListener(r8)
            androidx.camera.core.processing.SurfaceProcessorNode r1 = r0.mNode
            if (r1 == 0) goto L142
            androidx.camera.core.processing.SurfaceEdge r1 = r0.mCameraEdge
            androidx.camera.core.processing.SurfaceProcessorNode$OutConfig r1 = androidx.camera.core.processing.SurfaceProcessorNode.OutConfig.of(r1)
            androidx.camera.core.processing.SurfaceEdge r2 = r0.mCameraEdge
            java.util.List r3 = java.util.Collections.singletonList(r1)
            androidx.camera.core.processing.SurfaceProcessorNode$In r2 = androidx.camera.core.processing.SurfaceProcessorNode.In.of(r2, r3)
            androidx.camera.core.processing.SurfaceProcessorNode r3 = r0.mNode
            androidx.camera.core.processing.SurfaceProcessorNode$Out r2 = r3.transform2(r2)
            java.lang.Object r1 = r2.get(r1)
            r2 = r1
            androidx.camera.core.processing.SurfaceEdge r2 = (androidx.camera.core.processing.SurfaceEdge) r2
            java.util.Objects.requireNonNull(r2)
            androidx.camera.video.l0 r0 = new androidx.camera.video.l0
            r1 = r21
            r4 = r23
            r3 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r20 = r1
            r1 = r0
            r0 = r20
            r2.addOnInvalidatedListener(r1)
            androidx.camera.core.SurfaceRequest r1 = r2.createSurfaceRequest(r3)
            r0.mSurfaceRequest = r1
            androidx.camera.core.processing.SurfaceEdge r1 = r0.mCameraEdge
            androidx.camera.core.impl.DeferrableSurface r1 = r1.getDeferrableSurface()
            r0.mDeferrableSurface = r1
            com.google.common.util.concurrent.ListenableFuture r2 = r1.getTerminationFuture()
            androidx.camera.video.m0 r3 = new androidx.camera.video.m0
            r3.<init>(r0, r1)
            java.util.concurrent.ScheduledExecutorService r1 = androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor()
            r2.addListener(r3, r1)
            goto L153
        L142:
            r4 = r23
            r3 = r7
            androidx.camera.core.processing.SurfaceEdge r1 = r0.mCameraEdge
            androidx.camera.core.SurfaceRequest r1 = r1.createSurfaceRequest(r3)
            r0.mSurfaceRequest = r1
            androidx.camera.core.impl.DeferrableSurface r1 = r1.getDeferrableSurface()
            r0.mDeferrableSurface = r1
        L153:
            androidx.camera.video.VideoOutput r1 = r4.getVideoOutput()
            androidx.camera.core.SurfaceRequest r2 = r0.mSurfaceRequest
            r1.onSurfaceRequested(r2, r5)
            r0.sendTransformationInfoIfReady()
            androidx.camera.core.impl.DeferrableSurface r1 = r0.mDeferrableSurface
            java.lang.Class<android.media.MediaCodec> r2 = android.media.MediaCodec.class
            r1.setContainerClass(r2)
            android.util.Size r1 = r24.getResolution()
            androidx.camera.core.impl.SessionConfig$Builder r1 = androidx.camera.core.impl.SessionConfig.Builder.createFrom(r4, r1)
            android.util.Range r2 = r24.getExpectedFrameRateRange()
            r1.setExpectedFrameRateRange(r2)
            androidx.camera.video.n0 r2 = new androidx.camera.video.n0
            r3 = r22
            r5 = r24
            r2.<init>(r0, r3, r4, r5)
            r1.addErrorListener(r2)
            boolean r2 = androidx.camera.video.VideoCapture.USE_TEMPLATE_PREVIEW_BY_QUIRK
            if (r2 == 0) goto L188
            r1.setTemplateType(r9)
        L188:
            androidx.camera.core.impl.Config r2 = r5.getImplementationOptions()
            if (r2 == 0) goto L195
            androidx.camera.core.impl.Config r2 = r5.getImplementationOptions()
            r1.addImplementationOptions(r2)
        L195:
            return r1
    }

    public static /* synthetic */ void d(androidx.camera.video.VideoCapture r0) {
            r0.notifyReset()
            return
    }

    public static /* synthetic */ void e(java.util.concurrent.atomic.AtomicBoolean r2, androidx.camera.core.impl.SessionConfig.Builder r3, androidx.camera.core.impl.CameraCaptureCallback r4) {
            boolean r0 = androidx.camera.core.impl.utils.Threads.isMainThread()
            java.lang.String r1 = "Surface update cancellation should only occur on main thread."
            androidx.core.util.Preconditions.checkState(r0, r1)
            r0 = 1
            r2.set(r0)
            r3.removeCameraCaptureCallback(r4)
            return
    }

    public static /* synthetic */ java.lang.Object f(androidx.camera.video.VideoCapture r4, androidx.camera.core.impl.SessionConfig.Builder r5, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r6) {
            r4.getClass()
            int r0 = r6.hashCode()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "androidx.camera.video.VideoCapture.streamUpdate"
            r5.addTag(r1, r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r2 = 0
            r0.<init>(r2)
            androidx.camera.video.VideoCapture$2 r3 = new androidx.camera.video.VideoCapture$2
            r3.<init>(r4, r0, r6, r5)
            androidx.camera.video.h0 r4 = new androidx.camera.video.h0
            r4.<init>(r0, r5, r3)
            java.util.concurrent.Executor r0 = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()
            r6.addCancellationListener(r4, r0)
            r5.addRepeatingCameraCaptureCallback(r3)
            int r4 = r6.hashCode()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r1
            r6 = 1
            r5[r6] = r4
            java.lang.String r4 = "%s[0x%x]"
            java.lang.String r4 = java.lang.String.format(r4, r5)
            return r4
    }

    @androidx.annotation.Nullable
    private static <T> T fetchObservableValue(@androidx.annotation.NonNull androidx.camera.core.impl.Observable<T> r1, @androidx.annotation.Nullable T r2) {
            com.google.common.util.concurrent.ListenableFuture r1 = r1.fetchData()
            boolean r0 = r1.isDone()
            if (r0 != 0) goto Lb
            return r2
        Lb:
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L10
            return r1
        L10:
            r1 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r1)
            throw r2
    }

    public static /* synthetic */ void g(androidx.camera.video.VideoCapture r0, androidx.camera.core.processing.SurfaceEdge r1, androidx.camera.core.impl.CameraInternal r2, androidx.camera.video.impl.VideoCaptureConfig r3, androidx.camera.core.impl.Timebase r4) {
            r0.onAppEdgeInvalidated(r1, r2, r3, r4)
            return
    }

    @androidx.annotation.Nullable
    private androidx.camera.video.MediaSpec getMediaSpec() {
            r2 = this;
            androidx.camera.video.VideoOutput r0 = r2.getOutput()
            androidx.camera.core.impl.Observable r0 = r0.getMediaSpec()
            r1 = 0
            java.lang.Object r0 = fetchObservableValue(r0, r1)
            androidx.camera.video.MediaSpec r0 = (androidx.camera.video.MediaSpec) r0
            return r0
    }

    @androidx.annotation.NonNull
    private androidx.camera.video.VideoCapabilities getVideoCapabilities(@androidx.annotation.NonNull androidx.camera.core.CameraInfo r2) {
            r1 = this;
            androidx.camera.video.VideoOutput r0 = r1.getOutput()
            androidx.camera.video.VideoCapabilities r2 = r0.getMediaCapabilities(r2)
            return r2
    }

    @androidx.annotation.Nullable
    @androidx.annotation.MainThread
    private androidx.camera.video.internal.encoder.VideoEncoderInfo getVideoEncoderInfo(@androidx.annotation.NonNull androidx.arch.core.util.Function<androidx.camera.video.internal.encoder.VideoEncoderConfig, androidx.camera.video.internal.encoder.VideoEncoderInfo> r3, @androidx.annotation.NonNull androidx.camera.video.VideoCapabilities r4, @androidx.annotation.NonNull androidx.camera.core.DynamicRange r5, @androidx.annotation.NonNull androidx.camera.video.MediaSpec r6, @androidx.annotation.NonNull android.util.Size r7, @androidx.annotation.NonNull android.util.Range<java.lang.Integer> r8) {
            r2 = this;
            androidx.camera.video.internal.encoder.VideoEncoderInfo r0 = r2.mVideoEncoderInfo
            if (r0 == 0) goto L5
            return r0
        L5:
            androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy r4 = r4.findHighestSupportedEncoderProfilesFor(r7, r5)
            r1 = r7
            r7 = r5
            r5 = r6
            r6 = r1
            androidx.camera.video.internal.encoder.VideoEncoderInfo r3 = resolveVideoEncoderInfo(r3, r4, r5, r6, r7, r8)
            r5 = 0
            if (r3 != 0) goto L1c
            java.lang.String r3 = "VideoCapture"
            java.lang.String r4 = "Can't find videoEncoderInfo"
            androidx.camera.core.Logger.w(r3, r4)
            return r5
        L1c:
            if (r4 == 0) goto L33
            android.util.Size r5 = new android.util.Size
            androidx.camera.core.impl.EncoderProfilesProxy$VideoProfileProxy r6 = r4.getDefaultVideoProfile()
            int r6 = r6.getWidth()
            androidx.camera.core.impl.EncoderProfilesProxy$VideoProfileProxy r4 = r4.getDefaultVideoProfile()
            int r4 = r4.getHeight()
            r5.<init>(r6, r4)
        L33:
            androidx.camera.video.internal.encoder.VideoEncoderInfo r3 = androidx.camera.video.internal.workaround.VideoEncoderInfoWrapper.from(r3, r5)
            r2.mVideoEncoderInfo = r3
            return r3
    }

    private static boolean hasVideoQualityQuirkAndWorkaroundBySurfaceProcessing() {
            java.lang.Class<androidx.camera.video.internal.compat.quirk.VideoQualityQuirk> r0 = androidx.camera.video.internal.compat.quirk.VideoQualityQuirk.class
            java.util.List r0 = androidx.camera.video.internal.compat.quirk.DeviceQuirks.getAll(r0)
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            androidx.camera.video.internal.compat.quirk.VideoQualityQuirk r1 = (androidx.camera.video.internal.compat.quirk.VideoQualityQuirk) r1
            boolean r1 = r1.workaroundBySurfaceProcessing()
            if (r1 == 0) goto La
            r0 = 1
            return r0
        L1e:
            r0 = 0
            return r0
    }

    private void onAppEdgeInvalidated(@androidx.annotation.NonNull androidx.camera.core.processing.SurfaceEdge r2, @androidx.annotation.NonNull androidx.camera.core.impl.CameraInternal r3, @androidx.annotation.NonNull androidx.camera.video.impl.VideoCaptureConfig<T> r4, @androidx.annotation.NonNull androidx.camera.core.impl.Timebase r5) {
            r1 = this;
            androidx.camera.core.impl.CameraInternal r0 = r1.getCamera()
            if (r3 != r0) goto L18
            androidx.camera.core.SurfaceRequest r2 = r2.createSurfaceRequest(r3)
            r1.mSurfaceRequest = r2
            androidx.camera.video.VideoOutput r2 = r4.getVideoOutput()
            androidx.camera.core.SurfaceRequest r3 = r1.mSurfaceRequest
            r2.onSurfaceRequested(r3, r5)
            r1.sendTransformationInfoIfReady()
        L18:
            return
    }

    @androidx.annotation.Nullable
    private static androidx.camera.video.internal.encoder.VideoEncoderInfo resolveVideoEncoderInfo(@androidx.annotation.NonNull androidx.arch.core.util.Function<androidx.camera.video.internal.encoder.VideoEncoderConfig, androidx.camera.video.internal.encoder.VideoEncoderInfo> r6, @androidx.annotation.Nullable androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy r7, @androidx.annotation.NonNull androidx.camera.video.MediaSpec r8, @androidx.annotation.NonNull android.util.Size r9, @androidx.annotation.NonNull androidx.camera.core.DynamicRange r10, @androidx.annotation.NonNull android.util.Range<java.lang.Integer> r11) {
            androidx.camera.video.internal.config.VideoMimeInfo r0 = androidx.camera.video.internal.config.VideoConfigUtil.resolveVideoMimeInfo(r8, r10, r7)
            androidx.camera.core.impl.Timebase r1 = androidx.camera.core.impl.Timebase.UPTIME
            androidx.camera.video.VideoSpec r2 = r8.getVideoSpec()
            r3 = r9
            r4 = r10
            r5 = r11
            androidx.camera.video.internal.encoder.VideoEncoderConfig r7 = androidx.camera.video.internal.config.VideoConfigUtil.resolveVideoEncoderConfig(r0, r1, r2, r3, r4, r5)
            java.lang.Object r6 = r6.apply(r7)
            androidx.camera.video.internal.encoder.VideoEncoderInfo r6 = (androidx.camera.video.internal.encoder.VideoEncoderInfo) r6
            return r6
    }

    private void sendTransformationInfoIfReady() {
            r3 = this;
            androidx.camera.core.impl.CameraInternal r0 = r3.getCamera()
            androidx.camera.core.processing.SurfaceEdge r1 = r3.mCameraEdge
            if (r0 == 0) goto L1f
            if (r1 == 0) goto L1f
            boolean r2 = r3.isMirroringRequired(r0)
            int r0 = r3.getRelativeRotation(r0, r2)
            int r0 = r3.adjustRotationWithInProgressTransformation(r0)
            r3.mRotationDegrees = r0
            int r2 = r3.getAppTargetRotation()
            r1.updateTransformation(r0, r2)
        L1f:
            return
    }

    @androidx.annotation.MainThread
    private void setupSurfaceUpdateNotifier(@androidx.annotation.NonNull androidx.camera.core.impl.SessionConfig.Builder r3, boolean r4) {
            r2 = this;
            com.google.common.util.concurrent.ListenableFuture<java.lang.Void> r0 = r2.mSurfaceUpdateFuture
            if (r0 == 0) goto L12
            r1 = 0
            boolean r0 = r0.cancel(r1)
            if (r0 == 0) goto L12
            java.lang.String r0 = "VideoCapture"
            java.lang.String r1 = "A newer surface update is requested. Previous surface update cancelled."
            androidx.camera.core.Logger.d(r0, r1)
        L12:
            androidx.camera.video.j0 r0 = new androidx.camera.video.j0
            r0.<init>(r2, r3)
            com.google.common.util.concurrent.ListenableFuture r3 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r0)
            r2.mSurfaceUpdateFuture = r3
            androidx.camera.video.VideoCapture$3 r0 = new androidx.camera.video.VideoCapture$3
            r0.<init>(r2, r3, r4)
            java.util.concurrent.ScheduledExecutorService r4 = androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor()
            androidx.camera.core.impl.utils.futures.Futures.addCallback(r3, r0, r4)
            return
    }

    private boolean shouldCompensateTransformation() {
            r1 = this;
            androidx.camera.video.StreamInfo r0 = r1.mStreamInfo
            androidx.camera.core.SurfaceRequest$TransformationInfo r0 = r0.getInProgressTransformationInfo()
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    private static boolean shouldCrop(@androidx.annotation.NonNull android.graphics.Rect r2, @androidx.annotation.NonNull android.util.Size r3) {
            int r0 = r3.getWidth()
            int r1 = r2.width()
            if (r0 != r1) goto L17
            int r3 = r3.getHeight()
            int r2 = r2.height()
            if (r3 == r2) goto L15
            goto L17
        L15:
            r2 = 0
            return r2
        L17:
            r2 = 1
            return r2
    }

    private static boolean shouldEnableSurfaceProcessingByQuirk(@androidx.annotation.NonNull androidx.camera.core.impl.CameraInternal r0) {
            boolean r0 = r0.getHasTransform()
            if (r0 == 0) goto Lc
            boolean r0 = androidx.camera.video.VideoCapture.sEnableSurfaceProcessingByQuirk
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
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

    private void updateCustomOrderedResolutionsByQuality(@androidx.annotation.NonNull androidx.camera.core.impl.CameraInfoInternal r9, @androidx.annotation.NonNull androidx.camera.core.impl.UseCaseConfig.Builder<?, ?, ?> r10) throws java.lang.IllegalArgumentException {
            r8 = this;
            androidx.camera.video.MediaSpec r0 = r8.getMediaSpec()
            if (r0 == 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            java.lang.String r2 = "Unable to update target resolution by null MediaSpec."
            androidx.core.util.Preconditions.checkArgument(r1, r2)
            androidx.camera.core.DynamicRange r1 = r8.getDynamicRange()
            androidx.camera.video.VideoCapabilities r2 = r8.getVideoCapabilities(r9)
            java.util.List r3 = r2.getSupportedQualities(r1)
            boolean r4 = r3.isEmpty()
            java.lang.String r5 = "VideoCapture"
            if (r4 == 0) goto L28
            java.lang.String r9 = "Can't find any supported quality on the device."
            androidx.camera.core.Logger.w(r5, r9)
            return
        L28:
            androidx.camera.video.VideoSpec r0 = r0.getVideoSpec()
            androidx.camera.video.QualitySelector r4 = r0.getQualitySelector()
            java.util.List r3 = r4.getPrioritizedQualities(r3)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Found selectedQualities "
            r6.append(r7)
            r6.append(r3)
            java.lang.String r7 = " by "
            r6.append(r7)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            androidx.camera.core.Logger.d(r5, r4)
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto La6
            int r0 = r0.getAspectRatio()
            java.util.Map r1 = androidx.camera.video.QualitySelector.getQualityToResolutionMap(r2, r1)
            androidx.camera.video.QualityRatioToResolutionsTable r2 = new androidx.camera.video.QualityRatioToResolutionsTable
            int r4 = r8.getImageFormat()
            java.util.List r9 = r9.getSupportedResolutions(r4)
            r2.<init>(r9, r1)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r1 = r3.iterator()
        L74:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L88
            java.lang.Object r3 = r1.next()
            androidx.camera.video.Quality r3 = (androidx.camera.video.Quality) r3
            java.util.List r3 = r2.getResolutions(r3, r0)
            r9.addAll(r3)
            goto L74
        L88:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Set custom ordered resolutions = "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            androidx.camera.core.Logger.d(r5, r0)
            androidx.camera.core.impl.MutableConfig r10 = r10.getMutableConfig()
            androidx.camera.core.impl.Config$Option<java.util.List<android.util.Size>> r0 = androidx.camera.core.impl.ImageOutputConfig.OPTION_CUSTOM_ORDERED_RESOLUTIONS
            r10.insertOption(r0, r9)
            return
        La6:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Unable to find supported quality by QualitySelector"
            r9.<init>(r10)
            throw r9
    }

    @androidx.annotation.NonNull
    public static <T extends androidx.camera.video.VideoOutput> androidx.camera.video.VideoCapture<T> withOutput(@androidx.annotation.NonNull T r1) {
            androidx.camera.video.VideoCapture$Builder r0 = new androidx.camera.video.VideoCapture$Builder
            java.lang.Object r1 = androidx.core.util.Preconditions.checkNotNull(r1)
            androidx.camera.video.VideoOutput r1 = (androidx.camera.video.VideoOutput) r1
            r0.<init>(r1)
            androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r1 = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE
            androidx.camera.video.VideoCapture$Builder r1 = r0.setCaptureType(r1)
            androidx.camera.video.VideoCapture r1 = r1.build()
            return r1
    }

    @androidx.annotation.MainThread
    void applyStreamInfoAndStreamSpecToSessionConfigBuilder(@androidx.annotation.NonNull androidx.camera.core.impl.SessionConfig.Builder r5, @androidx.annotation.NonNull androidx.camera.video.StreamInfo r6, @androidx.annotation.NonNull androidx.camera.core.impl.StreamSpec r7) {
            r4 = this;
            int r0 = r6.getId()
            r1 = -1
            r2 = 0
            r3 = 1
            if (r0 != r1) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            androidx.camera.video.StreamInfo$StreamState r6 = r6.getStreamState()
            androidx.camera.video.StreamInfo$StreamState r1 = androidx.camera.video.StreamInfo.StreamState.ACTIVE
            if (r6 != r1) goto L15
            r2 = 1
        L15:
            if (r0 == 0) goto L22
            if (r2 != 0) goto L1a
            goto L22
        L1a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Unexpected stream state, stream is error but active"
            r5.<init>(r6)
            throw r5
        L22:
            r5.clearSurfaces()
            androidx.camera.core.DynamicRange r6 = r7.getDynamicRange()
            if (r0 != 0) goto L38
            if (r2 == 0) goto L33
            androidx.camera.core.impl.DeferrableSurface r7 = r4.mDeferrableSurface
            r5.addSurface(r7, r6)
            goto L38
        L33:
            androidx.camera.core.impl.DeferrableSurface r7 = r4.mDeferrableSurface
            r5.addNonRepeatingSurface(r7, r6)
        L38:
            r4.setupSurfaceUpdateNotifier(r5, r2)
            return
    }

    @androidx.annotation.Nullable
    @androidx.annotation.VisibleForTesting
    androidx.camera.core.processing.SurfaceEdge getCameraEdge() {
            r1 = this;
            androidx.camera.core.processing.SurfaceEdge r0 = r1.mCameraEdge
            return r0
    }

    @androidx.annotation.Nullable
    @androidx.annotation.VisibleForTesting
    android.graphics.Rect getCropRect() {
            r1 = this;
            android.graphics.Rect r0 = r1.mCropRect
            return r0
    }

    @Override // androidx.camera.core.UseCase
    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.camera.core.impl.UseCaseConfig<?> getDefaultConfig(boolean r4, @androidx.annotation.NonNull androidx.camera.core.impl.UseCaseConfigFactory r5) {
            r3 = this;
            androidx.camera.video.VideoCapture$Defaults r0 = androidx.camera.video.VideoCapture.DEFAULT_CONFIG
            androidx.camera.video.impl.VideoCaptureConfig r1 = r0.getConfig2()
            androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r1 = r1.getCaptureType()
            r2 = 1
            androidx.camera.core.impl.Config r5 = r5.getConfig(r1, r2)
            if (r4 == 0) goto L19
            androidx.camera.video.impl.VideoCaptureConfig r4 = r0.getConfig2()
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

    @androidx.annotation.NonNull
    public androidx.camera.core.DynamicRange getDynamicRange() {
            r1 = this;
            androidx.camera.core.impl.UseCaseConfig r0 = r1.getCurrentConfig()
            boolean r0 = r0.hasDynamicRange()
            if (r0 == 0) goto L13
            androidx.camera.core.impl.UseCaseConfig r0 = r1.getCurrentConfig()
            androidx.camera.core.DynamicRange r0 = r0.getDynamicRange()
            return r0
        L13:
            androidx.camera.core.DynamicRange r0 = androidx.camera.video.VideoCapture.Defaults.DEFAULT_DYNAMIC_RANGE
            return r0
    }

    public int getMirrorMode() {
            r1 = this;
            int r0 = r1.getMirrorModeInternal()
            return r0
    }

    @androidx.annotation.Nullable
    @androidx.annotation.VisibleForTesting
    androidx.camera.core.processing.SurfaceProcessorNode getNode() {
            r1 = this;
            androidx.camera.core.processing.SurfaceProcessorNode r0 = r1.mNode
            return r0
    }

    @androidx.annotation.NonNull
    public T getOutput() {
            r1 = this;
            androidx.camera.core.impl.UseCaseConfig r0 = r1.getCurrentConfig()
            androidx.camera.video.impl.VideoCaptureConfig r0 = (androidx.camera.video.impl.VideoCaptureConfig) r0
            androidx.camera.video.VideoOutput r0 = r0.getVideoOutput()
            return r0
    }

    @androidx.annotation.VisibleForTesting
    int getRotationDegrees() {
            r1 = this;
            int r0 = r1.mRotationDegrees
            return r0
    }

    @Override // androidx.camera.core.UseCase
    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public java.util.Set<java.lang.Integer> getSupportedEffectTargets() {
            r2 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.VisibleForTesting
    androidx.camera.core.SurfaceRequest getSurfaceRequest() {
            r1 = this;
            androidx.camera.core.SurfaceRequest r0 = r1.mSurfaceRequest
            java.util.Objects.requireNonNull(r0)
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
            androidx.camera.video.VideoCapture$Builder r1 = androidx.camera.video.VideoCapture.Builder.fromConfig(r1)
            return r1
    }

    boolean isStreamIdChanged(int r3, int r4) {
            r2 = this;
            java.util.Set<java.lang.Integer> r0 = androidx.camera.video.StreamInfo.NON_SURFACE_STREAM_ID
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L1a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L1a
            if (r3 == r4) goto L1a
            r3 = 1
            return r3
        L1a:
            r3 = 0
            return r3
    }

    @Override // androidx.camera.core.UseCase
    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    protected androidx.camera.core.impl.UseCaseConfig<?> onMergeConfig(@androidx.annotation.NonNull androidx.camera.core.impl.CameraInfoInternal r1, @androidx.annotation.NonNull androidx.camera.core.impl.UseCaseConfig.Builder<?, ?, ?> r2) {
            r0 = this;
            r0.updateCustomOrderedResolutionsByQuality(r1, r2)
            androidx.camera.core.impl.UseCaseConfig r1 = r2.getUseCaseConfig()
            return r1
    }

    @Override // androidx.camera.core.UseCase
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void onStateAttached() {
            r3 = this;
            super.onStateAttached()
            androidx.camera.core.impl.StreamSpec r0 = r3.getAttachedStreamSpec()
            java.lang.String r1 = "The suggested stream specification should be already updated and shouldn't be null."
            androidx.core.util.Preconditions.checkNotNull(r0, r1)
            androidx.camera.core.SurfaceRequest r0 = r3.mSurfaceRequest
            if (r0 != 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            java.lang.String r1 = "The surface request should be null when VideoCapture is attached."
            androidx.core.util.Preconditions.checkState(r0, r1)
            androidx.camera.core.impl.StreamSpec r0 = r3.getAttachedStreamSpec()
            java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r0)
            androidx.camera.core.impl.StreamSpec r0 = (androidx.camera.core.impl.StreamSpec) r0
            androidx.camera.video.VideoOutput r1 = r3.getOutput()
            androidx.camera.core.impl.Observable r1 = r1.getStreamInfo()
            androidx.camera.video.StreamInfo r2 = androidx.camera.video.StreamInfo.STREAM_INFO_ANY_INACTIVE
            java.lang.Object r1 = fetchObservableValue(r1, r2)
            androidx.camera.video.StreamInfo r1 = (androidx.camera.video.StreamInfo) r1
            r3.mStreamInfo = r1
            java.lang.String r1 = r3.getCameraId()
            androidx.camera.core.impl.UseCaseConfig r2 = r3.getCurrentConfig()
            androidx.camera.video.impl.VideoCaptureConfig r2 = (androidx.camera.video.impl.VideoCaptureConfig) r2
            androidx.camera.core.impl.SessionConfig$Builder r1 = r3.createPipeline(r1, r2, r0)
            r3.mSessionConfigBuilder = r1
            androidx.camera.video.StreamInfo r2 = r3.mStreamInfo
            r3.applyStreamInfoAndStreamSpecToSessionConfigBuilder(r1, r2, r0)
            androidx.camera.core.impl.SessionConfig$Builder r0 = r3.mSessionConfigBuilder
            androidx.camera.core.impl.SessionConfig r0 = r0.build()
            r3.updateSessionConfig(r0)
            r3.notifyActive()
            androidx.camera.video.VideoOutput r0 = r3.getOutput()
            androidx.camera.core.impl.Observable r0 = r0.getStreamInfo()
            java.util.concurrent.ScheduledExecutorService r1 = androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor()
            androidx.camera.core.impl.Observable$Observer<androidx.camera.video.StreamInfo> r2 = r3.mStreamInfoObserver
            r0.addObserver(r1, r2)
            androidx.camera.video.VideoOutput$SourceState r0 = androidx.camera.video.VideoOutput.SourceState.ACTIVE_NON_STREAMING
            r3.setSourceState(r0)
            return
    }

    @Override // androidx.camera.core.UseCase
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void onStateDetached() {
            r2 = this;
            boolean r0 = androidx.camera.core.impl.utils.Threads.isMainThread()
            java.lang.String r1 = "VideoCapture can only be detached on the main thread."
            androidx.core.util.Preconditions.checkState(r0, r1)
            androidx.camera.video.VideoOutput$SourceState r0 = androidx.camera.video.VideoOutput.SourceState.INACTIVE
            r2.setSourceState(r0)
            androidx.camera.video.VideoOutput r0 = r2.getOutput()
            androidx.camera.core.impl.Observable r0 = r0.getStreamInfo()
            androidx.camera.core.impl.Observable$Observer<androidx.camera.video.StreamInfo> r1 = r2.mStreamInfoObserver
            r0.removeObserver(r1)
            com.google.common.util.concurrent.ListenableFuture<java.lang.Void> r0 = r2.mSurfaceUpdateFuture
            if (r0 == 0) goto L2d
            r1 = 0
            boolean r0 = r0.cancel(r1)
            if (r0 == 0) goto L2d
            java.lang.String r0 = "VideoCapture"
            java.lang.String r1 = "VideoCapture is detached from the camera. Surface update cancelled."
            androidx.camera.core.Logger.d(r0, r1)
        L2d:
            r2.clearPipeline()
            return
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
    protected androidx.camera.core.impl.StreamSpec onSuggestedStreamSpecUpdated(@androidx.annotation.NonNull androidx.camera.core.impl.StreamSpec r5) {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onSuggestedStreamSpecUpdated: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "VideoCapture"
            androidx.camera.core.Logger.d(r1, r0)
            androidx.camera.core.impl.UseCaseConfig r0 = r4.getCurrentConfig()
            androidx.camera.video.impl.VideoCaptureConfig r0 = (androidx.camera.video.impl.VideoCaptureConfig) r0
            r2 = 0
            java.util.List r0 = r0.getCustomOrderedResolutions(r2)
            if (r0 == 0) goto L4d
            android.util.Size r2 = r5.getResolution()
            boolean r2 = r0.contains(r2)
            if (r2 != 0) goto L4d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "suggested resolution "
            r2.append(r3)
            android.util.Size r3 = r5.getResolution()
            r2.append(r3)
            java.lang.String r3 = " is not in custom ordered resolutions "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            androidx.camera.core.Logger.w(r1, r0)
        L4d:
            return r5
    }

    @androidx.annotation.MainThread
    void resetPipeline(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull androidx.camera.video.impl.VideoCaptureConfig<T> r3, @androidx.annotation.NonNull androidx.camera.core.impl.StreamSpec r4) {
            r1 = this;
            r1.clearPipeline()
            boolean r0 = r1.isCurrentCamera(r2)
            if (r0 == 0) goto L20
            androidx.camera.core.impl.SessionConfig$Builder r2 = r1.createPipeline(r2, r3, r4)
            r1.mSessionConfigBuilder = r2
            androidx.camera.video.StreamInfo r3 = r1.mStreamInfo
            r1.applyStreamInfoAndStreamSpecToSessionConfigBuilder(r2, r3, r4)
            androidx.camera.core.impl.SessionConfig$Builder r2 = r1.mSessionConfigBuilder
            androidx.camera.core.impl.SessionConfig r2 = r2.build()
            r1.updateSessionConfig(r2)
            r1.notifyReset()
        L20:
            return
    }

    @androidx.annotation.MainThread
    void setSourceState(@androidx.annotation.NonNull androidx.camera.video.VideoOutput.SourceState r2) {
            r1 = this;
            androidx.camera.video.VideoOutput$SourceState r0 = r1.mSourceState
            if (r2 == r0) goto Ld
            r1.mSourceState = r2
            androidx.camera.video.VideoOutput r0 = r1.getOutput()
            r0.onSourceStateChanged(r2)
        Ld:
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
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void setViewPortCropRect(@androidx.annotation.NonNull android.graphics.Rect r1) {
            r0 = this;
            super.setViewPortCropRect(r1)
            r0.sendTransformationInfoIfReady()
            return
    }

    boolean shouldResetCompensatingTransformation(@androidx.annotation.NonNull androidx.camera.video.StreamInfo r2, @androidx.annotation.NonNull androidx.camera.video.StreamInfo r3) {
            r1 = this;
            boolean r0 = r1.mHasCompensatingTransformation
            if (r0 == 0) goto L12
            androidx.camera.core.SurfaceRequest$TransformationInfo r2 = r2.getInProgressTransformationInfo()
            if (r2 == 0) goto L12
            androidx.camera.core.SurfaceRequest$TransformationInfo r2 = r3.getInProgressTransformationInfo()
            if (r2 != 0) goto L12
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "VideoCapture:"
            r0.append(r1)
            java.lang.String r1 = r2.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
