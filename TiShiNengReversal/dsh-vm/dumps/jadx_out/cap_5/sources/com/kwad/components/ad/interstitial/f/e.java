package com.kwad.components.ad.interstitial.f;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class e extends com.kwad.components.ad.interstitial.f.b implements com.kwad.components.core.video.a.c {
    private static long nb = 1000;
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;
    private com.kwad.components.ad.interstitial.f.c mj;

    @androidx.annotation.Nullable
    private com.kwad.components.ad.interstitial.f.e.a nc;
    private int nd;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements java.lang.Runnable {
        private int ne;
        private boolean nf;
        private boolean ng;
        final /* synthetic */ com.kwad.components.ad.interstitial.f.e nh;

        private a(com.kwad.components.ad.interstitial.f.e r1) {
                r0 = this;
                r0.nh = r1
                r0.<init>()
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0.ne = r1
                r1 = 0
                r0.nf = r1
                r0.ng = r1
                return
        }

        /* synthetic */ a(com.kwad.components.ad.interstitial.f.e r1, byte r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public final void r(boolean r1) {
                r0 = this;
                r1 = 1
                r0.ng = r1
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r4 = this;
                boolean r0 = r4.ng
                if (r0 == 0) goto L5
                goto L24
            L5:
                boolean r0 = r4.nf
                r1 = 0
                if (r0 == 0) goto L12
                long r2 = com.kwad.components.ad.interstitial.f.e.ew()
                com.kwad.sdk.utils.bw.a(r4, r1, r2)
                return
            L12:
                int r0 = r4.ne
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r0 != r2) goto L20
                com.kwad.components.ad.interstitial.f.e r0 = r4.nh
                int r0 = com.kwad.components.ad.interstitial.f.e.a(r0)
                r4.ne = r0
            L20:
                int r0 = r4.ne
                if (r0 >= 0) goto L25
            L24:
                return
            L25:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                com.kwad.components.ad.interstitial.f.e r2 = r4.nh
                java.lang.String r2 = r2.toString()
                r0.append(r2)
                java.lang.String r2 = ", this: "
                r0.append(r2)
                java.lang.String r2 = r4.toString()
                r0.append(r2)
                java.lang.String r2 = " PlayableTimerRunnable run : "
                r0.append(r2)
                int r2 = r4.ne
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                java.lang.String r2 = "InterstitialPlayablePresenter"
                com.kwad.sdk.core.d.c.d(r2, r0)
                com.kwad.components.ad.interstitial.f.e r0 = r4.nh
                int r2 = r4.ne
                com.kwad.components.ad.interstitial.f.e.a(r0, r2)
                int r0 = r4.ne
                int r0 = r0 + (-1)
                r4.ne = r0
                long r2 = com.kwad.components.ad.interstitial.f.e.ew()
                com.kwad.sdk.utils.bw.a(r4, r1, r2)
                return
        }

        public final void s(boolean r1) {
                r0 = this;
                r0.nf = r1
                return
        }
    }

    static {
            return
    }

    public e() {
            r0 = this;
            r0.<init>()
            return
    }

    private void P(int r4) {
            r3 = this;
            com.kwad.components.ad.interstitial.f.c r0 = r3.mj
            com.kwad.components.ad.interstitial.h.d r1 = r0.mk
            if (r1 != 0) goto L7
            goto L26
        L7:
            r2 = 1
            if (r4 != 0) goto L27
            boolean r4 = r0.dV()
            if (r4 != 0) goto L26
            com.kwad.components.ad.interstitial.f.c r4 = r3.mj
            android.content.Context r0 = r3.getContext()
            com.kwad.sdk.core.response.model.AdTemplate r1 = r3.mAdTemplate
            r4.c(r0, r1)
            r3.ev()
            com.kwad.components.ad.interstitial.f.c r4 = r3.mj
            r0 = -1
            com.kwad.sdk.core.video.videoview.a r1 = r4.cq
            r4.a(r2, r0, r1)
        L26:
            return
        L27:
            r1.b(r2, r4)
            return
    }

    static /* synthetic */ int a(com.kwad.components.ad.interstitial.f.e r0) {
            int r0 = r0.nd
            return r0
    }

    static /* synthetic */ void a(com.kwad.components.ad.interstitial.f.e r0, int r1) {
            r0.P(r1)
            return
    }

    private void ev() {
            r1 = this;
            com.kwad.components.ad.interstitial.f.c r0 = r1.mj
            com.kwad.sdk.core.video.videoview.a r0 = r0.cq
            if (r0 == 0) goto L9
            r0.release()
        L9:
            com.kwad.components.ad.interstitial.f.c r0 = r1.mj
            com.kwad.components.ad.interstitial.d r0 = r0.kW
            r0.dismiss()
            com.kwad.components.ad.interstitial.f.c r0 = r1.mj
            r0.Y()
            return
    }

    static /* synthetic */ long ew() {
            long r0 = com.kwad.components.ad.interstitial.f.e.nb
            return r0
    }

    @Override // com.kwad.components.core.video.a.c
    public final void aq() {
            r0 = this;
            return
    }

    @Override // com.kwad.components.core.video.a.c
    public final void ar() {
            r3 = this;
            com.kwad.components.ad.interstitial.f.c r0 = r3.mj
            boolean r0 = r0.dV()
            if (r0 != 0) goto L16
            com.kwad.components.ad.interstitial.f.c r0 = r3.mj
            android.content.Context r1 = r3.getContext()
            com.kwad.sdk.core.response.model.AdTemplate r2 = r3.mAdTemplate
            r0.c(r1, r2)
            r3.ev()
        L16:
            return
    }

    @Override // com.kwad.components.ad.interstitial.f.b, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r6 = this;
            super.at()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.String r1 = " onBind"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "InterstitialPlayablePresenter"
            com.kwad.sdk.core.d.c.d(r1, r0)
            java.lang.Object r0 = r6.NN()
            com.kwad.components.ad.interstitial.f.c r0 = (com.kwad.components.ad.interstitial.f.c) r0
            r6.mj = r0
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            r6.mAdTemplate = r0
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            com.kwad.sdk.core.response.model.AdInfo$AdInsertScreenInfo r1 = r0.adInsertScreenInfo
            int r1 = r1.autoCloseTime
            long r1 = (long) r1
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L41
            int r3 = com.kwad.components.ad.interstitial.b.b.b(r0)
            long r3 = (long) r3
            long r1 = java.lang.Math.min(r3, r1)
            int r2 = (int) r1
            r6.nd = r2
            goto L47
        L41:
            int r1 = com.kwad.components.ad.interstitial.b.b.b(r0)
            r6.nd = r1
        L47:
            com.kwad.components.ad.interstitial.f.c r1 = r6.mj
            com.kwad.components.ad.interstitial.h.d r1 = r1.mk
            if (r1 == 0) goto L53
            r2 = 1
            int r3 = r6.nd
            r1.b(r2, r3)
        L53:
            boolean r0 = com.kwad.sdk.core.response.b.a.bc(r0)
            r1 = 0
            if (r0 == 0) goto L62
            r6.nc = r1
            com.kwad.components.ad.interstitial.f.c r0 = r6.mj
            r0.a(r6)
            return
        L62:
            com.kwad.components.ad.interstitial.f.e$a r0 = new com.kwad.components.ad.interstitial.f.e$a
            r2 = 0
            r0.<init>(r6, r2)
            r6.nc = r0
            r2 = 1000(0x3e8, double:4.94E-321)
            com.kwad.sdk.utils.bw.a(r0, r1, r2)
            return
    }

    @Override // com.kwad.components.core.video.a.c
    public final void d(long r3) {
            r2 = this;
            r0 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r0
            int r4 = (int) r3
            int r3 = r2.nd
            int r3 = r3 - r4
            r2.P(r3)
            return
    }

    @Override // com.kwad.components.ad.interstitial.f.b
    public final void dR() {
            r2 = this;
            super.dR()
            com.kwad.components.ad.interstitial.f.e$a r0 = r2.nc
            if (r0 == 0) goto Lb
            r1 = 0
            r0.s(r1)
        Lb:
            return
    }

    @Override // com.kwad.components.ad.interstitial.f.b
    public final void dS() {
            r2 = this;
            super.dS()
            com.kwad.components.ad.interstitial.f.e$a r0 = r2.nc
            if (r0 == 0) goto Lb
            r1 = 1
            r0.s(r1)
        Lb:
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
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r1 = " onUnbind"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "InterstitialPlayablePresenter"
            com.kwad.sdk.core.d.c.d(r1, r0)
            com.kwad.components.ad.interstitial.f.c r0 = r2.mj
            r0.b(r2)
            com.kwad.components.ad.interstitial.f.e$a r0 = r2.nc
            if (r0 == 0) goto L2e
            r1 = 1
            r0.r(r1)
            com.kwad.components.ad.interstitial.f.e$a r0 = r2.nc
            com.kwad.sdk.utils.bw.c(r0)
            r0 = 0
            r2.nc = r0
        L2e:
            return
    }

    @Override // com.kwad.components.core.video.a.c
    public final void onVideoPlayStart() {
            r0 = this;
            return
    }
}
