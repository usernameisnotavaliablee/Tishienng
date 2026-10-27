package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class CaptureSessionRepository {
    private final android.hardware.camera2.CameraDevice.StateCallback mCameraStateCallback;

    @androidx.annotation.GuardedBy("mLock")
    final java.util.Set<androidx.camera.camera2.internal.SynchronizedCaptureSession> mCaptureSessions;

    @androidx.annotation.GuardedBy("mLock")
    final java.util.Set<androidx.camera.camera2.internal.SynchronizedCaptureSession> mClosingCaptureSession;

    @androidx.annotation.GuardedBy("mLock")
    final java.util.Set<androidx.camera.camera2.internal.SynchronizedCaptureSession> mCreatingCaptureSessions;

    @androidx.annotation.NonNull
    final java.util.concurrent.Executor mExecutor;
    final java.lang.Object mLock;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.camera.camera2.internal.CaptureSessionRepository$1, reason: invalid class name */
    class AnonymousClass1 extends android.hardware.camera2.CameraDevice.StateCallback {
        final /* synthetic */ androidx.camera.camera2.internal.CaptureSessionRepository this$0;

        AnonymousClass1(androidx.camera.camera2.internal.CaptureSessionRepository r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public static /* synthetic */ void a(java.util.LinkedHashSet r0) {
                androidx.camera.camera2.internal.CaptureSessionRepository.forceOnClosed(r0)
                return
        }

        private void cameraClosed() {
                r3 = this;
                androidx.camera.camera2.internal.CaptureSessionRepository r0 = r3.this$0
                java.lang.Object r0 = r0.mLock
                monitor-enter(r0)
                androidx.camera.camera2.internal.CaptureSessionRepository r1 = r3.this$0     // Catch: java.lang.Throwable -> L36
                java.util.List r1 = r1.getSessionsInOrder()     // Catch: java.lang.Throwable -> L36
                androidx.camera.camera2.internal.CaptureSessionRepository r2 = r3.this$0     // Catch: java.lang.Throwable -> L36
                java.util.Set<androidx.camera.camera2.internal.SynchronizedCaptureSession> r2 = r2.mCreatingCaptureSessions     // Catch: java.lang.Throwable -> L36
                r2.clear()     // Catch: java.lang.Throwable -> L36
                androidx.camera.camera2.internal.CaptureSessionRepository r2 = r3.this$0     // Catch: java.lang.Throwable -> L36
                java.util.Set<androidx.camera.camera2.internal.SynchronizedCaptureSession> r2 = r2.mCaptureSessions     // Catch: java.lang.Throwable -> L36
                r2.clear()     // Catch: java.lang.Throwable -> L36
                androidx.camera.camera2.internal.CaptureSessionRepository r2 = r3.this$0     // Catch: java.lang.Throwable -> L36
                java.util.Set<androidx.camera.camera2.internal.SynchronizedCaptureSession> r2 = r2.mClosingCaptureSession     // Catch: java.lang.Throwable -> L36
                r2.clear()     // Catch: java.lang.Throwable -> L36
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
                java.util.Iterator r0 = r1.iterator()
            L25:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L35
                java.lang.Object r1 = r0.next()
                androidx.camera.camera2.internal.SynchronizedCaptureSession r1 = (androidx.camera.camera2.internal.SynchronizedCaptureSession) r1
                r1.finishClose()
                goto L25
            L35:
                return
            L36:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
                throw r1
        }

        private void forceOnClosedCaptureSessions() {
                r3 = this;
                java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
                r0.<init>()
                androidx.camera.camera2.internal.CaptureSessionRepository r1 = r3.this$0
                java.lang.Object r1 = r1.mLock
                monitor-enter(r1)
                androidx.camera.camera2.internal.CaptureSessionRepository r2 = r3.this$0     // Catch: java.lang.Throwable -> L26
                java.util.Set<androidx.camera.camera2.internal.SynchronizedCaptureSession> r2 = r2.mCreatingCaptureSessions     // Catch: java.lang.Throwable -> L26
                r0.addAll(r2)     // Catch: java.lang.Throwable -> L26
                androidx.camera.camera2.internal.CaptureSessionRepository r2 = r3.this$0     // Catch: java.lang.Throwable -> L26
                java.util.Set<androidx.camera.camera2.internal.SynchronizedCaptureSession> r2 = r2.mCaptureSessions     // Catch: java.lang.Throwable -> L26
                r0.addAll(r2)     // Catch: java.lang.Throwable -> L26
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L26
                androidx.camera.camera2.internal.CaptureSessionRepository r1 = r3.this$0
                java.util.concurrent.Executor r1 = r1.mExecutor
                androidx.camera.camera2.internal.g1 r2 = new androidx.camera.camera2.internal.g1
                r2.<init>(r0)
                r1.execute(r2)
                return
            L26:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L26
                throw r0
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(@androidx.annotation.NonNull android.hardware.camera2.CameraDevice r1) {
                r0 = this;
                r0.cameraClosed()
                return
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(@androidx.annotation.NonNull android.hardware.camera2.CameraDevice r1) {
                r0 = this;
                r0.forceOnClosedCaptureSessions()
                r0.cameraClosed()
                return
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(@androidx.annotation.NonNull android.hardware.camera2.CameraDevice r1, int r2) {
                r0 = this;
                r0.forceOnClosedCaptureSessions()
                r0.cameraClosed()
                return
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(@androidx.annotation.NonNull android.hardware.camera2.CameraDevice r1) {
                r0 = this;
                return
        }
    }

    CaptureSessionRepository(@androidx.annotation.NonNull java.util.concurrent.Executor r2) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.mLock = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.mCaptureSessions = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.mClosingCaptureSession = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.mCreatingCaptureSessions = r0
            androidx.camera.camera2.internal.CaptureSessionRepository$1 r0 = new androidx.camera.camera2.internal.CaptureSessionRepository$1
            r0.<init>(r1)
            r1.mCameraStateCallback = r0
            r1.mExecutor = r2
            return
    }

    private void forceFinishCloseStaleSessions(@androidx.annotation.NonNull androidx.camera.camera2.internal.SynchronizedCaptureSession r3) {
            r2 = this;
            java.util.List r0 = r2.getSessionsInOrder()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1b
            java.lang.Object r1 = r0.next()
            androidx.camera.camera2.internal.SynchronizedCaptureSession r1 = (androidx.camera.camera2.internal.SynchronizedCaptureSession) r1
            if (r1 != r3) goto L17
            goto L1b
        L17:
            r1.finishClose()
            goto L8
        L1b:
            return
    }

    static void forceOnClosed(@androidx.annotation.NonNull java.util.Set<androidx.camera.camera2.internal.SynchronizedCaptureSession> r2) {
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r0 = r2.next()
            androidx.camera.camera2.internal.SynchronizedCaptureSession r0 = (androidx.camera.camera2.internal.SynchronizedCaptureSession) r0
            androidx.camera.camera2.internal.SynchronizedCaptureSession$StateCallback r1 = r0.getStateCallback()
            r1.onClosed(r0)
            goto L4
        L18:
            return
    }

    @androidx.annotation.NonNull
    android.hardware.camera2.CameraDevice.StateCallback getCameraStateCallback() {
            r1 = this;
            android.hardware.camera2.CameraDevice$StateCallback r0 = r1.mCameraStateCallback
            return r0
    }

    @androidx.annotation.NonNull
    java.util.List<androidx.camera.camera2.internal.SynchronizedCaptureSession> getCaptureSessions() {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lc
            java.util.Set<androidx.camera.camera2.internal.SynchronizedCaptureSession> r2 = r3.mCaptureSessions     // Catch: java.lang.Throwable -> Lc
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return r1
        Lc:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r1
    }

    @androidx.annotation.NonNull
    java.util.List<androidx.camera.camera2.internal.SynchronizedCaptureSession> getClosingCaptureSession() {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lc
            java.util.Set<androidx.camera.camera2.internal.SynchronizedCaptureSession> r2 = r3.mClosingCaptureSession     // Catch: java.lang.Throwable -> Lc
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return r1
        Lc:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r1
    }

    @androidx.annotation.NonNull
    java.util.List<androidx.camera.camera2.internal.SynchronizedCaptureSession> getCreatingCaptureSessions() {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lc
            java.util.Set<androidx.camera.camera2.internal.SynchronizedCaptureSession> r2 = r3.mCreatingCaptureSessions     // Catch: java.lang.Throwable -> Lc
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return r1
        Lc:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r1
    }

    @androidx.annotation.NonNull
    java.util.List<androidx.camera.camera2.internal.SynchronizedCaptureSession> getSessionsInOrder() {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L18
            r1.<init>()     // Catch: java.lang.Throwable -> L18
            java.util.List r2 = r3.getCaptureSessions()     // Catch: java.lang.Throwable -> L18
            r1.addAll(r2)     // Catch: java.lang.Throwable -> L18
            java.util.List r2 = r3.getCreatingCaptureSessions()     // Catch: java.lang.Throwable -> L18
            r1.addAll(r2)     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return r1
        L18:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r1
    }

    void onCaptureSessionClosed(@androidx.annotation.NonNull androidx.camera.camera2.internal.SynchronizedCaptureSession r3) {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            java.util.Set<androidx.camera.camera2.internal.SynchronizedCaptureSession> r1 = r2.mCaptureSessions     // Catch: java.lang.Throwable -> Lf
            r1.remove(r3)     // Catch: java.lang.Throwable -> Lf
            java.util.Set<androidx.camera.camera2.internal.SynchronizedCaptureSession> r1 = r2.mClosingCaptureSession     // Catch: java.lang.Throwable -> Lf
            r1.remove(r3)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return
        Lf:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r3
    }

    void onCaptureSessionClosing(@androidx.annotation.NonNull androidx.camera.camera2.internal.SynchronizedCaptureSession r3) {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            java.util.Set<androidx.camera.camera2.internal.SynchronizedCaptureSession> r1 = r2.mClosingCaptureSession     // Catch: java.lang.Throwable -> La
            r1.add(r3)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r3
    }

    void onCaptureSessionConfigureFail(@androidx.annotation.NonNull androidx.camera.camera2.internal.SynchronizedCaptureSession r3) {
            r2 = this;
            r2.forceFinishCloseStaleSessions(r3)
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            java.util.Set<androidx.camera.camera2.internal.SynchronizedCaptureSession> r1 = r2.mCreatingCaptureSessions     // Catch: java.lang.Throwable -> Ld
            r1.remove(r3)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r3
    }

    void onCaptureSessionCreated(@androidx.annotation.NonNull androidx.camera.camera2.internal.SynchronizedCaptureSession r3) {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            java.util.Set<androidx.camera.camera2.internal.SynchronizedCaptureSession> r1 = r2.mCaptureSessions     // Catch: java.lang.Throwable -> L12
            r1.add(r3)     // Catch: java.lang.Throwable -> L12
            java.util.Set<androidx.camera.camera2.internal.SynchronizedCaptureSession> r1 = r2.mCreatingCaptureSessions     // Catch: java.lang.Throwable -> L12
            r1.remove(r3)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            r2.forceFinishCloseStaleSessions(r3)
            return
        L12:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r3
    }

    void onCreateCaptureSession(@androidx.annotation.NonNull androidx.camera.camera2.internal.SynchronizedCaptureSession r3) {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            java.util.Set<androidx.camera.camera2.internal.SynchronizedCaptureSession> r1 = r2.mCreatingCaptureSessions     // Catch: java.lang.Throwable -> La
            r1.add(r3)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r3
    }
}
