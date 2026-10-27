package com.kwad.components.core.page.recycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class DetailWebRecycleView extends com.kwad.components.core.page.recycle.b {
    private int UF;
    private boolean UG;
    private boolean UH;
    private int UI;
    private int UJ;
    private boolean UK;
    com.kwad.components.core.page.recycle.DetailWebRecycleView.a UL;
    private java.lang.Runnable UM;
    private com.kwad.components.core.t.p UN;
    private int oC;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        boolean rE();
    }

    public DetailWebRecycleView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public DetailWebRecycleView(android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public DetailWebRecycleView(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r2 = 1000(0x3e8, float:1.401E-42)
            r0.UF = r2
            r2 = 0
            r0.UG = r2
            r0.UH = r2
            com.kwad.components.core.page.recycle.DetailWebRecycleView$1 r2 = new com.kwad.components.core.page.recycle.DetailWebRecycleView$1
            r2.<init>(r0)
            r0.UM = r2
            com.kwad.components.core.t.p r3 = new com.kwad.components.core.t.p
            r3.<init>(r2)
            r0.UN = r3
            boolean r2 = r1 instanceof android.app.Activity
            if (r2 == 0) goto L27
            android.app.Activity r1 = (android.app.Activity) r1
            int r1 = com.kwad.sdk.c.a.a.g(r1)
            r0.oC = r1
            return
        L27:
            int r1 = com.kwad.sdk.c.a.a.getScreenHeight(r1)
            r0.oC = r1
            return
    }

    static /* synthetic */ int a(com.kwad.components.core.page.recycle.DetailWebRecycleView r0) {
            int r0 = r0.UF
            return r0
    }

    protected void onAttachedToWindow() {
            r3 = this;
            super.onAttachedToWindow()
            com.kwad.components.core.t.p r0 = r3.UN
            r1 = 50
            r3.postDelayed(r0, r1)
            return
    }

    @Override // com.kwad.components.core.page.recycle.b
    protected void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            com.kwad.components.core.t.p r0 = r1.UN
            r1.removeCallbacks(r0)
            return
    }

    @Override // com.kwad.components.core.page.recycle.b
    public boolean onInterceptTouchEvent(android.view.MotionEvent r4) {
            r3 = this;
            com.kwad.components.core.page.recycle.DetailWebRecycleView$a r0 = r3.UL
            if (r0 == 0) goto Lc
            boolean r0 = r0.rE()
            if (r0 == 0) goto Lc
            r4 = 1
            return r4
        Lc:
            int r0 = r3.computeVerticalScrollOffset()
            r3.UJ = r0
            float r0 = r4.getY()
            int r1 = r3.UI
            int r2 = r3.UJ
            int r1 = r1 - r2
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L25
            boolean r4 = super.onInterceptTouchEvent(r4)
            return r4
        L25:
            r4 = 0
            return r4
    }

    public boolean onNestedPreFling(android.view.View r2, float r3, float r4) {
            r1 = this;
            int r2 = r1.computeVerticalScrollOffset()
            r1.UJ = r2
            int r0 = r1.UI
            if (r2 < r0) goto Lc
            r2 = 0
            return r2
        Lc:
            int r2 = (int) r3
            int r3 = (int) r4
            r1.fling(r2, r3)
            r2 = 1
            return r2
    }

    public void onNestedPreScroll(android.view.View r4, int r5, int r6, int[] r7) {
            r3 = this;
            int r5 = r3.computeVerticalScrollOffset()
            r3.UJ = r5
            r0 = 1
            r1 = 0
            if (r6 <= 0) goto L1b
            int r2 = r3.UI
            if (r5 >= r2) goto L1b
            boolean r2 = r3.UK
            if (r2 != 0) goto L1b
            int r2 = r3.oC
            if (r5 >= r2) goto L1b
            r3.scrollBy(r1, r6)
            r7[r0] = r6
        L1b:
            if (r6 >= 0) goto L2d
            int r5 = r3.UJ
            if (r5 <= 0) goto L2d
            r5 = -1
            boolean r4 = androidx.core.view.ViewCompat.canScrollVertically(r4, r5)
            if (r4 != 0) goto L2d
            r3.scrollBy(r1, r6)
            r7[r0] = r6
        L2d:
            return
    }

    public void onScrollStateChanged(int r5) {
            r4 = this;
            super.onScrollStateChanged(r5)
            if (r5 != 0) goto L41
            androidx.recyclerview.widget.RecyclerView$LayoutManager r5 = r4.getLayoutManager()
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r4.getLayoutManager()
            int r0 = r0.getChildCount()
            r1 = 1
            int r0 = r0 - r1
            android.view.View r5 = r5.getChildAt(r0)
            if (r5 == 0) goto L3e
            int r0 = r5.getBottom()
            int r2 = r4.getBottom()
            int r3 = r4.getPaddingBottom()
            int r2 = r2 - r3
            androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r4.getLayoutManager()
            int r5 = r3.getPosition(r5)
            if (r0 != r2) goto L3e
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r4.getLayoutManager()
            int r0 = r0.getItemCount()
            int r0 = r0 - r1
            if (r5 != r0) goto L3e
            r4.UK = r1
            return
        L3e:
            r5 = 0
            r4.UK = r5
        L41:
            return
    }

    public boolean onStartNestedScroll(android.view.View r1, android.view.View r2, int r3) {
            r0 = this;
            r1 = r3 & 2
            if (r1 == 0) goto L6
            r1 = 1
            return r1
        L6:
            r1 = 0
            return r1
    }

    public void requestChildFocus(android.view.View r2, android.view.View r3) {
            r1 = this;
            boolean r0 = r1.UH
            if (r0 == 0) goto L8
            r2 = 0
            r1.UH = r2
            return
        L8:
            boolean r0 = r1.UG
            if (r0 != 0) goto Lf
            super.requestChildFocus(r2, r3)
        Lf:
            return
    }

    public void setInterceptRequestFocusForWeb(boolean r1) {
            r0 = this;
            r0.UG = r1
            return
    }

    public void setInterceptRequestFocusForWebFiredOnce(boolean r1) {
            r0 = this;
            r0.UH = r1
            return
    }

    public void setInterceptTouchListener(com.kwad.components.core.page.recycle.DetailWebRecycleView.a r1) {
            r0 = this;
            r0.UL = r1
            return
    }

    public void setTopViewHeight(int r1) {
            r0 = this;
            r0.UI = r1
            return
    }
}
