package androidx.camera.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class LifecycleCameraRepository {

    @androidx.annotation.GuardedBy("mLock")
    private final java.util.ArrayDeque<androidx.lifecycle.LifecycleOwner> mActiveLifecycleOwners;

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("mLock")
    androidx.camera.core.concurrent.CameraCoordinator mCameraCoordinator;

    @androidx.annotation.GuardedBy("mLock")
    private final java.util.Map<androidx.camera.lifecycle.LifecycleCameraRepository.Key, androidx.camera.lifecycle.LifecycleCamera> mCameraMap;

    @androidx.annotation.GuardedBy("mLock")
    private final java.util.Map<androidx.camera.lifecycle.LifecycleCameraRepository.LifecycleCameraRepositoryObserver, java.util.Set<androidx.camera.lifecycle.LifecycleCameraRepository.Key>> mLifecycleObserverMap;
    private final java.lang.Object mLock;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.auto.value.AutoValue
    static abstract class Key {
        Key() {
                r0 = this;
                r0.<init>()
                return
        }

        static androidx.camera.lifecycle.LifecycleCameraRepository.Key create(@androidx.annotation.NonNull androidx.lifecycle.LifecycleOwner r1, @androidx.annotation.NonNull androidx.camera.core.internal.CameraUseCaseAdapter.CameraId r2) {
                androidx.camera.lifecycle.AutoValue_LifecycleCameraRepository_Key r0 = new androidx.camera.lifecycle.AutoValue_LifecycleCameraRepository_Key
                r0.<init>(r1, r2)
                return r0
        }

        @androidx.annotation.NonNull
        public abstract androidx.camera.core.internal.CameraUseCaseAdapter.CameraId getCameraId();

        @androidx.annotation.NonNull
        public abstract androidx.lifecycle.LifecycleOwner getLifecycleOwner();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class LifecycleCameraRepositoryObserver implements androidx.lifecycle.LifecycleObserver {
        private final androidx.camera.lifecycle.LifecycleCameraRepository mLifecycleCameraRepository;
        private final androidx.lifecycle.LifecycleOwner mLifecycleOwner;

        LifecycleCameraRepositoryObserver(androidx.lifecycle.LifecycleOwner r1, androidx.camera.lifecycle.LifecycleCameraRepository r2) {
                r0 = this;
                r0.<init>()
                r0.mLifecycleOwner = r1
                r0.mLifecycleCameraRepository = r2
                return
        }

        androidx.lifecycle.LifecycleOwner getLifecycleOwner() {
                r1 = this;
                androidx.lifecycle.LifecycleOwner r0 = r1.mLifecycleOwner
                return r0
        }

        @androidx.lifecycle.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_DESTROY)
        public void onDestroy(androidx.lifecycle.LifecycleOwner r2) {
                r1 = this;
                androidx.camera.lifecycle.LifecycleCameraRepository r0 = r1.mLifecycleCameraRepository
                r0.unregisterLifecycle(r2)
                return
        }

        @androidx.lifecycle.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_START)
        public void onStart(androidx.lifecycle.LifecycleOwner r2) {
                r1 = this;
                androidx.camera.lifecycle.LifecycleCameraRepository r0 = r1.mLifecycleCameraRepository
                r0.setActive(r2)
                return
        }

        @androidx.lifecycle.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_STOP)
        public void onStop(androidx.lifecycle.LifecycleOwner r2) {
                r1 = this;
                androidx.camera.lifecycle.LifecycleCameraRepository r0 = r1.mLifecycleCameraRepository
                r0.setInactive(r2)
                return
        }
    }

    LifecycleCameraRepository() {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.mLock = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mCameraMap = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mLifecycleObserverMap = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r1.mActiveLifecycleOwners = r0
            return
    }

    private androidx.camera.lifecycle.LifecycleCameraRepository.LifecycleCameraRepositoryObserver getLifecycleCameraRepositoryObserver(androidx.lifecycle.LifecycleOwner r5) {
            r4 = this;
            java.lang.Object r0 = r4.mLock
            monitor-enter(r0)
            java.util.Map<androidx.camera.lifecycle.LifecycleCameraRepository$LifecycleCameraRepositoryObserver, java.util.Set<androidx.camera.lifecycle.LifecycleCameraRepository$Key>> r1 = r4.mLifecycleObserverMap     // Catch: java.lang.Throwable -> L25
            java.util.Set r1 = r1.keySet()     // Catch: java.lang.Throwable -> L25
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L25
        Ld:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L27
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L25
            androidx.camera.lifecycle.LifecycleCameraRepository$LifecycleCameraRepositoryObserver r2 = (androidx.camera.lifecycle.LifecycleCameraRepository.LifecycleCameraRepositoryObserver) r2     // Catch: java.lang.Throwable -> L25
            androidx.lifecycle.LifecycleOwner r3 = r2.getLifecycleOwner()     // Catch: java.lang.Throwable -> L25
            boolean r3 = r5.equals(r3)     // Catch: java.lang.Throwable -> L25
            if (r3 == 0) goto Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            return r2
        L25:
            r5 = move-exception
            goto L2a
        L27:
            r5 = 0
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            return r5
        L2a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            throw r5
    }

    private boolean hasUseCaseBound(androidx.lifecycle.LifecycleOwner r5) {
            r4 = this;
            java.lang.Object r0 = r4.mLock
            monitor-enter(r0)
            androidx.camera.lifecycle.LifecycleCameraRepository$LifecycleCameraRepositoryObserver r5 = r4.getLifecycleCameraRepositoryObserver(r5)     // Catch: java.lang.Throwable -> Lc
            r1 = 0
            if (r5 != 0) goto Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return r1
        Lc:
            r5 = move-exception
            goto L43
        Le:
            java.util.Map<androidx.camera.lifecycle.LifecycleCameraRepository$LifecycleCameraRepositoryObserver, java.util.Set<androidx.camera.lifecycle.LifecycleCameraRepository$Key>> r2 = r4.mLifecycleObserverMap     // Catch: java.lang.Throwable -> Lc
            java.lang.Object r5 = r2.get(r5)     // Catch: java.lang.Throwable -> Lc
            java.util.Set r5 = (java.util.Set) r5     // Catch: java.lang.Throwable -> Lc
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> Lc
        L1a:
            boolean r2 = r5.hasNext()     // Catch: java.lang.Throwable -> Lc
            if (r2 == 0) goto L41
            java.lang.Object r2 = r5.next()     // Catch: java.lang.Throwable -> Lc
            androidx.camera.lifecycle.LifecycleCameraRepository$Key r2 = (androidx.camera.lifecycle.LifecycleCameraRepository.Key) r2     // Catch: java.lang.Throwable -> Lc
            java.util.Map<androidx.camera.lifecycle.LifecycleCameraRepository$Key, androidx.camera.lifecycle.LifecycleCamera> r3 = r4.mCameraMap     // Catch: java.lang.Throwable -> Lc
            java.lang.Object r2 = r3.get(r2)     // Catch: java.lang.Throwable -> Lc
            androidx.camera.lifecycle.LifecycleCamera r2 = (androidx.camera.lifecycle.LifecycleCamera) r2     // Catch: java.lang.Throwable -> Lc
            java.lang.Object r2 = androidx.core.util.Preconditions.checkNotNull(r2)     // Catch: java.lang.Throwable -> Lc
            androidx.camera.lifecycle.LifecycleCamera r2 = (androidx.camera.lifecycle.LifecycleCamera) r2     // Catch: java.lang.Throwable -> Lc
            java.util.List r2 = r2.getUseCases()     // Catch: java.lang.Throwable -> Lc
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> Lc
            if (r2 != 0) goto L1a
            r5 = 1
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return r5
        L41:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return r1
        L43:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r5
    }

    private void registerCamera(androidx.camera.lifecycle.LifecycleCamera r7) {
            r6 = this;
            java.lang.Object r0 = r6.mLock
            monitor-enter(r0)
            androidx.lifecycle.LifecycleOwner r1 = r7.getLifecycleOwner()     // Catch: java.lang.Throwable -> L22
            androidx.camera.core.internal.CameraUseCaseAdapter r2 = r7.getCameraUseCaseAdapter()     // Catch: java.lang.Throwable -> L22
            androidx.camera.core.internal.CameraUseCaseAdapter$CameraId r2 = r2.getCameraId()     // Catch: java.lang.Throwable -> L22
            androidx.camera.lifecycle.LifecycleCameraRepository$Key r2 = androidx.camera.lifecycle.LifecycleCameraRepository.Key.create(r1, r2)     // Catch: java.lang.Throwable -> L22
            androidx.camera.lifecycle.LifecycleCameraRepository$LifecycleCameraRepositoryObserver r3 = r6.getLifecycleCameraRepositoryObserver(r1)     // Catch: java.lang.Throwable -> L22
            if (r3 == 0) goto L24
            java.util.Map<androidx.camera.lifecycle.LifecycleCameraRepository$LifecycleCameraRepositoryObserver, java.util.Set<androidx.camera.lifecycle.LifecycleCameraRepository$Key>> r4 = r6.mLifecycleObserverMap     // Catch: java.lang.Throwable -> L22
            java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.Throwable -> L22
            java.util.Set r4 = (java.util.Set) r4     // Catch: java.lang.Throwable -> L22
            goto L29
        L22:
            r7 = move-exception
            goto L46
        L24:
            java.util.HashSet r4 = new java.util.HashSet     // Catch: java.lang.Throwable -> L22
            r4.<init>()     // Catch: java.lang.Throwable -> L22
        L29:
            r4.add(r2)     // Catch: java.lang.Throwable -> L22
            java.util.Map<androidx.camera.lifecycle.LifecycleCameraRepository$Key, androidx.camera.lifecycle.LifecycleCamera> r5 = r6.mCameraMap     // Catch: java.lang.Throwable -> L22
            r5.put(r2, r7)     // Catch: java.lang.Throwable -> L22
            if (r3 != 0) goto L44
            androidx.camera.lifecycle.LifecycleCameraRepository$LifecycleCameraRepositoryObserver r7 = new androidx.camera.lifecycle.LifecycleCameraRepository$LifecycleCameraRepositoryObserver     // Catch: java.lang.Throwable -> L22
            r7.<init>(r1, r6)     // Catch: java.lang.Throwable -> L22
            java.util.Map<androidx.camera.lifecycle.LifecycleCameraRepository$LifecycleCameraRepositoryObserver, java.util.Set<androidx.camera.lifecycle.LifecycleCameraRepository$Key>> r2 = r6.mLifecycleObserverMap     // Catch: java.lang.Throwable -> L22
            r2.put(r7, r4)     // Catch: java.lang.Throwable -> L22
            androidx.lifecycle.Lifecycle r1 = r1.getLifecycle()     // Catch: java.lang.Throwable -> L22
            r1.addObserver(r7)     // Catch: java.lang.Throwable -> L22
        L44:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            return
        L46:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            throw r7
    }

    private void suspendUseCases(androidx.lifecycle.LifecycleOwner r4) {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            androidx.camera.lifecycle.LifecycleCameraRepository$LifecycleCameraRepositoryObserver r4 = r3.getLifecycleCameraRepositoryObserver(r4)     // Catch: java.lang.Throwable -> Lb
            if (r4 != 0) goto Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r4 = move-exception
            goto L39
        Ld:
            java.util.Map<androidx.camera.lifecycle.LifecycleCameraRepository$LifecycleCameraRepositoryObserver, java.util.Set<androidx.camera.lifecycle.LifecycleCameraRepository$Key>> r1 = r3.mLifecycleObserverMap     // Catch: java.lang.Throwable -> Lb
            java.lang.Object r4 = r1.get(r4)     // Catch: java.lang.Throwable -> Lb
            java.util.Set r4 = (java.util.Set) r4     // Catch: java.lang.Throwable -> Lb
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> Lb
        L19:
            boolean r1 = r4.hasNext()     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto L37
            java.lang.Object r1 = r4.next()     // Catch: java.lang.Throwable -> Lb
            androidx.camera.lifecycle.LifecycleCameraRepository$Key r1 = (androidx.camera.lifecycle.LifecycleCameraRepository.Key) r1     // Catch: java.lang.Throwable -> Lb
            java.util.Map<androidx.camera.lifecycle.LifecycleCameraRepository$Key, androidx.camera.lifecycle.LifecycleCamera> r2 = r3.mCameraMap     // Catch: java.lang.Throwable -> Lb
            java.lang.Object r1 = r2.get(r1)     // Catch: java.lang.Throwable -> Lb
            androidx.camera.lifecycle.LifecycleCamera r1 = (androidx.camera.lifecycle.LifecycleCamera) r1     // Catch: java.lang.Throwable -> Lb
            java.lang.Object r1 = androidx.core.util.Preconditions.checkNotNull(r1)     // Catch: java.lang.Throwable -> Lb
            androidx.camera.lifecycle.LifecycleCamera r1 = (androidx.camera.lifecycle.LifecycleCamera) r1     // Catch: java.lang.Throwable -> Lb
            r1.suspend()     // Catch: java.lang.Throwable -> Lb
            goto L19
        L37:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        L39:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r4
    }

    private void unsuspendUseCases(androidx.lifecycle.LifecycleOwner r4) {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            androidx.camera.lifecycle.LifecycleCameraRepository$LifecycleCameraRepositoryObserver r4 = r3.getLifecycleCameraRepositoryObserver(r4)     // Catch: java.lang.Throwable -> L3b
            java.util.Map<androidx.camera.lifecycle.LifecycleCameraRepository$LifecycleCameraRepositoryObserver, java.util.Set<androidx.camera.lifecycle.LifecycleCameraRepository$Key>> r1 = r3.mLifecycleObserverMap     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r4 = r1.get(r4)     // Catch: java.lang.Throwable -> L3b
            java.util.Set r4 = (java.util.Set) r4     // Catch: java.lang.Throwable -> L3b
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L3b
        L13:
            boolean r1 = r4.hasNext()     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r4.next()     // Catch: java.lang.Throwable -> L3b
            androidx.camera.lifecycle.LifecycleCameraRepository$Key r1 = (androidx.camera.lifecycle.LifecycleCameraRepository.Key) r1     // Catch: java.lang.Throwable -> L3b
            java.util.Map<androidx.camera.lifecycle.LifecycleCameraRepository$Key, androidx.camera.lifecycle.LifecycleCamera> r2 = r3.mCameraMap     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r1 = r2.get(r1)     // Catch: java.lang.Throwable -> L3b
            androidx.camera.lifecycle.LifecycleCamera r1 = (androidx.camera.lifecycle.LifecycleCamera) r1     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r2 = androidx.core.util.Preconditions.checkNotNull(r1)     // Catch: java.lang.Throwable -> L3b
            androidx.camera.lifecycle.LifecycleCamera r2 = (androidx.camera.lifecycle.LifecycleCamera) r2     // Catch: java.lang.Throwable -> L3b
            java.util.List r2 = r2.getUseCases()     // Catch: java.lang.Throwable -> L3b
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L3b
            if (r2 != 0) goto L13
            r1.unsuspend()     // Catch: java.lang.Throwable -> L3b
            goto L13
        L3b:
            r4 = move-exception
            goto L3f
        L3d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3b
            return
        L3f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3b
            throw r4
    }

    void bindToLifecycleCamera(@androidx.annotation.NonNull androidx.camera.lifecycle.LifecycleCamera r5, @androidx.annotation.Nullable androidx.camera.core.ViewPort r6, @androidx.annotation.NonNull java.util.List<androidx.camera.core.CameraEffect> r7, @androidx.annotation.NonNull java.util.Collection<androidx.camera.core.UseCase> r8, @androidx.annotation.Nullable androidx.camera.core.concurrent.CameraCoordinator r9) {
            r4 = this;
            java.lang.Object r0 = r4.mLock
            monitor-enter(r0)
            boolean r1 = r8.isEmpty()     // Catch: java.lang.Throwable -> L2a
            r1 = r1 ^ 1
            androidx.core.util.Preconditions.checkArgument(r1)     // Catch: java.lang.Throwable -> L2a
            r4.mCameraCoordinator = r9     // Catch: java.lang.Throwable -> L2a
            androidx.lifecycle.LifecycleOwner r9 = r5.getLifecycleOwner()     // Catch: java.lang.Throwable -> L2a
            androidx.camera.lifecycle.LifecycleCameraRepository$LifecycleCameraRepositoryObserver r1 = r4.getLifecycleCameraRepositoryObserver(r9)     // Catch: java.lang.Throwable -> L2a
            java.util.Map<androidx.camera.lifecycle.LifecycleCameraRepository$LifecycleCameraRepositoryObserver, java.util.Set<androidx.camera.lifecycle.LifecycleCameraRepository$Key>> r2 = r4.mLifecycleObserverMap     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r1 = r2.get(r1)     // Catch: java.lang.Throwable -> L2a
            java.util.Set r1 = (java.util.Set) r1     // Catch: java.lang.Throwable -> L2a
            androidx.camera.core.concurrent.CameraCoordinator r2 = r4.mCameraCoordinator     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L2c
            int r2 = r2.getCameraOperatingMode()     // Catch: java.lang.Throwable -> L2a
            r3 = 2
            if (r2 == r3) goto L63
            goto L2c
        L2a:
            r5 = move-exception
            goto L94
        L2c:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L2a
        L30:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L63
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L2a
            androidx.camera.lifecycle.LifecycleCameraRepository$Key r2 = (androidx.camera.lifecycle.LifecycleCameraRepository.Key) r2     // Catch: java.lang.Throwable -> L2a
            java.util.Map<androidx.camera.lifecycle.LifecycleCameraRepository$Key, androidx.camera.lifecycle.LifecycleCamera> r3 = r4.mCameraMap     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r2 = r3.get(r2)     // Catch: java.lang.Throwable -> L2a
            androidx.camera.lifecycle.LifecycleCamera r2 = (androidx.camera.lifecycle.LifecycleCamera) r2     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r2 = androidx.core.util.Preconditions.checkNotNull(r2)     // Catch: java.lang.Throwable -> L2a
            androidx.camera.lifecycle.LifecycleCamera r2 = (androidx.camera.lifecycle.LifecycleCamera) r2     // Catch: java.lang.Throwable -> L2a
            boolean r3 = r2.equals(r5)     // Catch: java.lang.Throwable -> L2a
            if (r3 != 0) goto L30
            java.util.List r2 = r2.getUseCases()     // Catch: java.lang.Throwable -> L2a
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L5b
            goto L30
        L5b:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L2a
            java.lang.String r6 = "Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner."
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L2a
            throw r5     // Catch: java.lang.Throwable -> L2a
        L63:
            androidx.camera.core.internal.CameraUseCaseAdapter r1 = r5.getCameraUseCaseAdapter()     // Catch: java.lang.Throwable -> L2a androidx.camera.core.internal.CameraUseCaseAdapter.CameraException -> L89
            r1.setViewPort(r6)     // Catch: java.lang.Throwable -> L2a androidx.camera.core.internal.CameraUseCaseAdapter.CameraException -> L89
            androidx.camera.core.internal.CameraUseCaseAdapter r6 = r5.getCameraUseCaseAdapter()     // Catch: java.lang.Throwable -> L2a androidx.camera.core.internal.CameraUseCaseAdapter.CameraException -> L89
            r6.setEffects(r7)     // Catch: java.lang.Throwable -> L2a androidx.camera.core.internal.CameraUseCaseAdapter.CameraException -> L89
            r5.bind(r8)     // Catch: java.lang.Throwable -> L2a androidx.camera.core.internal.CameraUseCaseAdapter.CameraException -> L89
            androidx.lifecycle.Lifecycle r5 = r9.getLifecycle()     // Catch: java.lang.Throwable -> L2a
            androidx.lifecycle.Lifecycle$State r5 = r5.getCurrentState()     // Catch: java.lang.Throwable -> L2a
            androidx.lifecycle.Lifecycle$State r6 = androidx.lifecycle.Lifecycle.State.STARTED     // Catch: java.lang.Throwable -> L2a
            boolean r5 = r5.isAtLeast(r6)     // Catch: java.lang.Throwable -> L2a
            if (r5 == 0) goto L87
            r4.setActive(r9)     // Catch: java.lang.Throwable -> L2a
        L87:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            return
        L89:
            r5 = move-exception
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L2a
            java.lang.String r5 = r5.getMessage()     // Catch: java.lang.Throwable -> L2a
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L2a
            throw r6     // Catch: java.lang.Throwable -> L2a
        L94:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            throw r5
    }

    void clear() {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            java.util.HashSet r1 = new java.util.HashSet     // Catch: java.lang.Throwable -> L26
            java.util.Map<androidx.camera.lifecycle.LifecycleCameraRepository$LifecycleCameraRepositoryObserver, java.util.Set<androidx.camera.lifecycle.LifecycleCameraRepository$Key>> r2 = r3.mLifecycleObserverMap     // Catch: java.lang.Throwable -> L26
            java.util.Set r2 = r2.keySet()     // Catch: java.lang.Throwable -> L26
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L26
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L26
        L12:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L26
            if (r2 == 0) goto L28
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L26
            androidx.camera.lifecycle.LifecycleCameraRepository$LifecycleCameraRepositoryObserver r2 = (androidx.camera.lifecycle.LifecycleCameraRepository.LifecycleCameraRepositoryObserver) r2     // Catch: java.lang.Throwable -> L26
            androidx.lifecycle.LifecycleOwner r2 = r2.getLifecycleOwner()     // Catch: java.lang.Throwable -> L26
            r3.unregisterLifecycle(r2)     // Catch: java.lang.Throwable -> L26
            goto L12
        L26:
            r1 = move-exception
            goto L2a
        L28:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            return
        L2a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            throw r1
    }

    androidx.camera.lifecycle.LifecycleCamera createLifecycleCamera(@androidx.annotation.NonNull androidx.lifecycle.LifecycleOwner r4, @androidx.annotation.NonNull androidx.camera.core.internal.CameraUseCaseAdapter r5) {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            androidx.camera.core.internal.CameraUseCaseAdapter$CameraId r1 = r5.getCameraId()     // Catch: java.lang.Throwable -> L3a
            androidx.camera.lifecycle.LifecycleCameraRepository$Key r1 = androidx.camera.lifecycle.LifecycleCameraRepository.Key.create(r4, r1)     // Catch: java.lang.Throwable -> L3a
            java.util.Map<androidx.camera.lifecycle.LifecycleCameraRepository$Key, androidx.camera.lifecycle.LifecycleCamera> r2 = r3.mCameraMap     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r1 = r2.get(r1)     // Catch: java.lang.Throwable -> L3a
            if (r1 != 0) goto L15
            r1 = 1
            goto L16
        L15:
            r1 = 0
        L16:
            java.lang.String r2 = "LifecycleCamera already exists for the given LifecycleOwner and set of cameras"
            androidx.core.util.Preconditions.checkArgument(r1, r2)     // Catch: java.lang.Throwable -> L3a
            androidx.lifecycle.Lifecycle r1 = r4.getLifecycle()     // Catch: java.lang.Throwable -> L3a
            androidx.lifecycle.Lifecycle$State r1 = r1.getCurrentState()     // Catch: java.lang.Throwable -> L3a
            androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.DESTROYED     // Catch: java.lang.Throwable -> L3a
            if (r1 == r2) goto L41
            androidx.camera.lifecycle.LifecycleCamera r1 = new androidx.camera.lifecycle.LifecycleCamera     // Catch: java.lang.Throwable -> L3a
            r1.<init>(r4, r5)     // Catch: java.lang.Throwable -> L3a
            java.util.List r4 = r5.getUseCases()     // Catch: java.lang.Throwable -> L3a
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L3c
            r1.suspend()     // Catch: java.lang.Throwable -> L3a
            goto L3c
        L3a:
            r4 = move-exception
            goto L49
        L3c:
            r3.registerCamera(r1)     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            return r1
        L41:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L3a
            java.lang.String r5 = "Trying to create LifecycleCamera with destroyed lifecycle."
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L3a
            throw r4     // Catch: java.lang.Throwable -> L3a
        L49:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            throw r4
    }

    @androidx.annotation.Nullable
    androidx.camera.lifecycle.LifecycleCamera getLifecycleCamera(androidx.lifecycle.LifecycleOwner r3, androidx.camera.core.internal.CameraUseCaseAdapter.CameraId r4) {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            java.util.Map<androidx.camera.lifecycle.LifecycleCameraRepository$Key, androidx.camera.lifecycle.LifecycleCamera> r1 = r2.mCameraMap     // Catch: java.lang.Throwable -> L11
            androidx.camera.lifecycle.LifecycleCameraRepository$Key r3 = androidx.camera.lifecycle.LifecycleCameraRepository.Key.create(r3, r4)     // Catch: java.lang.Throwable -> L11
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.Throwable -> L11
            androidx.camera.lifecycle.LifecycleCamera r3 = (androidx.camera.lifecycle.LifecycleCamera) r3     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r3
        L11:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r3
    }

    java.util.Collection<androidx.camera.lifecycle.LifecycleCamera> getLifecycleCameras() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            java.util.Map<androidx.camera.lifecycle.LifecycleCameraRepository$Key, androidx.camera.lifecycle.LifecycleCamera> r1 = r2.mCameraMap     // Catch: java.lang.Throwable -> Lf
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> Lf
            java.util.Collection r1 = java.util.Collections.unmodifiableCollection(r1)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r1
        Lf:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    void setActive(androidx.lifecycle.LifecycleOwner r4) {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            boolean r1 = r3.hasUseCaseBound(r4)     // Catch: java.lang.Throwable -> Lb
            if (r1 != 0) goto Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r4 = move-exception
            goto L46
        Ld:
            java.util.ArrayDeque<androidx.lifecycle.LifecycleOwner> r1 = r3.mActiveLifecycleOwners     // Catch: java.lang.Throwable -> Lb
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto L1b
            java.util.ArrayDeque<androidx.lifecycle.LifecycleOwner> r1 = r3.mActiveLifecycleOwners     // Catch: java.lang.Throwable -> Lb
            r1.push(r4)     // Catch: java.lang.Throwable -> Lb
            goto L41
        L1b:
            androidx.camera.core.concurrent.CameraCoordinator r1 = r3.mCameraCoordinator     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto L26
            int r1 = r1.getCameraOperatingMode()     // Catch: java.lang.Throwable -> Lb
            r2 = 2
            if (r1 == r2) goto L41
        L26:
            java.util.ArrayDeque<androidx.lifecycle.LifecycleOwner> r1 = r3.mActiveLifecycleOwners     // Catch: java.lang.Throwable -> Lb
            java.lang.Object r1 = r1.peek()     // Catch: java.lang.Throwable -> Lb
            androidx.lifecycle.LifecycleOwner r1 = (androidx.lifecycle.LifecycleOwner) r1     // Catch: java.lang.Throwable -> Lb
            boolean r2 = r4.equals(r1)     // Catch: java.lang.Throwable -> Lb
            if (r2 != 0) goto L41
            r3.suspendUseCases(r1)     // Catch: java.lang.Throwable -> Lb
            java.util.ArrayDeque<androidx.lifecycle.LifecycleOwner> r1 = r3.mActiveLifecycleOwners     // Catch: java.lang.Throwable -> Lb
            r1.remove(r4)     // Catch: java.lang.Throwable -> Lb
            java.util.ArrayDeque<androidx.lifecycle.LifecycleOwner> r1 = r3.mActiveLifecycleOwners     // Catch: java.lang.Throwable -> Lb
            r1.push(r4)     // Catch: java.lang.Throwable -> Lb
        L41:
            r3.unsuspendUseCases(r4)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        L46:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r4
    }

    void setInactive(androidx.lifecycle.LifecycleOwner r3) {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            java.util.ArrayDeque<androidx.lifecycle.LifecycleOwner> r1 = r2.mActiveLifecycleOwners     // Catch: java.lang.Throwable -> L1f
            r1.remove(r3)     // Catch: java.lang.Throwable -> L1f
            r2.suspendUseCases(r3)     // Catch: java.lang.Throwable -> L1f
            java.util.ArrayDeque<androidx.lifecycle.LifecycleOwner> r3 = r2.mActiveLifecycleOwners     // Catch: java.lang.Throwable -> L1f
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L1f
            if (r3 != 0) goto L21
            java.util.ArrayDeque<androidx.lifecycle.LifecycleOwner> r3 = r2.mActiveLifecycleOwners     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r3 = r3.peek()     // Catch: java.lang.Throwable -> L1f
            androidx.lifecycle.LifecycleOwner r3 = (androidx.lifecycle.LifecycleOwner) r3     // Catch: java.lang.Throwable -> L1f
            r2.unsuspendUseCases(r3)     // Catch: java.lang.Throwable -> L1f
            goto L21
        L1f:
            r3 = move-exception
            goto L23
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            return
        L23:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            throw r3
    }

    void unbind(@androidx.annotation.NonNull java.util.Collection<androidx.camera.core.UseCase> r5) {
            r4 = this;
            java.lang.Object r0 = r4.mLock
            monitor-enter(r0)
            java.util.Map<androidx.camera.lifecycle.LifecycleCameraRepository$Key, androidx.camera.lifecycle.LifecycleCamera> r1 = r4.mCameraMap     // Catch: java.lang.Throwable -> L40
            java.util.Set r1 = r1.keySet()     // Catch: java.lang.Throwable -> L40
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L40
        Ld:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L40
            if (r2 == 0) goto L42
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L40
            androidx.camera.lifecycle.LifecycleCameraRepository$Key r2 = (androidx.camera.lifecycle.LifecycleCameraRepository.Key) r2     // Catch: java.lang.Throwable -> L40
            java.util.Map<androidx.camera.lifecycle.LifecycleCameraRepository$Key, androidx.camera.lifecycle.LifecycleCamera> r3 = r4.mCameraMap     // Catch: java.lang.Throwable -> L40
            java.lang.Object r2 = r3.get(r2)     // Catch: java.lang.Throwable -> L40
            androidx.camera.lifecycle.LifecycleCamera r2 = (androidx.camera.lifecycle.LifecycleCamera) r2     // Catch: java.lang.Throwable -> L40
            java.util.List r3 = r2.getUseCases()     // Catch: java.lang.Throwable -> L40
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L40
            r2.unbind(r5)     // Catch: java.lang.Throwable -> L40
            if (r3 != 0) goto Ld
            java.util.List r3 = r2.getUseCases()     // Catch: java.lang.Throwable -> L40
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L40
            if (r3 == 0) goto Ld
            androidx.lifecycle.LifecycleOwner r2 = r2.getLifecycleOwner()     // Catch: java.lang.Throwable -> L40
            r4.setInactive(r2)     // Catch: java.lang.Throwable -> L40
            goto Ld
        L40:
            r5 = move-exception
            goto L44
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
            return
        L44:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
            throw r5
    }

    void unbindAll() {
            r4 = this;
            java.lang.Object r0 = r4.mLock
            monitor-enter(r0)
            java.util.Map<androidx.camera.lifecycle.LifecycleCameraRepository$Key, androidx.camera.lifecycle.LifecycleCamera> r1 = r4.mCameraMap     // Catch: java.lang.Throwable -> L2c
            java.util.Set r1 = r1.keySet()     // Catch: java.lang.Throwable -> L2c
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L2c
        Ld:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L2c
            androidx.camera.lifecycle.LifecycleCameraRepository$Key r2 = (androidx.camera.lifecycle.LifecycleCameraRepository.Key) r2     // Catch: java.lang.Throwable -> L2c
            java.util.Map<androidx.camera.lifecycle.LifecycleCameraRepository$Key, androidx.camera.lifecycle.LifecycleCamera> r3 = r4.mCameraMap     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r2 = r3.get(r2)     // Catch: java.lang.Throwable -> L2c
            androidx.camera.lifecycle.LifecycleCamera r2 = (androidx.camera.lifecycle.LifecycleCamera) r2     // Catch: java.lang.Throwable -> L2c
            r2.unbindAll()     // Catch: java.lang.Throwable -> L2c
            androidx.lifecycle.LifecycleOwner r2 = r2.getLifecycleOwner()     // Catch: java.lang.Throwable -> L2c
            r4.setInactive(r2)     // Catch: java.lang.Throwable -> L2c
            goto Ld
        L2c:
            r1 = move-exception
            goto L30
        L2e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            return
        L30:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            throw r1
    }

    void unregisterLifecycle(androidx.lifecycle.LifecycleOwner r5) {
            r4 = this;
            java.lang.Object r0 = r4.mLock
            monitor-enter(r0)
            androidx.camera.lifecycle.LifecycleCameraRepository$LifecycleCameraRepositoryObserver r1 = r4.getLifecycleCameraRepositoryObserver(r5)     // Catch: java.lang.Throwable -> Lb
            if (r1 != 0) goto Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r5 = move-exception
            goto L40
        Ld:
            r4.setInactive(r5)     // Catch: java.lang.Throwable -> Lb
            java.util.Map<androidx.camera.lifecycle.LifecycleCameraRepository$LifecycleCameraRepositoryObserver, java.util.Set<androidx.camera.lifecycle.LifecycleCameraRepository$Key>> r5 = r4.mLifecycleObserverMap     // Catch: java.lang.Throwable -> Lb
            java.lang.Object r5 = r5.get(r1)     // Catch: java.lang.Throwable -> Lb
            java.util.Set r5 = (java.util.Set) r5     // Catch: java.lang.Throwable -> Lb
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> Lb
        L1c:
            boolean r2 = r5.hasNext()     // Catch: java.lang.Throwable -> Lb
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r5.next()     // Catch: java.lang.Throwable -> Lb
            androidx.camera.lifecycle.LifecycleCameraRepository$Key r2 = (androidx.camera.lifecycle.LifecycleCameraRepository.Key) r2     // Catch: java.lang.Throwable -> Lb
            java.util.Map<androidx.camera.lifecycle.LifecycleCameraRepository$Key, androidx.camera.lifecycle.LifecycleCamera> r3 = r4.mCameraMap     // Catch: java.lang.Throwable -> Lb
            r3.remove(r2)     // Catch: java.lang.Throwable -> Lb
            goto L1c
        L2e:
            java.util.Map<androidx.camera.lifecycle.LifecycleCameraRepository$LifecycleCameraRepositoryObserver, java.util.Set<androidx.camera.lifecycle.LifecycleCameraRepository$Key>> r5 = r4.mLifecycleObserverMap     // Catch: java.lang.Throwable -> Lb
            r5.remove(r1)     // Catch: java.lang.Throwable -> Lb
            androidx.lifecycle.LifecycleOwner r5 = r1.getLifecycleOwner()     // Catch: java.lang.Throwable -> Lb
            androidx.lifecycle.Lifecycle r5 = r5.getLifecycle()     // Catch: java.lang.Throwable -> Lb
            r5.removeObserver(r1)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        L40:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r5
    }
}
