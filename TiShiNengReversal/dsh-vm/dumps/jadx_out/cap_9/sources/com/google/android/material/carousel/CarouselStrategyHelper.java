package com.google.android.material.carousel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class CarouselStrategyHelper {
    private CarouselStrategyHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    static com.google.android.material.carousel.KeylineState createLeftAlignedKeylineState(@androidx.annotation.NonNull android.content.Context r11, float r12, float r13, @androidx.annotation.NonNull com.google.android.material.carousel.Arrangement r14) {
            float r11 = getExtraSmallSize(r11)
            float r11 = r11 + r12
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r11 / r0
            r2 = 0
            float r3 = r2 - r1
            float r4 = r14.largeSize
            float r4 = r4 / r0
            float r6 = r4 + r2
            int r2 = r14.largeCount
            int r2 = r2 + (-1)
            r4 = 0
            int r2 = java.lang.Math.max(r4, r2)
            float r2 = (float) r2
            float r4 = r14.largeSize
            float r2 = r2 * r4
            float r2 = r2 + r6
            float r5 = r4 / r0
            float r5 = r5 + r2
            int r7 = r14.mediumCount
            if (r7 <= 0) goto L2b
            float r2 = r14.mediumSize
            float r2 = r2 / r0
            float r2 = r2 + r5
        L2b:
            if (r7 <= 0) goto L31
            float r5 = r14.mediumSize
            float r5 = r5 / r0
            float r5 = r5 + r2
        L31:
            int r7 = r14.smallCount
            if (r7 <= 0) goto L3b
            float r7 = r14.smallSize
            float r7 = r7 / r0
            float r5 = r5 + r7
            r0 = r5
            goto L3c
        L3b:
            r0 = r2
        L3c:
            float r13 = r13 + r1
            float r1 = com.google.android.material.carousel.CarouselStrategy.getChildMaskPercentage(r11, r4, r12)
            float r4 = r14.smallSize
            float r5 = r14.largeSize
            float r4 = com.google.android.material.carousel.CarouselStrategy.getChildMaskPercentage(r4, r5, r12)
            float r5 = r14.mediumSize
            float r7 = r14.largeSize
            float r12 = com.google.android.material.carousel.CarouselStrategy.getChildMaskPercentage(r5, r7, r12)
            com.google.android.material.carousel.KeylineState$Builder r5 = new com.google.android.material.carousel.KeylineState$Builder
            float r7 = r14.largeSize
            r5.<init>(r7)
            com.google.android.material.carousel.KeylineState$Builder r5 = r5.addKeyline(r3, r1, r11)
            float r8 = r14.largeSize
            int r9 = r14.largeCount
            r10 = 1
            r7 = 0
            com.google.android.material.carousel.KeylineState$Builder r3 = r5.addKeylineRange(r6, r7, r8, r9, r10)
            int r5 = r14.mediumCount
            if (r5 <= 0) goto L6f
            float r5 = r14.mediumSize
            r3.addKeyline(r2, r12, r5)
        L6f:
            int r12 = r14.smallCount
            if (r12 <= 0) goto L78
            float r14 = r14.smallSize
            r3.addKeylineRange(r0, r4, r14, r12)
        L78:
            r3.addKeyline(r13, r1, r11)
            com.google.android.material.carousel.KeylineState r11 = r3.build()
            return r11
    }

    static float getExtraSmallSize(@androidx.annotation.NonNull android.content.Context r1) {
            android.content.res.Resources r1 = r1.getResources()
            int r0 = com.google.android.material.R.dimen.m3_carousel_gone_size
            float r1 = r1.getDimension(r0)
            return r1
    }

    static float getSmallSizeMax(@androidx.annotation.NonNull android.content.Context r1) {
            android.content.res.Resources r1 = r1.getResources()
            int r0 = com.google.android.material.R.dimen.m3_carousel_small_item_size_max
            float r1 = r1.getDimension(r0)
            return r1
    }

    static float getSmallSizeMin(@androidx.annotation.NonNull android.content.Context r1) {
            android.content.res.Resources r1 = r1.getResources()
            int r0 = com.google.android.material.R.dimen.m3_carousel_small_item_size_min
            float r1 = r1.getDimension(r0)
            return r1
    }

    static int maxValue(int[] r4) {
            int r0 = r4.length
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 0
        L4:
            if (r2 >= r0) goto Le
            r3 = r4[r2]
            if (r3 <= r1) goto Lb
            r1 = r3
        Lb:
            int r2 = r2 + 1
            goto L4
        Le:
            return r1
    }
}
