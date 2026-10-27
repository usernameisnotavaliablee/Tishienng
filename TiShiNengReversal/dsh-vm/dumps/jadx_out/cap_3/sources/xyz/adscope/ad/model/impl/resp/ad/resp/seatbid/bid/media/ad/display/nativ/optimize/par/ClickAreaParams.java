package xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.optimize.par;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class ClickAreaParams extends xyz.adscope.ad.model.impl.resp.ASNPJsonResponseModel {

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "randomNum")
    private int a;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "reference")
    private int b;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "width")
    private java.lang.String c;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "height")
    private java.lang.String d;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "horizontalSpace")
    private java.lang.String e;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "verticalSpace")
    private java.lang.String f;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "needTime")
    private int g;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "durationTime")
    private int h;

    public ClickAreaParams(org.json.JSONObject r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public int a() {
            r1 = this;
            int r0 = r1.h
            return r0
    }

    public java.lang.String b() {
            r1 = this;
            java.lang.String r0 = r1.d
            return r0
    }

    public java.lang.String c() {
            r1 = this;
            java.lang.String r0 = r1.e
            return r0
    }

    public int d() {
            r1 = this;
            int r0 = r1.g
            return r0
    }

    public int e() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    public int f() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    public java.lang.String g() {
            r1 = this;
            java.lang.String r0 = r1.f
            return r0
    }

    public java.lang.String h() {
            r1 = this;
            java.lang.String r0 = r1.c
            return r0
    }
}
