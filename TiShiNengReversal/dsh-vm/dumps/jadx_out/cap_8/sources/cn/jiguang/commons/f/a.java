package cn.jiguang.commons.F;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a extends cn.jiguang.commons.a.c {
    public static int a = 1;

    /* renamed from: cn.jiguang.commons.F.a$a, reason: collision with other inner class name */
    private static final class C0026a {
        private static final cn.jiguang.commons.F.a a = null;

        static {
                cn.jiguang.commons.F.a r0 = new cn.jiguang.commons.F.a
                r0.<init>()
                cn.jiguang.commons.F.a.C0026a.a = r0
                return
        }

        public C0026a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.commons.F.a a() {
                cn.jiguang.commons.F.a r0 = cn.jiguang.commons.F.a.C0026a.a
                return r0
        }
    }

    static {
            return
    }

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    private java.util.List a(int r2, boolean r3) {
            r1 = this;
            cn.jiguang.commons.g.n r0 = cn.jiguang.commons.g.n.a()
            java.util.List r2 = r0.c(r2, r3)
            return r2
    }

    private void a(org.json.JSONObject r3, int r4) {
            r2 = this;
            java.lang.String r0 = "dhcp"
            java.lang.String r3 = r3.optString(r0)     // Catch: java.lang.Exception -> L17
            long r0 = (long) r4     // Catch: java.lang.Exception -> L17
            byte[] r0 = cn.jiguang.commons.F.c.a(r0)     // Catch: java.lang.Exception -> L17
            cn.jiguang.commons.F.c.a(r3, r0)     // Catch: java.lang.Exception -> L17
            cn.jiguang.commons.F.c.a(r4)     // Catch: java.lang.Exception -> L17
            r3 = 3000(0xbb8, double:1.482E-320)
            java.lang.Thread.sleep(r3)     // Catch: java.lang.Exception -> L17
            return
        L17:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "performNetworkScan failed: "
            r4.append(r0)
            java.lang.String r3 = r3.getMessage()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "JArp"
            cn.jiguang.commons.w.a.f(r4, r3)
            return
    }

    private void a(org.json.JSONObject r8, java.util.List r9) {
            r7 = this;
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Exception -> L39
            r0.<init>()     // Catch: java.lang.Exception -> L39
            int r1 = cn.jiguang.commons.F.a.a     // Catch: java.lang.Exception -> L39
            java.util.Iterator r2 = r9.iterator()     // Catch: java.lang.Exception -> L39
        Lb:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Exception -> L39
            if (r3 == 0) goto L3b
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Exception -> L39
            cn.jiguang.commons.c.f r3 = (cn.jiguang.commons.c.f) r3     // Catch: java.lang.Exception -> L39
            boolean r4 = r7.a(r3)     // Catch: java.lang.Exception -> L39
            if (r4 == 0) goto Lb
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Exception -> L39
            r4.<init>()     // Catch: java.lang.Exception -> L39
            java.lang.String r5 = "ip"
            java.lang.String r6 = r3.a     // Catch: java.lang.Exception -> L39
            r4.put(r5, r6)     // Catch: java.lang.Exception -> L39
            java.lang.String r5 = "mac"
            java.lang.String r3 = r3.f1016c     // Catch: java.lang.Exception -> L39
            if (r3 == 0) goto L30
            goto L32
        L30:
            java.lang.String r3 = ""
        L32:
            r4.put(r5, r3)     // Catch: java.lang.Exception -> L39
            r0.put(r4)     // Catch: java.lang.Exception -> L39
            goto Lb
        L39:
            r8 = move-exception
            goto L56
        L3b:
            int r2 = r0.length()     // Catch: java.lang.Exception -> L39
            if (r2 <= 0) goto L55
            r2 = 1613(0x64d, float:2.26E-42)
            r3 = 0
            java.util.List r2 = r7.a(r2, r3)     // Catch: java.lang.Exception -> L39
            if (r9 != r2) goto L4b
            r1 = 2
        L4b:
            java.lang.String r9 = "source"
            r8.put(r9, r1)     // Catch: java.lang.Exception -> L39
            java.lang.String r9 = "data"
            r8.put(r9, r0)     // Catch: java.lang.Exception -> L39
        L55:
            return
        L56:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "addArpInfoToJson failed: "
            r9.append(r0)
            java.lang.String r8 = r8.getMessage()
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            java.lang.String r9 = "JArp"
            cn.jiguang.commons.w.a.f(r9, r8)
            return
    }

    private boolean a(cn.jiguang.commons.c.f r1) {
            r0 = this;
            if (r1 == 0) goto Lc
            java.lang.String r1 = r1.a
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    public static cn.jiguang.commons.F.a c() {
            cn.jiguang.commons.F.a r0 = cn.jiguang.commons.F.a.C0026a.a()
            return r0
    }

    private java.util.List c(boolean r6) {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "collectArpInfo called: isCmd="
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "JArp"
            cn.jiguang.commons.w.a.a(r1, r0)
            java.lang.String r0 = "trying to get arp from proc file"
            cn.jiguang.commons.w.a.a(r1, r0)     // Catch: java.lang.Exception -> L36
            r0 = 1614(0x64e, float:2.262E-42)
            java.util.List r0 = r5.a(r0, r6)     // Catch: java.lang.Exception -> L36
            r2 = 1
            cn.jiguang.commons.F.a.a = r2     // Catch: java.lang.Exception -> L36
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L36
            r2.<init>()     // Catch: java.lang.Exception -> L36
            java.lang.String r3 = "arp from proc: "
            r2.append(r3)     // Catch: java.lang.Exception -> L36
            r3 = 0
            if (r0 == 0) goto L38
            int r4 = r0.size()     // Catch: java.lang.Exception -> L36
            goto L39
        L36:
            r6 = move-exception
            goto L76
        L38:
            r4 = 0
        L39:
            r2.append(r4)     // Catch: java.lang.Exception -> L36
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L36
            cn.jiguang.commons.w.a.a(r1, r2)     // Catch: java.lang.Exception -> L36
            if (r0 == 0) goto L4d
            boolean r2 = r0.isEmpty()     // Catch: java.lang.Exception -> L36
            if (r2 == 0) goto L4c
            goto L4d
        L4c:
            return r0
        L4d:
            java.lang.String r0 = "proc file failed, trying neigh command"
            cn.jiguang.commons.w.a.a(r1, r0)     // Catch: java.lang.Exception -> L36
            r0 = 1613(0x64d, float:2.26E-42)
            java.util.List r6 = r5.a(r0, r6)     // Catch: java.lang.Exception -> L36
            r0 = 2
            cn.jiguang.commons.F.a.a = r0     // Catch: java.lang.Exception -> L36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L36
            r0.<init>()     // Catch: java.lang.Exception -> L36
            java.lang.String r2 = "arp from neigh: "
            r0.append(r2)     // Catch: java.lang.Exception -> L36
            if (r6 == 0) goto L6b
            int r3 = r6.size()     // Catch: java.lang.Exception -> L36
        L6b:
            r0.append(r3)     // Catch: java.lang.Exception -> L36
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L36
            cn.jiguang.commons.w.a.a(r1, r0)     // Catch: java.lang.Exception -> L36
            return r6
        L76:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "collectArpInfo failed: "
            r0.append(r2)
            java.lang.String r6 = r6.getMessage()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            cn.jiguang.commons.w.a.f(r1, r6)
            r6 = 0
            return r6
    }

    private org.json.JSONArray c(int r3, boolean r4) {
            r2 = this;
            cn.jiguang.commons.g.n r0 = cn.jiguang.commons.g.n.a()
            java.lang.Class<org.json.JSONArray> r1 = org.json.JSONArray.class
            java.lang.Object r3 = r0.a(r1, r3, r4)
            org.json.JSONArray r3 = (org.json.JSONArray) r3
            return r3
    }

    private java.lang.String d(int r2, boolean r3) {
            r1 = this;
            cn.jiguang.commons.g.n r0 = cn.jiguang.commons.g.n.a()
            java.lang.String r2 = r0.d(r2, r3)
            return r2
    }

    private org.json.JSONObject d(boolean r4) {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L53
            r0.<init>()     // Catch: java.lang.Exception -> L53
            java.lang.String r1 = "ssid"
            r2 = 1608(0x648, float:2.253E-42)
            java.lang.String r2 = r3.d(r2, r4)     // Catch: java.lang.Exception -> L53
            r0.put(r1, r2)     // Catch: java.lang.Exception -> L53
            java.lang.String r1 = "bssid"
            r2 = 1601(0x641, float:2.243E-42)
            java.lang.String r2 = r3.d(r2, r4)     // Catch: java.lang.Exception -> L53
            r0.put(r1, r2)     // Catch: java.lang.Exception -> L53
            java.lang.String r1 = "local_mac"
            r2 = 1010(0x3f2, float:1.415E-42)
            java.lang.String r2 = r3.d(r2, r4)     // Catch: java.lang.Exception -> L53
            r0.put(r1, r2)     // Catch: java.lang.Exception -> L53
            java.lang.String r1 = "netmask"
            r2 = 1607(0x647, float:2.252E-42)
            java.lang.String r2 = r3.d(r2, r4)     // Catch: java.lang.Exception -> L53
            r0.put(r1, r2)     // Catch: java.lang.Exception -> L53
            java.lang.String r1 = "gateway"
            r2 = 1604(0x644, float:2.248E-42)
            java.lang.String r2 = r3.d(r2, r4)     // Catch: java.lang.Exception -> L53
            r0.put(r1, r2)     // Catch: java.lang.Exception -> L53
            java.lang.String r1 = "dhcp"
            r2 = 1609(0x649, float:2.255E-42)
            java.lang.String r2 = r3.d(r2, r4)     // Catch: java.lang.Exception -> L53
            r0.put(r1, r2)     // Catch: java.lang.Exception -> L53
            java.lang.String r1 = "dns"
            r2 = 1603(0x643, float:2.246E-42)
            org.json.JSONArray r4 = r3.c(r2, r4)     // Catch: java.lang.Exception -> L53
            r0.put(r1, r4)     // Catch: java.lang.Exception -> L53
            return r0
        L53:
            r4 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "collectNetworkInfo failed: "
            r0.append(r1)
            java.lang.String r1 = r4.getMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "JArp"
            cn.jiguang.commons.w.a.f(r1, r0)
            throw r4
    }

    @Override // cn.jiguang.commons.a.c
    public java.lang.String a() {
            r1 = this;
            java.lang.String r0 = "JArp"
            return r0
    }

    @Override // cn.jiguang.commons.a.c
    public void a(boolean r6) {
            r5 = this;
            java.lang.String r0 = "JArp"
            org.json.JSONObject r1 = r5.d(r6)     // Catch: java.lang.Throwable -> L2a
            cn.jiguang.commons.g.n r2 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Throwable -> L2a
            r3 = 1605(0x645, float:2.249E-42)
            r4 = 0
            int r2 = r2.a(r3, r6, r4)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r3 = "local_ip"
            java.lang.String r4 = cn.jiguang.commons.L.ah.a(r2)     // Catch: java.lang.Throwable -> L2a
            r1.put(r3, r4)     // Catch: java.lang.Throwable -> L2a
            cn.jiguang.commons.g.l r3 = cn.jiguang.commons.g.l.a()     // Catch: java.lang.Throwable -> L2a
            r4 = 1612(0x64c, float:2.259E-42)
            boolean r3 = r3.a(r4)     // Catch: java.lang.Throwable -> L2a
            if (r3 == 0) goto L2d
            r5.a(r1, r2)     // Catch: java.lang.Throwable -> L2a
            goto L2d
        L2a:
            r6 = move-exception
            goto Lba
        L2d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2a
            r2.<init>()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r3 = "network scan completed: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> L2a
            r2.append(r3)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L2a
            cn.jiguang.commons.w.a.a(r0, r2)     // Catch: java.lang.Throwable -> L2a
            java.util.List r6 = r5.c(r6)     // Catch: java.lang.Throwable -> L2a
            if (r6 == 0) goto Laa
            boolean r2 = r6.isEmpty()     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L52
            goto Laa
        L52:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2a
            r2.<init>()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r3 = "arp info collected: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L2a
            int r3 = r6.size()     // Catch: java.lang.Throwable -> L2a
            r2.append(r3)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r3 = " entries"
            r2.append(r3)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L2a
            cn.jiguang.commons.w.a.a(r0, r2)     // Catch: java.lang.Throwable -> L2a
            r5.a(r1, r6)     // Catch: java.lang.Throwable -> L2a
            int r6 = r1.length()     // Catch: java.lang.Throwable -> L2a
            if (r6 > 0) goto L8b
            java.lang.String r6 = "no valid arp info to report"
            cn.jiguang.commons.w.a.f(r0, r6)     // Catch: java.lang.Throwable -> L2a
            cn.jiguang.commons.A.a r6 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L2a
            r1 = 3030(0xbd6, float:4.246E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L2a
        L87:
            r6.e(r1)     // Catch: java.lang.Throwable -> L2a
            return
        L8b:
            java.lang.String r6 = "arp data reported success"
            cn.jiguang.commons.w.a.a(r0, r6)     // Catch: java.lang.Throwable -> L2a
            cn.jiguang.commons.g.p r6 = cn.jiguang.commons.g.p.e()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r2 = "mac_list"
            r6.a(r1, r2)     // Catch: java.lang.Throwable -> L2a
            cn.jiguang.commons.A.a r6 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L2a
            r1 = 3000(0xbb8, float:4.204E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L2a
            r6.e(r1)     // Catch: java.lang.Throwable -> L2a
            super.d(r0)     // Catch: java.lang.Throwable -> L2a
            return
        Laa:
            java.lang.String r6 = "no arp info collected"
            cn.jiguang.commons.w.a.f(r0, r6)     // Catch: java.lang.Throwable -> L2a
            cn.jiguang.commons.A.a r6 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L2a
            r1 = 3001(0xbb9, float:4.205E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L2a
            goto L87
        Lba:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "arp err:"
            r1.append(r2)
            java.lang.String r6 = r6.getMessage()
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            cn.jiguang.commons.w.a.f(r0, r6)
            cn.jiguang.commons.A.a r6 = cn.jiguang.commons.A.a.f()
            r0 = 3002(0xbba, float:4.207E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.e(r0)
            return
    }
}
