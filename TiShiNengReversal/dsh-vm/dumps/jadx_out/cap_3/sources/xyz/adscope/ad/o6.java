package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class o6 extends xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.BasicWebView implements xyz.adscope.ad.b4 {
    private java.lang.String a;
    protected xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel b;
    protected xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.AssetModel c;
    private xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a d;

    public o6(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // xyz.adscope.ad.b4
    public void a() {
            r0 = this;
            return
    }

    @Override // xyz.adscope.ad.b4
    public void a(xyz.adscope.ad.b4.a r1) {
            r0 = this;
            return
    }

    @Override // xyz.adscope.ad.b4
    public void a(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.AssetModel r1) {
            r0 = this;
            r0.c = r1
            return
    }

    @Override // xyz.adscope.ad.b4
    public void a(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r1) {
            r0 = this;
            r0.b = r1
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

    @Override // xyz.adscope.ad.b4
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
