package xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class SlideModel extends xyz.adscope.ad.model.impl.resp.ASNPJsonResponseModel {
    private final java.lang.String a;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "distance")
    private xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.par.StatusParamModel b;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "direction")
    private xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.par.StatusParamModel c;

    public SlideModel(org.json.JSONObject r1) {
            r0 = this;
            r0.<init>(r1)
            java.lang.String r1 = "Cooling"
            r0.a = r1
            return
    }

    public java.lang.String a(java.lang.String r2) {
            r1 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.par.StatusParamModel r0 = r1.c
            if (r0 == 0) goto L1a
            java.lang.String r0 = "Cooling"
            boolean r2 = r0.equalsIgnoreCase(r2)
            if (r2 == 0) goto L13
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.par.StatusParamModel r2 = r1.c
            java.lang.String r2 = r2.a()
            return r2
        L13:
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.par.StatusParamModel r2 = r1.c
            java.lang.String r2 = r2.b()
            return r2
        L1a:
            java.lang.String r2 = "UP"
            return r2
    }

    public int b(java.lang.String r2) {
            r1 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.par.StatusParamModel r0 = r1.b
            if (r0 == 0) goto L22
            java.lang.String r0 = "Cooling"
            boolean r2 = r0.equalsIgnoreCase(r2)
            if (r2 == 0) goto L17
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.par.StatusParamModel r2 = r1.b
            java.lang.String r2 = r2.a()
            int r2 = xyz.adscope.common.v2.tool.str.StringUtil.parseInt(r2)
            return r2
        L17:
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.par.StatusParamModel r2 = r1.b
            java.lang.String r2 = r2.b()
            int r2 = xyz.adscope.common.v2.tool.str.StringUtil.parseInt(r2)
            return r2
        L22:
            r2 = 0
            return r2
    }
}
