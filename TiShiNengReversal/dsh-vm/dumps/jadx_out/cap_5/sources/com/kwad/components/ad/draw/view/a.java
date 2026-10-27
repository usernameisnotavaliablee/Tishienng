package com.kwad.components.ad.draw.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a extends com.kwad.sdk.widget.KSFrameLayout implements android.view.View.OnClickListener {
    private java.util.List<java.lang.Integer> ck;
    private com.kwad.components.offline.api.core.adlive.IAdLivePlayModule dC;
    private com.kwad.sdk.api.KsDrawAd.AdInteractionListener dh;
    private com.kwad.sdk.core.j.b dn;
    private com.kwad.components.ad.draw.b.b dz;
    private final com.kwad.components.offline.api.core.adlive.listener.AdLivePlayStateListener eh;
    private java.lang.String fA;
    private com.kwad.components.core.widget.KsLogoView fB;
    private com.kwad.sdk.widget.KSFrameLayout fC;
    private com.kwad.components.core.k.a.b fD;
    private int fE;
    private android.view.View fF;
    private long fG;
    private boolean fH;
    private java.lang.Runnable fI;
    private com.kwad.components.core.widget.a.b fg;
    private boolean fj;
    private final com.kwad.sdk.core.j.c fo;
    private com.kwad.components.offline.api.core.adlive.IAdLiveOfflineView fq;
    private com.kwad.components.core.o.a.b.a fr;
    private boolean fs;
    private com.kwad.components.ad.draw.presenter.livecard.KsLiveAuthorView ft;
    private android.widget.TextView fu;
    private android.widget.TextView fv;
    private android.widget.TextView fw;
    private com.kwad.components.core.widget.KsLogoView fx;
    private android.view.View fy;
    private android.view.ViewGroup fz;
    private com.kwad.sdk.core.response.model.AdInfo mAdInfo;

    @androidx.annotation.NonNull
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;
    private android.content.Context mContext;
    private com.kwad.sdk.mvp.Presenter mPresenter;
    private com.kwad.sdk.core.view.AdBaseFrameLayout mRootContainer;
    private com.kwad.sdk.utils.bv mTimerHelper;







    public a(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r3) {
            r1 = this;
            r1.<init>(r2)
            r0 = -1
            r1.fE = r0
            com.kwad.components.ad.draw.view.a$2 r0 = new com.kwad.components.ad.draw.view.a$2
            r0.<init>(r1)
            r1.fo = r0
            com.kwad.components.ad.draw.view.a$4 r0 = new com.kwad.components.ad.draw.view.a$4
            r0.<init>(r1)
            r1.fI = r0
            com.kwad.components.ad.draw.view.a$5 r0 = new com.kwad.components.ad.draw.view.a$5
            r0.<init>(r1)
            r1.eh = r0
            r1.mContext = r2
            r1.mAdTemplate = r3
            com.kwad.sdk.core.response.model.AdInfo r2 = com.kwad.sdk.core.response.b.e.el(r3)
            r1.mAdInfo = r2
            java.lang.Class<com.kwad.components.core.o.a.b.a> r2 = com.kwad.components.core.o.a.b.a.class
            com.kwad.sdk.components.b r2 = com.kwad.sdk.components.d.f(r2)
            com.kwad.components.core.o.a.b.a r2 = (com.kwad.components.core.o.a.b.a) r2
            r1.fr = r2
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            android.content.Context r3 = r1.mContext
            android.app.Activity r3 = com.kwad.sdk.o.m.ej(r3)
            r2.<init>(r3)
            com.kwad.sdk.core.c.b.Ho()
            com.kwad.components.ad.draw.view.a$1 r3 = new com.kwad.components.ad.draw.view.a$1
            r3.<init>(r1, r2)
            com.kwad.sdk.core.c.b.a(r3)
            r1.initView()
            r1.bx()
            r1.bw()
            r1.bv()
            return
    }

    static /* synthetic */ com.kwad.components.offline.api.core.adlive.IAdLivePlayModule a(com.kwad.components.ad.draw.view.a r0, com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r1) {
            r0.dC = r1
            return r1
    }

    static /* synthetic */ void a(com.kwad.components.ad.draw.view.a r0) {
            r0.bB()
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.draw.view.a r0, long r1) {
            r0.c(r1)
            return
    }

    static /* synthetic */ boolean a(com.kwad.components.ad.draw.view.a r0, boolean r1) {
            r0.fH = r1
            return r1
    }

    static /* synthetic */ com.kwad.components.offline.api.core.adlive.IAdLivePlayModule b(com.kwad.components.ad.draw.view.a r0) {
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r0 = r0.dC
            return r0
    }

    private com.kwad.components.offline.api.core.adlive.IAdLivePlayModule bA() {
            r12 = this;
            r1 = 0
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r0 = r12.dC     // Catch: java.lang.Throwable -> L84
            if (r0 == 0) goto L6
            return r0
        L6:
            com.kwad.components.core.o.a.b.a r0 = r12.fr     // Catch: java.lang.Throwable -> L84
            if (r0 == 0) goto L94
            boolean r0 = r0.qu()     // Catch: java.lang.Throwable -> L84
            if (r0 == 0) goto L94
            com.kwad.sdk.core.response.model.AdTemplate r0 = r12.mAdTemplate     // Catch: java.lang.Throwable -> L84
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)     // Catch: java.lang.Throwable -> L84
            boolean r0 = com.kwad.sdk.core.response.b.a.cR(r0)     // Catch: java.lang.Throwable -> L84
            if (r0 == 0) goto L94
            com.kwad.sdk.core.response.model.AdInfo r0 = r12.mAdInfo     // Catch: java.lang.Throwable -> L84
            int r0 = com.kwad.sdk.core.response.b.a.bg(r0)     // Catch: java.lang.Throwable -> L84
            r2 = 8
            r3 = 0
            if (r0 != r2) goto L29
            r0 = 1
            goto L2a
        L29:
            r0 = 0
        L2a:
            com.kwad.components.core.o.a.b.a r2 = r12.fr     // Catch: java.lang.Throwable -> L84
            android.content.Context r4 = r12.mContext     // Catch: java.lang.Throwable -> L84
            com.kwad.components.offline.api.core.adlive.IAdLiveOfflineView r6 = com.kwad.components.ad.j.c.a(r2, r4, r0)     // Catch: java.lang.Throwable -> L84
            r12.fq = r6     // Catch: java.lang.Throwable -> L84
            if (r6 != 0) goto L37
            return r1
        L37:
            com.kwad.components.core.o.a.b.a r5 = r12.fr     // Catch: java.lang.Throwable -> L84
            com.kwad.sdk.api.SdkConfig r0 = com.kwad.sdk.service.ServiceProvider.getSDKConfig()     // Catch: java.lang.Throwable -> L84
            java.lang.String r7 = r0.appId     // Catch: java.lang.Throwable -> L84
            com.kwad.sdk.core.response.model.AdInfo r0 = r12.mAdInfo     // Catch: java.lang.Throwable -> L84
            long r8 = com.kwad.sdk.core.response.b.a.cp(r0)     // Catch: java.lang.Throwable -> L84
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> L84
            com.kwad.sdk.core.response.model.AdInfo r0 = r12.mAdInfo     // Catch: java.lang.Throwable -> L84
            java.lang.String r9 = com.kwad.sdk.core.response.b.a.cq(r0)     // Catch: java.lang.Throwable -> L84
            com.kwad.sdk.core.response.model.AdInfo r0 = r12.mAdInfo     // Catch: java.lang.Throwable -> L84
            long r10 = com.kwad.sdk.core.response.b.a.cr(r0)     // Catch: java.lang.Throwable -> L84
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r0 = r5.getAdLivePlayModule(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L84
            boolean r2 = r12.isVideoSoundEnable()     // Catch: java.lang.Throwable -> L84
            r0.setAudioEnabled(r2, r3)     // Catch: java.lang.Throwable -> L84
            com.kwad.components.offline.api.core.adlive.listener.AdLivePlayStateListener r2 = r12.eh     // Catch: java.lang.Throwable -> L84
            r0.registerAdLivePlayStateListener(r2)     // Catch: java.lang.Throwable -> L84
            com.kwad.components.offline.api.core.adlive.IAdLiveOfflineView r2 = r12.fq     // Catch: java.lang.Throwable -> L84
            android.view.View r2 = r2.getView()     // Catch: java.lang.Throwable -> L84
            com.kwad.sdk.widget.KSFrameLayout r3 = r12.fC     // Catch: java.lang.Throwable -> L84
            java.lang.Object r3 = r3.getTag()     // Catch: java.lang.Throwable -> L84
            if (r3 == 0) goto L86
            com.kwad.sdk.widget.KSFrameLayout r3 = r12.fC     // Catch: java.lang.Throwable -> L84
            java.lang.Object r4 = r3.getTag()     // Catch: java.lang.Throwable -> L84
            android.view.View r4 = (android.view.View) r4     // Catch: java.lang.Throwable -> L84
            r3.removeView(r4)     // Catch: java.lang.Throwable -> L84
            com.kwad.sdk.widget.KSFrameLayout r3 = r12.fC     // Catch: java.lang.Throwable -> L84
            r3.setTag(r1)     // Catch: java.lang.Throwable -> L84
            goto L86
        L84:
            r0 = move-exception
            goto L91
        L86:
            com.kwad.sdk.widget.KSFrameLayout r3 = r12.fC     // Catch: java.lang.Throwable -> L84
            r3.addView(r2)     // Catch: java.lang.Throwable -> L84
            com.kwad.sdk.widget.KSFrameLayout r3 = r12.fC     // Catch: java.lang.Throwable -> L84
            r3.setTag(r2)     // Catch: java.lang.Throwable -> L84
            return r0
        L91:
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r0)
        L94:
            return r1
    }

    private void bB() {
            r2 = this;
            com.kwad.components.core.widget.a.b r0 = r2.fg
            if (r0 == 0) goto L7
            r0.release()
        L7:
            com.kwad.components.ad.draw.b.b r0 = r2.dz
            if (r0 == 0) goto Le
            r0.release()
        Le:
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r0 = r2.dC
            r1 = 0
            if (r0 == 0) goto L15
            r2.dC = r1
        L15:
            com.kwad.components.offline.api.core.adlive.IAdLiveOfflineView r0 = r2.fq
            if (r0 == 0) goto L1b
            r2.fq = r1
        L1b:
            com.kwad.sdk.mvp.Presenter r0 = r2.mPresenter
            if (r0 == 0) goto L22
            r0.destroy()
        L22:
            com.kwad.components.core.k.a r0 = com.kwad.components.core.k.a.qp()
            com.kwad.components.core.k.a$b r1 = r2.fD
            r0.c(r1)
            return
    }

    private com.kwad.components.ad.draw.b.b bC() {
            r3 = this;
            com.kwad.components.ad.draw.b.b r0 = new com.kwad.components.ad.draw.b.b
            r0.<init>()
            com.kwad.sdk.api.KsDrawAd$AdInteractionListener r1 = r3.dh
            r0.dh = r1
            com.kwad.sdk.core.view.AdBaseFrameLayout r1 = r3.mRootContainer
            r0.mRootContainer = r1
            com.kwad.sdk.core.response.model.AdTemplate r1 = r3.mAdTemplate
            r0.mAdTemplate = r1
            com.kwad.sdk.core.response.model.AdInfo r1 = r3.mAdInfo
            boolean r1 = com.kwad.sdk.core.response.b.a.aF(r1)
            if (r1 == 0) goto L26
            com.kwad.components.core.e.d.c r1 = r0.mApkDownloadHelper
            if (r1 != 0) goto L26
            com.kwad.components.core.e.d.c r1 = new com.kwad.components.core.e.d.c
            com.kwad.sdk.core.response.model.AdTemplate r2 = r3.mAdTemplate
            r1.<init>(r2)
            r0.mApkDownloadHelper = r1
        L26:
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r1 = r3.dC
            if (r1 != 0) goto L30
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r1 = r3.bA()
            r3.dC = r1
        L30:
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r1 = r3.dC
            r0.dC = r1
            com.kwad.components.offline.api.core.adlive.IAdLiveOfflineView r1 = r3.fq
            r0.dD = r1
            com.kwad.components.ad.draw.presenter.b.a r1 = new com.kwad.components.ad.draw.presenter.b.a
            com.kwad.sdk.core.response.model.AdTemplate r2 = r3.mAdTemplate
            r1.<init>(r2)
            r0.dE = r1
            return r0
    }

    private static com.kwad.sdk.mvp.Presenter bD() {
            com.kwad.sdk.mvp.Presenter r0 = new com.kwad.sdk.mvp.Presenter
            r0.<init>()
            com.kwad.components.ad.draw.presenter.b r1 = new com.kwad.components.ad.draw.presenter.b
            r1.<init>()
            r0.a(r1)
            com.kwad.components.ad.draw.presenter.livecard.b r1 = new com.kwad.components.ad.draw.presenter.livecard.b
            r1.<init>()
            r0.a(r1)
            com.kwad.components.ad.draw.presenter.livecard.a r1 = new com.kwad.components.ad.draw.presenter.livecard.a
            r1.<init>()
            r0.a(r1)
            return r0
    }

    private void bv() {
            r1 = this;
            android.view.ViewGroup r0 = r1.fz
            r0.setOnClickListener(r1)
            android.widget.TextView r0 = r1.fw
            r0.setOnClickListener(r1)
            com.kwad.components.ad.draw.presenter.livecard.KsLiveAuthorView r0 = r1.ft
            r0.setOnClickListener(r1)
            android.widget.TextView r0 = r1.fv
            r0.setOnClickListener(r1)
            android.widget.TextView r0 = r1.fu
            r0.setOnClickListener(r1)
            com.kwad.sdk.core.view.AdBaseFrameLayout r0 = r1.mRootContainer
            r0.setOnClickListener(r1)
            return
    }

    private void bw() {
            r2 = this;
            android.view.ViewGroup r0 = r2.fz     // Catch: java.lang.Throwable -> L4e
            if (r0 != 0) goto L5
            goto L50
        L5:
            int r1 = com.kwad.sdk.R.id.ksad_live_author_icon     // Catch: java.lang.Throwable -> L4e
            android.view.View r0 = r0.findViewById(r1)     // Catch: java.lang.Throwable -> L4e
            com.kwad.components.ad.draw.presenter.livecard.KsLiveAuthorView r0 = (com.kwad.components.ad.draw.presenter.livecard.KsLiveAuthorView) r0     // Catch: java.lang.Throwable -> L4e
            r2.ft = r0     // Catch: java.lang.Throwable -> L4e
            android.view.ViewGroup r0 = r2.fz     // Catch: java.lang.Throwable -> L4e
            int r1 = com.kwad.sdk.R.id.kwad_actionbar_title     // Catch: java.lang.Throwable -> L4e
            android.view.View r0 = r0.findViewById(r1)     // Catch: java.lang.Throwable -> L4e
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch: java.lang.Throwable -> L4e
            r2.fu = r0     // Catch: java.lang.Throwable -> L4e
            android.view.ViewGroup r0 = r2.fz     // Catch: java.lang.Throwable -> L4e
            int r1 = com.kwad.sdk.R.id.kwad_actionbar_des_text     // Catch: java.lang.Throwable -> L4e
            android.view.View r0 = r0.findViewById(r1)     // Catch: java.lang.Throwable -> L4e
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch: java.lang.Throwable -> L4e
            r2.fv = r0     // Catch: java.lang.Throwable -> L4e
            android.view.ViewGroup r0 = r2.fz     // Catch: java.lang.Throwable -> L4e
            int r1 = com.kwad.sdk.R.id.ksad_live_actionbar_btn     // Catch: java.lang.Throwable -> L4e
            android.view.View r0 = r0.findViewById(r1)     // Catch: java.lang.Throwable -> L4e
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch: java.lang.Throwable -> L4e
            r2.fw = r0     // Catch: java.lang.Throwable -> L4e
            android.view.ViewGroup r0 = r2.fz     // Catch: java.lang.Throwable -> L4e
            int r1 = com.kwad.sdk.R.id.ksad_draw_live_kwai_logo     // Catch: java.lang.Throwable -> L4e
            android.view.View r0 = r0.findViewById(r1)     // Catch: java.lang.Throwable -> L4e
            com.kwad.components.core.widget.KsLogoView r0 = (com.kwad.components.core.widget.KsLogoView) r0     // Catch: java.lang.Throwable -> L4e
            r2.fx = r0     // Catch: java.lang.Throwable -> L4e
            boolean r0 = r2.fs     // Catch: java.lang.Throwable -> L4e
            if (r0 != 0) goto L50
            android.view.ViewGroup r0 = r2.fz     // Catch: java.lang.Throwable -> L4e
            int r1 = com.kwad.sdk.R.id.ksad_draw_origin_live_relative     // Catch: java.lang.Throwable -> L4e
            android.view.View r0 = r0.findViewById(r1)     // Catch: java.lang.Throwable -> L4e
            r2.fy = r0     // Catch: java.lang.Throwable -> L4e
            return
        L4e:
            r0 = move-exception
            goto L51
        L50:
            return
        L51:
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r0)
            return
    }

    private void bx() {
            r2 = this;
            com.kwad.sdk.core.view.AdBaseFrameLayout r0 = r2.mRootContainer
            if (r0 != 0) goto L5
            return
        L5:
            com.kwad.sdk.core.response.model.AdInfo r0 = r2.mAdInfo
            int r0 = com.kwad.sdk.core.response.b.a.bg(r0)
            r1 = 8
            if (r1 != r0) goto L25
            com.kwad.sdk.core.view.AdBaseFrameLayout r0 = r2.mRootContainer
            int r1 = com.kwad.sdk.R.id.ksad_draw_live_shop_stub
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            android.view.View r0 = r0.inflate()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r2.fz = r0
            r0 = 1
            r2.fs = r0
            goto L3a
        L25:
            com.kwad.sdk.core.view.AdBaseFrameLayout r0 = r2.mRootContainer
            int r1 = com.kwad.sdk.R.id.ksad_draw_live_base_stub
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            android.view.View r0 = r0.inflate()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r2.fz = r0
            r0 = 0
            r2.fs = r0
        L3a:
            android.view.ViewGroup r0 = r2.fz
            r1 = 4
            r0.setVisibility(r1)
            return
    }

    private void bz() {
            r4 = this;
            android.widget.TextView r0 = r4.fu
            com.kwad.sdk.core.response.model.AdInfo r1 = r4.mAdInfo
            java.lang.String r1 = com.kwad.sdk.core.response.b.a.cl(r1)
            r0.setText(r1)
            com.kwad.components.core.widget.e r0 = new com.kwad.components.core.widget.e
            r0.<init>()
            com.kwad.components.ad.draw.presenter.livecard.KsLiveAuthorView r1 = r4.ft
            r2 = 0
            r1.setVisibility(r2)
            com.kwad.components.ad.draw.presenter.livecard.KsLiveAuthorView r1 = r4.ft
            com.kwad.sdk.core.response.model.AdTemplate r3 = r4.mAdTemplate
            r1.j(r3)
            com.kwad.components.ad.draw.presenter.livecard.KsLiveAuthorView r1 = r4.ft
            r1.a(r0)
            android.widget.TextView r0 = r4.fw
            com.kwad.sdk.core.response.model.AdInfo r1 = r4.mAdInfo
            java.lang.String r1 = com.kwad.sdk.core.response.b.a.aE(r1)
            r0.setText(r1)
            com.kwad.sdk.core.response.model.AdInfo r0 = r4.mAdInfo
            int r0 = com.kwad.sdk.core.response.b.a.bg(r0)
            r1 = 8
            if (r0 != r1) goto L4f
            com.kwad.components.core.widget.KsLogoView r0 = r4.fx
            r0.setVisibility(r2)
            com.kwad.components.core.widget.KsLogoView r0 = r4.fx
            com.kwad.sdk.core.response.model.AdTemplate r1 = r4.mAdTemplate
            r0.aP(r1)
            android.widget.TextView r0 = r4.fv
            com.kwad.sdk.core.response.model.AdInfo r1 = r4.mAdInfo
            java.lang.String r1 = com.kwad.sdk.core.response.b.a.au(r1)
            r0.setText(r1)
            goto L78
        L4f:
            com.kwad.sdk.core.response.model.AdInfo r0 = r4.mAdInfo
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.au(r0)
            r4.fA = r0
            com.kwad.components.core.widget.KsLogoView r0 = new com.kwad.components.core.widget.KsLogoView
            android.view.ViewGroup r3 = r4.fz
            android.content.Context r3 = r3.getContext()
            r0.<init>(r3, r2)
            r4.fB = r0
            com.kwad.components.ad.draw.view.a$3 r2 = new com.kwad.components.ad.draw.view.a$3
            r2.<init>(r4)
            r0.setLogoLoadFinishListener(r2)
            com.kwad.components.core.widget.KsLogoView r0 = r4.fB
            com.kwad.sdk.core.response.model.AdTemplate r2 = r4.mAdTemplate
            r0.aP(r2)
            com.kwad.components.core.widget.KsLogoView r0 = r4.fx
            r0.setVisibility(r1)
        L78:
            com.kwad.sdk.core.response.model.AdTemplate r0 = r4.mAdTemplate
            com.kwad.components.ad.draw.a.b.g(r0)
            long r0 = android.os.SystemClock.elapsedRealtime()
            r4.fG = r0
            com.kwad.components.ad.draw.b.b r0 = r4.bC()
            r4.dz = r0
            com.kwad.sdk.mvp.Presenter r0 = bD()
            r4.mPresenter = r0
            com.kwad.sdk.core.view.AdBaseFrameLayout r1 = r4.mRootContainer
            r0.K(r1)
            com.kwad.sdk.mvp.Presenter r0 = r4.mPresenter
            com.kwad.components.ad.draw.b.b r1 = r4.dz
            r0.n(r1)
            com.kwad.components.core.widget.a.b r0 = r4.fg
            com.kwad.sdk.core.j.b r1 = r4.dn
            r0.a(r1)
            com.kwad.components.core.widget.a.b r0 = r4.fg
            com.kwad.sdk.core.j.c r1 = r4.fo
            r0.a(r1)
            com.kwad.components.core.widget.a.b r0 = r4.fg
            r0.wi()
            return
    }

    static /* synthetic */ com.kwad.components.offline.api.core.adlive.IAdLivePlayModule c(com.kwad.components.ad.draw.view.a r0) {
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r0 = r0.bA()
            return r0
    }

    private void c(long r3) {
            r2 = this;
            float r3 = (float) r3
            r4 = 1148846080(0x447a0000, float:1000.0)
            float r3 = r3 / r4
            double r3 = (double) r3
            double r3 = java.lang.Math.ceil(r3)
            int r3 = (int) r3
            java.util.List<java.lang.Integer> r4 = r2.ck
            if (r4 == 0) goto L36
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L15
            goto L36
        L15:
            java.util.List<java.lang.Integer> r4 = r2.ck
            java.util.Iterator r4 = r4.iterator()
        L1b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L36
            java.lang.Object r0 = r4.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r3 < r0) goto L1b
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            r1 = 0
            com.kwad.sdk.core.adlog.c.a(r0, r3, r1)
            r4.remove()
        L36:
            return
    }

    static /* synthetic */ com.kwad.components.core.k.a.b d(com.kwad.components.ad.draw.view.a r0) {
            com.kwad.components.core.k.a$b r0 = r0.getCurrentVoiceItem()
            return r0
    }

    static /* synthetic */ com.kwad.sdk.utils.bv e(com.kwad.components.ad.draw.view.a r0) {
            com.kwad.sdk.utils.bv r0 = r0.getTimerHelper()
            return r0
    }

    static /* synthetic */ boolean f(com.kwad.components.ad.draw.view.a r0) {
            boolean r0 = r0.fH
            return r0
    }

    static /* synthetic */ com.kwad.components.core.k.a.b g(com.kwad.components.ad.draw.view.a r0) {
            com.kwad.components.core.k.a$b r0 = r0.fD
            return r0
    }

    private com.kwad.components.core.k.a.b getCurrentVoiceItem() {
            r2 = this;
            com.kwad.components.core.k.a$b r0 = r2.fD
            if (r0 != 0) goto L10
            com.kwad.components.core.k.a$b r0 = new com.kwad.components.core.k.a$b
            com.kwad.components.ad.draw.view.a$6 r1 = new com.kwad.components.ad.draw.view.a$6
            r1.<init>(r2)
            r0.<init>(r1)
            r2.fD = r0
        L10:
            com.kwad.components.core.k.a$b r0 = r2.fD
            return r0
    }

    private com.kwad.sdk.utils.bv getTimerHelper() {
            r1 = this;
            com.kwad.sdk.utils.bv r0 = r1.mTimerHelper
            if (r0 != 0) goto Le
            com.kwad.sdk.utils.bv r0 = new com.kwad.sdk.utils.bv
            r0.<init>()
            r1.mTimerHelper = r0
            r0.startTiming()
        Le:
            com.kwad.sdk.utils.bv r0 = r1.mTimerHelper
            return r0
    }

    static /* synthetic */ java.lang.Runnable h(com.kwad.components.ad.draw.view.a r0) {
            java.lang.Runnable r0 = r0.fI
            return r0
    }

    static /* synthetic */ android.widget.TextView i(com.kwad.components.ad.draw.view.a r0) {
            android.widget.TextView r0 = r0.fv
            return r0
    }

    private void initView() {
            r3 = this;
            android.content.Context r0 = r3.mContext
            int r1 = com.kwad.sdk.R.layout.ksad_draw_ad_live_layout
            r2 = 1
            com.kwad.sdk.o.m.a(r0, r1, r3, r2)
            int r0 = com.kwad.sdk.R.id.ksad_root_live_container
            android.view.View r0 = r3.findViewById(r0)
            com.kwad.sdk.core.view.AdBaseFrameLayout r0 = (com.kwad.sdk.core.view.AdBaseFrameLayout) r0
            r3.mRootContainer = r0
            int r1 = com.kwad.sdk.R.id.ksad_draw_video_container
            android.view.View r0 = r0.findViewById(r1)
            com.kwad.sdk.widget.KSFrameLayout r0 = (com.kwad.sdk.widget.KSFrameLayout) r0
            r3.fC = r0
            com.kwad.sdk.core.view.AdBaseFrameLayout r0 = r3.mRootContainer
            int r1 = com.kwad.sdk.R.id.ksad_draw_live_frame_bg
            android.view.View r0 = r0.findViewById(r1)
            r3.fF = r0
            return
    }

    private boolean isVideoSoundEnable() {
            r3 = this;
            int r0 = r3.fE
            r1 = 0
            r2 = 1
            if (r0 != r2) goto Lc
            boolean r0 = r3.fj
            if (r0 != 0) goto Lb
            return r2
        Lb:
            return r1
        Lc:
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            boolean r0 = com.kwad.sdk.core.response.b.a.cb(r0)
            if (r0 != 0) goto L19
            return r2
        L19:
            return r1
    }

    static /* synthetic */ java.lang.String j(com.kwad.components.ad.draw.view.a r0) {
            java.lang.String r0 = r0.fA
            return r0
    }

    static /* synthetic */ com.kwad.components.core.widget.KsLogoView k(com.kwad.components.ad.draw.view.a r0) {
            com.kwad.components.core.widget.KsLogoView r0 = r0.fB
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate l(com.kwad.components.ad.draw.view.a r0) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ android.view.ViewGroup m(com.kwad.components.ad.draw.view.a r0) {
            android.view.ViewGroup r0 = r0.fz
            return r0
    }

    static /* synthetic */ android.view.View n(com.kwad.components.ad.draw.view.a r0) {
            android.view.View r0 = r0.fF
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdInfo o(com.kwad.components.ad.draw.view.a r0) {
            com.kwad.sdk.core.response.model.AdInfo r0 = r0.mAdInfo
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.draw.b.b p(com.kwad.components.ad.draw.view.a r0) {
            com.kwad.components.ad.draw.b.b r0 = r0.dz
            return r0
    }

    static /* synthetic */ long q(com.kwad.components.ad.draw.view.a r2) {
            long r0 = r2.fG
            return r0
    }

    static /* synthetic */ boolean r(com.kwad.components.ad.draw.view.a r0) {
            boolean r0 = r0.isVideoSoundEnable()
            return r0
    }

    public final void by() {
            r1 = this;
            com.kwad.components.ad.draw.b r0 = new com.kwad.components.ad.draw.b
            r0.<init>(r1)
            r1.fg = r0
            com.kwad.sdk.core.response.model.AdInfo r0 = r1.mAdInfo
            java.util.List r0 = com.kwad.sdk.core.response.b.a.bp(r0)
            r1.ck = r0
            r1.bz()
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r5) {
            r4 = this;
            android.widget.TextView r0 = r4.fw
            boolean r0 = r5.equals(r0)
            r1 = 1
            if (r0 == 0) goto L15
            com.kwad.components.ad.draw.b.b r0 = r4.dz
            android.content.Context r5 = r5.getContext()
            r2 = 29
            r0.a(r1, r5, r2, r1)
            return
        L15:
            com.kwad.components.ad.draw.presenter.livecard.KsLiveAuthorView r0 = r4.ft
            boolean r0 = r5.equals(r0)
            r2 = 2
            if (r0 == 0) goto L2a
            com.kwad.components.ad.draw.b.b r0 = r4.dz
            android.content.Context r5 = r5.getContext()
            r3 = 30
            r0.a(r1, r5, r3, r2)
            return
        L2a:
            android.widget.TextView r0 = r4.fv
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L3e
            com.kwad.components.ad.draw.b.b r0 = r4.dz
            android.content.Context r5 = r5.getContext()
            r3 = 32
            r0.a(r1, r5, r3, r2)
            return
        L3e:
            android.widget.TextView r0 = r4.fu
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L52
            com.kwad.components.ad.draw.b.b r0 = r4.dz
            android.content.Context r5 = r5.getContext()
            r3 = 31
            r0.a(r1, r5, r3, r2)
            return
        L52:
            android.view.ViewGroup r0 = r4.fz
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L66
            com.kwad.components.ad.draw.b.b r0 = r4.dz
            android.content.Context r5 = r5.getContext()
            r3 = 53
            r0.a(r1, r5, r3, r2)
            return
        L66:
            com.kwad.sdk.core.view.AdBaseFrameLayout r0 = r4.mRootContainer
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L78
            com.kwad.sdk.widget.KSFrameLayout r0 = r4.fC
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L77
            goto L78
        L77:
            return
        L78:
            com.kwad.components.ad.draw.b.b r0 = r4.dz
            android.content.Context r5 = r5.getContext()
            r2 = 85
            r3 = 3
            r0.a(r1, r5, r2, r3)
            return
    }

    public final void setAdInteractionListener(com.kwad.sdk.api.KsDrawAd.AdInteractionListener r1) {
            r0 = this;
            r0.dh = r1
            return
    }

    public final void setPageExitListener(com.kwad.sdk.core.j.b r1) {
            r0 = this;
            r0.dn = r1
            return
    }

    public final void setVideoSound(boolean r3) {
            r2 = this;
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r0 = r2.dC
            if (r0 == 0) goto L8
            r1 = 0
            r0.setAudioEnabled(r3, r1)
        L8:
            r0 = 1
            r3 = r3 ^ r0
            r2.fj = r3
            r2.fE = r0
            return
    }
}
