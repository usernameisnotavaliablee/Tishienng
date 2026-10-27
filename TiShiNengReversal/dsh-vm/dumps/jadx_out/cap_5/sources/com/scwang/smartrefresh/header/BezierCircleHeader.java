package com.scwang.smartrefresh.header;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class BezierCircleHeader extends android.view.View implements l2.e {
    private static final int r = 800;
    private static final int s = 270;
    private android.graphics.Path a;
    private android.graphics.Paint b;
    private android.graphics.Paint c;
    private android.graphics.Paint d;
    private float e;
    private float f;
    private float g;
    private float h;
    private com.scwang.smartrefresh.layout.constant.RefreshState i;
    private float j;
    private boolean k;
    private boolean l;
    private boolean m;
    private float n;
    private int o;
    private int p;
    private boolean q;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.animation.ValueAnimator.AnimatorUpdateListener {
        float a;
        float b;
        float c;
        int d;
        final /* synthetic */ float e;
        final /* synthetic */ com.scwang.smartrefresh.header.BezierCircleHeader f;

        a(com.scwang.smartrefresh.header.BezierCircleHeader r1, float r2) {
                r0 = this;
                r0.f = r1
                r0.e = r2
                r0.<init>()
                r1 = 0
                r0.a = r1
                r0.c = r1
                r1 = 0
                r0.d = r1
                return
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(android.animation.ValueAnimator r8) {
                r7 = this;
                java.lang.Object r0 = r8.getAnimatedValue()
                java.lang.Float r0 = (java.lang.Float) r0
                float r0 = r0.floatValue()
                int r1 = r7.d
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L24
                int r1 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r1 > 0) goto L24
                r7.d = r3
                com.scwang.smartrefresh.header.BezierCircleHeader r1 = r7.f
                float r1 = com.scwang.smartrefresh.header.BezierCircleHeader.m(r1)
                float r1 = r0 - r1
                float r1 = java.lang.Math.abs(r1)
                r7.a = r1
            L24:
                int r1 = r7.d
                r4 = 2
                if (r1 != r3) goto L72
                float r1 = -r0
                float r5 = r7.e
                float r1 = r1 / r5
                r7.c = r1
                com.scwang.smartrefresh.header.BezierCircleHeader r5 = r7.f
                float r5 = com.scwang.smartrefresh.header.BezierCircleHeader.z(r5)
                int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r1 < 0) goto L59
                com.scwang.smartrefresh.header.BezierCircleHeader r1 = r7.f
                float r2 = r7.c
                com.scwang.smartrefresh.header.BezierCircleHeader.B(r1, r2)
                com.scwang.smartrefresh.header.BezierCircleHeader r1 = r7.f
                float r2 = com.scwang.smartrefresh.header.BezierCircleHeader.E(r1)
                float r2 = r2 + r0
                com.scwang.smartrefresh.header.BezierCircleHeader.D(r1, r2)
                com.scwang.smartrefresh.header.BezierCircleHeader r1 = r7.f
                float r1 = com.scwang.smartrefresh.header.BezierCircleHeader.m(r1)
                float r1 = r0 - r1
                float r1 = java.lang.Math.abs(r1)
                r7.a = r1
                goto L72
            L59:
                r7.d = r4
                com.scwang.smartrefresh.header.BezierCircleHeader r1 = r7.f
                com.scwang.smartrefresh.header.BezierCircleHeader.B(r1, r2)
                com.scwang.smartrefresh.header.BezierCircleHeader r1 = r7.f
                com.scwang.smartrefresh.header.BezierCircleHeader.F(r1, r3)
                com.scwang.smartrefresh.header.BezierCircleHeader r1 = r7.f
                com.scwang.smartrefresh.header.BezierCircleHeader.H(r1, r3)
                com.scwang.smartrefresh.header.BezierCircleHeader r1 = r7.f
                float r1 = com.scwang.smartrefresh.header.BezierCircleHeader.C(r1)
                r7.b = r1
            L72:
                int r1 = r7.d
                if (r1 != r4) goto Lc0
                com.scwang.smartrefresh.header.BezierCircleHeader r1 = r7.f
                float r1 = com.scwang.smartrefresh.header.BezierCircleHeader.C(r1)
                com.scwang.smartrefresh.header.BezierCircleHeader r2 = r7.f
                float r2 = com.scwang.smartrefresh.header.BezierCircleHeader.E(r2)
                r4 = 1073741824(0x40000000, float:2.0)
                float r2 = r2 / r4
                int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r1 <= 0) goto Lc0
                com.scwang.smartrefresh.header.BezierCircleHeader r1 = r7.f
                float r2 = com.scwang.smartrefresh.header.BezierCircleHeader.E(r1)
                float r2 = r2 / r4
                com.scwang.smartrefresh.header.BezierCircleHeader r5 = r7.f
                float r5 = com.scwang.smartrefresh.header.BezierCircleHeader.C(r5)
                float r6 = r7.a
                float r5 = r5 - r6
                float r2 = java.lang.Math.max(r2, r5)
                com.scwang.smartrefresh.header.BezierCircleHeader.D(r1, r2)
                float r8 = r8.getAnimatedFraction()
                com.scwang.smartrefresh.header.BezierCircleHeader r1 = r7.f
                float r1 = com.scwang.smartrefresh.header.BezierCircleHeader.E(r1)
                float r1 = r1 / r4
                float r2 = r7.b
                float r1 = r1 - r2
                float r8 = r8 * r1
                float r8 = r8 + r2
                com.scwang.smartrefresh.header.BezierCircleHeader r1 = r7.f
                float r1 = com.scwang.smartrefresh.header.BezierCircleHeader.C(r1)
                int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
                if (r1 <= 0) goto Lc0
                com.scwang.smartrefresh.header.BezierCircleHeader r1 = r7.f
                com.scwang.smartrefresh.header.BezierCircleHeader.D(r1, r8)
            Lc0:
                com.scwang.smartrefresh.header.BezierCircleHeader r8 = r7.f
                boolean r8 = com.scwang.smartrefresh.header.BezierCircleHeader.G(r8)
                if (r8 == 0) goto Lee
                com.scwang.smartrefresh.header.BezierCircleHeader r8 = r7.f
                float r8 = com.scwang.smartrefresh.header.BezierCircleHeader.m(r8)
                int r8 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
                if (r8 >= 0) goto Lee
                com.scwang.smartrefresh.header.BezierCircleHeader r8 = r7.f
                com.scwang.smartrefresh.header.BezierCircleHeader.I(r8, r3)
                com.scwang.smartrefresh.header.BezierCircleHeader r8 = r7.f
                r1 = 0
                com.scwang.smartrefresh.header.BezierCircleHeader.H(r8, r1)
                com.scwang.smartrefresh.header.BezierCircleHeader r8 = r7.f
                com.scwang.smartrefresh.header.BezierCircleHeader.J(r8, r3)
                com.scwang.smartrefresh.header.BezierCircleHeader r8 = r7.f
                r1 = 90
                com.scwang.smartrefresh.header.BezierCircleHeader.K(r8, r1)
                com.scwang.smartrefresh.header.BezierCircleHeader r8 = r7.f
                com.scwang.smartrefresh.header.BezierCircleHeader.L(r8, r1)
            Lee:
                com.scwang.smartrefresh.header.BezierCircleHeader r8 = r7.f
                com.scwang.smartrefresh.header.BezierCircleHeader.n(r8, r0)
                com.scwang.smartrefresh.header.BezierCircleHeader r8 = r7.f
                r8.invalidate()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements android.animation.ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ com.scwang.smartrefresh.header.BezierCircleHeader a;

        b(com.scwang.smartrefresh.header.BezierCircleHeader r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(android.animation.ValueAnimator r2) {
                r1 = this;
                com.scwang.smartrefresh.header.BezierCircleHeader r0 = r1.a
                java.lang.Object r2 = r2.getAnimatedValue()
                java.lang.Float r2 = (java.lang.Float) r2
                float r2 = r2.floatValue()
                com.scwang.smartrefresh.header.BezierCircleHeader.A(r0, r2)
                com.scwang.smartrefresh.header.BezierCircleHeader r2 = r1.a
                r2.invalidate()
                return
        }
    }

    public BezierCircleHeader(android.content.Context r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.<init>(r3, r1, r0)
            r0 = 90
            r2.o = r0
            r2.p = r0
            r0 = 1
            r2.q = r0
            r2.S(r3, r1)
            return
    }

    public BezierCircleHeader(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            r0 = 90
            r1.o = r0
            r1.p = r0
            r0 = 1
            r1.q = r0
            r1.S(r2, r3)
            return
    }

    public BezierCircleHeader(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r3 = 90
            r0.o = r3
            r0.p = r3
            r3 = 1
            r0.q = r3
            r0.S(r1, r2)
            return
    }

    @androidx.annotation.RequiresApi(21)
    public BezierCircleHeader(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            r3 = 90
            r0.o = r3
            r0.p = r3
            r3 = 1
            r0.q = r3
            r0.S(r1, r2)
            return
    }

    static /* synthetic */ float A(com.scwang.smartrefresh.header.BezierCircleHeader r0, float r1) {
            r0.h = r1
            return r1
    }

    static /* synthetic */ float B(com.scwang.smartrefresh.header.BezierCircleHeader r0, float r1) {
            r0.g = r1
            return r1
    }

    static /* synthetic */ float C(com.scwang.smartrefresh.header.BezierCircleHeader r0) {
            float r0 = r0.j
            return r0
    }

    static /* synthetic */ float D(com.scwang.smartrefresh.header.BezierCircleHeader r0, float r1) {
            r0.j = r1
            return r1
    }

    static /* synthetic */ float E(com.scwang.smartrefresh.header.BezierCircleHeader r0) {
            float r0 = r0.f
            return r0
    }

    static /* synthetic */ boolean F(com.scwang.smartrefresh.header.BezierCircleHeader r0, boolean r1) {
            r0.k = r1
            return r1
    }

    static /* synthetic */ boolean G(com.scwang.smartrefresh.header.BezierCircleHeader r0) {
            boolean r0 = r0.l
            return r0
    }

    static /* synthetic */ boolean H(com.scwang.smartrefresh.header.BezierCircleHeader r0, boolean r1) {
            r0.l = r1
            return r1
    }

    static /* synthetic */ boolean I(com.scwang.smartrefresh.header.BezierCircleHeader r0, boolean r1) {
            r0.m = r1
            return r1
    }

    static /* synthetic */ boolean J(com.scwang.smartrefresh.header.BezierCircleHeader r0, boolean r1) {
            r0.q = r1
            return r1
    }

    static /* synthetic */ int K(com.scwang.smartrefresh.header.BezierCircleHeader r0, int r1) {
            r0.p = r1
            return r1
    }

    static /* synthetic */ int L(com.scwang.smartrefresh.header.BezierCircleHeader r0, int r1) {
            r0.o = r1
            return r1
    }

    private void M(android.graphics.Canvas r5, int r6) {
            r4 = this;
            boolean r0 = r4.k
            if (r0 == 0) goto L19
            int r0 = r6 / 2
            float r0 = (float) r0
            float r1 = r4.j
            float r2 = r4.n
            android.graphics.Paint r3 = r4.c
            r5.drawCircle(r0, r1, r2, r3)
            float r0 = r4.f
            float r1 = r4.e
            float r1 = r1 + r0
            float r1 = r1 / r0
            r4.N(r5, r6, r1)
        L19:
            return
    }

    private void N(android.graphics.Canvas r10, int r11, float r12) {
            r9 = this;
            boolean r0 = r9.l
            if (r0 == 0) goto L5c
            float r0 = r9.f
            float r1 = r9.e
            float r0 = r0 + r1
            float r1 = r9.j
            float r2 = r9.n
            float r3 = r2 * r12
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            float r1 = r1 + r3
            int r3 = r11 / 2
            float r3 = (float) r3
            float r2 = r2 * r2
            float r4 = r12 * r12
            r5 = 1082130432(0x40800000, float:4.0)
            float r4 = r4 / r5
            r6 = 1065353216(0x3f800000, float:1.0)
            float r4 = r6 - r4
            float r2 = r2 * r4
            double r7 = (double) r2
            double r7 = java.lang.Math.sqrt(r7)
            float r2 = (float) r7
            float r2 = r2 + r3
            float r4 = r9.n
            r7 = 1077936128(0x40400000, float:3.0)
            float r7 = r7 * r4
            float r7 = r7 / r5
            float r6 = r6 - r12
            float r7 = r7 * r6
            float r3 = r3 + r7
            float r4 = r4 + r3
            android.graphics.Path r12 = r9.a
            r12.reset()
            android.graphics.Path r12 = r9.a
            r12.moveTo(r2, r1)
            android.graphics.Path r12 = r9.a
            r12.quadTo(r3, r0, r4, r0)
            android.graphics.Path r12 = r9.a
            float r11 = (float) r11
            float r4 = r11 - r4
            r12.lineTo(r4, r0)
            android.graphics.Path r12 = r9.a
            float r3 = r11 - r3
            float r11 = r11 - r2
            r12.quadTo(r3, r0, r11, r1)
            android.graphics.Path r11 = r9.a
            android.graphics.Paint r12 = r9.c
            r10.drawPath(r11, r12)
        L5c:
            return
    }

    private void O(android.graphics.Canvas r17, int r18) {
            r16 = this;
            r0 = r16
            r1 = r17
            r7 = r18
            float r2 = r0.h
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L107
            android.graphics.Paint r2 = r0.d
            int r8 = r2.getColor()
            float r2 = r0.h
            double r2 = (double) r2
            r9 = 4599075939470750515(0x3fd3333333333333, double:0.3)
            r11 = 1050253722(0x3e99999a, float:0.3)
            r12 = 1065353216(0x3f800000, float:1.0)
            r13 = 1073741824(0x40000000, float:2.0)
            int r4 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r4 >= 0) goto L7c
            int r2 = r7 / 2
            float r3 = (float) r2
            float r4 = r0.j
            float r5 = r0.n
            android.graphics.Paint r6 = r0.c
            r1.drawCircle(r3, r4, r5, r6)
            float r3 = r0.n
            android.graphics.Paint r4 = r0.d
            float r4 = r4.getStrokeWidth()
            float r4 = r4 * r13
            float r5 = r0.h
            float r6 = r5 / r11
            float r6 = r6 + r12
            float r4 = r4 * r6
            float r3 = r3 + r4
            int r3 = (int) r3
            float r5 = r5 / r11
            float r4 = r12 - r5
            r5 = 1132396544(0x437f0000, float:255.0)
            float r4 = r4 * r5
            int r4 = (int) r4
            int r5 = android.graphics.Color.red(r8)
            int r6 = android.graphics.Color.green(r8)
            int r14 = android.graphics.Color.blue(r8)
            int r4 = android.graphics.Color.argb(r4, r5, r6, r14)
            android.graphics.Paint r5 = r0.d
            r5.setColor(r4)
            r4 = r2
            android.graphics.RectF r2 = new android.graphics.RectF
            int r5 = r4 - r3
            float r5 = (float) r5
            float r6 = r0.j
            float r14 = (float) r3
            float r15 = r6 - r14
            int r3 = r3 + r4
            float r3 = (float) r3
            float r6 = r6 + r14
            r2.<init>(r5, r15, r3, r6)
            r5 = 0
            android.graphics.Paint r6 = r0.d
            r3 = 0
            r4 = 1135869952(0x43b40000, float:360.0)
            r1.drawArc(r2, r3, r4, r5, r6)
        L7c:
            android.graphics.Paint r2 = r0.d
            r2.setColor(r8)
            float r2 = r0.h
            double r3 = (double) r2
            r5 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            int r8 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r8 < 0) goto Lc5
            double r3 = (double) r2
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 >= 0) goto Lc5
            float r2 = r2 - r11
            r3 = 1053609165(0x3ecccccd, float:0.4)
            float r2 = r2 / r3
            float r3 = r0.f
            float r4 = r3 / r13
            float r8 = r3 / r13
            float r3 = r3 - r8
            float r3 = r3 * r2
            float r4 = r4 + r3
            int r3 = (int) r4
            float r3 = (float) r3
            r0.j = r3
            int r4 = r7 / 2
            float r4 = (float) r4
            float r8 = r0.n
            android.graphics.Paint r9 = r0.c
            r1.drawCircle(r4, r3, r8, r9)
            float r3 = r0.j
            float r4 = r0.f
            float r8 = r0.n
            float r8 = r8 * r13
            float r4 = r4 - r8
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 < 0) goto Lc2
            r3 = 1
            r0.l = r3
            r0.N(r1, r7, r2)
        Lc2:
            r2 = 0
            r0.l = r2
        Lc5:
            float r2 = r0.h
            double r3 = (double) r2
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 < 0) goto L107
            int r3 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r3 > 0) goto L107
            r3 = 1060320051(0x3f333333, float:0.7)
            float r2 = r2 - r3
            float r2 = r2 / r11
            int r3 = r7 / 2
            float r3 = (float) r3
            float r4 = r0.n
            float r5 = r3 - r4
            float r4 = r4 * r13
            float r4 = r4 * r2
            float r5 = r5 - r4
            int r4 = (int) r5
            android.graphics.Path r5 = r0.a
            r5.reset()
            android.graphics.Path r5 = r0.a
            float r6 = (float) r4
            float r8 = r0.f
            r5.moveTo(r6, r8)
            android.graphics.Path r5 = r0.a
            float r6 = r0.f
            float r8 = r0.n
            float r12 = r12 - r2
            float r8 = r8 * r12
            float r2 = r6 - r8
            int r4 = r7 - r4
            float r4 = (float) r4
            r5.quadTo(r3, r2, r4, r6)
            android.graphics.Path r2 = r0.a
            android.graphics.Paint r3 = r0.c
            r1.drawPath(r2, r3)
        L107:
            return
    }

    private void P(android.graphics.Canvas r13, int r14) {
            r12 = this;
            boolean r0 = r12.m
            if (r0 == 0) goto L60
            float r0 = r12.n
            android.graphics.Paint r1 = r12.d
            float r1 = r1.getStrokeWidth()
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 * r2
            float r0 = r0 + r1
            int r1 = r12.p
            boolean r2 = r12.q
            r3 = 3
            r4 = 10
            if (r2 == 0) goto L1c
            r5 = 3
            goto L1e
        L1c:
            r5 = 10
        L1e:
            int r1 = r1 + r5
            r12.p = r1
            int r5 = r12.o
            if (r2 == 0) goto L27
            r3 = 10
        L27:
            int r5 = r5 + r3
            int r1 = r1 % 360
            r12.p = r1
            int r5 = r5 % 360
            r12.o = r5
            int r5 = r5 - r1
            if (r5 >= 0) goto L35
            int r5 = r5 + 360
        L35:
            android.graphics.RectF r7 = new android.graphics.RectF
            int r14 = r14 / 2
            float r14 = (float) r14
            float r1 = r14 - r0
            float r2 = r12.j
            float r3 = r2 - r0
            float r14 = r14 + r0
            float r2 = r2 + r0
            r7.<init>(r1, r3, r14, r2)
            int r14 = r12.p
            float r8 = (float) r14
            float r9 = (float) r5
            r10 = 0
            android.graphics.Paint r11 = r12.d
            r6 = r13
            r6.drawArc(r7, r8, r9, r10, r11)
            r13 = 270(0x10e, float:3.78E-43)
            if (r5 < r13) goto L58
            r13 = 0
            r12.q = r13
            goto L5d
        L58:
            if (r5 > r4) goto L5d
            r13 = 1
            r12.q = r13
        L5d:
            r12.invalidate()
        L60:
            return
    }

    private void Q(android.graphics.Canvas r9, int r10) {
            r8 = this;
            float r0 = r8.g
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto L53
            int r1 = r10 / 2
            float r1 = (float) r1
            float r2 = r8.n
            r3 = 1082130432(0x40800000, float:4.0)
            float r3 = r3 * r2
            float r3 = r1 - r3
            r4 = 1077936128(0x40400000, float:3.0)
            float r4 = r4 * r0
            float r4 = r4 * r2
            float r3 = r3 + r4
            double r4 = (double) r0
            r6 = 4606281698874543309(0x3feccccccccccccd, double:0.9)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L4c
            android.graphics.Path r0 = r8.a
            r0.reset()
            android.graphics.Path r0 = r8.a
            float r2 = r8.j
            r0.moveTo(r3, r2)
            android.graphics.Path r0 = r8.a
            float r2 = r8.j
            float r4 = r8.n
            float r5 = r8.g
            float r4 = r4 * r5
            r5 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 * r5
            float r4 = r2 - r4
            float r10 = (float) r10
            float r10 = r10 - r3
            r0.quadTo(r1, r4, r10, r2)
            android.graphics.Path r10 = r8.a
            android.graphics.Paint r0 = r8.c
            r9.drawPath(r10, r0)
            return
        L4c:
            float r10 = r8.j
            android.graphics.Paint r0 = r8.c
            r9.drawCircle(r1, r10, r2, r0)
        L53:
            return
    }

    private void R(android.graphics.Canvas r8, int r9, int r10) {
            r7 = this;
            float r0 = r7.f
            float r10 = (float) r10
            float r5 = java.lang.Math.min(r0, r10)
            float r10 = r7.e
            r0 = 0
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 == 0) goto L3a
            android.graphics.Path r10 = r7.a
            r10.reset()
            android.graphics.Path r10 = r7.a
            float r1 = (float) r9
            r10.lineTo(r1, r0)
            android.graphics.Path r10 = r7.a
            r10.lineTo(r1, r5)
            android.graphics.Path r10 = r7.a
            int r9 = r9 / 2
            float r9 = (float) r9
            float r1 = r7.e
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 * r2
            float r1 = r1 + r5
            r10.quadTo(r9, r1, r0, r5)
            android.graphics.Path r9 = r7.a
            r9.close()
            android.graphics.Path r9 = r7.a
            android.graphics.Paint r10 = r7.b
            r8.drawPath(r9, r10)
            return
        L3a:
            float r4 = (float) r9
            android.graphics.Paint r6 = r7.b
            r2 = 0
            r3 = 0
            r1 = r8
            r1.drawRect(r2, r3, r4, r5, r6)
            return
    }

    private void S(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r2 = 1120403456(0x42c80000, float:100.0)
            int r2 = com.scwang.smartrefresh.layout.util.c.b(r2)
            r1.setMinimumHeight(r2)
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r1.b = r2
            r3 = -15614977(0xffffffffff11bbff, float:-1.937142E38)
            r2.setColor(r3)
            android.graphics.Paint r2 = r1.b
            r3 = 1
            r2.setAntiAlias(r3)
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r1.c = r2
            r0 = -1
            r2.setColor(r0)
            android.graphics.Paint r2 = r1.c
            r2.setAntiAlias(r3)
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r1.d = r2
            r2.setAntiAlias(r3)
            android.graphics.Paint r2 = r1.d
            r2.setColor(r0)
            android.graphics.Paint r2 = r1.d
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.STROKE
            r2.setStyle(r3)
            android.graphics.Paint r2 = r1.d
            r3 = 1073741824(0x40000000, float:2.0)
            int r3 = com.scwang.smartrefresh.layout.util.c.b(r3)
            float r3 = (float) r3
            r2.setStrokeWidth(r3)
            android.graphics.Path r2 = new android.graphics.Path
            r2.<init>()
            r1.a = r2
            return
    }

    static /* synthetic */ float m(com.scwang.smartrefresh.header.BezierCircleHeader r0) {
            float r0 = r0.e
            return r0
    }

    static /* synthetic */ float n(com.scwang.smartrefresh.header.BezierCircleHeader r0, float r1) {
            r0.e = r1
            return r1
    }

    static /* synthetic */ float z(com.scwang.smartrefresh.header.BezierCircleHeader r0) {
            float r0 = r0.g
            return r0
    }

    public void f(l2.g r1, int r2, int r3) {
            r0 = this;
            return
    }

    public void g(float r3, int r4, int r5, int r6) {
            r2 = this;
            com.scwang.smartrefresh.layout.constant.RefreshState r0 = r2.i
            com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.Refreshing
            if (r0 == r1) goto Ld
            com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.RefreshReleased
            if (r0 == r1) goto Ld
            r2.x(r3, r4, r5, r6)
        Ld:
            return
    }

    public com.scwang.smartrefresh.layout.constant.SpinnerStyle getSpinnerStyle() {
            r1 = this;
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r0 = com.scwang.smartrefresh.layout.constant.SpinnerStyle.Scale
            return r0
    }

    @androidx.annotation.NonNull
    public android.view.View getView() {
            r0 = this;
            return r0
    }

    public void i(l2.h r5, int r6, int r7) {
            r4 = this;
            float r5 = (float) r6
            r4.f = r5
            r5 = 6
            int r6 = r6 / r5
            float r6 = (float) r6
            r4.n = r6
            android.view.animation.DecelerateInterpolator r6 = new android.view.animation.DecelerateInterpolator
            r6.<init>()
            float r7 = r4.e
            r0 = 1061997773(0x3f4ccccd, float:0.8)
            float r7 = r7 * r0
            float r0 = r4.f
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            float r7 = java.lang.Math.min(r7, r0)
            float r0 = r4.e
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 * r7
            float r1 = -r1
            r2 = 1053609165(0x3ecccccd, float:0.4)
            float r2 = r2 * r7
            float r2 = -r2
            float[] r5 = new float[r5]
            r3 = 0
            r5[r3] = r0
            r0 = 1
            r3 = 0
            r5[r0] = r3
            r0 = 2
            r5[r0] = r1
            r0 = 3
            r5[r0] = r3
            r0 = 4
            r5[r0] = r2
            r0 = 5
            r5[r0] = r3
            android.animation.ValueAnimator r5 = android.animation.ValueAnimator.ofFloat(r5)
            com.scwang.smartrefresh.header.BezierCircleHeader$a r0 = new com.scwang.smartrefresh.header.BezierCircleHeader$a
            r0.<init>(r4, r7)
            r5.addUpdateListener(r0)
            r5.setInterpolator(r6)
            r6 = 1000(0x3e8, double:4.94E-321)
            r5.setDuration(r6)
            r5.start()
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
    protected void onDraw(android.graphics.Canvas r3) {
            r2 = this;
            super.onDraw(r3)
            boolean r0 = r2.isInEditMode()
            if (r0 == 0) goto L24
            r0 = 1
            r2.k = r0
            r2.m = r0
            int r0 = r2.getHeight()
            float r0 = (float) r0
            r2.f = r0
            r1 = 270(0x10e, float:3.78E-43)
            r2.o = r1
            r1 = 1073741824(0x40000000, float:2.0)
            float r1 = r0 / r1
            r2.j = r1
            r1 = 1086324736(0x40c00000, float:6.0)
            float r0 = r0 / r1
            r2.n = r0
        L24:
            int r0 = r2.getWidth()
            int r1 = r2.getHeight()
            r2.R(r3, r0, r1)
            r2.Q(r3, r0)
            r2.M(r3, r0)
            r2.P(r3, r0)
            r2.O(r3, r0)
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
            return
    }

    public void q(l2.h r1, com.scwang.smartrefresh.layout.constant.RefreshState r2, com.scwang.smartrefresh.layout.constant.RefreshState r3) {
            r0 = this;
            r0.i = r3
            return
    }

    @java.lang.Deprecated
    public void setPrimaryColors(@androidx.annotation.ColorInt int... r4) {
            r3 = this;
            int r0 = r4.length
            if (r0 <= 0) goto L1d
            android.graphics.Paint r0 = r3.b
            r1 = 0
            r1 = r4[r1]
            r0.setColor(r1)
            int r0 = r4.length
            r1 = 1
            if (r0 <= r1) goto L1d
            android.graphics.Paint r0 = r3.c
            r2 = r4[r1]
            r0.setColor(r2)
            android.graphics.Paint r0 = r3.d
            r4 = r4[r1]
            r0.setColor(r4)
        L1d:
            return
    }

    public void t(l2.h r1, int r2, int r3) {
            r0 = this;
            return
    }

    public int w(l2.h r3, boolean r4) {
            r2 = this;
            r3 = 0
            r2.m = r3
            r2.k = r3
            r3 = 2
            float[] r3 = new float[r3]
            r3 = {x002a: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r3 = android.animation.ValueAnimator.ofFloat(r3)
            com.scwang.smartrefresh.header.BezierCircleHeader$b r4 = new com.scwang.smartrefresh.header.BezierCircleHeader$b
            r4.<init>(r2)
            r3.addUpdateListener(r4)
            android.view.animation.AccelerateInterpolator r4 = new android.view.animation.AccelerateInterpolator
            r4.<init>()
            r3.setInterpolator(r4)
            r0 = 800(0x320, double:3.953E-321)
            r3.setDuration(r0)
            r3.start()
            r3 = 800(0x320, float:1.121E-42)
            return r3
    }

    public void x(float r1, int r2, int r3, int r4) {
            r0 = this;
            float r1 = (float) r3
            r0.f = r1
            int r2 = r2 - r3
            r1 = 0
            int r1 = java.lang.Math.max(r2, r1)
            float r1 = (float) r1
            r2 = 1061997773(0x3f4ccccd, float:0.8)
            float r1 = r1 * r2
            r0.e = r1
            return
    }
}
