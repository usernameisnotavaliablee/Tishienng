package xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class ViewModel extends xyz.adscope.ad.model.impl.resp.ASNPJsonResponseModel {

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "controlType")
    private java.lang.String a;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "borderSize")
    private java.lang.String b;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "borderColor")
    private java.lang.String c;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "borderRadius")
    private java.lang.String d;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "bgColor")
    private java.lang.String e;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "assetId")
    private java.lang.String f;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "fontSize")
    private int g;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "textColor")
    private java.lang.String h;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "textAlign")
    private java.lang.String i;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "lineCount")
    private int j;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "title")
    private java.lang.String k;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "imageUrl")
    private java.lang.String l;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "voiceOn")
    private int m;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "animationType")
    private java.lang.String n;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "isBlur")
    private int o;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "interactiveTitle")
    private xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.status.StatusTitleModel p;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "interactiveSubTitle")
    private xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.status.StatusTitleModel q;
    private java.lang.String r;

    public ViewModel(org.json.JSONObject r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.n
            return r0
    }

    public void a(java.lang.String r1) {
            r0 = this;
            r0.r = r1
            return
    }

    public java.lang.String b() {
            r1 = this;
            java.lang.String r0 = r1.f
            return r0
    }

    public java.lang.String c() {
            r1 = this;
            java.lang.String r0 = r1.e
            return r0
    }

    public java.lang.String d() {
            r1 = this;
            java.lang.String r0 = r1.c
            return r0
    }

    public java.lang.String e() {
            r1 = this;
            java.lang.String r0 = r1.d
            return r0
    }

    public java.lang.String f() {
            r1 = this;
            java.lang.String r0 = r1.b
            return r0
    }

    public java.lang.String g() {
            r1 = this;
            java.lang.String r0 = r1.r
            return r0
    }

    public java.lang.String h() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public int i() {
            r1 = this;
            int r0 = r1.g
            return r0
    }

    public java.lang.String j() {
            r1 = this;
            java.lang.String r0 = r1.l
            return r0
    }

    public xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.status.StatusTitleModel k() {
            r1 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.status.StatusTitleModel r0 = r1.q
            return r0
    }

    public xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.status.StatusTitleModel l() {
            r1 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.status.StatusTitleModel r0 = r1.p
            return r0
    }

    public int m() {
            r1 = this;
            int r0 = r1.j
            if (r0 <= 0) goto L5
            return r0
        L5:
            r0 = 1
            return r0
    }

    public java.lang.String n() {
            r1 = this;
            java.lang.String r0 = r1.i
            return r0
    }

    public java.lang.String o() {
            r1 = this;
            java.lang.String r0 = r1.h
            return r0
    }

    public java.lang.String p() {
            r1 = this;
            java.lang.String r0 = r1.k
            return r0
    }

    public boolean q() {
            r1 = this;
            int r0 = r1.m
            if (r0 > 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public boolean r() {
            r2 = this;
            int r0 = r2.o
            r1 = 1
            if (r0 != r1) goto L6
            return r1
        L6:
            r0 = 0
            return r0
    }
}
