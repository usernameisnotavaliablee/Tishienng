package androidx.camera.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class ForwardingImageProxy implements androidx.camera.core.ImageProxy {
    protected final androidx.camera.core.ImageProxy mImage;
    private final java.lang.Object mLock;

    @androidx.annotation.GuardedBy("mLock")
    private final java.util.Set<androidx.camera.core.ForwardingImageProxy.OnImageCloseListener> mOnImageCloseListeners;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnImageCloseListener {
        void onImageClose(@androidx.annotation.NonNull androidx.camera.core.ImageProxy r1);
    }

    protected ForwardingImageProxy(@androidx.annotation.NonNull androidx.camera.core.ImageProxy r2) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.mLock = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.mOnImageCloseListeners = r0
            r1.mImage = r2
            return
    }

    public void addOnImageCloseListener(@androidx.annotation.NonNull androidx.camera.core.ForwardingImageProxy.OnImageCloseListener r3) {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            java.util.Set<androidx.camera.core.ForwardingImageProxy$OnImageCloseListener> r1 = r2.mOnImageCloseListeners     // Catch: java.lang.Throwable -> La
            r1.add(r3)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r3
    }

    @Override // androidx.camera.core.ImageProxy, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            androidx.camera.core.ImageProxy r0 = r1.mImage
            r0.close()
            r1.notifyOnImageCloseListeners()
            return
    }

    @Override // androidx.camera.core.ImageProxy
    @androidx.annotation.NonNull
    public android.graphics.Rect getCropRect() {
            r1 = this;
            androidx.camera.core.ImageProxy r0 = r1.mImage
            android.graphics.Rect r0 = r0.getCropRect()
            return r0
    }

    @Override // androidx.camera.core.ImageProxy
    public int getFormat() {
            r1 = this;
            androidx.camera.core.ImageProxy r0 = r1.mImage
            int r0 = r0.getFormat()
            return r0
    }

    @Override // androidx.camera.core.ImageProxy
    public int getHeight() {
            r1 = this;
            androidx.camera.core.ImageProxy r0 = r1.mImage
            int r0 = r0.getHeight()
            return r0
    }

    @Override // androidx.camera.core.ImageProxy
    @androidx.annotation.Nullable
    @androidx.camera.core.ExperimentalGetImage
    public android.media.Image getImage() {
            r1 = this;
            androidx.camera.core.ImageProxy r0 = r1.mImage
            android.media.Image r0 = r0.getImage()
            return r0
    }

    @Override // androidx.camera.core.ImageProxy
    @androidx.annotation.NonNull
    public androidx.camera.core.ImageInfo getImageInfo() {
            r1 = this;
            androidx.camera.core.ImageProxy r0 = r1.mImage
            androidx.camera.core.ImageInfo r0 = r0.getImageInfo()
            return r0
    }

    @Override // androidx.camera.core.ImageProxy
    @androidx.annotation.NonNull
    public androidx.camera.core.ImageProxy.PlaneProxy[] getPlanes() {
            r1 = this;
            androidx.camera.core.ImageProxy r0 = r1.mImage
            androidx.camera.core.ImageProxy$PlaneProxy[] r0 = r0.getPlanes()
            return r0
    }

    @Override // androidx.camera.core.ImageProxy
    public int getWidth() {
            r1 = this;
            androidx.camera.core.ImageProxy r0 = r1.mImage
            int r0 = r0.getWidth()
            return r0
    }

    protected void notifyOnImageCloseListeners() {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            java.util.HashSet r1 = new java.util.HashSet     // Catch: java.lang.Throwable -> L20
            java.util.Set<androidx.camera.core.ForwardingImageProxy$OnImageCloseListener> r2 = r3.mOnImageCloseListeners     // Catch: java.lang.Throwable -> L20
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            java.util.Iterator r0 = r1.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()
            androidx.camera.core.ForwardingImageProxy$OnImageCloseListener r1 = (androidx.camera.core.ForwardingImageProxy.OnImageCloseListener) r1
            r1.onImageClose(r3)
            goto Lf
        L1f:
            return
        L20:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            throw r1
    }

    @Override // androidx.camera.core.ImageProxy
    public void setCropRect(@androidx.annotation.Nullable android.graphics.Rect r2) {
            r1 = this;
            androidx.camera.core.ImageProxy r0 = r1.mImage
            r0.setCropRect(r2)
            return
    }

    @Override // androidx.camera.core.ImageProxy
    public /* synthetic */ android.graphics.Bitmap toBitmap() {
            r1 = this;
            android.graphics.Bitmap r0 = androidx.camera.core.f0.a(r1)
            return r0
    }
}
