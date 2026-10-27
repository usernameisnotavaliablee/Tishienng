package com.scwang.smartrefresh.header.fungame;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class FunGameBase extends android.widget.FrameLayout implements l2.e {
    protected int a;
    protected int b;
    protected int c;
    protected float d;
    protected boolean e;
    protected boolean f;
    protected boolean g;
    protected com.scwang.smartrefresh.layout.constant.RefreshState h;
    protected l2.g i;
    protected l2.c j;
    boolean k;

    public FunGameBase(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r0.m(r1)
            return
    }

    public FunGameBase(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.m(r1)
            return
    }

    public FunGameBase(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.m(r1)
            return
    }

    @androidx.annotation.RequiresApi(21)
    public FunGameBase(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            r0.m(r1)
            return
    }

    private void m(android.content.Context r1) {
            r0 = this;
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r1 = r1.heightPixels
            r0.c = r1
            return
    }

    protected void A() {
            r4 = this;
            boolean r0 = r4.g
            if (r0 != 0) goto L3b
            r0 = 1
            r4.g = r0
            l2.g r0 = r4.i
            l2.c r0 = r0.m()
            r4.j = r0
            l2.g r0 = r4.i
            l2.h r0 = r0.c()
            boolean r0 = r0.y()
            r4.k = r0
            l2.g r0 = r4.i
            l2.h r0 = r0.c()
            r1 = 0
            r0.t(r1)
            l2.c r0 = r4.j
            android.view.View r0 = r0.getView()
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r2 = r1.topMargin
            int r3 = r4.b
            int r2 = r2 + r3
            r1.topMargin = r2
            r0.setLayoutParams(r1)
        L3b:
            return
    }

    public void f(l2.g r1, int r2, int r3) {
            r0 = this;
            r0.i = r1
            r0.b = r2
            int r3 = r0.a
            int r3 = r3 - r2
            float r2 = (float) r3
            r0.setTranslationY(r2)
            r2 = 1
            r1.i(r2)
            return
    }

    public void g(float r1, int r2, int r3, int r4) {
            r0 = this;
            r0.x(r1, r2, r3, r4)
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

    protected void n(float r1, int r2, int r3, int r4) {
            r0 = this;
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            r0 = 0
            r1.i = r0
            r1.j = r0
            return
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent r3) {
            r2 = this;
            com.scwang.smartrefresh.layout.constant.RefreshState r0 = r2.h
            com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.Refreshing
            if (r0 == r1) goto Lf
            boolean r3 = super.onInterceptTouchEvent(r3)
            if (r3 == 0) goto Ld
            goto Lf
        Ld:
            r3 = 0
            return r3
        Lf:
            r3 = 1
            return r3
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r22) {
            r21 = this;
            r0 = r21
            com.scwang.smartrefresh.layout.constant.RefreshState r1 = r0.h
            com.scwang.smartrefresh.layout.constant.RefreshState r2 = com.scwang.smartrefresh.layout.constant.RefreshState.Refreshing
            if (r1 == r2) goto L12
            com.scwang.smartrefresh.layout.constant.RefreshState r2 = com.scwang.smartrefresh.layout.constant.RefreshState.RefreshFinish
            if (r1 != r2) goto Ld
            goto L12
        Ld:
            boolean r1 = super.onTouchEvent(r22)
            return r1
        L12:
            boolean r1 = r0.g
            if (r1 != 0) goto L19
            r0.A()
        L19:
            int r1 = r22.getAction()
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto Lae
            if (r1 == r3) goto L9b
            r4 = 3
            r5 = 2
            if (r1 == r5) goto L2d
            if (r1 == r4) goto L9b
            goto Lb9
        L2d:
            float r1 = r22.getRawY()
            float r6 = r0.d
            float r1 = r1 - r6
            r6 = 0
            r7 = 4636737291354636288(0x4059000000000000, double:100.0)
            r13 = 0
            int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r6 < 0) goto L6b
            int r6 = r0.b
            int r6 = r6 * 2
            r15 = 3
            r16 = 2
            double r4 = (double) r6
            int r6 = r0.c
            int r6 = r6 * 2
            int r6 = r6 / r15
            r17 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r9 = (double) r6
            r19 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r11 = (double) r1
            double r11 = r11 * r19
            double r11 = java.lang.Math.max(r13, r11)
            double r13 = -r11
            double r13 = r13 / r9
            double r6 = java.lang.Math.pow(r7, r13)
            double r9 = r17 - r6
            double r4 = r4 * r9
            double r4 = java.lang.Math.min(r4, r11)
            l2.g r1 = r0.i
            int r4 = (int) r4
            r1.k(r4, r2)
            goto Lb9
        L6b:
            r15 = 3
            r16 = 2
            r17 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r19 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r4 = r0.b
            int r4 = r4 * 2
            double r4 = (double) r4
            int r6 = r0.c
            int r6 = r6 * 2
            int r6 = r6 / r15
            double r9 = (double) r6
            double r11 = (double) r1
            double r11 = r11 * r19
            double r11 = java.lang.Math.min(r13, r11)
            double r11 = -r11
            double r13 = -r11
            double r13 = r13 / r9
            double r6 = java.lang.Math.pow(r7, r13)
            double r9 = r17 - r6
            double r4 = r4 * r9
            double r4 = java.lang.Math.min(r4, r11)
            double r4 = -r4
            l2.g r1 = r0.i
            int r4 = (int) r4
            r1.k(r4, r2)
            goto Lb9
        L9b:
            r0.z()
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.d = r1
            boolean r1 = r0.e
            if (r1 == 0) goto Lb9
            l2.g r1 = r0.i
            int r2 = r0.b
            r1.k(r2, r3)
            goto Lb9
        Lae:
            float r1 = r22.getRawY()
            r0.d = r1
            l2.g r1 = r0.i
            r1.k(r2, r3)
        Lb9:
            return r3
    }

    public void q(l2.h r1, com.scwang.smartrefresh.layout.constant.RefreshState r2, com.scwang.smartrefresh.layout.constant.RefreshState r3) {
            r0 = this;
            r0.h = r3
            return
    }

    @java.lang.Deprecated
    public void setPrimaryColors(@androidx.annotation.ColorInt int... r1) {
            r0 = this;
            return
    }

    @Override // android.view.View
    public void setTranslationY(float r2) {
            r1 = this;
            boolean r0 = r1.isInEditMode()
            if (r0 != 0) goto L9
            super.setTranslationY(r2)
        L9:
            return
    }

    public void t(l2.h r1, int r2, int r3) {
            r0 = this;
            r1 = 0
            r0.e = r1
            return
    }

    public int w(l2.h r4, boolean r5) {
            r3 = this;
            r3.f = r5
            boolean r0 = r3.e
            r1 = 0
            if (r0 != 0) goto L21
            r0 = 1
            r3.e = r0
            boolean r0 = r3.g
            if (r0 == 0) goto L21
            float r0 = r3.d
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L1d
            r3.z()
            r3.w(r4, r5)
            return r1
        L1d:
            r4 = 2147483647(0x7fffffff, float:NaN)
            return r4
        L21:
            return r1
    }

    public void x(float r2, int r3, int r4, int r5) {
            r1 = this;
            boolean r0 = r1.g
            if (r0 == 0) goto L8
            r1.n(r2, r3, r4, r5)
            return
        L8:
            r1.a = r3
            int r2 = r1.b
            int r3 = r3 - r2
            float r2 = (float) r3
            r1.setTranslationY(r2)
            return
    }

    protected void z() {
            r4 = this;
            boolean r0 = r4.e
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L51
            r4.g = r2
            l2.g r0 = r4.i
            l2.h r0 = r0.c()
            boolean r3 = r4.k
            r0.t(r3)
            float r0 = r4.d
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L33
            l2.g r0 = r4.i
            l2.h r0 = r0.c()
            boolean r1 = r4.f
            r4.w(r0, r1)
            l2.g r0 = r4.i
            com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.RefreshFinish
            r0.e(r1)
            l2.g r0 = r4.i
            r0.b(r2)
            goto L3a
        L33:
            l2.g r0 = r4.i
            int r2 = r4.b
            r0.k(r2, r1)
        L3a:
            l2.c r0 = r4.j
            android.view.View r0 = r0.getView()
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r2 = r1.topMargin
            int r3 = r4.b
            int r2 = r2 - r3
            r1.topMargin = r2
            r0.setLayoutParams(r1)
            return
        L51:
            l2.g r0 = r4.i
            r0.k(r2, r1)
            return
    }
}
