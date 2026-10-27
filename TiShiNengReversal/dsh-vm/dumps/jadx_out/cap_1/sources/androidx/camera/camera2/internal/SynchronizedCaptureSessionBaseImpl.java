package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class SynchronizedCaptureSessionBaseImpl extends androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback implements androidx.camera.camera2.internal.SynchronizedCaptureSession, androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener.OpenerImpl {
    private static final java.lang.String TAG = "SyncCaptureSessionBase";

    @androidx.annotation.Nullable
    androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat mCameraCaptureSessionCompat;

    @androidx.annotation.NonNull
    final androidx.camera.camera2.internal.CaptureSessionRepository mCaptureSessionRepository;

    @androidx.annotation.Nullable
    androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback mCaptureSessionStateCallback;

    @androidx.annotation.GuardedBy("mLock")
    private boolean mClosed;

    @androidx.annotation.NonNull
    final android.os.Handler mCompatHandler;

    @androidx.annotation.NonNull
    final java.util.concurrent.Executor mExecutor;

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("mLock")
    private java.util.List<androidx.camera.core.impl.DeferrableSurface> mHeldDeferrableSurfaces;
    final java.lang.Object mLock;

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("mLock")
    androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> mOpenCaptureSessionCompleter;

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("mLock")
    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> mOpenCaptureSessionFuture;

    @androidx.annotation.GuardedBy("mLock")
    private boolean mOpenerDisabled;

    @androidx.annotation.NonNull
    private final java.util.concurrent.ScheduledExecutorService mScheduledExecutorService;

    @androidx.annotation.GuardedBy("mLock")
    private boolean mSessionFinished;

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("mLock")
    private com.google.common.util.concurrent.ListenableFuture<java.util.List<android.view.Surface>> mStartingSurface;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(23)
    private static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static android.view.Surface getInputSurface(android.hardware.camera2.CameraCaptureSession r0) {
                android.view.Surface r0 = androidx.camera.camera2.internal.m2.a(r0)
                return r0
        }
    }

    SynchronizedCaptureSessionBaseImpl(@androidx.annotation.NonNull androidx.camera.camera2.internal.CaptureSessionRepository r2, @androidx.annotation.NonNull java.util.concurrent.Executor r3, @androidx.annotation.NonNull java.util.concurrent.ScheduledExecutorService r4, @androidx.annotation.NonNull android.os.Handler r5) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.mLock = r0
            r0 = 0
            r1.mHeldDeferrableSurfaces = r0
            r0 = 0
            r1.mClosed = r0
            r1.mOpenerDisabled = r0
            r1.mSessionFinished = r0
            r1.mCaptureSessionRepository = r2
            r1.mCompatHandler = r5
            r1.mExecutor = r3
            r1.mScheduledExecutorService = r4
            return
    }

    public static /* synthetic */ void a(androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl r1, androidx.camera.camera2.internal.SynchronizedCaptureSession r2) {
            androidx.camera.camera2.internal.CaptureSessionRepository r0 = r1.mCaptureSessionRepository
            r0.onCaptureSessionClosed(r1)
            r1.onSessionFinished(r2)
            androidx.camera.camera2.internal.SynchronizedCaptureSession$StateCallback r0 = r1.mCaptureSessionStateCallback
            java.util.Objects.requireNonNull(r0)
            androidx.camera.camera2.internal.SynchronizedCaptureSession$StateCallback r1 = r1.mCaptureSessionStateCallback
            r1.onClosed(r2)
            return
    }

    public static /* synthetic */ java.lang.Object b(androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl r2, java.util.List r3, androidx.camera.camera2.internal.compat.CameraDeviceCompat r4, androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat r5, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r6) {
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            r2.holdDeferrableSurfaces(r3)     // Catch: java.lang.Throwable -> L2f
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.lang.Void> r3 = r2.mOpenCaptureSessionCompleter     // Catch: java.lang.Throwable -> L2f
            if (r3 != 0) goto Lc
            r3 = 1
            goto Ld
        Lc:
            r3 = 0
        Ld:
            java.lang.String r1 = "The openCaptureSessionCompleter can only set once!"
            androidx.core.util.Preconditions.checkState(r3, r1)     // Catch: java.lang.Throwable -> L2f
            r2.mOpenCaptureSessionCompleter = r6     // Catch: java.lang.Throwable -> L2f
            r4.createCaptureSession(r5)     // Catch: java.lang.Throwable -> L2f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f
            r3.<init>()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r4 = "openCaptureSession[session="
            r3.append(r4)     // Catch: java.lang.Throwable -> L2f
            r3.append(r2)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r2 = "]"
            r3.append(r2)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            return r2
        L2f:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            throw r2
    }

    public static /* synthetic */ void c(androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl r1, androidx.camera.camera2.internal.SynchronizedCaptureSession r2) {
            androidx.camera.camera2.internal.SynchronizedCaptureSession$StateCallback r0 = r1.mCaptureSessionStateCallback
            java.util.Objects.requireNonNull(r0)
            androidx.camera.camera2.internal.SynchronizedCaptureSession$StateCallback r1 = r1.mCaptureSessionStateCallback
            r1.onSessionFinished(r2)
            return
    }

    public static /* synthetic */ com.google.common.util.concurrent.ListenableFuture d(androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl r2, java.util.List r3, java.util.List r4) {
            r2.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "["
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = "] getSurface...done"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "SyncCaptureSessionBase"
            androidx.camera.core.Logger.d(r0, r2)
            r2 = 0
            boolean r0 = r4.contains(r2)
            if (r0 == 0) goto L3b
            int r2 = r4.indexOf(r2)
            java.lang.Object r2 = r3.get(r2)
            androidx.camera.core.impl.DeferrableSurface r2 = (androidx.camera.core.impl.DeferrableSurface) r2
            androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException r3 = new androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException
            java.lang.String r4 = "Surface closed"
            r3.<init>(r4, r2)
            com.google.common.util.concurrent.ListenableFuture r2 = androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(r3)
            return r2
        L3b:
            boolean r2 = r4.isEmpty()
            if (r2 == 0) goto L4d
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Unable to open capture session without surfaces"
            r2.<init>(r3)
            com.google.common.util.concurrent.ListenableFuture r2 = androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(r2)
            return r2
        L4d:
            com.google.common.util.concurrent.ListenableFuture r2 = androidx.camera.core.impl.utils.futures.Futures.immediateFuture(r4)
            return r2
    }

    public static /* synthetic */ void e(androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl r0) {
            r0.onSessionFinished(r0)
            return
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public void abortCaptures() throws android.hardware.camera2.CameraAccessException {
            r2 = this;
            androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat r0 = r2.mCameraCaptureSessionCompat
            java.lang.String r1 = "Need to call openCaptureSession before using this API."
            androidx.core.util.Preconditions.checkNotNull(r0, r1)
            androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat r0 = r2.mCameraCaptureSessionCompat
            android.hardware.camera2.CameraCaptureSession r0 = r0.toCameraCaptureSession()
            r0.abortCaptures()
            return
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public int captureBurstRequests(@androidx.annotation.NonNull java.util.List<android.hardware.camera2.CaptureRequest> r3, @androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession.CaptureCallback r4) throws android.hardware.camera2.CameraAccessException {
            r2 = this;
            androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat r0 = r2.mCameraCaptureSessionCompat
            java.lang.String r1 = "Need to call openCaptureSession before using this API."
            androidx.core.util.Preconditions.checkNotNull(r0, r1)
            androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat r0 = r2.mCameraCaptureSessionCompat
            java.util.concurrent.Executor r1 = r2.getExecutor()
            int r3 = r0.captureBurstRequests(r3, r1, r4)
            return r3
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public int captureBurstRequests(@androidx.annotation.NonNull java.util.List<android.hardware.camera2.CaptureRequest> r3, @androidx.annotation.NonNull java.util.concurrent.Executor r4, @androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession.CaptureCallback r5) throws android.hardware.camera2.CameraAccessException {
            r2 = this;
            androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat r0 = r2.mCameraCaptureSessionCompat
            java.lang.String r1 = "Need to call openCaptureSession before using this API."
            androidx.core.util.Preconditions.checkNotNull(r0, r1)
            androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat r0 = r2.mCameraCaptureSessionCompat
            int r3 = r0.captureBurstRequests(r3, r4, r5)
            return r3
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public int captureSingleRequest(@androidx.annotation.NonNull android.hardware.camera2.CaptureRequest r3, @androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession.CaptureCallback r4) throws android.hardware.camera2.CameraAccessException {
            r2 = this;
            androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat r0 = r2.mCameraCaptureSessionCompat
            java.lang.String r1 = "Need to call openCaptureSession before using this API."
            androidx.core.util.Preconditions.checkNotNull(r0, r1)
            androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat r0 = r2.mCameraCaptureSessionCompat
            java.util.concurrent.Executor r1 = r2.getExecutor()
            int r3 = r0.captureSingleRequest(r3, r1, r4)
            return r3
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public int captureSingleRequest(@androidx.annotation.NonNull android.hardware.camera2.CaptureRequest r3, @androidx.annotation.NonNull java.util.concurrent.Executor r4, @androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession.CaptureCallback r5) throws android.hardware.camera2.CameraAccessException {
            r2 = this;
            androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat r0 = r2.mCameraCaptureSessionCompat
            java.lang.String r1 = "Need to call openCaptureSession before using this API."
            androidx.core.util.Preconditions.checkNotNull(r0, r1)
            androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat r0 = r2.mCameraCaptureSessionCompat
            int r3 = r0.captureSingleRequest(r3, r4, r5)
            return r3
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public void close() {
            r2 = this;
            androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat r0 = r2.mCameraCaptureSessionCompat
            java.lang.String r1 = "Need to call openCaptureSession before using this API."
            androidx.core.util.Preconditions.checkNotNull(r0, r1)
            androidx.camera.camera2.internal.CaptureSessionRepository r0 = r2.mCaptureSessionRepository
            r0.onCaptureSessionClosing(r2)
            androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat r0 = r2.mCameraCaptureSessionCompat
            android.hardware.camera2.CameraCaptureSession r0 = r0.toCameraCaptureSession()
            r0.close()
            java.util.concurrent.Executor r0 = r2.getExecutor()
            androidx.camera.camera2.internal.i2 r1 = new androidx.camera.camera2.internal.i2
            r1.<init>(r2)
            r0.execute(r1)
            return
    }

    void createCaptureSessionCompat(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r2) {
            r1 = this;
            androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat r0 = r1.mCameraCaptureSessionCompat
            if (r0 != 0) goto Lc
            android.os.Handler r0 = r1.mCompatHandler
            androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat r2 = androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.toCameraCaptureSessionCompat(r2, r0)
            r1.mCameraCaptureSessionCompat = r2
        Lc:
            return
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener.OpenerImpl
    @androidx.annotation.NonNull
    public androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat createSessionConfigurationCompat(int r3, @androidx.annotation.NonNull java.util.List<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> r4, @androidx.annotation.NonNull androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback r5) {
            r2 = this;
            r2.mCaptureSessionStateCallback = r5
            androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat r5 = new androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat
            java.util.concurrent.Executor r0 = r2.getExecutor()
            androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl$2 r1 = new androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl$2
            r1.<init>(r2)
            r5.<init>(r3, r4, r0, r1)
            return r5
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public void finishClose() {
            r0 = this;
            r0.releaseDeferrableSurfaces()
            return
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    @androidx.annotation.NonNull
    public android.hardware.camera2.CameraDevice getDevice() {
            r1 = this;
            androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat r0 = r1.mCameraCaptureSessionCompat
            androidx.core.util.Preconditions.checkNotNull(r0)
            androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat r0 = r1.mCameraCaptureSessionCompat
            android.hardware.camera2.CameraCaptureSession r0 = r0.toCameraCaptureSession()
            android.hardware.camera2.CameraDevice r0 = r0.getDevice()
            return r0
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener.OpenerImpl
    @androidx.annotation.NonNull
    public java.util.concurrent.Executor getExecutor() {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.mExecutor
            return r0
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    @androidx.annotation.Nullable
    public android.view.Surface getInputSurface() {
            r2 = this;
            androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat r0 = r2.mCameraCaptureSessionCompat
            androidx.core.util.Preconditions.checkNotNull(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L16
            androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat r0 = r2.mCameraCaptureSessionCompat
            android.hardware.camera2.CameraCaptureSession r0 = r0.toCameraCaptureSession()
            android.view.Surface r0 = androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl.Api23Impl.getInputSurface(r0)
            return r0
        L16:
            r0 = 0
            return r0
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> getOpeningBlocker() {
            r1 = this;
            r0 = 0
            com.google.common.util.concurrent.ListenableFuture r0 = androidx.camera.core.impl.utils.futures.Futures.immediateFuture(r0)
            return r0
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    @androidx.annotation.NonNull
    public androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback getStateCallback() {
            r0 = this;
            return r0
    }

    void holdDeferrableSurfaces(@androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.DeferrableSurface> r2) throws androidx.camera.core.impl.DeferrableSurface.SurfaceClosedException {
            r1 = this;
            java.lang.Object r0 = r1.mLock
            monitor-enter(r0)
            r1.releaseDeferrableSurfaces()     // Catch: java.lang.Throwable -> Ld
            androidx.camera.core.impl.DeferrableSurfaces.incrementAll(r2)     // Catch: java.lang.Throwable -> Ld
            r1.mHeldDeferrableSurfaces = r2     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r2
    }

    boolean isCameraCaptureSessionOpen() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            com.google.common.util.concurrent.ListenableFuture<java.lang.Void> r1 = r2.mOpenCaptureSessionFuture     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return r1
        Lc:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r1
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onActive(@androidx.annotation.NonNull androidx.camera.camera2.internal.SynchronizedCaptureSession r2) {
            r1 = this;
            androidx.camera.camera2.internal.SynchronizedCaptureSession$StateCallback r0 = r1.mCaptureSessionStateCallback
            java.util.Objects.requireNonNull(r0)
            androidx.camera.camera2.internal.SynchronizedCaptureSession$StateCallback r0 = r1.mCaptureSessionStateCallback
            r0.onActive(r2)
            return
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    @androidx.annotation.RequiresApi(api = 26)
    public void onCaptureQueueEmpty(@androidx.annotation.NonNull androidx.camera.camera2.internal.SynchronizedCaptureSession r2) {
            r1 = this;
            androidx.camera.camera2.internal.SynchronizedCaptureSession$StateCallback r0 = r1.mCaptureSessionStateCallback
            java.util.Objects.requireNonNull(r0)
            androidx.camera.camera2.internal.SynchronizedCaptureSession$StateCallback r0 = r1.mCaptureSessionStateCallback
            r0.onCaptureQueueEmpty(r2)
            return
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onClosed(@androidx.annotation.NonNull androidx.camera.camera2.internal.SynchronizedCaptureSession r4) {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            boolean r1 = r3.mClosed     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L16
            r1 = 1
            r3.mClosed = r1     // Catch: java.lang.Throwable -> L14
            com.google.common.util.concurrent.ListenableFuture<java.lang.Void> r1 = r3.mOpenCaptureSessionFuture     // Catch: java.lang.Throwable -> L14
            java.lang.String r2 = "Need to call openCaptureSession before using this API."
            androidx.core.util.Preconditions.checkNotNull(r1, r2)     // Catch: java.lang.Throwable -> L14
            com.google.common.util.concurrent.ListenableFuture<java.lang.Void> r1 = r3.mOpenCaptureSessionFuture     // Catch: java.lang.Throwable -> L14
            goto L17
        L14:
            r4 = move-exception
            goto L2a
        L16:
            r1 = 0
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            r3.finishClose()
            if (r1 == 0) goto L29
            androidx.camera.camera2.internal.j2 r0 = new androidx.camera.camera2.internal.j2
            r0.<init>(r3, r4)
            java.util.concurrent.Executor r4 = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()
            r1.addListener(r0, r4)
        L29:
            return
        L2a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r4
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onConfigureFailed(@androidx.annotation.NonNull androidx.camera.camera2.internal.SynchronizedCaptureSession r2) {
            r1 = this;
            androidx.camera.camera2.internal.SynchronizedCaptureSession$StateCallback r0 = r1.mCaptureSessionStateCallback
            java.util.Objects.requireNonNull(r0)
            r1.finishClose()
            androidx.camera.camera2.internal.CaptureSessionRepository r0 = r1.mCaptureSessionRepository
            r0.onCaptureSessionConfigureFail(r1)
            androidx.camera.camera2.internal.SynchronizedCaptureSession$StateCallback r0 = r1.mCaptureSessionStateCallback
            r0.onConfigureFailed(r2)
            return
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onConfigured(@androidx.annotation.NonNull androidx.camera.camera2.internal.SynchronizedCaptureSession r2) {
            r1 = this;
            androidx.camera.camera2.internal.SynchronizedCaptureSession$StateCallback r0 = r1.mCaptureSessionStateCallback
            java.util.Objects.requireNonNull(r0)
            androidx.camera.camera2.internal.CaptureSessionRepository r0 = r1.mCaptureSessionRepository
            r0.onCaptureSessionCreated(r1)
            androidx.camera.camera2.internal.SynchronizedCaptureSession$StateCallback r0 = r1.mCaptureSessionStateCallback
            r0.onConfigured(r2)
            return
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onReady(@androidx.annotation.NonNull androidx.camera.camera2.internal.SynchronizedCaptureSession r2) {
            r1 = this;
            androidx.camera.camera2.internal.SynchronizedCaptureSession$StateCallback r0 = r1.mCaptureSessionStateCallback
            java.util.Objects.requireNonNull(r0)
            androidx.camera.camera2.internal.SynchronizedCaptureSession$StateCallback r0 = r1.mCaptureSessionStateCallback
            r0.onReady(r2)
            return
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    void onSessionFinished(@androidx.annotation.NonNull androidx.camera.camera2.internal.SynchronizedCaptureSession r4) {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            boolean r1 = r3.mSessionFinished     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L16
            r1 = 1
            r3.mSessionFinished = r1     // Catch: java.lang.Throwable -> L14
            com.google.common.util.concurrent.ListenableFuture<java.lang.Void> r1 = r3.mOpenCaptureSessionFuture     // Catch: java.lang.Throwable -> L14
            java.lang.String r2 = "Need to call openCaptureSession before using this API."
            androidx.core.util.Preconditions.checkNotNull(r1, r2)     // Catch: java.lang.Throwable -> L14
            com.google.common.util.concurrent.ListenableFuture<java.lang.Void> r1 = r3.mOpenCaptureSessionFuture     // Catch: java.lang.Throwable -> L14
            goto L17
        L14:
            r4 = move-exception
            goto L27
        L16:
            r1 = 0
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L26
            androidx.camera.camera2.internal.h2 r0 = new androidx.camera.camera2.internal.h2
            r0.<init>(r3, r4)
            java.util.concurrent.Executor r4 = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()
            r1.addListener(r0, r4)
        L26:
            return
        L27:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r4
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    @androidx.annotation.RequiresApi(api = 23)
    public void onSurfacePrepared(@androidx.annotation.NonNull androidx.camera.camera2.internal.SynchronizedCaptureSession r2, @androidx.annotation.NonNull android.view.Surface r3) {
            r1 = this;
            androidx.camera.camera2.internal.SynchronizedCaptureSession$StateCallback r0 = r1.mCaptureSessionStateCallback
            java.util.Objects.requireNonNull(r0)
            androidx.camera.camera2.internal.SynchronizedCaptureSession$StateCallback r0 = r1.mCaptureSessionStateCallback
            r0.onSurfacePrepared(r2, r3)
            return
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener.OpenerImpl
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> openCaptureSession(@androidx.annotation.NonNull android.hardware.camera2.CameraDevice r3, @androidx.annotation.NonNull androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat r4, @androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.DeferrableSurface> r5) {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            boolean r1 = r2.mOpenerDisabled     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L16
            java.util.concurrent.CancellationException r3 = new java.util.concurrent.CancellationException     // Catch: java.lang.Throwable -> L14
            java.lang.String r4 = "Opener is disabled"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L14
            com.google.common.util.concurrent.ListenableFuture r3 = androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(r3)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return r3
        L14:
            r3 = move-exception
            goto L40
        L16:
            androidx.camera.camera2.internal.CaptureSessionRepository r1 = r2.mCaptureSessionRepository     // Catch: java.lang.Throwable -> L14
            r1.onCreateCaptureSession(r2)     // Catch: java.lang.Throwable -> L14
            android.os.Handler r1 = r2.mCompatHandler     // Catch: java.lang.Throwable -> L14
            androidx.camera.camera2.internal.compat.CameraDeviceCompat r3 = androidx.camera.camera2.internal.compat.CameraDeviceCompat.toCameraDeviceCompat(r3, r1)     // Catch: java.lang.Throwable -> L14
            androidx.camera.camera2.internal.k2 r1 = new androidx.camera.camera2.internal.k2     // Catch: java.lang.Throwable -> L14
            r1.<init>(r2, r5, r3, r4)     // Catch: java.lang.Throwable -> L14
            com.google.common.util.concurrent.ListenableFuture r3 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r1)     // Catch: java.lang.Throwable -> L14
            r2.mOpenCaptureSessionFuture = r3     // Catch: java.lang.Throwable -> L14
            androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl$1 r4 = new androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl$1     // Catch: java.lang.Throwable -> L14
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L14
            java.util.concurrent.Executor r5 = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()     // Catch: java.lang.Throwable -> L14
            androidx.camera.core.impl.utils.futures.Futures.addCallback(r3, r4, r5)     // Catch: java.lang.Throwable -> L14
            com.google.common.util.concurrent.ListenableFuture<java.lang.Void> r3 = r2.mOpenCaptureSessionFuture     // Catch: java.lang.Throwable -> L14
            com.google.common.util.concurrent.ListenableFuture r3 = androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(r3)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return r3
        L40:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r3
    }

    void releaseDeferrableSurfaces() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            java.util.List<androidx.camera.core.impl.DeferrableSurface> r1 = r2.mHeldDeferrableSurfaces     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L10
            androidx.camera.core.impl.DeferrableSurfaces.decrementAll(r1)     // Catch: java.lang.Throwable -> Le
            r1 = 0
            r2.mHeldDeferrableSurfaces = r1     // Catch: java.lang.Throwable -> Le
            goto L10
        Le:
            r1 = move-exception
            goto L12
        L10:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public int setRepeatingBurstRequests(@androidx.annotation.NonNull java.util.List<android.hardware.camera2.CaptureRequest> r3, @androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession.CaptureCallback r4) throws android.hardware.camera2.CameraAccessException {
            r2 = this;
            androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat r0 = r2.mCameraCaptureSessionCompat
            java.lang.String r1 = "Need to call openCaptureSession before using this API."
            androidx.core.util.Preconditions.checkNotNull(r0, r1)
            androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat r0 = r2.mCameraCaptureSessionCompat
            java.util.concurrent.Executor r1 = r2.getExecutor()
            int r3 = r0.setRepeatingBurstRequests(r3, r1, r4)
            return r3
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public int setRepeatingBurstRequests(@androidx.annotation.NonNull java.util.List<android.hardware.camera2.CaptureRequest> r3, @androidx.annotation.NonNull java.util.concurrent.Executor r4, @androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession.CaptureCallback r5) throws android.hardware.camera2.CameraAccessException {
            r2 = this;
            androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat r0 = r2.mCameraCaptureSessionCompat
            java.lang.String r1 = "Need to call openCaptureSession before using this API."
            androidx.core.util.Preconditions.checkNotNull(r0, r1)
            androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat r0 = r2.mCameraCaptureSessionCompat
            int r3 = r0.setRepeatingBurstRequests(r3, r4, r5)
            return r3
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public int setSingleRepeatingRequest(@androidx.annotation.NonNull android.hardware.camera2.CaptureRequest r3, @androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession.CaptureCallback r4) throws android.hardware.camera2.CameraAccessException {
            r2 = this;
            androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat r0 = r2.mCameraCaptureSessionCompat
            java.lang.String r1 = "Need to call openCaptureSession before using this API."
            androidx.core.util.Preconditions.checkNotNull(r0, r1)
            androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat r0 = r2.mCameraCaptureSessionCompat
            java.util.concurrent.Executor r1 = r2.getExecutor()
            int r3 = r0.setSingleRepeatingRequest(r3, r1, r4)
            return r3
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public int setSingleRepeatingRequest(@androidx.annotation.NonNull android.hardware.camera2.CaptureRequest r3, @androidx.annotation.NonNull java.util.concurrent.Executor r4, @androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession.CaptureCallback r5) throws android.hardware.camera2.CameraAccessException {
            r2 = this;
            androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat r0 = r2.mCameraCaptureSessionCompat
            java.lang.String r1 = "Need to call openCaptureSession before using this API."
            androidx.core.util.Preconditions.checkNotNull(r0, r1)
            androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat r0 = r2.mCameraCaptureSessionCompat
            int r3 = r0.setSingleRepeatingRequest(r3, r4, r5)
            return r3
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener.OpenerImpl
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.util.List<android.view.Surface>> startWithDeferrableSurface(@androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.DeferrableSurface> r9, long r10) {
            r8 = this;
            java.lang.Object r1 = r8.mLock
            monitor-enter(r1)
            boolean r0 = r8.mOpenerDisabled     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L17
            java.util.concurrent.CancellationException r9 = new java.util.concurrent.CancellationException     // Catch: java.lang.Throwable -> L14
            java.lang.String r10 = "Opener is disabled"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L14
            com.google.common.util.concurrent.ListenableFuture r9 = androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(r9)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L14
            return r9
        L14:
            r0 = move-exception
            r9 = r0
            goto L3d
        L17:
            java.util.concurrent.Executor r6 = r8.getExecutor()     // Catch: java.lang.Throwable -> L14
            java.util.concurrent.ScheduledExecutorService r7 = r8.mScheduledExecutorService     // Catch: java.lang.Throwable -> L14
            r3 = 0
            r2 = r9
            r4 = r10
            com.google.common.util.concurrent.ListenableFuture r9 = androidx.camera.core.impl.DeferrableSurfaces.surfaceListWithTimeout(r2, r3, r4, r6, r7)     // Catch: java.lang.Throwable -> L14
            androidx.camera.core.impl.utils.futures.FutureChain r9 = androidx.camera.core.impl.utils.futures.FutureChain.from(r9)     // Catch: java.lang.Throwable -> L14
            androidx.camera.camera2.internal.l2 r10 = new androidx.camera.camera2.internal.l2     // Catch: java.lang.Throwable -> L14
            r10.<init>(r8, r2)     // Catch: java.lang.Throwable -> L14
            java.util.concurrent.Executor r11 = r8.getExecutor()     // Catch: java.lang.Throwable -> L14
            androidx.camera.core.impl.utils.futures.FutureChain r9 = r9.transformAsync(r10, r11)     // Catch: java.lang.Throwable -> L14
            r8.mStartingSurface = r9     // Catch: java.lang.Throwable -> L14
            com.google.common.util.concurrent.ListenableFuture r9 = androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(r9)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L14
            return r9
        L3d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L14
            throw r9
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener.OpenerImpl
    public boolean stop() {
            r4 = this;
            r0 = 1
            r1 = 0
            java.lang.Object r2 = r4.mLock     // Catch: java.lang.Throwable -> L21
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L21
            boolean r3 = r4.mOpenerDisabled     // Catch: java.lang.Throwable -> L11
            if (r3 != 0) goto L13
            com.google.common.util.concurrent.ListenableFuture<java.util.List<android.view.Surface>> r3 = r4.mStartingSurface     // Catch: java.lang.Throwable -> L11
            if (r3 == 0) goto Le
            r1 = r3
        Le:
            r4.mOpenerDisabled = r0     // Catch: java.lang.Throwable -> L11
            goto L13
        L11:
            r3 = move-exception
            goto L1f
        L13:
            boolean r3 = r4.isCameraCaptureSessionOpen()     // Catch: java.lang.Throwable -> L11
            r3 = r3 ^ r0
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L1e
            r1.cancel(r0)
        L1e:
            return r3
        L1f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L11
            throw r3     // Catch: java.lang.Throwable -> L21
        L21:
            r2 = move-exception
            if (r1 == 0) goto L27
            r1.cancel(r0)
        L27:
            throw r2
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public void stopRepeating() throws android.hardware.camera2.CameraAccessException {
            r2 = this;
            androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat r0 = r2.mCameraCaptureSessionCompat
            java.lang.String r1 = "Need to call openCaptureSession before using this API."
            androidx.core.util.Preconditions.checkNotNull(r0, r1)
            androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat r0 = r2.mCameraCaptureSessionCompat
            android.hardware.camera2.CameraCaptureSession r0 = r0.toCameraCaptureSession()
            r0.stopRepeating()
            return
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    @androidx.annotation.NonNull
    public androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat toCameraCaptureSessionCompat() {
            r1 = this;
            androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat r0 = r1.mCameraCaptureSessionCompat
            androidx.core.util.Preconditions.checkNotNull(r0)
            androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat r0 = r1.mCameraCaptureSessionCompat
            return r0
    }
}
