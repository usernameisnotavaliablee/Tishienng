package com.kwad.components.ad.nativead.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c extends com.kwad.components.ad.nativead.a.a {
    private java.util.List<java.lang.Integer> ck;
    private volatile boolean eE;


    public c() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.eE = r0
            return
    }

    static /* synthetic */ com.kwad.components.ad.nativead.a.b a(com.kwad.components.ad.nativead.b.c r0) {
            com.kwad.components.ad.nativead.a.b r0 = r0.pq
            return r0
    }

    static /* synthetic */ void a(com.kwad.components.ad.nativead.b.c r0, long r1) {
            r0.c(r1)
            return
    }

    static /* synthetic */ boolean a(com.kwad.components.ad.nativead.b.c r0, boolean r1) {
            r0.eE = r1
            return r1
    }

    static /* synthetic */ com.kwad.components.ad.nativead.a.b b(com.kwad.components.ad.nativead.b.c r0) {
            com.kwad.components.ad.nativead.a.b r0 = r0.pq
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.nativead.a.b c(com.kwad.components.ad.nativead.b.c r0) {
            com.kwad.components.ad.nativead.a.b r0 = r0.pq
            return r0
    }

    private void c(long r3) {
            r2 = this;
            float r3 = (float) r3
            r4 = 1148846080(0x447a0000, float:1000.0)
            float r3 = r3 / r4
            double r3 = (double) r3
            double r3 = java.lang.Math.ceil(r3)
            int r3 = (int) r3
            java.util.List<java.lang.Integer> r4 = r2.ck
            if (r4 == 0) goto L3a
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L15
            goto L3a
        L15:
            java.util.List<java.lang.Integer> r4 = r2.ck
            java.util.Iterator r4 = r4.iterator()
        L1b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L3a
            java.lang.Object r0 = r4.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r1 = r0.intValue()
            if (r3 < r1) goto L1b
            com.kwad.components.ad.nativead.a.b r4 = r2.pq
            com.kwad.sdk.core.response.model.AdTemplate r4 = r4.mAdTemplate
            r1 = 0
            com.kwad.sdk.core.adlog.c.a(r4, r3, r1)
            java.util.List<java.lang.Integer> r3 = r2.ck
            r3.remove(r0)
        L3a:
            return
    }

    static /* synthetic */ com.kwad.components.ad.nativead.a.b d(com.kwad.components.ad.nativead.b.c r0) {
            com.kwad.components.ad.nativead.a.b r0 = r0.pq
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.nativead.a.b e(com.kwad.components.ad.nativead.b.c r0) {
            com.kwad.components.ad.nativead.a.b r0 = r0.pq
            return r0
    }

    static /* synthetic */ boolean f(com.kwad.components.ad.nativead.b.c r0) {
            boolean r0 = r0.eE
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.nativead.a.b g(com.kwad.components.ad.nativead.b.c r0) {
            com.kwad.components.ad.nativead.a.b r0 = r0.pq
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.nativead.a.b h(com.kwad.components.ad.nativead.b.c r0) {
            com.kwad.components.ad.nativead.a.b r0 = r0.pq
            return r0
    }

    @Override // com.kwad.components.ad.nativead.a.a, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r2 = this;
            super.at()
            com.kwad.components.ad.nativead.a.b r0 = r2.pq
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            java.util.List r0 = com.kwad.sdk.core.response.b.a.bp(r0)
            r2.ck = r0
            com.kwad.components.ad.nativead.b.c$1 r0 = new com.kwad.components.ad.nativead.b.c$1
            r0.<init>(r2)
            r2.mVideoPlayStateListener = r0
            com.kwad.components.ad.nativead.a.b r1 = r2.pq
            com.kwad.components.ad.nativead.c.a r1 = r1.pr
            r1.a2(r0)
            return
    }
}
