package androidx.camera.core.internal.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ZslRingBuffer extends androidx.camera.core.internal.utils.ArrayRingBuffer<androidx.camera.core.ImageProxy> {
    public ZslRingBuffer(int r1, @androidx.annotation.NonNull androidx.camera.core.internal.utils.RingBuffer.OnRemoveCallback<androidx.camera.core.ImageProxy> r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private boolean isValidZslFrame(@androidx.annotation.NonNull androidx.camera.core.ImageInfo r4) {
            r3 = this;
            androidx.camera.core.impl.CameraCaptureResult r4 = androidx.camera.core.impl.CameraCaptureResults.retrieveCameraCaptureResult(r4)
            androidx.camera.core.impl.CameraCaptureMetaData$AfState r0 = r4.getAfState()
            androidx.camera.core.impl.CameraCaptureMetaData$AfState r1 = androidx.camera.core.impl.CameraCaptureMetaData.AfState.LOCKED_FOCUSED
            r2 = 0
            if (r0 == r1) goto L16
            androidx.camera.core.impl.CameraCaptureMetaData$AfState r0 = r4.getAfState()
            androidx.camera.core.impl.CameraCaptureMetaData$AfState r1 = androidx.camera.core.impl.CameraCaptureMetaData.AfState.PASSIVE_FOCUSED
            if (r0 == r1) goto L16
            return r2
        L16:
            androidx.camera.core.impl.CameraCaptureMetaData$AeState r0 = r4.getAeState()
            androidx.camera.core.impl.CameraCaptureMetaData$AeState r1 = androidx.camera.core.impl.CameraCaptureMetaData.AeState.CONVERGED
            if (r0 == r1) goto L1f
            return r2
        L1f:
            androidx.camera.core.impl.CameraCaptureMetaData$AwbState r4 = r4.getAwbState()
            androidx.camera.core.impl.CameraCaptureMetaData$AwbState r0 = androidx.camera.core.impl.CameraCaptureMetaData.AwbState.CONVERGED
            if (r4 == r0) goto L28
            return r2
        L28:
            r4 = 1
            return r4
    }

    public void enqueue(@androidx.annotation.NonNull androidx.camera.core.ImageProxy r2) {
            r1 = this;
            androidx.camera.core.ImageInfo r0 = r2.getImageInfo()
            boolean r0 = r1.isValidZslFrame(r0)
            if (r0 == 0) goto Le
            super.enqueue(r2)
            return
        Le:
            androidx.camera.core.internal.utils.RingBuffer$OnRemoveCallback<T> r0 = r1.mOnRemoveCallback
            r0.onRemove(r2)
            return
    }

    @Override // androidx.camera.core.internal.utils.ArrayRingBuffer, androidx.camera.core.internal.utils.RingBuffer
    public /* bridge */ /* synthetic */ void enqueue(@androidx.annotation.NonNull java.lang.Object r1) {
            r0 = this;
            androidx.camera.core.ImageProxy r1 = (androidx.camera.core.ImageProxy) r1
            r0.enqueue(r1)
            return
    }
}
