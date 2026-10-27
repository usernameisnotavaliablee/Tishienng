package cn.jiguang.ab;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class n {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f307b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f308c;

    /* renamed from: d, reason: collision with root package name */
    public long f309d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f310e;

    /* renamed from: f, reason: collision with root package name */
    public double f311f;

    /* renamed from: g, reason: collision with root package name */
    public double f312g;

    /* renamed from: h, reason: collision with root package name */
    public long f313h;

    /* renamed from: i, reason: collision with root package name */
    private int f314i;

    /* renamed from: j, reason: collision with root package name */
    private int f315j;

    /* renamed from: k, reason: collision with root package name */
    private int f316k;

    public n(int r2, java.lang.String r3, java.lang.String r4, long r5, java.lang.String r7, double r8, double r10, long r12) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f314i = r0
            r1.f315j = r0
            r1.f316k = r0
            r1.a = r2
            r1.f307b = r3
            r1.f308c = r4
            r1.f309d = r5
            r1.f310e = r7
            r1.f311f = r8
            r1.f312g = r10
            r1.f313h = r12
            return
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

    public cn.jiguang.ab.n a(int r1) {
            r0 = this;
            r0.f316k = r1
            return r0
    }

    public org.json.JSONObject a(java.util.Set<java.lang.String> r7) {
            r6 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "type"
            int r2 = r6.a     // Catch: org.json.JSONException -> L99
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L99
            java.lang.String r1 = "appkey"
            java.lang.String r2 = r6.f307b     // Catch: org.json.JSONException -> L99
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L99
            java.lang.String r1 = "sdkver"
            java.lang.String r2 = r6.f308c     // Catch: org.json.JSONException -> L99
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L99
            java.lang.String r1 = "platform"
            r2 = 0
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L99
            long r1 = r6.f309d     // Catch: org.json.JSONException -> L99
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L2d
            java.lang.String r3 = "uid"
            r0.put(r3, r1)     // Catch: org.json.JSONException -> L99
        L2d:
            java.lang.String r1 = r6.f310e     // Catch: org.json.JSONException -> L99
            if (r1 == 0) goto L36
            java.lang.String r2 = "opera"
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L99
        L36:
            double r1 = r6.f311f     // Catch: org.json.JSONException -> L99
            double r3 = r6.f312g     // Catch: org.json.JSONException -> L99
            boolean r1 = a(r1, r3)     // Catch: org.json.JSONException -> L99
            if (r1 == 0) goto L55
            java.lang.String r1 = "lat"
            double r2 = r6.f311f     // Catch: org.json.JSONException -> L99
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L99
            java.lang.String r1 = "lng"
            double r2 = r6.f312g     // Catch: org.json.JSONException -> L99
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L99
            java.lang.String r1 = "time"
            long r2 = r6.f313h     // Catch: org.json.JSONException -> L99
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L99
        L55:
            if (r7 == 0) goto L7b
            boolean r1 = r7.isEmpty()     // Catch: org.json.JSONException -> L99
            if (r1 != 0) goto L7b
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: org.json.JSONException -> L99
            r1.<init>()     // Catch: org.json.JSONException -> L99
            java.util.Iterator r7 = r7.iterator()     // Catch: org.json.JSONException -> L99
        L66:
            boolean r2 = r7.hasNext()     // Catch: org.json.JSONException -> L99
            if (r2 == 0) goto L76
            java.lang.Object r2 = r7.next()     // Catch: org.json.JSONException -> L99
            java.lang.String r2 = (java.lang.String) r2     // Catch: org.json.JSONException -> L99
            r1.put(r2)     // Catch: org.json.JSONException -> L99
            goto L66
        L76:
            java.lang.String r7 = "fail_ips"
            r0.put(r7, r1)     // Catch: org.json.JSONException -> L99
        L7b:
            int r7 = r6.f314i     // Catch: org.json.JSONException -> L99
            if (r7 == 0) goto L84
            java.lang.String r1 = "ips_flag"
            r0.put(r1, r7)     // Catch: org.json.JSONException -> L99
        L84:
            int r7 = r6.f315j     // Catch: org.json.JSONException -> L99
            if (r7 == 0) goto L8d
            java.lang.String r1 = "report_flag"
            r0.put(r1, r7)     // Catch: org.json.JSONException -> L99
        L8d:
            int r7 = r6.f316k     // Catch: org.json.JSONException -> L99
            if (r7 < 0) goto L99
            java.lang.String r1 = "cert_ver"
            if (r7 != 0) goto L96
            r7 = 1
        L96:
            r0.put(r1, r7)     // Catch: org.json.JSONException -> L99
        L99:
            return r0
    }
}
