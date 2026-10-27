package com.kwad.components.ad.interstitial.aggregate;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class TransViewPager extends com.kwad.sdk.widget.f {
    private float lu;

    @com.kwad.components.ad.interstitial.aggregate.TransViewPager.SlideType
    private int lv;
    private java.util.Map<java.lang.Integer, com.kwad.components.ad.interstitial.h.c> map;

    public TransViewPager(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public TransViewPager(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.map = r1
            r1 = 0
            r0.lv = r1
            return
    }

    private void a(android.view.View r10, android.view.View r11, float r12) {
            r9 = this;
            int r0 = r9.lv
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L1a
            int r0 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r0 == 0) goto L1a
            float r0 = r9.lu
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 == 0) goto L1a
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r0 <= 0) goto L18
            r9.lv = r2
            goto L1a
        L18:
            r9.lv = r1
        L1a:
            int r0 = r9.lv
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            if (r0 != r2) goto L3c
            if (r11 == 0) goto L3c
            double r7 = (double) r12
            r0 = 1131413504(0x43700000, float:240.0)
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 > 0) goto L35
            int r2 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r2 <= 0) goto L35
            float r0 = r0 * r12
            r11.setTranslationX(r0)
            goto L3c
        L35:
            float r2 = r4 - r12
            float r2 = r2 * r0
            r11.setTranslationX(r2)
        L3c:
            int r11 = r9.lv
            if (r11 != r1) goto L59
            if (r10 == 0) goto L59
            double r0 = (double) r12
            r11 = -1016070144(0xffffffffc3700000, float:-240.0)
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 > 0) goto L53
            int r0 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r0 < 0) goto L53
            float r11 = r11 * r12
            r10.setTranslationX(r11)
            goto L59
        L53:
            float r4 = r4 - r12
            float r4 = r4 * r11
            r10.setTranslationX(r4)
        L59:
            r9.lu = r12
            int r10 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r10 != 0) goto L62
            r10 = 0
            r9.lv = r10
        L62:
            return
    }

    public final com.kwad.components.ad.interstitial.h.c J(int r2) {
            r1 = this;
            java.util.Map<java.lang.Integer, com.kwad.components.ad.interstitial.h.c> r0 = r1.map
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            com.kwad.components.ad.interstitial.h.c r2 = (com.kwad.components.ad.interstitial.h.c) r2
            return r2
    }

    public final void a(int r2, com.kwad.components.ad.interstitial.h.c r3) {
            r1 = this;
            java.util.Map<java.lang.Integer, com.kwad.components.ad.interstitial.h.c> r0 = r1.map
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r2, r3)
            return
    }

    protected void onPageScrolled(int r3, float r4, int r5) {
            r2 = this;
            com.kwad.components.ad.interstitial.h.c r0 = r2.J(r3)
            int r1 = r3 + 1
            com.kwad.components.ad.interstitial.h.c r1 = r2.J(r1)
            r2.a(r0, r1, r4)
            super.onPageScrolled(r3, r4, r5)
            return
    }
}
