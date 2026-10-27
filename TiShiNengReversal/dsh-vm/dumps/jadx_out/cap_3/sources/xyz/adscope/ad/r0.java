package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class r0 extends xyz.adscope.ad.z1 {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements xyz.adscope.ad.t5.e {
        final /* synthetic */ android.view.View a;
        final /* synthetic */ xyz.adscope.ad.r0 b;

        a(xyz.adscope.ad.r0 r1, android.view.View r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // xyz.adscope.ad.t5.e
        public void a(java.lang.String r3) {
                r2 = this;
                xyz.adscope.ad.r0 r0 = r2.b
                android.view.View r1 = r2.a
                xyz.adscope.ad.r0.a(r0, r1, r3)
                return
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(android.content.DialogInterface r1) {
                r0 = this;
                return
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(android.content.DialogInterface r1) {
                r0 = this;
                return
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(android.content.DialogInterface r1) {
                r0 = this;
                return
        }
    }

    public r0() {
            r0 = this;
            r0.<init>()
            return
    }

    private void a(android.view.View r3, java.lang.String r4) {
            r2 = this;
            boolean r0 = r3 instanceof xyz.adscope.ad.j3
            if (r0 == 0) goto Lc
            r0 = r3
            xyz.adscope.ad.j3 r0 = (xyz.adscope.ad.j3) r0
            xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a r0 = r0.getExpressRoot()
            goto L1a
        Lc:
            android.content.Context r0 = r2.e
            java.lang.String r1 = "scope_root_container"
            int r0 = xyz.adscope.common.v2.dev.info.ResIdentify.getIDIdentify(r0, r1)
            java.lang.Object r0 = r3.getTag(r0)
            xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a r0 = (xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a) r0
        L1a:
            if (r0 == 0) goto L1f
            xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a.c.a(r0, r4)
        L1f:
            xyz.adscope.ad.x1 r4 = r2.a
            xyz.adscope.ad.y1$a r0 = xyz.adscope.ad.y1.a.s
            r4.a(r0, r3)
            return
    }

    static /* synthetic */ void a(xyz.adscope.ad.r0 r0, android.view.View r1, java.lang.String r2) {
            r0.a(r1, r2)
            return
    }

    @Override // xyz.adscope.ad.w2
    public void a(android.view.View r2, int r3) {
            r1 = this;
            xyz.adscope.ad.t5$b r3 = new xyz.adscope.ad.t5$b
            android.content.Context r0 = r2.getContext()
            r3.<init>(r0)
            xyz.adscope.ad.r0$a r0 = new xyz.adscope.ad.r0$a
            r0.<init>(r1, r2)
            xyz.adscope.ad.t5$b r2 = r3.a(r0)
            android.app.Dialog r2 = r2.a()
            r2.show()
            return
    }
}
