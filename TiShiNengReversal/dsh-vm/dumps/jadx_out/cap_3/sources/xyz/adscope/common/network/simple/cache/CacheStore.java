package xyz.adscope.common.network.simple.cache;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public interface CacheStore {
    public static final xyz.adscope.common.network.simple.cache.CacheStore DEFAULT = null;


    static {
            xyz.adscope.common.network.simple.cache.CacheStore$1 r0 = new xyz.adscope.common.network.simple.cache.CacheStore$1
            r0.<init>()
            xyz.adscope.common.network.simple.cache.CacheStore.DEFAULT = r0
            return
    }

    boolean clear();

    xyz.adscope.common.network.simple.cache.Cache get(java.lang.String r1);

    boolean remove(java.lang.String r1);

    boolean replace(java.lang.String r1, xyz.adscope.common.network.simple.cache.Cache r2);
}
