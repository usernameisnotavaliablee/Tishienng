package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.OptIn(markerClass = {androidx.camera.camera2.interop.ExperimentalCamera2Interop.class})
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class Camera2CameraInfoImpl implements androidx.camera.core.impl.CameraInfoInternal {
    private static final java.lang.String TAG = "Camera2CameraInfo";

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("mLock")
    private androidx.camera.camera2.internal.Camera2CameraControlImpl mCamera2CameraControlImpl;
    private final androidx.camera.camera2.interop.Camera2CameraInfo mCamera2CameraInfo;

    @androidx.annotation.NonNull
    private final androidx.camera.core.impl.EncoderProfilesProvider mCamera2EncoderProfilesProvider;

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("mLock")
    private java.util.List<android.util.Pair<androidx.camera.core.impl.CameraCaptureCallback, java.util.concurrent.Executor>> mCameraCaptureCallbacks;
    private final androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat mCameraCharacteristicsCompat;
    private final java.lang.String mCameraId;

    @androidx.annotation.NonNull
    private final androidx.camera.camera2.internal.compat.CameraManagerCompat mCameraManager;

    @androidx.annotation.NonNull
    private final androidx.camera.core.impl.Quirks mCameraQuirks;

    @androidx.annotation.NonNull
    private final androidx.camera.camera2.internal.Camera2CameraInfoImpl.RedirectableLiveData<androidx.camera.core.CameraState> mCameraStateLiveData;
    private final java.lang.Object mLock;

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("mLock")
    private androidx.camera.camera2.internal.Camera2CameraInfoImpl.RedirectableLiveData<java.lang.Integer> mRedirectTorchStateLiveData;

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("mLock")
    private androidx.camera.camera2.internal.Camera2CameraInfoImpl.RedirectableLiveData<androidx.camera.core.ZoomState> mRedirectZoomStateLiveData;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class RedirectableLiveData<T> extends androidx.lifecycle.MediatorLiveData<T> {
        private final T mInitialValue;
        private androidx.lifecycle.LiveData<T> mLiveDataSource;

        RedirectableLiveData(T r1) {
                r0 = this;
                r0.<init>()
                r0.mInitialValue = r1
                return
        }

        @Override // androidx.lifecycle.MediatorLiveData
        public <S> void addSource(@androidx.annotation.NonNull androidx.lifecycle.LiveData<S> r1, @androidx.annotation.NonNull androidx.lifecycle.Observer<? super S> r2) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // androidx.lifecycle.LiveData
        public T getValue() {
                r1 = this;
                androidx.lifecycle.LiveData<T> r0 = r1.mLiveDataSource
                if (r0 != 0) goto L7
                T r0 = r1.mInitialValue
                return r0
            L7:
                java.lang.Object r0 = r0.getValue()
                return r0
        }

        void redirectTo(@androidx.annotation.NonNull androidx.lifecycle.LiveData<T> r2) {
                r1 = this;
                androidx.lifecycle.LiveData<T> r0 = r1.mLiveDataSource
                if (r0 == 0) goto L7
                super.removeSource(r0)
            L7:
                r1.mLiveDataSource = r2
                androidx.camera.camera2.internal.o0 r0 = new androidx.camera.camera2.internal.o0
                r0.<init>(r1)
                super.addSource(r2, r0)
                return
        }
    }

    public Camera2CameraInfoImpl(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull androidx.camera.camera2.internal.compat.CameraManagerCompat r3) throws androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.mLock = r0
            r0 = 0
            r1.mRedirectTorchStateLiveData = r0
            r1.mRedirectZoomStateLiveData = r0
            r1.mCameraCaptureCallbacks = r0
            java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r2)
            java.lang.String r0 = (java.lang.String) r0
            r1.mCameraId = r0
            r1.mCameraManager = r3
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r3 = r3.getCameraCharacteristicsCompat(r0)
            r1.mCameraCharacteristicsCompat = r3
            androidx.camera.camera2.interop.Camera2CameraInfo r0 = new androidx.camera.camera2.interop.Camera2CameraInfo
            r0.<init>(r1)
            r1.mCamera2CameraInfo = r0
            androidx.camera.core.impl.Quirks r3 = androidx.camera.camera2.internal.compat.quirk.CameraQuirks.get(r2, r3)
            r1.mCameraQuirks = r3
            androidx.camera.camera2.internal.Camera2EncoderProfilesProvider r3 = new androidx.camera.camera2.internal.Camera2EncoderProfilesProvider
            r3.<init>(r2)
            r1.mCamera2EncoderProfilesProvider = r3
            androidx.camera.camera2.internal.Camera2CameraInfoImpl$RedirectableLiveData r2 = new androidx.camera.camera2.internal.Camera2CameraInfoImpl$RedirectableLiveData
            androidx.camera.core.CameraState$Type r3 = androidx.camera.core.CameraState.Type.CLOSED
            androidx.camera.core.CameraState r3 = androidx.camera.core.CameraState.create(r3)
            r2.<init>(r3)
            r1.mCameraStateLiveData = r2
            return
    }

    private void logDeviceInfo() {
            r0 = this;
            r0.logDeviceLevel()
            return
    }

    private void logDeviceLevel() {
            r3 = this;
            int r0 = r3.getSupportedHardwareLevel()
            if (r0 == 0) goto L30
            r1 = 1
            if (r0 == r1) goto L2d
            r1 = 2
            if (r0 == r1) goto L2a
            r1 = 3
            if (r0 == r1) goto L27
            r1 = 4
            if (r0 == r1) goto L24
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown value: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L32
        L24:
            java.lang.String r0 = "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL"
            goto L32
        L27:
            java.lang.String r0 = "INFO_SUPPORTED_HARDWARE_LEVEL_3"
            goto L32
        L2a:
            java.lang.String r0 = "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY"
            goto L32
        L2d:
            java.lang.String r0 = "INFO_SUPPORTED_HARDWARE_LEVEL_FULL"
            goto L32
        L30:
            java.lang.String r0 = "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED"
        L32:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Device Level: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "Camera2CameraInfo"
            androidx.camera.core.Logger.i(r1, r0)
            return
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public void addSessionCaptureCallback(@androidx.annotation.NonNull java.util.concurrent.Executor r4, @androidx.annotation.NonNull androidx.camera.core.impl.CameraCaptureCallback r5) {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            androidx.camera.camera2.internal.Camera2CameraControlImpl r1 = r3.mCamera2CameraControlImpl     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L21
            java.util.List<android.util.Pair<androidx.camera.core.impl.CameraCaptureCallback, java.util.concurrent.Executor>> r1 = r3.mCameraCaptureCallbacks     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            r3.mCameraCaptureCallbacks = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r4 = move-exception
            goto L26
        L15:
            java.util.List<android.util.Pair<androidx.camera.core.impl.CameraCaptureCallback, java.util.concurrent.Executor>> r1 = r3.mCameraCaptureCallbacks     // Catch: java.lang.Throwable -> L13
            android.util.Pair r2 = new android.util.Pair     // Catch: java.lang.Throwable -> L13
            r2.<init>(r5, r4)     // Catch: java.lang.Throwable -> L13
            r1.add(r2)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return
        L21:
            r1.addSessionCameraCaptureCallback(r4, r5)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return
        L26:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r4
    }

    @androidx.annotation.NonNull
    public androidx.camera.camera2.interop.Camera2CameraInfo getCamera2CameraInfo() {
            r1 = this;
            androidx.camera.camera2.interop.Camera2CameraInfo r0 = r1.mCamera2CameraInfo
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat getCameraCharacteristicsCompat() {
            r1 = this;
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r0 = r1.mCameraCharacteristicsCompat
            return r0
    }

    @androidx.annotation.NonNull
    public java.util.Map<java.lang.String, android.hardware.camera2.CameraCharacteristics> getCameraCharacteristicsMap() {
            r6 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.lang.String r1 = r6.mCameraId
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r2 = r6.mCameraCharacteristicsCompat
            android.hardware.camera2.CameraCharacteristics r2 = r2.toCameraCharacteristics()
            r0.put(r1, r2)
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r1 = r6.mCameraCharacteristicsCompat
            java.util.Set r1 = r1.getPhysicalCameraIds()
            java.util.Iterator r1 = r1.iterator()
        L1a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L55
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = r6.mCameraId
            boolean r3 = java.util.Objects.equals(r2, r3)
            if (r3 == 0) goto L2f
            goto L1a
        L2f:
            androidx.camera.camera2.internal.compat.CameraManagerCompat r3 = r6.mCameraManager     // Catch: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L3d
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r3 = r3.getCameraCharacteristicsCompat(r2)     // Catch: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L3d
            android.hardware.camera2.CameraCharacteristics r3 = r3.toCameraCharacteristics()     // Catch: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L3d
            r0.put(r2, r3)     // Catch: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L3d
            goto L1a
        L3d:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Failed to get CameraCharacteristics for cameraId "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.String r4 = "Camera2CameraInfo"
            androidx.camera.core.Logger.e(r4, r2, r3)
            goto L1a
        L55:
            return r0
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    @androidx.annotation.NonNull
    public java.lang.String getCameraId() {
            r1 = this;
            java.lang.String r0 = r1.mCameraId
            return r0
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    @androidx.annotation.NonNull
    public androidx.camera.core.impl.Quirks getCameraQuirks() {
            r1 = this;
            androidx.camera.core.impl.Quirks r0 = r1.mCameraQuirks
            return r0
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal, androidx.camera.core.CameraInfo
    public /* synthetic */ androidx.camera.core.CameraSelector getCameraSelector() {
            r1 = this;
            androidx.camera.core.CameraSelector r0 = androidx.camera.core.impl.i.a(r1)
            return r0
    }

    @Override // androidx.camera.core.CameraInfo
    @androidx.annotation.NonNull
    public androidx.lifecycle.LiveData<androidx.camera.core.CameraState> getCameraState() {
            r1 = this;
            androidx.camera.camera2.internal.Camera2CameraInfoImpl$RedirectableLiveData<androidx.camera.core.CameraState> r0 = r1.mCameraStateLiveData
            return r0
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    @androidx.annotation.NonNull
    public androidx.camera.core.impl.EncoderProfilesProvider getEncoderProfilesProvider() {
            r1 = this;
            androidx.camera.core.impl.EncoderProfilesProvider r0 = r1.mCamera2EncoderProfilesProvider
            return r0
    }

    @Override // androidx.camera.core.CameraInfo
    @androidx.annotation.NonNull
    public androidx.camera.core.ExposureState getExposureState() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            androidx.camera.camera2.internal.Camera2CameraControlImpl r1 = r2.mCamera2CameraControlImpl     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r1 = r2.mCameraCharacteristicsCompat     // Catch: java.lang.Throwable -> Lf
            androidx.camera.core.ExposureState r1 = androidx.camera.camera2.internal.ExposureControl.getDefaultExposureState(r1)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r1
        Lf:
            r1 = move-exception
            goto L1b
        L11:
            androidx.camera.camera2.internal.ExposureControl r1 = r1.getExposureControl()     // Catch: java.lang.Throwable -> Lf
            androidx.camera.core.ExposureState r1 = r1.getExposureState()     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r1
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public /* synthetic */ androidx.camera.core.impl.CameraInfoInternal getImplementation() {
            r1 = this;
            androidx.camera.core.impl.CameraInfoInternal r0 = androidx.camera.core.impl.i.b(r1)
            return r0
    }

    @Override // androidx.camera.core.CameraInfo
    @androidx.annotation.NonNull
    public java.lang.String getImplementationType() {
            r2 = this;
            int r0 = r2.getSupportedHardwareLevel()
            r1 = 2
            if (r0 != r1) goto La
            java.lang.String r0 = "androidx.camera.camera2.legacy"
            return r0
        La:
            java.lang.String r0 = "androidx.camera.camera2"
            return r0
    }

    @Override // androidx.camera.core.CameraInfo
    @androidx.annotation.FloatRange(from = 0.0d, fromInclusive = false)
    public float getIntrinsicZoomRatio() {
            r4 = this;
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r0 = r4.mCameraCharacteristicsCompat
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto Lf
            return r1
        Lf:
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r2 = r4.mCameraCharacteristicsCompat     // Catch: java.lang.Exception -> L2d
            float r2 = androidx.camera.camera2.internal.FovUtil.getDefaultFocalLength(r2)     // Catch: java.lang.Exception -> L2d
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r3 = r4.mCameraCharacteristicsCompat     // Catch: java.lang.Exception -> L2d
            float r3 = androidx.camera.camera2.internal.FovUtil.getSensorHorizontalLength(r3)     // Catch: java.lang.Exception -> L2d
            int r2 = androidx.camera.camera2.internal.FovUtil.focalLengthToViewAngleDegrees(r2, r3)     // Catch: java.lang.Exception -> L2d
            androidx.camera.camera2.internal.compat.CameraManagerCompat r3 = r4.mCameraManager     // Catch: java.lang.Exception -> L2d
            int r0 = r0.intValue()     // Catch: java.lang.Exception -> L2d
            int r0 = androidx.camera.camera2.internal.FovUtil.getDeviceDefaultViewAngleDegrees(r3, r0)     // Catch: java.lang.Exception -> L2d
            float r0 = (float) r0
            float r1 = (float) r2
            float r0 = r0 / r1
            return r0
        L2d:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "The camera is unable to provide necessary information to resolve its intrinsic zoom ratio with error: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "Camera2CameraInfo"
            androidx.camera.core.Logger.e(r2, r0)
            return r1
    }

    @Override // androidx.camera.core.CameraInfo
    public int getLensFacing() {
            r3 = this;
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r0 = r3.mCameraCharacteristicsCompat
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            java.lang.String r2 = "Unable to get the lens facing of the camera."
            androidx.core.util.Preconditions.checkArgument(r1, r2)
            int r0 = r0.intValue()
            int r0 = androidx.camera.camera2.internal.LensFacingUtil.getCameraSelectorLensFacing(r0)
            return r0
    }

    int getSensorOrientation() {
            r2 = this;
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r0 = r2.mCameraCharacteristicsCompat
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            androidx.core.util.Preconditions.checkNotNull(r0)
            int r0 = r0.intValue()
            return r0
    }

    @Override // androidx.camera.core.CameraInfo
    public int getSensorRotationDegrees() {
            r1 = this;
            r0 = 0
            int r0 = r1.getSensorRotationDegrees(r0)
            return r0
    }

    @Override // androidx.camera.core.CameraInfo
    public int getSensorRotationDegrees(int r4) {
            r3 = this;
            int r0 = r3.getSensorOrientation()
            int r4 = androidx.camera.core.impl.utils.CameraOrientationUtil.surfaceRotationToDegrees(r4)
            int r1 = r3.getLensFacing()
            r2 = 1
            if (r2 != r1) goto L10
            goto L11
        L10:
            r2 = 0
        L11:
            int r4 = androidx.camera.core.impl.utils.CameraOrientationUtil.getRelativeImageRotation(r4, r0, r2)
            return r4
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    @androidx.annotation.NonNull
    public java.util.Set<androidx.camera.core.DynamicRange> getSupportedDynamicRanges() {
            r1 = this;
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r0 = r1.mCameraCharacteristicsCompat
            androidx.camera.camera2.internal.compat.params.DynamicRangesCompat r0 = androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.fromCameraCharacteristics(r0)
            java.util.Set r0 = r0.getSupportedDynamicRanges()
            return r0
    }

    @Override // androidx.camera.core.CameraInfo
    @androidx.annotation.NonNull
    public java.util.Set<android.util.Range<java.lang.Integer>> getSupportedFrameRateRanges() {
            r2 = this;
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r0 = r2.mCameraCharacteristicsCompat
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES
            java.lang.Object r0 = r0.get(r1)
            android.util.Range[] r0 = (android.util.Range[]) r0
            if (r0 == 0) goto L16
            java.util.HashSet r1 = new java.util.HashSet
            java.util.List r0 = java.util.Arrays.asList(r0)
            r1.<init>(r0)
            return r1
        L16:
            java.util.Set r0 = java.util.Collections.EMPTY_SET
            return r0
    }

    int getSupportedHardwareLevel() {
            r2 = this;
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r0 = r2.mCameraCharacteristicsCompat
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            androidx.core.util.Preconditions.checkNotNull(r0)
            int r0 = r0.intValue()
            return r0
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    @androidx.annotation.NonNull
    public java.util.List<android.util.Size> getSupportedHighResolutions(int r2) {
            r1 = this;
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r0 = r1.mCameraCharacteristicsCompat
            androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat r0 = r0.getStreamConfigurationMapCompat()
            android.util.Size[] r2 = r0.getHighResolutionOutputSizes(r2)
            if (r2 == 0) goto L11
            java.util.List r2 = java.util.Arrays.asList(r2)
            return r2
        L11:
            java.util.List r2 = java.util.Collections.EMPTY_LIST
            return r2
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    @androidx.annotation.NonNull
    public java.util.List<android.util.Size> getSupportedResolutions(int r2) {
            r1 = this;
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r0 = r1.mCameraCharacteristicsCompat
            androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat r0 = r0.getStreamConfigurationMapCompat()
            android.util.Size[] r2 = r0.getOutputSizes(r2)
            if (r2 == 0) goto L11
            java.util.List r2 = java.util.Arrays.asList(r2)
            return r2
        L11:
            java.util.List r2 = java.util.Collections.EMPTY_LIST
            return r2
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    @androidx.annotation.NonNull
    public androidx.camera.core.impl.Timebase getTimebase() {
            r2 = this;
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r0 = r2.mCameraCharacteristicsCompat
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            androidx.core.util.Preconditions.checkNotNull(r0)
            int r0 = r0.intValue()
            r1 = 1
            if (r0 == r1) goto L17
            androidx.camera.core.impl.Timebase r0 = androidx.camera.core.impl.Timebase.UPTIME
            return r0
        L17:
            androidx.camera.core.impl.Timebase r0 = androidx.camera.core.impl.Timebase.REALTIME
            return r0
    }

    @Override // androidx.camera.core.CameraInfo
    @androidx.annotation.NonNull
    public androidx.lifecycle.LiveData<java.lang.Integer> getTorchState() {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            androidx.camera.camera2.internal.Camera2CameraControlImpl r1 = r3.mCamera2CameraControlImpl     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1e
            androidx.camera.camera2.internal.Camera2CameraInfoImpl$RedirectableLiveData<java.lang.Integer> r1 = r3.mRedirectTorchStateLiveData     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1a
            androidx.camera.camera2.internal.Camera2CameraInfoImpl$RedirectableLiveData r1 = new androidx.camera.camera2.internal.Camera2CameraInfoImpl$RedirectableLiveData     // Catch: java.lang.Throwable -> L18
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L18
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L18
            r3.mRedirectTorchStateLiveData = r1     // Catch: java.lang.Throwable -> L18
            goto L1a
        L18:
            r1 = move-exception
            goto L2e
        L1a:
            androidx.camera.camera2.internal.Camera2CameraInfoImpl$RedirectableLiveData<java.lang.Integer> r1 = r3.mRedirectTorchStateLiveData     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return r1
        L1e:
            androidx.camera.camera2.internal.Camera2CameraInfoImpl$RedirectableLiveData<java.lang.Integer> r2 = r3.mRedirectTorchStateLiveData     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L24
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return r2
        L24:
            androidx.camera.camera2.internal.TorchControl r1 = r1.getTorchControl()     // Catch: java.lang.Throwable -> L18
            androidx.lifecycle.LiveData r1 = r1.getTorchState()     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return r1
        L2e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r1
    }

    @Override // androidx.camera.core.CameraInfo
    @androidx.annotation.NonNull
    public androidx.lifecycle.LiveData<androidx.camera.core.ZoomState> getZoomState() {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            androidx.camera.camera2.internal.Camera2CameraControlImpl r1 = r3.mCamera2CameraControlImpl     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L1f
            androidx.camera.camera2.internal.Camera2CameraInfoImpl$RedirectableLiveData<androidx.camera.core.ZoomState> r1 = r3.mRedirectZoomStateLiveData     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L1b
            androidx.camera.camera2.internal.Camera2CameraInfoImpl$RedirectableLiveData r1 = new androidx.camera.camera2.internal.Camera2CameraInfoImpl$RedirectableLiveData     // Catch: java.lang.Throwable -> L19
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r2 = r3.mCameraCharacteristicsCompat     // Catch: java.lang.Throwable -> L19
            androidx.camera.core.ZoomState r2 = androidx.camera.camera2.internal.ZoomControl.getDefaultZoomState(r2)     // Catch: java.lang.Throwable -> L19
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L19
            r3.mRedirectZoomStateLiveData = r1     // Catch: java.lang.Throwable -> L19
            goto L1b
        L19:
            r1 = move-exception
            goto L2f
        L1b:
            androidx.camera.camera2.internal.Camera2CameraInfoImpl$RedirectableLiveData<androidx.camera.core.ZoomState> r1 = r3.mRedirectZoomStateLiveData     // Catch: java.lang.Throwable -> L19
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return r1
        L1f:
            androidx.camera.camera2.internal.Camera2CameraInfoImpl$RedirectableLiveData<androidx.camera.core.ZoomState> r2 = r3.mRedirectZoomStateLiveData     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L25
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return r2
        L25:
            androidx.camera.camera2.internal.ZoomControl r1 = r1.getZoomControl()     // Catch: java.lang.Throwable -> L19
            androidx.lifecycle.LiveData r1 = r1.getZoomState()     // Catch: java.lang.Throwable -> L19
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return r1
        L2f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r1
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean hasFlashUnit() {
            r2 = this;
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r0 = r2.mCameraCharacteristicsCompat
            java.util.Objects.requireNonNull(r0)
            androidx.camera.camera2.internal.n0 r1 = new androidx.camera.camera2.internal.n0
            r1.<init>(r0)
            boolean r0 = androidx.camera.camera2.internal.compat.workaround.FlashAvailabilityChecker.isFlashAvailable(r1)
            return r0
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean isFocusMeteringSupported(@androidx.annotation.NonNull androidx.camera.core.FocusMeteringAction r3) {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            androidx.camera.camera2.internal.Camera2CameraControlImpl r1 = r2.mCamera2CameraControlImpl     // Catch: java.lang.Throwable -> La
            if (r1 != 0) goto Lc
            r3 = 0
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return r3
        La:
            r3 = move-exception
            goto L16
        Lc:
            androidx.camera.camera2.internal.FocusMeteringControl r1 = r1.getFocusMeteringControl()     // Catch: java.lang.Throwable -> La
            boolean r3 = r1.isFocusMeteringSupported(r3)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return r3
        L16:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r3
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean isPrivateReprocessingSupported() {
            r2 = this;
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r0 = r2.mCameraCharacteristicsCompat
            r1 = 4
            boolean r0 = androidx.camera.camera2.internal.ZslUtil.isCapabilitySupported(r0, r1)
            return r0
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean isZslSupported() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L16
            boolean r0 = r2.isPrivateReprocessingSupported()
            if (r0 == 0) goto L16
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk> r0 = androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk.class
            androidx.camera.core.impl.Quirk r0 = androidx.camera.camera2.internal.compat.quirk.DeviceQuirks.get(r0)
            if (r0 != 0) goto L16
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    void linkWithCameraControl(@androidx.annotation.NonNull androidx.camera.camera2.internal.Camera2CameraControlImpl r5) {
            r4 = this;
            java.lang.Object r0 = r4.mLock
            monitor-enter(r0)
            r4.mCamera2CameraControlImpl = r5     // Catch: java.lang.Throwable -> L15
            androidx.camera.camera2.internal.Camera2CameraInfoImpl$RedirectableLiveData<androidx.camera.core.ZoomState> r1 = r4.mRedirectZoomStateLiveData     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L17
            androidx.camera.camera2.internal.ZoomControl r5 = r5.getZoomControl()     // Catch: java.lang.Throwable -> L15
            androidx.lifecycle.LiveData r5 = r5.getZoomState()     // Catch: java.lang.Throwable -> L15
            r1.redirectTo(r5)     // Catch: java.lang.Throwable -> L15
            goto L17
        L15:
            r5 = move-exception
            goto L52
        L17:
            androidx.camera.camera2.internal.Camera2CameraInfoImpl$RedirectableLiveData<java.lang.Integer> r5 = r4.mRedirectTorchStateLiveData     // Catch: java.lang.Throwable -> L15
            if (r5 == 0) goto L28
            androidx.camera.camera2.internal.Camera2CameraControlImpl r1 = r4.mCamera2CameraControlImpl     // Catch: java.lang.Throwable -> L15
            androidx.camera.camera2.internal.TorchControl r1 = r1.getTorchControl()     // Catch: java.lang.Throwable -> L15
            androidx.lifecycle.LiveData r1 = r1.getTorchState()     // Catch: java.lang.Throwable -> L15
            r5.redirectTo(r1)     // Catch: java.lang.Throwable -> L15
        L28:
            java.util.List<android.util.Pair<androidx.camera.core.impl.CameraCaptureCallback, java.util.concurrent.Executor>> r5 = r4.mCameraCaptureCallbacks     // Catch: java.lang.Throwable -> L15
            if (r5 == 0) goto L4d
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L15
        L30:
            boolean r1 = r5.hasNext()     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L4a
            java.lang.Object r1 = r5.next()     // Catch: java.lang.Throwable -> L15
            android.util.Pair r1 = (android.util.Pair) r1     // Catch: java.lang.Throwable -> L15
            androidx.camera.camera2.internal.Camera2CameraControlImpl r2 = r4.mCamera2CameraControlImpl     // Catch: java.lang.Throwable -> L15
            java.lang.Object r3 = r1.second     // Catch: java.lang.Throwable -> L15
            java.util.concurrent.Executor r3 = (java.util.concurrent.Executor) r3     // Catch: java.lang.Throwable -> L15
            java.lang.Object r1 = r1.first     // Catch: java.lang.Throwable -> L15
            androidx.camera.core.impl.CameraCaptureCallback r1 = (androidx.camera.core.impl.CameraCaptureCallback) r1     // Catch: java.lang.Throwable -> L15
            r2.addSessionCameraCaptureCallback(r3, r1)     // Catch: java.lang.Throwable -> L15
            goto L30
        L4a:
            r5 = 0
            r4.mCameraCaptureCallbacks = r5     // Catch: java.lang.Throwable -> L15
        L4d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            r4.logDeviceInfo()
            return
        L52:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r5
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public void removeSessionCaptureCallback(@androidx.annotation.NonNull androidx.camera.core.impl.CameraCaptureCallback r4) {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            androidx.camera.camera2.internal.Camera2CameraControlImpl r1 = r3.mCamera2CameraControlImpl     // Catch: java.lang.Throwable -> Ld
            if (r1 != 0) goto L29
            java.util.List<android.util.Pair<androidx.camera.core.impl.CameraCaptureCallback, java.util.concurrent.Executor>> r1 = r3.mCameraCaptureCallbacks     // Catch: java.lang.Throwable -> Ld
            if (r1 != 0) goto Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r4 = move-exception
            goto L2e
        Lf:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Ld
        L13:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> Ld
            if (r2 == 0) goto L27
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> Ld
            android.util.Pair r2 = (android.util.Pair) r2     // Catch: java.lang.Throwable -> Ld
            java.lang.Object r2 = r2.first     // Catch: java.lang.Throwable -> Ld
            if (r2 != r4) goto L13
            r1.remove()     // Catch: java.lang.Throwable -> Ld
            goto L13
        L27:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return
        L29:
            r1.removeSessionCameraCaptureCallback(r4)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return
        L2e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r4
    }

    void setCameraStateSource(@androidx.annotation.NonNull androidx.lifecycle.LiveData<androidx.camera.core.CameraState> r2) {
            r1 = this;
            androidx.camera.camera2.internal.Camera2CameraInfoImpl$RedirectableLiveData<androidx.camera.core.CameraState> r0 = r1.mCameraStateLiveData
            r0.redirectTo(r2)
            return
    }
}
