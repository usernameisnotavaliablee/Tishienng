package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class w0 extends xyz.adscope.ad.f2 {
    public w0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // xyz.adscope.ad.f2, xyz.adscope.ad.w2
    public void a(android.view.View r2, int r3) {
            r1 = this;
            xyz.adscope.ad.x1 r3 = r1.a
            xyz.adscope.ad.y1$a r0 = xyz.adscope.ad.y1.a.c
            r3.a(r0, r2)
            return
    }

    @Override // xyz.adscope.ad.f2
    protected void a(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.link.LinkModel r1, android.view.View r2, int r3) {
            r0 = this;
            if (r1 == 0) goto L14
            java.lang.String r1 = r1.d()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L14
            android.content.Context r2 = r2.getContext()
            r3 = 0
            xyz.adscope.ad.n4.a(r2, r1, r3)
        L14:
            return
    }
}
