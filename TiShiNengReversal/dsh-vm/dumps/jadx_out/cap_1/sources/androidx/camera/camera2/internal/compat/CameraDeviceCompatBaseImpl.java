package androidx.camera.camera2.internal.compat;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class CameraDeviceCompatBaseImpl implements androidx.camera.camera2.internal.compat.CameraDeviceCompat.CameraDeviceCompatImpl {
    final android.hardware.camera2.CameraDevice mCameraDevice;
    final java.lang.Object mImplParams;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class CameraDeviceCompatParamsApi21 {
        final android.os.Handler mCompatHandler;

        CameraDeviceCompatParamsApi21(@androidx.annotation.NonNull android.os.Handler r1) {
                r0 = this;
                r0.<init>()
                r0.mCompatHandler = r1
                return
        }
    }

    CameraDeviceCompatBaseImpl(@androidx.annotation.NonNull android.hardware.camera2.CameraDevice r1, @androidx.annotation.Nullable java.lang.Object r2) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = androidx.core.util.Preconditions.checkNotNull(r1)
            android.hardware.camera2.CameraDevice r1 = (android.hardware.camera2.CameraDevice) r1
            r0.mCameraDevice = r1
            r0.mImplParams = r2
            return
    }

    private static void checkPhysicalCameraIdValid(android.hardware.camera2.CameraDevice r3, @androidx.annotation.NonNull java.util.List<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> r4) {
            java.lang.String r3 = r3.getId()
            java.util.Iterator r4 = r4.iterator()
        L8:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L44
            java.lang.Object r0 = r4.next()
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat r0 = (androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat) r0
            java.lang.String r0 = r0.getPhysicalCameraId()
            if (r0 == 0) goto L8
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Camera "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = ": Camera doesn't support physicalCameraId "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ". Ignoring."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "CameraDeviceCompat"
            androidx.camera.core.Logger.w(r1, r0)
            goto L8
        L44:
            return
    }

    static void checkPreconditions(android.hardware.camera2.CameraDevice r1, androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat r2) {
            androidx.core.util.Preconditions.checkNotNull(r1)
            androidx.core.util.Preconditions.checkNotNull(r2)
            android.hardware.camera2.CameraCaptureSession$StateCallback r0 = r2.getStateCallback()
            androidx.core.util.Preconditions.checkNotNull(r0)
            java.util.List r0 = r2.getOutputConfigurations()
            if (r0 == 0) goto L25
            java.util.concurrent.Executor r2 = r2.getExecutor()
            if (r2 == 0) goto L1d
            checkPhysicalCameraIdValid(r1, r0)
            return
        L1d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Invalid executor"
            r1.<init>(r2)
            throw r1
        L25:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Invalid output configurations"
            r1.<init>(r2)
            throw r1
    }

    static androidx.camera.camera2.internal.compat.CameraDeviceCompatBaseImpl create(@androidx.annotation.NonNull android.hardware.camera2.CameraDevice r2, @androidx.annotation.NonNull android.os.Handler r3) {
            androidx.camera.camera2.internal.compat.CameraDeviceCompatBaseImpl r0 = new androidx.camera.camera2.internal.compat.CameraDeviceCompatBaseImpl
            androidx.camera.camera2.internal.compat.CameraDeviceCompatBaseImpl$CameraDeviceCompatParamsApi21 r1 = new androidx.camera.camera2.internal.compat.CameraDeviceCompatBaseImpl$CameraDeviceCompatParamsApi21
            r1.<init>(r3)
            r0.<init>(r2, r1)
            return r0
    }

    static java.util.List<android.view.Surface> unpackSurfaces(@androidx.annotation.NonNull java.util.List<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r2.size()
            r0.<init>(r1)
            java.util.Iterator r2 = r2.iterator()
        Ld:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r2.next()
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat r1 = (androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat) r1
            android.view.Surface r1 = r1.getSurface()
            r0.add(r1)
            goto Ld
        L21:
            return r0
    }

    void createBaseCaptureSession(@androidx.annotation.NonNull android.hardware.camera2.CameraDevice r1, @androidx.annotation.NonNull java.util.List<android.view.Surface> r2, @androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession.StateCallback r3, @androidx.annotation.NonNull android.os.Handler r4) throws androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat {
            r0 = this;
            r1.createCaptureSession(r2, r3, r4)     // Catch: android.hardware.camera2.CameraAccessException -> L4
            return
        L4:
            r1 = move-exception
            androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat r1 = androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat.toCameraAccessExceptionCompat(r1)
            throw r1
    }

    @Override // androidx.camera.camera2.internal.compat.CameraDeviceCompat.CameraDeviceCompatImpl
    public void createCaptureSession(@androidx.annotation.NonNull androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat r4) throws androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat {
            r3 = this;
            android.hardware.camera2.CameraDevice r0 = r3.mCameraDevice
            checkPreconditions(r0, r4)
            androidx.camera.camera2.internal.compat.params.InputConfigurationCompat r0 = r4.getInputConfiguration()
            if (r0 != 0) goto L3b
            int r0 = r4.getSessionType()
            r1 = 1
            if (r0 == r1) goto L33
            androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$StateCallbackExecutorWrapper r0 = new androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$StateCallbackExecutorWrapper
            java.util.concurrent.Executor r1 = r4.getExecutor()
            android.hardware.camera2.CameraCaptureSession$StateCallback r2 = r4.getStateCallback()
            r0.<init>(r1, r2)
            java.util.List r4 = r4.getOutputConfigurations()
            java.util.List r4 = unpackSurfaces(r4)
            java.lang.Object r1 = r3.mImplParams
            androidx.camera.camera2.internal.compat.CameraDeviceCompatBaseImpl$CameraDeviceCompatParamsApi21 r1 = (androidx.camera.camera2.internal.compat.CameraDeviceCompatBaseImpl.CameraDeviceCompatParamsApi21) r1
            android.hardware.camera2.CameraDevice r2 = r3.mCameraDevice
            android.os.Handler r1 = r1.mCompatHandler
            r3.createBaseCaptureSession(r2, r4, r0, r1)
            return
        L33:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "High speed capture sessions not supported until API 23"
            r4.<init>(r0)
            throw r4
        L3b:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Reprocessing sessions not supported until API 23"
            r4.<init>(r0)
            throw r4
    }

    @Override // androidx.camera.camera2.internal.compat.CameraDeviceCompat.CameraDeviceCompatImpl
    @androidx.annotation.NonNull
    public android.hardware.camera2.CameraDevice unwrap() {
            r1 = this;
            android.hardware.camera2.CameraDevice r0 = r1.mCameraDevice
            return r0
    }
}
