package com.kwad.components.core.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b {
    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    private static void ae(java.lang.String r1) {
            boolean r0 = oc()
            if (r0 != 0) goto L7
            goto L18
        L7:
            com.kwad.sdk.l r0 = com.kwad.sdk.l.Cf()
            boolean r0 = r0.Bn()
            if (r0 == 0) goto L18
            android.content.Context r0 = com.kwad.sdk.service.ServiceProvider.getContext()
            com.kwad.sdk.utils.ac.Q(r0, r1)
        L18:
            return
    }

    public static void b(com.kwad.components.core.c.e r2) {
            int r2 = r2.oh()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "使用缓存策略: "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            ae(r2)
            return
    }

    public static boolean oc() {
            java.lang.Class<com.kwad.sdk.components.DevelopMangerComponents> r0 = com.kwad.sdk.components.DevelopMangerComponents.class
            com.kwad.sdk.components.b r0 = com.kwad.sdk.components.d.f(r0)
            com.kwad.sdk.components.DevelopMangerComponents r0 = (com.kwad.sdk.components.DevelopMangerComponents) r0
            r0 = 0
            return r0
    }
}
