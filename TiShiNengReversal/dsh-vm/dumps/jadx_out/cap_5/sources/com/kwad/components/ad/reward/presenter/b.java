package com.kwad.components.ad.reward.presenter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class b extends com.kwad.sdk.mvp.Presenter {
    public com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;
    public com.kwad.components.ad.reward.g tm;

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
            com.kwad.components.ad.reward.g r0 = (com.kwad.components.ad.reward.g) r0
            r1.tm = r0
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            r1.mAdTemplate = r0
            return
    }

    protected final boolean iA() {
            r1 = this;
            com.kwad.components.ad.reward.g r0 = r1.tm
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            boolean r0 = com.kwad.sdk.core.response.b.a.bd(r0)
            return r0
    }

    protected final void iz() {
            r1 = this;
            com.kwad.components.ad.reward.g r0 = r1.tm
            r0.iz()
            return
    }
}
