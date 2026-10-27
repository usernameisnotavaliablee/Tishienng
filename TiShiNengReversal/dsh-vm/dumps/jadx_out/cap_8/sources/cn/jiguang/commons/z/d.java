package cn.jiguang.commons.z;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class d {
    private final android.content.Context a;

    /* renamed from: c, reason: collision with root package name */
    private final cn.jiguang.commons.z.c f1233c;

    class a implements java.lang.Runnable {
        final /* synthetic */ cn.jiguang.commons.A.a a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f1234b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ java.lang.String f1235c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ java.lang.String f1236d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ cn.jiguang.commons.z.d f1237e;

        a(cn.jiguang.commons.z.d r1, cn.jiguang.commons.A.a r2, boolean r3, java.lang.String r4, java.lang.String r5) {
                r0 = this;
                r0.f1237e = r1
                r0.a = r2
                r0.f1234b = r3
                r0.f1235c = r4
                r0.f1236d = r5
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r5 = this;
                java.lang.String r0 = ""
                java.lang.String r1 = "JSM"
                cn.jiguang.commons.A.a r2 = r5.a
                r3 = 3069(0xbfd, float:4.3E-42)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r2.l(r3)
                java.lang.String r2 = cn.jiguang.commons.z.e.f()     // Catch: java.lang.Exception -> L2c
                boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L2c
                if (r3 == 0) goto L2f
                cn.jiguang.commons.A.a r2 = r5.a     // Catch: java.lang.Exception -> L2c
                r3 = 3073(0xc01, float:4.306E-42)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L2c
                r2.l(r3)     // Catch: java.lang.Exception -> L2c
                boolean r2 = r5.f1234b     // Catch: java.lang.Exception -> L2c
                if (r2 == 0) goto Lfb
            L28:
                cn.jiguang.commons.z.f.h()     // Catch: java.lang.Exception -> L2c
                return
            L2c:
                r2 = move-exception
                goto Lc3
            L2f:
                cn.jiguang.commons.z.d r3 = r5.f1237e     // Catch: java.lang.Exception -> L2c
                cn.jiguang.commons.z.c r3 = cn.jiguang.commons.z.d.a(r3)     // Catch: java.lang.Exception -> L2c
                boolean r3 = r3.a(r2)     // Catch: java.lang.Exception -> L2c
                if (r3 != 0) goto L50
                java.lang.String r2 = "no md5, skip d"
                cn.jiguang.commons.w.a.f(r1, r2)     // Catch: java.lang.Exception -> L2c
                cn.jiguang.commons.A.a r2 = r5.a     // Catch: java.lang.Exception -> L2c
                r3 = 3074(0xc02, float:4.308E-42)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L2c
                r2.l(r3)     // Catch: java.lang.Exception -> L2c
                boolean r2 = r5.f1234b     // Catch: java.lang.Exception -> L2c
                if (r2 == 0) goto Lfb
                goto L28
            L50:
                cn.jiguang.commons.z.d r3 = r5.f1237e     // Catch: java.lang.Exception -> L2c
                cn.jiguang.commons.z.c r3 = cn.jiguang.commons.z.d.a(r3)     // Catch: java.lang.Exception -> L2c
                java.lang.String r4 = r5.f1235c     // Catch: java.lang.Exception -> L2c
                cn.jiguang.commons.z.d$c r2 = r3.a(r2, r4)     // Catch: java.lang.Exception -> L2c
                boolean r3 = r2.a     // Catch: java.lang.Exception -> L2c
                if (r3 == 0) goto La1
                cn.jiguang.commons.A.a r3 = r5.a     // Catch: java.lang.Exception -> L2c
                r4 = 3071(0xbff, float:4.303E-42)
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L2c
                r3.l(r4)     // Catch: java.lang.Exception -> L2c
                cn.jiguang.commons.z.e.j()     // Catch: java.lang.Exception -> L2c
                java.lang.String r2 = r2.f1238c     // Catch: java.lang.Exception -> L2c
                cn.jiguang.commons.z.d.a(r2)     // Catch: java.lang.Exception -> L2c
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2c
                r2.<init>()     // Catch: java.lang.Exception -> L2c
                java.lang.String r3 = "d ok, load="
                r2.append(r3)     // Catch: java.lang.Exception -> L2c
                boolean r3 = r5.f1234b     // Catch: java.lang.Exception -> L2c
                r2.append(r3)     // Catch: java.lang.Exception -> L2c
                java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L2c
                cn.jiguang.commons.w.a.a(r1, r2)     // Catch: java.lang.Exception -> L2c
                boolean r2 = r5.f1234b     // Catch: java.lang.Exception -> L2c
                if (r2 == 0) goto Lfb
                java.lang.String r2 = r5.f1236d     // Catch: java.lang.Exception -> L2c
                cn.jiguang.commons.z.f.c(r2)     // Catch: java.lang.Exception -> L2c
                boolean r2 = cn.jiguang.commons.z.e.h()     // Catch: java.lang.Exception -> L2c
                if (r2 == 0) goto Lfb
                cn.jiguang.commons.z.d r2 = r5.f1237e     // Catch: java.lang.Exception -> L2c
                cn.jiguang.commons.z.d.c(r2)     // Catch: java.lang.Exception -> L2c
                cn.jiguang.commons.z.e.a()     // Catch: java.lang.Exception -> L2c
                return
            La1:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2c
                r2.<init>()     // Catch: java.lang.Exception -> L2c
                java.lang.String r3 = "d f"
                r2.append(r3)     // Catch: java.lang.Exception -> L2c
                boolean r3 = r5.f1234b     // Catch: java.lang.Exception -> L2c
                if (r3 == 0) goto Lb2
                java.lang.String r3 = ", no load"
                goto Lb3
            Lb2:
                r3 = r0
            Lb3:
                r2.append(r3)     // Catch: java.lang.Exception -> L2c
                java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L2c
                cn.jiguang.commons.w.a.c(r1, r2)     // Catch: java.lang.Exception -> L2c
                boolean r2 = r5.f1234b     // Catch: java.lang.Exception -> L2c
                if (r2 == 0) goto Lfb
                goto L28
            Lc3:
                cn.jiguang.commons.A.a r3 = r5.a
                r4 = 3076(0xc04, float:4.31E-42)
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r3.l(r4)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "err d"
                r3.append(r4)
                boolean r4 = r5.f1234b
                if (r4 == 0) goto Lde
                java.lang.String r0 = " load"
            Lde:
                r3.append(r0)
                java.lang.String r0 = ": "
                r3.append(r0)
                java.lang.String r0 = r2.getMessage()
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                cn.jiguang.commons.w.a.c(r1, r0)
                boolean r0 = r5.f1234b
                if (r0 == 0) goto Lfb
                cn.jiguang.commons.z.f.h()
            Lfb:
                return
        }
    }

    private static final class b {
        private static final cn.jiguang.commons.z.d a = null;

        static {
                cn.jiguang.commons.z.d r0 = new cn.jiguang.commons.z.d
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.commons.z.d.b.a = r0
                return
        }

        public b() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.commons.z.d a() {
                cn.jiguang.commons.z.d r0 = cn.jiguang.commons.z.d.b.a
                return r0
        }
    }

    public static class c {
        public boolean a;

        /* renamed from: c, reason: collision with root package name */
        public java.lang.String f1238c;

        /* renamed from: d, reason: collision with root package name */
        public byte[] f1239d;

        public c(boolean r1, java.lang.String r2, byte[] r3) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.f1238c = r2
                r0.f1239d = r3
                return
        }
    }

    private d() {
            r2 = this;
            r2.<init>()
            android.content.Context r0 = cn.jiguang.commons.L.h.a()
            r2.a = r0
            cn.jiguang.commons.z.c r1 = new cn.jiguang.commons.z.c
            r1.<init>(r0)
            r2.f1233c = r1
            return
    }

    /* synthetic */ d(cn.jiguang.commons.z.d.a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ cn.jiguang.commons.z.c a(cn.jiguang.commons.z.d r0) {
            cn.jiguang.commons.z.c r0 = r0.f1233c
            return r0
    }

    public static void a() {
            java.lang.String r0 = "JSM"
            java.lang.String r1 = "force d..."
            cn.jiguang.commons.w.a.a(r0, r1)
            cn.jiguang.commons.z.d r0 = c()
            android.content.Context r1 = cn.jiguang.commons.L.h.a()
            java.lang.String r2 = cn.jiguang.commons.z.a.f1232h
            java.lang.String r1 = cn.jiguang.commons.z.a.a(r1, r2)
            r3 = 0
            r0.a(r2, r1, r3)
            return
    }

    static /* synthetic */ void a(java.lang.String r0) {
            d(r0)
            return
    }

    private void a(java.lang.String r8, java.lang.String r9, boolean r10) {
            r7 = this;
            cn.jiguang.commons.A.a r2 = cn.jiguang.commons.A.a.f()
            cn.jiguang.commons.C.a r6 = cn.jiguang.commons.C.a.c()
            cn.jiguang.commons.z.d$a r0 = new cn.jiguang.commons.z.d$a
            r1 = r7
            r4 = r8
            r5 = r9
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            cn.jiguang.commons.C.a$g r8 = cn.jiguang.commons.C.a.g.f771d
            r6.a(r0, r8)
            return
    }

    public static cn.jiguang.commons.z.d c() {
            cn.jiguang.commons.z.d r0 = cn.jiguang.commons.z.d.b.a()
            return r0
    }

    static /* synthetic */ void c(cn.jiguang.commons.z.d r0) {
            r0.d()
            return
    }

    private void d() {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L1e
            r0.<init>()     // Catch: java.lang.Exception -> L1e
            java.lang.String r1 = "report_type"
            r2 = 2
            r0.put(r1, r2)     // Catch: java.lang.Exception -> L1e
            java.lang.String r1 = "local_v"
            java.lang.String r2 = cn.jiguang.commons.z.f.d()     // Catch: java.lang.Exception -> L1e
            r0.put(r1, r2)     // Catch: java.lang.Exception -> L1e
            cn.jiguang.commons.g.p r1 = cn.jiguang.commons.g.p.e()     // Catch: java.lang.Exception -> L1e
            java.lang.String r2 = "xstats"
            r1.a(r0, r2)     // Catch: java.lang.Exception -> L1e
        L1e:
            return
    }

    private static void d(java.lang.String r3) {
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L35
            r0.<init>()     // Catch: java.lang.Exception -> L35
            java.lang.String r1 = "report_type"
            r2 = 1
            r0.put(r1, r2)     // Catch: java.lang.Exception -> L35
            java.lang.String r1 = "local_v"
            java.lang.String r2 = cn.jiguang.commons.z.f.d()     // Catch: java.lang.Exception -> L35
            r0.put(r1, r2)     // Catch: java.lang.Exception -> L35
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L35
            if (r1 != 0) goto L2b
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L35
            r1.<init>(r3)     // Catch: java.lang.Exception -> L35
            java.lang.String r3 = "download_v"
            java.lang.String r2 = "v"
            java.lang.String r1 = r1.optString(r2)     // Catch: java.lang.Exception -> L35
            r0.put(r3, r1)     // Catch: java.lang.Exception -> L35
        L2b:
            cn.jiguang.commons.g.p r3 = cn.jiguang.commons.g.p.e()     // Catch: java.lang.Exception -> L35
            java.lang.String r1 = "xstats"
            r3.a(r0, r1)     // Catch: java.lang.Exception -> L35
        L35:
            return
    }

    private boolean e(java.lang.String r6) {
            r5 = this;
            cn.jiguang.commons.A.a r0 = cn.jiguang.commons.A.a.f()
            java.lang.String r1 = cn.jiguang.commons.z.e.d()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "c m: "
            r2.append(r3)
            java.lang.String r3 = "null"
            if (r1 == 0) goto L18
            r4 = r1
            goto L19
        L18:
            r4 = r3
        L19:
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "JSM"
            cn.jiguang.commons.w.a.a(r4, r2)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L3b
            r6 = 3068(0xbfc, float:4.299E-42)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r0.l(r6)
            java.lang.String r6 = "no c m, no verify"
            cn.jiguang.commons.w.a.a(r4, r6)
            r6 = 0
            return r6
        L3b:
            java.lang.String r6 = cn.jiguang.commons.L.m.a(r6)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "a m: "
            r0.append(r2)
            if (r6 == 0) goto L4c
            r3 = r6
        L4c:
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            cn.jiguang.commons.w.a.a(r4, r0)
            boolean r6 = android.text.TextUtils.equals(r1, r6)
            return r6
    }

    public void c(java.lang.String r5) {
            r4 = this;
            cn.jiguang.commons.A.a r0 = cn.jiguang.commons.A.a.f()
            android.content.Context r1 = r4.a
            java.lang.String r1 = cn.jiguang.commons.z.a.a(r1, r5)
            boolean r2 = cn.jiguang.commons.L.m.g(r1)
            r3 = 1
            if (r2 == 0) goto L4d
            r2 = 3065(0xbf9, float:4.295E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.l(r2)
            boolean r2 = r4.e(r1)
            if (r2 == 0) goto L40
            r5 = 3067(0xbfb, float:4.298E-42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.l(r5)
            java.lang.String r5 = "JSM"
            java.lang.String r0 = "local ok, load"
            cn.jiguang.commons.w.a.a(r5, r0)
            cn.jiguang.commons.z.f.c(r1)
            boolean r5 = cn.jiguang.commons.z.e.h()
            if (r5 == 0) goto L3f
            r4.d()
            cn.jiguang.commons.z.e.a()
        L3f:
            return
        L40:
            r2 = 3066(0xbfa, float:4.296E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.l(r2)
            r4.a(r5, r1, r3)
            return
        L4d:
            r2 = 3064(0xbf8, float:4.294E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.l(r2)
            r4.a(r5, r1, r3)
            return
    }
}
