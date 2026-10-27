package com.kwad.components.ad.interstitial.h;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c extends com.kwad.components.ad.interstitial.h.a {
    private com.kwad.sdk.api.KsAdVideoPlayConfig bU;
    protected com.kwad.sdk.api.KsInterstitialAd.AdInteractionListener kQ;
    private com.kwad.components.ad.interstitial.d kW;
    protected com.kwad.sdk.core.response.model.AdInfo mAdInfo;

    @androidx.annotation.NonNull
    protected com.kwad.sdk.core.response.model.AdResultData mAdResultData;

    @androidx.annotation.NonNull
    protected com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;
    protected com.kwad.components.ad.interstitial.f.c mj;
    private boolean mn;
    private com.kwad.components.ad.interstitial.f.c.a mo;
    private com.kwad.components.core.webview.tachikoma.f.g mq;
    private int mx;

    @androidx.annotation.Nullable
    protected com.kwad.components.ad.interstitial.f.b nW;
    private boolean nX;
    protected android.view.ViewGroup nY;


    public c(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    private c(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2) {
            r0 = this;
            r2 = 0
            r0.<init>(r1, r2)
            r2 = -1
            r0.mx = r2
            com.kwad.components.ad.interstitial.h.c$1 r2 = new com.kwad.components.ad.interstitial.h.c$1
            r2.<init>(r0)
            r0.mq = r2
            int r2 = r0.getLayoutId()
            android.view.View r1 = com.kwad.sdk.o.m.inflate(r1, r2, r0)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r0.nY = r1
            return
    }

    private com.kwad.components.ad.interstitial.h.d a(android.content.Context r4, com.kwad.sdk.core.response.model.AdInfo r5, com.kwad.components.ad.interstitial.f.c r6) {
            r3 = this;
            android.content.Context r0 = r3.mContext
            boolean r0 = com.kwad.components.ad.interstitial.f.c.a(r0, r5)
            com.kwad.components.ad.interstitial.h.d$a r1 = new com.kwad.components.ad.interstitial.h.d$a
            r1.<init>()
            r1.w(r0)
            boolean r6 = r6.M(r4)
            r0 = 0
            r2 = 1
            if (r6 != 0) goto L1e
            boolean r6 = com.kwad.components.ad.interstitial.b.b.dI()
            if (r6 == 0) goto L1e
            r6 = 1
            goto L1f
        L1e:
            r6 = 0
        L1f:
            r1.x(r6)
            int r6 = com.kwad.components.ad.interstitial.b.b.dJ()
            r1.R(r6)
            boolean r5 = com.kwad.sdk.core.response.b.a.aW(r5)
            if (r5 == 0) goto L35
            boolean r5 = com.kwad.sdk.utils.aq.QW()
            if (r5 != 0) goto L36
        L35:
            r0 = 1
        L36:
            r1.y(r0)
            com.kwad.components.ad.interstitial.h.d r5 = new com.kwad.components.ad.interstitial.h.d
            r5.<init>(r4, r1)
            return r5
    }

    static /* synthetic */ boolean a(com.kwad.components.ad.interstitial.h.c r0, boolean r1) {
            r1 = 0
            r0.nX = r1
            return r1
    }

    private com.kwad.components.ad.interstitial.f.c eY() {
            r4 = this;
            com.kwad.components.ad.interstitial.f.c r0 = new com.kwad.components.ad.interstitial.f.c
            r0.<init>()
            com.kwad.sdk.core.response.model.AdResultData r1 = r4.mAdResultData
            r0.a(r1)
            com.kwad.sdk.core.response.model.AdTemplate r1 = r4.mAdTemplate
            r0.setAdTemplate(r1)
            com.kwad.sdk.api.KsInterstitialAd$AdInteractionListener r1 = r4.kQ
            r0.kQ = r1
            com.kwad.components.ad.interstitial.d r1 = r4.kW
            r0.kW = r1
            com.kwad.components.core.e.d.c r1 = new com.kwad.components.core.e.d.c
            com.kwad.sdk.core.response.model.AdTemplate r2 = r4.mAdTemplate
            r1.<init>(r2)
            r0.mApkDownloadHelper = r1
            com.kwad.sdk.api.KsAdVideoPlayConfig r1 = r4.bU
            r0.bU = r1
            com.kwad.sdk.core.video.videoview.a r1 = new com.kwad.sdk.core.video.videoview.a
            android.content.Context r2 = r4.mContext
            r1.<init>(r2)
            r0.cq = r1
            android.view.ViewGroup r1 = r4.nY
            int r2 = com.kwad.sdk.R.id.ksad_container
            android.view.View r1 = r1.findViewById(r2)
            com.kwad.sdk.widget.KSFrameLayout r1 = (com.kwad.sdk.widget.KSFrameLayout) r1
            r0.fV = r1
            com.kwad.components.ad.interstitial.g.b r2 = new com.kwad.components.ad.interstitial.g.b
            int r3 = com.kwad.sdk.core.config.e.Fb()
            r2.<init>(r1, r3)
            r0.kO = r2
            r2.wi()
            int r1 = r4.mx
            r0.mx = r1
            boolean r1 = r4.mn
            r0.mn = r1
            com.kwad.components.ad.interstitial.f.c$a r1 = r4.mo
            r0.mo = r1
            com.kwad.components.core.webview.tachikoma.f.g r1 = r4.mq
            r0.mq = r1
            com.kwad.sdk.core.response.model.AdTemplate r1 = r4.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r1 = com.kwad.sdk.core.response.b.e.el(r1)
            android.content.Context r2 = r4.mContext
            com.kwad.components.ad.interstitial.h.d r1 = r4.a(r2, r1, r0)
            r0.mk = r1
            return r0
    }

    @Override // com.kwad.components.ad.interstitial.h.a
    public final void a(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdResultData r3, com.kwad.components.ad.interstitial.d r4, @androidx.annotation.NonNull com.kwad.sdk.api.KsAdVideoPlayConfig r5, com.kwad.sdk.api.KsInterstitialAd.AdInteractionListener r6, int r7) {
            r2 = this;
            java.util.List r0 = r3.getAdTemplateList()
            if (r0 == 0) goto L15
            int r1 = r0.size()
            if (r7 >= r1) goto L15
            java.lang.Object r7 = r0.get(r7)
            com.kwad.sdk.core.response.model.AdTemplate r7 = (com.kwad.sdk.core.response.model.AdTemplate) r7
            r2.mAdTemplate = r7
            goto L1b
        L15:
            com.kwad.sdk.core.response.model.AdTemplate r7 = com.kwad.sdk.core.response.b.c.r(r3)
            r2.mAdTemplate = r7
        L1b:
            com.kwad.sdk.core.response.model.AdTemplate r7 = r2.mAdTemplate
            com.kwad.sdk.core.response.model.AdResultData r3 = com.kwad.sdk.core.response.b.c.a(r3, r7)
            r2.mAdResultData = r3
            com.kwad.sdk.core.response.model.AdTemplate r3 = r2.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r3 = com.kwad.sdk.core.response.b.e.el(r3)
            r2.mAdInfo = r3
            com.kwad.sdk.core.response.model.AdTemplate r3 = r2.mAdTemplate
            r7 = 2
            r3.realShowType = r7
            r2.bU = r5
            r2.kW = r4
            boolean r3 = com.kwad.sdk.core.response.b.b.di(r3)
            r2.nX = r3
            r2.kQ = r6
            com.kwad.components.ad.interstitial.f.c r3 = r2.eY()
            r2.mj = r3
            com.kwad.components.ad.interstitial.f.b r3 = r2.nW
            if (r3 != 0) goto L4c
            com.kwad.components.ad.interstitial.f.b r3 = r2.eZ()
            r2.nW = r3
        L4c:
            com.kwad.components.ad.interstitial.f.b r3 = r2.nW
            android.view.ViewGroup r4 = r2.nY
            r3.K(r4)
            com.kwad.components.ad.interstitial.f.b r3 = r2.nW
            com.kwad.components.ad.interstitial.f.c r4 = r2.mj
            r3.n(r4)
            return
    }

    @Override // com.kwad.components.ad.interstitial.h.a
    public final void dA() {
            r1 = this;
            com.kwad.components.ad.interstitial.f.b r0 = r1.nW
            if (r0 == 0) goto L7
            r0.dR()
        L7:
            return
    }

    @Override // com.kwad.components.ad.interstitial.h.a
    public final void dB() {
            r1 = this;
            com.kwad.components.ad.interstitial.f.b r0 = r1.nW
            if (r0 == 0) goto L7
            r0.dS()
        L7:
            return
    }

    @androidx.annotation.NonNull
    public final com.kwad.components.ad.interstitial.f.b eZ() {
            r3 = this;
            com.kwad.components.ad.interstitial.f.b r0 = new com.kwad.components.ad.interstitial.f.b
            r0.<init>()
            boolean r1 = r3.nX
            if (r1 == 0) goto L12
            com.kwad.components.ad.interstitial.f.a.b r1 = new com.kwad.components.ad.interstitial.f.a.b
            r1.<init>()
            r0.a(r1)
            return r0
        L12:
            com.kwad.sdk.core.response.model.AdInfo r1 = r3.mAdInfo
            boolean r1 = com.kwad.sdk.core.response.b.a.bc(r1)
            if (r1 == 0) goto L22
            com.kwad.components.ad.interstitial.f.f r1 = new com.kwad.components.ad.interstitial.f.f
            r1.<init>()
            r0.a(r1)
        L22:
            com.kwad.components.ad.interstitial.f.g r1 = new com.kwad.components.ad.interstitial.f.g
            r1.<init>()
            r0.a(r1)
            com.kwad.components.ad.interstitial.f.d r1 = new com.kwad.components.ad.interstitial.f.d
            r1.<init>()
            r0.a(r1)
            com.kwad.sdk.core.response.model.AdInfo r1 = r3.mAdInfo
            boolean r1 = com.kwad.sdk.core.response.b.a.aP(r1)
            if (r1 == 0) goto L42
            com.kwad.components.ad.interstitial.f.a r1 = new com.kwad.components.ad.interstitial.f.a
            r1.<init>()
            r0.a(r1)
        L42:
            com.kwad.components.ad.interstitial.f.c r1 = r3.mj
            android.content.Context r2 = r3.getContext()
            boolean r1 = r1.M(r2)
            if (r1 == 0) goto L56
            com.kwad.components.ad.interstitial.f.e r1 = new com.kwad.components.ad.interstitial.f.e
            r1.<init>()
            r0.a(r1)
        L56:
            return r0
    }

    public final void fa() {
            r2 = this;
            com.kwad.components.ad.interstitial.f.c r0 = r2.mj
            if (r0 == 0) goto Lb
            boolean r1 = r0.mv
            if (r1 == 0) goto Lb
            r0.dT()
        Lb:
            return
    }

    public final void fb() {
            r2 = this;
            com.kwad.components.ad.interstitial.f.c r0 = r2.mj
            if (r0 == 0) goto Lf
            boolean r1 = r2.nX
            if (r1 != 0) goto Lc
            boolean r1 = r0.mv
            if (r1 == 0) goto Lf
        Lc:
            r0.dU()
        Lf:
            return
    }

    public final void fc() {
            r2 = this;
            com.kwad.components.ad.interstitial.f.c r0 = r2.mj
            if (r0 == 0) goto L22
            com.kwad.components.ad.interstitial.f.c$c r0 = new com.kwad.components.ad.interstitial.f.c$c
            android.content.Context r1 = r2.mContext
            r0.<init>(r1)
            r1 = 1
            com.kwad.components.ad.interstitial.f.c$c r0 = r0.l(r1)
            com.kwad.components.ad.interstitial.f.c$c r0 = r0.M(r1)
            com.kwad.components.ad.interstitial.f.c$c r0 = r0.n(r1)
            r1 = 2
            com.kwad.components.ad.interstitial.f.c$c r0 = r0.L(r1)
            com.kwad.components.ad.interstitial.f.c r1 = r2.mj
            r1.a(r0)
        L22:
            return
    }

    public final boolean fd() {
            r1 = this;
            com.kwad.components.ad.interstitial.f.c r0 = r1.mj
            if (r0 == 0) goto L7
            boolean r0 = r0.mw
            return r0
        L7:
            r0 = 0
            return r0
    }

    protected final int getLayoutId() {
            r1 = this;
            int r0 = com.kwad.sdk.R.layout.ksad_interstitial
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            com.kwad.components.ad.interstitial.f.c r0 = r1.mj
            if (r0 == 0) goto La
            r0.release()
        La:
            com.kwad.components.ad.interstitial.f.b r0 = r1.nW
            if (r0 == 0) goto L11
            r0.destroy()
        L11:
            return
    }

    public final void setAdAggregateClickActionListener(com.kwad.components.ad.interstitial.f.c.a r2) {
            r1 = this;
            r1.mo = r2
            com.kwad.components.ad.interstitial.f.c r0 = r1.mj
            if (r0 == 0) goto L8
            r0.mo = r2
        L8:
            return
    }

    @Override // com.kwad.components.ad.interstitial.h.a
    public final void setAdInteractionListener(com.kwad.sdk.api.KsInterstitialAd.AdInteractionListener r2) {
            r1 = this;
            r1.kQ = r2
            com.kwad.components.ad.interstitial.f.c r0 = r1.mj
            if (r0 == 0) goto L8
            r0.kQ = r2
        L8:
            return
    }

    public final void setAggregateAdView(boolean r2) {
            r1 = this;
            r1.mn = r2
            com.kwad.components.ad.interstitial.f.c r0 = r1.mj
            if (r0 == 0) goto L8
            r0.mn = r2
        L8:
            return
    }

    public final void setAggregateShowTriggerType(int r2) {
            r1 = this;
            r1.mx = r2
            com.kwad.components.ad.interstitial.f.c r0 = r1.mj
            if (r0 == 0) goto L8
            r0.mx = r2
        L8:
            return
    }
}
