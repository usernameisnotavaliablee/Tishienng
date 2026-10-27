package androidx.camera.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class AndroidImageReaderProxy implements androidx.camera.core.impl.ImageReaderProxy {

    @androidx.annotation.GuardedBy("mLock")
    private final android.media.ImageReader mImageReader;

    @androidx.annotation.GuardedBy("mLock")
    private boolean mIsImageAvailableListenerCleared;
    private final java.lang.Object mLock;

    AndroidImageReaderProxy(android.media.ImageReader r2) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.mLock = r0
            r0 = 1
            r1.mIsImageAvailableListenerCleared = r0
            r1.mImageReader = r2
            return
    }

    public static /* synthetic */ void a(androidx.camera.core.AndroidImageReaderProxy r1, java.util.concurrent.Executor r2, androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener r3, android.media.ImageReader r4) {
            java.lang.Object r4 = r1.mLock
            monitor-enter(r4)
            boolean r0 = r1.mIsImageAvailableListenerCleared     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto L12
            androidx.camera.core.a r0 = new androidx.camera.core.a     // Catch: java.lang.Throwable -> L10
            r0.<init>(r1, r3)     // Catch: java.lang.Throwable -> L10
            r2.execute(r0)     // Catch: java.lang.Throwable -> L10
            goto L12
        L10:
            r1 = move-exception
            goto L14
        L12:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L10
            return
        L14:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L10
            throw r1
    }

    public static /* synthetic */ void b(androidx.camera.core.AndroidImageReaderProxy r0, androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener r1) {
            r0.getClass()
            r1.onImageAvailable(r0)
            return
    }

    private boolean isImageReaderContextNotInitializedException(java.lang.RuntimeException r2) {
            r1 = this;
            java.lang.String r0 = "ImageReaderContext is not initialized"
            java.lang.String r2 = r2.getMessage()
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    @androidx.annotation.Nullable
    public androidx.camera.core.ImageProxy acquireLatestImage() {
            r4 = this;
            java.lang.Object r0 = r4.mLock
            monitor-enter(r0)
            r1 = 0
            android.media.ImageReader r2 = r4.mImageReader     // Catch: java.lang.Throwable -> Lb java.lang.RuntimeException -> Ld
            android.media.Image r2 = r2.acquireLatestImage()     // Catch: java.lang.Throwable -> Lb java.lang.RuntimeException -> Ld
            goto L15
        Lb:
            r1 = move-exception
            goto L21
        Ld:
            r2 = move-exception
            boolean r3 = r4.isImageReaderContextNotInitializedException(r2)     // Catch: java.lang.Throwable -> Lb
            if (r3 == 0) goto L20
            r2 = r1
        L15:
            if (r2 != 0) goto L19
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        L19:
            androidx.camera.core.AndroidImageProxy r1 = new androidx.camera.core.AndroidImageProxy     // Catch: java.lang.Throwable -> Lb
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        L20:
            throw r2     // Catch: java.lang.Throwable -> Lb
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    @androidx.annotation.Nullable
    public androidx.camera.core.ImageProxy acquireNextImage() {
            r4 = this;
            java.lang.Object r0 = r4.mLock
            monitor-enter(r0)
            r1 = 0
            android.media.ImageReader r2 = r4.mImageReader     // Catch: java.lang.Throwable -> Lb java.lang.RuntimeException -> Ld
            android.media.Image r2 = r2.acquireNextImage()     // Catch: java.lang.Throwable -> Lb java.lang.RuntimeException -> Ld
            goto L15
        Lb:
            r1 = move-exception
            goto L21
        Ld:
            r2 = move-exception
            boolean r3 = r4.isImageReaderContextNotInitializedException(r2)     // Catch: java.lang.Throwable -> Lb
            if (r3 == 0) goto L20
            r2 = r1
        L15:
            if (r2 != 0) goto L19
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        L19:
            androidx.camera.core.AndroidImageProxy r1 = new androidx.camera.core.AndroidImageProxy     // Catch: java.lang.Throwable -> Lb
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        L20:
            throw r2     // Catch: java.lang.Throwable -> Lb
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void clearOnImageAvailableListener() {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            r1 = 1
            r3.mIsImageAvailableListenerCleared = r1     // Catch: java.lang.Throwable -> Le
            android.media.ImageReader r1 = r3.mImageReader     // Catch: java.lang.Throwable -> Le
            r2 = 0
            r1.setOnImageAvailableListener(r2, r2)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void close() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            android.media.ImageReader r1 = r2.mImageReader     // Catch: java.lang.Throwable -> La
            r1.close()     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getHeight() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            android.media.ImageReader r1 = r2.mImageReader     // Catch: java.lang.Throwable -> Lb
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
            android.media.ImageReader r1 = r2.mImageReader     // Catch: java.lang.Throwable -> Lb
            int r1 = r1.getImageFormat()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getMaxImages() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            android.media.ImageReader r1 = r2.mImageReader     // Catch: java.lang.Throwable -> Lb
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
            android.media.ImageReader r1 = r2.mImageReader     // Catch: java.lang.Throwable -> Lb
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
            android.media.ImageReader r1 = r2.mImageReader     // Catch: java.lang.Throwable -> Lb
            int r1 = r1.getWidth()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void setOnImageAvailableListener(@androidx.annotation.NonNull androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener r3, @androidx.annotation.NonNull java.util.concurrent.Executor r4) {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            r1 = 0
            r2.mIsImageAvailableListenerCleared = r1     // Catch: java.lang.Throwable -> L16
            androidx.camera.core.b r1 = new androidx.camera.core.b     // Catch: java.lang.Throwable -> L16
            r1.<init>(r2, r4, r3)     // Catch: java.lang.Throwable -> L16
            android.media.ImageReader r3 = r2.mImageReader     // Catch: java.lang.Throwable -> L16
            android.os.Handler r4 = androidx.camera.core.impl.utils.MainThreadAsyncHandler.getInstance()     // Catch: java.lang.Throwable -> L16
            r3.setOnImageAvailableListener(r1, r4)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            return
        L16:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r3
    }
}
