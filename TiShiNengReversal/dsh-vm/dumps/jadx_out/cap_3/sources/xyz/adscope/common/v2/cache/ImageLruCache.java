package xyz.adscope.common.v2.cache;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class ImageLruCache extends xyz.adscope.common.v2.cache.IBaseLruCache {
    private static final java.lang.String IMAGE_PERMANENT_DIR = null;
    private static final java.lang.String IMAGE_TEMPORARY_DIR = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: xyz.adscope.common.v2.cache.ImageLruCache$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class InstanceHolder {
        private static xyz.adscope.common.v2.cache.ImageLruCache instance;

        static {
                xyz.adscope.common.v2.cache.ImageLruCache r0 = new xyz.adscope.common.v2.cache.ImageLruCache
                r1 = 0
                r0.<init>(r1)
                xyz.adscope.common.v2.cache.ImageLruCache.InstanceHolder.instance = r0
                return
        }

        private InstanceHolder() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ xyz.adscope.common.v2.cache.ImageLruCache access$100() {
                xyz.adscope.common.v2.cache.ImageLruCache r0 = xyz.adscope.common.v2.cache.ImageLruCache.InstanceHolder.instance
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
            xyz.adscope.common.v2.cache.ImageLruCache.IMAGE_PERMANENT_DIR = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Image_temporary"
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            xyz.adscope.common.v2.cache.ImageLruCache.IMAGE_TEMPORARY_DIR = r0
            return
    }

    private ImageLruCache() {
            r2 = this;
            r2.<init>()
            xyz.adscope.common.v2.cache.ImageLruCache r0 = xyz.adscope.common.v2.cache.ImageLruCache.InstanceHolder.access$100()
            if (r0 != 0) goto La
            return
        La:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Singleton ..."
            r0.<init>(r1)
            throw r0
    }

    /* synthetic */ ImageLruCache(xyz.adscope.common.v2.cache.ImageLruCache.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static xyz.adscope.common.v2.cache.ImageLruCache getInstance() {
            xyz.adscope.common.v2.cache.ImageLruCache r0 = xyz.adscope.common.v2.cache.ImageLruCache.InstanceHolder.access$100()
            return r0
    }

    @Override // xyz.adscope.common.v2.cache.IBaseLruCache
    protected java.io.File getCacheDir(android.content.Context r5, xyz.adscope.common.v2.cache.LruCacheModel r6) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L2f
            xyz.adscope.common.v2.cache.LruCacheModel r1 = xyz.adscope.common.v2.cache.LruCacheModel.PERMANENT
            if (r6 != r1) goto L13
            java.io.File r1 = new java.io.File
            java.io.File r2 = r5.getCacheDir()
            java.lang.String r3 = xyz.adscope.common.v2.cache.ImageLruCache.IMAGE_PERMANENT_DIR
            r1.<init>(r2, r3)
            goto L14
        L13:
            r1 = r0
        L14:
            xyz.adscope.common.v2.cache.LruCacheModel r2 = xyz.adscope.common.v2.cache.LruCacheModel.TEMPORARY
            if (r6 != r2) goto L23
            java.io.File r1 = new java.io.File
            java.io.File r5 = r5.getCacheDir()
            java.lang.String r6 = xyz.adscope.common.v2.cache.ImageLruCache.IMAGE_TEMPORARY_DIR
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

    @Override // xyz.adscope.common.v2.cache.IBaseLruCache
    protected int maxCacheSizeM() {
            r1 = this;
            r0 = 200(0xc8, float:2.8E-43)
            return r0
    }
}
