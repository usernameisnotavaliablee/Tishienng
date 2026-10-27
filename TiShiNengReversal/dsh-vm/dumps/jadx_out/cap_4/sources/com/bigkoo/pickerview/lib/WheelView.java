package com.bigkoo.pickerview.lib;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class WheelView extends android.view.View {
    private static final int S = 5;
    private static final float T = 0.8f;
    int A;
    int B;
    private int C;
    int D;
    int E;
    int F;
    int G;
    int H;
    int I;
    int J;
    private int K;
    private float L;
    long M;
    int N;
    private int O;
    private int P;
    private int Q;
    private float R;
    private com.bigkoo.pickerview.lib.WheelView.DividerType a;
    android.content.Context b;
    android.os.Handler c;
    private android.view.GestureDetector d;
    o.c e;
    private boolean f;
    java.util.concurrent.ScheduledExecutorService g;
    private java.util.concurrent.ScheduledFuture<?> h;
    android.graphics.Paint i;
    android.graphics.Paint j;
    android.graphics.Paint k;

    /* renamed from: l, reason: collision with root package name */
    n.c f272l;

    /* renamed from: m, reason: collision with root package name */
    private java.lang.String f273m;

    /* renamed from: n, reason: collision with root package name */
    int f274n;

    /* renamed from: o, reason: collision with root package name */
    int f275o;

    /* renamed from: p, reason: collision with root package name */
    int f276p;

    /* renamed from: q, reason: collision with root package name */
    float f277q;

    /* renamed from: r, reason: collision with root package name */
    android.graphics.Typeface f278r;

    /* renamed from: s, reason: collision with root package name */
    int f279s;

    /* renamed from: t, reason: collision with root package name */
    int f280t;

    /* renamed from: u, reason: collision with root package name */
    int f281u;

    /* renamed from: v, reason: collision with root package name */
    float f282v;

    /* renamed from: w, reason: collision with root package name */
    boolean f283w;

    /* renamed from: x, reason: collision with root package name */
    float f284x;

    /* renamed from: y, reason: collision with root package name */
    float f285y;

    /* renamed from: z, reason: collision with root package name */
    float f286z;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum ACTION extends java.lang.Enum<com.bigkoo.pickerview.lib.WheelView.ACTION> {
        private static final /* synthetic */ com.bigkoo.pickerview.lib.WheelView.ACTION[] $VALUES = null;
        public static final com.bigkoo.pickerview.lib.WheelView.ACTION CLICK = null;
        public static final com.bigkoo.pickerview.lib.WheelView.ACTION DAGGLE = null;
        public static final com.bigkoo.pickerview.lib.WheelView.ACTION FLING = null;

        static {
                com.bigkoo.pickerview.lib.WheelView$ACTION r0 = new com.bigkoo.pickerview.lib.WheelView$ACTION
                java.lang.String r1 = "CLICK"
                r2 = 0
                r0.<init>(r1, r2)
                com.bigkoo.pickerview.lib.WheelView.ACTION.CLICK = r0
                com.bigkoo.pickerview.lib.WheelView$ACTION r1 = new com.bigkoo.pickerview.lib.WheelView$ACTION
                java.lang.String r3 = "FLING"
                r4 = 1
                r1.<init>(r3, r4)
                com.bigkoo.pickerview.lib.WheelView.ACTION.FLING = r1
                com.bigkoo.pickerview.lib.WheelView$ACTION r3 = new com.bigkoo.pickerview.lib.WheelView$ACTION
                java.lang.String r5 = "DAGGLE"
                r6 = 2
                r3.<init>(r5, r6)
                com.bigkoo.pickerview.lib.WheelView.ACTION.DAGGLE = r3
                r5 = 3
                com.bigkoo.pickerview.lib.WheelView$ACTION[] r5 = new com.bigkoo.pickerview.lib.WheelView.ACTION[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                com.bigkoo.pickerview.lib.WheelView.ACTION.$VALUES = r5
                return
        }

        ACTION(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.bigkoo.pickerview.lib.WheelView.ACTION valueOf(java.lang.String r1) {
                java.lang.Class<com.bigkoo.pickerview.lib.WheelView$ACTION> r0 = com.bigkoo.pickerview.lib.WheelView.ACTION.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.bigkoo.pickerview.lib.WheelView$ACTION r1 = (com.bigkoo.pickerview.lib.WheelView.ACTION) r1
                return r1
        }

        public static com.bigkoo.pickerview.lib.WheelView.ACTION[] values() {
                com.bigkoo.pickerview.lib.WheelView$ACTION[] r0 = com.bigkoo.pickerview.lib.WheelView.ACTION.$VALUES
                java.lang.Object r0 = r0.clone()
                com.bigkoo.pickerview.lib.WheelView$ACTION[] r0 = (com.bigkoo.pickerview.lib.WheelView.ACTION[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum DividerType extends java.lang.Enum<com.bigkoo.pickerview.lib.WheelView.DividerType> {
        private static final /* synthetic */ com.bigkoo.pickerview.lib.WheelView.DividerType[] $VALUES = null;
        public static final com.bigkoo.pickerview.lib.WheelView.DividerType FILL = null;
        public static final com.bigkoo.pickerview.lib.WheelView.DividerType WRAP = null;

        static {
                com.bigkoo.pickerview.lib.WheelView$DividerType r0 = new com.bigkoo.pickerview.lib.WheelView$DividerType
                java.lang.String r1 = "FILL"
                r2 = 0
                r0.<init>(r1, r2)
                com.bigkoo.pickerview.lib.WheelView.DividerType.FILL = r0
                com.bigkoo.pickerview.lib.WheelView$DividerType r1 = new com.bigkoo.pickerview.lib.WheelView$DividerType
                java.lang.String r3 = "WRAP"
                r4 = 1
                r1.<init>(r3, r4)
                com.bigkoo.pickerview.lib.WheelView.DividerType.WRAP = r1
                r3 = 2
                com.bigkoo.pickerview.lib.WheelView$DividerType[] r3 = new com.bigkoo.pickerview.lib.WheelView.DividerType[r3]
                r3[r2] = r0
                r3[r4] = r1
                com.bigkoo.pickerview.lib.WheelView.DividerType.$VALUES = r3
                return
        }

        DividerType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.bigkoo.pickerview.lib.WheelView.DividerType valueOf(java.lang.String r1) {
                java.lang.Class<com.bigkoo.pickerview.lib.WheelView$DividerType> r0 = com.bigkoo.pickerview.lib.WheelView.DividerType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.bigkoo.pickerview.lib.WheelView$DividerType r1 = (com.bigkoo.pickerview.lib.WheelView.DividerType) r1
                return r1
        }

        public static com.bigkoo.pickerview.lib.WheelView.DividerType[] values() {
                com.bigkoo.pickerview.lib.WheelView$DividerType[] r0 = com.bigkoo.pickerview.lib.WheelView.DividerType.$VALUES
                java.lang.Object r0 = r0.clone()
                com.bigkoo.pickerview.lib.WheelView$DividerType[] r0 = (com.bigkoo.pickerview.lib.WheelView.DividerType[]) r0
                return r0
        }
    }

    public WheelView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public WheelView(android.content.Context r7, android.util.AttributeSet r8) {
            r6 = this;
            r6.<init>(r7, r8)
            r0 = 0
            r6.f = r0
            java.util.concurrent.ScheduledExecutorService r1 = java.util.concurrent.Executors.newSingleThreadScheduledExecutor()
            r6.g = r1
            android.graphics.Typeface r1 = android.graphics.Typeface.MONOSPACE
            r6.f278r = r1
            r1 = -5723992(0xffffffffffa8a8a8, float:NaN)
            r6.f279s = r1
            r1 = -14013910(0xffffffffff2a2a2a, float:-2.2618769E38)
            r6.f280t = r1
            r1 = -2763307(0xffffffffffd5d5d5, float:NaN)
            r6.f281u = r1
            r1 = 1070386381(0x3fcccccd, float:1.6)
            r6.f282v = r1
            r1 = 11
            r6.F = r1
            r6.K = r0
            r1 = 0
            r6.L = r1
            r1 = 0
            r6.M = r1
            r1 = 17
            r6.O = r1
            r6.P = r0
            r6.Q = r0
            android.content.res.Resources r2 = r6.getResources()
            int r3 = com.bigkoo.pickerview.R.dimen.pickerview_textsize
            int r2 = r2.getDimensionPixelSize(r3)
            r6.f274n = r2
            android.content.res.Resources r2 = r6.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            r3 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 >= 0) goto L5b
            r2 = 1075419546(0x4019999a, float:2.4)
            r6.R = r2
            goto L8f
        L5b:
            r4 = 1073741824(0x40000000, float:2.0)
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 > 0) goto L6b
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 >= 0) goto L6b
            r2 = 1080452710(0x40666666, float:3.6)
            r6.R = r2
            goto L8f
        L6b:
            if (r3 > 0) goto L76
            int r3 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r3 >= 0) goto L76
            r2 = 1083179008(0x40900000, float:4.5)
            r6.R = r2
            goto L8f
        L76:
            r3 = 1077936128(0x40400000, float:3.0)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 > 0) goto L85
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 >= 0) goto L85
            r2 = 1086324736(0x40c00000, float:6.0)
            r6.R = r2
            goto L8f
        L85:
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 < 0) goto L8f
            r3 = 1075838976(0x40200000, float:2.5)
            float r2 = r2 * r3
            r6.R = r2
        L8f:
            if (r8 == 0) goto Ld4
            int[] r2 = com.bigkoo.pickerview.R.styleable.pickerview
            android.content.res.TypedArray r8 = r7.obtainStyledAttributes(r8, r2, r0, r0)
            int r0 = com.bigkoo.pickerview.R.styleable.pickerview_pickerview_gravity
            int r0 = r8.getInt(r0, r1)
            r6.O = r0
            int r0 = com.bigkoo.pickerview.R.styleable.pickerview_pickerview_textColorOut
            int r1 = r6.f279s
            int r0 = r8.getColor(r0, r1)
            r6.f279s = r0
            int r0 = com.bigkoo.pickerview.R.styleable.pickerview_pickerview_textColorCenter
            int r1 = r6.f280t
            int r0 = r8.getColor(r0, r1)
            r6.f280t = r0
            int r0 = com.bigkoo.pickerview.R.styleable.pickerview_pickerview_dividerColor
            int r1 = r6.f281u
            int r0 = r8.getColor(r0, r1)
            r6.f281u = r0
            int r0 = com.bigkoo.pickerview.R.styleable.pickerview_pickerview_textSize
            int r1 = r6.f274n
            int r0 = r8.getDimensionPixelOffset(r0, r1)
            r6.f274n = r0
            int r0 = com.bigkoo.pickerview.R.styleable.pickerview_pickerview_lineSpacingMultiplier
            float r1 = r6.f282v
            float r0 = r8.getFloat(r0, r1)
            r6.f282v = r0
            r8.recycle()
        Ld4:
            r6.g()
            r6.e(r7)
            return
    }

    private java.lang.String b(java.lang.Object r4) {
            r3 = this;
            if (r4 != 0) goto L5
            java.lang.String r4 = ""
            return r4
        L5:
            boolean r0 = r4 instanceof p.a
            if (r0 == 0) goto L10
            p.a r4 = (p.a) r4
            java.lang.String r4 = r4.a()
            return r4
        L10:
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 == 0) goto L27
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.Integer r4 = (java.lang.Integer) r4
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.String r4 = "%02d"
            java.lang.String r4 = java.lang.String.format(r0, r4, r1)
            return r4
        L27:
            java.lang.String r4 = r4.toString()
            return r4
    }

    private int c(int r2) {
            r1 = this;
            if (r2 >= 0) goto Le
            n.c r0 = r1.f272l
            int r0 = r0.a()
            int r2 = r2 + r0
            int r2 = r1.c(r2)
            return r2
        Le:
            n.c r0 = r1.f272l
            int r0 = r0.a()
            int r0 = r0 + (-1)
            if (r2 <= r0) goto L23
            n.c r0 = r1.f272l
            int r0 = r0.a()
            int r2 = r2 - r0
            int r2 = r1.c(r2)
        L23:
            return r2
    }

    private void e(android.content.Context r3) {
            r2 = this;
            r2.b = r3
            com.bigkoo.pickerview.lib.c r0 = new com.bigkoo.pickerview.lib.c
            r0.<init>(r2)
            r2.c = r0
            android.view.GestureDetector r0 = new android.view.GestureDetector
            com.bigkoo.pickerview.lib.b r1 = new com.bigkoo.pickerview.lib.b
            r1.<init>(r2)
            r0.<init>(r3, r1)
            r2.d = r0
            r3 = 0
            r0.setIsLongpressEnabled(r3)
            r0 = 1
            r2.f283w = r0
            r2.A = r3
            r3 = -1
            r2.B = r3
            r2.f()
            return
    }

    private void f() {
            r3 = this;
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r3.i = r0
            int r1 = r3.f279s
            r0.setColor(r1)
            android.graphics.Paint r0 = r3.i
            r1 = 1
            r0.setAntiAlias(r1)
            android.graphics.Paint r0 = r3.i
            android.graphics.Typeface r2 = r3.f278r
            r0.setTypeface(r2)
            android.graphics.Paint r0 = r3.i
            int r2 = r3.f274n
            float r2 = (float) r2
            r0.setTextSize(r2)
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r3.j = r0
            int r2 = r3.f280t
            r0.setColor(r2)
            android.graphics.Paint r0 = r3.j
            r0.setAntiAlias(r1)
            android.graphics.Paint r0 = r3.j
            r2 = 1066192077(0x3f8ccccd, float:1.1)
            r0.setTextScaleX(r2)
            android.graphics.Paint r0 = r3.j
            android.graphics.Typeface r2 = r3.f278r
            r0.setTypeface(r2)
            android.graphics.Paint r0 = r3.j
            int r2 = r3.f274n
            float r2 = (float) r2
            r0.setTextSize(r2)
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r3.k = r0
            int r2 = r3.f281u
            r0.setColor(r2)
            android.graphics.Paint r0 = r3.k
            r0.setAntiAlias(r1)
            r0 = 0
            r3.setLayerType(r1, r0)
            return
    }

    private void g() {
            r3 = this;
            float r0 = r3.f282v
            r1 = 1067030938(0x3f99999a, float:1.2)
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 >= 0) goto Lc
            r3.f282v = r1
            return
        Lc:
            r1 = 1073741824(0x40000000, float:2.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L14
            r3.f282v = r1
        L14:
            return
    }

    private void h() {
            r6 = this;
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1 = 0
            r2 = 0
        L7:
            n.c r3 = r6.f272l
            int r3 = r3.a()
            if (r2 >= r3) goto L3e
            n.c r3 = r6.f272l
            java.lang.Object r3 = r3.getItem(r2)
            java.lang.String r3 = r6.b(r3)
            android.graphics.Paint r4 = r6.j
            int r5 = r3.length()
            r4.getTextBounds(r3, r1, r5, r0)
            int r3 = r0.width()
            int r4 = r6.f275o
            if (r3 <= r4) goto L2c
            r6.f275o = r3
        L2c:
            android.graphics.Paint r3 = r6.j
            java.lang.String r4 = "星期"
            r5 = 2
            r3.getTextBounds(r4, r1, r5, r0)
            int r3 = r0.height()
            int r3 = r3 + r5
            r6.f276p = r3
            int r2 = r2 + 1
            goto L7
        L3e:
            float r0 = r6.f282v
            int r1 = r6.f276p
            float r1 = (float) r1
            float r0 = r0 * r1
            r6.f277q = r0
            return
    }

    private void i(java.lang.String r5) {
            r4 = this;
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.graphics.Paint r1 = r4.j
            int r2 = r5.length()
            r3 = 0
            r1.getTextBounds(r5, r3, r2, r0)
            int r5 = r4.O
            r1 = 3
            if (r5 == r1) goto L5b
            r1 = 5
            if (r5 == r1) goto L4d
            r1 = 17
            if (r5 == r1) goto L1c
            return
        L1c:
            boolean r5 = r4.f
            if (r5 != 0) goto L3d
            java.lang.String r5 = r4.f273m
            if (r5 == 0) goto L3d
            java.lang.String r1 = ""
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L2d
            goto L3d
        L2d:
            int r5 = r4.H
            int r0 = r0.width()
            int r5 = r5 - r0
            double r0 = (double) r5
            r2 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            double r0 = r0 * r2
            int r5 = (int) r0
            r4.P = r5
            return
        L3d:
            int r5 = r4.H
            int r0 = r0.width()
            int r5 = r5 - r0
            double r0 = (double) r5
            r2 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r0 = r0 * r2
            int r5 = (int) r0
            r4.P = r5
            return
        L4d:
            int r5 = r4.H
            int r0 = r0.width()
            int r5 = r5 - r0
            float r0 = r4.R
            int r0 = (int) r0
            int r5 = r5 - r0
            r4.P = r5
            return
        L5b:
            r4.P = r3
            return
    }

    private void j(java.lang.String r5) {
            r4 = this;
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.graphics.Paint r1 = r4.i
            int r2 = r5.length()
            r3 = 0
            r1.getTextBounds(r5, r3, r2, r0)
            int r5 = r4.O
            r1 = 3
            if (r5 == r1) goto L5b
            r1 = 5
            if (r5 == r1) goto L4d
            r1 = 17
            if (r5 == r1) goto L1c
            return
        L1c:
            boolean r5 = r4.f
            if (r5 != 0) goto L3d
            java.lang.String r5 = r4.f273m
            if (r5 == 0) goto L3d
            java.lang.String r1 = ""
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L2d
            goto L3d
        L2d:
            int r5 = r4.H
            int r0 = r0.width()
            int r5 = r5 - r0
            double r0 = (double) r5
            r2 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            double r0 = r0 * r2
            int r5 = (int) r0
            r4.Q = r5
            return
        L3d:
            int r5 = r4.H
            int r0 = r0.width()
            int r5 = r5 - r0
            double r0 = (double) r5
            r2 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r0 = r0 * r2
            int r5 = (int) r0
            r4.Q = r5
            return
        L4d:
            int r5 = r4.H
            int r0 = r0.width()
            int r5 = r5 - r0
            float r0 = r4.R
            int r0 = (int) r0
            int r5 = r5 - r0
            r4.Q = r5
            return
        L5b:
            r4.Q = r3
            return
    }

    private void l(java.lang.String r6) {
            r5 = this;
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.graphics.Paint r1 = r5.j
            int r2 = r6.length()
            r3 = 0
            r1.getTextBounds(r6, r3, r2, r0)
            int r1 = r0.width()
            int r2 = r5.f274n
        L15:
            int r4 = r5.H
            if (r1 <= r4) goto L2f
            int r2 = r2 + (-1)
            android.graphics.Paint r1 = r5.j
            float r4 = (float) r2
            r1.setTextSize(r4)
            android.graphics.Paint r1 = r5.j
            int r4 = r6.length()
            r1.getTextBounds(r6, r3, r4, r0)
            int r1 = r0.width()
            goto L15
        L2f:
            android.graphics.Paint r6 = r5.i
            float r0 = (float) r2
            r6.setTextSize(r0)
            return
    }

    private void m() {
            r5 = this;
            n.c r0 = r5.f272l
            if (r0 != 0) goto L5
            return
        L5:
            r5.h()
            float r0 = r5.f277q
            int r1 = r5.F
            int r1 = r1 + (-1)
            float r1 = (float) r1
            float r0 = r0 * r1
            int r0 = (int) r0
            r5.I = r0
            int r1 = r0 * 2
            double r1 = (double) r1
            r3 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r1 = r1 / r3
            int r1 = (int) r1
            r5.G = r1
            double r0 = (double) r0
            double r0 = r0 / r3
            int r0 = (int) r0
            r5.J = r0
            int r0 = r5.N
            int r0 = android.view.View.MeasureSpec.getSize(r0)
            r5.H = r0
            int r0 = r5.G
            float r1 = (float) r0
            float r2 = r5.f277q
            float r1 = r1 - r2
            r3 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r3
            r5.f284x = r1
            float r0 = (float) r0
            float r0 = r0 + r2
            float r0 = r0 / r3
            r5.f285y = r0
            int r1 = r5.f276p
            float r1 = (float) r1
            float r2 = r2 - r1
            float r2 = r2 / r3
            float r0 = r0 - r2
            float r1 = r5.R
            float r0 = r0 - r1
            r5.f286z = r0
            int r0 = r5.B
            r1 = -1
            if (r0 != r1) goto L61
            boolean r0 = r5.f283w
            if (r0 == 0) goto L5e
            n.c r0 = r5.f272l
            int r0 = r0.a()
            int r0 = r0 + 1
            int r0 = r0 / 2
            r5.B = r0
            goto L61
        L5e:
            r0 = 0
            r5.B = r0
        L61:
            int r0 = r5.B
            r5.D = r0
            return
    }

    public void a() {
            r2 = this;
            java.util.concurrent.ScheduledFuture<?> r0 = r2.h
            if (r0 == 0) goto L13
            boolean r0 = r0.isCancelled()
            if (r0 != 0) goto L13
            java.util.concurrent.ScheduledFuture<?> r0 = r2.h
            r1 = 1
            r0.cancel(r1)
            r0 = 0
            r2.h = r0
        L13:
            return
    }

    public int d(android.graphics.Paint r6, java.lang.String r7) {
            r5 = this;
            r0 = 0
            if (r7 == 0) goto L22
            int r1 = r7.length()
            if (r1 <= 0) goto L22
            int r1 = r7.length()
            float[] r2 = new float[r1]
            r6.getTextWidths(r7, r2)
            r6 = 0
        L13:
            if (r0 >= r1) goto L21
            r7 = r2[r0]
            double r3 = (double) r7
            double r3 = java.lang.Math.ceil(r3)
            int r7 = (int) r3
            int r6 = r6 + r7
            int r0 = r0 + 1
            goto L13
        L21:
            return r6
        L22:
            return r0
    }

    public final n.c getAdapter() {
            r1 = this;
            n.c r0 = r1.f272l
            return r0
    }

    public final int getCurrentItem() {
            r1 = this;
            int r0 = r1.C
            return r0
    }

    public int getItemsCount() {
            r1 = this;
            n.c r0 = r1.f272l
            if (r0 == 0) goto L9
            int r0 = r0.a()
            return r0
        L9:
            r0 = 0
            return r0
    }

    protected final void k() {
            r3 = this;
            o.c r0 = r3.e
            if (r0 == 0) goto Le
            com.bigkoo.pickerview.lib.d r0 = new com.bigkoo.pickerview.lib.d
            r0.<init>(r3)
            r1 = 200(0xc8, double:9.9E-322)
            r3.postDelayed(r0, r1)
        Le:
            return
    }

    protected final void n(float r8) {
            r7 = this;
            r7.a()
            java.util.concurrent.ScheduledExecutorService r0 = r7.g
            com.bigkoo.pickerview.lib.a r1 = new com.bigkoo.pickerview.lib.a
            r1.<init>(r7, r8)
            r4 = 5
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            r2 = 0
            java.util.concurrent.ScheduledFuture r8 = r0.scheduleWithFixedDelay(r1, r2, r4, r6)
            r7.h = r8
            return
    }

    void o(com.bigkoo.pickerview.lib.WheelView.ACTION r8) {
            r7 = this;
            r7.a()
            com.bigkoo.pickerview.lib.WheelView$ACTION r0 = com.bigkoo.pickerview.lib.WheelView.ACTION.FLING
            if (r8 == r0) goto Lb
            com.bigkoo.pickerview.lib.WheelView$ACTION r0 = com.bigkoo.pickerview.lib.WheelView.ACTION.DAGGLE
            if (r8 != r0) goto L28
        Lb:
            int r8 = r7.A
            float r8 = (float) r8
            float r0 = r7.f277q
            float r8 = r8 % r0
            float r8 = r8 + r0
            float r8 = r8 % r0
            int r8 = (int) r8
            r7.K = r8
            float r1 = (float) r8
            r2 = 1073741824(0x40000000, float:2.0)
            float r2 = r0 / r2
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L25
            float r8 = (float) r8
            float r0 = r0 - r8
            int r8 = (int) r0
            r7.K = r8
            goto L28
        L25:
            int r8 = -r8
            r7.K = r8
        L28:
            java.util.concurrent.ScheduledExecutorService r0 = r7.g
            com.bigkoo.pickerview.lib.e r1 = new com.bigkoo.pickerview.lib.e
            int r8 = r7.K
            r1.<init>(r7, r8)
            r4 = 10
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            r2 = 0
            java.util.concurrent.ScheduledFuture r8 = r0.scheduleWithFixedDelay(r1, r2, r4, r6)
            r7.h = r8
            return
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r18) {
            r17 = this;
            r0 = r17
            n.c r1 = r0.f272l
            if (r1 != 0) goto L8
            goto L2bc
        L8:
            int r2 = r0.F
            java.lang.Object[] r7 = new java.lang.Object[r2]
            int r2 = r0.A
            float r2 = (float) r2
            float r3 = r0.f277q
            float r2 = r2 / r3
            int r2 = (int) r2
            r0.E = r2
            int r3 = r0.B     // Catch: java.lang.ArithmeticException -> L20
            int r1 = r1.a()     // Catch: java.lang.ArithmeticException -> L20
            int r2 = r2 % r1
            int r3 = r3 + r2
            r0.D = r3     // Catch: java.lang.ArithmeticException -> L20
            goto L21
        L20:
        L21:
            boolean r1 = r0.f283w
            r8 = 0
            if (r1 != 0) goto L43
            int r1 = r0.D
            if (r1 >= 0) goto L2c
            r0.D = r8
        L2c:
            int r1 = r0.D
            n.c r2 = r0.f272l
            int r2 = r2.a()
            int r2 = r2 + (-1)
            if (r1 <= r2) goto L69
            n.c r1 = r0.f272l
            int r1 = r1.a()
            int r1 = r1 + (-1)
            r0.D = r1
            goto L69
        L43:
            int r1 = r0.D
            if (r1 >= 0) goto L52
            n.c r1 = r0.f272l
            int r1 = r1.a()
            int r2 = r0.D
            int r1 = r1 + r2
            r0.D = r1
        L52:
            int r1 = r0.D
            n.c r2 = r0.f272l
            int r2 = r2.a()
            int r2 = r2 + (-1)
            if (r1 <= r2) goto L69
            int r1 = r0.D
            n.c r2 = r0.f272l
            int r2 = r2.a()
            int r1 = r1 - r2
            r0.D = r1
        L69:
            int r1 = r0.A
            float r1 = (float) r1
            float r2 = r0.f277q
            float r1 = r1 % r2
            int r9 = (int) r1
            r1 = 0
        L71:
            int r2 = r0.F
            if (r1 >= r2) goto Lab
            int r3 = r0.D
            int r2 = r2 / 2
            int r2 = r2 - r1
            int r3 = r3 - r2
            boolean r2 = r0.f283w
            if (r2 == 0) goto L8c
            int r2 = r0.c(r3)
            n.c r3 = r0.f272l
            java.lang.Object r2 = r3.getItem(r2)
            r7[r1] = r2
            goto La8
        L8c:
            java.lang.String r2 = ""
            if (r3 >= 0) goto L93
            r7[r1] = r2
            goto La8
        L93:
            n.c r4 = r0.f272l
            int r4 = r4.a()
            int r4 = r4 + (-1)
            if (r3 <= r4) goto La0
            r7[r1] = r2
            goto La8
        La0:
            n.c r2 = r0.f272l
            java.lang.Object r2 = r2.getItem(r3)
            r7[r1] = r2
        La8:
            int r1 = r1 + 1
            goto L71
        Lab:
            com.bigkoo.pickerview.lib.WheelView$DividerType r1 = r0.a
            com.bigkoo.pickerview.lib.WheelView$DividerType r2 = com.bigkoo.pickerview.lib.WheelView.DividerType.WRAP
            r10 = 0
            if (r1 != r2) goto Lef
            java.lang.String r1 = r0.f273m
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto Lc5
            int r1 = r0.H
            int r2 = r0.f275o
            int r1 = r1 - r2
            int r1 = r1 / 2
        Lc1:
            int r1 = r1 + (-12)
            float r1 = (float) r1
            goto Lcd
        Lc5:
            int r1 = r0.H
            int r2 = r0.f275o
            int r1 = r1 - r2
            int r1 = r1 / 4
            goto Lc1
        Lcd:
            int r2 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r2 > 0) goto Ld6
            r1 = 1092616192(0x41200000, float:10.0)
            r2 = 1092616192(0x41200000, float:10.0)
            goto Ld7
        Ld6:
            r2 = r1
        Ld7:
            int r1 = r0.H
            float r1 = (float) r1
            float r4 = r1 - r2
            float r3 = r0.f284x
            android.graphics.Paint r6 = r0.k
            r5 = r3
            r1 = r18
            r1.drawLine(r2, r3, r4, r5, r6)
            float r3 = r0.f285y
            android.graphics.Paint r6 = r0.k
            r5 = r3
            r1.drawLine(r2, r3, r4, r5, r6)
            goto L10a
        Lef:
            float r3 = r0.f284x
            int r1 = r0.H
            float r4 = (float) r1
            android.graphics.Paint r6 = r0.k
            r2 = 0
            r5 = r3
            r1 = r18
            r1.drawLine(r2, r3, r4, r5, r6)
            float r3 = r0.f285y
            int r1 = r0.H
            float r4 = (float) r1
            android.graphics.Paint r6 = r0.k
            r5 = r3
            r1 = r18
            r1.drawLine(r2, r3, r4, r5, r6)
        L10a:
            java.lang.String r2 = r0.f273m
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L12a
            int r2 = r0.H
            android.graphics.Paint r3 = r0.j
            java.lang.String r4 = r0.f273m
            int r3 = r0.d(r3, r4)
            int r2 = r2 - r3
            java.lang.String r3 = r0.f273m
            float r2 = (float) r2
            float r4 = r0.R
            float r2 = r2 - r4
            float r4 = r0.f286z
            android.graphics.Paint r5 = r0.j
            r1.drawText(r3, r2, r4, r5)
        L12a:
            r2 = 0
        L12b:
            int r3 = r0.F
            if (r2 >= r3) goto L2bc
            r1.save()
            float r3 = r0.f277q
            float r4 = (float) r2
            float r3 = r3 * r4
            float r4 = (float) r9
            float r3 = r3 - r4
            int r4 = r0.J
            float r4 = (float) r4
            float r3 = r3 / r4
            double r3 = (double) r3
            r5 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r5 = r3 / r5
            r11 = 4640537203540230144(0x4066800000000000, double:180.0)
            double r5 = r5 * r11
            r11 = 4636033603912859648(0x4056800000000000, double:90.0)
            double r11 = r11 - r5
            float r5 = (float) r11
            r6 = 1119092736(0x42b40000, float:90.0)
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 >= 0) goto L15f
            r6 = -1028390912(0xffffffffc2b40000, float:-90.0)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 > 0) goto L164
        L15f:
            r16 = r9
            r15 = 0
            goto L2b2
        L164:
            r5 = r7[r2]
            java.lang.String r5 = r0.b(r5)
            r0.l(r5)
            r0.i(r5)
            r0.j(r5)
            int r6 = r0.J
            double r11 = (double) r6
            double r13 = java.lang.Math.cos(r3)
            int r6 = r0.J
            r16 = r9
            double r8 = (double) r6
            double r13 = r13 * r8
            double r11 = r11 - r13
            double r8 = java.lang.Math.sin(r3)
            int r6 = r0.f276p
            double r13 = (double) r6
            double r8 = r8 * r13
            r13 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r8 = r8 / r13
            double r11 = r11 - r8
            float r6 = (float) r11
            r1.translate(r10, r6)
            double r8 = java.lang.Math.sin(r3)
            float r8 = (float) r8
            r9 = 1065353216(0x3f800000, float:1.0)
            r1.scale(r9, r8)
            float r8 = r0.f284x
            r11 = 1061997773(0x3f4ccccd, float:0.8)
            int r12 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r12 > 0) goto L200
            int r12 = r0.f276p
            float r12 = (float) r12
            float r12 = r12 + r6
            int r12 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r12 < 0) goto L200
            r1.save()
            int r8 = r0.H
            float r8 = (float) r8
            float r12 = r0.f284x
            float r12 = r12 - r6
            r1.clipRect(r10, r10, r8, r12)
            double r12 = java.lang.Math.sin(r3)
            float r8 = (float) r12
            float r8 = r8 * r11
            r1.scale(r9, r8)
            int r8 = r0.Q
            float r8 = (float) r8
            int r11 = r0.f276p
            float r11 = (float) r11
            android.graphics.Paint r12 = r0.i
            r1.drawText(r5, r8, r11, r12)
            r1.restore()
            r1.save()
            float r8 = r0.f284x
            float r8 = r8 - r6
            int r6 = r0.H
            float r6 = (float) r6
            float r11 = r0.f277q
            int r11 = (int) r11
            float r11 = (float) r11
            r1.clipRect(r10, r8, r6, r11)
            double r3 = java.lang.Math.sin(r3)
            float r3 = (float) r3
            float r3 = r3 * r9
            r1.scale(r9, r3)
            int r3 = r0.P
            float r3 = (float) r3
            int r4 = r0.f276p
            float r4 = (float) r4
            float r6 = r0.R
            float r4 = r4 - r6
            android.graphics.Paint r6 = r0.j
            r1.drawText(r5, r3, r4, r6)
            r1.restore()
        L1fd:
            r15 = 0
            goto L2a6
        L200:
            float r12 = r0.f285y
            int r13 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r13 > 0) goto L25e
            int r13 = r0.f276p
            float r13 = (float) r13
            float r13 = r13 + r6
            int r13 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
            if (r13 < 0) goto L25e
            r1.save()
            int r8 = r0.H
            float r8 = (float) r8
            float r12 = r0.f285y
            float r12 = r12 - r6
            r1.clipRect(r10, r10, r8, r12)
            double r12 = java.lang.Math.sin(r3)
            float r8 = (float) r12
            float r8 = r8 * r9
            r1.scale(r9, r8)
            int r8 = r0.P
            float r8 = (float) r8
            int r12 = r0.f276p
            float r12 = (float) r12
            float r13 = r0.R
            float r12 = r12 - r13
            android.graphics.Paint r13 = r0.j
            r1.drawText(r5, r8, r12, r13)
            r1.restore()
            r1.save()
            float r8 = r0.f285y
            float r8 = r8 - r6
            int r6 = r0.H
            float r6 = (float) r6
            float r12 = r0.f277q
            int r12 = (int) r12
            float r12 = (float) r12
            r1.clipRect(r10, r8, r6, r12)
            double r3 = java.lang.Math.sin(r3)
            float r3 = (float) r3
            float r3 = r3 * r11
            r1.scale(r9, r3)
            int r3 = r0.Q
            float r3 = (float) r3
            int r4 = r0.f276p
            float r4 = (float) r4
            android.graphics.Paint r6 = r0.i
            r1.drawText(r5, r3, r4, r6)
            r1.restore()
            goto L1fd
        L25e:
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 < 0) goto L282
            int r8 = r0.f276p
            float r13 = (float) r8
            float r13 = r13 + r6
            int r6 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
            if (r6 > 0) goto L282
            float r3 = (float) r8
            float r4 = r0.R
            float r3 = r3 - r4
            int r4 = r0.P
            float r4 = (float) r4
            android.graphics.Paint r6 = r0.j
            r1.drawText(r5, r4, r3, r6)
            n.c r3 = r0.f272l
            r4 = r7[r2]
            int r3 = r3.indexOf(r4)
            r0.C = r3
            goto L1fd
        L282:
            r1.save()
            int r6 = r0.H
            float r8 = r0.f277q
            int r8 = (int) r8
            r15 = 0
            r1.clipRect(r15, r15, r6, r8)
            double r3 = java.lang.Math.sin(r3)
            float r3 = (float) r3
            float r3 = r3 * r11
            r1.scale(r9, r3)
            int r3 = r0.Q
            float r3 = (float) r3
            int r4 = r0.f276p
            float r4 = (float) r4
            android.graphics.Paint r6 = r0.i
            r1.drawText(r5, r3, r4, r6)
            r1.restore()
        L2a6:
            r1.restore()
            android.graphics.Paint r3 = r0.j
            int r4 = r0.f274n
            float r4 = (float) r4
            r3.setTextSize(r4)
            goto L2b5
        L2b2:
            r1.restore()
        L2b5:
            int r2 = r2 + 1
            r9 = r16
            r8 = 0
            goto L12b
        L2bc:
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r1, int r2) {
            r0 = this;
            r0.N = r1
            r0.m()
            int r1 = r0.H
            int r2 = r0.G
            r0.setMeasuredDimension(r1, r2)
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r13) {
            r12 = this;
            android.view.GestureDetector r0 = r12.d
            boolean r0 = r0.onTouchEvent(r13)
            int r1 = r13.getAction()
            r2 = 1
            if (r1 == 0) goto Lbd
            r3 = 2
            if (r1 == r3) goto L5c
            if (r0 != 0) goto Lcc
            float r13 = r13.getY()
            int r0 = r12.J
            float r1 = (float) r0
            float r1 = r1 - r13
            float r13 = (float) r0
            float r1 = r1 / r13
            double r0 = (double) r1
            double r0 = java.lang.Math.acos(r0)
            int r13 = r12.J
            double r4 = (double) r13
            double r0 = r0 * r4
            float r13 = r12.f277q
            r4 = 1073741824(0x40000000, float:2.0)
            float r4 = r13 / r4
            double r4 = (double) r4
            double r0 = r0 + r4
            double r4 = (double) r13
            double r0 = r0 / r4
            int r0 = (int) r0
            int r1 = r12.A
            float r1 = (float) r1
            float r1 = r1 % r13
            float r1 = r1 + r13
            float r1 = r1 % r13
            int r4 = r12.F
            int r4 = r4 / r3
            int r0 = r0 - r4
            float r0 = (float) r0
            float r0 = r0 * r13
            float r0 = r0 - r1
            int r13 = (int) r0
            r12.K = r13
            long r0 = java.lang.System.currentTimeMillis()
            long r3 = r12.M
            long r0 = r0 - r3
            r3 = 120(0x78, double:5.93E-322)
            int r13 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r13 <= 0) goto L56
            com.bigkoo.pickerview.lib.WheelView$ACTION r13 = com.bigkoo.pickerview.lib.WheelView.ACTION.DAGGLE
            r12.o(r13)
            goto Lcc
        L56:
            com.bigkoo.pickerview.lib.WheelView$ACTION r13 = com.bigkoo.pickerview.lib.WheelView.ACTION.CLICK
            r12.o(r13)
            goto Lcc
        L5c:
            float r0 = r12.L
            float r1 = r13.getRawY()
            float r0 = r0 - r1
            float r13 = r13.getRawY()
            r12.L = r13
            int r13 = r12.A
            float r13 = (float) r13
            float r13 = r13 + r0
            int r13 = (int) r13
            r12.A = r13
            boolean r13 = r12.f283w
            if (r13 != 0) goto Lcc
            int r13 = r12.B
            int r13 = -r13
            float r13 = (float) r13
            float r1 = r12.f277q
            float r13 = r13 * r1
            n.c r1 = r12.f272l
            int r1 = r1.a()
            int r1 = r1 - r2
            int r3 = r12.B
            int r1 = r1 - r3
            float r1 = (float) r1
            float r3 = r12.f277q
            float r1 = r1 * r3
            int r4 = r12.A
            double r5 = (double) r4
            double r7 = (double) r3
            r9 = 4599075939470750515(0x3fd3333333333333, double:0.3)
            double r7 = r7 * r9
            double r5 = r5 - r7
            double r7 = (double) r13
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 >= 0) goto L9f
            float r13 = (float) r4
            float r13 = r13 - r0
            goto Lab
        L9f:
            double r5 = (double) r4
            double r7 = (double) r3
            double r7 = r7 * r9
            double r5 = r5 + r7
            double r7 = (double) r1
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 <= 0) goto Lab
            float r1 = (float) r4
            float r1 = r1 - r0
        Lab:
            float r0 = (float) r4
            int r0 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r0 >= 0) goto Lb4
            int r13 = (int) r13
            r12.A = r13
            goto Lcc
        Lb4:
            float r13 = (float) r4
            int r13 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r13 <= 0) goto Lcc
            int r13 = (int) r1
            r12.A = r13
            goto Lcc
        Lbd:
            long r0 = java.lang.System.currentTimeMillis()
            r12.M = r0
            r12.a()
            float r13 = r13.getRawY()
            r12.L = r13
        Lcc:
            r12.invalidate()
            return r2
    }

    public final void setAdapter(n.c r1) {
            r0 = this;
            r0.f272l = r1
            r0.m()
            r0.invalidate()
            return
    }

    public final void setCurrentItem(int r1) {
            r0 = this;
            r0.B = r1
            r1 = 0
            r0.A = r1
            r0.invalidate()
            return
    }

    public final void setCyclic(boolean r1) {
            r0 = this;
            r0.f283w = r1
            return
    }

    public void setDividerColor(int r2) {
            r1 = this;
            if (r2 == 0) goto L9
            r1.f281u = r2
            android.graphics.Paint r0 = r1.k
            r0.setColor(r2)
        L9:
            return
    }

    public void setDividerType(com.bigkoo.pickerview.lib.WheelView.DividerType r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void setGravity(int r1) {
            r0 = this;
            r0.O = r1
            return
    }

    public void setIsOptions(boolean r1) {
            r0 = this;
            r0.f = r1
            return
    }

    public void setLabel(java.lang.String r1) {
            r0 = this;
            r0.f273m = r1
            return
    }

    public void setLineSpacingMultiplier(float r2) {
            r1 = this;
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto La
            r1.f282v = r2
            r1.g()
        La:
            return
    }

    public final void setOnItemSelectedListener(o.c r1) {
            r0 = this;
            r0.e = r1
            return
    }

    public void setTextColorCenter(int r2) {
            r1 = this;
            if (r2 == 0) goto L9
            r1.f280t = r2
            android.graphics.Paint r0 = r1.j
            r0.setColor(r2)
        L9:
            return
    }

    public void setTextColorOut(int r2) {
            r1 = this;
            if (r2 == 0) goto L9
            r1.f279s = r2
            android.graphics.Paint r0 = r1.i
            r0.setColor(r2)
        L9:
            return
    }

    public final void setTextSize(float r2) {
            r1 = this;
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L24
            android.content.Context r0 = r1.b
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r0 = r0 * r2
            int r2 = (int) r0
            r1.f274n = r2
            android.graphics.Paint r0 = r1.i
            float r2 = (float) r2
            r0.setTextSize(r2)
            android.graphics.Paint r2 = r1.j
            int r0 = r1.f274n
            float r0 = (float) r0
            r2.setTextSize(r0)
        L24:
            return
    }

    public final void setTypeface(android.graphics.Typeface r2) {
            r1 = this;
            r1.f278r = r2
            android.graphics.Paint r0 = r1.i
            r0.setTypeface(r2)
            android.graphics.Paint r2 = r1.j
            android.graphics.Typeface r0 = r1.f278r
            r2.setTypeface(r0)
            return
    }
}
