package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class z5 extends xyz.adscope.ad.ad.nativead.render.view.asnp.interaction.c {
    public z5(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // xyz.adscope.ad.i6
    protected void d() {
            r1 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r0 = r1.d
            if (r0 == 0) goto L17
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.ViewModel r0 = r0.f()
            if (r0 == 0) goto L17
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r0 = r1.d
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.ViewModel r0 = r0.f()
            java.lang.String r0 = r0.g()
            r1.setText(r0)
        L17:
            return
    }
}
