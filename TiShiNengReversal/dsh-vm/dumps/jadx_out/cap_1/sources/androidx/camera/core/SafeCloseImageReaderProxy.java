package androidx.camera.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class SafeCloseImageReaderProxy implements androidx.camera.core.impl.ImageReaderProxy {
    private androidx.camera.core.ForwardingImageProxy.OnImageCloseListener mForwardingImageCloseListener;
    private final androidx.camera.core.ForwardingImageProxy.OnImageCloseListener mImageCloseListener;

    @androidx.annotation.GuardedBy("mLock")
    private final androidx.camera.core.impl.ImageReaderProxy mImageReaderProxy;

    @androidx.annotation.GuardedBy("mLock")
    private boolean mIsClosed;
    private final java.lang.Object mLock;

    @androidx.annotation.GuardedBy("mLock")
    private int mOutstandingImages;

    @androidx.annotation.Nullable
    private final android.view.Surface mSurface;

    public SafeCloseImageReaderProxy(@androidx.annotation.NonNull androidx.camera.core.impl.ImageReaderProxy r2) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.mLock = r0
            r0 = 0
            r1.mOutstandingImages = r0
            r1.mIsClosed = r0
            androidx.camera.core.q0 r0 = new androidx.camera.core.q0
            r0.<init>(r1)
            r1.mImageCloseListener = r0
            r1.mImageReaderProxy = r2
            android.view.Surface r2 = r2.getSurface()
            r1.mSurface = r2
            return
    }

    public static /* synthetic */ void a(androidx.camera.core.SafeCloseImageReaderProxy r0, androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener r1, androidx.camera.core.impl.ImageReaderProxy r2) {
            r0.getClass()
            r1.onImageAvailable(r0)
            return
    }

    public static /* synthetic */ void b(androidx.camera.core.SafeCloseImageReaderProxy r3, androidx.camera.core.ImageProxy r4) {
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            int r1 = r3.mOutstandingImages     // Catch: java.lang.Throwable -> L13
            int r1 = r1 + (-1)
            r3.mOutstandingImages = r1     // Catch: java.lang.Throwable -> L13
            boolean r2 = r3.mIsClosed     // Catch: java.lang.Throwable -> L13
            if (r2 == 0) goto L15
            if (r1 != 0) goto L15
            r3.close()     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r3 = move-exception
            goto L1e
        L15:
            androidx.camera.core.ForwardingImageProxy$OnImageCloseListener r3 = r3.mForwardingImageCloseListener     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            if (r3 == 0) goto L1d
            r3.onImageClose(r4)
        L1d:
            return
        L1e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r3
    }

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("mLock")
    private androidx.camera.core.ImageProxy wrapImageProxy(@androidx.annotation.Nullable androidx.camera.core.ImageProxy r2) {
            r1 = this;
            if (r2 == 0) goto L13
            int r0 = r1.mOutstandingImages
            int r0 = r0 + 1
            r1.mOutstandingImages = r0
            androidx.camera.core.SingleCloseImageProxy r0 = new androidx.camera.core.SingleCloseImageProxy
            r0.<init>(r2)
            androidx.camera.core.ForwardingImageProxy$OnImageCloseListener r2 = r1.mImageCloseListener
            r0.addOnImageCloseListener(r2)
            return r0
        L13:
            r2 = 0
            return r2
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    @androidx.annotation.Nullable
    public androidx.camera.core.ImageProxy acquireLatestImage() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            androidx.camera.core.impl.ImageReaderProxy r1 = r2.mImageReaderProxy     // Catch: java.lang.Throwable -> Lf
            androidx.camera.core.ImageProxy r1 = r1.acquireLatestImage()     // Catch: java.lang.Throwable -> Lf
            androidx.camera.core.ImageProxy r1 = r2.wrapImageProxy(r1)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r1
        Lf:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    @androidx.annotation.Nullable
    public androidx.camera.core.ImageProxy acquireNextImage() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            androidx.camera.core.impl.ImageReaderProxy r1 = r2.mImageReaderProxy     // Catch: java.lang.Throwable -> Lf
            androidx.camera.core.ImageProxy r1 = r1.acquireNextImage()     // Catch: java.lang.Throwable -> Lf
            androidx.camera.core.ImageProxy r1 = r2.wrapImageProxy(r1)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r1
        Lf:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void clearOnImageAvailableListener() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            androidx.camera.core.impl.ImageReaderProxy r1 = r2.mImageReaderProxy     // Catch: java.lang.Throwable -> La
            r1.clearOnImageAvailableListener()     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void close() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            android.view.Surface r1 = r2.mSurface     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto Ld
            r1.release()     // Catch: java.lang.Throwable -> Lb
            goto Ld
        Lb:
            r1 = move-exception
            goto L14
        Ld:
            androidx.camera.core.impl.ImageReaderProxy r1 = r2.mImageReaderProxy     // Catch: java.lang.Throwable -> Lb
            r1.close()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        L14:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    public int getCapacity() {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            androidx.camera.core.impl.ImageReaderProxy r1 = r3.mImageReaderProxy     // Catch: java.lang.Throwable -> Le
            int r1 = r1.getMaxImages()     // Catch: java.lang.Throwable -> Le
            int r2 = r3.mOutstandingImages     // Catch: java.lang.Throwable -> Le
            int r1 = r1 - r2
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getHeight() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            androidx.camera.core.impl.ImageReaderProxy r1 = r2.mImageReaderProxy     // Catch: java.lang.Throwable -> Lb
            int r1 = r1.getHeight()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getImageFormat() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            androidx.camera.core.impl.ImageReaderProxy r1 = r2.mImageReaderProxy     // Catch: java.lang.Throwable -> Lb
            int r1 = r1.getImageFormat()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.VisibleForTesting
    public androidx.camera.core.impl.ImageReaderProxy getImageReaderProxy() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            androidx.camera.core.impl.ImageReaderProxy r1 = r2.mImageReaderProxy     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getMaxImages() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            androidx.camera.core.impl.ImageReaderProxy r1 = r2.mImageReaderProxy     // Catch: java.lang.Throwable -> Lb
            int r1 = r1.getMaxImages()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    @androidx.annotation.Nullable
    public android.view.Surface getSurface() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            androidx.camera.core.impl.ImageReaderProxy r1 = r2.mImageReaderProxy     // Catch: java.lang.Throwable -> Lb
            android.view.Surface r1 = r1.getSurface()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getWidth() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            androidx.camera.core.impl.ImageReaderProxy r1 = r2.mImageReaderProxy     // Catch: java.lang.Throwable -> Lb
            int r1 = r1.getWidth()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    @androidx.annotation.VisibleForTesting
    public boolean isClosed() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            boolean r1 = r2.mIsClosed     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public void safeClose() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            r1 = 1
            r2.mIsClosed = r1     // Catch: java.lang.Throwable -> L13
            androidx.camera.core.impl.ImageReaderProxy r1 = r2.mImageReaderProxy     // Catch: java.lang.Throwable -> L13
            r1.clearOnImageAvailableListener()     // Catch: java.lang.Throwable -> L13
            int r1 = r2.mOutstandingImages     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            r2.close()     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void setOnImageAvailableListener(@androidx.annotation.NonNull androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener r4, @androidx.annotation.NonNull java.util.concurrent.Executor r5) {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            androidx.camera.core.impl.ImageReaderProxy r1 = r3.mImageReaderProxy     // Catch: java.lang.Throwable -> Lf
            androidx.camera.core.p0 r2 = new androidx.camera.core.p0     // Catch: java.lang.Throwable -> Lf
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf
            r1.setOnImageAvailableListener(r2, r5)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return
        Lf:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r4
    }

    public void setOnImageCloseListener(@androidx.annotation.NonNull androidx.camera.core.ForwardingImageProxy.OnImageCloseListener r2) {
            r1 = this;
            java.lang.Object r0 = r1.mLock
            monitor-enter(r0)
            r1.mForwardingImageCloseListener = r2     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r2
    }
}
