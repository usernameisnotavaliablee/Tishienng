package com.kwad.components.ad.reward.presenter.d;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b extends com.kwad.components.ad.reward.presenter.b {
    private com.kwad.sdk.core.response.model.AdInfo mAdInfo;
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a extends com.kwad.components.ad.reward.presenter.c {
        public a(com.kwad.sdk.core.response.model.AdInfo r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.kwad.components.ad.reward.presenter.c
        public final int iB() {
                r1 = this;
                int r0 = com.kwad.sdk.R.id.ksad_blur_end_cover
                return r0
        }

        @Override // com.kwad.components.ad.reward.presenter.c
        public final int iC() {
                r1 = this;
                r0 = 8
                return r0
        }
    }

    public b(com.kwad.sdk.core.response.model.AdTemplate r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.mAdTemplate = r1
            com.kwad.sdk.core.response.model.AdInfo r1 = com.kwad.sdk.core.response.b.e.el(r1)
            r0.mAdInfo = r1
            if (r2 == 0) goto L11
            r0.jE()
            return
        L11:
            r0.jF()
            return
    }

    private void jE() {
            r2 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r2.mAdInfo
            boolean r0 = com.kwad.components.ad.reward.g.g(r0)
            if (r0 == 0) goto L10
            com.kwad.components.ad.reward.presenter.s r0 = new com.kwad.components.ad.reward.presenter.s
            r0.<init>()
            r2.a(r0)
        L10:
            com.kwad.components.ad.reward.presenter.d.a.b r0 = new com.kwad.components.ad.reward.presenter.d.a.b
            r0.<init>()
            r2.a(r0)
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            boolean r0 = com.kwad.sdk.core.response.b.b.cL(r0)
            if (r0 == 0) goto L28
            com.kwad.components.ad.reward.presenter.d.a.c r0 = new com.kwad.components.ad.reward.presenter.d.a.c
            r0.<init>()
            r2.a(r0)
        L28:
            com.kwad.components.ad.reward.presenter.d.b$a r0 = new com.kwad.components.ad.reward.presenter.d.b$a
            com.kwad.sdk.core.response.model.AdInfo r1 = r2.mAdInfo
            r0.<init>(r1)
            r2.a(r0)
            com.kwad.sdk.core.response.model.AdInfo r0 = r2.mAdInfo
            boolean r0 = com.kwad.components.ad.reward.a.b.k(r0)
            if (r0 != 0) goto L4a
            com.kwad.sdk.core.response.model.AdInfo r0 = r2.mAdInfo
            boolean r0 = com.kwad.sdk.core.response.b.a.as(r0)
            if (r0 == 0) goto L4a
            com.kwad.components.ad.reward.presenter.d.a.a r0 = new com.kwad.components.ad.reward.presenter.d.a.a
            r0.<init>()
            r2.a(r0)
        L4a:
            return
    }

    private void jF() {
            r1 = this;
            com.kwad.components.ad.reward.presenter.d.a.b r0 = new com.kwad.components.ad.reward.presenter.d.a.b
            r0.<init>()
            r1.a(r0)
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            boolean r0 = com.kwad.sdk.core.response.b.b.cL(r0)
            if (r0 == 0) goto L18
            com.kwad.components.ad.reward.presenter.d.a.c r0 = new com.kwad.components.ad.reward.presenter.d.a.c
            r0.<init>()
            r1.a(r0)
        L18:
            return
    }
}
