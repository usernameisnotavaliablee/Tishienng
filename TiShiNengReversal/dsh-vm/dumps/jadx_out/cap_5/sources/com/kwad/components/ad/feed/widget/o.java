package com.kwad.components.ad.feed.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class o extends com.kwad.components.ad.feed.widget.a implements android.view.View.OnClickListener, com.kwad.sdk.widget.d {
    private android.widget.TextView hA;
    private android.widget.ImageView hC;
    private com.kwad.components.ad.widget.DownloadProgressView hH;
    private com.kwad.sdk.core.page.widget.RoundAngleImageView iq;
    private com.kwad.components.core.e.d.c mApkDownloadHelper;
    private com.kwad.components.core.widget.KsLogoView mLogoView;


    public o(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.feed.widget.o r0, int r1) {
            r0.ba(r1)
            return
    }

    private void cn() {
            r5 = this;
            com.kwad.components.core.widget.KsLogoView r0 = r5.mLogoView
            R extends com.kwad.sdk.core.response.model.AdTemplate r1 = r5.mAdTemplate
            r0.aP(r1)
            com.kwad.components.ad.widget.DownloadProgressView r0 = r5.hH
            R extends com.kwad.sdk.core.response.model.AdTemplate r1 = r5.mAdTemplate
            r0.at(r1)
            android.widget.TextView r0 = r5.hA
            com.kwad.sdk.core.page.widget.RoundAngleImageView r1 = r5.iq
            com.kwad.components.ad.widget.DownloadProgressView r2 = r5.hH
            r3 = 3
            android.view.View[] r3 = new android.view.View[r3]
            r4 = 0
            r3[r4] = r0
            r0 = 1
            r3[r0] = r1
            r0 = 2
            r3[r0] = r2
            com.kwad.sdk.c.a.a.a(r5, r3)
            com.kwad.sdk.widget.h r0 = new com.kwad.sdk.widget.h
            android.content.Context r1 = r5.getContext()
            android.widget.TextView r2 = r5.hA
            r0.<init>(r1, r2, r5)
            com.kwad.sdk.widget.h r0 = new com.kwad.sdk.widget.h
            android.content.Context r1 = r5.getContext()
            com.kwad.sdk.core.page.widget.RoundAngleImageView r2 = r5.iq
            r0.<init>(r1, r2, r5)
            com.kwad.sdk.widget.h r0 = new com.kwad.sdk.widget.h
            android.content.Context r1 = r5.getContext()
            com.kwad.components.ad.widget.DownloadProgressView r2 = r5.hH
            r0.<init>(r1, r2, r5)
            com.kwad.sdk.core.response.model.AdInfo r0 = r5.mAdInfo
            boolean r0 = com.kwad.sdk.core.response.b.a.aF(r0)
            if (r0 == 0) goto L72
            com.kwad.components.core.e.d.c r0 = new com.kwad.components.core.e.d.c
            R extends com.kwad.sdk.core.response.model.AdTemplate r1 = r5.mAdTemplate
            com.kwad.components.ad.widget.DownloadProgressView r2 = r5.hH
            com.kwad.sdk.api.KsAppDownloadListener r2 = r2.getAppDownloadListener()
            r3 = 0
            r0.<init>(r1, r3, r2)
            r5.mApkDownloadHelper = r0
            com.kwad.components.ad.widget.DownloadProgressView r1 = r5.hH
            com.kwad.sdk.api.KsAppDownloadListener r1 = r1.getAppDownloadListener()
            r0.d(r1)
            com.kwad.components.core.e.d.c r0 = r5.mApkDownloadHelper
            r0.setOnShowListener(r5)
            com.kwad.components.core.e.d.c r0 = r5.mApkDownloadHelper
            r0.setOnDismissListener(r5)
            r5.ck()
        L72:
            return
    }

    private void d(android.view.View r5, int r6) {
            r4 = this;
            android.widget.ImageView r0 = r4.hC
            if (r5 != r0) goto L8
            r4.vW()
            return
        L8:
            com.kwad.components.ad.widget.DownloadProgressView r0 = r4.hH
            r1 = 1
            if (r5 != r0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 2
        L10:
            com.kwad.components.core.e.d.a$a r2 = new com.kwad.components.core.e.d.a$a
            android.content.Context r3 = r4.getContext()
            r2.<init>(r3)
            r3 = 5
            com.kwad.components.core.e.d.a$a r2 = r2.az(r3)
            com.kwad.components.core.e.d.a$a r2 = r2.aA(r6)
            R extends com.kwad.sdk.core.response.model.AdTemplate r3 = r4.mAdTemplate
            com.kwad.components.core.e.d.a$a r2 = r2.aB(r3)
            com.kwad.components.core.e.d.c r3 = r4.mApkDownloadHelper
            com.kwad.components.core.e.d.a$a r2 = r2.b(r3)
            com.kwad.components.core.e.d.a$a r0 = r2.aB(r0)
            com.kwad.components.ad.widget.DownloadProgressView r2 = r4.hH
            if (r5 != r2) goto L37
            goto L38
        L37:
            r1 = 0
        L38:
            com.kwad.components.core.e.d.a$a r5 = r0.aq(r1)
            com.kwad.components.ad.feed.widget.o$1 r0 = new com.kwad.components.ad.feed.widget.o$1
            r0.<init>(r4, r6)
            com.kwad.components.core.e.d.a$a r5 = r5.a(r0)
            com.kwad.components.core.e.d.a.a(r5)
            return
    }

    @Override // com.kwad.sdk.widget.d
    public final void a(android.view.View r1) {
            r0 = this;
            r0.onClick(r1)
            return
    }

    @Override // com.kwad.components.core.widget.b, com.kwad.sdk.widget.KSFrameLayout
    public final void aa() {
            r2 = this;
            super.aa()
            com.kwad.components.core.e.d.c r0 = r2.mApkDownloadHelper
            if (r0 == 0) goto L12
            com.kwad.components.ad.widget.DownloadProgressView r1 = r2.hH
            if (r1 == 0) goto L12
            com.kwad.sdk.api.KsAppDownloadListener r1 = r1.getAppDownloadListener()
            r0.b(r1)
        L12:
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
            int r0 = com.kwad.sdk.R.id.ksad_ad_desc
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.hA = r0
            int r0 = com.kwad.sdk.R.id.ksad_image_container
            android.view.View r0 = r3.findViewById(r0)
            com.kwad.sdk.widget.RatioFrameLayout r0 = (com.kwad.sdk.widget.RatioFrameLayout) r0
            r1 = 4604119971289628672(0x3fe51eb860000000, double:0.6600000262260437)
            r0.setRatio(r1)
            int r0 = com.kwad.sdk.R.id.ksad_ad_image
            android.view.View r0 = r3.findViewById(r0)
            com.kwad.sdk.core.page.widget.RoundAngleImageView r0 = (com.kwad.sdk.core.page.widget.RoundAngleImageView) r0
            r3.iq = r0
            android.content.Context r1 = r3.getContext()
            r2 = 1077936128(0x40400000, float:3.0)
            int r1 = com.kwad.sdk.c.a.a.a(r1, r2)
            float r1 = (float) r1
            r0.setRadius(r1)
            int r0 = com.kwad.sdk.R.id.ksad_ad_dislike
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.hC = r0
            int r0 = com.kwad.sdk.R.id.ksad_app_download_btn
            android.view.View r0 = r3.findViewById(r0)
            com.kwad.components.ad.widget.DownloadProgressView r0 = (com.kwad.components.ad.widget.DownloadProgressView) r0
            r3.hH = r0
            int r0 = com.kwad.sdk.R.id.ksad_feed_logo
            android.view.View r0 = r3.findViewById(r0)
            com.kwad.components.core.widget.KsLogoView r0 = (com.kwad.components.core.widget.KsLogoView) r0
            r3.mLogoView = r0
            return
    }

    @Override // com.kwad.components.core.widget.b
    public final void cq() {
            r2 = this;
            super.cq()
            com.kwad.components.core.e.d.c r0 = r2.mApkDownloadHelper
            if (r0 == 0) goto L10
            com.kwad.components.ad.widget.DownloadProgressView r1 = r2.hH
            com.kwad.sdk.api.KsAppDownloadListener r1 = r1.getAppDownloadListener()
            r0.c(r1)
        L10:
            return
    }

    @Override // com.kwad.components.core.widget.b
    public final void d(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdResultData r4) {
            r3 = this;
            super.d(r4)
            android.widget.TextView r4 = r3.hA
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            java.lang.String r0 = com.kwad.components.ad.feed.f.l(r0)
            r4.setText(r0)
            com.kwad.sdk.core.response.model.AdInfo r4 = r3.mAdInfo
            java.util.List r4 = com.kwad.sdk.core.response.b.a.ba(r4)
            int r0 = r4.size()
            if (r0 <= 0) goto L31
            long r0 = android.os.SystemClock.elapsedRealtime()
            r3.ht = r0
            com.kwad.sdk.core.page.widget.RoundAngleImageView r0 = r3.iq
            r1 = 0
            java.lang.Object r4 = r4.get(r1)
            java.lang.String r4 = (java.lang.String) r4
            R extends com.kwad.sdk.core.response.model.AdTemplate r1 = r3.mAdTemplate
            com.kwad.sdk.core.imageloader.core.listener.SimpleImageLoadingListener r2 = r3.hy
            com.kwad.sdk.core.imageloader.KSImageLoader.loadFeeImage(r0, r4, r1, r2)
            goto L38
        L31:
            java.lang.String r4 = "FeedTextLeftImageView"
            java.lang.String r0 = "getImageUrlList size less than one"
            com.kwad.sdk.core.d.c.e(r4, r0)
        L38:
            r3.cn()
            android.widget.ImageView r4 = r3.hC
            r4.setOnClickListener(r3)
            r3.setOnClickListener(r3)
            return
    }

    @Override // com.kwad.components.core.widget.b
    public final int getLayoutId() {
            r1 = this;
            int r0 = com.kwad.sdk.R.layout.ksad_feed_text_left_image
            return r0
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r2) {
            r1 = this;
            android.widget.TextView r0 = r1.hA
            if (r2 != r0) goto L7
            r0 = 25
            goto L16
        L7:
            com.kwad.sdk.core.page.widget.RoundAngleImageView r0 = r1.iq
            if (r2 != r0) goto Le
            r0 = 100
            goto L16
        Le:
            com.kwad.components.ad.widget.DownloadProgressView r0 = r1.hH
            if (r2 != r0) goto L14
            r0 = 1
            goto L16
        L14:
            r0 = 35
        L16:
            r1.d(r2, r0)
            return
    }
}
