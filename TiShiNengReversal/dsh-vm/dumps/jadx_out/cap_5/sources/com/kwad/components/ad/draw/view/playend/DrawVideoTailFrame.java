package com.kwad.components.ad.draw.view.playend;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class DrawVideoTailFrame extends android.widget.FrameLayout implements android.view.View.OnClickListener {

    @androidx.annotation.Nullable
    private com.kwad.sdk.api.KsAppDownloadListener dW;
    private com.kwad.sdk.api.KsDrawAd.AdInteractionListener dh;
    private android.widget.TextView ee;
    private com.kwad.components.ad.draw.view.DrawDownloadProgressBar gA;
    private android.view.ViewGroup gB;
    private android.widget.TextView gC;
    private android.widget.TextView gD;
    private com.kwad.sdk.core.view.AdBaseFrameLayout gt;
    private android.widget.ImageView gu;
    private android.view.ViewGroup gv;
    private android.widget.ImageView gw;
    private com.kwad.components.ad.widget.AppScoreView gx;
    private android.widget.TextView gy;
    private android.widget.TextView gz;
    private com.kwad.sdk.core.response.model.AdInfo mAdInfo;
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;

    @androidx.annotation.Nullable
    private com.kwad.components.core.e.d.c mApkDownloadHelper;
    private com.kwad.components.core.widget.KsLogoView mLogoView;



    public DrawVideoTailFrame(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r0.B(r1)
            return
    }

    public DrawVideoTailFrame(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.B(r1)
            return
    }

    public DrawVideoTailFrame(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.B(r1)
            return
    }

    private void B(android.content.Context r2) {
            r1 = this;
            int r0 = com.kwad.sdk.R.layout.ksad_draw_video_tailframe
            com.kwad.sdk.o.m.inflate(r2, r0, r1)
            int r2 = com.kwad.sdk.R.id.ksad_video_cover
            android.view.View r2 = r1.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r1.gu = r2
            int r2 = com.kwad.sdk.R.id.ksad_app_container
            android.view.View r2 = r1.findViewById(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r1.gv = r2
            int r2 = com.kwad.sdk.R.id.ksad_app_icon
            android.view.View r2 = r1.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r1.gw = r2
            int r2 = com.kwad.sdk.R.id.ksad_app_name
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.ee = r2
            int r2 = com.kwad.sdk.R.id.ksad_app_score
            android.view.View r2 = r1.findViewById(r2)
            com.kwad.components.ad.widget.AppScoreView r2 = (com.kwad.components.ad.widget.AppScoreView) r2
            r1.gx = r2
            int r2 = com.kwad.sdk.R.id.ksad_app_download_count
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.gy = r2
            int r2 = com.kwad.sdk.R.id.ksad_app_ad_desc
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.gz = r2
            int r2 = com.kwad.sdk.R.id.ksad_app_download_btn
            android.view.View r2 = r1.findViewById(r2)
            com.kwad.components.ad.draw.view.DrawDownloadProgressBar r2 = (com.kwad.components.ad.draw.view.DrawDownloadProgressBar) r2
            r1.gA = r2
            r0 = 15
            r2.setTextSize(r0)
            int r2 = com.kwad.sdk.R.id.ksad_h5_container
            android.view.View r2 = r1.findViewById(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r1.gB = r2
            int r2 = com.kwad.sdk.R.id.ksad_h5_ad_desc
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.gC = r2
            int r2 = com.kwad.sdk.R.id.ksad_h5_open_btn
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.gD = r2
            int r2 = com.kwad.sdk.R.id.ksad_draw_tailframe_logo
            android.view.View r2 = r1.findViewById(r2)
            com.kwad.components.core.widget.KsLogoView r2 = (com.kwad.components.core.widget.KsLogoView) r2
            r1.mLogoView = r2
            return
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdInfo a(com.kwad.components.ad.draw.view.playend.DrawVideoTailFrame r0) {
            com.kwad.sdk.core.response.model.AdInfo r0 = r0.mAdInfo
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.draw.view.DrawDownloadProgressBar b(com.kwad.components.ad.draw.view.playend.DrawVideoTailFrame r0) {
            com.kwad.components.ad.draw.view.DrawDownloadProgressBar r0 = r0.gA
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate c(com.kwad.components.ad.draw.view.playend.DrawVideoTailFrame r0) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ com.kwad.sdk.api.KsDrawAd.AdInteractionListener d(com.kwad.components.ad.draw.view.playend.DrawVideoTailFrame r0) {
            com.kwad.sdk.api.KsDrawAd$AdInteractionListener r0 = r0.dh
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.view.AdBaseFrameLayout e(com.kwad.components.ad.draw.view.playend.DrawVideoTailFrame r0) {
            com.kwad.sdk.core.view.AdBaseFrameLayout r0 = r0.gt
            return r0
    }

    private com.kwad.sdk.api.KsAppDownloadListener getAppDownloadListener() {
            r1 = this;
            com.kwad.components.ad.draw.view.playend.DrawVideoTailFrame$1 r0 = new com.kwad.components.ad.draw.view.playend.DrawVideoTailFrame$1
            r0.<init>(r1)
            return r0
    }

    public final void bW() {
            r2 = this;
            com.kwad.components.core.e.d.c r0 = r2.mApkDownloadHelper
            if (r0 == 0) goto L17
            com.kwad.sdk.api.KsAppDownloadListener r1 = r2.dW
            if (r1 == 0) goto Lc
            r0.d(r1)
            return
        Lc:
            com.kwad.sdk.api.KsAppDownloadListener r0 = r2.getAppDownloadListener()
            r2.dW = r0
            com.kwad.components.core.e.d.c r1 = r2.mApkDownloadHelper
            r1.b(r0)
        L17:
            return
    }

    public final void j(com.kwad.sdk.core.response.model.AdTemplate r6) {
            r5 = this;
            r5.mAdTemplate = r6
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r6)
            r5.mAdInfo = r0
            com.kwad.sdk.core.response.model.AdInfo$AdMaterialInfo$MaterialFeature r0 = com.kwad.sdk.core.response.b.a.aV(r0)
            java.lang.String r1 = r0.coverUrl
            com.kwad.components.core.widget.KsLogoView r2 = r5.mLogoView
            r2.aP(r6)
            boolean r6 = android.text.TextUtils.isEmpty(r1)
            if (r6 != 0) goto L4c
            int r6 = r0.width
            int r0 = r0.height
            if (r6 <= 0) goto L45
            if (r6 <= r0) goto L45
            android.content.Context r2 = r5.getContext()
            int r2 = com.kwad.sdk.c.a.a.getScreenWidth(r2)
            int r3 = r5.getWidth()
            if (r3 != 0) goto L30
            goto L34
        L30:
            int r2 = r5.getWidth()
        L34:
            float r3 = (float) r2
            float r0 = (float) r0
            float r6 = (float) r6
            float r0 = r0 / r6
            float r3 = r3 * r0
            int r6 = (int) r3
            android.widget.ImageView r0 = r5.gu
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            r0.width = r2
            r0.height = r6
        L45:
            android.widget.ImageView r6 = r5.gu
            com.kwad.sdk.core.response.model.AdTemplate r0 = r5.mAdTemplate
            com.kwad.sdk.core.imageloader.KSImageLoader.loadImage(r6, r1, r0)
        L4c:
            com.kwad.sdk.core.response.model.AdInfo r6 = r5.mAdInfo
            boolean r6 = com.kwad.sdk.core.response.b.a.aF(r6)
            r0 = 8
            r1 = 0
            if (r6 == 0) goto La8
            android.widget.ImageView r6 = r5.gw
            com.kwad.sdk.core.response.model.AdInfo r2 = r5.mAdInfo
            java.lang.String r2 = com.kwad.sdk.core.response.b.a.co(r2)
            com.kwad.sdk.core.response.model.AdTemplate r3 = r5.mAdTemplate
            r4 = 11
            com.kwad.sdk.core.imageloader.KSImageLoader.loadAppIcon(r6, r2, r3, r4)
            android.widget.TextView r6 = r5.ee
            com.kwad.sdk.core.response.model.AdInfo r2 = r5.mAdInfo
            java.lang.String r2 = com.kwad.sdk.core.response.b.a.av(r2)
            r6.setText(r2)
            com.kwad.sdk.core.response.model.AdInfo r6 = r5.mAdInfo
            float r6 = com.kwad.sdk.core.response.b.a.aA(r6)
            r2 = 1077936128(0x40400000, float:3.0)
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 < 0) goto L87
            com.kwad.components.ad.widget.AppScoreView r2 = r5.gx
            r2.setScore(r6)
            com.kwad.components.ad.widget.AppScoreView r6 = r5.gx
            r6.setVisibility(r1)
        L87:
            android.widget.TextView r6 = r5.gy
            com.kwad.sdk.core.response.model.AdInfo r2 = r5.mAdInfo
            java.lang.String r2 = com.kwad.sdk.core.response.b.a.az(r2)
            r6.setText(r2)
            android.widget.TextView r6 = r5.gz
            com.kwad.sdk.core.response.model.AdInfo r2 = r5.mAdInfo
            java.lang.String r2 = com.kwad.sdk.core.response.b.a.au(r2)
            r6.setText(r2)
            android.view.ViewGroup r6 = r5.gv
            r6.setVisibility(r1)
            android.view.ViewGroup r6 = r5.gB
            r6.setVisibility(r0)
            goto Lc8
        La8:
            android.widget.TextView r6 = r5.gC
            com.kwad.sdk.core.response.model.AdInfo r2 = r5.mAdInfo
            java.lang.String r2 = com.kwad.sdk.core.response.b.a.au(r2)
            r6.setText(r2)
            android.widget.TextView r6 = r5.gD
            com.kwad.sdk.core.response.model.AdInfo r2 = r5.mAdInfo
            java.lang.String r2 = com.kwad.sdk.core.response.b.a.aE(r2)
            r6.setText(r2)
            android.view.ViewGroup r6 = r5.gv
            r6.setVisibility(r0)
            android.view.ViewGroup r6 = r5.gB
            r6.setVisibility(r1)
        Lc8:
            com.kwad.components.ad.draw.view.DrawDownloadProgressBar r6 = r5.gA
            r6.setOnClickListener(r5)
            r5.setOnClickListener(r5)
            return
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r5) {
            r4 = this;
            com.kwad.components.ad.draw.view.DrawDownloadProgressBar r0 = r4.gA
            r1 = 1
            if (r5 != r0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 2
        L8:
            com.kwad.components.core.e.d.a$a r2 = new com.kwad.components.core.e.d.a$a
            android.content.Context r3 = r4.getContext()
            r2.<init>(r3)
            com.kwad.sdk.core.response.model.AdTemplate r3 = r4.mAdTemplate
            com.kwad.components.core.e.d.a$a r2 = r2.aB(r3)
            com.kwad.components.core.e.d.c r3 = r4.mApkDownloadHelper
            com.kwad.components.core.e.d.a$a r2 = r2.b(r3)
            com.kwad.components.core.e.d.a$a r0 = r2.aB(r0)
            com.kwad.components.ad.draw.view.DrawDownloadProgressBar r2 = r4.gA
            if (r5 != r2) goto L26
            goto L27
        L26:
            r1 = 0
        L27:
            com.kwad.components.core.e.d.a$a r5 = r0.aq(r1)
            com.kwad.components.ad.draw.view.playend.DrawVideoTailFrame$2 r0 = new com.kwad.components.ad.draw.view.playend.DrawVideoTailFrame$2
            r0.<init>(r4)
            com.kwad.components.core.e.d.a$a r5 = r5.a(r0)
            com.kwad.components.core.e.d.a.a(r5)
            return
    }

    public final void release() {
            r2 = this;
            com.kwad.components.core.e.d.c r0 = r2.mApkDownloadHelper
            if (r0 == 0) goto Lb
            com.kwad.sdk.api.KsAppDownloadListener r1 = r2.dW
            if (r1 == 0) goto Lb
            r0.c(r1)
        Lb:
            return
    }

    public void setAdBaseFrameLayout(com.kwad.sdk.core.view.AdBaseFrameLayout r1) {
            r0 = this;
            r0.gt = r1
            return
    }

    public void setAdInteractionListener(com.kwad.sdk.api.KsDrawAd.AdInteractionListener r1) {
            r0 = this;
            r0.dh = r1
            return
    }

    public void setApkDownloadHelper(@androidx.annotation.Nullable com.kwad.components.core.e.d.c r1) {
            r0 = this;
            r0.mApkDownloadHelper = r1
            return
    }
}
