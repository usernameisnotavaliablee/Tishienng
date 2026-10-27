package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class TorchControl {
    static final int DEFAULT_TORCH_STATE = 0;
    private static final java.lang.String TAG = "TorchControl";
    private final androidx.camera.camera2.internal.Camera2CameraControlImpl mCamera2CameraControlImpl;
    androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> mEnableTorchCompleter;
    private final java.util.concurrent.Executor mExecutor;
    private final boolean mHasFlashUnit;
    private boolean mIsActive;
    boolean mTargetTorchEnabled;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> mTorchState;

    TorchControl(@androidx.annotation.NonNull androidx.camera.camera2.internal.Camera2CameraControlImpl r1, @androidx.annotation.NonNull androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r2, @androidx.annotation.NonNull java.util.concurrent.Executor r3) {
            r0 = this;
            r0.<init>()
            r0.mCamera2CameraControlImpl = r1
            r0.mExecutor = r3
            java.util.Objects.requireNonNull(r2)
            androidx.camera.camera2.internal.n0 r3 = new androidx.camera.camera2.internal.n0
            r3.<init>(r2)
            boolean r2 = androidx.camera.camera2.internal.compat.workaround.FlashAvailabilityChecker.isFlashAvailable(r3)
            r0.mHasFlashUnit = r2
            androidx.lifecycle.MutableLiveData r2 = new androidx.lifecycle.MutableLiveData
            r3 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.<init>(r3)
            r0.mTorchState = r2
            androidx.camera.camera2.internal.s2 r2 = new androidx.camera.camera2.internal.s2
            r2.<init>(r0)
            r1.addCaptureResultListener(r2)
            return
    }

    public static /* synthetic */ java.lang.Object a(androidx.camera.camera2.internal.TorchControl r2, boolean r3, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r4) {
            java.util.concurrent.Executor r0 = r2.mExecutor
            androidx.camera.camera2.internal.t2 r1 = new androidx.camera.camera2.internal.t2
            r1.<init>(r2, r4, r3)
            r0.execute(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "enableTorch: "
            r2.append(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            return r2
    }

    public static /* synthetic */ boolean b(androidx.camera.camera2.internal.TorchControl r2, android.hardware.camera2.TotalCaptureResult r3) {
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.lang.Void> r0 = r2.mEnableTorchCompleter
            r1 = 0
            if (r0 == 0) goto L29
            android.hardware.camera2.CaptureRequest r3 = r3.getRequest()
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.FLASH_MODE
            java.lang.Object r3 = r3.get(r0)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L1c
            int r3 = r3.intValue()
            r0 = 2
            if (r3 != r0) goto L1c
            r3 = 1
            goto L1d
        L1c:
            r3 = 0
        L1d:
            boolean r0 = r2.mTargetTorchEnabled
            if (r3 != r0) goto L29
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.lang.Void> r3 = r2.mEnableTorchCompleter
            r0 = 0
            r3.set(r0)
            r2.mEnableTorchCompleter = r0
        L29:
            return r1
    }

    public static /* synthetic */ void c(androidx.camera.camera2.internal.TorchControl r0, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r1, boolean r2) {
            r0.enableTorchInternal(r1, r2)
            return
    }

    private <T> void setLiveDataValue(@androidx.annotation.NonNull androidx.lifecycle.MutableLiveData<T> r2, T r3) {
            r1 = this;
            boolean r0 = androidx.camera.core.impl.utils.Threads.isMainThread()
            if (r0 == 0) goto La
            r2.setValue(r3)
            return
        La:
            r2.postValue(r3)
            return
    }

    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> enableTorch(boolean r3) {
            r2 = this;
            boolean r0 = r2.mHasFlashUnit
            if (r0 != 0) goto L17
            java.lang.String r3 = "TorchControl"
            java.lang.String r0 = "Unable to enableTorch due to there is no flash unit."
            androidx.camera.core.Logger.d(r3, r0)
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "No flash unit"
            r3.<init>(r0)
            com.google.common.util.concurrent.ListenableFuture r3 = androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(r3)
            return r3
        L17:
            androidx.lifecycle.MutableLiveData<java.lang.Integer> r0 = r2.mTorchState
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r2.setLiveDataValue(r0, r1)
            androidx.camera.camera2.internal.r2 r0 = new androidx.camera.camera2.internal.r2
            r0.<init>(r2, r3)
            com.google.common.util.concurrent.ListenableFuture r3 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r0)
            return r3
    }

    void enableTorchInternal(@androidx.annotation.Nullable androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> r3, boolean r4) {
            r2 = this;
            boolean r0 = r2.mHasFlashUnit
            if (r0 != 0) goto L11
            if (r3 == 0) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "No flash unit"
            r4.<init>(r0)
            r3.setException(r4)
            return
        L11:
            boolean r0 = r2.mIsActive
            if (r0 != 0) goto L2c
            androidx.lifecycle.MutableLiveData<java.lang.Integer> r4 = r2.mTorchState
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.setLiveDataValue(r4, r0)
            if (r3 == 0) goto L2b
            androidx.camera.core.CameraControl$OperationCanceledException r4 = new androidx.camera.core.CameraControl$OperationCanceledException
            java.lang.String r0 = "Camera is not active."
            r4.<init>(r0)
            r3.setException(r4)
        L2b:
            return
        L2c:
            r2.mTargetTorchEnabled = r4
            androidx.camera.camera2.internal.Camera2CameraControlImpl r0 = r2.mCamera2CameraControlImpl
            r0.enableTorchInternal(r4)
            androidx.lifecycle.MutableLiveData<java.lang.Integer> r0 = r2.mTorchState
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.setLiveDataValue(r0, r4)
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.lang.Void> r4 = r2.mEnableTorchCompleter
            if (r4 == 0) goto L4a
            androidx.camera.core.CameraControl$OperationCanceledException r0 = new androidx.camera.core.CameraControl$OperationCanceledException
            java.lang.String r1 = "There is a new enableTorch being set"
            r0.<init>(r1)
            r4.setException(r0)
        L4a:
            r2.mEnableTorchCompleter = r3
            return
    }

    @androidx.annotation.NonNull
    androidx.lifecycle.LiveData<java.lang.Integer> getTorchState() {
            r1 = this;
            androidx.lifecycle.MutableLiveData<java.lang.Integer> r0 = r1.mTorchState
            return r0
    }

    void setActive(boolean r3) {
            r2 = this;
            boolean r0 = r2.mIsActive
            if (r0 != r3) goto L5
            goto L2f
        L5:
            r2.mIsActive = r3
            if (r3 != 0) goto L2f
            boolean r3 = r2.mTargetTorchEnabled
            if (r3 == 0) goto L1e
            r3 = 0
            r2.mTargetTorchEnabled = r3
            androidx.camera.camera2.internal.Camera2CameraControlImpl r0 = r2.mCamera2CameraControlImpl
            r0.enableTorchInternal(r3)
            androidx.lifecycle.MutableLiveData<java.lang.Integer> r0 = r2.mTorchState
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.setLiveDataValue(r0, r3)
        L1e:
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.lang.Void> r3 = r2.mEnableTorchCompleter
            if (r3 == 0) goto L2f
            androidx.camera.core.CameraControl$OperationCanceledException r0 = new androidx.camera.core.CameraControl$OperationCanceledException
            java.lang.String r1 = "Camera is not active."
            r0.<init>(r1)
            r3.setException(r0)
            r3 = 0
            r2.mEnableTorchCompleter = r3
        L2f:
            return
    }
}
