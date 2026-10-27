package com.scwang.smartrefresh.header;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class WaterDropHeader extends android.view.ViewGroup implements l2.e {
    private static final float g = 0.8f;
    private com.scwang.smartrefresh.layout.constant.RefreshState a;
    private android.widget.ImageView b;
    private com.scwang.smartrefresh.header.waterdrop.WaterDropView c;
    private com.scwang.smartrefresh.layout.internal.a d;
    private com.scwang.smartrefresh.header.internal.MaterialProgressDrawable e;
    private int f;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends android.animation.AnimatorListenerAdapter {
        final /* synthetic */ com.scwang.smartrefresh.header.WaterDropHeader a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.scwang.smartrefresh.header.WaterDropHeader$a$a, reason: collision with other inner class name */
        class C0181a extends android.animation.AnimatorListenerAdapter {
            final /* synthetic */ com.scwang.smartrefresh.header.WaterDropHeader.a a;

            C0181a(com.scwang.smartrefresh.header.WaterDropHeader.a r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator r2) {
                    r1 = this;
                    com.scwang.smartrefresh.header.WaterDropHeader$a r2 = r1.a
                    com.scwang.smartrefresh.header.WaterDropHeader r2 = r2.a
                    com.scwang.smartrefresh.header.waterdrop.WaterDropView r2 = com.scwang.smartrefresh.header.WaterDropHeader.m(r2)
                    r0 = 8
                    r2.setVisibility(r0)
                    com.scwang.smartrefresh.header.WaterDropHeader$a r2 = r1.a
                    com.scwang.smartrefresh.header.WaterDropHeader r2 = r2.a
                    com.scwang.smartrefresh.header.waterdrop.WaterDropView r2 = com.scwang.smartrefresh.header.WaterDropHeader.m(r2)
                    r0 = 1065353216(0x3f800000, float:1.0)
                    r2.setAlpha(r0)
                    return
            }
        }

        a(com.scwang.smartrefresh.header.WaterDropHeader r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r2) {
                r1 = this;
                com.scwang.smartrefresh.header.WaterDropHeader r2 = r1.a
                com.scwang.smartrefresh.header.waterdrop.WaterDropView r2 = com.scwang.smartrefresh.header.WaterDropHeader.m(r2)
                android.view.ViewPropertyAnimator r2 = r2.animate()
                r0 = 0
                android.view.ViewPropertyAnimator r2 = r2.alpha(r0)
                com.scwang.smartrefresh.header.WaterDropHeader$a$a r0 = new com.scwang.smartrefresh.header.WaterDropHeader$a$a
                r0.<init>(r1)
                r2.setListener(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements java.lang.Runnable {
        final /* synthetic */ l2.h a;
        final /* synthetic */ com.scwang.smartrefresh.header.WaterDropHeader b;

        b(com.scwang.smartrefresh.header.WaterDropHeader r1, l2.h r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                com.scwang.smartrefresh.header.WaterDropHeader r0 = r3.b
                int r1 = com.scwang.smartrefresh.header.WaterDropHeader.n(r0)
                int r1 = r1 + 30
                int r1 = r1 % 360
                com.scwang.smartrefresh.header.WaterDropHeader.z(r0, r1)
                com.scwang.smartrefresh.header.WaterDropHeader r0 = r3.b
                r0.invalidate()
                com.scwang.smartrefresh.header.WaterDropHeader r0 = r3.b
                com.scwang.smartrefresh.layout.constant.RefreshState r0 = com.scwang.smartrefresh.header.WaterDropHeader.A(r0)
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.Refreshing
                if (r0 == r1) goto L28
                com.scwang.smartrefresh.header.WaterDropHeader r0 = r3.b
                com.scwang.smartrefresh.layout.constant.RefreshState r0 = com.scwang.smartrefresh.header.WaterDropHeader.A(r0)
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.RefreshReleased
                if (r0 != r1) goto L27
                goto L28
            L27:
                return
            L28:
                l2.h r0 = r3.a
                android.view.ViewGroup r0 = r0.getLayout()
                r1 = 100
                r0.postDelayed(r3, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class c {
        static final /* synthetic */ int[] a = null;

        static {
                com.scwang.smartrefresh.layout.constant.RefreshState[] r0 = com.scwang.smartrefresh.layout.constant.RefreshState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.scwang.smartrefresh.header.WaterDropHeader.c.a = r0
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.None     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.scwang.smartrefresh.header.WaterDropHeader.c.a     // Catch: java.lang.NoSuchFieldError -> L1d
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.PullDownToRefresh     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.scwang.smartrefresh.header.WaterDropHeader.c.a     // Catch: java.lang.NoSuchFieldError -> L28
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.PullDownCanceled     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.scwang.smartrefresh.header.WaterDropHeader.c.a     // Catch: java.lang.NoSuchFieldError -> L33
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.ReleaseToRefresh     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.scwang.smartrefresh.header.WaterDropHeader.c.a     // Catch: java.lang.NoSuchFieldError -> L3e
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.Refreshing     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = com.scwang.smartrefresh.header.WaterDropHeader.c.a     // Catch: java.lang.NoSuchFieldError -> L49
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.RefreshFinish     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                return
        }

        public c() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    public WaterDropHeader(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r0 = 0
            r1.f = r0
            r1.B(r2)
            return
    }

    public WaterDropHeader(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r2 = 0
            r0.f = r2
            r0.B(r1)
            return
    }

    public WaterDropHeader(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r2 = 0
            r0.f = r2
            r0.B(r1)
            return
    }

    @androidx.annotation.RequiresApi(21)
    public WaterDropHeader(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            r2 = 0
            r0.f = r2
            r0.B(r1)
            return
    }

    static /* synthetic */ com.scwang.smartrefresh.layout.constant.RefreshState A(com.scwang.smartrefresh.header.WaterDropHeader r0) {
            com.scwang.smartrefresh.layout.constant.RefreshState r0 = r0.a
            return r0
    }

    private void B(android.content.Context r7) {
            r6 = this;
            com.scwang.smartrefresh.layout.util.c r0 = new com.scwang.smartrefresh.layout.util.c
            r0.<init>()
            com.scwang.smartrefresh.header.waterdrop.WaterDropView r1 = new com.scwang.smartrefresh.header.waterdrop.WaterDropView
            r1.<init>(r7)
            r6.c = r1
            r2 = -1
            r6.addView(r1, r2, r2)
            com.scwang.smartrefresh.header.waterdrop.WaterDropView r1 = r6.c
            r3 = 0
            r1.e(r3)
            com.scwang.smartrefresh.layout.internal.a r1 = new com.scwang.smartrefresh.layout.internal.a
            r1.<init>()
            r6.d = r1
            r4 = 1101004800(0x41a00000, float:20.0)
            int r5 = r0.a(r4)
            int r4 = r0.a(r4)
            r1.setBounds(r3, r3, r5, r4)
            android.widget.ImageView r1 = new android.widget.ImageView
            r1.<init>(r7)
            r6.b = r1
            com.scwang.smartrefresh.header.internal.MaterialProgressDrawable r1 = new com.scwang.smartrefresh.header.internal.MaterialProgressDrawable
            android.widget.ImageView r3 = r6.b
            r1.<init>(r7, r3)
            r6.e = r1
            r1.f(r2)
            com.scwang.smartrefresh.header.internal.MaterialProgressDrawable r7 = r6.e
            r1 = 255(0xff, float:3.57E-43)
            r7.setAlpha(r1)
            com.scwang.smartrefresh.header.internal.MaterialProgressDrawable r7 = r6.e
            r1 = 6
            int[] r1 = new int[r1]
            r1 = {x0066: FILL_ARRAY_DATA , data: [-1, -16737844, -48060, -10053376, -5609780, -30720} // fill-array
            r7.g(r1)
            android.widget.ImageView r7 = r6.b
            com.scwang.smartrefresh.header.internal.MaterialProgressDrawable r1 = r6.e
            r7.setImageDrawable(r1)
            android.widget.ImageView r7 = r6.b
            r1 = 1106247680(0x41f00000, float:30.0)
            int r2 = r0.a(r1)
            int r0 = r0.a(r1)
            r6.addView(r7, r2, r0)
            return
    }

    static /* synthetic */ com.scwang.smartrefresh.header.waterdrop.WaterDropView m(com.scwang.smartrefresh.header.WaterDropHeader r0) {
            com.scwang.smartrefresh.header.waterdrop.WaterDropView r0 = r0.c
            return r0
    }

    static /* synthetic */ int n(com.scwang.smartrefresh.header.WaterDropHeader r0) {
            int r0 = r0.f
            return r0
    }

    static /* synthetic */ int z(com.scwang.smartrefresh.header.WaterDropHeader r0, int r1) {
            r0.f = r1
            return r1
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(android.graphics.Canvas r4) {
            r3 = this;
            super.dispatchDraw(r4)
            com.scwang.smartrefresh.layout.constant.RefreshState r0 = r3.a
            com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.Refreshing
            if (r0 != r1) goto L56
            r4.save()
            int r0 = r3.getWidth()
            int r0 = r0 / 2
            com.scwang.smartrefresh.layout.internal.a r1 = r3.d
            int r1 = r1.e()
            int r1 = r1 / 2
            int r0 = r0 - r1
            float r0 = (float) r0
            com.scwang.smartrefresh.header.waterdrop.WaterDropView r1 = r3.c
            int r1 = r1.getMaxCircleRadius()
            com.scwang.smartrefresh.header.waterdrop.WaterDropView r2 = r3.c
            int r2 = r2.getPaddingTop()
            int r1 = r1 + r2
            com.scwang.smartrefresh.layout.internal.a r2 = r3.d
            int r2 = r2.b()
            int r2 = r2 / 2
            int r1 = r1 - r2
            float r1 = (float) r1
            r4.translate(r0, r1)
            int r0 = r3.f
            float r0 = (float) r0
            com.scwang.smartrefresh.layout.internal.a r1 = r3.d
            int r1 = r1.e()
            int r1 = r1 / 2
            float r1 = (float) r1
            com.scwang.smartrefresh.layout.internal.a r2 = r3.d
            int r2 = r2.b()
            int r2 = r2 / 2
            float r2 = (float) r2
            r4.rotate(r0, r1, r2)
            com.scwang.smartrefresh.layout.internal.a r0 = r3.d
            r0.draw(r4)
            r4.restore()
        L56:
            return
    }

    public void f(l2.g r1, int r2, int r3) {
            r0 = this;
            return
    }

    public void g(float r2, int r3, int r4, int r5) {
            r1 = this;
            com.scwang.smartrefresh.layout.constant.RefreshState r2 = r1.a
            com.scwang.smartrefresh.layout.constant.RefreshState r0 = com.scwang.smartrefresh.layout.constant.RefreshState.Refreshing
            if (r2 == r0) goto L1a
            com.scwang.smartrefresh.layout.constant.RefreshState r0 = com.scwang.smartrefresh.layout.constant.RefreshState.RefreshReleased
            if (r2 == r0) goto L1a
            com.scwang.smartrefresh.header.waterdrop.WaterDropView r2 = r1.c
            r0 = 0
            int r3 = java.lang.Math.max(r3, r0)
            int r4 = r4 + r5
            r2.f(r3, r4)
            com.scwang.smartrefresh.header.waterdrop.WaterDropView r2 = r1.c
            r2.postInvalidate()
        L1a:
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

    public void i(l2.h r3, int r4, int r5) {
            r2 = this;
            com.scwang.smartrefresh.header.waterdrop.WaterDropView r4 = r2.c
            android.animation.Animator r4 = r4.a()
            com.scwang.smartrefresh.header.WaterDropHeader$a r5 = new com.scwang.smartrefresh.header.WaterDropHeader$a
            r5.<init>(r2)
            r4.addListener(r5)
            r4.start()
            android.view.ViewGroup r4 = r3.getLayout()
            com.scwang.smartrefresh.header.WaterDropHeader$b r5 = new com.scwang.smartrefresh.header.WaterDropHeader$b
            r5.<init>(r2, r3)
            r0 = 100
            r4.postDelayed(r5, r0)
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
    protected void onLayout(boolean r4, int r5, int r6, int r7, int r8) {
            r3 = this;
            int r4 = r3.getMeasuredWidth()
            com.scwang.smartrefresh.header.waterdrop.WaterDropView r5 = r3.c
            int r5 = r5.getMeasuredWidth()
            com.scwang.smartrefresh.header.waterdrop.WaterDropView r6 = r3.c
            int r6 = r6.getMeasuredHeight()
            int r4 = r4 / 2
            int r7 = r5 / 2
            int r8 = r4 - r7
            com.scwang.smartrefresh.header.waterdrop.WaterDropView r0 = r3.c
            r1 = 0
            int r2 = r8 + r5
            r0.layout(r8, r1, r2, r6)
            android.widget.ImageView r6 = r3.b
            int r6 = r6.getMeasuredWidth()
            android.widget.ImageView r8 = r3.b
            int r8 = r8.getMeasuredHeight()
            int r0 = r6 / 2
            int r4 = r4 - r0
            int r7 = r7 - r0
            int r0 = r7 + r8
            com.scwang.smartrefresh.header.waterdrop.WaterDropView r1 = r3.c
            int r1 = r1.getBottom()
            int r5 = r5 - r6
            int r5 = r5 / 2
            int r1 = r1 - r5
            if (r0 <= r1) goto L44
            com.scwang.smartrefresh.header.waterdrop.WaterDropView r7 = r3.c
            int r7 = r7.getBottom()
            int r7 = r7 - r5
            int r7 = r7 - r8
        L44:
            android.widget.ImageView r5 = r3.b
            int r6 = r6 + r4
            int r8 = r8 + r7
            r5.layout(r4, r7, r6, r8)
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r5, int r6) {
            r4 = this;
            super.onMeasure(r5, r6)
            android.widget.ImageView r0 = r4.b
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.ImageView r1 = r4.b
            int r2 = r0.width
            r3 = 1073741824(0x40000000, float:2.0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r3)
            int r0 = r0.height
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            r1.measure(r2, r0)
            com.scwang.smartrefresh.header.waterdrop.WaterDropView r0 = r4.c
            int r1 = android.view.View.MeasureSpec.getSize(r5)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r2)
            r0.measure(r1, r6)
            android.widget.ImageView r0 = r4.b
            int r0 = r0.getMeasuredWidth()
            com.scwang.smartrefresh.header.waterdrop.WaterDropView r1 = r4.c
            int r1 = r1.getMeasuredHeight()
            int r0 = java.lang.Math.max(r0, r1)
            android.widget.ImageView r1 = r4.b
            int r1 = r1.getMeasuredHeight()
            com.scwang.smartrefresh.header.waterdrop.WaterDropView r2 = r4.c
            int r2 = r2.getMeasuredHeight()
            int r1 = java.lang.Math.max(r1, r2)
            int r5 = android.view.View.resolveSize(r0, r5)
            int r6 = android.view.View.resolveSize(r1, r6)
            r4.setMeasuredDimension(r5, r6)
            return
    }

    public void q(l2.h r1, com.scwang.smartrefresh.layout.constant.RefreshState r2, com.scwang.smartrefresh.layout.constant.RefreshState r3) {
            r0 = this;
            r0.a = r3
            int[] r1 = com.scwang.smartrefresh.header.WaterDropHeader.c.a
            int r2 = r3.ordinal()
            r1 = r1[r2]
            r2 = 1
            r3 = 0
            if (r1 == r2) goto L2c
            r2 = 2
            if (r1 == r2) goto L26
            r2 = 4
            if (r1 == r2) goto L20
            r2 = 6
            if (r1 == r2) goto L18
            return
        L18:
            com.scwang.smartrefresh.header.waterdrop.WaterDropView r1 = r0.c
            r2 = 8
            r1.setVisibility(r2)
            return
        L20:
            com.scwang.smartrefresh.header.waterdrop.WaterDropView r1 = r0.c
            r1.setVisibility(r3)
            return
        L26:
            com.scwang.smartrefresh.header.waterdrop.WaterDropView r1 = r0.c
            r1.setVisibility(r3)
            return
        L2c:
            com.scwang.smartrefresh.header.waterdrop.WaterDropView r1 = r0.c
            r1.setVisibility(r3)
            return
    }

    @java.lang.Deprecated
    public void setPrimaryColors(@androidx.annotation.ColorInt int... r3) {
            r2 = this;
            int r0 = r3.length
            if (r0 <= 0) goto Lb
            com.scwang.smartrefresh.header.waterdrop.WaterDropView r0 = r2.c
            r1 = 0
            r3 = r3[r1]
            r0.setIndicatorColor(r3)
        Lb:
            return
    }

    public void t(l2.h r1, int r2, int r3) {
            r0 = this;
            return
    }

    public int w(l2.h r1, boolean r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    public void x(float r6, int r7, int r8, int r9) {
            r5 = this;
            com.scwang.smartrefresh.header.waterdrop.WaterDropView r6 = r5.c
            int r9 = r9 + r8
            r6.f(r7, r9)
            com.scwang.smartrefresh.header.waterdrop.WaterDropView r6 = r5.c
            r6.postInvalidate()
            float r6 = (float) r7
            r9 = 1065353216(0x3f800000, float:1.0)
            float r6 = r6 * r9
            float r0 = (float) r8
            float r6 = r6 / r0
            float r6 = java.lang.Math.abs(r6)
            float r6 = java.lang.Math.min(r9, r6)
            double r1 = (double) r6
            r3 = 4600877379321698714(0x3fd999999999999a, double:0.4)
            double r1 = r1 - r3
            r3 = 0
            double r1 = java.lang.Math.max(r1, r3)
            float r6 = (float) r1
            r1 = 1084227584(0x40a00000, float:5.0)
            float r6 = r6 * r1
            r1 = 1077936128(0x40400000, float:3.0)
            float r6 = r6 / r1
            int r7 = java.lang.Math.abs(r7)
            int r7 = r7 - r8
            float r7 = (float) r7
            r8 = 1073741824(0x40000000, float:2.0)
            float r1 = r0 * r8
            float r7 = java.lang.Math.min(r7, r1)
            float r7 = r7 / r0
            r0 = 0
            float r7 = java.lang.Math.max(r0, r7)
            r1 = 1082130432(0x40800000, float:4.0)
            float r7 = r7 / r1
            double r1 = (double) r7
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r3 = java.lang.Math.pow(r1, r3)
            double r1 = r1 - r3
            float r7 = (float) r1
            float r7 = r7 * r8
            r1 = 1061997773(0x3f4ccccd, float:0.8)
            float r2 = r6 * r1
            r3 = 1053609165(0x3ecccccd, float:0.4)
            float r3 = r3 * r6
            r4 = -1098907648(0xffffffffbe800000, float:-0.25)
            float r3 = r3 + r4
            float r7 = r7 * r8
            float r3 = r3 + r7
            r7 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 * r7
            com.scwang.smartrefresh.header.internal.MaterialProgressDrawable r7 = r5.e
            r8 = 1
            r7.m(r8)
            com.scwang.smartrefresh.header.internal.MaterialProgressDrawable r7 = r5.e
            float r8 = java.lang.Math.min(r1, r2)
            r7.k(r0, r8)
            com.scwang.smartrefresh.header.internal.MaterialProgressDrawable r7 = r5.e
            float r6 = java.lang.Math.min(r9, r6)
            r7.e(r6)
            com.scwang.smartrefresh.header.internal.MaterialProgressDrawable r6 = r5.e
            r6.h(r3)
            return
    }
}
