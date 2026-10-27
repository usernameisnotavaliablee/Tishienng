package com.beizi.fusion.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class CircleProgressView extends android.view.View {
    private android.graphics.Paint a;
    private android.graphics.Paint b;
    private android.graphics.Paint c;
    private android.graphics.Paint d;
    private int e;
    private int f;
    private int g;
    private int h;
    private float i;
    private float j;
    private float k;

    /* renamed from: l, reason: collision with root package name */
    private int f83l;

    /* renamed from: m, reason: collision with root package name */
    private int f84m;

    /* renamed from: n, reason: collision with root package name */
    private float f85n;

    /* renamed from: o, reason: collision with root package name */
    private float f86o;

    /* renamed from: p, reason: collision with root package name */
    private int f87p;

    /* renamed from: q, reason: collision with root package name */
    private int f88q;

    /* renamed from: r, reason: collision with root package name */
    private float f89r;

    public CircleProgressView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public CircleProgressView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            r0 = 100
            r1.f87p = r0
            r1.a(r2, r3)
            r1.a()
            return
    }

    private void a() {
            r5 = this;
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r5.a = r0
            r1 = 1
            r0.setAntiAlias(r1)
            android.graphics.Paint r0 = r5.a
            int r2 = r5.e
            r0.setColor(r2)
            android.graphics.Paint r0 = r5.a
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL
            r0.setStyle(r2)
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r5.c = r0
            r0.setAntiAlias(r1)
            android.graphics.Paint r0 = r5.c
            int r3 = r5.h
            r0.setColor(r3)
            android.graphics.Paint r0 = r5.c
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.STROKE
            r0.setStyle(r3)
            android.graphics.Paint r0 = r5.c
            float r4 = r5.k
            r0.setStrokeWidth(r4)
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r5.b = r0
            r0.setAntiAlias(r1)
            android.graphics.Paint r0 = r5.b
            int r4 = r5.f
            r0.setColor(r4)
            android.graphics.Paint r0 = r5.b
            r0.setStyle(r3)
            android.graphics.Paint r0 = r5.b
            float r3 = r5.k
            r0.setStrokeWidth(r3)
            android.graphics.Paint r0 = r5.b
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.ROUND
            r0.setStrokeCap(r3)
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r5.d = r0
            r0.setAntiAlias(r1)
            android.graphics.Paint r0 = r5.d
            r0.setStyle(r2)
            android.graphics.Paint r0 = r5.d
            int r1 = r5.g
            r0.setColor(r1)
            android.graphics.Paint r0 = r5.d
            float r1 = r5.i
            r2 = 1077936128(0x40400000, float:3.0)
            float r1 = r1 * r2
            r2 = 1084227584(0x40a00000, float:5.0)
            float r1 = r1 / r2
            r0.setTextSize(r1)
            android.graphics.Paint r0 = r5.d
            java.lang.String r1 = "#000000"
            int r1 = android.graphics.Color.parseColor(r1)
            r2 = 1073741824(0x40000000, float:2.0)
            r3 = 1065353216(0x3f800000, float:1.0)
            r0.setShadowLayer(r2, r3, r3, r1)
            android.graphics.Paint r0 = r5.d
            android.graphics.Paint$FontMetrics r0 = r0.getFontMetrics()
            float r1 = r0.descent
            float r0 = r0.ascent
            float r1 = r1 - r0
            double r0 = (double) r1
            double r0 = java.lang.Math.ceil(r0)
            int r0 = (int) r0
            float r0 = (float) r0
            r5.f86o = r0
            return
    }

    private void a(android.content.Context r6, android.util.AttributeSet r7) {
            r5 = this;
            android.content.res.Resources$Theme r6 = r6.getTheme()
            int[] r0 = com.beizi.fusion.R.styleable.BeiZiCircleProgressViewStyle
            r1 = 0
            android.content.res.TypedArray r6 = r6.obtainStyledAttributes(r7, r0, r1, r1)
            android.content.res.Resources r7 = r5.getResources()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            r0 = 1099956224(0x41900000, float:18.0)
            r2 = 1
            float r0 = android.util.TypedValue.applyDimension(r2, r0, r7)
            r3 = 1082130432(0x40800000, float:4.0)
            float r3 = android.util.TypedValue.applyDimension(r2, r3, r7)
            r4 = 1112014848(0x42480000, float:50.0)
            float r7 = android.util.TypedValue.applyDimension(r2, r4, r7)
            r5.f89r = r7
            int r7 = com.beizi.fusion.R.styleable.BeiZiCircleProgressViewStyle_adScopeRadius
            float r7 = r6.getDimension(r7, r0)
            r5.i = r7
            int r7 = com.beizi.fusion.R.styleable.BeiZiCircleProgressViewStyle_adScopeStrokeWidth
            float r7 = r6.getDimension(r7, r3)
            r5.k = r7
            int r7 = com.beizi.fusion.R.styleable.BeiZiCircleProgressViewStyle_adScopeCircleColor
            int r7 = r6.getColor(r7, r1)
            r5.e = r7
            int r7 = com.beizi.fusion.R.styleable.BeiZiCircleProgressViewStyle_adScopeRingColor
            r0 = -41216(0xffffffffffff5f00, float:NaN)
            int r7 = r6.getColor(r7, r0)
            r5.f = r7
            int r7 = com.beizi.fusion.R.styleable.BeiZiCircleProgressViewStyle_adScopeTextColor
            r0 = -1
            int r7 = r6.getColor(r7, r0)
            r5.g = r7
            int r7 = com.beizi.fusion.R.styleable.BeiZiCircleProgressViewStyle_adScopeRingBgColor
            r0 = 1589427388(0x5ebcbcbc, float:6.799976E18)
            int r7 = r6.getColor(r7, r0)
            r5.h = r7
            float r7 = r5.i
            float r0 = r5.k
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            float r7 = r7 + r0
            r5.j = r7
            r6.recycle()
            return
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r9) {
            r8 = this;
            int r1 = r8.getWidth()
            r6 = 2
            int r1 = r1 / r6
            r8.f83l = r1
            int r1 = r8.getHeight()
            int r1 = r1 / r6
            r8.f84m = r1
            int r2 = r8.f83l
            float r2 = (float) r2
            float r1 = (float) r1
            float r3 = r8.i
            android.graphics.Paint r4 = r8.a
            r9.drawCircle(r2, r1, r3, r4)
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            int r2 = r8.f83l
            float r3 = (float) r2
            float r4 = r8.j
            float r3 = r3 - r4
            r1.left = r3
            int r3 = r8.f84m
            float r5 = (float) r3
            float r5 = r5 - r4
            r1.top = r5
            r7 = 1073741824(0x40000000, float:2.0)
            float r5 = r4 * r7
            float r2 = (float) r2
            float r2 = r2 - r4
            float r5 = r5 + r2
            r1.right = r5
            float r2 = r4 * r7
            float r3 = (float) r3
            float r3 = r3 - r4
            float r2 = r2 + r3
            r1.bottom = r2
            r4 = 0
            android.graphics.Paint r5 = r8.c
            r2 = 0
            r3 = 1135869952(0x43b40000, float:360.0)
            r0 = r9
            r0.drawArc(r1, r2, r3, r4, r5)
            int r0 = r8.f88q
            if (r0 <= 0) goto L9e
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            int r0 = r8.f83l
            float r2 = (float) r0
            float r3 = r8.j
            float r2 = r2 - r3
            r1.left = r2
            int r2 = r8.f84m
            float r4 = (float) r2
            float r4 = r4 - r3
            r1.top = r4
            float r4 = r3 * r7
            float r0 = (float) r0
            float r0 = r0 - r3
            float r4 = r4 + r0
            r1.right = r4
            float r0 = r3 * r7
            float r2 = (float) r2
            float r2 = r2 - r3
            float r0 = r0 + r2
            r1.bottom = r0
            int r0 = r8.f88q
            float r0 = (float) r0
            int r2 = r8.f87p
            float r2 = (float) r2
            float r0 = r0 / r2
            r2 = 1135869952(0x43b40000, float:360.0)
            float r3 = r0 * r2
            r4 = 0
            android.graphics.Paint r5 = r8.b
            r2 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r0 = r9
            r0.drawArc(r1, r2, r3, r4, r5)
            android.graphics.Paint r1 = r8.d
            r2 = 0
            java.lang.String r3 = "跳过"
            float r1 = r1.measureText(r3, r2, r6)
            r8.f85n = r1
            int r2 = r8.f83l
            float r2 = (float) r2
            float r1 = r1 / r7
            float r2 = r2 - r1
            int r1 = r8.f84m
            float r1 = (float) r1
            float r4 = r8.f86o
            r5 = 1082130432(0x40800000, float:4.0)
            float r4 = r4 / r5
            float r1 = r1 + r4
            android.graphics.Paint r4 = r8.d
            r9.drawText(r3, r2, r1, r4)
        L9e:
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r4, int r5) {
            r3 = this;
            super.onMeasure(r4, r5)
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r1 = android.view.View.MeasureSpec.getMode(r5)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L18
            goto L27
        L18:
            float r4 = r3.f89r
            int r0 = r3.getPaddingLeft()
            float r0 = (float) r0
            float r0 = r0 + r4
            int r4 = r3.getPaddingRight()
            float r4 = (float) r4
            float r0 = r0 + r4
            int r4 = (int) r0
        L27:
            if (r1 != r2) goto L2a
            goto L39
        L2a:
            float r5 = r3.f89r
            int r0 = r3.getPaddingTop()
            float r0 = (float) r0
            float r0 = r0 + r5
            int r5 = r3.getPaddingBottom()
            float r5 = (float) r5
            float r0 = r0 + r5
            int r5 = (int) r0
        L39:
            r3.setMeasuredDimension(r4, r5)
            return
    }

    public void setProgress(int r1) {
            r0 = this;
            r0.f88q = r1
            r0.postInvalidate()
            return
    }
}
