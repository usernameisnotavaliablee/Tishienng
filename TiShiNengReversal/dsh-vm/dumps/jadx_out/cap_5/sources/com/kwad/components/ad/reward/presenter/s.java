package com.kwad.components.ad.reward.presenter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class s extends com.kwad.components.ad.reward.presenter.b implements com.kwad.components.ad.reward.e.g, com.kwad.components.core.j.a.InterfaceC0078a, com.kwad.components.core.webview.jshandler.y.b {
    private java.util.List<com.kwad.components.core.j.c> bK;
    private com.kwad.sdk.core.webview.d.a.a eT;
    private com.kwad.components.core.video.m jE;

    @androidx.annotation.Nullable
    private com.kwad.components.ad.reward.d rJ;
    private long showTime;
    private android.widget.ImageView vy;
    private com.kwad.components.core.widget.KsLogoView wA;
    private com.kwad.components.core.video.DetailVideoView wB;
    private int wC;
    private android.view.View wD;
    private android.widget.FrameLayout wE;
    private android.animation.Animator wF;
    private android.animation.Animator wG;
    private android.animation.Animator wH;
    private com.kwad.sdk.core.response.model.AdTemplate wI;
    private long wJ;
    private long wK;
    private float wL;
    private float wM;
    private float wN;
    private boolean wO;
    private long wP;
    private boolean wQ;

    @com.kwad.components.ad.reward.presenter.RewardPreEndCardPresenter.PreEndPageStatus
    private int wy;
    private android.view.View wz;






    public s() {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.wy = r0
            r0 = 500(0x1f4, double:2.47E-321)
            r2.wJ = r0
            r0 = 50
            r2.wK = r0
            r0 = 1067244765(0x3f9cdcdd, float:1.2254902)
            r2.wL = r0
            r0 = 1062076979(0x3f4e0233, float:0.80472106)
            r2.wM = r0
            r0 = 0
            r2.wN = r0
            r0 = 0
            r2.wO = r0
            r0 = -1
            r2.showTime = r0
            r2.wP = r0
            com.kwad.components.ad.reward.presenter.s$1 r0 = new com.kwad.components.ad.reward.presenter.s$1
            r0.<init>(r2)
            r2.jE = r0
            com.kwad.components.ad.reward.presenter.s$5 r0 = new com.kwad.components.ad.reward.presenter.s$5
            r0.<init>(r2)
            r2.eT = r0
            return
    }

    private boolean J(boolean r9) {
            r8 = this;
            float r0 = r8.iS()
            int r0 = r8.b(r0)
            r8.ab(r0)
            com.kwad.components.ad.reward.d r1 = r8.rJ
            r2 = 0
            if (r1 == 0) goto L15
            boolean r1 = r1.aW()
            goto L16
        L15:
            r1 = 0
        L16:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "webLoadSuccess: "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "RewardPreEndCardPresenter"
            com.kwad.sdk.core.d.c.d(r4, r3)
            if (r1 != 0) goto L2c
            return r2
        L2c:
            float r1 = r8.iS()
            int r5 = r8.a(r1)
            int r0 = -r0
            float r4 = (float) r0
            r8.wN = r4
            r3 = 1
            r6 = 1
            r2 = r8
            r7 = r9
            android.animation.Animator r9 = r2.a(r3, r4, r5, r6, r7)
            r2.wF = r9
            r9.start()
            android.animation.Animator r9 = r8.iR()
            r2.wH = r9
            r9.start()
            r9 = 2
            r2.wy = r9
            r9 = 1
            return r9
    }

    private void K(boolean r9) {
            r8 = this;
            float r0 = r8.iS()
            float r1 = r8.iT()
            float r0 = r0 - r1
            float r1 = r8.wN
            float r4 = r0 + r1
            float r0 = r8.iT()
            int r5 = r8.a(r0)
            r3 = 0
            r6 = 0
            r2 = r8
            r7 = r9
            android.animation.Animator r9 = r2.a(r3, r4, r5, r6, r7)
            r2.wG = r9
            r9.start()
            com.kwad.sdk.core.local.a.Hq()
            com.kwad.sdk.core.response.model.AdTemplate r9 = r2.wI
            com.kwad.sdk.core.local.a.ch(r9)
            r9 = 3
            r2.wy = r9
            com.kwad.components.ad.reward.d r9 = r2.rJ
            if (r9 == 0) goto L34
            r9.gu()
        L34:
            return
    }

    private int a(float r2) {
            r1 = this;
            android.app.Activity r0 = r1.getActivity()
            int r0 = com.kwad.sdk.c.a.a.g(r0)
            float r0 = (float) r0
            float r0 = r0 - r2
            int r2 = (int) r0
            return r2
    }

    private int a(com.kwad.components.ad.reward.e.g r2) {
            r1 = this;
            int r0 = r1.getPriority()
            int r2 = r2.getPriority()
            int r0 = r0 - r2
            return r0
    }

    private android.animation.Animator a(boolean r8, float r9, int r10, boolean r11, boolean r12) {
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getUpAnimator: translationY0: "
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r1 = ", videoTargetHeight: "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "RewardPreEndCardPresenter"
            com.kwad.sdk.core.d.c.d(r1, r0)
            r0 = 2
            r1 = 0
            r2 = 1
            if (r8 == 0) goto L2d
            android.view.View r8 = r7.wz
            float[] r3 = new float[r2]
            r3[r1] = r9
            java.lang.String r9 = "translationY"
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r8, r9, r3)
            goto L50
        L2d:
            android.view.View r8 = r7.wz
            int r8 = r8.getHeight()
            android.view.View r3 = r7.wz
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            float r8 = (float) r8
            float r9 = java.lang.Math.abs(r9)
            float[] r4 = new float[r0]
            r4[r1] = r8
            r4[r2] = r9
            android.animation.ValueAnimator r8 = android.animation.ValueAnimator.ofFloat(r4)
            com.kwad.components.ad.reward.presenter.s$3 r9 = new com.kwad.components.ad.reward.presenter.s$3
            r9.<init>(r7, r3)
            r8.addUpdateListener(r9)
        L50:
            if (r11 == 0) goto L60
            com.kwad.components.core.widget.KsLogoView r9 = r7.wA
            float[] r11 = new float[r0]
            r11 = {x00c0: FILL_ARRAY_DATA , data: [0, 1132396544} // fill-array
            java.lang.String r3 = "alpha"
            android.animation.ObjectAnimator r9 = android.animation.ObjectAnimator.ofFloat(r9, r3, r11)
            goto L61
        L60:
            r9 = 0
        L61:
            android.widget.ImageView r11 = r7.vy
            android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
            com.kwad.components.core.video.DetailVideoView r3 = r7.wB
            com.kwad.sdk.core.response.model.AdTemplate r4 = r7.mAdTemplate
            com.kwad.components.ad.reward.presenter.s$4 r5 = new com.kwad.components.ad.reward.presenter.s$4
            r5.<init>(r7, r11)
            android.animation.ValueAnimator r10 = r3.a(r4, r10, r5)
            if (r12 == 0) goto L79
            long r3 = r7.wJ
            goto L7b
        L79:
            long r3 = r7.wK
        L7b:
            r11 = 1058306785(0x3f147ae1, float:0.58)
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            android.view.animation.Interpolator r11 = androidx.core.view.animation.PathInterpolatorCompat.create(r6, r6, r11, r5)
            android.animation.AnimatorSet r5 = new android.animation.AnimatorSet
            r5.<init>()
            r5.setDuration(r3)
            r5.setInterpolator(r11)
            if (r9 == 0) goto Lab
            if (r12 == 0) goto La1
            r11 = 3
            android.animation.Animator[] r11 = new android.animation.Animator[r11]
            r11[r1] = r8
            r11[r2] = r9
            r11[r0] = r10
            r5.playTogether(r11)
            return r5
        La1:
            android.animation.Animator[] r10 = new android.animation.Animator[r0]
            r10[r1] = r8
            r10[r2] = r9
            r5.playTogether(r10)
            return r5
        Lab:
            if (r12 == 0) goto Lb7
            android.animation.Animator[] r9 = new android.animation.Animator[r0]
            r9[r1] = r8
            r9[r2] = r10
            r5.playTogether(r9)
            return r5
        Lb7:
            android.animation.Animator[] r9 = new android.animation.Animator[r2]
            r9[r1] = r8
            r5.playTogether(r9)
            return r5
    }

    static /* synthetic */ android.view.View a(com.kwad.components.ad.reward.presenter.s r0) {
            android.view.View r0 = r0.wz
            return r0
    }

    static /* synthetic */ void a(com.kwad.components.ad.reward.presenter.s r0, long r1) {
            r0.k(r1)
            return
    }

    private void ab(int r3) {
            r2 = this;
            android.view.View r0 = r2.wz
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r1 = r0 instanceof android.widget.FrameLayout.LayoutParams
            if (r1 == 0) goto L12
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            r0.height = r3
            int r3 = -r3
            r0.bottomMargin = r3
            return
        L12:
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = -1
            r0.<init>(r1, r3)
            r0.height = r3
            int r3 = -r3
            r0.bottomMargin = r3
            android.view.View r3 = r2.wz
            r3.setLayoutParams(r0)
            return
    }

    private int b(float r4) {
            r3 = this;
            android.content.Context r0 = r3.getContext()
            android.content.res.Resources r0 = r0.getResources()
            int r1 = com.kwad.sdk.R.dimen.ksad_reward_middle_end_card_logo_view_height
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.Context r1 = r3.getContext()
            android.content.res.Resources r1 = r1.getResources()
            int r2 = com.kwad.sdk.R.dimen.ksad_reward_middle_end_card_logo_view_margin_bottom
            int r1 = r1.getDimensionPixelSize(r2)
            float r0 = (float) r0
            float r4 = r4 + r0
            float r0 = (float) r1
            float r4 = r4 + r0
            int r4 = (int) r4
            return r4
    }

    static /* synthetic */ android.widget.ImageView b(com.kwad.components.ad.reward.presenter.s r0) {
            android.widget.ImageView r0 = r0.vy
            return r0
    }

    static /* synthetic */ java.util.List c(com.kwad.components.ad.reward.presenter.s r0) {
            java.util.List<com.kwad.components.core.j.c> r0 = r0.bK
            return r0
    }

    private void f(java.util.List<com.kwad.sdk.core.response.model.AdTemplate> r8) {
            r7 = this;
            com.kwad.components.ad.reward.d r0 = new com.kwad.components.ad.reward.d
            com.kwad.components.ad.reward.g r1 = r7.tm
            org.json.JSONObject r1 = r1.mReportExtData
            r0.<init>(r8, r1, r7)
            r7.rJ = r0
            com.kwad.components.ad.reward.g r8 = r7.tm
            r8.rJ = r0
            com.kwad.sdk.core.response.model.AdTemplate r8 = r7.mAdTemplate
            boolean r8 = com.kwad.sdk.core.response.b.b.cF(r8)
            r0.setShowLandingPage(r8)
            com.kwad.components.ad.reward.d r8 = r7.rJ
            com.kwad.sdk.core.webview.d.a.a r0 = r7.eT
            r8.a(r0)
            com.kwad.components.ad.reward.d r1 = r7.rJ
            android.widget.FrameLayout r2 = r7.wE
            com.kwad.components.ad.reward.g r8 = r7.tm
            com.kwad.sdk.core.view.AdBaseFrameLayout r3 = r8.mRootContainer
            com.kwad.sdk.core.response.model.AdTemplate r4 = r7.mAdTemplate
            com.kwad.components.core.e.d.c r5 = r8.mApkDownloadHelper
            int r6 = r8.mScreenOrientation
            r1.a(r2, r3, r4, r5, r6)
            java.lang.String r8 = "RewardPreEndCardPresenter"
            java.lang.String r0 = "startPreloadWebView"
            com.kwad.sdk.core.d.c.d(r8, r0)
            com.kwad.components.ad.reward.d r8 = r7.rJ
            com.kwad.components.ad.reward.presenter.s$2 r0 = new com.kwad.components.ad.reward.presenter.s$2
            r0.<init>(r7)
            r8.a(r0)
            return
    }

    private android.animation.Animator iR() {
            r4 = this;
            android.view.View r0 = r4.wD
            r1 = 2
            float[] r1 = new float[r1]
            r1 = {x0022: FILL_ARRAY_DATA , data: [1132396544, 0} // fill-array
            java.lang.String r2 = "alpha"
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r0, r2, r1)
            r1 = 1036831949(0x3dcccccd, float:0.1)
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1048576000(0x3e800000, float:0.25)
            android.view.animation.Interpolator r1 = androidx.core.view.animation.PathInterpolatorCompat.create(r3, r1, r3, r2)
            r0.setInterpolator(r1)
            r1 = 200(0xc8, double:9.9E-322)
            r0.setDuration(r1)
            return r0
    }

    private float iS() {
            r2 = this;
            android.app.Activity r0 = r2.getActivity()
            int r0 = com.kwad.sdk.c.a.a.f(r0)
            float r0 = (float) r0
            float r1 = r2.wL
            float r0 = r0 / r1
            return r0
    }

    private float iT() {
            r2 = this;
            android.app.Activity r0 = r2.getActivity()
            int r0 = com.kwad.sdk.c.a.a.f(r0)
            float r0 = (float) r0
            float r1 = r2.wM
            float r0 = r0 / r1
            return r0
    }

    private void k(long r8) {
            r7 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r7.wI
            if (r0 != 0) goto L5
            goto L6c
        L5:
            boolean r1 = r7.wQ
            if (r1 == 0) goto La
            goto L6c
        La:
            long r1 = r7.showTime
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L23
            long r0 = com.kwad.sdk.core.response.b.b.cC(r0)
            r7.showTime = r0
            com.kwad.sdk.core.response.model.AdTemplate r0 = r7.wI
            long r0 = com.kwad.sdk.core.response.b.b.cB(r0)
            long r5 = r7.showTime
            long r0 = r0 + r5
            r7.wP = r0
        L23:
            long r0 = r7.showTime
            r2 = 1
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 <= 0) goto L55
            boolean r5 = r7.wO
            if (r5 != 0) goto L55
            int r5 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r5 <= 0) goto L55
            boolean r0 = r7.J(r2)
            r0 = r0 ^ r2
            r7.wQ = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "showError: "
            r0.<init>(r1)
            boolean r1 = r7.wQ
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "RewardPreEndCardPresenter"
            com.kwad.sdk.core.d.c.d(r1, r0)
            boolean r0 = r7.wQ
            if (r0 == 0) goto L53
            goto L6c
        L53:
            r7.wO = r2
        L55:
            int r0 = r7.wy
            r1 = 3
            if (r0 != r1) goto L5c
            r0 = 1
            goto L5d
        L5c:
            r0 = 0
        L5d:
            long r5 = r7.wP
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 <= 0) goto L6c
            if (r0 != 0) goto L6c
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r0 <= 0) goto L6c
            r7.K(r2)
        L6c:
            return
    }

    @Override // com.kwad.components.core.webview.jshandler.y.b
    public final void W(com.kwad.sdk.core.response.model.AdTemplate r3) {
            r2 = this;
            com.kwad.components.core.j.c r0 = new com.kwad.components.core.j.c
            int r1 = com.kwad.components.core.j.e.AGGREGATION
            r0.<init>(r3, r1)
            com.kwad.components.ad.reward.g r3 = r2.tm
            if (r3 == 0) goto Le
            r3.b(r0)
        Le:
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.b, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r2 = this;
            super.at()
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.m.e r0 = r0.rE
            com.kwad.components.core.video.m r1 = r2.jE
            r0.a(r1)
            com.kwad.components.ad.reward.g r0 = r2.tm
            r0.b(r2)
            com.kwad.components.ad.reward.g r0 = r2.tm
            r0.a(r2)
            com.kwad.components.core.video.DetailVideoView r0 = r2.wB
            int r0 = com.kwad.sdk.c.a.a.J(r0)
            r2.wC = r0
            com.kwad.components.core.video.DetailVideoView r0 = r2.wB
            r1 = 49
            com.kwad.sdk.c.a.a.n(r0, r1)
            com.kwad.components.core.widget.KsLogoView r0 = r2.wA
            com.kwad.sdk.core.response.model.AdTemplate r1 = r2.mAdTemplate
            r0.aP(r1)
            return
    }

    @Override // com.kwad.components.ad.reward.e.g
    public final void cX() {
            r3 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.wI
            if (r0 == 0) goto L1b
            int r0 = r3.wy
            r1 = 3
            if (r0 != r1) goto La
            goto L1b
        La:
            r1 = 1
            if (r0 != r1) goto L15
            r0 = 0
            r3.J(r0)
            r3.K(r0)
            return
        L15:
            r2 = 2
            if (r0 != r2) goto L1b
            r3.K(r1)
        L1b:
            return
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(com.kwad.components.ad.reward.e.g r1) {
            r0 = this;
            com.kwad.components.ad.reward.e.g r1 = (com.kwad.components.ad.reward.e.g) r1
            int r1 = r0.a(r1)
            return r1
    }

    @Override // com.kwad.components.core.j.a.InterfaceC0078a
    public final void e(@androidx.annotation.Nullable java.util.List<com.kwad.components.core.j.c> r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onInnerAdLoad: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "RewardPreEndCardPresenter"
            com.kwad.sdk.core.d.c.d(r1, r0)
            if (r3 == 0) goto L3f
            int r0 = r3.size()
            if (r0 != 0) goto L1c
            goto L3f
        L1c:
            r0 = 0
            java.lang.Object r0 = r3.get(r0)
            com.kwad.components.core.j.c r0 = (com.kwad.components.core.j.c) r0
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.getAdTemplate()
            r2.wI = r0
            r2.bK = r3
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.kwad.sdk.core.response.model.AdTemplate r1 = r2.mAdTemplate
            r0.add(r1)
            java.util.List r3 = com.kwad.components.core.j.c.n(r3)
            r0.addAll(r3)
            r2.f(r0)
        L3f:
            return
    }

    @Override // com.kwad.components.ad.reward.e.g
    public final int getPriority() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r1 = this;
            super.onCreate()
            int r0 = com.kwad.sdk.R.id.ksad_middle_end_card
            android.view.View r0 = r1.findViewById(r0)
            r1.wz = r0
            int r0 = com.kwad.sdk.R.id.ksad_video_player
            android.view.View r0 = r1.findViewById(r0)
            com.kwad.components.core.video.DetailVideoView r0 = (com.kwad.components.core.video.DetailVideoView) r0
            r1.wB = r0
            int r0 = com.kwad.sdk.R.id.ksad_splash_logo_container
            android.view.View r0 = r1.findViewById(r0)
            com.kwad.components.core.widget.KsLogoView r0 = (com.kwad.components.core.widget.KsLogoView) r0
            r1.wA = r0
            int r0 = com.kwad.sdk.R.id.ksad_blur_video_cover
            android.view.View r0 = r1.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1.vy = r0
            int r0 = com.kwad.sdk.R.id.ksad_play_web_card_webView
            android.view.View r0 = r1.findViewById(r0)
            r1.wD = r0
            int r0 = com.kwad.sdk.R.id.ksad_middle_end_card_webview_container
            android.view.View r0 = r1.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r1.wE = r0
            return
    }

    @Override // com.kwad.components.core.j.a.InterfaceC0078a
    public final void onError(int r2, java.lang.String r3) {
            r1 = this;
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "onError : msg "
            r2.<init>(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "RewardPreEndCardPresenter"
            com.kwad.sdk.core.d.c.w(r3, r2)
            return
    }

    @Override // com.kwad.components.core.j.a.InterfaceC0078a
    public final void onRequestResult(int r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onRequestResult : adNumber "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "RewardPreEndCardPresenter"
            com.kwad.sdk.core.d.c.w(r0, r3)
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r2 = this;
            super.onUnbind()
            com.kwad.components.ad.reward.g r0 = r2.tm
            r1 = 0
            r0.sl = r1
            com.kwad.components.ad.reward.m.e r0 = r0.rE
            com.kwad.components.core.video.m r1 = r2.jE
            r0.b(r1)
            com.kwad.components.ad.reward.g r0 = r2.tm
            r0.c(r2)
            com.kwad.components.ad.reward.g r0 = r2.tm
            r0.b(r2)
            com.kwad.components.ad.reward.d r0 = r2.rJ
            if (r0 == 0) goto L20
            r0.ny()
        L20:
            android.animation.Animator r0 = r2.wH
            if (r0 == 0) goto L27
            r0.cancel()
        L27:
            com.kwad.components.core.video.DetailVideoView r0 = r2.wB
            if (r0 == 0) goto L30
            int r1 = r2.wC
            com.kwad.sdk.c.a.a.n(r0, r1)
        L30:
            android.animation.Animator r0 = r2.wF
            if (r0 == 0) goto L37
            r0.cancel()
        L37:
            r0 = 0
            r2.wH = r0
            r2.wF = r0
            return
    }
}
