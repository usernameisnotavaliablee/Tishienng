package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class Camera2CameraFactory implements androidx.camera.core.impl.CameraFactory {
    private static final int DEFAULT_ALLOWED_CONCURRENT_OPEN_CAMERAS = 1;
    private static final java.lang.String TAG = "Camera2CameraFactory";
    private final java.util.List<java.lang.String> mAvailableCameraIds;
    private final androidx.camera.core.concurrent.CameraCoordinator mCameraCoordinator;
    private final java.util.Map<java.lang.String, androidx.camera.camera2.internal.Camera2CameraInfoImpl> mCameraInfos;
    private final androidx.camera.camera2.internal.compat.CameraManagerCompat mCameraManager;
    private final androidx.camera.core.impl.CameraStateRegistry mCameraStateRegistry;
    private final androidx.camera.camera2.internal.DisplayInfoManager mDisplayInfoManager;
    private final androidx.camera.core.impl.CameraThreadConfig mThreadConfig;

    public Camera2CameraFactory(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull androidx.camera.core.impl.CameraThreadConfig r3, @androidx.annotation.Nullable androidx.camera.core.CameraSelector r4) throws androidx.camera.core.InitializationException {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mCameraInfos = r0
            r1.mThreadConfig = r3
            android.os.Handler r3 = r3.getSchedulerHandler()
            androidx.camera.camera2.internal.compat.CameraManagerCompat r3 = androidx.camera.camera2.internal.compat.CameraManagerCompat.from(r2, r3)
            r1.mCameraManager = r3
            androidx.camera.camera2.internal.DisplayInfoManager r2 = androidx.camera.camera2.internal.DisplayInfoManager.getInstance(r2)
            r1.mDisplayInfoManager = r2
            java.util.List r2 = androidx.camera.camera2.internal.CameraSelectionOptimizer.getSelectedAvailableCameraIds(r1, r4)
            java.util.List r2 = r1.getBackwardCompatibleCameraIds(r2)
            r1.mAvailableCameraIds = r2
            androidx.camera.camera2.internal.concurrent.Camera2CameraCoordinator r2 = new androidx.camera.camera2.internal.concurrent.Camera2CameraCoordinator
            r2.<init>(r3)
            r1.mCameraCoordinator = r2
            androidx.camera.core.impl.CameraStateRegistry r3 = new androidx.camera.core.impl.CameraStateRegistry
            r4 = 1
            r3.<init>(r2, r4)
            r1.mCameraStateRegistry = r3
            r2.addListener(r3)
            return
    }

    private java.util.List<java.lang.String> getBackwardCompatibleCameraIds(@androidx.annotation.NonNull java.util.List<java.lang.String> r5) throws androidx.camera.core.InitializationException {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L9:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L50
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "0"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L4c
            java.lang.String r2 = "1"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L26
            goto L4c
        L26:
            boolean r2 = r4.isBackwardCompatible(r1)
            if (r2 == 0) goto L30
            r0.add(r1)
            goto L9
        L30:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Camera "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE."
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "Camera2CameraFactory"
            androidx.camera.core.Logger.d(r2, r1)
            goto L9
        L4c:
            r0.add(r1)
            goto L9
        L50:
            return r0
    }

    private boolean isBackwardCompatible(@androidx.annotation.NonNull java.lang.String r6) throws androidx.camera.core.InitializationException {
            r5 = this;
            java.lang.String r0 = "robolectric"
            java.lang.String r1 = android.os.Build.FINGERPRINT
            boolean r0 = r0.equals(r1)
            r1 = 1
            if (r0 == 0) goto Lc
            return r1
        Lc:
            androidx.camera.camera2.internal.compat.CameraManagerCompat r0 = r5.mCameraManager     // Catch: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L2a
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r6 = r0.getCameraCharacteristicsCompat(r6)     // Catch: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L2a
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES     // Catch: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L2a
            java.lang.Object r6 = r6.get(r0)     // Catch: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L2a
            int[] r6 = (int[]) r6     // Catch: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L2a
            r0 = 0
            if (r6 == 0) goto L29
            int r2 = r6.length
            r3 = 0
        L1f:
            if (r3 >= r2) goto L29
            r4 = r6[r3]
            if (r4 != 0) goto L26
            return r1
        L26:
            int r3 = r3 + 1
            goto L1f
        L29:
            return r0
        L2a:
            r6 = move-exception
            androidx.camera.core.InitializationException r0 = new androidx.camera.core.InitializationException
            androidx.camera.core.CameraUnavailableException r6 = androidx.camera.camera2.internal.CameraUnavailableExceptionHelper.createFrom(r6)
            r0.<init>(r6)
            throw r0
    }

    @Override // androidx.camera.core.impl.CameraFactory
    @androidx.annotation.NonNull
    public java.util.Set<java.lang.String> getAvailableCameraIds() {
            r2 = this;
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            java.util.List<java.lang.String> r1 = r2.mAvailableCameraIds
            r0.<init>(r1)
            return r0
    }

    @Override // androidx.camera.core.impl.CameraFactory
    @androidx.annotation.NonNull
    public androidx.camera.core.impl.CameraInternal getCamera(@androidx.annotation.NonNull java.lang.String r11) throws androidx.camera.core.CameraUnavailableException {
            r10 = this;
            java.util.List<java.lang.String> r0 = r10.mAvailableCameraIds
            boolean r0 = r0.contains(r11)
            if (r0 == 0) goto L27
            androidx.camera.camera2.internal.Camera2CameraImpl r1 = new androidx.camera.camera2.internal.Camera2CameraImpl
            androidx.camera.camera2.internal.compat.CameraManagerCompat r2 = r10.mCameraManager
            androidx.camera.camera2.internal.Camera2CameraInfoImpl r4 = r10.getCameraInfo(r11)
            androidx.camera.core.concurrent.CameraCoordinator r5 = r10.mCameraCoordinator
            androidx.camera.core.impl.CameraStateRegistry r6 = r10.mCameraStateRegistry
            androidx.camera.core.impl.CameraThreadConfig r0 = r10.mThreadConfig
            java.util.concurrent.Executor r7 = r0.getCameraExecutor()
            androidx.camera.core.impl.CameraThreadConfig r0 = r10.mThreadConfig
            android.os.Handler r8 = r0.getSchedulerHandler()
            androidx.camera.camera2.internal.DisplayInfoManager r9 = r10.mDisplayInfoManager
            r3 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r1
        L27:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "The given camera id is not on the available camera id list."
            r11.<init>(r0)
            throw r11
    }

    @Override // androidx.camera.core.impl.CameraFactory
    @androidx.annotation.NonNull
    public androidx.camera.core.concurrent.CameraCoordinator getCameraCoordinator() {
            r1 = this;
            androidx.camera.core.concurrent.CameraCoordinator r0 = r1.mCameraCoordinator
            return r0
    }

    androidx.camera.camera2.internal.Camera2CameraInfoImpl getCameraInfo(@androidx.annotation.NonNull java.lang.String r3) throws androidx.camera.core.CameraUnavailableException {
            r2 = this;
            java.util.Map<java.lang.String, androidx.camera.camera2.internal.Camera2CameraInfoImpl> r0 = r2.mCameraInfos     // Catch: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L17
            java.lang.Object r0 = r0.get(r3)     // Catch: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L17
            androidx.camera.camera2.internal.Camera2CameraInfoImpl r0 = (androidx.camera.camera2.internal.Camera2CameraInfoImpl) r0     // Catch: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L17
            if (r0 != 0) goto L19
            androidx.camera.camera2.internal.Camera2CameraInfoImpl r0 = new androidx.camera.camera2.internal.Camera2CameraInfoImpl     // Catch: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L17
            androidx.camera.camera2.internal.compat.CameraManagerCompat r1 = r2.mCameraManager     // Catch: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L17
            r0.<init>(r3, r1)     // Catch: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L17
            java.util.Map<java.lang.String, androidx.camera.camera2.internal.Camera2CameraInfoImpl> r1 = r2.mCameraInfos     // Catch: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L17
            r1.put(r3, r0)     // Catch: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L17
            return r0
        L17:
            r3 = move-exception
            goto L1a
        L19:
            return r0
        L1a:
            androidx.camera.core.CameraUnavailableException r3 = androidx.camera.camera2.internal.CameraUnavailableExceptionHelper.createFrom(r3)
            throw r3
    }

    @Override // androidx.camera.core.impl.CameraFactory
    @androidx.annotation.NonNull
    public androidx.camera.camera2.internal.compat.CameraManagerCompat getCameraManager() {
            r1 = this;
            androidx.camera.camera2.internal.compat.CameraManagerCompat r0 = r1.mCameraManager
            return r0
    }

    @Override // androidx.camera.core.impl.CameraFactory
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ java.lang.Object getCameraManager() {
            r1 = this;
            androidx.camera.camera2.internal.compat.CameraManagerCompat r0 = r1.getCameraManager()
            return r0
    }
}
