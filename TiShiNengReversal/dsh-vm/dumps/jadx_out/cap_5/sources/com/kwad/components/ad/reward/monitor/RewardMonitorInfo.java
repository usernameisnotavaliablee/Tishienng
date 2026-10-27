package com.kwad.components.ad.reward.monitor;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.ksad.json.annotation.KsJson
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class RewardMonitorInfo extends com.kwad.sdk.commercial.c.a implements java.io.Serializable {
    public static final int DOWNLOAD_TYPE_ALL = 2;
    public static final int DOWNLOAD_TYPE_ONLINE = 1;
    public static final int DOWNLOAD_TYPE_PART = 3;
    public static final int LOAD_STATUS_DATA_FINISH = 2;
    public static final int LOAD_STATUS_FAIL = 4;
    public static final int LOAD_STATUS_LOAD_FINISH = 3;
    public static final int LOAD_STATUS_RESPONSE_DATA = 6;
    public static final int LOAD_STATUS_START = 1;
    public static final int LOAD_STATUS_START_CACHE = 7;
    public static final int LOAD_STATUS_START_REQUEST = 5;
    public static final int LOAD_TYPE_LOCAL = 2;
    public static final int LOAD_TYPE_NET = 1;
    public static final int PAGE_STATUS_AD_PV = 6;
    public static final int PAGE_STATUS_ENTRY = 1;
    public static final int PAGE_STATUS_FRAUD_VERIFY = 10;
    public static final int PAGE_STATUS_PAGE_RESUME = 5;
    public static final int PAGE_STATUS_PREVIEW_H5_ERROR = 9;
    public static final int PAGE_STATUS_PREVIEW_H5_START = 7;
    public static final int PAGE_STATUS_PREVIEW_H5_SUCCESS = 8;
    public static final int PAGE_STATUS_SHOW_AD_CALL = 3;
    public static final int PAGE_STATUS_SHOW_INTERCEPT = 4;
    public static final int PAGE_STATUS_START_PLAY = 2;
    public static final int PAGE_STATUS_SUB_PAGE_CREATE = 101;
    public static final int REWARD_TYPE_DEEP = 1;
    public static final int REWARD_TYPE_NORMAL = 0;
    public static final int SCENE_TYPE_IMAGE = 2;
    public static final int SCENE_TYPE_LIVE = 1;
    public static final int SCENE_TYPE_SCAN_AGGREGATION = 3;
    public static final int SCENE_TYPE_VIDEO = 0;
    public static final long serialVersionUID = 1080394611500009098L;
    public int adCount;
    public int adSceneType;
    public java.lang.String callbackType;
    public long creativeId;
    public long currentDuration;
    public long dataDownloadInterval;
    public long dataLoadInterval;
    public long downloadDuration;
    public long downloadSize;
    public int downloadType;
    public boolean enableFullscreenLayoutOptimise;
    public boolean enableRewardLayoutOptimise;
    public int fraudVerifyCode;
    public int fraudVerifyType;
    public java.lang.String interceptReason;
    public java.lang.String launchFrom;
    public long loadDataDuration;
    public int loadStatus;
    public int loadType;
    public java.lang.String materialRenderType;
    public int materialType;
    public int operationType;
    public int pageStatus;
    public long posId;
    public long renderDuration;
    public int rewardTaskType;
    public int rewardType;
    public java.lang.String subStage;
    public int taskStep;
    public int taskType;
    public int tkRenderType;
    public long totalDuration;
    public long videoDuration;
    public java.lang.String videoUrl;

    public RewardMonitorInfo() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.rewardType = r0
            r1.taskType = r0
            r1.taskStep = r0
            boolean r0 = com.kwad.components.ad.reward.a.b.hN()
            r1.enableRewardLayoutOptimise = r0
            boolean r0 = com.kwad.components.ad.reward.a.b.hO()
            r1.enableFullscreenLayoutOptimise = r0
            return
    }

    @Override // com.kwad.sdk.core.response.a.a
    public void afterToJson(org.json.JSONObject r4) {
            r3 = this;
            super.afterToJson(r4)
            int r0 = r3.rewardType
            java.lang.String r1 = "reward_type"
            r2 = -1
            if (r0 == r2) goto Le
            com.kwad.sdk.utils.aa.putValue(r4, r1, r0)
            goto L11
        Le:
            r4.remove(r1)
        L11:
            int r0 = r3.taskType
            java.lang.String r1 = "task_type"
            if (r0 == r2) goto L1b
            com.kwad.sdk.utils.aa.putValue(r4, r1, r0)
            goto L1e
        L1b:
            r4.remove(r1)
        L1e:
            int r0 = r3.taskStep
            java.lang.String r1 = "task_step"
            if (r0 == r2) goto L28
            com.kwad.sdk.utils.aa.putValue(r4, r1, r0)
            return
        L28:
            r4.remove(r1)
            return
    }

    public com.kwad.components.ad.reward.monitor.RewardMonitorInfo setAdCount(int r1) {
            r0 = this;
            r0.adCount = r1
            return r0
    }

    public com.kwad.components.ad.reward.monitor.RewardMonitorInfo setAdSceneType(int r1) {
            r0 = this;
            r0.adSceneType = r1
            return r0
    }

    @Override // com.kwad.sdk.commercial.c.a
    public com.kwad.components.ad.reward.monitor.RewardMonitorInfo setAdTemplate(com.kwad.sdk.core.response.model.AdTemplate r4) {
            r3 = this;
            if (r4 != 0) goto L3
            return r3
        L3:
            com.kwad.sdk.commercial.c.a r0 = super.setAdTemplate(r4)
            com.kwad.components.ad.reward.monitor.RewardMonitorInfo r0 = (com.kwad.components.ad.reward.monitor.RewardMonitorInfo) r0
            int r1 = com.kwad.sdk.core.response.b.e.ef(r4)
            com.kwad.sdk.core.response.model.AdInfo r4 = com.kwad.sdk.core.response.b.e.el(r4)
            int r2 = com.kwad.sdk.core.response.b.a.aQ(r4)
            r0.setOperationType(r2)
            java.lang.String r2 = com.kwad.components.ad.reward.model.d.m(r4)
            r0.setMaterialRenderType(r2)
            r2 = 2
            if (r1 != r2) goto L24
            r1 = 1
            goto L25
        L24:
            r1 = 0
        L25:
            int r4 = com.kwad.sdk.core.response.b.b.a(r1, r4)
            r0.setTKRenderType(r4)
            return r0
    }

    @Override // com.kwad.sdk.commercial.c.a
    public /* bridge */ /* synthetic */ com.kwad.sdk.commercial.c.a setAdTemplate(com.kwad.sdk.core.response.model.AdTemplate r1) {
            r0 = this;
            com.kwad.components.ad.reward.monitor.RewardMonitorInfo r1 = r0.setAdTemplate(r1)
            return r1
    }

    public com.kwad.components.ad.reward.monitor.RewardMonitorInfo setCallbackType(java.lang.String r1) {
            r0 = this;
            r0.callbackType = r1
            return r0
    }

    public com.kwad.components.ad.reward.monitor.RewardMonitorInfo setCreativeId(long r1) {
            r0 = this;
            r0.creativeId = r1
            return r0
    }

    public com.kwad.components.ad.reward.monitor.RewardMonitorInfo setCurrentDuration(long r1) {
            r0 = this;
            r0.currentDuration = r1
            return r0
    }

    public com.kwad.components.ad.reward.monitor.RewardMonitorInfo setDataDownloadInterval(long r1) {
            r0 = this;
            r0.dataDownloadInterval = r1
            return r0
    }

    public com.kwad.components.ad.reward.monitor.RewardMonitorInfo setDataLoadInterval(long r1) {
            r0 = this;
            r0.dataLoadInterval = r1
            return r0
    }

    public com.kwad.components.ad.reward.monitor.RewardMonitorInfo setDownloadDuration(long r1) {
            r0 = this;
            r0.downloadDuration = r1
            return r0
    }

    public com.kwad.components.ad.reward.monitor.RewardMonitorInfo setDownloadSize(long r1) {
            r0 = this;
            r0.downloadSize = r1
            return r0
    }

    public com.kwad.components.ad.reward.monitor.RewardMonitorInfo setDownloadType(int r1) {
            r0 = this;
            r0.downloadType = r1
            return r0
    }

    @Override // com.kwad.sdk.commercial.c.a
    public com.kwad.components.ad.reward.monitor.RewardMonitorInfo setErrorCode(int r1) {
            r0 = this;
            super.setErrorCode(r1)
            return r0
    }

    @Override // com.kwad.sdk.commercial.c.a
    public /* bridge */ /* synthetic */ com.kwad.sdk.commercial.c.a setErrorCode(int r1) {
            r0 = this;
            com.kwad.components.ad.reward.monitor.RewardMonitorInfo r1 = r0.setErrorCode(r1)
            return r1
    }

    @Override // com.kwad.sdk.commercial.c.a
    public com.kwad.components.ad.reward.monitor.RewardMonitorInfo setErrorMsg(java.lang.String r1) {
            r0 = this;
            super.setErrorMsg(r1)
            return r0
    }

    @Override // com.kwad.sdk.commercial.c.a
    public /* bridge */ /* synthetic */ com.kwad.sdk.commercial.c.a setErrorMsg(java.lang.String r1) {
            r0 = this;
            com.kwad.components.ad.reward.monitor.RewardMonitorInfo r1 = r0.setErrorMsg(r1)
            return r1
    }

    public com.kwad.components.ad.reward.monitor.RewardMonitorInfo setFraudVerifyCode(int r1) {
            r0 = this;
            r0.fraudVerifyCode = r1
            return r0
    }

    public com.kwad.components.ad.reward.monitor.RewardMonitorInfo setFraudVerifyType(int r1) {
            r0 = this;
            r0.fraudVerifyType = r1
            return r0
    }

    public com.kwad.components.ad.reward.monitor.RewardMonitorInfo setInterceptReason(java.lang.String r1) {
            r0 = this;
            r0.interceptReason = r1
            return r0
    }

    public com.kwad.components.ad.reward.monitor.RewardMonitorInfo setLaunchFrom(java.lang.String r1) {
            r0 = this;
            r0.launchFrom = r1
            return r0
    }

    public com.kwad.components.ad.reward.monitor.RewardMonitorInfo setLoadDataDuration(long r1) {
            r0 = this;
            r0.loadDataDuration = r1
            return r0
    }

    public com.kwad.components.ad.reward.monitor.RewardMonitorInfo setLoadStatus(int r1) {
            r0 = this;
            r0.loadStatus = r1
            return r0
    }

    public com.kwad.components.ad.reward.monitor.RewardMonitorInfo setLoadType(int r1) {
            r0 = this;
            r0.loadType = r1
            return r0
    }

    public com.kwad.components.ad.reward.monitor.RewardMonitorInfo setMaterialRenderType(java.lang.String r1) {
            r0 = this;
            r0.materialRenderType = r1
            return r0
    }

    public com.kwad.components.ad.reward.monitor.RewardMonitorInfo setMaterialType(int r1) {
            r0 = this;
            r0.materialType = r1
            return r0
    }

    public com.kwad.components.ad.reward.monitor.RewardMonitorInfo setOperationType(int r1) {
            r0 = this;
            r0.operationType = r1
            return r0
    }

    public com.kwad.components.ad.reward.monitor.RewardMonitorInfo setPageStatus(int r1) {
            r0 = this;
            r0.pageStatus = r1
            return r0
    }

    @Override // com.kwad.sdk.commercial.c.a
    public com.kwad.components.ad.reward.monitor.RewardMonitorInfo setPosId(long r1) {
            r0 = this;
            com.kwad.sdk.commercial.c.a r1 = super.setPosId(r1)
            com.kwad.components.ad.reward.monitor.RewardMonitorInfo r1 = (com.kwad.components.ad.reward.monitor.RewardMonitorInfo) r1
            return r1
    }

    @Override // com.kwad.sdk.commercial.c.a
    public /* bridge */ /* synthetic */ com.kwad.sdk.commercial.c.a setPosId(long r1) {
            r0 = this;
            com.kwad.components.ad.reward.monitor.RewardMonitorInfo r1 = r0.setPosId(r1)
            return r1
    }

    public com.kwad.components.ad.reward.monitor.RewardMonitorInfo setRenderDuration(long r1) {
            r0 = this;
            r0.renderDuration = r1
            return r0
    }

    public com.kwad.components.ad.reward.monitor.RewardMonitorInfo setRewardTaskType(int r1) {
            r0 = this;
            r0.rewardTaskType = r1
            return r0
    }

    public com.kwad.components.ad.reward.monitor.RewardMonitorInfo setRewardType(int r1) {
            r0 = this;
            r0.rewardType = r1
            return r0
    }

    public com.kwad.components.ad.reward.monitor.RewardMonitorInfo setSubStage(java.lang.String r1) {
            r0 = this;
            r0.subStage = r1
            return r0
    }

    public com.kwad.components.ad.reward.monitor.RewardMonitorInfo setTKRenderType(int r1) {
            r0 = this;
            r0.tkRenderType = r1
            return r0
    }

    public com.kwad.components.ad.reward.monitor.RewardMonitorInfo setTaskStep(int r1) {
            r0 = this;
            r0.taskStep = r1
            return r0
    }

    public com.kwad.components.ad.reward.monitor.RewardMonitorInfo setTaskType(int r1) {
            r0 = this;
            r0.taskType = r1
            return r0
    }

    public com.kwad.components.ad.reward.monitor.RewardMonitorInfo setTotalDuration(long r1) {
            r0 = this;
            r0.totalDuration = r1
            return r0
    }

    public com.kwad.components.ad.reward.monitor.RewardMonitorInfo setVideoDuration(long r1) {
            r0 = this;
            r0.videoDuration = r1
            return r0
    }

    public com.kwad.components.ad.reward.monitor.RewardMonitorInfo setVideoUrl(java.lang.String r1) {
            r0 = this;
            r0.videoUrl = r1
            return r0
    }
}
