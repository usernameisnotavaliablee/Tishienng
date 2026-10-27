package androidx.camera.core.imagecapture;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(api = 21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class SingleBundlingNode implements androidx.camera.core.imagecapture.BundlingNode {
    private androidx.camera.core.imagecapture.ProcessingNode.In mOutputEdge;
    androidx.camera.core.imagecapture.ProcessingRequest mPendingRequest;


    SingleBundlingNode() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void a(androidx.camera.core.imagecapture.SingleBundlingNode r0, androidx.camera.core.imagecapture.ProcessingRequest r1) {
            r0.trackIncomingRequest(r1)
            return
    }

    public static /* synthetic */ void b(androidx.camera.core.imagecapture.SingleBundlingNode r0, androidx.camera.core.ImageProxy r1) {
            r0.matchImageWithRequest(r1)
            return
    }

    @androidx.annotation.MainThread
    private void matchImageWithRequest(@androidx.annotation.NonNull androidx.camera.core.ImageProxy r5) {
            r4 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.core.imagecapture.ProcessingRequest r0 = r4.mPendingRequest
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            androidx.core.util.Preconditions.checkState(r0)
            androidx.camera.core.ImageInfo r0 = r5.getImageInfo()
            androidx.camera.core.impl.TagBundle r0 = r0.getTagBundle()
            androidx.camera.core.imagecapture.ProcessingRequest r3 = r4.mPendingRequest
            java.lang.String r3 = r3.getTagBundleKey()
            java.lang.Object r0 = r0.getTag(r3)
            java.util.Objects.requireNonNull(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            androidx.camera.core.imagecapture.ProcessingRequest r3 = r4.mPendingRequest
            java.util.List r3 = r3.getStageIds()
            java.lang.Object r3 = r3.get(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r0 != r3) goto L3d
            goto L3e
        L3d:
            r1 = 0
        L3e:
            androidx.core.util.Preconditions.checkState(r1)
            androidx.camera.core.imagecapture.ProcessingNode$In r0 = r4.mOutputEdge
            androidx.camera.core.processing.Edge r0 = r0.getEdge()
            androidx.camera.core.imagecapture.ProcessingRequest r1 = r4.mPendingRequest
            androidx.camera.core.imagecapture.ProcessingNode$InputPacket r5 = androidx.camera.core.imagecapture.ProcessingNode.InputPacket.of(r1, r5)
            r0.accept(r5)
            r5 = 0
            r4.mPendingRequest = r5
            return
    }

    @androidx.annotation.MainThread
    private void trackIncomingRequest(@androidx.annotation.NonNull androidx.camera.core.imagecapture.ProcessingRequest r5) {
            r4 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            java.util.List r0 = r5.getStageIds()
            int r0 = r0.size()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            java.lang.String r3 = "Cannot handle multi-image capture."
            androidx.core.util.Preconditions.checkState(r0, r3)
            androidx.camera.core.imagecapture.ProcessingRequest r0 = r4.mPendingRequest
            if (r0 != 0) goto L1c
            r1 = 1
        L1c:
            java.lang.String r0 = "Already has an existing request."
            androidx.core.util.Preconditions.checkState(r1, r0)
            r4.mPendingRequest = r5
            com.google.common.util.concurrent.ListenableFuture r0 = r5.getCaptureFuture()
            androidx.camera.core.imagecapture.SingleBundlingNode$1 r1 = new androidx.camera.core.imagecapture.SingleBundlingNode$1
            r1.<init>(r4, r5)
            java.util.concurrent.Executor r5 = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()
            androidx.camera.core.impl.utils.futures.Futures.addCallback(r0, r1, r5)
            return
    }

    @Override // androidx.camera.core.processing.Node
    public void release() {
            r0 = this;
            return
    }

    @androidx.annotation.NonNull
    /* renamed from: transform, reason: avoid collision after fix types in other method */
    public androidx.camera.core.imagecapture.ProcessingNode.In transform2(@androidx.annotation.NonNull androidx.camera.core.imagecapture.CaptureNode.Out r3) {
            r2 = this;
            androidx.camera.core.processing.Edge r0 = r3.getImageEdge()
            androidx.camera.core.imagecapture.m r1 = new androidx.camera.core.imagecapture.m
            r1.<init>(r2)
            r0.setListener(r1)
            androidx.camera.core.processing.Edge r0 = r3.getRequestEdge()
            androidx.camera.core.imagecapture.n r1 = new androidx.camera.core.imagecapture.n
            r1.<init>(r2)
            r0.setListener(r1)
            int r0 = r3.getInputFormat()
            int r3 = r3.getOutputFormat()
            androidx.camera.core.imagecapture.ProcessingNode$In r3 = androidx.camera.core.imagecapture.ProcessingNode.In.of(r0, r3)
            r2.mOutputEdge = r3
            return r3
    }

    @Override // androidx.camera.core.processing.Node
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ androidx.camera.core.imagecapture.ProcessingNode.In transform(@androidx.annotation.NonNull androidx.camera.core.imagecapture.CaptureNode.Out r1) {
            r0 = this;
            androidx.camera.core.imagecapture.CaptureNode$Out r1 = (androidx.camera.core.imagecapture.CaptureNode.Out) r1
            androidx.camera.core.imagecapture.ProcessingNode$In r1 = r0.transform2(r1)
            return r1
    }
}
