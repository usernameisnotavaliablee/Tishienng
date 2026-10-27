package xyz.adscope.common.v2.image.loader;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class BitmapHolder {
    private final xyz.adscope.common.v2.image.loader.BitmapHolder.LimitedLinkedHashMap<java.lang.String, android.graphics.Bitmap> mLruBitmapCache;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: xyz.adscope.common.v2.image.loader.BitmapHolder$1, reason: invalid class name */
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

        /* synthetic */ BitmapHandler(xyz.adscope.common.v2.image.loader.IBitmapResult r1, xyz.adscope.common.v2.image.loader.BitmapHolder.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.os.Handler
        public void handleMessage(@androidx.annotation.NonNull android.os.Message r3) {
                r2 = this;
                int r0 = r3.what
                r1 = 1
                if (r0 != r1) goto L18
                java.lang.Object r0 = r3.obj
                boolean r1 = r0 instanceof android.graphics.Bitmap
                if (r1 == 0) goto L13
                xyz.adscope.common.v2.image.loader.IBitmapResult r1 = r2.mCallback
                android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
                r1.onImageLoaded(r0)
                goto L18
            L13:
                xyz.adscope.common.v2.image.loader.IBitmapResult r0 = r2.mCallback
                r0.onImageLoadFailed()
            L18:
                int r3 = r3.what
                r0 = 99
                if (r3 != r0) goto L23
                xyz.adscope.common.v2.image.loader.IBitmapResult r3 = r2.mCallback
                r3.onImageLoadFailed()
            L23:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class InstanceHolder {
        private static xyz.adscope.common.v2.image.loader.BitmapHolder instance;

        static {
                xyz.adscope.common.v2.image.loader.BitmapHolder r0 = new xyz.adscope.common.v2.image.loader.BitmapHolder
                r1 = 0
                r0.<init>(r1)
                xyz.adscope.common.v2.image.loader.BitmapHolder.InstanceHolder.instance = r0
                return
        }

        private InstanceHolder() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ xyz.adscope.common.v2.image.loader.BitmapHolder access$100() {
                xyz.adscope.common.v2.image.loader.BitmapHolder r0 = xyz.adscope.common.v2.image.loader.BitmapHolder.InstanceHolder.instance
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class LimitedLinkedHashMap<K, V> extends java.util.LinkedHashMap<K, V> {
        private final int maxCapacity;

        private LimitedLinkedHashMap(int r3) {
                r2 = this;
                r0 = 1061158912(0x3f400000, float:0.75)
                r1 = 1
                r2.<init>(r3, r0, r1)
                r2.maxCapacity = r3
                return
        }

        /* synthetic */ LimitedLinkedHashMap(int r1, xyz.adscope.common.v2.image.loader.BitmapHolder.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(java.util.Map.Entry<K, V> r2) {
                r1 = this;
                int r2 = r1.size()
                int r0 = r1.maxCapacity
                if (r2 <= r0) goto La
                r2 = 1
                return r2
            La:
                r2 = 0
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class ResourceCacheCallback2 extends xyz.adscope.common.v2.cache2.IResourceCacheCallback {
        private final android.os.Handler mHandler;
        final /* synthetic */ xyz.adscope.common.v2.image.loader.BitmapHolder this$0;

        private ResourceCacheCallback2(xyz.adscope.common.v2.image.loader.BitmapHolder r1, android.os.Handler r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.mHandler = r2
                return
        }

        /* synthetic */ ResourceCacheCallback2(xyz.adscope.common.v2.image.loader.BitmapHolder r1, android.os.Handler r2, xyz.adscope.common.v2.image.loader.BitmapHolder.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // xyz.adscope.common.v2.cache2.IResourceCacheCallback
        public void onCacheException(java.lang.String r2) {
                r1 = this;
                android.os.Handler r2 = r1.mHandler
                r0 = 99
                r2.sendEmptyMessage(r0)
                return
        }

        @Override // xyz.adscope.common.v2.cache2.IResourceCacheCallback
        public void onCacheFile(java.lang.String r5, java.io.File r6) {
                r4 = this;
                boolean r0 = r6.exists()
                r1 = 99
                if (r0 == 0) goto L37
                long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lf
                r6.setLastModified(r2)     // Catch: java.lang.Throwable -> Lf
            Lf:
                android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Exception -> L31
                r0.<init>()     // Catch: java.lang.Exception -> L31
                java.lang.String r6 = r6.getAbsolutePath()     // Catch: java.lang.Exception -> L31
                android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeFile(r6, r0)     // Catch: java.lang.Exception -> L31
                if (r6 == 0) goto L2b
                xyz.adscope.common.v2.image.loader.BitmapHolder r0 = r4.this$0     // Catch: java.lang.Exception -> L31
                xyz.adscope.common.v2.image.loader.BitmapHolder.access$500(r0, r5, r6)     // Catch: java.lang.Exception -> L31
                xyz.adscope.common.v2.image.loader.BitmapHolder r5 = r4.this$0     // Catch: java.lang.Exception -> L31
                android.os.Handler r0 = r4.mHandler     // Catch: java.lang.Exception -> L31
                xyz.adscope.common.v2.image.loader.BitmapHolder.access$600(r5, r0, r6)     // Catch: java.lang.Exception -> L31
                goto L36
            L2b:
                android.os.Handler r5 = r4.mHandler     // Catch: java.lang.Exception -> L31
                r5.sendEmptyMessage(r1)     // Catch: java.lang.Exception -> L31
                goto L36
            L31:
                android.os.Handler r5 = r4.mHandler
                r5.sendEmptyMessage(r1)
            L36:
                return
            L37:
                android.os.Handler r5 = r4.mHandler
                r5.sendEmptyMessage(r1)
                return
        }

        @Override // xyz.adscope.common.v2.cache2.IResourceCacheCallback
        public void onCacheInputStream(java.lang.String r3, java.io.InputStream r4, java.io.File r5) {
                r2 = this;
                android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
                r0.<init>()
                r1 = 0
                r0.inPreferQualityOverSpeed = r1
                r1 = 0
                android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeStream(r4, r1, r0)
                if (r4 == 0) goto L28
                xyz.adscope.common.v2.image.loader.BitmapHolder r0 = r2.this$0
                xyz.adscope.common.v2.image.loader.BitmapHolder.access$500(r0, r3, r4)
                xyz.adscope.common.v2.image.loader.BitmapHolder r3 = r2.this$0
                android.os.Handler r0 = r2.mHandler
                xyz.adscope.common.v2.image.loader.BitmapHolder.access$600(r3, r0, r4)
                java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.io.FileNotFoundException -> L27
                r3.<init>(r5)     // Catch: java.io.FileNotFoundException -> L27
                android.graphics.Bitmap$CompressFormat r5 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.io.FileNotFoundException -> L27
                r0 = 100
                r4.compress(r5, r0, r3)     // Catch: java.io.FileNotFoundException -> L27
            L27:
                return
            L28:
                android.os.Handler r3 = r2.mHandler
                r4 = 99
                r3.sendEmptyMessage(r4)
                return
        }
    }

    private BitmapHolder() {
            r3 = this;
            r3.<init>()
            xyz.adscope.common.v2.image.loader.BitmapHolder$LimitedLinkedHashMap r0 = new xyz.adscope.common.v2.image.loader.BitmapHolder$LimitedLinkedHashMap
            r1 = 20
            r2 = 0
            r0.<init>(r1, r2)
            r3.mLruBitmapCache = r0
            xyz.adscope.common.v2.image.loader.BitmapHolder r0 = xyz.adscope.common.v2.image.loader.BitmapHolder.InstanceHolder.access$100()
            if (r0 != 0) goto L14
            return
        L14:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Singleton ..."
            r0.<init>(r1)
            throw r0
    }

    /* synthetic */ BitmapHolder(xyz.adscope.common.v2.image.loader.BitmapHolder.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ void access$500(xyz.adscope.common.v2.image.loader.BitmapHolder r0, java.lang.String r1, android.graphics.Bitmap r2) {
            r0.cacheBitmapLru(r1, r2)
            return
    }

    static /* synthetic */ void access$600(xyz.adscope.common.v2.image.loader.BitmapHolder r0, android.os.Handler r1, android.graphics.Bitmap r2) {
            r0.sendSuccessMessage(r1, r2)
            return
    }

    private void cacheBitmapLru(java.lang.String r3, android.graphics.Bitmap r4) {
            r2 = this;
            xyz.adscope.common.v2.image.loader.BitmapHolder$LimitedLinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r2.mLruBitmapCache
            monitor-enter(r0)
            xyz.adscope.common.v2.image.loader.BitmapHolder$LimitedLinkedHashMap<java.lang.String, android.graphics.Bitmap> r1 = r2.mLruBitmapCache     // Catch: java.lang.Throwable -> La
            r1.put(r3, r4)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r3
    }

    private android.graphics.Bitmap getCacheBitmapLru(java.lang.String r3) {
            r2 = this;
            xyz.adscope.common.v2.image.loader.BitmapHolder$LimitedLinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r2.mLruBitmapCache
            monitor-enter(r0)
            xyz.adscope.common.v2.image.loader.BitmapHolder$LimitedLinkedHashMap<java.lang.String, android.graphics.Bitmap> r1 = r2.mLruBitmapCache     // Catch: java.lang.Throwable -> Ld
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.Throwable -> Ld
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return r3
        Ld:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r3
    }

    private java.lang.String getCacheTaskKey(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = xyz.adscope.common.v2.encrypt.impl.MD5Util.md5(r1)
            return r1
    }

    public static xyz.adscope.common.v2.image.loader.BitmapHolder getInstance() {
            xyz.adscope.common.v2.image.loader.BitmapHolder r0 = xyz.adscope.common.v2.image.loader.BitmapHolder.InstanceHolder.access$100()
            return r0
    }

    private void sendSuccessMessage(android.os.Handler r3, android.graphics.Bitmap r4) {
            r2 = this;
            android.os.Message r0 = android.os.Message.obtain()
            r1 = 1
            r0.what = r1
            r0.obj = r4
            r3.sendMessage(r0)
            return
    }

    public void loadImage(android.content.Context r4, java.lang.String r5, boolean r6, xyz.adscope.common.v2.image.loader.IBitmapResult r7) {
            r3 = this;
            java.lang.String r0 = r3.getCacheTaskKey(r5)
            android.graphics.Bitmap r0 = r3.getCacheBitmapLru(r0)
            xyz.adscope.common.v2.image.loader.BitmapHolder$BitmapHandler r1 = new xyz.adscope.common.v2.image.loader.BitmapHolder$BitmapHandler
            r2 = 0
            r1.<init>(r7, r2)
            if (r0 == 0) goto L14
            r3.sendSuccessMessage(r1, r0)
            return
        L14:
            xyz.adscope.common.v2.image.loader.BitmapHolder$ResourceCacheCallback2 r7 = new xyz.adscope.common.v2.image.loader.BitmapHolder$ResourceCacheCallback2
            r7.<init>(r3, r1, r2)
            xyz.adscope.common.v2.cache2.ImageLruCache2 r0 = xyz.adscope.common.v2.cache2.ImageLruCache2.getInstance()
            if (r6 == 0) goto L22
            xyz.adscope.common.v2.cache.LruCacheModel r6 = xyz.adscope.common.v2.cache.LruCacheModel.TEMPORARY
            goto L24
        L22:
            xyz.adscope.common.v2.cache.LruCacheModel r6 = xyz.adscope.common.v2.cache.LruCacheModel.PERMANENT
        L24:
            r0.getCacheResource(r4, r5, r6, r7)
            return
    }
}
