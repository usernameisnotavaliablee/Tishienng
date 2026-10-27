package xyz.adscope.common.v2.cache2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class ImageLruCache2 extends xyz.adscope.common.v2.cache2.IBaseLruCache2 {
    private static final java.lang.String IMAGE_PERMANENT_DIR = null;
    private static final java.lang.String IMAGE_TEMPORARY_DIR = null;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class ImageResourceCacheTask extends xyz.adscope.common.v2.cache2.IBaseLruCache2.ResourceCacheTask<java.io.InputStream> {


        protected ImageResourceCacheTask(java.lang.String r1, java.io.File r2, java.lang.String r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                xyz.adscope.common.v2.cache2.ImageLruCache2$ImageResourceCacheTask$1 r0 = new xyz.adscope.common.v2.cache2.ImageLruCache2$ImageResourceCacheTask$1
                r0.<init>(r3)
                xyz.adscope.common.v2.conn.http.CommonRequestBuilder r1 = new xyz.adscope.common.v2.conn.http.CommonRequestBuilder
                r1.<init>()
                r2 = 1
                xyz.adscope.common.v2.conn.http.CommonRequestBuilder r1 = r1.autoRedirected(r2)
                xyz.adscope.common.v2.conn.http.CommonRequestBuilder r0 = r1.concern(r0)
                java.lang.String r1 = r3.mURL
                r0.cacheImage(r1)
                xyz.adscope.common.v2.conn.http.exec.IBaseHttpExecutor r0 = r0.performLocalIO()
                r0.run()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class InstanceHolder {
        private static xyz.adscope.common.v2.cache2.ImageLruCache2 instance;

        static {
                xyz.adscope.common.v2.cache2.ImageLruCache2 r0 = new xyz.adscope.common.v2.cache2.ImageLruCache2
                r1 = 0
                r0.<init>(r1)
                xyz.adscope.common.v2.cache2.ImageLruCache2.InstanceHolder.instance = r0
                return
        }

        private InstanceHolder() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ xyz.adscope.common.v2.cache2.ImageLruCache2 access$100() {
                xyz.adscope.common.v2.cache2.ImageLruCache2 r0 = xyz.adscope.common.v2.cache2.ImageLruCache2.InstanceHolder.instance
                return r0
        }
    }

    static {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Image_permanent"
            r0.append(r1)
            java.lang.String r1 = java.io.File.separator
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            xyz.adscope.common.v2.cache2.ImageLruCache2.IMAGE_PERMANENT_DIR = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Image_temporary"
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            xyz.adscope.common.v2.cache2.ImageLruCache2.IMAGE_TEMPORARY_DIR = r0
            return
    }

    private ImageLruCache2() {
            r2 = this;
            r2.<init>()
            xyz.adscope.common.v2.cache2.ImageLruCache2 r0 = xyz.adscope.common.v2.cache2.ImageLruCache2.InstanceHolder.access$100()
            if (r0 != 0) goto La
            return
        La:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Singleton ..."
            r0.<init>(r1)
            throw r0
    }

    /* synthetic */ ImageLruCache2(xyz.adscope.common.v2.cache2.ImageLruCache2.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static xyz.adscope.common.v2.cache2.ImageLruCache2 getInstance() {
            xyz.adscope.common.v2.cache2.ImageLruCache2 r0 = xyz.adscope.common.v2.cache2.ImageLruCache2.InstanceHolder.access$100()
            return r0
    }

    @Override // xyz.adscope.common.v2.cache2.IBaseLruCache2
    protected java.io.File getCacheDir(android.content.Context r5, xyz.adscope.common.v2.cache.LruCacheModel r6) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L2f
            xyz.adscope.common.v2.cache.LruCacheModel r1 = xyz.adscope.common.v2.cache.LruCacheModel.PERMANENT
            if (r6 != r1) goto L13
            java.io.File r1 = new java.io.File
            java.io.File r2 = r5.getCacheDir()
            java.lang.String r3 = xyz.adscope.common.v2.cache2.ImageLruCache2.IMAGE_PERMANENT_DIR
            r1.<init>(r2, r3)
            goto L14
        L13:
            r1 = r0
        L14:
            xyz.adscope.common.v2.cache.LruCacheModel r2 = xyz.adscope.common.v2.cache.LruCacheModel.TEMPORARY
            if (r6 != r2) goto L23
            java.io.File r1 = new java.io.File
            java.io.File r5 = r5.getCacheDir()
            java.lang.String r6 = xyz.adscope.common.v2.cache2.ImageLruCache2.IMAGE_TEMPORARY_DIR
            r1.<init>(r5, r6)
        L23:
            if (r1 == 0) goto L2f
            boolean r5 = r1.exists()     // Catch: java.lang.SecurityException -> L2f
            if (r5 != 0) goto L2e
            r1.mkdirs()     // Catch: java.lang.SecurityException -> L2f
        L2e:
            return r1
        L2f:
            return r0
    }

    @Override // xyz.adscope.common.v2.cache2.IBaseLruCache2
    protected java.lang.String getCacheFileName(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = xyz.adscope.common.v2.encrypt.impl.MD5Util.md5(r1)
            return r1
    }

    @Override // xyz.adscope.common.v2.cache2.IBaseLruCache2
    protected xyz.adscope.common.v2.cache2.IBaseLruCache2.ResourceCacheTask<?> getResourceCacheTask(java.lang.String r2, java.io.File r3, java.lang.String r4) {
            r1 = this;
            xyz.adscope.common.v2.cache2.ImageLruCache2$ImageResourceCacheTask r0 = new xyz.adscope.common.v2.cache2.ImageLruCache2$ImageResourceCacheTask
            r0.<init>(r2, r3, r4)
            xyz.adscope.common.v2.cache2.ImageLruCache2$1 r2 = new xyz.adscope.common.v2.cache2.ImageLruCache2$1
            r2.<init>(r1, r3)
            r0.setHttpResponseCallback(r2)
            return r0
    }

    @Override // xyz.adscope.common.v2.cache2.IBaseLruCache2
    protected int maxCacheSizeM() {
            r1 = this;
            r0 = 200(0xc8, float:2.8E-43)
            return r0
    }
}
