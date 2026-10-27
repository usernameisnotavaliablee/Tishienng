package androidx.camera.camera2.internal.compat;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class CameraManagerCompatBaseImpl implements androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl {
    final android.hardware.camera2.CameraManager mCameraManager;
    final java.lang.Object mObject;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class CameraManagerCompatParamsApi21 {
        final android.os.Handler mCompatHandler;

        @androidx.annotation.GuardedBy("mWrapperMap")
        final java.util.Map<android.hardware.camera2.CameraManager.AvailabilityCallback, androidx.camera.camera2.internal.compat.CameraManagerCompat.AvailabilityCallbackExecutorWrapper> mWrapperMap;

        CameraManagerCompatParamsApi21(@androidx.annotation.NonNull android.os.Handler r2) {
                r1 = this;
                r1.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.mWrapperMap = r0
                r1.mCompatHandler = r2
                return
        }
    }

    CameraManagerCompatBaseImpl(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable java.lang.Object r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "camera"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.hardware.camera2.CameraManager r2 = (android.hardware.camera2.CameraManager) r2
            r1.mCameraManager = r2
            r1.mObject = r3
            return
    }

    static androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl create(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull android.os.Handler r3) {
            androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl r0 = new androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl
            androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl$CameraManagerCompatParamsApi21 r1 = new androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl$CameraManagerCompatParamsApi21
            r1.<init>(r3)
            r0.<init>(r2, r1)
            return r0
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    @androidx.annotation.NonNull
    public android.hardware.camera2.CameraCharacteristics getCameraCharacteristics(@androidx.annotation.NonNull java.lang.String r2) throws androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat {
            r1 = this;
            android.hardware.camera2.CameraManager r0 = r1.mCameraManager     // Catch: android.hardware.camera2.CameraAccessException -> L7
            android.hardware.camera2.CameraCharacteristics r2 = r0.getCameraCharacteristics(r2)     // Catch: android.hardware.camera2.CameraAccessException -> L7
            return r2
        L7:
            r2 = move-exception
            androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat r2 = androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat.toCameraAccessExceptionCompat(r2)
            throw r2
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    @androidx.annotation.NonNull
    public java.lang.String[] getCameraIdList() throws androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat {
            r1 = this;
            android.hardware.camera2.CameraManager r0 = r1.mCameraManager     // Catch: android.hardware.camera2.CameraAccessException -> L7
            java.lang.String[] r0 = r0.getCameraIdList()     // Catch: android.hardware.camera2.CameraAccessException -> L7
            return r0
        L7:
            r0 = move-exception
            androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat r0 = androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat.toCameraAccessExceptionCompat(r0)
            throw r0
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    @androidx.annotation.NonNull
    public android.hardware.camera2.CameraManager getCameraManager() {
            r1 = this;
            android.hardware.camera2.CameraManager r0 = r1.mCameraManager
            return r0
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    @androidx.annotation.NonNull
    public java.util.Set<java.util.Set<java.lang.String>> getConcurrentCameraIds() throws androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat {
            r1 = this;
            java.util.Set r0 = java.util.Collections.EMPTY_SET
            return r0
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    @androidx.annotation.RequiresPermission("android.permission.CAMERA")
    public void openCamera(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.util.concurrent.Executor r3, @androidx.annotation.NonNull android.hardware.camera2.CameraDevice.StateCallback r4) throws androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat {
            r1 = this;
            androidx.core.util.Preconditions.checkNotNull(r3)
            androidx.core.util.Preconditions.checkNotNull(r4)
            androidx.camera.camera2.internal.compat.CameraDeviceCompat$StateCallbackExecutorWrapper r0 = new androidx.camera.camera2.internal.compat.CameraDeviceCompat$StateCallbackExecutorWrapper
            r0.<init>(r3, r4)
            java.lang.Object r3 = r1.mObject
            androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl$CameraManagerCompatParamsApi21 r3 = (androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl.CameraManagerCompatParamsApi21) r3
            android.hardware.camera2.CameraManager r4 = r1.mCameraManager     // Catch: android.hardware.camera2.CameraAccessException -> L17
            android.os.Handler r3 = r3.mCompatHandler     // Catch: android.hardware.camera2.CameraAccessException -> L17
            r4.openCamera(r2, r0, r3)     // Catch: android.hardware.camera2.CameraAccessException -> L17
            return
        L17:
            r2 = move-exception
            androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat r2 = androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat.toCameraAccessExceptionCompat(r2)
            throw r2
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public void registerAvailabilityCallback(@androidx.annotation.NonNull java.util.concurrent.Executor r4, @androidx.annotation.NonNull android.hardware.camera2.CameraManager.AvailabilityCallback r5) {
            r3 = this;
            if (r4 == 0) goto L2f
            java.lang.Object r0 = r3.mObject
            androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl$CameraManagerCompatParamsApi21 r0 = (androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl.CameraManagerCompatParamsApi21) r0
            if (r5 == 0) goto L26
            java.util.Map<android.hardware.camera2.CameraManager$AvailabilityCallback, androidx.camera.camera2.internal.compat.CameraManagerCompat$AvailabilityCallbackExecutorWrapper> r1 = r0.mWrapperMap
            monitor-enter(r1)
            java.util.Map<android.hardware.camera2.CameraManager$AvailabilityCallback, androidx.camera.camera2.internal.compat.CameraManagerCompat$AvailabilityCallbackExecutorWrapper> r2 = r0.mWrapperMap     // Catch: java.lang.Throwable -> L20
            java.lang.Object r2 = r2.get(r5)     // Catch: java.lang.Throwable -> L20
            androidx.camera.camera2.internal.compat.CameraManagerCompat$AvailabilityCallbackExecutorWrapper r2 = (androidx.camera.camera2.internal.compat.CameraManagerCompat.AvailabilityCallbackExecutorWrapper) r2     // Catch: java.lang.Throwable -> L20
            if (r2 != 0) goto L22
            androidx.camera.camera2.internal.compat.CameraManagerCompat$AvailabilityCallbackExecutorWrapper r2 = new androidx.camera.camera2.internal.compat.CameraManagerCompat$AvailabilityCallbackExecutorWrapper     // Catch: java.lang.Throwable -> L20
            r2.<init>(r4, r5)     // Catch: java.lang.Throwable -> L20
            java.util.Map<android.hardware.camera2.CameraManager$AvailabilityCallback, androidx.camera.camera2.internal.compat.CameraManagerCompat$AvailabilityCallbackExecutorWrapper> r4 = r0.mWrapperMap     // Catch: java.lang.Throwable -> L20
            r4.put(r5, r2)     // Catch: java.lang.Throwable -> L20
            goto L22
        L20:
            r4 = move-exception
            goto L24
        L22:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L20
            goto L27
        L24:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L20
            throw r4
        L26:
            r2 = 0
        L27:
            android.hardware.camera2.CameraManager r4 = r3.mCameraManager
            android.os.Handler r5 = r0.mCompatHandler
            r4.registerAvailabilityCallback(r2, r5)
            return
        L2f:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "executor was null"
            r4.<init>(r5)
            throw r4
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public void unregisterAvailabilityCallback(@androidx.annotation.NonNull android.hardware.camera2.CameraManager.AvailabilityCallback r3) {
            r2 = this;
            if (r3 == 0) goto L16
            java.lang.Object r0 = r2.mObject
            androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl$CameraManagerCompatParamsApi21 r0 = (androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl.CameraManagerCompatParamsApi21) r0
            java.util.Map<android.hardware.camera2.CameraManager$AvailabilityCallback, androidx.camera.camera2.internal.compat.CameraManagerCompat$AvailabilityCallbackExecutorWrapper> r1 = r0.mWrapperMap
            monitor-enter(r1)
            java.util.Map<android.hardware.camera2.CameraManager$AvailabilityCallback, androidx.camera.camera2.internal.compat.CameraManagerCompat$AvailabilityCallbackExecutorWrapper> r0 = r0.mWrapperMap     // Catch: java.lang.Throwable -> L13
            java.lang.Object r3 = r0.remove(r3)     // Catch: java.lang.Throwable -> L13
            androidx.camera.camera2.internal.compat.CameraManagerCompat$AvailabilityCallbackExecutorWrapper r3 = (androidx.camera.camera2.internal.compat.CameraManagerCompat.AvailabilityCallbackExecutorWrapper) r3     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            goto L17
        L13:
            r3 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            throw r3
        L16:
            r3 = 0
        L17:
            if (r3 == 0) goto L1c
            r3.setDisabled()
        L1c:
            android.hardware.camera2.CameraManager r0 = r2.mCameraManager
            r0.unregisterAvailabilityCallback(r3)
            return
    }
}
