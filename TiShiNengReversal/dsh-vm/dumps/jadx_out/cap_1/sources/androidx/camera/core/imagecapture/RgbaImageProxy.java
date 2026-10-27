package androidx.camera.core.imagecapture;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(api = 21)
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class RgbaImageProxy implements androidx.camera.core.ImageProxy {

    @androidx.annotation.NonNull
    private final android.graphics.Rect mCropRect;
    private final int mHeight;

    @androidx.annotation.NonNull
    private final androidx.camera.core.ImageInfo mImageInfo;
    private final java.lang.Object mLock;

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("mLock")
    androidx.camera.core.ImageProxy.PlaneProxy[] mPlaneProxy;
    private final int mWidth;



    public RgbaImageProxy(@androidx.annotation.NonNull android.graphics.Bitmap r11, @androidx.annotation.NonNull android.graphics.Rect r12, int r13, @androidx.annotation.NonNull android.graphics.Matrix r14, long r15) {
            r10 = this;
            java.nio.ByteBuffer r1 = androidx.camera.core.internal.utils.ImageUtil.createDirectByteBuffer(r11)
            int r3 = r11.getWidth()
            int r4 = r11.getHeight()
            r2 = 4
            r0 = r10
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public RgbaImageProxy(@androidx.annotation.NonNull androidx.camera.core.processing.Packet<android.graphics.Bitmap> r9) {
            r8 = this;
            java.lang.Object r0 = r9.getData()
            r2 = r0
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            android.graphics.Rect r3 = r9.getCropRect()
            int r4 = r9.getRotationDegrees()
            android.graphics.Matrix r5 = r9.getSensorToBufferTransform()
            androidx.camera.core.impl.CameraCaptureResult r9 = r9.getCameraCaptureResult()
            long r6 = r9.getTimestamp()
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            return
    }

    public RgbaImageProxy(@androidx.annotation.NonNull java.nio.ByteBuffer r2, int r3, int r4, int r5, @androidx.annotation.NonNull android.graphics.Rect r6, int r7, @androidx.annotation.NonNull android.graphics.Matrix r8, long r9) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.mLock = r0
            r1.mWidth = r4
            r1.mHeight = r5
            r1.mCropRect = r6
            androidx.camera.core.ImageInfo r5 = createImageInfo(r9, r7, r8)
            r1.mImageInfo = r5
            r2.rewind()
            int r4 = r4 * r3
            androidx.camera.core.ImageProxy$PlaneProxy r2 = createPlaneProxy(r2, r4, r3)
            r3 = 1
            androidx.camera.core.ImageProxy$PlaneProxy[] r3 = new androidx.camera.core.ImageProxy.PlaneProxy[r3]
            r4 = 0
            r3[r4] = r2
            r1.mPlaneProxy = r3
            return
    }

    private void checkNotClosed() {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            androidx.camera.core.ImageProxy$PlaneProxy[] r1 = r3.mPlaneProxy     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            java.lang.String r2 = "The image is closed."
            androidx.core.util.Preconditions.checkState(r1, r2)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L11:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1
    }

    private static androidx.camera.core.ImageInfo createImageInfo(long r1, int r3, @androidx.annotation.NonNull android.graphics.Matrix r4) {
            androidx.camera.core.imagecapture.RgbaImageProxy$2 r0 = new androidx.camera.core.imagecapture.RgbaImageProxy$2
            r0.<init>(r1, r3, r4)
            return r0
    }

    private static androidx.camera.core.ImageProxy.PlaneProxy createPlaneProxy(@androidx.annotation.NonNull java.nio.ByteBuffer r1, int r2, int r3) {
            androidx.camera.core.imagecapture.RgbaImageProxy$1 r0 = new androidx.camera.core.imagecapture.RgbaImageProxy$1
            r0.<init>(r2, r3, r1)
            return r0
    }

    @Override // androidx.camera.core.ImageProxy, java.lang.AutoCloseable
    public void close() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            r2.checkNotClosed()     // Catch: java.lang.Throwable -> Lb
            r1 = 0
            r2.mPlaneProxy = r1     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    @androidx.annotation.NonNull
    public android.graphics.Bitmap createBitmap() {
            r4 = this;
            java.lang.Object r0 = r4.mLock
            monitor-enter(r0)
            r4.checkNotClosed()     // Catch: java.lang.Throwable -> L18
            androidx.camera.core.ImageProxy$PlaneProxy[] r1 = r4.getPlanes()     // Catch: java.lang.Throwable -> L18
            int r2 = r4.getWidth()     // Catch: java.lang.Throwable -> L18
            int r3 = r4.getHeight()     // Catch: java.lang.Throwable -> L18
            android.graphics.Bitmap r1 = androidx.camera.core.internal.utils.ImageUtil.createBitmapFromPlane(r1, r2, r3)     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return r1
        L18:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r1
    }

    @Override // androidx.camera.core.ImageProxy
    @androidx.annotation.NonNull
    public android.graphics.Rect getCropRect() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            r2.checkNotClosed()     // Catch: java.lang.Throwable -> La
            android.graphics.Rect r1 = r2.mCropRect     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return r1
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    @Override // androidx.camera.core.ImageProxy
    public int getFormat() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            r2.checkNotClosed()     // Catch: java.lang.Throwable -> L9
            r1 = 1
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return r1
        L9:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r1
    }

    @Override // androidx.camera.core.ImageProxy
    public int getHeight() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            r2.checkNotClosed()     // Catch: java.lang.Throwable -> La
            int r1 = r2.mHeight     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return r1
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    @Override // androidx.camera.core.ImageProxy
    @androidx.annotation.Nullable
    @androidx.camera.core.ExperimentalGetImage
    public android.media.Image getImage() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            r2.checkNotClosed()     // Catch: java.lang.Throwable -> L9
            r1 = 0
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return r1
        L9:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r1
    }

    @Override // androidx.camera.core.ImageProxy
    @androidx.annotation.NonNull
    public androidx.camera.core.ImageInfo getImageInfo() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            r2.checkNotClosed()     // Catch: java.lang.Throwable -> La
            androidx.camera.core.ImageInfo r1 = r2.mImageInfo     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return r1
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    @Override // androidx.camera.core.ImageProxy
    @androidx.annotation.NonNull
    public androidx.camera.core.ImageProxy.PlaneProxy[] getPlanes() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            r2.checkNotClosed()     // Catch: java.lang.Throwable -> Lf
            androidx.camera.core.ImageProxy$PlaneProxy[] r1 = r2.mPlaneProxy     // Catch: java.lang.Throwable -> Lf
            java.util.Objects.requireNonNull(r1)     // Catch: java.lang.Throwable -> Lf
            androidx.camera.core.ImageProxy$PlaneProxy[] r1 = (androidx.camera.core.ImageProxy.PlaneProxy[]) r1     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r1
        Lf:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    @Override // androidx.camera.core.ImageProxy
    public int getWidth() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            r2.checkNotClosed()     // Catch: java.lang.Throwable -> La
            int r1 = r2.mWidth     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return r1
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    @Override // androidx.camera.core.ImageProxy
    public void setCropRect(@androidx.annotation.Nullable android.graphics.Rect r3) {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            r2.checkNotClosed()     // Catch: java.lang.Throwable -> Le
            if (r3 == 0) goto L10
            android.graphics.Rect r1 = r2.mCropRect     // Catch: java.lang.Throwable -> Le
            r1.set(r3)     // Catch: java.lang.Throwable -> Le
            goto L10
        Le:
            r3 = move-exception
            goto L12
        L10:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r3
    }

    @Override // androidx.camera.core.ImageProxy
    public /* synthetic */ android.graphics.Bitmap toBitmap() {
            r1 = this;
            android.graphics.Bitmap r0 = androidx.camera.core.f0.a(r1)
            return r0
    }
}
