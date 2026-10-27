package com.kwad.components.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class b implements com.kwad.components.core.internal.api.a {
    public com.kwad.components.core.internal.api.c bz;

    @androidx.annotation.NonNull
    protected final com.kwad.sdk.core.response.model.AdResultData mAdResultData;

    @androidx.annotation.NonNull
    protected final com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;

    public b(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdResultData r2) {
            r1 = this;
            r1.<init>()
            com.kwad.components.core.internal.api.c r0 = new com.kwad.components.core.internal.api.c
            r0.<init>()
            r1.bz = r0
            r1.mAdResultData = r2
            com.kwad.sdk.core.response.model.AdTemplate r2 = com.kwad.sdk.core.response.b.c.r(r2)
            r1.mAdTemplate = r2
            return
    }

    @Override // com.kwad.components.core.internal.api.a
    public final void a(com.kwad.components.core.internal.api.b r2) {
            r1 = this;
            com.kwad.components.core.internal.api.c r0 = r1.bz
            r0.a(r2)
            return
    }

    @Override // com.kwad.components.core.internal.api.a
    public final void b(com.kwad.components.core.internal.api.b r2) {
            r1 = this;
            com.kwad.components.core.internal.api.c r0 = r1.bz
            r0.b(r2)
            return
    }

    @Override // com.kwad.components.core.internal.api.a
    public final com.kwad.sdk.core.response.model.AdTemplate getAdTemplate() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            return r0
    }

    public int getECPM() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            int r0 = com.kwad.sdk.core.response.b.a.aR(r0)
            return r0
    }

    public int getInteractionType() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            int r0 = com.kwad.sdk.core.response.b.a.aQ(r0)
            return r0
    }

    public int getMaterialType() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            int r0 = com.kwad.sdk.core.response.b.a.be(r0)
            return r0
    }

    public java.util.Map<java.lang.String, java.lang.Object> getMediaExtraInfo() {
            r3 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            boolean r1 = com.kwad.sdk.core.config.e.Ft()
            if (r1 == 0) goto L18
            com.kwad.sdk.core.response.model.AdTemplate r1 = r3.mAdTemplate
            long r1 = r1.llsid
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "llsid"
            r0.put(r2, r1)
        L18:
            return r0
    }

    public boolean isVideo() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            boolean r0 = com.kwad.sdk.core.response.b.a.bc(r0)
            return r0
    }

    public void reportAdExposureFailed(int r2, com.kwad.sdk.api.model.AdExposureFailedReason r3) {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            com.kwad.sdk.core.adlog.c.a(r0, r2, r3)
            return
    }

    public void setBidEcpm(int r5) {
            r4 = this;
            long r0 = (long) r5
            r2 = -1
            r4.setBidEcpm(r0, r2)
            return
    }

    public void setBidEcpm(long r1, long r3) {
            r0 = this;
            com.kwad.sdk.core.response.model.AdTemplate r3 = r0.mAdTemplate
            r3.mBidEcpm = r1
            com.kwad.sdk.core.adlog.c.m(r3, r1)
            return
    }

    @Override // com.kwad.components.core.internal.api.a
    public final boolean supportPushAd() {
            r1 = this;
            r0 = 1
            return r0
    }
}
