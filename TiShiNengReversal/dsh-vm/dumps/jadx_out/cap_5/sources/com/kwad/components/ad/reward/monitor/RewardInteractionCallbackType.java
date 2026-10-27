package com.kwad.components.ad.reward.monitor;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public enum RewardInteractionCallbackType extends java.lang.Enum<com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType> implements com.kwad.components.ad.reward.monitor.a {
    private static final /* synthetic */ com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType[] $VALUES = null;
    public static final com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType AD_CLICK = null;
    public static final com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType EXTRA_REWARD_VERIFY = null;
    public static final com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType PAGE_DISMISS = null;
    public static final com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType REWARD_STEP_VERIFY = null;
    public static final com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType REWARD_VERIFY = null;
    public static final com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType VIDEO_PLAY_END = null;
    public static final com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType VIDEO_PLAY_ERROR = null;
    public static final com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType VIDEO_PLAY_START = null;
    public static final com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType VIDEO_SKIP_TO_END = null;
    private java.lang.String typeValue;

    static {
            com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType r0 = new com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType
            java.lang.String r1 = "ad_click"
            java.lang.String r2 = "AD_CLICK"
            r3 = 0
            r0.<init>(r2, r3, r1)
            com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType.AD_CLICK = r0
            com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType r1 = new com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType
            java.lang.String r2 = "page_close"
            java.lang.String r4 = "PAGE_DISMISS"
            r5 = 1
            r1.<init>(r4, r5, r2)
            com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType.PAGE_DISMISS = r1
            com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType r2 = new com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType
            java.lang.String r4 = "play_error"
            java.lang.String r6 = "VIDEO_PLAY_ERROR"
            r7 = 2
            r2.<init>(r6, r7, r4)
            com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType.VIDEO_PLAY_ERROR = r2
            com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType r4 = new com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType
            java.lang.String r6 = "play_end"
            java.lang.String r8 = "VIDEO_PLAY_END"
            r9 = 3
            r4.<init>(r8, r9, r6)
            com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType.VIDEO_PLAY_END = r4
            com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType r6 = new com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType
            java.lang.String r8 = "skip_to_end"
            java.lang.String r10 = "VIDEO_SKIP_TO_END"
            r11 = 4
            r6.<init>(r10, r11, r8)
            com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType.VIDEO_SKIP_TO_END = r6
            com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType r8 = new com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType
            java.lang.String r10 = "play_start"
            java.lang.String r12 = "VIDEO_PLAY_START"
            r13 = 5
            r8.<init>(r12, r13, r10)
            com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType.VIDEO_PLAY_START = r8
            com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType r10 = new com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType
            java.lang.String r12 = "reward_verify"
            java.lang.String r14 = "REWARD_VERIFY"
            r15 = 6
            r10.<init>(r14, r15, r12)
            com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType.REWARD_VERIFY = r10
            com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType r12 = new com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType
            java.lang.String r14 = "reward_step_verify"
            r16 = 0
            java.lang.String r3 = "REWARD_STEP_VERIFY"
            r17 = 1
            r5 = 7
            r12.<init>(r3, r5, r14)
            com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType.REWARD_STEP_VERIFY = r12
            com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType r3 = new com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType
            java.lang.String r14 = "extra_reward_verify"
            r18 = 7
            java.lang.String r5 = "EXTRA_REWARD_VERIFY"
            r19 = 2
            r7 = 8
            r3.<init>(r5, r7, r14)
            com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType.EXTRA_REWARD_VERIFY = r3
            r5 = 9
            com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType[] r5 = new com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType[r5]
            r5[r16] = r0
            r5[r17] = r1
            r5[r19] = r2
            r5[r9] = r4
            r5[r11] = r6
            r5[r13] = r8
            r5[r15] = r10
            r5[r18] = r12
            r5[r7] = r3
            com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType.$VALUES = r5
            return
    }

    RewardInteractionCallbackType(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.typeValue = r3
            return
    }

    public static com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType valueOf(java.lang.String r1) {
            java.lang.Class<com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType> r0 = com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType r1 = (com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType) r1
            return r1
    }

    public static com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType[] values() {
            com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType[] r0 = com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType.$VALUES
            java.lang.Object r0 = r0.clone()
            com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType[] r0 = (com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType[]) r0
            return r0
    }

    @Override // com.kwad.components.ad.reward.monitor.a
    public final java.lang.String getTypeValue() {
            r1 = this;
            java.lang.String r0 = r1.typeValue
            return r0
    }
}
