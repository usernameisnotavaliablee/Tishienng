package com.kwad.components.ad.splashscreen;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class h extends com.kwad.sdk.mvp.a {
    public int FA;
    public int FB;
    public long FC;
    public long FD;
    public long FE;
    public long FF;
    public long FG;
    public long FH;
    public long FI;
    private com.kwad.sdk.api.KsSplashScreenAd.SplashScreenAdInteractionListener Fe;

    @androidx.annotation.Nullable
    public com.kwad.components.ad.splashscreen.d.a Fq;
    public com.kwad.components.offline.api.tk.model.StyleTemplate Fr;
    public com.kwad.sdk.core.j.a Fs;
    private java.util.List<com.kwad.components.ad.splashscreen.g> Ft;
    private java.util.List<com.kwad.components.ad.splashscreen.f> Fu;
    public boolean Fv;
    private boolean Fw;
    public boolean Fx;
    public boolean Fy;
    public long Fz;
    public boolean bO;
    public boolean isWebTimeout;
    public com.kwad.sdk.core.response.model.AdResultData mAdResultData;

    @androidx.annotation.NonNull
    public com.kwad.sdk.internal.api.SceneImpl mAdScene;
    public com.kwad.components.core.e.d.c mApkDownloadHelper;

    @androidx.annotation.NonNull
    public com.kwad.sdk.core.view.AdBaseFrameLayout mRootContainer;
    public com.kwad.sdk.utils.bv mTimerHelper;

    @androidx.annotation.NonNull
    public com.kwad.sdk.api.KsVideoPlayConfig mVideoPlayConfig;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void b(@androidx.annotation.NonNull com.kwad.sdk.core.adlog.c.b r1);
    }

    public h() {
            r3 = this;
            r3.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r3.Ft = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r3.Fu = r0
            r0 = 0
            r3.Fv = r0
            r3.Fw = r0
            r3.Fx = r0
            r3.Fy = r0
            r3.bO = r0
            long r1 = android.os.SystemClock.elapsedRealtime()
            r3.Fz = r1
            r3.isWebTimeout = r0
            return
    }

    public static boolean ac(com.kwad.sdk.core.response.model.AdTemplate r2) {
            boolean r0 = com.kwad.sdk.core.config.e.Fq()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            com.kwad.sdk.core.response.model.AdMatrixInfo$SplashPlayCardTKInfo r2 = com.kwad.sdk.core.response.b.b.dv(r2)
            if (r2 == 0) goto L1c
            java.lang.String r0 = r2.templateId
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1c
            int r2 = r2.renderType
            r0 = 1
            if (r2 != r0) goto L1c
            return r0
        L1c:
            return r1
    }

    static /* synthetic */ com.kwad.sdk.api.KsSplashScreenAd.SplashScreenAdInteractionListener b(com.kwad.components.ad.splashscreen.h r0) {
            com.kwad.sdk.api.KsSplashScreenAd$SplashScreenAdInteractionListener r0 = r0.Fe
            return r0
    }

    private void lT() {
            r2 = this;
            r2.lU()
            java.util.List<com.kwad.components.ad.splashscreen.g> r0 = r2.Ft
            java.util.Iterator r0 = r0.iterator()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            com.kwad.components.ad.splashscreen.g r1 = (com.kwad.components.ad.splashscreen.g) r1
            r1.lG()
            goto L9
        L19:
            return
    }

    private void lU() {
            r4 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r4.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r1 = new com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo
            r1.<init>()
            com.kwad.sdk.core.response.model.AdTemplate r2 = r4.mAdTemplate
            int r2 = r2.splashAdLoadType
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r1 = r1.setLoadType(r2)
            r2 = 8
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r1 = r1.setStatus(r2)
            com.kwad.components.core.webview.tachikoma.e.a r2 = com.kwad.components.core.webview.tachikoma.e.a.vI()
            java.util.List r2 = r2.vJ()
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r1 = r1.setElementTypes(r2)
            com.kwad.sdk.utils.bv r2 = r4.mTimerHelper
            if (r2 == 0) goto L2e
            long r2 = r2.getTime()
            goto L30
        L2e:
            r2 = -1
        L30:
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r1 = r1.setShowEndTime(r2)
            boolean r2 = r4.bO
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r1 = r1.setRotateComposeTimeout(r2)
            com.kwad.sdk.core.response.model.AdTemplate r2 = r4.mAdTemplate
            boolean r2 = ac(r2)
            if (r2 == 0) goto L49
            com.kwad.sdk.core.response.model.AdTemplate r2 = r4.mAdTemplate
            long r2 = com.kwad.sdk.core.response.b.b.dw(r2)
            goto L53
        L49:
            com.kwad.sdk.core.response.model.AdTemplate r2 = r4.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r2 = com.kwad.sdk.core.response.b.e.el(r2)
            long r2 = com.kwad.sdk.core.response.b.b.dG(r2)
        L53:
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r1 = r1.setTkDefaultTimeout(r2)
            int r2 = r4.FA
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r1 = r1.setSoSource(r2)
            long r2 = r4.FC
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r1 = r1.setSoLoadTime(r2)
            int r2 = r4.FB
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r1 = r1.setOfflineSource(r2)
            long r2 = r4.FD
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r1 = r1.setOfflineLoadTime(r2)
            long r2 = r4.FE
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r1 = r1.setTkFileLoadTime(r2)
            long r2 = r4.FF
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r1 = r1.setTkInitTime(r2)
            long r2 = r4.FG
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r1 = r1.setTkRenderTime(r2)
            long r2 = r4.FH
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r1 = r1.setNativeLoadTime(r2)
            boolean r2 = r4.isWebTimeout
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r1 = r1.setWebTimeout(r2)
            long r2 = r4.FI
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r1 = r1.setWebLoadTime(r2)
            int r2 = com.kwad.sdk.core.response.b.b.dN(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r1 = r1.setInteractiveStyle(r2)
            int r2 = com.kwad.sdk.core.response.b.b.dO(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r1 = r1.setInteractivityDefaultStyle(r2)
            long r2 = com.kwad.sdk.core.response.b.a.J(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = r1.setCreativeId(r2)
            com.kwad.sdk.core.response.model.AdTemplate r1 = r4.mAdTemplate
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = r0.setAdTemplate(r1)
            com.kwad.sdk.commercial.b.m(r0)
            com.kwad.components.core.webview.tachikoma.e.a r0 = com.kwad.components.core.webview.tachikoma.e.a.vI()
            r0.vK()
            return
    }

    private void lV() {
            r2 = this;
            java.util.List<com.kwad.components.ad.splashscreen.f> r0 = r2.Fu
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.kwad.components.ad.splashscreen.f r1 = (com.kwad.components.ad.splashscreen.f) r1
            r1.lC()
            goto L6
        L16:
            return
    }

    public static boolean n(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdInfo r1) {
            com.kwad.sdk.core.response.model.AdInfo$AdSplashInfo r1 = r1.adSplashInfo
            int r1 = r1.fullScreenClickSwitch
            r0 = 1
            if (r1 != r0) goto L8
            return r0
        L8:
            r1 = 0
            return r1
    }

    public static boolean r(com.kwad.sdk.core.response.model.AdInfo r1) {
            boolean r0 = com.kwad.sdk.core.response.b.b.dy(r1)
            if (r0 == 0) goto Le
            boolean r1 = com.kwad.sdk.core.response.b.a.bd(r1)
            if (r1 == 0) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    public final void U(android.content.Context r3) {
            r2 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            boolean r0 = r0.mPvReported
            if (r0 != 0) goto L22
            com.kwad.components.ad.splashscreen.local.a.V(r3)
            boolean r3 = com.kwad.sdk.core.config.e.Go()
            if (r3 != 0) goto L19
            com.kwad.components.core.t.b r3 = com.kwad.components.core.t.b.sY()
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            r1 = 0
            r3.a(r0, r1, r1)
        L19:
            com.kwad.sdk.core.response.model.AdTemplate r3 = r2.mAdTemplate
            com.kwad.sdk.commercial.d.c.bL(r3)
            r3 = 1
            r2.af(r3)
        L22:
            return
    }

    @androidx.annotation.MainThread
    public final void X() {
            r2 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            r1 = 1
            r0.converted = r1
            com.kwad.components.ad.splashscreen.monitor.a r0 = com.kwad.components.ad.splashscreen.monitor.a.lX()
            com.kwad.sdk.core.response.model.AdTemplate r1 = r2.mAdTemplate
            r0.ag(r1)
            com.kwad.sdk.api.KsSplashScreenAd$SplashScreenAdInteractionListener r0 = r2.Fe
            if (r0 == 0) goto L15
            r0.onAdClicked()
        L15:
            com.kwad.components.ad.splashscreen.monitor.a r0 = com.kwad.components.ad.splashscreen.monitor.a.lX()
            com.kwad.sdk.core.response.model.AdTemplate r1 = r2.mAdTemplate
            r0.ae(r1)
            return
    }

    public final void a(int r2, android.content.Context r3, int r4, int r5, com.kwad.components.ad.splashscreen.h.a r6) {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            com.kwad.sdk.core.response.b.e.el(r0)
            com.kwad.components.core.e.d.a$a r0 = new com.kwad.components.core.e.d.a$a
            r0.<init>(r3)
            com.kwad.sdk.core.response.model.AdTemplate r3 = r1.mAdTemplate
            com.kwad.components.core.e.d.a$a r3 = r0.aB(r3)
            com.kwad.components.core.e.d.c r0 = r1.mApkDownloadHelper
            com.kwad.components.core.e.d.a$a r3 = r3.b(r0)
            com.kwad.components.core.e.d.a$a r3 = r3.aB(r5)
            r0 = 1
            if (r5 != r0) goto L1e
            goto L1f
        L1e:
            r0 = 0
        L1f:
            com.kwad.components.core.e.d.a$a r3 = r3.aq(r0)
            com.kwad.components.core.e.d.a$a r3 = r3.aA(r4)
            com.kwad.components.core.e.d.a$a r3 = r3.az(r2)
            com.kwad.components.ad.splashscreen.h$1 r5 = new com.kwad.components.ad.splashscreen.h$1
            r5.<init>(r1, r4, r2, r6)
            com.kwad.components.core.e.d.a$a r2 = r3.a(r5)
            com.kwad.components.core.e.d.a.a(r2)
            return
    }

    public final void a(com.kwad.components.ad.splashscreen.f r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            java.util.List<com.kwad.components.ad.splashscreen.f> r0 = r1.Fu
            r0.add(r2)
            return
    }

    public final void a(com.kwad.components.ad.splashscreen.g r2) {
            r1 = this;
            java.util.List<com.kwad.components.ad.splashscreen.g> r0 = r1.Ft
            r0.add(r2)
            return
    }

    public final void a(com.kwad.sdk.core.response.model.AdResultData r1) {
            r0 = this;
            r0.mAdResultData = r1
            com.kwad.sdk.core.response.model.AdTemplate r1 = com.kwad.sdk.core.response.b.c.r(r1)
            r0.mAdTemplate = r1
            return
    }

    @androidx.annotation.MainThread
    public final void af(boolean r11) {
            r10 = this;
            boolean r0 = r10.Fw
            if (r0 == 0) goto L5
            goto L59
        L5:
            r0 = 1
            r10.Fw = r0
            com.kwad.sdk.api.KsSplashScreenAd$SplashScreenAdInteractionListener r1 = r10.Fe
            if (r1 == 0) goto Lf
            r1.onAdShowStart()
        Lf:
            if (r11 == 0) goto L21
            boolean r11 = com.kwad.sdk.core.config.e.Go()
            if (r11 == 0) goto L21
            com.kwad.components.core.t.b r11 = com.kwad.components.core.t.b.sY()
            com.kwad.sdk.core.response.model.AdTemplate r1 = r10.mAdTemplate
            r2 = 0
            r11.a(r1, r2, r2)
        L21:
            long r1 = android.os.SystemClock.elapsedRealtime()
            com.kwad.sdk.core.response.model.AdTemplate r11 = r10.mAdTemplate
            r11.showTime = r1
            com.kwad.components.ad.splashscreen.monitor.b.lZ()
            com.kwad.sdk.core.response.model.AdTemplate r3 = r10.mAdTemplate
            long r4 = r3.showStartTime
            long r4 = r1 - r4
            long r6 = r3.addStartTime
            long r6 = r1 - r6
            long r8 = r3.requestStartTime
            long r8 = r1 - r8
            com.kwad.components.ad.splashscreen.monitor.b.a(r3, r4, r6, r8)
            com.kwad.sdk.core.response.model.AdTemplate r11 = r10.mAdTemplate
            com.kwad.components.ad.splashscreen.monitor.c.aq(r11)
            com.kwad.components.ad.splashscreen.monitor.a r11 = com.kwad.components.ad.splashscreen.monitor.a.lX()
            com.kwad.sdk.core.response.model.AdTemplate r1 = r10.mAdTemplate
            r11.v(r1)
            com.kwad.sdk.a.a.c r11 = com.kwad.sdk.a.a.c.CU()
            r11.bm(r0)
            com.kwad.sdk.utils.bv r11 = r10.mTimerHelper
            if (r11 == 0) goto L59
            r11.startTiming()
        L59:
            return
    }

    public final void al(int r3) {
            r2 = this;
            java.util.List<com.kwad.components.ad.splashscreen.g> r0 = r2.Ft
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.kwad.components.ad.splashscreen.g r1 = (com.kwad.components.ad.splashscreen.g) r1
            r1.ak(r3)
            goto L6
        L16:
            return
    }

    public final void b(com.kwad.components.ad.splashscreen.f r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            java.util.List<com.kwad.components.ad.splashscreen.f> r0 = r1.Fu
            r0.remove(r2)
            return
    }

    public final void b(com.kwad.components.ad.splashscreen.g r2) {
            r1 = this;
            java.util.List<com.kwad.components.ad.splashscreen.g> r0 = r1.Ft
            r0.remove(r2)
            return
    }

    public final void c(int r7, android.content.Context r8, int r9, int r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.a(r1, r2, r3, r4, r5)
            return
    }

    @androidx.annotation.MainThread
    public final void c(int r2, java.lang.String r3) {
            r1 = this;
            com.kwad.sdk.api.KsSplashScreenAd$SplashScreenAdInteractionListener r0 = r1.Fe
            if (r0 == 0) goto L7
            r0.onAdShowError(r2, r3)
        L7:
            com.kwad.components.ad.splashscreen.monitor.b.lZ()
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            java.lang.String r3 = java.lang.String.valueOf(r3)
            com.kwad.components.ad.splashscreen.monitor.b.e(r0, r2, r3)
            r1.lT()
            return
    }

    @androidx.annotation.MainThread
    public final void lH() {
            r2 = this;
            com.kwad.components.ad.splashscreen.monitor.a r0 = com.kwad.components.ad.splashscreen.monitor.a.lX()
            com.kwad.sdk.core.response.model.AdTemplate r1 = r2.mAdTemplate
            r0.ah(r1)
            com.kwad.sdk.api.KsSplashScreenAd$SplashScreenAdInteractionListener r0 = r2.Fe
            if (r0 == 0) goto L10
            r0.onAdShowEnd()
        L10:
            com.kwad.components.ad.splashscreen.monitor.a r0 = com.kwad.components.ad.splashscreen.monitor.a.lX()
            com.kwad.sdk.core.response.model.AdTemplate r1 = r2.mAdTemplate
            r0.w(r1)
            return
    }

    public final void lI() {
            r3 = this;
            com.kwad.sdk.api.KsSplashScreenAd$SplashScreenAdInteractionListener r0 = r3.Fe
            if (r0 == 0) goto La
            r1 = 0
            java.lang.String r2 = "onMediaPlayError"
            r0.onAdShowError(r1, r2)
        La:
            return
    }

    public final void lJ() {
            r1 = this;
            com.kwad.sdk.api.KsSplashScreenAd$SplashScreenAdInteractionListener r0 = r1.Fe
            if (r0 == 0) goto L7
            r0.onAdShowStart()
        L7:
            return
    }

    public final void lK() {
            r1 = this;
            com.kwad.sdk.api.KsSplashScreenAd$SplashScreenAdInteractionListener r0 = r1.Fe
            if (r0 == 0) goto L7
            r0.onAdShowEnd()
        L7:
            return
    }

    public final void lL() {
            r1 = this;
            com.kwad.sdk.api.KsSplashScreenAd$SplashScreenAdInteractionListener r0 = r1.Fe
            if (r0 == 0) goto L7
            r0.onSkippedAd()
        L7:
            return
    }

    public final void lM() {
            r1 = this;
            com.kwad.sdk.api.KsSplashScreenAd$SplashScreenAdInteractionListener r0 = r1.Fe
            if (r0 == 0) goto L7
            r0.onAdClicked()
        L7:
            return
    }

    public final void lN() {
            r1 = this;
            com.kwad.sdk.api.KsSplashScreenAd$SplashScreenAdInteractionListener r0 = r1.Fe
            if (r0 == 0) goto Lc
            r0.onDownloadTipsDialogShow()     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r0 = move-exception
            com.kwad.sdk.core.d.c.printStackTraceOnly(r0)
        Lc:
            return
    }

    public final void lO() {
            r1 = this;
            com.kwad.sdk.api.KsSplashScreenAd$SplashScreenAdInteractionListener r0 = r1.Fe
            if (r0 == 0) goto Lc
            r0.onDownloadTipsDialogCancel()     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r0 = move-exception
            com.kwad.sdk.core.d.c.printStackTraceOnly(r0)
        Lc:
            return
    }

    public final void lP() {
            r1 = this;
            com.kwad.sdk.api.KsSplashScreenAd$SplashScreenAdInteractionListener r0 = r1.Fe
            if (r0 == 0) goto Lc
            r0.onDownloadTipsDialogDismiss()     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r0 = move-exception
            com.kwad.sdk.core.d.c.printStackTraceOnly(r0)
        Lc:
            return
    }

    @androidx.annotation.MainThread
    public final void lQ() {
            r3 = this;
            boolean r0 = r3.Fv
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r3.Fv = r0
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            boolean r0 = r(r0)
            if (r0 == 0) goto L1f
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            boolean r0 = r0.converted
            if (r0 == 0) goto L1b
            goto L1f
        L1b:
            r3.lV()
            goto L62
        L1f:
            com.kwad.sdk.core.adlog.a$a r0 = new com.kwad.sdk.core.adlog.a$a
            r0.<init>()
            com.kwad.sdk.utils.bv r1 = r3.mTimerHelper
            if (r1 == 0) goto L2e
            long r1 = r1.getTime()
            r0.duration = r1
        L2e:
            com.kwad.sdk.core.adlog.c.b r1 = new com.kwad.sdk.core.adlog.c.b
            r1.<init>()
            r2 = 14
            com.kwad.sdk.core.adlog.c.b r1 = r1.de(r2)
            r2 = 22
            com.kwad.sdk.core.adlog.c.b r1 = r1.dm(r2)
            com.kwad.sdk.core.adlog.c.b r0 = r1.b(r0)
            com.kwad.sdk.core.response.model.AdTemplate r1 = r3.mAdTemplate
            r2 = 0
            com.kwad.sdk.core.adlog.c.b(r1, r0, r2)
            com.kwad.components.ad.splashscreen.monitor.a r0 = com.kwad.components.ad.splashscreen.monitor.a.lX()
            com.kwad.sdk.core.response.model.AdTemplate r1 = r3.mAdTemplate
            r0.ah(r1)
            com.kwad.sdk.api.KsSplashScreenAd$SplashScreenAdInteractionListener r0 = r3.Fe
            if (r0 == 0) goto L59
            r0.onAdShowEnd()
        L59:
            com.kwad.components.ad.splashscreen.monitor.a r0 = com.kwad.components.ad.splashscreen.monitor.a.lX()
            com.kwad.sdk.core.response.model.AdTemplate r1 = r3.mAdTemplate
            r0.w(r1)
        L62:
            r3.lT()
            return
    }

    @androidx.annotation.MainThread
    public final void lR() {
            r2 = this;
            com.kwad.components.ad.splashscreen.monitor.a r0 = com.kwad.components.ad.splashscreen.monitor.a.lX()
            com.kwad.sdk.core.response.model.AdTemplate r1 = r2.mAdTemplate
            r0.ah(r1)
            com.kwad.sdk.api.KsSplashScreenAd$SplashScreenAdInteractionListener r0 = r2.Fe
            if (r0 == 0) goto L10
            r0.onAdShowEnd()
        L10:
            com.kwad.components.ad.splashscreen.monitor.a r0 = com.kwad.components.ad.splashscreen.monitor.a.lX()
            com.kwad.sdk.core.response.model.AdTemplate r1 = r2.mAdTemplate
            r0.w(r1)
            return
    }

    @androidx.annotation.MainThread
    public final void lS() {
            r2 = this;
            com.kwad.sdk.api.KsSplashScreenAd$SplashScreenAdInteractionListener r0 = r2.Fe
            if (r0 == 0) goto L7
            r0.onSkippedAd()
        L7:
            com.kwad.components.ad.splashscreen.monitor.a r0 = com.kwad.components.ad.splashscreen.monitor.a.lX()
            com.kwad.sdk.core.response.model.AdTemplate r1 = r2.mAdTemplate
            r0.w(r1)
            r2.lT()
            return
    }

    public final void lW() {
            r2 = this;
            com.kwad.sdk.core.view.AdBaseFrameLayout r0 = r2.mRootContainer
            com.kwad.components.ad.splashscreen.h$2 r1 = new com.kwad.components.ad.splashscreen.h$2
            r1.<init>(r2)
            r0.post(r1)
            return
    }

    @Override // com.kwad.sdk.mvp.a
    public final void release() {
            r1 = this;
            com.kwad.components.ad.splashscreen.d.a r0 = r1.Fq
            if (r0 == 0) goto L7
            r0.release()
        L7:
            com.kwad.sdk.core.j.a r0 = r1.Fs
            if (r0 == 0) goto Le
            r0.release()
        Le:
            return
    }

    public final void setSplashScreenAdListener(com.kwad.sdk.api.KsSplashScreenAd.SplashScreenAdInteractionListener r1) {
            r0 = this;
            r0.Fe = r1
            return
    }
}
