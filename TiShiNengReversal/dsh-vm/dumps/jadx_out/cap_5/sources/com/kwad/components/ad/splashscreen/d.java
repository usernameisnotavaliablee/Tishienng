package com.kwad.components.ad.splashscreen;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class d {
    public static int Fi;
    private java.lang.String Fj;
    private int Fk;

    public d() {
            r1 = this;
            r1.<init>()
            r0 = 2
            r1.Fk = r0
            return
    }

    private void Z(java.lang.String r1) {
            r0 = this;
            r0.Fj = r1
            return
    }

    public static com.kwad.components.ad.splashscreen.d a(com.kwad.sdk.core.response.model.AdTemplate r4, com.kwad.sdk.core.response.model.AdInfo r5, com.kwad.components.core.e.d.c r6, int r7) {
            java.lang.String r0 = "或点击跳转详情页或第三方应用"
            com.kwad.components.ad.splashscreen.d r1 = new com.kwad.components.ad.splashscreen.d
            r1.<init>()
            com.kwad.components.ad.splashscreen.d.Fi = r7
            if (r5 == 0) goto Laf
            if (r6 == 0) goto Laf
            r2 = 1
            if (r7 == r2) goto La8
            r2 = 4
            if (r7 != r2) goto L15
            goto La8
        L15:
            r2 = 10
            r3 = 0
            if (r7 != r2) goto L68
            boolean r7 = com.kwad.sdk.core.response.b.a.aF(r5)
            java.lang.String r2 = "扭动或点击"
            if (r7 == 0) goto L46
            int r6 = r6.pB()
            r7 = 2
            if (r6 != r7) goto L32
            java.lang.String r4 = a(r4, r5, r6, r3)
            r1.Z(r4)
            goto Laf
        L32:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r2)
            java.lang.String r4 = a(r4, r5, r6, r3)
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            r1.Z(r4)
            goto Laf
        L46:
            java.lang.String r4 = com.kwad.sdk.core.response.b.b.dH(r5)     // Catch: java.lang.Exception -> L64
            boolean r6 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> L64
            if (r6 != 0) goto L60
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L64
            r6.<init>(r2)     // Catch: java.lang.Exception -> L64
            r6.append(r4)     // Catch: java.lang.Exception -> L64
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Exception -> L64
            r1.Z(r4)     // Catch: java.lang.Exception -> L64
            goto Laf
        L60:
            r1.Z(r0)     // Catch: java.lang.Exception -> L64
            goto Laf
        L64:
            r1.Z(r0)
            goto Laf
        L68:
            boolean r7 = com.kwad.sdk.core.response.b.a.aF(r5)
            if (r7 == 0) goto L88
            int r6 = r6.pB()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "或点击"
            r7.<init>(r0)
            java.lang.String r4 = a(r4, r5, r6, r3)
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            r1.Z(r4)
            goto Laf
        L88:
            com.kwad.sdk.core.config.item.r r4 = com.kwad.components.ad.splashscreen.b.a.FO
            java.lang.String r4 = com.kwad.sdk.core.config.e.a(r4)
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            if (r6 == 0) goto L96
            java.lang.String r4 = "点击跳转详情页或第三方应用"
        L96:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "或"
            r6.<init>(r7)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r1.Z(r4)
            goto Laf
        La8:
            java.lang.String r4 = a(r4, r5, r6)
            r1.Z(r4)
        Laf:
            int r4 = com.kwad.sdk.core.response.b.b.dK(r5)
            r1.aj(r4)
            return r1
    }

    private static java.lang.String a(com.kwad.sdk.core.response.model.AdInfo r2, int r3) {
            r0 = 1
            java.lang.String r1 = ""
            if (r3 != r0) goto L11
            java.lang.String r3 = com.kwad.sdk.core.response.b.b.dH(r2)
            if (r3 == 0) goto L10
            java.lang.String r2 = com.kwad.sdk.core.response.b.b.dH(r2)
            return r2
        L10:
            return r1
        L11:
            r0 = 4
            if (r3 != r0) goto L1f
            java.lang.String r3 = com.kwad.sdk.core.response.b.b.dI(r2)
            if (r3 == 0) goto L1f
            java.lang.String r2 = com.kwad.sdk.core.response.b.b.dI(r2)
            return r2
        L1f:
            return r1
    }

    public static java.lang.String a(com.kwad.sdk.core.response.model.AdTemplate r2, com.kwad.sdk.core.response.model.AdInfo r3, int r4, int r5) {
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.aE(r3)
            r1 = 2
            if (r4 == r1) goto L20
            r5 = 4
            if (r4 == r5) goto L1d
            r5 = 8
            if (r4 == r5) goto L18
            r2 = 12
            if (r4 == r2) goto L13
            return r0
        L13:
            java.lang.String r2 = com.kwad.sdk.core.response.b.a.ac(r3)
            return r2
        L18:
            java.lang.String r2 = com.kwad.sdk.core.response.b.a.cl(r2)
            return r2
        L1d:
            java.lang.String r2 = "继续下载"
            return r2
        L20:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            java.lang.String r3 = "%"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            return r2
    }

    private static java.lang.String a(com.kwad.sdk.core.response.model.AdTemplate r1, com.kwad.sdk.core.response.model.AdInfo r2, com.kwad.components.core.e.d.c r3) {
            boolean r0 = com.kwad.sdk.core.response.b.a.aF(r2)
            if (r0 == 0) goto L10
            int r3 = r3.pB()
            r0 = 0
            java.lang.String r1 = a(r1, r2, r3, r0)
            return r1
        L10:
            int r1 = com.kwad.components.ad.splashscreen.d.Fi
            java.lang.String r1 = a(r2, r1)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L1e
            java.lang.String r1 = "点击跳转详情页或第三方应用"
        L1e:
            return r1
    }

    private void aj(int r1) {
            r0 = this;
            r0.Fk = r1
            return
    }

    public final java.lang.String lA() {
            r1 = this;
            java.lang.String r0 = r1.Fj
            return r0
    }

    public final int lB() {
            r1 = this;
            int r0 = r1.Fk
            return r0
    }
}
