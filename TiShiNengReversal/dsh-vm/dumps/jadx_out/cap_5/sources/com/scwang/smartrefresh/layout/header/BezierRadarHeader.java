package com.scwang.smartrefresh.layout.header;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class BezierRadarHeader extends android.widget.FrameLayout implements l2.e {
    private com.scwang.smartrefresh.layout.header.bezierradar.WaveView a;
    private com.scwang.smartrefresh.layout.header.bezierradar.RippleView b;
    private com.scwang.smartrefresh.layout.header.bezierradar.RoundDotView c;
    private com.scwang.smartrefresh.layout.header.bezierradar.RoundProgressView d;
    private boolean e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.animation.ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ com.scwang.smartrefresh.layout.header.BezierRadarHeader a;

        a(com.scwang.smartrefresh.layout.header.BezierRadarHeader r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(android.animation.ValueAnimator r2) {
                r1 = this;
                com.scwang.smartrefresh.layout.header.BezierRadarHeader r0 = r1.a
                com.scwang.smartrefresh.layout.header.bezierradar.WaveView r0 = com.scwang.smartrefresh.layout.header.BezierRadarHeader.m(r0)
                java.lang.Object r2 = r2.getAnimatedValue()
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                int r2 = r2 / 2
                r0.setWaveHeight(r2)
                com.scwang.smartrefresh.layout.header.BezierRadarHeader r2 = r1.a
                com.scwang.smartrefresh.layout.header.bezierradar.WaveView r2 = com.scwang.smartrefresh.layout.header.BezierRadarHeader.m(r2)
                r2.invalidate()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends android.animation.AnimatorListenerAdapter {
        final /* synthetic */ l2.h a;
        final /* synthetic */ com.scwang.smartrefresh.layout.header.BezierRadarHeader b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements java.lang.Runnable {
            final /* synthetic */ com.scwang.smartrefresh.layout.header.BezierRadarHeader.b a;

            a(com.scwang.smartrefresh.layout.header.BezierRadarHeader.b r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r1 = this;
                    com.scwang.smartrefresh.layout.header.BezierRadarHeader$b r0 = r1.a
                    com.scwang.smartrefresh.layout.header.BezierRadarHeader r0 = r0.b
                    com.scwang.smartrefresh.layout.header.bezierradar.RoundProgressView r0 = com.scwang.smartrefresh.layout.header.BezierRadarHeader.z(r0)
                    r0.c()
                    return
            }
        }

        b(com.scwang.smartrefresh.layout.header.BezierRadarHeader r1, l2.h r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r4) {
                r3 = this;
                super.onAnimationEnd(r4)
                com.scwang.smartrefresh.layout.header.BezierRadarHeader r4 = r3.b
                com.scwang.smartrefresh.layout.header.bezierradar.RoundDotView r4 = com.scwang.smartrefresh.layout.header.BezierRadarHeader.n(r4)
                r0 = 4
                r4.setVisibility(r0)
                com.scwang.smartrefresh.layout.header.BezierRadarHeader r4 = r3.b
                com.scwang.smartrefresh.layout.header.bezierradar.RoundProgressView r4 = com.scwang.smartrefresh.layout.header.BezierRadarHeader.z(r4)
                android.view.ViewPropertyAnimator r4 = r4.animate()
                r0 = 1065353216(0x3f800000, float:1.0)
                r4.scaleX(r0)
                com.scwang.smartrefresh.layout.header.BezierRadarHeader r4 = r3.b
                com.scwang.smartrefresh.layout.header.bezierradar.RoundProgressView r4 = com.scwang.smartrefresh.layout.header.BezierRadarHeader.z(r4)
                android.view.ViewPropertyAnimator r4 = r4.animate()
                r4.scaleY(r0)
                l2.h r4 = r3.a
                android.view.ViewGroup r4 = r4.getLayout()
                com.scwang.smartrefresh.layout.header.BezierRadarHeader$b$a r0 = new com.scwang.smartrefresh.layout.header.BezierRadarHeader$b$a
                r0.<init>(r3)
                r1 = 200(0xc8, double:9.9E-322)
                r4.postDelayed(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements android.animation.ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ com.scwang.smartrefresh.layout.header.BezierRadarHeader a;

        c(com.scwang.smartrefresh.layout.header.BezierRadarHeader r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(android.animation.ValueAnimator r2) {
                r1 = this;
                com.scwang.smartrefresh.layout.header.BezierRadarHeader r0 = r1.a
                com.scwang.smartrefresh.layout.header.bezierradar.RoundDotView r0 = com.scwang.smartrefresh.layout.header.BezierRadarHeader.n(r0)
                java.lang.Object r2 = r2.getAnimatedValue()
                java.lang.Float r2 = (java.lang.Float) r2
                float r2 = r2.floatValue()
                r0.setAlpha(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class d {
        static final /* synthetic */ int[] a = null;

        static {
                com.scwang.smartrefresh.layout.constant.RefreshState[] r0 = com.scwang.smartrefresh.layout.constant.RefreshState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.scwang.smartrefresh.layout.header.BezierRadarHeader.d.a = r0
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.None     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.scwang.smartrefresh.layout.header.BezierRadarHeader.d.a     // Catch: java.lang.NoSuchFieldError -> L1d
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.PullDownToRefresh     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.scwang.smartrefresh.layout.header.BezierRadarHeader.d.a     // Catch: java.lang.NoSuchFieldError -> L28
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.PullToUpLoad     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.scwang.smartrefresh.layout.header.BezierRadarHeader.d.a     // Catch: java.lang.NoSuchFieldError -> L33
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.Refreshing     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.scwang.smartrefresh.layout.header.BezierRadarHeader.d.a     // Catch: java.lang.NoSuchFieldError -> L3e
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.Loading     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                return
        }

        public d() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    public BezierRadarHeader(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public BezierRadarHeader(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public BezierRadarHeader(android.content.Context r2, android.util.AttributeSet r3, int r4) {
            r1 = this;
            r1.<init>(r2, r3, r4)
            r0 = 0
            r1.e = r0
            r1.A(r2, r3, r4)
            return
    }

    private void A(android.content.Context r2, android.util.AttributeSet r3, int r4) {
            r1 = this;
            r4 = 1120403456(0x42c80000, float:100.0)
            int r4 = com.scwang.smartrefresh.layout.util.c.b(r4)
            r1.setMinimumHeight(r4)
            com.scwang.smartrefresh.layout.header.bezierradar.WaveView r4 = new com.scwang.smartrefresh.layout.header.bezierradar.WaveView
            android.content.Context r0 = r1.getContext()
            r4.<init>(r0)
            r1.a = r4
            com.scwang.smartrefresh.layout.header.bezierradar.RippleView r4 = new com.scwang.smartrefresh.layout.header.bezierradar.RippleView
            android.content.Context r0 = r1.getContext()
            r4.<init>(r0)
            r1.b = r4
            com.scwang.smartrefresh.layout.header.bezierradar.RoundDotView r4 = new com.scwang.smartrefresh.layout.header.bezierradar.RoundDotView
            android.content.Context r0 = r1.getContext()
            r4.<init>(r0)
            r1.c = r4
            com.scwang.smartrefresh.layout.header.bezierradar.RoundProgressView r4 = new com.scwang.smartrefresh.layout.header.bezierradar.RoundProgressView
            android.content.Context r0 = r1.getContext()
            r4.<init>(r0)
            r1.d = r4
            boolean r4 = r1.isInEditMode()
            r0 = -1
            if (r4 == 0) goto L4e
            com.scwang.smartrefresh.layout.header.bezierradar.WaveView r4 = r1.a
            r1.addView(r4, r0, r0)
            com.scwang.smartrefresh.layout.header.bezierradar.RoundProgressView r4 = r1.d
            r1.addView(r4, r0, r0)
            com.scwang.smartrefresh.layout.header.bezierradar.WaveView r4 = r1.a
            r0 = 1000(0x3e8, float:1.401E-42)
            r4.setHeadHeight(r0)
            goto L6d
        L4e:
            com.scwang.smartrefresh.layout.header.bezierradar.WaveView r4 = r1.a
            r1.addView(r4, r0, r0)
            com.scwang.smartrefresh.layout.header.bezierradar.RoundDotView r4 = r1.c
            r1.addView(r4, r0, r0)
            com.scwang.smartrefresh.layout.header.bezierradar.RoundProgressView r4 = r1.d
            r1.addView(r4, r0, r0)
            com.scwang.smartrefresh.layout.header.bezierradar.RippleView r4 = r1.b
            r1.addView(r4, r0, r0)
            com.scwang.smartrefresh.layout.header.bezierradar.RoundProgressView r4 = r1.d
            r0 = 0
            r4.setScaleX(r0)
            com.scwang.smartrefresh.layout.header.bezierradar.RoundProgressView r4 = r1.d
            r4.setScaleY(r0)
        L6d:
            int[] r4 = com.scwang.smartrefresh.layout.R.styleable.BezierRadarHeader
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r4)
            int r3 = com.scwang.smartrefresh.layout.R.styleable.BezierRadarHeader_srlEnableHorizontalDrag
            boolean r4 = r1.e
            boolean r3 = r2.getBoolean(r3, r4)
            r1.e = r3
            int r3 = com.scwang.smartrefresh.layout.R.styleable.BezierRadarHeader_srlPrimaryColor
            r4 = 0
            int r3 = r2.getColor(r3, r4)
            int r0 = com.scwang.smartrefresh.layout.R.styleable.BezierRadarHeader_srlAccentColor
            int r4 = r2.getColor(r0, r4)
            if (r3 == 0) goto L8f
            r1.E(r3)
        L8f:
            if (r4 == 0) goto L94
            r1.B(r4)
        L94:
            r2.recycle()
            return
    }

    static /* synthetic */ com.scwang.smartrefresh.layout.header.bezierradar.WaveView m(com.scwang.smartrefresh.layout.header.BezierRadarHeader r0) {
            com.scwang.smartrefresh.layout.header.bezierradar.WaveView r0 = r0.a
            return r0
    }

    static /* synthetic */ com.scwang.smartrefresh.layout.header.bezierradar.RoundDotView n(com.scwang.smartrefresh.layout.header.BezierRadarHeader r0) {
            com.scwang.smartrefresh.layout.header.bezierradar.RoundDotView r0 = r0.c
            return r0
    }

    static /* synthetic */ com.scwang.smartrefresh.layout.header.bezierradar.RoundProgressView z(com.scwang.smartrefresh.layout.header.BezierRadarHeader r0) {
            com.scwang.smartrefresh.layout.header.bezierradar.RoundProgressView r0 = r0.d
            return r0
    }

    public com.scwang.smartrefresh.layout.header.BezierRadarHeader B(@androidx.annotation.ColorInt int r2) {
            r1 = this;
            com.scwang.smartrefresh.layout.header.bezierradar.RoundDotView r0 = r1.c
            r0.setDotColor(r2)
            com.scwang.smartrefresh.layout.header.bezierradar.RippleView r0 = r1.b
            r0.setFrontColor(r2)
            com.scwang.smartrefresh.layout.header.bezierradar.RoundProgressView r0 = r1.d
            r0.setFrontColor(r2)
            return r1
    }

    public com.scwang.smartrefresh.layout.header.BezierRadarHeader C(@androidx.annotation.ColorRes int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            int r2 = androidx.core.content.ContextCompat.getColor(r0, r2)
            r1.B(r2)
            return r1
    }

    public com.scwang.smartrefresh.layout.header.BezierRadarHeader D(boolean r2) {
            r1 = this;
            r1.e = r2
            if (r2 != 0) goto La
            com.scwang.smartrefresh.layout.header.bezierradar.WaveView r2 = r1.a
            r0 = -1
            r2.setWaveOffsetX(r0)
        La:
            return r1
    }

    public com.scwang.smartrefresh.layout.header.BezierRadarHeader E(@androidx.annotation.ColorInt int r2) {
            r1 = this;
            com.scwang.smartrefresh.layout.header.bezierradar.WaveView r0 = r1.a
            r0.setWaveColor(r2)
            com.scwang.smartrefresh.layout.header.bezierradar.RoundProgressView r0 = r1.d
            r0.setBackColor(r2)
            return r1
    }

    public com.scwang.smartrefresh.layout.header.BezierRadarHeader F(@androidx.annotation.ColorRes int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            int r2 = androidx.core.content.ContextCompat.getColor(r0, r2)
            r1.E(r2)
            return r1
    }

    public void f(l2.g r1, int r2, int r3) {
            r0 = this;
            return
    }

    public void g(float r1, int r2, int r3, int r4) {
            r0 = this;
            r0.x(r1, r2, r3, r4)
            return
    }

    public com.scwang.smartrefresh.layout.constant.SpinnerStyle getSpinnerStyle() {
            r1 = this;
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r0 = com.scwang.smartrefresh.layout.constant.SpinnerStyle.Scale
            return r0
    }

    @androidx.annotation.NonNull
    public android.view.View getView() {
            r0 = this;
            return r0
    }

    public void i(l2.h r7, int r8, int r9) {
            r6 = this;
            com.scwang.smartrefresh.layout.header.bezierradar.WaveView r9 = r6.a
            r9.setHeadHeight(r8)
            com.scwang.smartrefresh.layout.header.bezierradar.WaveView r8 = r6.a
            int r0 = r8.getWaveHeight()
            com.scwang.smartrefresh.layout.header.bezierradar.WaveView r8 = r6.a
            int r8 = r8.getWaveHeight()
            double r8 = (double) r8
            r1 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            double r8 = r8 * r1
            int r8 = (int) r8
            int r2 = -r8
            com.scwang.smartrefresh.layout.header.bezierradar.WaveView r8 = r6.a
            int r8 = r8.getWaveHeight()
            float r8 = (float) r8
            r9 = 1053609165(0x3ecccccd, float:0.4)
            float r8 = r8 * r9
            int r8 = (int) r8
            int r4 = -r8
            r5 = 0
            r1 = 0
            r3 = 0
            int[] r8 = new int[]{r0, r1, r2, r3, r4, r5}
            android.animation.ValueAnimator r8 = android.animation.ValueAnimator.ofInt(r8)
            com.scwang.smartrefresh.layout.header.BezierRadarHeader$a r9 = new com.scwang.smartrefresh.layout.header.BezierRadarHeader$a
            r9.<init>(r6)
            r8.addUpdateListener(r9)
            android.view.animation.DecelerateInterpolator r9 = new android.view.animation.DecelerateInterpolator
            r9.<init>()
            r8.setInterpolator(r9)
            r0 = 800(0x320, double:3.953E-321)
            r8.setDuration(r0)
            r8.start()
            r8 = 2
            float[] r8 = new float[r8]
            r8 = {x0078: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            android.animation.ValueAnimator r8 = android.animation.ValueAnimator.ofFloat(r8)
            com.scwang.smartrefresh.layout.header.BezierRadarHeader$b r9 = new com.scwang.smartrefresh.layout.header.BezierRadarHeader$b
            r9.<init>(r6, r7)
            r8.addListener(r9)
            android.view.animation.DecelerateInterpolator r7 = new android.view.animation.DecelerateInterpolator
            r7.<init>()
            r8.setInterpolator(r7)
            r0 = 300(0x12c, double:1.48E-321)
            r8.setDuration(r0)
            com.scwang.smartrefresh.layout.header.BezierRadarHeader$c r7 = new com.scwang.smartrefresh.layout.header.BezierRadarHeader$c
            r7.<init>(r6)
            r8.addUpdateListener(r7)
            r8.start()
            return
    }

    public void j(float r1, int r2, int r3) {
            r0 = this;
            com.scwang.smartrefresh.layout.header.bezierradar.WaveView r1 = r0.a
            r1.setWaveOffsetX(r2)
            com.scwang.smartrefresh.layout.header.bezierradar.WaveView r1 = r0.a
            r1.invalidate()
            return
    }

    public boolean k() {
            r1 = this;
            boolean r0 = r1.e
            return r0
    }

    public void q(l2.h r1, com.scwang.smartrefresh.layout.constant.RefreshState r2, com.scwang.smartrefresh.layout.constant.RefreshState r3) {
            r0 = this;
            int[] r1 = com.scwang.smartrefresh.layout.header.BezierRadarHeader.d.a
            int r2 = r3.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 == r2) goto L1b
            r2 = 2
            if (r1 == r2) goto Lf
            return
        Lf:
            com.scwang.smartrefresh.layout.header.bezierradar.RoundProgressView r1 = r0.d
            r2 = 0
            r1.setScaleX(r2)
            com.scwang.smartrefresh.layout.header.bezierradar.RoundProgressView r1 = r0.d
            r1.setScaleY(r2)
            return
        L1b:
            com.scwang.smartrefresh.layout.header.bezierradar.RippleView r1 = r0.b
            r2 = 8
            r1.setVisibility(r2)
            com.scwang.smartrefresh.layout.header.bezierradar.RoundDotView r1 = r0.c
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r2)
            com.scwang.smartrefresh.layout.header.bezierradar.RoundDotView r1 = r0.c
            r2 = 0
            r1.setVisibility(r2)
            return
    }

    @java.lang.Deprecated
    public void setPrimaryColors(@androidx.annotation.ColorInt int... r3) {
            r2 = this;
            int r0 = r3.length
            if (r0 <= 0) goto L9
            r0 = 0
            r0 = r3[r0]
            r2.E(r0)
        L9:
            int r0 = r3.length
            r1 = 1
            if (r0 <= r1) goto L12
            r3 = r3[r1]
            r2.B(r3)
        L12:
            return
    }

    public void t(l2.h r1, int r2, int r3) {
            r0 = this;
            return
    }

    public int w(l2.h r1, boolean r2) {
            r0 = this;
            com.scwang.smartrefresh.layout.header.bezierradar.RoundProgressView r1 = r0.d
            r1.d()
            com.scwang.smartrefresh.layout.header.bezierradar.RoundProgressView r1 = r0.d
            android.view.ViewPropertyAnimator r1 = r1.animate()
            r2 = 0
            r1.scaleX(r2)
            com.scwang.smartrefresh.layout.header.bezierradar.RoundProgressView r1 = r0.d
            android.view.ViewPropertyAnimator r1 = r1.animate()
            r1.scaleY(r2)
            com.scwang.smartrefresh.layout.header.bezierradar.RippleView r1 = r0.b
            r2 = 0
            r1.setVisibility(r2)
            com.scwang.smartrefresh.layout.header.bezierradar.RippleView r1 = r0.b
            r1.b()
            r1 = 400(0x190, float:5.6E-43)
            return r1
    }

    public void x(float r2, int r3, int r4, int r5) {
            r1 = this;
            com.scwang.smartrefresh.layout.header.bezierradar.WaveView r5 = r1.a
            int r0 = java.lang.Math.min(r4, r3)
            r5.setHeadHeight(r0)
            com.scwang.smartrefresh.layout.header.bezierradar.WaveView r5 = r1.a
            r0 = 0
            int r3 = r3 - r4
            int r3 = java.lang.Math.max(r0, r3)
            float r3 = (float) r3
            r4 = 1072902963(0x3ff33333, float:1.9)
            float r3 = r3 * r4
            int r3 = (int) r3
            r5.setWaveHeight(r3)
            com.scwang.smartrefresh.layout.header.bezierradar.RoundDotView r3 = r1.c
            r3.setFraction(r2)
            return
    }
}
