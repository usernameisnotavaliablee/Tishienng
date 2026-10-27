package cn.jiguang.commons.E;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class j extends cn.jiguang.commons.a.c {

    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    private static class b {
        private static final cn.jiguang.commons.E.j a = null;

        static {
                cn.jiguang.commons.E.j r0 = new cn.jiguang.commons.E.j
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.commons.E.j.b.a = r0
                return
        }

        public b() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.commons.E.j a() {
                cn.jiguang.commons.E.j r0 = cn.jiguang.commons.E.j.b.a
                return r0
        }
    }

    private j() {
            r0 = this;
            r0.<init>()
            return
    }

    /* synthetic */ j(cn.jiguang.commons.E.j.a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    private java.util.List a(boolean r1, int r2) {
            r0 = this;
            if (r2 > 0) goto L4
            r1 = 0
            return r1
        L4:
            java.util.List r1 = r0.d(r1, r2)
            return r1
    }

    private org.json.JSONArray a(java.util.List r4, boolean r5) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L30
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto La
            goto L30
        La:
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            java.util.Iterator r4 = r4.iterator()
        L13:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r4.next()
            org.json.JSONObject r2 = r3.a(r2, r5)     // Catch: java.lang.Exception -> L27
            if (r2 == 0) goto L13
            r1.put(r2)     // Catch: java.lang.Exception -> L27
            goto L13
        L27:
            goto L13
        L29:
            int r4 = r1.length()
            if (r4 <= 0) goto L30
            r0 = r1
        L30:
            return r0
    }

    private org.json.JSONObject a(java.lang.Object r4, boolean r5) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            r1 = 128(0x80, float:1.8E-43)
            if (r5 == 0) goto L13
            boolean r2 = r4 instanceof cn.jiguang.commons.c.e     // Catch: java.lang.Exception -> L20
            if (r2 == 0) goto L13
            cn.jiguang.commons.c.e r4 = (cn.jiguang.commons.c.e) r4     // Catch: java.lang.Exception -> L20
            org.json.JSONObject r4 = r4.e(r1)     // Catch: java.lang.Exception -> L20
            return r4
        L13:
            if (r5 != 0) goto L20
            boolean r5 = r4 instanceof cn.jiguang.commons.c.l     // Catch: java.lang.Exception -> L20
            if (r5 == 0) goto L20
            cn.jiguang.commons.c.l r4 = (cn.jiguang.commons.c.l) r4     // Catch: java.lang.Exception -> L20
            org.json.JSONObject r4 = r4.a(r1)     // Catch: java.lang.Exception -> L20
            return r4
        L20:
            return r0
    }

    private org.json.JSONObject a(java.util.List r6, java.util.List r7) {
            r5 = this;
            r0 = 0
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L32
            r1.<init>()     // Catch: org.json.JSONException -> L32
            r2 = 1
            org.json.JSONArray r6 = r5.a(r6, r2)     // Catch: org.json.JSONException -> L32
            r3 = 0
            if (r6 == 0) goto L1b
            int r4 = r6.length()     // Catch: org.json.JSONException -> L32
            if (r4 <= 0) goto L1b
            java.lang.String r4 = "app"
            r1.put(r4, r6)     // Catch: org.json.JSONException -> L32
            r6 = 1
            goto L1c
        L1b:
            r6 = 0
        L1c:
            org.json.JSONArray r7 = r5.a(r7, r3)     // Catch: org.json.JSONException -> L32
            if (r7 == 0) goto L2e
            int r3 = r7.length()     // Catch: org.json.JSONException -> L32
            if (r3 <= 0) goto L2e
            java.lang.String r6 = "process"
            r1.put(r6, r7)     // Catch: org.json.JSONException -> L32
            goto L2f
        L2e:
            r2 = r6
        L2f:
            if (r2 == 0) goto L32
            return r1
        L32:
            return r0
    }

    public static void a(int r2) {
            cn.jiguang.commons.L.ac r0 = cn.jiguang.commons.L.ac.a()
            java.lang.String r1 = "rrat"
            r0.c(r1, r2)
            return
    }

    private boolean a(cn.jiguang.commons.c.e r1) {
            r0 = this;
            if (r1 == 0) goto Lc
            java.lang.String r1 = r1.f1007c
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    private boolean a(cn.jiguang.commons.c.l r1) {
            r0 = this;
            if (r1 == 0) goto Lc
            java.lang.String r1 = r1.f1060e
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    public static cn.jiguang.commons.E.j c() {
            cn.jiguang.commons.E.j r0 = cn.jiguang.commons.E.j.b.a()
            return r0
    }

    private java.util.List c(boolean r2, int r3) {
            r1 = this;
            if (r3 > 0) goto L4
            r2 = 0
            return r2
        L4:
            cn.jiguang.commons.g.n r3 = cn.jiguang.commons.g.n.a()
            r0 = 1102(0x44e, float:1.544E-42)
            java.util.List r2 = r3.c(r0, r2)
            return r2
    }

    public static void c(int r2) {
            cn.jiguang.commons.L.ac r0 = cn.jiguang.commons.L.ac.a()
            java.lang.String r1 = "rrpt"
            r0.c(r1, r2)
            return
    }

    public static int d() {
            cn.jiguang.commons.L.ac r0 = cn.jiguang.commons.L.ac.a()
            java.lang.String r1 = "rrat"
            r2 = 1
            int r0 = r0.a(r1, r2)
            return r0
    }

    private java.util.List d(boolean r4, int r5) {
            r3 = this;
            cn.jiguang.commons.g.n r5 = cn.jiguang.commons.g.n.a()
            r0 = 1102(0x44e, float:1.544E-42)
            java.util.List r5 = r5.c(r0, r4)
            if (r5 == 0) goto L5f
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L13
            goto L5f
        L13:
            cn.jiguang.commons.g.n r0 = cn.jiguang.commons.g.n.a()
            r1 = 1100(0x44c, float:1.541E-42)
            java.util.List r4 = r0.c(r1, r4)
            if (r4 == 0) goto L59
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L26
            goto L59
        L26:
            java.util.Map r4 = r3.a(r4)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L33:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L53
            java.lang.Object r1 = r5.next()
            cn.jiguang.commons.c.l r1 = (cn.jiguang.commons.c.l) r1
            boolean r2 = r3.a(r1)
            if (r2 == 0) goto L33
            java.lang.String r1 = r1.f1060e
            java.lang.Object r1 = r4.get(r1)
            cn.jiguang.commons.c.e r1 = (cn.jiguang.commons.c.e) r1
            if (r1 == 0) goto L33
            r0.add(r1)
            goto L33
        L53:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            return r4
        L59:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            return r4
        L5f:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            return r4
    }

    public static int e() {
            cn.jiguang.commons.L.ac r0 = cn.jiguang.commons.L.ac.a()
            java.lang.String r1 = "rrpt"
            r2 = 1
            int r0 = r0.a(r1, r2)
            return r0
    }

    @Override // cn.jiguang.commons.a.c
    public java.lang.String a() {
            r1 = this;
            java.lang.String r0 = "JAppRunning"
            return r0
    }

    public java.util.Map a(java.util.List r4) {
            r3 = this;
            java.util.HashMap r0 = new java.util.HashMap
            int r1 = r4.size()
            r0.<init>(r1)
            java.util.Iterator r4 = r4.iterator()
        Ld:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r4.next()
            cn.jiguang.commons.c.e r1 = (cn.jiguang.commons.c.e) r1
            boolean r2 = r3.a(r1)
            if (r2 == 0) goto Ld
            java.lang.String r2 = r1.f1007c
            r0.put(r2, r1)
            goto Ld
        L25:
            return r0
    }

    @Override // cn.jiguang.commons.a.c
    public void a(boolean r6) {
            r5 = this;
            java.lang.String r0 = "JAppRunning"
            int r1 = d()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            int r2 = e()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            r3.<init>()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            java.lang.String r4 = "report running app type:"
            r3.append(r4)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            r3.append(r1)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            cn.jiguang.commons.w.a.a(r0, r3)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            r3.<init>()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            java.lang.String r4 = "report running process type:"
            r3.append(r4)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            r3.append(r2)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            cn.jiguang.commons.w.a.a(r0, r3)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            java.util.List r1 = r5.a(r6, r1)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            java.util.List r6 = r5.c(r6, r2)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            r2.<init>()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            java.lang.String r3 = "collected running apps:"
            r2.append(r3)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            r3 = 0
            if (r1 == 0) goto L50
            int r4 = r1.size()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            goto L51
        L4c:
            r6 = move-exception
            goto L93
        L4e:
            r6 = move-exception
            goto L94
        L50:
            r4 = 0
        L51:
            r2.append(r4)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            cn.jiguang.commons.w.a.a(r0, r2)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            r2.<init>()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            java.lang.String r4 = "collected running processes:"
            r2.append(r4)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            if (r6 == 0) goto L6b
            int r3 = r6.size()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
        L6b:
            r2.append(r3)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            cn.jiguang.commons.w.a.a(r0, r2)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            org.json.JSONObject r6 = r5.a(r1, r6)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            if (r6 != 0) goto L81
            java.lang.String r6 = "no running data to report"
            cn.jiguang.commons.w.a.f(r0, r6)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            return
        L81:
            java.lang.String r1 = "reporting running data ok"
            cn.jiguang.commons.w.a.a(r0, r1)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            cn.jiguang.commons.g.p r1 = cn.jiguang.commons.g.p.e()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            java.lang.String r2 = "app_running"
            r1.a(r6, r2)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            super.d(r0)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            return
        L93:
            throw r6
        L94:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "running err:"
            r1.append(r2)
            java.lang.String r6 = r6.getMessage()
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            cn.jiguang.commons.w.a.f(r0, r6)
            return
    }

    @Override // cn.jiguang.commons.a.c
    public void a(boolean r4, org.json.JSONObject r5) {
            r3 = this;
            java.lang.String r0 = "content"
            org.json.JSONObject r5 = r5.optJSONObject(r0)     // Catch: java.lang.Throwable -> L20
            if (r5 != 0) goto L9
            return
        L9:
            java.lang.String r0 = "app_type"
            r1 = 0
            int r0 = r5.optInt(r0, r1)     // Catch: java.lang.Throwable -> L20
            java.lang.String r2 = "process_type"
            int r5 = r5.optInt(r2, r1)     // Catch: java.lang.Throwable -> L20
            a(r0)     // Catch: java.lang.Throwable -> L20
            c(r5)     // Catch: java.lang.Throwable -> L20
            r3.a(r4)     // Catch: java.lang.Throwable -> L20
            return
        L20:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "doBusiness with command err: "
            r5.append(r0)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "JAppRunning"
            cn.jiguang.commons.w.a.f(r5, r4)
            return
    }
}
