package com.kwad.components.ad.interstitial.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b {
    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    public static int b(com.kwad.sdk.core.response.model.AdInfo r2) {
            com.kwad.sdk.core.config.item.k r0 = com.kwad.components.ad.interstitial.b.a.lQ
            java.lang.Integer r0 = r0.GA()
            int r0 = r0.intValue()
            boolean r1 = com.kwad.sdk.core.response.b.a.bc(r2)
            if (r1 == 0) goto L1c
            int r2 = com.kwad.sdk.core.response.b.a.L(r2)
            if (r0 != 0) goto L17
            return r2
        L17:
            int r2 = java.lang.Math.min(r0, r2)
            return r2
        L1c:
            r2 = 60
            if (r0 > r2) goto L24
            if (r0 > 0) goto L23
            goto L24
        L23:
            return r0
        L24:
            return r2
    }

    public static boolean dH() {
            com.kwad.sdk.core.config.item.d r0 = com.kwad.components.ad.interstitial.b.a.lS
            java.lang.Boolean r0 = r0.Gv()
            boolean r0 = r0.booleanValue()
            return r0
    }

    public static boolean dI() {
            com.kwad.sdk.core.config.item.k r0 = com.kwad.components.ad.interstitial.b.a.lM
            java.lang.Integer r0 = r0.GA()
            int r0 = r0.intValue()
            r1 = 1
            if (r0 != r1) goto Le
            return r1
        Le:
            r0 = 0
            return r0
    }

    public static int dJ() {
            com.kwad.sdk.core.config.item.k r0 = com.kwad.components.ad.interstitial.b.a.lN
            java.lang.Integer r0 = r0.GA()
            int r0 = r0.intValue()
            return r0
    }

    public static boolean dK() {
            com.kwad.sdk.core.config.item.k r0 = com.kwad.components.ad.interstitial.b.a.lO
            java.lang.Integer r0 = r0.GA()
            int r0 = r0.intValue()
            r1 = 1
            if (r0 != r1) goto Le
            return r1
        Le:
            r0 = 0
            return r0
    }

    public static boolean dL() {
            com.kwad.sdk.core.config.item.k r0 = com.kwad.components.ad.interstitial.b.a.lP
            java.lang.Integer r0 = r0.GA()
            int r0 = r0.intValue()
            r1 = 1
            if (r0 != r1) goto Le
            return r1
        Le:
            r0 = 0
            return r0
    }

    public static boolean dM() {
            com.kwad.sdk.core.config.item.k r0 = com.kwad.components.ad.interstitial.b.a.lR
            java.lang.Integer r0 = r0.GA()
            int r0 = r0.intValue()
            r1 = 1
            if (r0 != r1) goto Le
            return r1
        Le:
            r0 = 0
            return r0
    }

    public static boolean dN() {
            com.kwad.sdk.core.config.item.k r0 = com.kwad.components.ad.interstitial.b.a.lT
            java.lang.Integer r0 = r0.GA()
            int r0 = r0.intValue()
            r1 = 1
            if (r0 != r1) goto Le
            return r1
        Le:
            r0 = 0
            return r0
    }
}
