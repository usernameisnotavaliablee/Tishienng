package com.kwad.components.ad.reward.k;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class r implements com.kwad.sdk.core.webview.c.a {
    private java.lang.ref.WeakReference<com.kwad.components.ad.reward.g> td;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.ksad.json.annotation.KsJson
    public static class a extends com.kwad.sdk.core.response.a.a {
        public com.kwad.components.ad.reward.model.RewardFraudVerifyRespInfo.FraudDataInfo AL;

        public a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public r(java.lang.ref.WeakReference<com.kwad.components.ad.reward.g> r1) {
            r0 = this;
            r0.<init>()
            r0.td = r1
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r2, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r3) {
            r1 = this;
            java.lang.ref.WeakReference<com.kwad.components.ad.reward.g> r3 = r1.td
            if (r3 == 0) goto Lb
            java.lang.Object r3 = r3.get()
            com.kwad.components.ad.reward.g r3 = (com.kwad.components.ad.reward.g) r3
            goto Lc
        Lb:
            r3 = 0
        Lc:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L2f
            r0.<init>(r2)     // Catch: java.lang.Exception -> L2f
            com.kwad.components.ad.reward.k.r$a r2 = new com.kwad.components.ad.reward.k.r$a     // Catch: java.lang.Exception -> L2f
            r2.<init>()     // Catch: java.lang.Exception -> L2f
            r2.parseJson(r0)     // Catch: java.lang.Exception -> L2f
            com.kwad.components.ad.reward.model.RewardFraudVerifyRespInfo$FraudDataInfo r0 = r2.AL     // Catch: java.lang.Exception -> L2f
            boolean r0 = r0.isFraud()     // Catch: java.lang.Exception -> L2f
            if (r0 == 0) goto L23
            r0 = 3
            goto L24
        L23:
            r0 = 2
        L24:
            r3.sa = r0     // Catch: java.lang.Exception -> L2f
            com.kwad.components.ad.reward.model.RewardFraudVerifyRespInfo$FraudDataInfo r2 = r2.AL     // Catch: java.lang.Exception -> L2f
            int r2 = r2.getCode()     // Catch: java.lang.Exception -> L2f
            r3.sb = r2     // Catch: java.lang.Exception -> L2f
            return
        L2f:
            r2 = move-exception
            com.kwad.sdk.core.d.c.printStackTraceOnly(r2)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "rewardFraudVerify"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r0 = this;
            return
    }
}
