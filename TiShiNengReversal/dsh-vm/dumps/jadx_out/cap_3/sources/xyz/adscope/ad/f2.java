package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public abstract class f2 extends xyz.adscope.ad.z1 {
    public f2() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // xyz.adscope.ad.w2
    public void a(android.view.View r3, int r4) {
            r2 = this;
            xyz.adscope.ad.x1 r0 = r2.a
            xyz.adscope.ad.y1$a r1 = xyz.adscope.ad.y1.a.c
            r0.a(r1, r3)
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.NativeModel r0 = r2.d
            if (r0 == 0) goto L10
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.link.LinkModel r0 = r0.c()
            goto L11
        L10:
            r0 = 0
        L11:
            r2.a(r0, r3, r4)
            return
    }

    protected abstract void a(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.link.LinkModel r1, android.view.View r2, int r3);
}
