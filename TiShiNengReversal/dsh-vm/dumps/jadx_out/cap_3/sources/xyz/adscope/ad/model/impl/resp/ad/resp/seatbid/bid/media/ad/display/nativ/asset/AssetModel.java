package xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AssetModel extends xyz.adscope.ad.model.impl.resp.ASNPJsonResponseModel {

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "id")
    private java.lang.String a;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "image")
    private xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.type.ImageModel b;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "video")
    private xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.type.VideoModel c;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "title")
    private xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.type.TitleModel d;

    public AssetModel(org.json.JSONObject r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.type.ImageModel b() {
            r1 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.type.ImageModel r0 = r1.b
            return r0
    }

    public xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.type.TitleModel c() {
            r1 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.type.TitleModel r0 = r1.d
            return r0
    }

    public xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.type.VideoModel d() {
            r1 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.type.VideoModel r0 = r1.c
            return r0
    }
}
