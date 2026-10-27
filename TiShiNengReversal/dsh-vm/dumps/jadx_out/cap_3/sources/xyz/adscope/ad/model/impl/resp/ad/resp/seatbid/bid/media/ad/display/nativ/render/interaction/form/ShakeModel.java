package xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class ShakeModel extends xyz.adscope.ad.model.impl.resp.ASNPJsonResponseModel {

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "startAmplitude")
    private xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.par.StatusParamModel a;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "endAmplitude")
    private xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.par.StatusParamModel b;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "count")
    private xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.par.StatusParamModel c;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "axial")
    private xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.par.StatusParamModel d;

    public ShakeModel(org.json.JSONObject r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.par.StatusParamModel a() {
            r1 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.par.StatusParamModel r0 = r1.d
            return r0
    }

    public xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.par.StatusParamModel b() {
            r1 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.par.StatusParamModel r0 = r1.c
            return r0
    }

    public xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.par.StatusParamModel c() {
            r1 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.par.StatusParamModel r0 = r1.b
            return r0
    }

    public xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.par.StatusParamModel d() {
            r1 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.par.StatusParamModel r0 = r1.a
            return r0
    }
}
