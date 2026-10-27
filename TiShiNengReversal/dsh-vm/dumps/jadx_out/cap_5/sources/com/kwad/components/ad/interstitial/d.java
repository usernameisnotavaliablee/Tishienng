package com.kwad.components.ad.interstitial;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class d extends com.kwad.components.core.proxy.g {
    private com.kwad.components.ad.interstitial.h.a kM;
    private boolean kN;
    private com.kwad.components.ad.interstitial.g.b kO;

    @androidx.annotation.NonNull
    private final com.kwad.sdk.api.KsAdVideoPlayConfig kP;
    private com.kwad.sdk.api.KsInterstitialAd.AdInteractionListener kQ;
    private final com.kwad.components.core.widget.g kR;
    private final com.kwad.sdk.core.response.model.AdResultData mAdResultData;
    private final com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;
    private com.kwad.sdk.utils.bv mTimerHelper;



    public d(@androidx.annotation.NonNull android.app.Activity r1, @androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdResultData r2, com.kwad.sdk.api.KsVideoPlayConfig r3, com.kwad.sdk.api.KsInterstitialAd.AdInteractionListener r4) {
            r0 = this;
            r0.<init>(r1)
            com.kwad.components.ad.interstitial.d$1 r1 = new com.kwad.components.ad.interstitial.d$1
            r1.<init>(r0)
            r0.kR = r1
            r0.kQ = r4
            com.kwad.sdk.api.KsAdVideoPlayConfig$Builder r1 = new com.kwad.sdk.api.KsAdVideoPlayConfig$Builder
            r1.<init>()
            if (r3 == 0) goto L1b
            boolean r3 = r3.isVideoSoundEnable()
            if (r3 == 0) goto L1b
            r3 = 1
            goto L1c
        L1b:
            r3 = 0
        L1c:
            com.kwad.sdk.api.KsAdVideoPlayConfig$Builder r1 = r1.videoSoundEnable(r3)
            boolean r3 = com.kwad.components.ad.interstitial.b.b.dH()
            com.kwad.sdk.api.KsAdVideoPlayConfig$Builder r1 = r1.dataFlowAutoStart(r3)
            com.kwad.sdk.api.KsAdVideoPlayConfig r1 = r1.build()
            r0.kP = r1
            r0.mAdResultData = r2
            com.kwad.sdk.core.response.model.AdTemplate r1 = com.kwad.sdk.core.response.b.c.r(r2)
            r0.mAdTemplate = r1
            return
    }

    static /* synthetic */ boolean a(com.kwad.components.ad.interstitial.d r0) {
            boolean r0 = r0.kN
            return r0
    }

    static /* synthetic */ android.app.Activity b(com.kwad.components.ad.interstitial.d r0) {
            android.app.Activity r0 = r0.mActivity
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate c(com.kwad.components.ad.interstitial.d r0) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ void d(com.kwad.components.ad.interstitial.d r0) {
            r0.dx()
            return
    }

    private void dx() {
            r8 = this;
            com.kwad.sdk.core.response.model.AdResultData r0 = r8.mAdResultData
            boolean r0 = e(r0)
            if (r0 == 0) goto L11
            com.kwad.components.ad.interstitial.aggregate.b r0 = new com.kwad.components.ad.interstitial.aggregate.b
            android.content.Context r1 = r8.mContext
            r0.<init>(r1)
        Lf:
            r2 = r0
            goto L19
        L11:
            com.kwad.components.ad.interstitial.h.c r0 = new com.kwad.components.ad.interstitial.h.c
            android.content.Context r1 = r8.mContext
            r0.<init>(r1)
            goto Lf
        L19:
            r8.kM = r2
            com.kwad.sdk.core.response.model.AdResultData r3 = r8.mAdResultData
            com.kwad.sdk.api.KsAdVideoPlayConfig r5 = r8.kP
            com.kwad.sdk.api.KsInterstitialAd$AdInteractionListener r6 = r8.kQ
            r7 = 0
            r4 = r8
            r2.a(r3, r4, r5, r6, r7)
            android.view.ViewGroup r0 = r4.CC
            r0.removeAllViews()
            android.view.ViewGroup r0 = r4.CC
            com.kwad.components.ad.interstitial.h.a r1 = r4.kM
            r0.addView(r1)
            r8.dy()
            return
    }

    private void dy() {
            r3 = this;
            com.kwad.components.ad.interstitial.g.b r0 = new com.kwad.components.ad.interstitial.g.b
            com.kwad.components.ad.interstitial.h.a r1 = r3.kM
            r2 = 100
            r0.<init>(r1, r2)
            r3.kO = r0
            com.kwad.components.ad.interstitial.d$2 r1 = new com.kwad.components.ad.interstitial.d$2
            r1.<init>(r3)
            r0.a(r1)
            com.kwad.components.ad.interstitial.g.b r0 = r3.kO
            r0.wi()
            return
    }

    private static boolean e(com.kwad.sdk.core.response.model.AdResultData r0) {
            boolean r0 = com.kwad.sdk.core.response.b.c.u(r0)
            return r0
    }

    @Override // com.kwad.components.core.proxy.g, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
            r3 = this;
            super.dismiss()     // Catch: java.lang.Throwable -> L12
            com.kwad.sdk.a.a.c r0 = com.kwad.sdk.a.a.c.CU()     // Catch: java.lang.Throwable -> L12
            r0.CX()     // Catch: java.lang.Throwable -> L12
            com.kwad.sdk.api.KsInterstitialAd$AdInteractionListener r0 = r3.kQ     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            r0.onPageDismiss()     // Catch: java.lang.Throwable -> L12
            goto L14
        L12:
            r0 = move-exception
            goto L52
        L14:
            com.kwad.components.ad.interstitial.h.a r0 = r3.kM     // Catch: java.lang.Throwable -> L12
            boolean r1 = r0 instanceof com.kwad.components.ad.interstitial.h.c     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L45
            com.kwad.components.ad.interstitial.h.c r0 = (com.kwad.components.ad.interstitial.h.c) r0     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.fd()     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L45
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate     // Catch: java.lang.Throwable -> L12
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)     // Catch: java.lang.Throwable -> L12
            boolean r0 = com.kwad.sdk.core.response.b.a.cS(r0)     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L45
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate     // Catch: java.lang.Throwable -> L12
            com.kwad.sdk.utils.bv r1 = r3.getTimerHelper()     // Catch: java.lang.Throwable -> L12
            long r1 = r1.getTime()     // Catch: java.lang.Throwable -> L12
            float r1 = (float) r1     // Catch: java.lang.Throwable -> L12
            r2 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 / r2
            double r1 = (double) r1     // Catch: java.lang.Throwable -> L12
            double r1 = java.lang.Math.ceil(r1)     // Catch: java.lang.Throwable -> L12
            int r1 = (int) r1     // Catch: java.lang.Throwable -> L12
            com.kwad.sdk.core.adlog.c.m(r0, r1)     // Catch: java.lang.Throwable -> L12
        L45:
            com.kwad.components.core.e.a.h.oR()     // Catch: java.lang.Throwable -> L12
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate     // Catch: java.lang.Throwable -> L12
            com.kwai.adclient.kscommerciallogger.model.BusinessType r0 = com.kwad.sdk.commercial.d.be(r0)     // Catch: java.lang.Throwable -> L12
            com.kwad.components.core.g.a.a(r0)     // Catch: java.lang.Throwable -> L12
            return
        L52:
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r0)
            return
    }

    @Override // com.kwad.components.core.proxy.g
    public final float dv() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.kwad.components.core.proxy.g
    public final android.view.ViewGroup dw() {
            r2 = this;
            com.kwad.components.core.widget.f r0 = new com.kwad.components.core.widget.f
            android.content.Context r1 = r2.mContext
            r0.<init>(r1)
            com.kwad.components.core.widget.g r1 = r2.kR
            r0.setOrientationChangeListener(r1)
            return r0
    }

    @Override // com.kwad.components.core.proxy.g
    public final int getLayoutId() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final com.kwad.sdk.utils.bv getTimerHelper() {
            r1 = this;
            com.kwad.sdk.utils.bv r0 = r1.mTimerHelper
            if (r0 != 0) goto Lb
            com.kwad.sdk.utils.bv r0 = new com.kwad.sdk.utils.bv
            r0.<init>()
            r1.mTimerHelper = r0
        Lb:
            com.kwad.sdk.utils.bv r0 = r1.mTimerHelper
            return r0
    }

    @Override // com.kwad.components.core.proxy.g
    public final void h(android.view.View r2) {
            r1 = this;
            android.view.Window r2 = r1.getWindow()
            com.kwad.components.core.e.a.h.a(r2)
            r1.dx()
            com.kwad.components.ad.interstitial.report.c r2 = com.kwad.components.ad.interstitial.report.c.eS()
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            r2.A(r0)
            com.kwad.sdk.core.response.model.AdTemplate r2 = r1.mAdTemplate
            com.kwad.sdk.commercial.d.c.bL(r2)
            return
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
            r1 = this;
            boolean r0 = com.kwad.components.ad.interstitial.b.b.dL()
            if (r0 == 0) goto L9
            super.onBackPressed()
        L9:
            return
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            com.kwad.components.ad.interstitial.g.b r0 = r1.kO
            if (r0 == 0) goto La
            r0.release()
        La:
            return
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean r2) {
            r1 = this;
            super.onWindowFocusChanged(r2)
            r1.kN = r2
            com.kwad.components.ad.interstitial.h.a r0 = r1.kM
            if (r0 == 0) goto L12
            if (r2 == 0) goto Lf
            r0.dA()
            return
        Lf:
            r0.dB()
        L12:
            return
    }

    public final void setAdInteractionListener(com.kwad.sdk.api.KsInterstitialAd.AdInteractionListener r2) {
            r1 = this;
            r1.kQ = r2
            com.kwad.components.ad.interstitial.h.a r0 = r1.kM
            if (r0 == 0) goto L9
            r0.setAdInteractionListener(r2)
        L9:
            return
    }
}
