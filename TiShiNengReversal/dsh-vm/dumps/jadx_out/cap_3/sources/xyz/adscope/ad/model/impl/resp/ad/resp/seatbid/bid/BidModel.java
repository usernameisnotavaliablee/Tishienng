package xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class BidModel extends xyz.adscope.ad.model.impl.resp.ASNPJsonResponseModel {

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "price")
    private double a;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "burl")
    private java.lang.String b;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "lurl")
    private java.lang.String c;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "exp")
    private long d;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "media")
    private xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.MediaModel e;
    private java.lang.String f;
    private java.lang.String g;

    public BidModel(org.json.JSONObject r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.f
            return r0
    }

    public void a(java.lang.String r1) {
            r0 = this;
            r0.f = r1
            return
    }

    public long b() {
            r2 = this;
            long r0 = r2.d
            return r0
    }

    public void b(java.lang.String r1) {
            r0 = this;
            r0.g = r1
            return
    }

    public java.lang.String c() {
            r1 = this;
            java.lang.String r0 = r1.c
            return r0
    }

    public xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.MediaModel d() {
            r1 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.MediaModel r0 = r1.e
            return r0
    }

    public double e() {
            r2 = this;
            double r0 = r2.a
            return r0
    }

    public java.lang.String f() {
            r1 = this;
            java.lang.String r0 = r1.b
            return r0
    }
}
