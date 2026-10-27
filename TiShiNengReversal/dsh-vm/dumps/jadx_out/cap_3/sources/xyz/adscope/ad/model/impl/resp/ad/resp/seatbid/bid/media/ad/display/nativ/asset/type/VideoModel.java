package xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.type;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class VideoModel extends xyz.adscope.ad.model.impl.resp.ASNPJsonResponseModel {

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "adm")
    private java.lang.String a;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "curl")
    private java.lang.String b;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "url")
    private java.lang.String c;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "w")
    private java.lang.String d;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "h")
    private java.lang.String e;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "videoDuration")
    private int f;

    public VideoModel(org.json.JSONObject r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public java.lang.String b() {
            r1 = this;
            java.lang.String r0 = r1.b
            return r0
    }

    public int c() {
            r1 = this;
            int r0 = r1.f
            return r0
    }

    public java.lang.String d() {
            r1 = this;
            java.lang.String r0 = r1.c
            return r0
    }

    public java.lang.String e() {
            r1 = this;
            java.lang.String r0 = r1.e
            return r0
    }

    public java.lang.String f() {
            r1 = this;
            java.lang.String r0 = r1.d
            return r0
    }
}
