package com.kwad.components.ad.interstitial.f;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class b extends com.kwad.sdk.mvp.Presenter {
    public com.kwad.components.ad.interstitial.f.c mj;

    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public void at() {
            r1 = this;
            super.at()
            java.lang.Object r0 = r1.NN()
            com.kwad.components.ad.interstitial.f.c r0 = (com.kwad.components.ad.interstitial.f.c) r0
            r1.mj = r0
            return
    }

    public void dR() {
            r3 = this;
            java.util.List r0 = r3.NM()
            if (r0 != 0) goto L7
            goto L21
        L7:
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r0.next()
            com.kwad.sdk.mvp.Presenter r1 = (com.kwad.sdk.mvp.Presenter) r1
            boolean r2 = r1 instanceof com.kwad.components.ad.interstitial.f.b
            if (r2 == 0) goto Lb
            com.kwad.components.ad.interstitial.f.b r1 = (com.kwad.components.ad.interstitial.f.b) r1
            r1.dR()
            goto Lb
        L21:
            return
    }

    public void dS() {
            r3 = this;
            java.util.List r0 = r3.NM()
            if (r0 != 0) goto L7
            goto L21
        L7:
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r0.next()
            com.kwad.sdk.mvp.Presenter r1 = (com.kwad.sdk.mvp.Presenter) r1
            boolean r2 = r1 instanceof com.kwad.components.ad.interstitial.f.b
            if (r2 == 0) goto Lb
            com.kwad.components.ad.interstitial.f.b r1 = (com.kwad.components.ad.interstitial.f.b) r1
            r1.dS()
            goto Lb
        L21:
            return
    }
}
