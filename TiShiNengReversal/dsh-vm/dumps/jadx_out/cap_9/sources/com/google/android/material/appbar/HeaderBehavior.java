package com.google.android.material.appbar;

import android.view.View;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
abstract class HeaderBehavior<V extends android.view.View> extends com.google.android.material.appbar.ViewOffsetBehavior<V> {
    private static final int INVALID_POINTER = -1;
    private int activePointerId;

    @androidx.annotation.Nullable
    private java.lang.Runnable flingRunnable;
    private boolean isBeingDragged;
    private int lastMotionY;
    android.widget.OverScroller scroller;
    private int touchSlop;

    @androidx.annotation.Nullable
    private android.view.VelocityTracker velocityTracker;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class FlingRunnable implements java.lang.Runnable {
        private final V layout;
        private final androidx.coordinatorlayout.widget.CoordinatorLayout parent;
        final /* synthetic */ com.google.android.material.appbar.HeaderBehavior this$0;

        FlingRunnable(com.google.android.material.appbar.HeaderBehavior r1, androidx.coordinatorlayout.widget.CoordinatorLayout r2, V r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.parent = r2
                r0.layout = r3
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                V extends android.view.View r0 = r4.layout
                if (r0 == 0) goto L2e
                com.google.android.material.appbar.HeaderBehavior r0 = r4.this$0
                android.widget.OverScroller r0 = r0.scroller
                if (r0 == 0) goto L2e
                boolean r0 = r0.computeScrollOffset()
                if (r0 == 0) goto L25
                com.google.android.material.appbar.HeaderBehavior r0 = r4.this$0
                androidx.coordinatorlayout.widget.CoordinatorLayout r1 = r4.parent
                V extends android.view.View r2 = r4.layout
                android.widget.OverScroller r3 = r0.scroller
                int r3 = r3.getCurrY()
                r0.setHeaderTopBottomOffset(r1, r2, r3)
                V extends android.view.View r0 = r4.layout
                androidx.core.view.ViewCompat.postOnAnimation(r0, r4)
                return
            L25:
                com.google.android.material.appbar.HeaderBehavior r0 = r4.this$0
                androidx.coordinatorlayout.widget.CoordinatorLayout r1 = r4.parent
                V extends android.view.View r2 = r4.layout
                r0.onFlingFinished(r1, r2)
            L2e:
                return
        }
    }

