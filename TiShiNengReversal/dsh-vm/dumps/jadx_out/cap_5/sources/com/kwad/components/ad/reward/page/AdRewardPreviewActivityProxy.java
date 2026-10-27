package com.kwad.components.ad.reward.page;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.kwad.sdk.api.core.KsAdSdkDynamicImpl(com.kwad.sdk.api.proxy.app.AdWebViewActivity.class)
@androidx.annotation.Keep
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class AdRewardPreviewActivityProxy extends com.kwad.components.core.proxy.f implements com.kwad.components.ad.reward.widget.HandSlideView.a {
    public static final java.lang.String KEY_TEMPLATE = "key_template_json";
    private static final java.lang.String KEY_URL = "key_langingpage_url";
    private static final java.lang.String TAG = "AdRewardPreviewActivityProxy";
    public static com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener mInteractionListener;
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;
    private com.kwad.sdk.core.webview.KsAdWebView mAdWebView;
    private boolean mCheckExposureResult;
    public com.kwad.components.ad.reward.h mCloseDialog;
    private int mCount;
    private com.kwad.components.core.t.h mCountdownHelper;
    private long mCurrentDuration;
    private boolean mHadAdClicked;
    private android.view.View mHandSlideContainer;

    @androidx.annotation.Nullable
    private com.kwad.components.ad.reward.widget.HandSlideView mHandSlideView;
    private long mLastDown;
    protected com.kwad.components.core.widget.KsLogoView mLogoView;
    private long mPageEnterTime;
    private boolean mReportedPageShow;
    private int mSkipCount;
    private long mStartPlayTime;
    private com.kwad.sdk.utils.bv mTimerHelper;
    private com.kwad.components.ad.reward.widget.RewardPreviewTopBarView mTopBarView;
    private java.lang.String mUrl;
    private com.kwad.sdk.core.view.AdBaseFrameLayout mWebContainer;









    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        public static void a(com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener r0, long r1) {
                if (r0 == 0) goto La
                r0.onVideoSkipToEnd(r1)     // Catch: java.lang.Throwable -> L6
                return
            L6:
                r0 = move-exception
                com.kwad.sdk.core.d.c.printStackTraceOnly(r0)
            La:
                return
        }

        public static void c(com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener r1) {
                if (r1 == 0) goto Le
                r1.onRewardVerify()
                r0 = 0
                r1.onRewardStepVerify(r0, r0)     // Catch: java.lang.Throwable -> La
                return
            La:
                r1 = move-exception
                com.kwad.sdk.core.d.c.printStackTraceOnly(r1)
            Le:
                return
        }

        public static void d(com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener r0) {
                if (r0 == 0) goto La
                r0.onVideoPlayEnd()     // Catch: java.lang.Throwable -> L6
                return
            L6:
                r0 = move-exception
                com.kwad.sdk.core.d.c.printStackTraceOnly(r0)
            La:
                return
        }

        public static void e(com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener r0) {
                if (r0 == 0) goto La
                r0.onPageDismiss()     // Catch: java.lang.Throwable -> L6
                return
            L6:
                r0 = move-exception
                com.kwad.sdk.core.d.c.printStackTraceOnly(r0)
            La:
                return
        }

        public static void f(com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener r0) {
                if (r0 == 0) goto La
                r0.onAdClicked()     // Catch: java.lang.Throwable -> L6
                return
            L6:
                r0 = move-exception
                com.kwad.sdk.core.d.c.printStackTraceOnly(r0)
            La:
                return
        }
    }

    public AdRewardPreviewActivityProxy() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.mHadAdClicked = r0
            r1 = 1
            r3.mCheckExposureResult = r1
            r1 = 0
            r3.mPageEnterTime = r1
            r3.mReportedPageShow = r0
            return
    }

    static /* synthetic */ long access$000(com.kwad.components.ad.reward.page.AdRewardPreviewActivityProxy r2) {
            long r0 = r2.mLastDown
            return r0
    }

    static /* synthetic */ long access$002(com.kwad.components.ad.reward.page.AdRewardPreviewActivityProxy r0, long r1) {
            r0.mLastDown = r1
            return r1
    }

    static /* synthetic */ void access$100(com.kwad.components.ad.reward.page.AdRewardPreviewActivityProxy r0) {
            r0.handleAdClick()
            return
    }

    static /* synthetic */ long access$1000(com.kwad.components.ad.reward.page.AdRewardPreviewActivityProxy r2) {
            long r0 = r2.mPageEnterTime
            return r0
    }

    static /* synthetic */ void access$1100(com.kwad.components.ad.reward.page.AdRewardPreviewActivityProxy r0, int r1) {
            r0.checkRequest(r1)
            return
    }

    static /* synthetic */ boolean access$1202(com.kwad.components.ad.reward.page.AdRewardPreviewActivityProxy r0, boolean r1) {
            r0.mCheckExposureResult = r1
            return r1
    }

    static /* synthetic */ com.kwad.components.core.t.h access$1300(com.kwad.components.ad.reward.page.AdRewardPreviewActivityProxy r0) {
            com.kwad.components.core.t.h r0 = r0.mCountdownHelper
            return r0
    }

    static /* synthetic */ long access$1400(com.kwad.components.ad.reward.page.AdRewardPreviewActivityProxy r2) {
            long r0 = r2.mStartPlayTime
            return r0
    }

    static /* synthetic */ long access$202(com.kwad.components.ad.reward.page.AdRewardPreviewActivityProxy r0, long r1) {
            r0.mCurrentDuration = r1
            return r1
    }

    static /* synthetic */ com.kwad.components.ad.reward.widget.RewardPreviewTopBarView access$300(com.kwad.components.ad.reward.page.AdRewardPreviewActivityProxy r0) {
            com.kwad.components.ad.reward.widget.RewardPreviewTopBarView r0 = r0.mTopBarView
            return r0
    }

    static /* synthetic */ void access$400(com.kwad.components.ad.reward.page.AdRewardPreviewActivityProxy r0) {
            r0.handleEndClose()
            return
    }

    static /* synthetic */ void access$500(com.kwad.components.ad.reward.page.AdRewardPreviewActivityProxy r0) {
            r0.showCloseDialog()
            return
    }

    static /* synthetic */ void access$600(com.kwad.components.ad.reward.page.AdRewardPreviewActivityProxy r0) {
            r0.handleCountdownEnd()
            return
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate access$700(com.kwad.components.ad.reward.page.AdRewardPreviewActivityProxy r0) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ boolean access$800(com.kwad.components.ad.reward.page.AdRewardPreviewActivityProxy r0) {
            boolean r0 = r0.mHadAdClicked
            return r0
    }

    static /* synthetic */ void access$900(com.kwad.components.ad.reward.page.AdRewardPreviewActivityProxy r0) {
            r0.showHandSlideMask()
            return
    }

    private void checkRequest(int r2) {
            r1 = this;
            com.kwad.components.ad.reward.page.AdRewardPreviewActivityProxy$6 r0 = new com.kwad.components.ad.reward.page.AdRewardPreviewActivityProxy$6
            r0.<init>(r1, r2)
            com.kwad.sdk.core.network.o r2 = r1.exposureRequest()
            r0.request(r2)
            return
    }

    private void closeHandSlideMask() {
            r2 = this;
            com.kwad.components.ad.reward.widget.HandSlideView r0 = r2.mHandSlideView
            if (r0 == 0) goto La
            r0.destroy()
            r0 = 0
            r2.mHandSlideView = r0
        La:
            android.view.View r0 = r2.mHandSlideContainer
            if (r0 == 0) goto L13
            r1 = 8
            r0.setVisibility(r1)
        L13:
            return
    }

    private com.kwad.sdk.core.network.o<com.kwad.components.core.request.f, com.kwad.components.ad.reward.model.RewardCallBackRespInfo> exposureRequest() {
            r1 = this;
            com.kwad.components.ad.reward.page.AdRewardPreviewActivityProxy$7 r0 = new com.kwad.components.ad.reward.page.AdRewardPreviewActivityProxy$7
            r0.<init>(r1)
            return r0
    }

    private com.kwad.sdk.core.webview.KsAdWebView.e getWebErrorListener() {
            r1 = this;
            com.kwad.components.ad.reward.page.AdRewardPreviewActivityProxy$4 r0 = new com.kwad.components.ad.reward.page.AdRewardPreviewActivityProxy$4
            r0.<init>(r1)
            return r0
    }

    private void handleAdClick() {
            r4 = this;
            r0 = 1
            r4.mHadAdClicked = r0
            com.kwad.sdk.core.adlog.a$a r0 = new com.kwad.sdk.core.adlog.a$a
            r0.<init>()
            java.lang.String r1 = "award_view"
            r0.awY = r1
            com.kwad.sdk.core.adlog.c.b r1 = new com.kwad.sdk.core.adlog.c.b
            r1.<init>()
            r2 = 72
            com.kwad.sdk.core.adlog.c.b r1 = r1.dd(r2)
            com.kwad.sdk.core.adlog.c.b r0 = r1.b(r0)
            com.kwad.sdk.core.view.AdBaseFrameLayout r1 = r4.mWebContainer
            com.kwad.sdk.utils.aj$a r1 = r1.getTouchCoords()
            com.kwad.sdk.core.adlog.c.b r0 = r0.f(r1)
            com.kwad.sdk.core.response.model.AdTemplate r1 = r4.mAdTemplate
            r2 = 0
            java.lang.String r3 = "nativePreview"
            com.kwad.components.ad.reward.j.b.a(r1, r2, r3, r0, r2)
            r4.closeHandSlideMask()
            com.kwad.sdk.api.KsRewardVideoAd$RewardAdInteractionListener r0 = com.kwad.components.ad.reward.page.AdRewardPreviewActivityProxy.mInteractionListener
            com.kwad.components.ad.reward.page.AdRewardPreviewActivityProxy.a.f(r0)
            return
    }

    private void handleCountdownEnd() {
            r1 = this;
            boolean r0 = r1.mCheckExposureResult
            if (r0 == 0) goto L9
            com.kwad.sdk.api.KsRewardVideoAd$RewardAdInteractionListener r0 = com.kwad.components.ad.reward.page.AdRewardPreviewActivityProxy.mInteractionListener
            com.kwad.components.ad.reward.page.AdRewardPreviewActivityProxy.a.c(r0)
        L9:
            return
    }

    private void handleEndClose() {
            r5 = this;
            com.kwad.sdk.api.KsRewardVideoAd$RewardAdInteractionListener r0 = com.kwad.components.ad.reward.page.AdRewardPreviewActivityProxy.mInteractionListener
            com.kwad.components.ad.reward.page.AdRewardPreviewActivityProxy.a.d(r0)
            com.kwad.sdk.core.response.model.AdTemplate r0 = r5.mAdTemplate
            com.kwad.sdk.utils.bv r1 = r5.getTimerHelper()
            long r1 = r1.getTime()
            r3 = 0
            r4 = 1
            com.kwad.sdk.core.adlog.c.a(r0, r4, r1, r3)
            r5.finish()
            return
    }

    public static void launch(android.app.Activity r3, com.kwad.sdk.core.response.model.AdResultData r4, com.kwad.sdk.core.response.model.AdTemplate r5, java.lang.String r6, com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener r7) {
            r0 = 1
            com.kwad.components.ad.reward.monitor.c.i(r0, r5)
            boolean r1 = com.kwad.sdk.core.config.e.Gg()
            com.kwad.components.ad.reward.page.AdRewardPreviewActivityProxy.mInteractionListener = r7
            java.lang.Class<com.kwad.components.ad.reward.page.AdRewardPreviewActivityProxy> r7 = com.kwad.components.ad.reward.page.AdRewardPreviewActivityProxy.class
            java.lang.Class<com.kwad.sdk.api.proxy.app.AdWebViewActivity> r2 = com.kwad.sdk.api.proxy.app.AdWebViewActivity.class
            com.kwad.sdk.service.c.a(r2, r7)
            android.content.Intent r7 = new android.content.Intent
            r7.<init>(r3, r2)
            r2 = 268435456(0x10000000, float:2.524355E-29)
            r7.addFlags(r2)
            java.lang.String r2 = "key_langingpage_url"
            r7.putExtra(r2, r6)
            if (r1 == 0) goto L30
            com.kwad.components.core.c.f r6 = com.kwad.components.core.c.f.ol()
            int r4 = r6.l(r4)
            java.lang.String r6 = "key_ad_result_cache_idx"
            r7.putExtra(r6, r4)
            goto L3d
        L30:
            org.json.JSONObject r4 = r5.toJson()
            java.lang.String r4 = r4.toString()
            java.lang.String r6 = "key_template_json"
            r7.putExtra(r6, r4)
        L3d:
            r3.startActivity(r7)     // Catch: java.lang.Exception -> L47
            if (r1 != 0) goto L58
            r4 = 0
            r3.overridePendingTransition(r4, r4)     // Catch: java.lang.Exception -> L47
            goto L58
        L47:
            r3 = move-exception
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r3)
            java.lang.String r3 = r3.getMessage()
            com.kwad.components.core.proxy.PageCreateStage r4 = com.kwad.components.core.proxy.PageCreateStage.ERROR_START_ACTIVITY
            java.lang.String r4 = r4.getStage()
            com.kwad.components.ad.reward.monitor.c.a(r0, r5, r4, r3)
        L58:
            com.kwad.components.core.proxy.PageCreateStage r3 = com.kwad.components.core.proxy.PageCreateStage.END_LAUNCH
            java.lang.String r3 = r3.getStage()
            com.kwad.components.ad.reward.monitor.c.c(r0, r5, r3)
            return
    }

    private void reportSubPageCreate(java.lang.String r3) {
            r2 = this;
            r0 = 1
            com.kwad.sdk.core.response.model.AdTemplate r1 = r2.mAdTemplate
            com.kwad.components.ad.reward.monitor.c.c(r0, r1, r3)
            return
    }

    private void showCloseDialog() {
            r4 = this;
            com.kwad.components.ad.reward.h r0 = r4.mCloseDialog
            if (r0 == 0) goto Lb
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto Lb
            return
        Lb:
            long r0 = r4.mCurrentDuration
            float r0 = (float) r0
            r1 = 1148846080(0x447a0000, float:1000.0)
            float r0 = r0 / r1
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            int r0 = (int) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "还差"
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r2 = "秒就可以获取奖励"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.kwad.components.ad.reward.h$c r0 = com.kwad.components.ad.reward.h.g(r1, r0)
            android.app.Activity r1 = r4.getActivity()
            com.kwad.sdk.core.response.model.AdTemplate r2 = r4.mAdTemplate
            com.kwad.components.ad.reward.page.AdRewardPreviewActivityProxy$8 r3 = new com.kwad.components.ad.reward.page.AdRewardPreviewActivityProxy$8
            r3.<init>(r4)
            com.kwad.components.ad.reward.h r0 = com.kwad.components.ad.reward.h.a(r1, r2, r0, r3)
            r4.mCloseDialog = r0
            return
    }

    private void showHandSlideMask() {
            r2 = this;
            com.kwad.components.ad.reward.widget.HandSlideView r0 = r2.mHandSlideView
            if (r0 != 0) goto L5
            goto Lb
        L5:
            boolean r0 = r0.isStarted()
            if (r0 == 0) goto Lc
        Lb:
            return
        Lc:
            android.view.View r0 = r2.mHandSlideContainer
            r1 = 0
            r0.setVisibility(r1)
            com.kwad.components.ad.reward.widget.HandSlideView r0 = r2.mHandSlideView
            r0.a(r2)
            return
    }

    public void checkExposure() {
            r7 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r7.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            com.kwad.sdk.core.response.model.AdInfo$AdRewardInfo r0 = r0.adRewardInfo
            com.kwad.sdk.core.response.model.AdInfo$CallBackStrategyInfo r0 = r0.callBackStrategyInfo
            int r0 = r0.impressionCheckMs
            long r0 = (long) r0
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L2b
            com.kwad.sdk.core.response.model.AdTemplate r2 = r7.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r2 = com.kwad.sdk.core.response.b.e.el(r2)
            long r2 = com.kwad.sdk.core.response.b.a.ag(r2)
            r4 = 5000(0x1388, double:2.4703E-320)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L2b
            com.kwad.components.ad.reward.page.AdRewardPreviewActivityProxy$5 r2 = new com.kwad.components.ad.reward.page.AdRewardPreviewActivityProxy$5
            r2.<init>(r7)
            com.kwad.sdk.utils.bw.runOnUiThreadDelay(r2, r0)
        L2b:
            return
    }

    @Override // com.kwad.components.core.proxy.f
    public boolean checkIntentData(@androidx.annotation.Nullable android.content.Intent r5) {
            r4 = this;
            java.lang.String r0 = "key_ad_result_cache_idx"
            r1 = 1
            r2 = 0
            if (r5 == 0) goto L21
            boolean r3 = r5.hasExtra(r0)     // Catch: java.lang.Throwable -> L1f
            if (r3 == 0) goto L21
            int r5 = r5.getIntExtra(r0, r2)     // Catch: java.lang.Throwable -> L1f
            com.kwad.components.core.c.f r0 = com.kwad.components.core.c.f.ol()     // Catch: java.lang.Throwable -> L1f
            com.kwad.sdk.core.response.model.AdResultData r5 = r0.d(r5, r1)     // Catch: java.lang.Throwable -> L1f
            com.kwad.sdk.core.response.model.AdTemplate r5 = r5.getFirstAdTemplate()     // Catch: java.lang.Throwable -> L1f
            r4.mAdTemplate = r5     // Catch: java.lang.Throwable -> L1f
            goto L3e
        L1f:
            r5 = move-exception
            goto L3b
        L21:
            android.content.Intent r5 = r4.getIntent()     // Catch: java.lang.Throwable -> L1f
            java.lang.String r0 = "key_template_json"
            java.lang.String r5 = r5.getStringExtra(r0)     // Catch: java.lang.Throwable -> L1f
            com.kwad.sdk.core.response.model.AdTemplate r0 = new com.kwad.sdk.core.response.model.AdTemplate     // Catch: java.lang.Throwable -> L1f
            r0.<init>()     // Catch: java.lang.Throwable -> L1f
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1f
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L1f
            r0.parseJson(r3)     // Catch: java.lang.Throwable -> L1f
            r4.mAdTemplate = r0     // Catch: java.lang.Throwable -> L1f
            goto L3e
        L3b:
            com.kwad.sdk.core.d.c.printStackTrace(r5)
        L3e:
            com.kwad.sdk.core.response.model.AdTemplate r5 = r4.mAdTemplate
            if (r5 != 0) goto L43
            return r2
        L43:
            return r1
    }

    @Override // com.kwad.components.core.proxy.f
    public int getLayoutId() {
            r1 = this;
            int r0 = com.kwad.sdk.R.layout.ksad_activity_reward_preview
            return r0
    }

    @Override // com.kwad.components.core.proxy.f
    public java.lang.String getPageName() {
            r1 = this;
            java.lang.String r0 = "AdRewardPreviewActivityProxy"
            return r0
    }

    public com.kwad.sdk.utils.bv getTimerHelper() {
            r1 = this;
            com.kwad.sdk.utils.bv r0 = r1.mTimerHelper
            if (r0 != 0) goto Lb
            com.kwad.sdk.utils.bv r0 = new com.kwad.sdk.utils.bv
            r0.<init>()
            r1.mTimerHelper = r0
        Lb:
            com.kwad.sdk.utils.bv r0 = r1.mTimerHelper
            return r0
    }

    @Override // com.kwad.components.core.proxy.f
    public void initData() {
            r2 = this;
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r1 = "key_langingpage_url"
            java.lang.String r0 = r0.getStringExtra(r1)
            r2.mUrl = r0
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            com.kwad.sdk.core.response.model.AdStyleInfo r1 = r0.adStyleInfo
            com.kwad.sdk.core.response.model.AdStyleInfo$AdBrowseInfo r1 = r1.adBrowseInfo
            int r1 = r1.adBrowseDuration
            int r0 = com.kwad.sdk.core.response.b.a.ae(r0)
            r2.mCount = r1
            int r0 = java.lang.Math.min(r0, r1)
            r2.mSkipCount = r0
            long r0 = java.lang.System.currentTimeMillis()
            r2.mStartPlayTime = r0
            com.kwad.sdk.api.KsRewardVideoAd$RewardAdInteractionListener r0 = com.kwad.components.ad.reward.page.AdRewardPreviewActivityProxy.mInteractionListener
            if (r0 == 0) goto L36
            r0.onVideoPlayStart()     // Catch: java.lang.Throwable -> L32
            return
        L32:
            r0 = move-exception
            com.kwad.sdk.core.d.c.printStackTraceOnly(r0)
        L36:
            return
    }

    @Override // com.kwad.components.core.proxy.f
    @android.annotation.SuppressLint({"SetTextI18n"})
    public void initView() {
            r6 = this;
            int r0 = com.kwad.sdk.R.id.ksad_video_webview
            android.view.View r0 = r6.findViewById(r0)
            com.kwad.sdk.core.webview.KsAdWebView r0 = (com.kwad.sdk.core.webview.KsAdWebView) r0
            r6.mAdWebView = r0
            com.kwad.sdk.core.webview.a.c$a r0 = r0.getClientConfig()
            com.kwad.sdk.core.response.model.AdTemplate r1 = r6.mAdTemplate
            com.kwad.sdk.core.webview.a.c$a r0 = r0.eJ(r1)
            r1 = 1
            com.kwad.sdk.core.webview.a.c$a r0 = r0.bB(r1)
            com.kwad.sdk.core.webview.a.c$a r0 = r0.bD(r1)
            com.kwad.sdk.core.webview.a.c$a r0 = r0.bz(r1)
            com.kwad.sdk.core.webview.KsAdWebView$e r1 = r6.getWebErrorListener()
            com.kwad.sdk.core.webview.a.c$a r0 = r0.b(r1)
            com.kwad.sdk.core.webview.KsAdWebView r1 = r6.mAdWebView
            r1.setClientConfig(r0)
            com.kwad.sdk.core.webview.KsAdWebView r0 = r6.mAdWebView
            r0.onActivityCreate()
            int r0 = com.kwad.sdk.R.id.ksad_preview_webview_container
            android.view.View r0 = r6.findViewById(r0)
            com.kwad.sdk.core.view.AdBaseFrameLayout r0 = (com.kwad.sdk.core.view.AdBaseFrameLayout) r0
            r6.mWebContainer = r0
            int r0 = com.kwad.sdk.R.id.ksad_reward_preview_logo
            android.view.View r0 = r6.findViewById(r0)
            com.kwad.components.core.widget.KsLogoView r0 = (com.kwad.components.core.widget.KsLogoView) r0
            r6.mLogoView = r0
            com.kwad.sdk.core.response.model.AdTemplate r1 = r6.mAdTemplate
            r0.aP(r1)
            int r0 = com.kwad.sdk.R.id.ksad_reward_preview_hand_slide_container
            android.view.View r0 = r6.findViewById(r0)
            r6.mHandSlideContainer = r0
            com.kwad.sdk.core.response.model.AdTemplate r0 = r6.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            java.lang.String r1 = r6.mUrl
            if (r1 == 0) goto L9a
            com.kwad.components.core.e.d.c r1 = new com.kwad.components.core.e.d.c
            com.kwad.sdk.core.response.model.AdTemplate r2 = r6.mAdTemplate
            r1.<init>(r2)
            boolean r2 = com.kwad.sdk.core.response.b.a.aF(r0)
            if (r2 == 0) goto L9a
            boolean r2 = com.kwad.sdk.core.config.e.Fm()
            if (r2 == 0) goto L9a
            android.app.Activity r2 = r6.getActivity()
            boolean r2 = com.kwad.sdk.utils.ao.isWifiConnected(r2)
            if (r2 == 0) goto L9a
            com.kwad.components.core.e.d.a$a r2 = new com.kwad.components.core.e.d.a$a
            android.app.Activity r3 = r6.getActivity()
            r2.<init>(r3)
            r3 = 0
            com.kwad.components.core.e.d.a$a r2 = r2.aq(r3)
            com.kwad.components.core.e.d.a$a r2 = r2.ar(r3)
            com.kwad.sdk.core.response.model.AdTemplate r4 = r6.mAdTemplate
            com.kwad.components.core.e.d.a$a r2 = r2.aB(r4)
            com.kwad.components.core.e.d.a$a r2 = r2.at(r3)
            r1.r(r2)
        L9a:
            java.lang.String r1 = r6.mUrl
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto La5
            java.lang.String r1 = r6.mUrl
            goto Laf
        La5:
            com.kwad.sdk.core.response.model.AdTemplate r1 = r6.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r1 = com.kwad.sdk.core.response.b.e.el(r1)
            java.lang.String r1 = com.kwad.sdk.core.response.b.a.aS(r1)
        Laf:
            com.kwad.sdk.core.webview.KsAdWebView r2 = r6.mAdWebView
            r2.loadUrl(r1)
            com.kwad.sdk.utils.bv r1 = r6.getTimerHelper()
            r1.startTiming()
            com.kwad.sdk.core.view.AdBaseFrameLayout r1 = r6.mWebContainer
            com.kwad.components.ad.reward.page.AdRewardPreviewActivityProxy$1 r2 = new com.kwad.components.ad.reward.page.AdRewardPreviewActivityProxy$1
            r2.<init>(r6)
            r1.a(r2)
            int r1 = com.kwad.sdk.R.id.ksad_reward_preview_hand_slide
            android.view.View r1 = r6.findViewById(r1)
            com.kwad.components.ad.reward.widget.HandSlideView r1 = (com.kwad.components.ad.reward.widget.HandSlideView) r1
            r6.mHandSlideView = r1
            com.kwad.components.core.t.h r1 = new com.kwad.components.core.t.h
            int r2 = r6.mCount
            long r2 = (long) r2
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            r1.<init>(r2)
            r6.mCountdownHelper = r1
            com.kwad.components.ad.reward.page.AdRewardPreviewActivityProxy$2 r2 = new com.kwad.components.ad.reward.page.AdRewardPreviewActivityProxy$2
            r2.<init>(r6)
            r1.a(r2)
            com.kwad.components.core.t.h r1 = r6.mCountdownHelper
            r1.start()
            int r1 = com.kwad.sdk.R.id.ksad_reward_preview_topbar
            android.view.View r1 = r6.findViewById(r1)
            com.kwad.components.ad.reward.widget.RewardPreviewTopBarView r1 = (com.kwad.components.ad.reward.widget.RewardPreviewTopBarView) r1
            r6.mTopBarView = r1
            int r2 = r6.mCount
            int r2 = r2 * 1000
            long r2 = (long) r2
            r1.setTotalCountDuration(r2)
            com.kwad.components.ad.reward.widget.RewardPreviewTopBarView r1 = r6.mTopBarView
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.cg(r0)
            r1.setRewardTips(r0)
            com.kwad.components.ad.reward.widget.RewardPreviewTopBarView r0 = r6.mTopBarView
            int r1 = r6.mSkipCount
            int r1 = r1 * 1000
            long r1 = (long) r1
            r0.setCloseBtnDelayShowDuration(r1)
            com.kwad.components.ad.reward.widget.RewardPreviewTopBarView r0 = r6.mTopBarView
            com.kwad.components.ad.reward.page.AdRewardPreviewActivityProxy$3 r1 = new com.kwad.components.ad.reward.page.AdRewardPreviewActivityProxy$3
            r1.<init>(r6)
            r0.setTopBarListener(r1)
            return
    }

    @Override // com.kwad.components.core.proxy.f
    public void onActivityCreate() {
            r1 = this;
            super.onActivityCreate()
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            com.kwad.sdk.commercial.d.c.bL(r0)
            return
    }

    @Override // com.kwad.components.core.proxy.f, com.kwad.sdk.api.proxy.IActivityProxy
    public void onBackPressed() {
            r5 = this;
            com.kwad.sdk.core.webview.KsAdWebView r0 = r5.mAdWebView     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L17
            boolean r0 = r0.canGoBack()     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L17
            com.kwad.sdk.core.webview.KsAdWebView r0 = r5.mAdWebView     // Catch: java.lang.Throwable -> L15
            r0.goBack()     // Catch: java.lang.Throwable -> L15
            com.kwad.sdk.core.response.model.AdTemplate r0 = r5.mAdTemplate     // Catch: java.lang.Throwable -> L15
            com.kwad.sdk.core.adlog.c.bZ(r0)     // Catch: java.lang.Throwable -> L15
            return
        L15:
            r0 = move-exception
            goto L3e
        L17:
            com.kwad.components.ad.reward.widget.RewardPreviewTopBarView r0 = r5.mTopBarView     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L3a
            boolean r0 = r0.ln()     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L3a
            super.onBackPressed()     // Catch: java.lang.Throwable -> L15
            com.kwad.sdk.api.KsRewardVideoAd$RewardAdInteractionListener r0 = com.kwad.components.ad.reward.page.AdRewardPreviewActivityProxy.mInteractionListener     // Catch: java.lang.Throwable -> L15
            com.kwad.components.ad.reward.page.AdRewardPreviewActivityProxy.a.d(r0)     // Catch: java.lang.Throwable -> L15
            com.kwad.sdk.core.response.model.AdTemplate r0 = r5.mAdTemplate     // Catch: java.lang.Throwable -> L15
            com.kwad.sdk.utils.bv r1 = r5.getTimerHelper()     // Catch: java.lang.Throwable -> L15
            long r1 = r1.getTime()     // Catch: java.lang.Throwable -> L15
            r3 = 0
            r4 = 11
            com.kwad.sdk.core.adlog.c.a(r0, r4, r1, r3)     // Catch: java.lang.Throwable -> L15
            return
        L3a:
            r5.showCloseDialog()     // Catch: java.lang.Throwable -> L15
            return
        L3e:
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r0)
            return
    }

    @Override // com.kwad.components.core.proxy.f, com.kwad.sdk.api.proxy.IActivityProxy
    public void onCreate(@androidx.annotation.Nullable android.os.Bundle r4) {
            r3 = this;
            super.onCreate(r4)     // Catch: java.lang.Throwable -> L10
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L10
            r3.mPageEnterTime = r0     // Catch: java.lang.Throwable -> L10
            com.kwad.sdk.core.response.model.AdTemplate r4 = r3.mAdTemplate     // Catch: java.lang.Throwable -> L10
            r2 = 1
            com.kwad.components.ad.reward.monitor.c.a(r2, r4, r0)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r4 = move-exception
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r4)
            return
    }

    @Override // com.kwad.components.core.proxy.f
    public void onCreateCaughtException(java.lang.Throwable r2) {
            r1 = this;
            super.onCreateCaughtException(r2)
            r2 = 1
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            com.kwad.components.ad.reward.monitor.b.b(r2, r0)
            return
    }

    @Override // com.kwad.components.core.proxy.f, com.kwad.components.core.proxy.a.c
    public void onCreateStageChange(com.kwad.components.core.proxy.PageCreateStage r1) {
            r0 = this;
            super.onCreateStageChange(r1)
            java.lang.String r1 = r1.getStage()
            r0.reportSubPageCreate(r1)
            return
    }

    @Override // com.kwad.components.core.proxy.f, com.kwad.sdk.api.proxy.IActivityProxy
    public void onDestroy() {
            r2 = this;
            com.kwad.sdk.api.KsRewardVideoAd$RewardAdInteractionListener r0 = com.kwad.components.ad.reward.page.AdRewardPreviewActivityProxy.mInteractionListener
            com.kwad.components.ad.reward.page.AdRewardPreviewActivityProxy.a.e(r0)
            r0 = 0
            com.kwad.components.ad.reward.page.AdRewardPreviewActivityProxy.mInteractionListener = r0
            com.kwad.sdk.core.webview.KsAdWebView r1 = r2.mAdWebView
            if (r1 == 0) goto L11
            r1.onActivityDestroy()
            r2.mAdWebView = r0
        L11:
            com.kwad.components.core.t.h r0 = r2.mCountdownHelper
            if (r0 == 0) goto L18
            r0.stop()
        L18:
            super.onDestroy()
            return
    }

    @Override // com.kwad.components.ad.reward.widget.HandSlideView.a
    public void onHandSlideLoopEnd() {
            r0 = this;
            r0.closeHandSlideMask()
            return
    }

    @Override // com.kwad.components.core.proxy.f, com.kwad.sdk.api.proxy.IActivityProxy
    public void onPause() {
            r1 = this;
            super.onPause()
            r0 = 0
            r1.overridePendingTransition(r0, r0)
            com.kwad.sdk.utils.bv r0 = r1.getTimerHelper()
            r0.Sm()
            com.kwad.components.core.t.h r0 = r1.mCountdownHelper
            if (r0 == 0) goto L15
            r0.pause()
        L15:
            return
    }

    @Override // com.kwad.components.core.proxy.f, com.kwad.sdk.api.proxy.IActivityProxy
    public void onResume() {
            r2 = this;
            super.onResume()
            com.kwad.sdk.utils.bv r0 = r2.getTimerHelper()
            r0.Sl()
            com.kwad.components.core.t.h r0 = r2.mCountdownHelper
            if (r0 == 0) goto L11
            r0.resume()
        L11:
            boolean r0 = r2.mReportedPageShow
            if (r0 != 0) goto L1d
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            r1 = 1
            com.kwad.components.ad.reward.monitor.c.f(r1, r0)
            r2.mReportedPageShow = r1
        L1d:
            return
    }
}
