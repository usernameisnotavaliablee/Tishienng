package com.bxkj.student.common.crop.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class CircleImageView extends androidx.appcompat.widget.AppCompatImageView {
    private static final android.widget.ImageView.ScaleType A = null;
    private static final android.graphics.Bitmap.Config B = null;
    private static final int C = 2;
    private static final int D = 0;
    private static final int E = -16777216;
    private static final int F = 0;
    private static final boolean G = false;
    private final android.graphics.RectF g;
    private final android.graphics.RectF h;
    private final android.graphics.Matrix i;
    private final android.graphics.Paint j;
    private final android.graphics.Paint k;

    /* renamed from: l, reason: collision with root package name */
    private final android.graphics.Paint f736l;

    /* renamed from: m, reason: collision with root package name */
    private int f737m;

    /* renamed from: n, reason: collision with root package name */
    private int f738n;

    /* renamed from: o, reason: collision with root package name */
    private int f739o;

    /* renamed from: p, reason: collision with root package name */
    private android.graphics.Bitmap f740p;

    /* renamed from: q, reason: collision with root package name */
    private android.graphics.BitmapShader f741q;

    /* renamed from: r, reason: collision with root package name */
    private int f742r;

    /* renamed from: s, reason: collision with root package name */
    private int f743s;

    /* renamed from: t, reason: collision with root package name */
    private float f744t;

    /* renamed from: u, reason: collision with root package name */
    private float f745u;

    /* renamed from: v, reason: collision with root package name */
    private android.graphics.ColorFilter f746v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f747w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f748x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f749y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f750z;

    static {
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP
            com.bxkj.student.common.crop.view.CircleImageView.A = r0
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            com.bxkj.student.common.crop.view.CircleImageView.B = r0
            return
    }

    public CircleImageView(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.g = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.h = r1
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r0.i = r1
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r0.j = r1
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r0.k = r1
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r0.f736l = r1
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0.f737m = r1
            r1 = 0
            r0.f738n = r1
            r0.f739o = r1
            r0.d()
            return
    }

    public CircleImageView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public CircleImageView(android.content.Context r4, android.util.AttributeSet r5, int r6) {
            r3 = this;
            r3.<init>(r4, r5, r6)
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r3.g = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r3.h = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r3.i = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r3.j = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r3.k = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r3.f736l = r0
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3.f737m = r0
            r1 = 0
            r3.f738n = r1
            r3.f739o = r1
            int[] r2 = com.bxkj.student.R.styleable.CircleImageView
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r2, r6, r1)
            r5 = 4
            int r5 = r4.getDimensionPixelSize(r5, r1)
            r3.f738n = r5
            r5 = 2
            int r5 = r4.getColor(r5, r0)
            r3.f737m = r5
            r5 = 3
            boolean r5 = r4.getBoolean(r5, r1)
            r3.f749y = r5
            r5 = 5
            int r5 = r4.getColor(r5, r1)
            r3.f739o = r5
            r4.recycle()
            r3.d()
            return
    }

    private void b() {
            r2 = this;
            android.graphics.Paint r0 = r2.j
            if (r0 == 0) goto L9
            android.graphics.ColorFilter r1 = r2.f746v
            r0.setColorFilter(r1)
        L9:
            return
    }

    private android.graphics.RectF c() {
            r5 = this;
            int r0 = r5.getWidth()
            int r1 = r5.getPaddingLeft()
            int r0 = r0 - r1
            int r1 = r5.getPaddingRight()
            int r0 = r0 - r1
            int r1 = r5.getHeight()
            int r2 = r5.getPaddingTop()
            int r1 = r1 - r2
            int r2 = r5.getPaddingBottom()
            int r1 = r1 - r2
            int r2 = java.lang.Math.min(r0, r1)
            int r3 = r5.getPaddingLeft()
            float r3 = (float) r3
            int r0 = r0 - r2
            float r0 = (float) r0
            r4 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r4
            float r3 = r3 + r0
            int r0 = r5.getPaddingTop()
            float r0 = (float) r0
            int r1 = r1 - r2
            float r1 = (float) r1
            float r1 = r1 / r4
            float r0 = r0 + r1
            android.graphics.RectF r1 = new android.graphics.RectF
            float r2 = (float) r2
            float r4 = r3 + r2
            float r2 = r2 + r0
            r1.<init>(r3, r0, r4, r2)
            return r1
    }

    private void d() {
            r1 = this;
            android.widget.ImageView$ScaleType r0 = com.bxkj.student.common.crop.view.CircleImageView.A
            super/*android.widget.ImageView*/.setScaleType(r0)
            r0 = 1
            r1.f747w = r0
            boolean r0 = r1.f748x
            if (r0 == 0) goto L12
            r1.setup()
            r0 = 0
            r1.f748x = r0
        L12:
            return
    }

    private void e() {
            r1 = this;
            boolean r0 = r1.f750z
            if (r0 == 0) goto L8
            r0 = 0
            r1.f740p = r0
            goto L12
        L8:
            android.graphics.drawable.Drawable r0 = r1.getDrawable()
            android.graphics.Bitmap r0 = r1.getBitmapFromDrawable(r0)
            r1.f740p = r0
        L12:
            r1.setup()
            return
    }

    private android.graphics.Bitmap getBitmapFromDrawable(android.graphics.drawable.Drawable r7) {
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof android.graphics.drawable.BitmapDrawable
            if (r1 == 0) goto Lf
            android.graphics.drawable.BitmapDrawable r7 = (android.graphics.drawable.BitmapDrawable) r7
            android.graphics.Bitmap r7 = r7.getBitmap()
            return r7
        Lf:
            boolean r1 = r7 instanceof android.graphics.drawable.ColorDrawable     // Catch: java.lang.Exception -> L3e
            if (r1 == 0) goto L1b
            android.graphics.Bitmap$Config r1 = com.bxkj.student.common.crop.view.CircleImageView.B     // Catch: java.lang.Exception -> L3e
            r2 = 2
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r2, r2, r1)     // Catch: java.lang.Exception -> L3e
            goto L29
        L1b:
            int r1 = r7.getIntrinsicWidth()     // Catch: java.lang.Exception -> L3e
            int r2 = r7.getIntrinsicHeight()     // Catch: java.lang.Exception -> L3e
            android.graphics.Bitmap$Config r3 = com.bxkj.student.common.crop.view.CircleImageView.B     // Catch: java.lang.Exception -> L3e
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r1, r2, r3)     // Catch: java.lang.Exception -> L3e
        L29:
            android.graphics.Canvas r2 = new android.graphics.Canvas     // Catch: java.lang.Exception -> L3e
            r2.<init>(r1)     // Catch: java.lang.Exception -> L3e
            int r3 = r2.getWidth()     // Catch: java.lang.Exception -> L3e
            int r4 = r2.getHeight()     // Catch: java.lang.Exception -> L3e
            r5 = 0
            r7.setBounds(r5, r5, r3, r4)     // Catch: java.lang.Exception -> L3e
            r7.draw(r2)     // Catch: java.lang.Exception -> L3e
            return r1
        L3e:
            return r0
    }

    private void setup() {
            r5 = this;
            boolean r0 = r5.f747w
            r1 = 1
            if (r0 != 0) goto L8
            r5.f748x = r1
            return
        L8:
            int r0 = r5.getWidth()
            if (r0 != 0) goto L15
            int r0 = r5.getHeight()
            if (r0 != 0) goto L15
            return
        L15:
            android.graphics.Bitmap r0 = r5.f740p
            if (r0 != 0) goto L1d
            r5.invalidate()
            return
        L1d:
            android.graphics.BitmapShader r0 = new android.graphics.BitmapShader
            android.graphics.Bitmap r2 = r5.f740p
            android.graphics.Shader$TileMode r3 = android.graphics.Shader.TileMode.CLAMP
            r0.<init>(r2, r3, r3)
            r5.f741q = r0
            android.graphics.Paint r0 = r5.j
            r0.setAntiAlias(r1)
            android.graphics.Paint r0 = r5.j
            android.graphics.BitmapShader r2 = r5.f741q
            r0.setShader(r2)
            android.graphics.Paint r0 = r5.k
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            r0.setStyle(r2)
            android.graphics.Paint r0 = r5.k
            r0.setAntiAlias(r1)
            android.graphics.Paint r0 = r5.k
            int r2 = r5.f737m
            r0.setColor(r2)
            android.graphics.Paint r0 = r5.k
            int r2 = r5.f738n
            float r2 = (float) r2
            r0.setStrokeWidth(r2)
            android.graphics.Paint r0 = r5.f736l
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL
            r0.setStyle(r2)
            android.graphics.Paint r0 = r5.f736l
            r0.setAntiAlias(r1)
            android.graphics.Paint r0 = r5.f736l
            int r1 = r5.f739o
            r0.setColor(r1)
            android.graphics.Bitmap r0 = r5.f740p
            int r0 = r0.getHeight()
            r5.f743s = r0
            android.graphics.Bitmap r0 = r5.f740p
            int r0 = r0.getWidth()
            r5.f742r = r0
            android.graphics.RectF r0 = r5.h
            android.graphics.RectF r1 = r5.c()
            r0.set(r1)
            android.graphics.RectF r0 = r5.h
            float r0 = r0.height()
            int r1 = r5.f738n
            float r1 = (float) r1
            float r0 = r0 - r1
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            android.graphics.RectF r2 = r5.h
            float r2 = r2.width()
            int r3 = r5.f738n
            float r3 = (float) r3
            float r2 = r2 - r3
            float r2 = r2 / r1
            float r0 = java.lang.Math.min(r0, r2)
            r5.f745u = r0
            android.graphics.RectF r0 = r5.g
            android.graphics.RectF r2 = r5.h
            r0.set(r2)
            boolean r0 = r5.f749y
            if (r0 != 0) goto Lb3
            int r0 = r5.f738n
            if (r0 <= 0) goto Lb3
            android.graphics.RectF r2 = r5.g
            float r3 = (float) r0
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 - r4
            float r0 = (float) r0
            float r0 = r0 - r4
            r2.inset(r3, r0)
        Lb3:
            android.graphics.RectF r0 = r5.g
            float r0 = r0.height()
            float r0 = r0 / r1
            android.graphics.RectF r2 = r5.g
            float r2 = r2.width()
            float r2 = r2 / r1
            float r0 = java.lang.Math.min(r0, r2)
            r5.f744t = r0
            r5.b()
            r5.updateShaderMatrix()
            r5.invalidate()
            return
    }

    private void updateShaderMatrix() {
            r6 = this;
            android.graphics.Matrix r0 = r6.i
            r1 = 0
            r0.set(r1)
            int r0 = r6.f742r
            float r0 = (float) r0
            android.graphics.RectF r1 = r6.g
            float r1 = r1.height()
            float r0 = r0 * r1
            android.graphics.RectF r1 = r6.g
            float r1 = r1.width()
            int r2 = r6.f743s
            float r2 = (float) r2
            float r1 = r1 * r2
            r2 = 1056964608(0x3f000000, float:0.5)
            r3 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L3e
            android.graphics.RectF r0 = r6.g
            float r0 = r0.height()
            int r1 = r6.f743s
            float r1 = (float) r1
            float r0 = r0 / r1
            android.graphics.RectF r1 = r6.g
            float r1 = r1.width()
            int r4 = r6.f742r
            float r4 = (float) r4
            float r4 = r4 * r0
            float r1 = r1 - r4
            float r1 = r1 * r2
            r3 = r1
            r1 = 0
            goto L56
        L3e:
            android.graphics.RectF r0 = r6.g
            float r0 = r0.width()
            int r1 = r6.f742r
            float r1 = (float) r1
            float r0 = r0 / r1
            android.graphics.RectF r1 = r6.g
            float r1 = r1.height()
            int r4 = r6.f743s
            float r4 = (float) r4
            float r4 = r4 * r0
            float r1 = r1 - r4
            float r1 = r1 * r2
        L56:
            android.graphics.Matrix r4 = r6.i
            r4.setScale(r0, r0)
            android.graphics.Matrix r0 = r6.i
            float r3 = r3 + r2
            int r3 = (int) r3
            float r3 = (float) r3
            android.graphics.RectF r4 = r6.g
            float r5 = r4.left
            float r3 = r3 + r5
            float r1 = r1 + r2
            int r1 = (int) r1
            float r1 = (float) r1
            float r2 = r4.top
            float r1 = r1 + r2
            r0.postTranslate(r3, r1)
            android.graphics.BitmapShader r0 = r6.f741q
            android.graphics.Matrix r1 = r6.i
            r0.setLocalMatrix(r1)
            return
    }

    public boolean f() {
            r1 = this;
            boolean r0 = r1.f749y
            return r0
    }

    public boolean g() {
            r1 = this;
            boolean r0 = r1.f750z
            return r0
    }

    public int getBorderColor() {
            r1 = this;
            int r0 = r1.f737m
            return r0
    }

    public int getBorderWidth() {
            r1 = this;
            int r0 = r1.f738n
            return r0
    }

    public android.graphics.ColorFilter getColorFilter() {
            r1 = this;
            android.graphics.ColorFilter r0 = r1.f746v
            return r0
    }

    @java.lang.Deprecated
    public int getFillColor() {
            r1 = this;
            int r0 = r1.f739o
            return r0
    }

    public android.widget.ImageView.ScaleType getScaleType() {
            r1 = this;
            android.widget.ImageView$ScaleType r0 = com.bxkj.student.common.crop.view.CircleImageView.A
            return r0
    }

    protected void onDraw(android.graphics.Canvas r5) {
            r4 = this;
            boolean r0 = r4.f750z
            if (r0 == 0) goto L8
            super/*android.widget.ImageView*/.onDraw(r5)
            return
        L8:
            android.graphics.Bitmap r0 = r4.f740p
            if (r0 != 0) goto Ld
            goto L4e
        Ld:
            int r0 = r4.f739o
            if (r0 == 0) goto L24
            android.graphics.RectF r0 = r4.g
            float r0 = r0.centerX()
            android.graphics.RectF r1 = r4.g
            float r1 = r1.centerY()
            float r2 = r4.f744t
            android.graphics.Paint r3 = r4.f736l
            r5.drawCircle(r0, r1, r2, r3)
        L24:
            android.graphics.RectF r0 = r4.g
            float r0 = r0.centerX()
            android.graphics.RectF r1 = r4.g
            float r1 = r1.centerY()
            float r2 = r4.f744t
            android.graphics.Paint r3 = r4.j
            r5.drawCircle(r0, r1, r2, r3)
            int r0 = r4.f738n
            if (r0 <= 0) goto L4e
            android.graphics.RectF r0 = r4.h
            float r0 = r0.centerX()
            android.graphics.RectF r1 = r4.h
            float r1 = r1.centerY()
            float r2 = r4.f745u
            android.graphics.Paint r3 = r4.k
            r5.drawCircle(r0, r1, r2, r3)
        L4e:
            return
    }

    protected void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            super/*android.widget.ImageView*/.onSizeChanged(r1, r2, r3, r4)
            r0.setup()
            return
    }

    public void setAdjustViewBounds(boolean r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "adjustViewBounds not supported."
            r2.<init>(r0)
            throw r2
    }

    public void setBorderColor(@androidx.annotation.ColorInt int r2) {
            r1 = this;
            int r0 = r1.f737m
            if (r2 != r0) goto L5
            return
        L5:
            r1.f737m = r2
            android.graphics.Paint r0 = r1.k
            r0.setColor(r2)
            r1.invalidate()
            return
    }

    @java.lang.Deprecated
    public void setBorderColorResource(@androidx.annotation.ColorRes int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.content.res.Resources r0 = r0.getResources()
            int r2 = r0.getColor(r2)
            r1.setBorderColor(r2)
            return
    }

    public void setBorderOverlay(boolean r2) {
            r1 = this;
            boolean r0 = r1.f749y
            if (r2 != r0) goto L5
            return
        L5:
            r1.f749y = r2
            r1.setup()
            return
    }

    public void setBorderWidth(int r2) {
            r1 = this;
            int r0 = r1.f738n
            if (r2 != r0) goto L5
            return
        L5:
            r1.f738n = r2
            r1.setup()
            return
    }

    public void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.ColorFilter r0 = r1.f746v
            if (r2 != r0) goto L5
            return
        L5:
            r1.f746v = r2
            r1.b()
            r1.invalidate()
            return
    }

    public void setDisableCircularTransformation(boolean r2) {
            r1 = this;
            boolean r0 = r1.f750z
            if (r0 != r2) goto L5
            return
        L5:
            r1.f750z = r2
            r1.e()
            return
    }

    @java.lang.Deprecated
    public void setFillColor(@androidx.annotation.ColorInt int r2) {
            r1 = this;
            int r0 = r1.f739o
            if (r2 != r0) goto L5
            return
        L5:
            r1.f739o = r2
            android.graphics.Paint r0 = r1.f736l
            r0.setColor(r2)
            r1.invalidate()
            return
    }

    @java.lang.Deprecated
    public void setFillColorResource(@androidx.annotation.ColorRes int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.content.res.Resources r0 = r0.getResources()
            int r2 = r0.getColor(r2)
            r1.setFillColor(r2)
            return
    }

    public void setImageBitmap(android.graphics.Bitmap r1) {
            r0 = this;
            super.setImageBitmap(r1)
            r0.e()
            return
    }

    public void setImageDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setImageDrawable(r1)
            r0.e()
            return
    }

    public void setImageResource(@androidx.annotation.DrawableRes int r1) {
            r0 = this;
            super.setImageResource(r1)
            r0.e()
            return
    }

    public void setImageURI(android.net.Uri r1) {
            r0 = this;
            super.setImageURI(r1)
            r0.e()
            return
    }

    public void setPadding(int r1, int r2, int r3, int r4) {
            r0 = this;
            super/*android.widget.ImageView*/.setPadding(r1, r2, r3, r4)
            r0.setup()
            return
    }

    public void setPaddingRelative(int r1, int r2, int r3, int r4) {
            r0 = this;
            super/*android.widget.ImageView*/.setPaddingRelative(r1, r2, r3, r4)
            r0.setup()
            return
    }

    public void setScaleType(android.widget.ImageView.ScaleType r4) {
            r3 = this;
            android.widget.ImageView$ScaleType r0 = com.bxkj.student.common.crop.view.CircleImageView.A
            if (r4 != r0) goto L5
            return
        L5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.String r4 = "ScaleType %s not supported."
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
    }
}
