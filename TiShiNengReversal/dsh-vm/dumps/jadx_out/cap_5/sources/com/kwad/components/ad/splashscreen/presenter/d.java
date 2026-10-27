package com.kwad.components.ad.splashscreen.presenter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class d extends com.kwad.components.ad.splashscreen.presenter.e {
    private java.util.List<java.lang.Integer> ck;
    private final com.kwad.components.core.video.l mVideoPlayStateListener;


    public d() {
            r1 = this;
            r1.<init>()
            com.kwad.components.ad.splashscreen.presenter.d$1 r0 = new com.kwad.components.ad.splashscreen.presenter.d$1
            r0.<init>(r1)
            r1.mVideoPlayStateListener = r0
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.splashscreen.presenter.d r0) {
            r0.mg()
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.splashscreen.presenter.d r0, long r1) {
            r0.c(r1)
            return
    }

    static /* synthetic */ void b(com.kwad.components.ad.splashscreen.presenter.d r0) {
            r0.mh()
            return
    }

    private void c(long r3) {
            r2 = this;
            float r3 = (float) r3
            r4 = 1148846080(0x447a0000, float:1000.0)
            float r3 = r3 / r4
            double r3 = (double) r3
            double r3 = java.lang.Math.ceil(r3)
            int r3 = (int) r3
            java.util.List<java.lang.Integer> r4 = r2.ck
            if (r4 == 0) goto L38
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L15
            goto L38
        L15:
            java.util.List<java.lang.Integer> r4 = r2.ck
            java.util.Iterator r4 = r4.iterator()
        L1b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L38
            java.lang.Object r0 = r4.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r3 < r0) goto L1b
            com.kwad.components.ad.splashscreen.h r0 = r2.Gf
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            r1 = 0
            com.kwad.sdk.core.adlog.c.a(r0, r3, r1)
            r4.remove()
        L38:
            return
    }

    private void mg() {
            r1 = this;
            com.kwad.components.ad.splashscreen.h r0 = r1.Gf
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.sdk.core.adlog.c.bX(r0)
            return
    }

    private void mh() {
            r1 = this;
            com.kwad.components.ad.splashscreen.h r0 = r1.Gf
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.sdk.core.adlog.c.bY(r0)
            return
    }

    @Override // com.kwad.components.ad.splashscreen.presenter.e, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r2 = this;
            super.at()
            com.kwad.components.ad.splashscreen.h r0 = r2.Gf
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            java.util.List r0 = com.kwad.sdk.core.response.b.a.bp(r0)
            r2.ck = r0
            com.kwad.components.ad.splashscreen.h r0 = r2.Gf
            com.kwad.components.ad.splashscreen.d.a r0 = r0.Fq
            if (r0 == 0) goto L1c
            com.kwad.components.core.video.l r1 = r2.mVideoPlayStateListener
            r0.a2(r1)
        L1c:
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r2 = this;
            super.onUnbind()
            com.kwad.components.ad.splashscreen.h r0 = r2.Gf
            com.kwad.components.ad.splashscreen.d.a r0 = r0.Fq
            if (r0 == 0) goto Le
            com.kwad.components.core.video.l r1 = r2.mVideoPlayStateListener
            r0.b2(r1)
        Le:
            return
    }
}
