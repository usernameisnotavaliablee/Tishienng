package com.kwad.components.ad.reward.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class RewardFraudVerifyRespInfo extends com.kwad.sdk.core.response.model.BaseResultData {
    private static final long serialVersionUID = -8657363515914699792L;
    private com.kwad.components.ad.reward.model.RewardFraudVerifyRespInfo.FraudDataInfo data;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.ksad.json.annotation.KsJson
    public static class FraudDataInfo extends com.kwad.sdk.core.response.a.a implements java.io.Serializable {
        private static final long serialVersionUID = -8657363515914699792L;
        public int code;
        public boolean fraud;

        public FraudDataInfo() {
                r0 = this;
                r0.<init>()
                return
        }

        public int getCode() {
                r1 = this;
                int r0 = r1.code
                return r0
        }

        public boolean isFraud() {
                r1 = this;
                boolean r0 = r1.fraud
                return r0
        }
    }

    public RewardFraudVerifyRespInfo() {
            r1 = this;
            r1.<init>()
            com.kwad.components.ad.reward.model.RewardFraudVerifyRespInfo$FraudDataInfo r0 = new com.kwad.components.ad.reward.model.RewardFraudVerifyRespInfo$FraudDataInfo
            r0.<init>()
            r1.data = r0
            return
    }

    @Override // com.kwad.sdk.core.response.model.BaseResultData
    public org.json.JSONObject baseToJson() {
            r3 = this;
            org.json.JSONObject r0 = super.toJson()
            java.lang.String r1 = "data"
            com.kwad.components.ad.reward.model.RewardFraudVerifyRespInfo$FraudDataInfo r2 = r3.data
            com.kwad.sdk.utils.aa.a(r0, r1, r2)
            return r0
    }

    public int getCode() {
            r1 = this;
            com.kwad.components.ad.reward.model.RewardFraudVerifyRespInfo$FraudDataInfo r0 = r1.data
            int r0 = r0.getCode()
            return r0
    }

    public boolean isFraud() {
            r1 = this;
            com.kwad.components.ad.reward.model.RewardFraudVerifyRespInfo$FraudDataInfo r0 = r1.data
            boolean r0 = r0.isFraud()
            return r0
    }

    @Override // com.kwad.sdk.core.response.model.BaseResultData, com.kwad.sdk.core.b
    public void parseJson(@androidx.annotation.Nullable org.json.JSONObject r2) {
            r1 = this;
            super.parseJson(r2)
            java.lang.String r0 = "data"
            java.lang.String r2 = r2.optString(r0)     // Catch: java.lang.Exception -> L1c
            boolean r0 = com.kwad.sdk.utils.bp.isNullString(r2)     // Catch: java.lang.Exception -> L1c
            if (r0 != 0) goto L1e
            java.lang.Class<com.kwad.sdk.core.a.e> r0 = com.kwad.sdk.core.a.e.class
            com.kwad.sdk.components.b r0 = com.kwad.sdk.components.d.f(r0)     // Catch: java.lang.Exception -> L1c
            com.kwad.sdk.core.a.e r0 = (com.kwad.sdk.core.a.e) r0     // Catch: java.lang.Exception -> L1c
            java.lang.String r2 = r0.getResponseData(r2)     // Catch: java.lang.Exception -> L1c
            goto L1e
        L1c:
            r2 = move-exception
            goto L29
        L1e:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L1c
            r0.<init>(r2)     // Catch: java.lang.Exception -> L1c
            com.kwad.components.ad.reward.model.RewardFraudVerifyRespInfo$FraudDataInfo r2 = r1.data     // Catch: java.lang.Exception -> L1c
            r2.parseJson(r0)     // Catch: java.lang.Exception -> L1c
            return
        L29:
            com.kwad.sdk.core.d.c.printStackTrace(r2)
            return
    }
}
