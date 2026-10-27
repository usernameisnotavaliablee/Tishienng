package com.kwad.components.core.t;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class b {
    private static volatile com.kwad.components.core.t.b YH;


    private b() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static com.kwad.components.core.t.b sY() {
            com.kwad.components.core.t.b r0 = com.kwad.components.core.t.b.YH
            if (r0 != 0) goto L19
            java.lang.Class<com.kwad.components.core.t.b> r0 = com.kwad.components.core.t.b.class
            monitor-enter(r0)
            com.kwad.components.core.t.b r1 = com.kwad.components.core.t.b.YH     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.kwad.components.core.t.b r1 = new com.kwad.components.core.t.b     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.kwad.components.core.t.b.YH = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.kwad.components.core.t.b r0 = com.kwad.components.core.t.b.YH
            return r0
    }

    public final boolean a(com.kwad.sdk.core.response.model.AdTemplate r5, @androidx.annotation.Nullable org.json.JSONObject r6, @androidx.annotation.Nullable com.kwad.sdk.core.adlog.c.b r7) {
            r4 = this;
            java.lang.Class<com.kwad.components.core.o.a.c.a> r0 = com.kwad.components.core.o.a.c.a.class
            java.lang.Class<com.kwad.sdk.components.DevelopMangerComponents> r1 = com.kwad.sdk.components.DevelopMangerComponents.class
            com.kwad.sdk.components.b r1 = com.kwad.sdk.components.d.f(r1)
            com.kwad.sdk.components.DevelopMangerComponents r1 = (com.kwad.sdk.components.DevelopMangerComponents) r1
            r2 = 0
            if (r1 == 0) goto L20
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "processAdImpress notImpression: "
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "AdEventHelper"
            com.kwad.sdk.core.d.c.d(r3, r1)
        L20:
            if (r7 == 0) goto L26
            r1 = 0
            r7.b(r5, r1, r1, r1)
        L26:
            boolean r6 = com.kwad.sdk.core.adlog.c.b(r5, r6, r7)
            com.kwad.sdk.internal.api.SceneImpl r7 = r5.mAdScene     // Catch: java.lang.Throwable -> L51
            if (r7 == 0) goto L35
            int r7 = r7.adStyle     // Catch: java.lang.Throwable -> L51
            r1 = 10000(0x2710, float:1.4013E-41)
            if (r7 != r1) goto L35
            r2 = 1
        L35:
            int r7 = r5.adStyle     // Catch: java.lang.Throwable -> L51
            r1 = 3
            if (r7 == r1) goto L43
            r1 = 2
            if (r7 == r1) goto L43
            r1 = 13
            if (r7 == r1) goto L43
            if (r2 == 0) goto L51
        L43:
            com.kwad.sdk.core.response.b.e.el(r5)     // Catch: java.lang.Throwable -> L51
            if (r6 == 0) goto L51
            com.kwad.sdk.components.b r7 = com.kwad.sdk.components.d.f(r0)
            if (r7 == 0) goto L51
            com.kwad.sdk.components.d.f(r0)
        L51:
            com.kwad.components.core.t.b$1 r7 = new com.kwad.components.core.t.b$1
            r7.<init>(r4, r5)
            com.kwad.sdk.utils.h.execute(r7)
            com.kwad.components.core.c.g r7 = com.kwad.components.core.c.g.om()
            r7.av(r5)
            return r6
    }
}
