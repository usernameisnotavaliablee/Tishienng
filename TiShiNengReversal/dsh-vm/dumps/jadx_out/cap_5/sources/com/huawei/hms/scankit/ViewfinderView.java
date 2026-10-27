package com.huawei.hms.scankit;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class ViewfinderView extends android.view.View {
    private int[] A;
    private float[] B;
    private android.graphics.Rect C;
    private boolean D;
    android.graphics.Point E;
    private boolean F;
    private android.graphics.Paint a;
    private android.text.TextPaint b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private float h;
    private com.huawei.hms.scankit.ViewfinderView.c i;
    private java.lang.String j;
    private int k;
    private float l;
    public int m;
    public int n;
    private boolean o;
    private int p;
    private int q;
    private int r;
    private int s;
    private com.huawei.hms.scankit.ViewfinderView.b t;
    private int u;
    private int v;
    private android.graphics.Rect w;
    private int x;
    private android.animation.ValueAnimator y;
    android.graphics.Paint z;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.animation.ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ com.huawei.hms.scankit.ViewfinderView a;

        a(com.huawei.hms.scankit.ViewfinderView r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(android.animation.ValueAnimator r2) {
                r1 = this;
                com.huawei.hms.scankit.ViewfinderView r0 = r1.a
                java.lang.Object r2 = r2.getAnimatedValue()
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                r0.m = r2
                com.huawei.hms.scankit.ViewfinderView r2 = r1.a
                r2.invalidate()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum b extends java.lang.Enum<com.huawei.hms.scankit.ViewfinderView.b> {
        public static final com.huawei.hms.scankit.ViewfinderView.b b = null;
        public static final com.huawei.hms.scankit.ViewfinderView.b c = null;
        public static final com.huawei.hms.scankit.ViewfinderView.b d = null;
        private static final /* synthetic */ com.huawei.hms.scankit.ViewfinderView.b[] e = null;
        private int a;

        static {
                com.huawei.hms.scankit.ViewfinderView$b r0 = new com.huawei.hms.scankit.ViewfinderView$b
                java.lang.String r1 = "NONE"
                r2 = 0
                r0.<init>(r1, r2, r2)
                com.huawei.hms.scankit.ViewfinderView.b.b = r0
                com.huawei.hms.scankit.ViewfinderView$b r1 = new com.huawei.hms.scankit.ViewfinderView$b
                java.lang.String r3 = "LINE"
                r4 = 1
                r1.<init>(r3, r4, r4)
                com.huawei.hms.scankit.ViewfinderView.b.c = r1
                com.huawei.hms.scankit.ViewfinderView$b r3 = new com.huawei.hms.scankit.ViewfinderView$b
                java.lang.String r5 = "GRID"
                r6 = 2
                r3.<init>(r5, r6, r6)
                com.huawei.hms.scankit.ViewfinderView.b.d = r3
                r5 = 3
                com.huawei.hms.scankit.ViewfinderView$b[] r5 = new com.huawei.hms.scankit.ViewfinderView.b[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                com.huawei.hms.scankit.ViewfinderView.b.e = r5
                return
        }

        b(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.a = r3
                return
        }

        static /* synthetic */ int a(com.huawei.hms.scankit.ViewfinderView.b r0) {
                int r0 = r0.a
                return r0
        }

        static /* synthetic */ com.huawei.hms.scankit.ViewfinderView.b a(int r0) {
                com.huawei.hms.scankit.ViewfinderView$b r0 = b(r0)
                return r0
        }

        private static com.huawei.hms.scankit.ViewfinderView.b b(int r5) {
                com.huawei.hms.scankit.ViewfinderView$b[] r0 = values()
                int r1 = r0.length
                r2 = 0
            L6:
                if (r2 >= r1) goto L12
                r3 = r0[r2]
                int r4 = r3.a
                if (r4 != r5) goto Lf
                return r3
            Lf:
                int r2 = r2 + 1
                goto L6
            L12:
                com.huawei.hms.scankit.ViewfinderView$b r5 = com.huawei.hms.scankit.ViewfinderView.b.c
                return r5
        }

        public static com.huawei.hms.scankit.ViewfinderView.b valueOf(java.lang.String r1) {
                java.lang.Class<com.huawei.hms.scankit.ViewfinderView$b> r0 = com.huawei.hms.scankit.ViewfinderView.b.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.huawei.hms.scankit.ViewfinderView$b r1 = (com.huawei.hms.scankit.ViewfinderView.b) r1
                return r1
        }

        public static com.huawei.hms.scankit.ViewfinderView.b[] values() {
                com.huawei.hms.scankit.ViewfinderView$b[] r0 = com.huawei.hms.scankit.ViewfinderView.b.e
                java.lang.Object r0 = r0.clone()
                com.huawei.hms.scankit.ViewfinderView$b[] r0 = (com.huawei.hms.scankit.ViewfinderView.b[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum c extends java.lang.Enum<com.huawei.hms.scankit.ViewfinderView.c> {
        public static final com.huawei.hms.scankit.ViewfinderView.c b = null;
        public static final com.huawei.hms.scankit.ViewfinderView.c c = null;
        private static final /* synthetic */ com.huawei.hms.scankit.ViewfinderView.c[] d = null;
        private int a;

        static {
                com.huawei.hms.scankit.ViewfinderView$c r0 = new com.huawei.hms.scankit.ViewfinderView$c
                java.lang.String r1 = "TOP"
                r2 = 0
                r0.<init>(r1, r2, r2)
                com.huawei.hms.scankit.ViewfinderView.c.b = r0
                com.huawei.hms.scankit.ViewfinderView$c r1 = new com.huawei.hms.scankit.ViewfinderView$c
                java.lang.String r3 = "BOTTOM"
                r4 = 1
                r1.<init>(r3, r4, r4)
                com.huawei.hms.scankit.ViewfinderView.c.c = r1
                r3 = 2
                com.huawei.hms.scankit.ViewfinderView$c[] r3 = new com.huawei.hms.scankit.ViewfinderView.c[r3]
                r3[r2] = r0
                r3[r4] = r1
                com.huawei.hms.scankit.ViewfinderView.c.d = r3
                return
        }

        c(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.a = r3
                return
        }

        static /* synthetic */ com.huawei.hms.scankit.ViewfinderView.c a(int r0) {
                com.huawei.hms.scankit.ViewfinderView$c r0 = b(r0)
                return r0
        }

        private static com.huawei.hms.scankit.ViewfinderView.c b(int r5) {
                com.huawei.hms.scankit.ViewfinderView$c[] r0 = values()
                int r1 = r0.length
                r2 = 0
            L6:
                if (r2 >= r1) goto L12
                r3 = r0[r2]
                int r4 = r3.a
                if (r4 != r5) goto Lf
                return r3
            Lf:
                int r2 = r2 + 1
                goto L6
            L12:
                com.huawei.hms.scankit.ViewfinderView$c r5 = com.huawei.hms.scankit.ViewfinderView.c.b
                return r5
        }

        public static com.huawei.hms.scankit.ViewfinderView.c valueOf(java.lang.String r1) {
                java.lang.Class<com.huawei.hms.scankit.ViewfinderView$c> r0 = com.huawei.hms.scankit.ViewfinderView.c.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.huawei.hms.scankit.ViewfinderView$c r1 = (com.huawei.hms.scankit.ViewfinderView.c) r1
                return r1
        }

        public static com.huawei.hms.scankit.ViewfinderView.c[] values() {
                com.huawei.hms.scankit.ViewfinderView$c[] r0 = com.huawei.hms.scankit.ViewfinderView.c.d
                java.lang.Object r0 = r0.clone()
                com.huawei.hms.scankit.ViewfinderView$c[] r0 = (com.huawei.hms.scankit.ViewfinderView.c[]) r0
                return r0
        }
    }

    public ViewfinderView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ViewfinderView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public ViewfinderView(android.content.Context r8, android.util.AttributeSet r9, int r10) {
            r7 = this;
            r7.<init>(r8, r9, r10)
            r10 = 0
            r7.m = r10
            r7.n = r10
            android.graphics.Rect r10 = new android.graphics.Rect
            r10.<init>()
            r7.w = r10
            android.graphics.Paint r10 = new android.graphics.Paint
            r10.<init>()
            r7.z = r10
            java.lang.String r10 = "#FFFFFFFF"
            int r0 = android.graphics.Color.parseColor(r10)
            java.lang.String r10 = "#72FFFFFF"
            int r1 = android.graphics.Color.parseColor(r10)
            java.lang.String r10 = "#58FFFFFF"
            int r2 = android.graphics.Color.parseColor(r10)
            java.lang.String r10 = "#40FFFFFF"
            int r3 = android.graphics.Color.parseColor(r10)
            java.lang.String r10 = "#28FFFFFF"
            int r4 = android.graphics.Color.parseColor(r10)
            java.lang.String r10 = "#13FFFFFF"
            int r5 = android.graphics.Color.parseColor(r10)
            java.lang.String r10 = "#00FFFFFF"
            int r6 = android.graphics.Color.parseColor(r10)
            int[] r10 = new int[]{r0, r1, r2, r3, r4, r5, r6}
            r7.A = r10
            r10 = 7
            float[] r10 = new float[r10]
            r10 = {x0058: FILL_ARRAY_DATA , data: [0, 1056964608, 1058642330, 1060320051, 1061997773, 1063675494, 1065353216} // fill-array
            r7.B = r10
            r10 = 1
            r7.D = r10
            r7.F = r10
            r7.a(r8, r9)
            return
    }

    public static int a(android.content.Context r0, int r1) {
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = (float) r1
            float r1 = r1 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            return r0
    }

    private void a(android.content.Context r5, android.util.AttributeSet r6) {
            r4 = this;
            int[] r0 = com.huawei.hms.scankit.R.styleable.ViewfinderView
            android.content.res.TypedArray r6 = r5.obtainStyledAttributes(r6, r0)
            int r0 = com.huawei.hms.scankit.R.styleable.ViewfinderView_scankit_maskColor
            int r1 = com.huawei.hms.scankit.R.color.scankit_viewfinder_mask
            int r1 = b(r5, r1)
            int r0 = r6.getColor(r0, r1)
            r4.c = r0
            int r0 = com.huawei.hms.scankit.R.styleable.ViewfinderView_scankit_frameColor
            int r1 = com.huawei.hms.scankit.R.color.scankit_viewfinder_frame
            int r1 = b(r5, r1)
            int r0 = r6.getColor(r0, r1)
            r4.d = r0
            int r0 = com.huawei.hms.scankit.R.styleable.ViewfinderView_scankit_cornerColor
            int r1 = com.huawei.hms.scankit.R.color.scankit_viewfinder_corner
            int r1 = b(r5, r1)
            int r0 = r6.getColor(r0, r1)
            r4.f = r0
            int r0 = com.huawei.hms.scankit.R.styleable.ViewfinderView_scankit_laserColor
            int r1 = com.huawei.hms.scankit.R.color.scankit_viewfinder_lasers
            int r1 = b(r5, r1)
            int r0 = r6.getColor(r0, r1)
            r4.e = r0
            int r0 = com.huawei.hms.scankit.R.styleable.ViewfinderView_scankit_resultPointColor
            int r1 = com.huawei.hms.scankit.R.color.scankit_viewfinder_result_point_color
            int r1 = b(r5, r1)
            int r0 = r6.getColor(r0, r1)
            r4.g = r0
            int r0 = com.huawei.hms.scankit.R.styleable.ViewfinderView_scankit_labelText
            java.lang.String r0 = r6.getString(r0)
            r4.j = r0
            int r0 = com.huawei.hms.scankit.R.styleable.ViewfinderView_scankit_labelTextColor
            int r1 = com.huawei.hms.scankit.R.color.scankit_viewfinder_text_color
            int r1 = b(r5, r1)
            int r0 = r6.getColor(r0, r1)
            r4.k = r0
            int r0 = com.huawei.hms.scankit.R.styleable.ViewfinderView_scankit_labelTextSize
            android.content.res.Resources r1 = r4.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            r2 = 2
            r3 = 1096810496(0x41600000, float:14.0)
            float r1 = android.util.TypedValue.applyDimension(r2, r3, r1)
            float r0 = r6.getDimension(r0, r1)
            r4.l = r0
            int r0 = com.huawei.hms.scankit.R.styleable.ViewfinderView_scankit_labelTextPadding
            android.content.res.Resources r1 = r4.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            r2 = 1103101952(0x41c00000, float:24.0)
            r3 = 1
            float r1 = android.util.TypedValue.applyDimension(r3, r2, r1)
            float r0 = r6.getDimension(r0, r1)
            r4.h = r0
            int r0 = com.huawei.hms.scankit.R.styleable.ViewfinderView_scankit_labelTextLocation
            r1 = 0
            int r0 = r6.getInt(r0, r1)
            com.huawei.hms.scankit.ViewfinderView$c r0 = com.huawei.hms.scankit.ViewfinderView.c.a(r0)
            r4.i = r0
            int r0 = com.huawei.hms.scankit.R.styleable.ViewfinderView_scankit_showResultPoint
            boolean r0 = r6.getBoolean(r0, r1)
            r4.o = r0
            int r0 = com.huawei.hms.scankit.R.styleable.ViewfinderView_scankit_frameWidth
            int r0 = r6.getDimensionPixelSize(r0, r1)
            r4.r = r0
            int r0 = com.huawei.hms.scankit.R.styleable.ViewfinderView_scankit_frameHeight
            int r0 = r6.getDimensionPixelSize(r0, r1)
            r4.s = r0
            int r0 = com.huawei.hms.scankit.R.styleable.ViewfinderView_scankit_laserStyle
            com.huawei.hms.scankit.ViewfinderView$b r1 = com.huawei.hms.scankit.ViewfinderView.b.c
            int r1 = com.huawei.hms.scankit.ViewfinderView.b.a(r1)
            int r0 = r6.getInt(r0, r1)
            com.huawei.hms.scankit.ViewfinderView$b r0 = com.huawei.hms.scankit.ViewfinderView.b.a(r0)
            r4.t = r0
            int r0 = com.huawei.hms.scankit.R.styleable.ViewfinderView_scankit_gridColumn
            r1 = 20
            int r0 = r6.getInt(r0, r1)
            r4.u = r0
            int r0 = com.huawei.hms.scankit.R.styleable.ViewfinderView_scankit_gridHeight
            android.content.res.Resources r1 = r4.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            r2 = 1109393408(0x42200000, float:40.0)
            float r1 = android.util.TypedValue.applyDimension(r3, r2, r1)
            float r0 = r6.getDimension(r0, r1)
            int r0 = (int) r0
            r4.v = r0
            int r0 = com.huawei.hms.scankit.R.styleable.ViewfinderView_scankit_line_anim
            boolean r0 = r6.getBoolean(r0, r3)
            r4.F = r0
            r6.recycle()
            android.graphics.Paint r6 = new android.graphics.Paint
            r6.<init>(r3)
            r4.a = r6
            android.text.TextPaint r6 = new android.text.TextPaint
            r6.<init>(r3)
            r4.b = r6
            r6 = 136(0x88, float:1.9E-43)
            int r5 = a(r5, r6)
            r4.x = r5
            android.util.DisplayMetrics r5 = r4.getDisplayMetrics()
            int r5 = r5.heightPixels
            r4.q = r5
            android.util.DisplayMetrics r5 = r4.getDisplayMetrics()
            int r5 = r5.widthPixels
            r4.p = r5
            return
    }

    private void a(android.graphics.Canvas r19) {
            r18 = this;
            r0 = r18
            r1 = r19
            android.graphics.Rect r2 = r0.C
            if (r2 != 0) goto L9
            return
        L9:
            int r2 = r1.getWidth()
            int r3 = r1.getHeight()
            boolean r4 = r0.D
            if (r4 == 0) goto L21
            android.graphics.Point r4 = new android.graphics.Point
            android.graphics.Point r5 = r0.E
            int r6 = r5.y
            int r5 = r5.x
            r4.<init>(r6, r5)
            goto L2c
        L21:
            android.graphics.Point r4 = new android.graphics.Point
            android.graphics.Point r5 = r0.E
            int r6 = r5.x
            int r5 = r5.y
            r4.<init>(r6, r5)
        L2c:
            float r5 = (float) r2
            int r6 = r4.x
            float r7 = (float) r6
            float r5 = r5 / r7
            float r7 = (float) r3
            int r8 = r4.y
            float r9 = (float) r8
            float r7 = r7 / r9
            double r8 = (double) r8
            r10 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            double r8 = r8 * r10
            int r8 = (int) r8
            double r9 = (double) r6
            r11 = 4594572339843380019(0x3fc3333333333333, double:0.15)
            double r9 = r9 * r11
            r11 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r9 = r9 / r11
            int r6 = (int) r9
            android.graphics.RectF r9 = new android.graphics.RectF
            r9.<init>()
            boolean r10 = r0.D
            r11 = 0
            if (r10 == 0) goto L7c
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 <= 0) goto L6a
            int r10 = r4.y
            float r10 = (float) r10
            float r10 = r10 * r5
            int r10 = (int) r10
            int r12 = r3 / 2
            int r13 = r10 / 2
            int r12 = r12 - r13
            float r12 = (float) r12
            r1.translate(r11, r12)
        L68:
            r12 = r2
            goto La0
        L6a:
            int r10 = r4.x
            float r10 = (float) r10
            float r10 = r10 * r7
            int r10 = (int) r10
            int r12 = r2 / 2
            int r13 = r10 / 2
            int r12 = r12 - r13
            float r12 = (float) r12
            r1.translate(r12, r11)
        L79:
            r12 = r10
            r10 = r3
            goto La0
        L7c:
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 <= 0) goto L90
            int r10 = r4.y
            float r10 = (float) r10
            float r10 = r10 * r5
            int r10 = (int) r10
            int r12 = r3 / 2
            int r13 = r10 / 2
            int r12 = r12 - r13
            float r12 = (float) r12
            r1.translate(r11, r12)
            goto L68
        L90:
            int r10 = r4.x
            float r10 = (float) r10
            float r10 = r10 * r7
            int r10 = (int) r10
            int r12 = r2 / 2
            int r13 = r10 / 2
            int r12 = r12 - r13
            float r12 = (float) r12
            r1.translate(r12, r11)
            goto L79
        La0:
            android.graphics.Rect r13 = r0.C
            int r14 = r13.left
            int r14 = r14 + r6
            float r14 = (float) r14
            int r15 = r4.x
            float r15 = (float) r15
            float r14 = r14 / r15
            int r11 = r13.right
            int r11 = r11 + r6
            float r6 = (float) r11
            float r6 = r6 / r15
            int r11 = r13.top
            int r11 = r11 + r8
            float r11 = (float) r11
            int r4 = r4.y
            float r4 = (float) r4
            float r11 = r11 / r4
            int r13 = r13.bottom
            int r13 = r13 + r8
            float r8 = (float) r13
            float r8 = r8 / r4
            float r4 = (float) r12
            float r14 = r14 * r4
            r9.left = r14
            float r6 = r6 * r4
            r9.right = r6
            float r4 = (float) r10
            float r11 = r11 * r4
            r9.top = r11
            float r8 = r8 * r4
            r9.bottom = r8
            float r14 = r14 + r6
            r4 = 1073741824(0x40000000, float:2.0)
            float r14 = r14 / r4
            float r11 = r11 + r8
            float r11 = r11 / r4
            android.graphics.Paint r4 = r0.z
            android.graphics.Paint$Style r6 = android.graphics.Paint.Style.FILL
            r4.setStyle(r6)
            android.graphics.Paint r4 = r0.z
            r6 = -1
            r4.setColor(r6)
            android.util.DisplayMetrics r4 = r0.getDisplayMetrics()
            float r4 = r4.density
            r6 = 1103101952(0x41c00000, float:24.0)
            float r4 = r4 * r6
            double r8 = (double) r4
            r16 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r8 = r8 + r16
            int r4 = (int) r8
            int r4 = r4 / 2
            float r4 = (float) r4
            android.graphics.Paint r6 = r0.z
            r1.drawCircle(r14, r11, r4, r6)
            android.graphics.Paint r4 = r0.z
            java.lang.String r6 = "#007DFF"
            int r6 = android.graphics.Color.parseColor(r6)
            r4.setColor(r6)
            android.util.DisplayMetrics r4 = r0.getDisplayMetrics()
            float r4 = r4.density
            r6 = 1102053376(0x41b00000, float:22.0)
            float r4 = r4 * r6
            double r8 = (double) r4
            double r8 = r8 + r16
            int r4 = (int) r8
            int r4 = r4 / 2
            float r4 = (float) r4
            android.graphics.Paint r6 = r0.z
            r1.drawCircle(r14, r11, r4, r6)
            boolean r4 = r0.D
            if (r4 == 0) goto L138
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 <= 0) goto L12d
            int r10 = r10 / 2
            int r3 = r3 / 2
            int r10 = r10 - r3
            float r2 = (float) r10
            r4 = 0
            r1.translate(r4, r2)
            return
        L12d:
            r4 = 0
            int r12 = r12 / 2
            int r2 = r2 / 2
            int r12 = r12 - r2
            float r2 = (float) r12
            r1.translate(r2, r4)
            return
        L138:
            r4 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L147
            int r10 = r10 / 2
            int r3 = r3 / 2
            int r10 = r10 - r3
            float r2 = (float) r10
            r1.translate(r4, r2)
            return
        L147:
            int r12 = r12 / 2
            int r2 = r2 / 2
            int r12 = r12 - r2
            float r2 = (float) r12
            r1.translate(r2, r4)
            return
    }

    private void a(android.graphics.Canvas r11, boolean r12) {
            r10 = this;
            android.graphics.Paint r0 = r10.a
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r0.setStyle(r1)
            android.graphics.Paint r0 = r10.a
            int r1 = r10.e
            r0.setColor(r1)
            boolean r0 = com.huawei.hms.scankit.e.z
            if (r0 != 0) goto L28
            if (r12 == 0) goto L15
            goto L28
        L15:
            android.graphics.Rect r12 = r10.w
            r0 = 0
            r12.left = r0
            int r0 = r10.m
            r12.top = r0
            int r1 = r10.x
            int r0 = r0 + r1
            r12.bottom = r0
            int r0 = r10.p
            r12.right = r0
            goto L3f
        L28:
            android.graphics.Rect r12 = r10.w
            int r0 = r10.p
            int r0 = r0 / 2
            int r1 = r0 + (-540)
            r12.left = r1
            int r1 = r10.m
            r12.top = r1
            int r2 = r10.x
            int r1 = r1 + r2
            r12.bottom = r1
            int r0 = r0 + 540
            r12.right = r0
        L3f:
            int r12 = r10.p
            int r12 = r12 / 2
            android.graphics.Rect r0 = r10.w
            int r0 = r0.bottom
            int r0 = r0 + 500
            android.graphics.RadialGradient r1 = new android.graphics.RadialGradient
            float r2 = (float) r12
            float r3 = (float) r0
            r0 = 690(0x2b2, float:9.67E-43)
            float r4 = (float) r0
            int[] r5 = r10.A
            float[] r6 = r10.B
            android.graphics.Shader$TileMode r7 = android.graphics.Shader.TileMode.CLAMP
            r1.<init>(r2, r3, r4, r5, r6, r7)
            android.graphics.Paint r0 = r10.a
            r0.setShader(r1)
            android.graphics.Paint r0 = r10.a
            r1 = 1092616192(0x41200000, float:10.0)
            r0.setStrokeWidth(r1)
            android.graphics.Rect r0 = r10.w
            int r1 = r0.left
            float r5 = (float) r1
            int r1 = r0.bottom
            float r6 = (float) r1
            int r0 = r0.right
            float r7 = (float) r0
            android.graphics.Paint r9 = r10.a
            r8 = r6
            r4 = r11
            r4.drawLine(r5, r6, r7, r8, r9)
            android.graphics.Rect r11 = r10.w
            r4.clipRect(r11)
            int r12 = r12 + 200
            float r11 = (float) r12
            android.graphics.Paint r12 = r10.a
            r4.drawCircle(r2, r3, r11, r12)
            return
    }

    public static int b(android.content.Context r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L14
            r1 = 23
            if (r0 < r1) goto Lb
            int r2 = androidx.databinding.b.a(r2, r3)     // Catch: java.lang.Throwable -> L14
            return r2
        Lb:
            android.content.res.Resources r2 = r2.getResources()     // Catch: java.lang.Throwable -> L14
            int r2 = r2.getColor(r3)     // Catch: java.lang.Throwable -> L14
            return r2
        L14:
            r2 = 16777215(0xffffff, float:2.3509886E-38)
            return r2
    }

    private android.util.DisplayMetrics getDisplayMetrics() {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            return r0
    }

    public void a() {
            r3 = this;
            boolean r0 = com.huawei.hms.scankit.e.z
            if (r0 == 0) goto L9
            int r0 = r3.q
            r3.n = r0
            goto L18
        L9:
            int r0 = r3.q
            android.content.Context r1 = r3.getContext()
            r2 = 139(0x8b, float:1.95E-43)
            int r1 = a(r1, r2)
            int r0 = r0 - r1
            r3.n = r0
        L18:
            int r0 = r3.n
            int r1 = r3.x
            int r0 = r0 - r1
            r1 = 0
            int[] r0 = new int[]{r1, r0}
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofInt(r0)
            r3.y = r0
            r1 = 3000(0xbb8, double:1.482E-320)
            r0.setDuration(r1)
            android.animation.ValueAnimator r0 = r3.y
            android.view.animation.AccelerateDecelerateInterpolator r1 = new android.view.animation.AccelerateDecelerateInterpolator
            r1.<init>()
            r0.setInterpolator(r1)
            android.animation.ValueAnimator r0 = r3.y
            r1 = 1
            r0.setRepeatMode(r1)
            android.animation.ValueAnimator r0 = r3.y
            r1 = -1
            r0.setRepeatCount(r1)
            android.animation.ValueAnimator r0 = r3.y
            com.huawei.hms.scankit.ViewfinderView$a r1 = new com.huawei.hms.scankit.ViewfinderView$a
            r1.<init>(r3)
            r0.addUpdateListener(r1)
            android.animation.ValueAnimator r0 = r3.y
            r0.start()
            return
    }

    public void a(android.graphics.Rect r1, boolean r2, android.graphics.Point r3) {
            r0 = this;
            r0.D = r2
            r0.E = r3
            android.graphics.Rect r2 = r0.C
            if (r2 != 0) goto Ld
            r0.C = r1
            r0.invalidate()
        Ld:
            return
    }

    public void a(com.huawei.hms.scankit.p.u6 r1) {
            r0 = this;
            return
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
            r0 = this;
            super.onAttachedToWindow()
            return
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            android.animation.ValueAnimator r0 = r1.y
            if (r0 == 0) goto L14
            r0.pause()
            android.animation.ValueAnimator r0 = r1.y
            r0.removeAllListeners()
            android.animation.ValueAnimator r0 = r1.y
            r0.cancel()
        L14:
            return
    }

    @Override // android.view.View
    @android.annotation.SuppressLint({"DrawAllocation"})
    public void onDraw(android.graphics.Canvas r3) {
            r2 = this;
            boolean r0 = r2.F
            if (r0 == 0) goto L23
            r3.save()
            java.lang.String r0 = android.os.Build.DEVICE
            java.lang.String r1 = "HWTAH"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L1c
            java.lang.String r1 = "HWTAH-C"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1a
            goto L1c
        L1a:
            r0 = 0
            goto L1d
        L1c:
            r0 = 1
        L1d:
            r2.a(r3, r0)
            r3.restore()
        L23:
            r2.a(r3)
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r1, int r2) {
            r0 = this;
            super.onMeasure(r1, r2)
            return
    }

    @Override // android.view.View
    protected void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.onSizeChanged(r1, r2, r3, r4)
            r0.p = r1
            r0.q = r2
            r0.a()
            return
    }
}
