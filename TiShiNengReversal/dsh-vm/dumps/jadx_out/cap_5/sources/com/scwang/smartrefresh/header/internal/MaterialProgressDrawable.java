package com.scwang.smartrefresh.header.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class MaterialProgressDrawable extends android.graphics.drawable.Drawable implements android.graphics.drawable.Animatable {
    private static final int A = 1332;
    private static final float B = 5.0f;
    private static final int C = 10;
    private static final int D = 5;
    private static final float E = 5.0f;
    private static final int F = 12;
    private static final int G = 6;
    private static final float H = 0.8f;
    private static final android.view.animation.Interpolator l = null;
    static final android.view.animation.Interpolator m = null;
    private static final float n = 1080.0f;
    public static final int o = 0;
    public static final int p = 1;
    private static final int q = 40;
    private static final float r = 8.75f;
    private static final float s = 2.5f;
    private static final int t = 56;
    private static final float u = 12.5f;
    private static final float v = 3.0f;
    private static final int[] w = null;
    private static final float x = 0.75f;
    private static final float y = 0.5f;
    private static final float z = 0.5f;
    private final java.util.ArrayList<android.view.animation.Animation> a;
    private final com.scwang.smartrefresh.header.internal.MaterialProgressDrawable.d b;
    private float c;
    private android.content.res.Resources d;
    private android.view.View e;
    private android.view.animation.Animation f;
    float g;
    private double h;
    private double i;
    boolean j;
    private final android.graphics.drawable.Drawable.Callback k;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ProgressDrawableSize {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends android.view.animation.Animation {
        final /* synthetic */ com.scwang.smartrefresh.header.internal.MaterialProgressDrawable.d a;
        final /* synthetic */ com.scwang.smartrefresh.header.internal.MaterialProgressDrawable b;

        a(com.scwang.smartrefresh.header.internal.MaterialProgressDrawable r1, com.scwang.smartrefresh.header.internal.MaterialProgressDrawable.d r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float r9, android.view.animation.Transformation r10) {
                r8 = this;
                com.scwang.smartrefresh.header.internal.MaterialProgressDrawable r10 = r8.b
                boolean r0 = r10.j
                if (r0 == 0) goto Lc
                com.scwang.smartrefresh.header.internal.MaterialProgressDrawable$d r0 = r8.a
                r10.a(r9, r0)
                return
            Lc:
                com.scwang.smartrefresh.header.internal.MaterialProgressDrawable$d r0 = r8.a
                float r10 = r10.c(r0)
                com.scwang.smartrefresh.header.internal.MaterialProgressDrawable$d r0 = r8.a
                float r0 = r0.l()
                com.scwang.smartrefresh.header.internal.MaterialProgressDrawable$d r1 = r8.a
                float r1 = r1.n()
                com.scwang.smartrefresh.header.internal.MaterialProgressDrawable$d r2 = r8.a
                float r2 = r2.m()
                com.scwang.smartrefresh.header.internal.MaterialProgressDrawable r3 = r8.b
                com.scwang.smartrefresh.header.internal.MaterialProgressDrawable$d r4 = r8.a
                r3.n(r9, r4)
                r3 = 1061997773(0x3f4ccccd, float:0.8)
                r4 = 1056964608(0x3f000000, float:0.5)
                int r5 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
                if (r5 > 0) goto L46
                float r5 = r9 / r4
                float r6 = r3 - r10
                android.view.animation.Interpolator r7 = com.scwang.smartrefresh.header.internal.MaterialProgressDrawable.m
                float r5 = r7.getInterpolation(r5)
                float r6 = r6 * r5
                float r1 = r1 + r6
                com.scwang.smartrefresh.header.internal.MaterialProgressDrawable$d r5 = r8.a
                r5.F(r1)
            L46:
                int r1 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
                if (r1 <= 0) goto L5c
                float r3 = r3 - r10
                float r10 = r9 - r4
                float r10 = r10 / r4
                android.view.animation.Interpolator r1 = com.scwang.smartrefresh.header.internal.MaterialProgressDrawable.m
                float r10 = r1.getInterpolation(r10)
                float r3 = r3 * r10
                float r0 = r0 + r3
                com.scwang.smartrefresh.header.internal.MaterialProgressDrawable$d r10 = r8.a
                r10.B(r0)
            L5c:
                r10 = 1048576000(0x3e800000, float:0.25)
                float r10 = r10 * r9
                float r2 = r2 + r10
                com.scwang.smartrefresh.header.internal.MaterialProgressDrawable$d r10 = r8.a
                r10.D(r2)
                r10 = 1129840640(0x43580000, float:216.0)
                float r9 = r9 * r10
                com.scwang.smartrefresh.header.internal.MaterialProgressDrawable r10 = r8.b
                float r0 = r10.g
                r1 = 1084227584(0x40a00000, float:5.0)
                float r0 = r0 / r1
                r1 = 1149698048(0x44870000, float:1080.0)
                float r0 = r0 * r1
                float r9 = r9 + r0
                r10.i(r9)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements android.view.animation.Animation.AnimationListener {
        final /* synthetic */ com.scwang.smartrefresh.header.internal.MaterialProgressDrawable.d a;
        final /* synthetic */ com.scwang.smartrefresh.header.internal.MaterialProgressDrawable b;

        b(com.scwang.smartrefresh.header.internal.MaterialProgressDrawable r1, com.scwang.smartrefresh.header.internal.MaterialProgressDrawable.d r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(android.view.animation.Animation r1) {
                r0 = this;
                return
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(android.view.animation.Animation r5) {
                r4 = this;
                com.scwang.smartrefresh.header.internal.MaterialProgressDrawable$d r0 = r4.a
                r0.H()
                com.scwang.smartrefresh.header.internal.MaterialProgressDrawable$d r0 = r4.a
                r0.p()
                com.scwang.smartrefresh.header.internal.MaterialProgressDrawable$d r0 = r4.a
                float r1 = r0.e()
                r0.F(r1)
                com.scwang.smartrefresh.header.internal.MaterialProgressDrawable r0 = r4.b
                boolean r1 = r0.j
                if (r1 == 0) goto L27
                r1 = 0
                r0.j = r1
                r2 = 1332(0x534, double:6.58E-321)
                r5.setDuration(r2)
                com.scwang.smartrefresh.header.internal.MaterialProgressDrawable$d r5 = r4.a
                r5.E(r1)
                return
            L27:
                float r5 = r0.g
                r1 = 1065353216(0x3f800000, float:1.0)
                float r5 = r5 + r1
                r1 = 1084227584(0x40a00000, float:5.0)
                float r5 = r5 % r1
                r0.g = r5
                return
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(android.view.animation.Animation r2) {
                r1 = this;
                com.scwang.smartrefresh.header.internal.MaterialProgressDrawable r2 = r1.b
                r0 = 0
                r2.g = r0
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements android.graphics.drawable.Drawable.Callback {
        final /* synthetic */ com.scwang.smartrefresh.header.internal.MaterialProgressDrawable a;

        c(com.scwang.smartrefresh.header.internal.MaterialProgressDrawable r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(android.graphics.drawable.Drawable r1) {
                r0 = this;
                com.scwang.smartrefresh.header.internal.MaterialProgressDrawable r1 = r0.a
                r1.invalidateSelf()
                return
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(android.graphics.drawable.Drawable r1, java.lang.Runnable r2, long r3) {
                r0 = this;
                com.scwang.smartrefresh.header.internal.MaterialProgressDrawable r1 = r0.a
                r1.scheduleSelf(r2, r3)
                return
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(android.graphics.drawable.Drawable r1, java.lang.Runnable r2) {
                r0 = this;
                com.scwang.smartrefresh.header.internal.MaterialProgressDrawable r1 = r0.a
                r1.unscheduleSelf(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class d {
        private final android.graphics.RectF a;
        private final android.graphics.Paint b;
        private final android.graphics.Paint c;
        private final android.graphics.drawable.Drawable.Callback d;
        private float e;
        private float f;
        private float g;
        private float h;
        private float i;
        private int[] j;
        private int k;
        private float l;
        private float m;
        private float n;
        private boolean o;
        private android.graphics.Path p;
        private float q;
        private double r;
        private int s;
        private int t;
        private int u;
        private final android.graphics.Paint v;
        private int w;
        private int x;

        d(android.graphics.drawable.Drawable.Callback r5) {
                r4 = this;
                r4.<init>()
                android.graphics.RectF r0 = new android.graphics.RectF
                r0.<init>()
                r4.a = r0
                android.graphics.Paint r0 = new android.graphics.Paint
                r0.<init>()
                r4.b = r0
                android.graphics.Paint r1 = new android.graphics.Paint
                r1.<init>()
                r4.c = r1
                r2 = 0
                r4.e = r2
                r4.f = r2
                r4.g = r2
                r2 = 1084227584(0x40a00000, float:5.0)
                r4.h = r2
                r2 = 1075838976(0x40200000, float:2.5)
                r4.i = r2
                android.graphics.Paint r2 = new android.graphics.Paint
                r3 = 1
                r2.<init>(r3)
                r4.v = r2
                r4.d = r5
                android.graphics.Paint$Cap r5 = android.graphics.Paint.Cap.SQUARE
                r0.setStrokeCap(r5)
                r0.setAntiAlias(r3)
                android.graphics.Paint$Style r5 = android.graphics.Paint.Style.STROKE
                r0.setStyle(r5)
                android.graphics.Paint$Style r5 = android.graphics.Paint.Style.FILL
                r1.setStyle(r5)
                r1.setAntiAlias(r3)
                return
        }

        private void b(android.graphics.Canvas r8, float r9, float r10, android.graphics.Rect r11) {
                r7 = this;
                boolean r0 = r7.o
                if (r0 == 0) goto L90
                android.graphics.Path r0 = r7.p
                if (r0 != 0) goto L15
                android.graphics.Path r0 = new android.graphics.Path
                r0.<init>()
                r7.p = r0
                android.graphics.Path$FillType r1 = android.graphics.Path.FillType.EVEN_ODD
                r0.setFillType(r1)
                goto L18
            L15:
                r0.reset()
            L18:
                float r0 = r7.i
                int r0 = (int) r0
                int r0 = r0 / 2
                float r0 = (float) r0
                float r1 = r7.q
                float r0 = r0 * r1
                double r1 = r7.r
                r3 = 0
                double r5 = java.lang.Math.cos(r3)
                double r1 = r1 * r5
                float r5 = r11.exactCenterX()
                double r5 = (double) r5
                double r1 = r1 + r5
                float r1 = (float) r1
                double r5 = r7.r
                double r2 = java.lang.Math.sin(r3)
                double r5 = r5 * r2
                float r2 = r11.exactCenterY()
                double r2 = (double) r2
                double r5 = r5 + r2
                float r2 = (float) r5
                android.graphics.Path r3 = r7.p
                r4 = 0
                r3.moveTo(r4, r4)
                android.graphics.Path r3 = r7.p
                int r5 = r7.s
                float r5 = (float) r5
                float r6 = r7.q
                float r5 = r5 * r6
                r3.lineTo(r5, r4)
                android.graphics.Path r3 = r7.p
                int r4 = r7.s
                float r4 = (float) r4
                float r5 = r7.q
                float r4 = r4 * r5
                r6 = 1073741824(0x40000000, float:2.0)
                float r4 = r4 / r6
                int r6 = r7.t
                float r6 = (float) r6
                float r6 = r6 * r5
                r3.lineTo(r4, r6)
                android.graphics.Path r3 = r7.p
                float r1 = r1 - r0
                r3.offset(r1, r2)
                android.graphics.Path r0 = r7.p
                r0.close()
                android.graphics.Paint r0 = r7.c
                int r1 = r7.x
                r0.setColor(r1)
                float r9 = r9 + r10
                r10 = 1084227584(0x40a00000, float:5.0)
                float r9 = r9 - r10
                float r10 = r11.exactCenterX()
                float r11 = r11.exactCenterY()
                r8.rotate(r9, r10, r11)
                android.graphics.Path r9 = r7.p
                android.graphics.Paint r10 = r7.c
                r8.drawPath(r9, r10)
            L90:
                return
        }

        private int h() {
                r2 = this;
                int r0 = r2.k
                int r0 = r0 + 1
                int[] r1 = r2.j
                int r1 = r1.length
                int r0 = r0 % r1
                return r0
        }

        private void q() {
                r2 = this;
                android.graphics.drawable.Drawable$Callback r0 = r2.d
                r1 = 0
                r0.invalidateDrawable(r1)
                return
        }

        public void A(@androidx.annotation.NonNull int[] r1) {
                r0 = this;
                r0.j = r1
                r1 = 0
                r0.z(r1)
                return
        }

        public void B(float r1) {
                r0 = this;
                r0.f = r1
                r0.q()
                return
        }

        public void C(int r6, int r7) {
                r5 = this;
                int r6 = java.lang.Math.min(r6, r7)
                float r6 = (float) r6
                double r0 = r5.r
                r2 = 0
                r7 = 1073741824(0x40000000, float:2.0)
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 <= 0) goto L1a
                r2 = 0
                int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                if (r2 >= 0) goto L15
                goto L1a
            L15:
                float r6 = r6 / r7
                double r6 = (double) r6
                double r6 = r6 - r0
            L18:
                float r6 = (float) r6
                goto L23
            L1a:
                float r6 = r5.h
                float r6 = r6 / r7
                double r6 = (double) r6
                double r6 = java.lang.Math.ceil(r6)
                goto L18
            L23:
                r5.i = r6
                return
        }

        public void D(float r1) {
                r0 = this;
                r0.g = r1
                r0.q()
                return
        }

        public void E(boolean r2) {
                r1 = this;
                boolean r0 = r1.o
                if (r0 == r2) goto L9
                r1.o = r2
                r1.q()
            L9:
                return
        }

        public void F(float r1) {
                r0 = this;
                r0.e = r1
                r0.q()
                return
        }

        public void G(float r2) {
                r1 = this;
                r1.h = r2
                android.graphics.Paint r0 = r1.b
                r0.setStrokeWidth(r2)
                r1.q()
                return
        }

        public void H() {
                r1 = this;
                float r0 = r1.e
                r1.l = r0
                float r0 = r1.f
                r1.m = r0
                float r0 = r1.g
                r1.n = r0
                return
        }

        public void a(android.graphics.Canvas r7, android.graphics.Rect r8) {
                r6 = this;
                android.graphics.RectF r1 = r6.a
                r1.set(r8)
                float r0 = r6.i
                r1.inset(r0, r0)
                float r0 = r6.e
                float r2 = r6.g
                float r0 = r0 + r2
                r3 = 1135869952(0x43b40000, float:360.0)
                float r0 = r0 * r3
                float r4 = r6.f
                float r4 = r4 + r2
                float r4 = r4 * r3
                float r3 = r4 - r0
                r2 = 0
                int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
                if (r2 == 0) goto L2f
                android.graphics.Paint r2 = r6.b
                int r4 = r6.x
                r2.setColor(r4)
                r4 = 0
                android.graphics.Paint r5 = r6.b
                r2 = r0
                r0 = r7
                r0.drawArc(r1, r2, r3, r4, r5)
                goto L31
            L2f:
                r2 = r0
                r0 = r7
            L31:
                r6.b(r0, r2, r3, r8)
                int r7 = r6.u
                r1 = 255(0xff, float:3.57E-43)
                if (r7 >= r1) goto L5d
                android.graphics.Paint r7 = r6.v
                int r2 = r6.w
                r7.setColor(r2)
                android.graphics.Paint r7 = r6.v
                int r2 = r6.u
                int r1 = r1 - r2
                r7.setAlpha(r1)
                float r7 = r8.exactCenterX()
                float r1 = r8.exactCenterY()
                int r8 = r8.width()
                int r8 = r8 / 2
                float r8 = (float) r8
                android.graphics.Paint r2 = r6.v
                r0.drawCircle(r7, r1, r8, r2)
            L5d:
                return
        }

        public int c() {
                r1 = this;
                int r0 = r1.u
                return r0
        }

        public double d() {
                r2 = this;
                double r0 = r2.r
                return r0
        }

        public float e() {
                r1 = this;
                float r0 = r1.f
                return r0
        }

        public float f() {
                r1 = this;
                float r0 = r1.i
                return r0
        }

        public int g() {
                r2 = this;
                int[] r0 = r2.j
                int r1 = r2.h()
                r0 = r0[r1]
                return r0
        }

        public float i() {
                r1 = this;
                float r0 = r1.g
                return r0
        }

        public float j() {
                r1 = this;
                float r0 = r1.e
                return r0
        }

        public int k() {
                r2 = this;
                int[] r0 = r2.j
                int r1 = r2.k
                r0 = r0[r1]
                return r0
        }

        public float l() {
                r1 = this;
                float r0 = r1.m
                return r0
        }

        public float m() {
                r1 = this;
                float r0 = r1.n
                return r0
        }

        public float n() {
                r1 = this;
                float r0 = r1.l
                return r0
        }

        public float o() {
                r1 = this;
                float r0 = r1.h
                return r0
        }

        public void p() {
                r1 = this;
                int r0 = r1.h()
                r1.z(r0)
                return
        }

        public void r() {
                r1 = this;
                r0 = 0
                r1.l = r0
                r1.m = r0
                r1.n = r0
                r1.F(r0)
                r1.B(r0)
                r1.D(r0)
                return
        }

        public void s(int r1) {
                r0 = this;
                r0.u = r1
                return
        }

        public void t(float r1, float r2) {
                r0 = this;
                int r1 = (int) r1
                r0.s = r1
                int r1 = (int) r2
                r0.t = r1
                return
        }

        public void u(float r2) {
                r1 = this;
                float r0 = r1.q
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto Lb
                r1.q = r2
                r1.q()
            Lb:
                return
        }

        public void v(@androidx.annotation.ColorInt int r1) {
                r0 = this;
                r0.w = r1
                return
        }

        public void w(double r1) {
                r0 = this;
                r0.r = r1
                return
        }

        public void x(int r1) {
                r0 = this;
                r0.x = r1
                return
        }

        public void y(android.graphics.ColorFilter r2) {
                r1 = this;
                android.graphics.Paint r0 = r1.b
                r0.setColorFilter(r2)
                r1.q()
                return
        }

        public void z(int r2) {
                r1 = this;
                r1.k = r2
                int[] r0 = r1.j
                r2 = r0[r2]
                r1.x = r2
                return
        }
    }

    static {
            android.view.animation.LinearInterpolator r0 = new android.view.animation.LinearInterpolator
            r0.<init>()
            com.scwang.smartrefresh.header.internal.MaterialProgressDrawable.l = r0
            com.scwang.smartrefresh.header.internal.a r0 = new com.scwang.smartrefresh.header.internal.a
            r0.<init>()
            com.scwang.smartrefresh.header.internal.MaterialProgressDrawable.m = r0
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int[] r0 = new int[]{r0}
            com.scwang.smartrefresh.header.internal.MaterialProgressDrawable.w = r0
            return
    }

    public MaterialProgressDrawable(android.content.Context r2, android.view.View r3) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a = r0
            com.scwang.smartrefresh.header.internal.MaterialProgressDrawable$c r0 = new com.scwang.smartrefresh.header.internal.MaterialProgressDrawable$c
            r0.<init>(r1)
            r1.k = r0
            r1.e = r3
            android.content.res.Resources r2 = r2.getResources()
            r1.d = r2
            com.scwang.smartrefresh.header.internal.MaterialProgressDrawable$d r2 = new com.scwang.smartrefresh.header.internal.MaterialProgressDrawable$d
            r2.<init>(r0)
            r1.b = r2
            int[] r3 = com.scwang.smartrefresh.header.internal.MaterialProgressDrawable.w
            r2.A(r3)
            r2 = 1
            r1.o(r2)
            r1.l()
            return
    }

    private int b(float r7, int r8, int r9) {
            r6 = this;
            int r0 = r8 >> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r8 >> 16
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r2 = r8 >> 8
            r2 = r2 & 255(0xff, float:3.57E-43)
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r3 = r9 >> 24
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r4 = r9 >> 16
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r5 = r9 >> 8
            r5 = r5 & 255(0xff, float:3.57E-43)
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r3 = r3 - r0
            float r3 = (float) r3
            float r3 = r3 * r7
            int r3 = (int) r3
            int r0 = r0 + r3
            int r0 = r0 << 24
            int r4 = r4 - r1
            float r3 = (float) r4
            float r3 = r3 * r7
            int r3 = (int) r3
            int r1 = r1 + r3
            int r1 = r1 << 16
            r0 = r0 | r1
            int r5 = r5 - r2
            float r1 = (float) r5
            float r1 = r1 * r7
            int r1 = (int) r1
            int r2 = r2 + r1
            int r1 = r2 << 8
            r0 = r0 | r1
            int r9 = r9 - r8
            float r9 = (float) r9
            float r7 = r7 * r9
            int r7 = (int) r7
            int r8 = r8 + r7
            r7 = r0 | r8
            return r7
    }

    private float d() {
            r1 = this;
            float r0 = r1.c
            return r0
    }

    private void j(double r5, double r7, double r9, double r11, float r13, float r14) {
            r4 = this;
            com.scwang.smartrefresh.header.internal.MaterialProgressDrawable$d r0 = r4.b
            android.content.res.Resources r1 = r4.d
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            double r2 = (double) r1
            double r5 = r5 * r2
            r4.h = r5
            double r7 = r7 * r2
            r4.i = r7
            float r5 = (float) r11
            float r5 = r5 * r1
            r0.G(r5)
            double r9 = r9 * r2
            r0.w(r9)
            r5 = 0
            r0.z(r5)
            float r13 = r13 * r1
            float r14 = r14 * r1
            r0.t(r13, r14)
            double r5 = r4.h
            int r5 = (int) r5
            double r6 = r4.i
            int r6 = (int) r6
            r0.C(r5, r6)
            return
    }

    private void l() {
            r3 = this;
            com.scwang.smartrefresh.header.internal.MaterialProgressDrawable$d r0 = r3.b
            com.scwang.smartrefresh.header.internal.MaterialProgressDrawable$a r1 = new com.scwang.smartrefresh.header.internal.MaterialProgressDrawable$a
            r1.<init>(r3, r0)
            r2 = -1
            r1.setRepeatCount(r2)
            r2 = 1
            r1.setRepeatMode(r2)
            android.view.animation.Interpolator r2 = com.scwang.smartrefresh.header.internal.MaterialProgressDrawable.l
            r1.setInterpolator(r2)
            com.scwang.smartrefresh.header.internal.MaterialProgressDrawable$b r2 = new com.scwang.smartrefresh.header.internal.MaterialProgressDrawable$b
            r2.<init>(r3, r0)
            r1.setAnimationListener(r2)
            r3.f = r1
            return
    }

    void a(float r5, com.scwang.smartrefresh.header.internal.MaterialProgressDrawable.d r6) {
            r4 = this;
            r4.n(r5, r6)
            float r0 = r6.m()
            r1 = 1061997773(0x3f4ccccd, float:0.8)
            float r0 = r0 / r1
            double r0 = (double) r0
            double r0 = java.lang.Math.floor(r0)
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 + r2
            float r0 = (float) r0
            float r1 = r4.c(r6)
            float r2 = r6.n()
            float r3 = r6.l()
            float r3 = r3 - r1
            float r1 = r6.n()
            float r3 = r3 - r1
            float r3 = r3 * r5
            float r2 = r2 + r3
            r6.F(r2)
            float r1 = r6.l()
            r6.B(r1)
            float r1 = r6.m()
            float r2 = r6.m()
            float r0 = r0 - r2
            float r0 = r0 * r5
            float r1 = r1 + r0
            r6.D(r1)
            return
    }

    float c(com.scwang.smartrefresh.header.internal.MaterialProgressDrawable.d r7) {
            r6 = this;
            float r0 = r7.o()
            double r0 = (double) r0
            r2 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            double r4 = r7.d()
            double r4 = r4 * r2
            double r0 = r0 / r4
            double r0 = java.lang.Math.toRadians(r0)
            float r7 = (float) r0
            return r7
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r6) {
            r5 = this;
            android.graphics.Rect r0 = r5.getBounds()
            int r1 = r6.save()
            float r2 = r5.c
            float r3 = r0.exactCenterX()
            float r4 = r0.exactCenterY()
            r6.rotate(r2, r3, r4)
            com.scwang.smartrefresh.header.internal.MaterialProgressDrawable$d r2 = r5.b
            r2.a(r6, r0)
            r6.restoreToCount(r1)
            return
    }

    public void e(float r2) {
            r1 = this;
            com.scwang.smartrefresh.header.internal.MaterialProgressDrawable$d r0 = r1.b
            r0.u(r2)
            return
    }

    public void f(@androidx.annotation.ColorInt int r2) {
            r1 = this;
            com.scwang.smartrefresh.header.internal.MaterialProgressDrawable$d r0 = r1.b
            r0.v(r2)
            return
    }

    public void g(int... r2) {
            r1 = this;
            com.scwang.smartrefresh.header.internal.MaterialProgressDrawable$d r0 = r1.b
            r0.A(r2)
            com.scwang.smartrefresh.header.internal.MaterialProgressDrawable$d r2 = r1.b
            r0 = 0
            r2.z(r0)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
            r1 = this;
            com.scwang.smartrefresh.header.internal.MaterialProgressDrawable$d r0 = r1.b
            int r0 = r0.c()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
            r2 = this;
            double r0 = r2.i
            int r0 = (int) r0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
            r2 = this;
            double r0 = r2.h
            int r0 = (int) r0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            r0 = -3
            return r0
    }

    public void h(float r2) {
            r1 = this;
            com.scwang.smartrefresh.header.internal.MaterialProgressDrawable$d r0 = r1.b
            r0.D(r2)
            return
    }

    void i(float r1) {
            r0 = this;
            r0.c = r1
            r0.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
            r6 = this;
            java.util.ArrayList<android.view.animation.Animation> r0 = r6.a
            int r1 = r0.size()
            r2 = 0
            r3 = 0
        L8:
            if (r3 >= r1) goto L21
            java.lang.Object r4 = r0.get(r3)
            android.view.animation.Animation r4 = (android.view.animation.Animation) r4
            boolean r5 = r4.hasStarted()
            if (r5 == 0) goto L1e
            boolean r4 = r4.hasEnded()
            if (r4 != 0) goto L1e
            r0 = 1
            return r0
        L1e:
            int r3 = r3 + 1
            goto L8
        L21:
            return r2
    }

    public void k(float r2, float r3) {
            r1 = this;
            com.scwang.smartrefresh.header.internal.MaterialProgressDrawable$d r0 = r1.b
            r0.F(r2)
            com.scwang.smartrefresh.header.internal.MaterialProgressDrawable$d r2 = r1.b
            r2.B(r3)
            return
    }

    public void m(boolean r2) {
            r1 = this;
            com.scwang.smartrefresh.header.internal.MaterialProgressDrawable$d r0 = r1.b
            r0.E(r2)
            return
    }

    void n(float r3, com.scwang.smartrefresh.header.internal.MaterialProgressDrawable.d r4) {
            r2 = this;
            r0 = 1061158912(0x3f400000, float:0.75)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto L19
            float r3 = r3 - r0
            r0 = 1048576000(0x3e800000, float:0.25)
            float r3 = r3 / r0
            int r0 = r4.k()
            int r1 = r4.g()
            int r3 = r2.b(r3, r0, r1)
            r4.x(r3)
        L19:
            return
    }

    public void o(int r23) {
            r22 = this;
            if (r23 != 0) goto L14
            r9 = 1094713344(0x41400000, float:12.0)
            r10 = 1086324736(0x40c00000, float:6.0)
            r1 = 4633078116657397760(0x404c000000000000, double:56.0)
            r3 = 4633078116657397760(0x404c000000000000, double:56.0)
            r5 = 4623226492472524800(0x4029000000000000, double:12.5)
            r7 = 4613937818241073152(0x4008000000000000, double:3.0)
            r0 = r22
            r0.j(r1, r3, r5, r7, r9, r10)
            return
        L14:
            r20 = 1092616192(0x41200000, float:10.0)
            r21 = 1084227584(0x40a00000, float:5.0)
            r12 = 4630826316843712512(0x4044000000000000, double:40.0)
            r14 = 4630826316843712512(0x4044000000000000, double:40.0)
            r16 = 4621115430147194880(0x4021800000000000, double:8.75)
            r18 = 4612811918334230528(0x4004000000000000, double:2.5)
            r11 = r22
            r11.j(r12, r14, r16, r18, r20, r21)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
            r1 = this;
            com.scwang.smartrefresh.header.internal.MaterialProgressDrawable$d r0 = r1.b
            r0.s(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            com.scwang.smartrefresh.header.internal.MaterialProgressDrawable$d r0 = r1.b
            r0.y(r2)
            return
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
            r3 = this;
            android.view.animation.Animation r0 = r3.f
            r0.reset()
            com.scwang.smartrefresh.header.internal.MaterialProgressDrawable$d r0 = r3.b
            r0.H()
            com.scwang.smartrefresh.header.internal.MaterialProgressDrawable$d r0 = r3.b
            float r0 = r0.e()
            com.scwang.smartrefresh.header.internal.MaterialProgressDrawable$d r1 = r3.b
            float r1 = r1.j()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L2c
            r0 = 1
            r3.j = r0
            android.view.animation.Animation r0 = r3.f
            r1 = 666(0x29a, double:3.29E-321)
            r0.setDuration(r1)
            android.view.View r0 = r3.e
            android.view.animation.Animation r1 = r3.f
            r0.startAnimation(r1)
            return
        L2c:
            com.scwang.smartrefresh.header.internal.MaterialProgressDrawable$d r0 = r3.b
            r1 = 0
            r0.z(r1)
            com.scwang.smartrefresh.header.internal.MaterialProgressDrawable$d r0 = r3.b
            r0.r()
            android.view.animation.Animation r0 = r3.f
            r1 = 1332(0x534, double:6.58E-321)
            r0.setDuration(r1)
            android.view.View r0 = r3.e
            android.view.animation.Animation r1 = r3.f
            r0.startAnimation(r1)
            return
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
            r2 = this;
            android.view.View r0 = r2.e
            r0.clearAnimation()
            r0 = 0
            r2.i(r0)
            com.scwang.smartrefresh.header.internal.MaterialProgressDrawable$d r0 = r2.b
            r1 = 0
            r0.E(r1)
            com.scwang.smartrefresh.header.internal.MaterialProgressDrawable$d r0 = r2.b
            r0.z(r1)
            com.scwang.smartrefresh.header.internal.MaterialProgressDrawable$d r0 = r2.b
            r0.r()
            return
    }
}
