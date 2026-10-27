package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class SingleImageProxyBundle implements androidx.camera.core.impl.ImageProxyBundle {
    private final int mCaptureId;
    private final androidx.camera.core.ImageProxy mImageProxy;

    SingleImageProxyBundle(@androidx.annotation.NonNull androidx.camera.core.ImageProxy r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.mCaptureId = r2
            r0.mImageProxy = r1
            return
    }

    public SingleImageProxyBundle(@androidx.annotation.NonNull androidx.camera.core.ImageProxy r2, @androidx.annotation.NonNull java.lang.String r3) {
            r1 = this;
            r1.<init>()
            androidx.camera.core.ImageInfo r0 = r2.getImageInfo()
            if (r0 == 0) goto L26
            androidx.camera.core.impl.TagBundle r0 = r0.getTagBundle()
            java.lang.Object r3 = r0.getTag(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L1e
            int r3 = r3.intValue()
            r1.mCaptureId = r3
            r1.mImageProxy = r2
            return
        L1e:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "ImageProxy has no associated tag"
            r2.<init>(r3)
            throw r2
        L26:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "ImageProxy has no associated ImageInfo"
            r2.<init>(r3)
            throw r2
    }

    public void close() {
            r1 = this;
            androidx.camera.core.ImageProxy r0 = r1.mImageProxy
            r0.close()
            return
    }

    @Override // androidx.camera.core.impl.ImageProxyBundle
    @androidx.annotation.NonNull
    public java.util.List<java.lang.Integer> getCaptureIds() {
            r1 = this;
            int r0 = r1.mCaptureId
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            return r0
    }

    @Override // androidx.camera.core.impl.ImageProxyBundle
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<androidx.camera.core.ImageProxy> getImageProxy(int r2) {
            r1 = this;
            int r0 = r1.mCaptureId
            if (r2 == r0) goto L10
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Capture id does not exist in the bundle"
            r2.<init>(r0)
            com.google.common.util.concurrent.ListenableFuture r2 = androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(r2)
            return r2
        L10:
            androidx.camera.core.ImageProxy r2 = r1.mImageProxy
            com.google.common.util.concurrent.ListenableFuture r2 = androidx.camera.core.impl.utils.futures.Futures.immediateFuture(r2)
            return r2
    }
}
