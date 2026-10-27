package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class Camera2CameraImpl implements androidx.camera.core.impl.CameraInternal {
    private static final int ERROR_NONE = 0;
    private static final java.lang.String TAG = "Camera2CameraImpl";

    @androidx.annotation.NonNull
    final androidx.camera.camera2.internal.Camera2CameraImpl.CameraAvailability mCameraAvailability;

    @androidx.annotation.NonNull
    private final androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat mCameraCharacteristicsCompat;

    @androidx.annotation.NonNull
    private androidx.camera.core.impl.CameraConfig mCameraConfig;

    @androidx.annotation.NonNull
    final androidx.camera.camera2.internal.Camera2CameraImpl.CameraConfigureAvailable mCameraConfigureAvailable;
    private final androidx.camera.camera2.internal.Camera2CameraControlImpl mCameraControlInternal;

    @androidx.annotation.NonNull
    final androidx.camera.core.concurrent.CameraCoordinator mCameraCoordinator;

    @androidx.annotation.Nullable
    android.hardware.camera2.CameraDevice mCameraDevice;
    int mCameraDeviceError;

    @androidx.annotation.NonNull
    final androidx.camera.camera2.internal.Camera2CameraInfoImpl mCameraInfoInternal;
    private final androidx.camera.camera2.internal.compat.CameraManagerCompat mCameraManager;
    private final androidx.camera.camera2.internal.CameraStateMachine mCameraStateMachine;

    @androidx.annotation.NonNull
    final androidx.camera.core.impl.CameraStateRegistry mCameraStateRegistry;
    androidx.camera.camera2.internal.CaptureSessionInterface mCaptureSession;

    @androidx.annotation.NonNull
    private final androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener.Builder mCaptureSessionOpenerBuilder;

    @androidx.annotation.NonNull
    private final androidx.camera.camera2.internal.CaptureSessionRepository mCaptureSessionRepository;
    final java.util.Set<androidx.camera.camera2.internal.CaptureSession> mConfiguringForClose;

    @androidx.annotation.NonNull
    private final androidx.camera.camera2.internal.DisplayInfoManager mDisplayInfoManager;

    @androidx.annotation.NonNull
    private final androidx.camera.camera2.internal.compat.params.DynamicRangesCompat mDynamicRangesCompat;
    private final java.util.concurrent.Executor mExecutor;
    boolean mIsActiveResumingMode;
    final java.lang.Object mLock;
    private androidx.camera.camera2.internal.MeteringRepeatingSession mMeteringRepeatingSession;
    private final java.util.Set<java.lang.String> mNotifyStateAttachedSet;
    private final androidx.camera.core.impl.LiveDataObservable<androidx.camera.core.impl.CameraInternal.State> mObservableState;
    final java.util.concurrent.atomic.AtomicInteger mReleaseRequestCount;
    final java.util.Map<androidx.camera.camera2.internal.CaptureSessionInterface, com.google.common.util.concurrent.ListenableFuture<java.lang.Void>> mReleasedCaptureSessions;
    private final java.util.concurrent.ScheduledExecutorService mScheduledExecutorService;

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("mLock")
    private androidx.camera.core.impl.SessionProcessor mSessionProcessor;
    volatile androidx.camera.camera2.internal.Camera2CameraImpl.InternalState mState;
    private final androidx.camera.camera2.internal.Camera2CameraImpl.StateCallback mStateCallback;
    private final androidx.camera.core.impl.UseCaseAttachState mUseCaseAttachState;
    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> mUserReleaseFuture;
    androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> mUserReleaseNotifier;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.camera.camera2.internal.Camera2CameraImpl$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$androidx$camera$camera2$internal$Camera2CameraImpl$InternalState = null;

        static {
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState[] r0 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.camera.camera2.internal.Camera2CameraImpl.AnonymousClass3.$SwitchMap$androidx$camera$camera2$internal$Camera2CameraImpl$InternalState = r0
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.camera.camera2.internal.Camera2CameraImpl.AnonymousClass3.$SwitchMap$androidx$camera$camera2$internal$Camera2CameraImpl$InternalState     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.PENDING_OPEN     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.camera.camera2.internal.Camera2CameraImpl.AnonymousClass3.$SwitchMap$androidx$camera$camera2$internal$Camera2CameraImpl$InternalState     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.CLOSING     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = androidx.camera.camera2.internal.Camera2CameraImpl.AnonymousClass3.$SwitchMap$androidx$camera$camera2$internal$Camera2CameraImpl$InternalState     // Catch: java.lang.NoSuchFieldError -> L33
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.OPENED     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = androidx.camera.camera2.internal.Camera2CameraImpl.AnonymousClass3.$SwitchMap$androidx$camera$camera2$internal$Camera2CameraImpl$InternalState     // Catch: java.lang.NoSuchFieldError -> L3e
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.CONFIGURED     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = androidx.camera.camera2.internal.Camera2CameraImpl.AnonymousClass3.$SwitchMap$androidx$camera$camera2$internal$Camera2CameraImpl$InternalState     // Catch: java.lang.NoSuchFieldError -> L49
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.OPENING     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = androidx.camera.camera2.internal.Camera2CameraImpl.AnonymousClass3.$SwitchMap$androidx$camera$camera2$internal$Camera2CameraImpl$InternalState     // Catch: java.lang.NoSuchFieldError -> L54
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.REOPENING     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r0 = androidx.camera.camera2.internal.Camera2CameraImpl.AnonymousClass3.$SwitchMap$androidx$camera$camera2$internal$Camera2CameraImpl$InternalState     // Catch: java.lang.NoSuchFieldError -> L60
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.RELEASING     // Catch: java.lang.NoSuchFieldError -> L60
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                int[] r0 = androidx.camera.camera2.internal.Camera2CameraImpl.AnonymousClass3.$SwitchMap$androidx$camera$camera2$internal$Camera2CameraImpl$InternalState     // Catch: java.lang.NoSuchFieldError -> L6c
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.RELEASED     // Catch: java.lang.NoSuchFieldError -> L6c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6c
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6c
            L6c:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class CameraAvailability extends android.hardware.camera2.CameraManager.AvailabilityCallback implements androidx.camera.core.impl.CameraStateRegistry.OnOpenAvailableListener {
        private boolean mCameraAvailable;
        private final java.lang.String mCameraId;
        final /* synthetic */ androidx.camera.camera2.internal.Camera2CameraImpl this$0;

        CameraAvailability(androidx.camera.camera2.internal.Camera2CameraImpl r1, java.lang.String r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r1 = 1
                r0.mCameraAvailable = r1
                r0.mCameraId = r2
                return
        }

        boolean isCameraAvailable() {
                r1 = this;
                boolean r0 = r1.mCameraAvailable
                return r0
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(@androidx.annotation.NonNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = r1.mCameraId
                boolean r2 = r0.equals(r2)
                if (r2 != 0) goto L9
                goto L1a
            L9:
                r2 = 1
                r1.mCameraAvailable = r2
                androidx.camera.camera2.internal.Camera2CameraImpl r2 = r1.this$0
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r2 = r2.mState
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r0 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.PENDING_OPEN
                if (r2 != r0) goto L1a
                androidx.camera.camera2.internal.Camera2CameraImpl r2 = r1.this$0
                r0 = 0
                r2.tryOpenCameraDevice(r0)
            L1a:
                return
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(@androidx.annotation.NonNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = r1.mCameraId
                boolean r2 = r0.equals(r2)
                if (r2 != 0) goto L9
                return
            L9:
                r2 = 0
                r1.mCameraAvailable = r2
                return
        }

        @Override // androidx.camera.core.impl.CameraStateRegistry.OnOpenAvailableListener
        public void onOpenAvailable() {
                r2 = this;
                androidx.camera.camera2.internal.Camera2CameraImpl r0 = r2.this$0
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r0 = r0.mState
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.PENDING_OPEN
                if (r0 != r1) goto Le
                androidx.camera.camera2.internal.Camera2CameraImpl r0 = r2.this$0
                r1 = 0
                r0.tryOpenCameraDevice(r1)
            Le:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class CameraConfigureAvailable implements androidx.camera.core.impl.CameraStateRegistry.OnConfigureAvailableListener {
        final /* synthetic */ androidx.camera.camera2.internal.Camera2CameraImpl this$0;

        CameraConfigureAvailable(androidx.camera.camera2.internal.Camera2CameraImpl r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // androidx.camera.core.impl.CameraStateRegistry.OnConfigureAvailableListener
        public void onConfigureAvailable() {
                r2 = this;
                androidx.camera.camera2.internal.Camera2CameraImpl r0 = r2.this$0
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r0 = r0.mState
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.OPENED
                if (r0 != r1) goto Ld
                androidx.camera.camera2.internal.Camera2CameraImpl r0 = r2.this$0
                r0.openCaptureSession()
            Ld:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class ControlUpdateListenerInternal implements androidx.camera.core.impl.CameraControlInternal.ControlUpdateCallback {
        final /* synthetic */ androidx.camera.camera2.internal.Camera2CameraImpl this$0;

        ControlUpdateListenerInternal(androidx.camera.camera2.internal.Camera2CameraImpl r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // androidx.camera.core.impl.CameraControlInternal.ControlUpdateCallback
        public void onCameraControlCaptureRequests(@androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.CaptureConfig> r2) {
                r1 = this;
                androidx.camera.camera2.internal.Camera2CameraImpl r0 = r1.this$0
                java.lang.Object r2 = androidx.core.util.Preconditions.checkNotNull(r2)
                java.util.List r2 = (java.util.List) r2
                r0.submitCaptureRequests(r2)
                return
        }

        @Override // androidx.camera.core.impl.CameraControlInternal.ControlUpdateCallback
        public void onCameraControlUpdateSessionConfig() {
                r1 = this;
                androidx.camera.camera2.internal.Camera2CameraImpl r0 = r1.this$0
                r0.updateCaptureSessionConfig()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    enum InternalState extends java.lang.Enum<androidx.camera.camera2.internal.Camera2CameraImpl.InternalState> {
        private static final /* synthetic */ androidx.camera.camera2.internal.Camera2CameraImpl.InternalState[] $VALUES = null;
        public static final androidx.camera.camera2.internal.Camera2CameraImpl.InternalState CLOSING = null;
        public static final androidx.camera.camera2.internal.Camera2CameraImpl.InternalState CONFIGURED = null;
        public static final androidx.camera.camera2.internal.Camera2CameraImpl.InternalState INITIALIZED = null;
        public static final androidx.camera.camera2.internal.Camera2CameraImpl.InternalState OPENED = null;
        public static final androidx.camera.camera2.internal.Camera2CameraImpl.InternalState OPENING = null;
        public static final androidx.camera.camera2.internal.Camera2CameraImpl.InternalState PENDING_OPEN = null;
        public static final androidx.camera.camera2.internal.Camera2CameraImpl.InternalState RELEASED = null;
        public static final androidx.camera.camera2.internal.Camera2CameraImpl.InternalState RELEASING = null;
        public static final androidx.camera.camera2.internal.Camera2CameraImpl.InternalState REOPENING = null;

        private static /* synthetic */ androidx.camera.camera2.internal.Camera2CameraImpl.InternalState[] $values() {
                r0 = 9
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState[] r0 = new androidx.camera.camera2.internal.Camera2CameraImpl.InternalState[r0]
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.INITIALIZED
                r2 = 0
                r0[r2] = r1
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.PENDING_OPEN
                r2 = 1
                r0[r2] = r1
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.OPENING
                r2 = 2
                r0[r2] = r1
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.OPENED
                r2 = 3
                r0[r2] = r1
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.CONFIGURED
                r2 = 4
                r0[r2] = r1
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.CLOSING
                r2 = 5
                r0[r2] = r1
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.REOPENING
                r2 = 6
                r0[r2] = r1
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.RELEASING
                r2 = 7
                r0[r2] = r1
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.RELEASED
                r2 = 8
                r0[r2] = r1
                return r0
        }

        static {
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r0 = new androidx.camera.camera2.internal.Camera2CameraImpl$InternalState
                java.lang.String r1 = "INITIALIZED"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.INITIALIZED = r0
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r0 = new androidx.camera.camera2.internal.Camera2CameraImpl$InternalState
                java.lang.String r1 = "PENDING_OPEN"
                r2 = 1
                r0.<init>(r1, r2)
                androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.PENDING_OPEN = r0
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r0 = new androidx.camera.camera2.internal.Camera2CameraImpl$InternalState
                java.lang.String r1 = "OPENING"
                r2 = 2
                r0.<init>(r1, r2)
                androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.OPENING = r0
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r0 = new androidx.camera.camera2.internal.Camera2CameraImpl$InternalState
                java.lang.String r1 = "OPENED"
                r2 = 3
                r0.<init>(r1, r2)
                androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.OPENED = r0
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r0 = new androidx.camera.camera2.internal.Camera2CameraImpl$InternalState
                java.lang.String r1 = "CONFIGURED"
                r2 = 4
                r0.<init>(r1, r2)
                androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.CONFIGURED = r0
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r0 = new androidx.camera.camera2.internal.Camera2CameraImpl$InternalState
                java.lang.String r1 = "CLOSING"
                r2 = 5
                r0.<init>(r1, r2)
                androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.CLOSING = r0
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r0 = new androidx.camera.camera2.internal.Camera2CameraImpl$InternalState
                java.lang.String r1 = "REOPENING"
                r2 = 6
                r0.<init>(r1, r2)
                androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.REOPENING = r0
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r0 = new androidx.camera.camera2.internal.Camera2CameraImpl$InternalState
                java.lang.String r1 = "RELEASING"
                r2 = 7
                r0.<init>(r1, r2)
                androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.RELEASING = r0
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r0 = new androidx.camera.camera2.internal.Camera2CameraImpl$InternalState
                java.lang.String r1 = "RELEASED"
                r2 = 8
                r0.<init>(r1, r2)
                androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.RELEASED = r0
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState[] r0 = $values()
                androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.$VALUES = r0
                return
        }

        InternalState(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.camera.camera2.internal.Camera2CameraImpl.InternalState valueOf(java.lang.String r1) {
                java.lang.Class<androidx.camera.camera2.internal.Camera2CameraImpl$InternalState> r0 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = (androidx.camera.camera2.internal.Camera2CameraImpl.InternalState) r1
                return r1
        }

        public static androidx.camera.camera2.internal.Camera2CameraImpl.InternalState[] values() {
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState[] r0 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState[] r0 = (androidx.camera.camera2.internal.Camera2CameraImpl.InternalState[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    final class StateCallback extends android.hardware.camera2.CameraDevice.StateCallback {

        @androidx.annotation.NonNull
        private final androidx.camera.camera2.internal.Camera2CameraImpl.StateCallback.CameraReopenMonitor mCameraReopenMonitor;
        private final java.util.concurrent.Executor mExecutor;
        java.util.concurrent.ScheduledFuture<?> mScheduledReopenHandle;
        private androidx.camera.camera2.internal.Camera2CameraImpl.StateCallback.ScheduledReopen mScheduledReopenRunnable;
        private final java.util.concurrent.ScheduledExecutorService mScheduler;
        final /* synthetic */ androidx.camera.camera2.internal.Camera2CameraImpl this$0;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class CameraReopenMonitor {
            static final int ACTIVE_REOPEN_DELAY_BASE_MS = 1000;
            static final int ACTIVE_REOPEN_LIMIT_MS = 1800000;
            static final int INVALID_TIME = -1;
            static final int REOPEN_DELAY_MS = 700;
            static final int REOPEN_LIMIT_MS = 10000;
            private long mFirstReopenTime;
            final /* synthetic */ androidx.camera.camera2.internal.Camera2CameraImpl.StateCallback this$1;

            CameraReopenMonitor(androidx.camera.camera2.internal.Camera2CameraImpl.StateCallback r3) {
                    r2 = this;
                    r2.this$1 = r3
                    r2.<init>()
                    r0 = -1
                    r2.mFirstReopenTime = r0
                    return
            }

            boolean canScheduleCameraReopen() {
                    r5 = this;
                    long r0 = r5.getElapsedTime()
                    int r2 = r5.getReopenLimitMs()
                    long r2 = (long) r2
                    int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    if (r4 < 0) goto L12
                    r5.reset()
                    r0 = 0
                    return r0
                L12:
                    r0 = 1
                    return r0
            }

            long getElapsedTime() {
                    r7 = this;
                    long r0 = android.os.SystemClock.uptimeMillis()
                    long r2 = r7.mFirstReopenTime
                    r4 = -1
                    int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                    if (r6 != 0) goto Le
                    r7.mFirstReopenTime = r0
                Le:
                    long r2 = r7.mFirstReopenTime
                    long r0 = r0 - r2
                    return r0
            }

            int getReopenDelayMs() {
                    r5 = this;
                    androidx.camera.camera2.internal.Camera2CameraImpl$StateCallback r0 = r5.this$1
                    boolean r0 = r0.shouldActiveResume()
                    if (r0 != 0) goto Lb
                    r0 = 700(0x2bc, float:9.81E-43)
                    return r0
                Lb:
                    long r0 = r5.getElapsedTime()
                    r2 = 120000(0x1d4c0, double:5.9288E-319)
                    int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    if (r4 > 0) goto L19
                    r0 = 1000(0x3e8, float:1.401E-42)
                    return r0
                L19:
                    r2 = 300000(0x493e0, double:1.482197E-318)
                    int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    if (r4 > 0) goto L23
                    r0 = 2000(0x7d0, float:2.803E-42)
                    return r0
                L23:
                    r0 = 4000(0xfa0, float:5.605E-42)
                    return r0
            }

            int getReopenLimitMs() {
                    r1 = this;
                    androidx.camera.camera2.internal.Camera2CameraImpl$StateCallback r0 = r1.this$1
                    boolean r0 = r0.shouldActiveResume()
                    if (r0 != 0) goto Lb
                    r0 = 10000(0x2710, float:1.4013E-41)
                    return r0
                Lb:
                    r0 = 1800000(0x1b7740, float:2.522337E-39)
                    return r0
            }

            void reset() {
                    r2 = this;
                    r0 = -1
                    r2.mFirstReopenTime = r0
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class ScheduledReopen implements java.lang.Runnable {
            private boolean mCancelled;
            private java.util.concurrent.Executor mExecutor;
            final /* synthetic */ androidx.camera.camera2.internal.Camera2CameraImpl.StateCallback this$1;

            ScheduledReopen(@androidx.annotation.NonNull androidx.camera.camera2.internal.Camera2CameraImpl.StateCallback r1, java.util.concurrent.Executor r2) {
                    r0 = this;
                    r0.this$1 = r1
                    r0.<init>()
                    r1 = 0
                    r0.mCancelled = r1
                    r0.mExecutor = r2
                    return
            }

            public static /* synthetic */ void a(androidx.camera.camera2.internal.Camera2CameraImpl.StateCallback.ScheduledReopen r3) {
                    boolean r0 = r3.mCancelled
                    if (r0 != 0) goto L2c
                    androidx.camera.camera2.internal.Camera2CameraImpl$StateCallback r0 = r3.this$1
                    androidx.camera.camera2.internal.Camera2CameraImpl r0 = r0.this$0
                    androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r0 = r0.mState
                    androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.REOPENING
                    r2 = 1
                    if (r0 != r1) goto L11
                    r0 = 1
                    goto L12
                L11:
                    r0 = 0
                L12:
                    androidx.core.util.Preconditions.checkState(r0)
                    androidx.camera.camera2.internal.Camera2CameraImpl$StateCallback r0 = r3.this$1
                    boolean r0 = r0.shouldActiveResume()
                    if (r0 == 0) goto L25
                    androidx.camera.camera2.internal.Camera2CameraImpl$StateCallback r3 = r3.this$1
                    androidx.camera.camera2.internal.Camera2CameraImpl r3 = r3.this$0
                    r3.tryForceOpenCameraDevice(r2)
                    return
                L25:
                    androidx.camera.camera2.internal.Camera2CameraImpl$StateCallback r3 = r3.this$1
                    androidx.camera.camera2.internal.Camera2CameraImpl r3 = r3.this$0
                    r3.tryOpenCameraDevice(r2)
                L2c:
                    return
            }

            void cancel() {
                    r1 = this;
                    r0 = 1
                    r1.mCancelled = r0
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r2 = this;
                    java.util.concurrent.Executor r0 = r2.mExecutor
                    androidx.camera.camera2.internal.m0 r1 = new androidx.camera.camera2.internal.m0
                    r1.<init>(r2)
                    r0.execute(r1)
                    return
            }
        }

        StateCallback(@androidx.annotation.NonNull androidx.camera.camera2.internal.Camera2CameraImpl r1, @androidx.annotation.NonNull java.util.concurrent.Executor r2, java.util.concurrent.ScheduledExecutorService r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                androidx.camera.camera2.internal.Camera2CameraImpl$StateCallback$CameraReopenMonitor r1 = new androidx.camera.camera2.internal.Camera2CameraImpl$StateCallback$CameraReopenMonitor
                r1.<init>(r0)
                r0.mCameraReopenMonitor = r1
                r0.mExecutor = r2
                r0.mScheduler = r3
                return
        }

        private void handleErrorOnOpen(@androidx.annotation.NonNull android.hardware.camera2.CameraDevice r6, int r7) {
                r5 = this;
                androidx.camera.camera2.internal.Camera2CameraImpl r0 = r5.this$0
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r0 = r0.mState
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.OPENING
                r2 = 1
                r3 = 0
                if (r0 == r1) goto L25
                androidx.camera.camera2.internal.Camera2CameraImpl r0 = r5.this$0
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r0 = r0.mState
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.OPENED
                if (r0 == r1) goto L25
                androidx.camera.camera2.internal.Camera2CameraImpl r0 = r5.this$0
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r0 = r0.mState
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.CONFIGURED
                if (r0 == r1) goto L25
                androidx.camera.camera2.internal.Camera2CameraImpl r0 = r5.this$0
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r0 = r0.mState
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.REOPENING
                if (r0 != r1) goto L23
                goto L25
            L23:
                r0 = 0
                goto L26
            L25:
                r0 = 1
            L26:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r4 = "Attempt to handle open error from non open state: "
                r1.append(r4)
                androidx.camera.camera2.internal.Camera2CameraImpl r4 = r5.this$0
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r4 = r4.mState
                r1.append(r4)
                java.lang.String r1 = r1.toString()
                androidx.core.util.Preconditions.checkState(r0, r1)
                r0 = 2
                java.lang.String r1 = "Camera2CameraImpl"
                if (r7 == r2) goto L88
                if (r7 == r0) goto L88
                r4 = 4
                if (r7 == r4) goto L88
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Error observed on open (or opening) camera device "
                r0.append(r2)
                java.lang.String r6 = r6.getId()
                r0.append(r6)
                java.lang.String r6 = ": "
                r0.append(r6)
                java.lang.String r6 = androidx.camera.camera2.internal.Camera2CameraImpl.getErrorMessage(r7)
                r0.append(r6)
                java.lang.String r6 = " closing camera."
                r0.append(r6)
                java.lang.String r6 = r0.toString()
                androidx.camera.core.Logger.e(r1, r6)
                r6 = 3
                if (r7 != r6) goto L76
                r6 = 5
                goto L77
            L76:
                r6 = 6
            L77:
                androidx.camera.camera2.internal.Camera2CameraImpl r7 = r5.this$0
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r0 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.CLOSING
                androidx.camera.core.CameraState$StateError r6 = androidx.camera.core.CameraState.StateError.create(r6)
                r7.setState(r0, r6)
                androidx.camera.camera2.internal.Camera2CameraImpl r6 = r5.this$0
                r6.closeCamera(r3)
                return
            L88:
                java.lang.String r6 = r6.getId()
                java.lang.String r4 = androidx.camera.camera2.internal.Camera2CameraImpl.getErrorMessage(r7)
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r0[r3] = r6
                r0[r2] = r4
                java.lang.String r6 = "Attempt to reopen camera[%s] after error[%s]"
                java.lang.String r6 = java.lang.String.format(r6, r0)
                androidx.camera.core.Logger.d(r1, r6)
                r5.reopenCameraAfterError(r7)
                return
        }

        private void reopenCameraAfterError(int r5) {
                r4 = this;
                androidx.camera.camera2.internal.Camera2CameraImpl r0 = r4.this$0
                int r0 = r0.mCameraDeviceError
                r1 = 0
                r2 = 1
                if (r0 == 0) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                java.lang.String r3 = "Can only reopen camera device after error if the camera device is actually in an error state."
                androidx.core.util.Preconditions.checkState(r0, r3)
                r0 = 2
                if (r5 == r2) goto L17
                if (r5 == r0) goto L18
                r2 = 3
                goto L18
            L17:
                r2 = 2
            L18:
                androidx.camera.camera2.internal.Camera2CameraImpl r5 = r4.this$0
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r0 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.REOPENING
                androidx.camera.core.CameraState$StateError r2 = androidx.camera.core.CameraState.StateError.create(r2)
                r5.setState(r0, r2)
                androidx.camera.camera2.internal.Camera2CameraImpl r5 = r4.this$0
                r5.closeCamera(r1)
                return
        }

        boolean cancelScheduledReopen() {
                r4 = this;
                java.util.concurrent.ScheduledFuture<?> r0 = r4.mScheduledReopenHandle
                r1 = 0
                if (r0 == 0) goto L2e
                androidx.camera.camera2.internal.Camera2CameraImpl r0 = r4.this$0
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Cancelling scheduled re-open: "
                r2.append(r3)
                androidx.camera.camera2.internal.Camera2CameraImpl$StateCallback$ScheduledReopen r3 = r4.mScheduledReopenRunnable
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r0.debugLog(r2)
                androidx.camera.camera2.internal.Camera2CameraImpl$StateCallback$ScheduledReopen r0 = r4.mScheduledReopenRunnable
                r0.cancel()
                r0 = 0
                r4.mScheduledReopenRunnable = r0
                java.util.concurrent.ScheduledFuture<?> r2 = r4.mScheduledReopenHandle
                r2.cancel(r1)
                r4.mScheduledReopenHandle = r0
                r0 = 1
                return r0
            L2e:
                return r1
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(@androidx.annotation.NonNull android.hardware.camera2.CameraDevice r5) {
                r4 = this;
                androidx.camera.camera2.internal.Camera2CameraImpl r0 = r4.this$0
                java.lang.String r1 = "CameraDevice.onClosed()"
                r0.debugLog(r1)
                androidx.camera.camera2.internal.Camera2CameraImpl r0 = r4.this$0
                android.hardware.camera2.CameraDevice r0 = r0.mCameraDevice
                r1 = 0
                if (r0 != 0) goto L10
                r0 = 1
                goto L11
            L10:
                r0 = 0
            L11:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Unexpected onClose callback on camera device: "
                r2.append(r3)
                r2.append(r5)
                java.lang.String r5 = r2.toString()
                androidx.core.util.Preconditions.checkState(r0, r5)
                int[] r5 = androidx.camera.camera2.internal.Camera2CameraImpl.AnonymousClass3.$SwitchMap$androidx$camera$camera2$internal$Camera2CameraImpl$InternalState
                androidx.camera.camera2.internal.Camera2CameraImpl r0 = r4.this$0
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r0 = r0.mState
                int r0 = r0.ordinal()
                r5 = r5[r0]
                r0 = 3
                if (r5 == r0) goto L81
                r0 = 7
                if (r5 == r0) goto L57
                r0 = 8
                if (r5 != r0) goto L3c
                goto L81
            L3c:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Camera closed while in state: "
                r0.append(r1)
                androidx.camera.camera2.internal.Camera2CameraImpl r1 = r4.this$0
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = r1.mState
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r5.<init>(r0)
                throw r5
            L57:
                androidx.camera.camera2.internal.Camera2CameraImpl r5 = r4.this$0
                int r0 = r5.mCameraDeviceError
                if (r0 == 0) goto L7d
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Camera closed due to error: "
                r0.append(r1)
                androidx.camera.camera2.internal.Camera2CameraImpl r1 = r4.this$0
                int r1 = r1.mCameraDeviceError
                java.lang.String r1 = androidx.camera.camera2.internal.Camera2CameraImpl.getErrorMessage(r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r5.debugLog(r0)
                r4.scheduleCameraReopen()
                return
            L7d:
                r5.tryOpenCameraDevice(r1)
                return
            L81:
                androidx.camera.camera2.internal.Camera2CameraImpl r5 = r4.this$0
                boolean r5 = r5.isSessionCloseComplete()
                androidx.core.util.Preconditions.checkState(r5)
                androidx.camera.camera2.internal.Camera2CameraImpl r5 = r4.this$0
                r5.finishClose()
                return
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(@androidx.annotation.NonNull android.hardware.camera2.CameraDevice r3) {
                r2 = this;
                androidx.camera.camera2.internal.Camera2CameraImpl r0 = r2.this$0
                java.lang.String r1 = "CameraDevice.onDisconnected()"
                r0.debugLog(r1)
                r0 = 1
                r2.onError(r3, r0)
                return
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(@androidx.annotation.NonNull android.hardware.camera2.CameraDevice r9, int r10) {
                r8 = this;
                androidx.camera.camera2.internal.Camera2CameraImpl r0 = r8.this$0
                r0.mCameraDevice = r9
                r0.mCameraDeviceError = r10
                int[] r1 = androidx.camera.camera2.internal.Camera2CameraImpl.AnonymousClass3.$SwitchMap$androidx$camera$camera2$internal$Camera2CameraImpl$InternalState
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r0 = r0.mState
                int r0 = r0.ordinal()
                r0 = r1[r0]
                r1 = 2
                r2 = 1
                r3 = 3
                r4 = 0
                java.lang.String r5 = "Camera2CameraImpl"
                switch(r0) {
                    case 3: goto L59;
                    case 4: goto L34;
                    case 5: goto L34;
                    case 6: goto L34;
                    case 7: goto L34;
                    case 8: goto L59;
                    default: goto L19;
                }
            L19:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r0 = "onError() should not be possible from state: "
                r10.append(r0)
                androidx.camera.camera2.internal.Camera2CameraImpl r0 = r8.this$0
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r0 = r0.mState
                r10.append(r0)
                java.lang.String r10 = r10.toString()
                r9.<init>(r10)
                throw r9
            L34:
                java.lang.String r0 = r9.getId()
                java.lang.String r6 = androidx.camera.camera2.internal.Camera2CameraImpl.getErrorMessage(r10)
                androidx.camera.camera2.internal.Camera2CameraImpl r7 = r8.this$0
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r7 = r7.mState
                java.lang.String r7 = r7.name()
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r3[r4] = r0
                r3[r2] = r6
                r3[r1] = r7
                java.lang.String r0 = "CameraDevice.onError(): %s failed with %s while in %s state. Will attempt recovering from error."
                java.lang.String r0 = java.lang.String.format(r0, r3)
                androidx.camera.core.Logger.d(r5, r0)
                r8.handleErrorOnOpen(r9, r10)
                return
            L59:
                java.lang.String r9 = r9.getId()
                java.lang.String r10 = androidx.camera.camera2.internal.Camera2CameraImpl.getErrorMessage(r10)
                androidx.camera.camera2.internal.Camera2CameraImpl r0 = r8.this$0
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r0 = r0.mState
                java.lang.String r0 = r0.name()
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r3[r4] = r9
                r3[r2] = r10
                r3[r1] = r0
                java.lang.String r9 = "CameraDevice.onError(): %s failed with %s while in %s state. Will finish closing camera."
                java.lang.String r9 = java.lang.String.format(r9, r3)
                androidx.camera.core.Logger.e(r5, r9)
                androidx.camera.camera2.internal.Camera2CameraImpl r9 = r8.this$0
                r9.closeCamera(r4)
                return
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(@androidx.annotation.NonNull android.hardware.camera2.CameraDevice r4) {
                r3 = this;
                androidx.camera.camera2.internal.Camera2CameraImpl r0 = r3.this$0
                java.lang.String r1 = "CameraDevice.onOpened()"
                r0.debugLog(r1)
                androidx.camera.camera2.internal.Camera2CameraImpl r0 = r3.this$0
                r0.mCameraDevice = r4
                r1 = 0
                r0.mCameraDeviceError = r1
                r3.resetReopenMonitor()
                int[] r0 = androidx.camera.camera2.internal.Camera2CameraImpl.AnonymousClass3.$SwitchMap$androidx$camera$camera2$internal$Camera2CameraImpl$InternalState
                androidx.camera.camera2.internal.Camera2CameraImpl r1 = r3.this$0
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = r1.mState
                int r1 = r1.ordinal()
                r0 = r0[r1]
                r1 = 3
                if (r0 == r1) goto L6f
                r1 = 6
                if (r0 == r1) goto L46
                r1 = 7
                if (r0 == r1) goto L46
                r4 = 8
                if (r0 != r4) goto L2b
                goto L6f
            L2b:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "onOpened() should not be possible from state: "
                r0.append(r1)
                androidx.camera.camera2.internal.Camera2CameraImpl r1 = r3.this$0
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = r1.mState
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r4.<init>(r0)
                throw r4
            L46:
                androidx.camera.camera2.internal.Camera2CameraImpl r0 = r3.this$0
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.OPENED
                r0.setState(r1)
                androidx.camera.camera2.internal.Camera2CameraImpl r0 = r3.this$0
                androidx.camera.core.impl.CameraStateRegistry r0 = r0.mCameraStateRegistry
                java.lang.String r4 = r4.getId()
                androidx.camera.camera2.internal.Camera2CameraImpl r1 = r3.this$0
                androidx.camera.core.concurrent.CameraCoordinator r2 = r1.mCameraCoordinator
                android.hardware.camera2.CameraDevice r1 = r1.mCameraDevice
                java.lang.String r1 = r1.getId()
                java.lang.String r1 = r2.getPairedConcurrentCameraId(r1)
                boolean r4 = r0.tryOpenCaptureSession(r4, r1)
                if (r4 == 0) goto L6e
                androidx.camera.camera2.internal.Camera2CameraImpl r4 = r3.this$0
                r4.openCaptureSession()
            L6e:
                return
            L6f:
                androidx.camera.camera2.internal.Camera2CameraImpl r4 = r3.this$0
                boolean r4 = r4.isSessionCloseComplete()
                androidx.core.util.Preconditions.checkState(r4)
                androidx.camera.camera2.internal.Camera2CameraImpl r4 = r3.this$0
                android.hardware.camera2.CameraDevice r4 = r4.mCameraDevice
                r4.close()
                androidx.camera.camera2.internal.Camera2CameraImpl r4 = r3.this$0
                r0 = 0
                r4.mCameraDevice = r0
                return
        }

        void resetReopenMonitor() {
                r1 = this;
                androidx.camera.camera2.internal.Camera2CameraImpl$StateCallback$CameraReopenMonitor r0 = r1.mCameraReopenMonitor
                r0.reset()
                return
        }

        void scheduleCameraReopen() {
                r5 = this;
                androidx.camera.camera2.internal.Camera2CameraImpl$StateCallback$ScheduledReopen r0 = r5.mScheduledReopenRunnable
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                androidx.core.util.Preconditions.checkState(r0)
                java.util.concurrent.ScheduledFuture<?> r0 = r5.mScheduledReopenHandle
                if (r0 != 0) goto L11
                goto L12
            L11:
                r1 = 0
            L12:
                androidx.core.util.Preconditions.checkState(r1)
                androidx.camera.camera2.internal.Camera2CameraImpl$StateCallback$CameraReopenMonitor r0 = r5.mCameraReopenMonitor
                boolean r0 = r0.canScheduleCameraReopen()
                if (r0 == 0) goto L6c
                androidx.camera.camera2.internal.Camera2CameraImpl$StateCallback$ScheduledReopen r0 = new androidx.camera.camera2.internal.Camera2CameraImpl$StateCallback$ScheduledReopen
                java.util.concurrent.Executor r1 = r5.mExecutor
                r0.<init>(r5, r1)
                r5.mScheduledReopenRunnable = r0
                androidx.camera.camera2.internal.Camera2CameraImpl r0 = r5.this$0
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Attempting camera re-open in "
                r1.append(r2)
                androidx.camera.camera2.internal.Camera2CameraImpl$StateCallback$CameraReopenMonitor r2 = r5.mCameraReopenMonitor
                int r2 = r2.getReopenDelayMs()
                r1.append(r2)
                java.lang.String r2 = "ms: "
                r1.append(r2)
                androidx.camera.camera2.internal.Camera2CameraImpl$StateCallback$ScheduledReopen r2 = r5.mScheduledReopenRunnable
                r1.append(r2)
                java.lang.String r2 = " activeResuming = "
                r1.append(r2)
                androidx.camera.camera2.internal.Camera2CameraImpl r2 = r5.this$0
                boolean r2 = r2.mIsActiveResumingMode
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.debugLog(r1)
                java.util.concurrent.ScheduledExecutorService r0 = r5.mScheduler
                androidx.camera.camera2.internal.Camera2CameraImpl$StateCallback$ScheduledReopen r1 = r5.mScheduledReopenRunnable
                androidx.camera.camera2.internal.Camera2CameraImpl$StateCallback$CameraReopenMonitor r2 = r5.mCameraReopenMonitor
                int r2 = r2.getReopenDelayMs()
                long r2 = (long) r2
                java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
                java.util.concurrent.ScheduledFuture r0 = r0.schedule(r1, r2, r4)
                r5.mScheduledReopenHandle = r0
                return
            L6c:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Camera reopening attempted for "
                r0.append(r1)
                androidx.camera.camera2.internal.Camera2CameraImpl$StateCallback$CameraReopenMonitor r1 = r5.mCameraReopenMonitor
                int r1 = r1.getReopenLimitMs()
                r0.append(r1)
                java.lang.String r1 = "ms without success."
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "Camera2CameraImpl"
                androidx.camera.core.Logger.e(r1, r0)
                androidx.camera.camera2.internal.Camera2CameraImpl r0 = r5.this$0
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.PENDING_OPEN
                r3 = 0
                r0.setState(r1, r3, r2)
                return
        }

        boolean shouldActiveResume() {
                r3 = this;
                androidx.camera.camera2.internal.Camera2CameraImpl r0 = r3.this$0
                boolean r1 = r0.mIsActiveResumingMode
                if (r1 == 0) goto Lf
                int r0 = r0.mCameraDeviceError
                r1 = 1
                if (r0 == r1) goto Le
                r2 = 2
                if (r0 != r2) goto Lf
            Le:
                return r1
            Lf:
                r0 = 0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.auto.value.AutoValue
    static abstract class UseCaseInfo {
        UseCaseInfo() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        static androidx.camera.camera2.internal.Camera2CameraImpl.UseCaseInfo create(@androidx.annotation.NonNull java.lang.String r6, @androidx.annotation.NonNull java.lang.Class<?> r7, @androidx.annotation.NonNull androidx.camera.core.impl.SessionConfig r8, @androidx.annotation.NonNull androidx.camera.core.impl.UseCaseConfig<?> r9, @androidx.annotation.Nullable android.util.Size r10) {
                androidx.camera.camera2.internal.AutoValue_Camera2CameraImpl_UseCaseInfo r0 = new androidx.camera.camera2.internal.AutoValue_Camera2CameraImpl_UseCaseInfo
                r1 = r6
                r2 = r7
                r3 = r8
                r4 = r9
                r5 = r10
                r0.<init>(r1, r2, r3, r4, r5)
                return r0
        }

        @androidx.annotation.NonNull
        static androidx.camera.camera2.internal.Camera2CameraImpl.UseCaseInfo from(@androidx.annotation.NonNull androidx.camera.core.UseCase r4) {
                java.lang.String r0 = androidx.camera.camera2.internal.Camera2CameraImpl.getUseCaseId(r4)
                java.lang.Class r1 = r4.getClass()
                androidx.camera.core.impl.SessionConfig r2 = r4.getSessionConfig()
                androidx.camera.core.impl.UseCaseConfig r3 = r4.getCurrentConfig()
                android.util.Size r4 = r4.getAttachedSurfaceResolution()
                androidx.camera.camera2.internal.Camera2CameraImpl$UseCaseInfo r4 = create(r0, r1, r2, r3, r4)
                return r4
        }

        @androidx.annotation.NonNull
        abstract androidx.camera.core.impl.SessionConfig getSessionConfig();

        @androidx.annotation.Nullable
        abstract android.util.Size getSurfaceResolution();

        @androidx.annotation.NonNull
        abstract androidx.camera.core.impl.UseCaseConfig<?> getUseCaseConfig();

        @androidx.annotation.NonNull
        abstract java.lang.String getUseCaseId();

        @androidx.annotation.NonNull
        abstract java.lang.Class<?> getUseCaseType();
    }

    Camera2CameraImpl(@androidx.annotation.NonNull androidx.camera.camera2.internal.compat.CameraManagerCompat r10, @androidx.annotation.NonNull java.lang.String r11, @androidx.annotation.NonNull androidx.camera.camera2.internal.Camera2CameraInfoImpl r12, @androidx.annotation.NonNull androidx.camera.core.concurrent.CameraCoordinator r13, @androidx.annotation.NonNull androidx.camera.core.impl.CameraStateRegistry r14, @androidx.annotation.NonNull java.util.concurrent.Executor r15, @androidx.annotation.NonNull android.os.Handler r16, @androidx.annotation.NonNull androidx.camera.camera2.internal.DisplayInfoManager r17) throws androidx.camera.core.CameraUnavailableException {
            r9 = this;
            r9.<init>()
            androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.INITIALIZED
            r9.mState = r1
            androidx.camera.core.impl.LiveDataObservable r1 = new androidx.camera.core.impl.LiveDataObservable
            r1.<init>()
            r9.mObservableState = r1
            r2 = 0
            r9.mCameraDeviceError = r2
            java.util.concurrent.atomic.AtomicInteger r3 = new java.util.concurrent.atomic.AtomicInteger
            r3.<init>(r2)
            r9.mReleaseRequestCount = r3
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            r9.mReleasedCaptureSessions = r3
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r9.mConfiguringForClose = r3
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r9.mNotifyStateAttachedSet = r3
            androidx.camera.core.impl.CameraConfig r3 = androidx.camera.core.impl.CameraConfigs.emptyConfig()
            r9.mCameraConfig = r3
            java.lang.Object r3 = new java.lang.Object
            r3.<init>()
            r9.mLock = r3
            r9.mIsActiveResumingMode = r2
            r9.mCameraManager = r10
            r9.mCameraCoordinator = r13
            r9.mCameraStateRegistry = r14
            java.util.concurrent.ScheduledExecutorService r4 = androidx.camera.core.impl.utils.executor.CameraXExecutors.newHandlerExecutor(r16)
            r9.mScheduledExecutorService = r4
            java.util.concurrent.Executor r3 = androidx.camera.core.impl.utils.executor.CameraXExecutors.newSequentialExecutor(r15)
            r9.mExecutor = r3
            androidx.camera.camera2.internal.Camera2CameraImpl$StateCallback r2 = new androidx.camera.camera2.internal.Camera2CameraImpl$StateCallback
            r2.<init>(r9, r3, r4)
            r9.mStateCallback = r2
            androidx.camera.core.impl.UseCaseAttachState r2 = new androidx.camera.core.impl.UseCaseAttachState
            r2.<init>(r11)
            r9.mUseCaseAttachState = r2
            androidx.camera.core.impl.CameraInternal$State r2 = androidx.camera.core.impl.CameraInternal.State.CLOSED
            r1.postValue(r2)
            androidx.camera.camera2.internal.CameraStateMachine r1 = new androidx.camera.camera2.internal.CameraStateMachine
            r1.<init>(r14)
            r9.mCameraStateMachine = r1
            androidx.camera.camera2.internal.CaptureSessionRepository r8 = new androidx.camera.camera2.internal.CaptureSessionRepository
            r8.<init>(r3)
            r9.mCaptureSessionRepository = r8
            r2 = r17
            r9.mDisplayInfoManager = r2
            r5 = r3
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r3 = r10.getCameraCharacteristicsCompat(r11)     // Catch: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> Lcb
            r9.mCameraCharacteristicsCompat = r3     // Catch: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> Lcb
            androidx.camera.camera2.internal.Camera2CameraControlImpl r2 = new androidx.camera.camera2.internal.Camera2CameraControlImpl     // Catch: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> Lcb
            androidx.camera.camera2.internal.Camera2CameraImpl$ControlUpdateListenerInternal r6 = new androidx.camera.camera2.internal.Camera2CameraImpl$ControlUpdateListenerInternal     // Catch: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> Lcb
            r6.<init>(r9)     // Catch: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> Lcb
            androidx.camera.core.impl.Quirks r7 = r12.getCameraQuirks()     // Catch: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> Lcb
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> Lcb
            r9.mCameraControlInternal = r2     // Catch: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> Lcb
            r9.mCameraInfoInternal = r12     // Catch: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> Lcb
            r12.linkWithCameraControl(r2)     // Catch: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> Lcb
            androidx.lifecycle.LiveData r1 = r1.getStateLiveData()     // Catch: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> Lcb
            r12.setCameraStateSource(r1)     // Catch: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> Lcb
            androidx.camera.camera2.internal.compat.params.DynamicRangesCompat r1 = androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.fromCameraCharacteristics(r3)
            r9.mDynamicRangesCompat = r1
            androidx.camera.camera2.internal.CaptureSessionInterface r1 = r9.newCaptureSession()
            r9.mCaptureSession = r1
            androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener$Builder r2 = new androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener$Builder
            androidx.camera.core.impl.Quirks r7 = r12.getCameraQuirks()
            r6 = r8
            androidx.camera.core.impl.Quirks r8 = androidx.camera.camera2.internal.compat.quirk.DeviceQuirks.getAll()
            r3 = r5
            r5 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r5 = r3
            r9.mCaptureSessionOpenerBuilder = r2
            androidx.camera.camera2.internal.Camera2CameraImpl$CameraAvailability r12 = new androidx.camera.camera2.internal.Camera2CameraImpl$CameraAvailability
            r12.<init>(r9, r11)
            r9.mCameraAvailability = r12
            androidx.camera.camera2.internal.Camera2CameraImpl$CameraConfigureAvailable r11 = new androidx.camera.camera2.internal.Camera2CameraImpl$CameraConfigureAvailable
            r11.<init>(r9)
            r9.mCameraConfigureAvailable = r11
            r14.registerCamera(r9, r5, r11, r12)
            r10.registerAvailabilityCallback(r5, r12)
            return
        Lcb:
            r0 = move-exception
            r10 = r0
            androidx.camera.core.CameraUnavailableException r10 = androidx.camera.camera2.internal.CameraUnavailableExceptionHelper.createFrom(r10)
            throw r10
    }

    public static /* synthetic */ java.lang.Object a(androidx.camera.camera2.internal.Camera2CameraImpl r2, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r3) {
            java.util.concurrent.Executor r0 = r2.mExecutor
            androidx.camera.camera2.internal.x r1 = new androidx.camera.camera2.internal.x
            r1.<init>(r2, r3)
            r0.execute(r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Release[request="
            r3.append(r0)
            java.util.concurrent.atomic.AtomicInteger r2 = r2.mReleaseRequestCount
            int r2 = r2.getAndIncrement()
            r3.append(r2)
            java.lang.String r2 = "]"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            return r2
    }

    private void addMeteringRepeating() {
            r4 = this;
            androidx.camera.camera2.internal.MeteringRepeatingSession r0 = r4.mMeteringRepeatingSession
            if (r0 == 0) goto L2a
            java.lang.String r0 = getMeteringRepeatingId(r0)
            androidx.camera.core.impl.UseCaseAttachState r1 = r4.mUseCaseAttachState
            androidx.camera.camera2.internal.MeteringRepeatingSession r2 = r4.mMeteringRepeatingSession
            androidx.camera.core.impl.SessionConfig r2 = r2.getSessionConfig()
            androidx.camera.camera2.internal.MeteringRepeatingSession r3 = r4.mMeteringRepeatingSession
            androidx.camera.core.impl.UseCaseConfig r3 = r3.getUseCaseConfig()
            r1.setUseCaseAttached(r0, r2, r3)
            androidx.camera.core.impl.UseCaseAttachState r1 = r4.mUseCaseAttachState
            androidx.camera.camera2.internal.MeteringRepeatingSession r2 = r4.mMeteringRepeatingSession
            androidx.camera.core.impl.SessionConfig r2 = r2.getSessionConfig()
            androidx.camera.camera2.internal.MeteringRepeatingSession r3 = r4.mMeteringRepeatingSession
            androidx.camera.core.impl.UseCaseConfig r3 = r3.getUseCaseConfig()
            r1.setUseCaseActive(r0, r2, r3)
        L2a:
            return
    }

    private void addOrRemoveMeteringRepeatingUseCase() {
            r4 = this;
            androidx.camera.core.impl.UseCaseAttachState r0 = r4.mUseCaseAttachState
            androidx.camera.core.impl.SessionConfig$ValidatingBuilder r0 = r0.getAttachedBuilder()
            androidx.camera.core.impl.SessionConfig r0 = r0.build()
            androidx.camera.core.impl.CaptureConfig r1 = r0.getRepeatingCaptureConfig()
            java.util.List r2 = r1.getSurfaces()
            int r2 = r2.size()
            java.util.List r3 = r0.getSurfaces()
            int r3 = r3.size()
            java.util.List r0 = r0.getSurfaces()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L7c
            java.util.List r0 = r1.getSurfaces()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L4e
            androidx.camera.camera2.internal.MeteringRepeatingSession r0 = r4.mMeteringRepeatingSession
            if (r0 != 0) goto L4a
            androidx.camera.camera2.internal.MeteringRepeatingSession r0 = new androidx.camera.camera2.internal.MeteringRepeatingSession
            androidx.camera.camera2.internal.Camera2CameraInfoImpl r1 = r4.mCameraInfoInternal
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r1 = r1.getCameraCharacteristicsCompat()
            androidx.camera.camera2.internal.DisplayInfoManager r2 = r4.mDisplayInfoManager
            androidx.camera.camera2.internal.w r3 = new androidx.camera.camera2.internal.w
            r3.<init>(r4)
            r0.<init>(r1, r2, r3)
            r4.mMeteringRepeatingSession = r0
        L4a:
            r4.addMeteringRepeating()
            return
        L4e:
            r0 = 1
            if (r3 != r0) goto L57
            if (r2 != r0) goto L57
            r4.removeMeteringRepeating()
            return
        L57:
            r0 = 2
            if (r2 < r0) goto L5e
            r4.removeMeteringRepeating()
            return
        L5e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "mMeteringRepeating is ATTACHED, SessionConfig Surfaces: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = ", CaptureConfig Surfaces: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Camera2CameraImpl"
            androidx.camera.core.Logger.d(r1, r0)
        L7c:
            return
    }

    public static /* synthetic */ void b(androidx.camera.core.impl.SessionConfig.ErrorListener r1, androidx.camera.core.impl.SessionConfig r2) {
            androidx.camera.core.impl.SessionConfig$SessionError r0 = androidx.camera.core.impl.SessionConfig.SessionError.SESSION_ERROR_SURFACE_NEEDS_RESET
            r1.onError(r2, r0)
            return
    }

    public static /* synthetic */ void c(androidx.camera.camera2.internal.Camera2CameraImpl r0, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r1) {
            com.google.common.util.concurrent.ListenableFuture r0 = r0.releaseInternal()
            androidx.camera.core.impl.utils.futures.Futures.propagate(r0, r1)
            return
    }

    private boolean checkAndAttachRepeatingSurface(androidx.camera.core.impl.CaptureConfig.Builder r6) {
            r5 = this;
            java.util.Set r0 = r6.getSurfaces()
            boolean r0 = r0.isEmpty()
            r1 = 0
            java.lang.String r2 = "Camera2CameraImpl"
            if (r0 != 0) goto L13
            java.lang.String r6 = "The capture config builder already has surface inside."
            androidx.camera.core.Logger.w(r2, r6)
            return r1
        L13:
            androidx.camera.core.impl.UseCaseAttachState r0 = r5.mUseCaseAttachState
            java.util.Collection r0 = r0.getActiveAndAttachedSessionConfigs()
            java.util.Iterator r0 = r0.iterator()
        L1d:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L4b
            java.lang.Object r3 = r0.next()
            androidx.camera.core.impl.SessionConfig r3 = (androidx.camera.core.impl.SessionConfig) r3
            androidx.camera.core.impl.CaptureConfig r3 = r3.getRepeatingCaptureConfig()
            java.util.List r3 = r3.getSurfaces()
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L1d
            java.util.Iterator r3 = r3.iterator()
        L3b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L1d
            java.lang.Object r4 = r3.next()
            androidx.camera.core.impl.DeferrableSurface r4 = (androidx.camera.core.impl.DeferrableSurface) r4
            r6.addSurface(r4)
            goto L3b
        L4b:
            java.util.Set r6 = r6.getSurfaces()
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L5b
            java.lang.String r6 = "Unable to find a repeating surface to attach to CaptureConfig"
            androidx.camera.core.Logger.w(r2, r6)
            return r1
        L5b:
            r6 = 1
            return r6
    }

    private void closeInternal() {
            r3 = this;
            java.lang.String r0 = "Closing camera."
            r3.debugLog(r0)
            int[] r0 = androidx.camera.camera2.internal.Camera2CameraImpl.AnonymousClass3.$SwitchMap$androidx$camera$camera2$internal$Camera2CameraImpl$InternalState
            androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = r3.mState
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 2
            r2 = 0
            if (r0 == r1) goto L57
            r1 = 4
            if (r0 == r1) goto L4e
            r1 = 5
            if (r0 == r1) goto L4e
            r1 = 6
            if (r0 == r1) goto L36
            r1 = 7
            if (r0 == r1) goto L36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "close() ignored due to being in state: "
            r0.append(r1)
            androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = r3.mState
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.debugLog(r0)
            return
        L36:
            androidx.camera.camera2.internal.Camera2CameraImpl$StateCallback r0 = r3.mStateCallback
            boolean r0 = r0.cancelScheduledReopen()
            androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.CLOSING
            r3.setState(r1)
            if (r0 == 0) goto L4d
            boolean r0 = r3.isSessionCloseComplete()
            androidx.core.util.Preconditions.checkState(r0)
            r3.finishClose()
        L4d:
            return
        L4e:
            androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r0 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.CLOSING
            r3.setState(r0)
            r3.closeCamera(r2)
            return
        L57:
            android.hardware.camera2.CameraDevice r0 = r3.mCameraDevice
            if (r0 != 0) goto L5c
            r2 = 1
        L5c:
            androidx.core.util.Preconditions.checkState(r2)
            androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r0 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.INITIALIZED
            r3.setState(r0)
            return
    }

    private void configAndClose(boolean r6) {
            r5 = this;
            androidx.camera.camera2.internal.CaptureSession r0 = new androidx.camera.camera2.internal.CaptureSession
            androidx.camera.camera2.internal.compat.params.DynamicRangesCompat r1 = r5.mDynamicRangesCompat
            r0.<init>(r1)
            java.util.Set<androidx.camera.camera2.internal.CaptureSession> r1 = r5.mConfiguringForClose
            r1.add(r0)
            r5.resetCaptureSession(r6)
            android.graphics.SurfaceTexture r6 = new android.graphics.SurfaceTexture
            r1 = 0
            r6.<init>(r1)
            r1 = 640(0x280, float:8.97E-43)
            r2 = 480(0x1e0, float:6.73E-43)
            r6.setDefaultBufferSize(r1, r2)
            android.view.Surface r1 = new android.view.Surface
            r1.<init>(r6)
            androidx.camera.camera2.internal.e0 r2 = new androidx.camera.camera2.internal.e0
            r2.<init>(r1, r6)
            androidx.camera.core.impl.SessionConfig$Builder r6 = new androidx.camera.core.impl.SessionConfig$Builder
            r6.<init>()
            androidx.camera.core.impl.ImmediateSurface r3 = new androidx.camera.core.impl.ImmediateSurface
            r3.<init>(r1)
            r6.addNonRepeatingSurface(r3)
            r1 = 1
            r6.setTemplateType(r1)
            java.lang.String r1 = "Start configAndClose."
            r5.debugLog(r1)
            androidx.camera.core.impl.SessionConfig r6 = r6.build()
            android.hardware.camera2.CameraDevice r1 = r5.mCameraDevice
            java.lang.Object r1 = androidx.core.util.Preconditions.checkNotNull(r1)
            android.hardware.camera2.CameraDevice r1 = (android.hardware.camera2.CameraDevice) r1
            androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener$Builder r4 = r5.mCaptureSessionOpenerBuilder
            androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener r4 = r4.build()
            com.google.common.util.concurrent.ListenableFuture r6 = r0.open(r6, r1, r4)
            androidx.camera.camera2.internal.f0 r1 = new androidx.camera.camera2.internal.f0
            r1.<init>(r5, r0, r3, r2)
            java.util.concurrent.Executor r0 = r5.mExecutor
            r6.addListener(r1, r0)
            return
    }

    private android.hardware.camera2.CameraDevice.StateCallback createDeviceStateCallback() {
            r2 = this;
            androidx.camera.core.impl.UseCaseAttachState r0 = r2.mUseCaseAttachState
            androidx.camera.core.impl.SessionConfig$ValidatingBuilder r0 = r0.getAttachedBuilder()
            androidx.camera.core.impl.SessionConfig r0 = r0.build()
            java.util.List r0 = r0.getDeviceStateCallbacks()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            androidx.camera.camera2.internal.CaptureSessionRepository r0 = r2.mCaptureSessionRepository
            android.hardware.camera2.CameraDevice$StateCallback r0 = r0.getCameraStateCallback()
            r1.add(r0)
            androidx.camera.camera2.internal.Camera2CameraImpl$StateCallback r0 = r2.mStateCallback
            r1.add(r0)
            android.hardware.camera2.CameraDevice$StateCallback r0 = androidx.camera.camera2.internal.CameraDeviceStateCallbacks.createComboCallback(r1)
            return r0
    }

    public static /* synthetic */ void d(androidx.camera.camera2.internal.Camera2CameraImpl r1, boolean r2) {
            r1.mIsActiveResumingMode = r2
            if (r2 == 0) goto Le
            androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r2 = r1.mState
            androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r0 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.PENDING_OPEN
            if (r2 != r0) goto Le
            r2 = 0
            r1.tryForceOpenCameraDevice(r2)
        Le:
            return
    }

    private void debugLog(@androidx.annotation.NonNull java.lang.String r4, @androidx.annotation.Nullable java.lang.Throwable r5) {
            r3 = this;
            java.lang.String r0 = r3.toString()
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            r0 = 1
            r1[r0] = r4
            java.lang.String r4 = "{%s} %s"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            java.lang.String r0 = "Camera2CameraImpl"
            androidx.camera.core.Logger.d(r0, r4, r5)
            return
    }

    public static /* synthetic */ void e(androidx.camera.camera2.internal.Camera2CameraImpl r2, java.lang.String r3, androidx.camera.core.impl.SessionConfig r4, androidx.camera.core.impl.UseCaseConfig r5) {
            r2.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Use case "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = " RESET"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.debugLog(r0)
            androidx.camera.core.impl.UseCaseAttachState r0 = r2.mUseCaseAttachState
            r0.updateUseCase(r3, r4, r5)
            r2.addOrRemoveMeteringRepeatingUseCase()
            r3 = 0
            r2.resetCaptureSession(r3)
            r2.updateCaptureSessionConfig()
            androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r3 = r2.mState
            androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r4 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.OPENED
            if (r3 != r4) goto L34
            r2.openCaptureSession()
        L34:
            return
    }

    public static /* synthetic */ void f(androidx.camera.camera2.internal.Camera2CameraImpl r0, java.util.List r1) {
            r0.getClass()
            r0.tryAttachUseCases(r1)     // Catch: java.lang.Throwable -> Lc
            androidx.camera.camera2.internal.Camera2CameraControlImpl r0 = r0.mCameraControlInternal
            r0.decrementUseCount()
            return
        Lc:
            r1 = move-exception
            androidx.camera.camera2.internal.Camera2CameraControlImpl r0 = r0.mCameraControlInternal
            r0.decrementUseCount()
            throw r1
    }

    public static /* synthetic */ void g(androidx.camera.camera2.internal.Camera2CameraImpl r0) {
            r0.openInternal()
            return
    }

    static java.lang.String getErrorMessage(int r1) {
            if (r1 == 0) goto L23
            r0 = 1
            if (r1 == r0) goto L20
            r0 = 2
            if (r1 == r0) goto L1d
            r0 = 3
            if (r1 == r0) goto L1a
            r0 = 4
            if (r1 == r0) goto L17
            r0 = 5
            if (r1 == r0) goto L14
            java.lang.String r1 = "UNKNOWN ERROR"
            return r1
        L14:
            java.lang.String r1 = "ERROR_CAMERA_SERVICE"
            return r1
        L17:
            java.lang.String r1 = "ERROR_CAMERA_DEVICE"
            return r1
        L1a:
            java.lang.String r1 = "ERROR_CAMERA_DISABLED"
            return r1
        L1d:
            java.lang.String r1 = "ERROR_MAX_CAMERAS_IN_USE"
            return r1
        L20:
            java.lang.String r1 = "ERROR_CAMERA_IN_USE"
            return r1
        L23:
            java.lang.String r1 = "ERROR_NONE"
            return r1
    }

    @androidx.annotation.NonNull
    static java.lang.String getMeteringRepeatingId(@androidx.annotation.NonNull androidx.camera.camera2.internal.MeteringRepeatingSession r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.getName()
            r0.append(r1)
            int r2 = r2.hashCode()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    private com.google.common.util.concurrent.ListenableFuture<java.lang.Void> getOrCreateUserReleaseFuture() {
            r2 = this;
            com.google.common.util.concurrent.ListenableFuture<java.lang.Void> r0 = r2.mUserReleaseFuture
            if (r0 != 0) goto L1d
            androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r0 = r2.mState
            androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.RELEASED
            if (r0 == r1) goto L16
            androidx.camera.camera2.internal.a0 r0 = new androidx.camera.camera2.internal.a0
            r0.<init>(r2)
            com.google.common.util.concurrent.ListenableFuture r0 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r0)
            r2.mUserReleaseFuture = r0
            goto L1d
        L16:
            r0 = 0
            com.google.common.util.concurrent.ListenableFuture r0 = androidx.camera.core.impl.utils.futures.Futures.immediateFuture(r0)
            r2.mUserReleaseFuture = r0
        L1d:
            com.google.common.util.concurrent.ListenableFuture<java.lang.Void> r0 = r2.mUserReleaseFuture
            return r0
    }

    @androidx.annotation.NonNull
    static java.lang.String getUseCaseId(@androidx.annotation.NonNull androidx.camera.core.UseCase r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.getName()
            r0.append(r1)
            int r2 = r2.hashCode()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static /* synthetic */ java.lang.Object h(androidx.camera.camera2.internal.Camera2CameraImpl r2, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r3) {
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.lang.Void> r0 = r2.mUserReleaseNotifier
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            java.lang.String r1 = "Camera can only be released once, so release completer should be null on creation."
            androidx.core.util.Preconditions.checkState(r0, r1)
            r2.mUserReleaseNotifier = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Release[camera="
            r3.append(r0)
            r3.append(r2)
            java.lang.String r2 = "]"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            return r2
    }

    public static /* synthetic */ void i(androidx.camera.camera2.internal.Camera2CameraImpl r2, java.lang.String r3, androidx.camera.core.impl.SessionConfig r4, androidx.camera.core.impl.UseCaseConfig r5) {
            r2.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Use case "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = " UPDATED"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.debugLog(r0)
            androidx.camera.core.impl.UseCaseAttachState r0 = r2.mUseCaseAttachState
            r0.updateUseCase(r3, r4, r5)
            r2.updateCaptureSessionConfig()
            return
    }

    private boolean isLegacyDevice() {
            r2 = this;
            androidx.camera.core.impl.CameraInfoInternal r0 = r2.getCameraInfoInternal()
            androidx.camera.camera2.internal.Camera2CameraInfoImpl r0 = (androidx.camera.camera2.internal.Camera2CameraInfoImpl) r0
            int r0 = r0.getSupportedHardwareLevel()
            r1 = 2
            if (r0 != r1) goto Lf
            r0 = 1
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public static /* synthetic */ void j(androidx.camera.camera2.internal.Camera2CameraImpl r0, androidx.camera.camera2.internal.CaptureSession r1, androidx.camera.core.impl.DeferrableSurface r2, java.lang.Runnable r3) {
            r0.releaseNoOpSession(r1, r2, r3)
            return
    }

    public static /* synthetic */ void k(androidx.camera.camera2.internal.Camera2CameraImpl r1, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r2) {
            androidx.camera.camera2.internal.MeteringRepeatingSession r0 = r1.mMeteringRepeatingSession
            if (r0 != 0) goto La
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r2.set(r1)
            return
        La:
            java.lang.String r0 = getMeteringRepeatingId(r0)
            androidx.camera.core.impl.UseCaseAttachState r1 = r1.mUseCaseAttachState
            boolean r1 = r1.isUseCaseAttached(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2.set(r1)
            return
    }

    public static /* synthetic */ void l(androidx.camera.camera2.internal.Camera2CameraImpl r2, java.lang.String r3, androidx.camera.core.impl.SessionConfig r4, androidx.camera.core.impl.UseCaseConfig r5) {
            r2.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Use case "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = " ACTIVE"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.debugLog(r0)
            androidx.camera.core.impl.UseCaseAttachState r0 = r2.mUseCaseAttachState
            r0.setUseCaseActive(r3, r4, r5)
            androidx.camera.core.impl.UseCaseAttachState r0 = r2.mUseCaseAttachState
            r0.updateUseCase(r3, r4, r5)
            r2.updateCaptureSessionConfig()
            return
    }

    public static /* synthetic */ java.lang.Object m(androidx.camera.camera2.internal.Camera2CameraImpl r2, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r3) {
            r2.getClass()
            java.util.concurrent.Executor r0 = r2.mExecutor     // Catch: java.util.concurrent.RejectedExecutionException -> Le
            androidx.camera.camera2.internal.t r1 = new androidx.camera.camera2.internal.t     // Catch: java.util.concurrent.RejectedExecutionException -> Le
            r1.<init>(r2, r3)     // Catch: java.util.concurrent.RejectedExecutionException -> Le
            r0.execute(r1)     // Catch: java.util.concurrent.RejectedExecutionException -> Le
            goto L18
        Le:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r0 = "Unable to check if MeteringRepeating is attached. Camera executor shut down."
            r2.<init>(r0)
            r3.setException(r2)
        L18:
            java.lang.String r2 = "isMeteringRepeatingAttached"
            return r2
    }

    public static /* synthetic */ void n(android.view.Surface r0, android.graphics.SurfaceTexture r1) {
            r0.release()
            r1.release()
            return
    }

    @androidx.annotation.NonNull
    private androidx.camera.camera2.internal.CaptureSessionInterface newCaptureSession() {
            r8 = this;
            java.lang.Object r1 = r8.mLock
            monitor-enter(r1)
            androidx.camera.core.impl.SessionProcessor r0 = r8.mSessionProcessor     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto L12
            androidx.camera.camera2.internal.CaptureSession r0 = new androidx.camera.camera2.internal.CaptureSession     // Catch: java.lang.Throwable -> L10
            androidx.camera.camera2.internal.compat.params.DynamicRangesCompat r2 = r8.mDynamicRangesCompat     // Catch: java.lang.Throwable -> L10
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            return r0
        L10:
            r0 = move-exception
            goto L23
        L12:
            androidx.camera.camera2.internal.ProcessingCaptureSession r2 = new androidx.camera.camera2.internal.ProcessingCaptureSession     // Catch: java.lang.Throwable -> L10
            androidx.camera.core.impl.SessionProcessor r3 = r8.mSessionProcessor     // Catch: java.lang.Throwable -> L10
            androidx.camera.camera2.internal.Camera2CameraInfoImpl r4 = r8.mCameraInfoInternal     // Catch: java.lang.Throwable -> L10
            androidx.camera.camera2.internal.compat.params.DynamicRangesCompat r5 = r8.mDynamicRangesCompat     // Catch: java.lang.Throwable -> L10
            java.util.concurrent.Executor r6 = r8.mExecutor     // Catch: java.lang.Throwable -> L10
            java.util.concurrent.ScheduledExecutorService r7 = r8.mScheduledExecutorService     // Catch: java.lang.Throwable -> L10
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            return r2
        L23:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            throw r0
    }

    private void notifyStateAttachedAndCameraControlReady(java.util.List<androidx.camera.core.UseCase> r4) {
            r3 = this;
            java.util.Iterator r4 = r4.iterator()
        L4:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L29
            java.lang.Object r0 = r4.next()
            androidx.camera.core.UseCase r0 = (androidx.camera.core.UseCase) r0
            java.lang.String r1 = getUseCaseId(r0)
            java.util.Set<java.lang.String> r2 = r3.mNotifyStateAttachedSet
            boolean r2 = r2.contains(r1)
            if (r2 == 0) goto L1d
            goto L4
        L1d:
            java.util.Set<java.lang.String> r2 = r3.mNotifyStateAttachedSet
            r2.add(r1)
            r0.onStateAttached()
            r0.onCameraControlReady()
            goto L4
        L29:
            return
    }

    private void notifyStateDetachedToUseCases(java.util.List<androidx.camera.core.UseCase> r4) {
            r3 = this;
            java.util.Iterator r4 = r4.iterator()
        L4:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L26
            java.lang.Object r0 = r4.next()
            androidx.camera.core.UseCase r0 = (androidx.camera.core.UseCase) r0
            java.lang.String r1 = getUseCaseId(r0)
            java.util.Set<java.lang.String> r2 = r3.mNotifyStateAttachedSet
            boolean r2 = r2.contains(r1)
            if (r2 != 0) goto L1d
            goto L4
        L1d:
            r0.onStateDetached()
            java.util.Set<java.lang.String> r0 = r3.mNotifyStateAttachedSet
            r0.remove(r1)
            goto L4
        L26:
            return
    }

    public static /* synthetic */ void o(androidx.camera.camera2.internal.Camera2CameraImpl r0, java.util.List r1) {
            r0.tryDetachUseCases(r1)
            return
    }

    @android.annotation.SuppressLint({"MissingPermission"})
    private void openCameraDevice(boolean r5) {
            r4 = this;
            java.lang.String r0 = "Unable to open camera due to "
            if (r5 != 0) goto L9
            androidx.camera.camera2.internal.Camera2CameraImpl$StateCallback r5 = r4.mStateCallback
            r5.resetReopenMonitor()
        L9:
            androidx.camera.camera2.internal.Camera2CameraImpl$StateCallback r5 = r4.mStateCallback
            r5.cancelScheduledReopen()
            java.lang.String r5 = "Opening camera."
            r4.debugLog(r5)
            androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r5 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.OPENING
            r4.setState(r5)
            androidx.camera.camera2.internal.compat.CameraManagerCompat r5 = r4.mCameraManager     // Catch: java.lang.SecurityException -> L2a androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L2c
            androidx.camera.camera2.internal.Camera2CameraInfoImpl r1 = r4.mCameraInfoInternal     // Catch: java.lang.SecurityException -> L2a androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L2c
            java.lang.String r1 = r1.getCameraId()     // Catch: java.lang.SecurityException -> L2a androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L2c
            java.util.concurrent.Executor r2 = r4.mExecutor     // Catch: java.lang.SecurityException -> L2a androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L2c
            android.hardware.camera2.CameraDevice$StateCallback r3 = r4.createDeviceStateCallback()     // Catch: java.lang.SecurityException -> L2a androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L2c
            r5.openCamera(r1, r2, r3)     // Catch: java.lang.SecurityException -> L2a androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L2c
            return
        L2a:
            r5 = move-exception
            goto L2e
        L2c:
            r5 = move-exception
            goto L4f
        L2e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r5 = r5.getMessage()
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r4.debugLog(r5)
            androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r5 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.REOPENING
            r4.setState(r5)
            androidx.camera.camera2.internal.Camera2CameraImpl$StateCallback r5 = r4.mStateCallback
            r5.scheduleCameraReopen()
            goto L78
        L4f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = r5.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.debugLog(r0)
            int r0 = r5.getReason()
            r1 = 10001(0x2711, float:1.4014E-41)
            if (r0 == r1) goto L6e
            goto L78
        L6e:
            androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r0 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.INITIALIZED
            r1 = 7
            androidx.camera.core.CameraState$StateError r5 = androidx.camera.core.CameraState.StateError.create(r1, r5)
            r4.setState(r0, r5)
        L78:
            return
    }

    private void openInternal() {
            r4 = this;
            int[] r0 = androidx.camera.camera2.internal.Camera2CameraImpl.AnonymousClass3.$SwitchMap$androidx$camera$camera2$internal$Camera2CameraImpl$InternalState
            androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = r4.mState
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L4d
            r3 = 2
            if (r0 == r3) goto L4d
            r3 = 3
            if (r0 == r3) goto L2b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "open() ignored due to being in state: "
            r0.append(r1)
            androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = r4.mState
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.debugLog(r0)
            return
        L2b:
            androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r0 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.REOPENING
            r4.setState(r0)
            boolean r0 = r4.isSessionCloseComplete()
            if (r0 != 0) goto L4c
            int r0 = r4.mCameraDeviceError
            if (r0 != 0) goto L4c
            android.hardware.camera2.CameraDevice r0 = r4.mCameraDevice
            if (r0 == 0) goto L3f
            r1 = 1
        L3f:
            java.lang.String r0 = "Camera Device should be open if session close is not complete"
            androidx.core.util.Preconditions.checkState(r1, r0)
            androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r0 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.OPENED
            r4.setState(r0)
            r4.openCaptureSession()
        L4c:
            return
        L4d:
            r4.tryForceOpenCameraDevice(r1)
            return
    }

    public static /* synthetic */ void p(androidx.camera.camera2.internal.Camera2CameraImpl r3) {
            boolean r0 = r3.isMeteringRepeatingAttached()
            if (r0 != 0) goto L7
            return
        L7:
            androidx.camera.camera2.internal.MeteringRepeatingSession r0 = r3.mMeteringRepeatingSession
            androidx.camera.core.impl.SessionConfig r0 = r0.getSessionConfig()
            androidx.camera.camera2.internal.MeteringRepeatingSession r1 = r3.mMeteringRepeatingSession
            androidx.camera.core.impl.UseCaseConfig r1 = r1.getUseCaseConfig()
            androidx.camera.camera2.internal.MeteringRepeatingSession r2 = r3.mMeteringRepeatingSession
            java.lang.String r2 = getMeteringRepeatingId(r2)
            r3.resetUseCase(r2, r0, r1)
            return
    }

    public static /* synthetic */ void q(androidx.camera.camera2.internal.Camera2CameraImpl r2, java.lang.String r3) {
            r2.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Use case "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = " INACTIVE"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.debugLog(r0)
            androidx.camera.core.impl.UseCaseAttachState r0 = r2.mUseCaseAttachState
            r0.setUseCaseInactive(r3)
            r2.updateCaptureSessionConfig()
            return
    }

    public static /* synthetic */ java.lang.Object r(androidx.camera.camera2.internal.Camera2CameraImpl r2, java.lang.String r3, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r4) {
            r2.getClass()
            java.util.concurrent.Executor r0 = r2.mExecutor     // Catch: java.util.concurrent.RejectedExecutionException -> Le
            androidx.camera.camera2.internal.z r1 = new androidx.camera.camera2.internal.z     // Catch: java.util.concurrent.RejectedExecutionException -> Le
            r1.<init>(r2, r4, r3)     // Catch: java.util.concurrent.RejectedExecutionException -> Le
            r0.execute(r1)     // Catch: java.util.concurrent.RejectedExecutionException -> Le
            goto L18
        Le:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "Unable to check if use case is attached. Camera executor shut down."
            r2.<init>(r3)
            r4.setException(r2)
        L18:
            java.lang.String r2 = "isUseCaseAttached"
            return r2
    }

    private com.google.common.util.concurrent.ListenableFuture<java.lang.Void> releaseInternal() {
            r3 = this;
            com.google.common.util.concurrent.ListenableFuture r0 = r3.getOrCreateUserReleaseFuture()
            int[] r1 = androidx.camera.camera2.internal.Camera2CameraImpl.AnonymousClass3.$SwitchMap$androidx$camera$camera2$internal$Camera2CameraImpl$InternalState
            androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r2 = r3.mState
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 0
            switch(r1) {
                case 1: goto L4a;
                case 2: goto L4a;
                case 3: goto L32;
                case 4: goto L29;
                case 5: goto L29;
                case 6: goto L32;
                case 7: goto L32;
                case 8: goto L32;
                default: goto L12;
            }
        L12:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "release() ignored due to being in state: "
            r1.append(r2)
            androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r2 = r3.mState
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r3.debugLog(r1)
            return r0
        L29:
            androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.RELEASING
            r3.setState(r1)
            r3.closeCamera(r2)
            return r0
        L32:
            androidx.camera.camera2.internal.Camera2CameraImpl$StateCallback r1 = r3.mStateCallback
            boolean r1 = r1.cancelScheduledReopen()
            androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r2 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.RELEASING
            r3.setState(r2)
            if (r1 == 0) goto L49
            boolean r1 = r3.isSessionCloseComplete()
            androidx.core.util.Preconditions.checkState(r1)
            r3.finishClose()
        L49:
            return r0
        L4a:
            android.hardware.camera2.CameraDevice r1 = r3.mCameraDevice
            if (r1 != 0) goto L4f
            r2 = 1
        L4f:
            androidx.core.util.Preconditions.checkState(r2)
            androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.RELEASING
            r3.setState(r1)
            boolean r1 = r3.isSessionCloseComplete()
            androidx.core.util.Preconditions.checkState(r1)
            r3.finishClose()
            return r0
    }

    private void removeMeteringRepeating() {
            r3 = this;
            androidx.camera.camera2.internal.MeteringRepeatingSession r0 = r3.mMeteringRepeatingSession
            if (r0 == 0) goto L4c
            androidx.camera.core.impl.UseCaseAttachState r0 = r3.mUseCaseAttachState
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            androidx.camera.camera2.internal.MeteringRepeatingSession r2 = r3.mMeteringRepeatingSession
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            androidx.camera.camera2.internal.MeteringRepeatingSession r2 = r3.mMeteringRepeatingSession
            int r2 = r2.hashCode()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setUseCaseDetached(r1)
            androidx.camera.core.impl.UseCaseAttachState r0 = r3.mUseCaseAttachState
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            androidx.camera.camera2.internal.MeteringRepeatingSession r2 = r3.mMeteringRepeatingSession
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            androidx.camera.camera2.internal.MeteringRepeatingSession r2 = r3.mMeteringRepeatingSession
            int r2 = r2.hashCode()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setUseCaseInactive(r1)
            androidx.camera.camera2.internal.MeteringRepeatingSession r0 = r3.mMeteringRepeatingSession
            r0.clear()
            r0 = 0
            r3.mMeteringRepeatingSession = r0
        L4c:
            return
    }

    private void resetUseCase(@androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.NonNull androidx.camera.core.impl.SessionConfig r4, @androidx.annotation.NonNull androidx.camera.core.impl.UseCaseConfig<?> r5) {
            r2 = this;
            java.util.concurrent.Executor r0 = r2.mExecutor
            androidx.camera.camera2.internal.h0 r1 = new androidx.camera.camera2.internal.h0
            r1.<init>(r2, r3, r4, r5)
            r0.execute(r1)
            return
    }

    public static /* synthetic */ void s(androidx.camera.camera2.internal.Camera2CameraImpl r0) {
            r0.closeInternal()
            return
    }

    public static /* synthetic */ void t(androidx.camera.camera2.internal.Camera2CameraImpl r0, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r1, java.lang.String r2) {
            androidx.camera.core.impl.UseCaseAttachState r0 = r0.mUseCaseAttachState
            boolean r0 = r0.isUseCaseAttached(r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.set(r0)
            return
    }

    @androidx.annotation.NonNull
    private java.util.Collection<androidx.camera.camera2.internal.Camera2CameraImpl.UseCaseInfo> toUseCaseInfos(@androidx.annotation.NonNull java.util.Collection<androidx.camera.core.UseCase> r3) {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L9:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r3.next()
            androidx.camera.core.UseCase r1 = (androidx.camera.core.UseCase) r1
            androidx.camera.camera2.internal.Camera2CameraImpl$UseCaseInfo r1 = androidx.camera.camera2.internal.Camera2CameraImpl.UseCaseInfo.from(r1)
            r0.add(r1)
            goto L9
        L1d:
            return r0
    }

    private void tryAttachUseCases(@androidx.annotation.NonNull java.util.Collection<androidx.camera.camera2.internal.Camera2CameraImpl.UseCaseInfo> r9) {
            r8 = this;
            androidx.camera.core.impl.UseCaseAttachState r0 = r8.mUseCaseAttachState
            java.util.Collection r0 = r0.getAttachedSessionConfigs()
            boolean r0 = r0.isEmpty()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r9 = r9.iterator()
            r2 = 0
        L14:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L60
            java.lang.Object r3 = r9.next()
            androidx.camera.camera2.internal.Camera2CameraImpl$UseCaseInfo r3 = (androidx.camera.camera2.internal.Camera2CameraImpl.UseCaseInfo) r3
            androidx.camera.core.impl.UseCaseAttachState r4 = r8.mUseCaseAttachState
            java.lang.String r5 = r3.getUseCaseId()
            boolean r4 = r4.isUseCaseAttached(r5)
            if (r4 != 0) goto L14
            androidx.camera.core.impl.UseCaseAttachState r4 = r8.mUseCaseAttachState
            java.lang.String r5 = r3.getUseCaseId()
            androidx.camera.core.impl.SessionConfig r6 = r3.getSessionConfig()
            androidx.camera.core.impl.UseCaseConfig r7 = r3.getUseCaseConfig()
            r4.setUseCaseAttached(r5, r6, r7)
            java.lang.String r4 = r3.getUseCaseId()
            r1.add(r4)
            java.lang.Class r4 = r3.getUseCaseType()
            java.lang.Class<androidx.camera.core.Preview> r5 = androidx.camera.core.Preview.class
            if (r4 != r5) goto L14
            android.util.Size r3 = r3.getSurfaceResolution()
            if (r3 == 0) goto L14
            android.util.Rational r2 = new android.util.Rational
            int r4 = r3.getWidth()
            int r3 = r3.getHeight()
            r2.<init>(r4, r3)
            goto L14
        L60:
            boolean r9 = r1.isEmpty()
            if (r9 == 0) goto L67
            goto Lb4
        L67:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r3 = "Use cases ["
            r9.append(r3)
            java.lang.String r3 = ", "
            java.lang.String r1 = android.text.TextUtils.join(r3, r1)
            r9.append(r1)
            java.lang.String r1 = "] now ATTACHED"
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            r8.debugLog(r9)
            if (r0 == 0) goto L93
            androidx.camera.camera2.internal.Camera2CameraControlImpl r9 = r8.mCameraControlInternal
            r0 = 1
            r9.setActive(r0)
            androidx.camera.camera2.internal.Camera2CameraControlImpl r9 = r8.mCameraControlInternal
            r9.incrementUseCount()
        L93:
            r8.addOrRemoveMeteringRepeatingUseCase()
            r8.updateZslDisabledByUseCaseConfigStatus()
            r8.updateCaptureSessionConfig()
            r9 = 0
            r8.resetCaptureSession(r9)
            androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r9 = r8.mState
            androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r0 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.OPENED
            if (r9 != r0) goto Laa
            r8.openCaptureSession()
            goto Lad
        Laa:
            r8.openInternal()
        Lad:
            if (r2 == 0) goto Lb4
            androidx.camera.camera2.internal.Camera2CameraControlImpl r9 = r8.mCameraControlInternal
            r9.setPreviewAspectRatio(r2)
        Lb4:
            return
    }

    private void tryDetachUseCases(@androidx.annotation.NonNull java.util.Collection<androidx.camera.camera2.internal.Camera2CameraImpl.UseCaseInfo> r7) {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
            r1 = 0
            r2 = 0
        Lb:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L3d
            java.lang.Object r3 = r7.next()
            androidx.camera.camera2.internal.Camera2CameraImpl$UseCaseInfo r3 = (androidx.camera.camera2.internal.Camera2CameraImpl.UseCaseInfo) r3
            androidx.camera.core.impl.UseCaseAttachState r4 = r6.mUseCaseAttachState
            java.lang.String r5 = r3.getUseCaseId()
            boolean r4 = r4.isUseCaseAttached(r5)
            if (r4 == 0) goto Lb
            androidx.camera.core.impl.UseCaseAttachState r4 = r6.mUseCaseAttachState
            java.lang.String r5 = r3.getUseCaseId()
            r4.removeUseCase(r5)
            java.lang.String r4 = r3.getUseCaseId()
            r0.add(r4)
            java.lang.Class r3 = r3.getUseCaseType()
            java.lang.Class<androidx.camera.core.Preview> r4 = androidx.camera.core.Preview.class
            if (r3 != r4) goto Lb
            r2 = 1
            goto Lb
        L3d:
            boolean r7 = r0.isEmpty()
            if (r7 == 0) goto L44
            goto Lb5
        L44:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r3 = "Use cases ["
            r7.append(r3)
            java.lang.String r3 = ", "
            java.lang.String r0 = android.text.TextUtils.join(r3, r0)
            r7.append(r0)
            java.lang.String r0 = "] now DETACHED for camera"
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.debugLog(r7)
            if (r2 == 0) goto L6b
            androidx.camera.camera2.internal.Camera2CameraControlImpl r7 = r6.mCameraControlInternal
            r0 = 0
            r7.setPreviewAspectRatio(r0)
        L6b:
            r6.addOrRemoveMeteringRepeatingUseCase()
            androidx.camera.core.impl.UseCaseAttachState r7 = r6.mUseCaseAttachState
            java.util.Collection r7 = r7.getAttachedUseCaseConfigs()
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L80
            androidx.camera.camera2.internal.Camera2CameraControlImpl r7 = r6.mCameraControlInternal
            r7.setZslDisabledByUserCaseConfig(r1)
            goto L83
        L80:
            r6.updateZslDisabledByUseCaseConfigStatus()
        L83:
            androidx.camera.core.impl.UseCaseAttachState r7 = r6.mUseCaseAttachState
            java.util.Collection r7 = r7.getAttachedSessionConfigs()
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto La6
            androidx.camera.camera2.internal.Camera2CameraControlImpl r7 = r6.mCameraControlInternal
            r7.decrementUseCount()
            r6.resetCaptureSession(r1)
            androidx.camera.camera2.internal.Camera2CameraControlImpl r7 = r6.mCameraControlInternal
            r7.setActive(r1)
            androidx.camera.camera2.internal.CaptureSessionInterface r7 = r6.newCaptureSession()
            r6.mCaptureSession = r7
            r6.closeInternal()
            return
        La6:
            r6.updateCaptureSessionConfig()
            r6.resetCaptureSession(r1)
            androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r7 = r6.mState
            androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r0 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.OPENED
            if (r7 != r0) goto Lb5
            r6.openCaptureSession()
        Lb5:
            return
    }

    private void updateZslDisabledByUseCaseConfigStatus() {
            r4 = this;
            androidx.camera.core.impl.UseCaseAttachState r0 = r4.mUseCaseAttachState
            java.util.Collection r0 = r0.getAttachedUseCaseConfigs()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = 0
        Lc:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L1e
            java.lang.Object r3 = r0.next()
            androidx.camera.core.impl.UseCaseConfig r3 = (androidx.camera.core.impl.UseCaseConfig) r3
            boolean r3 = r3.isZslDisabled(r1)
            r2 = r2 | r3
            goto Lc
        L1e:
            androidx.camera.camera2.internal.Camera2CameraControlImpl r0 = r4.mCameraControlInternal
            r0.setZslDisabledByUserCaseConfig(r2)
            return
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void attachUseCases(@androidx.annotation.NonNull java.util.Collection<androidx.camera.core.UseCase> r3) {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r3)
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto Lc
            return
        Lc:
            androidx.camera.camera2.internal.Camera2CameraControlImpl r3 = r2.mCameraControlInternal
            r3.incrementUseCount()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            r2.notifyStateAttachedAndCameraControlReady(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            java.util.Collection r0 = r2.toUseCaseInfos(r0)
            r3.<init>(r0)
            java.util.concurrent.Executor r0 = r2.mExecutor     // Catch: java.util.concurrent.RejectedExecutionException -> L2d
            androidx.camera.camera2.internal.g0 r1 = new androidx.camera.camera2.internal.g0     // Catch: java.util.concurrent.RejectedExecutionException -> L2d
            r1.<init>(r2, r3)     // Catch: java.util.concurrent.RejectedExecutionException -> L2d
            r0.execute(r1)     // Catch: java.util.concurrent.RejectedExecutionException -> L2d
            return
        L2d:
            r3 = move-exception
            java.lang.String r0 = "Unable to attach use cases."
            r2.debugLog(r0, r3)
            androidx.camera.camera2.internal.Camera2CameraControlImpl r3 = r2.mCameraControlInternal
            r3.decrementUseCount()
            return
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void close() {
            r2 = this;
            java.util.concurrent.Executor r0 = r2.mExecutor
            androidx.camera.camera2.internal.d0 r1 = new androidx.camera.camera2.internal.d0
            r1.<init>(r2)
            r0.execute(r1)
            return
    }

    void closeCamera(boolean r4) {
            r3 = this;
            androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r0 = r3.mState
            androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.CLOSING
            if (r0 == r1) goto L19
            androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r0 = r3.mState
            androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.RELEASING
            if (r0 == r1) goto L19
            androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r0 = r3.mState
            androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.REOPENING
            if (r0 != r1) goto L17
            int r0 = r3.mCameraDeviceError
            if (r0 == 0) goto L17
            goto L19
        L17:
            r0 = 0
            goto L1a
        L19:
            r0 = 1
        L1a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: "
            r1.append(r2)
            androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r2 = r3.mState
            r1.append(r2)
            java.lang.String r2 = " (error: "
            r1.append(r2)
            int r2 = r3.mCameraDeviceError
            java.lang.String r2 = getErrorMessage(r2)
            r1.append(r2)
            java.lang.String r2 = ")"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            androidx.core.util.Preconditions.checkState(r0, r1)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 <= r1) goto L5b
            r1 = 29
            if (r0 >= r1) goto L5b
            boolean r0 = r3.isLegacyDevice()
            if (r0 == 0) goto L5b
            int r0 = r3.mCameraDeviceError
            if (r0 != 0) goto L5b
            r3.configAndClose(r4)
            goto L5e
        L5b:
            r3.resetCaptureSession(r4)
        L5e:
            androidx.camera.camera2.internal.CaptureSessionInterface r4 = r3.mCaptureSession
            r4.cancelIssuedCaptureRequests()
            return
    }

    void debugLog(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            r0 = 0
            r1.debugLog(r2, r0)
            return
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void detachUseCases(@androidx.annotation.NonNull java.util.Collection<androidx.camera.core.UseCase> r3) {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r3)
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto Lc
            return
        Lc:
            java.util.ArrayList r3 = new java.util.ArrayList
            java.util.Collection r1 = r2.toUseCaseInfos(r0)
            r3.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r2.notifyStateDetachedToUseCases(r1)
            java.util.concurrent.Executor r0 = r2.mExecutor
            androidx.camera.camera2.internal.b0 r1 = new androidx.camera.camera2.internal.b0
            r1.<init>(r2, r3)
            r0.execute(r1)
            return
    }

    @androidx.annotation.Nullable
    androidx.camera.core.impl.SessionConfig findSessionConfigForSurface(@androidx.annotation.NonNull androidx.camera.core.impl.DeferrableSurface r4) {
            r3 = this;
            androidx.camera.core.impl.UseCaseAttachState r0 = r3.mUseCaseAttachState
            java.util.Collection r0 = r0.getAttachedSessionConfigs()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r0.next()
            androidx.camera.core.impl.SessionConfig r1 = (androidx.camera.core.impl.SessionConfig) r1
            java.util.List r2 = r1.getSurfaces()
            boolean r2 = r2.contains(r4)
            if (r2 == 0) goto La
            return r1
        L21:
            r4 = 0
            return r4
    }

    void finishClose() {
            r3 = this;
            androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r0 = r3.mState
            androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.RELEASING
            if (r0 == r1) goto Lf
            androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r0 = r3.mState
            androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.CLOSING
            if (r0 != r1) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            androidx.core.util.Preconditions.checkState(r0)
            java.util.Map<androidx.camera.camera2.internal.CaptureSessionInterface, com.google.common.util.concurrent.ListenableFuture<java.lang.Void>> r0 = r3.mReleasedCaptureSessions
            boolean r0 = r0.isEmpty()
            androidx.core.util.Preconditions.checkState(r0)
            r0 = 0
            r3.mCameraDevice = r0
            androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = r3.mState
            androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r2 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.CLOSING
            if (r1 != r2) goto L2b
            androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r0 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.INITIALIZED
            r3.setState(r0)
            return
        L2b:
            androidx.camera.camera2.internal.compat.CameraManagerCompat r1 = r3.mCameraManager
            androidx.camera.camera2.internal.Camera2CameraImpl$CameraAvailability r2 = r3.mCameraAvailability
            r1.unregisterAvailabilityCallback(r2)
            androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.RELEASED
            r3.setState(r1)
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.lang.Void> r1 = r3.mUserReleaseNotifier
            if (r1 == 0) goto L40
            r1.set(r0)
            r3.mUserReleaseNotifier = r0
        L40:
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.VisibleForTesting
    public androidx.camera.camera2.internal.Camera2CameraImpl.CameraAvailability getCameraAvailability() {
            r1 = this;
            androidx.camera.camera2.internal.Camera2CameraImpl$CameraAvailability r0 = r1.mCameraAvailability
            return r0
    }

    @Override // androidx.camera.core.impl.CameraInternal, androidx.camera.core.Camera
    public /* synthetic */ androidx.camera.core.CameraControl getCameraControl() {
            r1 = this;
            androidx.camera.core.CameraControl r0 = androidx.camera.core.impl.j.a(r1)
            return r0
    }

    @Override // androidx.camera.core.impl.CameraInternal
    @androidx.annotation.NonNull
    public androidx.camera.core.impl.CameraControlInternal getCameraControlInternal() {
            r1 = this;
            androidx.camera.camera2.internal.Camera2CameraControlImpl r0 = r1.mCameraControlInternal
            return r0
    }

    @Override // androidx.camera.core.impl.CameraInternal, androidx.camera.core.Camera
    public /* synthetic */ androidx.camera.core.CameraInfo getCameraInfo() {
            r1 = this;
            androidx.camera.core.CameraInfo r0 = androidx.camera.core.impl.j.b(r1)
            return r0
    }

    @Override // androidx.camera.core.impl.CameraInternal
    @androidx.annotation.NonNull
    public androidx.camera.core.impl.CameraInfoInternal getCameraInfoInternal() {
            r1 = this;
            androidx.camera.camera2.internal.Camera2CameraInfoImpl r0 = r1.mCameraInfoInternal
            return r0
    }

    @Override // androidx.camera.core.impl.CameraInternal, androidx.camera.core.Camera
    public /* synthetic */ java.util.LinkedHashSet getCameraInternals() {
            r1 = this;
            java.util.LinkedHashSet r0 = androidx.camera.core.impl.j.c(r1)
            return r0
    }

    @Override // androidx.camera.core.impl.CameraInternal
    @androidx.annotation.NonNull
    public androidx.camera.core.impl.Observable<androidx.camera.core.impl.CameraInternal.State> getCameraState() {
            r1 = this;
            androidx.camera.core.impl.LiveDataObservable<androidx.camera.core.impl.CameraInternal$State> r0 = r1.mObservableState
            return r0
    }

    @Override // androidx.camera.core.impl.CameraInternal, androidx.camera.core.Camera
    @androidx.annotation.NonNull
    public androidx.camera.core.impl.CameraConfig getExtendedConfig() {
            r1 = this;
            androidx.camera.core.impl.CameraConfig r0 = r1.mCameraConfig
            return r0
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public /* synthetic */ boolean getHasTransform() {
            r1 = this;
            boolean r0 = androidx.camera.core.impl.j.e(r1)
            return r0
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public /* synthetic */ boolean isFrontFacing() {
            r1 = this;
            boolean r0 = androidx.camera.core.impl.j.f(r1)
            return r0
    }

    @androidx.annotation.VisibleForTesting
    boolean isMeteringRepeatingAttached() {
            r3 = this;
            androidx.camera.camera2.internal.i0 r0 = new androidx.camera.camera2.internal.i0     // Catch: java.util.concurrent.ExecutionException -> L14 java.lang.InterruptedException -> L16
            r0.<init>(r3)     // Catch: java.util.concurrent.ExecutionException -> L14 java.lang.InterruptedException -> L16
            com.google.common.util.concurrent.ListenableFuture r0 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r0)     // Catch: java.util.concurrent.ExecutionException -> L14 java.lang.InterruptedException -> L16
            java.lang.Object r0 = r0.get()     // Catch: java.util.concurrent.ExecutionException -> L14 java.lang.InterruptedException -> L16
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.util.concurrent.ExecutionException -> L14 java.lang.InterruptedException -> L16
            boolean r0 = r0.booleanValue()     // Catch: java.util.concurrent.ExecutionException -> L14 java.lang.InterruptedException -> L16
            return r0
        L14:
            r0 = move-exception
            goto L17
        L16:
            r0 = move-exception
        L17:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Unable to check if MeteringRepeating is attached."
            r1.<init>(r2, r0)
            throw r1
    }

    boolean isSessionCloseComplete() {
            r1 = this;
            java.util.Map<androidx.camera.camera2.internal.CaptureSessionInterface, com.google.common.util.concurrent.ListenableFuture<java.lang.Void>> r0 = r1.mReleasedCaptureSessions
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L12
            java.util.Set<androidx.camera.camera2.internal.CaptureSession> r0 = r1.mConfiguringForClose
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }

    @androidx.annotation.VisibleForTesting
    boolean isUseCaseAttached(@androidx.annotation.NonNull androidx.camera.core.UseCase r3) {
            r2 = this;
            java.lang.String r3 = getUseCaseId(r3)     // Catch: java.util.concurrent.ExecutionException -> L18 java.lang.InterruptedException -> L1a
            androidx.camera.camera2.internal.y r0 = new androidx.camera.camera2.internal.y     // Catch: java.util.concurrent.ExecutionException -> L18 java.lang.InterruptedException -> L1a
            r0.<init>(r2, r3)     // Catch: java.util.concurrent.ExecutionException -> L18 java.lang.InterruptedException -> L1a
            com.google.common.util.concurrent.ListenableFuture r3 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r0)     // Catch: java.util.concurrent.ExecutionException -> L18 java.lang.InterruptedException -> L1a
            java.lang.Object r3 = r3.get()     // Catch: java.util.concurrent.ExecutionException -> L18 java.lang.InterruptedException -> L1a
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.util.concurrent.ExecutionException -> L18 java.lang.InterruptedException -> L1a
            boolean r3 = r3.booleanValue()     // Catch: java.util.concurrent.ExecutionException -> L18 java.lang.InterruptedException -> L1a
            return r3
        L18:
            r3 = move-exception
            goto L1b
        L1a:
            r3 = move-exception
        L1b:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Unable to check if use case is attached."
            r0.<init>(r1, r3)
            throw r0
    }

    @Override // androidx.camera.core.Camera
    public /* synthetic */ boolean isUseCasesCombinationSupported(androidx.camera.core.UseCase... r1) {
            r0 = this;
            boolean r1 = androidx.camera.core.c.a(r0, r1)
            return r1
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseActive(@androidx.annotation.NonNull androidx.camera.core.UseCase r5) {
            r4 = this;
            androidx.core.util.Preconditions.checkNotNull(r5)
            java.lang.String r0 = getUseCaseId(r5)
            androidx.camera.core.impl.SessionConfig r1 = r5.getSessionConfig()
            androidx.camera.core.impl.UseCaseConfig r5 = r5.getCurrentConfig()
            java.util.concurrent.Executor r2 = r4.mExecutor
            androidx.camera.camera2.internal.l0 r3 = new androidx.camera.camera2.internal.l0
            r3.<init>(r4, r0, r1, r5)
            r2.execute(r3)
            return
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseInactive(@androidx.annotation.NonNull androidx.camera.core.UseCase r3) {
            r2 = this;
            androidx.core.util.Preconditions.checkNotNull(r3)
            java.lang.String r3 = getUseCaseId(r3)
            java.util.concurrent.Executor r0 = r2.mExecutor
            androidx.camera.camera2.internal.k0 r1 = new androidx.camera.camera2.internal.k0
            r1.<init>(r2, r3)
            r0.execute(r1)
            return
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseReset(@androidx.annotation.NonNull androidx.camera.core.UseCase r3) {
            r2 = this;
            androidx.core.util.Preconditions.checkNotNull(r3)
            androidx.camera.core.impl.SessionConfig r0 = r3.getSessionConfig()
            androidx.camera.core.impl.UseCaseConfig r1 = r3.getCurrentConfig()
            java.lang.String r3 = getUseCaseId(r3)
            r2.resetUseCase(r3, r0, r1)
            return
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseUpdated(@androidx.annotation.NonNull androidx.camera.core.UseCase r5) {
            r4 = this;
            androidx.core.util.Preconditions.checkNotNull(r5)
            java.lang.String r0 = getUseCaseId(r5)
            androidx.camera.core.impl.SessionConfig r1 = r5.getSessionConfig()
            androidx.camera.core.impl.UseCaseConfig r5 = r5.getCurrentConfig()
            java.util.concurrent.Executor r2 = r4.mExecutor
            androidx.camera.camera2.internal.j0 r3 = new androidx.camera.camera2.internal.j0
            r3.<init>(r4, r0, r1, r5)
            r2.execute(r3)
            return
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void open() {
            r2 = this;
            java.util.concurrent.Executor r0 = r2.mExecutor
            androidx.camera.camera2.internal.s r1 = new androidx.camera.camera2.internal.s
            r1.<init>(r2)
            r0.execute(r1)
            return
    }

    @androidx.annotation.OptIn(markerClass = {androidx.camera.camera2.interop.ExperimentalCamera2Interop.class})
    void openCaptureSession() {
            r5 = this;
            androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r0 = r5.mState
            androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.OPENED
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            androidx.core.util.Preconditions.checkState(r0)
            androidx.camera.core.impl.UseCaseAttachState r0 = r5.mUseCaseAttachState
            androidx.camera.core.impl.SessionConfig$ValidatingBuilder r0 = r0.getAttachedBuilder()
            boolean r1 = r0.isValid()
            if (r1 != 0) goto L1e
            java.lang.String r0 = "Unable to create capture session due to conflicting configurations"
            r5.debugLog(r0)
            return
        L1e:
            androidx.camera.core.impl.CameraStateRegistry r1 = r5.mCameraStateRegistry
            android.hardware.camera2.CameraDevice r2 = r5.mCameraDevice
            java.lang.String r2 = r2.getId()
            androidx.camera.core.concurrent.CameraCoordinator r3 = r5.mCameraCoordinator
            android.hardware.camera2.CameraDevice r4 = r5.mCameraDevice
            java.lang.String r4 = r4.getId()
            java.lang.String r3 = r3.getPairedConcurrentCameraId(r4)
            boolean r1 = r1.tryOpenCaptureSession(r2, r3)
            if (r1 != 0) goto L53
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unable to create capture session in camera operating mode = "
            r0.append(r1)
            androidx.camera.core.concurrent.CameraCoordinator r1 = r5.mCameraCoordinator
            int r1 = r1.getCameraOperatingMode()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.debugLog(r0)
            return
        L53:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            androidx.camera.core.impl.UseCaseAttachState r2 = r5.mUseCaseAttachState
            java.util.Collection r2 = r2.getAttachedSessionConfigs()
            androidx.camera.core.impl.UseCaseAttachState r3 = r5.mUseCaseAttachState
            java.util.Collection r3 = r3.getAttachedUseCaseConfigs()
            androidx.camera.camera2.internal.StreamUseCaseUtil.populateSurfaceToStreamUseCaseMapping(r2, r3, r1)
            androidx.camera.camera2.internal.CaptureSessionInterface r2 = r5.mCaptureSession
            r2.setStreamUseCaseMap(r1)
            androidx.camera.camera2.internal.CaptureSessionInterface r1 = r5.mCaptureSession
            androidx.camera.core.impl.SessionConfig r0 = r0.build()
            android.hardware.camera2.CameraDevice r2 = r5.mCameraDevice
            java.lang.Object r2 = androidx.core.util.Preconditions.checkNotNull(r2)
            android.hardware.camera2.CameraDevice r2 = (android.hardware.camera2.CameraDevice) r2
            androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener$Builder r3 = r5.mCaptureSessionOpenerBuilder
            androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener r3 = r3.build()
            com.google.common.util.concurrent.ListenableFuture r0 = r1.open(r0, r2, r3)
            androidx.camera.camera2.internal.Camera2CameraImpl$2 r1 = new androidx.camera.camera2.internal.Camera2CameraImpl$2
            r1.<init>(r5)
            java.util.concurrent.Executor r2 = r5.mExecutor
            androidx.camera.core.impl.utils.futures.Futures.addCallback(r0, r1, r2)
            return
    }

    void postSurfaceClosedError(@androidx.annotation.NonNull androidx.camera.core.impl.SessionConfig r5) {
            r4 = this;
            java.util.concurrent.ScheduledExecutorService r0 = androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor()
            java.util.List r1 = r5.getErrorListeners()
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L27
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            androidx.camera.core.impl.SessionConfig$ErrorListener r1 = (androidx.camera.core.impl.SessionConfig.ErrorListener) r1
            java.lang.Throwable r2 = new java.lang.Throwable
            r2.<init>()
            java.lang.String r3 = "Posting surface closed"
            r4.debugLog(r3, r2)
            androidx.camera.camera2.internal.v r2 = new androidx.camera.camera2.internal.v
            r2.<init>(r1, r5)
            r0.execute(r2)
        L27:
            return
    }

    @Override // androidx.camera.core.impl.CameraInternal
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> release() {
            r1 = this;
            androidx.camera.camera2.internal.u r0 = new androidx.camera.camera2.internal.u
            r0.<init>(r1)
            com.google.common.util.concurrent.ListenableFuture r0 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r0)
            return r0
    }

    void releaseNoOpSession(@androidx.annotation.NonNull androidx.camera.camera2.internal.CaptureSession r3, @androidx.annotation.NonNull androidx.camera.core.impl.DeferrableSurface r4, @androidx.annotation.NonNull java.lang.Runnable r5) {
            r2 = this;
            java.util.Set<androidx.camera.camera2.internal.CaptureSession> r0 = r2.mConfiguringForClose
            r0.remove(r3)
            r0 = 0
            com.google.common.util.concurrent.ListenableFuture r3 = r2.releaseSession(r3, r0)
            r4.close()
            com.google.common.util.concurrent.ListenableFuture r4 = r4.getTerminationFuture()
            r1 = 2
            com.google.common.util.concurrent.ListenableFuture[] r1 = new com.google.common.util.concurrent.ListenableFuture[r1]
            r1[r0] = r3
            r3 = 1
            r1[r3] = r4
            java.util.List r3 = java.util.Arrays.asList(r1)
            com.google.common.util.concurrent.ListenableFuture r3 = androidx.camera.core.impl.utils.futures.Futures.successfulAsList(r3)
            java.util.concurrent.Executor r4 = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()
            r3.addListener(r5, r4)
            return
    }

    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> releaseSession(@androidx.annotation.NonNull androidx.camera.camera2.internal.CaptureSessionInterface r3, boolean r4) {
            r2 = this;
            r3.close()
            com.google.common.util.concurrent.ListenableFuture r4 = r3.release(r4)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Releasing session in state "
            r0.append(r1)
            androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = r2.mState
            java.lang.String r1 = r1.name()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.debugLog(r0)
            java.util.Map<androidx.camera.camera2.internal.CaptureSessionInterface, com.google.common.util.concurrent.ListenableFuture<java.lang.Void>> r0 = r2.mReleasedCaptureSessions
            r0.put(r3, r4)
            androidx.camera.camera2.internal.Camera2CameraImpl$1 r0 = new androidx.camera.camera2.internal.Camera2CameraImpl$1
            r0.<init>(r2, r3)
            java.util.concurrent.Executor r3 = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()
            androidx.camera.core.impl.utils.futures.Futures.addCallback(r4, r0, r3)
            return r4
    }

    void resetCaptureSession(boolean r5) {
            r4 = this;
            androidx.camera.camera2.internal.CaptureSessionInterface r0 = r4.mCaptureSession
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            androidx.core.util.Preconditions.checkState(r0)
            java.lang.String r0 = "Resetting Capture Session"
            r4.debugLog(r0)
            androidx.camera.camera2.internal.CaptureSessionInterface r0 = r4.mCaptureSession
            androidx.camera.core.impl.SessionConfig r1 = r0.getSessionConfig()
            java.util.List r2 = r0.getCaptureConfigs()
            androidx.camera.camera2.internal.CaptureSessionInterface r3 = r4.newCaptureSession()
            r4.mCaptureSession = r3
            r3.setSessionConfig(r1)
            androidx.camera.camera2.internal.CaptureSessionInterface r1 = r4.mCaptureSession
            r1.issueCaptureRequests(r2)
            r4.releaseSession(r0, r5)
            return
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void setActiveResumingMode(boolean r3) {
            r2 = this;
            java.util.concurrent.Executor r0 = r2.mExecutor
            androidx.camera.camera2.internal.c0 r1 = new androidx.camera.camera2.internal.c0
            r1.<init>(r2, r3)
            r0.execute(r1)
            return
    }

    @Override // androidx.camera.core.impl.CameraInternal, androidx.camera.core.Camera
    public void setExtendedConfig(@androidx.annotation.Nullable androidx.camera.core.impl.CameraConfig r2) {
            r1 = this;
            if (r2 != 0) goto L6
            androidx.camera.core.impl.CameraConfig r2 = androidx.camera.core.impl.CameraConfigs.emptyConfig()
        L6:
            r0 = 0
            androidx.camera.core.impl.SessionProcessor r0 = r2.getSessionProcessor(r0)
            r1.mCameraConfig = r2
            java.lang.Object r2 = r1.mLock
            monitor-enter(r2)
            r1.mSessionProcessor = r0     // Catch: java.lang.Throwable -> L14
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
            return
        L14:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
            throw r0
    }

    void setState(@androidx.annotation.NonNull androidx.camera.camera2.internal.Camera2CameraImpl.InternalState r2) {
            r1 = this;
            r0 = 0
            r1.setState(r2, r0)
            return
    }

    void setState(@androidx.annotation.NonNull androidx.camera.camera2.internal.Camera2CameraImpl.InternalState r2, @androidx.annotation.Nullable androidx.camera.core.CameraState.StateError r3) {
            r1 = this;
            r0 = 1
            r1.setState(r2, r3, r0)
            return
    }

    void setState(@androidx.annotation.NonNull androidx.camera.camera2.internal.Camera2CameraImpl.InternalState r3, @androidx.annotation.Nullable androidx.camera.core.CameraState.StateError r4, boolean r5) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Transitioning camera internal state: "
            r0.append(r1)
            androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = r2.mState
            r0.append(r1)
            java.lang.String r1 = " --> "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r2.debugLog(r0)
            r2.mState = r3
            int[] r0 = androidx.camera.camera2.internal.Camera2CameraImpl.AnonymousClass3.$SwitchMap$androidx$camera$camera2$internal$Camera2CameraImpl$InternalState
            int r1 = r3.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L57;
                case 2: goto L54;
                case 3: goto L51;
                case 4: goto L4e;
                case 5: goto L4b;
                case 6: goto L48;
                case 7: goto L48;
                case 8: goto L45;
                case 9: goto L42;
                default: goto L2b;
            }
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Unknown state: "
            r5.append(r0)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3)
            throw r4
        L42:
            androidx.camera.core.impl.CameraInternal$State r3 = androidx.camera.core.impl.CameraInternal.State.RELEASED
            goto L59
        L45:
            androidx.camera.core.impl.CameraInternal$State r3 = androidx.camera.core.impl.CameraInternal.State.RELEASING
            goto L59
        L48:
            androidx.camera.core.impl.CameraInternal$State r3 = androidx.camera.core.impl.CameraInternal.State.OPENING
            goto L59
        L4b:
            androidx.camera.core.impl.CameraInternal$State r3 = androidx.camera.core.impl.CameraInternal.State.CONFIGURED
            goto L59
        L4e:
            androidx.camera.core.impl.CameraInternal$State r3 = androidx.camera.core.impl.CameraInternal.State.OPEN
            goto L59
        L51:
            androidx.camera.core.impl.CameraInternal$State r3 = androidx.camera.core.impl.CameraInternal.State.CLOSING
            goto L59
        L54:
            androidx.camera.core.impl.CameraInternal$State r3 = androidx.camera.core.impl.CameraInternal.State.PENDING_OPEN
            goto L59
        L57:
            androidx.camera.core.impl.CameraInternal$State r3 = androidx.camera.core.impl.CameraInternal.State.CLOSED
        L59:
            androidx.camera.core.impl.CameraStateRegistry r0 = r2.mCameraStateRegistry
            r0.markCameraState(r2, r3, r5)
            androidx.camera.core.impl.LiveDataObservable<androidx.camera.core.impl.CameraInternal$State> r5 = r2.mObservableState
            r5.postValue(r3)
            androidx.camera.camera2.internal.CameraStateMachine r5 = r2.mCameraStateMachine
            r5.updateState(r3, r4)
            return
    }

    void submitCaptureRequests(@androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.CaptureConfig> r6) {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L9:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L4c
            java.lang.Object r1 = r6.next()
            androidx.camera.core.impl.CaptureConfig r1 = (androidx.camera.core.impl.CaptureConfig) r1
            androidx.camera.core.impl.CaptureConfig$Builder r2 = androidx.camera.core.impl.CaptureConfig.Builder.from(r1)
            int r3 = r1.getTemplateType()
            r4 = 5
            if (r3 != r4) goto L2d
            androidx.camera.core.impl.CameraCaptureResult r3 = r1.getCameraCaptureResult()
            if (r3 == 0) goto L2d
            androidx.camera.core.impl.CameraCaptureResult r3 = r1.getCameraCaptureResult()
            r2.setCameraCaptureResult(r3)
        L2d:
            java.util.List r3 = r1.getSurfaces()
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L44
            boolean r1 = r1.isUseRepeatingSurface()
            if (r1 == 0) goto L44
            boolean r1 = r5.checkAndAttachRepeatingSurface(r2)
            if (r1 != 0) goto L44
            goto L9
        L44:
            androidx.camera.core.impl.CaptureConfig r1 = r2.build()
            r0.add(r1)
            goto L9
        L4c:
            java.lang.String r6 = "Issue capture request"
            r5.debugLog(r6)
            androidx.camera.camera2.internal.CaptureSessionInterface r6 = r5.mCaptureSession
            r6.issueCaptureRequests(r0)
            return
    }

    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r5 = this;
            java.util.Locale r0 = java.util.Locale.US
            int r1 = r5.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            androidx.camera.camera2.internal.Camera2CameraInfoImpl r2 = r5.mCameraInfoInternal
            java.lang.String r2 = r2.getCameraId()
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r1
            r1 = 1
            r3[r1] = r2
            java.lang.String r1 = "Camera@%x[id=%s]"
            java.lang.String r0 = java.lang.String.format(r0, r1, r3)
            return r0
    }

    void tryForceOpenCameraDevice(boolean r2) {
            r1 = this;
            java.lang.String r0 = "Attempting to force open the camera."
            r1.debugLog(r0)
            androidx.camera.core.impl.CameraStateRegistry r0 = r1.mCameraStateRegistry
            boolean r0 = r0.tryOpenCamera(r1)
            if (r0 != 0) goto L18
            java.lang.String r2 = "No cameras available. Waiting for available camera before opening camera."
            r1.debugLog(r2)
            androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r2 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.PENDING_OPEN
            r1.setState(r2)
            return
        L18:
            r1.openCameraDevice(r2)
            return
    }

    void tryOpenCameraDevice(boolean r2) {
            r1 = this;
            java.lang.String r0 = "Attempting to open the camera."
            r1.debugLog(r0)
            androidx.camera.camera2.internal.Camera2CameraImpl$CameraAvailability r0 = r1.mCameraAvailability
            boolean r0 = r0.isCameraAvailable()
            if (r0 == 0) goto L19
            androidx.camera.core.impl.CameraStateRegistry r0 = r1.mCameraStateRegistry
            boolean r0 = r0.tryOpenCamera(r1)
            if (r0 == 0) goto L19
            r1.openCameraDevice(r2)
            return
        L19:
            java.lang.String r2 = "No cameras available. Waiting for available camera before opening camera."
            r1.debugLog(r2)
            androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r2 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.PENDING_OPEN
            r1.setState(r2)
            return
    }

    void updateCaptureSessionConfig() {
            r3 = this;
            androidx.camera.core.impl.UseCaseAttachState r0 = r3.mUseCaseAttachState
            androidx.camera.core.impl.SessionConfig$ValidatingBuilder r0 = r0.getActiveAndAttachedBuilder()
            boolean r1 = r0.isValid()
            if (r1 == 0) goto L2c
            androidx.camera.core.impl.SessionConfig r1 = r0.build()
            androidx.camera.camera2.internal.Camera2CameraControlImpl r2 = r3.mCameraControlInternal
            int r1 = r1.getTemplateType()
            r2.setTemplate(r1)
            androidx.camera.camera2.internal.Camera2CameraControlImpl r1 = r3.mCameraControlInternal
            androidx.camera.core.impl.SessionConfig r1 = r1.getSessionConfig()
            r0.add(r1)
            androidx.camera.core.impl.SessionConfig r0 = r0.build()
            androidx.camera.camera2.internal.CaptureSessionInterface r1 = r3.mCaptureSession
            r1.setSessionConfig(r0)
            return
        L2c:
            androidx.camera.camera2.internal.Camera2CameraControlImpl r0 = r3.mCameraControlInternal
            r0.resetTemplate()
            androidx.camera.camera2.internal.CaptureSessionInterface r0 = r3.mCaptureSession
            androidx.camera.camera2.internal.Camera2CameraControlImpl r1 = r3.mCameraControlInternal
            androidx.camera.core.impl.SessionConfig r1 = r1.getSessionConfig()
            r0.setSessionConfig(r1)
            return
    }
}
