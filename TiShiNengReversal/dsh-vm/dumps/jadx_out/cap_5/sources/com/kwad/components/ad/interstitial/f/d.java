package com.kwad.components.ad.interstitial.f;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class d extends com.kwad.components.ad.interstitial.f.b {
    public static float mP = 1.3333334f;
    private static float mQ = 0.749f;
    private static float mR = 0.8f;
    private static float mS = 1.0f;
    private com.kwad.sdk.core.video.videoview.a cq;
    private com.kwad.components.core.widget.a.b fg;
    private com.kwad.sdk.core.response.model.AdInfo mAdInfo;
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;
    private boolean mN;
    private com.kwad.sdk.widget.KSFrameLayout mO;
    private com.kwad.components.ad.interstitial.f.c.b mT;
    private com.kwad.sdk.core.j.d mU;
    private com.kwad.components.core.widget.KsAutoCloseView mg;
    private com.kwad.components.ad.interstitial.f.c mj;








    static {
            return
    }

    public d() {
            r1 = this;
            r1.<init>()
            com.kwad.components.ad.interstitial.f.d$5 r0 = new com.kwad.components.ad.interstitial.f.d$5
            r0.<init>(r1)
            r1.mU = r0
            return
    }

    private static android.view.ViewGroup.LayoutParams N(int r2) {
            float r0 = com.kwad.components.ad.interstitial.f.d.mQ
            float r2 = (float) r2
            float r2 = r2 * r0
            int r2 = (int) r2
            float r0 = (float) r2
            r1 = 1061142135(0x3f3fbe77, float:0.749)
            float r0 = r0 / r1
            int r0 = (int) r0
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r1.<init>(r0, r2)
            return r1
    }

    static /* synthetic */ android.view.ViewGroup.LayoutParams O(int r0) {
            android.view.ViewGroup$LayoutParams r0 = N(r0)
            return r0
    }

    private static android.view.ViewGroup.LayoutParams a(int r1, boolean r2) {
            if (r2 == 0) goto L5
            float r0 = com.kwad.components.ad.interstitial.f.d.mR
            goto L7
        L5:
            float r0 = com.kwad.components.ad.interstitial.f.d.mS
        L7:
            if (r2 == 0) goto Lc
            float r2 = com.kwad.components.ad.interstitial.f.d.mP
            goto Lf
        Lc:
            r2 = 1061142135(0x3f3fbe77, float:0.749)
        Lf:
            float r1 = (float) r1
            float r1 = r1 * r0
            int r1 = (int) r1
            float r0 = (float) r1
            float r0 = r0 * r2
            int r2 = (int) r0
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r1, r2)
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.interstitial.f.c a(com.kwad.components.ad.interstitial.f.d r0) {
            com.kwad.components.ad.interstitial.f.c r0 = r0.mj
            return r0
    }

    static /* synthetic */ com.kwad.sdk.widget.KSFrameLayout a(com.kwad.components.ad.interstitial.f.d r0, com.kwad.sdk.widget.KSFrameLayout r1) {
            r0.mO = r1
            return r1
    }

    static /* synthetic */ void a(com.kwad.components.ad.interstitial.f.d r0, int r1, int r2) {
            r0.e(r1, r2)
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.interstitial.f.d r0, boolean r1) {
            r0.o(r1)
            return
    }

    private static float b(boolean r0, boolean r1) {
            if (r0 == 0) goto L7
            if (r1 == 0) goto L7
            float r0 = com.kwad.components.ad.interstitial.f.d.mP
            return r0
        L7:
            r0 = 1061142135(0x3f3fbe77, float:0.749)
            return r0
    }

    static /* synthetic */ android.view.ViewGroup.LayoutParams b(int r0, boolean r1) {
            android.view.ViewGroup$LayoutParams r0 = a(r0, r1)
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.video.videoview.a b(com.kwad.components.ad.interstitial.f.d r0) {
            com.kwad.sdk.core.video.videoview.a r0 = r0.cq
            return r0
    }

    static /* synthetic */ boolean b(com.kwad.components.ad.interstitial.f.d r0, boolean r1) {
            r0.mN = r1
            return r1
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate c(com.kwad.components.ad.interstitial.f.d r0) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    private static boolean c(com.kwad.sdk.core.response.model.AdInfo r2) {
            com.kwad.sdk.core.response.model.AdInfo$AdInsertScreenInfo r0 = r2.adInsertScreenInfo
            int r0 = r0.autoCloseTime
            r1 = 0
            if (r0 > 0) goto L8
            return r1
        L8:
            boolean r2 = com.kwad.sdk.core.response.b.a.bK(r2)
            if (r2 == 0) goto Lf
            return r1
        Lf:
            r2 = 1
            return r2
    }

    static /* synthetic */ com.kwad.components.core.widget.KsAutoCloseView d(com.kwad.components.ad.interstitial.f.d r0) {
            com.kwad.components.core.widget.KsAutoCloseView r0 = r0.mg
            return r0
    }

    static /* synthetic */ android.content.Context e(com.kwad.components.ad.interstitial.f.d r0) {
            android.content.Context r0 = r0.getContext()
            return r0
    }

    private void e(int r3, int r4) {
            r2 = this;
            com.kwad.components.ad.interstitial.f.c$c r0 = new com.kwad.components.ad.interstitial.f.c$c
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1)
            boolean r1 = r2.mN
            com.kwad.components.ad.interstitial.f.c$c r0 = r0.l(r1)
            com.kwad.sdk.widget.KSFrameLayout r1 = r2.mO
            com.kwad.sdk.utils.aj$a r1 = r1.getTouchCoords()
            com.kwad.components.ad.interstitial.f.c$c r0 = r0.a(r1)
            com.kwad.components.ad.interstitial.f.c$c r3 = r0.L(r3)
            com.kwad.components.ad.interstitial.f.c$c r3 = r3.M(r4)
            com.kwad.components.ad.interstitial.f.c r4 = r2.mj
            boolean r3 = r4.a(r3)
            if (r3 == 0) goto L4a
            com.kwad.sdk.core.response.model.AdTemplate r3 = r2.mAdTemplate
            boolean r3 = com.kwad.components.ad.interstitial.d.b.t(r3)
            if (r3 == 0) goto L4a
            com.kwad.components.ad.interstitial.f.c r3 = r2.mj
            com.kwad.components.ad.interstitial.d r4 = r3.kW
            if (r4 == 0) goto L4a
            r4 = -1
            com.kwad.sdk.core.video.videoview.a r0 = r3.cq
            r1 = 0
            r3.a(r1, r4, r0)
            com.kwad.components.ad.interstitial.f.c r3 = r2.mj
            com.kwad.components.ad.interstitial.d r3 = r3.kW
            r3.dismiss()
            com.kwad.components.ad.interstitial.f.c r3 = r2.mj
            r3.Y()
        L4a:
            return
    }

    private com.kwad.components.ad.interstitial.f.c.b ed() {
            r1 = this;
            com.kwad.components.ad.interstitial.f.d$4 r0 = new com.kwad.components.ad.interstitial.f.d$4
            r0.<init>(r1)
            r1.mT = r0
            return r0
    }

    private void ee() {
            r8 = this;
            com.kwad.components.ad.interstitial.f.c r0 = r8.mj
            com.kwad.components.ad.interstitial.h.d r0 = r0.mk
            com.kwad.sdk.core.response.model.AdTemplate r1 = r8.mAdTemplate
            r0.setAdTemplate(r1)
            com.kwad.sdk.core.response.model.AdInfo r1 = r8.mAdInfo
            boolean r1 = com.kwad.sdk.core.response.b.a.bd(r1)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L28
            com.kwad.sdk.core.response.model.AdInfo r1 = r8.mAdInfo
            com.kwad.sdk.core.response.model.AdInfo$AdMaterialInfo$MaterialFeature r1 = com.kwad.sdk.core.response.b.a.aU(r1)
            java.lang.String r1 = r1.materialUrl
            com.kwad.sdk.core.response.model.AdTemplate r4 = r8.mAdTemplate
            r0.c(r1, r4)
            r0.c(r3, r3)
            r0.u(r2)
            goto Lb1
        L28:
            r0.u(r3)
            com.kwad.sdk.core.response.model.AdInfo r1 = r8.mAdInfo
            com.kwad.sdk.core.response.model.b r1 = com.kwad.sdk.core.response.b.a.bu(r1)
            java.lang.String r1 = r1.getUrl()
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 != 0) goto L44
            com.kwad.sdk.core.response.model.AdTemplate r4 = r8.mAdTemplate
            r0.c(r1, r4)
            r0.c(r3, r2)
            goto L47
        L44:
            r0.c(r2, r2)
        L47:
            com.kwad.components.ad.interstitial.f.c r1 = r8.mj
            com.kwad.sdk.core.video.videoview.a r1 = r1.cq
            r8.cq = r1
            android.view.ViewParent r1 = r1.getParent()
            if (r1 == 0) goto L60
            com.kwad.sdk.core.video.videoview.a r1 = r8.cq
            android.view.ViewParent r1 = r1.getParent()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            com.kwad.sdk.core.video.videoview.a r4 = r8.cq
            r1.removeView(r4)
        L60:
            com.kwad.sdk.core.response.model.AdInfo r1 = r8.mAdInfo
            boolean r1 = com.kwad.sdk.core.response.b.a.bc(r1)
            if (r1 == 0) goto L80
            com.kwad.sdk.core.response.model.AdInfo r1 = r8.mAdInfo
            com.kwad.sdk.core.response.model.AdInfo$AdMaterialInfo$MaterialFeature r1 = com.kwad.sdk.core.response.b.a.aV(r1)
            int r1 = r1.height
            float r1 = (float) r1
            com.kwad.sdk.core.response.model.AdInfo r4 = r8.mAdInfo
            com.kwad.sdk.core.response.model.AdInfo$AdMaterialInfo$MaterialFeature r4 = com.kwad.sdk.core.response.b.a.aV(r4)
            int r4 = r4.width
            float r4 = (float) r4
            float r1 = r1 / r4
            com.kwad.sdk.core.video.videoview.a r4 = r8.cq
            r0.a(r1, r4)
        L80:
            com.kwad.components.ad.interstitial.f.c r1 = r8.mj
            com.kwad.sdk.api.KsAdVideoPlayConfig r1 = r1.bU
            boolean r1 = r1.isVideoSoundEnable()
            r0.v(r1)
            com.kwad.sdk.core.response.model.AdInfo r1 = r8.mAdInfo
            int r1 = com.kwad.sdk.core.response.b.a.L(r1)
            com.kwad.components.ad.interstitial.f.c r4 = r8.mj
            com.kwad.components.ad.interstitial.f.d$6 r5 = new com.kwad.components.ad.interstitial.f.d$6
            r5.<init>(r8, r1, r0)
            r4.a(r5)
            com.kwad.sdk.core.response.model.AdTemplate r1 = r8.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r4 = r8.mAdInfo
            r0.a(r1, r4)
            r0.u(r3)
            com.kwad.components.ad.interstitial.f.c r1 = r8.mj
            java.util.List<com.kwad.components.ad.interstitial.f.c$d> r1 = r1.ms
            com.kwad.components.ad.interstitial.f.d$7 r4 = new com.kwad.components.ad.interstitial.f.d$7
            r4.<init>(r8, r0)
            r1.add(r4)
        Lb1:
            com.kwad.components.ad.interstitial.f.c r1 = r8.mj
            android.content.Context r4 = r8.getContext()
            com.kwad.sdk.core.response.model.AdInfo r5 = r8.mAdInfo
            com.kwad.sdk.core.response.model.AdTemplate r6 = r8.mAdTemplate
            android.view.View r7 = r0.getBlurBgView()
            r1.a(r4, r5, r6, r7)
            com.kwad.sdk.core.response.model.AdInfo r1 = r8.mAdInfo
            java.lang.String r1 = com.kwad.sdk.core.response.b.a.O(r1)
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 == 0) goto Ld4
            com.kwad.sdk.core.response.model.AdInfo r1 = r8.mAdInfo
            java.lang.String r1 = com.kwad.sdk.core.response.b.a.X(r1)
        Ld4:
            android.widget.ImageView r0 = r0.getTailFrameView()
            com.kwad.sdk.core.response.model.AdTemplate r4 = r8.mAdTemplate
            com.kwad.sdk.core.imageloader.KSImageLoader.loadImage(r0, r1, r4)
            com.kwad.sdk.core.response.model.AdInfo r0 = r8.mAdInfo
            boolean r0 = c(r0)
            if (r0 == 0) goto Lee
            com.kwad.components.core.widget.KsAutoCloseView r0 = r8.mg
            r0.bb(r3)
            r8.ef()
            return
        Lee:
            com.kwad.components.core.widget.KsAutoCloseView r0 = r8.mg
            r0.bb(r2)
            return
    }

    private void ef() {
            r3 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r3.mAdInfo
            com.kwad.sdk.core.response.model.AdInfo$AdInsertScreenInfo r1 = r0.adInsertScreenInfo
            int r1 = r1.autoCloseTime
            boolean r0 = com.kwad.sdk.core.response.b.a.bc(r0)
            if (r0 == 0) goto L24
            com.kwad.sdk.core.response.model.AdInfo r0 = r3.mAdInfo
            int r0 = com.kwad.sdk.core.response.b.a.L(r0)
            int r1 = java.lang.Math.min(r1, r0)
            com.kwad.components.ad.interstitial.f.c r0 = r3.mj
            com.kwad.components.ad.interstitial.h.d r0 = r0.mk
            r0.ff()
            com.kwad.components.ad.interstitial.f.c r0 = r3.mj
            com.kwad.components.ad.interstitial.h.d r0 = r0.mk
            r0.fg()
        L24:
            com.kwad.components.core.widget.KsAutoCloseView r0 = r3.mg
            r0.ai(r1)
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            r1 = 165(0xa5, float:2.31E-43)
            r2 = 0
            com.kwad.sdk.core.adlog.c.b(r0, r1, r2)
            return
    }

    private void o(boolean r4) {
            r3 = this;
            com.kwad.components.ad.interstitial.f.c r0 = r3.mj
            boolean r1 = r0.mn
            if (r1 != 0) goto L23
            if (r4 != 0) goto L23
            boolean r1 = r0.ml
            if (r1 != 0) goto L23
            boolean r1 = r0.mm
            if (r1 != 0) goto L23
            boolean r0 = com.kwad.components.ad.interstitial.g.a.d(r0)
            if (r0 == 0) goto L23
            com.kwad.components.ad.interstitial.f.c r4 = r3.mj
            r0 = 1
            r4.mm = r0
            android.content.Context r4 = r3.getContext()
            com.kwad.components.ad.interstitial.c.b.K(r4)
            return
        L23:
            com.kwad.components.ad.interstitial.f.c r0 = r3.mj
            r1 = -1
            com.kwad.sdk.core.video.videoview.a r2 = r3.cq
            r0.a(r4, r1, r2)
            com.kwad.components.ad.interstitial.f.c r4 = r3.mj
            com.kwad.components.ad.interstitial.d r4 = r4.kW
            r4.dismiss()
            com.kwad.sdk.core.video.videoview.a r4 = r3.cq
            if (r4 == 0) goto L39
            r4.release()
        L39:
            com.kwad.components.ad.interstitial.f.c r4 = r3.mj
            r4.Y()
            return
    }

    @Override // com.kwad.components.ad.interstitial.f.b, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r5 = this;
            super.at()
            java.lang.Object r0 = r5.NN()
            com.kwad.components.ad.interstitial.f.c r0 = (com.kwad.components.ad.interstitial.f.c) r0
            r5.mj = r0
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            r5.mAdTemplate = r0
            com.kwad.components.ad.interstitial.report.c r0 = com.kwad.components.ad.interstitial.report.c.eS()
            com.kwad.components.ad.interstitial.f.c r1 = r5.mj
            com.kwad.sdk.core.response.model.AdTemplate r1 = r1.mAdTemplate
            r0.C(r1)
            com.kwad.components.ad.interstitial.f.c r0 = r5.mj
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            r5.mAdInfo = r0
            com.kwad.sdk.core.response.model.AdInfo$AdMaterialInfo$MaterialFeature r0 = com.kwad.sdk.core.response.b.a.aX(r0)
            int r1 = r0.width
            if (r1 <= 0) goto L33
            int r0 = r0.height
            float r0 = (float) r0
            float r1 = (float) r1
            float r0 = r0 / r1
            com.kwad.components.ad.interstitial.f.d.mP = r0
        L33:
            com.kwad.components.ad.interstitial.f.c r0 = r5.mj
            com.kwad.sdk.widget.KSFrameLayout r0 = r0.fV
            java.lang.String r1 = "#99000000"
            int r1 = android.graphics.Color.parseColor(r1)
            r0.setBackgroundColor(r1)
            com.kwad.components.ad.interstitial.f.c r0 = r5.mj
            com.kwad.components.ad.interstitial.h.d r0 = r0.mk
            r1 = 0
            r0.setVisibility(r1)
            com.kwad.components.ad.interstitial.f.c r0 = r5.mj
            com.kwad.components.ad.interstitial.h.d r0 = r0.mk
            com.kwad.sdk.core.response.model.AdTemplate r2 = r5.mAdTemplate
            r0.H(r2)
            com.kwad.components.ad.interstitial.f.c r0 = r5.mj
            com.kwad.components.ad.interstitial.f.c$b r2 = r5.ed()
            r0.a(r2)
            r5.ee()
            com.kwad.components.ad.interstitial.f.c r0 = r5.mj
            com.kwad.components.ad.interstitial.h.d r0 = r0.mk
            com.kwad.components.ad.interstitial.f.d$2 r2 = new com.kwad.components.ad.interstitial.f.d$2
            r2.<init>(r5)
            r0.setViewListener(r2)
            com.kwad.components.core.widget.a.b r0 = new com.kwad.components.core.widget.a.b
            com.kwad.components.ad.interstitial.f.c r2 = r5.mj
            com.kwad.components.ad.interstitial.h.d r2 = r2.mk
            r3 = 100
            r0.<init>(r2, r3)
            r5.fg = r0
            com.kwad.sdk.core.j.d r2 = r5.mU
            r0.a(r2)
            com.kwad.components.core.widget.a.b r0 = r5.fg
            r0.wi()
            com.kwad.sdk.core.response.model.AdInfo r0 = r5.mAdInfo
            boolean r0 = com.kwad.sdk.core.response.b.a.aW(r0)
            r5.getContext()
            boolean r2 = com.kwad.sdk.utils.aq.QW()
            float r3 = b(r2, r0)
            com.kwad.components.ad.interstitial.f.c r4 = r5.mj
            com.kwad.components.ad.interstitial.h.d r4 = r4.mk
            r4.setRatio(r3)
            int r3 = com.kwad.sdk.R.id.ksad_interstitial_native
            android.view.View r3 = r5.findViewById(r3)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r3.setVisibility(r1)
            com.kwad.components.ad.interstitial.f.d$3 r1 = new com.kwad.components.ad.interstitial.f.d$3
            r1.<init>(r5, r2, r0, r3)
            r3.post(r1)
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r2 = this;
            super.onCreate()
            int r0 = com.kwad.sdk.R.id.ksad_interstitial_auto_close
            android.view.View r0 = r2.findViewById(r0)
            com.kwad.components.core.widget.KsAutoCloseView r0 = (com.kwad.components.core.widget.KsAutoCloseView) r0
            r2.mg = r0
            com.kwad.components.ad.interstitial.f.d$1 r1 = new com.kwad.components.ad.interstitial.f.d$1
            r1.<init>(r2)
            r0.setViewListener(r1)
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r2 = this;
            super.onUnbind()
            com.kwad.components.ad.interstitial.f.c r0 = r2.mj
            com.kwad.components.ad.interstitial.f.c$b r1 = r2.mT
            r0.b(r1)
            com.kwad.components.core.widget.a.b r0 = r2.fg
            if (r0 == 0) goto L18
            com.kwad.sdk.core.j.d r1 = r2.mU
            r0.b(r1)
            com.kwad.components.core.widget.a.b r0 = r2.fg
            r0.wj()
        L18:
            return
    }
}
