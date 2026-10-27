package com.kwad.components.core.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class l implements com.kwad.components.core.c.c {


    public l() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    @androidx.annotation.WorkerThread
    public static com.kwad.sdk.core.response.model.AdResultData e(com.kwad.components.core.request.model.a r8) {
            com.kwad.components.core.c.a r0 = com.kwad.components.core.c.a.nZ()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r2 = r8.getAdNum()
            long r3 = r8.getPosId()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            long r4 = r8.getPosId()
            com.kwad.components.core.c.e r8 = com.kwad.components.core.c.e.x(r4)
            long r4 = java.lang.System.currentTimeMillis()
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r6
            int r8 = r8.oi()
            java.util.List r8 = r0.a(r3, r4, r8)
            boolean r0 = com.kwad.sdk.core.config.e.FW()
            if (r0 == 0) goto L34
            l(r8)
        L34:
            if (r8 == 0) goto L51
            int r0 = r8.size()
            if (r0 <= 0) goto L51
            java.util.Collections.sort(r8)
            int r0 = r8.size()
            r1 = 0
            int r0 = java.lang.Math.min(r0, r2)
            java.util.List r8 = r8.subList(r1, r0)
            com.kwad.sdk.core.response.model.AdResultData r8 = com.kwad.components.core.c.h.k(r8)
            return r8
        L51:
            return r1
    }

    private static void l(java.util.List<com.kwad.components.core.c.h> r3) {
            if (r3 != 0) goto L3
            goto L38
        L3:
            java.util.Iterator r3 = r3.iterator()
        L7:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L38
            java.lang.Object r0 = r3.next()
            com.kwad.components.core.c.h r0 = (com.kwad.components.core.c.h) r0
            com.kwad.components.core.c.g r1 = com.kwad.components.core.c.g.om()
            boolean r1 = r1.a(r0)
            if (r1 == 0) goto L7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "filterByMemCached contain: "
            r1.<init>(r2)
            java.lang.String r0 = r0.os()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "StrategyLocalCacheFirst"
            com.kwad.sdk.core.d.c.d(r1, r0)
            r3.remove()
            goto L7
        L38:
            return
    }

    @Override // com.kwad.components.core.c.c
    public final void d(com.kwad.components.core.request.model.a r3) {
            r2 = this;
            java.util.concurrent.ExecutorService r0 = com.kwad.sdk.core.threads.GlobalThreadPools.Jt()
            com.kwad.components.core.c.l$1 r1 = new com.kwad.components.core.c.l$1
            r1.<init>(r2, r3)
            r0.submit(r1)
            return
    }

    @Override // com.kwad.components.core.c.c
    public final java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = "StrategyLocalCacheFirst"
            return r0
    }
}
