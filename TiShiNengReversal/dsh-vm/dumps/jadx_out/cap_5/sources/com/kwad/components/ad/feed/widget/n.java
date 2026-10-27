package com.kwad.components.ad.feed.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class n extends com.kwad.components.ad.feed.widget.a implements android.view.View.OnClickListener, com.kwad.sdk.widget.d {
    private android.widget.TextView hA;
    private android.widget.ImageView hB;
    private android.widget.ImageView hC;
    private com.kwad.components.core.widget.KsLogoView mLogoView;

    public n(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private void d(android.view.View r2, int r3) {
            r1 = this;
            android.widget.ImageView r0 = r1.hC
            if (r2 != r0) goto L8
            r1.vW()
            return
        L8:
            com.kwad.components.core.e.d.a$a r2 = new com.kwad.components.core.e.d.a$a
            android.content.Context r0 = r1.getContext()
            r2.<init>(r0)
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            com.kwad.components.core.e.d.a$a r2 = r2.aB(r0)
            r0 = 1
            int r2 = com.kwad.components.core.e.d.d.a(r2, r0)
            if (r2 != r0) goto L22
            r1.ba(r3)
            return
        L22:
            com.kwad.sdk.core.response.model.AdInfo r2 = r1.mAdInfo
            boolean r2 = com.kwad.sdk.core.response.b.a.aF(r2)
            if (r2 == 0) goto L37
            r1.ba(r3)
            android.content.Context r2 = r1.mContext
            R extends com.kwad.sdk.core.response.model.AdTemplate r3 = r1.mAdTemplate
            com.kwad.components.core.widget.b$a r0 = r1.aig
            com.kwad.components.ad.feed.FeedDownloadActivityProxy.launch(r2, r3, r0)
            return
        L37:
            r1.ba(r3)
            android.content.Context r2 = r1.getContext()
            R extends com.kwad.sdk.core.response.model.AdTemplate r3 = r1.mAdTemplate
            com.kwad.components.core.page.AdWebViewActivityProxy.launch(r2, r3)
            return
    }

    @Override // com.kwad.sdk.widget.d
    public final void a(android.view.View r1) {
            r0 = this;
            r0.onClick(r1)
            return
    }

    @Override // com.kwad.sdk.widget.d
    public final void b(android.view.View r2) {
            r1 = this;
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            boolean r0 = com.kwad.sdk.core.response.b.d.ea(r0)
            if (r0 == 0) goto Ld
            r0 = 153(0x99, float:2.14E-43)
            r1.d(r2, r0)
        Ld:
            return
    }

    @Override // com.kwad.components.core.widget.b
    public final void bw() {
            r3 = this;
            int r0 = com.kwad.sdk.R.id.ksad_container
            android.view.View r0 = r3.findViewById(r0)
            com.kwad.sdk.widget.RatioFrameLayout r0 = (com.kwad.sdk.widget.RatioFrameLayout) r0
            r1 = 4603219251149406208(0x3fe1eb8520000000, double:0.5600000023841858)
            r0.setRatio(r1)
            int r0 = com.kwad.sdk.R.id.ksad_ad_desc
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.hA = r0
            int r0 = com.kwad.sdk.R.id.ksad_ad_image
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.hB = r0
            int r0 = com.kwad.sdk.R.id.ksad_ad_dislike
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.hC = r0
            int r0 = com.kwad.sdk.R.id.ksad_feed_logo
            android.view.View r0 = r3.findViewById(r0)
            com.kwad.components.core.widget.KsLogoView r0 = (com.kwad.components.core.widget.KsLogoView) r0
            r3.mLogoView = r0
            return
    }

    @Override // com.kwad.components.core.widget.b
    public final void d(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdResultData r5) {
            r4 = this;
            super.d(r5)
            android.widget.TextView r5 = r4.hA
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r4.mAdTemplate
            java.lang.String r0 = com.kwad.components.ad.feed.f.l(r0)
            r5.setText(r0)
            com.kwad.sdk.core.response.model.AdInfo r5 = r4.mAdInfo
            java.util.List r5 = com.kwad.sdk.core.response.b.a.ba(r5)
            com.kwad.components.core.widget.KsLogoView r0 = r4.mLogoView
            R extends com.kwad.sdk.core.response.model.AdTemplate r1 = r4.mAdTemplate
            r0.aP(r1)
            int r0 = r5.size()
            r1 = 0
            if (r0 <= 0) goto L30
            android.widget.ImageView r0 = r4.hB
            java.lang.Object r5 = r5.get(r1)
            java.lang.String r5 = (java.lang.String) r5
            R extends com.kwad.sdk.core.response.model.AdTemplate r2 = r4.mAdTemplate
            com.kwad.sdk.core.imageloader.KSImageLoader.loadFeeImage(r0, r5, r2)
            goto L37
        L30:
            java.lang.String r5 = "FeedTextImmerseImageView"
            java.lang.String r0 = "getImageUrlList size less than one"
            com.kwad.sdk.core.d.c.e(r5, r0)
        L37:
            android.widget.TextView r5 = r4.hA
            android.widget.ImageView r0 = r4.hB
            android.widget.ImageView r2 = r4.hC
            r3 = 3
            android.view.View[] r3 = new android.view.View[r3]
            r3[r1] = r5
            r5 = 1
            r3[r5] = r0
            r5 = 2
            r3[r5] = r2
            com.kwad.sdk.c.a.a.a(r4, r3)
            com.kwad.sdk.widget.h r5 = new com.kwad.sdk.widget.h
            android.content.Context r0 = r4.getContext()
            android.widget.TextView r1 = r4.hA
            r5.<init>(r0, r1, r4)
            com.kwad.sdk.widget.h r5 = new com.kwad.sdk.widget.h
            android.content.Context r0 = r4.getContext()
            android.widget.ImageView r1 = r4.hB
            r5.<init>(r0, r1, r4)
            com.kwad.sdk.widget.h r5 = new com.kwad.sdk.widget.h
            android.content.Context r0 = r4.getContext()
            android.widget.ImageView r1 = r4.hC
            r5.<init>(r0, r1, r4)
            r4.setOnClickListener(r4)
            com.kwad.sdk.core.response.model.AdInfo r5 = r4.mAdInfo
            boolean r5 = com.kwad.sdk.core.response.b.a.aF(r5)
            if (r5 == 0) goto L7a
            r4.ck()
        L7a:
            return
    }

    @Override // com.kwad.components.core.widget.b
    public final int getLayoutId() {
            r1 = this;
            int r0 = com.kwad.sdk.R.layout.ksad_feed_text_immerse_image
            return r0
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r2) {
            r1 = this;
            android.widget.TextView r0 = r1.hA
            if (r2 != r0) goto L7
            r0 = 25
            goto L10
        L7:
            android.widget.ImageView r0 = r1.hB
            if (r2 != r0) goto Le
            r0 = 100
            goto L10
        Le:
            r0 = 35
        L10:
            r1.d(r2, r0)
            return
    }
}
