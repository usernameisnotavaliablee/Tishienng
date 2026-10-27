package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class CameraStateRegistry implements androidx.camera.core.concurrent.CameraCoordinator.ConcurrentCameraModeListener {
    private static final int MAX_ALLOWED_CONCURRENT_CAMERAS_IN_CONCURRENT_MODE = 2;
    private static final int MAX_ALLOWED_CONCURRENT_CAMERAS_IN_SINGLE_MODE = 1;
    private static final java.lang.String TAG = "CameraStateRegistry";

    @androidx.annotation.GuardedBy("mLock")
    private int mAvailableCameras;

    @androidx.annotation.GuardedBy("mLock")
    private final androidx.camera.core.concurrent.CameraCoordinator mCameraCoordinator;

    @androidx.annotation.GuardedBy("mLock")
    private final java.util.Map<androidx.camera.core.Camera, androidx.camera.core.impl.CameraStateRegistry.CameraRegistration> mCameraStates;
    private final java.lang.StringBuilder mDebugString;
    private final java.lang.Object mLock;
    private int mMaxAllowedOpenedCameras;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class CameraRegistration {
        private final java.util.concurrent.Executor mNotifyExecutor;
        private final androidx.camera.core.impl.CameraStateRegistry.OnConfigureAvailableListener mOnConfigureAvailableListener;
        private final androidx.camera.core.impl.CameraStateRegistry.OnOpenAvailableListener mOnOpenAvailableListener;
        private androidx.camera.core.impl.CameraInternal.State mState;

        CameraRegistration(@androidx.annotation.Nullable androidx.camera.core.impl.CameraInternal.State r1, @androidx.annotation.NonNull java.util.concurrent.Executor r2, @androidx.annotation.NonNull androidx.camera.core.impl.CameraStateRegistry.OnConfigureAvailableListener r3, @androidx.annotation.NonNull androidx.camera.core.impl.CameraStateRegistry.OnOpenAvailableListener r4) {
                r0 = this;
                r0.<init>()
                r0.mState = r1
                r0.mNotifyExecutor = r2
                r0.mOnConfigureAvailableListener = r3
                r0.mOnOpenAvailableListener = r4
                return
        }

        androidx.camera.core.impl.CameraInternal.State getState() {
                r1 = this;
                androidx.camera.core.impl.CameraInternal$State r0 = r1.mState
                return r0
        }

        void notifyOnConfigureAvailableListener() {
                r3 = this;
                java.util.concurrent.Executor r0 = r3.mNotifyExecutor     // Catch: java.util.concurrent.RejectedExecutionException -> L10
                androidx.camera.core.impl.CameraStateRegistry$OnConfigureAvailableListener r1 = r3.mOnConfigureAvailableListener     // Catch: java.util.concurrent.RejectedExecutionException -> L10
                java.util.Objects.requireNonNull(r1)     // Catch: java.util.concurrent.RejectedExecutionException -> L10
                androidx.camera.core.impl.n r2 = new androidx.camera.core.impl.n     // Catch: java.util.concurrent.RejectedExecutionException -> L10
                r2.<init>(r1)     // Catch: java.util.concurrent.RejectedExecutionException -> L10
                r0.execute(r2)     // Catch: java.util.concurrent.RejectedExecutionException -> L10
                return
            L10:
                r0 = move-exception
                java.lang.String r1 = "CameraStateRegistry"
                java.lang.String r2 = "Unable to notify camera to configure."
                androidx.camera.core.Logger.e(r1, r2, r0)
                return
        }

        void notifyOnOpenAvailableListener() {
                r3 = this;
                java.util.concurrent.Executor r0 = r3.mNotifyExecutor     // Catch: java.util.concurrent.RejectedExecutionException -> L10
                androidx.camera.core.impl.CameraStateRegistry$OnOpenAvailableListener r1 = r3.mOnOpenAvailableListener     // Catch: java.util.concurrent.RejectedExecutionException -> L10
                java.util.Objects.requireNonNull(r1)     // Catch: java.util.concurrent.RejectedExecutionException -> L10
                androidx.camera.core.impl.m r2 = new androidx.camera.core.impl.m     // Catch: java.util.concurrent.RejectedExecutionException -> L10
                r2.<init>(r1)     // Catch: java.util.concurrent.RejectedExecutionException -> L10
                r0.execute(r2)     // Catch: java.util.concurrent.RejectedExecutionException -> L10
                return
            L10:
                r0 = move-exception
                java.lang.String r1 = "CameraStateRegistry"
                java.lang.String r2 = "Unable to notify camera to open."
                androidx.camera.core.Logger.e(r1, r2, r0)
                return
        }

        androidx.camera.core.impl.CameraInternal.State setState(@androidx.annotation.Nullable androidx.camera.core.impl.CameraInternal.State r2) {
                r1 = this;
                androidx.camera.core.impl.CameraInternal$State r0 = r1.mState
                r1.mState = r2
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnConfigureAvailableListener {
        void onConfigureAvailable();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnOpenAvailableListener {
        void onOpenAvailable();
    }

    public CameraStateRegistry(@androidx.annotation.NonNull androidx.camera.core.concurrent.CameraCoordinator r3, int r4) {
            r2 = this;
            r2.<init>()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r2.mDebugString = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.mLock = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2.mCameraStates = r1
            r2.mMaxAllowedOpenedCameras = r4
            monitor-enter(r0)
            r2.mCameraCoordinator = r3     // Catch: java.lang.Throwable -> L23
            int r3 = r2.mMaxAllowedOpenedCameras     // Catch: java.lang.Throwable -> L23
            r2.mAvailableCameras = r3     // Catch: java.lang.Throwable -> L23
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            return
        L23:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            throw r3
    }

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("mLock")
    private androidx.camera.core.impl.CameraStateRegistry.CameraRegistration getCameraRegistration(@androidx.annotation.NonNull java.lang.String r4) {
            r3 = this;
            java.util.Map<androidx.camera.core.Camera, androidx.camera.core.impl.CameraStateRegistry$CameraRegistration> r0 = r3.mCameraStates
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r0.next()
            androidx.camera.core.Camera r1 = (androidx.camera.core.Camera) r1
            androidx.camera.core.CameraInfo r2 = r1.getCameraInfo()
            androidx.camera.core.impl.CameraInfoInternal r2 = (androidx.camera.core.impl.CameraInfoInternal) r2
            java.lang.String r2 = r2.getCameraId()
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto La
            java.util.Map<androidx.camera.core.Camera, androidx.camera.core.impl.CameraStateRegistry$CameraRegistration> r4 = r3.mCameraStates
            java.lang.Object r4 = r4.get(r1)
            androidx.camera.core.impl.CameraStateRegistry$CameraRegistration r4 = (androidx.camera.core.impl.CameraStateRegistry.CameraRegistration) r4
            return r4
        L2f:
            r4 = 0
            return r4
    }

    private static boolean isOpen(@androidx.annotation.Nullable androidx.camera.core.impl.CameraInternal.State r0) {
            if (r0 == 0) goto La
            boolean r0 = r0.holdsCameraSlot()
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    @androidx.annotation.GuardedBy("mLock")
    @androidx.annotation.WorkerThread
    private void recalculateAvailableCameras() {
            r14 = this;
            java.lang.String r0 = "CameraStateRegistry"
            boolean r1 = androidx.camera.core.Logger.isDebugEnabled(r0)
            r2 = 2
            r3 = 1
            java.lang.String r4 = "-------------------------------------------------------------------\n"
            java.lang.String r5 = "%-45s%-22s\n"
            r6 = 0
            if (r1 == 0) goto L35
            java.lang.StringBuilder r1 = r14.mDebugString
            r1.setLength(r6)
            java.lang.StringBuilder r1 = r14.mDebugString
            java.lang.String r7 = "Recalculating open cameras:\n"
            r1.append(r7)
            java.lang.StringBuilder r1 = r14.mDebugString
            java.util.Locale r7 = java.util.Locale.US
            java.lang.Object[] r8 = new java.lang.Object[r2]
            java.lang.String r9 = "Camera"
            r8[r6] = r9
            java.lang.String r9 = "State"
            r8[r3] = r9
            java.lang.String r7 = java.lang.String.format(r7, r5, r8)
            r1.append(r7)
            java.lang.StringBuilder r1 = r14.mDebugString
            r1.append(r4)
        L35:
            java.util.Map<androidx.camera.core.Camera, androidx.camera.core.impl.CameraStateRegistry$CameraRegistration> r1 = r14.mCameraStates
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
            r7 = 0
        L40:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto L9d
            java.lang.Object r8 = r1.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            boolean r9 = androidx.camera.core.Logger.isDebugEnabled(r0)
            if (r9 == 0) goto L8a
            java.lang.Object r9 = r8.getValue()
            androidx.camera.core.impl.CameraStateRegistry$CameraRegistration r9 = (androidx.camera.core.impl.CameraStateRegistry.CameraRegistration) r9
            androidx.camera.core.impl.CameraInternal$State r9 = r9.getState()
            if (r9 == 0) goto L6d
            java.lang.Object r9 = r8.getValue()
            androidx.camera.core.impl.CameraStateRegistry$CameraRegistration r9 = (androidx.camera.core.impl.CameraStateRegistry.CameraRegistration) r9
            androidx.camera.core.impl.CameraInternal$State r9 = r9.getState()
            java.lang.String r9 = r9.toString()
            goto L6f
        L6d:
            java.lang.String r9 = "UNKNOWN"
        L6f:
            java.lang.StringBuilder r10 = r14.mDebugString
            java.util.Locale r11 = java.util.Locale.US
            java.lang.Object r12 = r8.getKey()
            androidx.camera.core.Camera r12 = (androidx.camera.core.Camera) r12
            java.lang.String r12 = r12.toString()
            java.lang.Object[] r13 = new java.lang.Object[r2]
            r13[r6] = r12
            r13[r3] = r9
            java.lang.String r9 = java.lang.String.format(r11, r5, r13)
            r10.append(r9)
        L8a:
            java.lang.Object r8 = r8.getValue()
            androidx.camera.core.impl.CameraStateRegistry$CameraRegistration r8 = (androidx.camera.core.impl.CameraStateRegistry.CameraRegistration) r8
            androidx.camera.core.impl.CameraInternal$State r8 = r8.getState()
            boolean r8 = isOpen(r8)
            if (r8 == 0) goto L40
            int r7 = r7 + 1
            goto L40
        L9d:
            boolean r1 = androidx.camera.core.Logger.isDebugEnabled(r0)
            if (r1 == 0) goto Lce
            java.lang.StringBuilder r1 = r14.mDebugString
            r1.append(r4)
            java.lang.StringBuilder r1 = r14.mDebugString
            java.util.Locale r4 = java.util.Locale.US
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            int r8 = r14.mMaxAllowedOpenedCameras
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r6] = r5
            r2[r3] = r8
            java.lang.String r3 = "Open count: %d (Max allowed: %d)"
            java.lang.String r2 = java.lang.String.format(r4, r3, r2)
            r1.append(r2)
            java.lang.StringBuilder r1 = r14.mDebugString
            java.lang.String r1 = r1.toString()
            androidx.camera.core.Logger.d(r0, r1)
        Lce:
            int r0 = r14.mMaxAllowedOpenedCameras
            int r0 = r0 - r7
            int r0 = java.lang.Math.max(r0, r6)
            r14.mAvailableCameras = r0
            return
    }

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("mLock")
    private androidx.camera.core.impl.CameraInternal.State unregisterCamera(@androidx.annotation.NonNull androidx.camera.core.Camera r2) {
            r1 = this;
            java.util.Map<androidx.camera.core.Camera, androidx.camera.core.impl.CameraStateRegistry$CameraRegistration> r0 = r1.mCameraStates
            java.lang.Object r2 = r0.remove(r2)
            androidx.camera.core.impl.CameraStateRegistry$CameraRegistration r2 = (androidx.camera.core.impl.CameraStateRegistry.CameraRegistration) r2
            if (r2 == 0) goto L12
            r1.recalculateAvailableCameras()
            androidx.camera.core.impl.CameraInternal$State r2 = r2.getState()
            return r2
        L12:
            r2 = 0
            return r2
    }

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("mLock")
    private androidx.camera.core.impl.CameraInternal.State updateAndVerifyState(@androidx.annotation.NonNull androidx.camera.core.Camera r3, @androidx.annotation.NonNull androidx.camera.core.impl.CameraInternal.State r4) {
            r2 = this;
            java.util.Map<androidx.camera.core.Camera, androidx.camera.core.impl.CameraStateRegistry$CameraRegistration> r0 = r2.mCameraStates
            java.lang.Object r3 = r0.get(r3)
            androidx.camera.core.impl.CameraStateRegistry$CameraRegistration r3 = (androidx.camera.core.impl.CameraStateRegistry.CameraRegistration) r3
            java.lang.String r0 = "Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()"
            java.lang.Object r3 = androidx.core.util.Preconditions.checkNotNull(r3, r0)
            androidx.camera.core.impl.CameraStateRegistry$CameraRegistration r3 = (androidx.camera.core.impl.CameraStateRegistry.CameraRegistration) r3
            androidx.camera.core.impl.CameraInternal$State r3 = r3.setState(r4)
            androidx.camera.core.impl.CameraInternal$State r0 = androidx.camera.core.impl.CameraInternal.State.OPENING
            if (r4 != r0) goto L29
            boolean r1 = isOpen(r4)
            if (r1 != 0) goto L23
            if (r3 != r0) goto L21
            goto L23
        L21:
            r0 = 0
            goto L24
        L23:
            r0 = 1
        L24:
            java.lang.String r1 = "Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()"
            androidx.core.util.Preconditions.checkState(r0, r1)
        L29:
            if (r3 == r4) goto L2e
            r2.recalculateAvailableCameras()
        L2e:
            return r3
    }

    public boolean isCameraClosing() {
            r4 = this;
            java.lang.Object r0 = r4.mLock
            monitor-enter(r0)
            java.util.Map<androidx.camera.core.Camera, androidx.camera.core.impl.CameraStateRegistry$CameraRegistration> r1 = r4.mCameraStates     // Catch: java.lang.Throwable -> L2a
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L2a
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L2a
        Ld:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L2a
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L2a
            androidx.camera.core.impl.CameraStateRegistry$CameraRegistration r2 = (androidx.camera.core.impl.CameraStateRegistry.CameraRegistration) r2     // Catch: java.lang.Throwable -> L2a
            androidx.camera.core.impl.CameraInternal$State r2 = r2.getState()     // Catch: java.lang.Throwable -> L2a
            androidx.camera.core.impl.CameraInternal$State r3 = androidx.camera.core.impl.CameraInternal.State.CLOSING     // Catch: java.lang.Throwable -> L2a
            if (r2 != r3) goto Ld
            r1 = 1
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            return r1
        L2a:
            r1 = move-exception
            goto L2f
        L2c:
            r1 = 0
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            return r1
        L2f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            throw r1
    }

    public void markCameraState(@androidx.annotation.NonNull androidx.camera.core.Camera r2, @androidx.annotation.NonNull androidx.camera.core.impl.CameraInternal.State r3) {
            r1 = this;
            r0 = 1
            r1.markCameraState(r2, r3, r0)
            return
    }

    public void markCameraState(@androidx.annotation.NonNull androidx.camera.core.Camera r7, @androidx.annotation.NonNull androidx.camera.core.impl.CameraInternal.State r8, boolean r9) {
            r6 = this;
            java.lang.Object r0 = r6.mLock
            monitor-enter(r0)
            int r1 = r6.mAvailableCameras     // Catch: java.lang.Throwable -> Le
            androidx.camera.core.impl.CameraInternal$State r2 = androidx.camera.core.impl.CameraInternal.State.RELEASED     // Catch: java.lang.Throwable -> Le
            if (r8 != r2) goto L11
            androidx.camera.core.impl.CameraInternal$State r2 = r6.unregisterCamera(r7)     // Catch: java.lang.Throwable -> Le
            goto L15
        Le:
            r7 = move-exception
            goto Lbf
        L11:
            androidx.camera.core.impl.CameraInternal$State r2 = r6.updateAndVerifyState(r7, r8)     // Catch: java.lang.Throwable -> Le
        L15:
            if (r2 != r8) goto L19
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return
        L19:
            androidx.camera.core.concurrent.CameraCoordinator r2 = r6.mCameraCoordinator     // Catch: java.lang.Throwable -> Le
            int r2 = r2.getCameraOperatingMode()     // Catch: java.lang.Throwable -> Le
            r3 = 2
            r4 = 0
            if (r2 != r3) goto L3e
            androidx.camera.core.impl.CameraInternal$State r2 = androidx.camera.core.impl.CameraInternal.State.CONFIGURED     // Catch: java.lang.Throwable -> Le
            if (r8 != r2) goto L3e
            androidx.camera.core.CameraInfo r2 = r7.getCameraInfo()     // Catch: java.lang.Throwable -> Le
            androidx.camera.core.impl.CameraInfoInternal r2 = (androidx.camera.core.impl.CameraInfoInternal) r2     // Catch: java.lang.Throwable -> Le
            java.lang.String r2 = r2.getCameraId()     // Catch: java.lang.Throwable -> Le
            androidx.camera.core.concurrent.CameraCoordinator r3 = r6.mCameraCoordinator     // Catch: java.lang.Throwable -> Le
            java.lang.String r2 = r3.getPairedConcurrentCameraId(r2)     // Catch: java.lang.Throwable -> Le
            if (r2 == 0) goto L3e
            androidx.camera.core.impl.CameraStateRegistry$CameraRegistration r2 = r6.getCameraRegistration(r2)     // Catch: java.lang.Throwable -> Le
            goto L3f
        L3e:
            r2 = r4
        L3f:
            r3 = 1
            if (r1 >= r3) goto L7f
            int r1 = r6.mAvailableCameras     // Catch: java.lang.Throwable -> Le
            if (r1 <= 0) goto L7f
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> Le
            r4.<init>()     // Catch: java.lang.Throwable -> Le
            java.util.Map<androidx.camera.core.Camera, androidx.camera.core.impl.CameraStateRegistry$CameraRegistration> r8 = r6.mCameraStates     // Catch: java.lang.Throwable -> Le
            java.util.Set r8 = r8.entrySet()     // Catch: java.lang.Throwable -> Le
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> Le
        L55:
            boolean r1 = r8.hasNext()     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L97
            java.lang.Object r1 = r8.next()     // Catch: java.lang.Throwable -> Le
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> Le
            java.lang.Object r3 = r1.getValue()     // Catch: java.lang.Throwable -> Le
            androidx.camera.core.impl.CameraStateRegistry$CameraRegistration r3 = (androidx.camera.core.impl.CameraStateRegistry.CameraRegistration) r3     // Catch: java.lang.Throwable -> Le
            androidx.camera.core.impl.CameraInternal$State r3 = r3.getState()     // Catch: java.lang.Throwable -> Le
            androidx.camera.core.impl.CameraInternal$State r5 = androidx.camera.core.impl.CameraInternal.State.PENDING_OPEN     // Catch: java.lang.Throwable -> Le
            if (r3 != r5) goto L55
            java.lang.Object r3 = r1.getKey()     // Catch: java.lang.Throwable -> Le
            androidx.camera.core.Camera r3 = (androidx.camera.core.Camera) r3     // Catch: java.lang.Throwable -> Le
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> Le
            androidx.camera.core.impl.CameraStateRegistry$CameraRegistration r1 = (androidx.camera.core.impl.CameraStateRegistry.CameraRegistration) r1     // Catch: java.lang.Throwable -> Le
            r4.put(r3, r1)     // Catch: java.lang.Throwable -> Le
            goto L55
        L7f:
            androidx.camera.core.impl.CameraInternal$State r1 = androidx.camera.core.impl.CameraInternal.State.PENDING_OPEN     // Catch: java.lang.Throwable -> Le
            if (r8 != r1) goto L97
            int r8 = r6.mAvailableCameras     // Catch: java.lang.Throwable -> Le
            if (r8 <= 0) goto L97
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> Le
            r4.<init>()     // Catch: java.lang.Throwable -> Le
            java.util.Map<androidx.camera.core.Camera, androidx.camera.core.impl.CameraStateRegistry$CameraRegistration> r8 = r6.mCameraStates     // Catch: java.lang.Throwable -> Le
            java.lang.Object r8 = r8.get(r7)     // Catch: java.lang.Throwable -> Le
            androidx.camera.core.impl.CameraStateRegistry$CameraRegistration r8 = (androidx.camera.core.impl.CameraStateRegistry.CameraRegistration) r8     // Catch: java.lang.Throwable -> Le
            r4.put(r7, r8)     // Catch: java.lang.Throwable -> Le
        L97:
            if (r4 == 0) goto L9e
            if (r9 != 0) goto L9e
            r4.remove(r7)     // Catch: java.lang.Throwable -> Le
        L9e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            if (r4 == 0) goto Lb9
            java.util.Collection r7 = r4.values()
            java.util.Iterator r7 = r7.iterator()
        La9:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lb9
            java.lang.Object r8 = r7.next()
            androidx.camera.core.impl.CameraStateRegistry$CameraRegistration r8 = (androidx.camera.core.impl.CameraStateRegistry.CameraRegistration) r8
            r8.notifyOnOpenAvailableListener()
            goto La9
        Lb9:
            if (r2 == 0) goto Lbe
            r2.notifyOnConfigureAvailableListener()
        Lbe:
            return
        Lbf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r7
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator.ConcurrentCameraModeListener
    public void onCameraOperatingModeUpdated(int r6, int r7) {
            r5 = this;
            java.lang.Object r0 = r5.mLock
            monitor-enter(r0)
            r1 = 1
            r2 = 2
            if (r7 != r2) goto L9
            r3 = 2
            goto La
        L9:
            r3 = 1
        La:
            r5.mMaxAllowedOpenedCameras = r3     // Catch: java.lang.Throwable -> L23
            r3 = 0
            if (r6 == r2) goto L13
            if (r7 != r2) goto L13
            r4 = 1
            goto L14
        L13:
            r4 = 0
        L14:
            if (r6 != r2) goto L19
            if (r7 == r2) goto L19
            goto L1a
        L19:
            r1 = 0
        L1a:
            if (r4 != 0) goto L1e
            if (r1 == 0) goto L21
        L1e:
            r5.recalculateAvailableCameras()     // Catch: java.lang.Throwable -> L23
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            return
        L23:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            throw r6
    }

    public void registerCamera(@androidx.annotation.NonNull androidx.camera.core.Camera r5, @androidx.annotation.NonNull java.util.concurrent.Executor r6, @androidx.annotation.NonNull androidx.camera.core.impl.CameraStateRegistry.OnConfigureAvailableListener r7, @androidx.annotation.NonNull androidx.camera.core.impl.CameraStateRegistry.OnOpenAvailableListener r8) {
            r4 = this;
            java.lang.Object r0 = r4.mLock
            monitor-enter(r0)
            java.util.Map<androidx.camera.core.Camera, androidx.camera.core.impl.CameraStateRegistry$CameraRegistration> r1 = r4.mCameraStates     // Catch: java.lang.Throwable -> L2c
            boolean r1 = r1.containsKey(r5)     // Catch: java.lang.Throwable -> L2c
            r1 = r1 ^ 1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2c
            r2.<init>()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r3 = "Camera is already registered: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L2c
            r2.append(r5)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L2c
            androidx.core.util.Preconditions.checkState(r1, r2)     // Catch: java.lang.Throwable -> L2c
            java.util.Map<androidx.camera.core.Camera, androidx.camera.core.impl.CameraStateRegistry$CameraRegistration> r1 = r4.mCameraStates     // Catch: java.lang.Throwable -> L2c
            androidx.camera.core.impl.CameraStateRegistry$CameraRegistration r2 = new androidx.camera.core.impl.CameraStateRegistry$CameraRegistration     // Catch: java.lang.Throwable -> L2c
            r3 = 0
            r2.<init>(r3, r6, r7, r8)     // Catch: java.lang.Throwable -> L2c
            r1.put(r5, r2)     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            return
        L2c:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            throw r5
    }

    public boolean tryOpenCamera(@androidx.annotation.NonNull androidx.camera.core.Camera r12) {
            r11 = this;
            java.lang.Object r0 = r11.mLock
            monitor-enter(r0)
            java.util.Map<androidx.camera.core.Camera, androidx.camera.core.impl.CameraStateRegistry$CameraRegistration> r1 = r11.mCameraStates     // Catch: java.lang.Throwable -> L53
            java.lang.Object r1 = r1.get(r12)     // Catch: java.lang.Throwable -> L53
            androidx.camera.core.impl.CameraStateRegistry$CameraRegistration r1 = (androidx.camera.core.impl.CameraStateRegistry.CameraRegistration) r1     // Catch: java.lang.Throwable -> L53
            java.lang.String r2 = "Camera must first be registered with registerCamera()"
            java.lang.Object r1 = androidx.core.util.Preconditions.checkNotNull(r1, r2)     // Catch: java.lang.Throwable -> L53
            androidx.camera.core.impl.CameraStateRegistry$CameraRegistration r1 = (androidx.camera.core.impl.CameraStateRegistry.CameraRegistration) r1     // Catch: java.lang.Throwable -> L53
            java.lang.String r2 = "CameraStateRegistry"
            boolean r2 = androidx.camera.core.Logger.isDebugEnabled(r2)     // Catch: java.lang.Throwable -> L53
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L55
            java.lang.StringBuilder r2 = r11.mDebugString     // Catch: java.lang.Throwable -> L53
            r2.setLength(r4)     // Catch: java.lang.Throwable -> L53
            java.lang.StringBuilder r2 = r11.mDebugString     // Catch: java.lang.Throwable -> L53
            java.util.Locale r5 = java.util.Locale.US     // Catch: java.lang.Throwable -> L53
            java.lang.String r6 = "tryOpenCamera(%s) [Available Cameras: %d, Already Open: %b (Previous state: %s)]"
            int r7 = r11.mAvailableCameras     // Catch: java.lang.Throwable -> L53
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L53
            androidx.camera.core.impl.CameraInternal$State r8 = r1.getState()     // Catch: java.lang.Throwable -> L53
            boolean r8 = isOpen(r8)     // Catch: java.lang.Throwable -> L53
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch: java.lang.Throwable -> L53
            androidx.camera.core.impl.CameraInternal$State r9 = r1.getState()     // Catch: java.lang.Throwable -> L53
            r10 = 4
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch: java.lang.Throwable -> L53
            r10[r4] = r12     // Catch: java.lang.Throwable -> L53
            r10[r3] = r7     // Catch: java.lang.Throwable -> L53
            r12 = 2
            r10[r12] = r8     // Catch: java.lang.Throwable -> L53
            r12 = 3
            r10[r12] = r9     // Catch: java.lang.Throwable -> L53
            java.lang.String r12 = java.lang.String.format(r5, r6, r10)     // Catch: java.lang.Throwable -> L53
            r2.append(r12)     // Catch: java.lang.Throwable -> L53
            goto L55
        L53:
            r12 = move-exception
            goto L9e
        L55:
            int r12 = r11.mAvailableCameras     // Catch: java.lang.Throwable -> L53
            if (r12 > 0) goto L66
            androidx.camera.core.impl.CameraInternal$State r12 = r1.getState()     // Catch: java.lang.Throwable -> L53
            boolean r12 = isOpen(r12)     // Catch: java.lang.Throwable -> L53
            if (r12 == 0) goto L64
            goto L66
        L64:
            r12 = 0
            goto L6c
        L66:
            androidx.camera.core.impl.CameraInternal$State r12 = androidx.camera.core.impl.CameraInternal.State.OPENING     // Catch: java.lang.Throwable -> L53
            r1.setState(r12)     // Catch: java.lang.Throwable -> L53
            r12 = 1
        L6c:
            java.lang.String r1 = "CameraStateRegistry"
            boolean r1 = androidx.camera.core.Logger.isDebugEnabled(r1)     // Catch: java.lang.Throwable -> L53
            if (r1 == 0) goto L97
            java.lang.StringBuilder r1 = r11.mDebugString     // Catch: java.lang.Throwable -> L53
            java.util.Locale r2 = java.util.Locale.US     // Catch: java.lang.Throwable -> L53
            java.lang.String r5 = " --> %s"
            if (r12 == 0) goto L7f
            java.lang.String r6 = "SUCCESS"
            goto L81
        L7f:
            java.lang.String r6 = "FAIL"
        L81:
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L53
            r3[r4] = r6     // Catch: java.lang.Throwable -> L53
            java.lang.String r2 = java.lang.String.format(r2, r5, r3)     // Catch: java.lang.Throwable -> L53
            r1.append(r2)     // Catch: java.lang.Throwable -> L53
            java.lang.String r1 = "CameraStateRegistry"
            java.lang.StringBuilder r2 = r11.mDebugString     // Catch: java.lang.Throwable -> L53
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L53
            androidx.camera.core.Logger.d(r1, r2)     // Catch: java.lang.Throwable -> L53
        L97:
            if (r12 == 0) goto L9c
            r11.recalculateAvailableCameras()     // Catch: java.lang.Throwable -> L53
        L9c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L53
            return r12
        L9e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L53
            throw r12
    }

    public boolean tryOpenCaptureSession(@androidx.annotation.NonNull java.lang.String r6, @androidx.annotation.Nullable java.lang.String r7) {
            r5 = this;
            java.lang.Object r0 = r5.mLock
            monitor-enter(r0)
            androidx.camera.core.concurrent.CameraCoordinator r1 = r5.mCameraCoordinator     // Catch: java.lang.Throwable -> Lf
            int r1 = r1.getCameraOperatingMode()     // Catch: java.lang.Throwable -> Lf
            r2 = 2
            r3 = 1
            if (r1 == r2) goto L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r3
        Lf:
            r6 = move-exception
            goto L61
        L11:
            androidx.camera.core.impl.CameraStateRegistry$CameraRegistration r1 = r5.getCameraRegistration(r6)     // Catch: java.lang.Throwable -> Lf
            r2 = 0
            if (r1 == 0) goto L21
            androidx.camera.core.impl.CameraStateRegistry$CameraRegistration r6 = r5.getCameraRegistration(r6)     // Catch: java.lang.Throwable -> Lf
            androidx.camera.core.impl.CameraInternal$State r6 = r6.getState()     // Catch: java.lang.Throwable -> Lf
            goto L22
        L21:
            r6 = r2
        L22:
            if (r7 == 0) goto L32
            androidx.camera.core.impl.CameraStateRegistry$CameraRegistration r1 = r5.getCameraRegistration(r7)     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto L32
            androidx.camera.core.impl.CameraStateRegistry$CameraRegistration r7 = r5.getCameraRegistration(r7)     // Catch: java.lang.Throwable -> Lf
            androidx.camera.core.impl.CameraInternal$State r2 = r7.getState()     // Catch: java.lang.Throwable -> Lf
        L32:
            androidx.camera.core.impl.CameraInternal$State r7 = androidx.camera.core.impl.CameraInternal.State.OPEN     // Catch: java.lang.Throwable -> Lf
            boolean r1 = r7.equals(r6)     // Catch: java.lang.Throwable -> Lf
            r4 = 0
            if (r1 != 0) goto L46
            androidx.camera.core.impl.CameraInternal$State r1 = androidx.camera.core.impl.CameraInternal.State.CONFIGURED     // Catch: java.lang.Throwable -> Lf
            boolean r6 = r1.equals(r6)     // Catch: java.lang.Throwable -> Lf
            if (r6 == 0) goto L44
            goto L46
        L44:
            r6 = 0
            goto L47
        L46:
            r6 = 1
        L47:
            boolean r7 = r7.equals(r2)     // Catch: java.lang.Throwable -> Lf
            if (r7 != 0) goto L58
            androidx.camera.core.impl.CameraInternal$State r7 = androidx.camera.core.impl.CameraInternal.State.CONFIGURED     // Catch: java.lang.Throwable -> Lf
            boolean r7 = r7.equals(r2)     // Catch: java.lang.Throwable -> Lf
            if (r7 == 0) goto L56
            goto L58
        L56:
            r7 = 0
            goto L59
        L58:
            r7 = 1
        L59:
            if (r6 == 0) goto L5e
            if (r7 == 0) goto L5e
            goto L5f
        L5e:
            r3 = 0
        L5f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r3
        L61:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r6
    }
}
