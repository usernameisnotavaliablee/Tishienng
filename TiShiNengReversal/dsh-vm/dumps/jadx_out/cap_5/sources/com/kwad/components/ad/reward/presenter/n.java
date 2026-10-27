package com.kwad.components.ad.reward.presenter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class n extends com.kwad.components.ad.reward.presenter.b {
    private com.kwad.components.core.video.m jE;
    private final com.kwad.components.ad.reward.e.m jF;




    public n() {
            r1 = this;
            r1.<init>()
            com.kwad.components.ad.reward.presenter.n$2 r0 = new com.kwad.components.ad.reward.presenter.n$2
            r0.<init>(r1)
            r1.jE = r0
            com.kwad.components.ad.reward.presenter.n$3 r0 = new com.kwad.components.ad.reward.presenter.n$3
            r0.<init>(r1)
            r1.jF = r0
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.reward.presenter.n r0) {
            r0.iH()
            return
    }

    private void iH() {
            r3 = this;
            com.kwad.components.ad.reward.g r0 = r3.tm
            com.kwad.sdk.core.response.model.AdTemplate r1 = r0.mAdTemplate
            boolean r0 = r0.rX
            boolean r0 = com.kwad.components.core.t.k.d(r1, r0)
            if (r0 == 0) goto L15
            com.kwad.components.ad.reward.g r0 = r3.tm
            android.content.Context r1 = r0.mContext
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.components.core.t.k.f(r1, r0)
        L15:
            com.kwad.components.ad.reward.g r0 = r3.tm
            boolean r0 = com.kwad.components.ad.reward.presenter.i.z(r0)
            if (r0 != 0) goto L30
            com.kwad.components.ad.reward.g r0 = r3.tm
            com.kwad.sdk.core.response.model.AdTemplate r1 = r0.mAdTemplate
            boolean r0 = r0.rX
            boolean r0 = com.kwad.components.core.t.k.d(r1, r0)
            if (r0 == 0) goto L2a
            goto L30
        L2a:
            com.kwad.components.ad.reward.g r0 = r3.tm
            r0.gK()
            return
        L30:
            com.kwad.components.ad.reward.presenter.n$1 r0 = new com.kwad.components.ad.reward.presenter.n$1
            r0.<init>(r3)
            r1 = 200(0xc8, double:9.9E-322)
            com.kwad.sdk.utils.bw.runOnUiThreadDelay(r0, r1)
            return
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
