package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class n6 extends android.widget.RelativeLayout implements xyz.adscope.ad.b4 {
    private java.lang.String a;
    protected xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel b;
    protected xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.AssetModel c;
    private xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a d;

    public n6(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private void d() {
            r3 = this;
            int r0 = r3.getChildCount()
            if (r0 <= 0) goto L1d
            r0 = 0
        L7:
            int r1 = r3.getChildCount()
            if (r0 >= r1) goto L1d
            android.view.View r1 = r3.getChildAt(r0)
            boolean r2 = r1 instanceof xyz.adscope.ad.b4
            if (r2 == 0) goto L1a
            xyz.adscope.ad.b4 r1 = (xyz.adscope.ad.b4) r1
            r1.b()
        L1a:
            int r0 = r0 + 1
            goto L7
        L1d:
            return
    }

    private void e() {
            r3 = this;
            int r0 = r3.getChildCount()
            if (r0 <= 0) goto L1d
            r0 = 0
        L7:
            int r1 = r3.getChildCount()
            if (r0 >= r1) goto L1d
            android.view.View r1 = r3.getChildAt(r0)
            boolean r2 = r1 instanceof xyz.adscope.ad.b4
            if (r2 == 0) goto L1a
            xyz.adscope.ad.b4 r1 = (xyz.adscope.ad.b4) r1
            r1.c()
        L1a:
            int r0 = r0 + 1
            goto L7
        L1d:
            return
    }

    public void a() {
            r3 = this;
            int r0 = r3.getChildCount()
            if (r0 <= 0) goto L1d
            r0 = 0
        L7:
            int r1 = r3.getChildCount()
            if (r0 >= r1) goto L1d
            android.view.View r1 = r3.getChildAt(r0)
            boolean r2 = r1 instanceof xyz.adscope.ad.b4
            if (r2 == 0) goto L1a
            xyz.adscope.ad.b4 r1 = (xyz.adscope.ad.b4) r1
            r1.a()
        L1a:
            int r0 = r0 + 1
            goto L7
        L1d:
            return
    }

    public void a(xyz.adscope.ad.b4.a r10) {
            r9 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r0 = r9.b
            if (r0 == 0) goto L44
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.ViewModel r0 = r0.f()
            if (r0 == 0) goto L39
            xyz.adscope.ad.b7 r1 = xyz.adscope.ad.b7.a()
            java.lang.String r2 = r0.c()
            java.lang.String r5 = r1.a(r2)
            android.content.Context r3 = r9.getContext()
            java.lang.String r1 = r0.f()
            int r6 = xyz.adscope.common.v2.tool.str.StringUtil.parseInt(r1)
            java.lang.String r7 = r0.d()
            java.lang.String r0 = r0.e()
            android.view.ViewGroup$LayoutParams r1 = r9.getLayoutParams()
            int r1 = r1.height
            int r8 = xyz.adscope.ad.q6.a(r0, r1)
            r4 = r9
            xyz.adscope.ad.q6.a(r3, r4, r5, r6, r7, r8)
            goto L3a
        L39:
            r4 = r9
        L3a:
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r0 = r4.b
            java.lang.String r0 = r0.a()
            r10.b(r0)
            return
        L44:
            r4 = r9
            return
    }

    @Override // xyz.adscope.ad.b4
    public void a(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.AssetModel r1) {
            r0 = this;
            r0.c = r1
            return
    }

    public void a(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r1) {
            r0 = this;
            r0.b = r1
            return
    }

    public void b() {
            r0 = this;
            r0.d()
            return
    }

    public void c() {
            r0 = this;
            r0.e()
            return
    }

    @Override // xyz.adscope.ad.b4
    public xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a getExpressRoot() {
            r1 = this;
            xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a r0 = r1.d
            return r0
    }

    @Override // xyz.adscope.ad.b4
    public int getLayer() {
            r1 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r0 = r1.b
            int r0 = r0.c()
            return r0
    }

    @Override // xyz.adscope.ad.b4
    public java.lang.String getScopeViewID() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public void setExpressRoot(xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a r1) {
            r0 = this;
            r0.d = r1
            return
    }

    @Override // xyz.adscope.ad.b4
    public void setScopeViewID(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            int r1 = xyz.adscope.common.v2.tool.str.StringUtil.parseInt(r1)
            r0.setId(r1)
            return
    }
}
