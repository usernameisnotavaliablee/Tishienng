package com.kwad.components.ad.fullscreen.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c extends com.kwad.components.ad.reward.presenter.b implements com.kwad.components.ad.reward.e.j {
    private android.view.View jS;
    private android.view.View jT;
    private com.kwad.components.ad.reward.e.g mPlayEndPageListener;


    public c() {
            r1 = this;
            r1.<init>()
            com.kwad.components.ad.fullscreen.c.c$1 r0 = new com.kwad.components.ad.fullscreen.c.c$1
            r0.<init>(r1)
            r1.mPlayEndPageListener = r0
            com.kwad.components.ad.fullscreen.c.a.e r0 = new com.kwad.components.ad.fullscreen.c.a.e
            r0.<init>()
            r1.a(r0)
            com.kwad.components.ad.fullscreen.c.b.a r0 = new com.kwad.components.ad.fullscreen.c.b.a
            r0.<init>()
            r1.a(r0)
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.fullscreen.c.c r0, boolean r1) {
            r1 = 0
            r0.j(r1)
            return
    }

    private void dj() {
            r2 = this;
            com.kwad.components.ad.reward.g r0 = r2.tm
            boolean r1 = r0.rU
            if (r1 != 0) goto L17
            boolean r0 = r0.rT
            if (r0 != 0) goto L17
            android.view.View r0 = r2.jS
            r1 = 0
            r0.setVisibility(r1)
            android.view.View r0 = r2.jT
            r1 = 8
            r0.setVisibility(r1)
        L17:
            return
    }

    private void j(boolean r4) {
            r3 = this;
            com.kwad.components.ad.reward.g r0 = r3.tm
            boolean r1 = r0.rU
            r2 = 8
            if (r1 != 0) goto Lc
            boolean r0 = r0.rT
            if (r0 == 0) goto L19
        Lc:
            if (r4 != 0) goto L19
            android.view.View r4 = r3.jS
            r4.setVisibility(r2)
            android.view.View r4 = r3.jT
            r4.setVisibility(r2)
            return
        L19:
            android.view.View r4 = r3.jS
            r4.setVisibility(r2)
            android.view.View r4 = r3.jT
            r0 = 0
            r4.setVisibility(r0)
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
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.e.g r1 = r2.mPlayEndPageListener
            r0.b(r1)
            com.kwad.components.ad.reward.a r0 = com.kwad.components.ad.reward.a.gg()
            r0.a(r2)
            android.view.View r0 = r2.jS
            r1 = 0
            r0.setVisibility(r1)
            android.view.View r0 = r2.jT
            r1 = 8
            r0.setVisibility(r1)
            return
    }

    @Override // com.kwad.components.ad.reward.e.j
    public final void dk() {
            r2 = this;
            r2.dj()
            com.kwad.components.ad.reward.g r0 = r2.tm
            boolean r0 = r0.rT
            if (r0 == 0) goto L18
            android.view.View r0 = r2.jT
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L18
            android.view.View r0 = r2.jT
            r1 = 8
            r0.setVisibility(r1)
        L18:
            return
    }

    @Override // com.kwad.components.ad.reward.e.j
    public final void dl() {
            r1 = this;
            r0 = 1
            r1.j(r0)
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r1 = this;
            super.onCreate()
            int r0 = com.kwad.sdk.R.id.ksad_play_detail_top_toolbar
            android.view.View r0 = r1.findViewById(r0)
            r1.jS = r0
            int r0 = com.kwad.sdk.R.id.ksad_play_end_top_toolbar
            android.view.View r0 = r1.findViewById(r0)
            r1.jT = r0
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r2 = this;
            super.onUnbind()
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.e.g r1 = r2.mPlayEndPageListener
            r0.c(r1)
            com.kwad.components.ad.reward.a r0 = com.kwad.components.ad.reward.a.gg()
            r0.b(r2)
            return
    }
}
