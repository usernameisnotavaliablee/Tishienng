package com.kwad.components.ad.reward.presenter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class r extends com.kwad.components.ad.reward.presenter.b implements com.kwad.components.ad.reward.e.g, com.kwad.components.ad.reward.e.j, com.kwad.components.core.webview.jshandler.as.b {
    private com.kwad.components.core.webview.tachikoma.f.g jN;
    private float vY;
    private boolean wn;

    @androidx.annotation.Nullable
    private com.kwad.components.ad.reward.presenter.r.a wo;

    @androidx.annotation.Nullable
    private com.kwad.components.ad.reward.presenter.q wp;

    @androidx.annotation.Nullable
    private com.kwad.components.ad.reward.presenter.o wq;
    private com.kwad.components.ad.reward.presenter.p wr;
    private int ws;
    private boolean wt;
    private boolean wu;
    private boolean wv;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends com.kwad.components.core.video.m {
        private long videoDuration;
        final /* synthetic */ com.kwad.components.ad.reward.presenter.r ww;
        private long wx;

        private a(com.kwad.components.ad.reward.presenter.r r1) {
                r0 = this;
                r0.ww = r1
                r0.<init>()
                return
        }

        /* synthetic */ a(com.kwad.components.ad.reward.presenter.r r1, byte r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        static /* synthetic */ long a(com.kwad.components.ad.reward.presenter.r.a r2) {
                long r0 = r2.videoDuration
                return r0
        }

        static /* synthetic */ long b(com.kwad.components.ad.reward.presenter.r.a r2) {
                long r0 = r2.wx
                return r0
        }

        @Override // com.kwad.components.core.video.m, com.kwad.components.core.video.i
        public final void onMediaPlayProgress(long r8, long r10) {
                r7 = this;
                super.onMediaPlayProgress(r8, r10)
                r7.wx = r10
                r7.videoDuration = r8
                com.kwad.components.ad.reward.presenter.r r0 = r7.ww
                com.kwad.components.ad.reward.g r0 = r0.tm
                boolean r0 = r0.gG()
                if (r0 != 0) goto L19
                com.kwad.components.ad.reward.presenter.r r1 = r7.ww
                r6 = 0
                r2 = r8
                r4 = r10
                com.kwad.components.ad.reward.presenter.r.a(r1, r2, r4, r6)
            L19:
                return
        }
    }

    public r(com.kwad.sdk.core.response.model.AdTemplate r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0, r0)
            return
    }

    public r(com.kwad.sdk.core.response.model.AdTemplate r2, boolean r3, boolean r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.ws = r0
            r1.wt = r0
            r1.wu = r3
            r1.wv = r4
            com.kwad.sdk.core.response.model.AdInfo r2 = com.kwad.sdk.core.response.b.e.el(r2)
            boolean r2 = com.kwad.sdk.core.response.b.a.bK(r2)
            if (r2 == 0) goto L20
            com.kwad.components.ad.reward.presenter.p r2 = new com.kwad.components.ad.reward.presenter.p
            r2.<init>()
            r1.wr = r2
            r1.a(r2)
        L20:
            return
    }

    private int a(com.kwad.components.ad.reward.e.g r2) {
            r1 = this;
            int r0 = r1.getPriority()
            int r2 = r2.getPriority()
            int r0 = r0 - r2
            return r0
    }

    static /* synthetic */ void a(com.kwad.components.ad.reward.presenter.r r0) {
            r0.iP()
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.reward.presenter.r r0, long r1, long r3, boolean r5) {
            r5 = 0
            r0.b(r1, r3, r5)
            return
    }

    private void b(long r4, long r6, boolean r8) {
            r3 = this;
            boolean r0 = r3.iQ()
            if (r0 == 0) goto L38
            r0 = 10000(0x2710, double:4.9407E-320)
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 < 0) goto L38
            float r6 = (float) r6
            float r4 = (float) r4
            float r5 = r3.vY
            float r4 = r4 * r5
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 < 0) goto L38
            boolean r4 = com.kwad.components.ad.reward.a.b.hH()
            r5 = 1
            if (r4 == 0) goto L2d
            boolean r4 = r3.wt
            if (r4 != 0) goto L38
            com.kwad.components.ad.reward.presenter.q r4 = r3.wp
            if (r4 == 0) goto L38
            r4.iL()
            r3.ws = r5
            r3.wt = r5
            return
        L2d:
            com.kwad.components.ad.reward.presenter.o r4 = r3.wq
            if (r4 == 0) goto L38
            r5 = r5 ^ r8
            r4.I(r5)
            r4 = 2
            r3.ws = r4
        L38:
            return
    }

    private com.kwad.components.core.webview.tachikoma.f.g dh() {
            r1 = this;
            com.kwad.components.core.webview.tachikoma.f.g r0 = r1.jN
            if (r0 != 0) goto Lb
            com.kwad.components.ad.reward.presenter.r$2 r0 = new com.kwad.components.ad.reward.presenter.r$2
            r0.<init>(r1)
            r1.jN = r0
        Lb:
            com.kwad.components.core.webview.tachikoma.f.g r0 = r1.jN
            return r0
    }

    private void iP() {
            r2 = this;
            boolean r0 = r2.wv
            r1 = 1
            if (r0 == 0) goto Lf
            com.kwad.components.ad.reward.presenter.q r0 = new com.kwad.components.ad.reward.presenter.q
            r0.<init>(r2)
            r2.wp = r0
            r2.a(r0, r1)
        Lf:
            boolean r0 = r2.wu
            if (r0 == 0) goto L1d
            com.kwad.components.ad.reward.presenter.o r0 = new com.kwad.components.ad.reward.presenter.o
            r0.<init>(r2)
            r2.wq = r0
            r2.a(r0, r1)
        L1d:
            return
    }

    private boolean iQ() {
            r1 = this;
            boolean r0 = r1.wn
            return r0
    }

    @Override // com.kwad.components.ad.reward.e.j
    public final void a(com.kwad.components.core.playable.PlayableSource r1, @androidx.annotation.Nullable com.kwad.components.ad.reward.e.n r2) {
            r0 = this;
            com.kwad.components.ad.reward.g r1 = r0.tm
            r2 = 1
            r1.A(r2)
            int r1 = r0.ws
            if (r1 != r2) goto L12
            com.kwad.components.ad.reward.presenter.q r2 = r0.wp
            if (r2 == 0) goto L12
            r2.iM()
            return
        L12:
            r2 = 2
            if (r1 != r2) goto L1c
            com.kwad.components.ad.reward.presenter.o r1 = r0.wq
            if (r1 == 0) goto L1c
            r1.hide()
        L1c:
            return
    }

    @Override // com.kwad.components.core.webview.jshandler.as.b
    public final void a(com.kwad.components.core.webview.jshandler.as.a r7) {
            r6 = this;
            boolean r7 = r7.isSuccess()
            r6.wn = r7
            if (r7 == 0) goto L1b
            com.kwad.components.ad.reward.presenter.r$a r7 = r6.wo
            if (r7 == 0) goto L1b
            long r1 = com.kwad.components.ad.reward.presenter.r.a.a(r7)
            com.kwad.components.ad.reward.presenter.r$a r7 = r6.wo
            long r3 = com.kwad.components.ad.reward.presenter.r.a.b(r7)
            r5 = 0
            r0 = r6
            r0.b(r1, r3, r5)
        L1b:
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.b, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r3 = this;
            super.at()
            com.kwad.components.ad.reward.g r0 = r3.tm
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            boolean r1 = com.kwad.sdk.core.response.b.a.bK(r0)
            if (r1 == 0) goto L2e
            com.kwad.components.ad.reward.g r0 = r3.tm
            boolean r0 = r0.rT
            if (r0 != 0) goto L22
            com.kwad.components.ad.reward.presenter.r$1 r0 = new com.kwad.components.ad.reward.presenter.r$1
            r0.<init>(r3)
            r1 = 100
            com.kwad.sdk.utils.bw.runOnUiThreadDelay(r0, r1)
            goto L3f
        L22:
            com.kwad.components.core.webview.tachikoma.e.c r0 = com.kwad.components.core.webview.tachikoma.e.c.vO()
            com.kwad.components.core.webview.tachikoma.f.g r1 = r3.dh()
            r0.a(r1)
            goto L3f
        L2e:
            boolean r0 = com.kwad.sdk.core.response.b.a.bN(r0)
            if (r0 != 0) goto L3f
            com.kwad.components.core.p.a r0 = com.kwad.components.core.p.a.se()
            com.kwad.components.ad.reward.g r1 = r3.tm
            com.kwad.sdk.core.response.model.AdTemplate r1 = r1.mAdTemplate
            r0.aJ(r1)
        L3f:
            com.kwad.components.ad.reward.g r0 = r3.tm
            r0.b(r3)
            com.kwad.components.ad.reward.g r0 = r3.tm
            com.kwad.components.core.playable.a r0 = r0.rF
            if (r0 == 0) goto L4d
            r0.a(r3)
        L4d:
            boolean r0 = com.kwad.components.ad.reward.a.b.hG()
            float r1 = com.kwad.components.ad.reward.a.b.hF()
            r3.vY = r1
            if (r0 == 0) goto L6a
            com.kwad.components.ad.reward.presenter.r$a r0 = new com.kwad.components.ad.reward.presenter.r$a
            r1 = 0
            r0.<init>(r3, r1)
            r3.wo = r0
            com.kwad.components.ad.reward.g r1 = r3.tm
            com.kwad.components.ad.reward.m.e r1 = r1.rE
            if (r1 == 0) goto L6a
            r1.a(r0)
        L6a:
            com.kwad.components.ad.reward.a r0 = com.kwad.components.ad.reward.a.gg()
            r0.a(r3)
            return
    }

    @Override // com.kwad.components.ad.reward.e.g
    public final void cX() {
            r2 = this;
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl r0 = r0.rG
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl$ShowActionBarResult r0 = r0.jr()
            if (r0 == 0) goto Lf
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl$ShowActionBarResult r1 = com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.ShowActionBarResult.SHOW_NATIVE_PLAYABLE_PORTRAIT
            r0.equals(r1)
        Lf:
            com.kwad.components.ad.reward.presenter.p r0 = r2.wr
            if (r0 == 0) goto L2f
            com.kwad.components.ad.reward.g r0 = r2.tm
            boolean r0 = r0.gQ()
            if (r0 == 0) goto L1c
            goto L2f
        L1c:
            boolean r0 = r2.iQ()
            if (r0 == 0) goto L2a
            com.kwad.components.ad.reward.presenter.p r0 = r2.wr
            com.kwad.components.core.playable.PlayableSource r1 = com.kwad.components.core.playable.PlayableSource.PLAY_FINISHED_NORMAL
            r0.e(r1)
            return
        L2a:
            com.kwad.components.ad.reward.presenter.p r0 = r2.wr
            r0.iK()
        L2f:
            return
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(com.kwad.components.ad.reward.e.g r1) {
            r0 = this;
            com.kwad.components.ad.reward.e.g r1 = (com.kwad.components.ad.reward.e.g) r1
            int r1 = r0.a(r1)
            return r1
    }

    @Override // com.kwad.components.ad.reward.e.j
    public final void dk() {
            r9 = this;
            com.kwad.components.ad.reward.g r0 = r9.tm
            r1 = 0
            r0.A(r1)
            com.kwad.components.ad.reward.presenter.r$a r0 = r9.wo
            if (r0 == 0) goto L1e
            int r1 = r9.ws
            r2 = 2
            if (r1 != r2) goto L1e
            long r4 = com.kwad.components.ad.reward.presenter.r.a.a(r0)
            com.kwad.components.ad.reward.presenter.r$a r0 = r9.wo
            long r6 = com.kwad.components.ad.reward.presenter.r.a.b(r0)
            r8 = 1
            r3 = r9
            r3.b(r4, r6, r8)
        L1e:
            return
    }

    @Override // com.kwad.components.ad.reward.e.j
    public final void dl() {
            r0 = this;
            return
    }

    @Override // com.kwad.components.ad.reward.e.g
    public final int getPriority() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final boolean onBackPressed() {
            r3 = this;
            com.kwad.components.ad.reward.g r0 = r3.tm
            boolean r0 = r0.gU()
            com.kwad.components.ad.reward.g r1 = r3.tm
            boolean r1 = r1.gG()
            r2 = 0
            if (r1 == 0) goto L20
            if (r0 == 0) goto L12
            return r2
        L12:
            com.kwad.components.ad.reward.a r0 = com.kwad.components.ad.reward.a.gg()
            r0.gh()
            com.kwad.components.ad.reward.g r0 = r3.tm
            r0.A(r2)
            r0 = 1
            return r0
        L20:
            return r2
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r2 = this;
            super.onUnbind()
            com.kwad.components.ad.reward.g r0 = r2.tm
            r0.c(r2)
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.core.playable.a r0 = r0.rF
            if (r0 == 0) goto L11
            r0.b(r2)
        L11:
            com.kwad.components.ad.reward.presenter.r$a r0 = r2.wo
            if (r0 == 0) goto L1e
            com.kwad.components.ad.reward.g r1 = r2.tm
            com.kwad.components.ad.reward.m.e r1 = r1.rE
            if (r1 == 0) goto L1e
            r1.b(r0)
        L1e:
            com.kwad.components.ad.reward.a r0 = com.kwad.components.ad.reward.a.gg()
            r0.b(r2)
            com.kwad.components.core.webview.tachikoma.e.c r0 = com.kwad.components.core.webview.tachikoma.e.c.vO()
            com.kwad.components.core.webview.tachikoma.f.g r1 = r2.jN
            r0.b(r1)
            return
    }
}
