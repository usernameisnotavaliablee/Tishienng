package com.google.android.material.carousel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class MultiBrowseCarouselStrategy extends com.google.android.material.carousel.CarouselStrategy {
    private static final int[] MEDIUM_COUNTS = null;
    private static final int[] MEDIUM_COUNTS_COMPACT = null;
    private static final int[] SMALL_COUNTS = null;
    private final boolean forceCompactArrangement;

    static {
            r0 = 1
            int[] r1 = new int[]{r0}
            com.google.android.material.carousel.MultiBrowseCarouselStrategy.SMALL_COUNTS = r1
            r1 = 0
            int[] r0 = new int[]{r0, r1}
            com.google.android.material.carousel.MultiBrowseCarouselStrategy.MEDIUM_COUNTS = r0
            int[] r0 = new int[]{r1}
            com.google.android.material.carousel.MultiBrowseCarouselStrategy.MEDIUM_COUNTS_COMPACT = r0
            return
    }

    public MultiBrowseCarouselStrategy() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public MultiBrowseCarouselStrategy(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.forceCompactArrangement = r1
            return
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    @androidx.annotation.NonNull
    com.google.android.material.carousel.KeylineState onFirstChildMeasuredWithMargins(@androidx.annotation.NonNull com.google.android.material.carousel.Carousel r14, @androidx.annotation.NonNull android.view.View r15) {
            r13 = this;
            int r0 = r14.getContainerHeight()
            float r0 = (float) r0
            boolean r1 = r14.isHorizontal()
            if (r1 == 0) goto L10
            int r0 = r14.getContainerWidth()
            float r0 = (float) r0
        L10:
            r1 = r0
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$LayoutParams r0 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r0
            int r2 = r0.topMargin
            int r3 = r0.bottomMargin
            int r2 = r2 + r3
            float r2 = (float) r2
            int r3 = r15.getMeasuredHeight()
            float r3 = (float) r3
            boolean r14 = r14.isHorizontal()
            if (r14 == 0) goto L33
            int r14 = r0.leftMargin
            int r0 = r0.rightMargin
            int r14 = r14 + r0
            float r2 = (float) r14
            int r14 = r15.getMeasuredWidth()
            float r3 = (float) r14
        L33:
            r14 = r2
            android.content.Context r0 = r15.getContext()
            float r0 = com.google.android.material.carousel.CarouselStrategyHelper.getSmallSizeMin(r0)
            float r0 = r0 + r14
            android.content.Context r2 = r15.getContext()
            float r2 = com.google.android.material.carousel.CarouselStrategyHelper.getSmallSizeMax(r2)
            float r4 = r2 + r14
            float r2 = r3 + r14
            float r8 = java.lang.Math.min(r2, r1)
            r2 = 1077936128(0x40400000, float:3.0)
            float r3 = r3 / r2
            float r3 = r3 + r14
            android.content.Context r2 = r15.getContext()
            float r2 = com.google.android.material.carousel.CarouselStrategyHelper.getSmallSizeMin(r2)
            float r2 = r2 + r14
            android.content.Context r5 = r15.getContext()
            float r5 = com.google.android.material.carousel.CarouselStrategyHelper.getSmallSizeMax(r5)
            float r5 = r5 + r14
            float r2 = androidx.core.math.MathUtils.clamp(r3, r2, r5)
            float r3 = r8 + r2
            r5 = 1073741824(0x40000000, float:2.0)
            float r6 = r3 / r5
            int[] r5 = com.google.android.material.carousel.MultiBrowseCarouselStrategy.SMALL_COUNTS
            boolean r3 = r13.forceCompactArrangement
            if (r3 == 0) goto L77
            int[] r3 = com.google.android.material.carousel.MultiBrowseCarouselStrategy.MEDIUM_COUNTS_COMPACT
        L75:
            r7 = r3
            goto L7a
        L77:
            int[] r3 = com.google.android.material.carousel.MultiBrowseCarouselStrategy.MEDIUM_COUNTS
            goto L75
        L7a:
            int r3 = com.google.android.material.carousel.CarouselStrategyHelper.maxValue(r7)
            float r3 = (float) r3
            float r3 = r3 * r6
            float r3 = r1 - r3
            int r9 = com.google.android.material.carousel.CarouselStrategyHelper.maxValue(r5)
            float r9 = (float) r9
            float r9 = r9 * r4
            float r3 = r3 - r9
            float r3 = r3 / r8
            double r9 = (double) r3
            double r9 = java.lang.Math.floor(r9)
            r11 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r9 = java.lang.Math.max(r11, r9)
            int r3 = (int) r9
            float r9 = r1 / r8
            double r9 = (double) r9
            double r9 = java.lang.Math.ceil(r9)
            int r10 = (int) r9
            int r3 = r10 - r3
            int r11 = r3 + 1
            int[] r9 = new int[r11]
            r3 = 0
        La7:
            if (r3 >= r11) goto Lb0
            int r12 = r10 - r3
            r9[r3] = r12
            int r3 = r3 + 1
            goto La7
        Lb0:
            r3 = r0
            com.google.android.material.carousel.Arrangement r0 = com.google.android.material.carousel.Arrangement.findLowestCostArrangement(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            android.content.Context r15 = r15.getContext()
            com.google.android.material.carousel.KeylineState r14 = com.google.android.material.carousel.CarouselStrategyHelper.createLeftAlignedKeylineState(r15, r14, r1, r0)
            return r14
    }
}
