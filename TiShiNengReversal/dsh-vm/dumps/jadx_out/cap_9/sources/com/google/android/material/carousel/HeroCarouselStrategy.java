package com.google.android.material.carousel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class HeroCarouselStrategy extends com.google.android.material.carousel.CarouselStrategy {
    private static final int[] MEDIUM_COUNTS = null;
    private static final int[] SMALL_COUNTS = null;

    static {
            r0 = 1
            int[] r1 = new int[]{r0}
            com.google.android.material.carousel.HeroCarouselStrategy.SMALL_COUNTS = r1
            r1 = 0
            int[] r0 = new int[]{r1, r0}
            com.google.android.material.carousel.HeroCarouselStrategy.MEDIUM_COUNTS = r0
            return
    }

    public HeroCarouselStrategy() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    @androidx.annotation.NonNull
    com.google.android.material.carousel.KeylineState onFirstChildMeasuredWithMargins(@androidx.annotation.NonNull com.google.android.material.carousel.Carousel r15, @androidx.annotation.NonNull android.view.View r16) {
            r14 = this;
            int r0 = r15.getContainerHeight()
            boolean r1 = r15.isHorizontal()
            if (r1 == 0) goto Le
            int r0 = r15.getContainerWidth()
        Le:
            android.view.ViewGroup$LayoutParams r1 = r16.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$LayoutParams r1 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r1
            int r2 = r1.topMargin
            int r3 = r1.bottomMargin
            int r2 = r2 + r3
            float r2 = (float) r2
            int r3 = r16.getMeasuredWidth()
            int r3 = r3 * 2
            float r3 = (float) r3
            boolean r15 = r15.isHorizontal()
            if (r15 == 0) goto L34
            int r15 = r1.leftMargin
            int r1 = r1.rightMargin
            int r15 = r15 + r1
            float r2 = (float) r15
            int r15 = r16.getMeasuredHeight()
            int r15 = r15 * 2
            float r3 = (float) r15
        L34:
            android.content.Context r15 = r16.getContext()
            float r15 = com.google.android.material.carousel.CarouselStrategyHelper.getSmallSizeMin(r15)
            float r6 = r15 + r2
            android.content.Context r15 = r16.getContext()
            float r15 = com.google.android.material.carousel.CarouselStrategyHelper.getSmallSizeMax(r15)
            float r7 = r15 + r2
            float r15 = r3 + r2
            float r4 = (float) r0
            float r11 = java.lang.Math.min(r15, r4)
            r15 = 1077936128(0x40400000, float:3.0)
            float r3 = r3 / r15
            float r3 = r3 + r2
            android.content.Context r15 = r16.getContext()
            float r15 = com.google.android.material.carousel.CarouselStrategyHelper.getSmallSizeMin(r15)
            float r15 = r15 + r2
            android.content.Context r0 = r16.getContext()
            float r0 = com.google.android.material.carousel.CarouselStrategyHelper.getSmallSizeMax(r0)
            float r0 = r0 + r2
            float r5 = androidx.core.math.MathUtils.clamp(r3, r15, r0)
            float r15 = r11 + r5
            r0 = 1073741824(0x40000000, float:2.0)
            float r9 = r15 / r0
            int[] r15 = com.google.android.material.carousel.HeroCarouselStrategy.SMALL_COUNTS
            int r15 = com.google.android.material.carousel.CarouselStrategyHelper.maxValue(r15)
            float r15 = (float) r15
            float r15 = r15 * r7
            float r15 = r4 - r15
            float r15 = r15 / r11
            double r0 = (double) r15
            double r0 = java.lang.Math.floor(r0)
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = java.lang.Math.max(r12, r0)
            int r15 = (int) r0
            float r0 = r4 / r11
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            int r0 = (int) r0
            int r0 = r0 - r15
            int r0 = r0 + 1
            int[] r12 = new int[r0]
            r1 = 0
        L95:
            if (r1 >= r0) goto L9e
            int r3 = r15 + r1
            r12[r1] = r3
            int r1 = r1 + 1
            goto L95
        L9e:
            int[] r8 = com.google.android.material.carousel.HeroCarouselStrategy.SMALL_COUNTS
            int[] r10 = com.google.android.material.carousel.HeroCarouselStrategy.MEDIUM_COUNTS
            com.google.android.material.carousel.Arrangement r15 = com.google.android.material.carousel.Arrangement.findLowestCostArrangement(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            android.content.Context r0 = r16.getContext()
            com.google.android.material.carousel.KeylineState r15 = com.google.android.material.carousel.CarouselStrategyHelper.createLeftAlignedKeylineState(r0, r2, r4, r15)
            return r15
    }
}
