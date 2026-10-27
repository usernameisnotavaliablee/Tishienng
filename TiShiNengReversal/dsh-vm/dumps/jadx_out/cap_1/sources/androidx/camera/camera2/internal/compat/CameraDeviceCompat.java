package androidx.camera.camera2.internal.compat;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class CameraDeviceCompat {

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final int SESSION_OPERATION_MODE_CONSTRAINED_HIGH_SPEED = 1;

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final int SESSION_OPERATION_MODE_NORMAL = 0;
    private final androidx.camera.camera2.internal.compat.CameraDeviceCompat.CameraDeviceCompatImpl mImpl;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface CameraDeviceCompatImpl {
        void createCaptureSession(@androidx.annotation.NonNull androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat r1) throws androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;

        @androidx.annotation.NonNull
        android.hardware.camera2.CameraDevice unwrap();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    static final class StateCallbackExecutorWrapper extends android.hardware.camera2.CameraDevice.StateCallback {
        private final java.util.concurrent.Executor mExecutor;
        final android.hardware.camera2.CameraDevice.StateCallback mWrappedCallback;

        StateCallbackExecutorWrapper(@androidx.annotation.NonNull java.util.concurrent.Executor r1, @androidx.annotation.NonNull android.hardware.camera2.CameraDevice.StateCallback r2) {
                r0 = this;
                r0.<init>()
                r0.mExecutor = r1
                r0.mWrappedCallback = r2
                return
        }

        public static /* synthetic */ void a(androidx.camera.camera2.internal.compat.CameraDeviceCompat.StateCallbackExecutorWrapper r0, android.hardware.camera2.CameraDevice r1) {
                android.hardware.camera2.CameraDevice$StateCallback r0 = r0.mWrappedCallback
                r0.onDisconnected(r1)
                return
        }

        public static /* synthetic */ void b(androidx.camera.camera2.internal.compat.CameraDeviceCompat.StateCallbackExecutorWrapper r0, android.hardware.camera2.CameraDevice r1, int r2) {
                android.hardware.camera2.CameraDevice$StateCallback r0 = r0.mWrappedCallback
                r0.onError(r1, r2)
                return
        }

        public static /* synthetic */ void c(androidx.camera.camera2.internal.compat.CameraDeviceCompat.StateCallbackExecutorWrapper r0, android.hardware.camera2.CameraDevice r1) {
                android.hardware.camera2.CameraDevice$StateCallback r0 = r0.mWrappedCallback
                r0.onClosed(r1)
                return
        }

        public static /* synthetic */ void d(androidx.camera.camera2.internal.compat.CameraDeviceCompat.StateCallbackExecutorWrapper r0, android.hardware.camera2.CameraDevice r1) {
                android.hardware.camera2.CameraDevice$StateCallback r0 = r0.mWrappedCallback
                r0.onOpened(r1)
                return
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(@androidx.annotation.NonNull android.hardware.camera2.CameraDevice r3) {
                r2 = this;
                java.util.concurrent.Executor r0 = r2.mExecutor
                androidx.camera.camera2.internal.compat.t r1 = new androidx.camera.camera2.internal.compat.t
                r1.<init>(r2, r3)
                r0.execute(r1)
                return
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(@androidx.annotation.NonNull android.hardware.camera2.CameraDevice r3) {
                r2 = this;
                java.util.concurrent.Executor r0 = r2.mExecutor
                androidx.camera.camera2.internal.compat.v r1 = new androidx.camera.camera2.internal.compat.v
                r1.<init>(r2, r3)
                r0.execute(r1)
                return
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(@androidx.annotation.NonNull android.hardware.camera2.CameraDevice r3, int r4) {
                r2 = this;
                java.util.concurrent.Executor r0 = r2.mExecutor
                androidx.camera.camera2.internal.compat.u r1 = new androidx.camera.camera2.internal.compat.u
                r1.<init>(r2, r3, r4)
                r0.execute(r1)
                return
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(@androidx.annotation.NonNull android.hardware.camera2.CameraDevice r3) {
                r2 = this;
                java.util.concurrent.Executor r0 = r2.mExecutor
                androidx.camera.camera2.internal.compat.w r1 = new androidx.camera.camera2.internal.compat.w
                r1.<init>(r2, r3)
                r0.execute(r1)
                return
        }
    }

    private CameraDeviceCompat(@androidx.annotation.NonNull android.hardware.camera2.CameraDevice r3, @androidx.annotation.NonNull android.os.Handler r4) {
            r2 = this;
            r2.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L11
            androidx.camera.camera2.internal.compat.CameraDeviceCompatApi28Impl r4 = new androidx.camera.camera2.internal.compat.CameraDeviceCompatApi28Impl
            r4.<init>(r3)
            r2.mImpl = r4
            return
        L11:
            r1 = 24
            if (r0 < r1) goto L1c
            androidx.camera.camera2.internal.compat.CameraDeviceCompatApi24Impl r3 = androidx.camera.camera2.internal.compat.CameraDeviceCompatApi24Impl.create(r3, r4)
            r2.mImpl = r3
            return
        L1c:
            r1 = 23
            if (r0 < r1) goto L27
            androidx.camera.camera2.internal.compat.CameraDeviceCompatApi23Impl r3 = androidx.camera.camera2.internal.compat.CameraDeviceCompatApi23Impl.create(r3, r4)
            r2.mImpl = r3
            return
        L27:
            androidx.camera.camera2.internal.compat.CameraDeviceCompatBaseImpl r3 = androidx.camera.camera2.internal.compat.CameraDeviceCompatBaseImpl.create(r3, r4)
            r2.mImpl = r3
            return
    }

    @androidx.annotation.NonNull
    public static androidx.camera.camera2.internal.compat.CameraDeviceCompat toCameraDeviceCompat(@androidx.annotation.NonNull android.hardware.camera2.CameraDevice r1) {
            android.os.Handler r0 = androidx.camera.core.impl.utils.MainThreadAsyncHandler.getInstance()
            androidx.camera.camera2.internal.compat.CameraDeviceCompat r1 = toCameraDeviceCompat(r1, r0)
            return r1
    }

    @androidx.annotation.NonNull
    public static androidx.camera.camera2.internal.compat.CameraDeviceCompat toCameraDeviceCompat(@androidx.annotation.NonNull android.hardware.camera2.CameraDevice r1, @androidx.annotation.NonNull android.os.Handler r2) {
            androidx.camera.camera2.internal.compat.CameraDeviceCompat r0 = new androidx.camera.camera2.internal.compat.CameraDeviceCompat
            r0.<init>(r1, r2)
            return r0
    }

    public void createCaptureSession(@androidx.annotation.NonNull androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat r2) throws androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat {
            r1 = this;
            androidx.camera.camera2.internal.compat.CameraDeviceCompat$CameraDeviceCompatImpl r0 = r1.mImpl
            r0.createCaptureSession(r2)
            return
    }

    @androidx.annotation.NonNull
    public android.hardware.camera2.CameraDevice toCameraDevice() {
            r1 = this;
            androidx.camera.camera2.internal.compat.CameraDeviceCompat$CameraDeviceCompatImpl r0 = r1.mImpl
            android.hardware.camera2.CameraDevice r0 = r0.unwrap()
            return r0
    }
}
