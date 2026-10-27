package com.scwang.smartrefresh.layout;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class SmartRefreshLayout extends android.view.ViewGroup implements l2.h, androidx.core.view.NestedScrollingParent, androidx.core.view.NestedScrollingChild {

    /* renamed from: i1, reason: collision with root package name */
    protected static boolean f2i1;

    /* renamed from: j1, reason: collision with root package name */
    protected static l2.a f3j1;

    /* renamed from: k1, reason: collision with root package name */
    protected static l2.b f4k1;
    protected boolean A;
    protected boolean B;
    protected boolean C;
    protected boolean D;
    protected boolean E;
    protected boolean F;
    protected com.scwang.smartrefresh.layout.constant.DimensionStatus F0;
    protected boolean G;
    protected int G0;
    protected boolean H;
    protected com.scwang.smartrefresh.layout.constant.DimensionStatus H0;
    protected boolean I;
    protected int I0;
    protected boolean J;
    protected int J0;
    protected boolean K;
    protected float K0;
    protected boolean L;
    protected float L0;
    protected boolean M;
    protected float M0;
    protected boolean N;
    protected float N0;
    protected boolean O;
    protected l2.e O0;
    protected boolean P;
    protected l2.d P0;
    protected boolean Q;
    protected l2.c Q0;
    protected m2.d R;
    protected android.graphics.Paint R0;
    protected m2.b S;
    protected android.os.Handler S0;
    protected m2.c T;
    protected l2.g T0;
    protected l2.i U;
    protected java.util.List<com.scwang.smartrefresh.layout.util.b> U0;
    protected int[] V;
    protected com.scwang.smartrefresh.layout.constant.RefreshState V0;
    protected int[] W;
    protected com.scwang.smartrefresh.layout.constant.RefreshState W0;
    protected boolean X0;
    protected long Y0;
    protected long Z0;
    protected int a;
    protected int a0;
    protected int a1;
    protected int b;
    protected boolean b0;
    protected int b1;
    protected int c;
    protected androidx.core.view.NestedScrollingChildHelper c0;
    protected boolean c1;
    protected int d;
    protected boolean d1;
    protected int e;
    android.view.MotionEvent e1;
    protected int f;
    protected android.animation.ValueAnimator f1;
    protected int g;
    protected android.animation.Animator.AnimatorListener g1;
    protected float h;

    /* renamed from: h1, reason: collision with root package name */
    protected android.animation.ValueAnimator.AnimatorUpdateListener f5h1;
    protected float i;
    protected float j;
    protected float k;
    protected androidx.core.view.NestedScrollingParentHelper k0;
    protected float l;
    protected boolean m;
    protected boolean n;
    protected boolean o;
    protected boolean p;
    protected int p0;
    protected android.view.animation.Interpolator q;
    protected int r;
    protected int s;
    protected int t;
    protected int u;
    protected android.widget.Scroller v;
    protected android.view.VelocityTracker w;
    protected int[] x;
    protected boolean y;
    protected boolean z;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements java.lang.Runnable {
        final /* synthetic */ boolean a;
        final /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout b;

        a(com.scwang.smartrefresh.layout.SmartRefreshLayout r1, boolean r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r13 = this;
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r13.b
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = r0.V0
                com.scwang.smartrefresh.layout.constant.RefreshState r2 = com.scwang.smartrefresh.layout.constant.RefreshState.Refreshing
                if (r1 != r2) goto L88
                l2.e r1 = r0.O0
                if (r1 == 0) goto L85
                l2.c r2 = r0.Q0
                if (r2 == 0) goto L85
                boolean r2 = r13.a
                int r0 = r1.w(r0, r2)
                r1 = 2147483647(0x7fffffff, float:NaN)
                r2 = 0
                if (r0 >= r1) goto L4a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r3 = r13.b
                boolean r4 = r3.m
                if (r4 == 0) goto L43
                r3.d = r2
                float r4 = r3.k
                r3.i = r4
                r3.m = r2
                long r5 = java.lang.System.currentTimeMillis()
                com.scwang.smartrefresh.layout.SmartRefreshLayout r3 = r13.b
                float r10 = r3.j
                float r4 = r3.i
                int r7 = r3.b
                float r7 = (float) r7
                float r11 = r4 + r7
                r12 = 0
                r9 = 0
                r7 = r5
                android.view.MotionEvent r4 = android.view.MotionEvent.obtain(r5, r7, r9, r10, r11, r12)
                r3.E1(r4)
            L43:
                com.scwang.smartrefresh.layout.SmartRefreshLayout r3 = r13.b
                com.scwang.smartrefresh.layout.constant.RefreshState r4 = com.scwang.smartrefresh.layout.constant.RefreshState.RefreshFinish
                r3.H0(r4)
            L4a:
                com.scwang.smartrefresh.layout.SmartRefreshLayout r3 = r13.b
                m2.c r4 = r3.T
                if (r4 == 0) goto L57
                l2.e r3 = r3.O0
                boolean r5 = r13.a
                r4.r(r3, r5)
            L57:
                if (r0 >= r1) goto L88
                com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = r13.b
                int r3 = r1.b
                if (r3 <= 0) goto L7b
                android.animation.ValueAnimator r0 = r1.n0(r2, r0)
                com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = r13.b
                boolean r2 = r1.J
                if (r2 == 0) goto L72
                l2.c r2 = r1.Q0
                int r1 = r1.b
                android.animation.ValueAnimator$AnimatorUpdateListener r1 = r2.e(r1)
                goto L73
            L72:
                r1 = 0
            L73:
                if (r0 == 0) goto L88
                if (r1 == 0) goto L88
                r0.addUpdateListener(r1)
                return
            L7b:
                r0 = 1
                r1.F0(r2, r0)
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r13.b
                r0.K0()
                return
            L85:
                r0.K0()
            L88:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements java.lang.Runnable {
        final /* synthetic */ boolean a;
        final /* synthetic */ boolean b;
        final /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout c;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements java.lang.Runnable {
            final /* synthetic */ int a;
            final /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout.b b;

            /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
            /* renamed from: com.scwang.smartrefresh.layout.SmartRefreshLayout$b$a$a, reason: collision with other inner class name */
            class C0182a extends android.animation.AnimatorListenerAdapter {
                final /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout.b.a a;

                C0182a(com.scwang.smartrefresh.layout.SmartRefreshLayout.b.a r1) {
                        r0 = this;
                        r0.a = r1
                        r0.<init>()
                        return
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(android.animation.Animator r2) {
                        r1 = this;
                        com.scwang.smartrefresh.layout.SmartRefreshLayout$b$a r2 = r1.a
                        com.scwang.smartrefresh.layout.SmartRefreshLayout$b r2 = r2.b
                        com.scwang.smartrefresh.layout.SmartRefreshLayout r2 = r2.c
                        r0 = 1
                        r2.i1(r0)
                        return
                }
            }

            a(com.scwang.smartrefresh.layout.SmartRefreshLayout.b r1, int r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r3 = this;
                    com.scwang.smartrefresh.layout.SmartRefreshLayout$b r0 = r3.b
                    com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r0.c
                    boolean r1 = r0.I
                    if (r1 == 0) goto L13
                    int r1 = r0.b
                    if (r1 >= 0) goto L13
                    l2.c r0 = r0.Q0
                    android.animation.ValueAnimator$AnimatorUpdateListener r0 = r0.e(r1)
                    goto L14
                L13:
                    r0 = 0
                L14:
                    r1 = 0
                    if (r0 == 0) goto L22
                    int[] r2 = new int[]{r1, r1}
                    android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofInt(r2)
                    r0.onAnimationUpdate(r2)
                L22:
                    if (r0 != 0) goto L44
                    com.scwang.smartrefresh.layout.SmartRefreshLayout$b r0 = r3.b
                    com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r0.c
                    int r2 = r0.b
                    if (r2 < 0) goto L2d
                    goto L44
                L2d:
                    int r2 = r3.a
                    android.animation.ValueAnimator r0 = r0.n0(r1, r2)
                    if (r0 == 0) goto L5e
                    com.scwang.smartrefresh.layout.SmartRefreshLayout$b r1 = r3.b
                    boolean r1 = r1.b
                    if (r1 == 0) goto L5e
                    com.scwang.smartrefresh.layout.SmartRefreshLayout$b$a$a r1 = new com.scwang.smartrefresh.layout.SmartRefreshLayout$b$a$a
                    r1.<init>(r3)
                    r0.addListener(r1)
                    return
                L44:
                    com.scwang.smartrefresh.layout.SmartRefreshLayout$b r0 = r3.b
                    com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r0.c
                    r2 = 1
                    r0.F0(r1, r2)
                    com.scwang.smartrefresh.layout.SmartRefreshLayout$b r0 = r3.b
                    com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r0.c
                    r0.K0()
                    com.scwang.smartrefresh.layout.SmartRefreshLayout$b r0 = r3.b
                    boolean r1 = r0.b
                    if (r1 == 0) goto L5e
                    com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r0.c
                    r0.i1(r2)
                L5e:
                    return
            }
        }

        b(com.scwang.smartrefresh.layout.SmartRefreshLayout r1, boolean r2, boolean r3) {
                r0 = this;
                r0.c = r1
                r0.a = r2
                r0.b = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r13 = this;
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r13.c
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = r0.V0
                com.scwang.smartrefresh.layout.constant.RefreshState r2 = com.scwang.smartrefresh.layout.constant.RefreshState.Loading
                if (r1 != r2) goto L72
                l2.d r1 = r0.P0
                if (r1 == 0) goto L6e
                l2.c r2 = r0.Q0
                if (r2 == 0) goto L6e
                boolean r2 = r13.a
                int r0 = r1.w(r0, r2)
                r1 = 2147483647(0x7fffffff, float:NaN)
                if (r0 >= r1) goto L4a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r2 = r13.c
                boolean r3 = r2.m
                if (r3 == 0) goto L43
                r3 = 0
                r2.d = r3
                float r4 = r2.k
                r2.i = r4
                r2.m = r3
                long r5 = java.lang.System.currentTimeMillis()
                com.scwang.smartrefresh.layout.SmartRefreshLayout r2 = r13.c
                float r10 = r2.j
                float r3 = r2.i
                int r4 = r2.b
                float r4 = (float) r4
                float r11 = r3 + r4
                r12 = 0
                r9 = 0
                r7 = r5
                android.view.MotionEvent r3 = android.view.MotionEvent.obtain(r5, r7, r9, r10, r11, r12)
                r2.E1(r3)
            L43:
                com.scwang.smartrefresh.layout.SmartRefreshLayout r2 = r13.c
                com.scwang.smartrefresh.layout.constant.RefreshState r3 = com.scwang.smartrefresh.layout.constant.RefreshState.LoadFinish
                r2.H0(r3)
            L4a:
                com.scwang.smartrefresh.layout.SmartRefreshLayout r2 = r13.c
                m2.c r3 = r2.T
                if (r3 == 0) goto L57
                l2.d r2 = r2.P0
                boolean r4 = r13.a
                r3.u(r2, r4)
            L57:
                if (r0 >= r1) goto L7a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = r13.c
                com.scwang.smartrefresh.layout.SmartRefreshLayout$b$a r2 = new com.scwang.smartrefresh.layout.SmartRefreshLayout$b$a
                r2.<init>(r13, r0)
                com.scwang.smartrefresh.layout.SmartRefreshLayout r3 = r13.c
                int r3 = r3.b
                if (r3 >= 0) goto L68
                long r3 = (long) r0
                goto L6a
            L68:
                r3 = 0
            L6a:
                r1.postDelayed(r2, r3)
                return
            L6e:
                r0.K0()
                return
            L72:
                boolean r1 = r13.b
                if (r1 == 0) goto L7a
                r1 = 1
                r0.i1(r1)
            L7a:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements java.lang.Runnable {
        final /* synthetic */ float a;
        final /* synthetic */ int b;
        final /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout c;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements android.animation.ValueAnimator.AnimatorUpdateListener {
            final /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout.c a;

            a(com.scwang.smartrefresh.layout.SmartRefreshLayout.c r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator r3) {
                    r2 = this;
                    com.scwang.smartrefresh.layout.SmartRefreshLayout$c r0 = r2.a
                    com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r0.c
                    java.lang.Object r3 = r3.getAnimatedValue()
                    java.lang.Integer r3 = (java.lang.Integer) r3
                    int r3 = r3.intValue()
                    r1 = 0
                    r0.F0(r3, r1)
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class b extends android.animation.AnimatorListenerAdapter {
            final /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout.c a;

            b(com.scwang.smartrefresh.layout.SmartRefreshLayout.c r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator r3) {
                    r2 = this;
                    com.scwang.smartrefresh.layout.SmartRefreshLayout$c r3 = r2.a
                    com.scwang.smartrefresh.layout.SmartRefreshLayout r3 = r3.c
                    r0 = 0
                    r3.f1 = r0
                    com.scwang.smartrefresh.layout.constant.RefreshState r0 = r3.V0
                    com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.ReleaseToRefresh
                    if (r0 == r1) goto L10
                    r3.D1()
                L10:
                    com.scwang.smartrefresh.layout.SmartRefreshLayout$c r3 = r2.a
                    com.scwang.smartrefresh.layout.SmartRefreshLayout r3 = r3.c
                    r3.I0()
                    return
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator r2) {
                    r1 = this;
                    com.scwang.smartrefresh.layout.SmartRefreshLayout$c r2 = r1.a
                    com.scwang.smartrefresh.layout.SmartRefreshLayout r2 = r2.c
                    int r0 = r2.getMeasuredWidth()
                    int r0 = r0 / 2
                    float r0 = (float) r0
                    r2.j = r0
                    com.scwang.smartrefresh.layout.SmartRefreshLayout$c r2 = r1.a
                    com.scwang.smartrefresh.layout.SmartRefreshLayout r2 = r2.c
                    r2.y1()
                    return
            }
        }

        c(com.scwang.smartrefresh.layout.SmartRefreshLayout r1, float r2, int r3) {
                r0 = this;
                r0.c = r1
                r0.a = r2
                r0.b = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r4.c
                int r1 = r0.b
                int r2 = r0.p0
                float r2 = (float) r2
                float r3 = r4.a
                float r2 = r2 * r3
                int r2 = (int) r2
                int[] r1 = new int[]{r1, r2}
                android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofInt(r1)
                r0.f1 = r1
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r4.c
                android.animation.ValueAnimator r0 = r0.f1
                int r1 = r4.b
                long r1 = (long) r1
                r0.setDuration(r1)
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r4.c
                android.animation.ValueAnimator r0 = r0.f1
                android.view.animation.DecelerateInterpolator r1 = new android.view.animation.DecelerateInterpolator
                r1.<init>()
                r0.setInterpolator(r1)
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r4.c
                android.animation.ValueAnimator r0 = r0.f1
                com.scwang.smartrefresh.layout.SmartRefreshLayout$c$a r1 = new com.scwang.smartrefresh.layout.SmartRefreshLayout$c$a
                r1.<init>(r4)
                r0.addUpdateListener(r1)
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r4.c
                android.animation.ValueAnimator r0 = r0.f1
                com.scwang.smartrefresh.layout.SmartRefreshLayout$c$b r1 = new com.scwang.smartrefresh.layout.SmartRefreshLayout$c$b
                r1.<init>(r4)
                r0.addListener(r1)
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r4.c
                android.animation.ValueAnimator r0 = r0.f1
                r0.start()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d implements java.lang.Runnable {
        final /* synthetic */ float a;
        final /* synthetic */ int b;
        final /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout c;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements android.animation.ValueAnimator.AnimatorUpdateListener {
            final /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout.d a;

            a(com.scwang.smartrefresh.layout.SmartRefreshLayout.d r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator r3) {
                    r2 = this;
                    com.scwang.smartrefresh.layout.SmartRefreshLayout$d r0 = r2.a
                    com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r0.c
                    java.lang.Object r3 = r3.getAnimatedValue()
                    java.lang.Integer r3 = (java.lang.Integer) r3
                    int r3 = r3.intValue()
                    r1 = 0
                    r0.F0(r3, r1)
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class b extends android.animation.AnimatorListenerAdapter {
            final /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout.d a;

            b(com.scwang.smartrefresh.layout.SmartRefreshLayout.d r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator r3) {
                    r2 = this;
                    com.scwang.smartrefresh.layout.SmartRefreshLayout$d r3 = r2.a
                    com.scwang.smartrefresh.layout.SmartRefreshLayout r3 = r3.c
                    r0 = 0
                    r3.f1 = r0
                    com.scwang.smartrefresh.layout.constant.RefreshState r0 = r3.V0
                    com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.ReleaseToLoad
                    if (r0 == r1) goto L10
                    r3.C1()
                L10:
                    com.scwang.smartrefresh.layout.SmartRefreshLayout$d r3 = r2.a
                    com.scwang.smartrefresh.layout.SmartRefreshLayout r3 = r3.c
                    boolean r0 = r3.G
                    if (r0 == 0) goto L26
                    r0 = 0
                    r3.G = r0
                    r3.I0()
                    com.scwang.smartrefresh.layout.SmartRefreshLayout$d r3 = r2.a
                    com.scwang.smartrefresh.layout.SmartRefreshLayout r3 = r3.c
                    r0 = 1
                    r3.G = r0
                    return
                L26:
                    r3.I0()
                    return
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator r2) {
                    r1 = this;
                    com.scwang.smartrefresh.layout.SmartRefreshLayout$d r2 = r1.a
                    com.scwang.smartrefresh.layout.SmartRefreshLayout r2 = r2.c
                    int r0 = r2.getMeasuredWidth()
                    int r0 = r0 / 2
                    float r0 = (float) r0
                    r2.j = r0
                    com.scwang.smartrefresh.layout.SmartRefreshLayout$d r2 = r1.a
                    com.scwang.smartrefresh.layout.SmartRefreshLayout r2 = r2.c
                    r2.A1()
                    return
            }
        }

        d(com.scwang.smartrefresh.layout.SmartRefreshLayout r1, float r2, int r3) {
                r0 = this;
                r0.c = r1
                r0.a = r2
                r0.b = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r4.c
                int r1 = r0.b
                int r2 = r0.G0
                float r2 = (float) r2
                float r3 = r4.a
                float r2 = r2 * r3
                int r2 = (int) r2
                int r2 = -r2
                int[] r1 = new int[]{r1, r2}
                android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofInt(r1)
                r0.f1 = r1
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r4.c
                android.animation.ValueAnimator r0 = r0.f1
                int r1 = r4.b
                long r1 = (long) r1
                r0.setDuration(r1)
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r4.c
                android.animation.ValueAnimator r0 = r0.f1
                android.view.animation.DecelerateInterpolator r1 = new android.view.animation.DecelerateInterpolator
                r1.<init>()
                r0.setInterpolator(r1)
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r4.c
                android.animation.ValueAnimator r0 = r0.f1
                com.scwang.smartrefresh.layout.SmartRefreshLayout$d$a r1 = new com.scwang.smartrefresh.layout.SmartRefreshLayout$d$a
                r1.<init>(r4)
                r0.addUpdateListener(r1)
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r4.c
                android.animation.ValueAnimator r0 = r0.f1
                com.scwang.smartrefresh.layout.SmartRefreshLayout$d$b r1 = new com.scwang.smartrefresh.layout.SmartRefreshLayout$d$b
                r1.<init>(r4)
                r0.addListener(r1)
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r4.c
                android.animation.ValueAnimator r0 = r0.f1
                r0.start()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class e {
        static final /* synthetic */ int[] a = null;
        static final /* synthetic */ int[] b = null;

        static {
                com.scwang.smartrefresh.layout.constant.RefreshState[] r0 = com.scwang.smartrefresh.layout.constant.RefreshState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.scwang.smartrefresh.layout.SmartRefreshLayout.e.b = r0
                r1 = 1
                com.scwang.smartrefresh.layout.constant.RefreshState r2 = com.scwang.smartrefresh.layout.constant.RefreshState.None     // Catch: java.lang.NoSuchFieldError -> L12
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                r0 = 2
                int[] r2 = com.scwang.smartrefresh.layout.SmartRefreshLayout.e.b     // Catch: java.lang.NoSuchFieldError -> L1d
                com.scwang.smartrefresh.layout.constant.RefreshState r3 = com.scwang.smartrefresh.layout.constant.RefreshState.PullDownToRefresh     // Catch: java.lang.NoSuchFieldError -> L1d
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r2 = com.scwang.smartrefresh.layout.SmartRefreshLayout.e.b     // Catch: java.lang.NoSuchFieldError -> L28
                com.scwang.smartrefresh.layout.constant.RefreshState r3 = com.scwang.smartrefresh.layout.constant.RefreshState.PullToUpLoad     // Catch: java.lang.NoSuchFieldError -> L28
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r4 = 3
                r2[r3] = r4     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r2 = com.scwang.smartrefresh.layout.SmartRefreshLayout.e.b     // Catch: java.lang.NoSuchFieldError -> L33
                com.scwang.smartrefresh.layout.constant.RefreshState r3 = com.scwang.smartrefresh.layout.constant.RefreshState.PullDownCanceled     // Catch: java.lang.NoSuchFieldError -> L33
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r4 = 4
                r2[r3] = r4     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r2 = com.scwang.smartrefresh.layout.SmartRefreshLayout.e.b     // Catch: java.lang.NoSuchFieldError -> L3e
                com.scwang.smartrefresh.layout.constant.RefreshState r3 = com.scwang.smartrefresh.layout.constant.RefreshState.PullUpCanceled     // Catch: java.lang.NoSuchFieldError -> L3e
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r4 = 5
                r2[r3] = r4     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r2 = com.scwang.smartrefresh.layout.SmartRefreshLayout.e.b     // Catch: java.lang.NoSuchFieldError -> L49
                com.scwang.smartrefresh.layout.constant.RefreshState r3 = com.scwang.smartrefresh.layout.constant.RefreshState.ReleaseToRefresh     // Catch: java.lang.NoSuchFieldError -> L49
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r4 = 6
                r2[r3] = r4     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r2 = com.scwang.smartrefresh.layout.SmartRefreshLayout.e.b     // Catch: java.lang.NoSuchFieldError -> L54
                com.scwang.smartrefresh.layout.constant.RefreshState r3 = com.scwang.smartrefresh.layout.constant.RefreshState.ReleaseToLoad     // Catch: java.lang.NoSuchFieldError -> L54
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r4 = 7
                r2[r3] = r4     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r2 = com.scwang.smartrefresh.layout.SmartRefreshLayout.e.b     // Catch: java.lang.NoSuchFieldError -> L60
                com.scwang.smartrefresh.layout.constant.RefreshState r3 = com.scwang.smartrefresh.layout.constant.RefreshState.ReleaseToTwoLevel     // Catch: java.lang.NoSuchFieldError -> L60
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r4 = 8
                r2[r3] = r4     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                int[] r2 = com.scwang.smartrefresh.layout.SmartRefreshLayout.e.b     // Catch: java.lang.NoSuchFieldError -> L6c
                com.scwang.smartrefresh.layout.constant.RefreshState r3 = com.scwang.smartrefresh.layout.constant.RefreshState.RefreshReleased     // Catch: java.lang.NoSuchFieldError -> L6c
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6c
                r4 = 9
                r2[r3] = r4     // Catch: java.lang.NoSuchFieldError -> L6c
            L6c:
                int[] r2 = com.scwang.smartrefresh.layout.SmartRefreshLayout.e.b     // Catch: java.lang.NoSuchFieldError -> L78
                com.scwang.smartrefresh.layout.constant.RefreshState r3 = com.scwang.smartrefresh.layout.constant.RefreshState.LoadReleased     // Catch: java.lang.NoSuchFieldError -> L78
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L78
                r4 = 10
                r2[r3] = r4     // Catch: java.lang.NoSuchFieldError -> L78
            L78:
                int[] r2 = com.scwang.smartrefresh.layout.SmartRefreshLayout.e.b     // Catch: java.lang.NoSuchFieldError -> L84
                com.scwang.smartrefresh.layout.constant.RefreshState r3 = com.scwang.smartrefresh.layout.constant.RefreshState.Refreshing     // Catch: java.lang.NoSuchFieldError -> L84
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L84
                r4 = 11
                r2[r3] = r4     // Catch: java.lang.NoSuchFieldError -> L84
            L84:
                int[] r2 = com.scwang.smartrefresh.layout.SmartRefreshLayout.e.b     // Catch: java.lang.NoSuchFieldError -> L90
                com.scwang.smartrefresh.layout.constant.RefreshState r3 = com.scwang.smartrefresh.layout.constant.RefreshState.Loading     // Catch: java.lang.NoSuchFieldError -> L90
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L90
                r4 = 12
                r2[r3] = r4     // Catch: java.lang.NoSuchFieldError -> L90
            L90:
                int[] r2 = com.scwang.smartrefresh.layout.SmartRefreshLayout.e.b     // Catch: java.lang.NoSuchFieldError -> L9c
                com.scwang.smartrefresh.layout.constant.RefreshState r3 = com.scwang.smartrefresh.layout.constant.RefreshState.RefreshFinish     // Catch: java.lang.NoSuchFieldError -> L9c
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L9c
                r4 = 13
                r2[r3] = r4     // Catch: java.lang.NoSuchFieldError -> L9c
            L9c:
                int[] r2 = com.scwang.smartrefresh.layout.SmartRefreshLayout.e.b     // Catch: java.lang.NoSuchFieldError -> La8
                com.scwang.smartrefresh.layout.constant.RefreshState r3 = com.scwang.smartrefresh.layout.constant.RefreshState.LoadFinish     // Catch: java.lang.NoSuchFieldError -> La8
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> La8
                r4 = 14
                r2[r3] = r4     // Catch: java.lang.NoSuchFieldError -> La8
            La8:
                com.scwang.smartrefresh.layout.constant.SpinnerStyle[] r2 = com.scwang.smartrefresh.layout.constant.SpinnerStyle.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                com.scwang.smartrefresh.layout.SmartRefreshLayout.e.a = r2
                com.scwang.smartrefresh.layout.constant.SpinnerStyle r3 = com.scwang.smartrefresh.layout.constant.SpinnerStyle.Translate     // Catch: java.lang.NoSuchFieldError -> Lb9
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lb9
                r2[r3] = r1     // Catch: java.lang.NoSuchFieldError -> Lb9
            Lb9:
                int[] r1 = com.scwang.smartrefresh.layout.SmartRefreshLayout.e.a     // Catch: java.lang.NoSuchFieldError -> Lc3
                com.scwang.smartrefresh.layout.constant.SpinnerStyle r2 = com.scwang.smartrefresh.layout.constant.SpinnerStyle.Scale     // Catch: java.lang.NoSuchFieldError -> Lc3
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lc3
                r1[r2] = r0     // Catch: java.lang.NoSuchFieldError -> Lc3
            Lc3:
                return
        }

        public e() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class f implements l2.a {
        f() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        public l2.d a(android.content.Context r1, l2.h r2) {
                r0 = this;
                com.scwang.smartrefresh.layout.footer.BallPulseFooter r2 = new com.scwang.smartrefresh.layout.footer.BallPulseFooter
                r2.<init>(r1)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class g implements l2.b {
        g() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        public l2.e a(android.content.Context r1, l2.h r2) {
                r0 = this;
                com.scwang.smartrefresh.layout.header.BezierRadarHeader r2 = new com.scwang.smartrefresh.layout.header.BezierRadarHeader
                r2.<init>(r1)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class h implements m2.d {
        final /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout a;

        h(com.scwang.smartrefresh.layout.SmartRefreshLayout r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void n(l2.h r2) {
                r1 = this;
                r0 = 3000(0xbb8, float:4.204E-42)
                r2.A(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class i implements m2.b {
        final /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout a;

        i(com.scwang.smartrefresh.layout.SmartRefreshLayout r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void m(l2.h r2) {
                r1 = this;
                r0 = 2000(0x7d0, float:2.803E-42)
                r2.P(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class j extends android.animation.AnimatorListenerAdapter {
        final /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout a;

        j(com.scwang.smartrefresh.layout.SmartRefreshLayout r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r1) {
                r0 = this;
                com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = r0.a
                r1.v1()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class k extends android.animation.AnimatorListenerAdapter {
        final /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout a;

        k(com.scwang.smartrefresh.layout.SmartRefreshLayout r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r4) {
                r3 = this;
                com.scwang.smartrefresh.layout.SmartRefreshLayout r4 = r3.a
                long r0 = java.lang.System.currentTimeMillis()
                r4.Z0 = r0
                com.scwang.smartrefresh.layout.SmartRefreshLayout r4 = r3.a
                com.scwang.smartrefresh.layout.constant.RefreshState r0 = com.scwang.smartrefresh.layout.constant.RefreshState.Refreshing
                r4.H0(r0)
                com.scwang.smartrefresh.layout.SmartRefreshLayout r4 = r3.a
                m2.d r0 = r4.R
                if (r0 == 0) goto L18
                r0.n(r4)
            L18:
                com.scwang.smartrefresh.layout.SmartRefreshLayout r4 = r3.a
                l2.e r0 = r4.O0
                if (r0 == 0) goto L25
                int r1 = r4.p0
                int r2 = r4.I0
                r0.t(r4, r1, r2)
            L25:
                com.scwang.smartrefresh.layout.SmartRefreshLayout r4 = r3.a
                m2.c r0 = r4.T
                if (r0 == 0) goto L3b
                r0.n(r4)
                com.scwang.smartrefresh.layout.SmartRefreshLayout r4 = r3.a
                m2.c r0 = r4.T
                l2.e r1 = r4.O0
                int r2 = r4.p0
                int r4 = r4.I0
                r0.s(r1, r2, r4)
            L3b:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class l extends android.animation.AnimatorListenerAdapter {
        final /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout a;

        l(com.scwang.smartrefresh.layout.SmartRefreshLayout r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r3) {
                r2 = this;
                com.scwang.smartrefresh.layout.SmartRefreshLayout r3 = r2.a
                r0 = 0
                r3.f1 = r0
                int r0 = r3.b
                if (r0 != 0) goto L17
                com.scwang.smartrefresh.layout.constant.RefreshState r0 = r3.V0
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.None
                if (r0 == r1) goto L20
                boolean r0 = r0.opening
                if (r0 != 0) goto L20
                r3.H0(r1)
                return
            L17:
                com.scwang.smartrefresh.layout.constant.RefreshState r0 = r3.V0
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = r3.W0
                if (r0 == r1) goto L20
                r3.setViceState(r0)
            L20:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class m implements android.animation.ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout a;

        m(com.scwang.smartrefresh.layout.SmartRefreshLayout r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(android.animation.ValueAnimator r3) {
                r2 = this;
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r2.a
                java.lang.Object r3 = r3.getAnimatedValue()
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                r1 = 1
                r0.F0(r3, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class n extends android.animation.AnimatorListenerAdapter {
        final /* synthetic */ int a;
        final /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout b;

        n(com.scwang.smartrefresh.layout.SmartRefreshLayout r1, int r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r3) {
                r2 = this;
                com.scwang.smartrefresh.layout.SmartRefreshLayout r3 = r2.b
                int r0 = r3.b
                r1 = 0
                int[] r0 = new int[]{r0, r1}
                android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofInt(r0)
                r3.f1 = r0
                com.scwang.smartrefresh.layout.SmartRefreshLayout r3 = r2.b
                android.animation.ValueAnimator r3 = r3.f1
                int r0 = r2.a
                long r0 = (long) r0
                r3.setDuration(r0)
                com.scwang.smartrefresh.layout.SmartRefreshLayout r3 = r2.b
                android.animation.ValueAnimator r3 = r3.f1
                android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
                r0.<init>()
                r3.setInterpolator(r0)
                com.scwang.smartrefresh.layout.SmartRefreshLayout r3 = r2.b
                android.animation.ValueAnimator r0 = r3.f1
                android.animation.ValueAnimator$AnimatorUpdateListener r3 = r3.f5h1
                r0.addUpdateListener(r3)
                com.scwang.smartrefresh.layout.SmartRefreshLayout r3 = r2.b
                android.animation.ValueAnimator r0 = r3.f1
                android.animation.Animator$AnimatorListener r3 = r3.g1
                r0.addListener(r3)
                com.scwang.smartrefresh.layout.SmartRefreshLayout r3 = r2.b
                android.animation.ValueAnimator r3 = r3.f1
                r3.start()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator r1) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class o extends android.view.ViewGroup.MarginLayoutParams {
        public int a;
        public com.scwang.smartrefresh.layout.constant.SpinnerStyle b;

        public o(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = 0
                r0.a = r1
                r1 = 0
                r0.b = r1
                return
        }

        public o(android.content.Context r3, android.util.AttributeSet r4) {
                r2 = this;
                r2.<init>(r3, r4)
                r0 = 0
                r2.a = r0
                r0 = 0
                r2.b = r0
                int[] r0 = com.scwang.smartrefresh.layout.R.styleable.SmartRefreshLayout_Layout
                android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r0)
                int r4 = com.scwang.smartrefresh.layout.R.styleable.SmartRefreshLayout_Layout_layout_srlBackgroundColor
                int r0 = r2.a
                int r4 = r3.getColor(r4, r0)
                r2.a = r4
                int r4 = com.scwang.smartrefresh.layout.R.styleable.SmartRefreshLayout_Layout_layout_srlSpinnerStyle
                boolean r0 = r3.hasValue(r4)
                if (r0 == 0) goto L33
                com.scwang.smartrefresh.layout.constant.SpinnerStyle[] r0 = com.scwang.smartrefresh.layout.constant.SpinnerStyle.values()
                com.scwang.smartrefresh.layout.constant.SpinnerStyle r1 = com.scwang.smartrefresh.layout.constant.SpinnerStyle.Translate
                int r1 = r1.ordinal()
                int r4 = r3.getInt(r4, r1)
                r4 = r0[r4]
                r2.b = r4
            L33:
                r3.recycle()
                return
        }

        public o(android.view.ViewGroup.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = 0
                r0.a = r1
                r1 = 0
                r0.b = r1
                return
        }

        public o(android.view.ViewGroup.MarginLayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = 0
                r0.a = r1
                r1 = 0
                r0.b = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class p implements l2.g {
        com.scwang.smartrefresh.layout.SmartRefreshLayout a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a extends android.animation.AnimatorListenerAdapter {
            final /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout.p a;

            a(com.scwang.smartrefresh.layout.SmartRefreshLayout.p r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator r2) {
                    r1 = this;
                    com.scwang.smartrefresh.layout.SmartRefreshLayout$p r2 = r1.a
                    com.scwang.smartrefresh.layout.SmartRefreshLayout r2 = r2.a
                    com.scwang.smartrefresh.layout.constant.RefreshState r0 = com.scwang.smartrefresh.layout.constant.RefreshState.TwoLevel
                    r2.H0(r0)
                    return
            }
        }

        public p(com.scwang.smartrefresh.layout.SmartRefreshLayout r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        public l2.g a() {
                r3 = this;
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r3.a
                com.scwang.smartrefresh.layout.constant.DimensionStatus r1 = r0.F0
                boolean r2 = r1.notifyed
                if (r2 == 0) goto Le
                com.scwang.smartrefresh.layout.constant.DimensionStatus r1 = r1.unNotify()
                r0.F0 = r1
            Le:
                return r3
        }

        public l2.g b(int r2) {
                r1 = this;
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r1.a
                r0.m0(r2)
                return r1
        }

        @androidx.annotation.NonNull
        public l2.h c() {
                r1 = this;
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r1.a
                return r0
        }

        public l2.g d(boolean r2) {
                r1 = this;
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r1.a
                r0.d1 = r2
                return r1
        }

        public l2.g e(@androidx.annotation.NonNull com.scwang.smartrefresh.layout.constant.RefreshState r3) {
                r2 = this;
                int[] r0 = com.scwang.smartrefresh.layout.SmartRefreshLayout.e.b
                int r3 = r3.ordinal()
                r3 = r0[r3]
                switch(r3) {
                    case 1: goto Lb9;
                    case 2: goto Lb3;
                    case 3: goto Lad;
                    case 4: goto La7;
                    case 5: goto La1;
                    case 6: goto L9b;
                    case 7: goto L95;
                    case 8: goto L77;
                    case 9: goto L59;
                    case 10: goto L39;
                    case 11: goto L32;
                    case 12: goto L2b;
                    case 13: goto L1c;
                    case 14: goto Ld;
                    default: goto Lb;
                }
            Lb:
                goto Lbe
            Ld:
                com.scwang.smartrefresh.layout.SmartRefreshLayout r3 = r2.a
                com.scwang.smartrefresh.layout.constant.RefreshState r0 = r3.V0
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.Loading
                if (r0 != r1) goto Lbe
                com.scwang.smartrefresh.layout.constant.RefreshState r0 = com.scwang.smartrefresh.layout.constant.RefreshState.LoadFinish
                r3.H0(r0)
                goto Lbe
            L1c:
                com.scwang.smartrefresh.layout.SmartRefreshLayout r3 = r2.a
                com.scwang.smartrefresh.layout.constant.RefreshState r0 = r3.V0
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.Refreshing
                if (r0 != r1) goto Lbe
                com.scwang.smartrefresh.layout.constant.RefreshState r0 = com.scwang.smartrefresh.layout.constant.RefreshState.RefreshFinish
                r3.H0(r0)
                goto Lbe
            L2b:
                com.scwang.smartrefresh.layout.SmartRefreshLayout r3 = r2.a
                r3.w1()
                goto Lbe
            L32:
                com.scwang.smartrefresh.layout.SmartRefreshLayout r3 = r2.a
                r3.B1()
                goto Lbe
            L39:
                com.scwang.smartrefresh.layout.SmartRefreshLayout r3 = r2.a
                com.scwang.smartrefresh.layout.constant.RefreshState r0 = r3.V0
                boolean r0 = r0.opening
                if (r0 != 0) goto L50
                boolean r3 = r3.y()
                if (r3 == 0) goto L50
                com.scwang.smartrefresh.layout.SmartRefreshLayout r3 = r2.a
                com.scwang.smartrefresh.layout.constant.RefreshState r0 = com.scwang.smartrefresh.layout.constant.RefreshState.LoadReleased
                r3.H0(r0)
                goto Lbe
            L50:
                com.scwang.smartrefresh.layout.SmartRefreshLayout r3 = r2.a
                com.scwang.smartrefresh.layout.constant.RefreshState r0 = com.scwang.smartrefresh.layout.constant.RefreshState.LoadReleased
                r3.setViceState(r0)
                goto Lbe
            L59:
                com.scwang.smartrefresh.layout.SmartRefreshLayout r3 = r2.a
                com.scwang.smartrefresh.layout.constant.RefreshState r0 = r3.V0
                boolean r0 = r0.opening
                if (r0 != 0) goto L6f
                boolean r3 = r3.f0()
                if (r3 == 0) goto L6f
                com.scwang.smartrefresh.layout.SmartRefreshLayout r3 = r2.a
                com.scwang.smartrefresh.layout.constant.RefreshState r0 = com.scwang.smartrefresh.layout.constant.RefreshState.RefreshReleased
                r3.H0(r0)
                goto Lbe
            L6f:
                com.scwang.smartrefresh.layout.SmartRefreshLayout r3 = r2.a
                com.scwang.smartrefresh.layout.constant.RefreshState r0 = com.scwang.smartrefresh.layout.constant.RefreshState.RefreshReleased
                r3.setViceState(r0)
                goto Lbe
            L77:
                com.scwang.smartrefresh.layout.SmartRefreshLayout r3 = r2.a
                com.scwang.smartrefresh.layout.constant.RefreshState r0 = r3.V0
                boolean r0 = r0.opening
                if (r0 != 0) goto L8d
                boolean r3 = r3.f0()
                if (r3 == 0) goto L8d
                com.scwang.smartrefresh.layout.SmartRefreshLayout r3 = r2.a
                com.scwang.smartrefresh.layout.constant.RefreshState r0 = com.scwang.smartrefresh.layout.constant.RefreshState.ReleaseToTwoLevel
                r3.H0(r0)
                goto Lbe
            L8d:
                com.scwang.smartrefresh.layout.SmartRefreshLayout r3 = r2.a
                com.scwang.smartrefresh.layout.constant.RefreshState r0 = com.scwang.smartrefresh.layout.constant.RefreshState.ReleaseToTwoLevel
                r3.setViceState(r0)
                goto Lbe
            L95:
                com.scwang.smartrefresh.layout.SmartRefreshLayout r3 = r2.a
                r3.C1()
                goto Lbe
            L9b:
                com.scwang.smartrefresh.layout.SmartRefreshLayout r3 = r2.a
                r3.D1()
                goto Lbe
            La1:
                com.scwang.smartrefresh.layout.SmartRefreshLayout r3 = r2.a
                r3.z1()
                goto Lbe
            La7:
                com.scwang.smartrefresh.layout.SmartRefreshLayout r3 = r2.a
                r3.x1()
                goto Lbe
            Lad:
                com.scwang.smartrefresh.layout.SmartRefreshLayout r3 = r2.a
                r3.A1()
                goto Lbe
            Lb3:
                com.scwang.smartrefresh.layout.SmartRefreshLayout r3 = r2.a
                r3.y1()
                goto Lbe
            Lb9:
                com.scwang.smartrefresh.layout.SmartRefreshLayout r3 = r2.a
                r3.K0()
            Lbe:
                r3 = 0
                return r3
        }

        public l2.g f(int r3) {
                r2 = this;
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r2.a
                android.graphics.Paint r1 = r0.R0
                if (r1 != 0) goto Lf
                if (r3 == 0) goto Lf
                android.graphics.Paint r1 = new android.graphics.Paint
                r1.<init>()
                r0.R0 = r1
            Lf:
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r2.a
                r0.a1 = r3
                return r2
        }

        public void g() {
                r3 = this;
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r3.a
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = r0.V0
                com.scwang.smartrefresh.layout.constant.RefreshState r2 = com.scwang.smartrefresh.layout.constant.RefreshState.TwoLevel
                if (r1 != r2) goto L2c
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.TwoLevelFinish
                r0.H0(r1)
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r3.a
                int r1 = r0.b
                r2 = 0
                if (r1 != 0) goto L20
                r0 = 1
                r3.k(r2, r0)
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r3.a
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.None
                r0.H0(r1)
                return
            L20:
                android.animation.ValueAnimator r0 = r0.m0(r2)
                com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = r3.a
                int r1 = r1.e
                long r1 = (long) r1
                r0.setDuration(r1)
            L2c:
                return
        }

        public l2.g h(int r2) {
                r1 = this;
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r1.a
                r0.e = r2
                return r1
        }

        public l2.g i(boolean r2) {
                r1 = this;
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r1.a
                r0.c1 = r2
                return r1
        }

        public void j(boolean r4) {
                r3 = this;
                if (r4 == 0) goto L28
                com.scwang.smartrefresh.layout.SmartRefreshLayout$p$a r4 = new com.scwang.smartrefresh.layout.SmartRefreshLayout$p$a
                r4.<init>(r3)
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r3.a
                int r1 = r0.getMeasuredHeight()
                android.animation.ValueAnimator r0 = r0.m0(r1)
                if (r0 == 0) goto L23
                com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = r3.a
                android.animation.ValueAnimator r2 = r1.f1
                if (r0 != r2) goto L23
                int r1 = r1.e
                long r1 = (long) r1
                r0.setDuration(r1)
                r0.addListener(r4)
                return
            L23:
                r0 = 0
                r4.onAnimationEnd(r0)
                return
            L28:
                r4 = 0
                l2.g r4 = r3.b(r4)
                if (r4 != 0) goto L36
                com.scwang.smartrefresh.layout.SmartRefreshLayout r4 = r3.a
                com.scwang.smartrefresh.layout.constant.RefreshState r0 = com.scwang.smartrefresh.layout.constant.RefreshState.None
                r4.H0(r0)
            L36:
                return
        }

        public l2.g k(int r2, boolean r3) {
                r1 = this;
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r1.a
                r0.F0(r2, r3)
                return r1
        }

        public l2.g l(boolean r3) {
                r2 = this;
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r2.a
                boolean r1 = r0.Q
                if (r1 != 0) goto Lb
                r1 = 1
                r0.Q = r1
                r0.A = r3
            Lb:
                return r2
        }

        @androidx.annotation.NonNull
        public l2.c m() {
                r1 = this;
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r1.a
                l2.c r0 = r0.Q0
                return r0
        }

        public l2.g n(int r3) {
                r2 = this;
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r2.a
                android.graphics.Paint r1 = r0.R0
                if (r1 != 0) goto Lf
                if (r3 == 0) goto Lf
                android.graphics.Paint r1 = new android.graphics.Paint
                r1.<init>()
                r0.R0 = r1
            Lf:
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r2.a
                r0.b1 = r3
                return r2
        }

        public l2.g o() {
                r3 = this;
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r3.a
                com.scwang.smartrefresh.layout.constant.DimensionStatus r1 = r0.H0
                boolean r2 = r1.notifyed
                if (r2 == 0) goto Le
                com.scwang.smartrefresh.layout.constant.DimensionStatus r1 = r1.unNotify()
                r0.H0 = r1
            Le:
                return r3
        }
    }

    static {
            com.scwang.smartrefresh.layout.SmartRefreshLayout$f r0 = new com.scwang.smartrefresh.layout.SmartRefreshLayout$f
            r0.<init>()
            com.scwang.smartrefresh.layout.SmartRefreshLayout.f3j1 = r0
            com.scwang.smartrefresh.layout.SmartRefreshLayout$g r0 = new com.scwang.smartrefresh.layout.SmartRefreshLayout$g
            r0.<init>()
            com.scwang.smartrefresh.layout.SmartRefreshLayout.f4k1 = r0
            return
    }

    public SmartRefreshLayout(android.content.Context r5) {
            r4 = this;
            r4.<init>(r5)
            r0 = 250(0xfa, float:3.5E-43)
            r4.e = r0
            r4.f = r0
            r0 = 1056964608(0x3f000000, float:0.5)
            r4.l = r0
            r0 = 1
            r4.y = r0
            r1 = 0
            r4.z = r1
            r4.A = r0
            r4.B = r0
            r4.C = r1
            r4.D = r0
            r4.E = r0
            r4.F = r0
            r4.G = r0
            r4.H = r1
            r4.I = r0
            r4.J = r0
            r4.K = r0
            r4.L = r1
            r4.M = r1
            r4.N = r1
            r4.O = r1
            r4.P = r1
            r4.Q = r1
            r0 = 2
            int[] r2 = new int[r0]
            r4.V = r2
            int[] r0 = new int[r0]
            r4.W = r0
            com.scwang.smartrefresh.layout.constant.DimensionStatus r0 = com.scwang.smartrefresh.layout.constant.DimensionStatus.DefaultUnNotify
            r4.F0 = r0
            r4.H0 = r0
            r0 = 1075838976(0x40200000, float:2.5)
            r4.K0 = r0
            r4.L0 = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r4.M0 = r0
            r4.N0 = r0
            com.scwang.smartrefresh.layout.constant.RefreshState r0 = com.scwang.smartrefresh.layout.constant.RefreshState.None
            r4.V0 = r0
            r4.W0 = r0
            r4.X0 = r1
            r2 = 0
            r4.Y0 = r2
            r4.Z0 = r2
            r4.a1 = r1
            r4.b1 = r1
            r0 = 0
            r4.e1 = r0
            com.scwang.smartrefresh.layout.SmartRefreshLayout$l r1 = new com.scwang.smartrefresh.layout.SmartRefreshLayout$l
            r1.<init>(r4)
            r4.g1 = r1
            com.scwang.smartrefresh.layout.SmartRefreshLayout$m r1 = new com.scwang.smartrefresh.layout.SmartRefreshLayout$m
            r1.<init>(r4)
            r4.f5h1 = r1
            r4.D0(r5, r0)
            return
    }

    public SmartRefreshLayout(android.content.Context r5, android.util.AttributeSet r6) {
            r4 = this;
            r4.<init>(r5, r6)
            r0 = 250(0xfa, float:3.5E-43)
            r4.e = r0
            r4.f = r0
            r0 = 1056964608(0x3f000000, float:0.5)
            r4.l = r0
            r0 = 1
            r4.y = r0
            r1 = 0
            r4.z = r1
            r4.A = r0
            r4.B = r0
            r4.C = r1
            r4.D = r0
            r4.E = r0
            r4.F = r0
            r4.G = r0
            r4.H = r1
            r4.I = r0
            r4.J = r0
            r4.K = r0
            r4.L = r1
            r4.M = r1
            r4.N = r1
            r4.O = r1
            r4.P = r1
            r4.Q = r1
            r0 = 2
            int[] r2 = new int[r0]
            r4.V = r2
            int[] r0 = new int[r0]
            r4.W = r0
            com.scwang.smartrefresh.layout.constant.DimensionStatus r0 = com.scwang.smartrefresh.layout.constant.DimensionStatus.DefaultUnNotify
            r4.F0 = r0
            r4.H0 = r0
            r0 = 1075838976(0x40200000, float:2.5)
            r4.K0 = r0
            r4.L0 = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r4.M0 = r0
            r4.N0 = r0
            com.scwang.smartrefresh.layout.constant.RefreshState r0 = com.scwang.smartrefresh.layout.constant.RefreshState.None
            r4.V0 = r0
            r4.W0 = r0
            r4.X0 = r1
            r2 = 0
            r4.Y0 = r2
            r4.Z0 = r2
            r4.a1 = r1
            r4.b1 = r1
            r0 = 0
            r4.e1 = r0
            com.scwang.smartrefresh.layout.SmartRefreshLayout$l r0 = new com.scwang.smartrefresh.layout.SmartRefreshLayout$l
            r0.<init>(r4)
            r4.g1 = r0
            com.scwang.smartrefresh.layout.SmartRefreshLayout$m r0 = new com.scwang.smartrefresh.layout.SmartRefreshLayout$m
            r0.<init>(r4)
            r4.f5h1 = r0
            r4.D0(r5, r6)
            return
    }

    public SmartRefreshLayout(android.content.Context r4, android.util.AttributeSet r5, int r6) {
            r3 = this;
            r3.<init>(r4, r5, r6)
            r6 = 250(0xfa, float:3.5E-43)
            r3.e = r6
            r3.f = r6
            r6 = 1056964608(0x3f000000, float:0.5)
            r3.l = r6
            r6 = 1
            r3.y = r6
            r0 = 0
            r3.z = r0
            r3.A = r6
            r3.B = r6
            r3.C = r0
            r3.D = r6
            r3.E = r6
            r3.F = r6
            r3.G = r6
            r3.H = r0
            r3.I = r6
            r3.J = r6
            r3.K = r6
            r3.L = r0
            r3.M = r0
            r3.N = r0
            r3.O = r0
            r3.P = r0
            r3.Q = r0
            r6 = 2
            int[] r1 = new int[r6]
            r3.V = r1
            int[] r6 = new int[r6]
            r3.W = r6
            com.scwang.smartrefresh.layout.constant.DimensionStatus r6 = com.scwang.smartrefresh.layout.constant.DimensionStatus.DefaultUnNotify
            r3.F0 = r6
            r3.H0 = r6
            r6 = 1075838976(0x40200000, float:2.5)
            r3.K0 = r6
            r3.L0 = r6
            r6 = 1065353216(0x3f800000, float:1.0)
            r3.M0 = r6
            r3.N0 = r6
            com.scwang.smartrefresh.layout.constant.RefreshState r6 = com.scwang.smartrefresh.layout.constant.RefreshState.None
            r3.V0 = r6
            r3.W0 = r6
            r3.X0 = r0
            r1 = 0
            r3.Y0 = r1
            r3.Z0 = r1
            r3.a1 = r0
            r3.b1 = r0
            r6 = 0
            r3.e1 = r6
            com.scwang.smartrefresh.layout.SmartRefreshLayout$l r6 = new com.scwang.smartrefresh.layout.SmartRefreshLayout$l
            r6.<init>(r3)
            r3.g1 = r6
            com.scwang.smartrefresh.layout.SmartRefreshLayout$m r6 = new com.scwang.smartrefresh.layout.SmartRefreshLayout$m
            r6.<init>(r3)
            r3.f5h1 = r6
            r3.D0(r4, r5)
            return
    }

    @androidx.annotation.RequiresApi(21)
    public SmartRefreshLayout(android.content.Context r3, android.util.AttributeSet r4, int r5, int r6) {
            r2 = this;
            r2.<init>(r3, r4, r5, r6)
            r5 = 250(0xfa, float:3.5E-43)
            r2.e = r5
            r2.f = r5
            r5 = 1056964608(0x3f000000, float:0.5)
            r2.l = r5
            r5 = 1
            r2.y = r5
            r6 = 0
            r2.z = r6
            r2.A = r5
            r2.B = r5
            r2.C = r6
            r2.D = r5
            r2.E = r5
            r2.F = r5
            r2.G = r5
            r2.H = r6
            r2.I = r5
            r2.J = r5
            r2.K = r5
            r2.L = r6
            r2.M = r6
            r2.N = r6
            r2.O = r6
            r2.P = r6
            r2.Q = r6
            r5 = 2
            int[] r0 = new int[r5]
            r2.V = r0
            int[] r5 = new int[r5]
            r2.W = r5
            com.scwang.smartrefresh.layout.constant.DimensionStatus r5 = com.scwang.smartrefresh.layout.constant.DimensionStatus.DefaultUnNotify
            r2.F0 = r5
            r2.H0 = r5
            r5 = 1075838976(0x40200000, float:2.5)
            r2.K0 = r5
            r2.L0 = r5
            r5 = 1065353216(0x3f800000, float:1.0)
            r2.M0 = r5
            r2.N0 = r5
            com.scwang.smartrefresh.layout.constant.RefreshState r5 = com.scwang.smartrefresh.layout.constant.RefreshState.None
            r2.V0 = r5
            r2.W0 = r5
            r2.X0 = r6
            r0 = 0
            r2.Y0 = r0
            r2.Z0 = r0
            r2.a1 = r6
            r2.b1 = r6
            r5 = 0
            r2.e1 = r5
            com.scwang.smartrefresh.layout.SmartRefreshLayout$l r5 = new com.scwang.smartrefresh.layout.SmartRefreshLayout$l
            r5.<init>(r2)
            r2.g1 = r5
            com.scwang.smartrefresh.layout.SmartRefreshLayout$m r5 = new com.scwang.smartrefresh.layout.SmartRefreshLayout$m
            r5.<init>(r2)
            r2.f5h1 = r5
            r2.D0(r3, r4)
            return
    }

    private void D0(android.content.Context r8, android.util.AttributeSet r9) {
            r7 = this;
            r0 = 0
            r7.setClipToPadding(r0)
            com.scwang.smartrefresh.layout.util.c r1 = new com.scwang.smartrefresh.layout.util.c
            r1.<init>()
            android.view.ViewConfiguration r2 = android.view.ViewConfiguration.get(r8)
            android.widget.Scroller r3 = new android.widget.Scroller
            r3.<init>(r8)
            r7.v = r3
            com.scwang.smartrefresh.layout.SmartRefreshLayout$p r3 = new com.scwang.smartrefresh.layout.SmartRefreshLayout$p
            r3.<init>(r7)
            r7.T0 = r3
            android.view.VelocityTracker r3 = android.view.VelocityTracker.obtain()
            r7.w = r3
            android.content.res.Resources r3 = r8.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            int r3 = r3.heightPixels
            r7.g = r3
            com.scwang.smartrefresh.layout.util.e r3 = new com.scwang.smartrefresh.layout.util.e
            r3.<init>()
            r7.q = r3
            int r3 = r2.getScaledTouchSlop()
            r7.a = r3
            int r3 = r2.getScaledMinimumFlingVelocity()
            r7.t = r3
            int r2 = r2.getScaledMaximumFlingVelocity()
            r7.u = r2
            androidx.core.view.NestedScrollingParentHelper r2 = new androidx.core.view.NestedScrollingParentHelper
            r2.<init>(r7)
            r7.k0 = r2
            androidx.core.view.NestedScrollingChildHelper r2 = new androidx.core.view.NestedScrollingChildHelper
            r2.<init>(r7)
            r7.c0 = r2
            int[] r2 = com.scwang.smartrefresh.layout.R.styleable.SmartRefreshLayout
            android.content.res.TypedArray r8 = r8.obtainStyledAttributes(r9, r2)
            int r9 = com.scwang.smartrefresh.layout.R.styleable.SmartRefreshLayout_srlEnableNestedScrolling
            boolean r2 = r8.getBoolean(r9, r0)
            androidx.core.view.ViewCompat.setNestedScrollingEnabled(r7, r2)
            int r2 = com.scwang.smartrefresh.layout.R.styleable.SmartRefreshLayout_srlDragRate
            float r3 = r7.l
            float r2 = r8.getFloat(r2, r3)
            r7.l = r2
            int r2 = com.scwang.smartrefresh.layout.R.styleable.SmartRefreshLayout_srlHeaderMaxDragRate
            float r3 = r7.K0
            float r2 = r8.getFloat(r2, r3)
            r7.K0 = r2
            int r2 = com.scwang.smartrefresh.layout.R.styleable.SmartRefreshLayout_srlFooterMaxDragRate
            float r3 = r7.L0
            float r2 = r8.getFloat(r2, r3)
            r7.L0 = r2
            int r2 = com.scwang.smartrefresh.layout.R.styleable.SmartRefreshLayout_srlHeaderTriggerRate
            float r3 = r7.M0
            float r2 = r8.getFloat(r2, r3)
            r7.M0 = r2
            int r2 = com.scwang.smartrefresh.layout.R.styleable.SmartRefreshLayout_srlFooterTriggerRate
            float r3 = r7.N0
            float r2 = r8.getFloat(r2, r3)
            r7.N0 = r2
            int r2 = com.scwang.smartrefresh.layout.R.styleable.SmartRefreshLayout_srlEnableRefresh
            boolean r3 = r7.y
            boolean r2 = r8.getBoolean(r2, r3)
            r7.y = r2
            int r2 = com.scwang.smartrefresh.layout.R.styleable.SmartRefreshLayout_srlReboundDuration
            int r3 = r7.f
            int r2 = r8.getInt(r2, r3)
            r7.f = r2
            int r2 = com.scwang.smartrefresh.layout.R.styleable.SmartRefreshLayout_srlEnableLoadmore
            boolean r3 = r7.z
            boolean r3 = r8.getBoolean(r2, r3)
            r7.z = r3
            int r3 = com.scwang.smartrefresh.layout.R.styleable.SmartRefreshLayout_srlHeaderHeight
            r4 = 1120403456(0x42c80000, float:100.0)
            int r4 = r1.a(r4)
            int r4 = r8.getDimensionPixelOffset(r3, r4)
            r7.p0 = r4
            int r4 = com.scwang.smartrefresh.layout.R.styleable.SmartRefreshLayout_srlFooterHeight
            r5 = 1114636288(0x42700000, float:60.0)
            int r1 = r1.a(r5)
            int r1 = r8.getDimensionPixelOffset(r4, r1)
            r7.G0 = r1
            int r1 = com.scwang.smartrefresh.layout.R.styleable.SmartRefreshLayout_srlDisableContentWhenRefresh
            boolean r5 = r7.L
            boolean r1 = r8.getBoolean(r1, r5)
            r7.L = r1
            int r1 = com.scwang.smartrefresh.layout.R.styleable.SmartRefreshLayout_srlDisableContentWhenLoading
            boolean r5 = r7.M
            boolean r1 = r8.getBoolean(r1, r5)
            r7.M = r1
            int r1 = com.scwang.smartrefresh.layout.R.styleable.SmartRefreshLayout_srlEnableHeaderTranslationContent
            boolean r5 = r7.A
            boolean r5 = r8.getBoolean(r1, r5)
            r7.A = r5
            int r5 = com.scwang.smartrefresh.layout.R.styleable.SmartRefreshLayout_srlEnableFooterTranslationContent
            boolean r6 = r7.B
            boolean r5 = r8.getBoolean(r5, r6)
            r7.B = r5
            int r5 = com.scwang.smartrefresh.layout.R.styleable.SmartRefreshLayout_srlEnablePreviewInEditMode
            boolean r6 = r7.D
            boolean r5 = r8.getBoolean(r5, r6)
            r7.D = r5
            int r5 = com.scwang.smartrefresh.layout.R.styleable.SmartRefreshLayout_srlEnableAutoLoadmore
            boolean r6 = r7.G
            boolean r5 = r8.getBoolean(r5, r6)
            r7.G = r5
            int r5 = com.scwang.smartrefresh.layout.R.styleable.SmartRefreshLayout_srlEnableOverScrollBounce
            boolean r6 = r7.E
            boolean r5 = r8.getBoolean(r5, r6)
            r7.E = r5
            int r5 = com.scwang.smartrefresh.layout.R.styleable.SmartRefreshLayout_srlEnablePureScrollMode
            boolean r6 = r7.H
            boolean r5 = r8.getBoolean(r5, r6)
            r7.H = r5
            int r5 = com.scwang.smartrefresh.layout.R.styleable.SmartRefreshLayout_srlEnableScrollContentWhenLoaded
            boolean r6 = r7.I
            boolean r5 = r8.getBoolean(r5, r6)
            r7.I = r5
            int r5 = com.scwang.smartrefresh.layout.R.styleable.SmartRefreshLayout_srlEnableScrollContentWhenRefreshed
            boolean r6 = r7.J
            boolean r5 = r8.getBoolean(r5, r6)
            r7.J = r5
            int r5 = com.scwang.smartrefresh.layout.R.styleable.SmartRefreshLayout_srlEnableLoadmoreWhenContentNotFull
            boolean r6 = r7.K
            boolean r5 = r8.getBoolean(r5, r6)
            r7.K = r5
            int r5 = com.scwang.smartrefresh.layout.R.styleable.SmartRefreshLayout_srlEnableFooterFollowWhenLoadFinished
            boolean r6 = r7.C
            boolean r5 = r8.getBoolean(r5, r6)
            r7.C = r5
            int r5 = com.scwang.smartrefresh.layout.R.styleable.SmartRefreshLayout_srlEnableOverScrollDrag
            boolean r6 = r7.F
            boolean r5 = r8.getBoolean(r5, r6)
            r7.F = r5
            int r5 = com.scwang.smartrefresh.layout.R.styleable.SmartRefreshLayout_srlFixedHeaderViewId
            r6 = -1
            int r5 = r8.getResourceId(r5, r6)
            r7.r = r5
            int r5 = com.scwang.smartrefresh.layout.R.styleable.SmartRefreshLayout_srlFixedFooterViewId
            int r5 = r8.getResourceId(r5, r6)
            r7.s = r5
            boolean r2 = r8.hasValue(r2)
            r7.O = r2
            boolean r9 = r8.hasValue(r9)
            r7.P = r9
            boolean r9 = r8.hasValue(r1)
            r7.Q = r9
            boolean r9 = r8.hasValue(r3)
            if (r9 == 0) goto L17d
            com.scwang.smartrefresh.layout.constant.DimensionStatus r9 = com.scwang.smartrefresh.layout.constant.DimensionStatus.XmlLayoutUnNotify
            goto L17f
        L17d:
            com.scwang.smartrefresh.layout.constant.DimensionStatus r9 = r7.F0
        L17f:
            r7.F0 = r9
            boolean r9 = r8.hasValue(r4)
            if (r9 == 0) goto L18a
            com.scwang.smartrefresh.layout.constant.DimensionStatus r9 = com.scwang.smartrefresh.layout.constant.DimensionStatus.XmlLayoutUnNotify
            goto L18c
        L18a:
            com.scwang.smartrefresh.layout.constant.DimensionStatus r9 = r7.H0
        L18c:
            r7.H0 = r9
            int r9 = r7.p0
            float r9 = (float) r9
            float r1 = r7.K0
            r2 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 - r2
            float r9 = r9 * r1
            r1 = 0
            float r9 = java.lang.Math.max(r9, r1)
            int r9 = (int) r9
            r7.I0 = r9
            int r9 = r7.G0
            float r9 = (float) r9
            float r3 = r7.L0
            float r3 = r3 - r2
            float r9 = r9 * r3
            float r9 = java.lang.Math.max(r9, r1)
            int r9 = (int) r9
            r7.J0 = r9
            int r9 = com.scwang.smartrefresh.layout.R.styleable.SmartRefreshLayout_srlAccentColor
            int r9 = r8.getColor(r9, r0)
            int r1 = com.scwang.smartrefresh.layout.R.styleable.SmartRefreshLayout_srlPrimaryColor
            int r1 = r8.getColor(r1, r0)
            if (r1 == 0) goto L1cd
            if (r9 == 0) goto L1c6
            int[] r9 = new int[]{r1, r9}
            r7.x = r9
            goto L1d5
        L1c6:
            int[] r9 = new int[]{r1}
            r7.x = r9
            goto L1d5
        L1cd:
            if (r9 == 0) goto L1d5
            int[] r9 = new int[]{r0, r9}
            r7.x = r9
        L1d5:
            r8.recycle()
            return
    }

    public static void setDefaultRefreshFooterCreater(@androidx.annotation.NonNull l2.a r0) {
            com.scwang.smartrefresh.layout.SmartRefreshLayout.f3j1 = r0
            r0 = 1
            com.scwang.smartrefresh.layout.SmartRefreshLayout.f2i1 = r0
            return
    }

    public static void setDefaultRefreshHeaderCreater(@androidx.annotation.NonNull l2.b r0) {
            com.scwang.smartrefresh.layout.SmartRefreshLayout.f4k1 = r0
            return
    }

    public /* bridge */ /* synthetic */ l2.h A(int r1) {
            r0 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = r0.x0(r1)
            return r1
    }

    protected com.scwang.smartrefresh.layout.SmartRefreshLayout.o A0() {
            r2 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout$o r0 = new com.scwang.smartrefresh.layout.SmartRefreshLayout$o
            r1 = -1
            r0.<init>(r1, r1)
            return r0
    }

    protected void A1() {
            r1 = this;
            boolean r0 = r1.y()
            if (r0 == 0) goto L16
            boolean r0 = r1.N
            if (r0 != 0) goto L16
            com.scwang.smartrefresh.layout.constant.RefreshState r0 = r1.V0
            boolean r0 = r0.opening
            if (r0 != 0) goto L16
            com.scwang.smartrefresh.layout.constant.RefreshState r0 = com.scwang.smartrefresh.layout.constant.RefreshState.PullToUpLoad
            r1.H0(r0)
            return
        L16:
            com.scwang.smartrefresh.layout.constant.RefreshState r0 = com.scwang.smartrefresh.layout.constant.RefreshState.PullToUpLoad
            r1.setViceState(r0)
            return
    }

    public l2.h B(android.view.View r2, int r3, int r4) {
            r1 = this;
            if (r2 == 0) goto L8e
            l2.c r0 = r1.Q0
            if (r0 == 0) goto Ld
            android.view.View r0 = r0.getView()
            r1.removeView(r0)
        Ld:
            com.scwang.smartrefresh.layout.SmartRefreshLayout$o r0 = new com.scwang.smartrefresh.layout.SmartRefreshLayout$o
            r0.<init>(r3, r4)
            r3 = 0
            r1.addView(r2, r3, r0)
            l2.e r3 = r1.O0
            if (r3 == 0) goto L39
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r3 = r3.getSpinnerStyle()
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r4 = com.scwang.smartrefresh.layout.constant.SpinnerStyle.FixedBehind
            if (r3 != r4) goto L39
            r1.bringChildToFront(r2)
            l2.d r3 = r1.P0
            if (r3 == 0) goto L5b
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r3 = r3.getSpinnerStyle()
            if (r3 == r4) goto L5b
            l2.d r3 = r1.P0
            android.view.View r3 = r3.getView()
            r1.bringChildToFront(r3)
            goto L5b
        L39:
            l2.d r3 = r1.P0
            if (r3 == 0) goto L5b
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r3 = r3.getSpinnerStyle()
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r4 = com.scwang.smartrefresh.layout.constant.SpinnerStyle.FixedBehind
            if (r3 != r4) goto L5b
            r1.bringChildToFront(r2)
            l2.e r3 = r1.O0
            if (r3 == 0) goto L5b
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r3 = r3.getSpinnerStyle()
            if (r3 != r4) goto L5b
            l2.e r3 = r1.O0
            android.view.View r3 = r3.getView()
            r1.bringChildToFront(r3)
        L5b:
            com.scwang.smartrefresh.layout.impl.a r3 = new com.scwang.smartrefresh.layout.impl.a
            r3.<init>(r2)
            r1.Q0 = r3
            android.os.Handler r2 = r1.S0
            if (r2 == 0) goto L8e
            int r2 = r1.r
            r3 = 0
            if (r2 <= 0) goto L70
            android.view.View r2 = r1.findViewById(r2)
            goto L71
        L70:
            r2 = r3
        L71:
            int r4 = r1.s
            if (r4 <= 0) goto L79
            android.view.View r3 = r1.findViewById(r4)
        L79:
            l2.c r4 = r1.Q0
            l2.i r0 = r1.U
            r4.a(r0)
            l2.c r4 = r1.Q0
            boolean r0 = r1.K
            r4.c(r0)
            l2.c r4 = r1.Q0
            l2.g r0 = r1.T0
            r4.g(r0, r2, r3)
        L8e:
            return r1
    }

    public com.scwang.smartrefresh.layout.SmartRefreshLayout.o B0(android.util.AttributeSet r3) {
            r2 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout$o r0 = new com.scwang.smartrefresh.layout.SmartRefreshLayout$o
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    protected void B1() {
            r6 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout$k r0 = new com.scwang.smartrefresh.layout.SmartRefreshLayout$k
            r0.<init>(r6)
            com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.RefreshReleased
            r6.H0(r1)
            int r1 = r6.p0
            android.animation.ValueAnimator r1 = r6.m0(r1)
            if (r1 == 0) goto L15
            r1.addListener(r0)
        L15:
            l2.e r2 = r6.O0
            if (r2 == 0) goto L20
            int r3 = r6.p0
            int r4 = r6.I0
            r2.i(r6, r3, r4)
        L20:
            m2.c r2 = r6.T
            if (r2 == 0) goto L2d
            l2.e r3 = r6.O0
            int r4 = r6.p0
            int r5 = r6.I0
            r2.l(r3, r4, r5)
        L2d:
            if (r1 != 0) goto L33
            r1 = 0
            r0.onAnimationEnd(r1)
        L33:
            return
    }

    public /* bridge */ /* synthetic */ l2.h C(float r1) {
            r0 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = r0.g1(r1)
            return r1
    }

    protected com.scwang.smartrefresh.layout.SmartRefreshLayout.o C0(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout$o r0 = new com.scwang.smartrefresh.layout.SmartRefreshLayout$o
            r0.<init>(r2)
            return r0
    }

    protected void C1() {
            r1 = this;
            boolean r0 = r1.y()
            if (r0 == 0) goto L16
            boolean r0 = r1.N
            if (r0 != 0) goto L16
            com.scwang.smartrefresh.layout.constant.RefreshState r0 = r1.V0
            boolean r0 = r0.opening
            if (r0 != 0) goto L16
            com.scwang.smartrefresh.layout.constant.RefreshState r0 = com.scwang.smartrefresh.layout.constant.RefreshState.ReleaseToLoad
            r1.H0(r0)
            return
        L16:
            com.scwang.smartrefresh.layout.constant.RefreshState r0 = com.scwang.smartrefresh.layout.constant.RefreshState.ReleaseToLoad
            r1.setViceState(r0)
            return
    }

    public boolean D() {
            r1 = this;
            android.os.Handler r0 = r1.S0
            if (r0 != 0) goto L7
            r0 = 400(0x190, float:5.6E-43)
            goto L8
        L7:
            r0 = 0
        L8:
            boolean r0 = r1.s(r0)
            return r0
    }

    protected void D1() {
            r1 = this;
            com.scwang.smartrefresh.layout.constant.RefreshState r0 = r1.V0
            boolean r0 = r0.opening
            if (r0 != 0) goto L12
            boolean r0 = r1.f0()
            if (r0 == 0) goto L12
            com.scwang.smartrefresh.layout.constant.RefreshState r0 = com.scwang.smartrefresh.layout.constant.RefreshState.ReleaseToRefresh
            r1.H0(r0)
            return
        L12:
            com.scwang.smartrefresh.layout.constant.RefreshState r0 = com.scwang.smartrefresh.layout.constant.RefreshState.ReleaseToRefresh
            r1.setViceState(r0)
            return
    }

    public /* bridge */ /* synthetic */ l2.h E(boolean r1) {
            r0 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = r0.u0(r1)
            return r1
    }

    protected boolean E0(int r3) {
            r2 = this;
            android.animation.ValueAnimator r0 = r2.f1
            r1 = 0
            if (r0 == 0) goto L2b
            if (r3 != 0) goto L2b
            com.scwang.smartrefresh.layout.constant.RefreshState r3 = r2.V0
            com.scwang.smartrefresh.layout.constant.RefreshState r0 = com.scwang.smartrefresh.layout.constant.RefreshState.LoadFinish
            if (r3 == r0) goto L2b
            com.scwang.smartrefresh.layout.constant.RefreshState r0 = com.scwang.smartrefresh.layout.constant.RefreshState.RefreshFinish
            if (r3 != r0) goto L12
            goto L2b
        L12:
            com.scwang.smartrefresh.layout.constant.RefreshState r0 = com.scwang.smartrefresh.layout.constant.RefreshState.PullDownCanceled
            if (r3 != r0) goto L1a
            r2.y1()
            goto L21
        L1a:
            com.scwang.smartrefresh.layout.constant.RefreshState r0 = com.scwang.smartrefresh.layout.constant.RefreshState.PullUpCanceled
            if (r3 != r0) goto L21
            r2.A1()
        L21:
            android.animation.ValueAnimator r3 = r2.f1
            r3.cancel()
            r3 = 0
            r2.f1 = r3
            r3 = 1
            return r3
        L2b:
            return r1
    }

    protected boolean E1(android.view.MotionEvent r12) {
            r11 = this;
            int r0 = r12.getActionMasked()
            r1 = 1
            if (r0 != r1) goto L40
            android.view.VelocityTracker r0 = r11.w
            float r0 = r0.getYVelocity()
            float r0 = -r0
            float r1 = java.lang.Math.abs(r0)
            int r2 = r11.t
            float r2 = (float) r2
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L40
            int r1 = r11.b
            if (r1 != 0) goto L40
            int r1 = r11.d
            if (r1 != 0) goto L40
            r1 = 0
            r11.X0 = r1
            android.widget.Scroller r2 = r11.v
            int r4 = r11.getScrollY()
            int r6 = (int) r0
            r9 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            r10 = 2147483647(0x7fffffff, float:NaN)
            r3 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r2.fling(r3, r4, r5, r6, r7, r8, r9, r10)
            android.widget.Scroller r0 = r11.v
            r0.computeScrollOffset()
            r11.invalidate()
        L40:
            boolean r12 = super.dispatchTouchEvent(r12)
            return r12
    }

    public /* bridge */ /* synthetic */ l2.h F(android.view.animation.Interpolator r1) {
            r0 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = r0.q1(r1)
            return r1
    }

    protected void F0(int r14, boolean r15) {
            r13 = this;
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r2 = r13.b
            if (r2 != r14) goto L1f
            l2.e r2 = r13.O0
            if (r2 == 0) goto L13
            boolean r2 = r2.k()
            if (r2 != 0) goto L1f
        L13:
            l2.d r2 = r13.P0
            if (r2 == 0) goto L1fd
            boolean r2 = r2.k()
            if (r2 != 0) goto L1f
            goto L1fd
        L1f:
            int r2 = r13.b
            r13.b = r14
            if (r15 != 0) goto L69
            com.scwang.smartrefresh.layout.constant.RefreshState r3 = r13.getViceState()
            boolean r3 = r3.draging
            if (r3 == 0) goto L69
            int r3 = r13.b
            float r4 = (float) r3
            int r5 = r13.p0
            float r5 = (float) r5
            float r6 = r13.M0
            float r5 = r5 * r6
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L45
            com.scwang.smartrefresh.layout.constant.RefreshState r3 = r13.V0
            com.scwang.smartrefresh.layout.constant.RefreshState r4 = com.scwang.smartrefresh.layout.constant.RefreshState.ReleaseToTwoLevel
            if (r3 == r4) goto L69
            r13.D1()
            goto L69
        L45:
            int r4 = -r3
            float r4 = (float) r4
            int r5 = r13.G0
            float r5 = (float) r5
            float r6 = r13.N0
            float r5 = r5 * r6
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L5a
            boolean r4 = r13.N
            if (r4 != 0) goto L5a
            r13.C1()
            goto L69
        L5a:
            if (r3 >= 0) goto L64
            boolean r4 = r13.N
            if (r4 != 0) goto L64
            r13.A1()
            goto L69
        L64:
            if (r3 <= 0) goto L69
            r13.y1()
        L69:
            l2.c r3 = r13.Q0
            if (r3 == 0) goto Lcc
            if (r14 < 0) goto L89
            boolean r3 = r13.A
            if (r3 != 0) goto L84
            l2.e r3 = r13.O0
            if (r3 == 0) goto L84
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r3 = r3.getSpinnerStyle()
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r4 = com.scwang.smartrefresh.layout.constant.SpinnerStyle.FixedBehind
            if (r3 != r4) goto L80
            goto L84
        L80:
            if (r2 >= 0) goto L89
            r3 = r1
            goto L8a
        L84:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r14)
            goto L8a
        L89:
            r3 = 0
        L8a:
            if (r14 > 0) goto La5
            boolean r4 = r13.B
            if (r4 != 0) goto La0
            l2.d r4 = r13.P0
            if (r4 == 0) goto La0
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r4 = r4.getSpinnerStyle()
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r5 = com.scwang.smartrefresh.layout.constant.SpinnerStyle.FixedBehind
            if (r4 != r5) goto L9d
            goto La0
        L9d:
            if (r2 <= 0) goto La5
            goto La6
        La0:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            goto La6
        La5:
            r1 = r3
        La6:
            if (r1 == 0) goto Lcc
            l2.c r3 = r13.Q0
            int r4 = r1.intValue()
            r3.j(r4)
            int r3 = r13.a1
            if (r3 == 0) goto Lbd
            int r3 = r1.intValue()
            if (r3 >= 0) goto Lc9
            if (r2 > 0) goto Lc9
        Lbd:
            int r3 = r13.b1
            if (r3 == 0) goto Lcc
            int r1 = r1.intValue()
            if (r1 <= 0) goto Lc9
            if (r2 >= 0) goto Lcc
        Lc9:
            r13.invalidate()
        Lcc:
            r1 = 2
            r3 = 1
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r14 >= 0) goto Ld4
            if (r2 <= 0) goto L166
        Ld4:
            l2.e r5 = r13.O0
            if (r5 == 0) goto L166
            int r9 = java.lang.Math.max(r14, r0)
            int r10 = r13.p0
            int r11 = r13.I0
            float r5 = (float) r9
            float r5 = r5 * r4
            float r6 = (float) r10
            float r8 = r5 / r6
            boolean r5 = r13.f0()
            if (r5 != 0) goto Lf4
            com.scwang.smartrefresh.layout.constant.RefreshState r5 = r13.V0
            com.scwang.smartrefresh.layout.constant.RefreshState r6 = com.scwang.smartrefresh.layout.constant.RefreshState.RefreshFinish
            if (r5 != r6) goto L151
            if (r15 == 0) goto L151
        Lf4:
            int r5 = r13.b
            if (r2 == r5) goto L128
            int[] r5 = com.scwang.smartrefresh.layout.SmartRefreshLayout.e.a
            l2.e r6 = r13.O0
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r6 = r6.getSpinnerStyle()
            int r6 = r6.ordinal()
            r5 = r5[r6]
            if (r5 == r3) goto L115
            if (r5 == r1) goto L10b
            goto L121
        L10b:
            l2.e r5 = r13.O0
            android.view.View r5 = r5.getView()
            r5.requestLayout()
            goto L121
        L115:
            l2.e r5 = r13.O0
            android.view.View r5 = r5.getView()
            int r6 = r13.b
            float r6 = (float) r6
            r5.setTranslationY(r6)
        L121:
            if (r15 == 0) goto L128
            l2.e r5 = r13.O0
            r5.g(r8, r9, r10, r11)
        L128:
            if (r15 != 0) goto L151
            l2.e r5 = r13.O0
            boolean r5 = r5.k()
            if (r5 == 0) goto L148
            float r5 = r13.j
            int r5 = (int) r5
            int r6 = r13.getWidth()
            float r7 = r13.j
            float r12 = (float) r6
            float r7 = r7 / r12
            l2.e r12 = r13.O0
            r12.j(r7, r5, r6)
            l2.e r5 = r13.O0
            r5.x(r8, r9, r10, r11)
            goto L151
        L148:
            int r5 = r13.b
            if (r2 == r5) goto L151
            l2.e r5 = r13.O0
            r5.x(r8, r9, r10, r11)
        L151:
            int r5 = r13.b
            if (r2 == r5) goto L166
            m2.c r6 = r13.T
            if (r6 == 0) goto L166
            if (r15 == 0) goto L161
            l2.e r7 = r13.O0
            r6.y(r7, r8, r9, r10, r11)
            goto L166
        L161:
            l2.e r7 = r13.O0
            r6.d(r7, r8, r9, r10, r11)
        L166:
            if (r14 <= 0) goto L16a
            if (r2 >= 0) goto L1fd
        L16a:
            l2.d r5 = r13.P0
            if (r5 == 0) goto L1fd
            int r14 = java.lang.Math.min(r14, r0)
            int r8 = -r14
            int r9 = r13.G0
            int r10 = r13.J0
            float r14 = (float) r8
            float r14 = r14 * r4
            float r0 = (float) r9
            float r7 = r14 / r0
            boolean r14 = r13.y()
            if (r14 != 0) goto L18b
            com.scwang.smartrefresh.layout.constant.RefreshState r14 = r13.V0
            com.scwang.smartrefresh.layout.constant.RefreshState r0 = com.scwang.smartrefresh.layout.constant.RefreshState.LoadFinish
            if (r14 != r0) goto L1e8
            if (r15 == 0) goto L1e8
        L18b:
            int r14 = r13.b
            if (r2 == r14) goto L1bf
            int[] r14 = com.scwang.smartrefresh.layout.SmartRefreshLayout.e.a
            l2.d r0 = r13.P0
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r0 = r0.getSpinnerStyle()
            int r0 = r0.ordinal()
            r14 = r14[r0]
            if (r14 == r3) goto L1ac
            if (r14 == r1) goto L1a2
            goto L1b8
        L1a2:
            l2.d r14 = r13.P0
            android.view.View r14 = r14.getView()
            r14.requestLayout()
            goto L1b8
        L1ac:
            l2.d r14 = r13.P0
            android.view.View r14 = r14.getView()
            int r0 = r13.b
            float r0 = (float) r0
            r14.setTranslationY(r0)
        L1b8:
            if (r15 == 0) goto L1bf
            l2.d r14 = r13.P0
            r14.v(r7, r8, r9, r10)
        L1bf:
            if (r15 != 0) goto L1e8
            l2.d r14 = r13.P0
            boolean r14 = r14.k()
            if (r14 == 0) goto L1df
            float r14 = r13.j
            int r14 = (int) r14
            int r0 = r13.getWidth()
            float r1 = r13.j
            float r3 = (float) r0
            float r1 = r1 / r3
            l2.d r3 = r13.P0
            r3.j(r1, r14, r0)
            l2.d r14 = r13.P0
            r14.c(r7, r8, r9, r10)
            goto L1e8
        L1df:
            int r14 = r13.b
            if (r2 == r14) goto L1e8
            l2.d r14 = r13.P0
            r14.c(r7, r8, r9, r10)
        L1e8:
            int r14 = r13.b
            if (r2 == r14) goto L1fd
            m2.c r5 = r13.T
            if (r5 == 0) goto L1fd
            if (r15 == 0) goto L1f8
            l2.d r6 = r13.P0
            r5.o(r6, r7, r8, r9, r10)
            return
        L1f8:
            l2.d r6 = r13.P0
            r5.a(r6, r7, r8, r9, r10)
        L1fd:
            return
    }

    public /* bridge */ /* synthetic */ l2.h G(m2.b r1) {
            r0 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = r0.j1(r1)
            return r1
    }

    protected void G0(float r15) {
            r14 = this;
            com.scwang.smartrefresh.layout.constant.RefreshState r0 = r14.V0
            com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.TwoLevel
            r2 = 0
            r3 = 0
            if (r0 != r1) goto L1a
            int r1 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r1 <= 0) goto L1a
            int r0 = (int) r15
            int r1 = r14.getMeasuredHeight()
            int r0 = java.lang.Math.min(r0, r1)
            r14.F0(r0, r2)
            goto L12e
        L1a:
            com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.Refreshing
            r4 = 4636737291354636288(0x4059000000000000, double:100.0)
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r0 != r1) goto L6a
            int r1 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r1 < 0) goto L6a
            int r0 = r14.p0
            float r0 = (float) r0
            int r0 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r0 >= 0) goto L33
            int r0 = (int) r15
            r14.F0(r0, r2)
            goto L12e
        L33:
            int r0 = r14.I0
            double r0 = (double) r0
            int r8 = r14.g
            int r8 = r8 * 4
            int r8 = r8 / 3
            int r9 = r14.getHeight()
            int r8 = java.lang.Math.max(r8, r9)
            int r9 = r14.p0
            int r8 = r8 - r9
            double r10 = (double) r8
            float r8 = (float) r9
            float r8 = r15 - r8
            float r9 = r14.l
            float r8 = r8 * r9
            float r8 = java.lang.Math.max(r3, r8)
            double r8 = (double) r8
            double r12 = -r8
            double r12 = r12 / r10
            double r4 = java.lang.Math.pow(r4, r12)
            double r6 = r6 - r4
            double r0 = r0 * r6
            double r0 = java.lang.Math.min(r0, r8)
            int r0 = (int) r0
            int r1 = r14.p0
            int r0 = r0 + r1
            r14.F0(r0, r2)
            goto L12e
        L6a:
            int r1 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r1 >= 0) goto Lcd
            com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.Loading
            if (r0 == r1) goto L88
            boolean r0 = r14.C
            if (r0 == 0) goto L7a
            boolean r0 = r14.N
            if (r0 != 0) goto L88
        L7a:
            boolean r0 = r14.G
            if (r0 == 0) goto Lcd
            boolean r0 = r14.y()
            if (r0 == 0) goto Lcd
            boolean r0 = r14.N
            if (r0 != 0) goto Lcd
        L88:
            int r0 = r14.G0
            int r0 = -r0
            float r0 = (float) r0
            int r0 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r0 <= 0) goto L96
            int r0 = (int) r15
            r14.F0(r0, r2)
            goto L12e
        L96:
            int r0 = r14.J0
            double r0 = (double) r0
            int r8 = r14.g
            int r8 = r8 * 4
            int r8 = r8 / 3
            int r9 = r14.getHeight()
            int r8 = java.lang.Math.max(r8, r9)
            int r9 = r14.G0
            int r8 = r8 - r9
            double r10 = (double) r8
            float r8 = (float) r9
            float r8 = r8 + r15
            float r9 = r14.l
            float r8 = r8 * r9
            float r8 = java.lang.Math.min(r3, r8)
            float r8 = -r8
            double r8 = (double) r8
            double r12 = -r8
            double r12 = r12 / r10
            double r4 = java.lang.Math.pow(r4, r12)
            double r6 = r6 - r4
            double r0 = r0 * r6
            double r0 = java.lang.Math.min(r0, r8)
            double r0 = -r0
            int r0 = (int) r0
            int r1 = r14.G0
            int r0 = r0 - r1
            r14.F0(r0, r2)
            goto L12e
        Lcd:
            int r0 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r0 < 0) goto Lff
            int r0 = r14.I0
            int r1 = r14.p0
            int r0 = r0 + r1
            double r0 = (double) r0
            int r8 = r14.g
            int r8 = r8 / 2
            int r9 = r14.getHeight()
            int r8 = java.lang.Math.max(r8, r9)
            double r8 = (double) r8
            float r10 = r14.l
            float r10 = r10 * r15
            float r10 = java.lang.Math.max(r3, r10)
            double r10 = (double) r10
            double r12 = -r10
            double r12 = r12 / r8
            double r4 = java.lang.Math.pow(r4, r12)
            double r6 = r6 - r4
            double r0 = r0 * r6
            double r0 = java.lang.Math.min(r0, r10)
            int r0 = (int) r0
            r14.F0(r0, r2)
            goto L12e
        Lff:
            int r0 = r14.J0
            int r1 = r14.G0
            int r0 = r0 + r1
            double r0 = (double) r0
            int r8 = r14.g
            int r8 = r8 / 2
            int r9 = r14.getHeight()
            int r8 = java.lang.Math.max(r8, r9)
            double r8 = (double) r8
            float r10 = r14.l
            float r10 = r10 * r15
            float r10 = java.lang.Math.min(r3, r10)
            float r10 = -r10
            double r10 = (double) r10
            double r12 = -r10
            double r12 = r12 / r8
            double r4 = java.lang.Math.pow(r4, r12)
            double r6 = r6 - r4
            double r0 = r0 * r6
            double r0 = java.lang.Math.min(r0, r10)
            double r0 = -r0
            int r0 = (int) r0
            r14.F0(r0, r2)
        L12e:
            boolean r0 = r14.G
            if (r0 == 0) goto L151
            boolean r0 = r14.y()
            if (r0 == 0) goto L151
            int r15 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r15 >= 0) goto L151
            com.scwang.smartrefresh.layout.constant.RefreshState r15 = r14.V0
            com.scwang.smartrefresh.layout.constant.RefreshState r0 = com.scwang.smartrefresh.layout.constant.RefreshState.Refreshing
            if (r15 == r0) goto L151
            com.scwang.smartrefresh.layout.constant.RefreshState r0 = com.scwang.smartrefresh.layout.constant.RefreshState.Loading
            if (r15 == r0) goto L151
            com.scwang.smartrefresh.layout.constant.RefreshState r0 = com.scwang.smartrefresh.layout.constant.RefreshState.LoadFinish
            if (r15 == r0) goto L151
            boolean r15 = r14.N
            if (r15 != 0) goto L151
            r14.v1()
        L151:
            return
    }

    public /* bridge */ /* synthetic */ l2.h H(boolean r1) {
            r0 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = r0.L0(r1)
            return r1
    }

    protected void H0(com.scwang.smartrefresh.layout.constant.RefreshState r3) {
            r2 = this;
            com.scwang.smartrefresh.layout.constant.RefreshState r0 = r2.V0
            if (r0 == r3) goto L1d
            r2.V0 = r3
            r2.W0 = r3
            l2.d r1 = r2.P0
            if (r1 == 0) goto Lf
            r1.q(r2, r0, r3)
        Lf:
            l2.e r1 = r2.O0
            if (r1 == 0) goto L16
            r1.q(r2, r0, r3)
        L16:
            m2.c r1 = r2.T
            if (r1 == 0) goto L1d
            r1.q(r2, r0, r3)
        L1d:
            return
    }

    public boolean I() {
            r1 = this;
            boolean r0 = r1.N
            return r0
    }

    protected boolean I0() {
            r4 = this;
            com.scwang.smartrefresh.layout.constant.RefreshState r0 = r4.V0
            com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.TwoLevel
            if (r0 != r1) goto L39
            android.view.VelocityTracker r0 = r4.w
            float r0 = r0.getYVelocity()
            r1 = -998637568(0xffffffffc47a0000, float:-1000.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L2d
            int r0 = r4.b
            int r1 = r4.getMeasuredHeight()
            int r1 = r1 / 2
            if (r0 <= r1) goto L2d
            int r0 = r4.getMeasuredHeight()
            android.animation.ValueAnimator r0 = r4.m0(r0)
            if (r0 == 0) goto L36
            int r1 = r4.e
            long r1 = (long) r1
            r0.setDuration(r1)
            goto L36
        L2d:
            boolean r0 = r4.m
            if (r0 == 0) goto L36
            l2.g r0 = r4.T0
            r0.g()
        L36:
            boolean r0 = r4.m
            return r0
        L39:
            com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.Loading
            r2 = 0
            if (r0 == r1) goto Lb1
            boolean r0 = r4.G
            if (r0 == 0) goto L56
            boolean r0 = r4.y()
            if (r0 == 0) goto L56
            boolean r0 = r4.N
            if (r0 != 0) goto L56
            int r0 = r4.b
            if (r0 >= 0) goto L56
            com.scwang.smartrefresh.layout.constant.RefreshState r0 = r4.V0
            com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.Refreshing
            if (r0 != r1) goto Lb1
        L56:
            boolean r0 = r4.C
            if (r0 == 0) goto L63
            boolean r0 = r4.N
            if (r0 == 0) goto L63
            int r0 = r4.b
            if (r0 >= 0) goto L63
            goto Lb1
        L63:
            com.scwang.smartrefresh.layout.constant.RefreshState r0 = r4.V0
            com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.Refreshing
            if (r0 != r1) goto L7e
            int r0 = r4.b
            int r1 = r4.p0
            if (r0 <= r1) goto L75
            r4.a0 = r1
            r4.m0(r1)
            goto Lc7
        L75:
            if (r0 >= 0) goto L7d
            r4.a0 = r2
            r4.m0(r2)
            goto Lc7
        L7d:
            return r2
        L7e:
            com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.PullDownToRefresh
            if (r0 != r1) goto L86
            r4.x1()
            goto Lc7
        L86:
            com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.PullToUpLoad
            if (r0 != r1) goto L8e
            r4.z1()
            goto Lc7
        L8e:
            com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.ReleaseToRefresh
            if (r0 != r1) goto L96
            r4.B1()
            goto Lc7
        L96:
            com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.ReleaseToLoad
            if (r0 != r1) goto L9e
            r4.w1()
            goto Lc7
        L9e:
            com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.ReleaseToTwoLevel
            if (r0 != r1) goto La8
            com.scwang.smartrefresh.layout.constant.RefreshState r0 = com.scwang.smartrefresh.layout.constant.RefreshState.TwoLevelReleased
            r4.H0(r0)
            goto Lc7
        La8:
            int r0 = r4.b
            if (r0 == 0) goto Lb0
            r4.m0(r2)
            goto Lc7
        Lb0:
            return r2
        Lb1:
            int r0 = r4.b
            int r1 = r4.G0
            int r3 = -r1
            if (r0 >= r3) goto Lc0
            int r0 = -r1
            r4.a0 = r0
            int r0 = -r1
            r4.m0(r0)
            goto Lc7
        Lc0:
            if (r0 <= 0) goto Lc9
            r4.a0 = r2
            r4.m0(r2)
        Lc7:
            r0 = 1
            return r0
        Lc9:
            return r2
    }

    public /* bridge */ /* synthetic */ l2.h J(int r1, boolean r2) {
            r0 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = r0.y0(r1, r2)
            return r1
    }

    public com.scwang.smartrefresh.layout.SmartRefreshLayout J0() {
            r1 = this;
            r0 = 0
            r1.i1(r0)
            return r1
    }

    public /* bridge */ /* synthetic */ l2.h K(int r1, boolean r2) {
            r0 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = r0.s0(r1, r2)
            return r1
    }

    protected void K0() {
            r2 = this;
            com.scwang.smartrefresh.layout.constant.RefreshState r0 = r2.V0
            com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.None
            if (r0 == r1) goto Ld
            int r0 = r2.b
            if (r0 != 0) goto Ld
            r2.H0(r1)
        Ld:
            int r0 = r2.b
            if (r0 == 0) goto L15
            r0 = 0
            r2.m0(r0)
        L15:
            return
    }

    public l2.h L(android.view.View r2) {
            r1 = this;
            r0 = -1
            l2.h r2 = r1.B(r2, r0, r0)
            return r2
    }

    public com.scwang.smartrefresh.layout.SmartRefreshLayout L0(boolean r1) {
            r0 = this;
            r0.M = r1
            return r0
    }

    public boolean M() {
            r1 = this;
            boolean r0 = r1.H
            return r0
    }

    public com.scwang.smartrefresh.layout.SmartRefreshLayout M0(boolean r1) {
            r0 = this;
            r0.L = r1
            return r0
    }

    public /* bridge */ /* synthetic */ l2.h N() {
            r1 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r1.q0()
            return r0
    }

    public com.scwang.smartrefresh.layout.SmartRefreshLayout N0(float r1) {
            r0 = this;
            r0.l = r1
            return r0
    }

    public boolean O(int r3, int r4, float r5) {
            r2 = this;
            com.scwang.smartrefresh.layout.constant.RefreshState r0 = r2.V0
            com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.None
            if (r0 != r1) goto L2b
            boolean r0 = r2.f0()
            if (r0 == 0) goto L2b
            android.animation.ValueAnimator r0 = r2.f1
            if (r0 == 0) goto L13
            r0.cancel()
        L13:
            com.scwang.smartrefresh.layout.SmartRefreshLayout$c r0 = new com.scwang.smartrefresh.layout.SmartRefreshLayout$c
            r0.<init>(r2, r5, r4)
            if (r3 <= 0) goto L26
            android.animation.ValueAnimator r4 = new android.animation.ValueAnimator
            r4.<init>()
            r2.f1 = r4
            long r3 = (long) r3
            r2.postDelayed(r0, r3)
            goto L29
        L26:
            r0.run()
        L29:
            r3 = 1
            return r3
        L2b:
            r3 = 0
            return r3
    }

    public com.scwang.smartrefresh.layout.SmartRefreshLayout O0(boolean r1) {
            r0 = this;
            r0.G = r1
            return r0
    }

    public /* bridge */ /* synthetic */ l2.h P(int r1) {
            r0 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = r0.r0(r1)
            return r1
    }

    public com.scwang.smartrefresh.layout.SmartRefreshLayout P0(boolean r1) {
            r0 = this;
            r0.C = r1
            return r0
    }

    public boolean Q() {
            r1 = this;
            r0 = 0
            boolean r0 = r1.h0(r0)
            return r0
    }

    public com.scwang.smartrefresh.layout.SmartRefreshLayout Q0(boolean r1) {
            r0 = this;
            r0.B = r1
            return r0
    }

    public boolean R() {
            r1 = this;
            boolean r0 = r1.G
            return r0
    }

    public com.scwang.smartrefresh.layout.SmartRefreshLayout R0(boolean r1) {
            r0 = this;
            r0.A = r1
            r1 = 1
            r0.Q = r1
            return r0
    }

    public /* bridge */ /* synthetic */ l2.h S(boolean r1) {
            r0 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = r0.O0(r1)
            return r1
    }

    public com.scwang.smartrefresh.layout.SmartRefreshLayout S0(boolean r2) {
            r1 = this;
            r0 = 1
            r1.O = r0
            r1.z = r2
            return r1
    }

    public /* bridge */ /* synthetic */ l2.h T(l2.d r1) {
            r0 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = r0.r1(r1)
            return r1
    }

    public com.scwang.smartrefresh.layout.SmartRefreshLayout T0(boolean r2) {
            r1 = this;
            r1.K = r2
            l2.c r0 = r1.Q0
            if (r0 == 0) goto L9
            r0.c(r2)
        L9:
            return r1
    }

    public boolean U(int r3, int r4, float r5) {
            r2 = this;
            com.scwang.smartrefresh.layout.constant.RefreshState r0 = r2.V0
            com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.None
            if (r0 != r1) goto L2f
            boolean r0 = r2.y()
            if (r0 == 0) goto L2f
            boolean r0 = r2.N
            if (r0 != 0) goto L2f
            android.animation.ValueAnimator r0 = r2.f1
            if (r0 == 0) goto L17
            r0.cancel()
        L17:
            com.scwang.smartrefresh.layout.SmartRefreshLayout$d r0 = new com.scwang.smartrefresh.layout.SmartRefreshLayout$d
            r0.<init>(r2, r5, r4)
            if (r3 <= 0) goto L2a
            android.animation.ValueAnimator r4 = new android.animation.ValueAnimator
            r4.<init>()
            r2.f1 = r4
            long r3 = (long) r3
            r2.postDelayed(r0, r3)
            goto L2d
        L2a:
            r0.run()
        L2d:
            r3 = 1
            return r3
        L2f:
            r3 = 0
            return r3
    }

    public com.scwang.smartrefresh.layout.SmartRefreshLayout U0(boolean r1) {
            r0 = this;
            r0.E = r1
            return r0
    }

    public /* bridge */ /* synthetic */ l2.h V() {
            r1 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r1.v0()
            return r0
    }

    public com.scwang.smartrefresh.layout.SmartRefreshLayout V0(boolean r1) {
            r0 = this;
            r0.F = r1
            return r0
    }

    public /* bridge */ /* synthetic */ l2.h W() {
            r1 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r1.w0()
            return r0
    }

    public com.scwang.smartrefresh.layout.SmartRefreshLayout W0(boolean r1) {
            r0 = this;
            r0.H = r1
            return r0
    }

    public /* bridge */ /* synthetic */ l2.h X(int r1) {
            r0 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = r0.f1(r1)
            return r1
    }

    public com.scwang.smartrefresh.layout.SmartRefreshLayout X0(boolean r1) {
            r0 = this;
            r0.y = r1
            return r0
    }

    public /* bridge */ /* synthetic */ l2.h Y(boolean r1) {
            r0 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = r0.R0(r1)
            return r1
    }

    public com.scwang.smartrefresh.layout.SmartRefreshLayout Y0(boolean r1) {
            r0 = this;
            r0.I = r1
            return r0
    }

    public /* bridge */ /* synthetic */ l2.h Z(float r1) {
            r0 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = r0.e1(r1)
            return r1
    }

    public com.scwang.smartrefresh.layout.SmartRefreshLayout Z0(boolean r1) {
            r0 = this;
            r0.J = r1
            return r0
    }

    public l2.h a(l2.i r2) {
            r1 = this;
            r1.U = r2
            l2.c r0 = r1.Q0
            if (r0 == 0) goto L9
            r0.a(r2)
        L9:
            return r1
    }

    public /* bridge */ /* synthetic */ l2.h a0(boolean r1) {
            r0 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = r0.P0(r1)
            return r1
    }

    public com.scwang.smartrefresh.layout.SmartRefreshLayout a1(float r1) {
            r0 = this;
            int r1 = com.scwang.smartrefresh.layout.util.c.b(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = r0.b1(r1)
            return r1
    }

    public /* bridge */ /* synthetic */ l2.h b(boolean r1) {
            r0 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = r0.i1(r1)
            return r1
    }

    public /* bridge */ /* synthetic */ l2.h b0(boolean r1) {
            r0 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = r0.U0(r1)
            return r1
    }

    public com.scwang.smartrefresh.layout.SmartRefreshLayout b1(int r3) {
            r2 = this;
            com.scwang.smartrefresh.layout.constant.DimensionStatus r0 = r2.H0
            com.scwang.smartrefresh.layout.constant.DimensionStatus r1 = com.scwang.smartrefresh.layout.constant.DimensionStatus.CodeExact
            boolean r0 = r0.canReplaceWith(r1)
            if (r0 == 0) goto L2b
            r2.G0 = r3
            float r3 = (float) r3
            float r0 = r2.L0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r1
            float r3 = r3 * r0
            r0 = 0
            float r3 = java.lang.Math.max(r3, r0)
            int r3 = (int) r3
            r2.J0 = r3
            com.scwang.smartrefresh.layout.constant.DimensionStatus r3 = com.scwang.smartrefresh.layout.constant.DimensionStatus.CodeExactUnNotify
            r2.H0 = r3
            l2.d r3 = r2.P0
            if (r3 == 0) goto L2b
            android.view.View r3 = r3.getView()
            r3.requestLayout()
        L2b:
            return r2
    }

    public /* bridge */ /* synthetic */ l2.h c(boolean r1) {
            r0 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = r0.T0(r1)
            return r1
    }

    public /* bridge */ /* synthetic */ l2.h c0(float r1) {
            r0 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = r0.c1(r1)
            return r1
    }

    public com.scwang.smartrefresh.layout.SmartRefreshLayout c1(float r4) {
            r3 = this;
            r3.L0 = r4
            int r0 = r3.G0
            float r0 = (float) r0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 - r1
            float r0 = r0 * r4
            r4 = 0
            float r4 = java.lang.Math.max(r0, r4)
            int r4 = (int) r4
            r3.J0 = r4
            l2.d r0 = r3.P0
            if (r0 == 0) goto L22
            android.os.Handler r1 = r3.S0
            if (r1 == 0) goto L22
            l2.g r1 = r3.T0
            int r2 = r3.G0
            r0.f(r1, r2, r4)
            return r3
        L22:
            com.scwang.smartrefresh.layout.constant.DimensionStatus r4 = r3.H0
            com.scwang.smartrefresh.layout.constant.DimensionStatus r4 = r4.unNotify()
            r3.H0 = r4
            return r3
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            boolean r1 = r1 instanceof com.scwang.smartrefresh.layout.SmartRefreshLayout.o
            return r1
    }

    @Override // android.view.View
    public void computeScroll() {
            r10 = this;
            android.widget.Scroller r0 = r10.v
            int r0 = r0.getCurrY()
            android.widget.Scroller r1 = r10.v
            boolean r1 = r1.computeScrollOffset()
            if (r1 == 0) goto Ld4
            android.widget.Scroller r1 = r10.v
            int r1 = r1.getFinalY()
            r2 = 1
            if (r1 <= 0) goto L1f
            l2.c r3 = r10.Q0
            boolean r3 = r3.q()
            if (r3 != 0) goto L29
        L1f:
            if (r1 >= 0) goto Lcf
            l2.c r3 = r10.Q0
            boolean r3 = r3.o()
            if (r3 == 0) goto Lcf
        L29:
            boolean r3 = r10.X0
            if (r3 == 0) goto Lc9
            android.widget.Scroller r3 = r10.v
            float r3 = r3.getCurrVelocity()
            int r3 = (int) r3
            android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            android.widget.Scroller r4 = r10.v
            int r4 = r4.getCurrY()
            int r4 = r4 - r0
            int r0 = java.lang.Math.abs(r4)
            int r0 = r0 * 1000
            int r0 = r0 / r3
            r4 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r1 <= 0) goto La4
            boolean r0 = r10.y()
            if (r0 != 0) goto L55
            boolean r0 = r10.F
            if (r0 == 0) goto Lc6
        L55:
            boolean r0 = r10.G
            if (r0 == 0) goto L8a
            boolean r0 = r10.y()
            if (r0 == 0) goto L8a
            boolean r0 = r10.N
            if (r0 != 0) goto L8a
            int r0 = r10.G0
            double r0 = (double) r0
            double r8 = (double) r3
            double r8 = r8 * r6
            int r3 = r10.u
            double r6 = (double) r3
            double r8 = r8 / r6
            double r3 = java.lang.Math.pow(r8, r4)
            double r0 = r0 * r3
            int r0 = (int) r0
            int r0 = -r0
            r10.p0(r0)
            com.scwang.smartrefresh.layout.constant.RefreshState r0 = r10.V0
            boolean r1 = r0.opening
            if (r1 != 0) goto Lc6
            com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.Loading
            if (r0 == r1) goto Lc6
            com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.LoadFinish
            if (r0 == r1) goto Lc6
            r10.v1()
            goto Lc6
        L8a:
            boolean r0 = r10.E
            if (r0 == 0) goto Lc6
            int r0 = r10.G0
            double r0 = (double) r0
            double r8 = (double) r3
            double r8 = r8 * r6
            int r3 = r10.u
            double r6 = (double) r3
            double r8 = r8 / r6
            double r3 = java.lang.Math.pow(r8, r4)
            double r0 = r0 * r3
            int r0 = (int) r0
            int r0 = -r0
            r10.p0(r0)
            goto Lc6
        La4:
            boolean r0 = r10.f0()
            if (r0 != 0) goto Lae
            boolean r0 = r10.F
            if (r0 == 0) goto Lc6
        Lae:
            boolean r0 = r10.E
            if (r0 == 0) goto Lc6
            int r0 = r10.p0
            double r0 = (double) r0
            double r8 = (double) r3
            double r8 = r8 * r6
            int r3 = r10.u
            double r6 = (double) r3
            double r8 = r8 / r6
            double r3 = java.lang.Math.pow(r8, r4)
            double r0 = r0 * r3
            int r0 = (int) r0
            r10.p0(r0)
        Lc6:
            r0 = 0
            r10.X0 = r0
        Lc9:
            android.widget.Scroller r0 = r10.v
            r0.forceFinished(r2)
            return
        Lcf:
            r10.X0 = r2
            r10.invalidate()
        Ld4:
            return
    }

    public /* bridge */ /* synthetic */ l2.h d(boolean r1) {
            r0 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = r0.M0(r1)
            return r1
    }

    public /* bridge */ /* synthetic */ l2.h d0(l2.e r1, int r2, int r3) {
            r0 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = r0.u1(r1, r2, r3)
            return r1
    }

    public com.scwang.smartrefresh.layout.SmartRefreshLayout d1(float r1) {
            r0 = this;
            r0.N0 = r1
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(android.graphics.Canvas r15) {
            r14 = this;
            boolean r0 = r14.D
            if (r0 == 0) goto Lc
            boolean r0 = r14.isInEditMode()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            boolean r1 = r14.f0()
            if (r1 == 0) goto L1e
            int r1 = r14.a1
            if (r1 == 0) goto L1e
            int r2 = r14.b
            if (r2 > 0) goto L20
            if (r0 == 0) goto L1e
            goto L20
        L1e:
            r2 = r15
            goto L3d
        L20:
            android.graphics.Paint r2 = r14.R0
            r2.setColor(r1)
            int r1 = r14.getWidth()
            float r5 = (float) r1
            if (r0 == 0) goto L31
            int r0 = r14.p0
        L2e:
            float r0 = (float) r0
            r6 = r0
            goto L34
        L31:
            int r0 = r14.b
            goto L2e
        L34:
            android.graphics.Paint r7 = r14.R0
            r3 = 0
            r4 = 0
            r2 = r15
            r2.drawRect(r3, r4, r5, r6, r7)
            goto L70
        L3d:
            boolean r15 = r14.y()
            if (r15 == 0) goto L70
            int r15 = r14.b1
            if (r15 == 0) goto L70
            int r15 = r14.b
            if (r15 < 0) goto L4d
            if (r0 == 0) goto L70
        L4d:
            int r15 = r14.getHeight()
            android.graphics.Paint r1 = r14.R0
            int r3 = r14.b1
            r1.setColor(r3)
            if (r0 == 0) goto L5d
            int r0 = r14.G0
            goto L60
        L5d:
            int r0 = r14.b
            int r0 = -r0
        L60:
            int r0 = r15 - r0
            float r10 = (float) r0
            int r0 = r14.getWidth()
            float r11 = (float) r0
            float r12 = (float) r15
            android.graphics.Paint r13 = r14.R0
            r9 = 0
            r8 = r2
            r8.drawRect(r9, r10, r11, r12, r13)
        L70:
            super.dispatchDraw(r2)
            return
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float r2, float r3, boolean r4) {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.c0
            boolean r2 = r0.dispatchNestedFling(r2, r3, r4)
            return r2
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float r2, float r3) {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.c0
            boolean r2 = r0.dispatchNestedPreFling(r2, r3)
            return r2
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int r2, int r3, int[] r4, int[] r5) {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.c0
            boolean r2 = r0.dispatchNestedPreScroll(r2, r3, r4, r5)
            return r2
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int r7, int r8, int r9, int r10, int[] r11) {
            r6 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r6.c0
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            boolean r7 = r0.dispatchNestedScroll(r1, r2, r3, r4, r5)
            return r7
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent r22) {
            r21 = this;
            r0 = r21
            r1 = r22
            int r6 = r1.getActionMasked()
            r10 = 0
            r11 = 1
            r2 = 6
            if (r6 != r2) goto Lf
            r3 = 1
            goto L10
        Lf:
            r3 = 0
        L10:
            if (r3 == 0) goto L17
            int r4 = r1.getActionIndex()
            goto L18
        L17:
            r4 = -1
        L18:
            int r5 = r1.getPointerCount()
            r12 = 0
            r7 = 0
            r8 = 0
            r9 = 0
        L20:
            if (r7 >= r5) goto L32
            if (r4 != r7) goto L25
            goto L2f
        L25:
            float r13 = r1.getX(r7)
            float r8 = r8 + r13
            float r13 = r1.getY(r7)
            float r9 = r9 + r13
        L2f:
            int r7 = r7 + 1
            goto L20
        L32:
            if (r3 == 0) goto L36
            int r5 = r5 + (-1)
        L36:
            float r3 = (float) r5
            float r8 = r8 / r3
            float r9 = r9 / r3
            r3 = 5
            if (r6 == r2) goto L3e
            if (r6 != r3) goto L4b
        L3e:
            boolean r4 = r0.m
            if (r4 == 0) goto L4b
            float r4 = r0.i
            float r5 = r0.k
            float r5 = r9 - r5
            float r4 = r4 + r5
            r0.i = r4
        L4b:
            r0.j = r8
            r0.k = r9
            l2.c r4 = r0.Q0
            r5 = 2
            r7 = 3
            if (r4 == 0) goto L88
            if (r6 == 0) goto L74
            if (r6 == r11) goto L64
            if (r6 == r5) goto L5e
            if (r6 == r7) goto L6e
            goto L88
        L5e:
            android.view.VelocityTracker r4 = r0.w
            r4.addMovement(r1)
            goto L88
        L64:
            android.view.VelocityTracker r4 = r0.w
            int r13 = r0.u
            float r13 = (float) r13
            r14 = 1000(0x3e8, float:1.401E-42)
            r4.computeCurrentVelocity(r14, r13)
        L6e:
            l2.c r4 = r0.Q0
            r4.p()
            goto L88
        L74:
            android.view.VelocityTracker r4 = r0.w
            r4.clear()
            android.view.VelocityTracker r4 = r0.w
            r4.addMovement(r1)
            l2.c r4 = r0.Q0
            r4.d(r1)
            android.widget.Scroller r4 = r0.v
            r4.forceFinished(r11)
        L88:
            android.animation.ValueAnimator r4 = r0.f1
            if (r4 == 0) goto L92
            boolean r4 = r0.E0(r6)
            if (r4 == 0) goto La4
        L92:
            com.scwang.smartrefresh.layout.constant.RefreshState r4 = r0.V0
            com.scwang.smartrefresh.layout.constant.RefreshState r13 = com.scwang.smartrefresh.layout.constant.RefreshState.Loading
            if (r4 != r13) goto L9c
            boolean r14 = r0.M
            if (r14 != 0) goto La4
        L9c:
            com.scwang.smartrefresh.layout.constant.RefreshState r14 = com.scwang.smartrefresh.layout.constant.RefreshState.Refreshing
            if (r4 != r14) goto La5
            boolean r4 = r0.L
            if (r4 == 0) goto La5
        La4:
            return r10
        La5:
            boolean r4 = r0.b0
            if (r4 == 0) goto Lf4
            int r2 = r0.a0
            boolean r1 = r21.E1(r22)
            if (r6 != r5) goto Lf3
            int r3 = r0.a0
            if (r2 != r3) goto Lf3
            float r2 = r0.j
            int r2 = (int) r2
            int r3 = r0.getWidth()
            float r4 = r0.j
            float r5 = (float) r3
            float r4 = r4 / r5
            boolean r5 = r0.f0()
            if (r5 == 0) goto Lda
            int r5 = r0.b
            if (r5 <= 0) goto Lda
            l2.e r5 = r0.O0
            if (r5 == 0) goto Lda
            boolean r5 = r5.k()
            if (r5 == 0) goto Lda
            l2.e r5 = r0.O0
            r5.j(r4, r2, r3)
            return r1
        Lda:
            boolean r5 = r0.y()
            if (r5 == 0) goto Lf3
            int r5 = r0.b
            if (r5 >= 0) goto Lf3
            l2.d r5 = r0.P0
            if (r5 == 0) goto Lf3
            boolean r5 = r5.k()
            if (r5 == 0) goto Lf3
            l2.d r5 = r0.P0
            r5.j(r4, r2, r3)
        Lf3:
            return r1
        Lf4:
            boolean r4 = r0.isEnabled()
            if (r4 == 0) goto L34b
            boolean r4 = r0.f0()
            if (r4 != 0) goto L10a
            boolean r4 = r0.y()
            if (r4 != 0) goto L10a
            boolean r4 = r0.F
            if (r4 == 0) goto L34b
        L10a:
            boolean r4 = r0.c1
            if (r4 == 0) goto L116
            com.scwang.smartrefresh.layout.constant.RefreshState r4 = r0.V0
            if (r4 == r14) goto L34b
            com.scwang.smartrefresh.layout.constant.RefreshState r14 = com.scwang.smartrefresh.layout.constant.RefreshState.RefreshFinish
            if (r4 == r14) goto L34b
        L116:
            boolean r4 = r0.d1
            if (r4 == 0) goto L124
            com.scwang.smartrefresh.layout.constant.RefreshState r4 = r0.V0
            if (r4 == r13) goto L34b
            com.scwang.smartrefresh.layout.constant.RefreshState r13 = com.scwang.smartrefresh.layout.constant.RefreshState.LoadFinish
            if (r4 != r13) goto L124
            goto L34b
        L124:
            if (r6 == 0) goto L31f
            r2 = 0
            if (r6 == r11) goto L2c1
            if (r6 == r5) goto L12f
            if (r6 == r7) goto L2c1
            goto L31a
        L12f:
            android.view.VelocityTracker r3 = r0.w
            r3.addMovement(r1)
            float r3 = r0.h
            float r8 = r8 - r3
            float r3 = r0.i
            float r3 = r9 - r3
            boolean r4 = r0.m
            if (r4 != 0) goto L1f1
            boolean r4 = r0.o
            if (r4 != 0) goto L1f1
            boolean r4 = r0.n
            if (r4 != 0) goto L17e
            float r4 = java.lang.Math.abs(r3)
            int r5 = r0.a
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 < 0) goto L15f
            float r4 = java.lang.Math.abs(r8)
            float r5 = java.lang.Math.abs(r3)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L15f
            goto L17e
        L15f:
            float r4 = java.lang.Math.abs(r8)
            int r5 = r0.a
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 < 0) goto L1f1
            float r4 = java.lang.Math.abs(r8)
            float r5 = java.lang.Math.abs(r3)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L1f1
            boolean r4 = r0.n
            if (r4 != 0) goto L1f1
            r0.o = r11
            goto L1f1
        L17e:
            r0.n = r11
            int r4 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r4 <= 0) goto L1a4
            int r4 = r0.b
            if (r4 < 0) goto L19a
            boolean r4 = r0.f0()
            if (r4 != 0) goto L192
            boolean r4 = r0.F
            if (r4 == 0) goto L1a4
        L192:
            l2.c r4 = r0.Q0
            boolean r4 = r4.o()
            if (r4 == 0) goto L1a4
        L19a:
            r0.m = r11
            int r4 = r0.a
            float r4 = (float) r4
            float r4 = r9 - r4
            r0.i = r4
            goto L1c6
        L1a4:
            int r4 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r4 >= 0) goto L1c6
            int r4 = r0.b
            if (r4 > 0) goto L1be
            boolean r4 = r0.y()
            if (r4 != 0) goto L1b6
            boolean r4 = r0.F
            if (r4 == 0) goto L1c6
        L1b6:
            l2.c r4 = r0.Q0
            boolean r4 = r4.q()
            if (r4 == 0) goto L1c6
        L1be:
            r0.m = r11
            int r4 = r0.a
            float r4 = (float) r4
            float r4 = r4 + r9
            r0.i = r4
        L1c6:
            boolean r4 = r0.m
            if (r4 == 0) goto L1f1
            float r3 = r0.i
            float r3 = r9 - r3
            boolean r4 = r0.p
            if (r4 == 0) goto L1d8
            r1.setAction(r7)
            r21.E1(r22)
        L1d8:
            int r4 = r0.b
            if (r4 > 0) goto L1e7
            if (r4 != 0) goto L1e3
            int r4 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r4 <= 0) goto L1e3
            goto L1e7
        L1e3:
            r0.A1()
            goto L1ea
        L1e7:
            r0.y1()
        L1ea:
            android.view.ViewParent r4 = r0.getParent()
            r4.requestDisallowInterceptTouchEvent(r11)
        L1f1:
            boolean r4 = r0.m
            if (r4 == 0) goto L31a
            int r3 = (int) r3
            int r4 = r0.d
            int r3 = r3 + r4
            com.scwang.smartrefresh.layout.constant.RefreshState r4 = r0.getViceState()
            boolean r4 = r4.isHeader()
            if (r4 == 0) goto L209
            if (r3 < 0) goto L219
            int r4 = r0.c
            if (r4 < 0) goto L219
        L209:
            com.scwang.smartrefresh.layout.constant.RefreshState r4 = r0.getViceState()
            boolean r4 = r4.isFooter()
            if (r4 == 0) goto L2bc
            if (r3 > 0) goto L219
            int r4 = r0.c
            if (r4 <= 0) goto L2bc
        L219:
            r0.c = r3
            long r13 = r1.getEventTime()
            android.view.MotionEvent r1 = r0.e1
            if (r1 != 0) goto L239
            float r1 = r0.h
            float r18 = r1 + r8
            float r1 = r0.i
            r20 = 0
            r17 = 0
            r15 = r13
            r19 = r1
            android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r13, r15, r17, r18, r19, r20)
            r0.e1 = r1
            r0.E1(r1)
        L239:
            float r1 = r0.h
            float r18 = r1 + r8
            float r1 = r0.i
            float r4 = (float) r3
            float r19 = r1 + r4
            r20 = 0
            r17 = 2
            r15 = r13
            android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r13, r15, r17, r18, r19, r20)
            android.view.MotionEvent r4 = r0.e1
            if (r4 == 0) goto L252
            r0.E1(r1)
        L252:
            if (r3 <= 0) goto L270
            boolean r4 = r0.f0()
            if (r4 != 0) goto L25e
            boolean r4 = r0.F
            if (r4 == 0) goto L270
        L25e:
            l2.c r4 = r0.Q0
            boolean r4 = r4.o()
            if (r4 == 0) goto L270
            r0.k = r9
            r0.i = r9
            r0.d = r10
            r0.y1()
            goto L28f
        L270:
            if (r3 >= 0) goto L28e
            boolean r4 = r0.y()
            if (r4 != 0) goto L27c
            boolean r4 = r0.F
            if (r4 == 0) goto L28e
        L27c:
            l2.c r4 = r0.Q0
            boolean r4 = r4.q()
            if (r4 == 0) goto L28e
            r0.k = r9
            r0.i = r9
            r0.d = r10
            r0.A1()
            goto L28f
        L28e:
            r10 = r3
        L28f:
            com.scwang.smartrefresh.layout.constant.RefreshState r3 = r0.getViceState()
            boolean r3 = r3.isHeader()
            if (r3 == 0) goto L29b
            if (r10 < 0) goto L2a7
        L29b:
            com.scwang.smartrefresh.layout.constant.RefreshState r3 = r0.getViceState()
            boolean r3 = r3.isFooter()
            if (r3 == 0) goto L2af
            if (r10 <= 0) goto L2af
        L2a7:
            int r1 = r0.b
            if (r1 == 0) goto L2ae
            r0.G0(r12)
        L2ae:
            return r11
        L2af:
            android.view.MotionEvent r3 = r0.e1
            if (r3 == 0) goto L2bb
            r0.e1 = r2
            r1.setAction(r7)
            r0.E1(r1)
        L2bb:
            r3 = r10
        L2bc:
            float r1 = (float) r3
            r0.G0(r1)
            return r11
        L2c1:
            r0.n = r10
            r0.o = r10
            android.view.MotionEvent r3 = r0.e1
            if (r3 == 0) goto L2db
            r0.e1 = r2
            long r2 = r1.getEventTime()
            float r7 = r0.h
            r8 = r9
            r9 = 0
            r4 = r2
            android.view.MotionEvent r2 = android.view.MotionEvent.obtain(r2, r4, r6, r7, r8, r9)
            r0.E1(r2)
        L2db:
            boolean r2 = r0.I0()
            if (r2 == 0) goto L2e4
            r0.m = r10
            return r11
        L2e4:
            com.scwang.smartrefresh.layout.constant.RefreshState r2 = r0.V0
            com.scwang.smartrefresh.layout.constant.RefreshState r3 = r0.W0
            if (r2 == r3) goto L318
            int r3 = r0.b
            if (r3 == 0) goto L318
            com.scwang.smartrefresh.layout.constant.RefreshState r3 = com.scwang.smartrefresh.layout.constant.RefreshState.TwoLevel
            if (r2 == r3) goto L318
            android.view.VelocityTracker r2 = r0.w
            float r2 = r2.getYVelocity()
            float r2 = -r2
            float r3 = java.lang.Math.abs(r2)
            int r4 = r0.t
            float r4 = (float) r4
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L318
            int r3 = r0.b
            float r3 = (float) r3
            float r3 = r3 * r2
            int r3 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r3 <= 0) goto L318
            r0.m0(r10)
            l2.c r3 = r0.Q0
            if (r3 == 0) goto L318
            int r2 = (int) r2
            r3.n(r2)
        L318:
            r0.m = r10
        L31a:
            boolean r1 = r21.E1(r22)
            return r1
        L31f:
            r0.h = r8
            r0.i = r9
            r0.c = r10
            int r4 = r0.b
            r0.d = r4
            r0.m = r10
            boolean r1 = r21.E1(r22)
            r0.p = r1
            com.scwang.smartrefresh.layout.constant.RefreshState r1 = r0.V0
            com.scwang.smartrefresh.layout.constant.RefreshState r4 = com.scwang.smartrefresh.layout.constant.RefreshState.TwoLevel
            if (r1 != r4) goto L34a
            float r1 = r0.i
            int r4 = r0.getMeasuredHeight()
            int r4 = r4 * 5
            int r4 = r4 / r2
            float r2 = (float) r4
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L34a
            r0.o = r11
            boolean r1 = r0.p
            return r1
        L34a:
            return r11
        L34b:
            boolean r1 = r21.E1(r22)
            return r1
    }

    public boolean e() {
            r1 = this;
            boolean r0 = r1.E
            return r0
    }

    public /* bridge */ /* synthetic */ l2.h e0(l2.e r1) {
            r0 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = r0.t1(r1)
            return r1
    }

    public com.scwang.smartrefresh.layout.SmartRefreshLayout e1(float r1) {
            r0 = this;
            int r1 = com.scwang.smartrefresh.layout.util.c.b(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = r0.f1(r1)
            return r1
    }

    public /* bridge */ /* synthetic */ l2.h f(float r1) {
            r0 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = r0.d1(r1)
            return r1
    }

    public boolean f0() {
            r1 = this;
            boolean r0 = r1.y
            if (r0 == 0) goto La
            boolean r0 = r1.H
            if (r0 != 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public com.scwang.smartrefresh.layout.SmartRefreshLayout f1(int r3) {
            r2 = this;
            com.scwang.smartrefresh.layout.constant.DimensionStatus r0 = r2.F0
            com.scwang.smartrefresh.layout.constant.DimensionStatus r1 = com.scwang.smartrefresh.layout.constant.DimensionStatus.CodeExact
            boolean r0 = r0.canReplaceWith(r1)
            if (r0 == 0) goto L2b
            r2.p0 = r3
            float r3 = (float) r3
            float r0 = r2.K0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r1
            float r3 = r3 * r0
            r0 = 0
            float r3 = java.lang.Math.max(r3, r0)
            int r3 = (int) r3
            r2.I0 = r3
            com.scwang.smartrefresh.layout.constant.DimensionStatus r3 = com.scwang.smartrefresh.layout.constant.DimensionStatus.CodeExactUnNotify
            r2.F0 = r3
            l2.e r3 = r2.O0
            if (r3 == 0) goto L2b
            android.view.View r3 = r3.getView()
            r3.requestLayout()
        L2b:
            return r2
    }

    public /* bridge */ /* synthetic */ l2.h g(boolean r1) {
            r0 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = r0.Q0(r1)
            return r1
    }

    public /* bridge */ /* synthetic */ l2.h g0(boolean r1) {
            r0 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = r0.X0(r1)
            return r1
    }

    public com.scwang.smartrefresh.layout.SmartRefreshLayout g1(float r4) {
            r3 = this;
            r3.K0 = r4
            int r0 = r3.p0
            float r0 = (float) r0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 - r1
            float r0 = r0 * r4
            r4 = 0
            float r4 = java.lang.Math.max(r0, r4)
            int r4 = (int) r4
            r3.I0 = r4
            l2.e r0 = r3.O0
            if (r0 == 0) goto L22
            android.os.Handler r1 = r3.S0
            if (r1 == 0) goto L22
            l2.g r1 = r3.T0
            int r2 = r3.p0
            r0.f(r1, r2, r4)
            return r3
        L22:
            com.scwang.smartrefresh.layout.constant.DimensionStatus r4 = r3.F0
            com.scwang.smartrefresh.layout.constant.DimensionStatus r4 = r4.unNotify()
            r3.F0 = r4
            return r3
    }

    @Override // android.view.ViewGroup
    protected /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r1 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout$o r0 = r1.A0()
            return r0
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r1) {
            r0 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout$o r1 = r0.B0(r1)
            return r1
    }

    @Override // android.view.ViewGroup
    protected /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout$o r1 = r0.C0(r1)
            return r1
    }

    public /* bridge */ /* synthetic */ android.view.ViewGroup getLayout() {
            r1 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r1.m13getLayout()
            return r0
    }

    /* renamed from: getLayout, reason: collision with other method in class */
    public com.scwang.smartrefresh.layout.SmartRefreshLayout m13getLayout() {
            r0 = this;
            return r0
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
            r1 = this;
            androidx.core.view.NestedScrollingParentHelper r0 = r1.k0
            int r0 = r0.getNestedScrollAxes()
            return r0
    }

    @androidx.annotation.Nullable
    public l2.d getRefreshFooter() {
            r1 = this;
            l2.d r0 = r1.P0
            return r0
    }

    @androidx.annotation.Nullable
    public l2.e getRefreshHeader() {
            r1 = this;
            l2.e r0 = r1.O0
            return r0
    }

    public com.scwang.smartrefresh.layout.constant.RefreshState getState() {
            r1 = this;
            com.scwang.smartrefresh.layout.constant.RefreshState r0 = r1.V0
            return r0
    }

    protected com.scwang.smartrefresh.layout.constant.RefreshState getViceState() {
            r1 = this;
            com.scwang.smartrefresh.layout.constant.RefreshState r0 = r1.W0
            return r0
    }

    public /* bridge */ /* synthetic */ l2.h h(float r1) {
            r0 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = r0.a1(r1)
            return r1
    }

    public boolean h0(int r5) {
            r4 = this;
            int r0 = r4.f
            int r1 = r4.G0
            int r2 = r4.J0
            int r2 = r2 / 2
            int r2 = r2 + r1
            float r2 = (float) r2
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 * r3
            float r1 = (float) r1
            float r2 = r2 / r1
            boolean r5 = r4.U(r5, r0, r2)
            return r5
    }

    public com.scwang.smartrefresh.layout.SmartRefreshLayout h1(float r1) {
            r0 = this;
            r0.M0 = r1
            return r0
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.c0
            boolean r0 = r0.hasNestedScrollingParent()
            return r0
    }

    public /* bridge */ /* synthetic */ l2.h i(boolean r1) {
            r0 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = r0.V0(r1)
            return r1
    }

    public boolean i0() {
            r1 = this;
            boolean r0 = r1.I
            return r0
    }

    public com.scwang.smartrefresh.layout.SmartRefreshLayout i1(boolean r2) {
            r1 = this;
            r1.N = r2
            l2.d r0 = r1.P0
            if (r0 == 0) goto L9
            r0.b(r2)
        L9:
            return r1
    }

    public boolean isLoading() {
            r2 = this;
            com.scwang.smartrefresh.layout.constant.RefreshState r0 = r2.V0
            com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.Loading
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.c0
            boolean r0 = r0.isNestedScrollingEnabled()
            return r0
    }

    public /* bridge */ /* synthetic */ l2.h j(int r1) {
            r0 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = r0.b1(r1)
            return r1
    }

    public /* bridge */ /* synthetic */ l2.h j0(l2.d r1, int r2, int r3) {
            r0 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = r0.s1(r1, r2, r3)
            return r1
    }

    public com.scwang.smartrefresh.layout.SmartRefreshLayout j1(m2.b r2) {
            r1 = this;
            r1.S = r2
            boolean r0 = r1.z
            if (r0 != 0) goto Lf
            boolean r0 = r1.O
            if (r0 != 0) goto Ld
            if (r2 == 0) goto Ld
            goto Lf
        Ld:
            r2 = 0
            goto L10
        Lf:
            r2 = 1
        L10:
            r1.z = r2
            return r1
    }

    public /* bridge */ /* synthetic */ l2.h k() {
            r1 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r1.J0()
            return r0
    }

    public /* bridge */ /* synthetic */ l2.h k0(float r1) {
            r0 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = r0.N0(r1)
            return r1
    }

    public com.scwang.smartrefresh.layout.SmartRefreshLayout k1(m2.c r1) {
            r0 = this;
            r0.T = r1
            return r0
    }

    public /* bridge */ /* synthetic */ l2.h l(float r1) {
            r0 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = r0.h1(r1)
            return r1
    }

    public /* bridge */ /* synthetic */ l2.h l0(m2.c r1) {
            r0 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = r0.k1(r1)
            return r1
    }

    public com.scwang.smartrefresh.layout.SmartRefreshLayout l1(m2.d r1) {
            r0 = this;
            r0.R = r1
            return r0
    }

    public /* bridge */ /* synthetic */ l2.h m(boolean r1) {
            r0 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = r0.W0(r1)
            return r1
    }

    protected android.animation.ValueAnimator m0(int r2) {
            r1 = this;
            r0 = 0
            android.animation.ValueAnimator r2 = r1.n0(r2, r0)
            return r2
    }

    public com.scwang.smartrefresh.layout.SmartRefreshLayout m1(m2.e r2) {
            r1 = this;
            r1.R = r2
            r1.S = r2
            boolean r0 = r1.z
            if (r0 != 0) goto L11
            boolean r0 = r1.O
            if (r0 != 0) goto Lf
            if (r2 == 0) goto Lf
            goto L11
        Lf:
            r2 = 0
            goto L12
        L11:
            r2 = 1
        L12:
            r1.z = r2
            return r1
    }

    public /* bridge */ /* synthetic */ l2.h n(@androidx.annotation.ColorRes int[] r1) {
            r0 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = r0.o1(r1)
            return r1
    }

    protected android.animation.ValueAnimator n0(int r2, int r3) {
            r1 = this;
            android.view.animation.Interpolator r0 = r1.q
            android.animation.ValueAnimator r2 = r1.o0(r2, r3, r0)
            return r2
    }

    public com.scwang.smartrefresh.layout.SmartRefreshLayout n1(int... r2) {
            r1 = this;
            l2.e r0 = r1.O0
            if (r0 == 0) goto L7
            r0.setPrimaryColors(r2)
        L7:
            l2.d r0 = r1.P0
            if (r0 == 0) goto Le
            r0.setPrimaryColors(r2)
        Le:
            r1.x = r2
            return r1
    }

    public /* bridge */ /* synthetic */ l2.h o(boolean r1) {
            r0 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = r0.Y0(r1)
            return r1
    }

    protected android.animation.ValueAnimator o0(int r3, int r4, android.view.animation.Interpolator r5) {
            r2 = this;
            int r0 = r2.b
            if (r0 == r3) goto L3e
            android.animation.ValueAnimator r0 = r2.f1
            if (r0 == 0) goto Lb
            r0.cancel()
        Lb:
            int r0 = r2.b
            int[] r3 = new int[]{r0, r3}
            android.animation.ValueAnimator r3 = android.animation.ValueAnimator.ofInt(r3)
            r2.f1 = r3
            int r0 = r2.f
            long r0 = (long) r0
            r3.setDuration(r0)
            android.animation.ValueAnimator r3 = r2.f1
            r3.setInterpolator(r5)
            android.animation.ValueAnimator r3 = r2.f1
            android.animation.ValueAnimator$AnimatorUpdateListener r5 = r2.f5h1
            r3.addUpdateListener(r5)
            android.animation.ValueAnimator r3 = r2.f1
            android.animation.Animator$AnimatorListener r5 = r2.g1
            r3.addListener(r5)
            android.animation.ValueAnimator r3 = r2.f1
            long r4 = (long) r4
            r3.setStartDelay(r4)
            android.animation.ValueAnimator r3 = r2.f1
            r3.start()
            android.animation.ValueAnimator r3 = r2.f1
            return r3
        L3e:
            r3 = 0
            return r3
    }

    public com.scwang.smartrefresh.layout.SmartRefreshLayout o1(@androidx.annotation.ColorRes int... r5) {
            r4 = this;
            int r0 = r5.length
            int[] r0 = new int[r0]
            r1 = 0
        L4:
            int r2 = r5.length
            if (r1 >= r2) goto L16
            android.content.Context r2 = r4.getContext()
            r3 = r5[r1]
            int r2 = androidx.core.content.ContextCompat.getColor(r2, r3)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L4
        L16:
            r4.n1(r0)
            return r4
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
            r7 = this;
            super.onAttachedToWindow()
            boolean r0 = r7.isInEditMode()
            if (r0 == 0) goto Lb
            goto L1a5
        Lb:
            android.os.Handler r0 = r7.S0
            if (r0 != 0) goto L16
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            r7.S0 = r0
        L16:
            java.util.List<com.scwang.smartrefresh.layout.util.b> r0 = r7.U0
            r1 = 0
            if (r0 == 0) goto L3a
            java.util.Iterator r0 = r0.iterator()
        L1f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L33
            java.lang.Object r2 = r0.next()
            com.scwang.smartrefresh.layout.util.b r2 = (com.scwang.smartrefresh.layout.util.b) r2
            android.os.Handler r3 = r7.S0
            long r4 = r2.a
            r3.postDelayed(r2, r4)
            goto L1f
        L33:
            java.util.List<com.scwang.smartrefresh.layout.util.b> r0 = r7.U0
            r0.clear()
            r7.U0 = r1
        L3a:
            l2.e r0 = r7.O0
            r2 = -2
            r3 = -1
            if (r0 != 0) goto L75
            l2.b r0 = com.scwang.smartrefresh.layout.SmartRefreshLayout.f4k1
            android.content.Context r4 = r7.getContext()
            l2.e r0 = r0.a(r4, r7)
            r7.O0 = r0
            android.view.View r0 = r0.getView()
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r0 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 != 0) goto L75
            l2.e r0 = r7.O0
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r0 = r0.getSpinnerStyle()
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r4 = com.scwang.smartrefresh.layout.constant.SpinnerStyle.Scale
            if (r0 != r4) goto L6c
            l2.e r0 = r7.O0
            android.view.View r0 = r0.getView()
            r7.addView(r0, r3, r3)
            goto L75
        L6c:
            l2.e r0 = r7.O0
            android.view.View r0 = r0.getView()
            r7.addView(r0, r3, r2)
        L75:
            l2.d r0 = r7.P0
            r4 = 1
            r5 = 0
            if (r0 != 0) goto Lc2
            l2.a r0 = com.scwang.smartrefresh.layout.SmartRefreshLayout.f3j1
            android.content.Context r6 = r7.getContext()
            l2.d r0 = r0.a(r6, r7)
            r7.P0 = r0
            boolean r6 = r7.z
            if (r6 != 0) goto L96
            boolean r6 = r7.O
            if (r6 != 0) goto L94
            boolean r6 = com.scwang.smartrefresh.layout.SmartRefreshLayout.f2i1
            if (r6 == 0) goto L94
            goto L96
        L94:
            r6 = 0
            goto L97
        L96:
            r6 = 1
        L97:
            r7.z = r6
            android.view.View r0 = r0.getView()
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r0 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 != 0) goto Lc2
            l2.d r0 = r7.P0
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r0 = r0.getSpinnerStyle()
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r6 = com.scwang.smartrefresh.layout.constant.SpinnerStyle.Scale
            if (r0 != r6) goto Lb9
            l2.d r0 = r7.P0
            android.view.View r0 = r0.getView()
            r7.addView(r0, r3, r3)
            goto Lc2
        Lb9:
            l2.d r0 = r7.P0
            android.view.View r0 = r0.getView()
            r7.addView(r0, r3, r2)
        Lc2:
            int r0 = r7.getChildCount()
            r2 = 0
        Lc7:
            l2.c r3 = r7.Q0
            if (r3 != 0) goto Lef
            if (r2 >= r0) goto Lef
            android.view.View r3 = r7.getChildAt(r2)
            l2.e r6 = r7.O0
            if (r6 == 0) goto Ldb
            android.view.View r6 = r6.getView()
            if (r3 == r6) goto Lec
        Ldb:
            l2.d r6 = r7.P0
            if (r6 == 0) goto Le5
            android.view.View r6 = r6.getView()
            if (r3 == r6) goto Lec
        Le5:
            com.scwang.smartrefresh.layout.impl.a r6 = new com.scwang.smartrefresh.layout.impl.a
            r6.<init>(r3)
            r7.Q0 = r6
        Lec:
            int r2 = r2 + 1
            goto Lc7
        Lef:
            if (r3 != 0) goto Lfc
            com.scwang.smartrefresh.layout.impl.a r0 = new com.scwang.smartrefresh.layout.impl.a
            android.content.Context r2 = r7.getContext()
            r0.<init>(r2)
            r7.Q0 = r0
        Lfc:
            int r0 = r7.r
            if (r0 <= 0) goto L105
            android.view.View r0 = r7.findViewById(r0)
            goto L106
        L105:
            r0 = r1
        L106:
            int r2 = r7.s
            if (r2 <= 0) goto L10e
            android.view.View r1 = r7.findViewById(r2)
        L10e:
            l2.c r2 = r7.Q0
            l2.i r3 = r7.U
            r2.a(r3)
            l2.c r2 = r7.Q0
            boolean r3 = r7.K
            r2.c(r3)
            l2.c r2 = r7.Q0
            l2.g r3 = r7.T0
            r2.g(r3, r0, r1)
            int r0 = r7.b
            if (r0 == 0) goto L133
            com.scwang.smartrefresh.layout.constant.RefreshState r0 = com.scwang.smartrefresh.layout.constant.RefreshState.None
            r7.H0(r0)
            l2.c r0 = r7.Q0
            r7.b = r5
            r0.j(r5)
        L133:
            l2.c r0 = r7.Q0
            android.view.View r0 = r0.getView()
            r7.bringChildToFront(r0)
            l2.e r0 = r7.O0
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r0 = r0.getSpinnerStyle()
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r1 = com.scwang.smartrefresh.layout.constant.SpinnerStyle.FixedBehind
            if (r0 == r1) goto L14f
            l2.e r0 = r7.O0
            android.view.View r0 = r0.getView()
            r7.bringChildToFront(r0)
        L14f:
            l2.d r0 = r7.P0
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r0 = r0.getSpinnerStyle()
            if (r0 == r1) goto L160
            l2.d r0 = r7.P0
            android.view.View r0 = r0.getView()
            r7.bringChildToFront(r0)
        L160:
            m2.d r0 = r7.R
            if (r0 != 0) goto L16b
            com.scwang.smartrefresh.layout.SmartRefreshLayout$h r0 = new com.scwang.smartrefresh.layout.SmartRefreshLayout$h
            r0.<init>(r7)
            r7.R = r0
        L16b:
            m2.b r0 = r7.S
            if (r0 != 0) goto L176
            com.scwang.smartrefresh.layout.SmartRefreshLayout$i r0 = new com.scwang.smartrefresh.layout.SmartRefreshLayout$i
            r0.<init>(r7)
            r7.S = r0
        L176:
            int[] r0 = r7.x
            if (r0 == 0) goto L186
            l2.e r1 = r7.O0
            r1.setPrimaryColors(r0)
            l2.d r0 = r7.P0
            int[] r1 = r7.x
            r0.setPrimaryColors(r1)
        L186:
            boolean r0 = r7.P
            if (r0 != 0) goto L1a5
            boolean r0 = r7.isNestedScrollingEnabled()
            if (r0 != 0) goto L1a5
            android.view.ViewParent r0 = r7.getParent()
        L194:
            if (r0 == 0) goto L1a5
            boolean r1 = r0 instanceof androidx.core.view.NestedScrollingParent
            if (r1 == 0) goto L1a0
            r7.setNestedScrollingEnabled(r4)
            r7.P = r5
            return
        L1a0:
            android.view.ViewParent r0 = r0.getParent()
            goto L194
        L1a5:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r2 = this;
            super.onDetachedFromWindow()
            r0 = 0
            r2.F0(r0, r0)
            com.scwang.smartrefresh.layout.constant.RefreshState r0 = com.scwang.smartrefresh.layout.constant.RefreshState.None
            r2.H0(r0)
            android.os.Handler r0 = r2.S0
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
            r2.S0 = r1
            r0 = 1
            r2.O = r0
            r2.P = r0
            return
    }

    @Override // android.view.View
    protected void onFinishInflate() {
            r8 = this;
            super.onFinishInflate()
            int r0 = r8.getChildCount()
            r1 = 3
            if (r0 > r1) goto L137
            boolean[] r1 = new boolean[r0]
            r2 = 0
            r3 = 0
        Le:
            r4 = 1
            if (r3 >= r0) goto L68
            android.view.View r5 = r8.getChildAt(r3)
            boolean r6 = r5 instanceof l2.e
            if (r6 == 0) goto L22
            l2.e r6 = r8.O0
            if (r6 != 0) goto L22
            l2.e r5 = (l2.e) r5
            r8.O0 = r5
            goto L65
        L22:
            boolean r6 = r5 instanceof l2.d
            if (r6 == 0) goto L3b
            l2.d r6 = r8.P0
            if (r6 != 0) goto L3b
            boolean r6 = r8.z
            if (r6 != 0) goto L34
            boolean r6 = r8.O
            if (r6 != 0) goto L33
            goto L34
        L33:
            r4 = 0
        L34:
            r8.z = r4
            l2.d r5 = (l2.d) r5
            r8.P0 = r5
            goto L65
        L3b:
            l2.c r6 = r8.Q0
            if (r6 != 0) goto L63
            boolean r6 = r5 instanceof android.widget.AbsListView
            if (r6 != 0) goto L5b
            boolean r6 = r5 instanceof android.webkit.WebView
            if (r6 != 0) goto L5b
            boolean r6 = r5 instanceof android.widget.ScrollView
            if (r6 != 0) goto L5b
            boolean r6 = r5 instanceof androidx.core.view.ScrollingView
            if (r6 != 0) goto L5b
            boolean r6 = r5 instanceof androidx.core.view.NestedScrollingChild
            if (r6 != 0) goto L5b
            boolean r6 = r5 instanceof androidx.core.view.NestedScrollingParent
            if (r6 != 0) goto L5b
            boolean r6 = r5 instanceof androidx.viewpager.widget.ViewPager
            if (r6 == 0) goto L63
        L5b:
            com.scwang.smartrefresh.layout.impl.a r4 = new com.scwang.smartrefresh.layout.impl.a
            r4.<init>(r5)
            r8.Q0 = r4
            goto L65
        L63:
            r1[r3] = r4
        L65:
            int r3 = r3 + 1
            goto Le
        L68:
            r3 = 0
        L69:
            if (r3 >= r0) goto Le7
            boolean r5 = r1[r3]
            if (r5 == 0) goto Le4
            android.view.View r5 = r8.getChildAt(r3)
            if (r0 != r4) goto L82
            l2.c r6 = r8.Q0
            if (r6 != 0) goto L82
            com.scwang.smartrefresh.layout.impl.a r6 = new com.scwang.smartrefresh.layout.impl.a
            r6.<init>(r5)
            r8.Q0 = r6
            goto Le4
        L82:
            if (r3 != 0) goto L90
            l2.e r6 = r8.O0
            if (r6 != 0) goto L90
            com.scwang.smartrefresh.layout.impl.c r6 = new com.scwang.smartrefresh.layout.impl.c
            r6.<init>(r5)
            r8.O0 = r6
            goto Le4
        L90:
            r6 = 2
            if (r0 != r6) goto L9f
            l2.c r7 = r8.Q0
            if (r7 != 0) goto L9f
            com.scwang.smartrefresh.layout.impl.a r6 = new com.scwang.smartrefresh.layout.impl.a
            r6.<init>(r5)
            r8.Q0 = r6
            goto Le4
        L9f:
            if (r3 != r6) goto Lbb
            l2.d r7 = r8.P0
            if (r7 != 0) goto Lbb
            boolean r6 = r8.z
            if (r6 != 0) goto Lb0
            boolean r6 = r8.O
            if (r6 != 0) goto Lae
            goto Lb0
        Lae:
            r6 = 0
            goto Lb1
        Lb0:
            r6 = 1
        Lb1:
            r8.z = r6
            com.scwang.smartrefresh.layout.impl.b r6 = new com.scwang.smartrefresh.layout.impl.b
            r6.<init>(r5)
            r8.P0 = r6
            goto Le4
        Lbb:
            l2.c r7 = r8.Q0
            if (r7 != 0) goto Lc7
            com.scwang.smartrefresh.layout.impl.a r6 = new com.scwang.smartrefresh.layout.impl.a
            r6.<init>(r5)
            r8.Q0 = r6
            goto Le4
        Lc7:
            if (r3 != r4) goto Le4
            if (r0 != r6) goto Le4
            l2.d r6 = r8.P0
            if (r6 != 0) goto Le4
            boolean r6 = r8.z
            if (r6 != 0) goto Lda
            boolean r6 = r8.O
            if (r6 != 0) goto Ld8
            goto Lda
        Ld8:
            r6 = 0
            goto Ldb
        Lda:
            r6 = 1
        Ldb:
            r8.z = r6
            com.scwang.smartrefresh.layout.impl.b r6 = new com.scwang.smartrefresh.layout.impl.b
            r6.<init>(r5)
            r8.P0 = r6
        Le4:
            int r3 = r3 + 1
            goto L69
        Le7:
            boolean r0 = r8.isInEditMode()
            if (r0 == 0) goto L136
            int[] r0 = r8.x
            if (r0 == 0) goto L101
            l2.e r1 = r8.O0
            if (r1 == 0) goto Lf8
            r1.setPrimaryColors(r0)
        Lf8:
            l2.d r0 = r8.P0
            if (r0 == 0) goto L101
            int[] r1 = r8.x
            r0.setPrimaryColors(r1)
        L101:
            l2.c r0 = r8.Q0
            if (r0 == 0) goto L10c
            android.view.View r0 = r0.getView()
            r8.bringChildToFront(r0)
        L10c:
            l2.e r0 = r8.O0
            if (r0 == 0) goto L121
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r0 = r0.getSpinnerStyle()
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r1 = com.scwang.smartrefresh.layout.constant.SpinnerStyle.FixedBehind
            if (r0 == r1) goto L121
            l2.e r0 = r8.O0
            android.view.View r0 = r0.getView()
            r8.bringChildToFront(r0)
        L121:
            l2.d r0 = r8.P0
            if (r0 == 0) goto L136
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r0 = r0.getSpinnerStyle()
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r1 = com.scwang.smartrefresh.layout.constant.SpinnerStyle.FixedBehind
            if (r0 == r1) goto L136
            l2.d r0 = r8.P0
            android.view.View r0 = r0.getView()
            r8.bringChildToFront(r0)
        L136:
            return
        L137:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "最多只支持3个子View，Most only support three sub view"
            r0.<init>(r1)
            throw r0
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
            r10 = this;
            int r11 = r10.getPaddingLeft()
            int r12 = r10.getPaddingTop()
            r10.getPaddingBottom()
            int r13 = r10.getChildCount()
            r14 = 0
            r15 = 0
        L11:
            if (r15 >= r13) goto L14f
            android.view.View r0 = r10.getChildAt(r15)
            l2.c r1 = r10.Q0
            r2 = 1
            if (r1 == 0) goto L6a
            android.view.View r1 = r1.getView()
            if (r1 != r0) goto L6a
            boolean r1 = r10.isInEditMode()
            if (r1 == 0) goto L2e
            boolean r1 = r10.D
            if (r1 == 0) goto L2e
            r1 = 1
            goto L2f
        L2e:
            r1 = 0
        L2f:
            l2.c r3 = r10.Q0
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            com.scwang.smartrefresh.layout.SmartRefreshLayout$o r3 = (com.scwang.smartrefresh.layout.SmartRefreshLayout.o) r3
            int r4 = r3.leftMargin
            int r4 = r4 + r11
            int r3 = r3.topMargin
            int r3 = r3 + r12
            l2.c r5 = r10.Q0
            int r5 = r5.f()
            int r5 = r5 + r4
            l2.c r6 = r10.Q0
            int r6 = r6.i()
            int r6 = r6 + r3
            if (r1 == 0) goto L65
            boolean r1 = r10.f0()
            if (r1 == 0) goto L65
            boolean r1 = r10.A
            if (r1 != 0) goto L61
            l2.e r1 = r10.O0
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r1 = r1.getSpinnerStyle()
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r7 = com.scwang.smartrefresh.layout.constant.SpinnerStyle.FixedBehind
            if (r1 != r7) goto L65
        L61:
            int r1 = r10.p0
            int r3 = r3 + r1
            int r6 = r6 + r1
        L65:
            l2.c r1 = r10.Q0
            r1.l(r4, r3, r5, r6)
        L6a:
            l2.e r1 = r10.O0
            if (r1 == 0) goto Lda
            android.view.View r1 = r1.getView()
            if (r1 != r0) goto Lda
            boolean r1 = r10.isInEditMode()
            if (r1 == 0) goto L86
            boolean r1 = r10.D
            if (r1 == 0) goto L86
            boolean r1 = r10.f0()
            if (r1 == 0) goto L86
            r1 = 1
            goto L87
        L86:
            r1 = 0
        L87:
            l2.e r3 = r10.O0
            android.view.View r3 = r3.getView()
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            com.scwang.smartrefresh.layout.SmartRefreshLayout$o r4 = (com.scwang.smartrefresh.layout.SmartRefreshLayout.o) r4
            int r5 = r4.leftMargin
            int r6 = r4.topMargin
            int r7 = r3.getMeasuredWidth()
            int r7 = r7 + r5
            int r8 = r3.getMeasuredHeight()
            int r8 = r8 + r6
            if (r1 != 0) goto Ld7
            l2.e r1 = r10.O0
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r1 = r1.getSpinnerStyle()
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r9 = com.scwang.smartrefresh.layout.constant.SpinnerStyle.Translate
            if (r1 != r9) goto Lb7
            int r1 = r10.p0
            int r6 = r6 - r1
            int r1 = r3.getMeasuredHeight()
        Lb4:
            int r8 = r6 + r1
            goto Ld7
        Lb7:
            l2.e r1 = r10.O0
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r1 = r1.getSpinnerStyle()
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r9 = com.scwang.smartrefresh.layout.constant.SpinnerStyle.Scale
            if (r1 != r9) goto Ld7
            boolean r1 = r10.f0()
            if (r1 == 0) goto Lca
            int r1 = r10.b
            goto Lcb
        Lca:
            r1 = 0
        Lcb:
            int r1 = java.lang.Math.max(r14, r1)
            int r4 = r4.bottomMargin
            int r1 = r1 - r4
            int r1 = java.lang.Math.max(r1, r14)
            goto Lb4
        Ld7:
            r3.layout(r5, r6, r7, r8)
        Lda:
            l2.d r1 = r10.P0
            if (r1 == 0) goto L14b
            android.view.View r1 = r1.getView()
            if (r1 != r0) goto L14b
            boolean r0 = r10.isInEditMode()
            if (r0 == 0) goto Lf5
            boolean r0 = r10.D
            if (r0 == 0) goto Lf5
            boolean r0 = r10.y()
            if (r0 == 0) goto Lf5
            goto Lf6
        Lf5:
            r2 = 0
        Lf6:
            l2.d r0 = r10.P0
            android.view.View r0 = r0.getView()
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            com.scwang.smartrefresh.layout.SmartRefreshLayout$o r1 = (com.scwang.smartrefresh.layout.SmartRefreshLayout.o) r1
            l2.d r3 = r10.P0
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r3 = r3.getSpinnerStyle()
            int r4 = r1.leftMargin
            int r5 = r1.topMargin
            int r6 = r10.getMeasuredHeight()
            int r5 = r5 + r6
            int r6 = r1.bottomMargin
            int r5 = r5 - r6
            if (r2 != 0) goto L13b
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r2 = com.scwang.smartrefresh.layout.constant.SpinnerStyle.FixedFront
            if (r3 == r2) goto L13b
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r2 = com.scwang.smartrefresh.layout.constant.SpinnerStyle.FixedBehind
            if (r3 != r2) goto L11f
            goto L13b
        L11f:
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r2 = com.scwang.smartrefresh.layout.constant.SpinnerStyle.Scale
            if (r3 != r2) goto L13e
            boolean r2 = r10.y()
            if (r2 == 0) goto L12d
            int r2 = r10.b
            int r2 = -r2
            goto L12e
        L12d:
            r2 = 0
        L12e:
            int r2 = java.lang.Math.max(r2, r14)
            int r1 = r1.topMargin
            int r2 = r2 - r1
            int r1 = java.lang.Math.max(r2, r14)
        L139:
            int r5 = r5 - r1
            goto L13e
        L13b:
            int r1 = r10.G0
            goto L139
        L13e:
            int r1 = r0.getMeasuredWidth()
            int r1 = r1 + r4
            int r2 = r0.getMeasuredHeight()
            int r2 = r2 + r5
            r0.layout(r4, r5, r1, r2)
        L14b:
            int r15 = r15 + 1
            goto L11
        L14f:
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r19, int r20) {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            boolean r3 = r0.isInEditMode()
            r4 = 0
            if (r3 == 0) goto L13
            boolean r3 = r0.D
            if (r3 == 0) goto L13
            r3 = 1
            goto L14
        L13:
            r3 = 0
        L14:
            int r5 = r0.getChildCount()
            r6 = 0
            r7 = 0
        L1a:
            if (r6 >= r5) goto L354
            android.view.View r8 = r0.getChildAt(r6)
            l2.e r9 = r0.O0
            r14 = -2
            r15 = 1073741824(0x40000000, float:2.0)
            if (r9 == 0) goto L176
            android.view.View r9 = r9.getView()
            if (r9 != r8) goto L176
            l2.e r9 = r0.O0
            android.view.View r9 = r9.getView()
            android.view.ViewGroup$LayoutParams r16 = r9.getLayoutParams()
            r17 = 1065353216(0x3f800000, float:1.0)
            r11 = r16
            com.scwang.smartrefresh.layout.SmartRefreshLayout$o r11 = (com.scwang.smartrefresh.layout.SmartRefreshLayout.o) r11
            int r10 = r11.leftMargin
            int r12 = r11.rightMargin
            int r10 = r10 + r12
            int r12 = r11.width
            int r10 = android.view.ViewGroup.getChildMeasureSpec(r1, r10, r12)
            com.scwang.smartrefresh.layout.constant.DimensionStatus r12 = r0.F0
            com.scwang.smartrefresh.layout.constant.DimensionStatus r13 = com.scwang.smartrefresh.layout.constant.DimensionStatus.XmlLayoutUnNotify
            boolean r12 = r12.gteReplaceWith(r13)
            if (r12 == 0) goto L64
            int r12 = r0.p0
            int r13 = r11.bottomMargin
            int r12 = r12 - r13
            int r12 = java.lang.Math.max(r12, r4)
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r15)
            r9.measure(r10, r12)
            goto L118
        L64:
            l2.e r12 = r0.O0
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r12 = r12.getSpinnerStyle()
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r13 = com.scwang.smartrefresh.layout.constant.SpinnerStyle.MatchLayout
            if (r12 != r13) goto L97
            com.scwang.smartrefresh.layout.constant.DimensionStatus r12 = r0.F0
            boolean r12 = r12.notifyed
            if (r12 != 0) goto L7c
            r0.measureChild(r9, r10, r2)
            int r12 = r9.getMeasuredHeight()
            goto L7d
        L7c:
            r12 = 0
        L7d:
            int r13 = android.view.View.MeasureSpec.getSize(r2)
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r15)
            r9.measure(r10, r13)
            if (r12 <= 0) goto L118
            int r13 = r9.getMeasuredHeight()
            if (r12 == r13) goto L118
            int r13 = r11.bottomMargin
            int r12 = r12 + r13
            r0.p0 = r12
            goto L118
        L97:
            int r12 = r11.height
            if (r12 <= 0) goto Lb8
            com.scwang.smartrefresh.layout.constant.DimensionStatus r12 = r0.F0
            com.scwang.smartrefresh.layout.constant.DimensionStatus r13 = com.scwang.smartrefresh.layout.constant.DimensionStatus.XmlExactUnNotify
            boolean r12 = r12.canReplaceWith(r13)
            if (r12 == 0) goto Lae
            int r12 = r11.height
            int r4 = r11.bottomMargin
            int r12 = r12 + r4
            r0.p0 = r12
            r0.F0 = r13
        Lae:
            int r4 = r11.height
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r15)
            r9.measure(r10, r4)
            goto L118
        Lb8:
            if (r12 != r14) goto L100
            int r4 = android.view.View.MeasureSpec.getSize(r2)
            int r12 = r11.bottomMargin
            int r4 = r4 - r12
            r12 = 0
            int r4 = java.lang.Math.max(r4, r12)
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r12)
            r9.measure(r10, r4)
            int r4 = r9.getMeasuredHeight()
            if (r4 <= 0) goto Lec
            com.scwang.smartrefresh.layout.constant.DimensionStatus r12 = r0.F0
            com.scwang.smartrefresh.layout.constant.DimensionStatus r13 = com.scwang.smartrefresh.layout.constant.DimensionStatus.XmlWrapUnNotify
            boolean r12 = r12.canReplaceWith(r13)
            if (r12 == 0) goto Lec
            r0.F0 = r13
            int r4 = r9.getMeasuredHeight()
            int r12 = r11.bottomMargin
            int r4 = r4 + r12
            r0.p0 = r4
        Lea:
            r13 = 0
            goto L118
        Lec:
            if (r4 > 0) goto Lea
            int r4 = r0.p0
            int r12 = r11.bottomMargin
            int r4 = r4 - r12
            r13 = 0
            int r4 = java.lang.Math.max(r4, r13)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r15)
            r9.measure(r10, r4)
            goto L118
        L100:
            r4 = -1
            r13 = 0
            if (r12 != r4) goto L115
            int r4 = r0.p0
            int r12 = r11.bottomMargin
            int r4 = r4 - r12
            int r4 = java.lang.Math.max(r4, r13)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r15)
            r9.measure(r10, r4)
            goto L118
        L115:
            r9.measure(r10, r2)
        L118:
            l2.e r4 = r0.O0
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r4 = r4.getSpinnerStyle()
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r12 = com.scwang.smartrefresh.layout.constant.SpinnerStyle.Scale
            if (r4 != r12) goto L142
            if (r3 != 0) goto L142
            boolean r4 = r0.f0()
            if (r4 == 0) goto L12e
            int r4 = r0.b
        L12c:
            r13 = 0
            goto L130
        L12e:
            r4 = 0
            goto L12c
        L130:
            int r4 = java.lang.Math.max(r13, r4)
            int r11 = r11.bottomMargin
            int r4 = r4 - r11
            int r4 = java.lang.Math.max(r4, r13)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r15)
            r9.measure(r10, r4)
        L142:
            com.scwang.smartrefresh.layout.constant.DimensionStatus r4 = r0.F0
            boolean r10 = r4.notifyed
            if (r10 != 0) goto L168
            com.scwang.smartrefresh.layout.constant.DimensionStatus r4 = r4.notifyed()
            r0.F0 = r4
            int r4 = r0.p0
            float r4 = (float) r4
            float r10 = r0.K0
            float r10 = r10 - r17
            float r4 = r4 * r10
            r10 = 0
            float r4 = java.lang.Math.max(r4, r10)
            int r4 = (int) r4
            r0.I0 = r4
            l2.e r10 = r0.O0
            l2.g r11 = r0.T0
            int r12 = r0.p0
            r10.f(r11, r12, r4)
        L168:
            if (r3 == 0) goto L178
            boolean r4 = r0.f0()
            if (r4 == 0) goto L178
            int r4 = r9.getMeasuredHeight()
            int r7 = r7 + r4
            goto L178
        L176:
            r17 = 1065353216(0x3f800000, float:1.0)
        L178:
            l2.d r4 = r0.P0
            if (r4 == 0) goto L2c7
            android.view.View r4 = r4.getView()
            if (r4 != r8) goto L2c7
            l2.d r4 = r0.P0
            android.view.View r4 = r4.getView()
            android.view.ViewGroup$LayoutParams r9 = r4.getLayoutParams()
            com.scwang.smartrefresh.layout.SmartRefreshLayout$o r9 = (com.scwang.smartrefresh.layout.SmartRefreshLayout.o) r9
            int r10 = r9.leftMargin
            int r11 = r9.rightMargin
            int r10 = r10 + r11
            int r11 = r9.width
            int r10 = android.view.ViewGroup.getChildMeasureSpec(r1, r10, r11)
            com.scwang.smartrefresh.layout.constant.DimensionStatus r11 = r0.H0
            com.scwang.smartrefresh.layout.constant.DimensionStatus r12 = com.scwang.smartrefresh.layout.constant.DimensionStatus.XmlLayoutUnNotify
            boolean r11 = r11.gteReplaceWith(r12)
            if (r11 == 0) goto L1b6
            int r11 = r0.G0
            int r12 = r9.topMargin
            int r11 = r11 - r12
            r13 = 0
            int r11 = java.lang.Math.max(r11, r13)
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r15)
            r4.measure(r10, r11)
            goto L26a
        L1b6:
            l2.d r11 = r0.P0
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r11 = r11.getSpinnerStyle()
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r12 = com.scwang.smartrefresh.layout.constant.SpinnerStyle.MatchLayout
            if (r11 != r12) goto L1e9
            com.scwang.smartrefresh.layout.constant.DimensionStatus r11 = r0.H0
            boolean r11 = r11.notifyed
            if (r11 != 0) goto L1ce
            r0.measureChild(r4, r10, r2)
            int r11 = r4.getMeasuredHeight()
            goto L1cf
        L1ce:
            r11 = 0
        L1cf:
            int r12 = android.view.View.MeasureSpec.getSize(r2)
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r15)
            r4.measure(r10, r12)
            if (r11 <= 0) goto L26a
            int r12 = r4.getMeasuredHeight()
            if (r11 == r12) goto L26a
            int r12 = r9.bottomMargin
            int r11 = r11 + r12
            r0.p0 = r11
            goto L26a
        L1e9:
            int r11 = r9.height
            if (r11 <= 0) goto L20a
            com.scwang.smartrefresh.layout.constant.DimensionStatus r11 = r0.H0
            com.scwang.smartrefresh.layout.constant.DimensionStatus r12 = com.scwang.smartrefresh.layout.constant.DimensionStatus.XmlExactUnNotify
            boolean r11 = r11.canReplaceWith(r12)
            if (r11 == 0) goto L200
            int r11 = r9.height
            int r13 = r9.topMargin
            int r11 = r11 + r13
            r0.G0 = r11
            r0.H0 = r12
        L200:
            int r11 = r9.height
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r15)
            r4.measure(r10, r11)
            goto L26a
        L20a:
            if (r11 != r14) goto L252
            int r11 = android.view.View.MeasureSpec.getSize(r2)
            int r12 = r9.topMargin
            int r11 = r11 - r12
            r13 = 0
            int r11 = java.lang.Math.max(r11, r13)
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r12)
            r4.measure(r10, r11)
            int r11 = r4.getMeasuredHeight()
            if (r11 <= 0) goto L23e
            com.scwang.smartrefresh.layout.constant.DimensionStatus r12 = r0.H0
            com.scwang.smartrefresh.layout.constant.DimensionStatus r13 = com.scwang.smartrefresh.layout.constant.DimensionStatus.XmlWrapUnNotify
            boolean r12 = r12.canReplaceWith(r13)
            if (r12 == 0) goto L23e
            r0.H0 = r13
            int r11 = r4.getMeasuredHeight()
            int r12 = r9.topMargin
            int r11 = r11 + r12
            r0.G0 = r11
        L23c:
            r13 = 0
            goto L26a
        L23e:
            if (r11 > 0) goto L23c
            int r11 = r0.G0
            int r12 = r9.topMargin
            int r11 = r11 - r12
            r13 = 0
            int r11 = java.lang.Math.max(r11, r13)
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r15)
            r4.measure(r10, r11)
            goto L26a
        L252:
            r12 = -1
            r13 = 0
            if (r11 != r12) goto L267
            int r11 = r0.G0
            int r12 = r9.topMargin
            int r11 = r11 - r12
            int r11 = java.lang.Math.max(r11, r13)
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r15)
            r4.measure(r10, r11)
            goto L26a
        L267:
            r4.measure(r10, r2)
        L26a:
            l2.d r11 = r0.P0
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r11 = r11.getSpinnerStyle()
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r12 = com.scwang.smartrefresh.layout.constant.SpinnerStyle.Scale
            if (r11 != r12) goto L294
            if (r3 != 0) goto L294
            boolean r11 = r0.z
            if (r11 == 0) goto L27f
            int r11 = r0.b
            int r12 = -r11
        L27d:
            r13 = 0
            goto L281
        L27f:
            r12 = 0
            goto L27d
        L281:
            int r11 = java.lang.Math.max(r13, r12)
            int r9 = r9.topMargin
            int r11 = r11 - r9
            int r9 = java.lang.Math.max(r11, r13)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r15)
            r4.measure(r10, r9)
            goto L295
        L294:
            r13 = 0
        L295:
            com.scwang.smartrefresh.layout.constant.DimensionStatus r9 = r0.H0
            boolean r10 = r9.notifyed
            if (r10 != 0) goto L2bb
            com.scwang.smartrefresh.layout.constant.DimensionStatus r9 = r9.notifyed()
            r0.H0 = r9
            int r9 = r0.G0
            float r9 = (float) r9
            float r10 = r0.L0
            float r10 = r10 - r17
            float r9 = r9 * r10
            r10 = 0
            float r9 = java.lang.Math.max(r9, r10)
            int r9 = (int) r9
            r0.J0 = r9
            l2.d r10 = r0.P0
            l2.g r11 = r0.T0
            int r12 = r0.G0
            r10.f(r11, r12, r9)
        L2bb:
            if (r3 == 0) goto L2c8
            boolean r9 = r0.z
            if (r9 == 0) goto L2c8
            int r4 = r4.getMeasuredHeight()
            int r7 = r7 + r4
            goto L2c8
        L2c7:
            r13 = 0
        L2c8:
            l2.c r4 = r0.Q0
            if (r4 == 0) goto L34f
            android.view.View r4 = r4.getView()
            if (r4 != r8) goto L34f
            l2.c r4 = r0.Q0
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            com.scwang.smartrefresh.layout.SmartRefreshLayout$o r4 = (com.scwang.smartrefresh.layout.SmartRefreshLayout.o) r4
            int r8 = r0.getPaddingLeft()
            int r9 = r0.getPaddingRight()
            int r8 = r8 + r9
            int r9 = r4.leftMargin
            int r8 = r8 + r9
            int r9 = r4.rightMargin
            int r8 = r8 + r9
            int r9 = r4.width
            int r8 = android.view.ViewGroup.getChildMeasureSpec(r1, r8, r9)
            int r9 = r0.getPaddingTop()
            int r10 = r0.getPaddingBottom()
            int r9 = r9 + r10
            int r10 = r4.topMargin
            int r9 = r9 + r10
            int r10 = r4.bottomMargin
            int r9 = r9 + r10
            if (r3 == 0) goto L317
            boolean r10 = r0.f0()
            if (r10 == 0) goto L317
            boolean r10 = r0.A
            if (r10 != 0) goto L314
            l2.e r10 = r0.O0
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r10 = r10.getSpinnerStyle()
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r11 = com.scwang.smartrefresh.layout.constant.SpinnerStyle.FixedBehind
            if (r10 != r11) goto L317
        L314:
            int r12 = r0.p0
            goto L318
        L317:
            r12 = 0
        L318:
            int r9 = r9 + r12
            if (r3 == 0) goto L332
            boolean r10 = r0.y()
            if (r10 == 0) goto L332
            boolean r10 = r0.B
            if (r10 != 0) goto L32f
            l2.d r10 = r0.P0
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r10 = r10.getSpinnerStyle()
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r11 = com.scwang.smartrefresh.layout.constant.SpinnerStyle.FixedBehind
            if (r10 != r11) goto L332
        L32f:
            int r12 = r0.G0
            goto L333
        L332:
            r12 = 0
        L333:
            int r9 = r9 + r12
            int r4 = r4.height
            int r4 = android.view.ViewGroup.getChildMeasureSpec(r2, r9, r4)
            l2.c r9 = r0.Q0
            r9.h(r8, r4)
            l2.c r4 = r0.Q0
            int r8 = r0.p0
            int r9 = r0.G0
            r4.k(r8, r9)
            l2.c r4 = r0.Q0
            int r4 = r4.i()
            int r7 = r7 + r4
        L34f:
            int r6 = r6 + 1
            r4 = 0
            goto L1a
        L354:
            int r3 = r0.getSuggestedMinimumWidth()
            int r1 = android.view.View.resolveSize(r3, r1)
            int r2 = android.view.View.resolveSize(r7, r2)
            r0.setMeasuredDimension(r1, r2)
            int r1 = r0.getMeasuredWidth()
            int r1 = r1 / 2
            float r1 = (float) r1
            r0.j = r1
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(@androidx.annotation.NonNull android.view.View r1, float r2, float r3, boolean r4) {
            r0 = this;
            boolean r1 = r0.dispatchNestedFling(r2, r3, r4)
            return r1
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(@androidx.annotation.NonNull android.view.View r3, float r4, float r5) {
            r2 = this;
            int r3 = r2.b
            r0 = 0
            if (r3 == 0) goto Le
            com.scwang.smartrefresh.layout.constant.RefreshState r3 = r2.V0
            boolean r3 = r3.opening
            if (r3 == 0) goto Le
            r2.m0(r0)
        Le:
            android.animation.ValueAnimator r3 = r2.f1
            if (r3 != 0) goto L34
            com.scwang.smartrefresh.layout.constant.RefreshState r3 = r2.V0
            com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.ReleaseToRefresh
            if (r3 == r1) goto L34
            com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.ReleaseToLoad
            if (r3 == r1) goto L34
            com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.PullDownToRefresh
            if (r3 != r1) goto L24
            int r1 = r2.b
            if (r1 > 0) goto L34
        L24:
            com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.PullToUpLoad
            if (r3 != r1) goto L2c
            int r3 = r2.b
            if (r3 > 0) goto L34
        L2c:
            boolean r3 = r2.dispatchNestedPreFling(r4, r5)
            if (r3 == 0) goto L33
            goto L34
        L33:
            return r0
        L34:
            r3 = 1
            return r3
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(@androidx.annotation.NonNull android.view.View r5, int r6, int r7, @androidx.annotation.NonNull int[] r8) {
            r4 = this;
            com.scwang.smartrefresh.layout.constant.RefreshState r5 = r4.V0
            boolean r5 = r5.opening
            r0 = 0
            r1 = 0
            r2 = 1
            if (r5 == 0) goto Ld8
            int[] r5 = r4.V
            boolean r6 = r4.dispatchNestedPreScroll(r6, r7, r5, r0)
            if (r6 == 0) goto L14
            r5 = r5[r2]
            int r7 = r7 - r5
        L14:
            com.scwang.smartrefresh.layout.constant.RefreshState r5 = r4.V0
            com.scwang.smartrefresh.layout.constant.RefreshState r6 = com.scwang.smartrefresh.layout.constant.RefreshState.Refreshing
            r0 = 0
            if (r5 == r6) goto L1f
            com.scwang.smartrefresh.layout.constant.RefreshState r6 = com.scwang.smartrefresh.layout.constant.RefreshState.TwoLevel
            if (r5 != r6) goto L2a
        L1f:
            int r6 = r4.a0
            int r6 = r6 * r7
            if (r6 > 0) goto L88
            int r6 = r4.d
            if (r6 <= 0) goto L2a
            goto L88
        L2a:
            com.scwang.smartrefresh.layout.constant.RefreshState r6 = com.scwang.smartrefresh.layout.constant.RefreshState.Loading
            if (r5 != r6) goto L135
            int r5 = r4.a0
            int r5 = r5 * r7
            if (r5 > 0) goto L38
            int r5 = r4.d
            if (r5 >= 0) goto L135
        L38:
            r8[r2] = r1
            int r5 = java.lang.Math.abs(r7)
            int r6 = r4.a0
            int r6 = java.lang.Math.abs(r6)
            if (r5 <= r6) goto L57
            r5 = r8[r2]
            int r6 = r4.a0
            int r5 = r5 + r6
            r8[r2] = r5
            r4.a0 = r1
            int r5 = r4.d
            if (r5 < 0) goto L69
            r4.G0(r0)
            goto L69
        L57:
            int r5 = r4.a0
            int r5 = r5 - r7
            r4.a0 = r5
            r6 = r8[r2]
            int r6 = r6 + r7
            r8[r2] = r6
            int r6 = r4.d
            int r5 = r5 + r6
            float r5 = (float) r5
            r4.G0(r5)
            r7 = 0
        L69:
            if (r7 >= 0) goto L135
            int r5 = r4.d
            if (r5 >= 0) goto L135
            if (r7 >= r5) goto L79
            r6 = r8[r2]
            int r6 = r6 + r5
            r8[r2] = r6
            r4.d = r1
            goto L81
        L79:
            int r5 = r5 - r7
            r4.d = r5
            r5 = r8[r2]
            int r5 = r5 + r7
            r8[r2] = r5
        L81:
            int r5 = r4.d
            float r5 = (float) r5
            r4.G0(r5)
            return
        L88:
            r8[r2] = r1
            int r5 = java.lang.Math.abs(r7)
            int r6 = r4.a0
            int r6 = java.lang.Math.abs(r6)
            if (r5 <= r6) goto La7
            r5 = r8[r2]
            int r6 = r4.a0
            int r5 = r5 + r6
            r8[r2] = r5
            r4.a0 = r1
            int r5 = r4.d
            if (r5 > 0) goto Lb9
            r4.G0(r0)
            goto Lb9
        La7:
            int r5 = r4.a0
            int r5 = r5 - r7
            r4.a0 = r5
            r6 = r8[r2]
            int r6 = r6 + r7
            r8[r2] = r6
            int r6 = r4.d
            int r5 = r5 + r6
            float r5 = (float) r5
            r4.G0(r5)
            r7 = 0
        Lb9:
            if (r7 <= 0) goto L135
            int r5 = r4.d
            if (r5 <= 0) goto L135
            if (r7 <= r5) goto Lc9
            r6 = r8[r2]
            int r6 = r6 + r5
            r8[r2] = r6
            r4.d = r1
            goto Ld1
        Lc9:
            int r5 = r5 - r7
            r4.d = r5
            r5 = r8[r2]
            int r5 = r5 + r7
            r8[r2] = r5
        Ld1:
            int r5 = r4.d
            float r5 = (float) r5
            r4.G0(r5)
            return
        Ld8:
            boolean r5 = r4.f0()
            if (r5 == 0) goto Lf9
            if (r7 <= 0) goto Lf9
            int r5 = r4.a0
            if (r5 <= 0) goto Lf9
            if (r7 <= r5) goto Led
            int r5 = r7 - r5
            r8[r2] = r5
            r4.a0 = r1
            goto Lf2
        Led:
            int r5 = r5 - r7
            r4.a0 = r5
            r8[r2] = r7
        Lf2:
            int r5 = r4.a0
            float r5 = (float) r5
            r4.G0(r5)
            goto L119
        Lf9:
            boolean r5 = r4.y()
            if (r5 == 0) goto L119
            if (r7 >= 0) goto L119
            int r5 = r4.a0
            if (r5 >= 0) goto L119
            if (r7 >= r5) goto L10e
            int r5 = r7 - r5
            r8[r2] = r5
            r4.a0 = r1
            goto L113
        L10e:
            int r5 = r5 - r7
            r4.a0 = r5
            r8[r2] = r7
        L113:
            int r5 = r4.a0
            float r5 = (float) r5
            r4.G0(r5)
        L119:
            int[] r5 = r4.V
            r3 = r8[r1]
            int r6 = r6 - r3
            r3 = r8[r2]
            int r7 = r7 - r3
            boolean r6 = r4.dispatchNestedPreScroll(r6, r7, r5, r0)
            if (r6 == 0) goto L135
            r6 = r8[r1]
            r7 = r5[r1]
            int r6 = r6 + r7
            r8[r1] = r6
            r6 = r8[r2]
            r5 = r5[r2]
            int r6 = r6 + r5
            r8[r2] = r6
        L135:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(@androidx.annotation.NonNull android.view.View r7, int r8, int r9, int r10, int r11) {
            r6 = this;
            int[] r5 = r6.W
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.dispatchNestedScroll(r1, r2, r3, r4, r5)
            int[] r7 = r0.W
            r8 = 1
            r7 = r7[r8]
            int r11 = r4 + r7
            com.scwang.smartrefresh.layout.constant.RefreshState r7 = r0.V0
            boolean r7 = r7.opening
            if (r7 == 0) goto L5d
            boolean r7 = r6.f0()
            if (r7 == 0) goto L3a
            if (r11 >= 0) goto L3a
            l2.c r7 = r0.Q0
            if (r7 == 0) goto L29
            boolean r7 = r7.o()
            if (r7 == 0) goto L3a
        L29:
            int r7 = r0.a0
            int r8 = java.lang.Math.abs(r11)
            int r7 = r7 + r8
            r0.a0 = r7
            int r8 = r0.d
            int r7 = r7 + r8
            float r7 = (float) r7
            r6.G0(r7)
            return
        L3a:
            boolean r7 = r6.y()
            if (r7 == 0) goto Lb2
            if (r11 <= 0) goto Lb2
            l2.c r7 = r0.Q0
            if (r7 == 0) goto L4c
            boolean r7 = r7.q()
            if (r7 == 0) goto Lb2
        L4c:
            int r7 = r0.a0
            int r8 = java.lang.Math.abs(r11)
            int r7 = r7 - r8
            r0.a0 = r7
            int r8 = r0.d
            int r7 = r7 + r8
            float r7 = (float) r7
            r6.G0(r7)
            return
        L5d:
            boolean r7 = r6.f0()
            if (r7 == 0) goto L86
            if (r11 >= 0) goto L86
            l2.c r7 = r0.Q0
            if (r7 == 0) goto L6f
            boolean r7 = r7.o()
            if (r7 == 0) goto L86
        L6f:
            com.scwang.smartrefresh.layout.constant.RefreshState r7 = r0.V0
            com.scwang.smartrefresh.layout.constant.RefreshState r8 = com.scwang.smartrefresh.layout.constant.RefreshState.None
            if (r7 != r8) goto L78
            r6.y1()
        L78:
            int r7 = r0.a0
            int r8 = java.lang.Math.abs(r11)
            int r7 = r7 + r8
            r0.a0 = r7
            float r7 = (float) r7
            r6.G0(r7)
            return
        L86:
            boolean r7 = r6.y()
            if (r7 == 0) goto Lb2
            if (r11 <= 0) goto Lb2
            l2.c r7 = r0.Q0
            if (r7 == 0) goto L98
            boolean r7 = r7.q()
            if (r7 == 0) goto Lb2
        L98:
            com.scwang.smartrefresh.layout.constant.RefreshState r7 = r0.V0
            com.scwang.smartrefresh.layout.constant.RefreshState r8 = com.scwang.smartrefresh.layout.constant.RefreshState.None
            if (r7 != r8) goto La5
            boolean r7 = r0.N
            if (r7 != 0) goto La5
            r6.A1()
        La5:
            int r7 = r0.a0
            int r8 = java.lang.Math.abs(r11)
            int r7 = r7 - r8
            r0.a0 = r7
            float r7 = (float) r7
            r6.G0(r7)
        Lb2:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull android.view.View r3, int r4) {
            r1 = this;
            androidx.core.view.NestedScrollingParentHelper r0 = r1.k0
            r0.onNestedScrollAccepted(r2, r3, r4)
            r2 = r4 & 2
            r1.startNestedScroll(r2)
            r2 = 0
            r1.a0 = r2
            int r2 = r1.b
            r1.d = r2
            r2 = 1
            r1.b0 = r2
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.NonNull android.view.View r2, int r3) {
            r0 = this;
            boolean r1 = r0.isEnabled()
            if (r1 == 0) goto L1e
            boolean r1 = r0.isNestedScrollingEnabled()
            if (r1 == 0) goto L1e
            r1 = r3 & 2
            if (r1 == 0) goto L1e
            boolean r1 = r0.f0()
            if (r1 != 0) goto L1c
            boolean r1 = r0.y()
            if (r1 == 0) goto L1e
        L1c:
            r1 = 1
            return r1
        L1e:
            r1 = 0
            return r1
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(@androidx.annotation.NonNull android.view.View r2) {
            r1 = this;
            androidx.core.view.NestedScrollingParentHelper r0 = r1.k0
            r0.onStopNestedScroll(r2)
            r2 = 0
            r1.b0 = r2
            r1.a0 = r2
            r1.I0()
            r1.stopNestedScroll()
            return
    }

    public /* bridge */ /* synthetic */ l2.h p(boolean r1) {
            r0 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = r0.Z0(r1)
            return r1
    }

    protected android.animation.ValueAnimator p0(int r5) {
            r4 = this;
            android.animation.ValueAnimator r0 = r4.f1
            if (r0 != 0) goto Lf3
            int r0 = r4.f
            int r0 = r0 * 2
            int r0 = r0 / 3
            int r1 = r4.getMeasuredWidth()
            int r1 = r1 / 2
            float r1 = (float) r1
            r4.j = r1
            com.scwang.smartrefresh.layout.constant.RefreshState r1 = r4.V0
            com.scwang.smartrefresh.layout.constant.RefreshState r2 = com.scwang.smartrefresh.layout.constant.RefreshState.Refreshing
            if (r1 == r2) goto L1d
            com.scwang.smartrefresh.layout.constant.RefreshState r3 = com.scwang.smartrefresh.layout.constant.RefreshState.TwoLevel
            if (r1 != r3) goto L3a
        L1d:
            if (r5 <= 0) goto L3a
            int r1 = r4.b
            int r5 = r5 * 2
            int r2 = r4.p0
            int r5 = java.lang.Math.min(r5, r2)
            int[] r5 = new int[]{r1, r5}
            android.animation.ValueAnimator r5 = android.animation.ValueAnimator.ofInt(r5)
            r4.f1 = r5
            android.animation.Animator$AnimatorListener r1 = r4.g1
            r5.addListener(r1)
            goto Ld5
        L3a:
            if (r5 >= 0) goto L77
            com.scwang.smartrefresh.layout.constant.RefreshState r3 = com.scwang.smartrefresh.layout.constant.RefreshState.Loading
            if (r1 == r3) goto L5a
            boolean r1 = r4.C
            if (r1 == 0) goto L48
            boolean r1 = r4.N
            if (r1 != 0) goto L5a
        L48:
            boolean r1 = r4.G
            if (r1 == 0) goto L77
            boolean r1 = r4.y()
            if (r1 == 0) goto L77
            boolean r1 = r4.N
            if (r1 != 0) goto L77
            com.scwang.smartrefresh.layout.constant.RefreshState r1 = r4.V0
            if (r1 == r2) goto L77
        L5a:
            int r1 = r4.b
            int r5 = r5 * 7
            int r5 = r5 / 2
            int r2 = r4.G0
            int r2 = -r2
            int r5 = java.lang.Math.max(r5, r2)
            int[] r5 = new int[]{r1, r5}
            android.animation.ValueAnimator r5 = android.animation.ValueAnimator.ofInt(r5)
            r4.f1 = r5
            android.animation.Animator$AnimatorListener r1 = r4.g1
            r5.addListener(r1)
            goto Ld5
        L77:
            int r1 = r4.b
            if (r1 != 0) goto Ld5
            boolean r1 = r4.E
            if (r1 == 0) goto Ld5
            r0 = 0
            r1 = 150(0x96, float:2.1E-43)
            if (r5 <= 0) goto La8
            com.scwang.smartrefresh.layout.constant.RefreshState r2 = r4.V0
            com.scwang.smartrefresh.layout.constant.RefreshState r3 = com.scwang.smartrefresh.layout.constant.RefreshState.Loading
            if (r2 == r3) goto L8d
            r4.y1()
        L8d:
            int r2 = r5 * 250
            int r3 = r4.p0
            int r2 = r2 / r3
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r4.p0
            int r5 = java.lang.Math.min(r5, r2)
            int[] r5 = new int[]{r0, r5}
            android.animation.ValueAnimator r5 = android.animation.ValueAnimator.ofInt(r5)
            r4.f1 = r5
        La6:
            r0 = r1
            goto Lcb
        La8:
            com.scwang.smartrefresh.layout.constant.RefreshState r3 = r4.V0
            if (r3 == r2) goto Laf
            r4.A1()
        Laf:
            int r2 = -r5
            int r2 = r2 * 250
            int r3 = r4.G0
            int r2 = r2 / r3
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r4.G0
            int r2 = -r2
            int r5 = java.lang.Math.max(r5, r2)
            int[] r5 = new int[]{r0, r5}
            android.animation.ValueAnimator r5 = android.animation.ValueAnimator.ofInt(r5)
            r4.f1 = r5
            goto La6
        Lcb:
            android.animation.ValueAnimator r5 = r4.f1
            com.scwang.smartrefresh.layout.SmartRefreshLayout$n r1 = new com.scwang.smartrefresh.layout.SmartRefreshLayout$n
            r1.<init>(r4, r0)
            r5.addListener(r1)
        Ld5:
            android.animation.ValueAnimator r5 = r4.f1
            if (r5 == 0) goto Lf3
            long r0 = (long) r0
            r5.setDuration(r0)
            android.animation.ValueAnimator r5 = r4.f1
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            r5.setInterpolator(r0)
            android.animation.ValueAnimator r5 = r4.f1
            android.animation.ValueAnimator$AnimatorUpdateListener r0 = r4.f5h1
            r5.addUpdateListener(r0)
            android.animation.ValueAnimator r5 = r4.f1
            r5.start()
        Lf3:
            android.animation.ValueAnimator r5 = r4.f1
            return r5
    }

    public com.scwang.smartrefresh.layout.SmartRefreshLayout p1(int r1) {
            r0 = this;
            r0.f = r1
            return r0
    }

    @Override // android.view.View
    public boolean post(java.lang.Runnable r3) {
            r2 = this;
            android.os.Handler r0 = r2.S0
            if (r0 != 0) goto L19
            java.util.List<com.scwang.smartrefresh.layout.util.b> r0 = r2.U0
            if (r0 != 0) goto Ld
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        Ld:
            r2.U0 = r0
            com.scwang.smartrefresh.layout.util.b r1 = new com.scwang.smartrefresh.layout.util.b
            r1.<init>(r3)
            r0.add(r1)
            r3 = 0
            return r3
        L19:
            com.scwang.smartrefresh.layout.util.b r1 = new com.scwang.smartrefresh.layout.util.b
            r1.<init>(r3)
            boolean r3 = r0.post(r1)
            return r3
    }

    @Override // android.view.View
    public boolean postDelayed(java.lang.Runnable r4, long r5) {
            r3 = this;
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 != 0) goto L10
            com.scwang.smartrefresh.layout.util.b r5 = new com.scwang.smartrefresh.layout.util.b
            r5.<init>(r4)
            r5.run()
            r4 = 1
            return r4
        L10:
            android.os.Handler r0 = r3.S0
            if (r0 != 0) goto L29
            java.util.List<com.scwang.smartrefresh.layout.util.b> r0 = r3.U0
            if (r0 != 0) goto L1d
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L1d:
            r3.U0 = r0
            com.scwang.smartrefresh.layout.util.b r1 = new com.scwang.smartrefresh.layout.util.b
            r1.<init>(r4, r5)
            r0.add(r1)
            r4 = 0
            return r4
        L29:
            com.scwang.smartrefresh.layout.util.b r1 = new com.scwang.smartrefresh.layout.util.b
            r1.<init>(r4)
            boolean r4 = r0.postDelayed(r1, r5)
            return r4
    }

    public /* bridge */ /* synthetic */ l2.h q(m2.e r1) {
            r0 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = r0.m1(r1)
            return r1
    }

    public com.scwang.smartrefresh.layout.SmartRefreshLayout q0() {
            r4 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r4.Y0
            long r0 = r0 - r2
            int r1 = (int) r0
            int r0 = 1000 - r1
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r4.r0(r0)
            return r0
    }

    public com.scwang.smartrefresh.layout.SmartRefreshLayout q1(android.view.animation.Interpolator r1) {
            r0 = this;
            r0.q = r1
            return r0
    }

    public l2.h r(boolean r1) {
            r0 = this;
            r0.setNestedScrollingEnabled(r1)
            return r0
    }

    public com.scwang.smartrefresh.layout.SmartRefreshLayout r0(int r2) {
            r1 = this;
            r0 = 1
            com.scwang.smartrefresh.layout.SmartRefreshLayout r2 = r1.s0(r2, r0)
            return r2
    }

    public com.scwang.smartrefresh.layout.SmartRefreshLayout r1(l2.d r3) {
            r2 = this;
            r0 = -1
            r1 = -2
            com.scwang.smartrefresh.layout.SmartRefreshLayout r3 = r2.s1(r3, r0, r1)
            return r3
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean r2) {
            r1 = this;
            l2.c r0 = r1.Q0
            android.view.View r0 = r0.m()
            if (r0 == 0) goto L10
            boolean r0 = androidx.core.view.ViewCompat.isNestedScrollingEnabled(r0)
            if (r0 == 0) goto Lf
            goto L10
        Lf:
            return
        L10:
            super.requestDisallowInterceptTouchEvent(r2)
            return
    }

    public boolean s(int r5) {
            r4 = this;
            int r0 = r4.f
            int r1 = r4.p0
            int r2 = r4.I0
            int r2 = r2 / 2
            int r2 = r2 + r1
            float r2 = (float) r2
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 * r3
            float r1 = (float) r1
            float r2 = r2 / r1
            boolean r5 = r4.O(r5, r0, r2)
            return r5
    }

    public com.scwang.smartrefresh.layout.SmartRefreshLayout s0(int r2, boolean r3) {
            r1 = this;
            r0 = 0
            com.scwang.smartrefresh.layout.SmartRefreshLayout r2 = r1.t0(r2, r3, r0)
            return r2
    }

    public com.scwang.smartrefresh.layout.SmartRefreshLayout s1(l2.d r3, int r4, int r5) {
            r2 = this;
            if (r3 == 0) goto L48
            l2.d r0 = r2.P0
            if (r0 == 0) goto Ld
            android.view.View r0 = r0.getView()
            r2.removeView(r0)
        Ld:
            r2.P0 = r3
            com.scwang.smartrefresh.layout.constant.DimensionStatus r3 = r2.H0
            com.scwang.smartrefresh.layout.constant.DimensionStatus r3 = r3.unNotify()
            r2.H0 = r3
            boolean r3 = r2.O
            r0 = 0
            if (r3 == 0) goto L23
            boolean r3 = r2.z
            if (r3 == 0) goto L21
            goto L23
        L21:
            r3 = 0
            goto L24
        L23:
            r3 = 1
        L24:
            r2.z = r3
            l2.d r3 = r2.P0
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r3 = r3.getSpinnerStyle()
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r1 = com.scwang.smartrefresh.layout.constant.SpinnerStyle.FixedBehind
            if (r3 != r1) goto L3f
            l2.d r3 = r2.P0
            android.view.View r3 = r3.getView()
            com.scwang.smartrefresh.layout.SmartRefreshLayout$o r1 = new com.scwang.smartrefresh.layout.SmartRefreshLayout$o
            r1.<init>(r4, r5)
            r2.addView(r3, r0, r1)
            return r2
        L3f:
            l2.d r3 = r2.P0
            android.view.View r3 = r3.getView()
            r2.addView(r3, r4, r5)
        L48:
            return r2
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean r2) {
            r1 = this;
            r0 = 1
            r1.P = r0
            androidx.core.view.NestedScrollingChildHelper r0 = r1.c0
            r0.setNestedScrollingEnabled(r2)
            return
    }

    public /* bridge */ /* synthetic */ l2.h setPrimaryColors(int[] r1) {
            r0 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = r0.n1(r1)
            return r1
    }

    protected void setViceState(com.scwang.smartrefresh.layout.constant.RefreshState r3) {
            r2 = this;
            com.scwang.smartrefresh.layout.constant.RefreshState r0 = r2.V0
            boolean r1 = r0.draging
            if (r1 == 0) goto L15
            boolean r0 = r0.isHeader()
            boolean r1 = r3.isHeader()
            if (r0 == r1) goto L15
            com.scwang.smartrefresh.layout.constant.RefreshState r0 = com.scwang.smartrefresh.layout.constant.RefreshState.None
            r2.H0(r0)
        L15:
            com.scwang.smartrefresh.layout.constant.RefreshState r0 = r2.W0
            if (r0 == r3) goto L1b
            r2.W0 = r3
        L1b:
            return
    }

    @Override // android.view.View
    public boolean startNestedScroll(int r2) {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.c0
            boolean r2 = r0.startNestedScroll(r2)
            return r2
    }

    @Override // android.view.View
    public void stopNestedScroll() {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.c0
            r0.stopNestedScroll()
            return
    }

    public /* bridge */ /* synthetic */ l2.h t(boolean r1) {
            r0 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = r0.S0(r1)
            return r1
    }

    public com.scwang.smartrefresh.layout.SmartRefreshLayout t0(int r2, boolean r3, boolean r4) {
            r1 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout$b r0 = new com.scwang.smartrefresh.layout.SmartRefreshLayout$b
            r0.<init>(r1, r3, r4)
            if (r2 > 0) goto La
            r2 = 1
            goto Lb
        La:
            long r2 = (long) r2
        Lb:
            r1.postDelayed(r0, r2)
            return r1
    }

    public com.scwang.smartrefresh.layout.SmartRefreshLayout t1(l2.e r3) {
            r2 = this;
            r0 = -1
            r1 = -2
            com.scwang.smartrefresh.layout.SmartRefreshLayout r3 = r2.u1(r3, r0, r1)
            return r3
    }

    public /* bridge */ /* synthetic */ l2.h u(m2.d r1) {
            r0 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = r0.l1(r1)
            return r1
    }

    public com.scwang.smartrefresh.layout.SmartRefreshLayout u0(boolean r5) {
            r4 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r4.Y0
            long r0 = r0 - r2
            r2 = 0
            if (r5 == 0) goto L11
            int r1 = (int) r0
            int r0 = 1000 - r1
            int r2 = java.lang.Math.max(r2, r0)
        L11:
            com.scwang.smartrefresh.layout.SmartRefreshLayout r5 = r4.s0(r2, r5)
            return r5
    }

    public com.scwang.smartrefresh.layout.SmartRefreshLayout u1(l2.e r2, int r3, int r4) {
            r1 = this;
            if (r2 == 0) goto L38
            l2.e r0 = r1.O0
            if (r0 == 0) goto Ld
            android.view.View r0 = r0.getView()
            r1.removeView(r0)
        Ld:
            r1.O0 = r2
            com.scwang.smartrefresh.layout.constant.DimensionStatus r0 = r1.F0
            com.scwang.smartrefresh.layout.constant.DimensionStatus r0 = r0.unNotify()
            r1.F0 = r0
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r2 = r2.getSpinnerStyle()
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r0 = com.scwang.smartrefresh.layout.constant.SpinnerStyle.FixedBehind
            if (r2 != r0) goto L2f
            l2.e r2 = r1.O0
            android.view.View r2 = r2.getView()
            com.scwang.smartrefresh.layout.SmartRefreshLayout$o r0 = new com.scwang.smartrefresh.layout.SmartRefreshLayout$o
            r0.<init>(r3, r4)
            r3 = 0
            r1.addView(r2, r3, r0)
            return r1
        L2f:
            l2.e r2 = r1.O0
            android.view.View r2 = r2.getView()
            r1.addView(r2, r3, r4)
        L38:
            return r1
    }

    public /* bridge */ /* synthetic */ l2.h v(boolean r1) {
            r0 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = r0.z0(r1)
            return r1
    }

    public com.scwang.smartrefresh.layout.SmartRefreshLayout v0() {
            r4 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r4.Y0
            long r0 = r0 - r2
            int r1 = (int) r0
            int r0 = 1000 - r1
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)
            r1 = 1
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r4.t0(r0, r1, r1)
            return r0
    }

    protected void v1() {
            r4 = this;
            com.scwang.smartrefresh.layout.constant.RefreshState r0 = r4.V0
            com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.Loading
            if (r0 == r1) goto L55
            long r2 = java.lang.System.currentTimeMillis()
            r4.Y0 = r2
            com.scwang.smartrefresh.layout.constant.RefreshState r0 = r4.V0
            com.scwang.smartrefresh.layout.constant.RefreshState r2 = com.scwang.smartrefresh.layout.constant.RefreshState.LoadReleased
            if (r0 == r2) goto L2e
            com.scwang.smartrefresh.layout.constant.RefreshState r3 = com.scwang.smartrefresh.layout.constant.RefreshState.ReleaseToLoad
            if (r0 == r3) goto L20
            com.scwang.smartrefresh.layout.constant.RefreshState r3 = com.scwang.smartrefresh.layout.constant.RefreshState.PullToUpLoad
            if (r0 == r3) goto L1d
            r4.A1()
        L1d:
            r4.C1()
        L20:
            r4.H0(r2)
            l2.d r0 = r4.P0
            if (r0 == 0) goto L2e
            int r2 = r4.G0
            int r3 = r4.J0
            r0.p(r4, r2, r3)
        L2e:
            r4.H0(r1)
            l2.d r0 = r4.P0
            if (r0 == 0) goto L3c
            int r1 = r4.G0
            int r2 = r4.J0
            r0.t(r4, r1, r2)
        L3c:
            m2.b r0 = r4.S
            if (r0 == 0) goto L43
            r0.m(r4)
        L43:
            m2.c r0 = r4.T
            if (r0 == 0) goto L55
            r0.m(r4)
            m2.c r0 = r4.T
            l2.d r1 = r4.P0
            int r2 = r4.G0
            int r3 = r4.J0
            r0.h(r1, r2, r3)
        L55:
            return
    }

    public boolean w() {
            r2 = this;
            com.scwang.smartrefresh.layout.constant.RefreshState r0 = r2.V0
            com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.Refreshing
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public com.scwang.smartrefresh.layout.SmartRefreshLayout w0() {
            r4 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r4.Z0
            long r0 = r0 - r2
            int r1 = (int) r0
            int r0 = 1000 - r1
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r4.x0(r0)
            return r0
    }

    protected void w1() {
            r6 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout$j r0 = new com.scwang.smartrefresh.layout.SmartRefreshLayout$j
            r0.<init>(r6)
            com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.LoadReleased
            r6.H0(r1)
            int r1 = r6.G0
            int r1 = -r1
            android.animation.ValueAnimator r1 = r6.m0(r1)
            if (r1 == 0) goto L16
            r1.addListener(r0)
        L16:
            l2.d r2 = r6.P0
            if (r2 == 0) goto L21
            int r3 = r6.G0
            int r4 = r6.J0
            r2.p(r6, r3, r4)
        L21:
            m2.c r2 = r6.T
            if (r2 == 0) goto L2e
            l2.d r3 = r6.P0
            int r4 = r6.G0
            int r5 = r6.J0
            r2.e(r3, r4, r5)
        L2e:
            if (r1 != 0) goto L34
            r1 = 0
            r0.onAnimationEnd(r1)
        L34:
            return
    }

    public /* bridge */ /* synthetic */ l2.h x(int r1) {
            r0 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = r0.p1(r1)
            return r1
    }

    public com.scwang.smartrefresh.layout.SmartRefreshLayout x0(int r2) {
            r1 = this;
            r0 = 1
            com.scwang.smartrefresh.layout.SmartRefreshLayout r2 = r1.y0(r2, r0)
            return r2
    }

    protected void x1() {
            r1 = this;
            com.scwang.smartrefresh.layout.constant.RefreshState r0 = r1.V0
            boolean r0 = r0.opening
            if (r0 != 0) goto L15
            boolean r0 = r1.f0()
            if (r0 == 0) goto L15
            com.scwang.smartrefresh.layout.constant.RefreshState r0 = com.scwang.smartrefresh.layout.constant.RefreshState.PullDownCanceled
            r1.H0(r0)
            r1.K0()
            return
        L15:
            com.scwang.smartrefresh.layout.constant.RefreshState r0 = com.scwang.smartrefresh.layout.constant.RefreshState.PullDownCanceled
            r1.setViceState(r0)
            return
    }

    public boolean y() {
            r1 = this;
            boolean r0 = r1.z
            if (r0 == 0) goto La
            boolean r0 = r1.H
            if (r0 != 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public com.scwang.smartrefresh.layout.SmartRefreshLayout y0(int r2, boolean r3) {
            r1 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout$a r0 = new com.scwang.smartrefresh.layout.SmartRefreshLayout$a
            r0.<init>(r1, r3)
            if (r2 > 0) goto La
            r2 = 1
            goto Lb
        La:
            long r2 = (long) r2
        Lb:
            r1.postDelayed(r0, r2)
            return r1
    }

    protected void y1() {
            r1 = this;
            com.scwang.smartrefresh.layout.constant.RefreshState r0 = r1.V0
            boolean r0 = r0.opening
            if (r0 != 0) goto L12
            boolean r0 = r1.f0()
            if (r0 == 0) goto L12
            com.scwang.smartrefresh.layout.constant.RefreshState r0 = com.scwang.smartrefresh.layout.constant.RefreshState.PullDownToRefresh
            r1.H0(r0)
            return
        L12:
            com.scwang.smartrefresh.layout.constant.RefreshState r0 = com.scwang.smartrefresh.layout.constant.RefreshState.PullDownToRefresh
            r1.setViceState(r0)
            return
    }

    public /* bridge */ /* synthetic */ l2.h z(int r1, boolean r2, boolean r3) {
            r0 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = r0.t0(r1, r2, r3)
            return r1
    }

    public com.scwang.smartrefresh.layout.SmartRefreshLayout z0(boolean r5) {
            r4 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r4.Z0
            long r0 = r0 - r2
            r2 = 0
            if (r5 == 0) goto L11
            int r1 = (int) r0
            int r0 = 1000 - r1
            int r2 = java.lang.Math.max(r2, r0)
        L11:
            com.scwang.smartrefresh.layout.SmartRefreshLayout r5 = r4.y0(r2, r5)
            return r5
    }

    protected void z1() {
            r1 = this;
            boolean r0 = r1.y()
            if (r0 == 0) goto L19
            boolean r0 = r1.N
            if (r0 != 0) goto L19
            com.scwang.smartrefresh.layout.constant.RefreshState r0 = r1.V0
            boolean r0 = r0.opening
            if (r0 != 0) goto L19
            com.scwang.smartrefresh.layout.constant.RefreshState r0 = com.scwang.smartrefresh.layout.constant.RefreshState.PullUpCanceled
            r1.H0(r0)
            r1.K0()
            return
        L19:
            com.scwang.smartrefresh.layout.constant.RefreshState r0 = com.scwang.smartrefresh.layout.constant.RefreshState.PullUpCanceled
            r1.setViceState(r0)
            return
    }
}
