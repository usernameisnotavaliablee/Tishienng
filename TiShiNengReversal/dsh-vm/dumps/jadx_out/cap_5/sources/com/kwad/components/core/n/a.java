package com.kwad.components.core.n;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class a extends com.kwad.sdk.core.network.l<com.kwad.components.core.request.a, com.kwad.sdk.core.response.model.AdResultData> {
    private com.kwad.components.core.request.model.ImpInfo Rw;

    public a(com.kwad.components.core.request.model.ImpInfo r1) {
            r0 = this;
            r0.<init>()
            r0.Rw = r1
            return
    }

    private void o(com.kwad.sdk.core.response.model.AdResultData r1) {
            r0 = this;
            super.afterParseData(r1)
            p(r1)
            return
    }

    private static void p(com.kwad.sdk.core.response.model.AdResultData r3) {
            java.util.List r3 = r3.getProceedTemplateList()
            java.util.Iterator r3 = r3.iterator()
        L8:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L4c
            java.lang.Object r0 = r3.next()
            com.kwad.sdk.core.response.model.AdTemplate r0 = (com.kwad.sdk.core.response.model.AdTemplate) r0
            com.kwad.sdk.core.response.model.AdInfo r1 = com.kwad.sdk.core.response.b.e.el(r0)
            boolean r2 = com.kwad.sdk.core.response.b.a.bd(r1)
            if (r2 == 0) goto L32
            java.util.List r1 = com.kwad.sdk.core.response.b.a.ba(r1)
            int r1 = r1.size()
            if (r1 != 0) goto L8
            com.kwad.components.core.p.a r1 = com.kwad.components.core.p.a.se()
            r2 = 21005(0x520d, float:2.9434E-41)
            r1.f(r0, r2)
            goto L8
        L32:
            boolean r2 = com.kwad.sdk.core.response.b.a.bi(r1)
            if (r2 == 0) goto L8
            java.lang.String r1 = com.kwad.sdk.core.response.b.a.K(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L8
            com.kwad.components.core.p.a r1 = com.kwad.components.core.p.a.se()
            r2 = 21006(0x520e, float:2.9436E-41)
            r1.f(r0, r2)
            goto L8
        L4c:
            return
    }

    @androidx.annotation.NonNull
    protected com.kwad.sdk.core.response.model.AdResultData af(java.lang.String r3) {
            r2 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r3)
            com.kwad.sdk.core.response.model.AdResultData r3 = new com.kwad.sdk.core.response.model.AdResultData
            com.kwad.components.core.request.model.ImpInfo r1 = r2.Rw
            com.kwad.sdk.internal.api.SceneImpl r1 = r1.adScene
            r3.<init>(r1)
            r3.parseJson(r0)
            return r3
    }

    @Override // com.kwad.sdk.core.network.l
    public /* synthetic */ void afterParseData(com.kwad.sdk.core.response.model.AdResultData r1) {
            r0 = this;
            com.kwad.sdk.core.response.model.AdResultData r1 = (com.kwad.sdk.core.response.model.AdResultData) r1
            r0.o(r1)
            return
    }

    @Override // com.kwad.sdk.core.network.a
    @androidx.annotation.NonNull
    public /* synthetic */ com.kwad.sdk.core.network.f createRequest() {
            r1 = this;
            com.kwad.components.core.request.a r0 = r1.ou()
            return r0
    }

    @Override // com.kwad.sdk.core.network.a
    public java.util.concurrent.ExecutorService getExecutor() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = com.kwad.sdk.core.threads.GlobalThreadPools.Ju()
            return r0
    }

    @androidx.annotation.NonNull
    protected com.kwad.components.core.request.a ou() {
            r2 = this;
            com.kwad.components.core.request.a r0 = new com.kwad.components.core.request.a
            com.kwad.components.core.request.model.ImpInfo r1 = r2.Rw
            r0.<init>(r1)
            return r0
    }

    @Override // com.kwad.sdk.core.network.l
    @androidx.annotation.NonNull
    public /* synthetic */ com.kwad.sdk.core.response.model.AdResultData parseData(java.lang.String r1) {
            r0 = this;
            com.kwad.sdk.core.response.model.AdResultData r1 = r0.af(r1)
            return r1
    }
}
