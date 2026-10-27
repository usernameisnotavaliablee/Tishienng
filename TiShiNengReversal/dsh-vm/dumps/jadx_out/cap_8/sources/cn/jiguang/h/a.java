package cn.jiguang.h;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class a {

    /* renamed from: cn.jiguang.h.a$a, reason: collision with other inner class name */
    public class C0043a extends cn.jiguang.au.b {
        final /* synthetic */ cn.jiguang.h.a a;

        /* renamed from: b, reason: collision with root package name */
        private android.content.Context f1281b;

        /* renamed from: c, reason: collision with root package name */
        private java.lang.String f1282c;

        /* renamed from: d, reason: collision with root package name */
        private android.os.Bundle f1283d;

        C0043a(cn.jiguang.h.a r1, android.content.Context r2, java.lang.String r3, android.os.Bundle r4) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                r0.f1281b = r2
                r0.f1282c = r3
                r0.f1283d = r4
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r2 = "#BundleAction"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.f668h = r1
                return
        }

        @Override // cn.jiguang.au.b
        public void a() {
                r4 = this;
                cn.jiguang.h.a r0 = r4.a     // Catch: java.lang.Throwable -> Lc
                android.content.Context r1 = r4.f1281b     // Catch: java.lang.Throwable -> Lc
                java.lang.String r2 = r4.f1282c     // Catch: java.lang.Throwable -> Lc
                android.os.Bundle r3 = r4.f1283d     // Catch: java.lang.Throwable -> Lc
                cn.jiguang.h.a.a(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> Lc
                return
            Lc:
                r0 = move-exception
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "BundleAction failed:"
                r1.append(r2)
                java.lang.String r0 = r0.getMessage()
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                java.lang.String r1 = "JCommon"
                cn.jiguang.w.f.i(r1, r0)
                return
        }
    }

    public class b extends cn.jiguang.au.b {
        final /* synthetic */ cn.jiguang.h.a a;

        /* renamed from: b, reason: collision with root package name */
        private android.content.Context f1284b;

        /* renamed from: c, reason: collision with root package name */
        private java.lang.String f1285c;

        b(cn.jiguang.h.a r1, android.content.Context r2, java.lang.String r3) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                r0.f1284b = r2
                r0.f1285c = r3
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r2 = "#CommonAction"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.f668h = r1
                return
        }

        @Override // cn.jiguang.au.b
        public void a() {
                r3 = this;
                cn.jiguang.h.a r0 = r3.a     // Catch: java.lang.Throwable -> La
                android.content.Context r1 = r3.f1284b     // Catch: java.lang.Throwable -> La
                java.lang.String r2 = r3.f1285c     // Catch: java.lang.Throwable -> La
                cn.jiguang.h.a.a(r0, r1, r2)     // Catch: java.lang.Throwable -> La
                return
            La:
                r0 = move-exception
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "tag="
                r1.append(r2)
                java.lang.String r2 = r3.f1285c
                r1.append(r2)
                java.lang.String r2 = " dealAction failed:"
                r1.append(r2)
                java.lang.String r0 = r0.getMessage()
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                java.lang.String r1 = "JCommon"
                cn.jiguang.w.f.i(r1, r0)
                return
        }
    }

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    private void a(android.content.Context r3, java.lang.String r4, android.os.Bundle r5) {
            r2 = this;
            r2.a(r4, r5)
            boolean r5 = r2.c()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r1 = " isActionBundleEnable:"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "JCommon"
            cn.jiguang.w.f.c(r1, r0)
            if (r5 == 0) goto L28
            r2.d(r3, r4)
            r2.e(r3, r4)
        L28:
            return
    }

    static /* synthetic */ void a(cn.jiguang.h.a r0, android.content.Context r1, java.lang.String r2) {
            r0.f(r1, r2)
            return
    }

    static /* synthetic */ void a(cn.jiguang.h.a r0, android.content.Context r1, java.lang.String r2, android.os.Bundle r3) {
            r0.a(r1, r2, r3)
            return
    }

    private void f(android.content.Context r5, java.lang.String r6) {
            r4 = this;
            boolean r0 = r4.b(r5, r6)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            java.lang.String r2 = " isBusinessEnable:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "JCommon"
            cn.jiguang.w.f.c(r2, r1)
            if (r0 == 0) goto L25
            cn.jiguang.f.b.h(r6)
            r4.d(r5, r6)
        L25:
            boolean r0 = r4.c(r5, r6)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            java.lang.String r3 = " isReportEnable:"
            r1.append(r3)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            cn.jiguang.w.f.c(r2, r1)
            if (r0 == 0) goto L45
            r4.e(r5, r6)
        L45:
            return
    }

    private boolean g(android.content.Context r6, java.lang.String r7) {
            r5 = this;
            boolean r0 = r5.a()
            boolean r1 = r5.b()
            boolean r2 = r5.c(r6)
            boolean r6 = r5.a(r6, r7)
            if (r0 == 0) goto L1a
            if (r1 == 0) goto L1a
            if (r2 == 0) goto L1a
            if (r6 == 0) goto L1a
            r3 = 1
            goto L1b
        L1a:
            r3 = 0
        L1b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r7)
            java.lang.String r7 = " isActionEnable:"
            r4.append(r7)
            r4.append(r3)
            java.lang.String r7 = ",actionUserEnable:"
            r4.append(r7)
            r4.append(r0)
            java.lang.String r7 = ",actionCommandEnable:"
            r4.append(r7)
            r4.append(r1)
            java.lang.String r7 = ",actionUidEnable:"
            r4.append(r7)
            r4.append(r2)
            java.lang.String r7 = ",actionProtectionEnable:"
            r4.append(r7)
            r4.append(r6)
            java.lang.String r6 = r4.toString()
            java.lang.String r7 = "JCommon"
            cn.jiguang.w.f.c(r7, r6)
            return r3
    }

    public void a(android.content.Context r8) {
            r7 = this;
            java.lang.String r0 = "JCommon"
            java.lang.String r1 = r7.b(r8)     // Catch: java.lang.Throwable -> L61
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L61
            r2.<init>()     // Catch: java.lang.Throwable -> L61
            java.lang.String r3 = "executeAction: ["
            r2.append(r3)     // Catch: java.lang.Throwable -> L61
            r2.append(r1)     // Catch: java.lang.Throwable -> L61
            java.lang.String r3 = "] from heartBeat"
            r2.append(r3)     // Catch: java.lang.Throwable -> L61
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L61
            cn.jiguang.w.f.c(r0, r2)     // Catch: java.lang.Throwable -> L61
            boolean r2 = r7.g(r8, r1)     // Catch: java.lang.Throwable -> L61
            boolean r3 = r7.b(r8, r1)     // Catch: java.lang.Throwable -> L61
            boolean r4 = r7.c(r8, r1)     // Catch: java.lang.Throwable -> L61
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L61
            r5.<init>()     // Catch: java.lang.Throwable -> L61
            r5.append(r1)     // Catch: java.lang.Throwable -> L61
            java.lang.String r6 = " - isActionEnable:"
            r5.append(r6)     // Catch: java.lang.Throwable -> L61
            r5.append(r2)     // Catch: java.lang.Throwable -> L61
            java.lang.String r6 = ", isBusinessEnable:"
            r5.append(r6)     // Catch: java.lang.Throwable -> L61
            r5.append(r3)     // Catch: java.lang.Throwable -> L61
            java.lang.String r6 = ", reportEnable:"
            r5.append(r6)     // Catch: java.lang.Throwable -> L61
            r5.append(r4)     // Catch: java.lang.Throwable -> L61
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L61
            cn.jiguang.w.f.c(r0, r5)     // Catch: java.lang.Throwable -> L61
            if (r2 == 0) goto L63
            if (r3 != 0) goto L58
            if (r4 == 0) goto L63
        L58:
            cn.jiguang.h.a$b r2 = new cn.jiguang.h.a$b     // Catch: java.lang.Throwable -> L61
            r2.<init>(r7, r8, r1)     // Catch: java.lang.Throwable -> L61
            cn.jiguang.z.b.a(r2)     // Catch: java.lang.Throwable -> L61
            return
        L61:
            r8 = move-exception
            goto L64
        L63:
            return
        L64:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "executeAction failed, error:"
            r1.append(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            cn.jiguang.w.f.c(r0, r8)
            return
    }

    public void a(android.content.Context r6, android.os.Bundle r7) {
            r5 = this;
            java.lang.String r0 = r5.b(r6)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "executeBundleAction: ["
            r1.append(r2)
            r1.append(r0)
            java.lang.String r2 = "] from bundle"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "JCommon"
            cn.jiguang.w.f.c(r2, r1)
            boolean r1 = r5.a()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r4 = " isActionUserEnable:"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            cn.jiguang.w.f.c(r2, r3)
            if (r1 == 0) goto L44
            cn.jiguang.h.a$a r1 = new cn.jiguang.h.a$a
            r1.<init>(r5, r6, r0, r7)
            cn.jiguang.z.b.a(r1)
        L44:
            return
    }

    protected void a(java.lang.String r2, android.os.Bundle r3) {
            r1 = this;
            if (r3 == 0) goto L1f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = " parseJson:"
            r0.append(r2)
            java.lang.String r2 = r3.toString()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r3 = "JCommon"
            cn.jiguang.w.f.c(r3, r2)
        L1f:
            return
    }

    protected boolean a() {
            r1 = this;
            r0 = 1
            return r0
    }

    protected boolean a(android.content.Context r5, java.lang.String r6) {
            r4 = this;
            long r0 = cn.jiguang.d.b.b(r5)
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            long r2 = cn.jiguang.f.b.g(r6)
            long r5 = cn.jiguang.d.a.g(r5)
            long r0 = r0 - r5
            long r5 = java.lang.Math.abs(r0)
            java.lang.String r0 = "JCommon"
            int r1 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r1 >= 0) goto L22
            java.lang.String r5 = "isProtectionTime is false"
            cn.jiguang.w.f.c(r0, r5)
            r5 = 0
            return r5
        L22:
            java.lang.String r5 = "isProtectionTime is true"
            cn.jiguang.w.f.c(r0, r5)
            r5 = 1
            return r5
    }

    protected abstract java.lang.String b(android.content.Context r1);

    protected boolean b() {
            r1 = this;
            r0 = 1
            return r0
    }

    protected boolean b(android.content.Context r1, java.lang.String r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    protected boolean c() {
            r1 = this;
            r0 = 1
            return r0
    }

    protected boolean c(android.content.Context r5) {
            r4 = this;
            long r0 = cn.jiguang.d.a.f(r5)
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto Lc
            r5 = 1
            return r5
        Lc:
            r5 = 0
            return r5
    }

    protected boolean c(android.content.Context r1, java.lang.String r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    protected void d(android.content.Context r1, java.lang.String r2) {
            r0 = this;
            cn.jiguang.h.b.b(r1, r2)
            return
    }

    protected void e(android.content.Context r1, java.lang.String r2) {
            r0 = this;
            cn.jiguang.h.b.e(r1, r2)
            return
    }
}
