package xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class InteractionModel extends xyz.adscope.ad.model.impl.resp.ASNPJsonResponseModel {

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "bindEvent")
    private java.lang.String a;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "execution")
    private java.lang.String b;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "countDownTime")
    private int c;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "passivationTime")
    private long d;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "passivationType")
    private int e;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "protectTime")
    private long f;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "coolTime")
    private long g;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "feedbackAnimation")
    private int h;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "autoClose")
    private int i;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "shake")
    private xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.ShakeModel j;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "eulerAngle")
    private xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.EulerAngleModel k;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "slide")
    private xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.SlideModel l;

    public InteractionModel(org.json.JSONObject r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public java.lang.String a() {
            r2 = this;
            java.lang.String r0 = r2.a
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L15
            java.lang.String r0 = r2.a
            java.lang.String r1 = "none"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L15
            java.lang.String r0 = r2.a
            return r0
        L15:
            java.lang.String r0 = ""
            return r0
    }

    public long b() {
            r2 = this;
            long r0 = r2.g
            return r0
    }

    public int c() {
            r1 = this;
            int r0 = r1.c
            return r0
    }

    public xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.EulerAngleModel d() {
            r1 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.EulerAngleModel r0 = r1.k
            return r0
    }

    public java.lang.String e() {
            r1 = this;
            java.lang.String r0 = r1.b
            return r0
    }

    public int f() {
            r1 = this;
            int r0 = r1.h
            return r0
    }

    public long g() {
            r2 = this;
            long r0 = r2.d
            return r0
    }

    public int h() {
            r1 = this;
            int r0 = r1.e
            return r0
    }

    public long i() {
            r2 = this;
            long r0 = r2.f
            return r0
    }

    public xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.ShakeModel j() {
            r1 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.ShakeModel r0 = r1.j
            return r0
    }

    public xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.SlideModel k() {
            r1 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.SlideModel r0 = r1.l
            return r0
    }

    public boolean l() {
            r2 = this;
            int r0 = r2.i
            r1 = 1
            if (r0 != r1) goto L6
            return r1
        L6:
            r0 = 0
            return r0
    }
}
