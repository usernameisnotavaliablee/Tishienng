package com.kwad.components.ad.reward.presenter.platdetail.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a extends com.kwad.components.ad.reward.presenter.b implements android.view.View.OnClickListener, com.kwad.sdk.utils.ca.a {
    private static final java.lang.String[] yB = null;
    private com.kwad.sdk.utils.ca bQ;
    private final com.kwad.components.core.video.m jE;
    private android.widget.TextView jV;
    private boolean jX;
    private long jY;
    private com.kwad.sdk.core.response.model.AdInfo mAdInfo;
    private com.kwad.components.core.e.d.c mApkDownloadHelper;
    private final com.kwad.components.ad.reward.e.l mRewardVerifyListener;
    private boolean yA;
    private boolean yC;
    private boolean yD;
    private android.widget.TextView yx;
    private android.widget.ImageView yy;
    private android.view.View yz;






    static {
            java.lang.String r0 = "已获得奖励1/2"
            java.lang.String r1 = "已获得全部奖励"
            java.lang.String r2 = "%ss后获得奖励1"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            com.kwad.components.ad.reward.presenter.platdetail.a.a.yB = r0
            return
    }

    public a() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.yA = r0
            r1.yC = r0
            r1.yD = r0
            com.kwad.components.ad.reward.presenter.platdetail.a.a$1 r0 = new com.kwad.components.ad.reward.presenter.platdetail.a.a$1
            r0.<init>(r1)
            r1.jE = r0
            com.kwad.components.ad.reward.presenter.platdetail.a.a$2 r0 = new com.kwad.components.ad.reward.presenter.platdetail.a.a$2
            r0.<init>(r1)
            r1.mRewardVerifyListener = r0
            return
    }

    private void G(int r5) {
            r4 = this;
            com.kwad.components.ad.reward.g r0 = r4.tm
            r0.so = r5
            com.kwad.sdk.core.response.model.AdTemplate r0 = r4.mAdTemplate
            boolean r0 = com.kwad.components.ad.reward.g.P(r0)
            if (r0 == 0) goto L28
            boolean r0 = r4.yC
            if (r0 != 0) goto L27
            android.widget.TextView r0 = r4.yx
            java.lang.String[] r1 = com.kwad.components.ad.reward.presenter.platdetail.a.a.yB
            r2 = 0
            r1 = r1[r2]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r5
            java.lang.String r5 = java.lang.String.format(r1, r3)
            r0.setText(r5)
        L27:
            return
        L28:
            android.widget.TextView r0 = r4.jV
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r0.setText(r5)
            return
    }

    static /* synthetic */ long a(com.kwad.components.ad.reward.presenter.platdetail.a.a r0, long r1) {
            r0.jY = r1
            return r1
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdInfo a(com.kwad.components.ad.reward.presenter.platdetail.a.a r0) {
            com.kwad.sdk.core.response.model.AdInfo r0 = r0.mAdInfo
            return r0
    }

    private void a(long r3, long r5, long r7) {
            r2 = this;
            r0 = 800(0x320, double:3.953E-321)
            long r0 = r5 - r0
            long r0 = r0 - r7
            r7 = 1
            int r8 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r8 >= 0) goto L26
            long r5 = r5 - r3
            float r3 = (float) r5
            r4 = 1148846080(0x447a0000, float:1000.0)
            float r3 = r3 / r4
            double r3 = (double) r3
            double r3 = java.lang.Math.floor(r3)
            int r3 = (int) r3
            if (r3 > 0) goto L18
            goto L19
        L18:
            r7 = r3
        L19:
            r2.G(r7)
            com.kwad.components.ad.reward.g r3 = r2.tm
            com.kwad.components.ad.reward.n.p r3 = r3.se
            if (r3 == 0) goto L8a
            r3.ah(r7)
            return
        L26:
            com.kwad.components.ad.reward.g r3 = r2.tm
            r3.rY = r7
            com.kwad.sdk.core.response.model.AdTemplate r3 = r2.mAdTemplate
            boolean r3 = com.kwad.components.ad.reward.g.P(r3)
            if (r3 == 0) goto L7a
            com.kwad.sdk.core.response.model.AdTemplate r3 = r2.mAdTemplate
            boolean r3 = com.kwad.components.ad.reward.g.N(r3)
            if (r3 == 0) goto L4e
            com.kwad.components.ad.reward.g r3 = r2.tm
            com.kwad.components.ad.reward.l.b.a r3 = r3.sm
            if (r3 == 0) goto L4e
            boolean r3 = r3.kL()
            if (r3 != 0) goto L69
            com.kwad.components.ad.reward.g r3 = r2.tm
            com.kwad.components.ad.reward.l.b.a r3 = r3.sm
            r3.kK()
            goto L69
        L4e:
            com.kwad.sdk.core.response.model.AdTemplate r3 = r2.mAdTemplate
            boolean r3 = com.kwad.components.ad.reward.g.O(r3)
            if (r3 == 0) goto L69
            com.kwad.components.ad.reward.g r3 = r2.tm
            com.kwad.components.ad.reward.l.a.a r3 = r3.sn
            if (r3 == 0) goto L69
            boolean r3 = r3.kL()
            if (r3 != 0) goto L69
            com.kwad.components.ad.reward.g r3 = r2.tm
            com.kwad.components.ad.reward.l.a.a r3 = r3.sn
            r3.kK()
        L69:
            boolean r3 = r2.yC
            if (r3 != 0) goto L8a
            android.widget.TextView r3 = r2.yx
            java.lang.String[] r4 = com.kwad.components.ad.reward.presenter.platdetail.a.a.yB
            r4 = r4[r7]
            r3.setText(r4)
            r2.jw()
            return
        L7a:
            r2.notifyRewardVerify()
            r2.jv()
            com.kwad.components.ad.reward.g r3 = r2.tm
            com.kwad.components.ad.reward.n.p r3 = r3.se
            if (r3 == 0) goto L8a
            r4 = 0
            r3.ah(r4)
        L8a:
            return
    }

    static /* synthetic */ boolean a(com.kwad.components.ad.reward.presenter.platdetail.a.a r0, boolean r1) {
            r1 = 1
            r0.yC = r1
            return r1
    }

    static /* synthetic */ boolean b(com.kwad.components.ad.reward.presenter.platdetail.a.a r0) {
            boolean r0 = r0.jX
            return r0
    }

    static /* synthetic */ com.kwad.sdk.utils.ca c(com.kwad.components.ad.reward.presenter.platdetail.a.a r0) {
            com.kwad.sdk.utils.ca r0 = r0.bQ
            return r0
    }

    static /* synthetic */ android.widget.TextView d(com.kwad.components.ad.reward.presenter.platdetail.a.a r0) {
            android.widget.TextView r0 = r0.yx
            return r0
    }

    private void dm() {
            r6 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r6.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            r6.mAdInfo = r0
            com.kwad.components.ad.reward.g r1 = r6.tm
            com.kwad.components.core.e.d.c r1 = r1.mApkDownloadHelper
            r6.mApkDownloadHelper = r1
            long r0 = com.kwad.sdk.core.response.b.a.M(r0)
            com.kwad.sdk.core.response.model.AdInfo r2 = r6.mAdInfo
            long r0 = com.kwad.components.ad.reward.g.a(r0, r2)
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            com.kwad.sdk.core.response.model.AdTemplate r2 = r6.mAdTemplate
            boolean r2 = com.kwad.components.ad.reward.g.P(r2)
            r3 = 8
            r4 = 0
            if (r2 == 0) goto L4c
            android.view.View r2 = r6.yz
            r2.setVisibility(r4)
            android.view.View r2 = r6.yz
            r2.setOnClickListener(r6)
            android.widget.TextView r2 = r6.yx
            java.lang.String[] r5 = com.kwad.components.ad.reward.presenter.platdetail.a.a.yB
            r5 = r5[r4]
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r4] = r0
            java.lang.String r0 = java.lang.String.format(r5, r1)
            r2.setText(r0)
            android.widget.TextView r0 = r6.jV
            r0.setVisibility(r3)
            goto L66
        L4c:
            android.view.View r2 = r6.yz
            r2.setVisibility(r3)
            android.widget.TextView r2 = r6.jV
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.setText(r0)
            android.widget.TextView r0 = r6.jV
            r0.setVisibility(r4)
            android.widget.TextView r0 = r6.jV
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setAlpha(r1)
        L66:
            com.kwad.components.ad.reward.b r0 = com.kwad.components.ad.reward.b.gk()
            com.kwad.components.ad.reward.e.l r1 = r6.mRewardVerifyListener
            r0.a(r1)
            com.kwad.components.ad.reward.g r0 = r6.tm
            com.kwad.components.ad.reward.m.e r0 = r0.rE
            com.kwad.components.core.video.m r1 = r6.jE
            r0.a(r1)
            return
    }

    static /* synthetic */ android.widget.TextView e(com.kwad.components.ad.reward.presenter.platdetail.a.a r0) {
            android.widget.TextView r0 = r0.jV
            return r0
    }

    static /* synthetic */ android.widget.ImageView f(com.kwad.components.ad.reward.presenter.platdetail.a.a r0) {
            android.widget.ImageView r0 = r0.yy
            return r0
    }

    static /* synthetic */ void g(com.kwad.components.ad.reward.presenter.platdetail.a.a r0) {
            r0.notifyAdClick()
            return
    }

    private void jv() {
            r2 = this;
            boolean r0 = r2.yA
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r2.yA = r0
            android.widget.ImageView r0 = r2.yy
            r1 = 0
            r0.setAlpha(r1)
            android.widget.ImageView r0 = r2.yy
            r1 = 0
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r2.yy
            r0.setOnClickListener(r2)
            r0 = 2
            float[] r0 = new float[r0]
            r0 = {x0038: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            com.kwad.components.ad.reward.presenter.platdetail.a.a$3 r1 = new com.kwad.components.ad.reward.presenter.platdetail.a.a$3
            r1.<init>(r2)
            r0.addListener(r1)
            com.kwad.components.ad.reward.presenter.platdetail.a.a$4 r1 = new com.kwad.components.ad.reward.presenter.platdetail.a.a$4
            r1.<init>(r2)
            r0.addUpdateListener(r1)
            r0.start()
            return
    }

    private void jw() {
            r1 = this;
            com.kwad.components.ad.reward.g r0 = r1.tm
            com.kwad.components.ad.reward.e.d r0 = r0.mAdRewardStepListener
            if (r0 == 0) goto L9
            r0.gp()
        L9:
            return
    }

    static /* synthetic */ java.lang.String[] jx() {
            java.lang.String[] r0 = com.kwad.components.ad.reward.presenter.platdetail.a.a.yB
            return r0
    }

    private void notifyAdClick() {
            r5 = this;
            com.kwad.sdk.core.adlog.c.b r0 = new com.kwad.sdk.core.adlog.c.b
            r0.<init>()
            com.kwad.components.ad.reward.g r1 = r5.tm
            com.kwad.sdk.core.view.AdBaseFrameLayout r1 = r1.mRootContainer
            com.kwad.sdk.utils.aj$a r1 = r1.getTouchCoords()
            com.kwad.sdk.core.adlog.c.b r0 = r0.f(r1)
            r1 = 41
            com.kwad.sdk.core.adlog.c.b r0 = r0.dd(r1)
            com.kwad.sdk.core.response.model.AdTemplate r1 = r5.mAdTemplate
            com.kwad.components.ad.reward.g r2 = r5.tm
            org.json.JSONObject r2 = r2.mReportExtData
            java.lang.String r3 = "native_id"
            java.lang.String r4 = "playTopBar-style1"
            com.kwad.components.ad.reward.j.b.a(r1, r3, r4, r0, r2)
            com.kwad.components.ad.reward.g r0 = r5.tm
            com.kwad.components.ad.reward.e.b r0 = r0.rD
            r0.cW()
            return
    }

    private void notifyRewardVerify() {
            r1 = this;
            com.kwad.components.ad.reward.g r0 = r1.tm
            com.kwad.components.ad.reward.e.b r0 = r0.rD
            r0.onRewardVerify()
            return
    }

    public final void a(long r10, long r12) {
            r9 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r9.mAdInfo
            boolean r0 = com.kwad.sdk.core.response.b.a.aO(r0)
            if (r0 == 0) goto L19
            com.kwad.components.core.r.a r0 = com.kwad.components.core.r.a.sF()
            int r0 = r0.sG()
            if (r0 != 0) goto L19
            com.kwad.sdk.core.response.model.AdInfo r0 = r9.mAdInfo
            int r0 = com.kwad.sdk.core.response.b.a.aM(r0)
            goto L1f
        L19:
            com.kwad.sdk.core.response.model.AdInfo r0 = r9.mAdInfo
            int r0 = com.kwad.sdk.core.response.b.a.aK(r0)
        L1f:
            com.kwad.components.ad.reward.g r1 = r9.tm
            boolean r2 = r1.rV
            if (r2 == 0) goto L28
            r2 = 1000(0x3e8, float:1.401E-42)
            goto L29
        L28:
            r2 = 0
        L29:
            int r0 = r0 * r2
            long r7 = (long) r0
            r4 = r10
            r2 = r12
            r6 = r7
            com.kwad.components.ad.reward.m.b(r1, r2, r4, r6)
            r7 = r6
            r5 = r4
            r3 = r2
            boolean r10 = r9.yD
            if (r10 != 0) goto L41
            com.kwad.components.ad.reward.g r2 = r9.tm
            boolean r10 = com.kwad.components.ad.reward.k.a(r2, r3, r5, r7)
            r9.yD = r10
        L41:
            r2 = r9
            r2.a(r3, r5, r7)
            return
    }

    @Override // com.kwad.sdk.utils.ca.a
    public final void a(android.os.Message r8) {
            r7 = this;
            int r8 = r8.what
            r0 = 1
            if (r8 != r0) goto L33
            com.kwad.components.ad.reward.g r8 = r7.tm
            boolean r8 = r8.gV()
            r1 = 500(0x1f4, double:2.47E-321)
            if (r8 != 0) goto L2e
            com.kwad.components.ad.reward.g r8 = r7.tm
            boolean r8 = r8.gU()
            if (r8 == 0) goto L18
            goto L2e
        L18:
            long r3 = r7.jY
            long r3 = r3 + r1
            r7.jY = r3
            com.kwad.sdk.core.response.model.AdInfo r8 = r7.mAdInfo
            long r3 = com.kwad.sdk.core.response.b.a.ag(r8)
            long r5 = r7.jY
            r7.a(r3, r5)
            com.kwad.sdk.utils.ca r8 = r7.bQ
            r8.sendEmptyMessageDelayed(r0, r1)
            return
        L2e:
            com.kwad.sdk.utils.ca r8 = r7.bQ
            r8.sendEmptyMessageDelayed(r0, r1)
        L33:
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.b, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r2 = this;
            super.at()
            com.kwad.sdk.utils.ca r0 = new com.kwad.sdk.utils.ca
            r0.<init>(r2)
            r2.bQ = r0
            r2.dm()
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.m.e r0 = r0.rE
            boolean r0 = r0.kW()
            if (r0 == 0) goto L25
            com.kwad.sdk.core.response.model.AdInfo r0 = r2.mAdInfo
            long r0 = com.kwad.sdk.core.response.b.a.ag(r0)
            float r0 = (float) r0
            r1 = 1148846080(0x447a0000, float:1000.0)
            float r0 = r0 / r1
            int r0 = (int) r0
            r2.G(r0)
        L25:
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r3) {
            r2 = this;
            android.widget.ImageView r0 = r2.yy
            if (r3 == r0) goto La
            android.view.View r0 = r2.yz
            if (r3 != r0) goto L9
            goto La
        L9:
            return
        La:
            com.kwad.components.core.e.d.a$a r0 = new com.kwad.components.core.e.d.a$a
            android.content.Context r3 = r3.getContext()
            r0.<init>(r3)
            com.kwad.sdk.core.response.model.AdTemplate r3 = r2.mAdTemplate
            com.kwad.components.core.e.d.a$a r3 = r0.aB(r3)
            com.kwad.components.core.e.d.c r0 = r2.mApkDownloadHelper
            com.kwad.components.core.e.d.a$a r3 = r3.b(r0)
            r0 = 2
            com.kwad.components.core.e.d.a$a r3 = r3.aB(r0)
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.m.e r0 = r0.rE
            long r0 = r0.getPlayDuration()
            com.kwad.components.core.e.d.a$a r3 = r3.A(r0)
            com.kwad.components.ad.reward.presenter.platdetail.a.a$5 r0 = new com.kwad.components.ad.reward.presenter.platdetail.a.a$5
            r0.<init>(r2)
            com.kwad.components.core.e.d.a$a r3 = r3.a(r0)
            com.kwad.components.core.e.d.a.a(r3)
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r1 = this;
            super.onCreate()
            int r0 = com.kwad.sdk.R.id.ksad_video_count_down
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.jV = r0
            int r0 = com.kwad.sdk.R.id.ksad_detail_reward_icon
            android.view.View r0 = r1.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1.yy = r0
            int r0 = com.kwad.sdk.R.id.ksad_reward_deep_task_count_down
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.yx = r0
            int r0 = com.kwad.sdk.R.id.ksad_detail_reward_deep_task_view
            android.view.View r0 = r1.findViewById(r0)
            r1.yz = r0
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r2 = this;
            super.onUnbind()
            com.kwad.components.ad.reward.b r0 = com.kwad.components.ad.reward.b.gk()
            com.kwad.components.ad.reward.e.l r1 = r2.mRewardVerifyListener
            r0.b(r1)
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.m.e r0 = r0.rE
            com.kwad.components.core.video.m r1 = r2.jE
            r0.b(r1)
            android.widget.ImageView r0 = r2.yy
            r1 = 8
            r0.setVisibility(r1)
            android.view.View r0 = r2.yz
            r0.setVisibility(r1)
            r0 = 0
            r2.yA = r0
            r2.yC = r0
            r2.jX = r0
            return
    }
}
