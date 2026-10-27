package androidx.camera.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ImageCapture extends androidx.camera.core.UseCase {
    public static final int CAPTURE_MODE_MAXIMIZE_QUALITY = 0;
    public static final int CAPTURE_MODE_MINIMIZE_LATENCY = 1;

    @androidx.camera.core.ExperimentalZeroShutterLag
    public static final int CAPTURE_MODE_ZERO_SHUTTER_LAG = 2;
    private static final int DEFAULT_CAPTURE_MODE = 1;

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static final androidx.camera.core.ImageCapture.Defaults DEFAULT_CONFIG = null;
    private static final int DEFAULT_FLASH_MODE = 2;
    public static final int ERROR_CAMERA_CLOSED = 3;
    public static final int ERROR_CAPTURE_FAILED = 2;
    public static final int ERROR_FILE_IO = 1;
    public static final int ERROR_INVALID_CAMERA = 4;
    public static final int ERROR_UNKNOWN = 0;
    static final androidx.camera.core.internal.compat.workaround.ExifRotationAvailability EXIF_ROTATION_AVAILABILITY = null;
    public static final int FLASH_MODE_AUTO = 0;
    public static final int FLASH_MODE_OFF = 2;
    public static final int FLASH_MODE_ON = 1;
    private static final int FLASH_MODE_UNKNOWN = -1;

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static final int FLASH_TYPE_ONE_SHOT_FLASH = 0;

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static final int FLASH_TYPE_USE_TORCH_AS_FLASH = 1;
    private static final byte JPEG_QUALITY_MAXIMIZE_QUALITY_MODE = 100;
    private static final byte JPEG_QUALITY_MINIMIZE_LATENCY_MODE = 95;
    private static final int MAX_IMAGES = 2;
    private static final java.lang.String TAG = "ImageCapture";
    private final int mCaptureMode;
    private final androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener mClosingListener;
    private android.util.Rational mCropAspectRatio;

    @androidx.annotation.GuardedBy("mLockedFlashMode")
    private int mFlashMode;
    private final int mFlashType;
    private final androidx.camera.core.imagecapture.ImageCaptureControl mImageCaptureControl;

    @androidx.annotation.Nullable
    private androidx.camera.core.imagecapture.ImagePipeline mImagePipeline;

    @androidx.annotation.GuardedBy("mLockedFlashMode")
    private final java.util.concurrent.atomic.AtomicReference<java.lang.Integer> mLockedFlashMode;
    androidx.camera.core.impl.SessionConfig.Builder mSessionConfigBuilder;

    @androidx.annotation.Nullable
    private androidx.camera.core.imagecapture.TakePictureManager mTakePictureManager;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Builder implements androidx.camera.core.impl.UseCaseConfig.Builder<androidx.camera.core.ImageCapture, androidx.camera.core.impl.ImageCaptureConfig, androidx.camera.core.ImageCapture.Builder>, androidx.camera.core.impl.ImageOutputConfig.Builder<androidx.camera.core.ImageCapture.Builder>, androidx.camera.core.internal.IoConfig.Builder<androidx.camera.core.ImageCapture.Builder>, androidx.camera.core.impl.ImageInputConfig.Builder<androidx.camera.core.ImageCapture.Builder> {
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
                java.lang.Class<androidx.camera.core.ImageCapture> r0 = androidx.camera.core.ImageCapture.class
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
        public static androidx.camera.core.ImageCapture.Builder fromConfig(@androidx.annotation.NonNull androidx.camera.core.impl.Config r1) {
                androidx.camera.core.ImageCapture$Builder r0 = new androidx.camera.core.ImageCapture$Builder
                androidx.camera.core.impl.MutableOptionsBundle r1 = androidx.camera.core.impl.MutableOptionsBundle.from(r1)
                r0.<init>(r1)
                return r0
        }

        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        static androidx.camera.core.ImageCapture.Builder fromConfig(@androidx.annotation.NonNull androidx.camera.core.impl.ImageCaptureConfig r1) {
                androidx.camera.core.ImageCapture$Builder r0 = new androidx.camera.core.ImageCapture$Builder
                androidx.camera.core.impl.MutableOptionsBundle r1 = androidx.camera.core.impl.MutableOptionsBundle.from(r1)
                r0.<init>(r1)
                return r0
        }

        @Override // androidx.camera.core.ExtendableBuilder
        @androidx.annotation.NonNull
        public androidx.camera.core.ImageCapture build() {
                r4 = this;
                androidx.camera.core.impl.MutableConfig r0 = r4.getMutableConfig()
                androidx.camera.core.impl.Config$Option<java.lang.Integer> r1 = androidx.camera.core.impl.ImageCaptureConfig.OPTION_BUFFER_FORMAT
                r2 = 0
                java.lang.Object r0 = r0.retrieveOption(r1, r2)
                java.lang.Integer r0 = (java.lang.Integer) r0
                if (r0 == 0) goto L19
                androidx.camera.core.impl.MutableConfig r1 = r4.getMutableConfig()
                androidx.camera.core.impl.Config$Option<java.lang.Integer> r3 = androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_FORMAT
                r1.insertOption(r3, r0)
                goto L28
            L19:
                androidx.camera.core.impl.MutableConfig r0 = r4.getMutableConfig()
                androidx.camera.core.impl.Config$Option<java.lang.Integer> r1 = androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_FORMAT
                r3 = 256(0x100, float:3.59E-43)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r0.insertOption(r1, r3)
            L28:
                androidx.camera.core.impl.ImageCaptureConfig r0 = r4.getUseCaseConfig()
                androidx.camera.core.impl.z.s(r0)
                androidx.camera.core.ImageCapture r1 = new androidx.camera.core.ImageCapture
                r1.<init>(r0)
                androidx.camera.core.impl.MutableConfig r0 = r4.getMutableConfig()
                androidx.camera.core.impl.Config$Option<android.util.Size> r3 = androidx.camera.core.impl.ImageOutputConfig.OPTION_TARGET_RESOLUTION
                java.lang.Object r0 = r0.retrieveOption(r3, r2)
                android.util.Size r0 = (android.util.Size) r0
                if (r0 == 0) goto L52
                android.util.Rational r2 = new android.util.Rational
                int r3 = r0.getWidth()
                int r0 = r0.getHeight()
                r2.<init>(r3, r0)
                r1.setCropAspectRatio(r2)
            L52:
                androidx.camera.core.impl.MutableConfig r0 = r4.getMutableConfig()
                androidx.camera.core.impl.Config$Option<java.util.concurrent.Executor> r2 = androidx.camera.core.internal.IoConfig.OPTION_IO_EXECUTOR
                java.util.concurrent.Executor r3 = androidx.camera.core.impl.utils.executor.CameraXExecutors.ioExecutor()
                java.lang.Object r0 = r0.retrieveOption(r2, r3)
                java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
                java.lang.String r2 = "The IO executor can't be null"
                androidx.core.util.Preconditions.checkNotNull(r0, r2)
                androidx.camera.core.impl.MutableConfig r0 = r4.getMutableConfig()
                androidx.camera.core.impl.Config$Option<java.lang.Integer> r2 = androidx.camera.core.impl.ImageCaptureConfig.OPTION_FLASH_MODE
                boolean r0 = r0.containsOption(r2)
                if (r0 == 0) goto Lab
                androidx.camera.core.impl.MutableConfig r0 = r4.getMutableConfig()
                java.lang.Object r0 = r0.retrieveOption(r2)
                java.lang.Integer r0 = (java.lang.Integer) r0
                if (r0 == 0) goto L94
                int r2 = r0.intValue()
                if (r2 == 0) goto Lab
                int r2 = r0.intValue()
                r3 = 1
                if (r2 == r3) goto Lab
                int r2 = r0.intValue()
                r3 = 2
                if (r2 != r3) goto L94
                goto Lab
            L94:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "The flash mode is not allowed to set: "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.<init>(r0)
                throw r1
            Lab:
                return r1
        }

        @Override // androidx.camera.core.ExtendableBuilder
        @androidx.annotation.NonNull
        public /* bridge */ /* synthetic */ java.lang.Object build() {
                r1 = this;
                androidx.camera.core.ImageCapture r0 = r1.build()
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
        public androidx.camera.core.impl.ImageCaptureConfig getUseCaseConfig() {
                r2 = this;
                androidx.camera.core.impl.ImageCaptureConfig r0 = new androidx.camera.core.impl.ImageCaptureConfig
                androidx.camera.core.impl.MutableOptionsBundle r1 = r2.mMutableConfig
                androidx.camera.core.impl.OptionsBundle r1 = androidx.camera.core.impl.OptionsBundle.from(r1)
                r0.<init>(r1)
                return r0
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ androidx.camera.core.impl.ImageCaptureConfig getUseCaseConfig() {
                r1 = this;
                androidx.camera.core.impl.ImageCaptureConfig r0 = r1.getUseCaseConfig()
                return r0
        }

        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.ImageCapture.Builder setBufferFormat(int r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<java.lang.Integer> r1 = androidx.camera.core.impl.ImageCaptureConfig.OPTION_BUFFER_FORMAT
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r0.insertOption(r1, r3)
                return r2
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.ImageCapture.Builder setCameraSelector(@androidx.annotation.NonNull androidx.camera.core.CameraSelector r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<androidx.camera.core.CameraSelector> r1 = androidx.camera.core.impl.UseCaseConfig.OPTION_CAMERA_SELECTOR
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ androidx.camera.core.ImageCapture.Builder setCameraSelector(@androidx.annotation.NonNull androidx.camera.core.CameraSelector r1) {
                r0 = this;
                androidx.camera.core.ImageCapture$Builder r1 = r0.setCameraSelector(r1)
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.ImageCapture.Builder setCaptureMode(int r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<java.lang.Integer> r1 = androidx.camera.core.impl.ImageCaptureConfig.OPTION_IMAGE_CAPTURE_MODE
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r0.insertOption(r1, r3)
                return r2
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.ImageCapture.Builder setCaptureOptionUnpacker(@androidx.annotation.NonNull androidx.camera.core.impl.CaptureConfig.OptionUnpacker r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<androidx.camera.core.impl.CaptureConfig$OptionUnpacker> r1 = androidx.camera.core.impl.UseCaseConfig.OPTION_CAPTURE_CONFIG_UNPACKER
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ androidx.camera.core.ImageCapture.Builder setCaptureOptionUnpacker(@androidx.annotation.NonNull androidx.camera.core.impl.CaptureConfig.OptionUnpacker r1) {
                r0 = this;
                androidx.camera.core.ImageCapture$Builder r1 = r0.setCaptureOptionUnpacker(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.ImageCapture.Builder setCaptureType(@androidx.annotation.NonNull androidx.camera.core.impl.UseCaseConfigFactory.CaptureType r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<androidx.camera.core.impl.UseCaseConfigFactory$CaptureType> r1 = androidx.camera.core.impl.UseCaseConfig.OPTION_CAPTURE_TYPE
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ androidx.camera.core.ImageCapture.Builder setCaptureType(@androidx.annotation.NonNull androidx.camera.core.impl.UseCaseConfigFactory.CaptureType r1) {
                r0 = this;
                androidx.camera.core.ImageCapture$Builder r1 = r0.setCaptureType(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.ImageCapture.Builder setCustomOrderedResolutions(@androidx.annotation.NonNull java.util.List<android.util.Size> r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<java.util.List<android.util.Size>> r1 = androidx.camera.core.impl.ImageOutputConfig.OPTION_CUSTOM_ORDERED_RESOLUTIONS
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ androidx.camera.core.ImageCapture.Builder setCustomOrderedResolutions(@androidx.annotation.NonNull java.util.List r1) {
                r0 = this;
                androidx.camera.core.ImageCapture$Builder r1 = r0.setCustomOrderedResolutions(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.ImageCapture.Builder setDefaultCaptureConfig(@androidx.annotation.NonNull androidx.camera.core.impl.CaptureConfig r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<androidx.camera.core.impl.CaptureConfig> r1 = androidx.camera.core.impl.UseCaseConfig.OPTION_DEFAULT_CAPTURE_CONFIG
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ androidx.camera.core.ImageCapture.Builder setDefaultCaptureConfig(@androidx.annotation.NonNull androidx.camera.core.impl.CaptureConfig r1) {
                r0 = this;
                androidx.camera.core.ImageCapture$Builder r1 = r0.setDefaultCaptureConfig(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.ImageCapture.Builder setDefaultResolution(@androidx.annotation.NonNull android.util.Size r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<android.util.Size> r1 = androidx.camera.core.impl.ImageOutputConfig.OPTION_DEFAULT_RESOLUTION
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ androidx.camera.core.ImageCapture.Builder setDefaultResolution(@androidx.annotation.NonNull android.util.Size r1) {
                r0 = this;
                androidx.camera.core.ImageCapture$Builder r1 = r0.setDefaultResolution(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.ImageCapture.Builder setDefaultSessionConfig(@androidx.annotation.NonNull androidx.camera.core.impl.SessionConfig r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<androidx.camera.core.impl.SessionConfig> r1 = androidx.camera.core.impl.UseCaseConfig.OPTION_DEFAULT_SESSION_CONFIG
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ androidx.camera.core.ImageCapture.Builder setDefaultSessionConfig(@androidx.annotation.NonNull androidx.camera.core.impl.SessionConfig r1) {
                r0 = this;
                androidx.camera.core.ImageCapture$Builder r1 = r0.setDefaultSessionConfig(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageInputConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
        public androidx.camera.core.ImageCapture.Builder setDynamicRange(@androidx.annotation.NonNull androidx.camera.core.DynamicRange r3) {
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
                java.lang.String r0 = "ImageCapture currently only supports SDR"
                r3.<init>(r0)
                throw r3
        }

        @Override // androidx.camera.core.impl.ImageInputConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
        public /* bridge */ /* synthetic */ androidx.camera.core.ImageCapture.Builder setDynamicRange(@androidx.annotation.NonNull androidx.camera.core.DynamicRange r1) {
                r0 = this;
                androidx.camera.core.ImageCapture$Builder r1 = r0.setDynamicRange(r1)
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.ImageCapture.Builder setFlashMode(int r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<java.lang.Integer> r1 = androidx.camera.core.impl.ImageCaptureConfig.OPTION_FLASH_MODE
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r0.insertOption(r1, r3)
                return r2
        }

        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.ImageCapture.Builder setFlashType(int r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<java.lang.Integer> r1 = androidx.camera.core.impl.ImageCaptureConfig.OPTION_FLASH_TYPE
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r0.insertOption(r1, r3)
                return r2
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.ImageCapture.Builder setHighResolutionDisabled(boolean r3) {
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
        public /* bridge */ /* synthetic */ androidx.camera.core.ImageCapture.Builder setHighResolutionDisabled(boolean r1) {
                r0 = this;
                androidx.camera.core.ImageCapture$Builder r1 = r0.setHighResolutionDisabled(r1)
                return r1
        }

        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.ImageCapture.Builder setImageReaderProxyProvider(@androidx.annotation.NonNull androidx.camera.core.ImageReaderProxyProvider r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<androidx.camera.core.ImageReaderProxyProvider> r1 = androidx.camera.core.impl.ImageCaptureConfig.OPTION_IMAGE_READER_PROXY_PROVIDER
                r0.insertOption(r1, r3)
                return r2
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.internal.IoConfig.Builder
        @androidx.annotation.NonNull
        public androidx.camera.core.ImageCapture.Builder setIoExecutor(@androidx.annotation.NonNull java.util.concurrent.Executor r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<java.util.concurrent.Executor> r1 = androidx.camera.core.internal.IoConfig.OPTION_IO_EXECUTOR
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.internal.IoConfig.Builder
        @androidx.annotation.NonNull
        public /* bridge */ /* synthetic */ androidx.camera.core.ImageCapture.Builder setIoExecutor(@androidx.annotation.NonNull java.util.concurrent.Executor r1) {
                r0 = this;
                androidx.camera.core.ImageCapture$Builder r1 = r0.setIoExecutor(r1)
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.ImageCapture.Builder setJpegQuality(@androidx.annotation.IntRange(from = 1, to = 100) int r4) {
                r3 = this;
                r0 = 100
                java.lang.String r1 = "jpegQuality"
                r2 = 1
                androidx.core.util.Preconditions.checkArgumentInRange(r4, r2, r0, r1)
                androidx.camera.core.impl.MutableConfig r0 = r3.getMutableConfig()
                androidx.camera.core.impl.Config$Option<java.lang.Integer> r1 = androidx.camera.core.impl.ImageCaptureConfig.OPTION_JPEG_COMPRESSION_QUALITY
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r0.insertOption(r1, r4)
                return r3
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.ImageCapture.Builder setMaxResolution(@androidx.annotation.NonNull android.util.Size r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<android.util.Size> r1 = androidx.camera.core.impl.ImageOutputConfig.OPTION_MAX_RESOLUTION
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ androidx.camera.core.ImageCapture.Builder setMaxResolution(@androidx.annotation.NonNull android.util.Size r1) {
                r0 = this;
                androidx.camera.core.ImageCapture$Builder r1 = r0.setMaxResolution(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.ImageCapture.Builder setMirrorMode(int r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "setMirrorMode is not supported."
                r2.<init>(r0)
                throw r2
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ androidx.camera.core.ImageCapture.Builder setMirrorMode(int r1) {
                r0 = this;
                androidx.camera.core.ImageCapture$Builder r1 = r0.setMirrorMode(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        public androidx.camera.core.ImageCapture.Builder setResolutionSelector(@androidx.annotation.NonNull androidx.camera.core.resolutionselector.ResolutionSelector r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<androidx.camera.core.resolutionselector.ResolutionSelector> r1 = androidx.camera.core.impl.ImageOutputConfig.OPTION_RESOLUTION_SELECTOR
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        public /* bridge */ /* synthetic */ androidx.camera.core.ImageCapture.Builder setResolutionSelector(@androidx.annotation.NonNull androidx.camera.core.resolutionselector.ResolutionSelector r1) {
                r0 = this;
                androidx.camera.core.ImageCapture$Builder r1 = r0.setResolutionSelector(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.ImageCapture.Builder setSessionOptionUnpacker(@androidx.annotation.NonNull androidx.camera.core.impl.SessionConfig.OptionUnpacker r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<androidx.camera.core.impl.SessionConfig$OptionUnpacker> r1 = androidx.camera.core.impl.UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ androidx.camera.core.ImageCapture.Builder setSessionOptionUnpacker(@androidx.annotation.NonNull androidx.camera.core.impl.SessionConfig.OptionUnpacker r1) {
                r0 = this;
                androidx.camera.core.ImageCapture$Builder r1 = r0.setSessionOptionUnpacker(r1)
                return r1
        }

        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.ImageCapture.Builder setSoftwareJpegEncoderRequested(boolean r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<java.lang.Boolean> r1 = androidx.camera.core.impl.ImageCaptureConfig.OPTION_USE_SOFTWARE_JPEG_ENCODER
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                r0.insertOption(r1, r3)
                return r2
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.ImageCapture.Builder setSupportedResolutions(@androidx.annotation.NonNull java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>>> r1 = androidx.camera.core.impl.ImageOutputConfig.OPTION_SUPPORTED_RESOLUTIONS
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ androidx.camera.core.ImageCapture.Builder setSupportedResolutions(@androidx.annotation.NonNull java.util.List r1) {
                r0 = this;
                androidx.camera.core.ImageCapture$Builder r1 = r0.setSupportedResolutions(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.ImageCapture.Builder setSurfaceOccupancyPriority(int r3) {
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
        public /* bridge */ /* synthetic */ androidx.camera.core.ImageCapture.Builder setSurfaceOccupancyPriority(int r1) {
                r0 = this;
                androidx.camera.core.ImageCapture$Builder r1 = r0.setSurfaceOccupancyPriority(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        @java.lang.Deprecated
        public androidx.camera.core.ImageCapture.Builder setTargetAspectRatio(int r3) {
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
        public /* bridge */ /* synthetic */ androidx.camera.core.ImageCapture.Builder setTargetAspectRatio(int r1) {
                r0 = this;
                androidx.camera.core.ImageCapture$Builder r1 = r0.setTargetAspectRatio(r1)
                return r1
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.ImageCapture.Builder setTargetClass(@androidx.annotation.NonNull java.lang.Class<androidx.camera.core.ImageCapture> r4) {
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
                androidx.camera.core.ImageCapture$Builder r1 = r0.setTargetClass(r1)
                return r1
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        @androidx.annotation.NonNull
        public androidx.camera.core.ImageCapture.Builder setTargetName(@androidx.annotation.NonNull java.lang.String r3) {
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
                androidx.camera.core.ImageCapture$Builder r1 = r0.setTargetName(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        @java.lang.Deprecated
        public androidx.camera.core.ImageCapture.Builder setTargetResolution(@androidx.annotation.NonNull android.util.Size r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<android.util.Size> r1 = androidx.camera.core.impl.ImageOutputConfig.OPTION_TARGET_RESOLUTION
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        @java.lang.Deprecated
        public /* bridge */ /* synthetic */ androidx.camera.core.ImageCapture.Builder setTargetResolution(@androidx.annotation.NonNull android.util.Size r1) {
                r0 = this;
                androidx.camera.core.ImageCapture$Builder r1 = r0.setTargetResolution(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        public androidx.camera.core.ImageCapture.Builder setTargetRotation(int r3) {
                r2 = this;
                androidx.camera.core.impl.MutableConfig r0 = r2.getMutableConfig()
                androidx.camera.core.impl.Config$Option<java.lang.Integer> r1 = androidx.camera.core.impl.ImageOutputConfig.OPTION_TARGET_ROTATION
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r0.insertOption(r1, r3)
                return r2
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @androidx.annotation.NonNull
        public /* bridge */ /* synthetic */ androidx.camera.core.ImageCapture.Builder setTargetRotation(int r1) {
                r0 = this;
                androidx.camera.core.ImageCapture$Builder r1 = r0.setTargetRotation(r1)
                return r1
        }

        @Override // androidx.camera.core.internal.UseCaseEventConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.ImageCapture.Builder setUseCaseEventCallback(@androidx.annotation.NonNull androidx.camera.core.UseCase.EventCallback r3) {
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
                androidx.camera.core.ImageCapture$Builder r1 = r0.setUseCaseEventCallback(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.ImageCapture.Builder setZslDisabled(boolean r3) {
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
        public /* bridge */ /* synthetic */ androidx.camera.core.ImageCapture.Builder setZslDisabled(boolean r1) {
                r0 = this;
                androidx.camera.core.ImageCapture$Builder r1 = r0.setZslDisabled(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public @interface CaptureMode {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static final class Defaults implements androidx.camera.core.impl.ConfigProvider<androidx.camera.core.impl.ImageCaptureConfig> {
        private static final int DEFAULT_ASPECT_RATIO = 0;
        private static final androidx.camera.core.impl.ImageCaptureConfig DEFAULT_CONFIG = null;
        private static final androidx.camera.core.DynamicRange DEFAULT_DYNAMIC_RANGE = null;
        private static final androidx.camera.core.resolutionselector.ResolutionSelector DEFAULT_RESOLUTION_SELECTOR = null;
        private static final int DEFAULT_SURFACE_OCCUPANCY_PRIORITY = 4;

        static {
                androidx.camera.core.resolutionselector.ResolutionSelector$Builder r0 = new androidx.camera.core.resolutionselector.ResolutionSelector$Builder
                r0.<init>()
                androidx.camera.core.resolutionselector.AspectRatioStrategy r1 = androidx.camera.core.resolutionselector.AspectRatioStrategy.RATIO_4_3_FALLBACK_AUTO_STRATEGY
                androidx.camera.core.resolutionselector.ResolutionSelector$Builder r0 = r0.setAspectRatioStrategy(r1)
                androidx.camera.core.resolutionselector.ResolutionStrategy r1 = androidx.camera.core.resolutionselector.ResolutionStrategy.HIGHEST_AVAILABLE_STRATEGY
                androidx.camera.core.resolutionselector.ResolutionSelector$Builder r0 = r0.setResolutionStrategy(r1)
                androidx.camera.core.resolutionselector.ResolutionSelector r0 = r0.build()
                androidx.camera.core.ImageCapture.Defaults.DEFAULT_RESOLUTION_SELECTOR = r0
                androidx.camera.core.DynamicRange r1 = androidx.camera.core.DynamicRange.SDR
                androidx.camera.core.ImageCapture.Defaults.DEFAULT_DYNAMIC_RANGE = r1
                androidx.camera.core.ImageCapture$Builder r2 = new androidx.camera.core.ImageCapture$Builder
                r2.<init>()
                r3 = 4
                androidx.camera.core.ImageCapture$Builder r2 = r2.setSurfaceOccupancyPriority(r3)
                r3 = 0
                androidx.camera.core.ImageCapture$Builder r2 = r2.setTargetAspectRatio(r3)
                androidx.camera.core.ImageCapture$Builder r0 = r2.setResolutionSelector(r0)
                androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r2 = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE
                androidx.camera.core.ImageCapture$Builder r0 = r0.setCaptureType(r2)
                androidx.camera.core.ImageCapture$Builder r0 = r0.setDynamicRange(r1)
                androidx.camera.core.impl.ImageCaptureConfig r0 = r0.getUseCaseConfig()
                androidx.camera.core.ImageCapture.Defaults.DEFAULT_CONFIG = r0
                return
        }

        public Defaults() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.camera.core.impl.ConfigProvider
        @androidx.annotation.NonNull
        public /* bridge */ /* synthetic */ androidx.camera.core.impl.ImageCaptureConfig getConfig() {
                r1 = this;
                androidx.camera.core.impl.ImageCaptureConfig r0 = r1.getConfig2()
                return r0
        }

        @Override // androidx.camera.core.impl.ConfigProvider
        @androidx.annotation.NonNull
        /* renamed from: getConfig, reason: avoid collision after fix types in other method */
        public androidx.camera.core.impl.ImageCaptureConfig getConfig2() {
                r1 = this;
                androidx.camera.core.impl.ImageCaptureConfig r0 = androidx.camera.core.ImageCapture.Defaults.DEFAULT_CONFIG
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public @interface FlashMode {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public @interface FlashType {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public @interface ImageCaptureError {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.VisibleForTesting
    static class ImageCaptureRequest {

        @androidx.annotation.NonNull
        private final androidx.camera.core.ImageCapture.OnImageCapturedCallback mCallback;
        java.util.concurrent.atomic.AtomicBoolean mDispatched;

        @androidx.annotation.IntRange(from = 1, to = 100)
        final int mJpegQuality;

        @androidx.annotation.NonNull
        private final java.util.concurrent.Executor mListenerExecutor;
        final int mRotationDegrees;

        @androidx.annotation.NonNull
        private final android.graphics.Matrix mSensorToBufferTransformMatrix;
        private final android.util.Rational mTargetRatio;
        private final android.graphics.Rect mViewPortCropRect;

        ImageCaptureRequest(int r3, @androidx.annotation.IntRange(from = 1, to = 100) int r4, android.util.Rational r5, @androidx.annotation.Nullable android.graphics.Rect r6, @androidx.annotation.NonNull android.graphics.Matrix r7, @androidx.annotation.NonNull java.util.concurrent.Executor r8, @androidx.annotation.NonNull androidx.camera.core.ImageCapture.OnImageCapturedCallback r9) {
                r2 = this;
                r2.<init>()
                java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
                r1 = 0
                r0.<init>(r1)
                r2.mDispatched = r0
                r2.mRotationDegrees = r3
                r2.mJpegQuality = r4
                if (r5 == 0) goto L2b
                boolean r3 = r5.isZero()
                r4 = 1
                r3 = r3 ^ r4
                java.lang.String r0 = "Target ratio cannot be zero"
                androidx.core.util.Preconditions.checkArgument(r3, r0)
                float r3 = r5.floatValue()
                r0 = 0
                int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r3 <= 0) goto L26
                r1 = 1
            L26:
                java.lang.String r3 = "Target ratio must be positive"
                androidx.core.util.Preconditions.checkArgument(r1, r3)
            L2b:
                r2.mTargetRatio = r5
                r2.mViewPortCropRect = r6
                r2.mSensorToBufferTransformMatrix = r7
                r2.mListenerExecutor = r8
                r2.mCallback = r9
                return
        }

        public static /* synthetic */ void a(androidx.camera.core.ImageCapture.ImageCaptureRequest r0, androidx.camera.core.ImageProxy r1) {
                androidx.camera.core.ImageCapture$OnImageCapturedCallback r0 = r0.mCallback
                r0.onCaptureSuccess(r1)
                return
        }

        public static /* synthetic */ void b(androidx.camera.core.ImageCapture.ImageCaptureRequest r1, int r2, java.lang.String r3, java.lang.Throwable r4) {
                androidx.camera.core.ImageCapture$OnImageCapturedCallback r1 = r1.mCallback
                androidx.camera.core.ImageCaptureException r0 = new androidx.camera.core.ImageCaptureException
                r0.<init>(r2, r3, r4)
                r1.onError(r0)
                return
        }

        void dispatchImage(androidx.camera.core.ImageProxy r7) {
                r6 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r6.mDispatched
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 != 0) goto Le
                r7.close()
                return
            Le:
                androidx.camera.core.internal.compat.workaround.ExifRotationAvailability r0 = androidx.camera.core.ImageCapture.EXIF_ROTATION_AVAILABILITY
                boolean r0 = r0.shouldUseExifOrientation(r7)
                if (r0 == 0) goto L54
                androidx.camera.core.ImageProxy$PlaneProxy[] r0 = r7.getPlanes()     // Catch: java.io.IOException -> L4a
                r0 = r0[r1]     // Catch: java.io.IOException -> L4a
                java.nio.ByteBuffer r0 = r0.getBuffer()     // Catch: java.io.IOException -> L4a
                r0.rewind()     // Catch: java.io.IOException -> L4a
                int r1 = r0.capacity()     // Catch: java.io.IOException -> L4a
                byte[] r1 = new byte[r1]     // Catch: java.io.IOException -> L4a
                r0.get(r1)     // Catch: java.io.IOException -> L4a
                java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch: java.io.IOException -> L4a
                r3.<init>(r1)     // Catch: java.io.IOException -> L4a
                androidx.camera.core.impl.utils.Exif r1 = androidx.camera.core.impl.utils.Exif.createFromInputStream(r3)     // Catch: java.io.IOException -> L4a
                r0.rewind()     // Catch: java.io.IOException -> L4a
                android.util.Size r0 = new android.util.Size     // Catch: java.io.IOException -> L4a
                int r3 = r1.getWidth()     // Catch: java.io.IOException -> L4a
                int r4 = r1.getHeight()     // Catch: java.io.IOException -> L4a
                r0.<init>(r3, r4)     // Catch: java.io.IOException -> L4a
                int r1 = r1.getRotation()     // Catch: java.io.IOException -> L4a
                goto L63
            L4a:
                r0 = move-exception
                java.lang.String r1 = "Unable to parse JPEG exif"
                r6.notifyCallbackError(r2, r1, r0)
                r7.close()
                return
            L54:
                android.util.Size r0 = new android.util.Size
                int r1 = r7.getWidth()
                int r2 = r7.getHeight()
                r0.<init>(r1, r2)
                int r1 = r6.mRotationDegrees
            L63:
                androidx.camera.core.ImageInfo r2 = r7.getImageInfo()
                androidx.camera.core.impl.TagBundle r2 = r2.getTagBundle()
                androidx.camera.core.ImageInfo r3 = r7.getImageInfo()
                long r3 = r3.getTimestamp()
                android.graphics.Matrix r5 = r6.mSensorToBufferTransformMatrix
                androidx.camera.core.ImageInfo r2 = androidx.camera.core.ImmutableImageInfo.create(r2, r3, r1, r5)
                androidx.camera.core.SettableImageProxy r3 = new androidx.camera.core.SettableImageProxy
                r3.<init>(r7, r0, r2)
                android.graphics.Rect r2 = r6.mViewPortCropRect
                android.util.Rational r4 = r6.mTargetRatio
                int r5 = r6.mRotationDegrees
                android.graphics.Rect r0 = androidx.camera.core.ImageCapture.computeDispatchCropRect(r2, r4, r5, r0, r1)
                r3.setCropRect(r0)
                java.util.concurrent.Executor r0 = r6.mListenerExecutor     // Catch: java.util.concurrent.RejectedExecutionException -> L96
                androidx.camera.core.b0 r1 = new androidx.camera.core.b0     // Catch: java.util.concurrent.RejectedExecutionException -> L96
                r1.<init>(r6, r3)     // Catch: java.util.concurrent.RejectedExecutionException -> L96
                r0.execute(r1)     // Catch: java.util.concurrent.RejectedExecutionException -> L96
                return
            L96:
                java.lang.String r0 = "ImageCapture"
                java.lang.String r1 = "Unable to post to the supplied executor."
                androidx.camera.core.Logger.e(r0, r1)
                r7.close()
                return
        }

        void notifyCallbackError(int r4, java.lang.String r5, java.lang.Throwable r6) {
                r3 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r3.mDispatched
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 != 0) goto Lb
                return
            Lb:
                java.util.concurrent.Executor r0 = r3.mListenerExecutor     // Catch: java.util.concurrent.RejectedExecutionException -> L16
                androidx.camera.core.a0 r1 = new androidx.camera.core.a0     // Catch: java.util.concurrent.RejectedExecutionException -> L16
                r1.<init>(r3, r4, r5, r6)     // Catch: java.util.concurrent.RejectedExecutionException -> L16
                r0.execute(r1)     // Catch: java.util.concurrent.RejectedExecutionException -> L16
                return
            L16:
                java.lang.String r4 = "ImageCapture"
                java.lang.String r5 = "Unable to post to the supplied executor."
                androidx.camera.core.Logger.e(r4, r5)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Metadata {
        private boolean mIsReversedHorizontal;
        private boolean mIsReversedHorizontalSet;
        private boolean mIsReversedVertical;

        @androidx.annotation.Nullable
        private android.location.Location mLocation;

        public Metadata() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mIsReversedHorizontalSet = r0
                return
        }

        @androidx.annotation.Nullable
        public android.location.Location getLocation() {
                r1 = this;
                android.location.Location r0 = r1.mLocation
                return r0
        }

        public boolean isReversedHorizontal() {
                r1 = this;
                boolean r0 = r1.mIsReversedHorizontal
                return r0
        }

        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public boolean isReversedHorizontalSet() {
                r1 = this;
                boolean r0 = r1.mIsReversedHorizontalSet
                return r0
        }

        public boolean isReversedVertical() {
                r1 = this;
                boolean r0 = r1.mIsReversedVertical
                return r0
        }

        public void setLocation(@androidx.annotation.Nullable android.location.Location r1) {
                r0 = this;
                r0.mLocation = r1
                return
        }

        public void setReversedHorizontal(boolean r1) {
                r0 = this;
                r0.mIsReversedHorizontal = r1
                r1 = 1
                r0.mIsReversedHorizontalSet = r1
                return
        }

        public void setReversedVertical(boolean r1) {
                r0 = this;
                r0.mIsReversedVertical = r1
                return
        }

        @androidx.annotation.NonNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Metadata{mIsReversedHorizontal="
                r0.append(r1)
                boolean r1 = r2.mIsReversedHorizontal
                r0.append(r1)
                java.lang.String r1 = ", mIsReversedVertical="
                r0.append(r1)
                boolean r1 = r2.mIsReversedVertical
                r0.append(r1)
                java.lang.String r1 = ", mLocation="
                r0.append(r1)
                android.location.Location r1 = r2.mLocation
                r0.append(r1)
                java.lang.String r1 = "}"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class OnImageCapturedCallback {
        public OnImageCapturedCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onCaptureSuccess(@androidx.annotation.NonNull androidx.camera.core.ImageProxy r1) {
                r0 = this;
                return
        }

        public void onError(@androidx.annotation.NonNull androidx.camera.core.ImageCaptureException r1) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnImageSavedCallback {
        void onError(@androidx.annotation.NonNull androidx.camera.core.ImageCaptureException r1);

        void onImageSaved(@androidx.annotation.NonNull androidx.camera.core.ImageCapture.OutputFileResults r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class OutputFileOptions {

        @androidx.annotation.Nullable
        private final android.content.ContentResolver mContentResolver;

        @androidx.annotation.Nullable
        private final android.content.ContentValues mContentValues;

        @androidx.annotation.Nullable
        private final java.io.File mFile;

        @androidx.annotation.NonNull
        private final androidx.camera.core.ImageCapture.Metadata mMetadata;

        @androidx.annotation.Nullable
        private final java.io.OutputStream mOutputStream;

        @androidx.annotation.Nullable
        private final android.net.Uri mSaveCollection;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static final class Builder {

            @androidx.annotation.Nullable
            private android.content.ContentResolver mContentResolver;

            @androidx.annotation.Nullable
            private android.content.ContentValues mContentValues;

            @androidx.annotation.Nullable
            private java.io.File mFile;

            @androidx.annotation.Nullable
            private androidx.camera.core.ImageCapture.Metadata mMetadata;

            @androidx.annotation.Nullable
            private java.io.OutputStream mOutputStream;

            @androidx.annotation.Nullable
            private android.net.Uri mSaveCollection;

            public Builder(@androidx.annotation.NonNull android.content.ContentResolver r1, @androidx.annotation.NonNull android.net.Uri r2, @androidx.annotation.NonNull android.content.ContentValues r3) {
                    r0 = this;
                    r0.<init>()
                    r0.mContentResolver = r1
                    r0.mSaveCollection = r2
                    r0.mContentValues = r3
                    return
            }

            public Builder(@androidx.annotation.NonNull java.io.File r1) {
                    r0 = this;
                    r0.<init>()
                    r0.mFile = r1
                    return
            }

            public Builder(@androidx.annotation.NonNull java.io.OutputStream r1) {
                    r0 = this;
                    r0.<init>()
                    r0.mOutputStream = r1
                    return
            }

            @androidx.annotation.NonNull
            public androidx.camera.core.ImageCapture.OutputFileOptions build() {
                    r7 = this;
                    androidx.camera.core.ImageCapture$OutputFileOptions r0 = new androidx.camera.core.ImageCapture$OutputFileOptions
                    java.io.File r1 = r7.mFile
                    android.content.ContentResolver r2 = r7.mContentResolver
                    android.net.Uri r3 = r7.mSaveCollection
                    android.content.ContentValues r4 = r7.mContentValues
                    java.io.OutputStream r5 = r7.mOutputStream
                    androidx.camera.core.ImageCapture$Metadata r6 = r7.mMetadata
                    r0.<init>(r1, r2, r3, r4, r5, r6)
                    return r0
            }

            @androidx.annotation.NonNull
            public androidx.camera.core.ImageCapture.OutputFileOptions.Builder setMetadata(@androidx.annotation.NonNull androidx.camera.core.ImageCapture.Metadata r1) {
                    r0 = this;
                    r0.mMetadata = r1
                    return r0
            }
        }

        OutputFileOptions(@androidx.annotation.Nullable java.io.File r1, @androidx.annotation.Nullable android.content.ContentResolver r2, @androidx.annotation.Nullable android.net.Uri r3, @androidx.annotation.Nullable android.content.ContentValues r4, @androidx.annotation.Nullable java.io.OutputStream r5, @androidx.annotation.Nullable androidx.camera.core.ImageCapture.Metadata r6) {
                r0 = this;
                r0.<init>()
                r0.mFile = r1
                r0.mContentResolver = r2
                r0.mSaveCollection = r3
                r0.mContentValues = r4
                r0.mOutputStream = r5
                if (r6 != 0) goto L14
                androidx.camera.core.ImageCapture$Metadata r6 = new androidx.camera.core.ImageCapture$Metadata
                r6.<init>()
            L14:
                r0.mMetadata = r6
                return
        }

        @androidx.annotation.Nullable
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public android.content.ContentResolver getContentResolver() {
                r1 = this;
                android.content.ContentResolver r0 = r1.mContentResolver
                return r0
        }

        @androidx.annotation.Nullable
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public android.content.ContentValues getContentValues() {
                r1 = this;
                android.content.ContentValues r0 = r1.mContentValues
                return r0
        }

        @androidx.annotation.Nullable
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public java.io.File getFile() {
                r1 = this;
                java.io.File r0 = r1.mFile
                return r0
        }

        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.ImageCapture.Metadata getMetadata() {
                r1 = this;
                androidx.camera.core.ImageCapture$Metadata r0 = r1.mMetadata
                return r0
        }

        @androidx.annotation.Nullable
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public java.io.OutputStream getOutputStream() {
                r1 = this;
                java.io.OutputStream r0 = r1.mOutputStream
                return r0
        }

        @androidx.annotation.Nullable
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public android.net.Uri getSaveCollection() {
                r1 = this;
                android.net.Uri r0 = r1.mSaveCollection
                return r0
        }

        @androidx.annotation.NonNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "OutputFileOptions{mFile="
                r0.append(r1)
                java.io.File r1 = r2.mFile
                r0.append(r1)
                java.lang.String r1 = ", mContentResolver="
                r0.append(r1)
                android.content.ContentResolver r1 = r2.mContentResolver
                r0.append(r1)
                java.lang.String r1 = ", mSaveCollection="
                r0.append(r1)
                android.net.Uri r1 = r2.mSaveCollection
                r0.append(r1)
                java.lang.String r1 = ", mContentValues="
                r0.append(r1)
                android.content.ContentValues r1 = r2.mContentValues
                r0.append(r1)
                java.lang.String r1 = ", mOutputStream="
                r0.append(r1)
                java.io.OutputStream r1 = r2.mOutputStream
                r0.append(r1)
                java.lang.String r1 = ", mMetadata="
                r0.append(r1)
                androidx.camera.core.ImageCapture$Metadata r1 = r2.mMetadata
                r0.append(r1)
                java.lang.String r1 = "}"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class OutputFileResults {

        @androidx.annotation.Nullable
        private final android.net.Uri mSavedUri;

        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public OutputFileResults(@androidx.annotation.Nullable android.net.Uri r1) {
                r0 = this;
                r0.<init>()
                r0.mSavedUri = r1
                return
        }

        @androidx.annotation.Nullable
        public android.net.Uri getSavedUri() {
                r1 = this;
                android.net.Uri r0 = r1.mSavedUri
                return r0
        }
    }

    static {
            androidx.camera.core.ImageCapture$Defaults r0 = new androidx.camera.core.ImageCapture$Defaults
            r0.<init>()
            androidx.camera.core.ImageCapture.DEFAULT_CONFIG = r0
            androidx.camera.core.internal.compat.workaround.ExifRotationAvailability r0 = new androidx.camera.core.internal.compat.workaround.ExifRotationAvailability
            r0.<init>()
            androidx.camera.core.ImageCapture.EXIF_ROTATION_AVAILABILITY = r0
            return
    }

    ImageCapture(@androidx.annotation.NonNull androidx.camera.core.impl.ImageCaptureConfig r2) {
            r1 = this;
            r1.<init>(r2)
            androidx.camera.core.y r2 = new androidx.camera.core.y
            r2.<init>()
            r1.mClosingListener = r2
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            r0 = 0
            r2.<init>(r0)
            r1.mLockedFlashMode = r2
            r2 = -1
            r1.mFlashMode = r2
            r1.mCropAspectRatio = r0
            androidx.camera.core.ImageCapture$1 r2 = new androidx.camera.core.ImageCapture$1
            r2.<init>(r1)
            r1.mImageCaptureControl = r2
            androidx.camera.core.impl.UseCaseConfig r2 = r1.getCurrentConfig()
            androidx.camera.core.impl.ImageCaptureConfig r2 = (androidx.camera.core.impl.ImageCaptureConfig) r2
            androidx.camera.core.impl.Config$Option<java.lang.Integer> r0 = androidx.camera.core.impl.ImageCaptureConfig.OPTION_IMAGE_CAPTURE_MODE
            boolean r0 = r2.containsOption(r0)
            if (r0 == 0) goto L33
            int r0 = r2.getCaptureMode()
            r1.mCaptureMode = r0
            goto L36
        L33:
            r0 = 1
            r1.mCaptureMode = r0
        L36:
            r0 = 0
            int r2 = r2.getFlashType(r0)
            r1.mFlashType = r2
            return
    }

    public static /* synthetic */ java.lang.Void a(java.util.List r0) {
            r0 = 0
            return r0
    }

    @androidx.annotation.UiThread
    private void abortImageCaptureRequests() {
            r1 = this;
            androidx.camera.core.imagecapture.TakePictureManager r0 = r1.mTakePictureManager
            if (r0 == 0) goto L7
            r0.abortRequests()
        L7:
            return
    }

    public static /* synthetic */ void b(androidx.camera.core.impl.ImageReaderProxy r1) {
            androidx.camera.core.ImageProxy r1 = r1.acquireLatestImage()     // Catch: java.lang.IllegalStateException -> L19
            java.util.Objects.toString(r1)     // Catch: java.lang.Throwable -> Ld
            if (r1 == 0) goto L19
            r1.close()     // Catch: java.lang.IllegalStateException -> L19
            return
        Ld:
            r0 = move-exception
            if (r1 == 0) goto L18
            r1.close()     // Catch: java.lang.Throwable -> L14
            goto L18
        L14:
            r1 = move-exception
            r0.addSuppressed(r1)     // Catch: java.lang.IllegalStateException -> L19
        L18:
            throw r0     // Catch: java.lang.IllegalStateException -> L19
        L19:
            return
    }

    public static /* synthetic */ void c(androidx.camera.core.ImageCapture r0, java.util.concurrent.Executor r1, androidx.camera.core.ImageCapture.OnImageCapturedCallback r2) {
            r0.takePicture(r1, r2)
            return
    }

    @androidx.annotation.MainThread
    private void clearPipeline() {
            r1 = this;
            r0 = 0
            r1.clearPipeline(r0)
            return
    }

    @androidx.annotation.MainThread
    private void clearPipeline(boolean r3) {
            r2 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.core.imagecapture.ImagePipeline r0 = r2.mImagePipeline
            r1 = 0
            if (r0 == 0) goto Ld
            r0.close()
            r2.mImagePipeline = r1
        Ld:
            if (r3 != 0) goto L18
            androidx.camera.core.imagecapture.TakePictureManager r3 = r2.mTakePictureManager
            if (r3 == 0) goto L18
            r3.abortRequests()
            r2.mTakePictureManager = r1
        L18:
            return
    }

    @androidx.annotation.NonNull
    static android.graphics.Rect computeDispatchCropRect(@androidx.annotation.Nullable android.graphics.Rect r0, @androidx.annotation.Nullable android.util.Rational r1, int r2, @androidx.annotation.NonNull android.util.Size r3, int r4) {
            if (r0 == 0) goto L7
            android.graphics.Rect r0 = androidx.camera.core.internal.utils.ImageUtil.computeCropRectFromDispatchInfo(r0, r2, r3, r4)
            return r0
        L7:
            if (r1 == 0) goto L29
            int r4 = r4 % 180
            if (r4 == 0) goto L1b
            android.util.Rational r0 = new android.util.Rational
            int r2 = r1.getDenominator()
            int r1 = r1.getNumerator()
            r0.<init>(r2, r1)
            r1 = r0
        L1b:
            boolean r0 = androidx.camera.core.internal.utils.ImageUtil.isAspectRatioValid(r3, r1)
            if (r0 == 0) goto L29
            android.graphics.Rect r0 = androidx.camera.core.internal.utils.ImageUtil.computeCropRectFromAspectRatio(r3, r1)
            java.util.Objects.requireNonNull(r0)
            return r0
        L29:
            android.graphics.Rect r0 = new android.graphics.Rect
            int r1 = r3.getWidth()
            int r2 = r3.getHeight()
            r3 = 0
            r0.<init>(r3, r3, r1, r2)
            return r0
    }

    @androidx.annotation.OptIn(markerClass = {androidx.camera.core.ExperimentalZeroShutterLag.class})
    @androidx.annotation.MainThread
    private androidx.camera.core.impl.SessionConfig.Builder createPipeline(@androidx.annotation.NonNull java.lang.String r6, @androidx.annotation.NonNull androidx.camera.core.impl.ImageCaptureConfig r7, @androidx.annotation.NonNull androidx.camera.core.impl.StreamSpec r8) {
            r5 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r6
            r3 = 1
            r1[r3] = r8
            java.lang.String r4 = "createPipeline(cameraId: %s, streamSpec: %s)"
            java.lang.String.format(r4, r1)
            android.util.Size r1 = r8.getResolution()
            androidx.camera.core.impl.CameraInternal r4 = r5.getCamera()
            java.util.Objects.requireNonNull(r4)
            androidx.camera.core.impl.CameraInternal r4 = (androidx.camera.core.impl.CameraInternal) r4
            boolean r4 = r4.getHasTransform()
            if (r4 == 0) goto L2a
            boolean r4 = r5.isSessionProcessorEnabledInCurrentCamera()
            if (r4 == 0) goto L2b
        L2a:
            r2 = 1
        L2b:
            androidx.camera.core.imagecapture.ImagePipeline r3 = r5.mImagePipeline
            if (r3 == 0) goto L37
            androidx.core.util.Preconditions.checkState(r2)
            androidx.camera.core.imagecapture.ImagePipeline r3 = r5.mImagePipeline
            r3.close()
        L37:
            androidx.camera.core.imagecapture.ImagePipeline r3 = new androidx.camera.core.imagecapture.ImagePipeline
            androidx.camera.core.CameraEffect r4 = r5.getEffect()
            r3.<init>(r7, r1, r4, r2)
            r5.mImagePipeline = r3
            androidx.camera.core.imagecapture.TakePictureManager r1 = r5.mTakePictureManager
            if (r1 != 0) goto L4f
            androidx.camera.core.imagecapture.TakePictureManager r1 = new androidx.camera.core.imagecapture.TakePictureManager
            androidx.camera.core.imagecapture.ImageCaptureControl r2 = r5.mImageCaptureControl
            r1.<init>(r2)
            r5.mTakePictureManager = r1
        L4f:
            androidx.camera.core.imagecapture.TakePictureManager r1 = r5.mTakePictureManager
            androidx.camera.core.imagecapture.ImagePipeline r2 = r5.mImagePipeline
            r1.setImagePipeline(r2)
            androidx.camera.core.imagecapture.ImagePipeline r1 = r5.mImagePipeline
            android.util.Size r2 = r8.getResolution()
            androidx.camera.core.impl.SessionConfig$Builder r1 = r1.createSessionConfigBuilder(r2)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r2 < r3) goto L73
            int r2 = r5.getCaptureMode()
            if (r2 != r0) goto L73
            androidx.camera.core.impl.CameraControlInternal r0 = r5.getCameraControl()
            r0.addZslConfig(r1)
        L73:
            androidx.camera.core.impl.Config r0 = r8.getImplementationOptions()
            if (r0 == 0) goto L80
            androidx.camera.core.impl.Config r0 = r8.getImplementationOptions()
            r1.addImplementationOptions(r0)
        L80:
            androidx.camera.core.v r0 = new androidx.camera.core.v
            r0.<init>(r5, r6, r7, r8)
            r1.addErrorListener(r0)
            return r1
    }

    public static /* synthetic */ void d(androidx.camera.core.ImageCapture r0, java.lang.String r1, androidx.camera.core.impl.ImageCaptureConfig r2, androidx.camera.core.impl.StreamSpec r3, androidx.camera.core.impl.SessionConfig r4, androidx.camera.core.impl.SessionConfig.SessionError r5) {
            boolean r4 = r0.isCurrentCamera(r1)
            if (r4 == 0) goto L25
            androidx.camera.core.imagecapture.TakePictureManager r4 = r0.mTakePictureManager
            r4.pause()
            r4 = 1
            r0.clearPipeline(r4)
            androidx.camera.core.impl.SessionConfig$Builder r1 = r0.createPipeline(r1, r2, r3)
            r0.mSessionConfigBuilder = r1
            androidx.camera.core.impl.SessionConfig r1 = r1.build()
            r0.updateSessionConfig(r1)
            r0.notifyReset()
            androidx.camera.core.imagecapture.TakePictureManager r0 = r0.mTakePictureManager
            r0.resume()
            return
        L25:
            r0.clearPipeline()
            return
    }

    public static /* synthetic */ void e(androidx.camera.core.ImageCapture r0, androidx.camera.core.ImageCapture.OutputFileOptions r1, java.util.concurrent.Executor r2, androidx.camera.core.ImageCapture.OnImageSavedCallback r3) {
            r0.takePicture(r1, r2, r3)
            return
    }

    static int getError(java.lang.Throwable r1) {
            boolean r0 = r1 instanceof androidx.camera.core.CameraClosedException
            if (r0 == 0) goto L6
            r1 = 3
            return r1
        L6:
            boolean r0 = r1 instanceof androidx.camera.core.ImageCaptureException
            if (r0 == 0) goto L11
            androidx.camera.core.ImageCaptureException r1 = (androidx.camera.core.ImageCaptureException) r1
            int r1 = r1.getImageCaptureError()
            return r1
        L11:
            r1 = 0
            return r1
    }

    @androidx.annotation.IntRange(from = 1, to = 100)
    private int getJpegQualityInternal() {
            r3 = this;
            androidx.camera.core.impl.UseCaseConfig r0 = r3.getCurrentConfig()
            androidx.camera.core.impl.ImageCaptureConfig r0 = (androidx.camera.core.impl.ImageCaptureConfig) r0
            androidx.camera.core.impl.Config$Option<java.lang.Integer> r1 = androidx.camera.core.impl.ImageCaptureConfig.OPTION_JPEG_COMPRESSION_QUALITY
            boolean r1 = r0.containsOption(r1)
            if (r1 == 0) goto L13
            int r0 = r0.getJpegQuality()
            return r0
        L13:
            int r0 = r3.mCaptureMode
            if (r0 == 0) goto L3f
            r1 = 1
            if (r0 == r1) goto L3c
            r1 = 2
            if (r0 != r1) goto L1e
            goto L3c
        L1e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "CaptureMode "
            r1.append(r2)
            int r2 = r3.mCaptureMode
            r1.append(r2)
            java.lang.String r2 = " is invalid"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L3c:
            r0 = 95
            return r0
        L3f:
            r0 = 100
            return r0
    }

    @androidx.annotation.NonNull
    private android.graphics.Rect getTakePictureCropRect() {
            r5 = this;
            android.graphics.Rect r0 = r5.getViewPortCropRect()
            android.util.Size r1 = r5.getAttachedSurfaceResolution()
            java.util.Objects.requireNonNull(r1)
            if (r0 == 0) goto Le
            return r0
        Le:
            android.util.Rational r0 = r5.mCropAspectRatio
            boolean r0 = androidx.camera.core.internal.utils.ImageUtil.isAspectRatioValid(r0)
            if (r0 == 0) goto L45
            androidx.camera.core.impl.CameraInternal r0 = r5.getCamera()
            java.util.Objects.requireNonNull(r0)
            androidx.camera.core.impl.CameraInternal r0 = (androidx.camera.core.impl.CameraInternal) r0
            int r0 = r5.getRelativeRotation(r0)
            android.util.Rational r2 = new android.util.Rational
            android.util.Rational r3 = r5.mCropAspectRatio
            int r3 = r3.getDenominator()
            android.util.Rational r4 = r5.mCropAspectRatio
            int r4 = r4.getNumerator()
            r2.<init>(r3, r4)
            boolean r0 = androidx.camera.core.impl.utils.TransformUtils.is90or270(r0)
            if (r0 == 0) goto L3b
            goto L3d
        L3b:
            android.util.Rational r2 = r5.mCropAspectRatio
        L3d:
            android.graphics.Rect r0 = androidx.camera.core.internal.utils.ImageUtil.computeCropRectFromAspectRatio(r1, r2)
            java.util.Objects.requireNonNull(r0)
            return r0
        L45:
            android.graphics.Rect r0 = new android.graphics.Rect
            int r2 = r1.getWidth()
            int r1 = r1.getHeight()
            r3 = 0
            r0.<init>(r3, r3, r2, r1)
            return r0
    }

    private static boolean isImageFormatSupported(java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> r3, int r4) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.util.Iterator r3 = r3.iterator()
        L8:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r3.next()
            android.util.Pair r1 = (android.util.Pair) r1
            java.lang.Object r1 = r1.first
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L8
            r3 = 1
            return r3
        L24:
            return r0
    }

    private boolean isSessionProcessorEnabledInCurrentCamera() {
            r3 = this;
            androidx.camera.core.impl.CameraInternal r0 = r3.getCamera()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            androidx.camera.core.impl.CameraInternal r0 = r3.getCamera()
            androidx.camera.core.impl.CameraConfig r0 = r0.getExtendedConfig()
            r2 = 0
            androidx.camera.core.impl.SessionProcessor r0 = r0.getSessionProcessor(r2)
            if (r0 == 0) goto L19
            r0 = 1
            return r0
        L19:
            return r1
    }

    private void sendInvalidCameraError(@androidx.annotation.NonNull java.util.concurrent.Executor r4, @androidx.annotation.Nullable androidx.camera.core.ImageCapture.OnImageCapturedCallback r5, @androidx.annotation.Nullable androidx.camera.core.ImageCapture.OnImageSavedCallback r6) {
            r3 = this;
            androidx.camera.core.ImageCaptureException r4 = new androidx.camera.core.ImageCaptureException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Not bound to a valid Camera ["
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            r2 = 4
            r4.<init>(r2, r0, r1)
            if (r5 == 0) goto L23
            r5.onError(r4)
            return
        L23:
            if (r6 == 0) goto L29
            r6.onError(r4)
            return
        L29:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Must have either in-memory or on-disk callback."
            r4.<init>(r5)
            throw r4
    }

    @androidx.annotation.MainThread
    private void takePictureInternal(@androidx.annotation.NonNull java.util.concurrent.Executor r13, @androidx.annotation.Nullable androidx.camera.core.ImageCapture.OnImageCapturedCallback r14, @androidx.annotation.Nullable androidx.camera.core.ImageCapture.OnImageSavedCallback r15, @androidx.annotation.Nullable androidx.camera.core.ImageCapture.OutputFileOptions r16) {
            r12 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.core.impl.CameraInternal r0 = r12.getCamera()
            if (r0 != 0) goto Ld
            r12.sendInvalidCameraError(r13, r14, r15)
            return
        Ld:
            androidx.camera.core.imagecapture.TakePictureManager r1 = r12.mTakePictureManager
            java.util.Objects.requireNonNull(r1)
            android.graphics.Rect r6 = r12.getTakePictureCropRect()
            android.graphics.Matrix r7 = r12.getSensorToBufferTransformMatrix()
            int r8 = r12.getRelativeRotation(r0)
            int r9 = r12.getJpegQualityInternal()
            int r10 = r12.getCaptureMode()
            androidx.camera.core.impl.SessionConfig$Builder r0 = r12.mSessionConfigBuilder
            java.util.List r11 = r0.getSingleCameraCaptureCallbacks()
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            androidx.camera.core.imagecapture.TakePictureRequest r13 = androidx.camera.core.imagecapture.TakePictureRequest.of(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r1.offerRequest(r13)
            return
    }

    private void trySetFlashModeToCameraControl() {
            r3 = this;
            java.util.concurrent.atomic.AtomicReference<java.lang.Integer> r0 = r3.mLockedFlashMode
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicReference<java.lang.Integer> r1 = r3.mLockedFlashMode     // Catch: java.lang.Throwable -> Ld
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> Ld
            if (r1 == 0) goto Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r1 = move-exception
            goto L1c
        Lf:
            androidx.camera.core.impl.CameraControlInternal r1 = r3.getCameraControl()     // Catch: java.lang.Throwable -> Ld
            int r2 = r3.getFlashMode()     // Catch: java.lang.Throwable -> Ld
            r1.setFlashMode(r2)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }

    boolean enforceSoftwareJpegConstraints(@androidx.annotation.NonNull androidx.camera.core.impl.MutableConfig r8) {
            r7 = this;
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            androidx.camera.core.impl.Config$Option<java.lang.Boolean> r1 = androidx.camera.core.impl.ImageCaptureConfig.OPTION_USE_SOFTWARE_JPEG_ENCODER
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            java.lang.Object r3 = r8.retrieveOption(r1, r2)
            boolean r0 = r0.equals(r3)
            r3 = 0
            if (r0 == 0) goto L45
            boolean r0 = r7.isSessionProcessorEnabledInCurrentCamera()
            java.lang.String r4 = "ImageCapture"
            if (r0 == 0) goto L20
            java.lang.String r0 = "Software JPEG cannot be used with Extensions."
            androidx.camera.core.Logger.w(r4, r0)
            r0 = 0
            goto L21
        L20:
            r0 = 1
        L21:
            androidx.camera.core.impl.Config$Option<java.lang.Integer> r5 = androidx.camera.core.impl.ImageCaptureConfig.OPTION_BUFFER_FORMAT
            r6 = 0
            java.lang.Object r5 = r8.retrieveOption(r5, r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L3a
            int r5 = r5.intValue()
            r6 = 256(0x100, float:3.59E-43)
            if (r5 == r6) goto L3a
            java.lang.String r0 = "Software JPEG cannot be used with non-JPEG output buffer format."
            androidx.camera.core.Logger.w(r4, r0)
            goto L3b
        L3a:
            r3 = r0
        L3b:
            if (r3 != 0) goto L45
            java.lang.String r0 = "Unable to support software JPEG. Disabling."
            androidx.camera.core.Logger.w(r4, r0)
            r8.insertOption(r1, r2)
        L45:
            return r3
    }

    public int getCaptureMode() {
            r1 = this;
            int r0 = r1.mCaptureMode
            return r0
    }

    @Override // androidx.camera.core.UseCase
    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.camera.core.impl.UseCaseConfig<?> getDefaultConfig(boolean r4, @androidx.annotation.NonNull androidx.camera.core.impl.UseCaseConfigFactory r5) {
            r3 = this;
            androidx.camera.core.ImageCapture$Defaults r0 = androidx.camera.core.ImageCapture.DEFAULT_CONFIG
            androidx.camera.core.impl.ImageCaptureConfig r1 = r0.getConfig2()
            androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r1 = r1.getCaptureType()
            int r2 = r3.getCaptureMode()
            androidx.camera.core.impl.Config r5 = r5.getConfig(r1, r2)
            if (r4 == 0) goto L1c
            androidx.camera.core.impl.ImageCaptureConfig r4 = r0.getConfig2()
            androidx.camera.core.impl.Config r5 = androidx.camera.core.impl.o.b(r5, r4)
        L1c:
            if (r5 != 0) goto L20
            r4 = 0
            return r4
        L20:
            androidx.camera.core.impl.UseCaseConfig$Builder r4 = r3.getUseCaseConfigBuilder(r5)
            androidx.camera.core.impl.UseCaseConfig r4 = r4.getUseCaseConfig()
            return r4
    }

    public int getFlashMode() {
            r3 = this;
            java.util.concurrent.atomic.AtomicReference<java.lang.Integer> r0 = r3.mLockedFlashMode
            monitor-enter(r0)
            int r1 = r3.mFlashMode     // Catch: java.lang.Throwable -> L16
            r2 = -1
            if (r1 == r2) goto L9
            goto L14
        L9:
            androidx.camera.core.impl.UseCaseConfig r1 = r3.getCurrentConfig()     // Catch: java.lang.Throwable -> L16
            androidx.camera.core.impl.ImageCaptureConfig r1 = (androidx.camera.core.impl.ImageCaptureConfig) r1     // Catch: java.lang.Throwable -> L16
            r2 = 2
            int r1 = r1.getFlashMode(r2)     // Catch: java.lang.Throwable -> L16
        L14:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            return r1
        L16:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r1
    }

    @androidx.annotation.Nullable
    @androidx.annotation.VisibleForTesting
    androidx.camera.core.imagecapture.ImagePipeline getImagePipeline() {
            r1 = this;
            androidx.camera.core.imagecapture.ImagePipeline r0 = r1.mImagePipeline
            return r0
    }

    @androidx.annotation.IntRange(from = 1, to = 100)
    public int getJpegQuality() {
            r1 = this;
            int r0 = r1.getJpegQualityInternal()
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.camera.core.ImageCaptureLatencyEstimate getRealtimeCaptureLatencyEstimate() {
            r6 = this;
            androidx.camera.core.impl.CameraInternal r0 = r6.getCamera()
            if (r0 != 0) goto L9
            androidx.camera.core.ImageCaptureLatencyEstimate r0 = androidx.camera.core.ImageCaptureLatencyEstimate.UNDEFINED_IMAGE_CAPTURE_LATENCY
            return r0
        L9:
            androidx.camera.core.impl.CameraConfig r0 = r0.getExtendedConfig()
            androidx.camera.core.impl.SessionProcessor r0 = r0.getSessionProcessor()
            android.util.Pair r0 = r0.getRealtimeCaptureLatency()
            if (r0 != 0) goto L1a
            androidx.camera.core.ImageCaptureLatencyEstimate r0 = androidx.camera.core.ImageCaptureLatencyEstimate.UNDEFINED_IMAGE_CAPTURE_LATENCY
            return r0
        L1a:
            androidx.camera.core.ImageCaptureLatencyEstimate r1 = new androidx.camera.core.ImageCaptureLatencyEstimate
            java.lang.Object r2 = r0.first
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r4 = r0.longValue()
            r1.<init>(r2, r4)
            return r1
    }

    @androidx.annotation.Nullable
    public androidx.camera.core.ResolutionInfo getResolutionInfo() {
            r1 = this;
            androidx.camera.core.ResolutionInfo r0 = r1.getResolutionInfoInternal()
            return r0
    }

    @Override // androidx.camera.core.UseCase
    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    protected androidx.camera.core.ResolutionInfo getResolutionInfoInternal() {
            r6 = this;
            androidx.camera.core.impl.CameraInternal r0 = r6.getCamera()
            android.util.Size r1 = r6.getAttachedSurfaceResolution()
            if (r0 == 0) goto L37
            if (r1 != 0) goto Ld
            goto L37
        Ld:
            android.graphics.Rect r2 = r6.getViewPortCropRect()
            android.util.Rational r3 = r6.mCropAspectRatio
            if (r2 != 0) goto L2a
            if (r3 == 0) goto L1c
            android.graphics.Rect r2 = androidx.camera.core.internal.utils.ImageUtil.computeCropRectFromAspectRatio(r1, r3)
            goto L2a
        L1c:
            android.graphics.Rect r2 = new android.graphics.Rect
            int r3 = r1.getWidth()
            int r4 = r1.getHeight()
            r5 = 0
            r2.<init>(r5, r5, r3, r4)
        L2a:
            int r0 = r6.getRelativeRotation(r0)
            androidx.camera.core.ResolutionInfo r3 = new androidx.camera.core.ResolutionInfo
            java.util.Objects.requireNonNull(r2)
            r3.<init>(r1, r2, r0)
            return r3
        L37:
            r0 = 0
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
            r1 = 4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.VisibleForTesting
    androidx.camera.core.imagecapture.TakePictureManager getTakePictureManager() {
            r1 = this;
            androidx.camera.core.imagecapture.TakePictureManager r0 = r1.mTakePictureManager
            java.util.Objects.requireNonNull(r0)
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
            androidx.camera.core.ImageCapture$Builder r1 = androidx.camera.core.ImageCapture.Builder.fromConfig(r1)
            return r1
    }

    @androidx.annotation.VisibleForTesting
    boolean isProcessingPipelineEnabled() {
            r1 = this;
            androidx.camera.core.imagecapture.ImagePipeline r0 = r1.mImagePipeline
            if (r0 == 0) goto La
            androidx.camera.core.imagecapture.TakePictureManager r0 = r1.mTakePictureManager
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    void lockFlashMode() {
            r3 = this;
            java.util.concurrent.atomic.AtomicReference<java.lang.Integer> r0 = r3.mLockedFlashMode
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicReference<java.lang.Integer> r1 = r3.mLockedFlashMode     // Catch: java.lang.Throwable -> Ld
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> Ld
            if (r1 == 0) goto Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r1 = move-exception
            goto L1e
        Lf:
            java.util.concurrent.atomic.AtomicReference<java.lang.Integer> r1 = r3.mLockedFlashMode     // Catch: java.lang.Throwable -> Ld
            int r2 = r3.getFlashMode()     // Catch: java.lang.Throwable -> Ld
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> Ld
            r1.set(r2)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return
        L1e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }

    @Override // androidx.camera.core.UseCase
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void onBind() {
            r2 = this;
            androidx.camera.core.impl.CameraInternal r0 = r2.getCamera()
            java.lang.String r1 = "Attached camera cannot be null"
            androidx.core.util.Preconditions.checkNotNull(r0, r1)
            return
    }

    @Override // androidx.camera.core.UseCase
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void onCameraControlReady() {
            r0 = this;
            r0.trySetFlashModeToCameraControl()
            return
    }

    @Override // androidx.camera.core.UseCase
    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    protected androidx.camera.core.impl.UseCaseConfig<?> onMergeConfig(@androidx.annotation.NonNull androidx.camera.core.impl.CameraInfoInternal r8, @androidx.annotation.NonNull androidx.camera.core.impl.UseCaseConfig.Builder<?, ?, ?> r9) {
            r7 = this;
            r0 = 35
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r2 = 256(0x100, float:3.59E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            androidx.camera.core.impl.Quirks r8 = r8.getCameraQuirks()
            java.lang.Class<androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk> r4 = androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk.class
            boolean r8 = r8.contains(r4)
            if (r8 == 0) goto L40
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            androidx.camera.core.impl.MutableConfig r4 = r9.getMutableConfig()
            androidx.camera.core.impl.Config$Option<java.lang.Boolean> r5 = androidx.camera.core.impl.ImageCaptureConfig.OPTION_USE_SOFTWARE_JPEG_ENCODER
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            java.lang.Object r4 = r4.retrieveOption(r5, r6)
            boolean r8 = r8.equals(r4)
            java.lang.String r4 = "ImageCapture"
            if (r8 == 0) goto L34
            java.lang.String r8 = "Device quirk suggests software JPEG encoder, but it has been explicitly disabled."
            androidx.camera.core.Logger.w(r4, r8)
            goto L40
        L34:
            java.lang.String r8 = "Requesting software JPEG due to device quirk."
            androidx.camera.core.Logger.i(r4, r8)
            androidx.camera.core.impl.MutableConfig r8 = r9.getMutableConfig()
            r8.insertOption(r5, r6)
        L40:
            androidx.camera.core.impl.MutableConfig r8 = r9.getMutableConfig()
            boolean r8 = r7.enforceSoftwareJpegConstraints(r8)
            androidx.camera.core.impl.MutableConfig r4 = r9.getMutableConfig()
            androidx.camera.core.impl.Config$Option<java.lang.Integer> r5 = androidx.camera.core.impl.ImageCaptureConfig.OPTION_BUFFER_FORMAT
            r6 = 0
            java.lang.Object r4 = r4.retrieveOption(r5, r6)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto L81
            boolean r1 = r7.isSessionProcessorEnabledInCurrentCamera()
            if (r1 == 0) goto L66
            int r1 = r4.intValue()
            if (r1 != r2) goto L64
            goto L66
        L64:
            r1 = 0
            goto L67
        L66:
            r1 = 1
        L67:
            java.lang.String r2 = "Cannot set non-JPEG buffer format with Extensions enabled."
            androidx.core.util.Preconditions.checkArgument(r1, r2)
            androidx.camera.core.impl.MutableConfig r1 = r9.getMutableConfig()
            androidx.camera.core.impl.Config$Option<java.lang.Integer> r2 = androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_FORMAT
            if (r8 == 0) goto L75
            goto L79
        L75:
            int r0 = r4.intValue()
        L79:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r1.insertOption(r2, r8)
            goto Lc4
        L81:
            if (r8 == 0) goto L8d
            androidx.camera.core.impl.MutableConfig r8 = r9.getMutableConfig()
            androidx.camera.core.impl.Config$Option<java.lang.Integer> r0 = androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_FORMAT
            r8.insertOption(r0, r1)
            goto Lc4
        L8d:
            androidx.camera.core.impl.MutableConfig r8 = r9.getMutableConfig()
            androidx.camera.core.impl.Config$Option<java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>>> r4 = androidx.camera.core.impl.ImageOutputConfig.OPTION_SUPPORTED_RESOLUTIONS
            java.lang.Object r8 = r8.retrieveOption(r4, r6)
            java.util.List r8 = (java.util.List) r8
            if (r8 != 0) goto La5
            androidx.camera.core.impl.MutableConfig r8 = r9.getMutableConfig()
            androidx.camera.core.impl.Config$Option<java.lang.Integer> r0 = androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_FORMAT
            r8.insertOption(r0, r3)
            goto Lc4
        La5:
            boolean r2 = isImageFormatSupported(r8, r2)
            if (r2 == 0) goto Lb5
            androidx.camera.core.impl.MutableConfig r8 = r9.getMutableConfig()
            androidx.camera.core.impl.Config$Option<java.lang.Integer> r0 = androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_FORMAT
            r8.insertOption(r0, r3)
            goto Lc4
        Lb5:
            boolean r8 = isImageFormatSupported(r8, r0)
            if (r8 == 0) goto Lc4
            androidx.camera.core.impl.MutableConfig r8 = r9.getMutableConfig()
            androidx.camera.core.impl.Config$Option<java.lang.Integer> r0 = androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_FORMAT
            r8.insertOption(r0, r1)
        Lc4:
            androidx.camera.core.impl.UseCaseConfig r8 = r9.getUseCaseConfig()
            return r8
    }

    @Override // androidx.camera.core.UseCase
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    @androidx.annotation.UiThread
    public void onStateDetached() {
            r0 = this;
            r0.abortImageCaptureRequests()
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
    protected androidx.camera.core.impl.StreamSpec onSuggestedStreamSpecUpdated(@androidx.annotation.NonNull androidx.camera.core.impl.StreamSpec r3) {
            r2 = this;
            java.lang.String r0 = r2.getCameraId()
            androidx.camera.core.impl.UseCaseConfig r1 = r2.getCurrentConfig()
            androidx.camera.core.impl.ImageCaptureConfig r1 = (androidx.camera.core.impl.ImageCaptureConfig) r1
            androidx.camera.core.impl.SessionConfig$Builder r0 = r2.createPipeline(r0, r1, r3)
            r2.mSessionConfigBuilder = r0
            androidx.camera.core.impl.SessionConfig r0 = r0.build()
            r2.updateSessionConfig(r0)
            r2.notifyActive()
            return r3
    }

    @Override // androidx.camera.core.UseCase
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void onUnbind() {
            r0 = this;
            r0.abortImageCaptureRequests()
            r0.clearPipeline()
            return
    }

    public void setCropAspectRatio(@androidx.annotation.NonNull android.util.Rational r1) {
            r0 = this;
            r0.mCropAspectRatio = r1
            return
    }

    public void setFlashMode(int r4) {
            r3 = this;
            if (r4 == 0) goto L20
            r0 = 1
            if (r4 == r0) goto L20
            r0 = 2
            if (r4 != r0) goto L9
            goto L20
        L9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid flash mode: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L20:
            java.util.concurrent.atomic.AtomicReference<java.lang.Integer> r0 = r3.mLockedFlashMode
            monitor-enter(r0)
            r3.mFlashMode = r4     // Catch: java.lang.Throwable -> L2a
            r3.trySetFlashModeToCameraControl()     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            return
        L2a:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            throw r4
    }

    public void setTargetRotation(int r3) {
            r2 = this;
            int r0 = r2.getTargetRotation()
            boolean r1 = r2.setTargetRotationInternal(r3)
            if (r1 == 0) goto L23
            android.util.Rational r1 = r2.mCropAspectRatio
            if (r1 == 0) goto L23
            int r0 = androidx.camera.core.impl.utils.CameraOrientationUtil.surfaceRotationToDegrees(r0)
            int r3 = androidx.camera.core.impl.utils.CameraOrientationUtil.surfaceRotationToDegrees(r3)
            int r3 = r3 - r0
            int r3 = java.lang.Math.abs(r3)
            android.util.Rational r0 = r2.mCropAspectRatio
            android.util.Rational r3 = androidx.camera.core.internal.utils.ImageUtil.getRotatedAspectRatio(r3, r0)
            r2.mCropAspectRatio = r3
        L23:
            return
    }

    @androidx.annotation.MainThread
    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> submitStillCaptureRequest(@androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.CaptureConfig> r4) {
            r3 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.core.impl.CameraControlInternal r0 = r3.getCameraControl()
            int r1 = r3.mCaptureMode
            int r2 = r3.mFlashType
            com.google.common.util.concurrent.ListenableFuture r4 = r0.submitStillCaptureRequests(r4, r1, r2)
            androidx.camera.core.z r0 = new androidx.camera.core.z
            r0.<init>()
            java.util.concurrent.Executor r1 = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()
            com.google.common.util.concurrent.ListenableFuture r4 = androidx.camera.core.impl.utils.futures.Futures.transform(r4, r0, r1)
            return r4
    }

    public void takePicture(@androidx.annotation.NonNull androidx.camera.core.ImageCapture.OutputFileOptions r3, @androidx.annotation.NonNull java.util.concurrent.Executor r4, @androidx.annotation.NonNull androidx.camera.core.ImageCapture.OnImageSavedCallback r5) {
            r2 = this;
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r0 == r1) goto L17
            java.util.concurrent.ScheduledExecutorService r0 = androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor()
            androidx.camera.core.x r1 = new androidx.camera.core.x
            r1.<init>(r2, r3, r4, r5)
            r0.execute(r1)
            return
        L17:
            r0 = 0
            r2.takePictureInternal(r4, r0, r5, r3)
            return
    }

    public void takePicture(@androidx.annotation.NonNull java.util.concurrent.Executor r3, @androidx.annotation.NonNull androidx.camera.core.ImageCapture.OnImageCapturedCallback r4) {
            r2 = this;
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r0 == r1) goto L17
            java.util.concurrent.ScheduledExecutorService r0 = androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor()
            androidx.camera.core.w r1 = new androidx.camera.core.w
            r1.<init>(r2, r3, r4)
            r0.execute(r1)
            return
        L17:
            r0 = 0
            r2.takePictureInternal(r3, r4, r0, r0)
            return
    }

    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ImageCapture:"
            r0.append(r1)
            java.lang.String r1 = r2.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    void unlockFlashMode() {
            r3 = this;
            java.util.concurrent.atomic.AtomicReference<java.lang.Integer> r0 = r3.mLockedFlashMode
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicReference<java.lang.Integer> r1 = r3.mLockedFlashMode     // Catch: java.lang.Throwable -> L10
            r2 = 0
            java.lang.Object r1 = r1.getAndSet(r2)     // Catch: java.lang.Throwable -> L10
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L10
            if (r1 != 0) goto L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r1 = move-exception
            goto L21
        L12:
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L10
            int r2 = r3.getFlashMode()     // Catch: java.lang.Throwable -> L10
            if (r1 == r2) goto L1f
            r3.trySetFlashModeToCameraControl()     // Catch: java.lang.Throwable -> L10
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r1
    }
}
