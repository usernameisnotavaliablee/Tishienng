package com.kwad.components.core.e.d;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c implements com.kwad.sdk.core.NetworkMonitor.a, com.kwad.sdk.core.download.c, com.kwad.sdk.core.webview.a {
    private java.util.List<com.kwad.sdk.api.KsAppDownloadListener> PA;

    @androidx.annotation.NonNull
    private com.kwad.sdk.core.response.model.AdTemplate Pw;
    private boolean Px;
    private com.kwad.components.core.e.d.c.a Py;
    private android.content.DialogInterface.OnShowListener Pz;
    private boolean downloadPauseEnable;
    private android.os.Handler iK;

    @androidx.annotation.NonNull
    private com.kwad.sdk.core.response.model.AdInfo mAdInfo;
    private android.content.DialogInterface.OnDismissListener mOnDismissListener;
    private org.json.JSONObject mReportExtData;









    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        boolean handleDownloadDialog(android.content.DialogInterface.OnClickListener r1);
    }

    public c(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r0)
            return
    }

    public c(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r2, @androidx.annotation.NonNull com.kwad.sdk.api.KsAppDownloadListener r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r3)
            return
    }

    public c(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r1, com.kwad.sdk.api.KsAppDownloadListener r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.kwad.sdk.core.response.model.AdInfo r1 = r0.mAdInfo
            com.kwad.sdk.core.response.model.AdInfo$AdConversionInfo r2 = r1.adConversionInfo
            r2.appDownloadUrl = r3
            com.kwad.sdk.core.response.model.AdInfo$AdBaseInfo r2 = r1.adBaseInfo
            r2.appPackageName = r4
            java.lang.String r2 = com.kwad.sdk.utils.al.md5(r3)
            r1.downloadId = r2
            return
    }

    public c(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r2, org.json.JSONObject r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public c(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r3, org.json.JSONObject r4, com.kwad.sdk.api.KsAppDownloadListener r5) {
            r2 = this;
            r2.<init>()
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.iK = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.PA = r0
            r2.Pw = r3
            com.kwad.sdk.core.response.model.AdInfo r3 = com.kwad.sdk.core.response.b.e.el(r3)
            r2.mAdInfo = r3
            r2.mReportExtData = r4
            if (r5 == 0) goto L24
            r2.b(r5)
        L24:
            r2.pA()
            com.kwad.sdk.core.response.model.AdTemplate r3 = r2.Pw
            com.kwad.sdk.core.response.model.AdInfo r3 = com.kwad.sdk.core.response.b.e.el(r3)
            boolean r3 = com.kwad.sdk.core.response.b.a.cH(r3)
            r2.downloadPauseEnable = r3
            r2.pz()
            com.kwad.sdk.a.a.c r3 = com.kwad.sdk.a.a.c.CU()
            com.kwad.sdk.core.response.model.AdTemplate r4 = r2.Pw
            r3.aZ(r4)
            return
    }

    public static int A(com.kwad.components.core.e.d.a.C0073a r2) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.getAdTemplate()
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            com.kwad.sdk.core.response.model.AdInfo$DownloadSafeInfo r1 = r0.downloadSafeInfo
            com.kwad.sdk.core.response.model.AdInfo$ComplianceInfo r1 = r1.complianceInfo
            if (r1 == 0) goto L2d
            int r2 = r2.dW()
            r1 = 2
            if (r2 == r1) goto L26
            r1 = 3
            if (r2 == r1) goto L1f
            com.kwad.sdk.core.response.model.AdInfo$DownloadSafeInfo r2 = r0.downloadSafeInfo
            com.kwad.sdk.core.response.model.AdInfo$ComplianceInfo r2 = r2.complianceInfo
            int r2 = r2.actionBarType
            return r2
        L1f:
            com.kwad.sdk.core.response.model.AdInfo$DownloadSafeInfo r2 = r0.downloadSafeInfo
            com.kwad.sdk.core.response.model.AdInfo$ComplianceInfo r2 = r2.complianceInfo
            int r2 = r2.materialJumpType
            return r2
        L26:
            com.kwad.sdk.core.response.model.AdInfo$DownloadSafeInfo r2 = r0.downloadSafeInfo
            com.kwad.sdk.core.response.model.AdInfo$ComplianceInfo r2 = r2.complianceInfo
            int r2 = r2.describeBarType
            return r2
        L2d:
            r2 = 0
            return r2
    }

    static /* synthetic */ void a(com.kwad.components.core.e.d.c r0, com.kwad.sdk.api.KsAppDownloadListener r1) {
            r0.a(r1)
            return
    }

    private void a(@androidx.annotation.NonNull com.kwad.sdk.api.KsAppDownloadListener r7) {
            r6 = this;
            int r5 = com.kwad.sdk.core.config.e.BY()
            boolean r4 = com.kwad.sdk.core.config.e.BX()
            java.lang.String r0 = "ApkDownloadHelper"
            java.lang.String r1 = "DownloadProgressTransformUtil  go in updateDownloadProgress"
            com.kwad.sdk.core.d.c.d(r0, r1)
            com.kwad.sdk.core.response.model.AdInfo r0 = r6.mAdInfo
            r2 = r0
            long r0 = r2.soFarBytes
            long r2 = r2.totalBytes
            int r0 = com.kwad.sdk.utils.t.a(r0, r2, r4, r5)
            com.kwad.sdk.core.response.model.AdInfo r1 = r6.mAdInfo
            int r1 = r1.status
            switch(r1) {
                case 0: goto L5e;
                case 1: goto L46;
                case 2: goto L42;
                case 3: goto L42;
                case 4: goto L2e;
                case 5: goto L5e;
                case 6: goto L21;
                case 7: goto L2a;
                case 8: goto L26;
                case 9: goto L26;
                case 10: goto L21;
                case 11: goto L21;
                case 12: goto L22;
                default: goto L21;
            }
        L21:
            goto L41
        L22:
            r7.onInstalled()
            return
        L26:
            r7.onDownloadFinished()
            return
        L2a:
            r7.onDownloadFailed()
            return
        L2e:
            boolean r1 = r7 instanceof com.kwad.sdk.core.download.a.a
            if (r1 == 0) goto L38
            r1 = r7
            com.kwad.sdk.core.download.a.a r1 = (com.kwad.sdk.core.download.a.a) r1
            r1.onPaused(r0)
        L38:
            boolean r1 = r7 instanceof com.kwad.sdk.api.KsApkDownloadListener     // Catch: java.lang.Throwable -> L41
            if (r1 == 0) goto L41
            com.kwad.sdk.api.KsApkDownloadListener r7 = (com.kwad.sdk.api.KsApkDownloadListener) r7     // Catch: java.lang.Throwable -> L41
            r7.onPaused(r0)     // Catch: java.lang.Throwable -> L41
        L41:
            return
        L42:
            r7.onProgressUpdate(r0)
            return
        L46:
            r0 = 0
            r7.onProgressUpdate(r0)
            boolean r0 = r7 instanceof com.kwad.sdk.core.download.a.a
            if (r0 == 0) goto L54
            com.kwad.sdk.core.download.a.a r7 = (com.kwad.sdk.core.download.a.a) r7
            r7.onDownloadStarted()
            return
        L54:
            r7.onDownloadStarted()     // Catch: java.lang.Throwable -> L58
            return
        L58:
            r0 = move-exception
            r7 = r0
            com.kwad.sdk.core.d.c.printStackTraceOnly(r7)
            return
        L5e:
            r7.onIdle()
            return
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate c(com.kwad.components.core.e.d.c r0) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.Pw
            return r0
    }

    private static int d(android.content.Context r1, com.kwad.sdk.core.response.model.AdTemplate r2) {
            if (r1 == 0) goto L8
            if (r2 == 0) goto L8
            r0 = 0
            com.kwad.components.core.page.DownloadLandPageActivity.launch(r1, r2, r0)
        L8:
            r1 = 9
            return r1
    }

    static /* synthetic */ java.util.List d(com.kwad.components.core.e.d.c r0) {
            java.util.List<com.kwad.sdk.api.KsAppDownloadListener> r0 = r0.PA
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdInfo e(com.kwad.components.core.e.d.c r0) {
            com.kwad.sdk.core.response.model.AdInfo r0 = r0.mAdInfo
            return r0
    }

    private void pA() {
            r2 = this;
            com.kwad.sdk.core.download.b.GR()
            java.lang.String r0 = r2.pC()
            int r0 = com.kwad.sdk.core.download.b.dO(r0)
            if (r0 == 0) goto L11
            com.kwad.sdk.core.response.model.AdInfo r1 = r2.mAdInfo
            r1.status = r0
        L11:
            r2.pG()
            r2.pF()
            return
    }

    private boolean pE() {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            r2 = 0
            if (r0 >= r1) goto L53
            com.kwad.sdk.core.response.model.AdTemplate r0 = r4.Pw
            boolean r0 = r0.mIsFromContent
            if (r0 == 0) goto L1f
            boolean r0 = com.kwad.sdk.core.config.e.EO()
            if (r0 == 0) goto L1f
            boolean r0 = r4.pK()
            if (r0 == 0) goto L1e
            com.kwad.sdk.core.response.model.AdTemplate r1 = r4.Pw
            com.kwad.sdk.core.adlog.c.bV(r1)
        L1e:
            return r0
        L1f:
            com.kwad.sdk.core.response.model.AdTemplate r0 = r4.Pw
            boolean r0 = r0.mIsFromContent
            if (r0 != 0) goto L53
            boolean r0 = com.kwad.sdk.core.config.e.Fu()
            if (r0 == 0) goto L53
            android.content.Context r0 = com.kwad.sdk.service.ServiceProvider.getContext()
            boolean r0 = com.kwad.components.core.l.b.av(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "handleForceOpenApp enableForceOpen: "
            r1.<init>(r3)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "ApkDownloadHelper"
            com.kwad.sdk.core.d.c.d(r3, r1)
            if (r0 == 0) goto L4c
            boolean r2 = r4.pK()
        L4c:
            if (r2 == 0) goto L53
            com.kwad.sdk.core.response.model.AdTemplate r0 = r4.Pw
            com.kwad.sdk.core.adlog.c.bW(r0)
        L53:
            return r2
    }

    private void pF() {
            r2 = this;
            android.os.Handler r0 = r2.iK
            com.kwad.components.core.e.d.c$3 r1 = new com.kwad.components.core.e.d.c$3
            r1.<init>(r2)
            r0.post(r1)
            return
    }

    private boolean pI() {
            r2 = this;
            com.kwad.components.core.e.d.c$a r0 = r2.Py
            if (r0 == 0) goto Le
            com.kwad.components.core.e.d.c$4 r1 = new com.kwad.components.core.e.d.c$4
            r1.<init>(r2)
            boolean r0 = r0.handleDownloadDialog(r1)
            return r0
        Le:
            r0 = 0
            return r0
    }

    private boolean pK() {
            r3 = this;
            android.content.Context r0 = com.kwad.sdk.service.ServiceProvider.getContext()
            com.kwad.components.core.e.d.a$a r1 = new com.kwad.components.core.e.d.a$a
            r1.<init>(r0)
            com.kwad.sdk.core.response.model.AdTemplate r2 = r3.Pw
            com.kwad.components.core.e.d.a$a r1 = r1.aB(r2)
            r2 = 1
            int r1 = com.kwad.components.core.e.d.d.a(r1, r2)
            if (r1 != r2) goto L17
            return r2
        L17:
            com.kwad.sdk.core.response.model.AdInfo r1 = r3.mAdInfo
            java.lang.String r1 = com.kwad.sdk.core.response.b.a.ay(r1)
            boolean r0 = com.kwad.sdk.utils.as.as(r0, r1)
            if (r0 == 0) goto L28
            com.kwad.sdk.core.response.model.AdTemplate r1 = r3.Pw
            com.kwad.sdk.core.adlog.c.bU(r1)
        L28:
            return r0
    }

    private int pP() {
            r2 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.Pw
            r1 = 1
            r0.downLoadType = r1
            r2.pM()
            r0 = 5
            return r0
    }

    private boolean t(com.kwad.components.core.e.d.a.C0073a r3) {
            r2 = this;
            android.content.Context r3 = r3.getContext()
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.Pw
            boolean r3 = com.kwad.sdk.utils.e.i(r3, r0)
            if (r3 == 0) goto L12
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.Pw
            r1 = 0
            com.kwad.sdk.core.adlog.c.k(r0, r1)
        L12:
            return r3
    }

    private int u(com.kwad.components.core.e.d.a.C0073a r4) {
            r3 = this;
            android.content.Context r0 = r4.getContext()
            com.kwad.sdk.core.response.model.AdInfo r1 = r3.mAdInfo
            java.lang.String r1 = com.kwad.sdk.core.response.b.a.cW(r1)
            com.kwad.sdk.core.response.model.AdTemplate r2 = r3.Pw
            boolean r1 = com.kwad.sdk.utils.e.a(r0, r1, r2)
            r2 = 11
            if (r1 == 0) goto L1b
            com.kwad.sdk.core.response.model.AdTemplate r4 = r3.Pw
            r0 = 1
            com.kwad.sdk.core.adlog.c.k(r4, r0)
            return r2
        L1b:
            boolean r1 = r3.t(r4)
            if (r1 == 0) goto L22
            return r2
        L22:
            boolean r1 = r3.pI()
            if (r1 == 0) goto L2b
            r4 = 10
            return r4
        L2b:
            boolean r1 = com.kwad.sdk.utils.ao.isNetworkConnected(r0)
            r2 = 2
            if (r1 != 0) goto L3a
            java.lang.String r4 = com.kwad.sdk.utils.ae.cQ(r0)
            com.kwad.sdk.utils.ac.Q(r0, r4)
            return r2
        L3a:
            boolean r0 = r4.pv()
            if (r0 == 0) goto L4b
            boolean r0 = com.kwad.sdk.core.config.e.Fg()
            if (r0 == 0) goto L4b
            int r4 = r3.v(r4)
            return r4
        L4b:
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.Pw
            boolean r0 = com.kwad.sdk.core.response.b.e.eA(r0)
            if (r0 == 0) goto L66
            int r0 = r4.px()
            if (r0 == r2) goto L66
            android.content.Context r0 = r4.getContext()
            com.kwad.sdk.core.response.model.AdTemplate r4 = r4.getAdTemplate()
            int r4 = d(r0, r4)
            return r4
        L66:
            boolean r0 = r4.pr()
            if (r0 == 0) goto L71
            int r4 = r3.w(r4)
            return r4
        L71:
            boolean r4 = r3.x(r4)
            if (r4 == 0) goto L7a
            r4 = 8
            return r4
        L7a:
            int r4 = r3.pM()
            return r4
    }

    private int v(com.kwad.components.core.e.d.a.C0073a r5) {
            r4 = this;
            android.content.Context r0 = r5.getContext()
            com.kwad.sdk.core.response.model.AdTemplate r1 = r5.getAdTemplate()
            int r5 = r5.pw()
            r2 = 1
            if (r5 == r2) goto L40
            r3 = 2
            if (r5 == r3) goto L13
            return r2
        L13:
            boolean r5 = com.kwad.sdk.core.response.b.b.dp(r1)
            if (r5 == 0) goto L3d
            com.kwad.components.core.e.c.b$a r5 = new com.kwad.components.core.e.c.b$a
            r5.<init>()
            com.kwad.components.core.e.c.b$a r5 = r5.aA(r1)
            java.lang.String r1 = com.kwad.sdk.core.response.b.b.m9do(r1)
            com.kwad.components.core.e.c.b$a r5 = r5.ak(r1)
            android.content.DialogInterface$OnShowListener r1 = r4.Pz
            com.kwad.components.core.e.c.b$a r5 = r5.a(r1)
            android.content.DialogInterface$OnDismissListener r1 = r4.mOnDismissListener
            com.kwad.components.core.e.c.b$a r5 = r5.c(r1)
            com.kwad.components.core.e.c.b$b r5 = r5.oZ()
            com.kwad.components.core.e.c.b.a(r0, r5)
        L3d:
            r5 = 8
            return r5
        L40:
            int r5 = r4.pM()
            return r5
    }

    private int w(com.kwad.components.core.e.d.a.C0073a r6) {
            r5 = this;
            android.content.Context r0 = r6.getContext()
            com.kwad.sdk.core.response.model.AdTemplate r1 = r6.getAdTemplate()
            int r2 = A(r6)
            r3 = 8
            r4 = 1
            if (r2 == r4) goto L31
            r0 = 2
            if (r2 == r0) goto L24
            r0 = 3
            if (r2 == r0) goto L23
            boolean r6 = r5.x(r6)
            if (r6 == 0) goto L1e
            return r3
        L1e:
            int r6 = r5.pM()
            return r6
        L23:
            return r4
        L24:
            android.content.Context r0 = r6.getContext()
            com.kwad.sdk.core.response.model.AdTemplate r6 = r6.getAdTemplate()
            int r6 = d(r0, r6)
            return r6
        L31:
            boolean r6 = com.kwad.sdk.core.response.b.b.dp(r1)
            if (r6 == 0) goto L5b
            com.kwad.components.core.e.c.b$a r6 = new com.kwad.components.core.e.c.b$a
            r6.<init>()
            com.kwad.components.core.e.c.b$a r6 = r6.aA(r1)
            java.lang.String r1 = com.kwad.sdk.core.response.b.b.m9do(r1)
            com.kwad.components.core.e.c.b$a r6 = r6.ak(r1)
            android.content.DialogInterface$OnShowListener r1 = r5.Pz
            com.kwad.components.core.e.c.b$a r6 = r6.a(r1)
            android.content.DialogInterface$OnDismissListener r1 = r5.mOnDismissListener
            com.kwad.components.core.e.c.b$a r6 = r6.c(r1)
            com.kwad.components.core.e.c.b$b r6 = r6.oZ()
            com.kwad.components.core.e.c.b.a(r0, r6)
        L5b:
            return r3
    }

    private boolean x(com.kwad.components.core.e.d.a.C0073a r3) {
            r2 = this;
            boolean r0 = r3.po()
            if (r0 != 0) goto L4a
            com.kwad.sdk.core.response.model.AdInfo r0 = r2.mAdInfo
            int r0 = r0.status
            r1 = 4
            if (r0 == r1) goto L4a
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.Pw
            boolean r0 = com.kwad.sdk.core.response.b.b.ds(r0)
            if (r0 == 0) goto L4a
            boolean r0 = y(r3)
            if (r0 != 0) goto L1c
            goto L4a
        L1c:
            android.content.Context r3 = r3.getContext()
            com.kwad.components.core.e.c.b$a r0 = new com.kwad.components.core.e.c.b$a
            r0.<init>()
            com.kwad.sdk.core.response.model.AdTemplate r1 = r2.Pw
            com.kwad.components.core.e.c.b$a r0 = r0.aA(r1)
            com.kwad.sdk.core.response.model.AdTemplate r1 = r2.Pw
            java.lang.String r1 = com.kwad.sdk.core.response.b.b.dr(r1)
            com.kwad.components.core.e.c.b$a r0 = r0.ak(r1)
            android.content.DialogInterface$OnShowListener r1 = r2.Pz
            com.kwad.components.core.e.c.b$a r0 = r0.a(r1)
            android.content.DialogInterface$OnDismissListener r1 = r2.mOnDismissListener
            com.kwad.components.core.e.c.b$a r0 = r0.c(r1)
            com.kwad.components.core.e.c.b$b r0 = r0.oZ()
            boolean r3 = com.kwad.components.core.e.c.b.a(r3, r0)
            return r3
        L4a:
            r3 = 0
            return r3
    }

    private static boolean y(com.kwad.components.core.e.d.a.C0073a r3) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.getAdTemplate()
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            boolean r1 = com.kwad.sdk.core.response.b.a.bw(r0)
            r2 = 1
            if (r1 == 0) goto L20
            boolean r1 = com.kwad.components.core.page.DownloadLandPageActivity.showingAdWebViewLandPage
            if (r1 != 0) goto L1f
            boolean r1 = com.kwad.components.core.page.AdWebViewVideoActivityProxy.showingAdWebViewVideoActivity
            if (r1 != 0) goto L1f
            com.kwad.sdk.core.response.model.AdTemplate r1 = r3.getAdTemplate()
            boolean r1 = r1.isWebViewDownload
            if (r1 == 0) goto L20
        L1f:
            return r2
        L20:
            boolean r0 = com.kwad.sdk.core.response.b.a.bx(r0)
            if (r0 == 0) goto L31
            android.content.Context r3 = r3.getContext()
            boolean r3 = com.kwad.sdk.utils.ao.isWifiConnected(r3)
            if (r3 != 0) goto L31
            return r2
        L31:
            r3 = 0
            return r3
    }

    private int z(com.kwad.components.core.e.d.a.C0073a r3) {
            r2 = this;
            android.content.Context r0 = r3.getContext()
            android.app.Activity r0 = com.kwad.sdk.o.m.ej(r0)
            if (r0 == 0) goto L28
            com.kwad.sdk.core.response.model.AdInfo r1 = r2.mAdInfo
            boolean r1 = com.kwad.sdk.core.response.b.a.T(r1)
            if (r1 == 0) goto L28
            boolean r1 = r3.pf()
            if (r1 != 0) goto L28
            boolean r1 = r3.pk()
            if (r1 != 0) goto L28
            r1 = 1
            r3.ay(r1)
            com.kwad.components.core.e.e.e.a(r0, r3)
            r3 = 18
            return r3
        L28:
            int r3 = r2.pJ()
            return r3
    }

    public final void a(com.kwad.components.core.e.d.c.a r1) {
            r0 = this;
            r0.Py = r1
            return
    }

    @Override // com.kwad.sdk.core.NetworkMonitor.a
    public final void a(com.kwad.sdk.core.NetworkMonitor.NetworkState r3) {
            r2 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r2.mAdInfo
            int r0 = r0.status
            r1 = 7
            if (r0 != r1) goto Le
            com.kwad.sdk.core.NetworkMonitor$NetworkState r0 = com.kwad.sdk.core.NetworkMonitor.NetworkState.NETWORK_WIFI
            if (r3 != r0) goto Le
            r2.pP()
        Le:
            return
    }

    @Override // com.kwad.sdk.core.download.c
    public final void a(java.lang.String r2, int r3, int r4, int r5) {
            r1 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r1.mAdInfo
            java.lang.String r0 = r0.downloadId
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto Lb
            return
        Lb:
            com.kwad.sdk.core.response.model.AdInfo r2 = r1.mAdInfo
            r0 = 3
            r2.status = r0
            r2.progress = r3
            long r3 = (long) r4
            r2.soFarBytes = r3
            long r3 = (long) r5
            r2.totalBytes = r3
            r1.pF()
            return
    }

    @Override // com.kwad.sdk.core.download.c
    public final void a(java.lang.String r4, int r5, java.lang.String r6, com.kwad.sdk.core.download.e r7) {
            r3 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r3.mAdInfo
            java.lang.String r0 = r0.downloadId
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto Lb
            goto L76
        Lb:
            com.kwad.sdk.core.response.model.AdInfo r4 = r3.mAdInfo
            r0 = 7
            r4.status = r0
            r3.pF()
            boolean r4 = r7.GV()
            if (r4 == 0) goto L42
            com.kwad.sdk.core.adlog.c$a r4 = new com.kwad.sdk.core.adlog.c$a
            r4.<init>(r5, r6)
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.Pw
            com.kwad.sdk.core.adlog.c.a(r0, r4)
            com.kwad.sdk.core.response.model.AdInfo r0 = r3.mAdInfo
            com.kwad.sdk.core.response.model.AdInfo$AdConversionInfo r0 = r0.adConversionInfo
            java.lang.String r0 = r0.appDownloadUrl
            com.kwad.components.core.p.a r1 = com.kwad.components.core.p.a.se()
            com.kwad.sdk.core.response.model.AdTemplate r2 = r3.Pw
            org.json.JSONObject r4 = r4.toJson()
            java.lang.String r4 = r4.toString()
            r1.a(r2, r0, r4)
            r7.GU()
            com.kwad.sdk.core.response.model.AdTemplate r4 = r3.Pw
            com.kwad.sdk.commercial.a.a.h(r4, r5, r6)
        L42:
            com.kwad.sdk.core.response.model.AdInfo r4 = r3.mAdInfo
            com.kwad.sdk.core.response.model.AdInfo$AdConversionInfo r4 = r4.adConversionInfo
            int r4 = r4.retryH5TimeStep
            if (r4 <= 0) goto L76
            boolean r4 = r3.Px
            if (r4 != 0) goto L76
            long r4 = android.os.SystemClock.elapsedRealtime()
            com.kwad.sdk.core.response.model.AdInfo r6 = r3.mAdInfo
            long r0 = r6.mStartDownloadTime
            long r4 = r4 - r0
            com.kwad.sdk.core.response.model.AdInfo$AdConversionInfo r7 = r6.adConversionInfo
            int r7 = r7.retryH5TimeStep
            long r0 = (long) r7
            int r7 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r7 >= 0) goto L76
            java.lang.String r4 = com.kwad.sdk.core.response.b.a.aS(r6)
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L76
            android.content.Context r4 = com.kwad.sdk.service.ServiceProvider.getContext()
            com.kwad.sdk.core.response.model.AdTemplate r5 = r3.Pw
            com.kwad.components.core.page.AdWebViewActivityProxy.launch(r4, r5)
            r4 = 1
            r3.Px = r4
        L76:
            return
    }

    @Override // com.kwad.sdk.core.download.c
    public final void a(java.lang.String r3, com.kwad.sdk.core.download.e r4) {
            r2 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r2.mAdInfo
            java.lang.String r0 = r0.downloadId
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto Lb
            goto L2e
        Lb:
            com.kwad.sdk.core.response.model.AdInfo r3 = r2.mAdInfo
            r0 = 1
            r3.status = r0
            r2.pF()
            boolean r3 = r4.GV()
            if (r3 == 0) goto L2e
            com.kwad.sdk.core.response.model.AdInfo r3 = r2.mAdInfo
            long r0 = android.os.SystemClock.elapsedRealtime()
            r3.mStartDownloadTime = r0
            com.kwad.sdk.core.response.model.AdTemplate r3 = r2.Pw
            com.kwad.sdk.core.adlog.c.bS(r3)
            r4.GU()
            com.kwad.sdk.core.response.model.AdTemplate r3 = r2.Pw
            com.kwad.sdk.commercial.a.a.x(r3)
        L2e:
            return
    }

    @Override // com.kwad.sdk.core.download.c
    public final void a(java.lang.String r3, java.lang.String r4, com.kwad.sdk.core.download.e r5) {
            r2 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r2.mAdInfo
            java.lang.String r0 = r0.downloadId
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto Lb
            goto L6b
        Lb:
            com.kwad.sdk.core.response.model.AdInfo r0 = r2.mAdInfo
            r0.downloadFilePath = r4
            r4 = 100
            r0.progress = r4
            r4 = 8
            r0.status = r4
            r2.pF()
            boolean r4 = r5.GV()
            if (r4 == 0) goto L6b
            r5.GU()
            com.kwad.sdk.core.response.model.AdTemplate r4 = r2.Pw
            org.json.JSONObject r5 = r2.mReportExtData
            com.kwad.sdk.core.adlog.c.c(r4, r5)
            long r4 = android.os.SystemClock.elapsedRealtime()
            com.kwad.sdk.core.response.model.AdInfo r0 = r2.mAdInfo
            long r0 = r0.mStartDownloadTime
            long r4 = r4 - r0
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.Pw
            com.kwad.sdk.commercial.a.a.k(r0, r4)
            com.kwad.sdk.core.a r4 = com.kwad.sdk.core.a.Em()
            com.kwad.sdk.core.response.model.AdTemplate r5 = r2.Pw
            r4.e(r3, r5)
            com.kwad.components.core.e.d.c$1 r3 = new com.kwad.components.core.e.d.c$1
            r3.<init>(r2)
            com.kwad.sdk.utils.h.execute(r3)
            com.kwad.sdk.a.a.c r3 = com.kwad.sdk.a.a.c.CU()
            com.kwad.sdk.core.response.model.AdTemplate r4 = r2.Pw
            r3.bb(r4)
            com.kwad.sdk.a.a.c r3 = com.kwad.sdk.a.a.c.CU()
            com.kwad.sdk.core.response.model.AdTemplate r4 = r2.Pw
            r3.aZ(r4)
            com.kwad.sdk.a.a.b r3 = com.kwad.sdk.a.a.b.CR()
            com.kwad.sdk.core.response.model.AdTemplate r4 = r2.Pw
            r3.aU(r4)
            com.kwad.sdk.core.diskcache.ApkCacheManager r3 = com.kwad.sdk.core.diskcache.ApkCacheManager.getInstance()
            r3.GE()
        L6b:
            return
    }

    @Override // com.kwad.sdk.core.download.c
    public final void a(java.lang.String r2, java.lang.Throwable r3, com.kwad.sdk.core.download.e r4) {
            r1 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r1.mAdInfo
            java.lang.String r0 = r0.downloadId
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto Lb
            goto L29
        Lb:
            com.kwad.sdk.core.response.model.AdInfo r2 = r1.mAdInfo
            r0 = 11
            r2.status = r0
            r1.pF()
            boolean r2 = r4.GV()
            if (r2 == 0) goto L29
            r4.GU()
            com.kwad.sdk.core.response.model.AdTemplate r2 = r1.Pw
            r4 = 100003(0x186a3, float:1.40134E-40)
            java.lang.String r3 = android.util.Log.getStackTraceString(r3)
            com.kwad.sdk.commercial.a.a.i(r2, r4, r3)
        L29:
            return
    }

    public final void aG(int r2) {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.Pw
            r0.downloadSource = r2
            return
    }

    @androidx.annotation.UiThread
    public final void b(com.kwad.sdk.api.KsAppDownloadListener r3) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 != r1) goto L1c
            java.util.List<com.kwad.sdk.api.KsAppDownloadListener> r0 = r2.PA
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L26
            java.util.List<com.kwad.sdk.api.KsAppDownloadListener> r0 = r2.PA
            r1 = 0
            r0.add(r1, r3)
            goto L26
        L1c:
            android.os.Handler r0 = r2.iK
            com.kwad.components.core.e.d.c$7 r1 = new com.kwad.components.core.e.d.c$7
            r1.<init>(r2, r3)
            r0.post(r1)
        L26:
            r2.pG()
            r2.a(r3)
            return
    }

    @Override // com.kwad.sdk.core.download.c
    public final void b(java.lang.String r3, com.kwad.sdk.core.download.e r4) {
            r2 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r2.mAdInfo
            java.lang.String r0 = r0.downloadId
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto Lb
            return
        Lb:
            com.kwad.sdk.core.response.model.AdInfo r3 = r2.mAdInfo
            int r3 = r3.status
            r0 = 4
            if (r3 == r0) goto L27
            boolean r3 = r4.GV()
            if (r3 == 0) goto L27
            com.kwad.sdk.core.response.model.AdTemplate r3 = r2.Pw
            org.json.JSONObject r1 = r2.mReportExtData
            com.kwad.sdk.core.adlog.c.a(r3, r1)
            r4.GU()
            com.kwad.sdk.core.response.model.AdTemplate r3 = r2.Pw
            com.kwad.sdk.commercial.a.a.bg(r3)
        L27:
            com.kwad.sdk.core.response.model.AdInfo r3 = r2.mAdInfo
            r3.status = r0
            r2.pF()
            return
    }

    @Override // com.kwad.sdk.core.download.c
    public final void b(java.lang.String r1, java.lang.String r2, com.kwad.sdk.core.download.e r3) {
            r0 = this;
            com.kwad.sdk.core.response.model.AdInfo r1 = r0.mAdInfo
            r2 = 12
            r1.status = r2
            r0.pF()
            boolean r1 = r3.GV()
            if (r1 == 0) goto L52
            com.kwad.sdk.core.response.model.AdTemplate r1 = r0.Pw
            org.json.JSONObject r2 = r0.mReportExtData
            com.kwad.sdk.core.adlog.c.e(r1, r2)
            r3.GU()
            com.kwad.sdk.core.response.model.AdTemplate r1 = r0.Pw
            com.kwad.sdk.commercial.a.a.bl(r1)
            boolean r1 = r0.pE()
            com.kwad.sdk.a.a.c r2 = com.kwad.sdk.a.a.c.CU()
            com.kwad.sdk.core.response.model.AdTemplate r3 = r0.Pw
            r2.bc(r3)
            com.kwad.sdk.a.a.c r2 = com.kwad.sdk.a.a.c.CU()
            com.kwad.sdk.core.response.model.AdTemplate r3 = r0.Pw
            r2.ba(r3)
            com.kwad.sdk.a.a.b r2 = com.kwad.sdk.a.a.b.CR()
            com.kwad.sdk.core.response.model.AdTemplate r3 = r0.Pw
            r2.aV(r3)
            com.kwad.components.core.e.a.e r2 = com.kwad.components.core.e.a.e.oK()
            com.kwad.sdk.core.response.model.AdTemplate r3 = r0.Pw
            r2.ax(r3)
            com.kwad.sdk.core.a r2 = com.kwad.sdk.core.a.Em()
            java.lang.String r3 = r0.pC()
            r2.dl(r3)
            goto L53
        L52:
            r1 = 0
        L53:
            com.kwad.components.core.e.d.c$2 r2 = new com.kwad.components.core.e.d.c$2
            r2.<init>(r0, r1)
            com.kwad.sdk.utils.h.execute(r2)
            return
    }

    public final void c(com.kwad.sdk.api.KsAppDownloadListener r3) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 != r1) goto L13
            java.util.List<com.kwad.sdk.api.KsAppDownloadListener> r0 = r2.PA
            r0.remove(r3)
            return
        L13:
            android.os.Handler r0 = r2.iK
            com.kwad.components.core.e.d.c$8 r1 = new com.kwad.components.core.e.d.c$8
            r1.<init>(r2, r3)
            r0.post(r1)
            return
    }

    @Override // com.kwad.sdk.core.download.c
    public final void c(java.lang.String r4, com.kwad.sdk.core.download.e r5) {
            r3 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r3.mAdInfo
            java.lang.String r0 = r0.downloadId
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.util.WeakHashMap<java.lang.String, java.lang.Integer> r0 = com.kwad.sdk.core.download.b.aDk
            java.lang.Object r1 = r0.get(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r2 = 2
            if (r1 == 0) goto L23
            int r1 = r1.intValue()
            if (r1 != r2) goto L23
            com.kwad.sdk.core.response.model.AdTemplate r1 = r3.Pw
            r1.downLoadType = r2
            r0.remove(r4)
        L23:
            com.kwad.sdk.core.response.model.AdInfo r4 = r3.mAdInfo
            int r4 = r4.status
            if (r4 == r2) goto L3e
            boolean r4 = r5.GV()
            if (r4 == 0) goto L3e
            com.kwad.sdk.core.response.model.AdTemplate r4 = r3.Pw
            org.json.JSONObject r0 = r3.mReportExtData
            com.kwad.sdk.core.adlog.c.b(r4, r0)
            r5.GU()
            com.kwad.sdk.core.response.model.AdTemplate r4 = r3.Pw
            com.kwad.sdk.commercial.a.a.bh(r4)
        L3e:
            com.kwad.sdk.core.response.model.AdInfo r4 = r3.mAdInfo
            r4.status = r2
            r3.pF()
            return
    }

    public final void clear() {
            r0 = this;
            r0.pQ()
            return
    }

    public final void d(com.kwad.sdk.api.KsAppDownloadListener r1) {
            r0 = this;
            if (r1 != 0) goto L3
            return
        L3:
            r0.pG()
            r0.a(r1)
            return
    }

    @Override // com.kwad.sdk.core.download.c
    public final void d(java.lang.String r3, com.kwad.sdk.core.download.e r4) {
            r2 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r2.mAdInfo
            java.lang.String r0 = r0.downloadId
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto Lb
            return
        Lb:
            com.kwad.sdk.core.response.model.AdInfo r3 = r2.mAdInfo
            int r3 = r3.status
            r0 = 5
            if (r3 == r0) goto L27
            boolean r3 = r4.GV()
            if (r3 == 0) goto L27
            com.kwad.sdk.core.response.model.AdTemplate r3 = r2.Pw
            org.json.JSONObject r1 = r2.mReportExtData
            com.kwad.sdk.core.adlog.c.d(r3, r1)
            r4.GU()
            com.kwad.sdk.core.response.model.AdTemplate r3 = r2.Pw
            com.kwad.sdk.commercial.a.a.bi(r3)
        L27:
            com.kwad.sdk.a.a.c r3 = com.kwad.sdk.a.a.c.CU()
            com.kwad.sdk.core.response.model.AdTemplate r4 = r2.Pw
            r3.ba(r4)
            com.kwad.sdk.a.a.b r3 = com.kwad.sdk.a.a.b.CR()
            com.kwad.sdk.core.response.model.AdTemplate r4 = r2.Pw
            r3.aV(r4)
            com.kwad.sdk.core.response.model.AdInfo r3 = r2.mAdInfo
            r3.status = r0
            r2.pF()
            return
    }

    public final void d(org.json.JSONObject r1) {
            r0 = this;
            r0.mReportExtData = r1
            return
    }

    @Override // com.kwad.sdk.core.download.c
    public final void e(java.lang.String r2, com.kwad.sdk.core.download.e r3) {
            r1 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r1.mAdInfo
            java.lang.String r0 = r0.downloadId
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto Lb
            goto L28
        Lb:
            com.kwad.sdk.core.response.model.AdInfo r2 = r1.mAdInfo
            r0 = 9
            r2.status = r0
            r1.pF()
            boolean r2 = r3.GV()
            if (r2 == 0) goto L28
            com.kwad.sdk.core.response.model.AdTemplate r2 = r1.Pw
            r0 = 2
            com.kwad.sdk.core.adlog.c.h(r2, r0)
            r3.GU()
            com.kwad.sdk.core.response.model.AdTemplate r2 = r1.Pw
            com.kwad.sdk.commercial.a.a.bk(r2)
        L28:
            return
    }

    @Override // com.kwad.sdk.core.download.c
    public final void f(java.lang.String r2, com.kwad.sdk.core.download.e r3) {
            r1 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r1.mAdInfo
            java.lang.String r0 = r0.downloadId
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto Lb
            goto L1c
        Lb:
            r1.pG()
            boolean r2 = r3.GV()
            if (r2 == 0) goto L1c
            r3.GU()
            com.kwad.sdk.core.response.model.AdTemplate r2 = r1.Pw
            com.kwad.sdk.commercial.a.a.bm(r2)
        L1c:
            return
    }

    @Override // com.kwad.sdk.core.download.c
    public final void g(java.lang.String r2, com.kwad.sdk.core.download.e r3) {
            r1 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r1.mAdInfo
            java.lang.String r0 = r0.downloadId
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto Lb
            goto L1e
        Lb:
            boolean r2 = r3.GV()
            if (r2 == 0) goto L1e
            r3.GU()
            com.kwad.sdk.core.response.model.AdTemplate r2 = r1.Pw
            com.kwad.sdk.core.adlog.c.bT(r2)
            com.kwad.sdk.core.response.model.AdTemplate r2 = r1.Pw
            com.kwad.sdk.commercial.a.a.bj(r2)
        L1e:
            return
    }

    public final int pB() {
            r2 = this;
            r2.pG()
            com.kwad.sdk.core.response.model.AdInfo r0 = r2.mAdInfo
            int r0 = r0.status
            r1 = 3
            if (r0 != r1) goto Lb
            r0 = 2
        Lb:
            return r0
    }

    @Override // com.kwad.sdk.core.download.c
    public final java.lang.String pC() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r1.mAdInfo
            java.lang.String r0 = r0.downloadId
            return r0
    }

    @Override // com.kwad.sdk.core.download.c
    public final java.lang.String pD() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r1.mAdInfo
            com.kwad.sdk.core.response.model.AdInfo$AdBaseInfo r0 = r0.adBaseInfo
            java.lang.String r0 = r0.appPackageName
            return r0
    }

    public final void pG() {
            r5 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r5.mAdInfo
            com.kwad.sdk.core.response.model.AdInfo$AdBaseInfo r0 = r0.adBaseInfo
            java.lang.String r0 = r0.appPackageName
            android.content.Context r1 = com.kwad.sdk.service.ServiceProvider.getContext()
            boolean r0 = com.kwad.sdk.utils.as.aq(r1, r0)
            r1 = 12
            if (r0 == 0) goto L17
            com.kwad.sdk.core.response.model.AdInfo r0 = r5.mAdInfo
            r0.status = r1
            return
        L17:
            com.kwad.sdk.core.response.model.AdInfo r0 = r5.mAdInfo
            int r2 = r0.status
            r3 = 0
            if (r2 != r1) goto L22
            r0.status = r3
            r0.progress = r3
        L22:
            int r1 = r0.status
            r2 = 8
            if (r1 == r2) goto L2c
            r4 = 9
            if (r1 != r4) goto L45
        L2c:
            java.lang.String r0 = r0.downloadFilePath
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L3f
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r0 = r1.exists()
            if (r0 != 0) goto L45
        L3f:
            com.kwad.sdk.core.response.model.AdInfo r0 = r5.mAdInfo
            r0.status = r3
            r0.progress = r3
        L45:
            com.kwad.sdk.core.response.model.AdInfo r0 = r5.mAdInfo
            int r1 = r0.status
            if (r1 != 0) goto L66
            java.lang.String r0 = com.kwad.sdk.core.download.a.H(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L66
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r1 = r1.exists()
            if (r1 == 0) goto L66
            com.kwad.sdk.core.response.model.AdInfo r1 = r5.mAdInfo
            r1.downloadFilePath = r0
            r1.status = r2
        L66:
            return
    }

    @androidx.annotation.NonNull
    public final com.kwad.sdk.core.response.model.AdTemplate pH() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.Pw
            return r0
    }

    public final int pJ() {
            r2 = this;
            com.kwad.components.core.e.d.c$5 r0 = new com.kwad.components.core.e.d.c$5
            r0.<init>(r2)
            com.kwad.sdk.utils.h.execute(r0)
            android.content.Context r0 = com.kwad.sdk.service.ServiceProvider.getContext()
            com.kwad.sdk.core.response.model.AdInfo r1 = r2.mAdInfo
            java.lang.String r1 = com.kwad.sdk.core.response.b.a.ay(r1)
            boolean r0 = com.kwad.sdk.utils.as.as(r0, r1)
            if (r0 == 0) goto L1d
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.Pw
            com.kwad.sdk.core.adlog.c.bU(r0)
        L1d:
            r0 = 6
            return r0
    }

    public final int pL() {
            r2 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r2.mAdInfo
            java.lang.String r0 = r0.downloadFilePath
            com.kwad.components.core.e.d.c$6 r1 = new com.kwad.components.core.e.d.c$6
            r1.<init>(r2)
            com.kwad.sdk.utils.as.a(r0, r1)
            r0 = 7
            return r0
    }

    public final int pM() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r1.mAdInfo
            com.kwad.sdk.core.download.a.I(r0)
            r0 = 3
            return r0
    }

    public final int pN() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r1.mAdInfo
            java.lang.String r0 = r0.downloadId
            com.kwad.sdk.core.download.a.dL(r0)
            r0 = 4
            return r0
    }

    public final int pO() {
            r2 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.Pw
            r1 = 2
            r0.downLoadType = r1
            r2.pM()
            r0 = 5
            return r0
    }

    @Override // com.kwad.sdk.core.webview.a
    public final void pQ() {
            r1 = this;
            java.util.List<com.kwad.sdk.api.KsAppDownloadListener> r0 = r1.PA
            if (r0 == 0) goto L7
            r0.clear()
        L7:
            return
    }

    public final void pz() {
            r3 = this;
            com.kwad.sdk.core.download.b r0 = com.kwad.sdk.core.download.b.GR()
            com.kwad.sdk.core.response.model.AdTemplate r1 = r3.Pw
            r0.a(r3, r1)
            boolean r0 = com.kwad.sdk.core.config.e.FG()
            if (r0 == 0) goto L1c
            com.kwad.sdk.core.NetworkMonitor r0 = com.kwad.sdk.core.NetworkMonitor.getInstance()
            android.content.Context r1 = com.kwad.sdk.service.ServiceProvider.getContext()
            com.kwad.sdk.core.response.model.AdTemplate r2 = r3.Pw
            r0.a(r1, r3, r2)
        L1c:
            return
    }

    public final int q(com.kwad.components.core.e.d.a.C0073a r4) {
            r3 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r3.mAdInfo
            int r0 = r0.status
            r1 = 0
            if (r0 == 0) goto L18
            r2 = 1
            if (r0 == r2) goto L18
            switch(r0) {
                case 4: goto L18;
                case 5: goto L18;
                case 6: goto L18;
                case 7: goto L18;
                case 8: goto L13;
                case 9: goto L13;
                case 10: goto L13;
                case 11: goto L13;
                case 12: goto Le;
                default: goto Ld;
            }
        Ld:
            return r1
        Le:
            int r4 = r3.z(r4)
            return r4
        L13:
            int r4 = r3.pL()
            return r4
        L18:
            boolean r4 = r3.t(r4)
            if (r4 == 0) goto L21
            r4 = 11
            return r4
        L21:
            return r1
    }

    public final int r(com.kwad.components.core.e.d.a.C0073a r3) {
            r2 = this;
            r0 = 0
            r2.Px = r0
            r2.pG()
            com.kwad.sdk.core.response.model.AdInfo r1 = r2.mAdInfo
            int r1 = r1.status
            switch(r1) {
                case 0: goto L2d;
                case 1: goto L2d;
                case 2: goto L1d;
                case 3: goto L1d;
                case 4: goto L18;
                case 5: goto L2d;
                case 6: goto L2d;
                case 7: goto L2d;
                case 8: goto L13;
                case 9: goto L13;
                case 10: goto Ld;
                case 11: goto L13;
                case 12: goto Le;
                default: goto Ld;
            }
        Ld:
            goto L2c
        Le:
            int r3 = r2.z(r3)
            return r3
        L13:
            int r3 = r2.pL()
            return r3
        L18:
            int r3 = r2.pO()
            return r3
        L1d:
            boolean r3 = r3.pm()
            if (r3 == 0) goto L2c
            boolean r3 = r2.downloadPauseEnable
            if (r3 == 0) goto L2c
            int r3 = r2.pN()
            return r3
        L2c:
            return r0
        L2d:
            int r3 = r2.u(r3)
            return r3
    }

    public final boolean s(com.kwad.components.core.e.d.a.C0073a r2) {
            r1 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r1.mAdInfo
            int r0 = r0.status
            if (r0 != 0) goto Le
            boolean r2 = r1.t(r2)
            if (r2 == 0) goto Le
            r2 = 1
            return r2
        Le:
            r2 = 0
            return r2
    }

    public final void setOnDismissListener(android.content.DialogInterface.OnDismissListener r1) {
            r0 = this;
            r0.mOnDismissListener = r1
            return
    }

    public final void setOnShowListener(android.content.DialogInterface.OnShowListener r1) {
            r0 = this;
            r0.Pz = r1
            return
    }
}
