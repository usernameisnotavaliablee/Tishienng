package cn.jiguang.ap;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class k extends cn.jiguang.am.a {
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f610b;

    /* renamed from: c, reason: collision with root package name */
    private int f611c;

    /* renamed from: d, reason: collision with root package name */
    private long f612d;

    /* renamed from: e, reason: collision with root package name */
    private int f613e;

    /* renamed from: f, reason: collision with root package name */
    private int f614f;

    /* renamed from: g, reason: collision with root package name */
    private long f615g;

    /* renamed from: h, reason: collision with root package name */
    private long f616h;

    public k(android.content.Context r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1, r2)
            java.lang.String r2 = "unkown"
            r0.a = r2
            r0.f610b = r2
            java.lang.String r2 = cn.jiguang.av.n.a(r1)
            r0.a = r2
            r2 = 0
            java.lang.String r1 = cn.jiguang.av.w.a(r1, r2)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L1c
            r0.f610b = r1
        L1c:
            return
    }

    @Override // cn.jiguang.am.a
    public org.json.JSONObject a() {
            r5 = this;
            java.lang.String r0 = "status_code"
            long r1 = r5.f616h     // Catch: org.json.JSONException -> L3b
            long r3 = r5.f615g     // Catch: org.json.JSONException -> L3b
            long r1 = r1 - r3
            r5.f612d = r1     // Catch: org.json.JSONException -> L3b
            org.json.JSONObject r1 = r5.d()     // Catch: org.json.JSONException -> L3b
            java.lang.String r2 = "network_type"
            java.lang.String r3 = r5.a     // Catch: org.json.JSONException -> L3b
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L3b
            java.lang.String r2 = "operate_type"
            java.lang.String r3 = r5.f610b     // Catch: org.json.JSONException -> L3b
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L3b
            java.lang.String r2 = "signal_strength"
            int r3 = r5.f611c     // Catch: org.json.JSONException -> L3b
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L3b
            java.lang.String r2 = "cost_time"
            long r3 = r5.f612d     // Catch: org.json.JSONException -> L3b
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L3b
            java.lang.String r2 = "error_code"
            int r3 = r5.f613e     // Catch: org.json.JSONException -> L3b
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L3b
            int r2 = r5.f614f     // Catch: org.json.JSONException -> L3b
            r1.put(r0, r2)     // Catch: org.json.JSONException -> L3b
            int r2 = r5.f614f     // Catch: org.json.JSONException -> L3b
            r1.put(r0, r2)     // Catch: org.json.JSONException -> L3b
            return r1
        L3b:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "build netmoniter data error"
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "NetMoniter"
            cn.jiguang.w.f.c(r1, r0)
            r0 = 0
            return r0
    }

    public void c(int r1) {
            r0 = this;
            r0.f613e = r1
            return
    }

    abstract org.json.JSONObject d();

    public void d(int r1) {
            r0 = this;
            r0.f614f = r1
            return
    }

    public void e() {
            r2 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r2.f615g = r0
            return
    }

    public void f() {
            r2 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r2.f616h = r0
            return
    }
}
