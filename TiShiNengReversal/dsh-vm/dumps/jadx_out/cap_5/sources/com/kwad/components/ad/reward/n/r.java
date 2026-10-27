package com.kwad.components.ad.reward.n;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class r {

    @androidx.annotation.Nullable
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;

    @androidx.annotation.Nullable
    private com.kwad.components.core.e.d.c mApkDownloadHelper;

    private r() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.kwad.components.ad.reward.n.r a(com.kwad.sdk.core.response.model.AdTemplate r1, com.kwad.components.core.e.d.c r2) {
            com.kwad.components.ad.reward.n.r r0 = new com.kwad.components.ad.reward.n.r
            r0.<init>()
            r0.setAdTemplate(r1)
            r0.setApkDownloadHelper(r2)
            return r0
    }

    public static com.kwad.components.ad.reward.n.r aa(com.kwad.sdk.core.response.model.AdTemplate r1) {
            com.kwad.components.ad.reward.n.r r0 = new com.kwad.components.ad.reward.n.r
            r0.<init>()
            r0.setAdTemplate(r1)
            return r0
    }

    private void setAdTemplate(@androidx.annotation.Nullable com.kwad.sdk.core.response.model.AdTemplate r1) {
            r0 = this;
            r0.mAdTemplate = r1
            return
    }

    private void setApkDownloadHelper(@androidx.annotation.Nullable com.kwad.components.core.e.d.c r1) {
            r0 = this;
            r0.mApkDownloadHelper = r1
            return
    }

    @androidx.annotation.Nullable
    public final com.kwad.sdk.core.response.model.AdTemplate getAdTemplate() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            return r0
    }

    @androidx.annotation.Nullable
    public final com.kwad.components.core.e.d.c ij() {
            r1 = this;
            com.kwad.components.core.e.d.c r0 = r1.mApkDownloadHelper
            return r0
    }
}
