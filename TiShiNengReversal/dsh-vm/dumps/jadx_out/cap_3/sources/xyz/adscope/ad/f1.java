package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class f1 extends android.widget.FrameLayout {
    protected final xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.optimize.OptimizeModel a;
    private xyz.adscope.ad.i3 b;
    protected android.view.View c;

    public f1(@androidx.annotation.NonNull android.content.Context r1, xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.optimize.OptimizeModel r2) {
            r0 = this;
            r0.<init>(r1)
            r0.a = r2
            return
    }

    public void a() {
            r2 = this;
            xyz.adscope.ad.i3 r0 = r2.b
            if (r0 == 0) goto L7
            r0.a()
        L7:
            android.view.View r0 = r2.c
            if (r0 == 0) goto L1e
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L1e
            android.view.View r1 = r2.c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.addView(r2, r1)
        L1e:
            return
    }

    public void a(android.view.View r3) {
            r2 = this;
            r2.c = r3
            boolean r0 = r3 instanceof xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a
            java.lang.String r1 = "scope_root_container"
            if (r0 == 0) goto L14
            android.content.Context r0 = r2.getContext()
            int r0 = xyz.adscope.common.v2.dev.info.ResIdentify.getIDIdentify(r0, r1)
            r2.setTag(r0, r3)
            return
        L14:
            boolean r0 = r3 instanceof xyz.adscope.ad.b4
            if (r0 == 0) goto L2b
            xyz.adscope.ad.b4 r3 = (xyz.adscope.ad.b4) r3
            xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a r3 = r3.getExpressRoot()
            if (r3 == 0) goto L2b
            android.content.Context r0 = r2.getContext()
            int r0 = xyz.adscope.common.v2.dev.info.ResIdentify.getIDIdentify(r0, r1)
            r2.setTag(r0, r3)
        L2b:
            return
    }

    public void a(xyz.adscope.ad.i3 r2) {
            r1 = this;
            r1.b = r2
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.optimize.OptimizeModel r0 = r1.a
            r2.a(r0)
            return
    }

    public void b() {
            r1 = this;
            xyz.adscope.ad.i3 r0 = r1.b
            if (r0 == 0) goto L7
            r0.b()
        L7:
            return
    }

    public void c() {
            r1 = this;
            xyz.adscope.ad.i3 r0 = r1.b
            if (r0 == 0) goto L7
            r0.a()
        L7:
            return
    }

    public void d() {
            r2 = this;
            android.view.ViewParent r0 = r2.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto Ld
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.removeView(r2)
        Ld:
            xyz.adscope.ad.i3 r0 = r2.b
            boolean r1 = r0 instanceof xyz.adscope.ad.x4
            if (r1 == 0) goto L18
            xyz.adscope.ad.x4 r0 = (xyz.adscope.ad.x4) r0
            r0.e()
        L18:
            return
    }
}
