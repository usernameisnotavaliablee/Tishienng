package androidx.camera.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
@androidx.annotation.MainThread
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class CameraX {
    private static final java.lang.Object MIN_LOG_LEVEL_LOCK = null;
    private static final long RETRY_SLEEP_MILLIS = 500;
    private static final java.lang.String RETRY_TOKEN = "retry_token";
    private static final java.lang.String TAG = "CameraX";
    private static final long WAIT_INITIALIZED_TIMEOUT_MILLIS = 3000;

    @androidx.annotation.GuardedBy("MIN_LOG_LEVEL_LOCK")
    private static final android.util.SparseArray<java.lang.Integer> sMinLogLevelReferenceCountMap = null;
    private android.content.Context mAppContext;
    private final java.util.concurrent.Executor mCameraExecutor;
    private androidx.camera.core.impl.CameraFactory mCameraFactory;
    final androidx.camera.core.impl.CameraRepository mCameraRepository;
    private final androidx.camera.core.CameraXConfig mCameraXConfig;
    private androidx.camera.core.impl.UseCaseConfigFactory mDefaultConfigFactory;
    private final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> mInitInternalFuture;

    @androidx.annotation.GuardedBy("mInitializeLock")
    private androidx.camera.core.CameraX.InternalInitState mInitState;
    private final java.lang.Object mInitializeLock;
    private final java.lang.Integer mMinLogLevel;
    private final android.os.Handler mSchedulerHandler;

    @androidx.annotation.Nullable
    private final android.os.HandlerThread mSchedulerThread;

    @androidx.annotation.GuardedBy("mInitializeLock")
    private com.google.common.util.concurrent.ListenableFuture<java.lang.Void> mShutdownInternalFuture;
    private androidx.camera.core.impl.CameraDeviceSurfaceManager mSurfaceManager;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.camera.core.CameraX$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$camera$core$CameraX$InternalInitState = null;

        static {
                androidx.camera.core.CameraX$InternalInitState[] r0 = androidx.camera.core.CameraX.InternalInitState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.camera.core.CameraX.AnonymousClass1.$SwitchMap$androidx$camera$core$CameraX$InternalInitState = r0
                androidx.camera.core.CameraX$InternalInitState r1 = androidx.camera.core.CameraX.InternalInitState.UNINITIALIZED     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.camera.core.CameraX.AnonymousClass1.$SwitchMap$androidx$camera$core$CameraX$InternalInitState     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.camera.core.CameraX$InternalInitState r1 = androidx.camera.core.CameraX.InternalInitState.INITIALIZING     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.camera.core.CameraX.AnonymousClass1.$SwitchMap$androidx$camera$core$CameraX$InternalInitState     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.camera.core.CameraX$InternalInitState r1 = androidx.camera.core.CameraX.InternalInitState.INITIALIZING_ERROR     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = androidx.camera.core.CameraX.AnonymousClass1.$SwitchMap$androidx$camera$core$CameraX$InternalInitState     // Catch: java.lang.NoSuchFieldError -> L33
                androidx.camera.core.CameraX$InternalInitState r1 = androidx.camera.core.CameraX.InternalInitState.INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = androidx.camera.core.CameraX.AnonymousClass1.$SwitchMap$androidx$camera$core$CameraX$InternalInitState     // Catch: java.lang.NoSuchFieldError -> L3e
                androidx.camera.core.CameraX$InternalInitState r1 = androidx.camera.core.CameraX.InternalInitState.SHUTDOWN     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private enum InternalInitState extends java.lang.Enum<androidx.camera.core.CameraX.InternalInitState> {
        private static final /* synthetic */ androidx.camera.core.CameraX.InternalInitState[] $VALUES = null;
        public static final androidx.camera.core.CameraX.InternalInitState INITIALIZED = null;
        public static final androidx.camera.core.CameraX.InternalInitState INITIALIZING = null;
        public static final androidx.camera.core.CameraX.InternalInitState INITIALIZING_ERROR = null;
        public static final androidx.camera.core.CameraX.InternalInitState SHUTDOWN = null;
        public static final androidx.camera.core.CameraX.InternalInitState UNINITIALIZED = null;

        private static /* synthetic */ androidx.camera.core.CameraX.InternalInitState[] $values() {
                r0 = 5
                androidx.camera.core.CameraX$InternalInitState[] r0 = new androidx.camera.core.CameraX.InternalInitState[r0]
                androidx.camera.core.CameraX$InternalInitState r1 = androidx.camera.core.CameraX.InternalInitState.UNINITIALIZED
                r2 = 0
                r0[r2] = r1
                androidx.camera.core.CameraX$InternalInitState r1 = androidx.camera.core.CameraX.InternalInitState.INITIALIZING
                r2 = 1
                r0[r2] = r1
                androidx.camera.core.CameraX$InternalInitState r1 = androidx.camera.core.CameraX.InternalInitState.INITIALIZING_ERROR
                r2 = 2
                r0[r2] = r1
                androidx.camera.core.CameraX$InternalInitState r1 = androidx.camera.core.CameraX.InternalInitState.INITIALIZED
                r2 = 3
                r0[r2] = r1
                androidx.camera.core.CameraX$InternalInitState r1 = androidx.camera.core.CameraX.InternalInitState.SHUTDOWN
                r2 = 4
                r0[r2] = r1
                return r0
        }

        static {
                androidx.camera.core.CameraX$InternalInitState r0 = new androidx.camera.core.CameraX$InternalInitState
                java.lang.String r1 = "UNINITIALIZED"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.camera.core.CameraX.InternalInitState.UNINITIALIZED = r0
                androidx.camera.core.CameraX$InternalInitState r0 = new androidx.camera.core.CameraX$InternalInitState
                java.lang.String r1 = "INITIALIZING"
                r2 = 1
                r0.<init>(r1, r2)
                androidx.camera.core.CameraX.InternalInitState.INITIALIZING = r0
                androidx.camera.core.CameraX$InternalInitState r0 = new androidx.camera.core.CameraX$InternalInitState
                java.lang.String r1 = "INITIALIZING_ERROR"
                r2 = 2
                r0.<init>(r1, r2)
                androidx.camera.core.CameraX.InternalInitState.INITIALIZING_ERROR = r0
                androidx.camera.core.CameraX$InternalInitState r0 = new androidx.camera.core.CameraX$InternalInitState
                java.lang.String r1 = "INITIALIZED"
                r2 = 3
                r0.<init>(r1, r2)
                androidx.camera.core.CameraX.InternalInitState.INITIALIZED = r0
                androidx.camera.core.CameraX$InternalInitState r0 = new androidx.camera.core.CameraX$InternalInitState
                java.lang.String r1 = "SHUTDOWN"
                r2 = 4
                r0.<init>(r1, r2)
                androidx.camera.core.CameraX.InternalInitState.SHUTDOWN = r0
                androidx.camera.core.CameraX$InternalInitState[] r0 = $values()
                androidx.camera.core.CameraX.InternalInitState.$VALUES = r0
                return
        }

        InternalInitState(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.camera.core.CameraX.InternalInitState valueOf(java.lang.String r1) {
                java.lang.Class<androidx.camera.core.CameraX$InternalInitState> r0 = androidx.camera.core.CameraX.InternalInitState.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.camera.core.CameraX$InternalInitState r1 = (androidx.camera.core.CameraX.InternalInitState) r1
                return r1
        }

        public static androidx.camera.core.CameraX.InternalInitState[] values() {
                androidx.camera.core.CameraX$InternalInitState[] r0 = androidx.camera.core.CameraX.InternalInitState.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.camera.core.CameraX$InternalInitState[] r0 = (androidx.camera.core.CameraX.InternalInitState[]) r0
                return r0
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.camera.core.CameraX.MIN_LOG_LEVEL_LOCK = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            androidx.camera.core.CameraX.sMinLogLevelReferenceCountMap = r0
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public CameraX(@androidx.annotation.NonNull android.content.Context r4, @androidx.annotation.Nullable androidx.camera.core.CameraXConfig.Provider r5) {
            r3 = this;
            r3.<init>()
            androidx.camera.core.impl.CameraRepository r0 = new androidx.camera.core.impl.CameraRepository
            r0.<init>()
            r3.mCameraRepository = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r3.mInitializeLock = r0
            androidx.camera.core.CameraX$InternalInitState r0 = androidx.camera.core.CameraX.InternalInitState.UNINITIALIZED
            r3.mInitState = r0
            r0 = 0
            com.google.common.util.concurrent.ListenableFuture r1 = androidx.camera.core.impl.utils.futures.Futures.immediateFuture(r0)
            r3.mShutdownInternalFuture = r1
            if (r5 == 0) goto L25
            androidx.camera.core.CameraXConfig r5 = r5.getCameraXConfig()
            r3.mCameraXConfig = r5
            goto L31
        L25:
            androidx.camera.core.CameraXConfig$Provider r5 = getConfigProvider(r4)
            if (r5 == 0) goto L7b
            androidx.camera.core.CameraXConfig r5 = r5.getCameraXConfig()
            r3.mCameraXConfig = r5
        L31:
            androidx.camera.core.CameraXConfig r5 = r3.mCameraXConfig
            java.util.concurrent.Executor r5 = r5.getCameraExecutor(r0)
            androidx.camera.core.CameraXConfig r1 = r3.mCameraXConfig
            android.os.Handler r1 = r1.getSchedulerHandler(r0)
            if (r5 != 0) goto L44
            androidx.camera.core.CameraExecutor r5 = new androidx.camera.core.CameraExecutor
            r5.<init>()
        L44:
            r3.mCameraExecutor = r5
            if (r1 != 0) goto L61
            android.os.HandlerThread r5 = new android.os.HandlerThread
            java.lang.String r1 = "CameraX-scheduler"
            r2 = 10
            r5.<init>(r1, r2)
            r3.mSchedulerThread = r5
            r5.start()
            android.os.Looper r5 = r5.getLooper()
            android.os.Handler r5 = androidx.core.os.HandlerCompat.createAsync(r5)
            r3.mSchedulerHandler = r5
            goto L65
        L61:
            r3.mSchedulerThread = r0
            r3.mSchedulerHandler = r1
        L65:
            androidx.camera.core.CameraXConfig r5 = r3.mCameraXConfig
            androidx.camera.core.impl.Config$Option<java.lang.Integer> r1 = androidx.camera.core.CameraXConfig.OPTION_MIN_LOGGING_LEVEL
            java.lang.Object r5 = r5.retrieveOption(r1, r0)
            java.lang.Integer r5 = (java.lang.Integer) r5
            r3.mMinLogLevel = r5
            increaseMinLogLevelReference(r5)
            com.google.common.util.concurrent.ListenableFuture r4 = r3.initInternal(r4)
            r3.mInitInternalFuture = r4
            return
        L7b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'."
            r4.<init>(r5)
            throw r4
    }

    public static /* synthetic */ void a(androidx.camera.core.CameraX r2, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r3) {
            android.os.HandlerThread r0 = r2.mSchedulerThread
            if (r0 == 0) goto L14
            java.util.concurrent.Executor r0 = r2.mCameraExecutor
            boolean r1 = r0 instanceof androidx.camera.core.CameraExecutor
            if (r1 == 0) goto Lf
            androidx.camera.core.CameraExecutor r0 = (androidx.camera.core.CameraExecutor) r0
            r0.deinit()
        Lf:
            android.os.HandlerThread r2 = r2.mSchedulerThread
            r2.quit()
        L14:
            r2 = 0
            r3.set(r2)
            return
    }

    public static /* synthetic */ void b(androidx.camera.core.CameraX r6, android.content.Context r7, java.util.concurrent.Executor r8, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r9, long r10) {
            r6.getClass()
            r1 = 0
            android.app.Application r0 = androidx.camera.core.impl.utils.ContextUtil.getApplicationFromContext(r7)     // Catch: java.lang.RuntimeException -> L13 androidx.camera.core.InitializationException -> L17 androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException -> L19
            r6.mAppContext = r0     // Catch: java.lang.RuntimeException -> L13 androidx.camera.core.InitializationException -> L17 androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException -> L19
            if (r0 != 0) goto L1b
            android.content.Context r7 = androidx.camera.core.impl.utils.ContextUtil.getApplicationContext(r7)     // Catch: java.lang.RuntimeException -> L13 androidx.camera.core.InitializationException -> L17 androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException -> L19
            r6.mAppContext = r7     // Catch: java.lang.RuntimeException -> L13 androidx.camera.core.InitializationException -> L17 androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException -> L19
            goto L1b
        L13:
            r0 = move-exception
        L14:
            r7 = r0
            goto Lad
        L17:
            r0 = move-exception
            goto L14
        L19:
            r0 = move-exception
            goto L14
        L1b:
            androidx.camera.core.CameraXConfig r7 = r6.mCameraXConfig     // Catch: java.lang.RuntimeException -> L13 androidx.camera.core.InitializationException -> L17 androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException -> L19
            androidx.camera.core.impl.CameraFactory$Provider r7 = r7.getCameraFactoryProvider(r1)     // Catch: java.lang.RuntimeException -> L13 androidx.camera.core.InitializationException -> L17 androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException -> L19
            if (r7 == 0) goto La0
            java.util.concurrent.Executor r0 = r6.mCameraExecutor     // Catch: java.lang.RuntimeException -> L13 androidx.camera.core.InitializationException -> L17 androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException -> L19
            android.os.Handler r2 = r6.mSchedulerHandler     // Catch: java.lang.RuntimeException -> L13 androidx.camera.core.InitializationException -> L17 androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException -> L19
            androidx.camera.core.impl.CameraThreadConfig r0 = androidx.camera.core.impl.CameraThreadConfig.create(r0, r2)     // Catch: java.lang.RuntimeException -> L13 androidx.camera.core.InitializationException -> L17 androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException -> L19
            androidx.camera.core.CameraXConfig r2 = r6.mCameraXConfig     // Catch: java.lang.RuntimeException -> L13 androidx.camera.core.InitializationException -> L17 androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException -> L19
            androidx.camera.core.CameraSelector r2 = r2.getAvailableCamerasLimiter(r1)     // Catch: java.lang.RuntimeException -> L13 androidx.camera.core.InitializationException -> L17 androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException -> L19
            android.content.Context r3 = r6.mAppContext     // Catch: java.lang.RuntimeException -> L13 androidx.camera.core.InitializationException -> L17 androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException -> L19
            androidx.camera.core.impl.CameraFactory r7 = r7.newInstance(r3, r0, r2)     // Catch: java.lang.RuntimeException -> L13 androidx.camera.core.InitializationException -> L17 androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException -> L19
            r6.mCameraFactory = r7     // Catch: java.lang.RuntimeException -> L13 androidx.camera.core.InitializationException -> L17 androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException -> L19
            androidx.camera.core.CameraXConfig r7 = r6.mCameraXConfig     // Catch: java.lang.RuntimeException -> L13 androidx.camera.core.InitializationException -> L17 androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException -> L19
            androidx.camera.core.impl.CameraDeviceSurfaceManager$Provider r7 = r7.getDeviceSurfaceManagerProvider(r1)     // Catch: java.lang.RuntimeException -> L13 androidx.camera.core.InitializationException -> L17 androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException -> L19
            if (r7 == 0) goto L93
            android.content.Context r0 = r6.mAppContext     // Catch: java.lang.RuntimeException -> L13 androidx.camera.core.InitializationException -> L17 androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException -> L19
            androidx.camera.core.impl.CameraFactory r3 = r6.mCameraFactory     // Catch: java.lang.RuntimeException -> L13 androidx.camera.core.InitializationException -> L17 androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException -> L19
            java.lang.Object r3 = r3.getCameraManager()     // Catch: java.lang.RuntimeException -> L13 androidx.camera.core.InitializationException -> L17 androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException -> L19
            androidx.camera.core.impl.CameraFactory r4 = r6.mCameraFactory     // Catch: java.lang.RuntimeException -> L13 androidx.camera.core.InitializationException -> L17 androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException -> L19
            java.util.Set r4 = r4.getAvailableCameraIds()     // Catch: java.lang.RuntimeException -> L13 androidx.camera.core.InitializationException -> L17 androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException -> L19
            androidx.camera.core.impl.CameraDeviceSurfaceManager r7 = r7.newInstance(r0, r3, r4)     // Catch: java.lang.RuntimeException -> L13 androidx.camera.core.InitializationException -> L17 androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException -> L19
            r6.mSurfaceManager = r7     // Catch: java.lang.RuntimeException -> L13 androidx.camera.core.InitializationException -> L17 androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException -> L19
            androidx.camera.core.CameraXConfig r7 = r6.mCameraXConfig     // Catch: java.lang.RuntimeException -> L13 androidx.camera.core.InitializationException -> L17 androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException -> L19
            androidx.camera.core.impl.UseCaseConfigFactory$Provider r7 = r7.getUseCaseConfigFactoryProvider(r1)     // Catch: java.lang.RuntimeException -> L13 androidx.camera.core.InitializationException -> L17 androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException -> L19
            if (r7 == 0) goto L86
            android.content.Context r0 = r6.mAppContext     // Catch: java.lang.RuntimeException -> L13 androidx.camera.core.InitializationException -> L17 androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException -> L19
            androidx.camera.core.impl.UseCaseConfigFactory r7 = r7.newInstance(r0)     // Catch: java.lang.RuntimeException -> L13 androidx.camera.core.InitializationException -> L17 androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException -> L19
            r6.mDefaultConfigFactory = r7     // Catch: java.lang.RuntimeException -> L13 androidx.camera.core.InitializationException -> L17 androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException -> L19
            boolean r7 = r8 instanceof androidx.camera.core.CameraExecutor     // Catch: java.lang.RuntimeException -> L13 androidx.camera.core.InitializationException -> L17 androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException -> L19
            if (r7 == 0) goto L71
            r7 = r8
            androidx.camera.core.CameraExecutor r7 = (androidx.camera.core.CameraExecutor) r7     // Catch: java.lang.RuntimeException -> L13 androidx.camera.core.InitializationException -> L17 androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException -> L19
            androidx.camera.core.impl.CameraFactory r0 = r6.mCameraFactory     // Catch: java.lang.RuntimeException -> L13 androidx.camera.core.InitializationException -> L17 androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException -> L19
            r7.init(r0)     // Catch: java.lang.RuntimeException -> L13 androidx.camera.core.InitializationException -> L17 androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException -> L19
        L71:
            androidx.camera.core.impl.CameraRepository r7 = r6.mCameraRepository     // Catch: java.lang.RuntimeException -> L13 androidx.camera.core.InitializationException -> L17 androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException -> L19
            androidx.camera.core.impl.CameraFactory r0 = r6.mCameraFactory     // Catch: java.lang.RuntimeException -> L13 androidx.camera.core.InitializationException -> L17 androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException -> L19
            r7.init(r0)     // Catch: java.lang.RuntimeException -> L13 androidx.camera.core.InitializationException -> L17 androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException -> L19
            android.content.Context r7 = r6.mAppContext     // Catch: java.lang.RuntimeException -> L13 androidx.camera.core.InitializationException -> L17 androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException -> L19
            androidx.camera.core.impl.CameraRepository r0 = r6.mCameraRepository     // Catch: java.lang.RuntimeException -> L13 androidx.camera.core.InitializationException -> L17 androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException -> L19
            androidx.camera.core.impl.CameraValidator.validateCameras(r7, r0, r2)     // Catch: java.lang.RuntimeException -> L13 androidx.camera.core.InitializationException -> L17 androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException -> L19
            r6.setStateToInitialized()     // Catch: java.lang.RuntimeException -> L13 androidx.camera.core.InitializationException -> L17 androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException -> L19
            r9.set(r1)     // Catch: java.lang.RuntimeException -> L13 androidx.camera.core.InitializationException -> L17 androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException -> L19
            return
        L86:
            androidx.camera.core.InitializationException r7 = new androidx.camera.core.InitializationException     // Catch: java.lang.RuntimeException -> L13 androidx.camera.core.InitializationException -> L17 androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException -> L19
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.RuntimeException -> L13 androidx.camera.core.InitializationException -> L17 androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException -> L19
            java.lang.String r2 = "Invalid app configuration provided. Missing UseCaseConfigFactory."
            r0.<init>(r2)     // Catch: java.lang.RuntimeException -> L13 androidx.camera.core.InitializationException -> L17 androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException -> L19
            r7.<init>(r0)     // Catch: java.lang.RuntimeException -> L13 androidx.camera.core.InitializationException -> L17 androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException -> L19
            throw r7     // Catch: java.lang.RuntimeException -> L13 androidx.camera.core.InitializationException -> L17 androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException -> L19
        L93:
            androidx.camera.core.InitializationException r7 = new androidx.camera.core.InitializationException     // Catch: java.lang.RuntimeException -> L13 androidx.camera.core.InitializationException -> L17 androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException -> L19
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.RuntimeException -> L13 androidx.camera.core.InitializationException -> L17 androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException -> L19
            java.lang.String r2 = "Invalid app configuration provided. Missing CameraDeviceSurfaceManager."
            r0.<init>(r2)     // Catch: java.lang.RuntimeException -> L13 androidx.camera.core.InitializationException -> L17 androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException -> L19
            r7.<init>(r0)     // Catch: java.lang.RuntimeException -> L13 androidx.camera.core.InitializationException -> L17 androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException -> L19
            throw r7     // Catch: java.lang.RuntimeException -> L13 androidx.camera.core.InitializationException -> L17 androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException -> L19
        La0:
            androidx.camera.core.InitializationException r7 = new androidx.camera.core.InitializationException     // Catch: java.lang.RuntimeException -> L13 androidx.camera.core.InitializationException -> L17 androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException -> L19
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.RuntimeException -> L13 androidx.camera.core.InitializationException -> L17 androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException -> L19
            java.lang.String r2 = "Invalid app configuration provided. Missing CameraFactory."
            r0.<init>(r2)     // Catch: java.lang.RuntimeException -> L13 androidx.camera.core.InitializationException -> L17 androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException -> L19
            r7.<init>(r0)     // Catch: java.lang.RuntimeException -> L13 androidx.camera.core.InitializationException -> L17 androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException -> L19
            throw r7     // Catch: java.lang.RuntimeException -> L13 androidx.camera.core.InitializationException -> L17 androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException -> L19
        Lad:
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r2 = r2 - r10
            r4 = 2500(0x9c4, double:1.235E-320)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto Led
            java.lang.String r0 = "CameraX"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Retry init. Start time "
            r1.append(r2)
            r1.append(r10)
            java.lang.String r2 = " current time "
            r1.append(r2)
            long r2 = android.os.SystemClock.elapsedRealtime()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            androidx.camera.core.Logger.w(r0, r1, r7)
            android.os.Handler r7 = r6.mSchedulerHandler
            androidx.camera.core.j r0 = new androidx.camera.core.j
            r1 = r6
            r2 = r8
            r5 = r9
            r3 = r10
            r0.<init>(r1, r2, r3, r5)
            java.lang.String r6 = "retry_token"
            r8 = 500(0x1f4, double:2.47E-321)
            androidx.core.os.HandlerCompat.postDelayed(r7, r0, r6, r8)
            goto L115
        Led:
            r5 = r9
            java.lang.Object r8 = r6.mInitializeLock
            monitor-enter(r8)
            androidx.camera.core.CameraX$InternalInitState r9 = androidx.camera.core.CameraX.InternalInitState.INITIALIZING_ERROR     // Catch: java.lang.Throwable -> L116
            r6.mInitState = r9     // Catch: java.lang.Throwable -> L116
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L116
            boolean r6 = r7 instanceof androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException
            if (r6 == 0) goto L105
            java.lang.String r6 = "CameraX"
            java.lang.String r7 = "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries."
            androidx.camera.core.Logger.e(r6, r7)
            r5.set(r1)
            goto L115
        L105:
            boolean r6 = r7 instanceof androidx.camera.core.InitializationException
            if (r6 == 0) goto L10d
            r5.setException(r7)
            goto L115
        L10d:
            androidx.camera.core.InitializationException r6 = new androidx.camera.core.InitializationException
            r6.<init>(r7)
            r5.setException(r6)
        L115:
            return
        L116:
            r0 = move-exception
            r6 = r0
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L116
            throw r6
    }

    public static /* synthetic */ java.lang.Object c(androidx.camera.core.CameraX r6, android.content.Context r7, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r8) {
            java.util.concurrent.Executor r1 = r6.mCameraExecutor
            long r2 = android.os.SystemClock.elapsedRealtime()
            r0 = r6
            r4 = r7
            r5 = r8
            r0.initAndRetryRecursively(r1, r2, r4, r5)
            java.lang.String r6 = "CameraX initInternal"
            return r6
    }

    public static /* synthetic */ java.lang.Object d(androidx.camera.core.CameraX r2, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r3) {
            androidx.camera.core.impl.CameraRepository r0 = r2.mCameraRepository
            com.google.common.util.concurrent.ListenableFuture r0 = r0.deinit()
            androidx.camera.core.g r1 = new androidx.camera.core.g
            r1.<init>(r2, r3)
            java.util.concurrent.Executor r2 = r2.mCameraExecutor
            r0.addListener(r1, r2)
            java.lang.String r2 = "CameraX shutdownInternal"
            return r2
    }

    private static void decreaseMinLogLevelReference(@androidx.annotation.Nullable java.lang.Integer r3) {
            java.lang.Object r0 = androidx.camera.core.CameraX.MIN_LOG_LEVEL_LOCK
            monitor-enter(r0)
            if (r3 != 0) goto L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r3 = move-exception
            goto L35
        L9:
            android.util.SparseArray<java.lang.Integer> r1 = androidx.camera.core.CameraX.sMinLogLevelReferenceCountMap     // Catch: java.lang.Throwable -> L7
            int r2 = r3.intValue()     // Catch: java.lang.Throwable -> L7
            java.lang.Object r2 = r1.get(r2)     // Catch: java.lang.Throwable -> L7
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> L7
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L7
            int r2 = r2 + (-1)
            if (r2 != 0) goto L25
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L7
            r1.remove(r3)     // Catch: java.lang.Throwable -> L7
            goto L30
        L25:
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L7
            r1.put(r3, r2)     // Catch: java.lang.Throwable -> L7
        L30:
            updateOrResetMinLogLevel()     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return
        L35:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r3
    }

    public static /* synthetic */ void e(androidx.camera.core.CameraX r6, java.util.concurrent.Executor r7, long r8, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r10) {
            android.content.Context r4 = r6.mAppContext
            r0 = r6
            r1 = r7
            r2 = r8
            r5 = r10
            r0.initAndRetryRecursively(r1, r2, r4, r5)
            return
    }

    @androidx.annotation.Nullable
    private static androidx.camera.core.CameraXConfig.Provider getConfigProvider(@androidx.annotation.NonNull android.content.Context r5) {
            java.lang.String r0 = "CameraX"
            android.app.Application r1 = androidx.camera.core.impl.utils.ContextUtil.getApplicationFromContext(r5)
            boolean r2 = r1 instanceof androidx.camera.core.CameraXConfig.Provider
            if (r2 == 0) goto Ld
            androidx.camera.core.CameraXConfig$Provider r1 = (androidx.camera.core.CameraXConfig.Provider) r1
            return r1
        Ld:
            r1 = 0
            android.content.Context r5 = androidx.camera.core.impl.utils.ContextUtil.getApplicationContext(r5)     // Catch: java.lang.NullPointerException -> L2e java.lang.IllegalAccessException -> L30 java.lang.NoSuchMethodException -> L32 java.lang.reflect.InvocationTargetException -> L34 java.lang.InstantiationException -> L36 java.lang.ClassNotFoundException -> L38 android.content.pm.PackageManager.NameNotFoundException -> L3a
            android.content.pm.PackageManager r2 = r5.getPackageManager()     // Catch: java.lang.NullPointerException -> L2e java.lang.IllegalAccessException -> L30 java.lang.NoSuchMethodException -> L32 java.lang.reflect.InvocationTargetException -> L34 java.lang.InstantiationException -> L36 java.lang.ClassNotFoundException -> L38 android.content.pm.PackageManager.NameNotFoundException -> L3a
            android.content.ComponentName r3 = new android.content.ComponentName     // Catch: java.lang.NullPointerException -> L2e java.lang.IllegalAccessException -> L30 java.lang.NoSuchMethodException -> L32 java.lang.reflect.InvocationTargetException -> L34 java.lang.InstantiationException -> L36 java.lang.ClassNotFoundException -> L38 android.content.pm.PackageManager.NameNotFoundException -> L3a
            java.lang.Class<androidx.camera.core.impl.MetadataHolderService> r4 = androidx.camera.core.impl.MetadataHolderService.class
            r3.<init>(r5, r4)     // Catch: java.lang.NullPointerException -> L2e java.lang.IllegalAccessException -> L30 java.lang.NoSuchMethodException -> L32 java.lang.reflect.InvocationTargetException -> L34 java.lang.InstantiationException -> L36 java.lang.ClassNotFoundException -> L38 android.content.pm.PackageManager.NameNotFoundException -> L3a
            r5 = 640(0x280, float:8.97E-43)
            android.content.pm.ServiceInfo r5 = r2.getServiceInfo(r3, r5)     // Catch: java.lang.NullPointerException -> L2e java.lang.IllegalAccessException -> L30 java.lang.NoSuchMethodException -> L32 java.lang.reflect.InvocationTargetException -> L34 java.lang.InstantiationException -> L36 java.lang.ClassNotFoundException -> L38 android.content.pm.PackageManager.NameNotFoundException -> L3a
            android.os.Bundle r5 = r5.metaData     // Catch: java.lang.NullPointerException -> L2e java.lang.IllegalAccessException -> L30 java.lang.NoSuchMethodException -> L32 java.lang.reflect.InvocationTargetException -> L34 java.lang.InstantiationException -> L36 java.lang.ClassNotFoundException -> L38 android.content.pm.PackageManager.NameNotFoundException -> L3a
            if (r5 == 0) goto L3c
            java.lang.String r2 = "androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER"
            java.lang.String r5 = r5.getString(r2)     // Catch: java.lang.NullPointerException -> L2e java.lang.IllegalAccessException -> L30 java.lang.NoSuchMethodException -> L32 java.lang.reflect.InvocationTargetException -> L34 java.lang.InstantiationException -> L36 java.lang.ClassNotFoundException -> L38 android.content.pm.PackageManager.NameNotFoundException -> L3a
            goto L3d
        L2e:
            r5 = move-exception
            goto L54
        L30:
            r5 = move-exception
            goto L54
        L32:
            r5 = move-exception
            goto L54
        L34:
            r5 = move-exception
            goto L54
        L36:
            r5 = move-exception
            goto L54
        L38:
            r5 = move-exception
            goto L54
        L3a:
            r5 = move-exception
            goto L54
        L3c:
            r5 = r1
        L3d:
            if (r5 != 0) goto L45
            java.lang.String r5 = "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'."
            androidx.camera.core.Logger.e(r0, r5)     // Catch: java.lang.NullPointerException -> L2e java.lang.IllegalAccessException -> L30 java.lang.NoSuchMethodException -> L32 java.lang.reflect.InvocationTargetException -> L34 java.lang.InstantiationException -> L36 java.lang.ClassNotFoundException -> L38 android.content.pm.PackageManager.NameNotFoundException -> L3a
            return r1
        L45:
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.NullPointerException -> L2e java.lang.IllegalAccessException -> L30 java.lang.NoSuchMethodException -> L32 java.lang.reflect.InvocationTargetException -> L34 java.lang.InstantiationException -> L36 java.lang.ClassNotFoundException -> L38 android.content.pm.PackageManager.NameNotFoundException -> L3a
            java.lang.reflect.Constructor r5 = r5.getDeclaredConstructor(r1)     // Catch: java.lang.NullPointerException -> L2e java.lang.IllegalAccessException -> L30 java.lang.NoSuchMethodException -> L32 java.lang.reflect.InvocationTargetException -> L34 java.lang.InstantiationException -> L36 java.lang.ClassNotFoundException -> L38 android.content.pm.PackageManager.NameNotFoundException -> L3a
            java.lang.Object r5 = r5.newInstance(r1)     // Catch: java.lang.NullPointerException -> L2e java.lang.IllegalAccessException -> L30 java.lang.NoSuchMethodException -> L32 java.lang.reflect.InvocationTargetException -> L34 java.lang.InstantiationException -> L36 java.lang.ClassNotFoundException -> L38 android.content.pm.PackageManager.NameNotFoundException -> L3a
            androidx.camera.core.CameraXConfig$Provider r5 = (androidx.camera.core.CameraXConfig.Provider) r5     // Catch: java.lang.NullPointerException -> L2e java.lang.IllegalAccessException -> L30 java.lang.NoSuchMethodException -> L32 java.lang.reflect.InvocationTargetException -> L34 java.lang.InstantiationException -> L36 java.lang.ClassNotFoundException -> L38 android.content.pm.PackageManager.NameNotFoundException -> L3a
            return r5
        L54:
            java.lang.String r2 = "Failed to retrieve default CameraXConfig.Provider from meta-data"
            androidx.camera.core.Logger.e(r0, r2, r5)
            return r1
    }

    private static void increaseMinLogLevelReference(@androidx.annotation.Nullable java.lang.Integer r5) {
            java.lang.Object r0 = androidx.camera.core.CameraX.MIN_LOG_LEVEL_LOCK
            monitor-enter(r0)
            if (r5 != 0) goto L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r5 = move-exception
            goto L40
        L9:
            int r1 = r5.intValue()     // Catch: java.lang.Throwable -> L7
            java.lang.String r2 = "minLogLevel"
            r3 = 3
            r4 = 6
            androidx.core.util.Preconditions.checkArgumentInRange(r1, r3, r4, r2)     // Catch: java.lang.Throwable -> L7
            android.util.SparseArray<java.lang.Integer> r1 = androidx.camera.core.CameraX.sMinLogLevelReferenceCountMap     // Catch: java.lang.Throwable -> L7
            int r2 = r5.intValue()     // Catch: java.lang.Throwable -> L7
            java.lang.Object r2 = r1.get(r2)     // Catch: java.lang.Throwable -> L7
            r3 = 1
            if (r2 == 0) goto L30
            int r2 = r5.intValue()     // Catch: java.lang.Throwable -> L7
            java.lang.Object r2 = r1.get(r2)     // Catch: java.lang.Throwable -> L7
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> L7
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L7
            int r3 = r3 + r2
        L30:
            int r5 = r5.intValue()     // Catch: java.lang.Throwable -> L7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L7
            r1.put(r5, r2)     // Catch: java.lang.Throwable -> L7
            updateOrResetMinLogLevel()     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return
        L40:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r5
    }

    private void initAndRetryRecursively(@androidx.annotation.NonNull java.util.concurrent.Executor r8, long r9, @androidx.annotation.NonNull android.content.Context r11, @androidx.annotation.NonNull androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> r12) {
            r7 = this;
            androidx.camera.core.k r0 = new androidx.camera.core.k
            r1 = r7
            r3 = r8
            r5 = r9
            r2 = r11
            r4 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            r3.execute(r0)
            return
    }

    private com.google.common.util.concurrent.ListenableFuture<java.lang.Void> initInternal(@androidx.annotation.NonNull android.content.Context r4) {
            r3 = this;
            java.lang.Object r0 = r3.mInitializeLock
            monitor-enter(r0)
            androidx.camera.core.CameraX$InternalInitState r1 = r3.mInitState     // Catch: java.lang.Throwable -> L20
            androidx.camera.core.CameraX$InternalInitState r2 = androidx.camera.core.CameraX.InternalInitState.UNINITIALIZED     // Catch: java.lang.Throwable -> L20
            if (r1 != r2) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            java.lang.String r2 = "CameraX.initInternal() should only be called once per instance"
            androidx.core.util.Preconditions.checkState(r1, r2)     // Catch: java.lang.Throwable -> L20
            androidx.camera.core.CameraX$InternalInitState r1 = androidx.camera.core.CameraX.InternalInitState.INITIALIZING     // Catch: java.lang.Throwable -> L20
            r3.mInitState = r1     // Catch: java.lang.Throwable -> L20
            androidx.camera.core.h r1 = new androidx.camera.core.h     // Catch: java.lang.Throwable -> L20
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L20
            com.google.common.util.concurrent.ListenableFuture r4 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r1)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            return r4
        L20:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            throw r4
    }

    private void setStateToInitialized() {
            r2 = this;
            java.lang.Object r0 = r2.mInitializeLock
            monitor-enter(r0)
            androidx.camera.core.CameraX$InternalInitState r1 = androidx.camera.core.CameraX.InternalInitState.INITIALIZED     // Catch: java.lang.Throwable -> L9
            r2.mInitState = r1     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r1
    }

    @androidx.annotation.NonNull
    private com.google.common.util.concurrent.ListenableFuture<java.lang.Void> shutdownInternal() {
            r3 = this;
            java.lang.Object r0 = r3.mInitializeLock
            monitor-enter(r0)
            android.os.Handler r1 = r3.mSchedulerHandler     // Catch: java.lang.Throwable -> L39
            java.lang.String r2 = "retry_token"
            r1.removeCallbacksAndMessages(r2)     // Catch: java.lang.Throwable -> L39
            int[] r1 = androidx.camera.core.CameraX.AnonymousClass1.$SwitchMap$androidx$camera$core$CameraX$InternalInitState     // Catch: java.lang.Throwable -> L39
            androidx.camera.core.CameraX$InternalInitState r2 = r3.mInitState     // Catch: java.lang.Throwable -> L39
            int r2 = r2.ordinal()     // Catch: java.lang.Throwable -> L39
            r1 = r1[r2]     // Catch: java.lang.Throwable -> L39
            r2 = 1
            if (r1 == r2) goto L43
            r2 = 2
            if (r1 == r2) goto L3b
            r2 = 3
            if (r1 == r2) goto L21
            r2 = 4
            if (r1 == r2) goto L21
            goto L35
        L21:
            androidx.camera.core.CameraX$InternalInitState r1 = androidx.camera.core.CameraX.InternalInitState.SHUTDOWN     // Catch: java.lang.Throwable -> L39
            r3.mInitState = r1     // Catch: java.lang.Throwable -> L39
            java.lang.Integer r1 = r3.mMinLogLevel     // Catch: java.lang.Throwable -> L39
            decreaseMinLogLevelReference(r1)     // Catch: java.lang.Throwable -> L39
            androidx.camera.core.i r1 = new androidx.camera.core.i     // Catch: java.lang.Throwable -> L39
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L39
            com.google.common.util.concurrent.ListenableFuture r1 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r1)     // Catch: java.lang.Throwable -> L39
            r3.mShutdownInternalFuture = r1     // Catch: java.lang.Throwable -> L39
        L35:
            com.google.common.util.concurrent.ListenableFuture<java.lang.Void> r1 = r3.mShutdownInternalFuture     // Catch: java.lang.Throwable -> L39
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            return r1
        L39:
            r1 = move-exception
            goto L4e
        L3b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L39
            java.lang.String r2 = "CameraX could not be shutdown when it is initializing."
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L39
            throw r1     // Catch: java.lang.Throwable -> L39
        L43:
            androidx.camera.core.CameraX$InternalInitState r1 = androidx.camera.core.CameraX.InternalInitState.SHUTDOWN     // Catch: java.lang.Throwable -> L39
            r3.mInitState = r1     // Catch: java.lang.Throwable -> L39
            r1 = 0
            com.google.common.util.concurrent.ListenableFuture r1 = androidx.camera.core.impl.utils.futures.Futures.immediateFuture(r1)     // Catch: java.lang.Throwable -> L39
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            return r1
        L4e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            throw r1
    }

    @androidx.annotation.GuardedBy("MIN_LOG_LEVEL_LOCK")
    private static void updateOrResetMinLogLevel() {
            android.util.SparseArray<java.lang.Integer> r0 = androidx.camera.core.CameraX.sMinLogLevelReferenceCountMap
            int r1 = r0.size()
            if (r1 != 0) goto Lc
            androidx.camera.core.Logger.resetMinLogLevel()
            return
        Lc:
            r1 = 3
            java.lang.Object r2 = r0.get(r1)
            if (r2 == 0) goto L17
            androidx.camera.core.Logger.setMinLogLevel(r1)
            return
        L17:
            r1 = 4
            java.lang.Object r2 = r0.get(r1)
            if (r2 == 0) goto L22
            androidx.camera.core.Logger.setMinLogLevel(r1)
            return
        L22:
            r1 = 5
            java.lang.Object r2 = r0.get(r1)
            if (r2 == 0) goto L2d
            androidx.camera.core.Logger.setMinLogLevel(r1)
            return
        L2d:
            r1 = 6
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L37
            androidx.camera.core.Logger.setMinLogLevel(r1)
        L37:
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.camera.core.impl.CameraDeviceSurfaceManager getCameraDeviceSurfaceManager() {
            r2 = this;
            androidx.camera.core.impl.CameraDeviceSurfaceManager r0 = r2.mSurfaceManager
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "CameraX not initialized yet."
            r0.<init>(r1)
            throw r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.camera.core.impl.CameraFactory getCameraFactory() {
            r2 = this;
            androidx.camera.core.impl.CameraFactory r0 = r2.mCameraFactory
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "CameraX not initialized yet."
            r0.<init>(r1)
            throw r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.camera.core.impl.CameraRepository getCameraRepository() {
            r1 = this;
            androidx.camera.core.impl.CameraRepository r0 = r1.mCameraRepository
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.camera.core.impl.UseCaseConfigFactory getDefaultConfigFactory() {
            r2 = this;
            androidx.camera.core.impl.UseCaseConfigFactory r0 = r2.mDefaultConfigFactory
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "CameraX not initialized yet."
            r0.<init>(r1)
            throw r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> getInitializeFuture() {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture<java.lang.Void> r0 = r1.mInitInternalFuture
            return r0
    }

    boolean isInitialized() {
            r3 = this;
            java.lang.Object r0 = r3.mInitializeLock
            monitor-enter(r0)
            androidx.camera.core.CameraX$InternalInitState r1 = r3.mInitState     // Catch: java.lang.Throwable -> Le
            androidx.camera.core.CameraX$InternalInitState r2 = androidx.camera.core.CameraX.InternalInitState.INITIALIZED     // Catch: java.lang.Throwable -> Le
            if (r1 != r2) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> shutdown() {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture r0 = r1.shutdownInternal()
            return r0
    }
}
