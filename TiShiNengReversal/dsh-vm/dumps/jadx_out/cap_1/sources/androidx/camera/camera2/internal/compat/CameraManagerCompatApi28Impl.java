package androidx.camera.camera2.internal.compat;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(28)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class CameraManagerCompatApi28Impl extends androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl {
    CameraManagerCompatApi28Impl(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    static androidx.camera.camera2.internal.compat.CameraManagerCompatApi28Impl create(@androidx.annotation.NonNull android.content.Context r1) {
            androidx.camera.camera2.internal.compat.CameraManagerCompatApi28Impl r0 = new androidx.camera.camera2.internal.compat.CameraManagerCompatApi28Impl
            r0.<init>(r1)
            return r0
    }

    private boolean isDndFailCase(@androidx.annotation.NonNull java.lang.Throwable r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 != r1) goto Le
            boolean r3 = isDndRuntimeException(r3)
            if (r3 == 0) goto Le
            r3 = 1
            return r3
        Le:
            r3 = 0
            return r3
    }

    private static boolean isDndRuntimeException(@androidx.annotation.NonNull java.lang.Throwable r2) {
            java.lang.Class r0 = r2.getClass()
            java.lang.Class<java.lang.RuntimeException> r1 = java.lang.RuntimeException.class
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 == 0) goto L24
            java.lang.StackTraceElement[] r2 = r2.getStackTrace()
            if (r2 == 0) goto L24
            int r0 = r2.length
            if (r0 >= 0) goto L17
            goto L24
        L17:
            r2 = r2[r1]
            java.lang.String r2 = r2.getMethodName()
            java.lang.String r0 = "_enableShutterSound"
            boolean r2 = r0.equals(r2)
            return r2
        L24:
            return r1
    }

    private void throwDndException(@androidx.annotation.NonNull java.lang.Throwable r3) throws androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat {
            r2 = this;
            androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat r0 = new androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat
            r1 = 10001(0x2711, float:1.4014E-41)
            r0.<init>(r1, r3)
            throw r0
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    @androidx.annotation.NonNull
    public android.hardware.camera2.CameraCharacteristics getCameraCharacteristics(@androidx.annotation.NonNull java.lang.String r2) throws androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat {
            r1 = this;
            android.hardware.camera2.CameraCharacteristics r2 = super.getCameraCharacteristics(r2)     // Catch: java.lang.RuntimeException -> L5
            return r2
        L5:
            r2 = move-exception
            boolean r0 = r1.isDndFailCase(r2)
            if (r0 == 0) goto Lf
            r1.throwDndException(r2)
        Lf:
            throw r2
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    @androidx.annotation.RequiresPermission("android.permission.CAMERA")
    public void openCamera(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.util.concurrent.Executor r3, @androidx.annotation.NonNull android.hardware.camera2.CameraDevice.StateCallback r4) throws androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat {
            r1 = this;
            android.hardware.camera2.CameraManager r0 = r1.mCameraManager     // Catch: java.lang.RuntimeException -> L6 java.lang.SecurityException -> L8 java.lang.IllegalArgumentException -> La android.hardware.camera2.CameraAccessException -> Lc
            r0.openCamera(r2, r3, r4)     // Catch: java.lang.RuntimeException -> L6 java.lang.SecurityException -> L8 java.lang.IllegalArgumentException -> La android.hardware.camera2.CameraAccessException -> Lc
            return
        L6:
            r2 = move-exception
            goto Le
        L8:
            r2 = move-exception
            goto L18
        La:
            r2 = move-exception
            goto L18
        Lc:
            r2 = move-exception
            goto L19
        Le:
            boolean r3 = r1.isDndFailCase(r2)
            if (r3 == 0) goto L17
            r1.throwDndException(r2)
        L17:
            throw r2
        L18:
            throw r2
        L19:
            androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat r2 = androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat.toCameraAccessExceptionCompat(r2)
            throw r2
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public void registerAvailabilityCallback(@androidx.annotation.NonNull java.util.concurrent.Executor r2, @androidx.annotation.NonNull android.hardware.camera2.CameraManager.AvailabilityCallback r3) {
            r1 = this;
            android.hardware.camera2.CameraManager r0 = r1.mCameraManager
            r0.registerAvailabilityCallback(r2, r3)
            return
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public void unregisterAvailabilityCallback(@androidx.annotation.NonNull android.hardware.camera2.CameraManager.AvailabilityCallback r2) {
            r1 = this;
            android.hardware.camera2.CameraManager r0 = r1.mCameraManager
            r0.unregisterAvailabilityCallback(r2)
            return
    }
}
