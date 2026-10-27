package xyz.adscope.amps.tool.request;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSNetWorkInit {
    public AMPSNetWorkInit() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void init(android.content.Context r2) {
            xyz.adscope.common.network.KalleConfig$Builder r0 = xyz.adscope.common.network.KalleConfig.newBuilder()
            xyz.adscope.common.network.cookie.DBCookieStore$Builder r1 = xyz.adscope.common.network.cookie.DBCookieStore.newBuilder(r2)
            xyz.adscope.common.network.cookie.DBCookieStore r1 = r1.build()
            xyz.adscope.common.network.KalleConfig$Builder r0 = r0.cookieStore(r1)
            java.lang.String r1 = "filePath"
            xyz.adscope.common.network.simple.cache.DiskCacheStore$Builder r1 = xyz.adscope.common.network.simple.cache.DiskCacheStore.newBuilder(r1)
            xyz.adscope.common.network.simple.cache.DiskCacheStore r1 = r1.build()
            xyz.adscope.common.network.KalleConfig$Builder r0 = r0.cacheStore(r1)
            xyz.adscope.common.network.JsonConverter r1 = new xyz.adscope.common.network.JsonConverter
            r1.<init>(r2)
            xyz.adscope.common.network.KalleConfig$Builder r2 = r0.converter(r1)
            xyz.adscope.common.network.KalleConfig r2 = r2.build()
            xyz.adscope.common.network.Kalle.setConfig(r2)
            xyz.adscope.common.network.KalleConfig$Builder r2 = xyz.adscope.common.network.KalleConfig.newBuilder()
            xyz.adscope.common.network.KalleConfig r2 = r2.build()
            xyz.adscope.common.network.Kalle.setConfig(r2)
            return
    }
}
