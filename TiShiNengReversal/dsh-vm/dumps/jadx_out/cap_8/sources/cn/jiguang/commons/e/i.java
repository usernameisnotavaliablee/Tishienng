package cn.jiguang.commons.E;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class i extends cn.jiguang.commons.a.c {
    private java.util.HashMap a;

    /* renamed from: c, reason: collision with root package name */
    private java.util.HashMap f783c;

    private static final class a {
        private static final cn.jiguang.commons.E.i a = null;

        static {
                cn.jiguang.commons.E.i r0 = new cn.jiguang.commons.E.i
                r0.<init>()
                cn.jiguang.commons.E.i.a.a = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.commons.E.i a() {
                cn.jiguang.commons.E.i r0 = cn.jiguang.commons.E.i.a.a
                return r0
        }
    }

    public i() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.a = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f783c = r0
            return
    }

    private void a(java.util.List r6) {
            r5 = this;
            java.util.Map r6 = cn.jiguang.commons.L.c.e(r6)
            java.lang.String r0 = "detected installed app map"
            java.lang.String r1 = "JAppProbe"
            cn.jiguang.commons.w.a.a(r1, r0)
            java.util.HashMap r0 = r5.a
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L15:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r6.get(r2)
            cn.jiguang.commons.c.e r3 = (cn.jiguang.commons.c.e) r3
            if (r3 == 0) goto L31
            r3 = 1
            goto L32
        L31:
            r3 = 0
        L32:
            java.util.HashMap r4 = r5.f783c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.put(r2, r3)
            goto L15
        L3c:
            java.lang.String r6 = "detected package install status map"
            cn.jiguang.commons.w.a.a(r1, r6)
            return
    }

    private java.lang.String c() {
            r5 = this;
            java.util.HashMap r0 = r5.f783c
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            java.lang.String r0 = ""
            return r0
        Lb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.HashMap r1 = r5.f783c
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
            r2 = 1
        L1b:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L4c
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            if (r2 != 0) goto L2f
            java.lang.String r2 = "|"
            r0.append(r2)
        L2f:
            int r2 = r5.f(r3)
            java.util.HashMap r4 = r5.f783c
            java.lang.Object r3 = r4.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.append(r2)
            java.lang.String r2 = "&"
            r0.append(r2)
            r0.append(r3)
            r2 = 0
            goto L1b
        L4c:
            java.lang.String r0 = r0.toString()
            return r0
    }

    private void d() {
            r1 = this;
            java.util.HashMap r0 = r1.a
            if (r0 == 0) goto L7
            r0.clear()
        L7:
            java.util.HashMap r0 = r1.f783c
            if (r0 == 0) goto Le
            r0.clear()
        Le:
            return
    }

    private void e() {
            r3 = this;
            cn.jiguang.commons.g.n r0 = cn.jiguang.commons.g.n.a()
            r1 = 1100(0x44c, float:1.541E-42)
            r2 = 0
            java.util.List r0 = r0.c(r1, r2)
            if (r0 == 0) goto L1e
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L1e
            int r1 = r0.size()
            r2 = 1
            if (r1 < r2) goto L1e
            r3.a(r0)
            return
        L1e:
            r3.f()
            return
    }

    private int f(java.lang.String r5) {
            r4 = this;
            java.util.HashMap r0 = r4.a
            r1 = -1
            if (r0 == 0) goto L39
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lc
            goto L39
        Lc:
            java.util.HashMap r0 = r4.a
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L16:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L39
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = r3.contains(r5)
            if (r3 == 0) goto L16
            java.lang.Object r5 = r2.getValue()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            return r5
        L39:
            return r1
    }

    private void f() {
            r5 = this;
            java.util.HashMap r0 = r5.a
            java.lang.String r1 = "JAppProbe"
            if (r0 == 0) goto L76
            int r0 = r0.size()
            if (r0 > 0) goto Ld
            goto L76
        Ld:
            cn.jiguang.commons.f.j r0 = cn.jiguang.commons.f.j.j()
            int r0 = r0.i()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "using method, ap:"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            cn.jiguang.commons.w.a.a(r1, r2)
            r2 = 1
            if (r0 != r2) goto L2e
            goto L2f
        L2e:
            r2 = 0
        L2f:
            if (r2 == 0) goto L43
            boolean r0 = cn.jiguang.commons.L.u.l()
            if (r0 != 0) goto L3d
            java.lang.String r0 = "can't probe by launch intent, no QUERY_ALL_PACKAGES permission"
        L39:
            cn.jiguang.commons.w.a.a(r1, r0)
            return
        L3d:
            java.lang.String r0 = "app probe by launch intent"
        L3f:
            cn.jiguang.commons.w.a.a(r1, r0)
            goto L46
        L43:
            java.lang.String r0 = "app probe by dy activity"
            goto L3f
        L46:
            java.util.HashMap r0 = r5.a
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L50:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L75
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r3 = r5.g(r1)
            if (r2 == 0) goto L67
            boolean r1 = cn.jiguang.commons.L.a.e(r3)
            goto L6b
        L67:
            boolean r1 = cn.jiguang.commons.L.a.d(r1)
        L6b:
            java.util.HashMap r4 = r5.f783c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4.put(r3, r1)
            goto L50
        L75:
            return
        L76:
            java.lang.String r0 = "cf is empty"
            goto L39
    }

    private java.lang.String g(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "\\|"
            java.lang.String[] r0 = r3.split(r0)     // Catch: java.lang.Throwable -> L9
            r1 = 0
            r3 = r0[r1]     // Catch: java.lang.Throwable -> L9
        L9:
            return r3
    }

    private void g() {
            r4 = this;
            java.util.HashMap r0 = r4.f783c
            boolean r0 = r0.isEmpty()
            java.lang.String r1 = "JAppProbe"
            if (r0 == 0) goto L10
            java.lang.String r0 = "no probe data to report"
        Lc:
            cn.jiguang.commons.w.a.f(r1, r0)
            return
        L10:
            java.lang.String r0 = r4.c()
            if (r0 == 0) goto L4d
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L1d
            goto L4d
        L1d:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L36
            r2.<init>()     // Catch: java.lang.Throwable -> L36
            java.lang.String r3 = "data"
            r2.put(r3, r0)     // Catch: java.lang.Throwable -> L36
            cn.jiguang.commons.g.p r0 = cn.jiguang.commons.g.p.e()     // Catch: java.lang.Throwable -> L36
            java.lang.String r3 = "app_probe"
            r0.a(r2, r3)     // Catch: java.lang.Throwable -> L36
            java.lang.String r0 = "report probe data ok"
            cn.jiguang.commons.w.a.a(r1, r0)     // Catch: java.lang.Throwable -> L36
            return
        L36:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "pro err:"
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto Lc
        L4d:
            java.lang.String r0 = "report data empty, skip report"
            goto Lc
    }

    public static cn.jiguang.commons.E.i h() {
            cn.jiguang.commons.E.i r0 = cn.jiguang.commons.E.i.a.a()
            return r0
    }

    private void h(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "JAppProbe"
            java.lang.String r1 = "&"
            java.lang.String[] r4 = r4.split(r1)     // Catch: java.lang.NumberFormatException -> L21
            if (r4 == 0) goto L23
            int r1 = r4.length     // Catch: java.lang.NumberFormatException -> L21
            r2 = 1
            if (r1 <= r2) goto L23
            r1 = 0
            r1 = r4[r1]     // Catch: java.lang.NumberFormatException -> L21
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L21
            r4 = r4[r2]     // Catch: java.lang.NumberFormatException -> L21
            java.util.HashMap r2 = r3.a     // Catch: java.lang.NumberFormatException -> L21
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.NumberFormatException -> L21
            r2.put(r4, r1)     // Catch: java.lang.NumberFormatException -> L21
            goto L23
        L21:
            r4 = move-exception
            goto L29
        L23:
            java.lang.String r4 = "parsed package index map"
            cn.jiguang.commons.w.a.a(r0, r4)     // Catch: java.lang.NumberFormatException -> L21
            return
        L29:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "parse package index err:"
            r1.append(r2)
            java.lang.String r4 = r4.getMessage()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            cn.jiguang.commons.w.a.f(r0, r4)
            return
    }

    @Override // cn.jiguang.commons.a.c
    public java.lang.String a() {
            r1 = this;
            java.lang.String r0 = "JAppProbe"
            return r0
    }

    @Override // cn.jiguang.commons.a.c
    public void a(boolean r5) {
            r4 = this;
            java.lang.String r5 = "JAppProbe"
            r4.d()     // Catch: java.lang.Throwable -> L28
            cn.jiguang.commons.f.j r0 = cn.jiguang.commons.f.j.j()     // Catch: java.lang.Throwable -> L28
            java.lang.String r0 = r0.k()     // Catch: java.lang.Throwable -> L28
            if (r0 == 0) goto L34
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L16
            goto L34
        L16:
            java.lang.String r1 = "&&"
            java.lang.String[] r0 = r0.split(r1)     // Catch: java.lang.Throwable -> L28
            int r1 = r0.length     // Catch: java.lang.Throwable -> L28
            r2 = 0
        L1e:
            if (r2 >= r1) goto L2a
            r3 = r0[r2]     // Catch: java.lang.Throwable -> L28
            r4.h(r3)     // Catch: java.lang.Throwable -> L28
            int r2 = r2 + 1
            goto L1e
        L28:
            r0 = move-exception
            goto L3d
        L2a:
            r4.e()     // Catch: java.lang.Throwable -> L28
            r4.g()     // Catch: java.lang.Throwable -> L28
            super.d(r5)     // Catch: java.lang.Throwable -> L28
            goto L55
        L34:
            java.lang.String r0 = "probe list empty"
            cn.jiguang.commons.w.a.f(r5, r0)     // Catch: java.lang.Throwable -> L28
            r4.d()
            return
        L3d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L59
            r1.<init>()     // Catch: java.lang.Throwable -> L59
            java.lang.String r2 = "probe err:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L59
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L59
            r1.append(r0)     // Catch: java.lang.Throwable -> L59
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L59
            cn.jiguang.commons.w.a.f(r5, r0)     // Catch: java.lang.Throwable -> L59
        L55:
            r4.d()
            return
        L59:
            r5 = move-exception
            r4.d()
            throw r5
    }
}
