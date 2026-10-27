package com.kwad.components.core.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class j extends com.kwad.sdk.core.network.o<com.kwad.components.core.request.a, com.kwad.sdk.core.response.model.AdResultData> {
    private final com.kwad.components.core.request.model.a NR;


    public j(com.kwad.components.core.request.model.a r1) {
            r0 = this;
            r0.<init>()
            r0.NR = r1
            return
    }

    static /* synthetic */ void a(com.kwad.components.core.c.j r0, com.kwad.sdk.core.response.model.AdResultData r1) {
            m(r1)
            return
    }

    private void a(@androidx.annotation.NonNull com.kwad.components.core.request.a r2, @androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdResultData r3) {
            r1 = this;
            super.onSuccess(r2, r3)
            java.util.concurrent.ExecutorService r2 = com.kwad.sdk.core.threads.GlobalThreadPools.Jt()
            com.kwad.components.core.c.j$1 r0 = new com.kwad.components.core.c.j$1
            r0.<init>(r1, r3)
            r2.submit(r0)
            com.kwad.components.core.request.model.a r2 = r1.NR
            boolean r2 = r1.a(r2, r3)
            if (r2 != 0) goto L1d
            com.kwad.components.core.request.model.a r2 = r1.NR
            r0 = 0
            com.kwad.components.core.request.model.a.a(r2, r3, r0)
        L1d:
            return
    }

    @androidx.annotation.WorkerThread
    private static void m(com.kwad.sdk.core.response.model.AdResultData r4) {
            java.util.List r0 = r4.getProceedTemplateList()
            com.kwad.components.core.c.a r1 = com.kwad.components.core.c.a.nZ()
            if (r1 == 0) goto L30
            int r2 = r0.size()
            if (r2 <= 0) goto L30
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            com.kwad.sdk.core.response.model.AdTemplate r0 = (com.kwad.sdk.core.response.model.AdTemplate) r0
            long r2 = r4.getPosId()
            com.kwad.components.core.c.e r2 = com.kwad.components.core.c.e.x(r2)
            r1.oa()
            java.util.List r4 = com.kwad.components.core.c.h.a(r2, r4)
            r1.j(r4)
            com.kwad.components.core.c.e r4 = com.kwad.components.core.c.e.au(r0)
            r1.a(r4)
        L30:
            return
    }

    public void a(@androidx.annotation.NonNull com.kwad.components.core.request.a r2, int r3, java.lang.String r4) {
            r1 = this;
            super.onError(r2, r3, r4)
            com.kwad.components.core.request.model.a r2 = r1.NR
            r0 = 0
            com.kwad.components.core.request.model.a.a(r2, r3, r4, r0)
            return
    }

    protected boolean a(com.kwad.components.core.request.model.a r1, com.kwad.sdk.core.response.model.AdResultData r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.kwad.sdk.core.network.o, com.kwad.sdk.core.network.g
    public /* synthetic */ void onError(@androidx.annotation.NonNull com.kwad.sdk.core.network.f r1, int r2, java.lang.String r3) {
            r0 = this;
            com.kwad.components.core.request.a r1 = (com.kwad.components.core.request.a) r1
            r0.a(r1, r2, r3)
            return
    }

    @Override // com.kwad.sdk.core.network.o, com.kwad.sdk.core.network.g
    public /* synthetic */ void onSuccess(@androidx.annotation.NonNull com.kwad.sdk.core.network.f r1, @androidx.annotation.NonNull com.kwad.sdk.core.response.model.BaseResultData r2) {
            r0 = this;
            com.kwad.components.core.request.a r1 = (com.kwad.components.core.request.a) r1
            com.kwad.sdk.core.response.model.AdResultData r2 = (com.kwad.sdk.core.response.model.AdResultData) r2
            r0.a(r1, r2)
            return
    }
}
