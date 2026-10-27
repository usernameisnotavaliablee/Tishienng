package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class SynchronizedCaptureSessionImpl extends androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl {
    private static final java.lang.String TAG = "SyncCaptureSessionImpl";
    private final androidx.camera.camera2.internal.compat.workaround.ForceCloseDeferrableSurface mCloseSurfaceQuirk;

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("mObjectLock")
    private java.util.List<androidx.camera.core.impl.DeferrableSurface> mDeferrableSurfaces;
    private final androidx.camera.camera2.internal.compat.workaround.ForceCloseCaptureSession mForceCloseSessionQuirk;
    private final java.lang.Object mObjectLock;

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("mObjectLock")
    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> mOpeningCaptureSession;
    private final androidx.camera.camera2.internal.compat.workaround.WaitForRepeatingRequestStart mWaitForOtherSessionCompleteQuirk;

    SynchronizedCaptureSessionImpl(@androidx.annotation.NonNull androidx.camera.core.impl.Quirks r1, @androidx.annotation.NonNull androidx.camera.core.impl.Quirks r2, @androidx.annotation.NonNull androidx.camera.camera2.internal.CaptureSessionRepository r3, @androidx.annotation.NonNull java.util.concurrent.Executor r4, @androidx.annotation.NonNull java.util.concurrent.ScheduledExecutorService r5, @androidx.annotation.NonNull android.os.Handler r6) {
            r0 = this;
            r0.<init>(r3, r4, r5, r6)
            java.lang.Object r3 = new java.lang.Object
            r3.<init>()
            r0.mObjectLock = r3
            androidx.camera.camera2.internal.compat.workaround.ForceCloseDeferrableSurface r3 = new androidx.camera.camera2.internal.compat.workaround.ForceCloseDeferrableSurface
            r3.<init>(r1, r2)
            r0.mCloseSurfaceQuirk = r3
            androidx.camera.camera2.internal.compat.workaround.WaitForRepeatingRequestStart r3 = new androidx.camera.camera2.internal.compat.workaround.WaitForRepeatingRequestStart
            r3.<init>(r1)
            r0.mWaitForOtherSessionCompleteQuirk = r3
            androidx.camera.camera2.internal.compat.workaround.ForceCloseCaptureSession r1 = new androidx.camera.camera2.internal.compat.workaround.ForceCloseCaptureSession
            r1.<init>(r2)
            r0.mForceCloseSessionQuirk = r1
            return
    }

    public static /* synthetic */ void f(androidx.camera.camera2.internal.SynchronizedCaptureSessionImpl r0, androidx.camera.camera2.internal.SynchronizedCaptureSession r1) {
            super.onConfigured(r1)
            return
    }

    public static /* synthetic */ void g(androidx.camera.camera2.internal.SynchronizedCaptureSessionImpl r1) {
            java.lang.String r0 = "Session call super.close()"
            r1.debugLog(r0)
            super.close()
            return
    }

    public static /* synthetic */ com.google.common.util.concurrent.ListenableFuture h(androidx.camera.camera2.internal.SynchronizedCaptureSessionImpl r0, android.hardware.camera2.CameraDevice r1, androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat r2, java.util.List r3) {
            com.google.common.util.concurrent.ListenableFuture r0 = super.openCaptureSession(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ int i(androidx.camera.camera2.internal.SynchronizedCaptureSessionImpl r0, android.hardware.camera2.CaptureRequest r1, android.hardware.camera2.CameraCaptureSession.CaptureCallback r2) {
            int r0 = super.setSingleRepeatingRequest(r1, r2)
            return r0
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSession
    public void close() {
            r3 = this;
            java.lang.String r0 = "Session call close()"
            r3.debugLog(r0)
            androidx.camera.camera2.internal.compat.workaround.WaitForRepeatingRequestStart r0 = r3.mWaitForOtherSessionCompleteQuirk
            r0.onSessionEnd()
            androidx.camera.camera2.internal.compat.workaround.WaitForRepeatingRequestStart r0 = r3.mWaitForOtherSessionCompleteQuirk
            com.google.common.util.concurrent.ListenableFuture r0 = r0.getStartStreamFuture()
            androidx.camera.camera2.internal.p2 r1 = new androidx.camera.camera2.internal.p2
            r1.<init>(r3)
            java.util.concurrent.Executor r2 = r3.getExecutor()
            r0.addListener(r1, r2)
            return
    }

    void debugLog(java.lang.String r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "["
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = "] "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "SyncCaptureSessionImpl"
            androidx.camera.core.Logger.d(r0, r3)
            return
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSession
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> getOpeningBlocker() {
            r1 = this;
            androidx.camera.camera2.internal.compat.workaround.WaitForRepeatingRequestStart r0 = r1.mWaitForOtherSessionCompleteQuirk
            com.google.common.util.concurrent.ListenableFuture r0 = r0.getStartStreamFuture()
            return r0
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onClosed(@androidx.annotation.NonNull androidx.camera.camera2.internal.SynchronizedCaptureSession r4) {
            r3 = this;
            java.lang.Object r0 = r3.mObjectLock
            monitor-enter(r0)
            androidx.camera.camera2.internal.compat.workaround.ForceCloseDeferrableSurface r1 = r3.mCloseSurfaceQuirk     // Catch: java.lang.Throwable -> L14
            java.util.List<androidx.camera.core.impl.DeferrableSurface> r2 = r3.mDeferrableSurfaces     // Catch: java.lang.Throwable -> L14
            r1.onSessionEnd(r2)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            java.lang.String r0 = "onClosed()"
            r3.debugLog(r0)
            super.onClosed(r4)
            return
        L14:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r4
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onConfigured(@androidx.annotation.NonNull androidx.camera.camera2.internal.SynchronizedCaptureSession r5) {
            r4 = this;
            java.lang.String r0 = "Session onConfigured()"
            r4.debugLog(r0)
            androidx.camera.camera2.internal.compat.workaround.ForceCloseCaptureSession r0 = r4.mForceCloseSessionQuirk
            androidx.camera.camera2.internal.CaptureSessionRepository r1 = r4.mCaptureSessionRepository
            java.util.List r1 = r1.getCreatingCaptureSessions()
            androidx.camera.camera2.internal.CaptureSessionRepository r2 = r4.mCaptureSessionRepository
            java.util.List r2 = r2.getCaptureSessions()
            androidx.camera.camera2.internal.o2 r3 = new androidx.camera.camera2.internal.o2
            r3.<init>(r4)
            r0.onSessionConfigured(r5, r1, r2, r3)
            return
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener.OpenerImpl
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> openCaptureSession(@androidx.annotation.NonNull android.hardware.camera2.CameraDevice r9, @androidx.annotation.NonNull androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat r10, @androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.DeferrableSurface> r11) {
            r8 = this;
            java.lang.Object r1 = r8.mObjectLock
            monitor-enter(r1)
            androidx.camera.camera2.internal.compat.workaround.WaitForRepeatingRequestStart r2 = r8.mWaitForOtherSessionCompleteQuirk     // Catch: java.lang.Throwable -> L1f
            androidx.camera.camera2.internal.CaptureSessionRepository r0 = r8.mCaptureSessionRepository     // Catch: java.lang.Throwable -> L1f
            java.util.List r6 = r0.getClosingCaptureSession()     // Catch: java.lang.Throwable -> L1f
            androidx.camera.camera2.internal.q2 r7 = new androidx.camera.camera2.internal.q2     // Catch: java.lang.Throwable -> L1f
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L1f
            r3 = r9
            r4 = r10
            r5 = r11
            com.google.common.util.concurrent.ListenableFuture r9 = r2.openCaptureSession(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L1f
            r8.mOpeningCaptureSession = r9     // Catch: java.lang.Throwable -> L1f
            com.google.common.util.concurrent.ListenableFuture r9 = androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(r9)     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1f
            return r9
        L1f:
            r0 = move-exception
            r9 = r0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1f
            throw r9
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSession
    public int setSingleRepeatingRequest(@androidx.annotation.NonNull android.hardware.camera2.CaptureRequest r3, @androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession.CaptureCallback r4) throws android.hardware.camera2.CameraAccessException {
            r2 = this;
            androidx.camera.camera2.internal.compat.workaround.WaitForRepeatingRequestStart r0 = r2.mWaitForOtherSessionCompleteQuirk
            androidx.camera.camera2.internal.n2 r1 = new androidx.camera.camera2.internal.n2
            r1.<init>(r2)
            int r3 = r0.setSingleRepeatingRequest(r3, r4, r1)
            return r3
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener.OpenerImpl
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.util.List<android.view.Surface>> startWithDeferrableSurface(@androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.DeferrableSurface> r2, long r3) {
            r1 = this;
            java.lang.Object r0 = r1.mObjectLock
            monitor-enter(r0)
            r1.mDeferrableSurfaces = r2     // Catch: java.lang.Throwable -> Lb
            com.google.common.util.concurrent.ListenableFuture r2 = super.startWithDeferrableSurface(r2, r3)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r2
        Lb:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r2
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener.OpenerImpl
    public boolean stop() {
            r3 = this;
            java.lang.Object r0 = r3.mObjectLock
            monitor-enter(r0)
            boolean r1 = r3.isCameraCaptureSessionOpen()     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L13
            androidx.camera.camera2.internal.compat.workaround.ForceCloseDeferrableSurface r1 = r3.mCloseSurfaceQuirk     // Catch: java.lang.Throwable -> L11
            java.util.List<androidx.camera.core.impl.DeferrableSurface> r2 = r3.mDeferrableSurfaces     // Catch: java.lang.Throwable -> L11
            r1.onSessionEnd(r2)     // Catch: java.lang.Throwable -> L11
            goto L1b
        L11:
            r1 = move-exception
            goto L21
        L13:
            com.google.common.util.concurrent.ListenableFuture<java.lang.Void> r1 = r3.mOpeningCaptureSession     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L1b
            r2 = 1
            r1.cancel(r2)     // Catch: java.lang.Throwable -> L11
        L1b:
            boolean r1 = super.stop()     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r1
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1
    }
}
