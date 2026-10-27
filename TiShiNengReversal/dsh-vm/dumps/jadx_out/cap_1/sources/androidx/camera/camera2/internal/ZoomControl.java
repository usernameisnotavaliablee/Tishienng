package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class ZoomControl {
    public static final float DEFAULT_ZOOM_RATIO = 1.0f;
    private static final java.lang.String TAG = "ZoomControl";
    private final androidx.camera.camera2.internal.Camera2CameraControlImpl mCamera2CameraControlImpl;
    private androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener mCaptureResultListener;

    @androidx.annotation.GuardedBy("mCurrentZoomState")
    private final androidx.camera.camera2.internal.ZoomStateImpl mCurrentZoomState;
    private final java.util.concurrent.Executor mExecutor;
    private boolean mIsActive;

    @androidx.annotation.NonNull
    final androidx.camera.camera2.internal.ZoomControl.ZoomImpl mZoomImpl;
    private final androidx.lifecycle.MutableLiveData<androidx.camera.core.ZoomState> mZoomStateLiveData;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface ZoomImpl {
        void addRequestOption(@androidx.annotation.NonNull androidx.camera.camera2.impl.Camera2ImplConfig.Builder r1);

        @androidx.annotation.NonNull
        android.graphics.Rect getCropSensorRegion();

        float getMaxZoom();

        float getMinZoom();

        void onCaptureResult(@androidx.annotation.NonNull android.hardware.camera2.TotalCaptureResult r1);

        void resetZoom();

        void setZoomRatio(float r1, @androidx.annotation.NonNull androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> r2);
    }

    ZoomControl(@androidx.annotation.NonNull androidx.camera.camera2.internal.Camera2CameraControlImpl r2, @androidx.annotation.NonNull androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r3, @androidx.annotation.NonNull java.util.concurrent.Executor r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mIsActive = r0
            androidx.camera.camera2.internal.ZoomControl$1 r0 = new androidx.camera.camera2.internal.ZoomControl$1
            r0.<init>(r1)
            r1.mCaptureResultListener = r0
            r1.mCamera2CameraControlImpl = r2
            r1.mExecutor = r4
            androidx.camera.camera2.internal.ZoomControl$ZoomImpl r3 = createZoomImpl(r3)
            r1.mZoomImpl = r3
            androidx.camera.camera2.internal.ZoomStateImpl r4 = new androidx.camera.camera2.internal.ZoomStateImpl
            float r0 = r3.getMaxZoom()
            float r3 = r3.getMinZoom()
            r4.<init>(r0, r3)
            r1.mCurrentZoomState = r4
            r3 = 1065353216(0x3f800000, float:1.0)
            r4.setZoomRatio(r3)
            androidx.lifecycle.MutableLiveData r3 = new androidx.lifecycle.MutableLiveData
            androidx.camera.core.ZoomState r4 = androidx.camera.core.internal.ImmutableZoomState.create(r4)
            r3.<init>(r4)
            r1.mZoomStateLiveData = r3
            androidx.camera.camera2.internal.Camera2CameraControlImpl$CaptureResultListener r3 = r1.mCaptureResultListener
            r2.addCaptureResultListener(r3)
            return
    }

    public static /* synthetic */ void a(androidx.camera.camera2.internal.ZoomControl r0, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r1, androidx.camera.core.ZoomState r2) {
            r0.submitCameraZoomRatio(r1, r2)
            return
    }

    public static /* synthetic */ void b(androidx.camera.camera2.internal.ZoomControl r0, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r1, androidx.camera.core.ZoomState r2) {
            r0.submitCameraZoomRatio(r1, r2)
            return
    }

    public static /* synthetic */ java.lang.Object c(androidx.camera.camera2.internal.ZoomControl r2, androidx.camera.core.ZoomState r3, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r4) {
            java.util.concurrent.Executor r0 = r2.mExecutor
            androidx.camera.camera2.internal.w2 r1 = new androidx.camera.camera2.internal.w2
            r1.<init>(r2, r4, r3)
            r0.execute(r1)
            java.lang.String r2 = "setLinearZoom"
            return r2
    }

    private static androidx.camera.camera2.internal.ZoomControl.ZoomImpl createZoomImpl(@androidx.annotation.NonNull androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r1) {
            boolean r0 = isAndroidRZoomSupported(r1)
            if (r0 == 0) goto Lc
            androidx.camera.camera2.internal.AndroidRZoomImpl r0 = new androidx.camera.camera2.internal.AndroidRZoomImpl
            r0.<init>(r1)
            return r0
        Lc:
            androidx.camera.camera2.internal.CropRegionZoomImpl r0 = new androidx.camera.camera2.internal.CropRegionZoomImpl
            r0.<init>(r1)
            return r0
    }

    public static /* synthetic */ java.lang.Object d(androidx.camera.camera2.internal.ZoomControl r2, androidx.camera.core.ZoomState r3, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r4) {
            java.util.concurrent.Executor r0 = r2.mExecutor
            androidx.camera.camera2.internal.v2 r1 = new androidx.camera.camera2.internal.v2
            r1.<init>(r2, r4, r3)
            r0.execute(r1)
            java.lang.String r2 = "setZoomRatio"
            return r2
    }

    static androidx.camera.core.ZoomState getDefaultZoomState(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r2) {
            androidx.camera.camera2.internal.ZoomControl$ZoomImpl r2 = createZoomImpl(r2)
            androidx.camera.camera2.internal.ZoomStateImpl r0 = new androidx.camera.camera2.internal.ZoomStateImpl
            float r1 = r2.getMaxZoom()
            float r2 = r2.getMinZoom()
            r0.<init>(r1, r2)
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.setZoomRatio(r2)
            androidx.camera.core.ZoomState r2 = androidx.camera.core.internal.ImmutableZoomState.create(r0)
            return r2
    }

    @androidx.annotation.RequiresApi(30)
    private static android.util.Range<java.lang.Float> getZoomRatioRange(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r2) {
            android.hardware.camera2.CameraCharacteristics$Key r0 = androidx.camera.camera2.internal.b.a()     // Catch: java.lang.AssertionError -> Lb
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.AssertionError -> Lb
            android.util.Range r2 = (android.util.Range) r2     // Catch: java.lang.AssertionError -> Lb
            return r2
        Lb:
            r2 = move-exception
            java.lang.String r0 = "ZoomControl"
            java.lang.String r1 = "AssertionError, fail to get camera characteristic."
            androidx.camera.core.Logger.w(r0, r1, r2)
            r2 = 0
            return r2
    }

    @androidx.annotation.VisibleForTesting
    static boolean isAndroidRZoomSupported(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Le
            android.util.Range r2 = getZoomRatioRange(r2)
            if (r2 == 0) goto Le
            r2 = 1
            return r2
        Le:
            r2 = 0
            return r2
    }

    private void submitCameraZoomRatio(@androidx.annotation.NonNull androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> r3, @androidx.annotation.NonNull androidx.camera.core.ZoomState r4) {
            r2 = this;
            boolean r0 = r2.mIsActive
            if (r0 != 0) goto L26
            androidx.camera.camera2.internal.ZoomStateImpl r0 = r2.mCurrentZoomState
            monitor-enter(r0)
            androidx.camera.camera2.internal.ZoomStateImpl r4 = r2.mCurrentZoomState     // Catch: java.lang.Throwable -> L23
            r1 = 1065353216(0x3f800000, float:1.0)
            r4.setZoomRatio(r1)     // Catch: java.lang.Throwable -> L23
            androidx.camera.camera2.internal.ZoomStateImpl r4 = r2.mCurrentZoomState     // Catch: java.lang.Throwable -> L23
            androidx.camera.core.ZoomState r4 = androidx.camera.core.internal.ImmutableZoomState.create(r4)     // Catch: java.lang.Throwable -> L23
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            r2.updateLiveData(r4)
            androidx.camera.core.CameraControl$OperationCanceledException r4 = new androidx.camera.core.CameraControl$OperationCanceledException
            java.lang.String r0 = "Camera is not active."
            r4.<init>(r0)
            r3.setException(r4)
            return
        L23:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            throw r3
        L26:
            androidx.camera.camera2.internal.ZoomControl$ZoomImpl r0 = r2.mZoomImpl
            float r4 = r4.getZoomRatio()
            r0.setZoomRatio(r4, r3)
            androidx.camera.camera2.internal.Camera2CameraControlImpl r3 = r2.mCamera2CameraControlImpl
            r3.updateSessionConfigSynchronous()
            return
    }

    private void updateLiveData(androidx.camera.core.ZoomState r3) {
            r2 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 != r1) goto L10
            androidx.lifecycle.MutableLiveData<androidx.camera.core.ZoomState> r0 = r2.mZoomStateLiveData
            r0.setValue(r3)
            return
        L10:
            androidx.lifecycle.MutableLiveData<androidx.camera.core.ZoomState> r0 = r2.mZoomStateLiveData
            r0.postValue(r3)
            return
    }

    void addZoomOption(@androidx.annotation.NonNull androidx.camera.camera2.impl.Camera2ImplConfig.Builder r2) {
            r1 = this;
            androidx.camera.camera2.internal.ZoomControl$ZoomImpl r0 = r1.mZoomImpl
            r0.addRequestOption(r2)
            return
    }

    @androidx.annotation.NonNull
    android.graphics.Rect getCropSensorRegion() {
            r1 = this;
            androidx.camera.camera2.internal.ZoomControl$ZoomImpl r0 = r1.mZoomImpl
            android.graphics.Rect r0 = r0.getCropSensorRegion()
            return r0
    }

    androidx.lifecycle.LiveData<androidx.camera.core.ZoomState> getZoomState() {
            r1 = this;
            androidx.lifecycle.MutableLiveData<androidx.camera.core.ZoomState> r0 = r1.mZoomStateLiveData
            return r0
    }

    void setActive(boolean r3) {
            r2 = this;
            boolean r0 = r2.mIsActive
            if (r0 != r3) goto L5
            goto L2b
        L5:
            r2.mIsActive = r3
            if (r3 != 0) goto L2b
            androidx.camera.camera2.internal.ZoomStateImpl r3 = r2.mCurrentZoomState
            monitor-enter(r3)
            androidx.camera.camera2.internal.ZoomStateImpl r0 = r2.mCurrentZoomState     // Catch: java.lang.Throwable -> L28
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setZoomRatio(r1)     // Catch: java.lang.Throwable -> L28
            androidx.camera.camera2.internal.ZoomStateImpl r0 = r2.mCurrentZoomState     // Catch: java.lang.Throwable -> L28
            androidx.camera.core.ZoomState r0 = androidx.camera.core.internal.ImmutableZoomState.create(r0)     // Catch: java.lang.Throwable -> L28
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L28
            r2.updateLiveData(r0)
            androidx.camera.camera2.internal.ZoomControl$ZoomImpl r3 = r2.mZoomImpl
            r3.resetZoom()
            androidx.camera.camera2.internal.Camera2CameraControlImpl r3 = r2.mCamera2CameraControlImpl
            r3.updateSessionConfigSynchronous()
            return
        L28:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L28
            throw r0
        L2b:
            return
    }

    @androidx.annotation.NonNull
    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> setLinearZoom(@androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r3) {
            r2 = this;
            androidx.camera.camera2.internal.ZoomStateImpl r0 = r2.mCurrentZoomState
            monitor-enter(r0)
            androidx.camera.camera2.internal.ZoomStateImpl r1 = r2.mCurrentZoomState     // Catch: java.lang.Throwable -> L1c java.lang.IllegalArgumentException -> L1e
            r1.setLinearZoom(r3)     // Catch: java.lang.Throwable -> L1c java.lang.IllegalArgumentException -> L1e
            androidx.camera.camera2.internal.ZoomStateImpl r3 = r2.mCurrentZoomState     // Catch: java.lang.Throwable -> L1c java.lang.IllegalArgumentException -> L1e
            androidx.camera.core.ZoomState r3 = androidx.camera.core.internal.ImmutableZoomState.create(r3)     // Catch: java.lang.Throwable -> L1c java.lang.IllegalArgumentException -> L1e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            r2.updateLiveData(r3)
            androidx.camera.camera2.internal.x2 r0 = new androidx.camera.camera2.internal.x2
            r0.<init>(r2, r3)
            com.google.common.util.concurrent.ListenableFuture r3 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r0)
            return r3
        L1c:
            r3 = move-exception
            goto L25
        L1e:
            r3 = move-exception
            com.google.common.util.concurrent.ListenableFuture r3 = androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(r3)     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            return r3
        L25:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            throw r3
    }

    @androidx.annotation.NonNull
    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> setZoomRatio(float r3) {
            r2 = this;
            androidx.camera.camera2.internal.ZoomStateImpl r0 = r2.mCurrentZoomState
            monitor-enter(r0)
            androidx.camera.camera2.internal.ZoomStateImpl r1 = r2.mCurrentZoomState     // Catch: java.lang.Throwable -> L1c java.lang.IllegalArgumentException -> L1e
            r1.setZoomRatio(r3)     // Catch: java.lang.Throwable -> L1c java.lang.IllegalArgumentException -> L1e
            androidx.camera.camera2.internal.ZoomStateImpl r3 = r2.mCurrentZoomState     // Catch: java.lang.Throwable -> L1c java.lang.IllegalArgumentException -> L1e
            androidx.camera.core.ZoomState r3 = androidx.camera.core.internal.ImmutableZoomState.create(r3)     // Catch: java.lang.Throwable -> L1c java.lang.IllegalArgumentException -> L1e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            r2.updateLiveData(r3)
            androidx.camera.camera2.internal.u2 r0 = new androidx.camera.camera2.internal.u2
            r0.<init>(r2, r3)
            com.google.common.util.concurrent.ListenableFuture r3 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r0)
            return r3
        L1c:
            r3 = move-exception
            goto L25
        L1e:
            r3 = move-exception
            com.google.common.util.concurrent.ListenableFuture r3 = androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(r3)     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            return r3
        L25:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            throw r3
    }
}
