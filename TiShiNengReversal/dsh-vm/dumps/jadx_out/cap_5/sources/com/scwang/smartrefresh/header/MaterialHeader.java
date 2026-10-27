package com.scwang.smartrefresh.header;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class MaterialHeader extends android.view.ViewGroup implements l2.e {
    public static final int k = 0;
    public static final int l = 1;
    private static final int m = -328966;
    private static final float n = 0.8f;

    @androidx.annotation.VisibleForTesting
    private static final int o = 40;

    @androidx.annotation.VisibleForTesting
    private static final int p = 56;
    private boolean a;
    private int b;
    private com.scwang.smartrefresh.header.material.CircleImageView c;
    private com.scwang.smartrefresh.header.internal.MaterialProgressDrawable d;
    private int e;
    private int f;
    private android.graphics.Path g;
    private android.graphics.Paint h;
    private boolean i;
    private com.scwang.smartrefresh.layout.constant.RefreshState j;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a = null;

        static {
                com.scwang.smartrefresh.layout.constant.RefreshState[] r0 = com.scwang.smartrefresh.layout.constant.RefreshState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.scwang.smartrefresh.header.MaterialHeader.a.a = r0
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.None     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.scwang.smartrefresh.header.MaterialHeader.a.a     // Catch: java.lang.NoSuchFieldError -> L1d
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.PullDownToRefresh     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.scwang.smartrefresh.header.MaterialHeader.a.a     // Catch: java.lang.NoSuchFieldError -> L28
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.ReleaseToRefresh     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.scwang.smartrefresh.header.MaterialHeader.a.a     // Catch: java.lang.NoSuchFieldError -> L33
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.Refreshing     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    public MaterialHeader(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r0 = 0
            r1.i = r0
            r0 = 0
            r1.m(r2, r0)
            return
    }

    public MaterialHeader(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            r0 = 0
            r1.i = r0
            r1.m(r2, r3)
            return
    }

    public MaterialHeader(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r3 = 0
            r0.i = r3
            r0.m(r1, r2)
            return
    }

    @androidx.annotation.RequiresApi(21)
    public MaterialHeader(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            r3 = 0
            r0.i = r3
            r0.m(r1, r2)
            return
    }

    private void m(android.content.Context r8, android.util.AttributeSet r9) {
            r7 = this;
            r0 = 1120403456(0x42c80000, float:100.0)
            int r0 = com.scwang.smartrefresh.layout.util.c.b(r0)
            r7.setMinimumHeight(r0)
            com.scwang.smartrefresh.header.internal.MaterialProgressDrawable r0 = new com.scwang.smartrefresh.header.internal.MaterialProgressDrawable
            r0.<init>(r8, r7)
            r7.d = r0
            r1 = -328966(0xfffffffffffafafa, float:NaN)
            r0.f(r1)
            com.scwang.smartrefresh.header.internal.MaterialProgressDrawable r0 = r7.d
            r2 = 255(0xff, float:3.57E-43)
            r0.setAlpha(r2)
            com.scwang.smartrefresh.header.internal.MaterialProgressDrawable r0 = r7.d
            r2 = -5609780(0xffffffffffaa66cc, float:NaN)
            r3 = -30720(0xffffffffffff8800, float:NaN)
            r4 = -16737844(0xffffffffff0099cc, float:-1.7093974E38)
            r5 = -48060(0xffffffffffff4444, float:NaN)
            r6 = -10053376(0xffffffffff669900, float:-3.0651686E38)
            int[] r2 = new int[]{r4, r5, r6, r2, r3}
            r0.g(r2)
            com.scwang.smartrefresh.header.material.CircleImageView r0 = new com.scwang.smartrefresh.header.material.CircleImageView
            r0.<init>(r8, r1)
            r7.c = r0
            com.scwang.smartrefresh.header.internal.MaterialProgressDrawable r1 = r7.d
            r0.setImageDrawable(r1)
            com.scwang.smartrefresh.header.material.CircleImageView r0 = r7.c
            r1 = 8
            r0.setVisibility(r1)
            com.scwang.smartrefresh.header.material.CircleImageView r0 = r7.c
            r7.addView(r0)
            android.content.res.Resources r0 = r7.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            r1 = 1109393408(0x42200000, float:40.0)
            float r0 = r0.density
            float r0 = r0 * r1
            int r0 = (int) r0
            r7.b = r0
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r7.g = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r7.h = r0
            r1 = 1
            r0.setAntiAlias(r1)
            android.graphics.Paint r0 = r7.h
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL
            r0.setStyle(r2)
            int[] r0 = com.scwang.smartrefresh.header.R.styleable.MaterialHeader
            android.content.res.TypedArray r8 = r8.obtainStyledAttributes(r9, r0)
            int r9 = com.scwang.smartrefresh.header.R.styleable.MaterialHeader_mhShowBezierWave
            boolean r0 = r7.i
            boolean r9 = r8.getBoolean(r9, r0)
            r7.i = r9
            android.graphics.Paint r9 = r7.h
            int r0 = com.scwang.smartrefresh.header.R.styleable.MaterialHeader_mhPrimaryColor
            r2 = -15614977(0xffffffffff11bbff, float:-1.937142E38)
            int r0 = r8.getColor(r0, r2)
            r9.setColor(r0)
            int r9 = com.scwang.smartrefresh.header.R.styleable.MaterialHeader_mhShadowRadius
            boolean r0 = r8.hasValue(r9)
            if (r0 == 0) goto Lb4
            r0 = 0
            int r9 = r8.getDimensionPixelOffset(r9, r0)
            int r0 = com.scwang.smartrefresh.header.R.styleable.MaterialHeader_mhShadowColor
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r0 = r8.getColor(r0, r2)
            android.graphics.Paint r2 = r7.h
            float r9 = (float) r9
            r3 = 0
            r2.setShadowLayer(r9, r3, r3, r0)
            r9 = 0
            r7.setLayerType(r1, r9)
        Lb4:
            r8.recycle()
            return
    }

    public com.scwang.smartrefresh.header.MaterialHeader A(int r3) {
            r2 = this;
            if (r3 == 0) goto L6
            r0 = 1
            if (r3 == r0) goto L6
            return r2
        L6:
            android.content.res.Resources r0 = r2.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            if (r3 != 0) goto L1a
            r1 = 1113587712(0x42600000, float:56.0)
            float r0 = r0.density
            float r0 = r0 * r1
            int r0 = (int) r0
            r2.b = r0
            goto L23
        L1a:
            r1 = 1109393408(0x42200000, float:40.0)
            float r0 = r0.density
            float r0 = r0 * r1
            int r0 = (int) r0
            r2.b = r0
        L23:
            com.scwang.smartrefresh.header.material.CircleImageView r0 = r2.c
            r1 = 0
            r0.setImageDrawable(r1)
            com.scwang.smartrefresh.header.internal.MaterialProgressDrawable r0 = r2.d
            r0.o(r3)
            com.scwang.smartrefresh.header.material.CircleImageView r3 = r2.c
            com.scwang.smartrefresh.header.internal.MaterialProgressDrawable r0 = r2.d
            r3.setImageDrawable(r0)
            return r2
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(android.graphics.Canvas r7) {
            r6 = this;
            boolean r0 = r6.i
            if (r0 == 0) goto L43
            android.graphics.Path r0 = r6.g
            r0.reset()
            android.graphics.Path r0 = r6.g
            int r1 = r6.f
            float r1 = (float) r1
            r2 = 0
            r0.lineTo(r2, r1)
            android.graphics.Path r0 = r6.g
            int r1 = r6.getMeasuredWidth()
            int r1 = r1 / 2
            float r1 = (float) r1
            int r3 = r6.f
            float r3 = (float) r3
            int r4 = r6.e
            float r4 = (float) r4
            r5 = 1072902963(0x3ff33333, float:1.9)
            float r4 = r4 * r5
            float r3 = r3 + r4
            int r4 = r6.getMeasuredWidth()
            float r4 = (float) r4
            int r5 = r6.f
            float r5 = (float) r5
            r0.quadTo(r1, r3, r4, r5)
            android.graphics.Path r0 = r6.g
            int r1 = r6.getMeasuredWidth()
            float r1 = (float) r1
            r0.lineTo(r1, r2)
            android.graphics.Path r0 = r6.g
            android.graphics.Paint r1 = r6.h
            r7.drawPath(r0, r1)
        L43:
            super.dispatchDraw(r7)
            return
    }

    public void f(l2.g r1, int r2, int r3) {
            r0 = this;
            boolean r3 = r0.i
            if (r3 != 0) goto L8
            r3 = 0
            r1.l(r3)
        L8:
            boolean r1 = r0.isInEditMode()
            if (r1 == 0) goto L14
            int r2 = r2 / 2
            r0.f = r2
            r0.e = r2
        L14:
            return
    }

    public void g(float r2, int r3, int r4, int r5) {
            r1 = this;
            com.scwang.smartrefresh.header.internal.MaterialProgressDrawable r0 = r1.d
            boolean r0 = r0.isRunning()
            if (r0 != 0) goto L10
            boolean r0 = r1.a
            if (r0 != 0) goto L10
            r1.x(r2, r3, r4, r5)
            return
        L10:
            boolean r2 = r1.i
            if (r2 == 0) goto L25
            int r2 = java.lang.Math.min(r3, r4)
            r1.f = r2
            r2 = 0
            int r3 = r3 - r4
            int r2 = java.lang.Math.max(r2, r3)
            r1.e = r2
            r1.postInvalidate()
        L25:
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
            com.scwang.smartrefresh.header.internal.MaterialProgressDrawable r1 = r0.d
            r1.start()
            com.scwang.smartrefresh.header.material.CircleImageView r1 = r0.c
            float r1 = r1.getTranslationY()
            int r1 = (int) r1
            int r2 = r2 / 2
            int r3 = r0.b
            int r3 = r3 / 2
            int r3 = r3 + r2
            if (r1 == r3) goto L24
            com.scwang.smartrefresh.header.material.CircleImageView r1 = r0.c
            android.view.ViewPropertyAnimator r1 = r1.animate()
            int r3 = r0.b
            int r3 = r3 / 2
            int r2 = r2 + r3
            float r2 = (float) r2
            r1.translationY(r2)
        L24:
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

    public com.scwang.smartrefresh.header.MaterialHeader n(int... r2) {
            r1 = this;
            com.scwang.smartrefresh.header.internal.MaterialProgressDrawable r0 = r1.d
            r0.g(r2)
            return r1
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r3, int r4, int r5, int r6, int r7) {
            r2 = this;
            int r3 = r2.getChildCount()
            if (r3 != 0) goto L7
            return
        L7:
            int r3 = r2.getMeasuredWidth()
            com.scwang.smartrefresh.header.material.CircleImageView r4 = r2.c
            int r4 = r4.getMeasuredWidth()
            com.scwang.smartrefresh.header.material.CircleImageView r5 = r2.c
            int r5 = r5.getMeasuredHeight()
            boolean r6 = r2.isInEditMode()
            if (r6 == 0) goto L53
            int r6 = r2.f
            if (r6 <= 0) goto L53
            int r7 = r5 / 2
            int r6 = r6 - r7
            com.scwang.smartrefresh.header.material.CircleImageView r7 = r2.c
            int r3 = r3 / 2
            int r4 = r4 / 2
            int r0 = r3 - r4
            int r3 = r3 + r4
            int r5 = r5 + r6
            r7.layout(r0, r6, r3, r5)
            com.scwang.smartrefresh.header.internal.MaterialProgressDrawable r3 = r2.d
            r4 = 1
            r3.m(r4)
            com.scwang.smartrefresh.header.internal.MaterialProgressDrawable r3 = r2.d
            r4 = 0
            r5 = 1061997773(0x3f4ccccd, float:0.8)
            r3.k(r4, r5)
            com.scwang.smartrefresh.header.internal.MaterialProgressDrawable r3 = r2.d
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.e(r4)
            com.scwang.smartrefresh.header.material.CircleImageView r3 = r2.c
            r3.setAlpha(r4)
            com.scwang.smartrefresh.header.material.CircleImageView r3 = r2.c
            r4 = 0
            r3.setVisibility(r4)
            return
        L53:
            com.scwang.smartrefresh.header.material.CircleImageView r6 = r2.c
            int r3 = r3 / 2
            int r4 = r4 / 2
            int r7 = r3 - r4
            int r0 = r2.b
            int r1 = -r0
            int r3 = r3 + r4
            int r5 = r5 - r0
            r6.layout(r7, r1, r3, r5)
            return
    }

    @Override // android.view.View
    public void onMeasure(int r3, int r4) {
            r2 = this;
            int r3 = android.view.View.MeasureSpec.getSize(r3)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r2.setMeasuredDimension(r3, r4)
            com.scwang.smartrefresh.header.material.CircleImageView r3 = r2.c
            int r4 = r2.b
            r0 = 1073741824(0x40000000, float:2.0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r0)
            int r1 = r2.b
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            r3.measure(r4, r0)
            return
    }

    public void q(l2.h r1, com.scwang.smartrefresh.layout.constant.RefreshState r2, com.scwang.smartrefresh.layout.constant.RefreshState r3) {
            r0 = this;
            r0.j = r3
            int[] r1 = com.scwang.smartrefresh.header.MaterialHeader.a.a
            int r2 = r3.ordinal()
            r1 = r1[r2]
            r2 = 2
            if (r1 == r2) goto Le
            return
        Le:
            r1 = 0
            r0.a = r1
            com.scwang.smartrefresh.header.material.CircleImageView r2 = r0.c
            r2.setVisibility(r1)
            com.scwang.smartrefresh.header.material.CircleImageView r1 = r0.c
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.setScaleX(r2)
            com.scwang.smartrefresh.header.material.CircleImageView r1 = r0.c
            r1.setScaleY(r2)
            return
    }

    @java.lang.Deprecated
    public void setPrimaryColors(@androidx.annotation.ColorInt int... r3) {
            r2 = this;
            int r0 = r3.length
            if (r0 <= 0) goto Lb
            android.graphics.Paint r0 = r2.h
            r1 = 0
            r3 = r3[r1]
            r0.setColor(r3)
        Lb:
            return
    }

    public void t(l2.h r1, int r2, int r3) {
            r0 = this;
            return
    }

    public int w(l2.h r1, boolean r2) {
            r0 = this;
            com.scwang.smartrefresh.header.internal.MaterialProgressDrawable r1 = r0.d
            r1.stop()
            com.scwang.smartrefresh.header.material.CircleImageView r1 = r0.c
            android.view.ViewPropertyAnimator r1 = r1.animate()
            r2 = 0
            android.view.ViewPropertyAnimator r1 = r1.scaleX(r2)
            r1.scaleY(r2)
            r1 = 1
            r0.a = r1
            r1 = 0
            return r1
    }

    public void x(float r8, int r9, int r10, int r11) {
            r7 = this;
            boolean r8 = r7.i
            if (r8 == 0) goto L16
            int r8 = java.lang.Math.min(r9, r10)
            r7.f = r8
            r8 = 0
            int r11 = r9 - r10
            int r8 = java.lang.Math.max(r8, r11)
            r7.e = r8
            r7.postInvalidate()
        L16:
            com.scwang.smartrefresh.layout.constant.RefreshState r8 = r7.j
            com.scwang.smartrefresh.layout.constant.RefreshState r11 = com.scwang.smartrefresh.layout.constant.RefreshState.Refreshing
            if (r8 == r11) goto L9e
            float r8 = (float) r9
            r11 = 1065353216(0x3f800000, float:1.0)
            float r8 = r8 * r11
            float r0 = (float) r10
            float r8 = r8 / r0
            float r1 = java.lang.Math.abs(r8)
            float r1 = java.lang.Math.min(r11, r1)
            double r1 = (double) r1
            r3 = 4600877379321698714(0x3fd999999999999a, double:0.4)
            double r1 = r1 - r3
            r3 = 0
            double r1 = java.lang.Math.max(r1, r3)
            float r1 = (float) r1
            r2 = 1084227584(0x40a00000, float:5.0)
            float r1 = r1 * r2
            r2 = 1077936128(0x40400000, float:3.0)
            float r1 = r1 / r2
            int r2 = java.lang.Math.abs(r9)
            int r2 = r2 - r10
            float r10 = (float) r2
            r2 = 1073741824(0x40000000, float:2.0)
            float r3 = r0 * r2
            float r10 = java.lang.Math.min(r10, r3)
            float r10 = r10 / r0
            r0 = 0
            float r10 = java.lang.Math.max(r0, r10)
            r3 = 1082130432(0x40800000, float:4.0)
            float r10 = r10 / r3
            double r3 = (double) r10
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r5 = java.lang.Math.pow(r3, r5)
            double r3 = r3 - r5
            float r10 = (float) r3
            float r10 = r10 * r2
            r3 = 1061997773(0x3f4ccccd, float:0.8)
            float r4 = r1 * r3
            com.scwang.smartrefresh.header.internal.MaterialProgressDrawable r5 = r7.d
            r6 = 1
            r5.m(r6)
            com.scwang.smartrefresh.header.internal.MaterialProgressDrawable r5 = r7.d
            float r3 = java.lang.Math.min(r3, r4)
            r5.k(r0, r3)
            com.scwang.smartrefresh.header.internal.MaterialProgressDrawable r0 = r7.d
            float r3 = java.lang.Math.min(r11, r1)
            r0.e(r3)
            r0 = 1053609165(0x3ecccccd, float:0.4)
            float r1 = r1 * r0
            r0 = -1098907648(0xffffffffbe800000, float:-0.25)
            float r1 = r1 + r0
            float r10 = r10 * r2
            float r1 = r1 + r10
            r10 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r10
            com.scwang.smartrefresh.header.internal.MaterialProgressDrawable r10 = r7.d
            r10.h(r1)
            com.scwang.smartrefresh.header.material.CircleImageView r10 = r7.c
            float r8 = r8 * r2
            float r8 = java.lang.Math.min(r11, r8)
            r10.setAlpha(r8)
        L9e:
            int r8 = r9 / 2
            int r10 = r7.b
            int r10 = r10 / 2
            int r8 = r8 + r10
            float r8 = (float) r8
            com.scwang.smartrefresh.header.material.CircleImageView r10 = r7.c
            float r9 = (float) r9
            float r8 = java.lang.Math.min(r9, r8)
            r10.setTranslationY(r8)
            return
    }

    public com.scwang.smartrefresh.header.MaterialHeader z(boolean r1) {
            r0 = this;
            r0.i = r1
            return r0
    }
}
