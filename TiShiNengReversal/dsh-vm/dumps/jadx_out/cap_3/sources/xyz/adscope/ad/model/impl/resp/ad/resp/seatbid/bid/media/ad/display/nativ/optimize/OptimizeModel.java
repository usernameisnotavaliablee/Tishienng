package xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.optimize;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class OptimizeModel extends xyz.adscope.ad.model.impl.resp.ASNPJsonResponseModel {

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "touchDownNum")
    private int a;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "slideNum")
    private int b;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "closeClickNum")
    private int c;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "adSlide")
    private xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.optimize.par.SlideParams d;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "clickArea")
    private xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.optimize.par.ClickAreaParams e;

    public OptimizeModel(org.json.JSONObject r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.optimize.par.ClickAreaParams a() {
            r1 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.optimize.par.ClickAreaParams r0 = r1.e
            return r0
    }

    public int b() {
            r1 = this;
            int r0 = r1.c
            return r0
    }

    public int c() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    public xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.optimize.par.SlideParams d() {
            r1 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.optimize.par.SlideParams r0 = r1.d
            return r0
    }

    public int e() {
            r1 = this;
            int r0 = r1.a
            return r0
    }
}
