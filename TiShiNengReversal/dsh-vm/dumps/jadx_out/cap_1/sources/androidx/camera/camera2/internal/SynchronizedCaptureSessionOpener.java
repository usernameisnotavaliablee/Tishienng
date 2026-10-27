package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class SynchronizedCaptureSessionOpener {

    @androidx.annotation.NonNull
    private final androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener.OpenerImpl mImpl;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class Builder {
        private final androidx.camera.core.impl.Quirks mCameraQuirks;
        private final androidx.camera.camera2.internal.CaptureSessionRepository mCaptureSessionRepository;
        private final android.os.Handler mCompatHandler;
        private final androidx.camera.core.impl.Quirks mDeviceQuirks;
        private final java.util.concurrent.Executor mExecutor;
        private final boolean mQuirkExist;
        private final java.util.concurrent.ScheduledExecutorService mScheduledExecutorService;

        Builder(@androidx.annotation.NonNull java.util.concurrent.Executor r1, @androidx.annotation.NonNull java.util.concurrent.ScheduledExecutorService r2, @androidx.annotation.NonNull android.os.Handler r3, @androidx.annotation.NonNull androidx.camera.camera2.internal.CaptureSessionRepository r4, @androidx.annotation.NonNull androidx.camera.core.impl.Quirks r5, @androidx.annotation.NonNull androidx.camera.core.impl.Quirks r6) {
                r0 = this;
                r0.<init>()
                r0.mExecutor = r1
                r0.mScheduledExecutorService = r2
                r0.mCompatHandler = r3
                r0.mCaptureSessionRepository = r4
                r0.mCameraQuirks = r5
                r0.mDeviceQuirks = r6
                androidx.camera.camera2.internal.compat.workaround.ForceCloseDeferrableSurface r1 = new androidx.camera.camera2.internal.compat.workaround.ForceCloseDeferrableSurface
                r1.<init>(r5, r6)
                boolean r1 = r1.shouldForceClose()
                if (r1 != 0) goto L33
                androidx.camera.camera2.internal.compat.workaround.WaitForRepeatingRequestStart r1 = new androidx.camera.camera2.internal.compat.workaround.WaitForRepeatingRequestStart
                r1.<init>(r5)
                boolean r1 = r1.shouldWaitRepeatingSubmit()
                if (r1 != 0) goto L33
                androidx.camera.camera2.internal.compat.workaround.ForceCloseCaptureSession r1 = new androidx.camera.camera2.internal.compat.workaround.ForceCloseCaptureSession
                r1.<init>(r6)
                boolean r1 = r1.shouldForceClose()
                if (r1 == 0) goto L31
                goto L33
            L31:
                r1 = 0
                goto L34
            L33:
                r1 = 1
            L34:
                r0.mQuirkExist = r1
                return
        }

        @androidx.annotation.NonNull
        androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener build() {
                r9 = this;
                androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener r0 = new androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener
                boolean r1 = r9.mQuirkExist
                if (r1 == 0) goto L18
                androidx.camera.camera2.internal.SynchronizedCaptureSessionImpl r2 = new androidx.camera.camera2.internal.SynchronizedCaptureSessionImpl
                androidx.camera.core.impl.Quirks r3 = r9.mCameraQuirks
                androidx.camera.core.impl.Quirks r4 = r9.mDeviceQuirks
                androidx.camera.camera2.internal.CaptureSessionRepository r5 = r9.mCaptureSessionRepository
                java.util.concurrent.Executor r6 = r9.mExecutor
                java.util.concurrent.ScheduledExecutorService r7 = r9.mScheduledExecutorService
                android.os.Handler r8 = r9.mCompatHandler
                r2.<init>(r3, r4, r5, r6, r7, r8)
                goto L25
            L18:
                androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl r2 = new androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl
                androidx.camera.camera2.internal.CaptureSessionRepository r1 = r9.mCaptureSessionRepository
                java.util.concurrent.Executor r3 = r9.mExecutor
                java.util.concurrent.ScheduledExecutorService r4 = r9.mScheduledExecutorService
                android.os.Handler r5 = r9.mCompatHandler
                r2.<init>(r1, r3, r4, r5)
            L25:
                r0.<init>(r2)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface OpenerImpl {
        @androidx.annotation.NonNull
        androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat createSessionConfigurationCompat(int r1, @androidx.annotation.NonNull java.util.List<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> r2, @androidx.annotation.NonNull androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback r3);

        @androidx.annotation.NonNull
        java.util.concurrent.Executor getExecutor();

        @androidx.annotation.NonNull
        com.google.common.util.concurrent.ListenableFuture<java.lang.Void> openCaptureSession(@androidx.annotation.NonNull android.hardware.camera2.CameraDevice r1, @androidx.annotation.NonNull androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat r2, @androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.DeferrableSurface> r3);

        @androidx.annotation.NonNull
        com.google.common.util.concurrent.ListenableFuture<java.util.List<android.view.Surface>> startWithDeferrableSurface(@androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.DeferrableSurface> r1, long r2);

        boolean stop();
    }

    SynchronizedCaptureSessionOpener(@androidx.annotation.NonNull androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener.OpenerImpl r1) {
            r0 = this;
            r0.<init>()
            r0.mImpl = r1
            return
    }

    @androidx.annotation.NonNull
    androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat createSessionConfigurationCompat(int r2, @androidx.annotation.NonNull java.util.List<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> r3, @androidx.annotation.NonNull androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback r4) {
            r1 = this;
            androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener$OpenerImpl r0 = r1.mImpl
            androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat r2 = r0.createSessionConfigurationCompat(r2, r3, r4)
            return r2
    }

    @androidx.annotation.NonNull
    public java.util.concurrent.Executor getExecutor() {
            r1 = this;
            androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener$OpenerImpl r0 = r1.mImpl
            java.util.concurrent.Executor r0 = r0.getExecutor()
            return r0
    }

    @androidx.annotation.NonNull
    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> openCaptureSession(@androidx.annotation.NonNull android.hardware.camera2.CameraDevice r2, @androidx.annotation.NonNull androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat r3, @androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.DeferrableSurface> r4) {
            r1 = this;
            androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener$OpenerImpl r0 = r1.mImpl
            com.google.common.util.concurrent.ListenableFuture r2 = r0.openCaptureSession(r2, r3, r4)
            return r2
    }

    @androidx.annotation.NonNull
    com.google.common.util.concurrent.ListenableFuture<java.util.List<android.view.Surface>> startWithDeferrableSurface(@androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.DeferrableSurface> r2, long r3) {
            r1 = this;
            androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener$OpenerImpl r0 = r1.mImpl
            com.google.common.util.concurrent.ListenableFuture r2 = r0.startWithDeferrableSurface(r2, r3)
            return r2
    }

    boolean stop() {
            r1 = this;
            androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener$OpenerImpl r0 = r1.mImpl
            boolean r0 = r0.stop()
            return r0
    }
}
