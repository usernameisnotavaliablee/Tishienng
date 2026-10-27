package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class z6 extends xyz.adscope.ad.f1 {
    private final boolean d;
    private final boolean e;

    public z6(@androidx.annotation.NonNull android.content.Context r1, xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.optimize.OptimizeModel r2, boolean r3, boolean r4) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.d = r3
            r0.e = r4
            return
    }

    @Override // xyz.adscope.ad.f1
    public void a() {
            r2 = this;
            r2.c()
            android.view.View r0 = r2.c
            boolean r0 = r0 instanceof android.view.ViewGroup
            if (r0 == 0) goto L16
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -1
            r0.<init>(r1, r1)
            android.view.View r1 = r2.c
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r1.addView(r2, r0)
        L16:
            return
    }

    public boolean e() {
            r1 = this;
            boolean r0 = r1.e
            return r0
    }

    public boolean f() {
            r1 = this;
            boolean r0 = r1.d
            return r0
    }
}
