package androidx.camera.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class AndroidImageProxy implements androidx.camera.core.ImageProxy {
    private final android.media.Image mImage;
    private final androidx.camera.core.ImageInfo mImageInfo;
    private final androidx.camera.core.AndroidImageProxy.PlaneProxy[] mPlanes;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class PlaneProxy implements androidx.camera.core.ImageProxy.PlaneProxy {
        private final android.media.Image.Plane mPlane;

        PlaneProxy(android.media.Image.Plane r1) {
                r0 = this;
                r0.<init>()
                r0.mPlane = r1
                return
        }

        @Override // androidx.camera.core.ImageProxy.PlaneProxy
        @androidx.annotation.NonNull
        public java.nio.ByteBuffer getBuffer() {
                r1 = this;
                android.media.Image$Plane r0 = r1.mPlane
                java.nio.ByteBuffer r0 = r0.getBuffer()
                return r0
        }

        @Override // androidx.camera.core.ImageProxy.PlaneProxy
        public int getPixelStride() {
                r1 = this;
                android.media.Image$Plane r0 = r1.mPlane
                int r0 = r0.getPixelStride()
                return r0
        }

        @Override // androidx.camera.core.ImageProxy.PlaneProxy
        public int getRowStride() {
                r1 = this;
                android.media.Image$Plane r0 = r1.mPlane
                int r0 = r0.getRowStride()
                return r0
        }
    }

    AndroidImageProxy(@androidx.annotation.NonNull android.media.Image r7) {
            r6 = this;
            r6.<init>()
            r6.mImage = r7
            android.media.Image$Plane[] r0 = r7.getPlanes()
            r1 = 0
            if (r0 == 0) goto L23
            int r2 = r0.length
            androidx.camera.core.AndroidImageProxy$PlaneProxy[] r2 = new androidx.camera.core.AndroidImageProxy.PlaneProxy[r2]
            r6.mPlanes = r2
            r2 = 0
        L12:
            int r3 = r0.length
            if (r2 >= r3) goto L27
            androidx.camera.core.AndroidImageProxy$PlaneProxy[] r3 = r6.mPlanes
            androidx.camera.core.AndroidImageProxy$PlaneProxy r4 = new androidx.camera.core.AndroidImageProxy$PlaneProxy
            r5 = r0[r2]
            r4.<init>(r5)
            r3[r2] = r4
            int r2 = r2 + 1
            goto L12
        L23:
            androidx.camera.core.AndroidImageProxy$PlaneProxy[] r0 = new androidx.camera.core.AndroidImageProxy.PlaneProxy[r1]
            r6.mPlanes = r0
        L27:
            androidx.camera.core.impl.TagBundle r0 = androidx.camera.core.impl.TagBundle.emptyBundle()
            long r2 = r7.getTimestamp()
            android.graphics.Matrix r7 = new android.graphics.Matrix
            r7.<init>()
            androidx.camera.core.ImageInfo r7 = androidx.camera.core.ImmutableImageInfo.create(r0, r2, r1, r7)
            r6.mImageInfo = r7
            return
    }

    @Override // androidx.camera.core.ImageProxy, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            android.media.Image r0 = r1.mImage
            r0.close()
            return
    }

    @Override // androidx.camera.core.ImageProxy
    @androidx.annotation.NonNull
    public android.graphics.Rect getCropRect() {
            r1 = this;
            android.media.Image r0 = r1.mImage
            android.graphics.Rect r0 = r0.getCropRect()
            return r0
    }

    @Override // androidx.camera.core.ImageProxy
    public int getFormat() {
            r1 = this;
            android.media.Image r0 = r1.mImage
            int r0 = r0.getFormat()
            return r0
    }

    @Override // androidx.camera.core.ImageProxy
    public int getHeight() {
            r1 = this;
            android.media.Image r0 = r1.mImage
            int r0 = r0.getHeight()
            return r0
    }

    @Override // androidx.camera.core.ImageProxy
    @androidx.camera.core.ExperimentalGetImage
    public android.media.Image getImage() {
            r1 = this;
            android.media.Image r0 = r1.mImage
            return r0
    }

    @Override // androidx.camera.core.ImageProxy
    @androidx.annotation.NonNull
    public androidx.camera.core.ImageInfo getImageInfo() {
            r1 = this;
            androidx.camera.core.ImageInfo r0 = r1.mImageInfo
            return r0
    }

    @Override // androidx.camera.core.ImageProxy
    @androidx.annotation.NonNull
    public androidx.camera.core.ImageProxy.PlaneProxy[] getPlanes() {
            r1 = this;
            androidx.camera.core.AndroidImageProxy$PlaneProxy[] r0 = r1.mPlanes
            return r0
    }

    @Override // androidx.camera.core.ImageProxy
    public int getWidth() {
            r1 = this;
            android.media.Image r0 = r1.mImage
            int r0 = r0.getWidth()
            return r0
    }

    @Override // androidx.camera.core.ImageProxy
    public void setCropRect(@androidx.annotation.Nullable android.graphics.Rect r2) {
            r1 = this;
            android.media.Image r0 = r1.mImage
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
