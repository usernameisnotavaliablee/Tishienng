package androidx.camera.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class SettableImageProxy extends androidx.camera.core.ForwardingImageProxy {

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("mLock")
    private android.graphics.Rect mCropRect;
    private final int mHeight;
    private final androidx.camera.core.ImageInfo mImageInfo;
    private final java.lang.Object mLock;
    private final int mWidth;

    public SettableImageProxy(@androidx.annotation.NonNull androidx.camera.core.ImageProxy r1, @androidx.annotation.Nullable android.util.Size r2, @androidx.annotation.NonNull androidx.camera.core.ImageInfo r3) {
            r0 = this;
            r0.<init>(r1)
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.mLock = r1
            if (r2 != 0) goto L19
            int r1 = super.getWidth()
            r0.mWidth = r1
            int r1 = super.getHeight()
            r0.mHeight = r1
            goto L25
        L19:
            int r1 = r2.getWidth()
            r0.mWidth = r1
            int r1 = r2.getHeight()
            r0.mHeight = r1
        L25:
            r0.mImageInfo = r3
            return
    }

    SettableImageProxy(androidx.camera.core.ImageProxy r2, androidx.camera.core.ImageInfo r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r3)
            return
    }

    @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
    @androidx.annotation.NonNull
    public android.graphics.Rect getCropRect() {
            r5 = this;
            java.lang.Object r0 = r5.mLock
            monitor-enter(r0)
            android.graphics.Rect r1 = r5.mCropRect     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L19
            android.graphics.Rect r1 = new android.graphics.Rect     // Catch: java.lang.Throwable -> L17
            int r2 = r5.getWidth()     // Catch: java.lang.Throwable -> L17
            int r3 = r5.getHeight()     // Catch: java.lang.Throwable -> L17
            r4 = 0
            r1.<init>(r4, r4, r2, r3)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            return r1
        L17:
            r1 = move-exception
            goto L22
        L19:
            android.graphics.Rect r1 = new android.graphics.Rect     // Catch: java.lang.Throwable -> L17
            android.graphics.Rect r2 = r5.mCropRect     // Catch: java.lang.Throwable -> L17
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            return r1
        L22:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r1
    }

    @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
    public int getHeight() {
            r1 = this;
            int r0 = r1.mHeight
            return r0
    }

    @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
    @androidx.annotation.NonNull
    public androidx.camera.core.ImageInfo getImageInfo() {
            r1 = this;
            androidx.camera.core.ImageInfo r0 = r1.mImageInfo
            return r0
    }

    @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
    public int getWidth() {
            r1 = this;
            int r0 = r1.mWidth
            return r0
    }

    @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
    public void setCropRect(@androidx.annotation.Nullable android.graphics.Rect r4) {
            r3 = this;
            if (r4 == 0) goto L1a
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r4)
            int r4 = r3.getWidth()
            int r1 = r3.getHeight()
            r2 = 0
            boolean r4 = r0.intersect(r2, r2, r4, r1)
            if (r4 != 0) goto L19
            r0.setEmpty()
        L19:
            r4 = r0
        L1a:
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            r3.mCropRect = r4     // Catch: java.lang.Throwable -> L21
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            return
        L21:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r4
    }
}
