package com.kwad.components.ad.reward.presenter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class q extends com.kwad.components.ad.reward.presenter.b {
    private com.kwad.components.ad.reward.e.g mPlayEndPageListener;
    private float vY;
    private com.kwad.components.ad.reward.presenter.r wa;
    private boolean wb;
    private com.kwad.components.ad.reward.widget.KsToastView wh;
    private boolean wi;
    private boolean wj;
    private java.lang.Runnable wk;
    private boolean wl;




    public q(com.kwad.components.ad.reward.presenter.r r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.wi = r0
            r1.wj = r0
            r1.wl = r0
            r1.wb = r0
            com.kwad.components.ad.reward.presenter.q$1 r0 = new com.kwad.components.ad.reward.presenter.q$1
            r0.<init>(r1)
            r1.mPlayEndPageListener = r0
            r1.wa = r2
            return
    }

    static /* synthetic */ com.kwad.components.ad.reward.widget.KsToastView a(com.kwad.components.ad.reward.presenter.q r0) {
            com.kwad.components.ad.reward.widget.KsToastView r0 = r0.wh
            return r0
    }

    static /* synthetic */ boolean a(com.kwad.components.ad.reward.presenter.q r0, boolean r1) {
            r1 = 1
            r0.wl = r1
            return r1
    }

    static /* synthetic */ boolean b(com.kwad.components.ad.reward.presenter.q r0) {
            boolean r0 = r0.wl
            return r0
    }

    private synchronized void iI() {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.wb     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L7
            monitor-exit(r4)
            return
        L7:
            com.kwad.components.ad.reward.g r0 = r4.tm     // Catch: java.lang.Throwable -> L2b
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate     // Catch: java.lang.Throwable -> L2b
            com.kwad.sdk.core.adlog.c.b r1 = new com.kwad.sdk.core.adlog.c.b     // Catch: java.lang.Throwable -> L2b
            r1.<init>()     // Catch: java.lang.Throwable -> L2b
            r2 = 192(0xc0, float:2.69E-43)
            com.kwad.sdk.core.adlog.c.b r1 = r1.df(r2)     // Catch: java.lang.Throwable -> L2b
            com.kwad.components.ad.reward.g r2 = r4.tm     // Catch: java.lang.Throwable -> L2b
            com.kwad.components.ad.reward.m.e r2 = r2.rE     // Catch: java.lang.Throwable -> L2b
            long r2 = r2.getPlayDuration()     // Catch: java.lang.Throwable -> L2b
            com.kwad.sdk.core.adlog.c.b r1 = r1.aw(r2)     // Catch: java.lang.Throwable -> L2b
            r2 = 0
            com.kwad.sdk.core.adlog.c.d(r0, r2, r1)     // Catch: java.lang.Throwable -> L2b
            r0 = 1
            r4.wb = r0     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r4)
            return
        L2b:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2b
            throw r0
    }

    private void iN() {
            r1 = this;
            com.kwad.components.ad.reward.presenter.q$3 r0 = new com.kwad.components.ad.reward.presenter.q$3
            r0.<init>(r1)
            r1.wk = r0
            return
    }

    private void iO() {
            r1 = this;
            java.lang.Runnable r0 = r1.wk
            com.kwad.sdk.utils.bw.c(r0)
            r0 = 0
            r1.wk = r0
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.b, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r2 = this;
            super.at()
            com.kwad.components.ad.reward.widget.KsToastView r0 = r2.wh
            if (r0 != 0) goto L19
            int r0 = com.kwad.sdk.R.id.ksad_toast_view
            android.view.View r0 = r2.findViewById(r0)
            com.kwad.components.ad.reward.widget.KsToastView r0 = (com.kwad.components.ad.reward.widget.KsToastView) r0
            r2.wh = r0
            com.kwad.components.ad.reward.presenter.q$2 r1 = new com.kwad.components.ad.reward.presenter.q$2
            r1.<init>(r2)
            r0.setOnClickListener(r1)
        L19:
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.e.g r1 = r2.mPlayEndPageListener
            r0.b(r1)
            return
    }

    public final void iL() {
            r4 = this;
            boolean r0 = r4.wj
            if (r0 == 0) goto L5
            return
        L5:
            r4.iI()
            r0 = 1
            r4.wj = r0
            com.kwad.components.ad.reward.widget.KsToastView r0 = r4.wh
            r1 = 0
            r0.setVisibility(r1)
            com.kwad.components.ad.reward.widget.KsToastView r0 = r4.wh
            r1 = 3
            r0.ai(r1)
            r4.iN()
            java.lang.Runnable r0 = r4.wk
            r1 = 0
            r2 = 3000(0xbb8, double:1.482E-320)
            com.kwad.sdk.utils.bw.a(r0, r1, r2)
            return
    }

    public final void iM() {
            r2 = this;
            r0 = 0
            r2.wj = r0
            com.kwad.components.ad.reward.widget.KsToastView r0 = r2.wh
            r1 = 8
            r0.setVisibility(r1)
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r1 = this;
            super.onCreate()
            float r0 = com.kwad.components.ad.reward.a.b.hF()
            r1.vY = r0
            boolean r0 = com.kwad.components.ad.reward.a.b.hG()
            if (r0 == 0) goto L17
            boolean r0 = com.kwad.components.ad.reward.a.b.hH()
            if (r0 == 0) goto L17
            r0 = 1
            goto L18
        L17:
            r0 = 0
        L18:
            r1.wi = r0
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r2 = this;
            super.onUnbind()
            r2.iO()
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.e.g r1 = r2.mPlayEndPageListener
            r0.c(r1)
            return
    }
}
