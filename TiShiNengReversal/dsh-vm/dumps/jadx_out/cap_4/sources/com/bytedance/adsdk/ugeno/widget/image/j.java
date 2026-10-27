package com.bytedance.adsdk.ugeno.widget.image;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j extends android.graphics.drawable.Drawable {
    private final int ae;
    private final boolean[] av;
    private float az;
    private final android.graphics.RectF cw;
    private final android.graphics.Paint g;
    private boolean i;
    private final android.graphics.RectF j;
    private android.graphics.Shader.TileMode jy;
    private android.widget.ImageView.ScaleType kt;

    /* renamed from: m, reason: collision with root package name */
    private final int f2014m;
    private android.content.res.ColorStateList mi;
    private final android.graphics.Matrix oq;
    private final android.graphics.RectF qv;

    /* renamed from: r, reason: collision with root package name */
    private final android.graphics.Bitmap f2015r;
    private final android.graphics.RectF tl;
    private final android.graphics.Paint up;
    private android.graphics.Shader.TileMode vl;

    /* renamed from: w, reason: collision with root package name */
    private float f2016w;
    private boolean ws;
    private final android.graphics.RectF xt;

    /* renamed from: com.bytedance.adsdk.ugeno.widget.image.j$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] j = null;

        static {
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.adsdk.ugeno.widget.image.j.AnonymousClass1.j = r0
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.bytedance.adsdk.ugeno.widget.image.j.AnonymousClass1.j     // Catch: java.lang.NoSuchFieldError -> L1d
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.bytedance.adsdk.ugeno.widget.image.j.AnonymousClass1.j     // Catch: java.lang.NoSuchFieldError -> L28
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.bytedance.adsdk.ugeno.widget.image.j.AnonymousClass1.j     // Catch: java.lang.NoSuchFieldError -> L33
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.bytedance.adsdk.ugeno.widget.image.j.AnonymousClass1.j     // Catch: java.lang.NoSuchFieldError -> L3e
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = com.bytedance.adsdk.ugeno.widget.image.j.AnonymousClass1.j     // Catch: java.lang.NoSuchFieldError -> L49
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = com.bytedance.adsdk.ugeno.widget.image.j.AnonymousClass1.j     // Catch: java.lang.NoSuchFieldError -> L54
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    public j(android.graphics.Bitmap r6) {
            r5 = this;
            r5.<init>()
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r5.j = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r5.xt = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r5.cw = r0
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r5.tl = r1
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r5.oq = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r5.qv = r1
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.CLAMP
            r5.vl = r1
            r5.jy = r1
            r1 = 1
            r5.ws = r1
            r2 = 0
            r5.az = r2
            r3 = 4
            boolean[] r3 = new boolean[r3]
            r3 = {x0096: FILL_ARRAY_DATA , data: [1, 1, 1, 1} // fill-array
            r5.av = r3
            r3 = 0
            r5.i = r3
            r5.f2016w = r2
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            android.content.res.ColorStateList r4 = android.content.res.ColorStateList.valueOf(r3)
            r5.mi = r4
            android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.FIT_CENTER
            r5.kt = r4
            r5.f2015r = r6
            int r4 = r6.getWidth()
            r5.f2014m = r4
            int r6 = r6.getHeight()
            r5.ae = r6
            float r4 = (float) r4
            float r6 = (float) r6
            r0.set(r2, r2, r4, r6)
            android.graphics.Paint r6 = new android.graphics.Paint
            r6.<init>()
            r5.up = r6
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r6.setStyle(r0)
            r6.setAntiAlias(r1)
            android.graphics.Paint r6 = new android.graphics.Paint
            r6.<init>()
            r5.g = r6
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            r6.setStyle(r0)
            r6.setAntiAlias(r1)
            android.content.res.ColorStateList r0 = r5.mi
            int[] r1 = r5.getState()
            int r0 = r0.getColorForState(r1, r3)
            r6.setColor(r0)
            float r0 = r5.f2016w
            r6.setStrokeWidth(r0)
            return
    }

    public static android.graphics.drawable.Drawable j(android.graphics.drawable.Drawable r4) {
            if (r4 == 0) goto L42
            boolean r0 = r4 instanceof com.bytedance.adsdk.ugeno.widget.image.j
            if (r0 == 0) goto L7
            return r4
        L7:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L14
            boolean r0 = com.bytedance.adsdk.lottie.model.layer.a.a(r4)
            if (r0 == 0) goto L14
            return r4
        L14:
            boolean r0 = r4 instanceof android.graphics.drawable.LayerDrawable
            if (r0 == 0) goto L42
            android.graphics.drawable.Drawable r0 = r4.mutate()
            android.graphics.drawable.Drawable$ConstantState r0 = r0.getConstantState()
            if (r0 == 0) goto L26
            android.graphics.drawable.Drawable r4 = r0.newDrawable()
        L26:
            android.graphics.drawable.LayerDrawable r4 = (android.graphics.drawable.LayerDrawable) r4
            int r0 = r4.getNumberOfLayers()
            r1 = 0
        L2d:
            if (r1 >= r0) goto L41
            android.graphics.drawable.Drawable r2 = r4.getDrawable(r1)
            int r3 = r4.getId(r1)
            android.graphics.drawable.Drawable r2 = j(r2)
            r4.setDrawableByLayerId(r3, r2)
            int r1 = r1 + 1
            goto L2d
        L41:
            return r4
        L42:
            android.graphics.Bitmap r0 = xt(r4)
            if (r0 == 0) goto L4d
            com.bytedance.adsdk.ugeno.widget.image.j r4 = new com.bytedance.adsdk.ugeno.widget.image.j
            r4.<init>(r0)
        L4d:
            return r4
    }

    public static com.bytedance.adsdk.ugeno.widget.image.j j(android.graphics.Bitmap r1) {
            if (r1 == 0) goto L8
            com.bytedance.adsdk.ugeno.widget.image.j r0 = new com.bytedance.adsdk.ugeno.widget.image.j
            r0.<init>(r1)
            return r0
        L8:
            r1 = 0
            return r1
    }

    private void j() {
            r8 = this;
            int[] r0 = com.bytedance.adsdk.ugeno.widget.image.j.AnonymousClass1.j
            android.widget.ImageView$ScaleType r1 = r8.kt
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1056964608(0x3f000000, float:0.5)
            r2 = 1073741824(0x40000000, float:2.0)
            r3 = 1
            if (r0 == r3) goto L1da
            r4 = 2
            if (r0 == r4) goto L15e
            r4 = 3
            if (r0 == r4) goto Ld3
            r1 = 5
            if (r0 == r1) goto La3
            r1 = 6
            if (r0 == r1) goto L73
            r1 = 7
            if (r0 == r1) goto L50
            android.graphics.RectF r0 = r8.tl
            android.graphics.RectF r1 = r8.cw
            r0.set(r1)
            android.graphics.Matrix r0 = r8.oq
            android.graphics.RectF r1 = r8.cw
            android.graphics.RectF r4 = r8.j
            android.graphics.Matrix$ScaleToFit r5 = android.graphics.Matrix.ScaleToFit.CENTER
            r0.setRectToRect(r1, r4, r5)
            android.graphics.Matrix r0 = r8.oq
            android.graphics.RectF r1 = r8.tl
            r0.mapRect(r1)
            android.graphics.RectF r0 = r8.tl
            float r1 = r8.f2016w
            float r4 = r1 / r2
            float r1 = r1 / r2
            r0.inset(r4, r1)
            android.graphics.Matrix r0 = r8.oq
            android.graphics.RectF r1 = r8.cw
            android.graphics.RectF r2 = r8.tl
            android.graphics.Matrix$ScaleToFit r4 = android.graphics.Matrix.ScaleToFit.FILL
            r0.setRectToRect(r1, r2, r4)
            goto L213
        L50:
            android.graphics.RectF r0 = r8.tl
            android.graphics.RectF r1 = r8.j
            r0.set(r1)
            android.graphics.RectF r0 = r8.tl
            float r1 = r8.f2016w
            float r4 = r1 / r2
            float r1 = r1 / r2
            r0.inset(r4, r1)
            android.graphics.Matrix r0 = r8.oq
            r0.reset()
            android.graphics.Matrix r0 = r8.oq
            android.graphics.RectF r1 = r8.cw
            android.graphics.RectF r2 = r8.tl
            android.graphics.Matrix$ScaleToFit r4 = android.graphics.Matrix.ScaleToFit.FILL
            r0.setRectToRect(r1, r2, r4)
            goto L213
        L73:
            android.graphics.RectF r0 = r8.tl
            android.graphics.RectF r1 = r8.cw
            r0.set(r1)
            android.graphics.Matrix r0 = r8.oq
            android.graphics.RectF r1 = r8.cw
            android.graphics.RectF r4 = r8.j
            android.graphics.Matrix$ScaleToFit r5 = android.graphics.Matrix.ScaleToFit.START
            r0.setRectToRect(r1, r4, r5)
            android.graphics.Matrix r0 = r8.oq
            android.graphics.RectF r1 = r8.tl
            r0.mapRect(r1)
            android.graphics.RectF r0 = r8.tl
            float r1 = r8.f2016w
            float r4 = r1 / r2
            float r1 = r1 / r2
            r0.inset(r4, r1)
            android.graphics.Matrix r0 = r8.oq
            android.graphics.RectF r1 = r8.cw
            android.graphics.RectF r2 = r8.tl
            android.graphics.Matrix$ScaleToFit r4 = android.graphics.Matrix.ScaleToFit.FILL
            r0.setRectToRect(r1, r2, r4)
            goto L213
        La3:
            android.graphics.RectF r0 = r8.tl
            android.graphics.RectF r1 = r8.cw
            r0.set(r1)
            android.graphics.Matrix r0 = r8.oq
            android.graphics.RectF r1 = r8.cw
            android.graphics.RectF r4 = r8.j
            android.graphics.Matrix$ScaleToFit r5 = android.graphics.Matrix.ScaleToFit.END
            r0.setRectToRect(r1, r4, r5)
            android.graphics.Matrix r0 = r8.oq
            android.graphics.RectF r1 = r8.tl
            r0.mapRect(r1)
            android.graphics.RectF r0 = r8.tl
            float r1 = r8.f2016w
            float r4 = r1 / r2
            float r1 = r1 / r2
            r0.inset(r4, r1)
            android.graphics.Matrix r0 = r8.oq
            android.graphics.RectF r1 = r8.cw
            android.graphics.RectF r2 = r8.tl
            android.graphics.Matrix$ScaleToFit r4 = android.graphics.Matrix.ScaleToFit.FILL
            r0.setRectToRect(r1, r2, r4)
            goto L213
        Ld3:
            android.graphics.Matrix r0 = r8.oq
            r0.reset()
            int r0 = r8.f2014m
            float r0 = (float) r0
            android.graphics.RectF r4 = r8.j
            float r4 = r4.width()
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 > 0) goto Lf5
            int r0 = r8.ae
            float r0 = (float) r0
            android.graphics.RectF r4 = r8.j
            float r4 = r4.height()
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 > 0) goto Lf5
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L10d
        Lf5:
            android.graphics.RectF r0 = r8.j
            float r0 = r0.width()
            int r4 = r8.f2014m
            float r4 = (float) r4
            float r0 = r0 / r4
            android.graphics.RectF r4 = r8.j
            float r4 = r4.height()
            int r5 = r8.ae
            float r5 = (float) r5
            float r4 = r4 / r5
            float r0 = java.lang.Math.min(r0, r4)
        L10d:
            android.graphics.RectF r4 = r8.j
            float r4 = r4.width()
            int r5 = r8.f2014m
            float r5 = (float) r5
            float r5 = r5 * r0
            float r4 = r4 - r5
            float r4 = r4 * r1
            float r4 = r4 + r1
            int r4 = (int) r4
            float r4 = (float) r4
            android.graphics.RectF r5 = r8.j
            float r5 = r5.height()
            int r6 = r8.ae
            float r6 = (float) r6
            float r6 = r6 * r0
            float r5 = r5 - r6
            float r5 = r5 * r1
            float r5 = r5 + r1
            int r1 = (int) r5
            float r1 = (float) r1
            android.graphics.Matrix r5 = r8.oq
            r5.setScale(r0, r0)
            android.graphics.Matrix r0 = r8.oq
            r0.postTranslate(r4, r1)
            android.graphics.RectF r0 = r8.tl
            android.graphics.RectF r1 = r8.cw
            r0.set(r1)
            android.graphics.Matrix r0 = r8.oq
            android.graphics.RectF r1 = r8.tl
            r0.mapRect(r1)
            android.graphics.RectF r0 = r8.tl
            float r1 = r8.f2016w
            float r4 = r1 / r2
            float r1 = r1 / r2
            r0.inset(r4, r1)
            android.graphics.Matrix r0 = r8.oq
            android.graphics.RectF r1 = r8.cw
            android.graphics.RectF r2 = r8.tl
            android.graphics.Matrix$ScaleToFit r4 = android.graphics.Matrix.ScaleToFit.FILL
            r0.setRectToRect(r1, r2, r4)
            goto L213
        L15e:
            android.graphics.RectF r0 = r8.tl
            android.graphics.RectF r4 = r8.j
            r0.set(r4)
            android.graphics.RectF r0 = r8.tl
            float r4 = r8.f2016w
            float r5 = r4 / r2
            float r4 = r4 / r2
            r0.inset(r5, r4)
            android.graphics.Matrix r0 = r8.oq
            r0.reset()
            int r0 = r8.f2014m
            float r0 = (float) r0
            android.graphics.RectF r4 = r8.tl
            float r4 = r4.height()
            float r0 = r0 * r4
            android.graphics.RectF r4 = r8.tl
            float r4 = r4.width()
            int r5 = r8.ae
            float r5 = (float) r5
            float r4 = r4 * r5
            r5 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L1aa
            android.graphics.RectF r0 = r8.tl
            float r0 = r0.height()
            int r4 = r8.ae
            float r4 = (float) r4
            float r0 = r0 / r4
            android.graphics.RectF r4 = r8.tl
            float r4 = r4.width()
            int r6 = r8.f2014m
            float r6 = (float) r6
            float r6 = r6 * r0
            float r4 = r4 - r6
            float r4 = r4 * r1
            r5 = r4
            r4 = 0
            goto L1c2
        L1aa:
            android.graphics.RectF r0 = r8.tl
            float r0 = r0.width()
            int r4 = r8.f2014m
            float r4 = (float) r4
            float r0 = r0 / r4
            android.graphics.RectF r4 = r8.tl
            float r4 = r4.height()
            int r6 = r8.ae
            float r6 = (float) r6
            float r6 = r6 * r0
            float r4 = r4 - r6
            float r4 = r4 * r1
        L1c2:
            android.graphics.Matrix r6 = r8.oq
            r6.setScale(r0, r0)
            android.graphics.Matrix r0 = r8.oq
            float r5 = r5 + r1
            int r5 = (int) r5
            float r5 = (float) r5
            float r6 = r8.f2016w
            float r7 = r6 / r2
            float r5 = r5 + r7
            float r4 = r4 + r1
            int r1 = (int) r4
            float r1 = (float) r1
            float r6 = r6 / r2
            float r1 = r1 + r6
            r0.postTranslate(r5, r1)
            goto L213
        L1da:
            android.graphics.RectF r0 = r8.tl
            android.graphics.RectF r4 = r8.j
            r0.set(r4)
            android.graphics.RectF r0 = r8.tl
            float r4 = r8.f2016w
            float r5 = r4 / r2
            float r4 = r4 / r2
            r0.inset(r5, r4)
            android.graphics.Matrix r0 = r8.oq
            r0.reset()
            android.graphics.Matrix r0 = r8.oq
            android.graphics.RectF r2 = r8.tl
            float r2 = r2.width()
            int r4 = r8.f2014m
            float r4 = (float) r4
            float r2 = r2 - r4
            float r2 = r2 * r1
            float r2 = r2 + r1
            int r2 = (int) r2
            float r2 = (float) r2
            android.graphics.RectF r4 = r8.tl
            float r4 = r4.height()
            int r5 = r8.ae
            float r5 = (float) r5
            float r4 = r4 - r5
            float r4 = r4 * r1
            float r4 = r4 + r1
            int r1 = (int) r4
            float r1 = (float) r1
            r0.setTranslate(r2, r1)
        L213:
            android.graphics.RectF r0 = r8.xt
            android.graphics.RectF r1 = r8.tl
            r0.set(r1)
            r8.ws = r3
            return
    }

    private void j(android.graphics.Canvas r9) {
            r8 = this;
            boolean[] r0 = r8.av
            boolean r0 = xt(r0)
            if (r0 == 0) goto L9
            goto L7e
        L9:
            float r0 = r8.az
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L11
            goto L7e
        L11:
            android.graphics.RectF r0 = r8.xt
            float r1 = r0.left
            float r2 = r0.top
            float r0 = r0.width()
            float r0 = r0 + r1
            android.graphics.RectF r3 = r8.xt
            float r3 = r3.height()
            float r3 = r3 + r2
            float r4 = r8.az
            boolean[] r5 = r8.av
            r6 = 0
            boolean r5 = r5[r6]
            if (r5 != 0) goto L3c
            android.graphics.RectF r5 = r8.qv
            float r6 = r1 + r4
            float r7 = r2 + r4
            r5.set(r1, r2, r6, r7)
            android.graphics.RectF r5 = r8.qv
            android.graphics.Paint r6 = r8.up
            r9.drawRect(r5, r6)
        L3c:
            boolean[] r5 = r8.av
            r6 = 1
            boolean r5 = r5[r6]
            if (r5 != 0) goto L51
            android.graphics.RectF r5 = r8.qv
            float r6 = r0 - r4
            r5.set(r6, r2, r0, r4)
            android.graphics.RectF r2 = r8.qv
            android.graphics.Paint r5 = r8.up
            r9.drawRect(r2, r5)
        L51:
            boolean[] r2 = r8.av
            r5 = 2
            boolean r2 = r2[r5]
            if (r2 != 0) goto L68
            android.graphics.RectF r2 = r8.qv
            float r5 = r0 - r4
            float r6 = r3 - r4
            r2.set(r5, r6, r0, r3)
            android.graphics.RectF r0 = r8.qv
            android.graphics.Paint r2 = r8.up
            r9.drawRect(r0, r2)
        L68:
            boolean[] r0 = r8.av
            r2 = 3
            boolean r0 = r0[r2]
            if (r0 != 0) goto L7e
            android.graphics.RectF r0 = r8.qv
            float r2 = r3 - r4
            float r4 = r4 + r1
            r0.set(r1, r2, r4, r3)
            android.graphics.RectF r0 = r8.qv
            android.graphics.Paint r1 = r8.up
            r9.drawRect(r0, r1)
        L7e:
            return
    }

    private static boolean j(boolean[] r4) {
            int r0 = r4.length
            r1 = 0
            r2 = 0
        L3:
            if (r2 >= r0) goto Le
            boolean r3 = r4[r2]
            if (r3 == 0) goto Lb
            r4 = 1
            return r4
        Lb:
            int r2 = r2 + 1
            goto L3
        Le:
            return r1
    }

    public static android.graphics.Bitmap xt(android.graphics.drawable.Drawable r6) {
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof android.graphics.drawable.BitmapDrawable
            if (r1 == 0) goto Lf
            android.graphics.drawable.BitmapDrawable r6 = (android.graphics.drawable.BitmapDrawable) r6
            android.graphics.Bitmap r6 = r6.getBitmap()
            return r6
        Lf:
            int r1 = r6.getIntrinsicWidth()
            r2 = 2
            int r1 = java.lang.Math.max(r1, r2)
            int r3 = r6.getIntrinsicHeight()
            int r2 = java.lang.Math.max(r3, r2)
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> L3b
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r1, r2, r3)     // Catch: java.lang.Throwable -> L3b
            android.graphics.Canvas r2 = new android.graphics.Canvas     // Catch: java.lang.Throwable -> L3b
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L3b
            int r3 = r2.getWidth()     // Catch: java.lang.Throwable -> L3b
            int r4 = r2.getHeight()     // Catch: java.lang.Throwable -> L3b
            r5 = 0
            r6.setBounds(r5, r5, r3, r4)     // Catch: java.lang.Throwable -> L3b
            r6.draw(r2)     // Catch: java.lang.Throwable -> L3b
            return r1
        L3b:
            r6 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r6)
            java.lang.String r6 = "RoundedDrawable"
            java.lang.String r1 = "Failed to create bitmap from drawable!"
            com.bytedance.sdk.component.utils.vl.xt(r6, r1)
            return r0
    }

    private void xt(android.graphics.Canvas r17) {
            r16 = this;
            r0 = r16
            boolean[] r1 = r0.av
            boolean r1 = xt(r1)
            if (r1 == 0) goto Lc
            goto Lb5
        Lc:
            float r1 = r0.az
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L15
            goto Lb5
        L15:
            android.graphics.RectF r1 = r0.xt
            float r3 = r1.left
            float r6 = r1.top
            float r1 = r1.width()
            float r1 = r1 + r3
            android.graphics.RectF r2 = r0.xt
            float r2 = r2.height()
            float r13 = r6 + r2
            float r14 = r0.az
            float r2 = r0.f2016w
            r4 = 1073741824(0x40000000, float:2.0)
            float r15 = r2 / r4
            boolean[] r2 = r0.av
            r4 = 0
            boolean r2 = r2[r4]
            if (r2 != 0) goto L50
            float r5 = r3 - r15
            float r7 = r3 + r14
            android.graphics.Paint r9 = r0.g
            r8 = r6
            r4 = r17
            r4.drawLine(r5, r6, r7, r8, r9)
            float r4 = r8 - r15
            float r6 = r8 + r14
            android.graphics.Paint r7 = r0.g
            r5 = r3
            r2 = r17
            r2.drawLine(r3, r4, r5, r6, r7)
            goto L51
        L50:
            r8 = r6
        L51:
            boolean[] r2 = r0.av
            r4 = 1
            boolean r2 = r2[r4]
            if (r2 != 0) goto L73
            float r2 = r1 - r14
            float r5 = r2 - r15
            android.graphics.Paint r9 = r0.g
            r6 = r8
            r4 = r17
            r7 = r1
            r4.drawLine(r5, r6, r7, r8, r9)
            r8 = r7
            float r9 = r6 - r15
            float r11 = r6 + r14
            android.graphics.Paint r12 = r0.g
            r10 = r8
            r7 = r17
            r7.drawLine(r8, r9, r10, r11, r12)
            r1 = r8
        L73:
            boolean[] r2 = r0.av
            r4 = 2
            boolean r2 = r2[r4]
            if (r2 != 0) goto L96
            float r2 = r1 - r14
            float r8 = r2 - r15
            float r10 = r1 + r15
            android.graphics.Paint r12 = r0.g
            r11 = r13
            r7 = r17
            r9 = r13
            r7.drawLine(r8, r9, r10, r11, r12)
            float r13 = r9 - r14
            android.graphics.Paint r12 = r0.g
            r10 = r1
            r8 = r1
            r11 = r9
            r9 = r13
            r7.drawLine(r8, r9, r10, r11, r12)
            r9 = r11
            goto L97
        L96:
            r9 = r13
        L97:
            boolean[] r1 = r0.av
            r2 = 3
            boolean r1 = r1[r2]
            if (r1 != 0) goto Lb5
            float r8 = r3 - r15
            float r10 = r3 + r14
            android.graphics.Paint r12 = r0.g
            r11 = r9
            r7 = r17
            r7.drawLine(r8, r9, r10, r11, r12)
            float r4 = r9 - r14
            android.graphics.Paint r7 = r0.g
            r5 = r3
            r2 = r17
            r6 = r9
            r2.drawLine(r3, r4, r5, r6, r7)
        Lb5:
            return
    }

    private static boolean xt(boolean[] r4) {
            int r0 = r4.length
            r1 = 0
            r2 = 0
        L3:
            if (r2 >= r0) goto Ld
            boolean r3 = r4[r2]
            if (r3 == 0) goto La
            return r1
        La:
            int r2 = r2 + 1
            goto L3
        Ld:
            r4 = 1
            return r4
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r5) {
            r4 = this;
            boolean r0 = r4.ws
            if (r0 == 0) goto L26
            android.graphics.BitmapShader r0 = new android.graphics.BitmapShader
            android.graphics.Bitmap r1 = r4.f2015r
            android.graphics.Shader$TileMode r2 = r4.vl
            android.graphics.Shader$TileMode r3 = r4.jy
            r0.<init>(r1, r2, r3)
            android.graphics.Shader$TileMode r1 = r4.vl
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.CLAMP
            if (r1 != r2) goto L1e
            android.graphics.Shader$TileMode r1 = r4.jy
            if (r1 != r2) goto L1e
            android.graphics.Matrix r1 = r4.oq
            r0.setLocalMatrix(r1)
        L1e:
            android.graphics.Paint r1 = r4.up
            r1.setShader(r0)
            r0 = 0
            r4.ws = r0
        L26:
            boolean r0 = r4.i
            r1 = 0
            if (r0 == 0) goto L48
            float r0 = r4.f2016w
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L40
            android.graphics.RectF r0 = r4.xt
            android.graphics.Paint r1 = r4.up
            r5.drawOval(r0, r1)
            android.graphics.RectF r0 = r4.tl
            android.graphics.Paint r1 = r4.g
            r5.drawOval(r0, r1)
            return
        L40:
            android.graphics.RectF r0 = r4.xt
            android.graphics.Paint r1 = r4.up
            r5.drawOval(r0, r1)
            return
        L48:
            boolean[] r0 = r4.av
            boolean r0 = j(r0)
            if (r0 == 0) goto L78
            float r0 = r4.az
            float r2 = r4.f2016w
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 <= 0) goto L6d
            android.graphics.RectF r1 = r4.xt
            android.graphics.Paint r2 = r4.up
            r5.drawRoundRect(r1, r0, r0, r2)
            android.graphics.RectF r1 = r4.tl
            android.graphics.Paint r2 = r4.g
            r5.drawRoundRect(r1, r0, r0, r2)
            r4.j(r5)
            r4.xt(r5)
            return
        L6d:
            android.graphics.RectF r1 = r4.xt
            android.graphics.Paint r2 = r4.up
            r5.drawRoundRect(r1, r0, r0, r2)
            r4.j(r5)
            return
        L78:
            android.graphics.RectF r0 = r4.xt
            android.graphics.Paint r2 = r4.up
            r5.drawRect(r0, r2)
            float r0 = r4.f2016w
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L8c
            android.graphics.RectF r0 = r4.tl
            android.graphics.Paint r1 = r4.g
            r5.drawRect(r0, r1)
        L8c:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
            r1 = this;
            android.graphics.Paint r0 = r1.up
            int r0 = r0.getAlpha()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.ColorFilter getColorFilter() {
            r1 = this;
            android.graphics.Paint r0 = r1.up
            android.graphics.ColorFilter r0 = r0.getColorFilter()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
            r1 = this;
            int r0 = r1.ae
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
            r1 = this;
            int r0 = r1.f2014m
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            r0 = -3
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.mi
            boolean r0 = r0.isStateful()
            return r0
    }

    public com.bytedance.adsdk.ugeno.widget.image.j j(float r2) {
            r1 = this;
            r1.f2016w = r2
            android.graphics.Paint r0 = r1.g
            r0.setStrokeWidth(r2)
            return r1
    }

    public com.bytedance.adsdk.ugeno.widget.image.j j(float r5, float r6, float r7, float r8) {
            r4 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r1 = 4
            r0.<init>(r1)
            java.lang.Float r1 = java.lang.Float.valueOf(r5)
            r0.add(r1)
            java.lang.Float r1 = java.lang.Float.valueOf(r6)
            r0.add(r1)
            java.lang.Float r1 = java.lang.Float.valueOf(r7)
            r0.add(r1)
            java.lang.Float r1 = java.lang.Float.valueOf(r8)
            r0.add(r1)
            r1 = 0
            java.lang.Float r2 = java.lang.Float.valueOf(r1)
            r0.remove(r2)
            int r2 = r0.size()
            r3 = 1
            if (r2 > r3) goto L93
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L68
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r0 = r0.next()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            boolean r2 = java.lang.Float.isInfinite(r0)
            if (r2 != 0) goto L58
            boolean r2 = java.lang.Float.isNaN(r0)
            if (r2 != 0) goto L58
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 < 0) goto L58
            r4.az = r0
            goto L6a
        L58:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Invalid radius value: "
            java.lang.String r7 = java.lang.String.valueOf(r0)
            java.lang.String r6 = r6.concat(r7)
            r5.<init>(r6)
            throw r5
        L68:
            r4.az = r1
        L6a:
            boolean[] r0 = r4.av
            r2 = 0
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 <= 0) goto L73
            r5 = 1
            goto L74
        L73:
            r5 = 0
        L74:
            r0[r2] = r5
            int r5 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r5 <= 0) goto L7c
            r5 = 1
            goto L7d
        L7c:
            r5 = 0
        L7d:
            r0[r3] = r5
            int r5 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r5 <= 0) goto L85
            r5 = 1
            goto L86
        L85:
            r5 = 0
        L86:
            r6 = 2
            r0[r6] = r5
            int r5 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r5 <= 0) goto L8e
            goto L8f
        L8e:
            r3 = 0
        L8f:
            r5 = 3
            r0[r5] = r3
            return r4
        L93:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Multiple nonzero corner radii not yet supported."
            r5.<init>(r6)
            throw r5
    }

    public com.bytedance.adsdk.ugeno.widget.image.j j(android.content.res.ColorStateList r4) {
            r3 = this;
            if (r4 == 0) goto L3
            goto L8
        L3:
            r4 = 0
            android.content.res.ColorStateList r4 = android.content.res.ColorStateList.valueOf(r4)
        L8:
            r3.mi = r4
            android.graphics.Paint r0 = r3.g
            int[] r1 = r3.getState()
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r4 = r4.getColorForState(r1, r2)
            r0.setColor(r4)
            return r3
    }

    public com.bytedance.adsdk.ugeno.widget.image.j j(android.graphics.Shader.TileMode r2) {
            r1 = this;
            android.graphics.Shader$TileMode r0 = r1.vl
            if (r0 == r2) goto Lc
            r1.vl = r2
            r2 = 1
            r1.ws = r2
            r1.invalidateSelf()
        Lc:
            return r1
    }

    public com.bytedance.adsdk.ugeno.widget.image.j j(android.widget.ImageView.ScaleType r2) {
            r1 = this;
            if (r2 != 0) goto L4
            android.widget.ImageView$ScaleType r2 = android.widget.ImageView.ScaleType.FIT_CENTER
        L4:
            android.widget.ImageView$ScaleType r0 = r1.kt
            if (r0 == r2) goto Ld
            r1.kt = r2
            r1.j()
        Ld:
            return r1
    }

    public com.bytedance.adsdk.ugeno.widget.image.j j(boolean r1) {
            r0 = this;
            r0.i = r1
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(android.graphics.Rect r2) {
            r1 = this;
            super.onBoundsChange(r2)
            android.graphics.RectF r0 = r1.j
            r0.set(r2)
            r1.j()
            return
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] r3) {
            r2 = this;
            android.content.res.ColorStateList r0 = r2.mi
            r1 = 0
            int r0 = r0.getColorForState(r3, r1)
            android.graphics.Paint r1 = r2.g
            int r1 = r1.getColor()
            if (r1 == r0) goto L16
            android.graphics.Paint r3 = r2.g
            r3.setColor(r0)
            r3 = 1
            return r3
        L16:
            boolean r3 = super.onStateChange(r3)
            return r3
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.up
            r0.setAlpha(r2)
            r1.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.up
            r0.setColorFilter(r2)
            r1.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.up
            r0.setDither(r2)
            r1.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.up
            r0.setFilterBitmap(r2)
            r1.invalidateSelf()
            return
    }

    public com.bytedance.adsdk.ugeno.widget.image.j xt(android.graphics.Shader.TileMode r2) {
            r1 = this;
            android.graphics.Shader$TileMode r0 = r1.jy
            if (r0 == r2) goto Lc
            r1.jy = r2
            r2 = 1
            r1.ws = r2
            r1.invalidateSelf()
        Lc:
            return r1
    }
}
