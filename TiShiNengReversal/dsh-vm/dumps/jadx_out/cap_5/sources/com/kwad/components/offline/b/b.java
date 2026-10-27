package com.kwad.components.offline.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b extends com.kwad.components.core.o.b.a<com.kwad.components.offline.api.adWaynePlayer.IAdWaynePlayerOfflineCompo> {


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a {
        private static final com.kwad.components.offline.b.b ajI = null;

        static {
                com.kwad.components.offline.b.b r0 = new com.kwad.components.offline.b.b
                r1 = 0
                r0.<init>(r1)
                com.kwad.components.offline.b.b.a.ajI = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.kwad.components.offline.b.b wu() {
                com.kwad.components.offline.b.b r0 = com.kwad.components.offline.b.b.a.ajI
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

    private void a(android.content.Context r3, com.kwad.components.offline.api.adWaynePlayer.IAdWaynePlayerOfflineCompo r4) {
            r2 = this;
            com.kwad.components.offline.b.c r0 = new com.kwad.components.offline.b.c
            r0.<init>()
            com.kwad.components.offline.b.b$1 r1 = new com.kwad.components.offline.b.b$1
            r1.<init>(r2, r4)
            r4.init(r3, r0, r1)
            return
    }

    static /* synthetic */ void a(com.kwad.components.offline.b.b r0) {
            r0.qx()
            return
    }

    static /* synthetic */ void a(com.kwad.components.offline.b.b r0, int r1) {
            r0.aJ(r1)
            return
    }

    @com.ksad.annotation.invoker.InvokeBy(invokerClass = com.kwad.components.core.o.b.b.class, methodId = "initOC")
    public static void aF(android.content.Context r1) {
            com.kwad.components.offline.b.b r0 = wt()
            r0.init(r1)
            return
    }

    private static com.kwad.components.offline.b.b wt() {
            com.kwad.components.offline.b.b r0 = com.kwad.components.offline.b.b.a.wu()
            return r0
    }

    @Override // com.kwad.components.core.o.b.a
    public final /* bridge */ /* synthetic */ void a(android.content.Context r1, boolean r2, com.kwad.components.offline.api.adWaynePlayer.IAdWaynePlayerOfflineCompo r3) {
            r0 = this;
            com.kwad.components.offline.api.adWaynePlayer.IAdWaynePlayerOfflineCompo r3 = (com.kwad.components.offline.api.adWaynePlayer.IAdWaynePlayerOfflineCompo) r3
            r0.a(r1, r3)
            return
    }

    @Override // com.kwad.components.core.o.b.a
    public final java.lang.String getTag() {
            r1 = this;
            java.lang.String r0 = "AdWaynePlayerInitModule"
            return r0
    }

    @Override // com.kwad.components.core.o.b.a
    public final boolean isEnabled() {
            r2 = this;
            com.kwad.sdk.core.config.item.k r0 = com.kwad.sdk.core.config.c.aBV
            int r0 = com.kwad.sdk.core.config.e.a(r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r0) goto L1a
            com.kwad.sdk.core.config.item.d r0 = com.kwad.sdk.core.config.c.aBS
            java.lang.Object r0 = com.kwad.sdk.core.config.e.b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1a
            r0 = 1
            return r0
        L1a:
            r0 = 0
            return r0
    }

    @Override // com.kwad.components.core.o.b.a
    public final java.lang.String qA() {
            r1 = this;
            java.lang.String r0 = "4.4.20.1"
            return r0
    }

    @Override // com.kwad.components.core.o.b.a
    public final java.lang.String qB() {
            r1 = this;
            java.lang.String r0 = "https://p5-lm.adkwai.com/udata/pkg/KS-Android-KSAdSDk/offline_components/adWaynePlayer/ks_so-adWaynePlayerNoSoRelease-4.4.20.1-f5fa94106c-87.zip"
            return r0
    }

    @Override // com.kwad.components.core.o.b.a
    public final java.lang.String qC() {
            r1 = this;
            java.lang.String r0 = "de8902ac8ffc6225035515217d960ba1"
            return r0
    }

    @Override // com.kwad.components.core.o.b.a
    public final java.lang.String qD() {
            r1 = this;
            java.lang.String r0 = "ks_wayne_player_44201"
            return r0
    }

    @Override // com.kwad.components.core.o.b.a
    public final java.lang.String qE() {
            r1 = this;
            java.lang.String r0 = "com.kwad.sdk.AdWaynePlayerOfflineCompoImpl"
            return r0
    }

    @Override // com.kwad.components.core.o.b.a
    public final java.lang.String qy() {
            r1 = this;
            java.lang.String r0 = "WAYNEPLAYER"
            return r0
    }

    @Override // com.kwad.components.core.o.b.a
    public final java.lang.String qz() {
            r1 = this;
            java.lang.String r0 = "com.kwad.components.adWaynePlayer"
            return r0
    }
}
