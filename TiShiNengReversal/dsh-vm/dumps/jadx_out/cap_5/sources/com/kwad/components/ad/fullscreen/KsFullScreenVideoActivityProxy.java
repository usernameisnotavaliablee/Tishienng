package com.kwad.components.ad.fullscreen;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.kwad.sdk.api.core.KsAdSdkDynamicImpl(com.kwad.sdk.api.proxy.app.FeedDownloadActivity.class)
@androidx.annotation.Keep
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class KsFullScreenVideoActivityProxy extends com.kwad.components.core.m.b<com.kwad.components.ad.reward.g> implements com.kwad.components.offline.api.core.adlive.listener.OnAdLiveResumeInterceptor {
    public static final java.lang.String KEY_AD_RESULT_CACHE_IDX = "key_ad_result_cache_idx";
    public static final java.lang.String KEY_TEMPLATE = "key_template_json";
    public static final java.lang.String KEY_VIDEO_PLAY_CONFIG = "key_video_play_config";
    public static final java.lang.String KEY_VIDEO_PLAY_CONFIG_JSON = "key_video_play_config_json";
    private static final java.lang.String TAG = "FullScreenVideo";
    private static final java.util.HashMap<java.lang.String, com.kwad.components.ad.fullscreen.c> sHashMap = null;
    private com.kwad.sdk.core.response.model.AdInfo mAdInfo;
    private com.kwad.components.ad.fullscreen.d mAdOpenInteractionListener;
    private com.kwad.sdk.core.response.model.AdResultData mAdResultData;
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;
    private com.kwad.components.ad.fullscreen.c.b mFullScreenPresenter;
    private com.kwad.components.ad.fullscreen.c mInteractionListener;
    private boolean mIsBackEnable;
    private boolean mPageDismissCalled;
    public long mPageEnterTime;
    private com.kwad.components.ad.reward.e.g mPlayEndPageListener;
    private org.json.JSONObject mReportExtData;
    private boolean mReportedPageResume;
    private com.kwad.sdk.core.view.AdBaseFrameLayout mRootContainer;
    public int mScreenOrientation;
    private com.kwad.sdk.utils.bv mTimerHelper;
    private com.kwad.sdk.api.KsVideoPlayConfig mVideoPlayConfig;
    private com.kwad.components.ad.fullscreen.b model;



    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.kwad.components.ad.fullscreen.KsFullScreenVideoActivityProxy.sHashMap = r0
            return
    }

    public KsFullScreenVideoActivityProxy() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mReportedPageResume = r0
            com.kwad.components.ad.fullscreen.KsFullScreenVideoActivityProxy$1 r0 = new com.kwad.components.ad.fullscreen.KsFullScreenVideoActivityProxy$1
            r0.<init>(r1)
            r1.mPlayEndPageListener = r0
            com.kwad.components.ad.fullscreen.KsFullScreenVideoActivityProxy$2 r0 = new com.kwad.components.ad.fullscreen.KsFullScreenVideoActivityProxy$2
            r0.<init>(r1)
            r1.mAdOpenInteractionListener = r0
            return
    }

    static /* synthetic */ boolean access$002(com.kwad.components.ad.fullscreen.KsFullScreenVideoActivityProxy r0, boolean r1) {
            r0.mIsBackEnable = r1
            return r1
    }

    static /* synthetic */ boolean access$100(com.kwad.components.ad.fullscreen.KsFullScreenVideoActivityProxy r0) {
            boolean r0 = r0.notifyPageDismiss()
            return r0
    }

    private static java.lang.String getListenerKey(com.kwad.sdk.core.response.model.AdTemplate r2) {
            if (r2 != 0) goto L5
            java.lang.String r2 = ""
            return r2
        L5:
            com.kwad.sdk.core.response.model.AdInfo r2 = com.kwad.sdk.core.response.b.e.el(r2)
            com.kwad.sdk.core.response.model.AdInfo$AdBaseInfo r2 = r2.adBaseInfo
            long r0 = r2.creativeId
            java.lang.String r2 = java.lang.String.valueOf(r0)
            return r2
    }

    private com.kwad.sdk.utils.bv getTimerHelper() {
            r1 = this;
            com.kwad.sdk.utils.bv r0 = r1.mTimerHelper
            if (r0 != 0) goto Le
            com.kwad.sdk.utils.bv r0 = new com.kwad.sdk.utils.bv
            r0.<init>()
            r1.mTimerHelper = r0
            r0.startTiming()
        Le:
            com.kwad.sdk.utils.bv r0 = r1.mTimerHelper
            return r0
    }

    private void initVideoPlayConfig(@androidx.annotation.NonNull com.kwad.sdk.api.KsVideoPlayConfig r3) {
            r2 = this;
            java.lang.String r0 = r3.getShowScene()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1d
            r0 = 0
            r2.mReportExtData = r0
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            r2.mReportExtData = r0
            java.lang.String r1 = "ext_showscene"
            java.lang.String r3 = r3.getShowScene()
            com.kwad.sdk.utils.aa.putValue(r0, r1, r3)
        L1d:
            return
    }

    public static void launch(@androidx.annotation.NonNull android.content.Context r4, @androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdResultData r5, @androidx.annotation.NonNull com.kwad.sdk.api.KsVideoPlayConfig r6, com.kwad.components.ad.fullscreen.c r7) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = com.kwad.sdk.core.response.b.c.r(r5)
            r1 = 0
            com.kwad.components.ad.reward.monitor.c.i(r1, r0)
            com.kwad.sdk.utils.n.eL(r0)
            boolean r2 = r6.isShowLandscape()
            if (r2 == 0) goto L1e
            java.lang.Class<com.kwad.components.ad.fullscreen.KsFullScreenLandScapeVideoActivityProxy> r2 = com.kwad.components.ad.fullscreen.KsFullScreenLandScapeVideoActivityProxy.class
            java.lang.Class<com.kwad.sdk.api.proxy.app.KsFullScreenLandScapeVideoActivity> r3 = com.kwad.sdk.api.proxy.app.KsFullScreenLandScapeVideoActivity.class
            com.kwad.sdk.service.c.a(r3, r2)
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r4, r3)
            goto L2a
        L1e:
            java.lang.Class<com.kwad.components.ad.fullscreen.KsFullScreenVideoActivityProxy> r2 = com.kwad.components.ad.fullscreen.KsFullScreenVideoActivityProxy.class
            java.lang.Class<com.kwad.sdk.api.proxy.app.FeedDownloadActivity> r3 = com.kwad.sdk.api.proxy.app.FeedDownloadActivity.class
            com.kwad.sdk.service.c.a(r3, r2)
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r4, r3)
        L2a:
            r3 = 268435456(0x10000000, float:2.524355E-29)
            r2.setFlags(r3)
            com.kwad.components.core.c.f r3 = com.kwad.components.core.c.f.ol()
            int r5 = r3.l(r5)
            java.lang.String r3 = "key_ad_result_cache_idx"
            r2.putExtra(r3, r5)
            java.lang.String r5 = "key_video_play_config"
            r2.putExtra(r5, r6)
            java.lang.String r5 = "key_video_play_config_json"
            java.lang.String r6 = com.kwad.components.core.internal.api.e.a(r6)
            r2.putExtra(r5, r6)
            java.util.HashMap<java.lang.String, com.kwad.components.ad.fullscreen.c> r5 = com.kwad.components.ad.fullscreen.KsFullScreenVideoActivityProxy.sHashMap
            java.lang.String r6 = getListenerKey(r0)
            r5.put(r6, r7)
            r4.startActivity(r2)     // Catch: java.lang.Throwable -> L68
            com.kwad.sdk.a.a.c r4 = com.kwad.sdk.a.a.c.CU()
            r5 = 1
            r4.bm(r5)
            com.kwad.components.core.proxy.PageCreateStage r4 = com.kwad.components.core.proxy.PageCreateStage.END_LAUNCH
            java.lang.String r4 = r4.getStage()
            reportSubPageCreate(r4, r0)
            return
        L68:
            r4 = move-exception
            java.lang.String r5 = r4.getMessage()
            com.kwad.components.core.proxy.PageCreateStage r6 = com.kwad.components.core.proxy.PageCreateStage.ERROR_START_ACTIVITY
            java.lang.String r6 = r6.getStage()
            com.kwad.components.ad.reward.monitor.c.a(r1, r0, r6, r5)
            throw r4
    }

    private boolean notifyPageDismiss() {
            r6 = this;
            boolean r0 = r6.mPageDismissCalled
            if (r0 == 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = 1
            r6.mPageDismissCalled = r0
            com.kwad.sdk.core.response.model.AdTemplate r1 = r6.mAdTemplate
            if (r1 == 0) goto L4b
            com.kwad.sdk.core.response.model.AdInfo r1 = r6.mAdInfo
            if (r1 == 0) goto L4b
            com.kwad.sdk.utils.bv r1 = r6.getTimerHelper()
            long r1 = r1.getTime()
            com.kwad.sdk.a.a.c r3 = com.kwad.sdk.a.a.c.CU()
            r3.CX()
            com.kwad.sdk.core.response.model.AdTemplate r3 = r6.mAdTemplate
            r4 = 6
            org.json.JSONObject r5 = r6.mReportExtData
            com.kwad.sdk.core.adlog.c.a(r3, r4, r1, r5)
            com.kwad.sdk.core.response.model.AdInfo r3 = r6.mAdInfo
            boolean r3 = com.kwad.sdk.core.response.b.a.cS(r3)
            if (r3 == 0) goto L4b
            T extends com.kwad.components.core.m.a r3 = r6.mCallerContext
            com.kwad.components.ad.reward.g r3 = (com.kwad.components.ad.reward.g) r3
            boolean r3 = r3.mw
            if (r3 != 0) goto L4b
            com.kwad.components.ad.fullscreen.b r3 = r6.model
            com.kwad.sdk.core.response.model.AdTemplate r3 = r3.getAdTemplate()
            float r1 = (float) r1
            r2 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 / r2
            double r1 = (double) r1
            double r1 = java.lang.Math.ceil(r1)
            int r1 = (int) r1
            com.kwad.sdk.core.adlog.c.m(r3, r1)
        L4b:
            return r0
    }

    @com.ksad.annotation.invoker.InvokeBy(invokerClass = com.kwad.sdk.service.c.class, methodId = "initComponentProxyForInvoker")
    public static void register() {
            java.lang.Class<com.kwad.sdk.api.proxy.app.KsFullScreenVideoActivity> r0 = com.kwad.sdk.api.proxy.app.KsFullScreenVideoActivity.class
            java.lang.Class<com.kwad.components.ad.fullscreen.KsFullScreenVideoActivityProxy> r1 = com.kwad.components.ad.fullscreen.KsFullScreenVideoActivityProxy.class
            com.kwad.sdk.service.c.a(r0, r1)
            java.lang.Class<com.kwad.sdk.api.proxy.app.FeedDownloadActivity> r0 = com.kwad.sdk.api.proxy.app.FeedDownloadActivity.class
            com.kwad.sdk.service.c.a(r0, r1)
            return
    }

    private static void reportSubPageCreate(java.lang.String r1, com.kwad.sdk.core.response.model.AdTemplate r2) {
            r0 = 0
            com.kwad.components.ad.reward.monitor.c.c(r0, r2, r1)
            return
    }

    @Override // com.kwad.components.core.proxy.f
    public boolean checkIntentData(@androidx.annotation.Nullable android.content.Intent r4) {
            r3 = this;
            boolean r4 = com.kwad.sdk.core.config.e.Gg()
            r0 = 1
            if (r4 == 0) goto L18
            android.content.Intent r4 = r3.getIntent()
            java.lang.String r1 = "key_video_play_config_json"
            java.lang.String r4 = r4.getStringExtra(r1)
            com.kwad.components.core.internal.api.VideoPlayConfigImpl r4 = com.kwad.components.core.internal.api.e.b(r4, r0)
            r3.mVideoPlayConfig = r4
            goto L2a
        L18:
            android.content.Intent r4 = r3.getIntent()
            java.lang.String r1 = "key_video_play_config"
            java.io.Serializable r4 = r4.getSerializableExtra(r1)
            boolean r1 = r4 instanceof com.kwad.sdk.api.KsVideoPlayConfig
            if (r1 == 0) goto L2a
            com.kwad.sdk.api.KsVideoPlayConfig r4 = (com.kwad.sdk.api.KsVideoPlayConfig) r4
            r3.mVideoPlayConfig = r4
        L2a:
            android.content.Intent r4 = r3.getIntent()
            java.lang.String r1 = "key_ad_result_cache_idx"
            r2 = 0
            int r4 = r4.getIntExtra(r1, r2)
            com.kwad.components.core.c.f r1 = com.kwad.components.core.c.f.ol()
            com.kwad.sdk.core.response.model.AdResultData r4 = r1.d(r4, r0)
            r3.mAdResultData = r4
            if (r4 != 0) goto L42
            return r2
        L42:
            com.kwad.sdk.core.response.model.AdTemplate r4 = com.kwad.sdk.core.response.b.c.r(r4)
            r3.mAdTemplate = r4
            com.kwad.components.ad.fullscreen.b r1 = new com.kwad.components.ad.fullscreen.b
            r1.<init>(r4)
            r3.model = r1
            com.kwad.components.ad.fullscreen.d r4 = r3.mAdOpenInteractionListener
            com.kwad.sdk.core.response.model.AdTemplate r1 = r3.mAdTemplate
            r4.setAdTemplate(r1)
            com.kwad.sdk.api.KsVideoPlayConfig r4 = r3.mVideoPlayConfig
            if (r4 == 0) goto L60
            com.kwad.sdk.core.response.model.AdTemplate r4 = r3.mAdTemplate
            if (r4 != 0) goto L5f
            goto L60
        L5f:
            return r0
        L60:
            return r2
    }

    @Override // com.kwad.components.core.proxy.f, com.kwad.sdk.api.proxy.IActivityProxy
    public void finish() {
            r2 = this;
            super.finish()
            com.kwad.components.ad.fullscreen.d r0 = r2.mAdOpenInteractionListener
            r1 = 0
            r0.i(r1)
            return
    }

    @Override // com.kwad.components.core.proxy.f
    public int getLayoutId() {
            r1 = this;
            com.kwad.components.ad.fullscreen.b r0 = r1.model
            if (r0 == 0) goto Lb
            boolean r0 = r0.jk
            if (r0 == 0) goto Lb
            int r0 = com.kwad.sdk.R.layout.ksad_activity_fullscreen_tk
            return r0
        Lb:
            int r0 = com.kwad.sdk.R.layout.ksad_activity_fullscreen_video_legacy
            return r0
    }

    @Override // com.kwad.components.core.proxy.f
    public java.lang.String getPageName() {
            r1 = this;
            java.lang.String r0 = "KsFullScreenVideoActivityProxy"
            return r0
    }

    @Override // com.kwad.components.offline.api.core.adlive.listener.OnAdLiveResumeInterceptor
    public boolean handledAdLiveOnResume() {
            r1 = this;
            T extends com.kwad.components.core.m.a r0 = r1.mCallerContext
            com.kwad.components.ad.reward.g r0 = (com.kwad.components.ad.reward.g) r0
            boolean r0 = r0.gG()
            return r0
    }

    @Override // com.kwad.components.core.proxy.f
    public void initData() {
            r4 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            r4.mPageEnterTime = r0
            com.kwad.sdk.core.response.model.AdTemplate r2 = r4.mAdTemplate
            r3 = 0
            com.kwad.components.ad.reward.monitor.c.a(r3, r2, r0)
            com.kwad.sdk.core.response.model.AdTemplate r0 = r4.mAdTemplate
            com.kwad.components.ad.reward.monitor.c.g(r3, r0)
            java.util.HashMap<java.lang.String, com.kwad.components.ad.fullscreen.c> r0 = com.kwad.components.ad.fullscreen.KsFullScreenVideoActivityProxy.sHashMap
            com.kwad.sdk.core.response.model.AdTemplate r1 = r4.mAdTemplate
            java.lang.String r1 = getListenerKey(r1)
            java.lang.Object r0 = r0.get(r1)
            com.kwad.components.ad.fullscreen.c r0 = (com.kwad.components.ad.fullscreen.c) r0
            r4.mInteractionListener = r0
            com.kwad.components.ad.fullscreen.d r1 = r4.mAdOpenInteractionListener
            r1.a(r0)
            com.kwad.sdk.core.response.model.AdTemplate r0 = r4.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            r4.mAdInfo = r0
            com.kwad.sdk.api.KsVideoPlayConfig r0 = r4.mVideoPlayConfig
            boolean r0 = r0.isShowLandscape()
            r4.mScreenOrientation = r0
            com.kwad.sdk.core.response.model.AdTemplate r0 = r4.mAdTemplate
            com.kwad.sdk.api.KsVideoPlayConfig r1 = r4.mVideoPlayConfig
            boolean r1 = r1.isVideoSoundEnable()
            if (r1 == 0) goto L42
            r1 = 2
            goto L43
        L42:
            r1 = 1
        L43:
            r0.mInitVoiceStatus = r1
            com.kwad.sdk.api.KsVideoPlayConfig r0 = r4.mVideoPlayConfig
            r4.initVideoPlayConfig(r0)
            return
    }

    @Override // com.kwad.components.core.proxy.f
    public void initView() {
            r1 = this;
            int r0 = com.kwad.sdk.R.id.ksad_root_container
            android.view.View r0 = r1.findViewById(r0)
            com.kwad.sdk.core.view.AdBaseFrameLayout r0 = (com.kwad.sdk.core.view.AdBaseFrameLayout) r0
            r1.mRootContainer = r0
            return
    }

    @Override // com.kwad.components.core.proxy.f
    public boolean needAdaptionScreen() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.kwad.components.core.m.b, com.kwad.components.core.proxy.f
    public void onActivityCreate() {
            r1 = this;
            super.onActivityCreate()
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            com.kwad.sdk.commercial.d.c.bL(r0)
            return
    }

    @Override // com.kwad.components.core.proxy.f, com.kwad.sdk.api.proxy.IActivityProxy
    public void onBackPressed() {
            r1 = this;
            com.kwad.components.ad.fullscreen.c.b r0 = r1.mFullScreenPresenter
            if (r0 == 0) goto Lb
            boolean r0 = r0.onBackPressed()
            if (r0 == 0) goto Lb
            goto L12
        Lb:
            boolean r0 = r1.mIsBackEnable
            if (r0 == 0) goto L12
            super.onBackPressed()
        L12:
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.kwad.components.core.m.b
    protected com.kwad.components.ad.reward.g onCreateCallerContext() {
            r5 = this;
            com.kwad.components.ad.reward.g r0 = new com.kwad.components.ad.reward.g
            r0.<init>(r5)
            com.kwad.sdk.core.response.model.AdResultData r1 = r5.mAdResultData
            r0.a(r1)
            long r1 = r5.mPageEnterTime
            r0.mPageEnterTime = r1
            r1 = 0
            r0.rC = r1
            com.kwad.components.ad.fullscreen.d r2 = r5.mAdOpenInteractionListener
            r0.rD = r2
            int r2 = r5.mScreenOrientation
            r0.mScreenOrientation = r2
            com.kwad.sdk.api.KsVideoPlayConfig r2 = r5.mVideoPlayConfig
            r0.mVideoPlayConfig = r2
            org.json.JSONObject r2 = r5.mReportExtData
            r0.mReportExtData = r2
            com.kwad.sdk.core.view.AdBaseFrameLayout r2 = r5.mRootContainer
            r0.mRootContainer = r2
            com.kwad.sdk.core.response.model.AdInfo r2 = r5.mAdInfo
            boolean r2 = com.kwad.sdk.core.response.b.a.aF(r2)
            if (r2 == 0) goto L38
            com.kwad.components.core.e.d.c r2 = new com.kwad.components.core.e.d.c
            com.kwad.sdk.core.response.model.AdTemplate r3 = r5.mAdTemplate
            org.json.JSONObject r4 = r5.mReportExtData
            r2.<init>(r3, r4)
            r0.mApkDownloadHelper = r2
        L38:
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl r2 = new com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl
            android.content.Context r3 = r5.mContext
            com.kwad.sdk.core.response.model.AdTemplate r4 = r5.mAdTemplate
            r2.<init>(r0, r3, r4)
            r0.rG = r2
            com.kwad.components.ad.reward.e.g r2 = r5.mPlayEndPageListener
            r0.b(r2)
            com.kwad.sdk.core.response.model.AdTemplate r2 = r5.mAdTemplate
            boolean r2 = com.kwad.sdk.core.response.b.b.cL(r2)
            if (r2 == 0) goto L5a
            com.kwad.components.ad.reward.j r2 = new com.kwad.components.ad.reward.j
            org.json.JSONObject r3 = r5.mReportExtData
            r4 = 0
            r2.<init>(r0, r3, r4)
            r0.rH = r2
        L5a:
            com.kwad.sdk.core.response.model.AdInfo r2 = r5.mAdInfo
            boolean r2 = com.kwad.sdk.core.response.b.a.bK(r2)
            if (r2 == 0) goto L71
            com.kwad.components.core.playable.a r2 = new com.kwad.components.core.playable.a
            int r3 = com.kwad.sdk.R.id.ksad_playable_webview
            android.view.View r3 = r5.findViewById(r3)
            com.kwad.sdk.core.webview.KsAdWebView r3 = (com.kwad.sdk.core.webview.KsAdWebView) r3
            r2.<init>(r3)
            r0.rF = r2
        L71:
            r0.rS = r1
            com.kwad.sdk.core.response.model.AdInfo r1 = r5.mAdInfo
            boolean r1 = com.kwad.sdk.core.response.b.a.bK(r1)
            if (r1 == 0) goto L82
            com.kwad.sdk.core.response.model.AdInfo r1 = r5.mAdInfo
            long r1 = com.kwad.sdk.core.response.b.a.ar(r1)
            goto L88
        L82:
            com.kwad.sdk.core.response.model.AdInfo r1 = r5.mAdInfo
            long r1 = com.kwad.sdk.core.response.b.a.am(r1)
        L88:
            r0.sq = r1
            com.kwad.sdk.utils.bv r1 = r5.getTimerHelper()
            r0.mTimerHelper = r1
            com.kwad.components.ad.reward.m.e r1 = new com.kwad.components.ad.reward.m.e
            r1.<init>(r0)
            r0.rE = r1
            return r0
    }

    @Override // com.kwad.components.core.m.b
    public /* bridge */ /* synthetic */ com.kwad.components.ad.reward.g onCreateCallerContext() {
            r1 = this;
            com.kwad.components.ad.reward.g r0 = r1.onCreateCallerContext()
            return r0
    }

    @Override // com.kwad.components.core.proxy.f
    public void onCreateCaughtException(java.lang.Throwable r2) {
            r1 = this;
            super.onCreateCaughtException(r2)
            r2 = 0
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            com.kwad.components.ad.reward.monitor.b.b(r2, r0)
            return
    }

    @Override // com.kwad.components.core.m.b
    public com.kwad.sdk.mvp.Presenter onCreatePresenter() {
            r4 = this;
            com.kwad.components.ad.fullscreen.c.b r0 = new com.kwad.components.ad.fullscreen.c.b
            r4.getActivity()
            com.kwad.sdk.core.view.AdBaseFrameLayout r1 = r4.mRootContainer
            com.kwad.components.ad.fullscreen.b r2 = r4.model
            T extends com.kwad.components.core.m.a r3 = r4.mCallerContext
            com.kwad.components.ad.reward.g r3 = (com.kwad.components.ad.reward.g) r3
            r0.<init>(r4, r1, r2, r3)
            r4.mFullScreenPresenter = r0
            return r0
    }

    @Override // com.kwad.components.core.proxy.f, com.kwad.components.core.proxy.a.c
    public void onCreateStageChange(com.kwad.components.core.proxy.PageCreateStage r2) {
            r1 = this;
            super.onCreateStageChange(r2)
            java.lang.String r2 = r2.getStage()
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            reportSubPageCreate(r2, r0)
            return
    }

    @Override // com.kwad.components.core.m.b, com.kwad.components.core.proxy.f, com.kwad.sdk.api.proxy.IActivityProxy
    public void onDestroy() {
            r2 = this;
            super.onDestroy()     // Catch: java.lang.Throwable -> L29
            com.kwad.components.ad.fullscreen.d r0 = r2.mAdOpenInteractionListener     // Catch: java.lang.Throwable -> L29
            r1 = 0
            r0.i(r1)     // Catch: java.lang.Throwable -> L29
            com.kwad.sdk.core.response.model.AdInfo r0 = r2.mAdInfo     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L2b
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.K(r0)     // Catch: java.lang.Throwable -> L29
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L29
            if (r1 != 0) goto L2b
            android.content.Context r1 = r2.mContext     // Catch: java.lang.Throwable -> L29
            android.content.Context r1 = r1.getApplicationContext()     // Catch: java.lang.Throwable -> L29
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)     // Catch: java.lang.Throwable -> L29
            com.kwad.sdk.core.videocache.f r1 = com.kwad.sdk.core.videocache.c.a.bR(r1)     // Catch: java.lang.Throwable -> L29
            r1.eM(r0)     // Catch: java.lang.Throwable -> L29
            goto L2b
        L29:
            r0 = move-exception
            goto L65
        L2b:
            T extends com.kwad.components.core.m.a r0 = r2.mCallerContext     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L4d
            r1 = r0
            com.kwad.components.ad.reward.g r1 = (com.kwad.components.ad.reward.g) r1     // Catch: java.lang.Throwable -> L29
            com.kwad.components.ad.reward.m.e r1 = r1.rE     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L4d
            com.kwad.components.ad.reward.g r0 = (com.kwad.components.ad.reward.g) r0     // Catch: java.lang.Throwable -> L29
            com.kwad.components.ad.reward.m.e r0 = r0.rE     // Catch: java.lang.Throwable -> L29
            boolean r0 = r0.kW()     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L4d
            T extends com.kwad.components.core.m.a r0 = r2.mCallerContext     // Catch: java.lang.Throwable -> L29
            com.kwad.components.ad.reward.g r0 = (com.kwad.components.ad.reward.g) r0     // Catch: java.lang.Throwable -> L29
            com.kwad.components.ad.reward.m.e r0 = r0.rE     // Catch: java.lang.Throwable -> L29
            com.kwad.components.ad.reward.f.a r0 = r0.kX()     // Catch: java.lang.Throwable -> L29
            r0.removeInterceptor(r2)     // Catch: java.lang.Throwable -> L29
        L4d:
            java.util.HashMap<java.lang.String, com.kwad.components.ad.fullscreen.c> r0 = com.kwad.components.ad.fullscreen.KsFullScreenVideoActivityProxy.sHashMap     // Catch: java.lang.Throwable -> L29
            com.kwad.sdk.core.response.model.AdTemplate r1 = r2.mAdTemplate     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = getListenerKey(r1)     // Catch: java.lang.Throwable -> L29
            r0.remove(r1)     // Catch: java.lang.Throwable -> L29
            r0 = 0
            r2.mInteractionListener = r0     // Catch: java.lang.Throwable -> L29
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate     // Catch: java.lang.Throwable -> L29
            com.kwai.adclient.kscommerciallogger.model.BusinessType r0 = com.kwad.sdk.commercial.d.be(r0)     // Catch: java.lang.Throwable -> L29
            com.kwad.components.core.g.a.a(r0)     // Catch: java.lang.Throwable -> L29
            return
        L65:
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r0)
            return
    }

    @Override // com.kwad.components.core.m.b, com.kwad.components.core.proxy.f, com.kwad.sdk.api.proxy.IActivityProxy
    public void onPause() {
            r3 = this;
            super.onPause()     // Catch: java.lang.Throwable -> L15
            com.kwad.sdk.utils.bv r0 = r3.getTimerHelper()     // Catch: java.lang.Throwable -> L15
            r0.Sm()     // Catch: java.lang.Throwable -> L15
            T extends com.kwad.components.core.m.a r0 = r3.mCallerContext     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L17
            com.kwad.components.ad.reward.g r0 = (com.kwad.components.ad.reward.g) r0     // Catch: java.lang.Throwable -> L15
            r1 = -1
            r0.mPageEnterTime = r1     // Catch: java.lang.Throwable -> L15
            return
        L15:
            r0 = move-exception
            goto L18
        L17:
            return
        L18:
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r0)
            return
    }

    @Override // com.kwad.components.core.proxy.f, com.kwad.sdk.api.proxy.IActivityProxy
    public void onPreCreate(@androidx.annotation.Nullable android.os.Bundle r2) {
            r1 = this;
            super.onPreCreate(r2)
            android.content.Intent r2 = r1.getIntent()     // Catch: java.lang.Throwable -> Lc
            java.lang.String r0 = "key_template"
            r2.removeExtra(r0)     // Catch: java.lang.Throwable -> Lc
        Lc:
            return
    }

    @Override // com.kwad.components.core.m.b, com.kwad.components.core.proxy.f, com.kwad.sdk.api.proxy.IActivityProxy
    public void onResume() {
            r2 = this;
            super.onResume()     // Catch: java.lang.Throwable -> L18
            com.kwad.sdk.utils.bv r0 = r2.getTimerHelper()     // Catch: java.lang.Throwable -> L18
            r0.Sl()     // Catch: java.lang.Throwable -> L18
            boolean r0 = r2.mReportedPageResume     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto L1a
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate     // Catch: java.lang.Throwable -> L18
            r1 = 0
            com.kwad.components.ad.reward.monitor.c.f(r1, r0)     // Catch: java.lang.Throwable -> L18
            r0 = 1
            r2.mReportedPageResume = r0     // Catch: java.lang.Throwable -> L18
            return
        L18:
            r0 = move-exception
            goto L1b
        L1a:
            return
        L1b:
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r0)
            return
    }
}
