package com.kwad.components.ad.c.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c extends com.kwad.components.ad.c.c.a {
    private com.kwad.components.ad.c.b.a cE;
    private com.kwad.components.ad.c.b.a cF;
    private android.widget.FrameLayout cG;
    private boolean cH;
    private boolean cI;
    private boolean cJ;
    private long cK;
    private boolean cL;
    private boolean cM;
    private com.kwad.sdk.utils.bg cN;
    private int cO;
    boolean cP;
    private android.os.Handler handler;
    private long startTime;








    public c() {
            r1 = this;
            r1.<init>()
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            r1.handler = r0
            r0 = 1
            r1.cM = r0
            com.kwad.components.ad.c.c.c$1 r0 = new com.kwad.components.ad.c.c.c$1
            r0.<init>(r1)
            r1.cN = r0
            r0 = 0
            r1.cO = r0
            return
    }

    static /* synthetic */ long a(com.kwad.components.ad.c.c.c r0, long r1) {
            r0.cK = r1
            return r1
    }

    private void a(android.view.ViewGroup r3) {
            r2 = this;
            boolean r0 = com.kwad.sdk.core.config.e.FK()
            if (r0 != 0) goto L26
            float r0 = com.kwad.sdk.core.config.e.FJ()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L26
            com.kwad.components.core.widget.a r0 = new com.kwad.components.core.widget.a
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1, r3)
            r3.addView(r0)
            com.kwad.components.ad.c.c.c$2 r3 = new com.kwad.components.ad.c.c.c$2
            r3.<init>(r2)
            r0.setViewCallback(r3)
            r0.vU()
        L26:
            return
    }

    static /* synthetic */ boolean a(com.kwad.components.ad.c.c.c r0) {
            boolean r0 = r0.cM
            return r0
    }

    static /* synthetic */ boolean a(com.kwad.components.ad.c.c.c r0, boolean r1) {
            r0.cJ = r1
            return r1
    }

    private void au() {
            r2 = this;
            android.os.Handler r0 = r2.handler
            com.kwad.sdk.utils.bg r1 = r2.cN
            r0.removeCallbacksAndMessages(r1)
            android.os.Handler r0 = r2.handler
            com.kwad.sdk.utils.bg r1 = r2.cN
            r0.post(r1)
            return
    }

    private void av() {
            r2 = this;
            android.os.Handler r0 = r2.handler
            com.kwad.sdk.utils.bg r1 = r2.cN
            r0.removeCallbacksAndMessages(r1)
            return
    }

    static /* synthetic */ long b(com.kwad.components.ad.c.c.c r2) {
            long r0 = r2.startTime
            return r0
    }

    static /* synthetic */ long b(com.kwad.components.ad.c.c.c r0, long r1) {
            r0.startTime = r1
            return r1
    }

    static /* synthetic */ boolean b(com.kwad.components.ad.c.c.c r0, boolean r1) {
            r1 = 1
            r0.cI = r1
            return r1
    }

    static /* synthetic */ boolean c(com.kwad.components.ad.c.c.c r0) {
            boolean r0 = r0.cI
            return r0
    }

    static /* synthetic */ boolean c(com.kwad.components.ad.c.c.c r0, boolean r1) {
            r0.cM = r1
            return r1
    }

    static /* synthetic */ long d(com.kwad.components.ad.c.c.c r2) {
            long r0 = r2.cK
            return r0
    }

    static /* synthetic */ boolean d(com.kwad.components.ad.c.c.c r0, boolean r1) {
            r1 = 1
            r0.cL = r1
            return r1
    }

    static /* synthetic */ android.os.Handler e(com.kwad.components.ad.c.c.c r0) {
            android.os.Handler r0 = r0.handler
            return r0
    }

    static /* synthetic */ void f(com.kwad.components.ad.c.c.c r0) {
            r0.au()
            return
    }

    static /* synthetic */ void g(com.kwad.components.ad.c.c.c r0) {
            r0.av()
            return
    }

    static /* synthetic */ android.content.Context h(com.kwad.components.ad.c.c.c r0) {
            android.content.Context r0 = r0.getContext()
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.c.b.a i(com.kwad.components.ad.c.c.c r0) {
            com.kwad.components.ad.c.b.a r0 = r0.cF
            return r0
    }

    static /* synthetic */ android.widget.FrameLayout j(com.kwad.components.ad.c.c.c r0) {
            android.widget.FrameLayout r0 = r0.cG
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.c.b.a k(com.kwad.components.ad.c.c.c r0) {
            com.kwad.components.ad.c.b.a r0 = r0.cE
            return r0
    }

    static /* synthetic */ boolean l(com.kwad.components.ad.c.c.c r0) {
            boolean r0 = r0.cL
            return r0
    }

    @Override // com.kwad.components.ad.c.c.a, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r2 = this;
            super.at()
            int r0 = com.kwad.sdk.R.id.ksad_banner_base_content
            android.view.View r0 = r2.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r2.cG = r0
            long r0 = java.lang.System.currentTimeMillis()
            r2.startTime = r0
            r2.au()
            android.widget.FrameLayout r0 = r2.cG
            r2.a(r0)
            return
    }

    public final void aw() {
            r7 = this;
            boolean r0 = r7.cJ
            if (r0 == 0) goto L5
            goto Lf
        L5:
            com.kwad.components.ad.c.b r0 = r7.cD
            java.util.List<com.kwad.sdk.core.response.model.AdTemplate> r0 = r0.bK
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L10
        Lf:
            return
        L10:
            com.kwad.components.ad.c.b.a r0 = new com.kwad.components.ad.c.b.a     // Catch: java.lang.Exception -> L61
            android.content.Context r1 = r7.getContext()     // Catch: java.lang.Exception -> L61
            com.kwad.components.ad.c.b r2 = r7.cD     // Catch: java.lang.Exception -> L61
            java.util.List<com.kwad.sdk.core.response.model.AdTemplate> r2 = r2.bK     // Catch: java.lang.Exception -> L61
            int r3 = r7.cO     // Catch: java.lang.Exception -> L61
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Exception -> L61
            com.kwad.sdk.core.response.model.AdTemplate r2 = (com.kwad.sdk.core.response.model.AdTemplate) r2     // Catch: java.lang.Exception -> L61
            com.kwad.components.ad.c.c.c$3 r3 = new com.kwad.components.ad.c.c.c$3     // Catch: java.lang.Exception -> L61
            r3.<init>(r7)     // Catch: java.lang.Exception -> L61
            r0.<init>(r1, r2, r3)     // Catch: java.lang.Exception -> L61
            com.kwad.components.ad.c.b r1 = r7.cD     // Catch: java.lang.Exception -> L61
            com.kwad.sdk.api.KsAdVideoPlayConfig r1 = r1.bJ     // Catch: java.lang.Exception -> L61
            r0.a(r1)     // Catch: java.lang.Exception -> L61
            com.kwad.components.ad.c.b r1 = r7.cD     // Catch: java.lang.Exception -> L61
            java.util.List<com.kwad.sdk.core.response.model.AdTemplate> r2 = r1.bK     // Catch: java.lang.Exception -> L61
            int r3 = r7.cO     // Catch: java.lang.Exception -> L61
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Exception -> L61
            com.kwad.sdk.core.response.model.AdTemplate r2 = (com.kwad.sdk.core.response.model.AdTemplate) r2     // Catch: java.lang.Exception -> L61
            r1.b(r2)     // Catch: java.lang.Exception -> L61
            boolean r1 = r7.cH     // Catch: java.lang.Exception -> L61
            r2 = 0
            r3 = 500(0x1f4, double:2.47E-321)
            r5 = 1
            if (r1 != 0) goto L63
            r7.cE = r0     // Catch: java.lang.Exception -> L61
            android.widget.FrameLayout r1 = r7.cG     // Catch: java.lang.Exception -> L61
            r1.addView(r0)     // Catch: java.lang.Exception -> L61
            com.kwad.components.ad.c.b.a r1 = r7.cE     // Catch: java.lang.Exception -> L61
            r1.ao()     // Catch: java.lang.Exception -> L61
            android.os.Handler r1 = r7.handler     // Catch: java.lang.Exception -> L61
            com.kwad.components.ad.c.c.c$4 r6 = new com.kwad.components.ad.c.c.c$4     // Catch: java.lang.Exception -> L61
            r6.<init>(r7)     // Catch: java.lang.Exception -> L61
            r1.postDelayed(r6, r3)     // Catch: java.lang.Exception -> L61
            r7.cH = r5     // Catch: java.lang.Exception -> L61
            goto L7b
        L61:
            r0 = move-exception
            goto Lb4
        L63:
            r7.cF = r0     // Catch: java.lang.Exception -> L61
            android.widget.FrameLayout r1 = r7.cG     // Catch: java.lang.Exception -> L61
            r1.addView(r0)     // Catch: java.lang.Exception -> L61
            com.kwad.components.ad.c.b.a r1 = r7.cF     // Catch: java.lang.Exception -> L61
            r1.ao()     // Catch: java.lang.Exception -> L61
            android.os.Handler r1 = r7.handler     // Catch: java.lang.Exception -> L61
            com.kwad.components.ad.c.c.c$5 r6 = new com.kwad.components.ad.c.c.c$5     // Catch: java.lang.Exception -> L61
            r6.<init>(r7)     // Catch: java.lang.Exception -> L61
            r1.postDelayed(r6, r3)     // Catch: java.lang.Exception -> L61
            r7.cH = r2     // Catch: java.lang.Exception -> L61
        L7b:
            int r1 = r7.cO     // Catch: java.lang.Exception -> L61
            int r1 = r1 + r5
            r7.cO = r1     // Catch: java.lang.Exception -> L61
            com.kwad.components.ad.c.b r3 = r7.cD     // Catch: java.lang.Exception -> L61
            java.util.List<com.kwad.sdk.core.response.model.AdTemplate> r3 = r3.bK     // Catch: java.lang.Exception -> L61
            int r3 = r3.size()     // Catch: java.lang.Exception -> L61
            if (r1 != r3) goto L8f
            r7.ax()     // Catch: java.lang.Exception -> L61
            r7.cO = r2     // Catch: java.lang.Exception -> L61
        L8f:
            boolean r1 = r7.cP     // Catch: java.lang.Exception -> L61
            if (r1 != 0) goto L96
            r7.cP = r5     // Catch: java.lang.Exception -> L61
            return
        L96:
            java.lang.String r1 = "translationX"
            android.widget.FrameLayout r3 = r7.cG     // Catch: java.lang.Exception -> L61
            int r3 = r3.getWidth()     // Catch: java.lang.Exception -> L61
            float r3 = (float) r3     // Catch: java.lang.Exception -> L61
            r4 = 2
            float[] r4 = new float[r4]     // Catch: java.lang.Exception -> L61
            r4[r2] = r3     // Catch: java.lang.Exception -> L61
            r2 = 0
            r4[r5] = r2     // Catch: java.lang.Exception -> L61
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r0, r1, r4)     // Catch: java.lang.Exception -> L61
            r1 = 300(0x12c, double:1.48E-321)
            r0.setDuration(r1)     // Catch: java.lang.Exception -> L61
            r0.start()     // Catch: java.lang.Exception -> L61
            return
        Lb4:
            com.kwad.components.core.d.a.reportSdkCaughtException(r0)
            com.kwad.sdk.core.d.c.printStackTraceOnly(r0)
            return
    }

    public final void ax() {
            r5 = this;
            com.kwad.sdk.api.KsScene r0 = com.kwad.components.ad.c.g.bV
            com.kwad.sdk.internal.api.SceneImpl r0 = com.kwad.sdk.internal.api.SceneImpl.covert(r0)
            r1 = 0
            r0.setBidResponse(r1)
            r0.setBidResponseV2(r1)
            com.kwad.sdk.commercial.d.d.c(r0)
            com.kwad.components.core.t.n r1 = com.kwad.components.core.t.n.tn()
            java.lang.String r2 = "loadBannerAd"
            boolean r1 = r1.b(r0, r2)
            r2 = 5
            r0.setAdStyle(r2)
            com.kwad.components.ad.KsAdLoadManager r2 = com.kwad.components.ad.KsAdLoadManager.M()
            com.kwad.components.core.request.model.a$a r3 = new com.kwad.components.core.request.model.a$a
            r3.<init>()
            com.kwad.components.core.request.model.ImpInfo r4 = new com.kwad.components.core.request.model.ImpInfo
            r4.<init>(r0)
            com.kwad.components.core.request.model.a$a r0 = r3.e(r4)
            com.kwad.components.core.request.model.a$a r0 = r0.aM(r1)
            com.kwad.components.ad.c.c.c$7 r1 = new com.kwad.components.ad.c.c.c$7
            r1.<init>(r5)
            com.kwad.components.core.request.model.a$a r0 = r0.a(r1)
            com.kwad.components.ad.c.c.c$6 r1 = new com.kwad.components.ad.c.c.c$6
            r1.<init>(r5)
            com.kwad.components.core.request.model.a$a r0 = r0.a(r1)
            com.kwad.components.core.request.model.a r0 = r0.sw()
            r2.a(r0)
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onDestroy() {
            r2 = this;
            super.onDestroy()
            android.os.Handler r0 = r2.handler
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
            return
    }
}
