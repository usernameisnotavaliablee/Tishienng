package com.kwad.components.ad.splashscreen.presenter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class f extends com.kwad.components.ad.splashscreen.presenter.e {
    private com.kwad.components.core.widget.ComplianceTextView dI;

    public f() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.kwad.components.ad.splashscreen.presenter.e, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r2 = this;
            super.at()
            com.kwad.components.ad.splashscreen.h r0 = r2.Gf
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            boolean r0 = com.kwad.components.ad.splashscreen.e.c.z(r0)
            if (r0 == 0) goto L14
            int r0 = com.kwad.sdk.R.id.ksad_compliance_right_view
            goto L16
        L14:
            int r0 = com.kwad.sdk.R.id.ksad_compliance_left_view
        L16:
            android.view.View r0 = r2.findViewById(r0)
            com.kwad.components.core.widget.ComplianceTextView r0 = (com.kwad.components.core.widget.ComplianceTextView) r0
            r2.dI = r0
            r1 = 0
            r0.setBackgroundColor(r1)
            com.kwad.components.core.widget.ComplianceTextView r0 = r2.dI
            r0.setVisibility(r1)
            com.kwad.components.core.widget.ComplianceTextView r0 = r2.dI
            com.kwad.components.ad.splashscreen.h r1 = r2.Gf
            com.kwad.sdk.core.response.model.AdTemplate r1 = r1.mAdTemplate
            r0.setAdTemplate(r1)
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r0 = this;
            super.onCreate()
            return
    }
}
