package androidx.camera.camera2.internal.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class Camera2CameraCoordinator implements androidx.camera.core.concurrent.CameraCoordinator {
    private static final java.lang.String TAG = "Camera2CameraCoordinator";

    @androidx.annotation.NonNull
    private java.util.List<androidx.camera.core.CameraInfo> mActiveConcurrentCameraInfos;

    @androidx.annotation.NonNull
    private final androidx.camera.camera2.internal.compat.CameraManagerCompat mCameraManager;
    private int mCameraOperatingMode;

    @androidx.annotation.NonNull
    private final java.util.Map<java.lang.String, java.util.List<java.lang.String>> mConcurrentCameraIdMap;

    @androidx.annotation.NonNull
    private java.util.Set<java.util.Set<java.lang.String>> mConcurrentCameraIds;

    @androidx.annotation.NonNull
    private final java.util.List<androidx.camera.core.concurrent.CameraCoordinator.ConcurrentCameraModeListener> mConcurrentCameraModeListeners;

    public Camera2CameraCoordinator(@androidx.annotation.NonNull androidx.camera.camera2.internal.compat.CameraManagerCompat r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mCameraOperatingMode = r0
            r1.mCameraManager = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.mConcurrentCameraIdMap = r2
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r1.mConcurrentCameraIds = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.mConcurrentCameraModeListeners = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.mActiveConcurrentCameraInfos = r2
            r1.retrieveConcurrentCameraIds()
            return
    }

    public static /* synthetic */ java.util.List a(java.lang.String r2, java.util.List r3) {
            java.util.Iterator r3 = r3.iterator()
        L4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L23
            java.lang.Object r0 = r3.next()
            androidx.camera.core.CameraInfo r0 = (androidx.camera.core.CameraInfo) r0
            androidx.camera.camera2.interop.Camera2CameraInfo r1 = androidx.camera.camera2.interop.Camera2CameraInfo.from(r0)
            java.lang.String r1 = r1.getCameraId()
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L4
            java.util.List r2 = java.util.Collections.singletonList(r0)
            return r2
        L23:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "No camera can be find for id: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
    }

    @androidx.annotation.OptIn(markerClass = {androidx.camera.camera2.interop.ExperimentalCamera2Interop.class})
    private static androidx.camera.core.CameraSelector createCameraSelectorById(@androidx.annotation.NonNull androidx.camera.camera2.internal.compat.CameraManagerCompat r2, @androidx.annotation.NonNull java.lang.String r3) {
            androidx.camera.core.CameraSelector$Builder r0 = new androidx.camera.core.CameraSelector$Builder
            r0.<init>()
            c.a r1 = new c.a
            r1.<init>(r3)
            androidx.camera.core.CameraSelector$Builder r0 = r0.addCameraFilter(r1)
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r2 = r2.getCameraCharacteristicsCompat(r3)     // Catch: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L26
            android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.LENS_FACING     // Catch: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L26
            java.lang.Object r2 = r2.get(r3)     // Catch: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L26
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L26
            int r2 = r2.intValue()     // Catch: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L26
            r0.requireLensFacing(r2)     // Catch: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L26
            androidx.camera.core.CameraSelector r2 = r0.build()
            return r2
        L26:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            r3.<init>(r2)
            throw r3
    }

    private void retrieveConcurrentCameraIds() {
            r8 = this;
            androidx.camera.camera2.internal.compat.CameraManagerCompat r0 = r8.mCameraManager     // Catch: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L9
            java.util.Set r0 = r0.getConcurrentCameraIds()     // Catch: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L9
            r8.mConcurrentCameraIds = r0     // Catch: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L9
            goto L10
        L9:
            java.lang.String r0 = "Camera2CameraCoordinator"
            java.lang.String r1 = "Failed to get concurrent camera ids"
            androidx.camera.core.Logger.e(r0, r1)
        L10:
            java.util.Set<java.util.Set<java.lang.String>> r0 = r8.mConcurrentCameraIds
            java.util.Iterator r0 = r0.iterator()
        L16:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L83
            java.lang.Object r1 = r0.next()
            java.util.Set r1 = (java.util.Set) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            int r1 = r2.size()
            r3 = 2
            if (r1 < r3) goto L16
            r1 = 0
            java.lang.Object r3 = r2.get(r1)
            java.lang.String r3 = (java.lang.String) r3
            r4 = 1
            java.lang.Object r5 = r2.get(r4)
            java.lang.String r5 = (java.lang.String) r5
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r6 = r8.mConcurrentCameraIdMap
            boolean r6 = r6.containsKey(r3)
            if (r6 != 0) goto L4e
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r6 = r8.mConcurrentCameraIdMap
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r6.put(r3, r7)
        L4e:
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r6 = r8.mConcurrentCameraIdMap
            boolean r6 = r6.containsKey(r5)
            if (r6 != 0) goto L60
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r6 = r8.mConcurrentCameraIdMap
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r6.put(r5, r7)
        L60:
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r6 = r8.mConcurrentCameraIdMap
            java.lang.Object r3 = r6.get(r3)
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r4 = r2.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            r3.add(r4)
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r3 = r8.mConcurrentCameraIdMap
            java.lang.Object r3 = r3.get(r5)
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r1 = r2.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r3.add(r1)
            goto L16
        L83:
            return
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public void addListener(@androidx.annotation.NonNull androidx.camera.core.concurrent.CameraCoordinator.ConcurrentCameraModeListener r2) {
            r1 = this;
            java.util.List<androidx.camera.core.concurrent.CameraCoordinator$ConcurrentCameraModeListener> r0 = r1.mConcurrentCameraModeListeners
            r0.add(r2)
            return
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    @androidx.annotation.NonNull
    public java.util.List<androidx.camera.core.CameraInfo> getActiveConcurrentCameraInfos() {
            r1 = this;
            java.util.List<androidx.camera.core.CameraInfo> r0 = r1.mActiveConcurrentCameraInfos
            return r0
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public int getCameraOperatingMode() {
            r1 = this;
            int r0 = r1.mCameraOperatingMode
            return r0
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    @androidx.annotation.NonNull
    public java.util.List<java.util.List<androidx.camera.core.CameraSelector>> getConcurrentCameraSelectors() {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Set<java.util.Set<java.lang.String>> r1 = r6.mConcurrentCameraIds
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3a
            java.lang.Object r2 = r1.next()
            java.util.Set r2 = (java.util.Set) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L20:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L36
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            androidx.camera.camera2.internal.compat.CameraManagerCompat r5 = r6.mCameraManager
            androidx.camera.core.CameraSelector r4 = createCameraSelectorById(r5, r4)
            r3.add(r4)
            goto L20
        L36:
            r0.add(r3)
            goto Lb
        L3a:
            return r0
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    @androidx.annotation.Nullable
    @androidx.annotation.OptIn(markerClass = {androidx.camera.camera2.interop.ExperimentalCamera2Interop.class})
    public java.lang.String getPairedConcurrentCameraId(@androidx.annotation.NonNull java.lang.String r5) {
            r4 = this;
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r0 = r4.mConcurrentCameraIdMap
            boolean r0 = r0.containsKey(r5)
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r0 = r4.mConcurrentCameraIdMap
            java.lang.Object r5 = r0.get(r5)
            java.util.List r5 = (java.util.List) r5
            java.util.Iterator r5 = r5.iterator()
        L16:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L43
            java.lang.Object r0 = r5.next()
            java.lang.String r0 = (java.lang.String) r0
            java.util.List<androidx.camera.core.CameraInfo> r2 = r4.mActiveConcurrentCameraInfos
            java.util.Iterator r2 = r2.iterator()
        L28:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L16
            java.lang.Object r3 = r2.next()
            androidx.camera.core.CameraInfo r3 = (androidx.camera.core.CameraInfo) r3
            androidx.camera.camera2.interop.Camera2CameraInfo r3 = androidx.camera.camera2.interop.Camera2CameraInfo.from(r3)
            java.lang.String r3 = r3.getCameraId()
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L28
            return r0
        L43:
            return r1
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public void removeListener(@androidx.annotation.NonNull androidx.camera.core.concurrent.CameraCoordinator.ConcurrentCameraModeListener r2) {
            r1 = this;
            java.util.List<androidx.camera.core.concurrent.CameraCoordinator$ConcurrentCameraModeListener> r0 = r1.mConcurrentCameraModeListeners
            r0.remove(r2)
            return
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public void setActiveConcurrentCameraInfos(@androidx.annotation.NonNull java.util.List<androidx.camera.core.CameraInfo> r2) {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r1.mActiveConcurrentCameraInfos = r0
            return
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public void setCameraOperatingMode(int r4) {
            r3 = this;
            int r0 = r3.mCameraOperatingMode
            if (r4 == r0) goto L1c
            java.util.List<androidx.camera.core.concurrent.CameraCoordinator$ConcurrentCameraModeListener> r0 = r3.mConcurrentCameraModeListeners
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            androidx.camera.core.concurrent.CameraCoordinator$ConcurrentCameraModeListener r1 = (androidx.camera.core.concurrent.CameraCoordinator.ConcurrentCameraModeListener) r1
            int r2 = r3.mCameraOperatingMode
            r1.onCameraOperatingModeUpdated(r2, r4)
            goto La
        L1c:
            int r0 = r3.mCameraOperatingMode
            r1 = 2
            if (r0 != r1) goto L28
            if (r4 == r1) goto L28
            java.util.List<androidx.camera.core.CameraInfo> r0 = r3.mActiveConcurrentCameraInfos
            r0.clear()
        L28:
            r3.mCameraOperatingMode = r4
            return
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public void shutdown() {
            r1 = this;
            java.util.List<androidx.camera.core.concurrent.CameraCoordinator$ConcurrentCameraModeListener> r0 = r1.mConcurrentCameraModeListeners
            r0.clear()
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r0 = r1.mConcurrentCameraIdMap
            r0.clear()
            java.util.List<androidx.camera.core.CameraInfo> r0 = r1.mActiveConcurrentCameraInfos
            r0.clear()
            java.util.Set<java.util.Set<java.lang.String>> r0 = r1.mConcurrentCameraIds
            r0.clear()
            r0 = 0
            r1.mCameraOperatingMode = r0
            return
    }
}
