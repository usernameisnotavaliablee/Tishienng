package androidx.recyclerview.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class PagerSnapHelper extends androidx.recyclerview.widget.SnapHelper {
    private static final int MAX_SCROLL_ON_FLING_DURATION = 100;

    @androidx.annotation.Nullable
    private androidx.recyclerview.widget.OrientationHelper mHorizontalHelper;

    @androidx.annotation.Nullable
    private androidx.recyclerview.widget.OrientationHelper mVerticalHelper;


    public PagerSnapHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    private int distanceToCenter(@androidx.annotation.NonNull android.view.View r2, androidx.recyclerview.widget.OrientationHelper r3) {
            r1 = this;
            int r0 = r3.getDecoratedStart(r2)
            int r2 = r3.getDecoratedMeasurement(r2)
            int r2 = r2 / 2
            int r0 = r0 + r2
            int r2 = r3.getStartAfterPadding()
            int r3 = r3.getTotalSpace()
            int r3 = r3 / 2
            int r2 = r2 + r3
            int r0 = r0 - r2
            return r0
    }

    @androidx.annotation.Nullable
    private android.view.View findCenterView(androidx.recyclerview.widget.RecyclerView.LayoutManager r9, androidx.recyclerview.widget.OrientationHelper r10) {
            r8 = this;
            int r0 = r9.getChildCount()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r2 = r10.getStartAfterPadding()
            int r3 = r10.getTotalSpace()
            int r3 = r3 / 2
            int r2 = r2 + r3
            r3 = 2147483647(0x7fffffff, float:NaN)
            r4 = 0
        L17:
            if (r4 >= r0) goto L34
            android.view.View r5 = r9.getChildAt(r4)
            int r6 = r10.getDecoratedStart(r5)
            int r7 = r10.getDecoratedMeasurement(r5)
            int r7 = r7 / 2
            int r6 = r6 + r7
            int r6 = r6 - r2
            int r6 = java.lang.Math.abs(r6)
            if (r6 >= r3) goto L31
            r1 = r5
            r3 = r6
        L31:
            int r4 = r4 + 1
            goto L17
        L34:
            return r1
    }

    @androidx.annotation.NonNull
    private androidx.recyclerview.widget.OrientationHelper getHorizontalHelper(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.LayoutManager r2) {
            r1 = this;
            androidx.recyclerview.widget.OrientationHelper r0 = r1.mHorizontalHelper
            if (r0 == 0) goto L8
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.mLayoutManager
            if (r0 == r2) goto Le
        L8:
            androidx.recyclerview.widget.OrientationHelper r2 = androidx.recyclerview.widget.OrientationHelper.createHorizontalHelper(r2)
            r1.mHorizontalHelper = r2
        Le:
            androidx.recyclerview.widget.OrientationHelper r2 = r1.mHorizontalHelper
            return r2
    }

    @androidx.annotation.Nullable
    private androidx.recyclerview.widget.OrientationHelper getOrientationHelper(androidx.recyclerview.widget.RecyclerView.LayoutManager r2) {
            r1 = this;
            boolean r0 = r2.canScrollVertically()
            if (r0 == 0) goto Lb
            androidx.recyclerview.widget.OrientationHelper r2 = r1.getVerticalHelper(r2)
            return r2
        Lb:
            boolean r0 = r2.canScrollHorizontally()
            if (r0 == 0) goto L16
            androidx.recyclerview.widget.OrientationHelper r2 = r1.getHorizontalHelper(r2)
            return r2
        L16:
            r2 = 0
            return r2
    }

    @androidx.annotation.NonNull
    private androidx.recyclerview.widget.OrientationHelper getVerticalHelper(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.LayoutManager r2) {
            r1 = this;
            androidx.recyclerview.widget.OrientationHelper r0 = r1.mVerticalHelper
            if (r0 == 0) goto L8
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.mLayoutManager
            if (r0 == r2) goto Le
        L8:
            androidx.recyclerview.widget.OrientationHelper r2 = androidx.recyclerview.widget.OrientationHelper.createVerticalHelper(r2)
            r1.mVerticalHelper = r2
        Le:
            androidx.recyclerview.widget.OrientationHelper r2 = r1.mVerticalHelper
            return r2
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

    @Override // androidx.recyclerview.widget.SnapHelper
    @androidx.annotation.Nullable
    public int[] calculateDistanceToFinalSnap(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.LayoutManager r5, @androidx.annotation.NonNull android.view.View r6) {
            r4 = this;
            r0 = 2
            int[] r0 = new int[r0]
            boolean r1 = r5.canScrollHorizontally()
            r2 = 0
            if (r1 == 0) goto L15
            androidx.recyclerview.widget.OrientationHelper r1 = r4.getHorizontalHelper(r5)
            int r1 = r4.distanceToCenter(r6, r1)
            r0[r2] = r1
            goto L17
        L15:
            r0[r2] = r2
        L17:
            boolean r1 = r5.canScrollVertically()
            r3 = 1
            if (r1 == 0) goto L29
            androidx.recyclerview.widget.OrientationHelper r5 = r4.getVerticalHelper(r5)
            int r5 = r4.distanceToCenter(r6, r5)
            r0[r3] = r5
            return r0
        L29:
            r0[r3] = r2
            return r0
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    @androidx.annotation.Nullable
    protected androidx.recyclerview.widget.RecyclerView.SmoothScroller createScroller(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.LayoutManager r2) {
            r1 = this;
            boolean r2 = r2 instanceof androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
            if (r2 != 0) goto L6
            r2 = 0
            return r2
        L6:
            androidx.recyclerview.widget.PagerSnapHelper$1 r2 = new androidx.recyclerview.widget.PagerSnapHelper$1
            androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
            android.content.Context r0 = r0.getContext()
            r2.<init>(r1, r0)
            return r2
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    @androidx.annotation.Nullable
    @android.annotation.SuppressLint({"UnknownNullness"})
    public android.view.View findSnapView(androidx.recyclerview.widget.RecyclerView.LayoutManager r2) {
            r1 = this;
            boolean r0 = r2.canScrollVertically()
            if (r0 == 0) goto Lf
            androidx.recyclerview.widget.OrientationHelper r0 = r1.getVerticalHelper(r2)
            android.view.View r2 = r1.findCenterView(r2, r0)
            return r2
        Lf:
            boolean r0 = r2.canScrollHorizontally()
            if (r0 == 0) goto L1e
            androidx.recyclerview.widget.OrientationHelper r0 = r1.getHorizontalHelper(r2)
            android.view.View r2 = r1.findCenterView(r2, r0)
            return r2
        L1e:
            r2 = 0
            return r2
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    @android.annotation.SuppressLint({"UnknownNullness"})
    public int findTargetSnapPosition(androidx.recyclerview.widget.RecyclerView.LayoutManager r12, int r13, int r14) {
            r11 = this;
            int r0 = r12.getItemCount()
            r1 = -1
            if (r0 != 0) goto L8
            return r1
        L8:
            androidx.recyclerview.widget.OrientationHelper r2 = r11.getOrientationHelper(r12)
            if (r2 != 0) goto Lf
            return r1
        Lf:
            int r3 = r12.getChildCount()
            r4 = 0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 2147483647(0x7fffffff, float:NaN)
            r7 = 0
            r5 = r4
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 2147483647(0x7fffffff, float:NaN)
            r8 = 0
        L21:
            if (r8 >= r3) goto L3d
            android.view.View r9 = r12.getChildAt(r8)
            if (r9 != 0) goto L2a
            goto L3a
        L2a:
            int r10 = r11.distanceToCenter(r9, r2)
            if (r10 > 0) goto L34
            if (r10 <= r6) goto L34
            r5 = r9
            r6 = r10
        L34:
            if (r10 < 0) goto L3a
            if (r10 >= r7) goto L3a
            r4 = r9
            r7 = r10
        L3a:
            int r8 = r8 + 1
            goto L21
        L3d:
            boolean r13 = r11.isForwardFling(r12, r13, r14)
            if (r13 == 0) goto L4a
            if (r4 == 0) goto L4a
            int r12 = r12.getPosition(r4)
            return r12
        L4a:
            if (r13 != 0) goto L53
            if (r5 == 0) goto L53
            int r12 = r12.getPosition(r5)
            return r12
        L53:
            if (r13 == 0) goto L56
            r4 = r5
        L56:
            if (r4 != 0) goto L59
            return r1
        L59:
            int r14 = r12.getPosition(r4)
            boolean r12 = r11.isReverseLayout(r12)
            if (r12 != r13) goto L65
            r12 = -1
            goto L66
        L65:
            r12 = 1
        L66:
            int r14 = r14 + r12
            if (r14 < 0) goto L6d
            if (r14 < r0) goto L6c
            goto L6d
        L6c:
            return r14
        L6d:
            return r1
    }
}
