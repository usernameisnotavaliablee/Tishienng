package xyz.adscope.ad;

import xyz.adscope.ad.a2;
import xyz.adscope.ad.publish.ad.IAdListener;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public abstract class t2<C extends xyz.adscope.ad.a2, L extends xyz.adscope.ad.publish.ad.IAdListener> extends xyz.adscope.ad.s2<C, L> {
    private android.view.ViewGroup e;

    public t2(android.content.Context r1, C r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private boolean a(android.view.ViewGroup r1) {
            r0 = this;
            if (r1 == 0) goto La
            boolean r1 = r0.b(r1)
            if (r1 == 0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    private boolean b(android.view.ViewGroup r1) {
            r0 = this;
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    @Override // xyz.adscope.ad.s2
    protected final void a(android.content.Context r2) {
            r1 = this;
            xyz.adscope.ad.l1<C extends xyz.adscope.ad.a2, L extends xyz.adscope.ad.publish.ad.IAdListener> r2 = r1.d
            boolean r2 = r2.f()
            if (r2 == 0) goto L1f
            android.view.ViewGroup r2 = r1.e
            boolean r2 = r1.a(r2)
            if (r2 == 0) goto L1f
            xyz.adscope.ad.l1<C extends xyz.adscope.ad.a2, L extends xyz.adscope.ad.publish.ad.IAdListener> r2 = r1.d
            r0 = 0
            android.view.View r2 = r2.a(r0)
            if (r2 == 0) goto L1e
            android.view.ViewGroup r0 = r1.e
            r0.addView(r2)
        L1e:
            return
        L1f:
            xyz.adscope.ad.l1<C extends xyz.adscope.ad.a2, L extends xyz.adscope.ad.publish.ad.IAdListener> r2 = r1.d
            xyz.adscope.ad.y0 r0 = xyz.adscope.ad.y0.p
            r2.b(r0)
            return
    }

    public void setAdContainer(android.view.ViewGroup r1) {
            r0 = this;
            r0.e = r1
            return
    }
}
