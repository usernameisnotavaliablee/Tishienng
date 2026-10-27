package com.kwad.components.ad.draw.presenter.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a {
    private com.kwad.components.ad.draw.presenter.b.a.InterfaceC0011a eH;

    @androidx.annotation.Nullable
    private com.kwad.components.ad.draw.presenter.b.a.b eI;
    private boolean eJ;
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.kwad.components.ad.draw.presenter.b.a$a, reason: collision with other inner class name */
    public interface InterfaceC0011a {
        void aV();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b {
        boolean aW();
    }

    public a(com.kwad.sdk.core.response.model.AdTemplate r1) {
            r0 = this;
            r0.<init>()
            r0.mAdTemplate = r1
            r1 = 0
            r0.eJ = r1
            return
    }

    @androidx.annotation.MainThread
    public final void a(com.kwad.components.ad.draw.presenter.b.a.InterfaceC0011a r1) {
            r0 = this;
            r0.eH = r1
            return
    }

    @androidx.annotation.MainThread
    public final void a(com.kwad.components.ad.draw.presenter.b.a.b r1) {
            r0 = this;
            r0.eI = r1
            return
    }

    public final void aU() {
            r2 = this;
            boolean r0 = r2.eJ
            if (r0 == 0) goto L5
            goto L3b
        L5:
            r0 = 1
            r2.eJ = r0
            com.kwad.sdk.core.response.model.AdTemplate r1 = r2.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r1 = com.kwad.sdk.core.response.b.e.el(r1)
            int r1 = r1.status
            if (r1 == r0) goto L3b
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            int r0 = r0.status
            r1 = 2
            if (r0 == r1) goto L3b
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            int r0 = r0.status
            r1 = 3
            if (r0 != r1) goto L29
            goto L3b
        L29:
            com.kwad.components.ad.draw.presenter.b.a$b r0 = r2.eI
            if (r0 == 0) goto L34
            boolean r0 = r0.aW()
            if (r0 == 0) goto L34
            goto L3b
        L34:
            com.kwad.components.ad.draw.presenter.b.a$a r0 = r2.eH
            if (r0 == 0) goto L3b
            r0.aV()
        L3b:
            return
    }
}
