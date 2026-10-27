package com.google.android.material.carousel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class CarouselLayoutManager extends androidx.recyclerview.widget.RecyclerView.LayoutManager implements com.google.android.material.carousel.Carousel, androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider {
    public static final int HORIZONTAL = 0;
    private static final java.lang.String TAG = "CarouselLayoutManager";
    public static final int VERTICAL = 1;

    @androidx.annotation.NonNull
    private com.google.android.material.carousel.CarouselStrategy carouselStrategy;
    private int currentFillStartPosition;

    @androidx.annotation.Nullable
    private com.google.android.material.carousel.KeylineState currentKeylineState;
    private final com.google.android.material.carousel.CarouselLayoutManager.DebugItemDecoration debugItemDecoration;
    private boolean isDebuggingEnabled;

    @androidx.annotation.Nullable
    private com.google.android.material.carousel.KeylineStateList keylineStateList;

    @androidx.annotation.Nullable
    private java.util.Map<java.lang.Integer, com.google.android.material.carousel.KeylineState> keylineStatePositionMap;

    @androidx.annotation.VisibleForTesting
    int maxScroll;

    @androidx.annotation.VisibleForTesting
    int minScroll;
    private com.google.android.material.carousel.CarouselOrientationHelper orientationHelper;

    @androidx.annotation.VisibleForTesting
    int scrollOffset;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class ChildCalculations {
        final float center;
        final android.view.View child;
        final float offsetCenter;
        final com.google.android.material.carousel.CarouselLayoutManager.KeylineRange range;

        ChildCalculations(android.view.View r1, float r2, float r3, com.google.android.material.carousel.CarouselLayoutManager.KeylineRange r4) {
                r0 = this;
                r0.<init>()
                r0.child = r1
                r0.center = r2
                r0.offsetCenter = r3
                r0.range = r4
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class DebugItemDecoration extends androidx.recyclerview.widget.RecyclerView.ItemDecoration {
        private java.util.List<com.google.android.material.carousel.KeylineState.Keyline> keylines;
        private final android.graphics.Paint linePaint;

        DebugItemDecoration() {
                r2 = this;
                r2.<init>()
                android.graphics.Paint r0 = new android.graphics.Paint
                r0.<init>()
                r2.linePaint = r0
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.List r1 = java.util.Collections.unmodifiableList(r1)
                r2.keylines = r1
                r1 = 1084227584(0x40a00000, float:5.0)
                r0.setStrokeWidth(r1)
                r1 = -65281(0xffffffffffff00ff, float:NaN)
                r0.setColor(r1)
                return
        }

        public void onDrawOver(@androidx.annotation.NonNull android.graphics.Canvas r17, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r18, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r19) {
                r16 = this;
                r0 = r16
                super.onDrawOver(r17, r18, r19)
                android.graphics.Paint r1 = r0.linePaint
                android.content.res.Resources r2 = r18.getResources()
                int r3 = com.google.android.material.R.dimen.m3_carousel_debug_keyline_width
                float r2 = r2.getDimension(r3)
                r1.setStrokeWidth(r2)
                java.util.List<com.google.android.material.carousel.KeylineState$Keyline> r1 = r0.keylines
                java.util.Iterator r1 = r1.iterator()
            L1a:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L87
                java.lang.Object r2 = r1.next()
                com.google.android.material.carousel.KeylineState$Keyline r2 = (com.google.android.material.carousel.KeylineState.Keyline) r2
                android.graphics.Paint r3 = r0.linePaint
                r4 = -16776961(0xffffffffff0000ff, float:-1.7014636E38)
                float r5 = r2.mask
                r6 = -65281(0xffffffffffff00ff, float:NaN)
                int r4 = androidx.core.graphics.ColorUtils.blendARGB(r6, r4, r5)
                r3.setColor(r4)
                androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r18.getLayoutManager()
                com.google.android.material.carousel.CarouselLayoutManager r3 = (com.google.android.material.carousel.CarouselLayoutManager) r3
                boolean r3 = r3.isHorizontal()
                if (r3 == 0) goto L65
                float r5 = r2.locOffset
                androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r18.getLayoutManager()
                com.google.android.material.carousel.CarouselLayoutManager r3 = (com.google.android.material.carousel.CarouselLayoutManager) r3
                int r3 = com.google.android.material.carousel.CarouselLayoutManager.access$100(r3)
                float r6 = (float) r3
                float r7 = r2.locOffset
                androidx.recyclerview.widget.RecyclerView$LayoutManager r2 = r18.getLayoutManager()
                com.google.android.material.carousel.CarouselLayoutManager r2 = (com.google.android.material.carousel.CarouselLayoutManager) r2
                int r2 = com.google.android.material.carousel.CarouselLayoutManager.access$200(r2)
                float r8 = (float) r2
                android.graphics.Paint r9 = r0.linePaint
                r4 = r17
                r4.drawLine(r5, r6, r7, r8, r9)
                goto L1a
            L65:
                androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r18.getLayoutManager()
                com.google.android.material.carousel.CarouselLayoutManager r3 = (com.google.android.material.carousel.CarouselLayoutManager) r3
                int r3 = com.google.android.material.carousel.CarouselLayoutManager.access$300(r3)
                float r11 = (float) r3
                float r12 = r2.locOffset
                androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r18.getLayoutManager()
                com.google.android.material.carousel.CarouselLayoutManager r3 = (com.google.android.material.carousel.CarouselLayoutManager) r3
                int r3 = com.google.android.material.carousel.CarouselLayoutManager.access$400(r3)
                float r13 = (float) r3
                float r14 = r2.locOffset
                android.graphics.Paint r15 = r0.linePaint
                r10 = r17
                r10.drawLine(r11, r12, r13, r14, r15)
                goto L1a
            L87:
                return
        }

        void setKeylines(java.util.List<com.google.android.material.carousel.KeylineState.Keyline> r1) {
                r0 = this;
                java.util.List r1 = java.util.Collections.unmodifiableList(r1)
                r0.keylines = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class KeylineRange {
        final com.google.android.material.carousel.KeylineState.Keyline leftOrTop;
        final com.google.android.material.carousel.KeylineState.Keyline rightOrBottom;

        KeylineRange(com.google.android.material.carousel.KeylineState.Keyline r3, com.google.android.material.carousel.KeylineState.Keyline r4) {
                r2 = this;
                r2.<init>()
                float r0 = r3.loc
                float r1 = r4.loc
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 > 0) goto Ld
                r0 = 1
                goto Le
            Ld:
                r0 = 0
            Le:
                androidx.core.util.Preconditions.checkArgument(r0)
                r2.leftOrTop = r3
                r2.rightOrBottom = r4
                return
        }
    }

    public CarouselLayoutManager() {
            r1 = this;
            com.google.android.material.carousel.MultiBrowseCarouselStrategy r0 = new com.google.android.material.carousel.MultiBrowseCarouselStrategy
            r0.<init>()
            r1.<init>(r0)
            return
    }

    @android.annotation.SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(android.content.Context r3, android.util.AttributeSet r4, int r5, int r6) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.isDebuggingEnabled = r0
            com.google.android.material.carousel.CarouselLayoutManager$DebugItemDecoration r1 = new com.google.android.material.carousel.CarouselLayoutManager$DebugItemDecoration
            r1.<init>()
            r2.debugItemDecoration = r1
            r2.currentFillStartPosition = r0
            androidx.recyclerview.widget.RecyclerView$LayoutManager$Properties r3 = androidx.recyclerview.widget.RecyclerView.LayoutManager.getProperties(r3, r4, r5, r6)
            int r3 = r3.orientation
            r2.setOrientation(r3)
            com.google.android.material.carousel.MultiBrowseCarouselStrategy r3 = new com.google.android.material.carousel.MultiBrowseCarouselStrategy
            r3.<init>()
            r2.setCarouselStrategy(r3)
            return
    }

    public CarouselLayoutManager(@androidx.annotation.NonNull com.google.android.material.carousel.CarouselStrategy r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public CarouselLayoutManager(@androidx.annotation.NonNull com.google.android.material.carousel.CarouselStrategy r3, int r4) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.isDebuggingEnabled = r0
            com.google.android.material.carousel.CarouselLayoutManager$DebugItemDecoration r1 = new com.google.android.material.carousel.CarouselLayoutManager$DebugItemDecoration
            r1.<init>()
            r2.debugItemDecoration = r1
            r2.currentFillStartPosition = r0
            r2.setCarouselStrategy(r3)
            r2.setOrientation(r4)
            return
    }

    static /* synthetic */ com.google.android.material.carousel.KeylineStateList access$000(com.google.android.material.carousel.CarouselLayoutManager r0) {
            com.google.android.material.carousel.KeylineStateList r0 = r0.keylineStateList
            return r0
    }

    static /* synthetic */ int access$100(com.google.android.material.carousel.CarouselLayoutManager r0) {
            int r0 = r0.getParentTop()
            return r0
    }

    static /* synthetic */ int access$200(com.google.android.material.carousel.CarouselLayoutManager r0) {
            int r0 = r0.getParentBottom()
            return r0
    }

    static /* synthetic */ int access$300(com.google.android.material.carousel.CarouselLayoutManager r0) {
            int r0 = r0.getParentLeft()
            return r0
    }

    static /* synthetic */ int access$400(com.google.android.material.carousel.CarouselLayoutManager r0) {
            int r0 = r0.getParentRight()
            return r0
    }

    private void addAndLayoutView(android.view.View r3, int r4, com.google.android.material.carousel.CarouselLayoutManager.ChildCalculations r5) {
            r2 = this;
            com.google.android.material.carousel.KeylineState r0 = r2.currentKeylineState
            float r0 = r0.getItemSize()
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            r2.addView(r3, r4)
            float r4 = r5.offsetCenter
            float r1 = r4 - r0
            int r1 = (int) r1
            float r4 = r4 + r0
            int r4 = (int) r4
            com.google.android.material.carousel.CarouselOrientationHelper r0 = r2.orientationHelper
            r0.layoutDecoratedWithMargins(r3, r1, r4)
            float r4 = r5.center
            com.google.android.material.carousel.CarouselLayoutManager$KeylineRange r5 = r5.range
            r2.updateChildMaskForLocation(r3, r4, r5)
            return
    }

    private int addEnd(int r2, int r3) {
            r1 = this;
            boolean r0 = r1.isLayoutRtl()
            if (r0 == 0) goto L8
            int r2 = r2 - r3
            return r2
        L8:
            int r2 = r2 + r3
            return r2
    }

    private int addStart(int r2, int r3) {
            r1 = this;
            boolean r0 = r1.isLayoutRtl()
            if (r0 == 0) goto L8
            int r2 = r2 + r3
            return r2
        L8:
            int r2 = r2 - r3
            return r2
    }

    private void addViewsEnd(androidx.recyclerview.widget.RecyclerView.Recycler r5, androidx.recyclerview.widget.RecyclerView.State r6, int r7) {
            r4 = this;
            int r0 = r4.calculateChildStartForFill(r7)
        L4:
            int r1 = r6.getItemCount()
            if (r7 >= r1) goto L39
            float r1 = (float) r0
            com.google.android.material.carousel.CarouselLayoutManager$ChildCalculations r1 = r4.makeChildCalculations(r5, r1, r7)
            float r2 = r1.offsetCenter
            com.google.android.material.carousel.CarouselLayoutManager$KeylineRange r3 = r1.range
            boolean r2 = r4.isLocOffsetOutOfFillBoundsEnd(r2, r3)
            if (r2 == 0) goto L1a
            goto L39
        L1a:
            com.google.android.material.carousel.KeylineState r2 = r4.currentKeylineState
            float r2 = r2.getItemSize()
            int r2 = (int) r2
            int r0 = r4.addEnd(r0, r2)
            float r2 = r1.offsetCenter
            com.google.android.material.carousel.CarouselLayoutManager$KeylineRange r3 = r1.range
            boolean r2 = r4.isLocOffsetOutOfFillBoundsStart(r2, r3)
            if (r2 == 0) goto L30
            goto L36
        L30:
            android.view.View r2 = r1.child
            r3 = -1
            r4.addAndLayoutView(r2, r3, r1)
        L36:
            int r7 = r7 + 1
            goto L4
        L39:
            return
    }

    private void addViewsStart(androidx.recyclerview.widget.RecyclerView.Recycler r5, int r6) {
            r4 = this;
            int r0 = r4.calculateChildStartForFill(r6)
        L4:
            if (r6 < 0) goto L35
            float r1 = (float) r0
            com.google.android.material.carousel.CarouselLayoutManager$ChildCalculations r1 = r4.makeChildCalculations(r5, r1, r6)
            float r2 = r1.offsetCenter
            com.google.android.material.carousel.CarouselLayoutManager$KeylineRange r3 = r1.range
            boolean r2 = r4.isLocOffsetOutOfFillBoundsStart(r2, r3)
            if (r2 == 0) goto L16
            goto L35
        L16:
            com.google.android.material.carousel.KeylineState r2 = r4.currentKeylineState
            float r2 = r2.getItemSize()
            int r2 = (int) r2
            int r0 = r4.addStart(r0, r2)
            float r2 = r1.offsetCenter
            com.google.android.material.carousel.CarouselLayoutManager$KeylineRange r3 = r1.range
            boolean r2 = r4.isLocOffsetOutOfFillBoundsEnd(r2, r3)
            if (r2 == 0) goto L2c
            goto L32
        L2c:
            android.view.View r2 = r1.child
            r3 = 0
            r4.addAndLayoutView(r2, r3, r1)
        L32:
            int r6 = r6 + (-1)
            goto L4
        L35:
            return
    }

    private float calculateChildOffsetCenterForLocation(android.view.View r5, float r6, com.google.android.material.carousel.CarouselLayoutManager.KeylineRange r7) {
            r4 = this;
            com.google.android.material.carousel.KeylineState$Keyline r0 = r7.leftOrTop
            float r1 = r0.locOffset
            com.google.android.material.carousel.KeylineState$Keyline r2 = r7.rightOrBottom
            float r3 = r2.locOffset
            float r0 = r0.loc
            float r2 = r2.loc
            float r0 = com.google.android.material.animation.AnimationUtils.lerp(r1, r3, r0, r2, r6)
            com.google.android.material.carousel.KeylineState$Keyline r1 = r7.rightOrBottom
            com.google.android.material.carousel.KeylineState r2 = r4.currentKeylineState
            com.google.android.material.carousel.KeylineState$Keyline r2 = r2.getFirstKeyline()
            if (r1 == r2) goto L26
            com.google.android.material.carousel.KeylineState$Keyline r1 = r7.leftOrTop
            com.google.android.material.carousel.KeylineState r2 = r4.currentKeylineState
            com.google.android.material.carousel.KeylineState$Keyline r2 = r2.getLastKeyline()
            if (r1 != r2) goto L25
            goto L26
        L25:
            return r0
        L26:
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$LayoutParams r5 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r5
            com.google.android.material.carousel.CarouselOrientationHelper r1 = r4.orientationHelper
            float r5 = r1.getMaskMargins(r5)
            com.google.android.material.carousel.KeylineState r1 = r4.currentKeylineState
            float r1 = r1.getItemSize()
            float r5 = r5 / r1
            com.google.android.material.carousel.KeylineState$Keyline r7 = r7.rightOrBottom
            float r1 = r7.loc
            float r6 = r6 - r1
            r1 = 1065353216(0x3f800000, float:1.0)
            float r7 = r7.mask
            float r1 = r1 - r7
            float r1 = r1 + r5
            float r6 = r6 * r1
            float r0 = r0 + r6
            return r0
    }

    private int calculateChildStartForFill(int r3) {
            r2 = this;
            int r0 = r2.getParentStart()
            int r1 = r2.scrollOffset
            int r0 = r0 - r1
            float r0 = (float) r0
            com.google.android.material.carousel.KeylineState r1 = r2.currentKeylineState
            float r1 = r1.getItemSize()
            float r3 = (float) r3
            float r1 = r1 * r3
            int r3 = (int) r0
            int r0 = (int) r1
            int r3 = r2.addEnd(r3, r0)
            return r3
    }

    private int calculateEndScroll(androidx.recyclerview.widget.RecyclerView.State r4, com.google.android.material.carousel.KeylineStateList r5) {
            r3 = this;
            boolean r0 = r3.isLayoutRtl()
            if (r0 == 0) goto Lb
            com.google.android.material.carousel.KeylineState r5 = r5.getStartState()
            goto Lf
        Lb:
            com.google.android.material.carousel.KeylineState r5 = r5.getEndState()
        Lf:
            if (r0 == 0) goto L16
            com.google.android.material.carousel.KeylineState$Keyline r1 = r5.getFirstFocalKeyline()
            goto L1a
        L16:
            com.google.android.material.carousel.KeylineState$Keyline r1 = r5.getLastFocalKeyline()
        L1a:
            int r4 = r4.getItemCount()
            int r4 = r4 + (-1)
            float r4 = (float) r4
            float r5 = r5.getItemSize()
            float r4 = r4 * r5
            int r5 = r3.getPaddingEnd()
            float r5 = (float) r5
            float r4 = r4 + r5
            if (r0 == 0) goto L32
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L34
        L32:
            r5 = 1065353216(0x3f800000, float:1.0)
        L34:
            float r4 = r4 * r5
            float r5 = r1.loc
            int r0 = r3.getParentStart()
            float r0 = (float) r0
            float r5 = r5 - r0
            int r0 = r3.getParentEnd()
            float r0 = (float) r0
            float r1 = r1.loc
            float r0 = r0 - r1
            float r1 = java.lang.Math.abs(r5)
            float r2 = java.lang.Math.abs(r4)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L54
            r4 = 0
            return r4
        L54:
            float r4 = r4 - r5
            float r4 = r4 + r0
            int r4 = (int) r4
            return r4
    }

    private static int calculateShouldScrollBy(int r1, int r2, int r3, int r4) {
            int r0 = r2 + r1
            if (r0 >= r3) goto L6
            int r3 = r3 - r2
            return r3
        L6:
            if (r0 <= r4) goto La
            int r4 = r4 - r2
            return r4
        La:
            return r1
    }

    private int calculateStartScroll(com.google.android.material.carousel.KeylineStateList r4) {
            r3 = this;
            boolean r0 = r3.isLayoutRtl()
            if (r0 == 0) goto Lb
            com.google.android.material.carousel.KeylineState r4 = r4.getEndState()
            goto Lf
        Lb:
            com.google.android.material.carousel.KeylineState r4 = r4.getStartState()
        Lf:
            if (r0 == 0) goto L16
            com.google.android.material.carousel.KeylineState$Keyline r1 = r4.getLastFocalKeyline()
            goto L1a
        L16:
            com.google.android.material.carousel.KeylineState$Keyline r1 = r4.getFirstFocalKeyline()
        L1a:
            int r2 = r3.getPaddingStart()
            if (r0 == 0) goto L22
            r0 = 1
            goto L23
        L22:
            r0 = -1
        L23:
            int r2 = r2 * r0
            float r0 = (float) r2
            float r1 = r1.loc
            int r1 = (int) r1
            float r4 = r4.getItemSize()
            r2 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r2
            int r4 = (int) r4
            int r4 = r3.addStart(r1, r4)
            int r1 = r3.getParentStart()
            float r1 = (float) r1
            float r0 = r0 + r1
            float r4 = (float) r4
            float r0 = r0 - r4
            int r4 = (int) r0
            return r4
    }

    private void fill(androidx.recyclerview.widget.RecyclerView.Recycler r3, androidx.recyclerview.widget.RecyclerView.State r4) {
            r2 = this;
            r2.removeAndRecycleOutOfBoundsViews(r3)
            int r0 = r2.getChildCount()
            if (r0 != 0) goto L16
            int r0 = r2.currentFillStartPosition
            int r0 = r0 + (-1)
            r2.addViewsStart(r3, r0)
            int r0 = r2.currentFillStartPosition
            r2.addViewsEnd(r3, r4, r0)
            goto L37
        L16:
            r0 = 0
            android.view.View r0 = r2.getChildAt(r0)
            int r0 = r2.getPosition(r0)
            int r1 = r2.getChildCount()
            int r1 = r1 + (-1)
            android.view.View r1 = r2.getChildAt(r1)
            int r1 = r2.getPosition(r1)
            int r0 = r0 + (-1)
            r2.addViewsStart(r3, r0)
            int r1 = r1 + 1
            r2.addViewsEnd(r3, r4, r1)
        L37:
            r2.validateChildOrderIfDebugging()
            return
    }

    private int getContainerSize() {
            r1 = this;
            boolean r0 = r1.isHorizontal()
            if (r0 == 0) goto Lb
            int r0 = r1.getContainerWidth()
            return r0
        Lb:
            int r0 = r1.getContainerHeight()
            return r0
    }

    private float getDecoratedCenterXWithMargins(android.view.View r2) {
            r1 = this;
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            super.getDecoratedBoundsWithMargins(r2, r0)
            int r2 = r0.centerX()
            float r2 = (float) r2
            return r2
    }

    private com.google.android.material.carousel.KeylineState getKeylineStateForPosition(int r4) {
            r3 = this;
            java.util.Map<java.lang.Integer, com.google.android.material.carousel.KeylineState> r0 = r3.keylineStatePositionMap
            if (r0 == 0) goto L20
            int r1 = r3.getItemCount()
            int r1 = r1 + (-1)
            r2 = 0
            int r1 = java.lang.Math.max(r2, r1)
            int r4 = androidx.core.math.MathUtils.clamp(r4, r2, r1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r0.get(r4)
            com.google.android.material.carousel.KeylineState r4 = (com.google.android.material.carousel.KeylineState) r4
            if (r4 == 0) goto L20
            return r4
        L20:
            com.google.android.material.carousel.KeylineStateList r4 = r3.keylineStateList
            com.google.android.material.carousel.KeylineState r4 = r4.getDefaultState()
            return r4
    }

    private float getMaskedItemSizeForLocOffset(float r4, com.google.android.material.carousel.CarouselLayoutManager.KeylineRange r5) {
            r3 = this;
            com.google.android.material.carousel.KeylineState$Keyline r0 = r5.leftOrTop
            float r1 = r0.maskedItemSize
            com.google.android.material.carousel.KeylineState$Keyline r5 = r5.rightOrBottom
            float r2 = r5.maskedItemSize
            float r0 = r0.locOffset
            float r5 = r5.locOffset
            float r4 = com.google.android.material.animation.AnimationUtils.lerp(r1, r2, r0, r5, r4)
            return r4
    }

    private int getParentBottom() {
            r1 = this;
            com.google.android.material.carousel.CarouselOrientationHelper r0 = r1.orientationHelper
            int r0 = r0.getParentBottom()
            return r0
    }

    private int getParentEnd() {
            r1 = this;
            com.google.android.material.carousel.CarouselOrientationHelper r0 = r1.orientationHelper
            int r0 = r0.getParentEnd()
            return r0
    }

    private int getParentLeft() {
            r1 = this;
            com.google.android.material.carousel.CarouselOrientationHelper r0 = r1.orientationHelper
            int r0 = r0.getParentLeft()
            return r0
    }

    private int getParentRight() {
            r1 = this;
            com.google.android.material.carousel.CarouselOrientationHelper r0 = r1.orientationHelper
            int r0 = r0.getParentRight()
            return r0
    }

    private int getParentStart() {
            r1 = this;
            com.google.android.material.carousel.CarouselOrientationHelper r0 = r1.orientationHelper
            int r0 = r0.getParentStart()
            return r0
    }

    private int getParentTop() {
            r1 = this;
            com.google.android.material.carousel.CarouselOrientationHelper r0 = r1.orientationHelper
            int r0 = r0.getParentTop()
            return r0
    }

    private int getScrollOffsetForPosition(int r4, com.google.android.material.carousel.KeylineState r5) {
            r3 = this;
            boolean r0 = r3.isLayoutRtl()
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == 0) goto L24
            int r0 = r3.getContainerSize()
            float r0 = (float) r0
            com.google.android.material.carousel.KeylineState$Keyline r2 = r5.getLastFocalKeyline()
            float r2 = r2.loc
            float r0 = r0 - r2
            float r4 = (float) r4
            float r2 = r5.getItemSize()
            float r4 = r4 * r2
            float r0 = r0 - r4
            float r4 = r5.getItemSize()
            float r4 = r4 / r1
            float r0 = r0 - r4
            int r4 = (int) r0
            return r4
        L24:
            float r4 = (float) r4
            float r0 = r5.getItemSize()
            float r4 = r4 * r0
            com.google.android.material.carousel.KeylineState$Keyline r0 = r5.getFirstFocalKeyline()
            float r0 = r0.loc
            float r4 = r4 - r0
            float r5 = r5.getItemSize()
            float r5 = r5 / r1
            float r4 = r4 + r5
            int r4 = (int) r4
            return r4
    }

    private static com.google.android.material.carousel.CarouselLayoutManager.KeylineRange getSurroundingKeylineRange(java.util.List<com.google.android.material.carousel.KeylineState.Keyline> r13, float r14, boolean r15) {
            r0 = -1
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r2 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r3 = 0
            r2 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r3 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r4 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r5 = 0
            r6 = -1
            r7 = -1
            r8 = -1
            r9 = -1
        L16:
            int r10 = r13.size()
            if (r5 >= r10) goto L52
            java.lang.Object r10 = r13.get(r5)
            com.google.android.material.carousel.KeylineState$Keyline r10 = (com.google.android.material.carousel.KeylineState.Keyline) r10
            if (r15 == 0) goto L27
            float r10 = r10.locOffset
            goto L29
        L27:
            float r10 = r10.loc
        L29:
            float r11 = r10 - r14
            float r11 = java.lang.Math.abs(r11)
            int r12 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r12 > 0) goto L39
            int r12 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r12 > 0) goto L39
            r6 = r5
            r1 = r11
        L39:
            int r12 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r12 <= 0) goto L43
            int r12 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r12 > 0) goto L43
            r8 = r5
            r2 = r11
        L43:
            int r11 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r11 > 0) goto L49
            r7 = r5
            r3 = r10
        L49:
            int r11 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r11 <= 0) goto L4f
            r9 = r5
            r4 = r10
        L4f:
            int r5 = r5 + 1
            goto L16
        L52:
            if (r6 != r0) goto L55
            r6 = r7
        L55:
            if (r8 != r0) goto L58
            r8 = r9
        L58:
            com.google.android.material.carousel.CarouselLayoutManager$KeylineRange r14 = new com.google.android.material.carousel.CarouselLayoutManager$KeylineRange
            java.lang.Object r15 = r13.get(r6)
            com.google.android.material.carousel.KeylineState$Keyline r15 = (com.google.android.material.carousel.KeylineState.Keyline) r15
            java.lang.Object r13 = r13.get(r8)
            com.google.android.material.carousel.KeylineState$Keyline r13 = (com.google.android.material.carousel.KeylineState.Keyline) r13
            r14.<init>(r15, r13)
            return r14
    }

    private boolean isLocOffsetOutOfFillBoundsEnd(float r3, com.google.android.material.carousel.CarouselLayoutManager.KeylineRange r4) {
            r2 = this;
            float r4 = r2.getMaskedItemSizeForLocOffset(r3, r4)
            int r3 = (int) r3
            r0 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r0
            int r4 = (int) r4
            int r3 = r2.addStart(r3, r4)
            boolean r4 = r2.isLayoutRtl()
            r0 = 0
            r1 = 1
            if (r4 == 0) goto L19
            if (r3 >= 0) goto L18
            return r1
        L18:
            return r0
        L19:
            int r4 = r2.getContainerSize()
            if (r3 <= r4) goto L20
            return r1
        L20:
            return r0
    }

    private boolean isLocOffsetOutOfFillBoundsStart(float r3, com.google.android.material.carousel.CarouselLayoutManager.KeylineRange r4) {
            r2 = this;
            float r4 = r2.getMaskedItemSizeForLocOffset(r3, r4)
            int r3 = (int) r3
            r0 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r0
            int r4 = (int) r4
            int r3 = r2.addEnd(r3, r4)
            boolean r4 = r2.isLayoutRtl()
            r0 = 0
            r1 = 1
            if (r4 == 0) goto L1d
            int r4 = r2.getContainerSize()
            if (r3 <= r4) goto L1c
            return r1
        L1c:
            return r0
        L1d:
            if (r3 >= 0) goto L20
            return r1
        L20:
            return r0
    }

    private void logChildrenIfDebugging() {
            r2 = this;
            boolean r0 = r2.isDebuggingEnabled
            if (r0 != 0) goto L5
            goto L22
        L5:
            java.lang.String r0 = "CarouselLayoutManager"
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            if (r0 == 0) goto L22
            r0 = 0
        Lf:
            int r1 = r2.getChildCount()
            if (r0 >= r1) goto L22
            android.view.View r1 = r2.getChildAt(r0)
            r2.getDecoratedCenterXWithMargins(r1)
            r2.getPosition(r1)
            int r0 = r0 + 1
            goto Lf
        L22:
            return
    }

    private com.google.android.material.carousel.CarouselLayoutManager.ChildCalculations makeChildCalculations(androidx.recyclerview.widget.RecyclerView.Recycler r3, float r4, int r5) {
            r2 = this;
            com.google.android.material.carousel.KeylineState r0 = r2.currentKeylineState
            float r0 = r0.getItemSize()
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            android.view.View r3 = r3.getViewForPosition(r5)
            r5 = 0
            r2.measureChildWithMargins(r3, r5, r5)
            int r4 = (int) r4
            int r0 = (int) r0
            int r4 = r2.addEnd(r4, r0)
            com.google.android.material.carousel.KeylineState r0 = r2.currentKeylineState
            java.util.List r0 = r0.getKeylines()
            float r4 = (float) r4
            com.google.android.material.carousel.CarouselLayoutManager$KeylineRange r5 = getSurroundingKeylineRange(r0, r4, r5)
            float r0 = r2.calculateChildOffsetCenterForLocation(r3, r4, r5)
            com.google.android.material.carousel.CarouselLayoutManager$ChildCalculations r1 = new com.google.android.material.carousel.CarouselLayoutManager$ChildCalculations
            r1.<init>(r3, r4, r0, r5)
            return r1
    }

    private void offsetChild(android.view.View r3, float r4, float r5, android.graphics.Rect r6) {
            r2 = this;
            int r4 = (int) r4
            int r0 = (int) r5
            int r4 = r2.addEnd(r4, r0)
            com.google.android.material.carousel.KeylineState r0 = r2.currentKeylineState
            java.util.List r0 = r0.getKeylines()
            float r4 = (float) r4
            r1 = 0
            com.google.android.material.carousel.CarouselLayoutManager$KeylineRange r0 = getSurroundingKeylineRange(r0, r4, r1)
            float r1 = r2.calculateChildOffsetCenterForLocation(r3, r4, r0)
            super.getDecoratedBoundsWithMargins(r3, r6)
            r2.updateChildMaskForLocation(r3, r4, r0)
            com.google.android.material.carousel.CarouselOrientationHelper r4 = r2.orientationHelper
            r4.offsetChild(r3, r6, r5, r1)
            return
    }

    private void refreshKeylineState() {
            r1 = this;
            r0 = 0
            r1.keylineStateList = r0
            r1.requestLayout()
            return
    }

    private void removeAndRecycleOutOfBoundsViews(androidx.recyclerview.widget.RecyclerView.Recycler r5) {
            r4 = this;
        L0:
            int r0 = r4.getChildCount()
            r1 = 1
            if (r0 <= 0) goto L24
            r0 = 0
            android.view.View r0 = r4.getChildAt(r0)
            float r2 = r4.getDecoratedCenterXWithMargins(r0)
            com.google.android.material.carousel.KeylineState r3 = r4.currentKeylineState
            java.util.List r3 = r3.getKeylines()
            com.google.android.material.carousel.CarouselLayoutManager$KeylineRange r3 = getSurroundingKeylineRange(r3, r2, r1)
            boolean r2 = r4.isLocOffsetOutOfFillBoundsStart(r2, r3)
            if (r2 == 0) goto L24
            r4.removeAndRecycleView(r0, r5)
            goto L0
        L24:
            int r0 = r4.getChildCount()
            int r0 = r0 - r1
            if (r0 < 0) goto L4c
            int r0 = r4.getChildCount()
            int r0 = r0 - r1
            android.view.View r0 = r4.getChildAt(r0)
            float r2 = r4.getDecoratedCenterXWithMargins(r0)
            com.google.android.material.carousel.KeylineState r3 = r4.currentKeylineState
            java.util.List r3 = r3.getKeylines()
            com.google.android.material.carousel.CarouselLayoutManager$KeylineRange r3 = getSurroundingKeylineRange(r3, r2, r1)
            boolean r2 = r4.isLocOffsetOutOfFillBoundsEnd(r2, r3)
            if (r2 == 0) goto L4c
            r4.removeAndRecycleView(r0, r5)
            goto L24
        L4c:
            return
    }

    private int scrollBy(int r7, androidx.recyclerview.widget.RecyclerView.Recycler r8, androidx.recyclerview.widget.RecyclerView.State r9) {
            r6 = this;
            int r0 = r6.getChildCount()
            r1 = 0
            if (r0 == 0) goto L56
            if (r7 != 0) goto La
            goto L56
        La:
            int r0 = r6.scrollOffset
            int r2 = r6.minScroll
            int r3 = r6.maxScroll
            int r7 = calculateShouldScrollBy(r7, r0, r2, r3)
            int r0 = r6.scrollOffset
            int r0 = r0 + r7
            r6.scrollOffset = r0
            r6.updateCurrentKeylineStateForScrollOffset()
            com.google.android.material.carousel.KeylineState r0 = r6.currentKeylineState
            float r0 = r0.getItemSize()
            r2 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r2
            android.view.View r2 = r6.getChildAt(r1)
            int r2 = r6.getPosition(r2)
            int r2 = r6.calculateChildStartForFill(r2)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
        L36:
            int r4 = r6.getChildCount()
            if (r1 >= r4) goto L52
            android.view.View r4 = r6.getChildAt(r1)
            float r5 = (float) r2
            r6.offsetChild(r4, r5, r0, r3)
            com.google.android.material.carousel.KeylineState r4 = r6.currentKeylineState
            float r4 = r4.getItemSize()
            int r4 = (int) r4
            int r2 = r6.addEnd(r2, r4)
            int r1 = r1 + 1
            goto L36
        L52:
            r6.fill(r8, r9)
            return r7
        L56:
            return r1
    }

    private void updateChildMaskForLocation(android.view.View r9, float r10, com.google.android.material.carousel.CarouselLayoutManager.KeylineRange r11) {
            r8 = this;
            boolean r0 = r9 instanceof com.google.android.material.carousel.Maskable
            if (r0 != 0) goto L5
            return
        L5:
            com.google.android.material.carousel.KeylineState$Keyline r0 = r11.leftOrTop
            float r1 = r0.mask
            com.google.android.material.carousel.KeylineState$Keyline r2 = r11.rightOrBottom
            float r3 = r2.mask
            float r0 = r0.loc
            float r2 = r2.loc
            float r0 = com.google.android.material.animation.AnimationUtils.lerp(r1, r3, r0, r2, r10)
            int r1 = r9.getHeight()
            float r1 = (float) r1
            int r2 = r9.getWidth()
            float r2 = (float) r2
            r3 = 1073741824(0x40000000, float:2.0)
            float r4 = r2 / r3
            r5 = 0
            r6 = 1065353216(0x3f800000, float:1.0)
            float r4 = com.google.android.material.animation.AnimationUtils.lerp(r5, r4, r5, r6, r0)
            float r7 = r1 / r3
            float r0 = com.google.android.material.animation.AnimationUtils.lerp(r5, r7, r5, r6, r0)
            com.google.android.material.carousel.CarouselOrientationHelper r5 = r8.orientationHelper
            android.graphics.RectF r0 = r5.getMaskRect(r1, r2, r0, r4)
            float r10 = r8.calculateChildOffsetCenterForLocation(r9, r10, r11)
            float r11 = r0.height()
            float r11 = r11 / r3
            float r11 = r10 - r11
            float r1 = r0.height()
            float r1 = r1 / r3
            float r1 = r1 + r10
            float r2 = r0.width()
            float r2 = r2 / r3
            float r2 = r10 - r2
            float r4 = r0.width()
            float r4 = r4 / r3
            float r10 = r10 + r4
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>(r2, r11, r10, r1)
            android.graphics.RectF r10 = new android.graphics.RectF
            int r11 = r8.getParentLeft()
            float r11 = (float) r11
            int r1 = r8.getParentTop()
            float r1 = (float) r1
            int r2 = r8.getParentRight()
            float r2 = (float) r2
            int r4 = r8.getParentBottom()
            float r4 = (float) r4
            r10.<init>(r11, r1, r2, r4)
            com.google.android.material.carousel.CarouselStrategy r11 = r8.carouselStrategy
            boolean r11 = r11.isContained()
            if (r11 == 0) goto L7f
            com.google.android.material.carousel.CarouselOrientationHelper r11 = r8.orientationHelper
            r11.containMaskWithinBounds(r0, r3, r10)
        L7f:
            com.google.android.material.carousel.CarouselOrientationHelper r11 = r8.orientationHelper
            r11.moveMaskOnEdgeOutsideBounds(r0, r3, r10)
            com.google.android.material.carousel.Maskable r9 = (com.google.android.material.carousel.Maskable) r9
            r9.setMaskRectF(r0)
            return
    }

    private void updateCurrentKeylineStateForScrollOffset() {
            r4 = this;
            int r0 = r4.maxScroll
            int r1 = r4.minScroll
            if (r0 > r1) goto L1c
            boolean r0 = r4.isLayoutRtl()
            if (r0 == 0) goto L13
            com.google.android.material.carousel.KeylineStateList r0 = r4.keylineStateList
            com.google.android.material.carousel.KeylineState r0 = r0.getEndState()
            goto L19
        L13:
            com.google.android.material.carousel.KeylineStateList r0 = r4.keylineStateList
            com.google.android.material.carousel.KeylineState r0 = r0.getStartState()
        L19:
            r4.currentKeylineState = r0
            goto L29
        L1c:
            com.google.android.material.carousel.KeylineStateList r2 = r4.keylineStateList
            int r3 = r4.scrollOffset
            float r3 = (float) r3
            float r1 = (float) r1
            float r0 = (float) r0
            com.google.android.material.carousel.KeylineState r0 = r2.getShiftedState(r3, r1, r0)
            r4.currentKeylineState = r0
        L29:
            com.google.android.material.carousel.CarouselLayoutManager$DebugItemDecoration r0 = r4.debugItemDecoration
            com.google.android.material.carousel.KeylineState r1 = r4.currentKeylineState
            java.util.List r1 = r1.getKeylines()
            r0.setKeylines(r1)
            return
    }

    private void validateChildOrderIfDebugging() {
            r7 = this;
            boolean r0 = r7.isDebuggingEnabled
            if (r0 == 0) goto L5f
            int r0 = r7.getChildCount()
            r1 = 1
            if (r0 >= r1) goto Lc
            goto L5f
        Lc:
            r0 = 0
        Ld:
            int r2 = r7.getChildCount()
            int r2 = r2 - r1
            if (r0 >= r2) goto L5f
            android.view.View r2 = r7.getChildAt(r0)
            int r2 = r7.getPosition(r2)
            int r3 = r0 + 1
            android.view.View r4 = r7.getChildAt(r3)
            int r4 = r7.getPosition(r4)
            if (r2 > r4) goto L2a
            r0 = r3
            goto Ld
        L2a:
            r7.logChildrenIfDebugging()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Detected invalid child order. Child at index ["
            r5.append(r6)
            r5.append(r0)
            java.lang.String r0 = "] had adapter position ["
            r5.append(r0)
            r5.append(r2)
            java.lang.String r2 = "] and child at index ["
            r5.append(r2)
            r5.append(r3)
            r5.append(r0)
            r5.append(r4)
            java.lang.String r0 = "]."
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            r1.<init>(r0)
            throw r1
        L5f:
            return
    }

    int calculateScrollDeltaToMakePositionVisible(int r2) {
            r1 = this;
            com.google.android.material.carousel.KeylineState r0 = r1.getKeylineStateForPosition(r2)
            int r2 = r1.getScrollOffsetForPosition(r2, r0)
            float r2 = (float) r2
            int r0 = r1.scrollOffset
            float r0 = (float) r0
            float r0 = r0 - r2
            int r2 = (int) r0
            return r2
    }

    public boolean canScrollHorizontally() {
            r1 = this;
            boolean r0 = r1.isHorizontal()
            return r0
    }

    public boolean canScrollVertically() {
            r1 = this;
            boolean r0 = r1.isHorizontal()
            r0 = r0 ^ 1
            return r0
    }

    public int computeHorizontalScrollExtent(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r1) {
            r0 = this;
            com.google.android.material.carousel.KeylineStateList r1 = r0.keylineStateList
            com.google.android.material.carousel.KeylineState r1 = r1.getDefaultState()
            float r1 = r1.getItemSize()
            int r1 = (int) r1
            return r1
    }

    public int computeHorizontalScrollOffset(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r1) {
            r0 = this;
            int r1 = r0.scrollOffset
            return r1
    }

    public int computeHorizontalScrollRange(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r2) {
            r1 = this;
            int r2 = r1.maxScroll
            int r0 = r1.minScroll
            int r2 = r2 - r0
            return r2
    }

    @androidx.annotation.Nullable
    public android.graphics.PointF computeScrollVectorForPosition(int r3) {
            r2 = this;
            com.google.android.material.carousel.KeylineStateList r0 = r2.keylineStateList
            if (r0 != 0) goto L6
            r3 = 0
            return r3
        L6:
            com.google.android.material.carousel.KeylineState r0 = r2.getKeylineStateForPosition(r3)
            int r3 = r2.getOffsetToScrollToPosition(r3, r0)
            boolean r0 = r2.isHorizontal()
            r1 = 0
            if (r0 == 0) goto L1c
            android.graphics.PointF r0 = new android.graphics.PointF
            float r3 = (float) r3
            r0.<init>(r3, r1)
            return r0
        L1c:
            android.graphics.PointF r0 = new android.graphics.PointF
            float r3 = (float) r3
            r0.<init>(r1, r3)
            return r0
    }

    public int computeVerticalScrollExtent(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r1) {
            r0 = this;
            com.google.android.material.carousel.KeylineStateList r1 = r0.keylineStateList
            com.google.android.material.carousel.KeylineState r1 = r1.getDefaultState()
            float r1 = r1.getItemSize()
            int r1 = (int) r1
            return r1
    }

    public int computeVerticalScrollOffset(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r1) {
            r0 = this;
            int r1 = r0.scrollOffset
            return r1
    }

    public int computeVerticalScrollRange(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r2) {
            r1 = this;
            int r2 = r1.maxScroll
            int r0 = r1.minScroll
            int r2 = r2 - r0
            return r2
    }

    public androidx.recyclerview.widget.RecyclerView.LayoutParams generateDefaultLayoutParams() {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutParams r0 = new androidx.recyclerview.widget.RecyclerView$LayoutParams
            r1 = -2
            r0.<init>(r1, r1)
            return r0
    }

    @Override // com.google.android.material.carousel.Carousel
    public int getContainerHeight() {
            r1 = this;
            int r0 = r1.getHeight()
            return r0
    }

    @Override // com.google.android.material.carousel.Carousel
    public int getContainerWidth() {
            r1 = this;
            int r0 = r1.getWidth()
            return r0
    }

    public void getDecoratedBoundsWithMargins(@androidx.annotation.NonNull android.view.View r4, @androidx.annotation.NonNull android.graphics.Rect r5) {
            r3 = this;
            super.getDecoratedBoundsWithMargins(r4, r5)
            int r4 = r5.centerX()
            float r4 = (float) r4
            com.google.android.material.carousel.KeylineState r0 = r3.currentKeylineState
            java.util.List r0 = r0.getKeylines()
            r1 = 1
            com.google.android.material.carousel.CarouselLayoutManager$KeylineRange r0 = getSurroundingKeylineRange(r0, r4, r1)
            float r4 = r3.getMaskedItemSizeForLocOffset(r4, r0)
            int r0 = r5.width()
            float r0 = (float) r0
            float r0 = r0 - r4
            r4 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r4
            int r4 = r5.left
            float r4 = (float) r4
            float r4 = r4 + r0
            int r4 = (int) r4
            int r1 = r5.top
            int r2 = r5.right
            float r2 = (float) r2
            float r2 = r2 - r0
            int r0 = (int) r2
            int r2 = r5.bottom
            r5.set(r4, r1, r0, r2)
            return
    }

    int getOffsetToScrollToPosition(int r1, @androidx.annotation.NonNull com.google.android.material.carousel.KeylineState r2) {
            r0 = this;
            int r1 = r0.getScrollOffsetForPosition(r1, r2)
            int r2 = r0.scrollOffset
            int r1 = r1 - r2
            return r1
    }

    int getOffsetToScrollToPositionForSnap(int r6, boolean r7) {
            r5 = this;
            com.google.android.material.carousel.KeylineStateList r0 = r5.keylineStateList
            int r1 = r5.scrollOffset
            float r1 = (float) r1
            int r2 = r5.minScroll
            float r2 = (float) r2
            int r3 = r5.maxScroll
            float r3 = (float) r3
            r4 = 1
            com.google.android.material.carousel.KeylineState r0 = r0.getShiftedState(r1, r2, r3, r4)
            int r0 = r5.getOffsetToScrollToPosition(r6, r0)
            java.util.Map<java.lang.Integer, com.google.android.material.carousel.KeylineState> r1 = r5.keylineStatePositionMap
            if (r1 == 0) goto L21
            com.google.android.material.carousel.KeylineState r1 = r5.getKeylineStateForPosition(r6)
            int r6 = r5.getOffsetToScrollToPosition(r6, r1)
            goto L22
        L21:
            r6 = r0
        L22:
            if (r7 == 0) goto L2f
            int r7 = java.lang.Math.abs(r6)
            int r1 = java.lang.Math.abs(r0)
            if (r7 >= r1) goto L2f
            return r6
        L2f:
            return r0
    }

    public int getOrientation() {
            r1 = this;
            com.google.android.material.carousel.CarouselOrientationHelper r0 = r1.orientationHelper
            int r0 = r0.orientation
            return r0
    }

    @Override // com.google.android.material.carousel.Carousel
    public boolean isHorizontal() {
            r1 = this;
            com.google.android.material.carousel.CarouselOrientationHelper r0 = r1.orientationHelper
            int r0 = r0.orientation
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    boolean isLayoutRtl() {
            r2 = this;
            boolean r0 = r2.isHorizontal()
            if (r0 == 0) goto Le
            int r0 = r2.getLayoutDirection()
            r1 = 1
            if (r0 != r1) goto Le
            return r1
        Le:
            r0 = 0
            return r0
    }

    public void measureChildWithMargins(@androidx.annotation.NonNull android.view.View r8, int r9, int r10) {
            r7 = this;
            boolean r0 = r8 instanceof com.google.android.material.carousel.Maskable
            if (r0 == 0) goto L91
            android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$LayoutParams r0 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r0
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r7.calculateItemDecorationsForChild(r8, r1)
            int r2 = r1.left
            int r3 = r1.right
            int r2 = r2 + r3
            int r9 = r9 + r2
            int r2 = r1.top
            int r1 = r1.bottom
            int r2 = r2 + r1
            int r10 = r10 + r2
            com.google.android.material.carousel.KeylineStateList r1 = r7.keylineStateList
            if (r1 == 0) goto L31
            com.google.android.material.carousel.CarouselOrientationHelper r2 = r7.orientationHelper
            int r2 = r2.orientation
            if (r2 != 0) goto L31
            com.google.android.material.carousel.KeylineState r1 = r1.getDefaultState()
            float r1 = r1.getItemSize()
            goto L34
        L31:
            int r1 = r0.width
            float r1 = (float) r1
        L34:
            com.google.android.material.carousel.KeylineStateList r2 = r7.keylineStateList
            if (r2 == 0) goto L48
            com.google.android.material.carousel.CarouselOrientationHelper r3 = r7.orientationHelper
            int r3 = r3.orientation
            r4 = 1
            if (r3 != r4) goto L48
            com.google.android.material.carousel.KeylineState r2 = r2.getDefaultState()
            float r2 = r2.getItemSize()
            goto L4b
        L48:
            int r2 = r0.height
            float r2 = (float) r2
        L4b:
            int r3 = r7.getWidth()
            int r4 = r7.getWidthMode()
            int r5 = r7.getPaddingLeft()
            int r6 = r7.getPaddingRight()
            int r5 = r5 + r6
            int r6 = r0.leftMargin
            int r5 = r5 + r6
            int r6 = r0.rightMargin
            int r5 = r5 + r6
            int r5 = r5 + r9
            int r9 = (int) r1
            boolean r1 = r7.canScrollHorizontally()
            int r9 = androidx.recyclerview.widget.RecyclerView.LayoutManager.getChildMeasureSpec(r3, r4, r5, r9, r1)
            int r1 = r7.getHeight()
            int r3 = r7.getHeightMode()
            int r4 = r7.getPaddingTop()
            int r5 = r7.getPaddingBottom()
            int r4 = r4 + r5
            int r5 = r0.topMargin
            int r4 = r4 + r5
            int r0 = r0.bottomMargin
            int r4 = r4 + r0
            int r4 = r4 + r10
            int r10 = (int) r2
            boolean r0 = r7.canScrollVertically()
            int r10 = androidx.recyclerview.widget.RecyclerView.LayoutManager.getChildMeasureSpec(r1, r3, r4, r10, r0)
            r8.measure(r9, r10)
            return
        L91:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup."
            r8.<init>(r9)
            throw r8
    }

    public void onInitializeAccessibilityEvent(@androidx.annotation.NonNull android.view.accessibility.AccessibilityEvent r2) {
            r1 = this;
            super.onInitializeAccessibilityEvent(r2)
            int r0 = r1.getChildCount()
            if (r0 <= 0) goto L26
            r0 = 0
            android.view.View r0 = r1.getChildAt(r0)
            int r0 = r1.getPosition(r0)
            r2.setFromIndex(r0)
            int r0 = r1.getChildCount()
            int r0 = r0 + (-1)
            android.view.View r0 = r1.getChildAt(r0)
            int r0 = r1.getPosition(r0)
            r2.setToIndex(r0)
        L26:
            return
    }

    public void onLayoutChildren(androidx.recyclerview.widget.RecyclerView.Recycler r7, androidx.recyclerview.widget.RecyclerView.State r8) {
            r6 = this;
            int r0 = r8.getItemCount()
            r1 = 0
            if (r0 > 0) goto Ld
            r6.removeAndRecycleAllViews(r7)
            r6.currentFillStartPosition = r1
            return
        Ld:
            boolean r0 = r6.isLayoutRtl()
            com.google.android.material.carousel.KeylineStateList r2 = r6.keylineStateList
            if (r2 != 0) goto L17
            r2 = 1
            goto L18
        L17:
            r2 = 0
        L18:
            if (r2 == 0) goto L33
            android.view.View r3 = r7.getViewForPosition(r1)
            r6.measureChildWithMargins(r3, r1, r1)
            com.google.android.material.carousel.CarouselStrategy r4 = r6.carouselStrategy
            com.google.android.material.carousel.KeylineState r3 = r4.onFirstChildMeasuredWithMargins(r6, r3)
            if (r0 == 0) goto L2d
            com.google.android.material.carousel.KeylineState r3 = com.google.android.material.carousel.KeylineState.reverse(r3)
        L2d:
            com.google.android.material.carousel.KeylineStateList r3 = com.google.android.material.carousel.KeylineStateList.from(r6, r3)
            r6.keylineStateList = r3
        L33:
            com.google.android.material.carousel.KeylineStateList r3 = r6.keylineStateList
            int r3 = r6.calculateStartScroll(r3)
            com.google.android.material.carousel.KeylineStateList r4 = r6.keylineStateList
            int r4 = r6.calculateEndScroll(r8, r4)
            if (r0 == 0) goto L43
            r5 = r4
            goto L44
        L43:
            r5 = r3
        L44:
            r6.minScroll = r5
            if (r0 == 0) goto L49
            r4 = r3
        L49:
            r6.maxScroll = r4
            if (r2 == 0) goto L64
            r6.scrollOffset = r3
            com.google.android.material.carousel.KeylineStateList r0 = r6.keylineStateList
            int r2 = r6.getItemCount()
            int r3 = r6.minScroll
            int r4 = r6.maxScroll
            boolean r5 = r6.isLayoutRtl()
            java.util.Map r0 = r0.getKeylineStateForPositionMap(r2, r3, r4, r5)
            r6.keylineStatePositionMap = r0
            goto L6d
        L64:
            int r0 = r6.scrollOffset
            int r2 = calculateShouldScrollBy(r1, r0, r5, r4)
            int r0 = r0 + r2
            r6.scrollOffset = r0
        L6d:
            int r0 = r6.currentFillStartPosition
            int r2 = r8.getItemCount()
            int r0 = androidx.core.math.MathUtils.clamp(r0, r1, r2)
            r6.currentFillStartPosition = r0
            r6.updateCurrentKeylineStateForScrollOffset()
            r6.detachAndScrapAttachedViews(r7)
            r6.fill(r7, r8)
            return
    }

    public void onLayoutCompleted(androidx.recyclerview.widget.RecyclerView.State r2) {
            r1 = this;
            super.onLayoutCompleted(r2)
            int r2 = r1.getChildCount()
            r0 = 0
            if (r2 != 0) goto Ld
            r1.currentFillStartPosition = r0
            goto L17
        Ld:
            android.view.View r2 = r1.getChildAt(r0)
            int r2 = r1.getPosition(r2)
            r1.currentFillStartPosition = r2
        L17:
            r1.validateChildOrderIfDebugging()
            return
    }

    public boolean requestChildRectangleOnScreen(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r1, @androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull android.graphics.Rect r3, boolean r4, boolean r5) {
            r0 = this;
            com.google.android.material.carousel.KeylineStateList r3 = r0.keylineStateList
            r4 = 0
            if (r3 != 0) goto L6
            return r4
        L6:
            int r3 = r0.getPosition(r2)
            int r2 = r0.getPosition(r2)
            com.google.android.material.carousel.KeylineState r2 = r0.getKeylineStateForPosition(r2)
            int r2 = r0.getOffsetToScrollToPosition(r3, r2)
            if (r5 != 0) goto L1f
            if (r2 == 0) goto L1f
            r1.scrollBy(r2, r4)
            r1 = 1
            return r1
        L1f:
            return r4
    }

    public int scrollHorizontallyBy(int r2, androidx.recyclerview.widget.RecyclerView.Recycler r3, androidx.recyclerview.widget.RecyclerView.State r4) {
            r1 = this;
            boolean r0 = r1.canScrollHorizontally()
            if (r0 == 0) goto Lb
            int r2 = r1.scrollBy(r2, r3, r4)
            return r2
        Lb:
            r2 = 0
            return r2
    }

    public void scrollToPosition(int r3) {
            r2 = this;
            com.google.android.material.carousel.KeylineStateList r0 = r2.keylineStateList
            if (r0 != 0) goto L5
            return
        L5:
            com.google.android.material.carousel.KeylineState r0 = r2.getKeylineStateForPosition(r3)
            int r0 = r2.getScrollOffsetForPosition(r3, r0)
            r2.scrollOffset = r0
            int r0 = r2.getItemCount()
            int r0 = r0 + (-1)
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)
            int r3 = androidx.core.math.MathUtils.clamp(r3, r1, r0)
            r2.currentFillStartPosition = r3
            r2.updateCurrentKeylineStateForScrollOffset()
            r2.requestLayout()
            return
    }

    public int scrollVerticallyBy(int r2, androidx.recyclerview.widget.RecyclerView.Recycler r3, androidx.recyclerview.widget.RecyclerView.State r4) {
            r1 = this;
            boolean r0 = r1.canScrollVertically()
            if (r0 == 0) goto Lb
            int r2 = r1.scrollBy(r2, r3, r4)
            return r2
        Lb:
            r2 = 0
            return r2
    }

    public void setCarouselStrategy(@androidx.annotation.NonNull com.google.android.material.carousel.CarouselStrategy r1) {
            r0 = this;
            r0.carouselStrategy = r1
            r0.refreshKeylineState()
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void setDebuggingEnabled(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r2, boolean r3) {
            r1 = this;
            r1.isDebuggingEnabled = r3
            com.google.android.material.carousel.CarouselLayoutManager$DebugItemDecoration r0 = r1.debugItemDecoration
            r2.removeItemDecoration(r0)
            if (r3 == 0) goto Le
            com.google.android.material.carousel.CarouselLayoutManager$DebugItemDecoration r3 = r1.debugItemDecoration
            r2.addItemDecoration(r3)
        Le:
            r2.invalidateItemDecorations()
            return
    }

    public void setOrientation(int r4) {
            r3 = this;
            if (r4 == 0) goto L1d
            r0 = 1
            if (r4 != r0) goto L6
            goto L1d
        L6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "invalid orientation:"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L1d:
            r0 = 0
            r3.assertNotInLayoutOrScroll(r0)
            com.google.android.material.carousel.CarouselOrientationHelper r0 = r3.orientationHelper
            if (r0 == 0) goto L2b
            int r0 = r0.orientation
            if (r4 == r0) goto L2a
            goto L2b
        L2a:
            return
        L2b:
            com.google.android.material.carousel.CarouselOrientationHelper r4 = com.google.android.material.carousel.CarouselOrientationHelper.createOrientationHelper(r3, r4)
            r3.orientationHelper = r4
            r3.refreshKeylineState()
            return
    }

    public void smoothScrollToPosition(androidx.recyclerview.widget.RecyclerView r1, androidx.recyclerview.widget.RecyclerView.State r2, int r3) {
            r0 = this;
            com.google.android.material.carousel.CarouselLayoutManager$1 r2 = new com.google.android.material.carousel.CarouselLayoutManager$1
            android.content.Context r1 = r1.getContext()
            r2.<init>(r0, r1)
            r2.setTargetPosition(r3)
            r0.startSmoothScroll(r2)
            return
    }
}
