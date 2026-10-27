package com.bxkj.student.common.crop.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ClipViewLayout extends android.widget.RelativeLayout {

    /* renamed from: n, reason: collision with root package name */
    private static final int f751n = 0;

    /* renamed from: o, reason: collision with root package name */
    private static final int f752o = 1;

    /* renamed from: p, reason: collision with root package name */
    private static final int f753p = 2;
    private android.widget.ImageView a;
    private com.bxkj.student.common.crop.view.ClipView b;
    private float c;
    private float d;
    private android.graphics.Matrix e;
    private android.graphics.Matrix f;
    private int g;
    private android.graphics.PointF h;
    private android.graphics.PointF i;
    private float j;
    private final float[] k;

    /* renamed from: l, reason: collision with root package name */
    private float f754l;

    /* renamed from: m, reason: collision with root package name */
    private float f755m;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.view.ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ android.net.Uri a;
        final /* synthetic */ com.bxkj.student.common.crop.view.ClipViewLayout b;

        a(com.bxkj.student.common.crop.view.ClipViewLayout r1, android.net.Uri r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
                r2 = this;
                com.bxkj.student.common.crop.view.ClipViewLayout r0 = r2.b
                android.net.Uri r1 = r2.a
                r0.i(r1)
                com.bxkj.student.common.crop.view.ClipViewLayout r0 = r2.b
                android.widget.ImageView r0 = com.bxkj.student.common.crop.view.ClipViewLayout.a(r0)
                android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
                r0.removeGlobalOnLayoutListener(r2)
                return
        }
    }

    public ClipViewLayout(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ClipViewLayout(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public ClipViewLayout(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            r0.e = r3
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            r0.f = r3
            r3 = 0
            r0.g = r3
            android.graphics.PointF r3 = new android.graphics.PointF
            r3.<init>()
            r0.h = r3
            android.graphics.PointF r3 = new android.graphics.PointF
            r3.<init>()
            r0.i = r3
            r3 = 1065353216(0x3f800000, float:1.0)
            r0.j = r3
            r3 = 9
            float[] r3 = new float[r3]
            r0.k = r3
            r3 = 1082130432(0x40800000, float:4.0)
            r0.f755m = r3
            r0.h(r1, r2)
            return
    }

    static /* bridge */ /* synthetic */ android.widget.ImageView a(com.bxkj.student.common.crop.view.ClipViewLayout r0) {
            android.widget.ImageView r0 = r0.a
            return r0
    }

    public static int b(android.graphics.BitmapFactory.Options r3, int r4, int r5) {
            int r0 = r3.outHeight
            int r3 = r3.outWidth
            if (r0 > r5) goto Lb
            if (r3 <= r4) goto L9
            goto Lb
        L9:
            r3 = 1
            return r3
        Lb:
            float r0 = (float) r0
            float r5 = (float) r5
            float r0 = r0 / r5
            int r5 = java.lang.Math.round(r0)
            float r3 = (float) r3
            float r4 = (float) r4
            float r3 = r3 / r4
            int r3 = java.lang.Math.round(r3)
            if (r5 >= r3) goto L1c
            goto L1d
        L1c:
            r5 = r3
        L1d:
            r3 = 3
            if (r5 >= r3) goto L21
            goto L2f
        L21:
            double r3 = (double) r5
            r0 = 4619004367821864960(0x401a000000000000, double:6.5)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 >= 0) goto L2a
            r3 = 4
            return r3
        L2a:
            r3 = 8
            if (r5 >= r3) goto L2f
            return r3
        L2f:
            return r5
    }

    private void c() {
            r9 = this;
            android.graphics.Matrix r0 = r9.e
            android.graphics.RectF r0 = r9.g(r0)
            android.widget.ImageView r1 = r9.a
            int r1 = r1.getWidth()
            android.widget.ImageView r2 = r9.a
            int r2 = r2.getHeight()
            float r3 = r0.width()
            float r1 = (float) r1
            float r4 = r9.c
            r5 = 1073741824(0x40000000, float:2.0)
            float r6 = r4 * r5
            float r6 = r1 - r6
            r7 = 0
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 < 0) goto L3a
            float r3 = r0.left
            int r6 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r6 <= 0) goto L2d
            float r3 = -r3
            float r3 = r3 + r4
            goto L2e
        L2d:
            r3 = 0
        L2e:
            float r6 = r0.right
            float r8 = r1 - r4
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 >= 0) goto L3b
            float r1 = r1 - r4
            float r3 = r1 - r6
            goto L3b
        L3a:
            r3 = 0
        L3b:
            float r1 = r0.height()
            float r2 = (float) r2
            float r4 = r9.d
            float r5 = r5 * r4
            float r5 = r2 - r5
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 < 0) goto L5e
            float r1 = r0.top
            int r5 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r5 <= 0) goto L53
            float r1 = -r1
            float r7 = r1 + r4
        L53:
            float r0 = r0.bottom
            float r1 = r2 - r4
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 >= 0) goto L5e
            float r2 = r2 - r4
            float r7 = r2 - r0
        L5e:
            android.graphics.Matrix r0 = r9.e
            r0.postTranslate(r3, r7)
            return
    }

    public static android.graphics.Bitmap e(java.lang.String r2, int r3, int r4) {
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            r1 = 1
            r0.inJustDecodeBounds = r1
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565
            r0.inPreferredConfig = r1
            android.graphics.BitmapFactory.decodeFile(r2, r0)
            int r3 = b(r0, r3, r4)
            r0.inSampleSize = r3
            r3 = 0
            r0.inJustDecodeBounds = r3
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeFile(r2, r0)
            return r2
    }

    public static int f(java.lang.String r2) {
            android.media.ExifInterface r0 = new android.media.ExifInterface     // Catch: java.io.IOException -> L6
            r0.<init>(r2)     // Catch: java.io.IOException -> L6
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto L26
            java.lang.String r2 = "Orientation"
            r1 = -1
            int r2 = r0.getAttributeInt(r2, r1)
            if (r2 == r1) goto L26
            r0 = 3
            if (r2 == r0) goto L23
            r0 = 6
            if (r2 == r0) goto L20
            r0 = 8
            if (r2 == r0) goto L1d
            goto L26
        L1d:
            r2 = 270(0x10e, float:3.78E-43)
            goto L27
        L20:
            r2 = 90
            goto L27
        L23:
            r2 = 180(0xb4, float:2.52E-43)
            goto L27
        L26:
            r2 = 0
        L27:
            return r2
    }

    private android.graphics.RectF g(android.graphics.Matrix r5) {
            r4 = this;
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            android.widget.ImageView r1 = r4.a
            android.graphics.drawable.Drawable r1 = r1.getDrawable()
            if (r1 == 0) goto L1e
            int r2 = r1.getIntrinsicWidth()
            float r2 = (float) r2
            int r1 = r1.getIntrinsicHeight()
            float r1 = (float) r1
            r3 = 0
            r0.set(r3, r3, r2, r1)
            r5.mapRect(r0)
        L1e:
            return r0
    }

    private void j(android.graphics.PointF r5, android.view.MotionEvent r6) {
            r4 = this;
            r0 = 0
            float r1 = r6.getX(r0)
            r2 = 1
            float r3 = r6.getX(r2)
            float r1 = r1 + r3
            float r0 = r6.getY(r0)
            float r6 = r6.getY(r2)
            float r0 = r0 + r6
            r6 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r6
            float r0 = r0 / r6
            r5.set(r1, r0)
            return
    }

    private float k(android.view.MotionEvent r5) {
            r4 = this;
            r0 = 0
            float r1 = r5.getX(r0)
            r2 = 1
            float r3 = r5.getX(r2)
            float r1 = r1 - r3
            float r0 = r5.getY(r0)
            float r5 = r5.getY(r2)
            float r0 = r0 - r5
            float r1 = r1 * r1
            float r0 = r0 * r0
            float r1 = r1 + r0
            double r0 = (double) r1
            double r0 = java.lang.Math.sqrt(r0)
            float r5 = (float) r0
            return r5
    }

    public static android.graphics.Bitmap l(android.graphics.Bitmap r7, int r8, int r9) {
            int r3 = r7.getWidth()
            int r4 = r7.getHeight()
            android.graphics.Matrix r5 = new android.graphics.Matrix
            r5.<init>()
            float r8 = (float) r8
            float r0 = (float) r3
            float r8 = r8 / r0
            float r9 = (float) r9
            float r0 = (float) r4
            float r9 = r9 / r0
            r5.postScale(r8, r9)
            r2 = 0
            r6 = 0
            r1 = 0
            r0 = r7
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    public android.graphics.Bitmap d() {
            r6 = this;
            android.widget.ImageView r0 = r6.a
            r1 = 1
            r0.setDrawingCacheEnabled(r1)
            android.widget.ImageView r0 = r6.a
            r0.buildDrawingCache()
            com.bxkj.student.common.crop.view.ClipView r0 = r6.b
            android.graphics.Rect r0 = r0.getClipRect()
            r1 = 0
            android.widget.ImageView r2 = r6.a     // Catch: java.lang.Exception -> L33
            android.graphics.Bitmap r2 = r2.getDrawingCache()     // Catch: java.lang.Exception -> L33
            int r3 = r0.left     // Catch: java.lang.Exception -> L33
            int r4 = r0.top     // Catch: java.lang.Exception -> L33
            int r5 = r0.width()     // Catch: java.lang.Exception -> L33
            int r0 = r0.height()     // Catch: java.lang.Exception -> L33
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r2, r3, r4, r5, r0)     // Catch: java.lang.Exception -> L33
            r2 = 295(0x127, float:4.13E-43)
            r3 = 413(0x19d, float:5.79E-43)
            android.graphics.Bitmap r1 = l(r0, r2, r3)     // Catch: java.lang.Exception -> L31
            goto L35
        L31:
            goto L35
        L33:
            r0 = r1
        L35:
            if (r0 == 0) goto L3a
            r0.recycle()
        L3a:
            android.widget.ImageView r0 = r6.a
            r0.destroyDrawingCache()
            return r1
    }

    public final float getScale() {
            r2 = this;
            android.graphics.Matrix r0 = r2.e
            float[] r1 = r2.k
            r0.getValues(r1)
            float[] r0 = r2.k
            r1 = 0
            r0 = r0[r1]
            return r0
    }

    public void h(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            int[] r0 = com.bxkj.student.R.styleable.ClipViewLayout
            android.content.res.TypedArray r5 = r4.obtainStyledAttributes(r5, r0)
            android.content.res.Resources r0 = r3.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            r1 = 1
            r2 = 1112014848(0x42480000, float:50.0)
            float r0 = android.util.TypedValue.applyDimension(r1, r2, r0)
            int r0 = (int) r0
            r2 = 2
            int r0 = r5.getDimensionPixelSize(r2, r0)
            float r0 = (float) r0
            r3.c = r0
            android.content.res.Resources r0 = r3.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            r2 = 1065353216(0x3f800000, float:1.0)
            float r0 = android.util.TypedValue.applyDimension(r1, r2, r0)
            int r0 = (int) r0
            r2 = 0
            int r0 = r5.getDimensionPixelSize(r2, r0)
            int r2 = r5.getInt(r1, r1)
            r5.recycle()
            com.bxkj.student.common.crop.view.ClipView r5 = new com.bxkj.student.common.crop.view.ClipView
            r5.<init>(r4)
            r3.b = r5
            if (r2 != r1) goto L45
            com.bxkj.student.common.crop.view.ClipView$ClipType r1 = com.bxkj.student.common.crop.view.ClipView.ClipType.CIRCLE
            goto L47
        L45:
            com.bxkj.student.common.crop.view.ClipView$ClipType r1 = com.bxkj.student.common.crop.view.ClipView.ClipType.RECTANGLE
        L47:
            r5.setClipType(r1)
            com.bxkj.student.common.crop.view.ClipView r5 = r3.b
            r5.setClipBorderWidth(r0)
            com.bxkj.student.common.crop.view.ClipView r5 = r3.b
            float r0 = r3.c
            r5.setmHorizontalPadding(r0)
            android.widget.ImageView r5 = new android.widget.ImageView
            r5.<init>(r4)
            r3.a = r5
            android.widget.RelativeLayout$LayoutParams r4 = new android.widget.RelativeLayout$LayoutParams
            r5 = -1
            r4.<init>(r5, r5)
            android.widget.ImageView r5 = r3.a
            r3.addView(r5, r4)
            com.bxkj.student.common.crop.view.ClipView r5 = r3.b
            r3.addView(r5, r4)
            return
    }

    public void i(android.net.Uri r10) {
            r9 = this;
            if (r10 != 0) goto L3
            goto L1f
        L3:
            r10.toString()
            android.content.Context r0 = r9.getContext()
            java.lang.String r10 = com.bxkj.base.util.j.c(r0, r10)
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto L15
            goto L1f
        L15:
            r0 = 720(0x2d0, float:1.009E-42)
            r1 = 1280(0x500, float:1.794E-42)
            android.graphics.Bitmap r2 = e(r10, r0, r1)
            if (r2 != 0) goto L20
        L1f:
            return
        L20:
            int r10 = f(r10)
            android.graphics.Matrix r7 = new android.graphics.Matrix
            r7.<init>()
            float r10 = (float) r10
            r7.setRotate(r10)
            int r5 = r2.getWidth()
            int r6 = r2.getHeight()
            r8 = 1
            r3 = 0
            r4 = 0
            android.graphics.Bitmap r10 = android.graphics.Bitmap.createBitmap(r2, r3, r4, r5, r6, r7, r8)
            int r0 = r10.getWidth()
            int r1 = r10.getHeight()
            if (r0 < r1) goto L6b
            android.widget.ImageView r0 = r9.a
            int r0 = r0.getWidth()
            float r0 = (float) r0
            int r1 = r10.getWidth()
            float r1 = (float) r1
            float r0 = r0 / r1
            com.bxkj.student.common.crop.view.ClipView r1 = r9.b
            android.graphics.Rect r1 = r1.getClipRect()
            int r1 = r1.height()
            float r1 = (float) r1
            int r2 = r10.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            r9.f754l = r1
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 >= 0) goto L90
            goto L8f
        L6b:
            android.widget.ImageView r0 = r9.a
            int r0 = r0.getHeight()
            float r0 = (float) r0
            int r1 = r10.getHeight()
            float r1 = (float) r1
            float r0 = r0 / r1
            com.bxkj.student.common.crop.view.ClipView r1 = r9.b
            android.graphics.Rect r1 = r1.getClipRect()
            int r1 = r1.width()
            float r1 = (float) r1
            int r2 = r10.getWidth()
            float r2 = (float) r2
            float r1 = r1 / r2
            r9.f754l = r1
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 >= 0) goto L90
        L8f:
            r0 = r1
        L90:
            android.graphics.Matrix r1 = r9.e
            r1.postScale(r0, r0)
            android.widget.ImageView r1 = r9.a
            int r1 = r1.getWidth()
            int r1 = r1 / 2
            android.widget.ImageView r2 = r9.a
            int r2 = r2.getHeight()
            int r2 = r2 / 2
            int r3 = r10.getWidth()
            float r3 = (float) r3
            float r3 = r3 * r0
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            int r3 = (int) r3
            int r5 = r10.getHeight()
            float r5 = (float) r5
            float r5 = r5 * r0
            float r5 = r5 / r4
            int r0 = (int) r5
            android.graphics.Matrix r4 = r9.e
            int r1 = r1 - r3
            float r1 = (float) r1
            int r2 = r2 - r0
            float r0 = (float) r2
            r4.postTranslate(r1, r0)
            android.widget.ImageView r0 = r9.a
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX
            r0.setScaleType(r1)
            android.widget.ImageView r0 = r9.a
            android.graphics.Matrix r1 = r9.e
            r0.setImageMatrix(r1)
            android.widget.ImageView r0 = r9.a
            r0.setImageBitmap(r10)
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r6) {
            r5 = this;
            int r0 = r6.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 1
            if (r0 == 0) goto Led
            r2 = 1092616192(0x41200000, float:10.0)
            r3 = 2
            if (r0 == r3) goto L35
            r4 = 5
            if (r0 == r4) goto L1b
            r6 = 6
            if (r0 == r6) goto L16
            goto L103
        L16:
            r6 = 0
            r5.g = r6
            goto L103
        L1b:
            float r0 = r5.k(r6)
            r5.j = r0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L103
            android.graphics.Matrix r0 = r5.f
            android.graphics.Matrix r2 = r5.e
            r0.set(r2)
            android.graphics.PointF r0 = r5.i
            r5.j(r0, r6)
            r5.g = r3
            goto L103
        L35:
            int r0 = r5.g
            if (r0 != r1) goto L67
            android.graphics.Matrix r0 = r5.e
            android.graphics.Matrix r2 = r5.f
            r0.set(r2)
            float r0 = r6.getX()
            android.graphics.PointF r2 = r5.h
            float r2 = r2.x
            float r0 = r0 - r2
            float r6 = r6.getY()
            android.graphics.PointF r2 = r5.h
            float r2 = r2.y
            float r6 = r6 - r2
            com.bxkj.student.common.crop.view.ClipView r2 = r5.b
            android.graphics.Rect r2 = r2.getClipRect()
            int r2 = r2.top
            float r2 = (float) r2
            r5.d = r2
            android.graphics.Matrix r2 = r5.e
            r2.postTranslate(r0, r6)
            r5.c()
            goto Le5
        L67:
            if (r0 != r3) goto Le5
            float r6 = r5.k(r6)
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 <= 0) goto Le5
            float r0 = r5.j
            float r6 = r6 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 >= 0) goto Lbe
            float r0 = r5.getScale()
            float r2 = r5.f754l
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto Lba
            android.graphics.Matrix r0 = r5.e
            android.graphics.Matrix r2 = r5.f
            r0.set(r2)
            com.bxkj.student.common.crop.view.ClipView r0 = r5.b
            android.graphics.Rect r0 = r0.getClipRect()
            int r0 = r0.top
            float r0 = (float) r0
            r5.d = r0
            android.graphics.Matrix r0 = r5.e
            android.graphics.PointF r2 = r5.i
            float r3 = r2.x
            float r2 = r2.y
            r0.postScale(r6, r6, r3, r2)
        La1:
            float r6 = r5.getScale()
            float r0 = r5.f754l
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 >= 0) goto Lba
            android.graphics.Matrix r6 = r5.e
            android.graphics.PointF r0 = r5.i
            float r2 = r0.x
            float r0 = r0.y
            r3 = 1065437102(0x3f8147ae, float:1.01)
            r6.postScale(r3, r3, r2, r0)
            goto La1
        Lba:
            r5.c()
            goto Le5
        Lbe:
            float r0 = r5.getScale()
            float r2 = r5.f755m
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto Le5
            android.graphics.Matrix r0 = r5.e
            android.graphics.Matrix r2 = r5.f
            r0.set(r2)
            com.bxkj.student.common.crop.view.ClipView r0 = r5.b
            android.graphics.Rect r0 = r0.getClipRect()
            int r0 = r0.top
            float r0 = (float) r0
            r5.d = r0
            android.graphics.Matrix r0 = r5.e
            android.graphics.PointF r2 = r5.i
            float r3 = r2.x
            float r2 = r2.y
            r0.postScale(r6, r6, r3, r2)
        Le5:
            android.widget.ImageView r6 = r5.a
            android.graphics.Matrix r0 = r5.e
            r6.setImageMatrix(r0)
            goto L103
        Led:
            android.graphics.Matrix r0 = r5.f
            android.graphics.Matrix r2 = r5.e
            r0.set(r2)
            android.graphics.PointF r0 = r5.h
            float r2 = r6.getX()
            float r6 = r6.getY()
            r0.set(r2, r6)
            r5.g = r1
        L103:
            return r1
    }

    public void setImageSrc(android.net.Uri r3) {
            r2 = this;
            android.widget.ImageView r0 = r2.a
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            com.bxkj.student.common.crop.view.ClipViewLayout$a r1 = new com.bxkj.student.common.crop.view.ClipViewLayout$a
            r1.<init>(r2, r3)
            r0.addOnGlobalLayoutListener(r1)
            return
    }
}
