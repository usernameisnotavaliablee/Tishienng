package com.kwad.components.ad.interstitial.report;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.ksad.json.annotation.KsJson
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class InterstitialReportInfo extends com.kwad.sdk.commercial.c.a implements java.io.Serializable {
    public static final int DOWNLOAD_FAILED = 2;
    public static final int DOWNLOAD_STATUS_ERROR = 2;
    public static final int DOWNLOAD_STATUS_START = 1;
    public static final int DOWNLOAD_SUCCESS = 1;
    public static final int DOWNLOAD_TYPE_ALL = 2;
    public static final int DOWNLOAD_TYPE_ONLINE = 1;
    public static final int DOWNLOAD_TYPE_PART = 3;
    public static final int LOAD_STATUS_AD_SHOWN = 4;
    public static final int LOAD_STATUS_DATA_FINISH = 2;
    public static final int LOAD_STATUS_FAILED = 5;
    public static final int LOAD_STATUS_LOAD_FINISH = 3;
    public static final int LOAD_STATUS_RENDER_FAILED = 12;
    public static final int LOAD_STATUS_RENDER_START = 10;
    public static final int LOAD_STATUS_RENDER_SUCCESS = 7;
    public static final int LOAD_STATUS_SERVER_SHOW = 11;
    public static final int LOAD_STATUS_SHOW_AD_CALL = 6;
    public static final int LOAD_STATUS_SHOW_FAILED = 9;
    public static final int LOAD_STATUS_SHOW_SUCCESS = 8;
    public static final int LOAD_STATUS_START = 1;
    public static final int LOAD_TYPE_CACHE = 2;
    public static final int LOAD_TYPE_ONLINE = 1;
    public static final int TYPE_H5 = 2;
    public static final int TYPE_NATIVE = 1;
    public static final int TYPE_TK = 3;
    public static final int VIDEO_STATUS_1 = 1;
    public static final int VIDEO_STATUS_2 = 2;
    public static final int VIDEO_STATUS_3 = 3;
    private static final long serialVersionUID = 6882024284587637114L;
    public java.lang.String abParams;
    public long actionType;
    public long callbackType;
    public long clickSceneType;
    public long creativeId;
    public long downloadDuration;
    public long downloadSize;
    public int downloadType;
    public int expectedRenderType;
    public long itemClickType;
    public long loadDataTime;
    public int materialType;
    public long playStartedDuration;
    public long renderDuration;
    public int renderType;
    public int status;
    public int type;
    public long videoDuration;
    public java.lang.String videoUrl;
    public double visiblePercent;

    public InterstitialReportInfo() {
            r3 = this;
            r3.<init>()
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "interstitialAdLoadProcessChange"
            int r2 = com.kwad.sdk.core.config.e.EW()
            com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
            java.lang.String r1 = "videoCacheOptType"
            int r2 = com.kwad.sdk.core.config.e.Ge()
            com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
            java.lang.String r1 = "okHttpSupport"
            boolean r2 = r3.isOkHttpSupported()
            com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
            java.lang.String r1 = "insertConfigShowPercent"
            int r2 = com.kwad.sdk.core.config.e.Fb()
            com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
            java.lang.String r0 = r0.toString()
            r3.abParams = r0
            return
    }

    public InterstitialReportInfo(com.kwad.sdk.core.response.model.AdTemplate r4) {
            r3 = this;
            r3.<init>()
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "interstitialAdLoadProcessChange"
            int r2 = com.kwad.sdk.core.config.e.EW()
            com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
            java.lang.String r1 = "videoCacheOptType"
            int r2 = com.kwad.sdk.core.config.e.Ge()
            com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
            java.lang.String r1 = "okHttpSupport"
            boolean r2 = r3.isOkHttpSupported()
            com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
            java.lang.String r1 = "downloadStatus"
            int r4 = r4.getDownloadStatus()
            com.kwad.sdk.utils.aa.putValue(r0, r1, r4)
            java.lang.String r4 = "insertConfigShowPercent"
            int r1 = com.kwad.sdk.core.config.e.Fb()
            com.kwad.sdk.utils.aa.putValue(r0, r4, r1)
            java.lang.String r4 = r0.toString()
            r3.abParams = r4
            return
    }

    boolean isOkHttpSupported() {
            r1 = this;
            java.lang.String r0 = "okhttp3.OkHttpClient"
            java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    public com.kwad.components.ad.interstitial.report.InterstitialReportInfo setAbParams(java.lang.String r1) {
            r0 = this;
            r0.abParams = r1
            return r0
    }

    public com.kwad.components.ad.interstitial.report.InterstitialReportInfo setActionType(long r1) {
            r0 = this;
            r0.actionType = r1
            return r0
    }

    public com.kwad.components.ad.interstitial.report.InterstitialReportInfo setCallbackType(long r1) {
            r0 = this;
            r0.callbackType = r1
            return r0
    }

    public com.kwad.components.ad.interstitial.report.InterstitialReportInfo setClickSceneType(long r1) {
            r0 = this;
            r0.clickSceneType = r1
            return r0
    }

    public com.kwad.components.ad.interstitial.report.InterstitialReportInfo setCreativeId(long r1) {
            r0 = this;
            r0.creativeId = r1
            return r0
    }

    public com.kwad.components.ad.interstitial.report.InterstitialReportInfo setDownloadDuration(long r1) {
            r0 = this;
            r0.downloadDuration = r1
            return r0
    }

    public com.kwad.components.ad.interstitial.report.InterstitialReportInfo setDownloadSize(long r1) {
            r0 = this;
            r0.downloadSize = r1
            return r0
    }

    public com.kwad.components.ad.interstitial.report.InterstitialReportInfo setDownloadType(int r1) {
            r0 = this;
            r0.downloadType = r1
            return r0
    }

    public com.kwad.components.ad.interstitial.report.InterstitialReportInfo setExpectedRenderType() {
            r1 = this;
            r0 = 3
            r1.expectedRenderType = r0
            return r1
    }

    public com.kwad.components.ad.interstitial.report.InterstitialReportInfo setItemClickType(long r1) {
            r0 = this;
            r0.itemClickType = r1
            return r0
    }

    public com.kwad.components.ad.interstitial.report.InterstitialReportInfo setLoadDataTime(long r1) {
            r0 = this;
            r0.loadDataTime = r1
            return r0
    }

    public com.kwad.components.ad.interstitial.report.InterstitialReportInfo setMaterialType(int r1) {
            r0 = this;
            r0.materialType = r1
            return r0
    }

    public com.kwad.components.ad.interstitial.report.InterstitialReportInfo setPlayStartedDuration(long r1) {
            r0 = this;
            r0.playStartedDuration = r1
            return r0
    }

    public com.kwad.components.ad.interstitial.report.InterstitialReportInfo setRenderDuration(long r1) {
            r0 = this;
            r0.renderDuration = r1
            return r0
    }

    public com.kwad.components.ad.interstitial.report.InterstitialReportInfo setRenderType(int r1) {
            r0 = this;
            r0.renderType = r1
            return r0
    }

    public com.kwad.components.ad.interstitial.report.InterstitialReportInfo setStatus(int r1) {
            r0 = this;
            r0.status = r1
            return r0
    }

    public com.kwad.components.ad.interstitial.report.InterstitialReportInfo setType(int r1) {
            r0 = this;
            r0.type = r1
            return r0
    }

    public com.kwad.components.ad.interstitial.report.InterstitialReportInfo setVideoDuration(long r1) {
            r0 = this;
            r0.videoDuration = r1
            return r0
    }

    public com.kwad.components.ad.interstitial.report.InterstitialReportInfo setVideoUrl(java.lang.String r1) {
            r0 = this;
            r0.videoUrl = r1
            return r0
    }

    public com.kwad.components.ad.interstitial.report.InterstitialReportInfo setVisiblePercent(double r1) {
            r0 = this;
            r0.visiblePercent = r1
            return r0
    }
}
