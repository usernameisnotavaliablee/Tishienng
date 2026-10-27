package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.OptIn(markerClass = {androidx.camera.camera2.interop.ExperimentalCamera2Interop.class})
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class FocusMeteringControl {
    static final long AUTO_FOCUS_TIMEOUT_DURATION = 5000;
    private static final android.hardware.camera2.params.MeteringRectangle[] EMPTY_RECTANGLES = null;
    private android.hardware.camera2.params.MeteringRectangle[] mAeRects;
    private android.hardware.camera2.params.MeteringRectangle[] mAfRects;
    private java.util.concurrent.ScheduledFuture<?> mAutoCancelHandle;
    private java.util.concurrent.ScheduledFuture<?> mAutoFocusTimeoutHandle;
    private android.hardware.camera2.params.MeteringRectangle[] mAwbRects;
    private final androidx.camera.camera2.internal.Camera2CameraControlImpl mCameraControl;

    @androidx.annotation.NonNull
    java.lang.Integer mCurrentAfState;
    final java.util.concurrent.Executor mExecutor;
    long mFocusTimeoutCounter;
    private volatile boolean mIsActive;
    boolean mIsAutoFocusCompleted;
    boolean mIsFocusSuccessful;
    private boolean mIsInAfAutoMode;

    @androidx.annotation.NonNull
    private final androidx.camera.camera2.internal.compat.workaround.MeteringRegionCorrection mMeteringRegionCorrection;
    private volatile android.util.Rational mPreviewAspectRatio;
    androidx.concurrent.futures.CallbackToFutureAdapter.Completer<androidx.camera.core.FocusMeteringResult> mRunningActionCompleter;
    androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> mRunningCancelCompleter;
    private final java.util.concurrent.ScheduledExecutorService mScheduler;
    private androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener mSessionListenerForCancel;
    private androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener mSessionListenerForFocus;
    private int mTemplate;



    static {
            r0 = 0
            android.hardware.camera2.params.MeteringRectangle[] r0 = new android.hardware.camera2.params.MeteringRectangle[r0]
            androidx.camera.camera2.internal.FocusMeteringControl.EMPTY_RECTANGLES = r0
            return
    }

    FocusMeteringControl(@androidx.annotation.NonNull androidx.camera.camera2.internal.Camera2CameraControlImpl r5, @androidx.annotation.NonNull java.util.concurrent.ScheduledExecutorService r6, @androidx.annotation.NonNull java.util.concurrent.Executor r7, @androidx.annotation.NonNull androidx.camera.core.impl.Quirks r8) {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.mIsActive = r0
            r1 = 0
            r4.mPreviewAspectRatio = r1
            r4.mIsInAfAutoMode = r0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r4.mCurrentAfState = r2
            r2 = 0
            r4.mFocusTimeoutCounter = r2
            r4.mIsAutoFocusCompleted = r0
            r4.mIsFocusSuccessful = r0
            r0 = 1
            r4.mTemplate = r0
            r4.mSessionListenerForFocus = r1
            r4.mSessionListenerForCancel = r1
            android.hardware.camera2.params.MeteringRectangle[] r0 = androidx.camera.camera2.internal.FocusMeteringControl.EMPTY_RECTANGLES
            r4.mAfRects = r0
            r4.mAeRects = r0
            r4.mAwbRects = r0
            r4.mRunningActionCompleter = r1
            r4.mRunningCancelCompleter = r1
            r4.mCameraControl = r5
            r4.mExecutor = r7
            r4.mScheduler = r6
            androidx.camera.camera2.internal.compat.workaround.MeteringRegionCorrection r5 = new androidx.camera.camera2.internal.compat.workaround.MeteringRegionCorrection
            r5.<init>(r8)
            r4.mMeteringRegionCorrection = r5
            return
    }

    public static /* synthetic */ boolean a(androidx.camera.camera2.internal.FocusMeteringControl r4, boolean r5, long r6, android.hardware.camera2.TotalCaptureResult r8) {
            r4.getClass()
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AF_STATE
            java.lang.Object r0 = r8.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            boolean r1 = r4.shouldTriggerAF()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L3d
            if (r5 == 0) goto L39
            if (r0 != 0) goto L18
            goto L39
        L18:
            java.lang.Integer r5 = r4.mCurrentAfState
            int r5 = r5.intValue()
            r1 = 3
            if (r5 != r1) goto L3d
            int r5 = r0.intValue()
            r1 = 4
            if (r5 != r1) goto L2d
            r4.mIsFocusSuccessful = r3
            r4.mIsAutoFocusCompleted = r3
            goto L3d
        L2d:
            int r5 = r0.intValue()
            r1 = 5
            if (r5 != r1) goto L3d
            r4.mIsFocusSuccessful = r2
            r4.mIsAutoFocusCompleted = r3
            goto L3d
        L39:
            r4.mIsFocusSuccessful = r3
            r4.mIsAutoFocusCompleted = r3
        L3d:
            boolean r5 = r4.mIsAutoFocusCompleted
            if (r5 == 0) goto L4d
            boolean r5 = androidx.camera.camera2.internal.Camera2CameraControlImpl.isSessionUpdated(r8, r6)
            if (r5 == 0) goto L4d
            boolean r5 = r4.mIsFocusSuccessful
            r4.completeActionFuture(r5)
            return r3
        L4d:
            java.lang.Integer r5 = r4.mCurrentAfState
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L59
            if (r0 == 0) goto L59
            r4.mCurrentAfState = r0
        L59:
            return r2
    }

    public static /* synthetic */ java.lang.Object b(androidx.camera.camera2.internal.FocusMeteringControl r7, androidx.camera.core.FocusMeteringAction r8, long r9, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r11) {
            java.util.concurrent.Executor r0 = r7.mExecutor
            androidx.camera.camera2.internal.k1 r1 = new androidx.camera.camera2.internal.k1
            r2 = r7
            r4 = r8
            r5 = r9
            r3 = r11
            r1.<init>(r2, r3, r4, r5)
            r0.execute(r1)
            java.lang.String r7 = "startFocusAndMetering"
            return r7
    }

    public static /* synthetic */ boolean c(androidx.camera.camera2.internal.FocusMeteringControl r1, int r2, long r3, android.hardware.camera2.TotalCaptureResult r5) {
            r1.getClass()
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AF_MODE
            java.lang.Object r0 = r5.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 != r2) goto L1c
            boolean r2 = androidx.camera.camera2.internal.Camera2CameraControlImpl.isSessionUpdated(r5, r3)
            if (r2 == 0) goto L1c
            r1.completeCancelFuture()
            r1 = 1
            return r1
        L1c:
            r1 = 0
            return r1
    }

    private void clearAutoFocusTimeoutHandle() {
            r2 = this;
            java.util.concurrent.ScheduledFuture<?> r0 = r2.mAutoFocusTimeoutHandle
            if (r0 == 0) goto Lb
            r1 = 1
            r0.cancel(r1)
            r0 = 0
            r2.mAutoFocusTimeoutHandle = r0
        Lb:
            return
    }

    private void completeCancelFuture() {
            r2 = this;
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.lang.Void> r0 = r2.mRunningCancelCompleter
            if (r0 == 0) goto La
            r1 = 0
            r0.set(r1)
            r2.mRunningCancelCompleter = r1
        La:
            return
    }

    public static /* synthetic */ void d(androidx.camera.camera2.internal.FocusMeteringControl r2, long r3) {
            java.util.concurrent.Executor r0 = r2.mExecutor
            androidx.camera.camera2.internal.t1 r1 = new androidx.camera.camera2.internal.t1
            r1.<init>(r2, r3)
            r0.execute(r1)
            return
    }

    private void disableAutoCancel() {
            r2 = this;
            java.util.concurrent.ScheduledFuture<?> r0 = r2.mAutoCancelHandle
            if (r0 == 0) goto Lb
            r1 = 1
            r0.cancel(r1)
            r0 = 0
            r2.mAutoCancelHandle = r0
        Lb:
            return
    }

    public static /* synthetic */ void e(androidx.camera.camera2.internal.FocusMeteringControl r3, long r4) {
            long r0 = r3.mFocusTimeoutCounter
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto L9
            r3.cancelFocusAndMeteringWithoutAsyncResult()
        L9:
            return
    }

    private void executeMeteringAction(@androidx.annotation.NonNull android.hardware.camera2.params.MeteringRectangle[] r3, @androidx.annotation.NonNull android.hardware.camera2.params.MeteringRectangle[] r4, @androidx.annotation.NonNull android.hardware.camera2.params.MeteringRectangle[] r5, androidx.camera.core.FocusMeteringAction r6, long r7) {
            r2 = this;
            androidx.camera.camera2.internal.Camera2CameraControlImpl r0 = r2.mCameraControl
            androidx.camera.camera2.internal.Camera2CameraControlImpl$CaptureResultListener r1 = r2.mSessionListenerForFocus
            r0.removeCaptureResultListener(r1)
            r2.disableAutoCancel()
            r2.clearAutoFocusTimeoutHandle()
            r2.mAfRects = r3
            r2.mAeRects = r4
            r2.mAwbRects = r5
            boolean r3 = r2.shouldTriggerAF()
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L2c
            r2.mIsInAfAutoMode = r4
            r2.mIsAutoFocusCompleted = r5
            r2.mIsFocusSuccessful = r5
            androidx.camera.camera2.internal.Camera2CameraControlImpl r3 = r2.mCameraControl
            long r0 = r3.updateSessionConfigSynchronous()
            r3 = 0
            r2.triggerAf(r3, r4)
            goto L38
        L2c:
            r2.mIsInAfAutoMode = r5
            r2.mIsAutoFocusCompleted = r4
            r2.mIsFocusSuccessful = r5
            androidx.camera.camera2.internal.Camera2CameraControlImpl r3 = r2.mCameraControl
            long r0 = r3.updateSessionConfigSynchronous()
        L38:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r2.mCurrentAfState = r3
            boolean r3 = r2.isAfModeSupported()
            androidx.camera.camera2.internal.o1 r4 = new androidx.camera.camera2.internal.o1
            r4.<init>(r2, r3, r0)
            r2.mSessionListenerForFocus = r4
            androidx.camera.camera2.internal.Camera2CameraControlImpl r3 = r2.mCameraControl
            r3.addCaptureResultListener(r4)
            long r3 = r2.mFocusTimeoutCounter
            r0 = 1
            long r3 = r3 + r0
            r2.mFocusTimeoutCounter = r3
            androidx.camera.camera2.internal.p1 r5 = new androidx.camera.camera2.internal.p1
            r5.<init>(r2, r3)
            java.util.concurrent.ScheduledExecutorService r0 = r2.mScheduler
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.ScheduledFuture r5 = r0.schedule(r5, r7, r1)
            r2.mAutoFocusTimeoutHandle = r5
            boolean r5 = r6.isAutoCancelEnabled()
            if (r5 == 0) goto L7b
            androidx.camera.camera2.internal.q1 r5 = new androidx.camera.camera2.internal.q1
            r5.<init>(r2, r3)
            java.util.concurrent.ScheduledExecutorService r3 = r2.mScheduler
            long r6 = r6.getAutoCancelDurationInMillis()
            java.util.concurrent.ScheduledFuture r3 = r3.schedule(r5, r6, r1)
            r2.mAutoCancelHandle = r3
        L7b:
            return
    }

    public static /* synthetic */ void f(androidx.camera.camera2.internal.FocusMeteringControl r0, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r1) {
            r0.cancelFocusAndMeteringInternal(r1)
            return
    }

    private void failActionFuture(java.lang.String r3) {
            r2 = this;
            androidx.camera.camera2.internal.Camera2CameraControlImpl r0 = r2.mCameraControl
            androidx.camera.camera2.internal.Camera2CameraControlImpl$CaptureResultListener r1 = r2.mSessionListenerForFocus
            r0.removeCaptureResultListener(r1)
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<androidx.camera.core.FocusMeteringResult> r0 = r2.mRunningActionCompleter
            if (r0 == 0) goto L16
            androidx.camera.core.CameraControl$OperationCanceledException r1 = new androidx.camera.core.CameraControl$OperationCanceledException
            r1.<init>(r3)
            r0.setException(r1)
            r3 = 0
            r2.mRunningActionCompleter = r3
        L16:
            return
    }

    private void failCancelFuture(java.lang.String r3) {
            r2 = this;
            androidx.camera.camera2.internal.Camera2CameraControlImpl r0 = r2.mCameraControl
            androidx.camera.camera2.internal.Camera2CameraControlImpl$CaptureResultListener r1 = r2.mSessionListenerForCancel
            r0.removeCaptureResultListener(r1)
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.lang.Void> r0 = r2.mRunningCancelCompleter
            if (r0 == 0) goto L16
            androidx.camera.core.CameraControl$OperationCanceledException r1 = new androidx.camera.core.CameraControl$OperationCanceledException
            r1.<init>(r3)
            r0.setException(r1)
            r3 = 0
            r2.mRunningCancelCompleter = r3
        L16:
            return
    }

    public static /* synthetic */ void g(androidx.camera.camera2.internal.FocusMeteringControl r3, long r4) {
            long r0 = r3.mFocusTimeoutCounter
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto Lc
            r4 = 0
            r3.mIsFocusSuccessful = r4
            r3.completeActionFuture(r4)
        Lc:
            return
    }

    private android.util.Rational getDefaultAspectRatio() {
            r3 = this;
            android.util.Rational r0 = r3.mPreviewAspectRatio
            if (r0 == 0) goto L7
            android.util.Rational r0 = r3.mPreviewAspectRatio
            return r0
        L7:
            androidx.camera.camera2.internal.Camera2CameraControlImpl r0 = r3.mCameraControl
            android.graphics.Rect r0 = r0.getCropSensorRegion()
            android.util.Rational r1 = new android.util.Rational
            int r2 = r0.width()
            int r0 = r0.height()
            r1.<init>(r2, r0)
            return r1
    }

    private static android.graphics.PointF getFovAdjustedPoint(@androidx.annotation.NonNull androidx.camera.core.MeteringPoint r6, @androidx.annotation.NonNull android.util.Rational r7, @androidx.annotation.NonNull android.util.Rational r8, int r9, androidx.camera.camera2.internal.compat.workaround.MeteringRegionCorrection r10) {
            android.util.Rational r0 = r6.getSurfaceAspectRatio()
            if (r0 == 0) goto La
            android.util.Rational r8 = r6.getSurfaceAspectRatio()
        La:
            android.graphics.PointF r6 = r10.getCorrectedPoint(r6, r9)
            boolean r9 = r8.equals(r7)
            if (r9 != 0) goto L4d
            int r9 = r8.compareTo(r7)
            r10 = 1065353216(0x3f800000, float:1.0)
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r9 <= 0) goto L37
            double r8 = r8.doubleValue()
            double r4 = r7.doubleValue()
            double r8 = r8 / r4
            float r7 = (float) r8
            double r8 = (double) r7
            double r8 = r8 - r2
            double r8 = r8 / r0
            float r8 = (float) r8
            float r9 = r6.y
            float r8 = r8 + r9
            float r10 = r10 / r7
            float r8 = r8 * r10
            r6.y = r8
            return r6
        L37:
            double r4 = r7.doubleValue()
            double r7 = r8.doubleValue()
            double r4 = r4 / r7
            float r7 = (float) r4
            double r8 = (double) r7
            double r8 = r8 - r2
            double r8 = r8 / r0
            float r8 = (float) r8
            float r9 = r6.x
            float r8 = r8 + r9
            float r10 = r10 / r7
            float r8 = r8 * r10
            r6.x = r8
        L4d:
            return r6
    }

    private static android.hardware.camera2.params.MeteringRectangle getMeteringRect(androidx.camera.core.MeteringPoint r5, android.graphics.PointF r6, android.graphics.Rect r7) {
            int r0 = r7.left
            float r0 = (float) r0
            float r1 = r6.x
            int r2 = r7.width()
            float r2 = (float) r2
            float r1 = r1 * r2
            float r0 = r0 + r1
            int r0 = (int) r0
            int r1 = r7.top
            float r1 = (float) r1
            float r6 = r6.y
            int r2 = r7.height()
            float r2 = (float) r2
            float r6 = r6 * r2
            float r1 = r1 + r6
            int r6 = (int) r1
            float r1 = r5.getSize()
            int r2 = r7.width()
            float r2 = (float) r2
            float r1 = r1 * r2
            int r1 = (int) r1
            float r5 = r5.getSize()
            int r2 = r7.height()
            float r2 = (float) r2
            float r5 = r5 * r2
            int r5 = (int) r5
            android.graphics.Rect r2 = new android.graphics.Rect
            int r1 = r1 / 2
            int r3 = r0 - r1
            int r5 = r5 / 2
            int r4 = r6 - r5
            int r0 = r0 + r1
            int r6 = r6 + r5
            r2.<init>(r3, r4, r0, r6)
            int r5 = r2.left
            int r6 = r7.right
            int r0 = r7.left
            int r5 = rangeLimit(r5, r6, r0)
            r2.left = r5
            int r5 = r2.right
            int r6 = r7.right
            int r0 = r7.left
            int r5 = rangeLimit(r5, r6, r0)
            r2.right = r5
            int r5 = r2.top
            int r6 = r7.bottom
            int r0 = r7.top
            int r5 = rangeLimit(r5, r6, r0)
            r2.top = r5
            int r5 = r2.bottom
            int r6 = r7.bottom
            int r7 = r7.top
            int r5 = rangeLimit(r5, r6, r7)
            r2.bottom = r5
            android.hardware.camera2.params.MeteringRectangle r5 = new android.hardware.camera2.params.MeteringRectangle
            r6 = 1000(0x3e8, float:1.401E-42)
            r5.<init>(r2, r6)
            return r5
    }

    @androidx.annotation.NonNull
    private java.util.List<android.hardware.camera2.params.MeteringRectangle> getMeteringRectangles(@androidx.annotation.NonNull java.util.List<androidx.camera.core.MeteringPoint> r5, int r6, @androidx.annotation.NonNull android.util.Rational r7, @androidx.annotation.NonNull android.graphics.Rect r8, int r9) {
            r4 = this;
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L59
            if (r6 != 0) goto L9
            goto L59
        L9:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.util.Rational r1 = new android.util.Rational
            int r2 = r8.width()
            int r3 = r8.height()
            r1.<init>(r2, r3)
            java.util.Iterator r5 = r5.iterator()
        L1f:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L54
            java.lang.Object r2 = r5.next()
            androidx.camera.core.MeteringPoint r2 = (androidx.camera.core.MeteringPoint) r2
            int r3 = r0.size()
            if (r3 != r6) goto L32
            goto L54
        L32:
            boolean r3 = isValid(r2)
            if (r3 != 0) goto L39
            goto L1f
        L39:
            androidx.camera.camera2.internal.compat.workaround.MeteringRegionCorrection r3 = r4.mMeteringRegionCorrection
            android.graphics.PointF r3 = getFovAdjustedPoint(r2, r1, r7, r9, r3)
            android.hardware.camera2.params.MeteringRectangle r2 = getMeteringRect(r2, r3, r8)
            int r3 = r2.getWidth()
            if (r3 == 0) goto L1f
            int r3 = r2.getHeight()
            if (r3 != 0) goto L50
            goto L1f
        L50:
            r0.add(r2)
            goto L1f
        L54:
            java.util.List r5 = java.util.Collections.unmodifiableList(r0)
            return r5
        L59:
            java.util.List r5 = java.util.Collections.EMPTY_LIST
            return r5
    }

    public static /* synthetic */ java.lang.Object h(androidx.camera.camera2.internal.FocusMeteringControl r2, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r3) {
            java.util.concurrent.Executor r0 = r2.mExecutor
            androidx.camera.camera2.internal.m1 r1 = new androidx.camera.camera2.internal.m1
            r1.<init>(r2, r3)
            r0.execute(r1)
            java.lang.String r2 = "cancelFocusAndMetering"
            return r2
    }

    public static /* synthetic */ void i(androidx.camera.camera2.internal.FocusMeteringControl r2, long r3) {
            java.util.concurrent.Executor r0 = r2.mExecutor
            androidx.camera.camera2.internal.r1 r1 = new androidx.camera.camera2.internal.r1
            r1.<init>(r2, r3)
            r0.execute(r1)
            return
    }

    private boolean isAfModeSupported() {
            r2 = this;
            androidx.camera.camera2.internal.Camera2CameraControlImpl r0 = r2.mCameraControl
            r1 = 1
            int r0 = r0.getSupportedAfMode(r1)
            if (r0 != r1) goto La
            return r1
        La:
            r0 = 0
            return r0
    }

    private static boolean isValid(@androidx.annotation.NonNull androidx.camera.core.MeteringPoint r3) {
            float r0 = r3.getX()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L25
            float r0 = r3.getX()
            r2 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L25
            float r0 = r3.getY()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L25
            float r3 = r3.getY()
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 > 0) goto L25
            r3 = 1
            return r3
        L25:
            r3 = 0
            return r3
    }

    public static /* synthetic */ void j(androidx.camera.camera2.internal.FocusMeteringControl r0, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r1, androidx.camera.core.FocusMeteringAction r2, long r3) {
            r0.startFocusAndMeteringInternal(r1, r2, r3)
            return
    }

    private static int rangeLimit(int r0, int r1, int r2) {
            int r0 = java.lang.Math.max(r0, r2)
            int r0 = java.lang.Math.min(r0, r1)
            return r0
    }

    private boolean shouldTriggerAF() {
            r1 = this;
            android.hardware.camera2.params.MeteringRectangle[] r0 = r1.mAfRects
            int r0 = r0.length
            if (r0 <= 0) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    void addFocusMeteringOptions(@androidx.annotation.NonNull androidx.camera.camera2.impl.Camera2ImplConfig.Builder r4) {
            r3 = this;
            boolean r0 = r3.mIsInAfAutoMode
            if (r0 == 0) goto L6
            r0 = 1
            goto La
        L6:
            int r0 = r3.getDefaultAfMode()
        La:
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE
            androidx.camera.camera2.internal.Camera2CameraControlImpl r2 = r3.mCameraControl
            int r0 = r2.getSupportedAfMode(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.setCaptureRequestOption(r1, r0)
            android.hardware.camera2.params.MeteringRectangle[] r0 = r3.mAfRects
            int r1 = r0.length
            if (r1 == 0) goto L23
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AF_REGIONS
            r4.setCaptureRequestOption(r1, r0)
        L23:
            android.hardware.camera2.params.MeteringRectangle[] r0 = r3.mAeRects
            int r1 = r0.length
            if (r1 == 0) goto L2d
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AE_REGIONS
            r4.setCaptureRequestOption(r1, r0)
        L2d:
            android.hardware.camera2.params.MeteringRectangle[] r0 = r3.mAwbRects
            int r1 = r0.length
            if (r1 == 0) goto L37
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AWB_REGIONS
            r4.setCaptureRequestOption(r1, r0)
        L37:
            return
    }

    void cancelAfAeTrigger(boolean r5, boolean r6) {
            r4 = this;
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r1 = r4.mIsActive
            if (r1 != 0) goto La
            return
        La:
            androidx.camera.core.impl.CaptureConfig$Builder r1 = new androidx.camera.core.impl.CaptureConfig$Builder
            r1.<init>()
            r2 = 1
            r1.setUseRepeatingSurface(r2)
            int r2 = r4.mTemplate
            r1.setTemplateType(r2)
            androidx.camera.camera2.impl.Camera2ImplConfig$Builder r2 = new androidx.camera.camera2.impl.Camera2ImplConfig$Builder
            r2.<init>()
            if (r5 == 0) goto L24
            android.hardware.camera2.CaptureRequest$Key r5 = android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER
            r2.setCaptureRequestOption(r5, r0)
        L24:
            int r5 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r5 < r3) goto L31
            if (r6 == 0) goto L31
            android.hardware.camera2.CaptureRequest$Key r5 = android.hardware.camera2.CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER
            r2.setCaptureRequestOption(r5, r0)
        L31:
            androidx.camera.camera2.impl.Camera2ImplConfig r5 = r2.build()
            r1.addImplementationOptions(r5)
            androidx.camera.camera2.internal.Camera2CameraControlImpl r5 = r4.mCameraControl
            androidx.camera.core.impl.CaptureConfig r6 = r1.build()
            java.util.List r6 = java.util.Collections.singletonList(r6)
            r5.submitCaptureRequestsInternal(r6)
            return
    }

    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> cancelFocusAndMetering() {
            r1 = this;
            androidx.camera.camera2.internal.s1 r0 = new androidx.camera.camera2.internal.s1
            r0.<init>(r1)
            com.google.common.util.concurrent.ListenableFuture r0 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r0)
            return r0
    }

    void cancelFocusAndMeteringInternal(@androidx.annotation.Nullable androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> r4) {
            r3 = this;
            java.lang.String r0 = "Cancelled by another cancelFocusAndMetering()"
            r3.failCancelFuture(r0)
            java.lang.String r0 = "Cancelled by cancelFocusAndMetering()"
            r3.failActionFuture(r0)
            r3.mRunningCancelCompleter = r4
            r3.disableAutoCancel()
            r3.clearAutoFocusTimeoutHandle()
            boolean r4 = r3.shouldTriggerAF()
            r0 = 0
            if (r4 == 0) goto L1d
            r4 = 1
            r3.cancelAfAeTrigger(r4, r0)
        L1d:
            android.hardware.camera2.params.MeteringRectangle[] r4 = androidx.camera.camera2.internal.FocusMeteringControl.EMPTY_RECTANGLES
            r3.mAfRects = r4
            r3.mAeRects = r4
            r3.mAwbRects = r4
            r3.mIsInAfAutoMode = r0
            androidx.camera.camera2.internal.Camera2CameraControlImpl r4 = r3.mCameraControl
            long r0 = r4.updateSessionConfigSynchronous()
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.lang.Void> r4 = r3.mRunningCancelCompleter
            if (r4 == 0) goto L47
            androidx.camera.camera2.internal.Camera2CameraControlImpl r4 = r3.mCameraControl
            int r2 = r3.getDefaultAfMode()
            int r4 = r4.getSupportedAfMode(r2)
            androidx.camera.camera2.internal.n1 r2 = new androidx.camera.camera2.internal.n1
            r2.<init>(r3, r4, r0)
            r3.mSessionListenerForCancel = r2
            androidx.camera.camera2.internal.Camera2CameraControlImpl r4 = r3.mCameraControl
            r4.addCaptureResultListener(r2)
        L47:
            return
    }

    void cancelFocusAndMeteringWithoutAsyncResult() {
            r1 = this;
            r0 = 0
            r1.cancelFocusAndMeteringInternal(r0)
            return
    }

    void completeActionFuture(boolean r2) {
            r1 = this;
            r1.clearAutoFocusTimeoutHandle()
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<androidx.camera.core.FocusMeteringResult> r0 = r1.mRunningActionCompleter
            if (r0 == 0) goto L11
            androidx.camera.core.FocusMeteringResult r2 = androidx.camera.core.FocusMeteringResult.create(r2)
            r0.set(r2)
            r2 = 0
            r1.mRunningActionCompleter = r2
        L11:
            return
    }

    @androidx.annotation.VisibleForTesting
    int getDefaultAfMode() {
            r2 = this;
            int r0 = r2.mTemplate
            r1 = 3
            if (r0 == r1) goto L7
            r0 = 4
            return r0
        L7:
            return r1
    }

    boolean isFocusMeteringSupported(@androidx.annotation.NonNull androidx.camera.core.FocusMeteringAction r9) {
            r8 = this;
            androidx.camera.camera2.internal.Camera2CameraControlImpl r0 = r8.mCameraControl
            android.graphics.Rect r5 = r0.getCropSensorRegion()
            android.util.Rational r4 = r8.getDefaultAspectRatio()
            java.util.List r2 = r9.getMeteringPointsAf()
            androidx.camera.camera2.internal.Camera2CameraControlImpl r0 = r8.mCameraControl
            int r3 = r0.getMaxAfRegionCount()
            r6 = 1
            r1 = r8
            java.util.List r0 = r1.getMeteringRectangles(r2, r3, r4, r5, r6)
            java.util.List r2 = r9.getMeteringPointsAe()
            androidx.camera.camera2.internal.Camera2CameraControlImpl r3 = r1.mCameraControl
            int r3 = r3.getMaxAeRegionCount()
            r6 = 2
            java.util.List r7 = r1.getMeteringRectangles(r2, r3, r4, r5, r6)
            java.util.List r2 = r9.getMeteringPointsAwb()
            androidx.camera.camera2.internal.Camera2CameraControlImpl r9 = r1.mCameraControl
            int r3 = r9.getMaxAwbRegionCount()
            r6 = 4
            java.util.List r9 = r1.getMeteringRectangles(r2, r3, r4, r5, r6)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L4d
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L4d
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L4b
            goto L4d
        L4b:
            r9 = 0
            return r9
        L4d:
            r9 = 1
            return r9
    }

    void setActive(boolean r2) {
            r1 = this;
            boolean r0 = r1.mIsActive
            if (r2 != r0) goto L5
            goto Le
        L5:
            r1.mIsActive = r2
            boolean r2 = r1.mIsActive
            if (r2 != 0) goto Le
            r1.cancelFocusAndMeteringWithoutAsyncResult()
        Le:
            return
    }

    public void setPreviewAspectRatio(@androidx.annotation.Nullable android.util.Rational r1) {
            r0 = this;
            r0.mPreviewAspectRatio = r1
            return
    }

    void setTemplate(int r1) {
            r0 = this;
            r0.mTemplate = r1
            return
    }

    @androidx.annotation.NonNull
    com.google.common.util.concurrent.ListenableFuture<androidx.camera.core.FocusMeteringResult> startFocusAndMetering(@androidx.annotation.NonNull androidx.camera.core.FocusMeteringAction r3) {
            r2 = this;
            r0 = 5000(0x1388, double:2.4703E-320)
            com.google.common.util.concurrent.ListenableFuture r3 = r2.startFocusAndMetering(r3, r0)
            return r3
    }

    @androidx.annotation.NonNull
    @androidx.annotation.VisibleForTesting
    com.google.common.util.concurrent.ListenableFuture<androidx.camera.core.FocusMeteringResult> startFocusAndMetering(@androidx.annotation.NonNull androidx.camera.core.FocusMeteringAction r2, long r3) {
            r1 = this;
            androidx.camera.camera2.internal.l1 r0 = new androidx.camera.camera2.internal.l1
            r0.<init>(r1, r2, r3)
            com.google.common.util.concurrent.ListenableFuture r2 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r0)
            return r2
    }

    void startFocusAndMeteringInternal(@androidx.annotation.NonNull androidx.concurrent.futures.CallbackToFutureAdapter.Completer<androidx.camera.core.FocusMeteringResult> r10, @androidx.annotation.NonNull androidx.camera.core.FocusMeteringAction r11, long r12) {
            r9 = this;
            boolean r1 = r9.mIsActive
            if (r1 != 0) goto Lf
            androidx.camera.core.CameraControl$OperationCanceledException r1 = new androidx.camera.core.CameraControl$OperationCanceledException
            java.lang.String r2 = "Camera is not active."
            r1.<init>(r2)
            r10.setException(r1)
            return
        Lf:
            androidx.camera.camera2.internal.Camera2CameraControlImpl r1 = r9.mCameraControl
            android.graphics.Rect r4 = r1.getCropSensorRegion()
            android.util.Rational r3 = r9.getDefaultAspectRatio()
            java.util.List r1 = r11.getMeteringPointsAf()
            androidx.camera.camera2.internal.Camera2CameraControlImpl r2 = r9.mCameraControl
            int r2 = r2.getMaxAfRegionCount()
            r5 = 1
            r0 = r9
            java.util.List r7 = r0.getMeteringRectangles(r1, r2, r3, r4, r5)
            java.util.List r1 = r11.getMeteringPointsAe()
            androidx.camera.camera2.internal.Camera2CameraControlImpl r2 = r9.mCameraControl
            int r2 = r2.getMaxAeRegionCount()
            r5 = 2
            java.util.List r8 = r0.getMeteringRectangles(r1, r2, r3, r4, r5)
            java.util.List r1 = r11.getMeteringPointsAwb()
            androidx.camera.camera2.internal.Camera2CameraControlImpl r2 = r9.mCameraControl
            int r2 = r2.getMaxAwbRegionCount()
            r5 = 4
            java.util.List r1 = r0.getMeteringRectangles(r1, r2, r3, r4, r5)
            boolean r2 = r7.isEmpty()
            if (r2 == 0) goto L64
            boolean r2 = r8.isEmpty()
            if (r2 == 0) goto L64
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L64
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "None of the specified AF/AE/AWB MeteringPoints is supported on this camera."
            r1.<init>(r2)
            r10.setException(r1)
            return
        L64:
            java.lang.String r2 = "Cancelled by another startFocusAndMetering()"
            r9.failActionFuture(r2)
            r9.failCancelFuture(r2)
            r9.disableAutoCancel()
            r9.mRunningActionCompleter = r10
            android.hardware.camera2.params.MeteringRectangle[] r2 = androidx.camera.camera2.internal.FocusMeteringControl.EMPTY_RECTANGLES
            java.lang.Object[] r3 = r7.toArray(r2)
            android.hardware.camera2.params.MeteringRectangle[] r3 = (android.hardware.camera2.params.MeteringRectangle[]) r3
            java.lang.Object[] r4 = r8.toArray(r2)
            android.hardware.camera2.params.MeteringRectangle[] r4 = (android.hardware.camera2.params.MeteringRectangle[]) r4
            java.lang.Object[] r1 = r1.toArray(r2)
            android.hardware.camera2.params.MeteringRectangle[] r1 = (android.hardware.camera2.params.MeteringRectangle[]) r1
            r0 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r5 = r12
            r2 = r4
            r4 = r11
            r0.executeMeteringAction(r1, r2, r3, r4, r5)
            return
    }

    void triggerAePrecapture(@androidx.annotation.Nullable androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> r5) {
            r4 = this;
            boolean r0 = r4.mIsActive
            if (r0 != 0) goto L11
            if (r5 == 0) goto L10
            androidx.camera.core.CameraControl$OperationCanceledException r0 = new androidx.camera.core.CameraControl$OperationCanceledException
            java.lang.String r1 = "Camera is not active."
            r0.<init>(r1)
            r5.setException(r0)
        L10:
            return
        L11:
            androidx.camera.core.impl.CaptureConfig$Builder r0 = new androidx.camera.core.impl.CaptureConfig$Builder
            r0.<init>()
            int r1 = r4.mTemplate
            r0.setTemplateType(r1)
            r1 = 1
            r0.setUseRepeatingSurface(r1)
            androidx.camera.camera2.impl.Camera2ImplConfig$Builder r2 = new androidx.camera.camera2.impl.Camera2ImplConfig$Builder
            r2.<init>()
            android.hardware.camera2.CaptureRequest$Key r3 = android.hardware.camera2.CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.setCaptureRequestOption(r3, r1)
            androidx.camera.camera2.impl.Camera2ImplConfig r1 = r2.build()
            r0.addImplementationOptions(r1)
            androidx.camera.camera2.internal.FocusMeteringControl$2 r1 = new androidx.camera.camera2.internal.FocusMeteringControl$2
            r1.<init>(r4, r5)
            r0.addCameraCaptureCallback(r1)
            androidx.camera.camera2.internal.Camera2CameraControlImpl r5 = r4.mCameraControl
            androidx.camera.core.impl.CaptureConfig r0 = r0.build()
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r5.submitCaptureRequestsInternal(r0)
            return
    }

    void triggerAf(@androidx.annotation.Nullable androidx.concurrent.futures.CallbackToFutureAdapter.Completer<androidx.camera.core.impl.CameraCaptureResult> r6, boolean r7) {
            r5 = this;
            boolean r0 = r5.mIsActive
            if (r0 != 0) goto L11
            if (r6 == 0) goto L10
            androidx.camera.core.CameraControl$OperationCanceledException r7 = new androidx.camera.core.CameraControl$OperationCanceledException
            java.lang.String r0 = "Camera is not active."
            r7.<init>(r0)
            r6.setException(r7)
        L10:
            return
        L11:
            androidx.camera.core.impl.CaptureConfig$Builder r0 = new androidx.camera.core.impl.CaptureConfig$Builder
            r0.<init>()
            int r1 = r5.mTemplate
            r0.setTemplateType(r1)
            r1 = 1
            r0.setUseRepeatingSurface(r1)
            androidx.camera.camera2.impl.Camera2ImplConfig$Builder r2 = new androidx.camera.camera2.impl.Camera2ImplConfig$Builder
            r2.<init>()
            android.hardware.camera2.CaptureRequest$Key r3 = android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r2.setCaptureRequestOption(r3, r4)
            if (r7 == 0) goto L3e
            android.hardware.camera2.CaptureRequest$Key r7 = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE
            androidx.camera.camera2.internal.Camera2CameraControlImpl r3 = r5.mCameraControl
            int r1 = r3.getSupportedAeMode(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.setCaptureRequestOption(r7, r1)
        L3e:
            androidx.camera.camera2.impl.Camera2ImplConfig r7 = r2.build()
            r0.addImplementationOptions(r7)
            androidx.camera.camera2.internal.FocusMeteringControl$1 r7 = new androidx.camera.camera2.internal.FocusMeteringControl$1
            r7.<init>(r5, r6)
            r0.addCameraCaptureCallback(r7)
            androidx.camera.camera2.internal.Camera2CameraControlImpl r6 = r5.mCameraControl
            androidx.camera.core.impl.CaptureConfig r7 = r0.build()
            java.util.List r7 = java.util.Collections.singletonList(r7)
            r6.submitCaptureRequestsInternal(r7)
            return
    }
}
