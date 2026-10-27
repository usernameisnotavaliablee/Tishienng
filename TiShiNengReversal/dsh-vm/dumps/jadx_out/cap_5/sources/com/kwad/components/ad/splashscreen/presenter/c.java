package com.kwad.components.ad.splashscreen.presenter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c extends com.kwad.components.ad.splashscreen.presenter.e implements com.kwad.sdk.core.j.c {
    private android.widget.TextView FX;
    private com.kwad.components.ad.splashscreen.widget.b FY;
    private com.kwad.sdk.core.response.model.AdInfo.AdPreloadInfo FZ;
    private boolean Ga;
    private android.view.View Gb;
    private com.kwad.sdk.core.response.model.AdInfo vz;






    public c() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.Ga = r0
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.splashscreen.presenter.c r0) {
            r0.mb()
            return
    }

    static /* synthetic */ com.kwad.components.ad.splashscreen.widget.b b(com.kwad.components.ad.splashscreen.presenter.c r0) {
            com.kwad.components.ad.splashscreen.widget.b r0 = r0.FY
            return r0
    }

    static /* synthetic */ android.view.View c(com.kwad.components.ad.splashscreen.presenter.c r0) {
            android.view.View r0 = r0.Gb
            return r0
    }

    private com.kwad.components.ad.splashscreen.local.SplashSkipViewModel ma() {
            r4 = this;
            com.kwad.components.ad.splashscreen.local.SplashSkipViewModel r0 = new com.kwad.components.ad.splashscreen.local.SplashSkipViewModel
            r0.<init>()
            com.kwad.sdk.core.response.model.AdInfo r1 = r4.vz
            com.kwad.sdk.core.response.model.AdInfo$AdSplashInfo r2 = r1.adSplashInfo
            int r3 = r2.imageDisplaySecond
            if (r3 > 0) goto Le
            r3 = 5
        Le:
            int r2 = r2.videoDisplaySecond
            int r1 = com.kwad.sdk.core.response.b.a.L(r1)
            int r1 = java.lang.Math.min(r2, r1)
            com.kwad.sdk.core.response.model.AdInfo r2 = r4.vz
            boolean r2 = com.kwad.sdk.core.response.b.a.bc(r2)
            if (r2 == 0) goto L21
            r3 = r1
        L21:
            r0.skipSecond = r3
            return r0
    }

    private void mb() {
            r5 = this;
            com.kwad.components.ad.splashscreen.monitor.a r0 = com.kwad.components.ad.splashscreen.monitor.a.lX()
            com.kwad.components.ad.splashscreen.h r1 = r5.Gf
            com.kwad.sdk.core.response.model.AdTemplate r1 = r1.mAdTemplate
            r0.ah(r1)
            com.kwad.components.ad.splashscreen.h r0 = r5.Gf
            r0.lS()
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            com.kwad.components.ad.splashscreen.h r1 = r5.Gf
            com.kwad.components.ad.splashscreen.d.a r1 = r1.Fq
            if (r1 == 0) goto L29
            java.lang.String r2 = "duration"
            long r3 = r1.getCurrentPosition()     // Catch: org.json.JSONException -> L25
            r0.put(r2, r3)     // Catch: org.json.JSONException -> L25
            goto L29
        L25:
            r1 = move-exception
            com.kwad.sdk.core.d.c.printStackTrace(r1)
        L29:
            com.kwad.sdk.core.adlog.a$a r1 = new com.kwad.sdk.core.adlog.a$a
            r1.<init>()
            com.kwad.components.ad.splashscreen.h r2 = r5.Gf
            com.kwad.sdk.utils.bv r2 = r2.mTimerHelper
            if (r2 == 0) goto L3a
            long r2 = r2.getTime()
            r1.duration = r2
        L3a:
            com.kwad.sdk.core.adlog.c.b r2 = new com.kwad.sdk.core.adlog.c.b
            r2.<init>()
            r3 = 1
            com.kwad.sdk.core.adlog.c.b r2 = r2.de(r3)
            r3 = 22
            com.kwad.sdk.core.adlog.c.b r2 = r2.dm(r3)
            com.kwad.sdk.core.adlog.c.b r1 = r2.b(r1)
            com.kwad.components.ad.splashscreen.h r2 = r5.Gf
            com.kwad.sdk.core.response.model.AdTemplate r2 = r2.mAdTemplate
            com.kwad.sdk.core.adlog.c.b(r2, r1, r0)
            return
    }

    private synchronized void md() {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.Ga     // Catch: java.lang.Throwable -> L2a
            if (r0 != 0) goto L2e
            com.kwad.components.ad.splashscreen.widget.b r0 = r3.FY     // Catch: java.lang.Throwable -> L2a
            if (r0 != 0) goto La
            goto L2e
        La:
            com.kwad.sdk.core.response.model.AdInfo r0 = r3.vz     // Catch: java.lang.Throwable -> L2a
            boolean r0 = com.kwad.sdk.core.response.b.a.cD(r0)     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L2c
            com.kwad.sdk.core.response.model.AdInfo r0 = r3.vz     // Catch: java.lang.Throwable -> L2a
            boolean r0 = com.kwad.sdk.core.response.b.a.cE(r0)     // Catch: java.lang.Throwable -> L2a
            if (r0 != 0) goto L1b
            goto L2c
        L1b:
            com.kwad.components.ad.splashscreen.h r0 = r3.Gf     // Catch: java.lang.Throwable -> L2a
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate     // Catch: java.lang.Throwable -> L2a
            r1 = 124(0x7c, float:1.74E-43)
            r2 = 0
            com.kwad.sdk.core.adlog.c.b(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
            r0 = 1
            r3.Ga = r0     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r3)
            return
        L2a:
            r0 = move-exception
            goto L30
        L2c:
            monitor-exit(r3)
            return
        L2e:
            monitor-exit(r3)
            return
        L30:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2a
            throw r0
    }

    private void t(com.kwad.sdk.core.response.model.AdInfo r2) {
            r1 = this;
            boolean r2 = com.kwad.components.ad.splashscreen.e.c.z(r2)
            if (r2 == 0) goto L9
            int r2 = com.kwad.sdk.R.id.ksad_splash_right_top_root
            goto Lb
        L9:
            int r2 = com.kwad.sdk.R.id.ksad_splash_left_top_root
        Lb:
            android.view.View r2 = r1.findViewById(r2)
            r0 = 0
            r2.setVisibility(r0)
            return
    }

    private static boolean u(com.kwad.sdk.core.response.model.AdInfo r0) {
            boolean r0 = com.kwad.sdk.core.response.b.a.cB(r0)
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    private void v(com.kwad.sdk.core.response.model.AdInfo r2) {
            r1 = this;
            boolean r0 = com.kwad.components.ad.splashscreen.e.c.z(r2)
            if (r0 == 0) goto L9
            int r0 = com.kwad.sdk.R.id.ksad_splash_preload_right_tips
            goto Lb
        L9:
            int r0 = com.kwad.sdk.R.id.ksad_splash_preload_left_tips
        Lb:
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.FX = r0
            com.kwad.sdk.core.response.model.AdInfo$AdPreloadInfo r2 = r2.adPreloadInfo
            r1.FZ = r2
            if (r2 == 0) goto L31
            java.lang.String r2 = r2.preloadTips
            boolean r2 = com.kwad.sdk.utils.bp.isNullString(r2)
            if (r2 != 0) goto L31
            android.widget.TextView r2 = r1.FX
            r0 = 0
            r2.setVisibility(r0)
            android.widget.TextView r2 = r1.FX
            com.kwad.sdk.core.response.model.AdInfo$AdPreloadInfo r0 = r1.FZ
            java.lang.String r0 = r0.preloadTips
            r2.setText(r0)
            return
        L31:
            android.widget.TextView r2 = r1.FX
            r0 = 8
            r2.setVisibility(r0)
            return
    }

    private void w(com.kwad.sdk.core.response.model.AdInfo r2) {
            r1 = this;
            int r0 = com.kwad.sdk.R.id.ksad_skip_view_area
            android.view.View r0 = r1.findViewById(r0)
            r1.Gb = r0
            boolean r0 = com.kwad.sdk.core.response.b.a.cC(r2)
            if (r0 == 0) goto L2f
            com.kwad.sdk.core.response.model.AdInfo$AdSplashInfo r2 = r2.adSplashInfo
            int r2 = r2.skipButtonPosition
            if (r2 != 0) goto L2f
            android.view.View r2 = r1.Gb
            r0 = 0
            r2.setVisibility(r0)
            android.view.View r2 = r1.Gb
            com.kwad.components.ad.splashscreen.presenter.c$2 r0 = new com.kwad.components.ad.splashscreen.presenter.c$2
            r0.<init>(r1)
            r2.setOnClickListener(r0)
            android.view.View r2 = r1.Gb
            com.kwad.components.ad.splashscreen.presenter.c$3 r0 = new com.kwad.components.ad.splashscreen.presenter.c$3
            r0.<init>(r1)
            r2.post(r0)
            return
        L2f:
            android.view.View r2 = r1.Gb
            r0 = 8
            r2.setVisibility(r0)
            return
    }

    @Override // com.kwad.components.ad.splashscreen.presenter.e, com.kwad.sdk.mvp.Presenter
    @android.annotation.SuppressLint({"SetTextI18n"})
    public final void at() {
            r3 = this;
            super.at()
            java.lang.String r0 = "SkipAdPresenter"
            java.lang.String r1 = "onBind"
            com.kwad.sdk.core.d.c.d(r0, r1)
            com.kwad.components.ad.splashscreen.h r0 = r3.Gf
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            r3.vz = r0
            r3.t(r0)
            com.kwad.sdk.core.response.model.AdInfo r0 = r3.vz
            r3.v(r0)
            com.kwad.sdk.core.response.model.AdInfo r0 = r3.vz
            boolean r0 = u(r0)
            if (r0 == 0) goto L3a
            com.kwad.sdk.core.response.model.AdInfo r0 = r3.vz
            boolean r0 = com.kwad.components.ad.splashscreen.e.c.z(r0)
            if (r0 == 0) goto L2f
            int r0 = com.kwad.sdk.R.id.ksad_splash_skip_right_view
            goto L31
        L2f:
            int r0 = com.kwad.sdk.R.id.ksad_splash_skip_left_view
        L31:
            android.view.View r0 = r3.findViewById(r0)
            com.kwad.components.ad.splashscreen.widget.b r0 = (com.kwad.components.ad.splashscreen.widget.b) r0
            r3.FY = r0
            goto L4f
        L3a:
            com.kwad.sdk.core.response.model.AdInfo r0 = r3.vz
            boolean r0 = com.kwad.components.ad.splashscreen.e.c.z(r0)
            if (r0 == 0) goto L45
            int r0 = com.kwad.sdk.R.id.ksad_splash_circle_skip_right_view
            goto L47
        L45:
            int r0 = com.kwad.sdk.R.id.ksad_splash_circle_skip_left_view
        L47:
            android.view.View r0 = r3.findViewById(r0)
            com.kwad.components.ad.splashscreen.widget.b r0 = (com.kwad.components.ad.splashscreen.widget.b) r0
            r3.FY = r0
        L4f:
            com.kwad.components.ad.splashscreen.widget.b r0 = r3.FY
            com.kwad.components.ad.splashscreen.local.SplashSkipViewModel r1 = r3.ma()
            com.kwad.sdk.core.response.model.AdInfo r2 = r3.vz
            r0.a(r1, r2)
            com.kwad.components.ad.splashscreen.widget.b r0 = r3.FY
            com.kwad.components.ad.splashscreen.presenter.c$1 r1 = new com.kwad.components.ad.splashscreen.presenter.c$1
            r1.<init>(r3)
            r0.setOnViewListener(r1)
            com.kwad.sdk.core.response.model.AdInfo r0 = r3.vz
            r3.w(r0)
            com.kwad.components.ad.splashscreen.h r0 = r3.Gf
            com.kwad.sdk.core.j.a r0 = r0.Fs
            r0.a(r3)
            return
    }

    @Override // com.kwad.sdk.core.j.c
    public final void bt() {
            r2 = this;
            java.lang.String r0 = "SkipAdPresenter"
            java.lang.String r1 = "onPageVisible"
            com.kwad.sdk.core.d.c.d(r0, r1)
            com.kwad.components.ad.splashscreen.widget.b r0 = r2.FY
            com.kwad.sdk.core.response.model.AdInfo r1 = r2.vz
            r0.B(r1)
            r2.md()
            return
    }

    @Override // com.kwad.sdk.core.j.c
    public final void bu() {
            r2 = this;
            java.lang.String r0 = "SkipAdPresenter"
            java.lang.String r1 = "onPageInvisible"
            com.kwad.sdk.core.d.c.d(r0, r1)
            com.kwad.components.ad.splashscreen.widget.b r0 = r2.FY
            com.kwad.sdk.core.response.model.AdInfo r1 = r2.vz
            r0.A(r1)
            return
    }

    public final void mc() {
            r2 = this;
            com.kwad.components.ad.splashscreen.h r0 = r2.Gf
            com.kwad.sdk.core.view.AdBaseFrameLayout r0 = r0.mRootContainer
            com.kwad.components.ad.splashscreen.presenter.c$5 r1 = new com.kwad.components.ad.splashscreen.presenter.c$5
            r1.<init>(r2)
            r0.post(r1)
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r1 = this;
            super.onUnbind()
            com.kwad.components.ad.splashscreen.h r0 = r1.Gf
            com.kwad.sdk.core.j.a r0 = r0.Fs
            r0.b(r1)
            com.kwad.components.ad.splashscreen.presenter.c$4 r0 = new com.kwad.components.ad.splashscreen.presenter.c$4
            r0.<init>(r1)
            com.kwad.sdk.utils.bw.postOnUiThread(r0)
            return
    }
}
