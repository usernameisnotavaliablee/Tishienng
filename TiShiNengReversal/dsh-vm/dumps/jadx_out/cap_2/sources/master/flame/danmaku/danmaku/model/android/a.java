package master.flame.danmaku.danmaku.model.android;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class a extends master.flame.danmaku.danmaku.model.b<android.graphics.Canvas, android.graphics.Typeface> {
    private android.graphics.Camera f;
    private android.graphics.Matrix g;
    private final master.flame.danmaku.danmaku.model.android.a.C0124a h;
    private master.flame.danmaku.danmaku.model.android.b i;
    public android.graphics.Canvas j;
    private int k;
    private int l;
    private float m;
    private float n;
    private int o;
    private float p;
    private int q;
    private boolean r;
    private int s;
    private int t;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: master.flame.danmaku.danmaku.model.android.a$a, reason: collision with other inner class name */
    public static class C0124a {
        public static final int B = 4;
        private int A;
        private float a;
        private final java.util.Map<java.lang.Float, java.lang.Float> b;
        public final android.text.TextPaint c;
        public final android.text.TextPaint d;
        private android.graphics.Paint e;
        private android.graphics.Paint f;
        private android.graphics.Paint g;
        public int h;
        private float i;
        private float j;
        public float k;
        public float l;
        private int m;
        public boolean n;
        private boolean o;
        public boolean p;
        private boolean q;
        public boolean r;
        public boolean s;
        public boolean t;
        private boolean u;
        private boolean v;
        private int w;
        private float x;
        private boolean y;
        private int z;

        public C0124a() {
                r4 = this;
                r4.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r1 = 10
                r0.<init>(r1)
                r4.b = r0
                r0 = 4
                r4.h = r0
                r0 = 1082130432(0x40800000, float:4.0)
                r4.i = r0
                r1 = 1080033280(0x40600000, float:3.5)
                r4.j = r1
                r1 = 1065353216(0x3f800000, float:1.0)
                r4.k = r1
                r4.l = r1
                r2 = 204(0xcc, float:2.86E-43)
                r4.m = r2
                r2 = 0
                r4.n = r2
                r4.o = r2
                r3 = 1
                r4.p = r3
                r4.q = r3
                r4.r = r2
                r4.s = r2
                r4.t = r3
                r4.u = r3
                int r3 = master.flame.danmaku.danmaku.model.c.a
                r4.w = r3
                r4.x = r1
                r4.y = r2
                r4.z = r2
                r4.A = r2
                android.text.TextPaint r1 = new android.text.TextPaint
                r1.<init>()
                r4.c = r1
                float r2 = r4.j
                r1.setStrokeWidth(r2)
                android.text.TextPaint r2 = new android.text.TextPaint
                r2.<init>(r1)
                r4.d = r2
                android.graphics.Paint r1 = new android.graphics.Paint
                r1.<init>()
                r4.e = r1
                android.graphics.Paint r1 = new android.graphics.Paint
                r1.<init>()
                r4.f = r1
                int r2 = r4.h
                float r2 = (float) r2
                r1.setStrokeWidth(r2)
                android.graphics.Paint r1 = r4.f
                android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
                r1.setStyle(r2)
                android.graphics.Paint r1 = new android.graphics.Paint
                r1.<init>()
                r4.g = r1
                r1.setStyle(r2)
                android.graphics.Paint r1 = r4.g
                r1.setStrokeWidth(r0)
                return
        }

        static /* synthetic */ int a(master.flame.danmaku.danmaku.model.android.a.C0124a r0) {
                int r0 = r0.z
                return r0
        }

        static /* synthetic */ int b(master.flame.danmaku.danmaku.model.android.a.C0124a r0, int r1) {
                r0.z = r1
                return r1
        }

        static /* synthetic */ int c(master.flame.danmaku.danmaku.model.android.a.C0124a r0) {
                int r0 = r0.A
                return r0
        }

        static /* synthetic */ int d(master.flame.danmaku.danmaku.model.android.a.C0124a r0, int r1) {
                r0.A = r1
                return r1
        }

        static /* synthetic */ android.graphics.Paint e(master.flame.danmaku.danmaku.model.android.a.C0124a r0) {
                android.graphics.Paint r0 = r0.e
                return r0
        }

        static /* synthetic */ boolean f(master.flame.danmaku.danmaku.model.android.a.C0124a r0) {
                boolean r0 = r0.q
                return r0
        }

        private void h(master.flame.danmaku.danmaku.model.d r4, android.graphics.Paint r5) {
                r3 = this;
                boolean r0 = r3.y
                if (r0 != 0) goto L5
                return
            L5:
                java.util.Map<java.lang.Float, java.lang.Float> r0 = r3.b
                float r1 = r4.l
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                java.lang.Object r0 = r0.get(r1)
                java.lang.Float r0 = (java.lang.Float) r0
                if (r0 == 0) goto L1d
                float r1 = r3.a
                float r2 = r3.x
                int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r1 == 0) goto L34
            L1d:
                float r0 = r3.x
                r3.a = r0
                float r1 = r4.l
                float r1 = r1 * r0
                java.lang.Float r0 = java.lang.Float.valueOf(r1)
                java.util.Map<java.lang.Float, java.lang.Float> r1 = r3.b
                float r4 = r4.l
                java.lang.Float r4 = java.lang.Float.valueOf(r4)
                r1.put(r4, r0)
            L34:
                float r4 = r0.floatValue()
                r5.setTextSize(r4)
                return
        }

        public void g(master.flame.danmaku.danmaku.model.d r3, android.graphics.Paint r4, boolean r5) {
                r2 = this;
                boolean r0 = r2.v
                r1 = 16777215(0xffffff, float:2.3509886E-38)
                if (r0 == 0) goto L44
                if (r5 == 0) goto L33
                boolean r5 = r2.s
                if (r5 == 0) goto L10
                android.graphics.Paint$Style r5 = android.graphics.Paint.Style.FILL
                goto L12
            L10:
                android.graphics.Paint$Style r5 = android.graphics.Paint.Style.STROKE
            L12:
                r4.setStyle(r5)
                int r5 = r3.j
                r5 = r5 & r1
                r4.setColor(r5)
                boolean r5 = r2.s
                if (r5 == 0) goto L2d
                int r5 = r2.m
                float r5 = (float) r5
                int r0 = r2.w
                float r0 = (float) r0
                int r1 = master.flame.danmaku.danmaku.model.c.a
                float r1 = (float) r1
                float r0 = r0 / r1
                float r5 = r5 * r0
                int r5 = (int) r5
                goto L2f
            L2d:
                int r5 = r2.w
            L2f:
                r4.setAlpha(r5)
                goto L75
            L33:
                android.graphics.Paint$Style r5 = android.graphics.Paint.Style.FILL
                r4.setStyle(r5)
                int r5 = r3.g
                r5 = r5 & r1
                r4.setColor(r5)
                int r5 = r2.w
                r4.setAlpha(r5)
                goto L75
            L44:
                if (r5 == 0) goto L65
                boolean r5 = r2.s
                if (r5 == 0) goto L4d
                android.graphics.Paint$Style r5 = android.graphics.Paint.Style.FILL
                goto L4f
            L4d:
                android.graphics.Paint$Style r5 = android.graphics.Paint.Style.STROKE
            L4f:
                r4.setStyle(r5)
                int r5 = r3.j
                r5 = r5 & r1
                r4.setColor(r5)
                boolean r5 = r2.s
                if (r5 == 0) goto L5f
                int r5 = r2.m
                goto L61
            L5f:
                int r5 = master.flame.danmaku.danmaku.model.c.a
            L61:
                r4.setAlpha(r5)
                goto L75
            L65:
                android.graphics.Paint$Style r5 = android.graphics.Paint.Style.FILL
                r4.setStyle(r5)
                int r5 = r3.g
                r5 = r5 & r1
                r4.setColor(r5)
                int r5 = master.flame.danmaku.danmaku.model.c.a
                r4.setAlpha(r5)
            L75:
                int r5 = r3.getType()
                r0 = 7
                if (r5 != r0) goto L83
                int r3 = r3.c()
                r4.setAlpha(r3)
            L83:
                return
        }

        public void i() {
                r1 = this;
                java.util.Map<java.lang.Float, java.lang.Float> r0 = r1.b
                r0.clear()
                return
        }

        public void j(boolean r2) {
                r1 = this;
                boolean r0 = r1.p
                r1.q = r0
                boolean r0 = r1.n
                r1.o = r0
                boolean r0 = r1.r
                r1.s = r0
                if (r2 == 0) goto L14
                boolean r2 = r1.t
                if (r2 == 0) goto L14
                r2 = 1
                goto L15
            L14:
                r2 = 0
            L15:
                r1.u = r2
                return
        }

        public android.graphics.Paint k(master.flame.danmaku.danmaku.model.d r2) {
                r1 = this;
                android.graphics.Paint r0 = r1.g
                int r2 = r2.m
                r0.setColor(r2)
                android.graphics.Paint r2 = r1.g
                return r2
        }

        public android.text.TextPaint l(master.flame.danmaku.danmaku.model.d r4, boolean r5) {
                r3 = this;
                if (r5 == 0) goto L5
                android.text.TextPaint r5 = r3.c
                goto Lc
            L5:
                android.text.TextPaint r5 = r3.d
                android.text.TextPaint r0 = r3.c
                r5.set(r0)
            Lc:
                float r0 = r4.l
                r5.setTextSize(r0)
                r3.h(r4, r5)
                boolean r0 = r3.o
                if (r0 == 0) goto L28
                float r0 = r3.i
                r1 = 0
                int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r2 <= 0) goto L28
                int r4 = r4.j
                if (r4 != 0) goto L24
                goto L28
            L24:
                r5.setShadowLayer(r0, r1, r1, r4)
                goto L2b
            L28:
                r5.clearShadowLayer()
            L2b:
                boolean r4 = r3.u
                r5.setAntiAlias(r4)
                return r5
        }

        public float m() {
                r2 = this;
                boolean r0 = r2.o
                if (r0 == 0) goto L11
                boolean r1 = r2.q
                if (r1 == 0) goto L11
                float r0 = r2.i
                float r1 = r2.j
                float r0 = java.lang.Math.max(r0, r1)
                return r0
            L11:
                if (r0 == 0) goto L16
                float r0 = r2.i
                return r0
            L16:
                boolean r0 = r2.q
                if (r0 == 0) goto L1d
                float r0 = r2.j
                return r0
            L1d:
                r0 = 0
                return r0
        }

        public android.graphics.Paint n(master.flame.danmaku.danmaku.model.d r2) {
                r1 = this;
                android.graphics.Paint r0 = r1.f
                int r2 = r2.k
                r0.setColor(r2)
                android.graphics.Paint r2 = r1.f
                return r2
        }

        public boolean o(master.flame.danmaku.danmaku.model.d r3) {
                r2 = this;
                boolean r0 = r2.q
                if (r0 != 0) goto L8
                boolean r0 = r2.s
                if (r0 == 0) goto L15
            L8:
                float r0 = r2.j
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 <= 0) goto L15
                int r3 = r3.j
                if (r3 == 0) goto L15
                r3 = 1
                return r3
            L15:
                r3 = 0
                return r3
        }

        public void p(boolean r2) {
                r1 = this;
                android.text.TextPaint r0 = r1.c
                r0.setFakeBoldText(r2)
                return
        }

        public void q(float r3, float r4, int r5) {
                r2 = this;
                float r0 = r2.k
                int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r0 != 0) goto L12
                float r0 = r2.l
                int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r0 != 0) goto L12
                int r0 = r2.m
                if (r0 == r5) goto L11
                goto L12
            L11:
                return
            L12:
                r0 = 1065353216(0x3f800000, float:1.0)
                int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r1 <= 0) goto L19
                goto L1b
            L19:
                r3 = 1065353216(0x3f800000, float:1.0)
            L1b:
                r2.k = r3
                int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r3 <= 0) goto L22
                goto L24
            L22:
                r4 = 1065353216(0x3f800000, float:1.0)
            L24:
                r2.l = r4
                if (r5 >= 0) goto L2a
                r5 = 0
                goto L30
            L2a:
                r3 = 255(0xff, float:3.57E-43)
                if (r5 <= r3) goto L30
                r5 = 255(0xff, float:3.57E-43)
            L30:
                r2.m = r5
                return
        }

        public void r(float r2) {
                r1 = this;
                r0 = 1065353216(0x3f800000, float:1.0)
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                r1.y = r0
                r1.x = r2
                return
        }

        public void s(float r1) {
                r0 = this;
                r0.i = r1
                return
        }

        public void t(float r2) {
                r1 = this;
                android.text.TextPaint r0 = r1.c
                r0.setStrokeWidth(r2)
                r1.j = r2
                return
        }

        public void u(int r2) {
                r1 = this;
                int r0 = master.flame.danmaku.danmaku.model.c.a
                if (r2 == r0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                r1.v = r0
                r1.w = r2
                return
        }

        public void v(android.graphics.Typeface r2) {
                r1 = this;
                android.text.TextPaint r0 = r1.c
                r0.setTypeface(r2)
                return
        }
    }

    public a() {
            r2 = this;
            r2.<init>()
            android.graphics.Camera r0 = new android.graphics.Camera
            r0.<init>()
            r2.f = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r2.g = r0
            master.flame.danmaku.danmaku.model.android.a$a r0 = new master.flame.danmaku.danmaku.model.android.a$a
            r0.<init>()
            r2.h = r0
            master.flame.danmaku.danmaku.model.android.i r0 = new master.flame.danmaku.danmaku.model.android.i
            r0.<init>()
            r2.i = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.n = r0
            r1 = 160(0xa0, float:2.24E-43)
            r2.o = r1
            r2.p = r0
            r0 = 0
            r2.q = r0
            r0 = 1
            r2.r = r0
            r0 = 2048(0x800, float:2.87E-42)
            r2.s = r0
            r2.t = r0
            return
    }

    private void B(master.flame.danmaku.danmaku.model.d r2, android.text.TextPaint r3, boolean r4) {
            r1 = this;
            master.flame.danmaku.danmaku.model.android.b r0 = r1.i
            r0.e(r2, r3, r4)
            float r3 = r2.p
            float r4 = r2.q
            r1.K(r2, r3, r4)
            return
    }

    @android.annotation.SuppressLint({"NewApi"})
    private static final int E(android.graphics.Canvas r0) {
            int r0 = r0.getMaximumBitmapHeight()
            return r0
    }

    @android.annotation.SuppressLint({"NewApi"})
    private static final int F(android.graphics.Canvas r0) {
            int r0 = r0.getMaximumBitmapWidth()
            return r0
    }

    private synchronized android.text.TextPaint G(master.flame.danmaku.danmaku.model.d r2, boolean r3) {
            r1 = this;
            monitor-enter(r1)
            master.flame.danmaku.danmaku.model.android.a$a r0 = r1.h     // Catch: java.lang.Throwable -> L9
            android.text.TextPaint r2 = r0.l(r2, r3)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r2
        L9:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r2
    }

    private void H(android.graphics.Paint r3) {
            r2 = this;
            int r0 = r3.getAlpha()
            int r1 = master.flame.danmaku.danmaku.model.c.a
            if (r0 == r1) goto Lb
            r3.setAlpha(r1)
        Lb:
            return
    }

    private void I(android.graphics.Canvas r1) {
            r0 = this;
            r1.restore()
            return
    }

    private int J(master.flame.danmaku.danmaku.model.d r4, android.graphics.Canvas r5, float r6, float r7) {
            r3 = this;
            android.graphics.Camera r0 = r3.f
            r0.save()
            float r0 = r3.m
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 == 0) goto L11
            android.graphics.Camera r2 = r3.f
            r2.setLocation(r1, r1, r0)
        L11:
            android.graphics.Camera r0 = r3.f
            float r1 = r4.i
            float r1 = -r1
            r0.rotateY(r1)
            android.graphics.Camera r0 = r3.f
            float r4 = r4.h
            float r4 = -r4
            r0.rotateZ(r4)
            android.graphics.Camera r4 = r3.f
            android.graphics.Matrix r0 = r3.g
            r4.getMatrix(r0)
            android.graphics.Matrix r4 = r3.g
            float r0 = -r6
            float r1 = -r7
            r4.preTranslate(r0, r1)
            android.graphics.Matrix r4 = r3.g
            r4.postTranslate(r6, r7)
            android.graphics.Camera r4 = r3.f
            r4.restore()
            int r4 = r5.save()
            android.graphics.Matrix r6 = r3.g
            r5.concat(r6)
            return r4
    }

    private void K(master.flame.danmaku.danmaku.model.d r3, float r4, float r5) {
            r2 = this;
            int r0 = r3.n
            int r1 = r0 * 2
            float r1 = (float) r1
            float r4 = r4 + r1
            int r0 = r0 * 2
            float r0 = (float) r0
            float r5 = r5 + r0
            int r0 = r3.m
            if (r0 == 0) goto L13
            r0 = 8
            float r0 = (float) r0
            float r4 = r4 + r0
            float r5 = r5 + r0
        L13:
            float r0 = r2.m()
            float r4 = r4 + r0
            r3.p = r4
            r3.q = r5
            return
    }

    private void update(android.graphics.Canvas r2) {
            r1 = this;
            r1.j = r2
            if (r2 == 0) goto L20
            int r0 = r2.getWidth()
            r1.k = r0
            int r0 = r2.getHeight()
            r1.l = r0
            boolean r0 = r1.r
            if (r0 == 0) goto L20
            int r0 = F(r2)
            r1.s = r0
            int r2 = E(r2)
            r1.t = r2
        L20:
            return
    }

    @Override // master.flame.danmaku.danmaku.model.b
    public /* bridge */ /* synthetic */ void A(android.graphics.Typeface r1) {
            r0 = this;
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            r0.P(r1)
            return
    }

    public synchronized void C(master.flame.danmaku.danmaku.model.d r8, android.graphics.Canvas r9, float r10, float r11, boolean r12) {
            r7 = this;
            monitor-enter(r7)
            master.flame.danmaku.danmaku.model.android.b r0 = r7.i     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto L13
            master.flame.danmaku.danmaku.model.android.a$a r6 = r7.h     // Catch: java.lang.Throwable -> L10
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.d(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L10
            goto L13
        L10:
            r0 = move-exception
            r8 = r0
            goto L15
        L13:
            monitor-exit(r7)
            return
        L15:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L10
            throw r8
    }

    public android.graphics.Canvas D() {
            r1 = this;
            android.graphics.Canvas r0 = r1.j
            return r0
    }

    public void L(android.graphics.Canvas r1) {
            r0 = this;
            r0.update(r1)
            return
    }

    public void M(float r2) {
            r1 = this;
            master.flame.danmaku.danmaku.model.android.a$a r0 = r1.h
            r0.t(r2)
            return
    }

    public void N(float r2, float r3, int r4) {
            r1 = this;
            master.flame.danmaku.danmaku.model.android.a$a r0 = r1.h
            r0.q(r2, r3, r4)
            return
    }

    public void O(float r2) {
            r1 = this;
            master.flame.danmaku.danmaku.model.android.a$a r0 = r1.h
            r0.s(r2)
            return
    }

    public void P(android.graphics.Typeface r2) {
            r1 = this;
            master.flame.danmaku.danmaku.model.android.a$a r0 = r1.h
            r0.v(r2)
            return
    }

    @Override // master.flame.danmaku.danmaku.model.n
    public void a(float r3) {
            r2 = this;
            int r0 = r2.getWidth()
            float r0 = (float) r0
            r1 = 1143635968(0x442a8000, float:682.0)
            float r0 = r0 / r1
            float r0 = java.lang.Math.max(r3, r0)
            r1 = 1103626240(0x41c80000, float:25.0)
            float r0 = r0 * r1
            int r1 = (int) r0
            r2.q = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 <= 0) goto L1f
            float r0 = r0 * r3
            int r3 = (int) r0
            r2.q = r3
        L1f:
            return
    }

    @Override // master.flame.danmaku.danmaku.model.n
    public void b(int r5, float[] r6) {
            r4 = this;
            r0 = -1
            r1 = 1
            r2 = 0
            if (r5 == r0) goto L3a
            if (r5 == 0) goto L31
            if (r5 == r1) goto L23
            r0 = 2
            if (r5 == r0) goto L3a
            r3 = 3
            if (r5 == r3) goto L10
            return
        L10:
            master.flame.danmaku.danmaku.model.android.a$a r5 = r4.h
            r5.n = r2
            r5.p = r2
            r5.r = r1
            r5 = r6[r2]
            r1 = r6[r1]
            r6 = r6[r0]
            int r6 = (int) r6
            r4.N(r5, r1, r6)
            return
        L23:
            master.flame.danmaku.danmaku.model.android.a$a r5 = r4.h
            r5.n = r1
            r5.p = r2
            r5.r = r2
            r5 = r6[r2]
            r4.O(r5)
            return
        L31:
            master.flame.danmaku.danmaku.model.android.a$a r5 = r4.h
            r5.n = r2
            r5.p = r2
            r5.r = r2
            return
        L3a:
            master.flame.danmaku.danmaku.model.android.a$a r5 = r4.h
            r5.n = r2
            r5.p = r1
            r5.r = r2
            r5 = r6[r2]
            r4.M(r5)
            return
    }

    @Override // master.flame.danmaku.danmaku.model.n
    public void c(float r1, int r2, float r3) {
            r0 = this;
            r0.n = r1
            r0.o = r2
            r0.p = r3
            return
    }

    @Override // master.flame.danmaku.danmaku.model.n
    public float d() {
            r1 = this;
            float r0 = r1.p
            return r0
    }

    @Override // master.flame.danmaku.danmaku.model.n
    public void e(master.flame.danmaku.danmaku.model.d r4, boolean r5) {
            r3 = this;
            android.text.TextPaint r0 = r3.G(r4, r5)
            master.flame.danmaku.danmaku.model.android.a$a r1 = r3.h
            boolean r1 = master.flame.danmaku.danmaku.model.android.a.C0124a.f(r1)
            if (r1 == 0) goto L12
            master.flame.danmaku.danmaku.model.android.a$a r1 = r3.h
            r2 = 1
            r1.g(r4, r0, r2)
        L12:
            r3.B(r4, r0, r5)
            master.flame.danmaku.danmaku.model.android.a$a r5 = r3.h
            boolean r5 = master.flame.danmaku.danmaku.model.android.a.C0124a.f(r5)
            if (r5 == 0) goto L23
            master.flame.danmaku.danmaku.model.android.a$a r5 = r3.h
            r1 = 0
            r5.g(r4, r0, r1)
        L23:
            return
    }

    @Override // master.flame.danmaku.danmaku.model.n
    public void f(int r2) {
            r1 = this;
            master.flame.danmaku.danmaku.model.android.a$a r0 = r1.h
            master.flame.danmaku.danmaku.model.android.a.C0124a.b(r0, r2)
            return
    }

    @Override // master.flame.danmaku.danmaku.model.n
    public void g(master.flame.danmaku.danmaku.model.d r2) {
            r1 = this;
            master.flame.danmaku.danmaku.model.android.b r0 = r1.i
            if (r0 == 0) goto L7
            r0.g(r2)
        L7:
            return
    }

    @Override // master.flame.danmaku.danmaku.model.n
    public float getDensity() {
            r1 = this;
            float r0 = r1.n
            return r0
    }

    @Override // master.flame.danmaku.danmaku.model.n
    public int getDensityDpi() {
            r1 = this;
            int r0 = r1.o
            return r0
    }

    @Override // master.flame.danmaku.danmaku.model.n
    public int getHeight() {
            r1 = this;
            int r0 = r1.l
            return r0
    }

    @Override // master.flame.danmaku.danmaku.model.n
    public int getWidth() {
            r1 = this;
            int r0 = r1.k
            return r0
    }

    @Override // master.flame.danmaku.danmaku.model.n
    public int h() {
            r1 = this;
            master.flame.danmaku.danmaku.model.android.a$a r0 = r1.h
            int r0 = master.flame.danmaku.danmaku.model.android.a.C0124a.a(r0)
            return r0
    }

    @Override // master.flame.danmaku.danmaku.model.n
    public int i() {
            r1 = this;
            int r0 = r1.t
            return r0
    }

    @Override // master.flame.danmaku.danmaku.model.b, master.flame.danmaku.danmaku.model.n
    public boolean isHardwareAccelerated() {
            r1 = this;
            boolean r0 = r1.r
            return r0
    }

    @Override // master.flame.danmaku.danmaku.model.n
    public void j(boolean r1) {
            r0 = this;
            r0.r = r1
            return
    }

    @Override // master.flame.danmaku.danmaku.model.n
    public int k() {
            r1 = this;
            master.flame.danmaku.danmaku.model.android.a$a r0 = r1.h
            int r0 = master.flame.danmaku.danmaku.model.android.a.C0124a.c(r0)
            return r0
    }

    @Override // master.flame.danmaku.danmaku.model.n
    public void l(master.flame.danmaku.danmaku.model.d r2, boolean r3) {
            r1 = this;
            master.flame.danmaku.danmaku.model.android.b r0 = r1.i
            if (r0 == 0) goto L7
            r0.f(r2, r3)
        L7:
            return
    }

    @Override // master.flame.danmaku.danmaku.model.n
    public float m() {
            r1 = this;
            master.flame.danmaku.danmaku.model.android.a$a r0 = r1.h
            float r0 = r0.m()
            return r0
    }

    @Override // master.flame.danmaku.danmaku.model.n
    public int n() {
            r1 = this;
            int r0 = r1.q
            return r0
    }

    @Override // master.flame.danmaku.danmaku.model.n
    public int o() {
            r1 = this;
            int r0 = r1.s
            return r0
    }

    @Override // master.flame.danmaku.danmaku.model.n
    public int p(master.flame.danmaku.danmaku.model.d r10) {
            r9 = this;
            float r4 = r10.l()
            float r3 = r10.g()
            android.graphics.Canvas r0 = r9.j
            r1 = 0
            if (r0 == 0) goto L99
            int r0 = r10.getType()
            r2 = 7
            r7 = 1
            r5 = 0
            if (r0 != r2) goto L4c
            int r0 = r10.c()
            int r2 = master.flame.danmaku.danmaku.model.c.b
            if (r0 != r2) goto L1f
            return r1
        L1f:
            float r0 = r10.h
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L2f
            float r0 = r10.i
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L2d
            goto L2f
        L2d:
            r0 = 0
            goto L35
        L2f:
            android.graphics.Canvas r0 = r9.j
            r9.J(r10, r0, r3, r4)
            r0 = 1
        L35:
            int r2 = r10.c()
            int r6 = master.flame.danmaku.danmaku.model.c.a
            if (r2 == r6) goto L4a
            master.flame.danmaku.danmaku.model.android.a$a r2 = r9.h
            android.graphics.Paint r5 = master.flame.danmaku.danmaku.model.android.a.C0124a.e(r2)
            int r2 = r10.c()
            r5.setAlpha(r2)
        L4a:
            r8 = r0
            goto L4d
        L4c:
            r8 = 0
        L4d:
            if (r5 == 0) goto L58
            int r0 = r5.getAlpha()
            int r2 = master.flame.danmaku.danmaku.model.c.b
            if (r0 != r2) goto L58
            return r1
        L58:
            master.flame.danmaku.danmaku.model.android.b r0 = r9.i
            android.graphics.Canvas r2 = r9.j
            master.flame.danmaku.danmaku.model.android.a$a r1 = r9.h
            android.text.TextPaint r6 = r1.c
            r1 = r10
            boolean r10 = r0.c(r1, r2, r3, r4, r5, r6)
            if (r10 != 0) goto L90
            if (r5 == 0) goto L80
            master.flame.danmaku.danmaku.model.android.a$a r10 = r9.h
            android.text.TextPaint r10 = r10.c
            int r0 = r5.getAlpha()
            r10.setAlpha(r0)
            master.flame.danmaku.danmaku.model.android.a$a r10 = r9.h
            android.text.TextPaint r10 = r10.d
            int r0 = r5.getAlpha()
            r10.setAlpha(r0)
            goto L87
        L80:
            master.flame.danmaku.danmaku.model.android.a$a r10 = r9.h
            android.text.TextPaint r10 = r10.c
            r9.H(r10)
        L87:
            android.graphics.Canvas r2 = r9.j
            r5 = 0
            r0 = r9
            r0.C(r1, r2, r3, r4, r5)
            r7 = 2
            goto L91
        L90:
            r0 = r9
        L91:
            if (r8 == 0) goto L98
            android.graphics.Canvas r10 = r0.j
            r9.I(r10)
        L98:
            return r7
        L99:
            r0 = r9
            return r1
    }

    @Override // master.flame.danmaku.danmaku.model.n
    public void q(int r2) {
            r1 = this;
            master.flame.danmaku.danmaku.model.android.a$a r0 = r1.h
            master.flame.danmaku.danmaku.model.android.a.C0124a.d(r0, r2)
            return
    }

    @Override // master.flame.danmaku.danmaku.model.b
    public void r() {
            r1 = this;
            master.flame.danmaku.danmaku.model.android.b r0 = r1.i
            r0.b()
            master.flame.danmaku.danmaku.model.android.a$a r0 = r1.h
            r0.i()
            return
    }

    @Override // master.flame.danmaku.danmaku.model.b
    public /* bridge */ /* synthetic */ void s(master.flame.danmaku.danmaku.model.d r1, android.graphics.Canvas r2, float r3, float r4, boolean r5) {
            r0 = this;
            android.graphics.Canvas r2 = (android.graphics.Canvas) r2
            r0.C(r1, r2, r3, r4, r5)
            return
    }

    @Override // master.flame.danmaku.danmaku.model.n
    public void setSize(int r3, int r4) {
            r2 = this;
            r2.k = r3
            r2.l = r4
            float r3 = (float) r3
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            double r3 = (double) r3
            r0 = 4602317910503718458(0x3fdeb7c166fdfe3a, double:0.4799655442984406)
            double r0 = java.lang.Math.tan(r0)
            double r3 = r3 / r0
            float r3 = (float) r3
            r2.m = r3
            return
    }

    @Override // master.flame.danmaku.danmaku.model.b
    public master.flame.danmaku.danmaku.model.android.b t() {
            r1 = this;
            master.flame.danmaku.danmaku.model.android.b r0 = r1.i
            return r0
    }

    @Override // master.flame.danmaku.danmaku.model.b
    public /* bridge */ /* synthetic */ android.graphics.Canvas u() {
            r1 = this;
            android.graphics.Canvas r0 = r1.D()
            return r0
    }

    @Override // master.flame.danmaku.danmaku.model.b
    public void v(master.flame.danmaku.danmaku.model.android.b r2) {
            r1 = this;
            master.flame.danmaku.danmaku.model.android.b r0 = r1.i
            if (r2 == r0) goto L6
            r1.i = r2
        L6:
            return
    }

    @Override // master.flame.danmaku.danmaku.model.b
    public /* bridge */ /* synthetic */ void w(android.graphics.Canvas r1) {
            r0 = this;
            android.graphics.Canvas r1 = (android.graphics.Canvas) r1
            r0.L(r1)
            return
    }

    @Override // master.flame.danmaku.danmaku.model.b
    public void x(boolean r2) {
            r1 = this;
            master.flame.danmaku.danmaku.model.android.a$a r0 = r1.h
            r0.p(r2)
            return
    }

    @Override // master.flame.danmaku.danmaku.model.b
    public void y(float r2) {
            r1 = this;
            master.flame.danmaku.danmaku.model.android.a$a r0 = r1.h
            r0.r(r2)
            return
    }

    @Override // master.flame.danmaku.danmaku.model.b
    public void z(int r2) {
            r1 = this;
            master.flame.danmaku.danmaku.model.android.a$a r0 = r1.h
            r0.u(r2)
            return
    }
}
