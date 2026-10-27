package com.kwad.components.ad.draw.presenter.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a extends com.kwad.components.ad.draw.b.a {
    private java.util.List<java.lang.Integer> ck;
    private boolean eD;
    private volatile boolean eE;
    private com.kwad.sdk.widget.l eF;
    private com.kwad.sdk.core.response.model.AdInfo mAdInfo;
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;
    private com.kwad.components.core.video.l mVideoPlayStateListener;



    public a() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.eD = r0
            r1.eE = r0
            com.kwad.components.ad.draw.presenter.a.a$1 r0 = new com.kwad.components.ad.draw.presenter.a.a$1
            r0.<init>(r1)
            r1.eF = r0
            com.kwad.components.ad.draw.presenter.a.a$2 r0 = new com.kwad.components.ad.draw.presenter.a.a$2
            r0.<init>(r1)
            r1.mVideoPlayStateListener = r0
            return
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate a(com.kwad.components.ad.draw.presenter.a.a r0) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ void a(com.kwad.components.ad.draw.presenter.a.a r0, long r1) {
            r0.c(r1)
            return
    }

    private void a(com.kwad.sdk.widget.l r3) {
            r2 = this;
            android.view.View r0 = r2.getRootView()
            boolean r1 = r0 instanceof com.kwad.sdk.core.view.AdBasePvFrameLayout
            if (r1 == 0) goto Ld
            com.kwad.sdk.core.view.AdBasePvFrameLayout r0 = (com.kwad.sdk.core.view.AdBasePvFrameLayout) r0
            r0.setVisibleListener(r3)
        Ld:
            return
    }

    static /* synthetic */ boolean a(com.kwad.components.ad.draw.presenter.a.a r0, boolean r1) {
            r0.eE = r1
            return r1
    }

    static /* synthetic */ com.kwad.components.ad.draw.b.b b(com.kwad.components.ad.draw.presenter.a.a r0) {
            com.kwad.components.ad.draw.b.b r0 = r0.dz
            return r0
    }

    static /* synthetic */ boolean b(com.kwad.components.ad.draw.presenter.a.a r0, boolean r1) {
            r0.eD = r1
            return r1
    }

    static /* synthetic */ com.kwad.components.ad.draw.b.b c(com.kwad.components.ad.draw.presenter.a.a r0) {
            com.kwad.components.ad.draw.b.b r0 = r0.dz
            return r0
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
            int r1 = r0.intValue()
            if (r3 < r1) goto L1b
            com.kwad.sdk.core.response.model.AdTemplate r4 = r2.mAdTemplate
            r1 = 0
            com.kwad.sdk.core.adlog.c.a(r4, r3, r1)
            java.util.List<java.lang.Integer> r3 = r2.ck
            r3.remove(r0)
        L38:
            return
    }

    static /* synthetic */ com.kwad.components.ad.draw.b.b d(com.kwad.components.ad.draw.presenter.a.a r0) {
            com.kwad.components.ad.draw.b.b r0 = r0.dz
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.draw.b.b e(com.kwad.components.ad.draw.presenter.a.a r0) {
            com.kwad.components.ad.draw.b.b r0 = r0.dz
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.draw.b.b f(com.kwad.components.ad.draw.presenter.a.a r0) {
            com.kwad.components.ad.draw.b.b r0 = r0.dz
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.draw.b.b g(com.kwad.components.ad.draw.presenter.a.a r0) {
            com.kwad.components.ad.draw.b.b r0 = r0.dz
            return r0
    }

    static /* synthetic */ boolean h(com.kwad.components.ad.draw.presenter.a.a r0) {
            boolean r0 = r0.eD
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.draw.b.b i(com.kwad.components.ad.draw.presenter.a.a r0) {
            com.kwad.components.ad.draw.b.b r0 = r0.dz
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.draw.b.b j(com.kwad.components.ad.draw.presenter.a.a r0) {
            com.kwad.components.ad.draw.b.b r0 = r0.dz
            return r0
    }

    static /* synthetic */ boolean k(com.kwad.components.ad.draw.presenter.a.a r0) {
            boolean r0 = r0.eE
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.draw.b.b l(com.kwad.components.ad.draw.presenter.a.a r0) {
            com.kwad.components.ad.draw.b.b r0 = r0.dz
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.draw.b.b m(com.kwad.components.ad.draw.presenter.a.a r0) {
            com.kwad.components.ad.draw.b.b r0 = r0.dz
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.draw.b.b n(com.kwad.components.ad.draw.presenter.a.a r0) {
            com.kwad.components.ad.draw.b.b r0 = r0.dz
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.draw.b.b o(com.kwad.components.ad.draw.presenter.a.a r0) {
            com.kwad.components.ad.draw.b.b r0 = r0.dz
            return r0
    }

    @Override // com.kwad.components.ad.draw.b.a, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r2 = this;
            super.at()
            com.kwad.components.ad.draw.b.b r0 = r2.dz
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            r2.mAdTemplate = r0
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            r2.mAdInfo = r0
            java.util.List r0 = com.kwad.sdk.core.response.b.a.bp(r0)
            r2.ck = r0
            com.kwad.components.ad.draw.b.b r0 = r2.dz
            com.kwad.components.ad.draw.c.a r0 = r0.dB
            com.kwad.components.core.video.l r1 = r2.mVideoPlayStateListener
            r0.a2(r1)
            com.kwad.sdk.widget.l r0 = r2.eF
            r2.a(r0)
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r2 = this;
            super.onUnbind()
            com.kwad.components.ad.draw.b.b r0 = r2.dz
            com.kwad.components.ad.draw.c.a r0 = r0.dB
            com.kwad.components.core.video.l r1 = r2.mVideoPlayStateListener
            r0.b2(r1)
            r0 = 0
            r2.a(r0)
            return
    }
}
