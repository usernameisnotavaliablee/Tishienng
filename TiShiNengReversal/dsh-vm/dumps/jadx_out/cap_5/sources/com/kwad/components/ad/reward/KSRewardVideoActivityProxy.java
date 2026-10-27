package com.kwad.components.ad.reward;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.kwad.sdk.api.core.KsAdSdkDynamicImpl(com.kwad.sdk.api.proxy.app.KsRewardVideoActivity.class)
@androidx.annotation.Keep
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class KSRewardVideoActivityProxy extends com.kwad.components.core.m.b<com.kwad.components.ad.reward.g> implements com.kwad.components.ad.reward.g.b, com.kwad.components.ad.reward.n.a, com.kwad.components.core.t.c.b, com.kwad.components.offline.api.core.adlive.listener.OnAdLiveResumeInterceptor {
    public static final java.lang.String KEY_AD_RESULT_CACHE_IDX = "key_ad_result_cache_idx";
    public static final java.lang.String KEY_REWARD_TYPE = "key_template_reward_type";
    public static final java.lang.String KEY_TEMPLATE = "key_template_json";
    public static final java.lang.String KEY_VIDEO_PLAY_CONFIG = "key_video_play_config";
    public static final java.lang.String KEY_VIDEO_PLAY_CONFIG_JSON = "key_video_play_config_json";
    private static final java.lang.String TAG = "RewardVideo";
    private java.lang.String listenerKey;
    private com.kwad.components.ad.reward.e.i mAdOpenInteractionListener;
    private com.kwad.components.ad.reward.e.d mAdRewardStepListener;
    private boolean mIsBackEnable;
    private boolean mIsFinishVideoLookStep;
    private com.kwad.components.ad.reward.model.c mModel;
    private boolean mPageDismissCalled;
    private long mPageEnterTime;
    private com.kwad.components.ad.reward.e.g mPlayEndPageListener;
    private boolean mReportedPageResume;
    private com.kwad.components.ad.reward.n mRewardPresenter;
    private final com.kwad.components.ad.reward.e.l mRewardVerifyListener;
    private com.kwad.sdk.core.view.AdBaseFrameLayout mRootContainer;
    private com.kwad.sdk.utils.bv mTimerHelper;








    public KSRewardVideoActivityProxy() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mReportedPageResume = r0
            r1.mIsFinishVideoLookStep = r0
            com.kwad.components.ad.reward.KSRewardVideoActivityProxy$1 r0 = new com.kwad.components.ad.reward.KSRewardVideoActivityProxy$1
            r0.<init>(r1)
            r1.mRewardVerifyListener = r0
            com.kwad.components.ad.reward.KSRewardVideoActivityProxy$2 r0 = new com.kwad.components.ad.reward.KSRewardVideoActivityProxy$2
            r0.<init>(r1)
            r1.mAdOpenInteractionListener = r0
            com.kwad.components.ad.reward.KSRewardVideoActivityProxy$3 r0 = new com.kwad.components.ad.reward.KSRewardVideoActivityProxy$3
            r0.<init>(r1)
            r1.mPlayEndPageListener = r0
            com.kwad.components.ad.reward.KSRewardVideoActivityProxy$4 r0 = new com.kwad.components.ad.reward.KSRewardVideoActivityProxy$4
            r0.<init>(r1)
            r1.mAdRewardStepListener = r0
            return
    }

    static /* synthetic */ com.kwad.components.ad.reward.model.c access$000(com.kwad.components.ad.reward.KSRewardVideoActivityProxy r0) {
            com.kwad.components.ad.reward.model.c r0 = r0.mModel
            return r0
    }

    static /* synthetic */ com.kwad.components.core.m.a access$100(com.kwad.components.ad.reward.KSRewardVideoActivityProxy r0) {
            T extends com.kwad.components.core.m.a r0 = r0.mCallerContext
            return r0
    }

    static /* synthetic */ boolean access$1000(com.kwad.components.ad.reward.KSRewardVideoActivityProxy r0, boolean r1) {
            boolean r0 = r0.notifyPageDismiss(r1)
            return r0
    }

    static /* synthetic */ boolean access$1102(com.kwad.components.ad.reward.KSRewardVideoActivityProxy r0, boolean r1) {
            r0.mIsBackEnable = r1
            return r1
    }

    static /* synthetic */ com.kwad.components.ad.reward.e.i access$1200(com.kwad.components.ad.reward.KSRewardVideoActivityProxy r0) {
            com.kwad.components.ad.reward.e.i r0 = r0.mAdOpenInteractionListener
            return r0
    }

    static /* synthetic */ com.kwad.components.core.m.a access$200(com.kwad.components.ad.reward.KSRewardVideoActivityProxy r0) {
            T extends com.kwad.components.core.m.a r0 = r0.mCallerContext
            return r0
    }

    static /* synthetic */ void access$300(com.kwad.components.ad.reward.KSRewardVideoActivityProxy r0) {
            r0.markOpenNsCompleted()
            return
    }

    static /* synthetic */ void access$400(com.kwad.components.ad.reward.KSRewardVideoActivityProxy r0) {
            r0.notifyRewardVerify()
            return
    }

    static /* synthetic */ void access$500(com.kwad.components.ad.reward.KSRewardVideoActivityProxy r0) {
            r0.notifyRewardVerifyStepByStep()
            return
    }

    static /* synthetic */ com.kwad.components.core.m.a access$600(com.kwad.components.ad.reward.KSRewardVideoActivityProxy r0) {
            T extends com.kwad.components.core.m.a r0 = r0.mCallerContext
            return r0
    }

    static /* synthetic */ com.kwad.components.core.m.a access$700(com.kwad.components.ad.reward.KSRewardVideoActivityProxy r0) {
            T extends com.kwad.components.core.m.a r0 = r0.mCallerContext
            return r0
    }

    static /* synthetic */ com.kwad.components.core.m.a access$800(com.kwad.components.ad.reward.KSRewardVideoActivityProxy r0) {
            T extends com.kwad.components.core.m.a r0 = r0.mCallerContext
            return r0
    }

    static /* synthetic */ com.kwad.components.core.m.a access$900(com.kwad.components.ad.reward.KSRewardVideoActivityProxy r0) {
            T extends com.kwad.components.core.m.a r0 = r0.mCallerContext
            return r0
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

    private java.lang.String getUniqueId() {
            r1 = this;
            java.lang.String r0 = r1.listenerKey
            return r0
    }

    private void handleNotifyVerify(boolean r3) {
            r2 = this;
            com.kwad.components.ad.reward.e.i r0 = r2.mAdOpenInteractionListener
            T extends com.kwad.components.core.m.a r1 = r2.mCallerContext
            com.kwad.components.ad.reward.g r1 = (com.kwad.components.ad.reward.g) r1
            r0.setCallerContext(r1)
            T extends com.kwad.components.core.m.a r0 = r2.mCallerContext
            com.kwad.components.ad.reward.g r0 = (com.kwad.components.ad.reward.g) r0
            r1 = 1
            r0.F(r1)
            com.kwad.components.ad.reward.model.c r0 = r2.mModel
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.getAdTemplate()
            r0.mRewardVerifyCalled = r1
            if (r3 != 0) goto L23
            T extends com.kwad.components.core.m.a r3 = r2.mCallerContext
            com.kwad.components.ad.reward.g r3 = (com.kwad.components.ad.reward.g) r3
            int r3 = r3.sc
            if (r3 != 0) goto L30
        L23:
            com.kwad.components.ad.reward.e r3 = com.kwad.components.ad.reward.e.gy()
            com.kwad.components.ad.reward.model.c r0 = r2.mModel
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.getAdTemplate()
            r3.L(r0)
        L30:
            com.kwad.components.ad.reward.model.c r3 = r2.mModel
            com.kwad.sdk.core.response.model.AdTemplate r3 = r3.getAdTemplate()
            boolean r0 = r2.isNeoScan()
            com.kwad.sdk.core.adlog.c.i(r3, r0)
            T extends com.kwad.components.core.m.a r3 = r2.mCallerContext
            com.kwad.components.ad.reward.g r3 = (com.kwad.components.ad.reward.g) r3
            com.kwad.sdk.core.response.model.AdTemplate r3 = r3.mAdTemplate
            boolean r3 = r3.converted
            if (r3 != 0) goto L54
            com.kwad.components.ad.reward.c.a r3 = com.kwad.components.ad.reward.c.a.hV()
            com.kwad.components.ad.reward.c.b r3 = r3.hW()
            int r0 = com.kwad.components.ad.reward.c.b.ul
            r3.aa(r0)
        L54:
            com.kwad.components.ad.reward.KSRewardVideoActivityProxy$7 r3 = new com.kwad.components.ad.reward.KSRewardVideoActivityProxy$7
            r3.<init>(r2)
            com.kwad.sdk.utils.bw.runOnUiThread(r3)
            com.kwad.components.ad.reward.model.c r3 = r2.mModel
            com.kwad.sdk.core.response.model.AdInfo r3 = r3.cU()
            boolean r3 = com.kwad.sdk.core.response.b.a.cY(r3)
            if (r3 == 0) goto L8d
            T extends com.kwad.components.core.m.a r3 = r2.mCallerContext
            r0 = r3
            com.kwad.components.ad.reward.g r0 = (com.kwad.components.ad.reward.g) r0
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            boolean r0 = r0.converted
            if (r0 != 0) goto L8d
            r0 = r3
            com.kwad.components.ad.reward.g r0 = (com.kwad.components.ad.reward.g) r0
            boolean r0 = r0.rT
            if (r0 != 0) goto L8d
            com.kwad.components.ad.reward.g r3 = (com.kwad.components.ad.reward.g) r3
            boolean r3 = r3.gU()
            if (r3 != 0) goto L8d
            android.app.Activity r3 = r2.getActivity()
            T extends com.kwad.components.core.m.a r0 = r2.mCallerContext
            com.kwad.components.ad.reward.g r0 = (com.kwad.components.ad.reward.g) r0
            com.kwad.components.ad.reward.g.a(r3, r0)
        L8d:
            return
    }

    private boolean isLaunchTaskCompleted() {
            r2 = this;
            T extends com.kwad.components.core.m.a r0 = r2.mCallerContext
            r1 = r0
            com.kwad.components.ad.reward.g r1 = (com.kwad.components.ad.reward.g) r1
            com.kwad.components.ad.reward.l.b.a r1 = r1.sm
            if (r1 == 0) goto L15
            com.kwad.components.ad.reward.g r0 = (com.kwad.components.ad.reward.g) r0
            com.kwad.components.ad.reward.l.b.a r0 = r0.sm
            boolean r0 = r0.isCompleted()
            if (r0 == 0) goto L15
            r0 = 1
            return r0
        L15:
            r0 = 0
            return r0
    }

    private boolean isNeoScan() {
            r2 = this;
            com.kwad.components.ad.reward.model.c r0 = r2.mModel
            com.kwad.sdk.core.response.model.AdGlobalConfigInfo r0 = r0.iy()
            if (r0 == 0) goto L14
            com.kwad.components.ad.reward.model.c r0 = r2.mModel
            com.kwad.sdk.core.response.model.AdGlobalConfigInfo r0 = r0.iy()
            int r0 = r0.neoPageType
            r1 = 1
            if (r0 != r1) goto L14
            return r1
        L14:
            r0 = 0
            return r0
    }

    public static void launch(android.app.Activity r5, com.kwad.sdk.core.response.model.AdResultData r6, @androidx.annotation.NonNull com.kwad.sdk.api.KsVideoPlayConfig r7, com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener r8, com.kwad.components.core.j.d r9, int r10) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = com.kwad.sdk.core.response.b.c.r(r6)
            r1 = 1
            com.kwad.components.ad.reward.monitor.c.i(r1, r0)
            com.kwad.sdk.core.response.model.AdGlobalConfigInfo r2 = r6.adGlobalConfigInfo
            com.kwad.sdk.utils.n.eL(r0)
            if (r2 == 0) goto L17
            int r2 = r2.neoPageType
            if (r2 != r1) goto L17
            r2 = 0
            r7.setShowLandscape(r2)
        L17:
            boolean r2 = r7.isShowLandscape()
            if (r2 == 0) goto L2a
            java.lang.Class<com.kwad.components.ad.reward.KSRewardLandScapeVideoActivityProxy> r2 = com.kwad.components.ad.reward.KSRewardLandScapeVideoActivityProxy.class
            java.lang.Class<com.kwad.sdk.api.proxy.app.KSRewardLandScapeVideoActivity> r3 = com.kwad.sdk.api.proxy.app.KSRewardLandScapeVideoActivity.class
            com.kwad.sdk.service.c.a(r3, r2)
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r5, r3)
            goto L36
        L2a:
            java.lang.Class<com.kwad.components.ad.reward.KSRewardVideoActivityProxy> r2 = com.kwad.components.ad.reward.KSRewardVideoActivityProxy.class
            java.lang.Class<com.kwad.sdk.api.proxy.app.KsRewardVideoActivity> r3 = com.kwad.sdk.api.proxy.app.KsRewardVideoActivity.class
            com.kwad.sdk.service.c.a(r3, r2)
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r5, r3)
        L36:
            r3 = 268435456(0x10000000, float:2.524355E-29)
            r2.setFlags(r3)
            org.json.JSONObject r3 = r0.toJson()
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "key_template_json"
            r2.putExtra(r4, r3)
            com.kwad.components.core.c.f r3 = com.kwad.components.core.c.f.ol()
            int r6 = r3.l(r6)
            java.lang.String r3 = "key_ad_result_cache_idx"
            r2.putExtra(r3, r6)
            java.lang.String r6 = "key_video_play_config"
            r2.putExtra(r6, r7)
            java.lang.String r6 = "key_video_play_config_json"
            java.lang.String r7 = com.kwad.components.core.internal.api.e.a(r7)
            r2.putExtra(r6, r7)
            java.lang.String r6 = "key_template_reward_type"
            r2.putExtra(r6, r10)
            java.lang.String r6 = r0.getUniqueId()
            com.kwad.components.ad.reward.e.f.a(r6, r8, r9)
            com.kwad.components.ad.reward.e.f.O(r6)
            r5.startActivity(r2)     // Catch: java.lang.Throwable -> L86
            com.kwad.sdk.a.a.c r5 = com.kwad.sdk.a.a.c.CU()
            r5.bm(r1)
            com.kwad.components.core.proxy.PageCreateStage r5 = com.kwad.components.core.proxy.PageCreateStage.END_LAUNCH
            java.lang.String r5 = r5.getStage()
            com.kwad.components.ad.reward.monitor.c.c(r1, r0, r5)
            return
        L86:
            r5 = move-exception
            java.lang.String r6 = r5.getMessage()
            com.kwad.components.core.proxy.PageCreateStage r7 = com.kwad.components.core.proxy.PageCreateStage.ERROR_START_ACTIVITY
            java.lang.String r7 = r7.getStage()
            com.kwad.components.ad.reward.monitor.c.a(r1, r0, r7, r6)
            com.kwad.components.core.exception.KSAdPreCreateException r6 = new com.kwad.components.core.exception.KSAdPreCreateException
            java.lang.String r7 = "ksad_pre_create_exception_error_start_activity"
            r6.<init>(r7, r5)
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r6)
            throw r5
    }

    private void markOpenNsCompleted() {
            r2 = this;
            T extends com.kwad.components.core.m.a r0 = r2.mCallerContext
            r1 = r0
            com.kwad.components.ad.reward.g r1 = (com.kwad.components.ad.reward.g) r1
            com.kwad.components.ad.reward.l.a.a r1 = r1.sn
            if (r1 == 0) goto L10
            com.kwad.components.ad.reward.g r0 = (com.kwad.components.ad.reward.g) r0
            com.kwad.components.ad.reward.l.a.a r0 = r0.sn
            r0.markOpenNsCompleted()
        L10:
            return
    }

    private boolean needHandledOnResume() {
            r1 = this;
            T extends com.kwad.components.core.m.a r0 = r1.mCallerContext
            com.kwad.components.ad.reward.g r0 = (com.kwad.components.ad.reward.g) r0
            boolean r0 = r0.gV()
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    private boolean notifyPageDismiss(boolean r6) {
            r5 = this;
            boolean r0 = r5.mPageDismissCalled
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            T extends com.kwad.components.core.m.a r0 = r5.mCallerContext
            if (r0 != 0) goto Lb
            return r1
        Lb:
            com.kwad.components.ad.reward.model.c r0 = r5.mModel
            if (r0 != 0) goto L10
            return r1
        L10:
            r1 = 1
            r5.mPageDismissCalled = r1
            com.kwad.sdk.core.response.model.AdInfo r0 = r0.cU()
            boolean r0 = com.kwad.sdk.core.response.b.a.cS(r0)
            if (r0 == 0) goto L27
            T extends com.kwad.components.core.m.a r0 = r5.mCallerContext
            com.kwad.components.ad.reward.g r0 = (com.kwad.components.ad.reward.g) r0
            boolean r0 = r0.gT()
            if (r0 != 0) goto L42
        L27:
            com.kwad.components.ad.reward.model.c r0 = r5.mModel
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.getAdTemplate()
            com.kwad.sdk.utils.bv r2 = r5.getTimerHelper()
            long r2 = r2.getTime()
            float r2 = (float) r2
            r3 = 1148846080(0x447a0000, float:1000.0)
            float r2 = r2 / r3
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            com.kwad.sdk.core.adlog.c.m(r0, r2)
        L42:
            if (r6 == 0) goto L6e
            com.kwad.components.ad.reward.model.c r6 = r5.mModel
            com.kwad.sdk.core.response.model.AdGlobalConfigInfo r6 = r6.iy()
            if (r6 == 0) goto L56
            com.kwad.components.ad.reward.model.c r6 = r5.mModel
            com.kwad.sdk.core.response.model.AdGlobalConfigInfo r6 = r6.iy()
            int r6 = r6.neoPageType
            if (r6 == r1) goto L98
        L56:
            com.kwad.components.ad.reward.model.c r6 = r5.mModel
            com.kwad.sdk.core.response.model.AdTemplate r6 = r6.getAdTemplate()
            com.kwad.sdk.utils.bv r0 = r5.getTimerHelper()
            long r2 = r0.getTime()
            T extends com.kwad.components.core.m.a r0 = r5.mCallerContext
            com.kwad.components.ad.reward.g r0 = (com.kwad.components.ad.reward.g) r0
            org.json.JSONObject r0 = r0.mReportExtData
            com.kwad.sdk.core.adlog.c.a(r6, r1, r2, r0)
            goto L98
        L6e:
            com.kwad.components.ad.reward.model.c r6 = r5.mModel
            com.kwad.sdk.core.response.model.AdGlobalConfigInfo r6 = r6.iy()
            if (r6 == 0) goto L80
            com.kwad.components.ad.reward.model.c r6 = r5.mModel
            com.kwad.sdk.core.response.model.AdGlobalConfigInfo r6 = r6.iy()
            int r6 = r6.neoPageType
            if (r6 == r1) goto L98
        L80:
            com.kwad.components.ad.reward.model.c r6 = r5.mModel
            com.kwad.sdk.core.response.model.AdTemplate r6 = r6.getAdTemplate()
            com.kwad.sdk.utils.bv r0 = r5.getTimerHelper()
            long r2 = r0.getTime()
            com.kwad.components.ad.reward.model.c r0 = r5.mModel
            org.json.JSONObject r0 = r0.ix()
            r4 = 6
            com.kwad.sdk.core.adlog.c.a(r6, r4, r2, r0)
        L98:
            return r1
    }

    private void notifyRewardStep(int r3, int r4) {
            r2 = this;
            com.kwad.components.ad.reward.model.c r0 = r2.mModel
            if (r0 != 0) goto L5
            goto L20
        L5:
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.getAdTemplate()
            boolean r0 = com.kwad.sdk.core.response.b.e.ew(r0)
            if (r0 == 0) goto L10
            goto L20
        L10:
            T extends com.kwad.components.core.m.a r0 = r2.mCallerContext
            com.kwad.components.ad.reward.g r0 = (com.kwad.components.ad.reward.g) r0
            java.util.List<java.lang.Integer> r0 = r0.rZ
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L21
        L20:
            return
        L21:
            T extends com.kwad.components.core.m.a r0 = r2.mCallerContext
            com.kwad.components.ad.reward.g r0 = (com.kwad.components.ad.reward.g) r0
            java.util.List<java.lang.Integer> r0 = r0.rZ
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r0.add(r1)
            T extends com.kwad.components.core.m.a r0 = r2.mCallerContext
            com.kwad.components.ad.reward.g r0 = (com.kwad.components.ad.reward.g) r0
            com.kwad.components.ad.reward.model.c r1 = r2.mModel
            com.kwad.components.ad.reward.o.a(r3, r4, r0, r1)
            com.kwad.components.ad.reward.KSRewardVideoActivityProxy$6 r0 = new com.kwad.components.ad.reward.KSRewardVideoActivityProxy$6
            r0.<init>(r2, r3, r4)
            com.kwad.sdk.utils.bw.runOnUiThread(r0)
            return
    }

    private void notifyRewardVerify() {
            r3 = this;
            com.kwad.components.ad.reward.model.c r0 = r3.mModel
            if (r0 != 0) goto L5
            goto L23
        L5:
            T extends com.kwad.components.core.m.a r1 = r3.mCallerContext
            com.kwad.components.ad.reward.g r1 = (com.kwad.components.ad.reward.g) r1
            boolean r1 = r1.mCheckExposureResult
            if (r1 != 0) goto Le
            goto L23
        Le:
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.getAdTemplate()
            boolean r0 = com.kwad.sdk.core.response.b.e.ew(r0)
            if (r0 == 0) goto L19
            goto L23
        L19:
            T extends com.kwad.components.core.m.a r0 = r3.mCallerContext
            com.kwad.components.ad.reward.g r0 = (com.kwad.components.ad.reward.g) r0
            boolean r0 = r0.gW()
            if (r0 == 0) goto L24
        L23:
            return
        L24:
            com.kwad.components.ad.reward.model.c r0 = r3.mModel
            boolean r0 = r0.is()
            r1 = 1
            if (r0 == 0) goto L44
            T extends com.kwad.components.core.m.a r0 = r3.mCallerContext
            r2 = r0
            com.kwad.components.ad.reward.g r2 = (com.kwad.components.ad.reward.g) r2
            com.kwad.components.ad.reward.l.b.a r2 = r2.sm
            if (r2 == 0) goto L43
            com.kwad.components.ad.reward.g r0 = (com.kwad.components.ad.reward.g) r0
            com.kwad.components.ad.reward.l.b.a r0 = r0.sm
            boolean r0 = r0.isCompleted()
            if (r0 == 0) goto L43
            r3.handleNotifyVerify(r1)
        L43:
            return
        L44:
            com.kwad.components.ad.reward.model.c r0 = r3.mModel
            boolean r0 = r0.it()
            if (r0 == 0) goto L63
            T extends com.kwad.components.core.m.a r0 = r3.mCallerContext
            r2 = r0
            com.kwad.components.ad.reward.g r2 = (com.kwad.components.ad.reward.g) r2
            com.kwad.components.ad.reward.l.a.a r2 = r2.sn
            if (r2 == 0) goto L62
            com.kwad.components.ad.reward.g r0 = (com.kwad.components.ad.reward.g) r0
            com.kwad.components.ad.reward.l.a.a r0 = r0.sn
            boolean r0 = r0.isCompleted()
            if (r0 == 0) goto L62
            r3.handleNotifyVerify(r1)
        L62:
            return
        L63:
            r0 = 0
            r3.handleNotifyVerify(r0)
            return
    }

    private void notifyRewardVerifyStepByStep() {
            r4 = this;
            com.kwad.components.ad.reward.model.c r0 = r4.mModel
            boolean r0 = r0.is()
            r1 = 0
            if (r0 == 0) goto L17
            r0 = 2
            r4.notifyRewardStep(r0, r1)
            boolean r1 = r4.isLaunchTaskCompleted()
            if (r1 == 0) goto L48
            r4.notifyRewardStep(r0, r0)
            return
        L17:
            com.kwad.components.ad.reward.model.c r0 = r4.mModel
            boolean r0 = r0.it()
            r2 = 1
            if (r0 == 0) goto L3f
            T extends com.kwad.components.core.m.a r0 = r4.mCallerContext
            r3 = r0
            com.kwad.components.ad.reward.g r3 = (com.kwad.components.ad.reward.g) r3
            com.kwad.components.ad.reward.l.a.a r3 = r3.sn
            if (r3 == 0) goto L35
            com.kwad.components.ad.reward.g r0 = (com.kwad.components.ad.reward.g) r0
            com.kwad.components.ad.reward.l.a.a r0 = r0.sn
            boolean r0 = r0.isCompleted()
            if (r0 == 0) goto L35
            r0 = 1
            goto L36
        L35:
            r0 = 0
        L36:
            r4.notifyRewardStep(r2, r1)
            if (r0 == 0) goto L48
            r4.notifyRewardStep(r2, r2)
            return
        L3f:
            boolean r0 = r4.mIsFinishVideoLookStep
            if (r0 != 0) goto L48
            r4.mIsFinishVideoLookStep = r2
            r4.notifyRewardStep(r1, r1)
        L48:
            return
    }

    @com.ksad.annotation.invoker.InvokeBy(invokerClass = com.kwad.sdk.service.c.class, methodId = "initComponentProxyForInvoker")
    public static void register() {
            java.lang.Class<com.kwad.sdk.api.proxy.app.KsRewardVideoActivity> r0 = com.kwad.sdk.api.proxy.app.KsRewardVideoActivity.class
            java.lang.Class<com.kwad.components.ad.reward.KSRewardVideoActivityProxy> r1 = com.kwad.components.ad.reward.KSRewardVideoActivityProxy.class
            com.kwad.sdk.service.c.a(r0, r1)
            return
    }

    private void reportSubPageCreate(java.lang.String r3) {
            r2 = this;
            com.kwad.components.ad.reward.model.c r0 = r2.mModel
            if (r0 == 0) goto L9
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.getAdTemplate()
            goto La
        L9:
            r0 = 0
        La:
            r1 = 1
            com.kwad.components.ad.reward.monitor.c.c(r1, r0, r3)
            return
    }

    @Override // com.kwad.components.core.proxy.f
    public boolean checkIntentData(@androidx.annotation.Nullable android.content.Intent r1) {
            r0 = this;
            com.kwad.components.ad.reward.model.c r1 = com.kwad.components.ad.reward.model.c.a(r1)
            r0.mModel = r1
            if (r1 != 0) goto La
            r1 = 0
            return r1
        La:
            r1 = 1
            return r1
    }

    @Override // com.kwad.components.core.proxy.f, com.kwad.sdk.api.proxy.IActivityProxy
    public void finish() {
            r2 = this;
            super.finish()
            com.kwad.components.ad.reward.e.i r0 = r2.mAdOpenInteractionListener
            r1 = 0
            r0.i(r1)
            return
    }

    @Override // com.kwad.components.core.proxy.f
    public int getLayoutId() {
            r1 = this;
            com.kwad.components.ad.reward.model.c r0 = r1.mModel
            if (r0 == 0) goto Lb
            boolean r0 = r0.jk
            if (r0 == 0) goto Lb
            int r0 = com.kwad.sdk.R.layout.ksad_activity_reward_neo
            return r0
        Lb:
            int r0 = com.kwad.sdk.R.layout.ksad_activity_reward_video_legacy
            return r0
    }

    @Override // com.kwad.components.core.proxy.f
    public java.lang.String getPageName() {
            r1 = this;
            java.lang.String r0 = "KSRewardLandScapeVideoActivityProxy"
            return r0
    }

    @Override // com.kwad.components.offline.api.core.adlive.listener.OnAdLiveResumeInterceptor
    public boolean handledAdLiveOnResume() {
            r1 = this;
            boolean r0 = r1.needHandledOnResume()
            return r0
    }

    @Override // com.kwad.components.core.proxy.f
    public void initData() {
            r5 = this;
            com.kwad.components.ad.reward.model.c r0 = r5.mModel
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.getAdTemplate()
            java.lang.String r0 = r0.getUniqueId()
            r5.listenerKey = r0
            com.kwad.components.ad.reward.e.i r0 = r5.mAdOpenInteractionListener
            com.kwad.components.ad.reward.model.c r1 = r5.mModel
            com.kwad.sdk.core.response.model.AdTemplate r1 = r1.getAdTemplate()
            r0.setAdTemplate(r1)
            com.kwad.components.ad.reward.e.i r0 = r5.mAdOpenInteractionListener
            java.lang.String r1 = r5.getUniqueId()
            r0.R(r1)
            long r0 = android.os.SystemClock.elapsedRealtime()
            r5.mPageEnterTime = r0
            com.kwad.components.ad.reward.model.c r0 = r5.mModel
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.getAdTemplate()
            long r1 = r5.mPageEnterTime
            com.kwad.components.ad.reward.model.c r3 = r5.mModel
            com.kwad.sdk.core.response.model.AdGlobalConfigInfo r3 = r3.iy()
            r4 = 1
            com.kwad.components.ad.reward.monitor.c.a(r4, r0, r1, r3)
            com.kwad.components.ad.reward.model.c r0 = r5.mModel
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.getAdTemplate()
            com.kwad.components.ad.reward.monitor.c.g(r4, r0)
            com.kwad.components.core.t.c r0 = com.kwad.components.core.t.c.sZ()
            r0.a(r5)
            com.kwad.components.ad.reward.b r0 = com.kwad.components.ad.reward.b.gk()
            com.kwad.components.ad.reward.e.l r1 = r5.mRewardVerifyListener
            r0.a(r1)
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

    @Override // com.kwad.components.ad.reward.g.b
    public boolean interceptPlayCardResume() {
            r1 = this;
            boolean r0 = r1.needHandledOnResume()
            return r0
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
            com.kwad.components.ad.reward.model.c r0 = r1.mModel
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.getAdTemplate()
            com.kwad.sdk.commercial.d.c.bL(r0)
            return
    }

    @Override // com.kwad.components.core.proxy.f, com.kwad.sdk.api.proxy.IActivityProxy
    public void onBackPressed() {
            r2 = this;
            com.kwad.components.ad.reward.n r0 = r2.mRewardPresenter
            if (r0 != 0) goto L8
            super.onBackPressed()
            return
        L8:
            com.kwad.components.ad.reward.page.BackPressHandleResult r0 = r0.hx()
            com.kwad.components.ad.reward.page.BackPressHandleResult r1 = com.kwad.components.ad.reward.page.BackPressHandleResult.HANDLED
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L15
            goto L33
        L15:
            com.kwad.components.ad.reward.page.BackPressHandleResult r1 = com.kwad.components.ad.reward.page.BackPressHandleResult.HANDLED_CLOSE
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 == 0) goto L27
            super.onBackPressed()
            com.kwad.components.ad.reward.e.i r0 = r2.mAdOpenInteractionListener
            r0.i(r1)
            return
        L27:
            boolean r0 = r2.mIsBackEnable
            if (r0 == 0) goto L33
            com.kwad.components.ad.reward.e.i r0 = r2.mAdOpenInteractionListener
            r0.i(r1)
            super.onBackPressed()
        L33:
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.kwad.components.core.m.b
    protected com.kwad.components.ad.reward.g onCreateCallerContext() {
            r7 = this;
            com.kwad.components.ad.reward.model.c r0 = r7.mModel
            com.kwad.sdk.core.response.model.AdResultData r0 = r0.iu()
            com.kwad.components.ad.reward.model.c r1 = r7.mModel
            com.kwad.sdk.core.response.model.AdTemplate r1 = r1.getAdTemplate()
            com.kwad.components.ad.reward.model.c r2 = r7.mModel
            com.kwad.sdk.core.response.model.AdInfo r2 = r2.cU()
            com.kwad.components.ad.reward.g r3 = new com.kwad.components.ad.reward.g
            r3.<init>(r7)
            long r4 = r7.mPageEnterTime
            r3.mPageEnterTime = r4
            com.kwad.components.ad.reward.model.c r4 = r7.mModel
            int r4 = r4.iw()
            r5 = 2
            r6 = 1
            if (r4 != r5) goto L27
            r4 = 1
            goto L28
        L27:
            r4 = 0
        L28:
            r3.rC = r4
            com.kwad.components.ad.reward.e.i r4 = r7.mAdOpenInteractionListener
            r3.rD = r4
            com.kwad.components.ad.reward.e.d r4 = r7.mAdRewardStepListener
            r3.mAdRewardStepListener = r4
            com.kwad.components.ad.reward.model.c r4 = r7.mModel
            int r4 = r4.getScreenOrientation()
            r3.mScreenOrientation = r4
            com.kwad.components.ad.reward.model.c r4 = r7.mModel
            com.kwad.sdk.api.KsVideoPlayConfig r4 = r4.iv()
            r3.mVideoPlayConfig = r4
            com.kwad.components.ad.reward.model.c r4 = r7.mModel
            org.json.JSONObject r4 = r4.ix()
            r3.mReportExtData = r4
            com.kwad.sdk.core.view.AdBaseFrameLayout r4 = r7.mRootContainer
            r3.mRootContainer = r4
            r3.a(r0)
            boolean r0 = com.kwad.sdk.core.response.b.b.em(r2)
            if (r0 == 0) goto L5a
            com.kwad.components.ad.reward.LoadStrategy r0 = com.kwad.components.ad.reward.LoadStrategy.FULL_TK
            goto L5c
        L5a:
            com.kwad.components.ad.reward.LoadStrategy r0 = com.kwad.components.ad.reward.LoadStrategy.MULTI
        L5c:
            r3.sx = r0
            r3.a(r7)
            boolean r0 = com.kwad.sdk.core.response.b.a.aF(r2)
            if (r0 == 0) goto L74
            com.kwad.components.core.e.d.c r0 = new com.kwad.components.core.e.d.c
            com.kwad.components.ad.reward.model.c r4 = r7.mModel
            org.json.JSONObject r4 = r4.ix()
            r0.<init>(r1, r4)
            r3.mApkDownloadHelper = r0
        L74:
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl r0 = new com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl
            android.content.Context r4 = r7.mContext
            r0.<init>(r3, r4, r1)
            r3.rG = r0
            com.kwad.components.ad.reward.e.g r0 = r7.mPlayEndPageListener
            r3.b(r0)
            boolean r0 = com.kwad.sdk.core.response.b.b.cL(r1)
            if (r0 == 0) goto L9e
            com.kwad.components.ad.reward.j r0 = new com.kwad.components.ad.reward.j
            com.kwad.components.ad.reward.model.c r1 = r7.mModel
            org.json.JSONObject r1 = r1.ix()
            r4 = 0
            r0.<init>(r3, r1, r4)
            r3.rH = r0
            com.kwad.components.ad.reward.KSRewardVideoActivityProxy$5 r1 = new com.kwad.components.ad.reward.KSRewardVideoActivityProxy$5
            r1.<init>(r7, r3)
            r0.a(r1)
        L9e:
            boolean r0 = com.kwad.sdk.core.response.b.a.as(r2)
            if (r0 == 0) goto Laf
            com.kwad.components.ad.l.a r0 = new com.kwad.components.ad.l.a
            r0.<init>()
            com.kwad.components.ad.l.a r0 = r0.ah(r6)
            r3.rI = r0
        Laf:
            r3.rS = r6
            boolean r0 = com.kwad.sdk.core.response.b.a.bK(r2)
            if (r0 == 0) goto Lc6
            com.kwad.components.core.playable.a r0 = new com.kwad.components.core.playable.a
            int r1 = com.kwad.sdk.R.id.ksad_playable_webview
            android.view.View r1 = r7.findViewById(r1)
            com.kwad.sdk.core.webview.KsAdWebView r1 = (com.kwad.sdk.core.webview.KsAdWebView) r1
            r0.<init>(r1)
            r3.rF = r0
        Lc6:
            r0 = 0
            r3.sq = r0
            com.kwad.components.ad.reward.model.c r0 = r7.mModel
            com.kwad.sdk.core.response.model.AdInfo r0 = r0.cU()
            if (r0 == 0) goto Lf5
            com.kwad.components.ad.reward.model.c r0 = r7.mModel
            com.kwad.sdk.core.response.model.AdInfo r0 = r0.cU()
            boolean r0 = com.kwad.sdk.core.response.b.a.bK(r0)
            if (r0 == 0) goto Le9
            com.kwad.components.ad.reward.model.c r0 = r7.mModel
            com.kwad.sdk.core.response.model.AdInfo r0 = r0.cU()
            long r0 = com.kwad.sdk.core.response.b.a.ar(r0)
            goto Lf3
        Le9:
            com.kwad.components.ad.reward.model.c r0 = r7.mModel
            com.kwad.sdk.core.response.model.AdInfo r0 = r0.cU()
            long r0 = com.kwad.sdk.core.response.b.a.am(r0)
        Lf3:
            r3.sq = r0
        Lf5:
            com.kwad.sdk.utils.bv r0 = r7.getTimerHelper()
            r3.mTimerHelper = r0
            com.kwad.components.ad.reward.m.e r0 = new com.kwad.components.ad.reward.m.e
            r0.<init>(r3)
            r3.rE = r0
            com.kwad.components.ad.reward.model.c r0 = r7.mModel
            boolean r0 = r0.jk
            r3.jk = r0
            return r3
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
            com.kwad.components.ad.reward.model.c r2 = r1.mModel
            if (r2 == 0) goto Lc
            com.kwad.sdk.core.response.model.AdTemplate r2 = r2.getAdTemplate()
            goto Ld
        Lc:
            r2 = 0
        Ld:
            r0 = 1
            com.kwad.components.ad.reward.monitor.b.b(r0, r2)
            return
    }

    @Override // com.kwad.components.core.m.b
    public com.kwad.sdk.mvp.Presenter onCreatePresenter() {
            r6 = this;
            com.kwad.components.ad.reward.model.c r4 = r6.mModel
            if (r4 != 0) goto L6
            r0 = 0
            return r0
        L6:
            com.kwad.components.ad.reward.n r0 = new com.kwad.components.ad.reward.n
            android.content.Context r2 = r6.mContext
            com.kwad.sdk.core.view.AdBaseFrameLayout r3 = r6.mRootContainer
            T extends com.kwad.components.core.m.a r1 = r6.mCallerContext
            r5 = r1
            com.kwad.components.ad.reward.g r5 = (com.kwad.components.ad.reward.g) r5
            r1 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            r1.mRewardPresenter = r0
            r0.a(r6)
            com.kwad.components.ad.reward.n r0 = r1.mRewardPresenter
            return r0
    }

    @Override // com.kwad.components.core.proxy.f, com.kwad.components.core.proxy.a.c
    public void onCreateStageChange(com.kwad.components.core.proxy.PageCreateStage r3) {
            r2 = this;
            super.onCreateStageChange(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onCreateStageChange: "
            r0.<init>(r1)
            java.lang.String r1 = r3.getStage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "RewardVideo"
            com.kwad.sdk.core.d.c.d(r1, r0)
            java.lang.String r3 = r3.getStage()
            r2.reportSubPageCreate(r3)
            return
    }

    @Override // com.kwad.components.core.m.b, com.kwad.components.core.proxy.f, com.kwad.sdk.api.proxy.IActivityProxy
    public void onDestroy() {
            r2 = this;
            com.kwad.components.ad.reward.b r0 = com.kwad.components.ad.reward.b.gk()     // Catch: java.lang.Throwable -> L2f
            com.kwad.components.ad.reward.e.l r1 = r2.mRewardVerifyListener     // Catch: java.lang.Throwable -> L2f
            r0.b(r1)     // Catch: java.lang.Throwable -> L2f
            super.onDestroy()     // Catch: java.lang.Throwable -> L2f
            com.kwad.components.ad.reward.e.i r0 = r2.mAdOpenInteractionListener     // Catch: java.lang.Throwable -> L2f
            r1 = 0
            r0.i(r1)     // Catch: java.lang.Throwable -> L2f
            T extends com.kwad.components.core.m.a r0 = r2.mCallerContext     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L31
            com.kwad.components.ad.reward.i r0 = com.kwad.components.ad.reward.i.hs()     // Catch: java.lang.Throwable -> L2f
            T extends com.kwad.components.core.m.a r1 = r2.mCallerContext     // Catch: java.lang.Throwable -> L2f
            com.kwad.components.ad.reward.g r1 = (com.kwad.components.ad.reward.g) r1     // Catch: java.lang.Throwable -> L2f
            com.kwad.sdk.core.response.model.AdTemplate r1 = r1.mAdTemplate     // Catch: java.lang.Throwable -> L2f
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L2f
            r0.H(r1)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r0 = r2.getUniqueId()     // Catch: java.lang.Throwable -> L2f
            com.kwad.components.ad.reward.e.f.Q(r0)     // Catch: java.lang.Throwable -> L2f
            goto L31
        L2f:
            r0 = move-exception
            goto L6c
        L31:
            com.kwad.components.ad.reward.model.c r0 = r2.mModel     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L61
            com.kwad.sdk.core.response.model.AdInfo r0 = r0.cU()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.K(r0)     // Catch: java.lang.Throwable -> L2f
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto L54
            android.content.Context r1 = r2.mContext     // Catch: java.lang.Throwable -> L2f
            android.content.Context r1 = r1.getApplicationContext()     // Catch: java.lang.Throwable -> L2f
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)     // Catch: java.lang.Throwable -> L2f
            com.kwad.sdk.core.videocache.f r1 = com.kwad.sdk.core.videocache.c.a.bR(r1)     // Catch: java.lang.Throwable -> L2f
            r1.eM(r0)     // Catch: java.lang.Throwable -> L2f
        L54:
            com.kwad.components.ad.reward.model.c r0 = r2.mModel     // Catch: java.lang.Throwable -> L2f
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.getAdTemplate()     // Catch: java.lang.Throwable -> L2f
            com.kwai.adclient.kscommerciallogger.model.BusinessType r0 = com.kwad.sdk.commercial.d.be(r0)     // Catch: java.lang.Throwable -> L2f
            com.kwad.components.core.g.a.a(r0)     // Catch: java.lang.Throwable -> L2f
        L61:
            com.kwad.components.core.t.c r0 = com.kwad.components.core.t.c.sZ()     // Catch: java.lang.Throwable -> L2f
            r0.b(r2)     // Catch: java.lang.Throwable -> L2f
            r0 = 0
            r2.listenerKey = r0     // Catch: java.lang.Throwable -> L2f
            return
        L6c:
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r0)
            return
    }

    @Override // com.kwad.components.core.t.c.b
    public void onPageClose() {
            r0 = this;
            r0.finish()
            return
    }

    @Override // com.kwad.components.core.m.b, com.kwad.components.core.proxy.f, com.kwad.sdk.api.proxy.IActivityProxy
    public void onPause() {
            r3 = this;
            super.onPause()
            T extends com.kwad.components.core.m.a r0 = r3.mCallerContext
            if (r0 == 0) goto Ld
            com.kwad.components.ad.reward.g r0 = (com.kwad.components.ad.reward.g) r0
            r1 = -1
            r0.mPageEnterTime = r1
        Ld:
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
            com.kwad.components.core.proxy.PageCreateStage r2 = com.kwad.components.core.proxy.PageCreateStage.END_CHILD_ON_PRE_CREATE
            java.lang.String r2 = r2.getStage()
            r1.reportSubPageCreate(r2)
            return
    }

    @Override // com.kwad.sdk.api.proxy.IActivityProxy
    public void onPreDestroy() {
            r1 = this;
            super.onPreDestroy()
            com.kwad.components.core.webview.tachikoma.e.c r0 = com.kwad.components.core.webview.tachikoma.e.c.vO()
            r0.vP()
            return
    }

    @Override // com.kwad.components.core.m.b, com.kwad.components.core.proxy.f, com.kwad.sdk.api.proxy.IActivityProxy
    public void onResume() {
            r2 = this;
            super.onResume()     // Catch: java.lang.Throwable -> L12
            com.kwad.components.ad.reward.model.c r0 = r2.mModel     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.getAdTemplate()     // Catch: java.lang.Throwable -> L12
            com.kwad.sdk.core.local.a.Hq()     // Catch: java.lang.Throwable -> L12
            com.kwad.sdk.core.local.a.ch(r0)     // Catch: java.lang.Throwable -> L12
            goto L14
        L12:
            r0 = move-exception
            goto L2e
        L14:
            boolean r0 = r2.mReportedPageResume     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L24
            com.kwad.components.ad.reward.model.c r0 = r2.mModel     // Catch: java.lang.Throwable -> L12
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.getAdTemplate()     // Catch: java.lang.Throwable -> L12
            r1 = 1
            com.kwad.components.ad.reward.monitor.c.f(r1, r0)     // Catch: java.lang.Throwable -> L12
            r2.mReportedPageResume = r1     // Catch: java.lang.Throwable -> L12
        L24:
            com.kwad.components.ad.reward.c.a r0 = com.kwad.components.ad.reward.c.a.hV()     // Catch: java.lang.Throwable -> L12
            android.content.Context r1 = r2.mContext     // Catch: java.lang.Throwable -> L12
            r0.R(r1)     // Catch: java.lang.Throwable -> L12
            return
        L2e:
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r0)
            return
    }

    @Override // com.kwad.components.ad.reward.n.a
    public void onUnbind() {
            r2 = this;
            r0 = 0
            r2.mIsBackEnable = r0
            T extends com.kwad.components.core.m.a r1 = r2.mCallerContext
            com.kwad.components.ad.reward.g r1 = (com.kwad.components.ad.reward.g) r1
            r1.F(r0)
            T extends com.kwad.components.core.m.a r1 = r2.mCallerContext
            com.kwad.components.ad.reward.g r1 = (com.kwad.components.ad.reward.g) r1
            r1.rX = r0
            return
    }
}
