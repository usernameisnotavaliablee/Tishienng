package androidx.camera.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class LifecycleCamera implements androidx.lifecycle.LifecycleObserver, androidx.camera.core.Camera {
    private final androidx.camera.core.internal.CameraUseCaseAdapter mCameraUseCaseAdapter;

    @androidx.annotation.GuardedBy("mLock")
    private volatile boolean mIsActive;

    @androidx.annotation.GuardedBy("mLock")
    private final androidx.lifecycle.LifecycleOwner mLifecycleOwner;
    private final java.lang.Object mLock;

    @androidx.annotation.GuardedBy("mLock")
    private boolean mReleased;

    @androidx.annotation.GuardedBy("mLock")
    private boolean mSuspended;

    LifecycleCamera(androidx.lifecycle.LifecycleOwner r3, androidx.camera.core.internal.CameraUseCaseAdapter r4) {
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.mLock = r0
            r0 = 0
            r2.mIsActive = r0
            r2.mSuspended = r0
            r2.mReleased = r0
            r2.mLifecycleOwner = r3
            r2.mCameraUseCaseAdapter = r4
            androidx.lifecycle.Lifecycle r0 = r3.getLifecycle()
            androidx.lifecycle.Lifecycle$State r0 = r0.getCurrentState()
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.STARTED
            boolean r0 = r0.isAtLeast(r1)
            if (r0 == 0) goto L29
            r4.attachUseCases()
            goto L2c
        L29:
            r4.detachUseCases()
        L2c:
            androidx.lifecycle.Lifecycle r3 = r3.getLifecycle()
            r3.addObserver(r2)
            return
    }

    void bind(java.util.Collection<androidx.camera.core.UseCase> r3) throws androidx.camera.core.internal.CameraUseCaseAdapter.CameraException {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            androidx.camera.core.internal.CameraUseCaseAdapter r1 = r2.mCameraUseCaseAdapter     // Catch: java.lang.Throwable -> La
            r1.addUseCases(r3)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r3
    }

    @Override // androidx.camera.core.Camera
    @androidx.annotation.NonNull
    public androidx.camera.core.CameraControl getCameraControl() {
            r1 = this;
            androidx.camera.core.internal.CameraUseCaseAdapter r0 = r1.mCameraUseCaseAdapter
            androidx.camera.core.CameraControl r0 = r0.getCameraControl()
            return r0
    }

    @Override // androidx.camera.core.Camera
    @androidx.annotation.NonNull
    public androidx.camera.core.CameraInfo getCameraInfo() {
            r1 = this;
            androidx.camera.core.internal.CameraUseCaseAdapter r0 = r1.mCameraUseCaseAdapter
            androidx.camera.core.CameraInfo r0 = r0.getCameraInfo()
            return r0
    }

    @Override // androidx.camera.core.Camera
    @androidx.annotation.NonNull
    public java.util.LinkedHashSet<androidx.camera.core.impl.CameraInternal> getCameraInternals() {
            r1 = this;
            androidx.camera.core.internal.CameraUseCaseAdapter r0 = r1.mCameraUseCaseAdapter
            java.util.LinkedHashSet r0 = r0.getCameraInternals()
            return r0
    }

    public androidx.camera.core.internal.CameraUseCaseAdapter getCameraUseCaseAdapter() {
            r1 = this;
            androidx.camera.core.internal.CameraUseCaseAdapter r0 = r1.mCameraUseCaseAdapter
            return r0
    }

    @Override // androidx.camera.core.Camera
    @androidx.annotation.NonNull
    public androidx.camera.core.impl.CameraConfig getExtendedConfig() {
            r1 = this;
            androidx.camera.core.internal.CameraUseCaseAdapter r0 = r1.mCameraUseCaseAdapter
            androidx.camera.core.impl.CameraConfig r0 = r0.getExtendedConfig()
            return r0
    }

    public androidx.lifecycle.LifecycleOwner getLifecycleOwner() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            androidx.lifecycle.LifecycleOwner r1 = r2.mLifecycleOwner     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    @androidx.annotation.NonNull
    public java.util.List<androidx.camera.core.UseCase> getUseCases() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            androidx.camera.core.internal.CameraUseCaseAdapter r1 = r2.mCameraUseCaseAdapter     // Catch: java.lang.Throwable -> Lf
            java.util.List r1 = r1.getUseCases()     // Catch: java.lang.Throwable -> Lf
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r1
        Lf:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    public boolean isActive() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            boolean r1 = r2.mIsActive     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public boolean isBound(@androidx.annotation.NonNull androidx.camera.core.UseCase r3) {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            androidx.camera.core.internal.CameraUseCaseAdapter r1 = r2.mCameraUseCaseAdapter     // Catch: java.lang.Throwable -> Lf
            java.util.List r1 = r1.getUseCases()     // Catch: java.lang.Throwable -> Lf
            boolean r3 = r1.contains(r3)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r3
        Lf:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r3
    }

    @Override // androidx.camera.core.Camera
    public boolean isUseCasesCombinationSupported(@androidx.annotation.NonNull androidx.camera.core.UseCase... r2) {
            r1 = this;
            androidx.camera.core.internal.CameraUseCaseAdapter r0 = r1.mCameraUseCaseAdapter
            boolean r2 = r0.isUseCasesCombinationSupported(r2)
            return r2
    }

    @androidx.lifecycle.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_DESTROY)
    public void onDestroy(androidx.lifecycle.LifecycleOwner r3) {
            r2 = this;
            java.lang.Object r3 = r2.mLock
            monitor-enter(r3)
            androidx.camera.core.internal.CameraUseCaseAdapter r0 = r2.mCameraUseCaseAdapter     // Catch: java.lang.Throwable -> Le
            java.util.List r1 = r0.getUseCases()     // Catch: java.lang.Throwable -> Le
            r0.removeUseCases(r1)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Le
            return
        Le:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Le
            throw r0
    }

    @androidx.lifecycle.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_PAUSE)
    public void onPause(androidx.lifecycle.LifecycleOwner r2) {
            r1 = this;
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r2 < r0) goto Lc
            androidx.camera.core.internal.CameraUseCaseAdapter r2 = r1.mCameraUseCaseAdapter
            r0 = 0
            r2.setActiveResumingMode(r0)
        Lc:
            return
    }

    @androidx.lifecycle.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_RESUME)
    public void onResume(androidx.lifecycle.LifecycleOwner r2) {
            r1 = this;
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r2 < r0) goto Lc
            androidx.camera.core.internal.CameraUseCaseAdapter r2 = r1.mCameraUseCaseAdapter
            r0 = 1
            r2.setActiveResumingMode(r0)
        Lc:
            return
    }

    @androidx.lifecycle.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_START)
    public void onStart(androidx.lifecycle.LifecycleOwner r2) {
            r1 = this;
            java.lang.Object r2 = r1.mLock
            monitor-enter(r2)
            boolean r0 = r1.mSuspended     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto L16
            boolean r0 = r1.mReleased     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto L16
            androidx.camera.core.internal.CameraUseCaseAdapter r0 = r1.mCameraUseCaseAdapter     // Catch: java.lang.Throwable -> L14
            r0.attachUseCases()     // Catch: java.lang.Throwable -> L14
            r0 = 1
            r1.mIsActive = r0     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            r0 = move-exception
            goto L18
        L16:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
            return
        L18:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
            throw r0
    }

    @androidx.lifecycle.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_STOP)
    public void onStop(androidx.lifecycle.LifecycleOwner r2) {
            r1 = this;
            java.lang.Object r2 = r1.mLock
            monitor-enter(r2)
            boolean r0 = r1.mSuspended     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto L16
            boolean r0 = r1.mReleased     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto L16
            androidx.camera.core.internal.CameraUseCaseAdapter r0 = r1.mCameraUseCaseAdapter     // Catch: java.lang.Throwable -> L14
            r0.detachUseCases()     // Catch: java.lang.Throwable -> L14
            r0 = 0
            r1.mIsActive = r0     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            r0 = move-exception
            goto L18
        L16:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
            return
        L18:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
            throw r0
    }

    void release() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            r1 = 1
            r2.mReleased = r1     // Catch: java.lang.Throwable -> L14
            r1 = 0
            r2.mIsActive = r1     // Catch: java.lang.Throwable -> L14
            androidx.lifecycle.LifecycleOwner r1 = r2.mLifecycleOwner     // Catch: java.lang.Throwable -> L14
            androidx.lifecycle.Lifecycle r1 = r1.getLifecycle()     // Catch: java.lang.Throwable -> L14
            r1.removeObserver(r2)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L14:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r1
    }

    @Override // androidx.camera.core.Camera
    public void setExtendedConfig(@androidx.annotation.Nullable androidx.camera.core.impl.CameraConfig r2) {
            r1 = this;
            androidx.camera.core.internal.CameraUseCaseAdapter r0 = r1.mCameraUseCaseAdapter
            r0.setExtendedConfig(r2)
            return
    }

    public void suspend() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            boolean r1 = r2.mSuspended     // Catch: java.lang.Throwable -> L9
            if (r1 == 0) goto Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r1 = move-exception
            goto L15
        Lb:
            androidx.lifecycle.LifecycleOwner r1 = r2.mLifecycleOwner     // Catch: java.lang.Throwable -> L9
            r2.onStop(r1)     // Catch: java.lang.Throwable -> L9
            r1 = 1
            r2.mSuspended = r1     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r1
    }

    void unbind(java.util.Collection<androidx.camera.core.UseCase> r3) {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L18
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L18
            androidx.camera.core.internal.CameraUseCaseAdapter r3 = r2.mCameraUseCaseAdapter     // Catch: java.lang.Throwable -> L18
            java.util.List r3 = r3.getUseCases()     // Catch: java.lang.Throwable -> L18
            r1.retainAll(r3)     // Catch: java.lang.Throwable -> L18
            androidx.camera.core.internal.CameraUseCaseAdapter r3 = r2.mCameraUseCaseAdapter     // Catch: java.lang.Throwable -> L18
            r3.removeUseCases(r1)     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return
        L18:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r3
    }

    void unbindAll() {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            androidx.camera.core.internal.CameraUseCaseAdapter r1 = r3.mCameraUseCaseAdapter     // Catch: java.lang.Throwable -> Le
            java.util.List r2 = r1.getUseCases()     // Catch: java.lang.Throwable -> Le
            r1.removeUseCases(r2)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    public void unsuspend() {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            boolean r1 = r3.mSuspended     // Catch: java.lang.Throwable -> L9
            if (r1 != 0) goto Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r1 = move-exception
            goto L27
        Lb:
            r1 = 0
            r3.mSuspended = r1     // Catch: java.lang.Throwable -> L9
            androidx.lifecycle.LifecycleOwner r1 = r3.mLifecycleOwner     // Catch: java.lang.Throwable -> L9
            androidx.lifecycle.Lifecycle r1 = r1.getLifecycle()     // Catch: java.lang.Throwable -> L9
            androidx.lifecycle.Lifecycle$State r1 = r1.getCurrentState()     // Catch: java.lang.Throwable -> L9
            androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.STARTED     // Catch: java.lang.Throwable -> L9
            boolean r1 = r1.isAtLeast(r2)     // Catch: java.lang.Throwable -> L9
            if (r1 == 0) goto L25
            androidx.lifecycle.LifecycleOwner r1 = r3.mLifecycleOwner     // Catch: java.lang.Throwable -> L9
            r3.onStart(r1)     // Catch: java.lang.Throwable -> L9
        L25:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L27:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r1
    }
}
