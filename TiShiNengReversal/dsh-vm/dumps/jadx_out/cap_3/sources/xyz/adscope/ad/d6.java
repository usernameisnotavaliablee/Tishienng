package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class d6 extends xyz.adscope.ad.y5 {
    private xyz.adscope.ad.l6 l;

    public d6(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private void a(android.view.ViewGroup r4) {
            r3 = this;
            if (r4 == 0) goto L28
            int r0 = r4.getChildCount()
            if (r0 <= 0) goto L28
            r0 = 0
        L9:
            int r1 = r4.getChildCount()
            if (r0 >= r1) goto L28
            android.view.View r1 = r4.getChildAt(r0)
            boolean r2 = r1 instanceof xyz.adscope.ad.l6
            if (r2 == 0) goto L1c
            xyz.adscope.ad.l6 r1 = (xyz.adscope.ad.l6) r1
            r3.l = r1
            goto L25
        L1c:
            boolean r2 = r1 instanceof android.view.ViewGroup
            if (r2 == 0) goto L25
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r3.a(r1)
        L25:
            int r0 = r0 + 1
            goto L9
        L28:
            return
    }

    private /* synthetic */ void a(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L8
            int r1 = xyz.adscope.amps.R.drawable.asnp_voice_off
            r0.setImageResource(r1)
            return
        L8:
            int r1 = xyz.adscope.amps.R.drawable.asnp_voice_on
            r0.setImageResource(r1)
            return
    }

    private void e() {
            r3 = this;
            xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a r0 = r3.getExpressRoot()
            if (r0 == 0) goto L1c
            android.view.View r1 = xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a.c.b(r0)
            boolean r2 = r1 instanceof xyz.adscope.ad.l6
            if (r2 == 0) goto L13
            xyz.adscope.ad.l6 r1 = (xyz.adscope.ad.l6) r1
            r3.l = r1
            return
        L13:
            int r1 = r0.getChildCount()
            if (r1 <= 0) goto L1c
            r3.a(r0)
        L1c:
            return
    }

    public static /* synthetic */ void e(xyz.adscope.ad.d6 r0, boolean r1) {
            r0.a(r1)
            return
    }

    @Override // xyz.adscope.ad.x5, xyz.adscope.ad.b4
    public void a(xyz.adscope.ad.b4.a r1) {
            r0 = this;
            r0.e()
            super.a(r1)
            return
    }

    public void f() {
            r2 = this;
            xyz.adscope.ad.l6 r0 = r2.l
            if (r0 == 0) goto Lc
            xyz.adscope.ad.g7 r1 = new xyz.adscope.ad.g7
            r1.<init>(r2)
            r0.a(r1)
        Lc:
            return
    }
}
