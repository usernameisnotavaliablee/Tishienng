package com.kwad.components.ad.fullscreen.c.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b extends com.kwad.components.ad.reward.presenter.f.a {
    private android.widget.FrameLayout dm;
    private com.kwad.components.ad.reward.e.j kG;


    public b() {
            r1 = this;
            r1.<init>()
            com.kwad.components.ad.fullscreen.c.c.b$1 r0 = new com.kwad.components.ad.fullscreen.c.c.b$1
            r0.<init>(r1)
            r1.kG = r0
            return
    }

    static /* synthetic */ android.widget.FrameLayout a(com.kwad.components.ad.fullscreen.c.c.b r0) {
            android.widget.FrameLayout r0 = r0.dm
            return r0
    }

    @Override // com.kwad.components.ad.reward.presenter.f.a, com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.components.core.webview.jshandler.ae.a r6) {
            r5 = this;
            android.content.Context r0 = r5.getContext()
            float r0 = com.kwad.sdk.c.a.a.bj(r0)
            android.widget.FrameLayout r1 = r5.dm
            r2 = 0
            if (r1 == 0) goto L1a
            int r1 = r1.getHeight()
            float r1 = (float) r1
            android.widget.FrameLayout r3 = r5.dm
            int r3 = r3.getWidth()
            float r3 = (float) r3
            goto L1c
        L1a:
            r1 = 0
            r3 = 0
        L1c:
            int r4 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r4 == 0) goto L32
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 != 0) goto L25
            goto L32
        L25:
            float r3 = r3 / r0
            r2 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r2
            int r3 = (int) r3
            r6.width = r3
            float r1 = r1 / r0
            float r1 = r1 + r2
            int r0 = (int) r1
            r6.height = r0
            return
        L32:
            super.a(r6)
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.components.core.webview.tachikoma.TKRenderFailReason r2) {
            r1 = this;
            super.a(r2)
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            com.kwad.components.ad.reward.monitor.b.a(r0, r2)
            android.widget.FrameLayout r2 = r1.dm
            r0 = 8
            r2.setVisibility(r0)
            com.kwad.components.ad.reward.g r2 = r1.tm
            r0 = 0
            r2.rT = r0
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.ad.reward.presenter.b, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r2 = this;
            super.at()
            com.kwad.components.ad.reward.g r0 = r2.tm
            r1 = 1
            r0.rT = r1
            com.kwad.components.ad.reward.a r0 = com.kwad.components.ad.reward.a.gg()
            com.kwad.components.ad.reward.e.j r1 = r2.kG
            r0.a(r1)
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final android.widget.FrameLayout getTKContainer() {
            r1 = this;
            android.widget.FrameLayout r0 = r1.dm
            return r0
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final java.lang.String getTKReaderScene() {
            r1 = this;
            java.lang.String r0 = "tk_fullscreen"
            return r0
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final java.lang.String getTkTemplateId() {
            r1 = this;
            com.kwad.components.ad.reward.g r0 = r1.tm
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            java.lang.String r0 = com.kwad.sdk.core.response.b.b.dI(r0)
            return r0
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r1 = this;
            super.onCreate()
            int r0 = com.kwad.sdk.R.id.ksad_js_full_card
            android.view.View r0 = r1.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r1.dm = r0
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r2 = this;
            super.onUnbind()
            com.kwad.components.ad.reward.a r0 = com.kwad.components.ad.reward.a.gg()
            com.kwad.components.ad.reward.e.j r1 = r2.kG
            r0.b(r1)
            return
    }
}
