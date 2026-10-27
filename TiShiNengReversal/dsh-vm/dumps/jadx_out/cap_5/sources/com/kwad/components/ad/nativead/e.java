package com.kwad.components.ad.nativead;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class e extends com.kwad.sdk.widget.KSRelativeLayout implements com.kwad.sdk.core.j.c {
    private com.kwad.components.offline.api.core.api.OfflineOnAudioConflictListener cB;
    private java.util.List<java.lang.Integer> ck;
    private boolean cp;
    private com.kwad.components.core.webview.a eP;
    private com.kwad.sdk.core.webview.b eQ;
    private int eR;
    private com.kwad.components.core.webview.jshandler.as.b eW;
    private final com.kwad.components.offline.api.core.adlive.listener.AdLivePlayStateListener eh;
    private com.kwad.components.core.k.a.b fD;
    private com.kwad.components.core.widget.a.b fg;
    private com.kwad.components.offline.api.core.adlive.IAdLiveOfflineView fq;
    private com.kwad.components.core.o.a.b.a fr;
    private com.kwad.sdk.widget.KSRelativeLayout hL;
    public com.kwad.components.offline.api.core.adlive.IAdLivePlayModule hR;
    private com.kwad.components.core.webview.jshandler.WebCardRegisterLiveShopListener iA;
    private com.kwad.components.core.webview.jshandler.ba.b iE;
    private com.kwad.components.core.webview.jshandler.ba.a iF;
    private com.kwad.components.offline.api.core.adlive.IAdLiveEndRequest iS;
    private com.kwad.components.core.webview.jshandler.be ix;
    private com.kwad.components.core.webview.jshandler.az iy;
    private com.kwad.components.core.webview.jshandler.WebCardRegisterLiveMessageListener iz;
    private com.kwad.sdk.core.response.model.AdInfo mAdInfo;
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;
    private com.kwad.sdk.core.webview.KsAdWebView mAdWebView;
    private com.kwad.components.core.e.d.c mApkDownloadHelper;
    private android.content.Context mContext;
    private boolean mIsAudioEnable;
    private final com.kwad.sdk.core.network.l<com.kwad.components.core.liveEnd.a, com.kwad.components.core.liveEnd.AdLiveEndCommonResultData> mNetworking;
    private com.kwad.sdk.api.KsNativeAd.VideoPlayListener oQ;
    private int oS;
    private int oT;
    private com.kwad.components.ad.nativead.d.a oW;
    private android.widget.ImageView pj;
    private android.widget.RelativeLayout pk;
    private com.kwad.sdk.core.view.AdBasePvFrameLayout pl;
    private com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl pm;













    public e(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.oS = r1
            r0.oT = r1
            com.kwad.components.ad.nativead.e$10 r1 = new com.kwad.components.ad.nativead.e$10
            r1.<init>(r0)
            r0.eW = r1
            com.kwad.components.ad.nativead.e$12 r1 = new com.kwad.components.ad.nativead.e$12
            r1.<init>(r0)
            r0.mNetworking = r1
            com.kwad.components.ad.nativead.e$2 r1 = new com.kwad.components.ad.nativead.e$2
            r1.<init>(r0)
            r0.eh = r1
            com.kwad.components.ad.nativead.e$3 r1 = new com.kwad.components.ad.nativead.e$3
            r1.<init>(r0)
            r0.cB = r1
            r0.initView()
            return
    }

    static /* synthetic */ int a(com.kwad.components.ad.nativead.e r0, int r1) {
            r0.eR = r1
            return r1
    }

    static /* synthetic */ com.kwad.components.core.webview.jshandler.WebCardRegisterLiveMessageListener a(com.kwad.components.ad.nativead.e r0) {
            com.kwad.components.core.webview.jshandler.WebCardRegisterLiveMessageListener r0 = r0.iz
            return r0
    }

    static /* synthetic */ com.kwad.components.core.webview.jshandler.ba.a a(com.kwad.components.ad.nativead.e r0, com.kwad.components.core.webview.jshandler.ba.a r1) {
            r0.iF = r1
            return r1
    }

    static /* synthetic */ com.kwad.components.core.webview.jshandler.ba.b a(com.kwad.components.ad.nativead.e r0, com.kwad.components.core.webview.jshandler.ba.b r1) {
            r0.iE = r1
            return r1
    }

    static /* synthetic */ com.kwad.components.offline.api.core.adlive.IAdLiveEndRequest a(com.kwad.components.ad.nativead.e r0, com.kwad.components.offline.api.core.adlive.IAdLiveEndRequest r1) {
            r0.iS = r1
            return r1
    }

    static /* synthetic */ void a(com.kwad.components.ad.nativead.e r0, long r1) {
            r0.c(r1)
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.nativead.e r0, android.view.View r1) {
            r0.d(r1)
            return
    }

    private void a(com.kwad.components.core.webview.a r6) {
            r5 = this;
            com.kwad.components.core.webview.jshandler.be r0 = new com.kwad.components.core.webview.jshandler.be
            r0.<init>()
            r5.ix = r0
            com.kwad.components.core.webview.jshandler.az r0 = new com.kwad.components.core.webview.jshandler.az
            r0.<init>()
            r5.iy = r0
            r6.a(r0)
            com.kwad.components.core.webview.jshandler.ac r0 = new com.kwad.components.core.webview.jshandler.ac
            com.kwad.sdk.core.webview.b r1 = r5.eQ
            com.kwad.components.core.e.d.c r2 = r5.mApkDownloadHelper
            com.kwad.sdk.core.webview.d.a.a r3 = r5.getClickListener()
            r4 = 0
            r0.<init>(r1, r2, r3, r4)
            r6.a(r0)
            com.kwad.components.core.webview.jshandler.z r0 = new com.kwad.components.core.webview.jshandler.z
            com.kwad.sdk.core.webview.b r1 = r5.eQ
            com.kwad.components.core.e.d.c r2 = r5.mApkDownloadHelper
            com.kwad.sdk.core.webview.d.a.a r3 = r5.getClickListener()
            r0.<init>(r1, r2, r3)
            r6.a(r0)
            com.kwad.components.core.webview.tachikoma.b.f r0 = new com.kwad.components.core.webview.tachikoma.b.f
            r0.<init>()
            r6.a(r0)
            com.kwad.components.core.webview.jshandler.af r0 = new com.kwad.components.core.webview.jshandler.af
            com.kwad.sdk.core.webview.b r1 = r5.eQ
            r0.<init>(r1)
            r6.a(r0)
            com.kwad.components.core.webview.jshandler.ai r0 = new com.kwad.components.core.webview.jshandler.ai
            com.kwad.sdk.core.webview.b r1 = r5.eQ
            r0.<init>(r1)
            r6.a(r0)
            com.kwad.components.core.webview.jshandler.ae r0 = new com.kwad.components.core.webview.jshandler.ae
            com.kwad.sdk.core.webview.b r1 = r5.eQ
            r0.<init>(r1)
            r6.a(r0)
            com.kwad.components.core.webview.jshandler.as r0 = new com.kwad.components.core.webview.jshandler.as
            com.kwad.components.core.webview.jshandler.as$b r1 = r5.eW
            com.kwad.sdk.core.response.model.AdTemplate r2 = r5.mAdTemplate
            java.lang.String r2 = com.kwad.sdk.core.response.b.b.cT(r2)
            r0.<init>(r1, r2)
            r6.a(r0)
            com.kwad.components.core.webview.jshandler.bc r0 = new com.kwad.components.core.webview.jshandler.bc
            com.kwad.sdk.core.webview.b r1 = r5.eQ
            com.kwad.components.core.e.d.c r2 = r5.mApkDownloadHelper
            r0.<init>(r1, r2)
            r6.a(r0)
            com.kwad.components.core.webview.jshandler.am r0 = new com.kwad.components.core.webview.jshandler.am
            com.kwad.sdk.core.webview.b r1 = r5.eQ
            r0.<init>(r1)
            r6.a(r0)
            com.kwad.components.core.webview.jshandler.o r0 = new com.kwad.components.core.webview.jshandler.o
            com.kwad.sdk.core.webview.b r1 = r5.eQ
            r0.<init>(r1)
            r6.b(r0)
            com.kwad.components.core.webview.jshandler.n r0 = new com.kwad.components.core.webview.jshandler.n
            com.kwad.sdk.core.webview.b r1 = r5.eQ
            r0.<init>(r1)
            r6.b(r0)
            com.kwad.components.core.webview.jshandler.be r0 = r5.ix
            r6.a(r0)
            com.kwad.components.core.webview.jshandler.aq r0 = new com.kwad.components.core.webview.jshandler.aq
            com.kwad.components.core.webview.jshandler.aq$a r1 = r5.getOpenNewPageListener()
            r0.<init>(r1)
            r6.a(r0)
            com.kwad.components.core.webview.jshandler.g r0 = new com.kwad.components.core.webview.jshandler.g
            int r1 = r5.oS
            int r2 = r5.oT
            r0.<init>(r1, r2)
            r6.a(r0)
            com.kwad.components.core.webview.jshandler.WebCardRegisterLiveShopListener r0 = new com.kwad.components.core.webview.jshandler.WebCardRegisterLiveShopListener
            r0.<init>()
            r5.iA = r0
            com.kwad.components.core.webview.jshandler.WebCardRegisterLiveMessageListener r0 = new com.kwad.components.core.webview.jshandler.WebCardRegisterLiveMessageListener
            r0.<init>()
            r5.iz = r0
            com.kwad.components.core.webview.jshandler.WebCardRegisterLiveShopListener r0 = r5.iA
            r6.a(r0)
            com.kwad.components.core.webview.jshandler.WebCardRegisterLiveMessageListener r0 = r5.iz
            r6.a(r0)
            com.kwad.components.core.webview.jshandler.ba r0 = new com.kwad.components.core.webview.jshandler.ba
            com.kwad.components.core.webview.jshandler.ba$c r1 = r5.getRegisterLiveListener()
            r0.<init>(r1)
            r6.a(r0)
            return
    }

    static /* synthetic */ boolean a(com.kwad.components.ad.nativead.e r0, boolean r1) {
            boolean r0 = r0.h(r1)
            return r0
    }

    static /* synthetic */ com.kwad.components.core.webview.jshandler.WebCardRegisterLiveShopListener b(com.kwad.components.ad.nativead.e r0) {
            com.kwad.components.core.webview.jshandler.WebCardRegisterLiveShopListener r0 = r0.iA
            return r0
    }

    private void bc() {
            r4 = this;
            com.kwad.sdk.core.webview.b r0 = new com.kwad.sdk.core.webview.b
            r0.<init>()
            r4.eQ = r0
            com.kwad.sdk.core.response.model.AdTemplate r1 = r4.mAdTemplate
            r0.setAdTemplate(r1)
            com.kwad.sdk.core.webview.b r0 = r4.eQ
            r1 = 0
            r0.mScreenOrientation = r1
            r2 = 0
            r0.aMN = r2
            com.kwad.sdk.core.view.AdBasePvFrameLayout r3 = r4.pl
            r0.TG = r3
            com.kwad.sdk.core.webview.KsAdWebView r3 = r4.mAdWebView
            r0.Ta = r3
            r0.mReportExtData = r2
            r0.aMP = r1
            return
    }

    private void bd() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            boolean r0 = com.kwad.sdk.core.response.b.b.dg(r0)
            if (r0 != 0) goto L9
            return
        L9:
            r1.fu()
            return
    }

    private void bf() {
            r1 = this;
            com.kwad.components.core.webview.a r0 = r1.eP
            if (r0 == 0) goto La
            r0.destroy()
            r0 = 0
            r1.eP = r0
        La:
            return
    }

    static /* synthetic */ com.kwad.components.core.webview.jshandler.ba.a c(com.kwad.components.ad.nativead.e r0) {
            com.kwad.components.core.webview.jshandler.ba$a r0 = r0.iF
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
            if (r4 == 0) goto L36
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L15
            goto L36
        L15:
            java.util.List<java.lang.Integer> r4 = r2.ck
            java.util.Iterator r4 = r4.iterator()
        L1b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L36
            java.lang.Object r0 = r4.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r3 < r0) goto L1b
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            r1 = 0
            com.kwad.sdk.core.adlog.c.a(r0, r3, r1)
            r4.remove()
        L36:
            return
    }

    private boolean cH() {
            r2 = this;
            int r0 = r2.eR
            r1 = 1
            if (r0 != r1) goto L6
            return r1
        L6:
            r0 = 0
            return r0
    }

    private void cI() {
            r2 = this;
            com.kwad.components.offline.api.core.adlive.IAdLiveOfflineView r0 = r2.fq
            com.kwad.components.ad.nativead.e$6 r1 = new com.kwad.components.ad.nativead.e$6
            r1.<init>(r2)
            r0.registerLiveMessageListener(r1)
            com.kwad.components.offline.api.core.adlive.IAdLiveOfflineView r0 = r2.fq
            com.kwad.components.ad.nativead.e$7 r1 = new com.kwad.components.ad.nativead.e$7
            r1.<init>(r2)
            r0.registerLiveShopListener(r1)
            return
    }

    private com.kwad.components.offline.api.core.adlive.IAdLivePlayModule cu() {
            r10 = this;
            r10.cv()
            com.kwad.components.core.o.a.b.a r0 = r10.fr
            android.content.Context r1 = r10.mContext
            r2 = 3
            com.kwad.components.offline.api.core.adlive.IAdLiveOfflineView r4 = com.kwad.components.ad.j.c.a(r0, r1, r2)
            r10.fq = r4
            if (r4 != 0) goto L12
            r0 = 0
            return r0
        L12:
            com.kwad.components.core.o.a.b.a r3 = r10.fr
            com.kwad.sdk.api.SdkConfig r0 = com.kwad.sdk.service.ServiceProvider.getSDKConfig()
            java.lang.String r5 = r0.appId
            com.kwad.sdk.core.response.model.AdInfo r0 = r10.mAdInfo
            long r0 = com.kwad.sdk.core.response.b.a.cp(r0)
            java.lang.String r6 = java.lang.String.valueOf(r0)
            com.kwad.sdk.core.response.model.AdInfo r0 = r10.mAdInfo
            java.lang.String r7 = com.kwad.sdk.core.response.b.a.cq(r0)
            com.kwad.sdk.core.response.model.AdInfo r0 = r10.mAdInfo
            long r8 = com.kwad.sdk.core.response.b.a.cr(r0)
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r0 = r3.getAdLivePlayModule(r4, r5, r6, r7, r8)
            boolean r1 = r10.mIsAudioEnable
            boolean r1 = r10.h(r1)
            r2 = 0
            r0.setAudioEnabled(r1, r2)
            com.kwad.components.offline.api.core.adlive.listener.AdLivePlayStateListener r1 = r10.eh
            r0.registerAdLivePlayStateListener(r1)
            com.kwad.components.offline.api.core.adlive.IAdLiveOfflineView r1 = r10.fq
            android.view.View r1 = r1.getView()
            android.widget.RelativeLayout r2 = r10.pk
            r2.removeAllViews()
            android.widget.RelativeLayout r2 = r10.pk
            r2.addView(r1)
            com.kwad.components.ad.nativead.e$1 r2 = new com.kwad.components.ad.nativead.e$1
            r2.<init>(r10, r1)
            com.kwad.sdk.utils.bw.postOnUiThread(r2)
            r10.cI()
            boolean r1 = r10.mIsAudioEnable
            if (r1 == 0) goto L6d
            android.content.Context r1 = r10.mContext
            com.kwad.components.core.t.a r1 = com.kwad.components.core.t.a.aC(r1)
            com.kwad.components.offline.api.core.api.OfflineOnAudioConflictListener r2 = r10.cB
            r1.a(r2)
        L6d:
            return r0
    }

    private void cv() {
            r5 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r5.mAdInfo
            com.kwad.sdk.core.response.model.b r0 = com.kwad.sdk.core.response.b.a.bu(r0)
            java.lang.String r0 = r0.getUrl()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L38
            android.widget.ImageView r1 = r5.pj
            r2 = 0
            r1.setImageDrawable(r2)
            android.widget.ImageView r1 = r5.pj
            com.kwad.sdk.core.response.model.AdTemplate r2 = r5.mAdTemplate
            com.kwad.sdk.core.imageloader.core.DisplayImageOptionsCompat$Builder r3 = new com.kwad.sdk.core.imageloader.core.DisplayImageOptionsCompat$Builder
            r3.<init>()
            r4 = 50
            com.kwad.sdk.core.imageloader.core.DisplayImageOptionsCompat$Builder r3 = r3.setBlurRadius(r4)
            com.kwad.sdk.core.imageloader.core.DisplayImageOptionsCompat r3 = r3.build()
            com.kwad.components.ad.nativead.e$5 r4 = new com.kwad.components.ad.nativead.e$5
            r4.<init>(r5)
            com.kwad.sdk.core.imageloader.KSImageLoader.loadImage(r1, r0, r2, r3, r4)
            android.widget.ImageView r0 = r5.pj
            r1 = 0
            r0.setVisibility(r1)
            return
        L38:
            android.widget.ImageView r0 = r5.pj
            r1 = 8
            r0.setVisibility(r1)
            return
    }

    static /* synthetic */ com.kwad.components.core.webview.jshandler.ba.b d(com.kwad.components.ad.nativead.e r0) {
            com.kwad.components.core.webview.jshandler.ba$b r0 = r0.iE
            return r0
    }

    private void d(android.view.View r4) {
            r3 = this;
            com.kwad.sdk.widget.KSRelativeLayout r0 = r3.hL
            int r0 = r0.getWidth()
            com.kwad.sdk.widget.KSRelativeLayout r1 = r3.hL
            int r1 = r1.getHeight()
            if (r0 == 0) goto L25
            if (r1 != 0) goto L11
            goto L25
        L11:
            r0 = 1058013184(0x3f100000, float:0.5625)
            float r2 = (float) r1
            float r2 = r2 * r0
            int r0 = (int) r2
            android.widget.RelativeLayout$LayoutParams r2 = new android.widget.RelativeLayout$LayoutParams
            r2.<init>(r0, r1)
            r0 = 13
            r1 = -1
            r2.addRule(r0, r1)
            r4.setLayoutParams(r2)
        L25:
            return
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate e(com.kwad.components.ad.nativead.e r0) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ android.content.Context f(com.kwad.components.ad.nativead.e r0) {
            android.content.Context r0 = r0.mContext
            return r0
    }

    private void fp() {
            r2 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate     // Catch: java.lang.Throwable -> Le
            com.kwad.sdk.internal.api.SceneImpl r0 = r0.mAdScene     // Catch: java.lang.Throwable -> Le
            com.kwad.sdk.internal.api.NativeAdExtraDataImpl r0 = r0.nativeAdExtraData     // Catch: java.lang.Throwable -> Le
            int r1 = r0.showLiveStatus     // Catch: java.lang.Throwable -> Le
            r2.oS = r1     // Catch: java.lang.Throwable -> Le
            int r0 = r0.showLiveStyle     // Catch: java.lang.Throwable -> Le
            r2.oT = r0     // Catch: java.lang.Throwable -> Le
        Le:
            return
    }

    private void ft() {
            r2 = this;
            com.kwad.sdk.core.webview.KsAdWebView r0 = r2.mAdWebView
            r1 = 8
            r0.setVisibility(r1)
            r2.bc()
            boolean r0 = r2.cH()
            if (r0 == 0) goto L16
            com.kwad.sdk.core.webview.KsAdWebView r0 = r2.mAdWebView
            r0.reload()
            return
        L16:
            r2.bd()
            return
    }

    @android.annotation.SuppressLint({"SetJavaScriptEnabled", "AddJavascriptInterface", "JavascriptInterface"})
    private void fu() {
            r3 = this;
            r3.bf()
            com.kwad.sdk.core.webview.KsAdWebView r0 = r3.mAdWebView
            com.kwad.sdk.core.webview.a.c$a r0 = r0.getClientConfig()
            com.kwad.sdk.core.response.model.AdTemplate r1 = r3.mAdTemplate
            com.kwad.sdk.core.webview.a.c$a r0 = r0.eJ(r1)
            com.kwad.sdk.core.webview.KsAdWebView r1 = r3.mAdWebView
            r1.setClientConfig(r0)
            com.kwad.components.core.webview.a r0 = new com.kwad.components.core.webview.a
            com.kwad.sdk.core.webview.KsAdWebView r1 = r3.mAdWebView
            r0.<init>(r1)
            r3.eP = r0
            r3.a(r0)
            com.kwad.sdk.core.webview.KsAdWebView r0 = r3.mAdWebView
            com.kwad.components.core.webview.a r1 = r3.eP
            java.lang.String r2 = "KwaiAd"
            r0.addJavascriptInterface(r1, r2)
            com.kwad.sdk.core.webview.KsAdWebView r0 = r3.mAdWebView
            com.kwad.sdk.core.response.model.AdTemplate r1 = r3.mAdTemplate
            java.lang.String r1 = com.kwad.sdk.core.response.b.b.cV(r1)
            r0.loadUrl(r1)
            return
    }

    static /* synthetic */ int g(com.kwad.components.ad.nativead.e r0) {
            int r0 = r0.eR
            return r0
    }

    @androidx.annotation.NonNull
    private com.kwad.sdk.core.webview.d.a.a getClickListener() {
            r1 = this;
            com.kwad.components.ad.nativead.e$11 r0 = new com.kwad.components.ad.nativead.e$11
            r0.<init>(r1)
            return r0
    }

    private com.kwad.components.core.k.a.b getCurrentVoiceItem() {
            r2 = this;
            com.kwad.components.core.k.a$b r0 = r2.fD
            if (r0 != 0) goto L10
            com.kwad.components.core.k.a$b r0 = new com.kwad.components.core.k.a$b
            com.kwad.components.ad.nativead.e$4 r1 = new com.kwad.components.ad.nativead.e$4
            r1.<init>(r2)
            r0.<init>(r1)
            r2.fD = r0
        L10:
            com.kwad.components.core.k.a$b r0 = r2.fD
            return r0
    }

    private com.kwad.components.core.webview.jshandler.aq.a getOpenNewPageListener() {
            r1 = this;
            com.kwad.components.ad.nativead.e$9 r0 = new com.kwad.components.ad.nativead.e$9
            r0.<init>(r1)
            return r0
    }

    private com.kwad.components.core.webview.jshandler.ba.c getRegisterLiveListener() {
            r1 = this;
            com.kwad.components.ad.nativead.e$8 r0 = new com.kwad.components.ad.nativead.e$8
            r0.<init>(r1)
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.webview.KsAdWebView h(com.kwad.components.ad.nativead.e r0) {
            com.kwad.sdk.core.webview.KsAdWebView r0 = r0.mAdWebView
            return r0
    }

    private boolean h(boolean r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            com.kwad.components.core.k.a$b r3 = r2.fD
            if (r3 == 0) goto L14
            com.kwad.components.core.k.a.qp()
            com.kwad.components.core.k.a$b r3 = r2.fD
            boolean r3 = com.kwad.components.core.k.a.b(r3)
            if (r3 != 0) goto L14
            return r0
        L14:
            boolean r3 = com.kwad.sdk.core.config.e.hC()
            r1 = 1
            if (r3 != 0) goto L40
            android.content.Context r3 = r2.mContext
            com.kwad.components.core.t.a r3 = com.kwad.components.core.t.a.aC(r3)
            boolean r3 = r3.sX()
            if (r3 != 0) goto L32
            android.content.Context r3 = r2.mContext
            com.kwad.components.core.t.a r3 = com.kwad.components.core.t.a.aC(r3)
            boolean r3 = r3.aQ(r0)
            return r3
        L32:
            android.content.Context r3 = r2.mContext
            com.kwad.components.core.t.a r3 = com.kwad.components.core.t.a.aC(r3)
            boolean r3 = r3.sW()
            if (r3 != 0) goto L3f
            return r1
        L3f:
            return r0
        L40:
            boolean r3 = r2.cp
            if (r3 != 0) goto L50
            android.content.Context r3 = r2.mContext
            com.kwad.components.core.t.a r3 = com.kwad.components.core.t.a.aC(r3)
            boolean r3 = r3.aQ(r1)
            r2.cp = r3
        L50:
            boolean r3 = r2.cp
            return r3
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdInfo i(com.kwad.components.ad.nativead.e r0) {
            com.kwad.sdk.core.response.model.AdInfo r0 = r0.mAdInfo
            return r0
    }

    private void initView() {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            int r1 = com.kwad.sdk.R.layout.ksad_native_live_layout
            com.kwad.sdk.o.m.inflate(r0, r1, r2)
            int r0 = com.kwad.sdk.R.id.ksad_root_container
            android.view.View r0 = r2.findViewById(r0)
            com.kwad.sdk.core.view.AdBasePvFrameLayout r0 = (com.kwad.sdk.core.view.AdBasePvFrameLayout) r0
            r2.pl = r0
            int r1 = com.kwad.sdk.R.id.ksad_live_bg_img
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r2.pj = r0
            com.kwad.sdk.core.view.AdBasePvFrameLayout r0 = r2.pl
            int r1 = com.kwad.sdk.R.id.ksad_live_container
            android.view.View r0 = r0.findViewById(r1)
            com.kwad.sdk.widget.KSRelativeLayout r0 = (com.kwad.sdk.widget.KSRelativeLayout) r0
            r2.hL = r0
            com.kwad.sdk.core.view.AdBasePvFrameLayout r0 = r2.pl
            int r1 = com.kwad.sdk.R.id.ksad_live_video_container
            android.view.View r0 = r0.findViewById(r1)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r2.pk = r0
            com.kwad.sdk.core.view.AdBasePvFrameLayout r0 = r2.pl
            int r1 = com.kwad.sdk.R.id.ksad_web_card_webView
            android.view.View r0 = r0.findViewById(r1)
            com.kwad.sdk.core.webview.KsAdWebView r0 = (com.kwad.sdk.core.webview.KsAdWebView) r0
            r2.mAdWebView = r0
            r1 = 0
            r0.setBackgroundColor(r1)
            java.lang.Class<com.kwad.components.core.o.a.b.a> r0 = com.kwad.components.core.o.a.b.a.class
            com.kwad.sdk.components.b r0 = com.kwad.sdk.components.d.f(r0)
            com.kwad.components.core.o.a.b.a r0 = (com.kwad.components.core.o.a.b.a) r0
            r2.fr = r0
            return
    }

    static /* synthetic */ com.kwad.components.ad.nativead.d.a j(com.kwad.components.ad.nativead.e r0) {
            com.kwad.components.ad.nativead.d$a r0 = r0.oW
            return r0
    }

    static /* synthetic */ com.kwad.components.core.e.d.c k(com.kwad.components.ad.nativead.e r0) {
            com.kwad.components.core.e.d.c r0 = r0.mApkDownloadHelper
            return r0
    }

    static /* synthetic */ com.kwad.components.offline.api.core.adlive.IAdLiveEndRequest l(com.kwad.components.ad.nativead.e r0) {
            com.kwad.components.offline.api.core.adlive.IAdLiveEndRequest r0 = r0.iS
            return r0
    }

    static /* synthetic */ com.kwad.sdk.api.KsNativeAd.VideoPlayListener m(com.kwad.components.ad.nativead.e r0) {
            com.kwad.sdk.api.KsNativeAd$VideoPlayListener r0 = r0.oQ
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.network.l n(com.kwad.components.ad.nativead.e r0) {
            com.kwad.sdk.core.network.l<com.kwad.components.core.liveEnd.a, com.kwad.components.core.liveEnd.AdLiveEndCommonResultData> r0 = r0.mNetworking
            return r0
    }

    static /* synthetic */ com.kwad.components.core.k.a.b o(com.kwad.components.ad.nativead.e r0) {
            com.kwad.components.core.k.a$b r0 = r0.getCurrentVoiceItem()
            return r0
    }

    static /* synthetic */ boolean p(com.kwad.components.ad.nativead.e r0) {
            boolean r0 = r0.mIsAudioEnable
            return r0
    }

    static /* synthetic */ com.kwad.components.offline.api.core.adlive.IAdLivePlayModule q(com.kwad.components.ad.nativead.e r0) {
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r0 = r0.cu()
            return r0
    }

    public final void a(android.content.Context r1, com.kwad.sdk.core.response.model.AdTemplate r2, @androidx.annotation.Nullable com.kwad.components.core.e.d.c r3, @androidx.annotation.NonNull com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl r4) {
            r0 = this;
            r0.mAdTemplate = r2
            com.kwad.sdk.core.response.model.AdInfo r2 = com.kwad.sdk.core.response.b.e.el(r2)
            r0.mAdInfo = r2
            r0.mContext = r1
            r0.pm = r4
            r0.mApkDownloadHelper = r3
            java.util.List r1 = com.kwad.sdk.core.response.b.a.bp(r2)
            r0.ck = r1
            android.view.ViewParent r1 = r0.getParent()
            if (r1 != 0) goto L1c
            r1 = r0
            goto L22
        L1c:
            android.view.ViewParent r1 = r0.getParent()
            android.view.View r1 = (android.view.View) r1
        L22:
            com.kwad.components.core.widget.a.b r2 = new com.kwad.components.core.widget.a.b
            r3 = 30
            r2.<init>(r1, r3)
            r0.fg = r2
            com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl r1 = r0.pm
            int r1 = r1.getVideoSoundValue()
            if (r1 == 0) goto L3c
            com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl r1 = r0.pm
            boolean r1 = r1.isVideoSoundEnable()
            r0.mIsAudioEnable = r1
            goto L44
        L3c:
            com.kwad.sdk.core.response.model.AdInfo r1 = r0.mAdInfo
            boolean r1 = com.kwad.sdk.core.response.b.a.ca(r1)
            r0.mIsAudioEnable = r1
        L44:
            r0.fp()
            r0.ft()
            return
    }

    @Override // com.kwad.sdk.widget.KSRelativeLayout
    public final void aa() {
            r1 = this;
            super.aa()
            com.kwad.components.core.widget.a.b r0 = r1.fg
            r0.wi()
            com.kwad.components.core.widget.a.b r0 = r1.fg
            r0.a(r1)
            return
    }

    @Override // com.kwad.sdk.widget.KSRelativeLayout
    public final void ab() {
            r3 = this;
            super.ab()
            com.kwad.components.core.widget.a.b r0 = r3.fg
            r0.wi()
            com.kwad.components.core.widget.a.b r0 = r3.fg
            r0.b(r3)
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r0 = r3.hR
            r1 = 0
            if (r0 == 0) goto L17
            r0.onDestroy()
            r3.hR = r1
        L17:
            com.kwad.components.core.k.a r0 = com.kwad.components.core.k.a.qp()
            com.kwad.components.core.k.a$b r2 = r3.fD
            r0.c(r2)
            r3.iF = r1
            r3.iE = r1
            com.kwad.components.offline.api.core.adlive.IAdLiveOfflineView r0 = r3.fq
            if (r0 == 0) goto L2d
            r0.onDestroy()
            r3.fq = r1
        L2d:
            return
    }

    @Override // com.kwad.sdk.core.j.c
    public final void bt() {
            r2 = this;
            com.kwad.components.core.k.a r0 = com.kwad.components.core.k.a.qp()
            com.kwad.components.core.k.a$b r1 = r2.getCurrentVoiceItem()
            r0.a(r1)
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r0 = r2.hR
            if (r0 != 0) goto L16
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r0 = r2.cu()
            r2.hR = r0
            return
        L16:
            r0.onResume()
            return
    }

    @Override // com.kwad.sdk.core.j.c
    public final void bu() {
            r2 = this;
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r0 = r2.hR
            if (r0 == 0) goto L7
            r0.onPause()
        L7:
            com.kwad.components.core.k.a r0 = com.kwad.components.core.k.a.qp()
            com.kwad.components.core.k.a$b r1 = r2.fD
            r0.c(r1)
            return
    }

    public final void setInnerAdInteractionListener(com.kwad.components.ad.nativead.d.a r1) {
            r0 = this;
            r0.oW = r1
            return
    }

    public final void setVideoPlayListener(com.kwad.sdk.api.KsNativeAd.VideoPlayListener r1) {
            r0 = this;
            r0.oQ = r1
            return
    }
}
