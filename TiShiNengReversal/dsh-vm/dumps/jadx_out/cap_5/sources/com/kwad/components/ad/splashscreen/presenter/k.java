package com.kwad.components.ad.splashscreen.presenter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class k extends com.kwad.components.ad.splashscreen.presenter.e implements com.kwad.sdk.core.j.c {
    private boolean GB;
    private android.view.View GC;
    private android.view.View GD;
    private android.view.ViewTreeObserver.OnGlobalLayoutListener GE;
    private boolean GF;


    public k() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.GB = r0
            r1.GF = r0
            return
    }

    static /* synthetic */ android.view.View a(com.kwad.components.ad.splashscreen.presenter.k r0) {
            android.view.View r0 = r0.GC
            return r0
    }

    static /* synthetic */ boolean a(com.kwad.components.ad.splashscreen.presenter.k r0, android.view.View r1) {
            boolean r0 = v(r1)
            return r0
    }

    static /* synthetic */ boolean a(com.kwad.components.ad.splashscreen.presenter.k r0, boolean r1) {
            r1 = 1
            r0.GB = r1
            return r1
    }

    static /* synthetic */ android.view.View b(com.kwad.components.ad.splashscreen.presenter.k r0) {
            android.view.View r0 = r0.GD
            return r0
    }

    static /* synthetic */ boolean c(com.kwad.components.ad.splashscreen.presenter.k r0) {
            boolean r0 = r0.GB
            return r0
    }

    static /* synthetic */ boolean d(com.kwad.components.ad.splashscreen.presenter.k r0) {
            boolean r0 = r0.GF
            return r0
    }

    private static boolean v(android.view.View r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            com.kwad.sdk.core.c.b.Ho()
            boolean r1 = com.kwad.sdk.core.c.b.isEnable()
            r2 = 70
            r3 = 1
            if (r1 == 0) goto L21
            com.kwad.sdk.core.c.b.Ho()
            boolean r1 = com.kwad.sdk.core.c.b.isAppOnForeground()
            if (r1 == 0) goto L20
            boolean r4 = com.kwad.sdk.utils.bz.a(r4, r2, r3)
            if (r4 == 0) goto L20
            return r3
        L20:
            return r0
        L21:
            boolean r4 = com.kwad.sdk.utils.bz.a(r4, r2, r3)
            return r4
    }

    @Override // com.kwad.components.ad.splashscreen.presenter.e, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r5 = this;
            super.at()
            com.kwad.components.ad.splashscreen.h r0 = r5.Gf
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            long r1 = android.os.SystemClock.elapsedRealtime()
            r0.addStartTime = r1
            com.kwad.components.ad.splashscreen.h r0 = r5.Gf
            com.kwad.sdk.core.j.a r0 = r0.Fs
            r0.a(r5)
            com.kwad.components.ad.splashscreen.monitor.b.lZ()
            com.kwad.components.ad.splashscreen.h r0 = r5.Gf
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            long r1 = android.os.SystemClock.elapsedRealtime()
            com.kwad.components.ad.splashscreen.h r3 = r5.Gf
            com.kwad.sdk.core.response.model.AdTemplate r3 = r3.mAdTemplate
            long r3 = r3.showStartTime
            long r1 = r1 - r3
            com.kwad.components.ad.splashscreen.monitor.b.f(r0, r1)
            com.kwad.components.ad.splashscreen.monitor.b.lZ()
            com.kwad.components.ad.splashscreen.h r0 = r5.Gf
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.components.ad.splashscreen.monitor.b.ap(r0)
            com.kwad.components.ad.splashscreen.h r0 = r5.Gf
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            boolean r0 = com.kwad.sdk.core.response.b.a.cF(r0)
            if (r0 == 0) goto L4a
            com.kwad.components.ad.splashscreen.h r0 = r5.Gf
            android.content.Context r1 = r5.getContext()
            r0.U(r1)
        L4a:
            android.view.View r0 = r5.getRootView()     // Catch: java.lang.Exception -> L8f
            r5.GD = r0     // Catch: java.lang.Exception -> L8f
            com.kwad.components.ad.splashscreen.presenter.k$1 r0 = new com.kwad.components.ad.splashscreen.presenter.k$1     // Catch: java.lang.Exception -> L8f
            r0.<init>(r5)     // Catch: java.lang.Exception -> L8f
            r5.GE = r0     // Catch: java.lang.Exception -> L8f
            android.view.View r0 = r5.GD     // Catch: java.lang.Exception -> L8f
            if (r0 == 0) goto L92
            android.view.View r0 = r5.getRootView()     // Catch: java.lang.Exception -> L8f
            android.view.ViewParent r0 = r0.getParent()     // Catch: java.lang.Exception -> L8f
            if (r0 == 0) goto L92
            android.view.View r0 = r5.getRootView()     // Catch: java.lang.Exception -> L8f
            android.view.ViewParent r0 = r0.getParent()     // Catch: java.lang.Exception -> L8f
            boolean r0 = r0 instanceof android.view.View     // Catch: java.lang.Exception -> L8f
            if (r0 == 0) goto L92
            android.view.View r0 = r5.getRootView()     // Catch: java.lang.Exception -> L8f
            android.view.ViewParent r0 = r0.getParent()     // Catch: java.lang.Exception -> L8f
            android.view.View r0 = (android.view.View) r0     // Catch: java.lang.Exception -> L8f
            r5.GC = r0     // Catch: java.lang.Exception -> L8f
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()     // Catch: java.lang.Exception -> L8f
            if (r0 == 0) goto L91
            android.view.View r0 = r5.GC     // Catch: java.lang.Exception -> L8f
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()     // Catch: java.lang.Exception -> L8f
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = r5.GE     // Catch: java.lang.Exception -> L8f
            r0.addOnGlobalLayoutListener(r1)     // Catch: java.lang.Exception -> L8f
            return
        L8f:
            r0 = move-exception
            goto Lac
        L91:
            return
        L92:
            android.view.View r0 = r5.GD     // Catch: java.lang.Exception -> L8f
            if (r0 != 0) goto La1
            com.kwad.components.ad.splashscreen.monitor.b.lZ()     // Catch: java.lang.Exception -> L8f
            com.kwad.components.ad.splashscreen.h r0 = r5.Gf     // Catch: java.lang.Exception -> L8f
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate     // Catch: java.lang.Exception -> L8f
            com.kwad.components.ad.splashscreen.monitor.b.an(r0)     // Catch: java.lang.Exception -> L8f
            return
        La1:
            com.kwad.components.ad.splashscreen.monitor.b.lZ()     // Catch: java.lang.Exception -> L8f
            com.kwad.components.ad.splashscreen.h r0 = r5.Gf     // Catch: java.lang.Exception -> L8f
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate     // Catch: java.lang.Exception -> L8f
            com.kwad.components.ad.splashscreen.monitor.b.ao(r0)     // Catch: java.lang.Exception -> L8f
            return
        Lac:
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r0)
            return
    }

    @Override // com.kwad.sdk.core.j.c
    public final void bt() {
            r2 = this;
            com.kwad.components.ad.splashscreen.h r0 = r2.Gf
            android.content.Context r1 = r2.getContext()
            r0.U(r1)
            return
    }

    @Override // com.kwad.sdk.core.j.c
    public final void bu() {
            r0 = this;
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
            r0 = 1
            r2.GF = r0
            com.kwad.components.ad.splashscreen.h r0 = r2.Gf
            com.kwad.sdk.core.j.a r0 = r0.Fs
            r0.b(r2)
            android.view.View r0 = r2.GC
            if (r0 == 0) goto L26
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            if (r0 == 0) goto L26
            android.view.ViewTreeObserver$OnGlobalLayoutListener r0 = r2.GE
            if (r0 == 0) goto L26
            android.view.View r0 = r2.GC
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = r2.GE
            r0.removeOnGlobalLayoutListener(r1)
        L26:
            r0 = 0
            r2.GC = r0
            return
    }
}
