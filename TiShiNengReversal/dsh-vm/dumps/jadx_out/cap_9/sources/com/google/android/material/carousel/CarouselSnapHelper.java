package com.google.android.material.carousel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class CarouselSnapHelper extends androidx.recyclerview.widget.SnapHelper {
    private final boolean disableFling;
    private androidx.recyclerview.widget.RecyclerView recyclerView;


    public CarouselSnapHelper() {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            return
    }

    public CarouselSnapHelper(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.disableFling = r1
            return
    }

    static /* synthetic */ androidx.recyclerview.widget.RecyclerView access$000(com.google.android.material.carousel.CarouselSnapHelper r0) {
            androidx.recyclerview.widget.RecyclerView r0 = r0.recyclerView
            return r0
    }

    static /* synthetic */ int[] access$100(com.google.android.material.carousel.CarouselSnapHelper r0, androidx.recyclerview.widget.RecyclerView.LayoutManager r1, android.view.View r2, boolean r3) {
            int[] r0 = r0.calculateDistanceToSnap(r1, r2, r3)
            return r0
    }

    private int[] calculateDistanceToSnap(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.LayoutManager r3, @androidx.annotation.NonNull android.view.View r4, boolean r5) {
            r2 = this;
            boolean r0 = r3 instanceof com.google.android.material.carousel.CarouselLayoutManager
            r1 = 0
            if (r0 != 0) goto La
            int[] r3 = new int[]{r1, r1}
            return r3
        La:
            r0 = r3
            com.google.android.material.carousel.CarouselLayoutManager r0 = (com.google.android.material.carousel.CarouselLayoutManager) r0
            int r4 = r2.distanceToFirstFocalKeyline(r4, r0, r5)
            boolean r5 = r3.canScrollHorizontally()
            if (r5 == 0) goto L1c
            int[] r3 = new int[]{r4, r1}
            return r3
        L1c:
            boolean r3 = r3.canScrollVertically()
            if (r3 == 0) goto L27
            int[] r3 = new int[]{r1, r4}
            return r3
        L27:
            int[] r3 = new int[]{r1, r1}
            return r3
    }

    private int distanceToFirstFocalKeyline(@androidx.annotation.NonNull android.view.View r1, com.google.android.material.carousel.CarouselLayoutManager r2, boolean r3) {
            r0 = this;
            int r1 = r2.getPosition(r1)
            int r1 = r2.getOffsetToScrollToPositionForSnap(r1, r3)
            return r1
    }

    @androidx.annotation.Nullable
    private android.view.View findViewNearestFirstKeyline(androidx.recyclerview.widget.RecyclerView.LayoutManager r9) {
            r8 = this;
            int r0 = r9.getChildCount()
            r1 = 0
            if (r0 == 0) goto L2d
            boolean r2 = r9 instanceof com.google.android.material.carousel.CarouselLayoutManager
            if (r2 != 0) goto Lc
            goto L2d
        Lc:
            r2 = r9
            com.google.android.material.carousel.CarouselLayoutManager r2 = (com.google.android.material.carousel.CarouselLayoutManager) r2
            r3 = 0
            r4 = 2147483647(0x7fffffff, float:NaN)
            r5 = 0
        L14:
            if (r5 >= r0) goto L2d
            android.view.View r6 = r9.getChildAt(r5)
            int r7 = r9.getPosition(r6)
            int r7 = r2.getOffsetToScrollToPositionForSnap(r7, r3)
            int r7 = java.lang.Math.abs(r7)
            if (r7 >= r4) goto L2a
            r1 = r6
            r4 = r7
        L2a:
            int r5 = r5 + 1
            goto L14
        L2d:
            return r1
    }

    private boolean isForwardFling(androidx.recyclerview.widget.RecyclerView.LayoutManager r3, int r4, int r5) {
            r2 = this;
            boolean r3 = r3.canScrollHorizontally()
            r0 = 0
            r1 = 1
            if (r3 == 0) goto Lc
            if (r4 <= 0) goto Lb
            return r1
        Lb:
            return r0
        Lc:
            if (r5 <= 0) goto Lf
            return r1
        Lf:
            return r0
    }

    private boolean isReverseLayout(androidx.recyclerview.widget.RecyclerView.LayoutManager r5) {
            r4 = this;
            int r0 = r5.getItemCount()
            boolean r1 = r5 instanceof androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
            r2 = 0
            if (r1 == 0) goto L23
            androidx.recyclerview.widget.RecyclerView$SmoothScroller$ScrollVectorProvider r5 = (androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider) r5
            r1 = 1
            int r0 = r0 - r1
            android.graphics.PointF r5 = r5.computeScrollVectorForPosition(r0)
            if (r5 == 0) goto L23
            float r0 = r5.x
            r3 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L22
            float r5 = r5.y
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 >= 0) goto L21
            goto L22
        L21:
            return r2
        L22:
            return r1
        L23:
            return r2
    }

    public void attachToRecyclerView(@androidx.annotation.Nullable androidx.recyclerview.widget.RecyclerView r1) {
            r0 = this;
            super.attachToRecyclerView(r1)
            r0.recyclerView = r1
            return
    }

    @androidx.annotation.Nullable
    public int[] calculateDistanceToFinalSnap(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.LayoutManager r2, @androidx.annotation.NonNull android.view.View r3) {
            r1 = this;
            r0 = 0
            int[] r2 = r1.calculateDistanceToSnap(r2, r3, r0)
            return r2
    }

    @androidx.annotation.Nullable
    protected androidx.recyclerview.widget.RecyclerView.SmoothScroller createScroller(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.LayoutManager r2) {
            r1 = this;
            boolean r2 = r2 instanceof androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
            if (r2 == 0) goto L10
            com.google.android.material.carousel.CarouselSnapHelper$1 r2 = new com.google.android.material.carousel.CarouselSnapHelper$1
            androidx.recyclerview.widget.RecyclerView r0 = r1.recyclerView
            android.content.Context r0 = r0.getContext()
            r2.<init>(r1, r0)
            return r2
        L10:
            r2 = 0
            return r2
    }

    @androidx.annotation.Nullable
    public android.view.View findSnapView(androidx.recyclerview.widget.RecyclerView.LayoutManager r1) {
            r0 = this;
            android.view.View r1 = r0.findViewNearestFirstKeyline(r1)
            return r1
    }

    public int findTargetSnapPosition(androidx.recyclerview.widget.RecyclerView.LayoutManager r12, int r13, int r14) {
            r11 = this;
            boolean r0 = r11.disableFling
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r12.getItemCount()
            if (r0 != 0) goto Ld
            return r1
        Ld:
            int r2 = r12.getChildCount()
            r3 = 0
            r4 = 0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 2147483647(0x7fffffff, float:NaN)
            r5 = r4
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 2147483647(0x7fffffff, float:NaN)
            r8 = 0
        L1f:
            if (r8 >= r2) goto L3e
            android.view.View r9 = r12.getChildAt(r8)
            if (r9 != 0) goto L28
            goto L3b
        L28:
            r10 = r12
            com.google.android.material.carousel.CarouselLayoutManager r10 = (com.google.android.material.carousel.CarouselLayoutManager) r10
            int r10 = r11.distanceToFirstFocalKeyline(r9, r10, r3)
            if (r10 > 0) goto L35
            if (r10 <= r6) goto L35
            r5 = r9
            r6 = r10
        L35:
            if (r10 < 0) goto L3b
            if (r10 >= r7) goto L3b
            r4 = r9
            r7 = r10
        L3b:
            int r8 = r8 + 1
            goto L1f
        L3e:
            boolean r13 = r11.isForwardFling(r12, r13, r14)
            if (r13 == 0) goto L4b
            if (r4 == 0) goto L4b
            int r12 = r12.getPosition(r4)
            return r12
        L4b:
            if (r13 != 0) goto L54
            if (r5 == 0) goto L54
            int r12 = r12.getPosition(r5)
            return r12
        L54:
            if (r13 == 0) goto L57
            r4 = r5
        L57:
            if (r4 != 0) goto L5a
            return r1
        L5a:
            int r14 = r12.getPosition(r4)
            boolean r12 = r11.isReverseLayout(r12)
            if (r12 != r13) goto L66
            r12 = -1
            goto L67
        L66:
            r12 = 1
        L67:
            int r14 = r14 + r12
            if (r14 < 0) goto L6e
            if (r14 < r0) goto L6d
            goto L6e
        L6d:
            return r14
        L6e:
            return r1
    }
}
