package com.kwad.components.ad.reward.presenter.d.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a extends com.kwad.components.ad.reward.presenter.b implements com.kwad.components.ad.l.a.b {
    private com.kwad.sdk.core.webview.d.a.a eT;
    private android.widget.FrameLayout fc;
    private com.kwad.components.core.video.m jE;
    private com.kwad.components.ad.reward.e.g mPlayEndPageListener;
    private com.kwad.components.core.video.m vQ;
    private com.kwad.components.core.video.m vR;
    private volatile long yU;
    private volatile boolean yV;






    public a() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.yU = r0
            r0 = 0
            r2.yV = r0
            com.kwad.components.ad.reward.presenter.d.a.a$1 r0 = new com.kwad.components.ad.reward.presenter.d.a.a$1
            r0.<init>(r2)
            r2.vR = r0
            com.kwad.components.ad.reward.presenter.d.a.a$2 r0 = new com.kwad.components.ad.reward.presenter.d.a.a$2
            r0.<init>(r2)
            r2.jE = r0
            com.kwad.components.ad.reward.presenter.d.a.a$4 r0 = new com.kwad.components.ad.reward.presenter.d.a.a$4
            r0.<init>(r2)
            r2.mPlayEndPageListener = r0
            com.kwad.components.ad.reward.presenter.d.a.a$5 r0 = new com.kwad.components.ad.reward.presenter.d.a.a$5
            r0.<init>(r2)
            r2.eT = r0
            return
    }

    static /* synthetic */ long a(com.kwad.components.ad.reward.presenter.d.a.a r0, long r1) {
            r0.yU = r1
            return r1
    }

    static /* synthetic */ com.kwad.components.ad.reward.g a(com.kwad.components.ad.reward.presenter.d.a.a r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    static /* synthetic */ boolean a(com.kwad.components.ad.reward.presenter.d.a.a r0, boolean r1) {
            r0.yV = r1
            return r1
    }

    static /* synthetic */ com.kwad.components.ad.reward.g b(com.kwad.components.ad.reward.presenter.d.a.a r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g c(com.kwad.components.ad.reward.presenter.d.a.a r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g d(com.kwad.components.ad.reward.presenter.d.a.a r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g e(com.kwad.components.ad.reward.presenter.d.a.a r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    @Override // com.kwad.components.ad.reward.presenter.b, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r4 = this;
            super.at()
            r0 = 0
            r4.yU = r0
            r0 = 0
            r4.yV = r0
            com.kwad.components.ad.reward.g r0 = r4.tm
            com.kwad.sdk.core.response.model.AdTemplate r1 = r0.mAdTemplate
            com.kwad.components.ad.l.a r2 = r0.rI
            com.kwad.components.ad.reward.m.e r0 = r0.rE
            boolean r0 = r0.kW()
            if (r0 == 0) goto L1b
            com.kwad.components.core.video.m r0 = r4.vR
            goto L1d
        L1b:
            com.kwad.components.core.video.m r0 = r4.jE
        L1d:
            r4.vQ = r0
            if (r2 == 0) goto L5b
            com.kwad.components.ad.reward.g r0 = r4.tm
            r3 = 1
            r0.sf = r3
            r2.a(r4)
            com.kwad.sdk.core.webview.d.a.a r0 = r4.eT
            r2.a(r0)
            android.widget.FrameLayout r0 = r4.fc
            com.kwad.components.ad.reward.g r3 = r4.tm
            com.kwad.sdk.core.view.AdBaseFrameLayout r3 = r3.mRootContainer
            r2.a(r0, r3, r1)
            com.kwad.components.ad.reward.presenter.d.a.a$3 r0 = new com.kwad.components.ad.reward.presenter.d.a.a$3
            r0.<init>(r4)
            r2.a(r0)
            com.kwad.components.ad.reward.g r0 = r4.tm
            android.app.Activity r0 = r0.getActivity()
            r2.setActivity(r0)
            r2.bd()
            com.kwad.components.ad.reward.g r0 = r4.tm
            com.kwad.components.ad.reward.e.g r1 = r4.mPlayEndPageListener
            r0.b(r1)
            com.kwad.components.ad.reward.g r0 = r4.tm
            com.kwad.components.ad.reward.m.e r0 = r0.rE
            com.kwad.components.core.video.m r1 = r4.vQ
            r0.a(r1)
        L5b:
            return
    }

    @Override // com.kwad.components.ad.l.a.b
    public final void jG() {
            r1 = this;
            com.kwad.components.ad.reward.g r0 = r1.tm
            com.kwad.components.ad.reward.presenter.f.t(r0)
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r1 = this;
            super.onCreate()
            int r0 = com.kwad.sdk.R.id.ksad_landing_page_container
            android.view.View r0 = r1.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r1.fc = r0
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r2 = this;
            super.onUnbind()
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.e.g r1 = r2.mPlayEndPageListener
            r0.c(r1)
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.m.e r0 = r0.rE
            com.kwad.components.core.video.m r1 = r2.vQ
            r0.b(r1)
            return
    }
}
