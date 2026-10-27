package xyz.adscope.common.v2.image.loader;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class BitmapDecode {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: xyz.adscope.common.v2.image.loader.BitmapDecode$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class BitmapHandler extends android.os.Handler {
        private static final int LOADED_DONE = 1;
        private static final int LOADED_FAILED = 99;
        private final xyz.adscope.common.v2.image.loader.IBitmapResult mCallback;

        private BitmapHandler(xyz.adscope.common.v2.image.loader.IBitmapResult r2) {
                r1 = this;
                android.os.Looper r0 = android.os.Looper.getMainLooper()
                r1.<init>(r0)
                r1.mCallback = r2
                return
        }

        /* synthetic */ BitmapHandler(xyz.adscope.common.v2.image.loader.IBitmapResult r1, xyz.adscope.common.v2.image.loader.BitmapDecode.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.os.Handler
        public void handleMessage(@androidx.annotation.NonNull android.os.Message r3) {
                r2 = this;
                int r0 = r3.what
                r1 = 1
                if (r0 != r1) goto Le
                xyz.adscope.common.v2.image.loader.IBitmapResult r0 = r2.mCallback
                java.lang.Object r1 = r3.obj
                android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
                r0.onImageLoaded(r1)
            Le:
                int r3 = r3.what
                r0 = 99
                if (r3 != r0) goto L19
                xyz.adscope.common.v2.image.loader.IBitmapResult r3 = r2.mCallback
                r3.onImageLoadFailed()
            L19:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class ResourceCacheCallback implements xyz.adscope.common.v2.cache.IResourceLruCache.IResourceCacheCallback {
        private final android.os.Handler mHandler;

        private ResourceCacheCallback(android.os.Handler r1) {
                r0 = this;
                r0.<init>()
                r0.mHandler = r1
                return
        }

        /* synthetic */ ResourceCacheCallback(android.os.Handler r1, xyz.adscope.common.v2.image.loader.BitmapDecode.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // xyz.adscope.common.v2.cache.IResourceLruCache.IResourceCacheCallback
        public void onCacheDone(java.io.File r5) {
                r4 = this;
                boolean r0 = r5.exists()
                r1 = 99
                if (r0 == 0) goto L35
                long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.IllegalArgumentException -> Lf
                r5.setLastModified(r2)     // Catch: java.lang.IllegalArgumentException -> Lf
            Lf:
                java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L2f
                r0.<init>(r5)     // Catch: java.io.FileNotFoundException -> L2f
                android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeStream(r0)     // Catch: java.io.FileNotFoundException -> L2f
                if (r5 == 0) goto L29
                android.os.Message r0 = android.os.Message.obtain()     // Catch: java.io.FileNotFoundException -> L2f
                r2 = 1
                r0.what = r2     // Catch: java.io.FileNotFoundException -> L2f
                r0.obj = r5     // Catch: java.io.FileNotFoundException -> L2f
                android.os.Handler r5 = r4.mHandler     // Catch: java.io.FileNotFoundException -> L2f
                r5.sendMessage(r0)     // Catch: java.io.FileNotFoundException -> L2f
                goto L34
            L29:
                android.os.Handler r5 = r4.mHandler     // Catch: java.io.FileNotFoundException -> L2f
                r5.sendEmptyMessage(r1)     // Catch: java.io.FileNotFoundException -> L2f
                goto L34
            L2f:
                android.os.Handler r5 = r4.mHandler
                r5.sendEmptyMessage(r1)
            L34:
                return
            L35:
                android.os.Handler r5 = r4.mHandler
                r5.sendEmptyMessage(r1)
                return
        }

        @Override // xyz.adscope.common.v2.cache.IResourceLruCache.IResourceCacheCallback
        public void onCacheException() {
                r2 = this;
                android.os.Handler r0 = r2.mHandler
                r1 = 99
                r0.sendEmptyMessage(r1)
                return
        }
    }

    private BitmapDecode() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void loadImage(android.content.Context r2, java.lang.String r3, boolean r4, xyz.adscope.common.v2.image.loader.IBitmapResult r5) {
            xyz.adscope.common.v2.image.loader.BitmapDecode$BitmapHandler r0 = new xyz.adscope.common.v2.image.loader.BitmapDecode$BitmapHandler
            r1 = 0
            r0.<init>(r5, r1)
            xyz.adscope.common.v2.image.loader.BitmapDecode$ResourceCacheCallback r5 = new xyz.adscope.common.v2.image.loader.BitmapDecode$ResourceCacheCallback
            r5.<init>(r0, r1)
            xyz.adscope.common.v2.cache.ImageLruCache r0 = xyz.adscope.common.v2.cache.ImageLruCache.getInstance()
            if (r4 == 0) goto L14
            xyz.adscope.common.v2.cache.LruCacheModel r4 = xyz.adscope.common.v2.cache.LruCacheModel.TEMPORARY
            goto L16
        L14:
            xyz.adscope.common.v2.cache.LruCacheModel r4 = xyz.adscope.common.v2.cache.LruCacheModel.PERMANENT
        L16:
            r0.getCacheResource(r2, r3, r4, r5)
            return
    }
}
