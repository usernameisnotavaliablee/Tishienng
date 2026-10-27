package com.kwad.components.core.request;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class g extends com.kwad.sdk.core.network.d {
    public g() {
            r2 = this;
            r2.<init>()
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L1f
            r0.<init>()     // Catch: java.lang.Throwable -> L1f
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1f
            r1.<init>()     // Catch: java.lang.Throwable -> L1f
            com.kwad.sdk.utils.aa.a(r0, r1)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = "impInfo"
            r2.putBody(r1, r0)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r0 = "appTag"
            java.lang.String r1 = com.kwad.sdk.utils.ag.Qy()     // Catch: java.lang.Throwable -> L1f
            r2.putBody(r0, r1)     // Catch: java.lang.Throwable -> L1f
            return
        L1f:
            r0 = move-exception
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r0)
            return
    }

    @Override // com.kwad.sdk.core.network.d
    public final void buildBaseBodyWithPrivateInfo() {
            r2 = this;
            java.lang.String r0 = "geoInfo"
            com.kwad.sdk.core.request.model.c r1 = com.kwad.sdk.core.request.model.c.IL()     // Catch: java.lang.Throwable -> L1b
            r2.putBody(r0, r1)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r0 = "kGeoInfo"
            java.lang.Class<com.kwad.sdk.service.a.f> r1 = com.kwad.sdk.service.a.f.class
            java.lang.Object r1 = com.kwad.sdk.service.ServiceProvider.get(r1)     // Catch: java.lang.Throwable -> L1b
            com.kwad.sdk.service.a.f r1 = (com.kwad.sdk.service.a.f) r1     // Catch: java.lang.Throwable -> L1b
            com.kwad.sdk.core.b r1 = r1.Bp()     // Catch: java.lang.Throwable -> L1b
            r2.putBody(r0, r1)     // Catch: java.lang.Throwable -> L1b
            return
        L1b:
            r0 = move-exception
            r2.reportSdkCaughtException(r0)
            return
    }

    @Override // com.kwad.sdk.core.network.b, com.kwad.sdk.core.network.f
    public final java.lang.String getUrl() {
            r1 = this;
            java.lang.String r0 = com.kwad.sdk.h.AQ()
            return r0
    }
}
