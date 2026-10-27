package cn.jiguang.commons.I;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a extends cn.jiguang.commons.a.c {
    private boolean a;

    /* renamed from: c, reason: collision with root package name */
    private boolean f814c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f815d;

    /* renamed from: cn.jiguang.commons.I.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0029a {
        public C0029a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    private static class b {
        private static final cn.jiguang.commons.I.a a = null;

        static {
                cn.jiguang.commons.I.a r0 = new cn.jiguang.commons.I.a
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.commons.I.a.b.a = r0
                return
        }

        public b() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.commons.I.a a() {
                cn.jiguang.commons.I.a r0 = cn.jiguang.commons.I.a.b.a
                return r0
        }
    }

    private a() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            r1.f814c = r0
            r1.f815d = r0
            return
    }

    /* synthetic */ a(cn.jiguang.commons.I.a.C0029a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    private org.json.JSONArray a(cn.jiguang.commons.c.j r6) {
            r5 = this;
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L57
            r1.<init>()     // Catch: java.lang.Exception -> L57
            java.lang.String r2 = "itime"
            long r3 = r6.a     // Catch: java.lang.Exception -> L57
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Exception -> L57
            r5.a(r1, r2, r3)     // Catch: java.lang.Exception -> L57
            java.lang.String r2 = "tag"
            java.lang.String r3 = r6.f1046d     // Catch: java.lang.Exception -> L57
            r5.a(r1, r2, r3)     // Catch: java.lang.Exception -> L57
            java.lang.String r2 = "lat"
            double r3 = r6.f1047e     // Catch: java.lang.Exception -> L57
            java.lang.Double r3 = java.lang.Double.valueOf(r3)     // Catch: java.lang.Exception -> L57
            r5.a(r1, r2, r3)     // Catch: java.lang.Exception -> L57
            java.lang.String r2 = "lng"
            double r3 = r6.f1048f     // Catch: java.lang.Exception -> L57
            java.lang.Double r3 = java.lang.Double.valueOf(r3)     // Catch: java.lang.Exception -> L57
            r5.a(r1, r2, r3)     // Catch: java.lang.Exception -> L57
            java.lang.String r2 = "alt"
            double r3 = r6.f1049g     // Catch: java.lang.Exception -> L57
            java.lang.Double r3 = java.lang.Double.valueOf(r3)     // Catch: java.lang.Exception -> L57
            r5.a(r1, r2, r3)     // Catch: java.lang.Exception -> L57
            java.lang.String r2 = "bear"
            double r3 = r6.f1050h     // Catch: java.lang.Exception -> L57
            java.lang.Double r3 = java.lang.Double.valueOf(r3)     // Catch: java.lang.Exception -> L57
            r5.a(r1, r2, r3)     // Catch: java.lang.Exception -> L57
            java.lang.String r2 = "acc"
            double r3 = r6.f1051i     // Catch: java.lang.Exception -> L57
            java.lang.Double r6 = java.lang.Double.valueOf(r3)     // Catch: java.lang.Exception -> L57
            r5.a(r1, r2, r6)     // Catch: java.lang.Exception -> L57
            r0.put(r1)     // Catch: java.lang.Exception -> L57
            return r0
        L57:
            r6 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "buildGpsJsonArray err: "
            r1.append(r2)
            java.lang.String r6 = r6.getMessage()
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            java.lang.String r1 = "JLocation"
            cn.jiguang.commons.w.a.f(r1, r6)
            return r0
    }

    private org.json.JSONArray a(java.util.List r7) {
            r6 = this;
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Exception -> L7e
        L9:
            boolean r1 = r7.hasNext()     // Catch: java.lang.Exception -> L7e
            if (r1 == 0) goto L80
            java.lang.Object r1 = r7.next()     // Catch: java.lang.Exception -> L7e
            cn.jiguang.commons.c.h r1 = (cn.jiguang.commons.c.h) r1     // Catch: java.lang.Exception -> L7e
            if (r1 != 0) goto L18
            goto L9
        L18:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L7e
            r2.<init>()     // Catch: java.lang.Exception -> L7e
            java.lang.String r3 = "itime"
            cn.jiguang.commons.g.p r4 = cn.jiguang.commons.g.p.e()     // Catch: java.lang.Exception -> L7e
            long r4 = r4.k()     // Catch: java.lang.Exception -> L7e
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Exception -> L7e
            r6.a(r2, r3, r4)     // Catch: java.lang.Exception -> L7e
            java.lang.String r3 = "radio_type"
            java.lang.String r4 = r1.f1034i     // Catch: java.lang.Exception -> L7e
            r6.a(r2, r3, r4)     // Catch: java.lang.Exception -> L7e
            java.lang.String r3 = "generation"
            java.lang.String r4 = r1.f1033h     // Catch: java.lang.Exception -> L7e
            r6.a(r2, r3, r4)     // Catch: java.lang.Exception -> L7e
            java.lang.String r3 = "carrier"
            java.lang.String r4 = r1.f1032g     // Catch: java.lang.Exception -> L7e
            r6.a(r2, r3, r4)     // Catch: java.lang.Exception -> L7e
            java.lang.String r3 = "mobile_country_code"
            int r4 = r1.f1029d     // Catch: java.lang.Exception -> L7e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L7e
            r6.a(r2, r3, r4)     // Catch: java.lang.Exception -> L7e
            java.lang.String r3 = "mobile_network_code"
            int r4 = r1.f1030e     // Catch: java.lang.Exception -> L7e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L7e
            r6.a(r2, r3, r4)     // Catch: java.lang.Exception -> L7e
            java.lang.String r3 = "signal_strength"
            int r4 = r1.f1035j     // Catch: java.lang.Exception -> L7e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L7e
            r6.a(r2, r3, r4)     // Catch: java.lang.Exception -> L7e
            java.lang.String r3 = "cell_id"
            long r4 = r1.a     // Catch: java.lang.Exception -> L7e
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Exception -> L7e
            r6.a(r2, r3, r4)     // Catch: java.lang.Exception -> L7e
            java.lang.String r3 = "location_area_code"
            int r1 = r1.f1028c     // Catch: java.lang.Exception -> L7e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Exception -> L7e
            r6.a(r2, r3, r1)     // Catch: java.lang.Exception -> L7e
            r0.put(r2)     // Catch: java.lang.Exception -> L7e
            goto L9
        L7e:
            r7 = move-exception
            goto L81
        L80:
            return r0
        L81:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "buildCellJsonArray err: "
            r1.append(r2)
            java.lang.String r7 = r7.getMessage()
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            java.lang.String r1 = "JLocation"
            cn.jiguang.commons.w.a.f(r1, r7)
            return r0
    }

    private org.json.JSONObject a(java.util.List r3, java.util.List r4, cn.jiguang.commons.c.j r5, boolean r6) {
            r2 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            if (r3 == 0) goto L20
            boolean r1 = r3.isEmpty()     // Catch: java.lang.Exception -> L1e
            if (r1 != 0) goto L20
            org.json.JSONArray r3 = r2.c(r3)     // Catch: java.lang.Exception -> L1e
            int r1 = r3.length()     // Catch: java.lang.Exception -> L1e
            if (r1 <= 0) goto L20
            java.lang.String r1 = "wifi"
            r0.put(r1, r3)     // Catch: java.lang.Exception -> L1e
            goto L20
        L1e:
            r3 = move-exception
            goto L4c
        L20:
            if (r4 == 0) goto L31
            org.json.JSONArray r3 = r2.a(r4)     // Catch: java.lang.Exception -> L1e
            int r4 = r3.length()     // Catch: java.lang.Exception -> L1e
            if (r4 <= 0) goto L31
            java.lang.String r4 = "cell"
            r0.put(r4, r3)     // Catch: java.lang.Exception -> L1e
        L31:
            if (r5 == 0) goto L42
            org.json.JSONArray r3 = r2.a(r5)     // Catch: java.lang.Exception -> L1e
            int r4 = r3.length()     // Catch: java.lang.Exception -> L1e
            if (r4 <= 0) goto L42
            java.lang.String r4 = "gps"
            r0.put(r4, r3)     // Catch: java.lang.Exception -> L1e
        L42:
            int r3 = r0.length()     // Catch: java.lang.Exception -> L1e
            if (r3 <= 0) goto L4b
            r2.a(r0, r6)     // Catch: java.lang.Exception -> L1e
        L4b:
            return r0
        L4c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "buildCompleteLocationData err: "
            r4.append(r5)
            java.lang.String r3 = r3.getMessage()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "JLocation"
            cn.jiguang.commons.w.a.f(r4, r3)
            return r0
    }

    private void a(org.json.JSONObject r4) {
            r3 = this;
            java.lang.String r0 = "JLocation"
            java.lang.String r1 = "report loc data success"
            cn.jiguang.commons.w.a.a(r0, r1)     // Catch: java.lang.Exception -> L11
            cn.jiguang.commons.g.p r1 = cn.jiguang.commons.g.p.e()     // Catch: java.lang.Exception -> L11
            java.lang.String r2 = "loc_info"
            r1.a(r4, r2)     // Catch: java.lang.Exception -> L11
            return
        L11:
            r4 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "reportLocationData err: "
            r1.append(r2)
            java.lang.String r4 = r4.getMessage()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            cn.jiguang.commons.w.a.f(r0, r4)
            return
    }

    private void a(org.json.JSONObject r1, java.lang.String r2, java.lang.Object r3) {
            r0 = this;
            if (r2 == 0) goto L7
            if (r3 == 0) goto L7
            r1.put(r2, r3)     // Catch: java.lang.Exception -> L7
        L7:
            return
    }

    private void a(org.json.JSONObject r9, java.util.ArrayList r10, int r11) {
            r8 = this;
            java.lang.String r0 = "JLocation"
            r1 = 0
            r2 = 0
        L4:
            int r3 = r10.size()     // Catch: java.lang.Exception -> L68
            if (r2 >= r3) goto L6a
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L68
            r3.<init>()     // Catch: java.lang.Exception -> L68
            r8.a(r9, r3)     // Catch: java.lang.Exception -> L68
            java.lang.String r4 = "wifi"
            java.lang.Object r5 = r10.get(r2)     // Catch: java.lang.Exception -> L68
            r3.put(r4, r5)     // Catch: java.lang.Exception -> L68
            java.lang.String r4 = "wifi_slice_index"
            int r5 = r2 + 1
            r3.put(r4, r5)     // Catch: java.lang.Exception -> L68
            java.lang.String r4 = "wifi_slice_count"
            int r6 = r10.size()     // Catch: java.lang.Exception -> L68
            r3.put(r4, r6)     // Catch: java.lang.Exception -> L68
            java.lang.String r4 = "wifi_total_count"
            r3.put(r4, r11)     // Catch: java.lang.Exception -> L68
            r8.a(r3)     // Catch: java.lang.Exception -> L68
            java.lang.String r3 = "wifi slice: %d/%d, count: %d"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Exception -> L68
            int r6 = r10.size()     // Catch: java.lang.Exception -> L68
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> L68
            java.lang.Object r2 = r10.get(r2)     // Catch: java.lang.Exception -> L68
            org.json.JSONArray r2 = (org.json.JSONArray) r2     // Catch: java.lang.Exception -> L68
            int r2 = r2.length()     // Catch: java.lang.Exception -> L68
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L68
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Exception -> L68
            r7[r1] = r4     // Catch: java.lang.Exception -> L68
            r4 = 1
            r7[r4] = r6     // Catch: java.lang.Exception -> L68
            r4 = 2
            r7[r4] = r2     // Catch: java.lang.Exception -> L68
            java.lang.String r2 = java.lang.String.format(r3, r7)     // Catch: java.lang.Exception -> L68
            cn.jiguang.commons.w.a.a(r0, r2)     // Catch: java.lang.Exception -> L68
            r2 = r5
            goto L4
        L68:
            r9 = move-exception
            goto L6b
        L6a:
            return
        L6b:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "wifi split err: "
            r10.append(r11)
            java.lang.String r9 = r9.getMessage()
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            cn.jiguang.commons.w.a.f(r0, r9)
            return
    }

    private void a(org.json.JSONObject r4, org.json.JSONObject r5) {
            r3 = this;
            java.util.Iterator r0 = r4.keys()     // Catch: java.lang.Exception -> L21
        L4:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Exception -> L21
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Exception -> L21
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L21
            java.lang.String r2 = "wifi"
            boolean r2 = r2.equals(r1)     // Catch: java.lang.Exception -> L21
            if (r2 != 0) goto L4
            java.lang.Object r2 = r4.get(r1)     // Catch: java.lang.Exception -> L21
            r5.put(r1, r2)     // Catch: java.lang.Exception -> L21
            goto L4
        L21:
            r4 = move-exception
            goto L24
        L23:
            return
        L24:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "copyNonWifiData err: "
            r5.append(r0)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "JLocation"
            cn.jiguang.commons.w.a.f(r5, r4)
            return
    }

    private void a(org.json.JSONObject r4, boolean r5) {
            r3 = this;
            cn.jiguang.commons.g.n r0 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Exception -> L31
            r1 = 1504(0x5e0, float:2.108E-42)
            java.lang.String r1 = r0.d(r1, r5)     // Catch: java.lang.Exception -> L31
            java.lang.String r2 = "network_type"
            r3.a(r4, r2, r1)     // Catch: java.lang.Exception -> L31
            r1 = 1503(0x5df, float:2.106E-42)
            java.lang.String r1 = r0.d(r1, r5)     // Catch: java.lang.Exception -> L31
            java.lang.String r2 = "local_dns"
            r3.a(r4, r2, r1)     // Catch: java.lang.Exception -> L31
            r1 = 2800(0xaf0, float:3.924E-42)
            java.lang.String r1 = r0.d(r1, r5)     // Catch: java.lang.Exception -> L31
            java.lang.String r2 = "ipv6"
            r3.a(r4, r2, r1)     // Catch: java.lang.Exception -> L31
            r1 = 2801(0xaf1, float:3.925E-42)
            java.lang.String r5 = r0.d(r1, r5)     // Catch: java.lang.Exception -> L31
            java.lang.String r0 = "ip2"
            r3.a(r4, r0, r5)     // Catch: java.lang.Exception -> L31
            return
        L31:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "addNetworkInfo err: "
            r5.append(r0)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "JLocation"
            cn.jiguang.commons.w.a.f(r5, r4)
            return
    }

    public static cn.jiguang.commons.I.a c() {
            cn.jiguang.commons.I.a r0 = cn.jiguang.commons.I.a.b.a()
            return r0
    }

    private org.json.JSONArray c(java.util.List r7) {
            r6 = this;
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Exception -> L5b
        L9:
            boolean r1 = r7.hasNext()     // Catch: java.lang.Exception -> L5b
            if (r1 == 0) goto L5d
            java.lang.Object r1 = r7.next()     // Catch: java.lang.Exception -> L5b
            cn.jiguang.commons.c.k r1 = (cn.jiguang.commons.c.k) r1     // Catch: java.lang.Exception -> L5b
            if (r1 != 0) goto L18
            goto L9
        L18:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L5b
            r2.<init>()     // Catch: java.lang.Exception -> L5b
            java.lang.String r3 = "itime"
            long r4 = r1.a     // Catch: java.lang.Exception -> L5b
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Exception -> L5b
            r6.a(r2, r3, r4)     // Catch: java.lang.Exception -> L5b
            java.lang.String r3 = "tag"
            java.lang.String r4 = r1.f1055d     // Catch: java.lang.Exception -> L5b
            r6.a(r2, r3, r4)     // Catch: java.lang.Exception -> L5b
            java.lang.String r3 = "ssid"
            java.lang.String r4 = r1.f1054c     // Catch: java.lang.Exception -> L5b
            if (r4 == 0) goto L36
            goto L38
        L36:
            java.lang.String r4 = "<unknown ssid>"
        L38:
            r6.a(r2, r3, r4)     // Catch: java.lang.Exception -> L5b
            java.lang.String r3 = "mac_address"
            java.lang.String r4 = r1.f1057f     // Catch: java.lang.Exception -> L5b
            r6.a(r2, r3, r4)     // Catch: java.lang.Exception -> L5b
            java.lang.String r3 = "signal_strength"
            int r1 = r1.f1056e     // Catch: java.lang.Exception -> L5b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Exception -> L5b
            r6.a(r2, r3, r1)     // Catch: java.lang.Exception -> L5b
            java.lang.String r1 = "age"
            r3 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L5b
            r6.a(r2, r1, r3)     // Catch: java.lang.Exception -> L5b
            r0.put(r2)     // Catch: java.lang.Exception -> L5b
            goto L9
        L5b:
            r7 = move-exception
            goto L5e
        L5d:
            return r0
        L5e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "buildWifiJsonArray err: "
            r1.append(r2)
            java.lang.String r7 = r7.getMessage()
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            java.lang.String r1 = "JLocation"
            cn.jiguang.commons.w.a.f(r1, r7)
            return r0
    }

    private boolean c(java.util.List r5, java.util.List r6, cn.jiguang.commons.c.j r7, boolean r8) {
            r4 = this;
            java.lang.String r0 = "wifi"
            java.lang.String r1 = "JLocation"
            r2 = 0
            org.json.JSONObject r8 = r4.a(r5, r6, r7, r8)     // Catch: java.lang.Exception -> L4a
            if (r8 == 0) goto L53
            int r3 = r8.length()     // Catch: java.lang.Exception -> L4a
            if (r3 != 0) goto L13
            goto L53
        L13:
            boolean r6 = r8.has(r0)     // Catch: java.lang.Exception -> L4a
            r7 = 1
            if (r6 == 0) goto L4c
            org.json.JSONArray r6 = r8.getJSONArray(r0)     // Catch: java.lang.Exception -> L4a
            java.util.ArrayList r6 = cn.jiguang.commons.L.ad.a(r6)     // Catch: java.lang.Exception -> L4a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L4a
            r0.<init>()     // Catch: java.lang.Exception -> L4a
            java.lang.String r3 = "wifi split: "
            r0.append(r3)     // Catch: java.lang.Exception -> L4a
            int r3 = r6.size()     // Catch: java.lang.Exception -> L4a
            r0.append(r3)     // Catch: java.lang.Exception -> L4a
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L4a
            cn.jiguang.commons.w.a.a(r1, r0)     // Catch: java.lang.Exception -> L4a
            int r0 = r6.size()     // Catch: java.lang.Exception -> L4a
            if (r0 > r7) goto L42
            goto L4c
        L42:
            int r5 = r5.size()     // Catch: java.lang.Exception -> L4a
            r4.a(r8, r6, r5)     // Catch: java.lang.Exception -> L4a
            goto L4f
        L4a:
            r5 = move-exception
            goto L8f
        L4c:
            r4.a(r8)     // Catch: java.lang.Exception -> L4a
        L4f:
            super.d(r1)     // Catch: java.lang.Exception -> L4a
            return r7
        L53:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L4a
            r8.<init>()     // Catch: java.lang.Exception -> L4a
            java.lang.String r0 = "no valid loc data - wifi:"
            r8.append(r0)     // Catch: java.lang.Exception -> L4a
            if (r5 == 0) goto L64
            int r5 = r5.size()     // Catch: java.lang.Exception -> L4a
            goto L65
        L64:
            r5 = 0
        L65:
            r8.append(r5)     // Catch: java.lang.Exception -> L4a
            java.lang.String r5 = " cell:"
            r8.append(r5)     // Catch: java.lang.Exception -> L4a
            if (r6 == 0) goto L74
            int r5 = r6.size()     // Catch: java.lang.Exception -> L4a
            goto L75
        L74:
            r5 = 0
        L75:
            r8.append(r5)     // Catch: java.lang.Exception -> L4a
            java.lang.String r5 = " gps:"
            r8.append(r5)     // Catch: java.lang.Exception -> L4a
            if (r7 == 0) goto L82
            java.lang.String r5 = "ok"
            goto L84
        L82:
            java.lang.String r5 = "null"
        L84:
            r8.append(r5)     // Catch: java.lang.Exception -> L4a
            java.lang.String r5 = r8.toString()     // Catch: java.lang.Exception -> L4a
            cn.jiguang.commons.w.a.f(r1, r5)     // Catch: java.lang.Exception -> L4a
            return r2
        L8f:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "processAndReportLocationData err: "
            r6.append(r7)
            java.lang.String r5 = r5.getMessage()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            cn.jiguang.commons.w.a.f(r1, r5)
            return r2
    }

    @Override // cn.jiguang.commons.a.c
    public java.lang.String a() {
            r1 = this;
            java.lang.String r0 = "JLocation"
            return r0
    }

    @Override // cn.jiguang.commons.a.c
    public void a(boolean r10) {
            r9 = this;
            r0 = 3001(0xbb9, float:4.205E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 3000(0xbb8, float:4.204E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 3003(0xbbb, float:4.208E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 1502(0x5de, float:2.105E-42)
            java.lang.Class<cn.jiguang.commons.c.j> r4 = cn.jiguang.commons.c.j.class
            java.lang.String r5 = "JLocation"
            if (r10 == 0) goto L67
            boolean r6 = r9.f815d     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            r7 = 0
            if (r6 == 0) goto L31
            cn.jiguang.commons.A.a r6 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            r6.n(r2)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            java.util.List r6 = cn.jiguang.commons.I.d.c(r10)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            goto L32
        L2b:
            r10 = move-exception
            goto L106
        L2e:
            r10 = move-exception
            goto L107
        L31:
            r6 = r7
        L32:
            boolean r8 = r9.a     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            if (r8 == 0) goto L58
            cn.jiguang.commons.A.a r8 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            r8.h(r2)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            cn.jiguang.commons.g.n r8 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            java.lang.Object r3 = r8.a(r4, r3, r10)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            cn.jiguang.commons.c.j r3 = (cn.jiguang.commons.c.j) r3     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            if (r3 == 0) goto L4f
            cn.jiguang.commons.A.a r4 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            r8 = r1
            goto L54
        L4f:
            cn.jiguang.commons.A.a r4 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            r8 = r0
        L54:
            r4.h(r8)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            goto L59
        L58:
            r3 = r7
        L59:
            boolean r4 = r9.f814c     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            if (r4 == 0) goto L9f
            cn.jiguang.commons.A.a r4 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            goto L97
        L62:
            cn.jiguang.commons.I.c r2 = cn.jiguang.commons.I.c.a()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            goto L9b
        L67:
            cn.jiguang.commons.A.a r6 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            r6.n(r2)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            java.util.List r6 = cn.jiguang.commons.I.d.c(r10)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            cn.jiguang.commons.A.a r7 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            r7.h(r2)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            cn.jiguang.commons.g.n r7 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            java.lang.Object r3 = r7.a(r4, r3, r10)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            cn.jiguang.commons.c.j r3 = (cn.jiguang.commons.c.j) r3     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            if (r3 == 0) goto L8b
            cn.jiguang.commons.A.a r4 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            r7 = r1
            goto L90
        L8b:
            cn.jiguang.commons.A.a r4 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            r7 = r0
        L90:
            r4.h(r7)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            cn.jiguang.commons.A.a r4 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
        L97:
            r4.f(r2)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            goto L62
        L9b:
            java.util.List r7 = r2.a(r10)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
        L9f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            r2.<init>()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            java.lang.String r4 = "wifi: "
            r2.append(r4)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            r4 = 0
            if (r6 == 0) goto Lb2
            int r8 = r6.size()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            goto Lb3
        Lb2:
            r8 = 0
        Lb3:
            r2.append(r8)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            cn.jiguang.commons.w.a.a(r5, r2)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            r2.<init>()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            java.lang.String r8 = "gps: "
            r2.append(r8)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            if (r3 == 0) goto Lcc
            java.lang.String r8 = "ok"
            goto Lce
        Lcc:
            java.lang.String r8 = "null"
        Lce:
            r2.append(r8)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            cn.jiguang.commons.w.a.a(r5, r2)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            r2.<init>()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            java.lang.String r8 = "cell: "
            r2.append(r8)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            if (r7 == 0) goto Le8
            int r4 = r7.size()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
        Le8:
            r2.append(r4)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            cn.jiguang.commons.w.a.a(r5, r2)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            boolean r10 = r9.c(r6, r7, r3, r10)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            if (r10 == 0) goto Lfe
            cn.jiguang.commons.A.a r10 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            r0 = r1
            goto L102
        Lfe:
            cn.jiguang.commons.A.a r10 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
        L102:
            r10.j(r0)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            return
        L106:
            throw r10
        L107:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "loc err: "
            r0.append(r1)
            java.lang.String r10 = r10.getMessage()
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            cn.jiguang.commons.w.a.f(r5, r10)
            cn.jiguang.commons.A.a r10 = cn.jiguang.commons.A.a.f()
            r0 = 3002(0xbba, float:4.207E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10.j(r0)
            return
    }

    @Override // cn.jiguang.commons.a.c
    public void a(boolean r5, org.json.JSONObject r6) {
            r4 = this;
            java.lang.String r0 = "JLocation"
            java.lang.String r1 = "content"
            org.json.JSONObject r1 = r6.optJSONObject(r1)     // Catch: java.lang.Throwable -> L60
            java.lang.String r2 = "cmd"
            int r6 = r6.optInt(r2)     // Catch: java.lang.Throwable -> L60
            if (r1 != 0) goto L11
            return
        L11:
            r2 = 5
            if (r6 != r2) goto L62
            java.lang.String r6 = "en_config"
            r2 = 0
            int r6 = r1.optInt(r6, r2)     // Catch: java.lang.Throwable -> L60
            r1 = r6 & 1
            r3 = 1
            if (r1 == 0) goto L22
            r1 = 1
            goto L23
        L22:
            r1 = 0
        L23:
            r4.a = r1     // Catch: java.lang.Throwable -> L60
            r1 = r6 & 2
            if (r1 == 0) goto L2b
            r1 = 1
            goto L2c
        L2b:
            r1 = 0
        L2c:
            r4.f814c = r1     // Catch: java.lang.Throwable -> L60
            r6 = r6 & 4
            if (r6 == 0) goto L33
            r2 = 1
        L33:
            r4.f815d = r2     // Catch: java.lang.Throwable -> L60
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L60
            r6.<init>()     // Catch: java.lang.Throwable -> L60
            java.lang.String r1 = "gps: "
            r6.append(r1)     // Catch: java.lang.Throwable -> L60
            boolean r1 = r4.a     // Catch: java.lang.Throwable -> L60
            r6.append(r1)     // Catch: java.lang.Throwable -> L60
            java.lang.String r1 = " cell: "
            r6.append(r1)     // Catch: java.lang.Throwable -> L60
            boolean r1 = r4.f814c     // Catch: java.lang.Throwable -> L60
            r6.append(r1)     // Catch: java.lang.Throwable -> L60
            java.lang.String r1 = " wifi: "
            r6.append(r1)     // Catch: java.lang.Throwable -> L60
            boolean r1 = r4.f815d     // Catch: java.lang.Throwable -> L60
            r6.append(r1)     // Catch: java.lang.Throwable -> L60
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L60
            cn.jiguang.commons.w.a.a(r0, r6)     // Catch: java.lang.Throwable -> L60
            goto L62
        L60:
            r5 = move-exception
            goto L66
        L62:
            r4.a(r5)     // Catch: java.lang.Throwable -> L60
            return
        L66:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = "doBusiness with command err: "
            r6.append(r1)
            java.lang.String r5 = r5.getMessage()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            cn.jiguang.commons.w.a.f(r0, r5)
            return
    }
}
