package com.kwad.components.ad.splashscreen.presenter.endcard;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class e extends com.kwad.components.ad.splashscreen.presenter.e {
    private com.kwad.components.core.webview.tachikoma.f.g mq;


    public e() {
            r1 = this;
            r1.<init>()
            com.kwad.components.ad.splashscreen.presenter.endcard.e$1 r0 = new com.kwad.components.ad.splashscreen.presenter.endcard.e$1
            r0.<init>(r1)
            r1.mq = r0
            return
    }

    @Override // com.kwad.components.ad.splashscreen.presenter.e, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r2 = this;
            super.at()
            com.kwad.components.core.webview.tachikoma.e.c r0 = com.kwad.components.core.webview.tachikoma.e.c.vO()
            com.kwad.components.core.webview.tachikoma.f.g r1 = r2.mq
            r0.a(r1)
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r0 = this;
            super.onCreate()
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r2 = this;
            super.onUnbind()
            com.kwad.components.core.webview.tachikoma.e.c r0 = com.kwad.components.core.webview.tachikoma.e.c.vO()
            com.kwad.components.core.webview.tachikoma.f.g r1 = r2.mq
            r0.b(r1)
            return
    }
}
