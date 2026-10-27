package com.kwad.components.ad.draw.presenter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c extends com.kwad.components.ad.draw.b.a implements android.view.View.OnClickListener {
    private android.view.ViewGroup dN;
    private android.widget.TextView dO;
    private android.widget.TextView dP;
    private android.widget.TextView dQ;
    private com.kwad.components.ad.draw.view.DrawDownloadProgressBar dR;
    private android.animation.ValueAnimator dS;
    private int dT;
    private int dU;
    private int dV;
    private com.kwad.sdk.api.KsAppDownloadListener dW;
    private com.kwad.sdk.core.response.model.AdInfo mAdInfo;
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;

    @androidx.annotation.Nullable
    private com.kwad.components.core.e.d.c mApkDownloadHelper;
    private com.kwad.components.core.widget.KsLogoView mLogoView;
    private com.kwad.components.core.video.l mVideoPlayStateListener;




    public c() {
            r1 = this;
            r1.<init>()
            com.kwad.components.ad.draw.presenter.c$1 r0 = new com.kwad.components.ad.draw.presenter.c$1
            r0.<init>(r1)
            r1.mVideoPlayStateListener = r0
            com.kwad.components.ad.draw.presenter.c$2 r0 = new com.kwad.components.ad.draw.presenter.c$2
            r0.<init>(r1)
            r1.dW = r0
            return
    }

    static /* synthetic */ int a(com.kwad.components.ad.draw.presenter.c r0) {
            int r0 = r0.dV
            return r0
    }

    private void a(boolean r3, int r4) {
            r2 = this;
            com.kwad.components.core.e.d.a$a r0 = new com.kwad.components.core.e.d.a$a
            android.view.ViewGroup r1 = r2.dN
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1)
            com.kwad.sdk.core.response.model.AdTemplate r1 = r2.mAdTemplate
            com.kwad.components.core.e.d.a$a r0 = r0.aB(r1)
            com.kwad.components.core.e.d.c r1 = r2.mApkDownloadHelper
            com.kwad.components.core.e.d.a$a r0 = r0.b(r1)
            com.kwad.components.core.e.d.a$a r4 = r0.aB(r4)
            com.kwad.components.core.e.d.a$a r3 = r4.aq(r3)
            com.kwad.components.ad.draw.presenter.c$3 r4 = new com.kwad.components.ad.draw.presenter.c$3
            r4.<init>(r2)
            com.kwad.components.core.e.d.a$a r3 = r3.a(r4)
            com.kwad.components.core.e.d.a.a(r3)
            return
    }

    private void aO() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r1.mAdInfo
            int r0 = com.kwad.sdk.core.response.b.a.br(r0)
            r1.dT = r0
            com.kwad.sdk.core.response.model.AdInfo r0 = r1.mAdInfo
            int r0 = com.kwad.sdk.core.response.b.a.bs(r0)
            r1.dU = r0
            com.kwad.sdk.core.response.model.AdInfo r0 = r1.mAdInfo
            int r0 = com.kwad.sdk.core.response.b.a.bt(r0)
            r1.dV = r0
            return
    }

    private void aP() {
            r4 = this;
            android.widget.TextView r0 = r4.dQ
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L44
            com.kwad.components.ad.draw.view.DrawDownloadProgressBar r0 = r4.dR
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L11
            goto L44
        L11:
            android.widget.TextView r0 = r4.dQ
            r0.setOnClickListener(r4)
            android.widget.TextView r0 = r4.dQ
            r1 = 0
            r0.setVisibility(r1)
            android.widget.TextView r0 = r4.dQ
            android.content.Context r2 = r0.getContext()
            r3 = 1110441984(0x42300000, float:44.0)
            int r2 = com.kwad.sdk.c.a.a.a(r2, r3)
            android.animation.ValueAnimator r0 = com.kwad.components.core.t.o.b(r0, r1, r2)
            r4.dS = r0
            android.view.animation.DecelerateInterpolator r1 = new android.view.animation.DecelerateInterpolator
            r2 = 1073741824(0x40000000, float:2.0)
            r1.<init>(r2)
            r0.setInterpolator(r1)
            android.animation.ValueAnimator r0 = r4.dS
            r1 = 300(0x12c, double:1.48E-321)
            r0.setDuration(r1)
            android.animation.ValueAnimator r0 = r4.dS
            r0.start()
        L44:
            return
    }

    private void aQ() {
            r1 = this;
            android.animation.ValueAnimator r0 = r1.dS
            if (r0 == 0) goto Lc
            r0.removeAllListeners()
            android.animation.ValueAnimator r0 = r1.dS
            r0.cancel()
        Lc:
            return
    }

    private void aR() {
            r2 = this;
            com.kwad.components.ad.draw.view.DrawDownloadProgressBar r0 = r2.dR
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L9
            return
        L9:
            com.kwad.components.ad.draw.view.DrawDownloadProgressBar r0 = r2.dR
            r0.setOnClickListener(r2)
            com.kwad.components.ad.draw.view.DrawDownloadProgressBar r0 = r2.dR
            r1 = 0
            r0.setVisibility(r1)
            android.widget.TextView r0 = r2.dQ
            r1 = 8
            r0.setVisibility(r1)
            return
    }

    static /* synthetic */ com.kwad.components.ad.draw.b.b b(com.kwad.components.ad.draw.presenter.c r0) {
            com.kwad.components.ad.draw.b.b r0 = r0.dz
            return r0
    }

    static /* synthetic */ int c(com.kwad.components.ad.draw.presenter.c r0) {
            int r0 = r0.dU
            return r0
    }

    static /* synthetic */ void d(com.kwad.components.ad.draw.presenter.c r0) {
            r0.aR()
            return
    }

    static /* synthetic */ int e(com.kwad.components.ad.draw.presenter.c r0) {
            int r0 = r0.dT
            return r0
    }

    static /* synthetic */ void f(com.kwad.components.ad.draw.presenter.c r0) {
            r0.aP()
            return
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdInfo g(com.kwad.components.ad.draw.presenter.c r0) {
            com.kwad.sdk.core.response.model.AdInfo r0 = r0.mAdInfo
            return r0
    }

    static /* synthetic */ android.widget.TextView h(com.kwad.components.ad.draw.presenter.c r0) {
            android.widget.TextView r0 = r0.dQ
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.draw.view.DrawDownloadProgressBar i(com.kwad.components.ad.draw.presenter.c r0) {
            com.kwad.components.ad.draw.view.DrawDownloadProgressBar r0 = r0.dR
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate j(com.kwad.components.ad.draw.presenter.c r0) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.draw.b.b k(com.kwad.components.ad.draw.presenter.c r0) {
            com.kwad.components.ad.draw.b.b r0 = r0.dz
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.draw.b.b l(com.kwad.components.ad.draw.presenter.c r0) {
            com.kwad.components.ad.draw.b.b r0 = r0.dz
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.draw.b.b m(com.kwad.components.ad.draw.presenter.c r0) {
            com.kwad.components.ad.draw.b.b r0 = r0.dz
            return r0
    }

    @Override // com.kwad.components.ad.draw.b.a, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r4 = this;
            super.at()
            com.kwad.components.ad.draw.b.b r0 = r4.dz
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            r4.mAdTemplate = r0
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            r4.mAdInfo = r0
            com.kwad.components.ad.draw.b.b r0 = r4.dz
            com.kwad.components.core.e.d.c r0 = r0.mApkDownloadHelper
            r4.mApkDownloadHelper = r0
            r4.aO()
            com.kwad.components.core.widget.KsLogoView r0 = r4.mLogoView
            com.kwad.sdk.core.response.model.AdTemplate r1 = r4.mAdTemplate
            r0.aP(r1)
            android.widget.TextView r0 = r4.dQ
            com.kwad.sdk.core.response.model.AdInfo r1 = r4.mAdInfo
            java.lang.String r1 = com.kwad.sdk.core.response.b.a.aE(r1)
            r0.setText(r1)
            android.widget.TextView r0 = r4.dQ
            r1 = 8
            r0.setVisibility(r1)
            com.kwad.components.ad.draw.view.DrawDownloadProgressBar r0 = r4.dR
            com.kwad.sdk.core.response.model.AdInfo r2 = r4.mAdInfo
            java.lang.String r2 = com.kwad.sdk.core.response.b.a.aE(r2)
            com.kwad.components.ad.draw.view.DrawDownloadProgressBar r3 = r4.dR
            int r3 = r3.getMax()
            r0.e(r2, r3)
            com.kwad.components.ad.draw.view.DrawDownloadProgressBar r0 = r4.dR
            r0.setVisibility(r1)
            android.view.ViewGroup r0 = r4.dN
            r2 = 0
            r0.setVisibility(r2)
            android.view.ViewGroup r0 = r4.dN
            r0.setOnClickListener(r4)
            com.kwad.sdk.core.response.model.AdInfo r0 = r4.mAdInfo
            boolean r0 = com.kwad.sdk.core.response.b.a.aF(r0)
            if (r0 == 0) goto L74
            android.widget.TextView r0 = r4.dO
            com.kwad.sdk.core.response.model.AdInfo r1 = r4.mAdInfo
            java.lang.String r1 = com.kwad.sdk.core.response.b.a.av(r1)
            r0.setText(r1)
            android.widget.TextView r0 = r4.dO
            r0.setVisibility(r2)
            com.kwad.components.core.e.d.c r0 = r4.mApkDownloadHelper
            if (r0 == 0) goto L79
            com.kwad.sdk.api.KsAppDownloadListener r1 = r4.dW
            r0.b(r1)
            goto L79
        L74:
            android.widget.TextView r0 = r4.dO
            r0.setVisibility(r1)
        L79:
            android.widget.TextView r0 = r4.dP
            com.kwad.sdk.core.response.model.AdInfo r1 = r4.mAdInfo
            java.lang.String r1 = com.kwad.sdk.core.response.b.a.au(r1)
            r0.setText(r1)
            com.kwad.components.ad.draw.b.b r0 = r4.dz
            com.kwad.components.ad.draw.c.a r0 = r0.dB
            com.kwad.components.core.video.l r1 = r4.mVideoPlayStateListener
            r0.a2(r1)
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r3) {
            r2 = this;
            android.view.ViewGroup r0 = r2.dN
            if (r3 != r0) goto Ld
            r2.aR()
            r3 = 0
            r0 = 2
            r2.a(r3, r0)
            return
        Ld:
            android.widget.TextView r0 = r2.dQ
            r1 = 1
            if (r3 != r0) goto L19
            r2.aR()
            r2.a(r1, r1)
            return
        L19:
            com.kwad.components.ad.draw.view.DrawDownloadProgressBar r0 = r2.dR
            if (r3 != r0) goto L20
            r2.a(r1, r1)
        L20:
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r2 = this;
            super.onCreate()
            int r0 = com.kwad.sdk.R.id.ksad_ad_normal_container
            android.view.View r0 = r2.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r2.dN = r0
            int r0 = com.kwad.sdk.R.id.ksad_ad_normal_title
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.dO = r0
            int r0 = com.kwad.sdk.R.id.ksad_ad_normal_des
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.dP = r0
            int r0 = com.kwad.sdk.R.id.ksad_ad_normal_logo
            android.view.View r0 = r2.findViewById(r0)
            com.kwad.components.core.widget.KsLogoView r0 = (com.kwad.components.core.widget.KsLogoView) r0
            r2.mLogoView = r0
            int r0 = com.kwad.sdk.R.id.ksad_ad_normal_convert_btn
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.dQ = r0
            int r0 = com.kwad.sdk.R.id.ksad_ad_light_convert_btn
            android.view.View r0 = r2.findViewById(r0)
            com.kwad.components.ad.draw.view.DrawDownloadProgressBar r0 = (com.kwad.components.ad.draw.view.DrawDownloadProgressBar) r0
            r2.dR = r0
            r1 = 16
            r0.setTextSize(r1)
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r2 = this;
            super.onUnbind()
            r2.aQ()
            com.kwad.components.core.e.d.c r0 = r2.mApkDownloadHelper
            if (r0 == 0) goto L11
            com.kwad.sdk.api.KsAppDownloadListener r1 = r2.dW
            if (r1 == 0) goto L11
            r0.c(r1)
        L11:
            com.kwad.components.ad.draw.b.b r0 = r2.dz
            com.kwad.components.ad.draw.c.a r0 = r0.dB
            com.kwad.components.core.video.l r1 = r2.mVideoPlayStateListener
            r0.b2(r1)
            return
    }
}
