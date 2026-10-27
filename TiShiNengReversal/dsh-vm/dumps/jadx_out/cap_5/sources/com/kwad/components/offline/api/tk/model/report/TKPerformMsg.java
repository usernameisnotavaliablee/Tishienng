package com.kwad.components.offline.api.tk.model.report;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class TKPerformMsg extends com.kwad.components.offline.api.core.model.BaseOfflineCompoJsonParse<com.kwad.components.offline.api.tk.model.report.TKPerformMsg> implements java.io.Serializable {
    public static final int ENTER_SCENE = -1;
    public static final int OTHER_FAIL = 3;
    public static final int PAGE_STATUS_FAIL = 2;
    public static final int START = 0;
    public static final int SUCCESS = 1;
    public static final int TK_NOT_READY = 4;
    private static final long serialVersionUID = -5293371882532982729L;
    public java.lang.String errorDetail;
    public java.lang.String errorReason;
    public long getViewEndTime;
    public long initTime;
    public long loadTime;
    public long registerEndTime;
    public long renderIdleTime;
    public int renderState;
    public long renderTime;

    @com.kwad.components.offline.api.tk.model.report.TKPerformMsg.RENDER_TYPE
    public int renderType;
    public int source;
    public java.lang.String templateId;
    private int tkPublishType;
    public java.lang.String versionCode;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ERROR_REASON {
        public static final java.lang.String KSAD_TK_CONFIG_LOST = "config_lost";
        public static final java.lang.String KSAD_TK_CONFIG_PARSE_FAIL = "config_parse_fail";
        public static final java.lang.String KSAD_TK_JS_EMPTY = "js_empty";
        public static final java.lang.String KSAD_TK_MD5_NOT_MATCH = "md5_not_match";
        public static final java.lang.String KSAD_TK_NO_FILE = "no_file";
        public static final java.lang.String KSAD_TK_NO_TEMPLATE = "no_template";
        public static final java.lang.String KSAD_TK_OFFLINE_FAILED = "offline_failed";
        public static final java.lang.String KSAD_TK_RENDER_FAIL = "ksad_tk_render_fail";
        public static final java.lang.String KSAD_TK_SO_FAIL = "so_fail";
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public @interface RENDER_TYPE {
        public static final int MULTIPLE_RENDER = 1;
        public static final int SINGLE_RENDER = 0;
    }

    public TKPerformMsg(int r1) {
            r0 = this;
            r0.<init>()
            r0.setSource(r1)
            return
    }

    @Override // com.kwad.components.offline.api.core.model.BaseOfflineCompoJsonParse
    public /* bridge */ /* synthetic */ void parseJson(com.kwad.components.offline.api.tk.model.report.TKPerformMsg r1, org.json.JSONObject r2) {
            r0 = this;
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r1 = (com.kwad.components.offline.api.tk.model.report.TKPerformMsg) r1
            r0.parseJson2(r1, r2)
            return
    }

    /* renamed from: parseJson, reason: avoid collision after fix types in other method */
    public void parseJson2(com.kwad.components.offline.api.tk.model.report.TKPerformMsg r6, org.json.JSONObject r7) {
            r5 = this;
            if (r7 != 0) goto L3
            return
        L3:
            java.lang.String r0 = "source"
            int r0 = r7.optInt(r0)
            r6.source = r0
            java.lang.String r0 = "render_state"
            int r0 = r7.optInt(r0)
            r6.renderState = r0
            java.lang.String r0 = "error_reason"
            java.lang.String r1 = r7.optString(r0)
            r6.errorReason = r1
            java.lang.Object r0 = r7.opt(r0)
            java.lang.Object r1 = org.json.JSONObject.NULL
            java.lang.String r2 = ""
            if (r0 != r1) goto L27
            r6.errorReason = r2
        L27:
            java.lang.String r0 = "render_time"
            long r3 = r7.optLong(r0)
            r6.renderTime = r3
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
            java.lang.String r0 = "load_time"
            long r0 = r7.optLong(r0)
            r6.loadTime = r0
            java.lang.String r0 = "init_time"
            long r0 = r7.optLong(r0)
            r6.initTime = r0
            java.lang.String r0 = "tk_publish_type"
            int r0 = r7.optInt(r0)
            r6.tkPublishType = r0
            java.lang.String r0 = "render_type"
            int r0 = r7.optInt(r0)
            r6.renderType = r0
            java.lang.String r0 = "render_idle_time"
            long r0 = r7.optLong(r0)
            r6.renderIdleTime = r0
            java.lang.String r0 = "register_end_time"
            long r0 = r7.optLong(r0)
            r6.registerEndTime = r0
            return
    }

    public com.kwad.components.offline.api.tk.model.report.TKPerformMsg setErrorDetail(java.lang.String r1) {
            r0 = this;
            r0.errorDetail = r1
            return r0
    }

    public com.kwad.components.offline.api.tk.model.report.TKPerformMsg setErrorReason(java.lang.String r1) {
            r0 = this;
            r0.errorReason = r1
            return r0
    }

    public com.kwad.components.offline.api.tk.model.report.TKPerformMsg setGetViewEndTime(long r1) {
            r0 = this;
            r0.getViewEndTime = r1
            return r0
    }

    public com.kwad.components.offline.api.tk.model.report.TKPerformMsg setInitTime(long r1) {
            r0 = this;
            r0.initTime = r1
            return r0
    }

    public com.kwad.components.offline.api.tk.model.report.TKPerformMsg setLoadTime(long r1) {
            r0 = this;
            r0.loadTime = r1
            return r0
    }

    public com.kwad.components.offline.api.tk.model.report.TKPerformMsg setRegisterEndTime(long r1) {
            r0 = this;
            r0.registerEndTime = r1
            return r0
    }

    public com.kwad.components.offline.api.tk.model.report.TKPerformMsg setRenderIdleTime(long r1) {
            r0 = this;
            r0.renderIdleTime = r1
            return r0
    }

    public com.kwad.components.offline.api.tk.model.report.TKPerformMsg setRenderState(int r1) {
            r0 = this;
            r0.renderState = r1
            return r0
    }

    public com.kwad.components.offline.api.tk.model.report.TKPerformMsg setRenderTime(long r1) {
            r0 = this;
            r0.renderTime = r1
            return r0
    }

    public com.kwad.components.offline.api.tk.model.report.TKPerformMsg setRenderType(int r1) {
            r0 = this;
            r0.renderType = r1
            return r0
    }

    public com.kwad.components.offline.api.tk.model.report.TKPerformMsg setSource(int r1) {
            r0 = this;
            r0.source = r1
            return r0
    }

    public com.kwad.components.offline.api.tk.model.report.TKPerformMsg setTKPublishType(int r1) {
            r0 = this;
            r0.tkPublishType = r1
            return r0
    }

    public com.kwad.components.offline.api.tk.model.report.TKPerformMsg setTemplateId(java.lang.String r1) {
            r0 = this;
            r0.templateId = r1
            return r0
    }

    public com.kwad.components.offline.api.tk.model.report.TKPerformMsg setVersionCode(java.lang.String r1) {
            r0 = this;
            r0.versionCode = r1
            return r0
    }

    @Override // com.kwad.components.offline.api.core.model.BaseOfflineCompoJsonParse
    public /* bridge */ /* synthetic */ org.json.JSONObject toJson(com.kwad.components.offline.api.tk.model.report.TKPerformMsg r1) {
            r0 = this;
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r1 = (com.kwad.components.offline.api.tk.model.report.TKPerformMsg) r1
            org.json.JSONObject r1 = r0.toJson2(r1)
            return r1
    }

    @Override // com.kwad.components.offline.api.core.model.BaseOfflineCompoJsonParse
    public /* bridge */ /* synthetic */ org.json.JSONObject toJson(com.kwad.components.offline.api.tk.model.report.TKPerformMsg r1, org.json.JSONObject r2) {
            r0 = this;
            com.kwad.components.offline.api.tk.model.report.TKPerformMsg r1 = (com.kwad.components.offline.api.tk.model.report.TKPerformMsg) r1
            org.json.JSONObject r1 = r0.toJson2(r1, r2)
            return r1
    }

    /* renamed from: toJson, reason: avoid collision after fix types in other method */
    public org.json.JSONObject toJson2(com.kwad.components.offline.api.tk.model.report.TKPerformMsg r2) {
            r1 = this;
            r0 = 0
            org.json.JSONObject r2 = r1.toJson2(r2, r0)
            return r2
    }

    /* renamed from: toJson, reason: avoid collision after fix types in other method */
    public org.json.JSONObject toJson2(com.kwad.components.offline.api.tk.model.report.TKPerformMsg r7, org.json.JSONObject r8) {
            r6 = this;
            if (r8 != 0) goto L7
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
        L7:
            java.lang.String r0 = "render_state"
            int r1 = r7.renderState
            com.kwad.components.offline.api.core.utils.JsonHelper.putValue(r8, r0, r1)
            int r0 = r7.source
            if (r0 == 0) goto L17
            java.lang.String r1 = "source"
            com.kwad.components.offline.api.core.utils.JsonHelper.putValue(r8, r1, r0)
        L17:
            java.lang.String r0 = r7.errorReason
            java.lang.String r1 = ""
            if (r0 == 0) goto L2a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2a
            java.lang.String r0 = "error_reason"
            java.lang.String r2 = r7.errorReason
            com.kwad.components.offline.api.core.utils.JsonHelper.putValue(r8, r0, r2)
        L2a:
            java.lang.String r0 = r7.errorDetail
            if (r0 == 0) goto L3b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3b
            java.lang.String r0 = "error_detail"
            java.lang.String r2 = r7.errorDetail
            com.kwad.components.offline.api.core.utils.JsonHelper.putValue(r8, r0, r2)
        L3b:
            long r2 = r7.renderTime
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L48
            java.lang.String r0 = "render_time"
            com.kwad.components.offline.api.core.utils.JsonHelper.putValue(r8, r0, r2)
        L48:
            java.lang.String r0 = r7.templateId
            if (r0 == 0) goto L59
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L59
            java.lang.String r0 = "template_id"
            java.lang.String r2 = r7.templateId
            com.kwad.components.offline.api.core.utils.JsonHelper.putValue(r8, r0, r2)
        L59:
            java.lang.String r0 = r7.versionCode
            if (r0 == 0) goto L6a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L6a
            java.lang.String r0 = "version_code"
            java.lang.String r1 = r7.versionCode
            com.kwad.components.offline.api.core.utils.JsonHelper.putValue(r8, r0, r1)
        L6a:
            long r0 = r7.loadTime
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L75
            java.lang.String r2 = "load_time"
            com.kwad.components.offline.api.core.utils.JsonHelper.putValue(r8, r2, r0)
        L75:
            long r0 = r7.initTime
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L80
            java.lang.String r2 = "init_time"
            com.kwad.components.offline.api.core.utils.JsonHelper.putValue(r8, r2, r0)
        L80:
            int r0 = r7.tkPublishType
            if (r0 == 0) goto L89
            java.lang.String r1 = "tk_publish_type"
            com.kwad.components.offline.api.core.utils.JsonHelper.putValue(r8, r1, r0)
        L89:
            int r0 = r7.renderType
            if (r0 == 0) goto L92
            java.lang.String r1 = "render_type"
            com.kwad.components.offline.api.core.utils.JsonHelper.putValue(r8, r1, r0)
        L92:
            long r0 = r7.renderIdleTime
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L9d
            java.lang.String r2 = "render_idle_time"
            com.kwad.components.offline.api.core.utils.JsonHelper.putValue(r8, r2, r0)
        L9d:
            long r0 = r7.registerEndTime
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto La8
            java.lang.String r2 = "register_end_time"
            com.kwad.components.offline.api.core.utils.JsonHelper.putValue(r8, r2, r0)
        La8:
            long r0 = r7.getViewEndTime
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 == 0) goto Lb3
            java.lang.String r7 = "get_view_end_time"
            com.kwad.components.offline.api.core.utils.JsonHelper.putValue(r8, r7, r0)
        Lb3:
            return r8
    }
}
