package com.kwad.components.ad.fullscreen.c.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c extends com.kwad.components.ad.reward.presenter.b implements android.view.View.OnClickListener {
    private android.widget.ImageView ke;
    private com.kwad.sdk.utils.i.a kf;


    public c() {
            r1 = this;
            r1.<init>()
            com.kwad.components.ad.fullscreen.c.a.c$1 r0 = new com.kwad.components.ad.fullscreen.c.a.c$1
            r0.<init>(r1)
            r1.kf = r0
            return
    }

    static /* synthetic */ android.widget.ImageView a(com.kwad.components.ad.fullscreen.c.a.c r0) {
            android.widget.ImageView r0 = r0.ke
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g b(com.kwad.components.ad.fullscreen.c.a.c r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    private void dm() {
            r3 = this;
            android.widget.ImageView r0 = r3.ke
            r1 = 0
            r0.setVisibility(r1)
            com.kwad.components.ad.reward.g r0 = r3.tm
            com.kwad.sdk.api.KsVideoPlayConfig r2 = r0.mVideoPlayConfig
            boolean r0 = r0.rC
            if (r0 != 0) goto L27
            android.content.Context r0 = r3.getContext()
            com.kwad.components.core.t.a r0 = com.kwad.components.core.t.a.aC(r0)
            boolean r0 = r0.sW()
            if (r0 == 0) goto L27
            android.widget.ImageView r0 = r3.ke
            r0.setSelected(r1)
            com.kwad.components.ad.reward.g r0 = r3.tm
            r0.d(r1, r1)
            goto L4b
        L27:
            if (r2 == 0) goto L40
            android.widget.ImageView r0 = r3.ke
            boolean r1 = r2.isVideoSoundEnable()
            r0.setSelected(r1)
            com.kwad.components.ad.reward.g r0 = r3.tm
            boolean r1 = r2.isVideoSoundEnable()
            boolean r2 = r2.isVideoSoundEnable()
            r0.d(r1, r2)
            goto L4b
        L40:
            android.widget.ImageView r0 = r3.ke
            r1 = 1
            r0.setSelected(r1)
            com.kwad.components.ad.reward.g r0 = r3.tm
            r0.d(r1, r1)
        L4b:
            com.kwad.components.ad.reward.g r0 = r3.tm
            com.kwad.components.ad.reward.m.e r0 = r0.rE
            com.kwad.sdk.utils.i$a r1 = r3.kf
            r0.a(r1)
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.b, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r0 = this;
            super.at()
            r0.dm()
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r3) {
            r2 = this;
            android.widget.ImageView r0 = r2.ke
            if (r3 != r0) goto L1b
            com.kwad.components.ad.reward.g r3 = r2.tm
            com.kwad.components.ad.reward.m.e r3 = r3.rE
            boolean r0 = r0.isSelected()
            r1 = 1
            r0 = r0 ^ r1
            r3.setAudioEnabled(r0, r1)
            android.widget.ImageView r3 = r2.ke
            boolean r0 = r3.isSelected()
            r0 = r0 ^ r1
            r3.setSelected(r0)
        L1b:
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
            r0.setOnClickListener(r1)
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
            return
    }
}
