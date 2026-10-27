package com.kwad.components.core.j;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class d {

    @androidx.annotation.Nullable
    private java.lang.Object Rf;

    public d(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0.Rf = r1
            return
    }

    public final void c(com.kwad.components.core.j.c r2) {
            r1 = this;
            java.lang.Object r0 = r1.Rf
            if (r0 == 0) goto L19
            if (r2 == 0) goto L19
            java.lang.Object r0 = r2.getHost()
            if (r0 == 0) goto L19
            java.lang.Object r2 = r2.getHost()     // Catch: java.lang.Exception -> L19
            com.kwad.sdk.api.KsInnerAd r2 = (com.kwad.sdk.api.KsInnerAd) r2     // Catch: java.lang.Exception -> L19
            java.lang.Object r0 = r1.Rf     // Catch: java.lang.Exception -> L19
            com.kwad.sdk.api.KsInnerAd$KsInnerAdInteractionListener r0 = (com.kwad.sdk.api.KsInnerAd.KsInnerAdInteractionListener) r0     // Catch: java.lang.Exception -> L19
            r0.onAdClicked(r2)     // Catch: java.lang.Exception -> L19
        L19:
            return
    }

    public final void d(com.kwad.components.core.j.c r2) {
            r1 = this;
            java.lang.Object r0 = r1.Rf
            if (r0 == 0) goto L19
            if (r2 == 0) goto L19
            java.lang.Object r0 = r2.getHost()
            if (r0 == 0) goto L19
            java.lang.Object r2 = r2.getHost()     // Catch: java.lang.Exception -> L19
            com.kwad.sdk.api.KsInnerAd r2 = (com.kwad.sdk.api.KsInnerAd) r2     // Catch: java.lang.Exception -> L19
            java.lang.Object r0 = r1.Rf     // Catch: java.lang.Exception -> L19
            com.kwad.sdk.api.KsInnerAd$KsInnerAdInteractionListener r0 = (com.kwad.sdk.api.KsInnerAd.KsInnerAdInteractionListener) r0     // Catch: java.lang.Exception -> L19
            r0.onAdShow(r2)     // Catch: java.lang.Exception -> L19
        L19:
            return
    }

    public final void destroy() {
            r1 = this;
            r0 = 0
            r1.Rf = r0
            return
    }
}
