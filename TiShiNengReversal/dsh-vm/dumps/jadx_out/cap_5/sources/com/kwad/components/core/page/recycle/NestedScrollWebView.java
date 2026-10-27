package com.kwad.components.core.page.recycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class NestedScrollWebView extends com.kwad.sdk.core.webview.KsAdWebView implements androidx.core.view.NestedScrollingChild {
    private int UP;
    private int UQ;
    private final int[] UR;
    private final int[] US;
    private int UT;
    private boolean UU;
    private int UV;
    private int UW;
    private androidx.core.view.NestedScrollingChildHelper UX;
    private android.view.VelocityTracker UY;
    private int UZ;

    public NestedScrollWebView(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r2 = 2
            int[] r0 = new int[r2]
            r1.UR = r0
            int[] r2 = new int[r2]
            r1.US = r2
            r1.rF()
            return
    }

    public NestedScrollWebView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 2
            int[] r2 = new int[r1]
            r0.UR = r2
            int[] r1 = new int[r1]
            r0.US = r1
            r0.rF()
            return
    }

    public NestedScrollWebView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 2
            int[] r2 = new int[r1]
            r0.UR = r2
            int[] r1 = new int[r1]
            r0.US = r1
            r0.rF()
            return
    }

    private void rF() {
            r2 = this;
            r0 = 0
            r2.UZ = r0
            android.content.Context r0 = r2.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            androidx.core.view.NestedScrollingChildHelper r1 = new androidx.core.view.NestedScrollingChildHelper
            r1.<init>(r2)
            r2.UX = r1
            r1 = 1
            r2.setNestedScrollingEnabled(r1)
            int r1 = r0.getScaledMaximumFlingVelocity()
            r2.UW = r1
            int r0 = r0.getScaledMinimumFlingVelocity()
            r2.UV = r0
            return
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float r2, float r3, boolean r4) {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.UX
            boolean r2 = r0.dispatchNestedFling(r2, r3, r4)
            return r2
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float r2, float r3) {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.UX
            boolean r2 = r0.dispatchNestedPreFling(r2, r3)
            return r2
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int r2, int r3, int[] r4, int[] r5) {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.UX
            boolean r2 = r0.dispatchNestedPreScroll(r2, r3, r4, r5)
            return r2
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int r7, int r8, int r9, int r10, int[] r11) {
            r6 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r6.UX
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            boolean r7 = r0.dispatchNestedScroll(r1, r2, r3, r4, r5)
            return r7
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.UX
            boolean r0 = r0.hasNestedScrollingParent()
            return r0
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.UX
            boolean r0 = r0.isNestedScrollingEnabled()
            return r0
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int r2, int r3) {
            r1 = this;
            int r0 = r1.UZ
            if (r0 == 0) goto L39
            boolean r3 = com.kwad.components.core.t.d.tc()
            if (r3 == 0) goto L13
            android.content.Context r3 = r1.getContext()
            int r3 = com.kwad.sdk.c.a.a.getStatusBarHeight(r3)
            goto L14
        L13:
            r3 = 0
        L14:
            android.content.Context r0 = r1.getContext()
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L27
            android.content.Context r0 = r1.getContext()
            android.app.Activity r0 = (android.app.Activity) r0
            int r0 = com.kwad.sdk.c.a.a.g(r0)
            goto L2f
        L27:
            android.content.Context r0 = r1.getContext()
            int r0 = com.kwad.sdk.c.a.a.getScreenHeight(r0)
        L2f:
            int r0 = r0 - r3
            int r3 = r1.UZ
            int r0 = r0 - r3
            r3 = 1073741824(0x40000000, float:2.0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
        L39:
            super.onMeasure(r2, r3)
            return
    }

    @Override // com.kwad.sdk.core.webview.KsAdWebView, android.webkit.WebView, android.view.View
    public void onScrollChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.onScrollChanged(r1, r2, r3, r4)
            boolean r1 = r0.hasFocus()
            if (r1 != 0) goto Lc
            r0.requestFocus()
        Lc:
            return
    }

    @Override // com.kwad.sdk.core.webview.KsAdWebView, android.webkit.WebView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r20) {
            r19 = this;
            r0 = r19
            r6 = r20
            android.view.MotionEvent r7 = android.view.MotionEvent.obtain(r6)
            int r1 = androidx.core.view.MotionEventCompat.getActionMasked(r6)
            r8 = 0
            if (r1 != 0) goto L11
            r0.UT = r8
        L11:
            android.view.VelocityTracker r2 = r0.UY
            if (r2 != 0) goto L1b
            android.view.VelocityTracker r2 = android.view.VelocityTracker.obtain()
            r0.UY = r2
        L1b:
            int r2 = androidx.core.view.MotionEventCompat.getActionIndex(r6)
            float r3 = r6.getY()
            int r3 = (int) r3
            int r4 = r0.UT
            float r4 = (float) r4
            r9 = 0
            r6.offsetLocation(r9, r4)
            r4 = 2
            r10 = 1
            if (r1 == 0) goto L139
            if (r1 == r10) goto Lde
            r11 = 5
            if (r1 == r4) goto L44
            r3 = 3
            if (r1 == r3) goto Lde
            if (r1 == r11) goto L3b
            goto Ldb
        L3b:
            r0.stopNestedScroll()
            boolean r1 = super.onTouchEvent(r20)
            goto L157
        L44:
            int r1 = r0.UP
            int r1 = r1 - r3
            int[] r2 = r0.US
            int[] r4 = r0.UR
            boolean r2 = r0.dispatchNestedPreScroll(r8, r1, r2, r4)
            if (r2 == 0) goto L67
            int[] r2 = r0.US
            r2 = r2[r10]
            int r1 = r1 - r2
            int[] r2 = r0.UR
            r2 = r2[r10]
            float r2 = (float) r2
            r7.offsetLocation(r9, r2)
            int r2 = r0.UT
            int[] r4 = r0.UR
            r4 = r4[r10]
            int r2 = r2 + r4
            r0.UT = r2
        L67:
            int r2 = r0.getScrollY()
            int[] r4 = r0.UR
            r4 = r4[r10]
            int r3 = r3 - r4
            r0.UP = r3
            int r3 = r2 + r1
            int r3 = java.lang.Math.max(r8, r3)
            int r2 = r3 - r2
            int r4 = r1 - r2
            int r2 = r3 - r4
            r3 = 0
            int[] r5 = r0.UR
            r1 = 0
            boolean r1 = r0.dispatchNestedScroll(r1, r2, r3, r4, r5)
            if (r1 == 0) goto L9e
            int r1 = r0.UP
            int[] r2 = r0.UR
            r2 = r2[r10]
            int r1 = r1 - r2
            r0.UP = r1
            float r1 = (float) r2
            r7.offsetLocation(r9, r1)
            int r1 = r0.UT
            int[] r2 = r0.UR
            r2 = r2[r10]
            int r1 = r1 + r2
            r0.UT = r1
        L9e:
            int[] r1 = r0.US
            r1 = r1[r10]
            int r1 = java.lang.Math.abs(r1)
            if (r1 >= r11) goto Lc3
            int[] r1 = r0.UR
            r1 = r1[r10]
            int r1 = java.lang.Math.abs(r1)
            if (r1 >= r11) goto Lc3
            boolean r1 = r0.UU
            if (r1 == 0) goto Lba
            r0.UU = r8
            r1 = 0
            goto Lbe
        Lba:
            boolean r1 = super.onTouchEvent(r7)
        Lbe:
            r7.recycle()
            goto L157
        Lc3:
            boolean r1 = r0.UU
            if (r1 != 0) goto Ldb
            r0.UU = r10
            r17 = 0
            r18 = 0
            r11 = 0
            r13 = 0
            r15 = 3
            r16 = 0
            android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r11, r13, r15, r16, r17, r18)
            super.onTouchEvent(r1)
        Ldb:
            r1 = 0
            goto L157
        Lde:
            android.view.VelocityTracker r1 = r0.UY
            r1.addMovement(r6)
            android.view.VelocityTracker r1 = r0.UY
            int r3 = r0.UW
            float r3 = (float) r3
            r4 = 1000(0x3e8, float:1.401E-42)
            r1.computeCurrentVelocity(r4, r3)
            int r1 = androidx.core.view.MotionEventCompat.getPointerId(r6, r2)
            android.view.VelocityTracker r2 = r0.UY
            float r1 = androidx.core.view.VelocityTrackerCompat.getYVelocity(r2, r1)
            float r1 = -r1
            float r2 = java.lang.Math.abs(r1)
            int r3 = r0.UV
            float r3 = (float) r3
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L112
            boolean r2 = r0.dispatchNestedPreFling(r9, r1)
            if (r2 != 0) goto L112
            boolean r2 = r0.hasNestedScrollingParent()
            if (r2 == 0) goto L112
            r0.dispatchNestedFling(r9, r1, r10)
        L112:
            boolean r8 = super.onTouchEvent(r20)
            r0.stopNestedScroll()
            float r1 = r6.getY()
            int r2 = r0.UP
            float r2 = (float) r2
            float r1 = r1 - r2
            float r1 = java.lang.Math.abs(r1)
            r2 = 1092616192(0x41200000, float:10.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L136
            float r1 = r6.getX()
            int r2 = r0.UQ
            float r2 = (float) r2
            float r1 = r1 - r2
            java.lang.Math.abs(r1)
        L136:
            r1 = r8
            r8 = 1
            goto L157
        L139:
            r0.UP = r3
            float r1 = r6.getX()
            int r1 = (int) r1
            r0.UQ = r1
            r0.startNestedScroll(r4)
            int[] r1 = r0.US
            r1[r8] = r8
            r1[r10] = r8
            int[] r1 = r0.UR
            r1[r8] = r8
            r1[r10] = r8
            boolean r1 = super.onTouchEvent(r20)
            r0.UU = r8
        L157:
            if (r8 != 0) goto L15e
            android.view.VelocityTracker r2 = r0.UY
            r2.addMovement(r6)
        L15e:
            return r1
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean r2) {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.UX
            r0.setNestedScrollingEnabled(r2)
            return
    }

    @Override // android.view.View
    public boolean startNestedScroll(int r2) {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.UX
            boolean r2 = r0.startNestedScroll(r2)
            return r2
    }

    @Override // android.view.View
    public void stopNestedScroll() {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.UX
            r0.stopNestedScroll()
            return
    }
}
