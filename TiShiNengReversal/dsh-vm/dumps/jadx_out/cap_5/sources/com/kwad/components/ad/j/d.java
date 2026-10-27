package com.kwad.components.ad.j;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class d implements com.kwad.sdk.core.network.h.a {
    private static volatile com.kwad.components.ad.j.d LT;

    private d() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.kwad.components.ad.j.d nG() {
            com.kwad.components.ad.j.d r0 = com.kwad.components.ad.j.d.LT
            if (r0 != 0) goto L19
            java.lang.Class<com.kwad.components.ad.j.d> r0 = com.kwad.components.ad.j.d.class
            monitor-enter(r0)
            com.kwad.components.ad.j.d r1 = com.kwad.components.ad.j.d.LT     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.kwad.components.ad.j.d r1 = new com.kwad.components.ad.j.d     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.kwad.components.ad.j.d.LT = r1     // Catch: java.lang.Throwable -> L13
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
            com.kwad.components.ad.j.d r0 = com.kwad.components.ad.j.d.LT
            return r0
    }

    @Override // com.kwad.sdk.core.network.h.a
    public final void a(com.kwad.sdk.core.network.f r3, int r4) {
            r2 = this;
            boolean r0 = r3 instanceof com.kwad.components.core.request.a
            if (r0 != 0) goto L5
            goto L3a
        L5:
            com.kwad.sdk.core.network.e r0 = com.kwad.sdk.core.network.e.aEq
            int r0 = r0.errorCode
            if (r4 != r0) goto Lc
            goto L3a
        Lc:
            com.kwad.sdk.internal.api.SceneImpl r3 = r3.getScene()
            if (r3 == 0) goto L3a
            long r0 = r3.getPosId()
            com.kwad.sdk.core.network.e r3 = com.kwad.sdk.core.network.e.aEl
            int r3 = r3.errorCode
            if (r4 != r3) goto L1f
            r3 = 21001(0x5209, float:2.9429E-41)
            goto L33
        L1f:
            com.kwad.sdk.core.network.e r3 = com.kwad.sdk.core.network.e.aEp
            int r3 = r3.errorCode
            if (r4 != r3) goto L28
            r3 = 21003(0x520b, float:2.9431E-41)
            goto L33
        L28:
            if (r4 <= 0) goto L31
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r4 >= r3) goto L31
            r3 = 21002(0x520a, float:2.943E-41)
            goto L33
        L31:
            r3 = 21004(0x520c, float:2.9433E-41)
        L33:
            com.kwad.components.core.p.a r4 = com.kwad.components.core.p.a.se()
            r4.c(r0, r3)
        L3a:
            return
    }

    public final void init() {
            r1 = this;
            com.kwad.sdk.core.network.h r0 = com.kwad.sdk.core.network.h.Hy()
            r0.a(r1)
            return
    }
}
