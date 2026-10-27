package xyz.adscope.common.v2.cache;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public interface IResourceLruCache {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface IResourceCacheCallback {
        void onCacheDone(java.io.File r1);

        void onCacheException();
    }

    void cacheResource(android.content.Context r1, java.lang.String r2, xyz.adscope.common.v2.cache.LruCacheModel r3);

    void getCacheResource(android.content.Context r1, java.lang.String r2, xyz.adscope.common.v2.cache.LruCacheModel r3, xyz.adscope.common.v2.cache.IResourceLruCache.IResourceCacheCallback r4);

    void releaseCacheDirMemory(android.content.Context r1);
}
