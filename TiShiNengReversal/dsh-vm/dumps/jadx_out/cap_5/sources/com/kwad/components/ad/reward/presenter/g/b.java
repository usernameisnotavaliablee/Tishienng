package com.kwad.components.ad.reward.presenter.g;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b extends com.kwad.components.ad.reward.presenter.b implements com.kwad.components.ad.reward.n.c.a, com.kwad.sdk.app.a, com.kwad.sdk.core.webview.d.a.a, com.kwad.sdk.widget.d {
    private static float Aj = 0.4548105f;

    @androidx.annotation.Nullable
    private android.view.ViewGroup Ac;

    @androidx.annotation.Nullable
    private com.kwad.components.ad.reward.n.q Ad;
    private android.view.ViewGroup Ae;
    private com.kwad.components.ad.reward.n.e Af;
    private com.kwad.components.ad.reward.n.c Ag;

    @androidx.annotation.Nullable
    private com.kwad.components.ad.reward.n.c Ah;
    private int Ak;
    private long Al;
    private boolean Am;
    private com.kwad.sdk.core.c.c An;
    private com.kwad.sdk.core.response.model.AdInfo mAdInfo;
    private final com.kwad.components.ad.reward.e.l mRewardVerifyListener;
    private com.kwad.components.ad.reward.l.b.a sm;





    static {
            return
    }

    public b() {
            r2 = this;
            r2.<init>()
            r0 = 15
            r2.Ak = r0
            r0 = -1
            r2.Al = r0
            r0 = 0
            r2.Am = r0
            com.kwad.components.ad.reward.presenter.g.b$3 r0 = new com.kwad.components.ad.reward.presenter.g.b$3
            r0.<init>(r2)
            r2.mRewardVerifyListener = r0
            com.kwad.components.ad.reward.presenter.g.b$4 r0 = new com.kwad.components.ad.reward.presenter.g.b$4
            r0.<init>(r2)
            r2.An = r0
            return
    }

    private void X(boolean r4) {
            r3 = this;
            com.kwad.components.ad.reward.l.b.a r0 = r3.sm
            android.content.Context r1 = r3.getContext()
            com.kwad.components.ad.reward.g r2 = r3.tm
            com.kwad.sdk.core.response.model.AdTemplate r2 = r2.mAdTemplate
            com.kwad.components.ad.reward.l.b.a.a(r0, r1, r2)
            com.kwad.components.ad.reward.l.b.a r0 = r3.sm
            boolean r0 = r0.kQ()
            if (r0 == 0) goto L3d
            if (r4 == 0) goto L36
            boolean r4 = r3.kn()
            if (r4 == 0) goto L32
            com.kwad.components.ad.reward.l.b.a r0 = r3.sm
            if (r0 == 0) goto L32
            r0.kP()
            com.kwad.components.ad.reward.b r0 = com.kwad.components.ad.reward.b.gk()
            r0.notifyRewardVerify()
            com.kwad.components.ad.reward.g r0 = r3.tm
            com.kwad.components.ad.reward.e.b r0 = r0.rD
            r0.onRewardVerify()
        L32:
            r3.Y(r4)
            return
        L36:
            long r0 = java.lang.System.currentTimeMillis()
            r3.Al = r0
            return
        L3d:
            if (r4 == 0) goto L43
            r4 = 0
            r3.Y(r4)
        L43:
            return
    }

    private void Y(boolean r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "showTaskToast hasShowCompletedToast: "
            r0.<init>(r1)
            boolean r1 = r3.Am
            r0.append(r1)
            java.lang.String r1 = " completed: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "LaunchAppTaskPresenter"
            com.kwad.sdk.core.d.c.d(r1, r0)
            boolean r0 = r3.Am
            if (r0 == 0) goto L22
            goto L36
        L22:
            if (r4 == 0) goto L27
            java.lang.String r0 = "恭喜！任务达标啦，成功获取奖励~"
            goto L29
        L27:
            java.lang.String r0 = "哎呀，差一点就达标啦，再试一次~"
        L29:
            android.content.Context r1 = r3.getContext()
            r2 = 0
            com.kwad.sdk.utils.ac.c(r1, r0, r2)
            if (r4 == 0) goto L36
            r4 = 1
            r3.Am = r4
        L36:
            return
    }

    private void Z(boolean r4) {
            r3 = this;
            r0 = 1
            if (r4 == 0) goto L5
            r4 = 1
            goto L7
        L5:
            r4 = 153(0x99, float:2.14E-43)
        L7:
            com.kwad.components.ad.reward.g r1 = r3.tm
            android.content.Context r2 = r3.getContext()
            r1.a(r0, r2, r4, r0)
            return
    }

    static /* synthetic */ com.kwad.components.ad.reward.g a(com.kwad.components.ad.reward.presenter.g.b r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    static /* synthetic */ void a(com.kwad.components.ad.reward.presenter.g.b r0, boolean r1) {
            r0.X(r1)
            return
    }

    private void a(com.kwad.sdk.core.view.AdBaseFrameLayout r5) {
            r4 = this;
            r4.getContext()
            boolean r0 = com.kwad.sdk.utils.aq.QW()
            if (r0 != 0) goto L11
            java.lang.String r5 = "LaunchAppTaskPresenter"
            java.lang.String r0 = "initBottomActionBar screen is horizontal"
            com.kwad.sdk.core.d.c.d(r5, r0)
            return
        L11:
            int r0 = com.kwad.sdk.R.id.ksad_reward_apk_info_stub
            android.view.View r0 = r4.findViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            r0.inflate()
            int r0 = com.kwad.sdk.R.id.ksad_reward_apk_info_card_native_container
            android.view.View r1 = r4.findViewById(r0)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r4.Ae = r1
            r2 = 1
            r1.setClickable(r2)
            com.kwad.sdk.widget.h r1 = new com.kwad.sdk.widget.h
            android.view.ViewGroup r2 = r4.Ae
            r1.<init>(r2, r4)
            int r1 = com.kwad.sdk.R.id.ksad_reward_apk_info_card_root
            android.view.View r1 = r4.findViewById(r1)
            com.kwad.sdk.widget.KSFrameLayout r1 = (com.kwad.sdk.widget.KSFrameLayout) r1
            android.content.Context r2 = r4.getContext()
            android.content.res.Resources r2 = r2.getResources()
            int r3 = com.kwad.sdk.R.dimen.ksad_reward_apk_info_card_step_icon_radius
            float r2 = r2.getDimension(r3)
            r1.setRadius(r2)
            android.content.Context r2 = r4.getContext()
            android.content.res.Resources r2 = r2.getResources()
            int r3 = com.kwad.sdk.R.dimen.ksad_reward_apk_info_card_height
            float r2 = r2.getDimension(r3)
            com.kwad.components.ad.reward.presenter.g.b$1 r3 = new com.kwad.components.ad.reward.presenter.g.b$1
            r3.<init>(r4, r1, r2)
            r1.post(r3)
            android.view.View r0 = r4.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r4.Ae = r0
            com.kwad.components.ad.reward.n.c r1 = new com.kwad.components.ad.reward.n.c
            r1.<init>(r0)
            r4.Ag = r1
            com.kwad.components.ad.reward.g r0 = r4.tm
            com.kwad.components.core.e.d.c r0 = r0.mApkDownloadHelper
            r1.a(r0)
            com.kwad.components.ad.reward.n.c r0 = r4.Ag
            r0.a(r4)
            com.kwad.components.ad.reward.n.c r0 = r4.Ag
            com.kwad.components.ad.reward.g r1 = r4.tm
            com.kwad.sdk.core.response.model.AdTemplate r1 = r1.mAdTemplate
            r2 = 0
            r0.c(r1, r2)
            int r0 = com.kwad.sdk.R.id.ksad_reward_apk_info_card_h5
            android.view.View r0 = r4.findViewById(r0)
            com.kwad.sdk.core.webview.KsAdWebView r0 = (com.kwad.sdk.core.webview.KsAdWebView) r0
            com.kwad.components.ad.reward.n.e r1 = new com.kwad.components.ad.reward.n.e
            android.view.ViewGroup r2 = r4.Ae
            com.kwad.components.ad.reward.g r3 = r4.tm
            com.kwad.components.core.e.d.c r3 = r3.mApkDownloadHelper
            r1.<init>(r0, r2, r3, r4)
            r4.Af = r1
            com.kwad.components.ad.reward.presenter.g.b$2 r0 = new com.kwad.components.ad.reward.presenter.g.b$2
            r0.<init>(r4)
            r1.a(r0)
            com.kwad.components.ad.reward.n.e r0 = r4.Af
            com.kwad.components.ad.reward.g r1 = r4.tm
            com.kwad.sdk.core.response.model.AdTemplate r1 = r1.mAdTemplate
            r0.a(r1, r5)
            return
    }

    static /* synthetic */ com.kwad.components.ad.reward.n.c b(com.kwad.components.ad.reward.presenter.g.b r0) {
            com.kwad.components.ad.reward.n.c r0 = r0.Ag
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g c(com.kwad.components.ad.reward.presenter.g.b r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.n.c d(com.kwad.components.ad.reward.presenter.g.b r0) {
            com.kwad.components.ad.reward.n.c r0 = r0.Ah
            return r0
    }

    private boolean kn() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "checkUseAppTime appBackgroundTimestamp: "
            r0.<init>(r1)
            long r1 = r6.Al
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "LaunchAppTaskPresenter"
            com.kwad.sdk.core.d.c.d(r1, r0)
            long r0 = r6.Al
            r2 = 0
            r4 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 >= 0) goto L1f
            return r4
        L1f:
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r6.Al
            long r0 = r0 - r2
            int r2 = r6.Ak
            int r2 = r2 * 1000
            long r2 = (long) r2
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L31
            r0 = 1
            return r0
        L31:
            return r4
    }

    @Override // com.kwad.sdk.app.a
    public final void U(java.lang.String r3) {
            r2 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r2.mAdInfo
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.ay(r0)
            boolean r3 = android.text.TextUtils.equals(r0, r3)
            if (r3 != 0) goto Ld
            goto L31
        Ld:
            com.kwad.components.ad.reward.g r3 = r2.tm
            com.kwad.components.ad.reward.l.b.a r0 = r3.sm
            if (r0 == 0) goto L31
            com.kwad.sdk.core.response.model.AdTemplate r3 = r3.mAdTemplate
            boolean r3 = com.kwad.components.ad.reward.g.N(r3)
            if (r3 == 0) goto L31
            com.kwad.components.ad.reward.g r3 = r2.tm
            com.kwad.components.ad.reward.l.b.a r3 = r3.sm
            r3.kN()
            com.kwad.sdk.core.c.b.Ho()
            boolean r3 = com.kwad.sdk.core.c.b.isAppOnForeground()
            if (r3 != 0) goto L31
            long r0 = java.lang.System.currentTimeMillis()
            r2.Al = r0
        L31:
            return
    }

    @Override // com.kwad.sdk.app.a
    public final void V(java.lang.String r1) {
            r0 = this;
            return
    }

    @Override // com.kwad.sdk.widget.d
    public final void a(android.view.View r1) {
            r0 = this;
            r1 = 1
            r0.Z(r1)
            return
    }

    @Override // com.kwad.sdk.core.webview.d.a.a
    public final void a(@androidx.annotation.Nullable com.kwad.sdk.core.webview.d.b.a r1) {
            r0 = this;
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.b, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r5 = this;
            super.at()
            java.lang.String r0 = "LaunchAppTaskPresenter"
            java.lang.String r1 = "onBind"
            com.kwad.sdk.core.d.c.d(r0, r1)
            com.kwad.components.ad.reward.g r0 = r5.tm
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            boolean r0 = com.kwad.components.ad.reward.g.N(r0)
            if (r0 != 0) goto L15
            return
        L15:
            com.kwad.components.ad.reward.g r0 = r5.tm
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            r5.mAdInfo = r0
            int r0 = com.kwad.components.ad.reward.a.b.hB()
            r5.Ak = r0
            com.kwad.sdk.core.c.b.Ho()
            com.kwad.sdk.core.c.c r0 = r5.An
            com.kwad.sdk.core.c.b.a(r0)
            com.kwad.components.ad.reward.b r0 = com.kwad.components.ad.reward.b.gk()
            com.kwad.components.ad.reward.e.l r1 = r5.mRewardVerifyListener
            r0.a(r1)
            com.kwad.components.ad.reward.l.b.a r0 = com.kwad.components.ad.reward.l.d.kI()
            r5.sm = r0
            com.kwad.components.ad.reward.g r1 = r5.tm
            r1.sm = r0
            android.content.Context r1 = r5.getContext()
            com.kwad.components.ad.reward.g r2 = r5.tm
            com.kwad.sdk.core.response.model.AdTemplate r2 = r2.mAdTemplate
            com.kwad.components.ad.reward.l.b.a.a(r0, r1, r2)
            int r0 = com.kwad.sdk.R.id.ksad_root_container
            android.view.View r0 = r5.findViewById(r0)
            com.kwad.sdk.core.view.AdBaseFrameLayout r0 = (com.kwad.sdk.core.view.AdBaseFrameLayout) r0
            int r1 = com.kwad.sdk.R.id.ksad_activity_apk_info_area_native
            android.view.View r1 = r5.findViewById(r1)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r5.Ac = r1
            if (r1 == 0) goto Laa
            r2 = 8
            r1.setVisibility(r2)
            com.kwad.components.ad.reward.n.c r1 = new com.kwad.components.ad.reward.n.c
            android.view.ViewGroup r2 = r5.Ac
            r1.<init>(r2)
            r5.Ah = r1
            com.kwad.components.ad.reward.g r2 = r5.tm
            com.kwad.components.core.e.d.c r2 = r2.mApkDownloadHelper
            r1.a(r2)
            com.kwad.components.ad.reward.n.c r1 = r5.Ah
            r1.a(r5)
            com.kwad.components.ad.reward.n.c r1 = r5.Ah
            com.kwad.components.ad.reward.g r2 = r5.tm
            com.kwad.sdk.core.response.model.AdTemplate r2 = r2.mAdTemplate
            r3 = 0
            r1.c(r2, r3)
            int r1 = com.kwad.sdk.R.id.ksad_right_area_webview_container
            android.view.View r1 = r5.findViewById(r1)
            com.kwad.sdk.widget.KSFrameLayout r1 = (com.kwad.sdk.widget.KSFrameLayout) r1
            r1.setWidthBasedRatio(r3)
            int r1 = com.kwad.sdk.R.id.ksad_right_area_webview
            android.view.View r1 = r5.findViewById(r1)
            com.kwad.sdk.core.webview.KsAdWebView r1 = (com.kwad.sdk.core.webview.KsAdWebView) r1
            com.kwad.components.ad.reward.n.q r2 = new com.kwad.components.ad.reward.n.q
            android.view.ViewGroup r3 = r5.Ac
            com.kwad.components.ad.reward.g r4 = r5.tm
            com.kwad.components.core.e.d.c r4 = r4.mApkDownloadHelper
            r2.<init>(r1, r3, r4, r5)
            r5.Ad = r2
            com.kwad.components.ad.reward.g r1 = r5.tm
            com.kwad.sdk.core.response.model.AdTemplate r1 = r1.mAdTemplate
            r2.a(r1, r0)
        Laa:
            com.kwad.sdk.app.b r1 = com.kwad.sdk.app.b.Dw()
            r1.a(r5)
            r5.a(r0)
            return
    }

    @Override // com.kwad.sdk.widget.d
    public final void b(android.view.View r1) {
            r0 = this;
            com.kwad.components.ad.reward.g r1 = r0.tm
            com.kwad.sdk.core.response.model.AdTemplate r1 = r1.mAdTemplate
            boolean r1 = com.kwad.sdk.core.response.b.d.ea(r1)
            if (r1 == 0) goto Le
            r1 = 0
            r0.Z(r1)
        Le:
            return
    }

    @Override // com.kwad.components.ad.reward.n.c.a
    public final void d(boolean r3, int r4) {
            r2 = this;
            r4 = 1
            if (r3 == 0) goto L5
            r3 = 1
            goto L7
        L5:
            r3 = 153(0x99, float:2.14E-43)
        L7:
            com.kwad.components.ad.reward.g r0 = r2.tm
            android.content.Context r1 = r2.getContext()
            r0.b(r4, r1, r3, r4)
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r2 = this;
            super.onUnbind()
            java.lang.String r0 = "LaunchAppTaskPresenter"
            java.lang.String r1 = "onUnbind"
            com.kwad.sdk.core.d.c.d(r0, r1)
            com.kwad.sdk.core.c.b.Ho()
            com.kwad.sdk.core.c.c r0 = r2.An
            com.kwad.sdk.core.c.b.b(r0)
            com.kwad.components.ad.reward.b r0 = com.kwad.components.ad.reward.b.gk()
            com.kwad.components.ad.reward.e.l r1 = r2.mRewardVerifyListener
            r0.b(r1)
            com.kwad.sdk.app.b r0 = com.kwad.sdk.app.b.Dw()
            r0.b(r2)
            com.kwad.components.ad.reward.n.e r0 = r2.Af
            r1 = 0
            if (r0 == 0) goto L2c
            r0.lc()
            r2.Af = r1
        L2c:
            com.kwad.components.ad.reward.n.c r0 = r2.Ah
            if (r0 == 0) goto L33
            r0.kZ()
        L33:
            com.kwad.components.ad.reward.g r0 = r2.tm
            r0.sm = r1
            return
    }
}
