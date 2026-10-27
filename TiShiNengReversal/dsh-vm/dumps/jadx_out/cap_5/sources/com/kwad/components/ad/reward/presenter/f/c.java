package com.kwad.components.ad.reward.presenter.f;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class c extends com.kwad.components.ad.reward.presenter.f.f {
    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.f.f, com.kwad.components.core.webview.tachikoma.j
    public java.lang.String getTKReaderScene() {
            r1 = this;
            java.lang.String r0 = "tk_image_video"
            return r0
    }

    @Override // com.kwad.components.ad.reward.presenter.f.f, com.kwad.components.core.webview.tachikoma.j
    public java.lang.String getTkTemplateId() {
            r1 = this;
            com.kwad.components.ad.reward.g r0 = r1.tm
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            java.lang.String r0 = com.kwad.sdk.core.response.b.b.dH(r0)
            return r0
    }
}
