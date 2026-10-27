package cn.jiguang.commons.E;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class e extends cn.jiguang.commons.a.c {
    public static int a = 0;

    /* renamed from: c, reason: collision with root package name */
    public static int f775c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static int f776d = 0;

    /* renamed from: e, reason: collision with root package name */
    private static int f777e = 0;

    /* renamed from: f, reason: collision with root package name */
    private static int f778f = 1;

    private static final class a {
        private static final cn.jiguang.commons.E.e a = null;

        static {
                cn.jiguang.commons.E.e r0 = new cn.jiguang.commons.E.e
                r0.<init>()
                cn.jiguang.commons.E.e.a.a = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.commons.E.e a() {
                cn.jiguang.commons.E.e r0 = cn.jiguang.commons.E.e.a.a
                return r0
        }
    }

    static {
            return
    }

    public e() {
            r0 = this;
            r0.<init>()
            return
    }

    private org.json.JSONArray a(java.util.List r4) {
            r3 = this;
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L21
            r0.<init>()     // Catch: java.lang.Throwable -> L21
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L21
        L9:
            boolean r1 = r4.hasNext()     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L23
            java.lang.Object r1 = r4.next()     // Catch: java.lang.Throwable -> L21
            cn.jiguang.commons.c.e r1 = (cn.jiguang.commons.c.e) r1     // Catch: java.lang.Throwable -> L21
            r2 = 128(0x80, float:1.8E-43)
            org.json.JSONObject r1 = r1.d(r2)     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L9
            r0.put(r1)     // Catch: java.lang.Throwable -> L21
            goto L9
        L21:
            r4 = move-exception
            goto L24
        L23:
            return r0
        L24:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "packageJson failed: "
            r0.append(r1)
            java.lang.String r4 = r4.getMessage()
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "JAppList"
            cn.jiguang.commons.w.a.f(r0, r4)
            org.json.JSONArray r4 = new org.json.JSONArray
            r4.<init>()
            return r4
    }

    public static cn.jiguang.commons.E.e c() {
            cn.jiguang.commons.E.e r0 = cn.jiguang.commons.E.e.a.a()
            return r0
    }

    @Override // cn.jiguang.commons.a.c
    public java.lang.String a() {
            r1 = this;
            java.lang.String r0 = "JAppList"
            return r0
    }

    public void a(int r1) {
            r0 = this;
            cn.jiguang.commons.E.e.f776d = r1
            return
    }

    @Override // cn.jiguang.commons.a.c
    public void a(boolean r10) {
            r9 = this;
            java.lang.String r0 = ", isCmd:"
            java.lang.String r1 = "JAppList"
            cn.jiguang.commons.g.n r2 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Throwable -> L5a
            r3 = 1100(0x44c, float:1.541E-42)
            java.util.List r2 = r2.c(r3, r10)     // Catch: java.lang.Throwable -> L5a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
            r3.<init>()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r4 = "app list data size:"
            r3.append(r4)     // Catch: java.lang.Throwable -> L5a
            r4 = 0
            if (r2 != 0) goto L1d
            r5 = 0
            goto L21
        L1d:
            int r5 = r2.size()     // Catch: java.lang.Throwable -> L5a
        L21:
            r3.append(r5)     // Catch: java.lang.Throwable -> L5a
            r3.append(r0)     // Catch: java.lang.Throwable -> L5a
            r3.append(r10)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L5a
            cn.jiguang.commons.w.a.a(r1, r3)     // Catch: java.lang.Throwable -> L5a
            if (r2 == 0) goto L108
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> L5a
            if (r3 == 0) goto L3b
            goto L108
        L3b:
            org.json.JSONArray r2 = r9.a(r2)     // Catch: java.lang.Throwable -> L5a
            if (r2 == 0) goto L5d
            int r3 = r2.length()     // Catch: java.lang.Throwable -> L5a
            if (r3 != 0) goto L5d
            java.lang.String r10 = "app list json array empty"
            cn.jiguang.commons.w.a.f(r1, r10)     // Catch: java.lang.Throwable -> L5a
            cn.jiguang.commons.A.a r10 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L5a
            r0 = 3029(0xbd5, float:4.245E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L5a
        L56:
            r10.d(r0)     // Catch: java.lang.Throwable -> L5a
            return
        L5a:
            r10 = move-exception
            goto L119
        L5d:
            java.util.ArrayList r2 = cn.jiguang.commons.L.ad.a(r2)     // Catch: java.lang.Throwable -> L5a
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> L5a
            if (r3 == 0) goto L77
            java.lang.String r10 = "app list partition empty"
            cn.jiguang.commons.w.a.f(r1, r10)     // Catch: java.lang.Throwable -> L5a
            cn.jiguang.commons.A.a r10 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L5a
            r0 = 3030(0xbd6, float:4.246E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L5a
            goto L56
        L77:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
            r3.<init>()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r5 = "partition size:"
            r3.append(r5)     // Catch: java.lang.Throwable -> L5a
            int r5 = r2.size()     // Catch: java.lang.Throwable -> L5a
            r3.append(r5)     // Catch: java.lang.Throwable -> L5a
            r3.append(r0)     // Catch: java.lang.Throwable -> L5a
            r3.append(r10)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L5a
            cn.jiguang.commons.w.a.a(r1, r0)     // Catch: java.lang.Throwable -> L5a
            boolean r0 = cn.jiguang.commons.L.u.l()     // Catch: java.lang.Throwable -> L5a
            r3 = 1
            if (r0 == 0) goto La3
            int r5 = r2.size()     // Catch: java.lang.Throwable -> L5a
            if (r5 != r3) goto La3
            r0 = 2
        La3:
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L5a
            r5.<init>()     // Catch: java.lang.Throwable -> L5a
            if (r10 == 0) goto Lad
            int r10 = cn.jiguang.commons.E.e.f778f     // Catch: java.lang.Throwable -> L5a
            goto Laf
        Lad:
            int r10 = cn.jiguang.commons.E.e.f777e     // Catch: java.lang.Throwable -> L5a
        Laf:
            r5.put(r10)     // Catch: java.lang.Throwable -> L5a
            int r10 = cn.jiguang.commons.E.e.f776d     // Catch: java.lang.Throwable -> L5a
            r5.put(r10)     // Catch: java.lang.Throwable -> L5a
            int r10 = r2.size()     // Catch: java.lang.Throwable -> L5a
        Lbb:
            if (r4 >= r10) goto Lf2
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L5a
            r6.<init>()     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r7 = r2.get(r4)     // Catch: java.lang.Throwable -> L5a
            org.json.JSONArray r7 = (org.json.JSONArray) r7     // Catch: java.lang.Throwable -> L5a
            java.lang.String r8 = "si"
            int r4 = r4 + 1
            r6.put(r8, r4)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r8 = "sc"
            r6.put(r8, r10)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r8 = "s"
            r6.put(r8, r5)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r8 = "q"
            r6.put(r8, r0)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r8 = "pv"
            r6.put(r8, r3)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r8 = "da"
            r6.put(r8, r7)     // Catch: java.lang.Throwable -> L5a
            cn.jiguang.commons.g.p r7 = cn.jiguang.commons.g.p.e()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r8 = "app_list"
            r7.a(r6, r8)     // Catch: java.lang.Throwable -> L5a
            goto Lbb
        Lf2:
            cn.jiguang.commons.A.a r10 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L5a
            r0 = 3000(0xbb8, float:4.204E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L5a
            r10.d(r0)     // Catch: java.lang.Throwable -> L5a
            super.d(r1)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r10 = "app list data reported ok"
            cn.jiguang.commons.w.a.a(r1, r10)     // Catch: java.lang.Throwable -> L5a
            return
        L108:
            java.lang.String r10 = "app list empty"
            cn.jiguang.commons.w.a.f(r1, r10)     // Catch: java.lang.Throwable -> L5a
            cn.jiguang.commons.A.a r10 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L5a
            r0 = 3001(0xbb9, float:4.205E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L5a
            goto L56
        L119:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "app list err:"
            r0.append(r2)
            java.lang.String r10 = r10.getMessage()
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            cn.jiguang.commons.w.a.f(r1, r10)
            cn.jiguang.commons.A.a r10 = cn.jiguang.commons.A.a.f()
            r0 = 3002(0xbba, float:4.207E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10.d(r0)
            return
    }
}
