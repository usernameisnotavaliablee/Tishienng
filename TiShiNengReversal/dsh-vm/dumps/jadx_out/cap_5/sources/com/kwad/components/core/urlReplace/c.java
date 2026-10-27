package com.kwad.components.core.urlReplace;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c {
    private com.kwad.sdk.core.network.l<com.kwad.components.core.urlReplace.b, com.kwad.components.core.urlReplace.MarketUrlReplaceData> Yx;



    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    public final void a(java.lang.String r2, com.kwad.components.core.urlReplace.a r3) {
            r1 = this;
            com.kwad.components.core.urlReplace.c$1 r0 = new com.kwad.components.core.urlReplace.c$1
            r0.<init>(r1, r2)
            r1.Yx = r0
            com.kwad.components.core.urlReplace.c$2 r2 = new com.kwad.components.core.urlReplace.c$2
            r2.<init>(r1, r3)
            r0.request(r2)
            return
    }

    public final void sU() {
            r1 = this;
            com.kwad.sdk.core.network.l<com.kwad.components.core.urlReplace.b, com.kwad.components.core.urlReplace.MarketUrlReplaceData> r0 = r1.Yx
            if (r0 == 0) goto La
            r0.cancel()
            r0 = 0
            r1.Yx = r0
        La:
            return
    }
}
