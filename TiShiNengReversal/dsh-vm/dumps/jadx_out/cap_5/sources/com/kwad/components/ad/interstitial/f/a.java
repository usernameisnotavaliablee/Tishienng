package com.kwad.components.ad.interstitial.f;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a extends com.kwad.components.ad.interstitial.f.b {
    private com.kwad.components.core.widget.ComplianceTextView me;
    private android.view.OrientationEventListener mf;
    private com.kwad.components.core.widget.KsAutoCloseView mg;


    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.interstitial.f.a r0, com.kwad.components.ad.interstitial.f.c r1) {
            r0.b(r1)
            return
    }

    private void a(com.kwad.components.ad.interstitial.f.c r3) {
            r2 = this;
            com.kwad.components.ad.interstitial.f.a$1 r0 = new com.kwad.components.ad.interstitial.f.a$1
            com.kwad.components.ad.interstitial.d r1 = r3.kW
            android.content.Context r1 = r1.getContext()
            r0.<init>(r2, r1, r3)
            r2.mf = r0
            boolean r3 = r0.canDetectOrientation()
            if (r3 == 0) goto L19
            android.view.OrientationEventListener r3 = r2.mf
            r3.enable()
            return
        L19:
            android.view.OrientationEventListener r3 = r2.mf
            r3.disable()
            return
    }

    private void b(com.kwad.components.ad.interstitial.f.c r4) {
            r3 = this;
            com.kwad.components.core.widget.ComplianceTextView r0 = r3.me
            r3.i(r0)
            boolean r0 = com.kwad.sdk.utils.aq.isOrientationPortrait()
            r1 = 0
            if (r0 != 0) goto L12
            com.kwad.components.core.widget.KsAutoCloseView r0 = r3.mg
            com.kwad.sdk.c.a.a.b(r0, r1, r1, r1, r1)
            goto L21
        L12:
            android.content.Context r0 = r3.getContext()
            r2 = 1103626240(0x41c80000, float:25.0)
            int r0 = com.kwad.sdk.c.a.a.a(r0, r2)
            com.kwad.components.core.widget.KsAutoCloseView r2 = r3.mg
            com.kwad.sdk.c.a.a.b(r2, r1, r0, r1, r1)
        L21:
            com.kwad.components.core.widget.ComplianceTextView r0 = r3.me
            r0.setVisibility(r1)
            com.kwad.components.core.widget.ComplianceTextView r0 = r3.me
            com.kwad.sdk.core.response.model.AdTemplate r4 = r4.mAdTemplate
            r0.setAdTemplate(r4)
            return
    }

    private void i(android.view.View r4) {
            r3 = this;
            android.content.Context r0 = r3.getContext()
            r1 = 1082130432(0x40800000, float:4.0)
            int r0 = com.kwad.sdk.c.a.a.a(r0, r1)
            android.content.Context r2 = r3.getContext()
            int r1 = com.kwad.sdk.c.a.a.a(r2, r1)
            r2 = 0
            com.kwad.sdk.c.a.a.b(r4, r1, r0, r1, r2)
            return
    }

    @Override // com.kwad.components.ad.interstitial.f.b, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r1 = this;
            super.at()
            java.lang.Object r0 = r1.NN()
            com.kwad.components.ad.interstitial.f.c r0 = (com.kwad.components.ad.interstitial.f.c) r0
            r1.b(r0)
            r1.a(r0)
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r1 = this;
            super.onCreate()
            int r0 = com.kwad.sdk.R.id.ksad_compliance_view
            android.view.View r0 = r1.findViewById(r0)
            com.kwad.components.core.widget.ComplianceTextView r0 = (com.kwad.components.core.widget.ComplianceTextView) r0
            r1.me = r0
            int r0 = com.kwad.sdk.R.id.ksad_interstitial_auto_close
            android.view.View r0 = r1.findViewById(r0)
            com.kwad.components.core.widget.KsAutoCloseView r0 = (com.kwad.components.core.widget.KsAutoCloseView) r0
            r1.mg = r0
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r1 = this;
            super.onUnbind()
            android.view.OrientationEventListener r0 = r1.mf
            if (r0 == 0) goto La
            r0.disable()
        La:
            return
    }
}
