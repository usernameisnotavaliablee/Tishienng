package com.kwad.components.offline.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b extends com.kwad.components.core.o.b.a<com.kwad.components.offline.api.adLive.IAdLiveOfflineCompo> {


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a {
        private static final com.kwad.components.offline.a.b ajw = null;

        static {
                com.kwad.components.offline.a.b r0 = new com.kwad.components.offline.a.b
                r1 = 0
                r0.<init>(r1)
                com.kwad.components.offline.a.b.a.ajw = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.kwad.components.offline.a.b wr() {
                com.kwad.components.offline.a.b r0 = com.kwad.components.offline.a.b.a.ajw
                return r0
        }
    }

    private b() {
            r0 = this;
            r0.<init>()
            return
    }

    /* synthetic */ b(byte r1) {
            r0 = this;
            r0.<init>()
            return
    }

    private void a(android.content.Context r3, com.kwad.components.offline.api.adLive.IAdLiveOfflineCompo r4) {
            r2 = this;
            com.kwad.components.offline.a.c r0 = new com.kwad.components.offline.a.c
            r0.<init>()
            com.kwad.components.offline.a.b$1 r1 = new com.kwad.components.offline.a.b$1
            r1.<init>(r2, r4)
            r4.init(r3, r0, r1)
            return
    }

    static /* synthetic */ void a(com.kwad.components.offline.a.b r0) {
            r0.qx()
            return
    }

    static /* synthetic */ void a(com.kwad.components.offline.a.b r0, int r1) {
            r0.aJ(r1)
            return
    }

    @com.ksad.annotation.invoker.InvokeBy(invokerClass = com.kwad.components.core.o.b.b.class, methodId = "initOC")
    public static void aF(android.content.Context r1) {
            com.kwad.components.offline.a.b r0 = wq()
            r0.init(r1)
            return
    }

    private static com.kwad.components.offline.a.b wq() {
            com.kwad.components.offline.a.b r0 = com.kwad.components.offline.a.b.a.wr()
            return r0
    }

    @Override // com.kwad.components.core.o.b.a
    public final /* bridge */ /* synthetic */ void a(android.content.Context r1, boolean r2, com.kwad.components.offline.api.adLive.IAdLiveOfflineCompo r3) {
            r0 = this;
            com.kwad.components.offline.api.adLive.IAdLiveOfflineCompo r3 = (com.kwad.components.offline.api.adLive.IAdLiveOfflineCompo) r3
            r0.a(r1, r3)
            return
    }

    @Override // com.kwad.components.core.o.b.a
    public final java.lang.String getTag() {
            r1 = this;
            java.lang.String r0 = "AdLiveInitModule"
            return r0
    }

    @Override // com.kwad.components.core.o.b.a
    public final boolean isEnabled() {
            r1 = this;
            com.kwad.sdk.core.config.item.d r0 = com.kwad.sdk.core.config.c.azT
            java.lang.Object r0 = com.kwad.sdk.core.config.e.b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    @Override // com.kwad.components.core.o.b.a
    public final java.lang.String qA() {
            r1 = this;
            java.lang.String r0 = "3.3.76"
            return r0
    }

    @Override // com.kwad.components.core.o.b.a
    public final java.lang.String qB() {
            r1 = this;
            java.lang.String r0 = "https://p1-lm.adkwai.com/udata/pkg/KS-Android-KSAdSDk/offline_components/adLive/ks_so-adLiveNoSoRelease-3.3.76-089e702802-65.zip"
            return r0
    }

    @Override // com.kwad.components.core.o.b.a
    public final java.lang.String qC() {
            r1 = this;
            java.lang.String r0 = "611820df0455699043f4a75e86ea0e69"
            return r0
    }

    @Override // com.kwad.components.core.o.b.a
    public final java.lang.String qD() {
            r1 = this;
            java.lang.String r0 = "ks_live_3376"
            return r0
    }

    @Override // com.kwad.components.core.o.b.a
    public final java.lang.String qE() {
            r1 = this;
            java.lang.String r0 = "com.kwad.sdk.AdLiveOfflineCompoImpl"
            return r0
    }

    @Override // com.kwad.components.core.o.b.a
    public final java.lang.String qy() {
            r1 = this;
            java.lang.String r0 = "LIVE"
            return r0
    }

    @Override // com.kwad.components.core.o.b.a
    public final java.lang.String qz() {
            r1 = this;
            java.lang.String r0 = "com.kwad.components.adLive"
            return r0
    }
}
