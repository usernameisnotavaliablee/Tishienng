package xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class MediaModel extends xyz.adscope.ad.model.impl.resp.ASNPJsonResponseModel {

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "ad")
    private xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.AdModel a;

    public MediaModel(org.json.JSONObject r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.AdModel a() {
            r1 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.AdModel r0 = r1.a
            return r0
    }
}
