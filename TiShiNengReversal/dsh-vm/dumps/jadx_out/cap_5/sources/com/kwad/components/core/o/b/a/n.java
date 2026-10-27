package com.kwad.components.core.o.b.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class n implements com.kwad.components.offline.api.core.network.IIdc {
    public n() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.kwad.components.offline.api.core.network.IIdc
    public final java.lang.String hostForAPI(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "api"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Ld
            java.lang.String r4 = com.kwad.sdk.h.AK()
            return r4
        Ld:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "https://"
            r0.<init>(r1)
            com.kwad.sdk.core.network.idc.a r1 = com.kwad.sdk.core.network.idc.a.HF()
            r2 = 0
            java.lang.String r4 = r1.W(r4, r2)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }
}
