package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class c6 extends xyz.adscope.ad.a6 {
    private android.widget.ImageView f;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements xyz.adscope.common.v2.image.loader.IImageFillResult {
        final /* synthetic */ xyz.adscope.ad.c6 a;

        a(xyz.adscope.ad.c6 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // xyz.adscope.common.v2.image.loader.IImageFillResult
        public void onImageLoadFailed() {
                r2 = this;
                xyz.adscope.ad.c6 r0 = r2.a
                android.widget.ImageView r0 = xyz.adscope.ad.c6.a(r0)
                int r1 = xyz.adscope.amps.R.drawable.asnp_ad_logo
                r0.setImageResource(r1)
                return
        }

        @Override // xyz.adscope.common.v2.image.loader.IImageFillResult
        public void onImageLoaded() {
                r0 = this;
                return
        }
    }

    public c6(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    static /* synthetic */ android.widget.ImageView a(xyz.adscope.ad.c6 r0) {
            android.widget.ImageView r0 = r0.f
            return r0
    }

    private void a(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.ViewModel r7) {
            r6 = this;
            if (r7 == 0) goto L4d
            android.widget.ImageView r0 = new android.widget.ImageView
            android.content.Context r1 = r6.getContext()
            r0.<init>(r1)
            r6.f = r0
            r1 = 1843(0x733, float:2.583E-42)
            r0.setId(r1)
            android.widget.RelativeLayout$LayoutParams r0 = new android.widget.RelativeLayout$LayoutParams
            r2 = -2
            r3 = -1
            r0.<init>(r2, r3)
            r4 = 9
            r0.addRule(r4)
            android.widget.ImageView r4 = r6.f
            r6.addView(r4, r0)
            java.lang.String r0 = r7.p()
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L48
            xyz.adscope.ad.i6 r4 = new xyz.adscope.ad.i6
            android.content.Context r5 = r6.getContext()
            r4.<init>(r5)
            r4.setTextConfig(r7)
            r4.setText(r0)
            android.widget.RelativeLayout$LayoutParams r7 = new android.widget.RelativeLayout$LayoutParams
            r7.<init>(r2, r3)
            r0 = 1
            r7.addRule(r0, r1)
            r6.addView(r4, r7)
        L48:
            r7 = 3
            r0 = 0
            r6.setPadding(r7, r0, r7, r0)
        L4d:
            return
    }

    private void b(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.ViewModel r5) {
            r4 = this;
            java.lang.String r5 = r5.j()
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L1a
            xyz.adscope.common.v2.image.loader.ImageLoader r0 = xyz.adscope.common.v2.image.loader.ImageLoader.getInstance()
            android.widget.ImageView r1 = r4.f
            xyz.adscope.ad.c6$a r2 = new xyz.adscope.ad.c6$a
            r2.<init>(r4)
            r3 = 0
            r0.loadPermanentImage(r1, r5, r3, r2)
            return
        L1a:
            android.widget.ImageView r5 = r4.f
            int r0 = xyz.adscope.amps.R.drawable.asnp_ad_logo
            r5.setImageResource(r0)
            return
    }

    @Override // xyz.adscope.ad.n6, xyz.adscope.ad.b4
    public void a(xyz.adscope.ad.b4.a r2) {
            r1 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r0 = r1.b
            if (r0 == 0) goto L1c
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.ViewModel r0 = r0.f()
            if (r0 == 0) goto L1c
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r0 = r1.b
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.ViewModel r0 = r0.f()
            r1.a(r0)
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r0 = r1.b
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.ViewModel r0 = r0.f()
            r1.b(r0)
        L1c:
            super.a(r2)
            return
    }

    @Override // xyz.adscope.ad.n6, xyz.adscope.ad.b4
    public void a(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r1) {
            r0 = this;
            super.a(r1)
            return
    }
}
