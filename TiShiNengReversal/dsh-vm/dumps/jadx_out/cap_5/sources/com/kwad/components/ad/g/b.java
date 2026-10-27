package com.kwad.components.ad.g;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b extends com.kwad.sdk.components.e implements com.kwad.sdk.components.p {
    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.kwad.sdk.components.p
    public final org.json.JSONObject C(java.lang.String r2) {
            r1 = this;
            com.kwad.sdk.app.AppPackageInfo r0 = new com.kwad.sdk.app.AppPackageInfo
            r0.<init>()
            r0.packageName = r2
            org.json.JSONObject r2 = com.kwad.components.ad.g.a.a(r0)
            return r2
    }

    @Override // com.kwad.sdk.components.p
    public final java.util.Map<java.lang.String, com.kwad.sdk.app.AppPackageInfo> P(android.content.Context r1) {
            r0 = this;
            java.util.Map r1 = com.kwad.components.ad.g.a.P(r1)
            return r1
    }

    @Override // com.kwad.sdk.components.p
    public final void a(android.content.Context r1, com.kwad.sdk.g.a<org.json.JSONArray> r2) {
            r0 = this;
            com.kwad.components.ad.g.a.a(r1, r2)
            return
    }

    @Override // com.kwad.sdk.components.p
    public final org.json.JSONArray[] b(android.content.Context r1, java.util.List<java.lang.String> r2) {
            r0 = this;
            org.json.JSONArray[] r1 = com.kwad.components.ad.g.a.b(r1, r2)
            return r1
    }

    @Override // com.kwad.sdk.components.p
    @androidx.annotation.NonNull
    public final org.json.JSONArray c(@androidx.annotation.NonNull java.util.Map<java.lang.String, com.kwad.sdk.app.AppPackageInfo> r1) {
            r0 = this;
            org.json.JSONArray r1 = com.kwad.components.ad.g.a.c(r1)
            return r1
    }

    @Override // com.kwad.sdk.components.p
    public final org.json.JSONObject e(android.content.Context r3, java.lang.String r4) {
            r2 = this;
            android.content.pm.PackageManager r0 = r3.getPackageManager()
            r1 = 0
            android.content.pm.PackageInfo r3 = com.kwad.sdk.utils.y.getPackageInfo(r3, r4, r1)     // Catch: java.lang.Throwable -> L14
            if (r3 == 0) goto L1b
            com.kwad.sdk.app.AppPackageInfo r3 = com.kwad.components.ad.g.a.a(r3, r0)     // Catch: java.lang.Throwable -> L14
            org.json.JSONObject r3 = com.kwad.components.ad.g.a.a(r3)     // Catch: java.lang.Throwable -> L14
            return r3
        L14:
            r3 = move-exception
            com.kwad.sdk.core.d.c.printStackTrace(r3)
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r3)
        L1b:
            r3 = 0
            return r3
    }

    @Override // com.kwad.sdk.components.b
    public final java.lang.Class getComponentsType() {
            r1 = this;
            java.lang.Class<com.kwad.sdk.components.p> r0 = com.kwad.sdk.components.p.class
            return r0
    }

    @Override // com.kwad.sdk.components.b
    public final void init(android.content.Context r1) {
            r0 = this;
            return
    }
}
