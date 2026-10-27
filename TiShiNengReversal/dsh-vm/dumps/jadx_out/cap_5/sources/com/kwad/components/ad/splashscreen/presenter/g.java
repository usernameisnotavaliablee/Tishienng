package com.kwad.components.ad.splashscreen.presenter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class g extends com.kwad.components.ad.splashscreen.presenter.e {


    public g() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.splashscreen.presenter.g r0) {
            r0.mj()
            return
    }

    private static void j(android.view.View r1, int r2) {
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            boolean r0 = r0 instanceof android.widget.FrameLayout.LayoutParams
            if (r0 == 0) goto L14
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            r0.topMargin = r2
            r1.setLayoutParams(r0)
            return
        L14:
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            boolean r0 = r0 instanceof android.widget.LinearLayout.LayoutParams
            if (r0 == 0) goto L27
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            r0.topMargin = r2
            r1.setLayoutParams(r0)
        L27:
            return
    }

    private void mi() {
            r1 = this;
            com.kwad.components.ad.splashscreen.presenter.g$1 r0 = new com.kwad.components.ad.splashscreen.presenter.g$1
            r0.<init>(r1)
            com.kwad.sdk.utils.bw.postOnUiThread(r0)
            return
    }

    private void mj() {
            r4 = this;
            android.content.Context r0 = r4.getContext()
            if (r0 != 0) goto L7
            goto L74
        L7:
            com.kwad.components.ad.splashscreen.h r0 = r4.Gf
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            boolean r1 = com.kwad.components.ad.splashscreen.e.c.z(r0)
            if (r1 == 0) goto L18
            int r1 = com.kwad.sdk.R.id.ksad_preload_right_container
            goto L1a
        L18:
            int r1 = com.kwad.sdk.R.id.ksad_preload_left_container
        L1a:
            android.view.View r1 = r4.findViewById(r1)
            int r2 = r4.x(r0)
            j(r1, r2)
            boolean r0 = com.kwad.components.ad.splashscreen.e.c.z(r0)
            if (r0 == 0) goto L74
            int r0 = com.kwad.sdk.R.id.ksad_splash_logo_container
            android.view.View r0 = r4.findViewById(r0)
            android.app.Activity r1 = r4.getActivity()
            int r1 = com.kwad.sdk.c.a.a.getStatusBarHeight(r1)
            android.content.Context r2 = r4.getContext()
            r3 = 1094713344(0x41400000, float:12.0)
            int r2 = com.kwad.sdk.c.a.a.a(r2, r3)
            int r1 = r1 + r2
            j(r0, r1)
            int r0 = com.kwad.sdk.R.id.ksad_splash_sound
            android.view.View r0 = r4.findViewById(r0)
            android.app.Activity r1 = r4.getActivity()
            int r1 = com.kwad.sdk.c.a.a.getStatusBarHeight(r1)
            android.content.Context r2 = r4.getContext()
            r3 = 1107296256(0x42000000, float:32.0)
            int r2 = com.kwad.sdk.c.a.a.a(r2, r3)
            int r1 = r1 + r2
            j(r0, r1)
            int r0 = com.kwad.sdk.R.id.ksad_skip_view_area
            android.view.View r0 = r4.findViewById(r0)
            android.app.Activity r1 = r4.getActivity()
            int r1 = com.kwad.sdk.c.a.a.getStatusBarHeight(r1)
            j(r0, r1)
        L74:
            return
    }

    private int x(com.kwad.sdk.core.response.model.AdInfo r2) {
            r1 = this;
            boolean r2 = com.kwad.components.ad.splashscreen.e.c.z(r2)
            if (r2 == 0) goto L1a
            android.app.Activity r2 = r1.getActivity()
            r0 = 1107296256(0x42000000, float:32.0)
            int r2 = com.kwad.sdk.c.a.a.a(r2, r0)
            android.app.Activity r0 = r1.getActivity()
            int r0 = com.kwad.sdk.c.a.a.getStatusBarHeight(r0)
        L18:
            int r2 = r2 + r0
            return r2
        L1a:
            android.app.Activity r2 = r1.getActivity()
            r0 = 1098907648(0x41800000, float:16.0)
            int r2 = com.kwad.sdk.c.a.a.a(r2, r0)
            android.app.Activity r0 = r1.getActivity()
            int r0 = com.kwad.sdk.c.a.a.getStatusBarHeight(r0)
            goto L18
    }

    @Override // com.kwad.components.ad.splashscreen.presenter.e, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r0 = this;
            super.at()
            r0.mi()
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r0 = this;
            super.onCreate()
            return
    }
}
