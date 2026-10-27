package xyz.adscope.common.network.simple;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public interface SimpleRequest {
    java.lang.String cacheKey();

    xyz.adscope.common.network.simple.cache.CacheMode cacheMode();

    xyz.adscope.common.network.simple.Converter converter();

    xyz.adscope.common.network.Headers headers();

    xyz.adscope.common.network.Url url();
}
