package com.bxkj.student.common.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class TBLayout extends android.widget.LinearLayout {
    public static final int SCREEN_FOOTER = 12;
    public static final int SCREEN_HEADER = 11;
    private com.bxkj.student.common.view.TBLayout.OnPageChangedListener ctListener;
    private android.view.View mFooter;
    private android.view.View mHeader;
    private int mHeaderHeight;
    private int mLastInterceptY;
    private int mLastY;
    private int mTouchSlop;
    private com.bxkj.student.common.view.TBLayout.OnPullListener pullListener;
    private int screen;
    private android.widget.Scroller scroller;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnPageChangedListener {
        void onPageChanged(int r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnPullListener {
        boolean footerHeadReached(android.view.MotionEvent r1);

        boolean headerFootReached(android.view.MotionEvent r1);
    }

    public TBLayout(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.mTouchSlop = r1
            r1 = 11
            r0.screen = r1
            r0.init()
            return
    }

    public TBLayout(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.mTouchSlop = r1
            r1 = 11
            r0.screen = r1
            r0.init()
            return
    }

    @android.annotation.SuppressLint({"NewApi"})
    public TBLayout(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 0
            r0.mTouchSlop = r1
            r1 = 11
            r0.screen = r1
            r0.init()
            return
    }

    private void init() {
            r2 = this;
            android.widget.Scroller r0 = new android.widget.Scroller
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1)
            r2.scroller = r0
            android.content.Context r0 = r2.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r2.mTouchSlop = r0
            return
    }

    private void initData() {
            r2 = this;
            r0 = 2131298107(0x7f09073b, float:1.8214178E38)
            android.view.View r0 = r2.findViewById(r0)
            r2.mHeader = r0
            r0 = 2131298105(0x7f090739, float:1.8214174E38)
            android.view.View r0 = r2.findViewById(r0)
            r2.mFooter = r0
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.view.View r1 = r2.mHeader
            int r1 = r1.getMeasuredHeight()
            r2.mHeaderHeight = r1
            r0.height = r1
            android.view.View r1 = r2.mFooter
            r1.setLayoutParams(r0)
            return
    }

    @Override // android.view.View
    public void computeScroll() {
            r2 = this;
            android.widget.Scroller r0 = r2.scroller
            boolean r0 = r0.computeScrollOffset()
            if (r0 == 0) goto L1a
            android.widget.Scroller r0 = r2.scroller
            int r0 = r0.getCurrX()
            android.widget.Scroller r1 = r2.scroller
            int r1 = r1.getCurrY()
            r2.scrollTo(r0, r1)
            r2.postInvalidate()
        L1a:
            return
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
            r6 = this;
            float r0 = r7.getY()
            int r0 = (int) r0
            int r1 = r7.getAction()
            r2 = 0
            if (r1 == 0) goto L44
            r3 = 1
            if (r1 == r3) goto L41
            r4 = 2
            if (r1 == r4) goto L13
            goto L40
        L13:
            int r1 = r6.mLastInterceptY
            int r0 = r0 - r1
            int r1 = r6.mTouchSlop
            if (r0 <= r1) goto L2c
            int r4 = r6.screen
            r5 = 12
            if (r4 != r5) goto L2c
            com.bxkj.student.common.view.TBLayout$OnPullListener r0 = r6.pullListener
            if (r0 == 0) goto L2b
            boolean r7 = r0.footerHeadReached(r7)
            if (r7 == 0) goto L2b
            return r3
        L2b:
            return r2
        L2c:
            int r1 = -r1
            if (r0 >= r1) goto L40
            int r0 = r6.screen
            r1 = 11
            if (r0 != r1) goto L40
            com.bxkj.student.common.view.TBLayout$OnPullListener r0 = r6.pullListener
            if (r0 == 0) goto L40
            boolean r7 = r0.headerFootReached(r7)
            if (r7 == 0) goto L40
            return r3
        L40:
            return r2
        L41:
            r6.mLastInterceptY = r2
            return r2
        L44:
            r6.mLastY = r0
            r6.mLastInterceptY = r0
            return r2
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r12) {
            r11 = this;
            float r0 = r12.getY()
            int r0 = (int) r0
            int r12 = r12.getAction()
            r1 = 12
            r2 = 11
            r3 = 0
            r4 = 1
            if (r12 == r4) goto L3c
            r5 = 2
            if (r12 == r5) goto L16
            goto L87
        L16:
            int r12 = r11.mLastY
            int r0 = r0 - r12
            int r12 = r11.screen
            if (r12 == r2) goto L29
            if (r12 == r1) goto L20
            goto L87
        L20:
            if (r0 <= 0) goto L87
            int r12 = r11.mHeaderHeight
            int r12 = r12 - r0
            r11.scrollTo(r3, r12)
            goto L87
        L29:
            int r12 = -r0
            if (r12 >= 0) goto L2e
            r12 = 0
            goto L38
        L2e:
            int r0 = r11.getHeight()
            if (r12 <= r0) goto L38
            int r12 = r11.getHeight()
        L38:
            r11.scrollTo(r3, r12)
            goto L87
        L3c:
            int r12 = r11.screen
            if (r12 == r2) goto L4b
            if (r12 == r1) goto L44
            r12 = 0
            goto L4f
        L44:
            int r12 = r11.mHeaderHeight
            int r12 = r12 * 3
            int r12 = r12 / 4
            goto L4f
        L4b:
            int r12 = r11.mHeaderHeight
            int r12 = r12 / 4
        L4f:
            int r7 = r11.getScrollY()
            if (r7 <= r12) goto L6f
            android.widget.Scroller r5 = r11.scroller
            int r12 = r11.mHeaderHeight
            int r9 = r12 - r7
            r10 = 150(0x96, float:2.1E-43)
            r6 = 0
            r8 = 0
            r5.startScroll(r6, r7, r8, r9, r10)
            r11.screen = r1
            com.bxkj.student.common.view.TBLayout$OnPageChangedListener r12 = r11.ctListener
            if (r12 == 0) goto L6b
            r12.onPageChanged(r1)
        L6b:
            r11.postInvalidate()
            goto L85
        L6f:
            android.widget.Scroller r5 = r11.scroller
            int r9 = -r7
            r10 = 150(0x96, float:2.1E-43)
            r6 = 0
            r8 = 0
            r5.startScroll(r6, r7, r8, r9, r10)
            r11.screen = r2
            com.bxkj.student.common.view.TBLayout$OnPageChangedListener r12 = r11.ctListener
            if (r12 == 0) goto L82
            r12.onPageChanged(r2)
        L82:
            r11.postInvalidate()
        L85:
            r11.mLastY = r3
        L87:
            return r4
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean r1) {
            r0 = this;
            super.onWindowFocusChanged(r1)
            if (r1 == 0) goto L10
            android.view.View r1 = r0.mHeader
            if (r1 != 0) goto L10
            android.view.View r1 = r0.mFooter
            if (r1 != 0) goto L10
            r0.initData()
        L10:
            return
    }

    public void setOnContentChangeListener(com.bxkj.student.common.view.TBLayout.OnPageChangedListener r1) {
            r0 = this;
            r0.ctListener = r1
            return
    }

    public void setOnPullListener(com.bxkj.student.common.view.TBLayout.OnPullListener r1) {
            r0 = this;
            r0.pullListener = r1
            return
    }
}
