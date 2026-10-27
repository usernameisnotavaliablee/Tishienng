package com.kwad.components.core.page.recycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class b extends com.kwad.components.core.page.recycle.g {
    private boolean UA;
    private int UB;
    private com.kwad.components.core.page.recycle.b.a UC;
    private boolean UD;
    private boolean UE;
    private android.graphics.Rect Ux;
    private int Uy;
    private int Uz;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        boolean rD();
    }

    public b(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public b(android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public b(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.UB = r1
            r1 = 0
            r0.UE = r1
            return
    }

    private void a(int r6, int r7, int r8) {
            r5 = this;
        L0:
            int r0 = r5.UB
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1
            r3 = 2
            if (r0 != r1) goto L11
            int[] r0 = new int[r3]
            r5.getLocationOnScreen(r0)
            r0 = r0[r2]
            r5.UB = r0
        L11:
            com.kwad.components.core.page.recycle.f r0 = com.kwad.components.core.page.recycle.f.b(r5)
            int r0 = r0.findFirstVisibleItemPosition()
            com.kwad.components.core.page.recycle.f r1 = com.kwad.components.core.page.recycle.f.b(r5)
            int r1 = r1.findLastVisibleItemPosition()
            r4 = -1
            if (r0 == r4) goto L54
            if (r1 != r4) goto L27
            goto L54
        L27:
            r4 = 0
            if (r6 < r0) goto L46
            if (r6 > r1) goto L46
            int r6 = r6 - r0
            int r7 = r5.getChildCount()
            if (r7 <= r6) goto L54
            android.view.View r6 = r5.getChildAt(r6)
            int[] r7 = new int[r3]
            r6.getLocationOnScreen(r7)
            r6 = r7[r2]
            int r7 = r5.UB
            int r6 = r6 - r7
            int r6 = r6 - r8
            r5.scrollBy(r4, r6)
            return
        L46:
            if (r6 <= r1) goto L4f
            r5.scrollBy(r4, r7)
            r5.a(r6, r7, r8)
            return
        L4f:
            int r0 = -r7
            r5.scrollBy(r4, r0)
            goto L0
        L54:
            return
    }

    private void rB() {
            r7 = this;
            android.graphics.Rect r0 = r7.Ux
            if (r0 != 0) goto Lc
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r7.Ux = r0
            goto Lf
        Lc:
            r0.setEmpty()
        Lf:
            int r0 = r7.getChildCount()
            r1 = 0
        L14:
            if (r1 >= r0) goto L38
            android.view.View r2 = r7.getChildAt(r1)
            int r3 = r2.getVisibility()
            if (r3 != 0) goto L35
            android.graphics.Rect r3 = r7.Ux
            int r4 = r2.getLeft()
            int r5 = r2.getTop()
            int r6 = r2.getRight()
            int r2 = r2.getBottom()
            r3.union(r4, r5, r6, r2)
        L35:
            int r1 = r1 + 1
            goto L14
        L38:
            return
    }

    private void rC() {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r2.getAdapter()
            boolean r1 = r0 instanceof com.kwad.components.core.page.recycle.d
            if (r1 == 0) goto Ld
            com.kwad.components.core.page.recycle.d r0 = (com.kwad.components.core.page.recycle.d) r0
            r0.rG()
        Ld:
            return
    }

    private void scrollToPositionWithOffset(int r2, int r3) {
            r1 = this;
            int r3 = r1.getHeight()
            r0 = 0
            r1.a(r2, r3, r0)
            return
    }

    protected void onDetachedFromWindow() {
            r0 = this;
            super.onDetachedFromWindow()
            r0.rC()
            return
    }

    public void onDraw(android.graphics.Canvas r2) {
            r1 = this;
            int r0 = r1.Uy
            if (r0 == 0) goto L21
            r1.rB()
            android.graphics.Rect r0 = r1.Ux
            if (r0 == 0) goto L21
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L21
            r2.save()
            android.graphics.Rect r0 = r1.Ux
            r2.clipRect(r0)
            int r0 = r1.Uy
            r2.drawColor(r0)
            r2.restore()
        L21:
            super.onDraw(r2)
            return
    }

    public boolean onInterceptTouchEvent(android.view.MotionEvent r3) {
            r2 = this;
            boolean r0 = r2.UD
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            int r0 = r3.getAction()
            if (r0 != 0) goto L13
            boolean r0 = r2.UE
            if (r0 == 0) goto L13
            r2.stopScroll()
        L13:
            com.kwad.components.core.page.recycle.b$a r0 = r2.UC
            if (r0 == 0) goto L1e
            boolean r0 = r0.rD()
            if (r0 == 0) goto L1e
            return r1
        L1e:
            boolean r3 = super.onInterceptTouchEvent(r3)
            return r3
    }

    protected void onMeasure(int r3, int r4) {
            r2 = this;
            int r0 = android.view.View.MeasureSpec.getSize(r4)
            int r1 = r2.Uz
            if (r1 <= 0) goto L14
            if (r1 >= r0) goto L14
            int r4 = android.view.View.MeasureSpec.getMode(r4)
            int r0 = r2.Uz
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
        L14:
            super.onMeasure(r3, r4)
            return
    }

    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            boolean r0 = r1.UD
            if (r0 == 0) goto L6
            r2 = 0
            return r2
        L6:
            boolean r2 = super.onTouchEvent(r2)
            return r2
    }

    public void scrollToPosition(int r2) {
            r1 = this;
            boolean r0 = r1.UA
            if (r0 == 0) goto L9
            r0 = 0
            r1.scrollToPositionWithOffset(r2, r0)
            return
        L9:
            super.scrollToPosition(r2)
            return
    }

    public void setDisableScroll(boolean r1) {
            r0 = this;
            r0.UD = r1
            return
    }

    public void setDownStop(boolean r1) {
            r0 = this;
            r0.UE = r1
            return
    }

    public void setIgnoreTouchSwipeHandler(com.kwad.components.core.page.recycle.b.a r1) {
            r0 = this;
            r0.UC = r1
            return
    }

    public void setUnderneathColor(int r1) {
            r0 = this;
            r0.Uy = r1
            r0.rB()
            r0.invalidate()
            return
    }

    public void setUseCustomScrollToPosition(boolean r1) {
            r0 = this;
            r0.UA = r1
            return
    }
}
