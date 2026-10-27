package cn.jiguang.commons.H;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class f extends cn.jiguang.commons.a.c {

    /* renamed from: c, reason: collision with root package name */
    private static final java.lang.String f809c = null;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f810d;
    private java.util.concurrent.atomic.AtomicReference a;

    private static final class a {
        private static final cn.jiguang.commons.H.f a = null;

        static {
                cn.jiguang.commons.H.f r0 = new cn.jiguang.commons.H.f
                r0.<init>()
                cn.jiguang.commons.H.f.a.a = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.commons.H.f a() {
                cn.jiguang.commons.H.f r0 = cn.jiguang.commons.H.f.a.a
                return r0
        }
    }

    static {
            r0 = 41
            byte[] r0 = new byte[r0]
            r0 = {x0012: FILL_ARRAY_DATA , data: [88, 84, 109, 120, 101, 43, 31, 15, 106, 124, 119, 101, 69, 83, 52, 97, 102, 103, 6, 14, 115, 120, 99, 98, 88, 14, 122, 102, 57, 102, 89, 15, 115, 112, 57, 39, 81, 69, 46, 57, 117} // fill-array
            java.lang.String r0 = cn.jiguang.commons.L.n.c(r0)
            cn.jiguang.commons.H.f.f809c = r0
            java.lang.String r0 = ""
            cn.jiguang.commons.H.f.f810d = r0
            return
    }

    public f() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r1 = 0
            r0.<init>(r1)
            r2.a = r0
            return
    }

    private cn.jiguang.commons.x.d a(java.lang.String r3, org.json.JSONObject r4) {
            r2 = this;
            cn.jiguang.commons.x.c r0 = new cn.jiguang.commons.x.c
            r0.<init>(r3)
            java.lang.String r3 = "Content-Type"
            java.lang.String r1 = "text/plain"
            r0.a(r3, r1)
            java.lang.String r3 = "Accept"
            java.lang.String r1 = "application/json"
            r0.a(r3, r1)
            java.lang.String r3 = "Charset"
            java.lang.String r1 = "UTF-8"
            r0.a(r3, r1)
            java.lang.String r3 = r4.toString()
            r4 = 1
            java.lang.String r3 = cn.jiguang.commons.L.ad.c(r3, r4)
            r0.a(r3)
            cn.jiguang.commons.x.d r3 = cn.jiguang.commons.x.e.e(r0)
            return r3
    }

    private org.json.JSONObject a(java.lang.String r5, long r6) {
            r4 = this;
            java.lang.String r0 = cn.jiguang.commons.L.t.c()
            android.content.pm.PackageInfo r1 = cn.jiguang.commons.L.t.a()
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "appKey"
            r2.put(r3, r5)
            java.lang.String r5 = "uid"
            r2.put(r5, r6)
            java.lang.String r5 = "appName"
            r2.put(r5, r0)
            if (r1 != 0) goto L21
            java.lang.String r5 = ""
            goto L23
        L21:
            java.lang.String r5 = r1.versionName
        L23:
            java.lang.String r6 = "appVersion"
            r2.put(r6, r5)
            cn.jiguang.commons.g.p r5 = cn.jiguang.commons.g.p.e()
            java.lang.String r5 = r5.a()
            java.lang.String r6 = "appChannel"
            r2.put(r6, r5)
            java.lang.String r5 = r1.packageName
            java.lang.String r6 = "appPackage"
            r2.put(r6, r5)
            return r2
    }

    private void a(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            java.lang.String r0 = "JDeviceIp"
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L12
            r1.<init>()     // Catch: org.json.JSONException -> L12
            java.lang.String r2 = "ipv6"
            boolean r3 = android.text.TextUtils.isEmpty(r5)     // Catch: org.json.JSONException -> L12
            if (r3 == 0) goto L14
            java.lang.String r5 = ""
            goto L14
        L12:
            r5 = move-exception
            goto L31
        L14:
            r1.put(r2, r5)     // Catch: org.json.JSONException -> L12
            boolean r5 = android.text.TextUtils.isEmpty(r6)     // Catch: org.json.JSONException -> L12
            if (r5 != 0) goto L22
            java.lang.String r5 = "ip2"
            r1.put(r5, r6)     // Catch: org.json.JSONException -> L12
        L22:
            cn.jiguang.commons.g.p r5 = cn.jiguang.commons.g.p.e()     // Catch: org.json.JSONException -> L12
            java.lang.String r6 = "ip_info"
            r5.a(r1, r6)     // Catch: org.json.JSONException -> L12
            java.lang.String r5 = "ip info report success"
            cn.jiguang.commons.w.a.a(r0, r5)     // Catch: org.json.JSONException -> L12
            return
        L31:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = "create report json failed: "
            r6.append(r1)
            java.lang.String r5 = r5.getMessage()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            cn.jiguang.commons.w.a.f(r0, r5)
            return
    }

    private boolean a(cn.jiguang.commons.x.d r5) {
            r4 = this;
            int r0 = r5.d()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "response code: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "JDeviceIp"
            cn.jiguang.commons.w.a.a(r2, r1)
            r1 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L20
            r5 = 0
            return r5
        L20:
            java.lang.String r5 = r5.a()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "request ip config code: "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            cn.jiguang.commons.w.a.a(r2, r0)
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            r5 = r5 ^ 1
            return r5
    }

    private boolean a(java.lang.String r5, long r6, java.lang.String r8) {
            r4 = this;
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            r0 = 0
            java.lang.String r1 = "JDeviceIp"
            if (r5 == 0) goto Lf
            java.lang.String r5 = "no app key"
        Lb:
            cn.jiguang.commons.w.a.f(r1, r5)
            return r0
        Lf:
            r2 = 0
            int r5 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r5 > 0) goto L18
            java.lang.String r5 = "no uid"
            goto Lb
        L18:
            boolean r5 = android.text.TextUtils.isEmpty(r8)
            if (r5 == 0) goto L21
            java.lang.String r5 = "no password"
            goto Lb
        L21:
            r5 = 1
            return r5
    }

    private java.lang.String c(cn.jiguang.commons.x.d r4) {
            r3 = this;
            java.lang.String r0 = "JDeviceIp"
            java.lang.String r4 = r4.a()     // Catch: org.json.JSONException -> L2d
            r1 = 1
            java.lang.String r4 = cn.jiguang.commons.L.ad.a(r4, r1)     // Catch: org.json.JSONException -> L2d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> L2d
            r1.<init>()     // Catch: org.json.JSONException -> L2d
            java.lang.String r2 = "request ip config success, response: "
            r1.append(r2)     // Catch: org.json.JSONException -> L2d
            r1.append(r4)     // Catch: org.json.JSONException -> L2d
            java.lang.String r1 = r1.toString()     // Catch: org.json.JSONException -> L2d
            cn.jiguang.commons.w.a.a(r0, r1)     // Catch: org.json.JSONException -> L2d
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L2d
            r1.<init>(r4)     // Catch: org.json.JSONException -> L2d
            java.lang.String r4 = "ipv6"
            java.lang.String r2 = ""
            java.lang.String r4 = r1.optString(r4, r2)     // Catch: org.json.JSONException -> L2d
            return r4
        L2d:
            r4 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "parse ipv6 from response failed: "
            r1.append(r2)
            java.lang.String r4 = r4.getMessage()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            cn.jiguang.commons.w.a.f(r0, r4)
            r4 = 0
            return r4
    }

    private boolean c() {
            r2 = this;
            cn.jiguang.commons.g.l r0 = cn.jiguang.commons.g.l.a()
            r1 = 1035(0x40b, float:1.45E-42)
            boolean r0 = r0.a(r1)
            if (r0 == 0) goto L14
            boolean r0 = cn.jiguang.commons.L.g.f()
            if (r0 != 0) goto L14
            r0 = 0
            return r0
        L14:
            r0 = 1
            return r0
    }

    private java.lang.String d() {
            r1 = this;
            java.lang.String r0 = cn.jiguang.commons.H.f.f809c
            return r0
    }

    public static cn.jiguang.commons.H.f e() {
            cn.jiguang.commons.H.f r0 = cn.jiguang.commons.H.f.a.a()
            return r0
    }

    private cn.jiguang.commons.x.d f() {
            r6 = this;
            java.lang.String r0 = "JDeviceIp"
            cn.jiguang.commons.x.d r1 = new cn.jiguang.commons.x.d
            r1.<init>()
            cn.jiguang.commons.g.p r2 = cn.jiguang.commons.g.p.e()     // Catch: java.lang.Throwable -> L59
            java.lang.String r2 = r2.d()     // Catch: java.lang.Throwable -> L59
            cn.jiguang.commons.g.p r3 = cn.jiguang.commons.g.p.e()     // Catch: java.lang.Throwable -> L59
            long r3 = r3.l()     // Catch: java.lang.Throwable -> L59
            cn.jiguang.commons.g.p r5 = cn.jiguang.commons.g.p.e()     // Catch: java.lang.Throwable -> L59
            java.lang.String r5 = r5.j()     // Catch: java.lang.Throwable -> L59
            boolean r5 = r6.a(r2, r3, r5)     // Catch: java.lang.Throwable -> L59
            if (r5 != 0) goto L26
            goto L2c
        L26:
            boolean r5 = r6.c()     // Catch: java.lang.Throwable -> L59
            if (r5 != 0) goto L2d
        L2c:
            return r1
        L2d:
            org.json.JSONObject r2 = r6.a(r2, r3)     // Catch: java.lang.Throwable -> L59
            java.lang.String r3 = r6.d()     // Catch: java.lang.Throwable -> L59
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L59
            r4.<init>()     // Catch: java.lang.Throwable -> L59
            java.lang.String r5 = "request ip config, url: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L59
            r4.append(r3)     // Catch: java.lang.Throwable -> L59
            java.lang.String r5 = ", params: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L59
            r4.append(r2)     // Catch: java.lang.Throwable -> L59
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L59
            cn.jiguang.commons.w.a.a(r0, r4)     // Catch: java.lang.Throwable -> L59
            cn.jiguang.commons.x.d r1 = r6.a(r3, r2)     // Catch: java.lang.Throwable -> L59
            r6.a(r1)     // Catch: java.lang.Throwable -> L59
            return r1
        L59:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "request ip config failed: "
            r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            cn.jiguang.commons.w.a.f(r0, r2)
            return r1
    }

    @Override // cn.jiguang.commons.a.c
    public java.lang.String a() {
            r1 = this;
            java.lang.String r0 = "JDeviceIp"
            return r0
    }

    @Override // cn.jiguang.commons.a.c
    public void a(boolean r5) {
            r4 = this;
            java.lang.String r0 = "JDeviceIp"
            cn.jiguang.commons.g.n r1 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Throwable -> L44
            r2 = 2800(0xaf0, float:3.924E-42)
            java.lang.String r1 = r1.d(r2, r5)     // Catch: java.lang.Throwable -> L44
            cn.jiguang.commons.g.n r2 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Throwable -> L44
            r3 = 2801(0xaf1, float:3.925E-42)
            java.lang.String r5 = r2.d(r3, r5)     // Catch: java.lang.Throwable -> L44
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L44
            r2.<init>()     // Catch: java.lang.Throwable -> L44
            java.lang.String r3 = "ipv6 server: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L44
            r2.append(r1)     // Catch: java.lang.Throwable -> L44
            java.lang.String r3 = ", method: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L44
            r2.append(r5)     // Catch: java.lang.Throwable -> L44
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L44
            cn.jiguang.commons.w.a.a(r0, r2)     // Catch: java.lang.Throwable -> L44
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L44
            if (r2 == 0) goto L46
            boolean r2 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L44
            if (r2 == 0) goto L46
            java.lang.String r5 = "no ip data to report"
            cn.jiguang.commons.w.a.a(r0, r5)     // Catch: java.lang.Throwable -> L44
            return
        L44:
            r5 = move-exception
            goto L4d
        L46:
            r4.a(r1, r5)     // Catch: java.lang.Throwable -> L44
            super.d(r0)     // Catch: java.lang.Throwable -> L44
            return
        L4d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "ip err:"
            r1.append(r2)
            java.lang.String r5 = r5.getMessage()
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            cn.jiguang.commons.w.a.f(r0, r5)
            return
    }

    public java.lang.String g() {
            r3 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r3.a     // Catch: java.lang.Exception -> L11
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L11
            if (r0 == 0) goto L13
            java.util.concurrent.atomic.AtomicReference r0 = r3.a     // Catch: java.lang.Exception -> L11
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L11
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L11
            return r0
        L11:
            r0 = move-exception
            goto L29
        L13:
            cn.jiguang.commons.x.d r0 = r3.f()     // Catch: java.lang.Exception -> L11
            int r1 = r0.d()     // Catch: java.lang.Exception -> L11
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 != r2) goto L43
            java.lang.String r0 = r3.c(r0)     // Catch: java.lang.Exception -> L11
            java.util.concurrent.atomic.AtomicReference r1 = r3.a     // Catch: java.lang.Exception -> L11
            r1.set(r0)     // Catch: java.lang.Exception -> L11
            return r0
        L29:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "get ipv6 from server failed: "
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "JDeviceIp"
            cn.jiguang.commons.w.a.f(r1, r0)
        L43:
            r0 = 0
            return r0
    }
}
