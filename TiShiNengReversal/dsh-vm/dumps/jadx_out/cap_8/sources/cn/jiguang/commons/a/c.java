package cn.jiguang.commons.a;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class c {

    class a implements java.lang.Runnable {
        final /* synthetic */ java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ org.json.JSONObject f935b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f936c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ cn.jiguang.commons.a.c f937d;

        a(cn.jiguang.commons.a.c r1, java.lang.String r2, org.json.JSONObject r3, boolean r4) {
                r0 = this;
                r0.f937d = r1
                r0.a = r2
                r0.f935b = r3
                r0.f936c = r4
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                cn.jiguang.commons.g.l r0 = cn.jiguang.commons.g.l.a()     // Catch: java.lang.Exception -> L31
                java.lang.String r1 = r4.a     // Catch: java.lang.Exception -> L31
                int r0 = r0.a(r1)     // Catch: java.lang.Exception -> L31
                java.lang.String r1 = "TopicManager"
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L31
                r2.<init>()     // Catch: java.lang.Exception -> L31
                java.lang.String r3 = r4.a     // Catch: java.lang.Exception -> L31
                r2.append(r3)     // Catch: java.lang.Exception -> L31
                java.lang.String r3 = " real c, scd:"
                r2.append(r3)     // Catch: java.lang.Exception -> L31
                r2.append(r0)     // Catch: java.lang.Exception -> L31
                java.lang.String r0 = r2.toString()     // Catch: java.lang.Exception -> L31
                cn.jiguang.commons.w.a.a(r1, r0)     // Catch: java.lang.Exception -> L31
                org.json.JSONObject r0 = r4.f935b     // Catch: java.lang.Exception -> L31
                if (r0 != 0) goto L33
                cn.jiguang.commons.a.c r0 = r4.f937d     // Catch: java.lang.Exception -> L31
                boolean r1 = r4.f936c     // Catch: java.lang.Exception -> L31
                r0.a(r1)     // Catch: java.lang.Exception -> L31
                return
            L31:
                r0 = move-exception
                goto L3b
            L33:
                cn.jiguang.commons.a.c r1 = r4.f937d     // Catch: java.lang.Exception -> L31
                boolean r2 = r4.f936c     // Catch: java.lang.Exception -> L31
                r1.a(r2, r0)     // Catch: java.lang.Exception -> L31
                return
            L3b:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "collect task failed, tag:"
                r1.append(r2)
                java.lang.String r2 = r4.a
                r1.append(r2)
                java.lang.String r2 = ", err:"
                r1.append(r2)
                java.lang.String r0 = r0.getMessage()
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                java.lang.String r1 = "JCommon"
                cn.jiguang.commons.w.a.c(r1, r0)
                return
        }
    }

    class b implements java.lang.Runnable {
        final /* synthetic */ java.lang.Runnable a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ cn.jiguang.commons.C.a.g f938b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ cn.jiguang.commons.a.c f939c;

        b(cn.jiguang.commons.a.c r1, java.lang.Runnable r2, cn.jiguang.commons.C.a.g r3) {
                r0 = this;
                r0.f939c = r1
                r0.a = r2
                r0.f938b = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                cn.jiguang.commons.C.a r0 = cn.jiguang.commons.C.a.c()
                java.lang.Runnable r1 = r3.a
                cn.jiguang.commons.C.a$g r2 = r3.f938b
                r0.a(r1, r2)
                return
        }
    }

    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    public static long a(java.lang.String r4) {
            r0 = 0
            cn.jiguang.commons.L.ac r2 = cn.jiguang.commons.L.ac.a()     // Catch: java.lang.Exception -> L1c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L1c
            r3.<init>()     // Catch: java.lang.Exception -> L1c
            r3.append(r4)     // Catch: java.lang.Exception -> L1c
            java.lang.String r4 = "_blt"
            r3.append(r4)     // Catch: java.lang.Exception -> L1c
            java.lang.String r4 = r3.toString()     // Catch: java.lang.Exception -> L1c
            long r0 = r2.a(r4, r0)     // Catch: java.lang.Exception -> L1c
            return r0
        L1c:
            r4 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "get last biz time failed: "
            r2.append(r3)
            java.lang.String r4 = r4.getMessage()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            java.lang.String r2 = "JCommon"
            cn.jiguang.commons.w.a.c(r2, r4)
            return r0
    }

    private java.lang.Runnable a(java.lang.String r2, boolean r3, org.json.JSONObject r4) {
            r1 = this;
            cn.jiguang.commons.a.c$a r0 = new cn.jiguang.commons.a.c$a
            r0.<init>(r1, r2, r4, r3)
            return r0
    }

    private void a(cn.jiguang.commons.C.a.g r2, boolean r3, org.json.JSONObject r4) {
            r1 = this;
            java.lang.String r0 = r1.a()     // Catch: java.lang.Exception -> Lc
            java.lang.Runnable r3 = r1.a(r0, r3, r4)     // Catch: java.lang.Exception -> Lc
            r1.a(r0, r2, r3)     // Catch: java.lang.Exception -> Lc
            return
        Lc:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "schedule collect failed, err:"
            r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "JCommon"
            cn.jiguang.commons.w.a.c(r3, r2)
            return
    }

    private void a(java.lang.String r6, cn.jiguang.commons.C.a.g r7, java.lang.Runnable r8) {
            r5 = this;
            cn.jiguang.commons.g.l r0 = cn.jiguang.commons.g.l.a()     // Catch: java.lang.Exception -> L26
            int r0 = r0.a(r6)     // Catch: java.lang.Exception -> L26
            cn.jiguang.commons.g.l r1 = cn.jiguang.commons.g.l.a()     // Catch: java.lang.Exception -> L26
            long r1 = r1.c(r6)     // Catch: java.lang.Exception -> L26
            cn.jiguang.commons.g.l r3 = cn.jiguang.commons.g.l.a()     // Catch: java.lang.Exception -> L26
            long r0 = r3.a(r6, r0, r1)     // Catch: java.lang.Exception -> L26
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L28
            cn.jiguang.commons.C.a r0 = cn.jiguang.commons.C.a.c()     // Catch: java.lang.Exception -> L26
            r0.a(r8, r7)     // Catch: java.lang.Exception -> L26
            return
        L26:
            r7 = move-exception
            goto L37
        L28:
            cn.jiguang.commons.a.c$b r2 = new cn.jiguang.commons.a.c$b     // Catch: java.lang.Exception -> L26
            r2.<init>(r5, r8, r7)     // Catch: java.lang.Exception -> L26
            cn.jiguang.commons.C.a r7 = cn.jiguang.commons.C.a.c()     // Catch: java.lang.Exception -> L26
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Exception -> L26
            r7.a(r2, r0, r8)     // Catch: java.lang.Exception -> L26
            return
        L37:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "schedule task failed, tag:"
            r8.append(r0)
            r8.append(r6)
            java.lang.String r6 = ", err:"
            r8.append(r6)
            java.lang.String r6 = r7.getMessage()
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            java.lang.String r7 = "JCommon"
            cn.jiguang.commons.w.a.c(r7, r6)
            return
    }

    public static long c(java.lang.String r4) {
            r0 = 0
            cn.jiguang.commons.L.ac r2 = cn.jiguang.commons.L.ac.a()     // Catch: java.lang.Exception -> L1c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L1c
            r3.<init>()     // Catch: java.lang.Exception -> L1c
            r3.append(r4)     // Catch: java.lang.Exception -> L1c
            java.lang.String r4 = "_rlt"
            r3.append(r4)     // Catch: java.lang.Exception -> L1c
            java.lang.String r4 = r3.toString()     // Catch: java.lang.Exception -> L1c
            long r0 = r2.a(r4, r0)     // Catch: java.lang.Exception -> L1c
            return r0
        L1c:
            r4 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "get last report time failed: "
            r2.append(r3)
            java.lang.String r4 = r4.getMessage()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            java.lang.String r2 = "JCommon"
            cn.jiguang.commons.w.a.c(r2, r4)
            return r0
    }

    public static void e(java.lang.String r3) {
            cn.jiguang.commons.L.ac r0 = cn.jiguang.commons.L.ac.a()     // Catch: java.lang.Exception -> L1d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L1d
            r1.<init>()     // Catch: java.lang.Exception -> L1d
            r1.append(r3)     // Catch: java.lang.Exception -> L1d
            java.lang.String r3 = "_rlt"
            r1.append(r3)     // Catch: java.lang.Exception -> L1d
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Exception -> L1d
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L1d
            r0.c(r3, r1)     // Catch: java.lang.Exception -> L1d
            return
        L1d:
            r3 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "set last report time failed: "
            r0.append(r1)
            java.lang.String r3 = r3.getMessage()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "JCommon"
            cn.jiguang.commons.w.a.c(r0, r3)
            return
    }

    public abstract java.lang.String a();

    public void a(cn.jiguang.commons.C.a.g r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.a(r3, r0, r1)
            return
    }

    public void a(cn.jiguang.commons.C.a.g r2, org.json.JSONObject r3) {
            r1 = this;
            r0 = 1
            r1.a(r2, r0, r3)
            return
    }

    public abstract void a(boolean r1);

    public void a(boolean r1, org.json.JSONObject r2) {
            r0 = this;
            return
    }

    public void c(cn.jiguang.commons.C.a.g r3) {
            r2 = this;
            r0 = 1
            r1 = 0
            r2.a(r3, r0, r1)
            return
    }

    protected void d(java.lang.String r5) {
            r4 = this;
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L1d
            cn.jiguang.commons.L.ac r2 = cn.jiguang.commons.L.ac.a()     // Catch: java.lang.Exception -> L1d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L1d
            r3.<init>()     // Catch: java.lang.Exception -> L1d
            r3.append(r5)     // Catch: java.lang.Exception -> L1d
            java.lang.String r5 = "_blt"
            r3.append(r5)     // Catch: java.lang.Exception -> L1d
            java.lang.String r5 = r3.toString()     // Catch: java.lang.Exception -> L1d
            r2.c(r5, r0)     // Catch: java.lang.Exception -> L1d
            return
        L1d:
            r5 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "record biz time failed: "
            r0.append(r1)
            java.lang.String r5 = r5.getMessage()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "JCommon"
            cn.jiguang.commons.w.a.c(r0, r5)
            return
    }
}
