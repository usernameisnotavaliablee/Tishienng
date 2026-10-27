package com.kwad.components.ad.reward.presenter.platdetail.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class d extends com.kwad.components.ad.reward.presenter.b implements android.view.View.OnClickListener {
    private android.widget.ImageView ke;
    private com.kwad.sdk.utils.i.a kf;
    private android.widget.ImageView yM;
    private com.kwad.components.ad.reward.m.c yN;



    public d() {
            r1 = this;
            r1.<init>()
            com.kwad.components.ad.reward.presenter.platdetail.a.d$1 r0 = new com.kwad.components.ad.reward.presenter.platdetail.a.d$1
            r0.<init>(r1)
            r1.kf = r0
            com.kwad.components.ad.reward.presenter.platdetail.a.d$2 r0 = new com.kwad.components.ad.reward.presenter.platdetail.a.d$2
            r0.<init>(r1)
            r1.yN = r0
            return
    }

    static /* synthetic */ android.widget.ImageView a(com.kwad.components.ad.reward.presenter.platdetail.a.d r0) {
            android.widget.ImageView r0 = r0.ke
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g b(com.kwad.components.ad.reward.presenter.platdetail.a.d r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    static /* synthetic */ void c(com.kwad.components.ad.reward.presenter.platdetail.a.d r0) {
            r0.jz()
            return
    }

    private void dm() {
            r4 = this;
            boolean r0 = r4.iA()
            r1 = 8
            if (r0 == 0) goto L10
            android.widget.ImageView r0 = r4.ke
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r4.yM
            goto L2d
        L10:
            android.widget.ImageView r0 = r4.ke
            com.kwad.sdk.core.response.model.AdTemplate r2 = r4.mAdTemplate
            boolean r2 = com.kwad.components.ad.reward.g.P(r2)
            r3 = 0
            if (r2 == 0) goto L1e
            r2 = 8
            goto L1f
        L1e:
            r2 = 0
        L1f:
            r0.setVisibility(r2)
            android.widget.ImageView r0 = r4.yM
            com.kwad.sdk.core.response.model.AdTemplate r2 = r4.mAdTemplate
            boolean r2 = com.kwad.components.ad.reward.g.P(r2)
            if (r2 == 0) goto L2d
            r1 = 0
        L2d:
            r0.setVisibility(r1)
            return
    }

    private void jA() {
            r1 = this;
            android.widget.ImageView r0 = r1.ke
            r0.setOnClickListener(r1)
            android.widget.ImageView r0 = r1.yM
            r0.setOnClickListener(r1)
            return
    }

    private void jz() {
            r5 = this;
            com.kwad.components.ad.reward.g r0 = r5.tm
            com.kwad.sdk.api.KsVideoPlayConfig r1 = r0.mVideoPlayConfig
            boolean r0 = r0.rC
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L24
            android.content.Context r0 = r5.getContext()
            com.kwad.components.core.t.a r0 = com.kwad.components.core.t.a.aC(r0)
            boolean r0 = r0.sW()
            if (r0 == 0) goto L24
            android.widget.ImageView r0 = r5.yM
            r0.setSelected(r3)
            com.kwad.components.ad.reward.g r0 = r5.tm
            r0.d(r2, r2)
            r3 = 0
            goto L4b
        L24:
            if (r1 == 0) goto L41
            boolean r3 = r1.isVideoSoundEnable()
            android.widget.ImageView r0 = r5.yM
            boolean r4 = r1.isVideoSoundEnable()
            r0.setSelected(r4)
            com.kwad.components.ad.reward.g r0 = r5.tm
            boolean r4 = r1.isVideoSoundEnable()
            boolean r1 = r1.isVideoSoundEnable()
            r0.d(r4, r1)
            goto L4b
        L41:
            android.widget.ImageView r0 = r5.yM
            r0.setSelected(r3)
            com.kwad.components.ad.reward.g r0 = r5.tm
            r0.d(r3, r3)
        L4b:
            android.widget.ImageView r0 = r5.ke
            r0.setSelected(r3)
            com.kwad.components.ad.reward.g r0 = r5.tm
            com.kwad.components.ad.reward.m.e r0 = r0.rE
            r0.setAudioEnabled(r3, r2)
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.b, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r2 = this;
            super.at()
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.m.c r1 = r2.yN
            r0.a(r1)
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.m.e r0 = r0.rE
            com.kwad.sdk.utils.i$a r1 = r2.kf
            r0.a(r1)
            r2.dm()
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r3) {
            r2 = this;
            android.widget.ImageView r0 = r2.ke
            r1 = 1
            if (r3 != r0) goto L1c
            com.kwad.components.ad.reward.g r3 = r2.tm
            com.kwad.components.ad.reward.m.e r3 = r3.rE
            boolean r0 = r0.isSelected()
            r0 = r0 ^ r1
            r3.setAudioEnabled(r0, r1)
            android.widget.ImageView r3 = r2.ke
            boolean r0 = r3.isSelected()
            r0 = r0 ^ r1
            r3.setSelected(r0)
            return
        L1c:
            android.widget.ImageView r0 = r2.yM
            if (r3 != r0) goto L36
            com.kwad.components.ad.reward.g r3 = r2.tm
            com.kwad.components.ad.reward.m.e r3 = r3.rE
            boolean r0 = r0.isSelected()
            r0 = r0 ^ r1
            r3.setAudioEnabled(r0, r1)
            android.widget.ImageView r3 = r2.yM
            boolean r0 = r3.isSelected()
            r0 = r0 ^ r1
            r3.setSelected(r0)
        L36:
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r1 = this;
            super.onCreate()
            int r0 = com.kwad.sdk.R.id.ksad_video_sound_switch
            android.view.View r0 = r1.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1.ke = r0
            int r0 = com.kwad.sdk.R.id.ksad_reward_deep_task_sound_switch
            android.view.View r0 = r1.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1.yM = r0
            r1.jA()
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r2 = this;
            super.onUnbind()
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.m.e r0 = r0.rE
            com.kwad.sdk.utils.i$a r1 = r2.kf
            r0.b(r1)
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.m.c r1 = r2.yN
            r0.b(r1)
            return
    }
}
