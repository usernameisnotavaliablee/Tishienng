package com.kwad.components.offline.api.tk.model.report;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class TKDownloadMsg extends com.kwad.components.offline.api.core.model.BaseOfflineCompoJsonParse<com.kwad.components.offline.api.tk.model.report.TKDownloadMsg> implements java.io.Serializable {
    public static final int ENV_SUCCESS = 3;
    public static final int FAIL = 2;
    private static final int INVALID_DOWNLOAD_STATE = -1;
    public static final int START = 0;
    public static final int SUCCESS = 1;
    private static final long serialVersionUID = -8872909341685100922L;
    public long availableTime;
    public int downloadState;
    public long downloadTime;
    public java.lang.String errorDetail;
    public java.lang.String errorReason;
    public int loadingTimes;
    public long offlineLoadTime;
    public int offlineSource;
    public int preload;
    public int retryCount;
    public long soLoadTime;
    public int soSource;
    public java.lang.String templateId;
    public int threadPoolCoreSize;
    public java.lang.String versionCode;

    public TKDownloadMsg() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.downloadState = r0
            return
    }

    @Override // com.kwad.components.offline.api.core.model.BaseOfflineCompoJsonParse
    public /* bridge */ /* synthetic */ void parseJson(com.kwad.components.offline.api.tk.model.report.TKDownloadMsg r1, org.json.JSONObject r2) {
            r0 = this;
            com.kwad.components.offline.api.tk.model.report.TKDownloadMsg r1 = (com.kwad.components.offline.api.tk.model.report.TKDownloadMsg) r1
            r0.parseJson2(r1, r2)
            return
    }

    /* renamed from: parseJson, reason: avoid collision after fix types in other method */
    public void parseJson2(com.kwad.components.offline.api.tk.model.report.TKDownloadMsg r6, org.json.JSONObject r7) {
            r5 = this;
            if (r7 != 0) goto L3
            return
        L3:
            java.lang.String r0 = "download_state"
            int r0 = r7.optInt(r0)
            r6.downloadState = r0
            java.lang.String r0 = "download_time"
            long r0 = r7.optLong(r0)
            r6.downloadTime = r0
            java.lang.String r0 = "preload"
            int r0 = r7.optInt(r0)
            r6.preload = r0
            java.lang.String r0 = "error_reason"
            java.lang.String r1 = r7.optString(r0)
            r6.errorReason = r1
            java.lang.Object r0 = r7.opt(r0)
            java.lang.Object r1 = org.json.JSONObject.NULL
            java.lang.String r2 = ""
            if (r0 != r1) goto L2f
            r6.errorReason = r2
        L2f:
            java.lang.String r0 = "template_id"
            java.lang.String r3 = r7.optString(r0)
            r6.templateId = r3
            java.lang.Object r0 = r7.opt(r0)
            if (r0 != r1) goto L3f
            r6.templateId = r2
        L3f:
            java.lang.String r0 = "version_code"
            java.lang.String r3 = r7.optString(r0)
            r6.versionCode = r3
            java.lang.Object r0 = r7.opt(r0)
            if (r0 != r1) goto L4f
            r6.versionCode = r2
        L4f:
            java.lang.String r0 = "retry_count"
            int r0 = r7.optInt(r0)
            r6.retryCount = r0
            java.lang.String r0 = "loading_times"
            int r0 = r7.optInt(r0)
            r6.loadingTimes = r0
            java.lang.String r0 = "offline_source"
            int r0 = r7.optInt(r0)
            r6.offlineSource = r0
            java.lang.String r0 = "so_source"
            int r0 = r7.optInt(r0)
            r6.soSource = r0
            java.lang.String r0 = "offline_load_time"
            long r3 = r7.optLong(r0)
            r6.offlineLoadTime = r3
            java.lang.String r0 = "so_load_time"
            long r3 = r7.optLong(r0)
            r6.soLoadTime = r3
            java.lang.String r0 = "error_detail"
            java.lang.String r3 = r7.optString(r0)
            r6.errorDetail = r3
            java.lang.Object r0 = r7.opt(r0)
            if (r0 != r1) goto L8f
            r6.errorDetail = r2
        L8f:
            java.lang.String r0 = "thread_pool_core_size"
            int r0 = r7.optInt(r0)
            r6.threadPoolCoreSize = r0
            java.lang.String r0 = "available_time"
            long r0 = r7.optLong(r0)
            r6.availableTime = r0
            return
    }

    public com.kwad.components.offline.api.tk.model.report.TKDownloadMsg setDownloadState(int r1) {
            r0 = this;
            r0.downloadState = r1
            return r0
    }

    public com.kwad.components.offline.api.tk.model.report.TKDownloadMsg setDownloadTime(long r1) {
            r0 = this;
            r0.downloadTime = r1
            return r0
    }

    public com.kwad.components.offline.api.tk.model.report.TKDownloadMsg setErrorDetail(java.lang.String r1) {
            r0 = this;
            r0.errorDetail = r1
            return r0
    }

    public com.kwad.components.offline.api.tk.model.report.TKDownloadMsg setErrorReason(java.lang.String r1) {
            r0 = this;
            r0.errorReason = r1
            return r0
    }

    public com.kwad.components.offline.api.tk.model.report.TKDownloadMsg setInitSdkTimeConsuming(long r1) {
            r0 = this;
            r0.availableTime = r1
            return r0
    }

    public com.kwad.components.offline.api.tk.model.report.TKDownloadMsg setLoadingTimes(int r1) {
            r0 = this;
            r0.loadingTimes = r1
            return r0
    }

    public com.kwad.components.offline.api.tk.model.report.TKDownloadMsg setOfflineLoadTime(long r1) {
            r0 = this;
            r0.offlineLoadTime = r1
            return r0
    }

    public com.kwad.components.offline.api.tk.model.report.TKDownloadMsg setOfflineSource(int r1) {
            r0 = this;
            r0.offlineSource = r1
            return r0
    }

    public com.kwad.components.offline.api.tk.model.report.TKDownloadMsg setPreload(int r1) {
            r0 = this;
            r0.preload = r1
            return r0
    }

    public com.kwad.components.offline.api.tk.model.report.TKDownloadMsg setRetryCount(int r1) {
            r0 = this;
            r0.retryCount = r1
            return r0
    }

    public com.kwad.components.offline.api.tk.model.report.TKDownloadMsg setSoLoadTime(long r1) {
            r0 = this;
            r0.soLoadTime = r1
            return r0
    }

    public com.kwad.components.offline.api.tk.model.report.TKDownloadMsg setSoSource(int r1) {
            r0 = this;
            r0.soSource = r1
            return r0
    }

    public com.kwad.components.offline.api.tk.model.report.TKDownloadMsg setTemplateId(java.lang.String r1) {
            r0 = this;
            r0.templateId = r1
            return r0
    }

    public com.kwad.components.offline.api.tk.model.report.TKDownloadMsg setThreadPoolCoreSize(int r1) {
            r0 = this;
            r0.threadPoolCoreSize = r1
            return r0
    }

    public com.kwad.components.offline.api.tk.model.report.TKDownloadMsg setVersionCode(java.lang.String r1) {
            r0 = this;
            r0.versionCode = r1
            return r0
    }

    @Override // com.kwad.components.offline.api.core.model.BaseOfflineCompoJsonParse
    public /* bridge */ /* synthetic */ org.json.JSONObject toJson(com.kwad.components.offline.api.tk.model.report.TKDownloadMsg r1) {
            r0 = this;
            com.kwad.components.offline.api.tk.model.report.TKDownloadMsg r1 = (com.kwad.components.offline.api.tk.model.report.TKDownloadMsg) r1
            org.json.JSONObject r1 = r0.toJson2(r1)
            return r1
    }

    @Override // com.kwad.components.offline.api.core.model.BaseOfflineCompoJsonParse
    public /* bridge */ /* synthetic */ org.json.JSONObject toJson(com.kwad.components.offline.api.tk.model.report.TKDownloadMsg r1, org.json.JSONObject r2) {
            r0 = this;
            com.kwad.components.offline.api.tk.model.report.TKDownloadMsg r1 = (com.kwad.components.offline.api.tk.model.report.TKDownloadMsg) r1
            org.json.JSONObject r1 = r0.toJson2(r1, r2)
            return r1
    }

    /* renamed from: toJson, reason: avoid collision after fix types in other method */
    public org.json.JSONObject toJson2(com.kwad.components.offline.api.tk.model.report.TKDownloadMsg r2) {
            r1 = this;
            r0 = 0
            org.json.JSONObject r2 = r1.toJson2(r2, r0)
            return r2
    }

    /* renamed from: toJson, reason: avoid collision after fix types in other method */
    public org.json.JSONObject toJson2(com.kwad.components.offline.api.tk.model.report.TKDownloadMsg r7, org.json.JSONObject r8) {
            r6 = this;
            if (r8 != 0) goto L7
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
        L7:
            java.lang.String r0 = "download_state"
            int r1 = r7.downloadState
            com.kwad.components.offline.api.core.utils.JsonHelper.putValue(r8, r0, r1)
            java.lang.String r0 = "thread_pool_core_size"
            int r1 = r7.threadPoolCoreSize
            com.kwad.components.offline.api.core.utils.JsonHelper.putValue(r8, r0, r1)
            java.lang.String r0 = "available_time"
            long r1 = r7.availableTime
            com.kwad.components.offline.api.core.utils.JsonHelper.putValue(r8, r0, r1)
            long r0 = r7.downloadTime
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L29
            java.lang.String r4 = "download_time"
            com.kwad.components.offline.api.core.utils.JsonHelper.putValue(r8, r4, r0)
        L29:
            int r0 = r7.preload
            if (r0 == 0) goto L32
            java.lang.String r1 = "preload"
            com.kwad.components.offline.api.core.utils.JsonHelper.putValue(r8, r1, r0)
        L32:
            java.lang.String r0 = r7.errorReason
            java.lang.String r1 = ""
            if (r0 == 0) goto L45
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L45
            java.lang.String r0 = "error_reason"
            java.lang.String r4 = r7.errorReason
            com.kwad.components.offline.api.core.utils.JsonHelper.putValue(r8, r0, r4)
        L45:
            java.lang.String r0 = r7.templateId
            if (r0 == 0) goto L56
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L56
            java.lang.String r0 = "template_id"
            java.lang.String r4 = r7.templateId
            com.kwad.components.offline.api.core.utils.JsonHelper.putValue(r8, r0, r4)
        L56:
            java.lang.String r0 = r7.versionCode
            if (r0 == 0) goto L67
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L67
            java.lang.String r0 = "version_code"
            java.lang.String r4 = r7.versionCode
            com.kwad.components.offline.api.core.utils.JsonHelper.putValue(r8, r0, r4)
        L67:
            int r0 = r7.retryCount
            if (r0 == 0) goto L70
            java.lang.String r4 = "retry_count"
            com.kwad.components.offline.api.core.utils.JsonHelper.putValue(r8, r4, r0)
        L70:
            int r0 = r7.loadingTimes
            if (r0 == 0) goto L79
            java.lang.String r4 = "loading_times"
            com.kwad.components.offline.api.core.utils.JsonHelper.putValue(r8, r4, r0)
        L79:
            int r0 = r7.offlineSource
            if (r0 == 0) goto L82
            java.lang.String r4 = "offline_source"
            com.kwad.components.offline.api.core.utils.JsonHelper.putValue(r8, r4, r0)
        L82:
            int r0 = r7.soSource
            if (r0 == 0) goto L8b
            java.lang.String r4 = "so_source"
            com.kwad.components.offline.api.core.utils.JsonHelper.putValue(r8, r4, r0)
        L8b:
            long r4 = r7.offlineLoadTime
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L96
            java.lang.String r0 = "offline_load_time"
            com.kwad.components.offline.api.core.utils.JsonHelper.putValue(r8, r0, r4)
        L96:
            long r4 = r7.soLoadTime
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto La1
            java.lang.String r0 = "so_load_time"
            com.kwad.components.offline.api.core.utils.JsonHelper.putValue(r8, r0, r4)
        La1:
            java.lang.String r0 = r7.errorDetail
            if (r0 == 0) goto Lb2
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lb2
            java.lang.String r0 = "error_detail"
            java.lang.String r7 = r7.errorDetail
            com.kwad.components.offline.api.core.utils.JsonHelper.putValue(r8, r0, r7)
        Lb2:
            return r8
    }
}
