package com.kwad.components.ad.interstitial.d;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b {
    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    public static boolean t(com.kwad.sdk.core.response.model.AdTemplate r0) {
            com.kwad.sdk.core.response.model.AdMatrixInfo$InterstitialCardInfo r0 = com.kwad.sdk.core.response.b.b.ct(r0)
            boolean r0 = r0.closeAfterClick
            if (r0 != 0) goto L11
            boolean r0 = com.kwad.components.ad.interstitial.b.b.dM()
            if (r0 == 0) goto Lf
            goto L11
        Lf:
            r0 = 0
            return r0
        L11:
            r0 = 1
            return r0
    }
}
