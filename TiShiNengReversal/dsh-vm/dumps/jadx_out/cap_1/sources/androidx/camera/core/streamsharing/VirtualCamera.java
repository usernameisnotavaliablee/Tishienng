package androidx.camera.core.streamsharing;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(api = 21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class VirtualCamera implements androidx.camera.core.impl.CameraInternal {
    private static final java.lang.String UNSUPPORTED_MESSAGE = "Operation not supported by VirtualCamera.";

    @androidx.annotation.NonNull
    final java.util.Set<androidx.camera.core.UseCase> mChildren;

    @androidx.annotation.NonNull
    final java.util.Map<androidx.camera.core.UseCase, java.lang.Boolean> mChildrenActiveState;

    @androidx.annotation.NonNull
    final java.util.Map<androidx.camera.core.UseCase, androidx.camera.core.processing.SurfaceEdge> mChildrenEdges;

    @androidx.annotation.NonNull
    private final androidx.camera.core.impl.CameraInternal mParentCamera;

    @androidx.annotation.NonNull
    private final androidx.camera.core.impl.CameraCaptureCallback mParentMetadataCallback;

    @androidx.annotation.NonNull
    private final androidx.camera.core.impl.UseCaseConfigFactory mUseCaseConfigFactory;

    @androidx.annotation.NonNull
    private final androidx.camera.core.streamsharing.VirtualCameraControl mVirtualCameraControl;


    VirtualCamera(@androidx.annotation.NonNull androidx.camera.core.impl.CameraInternal r2, @androidx.annotation.NonNull java.util.Set<androidx.camera.core.UseCase> r3, @androidx.annotation.NonNull androidx.camera.core.impl.UseCaseConfigFactory r4, @androidx.annotation.NonNull androidx.camera.core.streamsharing.StreamSharing.Control r5) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mChildrenEdges = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mChildrenActiveState = r0
            androidx.camera.core.impl.CameraCaptureCallback r0 = r1.createCameraCaptureCallback()
            r1.mParentMetadataCallback = r0
            r1.mParentCamera = r2
            r1.mUseCaseConfigFactory = r4
            r1.mChildren = r3
            androidx.camera.core.streamsharing.VirtualCameraControl r4 = new androidx.camera.core.streamsharing.VirtualCameraControl
            androidx.camera.core.impl.CameraControlInternal r2 = r2.getCameraControlInternal()
            r4.<init>(r2, r5)
            r1.mVirtualCameraControl = r4
            java.util.Iterator r2 = r3.iterator()
        L2c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L40
            java.lang.Object r3 = r2.next()
            androidx.camera.core.UseCase r3 = (androidx.camera.core.UseCase) r3
            java.util.Map<androidx.camera.core.UseCase, java.lang.Boolean> r4 = r1.mChildrenActiveState
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r4.put(r3, r5)
            goto L2c
        L40:
            return
    }

    private void forceSetProvider(@androidx.annotation.NonNull androidx.camera.core.processing.SurfaceEdge r2, @androidx.annotation.NonNull androidx.camera.core.impl.DeferrableSurface r3, @androidx.annotation.NonNull androidx.camera.core.impl.SessionConfig r4) {
            r1 = this;
            r2.invalidate()
            r2.setProvider(r3)     // Catch: androidx.camera.core.impl.DeferrableSurface.SurfaceClosedException -> L7
            return
        L7:
            java.util.List r2 = r4.getErrorListeners()
            java.util.Iterator r2 = r2.iterator()
        Lf:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L21
            java.lang.Object r3 = r2.next()
            androidx.camera.core.impl.SessionConfig$ErrorListener r3 = (androidx.camera.core.impl.SessionConfig.ErrorListener) r3
            androidx.camera.core.impl.SessionConfig$SessionError r0 = androidx.camera.core.impl.SessionConfig.SessionError.SESSION_ERROR_SURFACE_NEEDS_RESET
            r3.onError(r4, r0)
            goto Lf
        L21:
            return
    }

    private static int getChildFormat(@androidx.annotation.NonNull androidx.camera.core.UseCase r0) {
            boolean r0 = r0 instanceof androidx.camera.core.ImageCapture
            if (r0 == 0) goto L7
            r0 = 256(0x100, float:3.59E-43)
            return r0
        L7:
            r0 = 34
            return r0
    }

    @androidx.annotation.IntRange(from = 0, to = 359)
    private int getChildRotationDegrees(@androidx.annotation.NonNull androidx.camera.core.UseCase r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.camera.core.Preview
            if (r0 == 0) goto L15
            androidx.camera.core.impl.CameraInternal r0 = r1.mParentCamera
            androidx.camera.core.CameraInfo r0 = r0.getCameraInfo()
            androidx.camera.core.Preview r2 = (androidx.camera.core.Preview) r2
            int r2 = r2.getTargetRotation()
            int r2 = r0.getSensorRotationDegrees(r2)
            return r2
        L15:
            r2 = 0
            return r2
    }

    @androidx.annotation.Nullable
    @androidx.annotation.VisibleForTesting
    static androidx.camera.core.impl.DeferrableSurface getChildSurface(@androidx.annotation.NonNull androidx.camera.core.UseCase r3) {
            boolean r0 = r3 instanceof androidx.camera.core.ImageCapture
            if (r0 == 0) goto Ld
            androidx.camera.core.impl.SessionConfig r3 = r3.getSessionConfig()
            java.util.List r3 = r3.getSurfaces()
            goto L19
        Ld:
            androidx.camera.core.impl.SessionConfig r3 = r3.getSessionConfig()
            androidx.camera.core.impl.CaptureConfig r3 = r3.getRepeatingCaptureConfig()
            java.util.List r3 = r3.getSurfaces()
        L19:
            int r0 = r3.size()
            r1 = 0
            r2 = 1
            if (r0 > r2) goto L23
            r0 = 1
            goto L24
        L23:
            r0 = 0
        L24:
            androidx.core.util.Preconditions.checkState(r0)
            int r0 = r3.size()
            if (r0 != r2) goto L34
            java.lang.Object r3 = r3.get(r1)
            androidx.camera.core.impl.DeferrableSurface r3 = (androidx.camera.core.impl.DeferrableSurface) r3
            return r3
        L34:
            r3 = 0
            return r3
    }

    private static int getChildTargetType(@androidx.annotation.NonNull androidx.camera.core.UseCase r1) {
            boolean r0 = r1 instanceof androidx.camera.core.Preview
            if (r0 == 0) goto L6
            r1 = 1
            return r1
        L6:
            boolean r1 = r1 instanceof androidx.camera.core.ImageCapture
            if (r1 == 0) goto Lc
            r1 = 4
            return r1
        Lc:
            r1 = 2
            return r1
    }

    private static int getHighestSurfacePriority(java.util.Set<androidx.camera.core.impl.UseCaseConfig<?>> r2) {
            java.util.Iterator r2 = r2.iterator()
            r0 = 0
        L5:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r2.next()
            androidx.camera.core.impl.UseCaseConfig r1 = (androidx.camera.core.impl.UseCaseConfig) r1
            int r1 = r1.getSurfaceOccupancyPriority()
            int r0 = java.lang.Math.max(r0, r1)
            goto L5
        L1a:
            return r0
    }

    @androidx.annotation.NonNull
    private androidx.camera.core.processing.SurfaceEdge getUseCaseEdge(@androidx.annotation.NonNull androidx.camera.core.UseCase r2) {
            r1 = this;
            java.util.Map<androidx.camera.core.UseCase, androidx.camera.core.processing.SurfaceEdge> r0 = r1.mChildrenEdges
            java.lang.Object r2 = r0.get(r2)
            androidx.camera.core.processing.SurfaceEdge r2 = (androidx.camera.core.processing.SurfaceEdge) r2
            java.util.Objects.requireNonNull(r2)
            return r2
    }

    private boolean isUseCaseActive(@androidx.annotation.NonNull androidx.camera.core.UseCase r2) {
            r1 = this;
            java.util.Map<androidx.camera.core.UseCase, java.lang.Boolean> r0 = r1.mChildrenActiveState
            java.lang.Object r2 = r0.get(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            java.util.Objects.requireNonNull(r2)
            boolean r2 = r2.booleanValue()
            return r2
    }

    static void sendCameraCaptureResultToChild(@androidx.annotation.NonNull androidx.camera.core.impl.CameraCaptureResult r4, @androidx.annotation.NonNull androidx.camera.core.impl.SessionConfig r5) {
            java.util.List r0 = r5.getRepeatingCameraCaptureCallbacks()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r0.next()
            androidx.camera.core.impl.CameraCaptureCallback r1 = (androidx.camera.core.impl.CameraCaptureCallback) r1
            androidx.camera.core.streamsharing.VirtualCameraCaptureResult r2 = new androidx.camera.core.streamsharing.VirtualCameraCaptureResult
            androidx.camera.core.impl.CaptureConfig r3 = r5.getRepeatingCaptureConfig()
            androidx.camera.core.impl.TagBundle r3 = r3.getTagBundle()
            r2.<init>(r3, r4)
            r1.onCaptureCompleted(r2)
            goto L8
        L25:
            return
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void attachUseCases(@androidx.annotation.NonNull java.util.Collection<androidx.camera.core.UseCase> r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation not supported by VirtualCamera."
            r2.<init>(r0)
            throw r2
    }

    void bindChildren() {
            r4 = this;
            java.util.Set<androidx.camera.core.UseCase> r0 = r4.mChildren
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            androidx.camera.core.UseCase r1 = (androidx.camera.core.UseCase) r1
            r2 = 1
            androidx.camera.core.impl.UseCaseConfigFactory r3 = r4.mUseCaseConfigFactory
            androidx.camera.core.impl.UseCaseConfig r2 = r1.getDefaultConfig(r2, r3)
            r3 = 0
            r1.bindToCamera(r4, r3, r2)
            goto L6
        L1e:
            return
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void close() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation not supported by VirtualCamera."
            r0.<init>(r1)
            throw r0
    }

    androidx.camera.core.impl.CameraCaptureCallback createCameraCaptureCallback() {
            r1 = this;
            androidx.camera.core.streamsharing.VirtualCamera$1 r0 = new androidx.camera.core.streamsharing.VirtualCamera$1
            r0.<init>(r1)
            return r0
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void detachUseCases(@androidx.annotation.NonNull java.util.Collection<androidx.camera.core.UseCase> r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation not supported by VirtualCamera."
            r2.<init>(r0)
            throw r2
    }

    @Override // androidx.camera.core.impl.CameraInternal, androidx.camera.core.Camera
    public /* synthetic */ androidx.camera.core.CameraControl getCameraControl() {
            r1 = this;
            androidx.camera.core.CameraControl r0 = androidx.camera.core.impl.j.a(r1)
            return r0
    }

    @Override // androidx.camera.core.impl.CameraInternal
    @androidx.annotation.NonNull
    public androidx.camera.core.impl.CameraControlInternal getCameraControlInternal() {
            r1 = this;
            androidx.camera.core.streamsharing.VirtualCameraControl r0 = r1.mVirtualCameraControl
            return r0
    }

    @Override // androidx.camera.core.impl.CameraInternal, androidx.camera.core.Camera
    public /* synthetic */ androidx.camera.core.CameraInfo getCameraInfo() {
            r1 = this;
            androidx.camera.core.CameraInfo r0 = androidx.camera.core.impl.j.b(r1)
            return r0
    }

    @Override // androidx.camera.core.impl.CameraInternal
    @androidx.annotation.NonNull
    public androidx.camera.core.impl.CameraInfoInternal getCameraInfoInternal() {
            r1 = this;
            androidx.camera.core.impl.CameraInternal r0 = r1.mParentCamera
            androidx.camera.core.impl.CameraInfoInternal r0 = r0.getCameraInfoInternal()
            return r0
    }

    @Override // androidx.camera.core.impl.CameraInternal, androidx.camera.core.Camera
    public /* synthetic */ java.util.LinkedHashSet getCameraInternals() {
            r1 = this;
            java.util.LinkedHashSet r0 = androidx.camera.core.impl.j.c(r1)
            return r0
    }

    @Override // androidx.camera.core.impl.CameraInternal
    @androidx.annotation.NonNull
    public androidx.camera.core.impl.Observable<androidx.camera.core.impl.CameraInternal.State> getCameraState() {
            r1 = this;
            androidx.camera.core.impl.CameraInternal r0 = r1.mParentCamera
            androidx.camera.core.impl.Observable r0 = r0.getCameraState()
            return r0
    }

    @androidx.annotation.NonNull
    java.util.Set<androidx.camera.core.UseCase> getChildren() {
            r1 = this;
            java.util.Set<androidx.camera.core.UseCase> r0 = r1.mChildren
            return r0
    }

    @androidx.annotation.NonNull
    java.util.Map<androidx.camera.core.UseCase, androidx.camera.core.processing.SurfaceProcessorNode.OutConfig> getChildrenOutConfigs(@androidx.annotation.NonNull androidx.camera.core.processing.SurfaceEdge r10) {
            r9 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set<androidx.camera.core.UseCase> r1 = r9.mChildren
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3b
            java.lang.Object r2 = r1.next()
            androidx.camera.core.UseCase r2 = (androidx.camera.core.UseCase) r2
            int r7 = r9.getChildRotationDegrees(r2)
            int r3 = getChildTargetType(r2)
            int r4 = getChildFormat(r2)
            android.graphics.Rect r5 = r10.getCropRect()
            android.graphics.Rect r6 = r10.getCropRect()
            android.util.Size r6 = androidx.camera.core.impl.utils.TransformUtils.getRotatedSize(r6, r7)
            boolean r8 = r2.isMirroringRequired(r9)
            androidx.camera.core.processing.SurfaceProcessorNode$OutConfig r3 = androidx.camera.core.processing.SurfaceProcessorNode.OutConfig.of(r3, r4, r5, r6, r7, r8)
            r0.put(r2, r3)
            goto Lb
        L3b:
            return r0
    }

    @Override // androidx.camera.core.impl.CameraInternal, androidx.camera.core.Camera
    public /* synthetic */ androidx.camera.core.impl.CameraConfig getExtendedConfig() {
            r1 = this;
            androidx.camera.core.impl.CameraConfig r0 = androidx.camera.core.impl.j.d(r1)
            return r0
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public boolean getHasTransform() {
            r1 = this;
            r0 = 0
            return r0
    }

    @androidx.annotation.NonNull
    androidx.camera.core.impl.CameraCaptureCallback getParentMetadataCallback() {
            r1 = this;
            androidx.camera.core.impl.CameraCaptureCallback r0 = r1.mParentMetadataCallback
            return r0
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public /* synthetic */ boolean isFrontFacing() {
            r1 = this;
            boolean r0 = androidx.camera.core.impl.j.f(r1)
            return r0
    }

    @Override // androidx.camera.core.Camera
    public /* synthetic */ boolean isUseCasesCombinationSupported(androidx.camera.core.UseCase... r1) {
            r0 = this;
            boolean r1 = androidx.camera.core.c.a(r0, r1)
            return r1
    }

    void mergeChildrenConfigs(@androidx.annotation.NonNull androidx.camera.core.impl.MutableConfig r7) {
            r6 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Set<androidx.camera.core.UseCase> r1 = r6.mChildren
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r1.next()
            androidx.camera.core.UseCase r2 = (androidx.camera.core.UseCase) r2
            androidx.camera.core.impl.CameraInternal r3 = r6.mParentCamera
            androidx.camera.core.impl.CameraInfoInternal r3 = r3.getCameraInfoInternal()
            r4 = 1
            androidx.camera.core.impl.UseCaseConfigFactory r5 = r6.mUseCaseConfigFactory
            androidx.camera.core.impl.UseCaseConfig r4 = r2.getDefaultConfig(r4, r5)
            r5 = 0
            androidx.camera.core.impl.UseCaseConfig r2 = r2.mergeConfigs(r3, r5, r4)
            r0.add(r2)
            goto Lb
        L2d:
            java.util.ArrayList r1 = new java.util.ArrayList
            androidx.camera.core.impl.CameraInternal r2 = r6.mParentCamera
            androidx.camera.core.impl.CameraInfoInternal r2 = r2.getCameraInfoInternal()
            r3 = 34
            java.util.List r2 = r2.getSupportedResolutions(r3)
            r1.<init>(r2)
            androidx.camera.core.impl.CameraInternal r2 = r6.mParentCamera
            androidx.camera.core.impl.CameraControlInternal r2 = r2.getCameraControlInternal()
            android.graphics.Rect r2 = r2.getSensorRect()
            android.util.Size r2 = androidx.camera.core.impl.utils.TransformUtils.rectToSize(r2)
            androidx.camera.core.impl.Config$Option<java.util.List<android.util.Size>> r3 = androidx.camera.core.impl.ImageOutputConfig.OPTION_CUSTOM_ORDERED_RESOLUTIONS
            java.util.List r1 = androidx.camera.core.streamsharing.ResolutionUtils.getMergedResolutions(r1, r2, r0)
            r7.insertOption(r3, r1)
            androidx.camera.core.impl.Config$Option<java.lang.Integer> r1 = androidx.camera.core.impl.UseCaseConfig.OPTION_SURFACE_OCCUPANCY_PRIORITY
            int r0 = getHighestSurfacePriority(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7.insertOption(r1, r0)
            return
    }

    void notifyStateAttached() {
            r2 = this;
            java.util.Set<androidx.camera.core.UseCase> r0 = r2.mChildren
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            androidx.camera.core.UseCase r1 = (androidx.camera.core.UseCase) r1
            r1.onStateAttached()
            goto L6
        L16:
            return
    }

    void notifyStateDetached() {
            r2 = this;
            java.util.Set<androidx.camera.core.UseCase> r0 = r2.mChildren
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            androidx.camera.core.UseCase r1 = (androidx.camera.core.UseCase) r1
            r1.onStateDetached()
            goto L6
        L16:
            return
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    @androidx.annotation.MainThread
    public void onUseCaseActive(@androidx.annotation.NonNull androidx.camera.core.UseCase r3) {
            r2 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            boolean r0 = r2.isUseCaseActive(r3)
            if (r0 == 0) goto La
            goto L22
        La:
            java.util.Map<androidx.camera.core.UseCase, java.lang.Boolean> r0 = r2.mChildrenActiveState
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.put(r3, r1)
            androidx.camera.core.impl.DeferrableSurface r0 = getChildSurface(r3)
            if (r0 == 0) goto L22
            androidx.camera.core.processing.SurfaceEdge r1 = r2.getUseCaseEdge(r3)
            androidx.camera.core.impl.SessionConfig r3 = r3.getSessionConfig()
            r2.forceSetProvider(r1, r0, r3)
        L22:
            return
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    @androidx.annotation.MainThread
    public void onUseCaseInactive(@androidx.annotation.NonNull androidx.camera.core.UseCase r3) {
            r2 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            boolean r0 = r2.isUseCaseActive(r3)
            if (r0 != 0) goto La
            return
        La:
            java.util.Map<androidx.camera.core.UseCase, java.lang.Boolean> r0 = r2.mChildrenActiveState
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.put(r3, r1)
            androidx.camera.core.processing.SurfaceEdge r3 = r2.getUseCaseEdge(r3)
            r3.disconnect()
            return
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    @androidx.annotation.MainThread
    public void onUseCaseReset(@androidx.annotation.NonNull androidx.camera.core.UseCase r3) {
            r2 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.core.processing.SurfaceEdge r0 = r2.getUseCaseEdge(r3)
            r0.invalidate()
            boolean r1 = r2.isUseCaseActive(r3)
            if (r1 != 0) goto L11
            goto L1e
        L11:
            androidx.camera.core.impl.DeferrableSurface r1 = getChildSurface(r3)
            if (r1 == 0) goto L1e
            androidx.camera.core.impl.SessionConfig r3 = r3.getSessionConfig()
            r2.forceSetProvider(r0, r1, r3)
        L1e:
            return
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    @androidx.annotation.MainThread
    public void onUseCaseUpdated(@androidx.annotation.NonNull androidx.camera.core.UseCase r3) {
            r2 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            boolean r0 = r2.isUseCaseActive(r3)
            if (r0 != 0) goto La
            return
        La:
            androidx.camera.core.processing.SurfaceEdge r0 = r2.getUseCaseEdge(r3)
            androidx.camera.core.impl.DeferrableSurface r1 = getChildSurface(r3)
            if (r1 == 0) goto L1c
            androidx.camera.core.impl.SessionConfig r3 = r3.getSessionConfig()
            r2.forceSetProvider(r0, r1, r3)
            return
        L1c:
            r0.disconnect()
            return
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void open() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation not supported by VirtualCamera."
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.camera.core.impl.CameraInternal
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> release() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation not supported by VirtualCamera."
            r0.<init>(r1)
            throw r0
    }

    void resetChildren() {
            r2 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            java.util.Set<androidx.camera.core.UseCase> r0 = r2.mChildren
            java.util.Iterator r0 = r0.iterator()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            androidx.camera.core.UseCase r1 = (androidx.camera.core.UseCase) r1
            r2.onUseCaseReset(r1)
            goto L9
        L19:
            return
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public /* synthetic */ void setActiveResumingMode(boolean r1) {
            r0 = this;
            androidx.camera.core.impl.j.g(r0, r1)
            return
    }

    void setChildrenEdges(@androidx.annotation.NonNull java.util.Map<androidx.camera.core.UseCase, androidx.camera.core.processing.SurfaceEdge> r4) {
            r3 = this;
            java.util.Map<androidx.camera.core.UseCase, androidx.camera.core.processing.SurfaceEdge> r0 = r3.mChildrenEdges
            r0.clear()
            java.util.Map<androidx.camera.core.UseCase, androidx.camera.core.processing.SurfaceEdge> r0 = r3.mChildrenEdges
            r0.putAll(r4)
            java.util.Map<androidx.camera.core.UseCase, androidx.camera.core.processing.SurfaceEdge> r4 = r3.mChildrenEdges
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L14:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L45
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            androidx.camera.core.UseCase r1 = (androidx.camera.core.UseCase) r1
            java.lang.Object r0 = r0.getValue()
            androidx.camera.core.processing.SurfaceEdge r0 = (androidx.camera.core.processing.SurfaceEdge) r0
            android.graphics.Rect r2 = r0.getCropRect()
            r1.setViewPortCropRect(r2)
            android.graphics.Matrix r2 = r0.getSensorToBufferTransform()
            r1.setSensorToBufferTransformMatrix(r2)
            androidx.camera.core.impl.StreamSpec r0 = r0.getStreamSpec()
            r1.updateSuggestedStreamSpec(r0)
            r1.notifyState()
            goto L14
        L45:
            return
    }

    @Override // androidx.camera.core.impl.CameraInternal, androidx.camera.core.Camera
    public /* synthetic */ void setExtendedConfig(androidx.camera.core.impl.CameraConfig r1) {
            r0 = this;
            androidx.camera.core.impl.j.h(r0, r1)
            return
    }

    void unbindChildren() {
            r2 = this;
            java.util.Set<androidx.camera.core.UseCase> r0 = r2.mChildren
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            androidx.camera.core.UseCase r1 = (androidx.camera.core.UseCase) r1
            r1.unbindFromCamera(r2)
            goto L6
        L16:
            return
    }
}
