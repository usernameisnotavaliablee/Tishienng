package com.kwad.components.core.e.e;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class b extends com.kwad.sdk.mvp.Presenter {
    protected com.kwad.components.core.e.e.c PU;
    protected com.kwad.sdk.core.response.model.AdInfo mAdInfo;

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
            com.kwad.components.core.e.e.c r0 = (com.kwad.components.core.e.e.c) r0
            r1.PU = r0
            com.kwad.components.core.e.d.a$a r0 = r0.PT
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.getAdTemplate()
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            r1.mAdInfo = r0
            return
    }
}
