package com.kwad.components.offline.api.adWaynePlayer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public interface IAdWaynePlayerOfflineCompo extends com.kwad.components.offline.api.IOfflineCompo<com.kwad.components.offline.api.adWaynePlayer.IAdWaynePlayerOfflineCompoInitConfig> {
    public static final java.lang.String IMPL = "com.kwad.sdk.AdWaynePlayerOfflineCompoImpl";
    public static final java.lang.String PACKAGE_NAME = "com.kwad.components.adWaynePlayer";

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum AdWaynePlayerState extends java.lang.Enum<com.kwad.components.offline.api.adWaynePlayer.IAdWaynePlayerOfflineCompo.AdWaynePlayerState> {
        private static final /* synthetic */ com.kwad.components.offline.api.adWaynePlayer.IAdWaynePlayerOfflineCompo.AdWaynePlayerState[] $VALUES = null;
        public static final com.kwad.components.offline.api.adWaynePlayer.IAdWaynePlayerOfflineCompo.AdWaynePlayerState READY = null;
        public static final com.kwad.components.offline.api.adWaynePlayer.IAdWaynePlayerOfflineCompo.AdWaynePlayerState SO_FAIL = null;

        static {
                com.kwad.components.offline.api.adWaynePlayer.IAdWaynePlayerOfflineCompo$AdWaynePlayerState r0 = new com.kwad.components.offline.api.adWaynePlayer.IAdWaynePlayerOfflineCompo$AdWaynePlayerState
                java.lang.String r1 = "READY"
                r2 = 0
                r0.<init>(r1, r2)
                com.kwad.components.offline.api.adWaynePlayer.IAdWaynePlayerOfflineCompo.AdWaynePlayerState.READY = r0
                com.kwad.components.offline.api.adWaynePlayer.IAdWaynePlayerOfflineCompo$AdWaynePlayerState r1 = new com.kwad.components.offline.api.adWaynePlayer.IAdWaynePlayerOfflineCompo$AdWaynePlayerState
                java.lang.String r3 = "SO_FAIL"
                r4 = 1
                r1.<init>(r3, r4)
                com.kwad.components.offline.api.adWaynePlayer.IAdWaynePlayerOfflineCompo.AdWaynePlayerState.SO_FAIL = r1
                r3 = 2
                com.kwad.components.offline.api.adWaynePlayer.IAdWaynePlayerOfflineCompo$AdWaynePlayerState[] r3 = new com.kwad.components.offline.api.adWaynePlayer.IAdWaynePlayerOfflineCompo.AdWaynePlayerState[r3]
                r3[r2] = r0
                r3[r4] = r1
                com.kwad.components.offline.api.adWaynePlayer.IAdWaynePlayerOfflineCompo.AdWaynePlayerState.$VALUES = r3
                return
        }

        AdWaynePlayerState(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.kwad.components.offline.api.adWaynePlayer.IAdWaynePlayerOfflineCompo.AdWaynePlayerState valueOf(java.lang.String r1) {
                java.lang.Class<com.kwad.components.offline.api.adWaynePlayer.IAdWaynePlayerOfflineCompo$AdWaynePlayerState> r0 = com.kwad.components.offline.api.adWaynePlayer.IAdWaynePlayerOfflineCompo.AdWaynePlayerState.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.kwad.components.offline.api.adWaynePlayer.IAdWaynePlayerOfflineCompo$AdWaynePlayerState r1 = (com.kwad.components.offline.api.adWaynePlayer.IAdWaynePlayerOfflineCompo.AdWaynePlayerState) r1
                return r1
        }

        public static com.kwad.components.offline.api.adWaynePlayer.IAdWaynePlayerOfflineCompo.AdWaynePlayerState[] values() {
                com.kwad.components.offline.api.adWaynePlayer.IAdWaynePlayerOfflineCompo$AdWaynePlayerState[] r0 = com.kwad.components.offline.api.adWaynePlayer.IAdWaynePlayerOfflineCompo.AdWaynePlayerState.$VALUES
                java.lang.Object r0 = r0.clone()
                com.kwad.components.offline.api.adWaynePlayer.IAdWaynePlayerOfflineCompo$AdWaynePlayerState[] r0 = (com.kwad.components.offline.api.adWaynePlayer.IAdWaynePlayerOfflineCompo.AdWaynePlayerState[]) r0
                return r0
        }
    }

    com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule getAdWaynePlayerPlayModule(java.lang.String r1, boolean r2);

    com.kwad.components.offline.api.adWaynePlayer.IAdWaynePlayerOfflineCompo.AdWaynePlayerState getState();
}
