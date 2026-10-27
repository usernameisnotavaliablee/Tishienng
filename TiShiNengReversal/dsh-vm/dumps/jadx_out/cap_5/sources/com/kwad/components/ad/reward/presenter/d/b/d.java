package com.kwad.components.ad.reward.presenter.d.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class d extends com.kwad.components.ad.reward.presenter.b implements android.view.View.OnClickListener, com.kwad.components.ad.reward.presenter.d.b.c {
    private static final java.lang.String[] zr = null;
    private final com.kwad.components.ad.reward.e.l mRewardVerifyListener;
    private android.view.ViewGroup zn;
    private android.widget.ImageView zo;
    private android.view.ViewGroup zp;
    private android.widget.TextView zq;



    static {
            java.lang.String r0 = "已获得奖励1/2"
            java.lang.String r1 = "已获得全部奖励"
            java.lang.String r2 = "未获得奖励"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            com.kwad.components.ad.reward.presenter.d.b.d.zr = r0
            return
    }

    public d() {
            r1 = this;
            r1.<init>()
            com.kwad.components.ad.reward.presenter.d.b.d$1 r0 = new com.kwad.components.ad.reward.presenter.d.b.d$1
            r0.<init>(r1)
            r1.mRewardVerifyListener = r0
            return
    }

    static /* synthetic */ com.kwad.components.ad.reward.g a(com.kwad.components.ad.reward.presenter.d.b.d r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    static /* synthetic */ void b(com.kwad.components.ad.reward.presenter.d.b.d r0) {
            r0.jR()
            return
    }

    static /* synthetic */ void c(com.kwad.components.ad.reward.presenter.d.b.d r0) {
            r0.notifyAdClick()
            return
    }

    private void dm() {
            r3 = this;
            com.kwad.components.ad.reward.b r0 = com.kwad.components.ad.reward.b.gk()
            com.kwad.components.ad.reward.e.l r1 = r3.mRewardVerifyListener
            r0.a(r1)
            android.view.ViewGroup r0 = r3.zn
            r1 = 0
            r0.setVisibility(r1)
            android.view.ViewGroup r0 = r3.zp
            com.kwad.components.ad.reward.g r2 = r3.tm
            com.kwad.sdk.core.response.model.AdTemplate r2 = r2.mAdTemplate
            boolean r2 = com.kwad.components.ad.reward.g.P(r2)
            if (r2 == 0) goto L1c
            goto L1e
        L1c:
            r1 = 8
        L1e:
            r0.setVisibility(r1)
            return
    }

    private void jQ() {
            r2 = this;
            android.widget.ImageView r0 = r2.zo
            r1 = 0
            if (r0 == 0) goto Ld
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r2.zo
            r0.setOnClickListener(r2)
        Ld:
            android.view.ViewGroup r0 = r2.zn
            if (r0 == 0) goto L19
            r0.setOnClickListener(r2)
            android.view.ViewGroup r0 = r2.zn
            r0.setVisibility(r1)
        L19:
            return
    }

    private void jR() {
            r3 = this;
            android.widget.TextView r0 = r3.zq
            java.lang.String[] r1 = com.kwad.components.ad.reward.presenter.d.b.d.zr
            r2 = 2
            r1 = r1[r2]
            r0.setText(r1)
            return
    }

    private void notifyAdClick() {
            r4 = this;
            com.kwad.sdk.core.adlog.c.b r0 = new com.kwad.sdk.core.adlog.c.b
            r0.<init>()
            com.kwad.components.ad.reward.g r1 = r4.tm
            com.kwad.sdk.core.view.AdBaseFrameLayout r1 = r1.mRootContainer
            com.kwad.sdk.utils.aj$a r1 = r1.getTouchCoords()
            com.kwad.sdk.core.adlog.c.b r0 = r0.f(r1)
            r1 = 41
            com.kwad.sdk.core.adlog.c.b r0 = r0.dd(r1)
            com.kwad.components.ad.reward.g r1 = r4.tm
            com.kwad.sdk.core.response.model.AdTemplate r2 = r1.mAdTemplate
            r3 = 0
            org.json.JSONObject r1 = r1.mReportExtData
            com.kwad.components.ad.reward.j.b.a(r2, r3, r3, r0, r1)
            com.kwad.components.ad.reward.g r0 = r4.tm
            com.kwad.components.ad.reward.e.b r0 = r0.rD
            r0.cW()
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.b, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r0 = this;
            super.at()
            r0.dm()
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.d.b.c
    public final void jO() {
            r3 = this;
            com.kwad.components.ad.reward.g r0 = r3.tm
            boolean r1 = r0.sf
            if (r1 == 0) goto L1a
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            boolean r0 = com.kwad.sdk.core.response.b.a.as(r0)
            if (r0 == 0) goto L58
            android.view.ViewGroup r0 = r3.zp
            r1 = 8
            r0.setVisibility(r1)
            return
        L1a:
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            boolean r0 = com.kwad.components.ad.reward.g.N(r0)
            if (r0 != 0) goto L3a
            com.kwad.components.ad.reward.g r0 = r3.tm
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            boolean r0 = com.kwad.components.ad.reward.g.O(r0)
            if (r0 == 0) goto L2d
            goto L3a
        L2d:
            com.kwad.components.ad.reward.g r0 = r3.tm
            boolean r0 = r0.gW()
            if (r0 != 0) goto L36
            goto L58
        L36:
            r3.jQ()
            return
        L3a:
            com.kwad.components.ad.reward.g r0 = r3.tm
            boolean r0 = r0.gW()
            if (r0 != 0) goto L58
            android.widget.TextView r0 = r3.zq
            com.kwad.components.ad.reward.g r1 = r3.tm
            boolean r1 = r1.rY
            if (r1 == 0) goto L50
            java.lang.String[] r1 = com.kwad.components.ad.reward.presenter.d.b.d.zr
            r2 = 1
            r1 = r1[r2]
            goto L55
        L50:
            java.lang.String[] r1 = com.kwad.components.ad.reward.presenter.d.b.d.zr
            r2 = 0
            r1 = r1[r2]
        L55:
            r0.setText(r1)
        L58:
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r2) {
            r1 = this;
            android.widget.ImageView r0 = r1.zo
            if (r2 == r0) goto La
            android.view.ViewGroup r0 = r1.zn
            if (r2 != r0) goto L9
            goto La
        L9:
            return
        La:
            com.kwad.components.core.e.d.a$a r0 = new com.kwad.components.core.e.d.a$a
            android.content.Context r2 = r2.getContext()
            r0.<init>(r2)
            com.kwad.components.ad.reward.g r2 = r1.tm
            com.kwad.sdk.core.response.model.AdTemplate r2 = r2.mAdTemplate
            com.kwad.components.core.e.d.a$a r2 = r0.aB(r2)
            com.kwad.components.ad.reward.g r0 = r1.tm
            com.kwad.components.core.e.d.c r0 = r0.mApkDownloadHelper
            com.kwad.components.core.e.d.a$a r2 = r2.b(r0)
            r0 = 0
            com.kwad.components.core.e.d.a$a r2 = r2.aq(r0)
            r0 = 2
            com.kwad.components.core.e.d.a$a r2 = r2.aB(r0)
            com.kwad.components.ad.reward.presenter.d.b.d$2 r0 = new com.kwad.components.ad.reward.presenter.d.b.d$2
            r0.<init>(r1)
            com.kwad.components.core.e.d.a$a r2 = r2.a(r0)
            com.kwad.components.core.e.d.a.a(r2)
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r1 = this;
            super.onCreate()
            int r0 = com.kwad.sdk.R.id.ksad_end_reward_icon_layout
            android.view.View r0 = r1.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r1.zn = r0
            int r0 = com.kwad.sdk.R.id.ksad_end_reward_icon
            android.view.View r0 = r1.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1.zo = r0
            int r0 = com.kwad.sdk.R.id.ksad_detail_reward_deep_task_view_playend
            android.view.View r0 = r1.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r1.zp = r0
            int r0 = com.kwad.sdk.R.id.ksad_reward_deep_task_count_down_playend
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.zq = r0
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r2 = this;
            super.onUnbind()
            com.kwad.components.ad.reward.b r0 = com.kwad.components.ad.reward.b.gk()
            com.kwad.components.ad.reward.e.l r1 = r2.mRewardVerifyListener
            r0.b(r1)
            android.view.ViewGroup r0 = r2.zn
            r1 = 8
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r2.zo
            r0.setVisibility(r1)
            android.view.ViewGroup r0 = r2.zp
            r0.setVisibility(r1)
            return
    }
}
