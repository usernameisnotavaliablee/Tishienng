package com.scwang.smartrefresh.layout.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class a implements l2.c {
    protected int a;
    protected int b;
    protected android.view.View c;
    protected android.view.View d;
    protected android.view.View e;
    protected android.view.View f;
    protected android.view.View g;
    protected boolean h;
    protected boolean i;
    protected android.view.MotionEvent j;
    protected com.scwang.smartrefresh.layout.impl.d k;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.scwang.smartrefresh.layout.impl.a$a, reason: collision with other inner class name */
    class C0183a implements com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener {
        final /* synthetic */ l2.h a;
        final /* synthetic */ com.scwang.smartrefresh.layout.impl.a b;

        C0183a(com.scwang.smartrefresh.layout.impl.a r1, l2.h r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void onOffsetChanged(com.google.android.material.appbar.AppBarLayout r5, int r6) {
                r4 = this;
                com.scwang.smartrefresh.layout.impl.a r0 = r4.b
                r1 = 0
                r2 = 1
                if (r6 < 0) goto L8
                r3 = 1
                goto L9
            L8:
                r3 = 0
            L9:
                r0.h = r3
                l2.h r3 = r4.a
                boolean r3 = r3.y()
                if (r3 == 0) goto L1b
                int r5 = r5.getTotalScrollRange()
                int r5 = r5 + r6
                if (r5 > 0) goto L1b
                r1 = 1
            L1b:
                r0.i = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements android.animation.ValueAnimator.AnimatorUpdateListener {
        int a;
        final /* synthetic */ int b;
        final /* synthetic */ com.scwang.smartrefresh.layout.impl.a c;

        b(com.scwang.smartrefresh.layout.impl.a r1, int r2) {
                r0 = this;
                r0.c = r1
                r0.b = r2
                r0.<init>()
                r0.a = r2
                return
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(android.animation.ValueAnimator r4) {
                r3 = this;
                java.lang.Object r4 = r4.getAnimatedValue()
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
                com.scwang.smartrefresh.layout.impl.a r0 = r3.c     // Catch: java.lang.Throwable -> L24
                android.view.View r0 = r0.e     // Catch: java.lang.Throwable -> L24
                boolean r1 = r0 instanceof android.widget.AbsListView     // Catch: java.lang.Throwable -> L24
                if (r1 == 0) goto L1c
                android.widget.AbsListView r0 = (android.widget.AbsListView) r0     // Catch: java.lang.Throwable -> L24
                int r1 = r3.a     // Catch: java.lang.Throwable -> L24
                int r1 = r4 - r1
                com.scwang.smartrefresh.layout.impl.a.v(r0, r1)     // Catch: java.lang.Throwable -> L24
                goto L24
            L1c:
                int r1 = r3.a     // Catch: java.lang.Throwable -> L24
                int r1 = r4 - r1
                r2 = 0
                r0.scrollBy(r2, r1)     // Catch: java.lang.Throwable -> L24
            L24:
                r3.a = r4
                return
        }
    }

    public a(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            r0 = 2147483647(0x7fffffff, float:NaN)
            r2.a = r0
            r1 = 1
            int r0 = r0 - r1
            r2.b = r0
            r2.h = r1
            r2.i = r1
            com.scwang.smartrefresh.layout.impl.d r0 = new com.scwang.smartrefresh.layout.impl.d
            r0.<init>()
            r2.k = r0
            android.view.View r0 = new android.view.View
            r0.<init>(r3)
            r2.d = r0
            r2.c = r0
            return
    }

    public a(android.view.View r3) {
            r2 = this;
            r2.<init>()
            r0 = 2147483647(0x7fffffff, float:NaN)
            r2.a = r0
            r1 = 1
            int r0 = r0 - r1
            r2.b = r0
            r2.h = r1
            r2.i = r1
            com.scwang.smartrefresh.layout.impl.d r0 = new com.scwang.smartrefresh.layout.impl.d
            r0.<init>()
            r2.k = r0
            r2.d = r3
            r2.c = r3
            return
    }

    protected static int u(android.view.View r3) {
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            if (r0 != 0) goto Ld
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -1
            r2 = -2
            r0.<init>(r1, r2)
        Ld:
            int r1 = r0.width
            r2 = 0
            int r1 = android.view.ViewGroup.getChildMeasureSpec(r2, r2, r1)
            int r0 = r0.height
            if (r0 <= 0) goto L1f
            r2 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            goto L23
        L1f:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r2)
        L23:
            r3.measure(r1, r0)
            int r3 = r3.getMeasuredHeight()
            return r3
    }

    protected static void v(@androidx.annotation.NonNull android.widget.AbsListView r0, int r1) {
            r0.scrollListBy(r1)
            return
    }

    public void a(l2.i r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.scwang.smartrefresh.layout.impl.d
            if (r0 == 0) goto L9
            com.scwang.smartrefresh.layout.impl.d r2 = (com.scwang.smartrefresh.layout.impl.d) r2
            r1.k = r2
            return
        L9:
            com.scwang.smartrefresh.layout.impl.d r0 = r1.k
            r0.e(r2)
            return
    }

    protected void b(android.view.View r3, l2.g r4) {
            r2 = this;
            r0 = 0
            r2.e = r0
        L3:
            android.view.View r0 = r2.e
            if (r0 == 0) goto Lf
            boolean r1 = r0 instanceof androidx.core.view.NestedScrollingParent
            if (r1 == 0) goto L1d
            boolean r1 = r0 instanceof androidx.core.view.NestedScrollingChild
            if (r1 != 0) goto L1d
        Lf:
            r1 = 0
            if (r0 != 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            android.view.View r3 = r2.s(r3, r0)
            android.view.View r0 = r2.e
            if (r3 != r0) goto L1e
        L1d:
            return
        L1e:
            boolean r0 = r3 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto L33
            l2.h r0 = r4.c()     // Catch: java.lang.Throwable -> L33
            r0.r(r1)     // Catch: java.lang.Throwable -> L33
            r0 = r3
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch: java.lang.Throwable -> L33
            l2.h r1 = r4.c()     // Catch: java.lang.Throwable -> L33
            r2.w(r0, r1)     // Catch: java.lang.Throwable -> L33
        L33:
            r2.e = r3
            goto L3
    }

    public void c(boolean r2) {
            r1 = this;
            com.scwang.smartrefresh.layout.impl.d r0 = r1.k
            r0.d(r2)
            return
    }

    public void d(android.view.MotionEvent r3) {
            r2 = this;
            android.view.MotionEvent r3 = android.view.MotionEvent.obtain(r3)
            r2.j = r3
            android.view.View r0 = r2.c
            int r0 = r0.getLeft()
            int r0 = -r0
            float r0 = (float) r0
            android.view.View r1 = r2.c
            int r1 = r1.getTop()
            int r1 = -r1
            float r1 = (float) r1
            r3.offsetLocation(r0, r1)
            com.scwang.smartrefresh.layout.impl.d r3 = r2.k
            android.view.MotionEvent r0 = r2.j
            r3.c(r0)
            android.view.View r3 = r2.c
            android.view.MotionEvent r0 = r2.j
            android.view.View r1 = r2.e
            android.view.View r3 = r2.r(r3, r0, r1)
            r2.e = r3
            return
    }

    public android.animation.ValueAnimator.AnimatorUpdateListener e(int r2) {
            r1 = this;
            android.view.View r0 = r1.e
            if (r0 == 0) goto L1e
            if (r2 == 0) goto L1e
            if (r2 >= 0) goto Le
            boolean r0 = com.scwang.smartrefresh.layout.util.d.c(r0)
            if (r0 != 0) goto L18
        Le:
            if (r2 <= 0) goto L1e
            android.view.View r0 = r1.e
            boolean r0 = com.scwang.smartrefresh.layout.util.d.e(r0)
            if (r0 == 0) goto L1e
        L18:
            com.scwang.smartrefresh.layout.impl.a$b r0 = new com.scwang.smartrefresh.layout.impl.a$b
            r0.<init>(r1, r2)
            return r0
        L1e:
            r2 = 0
            return r2
    }

    public int f() {
            r1 = this;
            android.view.View r0 = r1.c
            int r0 = r0.getMeasuredWidth()
            return r0
    }

    public void g(l2.g r7, android.view.View r8, android.view.View r9) {
            r6 = this;
            android.view.View r0 = r6.c
            r6.b(r0, r7)
            if (r8 != 0) goto L9
            if (r9 == 0) goto La2
        L9:
            r6.f = r8
            r6.g = r9
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            android.view.View r1 = r6.c
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1)
            l2.h r1 = r7.c()
            android.view.ViewGroup r1 = r1.getLayout()
            android.view.View r2 = r6.c
            r1.removeView(r2)
            android.view.View r1 = r6.c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.view.View r2 = r6.c
            r3 = -1
            r0.addView(r2, r3, r3)
            l2.h r7 = r7.c()
            android.view.ViewGroup r7 = r7.getLayout()
            r7.addView(r0, r1)
            r6.c = r0
            r7 = 1
            if (r8 == 0) goto L6c
            r8.setClickable(r7)
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            android.view.ViewParent r2 = r8.getParent()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            int r3 = r2.indexOfChild(r8)
            r2.removeView(r8)
            int r4 = u(r8)
            r1.height = r4
            androidx.legacy.widget.Space r4 = new androidx.legacy.widget.Space
            android.view.View r5 = r6.c
            android.content.Context r5 = r5.getContext()
            r4.<init>(r5)
            r2.addView(r4, r3, r1)
            r0.addView(r8)
        L6c:
            if (r9 == 0) goto La2
            r9.setClickable(r7)
            android.view.ViewGroup$LayoutParams r7 = r9.getLayoutParams()
            android.view.ViewParent r8 = r9.getParent()
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            int r1 = r8.indexOfChild(r9)
            r8.removeView(r9)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r7)
            int r3 = u(r9)
            r7.height = r3
            androidx.legacy.widget.Space r3 = new androidx.legacy.widget.Space
            android.view.View r4 = r6.c
            android.content.Context r4 = r4.getContext()
            r3.<init>(r4)
            r8.addView(r3, r1, r7)
            r7 = 80
            r2.gravity = r7
            r0.addView(r9, r2)
        La2:
            return
    }

    public android.view.ViewGroup.LayoutParams getLayoutParams() {
            r1 = this;
            android.view.View r0 = r1.c
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            return r0
    }

    @androidx.annotation.NonNull
    public android.view.View getView() {
            r1 = this;
            android.view.View r0 = r1.c
            return r0
    }

    public void h(int r2, int r3) {
            r1 = this;
            android.view.View r0 = r1.c
            r0.measure(r2, r3)
            return
    }

    public int i() {
            r1 = this;
            android.view.View r0 = r1.c
            int r0 = r0.getMeasuredHeight()
            return r0
    }

    public void j(int r4) {
            r3 = this;
            android.view.View r0 = r3.d
            float r1 = (float) r4
            r0.setTranslationY(r1)
            android.view.View r0 = r3.f
            r1 = 0
            if (r0 == 0) goto L13
            int r2 = java.lang.Math.max(r1, r4)
            float r2 = (float) r2
            r0.setTranslationY(r2)
        L13:
            android.view.View r0 = r3.g
            if (r0 == 0) goto L1f
            int r4 = java.lang.Math.min(r1, r4)
            float r4 = (float) r4
            r0.setTranslationY(r4)
        L1f:
            return
    }

    public void k(int r1, int r2) {
            r0 = this;
            r0.a = r1
            r0.b = r2
            return
    }

    public void l(int r2, int r3, int r4, int r5) {
            r1 = this;
            android.view.View r0 = r1.c
            r0.layout(r2, r3, r4, r5)
            return
    }

    public android.view.View m() {
            r1 = this;
            android.view.View r0 = r1.e
            return r0
    }

    public void n(int r4) {
            r3 = this;
            android.view.View r0 = r3.e
            boolean r1 = r0 instanceof android.widget.ScrollView
            if (r1 == 0) goto Lc
            android.widget.ScrollView r0 = (android.widget.ScrollView) r0
            r0.fling(r4)
            return
        Lc:
            boolean r1 = r0 instanceof android.widget.AbsListView
            if (r1 == 0) goto L16
            android.widget.AbsListView r0 = (android.widget.AbsListView) r0
            r0.fling(r4)
            return
        L16:
            boolean r1 = r0 instanceof android.webkit.WebView
            r2 = 0
            if (r1 == 0) goto L21
            android.webkit.WebView r0 = (android.webkit.WebView) r0
            r0.flingScroll(r2, r4)
            return
        L21:
            boolean r1 = r0 instanceof androidx.recyclerview.widget.RecyclerView
            if (r1 == 0) goto L2b
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r0.fling(r2, r4)
            return
        L2b:
            boolean r1 = r0 instanceof androidx.core.widget.NestedScrollView
            if (r1 == 0) goto L34
            androidx.core.widget.NestedScrollView r0 = (androidx.core.widget.NestedScrollView) r0
            r0.fling(r4)
        L34:
            return
    }

    public boolean o() {
            r2 = this;
            boolean r0 = r2.h
            if (r0 == 0) goto L10
            com.scwang.smartrefresh.layout.impl.d r0 = r2.k
            android.view.View r1 = r2.c
            boolean r0 = r0.b(r1)
            if (r0 == 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    public void p() {
            r1 = this;
            r0 = 0
            r1.j = r0
            return
    }

    public boolean q() {
            r2 = this;
            boolean r0 = r2.i
            if (r0 == 0) goto L10
            com.scwang.smartrefresh.layout.impl.d r0 = r2.k
            android.view.View r1 = r2.c
            boolean r0 = r0.a(r1)
            if (r0 == 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    protected android.view.View r(android.view.View r6, android.view.MotionEvent r7, android.view.View r8) {
            r5 = this;
            boolean r0 = r6 instanceof android.view.ViewGroup
            if (r0 == 0) goto L45
            if (r7 == 0) goto L45
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            int r0 = r6.getChildCount()
            android.graphics.PointF r1 = new android.graphics.PointF
            r1.<init>()
        L11:
            if (r0 <= 0) goto L45
            int r2 = r0 + (-1)
            android.view.View r2 = r6.getChildAt(r2)
            float r3 = r7.getX()
            float r4 = r7.getY()
            boolean r3 = com.scwang.smartrefresh.layout.util.d.f(r6, r2, r3, r4, r1)
            if (r3 == 0) goto L42
            boolean r6 = r2 instanceof androidx.viewpager.widget.ViewPager
            if (r6 != 0) goto L32
            boolean r6 = r5.t(r2)
            if (r6 == 0) goto L32
            return r2
        L32:
            android.view.MotionEvent r6 = android.view.MotionEvent.obtain(r7)
            float r7 = r1.x
            float r0 = r1.y
            r6.offsetLocation(r7, r0)
            android.view.View r6 = r5.r(r2, r6, r8)
            return r6
        L42:
            int r0 = r0 + (-1)
            goto L11
        L45:
            return r8
    }

    protected android.view.View s(android.view.View r6, boolean r7) {
            r5 = this;
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            java.util.List r1 = java.util.Collections.singletonList(r6)
            r0.<init>(r1)
            r1 = 0
        La:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L3d
            if (r1 != 0) goto L3d
            java.lang.Object r2 = r0.poll()
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto La
            if (r7 != 0) goto L1e
            if (r2 == r6) goto L26
        L1e:
            boolean r3 = r5.t(r2)
            if (r3 == 0) goto L26
            r1 = r2
            goto La
        L26:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto La
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r3 = 0
        L2d:
            int r4 = r2.getChildCount()
            if (r3 >= r4) goto La
            android.view.View r4 = r2.getChildAt(r3)
            r0.add(r4)
            int r3 = r3 + 1
            goto L2d
        L3d:
            if (r1 != 0) goto L40
            return r6
        L40:
            return r1
    }

    protected boolean t(android.view.View r2) {
            r1 = this;
            boolean r0 = r2 instanceof android.widget.AbsListView
            if (r0 != 0) goto L1f
            boolean r0 = r2 instanceof android.widget.ScrollView
            if (r0 != 0) goto L1f
            boolean r0 = r2 instanceof androidx.core.view.ScrollingView
            if (r0 != 0) goto L1f
            boolean r0 = r2 instanceof androidx.core.view.NestedScrollingChild
            if (r0 != 0) goto L1f
            boolean r0 = r2 instanceof androidx.core.view.NestedScrollingParent
            if (r0 != 0) goto L1f
            boolean r0 = r2 instanceof android.webkit.WebView
            if (r0 != 0) goto L1f
            boolean r2 = r2 instanceof androidx.viewpager.widget.ViewPager
            if (r2 == 0) goto L1d
            goto L1f
        L1d:
            r2 = 0
            return r2
        L1f:
            r2 = 1
            return r2
    }

    protected void w(android.view.ViewGroup r4, l2.h r5) {
            r3 = this;
            int r0 = r4.getChildCount()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L1d
            android.view.View r1 = r4.getChildAt(r0)
            boolean r2 = r1 instanceof com.google.android.material.appbar.AppBarLayout
            if (r2 == 0) goto L1a
            com.google.android.material.appbar.AppBarLayout r1 = (com.google.android.material.appbar.AppBarLayout) r1
            com.scwang.smartrefresh.layout.impl.a$a r2 = new com.scwang.smartrefresh.layout.impl.a$a
            r2.<init>(r3, r5)
            r1.addOnOffsetChangedListener(r2)
        L1a:
            int r0 = r0 + (-1)
            goto L6
        L1d:
            return
    }
}
