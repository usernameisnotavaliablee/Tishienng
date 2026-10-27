package androidx.camera.core.imagecapture;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(api = 21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class NoMetadataImageReader implements androidx.camera.core.impl.ImageReaderProxy {

    @androidx.annotation.Nullable
    private androidx.camera.core.imagecapture.ProcessingRequest mPendingRequest;

    @androidx.annotation.NonNull
    private final androidx.camera.core.impl.ImageReaderProxy mWrappedImageReader;

    NoMetadataImageReader(@androidx.annotation.NonNull androidx.camera.core.impl.ImageReaderProxy r1) {
            r0 = this;
            r0.<init>()
            r0.mWrappedImageReader = r1
            return
    }

    public static /* synthetic */ void a(androidx.camera.core.imagecapture.NoMetadataImageReader r0, androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener r1, androidx.camera.core.impl.ImageReaderProxy r2) {
            r0.getClass()
            r1.onImageAvailable(r0)
            return
    }

    @androidx.annotation.Nullable
    private androidx.camera.core.ImageProxy createImageProxyWithEmptyMetadata(@androidx.annotation.Nullable androidx.camera.core.ImageProxy r8) {
            r7 = this;
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            androidx.camera.core.imagecapture.ProcessingRequest r1 = r7.mPendingRequest
            r2 = 0
            if (r1 == 0) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            java.lang.String r3 = "Pending request should not be null"
            androidx.core.util.Preconditions.checkState(r1, r3)
            android.util.Pair r1 = new android.util.Pair
            androidx.camera.core.imagecapture.ProcessingRequest r3 = r7.mPendingRequest
            java.lang.String r3 = r3.getTagBundleKey()
            androidx.camera.core.imagecapture.ProcessingRequest r4 = r7.mPendingRequest
            java.util.List r4 = r4.getStageIds()
            java.lang.Object r2 = r4.get(r2)
            r1.<init>(r3, r2)
            androidx.camera.core.impl.TagBundle r1 = androidx.camera.core.impl.TagBundle.create(r1)
            r7.mPendingRequest = r0
            androidx.camera.core.SettableImageProxy r0 = new androidx.camera.core.SettableImageProxy
            android.util.Size r2 = new android.util.Size
            int r3 = r8.getWidth()
            int r4 = r8.getHeight()
            r2.<init>(r3, r4)
            androidx.camera.core.internal.CameraCaptureResultImageInfo r3 = new androidx.camera.core.internal.CameraCaptureResultImageInfo
            androidx.camera.core.streamsharing.VirtualCameraCaptureResult r4 = new androidx.camera.core.streamsharing.VirtualCameraCaptureResult
            androidx.camera.core.ImageInfo r5 = r8.getImageInfo()
            long r5 = r5.getTimestamp()
            r4.<init>(r1, r5)
            r3.<init>(r4)
            r0.<init>(r8, r2, r3)
            return r0
    }

    void acceptProcessingRequest(@androidx.annotation.NonNull androidx.camera.core.imagecapture.ProcessingRequest r3) {
            r2 = this;
            androidx.camera.core.imagecapture.ProcessingRequest r0 = r2.mPendingRequest
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            java.lang.String r1 = "Pending request should be null"
            androidx.core.util.Preconditions.checkState(r0, r1)
            r2.mPendingRequest = r3
            return
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    @androidx.annotation.Nullable
    public androidx.camera.core.ImageProxy acquireLatestImage() {
            r1 = this;
            androidx.camera.core.impl.ImageReaderProxy r0 = r1.mWrappedImageReader
            androidx.camera.core.ImageProxy r0 = r0.acquireLatestImage()
            androidx.camera.core.ImageProxy r0 = r1.createImageProxyWithEmptyMetadata(r0)
            return r0
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    @androidx.annotation.Nullable
    public androidx.camera.core.ImageProxy acquireNextImage() {
            r1 = this;
            androidx.camera.core.impl.ImageReaderProxy r0 = r1.mWrappedImageReader
            androidx.camera.core.ImageProxy r0 = r0.acquireNextImage()
            androidx.camera.core.ImageProxy r0 = r1.createImageProxyWithEmptyMetadata(r0)
            return r0
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void clearOnImageAvailableListener() {
            r1 = this;
            androidx.camera.core.impl.ImageReaderProxy r0 = r1.mWrappedImageReader
            r0.clearOnImageAvailableListener()
            return
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void close() {
            r1 = this;
            androidx.camera.core.impl.ImageReaderProxy r0 = r1.mWrappedImageReader
            r0.close()
            return
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getHeight() {
            r1 = this;
            androidx.camera.core.impl.ImageReaderProxy r0 = r1.mWrappedImageReader
            int r0 = r0.getHeight()
            return r0
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getImageFormat() {
            r1 = this;
            androidx.camera.core.impl.ImageReaderProxy r0 = r1.mWrappedImageReader
            int r0 = r0.getImageFormat()
            return r0
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getMaxImages() {
            r1 = this;
            androidx.camera.core.impl.ImageReaderProxy r0 = r1.mWrappedImageReader
            int r0 = r0.getMaxImages()
            return r0
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    @androidx.annotation.Nullable
    public android.view.Surface getSurface() {
            r1 = this;
            androidx.camera.core.impl.ImageReaderProxy r0 = r1.mWrappedImageReader
            android.view.Surface r0 = r0.getSurface()
            return r0
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getWidth() {
            r1 = this;
            androidx.camera.core.impl.ImageReaderProxy r0 = r1.mWrappedImageReader
            int r0 = r0.getWidth()
            return r0
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void setOnImageAvailableListener(@androidx.annotation.NonNull androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener r3, @androidx.annotation.NonNull java.util.concurrent.Executor r4) {
            r2 = this;
            androidx.camera.core.impl.ImageReaderProxy r0 = r2.mWrappedImageReader
            androidx.camera.core.imagecapture.e r1 = new androidx.camera.core.imagecapture.e
            r1.<init>(r2, r3)
            r0.setOnImageAvailableListener(r1, r4)
            return
    }
}
