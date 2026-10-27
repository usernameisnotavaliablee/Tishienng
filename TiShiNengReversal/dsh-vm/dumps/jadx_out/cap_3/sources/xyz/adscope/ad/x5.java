package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class x5 extends xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.b implements xyz.adscope.ad.b4 {
    private java.lang.String g;
    protected xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel h;
    protected xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.AssetModel i;
    private xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a j;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements xyz.adscope.common.v2.image.loader.IImageFillResult {
        final /* synthetic */ xyz.adscope.ad.b4.a a;
        final /* synthetic */ xyz.adscope.ad.x5 b;

        a(xyz.adscope.ad.x5 r1, xyz.adscope.ad.b4.a r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // xyz.adscope.common.v2.image.loader.IImageFillResult
        public void onImageLoadFailed() {
                r2 = this;
                xyz.adscope.ad.b4$a r0 = r2.a
                if (r0 == 0) goto Lf
                xyz.adscope.ad.x5 r1 = r2.b
                xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r1 = r1.h
                java.lang.String r1 = r1.a()
                r0.a(r1)
            Lf:
                return
        }

        @Override // xyz.adscope.common.v2.image.loader.IImageFillResult
        public void onImageLoaded() {
                r2 = this;
                xyz.adscope.ad.b4$a r0 = r2.a
                if (r0 == 0) goto Lf
                xyz.adscope.ad.x5 r1 = r2.b
                xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r1 = r1.h
                java.lang.String r1 = r1.a()
                r0.b(r1)
            Lf:
                return
        }
    }

    public x5(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // xyz.adscope.ad.b4
    public void a() {
            r0 = this;
            return
    }

    public void a(xyz.adscope.ad.b4.a r5) {
            r4 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r0 = r4.h
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.ViewModel r0 = r0.f()
            if (r0 == 0) goto L5a
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.AssetModel r1 = r4.i
            if (r1 == 0) goto L1d
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.type.ImageModel r1 = r1.b()
            if (r1 == 0) goto L1d
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.AssetModel r1 = r4.i
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.type.ImageModel r1 = r1.b()
            java.lang.String r1 = r1.c()
            goto L21
        L1d:
            java.lang.String r1 = r0.j()
        L21:
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L38
            boolean r0 = r0.r()
            xyz.adscope.common.v2.image.loader.ImageLoader r2 = xyz.adscope.common.v2.image.loader.ImageLoader.getInstance()
            xyz.adscope.ad.x5$a r3 = new xyz.adscope.ad.x5$a
            r3.<init>(r4, r5)
            r2.loadMainImage(r4, r1, r0, r3)
            return
        L38:
            java.lang.String r0 = r0.b()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L4e
            if (r5 == 0) goto L65
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r0 = r4.h
            java.lang.String r0 = r0.a()
            r5.a(r0)
            return
        L4e:
            if (r5 == 0) goto L65
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r0 = r4.h
            java.lang.String r0 = r0.a()
            r5.b(r0)
            return
        L5a:
            if (r5 == 0) goto L65
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r0 = r4.h
            java.lang.String r0 = r0.a()
            r5.a(r0)
        L65:
            return
    }

    @Override // xyz.adscope.ad.b4
    public void a(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.AssetModel r1) {
            r0 = this;
            r0.i = r1
            return
    }

    @Override // xyz.adscope.ad.b4
    public void a(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r2) {
            r1 = this;
            r1.h = r2
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.ViewModel r2 = r2.f()
            if (r2 == 0) goto L25
            java.lang.String r0 = r2.d()
            r1.setBorderColor(r0)
            java.lang.String r0 = r2.e()
            float r0 = xyz.adscope.common.v2.tool.str.StringUtil.parseFloat(r0)
            r1.setRectRadius(r0)
            java.lang.String r2 = r2.f()
            int r2 = xyz.adscope.common.v2.tool.str.StringUtil.parseInt(r2)
            r1.setBorderWidth(r2)
        L25:
            return
    }

    @Override // xyz.adscope.ad.b4
    public void b() {
            r0 = this;
            return
    }

    @Override // xyz.adscope.ad.b4
    public void c() {
            r0 = this;
            return
    }

    @Override // xyz.adscope.ad.b4
    public xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a getExpressRoot() {
            r1 = this;
            xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a r0 = r1.j
            return r0
    }

    @Override // xyz.adscope.ad.b4
    public int getLayer() {
            r1 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r0 = r1.h
            int r0 = r0.c()
            return r0
    }

    @Override // xyz.adscope.ad.b4
    public java.lang.String getScopeViewID() {
            r1 = this;
            java.lang.String r0 = r1.g
            return r0
    }

    @Override // xyz.adscope.ad.b4
    public void setExpressRoot(xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a r1) {
            r0 = this;
            r0.j = r1
            return
    }

    @Override // xyz.adscope.ad.b4
    public void setScopeViewID(java.lang.String r1) {
            r0 = this;
            r0.g = r1
            int r1 = xyz.adscope.common.v2.tool.str.StringUtil.parseInt(r1)
            r0.setId(r1)
            return
    }
}
