package androidx.camera.camera2.internal.compat;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class CameraManagerCompat {

    @androidx.annotation.GuardedBy("mCameraCharacteristicsMap")
    private final java.util.Map<java.lang.String, androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat> mCameraCharacteristicsMap;
    private final androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl mImpl;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    static final class AvailabilityCallbackExecutorWrapper extends android.hardware.camera2.CameraManager.AvailabilityCallback {

        @androidx.annotation.GuardedBy("mLock")
        private boolean mDisabled;
        private final java.util.concurrent.Executor mExecutor;
        private final java.lang.Object mLock;
        final android.hardware.camera2.CameraManager.AvailabilityCallback mWrappedCallback;

        AvailabilityCallbackExecutorWrapper(@androidx.annotation.NonNull java.util.concurrent.Executor r2, @androidx.annotation.NonNull android.hardware.camera2.CameraManager.AvailabilityCallback r3) {
                r1 = this;
                r1.<init>()
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                r1.mLock = r0
                r0 = 0
                r1.mDisabled = r0
                r1.mExecutor = r2
                r1.mWrappedCallback = r3
                return
        }

        public static /* synthetic */ void a(androidx.camera.camera2.internal.compat.CameraManagerCompat.AvailabilityCallbackExecutorWrapper r0, java.lang.String r1) {
                android.hardware.camera2.CameraManager$AvailabilityCallback r0 = r0.mWrappedCallback
                r0.onCameraAvailable(r1)
                return
        }

        public static /* synthetic */ void b(androidx.camera.camera2.internal.compat.CameraManagerCompat.AvailabilityCallbackExecutorWrapper r0) {
                android.hardware.camera2.CameraManager$AvailabilityCallback r0 = r0.mWrappedCallback
                androidx.camera.camera2.internal.compat.ApiCompat.Api29Impl.onCameraAccessPrioritiesChanged(r0)
                return
        }

        public static /* synthetic */ void c(androidx.camera.camera2.internal.compat.CameraManagerCompat.AvailabilityCallbackExecutorWrapper r0, java.lang.String r1) {
                android.hardware.camera2.CameraManager$AvailabilityCallback r0 = r0.mWrappedCallback
                r0.onCameraUnavailable(r1)
                return
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        @androidx.annotation.RequiresApi(29)
        public void onCameraAccessPrioritiesChanged() {
                r3 = this;
                java.lang.Object r0 = r3.mLock
                monitor-enter(r0)
                boolean r1 = r3.mDisabled     // Catch: java.lang.Throwable -> L12
                if (r1 != 0) goto L14
                java.util.concurrent.Executor r1 = r3.mExecutor     // Catch: java.lang.Throwable -> L12
                androidx.camera.camera2.internal.compat.y r2 = new androidx.camera.camera2.internal.compat.y     // Catch: java.lang.Throwable -> L12
                r2.<init>(r3)     // Catch: java.lang.Throwable -> L12
                r1.execute(r2)     // Catch: java.lang.Throwable -> L12
                goto L14
            L12:
                r1 = move-exception
                goto L16
            L14:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
                return
            L16:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
                throw r1
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(@androidx.annotation.NonNull java.lang.String r4) {
                r3 = this;
                java.lang.Object r0 = r3.mLock
                monitor-enter(r0)
                boolean r1 = r3.mDisabled     // Catch: java.lang.Throwable -> L12
                if (r1 != 0) goto L14
                java.util.concurrent.Executor r1 = r3.mExecutor     // Catch: java.lang.Throwable -> L12
                androidx.camera.camera2.internal.compat.x r2 = new androidx.camera.camera2.internal.compat.x     // Catch: java.lang.Throwable -> L12
                r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L12
                r1.execute(r2)     // Catch: java.lang.Throwable -> L12
                goto L14
            L12:
                r4 = move-exception
                goto L16
            L14:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
                return
            L16:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
                throw r4
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(@androidx.annotation.NonNull java.lang.String r4) {
                r3 = this;
                java.lang.Object r0 = r3.mLock
                monitor-enter(r0)
                boolean r1 = r3.mDisabled     // Catch: java.lang.Throwable -> L12
                if (r1 != 0) goto L14
                java.util.concurrent.Executor r1 = r3.mExecutor     // Catch: java.lang.Throwable -> L12
                androidx.camera.camera2.internal.compat.z r2 = new androidx.camera.camera2.internal.compat.z     // Catch: java.lang.Throwable -> L12
                r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L12
                r1.execute(r2)     // Catch: java.lang.Throwable -> L12
                goto L14
            L12:
                r4 = move-exception
                goto L16
            L14:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
                return
            L16:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
                throw r4
        }

        void setDisabled() {
                r2 = this;
                java.lang.Object r0 = r2.mLock
                monitor-enter(r0)
                r1 = 1
                r2.mDisabled = r1     // Catch: java.lang.Throwable -> L8
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
                return
            L8:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
                throw r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface CameraManagerCompatImpl {
        @androidx.annotation.NonNull
        android.hardware.camera2.CameraCharacteristics getCameraCharacteristics(@androidx.annotation.NonNull java.lang.String r1) throws androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;

        @androidx.annotation.NonNull
        java.lang.String[] getCameraIdList() throws androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;

        @androidx.annotation.NonNull
        android.hardware.camera2.CameraManager getCameraManager();

        @androidx.annotation.NonNull
        java.util.Set<java.util.Set<java.lang.String>> getConcurrentCameraIds() throws androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;

        @androidx.annotation.RequiresPermission("android.permission.CAMERA")
        void openCamera(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull java.util.concurrent.Executor r2, @androidx.annotation.NonNull android.hardware.camera2.CameraDevice.StateCallback r3) throws androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;

        void registerAvailabilityCallback(@androidx.annotation.NonNull java.util.concurrent.Executor r1, @androidx.annotation.NonNull android.hardware.camera2.CameraManager.AvailabilityCallback r2);

        void unregisterAvailabilityCallback(@androidx.annotation.NonNull android.hardware.camera2.CameraManager.AvailabilityCallback r1);
    }

    private CameraManagerCompat(androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl r3) {
            r2 = this;
            r2.<init>()
            android.util.ArrayMap r0 = new android.util.ArrayMap
            r1 = 4
            r0.<init>(r1)
            r2.mCameraCharacteristicsMap = r0
            r2.mImpl = r3
            return
    }

    @androidx.annotation.NonNull
    public static androidx.camera.camera2.internal.compat.CameraManagerCompat from(@androidx.annotation.NonNull android.content.Context r1) {
            android.os.Handler r0 = androidx.camera.core.impl.utils.MainThreadAsyncHandler.getInstance()
            androidx.camera.camera2.internal.compat.CameraManagerCompat r1 = from(r1, r0)
            return r1
    }

    @androidx.annotation.NonNull
    public static androidx.camera.camera2.internal.compat.CameraManagerCompat from(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull android.os.Handler r2) {
            androidx.camera.camera2.internal.compat.CameraManagerCompat r0 = new androidx.camera.camera2.internal.compat.CameraManagerCompat
            androidx.camera.camera2.internal.compat.CameraManagerCompat$CameraManagerCompatImpl r1 = androidx.camera.camera2.internal.compat.a0.a(r1, r2)
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.VisibleForTesting
    public static androidx.camera.camera2.internal.compat.CameraManagerCompat from(@androidx.annotation.NonNull androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl r1) {
            androidx.camera.camera2.internal.compat.CameraManagerCompat r0 = new androidx.camera.camera2.internal.compat.CameraManagerCompat
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat getCameraCharacteristicsCompat(@androidx.annotation.NonNull java.lang.String r5) throws androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat {
            r4 = this;
            java.util.Map<java.lang.String, androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat> r0 = r4.mCameraCharacteristicsMap
            monitor-enter(r0)
            java.util.Map<java.lang.String, androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat> r1 = r4.mCameraCharacteristicsMap     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L1d
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r1 = (androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat) r1     // Catch: java.lang.Throwable -> L1d
            if (r1 != 0) goto L2c
            androidx.camera.camera2.internal.compat.CameraManagerCompat$CameraManagerCompatImpl r1 = r4.mImpl     // Catch: java.lang.Throwable -> L1d java.lang.AssertionError -> L1f
            android.hardware.camera2.CameraCharacteristics r1 = r1.getCameraCharacteristics(r5)     // Catch: java.lang.Throwable -> L1d java.lang.AssertionError -> L1f
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r1 = androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat.toCameraCharacteristicsCompat(r1, r5)     // Catch: java.lang.Throwable -> L1d java.lang.AssertionError -> L1f
            java.util.Map<java.lang.String, androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat> r2 = r4.mCameraCharacteristicsMap     // Catch: java.lang.Throwable -> L1d java.lang.AssertionError -> L1f
            r2.put(r5, r1)     // Catch: java.lang.Throwable -> L1d java.lang.AssertionError -> L1f
            goto L2c
        L1d:
            r5 = move-exception
            goto L2e
        L1f:
            r5 = move-exception
            androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat r1 = new androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat     // Catch: java.lang.Throwable -> L1d
            java.lang.String r2 = r5.getMessage()     // Catch: java.lang.Throwable -> L1d
            r3 = 10002(0x2712, float:1.4016E-41)
            r1.<init>(r3, r2, r5)     // Catch: java.lang.Throwable -> L1d
            throw r1     // Catch: java.lang.Throwable -> L1d
        L2c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            return r1
        L2e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r5
    }

    @androidx.annotation.NonNull
    public java.lang.String[] getCameraIdList() throws androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat {
            r1 = this;
            androidx.camera.camera2.internal.compat.CameraManagerCompat$CameraManagerCompatImpl r0 = r1.mImpl
            java.lang.String[] r0 = r0.getCameraIdList()
            return r0
    }

    @androidx.annotation.NonNull
    public java.util.Set<java.util.Set<java.lang.String>> getConcurrentCameraIds() throws androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat {
            r1 = this;
            androidx.camera.camera2.internal.compat.CameraManagerCompat$CameraManagerCompatImpl r0 = r1.mImpl
            java.util.Set r0 = r0.getConcurrentCameraIds()
            return r0
    }

    @androidx.annotation.RequiresPermission("android.permission.CAMERA")
    public void openCamera(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.util.concurrent.Executor r3, @androidx.annotation.NonNull android.hardware.camera2.CameraDevice.StateCallback r4) throws androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat {
            r1 = this;
            androidx.camera.camera2.internal.compat.CameraManagerCompat$CameraManagerCompatImpl r0 = r1.mImpl
            r0.openCamera(r2, r3, r4)
            return
    }

    public void registerAvailabilityCallback(@androidx.annotation.NonNull java.util.concurrent.Executor r2, @androidx.annotation.NonNull android.hardware.camera2.CameraManager.AvailabilityCallback r3) {
            r1 = this;
            androidx.camera.camera2.internal.compat.CameraManagerCompat$CameraManagerCompatImpl r0 = r1.mImpl
            r0.registerAvailabilityCallback(r2, r3)
            return
    }

    public void unregisterAvailabilityCallback(@androidx.annotation.NonNull android.hardware.camera2.CameraManager.AvailabilityCallback r2) {
            r1 = this;
            androidx.camera.camera2.internal.compat.CameraManagerCompat$CameraManagerCompatImpl r0 = r1.mImpl
            r0.unregisterAvailabilityCallback(r2)
            return
    }

    @androidx.annotation.NonNull
    public android.hardware.camera2.CameraManager unwrap() {
            r1 = this;
            androidx.camera.camera2.internal.compat.CameraManagerCompat$CameraManagerCompatImpl r0 = r1.mImpl
            android.hardware.camera2.CameraManager r0 = r0.getCameraManager()
            return r0
    }
}
