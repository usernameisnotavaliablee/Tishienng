package com.kwad.components.ad.reward.monitor;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public enum RewardLoadCallbackType extends java.lang.Enum<com.kwad.components.ad.reward.monitor.RewardLoadCallbackType> implements com.kwad.components.ad.reward.monitor.a {
    private static final /* synthetic */ com.kwad.components.ad.reward.monitor.RewardLoadCallbackType[] $VALUES = null;
    public static final com.kwad.components.ad.reward.monitor.RewardLoadCallbackType LOAD_CACHE_SUCCESS = null;
    public static final com.kwad.components.ad.reward.monitor.RewardLoadCallbackType LOAD_CACHE_SUCCESS_BEFORE = null;
    public static final com.kwad.components.ad.reward.monitor.RewardLoadCallbackType LOAD_ERROR = null;
    public static final com.kwad.components.ad.reward.monitor.RewardLoadCallbackType LOAD_SUCCESS = null;
    public static final com.kwad.components.ad.reward.monitor.RewardLoadCallbackType LOAD_SUCCESS_BEFORE = null;
    private java.lang.String typeValue;

    static {
            com.kwad.components.ad.reward.monitor.RewardLoadCallbackType r0 = new com.kwad.components.ad.reward.monitor.RewardLoadCallbackType
            java.lang.String r1 = "load_success_before"
            java.lang.String r2 = "LOAD_SUCCESS_BEFORE"
            r3 = 0
            r0.<init>(r2, r3, r1)
            com.kwad.components.ad.reward.monitor.RewardLoadCallbackType.LOAD_SUCCESS_BEFORE = r0
            com.kwad.components.ad.reward.monitor.RewardLoadCallbackType r1 = new com.kwad.components.ad.reward.monitor.RewardLoadCallbackType
            java.lang.String r2 = "load_success"
            java.lang.String r4 = "LOAD_SUCCESS"
            r5 = 1
            r1.<init>(r4, r5, r2)
            com.kwad.components.ad.reward.monitor.RewardLoadCallbackType.LOAD_SUCCESS = r1
            com.kwad.components.ad.reward.monitor.RewardLoadCallbackType r2 = new com.kwad.components.ad.reward.monitor.RewardLoadCallbackType
            java.lang.String r4 = "load_error"
            java.lang.String r6 = "LOAD_ERROR"
            r7 = 2
            r2.<init>(r6, r7, r4)
            com.kwad.components.ad.reward.monitor.RewardLoadCallbackType.LOAD_ERROR = r2
            com.kwad.components.ad.reward.monitor.RewardLoadCallbackType r4 = new com.kwad.components.ad.reward.monitor.RewardLoadCallbackType
            java.lang.String r6 = "load_cache_success_before"
            java.lang.String r8 = "LOAD_CACHE_SUCCESS_BEFORE"
            r9 = 3
            r4.<init>(r8, r9, r6)
            com.kwad.components.ad.reward.monitor.RewardLoadCallbackType.LOAD_CACHE_SUCCESS_BEFORE = r4
            com.kwad.components.ad.reward.monitor.RewardLoadCallbackType r6 = new com.kwad.components.ad.reward.monitor.RewardLoadCallbackType
            java.lang.String r8 = "load_cache_success"
            java.lang.String r10 = "LOAD_CACHE_SUCCESS"
            r11 = 4
            r6.<init>(r10, r11, r8)
            com.kwad.components.ad.reward.monitor.RewardLoadCallbackType.LOAD_CACHE_SUCCESS = r6
            r8 = 5
            com.kwad.components.ad.reward.monitor.RewardLoadCallbackType[] r8 = new com.kwad.components.ad.reward.monitor.RewardLoadCallbackType[r8]
            r8[r3] = r0
            r8[r5] = r1
            r8[r7] = r2
            r8[r9] = r4
            r8[r11] = r6
            com.kwad.components.ad.reward.monitor.RewardLoadCallbackType.$VALUES = r8
            return
    }

    RewardLoadCallbackType(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.typeValue = r3
            return
    }

    public static com.kwad.components.ad.reward.monitor.RewardLoadCallbackType valueOf(java.lang.String r1) {
            java.lang.Class<com.kwad.components.ad.reward.monitor.RewardLoadCallbackType> r0 = com.kwad.components.ad.reward.monitor.RewardLoadCallbackType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.kwad.components.ad.reward.monitor.RewardLoadCallbackType r1 = (com.kwad.components.ad.reward.monitor.RewardLoadCallbackType) r1
            return r1
    }

    public static com.kwad.components.ad.reward.monitor.RewardLoadCallbackType[] values() {
            com.kwad.components.ad.reward.monitor.RewardLoadCallbackType[] r0 = com.kwad.components.ad.reward.monitor.RewardLoadCallbackType.$VALUES
            java.lang.Object r0 = r0.clone()
            com.kwad.components.ad.reward.monitor.RewardLoadCallbackType[] r0 = (com.kwad.components.ad.reward.monitor.RewardLoadCallbackType[]) r0
            return r0
    }

    @Override // com.kwad.components.ad.reward.monitor.a
    public final java.lang.String getTypeValue() {
            r1 = this;
            java.lang.String r0 = r1.typeValue
            return r0
    }
}
