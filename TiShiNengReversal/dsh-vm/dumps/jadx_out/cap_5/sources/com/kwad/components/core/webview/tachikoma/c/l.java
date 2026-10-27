package com.kwad.components.core.webview.tachikoma.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class l extends com.kwad.sdk.core.response.a.a {
    public int ahc;
    public int ahd;
    public int ahe;

    public l() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.ahd = r0
            return
    }

    @Override // com.kwad.sdk.core.response.a.a, com.kwad.sdk.core.b
    public final org.json.JSONObject toJson() {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "insertScreenAdShowStrategy"
            int r2 = r3.ahc
            com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
            java.lang.String r1 = "isAutoShow"
            int r2 = r3.ahe
            com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
            int r1 = r3.ahd
            r2 = -1
            if (r1 == r2) goto L1d
            java.lang.String r2 = "triggerType"
            com.kwad.sdk.utils.aa.putValue(r0, r2, r1)
        L1d:
            return r0
    }
}
