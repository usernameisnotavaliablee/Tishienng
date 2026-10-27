package com.mcxtzhang.swipemenulib;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class SwipeMenuLayout extends android.view.ViewGroup {
    private static final java.lang.String u = "zxt/SwipeMenuLayout";
    private static com.mcxtzhang.swipemenulib.SwipeMenuLayout v;
    private static boolean w;
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private android.view.View g;
    private android.graphics.PointF h;
    private boolean i;
    private android.graphics.PointF j;
    private boolean k;
    private android.view.VelocityTracker l;
    private android.util.Log m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private android.animation.ValueAnimator r;
    private android.animation.ValueAnimator s;
    private boolean t;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.animation.ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ com.mcxtzhang.swipemenulib.SwipeMenuLayout a;

        a(com.mcxtzhang.swipemenulib.SwipeMenuLayout r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(android.animation.ValueAnimator r3) {
                r2 = this;
                com.mcxtzhang.swipemenulib.SwipeMenuLayout r0 = r2.a
                java.lang.Object r3 = r3.getAnimatedValue()
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                r1 = 0
                r0.scrollTo(r3, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends android.animation.AnimatorListenerAdapter {
        final /* synthetic */ com.mcxtzhang.swipemenulib.SwipeMenuLayout a;

        b(com.mcxtzhang.swipemenulib.SwipeMenuLayout r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r2) {
                r1 = this;
                com.mcxtzhang.swipemenulib.SwipeMenuLayout r2 = r1.a
                r0 = 1
                com.mcxtzhang.swipemenulib.SwipeMenuLayout.a(r2, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements android.animation.ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ com.mcxtzhang.swipemenulib.SwipeMenuLayout a;

        c(com.mcxtzhang.swipemenulib.SwipeMenuLayout r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(android.animation.ValueAnimator r3) {
                r2 = this;
                com.mcxtzhang.swipemenulib.SwipeMenuLayout r0 = r2.a
                java.lang.Object r3 = r3.getAnimatedValue()
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                r1 = 0
                r0.scrollTo(r3, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d extends android.animation.AnimatorListenerAdapter {
        final /* synthetic */ com.mcxtzhang.swipemenulib.SwipeMenuLayout a;

        d(com.mcxtzhang.swipemenulib.SwipeMenuLayout r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r2) {
                r1 = this;
                com.mcxtzhang.swipemenulib.SwipeMenuLayout r2 = r1.a
                r0 = 0
                com.mcxtzhang.swipemenulib.SwipeMenuLayout.a(r2, r0)
                return
        }
    }

    public SwipeMenuLayout(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public SwipeMenuLayout(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public SwipeMenuLayout(android.content.Context r2, android.util.AttributeSet r3, int r4) {
            r1 = this;
            r1.<init>(r2, r3, r4)
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>()
            r1.h = r0
            r0 = 1
            r1.i = r0
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>()
            r1.j = r0
            r1.e(r2, r3, r4)
            return
    }

    static /* synthetic */ boolean a(com.mcxtzhang.swipemenulib.SwipeMenuLayout r0, boolean r1) {
            r0.t = r1
            return r1
    }

    private void b(android.view.MotionEvent r2) {
            r1 = this;
            android.view.VelocityTracker r0 = r1.l
            if (r0 != 0) goto La
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r1.l = r0
        La:
            android.view.VelocityTracker r0 = r1.l
            r0.addMovement(r2)
            return
    }

    private void c() {
            r1 = this;
            android.animation.ValueAnimator r0 = r1.s
            if (r0 == 0) goto Lf
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto Lf
            android.animation.ValueAnimator r0 = r1.s
            r0.cancel()
        Lf:
            android.animation.ValueAnimator r0 = r1.r
            if (r0 == 0) goto L1e
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L1e
            android.animation.ValueAnimator r0 = r1.r
            r0.cancel()
        L1e:
            return
    }

    private void d(int r10, int r11) {
            r9 = this;
            int r0 = r9.getMeasuredHeight()
            r1 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r0 = 0
        Lb:
            if (r0 >= r10) goto L3b
            android.view.View r3 = r9.getChildAt(r0)
            int r1 = r3.getVisibility()
            r2 = 8
            if (r1 == r2) goto L36
            android.view.ViewGroup$LayoutParams r1 = r3.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r2 = r1.height
            r4 = -1
            if (r2 != r4) goto L36
            int r8 = r1.width
            int r2 = r3.getMeasuredWidth()
            r1.width = r2
            r5 = 0
            r7 = 0
            r2 = r9
            r4 = r11
            r2.measureChildWithMargins(r3, r4, r5, r6, r7)
            r1.width = r8
            goto L37
        L36:
            r4 = r11
        L37:
            int r0 = r0 + 1
            r11 = r4
            goto Lb
        L3b:
            return
    }

    private void e(android.content.Context r4, android.util.AttributeSet r5, int r6) {
            r3 = this;
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r4)
            int r0 = r0.getScaledTouchSlop()
            r3.a = r0
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r4)
            int r0 = r0.getScaledMaximumFlingVelocity()
            r3.b = r0
            r0 = 1
            r3.n = r0
            r3.o = r0
            r3.q = r0
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int[] r1 = com.mcxtzhang.swipemenulib.R.styleable.SwipeMenuLayout
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r6, r2)
            int r5 = r4.getIndexCount()
        L2a:
            if (r2 >= r5) goto L53
            int r6 = r4.getIndex(r2)
            int r1 = com.mcxtzhang.swipemenulib.R.styleable.SwipeMenuLayout_swipeEnable
            if (r6 != r1) goto L3b
            boolean r6 = r4.getBoolean(r6, r0)
            r3.n = r6
            goto L50
        L3b:
            int r1 = com.mcxtzhang.swipemenulib.R.styleable.SwipeMenuLayout_ios
            if (r6 != r1) goto L46
            boolean r6 = r4.getBoolean(r6, r0)
            r3.o = r6
            goto L50
        L46:
            int r1 = com.mcxtzhang.swipemenulib.R.styleable.SwipeMenuLayout_leftSwipe
            if (r6 != r1) goto L50
            boolean r6 = r4.getBoolean(r6, r0)
            r3.q = r6
        L50:
            int r2 = r2 + 1
            goto L2a
        L53:
            r4.recycle()
            return
    }

    public static com.mcxtzhang.swipemenulib.SwipeMenuLayout getViewCache() {
            com.mcxtzhang.swipemenulib.SwipeMenuLayout r0 = com.mcxtzhang.swipemenulib.SwipeMenuLayout.v
            return r0
    }

    private void j() {
            r1 = this;
            android.view.VelocityTracker r0 = r1.l
            if (r0 == 0) goto Lf
            r0.clear()
            android.view.VelocityTracker r0 = r1.l
            r0.recycle()
            r0 = 0
            r1.l = r0
        Lf:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent r6) {
            r5 = this;
            boolean r0 = r5.n
            if (r0 == 0) goto L140
            r5.b(r6)
            android.view.VelocityTracker r0 = r5.l
            int r1 = r6.getAction()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto Lff
            if (r1 == r2) goto L96
            r4 = 2
            if (r1 == r4) goto L1b
            r4 = 3
            if (r1 == r4) goto L96
            goto L140
        L1b:
            boolean r0 = r5.p
            if (r0 == 0) goto L21
            goto L140
        L21:
            android.graphics.PointF r0 = r5.h
            float r0 = r0.x
            float r1 = r6.getRawX()
            float r0 = r0 - r1
            float r1 = java.lang.Math.abs(r0)
            r4 = 1092616192(0x41200000, float:10.0)
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 > 0) goto L40
            int r1 = r5.getScrollX()
            int r1 = java.lang.Math.abs(r1)
            r4 = 10
            if (r1 <= r4) goto L47
        L40:
            android.view.ViewParent r1 = r5.getParent()
            r1.requestDisallowInterceptTouchEvent(r2)
        L47:
            float r1 = java.lang.Math.abs(r0)
            int r2 = r5.a
            float r2 = (float) r2
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L54
            r5.i = r3
        L54:
            int r0 = (int) r0
            r5.scrollBy(r0, r3)
            boolean r0 = r5.q
            if (r0 == 0) goto L71
            int r0 = r5.getScrollX()
            if (r0 >= 0) goto L65
            r5.scrollTo(r3, r3)
        L65:
            int r0 = r5.getScrollX()
            int r1 = r5.e
            if (r0 <= r1) goto L87
            r5.scrollTo(r1, r3)
            goto L87
        L71:
            int r0 = r5.getScrollX()
            int r1 = r5.e
            int r2 = -r1
            if (r0 >= r2) goto L7e
            int r0 = -r1
            r5.scrollTo(r0, r3)
        L7e:
            int r0 = r5.getScrollX()
            if (r0 <= 0) goto L87
            r5.scrollTo(r3, r3)
        L87:
            android.graphics.PointF r0 = r5.h
            float r1 = r6.getRawX()
            float r2 = r6.getRawY()
            r0.set(r1, r2)
            goto L140
        L96:
            float r1 = r6.getRawX()
            android.graphics.PointF r4 = r5.j
            float r4 = r4.x
            float r1 = r1 - r4
            float r1 = java.lang.Math.abs(r1)
            int r4 = r5.a
            float r4 = (float) r4
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 <= 0) goto Lac
            r5.k = r2
        Lac:
            boolean r1 = r5.p
            if (r1 != 0) goto Lf9
            int r1 = r5.b
            float r1 = (float) r1
            r2 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r2, r1)
            int r1 = r5.c
            float r0 = r0.getXVelocity(r1)
            float r1 = java.lang.Math.abs(r0)
            r2 = 1148846080(0x447a0000, float:1000.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto Le6
            r1 = -998637568(0xffffffffc47a0000, float:-1000.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto Lda
            boolean r0 = r5.q
            if (r0 == 0) goto Ld6
            r5.n()
            goto Lf9
        Ld6:
            r5.m()
            goto Lf9
        Lda:
            boolean r0 = r5.q
            if (r0 == 0) goto Le2
            r5.m()
            goto Lf9
        Le2:
            r5.n()
            goto Lf9
        Le6:
            int r0 = r5.getScrollX()
            int r0 = java.lang.Math.abs(r0)
            int r1 = r5.f
            if (r0 <= r1) goto Lf6
            r5.n()
            goto Lf9
        Lf6:
            r5.m()
        Lf9:
            r5.j()
            com.mcxtzhang.swipemenulib.SwipeMenuLayout.w = r3
            goto L140
        Lff:
            r5.k = r3
            r5.i = r2
            r5.p = r3
            boolean r0 = com.mcxtzhang.swipemenulib.SwipeMenuLayout.w
            if (r0 == 0) goto L10a
            return r3
        L10a:
            com.mcxtzhang.swipemenulib.SwipeMenuLayout.w = r2
            android.graphics.PointF r0 = r5.h
            float r1 = r6.getRawX()
            float r4 = r6.getRawY()
            r0.set(r1, r4)
            android.graphics.PointF r0 = r5.j
            float r1 = r6.getRawX()
            float r4 = r6.getRawY()
            r0.set(r1, r4)
            com.mcxtzhang.swipemenulib.SwipeMenuLayout r0 = com.mcxtzhang.swipemenulib.SwipeMenuLayout.v
            if (r0 == 0) goto L13a
            if (r0 == r5) goto L133
            r0.m()
            boolean r0 = r5.o
            r5.p = r0
        L133:
            android.view.ViewParent r0 = r5.getParent()
            r0.requestDisallowInterceptTouchEvent(r2)
        L13a:
            int r0 = r6.getPointerId(r3)
            r5.c = r0
        L140:
            boolean r6 = super.dispatchTouchEvent(r6)
            return r6
    }

    public boolean f() {
            r1 = this;
            boolean r0 = r1.o
            return r0
    }

    public boolean g() {
            r1 = this;
            boolean r0 = r1.q
            return r0
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            android.view.ViewGroup$MarginLayoutParams r0 = new android.view.ViewGroup$MarginLayoutParams
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    public boolean h() {
            r1 = this;
            boolean r0 = r1.n
            return r0
    }

    public void i() {
            r2 = this;
            com.mcxtzhang.swipemenulib.SwipeMenuLayout r0 = com.mcxtzhang.swipemenulib.SwipeMenuLayout.v
            if (r2 != r0) goto L10
            r2.c()
            com.mcxtzhang.swipemenulib.SwipeMenuLayout r0 = com.mcxtzhang.swipemenulib.SwipeMenuLayout.v
            r1 = 0
            r0.scrollTo(r1, r1)
            r0 = 0
            com.mcxtzhang.swipemenulib.SwipeMenuLayout.v = r0
        L10:
            return
    }

    public com.mcxtzhang.swipemenulib.SwipeMenuLayout k(boolean r1) {
            r0 = this;
            r0.o = r1
            return r0
    }

    public com.mcxtzhang.swipemenulib.SwipeMenuLayout l(boolean r1) {
            r0 = this;
            r0.q = r1
            return r0
    }

    public void m() {
            r3 = this;
            r0 = 0
            com.mcxtzhang.swipemenulib.SwipeMenuLayout.v = r0
            android.view.View r0 = r3.g
            if (r0 == 0) goto Lb
            r1 = 1
            r0.setLongClickable(r1)
        Lb:
            r3.c()
            int r0 = r3.getScrollX()
            r1 = 0
            int[] r0 = new int[]{r0, r1}
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofInt(r0)
            r3.s = r0
            com.mcxtzhang.swipemenulib.SwipeMenuLayout$c r1 = new com.mcxtzhang.swipemenulib.SwipeMenuLayout$c
            r1.<init>(r3)
            r0.addUpdateListener(r1)
            android.animation.ValueAnimator r0 = r3.s
            android.view.animation.AccelerateInterpolator r1 = new android.view.animation.AccelerateInterpolator
            r1.<init>()
            r0.setInterpolator(r1)
            android.animation.ValueAnimator r0 = r3.s
            com.mcxtzhang.swipemenulib.SwipeMenuLayout$d r1 = new com.mcxtzhang.swipemenulib.SwipeMenuLayout$d
            r1.<init>(r3)
            r0.addListener(r1)
            android.animation.ValueAnimator r0 = r3.s
            r1 = 300(0x12c, double:1.48E-321)
            android.animation.ValueAnimator r0 = r0.setDuration(r1)
            r0.start()
            return
    }

    public void n() {
            r3 = this;
            com.mcxtzhang.swipemenulib.SwipeMenuLayout.v = r3
            android.view.View r0 = r3.g
            if (r0 == 0) goto La
            r1 = 0
            r0.setLongClickable(r1)
        La:
            r3.c()
            int r0 = r3.getScrollX()
            boolean r1 = r3.q
            if (r1 == 0) goto L18
            int r1 = r3.e
            goto L1b
        L18:
            int r1 = r3.e
            int r1 = -r1
        L1b:
            int[] r0 = new int[]{r0, r1}
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofInt(r0)
            r3.r = r0
            com.mcxtzhang.swipemenulib.SwipeMenuLayout$a r1 = new com.mcxtzhang.swipemenulib.SwipeMenuLayout$a
            r1.<init>(r3)
            r0.addUpdateListener(r1)
            android.animation.ValueAnimator r0 = r3.r
            android.view.animation.OvershootInterpolator r1 = new android.view.animation.OvershootInterpolator
            r1.<init>()
            r0.setInterpolator(r1)
            android.animation.ValueAnimator r0 = r3.r
            com.mcxtzhang.swipemenulib.SwipeMenuLayout$b r1 = new com.mcxtzhang.swipemenulib.SwipeMenuLayout$b
            r1.<init>(r3)
            r0.addListener(r1)
            android.animation.ValueAnimator r0 = r3.r
            r1 = 300(0x12c, double:1.48E-321)
            android.animation.ValueAnimator r0 = r0.setDuration(r1)
            r0.start()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            com.mcxtzhang.swipemenulib.SwipeMenuLayout r0 = com.mcxtzhang.swipemenulib.SwipeMenuLayout.v
            if (r1 != r0) goto La
            r0.m()
            r0 = 0
            com.mcxtzhang.swipemenulib.SwipeMenuLayout.v = r0
        La:
            super.onDetachedFromWindow()
            return
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
            r4 = this;
            boolean r0 = r4.n
            if (r0 == 0) goto L73
            int r0 = r5.getAction()
            r1 = 1
            if (r0 == r1) goto L24
            r2 = 2
            if (r0 == r2) goto Lf
            goto L6e
        Lf:
            float r0 = r5.getRawX()
            android.graphics.PointF r2 = r4.j
            float r2 = r2.x
            float r0 = r0 - r2
            float r0 = java.lang.Math.abs(r0)
            int r2 = r4.a
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L6e
            return r1
        L24:
            boolean r0 = r4.q
            if (r0 == 0) goto L4a
            int r0 = r4.getScrollX()
            int r2 = r4.a
            if (r0 <= r2) goto L69
            float r0 = r5.getX()
            int r2 = r4.getWidth()
            int r3 = r4.getScrollX()
            int r2 = r2 - r3
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L69
            boolean r5 = r4.i
            if (r5 == 0) goto L49
            r4.m()
        L49:
            return r1
        L4a:
            int r0 = r4.getScrollX()
            int r0 = -r0
            int r2 = r4.a
            if (r0 <= r2) goto L69
            float r0 = r5.getX()
            int r2 = r4.getScrollX()
            int r2 = -r2
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L69
            boolean r5 = r4.i
            if (r5 == 0) goto L68
            r4.m()
        L68:
            return r1
        L69:
            boolean r0 = r4.k
            if (r0 == 0) goto L6e
            return r1
        L6e:
            boolean r0 = r4.p
            if (r0 == 0) goto L73
            return r1
        L73:
            boolean r5 = super.onInterceptTouchEvent(r5)
            return r5
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
            r4 = this;
            int r5 = r4.getChildCount()
            int r6 = r4.getPaddingLeft()
            int r7 = r4.getPaddingLeft()
            r8 = 0
        Ld:
            if (r8 >= r5) goto L74
            android.view.View r9 = r4.getChildAt(r8)
            int r0 = r9.getVisibility()
            r1 = 8
            if (r0 == r1) goto L71
            if (r8 != 0) goto L38
            int r0 = r4.getPaddingTop()
            int r1 = r9.getMeasuredWidth()
            int r1 = r1 + r6
            int r2 = r4.getPaddingTop()
            int r3 = r9.getMeasuredHeight()
            int r2 = r2 + r3
            r9.layout(r6, r0, r1, r2)
            int r9 = r9.getMeasuredWidth()
        L36:
            int r6 = r6 + r9
            goto L71
        L38:
            boolean r0 = r4.q
            if (r0 == 0) goto L56
            int r0 = r4.getPaddingTop()
            int r1 = r9.getMeasuredWidth()
            int r1 = r1 + r6
            int r2 = r4.getPaddingTop()
            int r3 = r9.getMeasuredHeight()
            int r2 = r2 + r3
            r9.layout(r6, r0, r1, r2)
            int r9 = r9.getMeasuredWidth()
            goto L36
        L56:
            int r0 = r9.getMeasuredWidth()
            int r0 = r7 - r0
            int r1 = r4.getPaddingTop()
            int r2 = r4.getPaddingTop()
            int r3 = r9.getMeasuredHeight()
            int r2 = r2 + r3
            r9.layout(r0, r1, r7, r2)
            int r9 = r9.getMeasuredWidth()
            int r7 = r7 - r9
        L71:
            int r8 = r8 + 1
            goto Ld
        L74:
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r11, int r12) {
            r10 = this;
            super.onMeasure(r11, r12)
            r0 = 1
            r10.setClickable(r0)
            r1 = 0
            r10.e = r1
            r10.d = r1
            int r2 = r10.getChildCount()
            int r3 = android.view.View.MeasureSpec.getMode(r12)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r3 == r4) goto L1a
            r3 = 1
            goto L1b
        L1a:
            r3 = 0
        L1b:
            r4 = 0
            r5 = 0
        L1d:
            if (r1 >= r2) goto L60
            android.view.View r6 = r10.getChildAt(r1)
            r6.setClickable(r0)
            int r7 = r6.getVisibility()
            r8 = 8
            if (r7 == r8) goto L5d
            r10.measureChild(r6, r11, r12)
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r7 = (android.view.ViewGroup.MarginLayoutParams) r7
            int r8 = r10.d
            int r9 = r6.getMeasuredHeight()
            int r8 = java.lang.Math.max(r8, r9)
            r10.d = r8
            if (r3 == 0) goto L4b
            int r7 = r7.height
            r8 = -1
            if (r7 != r8) goto L4b
            r5 = 1
        L4b:
            if (r1 <= 0) goto L57
            int r7 = r10.e
            int r6 = r6.getMeasuredWidth()
            int r7 = r7 + r6
            r10.e = r7
            goto L5d
        L57:
            r10.g = r6
            int r4 = r6.getMeasuredWidth()
        L5d:
            int r1 = r1 + 1
            goto L1d
        L60:
            int r12 = r10.getPaddingLeft()
            int r0 = r10.getPaddingRight()
            int r12 = r12 + r0
            int r12 = r12 + r4
            int r0 = r10.d
            int r1 = r10.getPaddingTop()
            int r0 = r0 + r1
            int r1 = r10.getPaddingBottom()
            int r0 = r0 + r1
            r10.setMeasuredDimension(r12, r0)
            int r12 = r10.e
            int r12 = r12 * 4
            int r12 = r12 / 10
            r10.f = r12
            if (r5 == 0) goto L86
            r10.d(r2, r11)
        L86:
            return
    }

    @Override // android.view.View
    public boolean performLongClick() {
            r2 = this;
            int r0 = r2.getScrollX()
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.a
            if (r0 <= r1) goto Le
            r0 = 0
            return r0
        Le:
            boolean r0 = super.performLongClick()
            return r0
    }

    public void setSwipeEnable(boolean r1) {
            r0 = this;
            r0.n = r1
            return
    }
}
