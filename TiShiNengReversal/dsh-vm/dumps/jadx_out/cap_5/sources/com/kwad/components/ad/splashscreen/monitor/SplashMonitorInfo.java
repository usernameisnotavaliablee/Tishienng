package com.kwad.components.ad.splashscreen.monitor;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.ksad.json.annotation.KsJson
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class SplashMonitorInfo extends com.kwad.sdk.commercial.c.a implements java.io.Serializable {
    public static final int ADD_PARENT_NULL = 207;
    public static final int ADD_ROOT_NULL = 206;
    public static final int CACHE_IMAGE = 1;
    public static final int CACHE_VIDEO = 2;
    public static final int CHECK_BACKUP_FAILED = 4;
    public static final int CHECK_BACKUP_SUCCESS = 3;
    public static final int CHECK_CACHE = 2;
    public static final int CHECK_INVALID_VIDEO = 5;
    public static final int CHECK_LIVE_NO_CACHE = 8;
    public static final int CHECK_TIME_OUT = 7;
    public static final int ERROR_DOWNLOAD = 4;
    public static final int ERROR_NET = 1;
    public static final java.lang.String ERROR_NET_MSG = "networkError";
    public static final int ERROR_PRELOAD_ID_INVALID = 3;
    public static final java.lang.String ERROR_PRELOAD_ID_INVALID_MSG = "preloadIdError";
    public static final int ERROR_URL_INVALID = 2;
    public static final java.lang.String ERROR_URL_INVALID_MSG = "urlError";
    public static final long LOAD_PROCESS_TYPE_NEW = 1;
    public static final long LOAD_PROCESS_TYPE_OLD = 2;
    public static final int LOAD_STATUS_CHECK_FAILED = 5;
    public static final int LOAD_STATUS_CHECK_SUCCESS = 3;
    public static final int LOAD_STATUS_DATA_FINISH = 2;
    public static final int LOAD_STATUS_FAILED = 4;
    public static final int LOAD_STATUS_LOAD_DATA_PRE = 11;
    public static final int LOAD_STATUS_START = 1;
    public static final int LOAD_TYPE_CACHE = 2;
    public static final int LOAD_TYPE_ONLINE = 1;
    public static final int MATERIAL_IMAGE = 2;
    public static final int MATERIAL_LOAD_NO_TIMEOUT = 3002;
    public static final int MATERIAL_LOAD_START = 3001;
    public static final int MATERIAL_LOAD_TIMEOUT = 3003;
    public static final int MATERIAL_VIDEO = 1;
    public static final int PARENT_CONTAINER_VISIBLE = 200;
    public static final int PRE_LOAD_FAIL = 3;
    public static final int PRE_LOAD_START = 1;
    public static final int PRE_LOAD_SUCCESS = 2;
    public static final int REQUEST_TYPE_FIRST = 1;
    public static final int REQUEST_TYPE_SECOND = 2;
    public static final int SHOW_AD_CALL = 4;
    public static final int SHOW_CALL = 6;
    public static final int SHOW_CALL_ERROR = 7;
    public static final int SHOW_END_RECORD = 8;
    public static final int SHOW_FAIL = 3;
    public static final int SHOW_START = 1;
    public static final int SHOW_SUCCESS = 2;
    public static final int SHOW_TK_OFFLINE_READY = 5;
    public static final int SINGLE_CACHE_FAIL = 2;
    public static final int SINGLE_CACHE_SUCCESS = 1;
    public static final int SPLASH_FROM_FRAGMENT = 2;
    public static final int SPLASH_FROM_VIEW = 1;
    public static final java.lang.String TEMPLATE_ID_EMPTY = "template_id_empty";
    public static final java.lang.String TEMPLATE_RENER_TYPE_ERROR = "template_render_type_error";
    public static final int TK_ENTER = 101;
    public static final int TK_ENV_NOT_READY = 103;
    public static final int TK_LOAD_FAILED = 105;
    public static final int TK_LOAD_START = 102;
    public static final int TK_LOAD_SUCCESS = 104;
    public static final int TK_RENDER_FAILED = 2;
    public static final int TK_RENDER_TIMEOUT = 106;
    public static final int TOTAL_CACHE_REPORT = 2;
    public static final int TOTAL_CACHE_START = 1;
    public static final int TOTAL_CACHE_UPDATE = 3;
    public static final int TYPE_DOWNLOAD = 1;
    public static final int TYPE_UPDATE = 2;
    public static final int UPDATE_TYPE_REPORT = 2;
    public static final int UPDATE_TYPE_WRITE = 1;
    public static final int VIEW_DETACHED_TIME = 203;
    public static final int VIEW_INVISIBLE = 205;
    public static final int VIEW_VISIBLE_AND_IMPRESSION_CHECK_FAILED = 202;
    public static final int VIEW_VISIBLE_AND_IMPRESSION_SUCCESS = 201;
    public static final int VIEW_VISIBLE_AND_IMPRESSION_UNKNOWN_FAILED = 204;
    public static final int WITHOUT_TK_INFO = 1;
    private static final long serialVersionUID = 3528420046810658543L;
    public int actionType;
    public long addLoadTime;
    public long beforeLoadDataTime;
    public int buriedPointOptimizeType;
    public long cacheValidTime;
    public int callbackType;
    public long checkDataTime;
    public int checkStatus;
    public int clearCount;
    public int clearImageCount;
    public int clearVideoCount;
    public long costTime;
    public int count;
    public long creativeId;
    public java.util.List<java.lang.String> creativeIds;
    public java.util.List<java.lang.Integer> elementTypes;
    public boolean hasUnbind;
    public java.util.List<java.lang.String> ids;
    public java.lang.String interactiveStyle;
    public java.lang.String interactivityDefaultStyle;
    public boolean isRotateComposeTimeout;
    public boolean isWebTimeout;
    public long loadAndCheckDataTime;
    public long loadDataTime;
    public long loadProcessType;
    public int loadType;
    public int materialType;
    public java.util.List<java.lang.Integer> materialTypes;
    public long nativeLoadTime;
    public long offlineLoadTime;
    public int offlineSource;
    public boolean parentVisible;
    public long posId;
    public java.lang.String preloadId;
    public java.util.List<java.lang.String> preloadIds;
    public long requestLoadTime;
    public int requestType;
    public boolean rootVisible;
    public long showDurationMs;
    public long showEndTime;
    public int showType;
    public long size;
    public long soLoadTime;
    public int soSource;
    public int status;
    public java.lang.String templateId;
    public int templateVersionCode;
    public long tkDefaultTimeout;
    public long tkFileLoadTime;
    public long tkInitTime;
    public long tkRenderTime;
    public long tkRenderType;
    public long tkTotalTime;
    public int totalCount;
    public int type;
    public int updateType;
    public java.lang.String url;
    public int viewSource;
    public long visibleCheckDelayTime;
    public long webLoadTime;

    public SplashMonitorInfo() {
            r0 = this;
            r0.<init>()
            return
    }

    public com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo setActionType(int r1) {
            r0 = this;
            r0.actionType = r1
            return r0
    }

    @Override // com.kwad.sdk.commercial.c.a
    public com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo setAdTemplate(com.kwad.sdk.core.response.model.AdTemplate r1) {
            r0 = this;
            com.kwad.sdk.commercial.c.a r1 = super.setAdTemplate(r1)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r1 = (com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo) r1
            return r1
    }

    @Override // com.kwad.sdk.commercial.c.a
    public /* bridge */ /* synthetic */ com.kwad.sdk.commercial.c.a setAdTemplate(com.kwad.sdk.core.response.model.AdTemplate r1) {
            r0 = this;
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r1 = r0.setAdTemplate(r1)
            return r1
    }

    public com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo setAddLoadTime(long r1) {
            r0 = this;
            r0.addLoadTime = r1
            return r0
    }

    public com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo setBeforeLoadDataTime(long r1) {
            r0 = this;
            r0.beforeLoadDataTime = r1
            return r0
    }

    public com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo setBuriedPointOptimizeType(int r1) {
            r0 = this;
            r0.buriedPointOptimizeType = r1
            return r0
    }

    public com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo setCacheValidTime(long r1) {
            r0 = this;
            r0.cacheValidTime = r1
            return r0
    }

    public com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo setCallbackType(int r1) {
            r0 = this;
            r0.callbackType = r1
            return r0
    }

    public com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo setCheckDataTime(long r1) {
            r0 = this;
            r0.checkDataTime = r1
            return r0
    }

    public com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo setCheckStatus(int r1) {
            r0 = this;
            r0.checkStatus = r1
            return r0
    }

    public com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo setClearCount(int r1) {
            r0 = this;
            r0.clearCount = r1
            return r0
    }

    public com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo setClearImageCount(int r1) {
            r0 = this;
            r0.clearImageCount = r1
            return r0
    }

    public com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo setClearVideoCount(int r1) {
            r0 = this;
            r0.clearVideoCount = r1
            return r0
    }

    public com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo setCostTime(long r1) {
            r0 = this;
            r0.costTime = r1
            return r0
    }

    public com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo setCount(int r1) {
            r0 = this;
            r0.count = r1
            return r0
    }

    public com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo setCreativeId(long r1) {
            r0 = this;
            r0.creativeId = r1
            return r0
    }

    public com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo setCreativeIds(java.util.List<java.lang.String> r1) {
            r0 = this;
            r0.creativeIds = r1
            return r0
    }

    public com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo setElementTypes(java.util.List<java.lang.Integer> r1) {
            r0 = this;
            r0.elementTypes = r1
            return r0
    }

    @Override // com.kwad.sdk.commercial.c.a
    public com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo setErrorCode(int r1) {
            r0 = this;
            super.setErrorCode(r1)
            return r0
    }

    @Override // com.kwad.sdk.commercial.c.a
    public /* bridge */ /* synthetic */ com.kwad.sdk.commercial.c.a setErrorCode(int r1) {
            r0 = this;
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r1 = r0.setErrorCode(r1)
            return r1
    }

    @Override // com.kwad.sdk.commercial.c.a
    public com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo setErrorMsg(java.lang.String r1) {
            r0 = this;
            super.setErrorMsg(r1)
            return r0
    }

    @Override // com.kwad.sdk.commercial.c.a
    public /* bridge */ /* synthetic */ com.kwad.sdk.commercial.c.a setErrorMsg(java.lang.String r1) {
            r0 = this;
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r1 = r0.setErrorMsg(r1)
            return r1
    }

    public com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo setHasUnbind(boolean r1) {
            r0 = this;
            r0.hasUnbind = r1
            return r0
    }

    public com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo setIds(java.util.List<java.lang.String> r1) {
            r0 = this;
            r0.ids = r1
            return r0
    }

    public com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo setInteractiveStyle(int r1) {
            r0 = this;
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.interactiveStyle = r1
            return r0
    }

    public com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo setInteractivityDefaultStyle(int r1) {
            r0 = this;
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.interactivityDefaultStyle = r1
            return r0
    }

    public com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo setLoadAndCheckDataTime(long r1) {
            r0 = this;
            r0.loadAndCheckDataTime = r1
            return r0
    }

    public com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo setLoadDataTime(long r1) {
            r0 = this;
            r0.loadDataTime = r1
            return r0
    }

    public com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo setLoadProcessType(long r1) {
            r0 = this;
            r0.loadProcessType = r1
            return r0
    }

    public com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo setLoadType(int r1) {
            r0 = this;
            r0.loadType = r1
            return r0
    }

    public com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo setMaterialType(int r1) {
            r0 = this;
            r0.materialType = r1
            return r0
    }

    public com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo setMaterialTypes(java.util.List<java.lang.Integer> r1) {
            r0 = this;
            r0.materialTypes = r1
            return r0
    }

    public com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo setNativeLoadTime(long r1) {
            r0 = this;
            r0.nativeLoadTime = r1
            return r0
    }

    public com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo setOfflineLoadTime(long r1) {
            r0 = this;
            r0.offlineLoadTime = r1
            return r0
    }

    public com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo setOfflineSource(int r1) {
            r0 = this;
            r0.offlineSource = r1
            return r0
    }

    public com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo setParentVisible(boolean r1) {
            r0 = this;
            r0.parentVisible = r1
            return r0
    }

    public com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo setPreloadId(java.lang.String r1) {
            r0 = this;
            r0.preloadId = r1
            return r0
    }

    public com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo setPreloadIds(java.util.List<java.lang.String> r1) {
            r0 = this;
            r0.preloadIds = r1
            return r0
    }

    public com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo setRequestLoadTime(long r1) {
            r0 = this;
            r0.requestLoadTime = r1
            return r0
    }

    public com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo setRequestType(int r1) {
            r0 = this;
            r0.requestType = r1
            return r0
    }

    public com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo setRootVisible(boolean r1) {
            r0 = this;
            r0.rootVisible = r1
            return r0
    }

    public com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo setRotateComposeTimeout(boolean r1) {
            r0 = this;
            r0.isRotateComposeTimeout = r1
            return r0
    }

    public com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo setShowDurationMs(long r1) {
            r0 = this;
            r0.showDurationMs = r1
            return r0
    }

    public com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo setShowEndTime(long r1) {
            r0 = this;
            r0.showEndTime = r1
            return r0
    }

    public com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo setShowType(int r1) {
            r0 = this;
            r0.showType = r1
            return r0
    }

    public com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo setSize(long r1) {
            r0 = this;
            r0.size = r1
            return r0
    }

    public com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo setSoLoadTime(long r1) {
            r0 = this;
            r0.soLoadTime = r1
            return r0
    }

    public com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo setSoSource(int r1) {
            r0 = this;
            r0.soSource = r1
            return r0
    }

    public com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo setStatus(int r1) {
            r0 = this;
            r0.status = r1
            return r0
    }

    public com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo setTemplateId(java.lang.String r1) {
            r0 = this;
            r0.templateId = r1
            return r0
    }

    public com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo setTemplateVersionCode(int r1) {
            r0 = this;
            r0.templateVersionCode = r1
            return r0
    }

    public com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo setTkDefaultTimeout(long r1) {
            r0 = this;
            r0.tkDefaultTimeout = r1
            return r0
    }

    public com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo setTkFileLoadTime(long r1) {
            r0 = this;
            r0.tkFileLoadTime = r1
            return r0
    }

    public com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo setTkInitTime(long r1) {
            r0 = this;
            r0.tkInitTime = r1
            return r0
    }

    public com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo setTkRenderTime(long r1) {
            r0 = this;
            r0.tkRenderTime = r1
            return r0
    }

    public com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo setTkRenderType(long r1) {
            r0 = this;
            r0.tkRenderType = r1
            return r0
    }

    public com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo setTkTotalTime(long r1) {
            r0 = this;
            r0.tkTotalTime = r1
            return r0
    }

    public com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo setTotalCount(int r1) {
            r0 = this;
            r0.totalCount = r1
            return r0
    }

    public com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo setType(int r1) {
            r0 = this;
            r0.type = r1
            return r0
    }

    public com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo setUpdateType(int r1) {
            r0 = this;
            r0.updateType = r1
            return r0
    }

    public com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo setUrl(java.lang.String r1) {
            r0 = this;
            r0.url = r1
            return r0
    }

    public com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo setViewSource(int r1) {
            r0 = this;
            r0.viewSource = r1
            return r0
    }

    public com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo setVisibleCheckDelayTime(long r1) {
            r0 = this;
            r0.visibleCheckDelayTime = r1
            return r0
    }

    public com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo setWebLoadTime(long r1) {
            r0 = this;
            r0.webLoadTime = r1
            return r0
    }

    public com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo setWebTimeout(boolean r1) {
            r0 = this;
            r0.isWebTimeout = r1
            return r0
    }
}
