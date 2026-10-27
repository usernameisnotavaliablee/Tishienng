package com.scwang.smartrefresh.layout.header;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class ClassicsHeader extends android.widget.RelativeLayout implements l2.e {
    public static java.lang.String r = "下拉可以刷新";
    public static java.lang.String s = "正在刷新...";
    public static java.lang.String t = "正在加载...";
    public static java.lang.String u = "释放立即刷新";
    public static java.lang.String v = "刷新完成";
    public static java.lang.String w = "刷新失败";
    public static java.lang.String x = "上次更新 M-d HH:mm";
    public static java.lang.String y = "释放进入二楼";
    protected java.lang.String a;
    protected java.util.Date b;
    protected android.widget.TextView c;
    protected android.widget.TextView d;
    protected android.widget.ImageView e;
    protected android.widget.ImageView f;
    protected android.content.SharedPreferences g;
    protected l2.g h;
    protected com.scwang.smartrefresh.layout.internal.pathview.b i;
    protected com.scwang.smartrefresh.layout.internal.a j;
    protected com.scwang.smartrefresh.layout.constant.SpinnerStyle k;
    protected java.text.DateFormat l;
    protected int m;
    protected int n;
    protected int o;
    protected int p;
    protected boolean q;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a = null;

        static {
                com.scwang.smartrefresh.layout.constant.RefreshState[] r0 = com.scwang.smartrefresh.layout.constant.RefreshState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.scwang.smartrefresh.layout.header.ClassicsHeader.a.a = r0
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.None     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.scwang.smartrefresh.layout.header.ClassicsHeader.a.a     // Catch: java.lang.NoSuchFieldError -> L1d
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.PullDownToRefresh     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.scwang.smartrefresh.layout.header.ClassicsHeader.a.a     // Catch: java.lang.NoSuchFieldError -> L28
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.Refreshing     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.scwang.smartrefresh.layout.header.ClassicsHeader.a.a     // Catch: java.lang.NoSuchFieldError -> L33
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.RefreshReleased     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.scwang.smartrefresh.layout.header.ClassicsHeader.a.a     // Catch: java.lang.NoSuchFieldError -> L3e
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.ReleaseToRefresh     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = com.scwang.smartrefresh.layout.header.ClassicsHeader.a.a     // Catch: java.lang.NoSuchFieldError -> L49
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.ReleaseToTwoLevel     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = com.scwang.smartrefresh.layout.header.ClassicsHeader.a.a     // Catch: java.lang.NoSuchFieldError -> L54
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.Loading     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
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

    public ClassicsHeader(android.content.Context r4) {
            r3 = this;
            r3.<init>(r4)
            java.lang.String r0 = "LAST_UPDATE_TIME"
            r3.a = r0
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r0 = com.scwang.smartrefresh.layout.constant.SpinnerStyle.Translate
            r3.k = r0
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = com.scwang.smartrefresh.layout.header.ClassicsHeader.x
            java.util.Locale r2 = java.util.Locale.CHINA
            r0.<init>(r1, r2)
            r3.l = r0
            r0 = 500(0x1f4, float:7.0E-43)
            r3.m = r0
            r0 = 20
            r3.o = r0
            r3.p = r0
            r0 = 1
            r3.q = r0
            r0 = 0
            r3.m(r4, r0)
            return
    }

    public ClassicsHeader(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            r3.<init>(r4, r5)
            java.lang.String r0 = "LAST_UPDATE_TIME"
            r3.a = r0
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r0 = com.scwang.smartrefresh.layout.constant.SpinnerStyle.Translate
            r3.k = r0
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = com.scwang.smartrefresh.layout.header.ClassicsHeader.x
            java.util.Locale r2 = java.util.Locale.CHINA
            r0.<init>(r1, r2)
            r3.l = r0
            r0 = 500(0x1f4, float:7.0E-43)
            r3.m = r0
            r0 = 20
            r3.o = r0
            r3.p = r0
            r0 = 1
            r3.q = r0
            r3.m(r4, r5)
            return
    }

    public ClassicsHeader(android.content.Context r3, android.util.AttributeSet r4, int r5) {
            r2 = this;
            r2.<init>(r3, r4, r5)
            java.lang.String r5 = "LAST_UPDATE_TIME"
            r2.a = r5
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r5 = com.scwang.smartrefresh.layout.constant.SpinnerStyle.Translate
            r2.k = r5
            java.text.SimpleDateFormat r5 = new java.text.SimpleDateFormat
            java.lang.String r0 = com.scwang.smartrefresh.layout.header.ClassicsHeader.x
            java.util.Locale r1 = java.util.Locale.CHINA
            r5.<init>(r0, r1)
            r2.l = r5
            r5 = 500(0x1f4, float:7.0E-43)
            r2.m = r5
            r5 = 20
            r2.o = r5
            r2.p = r5
            r5 = 1
            r2.q = r5
            r2.m(r3, r4)
            return
    }

    @androidx.annotation.RequiresApi(21)
    public ClassicsHeader(android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3, int r4, int r5) {
            r1 = this;
            r1.<init>(r2, r3, r4, r5)
            java.lang.String r4 = "LAST_UPDATE_TIME"
            r1.a = r4
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r4 = com.scwang.smartrefresh.layout.constant.SpinnerStyle.Translate
            r1.k = r4
            java.text.SimpleDateFormat r4 = new java.text.SimpleDateFormat
            java.lang.String r5 = com.scwang.smartrefresh.layout.header.ClassicsHeader.x
            java.util.Locale r0 = java.util.Locale.CHINA
            r4.<init>(r5, r0)
            r1.l = r4
            r4 = 500(0x1f4, float:7.0E-43)
            r1.m = r4
            r4 = 20
            r1.o = r4
            r1.p = r4
            r4 = 1
            r1.q = r4
            r1.m(r2, r3)
            return
    }

    private void m(android.content.Context r11, android.util.AttributeSet r12) {
            r10 = this;
            com.scwang.smartrefresh.layout.util.c r0 = new com.scwang.smartrefresh.layout.util.c
            r0.<init>()
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r11)
            r2 = 16908312(0x1020018, float:2.3877296E-38)
            r1.setId(r2)
            r3 = 1
            r1.setGravity(r3)
            r1.setOrientation(r3)
            android.widget.TextView r3 = new android.widget.TextView
            r3.<init>(r11)
            r10.c = r3
            java.lang.String r4 = com.scwang.smartrefresh.layout.header.ClassicsHeader.r
            r3.setText(r4)
            android.widget.TextView r3 = r10.c
            r4 = -10066330(0xffffffffff666666, float:-3.0625412E38)
            r3.setTextColor(r4)
            android.widget.TextView r3 = new android.widget.TextView
            r3.<init>(r11)
            r10.d = r3
            r5 = -8618884(0xffffffffff7c7c7c, float:-3.3561181E38)
            r3.setTextColor(r5)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r5 = -2
            r3.<init>(r5, r5)
            android.widget.TextView r6 = r10.c
            r1.addView(r6, r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r3.<init>(r5, r5)
            android.widget.TextView r6 = r10.d
            r1.addView(r6, r3)
            android.widget.RelativeLayout$LayoutParams r6 = new android.widget.RelativeLayout$LayoutParams
            r6.<init>(r5, r5)
            r5 = 13
            r6.addRule(r5)
            r10.addView(r1, r6)
            android.widget.RelativeLayout$LayoutParams r1 = new android.widget.RelativeLayout$LayoutParams
            r5 = 1101004800(0x41a00000, float:20.0)
            int r6 = r0.a(r5)
            int r7 = r0.a(r5)
            r1.<init>(r6, r7)
            r6 = 15
            r1.addRule(r6)
            r7 = 0
            r1.addRule(r7, r2)
            android.widget.ImageView r8 = new android.widget.ImageView
            r8.<init>(r11)
            r10.e = r8
            r10.addView(r8, r1)
            android.widget.RelativeLayout$LayoutParams r8 = new android.widget.RelativeLayout$LayoutParams
            r8.<init>(r1)
            r8.addRule(r6)
            r8.addRule(r7, r2)
            android.widget.ImageView r2 = new android.widget.ImageView
            r2.<init>(r11)
            r10.f = r2
            android.view.ViewPropertyAnimator r2 = r2.animate()
            android.view.animation.LinearInterpolator r6 = new android.view.animation.LinearInterpolator
            r6.<init>()
            r2.setInterpolator(r6)
            android.widget.ImageView r2 = r10.f
            r10.addView(r2, r8)
            boolean r2 = r10.isInEditMode()
            r6 = 8
            if (r2 == 0) goto Lb4
            android.widget.ImageView r2 = r10.e
            r2.setVisibility(r6)
            android.widget.TextView r2 = r10.c
            java.lang.String r9 = com.scwang.smartrefresh.layout.header.ClassicsHeader.s
            r2.setText(r9)
            goto Lb9
        Lb4:
            android.widget.ImageView r2 = r10.f
            r2.setVisibility(r6)
        Lb9:
            int[] r2 = com.scwang.smartrefresh.layout.R.styleable.ClassicsHeader
            android.content.res.TypedArray r12 = r11.obtainStyledAttributes(r12, r2)
            int r2 = com.scwang.smartrefresh.layout.R.styleable.ClassicsHeader_srlTextTimeMarginTop
            r9 = 0
            int r9 = r0.a(r9)
            int r2 = r12.getDimensionPixelSize(r2, r9)
            r3.topMargin = r2
            int r2 = com.scwang.smartrefresh.layout.R.styleable.ClassicsFooter_srlDrawableMarginRight
            int r3 = r0.a(r5)
            int r2 = r12.getDimensionPixelSize(r2, r3)
            r8.rightMargin = r2
            r1.rightMargin = r2
            int r2 = com.scwang.smartrefresh.layout.R.styleable.ClassicsHeader_srlDrawableArrowSize
            int r3 = r1.width
            int r3 = r12.getLayoutDimension(r2, r3)
            r1.width = r3
            int r3 = r1.height
            int r2 = r12.getLayoutDimension(r2, r3)
            r1.height = r2
            int r2 = com.scwang.smartrefresh.layout.R.styleable.ClassicsHeader_srlDrawableProgressSize
            int r3 = r8.width
            int r3 = r12.getLayoutDimension(r2, r3)
            r8.width = r3
            int r3 = r8.height
            int r2 = r12.getLayoutDimension(r2, r3)
            r8.height = r2
            int r2 = com.scwang.smartrefresh.layout.R.styleable.ClassicsHeader_srlDrawableSize
            int r3 = r1.width
            int r3 = r12.getLayoutDimension(r2, r3)
            r1.width = r3
            int r3 = r1.height
            int r3 = r12.getLayoutDimension(r2, r3)
            r1.height = r3
            int r1 = r8.width
            int r1 = r12.getLayoutDimension(r2, r1)
            r8.width = r1
            int r1 = r8.height
            int r1 = r12.getLayoutDimension(r2, r1)
            r8.height = r1
            int r1 = com.scwang.smartrefresh.layout.R.styleable.ClassicsHeader_srlFinishDuration
            int r2 = r10.m
            int r1 = r12.getInt(r1, r2)
            r10.m = r1
            int r1 = com.scwang.smartrefresh.layout.R.styleable.ClassicsHeader_srlEnableLastTime
            boolean r2 = r10.q
            boolean r1 = r12.getBoolean(r1, r2)
            r10.q = r1
            com.scwang.smartrefresh.layout.constant.SpinnerStyle[] r1 = com.scwang.smartrefresh.layout.constant.SpinnerStyle.values()
            int r2 = com.scwang.smartrefresh.layout.R.styleable.ClassicsHeader_srlClassicsSpinnerStyle
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r3 = r10.k
            int r3 = r3.ordinal()
            int r2 = r12.getInt(r2, r3)
            r1 = r1[r2]
            r10.k = r1
            android.widget.TextView r1 = r10.d
            boolean r2 = r10.q
            if (r2 == 0) goto L14f
            r6 = 0
        L14f:
            r1.setVisibility(r6)
            int r1 = com.scwang.smartrefresh.layout.R.styleable.ClassicsHeader_srlDrawableArrow
            boolean r2 = r12.hasValue(r1)
            if (r2 == 0) goto L164
            android.widget.ImageView r2 = r10.e
            android.graphics.drawable.Drawable r1 = r12.getDrawable(r1)
            r2.setImageDrawable(r1)
            goto L184
        L164:
            com.scwang.smartrefresh.layout.internal.pathview.b r1 = new com.scwang.smartrefresh.layout.internal.pathview.b
            r1.<init>()
            r10.i = r1
            int[] r2 = new int[]{r4}
            r1.h(r2)
            com.scwang.smartrefresh.layout.internal.pathview.b r1 = r10.i
            java.lang.String r2 = "M20,12l-1.41,-1.41L13,16.17V4h-2v12.17l-5.58,-5.59L4,12l8,8 8,-8z"
            java.lang.String[] r2 = new java.lang.String[]{r2}
            r1.i(r2)
            android.widget.ImageView r1 = r10.e
            com.scwang.smartrefresh.layout.internal.pathview.b r2 = r10.i
            r1.setImageDrawable(r2)
        L184:
            int r1 = com.scwang.smartrefresh.layout.R.styleable.ClassicsHeader_srlDrawableProgress
            boolean r2 = r12.hasValue(r1)
            if (r2 == 0) goto L196
            android.widget.ImageView r2 = r10.f
            android.graphics.drawable.Drawable r1 = r12.getDrawable(r1)
            r2.setImageDrawable(r1)
            goto L1a7
        L196:
            com.scwang.smartrefresh.layout.internal.a r1 = new com.scwang.smartrefresh.layout.internal.a
            r1.<init>()
            r10.j = r1
            r1.c(r4)
            android.widget.ImageView r1 = r10.f
            com.scwang.smartrefresh.layout.internal.a r2 = r10.j
            r1.setImageDrawable(r2)
        L1a7:
            int r1 = com.scwang.smartrefresh.layout.R.styleable.ClassicsHeader_srlTextSizeTitle
            boolean r2 = r12.hasValue(r1)
            r3 = 1098907648(0x41800000, float:16.0)
            if (r2 == 0) goto L1c0
            android.widget.TextView r2 = r10.c
            int r3 = com.scwang.smartrefresh.layout.util.c.b(r3)
            int r1 = r12.getDimensionPixelSize(r1, r3)
            float r1 = (float) r1
            r2.setTextSize(r7, r1)
            goto L1c5
        L1c0:
            android.widget.TextView r1 = r10.c
            r1.setTextSize(r3)
        L1c5:
            int r1 = com.scwang.smartrefresh.layout.R.styleable.ClassicsHeader_srlTextSizeTime
            boolean r2 = r12.hasValue(r1)
            r3 = 1094713344(0x41400000, float:12.0)
            if (r2 == 0) goto L1de
            android.widget.TextView r2 = r10.d
            int r3 = com.scwang.smartrefresh.layout.util.c.b(r3)
            int r1 = r12.getDimensionPixelSize(r1, r3)
            float r1 = (float) r1
            r2.setTextSize(r7, r1)
            goto L1e3
        L1de:
            android.widget.TextView r1 = r10.d
            r1.setTextSize(r3)
        L1e3:
            int r1 = com.scwang.smartrefresh.layout.R.styleable.ClassicsHeader_srlPrimaryColor
            boolean r2 = r12.hasValue(r1)
            if (r2 == 0) goto L1f2
            int r1 = r12.getColor(r1, r7)
            r10.P(r1)
        L1f2:
            int r1 = com.scwang.smartrefresh.layout.R.styleable.ClassicsHeader_srlAccentColor
            boolean r2 = r12.hasValue(r1)
            if (r2 == 0) goto L201
            int r1 = r12.getColor(r1, r7)
            r10.n(r1)
        L201:
            r12.recycle()
            int r12 = r10.getPaddingTop()
            if (r12 != 0) goto L240
            int r12 = r10.getPaddingBottom()
            if (r12 != 0) goto L228
            int r12 = r10.getPaddingLeft()
            int r1 = r0.a(r5)
            r10.o = r1
            int r2 = r10.getPaddingRight()
            int r0 = r0.a(r5)
            r10.p = r0
            r10.setPadding(r12, r1, r2, r0)
            goto L26a
        L228:
            int r12 = r10.getPaddingLeft()
            int r0 = r0.a(r5)
            r10.o = r0
            int r1 = r10.getPaddingRight()
            int r2 = r10.getPaddingBottom()
            r10.p = r2
            r10.setPadding(r12, r0, r1, r2)
            goto L26a
        L240:
            int r12 = r10.getPaddingBottom()
            if (r12 != 0) goto L25e
            int r12 = r10.getPaddingLeft()
            int r1 = r10.getPaddingTop()
            r10.o = r1
            int r2 = r10.getPaddingRight()
            int r0 = r0.a(r5)
            r10.p = r0
            r10.setPadding(r12, r1, r2, r0)
            goto L26a
        L25e:
            int r12 = r10.getPaddingTop()
            r10.o = r12
            int r12 = r10.getPaddingBottom()
            r10.p = r12
        L26a:
            boolean r12 = r11 instanceof androidx.fragment.app.FragmentActivity     // Catch: java.lang.Throwable -> L28c
            if (r12 == 0) goto L28c
            r12 = r11
            androidx.fragment.app.FragmentActivity r12 = (androidx.fragment.app.FragmentActivity) r12     // Catch: java.lang.Throwable -> L28c
            androidx.fragment.app.FragmentManager r12 = r12.getSupportFragmentManager()     // Catch: java.lang.Throwable -> L28c
            if (r12 == 0) goto L28c
            java.util.List r12 = r12.getFragments()     // Catch: java.lang.Throwable -> L28c
            if (r12 == 0) goto L28c
            int r12 = r12.size()     // Catch: java.lang.Throwable -> L28c
            if (r12 <= 0) goto L28c
            java.util.Date r12 = new java.util.Date     // Catch: java.lang.Throwable -> L28c
            r12.<init>()     // Catch: java.lang.Throwable -> L28c
            r10.O(r12)     // Catch: java.lang.Throwable -> L28c
            return
        L28c:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = r10.a
            r12.append(r0)
            java.lang.Class r0 = r11.getClass()
            java.lang.String r0 = r0.getName()
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            r10.a = r12
            java.lang.String r12 = "ClassicsHeader"
            android.content.SharedPreferences r11 = r11.getSharedPreferences(r12, r7)
            r10.g = r11
            java.util.Date r11 = new java.util.Date
            android.content.SharedPreferences r12 = r10.g
            java.lang.String r0 = r10.a
            long r1 = java.lang.System.currentTimeMillis()
            long r0 = r12.getLong(r0, r1)
            r11.<init>(r0)
            r10.O(r11)
            return
    }

    public com.scwang.smartrefresh.layout.header.ClassicsHeader A(android.graphics.Bitmap r2) {
            r1 = this;
            r0 = 0
            r1.i = r0
            android.widget.ImageView r0 = r1.e
            r0.setImageBitmap(r2)
            return r1
    }

    public com.scwang.smartrefresh.layout.header.ClassicsHeader B(android.graphics.drawable.Drawable r2) {
            r1 = this;
            r0 = 0
            r1.i = r0
            android.widget.ImageView r0 = r1.e
            r0.setImageDrawable(r2)
            return r1
    }

    public com.scwang.smartrefresh.layout.header.ClassicsHeader C(@androidx.annotation.DrawableRes int r2) {
            r1 = this;
            r0 = 0
            r1.i = r0
            android.widget.ImageView r0 = r1.e
            r0.setImageResource(r2)
            return r1
    }

    public com.scwang.smartrefresh.layout.header.ClassicsHeader D(float r1) {
            r0 = this;
            int r1 = com.scwang.smartrefresh.layout.util.c.b(r1)
            com.scwang.smartrefresh.layout.header.ClassicsHeader r1 = r0.E(r1)
            return r1
    }

    public com.scwang.smartrefresh.layout.header.ClassicsHeader E(int r2) {
            r1 = this;
            android.widget.ImageView r0 = r1.e
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            r0.width = r2
            r0.height = r2
            android.widget.ImageView r2 = r1.e
            r2.setLayoutParams(r0)
            return r1
    }

    public com.scwang.smartrefresh.layout.header.ClassicsHeader F(float r1) {
            r0 = this;
            int r1 = com.scwang.smartrefresh.layout.util.c.b(r1)
            com.scwang.smartrefresh.layout.header.ClassicsHeader r1 = r0.G(r1)
            return r1
    }

    public com.scwang.smartrefresh.layout.header.ClassicsHeader G(int r3) {
            r2 = this;
            android.widget.ImageView r0 = r2.e
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            android.widget.ImageView r1 = r2.f
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            r1.rightMargin = r3
            r0.rightMargin = r3
            android.widget.ImageView r3 = r2.e
            r3.setLayoutParams(r0)
            android.widget.ImageView r3 = r2.f
            r3.setLayoutParams(r1)
            return r2
    }

    public com.scwang.smartrefresh.layout.header.ClassicsHeader H(float r1) {
            r0 = this;
            int r1 = com.scwang.smartrefresh.layout.util.c.b(r1)
            com.scwang.smartrefresh.layout.header.ClassicsHeader r1 = r0.I(r1)
            return r1
    }

    public com.scwang.smartrefresh.layout.header.ClassicsHeader I(int r2) {
            r1 = this;
            android.widget.ImageView r0 = r1.f
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            r0.width = r2
            r0.height = r2
            android.widget.ImageView r2 = r1.f
            r2.setLayoutParams(r0)
            return r1
    }

    public com.scwang.smartrefresh.layout.header.ClassicsHeader J(float r1) {
            r0 = this;
            int r1 = com.scwang.smartrefresh.layout.util.c.b(r1)
            com.scwang.smartrefresh.layout.header.ClassicsHeader r1 = r0.K(r1)
            return r1
    }

    public com.scwang.smartrefresh.layout.header.ClassicsHeader K(int r3) {
            r2 = this;
            android.widget.ImageView r0 = r2.e
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.ImageView r1 = r2.f
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            r1.width = r3
            r0.width = r3
            r1.height = r3
            r0.height = r3
            android.widget.ImageView r3 = r2.e
            r3.setLayoutParams(r0)
            android.widget.ImageView r3 = r2.f
            r3.setLayoutParams(r1)
            return r2
    }

    public com.scwang.smartrefresh.layout.header.ClassicsHeader L(boolean r2) {
            r1 = this;
            r1.q = r2
            android.widget.TextView r0 = r1.d
            if (r2 == 0) goto L8
            r2 = 0
            goto La
        L8:
            r2 = 8
        La:
            r0.setVisibility(r2)
            l2.g r2 = r1.h
            if (r2 == 0) goto L14
            r2.a()
        L14:
            return r1
    }

    public com.scwang.smartrefresh.layout.header.ClassicsHeader M(int r1) {
            r0 = this;
            r0.m = r1
            return r0
    }

    public com.scwang.smartrefresh.layout.header.ClassicsHeader N(java.lang.CharSequence r2) {
            r1 = this;
            r0 = 0
            r1.b = r0
            android.widget.TextView r0 = r1.d
            r0.setText(r2)
            return r1
    }

    public com.scwang.smartrefresh.layout.header.ClassicsHeader O(java.util.Date r5) {
            r4 = this;
            r4.b = r5
            android.widget.TextView r0 = r4.d
            java.text.DateFormat r1 = r4.l
            java.lang.String r1 = r1.format(r5)
            r0.setText(r1)
            android.content.SharedPreferences r0 = r4.g
            if (r0 == 0) goto L2a
            boolean r0 = r4.isInEditMode()
            if (r0 != 0) goto L2a
            android.content.SharedPreferences r0 = r4.g
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = r4.a
            long r2 = r5.getTime()
            android.content.SharedPreferences$Editor r5 = r0.putLong(r1, r2)
            r5.apply()
        L2a:
            return r4
    }

    public com.scwang.smartrefresh.layout.header.ClassicsHeader P(@androidx.annotation.ColorInt int r2) {
            r1 = this;
            r1.n = r2
            r1.setBackgroundColor(r2)
            l2.g r2 = r1.h
            if (r2 == 0) goto Le
            int r0 = r1.n
            r2.f(r0)
        Le:
            return r1
    }

    public com.scwang.smartrefresh.layout.header.ClassicsHeader Q(@androidx.annotation.ColorRes int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            int r2 = androidx.core.content.ContextCompat.getColor(r0, r2)
            r1.P(r2)
            return r1
    }

    public com.scwang.smartrefresh.layout.header.ClassicsHeader R(android.graphics.Bitmap r2) {
            r1 = this;
            r0 = 0
            r1.j = r0
            android.widget.ImageView r0 = r1.f
            r0.setImageBitmap(r2)
            return r1
    }

    public com.scwang.smartrefresh.layout.header.ClassicsHeader S(android.graphics.drawable.Drawable r2) {
            r1 = this;
            r0 = 0
            r1.j = r0
            android.widget.ImageView r0 = r1.f
            r0.setImageDrawable(r2)
            return r1
    }

    public com.scwang.smartrefresh.layout.header.ClassicsHeader T(@androidx.annotation.DrawableRes int r2) {
            r1 = this;
            r0 = 0
            r1.j = r0
            android.widget.ImageView r0 = r1.f
            r0.setImageResource(r2)
            return r1
    }

    public com.scwang.smartrefresh.layout.header.ClassicsHeader U(com.scwang.smartrefresh.layout.constant.SpinnerStyle r1) {
            r0 = this;
            r0.k = r1
            return r0
    }

    public com.scwang.smartrefresh.layout.header.ClassicsHeader V(float r2) {
            r1 = this;
            android.widget.TextView r0 = r1.d
            r0.setTextSize(r2)
            l2.g r2 = r1.h
            if (r2 == 0) goto Lc
            r2.a()
        Lc:
            return r1
    }

    public com.scwang.smartrefresh.layout.header.ClassicsHeader W(int r2, float r3) {
            r1 = this;
            android.widget.TextView r0 = r1.d
            r0.setTextSize(r2, r3)
            l2.g r2 = r1.h
            if (r2 == 0) goto Lc
            r2.a()
        Lc:
            return r1
    }

    public com.scwang.smartrefresh.layout.header.ClassicsHeader X(float r2) {
            r1 = this;
            android.widget.TextView r0 = r1.c
            r0.setTextSize(r2)
            l2.g r2 = r1.h
            if (r2 == 0) goto Lc
            r2.a()
        Lc:
            return r1
    }

    public com.scwang.smartrefresh.layout.header.ClassicsHeader Y(int r2, float r3) {
            r1 = this;
            android.widget.TextView r0 = r1.c
            r0.setTextSize(r2, r3)
            l2.g r2 = r1.h
            if (r2 == 0) goto Lc
            r2.a()
        Lc:
            return r1
    }

    public com.scwang.smartrefresh.layout.header.ClassicsHeader Z(float r1) {
            r0 = this;
            int r1 = com.scwang.smartrefresh.layout.util.c.b(r1)
            com.scwang.smartrefresh.layout.header.ClassicsHeader r1 = r0.a0(r1)
            return r1
    }

    public com.scwang.smartrefresh.layout.header.ClassicsHeader a0(int r2) {
            r1 = this;
            android.widget.TextView r0 = r1.d
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            r0.topMargin = r2
            android.widget.TextView r2 = r1.d
            r2.setLayoutParams(r0)
            return r1
    }

    public com.scwang.smartrefresh.layout.header.ClassicsHeader b0(java.text.DateFormat r3) {
            r2 = this;
            r2.l = r3
            java.util.Date r0 = r2.b
            if (r0 == 0) goto Lf
            android.widget.TextView r1 = r2.d
            java.lang.String r3 = r3.format(r0)
            r1.setText(r3)
        Lf:
            return r2
    }

    public void f(l2.g r1, int r2, int r3) {
            r0 = this;
            r0.h = r1
            int r2 = r0.n
            r1.f(r2)
            return
    }

    public void g(float r1, int r2, int r3, int r4) {
            r0 = this;
            return
    }

    public android.widget.ImageView getArrowView() {
            r1 = this;
            android.widget.ImageView r0 = r1.e
            return r0
    }

    public android.widget.TextView getLastUpdateText() {
            r1 = this;
            android.widget.TextView r0 = r1.d
            return r0
    }

    public android.widget.ImageView getProgressView() {
            r1 = this;
            android.widget.ImageView r0 = r1.f
            return r0
    }

    public com.scwang.smartrefresh.layout.constant.SpinnerStyle getSpinnerStyle() {
            r1 = this;
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r0 = r1.k
            return r0
    }

    public android.widget.TextView getTitleText() {
            r1 = this;
            android.widget.TextView r0 = r1.c
            return r0
    }

    @androidx.annotation.NonNull
    public android.view.View getView() {
            r0 = this;
            return r0
    }

    public void i(l2.h r1, int r2, int r3) {
            r0 = this;
            com.scwang.smartrefresh.layout.internal.a r1 = r0.j
            if (r1 == 0) goto L8
            r1.start()
            return
        L8:
            android.widget.ImageView r1 = r0.f
            android.graphics.drawable.Drawable r1 = r1.getDrawable()
            boolean r2 = r1 instanceof android.graphics.drawable.Animatable
            if (r2 == 0) goto L18
            android.graphics.drawable.Animatable r1 = (android.graphics.drawable.Animatable) r1
            r1.start()
            return
        L18:
            android.widget.ImageView r1 = r0.f
            android.view.ViewPropertyAnimator r1 = r1.animate()
            r2 = 1192009728(0x470ca000, float:36000.0)
            android.view.ViewPropertyAnimator r1 = r1.rotation(r2)
            r2 = 100000(0x186a0, double:4.94066E-319)
            r1.setDuration(r2)
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

    public com.scwang.smartrefresh.layout.header.ClassicsHeader n(@androidx.annotation.ColorInt int r3) {
            r2 = this;
            com.scwang.smartrefresh.layout.internal.pathview.b r0 = r2.i
            if (r0 == 0) goto Lb
            int[] r1 = new int[]{r3}
            r0.h(r1)
        Lb:
            com.scwang.smartrefresh.layout.internal.a r0 = r2.j
            if (r0 == 0) goto L12
            r0.c(r3)
        L12:
            android.widget.TextView r0 = r2.c
            r0.setTextColor(r3)
            android.widget.TextView r0 = r2.d
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            r3 = r3 & r1
            r1 = -872415232(0xffffffffcc000000, float:-3.3554432E7)
            r3 = r3 | r1
            r0.setTextColor(r3)
            return r2
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
            int r1 = r4.o
            int r2 = r4.getPaddingRight()
            int r3 = r4.p
            r4.setPadding(r0, r1, r2, r3)
        L24:
            super.onMeasure(r5, r6)
            return
    }

    public void q(l2.h r3, com.scwang.smartrefresh.layout.constant.RefreshState r4, com.scwang.smartrefresh.layout.constant.RefreshState r5) {
            r2 = this;
            int[] r3 = com.scwang.smartrefresh.layout.header.ClassicsHeader.a.a
            int r4 = r5.ordinal()
            r3 = r3[r4]
            r4 = 0
            r5 = 0
            r0 = 8
            switch(r3) {
                case 1: goto L5d;
                case 2: goto L6a;
                case 3: goto L4b;
                case 4: goto L4b;
                case 5: goto L38;
                case 6: goto L27;
                case 7: goto L10;
                default: goto Lf;
            }
        Lf:
            return
        L10:
            android.widget.ImageView r3 = r2.e
            r3.setVisibility(r0)
            android.widget.ImageView r3 = r2.f
            r3.setVisibility(r0)
            android.widget.TextView r3 = r2.d
            r3.setVisibility(r0)
            android.widget.TextView r3 = r2.c
            java.lang.String r4 = com.scwang.smartrefresh.layout.header.ClassicsHeader.t
            r3.setText(r4)
            return
        L27:
            android.widget.TextView r3 = r2.c
            java.lang.String r5 = com.scwang.smartrefresh.layout.header.ClassicsHeader.y
            r3.setText(r5)
            android.widget.ImageView r3 = r2.e
            android.view.ViewPropertyAnimator r3 = r3.animate()
            r3.rotation(r4)
            return
        L38:
            android.widget.TextView r3 = r2.c
            java.lang.String r4 = com.scwang.smartrefresh.layout.header.ClassicsHeader.u
            r3.setText(r4)
            android.widget.ImageView r3 = r2.e
            android.view.ViewPropertyAnimator r3 = r3.animate()
            r4 = 1127481344(0x43340000, float:180.0)
            r3.rotation(r4)
            return
        L4b:
            android.widget.TextView r3 = r2.c
            java.lang.String r4 = com.scwang.smartrefresh.layout.header.ClassicsHeader.s
            r3.setText(r4)
            android.widget.ImageView r3 = r2.f
            r3.setVisibility(r5)
            android.widget.ImageView r3 = r2.e
            r3.setVisibility(r0)
            return
        L5d:
            android.widget.TextView r3 = r2.d
            boolean r1 = r2.q
            if (r1 == 0) goto L65
            r1 = 0
            goto L67
        L65:
            r1 = 8
        L67:
            r3.setVisibility(r1)
        L6a:
            android.widget.TextView r3 = r2.c
            java.lang.String r1 = com.scwang.smartrefresh.layout.header.ClassicsHeader.r
            r3.setText(r1)
            android.widget.ImageView r3 = r2.e
            r3.setVisibility(r5)
            android.widget.ImageView r3 = r2.f
            r3.setVisibility(r0)
            android.widget.ImageView r3 = r2.e
            android.view.ViewPropertyAnimator r3 = r3.animate()
            r3.rotation(r4)
            return
    }

    @java.lang.Deprecated
    public void setPrimaryColors(@androidx.annotation.ColorInt int... r4) {
            r3 = this;
            int r0 = r4.length
            if (r0 <= 0) goto L26
            android.graphics.drawable.Drawable r0 = r3.getBackground()
            boolean r0 = r0 instanceof android.graphics.drawable.BitmapDrawable
            r1 = 0
            if (r0 != 0) goto L11
            r0 = r4[r1]
            r3.P(r0)
        L11:
            int r0 = r4.length
            r2 = 1
            if (r0 <= r2) goto L1b
            r4 = r4[r2]
            r3.n(r4)
            return
        L1b:
            r4 = r4[r1]
            r0 = -1
            if (r4 != r0) goto L23
            r0 = -10066330(0xffffffffff666666, float:-3.0625412E38)
        L23:
            r3.n(r0)
        L26:
            return
    }

    public void t(l2.h r1, int r2, int r3) {
            r0 = this;
            return
    }

    public int w(l2.h r3, boolean r4) {
            r2 = this;
            com.scwang.smartrefresh.layout.internal.a r3 = r2.j
            if (r3 == 0) goto L8
            r3.stop()
            goto L28
        L8:
            android.widget.ImageView r3 = r2.f
            android.graphics.drawable.Drawable r3 = r3.getDrawable()
            boolean r0 = r3 instanceof android.graphics.drawable.Animatable
            if (r0 == 0) goto L18
            android.graphics.drawable.Animatable r3 = (android.graphics.drawable.Animatable) r3
            r3.stop()
            goto L28
        L18:
            android.widget.ImageView r3 = r2.f
            android.view.ViewPropertyAnimator r3 = r3.animate()
            r0 = 0
            android.view.ViewPropertyAnimator r3 = r3.rotation(r0)
            r0 = 300(0x12c, double:1.48E-321)
            r3.setDuration(r0)
        L28:
            android.widget.ImageView r3 = r2.f
            r0 = 8
            r3.setVisibility(r0)
            if (r4 == 0) goto L45
            android.widget.TextView r3 = r2.c
            java.lang.String r4 = com.scwang.smartrefresh.layout.header.ClassicsHeader.v
            r3.setText(r4)
            java.util.Date r3 = r2.b
            if (r3 == 0) goto L4c
            java.util.Date r3 = new java.util.Date
            r3.<init>()
            r2.O(r3)
            goto L4c
        L45:
            android.widget.TextView r3 = r2.c
            java.lang.String r4 = com.scwang.smartrefresh.layout.header.ClassicsHeader.w
            r3.setText(r4)
        L4c:
            int r3 = r2.m
            return r3
    }

    public void x(float r1, int r2, int r3, int r4) {
            r0 = this;
            return
    }

    public com.scwang.smartrefresh.layout.header.ClassicsHeader z(@androidx.annotation.ColorRes int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            int r2 = androidx.core.content.ContextCompat.getColor(r0, r2)
            r1.n(r2)
            return r1
    }
}
