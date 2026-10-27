package com.kwad.components.ad.reward;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class i {
    private java.util.Map<java.lang.String, java.util.List<com.kwad.sdk.core.response.model.AdTemplate>> ta;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a {
        private static final com.kwad.components.ad.reward.i tb = null;

        static {
                com.kwad.components.ad.reward.i r0 = new com.kwad.components.ad.reward.i
                r1 = 0
                r0.<init>(r1)
                com.kwad.components.ad.reward.i.a.tb = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.kwad.components.ad.reward.i ht() {
                com.kwad.components.ad.reward.i r0 = com.kwad.components.ad.reward.i.a.tb
                return r0
        }
    }

    private i() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.ta = r0
            return
    }

    /* synthetic */ i(byte r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.kwad.components.ad.reward.i hs() {
            com.kwad.components.ad.reward.i r0 = com.kwad.components.ad.reward.i.a.ht()
            return r0
    }

    public final void H(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.util.List<com.kwad.sdk.core.response.model.AdTemplate>> r0 = r1.ta
            r0.remove(r2)
            return
    }
}
