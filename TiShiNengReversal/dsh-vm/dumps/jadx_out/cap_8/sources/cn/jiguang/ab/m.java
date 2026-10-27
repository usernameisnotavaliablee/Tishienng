package cn.jiguang.ab;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class m {
    public java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    public int f297b;

    /* renamed from: c, reason: collision with root package name */
    public cn.jiguang.ab.g f298c;

    /* renamed from: d, reason: collision with root package name */
    public long f299d;

    /* renamed from: e, reason: collision with root package name */
    public long f300e;

    /* renamed from: f, reason: collision with root package name */
    public long f301f;

    /* renamed from: g, reason: collision with root package name */
    public int f302g;

    /* renamed from: h, reason: collision with root package name */
    public double f303h;

    /* renamed from: i, reason: collision with root package name */
    public double f304i;

    /* renamed from: j, reason: collision with root package name */
    public long f305j;

    /* renamed from: k, reason: collision with root package name */
    public int f306k;

    public m() {
            r0 = this;
            r0.<init>()
            return
    }

    public static cn.jiguang.ab.m a(org.json.JSONObject r4) {
            r0 = 0
            if (r4 == 0) goto L6c
            int r1 = r4.length()
            if (r1 != 0) goto La
            goto L6c
        La:
            cn.jiguang.ab.m r1 = new cn.jiguang.ab.m     // Catch: org.json.JSONException -> L6c
            r1.<init>()     // Catch: org.json.JSONException -> L6c
            java.lang.String r2 = "appkey"
            java.lang.String r2 = r4.optString(r2)     // Catch: org.json.JSONException -> L6c
            r1.a = r2     // Catch: org.json.JSONException -> L6c
            java.lang.String r2 = "type"
            int r2 = r4.getInt(r2)     // Catch: org.json.JSONException -> L6c
            r1.f297b = r2     // Catch: org.json.JSONException -> L6c
            java.lang.String r2 = "addr"
            java.lang.String r2 = r4.getString(r2)     // Catch: org.json.JSONException -> L6c
            cn.jiguang.ab.g r2 = cn.jiguang.ab.g.a(r2)     // Catch: org.json.JSONException -> L6c
            r1.f298c = r2     // Catch: org.json.JSONException -> L6c
            java.lang.String r2 = "rtime"
            long r2 = r4.getLong(r2)     // Catch: org.json.JSONException -> L6c
            r1.f300e = r2     // Catch: org.json.JSONException -> L6c
            java.lang.String r2 = "interval"
            long r2 = r4.getLong(r2)     // Catch: org.json.JSONException -> L6c
            r1.f301f = r2     // Catch: org.json.JSONException -> L6c
            java.lang.String r2 = "net"
            int r2 = r4.getInt(r2)     // Catch: org.json.JSONException -> L6c
            r1.f302g = r2     // Catch: org.json.JSONException -> L6c
            java.lang.String r2 = "code"
            int r2 = r4.getInt(r2)     // Catch: org.json.JSONException -> L6c
            r1.f306k = r2     // Catch: org.json.JSONException -> L6c
            java.lang.String r2 = "uid"
            long r2 = r4.optLong(r2)     // Catch: org.json.JSONException -> L6c
            r1.f299d = r2     // Catch: org.json.JSONException -> L6c
            java.lang.String r2 = "lat"
            double r2 = r4.optDouble(r2)     // Catch: org.json.JSONException -> L6c
            r1.f303h = r2     // Catch: org.json.JSONException -> L6c
            java.lang.String r2 = "lng"
            double r2 = r4.optDouble(r2)     // Catch: org.json.JSONException -> L6c
            r1.f304i = r2     // Catch: org.json.JSONException -> L6c
            java.lang.String r2 = "ltime"
            long r2 = r4.optLong(r2)     // Catch: org.json.JSONException -> L6c
            r1.f305j = r2     // Catch: org.json.JSONException -> L6c
            return r1
        L6c:
            return r0
    }

    public static java.util.LinkedList<cn.jiguang.ab.m> a(java.lang.String r3) {
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L25
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: org.json.JSONException -> L25
            r1.<init>(r3)     // Catch: org.json.JSONException -> L25
            r3 = 0
        L11:
            int r2 = r1.length()     // Catch: org.json.JSONException -> L25
            if (r3 >= r2) goto L25
            org.json.JSONObject r2 = r1.getJSONObject(r3)     // Catch: org.json.JSONException -> L25
            cn.jiguang.ab.m r2 = a(r2)     // Catch: org.json.JSONException -> L25
            r0.add(r2)     // Catch: org.json.JSONException -> L25
            int r3 = r3 + 1
            goto L11
        L25:
            return r0
    }

    private static boolean a(double r3, double r5) {
            r0 = -4587338432941916160(0xc056800000000000, double:-90.0)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 <= 0) goto L26
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 >= 0) goto L26
            r3 = -4582834833314545664(0xc066800000000000, double:-180.0)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L26
            r3 = 4640537203540230144(0x4066800000000000, double:180.0)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 >= 0) goto L26
            r3 = 1
            return r3
        L26:
            r3 = 0
            return r3
    }

    public org.json.JSONObject a() {
            r6 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = r6.a     // Catch: org.json.JSONException -> L6e
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: org.json.JSONException -> L6e
            if (r1 != 0) goto L14
            java.lang.String r1 = "appkey"
            java.lang.String r2 = r6.a     // Catch: org.json.JSONException -> L6e
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L6e
        L14:
            java.lang.String r1 = "type"
            int r2 = r6.f297b     // Catch: org.json.JSONException -> L6e
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L6e
            java.lang.String r1 = "addr"
            cn.jiguang.ab.g r2 = r6.f298c     // Catch: org.json.JSONException -> L6e
            java.lang.String r2 = r2.toString()     // Catch: org.json.JSONException -> L6e
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L6e
            java.lang.String r1 = "rtime"
            long r2 = r6.f300e     // Catch: org.json.JSONException -> L6e
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L6e
            java.lang.String r1 = "interval"
            long r2 = r6.f301f     // Catch: org.json.JSONException -> L6e
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L6e
            java.lang.String r1 = "net"
            int r2 = r6.f302g     // Catch: org.json.JSONException -> L6e
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L6e
            java.lang.String r1 = "code"
            int r2 = r6.f306k     // Catch: org.json.JSONException -> L6e
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L6e
            long r1 = r6.f299d     // Catch: org.json.JSONException -> L6e
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L4f
            java.lang.String r3 = "uid"
            r0.put(r3, r1)     // Catch: org.json.JSONException -> L6e
        L4f:
            double r1 = r6.f303h     // Catch: org.json.JSONException -> L6e
            double r3 = r6.f304i     // Catch: org.json.JSONException -> L6e
            boolean r1 = a(r1, r3)     // Catch: org.json.JSONException -> L6e
            if (r1 == 0) goto L6e
            java.lang.String r1 = "lat"
            double r2 = r6.f303h     // Catch: org.json.JSONException -> L6e
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L6e
            java.lang.String r1 = "lng"
            double r2 = r6.f304i     // Catch: org.json.JSONException -> L6e
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L6e
            java.lang.String r1 = "ltime"
            long r2 = r6.f305j     // Catch: org.json.JSONException -> L6e
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L6e
        L6e:
            return r0
    }
}
