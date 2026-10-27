package cn.bluemobi.dylan.base.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class t {

    /* renamed from: h, reason: collision with root package name */
    public static final int f126h = -1728053248;

    /* renamed from: i, reason: collision with root package name */
    private static java.lang.String f127i;
    private final cn.bluemobi.dylan.base.utils.t.b a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f128b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f129c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f130d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f131e;

    /* renamed from: f, reason: collision with root package name */
    private android.view.View f132f;

    /* renamed from: g, reason: collision with root package name */
    private android.view.View f133g;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class b {

        /* renamed from: j, reason: collision with root package name */
        private static final java.lang.String f134j = "status_bar_height";

        /* renamed from: k, reason: collision with root package name */
        private static final java.lang.String f135k = "navigation_bar_height";
        private static final java.lang.String l = "navigation_bar_height_landscape";
        private static final java.lang.String m = "navigation_bar_width";
        private static final java.lang.String n = "config_showNavigationBar";
        private final boolean a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f136b;

        /* renamed from: c, reason: collision with root package name */
        private final int f137c;

        /* renamed from: d, reason: collision with root package name */
        private final int f138d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f139e;

        /* renamed from: f, reason: collision with root package name */
        private final int f140f;

        /* renamed from: g, reason: collision with root package name */
        private final int f141g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f142h;

        /* renamed from: i, reason: collision with root package name */
        private final float f143i;

        private b(android.app.Activity r5, boolean r6, boolean r7) {
                r4 = this;
                r4.<init>()
                android.content.res.Resources r0 = r5.getResources()
                android.content.res.Configuration r1 = r0.getConfiguration()
                int r1 = r1.orientation
                r2 = 0
                r3 = 1
                if (r1 != r3) goto L13
                r1 = 1
                goto L14
            L13:
                r1 = 0
            L14:
                r4.f142h = r1
                float r1 = r4.k(r5)
                r4.f143i = r1
                java.lang.String r1 = "status_bar_height"
                int r0 = r4.c(r0, r1)
                r4.f137c = r0
                int r0 = r4.b(r5)
                r4.f138d = r0
                int r0 = r4.e(r5)
                r4.f140f = r0
                int r5 = r4.g(r5)
                r4.f141g = r5
                if (r0 <= 0) goto L39
                r2 = 1
            L39:
                r4.f139e = r2
                r4.a = r6
                r4.f136b = r7
                return
        }

        /* synthetic */ b(android.app.Activity r1, boolean r2, boolean r3, cn.bluemobi.dylan.base.utils.t.a r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        @android.annotation.TargetApi(14)
        private int b(android.content.Context r5) {
                r4 = this;
                android.util.TypedValue r0 = new android.util.TypedValue
                r0.<init>()
                android.content.res.Resources$Theme r1 = r5.getTheme()
                r2 = 16843499(0x10102eb, float:2.3695652E-38)
                r3 = 1
                r1.resolveAttribute(r2, r0, r3)
                int r0 = r0.data
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                int r5 = android.util.TypedValue.complexToDimensionPixelSize(r0, r5)
                return r5
        }

        private int c(android.content.res.Resources r3, java.lang.String r4) {
                r2 = this;
                java.lang.String r0 = "dimen"
                java.lang.String r1 = "android"
                int r4 = r3.getIdentifier(r4, r0, r1)
                if (r4 <= 0) goto Lf
                int r3 = r3.getDimensionPixelSize(r4)
                return r3
            Lf:
                r3 = 0
                return r3
        }

        @android.annotation.TargetApi(14)
        private int e(android.content.Context r2) {
                r1 = this;
                android.content.res.Resources r0 = r2.getResources()
                boolean r2 = r1.m(r2)
                if (r2 == 0) goto L18
                boolean r2 = r1.f142h
                if (r2 == 0) goto L11
                java.lang.String r2 = "navigation_bar_height"
                goto L13
            L11:
                java.lang.String r2 = "navigation_bar_height_landscape"
            L13:
                int r2 = r1.c(r0, r2)
                return r2
            L18:
                r2 = 0
                return r2
        }

        @android.annotation.TargetApi(14)
        private int g(android.content.Context r2) {
                r1 = this;
                android.content.res.Resources r0 = r2.getResources()
                boolean r2 = r1.m(r2)
                if (r2 == 0) goto L11
                java.lang.String r2 = "navigation_bar_width"
                int r2 = r1.c(r0, r2)
                return r2
            L11:
                r2 = 0
                return r2
        }

        @android.annotation.SuppressLint({"NewApi"})
        private float k(android.app.Activity r3) {
                r2 = this;
                android.util.DisplayMetrics r0 = new android.util.DisplayMetrics
                r0.<init>()
                android.view.WindowManager r3 = r3.getWindowManager()
                android.view.Display r3 = r3.getDefaultDisplay()
                r3.getRealMetrics(r0)
                int r3 = r0.widthPixels
                float r3 = (float) r3
                float r1 = r0.density
                float r3 = r3 / r1
                int r0 = r0.heightPixels
                float r0 = (float) r0
                float r0 = r0 / r1
                float r3 = java.lang.Math.min(r3, r0)
                return r3
        }

        @android.annotation.TargetApi(14)
        private boolean m(android.content.Context r5) {
                r4 = this;
                android.content.res.Resources r0 = r5.getResources()
                java.lang.String r1 = "bool"
                java.lang.String r2 = "android"
                java.lang.String r3 = "config_showNavigationBar"
                int r1 = r0.getIdentifier(r3, r1, r2)
                r2 = 1
                if (r1 == 0) goto L31
                boolean r5 = r0.getBoolean(r1)
                java.lang.String r0 = "1"
                java.lang.String r1 = cn.bluemobi.dylan.base.utils.t.a()
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L23
                r5 = 0
                return r5
            L23:
                java.lang.String r0 = "0"
                java.lang.String r1 = cn.bluemobi.dylan.base.utils.t.a()
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L30
                return r2
            L30:
                return r5
            L31:
                android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
                boolean r5 = r5.hasPermanentMenuKey()
                r5 = r5 ^ r2
                return r5
        }

        public int a() {
                r1 = this;
                int r0 = r1.f138d
                return r0
        }

        public int d() {
                r1 = this;
                int r0 = r1.f140f
                return r0
        }

        public int f() {
                r1 = this;
                int r0 = r1.f141g
                return r0
        }

        public int h() {
                r1 = this;
                boolean r0 = r1.f136b
                if (r0 == 0) goto Ld
                boolean r0 = r1.o()
                if (r0 == 0) goto Ld
                int r0 = r1.f140f
                return r0
            Ld:
                r0 = 0
                return r0
        }

        public int i() {
                r1 = this;
                boolean r0 = r1.f136b
                if (r0 == 0) goto Ld
                boolean r0 = r1.o()
                if (r0 != 0) goto Ld
                int r0 = r1.f141g
                return r0
            Ld:
                r0 = 0
                return r0
        }

        public int j(boolean r3) {
                r2 = this;
                boolean r0 = r2.a
                r1 = 0
                if (r0 == 0) goto L8
                int r0 = r2.f137c
                goto L9
            L8:
                r0 = 0
            L9:
                if (r3 == 0) goto Ld
                int r1 = r2.f138d
            Ld:
                int r0 = r0 + r1
                return r0
        }

        public int l() {
                r1 = this;
                int r0 = r1.f137c
                return r0
        }

        public boolean n() {
                r1 = this;
                boolean r0 = r1.f139e
                return r0
        }

        public boolean o() {
                r2 = this;
                float r0 = r2.f143i
                r1 = 1142292480(0x44160000, float:600.0)
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 >= 0) goto Lf
                boolean r0 = r2.f142h
                if (r0 == 0) goto Ld
                goto Lf
            Ld:
                r0 = 0
                return r0
            Lf:
                r0 = 1
                return r0
        }
    }

    static {
            r0 = 0
            java.lang.String r1 = "android.os.SystemProperties"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L27
            java.lang.String r2 = "get"
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L27
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r6 = 0
            r4[r6] = r5     // Catch: java.lang.Throwable -> L27
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r4)     // Catch: java.lang.Throwable -> L27
            r1.setAccessible(r3)     // Catch: java.lang.Throwable -> L27
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L27
            java.lang.String r3 = "qemu.hw.mainkeys"
            r2[r6] = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r1 = r1.invoke(r0, r2)     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L27
            cn.bluemobi.dylan.base.utils.t.f127i = r1     // Catch: java.lang.Throwable -> L27
            return
        L27:
            cn.bluemobi.dylan.base.utils.t.f127i = r0
            return
    }

    @android.annotation.TargetApi(19)
    public t(android.app.Activity r6) {
            r5 = this;
            r5.<init>()
            android.view.Window r0 = r6.getWindow()
            android.view.View r1 = r0.getDecorView()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r2 = 16843759(0x10103ef, float:2.369638E-38)
            r3 = 16843760(0x10103f0, float:2.3696383E-38)
            int[] r2 = new int[]{r2, r3}
            android.content.res.TypedArray r2 = r6.obtainStyledAttributes(r2)
            r2.recycle()
            android.view.WindowManager$LayoutParams r0 = r0.getAttributes()
            int r0 = r0.flags
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            r2 = r2 & r0
            r3 = 1
            if (r2 == 0) goto L2c
            r5.f128b = r3
        L2c:
            r2 = 134217728(0x8000000, float:3.85186E-34)
            r0 = r0 & r2
            if (r0 == 0) goto L33
            r5.f129c = r3
        L33:
            cn.bluemobi.dylan.base.utils.t$b r0 = new cn.bluemobi.dylan.base.utils.t$b
            boolean r2 = r5.f128b
            boolean r3 = r5.f129c
            r4 = 0
            r0.<init>(r6, r2, r3, r4)
            r5.a = r0
            boolean r0 = r0.n()
            if (r0 != 0) goto L48
            r0 = 0
            r5.f129c = r0
        L48:
            boolean r0 = r5.f128b
            if (r0 == 0) goto L4f
            r5.t(r6, r1)
        L4f:
            boolean r0 = r5.f129c
            if (r0 == 0) goto L56
            r5.s(r6, r1)
        L56:
            return
    }

    static /* synthetic */ java.lang.String a() {
            java.lang.String r0 = cn.bluemobi.dylan.base.utils.t.f127i
            return r0
    }

    private void s(android.content.Context r3, android.view.ViewGroup r4) {
            r2 = this;
            android.view.View r0 = new android.view.View
            r0.<init>(r3)
            r2.f133g = r0
            cn.bluemobi.dylan.base.utils.t$b r3 = r2.a
            boolean r3 = r3.o()
            r0 = -1
            if (r3 == 0) goto L20
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            cn.bluemobi.dylan.base.utils.t$b r1 = r2.a
            int r1 = r1.d()
            r3.<init>(r0, r1)
            r0 = 80
            r3.gravity = r0
            goto L2e
        L20:
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            cn.bluemobi.dylan.base.utils.t$b r1 = r2.a
            int r1 = r1.f()
            r3.<init>(r1, r0)
            r0 = 5
            r3.gravity = r0
        L2e:
            android.view.View r0 = r2.f133g
            r0.setLayoutParams(r3)
            android.view.View r3 = r2.f133g
            r0 = -1728053248(0xffffffff99000000, float:-6.617445E-24)
            r3.setBackgroundColor(r0)
            android.view.View r3 = r2.f133g
            r0 = 8
            r3.setVisibility(r0)
            android.view.View r3 = r2.f133g
            r4.addView(r3)
            return
    }

    private void t(android.content.Context r3, android.view.ViewGroup r4) {
            r2 = this;
            android.view.View r0 = new android.view.View
            r0.<init>(r3)
            r2.f132f = r0
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            cn.bluemobi.dylan.base.utils.t$b r0 = r2.a
            int r0 = r0.l()
            r1 = -1
            r3.<init>(r1, r0)
            r0 = 48
            r3.gravity = r0
            boolean r0 = r2.f129c
            if (r0 == 0) goto L2b
            cn.bluemobi.dylan.base.utils.t$b r0 = r2.a
            boolean r0 = r0.o()
            if (r0 != 0) goto L2b
            cn.bluemobi.dylan.base.utils.t$b r0 = r2.a
            int r0 = r0.f()
            r3.rightMargin = r0
        L2b:
            android.view.View r0 = r2.f132f
            r0.setLayoutParams(r3)
            android.view.View r3 = r2.f132f
            r0 = -1728053248(0xffffffff99000000, float:-6.617445E-24)
            r3.setBackgroundColor(r0)
            android.view.View r3 = r2.f132f
            r0 = 8
            r3.setVisibility(r0)
            android.view.View r3 = r2.f132f
            r4.addView(r3)
            return
    }

    public cn.bluemobi.dylan.base.utils.t.b b() {
            r1 = this;
            cn.bluemobi.dylan.base.utils.t$b r0 = r1.a
            return r0
    }

    public boolean c() {
            r1 = this;
            boolean r0 = r1.f131e
            return r0
    }

    public boolean d() {
            r1 = this;
            boolean r0 = r1.f130d
            return r0
    }

    @android.annotation.TargetApi(11)
    public void e(float r2) {
            r1 = this;
            boolean r0 = r1.f129c
            if (r0 == 0) goto L9
            android.view.View r0 = r1.f133g
            r0.setAlpha(r2)
        L9:
            return
    }

    public void f(int r2) {
            r1 = this;
            boolean r0 = r1.f129c
            if (r0 == 0) goto L9
            android.view.View r0 = r1.f133g
            r0.setBackgroundColor(r2)
        L9:
            return
    }

    public void g(android.graphics.drawable.Drawable r2) {
            r1 = this;
            boolean r0 = r1.f129c
            if (r0 == 0) goto L9
            android.view.View r0 = r1.f133g
            r0.setBackgroundDrawable(r2)
        L9:
            return
    }

    public void h(boolean r2) {
            r1 = this;
            r1.f131e = r2
            boolean r0 = r1.f129c
            if (r0 == 0) goto L11
            android.view.View r0 = r1.f133g
            if (r2 == 0) goto Lc
            r2 = 0
            goto Le
        Lc:
            r2 = 8
        Le:
            r0.setVisibility(r2)
        L11:
            return
    }

    public void i(int r2) {
            r1 = this;
            boolean r0 = r1.f129c
            if (r0 == 0) goto L9
            android.view.View r0 = r1.f133g
            r0.setBackgroundResource(r2)
        L9:
            return
    }

    @android.annotation.TargetApi(11)
    public void j(float r2) {
            r1 = this;
            boolean r0 = r1.f128b
            if (r0 == 0) goto L9
            android.view.View r0 = r1.f132f
            r0.setAlpha(r2)
        L9:
            return
    }

    public void k(int r2) {
            r1 = this;
            boolean r0 = r1.f128b
            if (r0 == 0) goto L9
            android.view.View r0 = r1.f132f
            r0.setBackgroundColor(r2)
        L9:
            return
    }

    public void l(android.graphics.drawable.Drawable r2) {
            r1 = this;
            boolean r0 = r1.f128b
            if (r0 == 0) goto L9
            android.view.View r0 = r1.f132f
            r0.setBackgroundDrawable(r2)
        L9:
            return
    }

    public void m(boolean r2) {
            r1 = this;
            r1.f130d = r2
            boolean r0 = r1.f128b
            if (r0 == 0) goto L11
            android.view.View r0 = r1.f132f
            if (r2 == 0) goto Lc
            r2 = 0
            goto Le
        Lc:
            r2 = 8
        Le:
            r0.setVisibility(r2)
        L11:
            return
    }

    public void n(int r2) {
            r1 = this;
            boolean r0 = r1.f128b
            if (r0 == 0) goto L9
            android.view.View r0 = r1.f132f
            r0.setBackgroundResource(r2)
        L9:
            return
    }

    public void o(float r1) {
            r0 = this;
            r0.j(r1)
            r0.e(r1)
            return
    }

    public void p(int r1) {
            r0 = this;
            r0.k(r1)
            r0.f(r1)
            return
    }

    public void q(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.l(r1)
            r0.g(r1)
            return
    }

    public void r(int r1) {
            r0 = this;
            r0.n(r1)
            r0.i(r1)
            return
    }
}
