package androidx.camera.core.processing;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(api = 21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class SurfaceProcessorNode implements androidx.camera.core.processing.Node<androidx.camera.core.processing.SurfaceProcessorNode.In, androidx.camera.core.processing.SurfaceProcessorNode.Out> {
    private static final java.lang.String TAG = "SurfaceProcessorNode";

    @androidx.annotation.NonNull
    final androidx.camera.core.impl.CameraInternal mCameraInternal;

    @androidx.annotation.Nullable
    private androidx.camera.core.processing.SurfaceProcessorNode.In mInput;

    @androidx.annotation.Nullable
    private androidx.camera.core.processing.SurfaceProcessorNode.Out mOutput;

    @androidx.annotation.NonNull
    final androidx.camera.core.processing.SurfaceProcessorInternal mSurfaceProcessor;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.auto.value.AutoValue
    public static abstract class In {
        public In() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        public static androidx.camera.core.processing.SurfaceProcessorNode.In of(@androidx.annotation.NonNull androidx.camera.core.processing.SurfaceEdge r1, @androidx.annotation.NonNull java.util.List<androidx.camera.core.processing.SurfaceProcessorNode.OutConfig> r2) {
                androidx.camera.core.processing.AutoValue_SurfaceProcessorNode_In r0 = new androidx.camera.core.processing.AutoValue_SurfaceProcessorNode_In
                r0.<init>(r1, r2)
                return r0
        }

        @androidx.annotation.NonNull
        public abstract java.util.List<androidx.camera.core.processing.SurfaceProcessorNode.OutConfig> getOutConfigs();

        @androidx.annotation.NonNull
        public abstract androidx.camera.core.processing.SurfaceEdge getSurfaceEdge();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Out extends java.util.HashMap<androidx.camera.core.processing.SurfaceProcessorNode.OutConfig, androidx.camera.core.processing.SurfaceEdge> {
        public Out() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.auto.value.AutoValue
    public static abstract class OutConfig {
        public OutConfig() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        public static androidx.camera.core.processing.SurfaceProcessorNode.OutConfig of(int r8, int r9, @androidx.annotation.NonNull android.graphics.Rect r10, @androidx.annotation.NonNull android.util.Size r11, int r12, boolean r13) {
                androidx.camera.core.processing.AutoValue_SurfaceProcessorNode_OutConfig r0 = new androidx.camera.core.processing.AutoValue_SurfaceProcessorNode_OutConfig
                java.util.UUID r1 = java.util.UUID.randomUUID()
                r2 = r8
                r3 = r9
                r4 = r10
                r5 = r11
                r6 = r12
                r7 = r13
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return r0
        }

        @androidx.annotation.NonNull
        public static androidx.camera.core.processing.SurfaceProcessorNode.OutConfig of(@androidx.annotation.NonNull androidx.camera.core.processing.SurfaceEdge r6) {
                int r0 = r6.getTargets()
                int r1 = r6.getFormat()
                android.graphics.Rect r2 = r6.getCropRect()
                android.graphics.Rect r3 = r6.getCropRect()
                int r4 = r6.getRotationDegrees()
                android.util.Size r3 = androidx.camera.core.impl.utils.TransformUtils.getRotatedSize(r3, r4)
                int r4 = r6.getRotationDegrees()
                boolean r5 = r6.getMirroring()
                androidx.camera.core.processing.SurfaceProcessorNode$OutConfig r6 = of(r0, r1, r2, r3, r4, r5)
                return r6
        }

        @androidx.annotation.NonNull
        public abstract android.graphics.Rect getCropRect();

        public abstract int getFormat();

        public abstract boolean getMirroring();

        public abstract int getRotationDegrees();

        @androidx.annotation.NonNull
        public abstract android.util.Size getSize();

        public abstract int getTargets();

        @androidx.annotation.NonNull
        abstract java.util.UUID getUuid();
    }

    public SurfaceProcessorNode(@androidx.annotation.NonNull androidx.camera.core.impl.CameraInternal r1, @androidx.annotation.NonNull androidx.camera.core.processing.SurfaceProcessorInternal r2) {
            r0 = this;
            r0.<init>()
            r0.mCameraInternal = r1
            r0.mSurfaceProcessor = r2
            return
    }

    public static /* synthetic */ void a(androidx.camera.core.processing.SurfaceProcessorNode r0, androidx.camera.core.processing.SurfaceEdge r1, java.util.Map.Entry r2) {
            r0.createAndSendSurfaceOutput(r1, r2)
            return
    }

    public static /* synthetic */ void b(java.util.Map r3, androidx.camera.core.SurfaceRequest.TransformationInfo r4) {
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L8:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3f
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            int r1 = r4.getRotationDegrees()
            java.lang.Object r2 = r0.getKey()
            androidx.camera.core.processing.SurfaceProcessorNode$OutConfig r2 = (androidx.camera.core.processing.SurfaceProcessorNode.OutConfig) r2
            int r2 = r2.getRotationDegrees()
            int r1 = r1 - r2
            java.lang.Object r2 = r0.getKey()
            androidx.camera.core.processing.SurfaceProcessorNode$OutConfig r2 = (androidx.camera.core.processing.SurfaceProcessorNode.OutConfig) r2
            boolean r2 = r2.getMirroring()
            if (r2 == 0) goto L30
            int r1 = -r1
        L30:
            int r1 = androidx.camera.core.impl.utils.TransformUtils.within360(r1)
            java.lang.Object r0 = r0.getValue()
            androidx.camera.core.processing.SurfaceEdge r0 = (androidx.camera.core.processing.SurfaceEdge) r0
            r2 = -1
            r0.updateTransformation(r1, r2)
            goto L8
        L3f:
            return
    }

    public static /* synthetic */ void c(androidx.camera.core.processing.SurfaceProcessorNode r1) {
            androidx.camera.core.processing.SurfaceProcessorNode$Out r1 = r1.mOutput
            if (r1 == 0) goto L1c
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        Lc:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L1c
            java.lang.Object r0 = r1.next()
            androidx.camera.core.processing.SurfaceEdge r0 = (androidx.camera.core.processing.SurfaceEdge) r0
            r0.close()
            goto Lc
        L1c:
            return
    }

    private void createAndSendSurfaceOutput(@androidx.annotation.NonNull androidx.camera.core.processing.SurfaceEdge r9, java.util.Map.Entry<androidx.camera.core.processing.SurfaceProcessorNode.OutConfig, androidx.camera.core.processing.SurfaceEdge> r10) {
            r8 = this;
            java.lang.Object r0 = r10.getValue()
            r1 = r0
            androidx.camera.core.processing.SurfaceEdge r1 = (androidx.camera.core.processing.SurfaceEdge) r1
            androidx.camera.core.impl.StreamSpec r0 = r9.getStreamSpec()
            android.util.Size r2 = r0.getResolution()
            java.lang.Object r0 = r10.getKey()
            androidx.camera.core.processing.SurfaceProcessorNode$OutConfig r0 = (androidx.camera.core.processing.SurfaceProcessorNode.OutConfig) r0
            int r3 = r0.getFormat()
            java.lang.Object r0 = r10.getKey()
            androidx.camera.core.processing.SurfaceProcessorNode$OutConfig r0 = (androidx.camera.core.processing.SurfaceProcessorNode.OutConfig) r0
            android.graphics.Rect r4 = r0.getCropRect()
            java.lang.Object r0 = r10.getKey()
            androidx.camera.core.processing.SurfaceProcessorNode$OutConfig r0 = (androidx.camera.core.processing.SurfaceProcessorNode.OutConfig) r0
            int r5 = r0.getRotationDegrees()
            java.lang.Object r10 = r10.getKey()
            androidx.camera.core.processing.SurfaceProcessorNode$OutConfig r10 = (androidx.camera.core.processing.SurfaceProcessorNode.OutConfig) r10
            boolean r6 = r10.getMirroring()
            boolean r9 = r9.hasCameraTransform()
            if (r9 == 0) goto L41
            androidx.camera.core.impl.CameraInternal r9 = r8.mCameraInternal
        L3f:
            r7 = r9
            goto L43
        L41:
            r9 = 0
            goto L3f
        L43:
            com.google.common.util.concurrent.ListenableFuture r9 = r1.createSurfaceOutputFuture(r2, r3, r4, r5, r6, r7)
            androidx.camera.core.processing.SurfaceProcessorNode$1 r10 = new androidx.camera.core.processing.SurfaceProcessorNode$1
            r10.<init>(r8)
            java.util.concurrent.ScheduledExecutorService r0 = androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor()
            androidx.camera.core.impl.utils.futures.Futures.addCallback(r9, r10, r0)
            return
    }

    private void sendSurfaceOutputs(@androidx.annotation.NonNull androidx.camera.core.processing.SurfaceEdge r4, @androidx.annotation.NonNull java.util.Map<androidx.camera.core.processing.SurfaceProcessorNode.OutConfig, androidx.camera.core.processing.SurfaceEdge> r5) {
            r3 = this;
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L8:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L26
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r3.createAndSendSurfaceOutput(r4, r0)
            java.lang.Object r1 = r0.getValue()
            androidx.camera.core.processing.SurfaceEdge r1 = (androidx.camera.core.processing.SurfaceEdge) r1
            androidx.camera.core.processing.e0 r2 = new androidx.camera.core.processing.e0
            r2.<init>(r3, r4, r0)
            r1.addOnInvalidatedListener(r2)
            goto L8
        L26:
            return
    }

    private void sendSurfaceRequest(@androidx.annotation.NonNull androidx.camera.core.processing.SurfaceEdge r2, @androidx.annotation.NonNull java.util.Map<androidx.camera.core.processing.SurfaceProcessorNode.OutConfig, androidx.camera.core.processing.SurfaceEdge> r3) {
            r1 = this;
            androidx.camera.core.impl.CameraInternal r0 = r1.mCameraInternal
            androidx.camera.core.SurfaceRequest r2 = r2.createSurfaceRequest(r0)
            r1.setUpRotationUpdates(r2, r3)
            androidx.camera.core.processing.SurfaceProcessorInternal r3 = r1.mSurfaceProcessor     // Catch: androidx.camera.core.ProcessingException -> Lf
            r3.onInputSurface(r2)     // Catch: androidx.camera.core.ProcessingException -> Lf
            return
        Lf:
            r2 = move-exception
            java.lang.String r3 = "SurfaceProcessorNode"
            java.lang.String r0 = "Failed to send SurfaceRequest to SurfaceProcessor."
            androidx.camera.core.Logger.e(r3, r0, r2)
            return
    }

    @androidx.annotation.NonNull
    private androidx.camera.core.processing.SurfaceEdge transformSingleOutput(@androidx.annotation.NonNull androidx.camera.core.processing.SurfaceEdge r14, @androidx.annotation.NonNull androidx.camera.core.processing.SurfaceProcessorNode.OutConfig r15) {
            r13 = this;
            android.graphics.Rect r0 = r15.getCropRect()
            int r1 = r15.getRotationDegrees()
            boolean r2 = r15.getMirroring()
            android.graphics.Matrix r7 = new android.graphics.Matrix
            android.graphics.Matrix r3 = r14.getSensorToBufferTransform()
            r7.<init>(r3)
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>(r0)
            android.util.Size r4 = r15.getSize()
            android.graphics.RectF r4 = androidx.camera.core.impl.utils.TransformUtils.sizeToRectF(r4)
            android.graphics.Matrix r3 = androidx.camera.core.impl.utils.TransformUtils.getRectToRect(r3, r4, r1, r2)
            r7.postConcat(r3)
            android.util.Size r0 = androidx.camera.core.impl.utils.TransformUtils.getRotatedSize(r0, r1)
            android.util.Size r3 = r15.getSize()
            boolean r0 = androidx.camera.core.impl.utils.TransformUtils.isAspectRatioMatchingWithRoundingError(r0, r3)
            androidx.core.util.Preconditions.checkArgument(r0)
            androidx.camera.core.impl.StreamSpec r0 = r14.getStreamSpec()
            androidx.camera.core.impl.StreamSpec$Builder r0 = r0.toBuilder()
            android.util.Size r3 = r15.getSize()
            androidx.camera.core.impl.StreamSpec$Builder r0 = r0.setResolution(r3)
            androidx.camera.core.impl.StreamSpec r6 = r0.build()
            androidx.camera.core.processing.SurfaceEdge r3 = new androidx.camera.core.processing.SurfaceEdge
            int r4 = r15.getTargets()
            int r5 = r15.getFormat()
            android.util.Size r15 = r15.getSize()
            android.graphics.Rect r9 = androidx.camera.core.impl.utils.TransformUtils.sizeToRect(r15)
            int r15 = r14.getRotationDegrees()
            int r10 = r15 - r1
            boolean r14 = r14.getMirroring()
            if (r14 == r2) goto L6d
            r14 = 1
            r12 = 1
            goto L6f
        L6d:
            r14 = 0
            r12 = 0
        L6f:
            r8 = 0
            r11 = -1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r3
    }

    @androidx.annotation.NonNull
    public androidx.camera.core.processing.SurfaceProcessorInternal getSurfaceProcessor() {
            r1 = this;
            androidx.camera.core.processing.SurfaceProcessorInternal r0 = r1.mSurfaceProcessor
            return r0
    }

    @Override // androidx.camera.core.processing.Node
    public void release() {
            r2 = this;
            androidx.camera.core.processing.SurfaceProcessorInternal r0 = r2.mSurfaceProcessor
            r0.release()
            java.util.concurrent.ScheduledExecutorService r0 = androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor()
            androidx.camera.core.processing.f0 r1 = new androidx.camera.core.processing.f0
            r1.<init>(r2)
            r0.execute(r1)
            return
    }

    void setUpRotationUpdates(@androidx.annotation.NonNull androidx.camera.core.SurfaceRequest r3, @androidx.annotation.NonNull java.util.Map<androidx.camera.core.processing.SurfaceProcessorNode.OutConfig, androidx.camera.core.processing.SurfaceEdge> r4) {
            r2 = this;
            java.util.concurrent.ScheduledExecutorService r0 = androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor()
            androidx.camera.core.processing.g0 r1 = new androidx.camera.core.processing.g0
            r1.<init>(r4)
            r3.setTransformationInfoListener(r0, r1)
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.MainThread
    /* renamed from: transform, reason: avoid collision after fix types in other method */
    public androidx.camera.core.processing.SurfaceProcessorNode.Out transform2(@androidx.annotation.NonNull androidx.camera.core.processing.SurfaceProcessorNode.In r5) {
            r4 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            r4.mInput = r5
            androidx.camera.core.processing.SurfaceProcessorNode$Out r0 = new androidx.camera.core.processing.SurfaceProcessorNode$Out
            r0.<init>()
            r4.mOutput = r0
            androidx.camera.core.processing.SurfaceEdge r0 = r5.getSurfaceEdge()
            java.util.List r5 = r5.getOutConfigs()
            java.util.Iterator r5 = r5.iterator()
        L18:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r5.next()
            androidx.camera.core.processing.SurfaceProcessorNode$OutConfig r1 = (androidx.camera.core.processing.SurfaceProcessorNode.OutConfig) r1
            androidx.camera.core.processing.SurfaceProcessorNode$Out r2 = r4.mOutput
            androidx.camera.core.processing.SurfaceEdge r3 = r4.transformSingleOutput(r0, r1)
            r2.put(r1, r3)
            goto L18
        L2e:
            androidx.camera.core.processing.SurfaceProcessorNode$Out r5 = r4.mOutput
            r4.sendSurfaceRequest(r0, r5)
            androidx.camera.core.processing.SurfaceProcessorNode$Out r5 = r4.mOutput
            r4.sendSurfaceOutputs(r0, r5)
            androidx.camera.core.processing.SurfaceProcessorNode$Out r5 = r4.mOutput
            return r5
    }

    @Override // androidx.camera.core.processing.Node
    @androidx.annotation.NonNull
    @androidx.annotation.MainThread
    public /* bridge */ /* synthetic */ androidx.camera.core.processing.SurfaceProcessorNode.Out transform(@androidx.annotation.NonNull androidx.camera.core.processing.SurfaceProcessorNode.In r1) {
            r0 = this;
            androidx.camera.core.processing.SurfaceProcessorNode$In r1 = (androidx.camera.core.processing.SurfaceProcessorNode.In) r1
            androidx.camera.core.processing.SurfaceProcessorNode$Out r1 = r0.transform2(r1)
            return r1
    }
}
