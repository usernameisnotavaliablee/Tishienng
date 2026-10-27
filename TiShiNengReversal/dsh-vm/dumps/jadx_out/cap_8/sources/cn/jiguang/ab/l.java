package cn.jiguang.ab;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class l {
    java.util.LinkedHashSet<cn.jiguang.ab.g> a;

    /* renamed from: b, reason: collision with root package name */
    java.util.LinkedHashSet<cn.jiguang.ab.g> f289b;

    /* renamed from: c, reason: collision with root package name */
    java.util.LinkedHashSet<cn.jiguang.ab.g> f290c;

    /* renamed from: d, reason: collision with root package name */
    java.util.LinkedHashSet<cn.jiguang.ab.g> f291d;

    /* renamed from: e, reason: collision with root package name */
    java.util.LinkedHashSet<cn.jiguang.ab.g> f292e;

    /* renamed from: f, reason: collision with root package name */
    org.json.JSONObject f293f;

    /* renamed from: g, reason: collision with root package name */
    transient cn.jiguang.ab.g f294g;

    /* renamed from: h, reason: collision with root package name */
    boolean f295h;

    /* renamed from: i, reason: collision with root package name */
    int f296i;

    l(java.lang.String r4) {
            r3 = this;
            r3.<init>()
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L6a
            if (r0 != 0) goto L6a
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L6a
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r4 = "ips"
            java.util.LinkedHashSet r4 = r3.a(r0, r4)     // Catch: java.lang.Throwable -> L6a
            r3.a = r4     // Catch: java.lang.Throwable -> L6a
            java.lang.String r4 = "ssl_ips"
            java.util.LinkedHashSet r4 = r3.a(r0, r4)     // Catch: java.lang.Throwable -> L6a
            r3.f289b = r4     // Catch: java.lang.Throwable -> L6a
            java.lang.String r4 = "http_report"
            java.util.LinkedHashSet r4 = r3.a(r0, r4)     // Catch: java.lang.Throwable -> L6a
            r3.f290c = r4     // Catch: java.lang.Throwable -> L6a
            java.lang.String r4 = "https_report"
            java.util.LinkedHashSet r4 = r3.a(r0, r4)     // Catch: java.lang.Throwable -> L6a
            r3.f291d = r4     // Catch: java.lang.Throwable -> L6a
            java.lang.String r4 = "sis_ips"
            java.util.LinkedHashSet r4 = r3.a(r0, r4)     // Catch: java.lang.Throwable -> L6a
            r3.f292e = r4     // Catch: java.lang.Throwable -> L6a
            java.lang.String r4 = "data_report"
            boolean r4 = r0.optBoolean(r4)     // Catch: java.lang.Throwable -> L6a
            r3.f295h = r4     // Catch: java.lang.Throwable -> L6a
            java.lang.String r4 = "tcp_report"
            org.json.JSONObject r4 = r0.optJSONObject(r4)     // Catch: java.lang.Throwable -> L6a
            r3.f293f = r4     // Catch: java.lang.Throwable -> L6a
            java.lang.String r4 = "cert_ver"
            r1 = 0
            int r4 = r0.optInt(r4, r1)     // Catch: java.lang.Throwable -> L6a
            r3.f296i = r4     // Catch: java.lang.Throwable -> L6a
            java.lang.String r4 = "sis"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6a
            r1.<init>()     // Catch: java.lang.Throwable -> L6a
            java.lang.String r2 = "get sis="
            r1.append(r2)     // Catch: java.lang.Throwable -> L6a
            r2 = 2
            java.lang.String r0 = r0.toString(r2)     // Catch: java.lang.Throwable -> L6a
            r1.append(r0)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L6a
            cn.jiguang.w.f.c(r4, r0)     // Catch: java.lang.Throwable -> L6a
        L6a:
            return
    }

    private java.util.LinkedHashSet<cn.jiguang.ab.g> a(org.json.JSONObject r4, java.lang.String r5) {
            r3 = this;
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            org.json.JSONArray r4 = r4.optJSONArray(r5)     // Catch: java.lang.Throwable -> L29
            if (r4 == 0) goto L29
            r5 = 0
        Lc:
            int r1 = r4.length()     // Catch: java.lang.Throwable -> L29
            if (r5 >= r1) goto L29
            r1 = 0
            java.lang.String r1 = r4.optString(r5, r1)     // Catch: java.lang.Throwable -> L29
            cn.jiguang.ab.g r1 = cn.jiguang.ab.g.a(r1)     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L26
            boolean r2 = r1.a()     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto L26
            r0.add(r1)     // Catch: java.lang.Throwable -> L29
        L26:
            int r5 = r5 + 1
            goto Lc
        L29:
            return r0
    }

    public boolean a() {
            r1 = this;
            java.util.LinkedHashSet<cn.jiguang.ab.g> r0 = r1.a
            if (r0 == 0) goto La
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L15
        La:
            java.util.LinkedHashSet<cn.jiguang.ab.g> r0 = r1.f289b
            if (r0 == 0) goto L17
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L15
            goto L17
        L15:
            r0 = 0
            return r0
        L17:
            r0 = 1
            return r0
    }
}
