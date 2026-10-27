package com.kwad.components.offline.api.adLive;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public interface IAdLiveOfflineCompo extends com.kwad.components.offline.api.IOfflineCompo<com.kwad.components.offline.api.adLive.IAdLiveOfflineCompoInitConfig> {
    public static final java.lang.String IMPL = "com.kwad.sdk.AdLiveOfflineCompoImpl";
    public static final java.lang.String PACKAGE_NAME = "com.kwad.components.adLive";

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum AdLiveState extends java.lang.Enum<com.kwad.components.offline.api.adLive.IAdLiveOfflineCompo.AdLiveState> {
        private static final /* synthetic */ com.kwad.components.offline.api.adLive.IAdLiveOfflineCompo.AdLiveState[] $VALUES = null;
        public static final com.kwad.components.offline.api.adLive.IAdLiveOfflineCompo.AdLiveState READY = null;
        public static final com.kwad.components.offline.api.adLive.IAdLiveOfflineCompo.AdLiveState SO_FAIL = null;

        static {
                com.kwad.components.offline.api.adLive.IAdLiveOfflineCompo$AdLiveState r0 = new com.kwad.components.offline.api.adLive.IAdLiveOfflineCompo$AdLiveState
                java.lang.String r1 = "READY"
                r2 = 0
                r0.<init>(r1, r2)
                com.kwad.components.offline.api.adLive.IAdLiveOfflineCompo.AdLiveState.READY = r0
                com.kwad.components.offline.api.adLive.IAdLiveOfflineCompo$AdLiveState r1 = new com.kwad.components.offline.api.adLive.IAdLiveOfflineCompo$AdLiveState
                java.lang.String r3 = "SO_FAIL"
                r4 = 1
                r1.<init>(r3, r4)
                com.kwad.components.offline.api.adLive.IAdLiveOfflineCompo.AdLiveState.SO_FAIL = r1
                r3 = 2
                com.kwad.components.offline.api.adLive.IAdLiveOfflineCompo$AdLiveState[] r3 = new com.kwad.components.offline.api.adLive.IAdLiveOfflineCompo.AdLiveState[r3]
                r3[r2] = r0
                r3[r4] = r1
                com.kwad.components.offline.api.adLive.IAdLiveOfflineCompo.AdLiveState.$VALUES = r3
                return
        }

        AdLiveState(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.kwad.components.offline.api.adLive.IAdLiveOfflineCompo.AdLiveState valueOf(java.lang.String r1) {
                java.lang.Class<com.kwad.components.offline.api.adLive.IAdLiveOfflineCompo$AdLiveState> r0 = com.kwad.components.offline.api.adLive.IAdLiveOfflineCompo.AdLiveState.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.kwad.components.offline.api.adLive.IAdLiveOfflineCompo$AdLiveState r1 = (com.kwad.components.offline.api.adLive.IAdLiveOfflineCompo.AdLiveState) r1
                return r1
        }

        public static com.kwad.components.offline.api.adLive.IAdLiveOfflineCompo.AdLiveState[] values() {
                com.kwad.components.offline.api.adLive.IAdLiveOfflineCompo$AdLiveState[] r0 = com.kwad.components.offline.api.adLive.IAdLiveOfflineCompo.AdLiveState.$VALUES
                java.lang.Object r0 = r0.clone()
                com.kwad.components.offline.api.adLive.IAdLiveOfflineCompo$AdLiveState[] r0 = (com.kwad.components.offline.api.adLive.IAdLiveOfflineCompo.AdLiveState[]) r0
                return r0
        }
    }

    com.kwad.components.offline.api.core.adlive.IAdLiveEndRequest getAdLiveEndRequest(java.lang.String r1);

    com.kwad.components.offline.api.core.adlive.IAdLivePlayModule getAdLivePlayModule(com.kwad.components.offline.api.core.adlive.IAdLiveOfflineView r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, long r5);

    com.kwad.components.offline.api.adLive.IAdLiveOfflineCompo.AdLiveState getState();

    com.kwad.components.offline.api.core.adlive.IAdLiveOfflineView getView(android.content.Context r1, int r2);
}
