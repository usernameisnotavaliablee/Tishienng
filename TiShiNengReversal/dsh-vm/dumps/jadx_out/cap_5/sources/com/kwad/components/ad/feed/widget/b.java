package com.kwad.components.ad.feed.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class b extends com.kwad.components.ad.feed.widget.a implements android.view.View.OnClickListener, com.kwad.sdk.widget.d {
    protected android.widget.TextView ee;
    protected android.widget.TextView gD;
    protected android.widget.ImageView gw;
    protected android.widget.TextView hA;
    protected android.widget.ImageView hB;
    protected android.widget.ImageView hC;
    protected com.kwad.sdk.widget.RatioFrameLayout hD;
    protected android.widget.TextView hE;
    protected android.widget.TextView hF;
    protected android.view.View hG;
    protected com.kwad.components.ad.widget.DownloadProgressView hH;
    protected boolean hI;
    protected int hJ;
    protected com.kwad.components.core.e.d.c mApkDownloadHelper;
    protected com.kwad.components.core.widget.KsLogoView mLogoView;



    public b(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 1
            r0.hI = r1
            r1 = 8
            r0.hJ = r1
            return
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate a(com.kwad.components.ad.feed.widget.b r0) {
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ void a(com.kwad.components.ad.feed.widget.b r0, int r1) {
            r0.ba(r1)
            return
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdInfo b(com.kwad.components.ad.feed.widget.b r0) {
            com.kwad.sdk.core.response.model.AdInfo r0 = r0.mAdInfo
            return r0
    }

    private void b(android.view.View r5, int r6) {
            r4 = this;
            android.widget.ImageView r0 = r4.hC
            if (r5 != r0) goto L8
            r4.vW()
            return
        L8:
            r4.cj()
            com.kwad.components.ad.widget.DownloadProgressView r0 = r4.hH
            r1 = 1
            if (r5 != r0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 2
        L13:
            com.kwad.components.core.e.d.a$a r2 = new com.kwad.components.core.e.d.a$a
            android.content.Context r3 = r4.getContext()
            r2.<init>(r3)
            R extends com.kwad.sdk.core.response.model.AdTemplate r3 = r4.mAdTemplate
            com.kwad.components.core.e.d.a$a r2 = r2.aB(r3)
            r3 = 5
            com.kwad.components.core.e.d.a$a r2 = r2.az(r3)
            com.kwad.components.core.e.d.a$a r2 = r2.aA(r6)
            com.kwad.components.core.e.d.c r3 = r4.mApkDownloadHelper
            com.kwad.components.core.e.d.a$a r2 = r2.b(r3)
            com.kwad.components.core.e.d.a$a r0 = r2.aB(r0)
            com.kwad.components.ad.widget.DownloadProgressView r2 = r4.hH
            if (r5 != r2) goto L3a
            goto L3b
        L3a:
            r1 = 0
        L3b:
            com.kwad.components.core.e.d.a$a r5 = r0.aq(r1)
            com.kwad.components.ad.feed.widget.b$2 r0 = new com.kwad.components.ad.feed.widget.b$2
            r0.<init>(r4, r6)
            com.kwad.components.core.e.d.a$a r5 = r5.a(r0)
            com.kwad.components.core.e.d.a.a(r5)
            return
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate c(com.kwad.components.ad.feed.widget.b r0) {
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    private void cm() {
            r3 = this;
            int r0 = com.kwad.sdk.R.id.ksad_h5_desc
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.hF = r0
            int r0 = com.kwad.sdk.R.id.ksad_h5_open_btn
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.gD = r0
            int r0 = com.kwad.sdk.R.id.ksad_h5_open_cover
            android.view.View r0 = r3.findViewById(r0)
            r3.hG = r0
            android.widget.TextView r0 = r3.hF
            R extends com.kwad.sdk.core.response.model.AdTemplate r1 = r3.mAdTemplate
            java.lang.String r1 = com.kwad.components.ad.feed.f.l(r1)
            r0.setText(r1)
            android.widget.TextView r0 = r3.gD
            com.kwad.sdk.core.response.model.AdInfo r1 = r3.mAdInfo
            java.lang.String r1 = com.kwad.sdk.core.response.b.a.aE(r1)
            r0.setText(r1)
            android.view.View r0 = r3.hG
            r0.setOnClickListener(r3)
            android.widget.TextView r0 = r3.hF
            r0.setOnClickListener(r3)
            android.widget.TextView r0 = r3.gD
            r0.setOnClickListener(r3)
            com.kwad.sdk.widget.h r0 = new com.kwad.sdk.widget.h
            android.content.Context r1 = r3.getContext()
            android.view.View r2 = r3.hG
            r0.<init>(r1, r2, r3)
            com.kwad.sdk.widget.h r0 = new com.kwad.sdk.widget.h
            android.content.Context r1 = r3.getContext()
            android.widget.TextView r2 = r3.hF
            r0.<init>(r1, r2, r3)
            com.kwad.sdk.widget.h r0 = new com.kwad.sdk.widget.h
            android.content.Context r1 = r3.getContext()
            android.widget.TextView r2 = r3.gD
            r0.<init>(r1, r2, r3)
            return
    }

    private void cn() {
            r5 = this;
            int r0 = com.kwad.sdk.R.id.ksad_app_icon
            android.view.View r0 = r5.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r5.gw = r0
            int r0 = com.kwad.sdk.R.id.ksad_app_title
            android.view.View r0 = r5.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5.ee = r0
            int r0 = com.kwad.sdk.R.id.ksad_app_desc
            android.view.View r0 = r5.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5.hE = r0
            android.widget.ImageView r1 = r5.gw
            android.widget.TextView r2 = r5.ee
            r3 = 3
            android.view.View[] r3 = new android.view.View[r3]
            r4 = 0
            r3[r4] = r1
            r1 = 1
            r3[r1] = r2
            r1 = 2
            r3[r1] = r0
            com.kwad.sdk.c.a.a.a(r5, r3)
            com.kwad.sdk.widget.h r0 = new com.kwad.sdk.widget.h
            android.content.Context r1 = r5.getContext()
            android.widget.ImageView r2 = r5.gw
            r0.<init>(r1, r2, r5)
            com.kwad.sdk.widget.h r0 = new com.kwad.sdk.widget.h
            android.content.Context r1 = r5.getContext()
            android.widget.TextView r2 = r5.ee
            r0.<init>(r1, r2, r5)
            com.kwad.sdk.widget.h r0 = new com.kwad.sdk.widget.h
            android.content.Context r1 = r5.getContext()
            android.widget.TextView r2 = r5.hE
            r0.<init>(r1, r2, r5)
            boolean r0 = r5.co()
            if (r0 == 0) goto L64
            android.widget.TextView r0 = r5.ee
            com.kwad.sdk.core.response.model.AdInfo r1 = r5.mAdInfo
            java.lang.String r1 = com.kwad.sdk.core.response.b.a.cl(r1)
            r0.setText(r1)
            goto L6f
        L64:
            android.widget.TextView r0 = r5.ee
            com.kwad.sdk.core.response.model.AdInfo r1 = r5.mAdInfo
            java.lang.String r1 = com.kwad.sdk.core.response.b.a.av(r1)
            r0.setText(r1)
        L6f:
            android.widget.ImageView r0 = r5.gw
            int r1 = com.kwad.sdk.R.drawable.ksad_default_app_icon
            r0.setImageResource(r1)
            android.widget.ImageView r0 = r5.gw
            com.kwad.sdk.core.response.model.AdInfo r1 = r5.mAdInfo
            java.lang.String r1 = com.kwad.sdk.core.response.b.a.co(r1)
            R extends com.kwad.sdk.core.response.model.AdTemplate r2 = r5.mAdTemplate
            int r3 = r5.hJ
            com.kwad.sdk.core.imageloader.KSImageLoader.loadAppIcon(r0, r1, r2, r3)
            android.widget.TextView r0 = r5.hE
            R extends com.kwad.sdk.core.response.model.AdTemplate r1 = r5.mAdTemplate
            java.lang.String r1 = com.kwad.components.ad.feed.f.l(r1)
            r0.setText(r1)
            boolean r0 = r5.hI
            if (r0 == 0) goto L97
            r5.ck()
        L97:
            return
    }

    private boolean co() {
            r2 = this;
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            int r0 = com.kwad.sdk.core.response.b.e.eG(r0)
            boolean r0 = com.kwad.components.model.FeedType.isNewVerticalType(r0)
            if (r0 == 0) goto L2a
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            int r0 = com.kwad.sdk.core.response.b.e.eH(r0)
            com.kwad.components.model.FeedType$FeedDefaultType r1 = com.kwad.components.model.FeedType.FeedDefaultType.FEED_VERTICAL_NOVEL_DEFAULT
            int r1 = r1.getDefaultType()
            if (r0 == r1) goto L28
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            int r0 = com.kwad.sdk.core.response.b.e.eH(r0)
            com.kwad.components.model.FeedType$FeedDefaultType r1 = com.kwad.components.model.FeedType.FeedDefaultType.FEED_VERTICAL_BISERIAL_DEFAULT
            int r1 = r1.getDefaultType()
            if (r0 != r1) goto L2a
        L28:
            r0 = 1
            return r0
        L2a:
            r0 = 0
            return r0
    }

    private void cp() {
            r4 = this;
            com.kwad.components.ad.widget.DownloadProgressView r0 = r4.hH
            R extends com.kwad.sdk.core.response.model.AdTemplate r1 = r4.mAdTemplate
            r0.at(r1)
            com.kwad.components.ad.widget.DownloadProgressView r0 = r4.hH
            r0.setOnClickListener(r4)
            com.kwad.components.core.e.d.c r0 = new com.kwad.components.core.e.d.c
            R extends com.kwad.sdk.core.response.model.AdTemplate r1 = r4.mAdTemplate
            com.kwad.components.ad.widget.DownloadProgressView r2 = r4.hH
            com.kwad.sdk.api.KsAppDownloadListener r2 = r2.getAppDownloadListener()
            r3 = 0
            r0.<init>(r1, r3, r2)
            r4.mApkDownloadHelper = r0
            com.kwad.components.ad.widget.DownloadProgressView r1 = r4.hH
            com.kwad.sdk.api.KsAppDownloadListener r1 = r1.getAppDownloadListener()
            r0.d(r1)
            com.kwad.components.core.e.d.c r0 = r4.mApkDownloadHelper
            r0.setOnShowListener(r4)
            com.kwad.components.core.e.d.c r0 = r4.mApkDownloadHelper
            r0.setOnDismissListener(r4)
            com.kwad.sdk.widget.h r0 = new com.kwad.sdk.widget.h
            android.content.Context r1 = r4.getContext()
            com.kwad.components.ad.widget.DownloadProgressView r2 = r4.hH
            r0.<init>(r1, r2, r4)
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
            r1.b(r2, r0)
        Ld:
            return
    }

    @Override // com.kwad.components.core.widget.b
    public void bw() {
            r3 = this;
            int r0 = com.kwad.sdk.R.id.ksad_ad_desc
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.hA = r0
            int r0 = com.kwad.sdk.R.id.ksad_image_container
            android.view.View r0 = r3.findViewById(r0)
            com.kwad.sdk.widget.RatioFrameLayout r0 = (com.kwad.sdk.widget.RatioFrameLayout) r0
            r3.hD = r0
            r1 = 4603219251149406208(0x3fe1eb8520000000, double:0.5600000023841858)
            r0.setRatio(r1)
            int r0 = com.kwad.sdk.R.id.ksad_ad_image
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.hB = r0
            int r0 = com.kwad.sdk.R.id.ksad_ad_dislike
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.hC = r0
            int r0 = com.kwad.sdk.R.id.ksad_ad_dislike_logo
            android.view.View r0 = r3.findViewById(r0)
            com.kwad.components.core.widget.KsLogoView r0 = (com.kwad.components.core.widget.KsLogoView) r0
            r3.mLogoView = r0
            int r0 = com.kwad.sdk.R.id.ksad_app_download_btn
            android.view.View r0 = r3.findViewById(r0)
            com.kwad.components.ad.widget.DownloadProgressView r0 = (com.kwad.components.ad.widget.DownloadProgressView) r0
            r3.hH = r0
            return
    }

    public void cl() {
            r2 = this;
            android.widget.ImageView r0 = r2.hB
            com.kwad.components.ad.feed.widget.b$1 r1 = new com.kwad.components.ad.feed.widget.b$1
            r1.<init>(r2)
            r0.post(r1)
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
    public final void d(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdResultData r5) {
            r4 = this;
            super.d(r5)
            android.widget.TextView r5 = r4.hA
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r4.mAdTemplate
            java.lang.String r0 = com.kwad.components.ad.feed.f.l(r0)
            r5.setText(r0)
            com.kwad.components.core.widget.KsLogoView r5 = r4.mLogoView
            R extends com.kwad.sdk.core.response.model.AdTemplate r0 = r4.mAdTemplate
            r5.aP(r0)
            r4.cl()
            com.kwad.sdk.core.response.model.AdInfo r5 = r4.mAdInfo
            boolean r5 = com.kwad.sdk.core.response.b.a.aF(r5)
            r0 = 8
            r1 = 0
            if (r5 == 0) goto L3c
            int r5 = com.kwad.sdk.R.id.ksad_ad_download_container
            android.view.View r5 = r4.findViewById(r5)
            r5.setVisibility(r1)
            int r5 = com.kwad.sdk.R.id.ksad_ad_h5_container
            android.view.View r5 = r4.findViewById(r5)
            r5.setVisibility(r0)
            r4.cn()
            r4.cp()
            goto L5a
        L3c:
            int r5 = com.kwad.sdk.R.id.ksad_ad_h5_container
            android.view.View r5 = r4.findViewById(r5)
            r5.setVisibility(r1)
            int r5 = com.kwad.sdk.R.id.ksad_ad_download_container
            android.view.View r5 = r4.findViewById(r5)
            r5.setVisibility(r0)
            boolean r5 = r4.co()
            if (r5 == 0) goto L57
            r4.cn()
        L57:
            r4.cm()
        L5a:
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
            return
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r2) {
            r1 = this;
            android.widget.TextView r0 = r1.hA
            if (r2 != r0) goto L7
            r0 = 25
            goto L39
        L7:
            android.widget.ImageView r0 = r1.hB
            if (r2 != r0) goto Le
            r0 = 100
            goto L39
        Le:
            com.kwad.components.ad.widget.DownloadProgressView r0 = r1.hH
            if (r2 == r0) goto L38
            android.widget.TextView r0 = r1.gD
            if (r2 == r0) goto L38
            android.view.View r0 = r1.hG
            if (r2 != r0) goto L1b
            goto L38
        L1b:
            android.widget.ImageView r0 = r1.gw
            if (r2 != r0) goto L22
            r0 = 13
            goto L39
        L22:
            android.widget.TextView r0 = r1.ee
            if (r2 != r0) goto L29
            r0 = 14
            goto L39
        L29:
            android.widget.TextView r0 = r1.hE
            if (r2 == r0) goto L35
            android.widget.TextView r0 = r1.hF
            if (r2 != r0) goto L32
            goto L35
        L32:
            r0 = 35
            goto L39
        L35:
            r0 = 101(0x65, float:1.42E-43)
            goto L39
        L38:
            r0 = 1
        L39:
            r1.b(r2, r0)
            return
    }

    public void setRadiusDp(int r1) {
            r0 = this;
            r0.hJ = r1
            return
    }

    public void setmIsShowComplianceView(boolean r1) {
            r0 = this;
            r0.hI = r1
            return
    }
}
