package com.kwad.components.ad.reward.presenter.platdetail.actionbar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b extends com.kwad.components.ad.reward.presenter.b {

    @androidx.annotation.Nullable
    private android.animation.ValueAnimator eX;
    private com.kwad.sdk.core.response.model.AdInfo mAdInfo;
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;
    private com.kwad.components.core.e.d.c mApkDownloadHelper;
    private com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl rG;
    private com.kwad.components.core.widget.KsLogoView vN;
    private final com.kwad.components.core.video.m vR;
    private com.kwad.components.ad.reward.widget.actionbar.ActionBarAppLandscape xO;
    private com.kwad.components.ad.reward.widget.actionbar.ActionBarAppPortrait xP;
    private com.kwad.components.ad.reward.widget.actionbar.ActionBarH5 xQ;
    private boolean xR;
    private boolean xS;

    @androidx.annotation.Nullable
    private android.view.ViewGroup xT;

    @androidx.annotation.Nullable
    private android.view.ViewGroup xU;

    @androidx.annotation.Nullable
    private android.view.ViewGroup xV;
    private com.kwad.components.ad.reward.n.h xW;
    private boolean xX;
    private com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.b xY;
    private com.kwad.components.ad.reward.e.g xZ;












    public b() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.xR = r0
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.b$1 r0 = new com.kwad.components.ad.reward.presenter.platdetail.actionbar.b$1
            r0.<init>(r1)
            r1.vR = r0
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.b$4 r0 = new com.kwad.components.ad.reward.presenter.platdetail.actionbar.b$4
            r0.<init>(r1)
            r1.xY = r0
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.b$5 r0 = new com.kwad.components.ad.reward.presenter.platdetail.actionbar.b$5
            r0.<init>(r1)
            r1.xZ = r0
            return
    }

    private void M(boolean r5) {
            r4 = this;
            boolean r0 = r4.xR
            if (r0 != 0) goto L5
            goto L51
        L5:
            r0 = 0
            r4.xR = r0
            com.kwad.components.core.widget.KsLogoView r0 = r4.vN
            r1 = 8
            r0.setVisibility(r1)
            android.view.ViewGroup r0 = r4.xT
            if (r0 == 0) goto L16
            r0.setVisibility(r1)
        L16:
            android.view.ViewGroup r0 = r4.xV
            if (r0 == 0) goto L1d
            r0.setVisibility(r1)
        L1d:
            com.kwad.sdk.core.response.model.AdInfo r0 = r4.mAdInfo
            boolean r0 = com.kwad.sdk.core.response.b.a.aF(r0)
            r2 = 1119092736(0x42b40000, float:90.0)
            if (r0 == 0) goto L52
            com.kwad.components.ad.reward.g r0 = r4.tm
            int r0 = r0.mScreenOrientation
            r3 = 1
            if (r0 != r3) goto L38
            if (r5 == 0) goto L34
            r4.jh()
            return
        L34:
            r4.ji()
            return
        L38:
            if (r5 == 0) goto L4a
            com.kwad.components.ad.reward.widget.actionbar.ActionBarAppPortrait r5 = r4.xP
            if (r5 == 0) goto L51
            android.content.Context r0 = r4.getContext()
            int r0 = com.kwad.sdk.c.a.a.a(r0, r2)
            r4.h(r5, r0)
            return
        L4a:
            com.kwad.components.ad.reward.widget.actionbar.ActionBarAppPortrait r5 = r4.xP
            if (r5 == 0) goto L51
            r5.setVisibility(r1)
        L51:
            return
        L52:
            if (r5 == 0) goto L62
            com.kwad.components.ad.reward.widget.actionbar.ActionBarH5 r5 = r4.xQ
            android.content.Context r0 = r4.getContext()
            int r0 = com.kwad.sdk.c.a.a.a(r0, r2)
            r4.h(r5, r0)
            return
        L62:
            com.kwad.components.ad.reward.widget.actionbar.ActionBarH5 r5 = r4.xQ
            r5.setVisibility(r1)
            return
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdInfo a(com.kwad.components.ad.reward.presenter.platdetail.actionbar.b r0) {
            com.kwad.sdk.core.response.model.AdInfo r0 = r0.mAdInfo
            return r0
    }

    static /* synthetic */ void a(com.kwad.components.ad.reward.presenter.platdetail.actionbar.b r0, boolean r1, com.kwad.components.ad.reward.presenter.platdetail.actionbar.a r2) {
            r0.a(r1, r2)
            return
    }

    private void a(boolean r5, com.kwad.components.ad.reward.presenter.platdetail.actionbar.a r6) {
            r4 = this;
            boolean r0 = r4.xR
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.xR = r0
            com.kwad.components.core.widget.KsLogoView r1 = r4.vN
            com.kwad.sdk.core.response.model.AdInfo r2 = r4.mAdInfo
            boolean r2 = com.kwad.sdk.core.response.b.a.cR(r2)
            r3 = 0
            if (r2 == 0) goto L16
            r2 = 8
            goto L17
        L16:
            r2 = 0
        L17:
            r1.setVisibility(r2)
            r4.getContext()
            boolean r1 = com.kwad.sdk.utils.aq.QW()
            r1 = r1 ^ r0
            com.kwad.sdk.core.response.model.AdInfo r2 = r4.mAdInfo
            boolean r2 = com.kwad.sdk.core.response.b.a.bd(r2)
            if (r2 == 0) goto L66
            com.kwad.components.ad.reward.n.h r5 = r4.xW
            if (r5 != 0) goto L55
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.b$6 r5 = new com.kwad.components.ad.reward.presenter.platdetail.actionbar.b$6
            r5.<init>(r4, r1)
            r4.xW = r5
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.b$7 r0 = new com.kwad.components.ad.reward.presenter.platdetail.actionbar.b$7
            r0.<init>(r4)
            r5.a(r0)
            com.kwad.components.ad.reward.n.h r5 = r4.xW
            android.view.View r0 = r4.getRootView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r5.f(r0)
            com.kwad.components.ad.reward.n.h r5 = r4.xW
            com.kwad.sdk.core.response.model.AdTemplate r0 = r4.mAdTemplate
            com.kwad.components.core.e.d.c r1 = r4.mApkDownloadHelper
            com.kwad.components.ad.reward.n.r r0 = com.kwad.components.ad.reward.n.r.a(r0, r1)
            r5.b(r0)
        L55:
            com.kwad.components.ad.reward.n.h r5 = r4.xW
            r5.show()
            com.kwad.components.ad.reward.n.h r5 = r4.xW
            android.view.ViewGroup r5 = r5.hP()
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl$ShowActionBarResult r0 = com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.ShowActionBarResult.SHOW_NATIVE_PLAYABLE_PORTRAIT
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.a(r6, r5, r0)
            return
        L66:
            com.kwad.sdk.core.response.model.AdInfo r1 = r4.mAdInfo
            int r1 = com.kwad.sdk.core.response.b.a.ch(r1)
            if (r1 != r0) goto L7d
            android.view.ViewGroup r1 = r4.xT
            if (r1 == 0) goto L7d
            r1.setVisibility(r3)
            android.view.ViewGroup r5 = r4.xT
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl$ShowActionBarResult r0 = com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.ShowActionBarResult.SHOW_NATIVE_JINNIU
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.a(r6, r5, r0)
            return
        L7d:
            com.kwad.sdk.core.response.model.AdInfo r1 = r4.mAdInfo
            boolean r1 = com.kwad.sdk.core.response.b.a.cR(r1)
            if (r1 == 0) goto La0
            int r1 = com.kwad.sdk.R.id.ksad_reward_origin_live_root
            android.view.View r1 = r4.findViewById(r1)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r4.xV = r1
            if (r1 == 0) goto La0
            boolean r5 = r4.xX
            if (r5 != 0) goto L98
            r1.setVisibility(r3)
        L98:
            android.view.ViewGroup r5 = r4.xV
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl$ShowActionBarResult r0 = com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.ShowActionBarResult.SHOW_NATIVE_ORIGIN_LIVE
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.a(r6, r5, r0)
            return
        La0:
            com.kwad.sdk.core.response.model.AdTemplate r1 = r4.mAdTemplate
            boolean r1 = com.kwad.sdk.core.response.b.a.co(r1)
            if (r1 == 0) goto Ld3
            int r1 = com.kwad.sdk.R.id.ksad_reward_live_subscribe_root
            android.view.View r1 = r4.findViewById(r1)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r4.xU = r1
            if (r1 == 0) goto Ld3
            android.content.res.Resources r5 = r1.getResources()
            int r0 = com.kwad.sdk.R.dimen.ksad_live_subscribe_card_full_height
            float r0 = r5.getDimension(r0)
            int r1 = com.kwad.sdk.R.dimen.ksad_live_subscribe_card_margin
            float r5 = r5.getDimension(r1)
            float r0 = r0 + r5
            android.view.ViewGroup r5 = r4.xU
            int r0 = (int) r0
            r4.f(r5, r0)
            android.view.ViewGroup r5 = r4.xU
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl$ShowActionBarResult r0 = com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.ShowActionBarResult.SHOW_NATIVE_LIVE_SUBSCRIBE
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.a(r6, r5, r0)
            return
        Ld3:
            com.kwad.sdk.core.response.model.AdInfo r1 = r4.mAdInfo
            boolean r1 = com.kwad.sdk.core.response.b.a.aF(r1)
            if (r1 == 0) goto Le9
            com.kwad.components.ad.reward.g r1 = r4.tm
            int r1 = r1.mScreenOrientation
            if (r1 != r0) goto Le5
            r4.b(r5, r6)
            return
        Le5:
            r4.c(r5, r6)
            return
        Le9:
            r4.d(r5, r6)
            return
    }

    static /* synthetic */ boolean a(com.kwad.components.ad.reward.presenter.platdetail.actionbar.b r0, boolean r1) {
            r0.xX = r1
            return r1
    }

    static /* synthetic */ android.view.ViewGroup b(com.kwad.components.ad.reward.presenter.platdetail.actionbar.b r0) {
            android.view.ViewGroup r0 = r0.xV
            return r0
    }

    private void b(boolean r5, com.kwad.components.ad.reward.presenter.platdetail.actionbar.a r6) {
            r4 = this;
            r4.jf()
            com.kwad.components.ad.reward.widget.actionbar.ActionBarAppLandscape r0 = r4.xO
            com.kwad.sdk.core.response.model.AdTemplate r1 = r4.mAdTemplate
            com.kwad.components.core.e.d.c r2 = r4.mApkDownloadHelper
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.b$8 r3 = new com.kwad.components.ad.reward.presenter.platdetail.actionbar.b$8
            r3.<init>(r4)
            r0.a(r1, r2, r3)
            if (r5 == 0) goto L23
            com.kwad.components.ad.reward.widget.actionbar.ActionBarAppLandscape r5 = r4.xO
            android.content.Context r0 = r4.getContext()
            r1 = 1119092736(0x42b40000, float:90.0)
            int r0 = com.kwad.sdk.c.a.a.a(r0, r1)
            r4.g(r5, r0)
            goto L29
        L23:
            com.kwad.components.ad.reward.widget.actionbar.ActionBarAppLandscape r5 = r4.xO
            r0 = 0
            r5.setVisibility(r0)
        L29:
            com.kwad.components.ad.reward.widget.actionbar.ActionBarAppLandscape r5 = r4.xO
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl$ShowActionBarResult r0 = com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.ShowActionBarResult.SHOW_NATIVE_DEFAULT
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.a(r6, r5, r0)
            return
    }

    static /* synthetic */ boolean b(com.kwad.components.ad.reward.presenter.platdetail.actionbar.b r0, boolean r1) {
            r0.xS = r1
            return r1
    }

    private void bl() {
            r1 = this;
            android.animation.ValueAnimator r0 = r1.eX
            if (r0 == 0) goto Lc
            r0.removeAllListeners()
            android.animation.ValueAnimator r0 = r1.eX
            r0.cancel()
        Lc:
            return
    }

    static /* synthetic */ android.content.Context c(com.kwad.components.ad.reward.presenter.platdetail.actionbar.b r0) {
            android.content.Context r0 = r0.getContext()
            return r0
    }

    static /* synthetic */ void c(com.kwad.components.ad.reward.presenter.platdetail.actionbar.b r0, boolean r1) {
            r1 = 0
            r0.M(r1)
            return
    }

    private void c(boolean r5, com.kwad.components.ad.reward.presenter.platdetail.actionbar.a r6) {
            r4 = this;
            r4.jg()
            com.kwad.components.ad.reward.widget.actionbar.ActionBarAppPortrait r0 = r4.xP
            com.kwad.sdk.core.response.model.AdTemplate r1 = r4.mAdTemplate
            com.kwad.components.core.e.d.c r2 = r4.mApkDownloadHelper
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.b$9 r3 = new com.kwad.components.ad.reward.presenter.platdetail.actionbar.b$9
            r3.<init>(r4)
            r0.a(r1, r2, r3)
            if (r5 == 0) goto L23
            com.kwad.components.ad.reward.widget.actionbar.ActionBarAppPortrait r5 = r4.xP
            android.content.Context r0 = r4.getContext()
            r1 = 1119092736(0x42b40000, float:90.0)
            int r0 = com.kwad.sdk.c.a.a.a(r0, r1)
            r4.g(r5, r0)
            goto L29
        L23:
            com.kwad.components.ad.reward.widget.actionbar.ActionBarAppPortrait r5 = r4.xP
            r0 = 0
            r5.setVisibility(r0)
        L29:
            com.kwad.components.ad.reward.widget.actionbar.ActionBarAppPortrait r5 = r4.xP
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl$ShowActionBarResult r0 = com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.ShowActionBarResult.SHOW_NATIVE_DEFAULT
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.a(r6, r5, r0)
            return
    }

    static /* synthetic */ com.kwad.components.ad.reward.g d(com.kwad.components.ad.reward.presenter.platdetail.actionbar.b r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    private void d(boolean r4, com.kwad.components.ad.reward.presenter.platdetail.actionbar.a r5) {
            r3 = this;
            com.kwad.components.ad.reward.widget.actionbar.ActionBarH5 r0 = r3.xQ
            com.kwad.sdk.core.response.model.AdTemplate r1 = r3.mAdTemplate
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.b$10 r2 = new com.kwad.components.ad.reward.presenter.platdetail.actionbar.b$10
            r2.<init>(r3)
            r0.a(r1, r2)
            if (r4 == 0) goto L1e
            com.kwad.components.ad.reward.widget.actionbar.ActionBarH5 r4 = r3.xQ
            android.content.Context r0 = r3.getContext()
            r1 = 1119092736(0x42b40000, float:90.0)
            int r0 = com.kwad.sdk.c.a.a.a(r0, r1)
            r3.g(r4, r0)
            goto L24
        L1e:
            com.kwad.components.ad.reward.widget.actionbar.ActionBarH5 r4 = r3.xQ
            r0 = 0
            r4.setVisibility(r0)
        L24:
            com.kwad.components.ad.reward.widget.actionbar.ActionBarH5 r4 = r3.xQ
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl$ShowActionBarResult r0 = com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.ShowActionBarResult.SHOW_NATIVE_DEFAULT
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.a(r5, r4, r0)
            return
    }

    private void dm() {
            r2 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r2.mAdInfo
            boolean r0 = com.kwad.sdk.core.response.b.a.cL(r0)
            if (r0 == 0) goto L12
            int r0 = com.kwad.sdk.R.id.ksad_reward_jinniu_root
            android.view.View r0 = r2.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r2.xT = r0
        L12:
            com.kwad.components.core.widget.KsLogoView r0 = r2.vN
            com.kwad.sdk.core.response.model.AdTemplate r1 = r2.mAdTemplate
            r0.aP(r1)
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.core.e.d.c r1 = r0.mApkDownloadHelper
            r2.mApkDownloadHelper = r1
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl r0 = r0.rG
            r2.rG = r0
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl$b r1 = r2.xY
            r0.a(r1)
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.e.g r1 = r2.xZ
            r0.b(r1)
            return
    }

    static /* synthetic */ android.content.Context e(com.kwad.components.ad.reward.presenter.platdetail.actionbar.b r0) {
            android.content.Context r0 = r0.getContext()
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g f(com.kwad.components.ad.reward.presenter.platdetail.actionbar.b r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    private void f(android.view.View r5, int r6) {
            r4 = this;
            r4.bl()
            r0 = 0
            r5.setVisibility(r0)
            r1 = 1058306785(0x3f147ae1, float:0.58)
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            android.view.animation.Interpolator r1 = androidx.core.view.animation.PathInterpolatorCompat.create(r3, r3, r1, r2)
            android.animation.ValueAnimator r6 = com.kwad.components.core.t.o.c(r5, r6, r0)
            r4.eX = r6
            r6.setInterpolator(r1)
            android.animation.ValueAnimator r6 = r4.eX
            r0 = 500(0x1f4, double:2.47E-321)
            r6.setDuration(r0)
            android.animation.ValueAnimator r6 = r4.eX
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.b$11 r0 = new com.kwad.components.ad.reward.presenter.platdetail.actionbar.b$11
            r0.<init>(r4, r5)
            r6.addListener(r0)
            android.animation.ValueAnimator r5 = r4.eX
            r5.start()
            return
    }

    static /* synthetic */ android.content.Context g(com.kwad.components.ad.reward.presenter.platdetail.actionbar.b r0) {
            android.content.Context r0 = r0.getContext()
            return r0
    }

    @java.lang.Deprecated
    private void g(android.view.View r3, int r4) {
            r2 = this;
            r2.bl()
            r0 = 0
            r3.setVisibility(r0)
            android.animation.ValueAnimator r4 = com.kwad.components.core.t.o.b(r3, r0, r4)
            r2.eX = r4
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r1 = 1073741824(0x40000000, float:2.0)
            r0.<init>(r1)
            r4.setInterpolator(r0)
            android.animation.ValueAnimator r4 = r2.eX
            r0 = 500(0x1f4, double:2.47E-321)
            r4.setDuration(r0)
            android.animation.ValueAnimator r4 = r2.eX
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.b$2 r0 = new com.kwad.components.ad.reward.presenter.platdetail.actionbar.b$2
            r0.<init>(r2, r3)
            r4.addListener(r0)
            android.animation.ValueAnimator r3 = r2.eX
            r3.start()
            return
    }

    static /* synthetic */ com.kwad.components.ad.reward.g h(com.kwad.components.ad.reward.presenter.platdetail.actionbar.b r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    private void h(android.view.View r3, int r4) {
            r2 = this;
            r2.bl()
            r0 = 0
            r3.setVisibility(r0)
            android.animation.ValueAnimator r4 = com.kwad.components.core.t.o.b(r3, r4, r0)
            r2.eX = r4
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r1 = 1073741824(0x40000000, float:2.0)
            r0.<init>(r1)
            r4.setInterpolator(r0)
            android.animation.ValueAnimator r4 = r2.eX
            r0 = 300(0x12c, double:1.48E-321)
            r4.setDuration(r0)
            android.animation.ValueAnimator r4 = r2.eX
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.b$3 r0 = new com.kwad.components.ad.reward.presenter.platdetail.actionbar.b$3
            r0.<init>(r2, r3)
            r4.addListener(r0)
            android.animation.ValueAnimator r3 = r2.eX
            r3.start()
            return
    }

    static /* synthetic */ android.content.Context i(com.kwad.components.ad.reward.presenter.platdetail.actionbar.b r0) {
            android.content.Context r0 = r0.getContext()
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g j(com.kwad.components.ad.reward.presenter.platdetail.actionbar.b r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    private void jf() {
            r1 = this;
            int r0 = com.kwad.sdk.R.id.view_stub_action_bar_landscape
            android.view.View r0 = r1.findViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            if (r0 == 0) goto L13
            android.view.View r0 = r0.inflate()
            com.kwad.components.ad.reward.widget.actionbar.ActionBarAppLandscape r0 = (com.kwad.components.ad.reward.widget.actionbar.ActionBarAppLandscape) r0
            r1.xO = r0
            return
        L13:
            int r0 = com.kwad.sdk.R.id.ksad_video_play_bar_app_landscape
            android.view.View r0 = r1.findViewById(r0)
            com.kwad.components.ad.reward.widget.actionbar.ActionBarAppLandscape r0 = (com.kwad.components.ad.reward.widget.actionbar.ActionBarAppLandscape) r0
            r1.xO = r0
            return
    }

    private void jg() {
            r1 = this;
            int r0 = com.kwad.sdk.R.id.view_stub_action_bar
            android.view.View r0 = r1.findViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            if (r0 == 0) goto L13
            android.view.View r0 = r0.inflate()
            com.kwad.components.ad.reward.widget.actionbar.ActionBarAppPortrait r0 = (com.kwad.components.ad.reward.widget.actionbar.ActionBarAppPortrait) r0
            r1.xP = r0
            return
        L13:
            int r0 = com.kwad.sdk.R.id.ksad_video_play_bar_app_portrait
            android.view.View r0 = r1.findViewById(r0)
            com.kwad.components.ad.reward.widget.actionbar.ActionBarAppPortrait r0 = (com.kwad.components.ad.reward.widget.actionbar.ActionBarAppPortrait) r0
            r1.xP = r0
            return
    }

    private void jh() {
            r3 = this;
            r3.jg()
            com.kwad.components.ad.reward.widget.actionbar.ActionBarAppPortrait r0 = r3.xP
            android.content.Context r1 = r3.getContext()
            r2 = 1119092736(0x42b40000, float:90.0)
            int r1 = com.kwad.sdk.c.a.a.a(r1, r2)
            r3.g(r0, r1)
            return
    }

    private void ji() {
            r2 = this;
            com.kwad.components.ad.reward.widget.actionbar.ActionBarAppPortrait r0 = r2.xP
            if (r0 == 0) goto L9
            r1 = 8
            r0.setVisibility(r1)
        L9:
            return
    }

    static /* synthetic */ android.content.Context k(com.kwad.components.ad.reward.presenter.platdetail.actionbar.b r0) {
            android.content.Context r0 = r0.getContext()
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g l(com.kwad.components.ad.reward.presenter.platdetail.actionbar.b r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    static /* synthetic */ android.content.Context m(com.kwad.components.ad.reward.presenter.platdetail.actionbar.b r0) {
            android.content.Context r0 = r0.getContext()
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g n(com.kwad.components.ad.reward.presenter.platdetail.actionbar.b r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    protected final void N(boolean r5) {
            r4 = this;
            if (r5 == 0) goto L4
            r5 = 1
            goto L6
        L4:
            r5 = 153(0x99, float:2.14E-43)
        L6:
            com.kwad.sdk.core.adlog.c.b r0 = new com.kwad.sdk.core.adlog.c.b
            r0.<init>()
            com.kwad.components.ad.reward.g r1 = r4.tm
            com.kwad.sdk.core.view.AdBaseFrameLayout r1 = r1.mRootContainer
            com.kwad.sdk.utils.aj$a r1 = r1.getTouchCoords()
            com.kwad.sdk.core.adlog.c.b r0 = r0.f(r1)
            com.kwad.sdk.core.adlog.c.b r5 = r0.dd(r5)
            com.kwad.components.ad.reward.g r0 = r4.tm
            com.kwad.sdk.core.response.model.AdTemplate r1 = r0.mAdTemplate
            r2 = 0
            org.json.JSONObject r0 = r0.mReportExtData
            java.lang.String r3 = "native_id"
            com.kwad.components.ad.reward.j.b.a(r1, r3, r2, r5, r0)
            com.kwad.components.ad.reward.g r5 = r4.tm
            com.kwad.components.ad.reward.e.b r5 = r5.rD
            r5.cW()
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.b, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r2 = this;
            super.at()
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            r2.mAdTemplate = r0
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            r2.mAdInfo = r0
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.m.e r0 = r0.rE
            com.kwad.components.core.video.m r1 = r2.vR
            r0.a(r1)
            r2.dm()
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r1 = this;
            super.onCreate()
            int r0 = com.kwad.sdk.R.id.ksad_ad_label_play_bar
            android.view.View r0 = r1.findViewById(r0)
            com.kwad.components.core.widget.KsLogoView r0 = (com.kwad.components.core.widget.KsLogoView) r0
            r1.vN = r0
            int r0 = com.kwad.sdk.R.id.ksad_video_play_bar_h5
            android.view.View r0 = r1.findViewById(r0)
            com.kwad.components.ad.reward.widget.actionbar.ActionBarH5 r0 = (com.kwad.components.ad.reward.widget.actionbar.ActionBarH5) r0
            r1.xQ = r0
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r2 = this;
            super.onUnbind()
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl r0 = r2.rG
            if (r0 == 0) goto Lb
            r1 = 0
            r0.a(r1)
        Lb:
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.m.e r0 = r0.rE
            com.kwad.components.core.video.m r1 = r2.vR
            r0.b(r1)
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.e.g r1 = r2.xZ
            r0.c(r1)
            r2.bl()
            return
    }
}
