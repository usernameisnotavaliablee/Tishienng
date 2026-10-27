package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.OptIn(markerClass = {androidx.camera.camera2.interop.ExperimentalCamera2Interop.class})
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class ProcessingCaptureSession implements androidx.camera.camera2.internal.CaptureSessionInterface {
    private static final java.lang.String TAG = "ProcessingCaptureSession";
    private static final long TIMEOUT_GET_SURFACE_IN_MS = 5000;
    private static java.util.List<androidx.camera.core.impl.DeferrableSurface> sHeldProcessorSurfaces;
    private static int sNextInstanceId;
    private final androidx.camera.camera2.internal.Camera2CameraInfoImpl mCamera2CameraInfoImpl;
    private final androidx.camera.camera2.internal.CaptureSession mCaptureSession;
    final java.util.concurrent.Executor mExecutor;
    private int mInstanceId;
    volatile boolean mIsExecutingStillCaptureRequest;
    private java.util.List<androidx.camera.core.impl.DeferrableSurface> mOutputSurfaces;

    @androidx.annotation.Nullable
    private volatile java.util.List<androidx.camera.core.impl.CaptureConfig> mPendingCaptureConfigs;

    @androidx.annotation.Nullable
    private androidx.camera.core.impl.SessionConfig mProcessorSessionConfig;
    private androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState mProcessorState;

    @androidx.annotation.Nullable
    private androidx.camera.camera2.internal.Camera2RequestProcessor mRequestProcessor;
    private final java.util.concurrent.ScheduledExecutorService mScheduledExecutorService;

    @androidx.annotation.Nullable
    private androidx.camera.core.impl.SessionConfig mSessionConfig;
    private androidx.camera.camera2.interop.CaptureRequestOptions mSessionOptions;
    private final androidx.camera.core.impl.SessionProcessor mSessionProcessor;
    private final androidx.camera.camera2.internal.ProcessingCaptureSession.SessionProcessorCaptureCallback mSessionProcessorCaptureCallback;
    private androidx.camera.camera2.interop.CaptureRequestOptions mStillCaptureOptions;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.camera.camera2.internal.ProcessingCaptureSession$2, reason: invalid class name */
    class AnonymousClass2 implements androidx.camera.core.impl.SessionProcessor.CaptureCallback {
        final /* synthetic */ androidx.camera.camera2.internal.ProcessingCaptureSession this$0;
        final /* synthetic */ androidx.camera.core.impl.CaptureConfig val$captureConfig;

        AnonymousClass2(androidx.camera.camera2.internal.ProcessingCaptureSession r1, androidx.camera.core.impl.CaptureConfig r2) {
                r0 = this;
                r0.this$0 = r1
                r0.val$captureConfig = r2
                r0.<init>()
                return
        }

        public static /* synthetic */ void a(androidx.camera.core.impl.CaptureConfig r2) {
                java.util.List r2 = r2.getCameraCaptureCallbacks()
                java.util.Iterator r2 = r2.iterator()
            L8:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L1d
                java.lang.Object r0 = r2.next()
                androidx.camera.core.impl.CameraCaptureCallback r0 = (androidx.camera.core.impl.CameraCaptureCallback) r0
                androidx.camera.core.impl.CameraCaptureResult$EmptyCameraCaptureResult r1 = new androidx.camera.core.impl.CameraCaptureResult$EmptyCameraCaptureResult
                r1.<init>()
                r0.onCaptureCompleted(r1)
                goto L8
            L1d:
                return
        }

        public static /* synthetic */ void b(androidx.camera.core.impl.CaptureConfig r3) {
                java.util.List r3 = r3.getCameraCaptureCallbacks()
                java.util.Iterator r3 = r3.iterator()
            L8:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L1f
                java.lang.Object r0 = r3.next()
                androidx.camera.core.impl.CameraCaptureCallback r0 = (androidx.camera.core.impl.CameraCaptureCallback) r0
                androidx.camera.core.impl.CameraCaptureFailure r1 = new androidx.camera.core.impl.CameraCaptureFailure
                androidx.camera.core.impl.CameraCaptureFailure$Reason r2 = androidx.camera.core.impl.CameraCaptureFailure.Reason.ERROR
                r1.<init>(r2)
                r0.onCaptureFailed(r1)
                goto L8
            L1f:
                return
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public /* synthetic */ void onCaptureCompleted(long r1, int r3, java.util.Map r4) {
                r0 = this;
                androidx.camera.core.impl.j0.a(r0, r1, r3, r4)
                return
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public void onCaptureFailed(int r3) {
                r2 = this;
                androidx.camera.camera2.internal.ProcessingCaptureSession r3 = r2.this$0
                java.util.concurrent.Executor r3 = r3.mExecutor
                androidx.camera.core.impl.CaptureConfig r0 = r2.val$captureConfig
                androidx.camera.camera2.internal.c2 r1 = new androidx.camera.camera2.internal.c2
                r1.<init>(r0)
                r3.execute(r1)
                return
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public /* synthetic */ void onCaptureProcessStarted(int r1) {
                r0 = this;
                androidx.camera.core.impl.j0.c(r0, r1)
                return
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public /* synthetic */ void onCaptureSequenceAborted(int r1) {
                r0 = this;
                androidx.camera.core.impl.j0.d(r0, r1)
                return
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public void onCaptureSequenceCompleted(int r3) {
                r2 = this;
                androidx.camera.camera2.internal.ProcessingCaptureSession r3 = r2.this$0
                java.util.concurrent.Executor r3 = r3.mExecutor
                androidx.camera.core.impl.CaptureConfig r0 = r2.val$captureConfig
                androidx.camera.camera2.internal.b2 r1 = new androidx.camera.camera2.internal.b2
                r1.<init>(r0)
                r3.execute(r1)
                return
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public /* synthetic */ void onCaptureStarted(int r1, long r2) {
                r0 = this;
                androidx.camera.core.impl.j0.f(r0, r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.camera.camera2.internal.ProcessingCaptureSession$3, reason: invalid class name */
    class AnonymousClass3 implements androidx.camera.core.impl.SessionProcessor.CaptureCallback {
        final /* synthetic */ androidx.camera.camera2.internal.ProcessingCaptureSession this$0;
        final /* synthetic */ androidx.camera.core.impl.CaptureConfig val$captureConfig;

        AnonymousClass3(androidx.camera.camera2.internal.ProcessingCaptureSession r1, androidx.camera.core.impl.CaptureConfig r2) {
                r0 = this;
                r0.this$0 = r1
                r0.val$captureConfig = r2
                r0.<init>()
                return
        }

        public static /* synthetic */ void a(androidx.camera.core.impl.CaptureConfig r2) {
                java.util.List r2 = r2.getCameraCaptureCallbacks()
                java.util.Iterator r2 = r2.iterator()
            L8:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L1d
                java.lang.Object r0 = r2.next()
                androidx.camera.core.impl.CameraCaptureCallback r0 = (androidx.camera.core.impl.CameraCaptureCallback) r0
                androidx.camera.core.impl.CameraCaptureResult$EmptyCameraCaptureResult r1 = new androidx.camera.core.impl.CameraCaptureResult$EmptyCameraCaptureResult
                r1.<init>()
                r0.onCaptureCompleted(r1)
                goto L8
            L1d:
                return
        }

        public static /* synthetic */ void b(androidx.camera.core.impl.CaptureConfig r3) {
                java.util.List r3 = r3.getCameraCaptureCallbacks()
                java.util.Iterator r3 = r3.iterator()
            L8:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L1f
                java.lang.Object r0 = r3.next()
                androidx.camera.core.impl.CameraCaptureCallback r0 = (androidx.camera.core.impl.CameraCaptureCallback) r0
                androidx.camera.core.impl.CameraCaptureFailure r1 = new androidx.camera.core.impl.CameraCaptureFailure
                androidx.camera.core.impl.CameraCaptureFailure$Reason r2 = androidx.camera.core.impl.CameraCaptureFailure.Reason.ERROR
                r1.<init>(r2)
                r0.onCaptureFailed(r1)
                goto L8
            L1f:
                return
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public /* synthetic */ void onCaptureCompleted(long r1, int r3, java.util.Map r4) {
                r0 = this;
                androidx.camera.core.impl.j0.a(r0, r1, r3, r4)
                return
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public void onCaptureFailed(int r3) {
                r2 = this;
                androidx.camera.camera2.internal.ProcessingCaptureSession r3 = r2.this$0
                java.util.concurrent.Executor r3 = r3.mExecutor
                androidx.camera.core.impl.CaptureConfig r0 = r2.val$captureConfig
                androidx.camera.camera2.internal.e2 r1 = new androidx.camera.camera2.internal.e2
                r1.<init>(r0)
                r3.execute(r1)
                return
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public /* synthetic */ void onCaptureProcessStarted(int r1) {
                r0 = this;
                androidx.camera.core.impl.j0.c(r0, r1)
                return
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public /* synthetic */ void onCaptureSequenceAborted(int r1) {
                r0 = this;
                androidx.camera.core.impl.j0.d(r0, r1)
                return
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public void onCaptureSequenceCompleted(int r3) {
                r2 = this;
                androidx.camera.camera2.internal.ProcessingCaptureSession r3 = r2.this$0
                java.util.concurrent.Executor r3 = r3.mExecutor
                androidx.camera.core.impl.CaptureConfig r0 = r2.val$captureConfig
                androidx.camera.camera2.internal.d2 r1 = new androidx.camera.camera2.internal.d2
                r1.<init>(r0)
                r3.execute(r1)
                return
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public /* synthetic */ void onCaptureStarted(int r1, long r2) {
                r0 = this;
                androidx.camera.core.impl.j0.f(r0, r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.camera.camera2.internal.ProcessingCaptureSession$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] $SwitchMap$androidx$camera$camera2$internal$ProcessingCaptureSession$ProcessorState = null;

        static {
                androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState[] r0 = androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.camera.camera2.internal.ProcessingCaptureSession.AnonymousClass4.$SwitchMap$androidx$camera$camera2$internal$ProcessingCaptureSession$ProcessorState = r0
                androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState r1 = androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState.UNINITIALIZED     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.camera.camera2.internal.ProcessingCaptureSession.AnonymousClass4.$SwitchMap$androidx$camera$camera2$internal$ProcessingCaptureSession$ProcessorState     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState r1 = androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState.SESSION_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.camera.camera2.internal.ProcessingCaptureSession.AnonymousClass4.$SwitchMap$androidx$camera$camera2$internal$ProcessingCaptureSession$ProcessorState     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState r1 = androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState.ON_CAPTURE_SESSION_STARTED     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = androidx.camera.camera2.internal.ProcessingCaptureSession.AnonymousClass4.$SwitchMap$androidx$camera$camera2$internal$ProcessingCaptureSession$ProcessorState     // Catch: java.lang.NoSuchFieldError -> L33
                androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState r1 = androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState.ON_CAPTURE_SESSION_ENDED     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = androidx.camera.camera2.internal.ProcessingCaptureSession.AnonymousClass4.$SwitchMap$androidx$camera$camera2$internal$ProcessingCaptureSession$ProcessorState     // Catch: java.lang.NoSuchFieldError -> L3e
                androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState r1 = androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState.DE_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private enum ProcessorState extends java.lang.Enum<androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState> {
        private static final /* synthetic */ androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState[] $VALUES = null;
        public static final androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState DE_INITIALIZED = null;
        public static final androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState ON_CAPTURE_SESSION_ENDED = null;
        public static final androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState ON_CAPTURE_SESSION_STARTED = null;
        public static final androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState SESSION_INITIALIZED = null;
        public static final androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState UNINITIALIZED = null;

        private static /* synthetic */ androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState[] $values() {
                r0 = 5
                androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState[] r0 = new androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState[r0]
                androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState r1 = androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState.UNINITIALIZED
                r2 = 0
                r0[r2] = r1
                androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState r1 = androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState.SESSION_INITIALIZED
                r2 = 1
                r0[r2] = r1
                androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState r1 = androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState.ON_CAPTURE_SESSION_STARTED
                r2 = 2
                r0[r2] = r1
                androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState r1 = androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState.ON_CAPTURE_SESSION_ENDED
                r2 = 3
                r0[r2] = r1
                androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState r1 = androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState.DE_INITIALIZED
                r2 = 4
                r0[r2] = r1
                return r0
        }

        static {
                androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState r0 = new androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState
                java.lang.String r1 = "UNINITIALIZED"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState.UNINITIALIZED = r0
                androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState r0 = new androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState
                java.lang.String r1 = "SESSION_INITIALIZED"
                r2 = 1
                r0.<init>(r1, r2)
                androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState.SESSION_INITIALIZED = r0
                androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState r0 = new androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState
                java.lang.String r1 = "ON_CAPTURE_SESSION_STARTED"
                r2 = 2
                r0.<init>(r1, r2)
                androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState.ON_CAPTURE_SESSION_STARTED = r0
                androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState r0 = new androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState
                java.lang.String r1 = "ON_CAPTURE_SESSION_ENDED"
                r2 = 3
                r0.<init>(r1, r2)
                androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState.ON_CAPTURE_SESSION_ENDED = r0
                androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState r0 = new androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState
                java.lang.String r1 = "DE_INITIALIZED"
                r2 = 4
                r0.<init>(r1, r2)
                androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState.DE_INITIALIZED = r0
                androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState[] r0 = $values()
                androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState.$VALUES = r0
                return
        }

        ProcessorState(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState valueOf(java.lang.String r1) {
                java.lang.Class<androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState> r0 = androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState r1 = (androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState) r1
                return r1
        }

        public static androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState[] values() {
                androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState[] r0 = androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState[] r0 = (androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class SessionProcessorCaptureCallback implements androidx.camera.core.impl.SessionProcessor.CaptureCallback {
        SessionProcessorCaptureCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public void onCaptureCompleted(long r1, int r3, @androidx.annotation.NonNull java.util.Map<android.hardware.camera2.CaptureResult.Key, java.lang.Object> r4) {
                r0 = this;
                return
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public void onCaptureFailed(int r1) {
                r0 = this;
                return
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public void onCaptureProcessStarted(int r1) {
                r0 = this;
                return
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public void onCaptureSequenceAborted(int r1) {
                r0 = this;
                return
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public void onCaptureSequenceCompleted(int r1) {
                r0 = this;
                return
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public void onCaptureStarted(int r1, long r2) {
                r0 = this;
                return
        }
    }

    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            androidx.camera.camera2.internal.ProcessingCaptureSession.sHeldProcessorSurfaces = r0
            r0 = 0
            androidx.camera.camera2.internal.ProcessingCaptureSession.sNextInstanceId = r0
            return
    }

    ProcessingCaptureSession(@androidx.annotation.NonNull androidx.camera.core.impl.SessionProcessor r3, @androidx.annotation.NonNull androidx.camera.camera2.internal.Camera2CameraInfoImpl r4, @androidx.annotation.NonNull androidx.camera.camera2.internal.compat.params.DynamicRangesCompat r5, @androidx.annotation.NonNull java.util.concurrent.Executor r6, @androidx.annotation.NonNull java.util.concurrent.ScheduledExecutorService r7) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.mOutputSurfaces = r0
            r0 = 0
            r2.mPendingCaptureConfigs = r0
            r0 = 0
            r2.mIsExecutingStillCaptureRequest = r0
            androidx.camera.camera2.interop.CaptureRequestOptions$Builder r1 = new androidx.camera.camera2.interop.CaptureRequestOptions$Builder
            r1.<init>()
            androidx.camera.camera2.interop.CaptureRequestOptions r1 = r1.build()
            r2.mSessionOptions = r1
            androidx.camera.camera2.interop.CaptureRequestOptions$Builder r1 = new androidx.camera.camera2.interop.CaptureRequestOptions$Builder
            r1.<init>()
            androidx.camera.camera2.interop.CaptureRequestOptions r1 = r1.build()
            r2.mStillCaptureOptions = r1
            r2.mInstanceId = r0
            androidx.camera.camera2.internal.CaptureSession r0 = new androidx.camera.camera2.internal.CaptureSession
            r0.<init>(r5)
            r2.mCaptureSession = r0
            r2.mSessionProcessor = r3
            r2.mCamera2CameraInfoImpl = r4
            r2.mExecutor = r6
            r2.mScheduledExecutorService = r7
            androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState r3 = androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState.UNINITIALIZED
            r2.mProcessorState = r3
            androidx.camera.camera2.internal.ProcessingCaptureSession$SessionProcessorCaptureCallback r3 = new androidx.camera.camera2.internal.ProcessingCaptureSession$SessionProcessorCaptureCallback
            r3.<init>()
            r2.mSessionProcessorCaptureCallback = r3
            int r3 = androidx.camera.camera2.internal.ProcessingCaptureSession.sNextInstanceId
            int r4 = r3 + 1
            androidx.camera.camera2.internal.ProcessingCaptureSession.sNextInstanceId = r4
            r2.mInstanceId = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "New ProcessingCaptureSession (id="
            r3.append(r4)
            int r4 = r2.mInstanceId
            r3.append(r4)
            java.lang.String r4 = ")"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "ProcessingCaptureSession"
            androidx.camera.core.Logger.d(r4, r3)
            return
    }

    public static /* synthetic */ java.lang.Void a(androidx.camera.camera2.internal.ProcessingCaptureSession r0, java.lang.Void r1) {
            androidx.camera.camera2.internal.CaptureSession r1 = r0.mCaptureSession
            r0.onConfigured(r1)
            r0 = 0
            return r0
    }

    public static /* synthetic */ void b(androidx.camera.core.impl.DeferrableSurface r1) {
            java.util.List<androidx.camera.core.impl.DeferrableSurface> r0 = androidx.camera.camera2.internal.ProcessingCaptureSession.sHeldProcessorSurfaces
            r0.remove(r1)
            return
    }

    public static /* synthetic */ com.google.common.util.concurrent.ListenableFuture c(androidx.camera.camera2.internal.ProcessingCaptureSession r10, androidx.camera.core.impl.SessionConfig r11, android.hardware.camera2.CameraDevice r12, androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener r13, java.util.List r14) {
            r10.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "-- getSurfaces done, start init (id="
            r0.append(r1)
            int r1 = r10.mInstanceId
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "ProcessingCaptureSession"
            androidx.camera.core.Logger.d(r2, r0)
            androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState r0 = r10.mProcessorState
            androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState r3 = androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState.DE_INITIALIZED
            if (r0 != r3) goto L32
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "SessionProcessorCaptureSession is closed."
            r10.<init>(r11)
            com.google.common.util.concurrent.ListenableFuture r10 = androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(r10)
            return r10
        L32:
            r0 = 0
            boolean r3 = r14.contains(r0)
            if (r3 == 0) goto L53
            java.util.List r10 = r11.getSurfaces()
            int r11 = r14.indexOf(r0)
            java.lang.Object r10 = r10.get(r11)
            androidx.camera.core.impl.DeferrableSurface r10 = (androidx.camera.core.impl.DeferrableSurface) r10
            androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException r11 = new androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException
            java.lang.String r12 = "Surface closed"
            r11.<init>(r12, r10)
            com.google.common.util.concurrent.ListenableFuture r10 = androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(r11)
            return r10
        L53:
            r14 = 0
            r3 = r0
            r4 = r3
            r5 = 0
        L57:
            java.util.List r6 = r11.getSurfaces()
            int r6 = r6.size()
            if (r5 >= r6) goto L10a
            java.util.List r6 = r11.getSurfaces()
            java.lang.Object r6 = r6.get(r5)
            androidx.camera.core.impl.DeferrableSurface r6 = (androidx.camera.core.impl.DeferrableSurface) r6
            java.lang.Class r7 = r6.getContainerClass()
            java.lang.Class<androidx.camera.core.Preview> r8 = androidx.camera.core.Preview.class
            boolean r7 = java.util.Objects.equals(r7, r8)
            if (r7 == 0) goto L9f
            com.google.common.util.concurrent.ListenableFuture r0 = r6.getSurface()
            java.lang.Object r0 = r0.get()
            android.view.Surface r0 = (android.view.Surface) r0
            android.util.Size r7 = new android.util.Size
            android.util.Size r8 = r6.getPrescribedSize()
            int r8 = r8.getWidth()
            android.util.Size r9 = r6.getPrescribedSize()
            int r9 = r9.getHeight()
            r7.<init>(r8, r9)
            int r6 = r6.getPrescribedStreamFormat()
            androidx.camera.core.impl.OutputSurface r0 = androidx.camera.core.impl.OutputSurface.create(r0, r7, r6)
            goto L106
        L9f:
            java.lang.Class r7 = r6.getContainerClass()
            java.lang.Class<androidx.camera.core.ImageCapture> r8 = androidx.camera.core.ImageCapture.class
            boolean r7 = java.util.Objects.equals(r7, r8)
            if (r7 == 0) goto Ld3
            com.google.common.util.concurrent.ListenableFuture r3 = r6.getSurface()
            java.lang.Object r3 = r3.get()
            android.view.Surface r3 = (android.view.Surface) r3
            android.util.Size r7 = new android.util.Size
            android.util.Size r8 = r6.getPrescribedSize()
            int r8 = r8.getWidth()
            android.util.Size r9 = r6.getPrescribedSize()
            int r9 = r9.getHeight()
            r7.<init>(r8, r9)
            int r6 = r6.getPrescribedStreamFormat()
            androidx.camera.core.impl.OutputSurface r3 = androidx.camera.core.impl.OutputSurface.create(r3, r7, r6)
            goto L106
        Ld3:
            java.lang.Class r7 = r6.getContainerClass()
            java.lang.Class<androidx.camera.core.ImageAnalysis> r8 = androidx.camera.core.ImageAnalysis.class
            boolean r7 = java.util.Objects.equals(r7, r8)
            if (r7 == 0) goto L106
            com.google.common.util.concurrent.ListenableFuture r4 = r6.getSurface()
            java.lang.Object r4 = r4.get()
            android.view.Surface r4 = (android.view.Surface) r4
            android.util.Size r7 = new android.util.Size
            android.util.Size r8 = r6.getPrescribedSize()
            int r8 = r8.getWidth()
            android.util.Size r9 = r6.getPrescribedSize()
            int r9 = r9.getHeight()
            r7.<init>(r8, r9)
            int r6 = r6.getPrescribedStreamFormat()
            androidx.camera.core.impl.OutputSurface r4 = androidx.camera.core.impl.OutputSurface.create(r4, r7, r6)
        L106:
            int r5 = r5 + 1
            goto L57
        L10a:
            androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState r5 = androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState.SESSION_INITIALIZED
            r10.mProcessorState = r5
            java.util.List<androidx.camera.core.impl.DeferrableSurface> r5 = r10.mOutputSurfaces     // Catch: androidx.camera.core.impl.DeferrableSurface.SurfaceClosedException -> L1b5
            androidx.camera.core.impl.DeferrableSurfaces.incrementAll(r5)     // Catch: androidx.camera.core.impl.DeferrableSurface.SurfaceClosedException -> L1b5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "== initSession (id="
            r5.append(r6)
            int r6 = r10.mInstanceId
            r5.append(r6)
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            androidx.camera.core.Logger.w(r2, r1)
            androidx.camera.core.impl.SessionProcessor r1 = r10.mSessionProcessor     // Catch: java.lang.Throwable -> L1ae
            androidx.camera.camera2.internal.Camera2CameraInfoImpl r2 = r10.mCamera2CameraInfoImpl     // Catch: java.lang.Throwable -> L1ae
            androidx.camera.core.impl.SessionConfig r0 = r1.initSession(r2, r0, r3, r4)     // Catch: java.lang.Throwable -> L1ae
            r10.mProcessorSessionConfig = r0     // Catch: java.lang.Throwable -> L1ae
            java.util.List r0 = r0.getSurfaces()
            java.lang.Object r14 = r0.get(r14)
            androidx.camera.core.impl.DeferrableSurface r14 = (androidx.camera.core.impl.DeferrableSurface) r14
            com.google.common.util.concurrent.ListenableFuture r14 = r14.getTerminationFuture()
            androidx.camera.camera2.internal.w1 r0 = new androidx.camera.camera2.internal.w1
            r0.<init>(r10)
            java.util.concurrent.Executor r1 = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()
            r14.addListener(r0, r1)
            androidx.camera.core.impl.SessionConfig r14 = r10.mProcessorSessionConfig
            java.util.List r14 = r14.getSurfaces()
            java.util.Iterator r14 = r14.iterator()
        L15a:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L17a
            java.lang.Object r0 = r14.next()
            androidx.camera.core.impl.DeferrableSurface r0 = (androidx.camera.core.impl.DeferrableSurface) r0
            java.util.List<androidx.camera.core.impl.DeferrableSurface> r1 = androidx.camera.camera2.internal.ProcessingCaptureSession.sHeldProcessorSurfaces
            r1.add(r0)
            com.google.common.util.concurrent.ListenableFuture r1 = r0.getTerminationFuture()
            androidx.camera.camera2.internal.x1 r2 = new androidx.camera.camera2.internal.x1
            r2.<init>(r0)
            java.util.concurrent.Executor r0 = r10.mExecutor
            r1.addListener(r2, r0)
            goto L15a
        L17a:
            androidx.camera.core.impl.SessionConfig$ValidatingBuilder r14 = new androidx.camera.core.impl.SessionConfig$ValidatingBuilder
            r14.<init>()
            r14.add(r11)
            r14.clearSurfaces()
            androidx.camera.core.impl.SessionConfig r11 = r10.mProcessorSessionConfig
            r14.add(r11)
            boolean r11 = r14.isValid()
            java.lang.String r0 = "Cannot transform the SessionConfig"
            androidx.core.util.Preconditions.checkArgument(r11, r0)
            androidx.camera.core.impl.SessionConfig r11 = r14.build()
            androidx.camera.camera2.internal.CaptureSession r14 = r10.mCaptureSession
            java.lang.Object r12 = androidx.core.util.Preconditions.checkNotNull(r12)
            android.hardware.camera2.CameraDevice r12 = (android.hardware.camera2.CameraDevice) r12
            com.google.common.util.concurrent.ListenableFuture r11 = r14.open(r11, r12, r13)
            androidx.camera.camera2.internal.ProcessingCaptureSession$1 r12 = new androidx.camera.camera2.internal.ProcessingCaptureSession$1
            r12.<init>(r10)
            java.util.concurrent.Executor r10 = r10.mExecutor
            androidx.camera.core.impl.utils.futures.Futures.addCallback(r11, r12, r10)
            return r11
        L1ae:
            r11 = move-exception
            java.util.List<androidx.camera.core.impl.DeferrableSurface> r10 = r10.mOutputSurfaces
            androidx.camera.core.impl.DeferrableSurfaces.decrementAll(r10)
            throw r11
        L1b5:
            r10 = move-exception
            com.google.common.util.concurrent.ListenableFuture r10 = androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(r10)
            return r10
    }

    private static void cancelRequests(@androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.CaptureConfig> r2) {
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L28
            java.lang.Object r0 = r2.next()
            androidx.camera.core.impl.CaptureConfig r0 = (androidx.camera.core.impl.CaptureConfig) r0
            java.util.List r0 = r0.getCameraCaptureCallbacks()
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4
            java.lang.Object r1 = r0.next()
            androidx.camera.core.impl.CameraCaptureCallback r1 = (androidx.camera.core.impl.CameraCaptureCallback) r1
            r1.onCaptureCancelled()
            goto L18
        L28:
            return
    }

    public static /* synthetic */ void d(androidx.camera.camera2.internal.ProcessingCaptureSession r0) {
            java.util.List<androidx.camera.core.impl.DeferrableSurface> r0 = r0.mOutputSurfaces
            androidx.camera.core.impl.DeferrableSurfaces.decrementAll(r0)
            return
    }

    public static /* synthetic */ void e(androidx.camera.camera2.internal.ProcessingCaptureSession r2) {
            r2.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "== deInitSession (id="
            r0.append(r1)
            int r1 = r2.mInstanceId
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ProcessingCaptureSession"
            androidx.camera.core.Logger.d(r1, r0)
            androidx.camera.core.impl.SessionProcessor r2 = r2.mSessionProcessor
            r2.deInitSession()
            return
    }

    private static java.util.List<androidx.camera.core.impl.SessionProcessorSurface> getSessionProcessorSurfaceList(java.util.List<androidx.camera.core.impl.DeferrableSurface> r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L9:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r4.next()
            androidx.camera.core.impl.DeferrableSurface r1 = (androidx.camera.core.impl.DeferrableSurface) r1
            boolean r2 = r1 instanceof androidx.camera.core.impl.SessionProcessorSurface
            java.lang.String r3 = "Surface must be SessionProcessorSurface"
            androidx.core.util.Preconditions.checkArgument(r2, r3)
            androidx.camera.core.impl.SessionProcessorSurface r1 = (androidx.camera.core.impl.SessionProcessorSurface) r1
            r0.add(r1)
            goto L9
        L22:
            return r0
    }

    private boolean hasPreviewSurface(androidx.camera.core.impl.CaptureConfig r3) {
            r2 = this;
            java.util.List r3 = r3.getSurfaces()
            java.util.Iterator r3 = r3.iterator()
        L8:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L22
            java.lang.Object r0 = r3.next()
            androidx.camera.core.impl.DeferrableSurface r0 = (androidx.camera.core.impl.DeferrableSurface) r0
            java.lang.Class r0 = r0.getContainerClass()
            java.lang.Class<androidx.camera.core.Preview> r1 = androidx.camera.core.Preview.class
            boolean r0 = java.util.Objects.equals(r0, r1)
            if (r0 == 0) goto L8
            r3 = 1
            return r3
        L22:
            r3 = 0
            return r3
    }

    private void updateParameters(@androidx.annotation.NonNull androidx.camera.camera2.interop.CaptureRequestOptions r2, @androidx.annotation.NonNull androidx.camera.camera2.interop.CaptureRequestOptions r3) {
            r1 = this;
            androidx.camera.camera2.impl.Camera2ImplConfig$Builder r0 = new androidx.camera.camera2.impl.Camera2ImplConfig$Builder
            r0.<init>()
            r0.insertAllOptions(r2)
            r0.insertAllOptions(r3)
            androidx.camera.core.impl.SessionProcessor r2 = r1.mSessionProcessor
            androidx.camera.camera2.impl.Camera2ImplConfig r3 = r0.build()
            r2.setParameters(r3)
            return
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public void cancelIssuedCaptureRequests() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "cancelIssuedCaptureRequests (id="
            r0.append(r1)
            int r1 = r3.mInstanceId
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ProcessingCaptureSession"
            androidx.camera.core.Logger.d(r1, r0)
            java.util.List<androidx.camera.core.impl.CaptureConfig> r0 = r3.mPendingCaptureConfigs
            if (r0 == 0) goto L4e
            java.util.List<androidx.camera.core.impl.CaptureConfig> r0 = r3.mPendingCaptureConfigs
            java.util.Iterator r0 = r0.iterator()
        L27:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4b
            java.lang.Object r1 = r0.next()
            androidx.camera.core.impl.CaptureConfig r1 = (androidx.camera.core.impl.CaptureConfig) r1
            java.util.List r1 = r1.getCameraCaptureCallbacks()
            java.util.Iterator r1 = r1.iterator()
        L3b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L27
            java.lang.Object r2 = r1.next()
            androidx.camera.core.impl.CameraCaptureCallback r2 = (androidx.camera.core.impl.CameraCaptureCallback) r2
            r2.onCaptureCancelled()
            goto L3b
        L4b:
            r0 = 0
            r3.mPendingCaptureConfigs = r0
        L4e:
            return
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public void close() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "close (id="
            r0.append(r1)
            int r1 = r3.mInstanceId
            r0.append(r1)
            java.lang.String r1 = ") state="
            r0.append(r1)
            androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState r1 = r3.mProcessorState
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ProcessingCaptureSession"
            androidx.camera.core.Logger.d(r1, r0)
            androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState r0 = r3.mProcessorState
            androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState r2 = androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState.ON_CAPTURE_SESSION_STARTED
            if (r0 != r2) goto L53
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "== onCaptureSessionEnd (id = "
            r0.append(r2)
            int r2 = r3.mInstanceId
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            androidx.camera.core.Logger.d(r1, r0)
            androidx.camera.core.impl.SessionProcessor r0 = r3.mSessionProcessor
            r0.onCaptureSessionEnd()
            androidx.camera.camera2.internal.Camera2RequestProcessor r0 = r3.mRequestProcessor
            if (r0 == 0) goto L4f
            r0.close()
        L4f:
            androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState r0 = androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState.ON_CAPTURE_SESSION_ENDED
            r3.mProcessorState = r0
        L53:
            androidx.camera.camera2.internal.CaptureSession r0 = r3.mCaptureSession
            r0.close()
            return
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    @androidx.annotation.NonNull
    public java.util.List<androidx.camera.core.impl.CaptureConfig> getCaptureConfigs() {
            r1 = this;
            java.util.List<androidx.camera.core.impl.CaptureConfig> r0 = r1.mPendingCaptureConfigs
            if (r0 == 0) goto L7
            java.util.List<androidx.camera.core.impl.CaptureConfig> r0 = r1.mPendingCaptureConfigs
            return r0
        L7:
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            return r0
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    @androidx.annotation.Nullable
    public androidx.camera.core.impl.SessionConfig getSessionConfig() {
            r1 = this;
            androidx.camera.core.impl.SessionConfig r0 = r1.mSessionConfig
            return r0
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public void issueCaptureRequests(@androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.CaptureConfig> r5) {
            r4 = this;
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L8
            goto L7c
        L8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "issueCaptureRequests (id="
            r0.append(r1)
            int r1 = r4.mInstanceId
            r0.append(r1)
            java.lang.String r1 = ") + state ="
            r0.append(r1)
            androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState r1 = r4.mProcessorState
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ProcessingCaptureSession"
            androidx.camera.core.Logger.d(r1, r0)
            int[] r0 = androidx.camera.camera2.internal.ProcessingCaptureSession.AnonymousClass4.$SwitchMap$androidx$camera$camera2$internal$ProcessingCaptureSession$ProcessorState
            androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState r2 = r4.mProcessorState
            int r2 = r2.ordinal()
            r0 = r0[r2]
            r2 = 1
            if (r0 == r2) goto L7d
            r2 = 2
            if (r0 == r2) goto L7d
            r3 = 3
            if (r0 == r3) goto L5e
            r2 = 4
            if (r0 == r2) goto L44
            r2 = 5
            if (r0 == r2) goto L44
            goto L7c
        L44:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Run issueCaptureRequests in wrong state, state = "
            r0.append(r2)
            androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState r2 = r4.mProcessorState
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            androidx.camera.core.Logger.d(r1, r0)
            cancelRequests(r5)
            return
        L5e:
            java.util.Iterator r5 = r5.iterator()
        L62:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L7c
            java.lang.Object r0 = r5.next()
            androidx.camera.core.impl.CaptureConfig r0 = (androidx.camera.core.impl.CaptureConfig) r0
            int r1 = r0.getTemplateType()
            if (r1 != r2) goto L78
            r4.issueStillCaptureRequest(r0)
            goto L62
        L78:
            r4.issueTriggerRequest(r0)
            goto L62
        L7c:
            return
        L7d:
            r4.mPendingCaptureConfigs = r5
            return
    }

    void issueStillCaptureRequest(@androidx.annotation.NonNull androidx.camera.core.impl.CaptureConfig r5) {
            r4 = this;
            androidx.camera.core.impl.Config r0 = r5.getImplementationOptions()
            androidx.camera.camera2.interop.CaptureRequestOptions$Builder r0 = androidx.camera.camera2.interop.CaptureRequestOptions.Builder.from(r0)
            androidx.camera.core.impl.Config r1 = r5.getImplementationOptions()
            androidx.camera.core.impl.Config$Option<java.lang.Integer> r2 = androidx.camera.core.impl.CaptureConfig.OPTION_ROTATION
            boolean r1 = r1.containsOption(r2)
            if (r1 == 0) goto L23
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.JPEG_ORIENTATION
            androidx.camera.core.impl.Config r3 = r5.getImplementationOptions()
            java.lang.Object r2 = r3.retrieveOption(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            r0.setCaptureRequestOption(r1, r2)
        L23:
            androidx.camera.core.impl.Config r1 = r5.getImplementationOptions()
            androidx.camera.core.impl.Config$Option<java.lang.Integer> r2 = androidx.camera.core.impl.CaptureConfig.OPTION_JPEG_QUALITY
            boolean r1 = r1.containsOption(r2)
            if (r1 == 0) goto L46
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.JPEG_QUALITY
            androidx.camera.core.impl.Config r3 = r5.getImplementationOptions()
            java.lang.Object r2 = r3.retrieveOption(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            byte r2 = r2.byteValue()
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            r0.setCaptureRequestOption(r1, r2)
        L46:
            androidx.camera.camera2.interop.CaptureRequestOptions r0 = r0.build()
            r4.mStillCaptureOptions = r0
            androidx.camera.camera2.interop.CaptureRequestOptions r1 = r4.mSessionOptions
            r4.updateParameters(r1, r0)
            androidx.camera.core.impl.SessionProcessor r0 = r4.mSessionProcessor
            androidx.camera.camera2.internal.ProcessingCaptureSession$3 r1 = new androidx.camera.camera2.internal.ProcessingCaptureSession$3
            r1.<init>(r4, r5)
            r0.startCapture(r1)
            return
    }

    void issueTriggerRequest(@androidx.annotation.NonNull androidx.camera.core.impl.CaptureConfig r5) {
            r4 = this;
            java.lang.String r0 = "ProcessingCaptureSession"
            java.lang.String r1 = "issueTriggerRequest"
            androidx.camera.core.Logger.d(r0, r1)
            androidx.camera.core.impl.Config r0 = r5.getImplementationOptions()
            androidx.camera.camera2.interop.CaptureRequestOptions$Builder r0 = androidx.camera.camera2.interop.CaptureRequestOptions.Builder.from(r0)
            androidx.camera.camera2.interop.CaptureRequestOptions r0 = r0.build()
            java.util.Set r1 = r0.listOptions()
            java.util.Iterator r1 = r1.iterator()
        L1b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L48
            java.lang.Object r2 = r1.next()
            androidx.camera.core.impl.Config$Option r2 = (androidx.camera.core.impl.Config.Option) r2
            java.lang.Object r2 = r2.getToken()
            android.hardware.camera2.CaptureRequest$Key r2 = (android.hardware.camera2.CaptureRequest.Key) r2
            android.hardware.camera2.CaptureRequest$Key r3 = android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L3d
            android.hardware.camera2.CaptureRequest$Key r3 = android.hardware.camera2.CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L1b
        L3d:
            androidx.camera.core.impl.SessionProcessor r1 = r4.mSessionProcessor
            androidx.camera.camera2.internal.ProcessingCaptureSession$2 r2 = new androidx.camera.camera2.internal.ProcessingCaptureSession$2
            r2.<init>(r4, r5)
            r1.startTrigger(r0, r2)
            return
        L48:
            r0 = 1
            androidx.camera.core.impl.CaptureConfig[] r0 = new androidx.camera.core.impl.CaptureConfig[r0]
            r1 = 0
            r0[r1] = r5
            java.util.List r5 = java.util.Arrays.asList(r0)
            cancelRequests(r5)
            return
    }

    void onConfigured(@androidx.annotation.NonNull androidx.camera.camera2.internal.CaptureSession r4) {
            r3 = this;
            androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState r0 = r3.mProcessorState
            androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState r1 = androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState.SESSION_INITIALIZED
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid state state:"
            r1.append(r2)
            androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState r2 = r3.mProcessorState
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            androidx.core.util.Preconditions.checkArgument(r0, r1)
            androidx.camera.camera2.internal.Camera2RequestProcessor r0 = new androidx.camera.camera2.internal.Camera2RequestProcessor
            androidx.camera.core.impl.SessionConfig r1 = r3.mProcessorSessionConfig
            java.util.List r1 = r1.getSurfaces()
            java.util.List r1 = getSessionProcessorSurfaceList(r1)
            r0.<init>(r4, r1)
            r3.mRequestProcessor = r0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "== onCaptureSessinStarted (id = "
            r4.append(r0)
            int r0 = r3.mInstanceId
            r4.append(r0)
            java.lang.String r0 = ")"
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = "ProcessingCaptureSession"
            androidx.camera.core.Logger.d(r0, r4)
            androidx.camera.core.impl.SessionProcessor r4 = r3.mSessionProcessor
            androidx.camera.camera2.internal.Camera2RequestProcessor r0 = r3.mRequestProcessor
            r4.onCaptureSessionStart(r0)
            androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState r4 = androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState.ON_CAPTURE_SESSION_STARTED
            r3.mProcessorState = r4
            androidx.camera.core.impl.SessionConfig r4 = r3.mSessionConfig
            if (r4 == 0) goto L5f
            r3.setSessionConfig(r4)
        L5f:
            java.util.List<androidx.camera.core.impl.CaptureConfig> r4 = r3.mPendingCaptureConfigs
            if (r4 == 0) goto L6b
            java.util.List<androidx.camera.core.impl.CaptureConfig> r4 = r3.mPendingCaptureConfigs
            r3.issueCaptureRequests(r4)
            r4 = 0
            r3.mPendingCaptureConfigs = r4
        L6b:
            return
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> open(@androidx.annotation.NonNull androidx.camera.core.impl.SessionConfig r9, @androidx.annotation.NonNull android.hardware.camera2.CameraDevice r10, @androidx.annotation.NonNull androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener r11) {
            r8 = this;
            androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState r0 = r8.mProcessorState
            androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState r1 = androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState.UNINITIALIZED
            r2 = 1
            if (r0 != r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Invalid state state:"
            r1.append(r3)
            androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState r3 = r8.mProcessorState
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            androidx.core.util.Preconditions.checkArgument(r0, r1)
            java.util.List r0 = r9.getSurfaces()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r2
            java.lang.String r1 = "SessionConfig contains no surfaces"
            androidx.core.util.Preconditions.checkArgument(r0, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "open (id="
            r0.append(r1)
            int r1 = r8.mInstanceId
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ProcessingCaptureSession"
            androidx.camera.core.Logger.d(r1, r0)
            java.util.List r2 = r9.getSurfaces()
            r8.mOutputSurfaces = r2
            java.util.concurrent.Executor r6 = r8.mExecutor
            java.util.concurrent.ScheduledExecutorService r7 = r8.mScheduledExecutorService
            r3 = 0
            r4 = 5000(0x1388, double:2.4703E-320)
            com.google.common.util.concurrent.ListenableFuture r0 = androidx.camera.core.impl.DeferrableSurfaces.surfaceListWithTimeout(r2, r3, r4, r6, r7)
            androidx.camera.core.impl.utils.futures.FutureChain r0 = androidx.camera.core.impl.utils.futures.FutureChain.from(r0)
            androidx.camera.camera2.internal.y1 r1 = new androidx.camera.camera2.internal.y1
            r1.<init>(r8, r9, r10, r11)
            java.util.concurrent.Executor r9 = r8.mExecutor
            androidx.camera.core.impl.utils.futures.FutureChain r9 = r0.transformAsync(r1, r9)
            androidx.camera.camera2.internal.z1 r10 = new androidx.camera.camera2.internal.z1
            r10.<init>(r8)
            java.util.concurrent.Executor r11 = r8.mExecutor
            androidx.camera.core.impl.utils.futures.FutureChain r9 = r9.transform(r10, r11)
            return r9
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> release(boolean r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "release (id="
            r0.append(r1)
            int r1 = r2.mInstanceId
            r0.append(r1)
            java.lang.String r1 = ") mProcessorState="
            r0.append(r1)
            androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState r1 = r2.mProcessorState
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ProcessingCaptureSession"
            androidx.camera.core.Logger.d(r1, r0)
            androidx.camera.camera2.internal.CaptureSession r0 = r2.mCaptureSession
            com.google.common.util.concurrent.ListenableFuture r3 = r0.release(r3)
            int[] r0 = androidx.camera.camera2.internal.ProcessingCaptureSession.AnonymousClass4.$SwitchMap$androidx$camera$camera2$internal$ProcessingCaptureSession$ProcessorState
            androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState r1 = r2.mProcessorState
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 2
            if (r0 == r1) goto L39
            r1 = 4
            if (r0 == r1) goto L39
            goto L45
        L39:
            androidx.camera.camera2.internal.a2 r0 = new androidx.camera.camera2.internal.a2
            r0.<init>(r2)
            java.util.concurrent.Executor r1 = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()
            r3.addListener(r0, r1)
        L45:
            androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState r0 = androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState.DE_INITIALIZED
            r2.mProcessorState = r0
            return r3
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public void setSessionConfig(@androidx.annotation.Nullable androidx.camera.core.impl.SessionConfig r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "setSessionConfig (id="
            r0.append(r1)
            int r1 = r2.mInstanceId
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ProcessingCaptureSession"
            androidx.camera.core.Logger.d(r1, r0)
            r2.mSessionConfig = r3
            if (r3 != 0) goto L22
            goto L59
        L22:
            androidx.camera.camera2.internal.Camera2RequestProcessor r0 = r2.mRequestProcessor
            if (r0 == 0) goto L29
            r0.updateSessionConfig(r3)
        L29:
            androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState r0 = r2.mProcessorState
            androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState r1 = androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState.ON_CAPTURE_SESSION_STARTED
            if (r0 != r1) goto L59
            androidx.camera.core.impl.Config r0 = r3.getImplementationOptions()
            androidx.camera.camera2.interop.CaptureRequestOptions$Builder r0 = androidx.camera.camera2.interop.CaptureRequestOptions.Builder.from(r0)
            androidx.camera.camera2.interop.CaptureRequestOptions r0 = r0.build()
            r2.mSessionOptions = r0
            androidx.camera.camera2.interop.CaptureRequestOptions r1 = r2.mStillCaptureOptions
            r2.updateParameters(r0, r1)
            androidx.camera.core.impl.CaptureConfig r3 = r3.getRepeatingCaptureConfig()
            boolean r3 = r2.hasPreviewSurface(r3)
            if (r3 != 0) goto L52
            androidx.camera.core.impl.SessionProcessor r3 = r2.mSessionProcessor
            r3.stopRepeating()
            return
        L52:
            androidx.camera.core.impl.SessionProcessor r3 = r2.mSessionProcessor
            androidx.camera.camera2.internal.ProcessingCaptureSession$SessionProcessorCaptureCallback r0 = r2.mSessionProcessorCaptureCallback
            r3.startRepeating(r0)
        L59:
            return
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public void setStreamUseCaseMap(@androidx.annotation.NonNull java.util.Map<androidx.camera.core.impl.DeferrableSurface, java.lang.Long> r1) {
            r0 = this;
            return
    }
}
