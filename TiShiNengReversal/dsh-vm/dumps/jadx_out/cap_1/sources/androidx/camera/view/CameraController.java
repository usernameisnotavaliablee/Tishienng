package androidx.camera.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class CameraController {
    private static final float AE_SIZE = 0.25f;
    private static final float AF_SIZE = 0.16666667f;
    private static final java.lang.String CAMERA_NOT_ATTACHED = "Use cases not attached to camera.";
    private static final java.lang.String CAMERA_NOT_INITIALIZED = "Camera not initialized.";
    public static final int COORDINATE_SYSTEM_VIEW_REFERENCED = 1;
    public static final int IMAGE_ANALYSIS = 2;
    public static final int IMAGE_CAPTURE = 1;
    private static final java.lang.String IMAGE_CAPTURE_DISABLED = "ImageCapture disabled.";
    private static final java.lang.String PREVIEW_VIEW_NOT_ATTACHED = "PreviewView not attached to CameraController.";
    private static final java.lang.String TAG = "CameraController";
    public static final int TAP_TO_FOCUS_FAILED = 4;
    public static final int TAP_TO_FOCUS_FOCUSED = 2;
    public static final int TAP_TO_FOCUS_NOT_FOCUSED = 3;
    public static final int TAP_TO_FOCUS_NOT_STARTED = 0;
    public static final int TAP_TO_FOCUS_STARTED = 1;
    public static final int VIDEO_CAPTURE = 4;
    private static final java.lang.String VIDEO_CAPTURE_DISABLED = "VideoCapture disabled.";
    private static final java.lang.String VIDEO_RECORDING_UNFINISHED = "Recording video. Only one recording can be active at a time.";

    @androidx.annotation.Nullable
    androidx.camera.video.Recording mActiveRecording;

    @androidx.annotation.Nullable
    private androidx.camera.core.ImageAnalysis.Analyzer mAnalysisAnalyzer;

    @androidx.annotation.Nullable
    private java.util.concurrent.Executor mAnalysisBackgroundExecutor;

    @androidx.annotation.Nullable
    private java.util.concurrent.Executor mAnalysisExecutor;
    private final android.content.Context mAppContext;

    @androidx.annotation.Nullable
    androidx.camera.core.Camera mCamera;

    @androidx.annotation.Nullable
    androidx.camera.view.ProcessCameraProviderWrapper mCameraProvider;
    androidx.camera.core.CameraSelector mCameraSelector;

    @androidx.annotation.NonNull
    @androidx.annotation.VisibleForTesting
    final androidx.camera.view.RotationProvider.Listener mDeviceRotationListener;

    @androidx.annotation.NonNull
    private final java.util.Set<androidx.camera.core.CameraEffect> mEffects;
    private int mEnabledUseCases;

    @androidx.annotation.NonNull
    androidx.camera.core.ImageAnalysis mImageAnalysis;

    @androidx.annotation.Nullable
    androidx.camera.view.CameraController.OutputSize mImageAnalysisTargetSize;

    @androidx.annotation.NonNull
    androidx.camera.core.ImageCapture mImageCapture;

    @androidx.annotation.Nullable
    java.util.concurrent.Executor mImageCaptureIoExecutor;

    @androidx.annotation.Nullable
    androidx.camera.view.CameraController.OutputSize mImageCaptureTargetSize;

    @androidx.annotation.NonNull
    private final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> mInitializationFuture;

    @androidx.annotation.NonNull
    private final androidx.camera.view.PendingValue<java.lang.Boolean> mPendingEnableTorch;

    @androidx.annotation.NonNull
    private final androidx.camera.view.PendingValue<java.lang.Float> mPendingLinearZoom;

    @androidx.annotation.NonNull
    private final androidx.camera.view.PendingValue<java.lang.Float> mPendingZoomRatio;
    private boolean mPinchToZoomEnabled;

    @androidx.annotation.NonNull
    androidx.camera.core.Preview mPreview;

    @androidx.annotation.Nullable
    androidx.camera.view.CameraController.OutputSize mPreviewTargetSize;

    @androidx.annotation.NonNull
    java.util.Map<androidx.core.util.Consumer<androidx.camera.video.VideoRecordEvent>, androidx.camera.video.Recording> mRecordingMap;
    private final androidx.camera.view.RotationProvider mRotationProvider;

    @androidx.annotation.Nullable
    androidx.camera.core.Preview.SurfaceProvider mSurfaceProvider;
    private boolean mTapToFocusEnabled;
    final androidx.lifecycle.MutableLiveData<java.lang.Integer> mTapToFocusState;
    private final androidx.camera.view.ForwardingLiveData<java.lang.Integer> mTorchState;

    @androidx.annotation.NonNull
    androidx.camera.video.VideoCapture<androidx.camera.video.Recorder> mVideoCapture;

    @androidx.annotation.NonNull
    androidx.camera.video.QualitySelector mVideoCaptureQualitySelector;

    @androidx.annotation.Nullable
    androidx.camera.core.ViewPort mViewPort;
    private final androidx.camera.view.ForwardingLiveData<androidx.camera.core.ZoomState> mZoomState;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.camera.view.CameraController$1, reason: invalid class name */
    class AnonymousClass1 implements androidx.core.util.Consumer<androidx.camera.video.VideoRecordEvent> {
        final /* synthetic */ androidx.camera.view.CameraController this$0;
        final /* synthetic */ androidx.core.util.Consumer val$listener;
        final /* synthetic */ java.util.concurrent.Executor val$mainExecutor;

        AnonymousClass1(androidx.camera.view.CameraController r1, java.util.concurrent.Executor r2, androidx.core.util.Consumer r3) {
                r0 = this;
                r0.this$0 = r1
                r0.val$mainExecutor = r2
                r0.val$listener = r3
                r0.<init>()
                return
        }

        public static /* synthetic */ void a(androidx.camera.view.CameraController.AnonymousClass1 r1) {
                androidx.camera.view.CameraController r0 = r1.this$0
                r0.deactivateRecordingByListener(r1)
                return
        }

        /* renamed from: accept, reason: avoid collision after fix types in other method */
        public void accept2(androidx.camera.video.VideoRecordEvent r3) {
                r2 = this;
                boolean r0 = r3 instanceof androidx.camera.video.VideoRecordEvent.Finalize
                if (r0 == 0) goto L1a
                boolean r0 = androidx.camera.core.impl.utils.Threads.isMainThread()
                if (r0 != 0) goto L15
                java.util.concurrent.Executor r0 = r2.val$mainExecutor
                androidx.camera.view.i r1 = new androidx.camera.view.i
                r1.<init>(r2)
                r0.execute(r1)
                goto L1a
            L15:
                androidx.camera.view.CameraController r0 = r2.this$0
                r0.deactivateRecordingByListener(r2)
            L1a:
                androidx.core.util.Consumer r0 = r2.val$listener
                r0.accept(r3)
                return
        }

        @Override // androidx.core.util.Consumer
        public /* bridge */ /* synthetic */ void accept(androidx.camera.video.VideoRecordEvent r1) {
                r0 = this;
                androidx.camera.video.VideoRecordEvent r1 = (androidx.camera.video.VideoRecordEvent) r1
                r0.accept2(r1)
                return
        }
    }


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(30)
    private static class Api30Impl {
        private Api30Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        @androidx.annotation.DoNotInline
        static android.content.Context createAttributionContext(@androidx.annotation.NonNull android.content.Context r0, @androidx.annotation.Nullable java.lang.String r1) {
                android.content.Context r0 = r0.createAttributionContext(r1)
                return r0
        }

        @androidx.annotation.Nullable
        @androidx.annotation.DoNotInline
        static java.lang.String getAttributionTag(@androidx.annotation.NonNull android.content.Context r0) {
                java.lang.String r0 = r0.getAttributionTag()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    public static final class OutputSize {
        public static final int UNASSIGNED_ASPECT_RATIO = -1;
        private final int mAspectRatio;

        @androidx.annotation.Nullable
        private final android.util.Size mResolution;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
        public @interface OutputAspectRatio {
        }

        public OutputSize(int r2) {
                r1 = this;
                r1.<init>()
                r0 = -1
                if (r2 == r0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                androidx.core.util.Preconditions.checkArgument(r0)
                r1.mAspectRatio = r2
                r2 = 0
                r1.mResolution = r2
                return
        }

        public OutputSize(@androidx.annotation.NonNull android.util.Size r2) {
                r1 = this;
                r1.<init>()
                androidx.core.util.Preconditions.checkNotNull(r2)
                r0 = -1
                r1.mAspectRatio = r0
                r1.mResolution = r2
                return
        }

        public int getAspectRatio() {
                r1 = this;
                int r0 = r1.mAspectRatio
                return r0
        }

        @androidx.annotation.Nullable
        public android.util.Size getResolution() {
                r1 = this;
                android.util.Size r0 = r1.mResolution
                return r0
        }

        @androidx.annotation.NonNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "aspect ratio: "
                r0.append(r1)
                int r1 = r2.mAspectRatio
                r0.append(r1)
                java.lang.String r1 = " resolution: "
                r0.append(r1)
                android.util.Size r1 = r2.mResolution
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public @interface UseCases {
    }

    CameraController(@androidx.annotation.NonNull android.content.Context r4) {
            r3 = this;
            com.google.common.util.concurrent.ListenableFuture r0 = androidx.camera.lifecycle.ProcessCameraProvider.getInstance(r4)
            androidx.camera.view.f r1 = new androidx.camera.view.f
            r1.<init>()
            java.util.concurrent.Executor r2 = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()
            com.google.common.util.concurrent.ListenableFuture r0 = androidx.camera.core.impl.utils.futures.Futures.transform(r0, r1, r2)
            r3.<init>(r4, r0)
            return
    }

    CameraController(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.NonNull com.google.common.util.concurrent.ListenableFuture<androidx.camera.view.ProcessCameraProviderWrapper> r4) {
            r2 = this;
            r2.<init>()
            androidx.camera.core.CameraSelector r0 = androidx.camera.core.CameraSelector.DEFAULT_BACK_CAMERA
            r2.mCameraSelector = r0
            r0 = 3
            r2.mEnabledUseCases = r0
            r0 = 0
            r2.mActiveRecording = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.mRecordingMap = r0
            androidx.camera.video.QualitySelector r0 = androidx.camera.video.Recorder.DEFAULT_QUALITY_SELECTOR
            r2.mVideoCaptureQualitySelector = r0
            r0 = 1
            r2.mPinchToZoomEnabled = r0
            r2.mTapToFocusEnabled = r0
            androidx.camera.view.ForwardingLiveData r0 = new androidx.camera.view.ForwardingLiveData
            r0.<init>()
            r2.mZoomState = r0
            androidx.camera.view.ForwardingLiveData r0 = new androidx.camera.view.ForwardingLiveData
            r0.<init>()
            r2.mTorchState = r0
            androidx.lifecycle.MutableLiveData r0 = new androidx.lifecycle.MutableLiveData
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.<init>(r1)
            r2.mTapToFocusState = r0
            androidx.camera.view.PendingValue r0 = new androidx.camera.view.PendingValue
            r0.<init>()
            r2.mPendingEnableTorch = r0
            androidx.camera.view.PendingValue r0 = new androidx.camera.view.PendingValue
            r0.<init>()
            r2.mPendingLinearZoom = r0
            androidx.camera.view.PendingValue r0 = new androidx.camera.view.PendingValue
            r0.<init>()
            r2.mPendingZoomRatio = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r2.mEffects = r0
            android.content.Context r3 = getApplicationContext(r3)
            r2.mAppContext = r3
            androidx.camera.core.Preview$Builder r0 = new androidx.camera.core.Preview$Builder
            r0.<init>()
            androidx.camera.core.Preview r0 = r0.build()
            r2.mPreview = r0
            androidx.camera.core.ImageCapture$Builder r0 = new androidx.camera.core.ImageCapture$Builder
            r0.<init>()
            androidx.camera.core.ImageCapture r0 = r0.build()
            r2.mImageCapture = r0
            androidx.camera.core.ImageAnalysis$Builder r0 = new androidx.camera.core.ImageAnalysis$Builder
            r0.<init>()
            androidx.camera.core.ImageAnalysis r0 = r0.build()
            r2.mImageAnalysis = r0
            androidx.camera.video.VideoCapture r0 = r2.createNewVideoCapture()
            r2.mVideoCapture = r0
            androidx.camera.view.d r0 = new androidx.camera.view.d
            r0.<init>(r2)
            java.util.concurrent.ScheduledExecutorService r1 = androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor()
            com.google.common.util.concurrent.ListenableFuture r4 = androidx.camera.core.impl.utils.futures.Futures.transform(r4, r0, r1)
            r2.mInitializationFuture = r4
            androidx.camera.view.RotationProvider r4 = new androidx.camera.view.RotationProvider
            r4.<init>(r3)
            r2.mRotationProvider = r4
            androidx.camera.view.e r3 = new androidx.camera.view.e
            r3.<init>(r2)
            r2.mDeviceRotationListener = r3
            return
    }

    public static /* synthetic */ java.lang.Void a(androidx.camera.view.CameraController r0, androidx.camera.view.ProcessCameraProviderWrapper r1) {
            r0.mCameraProvider = r1
            r0.startCameraAndTrackStates()
            r0 = 0
            return r0
    }

    public static /* synthetic */ void b(androidx.camera.view.CameraController r1, int r2) {
            androidx.camera.core.ImageAnalysis r0 = r1.mImageAnalysis
            r0.setTargetRotation(r2)
            androidx.camera.core.ImageCapture r0 = r1.mImageCapture
            r0.setTargetRotation(r2)
            androidx.camera.video.VideoCapture<androidx.camera.video.Recorder> r1 = r1.mVideoCapture
            r1.setTargetRotation(r2)
            return
    }

    public static /* synthetic */ void c(androidx.camera.view.CameraController r0, int r1) {
            r0.mEnabledUseCases = r1
            return
    }

    private void checkAudioPermissionGranted() {
            r2 = this;
            android.content.Context r0 = r2.mAppContext
            java.lang.String r1 = "android.permission.RECORD_AUDIO"
            int r0 = androidx.core.content.PermissionChecker.checkSelfPermission(r0, r1)
            r1 = -1
            if (r0 == r1) goto Lc
            return
        Lc:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.String r1 = "Attempted to start recording with audio, but application does not have RECORD_AUDIO permission granted."
            r0.<init>(r1)
            throw r0
    }

    private androidx.camera.video.VideoCapture<androidx.camera.video.Recorder> createNewVideoCapture() {
            r1 = this;
            androidx.camera.video.QualitySelector r0 = r1.mVideoCaptureQualitySelector
            androidx.camera.video.Recorder r0 = generateVideoCaptureRecorder(r0)
            androidx.camera.video.VideoCapture r0 = androidx.camera.video.VideoCapture.withOutput(r0)
            return r0
    }

    public static /* synthetic */ void d(androidx.camera.view.CameraController r0, androidx.camera.core.CameraSelector r1) {
            r0.mCameraSelector = r1
            return
    }

    @androidx.annotation.MainThread
    private void deactivateRecording(@androidx.annotation.NonNull androidx.camera.video.Recording r2) {
            r1 = this;
            androidx.camera.video.Recording r0 = r1.mActiveRecording
            if (r0 != r2) goto L7
            r2 = 0
            r1.mActiveRecording = r2
        L7:
            return
    }

    private static androidx.camera.video.Recorder generateVideoCaptureRecorder(@androidx.annotation.NonNull androidx.camera.video.QualitySelector r1) {
            androidx.camera.video.Recorder$Builder r0 = new androidx.camera.video.Recorder$Builder
            r0.<init>()
            androidx.camera.video.Recorder$Builder r1 = r0.setQualitySelector(r1)
            androidx.camera.video.Recorder r1 = r1.build()
            return r1
    }

    private static android.content.Context getApplicationContext(@androidx.annotation.NonNull android.content.Context r3) {
            android.content.Context r0 = r3.getApplicationContext()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 < r2) goto L15
            java.lang.String r3 = androidx.camera.view.CameraController.Api30Impl.getAttributionTag(r3)
            if (r3 == 0) goto L15
            android.content.Context r3 = androidx.camera.view.CameraController.Api30Impl.createAttributionContext(r0, r3)
            return r3
        L15:
            return r0
    }

    private boolean isCameraAttached() {
            r1 = this;
            androidx.camera.core.Camera r0 = r1.mCamera
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    private boolean isCameraInitialized() {
            r1 = this;
            androidx.camera.view.ProcessCameraProviderWrapper r0 = r1.mCameraProvider
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    private boolean isOutputSizeEqual(@androidx.annotation.Nullable androidx.camera.view.CameraController.OutputSize r2, @androidx.annotation.Nullable androidx.camera.view.CameraController.OutputSize r3) {
            r1 = this;
            r0 = 1
            if (r2 != r3) goto L4
            return r0
        L4:
            if (r2 == 0) goto Ld
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto Ld
            return r0
        Ld:
            r2 = 0
            return r2
    }

    private boolean isPreviewViewAttached() {
            r1 = this;
            androidx.camera.core.Preview$SurfaceProvider r0 = r1.mSurfaceProvider
            if (r0 == 0) goto La
            androidx.camera.core.ViewPort r0 = r1.mViewPort
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    private boolean isUseCaseEnabled(int r2) {
            r1 = this;
            int r0 = r1.mEnabledUseCases
            r2 = r2 & r0
            if (r2 == 0) goto L7
            r2 = 1
            return r2
        L7:
            r2 = 0
            return r2
    }

    @androidx.annotation.MainThread
    private androidx.camera.video.PendingRecording prepareRecording(@androidx.annotation.NonNull androidx.camera.video.OutputOptions r4) {
            r3 = this;
            androidx.camera.video.VideoCapture<androidx.camera.video.Recorder> r0 = r3.mVideoCapture
            androidx.camera.video.VideoOutput r0 = r0.getOutput()
            androidx.camera.video.Recorder r0 = (androidx.camera.video.Recorder) r0
            boolean r1 = r4 instanceof androidx.camera.video.FileOutputOptions
            if (r1 == 0) goto L15
            android.content.Context r1 = r3.mAppContext
            androidx.camera.video.FileOutputOptions r4 = (androidx.camera.video.FileOutputOptions) r4
            androidx.camera.video.PendingRecording r4 = r0.prepareRecording(r1, r4)
            return r4
        L15:
            boolean r1 = r4 instanceof androidx.camera.video.FileDescriptorOutputOptions
            if (r1 == 0) goto L30
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L28
            android.content.Context r1 = r3.mAppContext
            androidx.camera.video.FileDescriptorOutputOptions r4 = (androidx.camera.video.FileDescriptorOutputOptions) r4
            androidx.camera.video.PendingRecording r4 = r0.prepareRecording(r1, r4)
            return r4
        L28:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "File descriptors are not supported on pre-Android O (API 26) devices."
            r4.<init>(r0)
            throw r4
        L30:
            boolean r1 = r4 instanceof androidx.camera.video.MediaStoreOutputOptions
            if (r1 == 0) goto L3d
            android.content.Context r1 = r3.mAppContext
            androidx.camera.video.MediaStoreOutputOptions r4 = (androidx.camera.video.MediaStoreOutputOptions) r4
            androidx.camera.video.PendingRecording r4 = r0.prepareRecording(r1, r4)
            return r4
        L3d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unsupported OutputOptions type."
            r4.<init>(r0)
            throw r4
    }

    private void restartCameraIfAnalyzerResolutionChanged(@androidx.annotation.Nullable androidx.camera.core.ImageAnalysis.Analyzer r2, @androidx.annotation.Nullable androidx.camera.core.ImageAnalysis.Analyzer r3) {
            r1 = this;
            r0 = 0
            if (r2 != 0) goto L5
            r2 = r0
            goto L9
        L5:
            android.util.Size r2 = r2.getDefaultTargetResolution()
        L9:
            if (r3 != 0) goto Lc
            goto L10
        Lc:
            android.util.Size r0 = r3.getDefaultTargetResolution()
        L10:
            boolean r2 = java.util.Objects.equals(r2, r0)
            if (r2 != 0) goto L28
            androidx.camera.core.ImageAnalysis r2 = r1.mImageAnalysis
            int r2 = r2.getBackpressureStrategy()
            androidx.camera.core.ImageAnalysis r3 = r1.mImageAnalysis
            int r3 = r3.getImageQueueDepth()
            r1.unbindImageAnalysisAndRecreate(r2, r3)
            r1.startCameraAndTrackStates()
        L28:
            return
    }

    @androidx.annotation.MainThread
    private void setActiveRecording(@androidx.annotation.NonNull androidx.camera.video.Recording r2, @androidx.annotation.NonNull androidx.core.util.Consumer<androidx.camera.video.VideoRecordEvent> r3) {
            r1 = this;
            java.util.Map<androidx.core.util.Consumer<androidx.camera.video.VideoRecordEvent>, androidx.camera.video.Recording> r0 = r1.mRecordingMap
            r0.put(r3, r2)
            r1.mActiveRecording = r2
            return
    }

    private void setTargetOutputSize(@androidx.annotation.NonNull androidx.camera.core.impl.ImageOutputConfig.Builder<?> r3, @androidx.annotation.Nullable androidx.camera.view.CameraController.OutputSize r4) {
            r2 = this;
            if (r4 != 0) goto L3
            return
        L3:
            android.util.Size r0 = r4.getResolution()
            if (r0 == 0) goto L11
            android.util.Size r4 = r4.getResolution()
            r3.setTargetResolution(r4)
            return
        L11:
            int r0 = r4.getAspectRatio()
            r1 = -1
            if (r0 == r1) goto L20
            int r4 = r4.getAspectRatio()
            r3.setTargetAspectRatio(r4)
            return
        L20:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Invalid target surface size. "
            r3.append(r0)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "CameraController"
            androidx.camera.core.Logger.e(r4, r3)
            return
    }

    private float speedUpZoomBy2X(float r4) {
            r3 = this;
            r0 = 1073741824(0x40000000, float:2.0)
            r1 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r2 <= 0) goto Ld
            float r4 = r4 - r1
            float r4 = r4 * r0
            float r4 = r4 + r1
            return r4
        Ld:
            float r4 = r1 - r4
            float r4 = r4 * r0
            float r1 = r1 - r4
            return r1
    }

    private void startListeningToRotationEvents() {
            r3 = this;
            androidx.camera.view.RotationProvider r0 = r3.mRotationProvider
            java.util.concurrent.ScheduledExecutorService r1 = androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor()
            androidx.camera.view.RotationProvider$Listener r2 = r3.mDeviceRotationListener
            r0.addListener(r1, r2)
            return
    }

    @androidx.annotation.RequiresPermission("android.permission.RECORD_AUDIO")
    @androidx.annotation.MainThread
    private androidx.camera.video.Recording startRecordingInternal(@androidx.annotation.NonNull androidx.camera.video.OutputOptions r3, @androidx.annotation.NonNull androidx.camera.view.video.AudioConfig r4, @androidx.annotation.NonNull java.util.concurrent.Executor r5, @androidx.annotation.NonNull androidx.core.util.Consumer<androidx.camera.video.VideoRecordEvent> r6) {
            r2 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            boolean r0 = r2.isCameraInitialized()
            java.lang.String r1 = "Camera not initialized."
            androidx.core.util.Preconditions.checkState(r0, r1)
            boolean r0 = r2.isVideoCaptureEnabled()
            java.lang.String r1 = "VideoCapture disabled."
            androidx.core.util.Preconditions.checkState(r0, r1)
            boolean r0 = r2.isRecording()
            r0 = r0 ^ 1
            java.lang.String r1 = "Recording video. Only one recording can be active at a time."
            androidx.core.util.Preconditions.checkState(r0, r1)
            androidx.core.util.Consumer r6 = r2.wrapListenerToDeactivateRecordingOnFinalized(r6)
            androidx.camera.video.PendingRecording r3 = r2.prepareRecording(r3)
            boolean r4 = r4.getAudioEnabled()
            if (r4 == 0) goto L34
            r2.checkAudioPermissionGranted()
            r3.withAudioEnabled()
        L34:
            androidx.camera.video.Recording r3 = r3.start(r5, r6)
            r2.setActiveRecording(r3, r6)
            return r3
    }

    private void stopListeningToRotationEvents() {
            r2 = this;
            androidx.camera.view.RotationProvider r0 = r2.mRotationProvider
            androidx.camera.view.RotationProvider$Listener r1 = r2.mDeviceRotationListener
            r0.removeListener(r1)
            return
    }

    @androidx.annotation.MainThread
    private void stopRecording() {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.video.Recording r0 = r1.mActiveRecording
            if (r0 == 0) goto Lf
            r0.stop()
            androidx.camera.video.Recording r0 = r1.mActiveRecording
            r1.deactivateRecording(r0)
        Lf:
            return
    }

    @androidx.annotation.MainThread
    private void unbindImageAnalysisAndRecreate(int r5, int r6) {
            r4 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            boolean r0 = r4.isCameraInitialized()
            if (r0 == 0) goto L16
            androidx.camera.view.ProcessCameraProviderWrapper r0 = r4.mCameraProvider
            androidx.camera.core.ImageAnalysis r1 = r4.mImageAnalysis
            r2 = 1
            androidx.camera.core.UseCase[] r2 = new androidx.camera.core.UseCase[r2]
            r3 = 0
            r2[r3] = r1
            r0.unbind(r2)
        L16:
            androidx.camera.core.ImageAnalysis$Builder r0 = new androidx.camera.core.ImageAnalysis$Builder
            r0.<init>()
            androidx.camera.core.ImageAnalysis$Builder r5 = r0.setBackpressureStrategy(r5)
            androidx.camera.core.ImageAnalysis$Builder r5 = r5.setImageQueueDepth(r6)
            androidx.camera.view.CameraController$OutputSize r6 = r4.mImageAnalysisTargetSize
            r4.setTargetOutputSize(r5, r6)
            java.util.concurrent.Executor r6 = r4.mAnalysisBackgroundExecutor
            if (r6 == 0) goto L2f
            r5.setBackgroundExecutor(r6)
        L2f:
            androidx.camera.core.ImageAnalysis r5 = r5.build()
            r4.mImageAnalysis = r5
            java.util.concurrent.Executor r6 = r4.mAnalysisExecutor
            if (r6 == 0) goto L40
            androidx.camera.core.ImageAnalysis$Analyzer r0 = r4.mAnalysisAnalyzer
            if (r0 == 0) goto L40
            r5.setAnalyzer(r6, r0)
        L40:
            return
    }

    private void unbindImageCaptureAndRecreate(int r5) {
            r4 = this;
            boolean r0 = r4.isCameraInitialized()
            if (r0 == 0) goto L13
            androidx.camera.view.ProcessCameraProviderWrapper r0 = r4.mCameraProvider
            androidx.camera.core.ImageCapture r1 = r4.mImageCapture
            r2 = 1
            androidx.camera.core.UseCase[] r2 = new androidx.camera.core.UseCase[r2]
            r3 = 0
            r2[r3] = r1
            r0.unbind(r2)
        L13:
            androidx.camera.core.ImageCapture$Builder r0 = new androidx.camera.core.ImageCapture$Builder
            r0.<init>()
            androidx.camera.core.ImageCapture$Builder r5 = r0.setCaptureMode(r5)
            androidx.camera.view.CameraController$OutputSize r0 = r4.mImageCaptureTargetSize
            r4.setTargetOutputSize(r5, r0)
            java.util.concurrent.Executor r0 = r4.mImageCaptureIoExecutor
            if (r0 == 0) goto L28
            r5.setIoExecutor(r0)
        L28:
            androidx.camera.core.ImageCapture r5 = r5.build()
            r4.mImageCapture = r5
            return
    }

    private void unbindPreviewAndRecreate() {
            r4 = this;
            boolean r0 = r4.isCameraInitialized()
            if (r0 == 0) goto L13
            androidx.camera.view.ProcessCameraProviderWrapper r0 = r4.mCameraProvider
            androidx.camera.core.Preview r1 = r4.mPreview
            r2 = 1
            androidx.camera.core.UseCase[] r2 = new androidx.camera.core.UseCase[r2]
            r3 = 0
            r2[r3] = r1
            r0.unbind(r2)
        L13:
            androidx.camera.core.Preview$Builder r0 = new androidx.camera.core.Preview$Builder
            r0.<init>()
            androidx.camera.view.CameraController$OutputSize r1 = r4.mPreviewTargetSize
            r4.setTargetOutputSize(r0, r1)
            androidx.camera.core.Preview r0 = r0.build()
            r4.mPreview = r0
            return
    }

    private void unbindVideoAndRecreate() {
            r4 = this;
            boolean r0 = r4.isCameraInitialized()
            if (r0 == 0) goto L13
            androidx.camera.view.ProcessCameraProviderWrapper r0 = r4.mCameraProvider
            androidx.camera.video.VideoCapture<androidx.camera.video.Recorder> r1 = r4.mVideoCapture
            r2 = 1
            androidx.camera.core.UseCase[] r2 = new androidx.camera.core.UseCase[r2]
            r3 = 0
            r2[r3] = r1
            r0.unbind(r2)
        L13:
            androidx.camera.video.VideoCapture r0 = r4.createNewVideoCapture()
            r4.mVideoCapture = r0
            return
    }

    private androidx.core.util.Consumer<androidx.camera.video.VideoRecordEvent> wrapListenerToDeactivateRecordingOnFinalized(@androidx.annotation.NonNull androidx.core.util.Consumer<androidx.camera.video.VideoRecordEvent> r3) {
            r2 = this;
            android.content.Context r0 = r2.mAppContext
            java.util.concurrent.Executor r0 = androidx.core.content.ContextCompat.getMainExecutor(r0)
            androidx.camera.view.CameraController$1 r1 = new androidx.camera.view.CameraController$1
            r1.<init>(r2, r0, r3)
            return r1
    }

    @android.annotation.SuppressLint({"MissingPermission", "WrongConstant"})
    @androidx.annotation.MainThread
    void attachPreviewSurface(@androidx.annotation.NonNull androidx.camera.core.Preview.SurfaceProvider r2, @androidx.annotation.NonNull androidx.camera.core.ViewPort r3) {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.core.Preview$SurfaceProvider r0 = r1.mSurfaceProvider
            if (r0 == r2) goto Le
            r1.mSurfaceProvider = r2
            androidx.camera.core.Preview r0 = r1.mPreview
            r0.setSurfaceProvider(r2)
        Le:
            r1.mViewPort = r3
            r1.startListeningToRotationEvents()
            r1.startCameraAndTrackStates()
            return
    }

    @androidx.annotation.MainThread
    public void clearEffects() {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.view.ProcessCameraProviderWrapper r0 = r1.mCameraProvider
            if (r0 == 0) goto La
            r0.unbindAll()
        La:
            java.util.Set<androidx.camera.core.CameraEffect> r0 = r1.mEffects
            r0.clear()
            r1.startCameraAndTrackStates()
            return
    }

    @androidx.annotation.MainThread
    public void clearImageAnalysisAnalyzer() {
            r3 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.core.ImageAnalysis$Analyzer r0 = r3.mAnalysisAnalyzer
            r1 = 0
            r3.mAnalysisExecutor = r1
            r3.mAnalysisAnalyzer = r1
            androidx.camera.core.ImageAnalysis r2 = r3.mImageAnalysis
            r2.clearAnalyzer()
            r3.restartCameraIfAnalyzerResolutionChanged(r0, r1)
            return
    }

    @androidx.annotation.MainThread
    void clearPreviewSurface() {
            r7 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.view.ProcessCameraProviderWrapper r0 = r7.mCameraProvider
            if (r0 == 0) goto L21
            androidx.camera.core.Preview r1 = r7.mPreview
            androidx.camera.core.ImageCapture r2 = r7.mImageCapture
            androidx.camera.core.ImageAnalysis r3 = r7.mImageAnalysis
            androidx.camera.video.VideoCapture<androidx.camera.video.Recorder> r4 = r7.mVideoCapture
            r5 = 4
            androidx.camera.core.UseCase[] r5 = new androidx.camera.core.UseCase[r5]
            r6 = 0
            r5[r6] = r1
            r1 = 1
            r5[r1] = r2
            r1 = 2
            r5[r1] = r3
            r1 = 3
            r5[r1] = r4
            r0.unbind(r5)
        L21:
            androidx.camera.core.Preview r0 = r7.mPreview
            r1 = 0
            r0.setSurfaceProvider(r1)
            r7.mCamera = r1
            r7.mSurfaceProvider = r1
            r7.mViewPort = r1
            r7.stopListeningToRotationEvents()
            return
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    protected androidx.camera.core.UseCaseGroup createUseCaseGroup() {
            r6 = this;
            boolean r0 = r6.isCameraInitialized()
            r1 = 0
            java.lang.String r2 = "CameraController"
            if (r0 != 0) goto Lf
            java.lang.String r0 = "Camera not initialized."
            androidx.camera.core.Logger.d(r2, r0)
            return r1
        Lf:
            boolean r0 = r6.isPreviewViewAttached()
            if (r0 != 0) goto L1b
            java.lang.String r0 = "PreviewView not attached to CameraController."
            androidx.camera.core.Logger.d(r2, r0)
            return r1
        L1b:
            androidx.camera.core.UseCaseGroup$Builder r0 = new androidx.camera.core.UseCaseGroup$Builder
            r0.<init>()
            androidx.camera.core.Preview r1 = r6.mPreview
            androidx.camera.core.UseCaseGroup$Builder r0 = r0.addUseCase(r1)
            boolean r1 = r6.isImageCaptureEnabled()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L34
            androidx.camera.core.ImageCapture r1 = r6.mImageCapture
            r0.addUseCase(r1)
            goto L3f
        L34:
            androidx.camera.view.ProcessCameraProviderWrapper r1 = r6.mCameraProvider
            androidx.camera.core.ImageCapture r4 = r6.mImageCapture
            androidx.camera.core.UseCase[] r5 = new androidx.camera.core.UseCase[r3]
            r5[r2] = r4
            r1.unbind(r5)
        L3f:
            boolean r1 = r6.isImageAnalysisEnabled()
            if (r1 == 0) goto L4b
            androidx.camera.core.ImageAnalysis r1 = r6.mImageAnalysis
            r0.addUseCase(r1)
            goto L56
        L4b:
            androidx.camera.view.ProcessCameraProviderWrapper r1 = r6.mCameraProvider
            androidx.camera.core.ImageAnalysis r4 = r6.mImageAnalysis
            androidx.camera.core.UseCase[] r5 = new androidx.camera.core.UseCase[r3]
            r5[r2] = r4
            r1.unbind(r5)
        L56:
            boolean r1 = r6.isVideoCaptureEnabled()
            if (r1 == 0) goto L62
            androidx.camera.video.VideoCapture<androidx.camera.video.Recorder> r1 = r6.mVideoCapture
            r0.addUseCase(r1)
            goto L6d
        L62:
            androidx.camera.view.ProcessCameraProviderWrapper r1 = r6.mCameraProvider
            androidx.camera.video.VideoCapture<androidx.camera.video.Recorder> r4 = r6.mVideoCapture
            androidx.camera.core.UseCase[] r3 = new androidx.camera.core.UseCase[r3]
            r3[r2] = r4
            r1.unbind(r3)
        L6d:
            androidx.camera.core.ViewPort r1 = r6.mViewPort
            r0.setViewPort(r1)
            java.util.Set<androidx.camera.core.CameraEffect> r1 = r6.mEffects
            java.util.Iterator r1 = r1.iterator()
        L78:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L88
            java.lang.Object r2 = r1.next()
            androidx.camera.core.CameraEffect r2 = (androidx.camera.core.CameraEffect) r2
            r0.addEffect(r2)
            goto L78
        L88:
            androidx.camera.core.UseCaseGroup r0 = r0.build()
            return r0
    }

    @androidx.annotation.MainThread
    void deactivateRecordingByListener(@androidx.annotation.NonNull androidx.core.util.Consumer<androidx.camera.video.VideoRecordEvent> r2) {
            r1 = this;
            java.util.Map<androidx.core.util.Consumer<androidx.camera.video.VideoRecordEvent>, androidx.camera.video.Recording> r0 = r1.mRecordingMap
            java.lang.Object r2 = r0.remove(r2)
            androidx.camera.video.Recording r2 = (androidx.camera.video.Recording) r2
            if (r2 == 0) goto Ld
            r1.deactivateRecording(r2)
        Ld:
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.MainThread
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> enableTorch(boolean r2) {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            boolean r0 = r1.isCameraAttached()
            if (r0 != 0) goto L14
            androidx.camera.view.PendingValue<java.lang.Boolean> r0 = r1.mPendingEnableTorch
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            com.google.common.util.concurrent.ListenableFuture r2 = r0.setValue(r2)
            return r2
        L14:
            androidx.camera.core.Camera r0 = r1.mCamera
            androidx.camera.core.CameraControl r0 = r0.getCameraControl()
            com.google.common.util.concurrent.ListenableFuture r2 = r0.enableTorch(r2)
            return r2
    }

    @androidx.annotation.Nullable
    @androidx.annotation.MainThread
    public androidx.camera.core.CameraControl getCameraControl() {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.core.Camera r0 = r1.mCamera
            if (r0 != 0) goto L9
            r0 = 0
            return r0
        L9:
            androidx.camera.core.CameraControl r0 = r0.getCameraControl()
            return r0
    }

    @androidx.annotation.Nullable
    @androidx.annotation.MainThread
    public androidx.camera.core.CameraInfo getCameraInfo() {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.core.Camera r0 = r1.mCamera
            if (r0 != 0) goto L9
            r0 = 0
            return r0
        L9:
            androidx.camera.core.CameraInfo r0 = r0.getCameraInfo()
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.MainThread
    public androidx.camera.core.CameraSelector getCameraSelector() {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.core.CameraSelector r0 = r1.mCameraSelector
            return r0
    }

    @androidx.annotation.Nullable
    @androidx.annotation.MainThread
    public java.util.concurrent.Executor getImageAnalysisBackgroundExecutor() {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            java.util.concurrent.Executor r0 = r1.mAnalysisBackgroundExecutor
            return r0
    }

    @androidx.annotation.MainThread
    public int getImageAnalysisBackpressureStrategy() {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.core.ImageAnalysis r0 = r1.mImageAnalysis
            int r0 = r0.getBackpressureStrategy()
            return r0
    }

    @androidx.annotation.MainThread
    public int getImageAnalysisImageQueueDepth() {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.core.ImageAnalysis r0 = r1.mImageAnalysis
            int r0 = r0.getImageQueueDepth()
            return r0
    }

    @androidx.annotation.Nullable
    @androidx.annotation.MainThread
    public androidx.camera.view.CameraController.OutputSize getImageAnalysisTargetSize() {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.view.CameraController$OutputSize r0 = r1.mImageAnalysisTargetSize
            return r0
    }

    @androidx.annotation.MainThread
    public int getImageCaptureFlashMode() {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.core.ImageCapture r0 = r1.mImageCapture
            int r0 = r0.getFlashMode()
            return r0
    }

    @androidx.annotation.Nullable
    @androidx.annotation.MainThread
    public java.util.concurrent.Executor getImageCaptureIoExecutor() {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            java.util.concurrent.Executor r0 = r1.mImageCaptureIoExecutor
            return r0
    }

    @androidx.annotation.MainThread
    public int getImageCaptureMode() {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.core.ImageCapture r0 = r1.mImageCapture
            int r0 = r0.getCaptureMode()
            return r0
    }

    @androidx.annotation.Nullable
    @androidx.annotation.MainThread
    public androidx.camera.view.CameraController.OutputSize getImageCaptureTargetSize() {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.view.CameraController$OutputSize r0 = r1.mImageCaptureTargetSize
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> getInitializationFuture() {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture<java.lang.Void> r0 = r1.mInitializationFuture
            return r0
    }

    @androidx.annotation.Nullable
    @androidx.annotation.MainThread
    public androidx.camera.view.CameraController.OutputSize getPreviewTargetSize() {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.view.CameraController$OutputSize r0 = r1.mPreviewTargetSize
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.MainThread
    public androidx.lifecycle.LiveData<java.lang.Integer> getTapToFocusState() {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.lifecycle.MutableLiveData<java.lang.Integer> r0 = r1.mTapToFocusState
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.MainThread
    public androidx.lifecycle.LiveData<java.lang.Integer> getTorchState() {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.view.ForwardingLiveData<java.lang.Integer> r0 = r1.mTorchState
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.MainThread
    public androidx.camera.video.QualitySelector getVideoCaptureQualitySelector() {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.video.QualitySelector r0 = r1.mVideoCaptureQualitySelector
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.MainThread
    public androidx.lifecycle.LiveData<androidx.camera.core.ZoomState> getZoomState() {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.view.ForwardingLiveData<androidx.camera.core.ZoomState> r0 = r1.mZoomState
            return r0
    }

    @androidx.annotation.MainThread
    public boolean hasCamera(@androidx.annotation.NonNull androidx.camera.core.CameraSelector r3) {
            r2 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.core.util.Preconditions.checkNotNull(r3)
            androidx.camera.view.ProcessCameraProviderWrapper r0 = r2.mCameraProvider
            if (r0 == 0) goto L19
            boolean r3 = r0.hasCamera(r3)     // Catch: androidx.camera.core.CameraInfoUnavailableException -> Lf
            return r3
        Lf:
            r3 = move-exception
            java.lang.String r0 = "CameraController"
            java.lang.String r1 = "Failed to check camera availability"
            androidx.camera.core.Logger.w(r0, r1, r3)
            r3 = 0
            return r3
        L19:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Camera not initialized. Please wait for the initialization future to finish. See #getInitializationFuture()."
            r3.<init>(r0)
            throw r3
    }

    @androidx.annotation.MainThread
    public boolean isImageAnalysisEnabled() {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            r0 = 2
            boolean r0 = r1.isUseCaseEnabled(r0)
            return r0
    }

    @androidx.annotation.MainThread
    public boolean isImageCaptureEnabled() {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            r0 = 1
            boolean r0 = r1.isUseCaseEnabled(r0)
            return r0
    }

    @androidx.annotation.MainThread
    public boolean isPinchToZoomEnabled() {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            boolean r0 = r1.mPinchToZoomEnabled
            return r0
    }

    @androidx.annotation.MainThread
    public boolean isRecording() {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.video.Recording r0 = r1.mActiveRecording
            if (r0 == 0) goto Lf
            boolean r0 = r0.isClosed()
            if (r0 != 0) goto Lf
            r0 = 1
            return r0
        Lf:
            r0 = 0
            return r0
    }

    @androidx.annotation.MainThread
    public boolean isTapToFocusEnabled() {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            boolean r0 = r1.mTapToFocusEnabled
            return r0
    }

    @androidx.annotation.MainThread
    public boolean isVideoCaptureEnabled() {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            r0 = 4
            boolean r0 = r1.isUseCaseEnabled(r0)
            return r0
    }

    void onPinchToZoom(float r4) {
            r3 = this;
            boolean r0 = r3.isCameraAttached()
            java.lang.String r1 = "CameraController"
            if (r0 != 0) goto Le
            java.lang.String r4 = "Use cases not attached to camera."
            androidx.camera.core.Logger.w(r1, r4)
            return
        Le:
            boolean r0 = r3.mPinchToZoomEnabled
            if (r0 != 0) goto L18
            java.lang.String r4 = "Pinch to zoom disabled."
            androidx.camera.core.Logger.d(r1, r4)
            return
        L18:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Pinch to zoom with scale: "
            r0.append(r2)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            androidx.camera.core.Logger.d(r1, r0)
            androidx.lifecycle.LiveData r0 = r3.getZoomState()
            java.lang.Object r0 = r0.getValue()
            androidx.camera.core.ZoomState r0 = (androidx.camera.core.ZoomState) r0
            if (r0 != 0) goto L39
            return
        L39:
            float r1 = r0.getZoomRatio()
            float r4 = r3.speedUpZoomBy2X(r4)
            float r1 = r1 * r4
            float r4 = r0.getMinZoomRatio()
            float r4 = java.lang.Math.max(r1, r4)
            float r0 = r0.getMaxZoomRatio()
            float r4 = java.lang.Math.min(r4, r0)
            r3.setZoomRatio(r4)
            return
    }

    void onTapToFocus(androidx.camera.core.MeteringPointFactory r4, float r5, float r6) {
            r3 = this;
            boolean r0 = r3.isCameraAttached()
            java.lang.String r1 = "CameraController"
            if (r0 != 0) goto Le
            java.lang.String r4 = "Use cases not attached to camera."
            androidx.camera.core.Logger.w(r1, r4)
            return
        Le:
            boolean r0 = r3.mTapToFocusEnabled
            if (r0 != 0) goto L18
            java.lang.String r4 = "Tap to focus disabled. "
            androidx.camera.core.Logger.d(r1, r4)
            return
        L18:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Tap to focus started: "
            r0.append(r2)
            r0.append(r5)
            java.lang.String r2 = ", "
            r0.append(r2)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            androidx.camera.core.Logger.d(r1, r0)
            androidx.lifecycle.MutableLiveData<java.lang.Integer> r0 = r3.mTapToFocusState
            r1 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r0.postValue(r2)
            r0 = 1042983595(0x3e2aaaab, float:0.16666667)
            androidx.camera.core.MeteringPoint r0 = r4.createPoint(r5, r6, r0)
            r2 = 1048576000(0x3e800000, float:0.25)
            androidx.camera.core.MeteringPoint r4 = r4.createPoint(r5, r6, r2)
            androidx.camera.core.FocusMeteringAction$Builder r5 = new androidx.camera.core.FocusMeteringAction$Builder
            r5.<init>(r0, r1)
            r6 = 2
            androidx.camera.core.FocusMeteringAction$Builder r4 = r5.addPoint(r4, r6)
            androidx.camera.core.FocusMeteringAction r4 = r4.build()
            androidx.camera.core.Camera r5 = r3.mCamera
            androidx.camera.core.CameraControl r5 = r5.getCameraControl()
            com.google.common.util.concurrent.ListenableFuture r4 = r5.startFocusAndMetering(r4)
            androidx.camera.view.CameraController$2 r5 = new androidx.camera.view.CameraController$2
            r5.<init>(r3)
            java.util.concurrent.Executor r6 = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()
            androidx.camera.core.impl.utils.futures.Futures.addCallback(r4, r5, r6)
            return
    }

    @androidx.annotation.MainThread
    public void setCameraSelector(@androidx.annotation.NonNull androidx.camera.core.CameraSelector r8) {
            r7 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.core.CameraSelector r0 = r7.mCameraSelector
            if (r0 != r8) goto L8
            goto Le
        L8:
            r7.mCameraSelector = r8
            androidx.camera.view.ProcessCameraProviderWrapper r8 = r7.mCameraProvider
            if (r8 != 0) goto Lf
        Le:
            return
        Lf:
            androidx.camera.core.Preview r1 = r7.mPreview
            androidx.camera.core.ImageCapture r2 = r7.mImageCapture
            androidx.camera.core.ImageAnalysis r3 = r7.mImageAnalysis
            androidx.camera.video.VideoCapture<androidx.camera.video.Recorder> r4 = r7.mVideoCapture
            r5 = 4
            androidx.camera.core.UseCase[] r5 = new androidx.camera.core.UseCase[r5]
            r6 = 0
            r5[r6] = r1
            r1 = 1
            r5[r1] = r2
            r1 = 2
            r5[r1] = r3
            r1 = 3
            r5[r1] = r4
            r8.unbind(r5)
            androidx.camera.view.h r8 = new androidx.camera.view.h
            r8.<init>(r7, r0)
            r7.startCameraAndTrackStates(r8)
            return
    }

    @androidx.annotation.MainThread
    public void setEffects(@androidx.annotation.NonNull java.util.Set<androidx.camera.core.CameraEffect> r2) {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            java.util.Set<androidx.camera.core.CameraEffect> r0 = r1.mEffects
            boolean r0 = java.util.Objects.equals(r0, r2)
            if (r0 == 0) goto Lc
            return
        Lc:
            androidx.camera.view.ProcessCameraProviderWrapper r0 = r1.mCameraProvider
            if (r0 == 0) goto L13
            r0.unbindAll()
        L13:
            java.util.Set<androidx.camera.core.CameraEffect> r0 = r1.mEffects
            r0.clear()
            java.util.Set<androidx.camera.core.CameraEffect> r0 = r1.mEffects
            r0.addAll(r2)
            r1.startCameraAndTrackStates()
            return
    }

    @androidx.annotation.MainThread
    public void setEnabledUseCases(int r2) {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            int r0 = r1.mEnabledUseCases
            if (r2 != r0) goto L8
            return
        L8:
            r1.mEnabledUseCases = r2
            boolean r2 = r1.isVideoCaptureEnabled()
            if (r2 != 0) goto L19
            boolean r2 = r1.isRecording()
            if (r2 == 0) goto L19
            r1.stopRecording()
        L19:
            androidx.camera.view.g r2 = new androidx.camera.view.g
            r2.<init>(r1, r0)
            r1.startCameraAndTrackStates(r2)
            return
    }

    @androidx.annotation.MainThread
    public void setImageAnalysisAnalyzer(@androidx.annotation.NonNull java.util.concurrent.Executor r3, @androidx.annotation.NonNull androidx.camera.core.ImageAnalysis.Analyzer r4) {
            r2 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.core.ImageAnalysis$Analyzer r0 = r2.mAnalysisAnalyzer
            if (r0 != r4) goto Lc
            java.util.concurrent.Executor r1 = r2.mAnalysisExecutor
            if (r1 != r3) goto Lc
            return
        Lc:
            r2.mAnalysisExecutor = r3
            r2.mAnalysisAnalyzer = r4
            androidx.camera.core.ImageAnalysis r1 = r2.mImageAnalysis
            r1.setAnalyzer(r3, r4)
            r2.restartCameraIfAnalyzerResolutionChanged(r0, r4)
            return
    }

    @androidx.annotation.MainThread
    public void setImageAnalysisBackgroundExecutor(@androidx.annotation.Nullable java.util.concurrent.Executor r2) {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            java.util.concurrent.Executor r0 = r1.mAnalysisBackgroundExecutor
            if (r0 != r2) goto L8
            return
        L8:
            r1.mAnalysisBackgroundExecutor = r2
            androidx.camera.core.ImageAnalysis r2 = r1.mImageAnalysis
            int r2 = r2.getBackpressureStrategy()
            androidx.camera.core.ImageAnalysis r0 = r1.mImageAnalysis
            int r0 = r0.getImageQueueDepth()
            r1.unbindImageAnalysisAndRecreate(r2, r0)
            r1.startCameraAndTrackStates()
            return
    }

    @androidx.annotation.MainThread
    public void setImageAnalysisBackpressureStrategy(int r2) {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.core.ImageAnalysis r0 = r1.mImageAnalysis
            int r0 = r0.getBackpressureStrategy()
            if (r0 != r2) goto Lc
            return
        Lc:
            androidx.camera.core.ImageAnalysis r0 = r1.mImageAnalysis
            int r0 = r0.getImageQueueDepth()
            r1.unbindImageAnalysisAndRecreate(r2, r0)
            r1.startCameraAndTrackStates()
            return
    }

    @androidx.annotation.MainThread
    public void setImageAnalysisImageQueueDepth(int r2) {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.core.ImageAnalysis r0 = r1.mImageAnalysis
            int r0 = r0.getImageQueueDepth()
            if (r0 != r2) goto Lc
            return
        Lc:
            androidx.camera.core.ImageAnalysis r0 = r1.mImageAnalysis
            int r0 = r0.getBackpressureStrategy()
            r1.unbindImageAnalysisAndRecreate(r0, r2)
            r1.startCameraAndTrackStates()
            return
    }

    @androidx.annotation.MainThread
    public void setImageAnalysisTargetSize(@androidx.annotation.Nullable androidx.camera.view.CameraController.OutputSize r2) {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.view.CameraController$OutputSize r0 = r1.mImageAnalysisTargetSize
            boolean r0 = r1.isOutputSizeEqual(r0, r2)
            if (r0 == 0) goto Lc
            return
        Lc:
            r1.mImageAnalysisTargetSize = r2
            androidx.camera.core.ImageAnalysis r2 = r1.mImageAnalysis
            int r2 = r2.getBackpressureStrategy()
            androidx.camera.core.ImageAnalysis r0 = r1.mImageAnalysis
            int r0 = r0.getImageQueueDepth()
            r1.unbindImageAnalysisAndRecreate(r2, r0)
            r1.startCameraAndTrackStates()
            return
    }

    @androidx.annotation.MainThread
    public void setImageCaptureFlashMode(int r2) {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.core.ImageCapture r0 = r1.mImageCapture
            r0.setFlashMode(r2)
            return
    }

    @androidx.annotation.MainThread
    public void setImageCaptureIoExecutor(@androidx.annotation.Nullable java.util.concurrent.Executor r2) {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            java.util.concurrent.Executor r0 = r1.mImageCaptureIoExecutor
            if (r0 != r2) goto L8
            return
        L8:
            r1.mImageCaptureIoExecutor = r2
            androidx.camera.core.ImageCapture r2 = r1.mImageCapture
            int r2 = r2.getCaptureMode()
            r1.unbindImageCaptureAndRecreate(r2)
            r1.startCameraAndTrackStates()
            return
    }

    @androidx.annotation.MainThread
    public void setImageCaptureMode(int r2) {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.core.ImageCapture r0 = r1.mImageCapture
            int r0 = r0.getCaptureMode()
            if (r0 != r2) goto Lc
            return
        Lc:
            r1.unbindImageCaptureAndRecreate(r2)
            r1.startCameraAndTrackStates()
            return
    }

    @androidx.annotation.MainThread
    public void setImageCaptureTargetSize(@androidx.annotation.Nullable androidx.camera.view.CameraController.OutputSize r2) {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.view.CameraController$OutputSize r0 = r1.mImageCaptureTargetSize
            boolean r0 = r1.isOutputSizeEqual(r0, r2)
            if (r0 == 0) goto Lc
            return
        Lc:
            r1.mImageCaptureTargetSize = r2
            int r2 = r1.getImageCaptureMode()
            r1.unbindImageCaptureAndRecreate(r2)
            r1.startCameraAndTrackStates()
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.MainThread
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> setLinearZoom(@androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r2) {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            boolean r0 = r1.isCameraAttached()
            if (r0 != 0) goto L14
            androidx.camera.view.PendingValue<java.lang.Float> r0 = r1.mPendingLinearZoom
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            com.google.common.util.concurrent.ListenableFuture r2 = r0.setValue(r2)
            return r2
        L14:
            androidx.camera.core.Camera r0 = r1.mCamera
            androidx.camera.core.CameraControl r0 = r0.getCameraControl()
            com.google.common.util.concurrent.ListenableFuture r2 = r0.setLinearZoom(r2)
            return r2
    }

    @androidx.annotation.MainThread
    public void setPinchToZoomEnabled(boolean r1) {
            r0 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            r0.mPinchToZoomEnabled = r1
            return
    }

    @androidx.annotation.MainThread
    public void setPreviewTargetSize(@androidx.annotation.Nullable androidx.camera.view.CameraController.OutputSize r2) {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.view.CameraController$OutputSize r0 = r1.mPreviewTargetSize
            boolean r0 = r1.isOutputSizeEqual(r0, r2)
            if (r0 == 0) goto Lc
            return
        Lc:
            r1.mPreviewTargetSize = r2
            r1.unbindPreviewAndRecreate()
            r1.startCameraAndTrackStates()
            return
    }

    @androidx.annotation.MainThread
    public void setTapToFocusEnabled(boolean r1) {
            r0 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            r0.mTapToFocusEnabled = r1
            return
    }

    @androidx.annotation.MainThread
    public void setVideoCaptureQualitySelector(@androidx.annotation.NonNull androidx.camera.video.QualitySelector r1) {
            r0 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            r0.mVideoCaptureQualitySelector = r1
            r0.unbindVideoAndRecreate()
            r0.startCameraAndTrackStates()
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.MainThread
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> setZoomRatio(float r2) {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            boolean r0 = r1.isCameraAttached()
            if (r0 != 0) goto L14
            androidx.camera.view.PendingValue<java.lang.Float> r0 = r1.mPendingZoomRatio
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            com.google.common.util.concurrent.ListenableFuture r2 = r0.setValue(r2)
            return r2
        L14:
            androidx.camera.core.Camera r0 = r1.mCamera
            androidx.camera.core.CameraControl r0 = r0.getCameraControl()
            com.google.common.util.concurrent.ListenableFuture r2 = r0.setZoomRatio(r2)
            return r2
    }

    @androidx.annotation.Nullable
    abstract androidx.camera.core.Camera startCamera();

    void startCameraAndTrackStates() {
            r1 = this;
            r0 = 0
            r1.startCameraAndTrackStates(r0)
            return
    }

    void startCameraAndTrackStates(@androidx.annotation.Nullable java.lang.Runnable r2) {
            r1 = this;
            androidx.camera.core.Camera r0 = r1.startCamera()     // Catch: java.lang.RuntimeException -> L51
            r1.mCamera = r0     // Catch: java.lang.RuntimeException -> L51
            boolean r2 = r1.isCameraAttached()
            if (r2 != 0) goto L14
            java.lang.String r2 = "CameraController"
            java.lang.String r0 = "Use cases not attached to camera."
            androidx.camera.core.Logger.d(r2, r0)
            return
        L14:
            androidx.camera.view.ForwardingLiveData<androidx.camera.core.ZoomState> r2 = r1.mZoomState
            androidx.camera.core.Camera r0 = r1.mCamera
            androidx.camera.core.CameraInfo r0 = r0.getCameraInfo()
            androidx.lifecycle.LiveData r0 = r0.getZoomState()
            r2.setSource(r0)
            androidx.camera.view.ForwardingLiveData<java.lang.Integer> r2 = r1.mTorchState
            androidx.camera.core.Camera r0 = r1.mCamera
            androidx.camera.core.CameraInfo r0 = r0.getCameraInfo()
            androidx.lifecycle.LiveData r0 = r0.getTorchState()
            r2.setSource(r0)
            androidx.camera.view.PendingValue<java.lang.Boolean> r2 = r1.mPendingEnableTorch
            androidx.camera.view.a r0 = new androidx.camera.view.a
            r0.<init>(r1)
            r2.propagateIfHasValue(r0)
            androidx.camera.view.PendingValue<java.lang.Float> r2 = r1.mPendingLinearZoom
            androidx.camera.view.b r0 = new androidx.camera.view.b
            r0.<init>(r1)
            r2.propagateIfHasValue(r0)
            androidx.camera.view.PendingValue<java.lang.Float> r2 = r1.mPendingZoomRatio
            androidx.camera.view.c r0 = new androidx.camera.view.c
            r0.<init>(r1)
            r2.propagateIfHasValue(r0)
            return
        L51:
            r0 = move-exception
            if (r2 == 0) goto L57
            r2.run()
        L57:
            throw r0
    }

    @androidx.annotation.NonNull
    @android.annotation.SuppressLint({"MissingPermission"})
    @androidx.annotation.RequiresApi(26)
    @androidx.annotation.MainThread
    public androidx.camera.video.Recording startRecording(@androidx.annotation.NonNull androidx.camera.video.FileDescriptorOutputOptions r1, @androidx.annotation.NonNull androidx.camera.view.video.AudioConfig r2, @androidx.annotation.NonNull java.util.concurrent.Executor r3, @androidx.annotation.NonNull androidx.core.util.Consumer<androidx.camera.video.VideoRecordEvent> r4) {
            r0 = this;
            androidx.camera.video.Recording r1 = r0.startRecordingInternal(r1, r2, r3, r4)
            return r1
    }

    @androidx.annotation.NonNull
    @android.annotation.SuppressLint({"MissingPermission"})
    @androidx.annotation.MainThread
    public androidx.camera.video.Recording startRecording(@androidx.annotation.NonNull androidx.camera.video.FileOutputOptions r1, @androidx.annotation.NonNull androidx.camera.view.video.AudioConfig r2, @androidx.annotation.NonNull java.util.concurrent.Executor r3, @androidx.annotation.NonNull androidx.core.util.Consumer<androidx.camera.video.VideoRecordEvent> r4) {
            r0 = this;
            androidx.camera.video.Recording r1 = r0.startRecordingInternal(r1, r2, r3, r4)
            return r1
    }

    @androidx.annotation.NonNull
    @android.annotation.SuppressLint({"MissingPermission"})
    @androidx.annotation.MainThread
    public androidx.camera.video.Recording startRecording(@androidx.annotation.NonNull androidx.camera.video.MediaStoreOutputOptions r1, @androidx.annotation.NonNull androidx.camera.view.video.AudioConfig r2, @androidx.annotation.NonNull java.util.concurrent.Executor r3, @androidx.annotation.NonNull androidx.core.util.Consumer<androidx.camera.video.VideoRecordEvent> r4) {
            r0 = this;
            androidx.camera.video.Recording r1 = r0.startRecordingInternal(r1, r2, r3, r4)
            return r1
    }

    @androidx.annotation.MainThread
    public void takePicture(@androidx.annotation.NonNull androidx.camera.core.ImageCapture.OutputFileOptions r3, @androidx.annotation.NonNull java.util.concurrent.Executor r4, @androidx.annotation.NonNull androidx.camera.core.ImageCapture.OnImageSavedCallback r5) {
            r2 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            boolean r0 = r2.isCameraInitialized()
            java.lang.String r1 = "Camera not initialized."
            androidx.core.util.Preconditions.checkState(r0, r1)
            boolean r0 = r2.isImageCaptureEnabled()
            java.lang.String r1 = "ImageCapture disabled."
            androidx.core.util.Preconditions.checkState(r0, r1)
            r2.updateMirroringFlagInOutputFileOptions(r3)
            androidx.camera.core.ImageCapture r0 = r2.mImageCapture
            r0.takePicture(r3, r4, r5)
            return
    }

    @androidx.annotation.MainThread
    public void takePicture(@androidx.annotation.NonNull java.util.concurrent.Executor r3, @androidx.annotation.NonNull androidx.camera.core.ImageCapture.OnImageCapturedCallback r4) {
            r2 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            boolean r0 = r2.isCameraInitialized()
            java.lang.String r1 = "Camera not initialized."
            androidx.core.util.Preconditions.checkState(r0, r1)
            boolean r0 = r2.isImageCaptureEnabled()
            java.lang.String r1 = "ImageCapture disabled."
            androidx.core.util.Preconditions.checkState(r0, r1)
            androidx.camera.core.ImageCapture r0 = r2.mImageCapture
            r0.takePicture(r3, r4)
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    @androidx.annotation.VisibleForTesting
    void updateMirroringFlagInOutputFileOptions(@androidx.annotation.NonNull androidx.camera.core.ImageCapture.OutputFileOptions r2) {
            r1 = this;
            androidx.camera.core.CameraSelector r0 = r1.mCameraSelector
            java.lang.Integer r0 = r0.getLensFacing()
            if (r0 == 0) goto L28
            androidx.camera.core.ImageCapture$Metadata r0 = r2.getMetadata()
            boolean r0 = r0.isReversedHorizontalSet()
            if (r0 != 0) goto L28
            androidx.camera.core.ImageCapture$Metadata r2 = r2.getMetadata()
            androidx.camera.core.CameraSelector r0 = r1.mCameraSelector
            java.lang.Integer r0 = r0.getLensFacing()
            int r0 = r0.intValue()
            if (r0 != 0) goto L24
            r0 = 1
            goto L25
        L24:
            r0 = 0
        L25:
            r2.setReversedHorizontal(r0)
        L28:
            return
    }

    @androidx.annotation.OptIn(markerClass = {androidx.camera.view.TransformExperimental.class})
    @androidx.annotation.MainThread
    void updatePreviewViewTransform(@androidx.annotation.Nullable android.graphics.Matrix r3) {
            r2 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.core.ImageAnalysis$Analyzer r0 = r2.mAnalysisAnalyzer
            if (r0 != 0) goto L8
            goto L14
        L8:
            int r0 = r0.getTargetCoordinateSystem()
            r1 = 1
            if (r0 != r1) goto L14
            androidx.camera.core.ImageAnalysis$Analyzer r0 = r2.mAnalysisAnalyzer
            r0.updateTransform(r3)
        L14:
            return
    }
}
