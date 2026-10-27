package com.kwad.components.ad.reward.presenter.platdetail.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class e extends com.kwad.components.ad.reward.presenter.b implements com.kwad.components.ad.reward.e.j {
    private com.kwad.components.ad.reward.e.g mPlayEndPageListener;
    private android.view.View yQ;
    private android.view.View yR;
    private android.widget.ImageView yS;


    public e() {
            r1 = this;
            r1.<init>()
            com.kwad.components.ad.reward.presenter.platdetail.a.e$1 r0 = new com.kwad.components.ad.reward.presenter.platdetail.a.e$1
            r0.<init>(r1)
            r1.mPlayEndPageListener = r0
            com.kwad.components.ad.reward.presenter.platdetail.a r0 = new com.kwad.components.ad.reward.presenter.platdetail.a
            r0.<init>()
            r1.a(r0)
            com.kwad.components.ad.reward.presenter.d.a r0 = new com.kwad.components.ad.reward.presenter.d.a
            r0.<init>()
            r1.a(r0)
            return
    }

    private void jC() {
            r3 = this;
            com.kwad.components.ad.reward.g r0 = r3.tm
            boolean r0 = r0.rU
            r1 = 8
            if (r0 != 0) goto Ld
            android.view.View r0 = r3.yR
            r0.setVisibility(r1)
        Ld:
            android.view.View r0 = r3.yQ
            r2 = 0
            r0.setVisibility(r2)
            r3.getContext()
            com.kwad.components.ad.reward.g r0 = r3.tm
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            boolean r0 = com.kwad.components.ad.reward.g.O(r0)
            if (r0 == 0) goto L2b
            boolean r0 = com.kwad.sdk.utils.aq.QW()
            if (r0 == 0) goto L2b
            android.widget.ImageView r0 = r3.yS
            r0.setVisibility(r1)
        L2b:
            return
    }

    @Override // com.kwad.components.ad.reward.e.j
    public final void a(com.kwad.components.core.playable.PlayableSource r1, @androidx.annotation.Nullable com.kwad.components.ad.reward.e.n r2) {
            r0 = this;
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.b, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r2 = this;
            super.at()
            android.view.View r0 = r2.yQ
            r1 = 0
            r0.setVisibility(r1)
            android.view.View r0 = r2.yR
            r1 = 8
            r0.setVisibility(r1)
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.e.g r1 = r2.mPlayEndPageListener
            r0.b(r1)
            com.kwad.components.ad.reward.a r0 = com.kwad.components.ad.reward.a.gg()
            r0.a(r2)
            return
    }

    @Override // com.kwad.components.ad.reward.e.j
    public final void dk() {
            r0 = this;
            r0.jC()
            return
    }

    @Override // com.kwad.components.ad.reward.e.j
    public final void dl() {
            r0 = this;
            r0.jD()
            return
    }

    public final void jD() {
            r3 = this;
            com.kwad.components.ad.reward.g r0 = r3.tm
            boolean r0 = r0.rU
            r1 = 0
            r2 = 8
            if (r0 == 0) goto Lf
            android.view.View r0 = r3.yQ
            r0.setVisibility(r2)
            goto L19
        Lf:
            android.view.View r0 = r3.yQ
            r0.setVisibility(r2)
            android.view.View r0 = r3.yR
            r0.setVisibility(r1)
        L19:
            r3.getContext()
            com.kwad.components.ad.reward.g r0 = r3.tm
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            boolean r0 = com.kwad.components.ad.reward.g.O(r0)
            if (r0 == 0) goto L31
            boolean r0 = com.kwad.sdk.utils.aq.QW()
            if (r0 == 0) goto L31
            android.widget.ImageView r0 = r3.yS
            r0.setVisibility(r1)
        L31:
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r1 = this;
            super.onCreate()
            int r0 = com.kwad.sdk.R.id.ksad_play_detail_top_toolbar
            android.view.View r0 = r1.findViewById(r0)
            r1.yQ = r0
            int r0 = com.kwad.sdk.R.id.ksad_play_end_top_toolbar
            android.view.View r0 = r1.findViewById(r0)
            r1.yR = r0
            int r0 = com.kwad.sdk.R.id.ksad_blur_end_cover
            android.view.View r0 = r1.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1.yS = r0
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r2 = this;
            super.onUnbind()
            r2.jC()
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.e.g r1 = r2.mPlayEndPageListener
            r0.c(r1)
            com.kwad.components.ad.reward.a r0 = com.kwad.components.ad.reward.a.gg()
            r0.b(r2)
            android.view.View r0 = r2.yR
            r1 = 8
            r0.setVisibility(r1)
            return
    }
}
