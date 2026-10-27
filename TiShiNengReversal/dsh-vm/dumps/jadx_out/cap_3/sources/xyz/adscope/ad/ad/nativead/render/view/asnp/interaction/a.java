package xyz.adscope.ad.ad.nativead.render.view.asnp.interaction;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class a extends xyz.adscope.ad.ad.nativead.render.view.asnp.interaction.b {
    public a(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private void h() {
            r3 = this;
            java.lang.String r0 = ""
            r3.setText(r0)
            android.content.res.Resources r0 = r3.getResources()
            int r1 = xyz.adscope.amps.R.drawable.asnp_interaction_icon_close
            r2 = 0
            android.graphics.drawable.Drawable r0 = androidx.core.content.res.ResourcesCompat.getDrawable(r0, r1, r2)
            r3.setBackground(r0)
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            int r1 = r0.width
            int r2 = r0.height
            int r1 = java.lang.Math.min(r1, r2)
            r0.width = r1
            r0.height = r1
            r3.setLayoutParams(r0)
            return
    }

    @Override // xyz.adscope.ad.ad.nativead.render.view.asnp.interaction.b
    protected void f() {
            r1 = this;
            r1.h()
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r0 = r1.d
            if (r0 == 0) goto L1c
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.InteractionModel r0 = r0.b()
            if (r0 == 0) goto L1c
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r0 = r1.d
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.InteractionModel r0 = r0.b()
            boolean r0 = r0.l()
            if (r0 == 0) goto L1c
            super.f()
        L1c:
            return
    }

    @Override // xyz.adscope.ad.ad.nativead.render.view.asnp.interaction.b
    protected void g() {
            r0 = this;
            r0.h()
            return
    }

    @Override // xyz.adscope.ad.ad.nativead.render.view.asnp.interaction.b
    protected int getCountDownTime() {
            r2 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.AssetModel r0 = r2.e
            if (r0 == 0) goto L15
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.type.VideoModel r0 = r0.d()
            if (r0 == 0) goto L15
            int r1 = r0.c()
            if (r1 <= 0) goto L15
            int r0 = r0.c()
            return r0
        L15:
            int r0 = super.getCountDownTime()
            return r0
    }

    @Override // xyz.adscope.ad.ad.nativead.render.view.asnp.interaction.b
    protected int getDefaultCountDownTime() {
            r1 = this;
            r0 = 0
            return r0
    }
}
