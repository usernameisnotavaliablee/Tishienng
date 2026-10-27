package xyz.adscope.ad.model.impl.resp.ad.resp.seatbid;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class SeatBidModel extends xyz.adscope.ad.model.impl.resp.ASNPJsonResponseModel {

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "bid")
    private java.util.List<xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.BidModel> a;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "ext")
    private xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.ext.SeatExtModel b;

    public SeatBidModel(org.json.JSONObject r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public java.util.List<xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.BidModel> a() {
            r1 = this;
            java.util.List<xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.BidModel> r0 = r1.a
            return r0
    }

    public xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.ext.SeatExtModel b() {
            r1 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.ext.SeatExtModel r0 = r1.b
            return r0
    }
}
