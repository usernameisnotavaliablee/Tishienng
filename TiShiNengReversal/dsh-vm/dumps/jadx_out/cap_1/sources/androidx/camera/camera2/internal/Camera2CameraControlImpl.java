package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.OptIn(markerClass = {androidx.camera.camera2.interop.ExperimentalCamera2Interop.class})
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class Camera2CameraControlImpl implements androidx.camera.core.impl.CameraControlInternal {
    private static final int DEFAULT_TEMPLATE = 1;
    private static final java.lang.String TAG = "Camera2CameraControlImp";
    static final java.lang.String TAG_SESSION_UPDATE_ID = "CameraControlSessionUpdateId";
    private final androidx.camera.camera2.internal.compat.workaround.AeFpsRange mAeFpsRange;
    private final androidx.camera.camera2.internal.compat.workaround.AutoFlashAEModeDisabler mAutoFlashAEModeDisabler;
    private final androidx.camera.camera2.interop.Camera2CameraControl mCamera2CameraControl;
    private final androidx.camera.camera2.internal.Camera2CapturePipeline mCamera2CapturePipeline;
    private final androidx.camera.camera2.internal.Camera2CameraControlImpl.CameraCaptureCallbackSet mCameraCaptureCallbackSet;
    private final androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat mCameraCharacteristics;
    private final androidx.camera.core.impl.CameraControlInternal.ControlUpdateCallback mControlUpdateCallback;
    private long mCurrentSessionUpdateId;
    final java.util.concurrent.Executor mExecutor;
    private final androidx.camera.camera2.internal.ExposureControl mExposureControl;
    private volatile int mFlashMode;

    @androidx.annotation.NonNull
    private volatile com.google.common.util.concurrent.ListenableFuture<java.lang.Void> mFlashModeChangeSessionUpdateFuture;
    private final androidx.camera.camera2.internal.FocusMeteringControl mFocusMeteringControl;
    private volatile boolean mIsTorchOn;
    private final java.lang.Object mLock;
    private final java.util.concurrent.atomic.AtomicLong mNextSessionUpdateId;

    @androidx.annotation.VisibleForTesting
    final androidx.camera.camera2.internal.Camera2CameraControlImpl.CameraControlSessionCallback mSessionCallback;
    private final androidx.camera.core.impl.SessionConfig.Builder mSessionConfigBuilder;
    private int mTemplate;
    private final androidx.camera.camera2.internal.TorchControl mTorchControl;

    @androidx.annotation.GuardedBy("mLock")
    private int mUseCount;
    private final androidx.camera.camera2.internal.ZoomControl mZoomControl;

    @androidx.annotation.VisibleForTesting
    androidx.camera.camera2.internal.ZslControl mZslControl;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    static final class CameraCaptureCallbackSet extends androidx.camera.core.impl.CameraCaptureCallback {
        java.util.Map<androidx.camera.core.impl.CameraCaptureCallback, java.util.concurrent.Executor> mCallbackExecutors;
        java.util.Set<androidx.camera.core.impl.CameraCaptureCallback> mCallbacks;

        CameraCaptureCallbackSet() {
                r1 = this;
                r1.<init>()
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r1.mCallbacks = r0
                android.util.ArrayMap r0 = new android.util.ArrayMap
                r0.<init>()
                r1.mCallbackExecutors = r0
                return
        }

        public static /* synthetic */ void a(androidx.camera.core.impl.CameraCaptureCallback r0) {
                r0.onCaptureCancelled()
                return
        }

        public static /* synthetic */ void b(androidx.camera.core.impl.CameraCaptureCallback r0, androidx.camera.core.impl.CameraCaptureFailure r1) {
                r0.onCaptureFailed(r1)
                return
        }

        public static /* synthetic */ void c(androidx.camera.core.impl.CameraCaptureCallback r0, androidx.camera.core.impl.CameraCaptureResult r1) {
                r0.onCaptureCompleted(r1)
                return
        }

        void addCaptureCallback(@androidx.annotation.NonNull java.util.concurrent.Executor r2, @androidx.annotation.NonNull androidx.camera.core.impl.CameraCaptureCallback r3) {
                r1 = this;
                java.util.Set<androidx.camera.core.impl.CameraCaptureCallback> r0 = r1.mCallbacks
                r0.add(r3)
                java.util.Map<androidx.camera.core.impl.CameraCaptureCallback, java.util.concurrent.Executor> r0 = r1.mCallbackExecutors
                r0.put(r3, r2)
                return
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureCancelled() {
                r4 = this;
                java.util.Set<androidx.camera.core.impl.CameraCaptureCallback> r0 = r4.mCallbacks
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L2c
                java.lang.Object r1 = r0.next()
                androidx.camera.core.impl.CameraCaptureCallback r1 = (androidx.camera.core.impl.CameraCaptureCallback) r1
                java.util.Map<androidx.camera.core.impl.CameraCaptureCallback, java.util.concurrent.Executor> r2 = r4.mCallbackExecutors     // Catch: java.util.concurrent.RejectedExecutionException -> L23
                java.lang.Object r2 = r2.get(r1)     // Catch: java.util.concurrent.RejectedExecutionException -> L23
                java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2     // Catch: java.util.concurrent.RejectedExecutionException -> L23
                androidx.camera.camera2.internal.q r3 = new androidx.camera.camera2.internal.q     // Catch: java.util.concurrent.RejectedExecutionException -> L23
                r3.<init>(r1)     // Catch: java.util.concurrent.RejectedExecutionException -> L23
                r2.execute(r3)     // Catch: java.util.concurrent.RejectedExecutionException -> L23
                goto L6
            L23:
                r1 = move-exception
                java.lang.String r2 = "Camera2CameraControlImp"
                java.lang.String r3 = "Executor rejected to invoke onCaptureCancelled."
                androidx.camera.core.Logger.e(r2, r3, r1)
                goto L6
            L2c:
                return
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureCompleted(@androidx.annotation.NonNull androidx.camera.core.impl.CameraCaptureResult r5) {
                r4 = this;
                java.util.Set<androidx.camera.core.impl.CameraCaptureCallback> r0 = r4.mCallbacks
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L2c
                java.lang.Object r1 = r0.next()
                androidx.camera.core.impl.CameraCaptureCallback r1 = (androidx.camera.core.impl.CameraCaptureCallback) r1
                java.util.Map<androidx.camera.core.impl.CameraCaptureCallback, java.util.concurrent.Executor> r2 = r4.mCallbackExecutors     // Catch: java.util.concurrent.RejectedExecutionException -> L23
                java.lang.Object r2 = r2.get(r1)     // Catch: java.util.concurrent.RejectedExecutionException -> L23
                java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2     // Catch: java.util.concurrent.RejectedExecutionException -> L23
                androidx.camera.camera2.internal.o r3 = new androidx.camera.camera2.internal.o     // Catch: java.util.concurrent.RejectedExecutionException -> L23
                r3.<init>(r1, r5)     // Catch: java.util.concurrent.RejectedExecutionException -> L23
                r2.execute(r3)     // Catch: java.util.concurrent.RejectedExecutionException -> L23
                goto L6
            L23:
                r1 = move-exception
                java.lang.String r2 = "Camera2CameraControlImp"
                java.lang.String r3 = "Executor rejected to invoke onCaptureCompleted."
                androidx.camera.core.Logger.e(r2, r3, r1)
                goto L6
            L2c:
                return
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureFailed(@androidx.annotation.NonNull androidx.camera.core.impl.CameraCaptureFailure r5) {
                r4 = this;
                java.util.Set<androidx.camera.core.impl.CameraCaptureCallback> r0 = r4.mCallbacks
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L2c
                java.lang.Object r1 = r0.next()
                androidx.camera.core.impl.CameraCaptureCallback r1 = (androidx.camera.core.impl.CameraCaptureCallback) r1
                java.util.Map<androidx.camera.core.impl.CameraCaptureCallback, java.util.concurrent.Executor> r2 = r4.mCallbackExecutors     // Catch: java.util.concurrent.RejectedExecutionException -> L23
                java.lang.Object r2 = r2.get(r1)     // Catch: java.util.concurrent.RejectedExecutionException -> L23
                java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2     // Catch: java.util.concurrent.RejectedExecutionException -> L23
                androidx.camera.camera2.internal.p r3 = new androidx.camera.camera2.internal.p     // Catch: java.util.concurrent.RejectedExecutionException -> L23
                r3.<init>(r1, r5)     // Catch: java.util.concurrent.RejectedExecutionException -> L23
                r2.execute(r3)     // Catch: java.util.concurrent.RejectedExecutionException -> L23
                goto L6
            L23:
                r1 = move-exception
                java.lang.String r2 = "Camera2CameraControlImp"
                java.lang.String r3 = "Executor rejected to invoke onCaptureFailed."
                androidx.camera.core.Logger.e(r2, r3, r1)
                goto L6
            L2c:
                return
        }

        void removeCaptureCallback(@androidx.annotation.NonNull androidx.camera.core.impl.CameraCaptureCallback r2) {
                r1 = this;
                java.util.Set<androidx.camera.core.impl.CameraCaptureCallback> r0 = r1.mCallbacks
                r0.remove(r2)
                java.util.Map<androidx.camera.core.impl.CameraCaptureCallback, java.util.concurrent.Executor> r0 = r1.mCallbackExecutors
                r0.remove(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class CameraControlSessionCallback extends android.hardware.camera2.CameraCaptureSession.CaptureCallback {
        private final java.util.concurrent.Executor mExecutor;
        final java.util.Set<androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener> mResultListeners;

        CameraControlSessionCallback(@androidx.annotation.NonNull java.util.concurrent.Executor r2) {
                r1 = this;
                r1.<init>()
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r1.mResultListeners = r0
                r1.mExecutor = r2
                return
        }

        public static /* synthetic */ void a(androidx.camera.camera2.internal.Camera2CameraControlImpl.CameraControlSessionCallback r4, android.hardware.camera2.TotalCaptureResult r5) {
                r4.getClass()
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                java.util.Set<androidx.camera.camera2.internal.Camera2CameraControlImpl$CaptureResultListener> r1 = r4.mResultListeners
                java.util.Iterator r1 = r1.iterator()
            Le:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L24
                java.lang.Object r2 = r1.next()
                androidx.camera.camera2.internal.Camera2CameraControlImpl$CaptureResultListener r2 = (androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener) r2
                boolean r3 = r2.onCaptureResult(r5)
                if (r3 == 0) goto Le
                r0.add(r2)
                goto Le
            L24:
                boolean r5 = r0.isEmpty()
                if (r5 != 0) goto L2f
                java.util.Set<androidx.camera.camera2.internal.Camera2CameraControlImpl$CaptureResultListener> r4 = r4.mResultListeners
                r4.removeAll(r0)
            L2f:
                return
        }

        void addListener(@androidx.annotation.NonNull androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener r2) {
                r1 = this;
                java.util.Set<androidx.camera.camera2.internal.Camera2CameraControlImpl$CaptureResultListener> r0 = r1.mResultListeners
                r0.add(r2)
                return
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r1, @androidx.annotation.NonNull android.hardware.camera2.CaptureRequest r2, @androidx.annotation.NonNull android.hardware.camera2.TotalCaptureResult r3) {
                r0 = this;
                java.util.concurrent.Executor r1 = r0.mExecutor
                androidx.camera.camera2.internal.r r2 = new androidx.camera.camera2.internal.r
                r2.<init>(r0, r3)
                r1.execute(r2)
                return
        }

        void removeListener(@androidx.annotation.NonNull androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener r2) {
                r1 = this;
                java.util.Set<androidx.camera.camera2.internal.Camera2CameraControlImpl$CaptureResultListener> r0 = r1.mResultListeners
                r0.remove(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface CaptureResultListener {
        boolean onCaptureResult(@androidx.annotation.NonNull android.hardware.camera2.TotalCaptureResult r1);
    }

    @androidx.annotation.VisibleForTesting
    Camera2CameraControlImpl(@androidx.annotation.NonNull androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r7, @androidx.annotation.NonNull java.util.concurrent.ScheduledExecutorService r8, @androidx.annotation.NonNull java.util.concurrent.Executor r9, @androidx.annotation.NonNull androidx.camera.core.impl.CameraControlInternal.ControlUpdateCallback r10) {
            r6 = this;
            androidx.camera.core.impl.Quirks r5 = new androidx.camera.core.impl.Quirks
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.<init>(r0)
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    Camera2CameraControlImpl(@androidx.annotation.NonNull androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r5, @androidx.annotation.NonNull java.util.concurrent.ScheduledExecutorService r6, @androidx.annotation.NonNull java.util.concurrent.Executor r7, @androidx.annotation.NonNull androidx.camera.core.impl.CameraControlInternal.ControlUpdateCallback r8, @androidx.annotation.NonNull androidx.camera.core.impl.Quirks r9) {
            r4 = this;
            r4.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r4.mLock = r0
            androidx.camera.core.impl.SessionConfig$Builder r0 = new androidx.camera.core.impl.SessionConfig$Builder
            r0.<init>()
            r4.mSessionConfigBuilder = r0
            r1 = 0
            r4.mUseCount = r1
            r4.mIsTorchOn = r1
            r1 = 2
            r4.mFlashMode = r1
            java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
            r2 = 0
            r1.<init>(r2)
            r4.mNextSessionUpdateId = r1
            r1 = 0
            com.google.common.util.concurrent.ListenableFuture r1 = androidx.camera.core.impl.utils.futures.Futures.immediateFuture(r1)
            r4.mFlashModeChangeSessionUpdateFuture = r1
            r1 = 1
            r4.mTemplate = r1
            r4.mCurrentSessionUpdateId = r2
            androidx.camera.camera2.internal.Camera2CameraControlImpl$CameraCaptureCallbackSet r1 = new androidx.camera.camera2.internal.Camera2CameraControlImpl$CameraCaptureCallbackSet
            r1.<init>()
            r4.mCameraCaptureCallbackSet = r1
            r4.mCameraCharacteristics = r5
            r4.mControlUpdateCallback = r8
            r4.mExecutor = r7
            androidx.camera.camera2.internal.Camera2CameraControlImpl$CameraControlSessionCallback r8 = new androidx.camera.camera2.internal.Camera2CameraControlImpl$CameraControlSessionCallback
            r8.<init>(r7)
            r4.mSessionCallback = r8
            int r2 = r4.mTemplate
            r0.setTemplateType(r2)
            androidx.camera.camera2.internal.CaptureCallbackContainer r8 = androidx.camera.camera2.internal.CaptureCallbackContainer.create(r8)
            r0.addRepeatingCameraCaptureCallback(r8)
            r0.addRepeatingCameraCaptureCallback(r1)
            androidx.camera.camera2.internal.ExposureControl r8 = new androidx.camera.camera2.internal.ExposureControl
            r8.<init>(r4, r5, r7)
            r4.mExposureControl = r8
            androidx.camera.camera2.internal.FocusMeteringControl r8 = new androidx.camera.camera2.internal.FocusMeteringControl
            r8.<init>(r4, r6, r7, r9)
            r4.mFocusMeteringControl = r8
            androidx.camera.camera2.internal.ZoomControl r6 = new androidx.camera.camera2.internal.ZoomControl
            r6.<init>(r4, r5, r7)
            r4.mZoomControl = r6
            androidx.camera.camera2.internal.TorchControl r6 = new androidx.camera.camera2.internal.TorchControl
            r6.<init>(r4, r5, r7)
            r4.mTorchControl = r6
            int r6 = android.os.Build.VERSION.SDK_INT
            r8 = 23
            if (r6 < r8) goto L7b
            androidx.camera.camera2.internal.ZslControlImpl r6 = new androidx.camera.camera2.internal.ZslControlImpl
            r6.<init>(r5)
            r4.mZslControl = r6
            goto L82
        L7b:
            androidx.camera.camera2.internal.ZslControlNoOpImpl r6 = new androidx.camera.camera2.internal.ZslControlNoOpImpl
            r6.<init>()
            r4.mZslControl = r6
        L82:
            androidx.camera.camera2.internal.compat.workaround.AeFpsRange r6 = new androidx.camera.camera2.internal.compat.workaround.AeFpsRange
            r6.<init>(r9)
            r4.mAeFpsRange = r6
            androidx.camera.camera2.internal.compat.workaround.AutoFlashAEModeDisabler r6 = new androidx.camera.camera2.internal.compat.workaround.AutoFlashAEModeDisabler
            r6.<init>(r9)
            r4.mAutoFlashAEModeDisabler = r6
            androidx.camera.camera2.interop.Camera2CameraControl r6 = new androidx.camera.camera2.interop.Camera2CameraControl
            r6.<init>(r4, r7)
            r4.mCamera2CameraControl = r6
            androidx.camera.camera2.internal.Camera2CapturePipeline r6 = new androidx.camera.camera2.internal.Camera2CapturePipeline
            r6.<init>(r4, r5, r9, r7)
            r4.mCamera2CapturePipeline = r6
            androidx.camera.camera2.internal.e r5 = new androidx.camera.camera2.internal.e
            r5.<init>(r4)
            r7.execute(r5)
            return
    }

    public static /* synthetic */ java.lang.Object a(androidx.camera.camera2.internal.Camera2CameraControlImpl r1, long r2, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r4) {
            r1.getClass()
            androidx.camera.camera2.internal.j r0 = new androidx.camera.camera2.internal.j
            r0.<init>(r2, r4)
            r1.addCaptureResultListener(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "waitForSessionUpdateId:"
            r1.append(r4)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            return r1
    }

    public static /* synthetic */ void b(androidx.camera.camera2.internal.Camera2CameraControlImpl r1) {
            androidx.camera.camera2.interop.Camera2CameraControl r0 = r1.mCamera2CameraControl
            androidx.camera.camera2.internal.Camera2CameraControlImpl$CaptureResultListener r0 = r0.getCaptureRequestListener()
            r1.addCaptureResultListener(r0)
            return
    }

    public static /* synthetic */ void c(androidx.camera.camera2.internal.Camera2CameraControlImpl r2, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r3) {
            long r0 = r2.updateSessionConfigSynchronous()
            com.google.common.util.concurrent.ListenableFuture r2 = r2.waitForSessionUpdateId(r0)
            androidx.camera.core.impl.utils.futures.Futures.propagate(r2, r3)
            return
    }

    public static /* synthetic */ void d() {
            return
    }

    public static /* synthetic */ boolean e(long r0, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r2, android.hardware.camera2.TotalCaptureResult r3) {
            boolean r0 = isSessionUpdated(r3, r0)
            if (r0 == 0) goto Lc
            r0 = 0
            r2.set(r0)
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public static /* synthetic */ void f(androidx.camera.camera2.internal.Camera2CameraControlImpl r0, androidx.camera.core.impl.CameraCaptureCallback r1) {
            androidx.camera.camera2.internal.Camera2CameraControlImpl$CameraCaptureCallbackSet r0 = r0.mCameraCaptureCallbackSet
            r0.removeCaptureCallback(r1)
            return
    }

    public static /* synthetic */ void g() {
            return
    }

    private int getSupportedAwbMode(int r4) {
            r3 = this;
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r0 = r3.mCameraCharacteristics
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES
            java.lang.Object r0 = r0.get(r1)
            int[] r0 = (int[]) r0
            r1 = 0
            if (r0 != 0) goto Le
            return r1
        Le:
            boolean r2 = r3.isModeInList(r4, r0)
            if (r2 == 0) goto L15
            return r4
        L15:
            r4 = 1
            boolean r0 = r3.isModeInList(r4, r0)
            if (r0 == 0) goto L1d
            return r4
        L1d:
            return r1
    }

    public static /* synthetic */ java.lang.Object h(androidx.camera.camera2.internal.Camera2CameraControlImpl r2, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r3) {
            java.util.concurrent.Executor r0 = r2.mExecutor
            androidx.camera.camera2.internal.d r1 = new androidx.camera.camera2.internal.d
            r1.<init>(r2, r3)
            r0.execute(r1)
            java.lang.String r2 = "updateSessionConfigAsync"
            return r2
    }

    public static /* synthetic */ void i(androidx.camera.camera2.internal.Camera2CameraControlImpl r0, java.util.concurrent.Executor r1, androidx.camera.core.impl.CameraCaptureCallback r2) {
            androidx.camera.camera2.internal.Camera2CameraControlImpl$CameraCaptureCallbackSet r0 = r0.mCameraCaptureCallbackSet
            r0.addCaptureCallback(r1, r2)
            return
    }

    private boolean isControlInUse() {
            r1 = this;
            int r0 = r1.getUseCount()
            if (r0 <= 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    private boolean isModeInList(int r5, int[] r6) {
            r4 = this;
            int r0 = r6.length
            r1 = 0
            r2 = 0
        L3:
            if (r2 >= r0) goto Le
            r3 = r6[r2]
            if (r5 != r3) goto Lb
            r5 = 1
            return r5
        Lb:
            int r2 = r2 + 1
            goto L3
        Le:
            return r1
    }

    static boolean isSessionUpdated(@androidx.annotation.NonNull android.hardware.camera2.TotalCaptureResult r4, long r5) {
            android.hardware.camera2.CaptureRequest r0 = r4.getRequest()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            android.hardware.camera2.CaptureRequest r4 = r4.getRequest()
            java.lang.Object r4 = r4.getTag()
            boolean r0 = r4 instanceof androidx.camera.core.impl.TagBundle
            if (r0 == 0) goto L2b
            androidx.camera.core.impl.TagBundle r4 = (androidx.camera.core.impl.TagBundle) r4
            java.lang.String r0 = "CameraControlSessionUpdateId"
            java.lang.Object r4 = r4.getTag(r0)
            java.lang.Long r4 = (java.lang.Long) r4
            if (r4 != 0) goto L21
            return r1
        L21:
            long r2 = r4.longValue()
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 < 0) goto L2b
            r4 = 1
            return r4
        L2b:
            return r1
    }

    public static /* synthetic */ com.google.common.util.concurrent.ListenableFuture j(androidx.camera.camera2.internal.Camera2CameraControlImpl r0, java.util.List r1, int r2, int r3, int r4, java.lang.Void r5) {
            androidx.camera.camera2.internal.Camera2CapturePipeline r0 = r0.mCamera2CapturePipeline
            com.google.common.util.concurrent.ListenableFuture r0 = r0.submitStillCaptures(r1, r2, r3, r4)
            return r0
    }

    @androidx.annotation.NonNull
    private com.google.common.util.concurrent.ListenableFuture<java.lang.Void> waitForSessionUpdateId(long r2) {
            r1 = this;
            androidx.camera.camera2.internal.i r0 = new androidx.camera.camera2.internal.i
            r0.<init>(r1, r2)
            com.google.common.util.concurrent.ListenableFuture r2 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r0)
            return r2
    }

    void addCaptureResultListener(@androidx.annotation.NonNull androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener r2) {
            r1 = this;
            androidx.camera.camera2.internal.Camera2CameraControlImpl$CameraControlSessionCallback r0 = r1.mSessionCallback
            r0.addListener(r2)
            return
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void addInteropConfig(@androidx.annotation.NonNull androidx.camera.core.impl.Config r3) {
            r2 = this;
            androidx.camera.camera2.interop.Camera2CameraControl r0 = r2.mCamera2CameraControl
            androidx.camera.camera2.interop.CaptureRequestOptions$Builder r3 = androidx.camera.camera2.interop.CaptureRequestOptions.Builder.from(r3)
            androidx.camera.camera2.interop.CaptureRequestOptions r3 = r3.build()
            com.google.common.util.concurrent.ListenableFuture r3 = r0.addCaptureRequestOptions(r3)
            androidx.camera.camera2.internal.h r0 = new androidx.camera.camera2.internal.h
            r0.<init>()
            java.util.concurrent.Executor r1 = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()
            r3.addListener(r0, r1)
            return
    }

    void addSessionCameraCaptureCallback(@androidx.annotation.NonNull java.util.concurrent.Executor r3, @androidx.annotation.NonNull androidx.camera.core.impl.CameraCaptureCallback r4) {
            r2 = this;
            java.util.concurrent.Executor r0 = r2.mExecutor
            androidx.camera.camera2.internal.g r1 = new androidx.camera.camera2.internal.g
            r1.<init>(r2, r3, r4)
            r0.execute(r1)
            return
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void addZslConfig(@androidx.annotation.NonNull androidx.camera.core.impl.SessionConfig.Builder r2) {
            r1 = this;
            androidx.camera.camera2.internal.ZslControl r0 = r1.mZslControl
            r0.addZslConfig(r2)
            return
    }

    @Override // androidx.camera.core.CameraControl
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> cancelFocusAndMetering() {
            r2 = this;
            boolean r0 = r2.isControlInUse()
            if (r0 != 0) goto L12
            androidx.camera.core.CameraControl$OperationCanceledException r0 = new androidx.camera.core.CameraControl$OperationCanceledException
            java.lang.String r1 = "Camera is not active."
            r0.<init>(r1)
            com.google.common.util.concurrent.ListenableFuture r0 = androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(r0)
            return r0
        L12:
            androidx.camera.camera2.internal.FocusMeteringControl r0 = r2.mFocusMeteringControl
            com.google.common.util.concurrent.ListenableFuture r0 = r0.cancelFocusAndMetering()
            com.google.common.util.concurrent.ListenableFuture r0 = androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(r0)
            return r0
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void clearInteropConfig() {
            r3 = this;
            androidx.camera.camera2.interop.Camera2CameraControl r0 = r3.mCamera2CameraControl
            com.google.common.util.concurrent.ListenableFuture r0 = r0.clearCaptureRequestOptions()
            androidx.camera.camera2.internal.n r1 = new androidx.camera.camera2.internal.n
            r1.<init>()
            java.util.concurrent.Executor r2 = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()
            r0.addListener(r1, r2)
            return
    }

    void decrementUseCount() {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            int r1 = r3.mUseCount     // Catch: java.lang.Throwable -> Ld
            if (r1 == 0) goto Lf
            int r1 = r1 + (-1)
            r3.mUseCount = r1     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r1 = move-exception
            goto L17
        Lf:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Ld
            java.lang.String r2 = "Decrementing use count occurs more times than incrementing"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Ld
            throw r1     // Catch: java.lang.Throwable -> Ld
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }

    @Override // androidx.camera.core.CameraControl
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> enableTorch(boolean r2) {
            r1 = this;
            boolean r0 = r1.isControlInUse()
            if (r0 != 0) goto L12
            androidx.camera.core.CameraControl$OperationCanceledException r2 = new androidx.camera.core.CameraControl$OperationCanceledException
            java.lang.String r0 = "Camera is not active."
            r2.<init>(r0)
            com.google.common.util.concurrent.ListenableFuture r2 = androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(r2)
            return r2
        L12:
            androidx.camera.camera2.internal.TorchControl r0 = r1.mTorchControl
            com.google.common.util.concurrent.ListenableFuture r2 = r0.enableTorch(r2)
            com.google.common.util.concurrent.ListenableFuture r2 = androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(r2)
            return r2
    }

    void enableTorchInternal(boolean r4) {
            r3 = this;
            r3.mIsTorchOn = r4
            if (r4 != 0) goto L40
            androidx.camera.core.impl.CaptureConfig$Builder r4 = new androidx.camera.core.impl.CaptureConfig$Builder
            r4.<init>()
            int r0 = r3.mTemplate
            r4.setTemplateType(r0)
            r0 = 1
            r4.setUseRepeatingSurface(r0)
            androidx.camera.camera2.impl.Camera2ImplConfig$Builder r1 = new androidx.camera.camera2.impl.Camera2ImplConfig$Builder
            r1.<init>()
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE
            int r0 = r3.getSupportedAeMode(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.setCaptureRequestOption(r2, r0)
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.FLASH_MODE
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.setCaptureRequestOption(r0, r2)
            androidx.camera.camera2.impl.Camera2ImplConfig r0 = r1.build()
            r4.addImplementationOptions(r0)
            androidx.camera.core.impl.CaptureConfig r4 = r4.build()
            java.util.List r4 = java.util.Collections.singletonList(r4)
            r3.submitCaptureRequestsInternal(r4)
        L40:
            r3.updateSessionConfigSynchronous()
            return
    }

    @androidx.annotation.NonNull
    public androidx.camera.camera2.interop.Camera2CameraControl getCamera2CameraControl() {
            r1 = this;
            androidx.camera.camera2.interop.Camera2CameraControl r0 = r1.mCamera2CameraControl
            return r0
    }

    @androidx.annotation.NonNull
    android.graphics.Rect getCropSensorRegion() {
            r1 = this;
            androidx.camera.camera2.internal.ZoomControl r0 = r1.mZoomControl
            android.graphics.Rect r0 = r0.getCropSensorRegion()
            return r0
    }

    @androidx.annotation.VisibleForTesting
    long getCurrentSessionUpdateId() {
            r2 = this;
            long r0 = r2.mCurrentSessionUpdateId
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.camera.camera2.internal.ExposureControl getExposureControl() {
            r1 = this;
            androidx.camera.camera2.internal.ExposureControl r0 = r1.mExposureControl
            return r0
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public int getFlashMode() {
            r1 = this;
            int r0 = r1.mFlashMode
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.camera.camera2.internal.FocusMeteringControl getFocusMeteringControl() {
            r1 = this;
            androidx.camera.camera2.internal.FocusMeteringControl r0 = r1.mFocusMeteringControl
            return r0
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public /* synthetic */ androidx.camera.core.impl.CameraControlInternal getImplementation() {
            r1 = this;
            androidx.camera.core.impl.CameraControlInternal r0 = androidx.camera.core.impl.e.a(r1)
            return r0
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    @androidx.annotation.NonNull
    public androidx.camera.core.impl.Config getInteropConfig() {
            r1 = this;
            androidx.camera.camera2.interop.Camera2CameraControl r0 = r1.mCamera2CameraControl
            androidx.camera.camera2.impl.Camera2ImplConfig r0 = r0.getCamera2ImplConfig()
            return r0
    }

    int getMaxAeRegionCount() {
            r2 = this;
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r0 = r2.mCameraCharacteristics
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.CONTROL_MAX_REGIONS_AE
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            int r0 = r0.intValue()
            return r0
    }

    int getMaxAfRegionCount() {
            r2 = this;
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r0 = r2.mCameraCharacteristics
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.CONTROL_MAX_REGIONS_AF
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            int r0 = r0.intValue()
            return r0
    }

    int getMaxAwbRegionCount() {
            r2 = this;
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r0 = r2.mCameraCharacteristics
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.CONTROL_MAX_REGIONS_AWB
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            int r0 = r0.intValue()
            return r0
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    @androidx.annotation.NonNull
    public android.graphics.Rect getSensorRect() {
            r2 = this;
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r0 = r2.mCameraCharacteristics
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE
            java.lang.Object r0 = r0.get(r1)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r0)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            return r0
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    @androidx.annotation.NonNull
    public androidx.camera.core.impl.SessionConfig getSessionConfig() {
            r3 = this;
            androidx.camera.core.impl.SessionConfig$Builder r0 = r3.mSessionConfigBuilder
            int r1 = r3.mTemplate
            r0.setTemplateType(r1)
            androidx.camera.core.impl.SessionConfig$Builder r0 = r3.mSessionConfigBuilder
            androidx.camera.core.impl.Config r1 = r3.getSessionOptions()
            r0.setImplementationOptions(r1)
            androidx.camera.camera2.interop.Camera2CameraControl r0 = r3.mCamera2CameraControl
            androidx.camera.camera2.impl.Camera2ImplConfig r0 = r0.getCamera2ImplConfig()
            r1 = 0
            java.lang.Object r0 = r0.getCaptureRequestTag(r1)
            if (r0 == 0) goto L28
            boolean r1 = r0 instanceof java.lang.Integer
            if (r1 == 0) goto L28
            androidx.camera.core.impl.SessionConfig$Builder r1 = r3.mSessionConfigBuilder
            java.lang.String r2 = "Camera2CameraControl"
            r1.addTag(r2, r0)
        L28:
            androidx.camera.core.impl.SessionConfig$Builder r0 = r3.mSessionConfigBuilder
            long r1 = r3.mCurrentSessionUpdateId
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "CameraControlSessionUpdateId"
            r0.addTag(r2, r1)
            androidx.camera.core.impl.SessionConfig$Builder r0 = r3.mSessionConfigBuilder
            androidx.camera.core.impl.SessionConfig r0 = r0.build()
            return r0
    }

    @androidx.annotation.VisibleForTesting
    androidx.camera.core.impl.Config getSessionOptions() {
            r7 = this;
            androidx.camera.camera2.impl.Camera2ImplConfig$Builder r0 = new androidx.camera.camera2.impl.Camera2ImplConfig$Builder
            r0.<init>()
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_MODE
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.setCaptureRequestOption(r1, r3)
            androidx.camera.camera2.internal.FocusMeteringControl r1 = r7.mFocusMeteringControl
            r1.addFocusMeteringOptions(r0)
            androidx.camera.camera2.internal.compat.workaround.AeFpsRange r1 = r7.mAeFpsRange
            r1.addAeFpsRangeOptions(r0)
            androidx.camera.camera2.internal.ZoomControl r1 = r7.mZoomControl
            r1.addZoomOption(r0)
            boolean r1 = r7.mIsTorchOn
            r3 = 2
            if (r1 == 0) goto L2d
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.FLASH_MODE
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.setCaptureRequestOption(r1, r3)
            goto L33
        L2d:
            int r1 = r7.mFlashMode
            if (r1 == 0) goto L37
            if (r1 == r2) goto L35
        L33:
            r1 = 1
            goto L3d
        L35:
            r1 = 3
            goto L3d
        L37:
            androidx.camera.camera2.internal.compat.workaround.AutoFlashAEModeDisabler r1 = r7.mAutoFlashAEModeDisabler
            int r1 = r1.getCorrectedAeMode(r3)
        L3d:
            android.hardware.camera2.CaptureRequest$Key r3 = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE
            int r1 = r7.getSupportedAeMode(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.setCaptureRequestOption(r3, r1)
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AWB_MODE
            int r2 = r7.getSupportedAwbMode(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.setCaptureRequestOption(r1, r2)
            androidx.camera.camera2.internal.ExposureControl r1 = r7.mExposureControl
            r1.setCaptureRequestOption(r0)
            androidx.camera.camera2.interop.Camera2CameraControl r1 = r7.mCamera2CameraControl
            androidx.camera.camera2.impl.Camera2ImplConfig r1 = r1.getCamera2ImplConfig()
            java.util.Set r2 = r1.listOptions()
            java.util.Iterator r2 = r2.iterator()
        L6a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L84
            java.lang.Object r3 = r2.next()
            androidx.camera.core.impl.Config$Option r3 = (androidx.camera.core.impl.Config.Option) r3
            androidx.camera.core.impl.MutableConfig r4 = r0.getMutableConfig()
            androidx.camera.core.impl.Config$OptionPriority r5 = androidx.camera.core.impl.Config.OptionPriority.ALWAYS_OVERRIDE
            java.lang.Object r6 = r1.retrieveOption(r3)
            r4.insertOption(r3, r5, r6)
            goto L6a
        L84:
            androidx.camera.camera2.impl.Camera2ImplConfig r0 = r0.build()
            return r0
    }

    int getSupportedAeMode(int r4) {
            r3 = this;
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r0 = r3.mCameraCharacteristics
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES
            java.lang.Object r0 = r0.get(r1)
            int[] r0 = (int[]) r0
            r1 = 0
            if (r0 != 0) goto Le
            return r1
        Le:
            boolean r2 = r3.isModeInList(r4, r0)
            if (r2 == 0) goto L15
            return r4
        L15:
            r4 = 1
            boolean r0 = r3.isModeInList(r4, r0)
            if (r0 == 0) goto L1d
            return r4
        L1d:
            return r1
    }

    int getSupportedAfMode(int r4) {
            r3 = this;
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r0 = r3.mCameraCharacteristics
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES
            java.lang.Object r0 = r0.get(r1)
            int[] r0 = (int[]) r0
            r1 = 0
            if (r0 != 0) goto Le
            return r1
        Le:
            boolean r2 = r3.isModeInList(r4, r0)
            if (r2 == 0) goto L15
            return r4
        L15:
            r4 = 4
            boolean r2 = r3.isModeInList(r4, r0)
            if (r2 == 0) goto L1d
            return r4
        L1d:
            r4 = 1
            boolean r0 = r3.isModeInList(r4, r0)
            if (r0 == 0) goto L25
            return r4
        L25:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.camera.camera2.internal.TorchControl getTorchControl() {
            r1 = this;
            androidx.camera.camera2.internal.TorchControl r0 = r1.mTorchControl
            return r0
    }

    @androidx.annotation.VisibleForTesting
    int getUseCount() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            int r1 = r2.mUseCount     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    @androidx.annotation.NonNull
    public androidx.camera.camera2.internal.ZoomControl getZoomControl() {
            r1 = this;
            androidx.camera.camera2.internal.ZoomControl r0 = r1.mZoomControl
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.camera.camera2.internal.ZslControl getZslControl() {
            r1 = this;
            androidx.camera.camera2.internal.ZslControl r0 = r1.mZslControl
            return r0
    }

    void incrementUseCount() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            int r1 = r2.mUseCount     // Catch: java.lang.Throwable -> Lb
            int r1 = r1 + 1
            r2.mUseCount = r1     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    boolean isTorchOn() {
            r1 = this;
            boolean r0 = r1.mIsTorchOn
            return r0
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public boolean isZslDisabledByByUserCaseConfig() {
            r1 = this;
            androidx.camera.camera2.internal.ZslControl r0 = r1.mZslControl
            boolean r0 = r0.isZslDisabledByUserCaseConfig()
            return r0
    }

    void removeCaptureResultListener(@androidx.annotation.NonNull androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener r2) {
            r1 = this;
            androidx.camera.camera2.internal.Camera2CameraControlImpl$CameraControlSessionCallback r0 = r1.mSessionCallback
            r0.removeListener(r2)
            return
    }

    void removeSessionCameraCaptureCallback(@androidx.annotation.NonNull androidx.camera.core.impl.CameraCaptureCallback r3) {
            r2 = this;
            java.util.concurrent.Executor r0 = r2.mExecutor
            androidx.camera.camera2.internal.k r1 = new androidx.camera.camera2.internal.k
            r1.<init>(r2, r3)
            r0.execute(r1)
            return
    }

    void resetTemplate() {
            r1 = this;
            r0 = 1
            r1.setTemplate(r0)
            return
    }

    void setActive(boolean r2) {
            r1 = this;
            androidx.camera.camera2.internal.FocusMeteringControl r0 = r1.mFocusMeteringControl
            r0.setActive(r2)
            androidx.camera.camera2.internal.ZoomControl r0 = r1.mZoomControl
            r0.setActive(r2)
            androidx.camera.camera2.internal.TorchControl r0 = r1.mTorchControl
            r0.setActive(r2)
            androidx.camera.camera2.internal.ExposureControl r0 = r1.mExposureControl
            r0.setActive(r2)
            androidx.camera.camera2.interop.Camera2CameraControl r0 = r1.mCamera2CameraControl
            r0.setActive(r2)
            return
    }

    @Override // androidx.camera.core.CameraControl
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Integer> setExposureCompensationIndex(int r2) {
            r1 = this;
            boolean r0 = r1.isControlInUse()
            if (r0 != 0) goto L12
            androidx.camera.core.CameraControl$OperationCanceledException r2 = new androidx.camera.core.CameraControl$OperationCanceledException
            java.lang.String r0 = "Camera is not active."
            r2.<init>(r0)
            com.google.common.util.concurrent.ListenableFuture r2 = androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(r2)
            return r2
        L12:
            androidx.camera.camera2.internal.ExposureControl r0 = r1.mExposureControl
            com.google.common.util.concurrent.ListenableFuture r2 = r0.setExposureCompensationIndex(r2)
            return r2
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void setFlashMode(int r3) {
            r2 = this;
            boolean r0 = r2.isControlInUse()
            if (r0 != 0) goto Le
            java.lang.String r3 = "Camera2CameraControlImp"
            java.lang.String r0 = "Camera is not active."
            androidx.camera.core.Logger.w(r3, r0)
            return
        Le:
            r2.mFlashMode = r3
            androidx.camera.camera2.internal.ZslControl r3 = r2.mZslControl
            int r0 = r2.mFlashMode
            r1 = 1
            if (r0 == r1) goto L1d
            int r0 = r2.mFlashMode
            if (r0 != 0) goto L1c
            goto L1d
        L1c:
            r1 = 0
        L1d:
            r3.setZslDisabledByFlashMode(r1)
            com.google.common.util.concurrent.ListenableFuture r3 = r2.updateSessionConfigAsync()
            r2.mFlashModeChangeSessionUpdateFuture = r3
            return
    }

    @Override // androidx.camera.core.CameraControl
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> setLinearZoom(float r2) {
            r1 = this;
            boolean r0 = r1.isControlInUse()
            if (r0 != 0) goto L12
            androidx.camera.core.CameraControl$OperationCanceledException r2 = new androidx.camera.core.CameraControl$OperationCanceledException
            java.lang.String r0 = "Camera is not active."
            r2.<init>(r0)
            com.google.common.util.concurrent.ListenableFuture r2 = androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(r2)
            return r2
        L12:
            androidx.camera.camera2.internal.ZoomControl r0 = r1.mZoomControl
            com.google.common.util.concurrent.ListenableFuture r2 = r0.setLinearZoom(r2)
            com.google.common.util.concurrent.ListenableFuture r2 = androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(r2)
            return r2
    }

    public void setPreviewAspectRatio(@androidx.annotation.Nullable android.util.Rational r2) {
            r1 = this;
            androidx.camera.camera2.internal.FocusMeteringControl r0 = r1.mFocusMeteringControl
            r0.setPreviewAspectRatio(r2)
            return
    }

    void setTemplate(int r2) {
            r1 = this;
            r1.mTemplate = r2
            androidx.camera.camera2.internal.FocusMeteringControl r0 = r1.mFocusMeteringControl
            r0.setTemplate(r2)
            androidx.camera.camera2.internal.Camera2CapturePipeline r2 = r1.mCamera2CapturePipeline
            int r0 = r1.mTemplate
            r2.setTemplate(r0)
            return
    }

    @Override // androidx.camera.core.CameraControl
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> setZoomRatio(float r2) {
            r1 = this;
            boolean r0 = r1.isControlInUse()
            if (r0 != 0) goto L12
            androidx.camera.core.CameraControl$OperationCanceledException r2 = new androidx.camera.core.CameraControl$OperationCanceledException
            java.lang.String r0 = "Camera is not active."
            r2.<init>(r0)
            com.google.common.util.concurrent.ListenableFuture r2 = androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(r2)
            return r2
        L12:
            androidx.camera.camera2.internal.ZoomControl r0 = r1.mZoomControl
            com.google.common.util.concurrent.ListenableFuture r2 = r0.setZoomRatio(r2)
            com.google.common.util.concurrent.ListenableFuture r2 = androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(r2)
            return r2
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void setZslDisabledByUserCaseConfig(boolean r2) {
            r1 = this;
            androidx.camera.camera2.internal.ZslControl r0 = r1.mZslControl
            r0.setZslDisabledByUserCaseConfig(r2)
            return
    }

    @Override // androidx.camera.core.CameraControl
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<androidx.camera.core.FocusMeteringResult> startFocusAndMetering(@androidx.annotation.NonNull androidx.camera.core.FocusMeteringAction r2) {
            r1 = this;
            boolean r0 = r1.isControlInUse()
            if (r0 != 0) goto L12
            androidx.camera.core.CameraControl$OperationCanceledException r2 = new androidx.camera.core.CameraControl$OperationCanceledException
            java.lang.String r0 = "Camera is not active."
            r2.<init>(r0)
            com.google.common.util.concurrent.ListenableFuture r2 = androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(r2)
            return r2
        L12:
            androidx.camera.camera2.internal.FocusMeteringControl r0 = r1.mFocusMeteringControl
            com.google.common.util.concurrent.ListenableFuture r2 = r0.startFocusAndMetering(r2)
            com.google.common.util.concurrent.ListenableFuture r2 = androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(r2)
            return r2
    }

    void submitCaptureRequestsInternal(java.util.List<androidx.camera.core.impl.CaptureConfig> r2) {
            r1 = this;
            androidx.camera.core.impl.CameraControlInternal$ControlUpdateCallback r0 = r1.mControlUpdateCallback
            r0.onCameraControlCaptureRequests(r2)
            return
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.util.List<java.lang.Void>> submitStillCaptureRequests(@androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.CaptureConfig> r8, int r9, int r10) {
            r7 = this;
            boolean r0 = r7.isControlInUse()
            if (r0 != 0) goto L17
            java.lang.String r8 = "Camera2CameraControlImp"
            java.lang.String r9 = "Camera is not active."
            androidx.camera.core.Logger.w(r8, r9)
            androidx.camera.core.CameraControl$OperationCanceledException r8 = new androidx.camera.core.CameraControl$OperationCanceledException
            r8.<init>(r9)
            com.google.common.util.concurrent.ListenableFuture r8 = androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(r8)
            return r8
        L17:
            int r4 = r7.getFlashMode()
            com.google.common.util.concurrent.ListenableFuture<java.lang.Void> r0 = r7.mFlashModeChangeSessionUpdateFuture
            com.google.common.util.concurrent.ListenableFuture r0 = androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(r0)
            androidx.camera.core.impl.utils.futures.FutureChain r6 = androidx.camera.core.impl.utils.futures.FutureChain.from(r0)
            androidx.camera.camera2.internal.f r0 = new androidx.camera.camera2.internal.f
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.concurrent.Executor r8 = r1.mExecutor
            androidx.camera.core.impl.utils.futures.FutureChain r8 = r6.transformAsync(r0, r8)
            return r8
    }

    public void updateSessionConfig() {
            r2 = this;
            java.util.concurrent.Executor r0 = r2.mExecutor
            androidx.camera.camera2.internal.m r1 = new androidx.camera.camera2.internal.m
            r1.<init>(r2)
            r0.execute(r1)
            return
    }

    @androidx.annotation.NonNull
    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> updateSessionConfigAsync() {
            r1 = this;
            androidx.camera.camera2.internal.l r0 = new androidx.camera.camera2.internal.l
            r0.<init>(r1)
            com.google.common.util.concurrent.ListenableFuture r0 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r0)
            com.google.common.util.concurrent.ListenableFuture r0 = androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(r0)
            return r0
    }

    long updateSessionConfigSynchronous() {
            r2 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r2.mNextSessionUpdateId
            long r0 = r0.getAndIncrement()
            r2.mCurrentSessionUpdateId = r0
            androidx.camera.core.impl.CameraControlInternal$ControlUpdateCallback r0 = r2.mControlUpdateCallback
            r0.onCameraControlUpdateSessionConfig()
            long r0 = r2.mCurrentSessionUpdateId
            return r0
    }
}
