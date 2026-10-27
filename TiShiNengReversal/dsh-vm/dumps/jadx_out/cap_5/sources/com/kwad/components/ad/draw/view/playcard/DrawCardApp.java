package com.kwad.components.ad.draw.view.playcard;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class DrawCardApp extends android.widget.FrameLayout implements android.view.View.OnClickListener {
    private com.kwad.sdk.api.KsAppDownloadListener dW;
    private com.kwad.components.ad.draw.view.playcard.DrawCardApp.a gc;
    private android.widget.ImageView gd;
    private android.widget.ImageView ge;
    private android.widget.TextView gf;
    private android.view.ViewGroup gg;
    private com.kwad.components.ad.widget.AppScoreView gh;
    private android.widget.TextView gi;
    private android.widget.TextView gj;
    private com.kwad.components.core.widget.KsLogoView gk;
    private com.kwad.components.ad.draw.view.DrawDownloadProgressBar gl;
    private android.animation.ValueAnimator gm;
    private com.kwad.sdk.core.response.model.AdInfo mAdInfo;
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;
    private com.kwad.components.core.e.d.c mApkDownloadHelper;
    private int mHeight;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void ba();

        void bb();
    }

    public DrawCardApp(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r0.B(r1)
            return
    }

    public DrawCardApp(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.B(r1)
            return
    }

    public DrawCardApp(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.B(r1)
            return
    }

    private void B(android.content.Context r3) {
            r2 = this;
            int r0 = com.kwad.sdk.R.layout.ksad_draw_card_app
            com.kwad.sdk.o.m.inflate(r3, r0, r2)
            int r0 = com.kwad.sdk.R.id.ksad_card_app_close
            android.view.View r0 = r2.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r2.gd = r0
            int r0 = com.kwad.sdk.R.id.ksad_card_app_icon
            android.view.View r0 = r2.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r2.ge = r0
            int r0 = com.kwad.sdk.R.id.ksad_card_app_name
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.gf = r0
            int r0 = com.kwad.sdk.R.id.ksad_card_app_score_container
            android.view.View r0 = r2.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r2.gg = r0
            int r0 = com.kwad.sdk.R.id.ksad_card_app_score
            android.view.View r0 = r2.findViewById(r0)
            com.kwad.components.ad.widget.AppScoreView r0 = (com.kwad.components.ad.widget.AppScoreView) r0
            r2.gh = r0
            int r0 = com.kwad.sdk.R.id.ksad_card_app_download_count
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.gi = r0
            int r0 = com.kwad.sdk.R.id.ksad_card_app_desc
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.gj = r0
            int r0 = com.kwad.sdk.R.id.ksad_card_logo
            android.view.View r0 = r2.findViewById(r0)
            com.kwad.components.core.widget.KsLogoView r0 = (com.kwad.components.core.widget.KsLogoView) r0
            r2.gk = r0
            int r0 = com.kwad.sdk.R.id.ksad_card_app_download_btn
            android.view.View r0 = r2.findViewById(r0)
            com.kwad.components.ad.draw.view.DrawDownloadProgressBar r0 = (com.kwad.components.ad.draw.view.DrawDownloadProgressBar) r0
            r2.gl = r0
            r1 = 16
            r0.setTextSize(r1)
            r0 = 1125908480(0x431c0000, float:156.0)
            int r3 = com.kwad.sdk.c.a.a.a(r3, r0)
            r2.mHeight = r3
            return
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdInfo a(com.kwad.components.ad.draw.view.playcard.DrawCardApp r0) {
            com.kwad.sdk.core.response.model.AdInfo r0 = r0.mAdInfo
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.draw.view.DrawDownloadProgressBar b(com.kwad.components.ad.draw.view.playcard.DrawCardApp r0) {
            com.kwad.components.ad.draw.view.DrawDownloadProgressBar r0 = r0.gl
            return r0
    }

    private void bU() {
            r2 = this;
            int r0 = r2.mHeight
            r1 = 0
            r2.d(r0, r1)
            return
    }

    private void bl() {
            r1 = this;
            android.animation.ValueAnimator r0 = r1.gm
            if (r0 == 0) goto Lc
            r0.removeAllListeners()
            android.animation.ValueAnimator r0 = r1.gm
            r0.cancel()
        Lc:
            return
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate c(com.kwad.components.ad.draw.view.playcard.DrawCardApp r0) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.draw.view.playcard.DrawCardApp.a d(com.kwad.components.ad.draw.view.playcard.DrawCardApp r0) {
            com.kwad.components.ad.draw.view.playcard.DrawCardApp$a r0 = r0.gc
            return r0
    }

    private void d(int r3, int r4) {
            r2 = this;
            r2.bl()
            android.animation.ValueAnimator r3 = com.kwad.components.core.t.o.b(r2, r3, r4)
            r2.gm = r3
            android.view.animation.DecelerateInterpolator r4 = new android.view.animation.DecelerateInterpolator
            r0 = 1073741824(0x40000000, float:2.0)
            r4.<init>(r0)
            r3.setInterpolator(r4)
            android.animation.ValueAnimator r3 = r2.gm
            r0 = 300(0x12c, double:1.48E-321)
            r3.setDuration(r0)
            android.animation.ValueAnimator r3 = r2.gm
            r3.start()
            return
    }

    private com.kwad.sdk.api.KsAppDownloadListener getAppDownloadListener() {
            r1 = this;
            com.kwad.sdk.api.KsAppDownloadListener r0 = r1.dW
            if (r0 != 0) goto Lb
            com.kwad.components.ad.draw.view.playcard.DrawCardApp$1 r0 = new com.kwad.components.ad.draw.view.playcard.DrawCardApp$1
            r0.<init>(r1)
            r1.dW = r0
        Lb:
            com.kwad.sdk.api.KsAppDownloadListener r0 = r1.dW
            return r0
    }

    public final void a(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r4, com.kwad.components.ad.draw.view.playcard.DrawCardApp.a r5) {
            r3 = this;
            r3.mAdTemplate = r4
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r4)
            r3.mAdInfo = r0
            r3.gc = r5
            com.kwad.components.core.e.d.c r5 = new com.kwad.components.core.e.d.c
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            com.kwad.sdk.api.KsAppDownloadListener r1 = r3.getAppDownloadListener()
            r5.<init>(r0, r1)
            r3.mApkDownloadHelper = r5
            android.widget.ImageView r5 = r3.ge
            com.kwad.sdk.core.response.model.AdInfo r0 = r3.mAdInfo
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.co(r0)
            r1 = 11
            com.kwad.sdk.core.imageloader.KSImageLoader.loadAppIcon(r5, r0, r4, r1)
            android.widget.TextView r4 = r3.gf
            com.kwad.sdk.core.response.model.AdInfo r5 = r3.mAdInfo
            java.lang.String r5 = com.kwad.sdk.core.response.b.a.av(r5)
            r4.setText(r5)
            com.kwad.sdk.core.response.model.AdInfo r4 = r3.mAdInfo
            java.lang.String r4 = com.kwad.sdk.core.response.b.a.az(r4)
            com.kwad.sdk.core.response.model.AdInfo r5 = r3.mAdInfo
            float r5 = com.kwad.sdk.core.response.b.a.aA(r5)
            r0 = 1077936128(0x40400000, float:3.0)
            r1 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L44
            r0 = 1
            goto L45
        L44:
            r0 = 0
        L45:
            if (r0 == 0) goto L51
            com.kwad.components.ad.widget.AppScoreView r2 = r3.gh
            r2.setScore(r5)
            com.kwad.components.ad.widget.AppScoreView r5 = r3.gh
            r5.setVisibility(r1)
        L51:
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L61
            android.widget.TextView r2 = r3.gi
            r2.setText(r4)
            android.widget.TextView r4 = r3.gi
            r4.setVisibility(r1)
        L61:
            if (r0 != 0) goto L6e
            if (r5 != 0) goto L66
            goto L6e
        L66:
            android.view.ViewGroup r4 = r3.gg
            r5 = 8
            r4.setVisibility(r5)
            goto L73
        L6e:
            android.view.ViewGroup r4 = r3.gg
            r4.setVisibility(r1)
        L73:
            com.kwad.components.core.widget.KsLogoView r4 = r3.gk
            com.kwad.sdk.core.response.model.AdTemplate r5 = r3.mAdTemplate
            r4.aP(r5)
            android.widget.TextView r4 = r3.gj
            com.kwad.sdk.core.response.model.AdInfo r5 = r3.mAdInfo
            java.lang.String r5 = com.kwad.sdk.core.response.b.a.au(r5)
            r4.setText(r5)
            android.widget.ImageView r4 = r3.gd
            r4.setOnClickListener(r3)
            com.kwad.components.ad.draw.view.DrawDownloadProgressBar r4 = r3.gl
            r4.setOnClickListener(r3)
            r3.setOnClickListener(r3)
            return
    }

    public final void bT() {
            r2 = this;
            r0 = 0
            int r1 = r2.mHeight
            r2.d(r0, r1)
            return
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r5) {
            r4 = this;
            android.widget.ImageView r0 = r4.gd
            if (r5 != r0) goto Lf
            r4.bU()
            com.kwad.components.ad.draw.view.playcard.DrawCardApp$a r5 = r4.gc
            if (r5 == 0) goto Le
            r5.ba()
        Le:
            return
        Lf:
            com.kwad.components.ad.draw.view.DrawDownloadProgressBar r0 = r4.gl
            r1 = 1
            if (r5 != r0) goto L16
            r0 = 1
            goto L17
        L16:
            r0 = 2
        L17:
            com.kwad.components.core.e.d.a$a r2 = new com.kwad.components.core.e.d.a$a
            android.content.Context r3 = r4.getContext()
            r2.<init>(r3)
            com.kwad.sdk.core.response.model.AdTemplate r3 = r4.mAdTemplate
            com.kwad.components.core.e.d.a$a r2 = r2.aB(r3)
            com.kwad.components.core.e.d.c r3 = r4.mApkDownloadHelper
            com.kwad.components.core.e.d.a$a r2 = r2.b(r3)
            com.kwad.components.ad.draw.view.DrawDownloadProgressBar r3 = r4.gl
            if (r5 != r3) goto L31
            goto L32
        L31:
            r1 = 0
        L32:
            com.kwad.components.core.e.d.a$a r5 = r2.aq(r1)
            com.kwad.components.core.e.d.a$a r5 = r5.aB(r0)
            com.kwad.components.ad.draw.view.playcard.DrawCardApp$2 r0 = new com.kwad.components.ad.draw.view.playcard.DrawCardApp$2
            r0.<init>(r4)
            com.kwad.components.core.e.d.a$a r5 = r5.a(r0)
            com.kwad.components.core.e.d.a.a(r5)
            return
    }

    public final void release() {
            r1 = this;
            r1.bl()
            r0 = 0
            r1.mApkDownloadHelper = r0
            return
    }
}
