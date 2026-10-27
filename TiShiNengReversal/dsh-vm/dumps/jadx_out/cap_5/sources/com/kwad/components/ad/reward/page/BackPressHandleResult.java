package com.kwad.components.ad.reward.page;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public enum BackPressHandleResult extends java.lang.Enum<com.kwad.components.ad.reward.page.BackPressHandleResult> {
    private static final /* synthetic */ com.kwad.components.ad.reward.page.BackPressHandleResult[] $VALUES = null;
    public static final com.kwad.components.ad.reward.page.BackPressHandleResult HANDLED = null;
    public static final com.kwad.components.ad.reward.page.BackPressHandleResult HANDLED_CLOSE = null;
    public static final com.kwad.components.ad.reward.page.BackPressHandleResult NOT_HANDLED = null;
    private int value;

    static {
            com.kwad.components.ad.reward.page.BackPressHandleResult r0 = new com.kwad.components.ad.reward.page.BackPressHandleResult
            java.lang.String r1 = "NOT_HANDLED"
            r2 = 0
            r3 = 1
            r0.<init>(r1, r2, r3)
            com.kwad.components.ad.reward.page.BackPressHandleResult.NOT_HANDLED = r0
            com.kwad.components.ad.reward.page.BackPressHandleResult r1 = new com.kwad.components.ad.reward.page.BackPressHandleResult
            java.lang.String r4 = "HANDLED"
            r5 = 2
            r1.<init>(r4, r3, r5)
            com.kwad.components.ad.reward.page.BackPressHandleResult.HANDLED = r1
            com.kwad.components.ad.reward.page.BackPressHandleResult r4 = new com.kwad.components.ad.reward.page.BackPressHandleResult
            java.lang.String r6 = "HANDLED_CLOSE"
            r7 = 3
            r4.<init>(r6, r5, r7)
            com.kwad.components.ad.reward.page.BackPressHandleResult.HANDLED_CLOSE = r4
            com.kwad.components.ad.reward.page.BackPressHandleResult[] r6 = new com.kwad.components.ad.reward.page.BackPressHandleResult[r7]
            r6[r2] = r0
            r6[r3] = r1
            r6[r5] = r4
            com.kwad.components.ad.reward.page.BackPressHandleResult.$VALUES = r6
            return
    }

    BackPressHandleResult(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.value = r3
            return
    }

    public static com.kwad.components.ad.reward.page.BackPressHandleResult valueOf(java.lang.String r1) {
            java.lang.Class<com.kwad.components.ad.reward.page.BackPressHandleResult> r0 = com.kwad.components.ad.reward.page.BackPressHandleResult.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.kwad.components.ad.reward.page.BackPressHandleResult r1 = (com.kwad.components.ad.reward.page.BackPressHandleResult) r1
            return r1
    }

    public static com.kwad.components.ad.reward.page.BackPressHandleResult[] values() {
            com.kwad.components.ad.reward.page.BackPressHandleResult[] r0 = com.kwad.components.ad.reward.page.BackPressHandleResult.$VALUES
            java.lang.Object r0 = r0.clone()
            com.kwad.components.ad.reward.page.BackPressHandleResult[] r0 = (com.kwad.components.ad.reward.page.BackPressHandleResult[]) r0
            return r0
    }
}
