package com.scwang.smartrefresh.layout.footer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class ClassicsFooter extends android.widget.RelativeLayout implements l2.d {
    public static java.lang.String m = "上拉加载更多";
    public static java.lang.String n = "释放立即加载";
    public static java.lang.String o = "正在加载...";
    public static java.lang.String p = "正在刷新...";
    public static java.lang.String q = "加载完成";
    public static java.lang.String r = "加载失败";
    public static java.lang.String s = "全部加载完成";
    protected android.widget.TextView a;
    protected android.widget.ImageView b;
    protected android.widget.ImageView c;
    protected com.scwang.smartrefresh.layout.internal.pathview.b d;
    protected com.scwang.smartrefresh.layout.internal.a e;
    protected com.scwang.smartrefresh.layout.constant.SpinnerStyle f;
    protected l2.g g;
    protected int h;
    protected int i;
    protected boolean j;
    protected int k;
    protected int l;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a = null;

        static {
                com.scwang.smartrefresh.layout.constant.RefreshState[] r0 = com.scwang.smartrefresh.layout.constant.RefreshState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.scwang.smartrefresh.layout.footer.ClassicsFooter.a.a = r0
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.None     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.scwang.smartrefresh.layout.footer.ClassicsFooter.a.a     // Catch: java.lang.NoSuchFieldError -> L1d
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.PullToUpLoad     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.scwang.smartrefresh.layout.footer.ClassicsFooter.a.a     // Catch: java.lang.NoSuchFieldError -> L28
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.Loading     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.scwang.smartrefresh.layout.footer.ClassicsFooter.a.a     // Catch: java.lang.NoSuchFieldError -> L33
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.LoadReleased     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.scwang.smartrefresh.layout.footer.ClassicsFooter.a.a     // Catch: java.lang.NoSuchFieldError -> L3e
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.ReleaseToLoad     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = com.scwang.smartrefresh.layout.footer.ClassicsFooter.a.a     // Catch: java.lang.NoSuchFieldError -> L49
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.Refreshing     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    static {
            return
    }

    public ClassicsFooter(android.content.Context r3) {
            r2 = this;
            r2.<init>(r3)
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r0 = com.scwang.smartrefresh.layout.constant.SpinnerStyle.Translate
            r2.f = r0
            r0 = 500(0x1f4, float:7.0E-43)
            r2.h = r0
            r0 = 0
            r2.i = r0
            r2.j = r0
            r1 = 20
            r2.k = r1
            r2.l = r1
            r1 = 0
            r2.m(r3, r1, r0)
            return
    }

    public ClassicsFooter(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r2.<init>(r3, r4)
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r0 = com.scwang.smartrefresh.layout.constant.SpinnerStyle.Translate
            r2.f = r0
            r0 = 500(0x1f4, float:7.0E-43)
            r2.h = r0
            r0 = 0
            r2.i = r0
            r2.j = r0
            r1 = 20
            r2.k = r1
            r2.l = r1
            r2.m(r3, r4, r0)
            return
    }

    public ClassicsFooter(android.content.Context r2, android.util.AttributeSet r3, int r4) {
            r1 = this;
            r1.<init>(r2, r3, r4)
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r0 = com.scwang.smartrefresh.layout.constant.SpinnerStyle.Translate
            r1.f = r0
            r0 = 500(0x1f4, float:7.0E-43)
            r1.h = r0
            r0 = 0
            r1.i = r0
            r1.j = r0
            r0 = 20
            r1.k = r0
            r1.l = r0
            r1.m(r2, r3, r4)
            return
    }

    private void m(android.content.Context r8, android.util.AttributeSet r9, int r10) {
            r7 = this;
            com.scwang.smartrefresh.layout.util.c r10 = new com.scwang.smartrefresh.layout.util.c
            r10.<init>()
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r8)
            r7.a = r0
            r1 = 16908312(0x1020018, float:2.3877296E-38)
            r0.setId(r1)
            android.widget.TextView r0 = r7.a
            r2 = -10066330(0xffffffffff666666, float:-3.0625412E38)
            r0.setTextColor(r2)
            android.widget.TextView r0 = r7.a
            java.lang.String r3 = com.scwang.smartrefresh.layout.footer.ClassicsFooter.m
            r0.setText(r3)
            android.widget.RelativeLayout$LayoutParams r0 = new android.widget.RelativeLayout$LayoutParams
            r3 = -2
            r0.<init>(r3, r3)
            r3 = 13
            r0.addRule(r3)
            android.widget.TextView r3 = r7.a
            r7.addView(r3, r0)
            android.widget.RelativeLayout$LayoutParams r0 = new android.widget.RelativeLayout$LayoutParams
            r3 = 1101004800(0x41a00000, float:20.0)
            int r4 = r10.a(r3)
            int r5 = r10.a(r3)
            r0.<init>(r4, r5)
            r4 = 15
            r0.addRule(r4)
            r5 = 0
            r0.addRule(r5, r1)
            android.widget.ImageView r6 = new android.widget.ImageView
            r6.<init>(r8)
            r7.b = r6
            r7.addView(r6, r0)
            android.widget.RelativeLayout$LayoutParams r6 = new android.widget.RelativeLayout$LayoutParams
            r6.<init>(r0)
            r6.addRule(r4)
            r6.addRule(r5, r1)
            android.widget.ImageView r1 = new android.widget.ImageView
            r1.<init>(r8)
            r7.c = r1
            android.view.ViewPropertyAnimator r1 = r1.animate()
            android.view.animation.LinearInterpolator r4 = new android.view.animation.LinearInterpolator
            r4.<init>()
            r1.setInterpolator(r4)
            android.widget.ImageView r1 = r7.c
            r7.addView(r1, r6)
            boolean r1 = r7.isInEditMode()
            r4 = 8
            if (r1 != 0) goto L84
            android.widget.ImageView r1 = r7.c
            r1.setVisibility(r4)
            goto L89
        L84:
            android.widget.ImageView r1 = r7.b
            r1.setVisibility(r4)
        L89:
            int[] r1 = com.scwang.smartrefresh.layout.R.styleable.ClassicsFooter
            android.content.res.TypedArray r8 = r8.obtainStyledAttributes(r9, r1)
            int r9 = com.scwang.smartrefresh.layout.R.styleable.ClassicsFooter_srlDrawableMarginRight
            int r1 = r10.a(r3)
            int r9 = r8.getDimensionPixelSize(r9, r1)
            r6.rightMargin = r9
            r0.rightMargin = r9
            int r9 = com.scwang.smartrefresh.layout.R.styleable.ClassicsHeader_srlDrawableArrowSize
            int r1 = r0.width
            int r1 = r8.getLayoutDimension(r9, r1)
            r0.width = r1
            int r1 = r0.height
            int r9 = r8.getLayoutDimension(r9, r1)
            r0.height = r9
            int r9 = com.scwang.smartrefresh.layout.R.styleable.ClassicsHeader_srlDrawableProgressSize
            int r1 = r6.width
            int r1 = r8.getLayoutDimension(r9, r1)
            r6.width = r1
            int r1 = r6.height
            int r9 = r8.getLayoutDimension(r9, r1)
            r6.height = r9
            int r9 = com.scwang.smartrefresh.layout.R.styleable.ClassicsHeader_srlDrawableSize
            int r1 = r0.width
            int r1 = r8.getLayoutDimension(r9, r1)
            r0.width = r1
            int r1 = r0.height
            int r1 = r8.getLayoutDimension(r9, r1)
            r0.height = r1
            int r0 = r6.width
            int r0 = r8.getLayoutDimension(r9, r0)
            r6.width = r0
            int r0 = r6.height
            int r9 = r8.getLayoutDimension(r9, r0)
            r6.height = r9
            int r9 = com.scwang.smartrefresh.layout.R.styleable.ClassicsFooter_srlFinishDuration
            int r0 = r7.h
            int r9 = r8.getInt(r9, r0)
            r7.h = r9
            com.scwang.smartrefresh.layout.constant.SpinnerStyle[] r9 = com.scwang.smartrefresh.layout.constant.SpinnerStyle.values()
            int r0 = com.scwang.smartrefresh.layout.R.styleable.ClassicsFooter_srlClassicsSpinnerStyle
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r1 = r7.f
            int r1 = r1.ordinal()
            int r0 = r8.getInt(r0, r1)
            r9 = r9[r0]
            r7.f = r9
            int r9 = com.scwang.smartrefresh.layout.R.styleable.ClassicsFooter_srlDrawableArrow
            boolean r0 = r8.hasValue(r9)
            if (r0 == 0) goto L113
            android.widget.ImageView r0 = r7.b
            android.graphics.drawable.Drawable r9 = r8.getDrawable(r9)
            r0.setImageDrawable(r9)
            goto L133
        L113:
            com.scwang.smartrefresh.layout.internal.pathview.b r9 = new com.scwang.smartrefresh.layout.internal.pathview.b
            r9.<init>()
            r7.d = r9
            int[] r0 = new int[]{r2}
            r9.h(r0)
            com.scwang.smartrefresh.layout.internal.pathview.b r9 = r7.d
            java.lang.String r0 = "M20,12l-1.41,-1.41L13,16.17V4h-2v12.17l-5.58,-5.59L4,12l8,8 8,-8z"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r9.i(r0)
            android.widget.ImageView r9 = r7.b
            com.scwang.smartrefresh.layout.internal.pathview.b r0 = r7.d
            r9.setImageDrawable(r0)
        L133:
            int r9 = com.scwang.smartrefresh.layout.R.styleable.ClassicsFooter_srlDrawableProgress
            boolean r0 = r8.hasValue(r9)
            if (r0 == 0) goto L145
            android.widget.ImageView r0 = r7.c
            android.graphics.drawable.Drawable r9 = r8.getDrawable(r9)
            r0.setImageDrawable(r9)
            goto L156
        L145:
            com.scwang.smartrefresh.layout.internal.a r9 = new com.scwang.smartrefresh.layout.internal.a
            r9.<init>()
            r7.e = r9
            r9.c(r2)
            android.widget.ImageView r9 = r7.c
            com.scwang.smartrefresh.layout.internal.a r0 = r7.e
            r9.setImageDrawable(r0)
        L156:
            int r9 = com.scwang.smartrefresh.layout.R.styleable.ClassicsFooter_srlTextSizeTitle
            boolean r0 = r8.hasValue(r9)
            r1 = 1098907648(0x41800000, float:16.0)
            if (r0 == 0) goto L16f
            android.widget.TextView r0 = r7.a
            int r1 = com.scwang.smartrefresh.layout.util.c.b(r1)
            int r9 = r8.getDimensionPixelSize(r9, r1)
            float r9 = (float) r9
            r0.setTextSize(r5, r9)
            goto L174
        L16f:
            android.widget.TextView r9 = r7.a
            r9.setTextSize(r1)
        L174:
            int r9 = com.scwang.smartrefresh.layout.R.styleable.ClassicsFooter_srlPrimaryColor
            boolean r0 = r8.hasValue(r9)
            if (r0 == 0) goto L183
            int r9 = r8.getColor(r9, r5)
            r7.M(r9)
        L183:
            int r9 = com.scwang.smartrefresh.layout.R.styleable.ClassicsFooter_srlAccentColor
            boolean r0 = r8.hasValue(r9)
            if (r0 == 0) goto L192
            int r9 = r8.getColor(r9, r5)
            r7.n(r9)
        L192:
            r8.recycle()
            int r8 = r7.getPaddingTop()
            if (r8 != 0) goto L1d1
            int r8 = r7.getPaddingBottom()
            if (r8 != 0) goto L1b9
            int r8 = r7.getPaddingLeft()
            int r9 = r10.a(r3)
            r7.k = r9
            int r0 = r7.getPaddingRight()
            int r10 = r10.a(r3)
            r7.l = r10
            r7.setPadding(r8, r9, r0, r10)
            return
        L1b9:
            int r8 = r7.getPaddingLeft()
            int r9 = r10.a(r3)
            r7.k = r9
            int r10 = r7.getPaddingRight()
            int r0 = r7.getPaddingBottom()
            r7.l = r0
            r7.setPadding(r8, r9, r10, r0)
            return
        L1d1:
            int r8 = r7.getPaddingBottom()
            if (r8 != 0) goto L1ef
            int r8 = r7.getPaddingLeft()
            int r9 = r7.getPaddingTop()
            r7.k = r9
            int r0 = r7.getPaddingRight()
            int r10 = r10.a(r3)
            r7.l = r10
            r7.setPadding(r8, r9, r0, r10)
            return
        L1ef:
            int r8 = r7.getPaddingTop()
            r7.k = r8
            int r8 = r7.getPaddingBottom()
            r7.l = r8
            return
    }

    public com.scwang.smartrefresh.layout.footer.ClassicsFooter A(android.graphics.Bitmap r2) {
            r1 = this;
            r0 = 0
            r1.d = r0
            android.widget.ImageView r0 = r1.b
            r0.setImageBitmap(r2)
            return r1
    }

    public com.scwang.smartrefresh.layout.footer.ClassicsFooter B(android.graphics.drawable.Drawable r2) {
            r1 = this;
            r0 = 0
            r1.d = r0
            android.widget.ImageView r0 = r1.b
            r0.setImageDrawable(r2)
            return r1
    }

    public com.scwang.smartrefresh.layout.footer.ClassicsFooter C(@androidx.annotation.DrawableRes int r2) {
            r1 = this;
            r0 = 0
            r1.d = r0
            android.widget.ImageView r0 = r1.b
            r0.setImageResource(r2)
            return r1
    }

    public com.scwang.smartrefresh.layout.footer.ClassicsFooter D(float r1) {
            r0 = this;
            int r1 = com.scwang.smartrefresh.layout.util.c.b(r1)
            com.scwang.smartrefresh.layout.footer.ClassicsFooter r1 = r0.E(r1)
            return r1
    }

    public com.scwang.smartrefresh.layout.footer.ClassicsFooter E(int r2) {
            r1 = this;
            android.widget.ImageView r0 = r1.b
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            r0.width = r2
            r0.height = r2
            android.widget.ImageView r2 = r1.b
            r2.setLayoutParams(r0)
            return r1
    }

    public com.scwang.smartrefresh.layout.footer.ClassicsFooter F(float r1) {
            r0 = this;
            int r1 = com.scwang.smartrefresh.layout.util.c.b(r1)
            com.scwang.smartrefresh.layout.footer.ClassicsFooter r1 = r0.G(r1)
            return r1
    }

    public com.scwang.smartrefresh.layout.footer.ClassicsFooter G(int r3) {
            r2 = this;
            android.widget.ImageView r0 = r2.b
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            android.widget.ImageView r1 = r2.c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            r1.rightMargin = r3
            r0.rightMargin = r3
            android.widget.ImageView r3 = r2.b
            r3.setLayoutParams(r0)
            android.widget.ImageView r3 = r2.c
            r3.setLayoutParams(r1)
            return r2
    }

    public com.scwang.smartrefresh.layout.footer.ClassicsFooter H(float r1) {
            r0 = this;
            int r1 = com.scwang.smartrefresh.layout.util.c.b(r1)
            com.scwang.smartrefresh.layout.footer.ClassicsFooter r1 = r0.I(r1)
            return r1
    }

    public com.scwang.smartrefresh.layout.footer.ClassicsFooter I(int r2) {
            r1 = this;
            android.widget.ImageView r0 = r1.c
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            r0.width = r2
            r0.height = r2
            android.widget.ImageView r2 = r1.c
            r2.setLayoutParams(r0)
            return r1
    }

    public com.scwang.smartrefresh.layout.footer.ClassicsFooter J(float r1) {
            r0 = this;
            int r1 = com.scwang.smartrefresh.layout.util.c.b(r1)
            com.scwang.smartrefresh.layout.footer.ClassicsFooter r1 = r0.K(r1)
            return r1
    }

    public com.scwang.smartrefresh.layout.footer.ClassicsFooter K(int r3) {
            r2 = this;
            android.widget.ImageView r0 = r2.b
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.ImageView r1 = r2.c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            r1.width = r3
            r0.width = r3
            r1.height = r3
            r0.height = r3
            android.widget.ImageView r3 = r2.b
            r3.setLayoutParams(r0)
            android.widget.ImageView r3 = r2.c
            r3.setLayoutParams(r1)
            return r2
    }

    public com.scwang.smartrefresh.layout.footer.ClassicsFooter L(int r1) {
            r0 = this;
            r0.h = r1
            return r0
    }

    public com.scwang.smartrefresh.layout.footer.ClassicsFooter M(@androidx.annotation.ColorInt int r2) {
            r1 = this;
            r1.i = r2
            r1.setBackgroundColor(r2)
            l2.g r2 = r1.g
            if (r2 == 0) goto Le
            int r0 = r1.i
            r2.n(r0)
        Le:
            return r1
    }

    public com.scwang.smartrefresh.layout.footer.ClassicsFooter N(@androidx.annotation.ColorRes int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            int r2 = androidx.core.content.ContextCompat.getColor(r0, r2)
            r1.M(r2)
            return r1
    }

    public com.scwang.smartrefresh.layout.footer.ClassicsFooter O(android.graphics.Bitmap r2) {
            r1 = this;
            r0 = 0
            r1.e = r0
            android.widget.ImageView r0 = r1.c
            r0.setImageBitmap(r2)
            return r1
    }

    public com.scwang.smartrefresh.layout.footer.ClassicsFooter P(android.graphics.drawable.Drawable r2) {
            r1 = this;
            r0 = 0
            r1.e = r0
            android.widget.ImageView r0 = r1.c
            r0.setImageDrawable(r2)
            return r1
    }

    public com.scwang.smartrefresh.layout.footer.ClassicsFooter Q(@androidx.annotation.DrawableRes int r2) {
            r1 = this;
            r0 = 0
            r1.e = r0
            android.widget.ImageView r0 = r1.c
            r0.setImageResource(r2)
            return r1
    }

    public com.scwang.smartrefresh.layout.footer.ClassicsFooter R(com.scwang.smartrefresh.layout.constant.SpinnerStyle r1) {
            r0 = this;
            r0.f = r1
            return r0
    }

    public com.scwang.smartrefresh.layout.footer.ClassicsFooter S(float r2) {
            r1 = this;
            android.widget.TextView r0 = r1.a
            r0.setTextSize(r2)
            l2.g r2 = r1.g
            if (r2 == 0) goto Lc
            r2.o()
        Lc:
            return r1
    }

    public com.scwang.smartrefresh.layout.footer.ClassicsFooter T(int r2, float r3) {
            r1 = this;
            android.widget.TextView r0 = r1.a
            r0.setTextSize(r2, r3)
            l2.g r2 = r1.g
            if (r2 == 0) goto Lc
            r2.o()
        Lc:
            return r1
    }

    public boolean b(boolean r4) {
            r3 = this;
            boolean r0 = r3.j
            if (r0 == r4) goto L41
            r3.j = r4
            r0 = 8
            if (r4 == 0) goto L17
            android.widget.TextView r4 = r3.a
            java.lang.String r1 = com.scwang.smartrefresh.layout.footer.ClassicsFooter.s
            r4.setText(r1)
            android.widget.ImageView r4 = r3.b
            r4.setVisibility(r0)
            goto L24
        L17:
            android.widget.TextView r4 = r3.a
            java.lang.String r1 = com.scwang.smartrefresh.layout.footer.ClassicsFooter.m
            r4.setText(r1)
            android.widget.ImageView r4 = r3.b
            r1 = 0
            r4.setVisibility(r1)
        L24:
            com.scwang.smartrefresh.layout.internal.a r4 = r3.e
            if (r4 == 0) goto L2c
            r4.stop()
            goto L3c
        L2c:
            android.widget.ImageView r4 = r3.c
            android.view.ViewPropertyAnimator r4 = r4.animate()
            r1 = 0
            android.view.ViewPropertyAnimator r4 = r4.rotation(r1)
            r1 = 300(0x12c, double:1.48E-321)
            r4.setDuration(r1)
        L3c:
            android.widget.ImageView r4 = r3.c
            r4.setVisibility(r0)
        L41:
            r4 = 1
            return r4
    }

    public void c(float r1, int r2, int r3, int r4) {
            r0 = this;
            return
    }

    public void f(l2.g r1, int r2, int r3) {
            r0 = this;
            r0.g = r1
            int r2 = r0.i
            r1.n(r2)
            return
    }

    public android.widget.ImageView getArrowView() {
            r1 = this;
            android.widget.ImageView r0 = r1.b
            return r0
    }

    public android.widget.ImageView getProgressView() {
            r1 = this;
            android.widget.ImageView r0 = r1.c
            return r0
    }

    public com.scwang.smartrefresh.layout.constant.SpinnerStyle getSpinnerStyle() {
            r1 = this;
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r0 = r1.f
            return r0
    }

    public android.widget.TextView getTitleText() {
            r1 = this;
            android.widget.TextView r0 = r1.a
            return r0
    }

    @androidx.annotation.NonNull
    public android.view.View getView() {
            r0 = this;
            return r0
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

    public com.scwang.smartrefresh.layout.footer.ClassicsFooter n(@androidx.annotation.ColorInt int r2) {
            r1 = this;
            android.widget.TextView r0 = r1.a
            r0.setTextColor(r2)
            com.scwang.smartrefresh.layout.internal.a r0 = r1.e
            if (r0 == 0) goto Lc
            r0.c(r2)
        Lc:
            com.scwang.smartrefresh.layout.internal.pathview.b r0 = r1.d
            if (r0 == 0) goto L17
            int[] r2 = new int[]{r2}
            r0.h(r2)
        L17:
            return r1
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int r5, int r6) {
            r4 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 != r1) goto L15
            int r0 = r4.getPaddingLeft()
            int r1 = r4.getPaddingRight()
            r2 = 0
            r4.setPadding(r0, r2, r1, r2)
            goto L24
        L15:
            int r0 = r4.getPaddingLeft()
            int r1 = r4.k
            int r2 = r4.getPaddingRight()
            int r3 = r4.l
            r4.setPadding(r0, r1, r2, r3)
        L24:
            super.onMeasure(r5, r6)
            return
    }

    public void p(l2.h r1, int r2, int r3) {
            r0 = this;
            boolean r1 = r0.j
            if (r1 != 0) goto L25
            android.widget.ImageView r1 = r0.c
            r2 = 0
            r1.setVisibility(r2)
            com.scwang.smartrefresh.layout.internal.a r1 = r0.e
            if (r1 == 0) goto L12
            r1.start()
            return
        L12:
            android.widget.ImageView r1 = r0.c
            android.view.ViewPropertyAnimator r1 = r1.animate()
            r2 = 1192009728(0x470ca000, float:36000.0)
            android.view.ViewPropertyAnimator r1 = r1.rotation(r2)
            r2 = 100000(0x186a0, double:4.94066E-319)
            r1.setDuration(r2)
        L25:
            return
    }

    public void q(l2.h r1, com.scwang.smartrefresh.layout.constant.RefreshState r2, com.scwang.smartrefresh.layout.constant.RefreshState r3) {
            r0 = this;
            boolean r1 = r0.j
            if (r1 != 0) goto L5b
            int[] r1 = com.scwang.smartrefresh.layout.footer.ClassicsFooter.a.a
            int r2 = r3.ordinal()
            r1 = r1[r2]
            r2 = 8
            switch(r1) {
                case 1: goto L43;
                case 2: goto L49;
                case 3: goto L36;
                case 4: goto L36;
                case 5: goto L24;
                case 6: goto L12;
                default: goto L11;
            }
        L11:
            goto L5b
        L12:
            android.widget.TextView r1 = r0.a
            java.lang.String r3 = com.scwang.smartrefresh.layout.footer.ClassicsFooter.p
            r1.setText(r3)
            android.widget.ImageView r1 = r0.c
            r1.setVisibility(r2)
            android.widget.ImageView r1 = r0.b
            r1.setVisibility(r2)
            return
        L24:
            android.widget.TextView r1 = r0.a
            java.lang.String r2 = com.scwang.smartrefresh.layout.footer.ClassicsFooter.n
            r1.setText(r2)
            android.widget.ImageView r1 = r0.b
            android.view.ViewPropertyAnimator r1 = r1.animate()
            r2 = 0
            r1.rotation(r2)
            return
        L36:
            android.widget.ImageView r1 = r0.b
            r1.setVisibility(r2)
            android.widget.TextView r1 = r0.a
            java.lang.String r2 = com.scwang.smartrefresh.layout.footer.ClassicsFooter.o
            r1.setText(r2)
            return
        L43:
            android.widget.ImageView r1 = r0.b
            r2 = 0
            r1.setVisibility(r2)
        L49:
            android.widget.TextView r1 = r0.a
            java.lang.String r2 = com.scwang.smartrefresh.layout.footer.ClassicsFooter.m
            r1.setText(r2)
            android.widget.ImageView r1 = r0.b
            android.view.ViewPropertyAnimator r1 = r1.animate()
            r2 = 1127481344(0x43340000, float:180.0)
            r1.rotation(r2)
        L5b:
            return
    }

    @java.lang.Deprecated
    public void setPrimaryColors(@androidx.annotation.ColorInt int... r4) {
            r3 = this;
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r0 = r3.f
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r1 = com.scwang.smartrefresh.layout.constant.SpinnerStyle.FixedBehind
            if (r0 != r1) goto L2c
            int r0 = r4.length
            if (r0 <= 0) goto L2c
            android.graphics.drawable.Drawable r0 = r3.getBackground()
            boolean r0 = r0 instanceof android.graphics.drawable.BitmapDrawable
            r1 = 0
            if (r0 != 0) goto L17
            r0 = r4[r1]
            r3.M(r0)
        L17:
            int r0 = r4.length
            r2 = 1
            if (r0 <= r2) goto L21
            r4 = r4[r2]
            r3.n(r4)
            return
        L21:
            r4 = r4[r1]
            r0 = -1
            if (r4 != r0) goto L29
            r0 = -10066330(0xffffffffff666666, float:-3.0625412E38)
        L29:
            r3.n(r0)
        L2c:
            return
    }

    public void t(l2.h r1, int r2, int r3) {
            r0 = this;
            return
    }

    public void v(float r1, int r2, int r3, int r4) {
            r0 = this;
            return
    }

    public int w(l2.h r3, boolean r4) {
            r2 = this;
            boolean r3 = r2.j
            if (r3 != 0) goto L37
            com.scwang.smartrefresh.layout.internal.a r3 = r2.e
            if (r3 == 0) goto Lc
            r3.stop()
            goto L1c
        Lc:
            android.widget.ImageView r3 = r2.c
            android.view.ViewPropertyAnimator r3 = r3.animate()
            r0 = 0
            android.view.ViewPropertyAnimator r3 = r3.rotation(r0)
            r0 = 300(0x12c, double:1.48E-321)
            r3.setDuration(r0)
        L1c:
            android.widget.ImageView r3 = r2.c
            r0 = 8
            r3.setVisibility(r0)
            if (r4 == 0) goto L2d
            android.widget.TextView r3 = r2.a
            java.lang.String r4 = com.scwang.smartrefresh.layout.footer.ClassicsFooter.q
            r3.setText(r4)
            goto L34
        L2d:
            android.widget.TextView r3 = r2.a
            java.lang.String r4 = com.scwang.smartrefresh.layout.footer.ClassicsFooter.r
            r3.setText(r4)
        L34:
            int r3 = r2.h
            return r3
        L37:
            r3 = 0
            return r3
    }

    public com.scwang.smartrefresh.layout.footer.ClassicsFooter z(@androidx.annotation.ColorRes int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            int r2 = androidx.core.content.ContextCompat.getColor(r0, r2)
            r1.n(r2)
            return r1
    }
}
