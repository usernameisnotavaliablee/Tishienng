package com.kwad.components.offline.api.core.network.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class CommonOfflineCompoResultData extends com.kwad.components.offline.api.core.network.model.BaseOfflineCompoResultData {
    private static final int CODE_RESULT_OK = 1;
    private static final long serialVersionUID = 7464537023322307192L;
    public java.lang.String cookie;
    public java.lang.String errorMsg;
    public java.lang.String extra;
    public boolean hasAd;
    public long llsid;
    private com.kwad.sdk.core.response.model.BaseResultData mBaseResultData;
    private boolean mKeepOriginResponse;
    private boolean mNotifyFailOnResultError;
    public org.json.JSONObject originResponseData;
    public int result;

    public CommonOfflineCompoResultData() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.mNotifyFailOnResultError = r0
            com.kwad.sdk.core.network.EmptyResultData r0 = new com.kwad.sdk.core.network.EmptyResultData
            r0.<init>()
            r1.mBaseResultData = r0
            return
    }

    public boolean hasData() {
            r1 = this;
            boolean r0 = r1.hasAd
            return r0
    }

    public boolean isDataEmpty() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean isResultOk() {
            r2 = this;
            int r0 = r2.result
            r1 = 1
            if (r0 != r1) goto L6
            return r1
        L6:
            r0 = 0
            return r0
    }

    public boolean notifyFailOnResultError() {
            r1 = this;
            boolean r0 = r1.mNotifyFailOnResultError
            return r0
    }

    public void parseJson(@androidx.annotation.Nullable org.json.JSONObject r7) {
            r6 = this;
            if (r7 != 0) goto L4
            goto L79
        L4:
            com.kwad.sdk.core.response.model.BaseResultData r0 = r6.mBaseResultData
            if (r0 != 0) goto Lf
            com.kwad.sdk.core.network.EmptyResultData r0 = new com.kwad.sdk.core.network.EmptyResultData
            r0.<init>()
            r6.mBaseResultData = r0
        Lf:
            com.kwad.sdk.core.response.model.BaseResultData r0 = r6.mBaseResultData
            r0.parseJson(r7)
            com.kwad.sdk.core.response.model.BaseResultData r0 = r6.mBaseResultData
            long r1 = r0.llsid
            r6.llsid = r1
            int r1 = r0.result
            r6.result = r1
            boolean r1 = r0.hasAd
            r6.hasAd = r1
            java.lang.String r1 = r0.errorMsg
            r6.errorMsg = r1
            java.lang.String r1 = r0.extra
            r6.extra = r1
            java.lang.String r0 = r0.cookie
            r6.cookie = r0
            boolean r0 = r6.mKeepOriginResponse
            if (r0 == 0) goto L79
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            r6.originResponseData = r0
            java.util.Iterator r0 = r7.keys()
        L3d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L79
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            r2 = 0
            java.lang.Object r3 = r7.get(r1)     // Catch: org.json.JSONException -> L4f
            goto L51
        L4f:
            r3 = r2
        L51:
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto L69
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = com.kwad.sdk.core.a.d.getResponseData(r4)
            if (r4 == 0) goto L69
            org.json.JSONTokener r5 = new org.json.JSONTokener     // Catch: org.json.JSONException -> L68
            r5.<init>(r4)     // Catch: org.json.JSONException -> L68
            java.lang.Object r2 = r5.nextValue()     // Catch: org.json.JSONException -> L68
            goto L69
        L68:
        L69:
            if (r2 == 0) goto L73
            org.json.JSONObject r3 = r6.originResponseData     // Catch: org.json.JSONException -> L71
            r3.put(r1, r2)     // Catch: org.json.JSONException -> L71
            goto L3d
        L71:
            goto L3d
        L73:
            org.json.JSONObject r2 = r6.originResponseData     // Catch: org.json.JSONException -> L71
            r2.put(r1, r3)     // Catch: org.json.JSONException -> L71
            goto L3d
        L79:
            return
    }

    public void setKeepOriginResponse(boolean r1) {
            r0 = this;
            r0.mKeepOriginResponse = r1
            return
    }

    public void setNotifyFailOnResultError(boolean r1) {
            r0 = this;
            r0.mNotifyFailOnResultError = r1
            return
    }

    public org.json.JSONObject toJson() {
            r1 = this;
            com.kwad.sdk.core.response.model.BaseResultData r0 = r1.mBaseResultData
            if (r0 != 0) goto La
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            return r0
        La:
            org.json.JSONObject r0 = r0.toJson()
            return r0
    }
}
