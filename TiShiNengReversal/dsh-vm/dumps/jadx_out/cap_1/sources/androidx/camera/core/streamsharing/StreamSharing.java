package androidx.camera.core.streamsharing;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(api = 21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class StreamSharing extends androidx.camera.core.UseCase {
    private static final java.lang.String TAG = "StreamSharing";

    @androidx.annotation.Nullable
    private androidx.camera.core.processing.SurfaceEdge mCameraEdge;

    @androidx.annotation.NonNull
    private final androidx.camera.core.streamsharing.StreamSharingConfig mDefaultConfig;

    @androidx.annotation.Nullable
    private androidx.camera.core.processing.SurfaceProcessorNode mEffectNode;
    androidx.camera.core.impl.SessionConfig.Builder mSessionConfigBuilder;

    @androidx.annotation.Nullable
    private androidx.camera.core.processing.SurfaceEdge mSharingInputEdge;

    @androidx.annotation.Nullable
    private androidx.camera.core.processing.SurfaceProcessorNode mSharingNode;

    @androidx.annotation.NonNull
    private final androidx.camera.core.streamsharing.VirtualCamera mVirtualCamera;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface Control {
        @androidx.annotation.NonNull
        com.google.common.util.concurrent.ListenableFuture<java.lang.Void> jpegSnapshot(@androidx.annotation.IntRange(from = 0, to = 100) int r1, @androidx.annotation.IntRange(from = 0, to = 359) int r2);
    }

    public StreamSharing(@androidx.annotation.NonNull androidx.camera.core.impl.CameraInternal r3, @androidx.annotation.NonNull java.util.Set<androidx.camera.core.UseCase> r4, @androidx.annotation.NonNull androidx.camera.core.impl.UseCaseConfigFactory r5) {
            r2 = this;
            androidx.camera.core.streamsharing.StreamSharingConfig r0 = getDefaultConfig(r4)
            r2.<init>(r0)
            androidx.camera.core.streamsharing.StreamSharingConfig r0 = getDefaultConfig(r4)
            r2.mDefaultConfig = r0
            androidx.camera.core.streamsharing.VirtualCamera r0 = new androidx.camera.core.streamsharing.VirtualCamera
            androidx.camera.core.streamsharing.b r1 = new androidx.camera.core.streamsharing.b
            r1.<init>(r2)
            r0.<init>(r3, r4, r5, r1)
            r2.mVirtualCamera = r0
            return
    }

    public static /* synthetic */ void a(androidx.camera.core.streamsharing.StreamSharing r0, java.lang.String r1, androidx.camera.core.impl.UseCaseConfig r2, androidx.camera.core.impl.StreamSpec r3, androidx.camera.core.impl.SessionConfig r4, androidx.camera.core.impl.SessionConfig.SessionError r5) {
            r0.clearPipeline()
            boolean r4 = r0.isCurrentCamera(r1)
            if (r4 == 0) goto L18
            androidx.camera.core.impl.SessionConfig r1 = r0.createPipelineAndUpdateChildrenSpecs(r1, r2, r3)
            r0.updateSessionConfig(r1)
            r0.notifyReset()
            androidx.camera.core.streamsharing.VirtualCamera r0 = r0.mVirtualCamera
            r0.resetChildren()
        L18:
            return
    }

    private void addCameraErrorListener(@androidx.annotation.NonNull androidx.camera.core.impl.SessionConfig.Builder r2, @androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.NonNull androidx.camera.core.impl.UseCaseConfig<?> r4, @androidx.annotation.NonNull androidx.camera.core.impl.StreamSpec r5) {
            r1 = this;
            androidx.camera.core.streamsharing.a r0 = new androidx.camera.core.streamsharing.a
            r0.<init>(r1, r3, r4, r5)
            r2.addErrorListener(r0)
            return
    }

    public static /* synthetic */ com.google.common.util.concurrent.ListenableFuture b(androidx.camera.core.streamsharing.StreamSharing r0, int r1, int r2) {
            androidx.camera.core.processing.SurfaceProcessorNode r0 = r0.mSharingNode
            if (r0 == 0) goto Ld
            androidx.camera.core.processing.SurfaceProcessorInternal r0 = r0.getSurfaceProcessor()
            com.google.common.util.concurrent.ListenableFuture r0 = r0.snapshot(r1, r2)
            return r0
        Ld:
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = "Failed to take picture: pipeline is not ready."
            r0.<init>(r1)
            com.google.common.util.concurrent.ListenableFuture r0 = androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(r0)
            return r0
    }

    private void clearPipeline() {
            r2 = this;
            androidx.camera.core.processing.SurfaceEdge r0 = r2.mCameraEdge
            r1 = 0
            if (r0 == 0) goto La
            r0.close()
            r2.mCameraEdge = r1
        La:
            androidx.camera.core.processing.SurfaceEdge r0 = r2.mSharingInputEdge
            if (r0 == 0) goto L13
            r0.close()
            r2.mSharingInputEdge = r1
        L13:
            androidx.camera.core.processing.SurfaceProcessorNode r0 = r2.mSharingNode
            if (r0 == 0) goto L1c
            r0.release()
            r2.mSharingNode = r1
        L1c:
            androidx.camera.core.processing.SurfaceProcessorNode r0 = r2.mEffectNode
            if (r0 == 0) goto L25
            r0.release()
            r2.mEffectNode = r1
        L25:
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.MainThread
    private androidx.camera.core.impl.SessionConfig createPipelineAndUpdateChildrenSpecs(@androidx.annotation.NonNull java.lang.String r12, @androidx.annotation.NonNull androidx.camera.core.impl.UseCaseConfig<?> r13, @androidx.annotation.NonNull androidx.camera.core.impl.StreamSpec r14) {
            r11 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.core.impl.CameraInternal r0 = r11.getCamera()
            java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r0)
            androidx.camera.core.impl.CameraInternal r0 = (androidx.camera.core.impl.CameraInternal) r0
            androidx.camera.core.processing.SurfaceEdge r1 = new androidx.camera.core.processing.SurfaceEdge
            android.graphics.Matrix r5 = r11.getSensorToBufferTransformMatrix()
            boolean r6 = r0.getHasTransform()
            android.util.Size r2 = r14.getResolution()
            android.graphics.Rect r7 = r11.getCropRect(r2)
            java.util.Objects.requireNonNull(r7)
            int r8 = r11.getRelativeRotation(r0)
            r9 = -1
            boolean r10 = r11.isMirroringRequired(r0)
            r2 = 3
            r3 = 34
            r4 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.mCameraEdge = r1
            androidx.camera.core.processing.SurfaceEdge r14 = r11.getSharingInputEdge(r1, r0)
            r11.mSharingInputEdge = r14
            androidx.camera.core.processing.SurfaceProcessorNode r14 = new androidx.camera.core.processing.SurfaceProcessorNode
            androidx.camera.core.DynamicRange r1 = r4.getDynamicRange()
            androidx.camera.core.processing.SurfaceProcessorInternal r1 = androidx.camera.core.processing.DefaultSurfaceProcessor.Factory.newInstance(r1)
            r14.<init>(r0, r1)
            r11.mSharingNode = r14
            androidx.camera.core.streamsharing.VirtualCamera r14 = r11.mVirtualCamera
            androidx.camera.core.processing.SurfaceEdge r0 = r11.mSharingInputEdge
            java.util.Map r14 = r14.getChildrenOutConfigs(r0)
            androidx.camera.core.processing.SurfaceProcessorNode r0 = r11.mSharingNode
            androidx.camera.core.processing.SurfaceEdge r1 = r11.mSharingInputEdge
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.Collection r3 = r14.values()
            r2.<init>(r3)
            androidx.camera.core.processing.SurfaceProcessorNode$In r1 = androidx.camera.core.processing.SurfaceProcessorNode.In.of(r1, r2)
            androidx.camera.core.processing.SurfaceProcessorNode$Out r0 = r0.transform2(r1)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Set r14 = r14.entrySet()
            java.util.Iterator r14 = r14.iterator()
        L73:
            boolean r2 = r14.hasNext()
            if (r2 == 0) goto L93
            java.lang.Object r2 = r14.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            androidx.camera.core.UseCase r3 = (androidx.camera.core.UseCase) r3
            java.lang.Object r2 = r2.getValue()
            java.lang.Object r2 = r0.get(r2)
            androidx.camera.core.processing.SurfaceEdge r2 = (androidx.camera.core.processing.SurfaceEdge) r2
            r1.put(r3, r2)
            goto L73
        L93:
            androidx.camera.core.streamsharing.VirtualCamera r14 = r11.mVirtualCamera
            r14.setChildrenEdges(r1)
            android.util.Size r14 = r4.getResolution()
            androidx.camera.core.impl.SessionConfig$Builder r14 = androidx.camera.core.impl.SessionConfig.Builder.createFrom(r13, r14)
            androidx.camera.core.processing.SurfaceEdge r0 = r11.mCameraEdge
            androidx.camera.core.impl.DeferrableSurface r0 = r0.getDeferrableSurface()
            r14.addSurface(r0)
            androidx.camera.core.streamsharing.VirtualCamera r0 = r11.mVirtualCamera
            androidx.camera.core.impl.CameraCaptureCallback r0 = r0.getParentMetadataCallback()
            r14.addRepeatingCameraCaptureCallback(r0)
            androidx.camera.core.impl.Config r0 = r4.getImplementationOptions()
            if (r0 == 0) goto Lbf
            androidx.camera.core.impl.Config r0 = r4.getImplementationOptions()
            r14.addImplementationOptions(r0)
        Lbf:
            r11.addCameraErrorListener(r14, r12, r13, r4)
            r11.mSessionConfigBuilder = r14
            androidx.camera.core.impl.SessionConfig r12 = r14.build()
            return r12
    }

    @androidx.annotation.Nullable
    private android.graphics.Rect getCropRect(@androidx.annotation.NonNull android.util.Size r4) {
            r3 = this;
            android.graphics.Rect r0 = r3.getViewPortCropRect()
            if (r0 == 0) goto Lb
            android.graphics.Rect r4 = r3.getViewPortCropRect()
            return r4
        Lb:
            android.graphics.Rect r0 = new android.graphics.Rect
            int r1 = r4.getWidth()
            int r4 = r4.getHeight()
            r2 = 0
            r0.<init>(r2, r2, r1, r4)
            return r0
    }

    private static androidx.camera.core.streamsharing.StreamSharingConfig getDefaultConfig(java.util.Set<androidx.camera.core.UseCase> r5) {
            androidx.camera.core.streamsharing.StreamSharingBuilder r0 = new androidx.camera.core.streamsharing.StreamSharingBuilder
            r0.<init>()
            androidx.camera.core.impl.MutableConfig r0 = r0.getMutableConfig()
            androidx.camera.core.impl.Config$Option<java.lang.Integer> r1 = androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_FORMAT
            r2 = 34
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.insertOption(r1, r2)
            androidx.camera.core.impl.Config$Option<androidx.camera.core.impl.UseCaseConfigFactory$CaptureType> r1 = androidx.camera.core.impl.UseCaseConfig.OPTION_CAPTURE_TYPE
            androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r2 = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.STREAM_SHARING
            r0.insertOption(r1, r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r5 = r5.iterator()
        L24:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L48
            java.lang.Object r2 = r5.next()
            androidx.camera.core.UseCase r2 = (androidx.camera.core.UseCase) r2
            androidx.camera.core.impl.UseCaseConfig r3 = r2.getCurrentConfig()
            androidx.camera.core.impl.Config$Option<androidx.camera.core.impl.UseCaseConfigFactory$CaptureType> r4 = androidx.camera.core.impl.UseCaseConfig.OPTION_CAPTURE_TYPE
            boolean r3 = r3.containsOption(r4)
            if (r3 == 0) goto L24
            androidx.camera.core.impl.UseCaseConfig r2 = r2.getCurrentConfig()
            androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r2 = r2.getCaptureType()
            r1.add(r2)
            goto L24
        L48:
            androidx.camera.core.impl.Config$Option<java.util.List<androidx.camera.core.impl.UseCaseConfigFactory$CaptureType>> r5 = androidx.camera.core.streamsharing.StreamSharingConfig.OPTION_CAPTURE_TYPES
            r0.insertOption(r5, r1)
            androidx.camera.core.impl.Config$Option<java.lang.Integer> r5 = androidx.camera.core.impl.ImageOutputConfig.OPTION_MIRROR_MODE
            r1 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.insertOption(r5, r1)
            androidx.camera.core.streamsharing.StreamSharingConfig r5 = new androidx.camera.core.streamsharing.StreamSharingConfig
            androidx.camera.core.impl.OptionsBundle r0 = androidx.camera.core.impl.OptionsBundle.from(r0)
            r5.<init>(r0)
            return r5
    }

    @androidx.annotation.NonNull
    private androidx.camera.core.processing.SurfaceEdge getSharingInputEdge(@androidx.annotation.NonNull androidx.camera.core.processing.SurfaceEdge r9, @androidx.annotation.NonNull androidx.camera.core.impl.CameraInternal r10) {
            r8 = this;
            androidx.camera.core.CameraEffect r0 = r8.getEffect()
            if (r0 != 0) goto L7
            return r9
        L7:
            androidx.camera.core.processing.SurfaceProcessorNode r0 = new androidx.camera.core.processing.SurfaceProcessorNode
            androidx.camera.core.CameraEffect r1 = r8.getEffect()
            androidx.camera.core.processing.SurfaceProcessorInternal r1 = r1.createSurfaceProcessorInternal()
            r0.<init>(r10, r1)
            r8.mEffectNode = r0
            int r2 = r9.getTargets()
            int r3 = r9.getFormat()
            android.graphics.Rect r4 = r9.getCropRect()
            android.graphics.Rect r10 = r9.getCropRect()
            r6 = 0
            android.util.Size r5 = androidx.camera.core.impl.utils.TransformUtils.getRotatedSize(r10, r6)
            r7 = 0
            androidx.camera.core.processing.SurfaceProcessorNode$OutConfig r10 = androidx.camera.core.processing.SurfaceProcessorNode.OutConfig.of(r2, r3, r4, r5, r6, r7)
            java.util.List r0 = java.util.Collections.singletonList(r10)
            androidx.camera.core.processing.SurfaceProcessorNode$In r9 = androidx.camera.core.processing.SurfaceProcessorNode.In.of(r9, r0)
            androidx.camera.core.processing.SurfaceProcessorNode r0 = r8.mEffectNode
            androidx.camera.core.processing.SurfaceProcessorNode$Out r9 = r0.transform2(r9)
            java.lang.Object r9 = r9.get(r10)
            androidx.camera.core.processing.SurfaceEdge r9 = (androidx.camera.core.processing.SurfaceEdge) r9
            java.util.Objects.requireNonNull(r9)
            return r9
    }

    @androidx.annotation.Nullable
    @androidx.annotation.VisibleForTesting
    androidx.camera.core.processing.SurfaceEdge getCameraEdge() {
            r1 = this;
            androidx.camera.core.processing.SurfaceEdge r0 = r1.mCameraEdge
            return r0
    }

    @androidx.annotation.NonNull
    public java.util.Set<androidx.camera.core.UseCase> getChildren() {
            r1 = this;
            androidx.camera.core.streamsharing.VirtualCamera r0 = r1.mVirtualCamera
            java.util.Set r0 = r0.getChildren()
            return r0
    }

    @Override // androidx.camera.core.UseCase
    @androidx.annotation.Nullable
    public androidx.camera.core.impl.UseCaseConfig<?> getDefaultConfig(boolean r3, @androidx.annotation.NonNull androidx.camera.core.impl.UseCaseConfigFactory r4) {
            r2 = this;
            androidx.camera.core.streamsharing.StreamSharingConfig r0 = r2.mDefaultConfig
            androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r0 = r0.getCaptureType()
            r1 = 1
            androidx.camera.core.impl.Config r4 = r4.getConfig(r0, r1)
            if (r3 == 0) goto L17
            androidx.camera.core.streamsharing.StreamSharingConfig r3 = r2.mDefaultConfig
            androidx.camera.core.impl.Config r3 = r3.getConfig()
            androidx.camera.core.impl.Config r4 = androidx.camera.core.impl.o.b(r4, r3)
        L17:
            if (r4 != 0) goto L1b
            r3 = 0
            return r3
        L1b:
            androidx.camera.core.impl.UseCaseConfig$Builder r3 = r2.getUseCaseConfigBuilder(r4)
            androidx.camera.core.impl.UseCaseConfig r3 = r3.getUseCaseConfig()
            return r3
    }

    @androidx.annotation.Nullable
    @androidx.annotation.VisibleForTesting
    androidx.camera.core.processing.SurfaceProcessorNode getSharingNode() {
            r1 = this;
            androidx.camera.core.processing.SurfaceProcessorNode r0 = r1.mSharingNode
            return r0
    }

    @Override // androidx.camera.core.UseCase
    @androidx.annotation.NonNull
    public java.util.Set<java.lang.Integer> getSupportedEffectTargets() {
            r2 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            return r0
    }

    @Override // androidx.camera.core.UseCase
    @androidx.annotation.NonNull
    public androidx.camera.core.impl.UseCaseConfig.Builder<?, ?, ?> getUseCaseConfigBuilder(@androidx.annotation.NonNull androidx.camera.core.impl.Config r2) {
            r1 = this;
            androidx.camera.core.streamsharing.StreamSharingBuilder r0 = new androidx.camera.core.streamsharing.StreamSharingBuilder
            androidx.camera.core.impl.MutableOptionsBundle r2 = androidx.camera.core.impl.MutableOptionsBundle.from(r2)
            r0.<init>(r2)
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.VisibleForTesting
    androidx.camera.core.streamsharing.VirtualCamera getVirtualCamera() {
            r1 = this;
            androidx.camera.core.streamsharing.VirtualCamera r0 = r1.mVirtualCamera
            return r0
    }

    @Override // androidx.camera.core.UseCase
    public void onBind() {
            r1 = this;
            super.onBind()
            androidx.camera.core.streamsharing.VirtualCamera r0 = r1.mVirtualCamera
            r0.bindChildren()
            return
    }

    @Override // androidx.camera.core.UseCase
    @androidx.annotation.NonNull
    protected androidx.camera.core.impl.UseCaseConfig<?> onMergeConfig(@androidx.annotation.NonNull androidx.camera.core.impl.CameraInfoInternal r2, @androidx.annotation.NonNull androidx.camera.core.impl.UseCaseConfig.Builder<?, ?, ?> r3) {
            r1 = this;
            androidx.camera.core.streamsharing.VirtualCamera r2 = r1.mVirtualCamera
            androidx.camera.core.impl.MutableConfig r0 = r3.getMutableConfig()
            r2.mergeChildrenConfigs(r0)
            androidx.camera.core.impl.UseCaseConfig r2 = r3.getUseCaseConfig()
            return r2
    }

    @Override // androidx.camera.core.UseCase
    public void onStateAttached() {
            r1 = this;
            super.onStateAttached()
            androidx.camera.core.streamsharing.VirtualCamera r0 = r1.mVirtualCamera
            r0.notifyStateAttached()
            return
    }

    @Override // androidx.camera.core.UseCase
    public void onStateDetached() {
            r1 = this;
            super.onStateDetached()
            androidx.camera.core.streamsharing.VirtualCamera r0 = r1.mVirtualCamera
            r0.notifyStateDetached()
            return
    }

    @Override // androidx.camera.core.UseCase
    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    protected androidx.camera.core.impl.StreamSpec onSuggestedStreamSpecImplementationOptionsUpdated(@androidx.annotation.NonNull androidx.camera.core.impl.Config r2) {
            r1 = this;
            androidx.camera.core.impl.SessionConfig$Builder r0 = r1.mSessionConfigBuilder
            r0.addImplementationOptions(r2)
            androidx.camera.core.impl.SessionConfig$Builder r0 = r1.mSessionConfigBuilder
            androidx.camera.core.impl.SessionConfig r0 = r0.build()
            r1.updateSessionConfig(r0)
            androidx.camera.core.impl.StreamSpec r0 = r1.getAttachedStreamSpec()
            androidx.camera.core.impl.StreamSpec$Builder r0 = r0.toBuilder()
            androidx.camera.core.impl.StreamSpec$Builder r2 = r0.setImplementationOptions(r2)
            androidx.camera.core.impl.StreamSpec r2 = r2.build()
            return r2
    }

    @Override // androidx.camera.core.UseCase
    @androidx.annotation.NonNull
    protected androidx.camera.core.impl.StreamSpec onSuggestedStreamSpecUpdated(@androidx.annotation.NonNull androidx.camera.core.impl.StreamSpec r3) {
            r2 = this;
            java.lang.String r0 = r2.getCameraId()
            androidx.camera.core.impl.UseCaseConfig r1 = r2.getCurrentConfig()
            androidx.camera.core.impl.SessionConfig r0 = r2.createPipelineAndUpdateChildrenSpecs(r0, r1, r3)
            r2.updateSessionConfig(r0)
            r2.notifyActive()
            return r3
    }

    @Override // androidx.camera.core.UseCase
    public void onUnbind() {
            r1 = this;
            super.onUnbind()
            r1.clearPipeline()
            androidx.camera.core.streamsharing.VirtualCamera r0 = r1.mVirtualCamera
            r0.unbindChildren()
            return
    }
}
