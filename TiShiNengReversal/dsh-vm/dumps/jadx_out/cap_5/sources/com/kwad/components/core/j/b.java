package com.kwad.components.core.j;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
final class b implements com.kwad.sdk.api.KsInnerAd {
    private final int Re;

    @androidx.annotation.NonNull
    private final com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;

    public b(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.mAdTemplate = r1
            r0.Re = r2
            return
    }

    @androidx.annotation.NonNull
    public final com.kwad.sdk.core.response.model.AdTemplate getAdTemplate() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            return r0
    }

    @Override // com.kwad.sdk.api.KsInnerAd
    public final int getType() {
            r1 = this;
            int r0 = r1.Re
            return r0
    }
}
