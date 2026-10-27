package com.kwad.components.offline.api.tk.model.report;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class TKExceptionUploadParams extends com.kwad.components.offline.api.core.model.BaseOfflineCompoJsonParse<com.kwad.components.offline.api.tk.model.report.TKExceptionUploadParams> {
    public java.lang.String bizExtraInfo;
    public java.lang.String bundleId;
    public java.lang.String bundleSource;
    public java.lang.String bundleType;
    public java.lang.String bundleVersionCode;
    public java.lang.String businessName;
    public long clientTimeStamp;
    public int containerType;
    public java.lang.String error;
    public java.lang.String errorType;
    public java.lang.String key;
    public java.lang.String sdkVersion;
    public java.lang.String sessionId;
    public java.lang.String taskId;
    public java.lang.String templateId;
    public java.lang.String templateVersionCode;
    public int v8SoType;

    public TKExceptionUploadParams() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.kwad.components.offline.api.core.model.BaseOfflineCompoJsonParse
    public /* bridge */ /* synthetic */ void parseJson(com.kwad.components.offline.api.tk.model.report.TKExceptionUploadParams r1, org.json.JSONObject r2) {
            r0 = this;
            com.kwad.components.offline.api.tk.model.report.TKExceptionUploadParams r1 = (com.kwad.components.offline.api.tk.model.report.TKExceptionUploadParams) r1
            r0.parseJson2(r1, r2)
            return
    }

    /* renamed from: parseJson, reason: avoid collision after fix types in other method */
    public void parseJson2(com.kwad.components.offline.api.tk.model.report.TKExceptionUploadParams r4, org.json.JSONObject r5) {
            r3 = this;
            if (r5 != 0) goto L3
            return
        L3:
            java.lang.String r4 = "key"
            java.lang.String r4 = r5.optString(r4)
            r3.key = r4
            java.lang.Object r4 = org.json.JSONObject.NULL
            java.lang.String r0 = r4.toString()
            java.lang.String r1 = r3.key
            boolean r0 = r0.equals(r1)
            java.lang.String r1 = ""
            if (r0 == 0) goto L1d
            r3.key = r1
        L1d:
            java.lang.String r0 = "error"
            java.lang.String r0 = r5.optString(r0)
            r3.error = r0
            java.lang.String r0 = r4.toString()
            java.lang.String r2 = r3.error
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L33
            r3.error = r1
        L33:
            java.lang.String r0 = "v8SoType"
            int r0 = r5.optInt(r0)
            r3.v8SoType = r0
            java.lang.String r0 = "bundleType"
            java.lang.String r0 = r5.optString(r0)
            r3.bundleType = r0
            java.lang.String r0 = r4.toString()
            java.lang.String r2 = r3.bundleType
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L51
            r3.bundleType = r1
        L51:
            java.lang.String r0 = "bundleSource"
            java.lang.String r0 = r5.optString(r0)
            r3.bundleSource = r0
            java.lang.String r0 = r4.toString()
            java.lang.String r2 = r3.bundleSource
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L67
            r3.bundleSource = r1
        L67:
            java.lang.String r0 = "bundleId"
            java.lang.String r0 = r5.optString(r0)
            r3.bundleId = r0
            java.lang.String r0 = r4.toString()
            java.lang.String r2 = r3.bundleId
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L7d
            r3.bundleId = r1
        L7d:
            java.lang.String r0 = "bundleVersionCode"
            java.lang.String r0 = r5.optString(r0)
            r3.bundleVersionCode = r0
            java.lang.String r0 = r4.toString()
            java.lang.String r2 = r3.bundleVersionCode
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L93
            r3.bundleVersionCode = r1
        L93:
            java.lang.String r0 = "businessName"
            java.lang.String r0 = r5.optString(r0)
            r3.businessName = r0
            java.lang.String r0 = r4.toString()
            java.lang.String r2 = r3.businessName
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto La9
            r3.businessName = r1
        La9:
            java.lang.String r0 = "taskId"
            java.lang.String r0 = r5.optString(r0)
            r3.taskId = r0
            java.lang.String r0 = r4.toString()
            java.lang.String r2 = r3.taskId
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Lbf
            r3.taskId = r1
        Lbf:
            java.lang.String r0 = "templateId"
            java.lang.String r0 = r5.optString(r0)
            r3.templateId = r0
            java.lang.String r0 = r4.toString()
            java.lang.String r2 = r3.templateId
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Ld5
            r3.templateId = r1
        Ld5:
            java.lang.String r0 = "templateVersionCode"
            java.lang.String r0 = r5.optString(r0)
            r3.templateVersionCode = r0
            java.lang.String r0 = r4.toString()
            java.lang.String r2 = r3.templateVersionCode
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Leb
            r3.templateVersionCode = r1
        Leb:
            java.lang.String r0 = "sdkVersion"
            java.lang.String r0 = r5.optString(r0)
            r3.sdkVersion = r0
            java.lang.String r0 = r4.toString()
            java.lang.String r2 = r3.sdkVersion
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L101
            r3.sdkVersion = r1
        L101:
            java.lang.String r0 = "sessionId"
            java.lang.String r0 = r5.optString(r0)
            r3.sessionId = r0
            java.lang.String r0 = r4.toString()
            java.lang.String r2 = r3.sessionId
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L117
            r3.sessionId = r1
        L117:
            java.lang.String r0 = "biz_extra_info"
            java.lang.String r0 = r5.optString(r0)
            r3.bizExtraInfo = r0
            java.lang.String r0 = r4.toString()
            java.lang.String r2 = r3.bizExtraInfo
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L12d
            r3.bizExtraInfo = r1
        L12d:
            java.lang.String r0 = "errorType"
            java.lang.String r0 = r5.optString(r0)
            r3.errorType = r0
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = r3.errorType
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L143
            r3.errorType = r1
        L143:
            java.lang.String r4 = "container_type"
            int r4 = r5.optInt(r4)
            r3.containerType = r4
            java.lang.String r4 = "clientTimeStamp"
            long r4 = r5.optLong(r4)
            r3.clientTimeStamp = r4
            return
    }

    @Override // com.kwad.components.offline.api.core.model.BaseOfflineCompoJsonParse
    public /* bridge */ /* synthetic */ org.json.JSONObject toJson(com.kwad.components.offline.api.tk.model.report.TKExceptionUploadParams r1) {
            r0 = this;
            com.kwad.components.offline.api.tk.model.report.TKExceptionUploadParams r1 = (com.kwad.components.offline.api.tk.model.report.TKExceptionUploadParams) r1
            org.json.JSONObject r1 = r0.toJson2(r1)
            return r1
    }

    @Override // com.kwad.components.offline.api.core.model.BaseOfflineCompoJsonParse
    public /* bridge */ /* synthetic */ org.json.JSONObject toJson(com.kwad.components.offline.api.tk.model.report.TKExceptionUploadParams r1, org.json.JSONObject r2) {
            r0 = this;
            com.kwad.components.offline.api.tk.model.report.TKExceptionUploadParams r1 = (com.kwad.components.offline.api.tk.model.report.TKExceptionUploadParams) r1
            org.json.JSONObject r1 = r0.toJson2(r1, r2)
            return r1
    }

    /* renamed from: toJson, reason: avoid collision after fix types in other method */
    public org.json.JSONObject toJson2(com.kwad.components.offline.api.tk.model.report.TKExceptionUploadParams r2) {
            r1 = this;
            r0 = 0
            org.json.JSONObject r2 = r1.toJson2(r2, r0)
            return r2
    }

    /* renamed from: toJson, reason: avoid collision after fix types in other method */
    public org.json.JSONObject toJson2(com.kwad.components.offline.api.tk.model.report.TKExceptionUploadParams r5, org.json.JSONObject r6) {
            r4 = this;
            if (r6 != 0) goto L7
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
        L7:
            java.lang.String r5 = r4.error
            java.lang.String r0 = ""
            if (r5 == 0) goto L1a
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L1a
            java.lang.String r5 = "error"
            java.lang.String r1 = r4.error
            com.kwad.sdk.utils.aa.putValue(r6, r5, r1)
        L1a:
            int r5 = r4.v8SoType
            if (r5 == 0) goto L23
            java.lang.String r1 = "v8SoType"
            com.kwad.sdk.utils.aa.putValue(r6, r1, r5)
        L23:
            java.lang.String r5 = r4.bundleType
            if (r5 == 0) goto L34
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L34
            java.lang.String r5 = "bundleType"
            java.lang.String r1 = r4.bundleType
            com.kwad.sdk.utils.aa.putValue(r6, r5, r1)
        L34:
            java.lang.String r5 = r4.bundleSource
            if (r5 == 0) goto L45
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L45
            java.lang.String r5 = "bundleSource"
            java.lang.String r1 = r4.bundleSource
            com.kwad.sdk.utils.aa.putValue(r6, r5, r1)
        L45:
            java.lang.String r5 = r4.bundleId
            if (r5 == 0) goto L56
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L56
            java.lang.String r5 = "bundleId"
            java.lang.String r1 = r4.bundleId
            com.kwad.sdk.utils.aa.putValue(r6, r5, r1)
        L56:
            java.lang.String r5 = r4.bundleVersionCode
            if (r5 == 0) goto L67
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L67
            java.lang.String r5 = "bundleVersionCode"
            java.lang.String r1 = r4.bundleVersionCode
            com.kwad.sdk.utils.aa.putValue(r6, r5, r1)
        L67:
            java.lang.String r5 = r4.businessName
            if (r5 == 0) goto L78
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L78
            java.lang.String r5 = "businessName"
            java.lang.String r1 = r4.businessName
            com.kwad.sdk.utils.aa.putValue(r6, r5, r1)
        L78:
            java.lang.String r5 = r4.taskId
            if (r5 == 0) goto L89
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L89
            java.lang.String r5 = "taskId"
            java.lang.String r1 = r4.taskId
            com.kwad.sdk.utils.aa.putValue(r6, r5, r1)
        L89:
            java.lang.String r5 = r4.templateId
            if (r5 == 0) goto L9a
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L9a
            java.lang.String r5 = "templateId"
            java.lang.String r1 = r4.templateId
            com.kwad.sdk.utils.aa.putValue(r6, r5, r1)
        L9a:
            java.lang.String r5 = r4.templateVersionCode
            if (r5 == 0) goto Lab
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto Lab
            java.lang.String r5 = "templateVersionCode"
            java.lang.String r1 = r4.templateVersionCode
            com.kwad.sdk.utils.aa.putValue(r6, r5, r1)
        Lab:
            java.lang.String r5 = r4.sdkVersion
            if (r5 == 0) goto Lbc
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto Lbc
            java.lang.String r5 = "sdkVersion"
            java.lang.String r1 = r4.sdkVersion
            com.kwad.sdk.utils.aa.putValue(r6, r5, r1)
        Lbc:
            java.lang.String r5 = r4.sessionId
            if (r5 == 0) goto Lcd
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto Lcd
            java.lang.String r5 = "sessionId"
            java.lang.String r1 = r4.sessionId
            com.kwad.sdk.utils.aa.putValue(r6, r5, r1)
        Lcd:
            java.lang.String r5 = r4.bizExtraInfo
            if (r5 == 0) goto Lde
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto Lde
            java.lang.String r5 = "biz_extra_info"
            java.lang.String r1 = r4.bizExtraInfo
            com.kwad.sdk.utils.aa.putValue(r6, r5, r1)
        Lde:
            java.lang.String r5 = r4.errorType
            if (r5 == 0) goto Lef
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto Lef
            java.lang.String r5 = "errorType"
            java.lang.String r0 = r4.errorType
            com.kwad.sdk.utils.aa.putValue(r6, r5, r0)
        Lef:
            int r5 = r4.containerType
            if (r5 == 0) goto Lf8
            java.lang.String r0 = "container_type"
            com.kwad.sdk.utils.aa.putValue(r6, r0, r5)
        Lf8:
            long r0 = r4.clientTimeStamp
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L105
            java.lang.String r5 = "clientTimeStamp"
            com.kwad.sdk.utils.aa.putValue(r6, r5, r0)
        L105:
            return r6
    }
}
