package cn.jpush.android.u;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class b {
    protected cn.jpush.android.u.b.a a;

    /* renamed from: b, reason: collision with root package name */
    protected cn.jpush.android.d.d f1919b;

    /* renamed from: c, reason: collision with root package name */
    protected cn.jpush.android.t.a f1920c;

    /* renamed from: d, reason: collision with root package name */
    protected android.content.Context f1921d;

    /* renamed from: e, reason: collision with root package name */
    protected int f1922e;

    /* renamed from: f, reason: collision with root package name */
    private cn.jpush.android.s.c f1923f;




    public interface a {
        void a(android.content.Context r1, android.view.View r2);

        void a(android.content.Context r1, android.view.View r2, java.lang.Object r3);
    }

    public b(android.content.Context r1, cn.jpush.android.t.a r2, cn.jpush.android.d.d r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.f1920c = r2
            r0.f1919b = r3
            r0.f1921d = r1
            r0.f1922e = r4
            return
    }

    public static cn.jpush.android.u.b a(android.content.Context r1, cn.jpush.android.t.a r2, cn.jpush.android.d.d r3, int r4) {
            r0 = 10
            if (r4 == r0) goto L30
            r0 = 11
            if (r4 == r0) goto L30
            r0 = 20
            if (r4 == r0) goto L2a
            r0 = 21
            if (r4 == r0) goto L2a
            r0 = 30
            if (r4 == r0) goto L24
            r0 = 31
            if (r4 == r0) goto L24
            r0 = 40
            if (r4 == r0) goto L1e
            r1 = 0
            return r1
        L1e:
            cn.jpush.android.u.f r0 = new cn.jpush.android.u.f
            r0.<init>(r1, r2, r3, r4)
            return r0
        L24:
            cn.jpush.android.u.c r0 = new cn.jpush.android.u.c
            r0.<init>(r1, r2, r3, r4)
            return r0
        L2a:
            cn.jpush.android.u.d r0 = new cn.jpush.android.u.d
            r0.<init>(r1, r2, r3, r4)
            return r0
        L30:
            cn.jpush.android.u.a r0 = new cn.jpush.android.u.a
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    private void a(android.view.View r8) {
            r7 = this;
            android.content.Context r0 = r7.f1921d
            r1 = 94
            int r0 = cn.jpush.android.ad.m.a(r0, r1)
            android.graphics.Point r2 = new android.graphics.Point
            int r0 = -r0
            r1 = 0
            r2.<init>(r1, r0)
            android.graphics.Point r3 = new android.graphics.Point
            r3.<init>(r1, r1)
            cn.jpush.android.t.a r0 = r7.f1920c
            float r0 = r0.f()
            long r4 = (long) r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "slideIntoView startPoint: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = ", endPoint: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = ", toShowTime: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "BaseInAppWrapper"
            cn.jpush.android.helper.Logger.d(r1, r0)
            cn.jpush.android.u.b$1 r6 = new cn.jpush.android.u.b$1
            r6.<init>(r7, r8)
            r1 = r8
            cn.jpush.android.r.a.a(r1, r2, r3, r4, r6)
            return
    }

    private void b(android.view.View r8) {
            r7 = this;
            cn.jpush.android.s.c r0 = r7.f1923f
            if (r0 != 0) goto Lb
            cn.jpush.android.s.c r0 = new cn.jpush.android.s.c
            r0.<init>()
            r7.f1923f = r0
        Lb:
            cn.jpush.android.t.a r0 = r7.f1920c
            float r0 = r0.e()
            cn.jpush.android.t.a r1 = r7.f1920c
            float r1 = r1.f()
            float r0 = r0 + r1
            long r3 = (long) r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "configAutoDismiss autoTickTime: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "BaseInAppWrapper"
            cn.jpush.android.helper.Logger.d(r1, r0)
            cn.jpush.android.s.c r1 = r7.f1923f
            cn.jpush.android.u.b$2 r2 = new cn.jpush.android.u.b$2
            r2.<init>(r7, r8)
            r5 = 1000(0x3e8, double:4.94E-321)
            r1.a(r2, r3, r5)
            return
    }

    private void c(android.view.View r5) {
            r4 = this;
            cn.jpush.android.s.b r0 = new cn.jpush.android.s.b
            cn.jpush.android.d.d r1 = r4.f1919b
            int r1 = r1.aH
            cn.jpush.android.u.b$3 r2 = new cn.jpush.android.u.b$3
            r2.<init>(r4)
            r3 = 0
            r0.<init>(r4, r3, r1, r2)
            r5.setOnTouchListener(r0)
            return
    }

    public static boolean c(int r1) {
            r0 = 10
            if (r0 == r1) goto Lb
            r0 = 11
            if (r0 != r1) goto L9
            goto Lb
        L9:
            r1 = 0
            return r1
        Lb:
            r1 = 1
            return r1
    }

    public int a(int r2) {
            r1 = this;
            android.content.Context r0 = r1.f1921d
            int r2 = cn.jpush.android.ad.m.b(r0, r2)
            return r2
    }

    public void a(cn.jpush.android.u.b.a r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public int b(int r2) {
            r1 = this;
            android.content.Context r0 = r1.f1921d
            int r2 = cn.jpush.android.ad.m.c(r0, r2)
            return r2
    }

    public abstract void c();

    public abstract void d();

    public abstract android.view.View e();

    public abstract boolean f();

    public abstract void g();

    public void h() {
            r5 = this;
            java.lang.String r0 = "BaseInAppWrapper"
            android.view.View r1 = r5.e()     // Catch: java.lang.Throwable -> L29
            cn.jpush.android.t.a r2 = r5.k()     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto L2b
            if (r1 != 0) goto Lf
            goto L2b
        Lf:
            r5.a(r1)     // Catch: java.lang.Throwable -> L29
            int r2 = r5.f1922e     // Catch: java.lang.Throwable -> L29
            r3 = 10
            if (r3 == r2) goto L22
            r3 = 11
            if (r3 == r2) goto L22
            r3 = 40
            if (r3 != r2) goto L21
            goto L22
        L21:
            return
        L22:
            r5.c(r1)     // Catch: java.lang.Throwable -> L29
            r5.b(r1)     // Catch: java.lang.Throwable -> L29
            return
        L29:
            r1 = move-exception
            goto L48
        L2b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L29
            r3.<init>()     // Catch: java.lang.Throwable -> L29
            java.lang.String r4 = "startViewAnimation param is null, view:"
            r3.append(r4)     // Catch: java.lang.Throwable -> L29
            r3.append(r1)     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = "config:"
            r3.append(r1)     // Catch: java.lang.Throwable -> L29
            r3.append(r2)     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L29
            cn.jpush.android.helper.Logger.w(r0, r1)     // Catch: java.lang.Throwable -> L29
            return
        L48:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "start in-app with animation error. "
            r2.append(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            cn.jpush.android.helper.Logger.w(r0, r1)
            return
    }

    protected void i() {
            r1 = this;
            cn.jpush.android.s.c r0 = r1.f1923f
            if (r0 == 0) goto L7
            r0.a()
        L7:
            return
    }

    public cn.jpush.android.d.d j() {
            r1 = this;
            cn.jpush.android.d.d r0 = r1.f1919b
            return r0
    }

    public cn.jpush.android.t.a k() {
            r1 = this;
            cn.jpush.android.t.a r0 = r1.f1920c
            return r0
    }
}
