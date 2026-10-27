package com.kwad.components.ad.reward.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public enum EcOrderCardStyle extends java.lang.Enum<com.kwad.components.ad.reward.model.EcOrderCardStyle> {
    private static final /* synthetic */ com.kwad.components.ad.reward.model.EcOrderCardStyle[] $VALUES = null;
    public static final com.kwad.components.ad.reward.model.EcOrderCardStyle COUPON = null;
    public static final com.kwad.components.ad.reward.model.EcOrderCardStyle DEFAULT = null;
    public static final com.kwad.components.ad.reward.model.EcOrderCardStyle NO_SPIKE_AND_NO_COUPON = null;
    public static final com.kwad.components.ad.reward.model.EcOrderCardStyle SPIKE = null;
    public static final com.kwad.components.ad.reward.model.EcOrderCardStyle SPIKE_AND_COUPON = null;
    private int value;

    static {
            com.kwad.components.ad.reward.model.EcOrderCardStyle r0 = new com.kwad.components.ad.reward.model.EcOrderCardStyle
            java.lang.String r1 = "SPIKE_AND_COUPON"
            r2 = 0
            r3 = 1
            r0.<init>(r1, r2, r3)
            com.kwad.components.ad.reward.model.EcOrderCardStyle.SPIKE_AND_COUPON = r0
            com.kwad.components.ad.reward.model.EcOrderCardStyle r1 = new com.kwad.components.ad.reward.model.EcOrderCardStyle
            java.lang.String r4 = "SPIKE"
            r5 = 2
            r1.<init>(r4, r3, r5)
            com.kwad.components.ad.reward.model.EcOrderCardStyle.SPIKE = r1
            com.kwad.components.ad.reward.model.EcOrderCardStyle r4 = new com.kwad.components.ad.reward.model.EcOrderCardStyle
            java.lang.String r6 = "COUPON"
            r7 = 3
            r4.<init>(r6, r5, r7)
            com.kwad.components.ad.reward.model.EcOrderCardStyle.COUPON = r4
            com.kwad.components.ad.reward.model.EcOrderCardStyle r6 = new com.kwad.components.ad.reward.model.EcOrderCardStyle
            java.lang.String r8 = "NO_SPIKE_AND_NO_COUPON"
            r9 = 4
            r6.<init>(r8, r7, r9)
            com.kwad.components.ad.reward.model.EcOrderCardStyle.NO_SPIKE_AND_NO_COUPON = r6
            com.kwad.components.ad.reward.model.EcOrderCardStyle r8 = new com.kwad.components.ad.reward.model.EcOrderCardStyle
            java.lang.String r10 = "DEFAULT"
            r11 = 5
            r8.<init>(r10, r9, r11)
            com.kwad.components.ad.reward.model.EcOrderCardStyle.DEFAULT = r8
            com.kwad.components.ad.reward.model.EcOrderCardStyle[] r10 = new com.kwad.components.ad.reward.model.EcOrderCardStyle[r11]
            r10[r2] = r0
            r10[r3] = r1
            r10[r5] = r4
            r10[r7] = r6
            r10[r9] = r8
            com.kwad.components.ad.reward.model.EcOrderCardStyle.$VALUES = r10
            return
    }

    EcOrderCardStyle(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.value = r3
            return
    }

    @androidx.annotation.Nullable
    public static com.kwad.components.ad.reward.model.EcOrderCardStyle createFromAdInfo(com.kwad.sdk.core.response.model.AdInfo r2) {
            boolean r0 = com.kwad.components.ad.reward.a.b.k(r2)
            if (r0 != 0) goto Lf
            boolean r0 = com.kwad.components.ad.reward.a.b.j(r2)
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r2 = 0
            return r2
        Lf:
            com.kwad.sdk.core.response.model.AdProductInfo r2 = com.kwad.sdk.core.response.b.a.cV(r2)
            boolean r0 = r2.hasSpike()
            boolean r1 = r2.hasCoupon()
            boolean r2 = r2.hasOriginalPrice()
            if (r0 == 0) goto L26
            if (r1 == 0) goto L26
            com.kwad.components.ad.reward.model.EcOrderCardStyle r2 = com.kwad.components.ad.reward.model.EcOrderCardStyle.SPIKE_AND_COUPON
            return r2
        L26:
            if (r0 == 0) goto L2b
            com.kwad.components.ad.reward.model.EcOrderCardStyle r2 = com.kwad.components.ad.reward.model.EcOrderCardStyle.SPIKE
            return r2
        L2b:
            if (r1 == 0) goto L30
            com.kwad.components.ad.reward.model.EcOrderCardStyle r2 = com.kwad.components.ad.reward.model.EcOrderCardStyle.COUPON
            return r2
        L30:
            if (r2 == 0) goto L35
            com.kwad.components.ad.reward.model.EcOrderCardStyle r2 = com.kwad.components.ad.reward.model.EcOrderCardStyle.NO_SPIKE_AND_NO_COUPON
            return r2
        L35:
            com.kwad.components.ad.reward.model.EcOrderCardStyle r2 = com.kwad.components.ad.reward.model.EcOrderCardStyle.DEFAULT
            return r2
    }

    public static com.kwad.components.ad.reward.model.EcOrderCardStyle valueOf(java.lang.String r1) {
            java.lang.Class<com.kwad.components.ad.reward.model.EcOrderCardStyle> r0 = com.kwad.components.ad.reward.model.EcOrderCardStyle.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.kwad.components.ad.reward.model.EcOrderCardStyle r1 = (com.kwad.components.ad.reward.model.EcOrderCardStyle) r1
            return r1
    }

    public static com.kwad.components.ad.reward.model.EcOrderCardStyle[] values() {
            com.kwad.components.ad.reward.model.EcOrderCardStyle[] r0 = com.kwad.components.ad.reward.model.EcOrderCardStyle.$VALUES
            java.lang.Object r0 = r0.clone()
            com.kwad.components.ad.reward.model.EcOrderCardStyle[] r0 = (com.kwad.components.ad.reward.model.EcOrderCardStyle[]) r0
            return r0
    }

    public final int getValue() {
            r1 = this;
            int r0 = r1.value
            return r0
    }
}
