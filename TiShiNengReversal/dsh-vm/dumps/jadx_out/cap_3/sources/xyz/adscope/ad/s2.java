package xyz.adscope.ad;

import xyz.adscope.ad.a2;
import xyz.adscope.ad.publish.ad.IAdListener;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public abstract class s2<C extends xyz.adscope.ad.a2, L extends xyz.adscope.ad.publish.ad.IAdListener> extends xyz.adscope.ad.c2<C, L> implements xyz.adscope.ad.publish.ad.IBidding {
    protected final xyz.adscope.ad.l1<C, L> d;

    public s2(android.content.Context r1, C r2) {
            r0 = this;
            r0.<init>(r1, r2)
            xyz.adscope.ad.b2 r1 = super.a()
            xyz.adscope.ad.l1 r1 = (xyz.adscope.ad.l1) r1
            r0.d = r1
            return
    }

    protected void a(android.content.Context r3) {
            r2 = this;
            if (r3 == 0) goto L15
            xyz.adscope.ad.l1<C extends xyz.adscope.ad.a2, L extends xyz.adscope.ad.publish.ad.IAdListener> r0 = r2.d
            boolean r0 = r0.f()
            if (r0 == 0) goto L15
            xyz.adscope.ad.l1<C extends xyz.adscope.ad.a2, L extends xyz.adscope.ad.publish.ad.IAdListener> r0 = r2.d
            r1 = 1
            r0.a(r1)
            xyz.adscope.ad.l1<C extends xyz.adscope.ad.a2, L extends xyz.adscope.ad.publish.ad.IAdListener> r0 = r2.d
            r0.b(r3)
        L15:
            return
    }

    public void destroyAd() {
            r1 = this;
            xyz.adscope.ad.l1<C extends xyz.adscope.ad.a2, L extends xyz.adscope.ad.publish.ad.IAdListener> r0 = r1.d
            if (r0 == 0) goto L7
            r0.j()
        L7:
            return
    }

    @Override // xyz.adscope.ad.publish.ad.IBidding
    public int getECPM() {
            r1 = this;
            xyz.adscope.ad.l1<C extends xyz.adscope.ad.a2, L extends xyz.adscope.ad.publish.ad.IAdListener> r0 = r1.d
            if (r0 == 0) goto L9
            int r0 = r0.k()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // xyz.adscope.ad.publish.ad.IBidding
    public void notifyBidLose(java.util.Map<java.lang.String, java.lang.String> r2) {
            r1 = this;
            xyz.adscope.ad.l1<C extends xyz.adscope.ad.a2, L extends xyz.adscope.ad.publish.ad.IAdListener> r0 = r1.d
            if (r0 == 0) goto L7
            r0.a(r2)
        L7:
            return
    }

    @Override // xyz.adscope.ad.publish.ad.IBidding
    public void notifyBidWin(java.util.Map<java.lang.String, java.lang.String> r2) {
            r1 = this;
            xyz.adscope.ad.l1<C extends xyz.adscope.ad.a2, L extends xyz.adscope.ad.publish.ad.IAdListener> r0 = r1.d
            if (r0 == 0) goto L7
            r0.b(r2)
        L7:
            return
    }

    public void onActivityPause() {
            r1 = this;
            xyz.adscope.ad.l1<C extends xyz.adscope.ad.a2, L extends xyz.adscope.ad.publish.ad.IAdListener> r0 = r1.d
            if (r0 == 0) goto L7
            r0.l()
        L7:
            return
    }

    public void onActivityResume() {
            r1 = this;
            xyz.adscope.ad.l1<C extends xyz.adscope.ad.a2, L extends xyz.adscope.ad.publish.ad.IAdListener> r0 = r1.d
            if (r0 == 0) goto L7
            r0.m()
        L7:
            return
    }
}
