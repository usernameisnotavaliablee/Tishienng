package com.kwad.components.ad.reward.presenter.d.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b extends com.kwad.components.ad.reward.presenter.b implements android.view.View.OnClickListener, com.kwad.components.ad.reward.presenter.d.b.c {
    private android.view.View zj;
    private boolean zk;
    private final java.lang.Runnable zl;


    public b() {
            r1 = this;
            r1.<init>()
            com.kwad.components.ad.reward.presenter.d.b.b$1 r0 = new com.kwad.components.ad.reward.presenter.d.b.b$1
            r0.<init>(r1)
            r1.zl = r0
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.reward.presenter.d.b.b r0) {
            r0.jP()
            return
    }

    private void jP() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "showPageCloseBtn mPlayEndH5ShowSuccess: "
            r0.<init>(r1)
            com.kwad.components.ad.reward.g r1 = r3.tm
            boolean r1 = r1.sw
            r0.append(r1)
            java.lang.String r1 = ", needHideCloseButton: "
            r0.append(r1)
            boolean r1 = r3.zk
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "RewardPlayEndCloseBtn"
            com.kwad.sdk.core.d.c.d(r1, r0)
            com.kwad.components.ad.reward.g r0 = r3.tm
            boolean r0 = r0.sw
            if (r0 == 0) goto L2c
            boolean r0 = r3.zk
            if (r0 == 0) goto L2c
            return
        L2c:
            android.view.View r0 = r3.zj
            r1 = 0
            r0.setVisibility(r1)
            android.view.View r0 = r3.zj
            r1 = 0
            r0.setAlpha(r1)
            android.view.View r0 = r3.zj
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r1 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r0 = r0.alpha(r1)
            r1 = 500(0x1f4, double:2.47E-321)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r1)
            r0.start()
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.b, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r1 = this;
            super.at()
            com.kwad.components.ad.reward.g r0 = r1.tm
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            boolean r0 = com.kwad.sdk.core.response.b.b.el(r0)
            r1.zk = r0
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.d.b.c
    public final void jO() {
            r5 = this;
            com.kwad.components.ad.reward.g r0 = r5.tm
            boolean r1 = r0.sf
            if (r1 == 0) goto L7
            return
        L7:
            long r0 = r0.sq
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L15
            java.lang.Runnable r0 = r5.zl
            r0.run()
            return
        L15:
            java.lang.Runnable r2 = r5.zl
            com.kwad.sdk.utils.bw.runOnUiThreadDelay(r2, r0)
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r2) {
            r1 = this;
            android.view.View r0 = r1.zj
            if (r2 != r0) goto L39
            com.kwad.components.ad.reward.g r2 = r1.tm
            com.kwad.components.core.playable.PlayableSource r2 = r2.gP()
            if (r2 == 0) goto L34
            com.kwad.components.core.playable.PlayableSource r0 = com.kwad.components.core.playable.PlayableSource.PENDANT_CLICK_NOT_AUTO
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L2c
            com.kwad.components.core.playable.PlayableSource r0 = com.kwad.components.core.playable.PlayableSource.PENDANT_CLICK_AUTO
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L2c
            com.kwad.components.core.playable.PlayableSource r0 = com.kwad.components.core.playable.PlayableSource.PENDANT_AUTO
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L2c
            com.kwad.components.core.playable.PlayableSource r0 = com.kwad.components.core.playable.PlayableSource.ACTIONBAR_CLICK
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L34
        L2c:
            com.kwad.components.ad.reward.a r2 = com.kwad.components.ad.reward.a.gg()
            r2.gh()
            return
        L34:
            com.kwad.components.ad.reward.g r2 = r1.tm
            com.kwad.components.ad.reward.presenter.f.v(r2)
        L39:
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r1 = this;
            super.onCreate()
            int r0 = com.kwad.sdk.R.id.ksad_end_close_btn
            android.view.View r0 = r1.findViewById(r0)
            r1.zj = r0
            r0.setOnClickListener(r1)
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r2 = this;
            super.onUnbind()
            android.view.View r0 = r2.zj
            r1 = 8
            r0.setVisibility(r1)
            java.lang.Runnable r0 = r2.zl
            com.kwad.sdk.utils.bw.c(r0)
            return
    }
}
