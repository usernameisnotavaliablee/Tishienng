package cn.jiguang.al;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b {
    private static java.lang.String a = "ex_stat.catch.";

    /* renamed from: b, reason: collision with root package name */
    private static java.lang.String f567b = "ex_stat.catch.";

    /* renamed from: c, reason: collision with root package name */
    private android.content.Context f568c;



    private static final class a {
        private static final cn.jiguang.al.b a = null;

        static {
                cn.jiguang.al.b r0 = new cn.jiguang.al.b
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.al.b.a.a = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.al.b a() {
                cn.jiguang.al.b r0 = cn.jiguang.al.b.a.a
                return r0
        }
    }

    static {
            return
    }

    private b() {
            r0 = this;
            r0.<init>()
            return
    }

    /* synthetic */ b(cn.jiguang.al.b.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ android.content.Context a(cn.jiguang.al.b r0) {
            android.content.Context r0 = r0.f568c
            return r0
    }

    public static cn.jiguang.al.b a() {
            cn.jiguang.al.b r0 = cn.jiguang.al.b.a.a()
            return r0
    }

    private void a(cn.jiguang.am.a r2) {
            r1 = this;
            cn.jiguang.al.b$2 r0 = new cn.jiguang.al.b$2
            r0.<init>(r1, r2)
            java.lang.String r2 = "FUTURE_TASK"
            cn.jiguang.au.d.a(r2, r0)
            return
    }

    static /* synthetic */ java.lang.String c() {
            java.lang.String r0 = cn.jiguang.al.b.f567b
            return r0
    }

    static /* synthetic */ java.lang.String d() {
            java.lang.String r0 = cn.jiguang.al.b.a
            return r0
    }

    public void a(android.content.Context r4) {
            r3 = this;
            android.content.Context r0 = r3.f568c
            if (r0 != 0) goto L33
            android.content.Context r4 = r4.getApplicationContext()
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)
            r3.f568c = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = cn.jiguang.al.b.f567b
            r4.append(r0)
            android.content.Context r0 = r3.f568c
            java.lang.String r0 = cn.jiguang.av.a.a(r0)
            android.content.Context r1 = r3.f568c
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r2 = ""
            java.lang.String r0 = r0.replace(r1, r2)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            cn.jiguang.al.b.f567b = r4
        L33:
            return
    }

    public void a(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            if (r2 == 0) goto L37
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L37
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto Lf
            goto L37
        Lf:
            cn.jiguang.e.a r0 = cn.jiguang.e.a.o()
            java.lang.Object r0 = cn.jiguang.e.b.a(r2, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L20
            return
        L20:
            java.lang.String r0 = "EX_ANR"
            boolean r4 = android.text.TextUtils.equals(r4, r0)
            if (r4 == 0) goto L2e
            cn.jiguang.ao.a r4 = new cn.jiguang.ao.a
            r4.<init>(r2, r3)
            goto L33
        L2e:
            cn.jiguang.ao.b r4 = new cn.jiguang.ao.b
            r4.<init>(r2, r3)
        L33:
            r1.a(r4)
            return
        L37:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "exception occurred for param is null, exType is "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "ExceptMonitorManager"
            cn.jiguang.w.f.i(r3, r2)
            return
    }

    public void b() {
            r7 = this;
            android.content.Context r0 = r7.f568c
            cn.jiguang.e.a r1 = cn.jiguang.e.a.d()
            java.lang.Object r0 = cn.jiguang.e.b.a(r0, r1)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r2 = 0
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto L31
            long r0 = java.lang.System.currentTimeMillis()
            android.content.Context r2 = r7.f568c
            cn.jiguang.e.a r3 = cn.jiguang.e.a.d()
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            cn.jiguang.e.a r3 = r3.a(r4)
            r4 = 1
            cn.jiguang.e.a[] r4 = new cn.jiguang.e.a[r4]
            r5 = 0
            r4[r5] = r3
            cn.jiguang.e.b.a(r2, r4)
        L31:
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r0
            r4 = 86400000(0x5265c00, double:4.2687272E-316)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L45
            java.lang.String r0 = "ExceptMonitorManager"
            java.lang.String r1 = "it not business time, interval: 86400000"
            cn.jiguang.w.f.c(r0, r1)
            return
        L45:
            cn.jiguang.al.b$1 r2 = new cn.jiguang.al.b$1
            r2.<init>(r7, r0)
            java.lang.String r0 = "FUTURE_TASK"
            cn.jiguang.au.d.a(r0, r2)
            return
    }
}
