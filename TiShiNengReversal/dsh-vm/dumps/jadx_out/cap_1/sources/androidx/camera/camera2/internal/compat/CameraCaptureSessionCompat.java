package androidx.camera.camera2.internal.compat;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class CameraCaptureSessionCompat {
    private final androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CameraCaptureSessionCompatImpl mImpl;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface CameraCaptureSessionCompatImpl {
        int captureBurstRequests(@androidx.annotation.NonNull java.util.List<android.hardware.camera2.CaptureRequest> r1, @androidx.annotation.NonNull java.util.concurrent.Executor r2, @androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession.CaptureCallback r3) throws android.hardware.camera2.CameraAccessException;

        int captureSingleRequest(@androidx.annotation.NonNull android.hardware.camera2.CaptureRequest r1, @androidx.annotation.NonNull java.util.concurrent.Executor r2, @androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession.CaptureCallback r3) throws android.hardware.camera2.CameraAccessException;

        int setRepeatingBurstRequests(@androidx.annotation.NonNull java.util.List<android.hardware.camera2.CaptureRequest> r1, @androidx.annotation.NonNull java.util.concurrent.Executor r2, @androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession.CaptureCallback r3) throws android.hardware.camera2.CameraAccessException;

        int setSingleRepeatingRequest(@androidx.annotation.NonNull android.hardware.camera2.CaptureRequest r1, @androidx.annotation.NonNull java.util.concurrent.Executor r2, @androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession.CaptureCallback r3) throws android.hardware.camera2.CameraAccessException;

        @androidx.annotation.NonNull
        android.hardware.camera2.CameraCaptureSession unwrap();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    static final class CaptureCallbackExecutorWrapper extends android.hardware.camera2.CameraCaptureSession.CaptureCallback {
        private final java.util.concurrent.Executor mExecutor;
        final android.hardware.camera2.CameraCaptureSession.CaptureCallback mWrappedCallback;

        CaptureCallbackExecutorWrapper(@androidx.annotation.NonNull java.util.concurrent.Executor r1, @androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession.CaptureCallback r2) {
                r0 = this;
                r0.<init>()
                r0.mExecutor = r1
                r0.mWrappedCallback = r2
                return
        }

        public static /* synthetic */ void a(androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper r0, android.hardware.camera2.CameraCaptureSession r1, int r2) {
                android.hardware.camera2.CameraCaptureSession$CaptureCallback r0 = r0.mWrappedCallback
                r0.onCaptureSequenceAborted(r1, r2)
                return
        }

        public static /* synthetic */ void b(androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper r0, android.hardware.camera2.CameraCaptureSession r1, android.hardware.camera2.CaptureRequest r2, long r3, long r5) {
                android.hardware.camera2.CameraCaptureSession$CaptureCallback r0 = r0.mWrappedCallback
                r0.onCaptureStarted(r1, r2, r3, r5)
                return
        }

        public static /* synthetic */ void c(androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper r0, android.hardware.camera2.CameraCaptureSession r1, android.hardware.camera2.CaptureRequest r2, android.hardware.camera2.CaptureFailure r3) {
                android.hardware.camera2.CameraCaptureSession$CaptureCallback r0 = r0.mWrappedCallback
                r0.onCaptureFailed(r1, r2, r3)
                return
        }

        public static /* synthetic */ void d(androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper r0, android.hardware.camera2.CameraCaptureSession r1, int r2, long r3) {
                android.hardware.camera2.CameraCaptureSession$CaptureCallback r0 = r0.mWrappedCallback
                r0.onCaptureSequenceCompleted(r1, r2, r3)
                return
        }

        public static /* synthetic */ void e(androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper r0, android.hardware.camera2.CameraCaptureSession r1, android.hardware.camera2.CaptureRequest r2, android.view.Surface r3, long r4) {
                android.hardware.camera2.CameraCaptureSession$CaptureCallback r0 = r0.mWrappedCallback
                androidx.camera.camera2.internal.compat.ApiCompat.Api24Impl.onCaptureBufferLost(r0, r1, r2, r3, r4)
                return
        }

        public static /* synthetic */ void f(androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper r0, android.hardware.camera2.CameraCaptureSession r1, android.hardware.camera2.CaptureRequest r2, android.hardware.camera2.TotalCaptureResult r3) {
                android.hardware.camera2.CameraCaptureSession$CaptureCallback r0 = r0.mWrappedCallback
                r0.onCaptureCompleted(r1, r2, r3)
                return
        }

        public static /* synthetic */ void g(androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper r0, android.hardware.camera2.CameraCaptureSession r1, android.hardware.camera2.CaptureRequest r2, android.hardware.camera2.CaptureResult r3) {
                android.hardware.camera2.CameraCaptureSession$CaptureCallback r0 = r0.mWrappedCallback
                r0.onCaptureProgressed(r1, r2, r3)
                return
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        @androidx.annotation.RequiresApi(24)
        public void onCaptureBufferLost(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r9, @androidx.annotation.NonNull android.hardware.camera2.CaptureRequest r10, @androidx.annotation.NonNull android.view.Surface r11, long r12) {
                r8 = this;
                java.util.concurrent.Executor r0 = r8.mExecutor
                androidx.camera.camera2.internal.compat.k r1 = new androidx.camera.camera2.internal.compat.k
                r2 = r8
                r3 = r9
                r4 = r10
                r5 = r11
                r6 = r12
                r1.<init>(r2, r3, r4, r5, r6)
                r0.execute(r1)
                return
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r3, @androidx.annotation.NonNull android.hardware.camera2.CaptureRequest r4, @androidx.annotation.NonNull android.hardware.camera2.TotalCaptureResult r5) {
                r2 = this;
                java.util.concurrent.Executor r0 = r2.mExecutor
                androidx.camera.camera2.internal.compat.g r1 = new androidx.camera.camera2.internal.compat.g
                r1.<init>(r2, r3, r4, r5)
                r0.execute(r1)
                return
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r3, @androidx.annotation.NonNull android.hardware.camera2.CaptureRequest r4, @androidx.annotation.NonNull android.hardware.camera2.CaptureFailure r5) {
                r2 = this;
                java.util.concurrent.Executor r0 = r2.mExecutor
                androidx.camera.camera2.internal.compat.j r1 = new androidx.camera.camera2.internal.compat.j
                r1.<init>(r2, r3, r4, r5)
                r0.execute(r1)
                return
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r3, @androidx.annotation.NonNull android.hardware.camera2.CaptureRequest r4, @androidx.annotation.NonNull android.hardware.camera2.CaptureResult r5) {
                r2 = this;
                java.util.concurrent.Executor r0 = r2.mExecutor
                androidx.camera.camera2.internal.compat.h r1 = new androidx.camera.camera2.internal.compat.h
                r1.<init>(r2, r3, r4, r5)
                r0.execute(r1)
                return
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r3, int r4) {
                r2 = this;
                java.util.concurrent.Executor r0 = r2.mExecutor
                androidx.camera.camera2.internal.compat.l r1 = new androidx.camera.camera2.internal.compat.l
                r1.<init>(r2, r3, r4)
                r0.execute(r1)
                return
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r8, int r9, long r10) {
                r7 = this;
                java.util.concurrent.Executor r0 = r7.mExecutor
                androidx.camera.camera2.internal.compat.i r1 = new androidx.camera.camera2.internal.compat.i
                r2 = r7
                r3 = r8
                r4 = r9
                r5 = r10
                r1.<init>(r2, r3, r4, r5)
                r0.execute(r1)
                return
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r10, @androidx.annotation.NonNull android.hardware.camera2.CaptureRequest r11, long r12, long r14) {
                r9 = this;
                java.util.concurrent.Executor r0 = r9.mExecutor
                androidx.camera.camera2.internal.compat.f r1 = new androidx.camera.camera2.internal.compat.f
                r2 = r9
                r3 = r10
                r4 = r11
                r5 = r12
                r7 = r14
                r1.<init>(r2, r3, r4, r5, r7)
                r0.execute(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    static final class StateCallbackExecutorWrapper extends android.hardware.camera2.CameraCaptureSession.StateCallback {
        private final java.util.concurrent.Executor mExecutor;
        final android.hardware.camera2.CameraCaptureSession.StateCallback mWrappedCallback;

        StateCallbackExecutorWrapper(@androidx.annotation.NonNull java.util.concurrent.Executor r1, @androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession.StateCallback r2) {
                r0 = this;
                r0.<init>()
                r0.mExecutor = r1
                r0.mWrappedCallback = r2
                return
        }

        public static /* synthetic */ void a(androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.StateCallbackExecutorWrapper r0, android.hardware.camera2.CameraCaptureSession r1) {
                android.hardware.camera2.CameraCaptureSession$StateCallback r0 = r0.mWrappedCallback
                androidx.camera.camera2.internal.compat.ApiCompat.Api26Impl.onCaptureQueueEmpty(r0, r1)
                return
        }

        public static /* synthetic */ void b(androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.StateCallbackExecutorWrapper r0, android.hardware.camera2.CameraCaptureSession r1) {
                android.hardware.camera2.CameraCaptureSession$StateCallback r0 = r0.mWrappedCallback
                r0.onClosed(r1)
                return
        }

        public static /* synthetic */ void c(androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.StateCallbackExecutorWrapper r0, android.hardware.camera2.CameraCaptureSession r1) {
                android.hardware.camera2.CameraCaptureSession$StateCallback r0 = r0.mWrappedCallback
                r0.onConfigureFailed(r1)
                return
        }

        public static /* synthetic */ void d(androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.StateCallbackExecutorWrapper r0, android.hardware.camera2.CameraCaptureSession r1, android.view.Surface r2) {
                android.hardware.camera2.CameraCaptureSession$StateCallback r0 = r0.mWrappedCallback
                androidx.camera.camera2.internal.compat.ApiCompat.Api23Impl.onSurfacePrepared(r0, r1, r2)
                return
        }

        public static /* synthetic */ void e(androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.StateCallbackExecutorWrapper r0, android.hardware.camera2.CameraCaptureSession r1) {
                android.hardware.camera2.CameraCaptureSession$StateCallback r0 = r0.mWrappedCallback
                r0.onReady(r1)
                return
        }

        public static /* synthetic */ void f(androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.StateCallbackExecutorWrapper r0, android.hardware.camera2.CameraCaptureSession r1) {
                android.hardware.camera2.CameraCaptureSession$StateCallback r0 = r0.mWrappedCallback
                r0.onActive(r1)
                return
        }

        public static /* synthetic */ void g(androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.StateCallbackExecutorWrapper r0, android.hardware.camera2.CameraCaptureSession r1) {
                android.hardware.camera2.CameraCaptureSession$StateCallback r0 = r0.mWrappedCallback
                r0.onConfigured(r1)
                return
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r3) {
                r2 = this;
                java.util.concurrent.Executor r0 = r2.mExecutor
                androidx.camera.camera2.internal.compat.m r1 = new androidx.camera.camera2.internal.compat.m
                r1.<init>(r2, r3)
                r0.execute(r1)
                return
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        @androidx.annotation.RequiresApi(26)
        public void onCaptureQueueEmpty(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r3) {
                r2 = this;
                java.util.concurrent.Executor r0 = r2.mExecutor
                androidx.camera.camera2.internal.compat.p r1 = new androidx.camera.camera2.internal.compat.p
                r1.<init>(r2, r3)
                r0.execute(r1)
                return
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r3) {
                r2 = this;
                java.util.concurrent.Executor r0 = r2.mExecutor
                androidx.camera.camera2.internal.compat.n r1 = new androidx.camera.camera2.internal.compat.n
                r1.<init>(r2, r3)
                r0.execute(r1)
                return
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r3) {
                r2 = this;
                java.util.concurrent.Executor r0 = r2.mExecutor
                androidx.camera.camera2.internal.compat.s r1 = new androidx.camera.camera2.internal.compat.s
                r1.<init>(r2, r3)
                r0.execute(r1)
                return
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r3) {
                r2 = this;
                java.util.concurrent.Executor r0 = r2.mExecutor
                androidx.camera.camera2.internal.compat.q r1 = new androidx.camera.camera2.internal.compat.q
                r1.<init>(r2, r3)
                r0.execute(r1)
                return
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r3) {
                r2 = this;
                java.util.concurrent.Executor r0 = r2.mExecutor
                androidx.camera.camera2.internal.compat.r r1 = new androidx.camera.camera2.internal.compat.r
                r1.<init>(r2, r3)
                r0.execute(r1)
                return
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        @androidx.annotation.RequiresApi(23)
        public void onSurfacePrepared(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r3, @androidx.annotation.NonNull android.view.Surface r4) {
                r2 = this;
                java.util.concurrent.Executor r0 = r2.mExecutor
                androidx.camera.camera2.internal.compat.o r1 = new androidx.camera.camera2.internal.compat.o
                r1.<init>(r2, r3, r4)
                r0.execute(r1)
                return
        }
    }

    private CameraCaptureSessionCompat(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r3, @androidx.annotation.NonNull android.os.Handler r4) {
            r2 = this;
            r2.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L11
            androidx.camera.camera2.internal.compat.CameraCaptureSessionCompatApi28Impl r4 = new androidx.camera.camera2.internal.compat.CameraCaptureSessionCompatApi28Impl
            r4.<init>(r3)
            r2.mImpl = r4
            return
        L11:
            androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$CameraCaptureSessionCompatImpl r3 = androidx.camera.camera2.internal.compat.CameraCaptureSessionCompatBaseImpl.create(r3, r4)
            r2.mImpl = r3
            return
    }

    @androidx.annotation.NonNull
    public static androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat toCameraCaptureSessionCompat(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r1) {
            android.os.Handler r0 = androidx.camera.core.impl.utils.MainThreadAsyncHandler.getInstance()
            androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat r1 = toCameraCaptureSessionCompat(r1, r0)
            return r1
    }

    @androidx.annotation.NonNull
    public static androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat toCameraCaptureSessionCompat(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r1, @androidx.annotation.NonNull android.os.Handler r2) {
            androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat r0 = new androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat
            r0.<init>(r1, r2)
            return r0
    }

    public int captureBurstRequests(@androidx.annotation.NonNull java.util.List<android.hardware.camera2.CaptureRequest> r2, @androidx.annotation.NonNull java.util.concurrent.Executor r3, @androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession.CaptureCallback r4) throws android.hardware.camera2.CameraAccessException {
            r1 = this;
            androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$CameraCaptureSessionCompatImpl r0 = r1.mImpl
            int r2 = r0.captureBurstRequests(r2, r3, r4)
            return r2
    }

    public int captureSingleRequest(@androidx.annotation.NonNull android.hardware.camera2.CaptureRequest r2, @androidx.annotation.NonNull java.util.concurrent.Executor r3, @androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession.CaptureCallback r4) throws android.hardware.camera2.CameraAccessException {
            r1 = this;
            androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$CameraCaptureSessionCompatImpl r0 = r1.mImpl
            int r2 = r0.captureSingleRequest(r2, r3, r4)
            return r2
    }

    public int setRepeatingBurstRequests(@androidx.annotation.NonNull java.util.List<android.hardware.camera2.CaptureRequest> r2, @androidx.annotation.NonNull java.util.concurrent.Executor r3, @androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession.CaptureCallback r4) throws android.hardware.camera2.CameraAccessException {
            r1 = this;
            androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$CameraCaptureSessionCompatImpl r0 = r1.mImpl
            int r2 = r0.setRepeatingBurstRequests(r2, r3, r4)
            return r2
    }

    public int setSingleRepeatingRequest(@androidx.annotation.NonNull android.hardware.camera2.CaptureRequest r2, @androidx.annotation.NonNull java.util.concurrent.Executor r3, @androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession.CaptureCallback r4) throws android.hardware.camera2.CameraAccessException {
            r1 = this;
            androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$CameraCaptureSessionCompatImpl r0 = r1.mImpl
            int r2 = r0.setSingleRepeatingRequest(r2, r3, r4)
            return r2
    }

    @androidx.annotation.NonNull
    public android.hardware.camera2.CameraCaptureSession toCameraCaptureSession() {
            r1 = this;
            androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$CameraCaptureSessionCompatImpl r0 = r1.mImpl
            android.hardware.camera2.CameraCaptureSession r0 = r0.unwrap()
            return r0
    }
}
