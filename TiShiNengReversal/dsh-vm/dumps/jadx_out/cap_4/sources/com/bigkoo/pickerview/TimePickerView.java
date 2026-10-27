package com.bigkoo.pickerview;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class TimePickerView extends com.bigkoo.pickerview.view.a implements android.view.View.OnClickListener {
    private static final java.lang.String J0 = "submit";
    private static final java.lang.String K0 = "cancel";
    private android.widget.Button A;
    private android.widget.TextView B;
    private com.bigkoo.pickerview.TimePickerView.b C;
    private int D;
    private com.bigkoo.pickerview.TimePickerView.Type E;
    private java.lang.String F;
    private java.lang.String F0;
    private java.lang.String G;
    private java.lang.String G0;
    private java.lang.String H;
    private java.lang.String H0;
    private int I;
    private com.bigkoo.pickerview.lib.WheelView.DividerType I0;
    private int J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private int P;
    private java.util.Calendar Q;
    private java.util.Calendar R;
    private java.util.Calendar S;
    private int T;
    private int U;
    private boolean V;
    private boolean W;
    private int X;
    private int Y;
    private int Z;
    private float a0;
    private boolean b0;
    private java.lang.String c0;

    /* renamed from: k0, reason: collision with root package name */
    private java.lang.String f230k0;

    /* renamed from: p0, reason: collision with root package name */
    private java.lang.String f231p0;

    /* renamed from: w, reason: collision with root package name */
    private int f232w;

    /* renamed from: x, reason: collision with root package name */
    private o.a f233x;

    /* renamed from: y, reason: collision with root package name */
    com.bigkoo.pickerview.view.c f234y;

    /* renamed from: z, reason: collision with root package name */
    private android.widget.Button f235z;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum Type extends java.lang.Enum<com.bigkoo.pickerview.TimePickerView.Type> {
        private static final /* synthetic */ com.bigkoo.pickerview.TimePickerView.Type[] $VALUES = null;
        public static final com.bigkoo.pickerview.TimePickerView.Type ALL = null;
        public static final com.bigkoo.pickerview.TimePickerView.Type HOURS_MINS = null;
        public static final com.bigkoo.pickerview.TimePickerView.Type MONTH_DAY_HOUR_MIN = null;
        public static final com.bigkoo.pickerview.TimePickerView.Type YEAR_MONTH = null;
        public static final com.bigkoo.pickerview.TimePickerView.Type YEAR_MONTH_DAY = null;
        public static final com.bigkoo.pickerview.TimePickerView.Type YEAR_MONTH_DAY_HOUR_MIN = null;

        static {
                com.bigkoo.pickerview.TimePickerView$Type r0 = new com.bigkoo.pickerview.TimePickerView$Type
                java.lang.String r1 = "ALL"
                r2 = 0
                r0.<init>(r1, r2)
                com.bigkoo.pickerview.TimePickerView.Type.ALL = r0
                com.bigkoo.pickerview.TimePickerView$Type r1 = new com.bigkoo.pickerview.TimePickerView$Type
                java.lang.String r3 = "YEAR_MONTH_DAY"
                r4 = 1
                r1.<init>(r3, r4)
                com.bigkoo.pickerview.TimePickerView.Type.YEAR_MONTH_DAY = r1
                com.bigkoo.pickerview.TimePickerView$Type r3 = new com.bigkoo.pickerview.TimePickerView$Type
                java.lang.String r5 = "HOURS_MINS"
                r6 = 2
                r3.<init>(r5, r6)
                com.bigkoo.pickerview.TimePickerView.Type.HOURS_MINS = r3
                com.bigkoo.pickerview.TimePickerView$Type r5 = new com.bigkoo.pickerview.TimePickerView$Type
                java.lang.String r7 = "MONTH_DAY_HOUR_MIN"
                r8 = 3
                r5.<init>(r7, r8)
                com.bigkoo.pickerview.TimePickerView.Type.MONTH_DAY_HOUR_MIN = r5
                com.bigkoo.pickerview.TimePickerView$Type r7 = new com.bigkoo.pickerview.TimePickerView$Type
                java.lang.String r9 = "YEAR_MONTH"
                r10 = 4
                r7.<init>(r9, r10)
                com.bigkoo.pickerview.TimePickerView.Type.YEAR_MONTH = r7
                com.bigkoo.pickerview.TimePickerView$Type r9 = new com.bigkoo.pickerview.TimePickerView$Type
                java.lang.String r11 = "YEAR_MONTH_DAY_HOUR_MIN"
                r12 = 5
                r9.<init>(r11, r12)
                com.bigkoo.pickerview.TimePickerView.Type.YEAR_MONTH_DAY_HOUR_MIN = r9
                r11 = 6
                com.bigkoo.pickerview.TimePickerView$Type[] r11 = new com.bigkoo.pickerview.TimePickerView.Type[r11]
                r11[r2] = r0
                r11[r4] = r1
                r11[r6] = r3
                r11[r8] = r5
                r11[r10] = r7
                r11[r12] = r9
                com.bigkoo.pickerview.TimePickerView.Type.$VALUES = r11
                return
        }

        Type(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.bigkoo.pickerview.TimePickerView.Type valueOf(java.lang.String r1) {
                java.lang.Class<com.bigkoo.pickerview.TimePickerView$Type> r0 = com.bigkoo.pickerview.TimePickerView.Type.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.bigkoo.pickerview.TimePickerView$Type r1 = (com.bigkoo.pickerview.TimePickerView.Type) r1
                return r1
        }

        public static com.bigkoo.pickerview.TimePickerView.Type[] values() {
                com.bigkoo.pickerview.TimePickerView$Type[] r0 = com.bigkoo.pickerview.TimePickerView.Type.$VALUES
                java.lang.Object r0 = r0.clone()
                com.bigkoo.pickerview.TimePickerView$Type[] r0 = (com.bigkoo.pickerview.TimePickerView.Type[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a {
        private int A;
        private com.bigkoo.pickerview.lib.WheelView.DividerType B;
        private float C;
        private boolean D;
        private java.lang.String E;
        private java.lang.String F;
        private java.lang.String G;
        private java.lang.String H;
        private java.lang.String I;
        private java.lang.String J;
        private int a;
        private o.a b;
        private android.content.Context c;
        private com.bigkoo.pickerview.TimePickerView.b d;
        private com.bigkoo.pickerview.TimePickerView.Type e;
        private int f;
        private java.lang.String g;
        private java.lang.String h;
        private java.lang.String i;
        private int j;
        private int k;

        /* renamed from: l, reason: collision with root package name */
        private int f236l;

        /* renamed from: m, reason: collision with root package name */
        private int f237m;

        /* renamed from: n, reason: collision with root package name */
        private int f238n;

        /* renamed from: o, reason: collision with root package name */
        private int f239o;

        /* renamed from: p, reason: collision with root package name */
        private int f240p;

        /* renamed from: q, reason: collision with root package name */
        private int f241q;

        /* renamed from: r, reason: collision with root package name */
        private java.util.Calendar f242r;

        /* renamed from: s, reason: collision with root package name */
        private java.util.Calendar f243s;

        /* renamed from: t, reason: collision with root package name */
        private java.util.Calendar f244t;

        /* renamed from: u, reason: collision with root package name */
        private int f245u;

        /* renamed from: v, reason: collision with root package name */
        private int f246v;

        /* renamed from: w, reason: collision with root package name */
        private boolean f247w;

        /* renamed from: x, reason: collision with root package name */
        private boolean f248x;

        /* renamed from: y, reason: collision with root package name */
        private int f249y;

        /* renamed from: z, reason: collision with root package name */
        private int f250z;

        public a(android.content.Context r2, com.bigkoo.pickerview.TimePickerView.b r3) {
                r1 = this;
                r1.<init>()
                int r0 = com.bigkoo.pickerview.R.layout.pickerview_time
                r1.a = r0
                com.bigkoo.pickerview.TimePickerView$Type r0 = com.bigkoo.pickerview.TimePickerView.Type.ALL
                r1.e = r0
                r0 = 17
                r1.f = r0
                r1.f239o = r0
                r0 = 18
                r1.f240p = r0
                r1.f241q = r0
                r0 = 0
                r1.f247w = r0
                r0 = 1
                r1.f248x = r0
                r0 = 1070386381(0x3fcccccd, float:1.6)
                r1.C = r0
                r1.c = r2
                r1.d = r3
                return
        }

        static /* synthetic */ int A(com.bigkoo.pickerview.TimePickerView.a r0) {
                int r0 = r0.a
                return r0
        }

        static /* synthetic */ float B(com.bigkoo.pickerview.TimePickerView.a r0) {
                float r0 = r0.C
                return r0
        }

        static /* synthetic */ boolean C(com.bigkoo.pickerview.TimePickerView.a r0) {
                boolean r0 = r0.D
                return r0
        }

        static /* synthetic */ com.bigkoo.pickerview.lib.WheelView.DividerType D(com.bigkoo.pickerview.TimePickerView.a r0) {
                com.bigkoo.pickerview.lib.WheelView$DividerType r0 = r0.B
                return r0
        }

        static /* synthetic */ java.lang.String E(com.bigkoo.pickerview.TimePickerView.a r0) {
                java.lang.String r0 = r0.g
                return r0
        }

        static /* synthetic */ java.lang.String F(com.bigkoo.pickerview.TimePickerView.a r0) {
                java.lang.String r0 = r0.h
                return r0
        }

        static /* synthetic */ java.lang.String G(com.bigkoo.pickerview.TimePickerView.a r0) {
                java.lang.String r0 = r0.i
                return r0
        }

        static /* synthetic */ int H(com.bigkoo.pickerview.TimePickerView.a r0) {
                int r0 = r0.j
                return r0
        }

        static /* synthetic */ int I(com.bigkoo.pickerview.TimePickerView.a r0) {
                int r0 = r0.k
                return r0
        }

        static /* synthetic */ int J(com.bigkoo.pickerview.TimePickerView.a r0) {
                int r0 = r0.f236l
                return r0
        }

        static /* synthetic */ android.content.Context a(com.bigkoo.pickerview.TimePickerView.a r0) {
                android.content.Context r0 = r0.c
                return r0
        }

        static /* synthetic */ com.bigkoo.pickerview.TimePickerView.b b(com.bigkoo.pickerview.TimePickerView.a r0) {
                com.bigkoo.pickerview.TimePickerView$b r0 = r0.d
                return r0
        }

        static /* synthetic */ int c(com.bigkoo.pickerview.TimePickerView.a r0) {
                int r0 = r0.f237m
                return r0
        }

        static /* synthetic */ int d(com.bigkoo.pickerview.TimePickerView.a r0) {
                int r0 = r0.f238n
                return r0
        }

        static /* synthetic */ int e(com.bigkoo.pickerview.TimePickerView.a r0) {
                int r0 = r0.f239o
                return r0
        }

        static /* synthetic */ int f(com.bigkoo.pickerview.TimePickerView.a r0) {
                int r0 = r0.f240p
                return r0
        }

        static /* synthetic */ int g(com.bigkoo.pickerview.TimePickerView.a r0) {
                int r0 = r0.f241q
                return r0
        }

        static /* synthetic */ int h(com.bigkoo.pickerview.TimePickerView.a r0) {
                int r0 = r0.f245u
                return r0
        }

        static /* synthetic */ int i(com.bigkoo.pickerview.TimePickerView.a r0) {
                int r0 = r0.f246v
                return r0
        }

        static /* synthetic */ java.util.Calendar j(com.bigkoo.pickerview.TimePickerView.a r0) {
                java.util.Calendar r0 = r0.f243s
                return r0
        }

        static /* synthetic */ java.util.Calendar k(com.bigkoo.pickerview.TimePickerView.a r0) {
                java.util.Calendar r0 = r0.f244t
                return r0
        }

        static /* synthetic */ java.util.Calendar l(com.bigkoo.pickerview.TimePickerView.a r0) {
                java.util.Calendar r0 = r0.f242r
                return r0
        }

        static /* synthetic */ int m(com.bigkoo.pickerview.TimePickerView.a r0) {
                int r0 = r0.f
                return r0
        }

        static /* synthetic */ boolean n(com.bigkoo.pickerview.TimePickerView.a r0) {
                boolean r0 = r0.f247w
                return r0
        }

        static /* synthetic */ boolean o(com.bigkoo.pickerview.TimePickerView.a r0) {
                boolean r0 = r0.f248x
                return r0
        }

        static /* synthetic */ java.lang.String p(com.bigkoo.pickerview.TimePickerView.a r0) {
                java.lang.String r0 = r0.E
                return r0
        }

        static /* synthetic */ java.lang.String q(com.bigkoo.pickerview.TimePickerView.a r0) {
                java.lang.String r0 = r0.F
                return r0
        }

        static /* synthetic */ java.lang.String r(com.bigkoo.pickerview.TimePickerView.a r0) {
                java.lang.String r0 = r0.G
                return r0
        }

        static /* synthetic */ java.lang.String s(com.bigkoo.pickerview.TimePickerView.a r0) {
                java.lang.String r0 = r0.H
                return r0
        }

        static /* synthetic */ java.lang.String t(com.bigkoo.pickerview.TimePickerView.a r0) {
                java.lang.String r0 = r0.I
                return r0
        }

        static /* synthetic */ java.lang.String u(com.bigkoo.pickerview.TimePickerView.a r0) {
                java.lang.String r0 = r0.J
                return r0
        }

        static /* synthetic */ int v(com.bigkoo.pickerview.TimePickerView.a r0) {
                int r0 = r0.f250z
                return r0
        }

        static /* synthetic */ int w(com.bigkoo.pickerview.TimePickerView.a r0) {
                int r0 = r0.f249y
                return r0
        }

        static /* synthetic */ com.bigkoo.pickerview.TimePickerView.Type x(com.bigkoo.pickerview.TimePickerView.a r0) {
                com.bigkoo.pickerview.TimePickerView$Type r0 = r0.e
                return r0
        }

        static /* synthetic */ int y(com.bigkoo.pickerview.TimePickerView.a r0) {
                int r0 = r0.A
                return r0
        }

        static /* synthetic */ o.a z(com.bigkoo.pickerview.TimePickerView.a r0) {
                o.a r0 = r0.b
                return r0
        }

        public com.bigkoo.pickerview.TimePickerView K() {
                r1 = this;
                com.bigkoo.pickerview.TimePickerView r0 = new com.bigkoo.pickerview.TimePickerView
                r0.<init>(r1)
                return r0
        }

        public com.bigkoo.pickerview.TimePickerView.a L(int r1) {
                r0 = this;
                r0.f = r1
                return r0
        }

        public com.bigkoo.pickerview.TimePickerView.a M(boolean r1) {
                r0 = this;
                r0.f247w = r1
                return r0
        }

        public com.bigkoo.pickerview.TimePickerView.a N(boolean r1) {
                r0 = this;
                r0.D = r1
                return r0
        }

        public com.bigkoo.pickerview.TimePickerView.a O(int r1) {
                r0 = this;
                r0.f237m = r1
                return r0
        }

        public com.bigkoo.pickerview.TimePickerView.a P(int r1) {
                r0 = this;
                r0.k = r1
                return r0
        }

        public com.bigkoo.pickerview.TimePickerView.a Q(java.lang.String r1) {
                r0 = this;
                r0.h = r1
                return r0
        }

        public com.bigkoo.pickerview.TimePickerView.a R(int r1) {
                r0 = this;
                r0.f241q = r1
                return r0
        }

        public com.bigkoo.pickerview.TimePickerView.a S(java.util.Calendar r1) {
                r0 = this;
                r0.f242r = r1
                return r0
        }

        public com.bigkoo.pickerview.TimePickerView.a T(int r1) {
                r0 = this;
                r0.A = r1
                return r0
        }

        public com.bigkoo.pickerview.TimePickerView.a U(com.bigkoo.pickerview.lib.WheelView.DividerType r1) {
                r0 = this;
                r0.B = r1
                return r0
        }

        public com.bigkoo.pickerview.TimePickerView.a V(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
                r0 = this;
                r0.E = r1
                r0.F = r2
                r0.G = r3
                r0.H = r4
                r0.I = r5
                r0.J = r6
                return r0
        }

        public com.bigkoo.pickerview.TimePickerView.a W(int r1, o.a r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                return r0
        }

        public com.bigkoo.pickerview.TimePickerView.a X(float r1) {
                r0 = this;
                r0.C = r1
                return r0
        }

        public com.bigkoo.pickerview.TimePickerView.a Y(boolean r1) {
                r0 = this;
                r0.f248x = r1
                return r0
        }

        public com.bigkoo.pickerview.TimePickerView.a Z(java.util.Calendar r1, java.util.Calendar r2) {
                r0 = this;
                r0.f243s = r1
                r0.f244t = r2
                return r0
        }

        public com.bigkoo.pickerview.TimePickerView.a a0(int r1, int r2) {
                r0 = this;
                r0.f245u = r1
                r0.f246v = r2
                return r0
        }

        public com.bigkoo.pickerview.TimePickerView.a b0(int r1) {
                r0 = this;
                r0.f239o = r1
                return r0
        }

        public com.bigkoo.pickerview.TimePickerView.a c0(int r1) {
                r0 = this;
                r0.j = r1
                return r0
        }

        public com.bigkoo.pickerview.TimePickerView.a d0(java.lang.String r1) {
                r0 = this;
                r0.g = r1
                return r0
        }

        public com.bigkoo.pickerview.TimePickerView.a e0(int r1) {
                r0 = this;
                r0.f250z = r1
                return r0
        }

        public com.bigkoo.pickerview.TimePickerView.a f0(int r1) {
                r0 = this;
                r0.f249y = r1
                return r0
        }

        public com.bigkoo.pickerview.TimePickerView.a g0(int r1) {
                r0 = this;
                r0.f238n = r1
                return r0
        }

        public com.bigkoo.pickerview.TimePickerView.a h0(int r1) {
                r0 = this;
                r0.f236l = r1
                return r0
        }

        public com.bigkoo.pickerview.TimePickerView.a i0(int r1) {
                r0 = this;
                r0.f240p = r1
                return r0
        }

        public com.bigkoo.pickerview.TimePickerView.a j0(java.lang.String r1) {
                r0 = this;
                r0.i = r1
                return r0
        }

        public com.bigkoo.pickerview.TimePickerView.a k0(com.bigkoo.pickerview.TimePickerView.Type r1) {
                r0 = this;
                r0.e = r1
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b {
        void a(java.util.Date r1, android.view.View r2);
    }

    public TimePickerView(com.bigkoo.pickerview.TimePickerView.a r2) {
            r1 = this;
            android.content.Context r0 = com.bigkoo.pickerview.TimePickerView.a.a(r2)
            r1.<init>(r0)
            r0 = 17
            r1.D = r0
            r0 = 1070386381(0x3fcccccd, float:1.6)
            r1.a0 = r0
            com.bigkoo.pickerview.TimePickerView$b r0 = com.bigkoo.pickerview.TimePickerView.a.b(r2)
            r1.C = r0
            int r0 = com.bigkoo.pickerview.TimePickerView.a.m(r2)
            r1.D = r0
            com.bigkoo.pickerview.TimePickerView$Type r0 = com.bigkoo.pickerview.TimePickerView.a.x(r2)
            r1.E = r0
            java.lang.String r0 = com.bigkoo.pickerview.TimePickerView.a.E(r2)
            r1.F = r0
            java.lang.String r0 = com.bigkoo.pickerview.TimePickerView.a.F(r2)
            r1.G = r0
            java.lang.String r0 = com.bigkoo.pickerview.TimePickerView.a.G(r2)
            r1.H = r0
            int r0 = com.bigkoo.pickerview.TimePickerView.a.H(r2)
            r1.I = r0
            int r0 = com.bigkoo.pickerview.TimePickerView.a.I(r2)
            r1.J = r0
            int r0 = com.bigkoo.pickerview.TimePickerView.a.J(r2)
            r1.K = r0
            int r0 = com.bigkoo.pickerview.TimePickerView.a.c(r2)
            r1.L = r0
            int r0 = com.bigkoo.pickerview.TimePickerView.a.d(r2)
            r1.M = r0
            int r0 = com.bigkoo.pickerview.TimePickerView.a.e(r2)
            r1.N = r0
            int r0 = com.bigkoo.pickerview.TimePickerView.a.f(r2)
            r1.O = r0
            int r0 = com.bigkoo.pickerview.TimePickerView.a.g(r2)
            r1.P = r0
            int r0 = com.bigkoo.pickerview.TimePickerView.a.h(r2)
            r1.T = r0
            int r0 = com.bigkoo.pickerview.TimePickerView.a.i(r2)
            r1.U = r0
            java.util.Calendar r0 = com.bigkoo.pickerview.TimePickerView.a.j(r2)
            r1.R = r0
            java.util.Calendar r0 = com.bigkoo.pickerview.TimePickerView.a.k(r2)
            r1.S = r0
            java.util.Calendar r0 = com.bigkoo.pickerview.TimePickerView.a.l(r2)
            r1.Q = r0
            boolean r0 = com.bigkoo.pickerview.TimePickerView.a.n(r2)
            r1.V = r0
            boolean r0 = com.bigkoo.pickerview.TimePickerView.a.o(r2)
            r1.W = r0
            java.lang.String r0 = com.bigkoo.pickerview.TimePickerView.a.p(r2)
            r1.c0 = r0
            java.lang.String r0 = com.bigkoo.pickerview.TimePickerView.a.q(r2)
            r1.f230k0 = r0
            java.lang.String r0 = com.bigkoo.pickerview.TimePickerView.a.r(r2)
            r1.f231p0 = r0
            java.lang.String r0 = com.bigkoo.pickerview.TimePickerView.a.s(r2)
            r1.F0 = r0
            java.lang.String r0 = com.bigkoo.pickerview.TimePickerView.a.t(r2)
            r1.G0 = r0
            java.lang.String r0 = com.bigkoo.pickerview.TimePickerView.a.u(r2)
            r1.H0 = r0
            int r0 = com.bigkoo.pickerview.TimePickerView.a.v(r2)
            r1.Y = r0
            int r0 = com.bigkoo.pickerview.TimePickerView.a.w(r2)
            r1.X = r0
            int r0 = com.bigkoo.pickerview.TimePickerView.a.y(r2)
            r1.Z = r0
            o.a r0 = com.bigkoo.pickerview.TimePickerView.a.z(r2)
            r1.f233x = r0
            int r0 = com.bigkoo.pickerview.TimePickerView.a.A(r2)
            r1.f232w = r0
            float r0 = com.bigkoo.pickerview.TimePickerView.a.B(r2)
            r1.a0 = r0
            boolean r0 = com.bigkoo.pickerview.TimePickerView.a.C(r2)
            r1.b0 = r0
            com.bigkoo.pickerview.lib.WheelView$DividerType r0 = com.bigkoo.pickerview.TimePickerView.a.D(r2)
            r1.I0 = r0
            android.content.Context r2 = com.bigkoo.pickerview.TimePickerView.a.a(r2)
            r1.w(r2)
            return
    }

    private void A() {
            r2 = this;
            com.bigkoo.pickerview.view.c r0 = r2.f234y
            int r1 = r2.T
            r0.C(r1)
            com.bigkoo.pickerview.view.c r0 = r2.f234y
            int r1 = r2.U
            r0.u(r1)
            return
    }

    private void B() {
            r14 = this;
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            java.util.Calendar r1 = r14.Q
            r2 = 13
            r3 = 12
            r4 = 11
            r5 = 5
            r6 = 2
            r7 = 1
            if (r1 != 0) goto L37
            long r8 = java.lang.System.currentTimeMillis()
            r0.setTimeInMillis(r8)
            int r1 = r0.get(r7)
            int r6 = r0.get(r6)
            int r5 = r0.get(r5)
            int r4 = r0.get(r4)
            int r3 = r0.get(r3)
            int r0 = r0.get(r2)
        L30:
            r13 = r0
            r8 = r1
            r12 = r3
            r11 = r4
            r10 = r5
            r9 = r6
            goto L5a
        L37:
            int r1 = r1.get(r7)
            java.util.Calendar r0 = r14.Q
            int r6 = r0.get(r6)
            java.util.Calendar r0 = r14.Q
            int r5 = r0.get(r5)
            java.util.Calendar r0 = r14.Q
            int r4 = r0.get(r4)
            java.util.Calendar r0 = r14.Q
            int r3 = r0.get(r3)
            java.util.Calendar r0 = r14.Q
            int r0 = r0.get(r2)
            goto L30
        L5a:
            com.bigkoo.pickerview.view.c r7 = r14.f234y
            r7.z(r8, r9, r10, r11, r12, r13)
            return
    }

    private void w(android.content.Context r8) {
            r7 = this;
            boolean r0 = r7.W
            r7.p(r0)
            r7.l()
            r7.j()
            r7.k()
            o.a r0 = r7.f233x
            if (r0 != 0) goto Le4
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r8)
            int r1 = com.bigkoo.pickerview.R.layout.pickerview_time
            android.view.ViewGroup r2 = r7.c
            r0.inflate(r1, r2)
            int r0 = com.bigkoo.pickerview.R.id.tvTitle
            android.view.View r0 = r7.g(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r7.B = r0
            int r0 = com.bigkoo.pickerview.R.id.btnSubmit
            android.view.View r0 = r7.g(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r7.f235z = r0
            int r0 = com.bigkoo.pickerview.R.id.btnCancel
            android.view.View r0 = r7.g(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r7.A = r0
            android.widget.Button r0 = r7.f235z
            java.lang.String r1 = "submit"
            r0.setTag(r1)
            android.widget.Button r0 = r7.A
            java.lang.String r1 = "cancel"
            r0.setTag(r1)
            android.widget.Button r0 = r7.f235z
            r0.setOnClickListener(r7)
            android.widget.Button r0 = r7.A
            r0.setOnClickListener(r7)
            android.widget.Button r0 = r7.f235z
            java.lang.String r1 = r7.F
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L68
            android.content.res.Resources r1 = r8.getResources()
            int r2 = com.bigkoo.pickerview.R.string.pickerview_submit
            java.lang.String r1 = r1.getString(r2)
            goto L6a
        L68:
            java.lang.String r1 = r7.F
        L6a:
            r0.setText(r1)
            android.widget.Button r0 = r7.A
            java.lang.String r1 = r7.G
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L82
            android.content.res.Resources r8 = r8.getResources()
            int r1 = com.bigkoo.pickerview.R.string.pickerview_cancel
            java.lang.String r8 = r8.getString(r1)
            goto L84
        L82:
            java.lang.String r8 = r7.G
        L84:
            r0.setText(r8)
            android.widget.TextView r8 = r7.B
            java.lang.String r0 = r7.H
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L94
            java.lang.String r0 = ""
            goto L96
        L94:
            java.lang.String r0 = r7.H
        L96:
            r8.setText(r0)
            android.widget.Button r8 = r7.f235z
            int r0 = r7.I
            if (r0 != 0) goto La1
            int r0 = r7.g
        La1:
            r8.setTextColor(r0)
            android.widget.Button r8 = r7.A
            int r0 = r7.J
            if (r0 != 0) goto Lac
            int r0 = r7.g
        Lac:
            r8.setTextColor(r0)
            android.widget.TextView r8 = r7.B
            int r0 = r7.K
            if (r0 != 0) goto Lb7
            int r0 = r7.j
        Lb7:
            r8.setTextColor(r0)
            android.widget.Button r8 = r7.f235z
            int r0 = r7.N
            float r0 = (float) r0
            r8.setTextSize(r0)
            android.widget.Button r8 = r7.A
            int r0 = r7.N
            float r0 = (float) r0
            r8.setTextSize(r0)
            android.widget.TextView r8 = r7.B
            int r0 = r7.O
            float r0 = (float) r0
            r8.setTextSize(r0)
            int r8 = com.bigkoo.pickerview.R.id.rv_topbar
            android.view.View r8 = r7.g(r8)
            android.widget.RelativeLayout r8 = (android.widget.RelativeLayout) r8
            int r0 = r7.M
            if (r0 != 0) goto Le0
            int r0 = r7.i
        Le0:
            r8.setBackgroundColor(r0)
            goto Lf3
        Le4:
            android.view.LayoutInflater r8 = android.view.LayoutInflater.from(r8)
            int r1 = r7.f232w
            android.view.ViewGroup r2 = r7.c
            android.view.View r8 = r8.inflate(r1, r2)
            r0.a(r8)
        Lf3:
            int r8 = com.bigkoo.pickerview.R.id.timepicker
            android.view.View r8 = r7.g(r8)
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            int r0 = r7.L
            if (r0 != 0) goto L101
            int r0 = r7.k
        L101:
            r8.setBackgroundColor(r0)
            com.bigkoo.pickerview.view.c r0 = new com.bigkoo.pickerview.view.c
            com.bigkoo.pickerview.TimePickerView$Type r1 = r7.E
            int r2 = r7.D
            int r3 = r7.P
            r0.<init>(r8, r1, r2, r3)
            r7.f234y = r0
            int r8 = r7.T
            if (r8 == 0) goto L11e
            int r0 = r7.U
            if (r0 == 0) goto L11e
            if (r8 > r0) goto L11e
            r7.A()
        L11e:
            java.util.Calendar r8 = r7.R
            if (r8 == 0) goto L138
            java.util.Calendar r0 = r7.S
            if (r0 == 0) goto L138
            long r0 = r8.getTimeInMillis()
            java.util.Calendar r8 = r7.S
            long r2 = r8.getTimeInMillis()
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 > 0) goto L14b
            r7.z()
            goto L14b
        L138:
            if (r8 == 0) goto L142
            java.util.Calendar r0 = r7.S
            if (r0 != 0) goto L142
            r7.z()
            goto L14b
        L142:
            if (r8 != 0) goto L14b
            java.util.Calendar r8 = r7.S
            if (r8 == 0) goto L14b
            r7.z()
        L14b:
            r7.B()
            com.bigkoo.pickerview.view.c r0 = r7.f234y
            java.lang.String r1 = r7.c0
            java.lang.String r2 = r7.f230k0
            java.lang.String r3 = r7.f231p0
            java.lang.String r4 = r7.F0
            java.lang.String r5 = r7.G0
            java.lang.String r6 = r7.H0
            r0.v(r1, r2, r3, r4, r5, r6)
            boolean r8 = r7.W
            r7.s(r8)
            com.bigkoo.pickerview.view.c r8 = r7.f234y
            boolean r0 = r7.V
            r8.p(r0)
            com.bigkoo.pickerview.view.c r8 = r7.f234y
            int r0 = r7.Z
            r8.r(r0)
            com.bigkoo.pickerview.view.c r8 = r7.f234y
            com.bigkoo.pickerview.lib.WheelView$DividerType r0 = r7.I0
            r8.t(r0)
            com.bigkoo.pickerview.view.c r8 = r7.f234y
            float r0 = r7.a0
            r8.x(r0)
            com.bigkoo.pickerview.view.c r8 = r7.f234y
            int r0 = r7.X
            r8.G(r0)
            com.bigkoo.pickerview.view.c r8 = r7.f234y
            int r0 = r7.Y
            r8.E(r0)
            return
    }

    private void z() {
            r5 = this;
            com.bigkoo.pickerview.view.c r0 = r5.f234y
            java.util.Calendar r1 = r5.R
            java.util.Calendar r2 = r5.S
            r0.A(r1, r2)
            java.util.Calendar r0 = r5.R
            if (r0 == 0) goto L38
            java.util.Calendar r1 = r5.S
            if (r1 == 0) goto L38
            java.util.Calendar r0 = r5.Q
            if (r0 == 0) goto L33
            long r0 = r0.getTimeInMillis()
            java.util.Calendar r2 = r5.R
            long r2 = r2.getTimeInMillis()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L33
            java.util.Calendar r0 = r5.Q
            long r0 = r0.getTimeInMillis()
            java.util.Calendar r2 = r5.S
            long r2 = r2.getTimeInMillis()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L43
        L33:
            java.util.Calendar r0 = r5.R
            r5.Q = r0
            return
        L38:
            if (r0 == 0) goto L3d
            r5.Q = r0
            return
        L3d:
            java.util.Calendar r0 = r5.S
            if (r0 == 0) goto L43
            r5.Q = r0
        L43:
            return
    }

    @Override // com.bigkoo.pickerview.view.a
    public boolean m() {
            r1 = this;
            boolean r0 = r1.b0
            return r0
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r2) {
            r1 = this;
            java.lang.Object r2 = r2.getTag()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r0 = "cancel"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L12
            r1.d()
            return
        L12:
            r1.x()
            return
    }

    public void x() {
            r3 = this;
            com.bigkoo.pickerview.TimePickerView$b r0 = r3.C
            if (r0 == 0) goto L17
            java.text.DateFormat r0 = com.bigkoo.pickerview.view.c.f304w     // Catch: java.text.ParseException -> L17
            com.bigkoo.pickerview.view.c r1 = r3.f234y     // Catch: java.text.ParseException -> L17
            java.lang.String r1 = r1.m()     // Catch: java.text.ParseException -> L17
            java.util.Date r0 = r0.parse(r1)     // Catch: java.text.ParseException -> L17
            com.bigkoo.pickerview.TimePickerView$b r1 = r3.C     // Catch: java.text.ParseException -> L17
            android.view.View r2 = r3.f295t     // Catch: java.text.ParseException -> L17
            r1.a(r0, r2)     // Catch: java.text.ParseException -> L17
        L17:
            r3.d()
            return
    }

    public void y(java.util.Calendar r1) {
            r0 = this;
            r0.Q = r1
            r0.B()
            return
    }
}
