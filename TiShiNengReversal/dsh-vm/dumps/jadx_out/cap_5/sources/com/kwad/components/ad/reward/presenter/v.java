package com.kwad.components.ad.reward.presenter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class v extends com.kwad.components.ad.reward.presenter.b {
    private com.kwad.components.core.video.m jE;
    private com.kwad.components.core.video.DetailVideoView wV;
    private android.view.ViewGroup wW;
    private android.widget.FrameLayout wX;
    private android.widget.ImageView wY;
    private android.view.ViewGroup.LayoutParams wZ;


    public v() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.wZ = r0
            com.kwad.components.ad.reward.presenter.v$1 r0 = new com.kwad.components.ad.reward.presenter.v$1
            r0.<init>(r1)
            r1.jE = r0
            return
    }

    static /* synthetic */ com.kwad.components.core.video.DetailVideoView a(com.kwad.components.ad.reward.presenter.v r0) {
            com.kwad.components.core.video.DetailVideoView r0 = r0.wV
            return r0
    }

    private void ac(@androidx.annotation.LayoutRes int r4) {
            r3 = this;
            android.content.Context r0 = r3.getContext()
            android.widget.FrameLayout r1 = r3.wX
            r2 = 0
            android.view.View r4 = com.kwad.sdk.o.m.a(r0, r4, r1, r2)
            android.widget.FrameLayout r0 = r3.wX
            r1 = -1
            r0.addView(r4, r1, r1)
            return
    }

    private void iV() {
            r1 = this;
            java.lang.Class<com.kwad.sdk.components.DevelopMangerComponents> r0 = com.kwad.sdk.components.DevelopMangerComponents.class
            com.kwad.sdk.components.b r0 = com.kwad.sdk.components.d.f(r0)
            com.kwad.sdk.components.DevelopMangerComponents r0 = (com.kwad.sdk.components.DevelopMangerComponents) r0
            return
    }

    private void iW() {
            r7 = this;
            com.kwad.components.ad.reward.g r0 = r7.tm
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            r7.getContext()
            boolean r1 = com.kwad.sdk.utils.aq.QW()
            boolean r2 = com.kwad.sdk.core.response.b.a.bK(r0)
            boolean r3 = com.kwad.sdk.core.response.b.a.cJ(r0)
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L23
            boolean r3 = com.kwad.components.ad.reward.a.b.hM()
            if (r3 == 0) goto L23
            r3 = 1
            goto L24
        L23:
            r3 = 0
        L24:
            com.kwad.components.ad.reward.g r6 = r7.tm
            com.kwad.sdk.core.response.model.AdTemplate r6 = r6.mAdTemplate
            boolean r6 = com.kwad.components.ad.reward.g.N(r6)
            if (r6 != 0) goto L3e
            com.kwad.components.ad.reward.g r6 = r7.tm
            com.kwad.sdk.core.response.model.AdTemplate r6 = r6.mAdTemplate
            boolean r6 = com.kwad.components.ad.reward.g.O(r6)
            if (r6 != 0) goto L3e
            if (r2 != 0) goto L3e
            if (r3 == 0) goto L3d
            goto L3e
        L3d:
            r4 = 0
        L3e:
            r6 = 8
            if (r1 != 0) goto L74
            if (r4 == 0) goto L74
            android.view.ViewGroup r1 = r7.wW
            if (r3 == 0) goto L49
            r5 = 4
        L49:
            r1.setVisibility(r5)
            if (r2 == 0) goto L59
            android.widget.ImageView r1 = r7.wY
            r1.setVisibility(r6)
            int r1 = com.kwad.sdk.R.layout.ksad_playable_end_info
            r7.ac(r1)
            goto L5e
        L59:
            int r1 = com.kwad.sdk.R.layout.ksad_activity_apk_info_landscape
            r7.ac(r1)
        L5e:
            boolean r0 = com.kwad.sdk.core.response.b.a.aY(r0)
            if (r0 != 0) goto L6c
            com.kwad.components.core.video.DetailVideoView r0 = r7.wV
            r1 = 17
            r0.updateTextureViewGravity(r1)
            return
        L6c:
            com.kwad.components.core.video.DetailVideoView r0 = r7.wV
            r1 = 21
            r0.updateTextureViewGravity(r1)
            return
        L74:
            android.view.ViewGroup r0 = r7.wW
            r0.setVisibility(r6)
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.b, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r2 = this;
            super.at()
            r2.iV()
            com.kwad.components.core.video.DetailVideoView r0 = r2.wV
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            if (r0 == 0) goto L15
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r1.<init>(r0)
            r2.wZ = r1
        L15:
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.m.e r0 = r0.rE
            com.kwad.components.core.video.m r1 = r2.jE
            r0.a(r1)
            r2.iW()
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r1 = this;
            super.onCreate()
            int r0 = com.kwad.sdk.R.id.ksad_video_player
            android.view.View r0 = r1.findViewById(r0)
            com.kwad.components.core.video.DetailVideoView r0 = (com.kwad.components.core.video.DetailVideoView) r0
            r1.wV = r0
            int r0 = com.kwad.sdk.R.id.ksad_play_right_area
            android.view.View r0 = r1.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r1.wW = r0
            int r0 = com.kwad.sdk.R.id.ksad_play_right_area_bg_img
            android.view.View r0 = r1.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1.wY = r0
            int r0 = com.kwad.sdk.R.id.ksad_play_right_area_container
            android.view.View r0 = r1.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r1.wX = r0
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r3 = this;
            super.onUnbind()
            com.kwad.components.ad.reward.g r0 = r3.tm
            com.kwad.components.ad.reward.m.e r0 = r0.rE
            com.kwad.components.core.video.m r1 = r3.jE
            r0.b(r1)
            android.view.ViewGroup$LayoutParams r0 = r3.wZ
            if (r0 == 0) goto L34
            com.kwad.components.core.video.DetailVideoView r0 = r3.wV
            if (r0 == 0) goto L34
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            if (r0 == 0) goto L29
            android.view.ViewGroup$LayoutParams r1 = r3.wZ
            int r2 = r1.width
            r0.width = r2
            int r1 = r1.height
            r0.height = r1
            com.kwad.components.core.video.DetailVideoView r1 = r3.wV
            r1.setLayoutParams(r0)
        L29:
            com.kwad.components.core.video.DetailVideoView r0 = r3.wV
            if (r0 == 0) goto L31
            r1 = 4
            r0.setVisibility(r1)
        L31:
            r0 = 0
            r3.wZ = r0
        L34:
            return
    }
}
