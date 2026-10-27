package com.kwad.components.ad.splashscreen.presenter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class j extends com.kwad.components.ad.splashscreen.presenter.e {


    public j() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.splashscreen.presenter.j r0) {
            r0.dc()
            return
    }

    private void dc() {
            r6 = this;
            com.kwad.components.ad.splashscreen.h r0 = r6.Gf
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            com.kwad.components.ad.splashscreen.presenter.b r1 = new com.kwad.components.ad.splashscreen.presenter.b
            r1.<init>()
            r2 = 1
            r6.a(r1, r2)
            com.kwad.components.ad.splashscreen.presenter.c r1 = new com.kwad.components.ad.splashscreen.presenter.c
            r1.<init>()
            r6.a(r1, r2)
            boolean r1 = com.kwad.sdk.core.response.b.a.bc(r0)
            if (r1 == 0) goto L30
            com.kwad.components.ad.splashscreen.presenter.d r1 = new com.kwad.components.ad.splashscreen.presenter.d
            r1.<init>()
            r6.a(r1, r2)
            com.kwad.components.ad.splashscreen.presenter.t r1 = new com.kwad.components.ad.splashscreen.presenter.t
            r1.<init>()
            r6.a(r1, r2)
            goto L38
        L30:
            com.kwad.components.ad.splashscreen.presenter.h r1 = new com.kwad.components.ad.splashscreen.presenter.h
            r1.<init>()
            r6.a(r1, r2)
        L38:
            com.kwad.components.ad.splashscreen.h r1 = r6.Gf
            boolean r1 = r1.Fy
            if (r1 == 0) goto L47
            com.kwad.components.ad.splashscreen.presenter.s r1 = new com.kwad.components.ad.splashscreen.presenter.s
            r1.<init>()
            r6.a(r1, r2)
            goto L8b
        L47:
            boolean r1 = com.kwad.sdk.core.response.b.b.dM(r0)
            boolean r3 = com.kwad.sdk.core.response.b.b.dQ(r0)
            boolean r4 = com.kwad.sdk.core.response.b.b.dY(r0)
            boolean r5 = com.kwad.sdk.core.response.b.b.dS(r0)
            if (r5 == 0) goto L62
            com.kwad.components.ad.splashscreen.presenter.q r1 = new com.kwad.components.ad.splashscreen.presenter.q
            r1.<init>()
            r6.a(r1, r2)
            goto L8b
        L62:
            if (r1 == 0) goto L6d
            com.kwad.components.ad.splashscreen.presenter.o r1 = new com.kwad.components.ad.splashscreen.presenter.o
            r1.<init>()
            r6.a(r1, r2)
            goto L8b
        L6d:
            if (r3 == 0) goto L78
            com.kwad.components.ad.splashscreen.presenter.m r1 = new com.kwad.components.ad.splashscreen.presenter.m
            r1.<init>()
            r6.a(r1, r2)
            goto L8b
        L78:
            if (r4 == 0) goto L83
            com.kwad.components.ad.splashscreen.presenter.s r1 = new com.kwad.components.ad.splashscreen.presenter.s
            r1.<init>()
            r6.a(r1, r2)
            goto L8b
        L83:
            com.kwad.components.ad.splashscreen.presenter.s r1 = new com.kwad.components.ad.splashscreen.presenter.s
            r1.<init>()
            r6.a(r1, r2)
        L8b:
            boolean r0 = com.kwad.sdk.core.response.b.a.aP(r0)
            if (r0 == 0) goto L99
            com.kwad.components.ad.splashscreen.presenter.f r0 = new com.kwad.components.ad.splashscreen.presenter.f
            r0.<init>()
            r6.a(r0, r2)
        L99:
            com.kwad.components.ad.splashscreen.h r0 = r6.Gf
            boolean r0 = r0.bO
            if (r0 != 0) goto La7
            com.kwad.components.ad.splashscreen.presenter.playcard.b r0 = new com.kwad.components.ad.splashscreen.presenter.playcard.b
            r0.<init>()
            r6.a(r0, r2)
        La7:
            com.kwad.components.ad.splashscreen.presenter.a r0 = new com.kwad.components.ad.splashscreen.presenter.a
            r0.<init>()
            r6.a(r0, r2)
            com.kwad.components.ad.splashscreen.presenter.g r0 = new com.kwad.components.ad.splashscreen.presenter.g
            r0.<init>()
            r6.a(r0, r2)
            return
    }

    @Override // com.kwad.components.ad.splashscreen.presenter.e, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r1 = this;
            super.at()
            com.kwad.components.ad.splashscreen.presenter.j$1 r0 = new com.kwad.components.ad.splashscreen.presenter.j$1
            r0.<init>(r1)
            com.kwad.sdk.utils.bw.postOnUiThread(r0)
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r2 = this;
            super.onCreate()
            int r0 = com.kwad.sdk.R.id.splash_play_card_view
            android.view.View r0 = r2.findViewById(r0)
            r1 = 0
            r0.setVisibility(r1)
            return
    }
}
