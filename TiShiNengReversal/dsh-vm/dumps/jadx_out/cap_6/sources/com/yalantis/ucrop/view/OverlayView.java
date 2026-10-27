package com.yalantis.ucrop.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class OverlayView extends android.view.View {
    public static final int C = 0;
    public static final int D = 1;
    public static final int E = 2;
    public static final boolean F = true;
    public static final boolean G = true;
    public static final boolean H = false;
    public static final int I = 0;
    public static final int J = 2;
    public static final int K = 2;
    private e3.d A;
    private boolean B;
    private final android.graphics.RectF a;
    private final android.graphics.RectF b;
    protected int c;
    protected int d;
    protected float[] e;
    protected float[] f;
    private int g;
    private int h;
    private float i;
    private float[] j;
    private boolean k;
    private boolean l;
    private boolean m;
    private int n;
    private android.graphics.Path o;
    private android.graphics.Paint p;

    /* renamed from: q, reason: collision with root package name */
    private android.graphics.Paint f45q;
    private android.graphics.Paint r;
    private android.graphics.Paint s;
    private int t;
    private float u;
    private float v;
    private int w;
    private int x;
    private int y;
    private int z;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface FreestyleMode {
    }

    public OverlayView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public OverlayView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public OverlayView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.a = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.b = r1
            r1 = 0
            r0.j = r1
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r0.o = r1
            android.graphics.Paint r1 = new android.graphics.Paint
            r2 = 1
            r1.<init>(r2)
            r0.p = r1
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>(r2)
            r0.f45q = r1
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>(r2)
            r0.r = r1
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>(r2)
            r0.s = r1
            r1 = 0
            r0.t = r1
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.u = r1
            r0.v = r1
            r1 = -1
            r0.w = r1
            android.content.res.Resources r1 = r0.getResources()
            int r2 = com.yalantis.ucrop.R.dimen.ucrop_default_crop_rect_corner_touch_threshold
            int r1 = r1.getDimensionPixelSize(r2)
            r0.x = r1
            android.content.res.Resources r1 = r0.getResources()
            int r2 = com.yalantis.ucrop.R.dimen.ucrop_default_crop_rect_min_size
            int r1 = r1.getDimensionPixelSize(r2)
            r0.y = r1
            android.content.res.Resources r1 = r0.getResources()
            int r2 = com.yalantis.ucrop.R.dimen.ucrop_default_crop_rect_corner_touch_area_line_length
            int r1 = r1.getDimensionPixelSize(r2)
            r0.z = r1
            r0.d()
            return
    }

    private int c(float r11, float r12) {
            r10 = this;
            int r0 = r10.x
            double r0 = (double) r0
            r2 = -1
            r3 = 0
        L5:
            r4 = 8
            if (r3 >= r4) goto L33
            float[] r4 = r10.e
            r4 = r4[r3]
            float r4 = r11 - r4
            double r4 = (double) r4
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r4 = java.lang.Math.pow(r4, r6)
            float[] r8 = r10.e
            int r9 = r3 + 1
            r8 = r8[r9]
            float r8 = r12 - r8
            double r8 = (double) r8
            double r6 = java.lang.Math.pow(r8, r6)
            double r4 = r4 + r6
            double r4 = java.lang.Math.sqrt(r4)
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 >= 0) goto L30
            int r0 = r3 / 2
            r2 = r0
            r0 = r4
        L30:
            int r3 = r3 + 2
            goto L5
        L33:
            int r0 = r10.t
            r1 = 1
            if (r0 != r1) goto L44
            if (r2 >= 0) goto L44
            android.graphics.RectF r0 = r10.a
            boolean r11 = r0.contains(r11, r12)
            if (r11 == 0) goto L44
            r11 = 4
            return r11
        L44:
            return r2
    }

    private void e(@androidx.annotation.NonNull android.content.res.TypedArray r5) {
            r4 = this;
            int r0 = com.yalantis.ucrop.R.styleable.ucrop_UCropView_ucrop_frame_stroke_size
            android.content.res.Resources r1 = r4.getResources()
            int r2 = com.yalantis.ucrop.R.dimen.ucrop_default_crop_frame_stoke_width
            int r1 = r1.getDimensionPixelSize(r2)
            int r0 = r5.getDimensionPixelSize(r0, r1)
            int r1 = com.yalantis.ucrop.R.styleable.ucrop_UCropView_ucrop_frame_color
            android.content.res.Resources r2 = r4.getResources()
            int r3 = com.yalantis.ucrop.R.color.ucrop_color_default_crop_frame
            int r2 = r2.getColor(r3)
            int r5 = r5.getColor(r1, r2)
            android.graphics.Paint r1 = r4.r
            float r2 = (float) r0
            r1.setStrokeWidth(r2)
            android.graphics.Paint r1 = r4.r
            r1.setColor(r5)
            android.graphics.Paint r1 = r4.r
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            r1.setStyle(r2)
            android.graphics.Paint r1 = r4.s
            int r0 = r0 * 3
            float r0 = (float) r0
            r1.setStrokeWidth(r0)
            android.graphics.Paint r0 = r4.s
            r0.setColor(r5)
            android.graphics.Paint r5 = r4.s
            r5.setStyle(r2)
            return
    }

    private void f(@androidx.annotation.NonNull android.content.res.TypedArray r5) {
            r4 = this;
            int r0 = com.yalantis.ucrop.R.styleable.ucrop_UCropView_ucrop_grid_stroke_size
            android.content.res.Resources r1 = r4.getResources()
            int r2 = com.yalantis.ucrop.R.dimen.ucrop_default_crop_grid_stoke_width
            int r1 = r1.getDimensionPixelSize(r2)
            int r0 = r5.getDimensionPixelSize(r0, r1)
            int r1 = com.yalantis.ucrop.R.styleable.ucrop_UCropView_ucrop_grid_color
            android.content.res.Resources r2 = r4.getResources()
            int r3 = com.yalantis.ucrop.R.color.ucrop_color_default_crop_grid
            int r2 = r2.getColor(r3)
            int r1 = r5.getColor(r1, r2)
            android.graphics.Paint r2 = r4.f45q
            float r0 = (float) r0
            r2.setStrokeWidth(r0)
            android.graphics.Paint r0 = r4.f45q
            r0.setColor(r1)
            int r0 = com.yalantis.ucrop.R.styleable.ucrop_UCropView_ucrop_grid_row_count
            r1 = 2
            int r0 = r5.getInt(r0, r1)
            r4.g = r0
            int r0 = com.yalantis.ucrop.R.styleable.ucrop_UCropView_ucrop_grid_column_count
            int r5 = r5.getInt(r0, r1)
            r4.h = r5
            return
    }

    private void j(float r6, float r7) {
            r5 = this;
            android.graphics.RectF r0 = r5.b
            android.graphics.RectF r1 = r5.a
            r0.set(r1)
            int r0 = r5.w
            r1 = 1
            if (r0 == 0) goto L8a
            if (r0 == r1) goto L7e
            r2 = 2
            if (r0 == r2) goto L72
            r2 = 3
            if (r0 == r2) goto L66
            r2 = 4
            if (r0 == r2) goto L19
            goto L95
        L19:
            android.graphics.RectF r0 = r5.b
            float r1 = r5.u
            float r6 = r6 - r1
            float r1 = r5.v
            float r7 = r7 - r1
            r0.offset(r6, r7)
            android.graphics.RectF r6 = r5.b
            float r6 = r6.left
            int r7 = r5.getLeft()
            float r7 = (float) r7
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto Le3
            android.graphics.RectF r6 = r5.b
            float r6 = r6.top
            int r7 = r5.getTop()
            float r7 = (float) r7
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto Le3
            android.graphics.RectF r6 = r5.b
            float r6 = r6.right
            int r7 = r5.getRight()
            float r7 = (float) r7
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 >= 0) goto Le3
            android.graphics.RectF r6 = r5.b
            float r6 = r6.bottom
            int r7 = r5.getBottom()
            float r7 = (float) r7
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 >= 0) goto Le3
            android.graphics.RectF r6 = r5.a
            android.graphics.RectF r7 = r5.b
            r6.set(r7)
            r5.k()
            r5.postInvalidate()
            return
        L66:
            android.graphics.RectF r0 = r5.b
            android.graphics.RectF r2 = r5.a
            float r3 = r2.top
            float r2 = r2.right
            r0.set(r6, r3, r2, r7)
            goto L95
        L72:
            android.graphics.RectF r0 = r5.b
            android.graphics.RectF r2 = r5.a
            float r3 = r2.left
            float r2 = r2.top
            r0.set(r3, r2, r6, r7)
            goto L95
        L7e:
            android.graphics.RectF r0 = r5.b
            android.graphics.RectF r2 = r5.a
            float r3 = r2.left
            float r2 = r2.bottom
            r0.set(r3, r7, r6, r2)
            goto L95
        L8a:
            android.graphics.RectF r0 = r5.b
            android.graphics.RectF r2 = r5.a
            float r3 = r2.right
            float r2 = r2.bottom
            r0.set(r6, r7, r3, r2)
        L95:
            android.graphics.RectF r6 = r5.b
            float r6 = r6.height()
            int r7 = r5.y
            float r7 = (float) r7
            r0 = 0
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 < 0) goto La5
            r6 = 1
            goto La6
        La5:
            r6 = 0
        La6:
            android.graphics.RectF r7 = r5.b
            float r7 = r7.width()
            int r2 = r5.y
            float r2 = (float) r2
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 < 0) goto Lb4
            goto Lb5
        Lb4:
            r1 = 0
        Lb5:
            android.graphics.RectF r7 = r5.a
            if (r1 == 0) goto Lbe
            android.graphics.RectF r0 = r5.b
            float r0 = r0.left
            goto Lc0
        Lbe:
            float r0 = r7.left
        Lc0:
            if (r6 == 0) goto Lc7
            android.graphics.RectF r2 = r5.b
            float r2 = r2.top
            goto Lc9
        Lc7:
            float r2 = r7.top
        Lc9:
            if (r1 == 0) goto Ld0
            android.graphics.RectF r3 = r5.b
            float r3 = r3.right
            goto Ld2
        Ld0:
            float r3 = r7.right
        Ld2:
            if (r6 == 0) goto Ld9
            android.graphics.RectF r4 = r5.b
            float r4 = r4.bottom
            goto Ldb
        Ld9:
            float r4 = r7.bottom
        Ldb:
            r7.set(r0, r2, r3, r4)
            if (r6 != 0) goto Le4
            if (r1 == 0) goto Le3
            goto Le4
        Le3:
            return
        Le4:
            r5.k()
            r5.postInvalidate()
            return
    }

    private void k() {
            r5 = this;
            android.graphics.RectF r0 = r5.a
            float[] r0 = com.yalantis.ucrop.util.g.b(r0)
            r5.e = r0
            android.graphics.RectF r0 = r5.a
            float[] r0 = com.yalantis.ucrop.util.g.a(r0)
            r5.f = r0
            r0 = 0
            r5.j = r0
            android.graphics.Path r0 = r5.o
            r0.reset()
            android.graphics.Path r0 = r5.o
            android.graphics.RectF r1 = r5.a
            float r1 = r1.centerX()
            android.graphics.RectF r2 = r5.a
            float r2 = r2.centerY()
            android.graphics.RectF r3 = r5.a
            float r3 = r3.width()
            android.graphics.RectF r4 = r5.a
            float r4 = r4.height()
            float r3 = java.lang.Math.min(r3, r4)
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            android.graphics.Path$Direction r4 = android.graphics.Path.Direction.CW
            r0.addCircle(r1, r2, r3, r4)
            return
    }

    protected void a(@androidx.annotation.NonNull android.graphics.Canvas r11) {
            r10 = this;
            boolean r0 = r10.l
            if (r0 == 0) goto Lb9
            float[] r0 = r10.j
            if (r0 != 0) goto Lb0
            android.graphics.RectF r0 = r10.a
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lb0
            int r0 = r10.g
            int r0 = r0 * 4
            int r1 = r10.h
            int r1 = r1 * 4
            int r0 = r0 + r1
            float[] r0 = new float[r0]
            r10.j = r0
            r0 = 0
            r1 = 0
            r2 = 0
        L20:
            int r3 = r10.g
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r1 >= r3) goto L68
            float[] r3 = r10.j
            int r5 = r2 + 1
            android.graphics.RectF r6 = r10.a
            float r7 = r6.left
            r3[r2] = r7
            int r7 = r2 + 2
            float r6 = r6.height()
            float r8 = (float) r1
            float r8 = r8 + r4
            int r4 = r10.g
            int r4 = r4 + 1
            float r4 = (float) r4
            float r4 = r8 / r4
            float r6 = r6 * r4
            android.graphics.RectF r4 = r10.a
            float r9 = r4.top
            float r6 = r6 + r9
            r3[r5] = r6
            float[] r3 = r10.j
            int r5 = r2 + 3
            float r6 = r4.right
            r3[r7] = r6
            int r2 = r2 + 4
            float r4 = r4.height()
            int r6 = r10.g
            int r6 = r6 + 1
            float r6 = (float) r6
            float r8 = r8 / r6
            float r4 = r4 * r8
            android.graphics.RectF r6 = r10.a
            float r6 = r6.top
            float r4 = r4 + r6
            r3[r5] = r4
            int r1 = r1 + 1
            goto L20
        L68:
            int r1 = r10.h
            if (r0 >= r1) goto Lb0
            float[] r1 = r10.j
            int r3 = r2 + 1
            android.graphics.RectF r5 = r10.a
            float r5 = r5.width()
            float r6 = (float) r0
            float r6 = r6 + r4
            int r7 = r10.h
            int r7 = r7 + 1
            float r7 = (float) r7
            float r7 = r6 / r7
            float r5 = r5 * r7
            android.graphics.RectF r7 = r10.a
            float r8 = r7.left
            float r5 = r5 + r8
            r1[r2] = r5
            float[] r1 = r10.j
            int r5 = r2 + 2
            float r8 = r7.top
            r1[r3] = r8
            int r3 = r2 + 3
            float r7 = r7.width()
            int r8 = r10.h
            int r8 = r8 + 1
            float r8 = (float) r8
            float r6 = r6 / r8
            float r7 = r7 * r6
            android.graphics.RectF r6 = r10.a
            float r8 = r6.left
            float r7 = r7 + r8
            r1[r5] = r7
            float[] r1 = r10.j
            int r2 = r2 + 4
            float r5 = r6.bottom
            r1[r3] = r5
            int r0 = r0 + 1
            goto L68
        Lb0:
            float[] r0 = r10.j
            if (r0 == 0) goto Lb9
            android.graphics.Paint r1 = r10.f45q
            r11.drawLines(r0, r1)
        Lb9:
            boolean r0 = r10.k
            if (r0 == 0) goto Lc4
            android.graphics.RectF r0 = r10.a
            android.graphics.Paint r1 = r10.r
            r11.drawRect(r0, r1)
        Lc4:
            int r0 = r10.t
            if (r0 == 0) goto L103
            r11.save()
            android.graphics.RectF r0 = r10.b
            android.graphics.RectF r1 = r10.a
            r0.set(r1)
            android.graphics.RectF r0 = r10.b
            int r1 = r10.z
            float r2 = (float) r1
            int r1 = -r1
            float r1 = (float) r1
            r0.inset(r2, r1)
            android.graphics.RectF r0 = r10.b
            android.graphics.Region$Op r1 = android.graphics.Region.Op.DIFFERENCE
            r11.clipRect(r0, r1)
            android.graphics.RectF r0 = r10.b
            android.graphics.RectF r2 = r10.a
            r0.set(r2)
            android.graphics.RectF r0 = r10.b
            int r2 = r10.z
            int r3 = -r2
            float r3 = (float) r3
            float r2 = (float) r2
            r0.inset(r3, r2)
            android.graphics.RectF r0 = r10.b
            r11.clipRect(r0, r1)
            android.graphics.RectF r0 = r10.a
            android.graphics.Paint r1 = r10.s
            r11.drawRect(r0, r1)
            r11.restore()
        L103:
            return
    }

    protected void b(@androidx.annotation.NonNull android.graphics.Canvas r5) {
            r4 = this;
            r5.save()
            boolean r0 = r4.m
            if (r0 == 0) goto Lf
            android.graphics.Path r0 = r4.o
            android.graphics.Region$Op r1 = android.graphics.Region.Op.DIFFERENCE
            r5.clipPath(r0, r1)
            goto L16
        Lf:
            android.graphics.RectF r0 = r4.a
            android.graphics.Region$Op r1 = android.graphics.Region.Op.DIFFERENCE
            r5.clipRect(r0, r1)
        L16:
            int r0 = r4.n
            r5.drawColor(r0)
            r5.restore()
            boolean r0 = r4.m
            if (r0 == 0) goto L46
            android.graphics.RectF r0 = r4.a
            float r0 = r0.centerX()
            android.graphics.RectF r1 = r4.a
            float r1 = r1.centerY()
            android.graphics.RectF r2 = r4.a
            float r2 = r2.width()
            android.graphics.RectF r3 = r4.a
            float r3 = r3.height()
            float r2 = java.lang.Math.min(r2, r3)
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            android.graphics.Paint r3 = r4.p
            r5.drawCircle(r0, r1, r2, r3)
        L46:
            return
    }

    protected void d() {
            r0 = this;
            return
    }

    @java.lang.Deprecated
    public boolean g() {
            r2 = this;
            int r0 = r2.t
            r1 = 1
            if (r0 != r1) goto L6
            return r1
        L6:
            r0 = 0
            return r0
    }

    @androidx.annotation.NonNull
    public android.graphics.RectF getCropViewRect() {
            r1 = this;
            android.graphics.RectF r0 = r1.a
            return r0
    }

    public int getFreestyleCropMode() {
            r1 = this;
            int r0 = r1.t
            return r0
    }

    public e3.d getOverlayViewChangeListener() {
            r1 = this;
            e3.d r0 = r1.A
            return r0
    }

    protected void h(@androidx.annotation.NonNull android.content.res.TypedArray r4) {
            r3 = this;
            int r0 = com.yalantis.ucrop.R.styleable.ucrop_UCropView_ucrop_circle_dimmed_layer
            r1 = 0
            boolean r0 = r4.getBoolean(r0, r1)
            r3.m = r0
            int r0 = com.yalantis.ucrop.R.styleable.ucrop_UCropView_ucrop_dimmed_color
            android.content.res.Resources r1 = r3.getResources()
            int r2 = com.yalantis.ucrop.R.color.ucrop_color_default_dimmed
            int r1 = r1.getColor(r2)
            int r0 = r4.getColor(r0, r1)
            r3.n = r0
            android.graphics.Paint r1 = r3.p
            r1.setColor(r0)
            android.graphics.Paint r0 = r3.p
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            r0.setStyle(r1)
            android.graphics.Paint r0 = r3.p
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setStrokeWidth(r1)
            r3.e(r4)
            int r0 = com.yalantis.ucrop.R.styleable.ucrop_UCropView_ucrop_show_frame
            r1 = 1
            boolean r0 = r4.getBoolean(r0, r1)
            r3.k = r0
            r3.f(r4)
            int r0 = com.yalantis.ucrop.R.styleable.ucrop_UCropView_ucrop_show_grid
            boolean r4 = r4.getBoolean(r0, r1)
            r3.l = r4
            return
    }

    public void i() {
            r7 = this;
            int r0 = r7.c
            float r1 = (float) r0
            float r2 = r7.i
            float r1 = r1 / r2
            int r1 = (int) r1
            int r3 = r7.d
            if (r1 <= r3) goto L32
            float r1 = (float) r3
            float r1 = r1 * r2
            int r1 = (int) r1
            int r0 = r0 - r1
            int r0 = r0 / 2
            android.graphics.RectF r2 = r7.a
            int r3 = r7.getPaddingLeft()
            int r3 = r3 + r0
            float r3 = (float) r3
            int r4 = r7.getPaddingTop()
            float r4 = (float) r4
            int r5 = r7.getPaddingLeft()
            int r5 = r5 + r1
            int r5 = r5 + r0
            float r0 = (float) r5
            int r1 = r7.getPaddingTop()
            int r5 = r7.d
            int r1 = r1 + r5
            float r1 = (float) r1
            r2.set(r3, r4, r0, r1)
            goto L54
        L32:
            int r3 = r3 - r1
            int r3 = r3 / 2
            android.graphics.RectF r0 = r7.a
            int r2 = r7.getPaddingLeft()
            float r2 = (float) r2
            int r4 = r7.getPaddingTop()
            int r4 = r4 + r3
            float r4 = (float) r4
            int r5 = r7.getPaddingLeft()
            int r6 = r7.c
            int r5 = r5 + r6
            float r5 = (float) r5
            int r6 = r7.getPaddingTop()
            int r6 = r6 + r1
            int r6 = r6 + r3
            float r1 = (float) r6
            r0.set(r2, r4, r5, r1)
        L54:
            e3.d r0 = r7.A
            if (r0 == 0) goto L5d
            android.graphics.RectF r1 = r7.a
            r0.a(r1)
        L5d:
            r7.k()
            return
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r1) {
            r0 = this;
            super.onDraw(r1)
            r0.b(r1)
            r0.a(r1)
            return
    }

    @Override // android.view.View
    protected void onLayout(boolean r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            super.onLayout(r2, r3, r4, r5, r6)
            r3 = r2
            r2 = r1
            if (r3 == 0) goto L33
            int r3 = r1.getPaddingLeft()
            int r4 = r1.getPaddingTop()
            int r5 = r1.getWidth()
            int r6 = r1.getPaddingRight()
            int r5 = r5 - r6
            int r6 = r1.getHeight()
            int r0 = r1.getPaddingBottom()
            int r6 = r6 - r0
            int r5 = r5 - r3
            r2.c = r5
            int r6 = r6 - r4
            r2.d = r6
            boolean r3 = r2.B
            if (r3 == 0) goto L33
            r3 = 0
            r2.B = r3
            float r3 = r2.i
            r1.setTargetAspectRatio(r3)
        L33:
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r9) {
            r8 = this;
            android.graphics.RectF r0 = r8.a
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 != 0) goto L9f
            int r0 = r8.t
            if (r0 != 0) goto Lf
            goto L9f
        Lf:
            float r0 = r9.getX()
            float r2 = r9.getY()
            int r3 = r9.getAction()
            r3 = r3 & 255(0xff, float:3.57E-43)
            r4 = -1
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r6 = 1
            if (r3 != 0) goto L3f
            int r9 = r8.c(r0, r2)
            r8.w = r9
            if (r9 == r4) goto L2c
            r1 = 1
        L2c:
            if (r1 != 0) goto L33
            r8.u = r5
            r8.v = r5
            return r1
        L33:
            float r9 = r8.u
            r3 = 0
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 >= 0) goto L3e
            r8.u = r0
            r8.v = r2
        L3e:
            return r1
        L3f:
            int r3 = r9.getAction()
            r3 = r3 & 255(0xff, float:3.57E-43)
            r7 = 2
            if (r3 != r7) goto L88
            int r3 = r9.getPointerCount()
            if (r3 != r6) goto L88
            int r3 = r8.w
            if (r3 == r4) goto L88
            int r9 = r8.getPaddingLeft()
            float r9 = (float) r9
            float r9 = java.lang.Math.max(r0, r9)
            int r0 = r8.getWidth()
            int r1 = r8.getPaddingRight()
            int r0 = r0 - r1
            float r0 = (float) r0
            float r9 = java.lang.Math.min(r9, r0)
            int r0 = r8.getPaddingTop()
            float r0 = (float) r0
            float r0 = java.lang.Math.max(r2, r0)
            int r1 = r8.getHeight()
            int r2 = r8.getPaddingBottom()
            int r1 = r1 - r2
            float r1 = (float) r1
            float r0 = java.lang.Math.min(r0, r1)
            r8.j(r9, r0)
            r8.u = r9
            r8.v = r0
            return r6
        L88:
            int r9 = r9.getAction()
            r9 = r9 & 255(0xff, float:3.57E-43)
            if (r9 != r6) goto L9f
            r8.u = r5
            r8.v = r5
            r8.w = r4
            e3.d r9 = r8.A
            if (r9 == 0) goto L9f
            android.graphics.RectF r0 = r8.a
            r9.a(r0)
        L9f:
            return r1
    }

    public void setCircleDimmedLayer(boolean r1) {
            r0 = this;
            r0.m = r1
            return
    }

    public void setCropFrameColor(@androidx.annotation.ColorInt int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.r
            r0.setColor(r2)
            return
    }

    public void setCropFrameStrokeWidth(@androidx.annotation.IntRange(from = 0) int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.r
            float r2 = (float) r2
            r0.setStrokeWidth(r2)
            return
    }

    public void setCropGridColor(@androidx.annotation.ColorInt int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.f45q
            r0.setColor(r2)
            return
    }

    public void setCropGridColumnCount(@androidx.annotation.IntRange(from = 0) int r1) {
            r0 = this;
            r0.h = r1
            r1 = 0
            r0.j = r1
            return
    }

    public void setCropGridRowCount(@androidx.annotation.IntRange(from = 0) int r1) {
            r0 = this;
            r0.g = r1
            r1 = 0
            r0.j = r1
            return
    }

    public void setCropGridStrokeWidth(@androidx.annotation.IntRange(from = 0) int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.f45q
            float r2 = (float) r2
            r0.setStrokeWidth(r2)
            return
    }

    public void setDimmedColor(@androidx.annotation.ColorInt int r1) {
            r0 = this;
            r0.n = r1
            return
    }

    @java.lang.Deprecated
    public void setFreestyleCropEnabled(boolean r1) {
            r0 = this;
            r0.t = r1
            return
    }

    public void setFreestyleCropMode(int r1) {
            r0 = this;
            r0.t = r1
            r0.postInvalidate()
            return
    }

    public void setOverlayViewChangeListener(e3.d r1) {
            r0 = this;
            r0.A = r1
            return
    }

    public void setShowCropFrame(boolean r1) {
            r0 = this;
            r0.k = r1
            return
    }

    public void setShowCropGrid(boolean r1) {
            r0 = this;
            r0.l = r1
            return
    }

    public void setTargetAspectRatio(float r1) {
            r0 = this;
            r0.i = r1
            int r1 = r0.c
            if (r1 <= 0) goto Ld
            r0.i()
            r0.postInvalidate()
            return
        Ld:
            r1 = 1
            r0.B = r1
            return
    }
}
