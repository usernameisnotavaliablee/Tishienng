package com.scwang.smartrefresh.header;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class StoreHouseHeader extends android.view.View implements l2.e {
    private static final float u = 0.7f;
    private static final float v = 0.4f;
    private static final float w = 1.0f;
    private static final float x = 0.4f;
    private static final int y = 400;
    public java.util.ArrayList<com.scwang.smartrefresh.header.storehouse.a> a;
    private int b;
    private float c;
    private int d;
    private int e;
    private float f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private android.view.animation.Transformation m;
    private boolean n;
    private com.scwang.smartrefresh.header.StoreHouseHeader.b o;
    private int p;
    private int q;
    private android.graphics.Matrix r;
    private l2.g s;
    private java.lang.Runnable t;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class b implements java.lang.Runnable {
        private int a;
        private int b;
        private int c;
        private int d;
        private boolean e;
        final /* synthetic */ com.scwang.smartrefresh.header.StoreHouseHeader f;

        private b(com.scwang.smartrefresh.header.StoreHouseHeader r1) {
                r0 = this;
                r0.f = r1
                r0.<init>()
                r1 = 0
                r0.a = r1
                r0.b = r1
                r0.c = r1
                r0.d = r1
                r1 = 1
                r0.e = r1
                return
        }

        /* synthetic */ b(com.scwang.smartrefresh.header.StoreHouseHeader r1, com.scwang.smartrefresh.header.StoreHouseHeader.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        static /* synthetic */ void a(com.scwang.smartrefresh.header.StoreHouseHeader.b r0) {
                r0.c()
                return
        }

        static /* synthetic */ void b(com.scwang.smartrefresh.header.StoreHouseHeader.b r0) {
                r0.d()
                return
        }

        private void c() {
                r3 = this;
                r0 = 1
                r3.e = r0
                r1 = 0
                r3.a = r1
                com.scwang.smartrefresh.header.StoreHouseHeader r1 = r3.f
                int r1 = com.scwang.smartrefresh.header.StoreHouseHeader.m(r1)
                com.scwang.smartrefresh.header.StoreHouseHeader r2 = r3.f
                java.util.ArrayList<com.scwang.smartrefresh.header.storehouse.a> r2 = r2.a
                int r2 = r2.size()
                int r1 = r1 / r2
                r3.d = r1
                com.scwang.smartrefresh.header.StoreHouseHeader r1 = r3.f
                int r1 = com.scwang.smartrefresh.header.StoreHouseHeader.n(r1)
                int r2 = r3.d
                int r1 = r1 / r2
                r3.b = r1
                com.scwang.smartrefresh.header.StoreHouseHeader r1 = r3.f
                java.util.ArrayList<com.scwang.smartrefresh.header.storehouse.a> r1 = r1.a
                int r1 = r1.size()
                int r2 = r3.b
                int r1 = r1 / r2
                int r1 = r1 + r0
                r3.c = r1
                r3.run()
                return
        }

        private void d() {
                r1 = this;
                r0 = 0
                r1.e = r0
                com.scwang.smartrefresh.header.StoreHouseHeader r0 = r1.f
                r0.removeCallbacks(r1)
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r6 = this;
                int r0 = r6.a
                int r1 = r6.b
                int r0 = r0 % r1
                r1 = 0
                r2 = 0
            L7:
                int r3 = r6.c
                r4 = 1
                if (r2 >= r3) goto L42
                int r3 = r6.b
                int r3 = r3 * r2
                int r3 = r3 + r0
                int r5 = r6.a
                if (r3 <= r5) goto L16
                goto L3f
            L16:
                com.scwang.smartrefresh.header.StoreHouseHeader r5 = r6.f
                java.util.ArrayList<com.scwang.smartrefresh.header.storehouse.a> r5 = r5.a
                int r5 = r5.size()
                int r3 = r3 % r5
                com.scwang.smartrefresh.header.StoreHouseHeader r5 = r6.f
                java.util.ArrayList<com.scwang.smartrefresh.header.storehouse.a> r5 = r5.a
                java.lang.Object r3 = r5.get(r3)
                com.scwang.smartrefresh.header.storehouse.a r3 = (com.scwang.smartrefresh.header.storehouse.a) r3
                r3.setFillAfter(r1)
                r3.setFillEnabled(r4)
                r3.setFillBefore(r1)
                r4 = 400(0x190, double:1.976E-321)
                r3.setDuration(r4)
                r4 = 1065353216(0x3f800000, float:1.0)
                r5 = 1053609165(0x3ecccccd, float:0.4)
                r3.g(r4, r5)
            L3f:
                int r2 = r2 + 1
                goto L7
            L42:
                int r0 = r6.a
                int r0 = r0 + r4
                r6.a = r0
                boolean r0 = r6.e
                if (r0 == 0) goto L67
                com.scwang.smartrefresh.header.StoreHouseHeader r0 = r6.f
                l2.g r0 = com.scwang.smartrefresh.header.StoreHouseHeader.z(r0)
                if (r0 == 0) goto L67
                com.scwang.smartrefresh.header.StoreHouseHeader r0 = r6.f
                l2.g r0 = com.scwang.smartrefresh.header.StoreHouseHeader.z(r0)
                l2.h r0 = r0.c()
                android.view.ViewGroup r0 = r0.getLayout()
                int r1 = r6.d
                long r1 = (long) r1
                r0.postDelayed(r6, r1)
            L67:
                return
        }
    }

    public StoreHouseHeader(android.content.Context r5) {
            r4 = this;
            r4.<init>(r5)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.a = r0
            r0 = -1
            r4.b = r0
            r1 = 1065353216(0x3f800000, float:1.0)
            r4.c = r1
            r4.d = r0
            r4.e = r0
            r1 = 0
            r4.f = r1
            r1 = 0
            r4.g = r1
            r4.h = r1
            r4.i = r1
            r4.j = r1
            r2 = 1000(0x3e8, float:1.401E-42)
            r4.k = r2
            r4.l = r2
            android.view.animation.Transformation r2 = new android.view.animation.Transformation
            r2.<init>()
            r4.m = r2
            r4.n = r1
            com.scwang.smartrefresh.header.StoreHouseHeader$b r2 = new com.scwang.smartrefresh.header.StoreHouseHeader$b
            r3 = 0
            r2.<init>(r4, r3)
            r4.o = r2
            r4.p = r0
            r4.q = r1
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r4.r = r0
            r4.B(r5, r3)
            return
    }

    public StoreHouseHeader(android.content.Context r5, android.util.AttributeSet r6) {
            r4 = this;
            r4.<init>(r5, r6)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.a = r0
            r0 = -1
            r4.b = r0
            r1 = 1065353216(0x3f800000, float:1.0)
            r4.c = r1
            r4.d = r0
            r4.e = r0
            r1 = 0
            r4.f = r1
            r1 = 0
            r4.g = r1
            r4.h = r1
            r4.i = r1
            r4.j = r1
            r2 = 1000(0x3e8, float:1.401E-42)
            r4.k = r2
            r4.l = r2
            android.view.animation.Transformation r2 = new android.view.animation.Transformation
            r2.<init>()
            r4.m = r2
            r4.n = r1
            com.scwang.smartrefresh.header.StoreHouseHeader$b r2 = new com.scwang.smartrefresh.header.StoreHouseHeader$b
            r3 = 0
            r2.<init>(r4, r3)
            r4.o = r2
            r4.p = r0
            r4.q = r1
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r4.r = r0
            r4.B(r5, r6)
            return
    }

    public StoreHouseHeader(android.content.Context r4, android.util.AttributeSet r5, int r6) {
            r3 = this;
            r3.<init>(r4, r5, r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r3.a = r6
            r6 = -1
            r3.b = r6
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.c = r0
            r3.d = r6
            r3.e = r6
            r0 = 0
            r3.f = r0
            r0 = 0
            r3.g = r0
            r3.h = r0
            r3.i = r0
            r3.j = r0
            r1 = 1000(0x3e8, float:1.401E-42)
            r3.k = r1
            r3.l = r1
            android.view.animation.Transformation r1 = new android.view.animation.Transformation
            r1.<init>()
            r3.m = r1
            r3.n = r0
            com.scwang.smartrefresh.header.StoreHouseHeader$b r1 = new com.scwang.smartrefresh.header.StoreHouseHeader$b
            r2 = 0
            r1.<init>(r3, r2)
            r3.o = r1
            r3.p = r6
            r3.q = r0
            android.graphics.Matrix r6 = new android.graphics.Matrix
            r6.<init>()
            r3.r = r6
            r3.B(r4, r5)
            return
    }

    @androidx.annotation.RequiresApi(21)
    public StoreHouseHeader(android.content.Context r3, @androidx.annotation.Nullable android.util.AttributeSet r4, int r5, int r6) {
            r2 = this;
            r2.<init>(r3, r4, r5, r6)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r2.a = r5
            r5 = -1
            r2.b = r5
            r6 = 1065353216(0x3f800000, float:1.0)
            r2.c = r6
            r2.d = r5
            r2.e = r5
            r6 = 0
            r2.f = r6
            r6 = 0
            r2.g = r6
            r2.h = r6
            r2.i = r6
            r2.j = r6
            r0 = 1000(0x3e8, float:1.401E-42)
            r2.k = r0
            r2.l = r0
            android.view.animation.Transformation r0 = new android.view.animation.Transformation
            r0.<init>()
            r2.m = r0
            r2.n = r6
            com.scwang.smartrefresh.header.StoreHouseHeader$b r0 = new com.scwang.smartrefresh.header.StoreHouseHeader$b
            r1 = 0
            r0.<init>(r2, r1)
            r2.o = r0
            r2.p = r5
            r2.q = r6
            android.graphics.Matrix r5 = new android.graphics.Matrix
            r5.<init>()
            r2.r = r5
            r2.B(r3, r4)
            return
    }

    private void A() {
            r1 = this;
            r0 = 1
            r1.n = r0
            com.scwang.smartrefresh.header.StoreHouseHeader$b r0 = r1.o
            com.scwang.smartrefresh.header.StoreHouseHeader.b.a(r0)
            r1.invalidate()
            return
    }

    private void B(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            com.scwang.smartrefresh.layout.util.c r0 = new com.scwang.smartrefresh.layout.util.c
            r0.<init>()
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = r0.a(r1)
            r2.b = r1
            r1 = 1109393408(0x42200000, float:40.0)
            int r0 = r0.a(r1)
            r2.d = r0
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.widthPixels
            int r0 = r0 / 2
            r2.e = r0
            r0 = -13421773(0xffffffffff333333, float:-2.3819765E38)
            r2.q = r0
            r0 = -3355444(0xffffffffffcccccc, float:NaN)
            r2.N(r0)
            int[] r0 = com.scwang.smartrefresh.header.R.styleable.StoreHouseHeader
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r0)
            int r4 = com.scwang.smartrefresh.header.R.styleable.StoreHouseHeader_shhLineWidth
            int r0 = r2.b
            int r4 = r3.getDimensionPixelOffset(r4, r0)
            r2.b = r4
            int r4 = com.scwang.smartrefresh.header.R.styleable.StoreHouseHeader_shhDropHeight
            int r0 = r2.d
            int r4 = r3.getDimensionPixelOffset(r4, r0)
            r2.d = r4
            int r4 = com.scwang.smartrefresh.header.R.styleable.StoreHouseHeader_shhText
            boolean r0 = r3.hasValue(r4)
            if (r0 == 0) goto L58
            java.lang.String r4 = r3.getString(r4)
            r2.D(r4)
            goto L5d
        L58:
            java.lang.String r4 = "StoreHouse"
            r2.D(r4)
        L5d:
            r3.recycle()
            int r3 = r2.h
            int r4 = com.scwang.smartrefresh.layout.util.c.b(r1)
            int r3 = r3 + r4
            r2.setMinimumHeight(r3)
            return
    }

    private void G() {
            r1 = this;
            r0 = 0
            r1.n = r0
            com.scwang.smartrefresh.header.StoreHouseHeader$b r0 = r1.o
            com.scwang.smartrefresh.header.StoreHouseHeader.b.b(r0)
            return
    }

    private void H(l2.h r1) {
            r0 = this;
            return
    }

    private void I() {
            r1 = this;
            java.lang.Runnable r0 = r1.t
            if (r0 == 0) goto La
            r0.run()
            r0 = 0
            r1.t = r0
        La:
            return
    }

    private int getBottomOffset() {
            r2 = this;
            int r0 = r2.getPaddingBottom()
            r1 = 1092616192(0x41200000, float:10.0)
            int r1 = com.scwang.smartrefresh.layout.util.c.b(r1)
            int r0 = r0 + r1
            return r0
    }

    private int getTopOffset() {
            r2 = this;
            int r0 = r2.getPaddingTop()
            r1 = 1092616192(0x41200000, float:10.0)
            int r1 = com.scwang.smartrefresh.layout.util.c.b(r1)
            int r0 = r0 + r1
            return r0
    }

    static /* synthetic */ int m(com.scwang.smartrefresh.header.StoreHouseHeader r0) {
            int r0 = r0.k
            return r0
    }

    static /* synthetic */ int n(com.scwang.smartrefresh.header.StoreHouseHeader r0) {
            int r0 = r0.l
            return r0
    }

    private void setProgress(float r1) {
            r0 = this;
            r0.f = r1
            return
    }

    static /* synthetic */ l2.g z(com.scwang.smartrefresh.header.StoreHouseHeader r0) {
            l2.g r0 = r0.s
            return r0
    }

    public com.scwang.smartrefresh.header.StoreHouseHeader C(java.util.ArrayList<float[]> r13) {
            r12 = this;
            java.util.ArrayList<com.scwang.smartrefresh.header.storehouse.a> r0 = r12.a
            int r0 = r0.size()
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            java.util.ArrayList<com.scwang.smartrefresh.header.storehouse.a> r3 = r12.a
            r3.clear()
            com.scwang.smartrefresh.layout.util.c r3 = new com.scwang.smartrefresh.layout.util.c
            r3.<init>()
            r4 = 0
            r5 = 0
            r7 = 0
        L1a:
            int r6 = r13.size()
            if (r7 >= r6) goto L8c
            java.lang.Object r6 = r13.get(r7)
            float[] r6 = (float[]) r6
            android.graphics.PointF r8 = new android.graphics.PointF
            r9 = r6[r1]
            int r9 = r3.a(r9)
            float r9 = (float) r9
            float r10 = r12.c
            float r9 = r9 * r10
            r10 = r6[r2]
            int r10 = r3.a(r10)
            float r10 = (float) r10
            float r11 = r12.c
            float r10 = r10 * r11
            r8.<init>(r9, r10)
            android.graphics.PointF r9 = new android.graphics.PointF
            r10 = 2
            r10 = r6[r10]
            int r10 = r3.a(r10)
            float r10 = (float) r10
            float r11 = r12.c
            float r10 = r10 * r11
            r11 = 3
            r6 = r6[r11]
            int r6 = r3.a(r6)
            float r6 = (float) r6
            float r11 = r12.c
            float r6 = r6 * r11
            r9.<init>(r10, r6)
            float r6 = r8.x
            float r4 = java.lang.Math.max(r4, r6)
            float r6 = r9.x
            float r4 = java.lang.Math.max(r4, r6)
            float r6 = r8.y
            float r5 = java.lang.Math.max(r5, r6)
            float r6 = r9.y
            float r5 = java.lang.Math.max(r5, r6)
            com.scwang.smartrefresh.header.storehouse.a r6 = new com.scwang.smartrefresh.header.storehouse.a
            int r10 = r12.p
            int r11 = r12.b
            r6.<init>(r7, r8, r9, r10, r11)
            int r8 = r12.e
            r6.b(r8)
            java.util.ArrayList<com.scwang.smartrefresh.header.storehouse.a> r8 = r12.a
            r8.add(r6)
            int r7 = r7 + 1
            goto L1a
        L8c:
            double r1 = (double) r4
            double r1 = java.lang.Math.ceil(r1)
            int r13 = (int) r1
            r12.g = r13
            double r1 = (double) r5
            double r1 = java.lang.Math.ceil(r1)
            int r13 = (int) r1
            r12.h = r13
            if (r0 == 0) goto La1
            r12.requestLayout()
        La1:
            return r12
    }

    public com.scwang.smartrefresh.header.StoreHouseHeader D(java.lang.String r2) {
            r1 = this;
            r0 = 25
            r1.E(r2, r0)
            return r1
    }

    public com.scwang.smartrefresh.header.StoreHouseHeader E(java.lang.String r2, int r3) {
            r1 = this;
            float r3 = (float) r3
            r0 = 1008981770(0x3c23d70a, float:0.01)
            float r3 = r3 * r0
            r0 = 14
            java.util.ArrayList r2 = com.scwang.smartrefresh.header.storehouse.b.c(r2, r3, r0)
            r1.C(r2)
            return r1
    }

    public com.scwang.smartrefresh.header.StoreHouseHeader F(int r10) {
            r9 = this;
            android.content.res.Resources r0 = r9.getResources()
            java.lang.String[] r10 = r0.getStringArray(r10)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r10.length
            r2 = 0
            r3 = 0
        L10:
            if (r3 >= r1) goto L31
            r4 = r10[r3]
            java.lang.String r5 = ","
            java.lang.String[] r4 = r4.split(r5)
            r5 = 4
            float[] r6 = new float[r5]
            r7 = 0
        L1e:
            if (r7 >= r5) goto L2b
            r8 = r4[r7]
            float r8 = java.lang.Float.parseFloat(r8)
            r6[r7] = r8
            int r7 = r7 + 1
            goto L1e
        L2b:
            r0.add(r6)
            int r3 = r3 + 1
            goto L10
        L31:
            r9.C(r0)
            return r9
    }

    public com.scwang.smartrefresh.header.StoreHouseHeader J(int r1) {
            r0 = this;
            r0.d = r1
            return r0
    }

    public com.scwang.smartrefresh.header.StoreHouseHeader K(int r3) {
            r2 = this;
            r2.b = r3
            r0 = 0
        L3:
            java.util.ArrayList<com.scwang.smartrefresh.header.storehouse.a> r1 = r2.a
            int r1 = r1.size()
            if (r0 >= r1) goto L19
            java.util.ArrayList<com.scwang.smartrefresh.header.storehouse.a> r1 = r2.a
            java.lang.Object r1 = r1.get(r0)
            com.scwang.smartrefresh.header.storehouse.a r1 = (com.scwang.smartrefresh.header.storehouse.a) r1
            r1.f(r3)
            int r0 = r0 + 1
            goto L3
        L19:
            return r2
    }

    public com.scwang.smartrefresh.header.StoreHouseHeader L(int r1) {
            r0 = this;
            r0.k = r1
            r0.l = r1
            return r0
    }

    public com.scwang.smartrefresh.header.StoreHouseHeader M(float r1) {
            r0 = this;
            r0.c = r1
            return r0
    }

    public com.scwang.smartrefresh.header.StoreHouseHeader N(@androidx.annotation.ColorInt int r3) {
            r2 = this;
            r2.p = r3
            r0 = 0
        L3:
            java.util.ArrayList<com.scwang.smartrefresh.header.storehouse.a> r1 = r2.a
            int r1 = r1.size()
            if (r0 >= r1) goto L19
            java.util.ArrayList<com.scwang.smartrefresh.header.storehouse.a> r1 = r2.a
            java.lang.Object r1 = r1.get(r0)
            com.scwang.smartrefresh.header.storehouse.a r1 = (com.scwang.smartrefresh.header.storehouse.a) r1
            r1.e(r3)
            int r0 = r0 + 1
            goto L3
        L19:
            return r2
    }

    public void f(l2.g r1, int r2, int r3) {
            r0 = this;
            int r2 = r0.q
            if (r2 == 0) goto L7
            r1.f(r2)
        L7:
            r0.s = r1
            return
    }

    public void g(float r1, int r2, int r3, int r4) {
            r0 = this;
            r2 = 1061997773(0x3f4ccccd, float:0.8)
            float r1 = r1 * r2
            r0.setProgress(r1)
            r0.invalidate()
            return
    }

    public int getLoadingAniDuration() {
            r1 = this;
            int r0 = r1.k
            return r0
    }

    public float getScale() {
            r1 = this;
            float r0 = r1.c
            return r0
    }

    public com.scwang.smartrefresh.layout.constant.SpinnerStyle getSpinnerStyle() {
            r1 = this;
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r0 = com.scwang.smartrefresh.layout.constant.SpinnerStyle.Translate
            return r0
    }

    @androidx.annotation.NonNull
    public android.view.View getView() {
            r0 = this;
            return r0
    }

    public void i(l2.h r1, int r2, int r3) {
            r0 = this;
            r0.A()
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

    @Override // android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            r0 = 0
            r1.s = r0
            return
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas r14) {
            r13 = this;
            super.onDraw(r14)
            float r0 = r13.f
            int r1 = r14.save()
            java.util.ArrayList<com.scwang.smartrefresh.header.storehouse.a> r2 = r13.a
            int r2 = r2.size()
            boolean r3 = r13.isInEditMode()
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r3 == 0) goto L19
            r0 = 1065353216(0x3f800000, float:1.0)
        L19:
            r3 = 0
        L1a:
            if (r3 >= r2) goto Lb8
            r14.save()
            java.util.ArrayList<com.scwang.smartrefresh.header.storehouse.a> r5 = r13.a
            java.lang.Object r5 = r5.get(r3)
            com.scwang.smartrefresh.header.storehouse.a r5 = (com.scwang.smartrefresh.header.storehouse.a) r5
            int r6 = r13.i
            float r6 = (float) r6
            android.graphics.PointF r7 = r5.a
            float r8 = r7.x
            float r6 = r6 + r8
            int r8 = r13.j
            float r8 = (float) r8
            float r7 = r7.y
            float r8 = r8 + r7
            boolean r7 = r13.n
            if (r7 == 0) goto L46
            long r9 = r13.getDrawingTime()
            android.view.animation.Transformation r7 = r13.m
            r5.getTransformation(r9, r7)
            r14.translate(r6, r8)
            goto Lae
        L46:
            r7 = 0
            int r9 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r9 != 0) goto L51
            int r6 = r13.e
            r5.b(r6)
            goto Lb4
        L51:
            float r9 = (float) r3
            r10 = 1050253722(0x3e99999a, float:0.3)
            float r9 = r9 * r10
            float r11 = (float) r2
            float r9 = r9 / r11
            float r10 = r10 - r9
            r11 = 1053609165(0x3ecccccd, float:0.4)
            int r12 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r12 == 0) goto La8
            float r10 = r4 - r10
            int r10 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r10 < 0) goto L68
            goto La8
        L68:
            int r10 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r10 > 0) goto L6d
            goto L77
        L6d:
            float r7 = r0 - r9
            r9 = 1060320051(0x3f333333, float:0.7)
            float r7 = r7 / r9
            float r7 = java.lang.Math.min(r4, r7)
        L77:
            float r9 = r5.b
            float r10 = r4 - r7
            float r9 = r9 * r10
            float r6 = r6 + r9
            int r9 = r13.d
            int r9 = -r9
            float r9 = (float) r9
            float r9 = r9 * r10
            float r8 = r8 + r9
            android.graphics.Matrix r9 = r13.r
            r9.reset()
            android.graphics.Matrix r9 = r13.r
            r10 = 1135869952(0x43b40000, float:360.0)
            float r10 = r10 * r7
            r9.postRotate(r10)
            android.graphics.Matrix r9 = r13.r
            r9.postScale(r7, r7)
            android.graphics.Matrix r9 = r13.r
            r9.postTranslate(r6, r8)
            float r7 = r7 * r11
            r5.c(r7)
            android.graphics.Matrix r6 = r13.r
            r14.concat(r6)
            goto Lae
        La8:
            r14.translate(r6, r8)
            r5.c(r11)
        Lae:
            r5.a(r14)
            r14.restore()
        Lb4:
            int r3 = r3 + 1
            goto L1a
        Lb8:
            boolean r0 = r13.n
            if (r0 == 0) goto Lbf
            r13.invalidate()
        Lbf:
            r14.restoreToCount(r1)
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r2, int r3) {
            r1 = this;
            int r0 = r1.getSuggestedMinimumWidth()
            int r2 = android.view.View.resolveSize(r0, r2)
            int r0 = r1.getSuggestedMinimumHeight()
            int r3 = android.view.View.resolveSize(r0, r3)
            r1.setMeasuredDimension(r2, r3)
            int r2 = r1.getMeasuredWidth()
            int r3 = r1.g
            int r2 = r2 - r3
            int r2 = r2 / 2
            r1.i = r2
            int r2 = r1.getMeasuredHeight()
            int r3 = r1.h
            int r2 = r2 - r3
            int r2 = r2 / 2
            r1.j = r2
            int r2 = r1.getMeasuredHeight()
            int r2 = r2 / 2
            r1.d = r2
            return
    }

    public void q(l2.h r1, com.scwang.smartrefresh.layout.constant.RefreshState r2, com.scwang.smartrefresh.layout.constant.RefreshState r3) {
            r0 = this;
            com.scwang.smartrefresh.layout.constant.RefreshState r2 = com.scwang.smartrefresh.layout.constant.RefreshState.ReleaseToRefresh
            if (r3 != r2) goto L8
            r0.H(r1)
            return
        L8:
            com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.None
            if (r3 != r1) goto Lf
            r0.I()
        Lf:
            return
    }

    @java.lang.Deprecated
    public void setPrimaryColors(@androidx.annotation.ColorInt int... r3) {
            r2 = this;
            int r0 = r3.length
            if (r0 <= 0) goto L18
            r0 = 0
            r0 = r3[r0]
            r2.q = r0
            l2.g r1 = r2.s
            if (r1 == 0) goto Lf
            r1.f(r0)
        Lf:
            int r0 = r3.length
            r1 = 1
            if (r0 <= r1) goto L18
            r3 = r3[r1]
            r2.N(r3)
        L18:
            return
    }

    public void t(l2.h r1, int r2, int r3) {
            r0 = this;
            return
    }

    public int w(l2.h r3, boolean r4) {
            r2 = this;
            r2.G()
            r3 = 0
            r4 = 0
        L5:
            java.util.ArrayList<com.scwang.smartrefresh.header.storehouse.a> r0 = r2.a
            int r0 = r0.size()
            if (r4 >= r0) goto L1d
            java.util.ArrayList<com.scwang.smartrefresh.header.storehouse.a> r0 = r2.a
            java.lang.Object r0 = r0.get(r4)
            com.scwang.smartrefresh.header.storehouse.a r0 = (com.scwang.smartrefresh.header.storehouse.a) r0
            int r1 = r2.e
            r0.b(r1)
            int r4 = r4 + 1
            goto L5
        L1d:
            return r3
    }

    public void x(float r1, int r2, int r3, int r4) {
            r0 = this;
            r2 = 1061997773(0x3f4ccccd, float:0.8)
            float r1 = r1 * r2
            r0.setProgress(r1)
            r0.invalidate()
            return
    }
}
