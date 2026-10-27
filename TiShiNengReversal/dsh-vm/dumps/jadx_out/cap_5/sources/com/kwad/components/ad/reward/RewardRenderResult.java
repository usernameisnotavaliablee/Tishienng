package com.kwad.components.ad.reward;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public enum RewardRenderResult extends java.lang.Enum<com.kwad.components.ad.reward.RewardRenderResult> {
    private static final /* synthetic */ com.kwad.components.ad.reward.RewardRenderResult[] $VALUES = null;
    public static final com.kwad.components.ad.reward.RewardRenderResult DEFAULT = null;
    public static final com.kwad.components.ad.reward.RewardRenderResult FULLSCREEN_TK = null;
    public static final com.kwad.components.ad.reward.RewardRenderResult LIVE_TK = null;
    public static final com.kwad.components.ad.reward.RewardRenderResult NEO_TK = null;
    public static final com.kwad.components.ad.reward.RewardRenderResult TK_IMAGE = null;

    static {
            com.kwad.components.ad.reward.RewardRenderResult r0 = new com.kwad.components.ad.reward.RewardRenderResult
            java.lang.String r1 = "DEFAULT"
            r2 = 0
            r0.<init>(r1, r2)
            com.kwad.components.ad.reward.RewardRenderResult.DEFAULT = r0
            com.kwad.components.ad.reward.RewardRenderResult r1 = new com.kwad.components.ad.reward.RewardRenderResult
            java.lang.String r3 = "NEO_TK"
            r4 = 1
            r1.<init>(r3, r4)
            com.kwad.components.ad.reward.RewardRenderResult.NEO_TK = r1
            com.kwad.components.ad.reward.RewardRenderResult r3 = new com.kwad.components.ad.reward.RewardRenderResult
            java.lang.String r5 = "LIVE_TK"
            r6 = 2
            r3.<init>(r5, r6)
            com.kwad.components.ad.reward.RewardRenderResult.LIVE_TK = r3
            com.kwad.components.ad.reward.RewardRenderResult r5 = new com.kwad.components.ad.reward.RewardRenderResult
            java.lang.String r7 = "FULLSCREEN_TK"
            r8 = 3
            r5.<init>(r7, r8)
            com.kwad.components.ad.reward.RewardRenderResult.FULLSCREEN_TK = r5
            com.kwad.components.ad.reward.RewardRenderResult r7 = new com.kwad.components.ad.reward.RewardRenderResult
            java.lang.String r9 = "TK_IMAGE"
            r10 = 4
            r7.<init>(r9, r10)
            com.kwad.components.ad.reward.RewardRenderResult.TK_IMAGE = r7
            r9 = 5
            com.kwad.components.ad.reward.RewardRenderResult[] r9 = new com.kwad.components.ad.reward.RewardRenderResult[r9]
            r9[r2] = r0
            r9[r4] = r1
            r9[r6] = r3
            r9[r8] = r5
            r9[r10] = r7
            com.kwad.components.ad.reward.RewardRenderResult.$VALUES = r9
            return
    }

    RewardRenderResult(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.kwad.components.ad.reward.RewardRenderResult valueOf(java.lang.String r1) {
            java.lang.Class<com.kwad.components.ad.reward.RewardRenderResult> r0 = com.kwad.components.ad.reward.RewardRenderResult.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.kwad.components.ad.reward.RewardRenderResult r1 = (com.kwad.components.ad.reward.RewardRenderResult) r1
            return r1
    }

    public static com.kwad.components.ad.reward.RewardRenderResult[] values() {
            com.kwad.components.ad.reward.RewardRenderResult[] r0 = com.kwad.components.ad.reward.RewardRenderResult.$VALUES
            java.lang.Object r0 = r0.clone()
            com.kwad.components.ad.reward.RewardRenderResult[] r0 = (com.kwad.components.ad.reward.RewardRenderResult[]) r0
            return r0
    }
}
