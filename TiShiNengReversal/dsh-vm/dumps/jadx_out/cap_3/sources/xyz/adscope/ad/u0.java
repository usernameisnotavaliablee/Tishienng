package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class u0 extends xyz.adscope.ad.z1 {
    public u0() {
            r0 = this;
            r0.<init>()
            return
    }

    private void a(android.content.Context r3, xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel r4, java.lang.String r5) {
            r2 = this;
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<xyz.adscope.ad.widget.activity.ASNPDlInfoDetailActivity> r1 = xyz.adscope.ad.widget.activity.ASNPDlInfoDetailActivity.class
            r0.<init>(r3, r1)
            java.lang.String r4 = r4.toJsonString()
            java.lang.String r1 = "dlm"
            r0.putExtra(r1, r4)
            java.lang.String r4 = "whichTab"
            r0.putExtra(r4, r5)
            xyz.adscope.ad.n4.c(r3, r0)
            return
    }

    private xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel b() {
            r1 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.NativeModel r0 = r1.d
            if (r0 == 0) goto L11
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel r0 = r0.b()
            if (r0 == 0) goto L11
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.NativeModel r0 = r1.d
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel r0 = r0.b()
            return r0
        L11:
            r0 = 0
            return r0
    }

    @Override // xyz.adscope.ad.w2
    public void a(android.view.View r2, int r3) {
            r1 = this;
            boolean r3 = r2 instanceof xyz.adscope.ad.u5
            if (r3 == 0) goto Lf
            r3 = r2
            xyz.adscope.ad.u5 r3 = (xyz.adscope.ad.u5) r3
            java.lang.String r0 = r3.getWhereDetailActivityTab()
            r3.e()
            goto L10
        Lf:
            r0 = 0
        L10:
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel r3 = r1.b()
            if (r3 == 0) goto L1d
            android.content.Context r2 = r2.getContext()
            r1.a(r2, r3, r0)
        L1d:
            return
    }
}
