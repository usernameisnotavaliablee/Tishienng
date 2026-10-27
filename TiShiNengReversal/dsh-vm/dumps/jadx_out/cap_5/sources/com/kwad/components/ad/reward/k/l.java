package com.kwad.components.ad.reward.k;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class l extends com.kwad.components.core.webview.tachikoma.b.w {
    public l() {
            r0 = this;
            r0.<init>()
            return
    }

    public final void g(@androidx.annotation.NonNull java.util.List<com.kwad.sdk.core.response.model.AdTemplate> r2) {
            r1 = this;
            com.kwad.sdk.core.response.model.AdResultData r0 = new com.kwad.sdk.core.response.model.AdResultData
            r0.<init>()
            r0.setAdTemplateList(r2)
            com.kwad.components.core.webview.jshandler.af$a r2 = new com.kwad.components.core.webview.jshandler.af$a
            r2.<init>(r0)
            r1.b(r2)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "registerAggregationDataListener"
            return r0
    }
}
