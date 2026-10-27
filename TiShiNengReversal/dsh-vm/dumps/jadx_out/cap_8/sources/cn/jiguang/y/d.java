package cn.jiguang.y;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class d {
    public long a;

    /* renamed from: b, reason: collision with root package name */
    public org.json.JSONObject f1559b;

    /* renamed from: c, reason: collision with root package name */
    private java.io.File f1560c;

    /* renamed from: d, reason: collision with root package name */
    private org.json.JSONObject f1561d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f1562e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1563f;

    private d(java.io.File r1, org.json.JSONObject r2, org.json.JSONObject r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.f1560c = r1
            r0.f1561d = r2
            r0.f1559b = r3
            long r1 = r1.length()
            r0.a = r1
            r0.f1563f = r4
            r0.f1562e = r4
            return
    }

    public static cn.jiguang.y.d a(java.io.File r3, java.util.Set<java.lang.String> r4) {
            org.json.JSONObject r0 = a(r3)
            if (r0 == 0) goto L11
            cn.jiguang.y.d r1 = new cn.jiguang.y.d
            org.json.JSONObject r4 = cn.jiguang.av.m.a(r0, r4)
            r2 = 0
            r1.<init>(r3, r0, r4, r2)
            return r1
        L11:
            cn.jiguang.av.i.b(r3)
            r3 = 0
            return r3
    }

    public static cn.jiguang.y.d a(java.io.File r3, org.json.JSONObject r4) {
            org.json.JSONObject r0 = a(r3)
            if (r0 == 0) goto Ld
            cn.jiguang.y.d r1 = new cn.jiguang.y.d
            r2 = 1
            r1.<init>(r3, r0, r4, r2)
            return r1
        Ld:
            cn.jiguang.av.i.b(r3)
            r3 = 0
            return r3
    }

    public static org.json.JSONObject a(java.io.File r1) {
            java.lang.String r1 = cn.jiguang.av.i.c(r1)     // Catch: java.lang.Throwable -> L1e
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto L1e
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1e
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r1 = "content"
            org.json.JSONArray r1 = r0.optJSONArray(r1)     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L1e
            int r1 = r1.length()     // Catch: java.lang.Throwable -> L1e
            if (r1 <= 0) goto L1e
            return r0
        L1e:
            r1 = 0
            return r1
    }

    public boolean a(cn.jiguang.y.d r8, java.io.File r9) {
            r7 = this;
            java.lang.String r0 = "content"
            r1 = 0
            if (r8 == 0) goto L3e
            long r2 = r7.a     // Catch: java.lang.Throwable -> L79
            long r4 = r8.a     // Catch: java.lang.Throwable -> L79
            long r2 = r2 + r4
            r4 = 40960(0xa000, double:2.0237E-319)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L3e
            org.json.JSONObject r9 = r7.f1561d     // Catch: java.lang.Throwable -> L79
            org.json.JSONArray r9 = r9.getJSONArray(r0)     // Catch: java.lang.Throwable -> L79
            org.json.JSONObject r2 = r8.f1561d     // Catch: java.lang.Throwable -> L79
            org.json.JSONArray r0 = r2.getJSONArray(r0)     // Catch: java.lang.Throwable -> L79
            r2 = 0
        L1e:
            int r3 = r0.length()     // Catch: java.lang.Throwable -> L79
            if (r2 >= r3) goto L2e
            org.json.JSONObject r3 = r0.getJSONObject(r2)     // Catch: java.lang.Throwable -> L79
            r9.put(r3)     // Catch: java.lang.Throwable -> L79
            int r2 = r2 + 1
            goto L1e
        L2e:
            long r2 = r7.a     // Catch: java.lang.Throwable -> L79
            long r4 = r8.a     // Catch: java.lang.Throwable -> L79
            long r2 = r2 + r4
            r7.a = r2     // Catch: java.lang.Throwable -> L79
            r9 = 1
            r7.f1562e = r9     // Catch: java.lang.Throwable -> L79
            java.io.File r8 = r8.f1560c     // Catch: java.lang.Throwable -> L79
            cn.jiguang.av.i.b(r8)     // Catch: java.lang.Throwable -> L79
            return r9
        L3e:
            boolean r8 = r9.exists()     // Catch: java.lang.Throwable -> L79
            if (r8 != 0) goto L47
            r9.mkdirs()     // Catch: java.lang.Throwable -> L79
        L47:
            java.io.File r8 = new java.io.File     // Catch: java.lang.Throwable -> L79
            java.io.File r0 = r7.f1560c     // Catch: java.lang.Throwable -> L79
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L79
            r8.<init>(r9, r0)     // Catch: java.lang.Throwable -> L79
            boolean r9 = r7.f1563f     // Catch: java.lang.Throwable -> L79
            if (r9 == 0) goto L5d
            org.json.JSONObject r9 = r7.f1561d     // Catch: java.lang.Throwable -> L79
            org.json.JSONObject r0 = r7.f1559b     // Catch: java.lang.Throwable -> L79
            cn.jiguang.av.m.a(r9, r0)     // Catch: java.lang.Throwable -> L79
        L5d:
            java.io.File r9 = r7.f1560c     // Catch: java.lang.Throwable -> L79
            boolean r9 = r9.equals(r8)     // Catch: java.lang.Throwable -> L79
            boolean r0 = r7.f1562e     // Catch: java.lang.Throwable -> L79
            if (r0 != 0) goto L69
            if (r9 != 0) goto L72
        L69:
            org.json.JSONObject r0 = r7.f1561d     // Catch: java.lang.Throwable -> L79
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L79
            cn.jiguang.av.i.b(r8, r0)     // Catch: java.lang.Throwable -> L79
        L72:
            if (r9 != 0) goto L79
            java.io.File r8 = r7.f1560c     // Catch: java.lang.Throwable -> L79
            cn.jiguang.av.i.b(r8)     // Catch: java.lang.Throwable -> L79
        L79:
            return r1
    }
}
