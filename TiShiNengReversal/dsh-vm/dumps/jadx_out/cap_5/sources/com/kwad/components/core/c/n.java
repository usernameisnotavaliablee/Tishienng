package com.kwad.components.core.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class n implements com.kwad.components.core.c.c {


    public n() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a(com.kwad.components.core.request.model.a r2, @androidx.annotation.NonNull com.kwad.components.core.c.j r3) {
            com.kwad.components.core.c.n$1 r0 = new com.kwad.components.core.c.n$1
            com.kwad.components.core.request.model.ImpInfo r1 = r2.Rw
            r0.<init>(r1, r2)
            r0.request(r3)
            return
    }

    @Override // com.kwad.components.core.c.c
    public final void d(com.kwad.components.core.request.model.a r2) {
            r1 = this;
            com.kwad.components.core.c.j r0 = new com.kwad.components.core.c.j
            r0.<init>(r2)
            a(r2, r0)
            return
    }

    @Override // com.kwad.components.core.c.c
    public final java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = "StrategyNetworkOnlyFetcher"
            return r0
    }
}
