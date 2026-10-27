package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class i6 extends android.widget.TextView implements xyz.adscope.ad.b4 {
    private final java.lang.String a;
    private final java.lang.String b;
    private java.lang.String c;
    protected xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel d;
    protected xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.AssetModel e;
    private xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a f;

    public i6(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            java.lang.String r1 = "left"
            r0.a = r1
            java.lang.String r1 = "right"
            r0.b = r1
            return
    }

    @Override // xyz.adscope.ad.b4
    public void a() {
            r0 = this;
            return
    }

    @Override // xyz.adscope.ad.b4
    public void a(xyz.adscope.ad.b4.a r8) {
            r7 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r0 = r7.d
            if (r0 == 0) goto L46
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.ViewModel r0 = r0.f()
            if (r0 == 0) goto L46
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r0 = r7.d
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.ViewModel r0 = r0.f()
            android.content.Context r1 = r7.getContext()
            java.lang.String r3 = r0.c()
            java.lang.String r2 = r0.f()
            int r4 = xyz.adscope.common.v2.tool.str.StringUtil.parseInt(r2)
            java.lang.String r5 = r0.d()
            java.lang.String r2 = r0.e()
            android.view.ViewGroup$LayoutParams r6 = r7.getLayoutParams()
            int r6 = r6.height
            int r6 = xyz.adscope.ad.q6.a(r2, r6)
            r2 = r7
            xyz.adscope.ad.q6.a(r1, r2, r3, r4, r5, r6)
            r7.setTextConfig(r0)
            r7.d()
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r0 = r2.d
            java.lang.String r0 = r0.a()
            r8.b(r0)
            return
        L46:
            r2 = r7
            return
    }

    @Override // xyz.adscope.ad.b4
    public void a(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.AssetModel r1) {
            r0 = this;
            r0.e = r1
            return
    }

    @Override // xyz.adscope.ad.b4
    public void a(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r1) {
            r0 = this;
            r0.d = r1
            return
    }

    public void b() {
            r0 = this;
            return
    }

    public void c() {
            r0 = this;
            return
    }

    protected void d() {
            r2 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.AssetModel r0 = r2.e
            if (r0 == 0) goto L15
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.type.TitleModel r0 = r0.c()
            if (r0 == 0) goto L15
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.AssetModel r0 = r2.e
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.type.TitleModel r0 = r0.c()
            java.lang.String r0 = r0.a()
            goto L29
        L15:
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r0 = r2.d
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.ViewModel r0 = r0.f()
            if (r0 == 0) goto L28
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r0 = r2.d
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.ViewModel r0 = r0.f()
            java.lang.String r0 = r0.p()
            goto L29
        L28:
            r0 = 0
        L29:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L32
            r2.setText(r0)
        L32:
            return
    }

    @Override // xyz.adscope.ad.b4
    public xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a getExpressRoot() {
            r1 = this;
            xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a r0 = r1.f
            return r0
    }

    @Override // xyz.adscope.ad.b4
    public int getLayer() {
            r1 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r0 = r1.d
            int r0 = r0.c()
            return r0
    }

    @Override // xyz.adscope.ad.b4
    public java.lang.String getScopeViewID() {
            r1 = this;
            java.lang.String r0 = r1.c
            return r0
    }

    @Override // xyz.adscope.ad.b4
    public void setExpressRoot(xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a r1) {
            r0 = this;
            r0.f = r1
            return
    }

    @Override // xyz.adscope.ad.b4
    public void setScopeViewID(java.lang.String r1) {
            r0 = this;
            r0.c = r1
            int r1 = xyz.adscope.common.v2.tool.str.StringUtil.parseInt(r1)
            r0.setId(r1)
            return
    }

    public void setTextConfig(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.ViewModel r3) {
            r2 = this;
            int r0 = r3.m()
            if (r0 <= 0) goto L9
            r2.setLines(r0)
        L9:
            int r0 = r3.i()
            float r0 = (float) r0
            r1 = 2
            r2.setTextSize(r1, r0)
            java.lang.String r0 = r3.o()
            boolean r0 = xyz.adscope.common.v2.tool.str.StringUtil.isValidColor(r0)
            if (r0 == 0) goto L27
            java.lang.String r0 = r3.o()
            int r0 = android.graphics.Color.parseColor(r0)
            r2.setTextColor(r0)
        L27:
            java.lang.String r3 = r3.n()
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L55
            r3.getClass()
            java.lang.String r0 = "left"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L50
            java.lang.String r0 = "right"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L4a
            r3 = 17
            r2.setGravity(r3)
            return
        L4a:
            r3 = 21
            r2.setGravity(r3)
            return
        L50:
            r3 = 19
            r2.setGravity(r3)
        L55:
            return
    }
}
