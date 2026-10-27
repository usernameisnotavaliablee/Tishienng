package cn.jiguang.r;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b {
    private android.content.Context a;

    /* renamed from: b, reason: collision with root package name */
    private int f1436b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f1437c;

    /* renamed from: d, reason: collision with root package name */
    private int f1438d;

    /* renamed from: e, reason: collision with root package name */
    private int f1439e;

    /* renamed from: f, reason: collision with root package name */
    private int f1440f;

    /* renamed from: g, reason: collision with root package name */
    private int f1441g;

    /* renamed from: h, reason: collision with root package name */
    private int f1442h;

    /* renamed from: i, reason: collision with root package name */
    private int f1443i;

    /* renamed from: j, reason: collision with root package name */
    private java.util.Map<java.lang.String, java.lang.Integer> f1444j;

    /* renamed from: k, reason: collision with root package name */
    private java.lang.String f1445k;

    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    public b(android.content.Context r2, cn.jiguang.r.a r3, int r4, int r5) {
            r1 = this;
            r1.<init>()
            if (r3 == 0) goto Ld
            int r0 = r3.f1435k
            r1.f1436b = r0
            java.lang.String r3 = r3.l
            r1.f1437c = r3
        Ld:
            r1.a = r2
            r1.a(r4, r5)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r1.f1444j = r3
            java.lang.String r2 = cn.jiguang.u.g.a(r2)
            r1.f1445k = r2
            return
    }

    public int a() {
            r1 = this;
            int r0 = r1.f1436b
            return r0
    }

    public void a(int r1, int r2) {
            r0 = this;
            r0.f1438d = r1
            r0.f1439e = r2
            r2 = 4
            java.lang.String r1 = cn.jiguang.q.a.a(r1, r2)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L15
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L15
            r0.f1440f = r1     // Catch: java.lang.Throwable -> L15
        L15:
            return
    }

    public void a(cn.jiguang.r.b r6) {
            r5 = this;
            boolean r0 = r5.equals(r6)
            if (r0 == 0) goto L70
            int r0 = r5.f1441g
            int r1 = r6.f1441g
            int r0 = r0 + r1
            r5.f1441g = r0
            int r0 = r5.f1442h
            int r1 = r6.f1442h
            int r0 = r0 + r1
            r5.f1442h = r0
            int r0 = r5.f1443i
            int r1 = r6.f1443i
            int r0 = r0 + r1
            r5.f1443i = r0
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r6.f1444j
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L25:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L70
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.Map<java.lang.String, java.lang.Integer> r2 = r5.f1444j
            boolean r2 = r2.containsKey(r1)
            if (r2 == 0) goto L60
            java.util.Map<java.lang.String, java.lang.Integer> r2 = r5.f1444j
            java.lang.Object r2 = r2.get(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.util.Map<java.lang.String, java.lang.Integer> r3 = r6.f1444j
            java.lang.Object r3 = r3.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r2 == 0) goto L25
            if (r3 == 0) goto L25
            java.util.Map<java.lang.String, java.lang.Integer> r4 = r5.f1444j
            int r2 = r2.intValue()
            int r3 = r3.intValue()
            int r2 = r2 + r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.put(r1, r2)
            goto L25
        L60:
            java.util.Map<java.lang.String, java.lang.Integer> r2 = r6.f1444j
            java.lang.Object r2 = r2.get(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L25
            java.util.Map<java.lang.String, java.lang.Integer> r3 = r5.f1444j
            r3.put(r1, r2)
            goto L25
        L70:
            return
    }

    public void a(java.lang.String r3) {
            r2 = this;
            int r0 = r2.f1443i
            int r0 = r0 + 1
            r2.f1443i = r0
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r2.f1444j
            java.lang.Object r0 = r0.get(r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L1b
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r2.f1444j
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r3, r1)
            return
        L1b:
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r2.f1444j
            int r0 = r0.intValue()
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.put(r3, r0)
            return
    }

    public void a(org.json.JSONObject r5) {
            r4 = this;
            if (r5 != 0) goto L4
            goto L7e
        L4:
            java.lang.String r0 = "type"
            int r0 = r5.optInt(r0)
            r4.f1436b = r0
            java.lang.String r0 = "cl"
            java.lang.String r0 = r5.optString(r0)
            r4.f1437c = r0
            java.lang.String r0 = "p_ver"
            int r0 = r5.optInt(r0)
            r4.f1439e = r0
            java.lang.String r0 = "plugin_id"
            int r0 = r5.optInt(r0)
            r4.f1438d = r0
            java.lang.String r0 = "l_ver"
            int r0 = r5.optInt(r0)
            r4.f1440f = r0
            java.lang.String r0 = "cnt_start"
            int r0 = r5.optInt(r0)
            r4.f1441g = r0
            java.lang.String r0 = "cnt_suc"
            int r0 = r5.optInt(r0)
            r4.f1442h = r0
            java.lang.String r0 = "cnt_fai"
            int r0 = r5.optInt(r0)
            r4.f1443i = r0
            java.lang.String r0 = "process_name"
            java.lang.String r0 = r5.optString(r0)
            r4.f1445k = r0
            java.lang.String r0 = "msg"
            org.json.JSONArray r5 = r5.optJSONArray(r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r4.f1444j = r0
            r0 = 0
        L5a:
            int r1 = r5.length()
            if (r0 >= r1) goto L7e
            org.json.JSONObject r1 = r5.optJSONObject(r0)
            if (r1 == 0) goto L7b
            java.lang.String r2 = "error_msg"
            java.lang.String r2 = r1.optString(r2)
            java.lang.String r3 = "count"
            int r1 = r1.optInt(r3)
            java.util.Map<java.lang.String, java.lang.Integer> r3 = r4.f1444j
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.put(r2, r1)
        L7b:
            int r0 = r0 + 1
            goto L5a
        L7e:
            return
    }

    public boolean b() {
            r2 = this;
            java.lang.String r0 = r2.f1445k
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L19
            android.content.Context r0 = r2.a
            if (r0 == 0) goto L19
            java.lang.String r1 = r2.f1445k
            java.lang.String r0 = r0.getPackageName()
            boolean r0 = r1.equals(r0)
            r0 = r0 ^ 1
            return r0
        L19:
            r0 = 0
            return r0
    }

    public void c() {
            r1 = this;
            int r0 = r1.f1441g
            int r0 = r0 + 1
            r1.f1441g = r0
            return
    }

    public void d() {
            r1 = this;
            int r0 = r1.f1442h
            int r0 = r0 + 1
            r1.f1442h = r0
            return
    }

    public java.lang.String e() {
            r7 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "cl"
            java.lang.String r2 = r7.f1437c     // Catch: java.lang.Throwable -> L7f
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r1 = "type"
            int r2 = r7.f1436b     // Catch: java.lang.Throwable -> L7f
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r1 = "p_ver"
            int r2 = r7.f1439e     // Catch: java.lang.Throwable -> L7f
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r1 = "plugin_id"
            int r2 = r7.f1438d     // Catch: java.lang.Throwable -> L7f
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r1 = "l_ver"
            int r2 = r7.f1440f     // Catch: java.lang.Throwable -> L7f
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r1 = "cnt_start"
            int r2 = r7.f1441g     // Catch: java.lang.Throwable -> L7f
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r1 = "cnt_suc"
            int r2 = r7.f1442h     // Catch: java.lang.Throwable -> L7f
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r1 = "cnt_fai"
            int r2 = r7.f1443i     // Catch: java.lang.Throwable -> L7f
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r1 = "process_name"
            java.lang.String r2 = r7.f1445k     // Catch: java.lang.Throwable -> L7f
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L7f
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r7.f1444j     // Catch: java.lang.Throwable -> L7f
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L7f
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L7f
            r2.<init>()     // Catch: java.lang.Throwable -> L7f
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L7f
        L53:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L7f
            if (r3 == 0) goto L7a
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L7f
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L7f
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L7f
            r4.<init>()     // Catch: java.lang.Throwable -> L7f
            java.lang.String r5 = "error_msg"
            java.lang.Object r6 = r3.getKey()     // Catch: java.lang.Throwable -> L7f
            r4.put(r5, r6)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r5 = "count"
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L7f
            r4.put(r5, r3)     // Catch: java.lang.Throwable -> L7f
            r2.put(r4)     // Catch: java.lang.Throwable -> L7f
            goto L53
        L7a:
            java.lang.String r1 = "msg"
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L7f
        L7f:
            java.lang.String r0 = r0.toString()
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L54
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L12
            goto L54
        L12:
            cn.jiguang.r.b r5 = (cn.jiguang.r.b) r5
            int r2 = r4.a()
            int r3 = r5.a()
            if (r2 == r3) goto L1f
            return r1
        L1f:
            int r2 = r4.f1439e
            int r3 = r5.f1439e
            if (r2 == r3) goto L26
            return r1
        L26:
            int r2 = r4.f1438d
            int r3 = r5.f1438d
            if (r2 == r3) goto L2d
            return r1
        L2d:
            int r2 = r4.f1440f
            int r3 = r5.f1440f
            if (r2 == r3) goto L34
            return r1
        L34:
            java.lang.String r2 = r4.f1437c
            if (r2 == 0) goto L41
            java.lang.String r3 = r5.f1437c
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L46
            goto L45
        L41:
            java.lang.String r2 = r5.f1437c
            if (r2 == 0) goto L46
        L45:
            return r1
        L46:
            java.lang.String r2 = r4.f1445k
            java.lang.String r5 = r5.f1445k
            if (r2 == 0) goto L51
            boolean r5 = r2.equals(r5)
            return r5
        L51:
            if (r5 != 0) goto L54
            return r0
        L54:
            return r1
    }

    public java.lang.String f() {
            r1 = this;
            java.lang.String r0 = r1.f1445k
            return r0
    }
}
