package com.bytedance.j.xt.up.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class b {
    protected com.bytedance.j.xt.cw a;
    protected android.content.Context b;
    protected com.bytedance.j.xt.f c;
    protected com.bytedance.j.xt.up.j.h d;
    protected com.bytedance.j.xt.up.j.e e;

    b(com.bytedance.j.xt.cw r1, android.content.Context r2, com.bytedance.j.xt.up.j.h r3, com.bytedance.j.xt.up.j.e r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.d = r3
            r0.e = r4
            com.bytedance.j.xt.up.c r1 = com.bytedance.j.xt.e.d()
            com.bytedance.j.xt.f r1 = r1.a()
            r0.c = r1
            return
    }

    private void e(com.bytedance.j.xt.cw.b r7) {
            r6 = this;
            com.bytedance.j.xt.g r0 = com.bytedance.j.xt.e.l()
            com.bytedance.j.xt.cw r1 = r6.a
            java.util.List r0 = r0.b(r1)
            if (r0 == 0) goto L4c
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L15:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L47
            java.lang.Object r2 = r0.next()
            com.bytedance.j.xt.b r2 = (com.bytedance.j.xt.b) r2
            com.bytedance.j.xt.cw r3 = r6.a
            java.util.Map r2 = r2.a(r3)
            if (r2 == 0) goto L15
            java.util.Set r3 = r2.keySet()     // Catch: java.lang.Throwable -> L45
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L45
        L31:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L45
            if (r4 == 0) goto L15
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L45
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L45
            java.lang.Object r5 = r2.get(r4)     // Catch: java.lang.Throwable -> L45
            r1.put(r4, r5)     // Catch: java.lang.Throwable -> L45
            goto L31
        L45:
            goto L15
        L47:
            java.lang.String r0 = "custom"
            r7.l(r0, r1)
        L4c:
            return
    }

    void a(com.bytedance.j.xt.cw.b r7) {
            r6 = this;
            java.lang.String r0 = "crash_update_version_code"
            java.lang.String r1 = "crash_version_code"
            com.bytedance.j.xt.up.c r2 = com.bytedance.j.xt.e.d()
            java.util.Map r2 = r2.b()
            if (r2 != 0) goto Lf
            goto L75
        Lf:
            java.lang.String r3 = "app_version"
            boolean r4 = r2.containsKey(r3)
            if (r4 == 0) goto L20
            java.lang.String r4 = "crash_version"
            java.lang.Object r5 = r2.get(r3)
            r7.l(r4, r5)
        L20:
            java.lang.String r4 = "version_name"
            boolean r5 = r2.containsKey(r4)
            if (r5 == 0) goto L2f
            java.lang.Object r4 = r2.get(r4)
            r7.l(r3, r4)
        L2f:
            java.lang.String r3 = "version_code"
            boolean r4 = r2.containsKey(r3)
            if (r4 == 0) goto L52
            java.lang.Object r4 = r2.get(r3)     // Catch: java.lang.Exception -> L4b
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L4b
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.Exception -> L4b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L4b
            r7.l(r1, r4)     // Catch: java.lang.Exception -> L4b
            goto L52
        L4b:
            java.lang.Object r3 = r2.get(r3)
            r7.l(r1, r3)
        L52:
            java.lang.String r1 = "update_version_code"
            boolean r3 = r2.containsKey(r1)
            if (r3 == 0) goto L75
            java.lang.Object r3 = r2.get(r1)     // Catch: java.lang.Exception -> L6e
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L6e
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.Exception -> L6e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L6e
            r7.l(r0, r3)     // Catch: java.lang.Exception -> L6e
            return
        L6e:
            java.lang.Object r1 = r2.get(r1)
            r7.l(r0, r1)
        L75:
            return
    }

    public com.bytedance.j.xt.cw.b b(com.bytedance.j.xt.cw.b r1) {
            r0 = this;
            if (r1 != 0) goto L7
            com.bytedance.j.xt.cw.b r1 = new com.bytedance.j.xt.cw.b
            r1.<init>()
        L7:
            r0.f(r1)
            r0.e(r1)
            return r1
    }

    protected boolean c() {
            r1 = this;
            r0 = 1
            return r0
    }

    protected void d(com.bytedance.j.xt.cw.b r3) {
            r2 = this;
            com.bytedance.j.xt.up.i r0 = com.bytedance.j.xt.e.k()
            int r0 = r0.d()
            com.bytedance.j.xt.up.i r1 = com.bytedance.j.xt.e.k()
            int r1 = r1.e()
            java.util.List r0 = com.bytedance.j.xt.up.f.b(r0, r1)
            r3.m(r0)
            return
    }

    void f(com.bytedance.j.xt.cw.b r4) {
            r3 = this;
            boolean r0 = r3.g()
            if (r0 == 0) goto Ld
            com.bytedance.j.xt.up.j.h r0 = r3.d
            if (r0 == 0) goto Ld
            r4.f(r0)
        Ld:
            long r0 = com.bytedance.j.xt.e.f()
            r4.c(r0)
            com.bytedance.j.xt.up.j.h r0 = r3.d
            r1 = 1
            if (r0 == 0) goto L1f
            boolean r0 = r0.f()
            if (r0 != 0) goto L29
        L1f:
            android.content.Context r0 = r3.b
            boolean r0 = com.bytedance.j.xt.tl.f.h(r0)
            if (r0 != 0) goto L29
            r0 = 1
            goto L2a
        L29:
            r0 = 0
        L2a:
            java.lang.String r2 = "is_background"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.l(r2, r0)
            int r0 = android.os.Process.myPid()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = "pid"
            r4.l(r2, r0)
            com.bytedance.j.xt.up.j.e r0 = r3.e
            int r0 = r0.a()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = "battery"
            r4.l(r2, r0)
            com.bytedance.j.xt.f r0 = r3.c
            java.util.Map r0 = r0.up()
            r4.i(r0)
            java.util.concurrent.ConcurrentHashMap r0 = com.bytedance.j.xt.e.c()
            r4.n(r0)
            int r0 = com.bytedance.j.xt.e.g()
            java.lang.String r2 = com.bytedance.j.xt.e.h()
            r4.b(r0, r2)
            com.bytedance.j.xt.f r0 = r3.c
            java.util.List r0 = r0.m()
            r4.h(r0)
            android.content.Context r0 = r3.b
            org.json.JSONObject r0 = com.bytedance.j.xt.tl.c.e(r0)
            r4.j(r0)
            boolean r0 = r3.c()
            if (r0 == 0) goto L85
            r3.d(r4)
        L85:
            com.bytedance.j.xt.f r0 = r3.c
            java.lang.String r0 = r0.r()
            r4.g(r0)
            java.lang.String r0 = com.bytedance.j.xt.e.a()
            if (r0 == 0) goto L99
            java.lang.String r2 = "business"
            r4.l(r2, r0)
        L99:
            boolean r0 = com.bytedance.j.xt.e.j()
            if (r0 == 0) goto La8
            java.lang.String r0 = "is_mp"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4.l(r0, r1)
        La8:
            com.bytedance.j.xt.g r0 = com.bytedance.j.xt.e.l()
            java.util.Map r0 = r0.c()
            r4.a(r0)
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "crash_uuid"
            r4.l(r1, r0)
            return
    }

    protected boolean g() {
            r1 = this;
            r0 = 1
            return r0
    }
}
