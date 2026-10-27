package androidx.viewpager2.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class ScrollEventAdapter extends androidx.recyclerview.widget.RecyclerView.OnScrollListener {
    private static final int NO_POSITION = -1;
    private static final int STATE_IDLE = 0;
    private static final int STATE_IN_PROGRESS_FAKE_DRAG = 4;
    private static final int STATE_IN_PROGRESS_IMMEDIATE_SCROLL = 3;
    private static final int STATE_IN_PROGRESS_MANUAL_DRAG = 1;
    private static final int STATE_IN_PROGRESS_SMOOTH_SCROLL = 2;
    private int mAdapterState;
    private androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback mCallback;
    private boolean mDataSetChangeHappened;
    private boolean mDispatchSelected;
    private int mDragStartPosition;
    private boolean mFakeDragging;

    @androidx.annotation.NonNull
    private final androidx.recyclerview.widget.LinearLayoutManager mLayoutManager;

    @androidx.annotation.NonNull
    private final androidx.recyclerview.widget.RecyclerView mRecyclerView;
    private boolean mScrollHappened;
    private int mScrollState;
    private androidx.viewpager2.widget.ScrollEventAdapter.ScrollEventValues mScrollValues;
    private int mTarget;

    @androidx.annotation.NonNull
    private final androidx.viewpager2.widget.ViewPager2 mViewPager;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class ScrollEventValues {
        float mOffset;
        int mOffsetPx;
        int mPosition;

        ScrollEventValues() {
                r0 = this;
                r0.<init>()
                return
        }

        void reset() {
                r1 = this;
                r0 = -1
                r1.mPosition = r0
                r0 = 0
                r1.mOffset = r0
                r0 = 0
                r1.mOffsetPx = r0
                return
        }
    }

    ScrollEventAdapter(@androidx.annotation.NonNull androidx.viewpager2.widget.ViewPager2 r1) {
            r0 = this;
            r0.<init>()
            r0.mViewPager = r1
            androidx.recyclerview.widget.RecyclerView r1 = r1.mRecyclerView
            r0.mRecyclerView = r1
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r1.getLayoutManager()
            androidx.recyclerview.widget.LinearLayoutManager r1 = (androidx.recyclerview.widget.LinearLayoutManager) r1
            r0.mLayoutManager = r1
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r1 = new androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues
            r1.<init>()
            r0.mScrollValues = r1
            r0.resetState()
            return
    }

    private void dispatchScrolled(int r2, float r3, int r4) {
            r1 = this;
            androidx.viewpager2.widget.ViewPager2$OnPageChangeCallback r0 = r1.mCallback
            if (r0 == 0) goto L7
            r0.onPageScrolled(r2, r3, r4)
        L7:
            return
    }

    private void dispatchSelected(int r2) {
            r1 = this;
            androidx.viewpager2.widget.ViewPager2$OnPageChangeCallback r0 = r1.mCallback
            if (r0 == 0) goto L7
            r0.onPageSelected(r2)
        L7:
            return
    }

    private void dispatchStateChanged(int r3) {
            r2 = this;
            int r0 = r2.mAdapterState
            r1 = 3
            if (r0 != r1) goto La
            int r0 = r2.mScrollState
            if (r0 != 0) goto La
            goto L18
        La:
            int r0 = r2.mScrollState
            if (r0 != r3) goto Lf
            goto L18
        Lf:
            r2.mScrollState = r3
            androidx.viewpager2.widget.ViewPager2$OnPageChangeCallback r0 = r2.mCallback
            if (r0 == 0) goto L18
            r0.onPageScrollStateChanged(r3)
        L18:
            return
    }

    private int getPosition() {
            r1 = this;
            androidx.recyclerview.widget.LinearLayoutManager r0 = r1.mLayoutManager
            int r0 = r0.findFirstVisibleItemPosition()
            return r0
    }

    private boolean isInAnyDraggingState() {
            r3 = this;
            int r0 = r3.mAdapterState
            r1 = 1
            if (r0 == r1) goto Lb
            r2 = 4
            if (r0 != r2) goto L9
            goto Lb
        L9:
            r0 = 0
            return r0
        Lb:
            return r1
    }

    private void resetState() {
            r2 = this;
            r0 = 0
            r2.mAdapterState = r0
            r2.mScrollState = r0
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r1 = r2.mScrollValues
            r1.reset()
            r1 = -1
            r2.mDragStartPosition = r1
            r2.mTarget = r1
            r2.mDispatchSelected = r0
            r2.mScrollHappened = r0
            r2.mFakeDragging = r0
            r2.mDataSetChangeHappened = r0
            return
    }

    private void startDrag(boolean r3) {
            r2 = this;
            r2.mFakeDragging = r3
            r0 = 1
            if (r3 == 0) goto L7
            r3 = 4
            goto L8
        L7:
            r3 = 1
        L8:
            r2.mAdapterState = r3
            int r3 = r2.mTarget
            r1 = -1
            if (r3 == r1) goto L14
            r2.mDragStartPosition = r3
            r2.mTarget = r1
            goto L1e
        L14:
            int r3 = r2.mDragStartPosition
            if (r3 != r1) goto L1e
            int r3 = r2.getPosition()
            r2.mDragStartPosition = r3
        L1e:
            r2.dispatchStateChanged(r0)
            return
    }

    private void updateScrollEventValues() {
            r8 = this;
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r0 = r8.mScrollValues
            androidx.recyclerview.widget.LinearLayoutManager r1 = r8.mLayoutManager
            int r1 = r1.findFirstVisibleItemPosition()
            r0.mPosition = r1
            r2 = -1
            if (r1 != r2) goto L11
            r0.reset()
            return
        L11:
            androidx.recyclerview.widget.LinearLayoutManager r2 = r8.mLayoutManager
            android.view.View r1 = r2.findViewByPosition(r1)
            if (r1 != 0) goto L1d
            r0.reset()
            return
        L1d:
            androidx.recyclerview.widget.LinearLayoutManager r2 = r8.mLayoutManager
            int r2 = r2.getLeftDecorationWidth(r1)
            androidx.recyclerview.widget.LinearLayoutManager r3 = r8.mLayoutManager
            int r3 = r3.getRightDecorationWidth(r1)
            androidx.recyclerview.widget.LinearLayoutManager r4 = r8.mLayoutManager
            int r4 = r4.getTopDecorationHeight(r1)
            androidx.recyclerview.widget.LinearLayoutManager r5 = r8.mLayoutManager
            int r5 = r5.getBottomDecorationHeight(r1)
            android.view.ViewGroup$LayoutParams r6 = r1.getLayoutParams()
            boolean r7 = r6 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r7 == 0) goto L4b
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            int r7 = r6.leftMargin
            int r2 = r2 + r7
            int r7 = r6.rightMargin
            int r3 = r3 + r7
            int r7 = r6.topMargin
            int r4 = r4 + r7
            int r6 = r6.bottomMargin
            int r5 = r5 + r6
        L4b:
            int r6 = r1.getHeight()
            int r6 = r6 + r4
            int r6 = r6 + r5
            int r5 = r1.getWidth()
            int r5 = r5 + r2
            int r5 = r5 + r3
            androidx.recyclerview.widget.LinearLayoutManager r3 = r8.mLayoutManager
            int r3 = r3.getOrientation()
            if (r3 != 0) goto L76
            int r1 = r1.getLeft()
            int r1 = r1 - r2
            androidx.recyclerview.widget.RecyclerView r2 = r8.mRecyclerView
            int r2 = r2.getPaddingLeft()
            int r1 = r1 - r2
            androidx.viewpager2.widget.ViewPager2 r2 = r8.mViewPager
            boolean r2 = r2.isRtl()
            if (r2 == 0) goto L74
            int r1 = -r1
        L74:
            r6 = r5
            goto L82
        L76:
            int r1 = r1.getTop()
            int r1 = r1 - r4
            androidx.recyclerview.widget.RecyclerView r2 = r8.mRecyclerView
            int r2 = r2.getPaddingTop()
            int r1 = r1 - r2
        L82:
            int r1 = -r1
            r0.mOffsetPx = r1
            if (r1 >= 0) goto Lb6
            androidx.viewpager2.widget.AnimateLayoutChangeDetector r1 = new androidx.viewpager2.widget.AnimateLayoutChangeDetector
            androidx.recyclerview.widget.LinearLayoutManager r2 = r8.mLayoutManager
            r1.<init>(r2)
            boolean r1 = r1.mayHaveInterferingAnimations()
            if (r1 == 0) goto L9c
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started."
            r0.<init>(r1)
            throw r0
        L9c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.util.Locale r2 = java.util.Locale.US
            int r0 = r0.mOffsetPx
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r0
            java.lang.String r0 = "Page can only be offset by a positive amount, not by %d"
            java.lang.String r0 = java.lang.String.format(r2, r0, r3)
            r1.<init>(r0)
            throw r1
        Lb6:
            if (r6 != 0) goto Lba
            r1 = 0
            goto Lbd
        Lba:
            float r1 = (float) r1
            float r2 = (float) r6
            float r1 = r1 / r2
        Lbd:
            r0.mOffset = r1
            return
    }

    double getRelativeScrollPosition() {
            r5 = this;
            r5.updateScrollEventValues()
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r0 = r5.mScrollValues
            int r1 = r0.mPosition
            double r1 = (double) r1
            float r0 = r0.mOffset
            double r3 = (double) r0
            double r1 = r1 + r3
            return r1
    }

    int getScrollState() {
            r1 = this;
            int r0 = r1.mScrollState
            return r0
    }

    boolean isDragging() {
            r2 = this;
            int r0 = r2.mScrollState
            r1 = 1
            if (r0 != r1) goto L6
            return r1
        L6:
            r0 = 0
            return r0
    }

    boolean isFakeDragging() {
            r1 = this;
            boolean r0 = r1.mFakeDragging
            return r0
    }

    boolean isIdle() {
            r1 = this;
            int r0 = r1.mScrollState
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    void notifyBeginFakeDrag() {
            r1 = this;
            r0 = 4
            r1.mAdapterState = r0
            r0 = 1
            r1.startDrag(r0)
            return
    }

    void notifyDataSetChangeHappened() {
            r1 = this;
            r0 = 1
            r1.mDataSetChangeHappened = r0
            return
    }

    void notifyEndFakeDrag() {
            r3 = this;
            boolean r0 = r3.isDragging()
            if (r0 == 0) goto Lb
            boolean r0 = r3.mFakeDragging
            if (r0 != 0) goto Lb
            return
        Lb:
            r0 = 0
            r3.mFakeDragging = r0
            r3.updateScrollEventValues()
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r1 = r3.mScrollValues
            int r2 = r1.mOffsetPx
            if (r2 != 0) goto L27
            int r1 = r1.mPosition
            int r2 = r3.mDragStartPosition
            if (r1 == r2) goto L20
            r3.dispatchSelected(r1)
        L20:
            r3.dispatchStateChanged(r0)
            r3.resetState()
            return
        L27:
            r0 = 2
            r3.dispatchStateChanged(r0)
            return
    }

    void notifyProgrammaticScroll(int r3, boolean r4) {
            r2 = this;
            r0 = 2
            if (r4 == 0) goto L5
            r4 = 2
            goto L6
        L5:
            r4 = 3
        L6:
            r2.mAdapterState = r4
            r4 = 0
            r2.mFakeDragging = r4
            int r1 = r2.mTarget
            if (r1 == r3) goto L10
            r4 = 1
        L10:
            r2.mTarget = r3
            r2.dispatchStateChanged(r0)
            if (r4 == 0) goto L1a
            r2.dispatchSelected(r3)
        L1a:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r5, int r6) {
            r4 = this;
            int r5 = r4.mAdapterState
            r0 = 0
            r1 = 1
            if (r5 != r1) goto La
            int r5 = r4.mScrollState
            if (r5 == r1) goto L10
        La:
            if (r6 != r1) goto L10
            r4.startDrag(r0)
            return
        L10:
            boolean r5 = r4.isInAnyDraggingState()
            r2 = 2
            if (r5 == 0) goto L23
            if (r6 != r2) goto L23
            boolean r5 = r4.mScrollHappened
            if (r5 == 0) goto L78
            r4.dispatchStateChanged(r2)
            r4.mDispatchSelected = r1
            return
        L23:
            boolean r5 = r4.isInAnyDraggingState()
            r1 = -1
            if (r5 == 0) goto L53
            if (r6 != 0) goto L53
            r4.updateScrollEventValues()
            boolean r5 = r4.mScrollHappened
            if (r5 != 0) goto L3e
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r5 = r4.mScrollValues
            int r5 = r5.mPosition
            if (r5 == r1) goto L4d
            r3 = 0
            r4.dispatchScrolled(r5, r3, r0)
            goto L4d
        L3e:
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r5 = r4.mScrollValues
            int r3 = r5.mOffsetPx
            if (r3 != 0) goto L53
            int r3 = r4.mDragStartPosition
            int r5 = r5.mPosition
            if (r3 == r5) goto L4d
            r4.dispatchSelected(r5)
        L4d:
            r4.dispatchStateChanged(r0)
            r4.resetState()
        L53:
            int r5 = r4.mAdapterState
            if (r5 != r2) goto L78
            if (r6 != 0) goto L78
            boolean r5 = r4.mDataSetChangeHappened
            if (r5 == 0) goto L78
            r4.updateScrollEventValues()
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r5 = r4.mScrollValues
            int r6 = r5.mOffsetPx
            if (r6 != 0) goto L78
            int r6 = r4.mTarget
            int r5 = r5.mPosition
            if (r6 == r5) goto L72
            if (r5 != r1) goto L6f
            r5 = 0
        L6f:
            r4.dispatchSelected(r5)
        L72:
            r4.dispatchStateChanged(r0)
            r4.resetState()
        L78:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r4, int r5, int r6) {
            r3 = this;
            r4 = 1
            r3.mScrollHappened = r4
            r3.updateScrollEventValues()
            boolean r0 = r3.mDispatchSelected
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L37
            r3.mDispatchSelected = r2
            if (r6 > 0) goto L1f
            if (r6 != 0) goto L29
            if (r5 >= 0) goto L16
            r5 = 1
            goto L17
        L16:
            r5 = 0
        L17:
            androidx.viewpager2.widget.ViewPager2 r6 = r3.mViewPager
            boolean r6 = r6.isRtl()
            if (r5 != r6) goto L29
        L1f:
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r5 = r3.mScrollValues
            int r6 = r5.mOffsetPx
            if (r6 == 0) goto L29
            int r5 = r5.mPosition
            int r5 = r5 + r4
            goto L2d
        L29:
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r5 = r3.mScrollValues
            int r5 = r5.mPosition
        L2d:
            r3.mTarget = r5
            int r6 = r3.mDragStartPosition
            if (r6 == r5) goto L45
            r3.dispatchSelected(r5)
            goto L45
        L37:
            int r5 = r3.mAdapterState
            if (r5 != 0) goto L45
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r5 = r3.mScrollValues
            int r5 = r5.mPosition
            if (r5 != r1) goto L42
            r5 = 0
        L42:
            r3.dispatchSelected(r5)
        L45:
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r5 = r3.mScrollValues
            int r6 = r5.mPosition
            if (r6 != r1) goto L4c
            r6 = 0
        L4c:
            float r0 = r5.mOffset
            int r5 = r5.mOffsetPx
            r3.dispatchScrolled(r6, r0, r5)
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r5 = r3.mScrollValues
            int r6 = r5.mPosition
            int r0 = r3.mTarget
            if (r6 == r0) goto L5d
            if (r0 != r1) goto L6b
        L5d:
            int r5 = r5.mOffsetPx
            if (r5 != 0) goto L6b
            int r5 = r3.mScrollState
            if (r5 == r4) goto L6b
            r3.dispatchStateChanged(r2)
            r3.resetState()
        L6b:
            return
    }

    void setOnPageChangeCallback(androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback r1) {
            r0 = this;
            r0.mCallback = r1
            return
    }
}
