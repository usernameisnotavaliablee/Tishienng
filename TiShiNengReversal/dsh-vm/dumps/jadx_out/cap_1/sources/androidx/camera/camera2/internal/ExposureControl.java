package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ExposureControl {
    private static final int DEFAULT_EXPOSURE_COMPENSATION = 0;

    @androidx.annotation.NonNull
    private final androidx.camera.camera2.internal.Camera2CameraControlImpl mCameraControl;

    @androidx.annotation.NonNull
    private final java.util.concurrent.Executor mExecutor;

    @androidx.annotation.NonNull
    private final androidx.camera.camera2.internal.ExposureStateImpl mExposureStateImpl;
    private boolean mIsActive;

    @androidx.annotation.Nullable
    private androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener mRunningCaptureResultListener;

    @androidx.annotation.Nullable
    private androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Integer> mRunningCompleter;

    ExposureControl(@androidx.annotation.NonNull androidx.camera.camera2.internal.Camera2CameraControlImpl r2, @androidx.annotation.NonNull androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r3, @androidx.annotation.NonNull java.util.concurrent.Executor r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mIsActive = r0
            r1.mCameraControl = r2
            androidx.camera.camera2.internal.ExposureStateImpl r2 = new androidx.camera.camera2.internal.ExposureStateImpl
            r2.<init>(r3, r0)
            r1.mExposureStateImpl = r2
            r1.mExecutor = r4
            return
    }

    public static /* synthetic */ void a(androidx.camera.camera2.internal.ExposureControl r4, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r5, int r6) {
            boolean r0 = r4.mIsActive
            r1 = 0
            if (r0 != 0) goto L15
            androidx.camera.camera2.internal.ExposureStateImpl r4 = r4.mExposureStateImpl
            r4.setExposureCompensationIndex(r1)
            androidx.camera.core.CameraControl$OperationCanceledException r4 = new androidx.camera.core.CameraControl$OperationCanceledException
            java.lang.String r6 = "Camera is not active."
            r4.<init>(r6)
            r5.setException(r4)
            return
        L15:
            r4.clearRunningTask()
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.lang.Integer> r0 = r4.mRunningCompleter
            r2 = 1
            if (r0 != 0) goto L1f
            r0 = 1
            goto L20
        L1f:
            r0 = 0
        L20:
            java.lang.String r3 = "mRunningCompleter should be null when starting set a new exposure compensation value"
            androidx.core.util.Preconditions.checkState(r0, r3)
            androidx.camera.camera2.internal.Camera2CameraControlImpl$CaptureResultListener r0 = r4.mRunningCaptureResultListener
            if (r0 != 0) goto L2a
            r1 = 1
        L2a:
            java.lang.String r0 = "mRunningCaptureResultListener should be null when starting set a new exposure compensation value"
            androidx.core.util.Preconditions.checkState(r1, r0)
            androidx.camera.camera2.internal.h1 r0 = new androidx.camera.camera2.internal.h1
            r0.<init>(r6, r5)
            r4.mRunningCaptureResultListener = r0
            r4.mRunningCompleter = r5
            androidx.camera.camera2.internal.Camera2CameraControlImpl r5 = r4.mCameraControl
            r5.addCaptureResultListener(r0)
            androidx.camera.camera2.internal.Camera2CameraControlImpl r4 = r4.mCameraControl
            r4.updateSessionConfigSynchronous()
            return
    }

    public static /* synthetic */ java.lang.Object b(androidx.camera.camera2.internal.ExposureControl r2, int r3, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r4) {
            java.util.concurrent.Executor r0 = r2.mExecutor
            androidx.camera.camera2.internal.i1 r1 = new androidx.camera.camera2.internal.i1
            r1.<init>(r2, r4, r3)
            r0.execute(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "setExposureCompensationIndex["
            r2.append(r4)
            r2.append(r3)
            java.lang.String r3 = "]"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            return r2
    }

    public static /* synthetic */ boolean c(int r3, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r4, android.hardware.camera2.TotalCaptureResult r5) {
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AE_STATE
            java.lang.Object r0 = r5.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            android.hardware.camera2.CaptureResult$Key r1 = android.hardware.camera2.CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION
            java.lang.Object r5 = r5.get(r1)
            java.lang.Integer r5 = (java.lang.Integer) r5
            r1 = 1
            if (r0 == 0) goto L31
            if (r5 == 0) goto L31
            int r0 = r0.intValue()
            r2 = 2
            if (r0 == r2) goto L23
            r2 = 3
            if (r0 == r2) goto L23
            r2 = 4
            if (r0 == r2) goto L23
            goto L41
        L23:
            int r5 = r5.intValue()
            if (r5 != r3) goto L41
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.set(r3)
            return r1
        L31:
            if (r5 == 0) goto L41
            int r5 = r5.intValue()
            if (r5 != r3) goto L41
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.set(r3)
            return r1
        L41:
            r3 = 0
            return r3
    }

    private void clearRunningTask() {
            r4 = this;
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.lang.Integer> r0 = r4.mRunningCompleter
            r1 = 0
            if (r0 == 0) goto L11
            androidx.camera.core.CameraControl$OperationCanceledException r2 = new androidx.camera.core.CameraControl$OperationCanceledException
            java.lang.String r3 = "Cancelled by another setExposureCompensationIndex()"
            r2.<init>(r3)
            r0.setException(r2)
            r4.mRunningCompleter = r1
        L11:
            androidx.camera.camera2.internal.Camera2CameraControlImpl$CaptureResultListener r0 = r4.mRunningCaptureResultListener
            if (r0 == 0) goto L1c
            androidx.camera.camera2.internal.Camera2CameraControlImpl r2 = r4.mCameraControl
            r2.removeCaptureResultListener(r0)
            r4.mRunningCaptureResultListener = r1
        L1c:
            return
    }

    static androidx.camera.core.ExposureState getDefaultExposureState(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r2) {
            androidx.camera.camera2.internal.ExposureStateImpl r0 = new androidx.camera.camera2.internal.ExposureStateImpl
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @androidx.annotation.NonNull
    androidx.camera.core.ExposureState getExposureState() {
            r1 = this;
            androidx.camera.camera2.internal.ExposureStateImpl r0 = r1.mExposureStateImpl
            return r0
    }

    void setActive(boolean r2) {
            r1 = this;
            boolean r0 = r1.mIsActive
            if (r2 != r0) goto L5
            goto L12
        L5:
            r1.mIsActive = r2
            if (r2 != 0) goto L12
            androidx.camera.camera2.internal.ExposureStateImpl r2 = r1.mExposureStateImpl
            r0 = 0
            r2.setExposureCompensationIndex(r0)
            r1.clearRunningTask()
        L12:
            return
    }

    @androidx.annotation.OptIn(markerClass = {androidx.camera.camera2.interop.ExperimentalCamera2Interop.class})
    void setCaptureRequestOption(@androidx.annotation.NonNull androidx.camera.camera2.impl.Camera2ImplConfig.Builder r3) {
            r2 = this;
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION
            androidx.camera.camera2.internal.ExposureStateImpl r1 = r2.mExposureStateImpl
            int r1 = r1.getExposureCompensationIndex()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.setCaptureRequestOption(r0, r1)
            return
    }

    @androidx.annotation.NonNull
    com.google.common.util.concurrent.ListenableFuture<java.lang.Integer> setExposureCompensationIndex(int r5) {
            r4 = this;
            androidx.camera.camera2.internal.ExposureStateImpl r0 = r4.mExposureStateImpl
            boolean r0 = r0.isExposureCompensationSupported()
            if (r0 != 0) goto L14
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "ExposureCompensation is not supported"
            r5.<init>(r0)
            com.google.common.util.concurrent.ListenableFuture r5 = androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(r5)
            return r5
        L14:
            androidx.camera.camera2.internal.ExposureStateImpl r0 = r4.mExposureStateImpl
            android.util.Range r0 = r0.getExposureCompensationRange()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L5c
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Requested ExposureCompensation "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = " is not within valid range ["
            r2.append(r5)
            java.lang.Comparable r5 = r0.getUpper()
            r2.append(r5)
            java.lang.String r5 = ".."
            r2.append(r5)
            java.lang.Comparable r5 = r0.getLower()
            r2.append(r5)
            java.lang.String r5 = "]"
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5)
            com.google.common.util.concurrent.ListenableFuture r5 = androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(r1)
            return r5
        L5c:
            androidx.camera.camera2.internal.ExposureStateImpl r0 = r4.mExposureStateImpl
            r0.setExposureCompensationIndex(r5)
            androidx.camera.camera2.internal.j1 r0 = new androidx.camera.camera2.internal.j1
            r0.<init>(r4, r5)
            com.google.common.util.concurrent.ListenableFuture r5 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r0)
            com.google.common.util.concurrent.ListenableFuture r5 = androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(r5)
            return r5
    }
}
