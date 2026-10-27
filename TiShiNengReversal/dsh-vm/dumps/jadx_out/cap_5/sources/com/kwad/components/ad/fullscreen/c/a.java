package com.kwad.components.ad.fullscreen.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a extends com.kwad.components.ad.reward.presenter.b {
    private com.kwad.components.core.video.m jE;
    private final com.kwad.components.ad.reward.e.m jF;



    public a() {
            r1 = this;
            r1.<init>()
            com.kwad.components.ad.fullscreen.c.a$1 r0 = new com.kwad.components.ad.fullscreen.c.a$1
            r0.<init>(r1)
            r1.jE = r0
            com.kwad.components.ad.fullscreen.c.a$2 r0 = new com.kwad.components.ad.fullscreen.c.a$2
            r0.<init>(r1)
            r1.jF = r0
            return
    }

    static /* synthetic */ com.kwad.components.ad.reward.g a(com.kwad.components.ad.fullscreen.c.a r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g b(com.kwad.components.ad.fullscreen.c.a r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g c(com.kwad.components.ad.fullscreen.c.a r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    @Override // com.kwad.components.ad.reward.presenter.b, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r2 = this;
            super.at()
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.m.e r0 = r0.rE
            com.kwad.components.core.video.m r1 = r2.jE
            r0.a(r1)
            com.kwad.components.ad.reward.c r0 = com.kwad.components.ad.reward.c.gn()
            com.kwad.components.ad.reward.e.m r1 = r2.jF
            r0.a(r1)
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r2 = this;
            super.onUnbind()
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.m.e r0 = r0.rE
            com.kwad.components.core.video.m r1 = r2.jE
            r0.b(r1)
            com.kwad.components.ad.reward.c r0 = com.kwad.components.ad.reward.c.gn()
            com.kwad.components.ad.reward.e.m r1 = r2.jF
            r0.b(r1)
            return
    }
}
