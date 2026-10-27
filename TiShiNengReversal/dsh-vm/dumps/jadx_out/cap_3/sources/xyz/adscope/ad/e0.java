package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class e0 {
    public e0() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(android.content.Context r1) {
            xyz.adscope.common.v2.cache.VideoLruCache r0 = xyz.adscope.common.v2.cache.VideoLruCache.getInstance()
            r0.releaseCacheDirMemory(r1)
            xyz.adscope.common.v2.cache.ImageLruCache r0 = xyz.adscope.common.v2.cache.ImageLruCache.getInstance()
            r0.releaseCacheDirMemory(r1)
            return
    }

    public static void a(android.content.Context r4, xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.NativeModel r5) {
            if (r5 == 0) goto L84
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel r0 = r5.b()
            if (r0 == 0) goto L15
            xyz.adscope.common.v2.cache.ImageLruCache r1 = xyz.adscope.common.v2.cache.ImageLruCache.getInstance()
            java.lang.String r0 = r0.e()
            xyz.adscope.common.v2.cache.LruCacheModel r2 = xyz.adscope.common.v2.cache.LruCacheModel.TEMPORARY
            r1.cacheResource(r4, r0, r2)
        L15:
            java.util.List r0 = r5.e()
            if (r0 == 0) goto L45
            java.util.Iterator r0 = r0.iterator()
        L1f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L45
            java.lang.Object r1 = r0.next()
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r1 = (xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel) r1
            if (r1 == 0) goto L1f
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.ViewModel r2 = r1.f()
            if (r2 == 0) goto L1f
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.ViewModel r1 = r1.f()
            xyz.adscope.common.v2.cache.ImageLruCache r2 = xyz.adscope.common.v2.cache.ImageLruCache.getInstance()
            java.lang.String r1 = r1.j()
            xyz.adscope.common.v2.cache.LruCacheModel r3 = xyz.adscope.common.v2.cache.LruCacheModel.PERMANENT
            r2.cacheResource(r4, r1, r3)
            goto L1f
        L45:
            java.util.List r5 = r5.a()
            if (r5 == 0) goto L84
            java.util.Iterator r5 = r5.iterator()
        L4f:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L84
            java.lang.Object r0 = r5.next()
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.AssetModel r0 = (xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.AssetModel) r0
            if (r0 == 0) goto L4f
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.type.ImageModel r1 = r0.b()
            if (r1 == 0) goto L70
            xyz.adscope.common.v2.cache.ImageLruCache r2 = xyz.adscope.common.v2.cache.ImageLruCache.getInstance()
            java.lang.String r1 = r1.c()
            xyz.adscope.common.v2.cache.LruCacheModel r3 = xyz.adscope.common.v2.cache.LruCacheModel.TEMPORARY
            r2.cacheResource(r4, r1, r3)
        L70:
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.type.VideoModel r0 = r0.d()
            if (r0 == 0) goto L4f
            xyz.adscope.common.v2.cache.VideoLruCache r1 = xyz.adscope.common.v2.cache.VideoLruCache.getInstance()
            java.lang.String r0 = r0.d()
            xyz.adscope.common.v2.cache.LruCacheModel r2 = xyz.adscope.common.v2.cache.LruCacheModel.TEMPORARY
            r1.cacheResource(r4, r0, r2)
            goto L4f
        L84:
            return
    }
}
