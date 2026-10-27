package com.kwad.components.ad.draw.presenter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a extends com.kwad.components.ad.draw.b.a {
    private com.kwad.components.core.widget.ComplianceTextView dI;

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.kwad.components.ad.draw.b.a, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r2 = this;
            super.at()
            com.kwad.components.core.widget.ComplianceTextView r0 = r2.dI
            r1 = 0
            r0.setVisibility(r1)
            com.kwad.components.core.widget.ComplianceTextView r0 = r2.dI
            com.kwad.components.ad.draw.b.b r1 = r2.dz
            com.kwad.sdk.core.response.model.AdTemplate r1 = r1.mAdTemplate
            r0.setAdTemplate(r1)
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r1 = this;
            super.onCreate()
            int r0 = com.kwad.sdk.R.id.ksad_compliance_view
            android.view.View r0 = r1.findViewById(r0)
            com.kwad.components.core.widget.ComplianceTextView r0 = (com.kwad.components.core.widget.ComplianceTextView) r0
            r1.dI = r0
            return
    }
}