    public HeaderBehavior() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.activePointerId = r0
            r1.touchSlop = r0
            return
    }

    public HeaderBehavior(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = -1
            r0.activePointerId = r1
            r0.touchSlop = r1
            return
    }

    private void ensureVelocityTracker() {
            r1 = this;
            android.view.VelocityTracker r0 = r1.velocityTracker
            if (r0 != 0) goto La
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r1.velocityTracker = r0
        La:
            return
    }

    boolean canDragView(V r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    final boolean fling(androidx.coordinatorlayout.widget.CoordinatorLayout r12, @androidx.annotation.NonNull V r13, int r14, int r15, float r16) {
            r11 = this;
            java.lang.Runnable r0 = r11.flingRunnable
            if (r0 == 0) goto La
            r13.removeCallbacks(r0)
            r0 = 0
            r11.flingRunnable = r0
        La:
            android.widget.OverScroller r0 = r11.scroller
            if (r0 != 0) goto L19
            android.widget.OverScroller r0 = new android.widget.OverScroller
            android.content.Context r1 = r13.getContext()
            r0.<init>(r1)
            r11.scroller = r0
        L19:
            android.widget.OverScroller r2 = r11.scroller
            int r4 = r11.getTopAndBottomOffset()
            int r6 = java.lang.Math.round(r16)
            r7 = 0
            r8 = 0
            r3 = 0
            r5 = 0
            r9 = r14
            r10 = r15
            r2.fling(r3, r4, r5, r6, r7, r8, r9, r10)
            android.widget.OverScroller r14 = r11.scroller
            boolean r14 = r14.computeScrollOffset()
            if (r14 == 0) goto L40
            com.google.android.material.appbar.HeaderBehavior$FlingRunnable r14 = new com.google.android.material.appbar.HeaderBehavior$FlingRunnable
            r14.<init>(r11, r12, r13)
            r11.flingRunnable = r14
            androidx.core.view.ViewCompat.postOnAnimation(r13, r14)
            r12 = 1
            return r12
        L40:
            r11.onFlingFinished(r12, r13)
            r12 = 0
            return r12
    }

    int getMaxDragOffset(@androidx.annotation.NonNull V r1) {
            r0 = this;
            int r1 = r1.getHeight()
            int r1 = -r1
            return r1
    }

    int getScrollRangeForDragFling(@androidx.annotation.NonNull V r1) {
            r0 = this;
            int r1 = r1.getHeight()
            return r1
    }

    int getTopBottomOffsetForScrollingSibling() {
            r1 = this;
            int r0 = r1.getTopAndBottomOffset()
            return r0
    }

    void onFlingFinished(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2) {
            r0 = this;
            return
    }

    public boolean onInterceptTouchEvent(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r7, @androidx.annotation.NonNull V r8, @androidx.annotation.NonNull android.view.MotionEvent r9) {
            r6 = this;
            int r0 = r6.touchSlop
            if (r0 >= 0) goto L12
            android.content.Context r0 = r7.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r6.touchSlop = r0
        L12:
            int r0 = r9.getActionMasked()
            r1 = 2
            r2 = 1
            r3 = -1
            r4 = 0
            if (r0 != r1) goto L40
            boolean r0 = r6.isBeingDragged
            if (r0 == 0) goto L40
            int r0 = r6.activePointerId
            if (r0 != r3) goto L25
            return r4
        L25:
            int r0 = r9.findPointerIndex(r0)
            if (r0 != r3) goto L2c
            return r4
        L2c:
            float r0 = r9.getY(r0)
            int r0 = (int) r0
            int r1 = r6.lastMotionY
            int r1 = r0 - r1
            int r1 = java.lang.Math.abs(r1)
            int r5 = r6.touchSlop
            if (r1 <= r5) goto L40
            r6.lastMotionY = r0
            return r2
        L40:
            int r0 = r9.getActionMasked()
            if (r0 != 0) goto L80
            r6.activePointerId = r3
            float r0 = r9.getX()
            int r0 = (int) r0
            float r1 = r9.getY()
            int r1 = (int) r1
            boolean r3 = r6.canDragView(r8)
            if (r3 == 0) goto L60
            boolean r7 = r7.isPointInChildBounds(r8, r0, r1)
            if (r7 == 0) goto L60
            r7 = 1
            goto L61
        L60:
            r7 = 0
        L61:
            r6.isBeingDragged = r7
            if (r7 == 0) goto L80
            r6.lastMotionY = r1
            int r7 = r9.getPointerId(r4)
            r6.activePointerId = r7
            r6.ensureVelocityTracker()
            android.widget.OverScroller r7 = r6.scroller
            if (r7 == 0) goto L80
            boolean r7 = r7.isFinished()
            if (r7 != 0) goto L80
            android.widget.OverScroller r7 = r6.scroller
            r7.abortAnimation()
            return r2
        L80:
            android.view.VelocityTracker r7 = r6.velocityTracker
            if (r7 == 0) goto L87
            r7.addMovement(r9)
        L87:
            return r4
    }

    public boolean onTouchEvent(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r10, @androidx.annotation.NonNull V r11, @androidx.annotation.NonNull android.view.MotionEvent r12) {
            r9 = this;
            int r1 = r12.getActionMasked()
            r6 = -1
            r7 = 0
            r8 = 1
            if (r1 == r8) goto L4d
            r3 = 2
            if (r1 == r3) goto L2d
            r2 = 3
            if (r1 == r2) goto L71
            r2 = 6
            if (r1 == r2) goto L13
            goto L4b
        L13:
            int r1 = r12.getActionIndex()
            if (r1 != 0) goto L1b
            r1 = 1
            goto L1c
        L1b:
            r1 = 0
        L1c:
            int r2 = r12.getPointerId(r1)
            r9.activePointerId = r2
            float r1 = r12.getY(r1)
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            int r1 = (int) r1
            r9.lastMotionY = r1
            goto L4b
        L2d:
            int r1 = r9.activePointerId
            int r1 = r12.findPointerIndex(r1)
            if (r1 != r6) goto L36
            return r7
        L36:
            float r1 = r12.getY(r1)
            int r1 = (int) r1
            int r3 = r9.lastMotionY
            int r3 = r3 - r1
            r9.lastMotionY = r1
            int r4 = r9.getMaxDragOffset(r11)
            r5 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r0.scroll(r1, r2, r3, r4, r5)
        L4b:
            r1 = 0
            goto L80
        L4d:
            android.view.VelocityTracker r1 = r9.velocityTracker
            if (r1 == 0) goto L71
            r1.addMovement(r12)
            android.view.VelocityTracker r1 = r9.velocityTracker
            r3 = 1000(0x3e8, float:1.401E-42)
            r1.computeCurrentVelocity(r3)
            android.view.VelocityTracker r1 = r9.velocityTracker
            int r3 = r9.activePointerId
            float r5 = r1.getYVelocity(r3)
            int r1 = r9.getScrollRangeForDragFling(r11)
            int r3 = -r1
            r4 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r0.fling(r1, r2, r3, r4, r5)
            r1 = 1
            goto L72
        L71:
            r1 = 0
        L72:
            r9.isBeingDragged = r7
            r9.activePointerId = r6
            android.view.VelocityTracker r2 = r9.velocityTracker
            if (r2 == 0) goto L80
            r2.recycle()
            r2 = 0
            r9.velocityTracker = r2
        L80:
            android.view.VelocityTracker r2 = r9.velocityTracker
            if (r2 == 0) goto L87
            r2.addMovement(r12)
        L87:
            boolean r2 = r9.isBeingDragged
            if (r2 != 0) goto L8f
            if (r1 == 0) goto L8e
            goto L8f
        L8e:
            return r7
        L8f:
            return r8
    }

    final int scroll(androidx.coordinatorlayout.widget.CoordinatorLayout r8, V r9, int r10, int r11, int r12) {
            r7 = this;
            int r0 = r7.getTopBottomOffsetForScrollingSibling()
            int r4 = r0 - r10
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r11
            r6 = r12
            int r8 = r1.setHeaderTopBottomOffset(r2, r3, r4, r5, r6)
            return r8
    }

    int setHeaderTopBottomOffset(androidx.coordinatorlayout.widget.CoordinatorLayout r7, V r8, int r9) {
            r6 = this;
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 2147483647(0x7fffffff, float:NaN)
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            int r7 = r0.setHeaderTopBottomOffset(r1, r2, r3, r4, r5)
            return r7
    }

    int setHeaderTopBottomOffset(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, int r3, int r4, int r5) {
            r0 = this;
            int r1 = r0.getTopAndBottomOffset()
            if (r4 == 0) goto L15
            if (r1 < r4) goto L15
            if (r1 > r5) goto L15
            int r2 = androidx.core.math.MathUtils.clamp(r3, r4, r5)
            if (r1 == r2) goto L15
            r0.setTopAndBottomOffset(r2)
            int r1 = r1 - r2
            return r1
        L15:
            r1 = 0
            return r1
    }
}
