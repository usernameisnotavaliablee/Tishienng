package cn.jiguang.ai;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c {
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private int f486b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f487c;

    /* renamed from: d, reason: collision with root package name */
    private java.lang.String f488d;

    /* renamed from: e, reason: collision with root package name */
    private java.lang.String f489e;

    /* renamed from: f, reason: collision with root package name */
    private long f490f;

    /* renamed from: g, reason: collision with root package name */
    private java.lang.String f491g;

    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    public cn.jiguang.ai.c a(int r1) {
            r0 = this;
            r0.f486b = r1
            return r0
    }

    public cn.jiguang.ai.c a(long r1) {
            r0 = this;
            r0.f490f = r1
            return r0
    }

    public cn.jiguang.ai.c a(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return r0
    }

    public void a(android.content.Context r5) {
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L44
            r0.<init>()     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = "deviceId"
            java.lang.String r2 = r4.a     // Catch: java.lang.Throwable -> L44
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = "imei"
            java.lang.String r2 = r4.f487c     // Catch: java.lang.Throwable -> L44
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = "androidId"
            java.lang.String r2 = r4.f488d     // Catch: java.lang.Throwable -> L44
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = "uuid"
            java.lang.String r2 = r4.f489e     // Catch: java.lang.Throwable -> L44
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = "genIdTimeStamp"
            long r2 = r4.f490f     // Catch: java.lang.Throwable -> L44
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L44
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = cn.jiguang.a.a.f243j     // Catch: java.lang.Throwable -> L44
            java.lang.String r0 = cn.jiguang.av.t.a(r0, r1)     // Catch: java.lang.Throwable -> L44
            cn.jiguang.e.a r1 = cn.jiguang.e.a.c()     // Catch: java.lang.Throwable -> L44
            cn.jiguang.e.a r0 = r1.a(r0)     // Catch: java.lang.Throwable -> L44
            r1 = 1
            cn.jiguang.e.a[] r1 = new cn.jiguang.e.a[r1]     // Catch: java.lang.Throwable -> L44
            r2 = 0
            r1[r2] = r0     // Catch: java.lang.Throwable -> L44
            cn.jiguang.e.b.a(r5, r1)     // Catch: java.lang.Throwable -> L44
        L44:
            return
    }

    public cn.jiguang.ai.c b(java.lang.String r1) {
            r0 = this;
            r0.f487c = r1
            return r0
    }

    public void b(android.content.Context r5) {
            r4 = this;
            cn.jiguang.e.a r0 = cn.jiguang.e.a.c()     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r5 = cn.jiguang.e.b.a(r5, r0)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L5b
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r1 = "RegKeyInfo"
            if (r0 == 0) goto L18
            java.lang.String r5 = "no sp cid info"
        L14:
            cn.jiguang.w.f.c(r1, r5)     // Catch: java.lang.Throwable -> L5b
            return
        L18:
            java.lang.String r0 = cn.jiguang.a.a.f243j     // Catch: java.lang.Throwable -> L5b
            java.lang.String r5 = cn.jiguang.av.t.b(r5, r0)     // Catch: java.lang.Throwable -> L5b
            int r2 = cn.jiguang.av.g.a     // Catch: java.lang.Throwable -> L5b
            r4.a(r2)     // Catch: java.lang.Throwable -> L5b
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L5b
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r5 = "deviceIdFromType"
            int r3 = r4.f486b     // Catch: java.lang.Throwable -> L5b
            r2.put(r5, r3)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r5 = "newImei"
            java.lang.String r3 = r4.f491g     // Catch: java.lang.Throwable -> L5b
            r2.put(r5, r3)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r5 = cn.jiguang.av.t.a(r5, r0)     // Catch: java.lang.Throwable -> L5b
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L5b
            if (r0 != 0) goto L49
            java.lang.String r0 = "r_key_info"
            cn.jiguang.av.i.a(r0, r5)     // Catch: java.lang.Throwable -> L5b
        L49:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5b
            r5.<init>()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r0 = "save reg key info: "
            r5.append(r0)     // Catch: java.lang.Throwable -> L5b
            r5.append(r2)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L5b
            goto L14
        L5b:
            return
    }

    public cn.jiguang.ai.c c(java.lang.String r1) {
            r0 = this;
            r0.f488d = r1
            return r0
    }

    public java.lang.String c(android.content.Context r5) {
            r4 = this;
            java.lang.String r5 = "r_key_info"
            java.lang.String r5 = cn.jiguang.av.i.e(r5)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            java.lang.String r1 = ""
            java.lang.String r2 = "RegKeyInfo"
            if (r0 == 0) goto L16
            java.lang.String r5 = "no reg info in cache"
            cn.jiguang.w.f.c(r2, r5)
            return r1
        L16:
            java.lang.String r0 = cn.jiguang.a.a.f243j
            java.lang.String r5 = cn.jiguang.av.t.b(r5, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "get reg key info: "
            r0.append(r3)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            cn.jiguang.w.f.c(r2, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L37
            return r5
        L37:
            return r1
    }

    public cn.jiguang.ai.c d(java.lang.String r1) {
            r0 = this;
            r0.f489e = r1
            return r0
    }

    public cn.jiguang.ai.c e(java.lang.String r1) {
            r0 = this;
            r0.f491g = r1
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "RegKeyInfo{deviceId='"
            r0.append(r1)
            java.lang.String r1 = r4.a
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r2 = ", deviceIdFromType="
            r0.append(r2)
            int r2 = r4.f486b
            r0.append(r2)
            java.lang.String r2 = ", imei='"
            r0.append(r2)
            java.lang.String r2 = r4.f487c
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", androidId='"
            r0.append(r2)
            java.lang.String r2 = r4.f488d
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", uuid='"
            r0.append(r2)
            java.lang.String r2 = r4.f489e
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", genIdTimeStamp="
            r0.append(r2)
            long r2 = r4.f490f
            r0.append(r2)
            java.lang.String r2 = ", newImei='"
            r0.append(r2)
            java.lang.String r2 = r4.f491g
            r0.append(r2)
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
