package com.kwad.components.ad.splashscreen.presenter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class t extends com.kwad.components.ad.splashscreen.presenter.e implements com.kwad.sdk.core.j.c {
    private volatile boolean HR;
    private boolean HS;
    private boolean HT;
    private com.kwad.components.ad.splashscreen.widget.SkipView HU;
    private com.kwad.components.core.video.l HV;
    private android.widget.ImageView ke;
    private com.kwad.sdk.utils.i.a kf;
    private com.kwad.sdk.core.response.model.AdInfo mAdInfo;





    public t() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.HR = r0
            r1.HS = r0
            r1.HT = r0
            com.kwad.components.ad.splashscreen.presenter.t$1 r0 = new com.kwad.components.ad.splashscreen.presenter.t$1
            r0.<init>(r1)
            r1.kf = r0
            com.kwad.components.ad.splashscreen.presenter.t$2 r0 = new com.kwad.components.ad.splashscreen.presenter.t$2
            r0.<init>(r1)
            r1.HV = r0
            return
    }

    static /* synthetic */ android.widget.ImageView a(com.kwad.components.ad.splashscreen.presenter.t r0) {
            android.widget.ImageView r0 = r0.ke
            return r0
    }

    private static void a(com.kwad.components.ad.splashscreen.widget.SkipView r0, com.kwad.sdk.core.response.model.AdInfo r1) {
            boolean r1 = com.kwad.sdk.core.response.b.a.cE(r1)
            r0.setTimerBtnVisible(r1)
            return
    }

    private void a(com.kwad.components.core.video.DetailVideoView r3) {
            r2 = this;
            int r0 = com.kwad.sdk.R.id.splash_play_card_view
            android.view.View r0 = r2.findViewById(r0)
            com.kwad.components.ad.splashscreen.presenter.t$3 r1 = new com.kwad.components.ad.splashscreen.presenter.t$3
            r1.<init>(r2, r0, r3)
            r0.post(r1)
            return
    }

    static /* synthetic */ boolean a(com.kwad.components.ad.splashscreen.presenter.t r0, com.kwad.sdk.core.response.model.AdInfo r1) {
            boolean r0 = u(r1)
            return r0
    }

    static /* synthetic */ boolean a(com.kwad.components.ad.splashscreen.presenter.t r0, boolean r1) {
            r0.HR = r1
            return r1
    }

    static /* synthetic */ boolean b(com.kwad.components.ad.splashscreen.presenter.t r0) {
            boolean r0 = r0.HR
            return r0
    }

    static /* synthetic */ boolean b(com.kwad.components.ad.splashscreen.presenter.t r0, boolean r1) {
            r1 = 1
            r0.HS = r1
            return r1
    }

    static /* synthetic */ android.content.Context c(com.kwad.components.ad.splashscreen.presenter.t r0) {
            android.content.Context r0 = r0.getContext()
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdInfo d(com.kwad.components.ad.splashscreen.presenter.t r0) {
            com.kwad.sdk.core.response.model.AdInfo r0 = r0.mAdInfo
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.splashscreen.widget.SkipView e(com.kwad.components.ad.splashscreen.presenter.t r0) {
            com.kwad.components.ad.splashscreen.widget.SkipView r0 = r0.HU
            return r0
    }

    static /* synthetic */ boolean f(com.kwad.components.ad.splashscreen.presenter.t r0) {
            boolean r0 = r0.HS
            return r0
    }

    static /* synthetic */ boolean g(com.kwad.components.ad.splashscreen.presenter.t r0) {
            boolean r0 = r0.HT
            return r0
    }

    static /* synthetic */ android.content.Context h(com.kwad.components.ad.splashscreen.presenter.t r0) {
            android.content.Context r0 = r0.getContext()
            return r0
    }

    private static boolean u(com.kwad.sdk.core.response.model.AdInfo r0) {
            boolean r0 = com.kwad.sdk.core.response.b.a.cB(r0)
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // com.kwad.components.ad.splashscreen.presenter.e, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r4 = this;
            super.at()
            com.kwad.components.ad.splashscreen.h r0 = r4.Gf
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            r4.mAdInfo = r0
            com.kwad.components.ad.splashscreen.h r0 = r4.Gf
            com.kwad.sdk.core.view.AdBaseFrameLayout r0 = r0.mRootContainer
            int r1 = com.kwad.sdk.R.id.ksad_splash_video_player
            android.view.View r0 = r0.findViewById(r1)
            com.kwad.components.core.video.DetailVideoView r0 = (com.kwad.components.core.video.DetailVideoView) r0
            r1 = 0
            r0.setVisibility(r1)
            com.kwad.sdk.core.response.model.AdInfo r2 = r4.mAdInfo
            boolean r2 = com.kwad.sdk.core.response.b.a.dn(r2)
            if (r2 == 0) goto L28
            r4.a(r0)
        L28:
            com.kwad.components.ad.splashscreen.h r0 = r4.Gf
            com.kwad.components.ad.splashscreen.d.a r0 = r0.Fq
            if (r0 == 0) goto L33
            com.kwad.components.core.video.l r2 = r4.HV
            r0.a2(r2)
        L33:
            com.kwad.components.ad.splashscreen.h r0 = r4.Gf
            com.kwad.sdk.core.j.a r0 = r0.Fs
            r0.a(r4)
            com.kwad.components.ad.splashscreen.h r0 = r4.Gf
            com.kwad.sdk.core.view.AdBaseFrameLayout r0 = r0.mRootContainer
            com.kwad.sdk.core.response.model.AdInfo r2 = r4.mAdInfo
            boolean r2 = com.kwad.components.ad.splashscreen.e.c.z(r2)
            if (r2 == 0) goto L49
            int r2 = com.kwad.sdk.R.id.ksad_splash_skip_right_view
            goto L4b
        L49:
            int r2 = com.kwad.sdk.R.id.ksad_splash_skip_left_view
        L4b:
            android.view.View r0 = r0.findViewById(r2)
            com.kwad.components.ad.splashscreen.widget.SkipView r0 = (com.kwad.components.ad.splashscreen.widget.SkipView) r0
            r4.HU = r0
            com.kwad.sdk.core.response.model.AdInfo r0 = r4.mAdInfo
            boolean r0 = u(r0)
            if (r0 == 0) goto L62
            com.kwad.components.ad.splashscreen.widget.SkipView r0 = r4.HU
            com.kwad.sdk.core.response.model.AdInfo r2 = r4.mAdInfo
            a(r0, r2)
        L62:
            com.kwad.sdk.core.response.model.AdInfo r0 = r4.mAdInfo
            com.kwad.sdk.core.response.model.AdInfo$AdSplashInfo r0 = r0.adSplashInfo
            int r0 = r0.mute
            r2 = 2
            r3 = 1
            if (r0 == r2) goto L85
            r2 = 3
            if (r0 == r2) goto L72
            r4.HR = r1
            goto L87
        L72:
            com.kwad.components.ad.splashscreen.h r0 = r4.Gf
            com.kwad.sdk.core.view.AdBaseFrameLayout r0 = r0.mRootContainer
            android.content.Context r0 = r0.getContext()
            int r0 = com.kwad.sdk.utils.m.cH(r0)
            if (r0 <= 0) goto L81
            goto L82
        L81:
            r3 = 0
        L82:
            r4.HR = r3
            goto L87
        L85:
            r4.HR = r3
        L87:
            android.content.Context r0 = r4.getContext()
            com.kwad.components.core.t.a r0 = com.kwad.components.core.t.a.aC(r0)
            boolean r0 = r0.sW()
            if (r0 == 0) goto L97
            r4.HR = r1
        L97:
            com.kwad.components.ad.splashscreen.h r0 = r4.Gf
            com.kwad.components.ad.splashscreen.d.a r0 = r0.Fq
            if (r0 == 0) goto Lab
            boolean r2 = r4.HR
            r0.setAudioEnabled(r2, r1)
            com.kwad.components.ad.splashscreen.h r0 = r4.Gf
            com.kwad.components.ad.splashscreen.d.a r0 = r0.Fq
            com.kwad.sdk.utils.i$a r2 = r4.kf
            r0.a(r2)
        Lab:
            com.kwad.components.ad.splashscreen.h r0 = r4.Gf
            com.kwad.sdk.core.view.AdBaseFrameLayout r0 = r0.mRootContainer
            int r2 = com.kwad.sdk.R.id.ksad_splash_sound
            android.view.View r0 = r0.findViewById(r2)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r4.ke = r0
            com.kwad.sdk.core.response.model.AdInfo r0 = r4.mAdInfo
            boolean r0 = com.kwad.components.ad.splashscreen.e.c.z(r0)
            if (r0 == 0) goto Lfa
            android.widget.ImageView r0 = r4.ke
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            r2 = 51
            r0.gravity = r2
            android.widget.ImageView r2 = r4.ke
            r2.setLayoutParams(r0)
            android.widget.ImageView r0 = r4.ke
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r2 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r2 == 0) goto Lfa
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            android.widget.ImageView r2 = r4.ke
            android.content.Context r2 = r2.getContext()
            r3 = 1107296256(0x42000000, float:32.0)
            int r2 = com.kwad.sdk.c.a.a.a(r2, r3)
            r0.topMargin = r2
            android.widget.ImageView r2 = r4.ke
            android.content.Context r2 = r2.getContext()
            r3 = 1098907648(0x41800000, float:16.0)
            int r2 = com.kwad.sdk.c.a.a.a(r2, r3)
            r0.leftMargin = r2
        Lfa:
            android.widget.ImageView r0 = r4.ke
            r0.setVisibility(r1)
            boolean r0 = r4.HR
            if (r0 == 0) goto L10a
            com.kwad.sdk.core.response.model.AdInfo r0 = r4.mAdInfo
            com.kwad.sdk.core.response.model.AdInfo$AdSplashInfo r0 = r0.adSplashInfo
            java.lang.String r0 = r0.speakerIconUrl
            goto L110
        L10a:
            com.kwad.sdk.core.response.model.AdInfo r0 = r4.mAdInfo
            com.kwad.sdk.core.response.model.AdInfo$AdSplashInfo r0 = r0.adSplashInfo
            java.lang.String r0 = r0.speakerMuteIconUrl
        L110:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L120
            android.widget.ImageView r1 = r4.ke
            com.kwad.components.ad.splashscreen.h r2 = r4.Gf
            com.kwad.sdk.core.response.model.AdTemplate r2 = r2.mAdTemplate
            com.kwad.sdk.core.imageloader.KSImageLoader.loadImage(r1, r0, r2)
            goto L133
        L120:
            android.widget.ImageView r0 = r4.ke
            android.content.Context r1 = r4.getContext()
            android.content.res.Resources r1 = r1.getResources()
            int r2 = com.kwad.sdk.R.drawable.ksad_splash_sound_selector
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r2)
            r0.setImageDrawable(r1)
        L133:
            android.widget.ImageView r0 = r4.ke
            boolean r1 = r4.HR
            r0.setSelected(r1)
            android.widget.ImageView r0 = r4.ke
            com.kwad.components.ad.splashscreen.presenter.t$4 r1 = new com.kwad.components.ad.splashscreen.presenter.t$4
            r1.<init>(r4)
            r0.setOnClickListener(r1)
            return
    }

    @Override // com.kwad.sdk.core.j.c
    public final void bt() {
            r0 = this;
            return
    }

    @Override // com.kwad.sdk.core.j.c
    public final void bu() {
            r1 = this;
            com.kwad.components.ad.splashscreen.h r0 = r1.Gf
            com.kwad.components.ad.splashscreen.d.a r0 = r0.Fq
            if (r0 == 0) goto L9
            r0.pause()
        L9:
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onDestroy() {
            r1 = this;
            super.onDestroy()
            r0 = 1
            r1.HT = r0
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r2 = this;
            super.onUnbind()
            com.kwad.components.ad.splashscreen.h r0 = r2.Gf
            com.kwad.components.ad.splashscreen.d.a r0 = r0.Fq
            if (r0 == 0) goto L17
            com.kwad.components.core.video.l r1 = r2.HV
            r0.b2(r1)
            com.kwad.components.ad.splashscreen.h r0 = r2.Gf
            com.kwad.components.ad.splashscreen.d.a r0 = r0.Fq
            com.kwad.sdk.utils.i$a r1 = r2.kf
            r0.b(r1)
        L17:
            com.kwad.components.ad.splashscreen.widget.SkipView r0 = r2.HU
            android.os.Handler r0 = r0.getHandler()
            if (r0 == 0) goto L29
            com.kwad.components.ad.splashscreen.widget.SkipView r0 = r2.HU
            android.os.Handler r0 = r0.getHandler()
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
        L29:
            com.kwad.components.ad.splashscreen.h r0 = r2.Gf
            com.kwad.sdk.core.j.a r0 = r0.Fs
            r0.b(r2)
            return
    }
}
