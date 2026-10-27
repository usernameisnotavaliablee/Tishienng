package com.kwad.components.ad.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b extends com.kwad.sdk.core.network.b {
    public b(java.lang.String r2, java.util.List<java.lang.String> r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "adxId"
            r1.putBody(r0, r2)
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>(r3)
            java.lang.String r3 = "materialIds"
            r1.putBody(r3, r2)
            return
    }

    @Override // com.kwad.sdk.core.network.b
    public final void buildBaseBody() {
            r3 = this;
            java.lang.String r0 = "protocolVersion"
            java.lang.String r1 = "2.0"
            r3.putBody(r0, r1)
            java.lang.String r0 = "SDKVersion"
            java.lang.String r1 = "4.6.30.1"
            r3.putBody(r0, r1)
            java.lang.String r0 = "SDKVersionCode"
            r1 = 4063001(0x3dff19, float:5.693477E-39)
            r3.putBody(r0, r1)
            java.lang.Class<com.kwad.sdk.service.a.f> r0 = com.kwad.sdk.service.a.f.class
            java.lang.Object r1 = com.kwad.sdk.service.ServiceProvider.get(r0)
            com.kwad.sdk.service.a.f r1 = (com.kwad.sdk.service.a.f) r1
            java.lang.String r1 = r1.getApiVersion()
            java.lang.String r2 = "sdkApiVersion"
            r3.putBody(r2, r1)
            java.lang.Object r0 = com.kwad.sdk.service.ServiceProvider.get(r0)
            com.kwad.sdk.service.a.f r0 = (com.kwad.sdk.service.a.f) r0
            int r0 = r0.getApiVersionCode()
            java.lang.String r1 = "sdkApiVersionCode"
            r3.putBody(r1, r0)
            java.lang.String r0 = "sdkType"
            r1 = 1
            r3.putBody(r0, r1)
            return
    }

    @Override // com.kwad.sdk.core.network.b
    public final void buildBaseHeader() {
            r2 = this;
            java.lang.Boolean r0 = com.kwad.framework.a.a.oz
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L14
            java.lang.Class<com.kwad.sdk.components.DevelopMangerComponents> r0 = com.kwad.sdk.components.DevelopMangerComponents.class
            com.kwad.sdk.components.d.f(r0)
            java.lang.String r0 = "trace-context"
            java.lang.String r1 = "{\"laneId\":\"STAGING.online.u\"}"
            r2.addHeader(r0, r1)
        L14:
            return
    }

    @Override // com.kwad.sdk.core.network.b, com.kwad.sdk.core.network.f
    public final java.lang.String getUrl() {
            r1 = this;
            java.lang.String r0 = com.kwad.sdk.h.AO()
            return r0
    }
}
