package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class e6 extends xyz.adscope.ad.ad.nativead.render.view.asnp.interaction.c implements xyz.adscope.ad.c4 {
    private boolean h;

    public e6(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // xyz.adscope.ad.c4
    public void a(java.lang.String r1) {
            r0 = this;
            return
    }

    @Override // xyz.adscope.ad.i6
    protected void d() {
            r3 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r0 = r3.d
            if (r0 == 0) goto L3b
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.ViewModel r0 = r0.f()
            if (r0 == 0) goto L3b
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r0 = r3.d
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.ViewModel r0 = r0.f()
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.status.StatusTitleModel r0 = r0.l()
            if (r0 == 0) goto L3a
            boolean r1 = r3.h
            java.lang.String r2 = ""
            if (r1 == 0) goto L27
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.par.StatusParamModel r0 = r0.a()
            if (r0 == 0) goto L31
            java.lang.String r2 = r0.b()
            goto L31
        L27:
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.par.StatusParamModel r0 = r0.b()
            if (r0 == 0) goto L31
            java.lang.String r2 = r0.b()
        L31:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L3a
            r3.setText(r2)
        L3a:
            return
        L3b:
            super.d()
            return
    }

    @Override // xyz.adscope.ad.c4
    public void setRenderWithDownload(boolean r1) {
            r0 = this;
            r0.h = r1
            return
    }
}
