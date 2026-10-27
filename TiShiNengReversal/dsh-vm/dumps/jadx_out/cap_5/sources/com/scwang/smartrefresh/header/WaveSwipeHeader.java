package com.scwang.smartrefresh.header;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class WaveSwipeHeader extends android.view.ViewGroup implements l2.e {
    private static final float e = 0.8f;
    private com.scwang.smartrefresh.header.waveswipe.WaveView a;
    private com.scwang.smartrefresh.layout.constant.RefreshState b;
    private com.scwang.smartrefresh.header.WaveSwipeHeader.e c;
    private float d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.animation.ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ com.scwang.smartrefresh.header.WaveSwipeHeader a;

        a(com.scwang.smartrefresh.header.WaveSwipeHeader r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(android.animation.ValueAnimator r4) {
                r3 = this;
                com.scwang.smartrefresh.header.WaveSwipeHeader r4 = r3.a
                com.scwang.smartrefresh.header.WaveSwipeHeader$e r4 = com.scwang.smartrefresh.header.WaveSwipeHeader.n(r4)
                com.scwang.smartrefresh.header.WaveSwipeHeader r0 = r3.a
                com.scwang.smartrefresh.header.waveswipe.WaveView r0 = com.scwang.smartrefresh.header.WaveSwipeHeader.m(r0)
                float r0 = r0.getCurrentCircleCenterY()
                com.scwang.smartrefresh.header.WaveSwipeHeader r1 = r3.a
                com.scwang.smartrefresh.header.WaveSwipeHeader$e r1 = com.scwang.smartrefresh.header.WaveSwipeHeader.n(r1)
                int r1 = r1.getHeight()
                float r1 = (float) r1
                r2 = 1073741824(0x40000000, float:2.0)
                float r1 = r1 / r2
                float r0 = r0 + r1
                r4.setTranslationY(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends android.view.animation.Animation {
        final /* synthetic */ com.scwang.smartrefresh.header.WaveSwipeHeader a;

        b(com.scwang.smartrefresh.header.WaveSwipeHeader r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float r2, android.view.animation.Transformation r3) {
                r1 = this;
                com.scwang.smartrefresh.header.WaveSwipeHeader r3 = r1.a
                com.scwang.smartrefresh.header.WaveSwipeHeader$e r3 = com.scwang.smartrefresh.header.WaveSwipeHeader.n(r3)
                r0 = 1065353216(0x3f800000, float:1.0)
                float r0 = r0 - r2
                r3.d(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements android.view.animation.Animation.AnimationListener {
        final /* synthetic */ com.scwang.smartrefresh.header.WaveSwipeHeader a;

        c(com.scwang.smartrefresh.header.WaveSwipeHeader r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(android.view.animation.Animation r1) {
                r0 = this;
                com.scwang.smartrefresh.header.WaveSwipeHeader r1 = r0.a
                com.scwang.smartrefresh.header.WaveSwipeHeader$e r1 = com.scwang.smartrefresh.header.WaveSwipeHeader.n(r1)
                r1.m()
                com.scwang.smartrefresh.header.WaveSwipeHeader r1 = r0.a
                com.scwang.smartrefresh.header.WaveSwipeHeader$e r1 = com.scwang.smartrefresh.header.WaveSwipeHeader.n(r1)
                r1.b()
                com.scwang.smartrefresh.header.WaveSwipeHeader r1 = r0.a
                com.scwang.smartrefresh.header.waveswipe.WaveView r1 = com.scwang.smartrefresh.header.WaveSwipeHeader.m(r1)
                r1.s()
                return
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(android.view.animation.Animation r1) {
                r0 = this;
                return
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(android.view.animation.Animation r1) {
                r0 = this;
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
                com.scwang.smartrefresh.header.WaveSwipeHeader.d.a = r0
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.None     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.scwang.smartrefresh.header.WaveSwipeHeader.d.a     // Catch: java.lang.NoSuchFieldError -> L1d
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.PullDownToRefresh     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.scwang.smartrefresh.header.WaveSwipeHeader.d.a     // Catch: java.lang.NoSuchFieldError -> L28
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.PullDownCanceled     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.scwang.smartrefresh.header.WaveSwipeHeader.d.a     // Catch: java.lang.NoSuchFieldError -> L33
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.ReleaseToRefresh     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.scwang.smartrefresh.header.WaveSwipeHeader.d.a     // Catch: java.lang.NoSuchFieldError -> L3e
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.Refreshing     // Catch: java.lang.NoSuchFieldError -> L3e
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

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class e extends com.scwang.smartrefresh.header.waveswipe.AnimationImageView {
        private final com.scwang.smartrefresh.header.internal.MaterialProgressDrawable b;
        final /* synthetic */ com.scwang.smartrefresh.header.WaveSwipeHeader c;

        public e(com.scwang.smartrefresh.header.WaveSwipeHeader r2, android.content.Context r3) {
                r1 = this;
                r1.c = r2
                r1.<init>(r3)
                com.scwang.smartrefresh.header.internal.MaterialProgressDrawable r0 = new com.scwang.smartrefresh.header.internal.MaterialProgressDrawable
                r0.<init>(r3, r2)
                r1.b = r0
                r2 = 0
                r0.f(r2)
                android.content.Context r3 = r1.getContext()
                boolean r3 = com.scwang.smartrefresh.header.waveswipe.a.a(r3)
                if (r3 == 0) goto L1d
                r0.o(r2)
            L1d:
                r1.setImageDrawable(r0)
                return
        }

        private int a(int r2) {
                r1 = this;
                r0 = 1073741824(0x40000000, float:2.0)
                int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
                return r2
        }

        public void b() {
                r2 = this;
                com.scwang.smartrefresh.header.internal.MaterialProgressDrawable r0 = r2.b
                r1 = 255(0xff, float:3.57E-43)
                r0.setAlpha(r1)
                return
        }

        public void c() {
                r2 = this;
                com.scwang.smartrefresh.header.internal.MaterialProgressDrawable r0 = r2.b
                int r0 = r0.getIntrinsicWidth()
                int r1 = r2.a(r0)
                int r0 = r2.a(r0)
                r2.measure(r1, r0)
                return
        }

        public void d(float r1) {
                r0 = this;
                r0.setScaleX(r1)
                r0.setScaleY(r1)
                return
        }

        public void e(float r2) {
                r1 = this;
                com.scwang.smartrefresh.header.internal.MaterialProgressDrawable r0 = r1.b
                r0.e(r2)
                return
        }

        public void f(int r2) {
                r1 = this;
                com.scwang.smartrefresh.header.internal.MaterialProgressDrawable r0 = r1.b
                r0.setAlpha(r2)
                return
        }

        public void g(@androidx.annotation.NonNull int... r2) {
                r1 = this;
                com.scwang.smartrefresh.header.internal.MaterialProgressDrawable r0 = r1.b
                r0.g(r2)
                return
        }

        public void h(@androidx.annotation.IdRes int... r5) {
                r4 = this;
                android.content.res.Resources r0 = r4.getResources()
                int r1 = r5.length
                int[] r1 = new int[r1]
                r2 = 0
            L8:
                int r3 = r5.length
                if (r2 >= r3) goto L16
                r3 = r5[r2]
                int r3 = r0.getColor(r3)
                r1[r2] = r3
                int r2 = r2 + 1
                goto L8
            L16:
                com.scwang.smartrefresh.header.WaveSwipeHeader r5 = r4.c
                r5.setColorSchemeColors(r1)
                return
        }

        public void i(float r2) {
                r1 = this;
                com.scwang.smartrefresh.header.internal.MaterialProgressDrawable r0 = r1.b
                r0.h(r2)
                return
        }

        public void j(float r2, float r3) {
                r1 = this;
                com.scwang.smartrefresh.header.internal.MaterialProgressDrawable r0 = r1.b
                r0.k(r2, r3)
                return
        }

        public void k(boolean r2) {
                r1 = this;
                com.scwang.smartrefresh.header.internal.MaterialProgressDrawable r0 = r1.b
                r0.m(r2)
                return
        }

        public void l() {
                r1 = this;
                com.scwang.smartrefresh.header.internal.MaterialProgressDrawable r0 = r1.b
                r0.start()
                return
        }

        public void m() {
                r1 = this;
                com.scwang.smartrefresh.header.internal.MaterialProgressDrawable r0 = r1.b
                r0.stop()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private enum f extends java.lang.Enum<com.scwang.smartrefresh.header.WaveSwipeHeader.f> {
        public static final com.scwang.smartrefresh.header.WaveSwipeHeader.f b = null;
        public static final com.scwang.smartrefresh.header.WaveSwipeHeader.f c = null;
        public static final com.scwang.smartrefresh.header.WaveSwipeHeader.f d = null;
        private static final /* synthetic */ com.scwang.smartrefresh.header.WaveSwipeHeader.f[] e = null;
        final float a;

        static {
                com.scwang.smartrefresh.header.WaveSwipeHeader$f r0 = new com.scwang.smartrefresh.header.WaveSwipeHeader$f
                r1 = 1036831949(0x3dcccccd, float:0.1)
                java.lang.String r2 = "FIRST"
                r3 = 0
                r0.<init>(r2, r3, r1)
                com.scwang.smartrefresh.header.WaveSwipeHeader.f.b = r0
                com.scwang.smartrefresh.header.WaveSwipeHeader$f r1 = new com.scwang.smartrefresh.header.WaveSwipeHeader$f
                r2 = 1042536202(0x3e23d70a, float:0.16)
                float r4 = r0.a
                float r4 = r4 + r2
                java.lang.String r2 = "SECOND"
                r5 = 1
                r1.<init>(r2, r5, r4)
                com.scwang.smartrefresh.header.WaveSwipeHeader.f.c = r1
                com.scwang.smartrefresh.header.WaveSwipeHeader$f r2 = new com.scwang.smartrefresh.header.WaveSwipeHeader$f
                r4 = 1056964608(0x3f000000, float:0.5)
                float r6 = r0.a
                float r6 = r6 + r4
                java.lang.String r4 = "THIRD"
                r7 = 2
                r2.<init>(r4, r7, r6)
                com.scwang.smartrefresh.header.WaveSwipeHeader.f.d = r2
                r4 = 3
                com.scwang.smartrefresh.header.WaveSwipeHeader$f[] r4 = new com.scwang.smartrefresh.header.WaveSwipeHeader.f[r4]
                r4[r3] = r0
                r4[r5] = r1
                r4[r7] = r2
                com.scwang.smartrefresh.header.WaveSwipeHeader.f.e = r4
                return
        }

        f(java.lang.String r1, int r2, float r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.a = r3
                return
        }

        public static com.scwang.smartrefresh.header.WaveSwipeHeader.f valueOf(java.lang.String r1) {
                java.lang.Class<com.scwang.smartrefresh.header.WaveSwipeHeader$f> r0 = com.scwang.smartrefresh.header.WaveSwipeHeader.f.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.scwang.smartrefresh.header.WaveSwipeHeader$f r1 = (com.scwang.smartrefresh.header.WaveSwipeHeader.f) r1
                return r1
        }

        public static com.scwang.smartrefresh.header.WaveSwipeHeader.f[] values() {
                com.scwang.smartrefresh.header.WaveSwipeHeader$f[] r0 = com.scwang.smartrefresh.header.WaveSwipeHeader.f.e
                java.lang.Object r0 = r0.clone()
                com.scwang.smartrefresh.header.WaveSwipeHeader$f[] r0 = (com.scwang.smartrefresh.header.WaveSwipeHeader.f[]) r0
                return r0
        }
    }

    public WaveSwipeHeader(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r0 = 0
            r1.z(r2, r0)
            return
    }

    public WaveSwipeHeader(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.z(r1, r2)
            return
    }

    public WaveSwipeHeader(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.z(r1, r2)
            return
    }

    @androidx.annotation.RequiresApi(21)
    public WaveSwipeHeader(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            r0.z(r1, r2)
            return
    }

    static /* synthetic */ com.scwang.smartrefresh.header.waveswipe.WaveView m(com.scwang.smartrefresh.header.WaveSwipeHeader r0) {
            com.scwang.smartrefresh.header.waveswipe.WaveView r0 = r0.a
            return r0
    }

    static /* synthetic */ com.scwang.smartrefresh.header.WaveSwipeHeader.e n(com.scwang.smartrefresh.header.WaveSwipeHeader r0) {
            com.scwang.smartrefresh.header.WaveSwipeHeader$e r0 = r0.c
            return r0
    }

    private void z(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            com.scwang.smartrefresh.header.waveswipe.WaveView r0 = new com.scwang.smartrefresh.header.waveswipe.WaveView
            r0.<init>(r4)
            r3.a = r0
            r3.addView(r0)
            com.scwang.smartrefresh.header.WaveSwipeHeader$e r0 = new com.scwang.smartrefresh.header.WaveSwipeHeader$e
            android.content.Context r1 = r3.getContext()
            r0.<init>(r3, r1)
            r3.c = r0
            r3.addView(r0)
            int[] r0 = com.scwang.smartrefresh.header.R.styleable.WaveSwipeHeader
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r0)
            int r5 = com.scwang.smartrefresh.header.R.styleable.WaveSwipeHeader_wshPrimaryColor
            r0 = 0
            int r5 = r4.getColor(r5, r0)
            int r1 = com.scwang.smartrefresh.header.R.styleable.WaveSwipeHeader_wshAccentColor
            int r1 = r4.getColor(r1, r0)
            if (r5 == 0) goto L32
            com.scwang.smartrefresh.header.waveswipe.WaveView r2 = r3.a
            r2.setWaveColor(r5)
        L32:
            if (r1 == 0) goto L3e
            com.scwang.smartrefresh.header.WaveSwipeHeader$e r5 = r3.c
            int[] r1 = new int[]{r1}
            r5.g(r1)
            goto L48
        L3e:
            com.scwang.smartrefresh.header.WaveSwipeHeader$e r5 = r3.c
            r1 = -1
            int[] r1 = new int[]{r1}
            r5.g(r1)
        L48:
            int r5 = com.scwang.smartrefresh.header.R.styleable.WaveSwipeHeader_wshShadowRadius
            boolean r1 = r4.hasValue(r5)
            if (r1 == 0) goto L61
            int r5 = r4.getDimensionPixelOffset(r5, r0)
            int r0 = com.scwang.smartrefresh.header.R.styleable.WaveSwipeHeader_wshShadowColor
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r0 = r4.getColor(r0, r1)
            com.scwang.smartrefresh.header.waveswipe.WaveView r1 = r3.a
            r1.o(r5, r0)
        L61:
            r4.recycle()
            return
    }

    public void f(l2.g r1, int r2, int r3) {
            r0 = this;
            return
    }

    public void g(float r1, int r2, int r3, int r4) {
            r0 = this;
            return
    }

    public com.scwang.smartrefresh.layout.constant.SpinnerStyle getSpinnerStyle() {
            r1 = this;
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r0 = com.scwang.smartrefresh.layout.constant.SpinnerStyle.MatchLayout
            return r0
    }

    @androidx.annotation.NonNull
    public android.view.View getView() {
            r0 = this;
            return r0
    }

    public void i(l2.h r1, int r2, int r3) {
            r0 = this;
            r1 = 0
            r0.d = r1
            com.scwang.smartrefresh.header.waveswipe.WaveView r1 = r0.a
            r1.f()
            com.scwang.smartrefresh.header.WaveSwipeHeader$e r1 = r0.c
            r1.b()
            com.scwang.smartrefresh.header.WaveSwipeHeader$e r1 = r0.c
            r1.l()
            r1 = 2
            float[] r1 = new float[r1]
            r1 = {x0036: FILL_ARRAY_DATA , data: [0, 0} // fill-array
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r1)
            r2 = 500(0x1f4, double:2.47E-321)
            r1.setDuration(r2)
            android.view.animation.AccelerateDecelerateInterpolator r2 = new android.view.animation.AccelerateDecelerateInterpolator
            r2.<init>()
            r1.setInterpolator(r2)
            com.scwang.smartrefresh.header.WaveSwipeHeader$a r2 = new com.scwang.smartrefresh.header.WaveSwipeHeader$a
            r2.<init>(r0)
            r1.addUpdateListener(r2)
            r1.start()
            return
    }

    public void j(float r1, int r2, int r3) {
            r0 = this;
            return
    }

    public boolean k() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            com.scwang.smartrefresh.header.waveswipe.WaveView r2 = r1.a
            int r3 = r1.getMeasuredWidth()
            int r4 = r1.getMeasuredHeight()
            r5 = 0
            r2.layout(r5, r5, r3, r4)
            int r2 = r1.getMeasuredWidth()
            com.scwang.smartrefresh.header.WaveSwipeHeader$e r3 = r1.c
            int r3 = r3.getMeasuredWidth()
            com.scwang.smartrefresh.header.WaveSwipeHeader$e r4 = r1.c
            int r4 = r4.getMeasuredHeight()
            com.scwang.smartrefresh.header.WaveSwipeHeader$e r6 = r1.c
            int r0 = r2 - r3
            int r0 = r0 / 2
            int r4 = -r4
            int r2 = r2 + r3
            int r2 = r2 / 2
            r6.layout(r0, r4, r2, r5)
            boolean r2 = r1.isInEditMode()
            if (r2 == 0) goto L47
            r2 = 1120272384(0x42c60000, float:99.0)
            int r2 = com.scwang.smartrefresh.layout.util.c.b(r2)
            r3 = 1120403456(0x42c80000, float:100.0)
            int r4 = com.scwang.smartrefresh.layout.util.c.b(r3)
            int r3 = com.scwang.smartrefresh.layout.util.c.b(r3)
            r5 = 1065185444(0x3f7d70a4, float:0.99)
            r1.x(r5, r2, r4, r3)
        L47:
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r3, int r4) {
            r2 = this;
            int r0 = android.view.View.MeasureSpec.getSize(r3)
            int r1 = android.view.View.MeasureSpec.getSize(r4)
            r2.setMeasuredDimension(r0, r1)
            com.scwang.smartrefresh.header.WaveSwipeHeader$e r0 = r2.c
            r0.c()
            com.scwang.smartrefresh.header.waveswipe.WaveView r0 = r2.a
            int r3 = android.view.View.MeasureSpec.getSize(r3)
            r1 = 1073741824(0x40000000, float:2.0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r1)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r1)
            r0.measure(r3, r4)
            return
    }

    public void q(l2.h r1, com.scwang.smartrefresh.layout.constant.RefreshState r2, com.scwang.smartrefresh.layout.constant.RefreshState r3) {
            r0 = this;
            r0.b = r3
            int[] r1 = com.scwang.smartrefresh.header.WaveSwipeHeader.d.a
            int r2 = r3.ordinal()
            r1 = r1[r2]
            r2 = 2
            if (r1 == r2) goto L2c
            r2 = 3
            if (r1 == r2) goto L11
            return
        L11:
            com.scwang.smartrefresh.header.WaveSwipeHeader$e r1 = r0.c
            r2 = 0
            r1.k(r2)
            com.scwang.smartrefresh.header.WaveSwipeHeader$e r1 = r0.c
            r2 = 0
            r1.i(r2)
            com.scwang.smartrefresh.header.WaveSwipeHeader$e r1 = r0.c
            r1.j(r2, r2)
            com.scwang.smartrefresh.header.waveswipe.WaveView r1 = r0.a
            float r3 = r0.d
            r1.u(r3)
            r0.d = r2
            return
        L2c:
            com.scwang.smartrefresh.header.WaveSwipeHeader$e r1 = r0.c
            r2 = 1
            r1.k(r2)
            com.scwang.smartrefresh.header.WaveSwipeHeader$e r1 = r0.c
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.d(r2)
            com.scwang.smartrefresh.header.WaveSwipeHeader$e r1 = r0.c
            r1.b()
            return
    }

    public void setColorSchemeColors(int... r2) {
            r1 = this;
            com.scwang.smartrefresh.header.WaveSwipeHeader$e r0 = r1.c
            r0.g(r2)
            return
    }

    @java.lang.Deprecated
    public void setPrimaryColors(@androidx.annotation.ColorInt int... r3) {
            r2 = this;
            int r0 = r3.length
            if (r0 <= 0) goto L1a
            com.scwang.smartrefresh.header.waveswipe.WaveView r0 = r2.a
            r1 = 0
            r1 = r3[r1]
            r0.setWaveColor(r1)
            int r0 = r3.length
            r1 = 1
            if (r0 <= r1) goto L1a
            com.scwang.smartrefresh.header.WaveSwipeHeader$e r0 = r2.c
            r3 = r3[r1]
            int[] r3 = new int[]{r3}
            r0.g(r3)
        L1a:
            return
    }

    public void t(l2.h r1, int r2, int r3) {
            r0 = this;
            return
    }

    public int w(l2.h r3, boolean r4) {
            r2 = this;
            com.scwang.smartrefresh.header.WaveSwipeHeader$b r3 = new com.scwang.smartrefresh.header.WaveSwipeHeader$b
            r3.<init>(r2)
            r0 = 200(0xc8, double:9.9E-322)
            r3.setDuration(r0)
            com.scwang.smartrefresh.header.WaveSwipeHeader$e r4 = r2.c
            com.scwang.smartrefresh.header.WaveSwipeHeader$c r0 = new com.scwang.smartrefresh.header.WaveSwipeHeader$c
            r0.<init>(r2)
            r4.setAnimationListener(r0)
            com.scwang.smartrefresh.header.WaveSwipeHeader$e r4 = r2.c
            r4.clearAnimation()
            com.scwang.smartrefresh.header.WaveSwipeHeader$e r4 = r2.c
            r4.startAnimation(r3)
            r3 = 0
            return r3
    }

    public void x(float r7, int r8, int r9, int r10) {
            r6 = this;
            com.scwang.smartrefresh.layout.constant.RefreshState r9 = r6.b
            com.scwang.smartrefresh.layout.constant.RefreshState r10 = com.scwang.smartrefresh.layout.constant.RefreshState.Refreshing
            if (r9 != r10) goto L7
            return
        L7:
            r9 = 1065353216(0x3f800000, float:1.0)
            float r10 = java.lang.Math.min(r9, r7)
            double r0 = (double) r10
            r2 = 4600877379321698714(0x3fd999999999999a, double:0.4)
            double r0 = r0 - r2
            r2 = 0
            double r0 = java.lang.Math.max(r0, r2)
            float r10 = (float) r0
            r0 = 1084227584(0x40a00000, float:5.0)
            float r10 = r10 * r0
            r1 = 1077936128(0x40400000, float:3.0)
            float r10 = r10 / r1
            r2 = 0
            r3 = 1073741824(0x40000000, float:2.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 <= 0) goto L2c
            r1 = 1073741824(0x40000000, float:2.0)
            goto L34
        L2c:
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 <= 0) goto L33
            float r1 = r7 - r9
            goto L34
        L33:
            r1 = 0
        L34:
            r4 = 1082130432(0x40800000, float:4.0)
            float r4 = r4 - r1
            float r4 = r4 * r1
            r1 = 1090519040(0x41000000, float:8.0)
            float r4 = r4 / r1
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 >= 0) goto L57
            r7 = 1061997773(0x3f4ccccd, float:0.8)
            float r1 = r10 * r7
            com.scwang.smartrefresh.header.WaveSwipeHeader$e r5 = r6.c
            float r7 = java.lang.Math.min(r7, r1)
            r5.j(r2, r7)
            com.scwang.smartrefresh.header.WaveSwipeHeader$e r7 = r6.c
            float r1 = java.lang.Math.min(r9, r10)
            r7.e(r1)
        L57:
            r7 = 1053609165(0x3ecccccd, float:0.4)
            float r10 = r10 * r7
            r7 = -1098907648(0xffffffffbe800000, float:-0.25)
            float r10 = r10 + r7
            float r4 = r4 * r3
            float r10 = r10 + r4
            r7 = 1056964608(0x3f000000, float:0.5)
            float r10 = r10 * r7
            com.scwang.smartrefresh.header.WaveSwipeHeader$e r7 = r6.c
            r7.i(r10)
            com.scwang.smartrefresh.header.WaveSwipeHeader$e r7 = r6.c
            com.scwang.smartrefresh.header.waveswipe.WaveView r10 = r6.a
            float r10 = r10.getCurrentCircleCenterY()
            r7.setTranslationY(r10)
            float r7 = (float) r8
            float r7 = r7 * r9
            int r8 = r6.getMeasuredWidth()
            int r9 = r6.getMeasuredHeight()
            int r8 = java.lang.Math.min(r8, r9)
            float r8 = (float) r8
            float r7 = r7 / r8
            float r3 = r3 * r7
            float r8 = r0 - r3
            float r7 = r7 * r8
            r8 = 1080033280(0x40600000, float:3.5)
            float r7 = r7 / r8
            com.scwang.smartrefresh.header.WaveSwipeHeader$f r8 = com.scwang.smartrefresh.header.WaveSwipeHeader.f.b
            float r8 = r8.a
            float r9 = r7 - r8
            com.scwang.smartrefresh.header.WaveSwipeHeader$f r10 = com.scwang.smartrefresh.header.WaveSwipeHeader.f.c
            float r10 = r10.a
            float r1 = r7 - r10
            float r1 = r1 / r0
            r6.d = r7
            int r8 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r8 >= 0) goto La9
            com.scwang.smartrefresh.header.waveswipe.WaveView r8 = r6.a
            r8.h(r7)
            return
        La9:
            int r8 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r8 >= 0) goto Lb3
            com.scwang.smartrefresh.header.waveswipe.WaveView r8 = r6.a
            r8.g(r7, r9)
            return
        Lb3:
            com.scwang.smartrefresh.header.waveswipe.WaveView r8 = r6.a
            r8.i(r7, r9, r1)
            return
    }
}
