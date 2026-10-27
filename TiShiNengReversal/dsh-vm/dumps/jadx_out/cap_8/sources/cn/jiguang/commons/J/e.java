package cn.jiguang.commons.J;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class e extends cn.jiguang.commons.f.e {
    private static final java.lang.String l = null;
    private static final java.lang.String m = null;

    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    private static final class b {
        private static final cn.jiguang.commons.J.e a = null;

        static {
                cn.jiguang.commons.J.e r0 = new cn.jiguang.commons.J.e
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.commons.J.e.b.a = r0
                return
        }

        public b() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.commons.J.e a() {
                cn.jiguang.commons.J.e r0 = cn.jiguang.commons.J.e.b.a
                return r0
        }
    }

    static {
            r0 = 43
            byte[] r0 = new byte[r0]
            r0 = {x001c: FILL_ARRAY_DATA , data: [113, 124, 98, 97, 67, 26, 54, 39, 112, 114, 81, 80, 112, 38, 124, 97, 69, 83, 113, 38, 117, 127, 31, 76, 123, 123, 57, 103, 1, 15, 120, 120, 102, 118, 71, 67, 54, 123, 98, 112, 68, 85, 106} // fill-array
            java.lang.String r0 = cn.jiguang.commons.L.n.c(r0)
            cn.jiguang.commons.J.e.l = r0
            r0 = 48
            byte[] r0 = new byte[r0]
            r0 = {x0036: FILL_ARRAY_DATA , data: [72, 109, 124, 102, 98, 10, 15, 54, 110, 117, 112, 64, 73, 52, 97, 102, 103, 6, 14, 115, 120, 99, 98, 88, 14, 122, 102, 57, 125, 82, 83, 54, 126, 39, 62, 81, 80, 105, 111, 97, 114, 31, 83, 109, 105, 98, 100, 67} // fill-array
            java.lang.String r0 = cn.jiguang.commons.L.n.c(r0)
            cn.jiguang.commons.J.e.m = r0
            return
    }

    private e() {
            r6 = this;
            java.lang.String r2 = cn.jiguang.commons.a.d.a.f951e
            r3 = 86400000(0x5265c00, double:4.2687272E-316)
            java.lang.String r5 = "location_"
            java.lang.String r1 = "LocationConfigManager"
            r0 = r6
            r0.<init>(r1, r2, r3, r5)
            return
    }

    /* synthetic */ e(cn.jiguang.commons.J.e.a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    private java.lang.String a(long r4, java.lang.String r6, java.lang.String r7) {
            r3 = this;
            java.lang.String r0 = "LocationConfigManager"
            r1 = 0
            java.lang.String r7 = cn.jiguang.commons.L.k.d(r7)     // Catch: java.lang.Exception -> L2d
            java.lang.String r6 = cn.jiguang.commons.L.k.d(r6)     // Catch: java.lang.Exception -> L2d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2d
            r2.<init>()     // Catch: java.lang.Exception -> L2d
            r2.append(r4)     // Catch: java.lang.Exception -> L2d
            r2.append(r6)     // Catch: java.lang.Exception -> L2d
            r2.append(r7)     // Catch: java.lang.Exception -> L2d
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Exception -> L2d
            java.lang.String r6 = cn.jiguang.commons.L.k.d(r6)     // Catch: java.lang.Exception -> L2d
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Exception -> L2d
            if (r7 == 0) goto L2f
            java.lang.String r4 = "auth token gen failed"
            cn.jiguang.commons.w.a.f(r0, r4)     // Catch: java.lang.Exception -> L2d
            return r1
        L2d:
            r4 = move-exception
            goto L5f
        L2f:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2d
            r7.<init>()     // Catch: java.lang.Exception -> L2d
            r7.append(r4)     // Catch: java.lang.Exception -> L2d
            java.lang.String r4 = ":"
            r7.append(r4)     // Catch: java.lang.Exception -> L2d
            r7.append(r6)     // Catch: java.lang.Exception -> L2d
            java.lang.String r4 = r7.toString()     // Catch: java.lang.Exception -> L2d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2d
            r5.<init>()     // Catch: java.lang.Exception -> L2d
            java.lang.String r6 = "Basic "
            r5.append(r6)     // Catch: java.lang.Exception -> L2d
            byte[] r4 = r4.getBytes()     // Catch: java.lang.Exception -> L2d
            r6 = 10
            java.lang.String r4 = android.util.Base64.encodeToString(r4, r6)     // Catch: java.lang.Exception -> L2d
            r5.append(r4)     // Catch: java.lang.Exception -> L2d
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Exception -> L2d
            return r4
        L5f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "gen auth err:"
            r5.append(r6)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            cn.jiguang.commons.w.a.c(r0, r4)
            return r1
    }

    private void a(cn.jiguang.commons.c.m r5, org.json.JSONObject r6) {
            r4 = this;
            java.lang.String r0 = "enable"
            java.lang.String r1 = "0,0,0"
            java.lang.String r6 = r6.optString(r0, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L65
            java.lang.String r0 = ","
            java.lang.String[] r6 = r6.split(r0)
            int r0 = r6.length
            r1 = 3
            if (r0 < r1) goto L65
            r0 = 0
            r0 = r6[r0]
            java.lang.String r1 = "1"
            boolean r0 = r0.equals(r1)
            r2 = 1
            r2 = r6[r2]
            boolean r2 = r2.equals(r1)
            r3 = 2
            r6 = r6[r3]
            boolean r6 = r6.equals(r1)
            java.lang.String r1 = "gps_enabled"
            r5.a(r1, r0)
            java.lang.String r1 = "wifi_enabled"
            r5.a(r1, r2)
            java.lang.String r1 = "cell_enabled"
            r5.a(r1, r6)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "flags set - gps:"
            r5.append(r1)
            r5.append(r0)
            java.lang.String r0 = ", wifi:"
            r5.append(r0)
            r5.append(r2)
            java.lang.String r0 = ", cell:"
            r5.append(r0)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "LocationConfigManager"
            cn.jiguang.commons.w.a.a(r6, r5)
        L65:
            return
    }

    private void c(cn.jiguang.commons.c.m r6, org.json.JSONObject r7) {
            r5 = this;
            java.lang.String r0 = "g_interval"
            r1 = 240(0xf0, double:1.186E-321)
            long r0 = r7.optLong(r0, r1)
            java.lang.String r2 = "g_distance"
            r3 = 800(0x320, float:1.121E-42)
            int r7 = r7.optInt(r2, r3)
            r2 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            java.lang.String r4 = "gps_update_interval"
            r6.a(r4, r2)
            java.lang.String r2 = "gps_update_distance"
            r6.a(r2, r7)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r2 = "gps config - interval:"
            r6.append(r2)
            r6.append(r0)
            java.lang.String r0 = "s, distance:"
            r6.append(r0)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "LocationConfigManager"
            cn.jiguang.commons.w.a.a(r7, r6)
            return
    }

    private void d(cn.jiguang.commons.c.m r13, org.json.JSONObject r14) {
            r12 = this;
            java.lang.String r0 = "r_interval"
            r1 = 3600(0xe10, double:1.7786E-320)
            long r0 = r14.optLong(r0, r1)
            r2 = 1000(0x3e8, double:4.94E-321)
            long r4 = r0 * r2
            java.lang.String r6 = "report_interval"
            r13.a(r6, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "report interval:"
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = "s"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            java.lang.String r1 = "LocationConfigManager"
            cn.jiguang.commons.w.a.a(r1, r0)
            java.lang.String r0 = "b_interval"
            java.lang.String r4 = "800,800,800"
            java.lang.String r14 = r14.optString(r0, r4)
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 != 0) goto L93
            java.lang.String r0 = ","
            java.lang.String[] r14 = r14.split(r0)
            int r0 = r14.length
            r4 = 3
            if (r0 < r4) goto L93
            r0 = 0
            r0 = r14[r0]
            long r4 = java.lang.Long.parseLong(r0)
            r0 = 1
            r0 = r14[r0]
            long r6 = java.lang.Long.parseLong(r0)
            r0 = 2
            r14 = r14[r0]
            long r8 = java.lang.Long.parseLong(r14)
            long r10 = r4 * r2
            java.lang.String r14 = "gps_interval"
            r13.a(r14, r10)
            long r10 = r6 * r2
            java.lang.String r14 = "wifi_interval"
            r13.a(r14, r10)
            long r2 = r2 * r8
            java.lang.String r14 = "cell_interval"
            r13.a(r14, r2)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "intervals set - gps:"
            r13.append(r14)
            r13.append(r4)
            java.lang.String r14 = ", wifi:"
            r13.append(r14)
            r13.append(r6)
            java.lang.String r14 = ", cell:"
            r13.append(r14)
            r13.append(r8)
            java.lang.String r13 = r13.toString()
            cn.jiguang.commons.w.a.a(r1, r13)
        L93:
            return
    }

    private void e(cn.jiguang.commons.c.m r5, org.json.JSONObject r6) {
            r4 = this;
            java.lang.String r0 = "wi_level"
            r1 = -90
            int r0 = r6.optInt(r0, r1)
            java.lang.String r1 = "wi_count"
            r2 = 20
            int r1 = r6.optInt(r1, r2)
            java.lang.String r2 = "wi_percent"
            r3 = 30
            int r6 = r6.optInt(r2, r3)
            java.lang.String r2 = "wifi_min_level"
            r5.a(r2, r0)
            java.lang.String r2 = "wifi_count"
            r5.a(r2, r1)
            java.lang.String r2 = "new_wifi_percent"
            r5.a(r2, r6)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r2 = "wifi cfg:level="
            r5.append(r2)
            r5.append(r0)
            java.lang.String r0 = ",count="
            r5.append(r0)
            r5.append(r1)
            java.lang.String r0 = ",pct="
            r5.append(r0)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "LocationConfigManager"
            cn.jiguang.commons.w.a.a(r6, r5)
            return
    }

    public static cn.jiguang.commons.J.e i() {
            cn.jiguang.commons.J.e r0 = cn.jiguang.commons.J.e.b.a()
            return r0
    }

    @Override // cn.jiguang.commons.f.e
    protected cn.jiguang.commons.x.c a(java.lang.String r8, org.json.JSONObject r9) {
            r7 = this;
            java.lang.String r0 = "LocationConfigManager"
            java.lang.String r1 = "application/json"
            cn.jiguang.commons.g.p r2 = cn.jiguang.commons.g.p.e()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r2 = r2.j()     // Catch: java.lang.Throwable -> L5c
            cn.jiguang.commons.g.p r3 = cn.jiguang.commons.g.p.e()     // Catch: java.lang.Throwable -> L5c
            long r3 = r3.l()     // Catch: java.lang.Throwable -> L5c
            cn.jiguang.commons.g.p r5 = cn.jiguang.commons.g.p.e()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r5 = r5.d()     // Catch: java.lang.Throwable -> L5c
            cn.jiguang.commons.x.c r6 = new cn.jiguang.commons.x.c     // Catch: java.lang.Throwable -> L5c
            r6.<init>(r8)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r8 = "Content-Type"
            r6.a(r8, r1)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r8 = "Accept"
            r6.a(r8, r1)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r8 = "X-Http-Platform"
            java.lang.String r1 = "android"
            r6.a(r8, r1)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r8 = "X-Http-Appkey"
            r6.a(r8, r5)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r8 = "Authorization"
            java.lang.String r1 = r9.toString()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r1 = r7.a(r3, r2, r1)     // Catch: java.lang.Throwable -> L5c
            r6.a(r8, r1)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r8 = "Charset"
            java.lang.String r1 = "UTF-8"
            r6.a(r8, r1)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r8 = r9.toString()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r8 = cn.jiguang.commons.L.ad.e(r8)     // Catch: java.lang.Throwable -> L5c
            r6.a(r8)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r8 = "create http req ok"
            cn.jiguang.commons.w.a.a(r0, r8)     // Catch: java.lang.Throwable -> L5c
            return r6
        L5c:
            r8 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r1 = "create http req err:"
            r9.append(r1)
            java.lang.String r8 = r8.getMessage()
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            cn.jiguang.commons.w.a.c(r0, r8)
            r8 = 0
            return r8
    }

    @Override // cn.jiguang.commons.f.e
    protected /* synthetic */ java.lang.Object a(java.lang.String r1) {
            r0 = this;
            cn.jiguang.commons.c.m r1 = r0.c(r1)
            return r1
    }

    @Override // cn.jiguang.commons.f.e
    protected org.json.JSONObject a() {
            r10 = this;
            java.lang.String r0 = "LocationConfigManager"
            r1 = 0
            cn.jiguang.commons.g.p r2 = cn.jiguang.commons.g.p.e()     // Catch: java.lang.Exception -> La2
            java.lang.String r2 = r2.d()     // Catch: java.lang.Exception -> La2
            cn.jiguang.commons.g.p r3 = cn.jiguang.commons.g.p.e()     // Catch: java.lang.Exception -> La2
            long r3 = r3.l()     // Catch: java.lang.Exception -> La2
            boolean r5 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> La2
            r6 = 0
            r7 = 1
            if (r5 != 0) goto La4
            r8 = 0
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 > 0) goto L23
            goto La4
        L23:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Exception -> La2
            r5.<init>()     // Catch: java.lang.Exception -> La2
            java.lang.String r8 = "appkey"
            r5.put(r8, r2)     // Catch: java.lang.Exception -> La2
            java.lang.String r2 = "uid"
            r5.put(r2, r3)     // Catch: java.lang.Exception -> La2
            java.lang.String r2 = "platform"
            java.lang.String r3 = "a"
            r5.put(r2, r3)     // Catch: java.lang.Exception -> La2
            java.lang.String r2 = "user_enable"
            cn.jiguang.commons.f.k r3 = cn.jiguang.commons.f.k.a()     // Catch: java.lang.Exception -> La2
            r4 = 1502(0x5de, float:2.105E-42)
            boolean r3 = r3.a(r4)     // Catch: java.lang.Exception -> La2
            r5.put(r2, r3)     // Catch: java.lang.Exception -> La2
            java.lang.String r2 = "rom"
            cn.jiguang.commons.g.n r3 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Exception -> La2
            r4 = 1019(0x3fb, float:1.428E-42)
            java.lang.String r3 = r3.d(r4, r7)     // Catch: java.lang.Exception -> La2
            r5.put(r2, r3)     // Catch: java.lang.Exception -> La2
            java.lang.String r2 = "manufacturer"
            cn.jiguang.commons.g.n r3 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Exception -> La2
            r4 = 1011(0x3f3, float:1.417E-42)
            java.lang.String r3 = r3.d(r4)     // Catch: java.lang.Exception -> La2
            r5.put(r2, r3)     // Catch: java.lang.Exception -> La2
            java.lang.String r2 = "model"
            cn.jiguang.commons.g.n r3 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Exception -> La2
            r4 = 1013(0x3f5, float:1.42E-42)
            java.lang.String r3 = r3.d(r4)     // Catch: java.lang.Exception -> La2
            r5.put(r2, r3)     // Catch: java.lang.Exception -> La2
            java.lang.String r2 = "osversion"
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> La2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> La2
            r5.put(r2, r3)     // Catch: java.lang.Exception -> La2
            java.lang.String r2 = "itime"
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> La2
            r5.put(r2, r3)     // Catch: java.lang.Exception -> La2
            java.lang.String r2 = "apitype"
            r5.put(r2, r6)     // Catch: java.lang.Exception -> La2
            java.lang.String r2 = "coreversion"
            cn.jiguang.commons.g.p r3 = cn.jiguang.commons.g.p.e()     // Catch: java.lang.Exception -> La2
            java.lang.String r3 = r3.g()     // Catch: java.lang.Exception -> La2
            r5.put(r2, r3)     // Catch: java.lang.Exception -> La2
            java.lang.String r2 = "build params ok"
            cn.jiguang.commons.w.a.a(r0, r2)     // Catch: java.lang.Exception -> La2
            return r5
        La2:
            r2 = move-exception
            goto Lc4
        La4:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> La2
            r5.<init>()     // Catch: java.lang.Exception -> La2
            java.lang.String r8 = "invalid params - appkey:"
            r5.append(r8)     // Catch: java.lang.Exception -> La2
            if (r2 == 0) goto Lb1
            r6 = 1
        Lb1:
            r5.append(r6)     // Catch: java.lang.Exception -> La2
            java.lang.String r2 = ", uid:"
            r5.append(r2)     // Catch: java.lang.Exception -> La2
            r5.append(r3)     // Catch: java.lang.Exception -> La2
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Exception -> La2
            cn.jiguang.commons.w.a.f(r0, r2)     // Catch: java.lang.Exception -> La2
            return r1
        Lc4:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "build params err:"
            r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            cn.jiguang.commons.w.a.c(r0, r2)
            return r1
    }

    protected boolean a(cn.jiguang.commons.c.m r1) {
            r0 = this;
            if (r1 == 0) goto L4
            r1 = 1
            return r1
        L4:
            r1 = 0
            return r1
    }

    @Override // cn.jiguang.commons.f.e
    protected /* bridge */ /* synthetic */ boolean a(java.lang.Object r1) {
            r0 = this;
            cn.jiguang.commons.c.m r1 = (cn.jiguang.commons.c.m) r1
            boolean r1 = r0.a(r1)
            return r1
    }

    protected cn.jiguang.commons.c.m c(java.lang.String r6) {
            r5 = this;
            java.lang.String r0 = ""
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            r2 = 0
            java.lang.String r3 = "LocationConfigManager"
            if (r1 == 0) goto L11
            java.lang.String r6 = "config str empty"
            cn.jiguang.commons.w.a.f(r3, r6)
            return r2
        L11:
            java.lang.String r6 = cn.jiguang.commons.L.ad.d(r6)     // Catch: java.lang.Exception -> L6a org.json.JSONException -> L6c
            java.lang.String r1 = "parse config start"
            cn.jiguang.commons.w.a.a(r3, r1)     // Catch: java.lang.Exception -> L6a org.json.JSONException -> L6c
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L6a org.json.JSONException -> L6c
            r1.<init>(r6)     // Catch: java.lang.Exception -> L6a org.json.JSONException -> L6c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L6a org.json.JSONException -> L6c
            r6.<init>()     // Catch: java.lang.Exception -> L6a org.json.JSONException -> L6c
            java.lang.String r4 = "parse config ok="
            r6.append(r4)     // Catch: java.lang.Exception -> L6a org.json.JSONException -> L6c
            r6.append(r1)     // Catch: java.lang.Exception -> L6a org.json.JSONException -> L6c
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> L6a org.json.JSONException -> L6c
            cn.jiguang.commons.w.a.a(r3, r6)     // Catch: java.lang.Exception -> L6a org.json.JSONException -> L6c
            java.lang.String r6 = "code"
            r4 = -1
            int r6 = r1.optInt(r6, r4)     // Catch: java.lang.Exception -> L6a org.json.JSONException -> L6c
            if (r6 != 0) goto L6e
            cn.jiguang.commons.c.m r6 = new cn.jiguang.commons.c.m     // Catch: java.lang.Exception -> L6a org.json.JSONException -> L6c
            r6.<init>()     // Catch: java.lang.Exception -> L6a org.json.JSONException -> L6c
            java.lang.String r4 = "process flat config"
            cn.jiguang.commons.w.a.a(r3, r4)     // Catch: java.lang.Exception -> L6a org.json.JSONException -> L6c
            java.lang.String r4 = "pkgList"
            java.lang.String r4 = r1.optString(r4, r0)     // Catch: java.lang.Exception -> L6a org.json.JSONException -> L6c
            r6.g(r4)     // Catch: java.lang.Exception -> L6a org.json.JSONException -> L6c
            java.lang.String r4 = "servList"
            java.lang.String r0 = r1.optString(r4, r0)     // Catch: java.lang.Exception -> L6a org.json.JSONException -> L6c
            r6.h(r0)     // Catch: java.lang.Exception -> L6a org.json.JSONException -> L6c
            r5.a(r6, r1)     // Catch: java.lang.Exception -> L6a org.json.JSONException -> L6c
            r5.d(r6, r1)     // Catch: java.lang.Exception -> L6a org.json.JSONException -> L6c
            r5.e(r6, r1)     // Catch: java.lang.Exception -> L6a org.json.JSONException -> L6c
            r5.c(r6, r1)     // Catch: java.lang.Exception -> L6a org.json.JSONException -> L6c
            java.lang.String r0 = "config parse success"
            cn.jiguang.commons.w.a.a(r3, r0)     // Catch: java.lang.Exception -> L6a org.json.JSONException -> L6c
            return r6
        L6a:
            r6 = move-exception
            goto L83
        L6c:
            r6 = move-exception
            goto L9c
        L6e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L6a org.json.JSONException -> L6c
            r0.<init>()     // Catch: java.lang.Exception -> L6a org.json.JSONException -> L6c
            java.lang.String r1 = "config code not 0:"
            r0.append(r1)     // Catch: java.lang.Exception -> L6a org.json.JSONException -> L6c
            r0.append(r6)     // Catch: java.lang.Exception -> L6a org.json.JSONException -> L6c
            java.lang.String r6 = r0.toString()     // Catch: java.lang.Exception -> L6a org.json.JSONException -> L6c
            cn.jiguang.commons.w.a.f(r3, r6)     // Catch: java.lang.Exception -> L6a org.json.JSONException -> L6c
            goto La4
        L83:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "parse config err:"
        L8a:
            r0.append(r1)
            java.lang.String r6 = r6.getMessage()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            cn.jiguang.commons.w.a.c(r3, r6)
            goto La4
        L9c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "json parse err:"
            goto L8a
        La4:
            return r2
    }

    @Override // cn.jiguang.commons.f.e
    protected /* synthetic */ java.lang.Object c() {
            r1 = this;
            cn.jiguang.commons.c.m r0 = r1.h()
            return r0
    }

    @Override // cn.jiguang.commons.f.e
    protected void d() {
            r2 = this;
            java.util.concurrent.CopyOnWriteArrayList r0 = r2.f1097c
            r0.clear()
            java.util.concurrent.CopyOnWriteArrayList r0 = r2.f1097c
            java.lang.String r1 = cn.jiguang.commons.J.e.l
            r0.add(r1)
            java.util.concurrent.CopyOnWriteArrayList r0 = r2.f1097c
            java.lang.String r1 = cn.jiguang.commons.J.e.m
            r0.add(r1)
            return
    }

    protected cn.jiguang.commons.c.m h() {
            r4 = this;
            cn.jiguang.commons.c.m r0 = new cn.jiguang.commons.c.m
            r0.<init>()
            java.lang.String r1 = "gps_enabled"
            r2 = 1
            r0.a(r1, r2)
            java.lang.String r1 = "wifi_enabled"
            r0.a(r1, r2)
            java.lang.String r1 = "cell_enabled"
            r0.a(r1, r2)
            java.lang.String r1 = "report_interval"
            r2 = 3600000(0x36ee80, double:1.7786363E-317)
            r0.a(r1, r2)
            java.lang.String r1 = "gps_interval"
            r2 = 240000(0x3a980, double:1.18576E-318)
            r0.a(r1, r2)
            java.lang.String r1 = "wifi_interval"
            r2 = 800000(0xc3500, double:3.952525E-318)
            r0.a(r1, r2)
            java.lang.String r1 = "cell_interval"
            r0.a(r1, r2)
            java.lang.String r1 = "wifi_min_level"
            r2 = -90
            r0.a(r1, r2)
            java.lang.String r1 = "wifi_count"
            r2 = 20
            r0.a(r1, r2)
            java.lang.String r1 = "new_wifi_percent"
            r2 = 30
            r0.a(r1, r2)
            java.lang.String r1 = "gps_update_distance"
            r2 = 800(0x320, float:1.121E-42)
            r0.a(r1, r2)
            return r0
    }
}
