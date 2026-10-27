package androidx.camera.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ProcessCameraProvider implements androidx.camera.lifecycle.LifecycleCameraProvider {
    private static final androidx.camera.lifecycle.ProcessCameraProvider sAppInstance = null;
    private androidx.camera.core.CameraX mCameraX;

    @androidx.annotation.GuardedBy("mLock")
    private androidx.camera.core.CameraXConfig.Provider mCameraXConfigProvider;

    @androidx.annotation.GuardedBy("mLock")
    private com.google.common.util.concurrent.ListenableFuture<androidx.camera.core.CameraX> mCameraXInitializeFuture;

    @androidx.annotation.GuardedBy("mLock")
    private com.google.common.util.concurrent.ListenableFuture<java.lang.Void> mCameraXShutdownFuture;
    private android.content.Context mContext;
    private final androidx.camera.lifecycle.LifecycleCameraRepository mLifecycleCameraRepository;
    private final java.lang.Object mLock;


    static {
            androidx.camera.lifecycle.ProcessCameraProvider r0 = new androidx.camera.lifecycle.ProcessCameraProvider
            r0.<init>()
            androidx.camera.lifecycle.ProcessCameraProvider.sAppInstance = r0
            return
    }

    private ProcessCameraProvider() {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.mLock = r0
            r0 = 0
            r1.mCameraXConfigProvider = r0
            com.google.common.util.concurrent.ListenableFuture r0 = androidx.camera.core.impl.utils.futures.Futures.immediateFuture(r0)
            r1.mCameraXShutdownFuture = r0
            androidx.camera.lifecycle.LifecycleCameraRepository r0 = new androidx.camera.lifecycle.LifecycleCameraRepository
            r0.<init>()
            r1.mLifecycleCameraRepository = r0
            return
    }

    public static /* synthetic */ java.lang.Object a(androidx.camera.lifecycle.ProcessCameraProvider r4, androidx.camera.core.CameraX r5, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r6) {
            java.lang.Object r0 = r4.mLock
            monitor-enter(r0)
            com.google.common.util.concurrent.ListenableFuture<java.lang.Void> r1 = r4.mCameraXShutdownFuture     // Catch: java.lang.Throwable -> L26
            androidx.camera.core.impl.utils.futures.FutureChain r1 = androidx.camera.core.impl.utils.futures.FutureChain.from(r1)     // Catch: java.lang.Throwable -> L26
            androidx.camera.lifecycle.e r2 = new androidx.camera.lifecycle.e     // Catch: java.lang.Throwable -> L26
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L26
            java.util.concurrent.Executor r3 = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()     // Catch: java.lang.Throwable -> L26
            androidx.camera.core.impl.utils.futures.FutureChain r1 = r1.transformAsync(r2, r3)     // Catch: java.lang.Throwable -> L26
            androidx.camera.lifecycle.ProcessCameraProvider$1 r2 = new androidx.camera.lifecycle.ProcessCameraProvider$1     // Catch: java.lang.Throwable -> L26
            r2.<init>(r4, r6, r5)     // Catch: java.lang.Throwable -> L26
            java.util.concurrent.Executor r4 = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()     // Catch: java.lang.Throwable -> L26
            androidx.camera.core.impl.utils.futures.Futures.addCallback(r1, r2, r4)     // Catch: java.lang.Throwable -> L26
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            java.lang.String r4 = "ProcessCameraProvider-initializeCameraX"
            return r4
        L26:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            throw r4
    }

    public static /* synthetic */ com.google.common.util.concurrent.ListenableFuture b(androidx.camera.core.CameraX r0, java.lang.Void r1) {
            com.google.common.util.concurrent.ListenableFuture r0 = r0.getInitializeFuture()
            return r0
    }

    public static /* synthetic */ androidx.camera.core.CameraXConfig c(androidx.camera.core.CameraXConfig r0) {
            return r0
    }

    @androidx.camera.lifecycle.ExperimentalCameraProviderConfiguration
    public static void configureInstance(@androidx.annotation.NonNull androidx.camera.core.CameraXConfig r1) {
            androidx.camera.lifecycle.ProcessCameraProvider r0 = androidx.camera.lifecycle.ProcessCameraProvider.sAppInstance
            r0.configureInstanceInternal(r1)
            return
    }

    private void configureInstanceInternal(@androidx.annotation.NonNull androidx.camera.core.CameraXConfig r4) {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            androidx.core.util.Preconditions.checkNotNull(r4)     // Catch: java.lang.Throwable -> L1b
            androidx.camera.core.CameraXConfig$Provider r1 = r3.mCameraXConfigProvider     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            java.lang.String r2 = "CameraX has already been configured. To use a different configuration, shutdown() must be called."
            androidx.core.util.Preconditions.checkState(r1, r2)     // Catch: java.lang.Throwable -> L1b
            androidx.camera.lifecycle.b r1 = new androidx.camera.lifecycle.b     // Catch: java.lang.Throwable -> L1b
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L1b
            r3.mCameraXConfigProvider = r1     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return
        L1b:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r4
    }

    public static /* synthetic */ void d(androidx.camera.lifecycle.ProcessCameraProvider r0) {
            r0.unbindAll()
            androidx.camera.lifecycle.LifecycleCameraRepository r0 = r0.mLifecycleCameraRepository
            r0.clear()
            return
    }

    public static /* synthetic */ androidx.camera.lifecycle.ProcessCameraProvider e(android.content.Context r1, androidx.camera.core.CameraX r2) {
            androidx.camera.lifecycle.ProcessCameraProvider r0 = androidx.camera.lifecycle.ProcessCameraProvider.sAppInstance
            r0.setCameraX(r2)
            android.content.Context r1 = androidx.camera.core.impl.utils.ContextUtil.getApplicationContext(r1)
            r0.setContext(r1)
            return r0
    }

    @androidx.annotation.NonNull
    private java.util.List<androidx.camera.core.CameraInfo> getActiveConcurrentCameraInfos() {
            r1 = this;
            androidx.camera.core.CameraX r0 = r1.mCameraX
            if (r0 != 0) goto La
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        La:
            androidx.camera.core.impl.CameraFactory r0 = r0.getCameraFactory()
            androidx.camera.core.concurrent.CameraCoordinator r0 = r0.getCameraCoordinator()
            java.util.List r0 = r0.getActiveConcurrentCameraInfos()
            return r0
    }

    @androidx.annotation.Nullable
    private androidx.camera.core.CameraInfo getCameraInfoFromCameraSelector(@androidx.annotation.NonNull androidx.camera.core.CameraSelector r1, @androidx.annotation.NonNull java.util.List<androidx.camera.core.CameraInfo> r2) {
            r0 = this;
            java.util.List r1 = r1.filter(r2)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto Lc
            r1 = 0
            return r1
        Lc:
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            androidx.camera.core.CameraInfo r1 = (androidx.camera.core.CameraInfo) r1
            return r1
    }

    private int getCameraOperatingMode() {
            r1 = this;
            androidx.camera.core.CameraX r0 = r1.mCameraX
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            androidx.camera.core.impl.CameraFactory r0 = r0.getCameraFactory()
            androidx.camera.core.concurrent.CameraCoordinator r0 = r0.getCameraCoordinator()
            int r0 = r0.getCameraOperatingMode()
            return r0
    }

    @androidx.annotation.NonNull
    public static com.google.common.util.concurrent.ListenableFuture<androidx.camera.lifecycle.ProcessCameraProvider> getInstance(@androidx.annotation.NonNull android.content.Context r2) {
            androidx.core.util.Preconditions.checkNotNull(r2)
            androidx.camera.lifecycle.ProcessCameraProvider r0 = androidx.camera.lifecycle.ProcessCameraProvider.sAppInstance
            com.google.common.util.concurrent.ListenableFuture r0 = r0.getOrCreateCameraXInstance(r2)
            androidx.camera.lifecycle.d r1 = new androidx.camera.lifecycle.d
            r1.<init>(r2)
            java.util.concurrent.Executor r2 = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()
            com.google.common.util.concurrent.ListenableFuture r2 = androidx.camera.core.impl.utils.futures.Futures.transform(r0, r1, r2)
            return r2
    }

    private com.google.common.util.concurrent.ListenableFuture<androidx.camera.core.CameraX> getOrCreateCameraXInstance(@androidx.annotation.NonNull android.content.Context r4) {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            com.google.common.util.concurrent.ListenableFuture<androidx.camera.core.CameraX> r1 = r3.mCameraXInitializeFuture     // Catch: java.lang.Throwable -> L9
            if (r1 == 0) goto Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return r1
        L9:
            r4 = move-exception
            goto L1f
        Lb:
            androidx.camera.core.CameraX r1 = new androidx.camera.core.CameraX     // Catch: java.lang.Throwable -> L9
            androidx.camera.core.CameraXConfig$Provider r2 = r3.mCameraXConfigProvider     // Catch: java.lang.Throwable -> L9
            r1.<init>(r4, r2)     // Catch: java.lang.Throwable -> L9
            androidx.camera.lifecycle.a r4 = new androidx.camera.lifecycle.a     // Catch: java.lang.Throwable -> L9
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L9
            com.google.common.util.concurrent.ListenableFuture r4 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r4)     // Catch: java.lang.Throwable -> L9
            r3.mCameraXInitializeFuture = r4     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return r4
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r4
    }

    private void setActiveConcurrentCameraInfos(@androidx.annotation.NonNull java.util.List<androidx.camera.core.CameraInfo> r2) {
            r1 = this;
            androidx.camera.core.CameraX r0 = r1.mCameraX
            if (r0 != 0) goto L5
            return
        L5:
            androidx.camera.core.impl.CameraFactory r0 = r0.getCameraFactory()
            androidx.camera.core.concurrent.CameraCoordinator r0 = r0.getCameraCoordinator()
            r0.setActiveConcurrentCameraInfos(r2)
            return
    }

    private void setCameraOperatingMode(int r2) {
            r1 = this;
            androidx.camera.core.CameraX r0 = r1.mCameraX
            if (r0 != 0) goto L5
            return
        L5:
            androidx.camera.core.impl.CameraFactory r0 = r0.getCameraFactory()
            androidx.camera.core.concurrent.CameraCoordinator r0 = r0.getCameraCoordinator()
            r0.setCameraOperatingMode(r2)
            return
    }

    private void setCameraX(androidx.camera.core.CameraX r1) {
            r0 = this;
            r0.mCameraX = r1
            return
    }

    private void setContext(android.content.Context r1) {
            r0 = this;
            r0.mContext = r1
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.MainThread
    public androidx.camera.core.Camera bindToLifecycle(@androidx.annotation.NonNull androidx.lifecycle.LifecycleOwner r8, @androidx.annotation.NonNull androidx.camera.core.CameraSelector r9, @androidx.annotation.NonNull androidx.camera.core.UseCaseGroup r10) {
            r7 = this;
            int r0 = r7.getCameraOperatingMode()
            r1 = 2
            if (r0 == r1) goto L29
            r0 = 1
            r7.setCameraOperatingMode(r0)
            androidx.camera.core.ViewPort r4 = r10.getViewPort()
            java.util.List r5 = r10.getEffects()
            java.util.List r10 = r10.getUseCases()
            r0 = 0
            androidx.camera.core.UseCase[] r0 = new androidx.camera.core.UseCase[r0]
            java.lang.Object[] r10 = r10.toArray(r0)
            r6 = r10
            androidx.camera.core.UseCase[] r6 = (androidx.camera.core.UseCase[]) r6
            r1 = r7
            r2 = r8
            r3 = r9
            androidx.camera.core.Camera r8 = r1.bindToLifecycle(r2, r3, r4, r5, r6)
            return r8
        L29:
            java.lang.UnsupportedOperationException r8 = new java.lang.UnsupportedOperationException
            java.lang.String r9 = "bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first"
            r8.<init>(r9)
            throw r8
    }

    @androidx.annotation.NonNull
    androidx.camera.core.Camera bindToLifecycle(@androidx.annotation.NonNull androidx.lifecycle.LifecycleOwner r13, @androidx.annotation.NonNull androidx.camera.core.CameraSelector r14, @androidx.annotation.Nullable androidx.camera.core.ViewPort r15, @androidx.annotation.NonNull java.util.List<androidx.camera.core.CameraEffect> r16, @androidx.annotation.NonNull androidx.camera.core.UseCase... r17) {
            r12 = this;
            r0 = r17
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.core.CameraSelector$Builder r1 = androidx.camera.core.CameraSelector.Builder.fromSelector(r14)
            int r2 = r0.length
            r3 = 0
            r4 = 0
        Lc:
            r5 = 0
            if (r4 >= r2) goto L36
            r6 = r0[r4]
            androidx.camera.core.impl.UseCaseConfig r6 = r6.getCurrentConfig()
            androidx.camera.core.CameraSelector r5 = r6.getCameraSelector(r5)
            if (r5 == 0) goto L33
            java.util.LinkedHashSet r5 = r5.getCameraFilterSet()
            java.util.Iterator r5 = r5.iterator()
        L23:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L33
            java.lang.Object r6 = r5.next()
            androidx.camera.core.CameraFilter r6 = (androidx.camera.core.CameraFilter) r6
            r1.addCameraFilter(r6)
            goto L23
        L33:
            int r4 = r4 + 1
            goto Lc
        L36:
            androidx.camera.core.CameraSelector r1 = r1.build()
            androidx.camera.core.CameraX r2 = r12.mCameraX
            androidx.camera.core.impl.CameraRepository r2 = r2.getCameraRepository()
            java.util.LinkedHashSet r2 = r2.getCameras()
            java.util.LinkedHashSet r1 = r1.filter(r2)
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L110
            androidx.camera.core.internal.CameraUseCaseAdapter$CameraId r2 = androidx.camera.core.internal.CameraUseCaseAdapter.generateCameraId(r1)
            androidx.camera.lifecycle.LifecycleCameraRepository r4 = r12.mLifecycleCameraRepository
            androidx.camera.lifecycle.LifecycleCamera r2 = r4.getLifecycleCamera(r13, r2)
            androidx.camera.lifecycle.LifecycleCameraRepository r4 = r12.mLifecycleCameraRepository
            java.util.Collection r4 = r4.getLifecycleCameras()
            int r6 = r0.length
            r7 = 0
        L60:
            if (r7 >= r6) goto L91
            r8 = r0[r7]
            java.util.Iterator r9 = r4.iterator()
        L68:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L8e
            java.lang.Object r10 = r9.next()
            androidx.camera.lifecycle.LifecycleCamera r10 = (androidx.camera.lifecycle.LifecycleCamera) r10
            boolean r11 = r10.isBound(r8)
            if (r11 == 0) goto L68
            if (r10 != r2) goto L7d
            goto L68
        L7d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            r14 = 1
            java.lang.Object[] r14 = new java.lang.Object[r14]
            r14[r3] = r8
            java.lang.String r0 = "Use case %s already bound to a different lifecycle."
            java.lang.String r14 = java.lang.String.format(r0, r14)
            r13.<init>(r14)
            throw r13
        L8e:
            int r7 = r7 + 1
            goto L60
        L91:
            if (r2 != 0) goto Lb4
            androidx.camera.lifecycle.LifecycleCameraRepository r2 = r12.mLifecycleCameraRepository
            androidx.camera.core.internal.CameraUseCaseAdapter r3 = new androidx.camera.core.internal.CameraUseCaseAdapter
            androidx.camera.core.CameraX r4 = r12.mCameraX
            androidx.camera.core.impl.CameraFactory r4 = r4.getCameraFactory()
            androidx.camera.core.concurrent.CameraCoordinator r4 = r4.getCameraCoordinator()
            androidx.camera.core.CameraX r6 = r12.mCameraX
            androidx.camera.core.impl.CameraDeviceSurfaceManager r6 = r6.getCameraDeviceSurfaceManager()
            androidx.camera.core.CameraX r7 = r12.mCameraX
            androidx.camera.core.impl.UseCaseConfigFactory r7 = r7.getDefaultConfigFactory()
            r3.<init>(r1, r4, r6, r7)
            androidx.camera.lifecycle.LifecycleCamera r2 = r2.createLifecycleCamera(r13, r3)
        Lb4:
            r7 = r2
            java.util.LinkedHashSet r13 = r14.getCameraFilterSet()
            java.util.Iterator r13 = r13.iterator()
        Lbd:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto Lf2
            java.lang.Object r14 = r13.next()
            androidx.camera.core.CameraFilter r14 = (androidx.camera.core.CameraFilter) r14
            androidx.camera.core.impl.Identifier r1 = r14.getIdentifier()
            androidx.camera.core.impl.Identifier r2 = androidx.camera.core.CameraFilter.DEFAULT_ID
            if (r1 == r2) goto Lbd
            androidx.camera.core.impl.Identifier r14 = r14.getIdentifier()
            androidx.camera.core.impl.CameraConfigProvider r14 = androidx.camera.core.impl.ExtendedCameraConfigProviderStore.getConfigProvider(r14)
            androidx.camera.core.CameraInfo r1 = r7.getCameraInfo()
            android.content.Context r2 = r12.mContext
            androidx.camera.core.impl.CameraConfig r14 = r14.getConfig(r1, r2)
            if (r14 != 0) goto Le6
            goto Lbd
        Le6:
            if (r5 != 0) goto Lea
            r5 = r14
            goto Lbd
        Lea:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "Cannot apply multiple extended camera configs at the same time."
            r13.<init>(r14)
            throw r13
        Lf2:
            r7.setExtendedConfig(r5)
            int r13 = r0.length
            if (r13 != 0) goto Lf9
            return r7
        Lf9:
            androidx.camera.lifecycle.LifecycleCameraRepository r6 = r12.mLifecycleCameraRepository
            java.util.List r10 = java.util.Arrays.asList(r0)
            androidx.camera.core.CameraX r13 = r12.mCameraX
            androidx.camera.core.impl.CameraFactory r13 = r13.getCameraFactory()
            androidx.camera.core.concurrent.CameraCoordinator r11 = r13.getCameraCoordinator()
            r8 = r15
            r9 = r16
            r6.bindToLifecycleCamera(r7, r8, r9, r10, r11)
            return r7
        L110:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "Provided camera selector unable to resolve a camera for the given use case"
            r13.<init>(r14)
            throw r13
    }

    @androidx.annotation.NonNull
    @androidx.annotation.MainThread
    public androidx.camera.core.Camera bindToLifecycle(@androidx.annotation.NonNull androidx.lifecycle.LifecycleOwner r8, @androidx.annotation.NonNull androidx.camera.core.CameraSelector r9, @androidx.annotation.NonNull androidx.camera.core.UseCase... r10) {
            r7 = this;
            int r0 = r7.getCameraOperatingMode()
            r1 = 2
            if (r0 == r1) goto L17
            r0 = 1
            r7.setCameraOperatingMode(r0)
            r4 = 0
            java.util.List r5 = java.util.Collections.EMPTY_LIST
            r1 = r7
            r2 = r8
            r3 = r9
            r6 = r10
            androidx.camera.core.Camera r8 = r1.bindToLifecycle(r2, r3, r4, r5, r6)
            return r8
        L17:
            java.lang.UnsupportedOperationException r8 = new java.lang.UnsupportedOperationException
            java.lang.String r9 = "bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first"
            r8.<init>(r9)
            throw r8
    }

    @androidx.annotation.NonNull
    @androidx.annotation.MainThread
    public androidx.camera.core.ConcurrentCamera bindToLifecycle(@androidx.annotation.NonNull java.util.List<androidx.camera.core.ConcurrentCamera.SingleCameraConfig> r12) {
            r11 = this;
            android.content.Context r0 = r11.mContext
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            java.lang.String r1 = "android.hardware.camera.concurrent"
            boolean r0 = r0.hasSystemFeature(r1)
            if (r0 == 0) goto Le7
            int r0 = r11.getCameraOperatingMode()
            r1 = 1
            if (r0 == r1) goto Lde
            int r0 = r12.size()
            r2 = 2
            if (r0 < r2) goto Ld5
            int r0 = r12.size()
            if (r0 > r2) goto Lcc
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r3 = r11.getAvailableCameraInfos()
            r4 = 0
            java.lang.Object r5 = r12.get(r4)
            androidx.camera.core.ConcurrentCamera$SingleCameraConfig r5 = (androidx.camera.core.ConcurrentCamera.SingleCameraConfig) r5
            androidx.camera.core.CameraSelector r5 = r5.getCameraSelector()
            androidx.camera.core.CameraInfo r5 = r11.getCameraInfoFromCameraSelector(r5, r3)
            java.lang.Object r1 = r12.get(r1)
            androidx.camera.core.ConcurrentCamera$SingleCameraConfig r1 = (androidx.camera.core.ConcurrentCamera.SingleCameraConfig) r1
            androidx.camera.core.CameraSelector r1 = r1.getCameraSelector()
            androidx.camera.core.CameraInfo r1 = r11.getCameraInfoFromCameraSelector(r1, r3)
            if (r5 == 0) goto Lc3
            if (r1 == 0) goto Lc3
            r0.add(r5)
            r0.add(r1)
            java.util.List r1 = r11.getActiveConcurrentCameraInfos()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L6f
            java.util.List r1 = r11.getActiveConcurrentCameraInfos()
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L67
            goto L6f
        L67:
            java.lang.UnsupportedOperationException r12 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Cameras are already running, call unbindAll() before binding more cameras"
            r12.<init>(r0)
            throw r12
        L6f:
            r11.setCameraOperatingMode(r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r12 = r12.iterator()
        L7b:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto Lb9
            java.lang.Object r2 = r12.next()
            androidx.camera.core.ConcurrentCamera$SingleCameraConfig r2 = (androidx.camera.core.ConcurrentCamera.SingleCameraConfig) r2
            androidx.lifecycle.LifecycleOwner r6 = r2.getLifecycleOwner()
            androidx.camera.core.CameraSelector r7 = r2.getCameraSelector()
            androidx.camera.core.UseCaseGroup r3 = r2.getUseCaseGroup()
            androidx.camera.core.ViewPort r8 = r3.getViewPort()
            androidx.camera.core.UseCaseGroup r3 = r2.getUseCaseGroup()
            java.util.List r9 = r3.getEffects()
            androidx.camera.core.UseCaseGroup r2 = r2.getUseCaseGroup()
            java.util.List r2 = r2.getUseCases()
            androidx.camera.core.UseCase[] r3 = new androidx.camera.core.UseCase[r4]
            java.lang.Object[] r2 = r2.toArray(r3)
            r10 = r2
            androidx.camera.core.UseCase[] r10 = (androidx.camera.core.UseCase[]) r10
            r5 = r11
            androidx.camera.core.Camera r2 = r5.bindToLifecycle(r6, r7, r8, r9, r10)
            r1.add(r2)
            goto L7b
        Lb9:
            r5 = r11
            r11.setActiveConcurrentCameraInfos(r0)
            androidx.camera.core.ConcurrentCamera r12 = new androidx.camera.core.ConcurrentCamera
            r12.<init>(r1)
            return r12
        Lc3:
            r5 = r11
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid camera selectors in camera configs"
            r12.<init>(r0)
            throw r12
        Lcc:
            r5 = r11
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Concurrent camera is only supporting two  cameras at maximum."
            r12.<init>(r0)
            throw r12
        Ld5:
            r5 = r11
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Concurrent camera needs two camera configs"
            r12.<init>(r0)
            throw r12
        Lde:
            r5 = r11
            java.lang.UnsupportedOperationException r12 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Camera is already running, call unbindAll() before binding more cameras"
            r12.<init>(r0)
            throw r12
        Le7:
            r5 = r11
            java.lang.UnsupportedOperationException r12 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Concurrent camera is not supported on the device"
            r12.<init>(r0)
            throw r12
    }

    @Override // androidx.camera.core.CameraProvider
    @androidx.annotation.NonNull
    public java.util.List<androidx.camera.core.CameraInfo> getAvailableCameraInfos() {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            androidx.camera.core.CameraX r1 = r3.mCameraX
            androidx.camera.core.impl.CameraRepository r1 = r1.getCameraRepository()
            java.util.LinkedHashSet r1 = r1.getCameras()
            java.util.Iterator r1 = r1.iterator()
        L13:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L27
            java.lang.Object r2 = r1.next()
            androidx.camera.core.impl.CameraInternal r2 = (androidx.camera.core.impl.CameraInternal) r2
            androidx.camera.core.CameraInfo r2 = r2.getCameraInfo()
            r0.add(r2)
            goto L13
        L27:
            return r0
    }

    @androidx.annotation.NonNull
    public java.util.List<java.util.List<androidx.camera.core.CameraInfo>> getAvailableConcurrentCameraInfos() {
            r6 = this;
            androidx.camera.core.CameraX r0 = r6.mCameraX
            java.util.Objects.requireNonNull(r0)
            androidx.camera.core.CameraX r0 = r6.mCameraX
            androidx.camera.core.impl.CameraFactory r0 = r0.getCameraFactory()
            androidx.camera.core.concurrent.CameraCoordinator r0 = r0.getCameraCoordinator()
            java.util.Objects.requireNonNull(r0)
            androidx.camera.core.CameraX r0 = r6.mCameraX
            androidx.camera.core.impl.CameraFactory r0 = r0.getCameraFactory()
            androidx.camera.core.concurrent.CameraCoordinator r0 = r0.getCameraCoordinator()
            java.util.List r0 = r0.getConcurrentCameraSelectors()
            java.util.List r1 = r6.getAvailableCameraInfos()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L2d:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L5c
            java.lang.Object r3 = r0.next()
            java.util.List r3 = (java.util.List) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L42:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L58
            java.lang.Object r5 = r3.next()
            androidx.camera.core.CameraSelector r5 = (androidx.camera.core.CameraSelector) r5
            androidx.camera.core.CameraInfo r5 = r6.getCameraInfoFromCameraSelector(r5, r1)
            if (r5 == 0) goto L42
            r4.add(r5)
            goto L42
        L58:
            r2.add(r4)
            goto L2d
        L5c:
            return r2
    }

    @Override // androidx.camera.core.CameraProvider
    public boolean hasCamera(@androidx.annotation.NonNull androidx.camera.core.CameraSelector r2) throws androidx.camera.core.CameraInfoUnavailableException {
            r1 = this;
            androidx.camera.core.CameraX r0 = r1.mCameraX     // Catch: java.lang.IllegalArgumentException -> Lf
            androidx.camera.core.impl.CameraRepository r0 = r0.getCameraRepository()     // Catch: java.lang.IllegalArgumentException -> Lf
            java.util.LinkedHashSet r0 = r0.getCameras()     // Catch: java.lang.IllegalArgumentException -> Lf
            r2.select(r0)     // Catch: java.lang.IllegalArgumentException -> Lf
            r2 = 1
            return r2
        Lf:
            r2 = 0
            return r2
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraProvider
    public boolean isBound(@androidx.annotation.NonNull androidx.camera.core.UseCase r3) {
            r2 = this;
            androidx.camera.lifecycle.LifecycleCameraRepository r0 = r2.mLifecycleCameraRepository
            java.util.Collection r0 = r0.getLifecycleCameras()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            androidx.camera.lifecycle.LifecycleCamera r1 = (androidx.camera.lifecycle.LifecycleCamera) r1
            boolean r1 = r1.isBound(r3)
            if (r1 == 0) goto La
            r3 = 1
            return r3
        L1e:
            r3 = 0
            return r3
    }

    @androidx.annotation.MainThread
    public boolean isConcurrentCameraModeOn() {
            r2 = this;
            int r0 = r2.getCameraOperatingMode()
            r1 = 2
            if (r0 != r1) goto L9
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    @androidx.annotation.VisibleForTesting
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> shutdown() {
            r3 = this;
            androidx.camera.lifecycle.c r0 = new androidx.camera.lifecycle.c
            r0.<init>(r3)
            androidx.camera.core.impl.utils.Threads.runOnMainSync(r0)
            androidx.camera.core.CameraX r0 = r3.mCameraX
            if (r0 == 0) goto L17
            androidx.camera.core.impl.CameraFactory r0 = r0.getCameraFactory()
            androidx.camera.core.concurrent.CameraCoordinator r0 = r0.getCameraCoordinator()
            r0.shutdown()
        L17:
            androidx.camera.core.CameraX r0 = r3.mCameraX
            r1 = 0
            if (r0 == 0) goto L21
            com.google.common.util.concurrent.ListenableFuture r0 = r0.shutdown()
            goto L25
        L21:
            com.google.common.util.concurrent.ListenableFuture r0 = androidx.camera.core.impl.utils.futures.Futures.immediateFuture(r1)
        L25:
            java.lang.Object r2 = r3.mLock
            monitor-enter(r2)
            r3.mCameraXConfigProvider = r1     // Catch: java.lang.Throwable -> L34
            r3.mCameraXInitializeFuture = r1     // Catch: java.lang.Throwable -> L34
            r3.mCameraXShutdownFuture = r0     // Catch: java.lang.Throwable -> L34
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L34
            r3.mCameraX = r1
            r3.mContext = r1
            return r0
        L34:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L34
            throw r0
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraProvider
    @androidx.annotation.MainThread
    public void unbind(@androidx.annotation.NonNull androidx.camera.core.UseCase... r3) {
            r2 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            int r0 = r2.getCameraOperatingMode()
            r1 = 2
            if (r0 == r1) goto L14
            androidx.camera.lifecycle.LifecycleCameraRepository r0 = r2.mLifecycleCameraRepository
            java.util.List r3 = java.util.Arrays.asList(r3)
            r0.unbind(r3)
            return
        L14:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "unbind usecase is not supported in concurrent camera mode, call unbindAll() first"
            r3.<init>(r0)
            throw r3
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraProvider
    @androidx.annotation.MainThread
    public void unbindAll() {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            r0 = 0
            r1.setCameraOperatingMode(r0)
            androidx.camera.lifecycle.LifecycleCameraRepository r0 = r1.mLifecycleCameraRepository
            r0.unbindAll()
            return
    }
}
