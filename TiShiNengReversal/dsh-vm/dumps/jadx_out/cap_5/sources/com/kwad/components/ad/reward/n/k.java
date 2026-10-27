package com.kwad.components.ad.reward.n;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class k extends com.kwad.components.ad.reward.n.d implements com.kwad.sdk.widget.d {
    private android.view.ViewStub CB;
    private android.view.ViewGroup CC;
    private com.kwad.components.core.widget.KsStyledTextButton CD;
    private com.kwad.components.core.widget.KsStyledTextButton CE;
    private com.kwad.components.ad.widget.KsPriceView Cd;
    private android.widget.TextView Cg;
    private android.widget.TextView Ch;
    private android.view.View Ci;
    private android.widget.TextView fv;
    private android.widget.TextView ko;
    private com.kwad.components.core.widget.KSCornerImageView nR;
    private com.kwad.components.ad.reward.g tm;

    public k(com.kwad.components.ad.reward.g r1, android.view.ViewGroup r2) {
            r0 = this;
            r0.<init>()
            r0.CC = r2
            r0.tm = r1
            return
    }

    public k(com.kwad.components.ad.reward.g r1, android.view.ViewStub r2) {
            r0 = this;
            r0.<init>()
            r0.CB = r2
            r0.tm = r1
            return
    }

    private void a(com.kwad.sdk.core.response.model.AdTemplate r5, com.kwad.components.ad.reward.model.a r6) {
            r4 = this;
            com.kwad.components.core.widget.KSCornerImageView r0 = r4.nR
            java.lang.String r1 = r6.ho()
            r2 = 8
            com.kwad.sdk.core.imageloader.KSImageLoader.loadAppIcon(r0, r1, r5, r2)
            android.widget.TextView r5 = r4.ko
            java.lang.String r0 = r6.getTitle()
            r5.setText(r0)
            android.widget.TextView r5 = r4.fv
            java.lang.String r0 = r6.hp()
            r5.setText(r0)
            android.view.ViewGroup r5 = r4.CC
            android.content.res.Resources r5 = r5.getResources()
            int r0 = com.kwad.sdk.R.dimen.ksad_reward_jinniu_end_origin_text_size
            int r5 = r5.getDimensionPixelSize(r0)
            android.view.ViewGroup r0 = r4.CC
            android.content.res.Resources r0 = r0.getResources()
            int r1 = com.kwad.sdk.R.color.ksad_jinniu_end_origin_color
            int r0 = r0.getColor(r1)
            com.kwad.components.ad.widget.KsPriceView r1 = r4.Cd
            com.kwad.components.ad.widget.KsPriceView$a r1 = r1.getConfig()
            com.kwad.components.ad.widget.KsPriceView$a r1 = r1.as(r5)
            com.kwad.components.ad.widget.KsPriceView$a r5 = r1.au(r5)
            r5.at(r0)
            com.kwad.components.ad.widget.KsPriceView r5 = r4.Cd
            java.lang.String r0 = r6.getPrice()
            java.lang.String r1 = r6.getOriginPrice()
            r3 = 1
            r5.d(r0, r1, r3)
            java.lang.String r5 = r6.ig()
            android.view.View r0 = r4.Ci
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 == 0) goto L61
            goto L62
        L61:
            r2 = 0
        L62:
            r0.setVisibility(r2)
            if (r5 == 0) goto L6c
            android.widget.TextView r0 = r4.Cg
            r0.setText(r5)
        L6c:
            android.widget.TextView r5 = r4.Ch
            java.lang.String r6 = r6.ih()
            r5.setText(r6)
            return
    }

    private void f(android.view.View r5, boolean r6) {
            r4 = this;
            com.kwad.components.core.widget.KsStyledTextButton r0 = r4.CE
            boolean r0 = r5.equals(r0)
            r1 = 1
            r2 = 153(0x99, float:2.14E-43)
            r3 = 2
            if (r0 == 0) goto L1a
            com.kwad.components.ad.reward.g r0 = r4.tm
            android.content.Context r5 = r5.getContext()
            if (r6 == 0) goto L16
            r2 = 38
        L16:
            r0.a(r3, r5, r2, r1)
            return
        L1a:
            com.kwad.components.core.widget.KsStyledTextButton r0 = r4.CD
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L30
            com.kwad.components.ad.reward.g r0 = r4.tm
            android.content.Context r5 = r5.getContext()
            if (r6 == 0) goto L2c
            r2 = 37
        L2c:
            r0.a(r3, r5, r2, r1)
            return
        L30:
            android.view.ViewGroup r0 = r4.CC
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L44
            com.kwad.components.ad.reward.g r0 = r4.tm
            android.content.Context r5 = r5.getContext()
            if (r6 == 0) goto L41
            r2 = 2
        L41:
            r0.a(r3, r5, r2, r3)
        L44:
            return
    }

    @Override // com.kwad.sdk.widget.d
    public final void a(android.view.View r2) {
            r1 = this;
            r0 = 1
            r1.f(r2, r0)
            return
    }

    @Override // com.kwad.components.ad.reward.n.d
    public final void a(com.kwad.components.ad.reward.n.r r2) {
            r1 = this;
            super.a(r2)
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.getAdTemplate()
            com.kwad.components.ad.reward.model.a r0 = com.kwad.components.ad.reward.model.a.R(r0)
            com.kwad.sdk.core.response.model.AdTemplate r2 = r2.getAdTemplate()
            r1.a(r2, r0)
            return
    }

    @Override // com.kwad.sdk.widget.d
    public final void b(android.view.View r2) {
            r1 = this;
            com.kwad.components.ad.reward.g r0 = r1.tm
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            boolean r0 = com.kwad.sdk.core.response.b.d.ea(r0)
            if (r0 == 0) goto Le
            r0 = 0
            r1.f(r2, r0)
        Le:
            return
    }

    @Override // com.kwad.components.ad.reward.n.d
    public final android.view.ViewGroup hP() {
            r1 = this;
            android.view.ViewGroup r0 = r1.CC
            return r0
    }

    public final void hide() {
            r2 = this;
            android.view.ViewGroup r0 = r2.CC
            if (r0 == 0) goto L9
            r1 = 8
            r0.setVisibility(r1)
        L9:
            return
    }
}
