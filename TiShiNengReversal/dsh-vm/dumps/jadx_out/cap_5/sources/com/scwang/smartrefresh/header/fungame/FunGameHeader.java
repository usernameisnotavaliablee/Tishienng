package com.scwang.smartrefresh.header.fungame;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class FunGameHeader extends com.scwang.smartrefresh.header.fungame.FunGameBase implements l2.e {
    protected float l;
    private android.widget.RelativeLayout m;
    private android.widget.RelativeLayout n;
    private android.widget.TextView o;
    private android.widget.TextView p;
    private int q;
    private boolean r;
    private java.lang.String s;
    private java.lang.String t;
    private int u;
    private int v;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends android.animation.AnimatorListenerAdapter {
        final /* synthetic */ com.scwang.smartrefresh.header.fungame.FunGameHeader a;

        a(com.scwang.smartrefresh.header.fungame.FunGameHeader r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r2) {
                r1 = this;
                com.scwang.smartrefresh.header.fungame.FunGameHeader r2 = r1.a
                android.widget.TextView r2 = com.scwang.smartrefresh.header.fungame.FunGameHeader.B(r2)
                r0 = 8
                r2.setVisibility(r0)
                com.scwang.smartrefresh.header.fungame.FunGameHeader r2 = r1.a
                android.widget.TextView r2 = com.scwang.smartrefresh.header.fungame.FunGameHeader.C(r2)
                r2.setVisibility(r0)
                com.scwang.smartrefresh.header.fungame.FunGameHeader r2 = r1.a
                android.widget.RelativeLayout r2 = com.scwang.smartrefresh.header.fungame.FunGameHeader.D(r2)
                r2.setVisibility(r0)
                com.scwang.smartrefresh.header.fungame.FunGameHeader r2 = r1.a
                r2.I()
                return
        }
    }

    public FunGameHeader(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.l = r0
            r0 = 0
            r1.r = r0
            java.lang.String r0 = "下拉即将展开"
            r1.s = r0
            java.lang.String r0 = "拖动控制游戏"
            r1.t = r0
            r0 = 0
            r1.H(r2, r0)
            return
    }

    public FunGameHeader(android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.l = r0
            r0 = 0
            r1.r = r0
            java.lang.String r0 = "下拉即将展开"
            r1.s = r0
            java.lang.String r0 = "拖动控制游戏"
            r1.t = r0
            r1.H(r2, r3)
            return
    }

    public FunGameHeader(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r3 = 1065353216(0x3f800000, float:1.0)
            r0.l = r3
            r3 = 0
            r0.r = r3
            java.lang.String r3 = "下拉即将展开"
            r0.s = r3
            java.lang.String r3 = "拖动控制游戏"
            r0.t = r3
            r0.H(r1, r2)
            return
    }

    @androidx.annotation.RequiresApi(21)
    public FunGameHeader(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            r3 = 1065353216(0x3f800000, float:1.0)
            r0.l = r3
            r3 = 0
            r0.r = r3
            java.lang.String r3 = "下拉即将展开"
            r0.s = r3
            java.lang.String r3 = "拖动控制游戏"
            r0.t = r3
            r0.H(r1, r2)
            return
    }

    static /* synthetic */ android.widget.TextView B(com.scwang.smartrefresh.header.fungame.FunGameHeader r0) {
            android.widget.TextView r0 = r0.o
            return r0
    }

    static /* synthetic */ android.widget.TextView C(com.scwang.smartrefresh.header.fungame.FunGameHeader r0) {
            android.widget.TextView r0 = r0.p
            return r0
    }

    static /* synthetic */ android.widget.RelativeLayout D(com.scwang.smartrefresh.header.fungame.FunGameHeader r0) {
            android.widget.RelativeLayout r0 = r0.n
            return r0
    }

    private void E() {
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 2
            if (r0 >= r1) goto L4c
            boolean r0 = r4.isInEditMode()
            if (r0 != 0) goto L4c
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            int r1 = r4.b
            r2 = -1
            r0.<init>(r2, r1)
            android.widget.RelativeLayout r1 = r4.n
            r4.addView(r1, r0)
            android.widget.RelativeLayout r1 = r4.m
            r4.addView(r1, r0)
            int r0 = r4.b
            float r0 = (float) r0
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 * r1
            int r0 = (int) r0
            r4.q = r0
            android.widget.RelativeLayout$LayoutParams r0 = new android.widget.RelativeLayout$LayoutParams
            int r1 = r4.q
            r0.<init>(r2, r1)
            android.widget.RelativeLayout$LayoutParams r1 = new android.widget.RelativeLayout$LayoutParams
            int r3 = r4.q
            r1.<init>(r2, r3)
            int r2 = r4.b
            int r3 = r4.q
            int r2 = r2 - r3
            r1.topMargin = r2
            android.widget.RelativeLayout r2 = r4.m
            android.widget.TextView r3 = r4.o
            r2.addView(r3, r0)
            android.widget.RelativeLayout r0 = r4.m
            android.widget.TextView r2 = r4.p
            r0.addView(r2, r1)
        L4c:
            return
    }

    private android.widget.TextView F(android.content.Context r2, java.lang.String r3, int r4, int r5) {
            r1 = this;
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r2)
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0.setTextColor(r2)
            r2 = -1
            r0.setBackgroundColor(r2)
            r2 = r5 | 1
            r0.setGravity(r2)
            r2 = 0
            float r4 = (float) r4
            r0.setTextSize(r2, r4)
            r0.setText(r3)
            return r0
    }

    private void G(long r10) {
            r9 = this;
            android.widget.TextView r0 = r9.o
            float r1 = r0.getTranslationY()
            int r2 = r9.q
            int r2 = -r2
            float r2 = (float) r2
            r3 = 2
            float[] r4 = new float[r3]
            r5 = 0
            r4[r5] = r1
            r1 = 1
            r4[r1] = r2
            java.lang.String r2 = "translationY"
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r0, r2, r4)
            android.widget.TextView r4 = r9.p
            float r6 = r4.getTranslationY()
            int r7 = r9.q
            float r7 = (float) r7
            float[] r8 = new float[r3]
            r8[r5] = r6
            r8[r1] = r7
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r4, r2, r8)
            android.widget.RelativeLayout r4 = r9.n
            float r6 = r4.getAlpha()
            float[] r3 = new float[r3]
            r3[r5] = r6
            r5 = 0
            r3[r1] = r5
            java.lang.String r1 = "alpha"
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofFloat(r4, r1, r3)
            android.animation.AnimatorSet r3 = new android.animation.AnimatorSet
            r3.<init>()
            android.animation.AnimatorSet$Builder r0 = r3.play(r0)
            android.animation.AnimatorSet$Builder r0 = r0.with(r2)
            r0.with(r1)
            r0 = 800(0x320, double:3.953E-321)
            r3.setDuration(r0)
            r3.setStartDelay(r10)
            r3.start()
            com.scwang.smartrefresh.header.fungame.FunGameHeader$a r10 = new com.scwang.smartrefresh.header.fungame.FunGameHeader$a
            r10.<init>(r9)
            r3.addListener(r10)
            return
    }

    private void H(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            int[] r0 = com.scwang.smartrefresh.header.R.styleable.FunGameHeader
            android.content.res.TypedArray r5 = r4.obtainStyledAttributes(r5, r0)
            int r0 = com.scwang.smartrefresh.header.R.styleable.FunGameHeader_fgvMaskTopText
            boolean r1 = r5.hasValue(r0)
            if (r1 == 0) goto L14
            java.lang.String r0 = r5.getString(r0)
            r3.s = r0
        L14:
            int r0 = com.scwang.smartrefresh.header.R.styleable.FunGameHeader_fgvMaskBottomText
            boolean r1 = r5.hasValue(r0)
            if (r1 == 0) goto L22
            java.lang.String r0 = r5.getString(r0)
            r3.t = r0
        L22:
            android.content.res.Resources r0 = r3.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            r1 = 2
            r2 = 1098907648(0x41800000, float:16.0)
            float r0 = android.util.TypedValue.applyDimension(r1, r2, r0)
            int r0 = (int) r0
            r3.u = r0
            android.content.res.Resources r0 = r3.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = android.util.TypedValue.applyDimension(r1, r2, r0)
            int r0 = (int) r0
            r3.v = r0
            int r0 = com.scwang.smartrefresh.header.R.styleable.FunGameHeader_fgvBottomTextSize
            int r1 = r3.u
            int r1 = r5.getDimensionPixelSize(r0, r1)
            r3.u = r1
            int r1 = r3.v
            int r0 = r5.getDimensionPixelSize(r0, r1)
            r3.v = r0
            r5.recycle()
            android.widget.RelativeLayout r5 = new android.widget.RelativeLayout
            r5.<init>(r4)
            r3.m = r5
            android.widget.RelativeLayout r5 = new android.widget.RelativeLayout
            r5.<init>(r4)
            r3.n = r5
            java.lang.String r0 = "#3A3A3A"
            int r0 = android.graphics.Color.parseColor(r0)
            r5.setBackgroundColor(r0)
            java.lang.String r5 = r3.s
            int r0 = r3.u
            r1 = 80
            android.widget.TextView r5 = r3.F(r4, r5, r0, r1)
            r3.o = r5
            java.lang.String r5 = r3.t
            int r0 = r3.v
            r1 = 48
            android.widget.TextView r4 = r3.F(r4, r5, r0, r1)
            r3.p = r4
            r4 = 1056964608(0x3f000000, float:0.5)
            int r4 = com.scwang.smartrefresh.layout.util.c.b(r4)
            r5 = 1
            int r4 = java.lang.Math.max(r5, r4)
            float r4 = (float) r4
            r3.l = r4
            return
    }

    protected void I() {
            r0 = this;
            return
    }

    public void J() {
            r4 = this;
            r0 = 0
            r4.r = r0
            android.widget.TextView r1 = r4.o
            float r2 = r1.getTranslationY()
            int r3 = r4.q
            float r3 = (float) r3
            float r2 = r2 + r3
            r1.setTranslationY(r2)
            android.widget.TextView r1 = r4.p
            float r2 = r1.getTranslationY()
            int r3 = r4.q
            float r3 = (float) r3
            float r2 = r2 - r3
            r1.setTranslationY(r2)
            android.widget.RelativeLayout r1 = r4.n
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r2)
            android.widget.TextView r1 = r4.o
            r1.setVisibility(r0)
            android.widget.TextView r1 = r4.p
            r1.setVisibility(r0)
            android.widget.RelativeLayout r1 = r4.n
            r1.setVisibility(r0)
            return
    }

    public void K() {
            r2 = this;
            boolean r0 = r2.r
            if (r0 != 0) goto Lc
            r0 = 200(0xc8, double:9.9E-322)
            r2.G(r0)
            r0 = 1
            r2.r = r0
        Lc:
            return
    }

    @Override // com.scwang.smartrefresh.header.fungame.FunGameBase
    public void f(l2.g r1, int r2, int r3) {
            r0 = this;
            super.f(r1, r2, r3)
            r0.E()
            return
    }

    public void setBottomMaskViewText(java.lang.String r2) {
            r1 = this;
            r1.t = r2
            android.widget.TextView r0 = r1.p
            r0.setText(r2)
            return
    }

    @Override // com.scwang.smartrefresh.header.fungame.FunGameBase
    @java.lang.Deprecated
    public void setPrimaryColors(@androidx.annotation.ColorInt int... r5) {
            r4 = this;
            super.setPrimaryColors(r5)
            int r0 = r5.length
            if (r0 <= 0) goto L3c
            android.widget.TextView r0 = r4.o
            r1 = 0
            r2 = r5[r1]
            r0.setTextColor(r2)
            android.widget.TextView r0 = r4.p
            r1 = r5[r1]
            r0.setTextColor(r1)
            int r0 = r5.length
            r1 = 1
            if (r0 <= r1) goto L3c
            android.widget.RelativeLayout r0 = r4.n
            r2 = r5[r1]
            r3 = 200(0xc8, float:2.8E-43)
            int r2 = com.scwang.smartrefresh.layout.util.a.A(r2, r3)
            r0.setBackgroundColor(r2)
            android.widget.TextView r0 = r4.o
            r2 = r5[r1]
            int r2 = com.scwang.smartrefresh.layout.util.a.A(r2, r3)
            r0.setBackgroundColor(r2)
            android.widget.TextView r0 = r4.p
            r5 = r5[r1]
            int r5 = com.scwang.smartrefresh.layout.util.a.A(r5, r3)
            r0.setBackgroundColor(r5)
        L3c:
            return
    }

    public void setTopMaskViewText(java.lang.String r2) {
            r1 = this;
            r1.s = r2
            android.widget.TextView r0 = r1.o
            r0.setText(r2)
            return
    }

    @Override // com.scwang.smartrefresh.header.fungame.FunGameBase
    public void t(l2.h r1, int r2, int r3) {
            r0 = this;
            super.t(r1, r2, r3)
            r0.K()
            return
    }

    @Override // com.scwang.smartrefresh.header.fungame.FunGameBase
    public int w(l2.h r2, boolean r3) {
            r1 = this;
            boolean r0 = r1.g
            if (r0 != 0) goto L7
            r1.J()
        L7:
            int r2 = super.w(r2, r3)
            return r2
    }
}
