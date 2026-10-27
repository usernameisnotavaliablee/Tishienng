package cn.jiguang.commons.H;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a extends cn.jiguang.commons.a.c {

    /* renamed from: cn.jiguang.commons.H.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0027a {
        public C0027a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    private static class b {
        private static final cn.jiguang.commons.H.a a = null;

        static {
                cn.jiguang.commons.H.a r0 = new cn.jiguang.commons.H.a
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.commons.H.a.b.a = r0
                return
        }

        public b() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.commons.H.a a() {
                cn.jiguang.commons.H.a r0 = cn.jiguang.commons.H.a.b.a
                return r0
        }
    }

    private a() {
            r0 = this;
            r0.<init>()
            return
    }

    /* synthetic */ a(cn.jiguang.commons.H.a.C0027a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static cn.jiguang.commons.H.a c() {
            cn.jiguang.commons.H.a r0 = cn.jiguang.commons.H.a.b.a()
            return r0
    }

    @Override // cn.jiguang.commons.a.c
    public java.lang.String a() {
            r1 = this;
            java.lang.String r0 = "JBattery"
            return r0
    }

    @Override // cn.jiguang.commons.a.c
    public void a(boolean r5) {
            r4 = this;
            java.lang.String r0 = "JBattery"
            cn.jiguang.commons.g.n r1 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Throwable -> L18
            java.lang.Class<cn.jiguang.commons.c.g> r2 = cn.jiguang.commons.c.g.class
            r3 = 1200(0x4b0, float:1.682E-42)
            java.lang.Object r5 = r1.a(r2, r3, r5)     // Catch: java.lang.Throwable -> L18
            cn.jiguang.commons.c.g r5 = (cn.jiguang.commons.c.g) r5     // Catch: java.lang.Throwable -> L18
            if (r5 != 0) goto L1a
            java.lang.String r5 = "battery info null, skip report"
            cn.jiguang.commons.w.a.a(r0, r5)     // Catch: java.lang.Throwable -> L18
            return
        L18:
            r5 = move-exception
            goto L30
        L1a:
            org.json.JSONObject r5 = r5.c()     // Catch: java.lang.Throwable -> L18
            java.lang.String r1 = "battery info collected"
            cn.jiguang.commons.w.a.a(r0, r1)     // Catch: java.lang.Throwable -> L18
            cn.jiguang.commons.g.p r1 = cn.jiguang.commons.g.p.e()     // Catch: java.lang.Throwable -> L18
            java.lang.String r2 = "battery"
            r1.a(r5, r2)     // Catch: java.lang.Throwable -> L18
            super.d(r0)     // Catch: java.lang.Throwable -> L18
            return
        L30:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "battery err:"
            r1.append(r2)
            java.lang.String r5 = r5.getMessage()
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            cn.jiguang.commons.w.a.f(r0, r5)
            return
    }
}
