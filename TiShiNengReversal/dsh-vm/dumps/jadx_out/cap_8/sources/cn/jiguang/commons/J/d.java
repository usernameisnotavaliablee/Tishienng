package cn.jiguang.commons.J;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class d extends cn.jiguang.commons.a.c {

    class a implements cn.jiguang.commons.J.a.f {
        final /* synthetic */ cn.jiguang.commons.J.f a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f830b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ cn.jiguang.commons.J.d f831c;

        a(cn.jiguang.commons.J.d r1, cn.jiguang.commons.J.f r2, boolean r3) {
                r0 = this;
                r0.f831c = r1
                r0.a = r2
                r0.f830b = r3
                r0.<init>()
                return
        }

        @Override // cn.jiguang.commons.J.a.f
        public void a(java.lang.String r4) {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "gps data failed:"
                r0.append(r1)
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                java.lang.String r0 = "JLocationv2"
                cn.jiguang.commons.w.a.f(r0, r4)
                cn.jiguang.commons.A.a r4 = cn.jiguang.commons.A.a.f()
                r0 = 3001(0xbb9, float:4.205E-42)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r4.i(r0)
                cn.jiguang.commons.J.d r4 = r3.f831c
                boolean r0 = r3.f830b
                cn.jiguang.commons.J.f r1 = r3.a
                r2 = 2
                cn.jiguang.commons.J.d.a(r4, r2, r0, r1)
                return
        }

        @Override // cn.jiguang.commons.J.a.f
        public void c(java.lang.String r4) {
                r3 = this;
                cn.jiguang.commons.J.f r0 = r3.a
                r0.c(r4)
                java.lang.String r4 = "JLocationv2"
                java.lang.String r0 = "gps data ok"
                cn.jiguang.commons.w.a.a(r4, r0)
                cn.jiguang.commons.A.a r4 = cn.jiguang.commons.A.a.f()
                r0 = 3000(0xbb8, float:4.204E-42)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r4.i(r0)
                cn.jiguang.commons.J.d r4 = r3.f831c
                boolean r0 = r3.f830b
                cn.jiguang.commons.J.f r1 = r3.a
                r2 = 2
                cn.jiguang.commons.J.d.a(r4, r2, r0, r1)
                return
        }
    }

    class b implements cn.jiguang.commons.f.f {
        final /* synthetic */ boolean a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ cn.jiguang.commons.J.d f832b;

        b(cn.jiguang.commons.J.d r1, boolean r2) {
                r0 = this;
                r0.f832b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void a(cn.jiguang.commons.c.m r5) {
                r4 = this;
                cn.jiguang.commons.A.a r0 = cn.jiguang.commons.A.a.f()
                r1 = 1
                r0.a(r1)
                java.lang.String r0 = "JLocationv2"
                if (r5 != 0) goto L29
                java.lang.String r5 = "v2 config null"
                cn.jiguang.commons.w.a.f(r0, r5)     // Catch: java.lang.Throwable -> L27
                cn.jiguang.commons.A.a r5 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L27
                r1 = 3038(0xbde, float:4.257E-42)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L27
            L1c:
                r5.k(r1)     // Catch: java.lang.Throwable -> L27
            L1f:
                cn.jiguang.commons.A.a r5 = cn.jiguang.commons.A.a.f()
                r5.d()
                return
            L27:
                r5 = move-exception
                goto L60
            L29:
                java.util.List r1 = cn.jiguang.commons.L.c.d()     // Catch: java.lang.Throwable -> L27
                cn.jiguang.commons.J.d r2 = r4.f832b     // Catch: java.lang.Throwable -> L27
                boolean r1 = cn.jiguang.commons.J.d.a(r2, r5, r1)     // Catch: java.lang.Throwable -> L27
                if (r1 == 0) goto L45
                java.lang.String r5 = "app in blacklist, skip collection"
                cn.jiguang.commons.w.a.a(r0, r5)     // Catch: java.lang.Throwable -> L27
                cn.jiguang.commons.A.a r5 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L27
                r1 = 3039(0xbdf, float:4.259E-42)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L27
                goto L1c
            L45:
                cn.jiguang.commons.J.f r1 = new cn.jiguang.commons.J.f     // Catch: java.lang.Throwable -> L27
                r1.<init>()     // Catch: java.lang.Throwable -> L27
                cn.jiguang.commons.J.d r2 = r4.f832b     // Catch: java.lang.Throwable -> L27
                boolean r3 = r4.a     // Catch: java.lang.Throwable -> L27
                cn.jiguang.commons.J.d.a(r2, r5, r3, r1)     // Catch: java.lang.Throwable -> L27
                cn.jiguang.commons.J.d r2 = r4.f832b     // Catch: java.lang.Throwable -> L27
                boolean r3 = r4.a     // Catch: java.lang.Throwable -> L27
                cn.jiguang.commons.J.d.c(r2, r5, r3, r1)     // Catch: java.lang.Throwable -> L27
                cn.jiguang.commons.J.d r2 = r4.f832b     // Catch: java.lang.Throwable -> L27
                boolean r3 = r4.a     // Catch: java.lang.Throwable -> L27
                cn.jiguang.commons.J.d.d(r2, r5, r3, r1)     // Catch: java.lang.Throwable -> L27
                goto L1f
            L60:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L86
                r1.<init>()     // Catch: java.lang.Throwable -> L86
                java.lang.String r2 = "loc v2 err:"
                r1.append(r2)     // Catch: java.lang.Throwable -> L86
                java.lang.String r5 = r5.getMessage()     // Catch: java.lang.Throwable -> L86
                r1.append(r5)     // Catch: java.lang.Throwable -> L86
                java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L86
                cn.jiguang.commons.w.a.f(r0, r5)     // Catch: java.lang.Throwable -> L86
                cn.jiguang.commons.A.a r5 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L86
                r0 = 3002(0xbba, float:4.207E-42)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L86
                r5.k(r0)     // Catch: java.lang.Throwable -> L86
                goto L1f
            L86:
                r5 = move-exception
                cn.jiguang.commons.A.a r0 = cn.jiguang.commons.A.a.f()
                r0.d()
                throw r5
        }

        @Override // cn.jiguang.commons.f.f
        public /* bridge */ /* synthetic */ void a(java.lang.Object r1) {
                r0 = this;
                cn.jiguang.commons.c.m r1 = (cn.jiguang.commons.c.m) r1
                r0.a(r1)
                return
        }
    }

    private static final class c {
        private static final cn.jiguang.commons.J.d a = null;

        static {
                cn.jiguang.commons.J.d r0 = new cn.jiguang.commons.J.d
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.commons.J.d.c.a = r0
                return
        }

        public c() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.commons.J.d a() {
                cn.jiguang.commons.J.d r0 = cn.jiguang.commons.J.d.c.a
                return r0
        }
    }

    /* renamed from: cn.jiguang.commons.J.d$d, reason: collision with other inner class name */
    private class C0031d implements java.util.Comparator {
        final /* synthetic */ cn.jiguang.commons.J.d a;

        private C0031d(cn.jiguang.commons.J.d r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ C0031d(cn.jiguang.commons.J.d r1, cn.jiguang.commons.J.d.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public int a(java.lang.Long r6, java.lang.Long r7) {
                r5 = this;
                long r0 = r6.longValue()
                long r2 = r7.longValue()
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto Le
                r6 = 0
                return r6
            Le:
                long r0 = r6.longValue()
                long r6 = r7.longValue()
                int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r2 <= 0) goto L1c
                r6 = 1
                return r6
            L1c:
                r6 = -1
                return r6
        }

        @Override // java.util.Comparator
        public /* synthetic */ int compare(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                java.lang.Long r1 = (java.lang.Long) r1
                java.lang.Long r2 = (java.lang.Long) r2
                int r1 = r0.a(r1, r2)
                return r1
        }
    }

    private class e implements java.util.Comparator {
        final /* synthetic */ cn.jiguang.commons.J.d a;

        private e(cn.jiguang.commons.J.d r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ e(cn.jiguang.commons.J.d r1, cn.jiguang.commons.J.d.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public int a(android.net.wifi.ScanResult r1, android.net.wifi.ScanResult r2) {
                r0 = this;
                int r2 = r2.level
                int r1 = r1.level
                int r2 = r2 - r1
                return r2
        }

        @Override // java.util.Comparator
        public /* synthetic */ int compare(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                android.net.wifi.ScanResult r1 = (android.net.wifi.ScanResult) r1
                android.net.wifi.ScanResult r2 = (android.net.wifi.ScanResult) r2
                int r1 = r0.a(r1, r2)
                return r1
        }
    }

    private d() {
            r0 = this;
            r0.<init>()
            return
    }

    /* synthetic */ d(cn.jiguang.commons.J.d.a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    private void a(int r6, boolean r7, cn.jiguang.commons.J.f r8) {
            r5 = this;
            r0 = 3002(0xbba, float:4.207E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "JLocationv2"
            int r2 = r8.a(r6)     // Catch: java.lang.Throwable -> L86
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L86
            r3.<init>()     // Catch: java.lang.Throwable -> L86
            java.lang.String r4 = "data collected - type:"
            r3.append(r4)     // Catch: java.lang.Throwable -> L86
            r3.append(r6)     // Catch: java.lang.Throwable -> L86
            java.lang.String r4 = ", status:"
            r3.append(r4)     // Catch: java.lang.Throwable -> L86
            r3.append(r2)     // Catch: java.lang.Throwable -> L86
            java.lang.String r4 = "/"
            r3.append(r4)     // Catch: java.lang.Throwable -> L86
            r4 = 7
            r3.append(r4)     // Catch: java.lang.Throwable -> L86
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L86
            cn.jiguang.commons.w.a.a(r1, r3)     // Catch: java.lang.Throwable -> L86
            if (r2 != r4) goto Le4
            org.json.JSONObject r8 = r8.a()     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            int r2 = r8.length()     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            if (r2 <= 0) goto L8a
            cn.jiguang.commons.g.n r2 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Throwable -> L67
            r3 = 2800(0xaf0, float:3.924E-42)
            java.lang.String r2 = r2.d(r3, r7)     // Catch: java.lang.Throwable -> L67
            cn.jiguang.commons.g.n r3 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Throwable -> L67
            r4 = 2801(0xaf1, float:3.925E-42)
            java.lang.String r7 = r3.d(r4, r7)     // Catch: java.lang.Throwable -> L67
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L67
            if (r3 != 0) goto L5c
            java.lang.String r3 = "ipv6"
            r8.put(r3, r2)     // Catch: java.lang.Throwable -> L67
        L5c:
            boolean r2 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L67
            if (r2 != 0) goto L67
            java.lang.String r2 = "ip2"
            r8.put(r2, r7)     // Catch: java.lang.Throwable -> L67
        L67:
            java.lang.String r7 = "all data collected"
            cn.jiguang.commons.w.a.a(r1, r7)     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            cn.jiguang.commons.A.a r7 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            r2 = 3000(0xbb8, float:4.204E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            r7.k(r2)     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            cn.jiguang.commons.g.p r7 = cn.jiguang.commons.g.p.e()     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            java.lang.String r2 = "loc_info_v2"
            r7.a(r8, r2)     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            super.d(r1)     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            goto Le4
        L86:
            r7 = move-exception
            goto Lbd
        L88:
            r7 = move-exception
            goto L9d
        L8a:
            java.lang.String r7 = "no v2 data to report"
            cn.jiguang.commons.w.a.a(r1, r7)     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            cn.jiguang.commons.A.a r7 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            r8 = 3001(0xbb9, float:4.205E-42)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            r7.k(r8)     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            return
        L9d:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L86
            r8.<init>()     // Catch: java.lang.Throwable -> L86
            java.lang.String r2 = "output final data err:"
            r8.append(r2)     // Catch: java.lang.Throwable -> L86
            java.lang.String r7 = r7.getMessage()     // Catch: java.lang.Throwable -> L86
            r8.append(r7)     // Catch: java.lang.Throwable -> L86
            java.lang.String r7 = r8.toString()     // Catch: java.lang.Throwable -> L86
            cn.jiguang.commons.w.a.c(r1, r7)     // Catch: java.lang.Throwable -> L86
            cn.jiguang.commons.A.a r7 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L86
            r7.k(r0)     // Catch: java.lang.Throwable -> L86
            goto Le4
        Lbd:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r2 = "on data collected err - type:"
            r8.append(r2)
            r8.append(r6)
            java.lang.String r6 = ", err:"
            r8.append(r6)
            java.lang.String r6 = r7.getMessage()
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            cn.jiguang.commons.w.a.c(r1, r6)
            cn.jiguang.commons.A.a r6 = cn.jiguang.commons.A.a.f()
            r6.k(r0)
        Le4:
            return
    }

    static /* synthetic */ void a(cn.jiguang.commons.J.d r0, int r1, boolean r2, cn.jiguang.commons.J.f r3) {
            r0.a(r1, r2, r3)
            return
    }

    static /* synthetic */ void a(cn.jiguang.commons.J.d r0, cn.jiguang.commons.c.m r1, boolean r2, cn.jiguang.commons.J.f r3) {
            r0.d(r1, r2, r3)
            return
    }

    private void a(cn.jiguang.commons.c.m r24, boolean r25, cn.jiguang.commons.J.f r26) {
            r23 = this;
            r1 = r23
            r0 = r24
            r2 = r25
            r3 = r26
            r4 = 3001(0xbb9, float:4.205E-42)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            cn.jiguang.commons.A.a r5 = cn.jiguang.commons.A.a.f()
            r6 = 3003(0xbbb, float:4.208E-42)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5.g(r6)
            java.lang.String r5 = "cell_enabled"
            boolean r5 = r0.d(r5)
            r6 = 4
            java.lang.String r7 = "JLocationv2"
            if (r5 != 0) goto L3c
            java.lang.String r0 = "cell disabled by config"
            cn.jiguang.commons.w.a.a(r7, r0)
            cn.jiguang.commons.A.a r0 = cn.jiguang.commons.A.a.f()
            r4 = 3036(0xbdc, float:4.254E-42)
        L31:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.g(r4)
            r1.a(r6, r2, r3)
            return
        L3c:
            java.lang.String r5 = "last_cell_collection_time"
            java.lang.String r8 = "cell_interval"
            boolean r0 = r1.a(r5, r0, r8)
            if (r0 != 0) goto L52
            java.lang.String r0 = "cell skip by interval"
            cn.jiguang.commons.w.a.a(r7, r0)
            cn.jiguang.commons.A.a r0 = cn.jiguang.commons.A.a.f()
            r4 = 3037(0xbdd, float:4.256E-42)
            goto L31
        L52:
            cn.jiguang.commons.g.n r0 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
            r5 = 1501(0x5dd, float:2.103E-42)
            java.util.List r0 = r0.c(r5, r2)     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
            if (r0 == 0) goto L1a1
            boolean r5 = r0.isEmpty()     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
            if (r5 == 0) goto L66
            goto L1a1
        L66:
            cn.jiguang.commons.g.n r5 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
            r8 = 1506(0x5e2, float:2.11E-42)
            java.lang.String r5 = r5.d(r8, r2)     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
            r8.<init>()     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
            java.lang.String r9 = "network operator:"
            r8.append(r9)     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
            r8.append(r5)     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
            cn.jiguang.commons.w.a.a(r7, r8)     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
            cn.jiguang.commons.g.n r8 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
            r9 = 1507(0x5e3, float:2.112E-42)
            java.lang.String r8 = r8.d(r9, r2)     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
            java.util.List r9 = cn.jiguang.commons.L.ae.h()     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
            r10.<init>()     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
            if (r9 == 0) goto Lcd
            boolean r11 = r9.isEmpty()     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
            if (r11 != 0) goto Lcd
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
        La3:
            boolean r11 = r9.hasNext()     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
            if (r11 == 0) goto Lcd
            java.lang.Object r11 = r9.next()     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
            android.telephony.NeighboringCellInfo r11 = (android.telephony.NeighboringCellInfo) r11     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
            if (r11 != 0) goto Lb2
            goto La3
        Lb2:
            int r12 = r10.length()     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
            if (r12 <= 0) goto Lc5
            java.lang.String r12 = ","
            r10.append(r12)     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
            goto Lc5
        Lbe:
            r0 = move-exception
        Lbf:
            r4 = 4
            goto L1dc
        Lc2:
            r0 = move-exception
            goto L1b2
        Lc5:
            int r11 = r11.getCid()     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
            r10.append(r11)     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
            goto La3
        Lcd:
            long r11 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
        Ld5:
            boolean r9 = r0.hasNext()     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
            if (r9 == 0) goto L17e
            java.lang.Object r9 = r0.next()     // Catch: java.lang.Throwable -> L175 java.lang.Exception -> L17a
            android.telephony.CellInfo r9 = (android.telephony.CellInfo) r9     // Catch: java.lang.Throwable -> L175 java.lang.Exception -> L17a
            if (r9 != 0) goto Le4
            goto Ld5
        Le4:
            cn.jiguang.commons.c.h r9 = cn.jiguang.commons.L.f.a(r9)     // Catch: java.lang.Throwable -> L175 java.lang.Exception -> L17a
            if (r9 != 0) goto Leb
            goto Ld5
        Leb:
            java.lang.String r13 = r9.f1031f     // Catch: java.lang.Throwable -> L175 java.lang.Exception -> L17a
            boolean r13 = android.text.TextUtils.equals(r13, r5)     // Catch: java.lang.Throwable -> L175 java.lang.Exception -> L17a
            if (r13 == 0) goto Lf5
            r9.f1032g = r8     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
        Lf5:
            java.lang.String r13 = "%d|%d|%d|%d|%d|%s|%s|%s|%s"
            java.lang.Long r14 = java.lang.Long.valueOf(r11)     // Catch: java.lang.Throwable -> L175 java.lang.Exception -> L17a
            int r15 = r9.f1029d     // Catch: java.lang.Throwable -> L175 java.lang.Exception -> L17a
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch: java.lang.Throwable -> L175 java.lang.Exception -> L17a
            r16 = 4
            int r6 = r9.f1028c     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
            r24 = r0
            int r0 = r9.f1030e     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
            r17 = r5
            r18 = r6
            long r5 = r9.a     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
            java.lang.String r6 = r9.f1034i     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
            java.lang.String r19 = ""
            if (r6 == 0) goto L128
            java.lang.String r6 = r6.toLowerCase()     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
        L125:
            r20 = r0
            goto L12b
        L128:
            r6 = r19
            goto L125
        L12b:
            java.lang.String r0 = r9.f1033h     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
            if (r0 == 0) goto L134
            java.lang.String r0 = r0.toLowerCase()     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
            goto L136
        L134:
            r0 = r19
        L136:
            java.lang.String r9 = r9.f1032g     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
            if (r9 == 0) goto L13c
            r19 = r9
        L13c:
            java.lang.String r9 = r10.toString()     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
            r21 = r0
            r0 = 9
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
            r22 = 0
            r0[r22] = r14     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
            r14 = 1
            r0[r14] = r15     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
            r14 = 2
            r0[r14] = r18     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
            r14 = 3
            r0[r14] = r20     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
            r0[r16] = r5     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
            r5 = 5
            r0[r5] = r6     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
            r5 = 6
            r0[r5] = r21     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
            r5 = 7
            r0[r5] = r19     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
            r5 = 8
            r0[r5] = r9     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
            java.lang.String r0 = java.lang.String.format(r13, r0)     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
            r3.a(r0)     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
            java.lang.String r0 = "cell data formatted"
            cn.jiguang.commons.w.a.a(r7, r0)     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
            r0 = r24
            r5 = r17
            r6 = 4
            goto Ld5
        L175:
            r0 = move-exception
            r16 = 4
            goto Lbf
        L17a:
            r0 = move-exception
            r16 = 4
            goto L1b2
        L17e:
            r16 = 4
            org.json.JSONArray r0 = r3.f834d     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
            if (r0 == 0) goto L195
            int r0 = r0.length()     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
            if (r0 <= 0) goto L195
            cn.jiguang.commons.A.a r0 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
            r4 = 3000(0xbb8, float:4.204E-42)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
            goto L199
        L195:
            cn.jiguang.commons.A.a r0 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
        L199:
            r0.g(r4)     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
            r4 = 4
            r1.a(r4, r2, r3)
            return
        L1a1:
            java.lang.String r0 = "no cell info"
            cn.jiguang.commons.w.a.a(r7, r0)     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
            cn.jiguang.commons.A.a r0 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
            r0.g(r4)     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc2
            r4 = 4
            r1.a(r4, r2, r3)
            return
        L1b2:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbe
            r4.<init>()     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r5 = "cell err:"
            r4.append(r5)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> Lbe
            r4.append(r0)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> Lbe
            cn.jiguang.commons.w.a.c(r7, r0)     // Catch: java.lang.Throwable -> Lbe
            cn.jiguang.commons.A.a r0 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> Lbe
            r4 = 3002(0xbba, float:4.207E-42)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> Lbe
            r0.g(r4)     // Catch: java.lang.Throwable -> Lbe
            r4 = 4
            r1.a(r4, r2, r3)
            return
        L1dc:
            r1.a(r4, r2, r3)
            throw r0
    }

    static /* synthetic */ boolean a(cn.jiguang.commons.J.d r0, cn.jiguang.commons.c.m r1, java.util.List r2) {
            boolean r0 = r0.a(r1, r2)
            return r0
    }

    private boolean a(cn.jiguang.commons.c.m r7, java.util.List r8) {
            r6 = this;
            r0 = 0
            if (r8 == 0) goto L3b
            boolean r1 = r8.isEmpty()
            if (r1 == 0) goto La
            goto L3b
        La:
            java.util.Iterator r8 = r8.iterator()
        Le:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L3b
            java.lang.Object r1 = r8.next()
            cn.jiguang.commons.c.e r1 = (cn.jiguang.commons.c.e) r1
            if (r1 != 0) goto L1d
            goto Le
        L1d:
            java.lang.String r2 = r1.f1007c
            boolean r2 = r7.e(r2)
            r3 = 1
            if (r2 == 0) goto L27
            return r3
        L27:
            java.lang.String[] r1 = r1.n
            if (r1 == 0) goto Le
            int r2 = r1.length
            r4 = 0
        L2d:
            if (r4 >= r2) goto Le
            r5 = r1[r4]
            boolean r5 = r7.f(r5)
            if (r5 == 0) goto L38
            return r3
        L38:
            int r4 = r4 + 1
            goto L2d
        L3b:
            return r0
    }

    private boolean a(java.lang.String r11, cn.jiguang.commons.c.m r12, java.lang.String r13) {
            r10 = this;
            long r0 = java.lang.System.currentTimeMillis()
            cn.jiguang.commons.L.ac r2 = cn.jiguang.commons.L.ac.a()
            r3 = 0
            long r5 = r2.a(r11, r3)
            long r7 = r12.a(r13)
            java.lang.String r12 = "JLocationv2"
            java.lang.String r2 = ", type:"
            int r9 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r9 == 0) goto L41
            long r3 = r0 - r5
            long r3 = java.lang.Math.abs(r3)
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 < 0) goto L25
            goto L41
        L25:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "skip collection - key:"
            r0.append(r1)
            r0.append(r11)
            r0.append(r2)
            r0.append(r13)
            java.lang.String r11 = r0.toString()
            cn.jiguang.commons.w.a.a(r12, r11)
            r11 = 0
            return r11
        L41:
            cn.jiguang.commons.L.ac r3 = cn.jiguang.commons.L.ac.a()
            r3.c(r11, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "interval reached - key:"
            r0.append(r1)
            r0.append(r11)
            r0.append(r2)
            r0.append(r13)
            java.lang.String r11 = r0.toString()
            cn.jiguang.commons.w.a.a(r12, r11)
            r11 = 1
            return r11
    }

    public static cn.jiguang.commons.J.d c() {
            cn.jiguang.commons.J.d r0 = cn.jiguang.commons.J.d.c.a()
            return r0
    }

    private java.util.List c(cn.jiguang.commons.c.m r19, java.util.List r20) {
            r18 = this;
            r1 = r18
            r0 = r19
            java.lang.String r2 = ""
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.String r4 = "JLocationv2"
            if (r20 == 0) goto L20a
            boolean r5 = r20.isEmpty()     // Catch: java.lang.Exception -> L40
            if (r5 == 0) goto L17
            goto L20a
        L17:
            java.lang.String r5 = "wifi_min_level"
            int r5 = r0.c(r5)     // Catch: java.lang.Exception -> L40
            if (r5 < 0) goto L43
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L40
            r6.<init>()     // Catch: java.lang.Exception -> L40
            java.lang.String r7 = "wifi:srv_cfg_err:level="
            r6.append(r7)     // Catch: java.lang.Exception -> L40
            r6.append(r5)     // Catch: java.lang.Exception -> L40
            java.lang.String r5 = " (expect<0),fallback="
            r6.append(r5)     // Catch: java.lang.Exception -> L40
            r5 = -90
            r6.append(r5)     // Catch: java.lang.Exception -> L40
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> L40
            cn.jiguang.commons.w.a.f(r4, r6)     // Catch: java.lang.Exception -> L40
            goto L43
        L40:
            r0 = move-exception
            goto L211
        L43:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Exception -> L40
            r6.<init>()     // Catch: java.lang.Exception -> L40
            java.util.Iterator r7 = r20.iterator()     // Catch: java.lang.Exception -> L40
        L4c:
            boolean r8 = r7.hasNext()     // Catch: java.lang.Exception -> L40
            if (r8 == 0) goto L62
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Exception -> L40
            android.net.wifi.ScanResult r8 = (android.net.wifi.ScanResult) r8     // Catch: java.lang.Exception -> L40
            if (r8 == 0) goto L4c
            int r9 = r8.level     // Catch: java.lang.Exception -> L40
            if (r9 < r5) goto L4c
            r6.add(r8)     // Catch: java.lang.Exception -> L40
            goto L4c
        L62:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L40
            r5.<init>()     // Catch: java.lang.Exception -> L40
            java.lang.String r7 = "wifi:flt="
            r5.append(r7)     // Catch: java.lang.Exception -> L40
            int r7 = r6.size()     // Catch: java.lang.Exception -> L40
            r5.append(r7)     // Catch: java.lang.Exception -> L40
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L40
            cn.jiguang.commons.w.a.a(r4, r5)     // Catch: java.lang.Exception -> L40
            boolean r5 = r6.isEmpty()     // Catch: java.lang.Exception -> L40
            if (r5 == 0) goto L95
            java.lang.String r0 = "wifi:all_weak"
            cn.jiguang.commons.w.a.f(r4, r0)     // Catch: java.lang.Exception -> L40
            cn.jiguang.commons.A.a r0 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Exception -> L40
            r2 = 3040(0xbe0, float:4.26E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L40
            r0.o(r2)     // Catch: java.lang.Exception -> L40
            return r3
        L95:
            cn.jiguang.commons.J.d$e r5 = new cn.jiguang.commons.J.d$e     // Catch: java.lang.Exception -> L40
            r7 = 0
            r5.<init>(r1, r7)     // Catch: java.lang.Exception -> L40
            java.util.Collections.sort(r6, r5)     // Catch: java.lang.Exception -> L40
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L40
            r5.<init>()     // Catch: java.lang.Exception -> L40
            java.lang.String r8 = "wifi_count"
            int r8 = r0.c(r8)     // Catch: java.lang.Exception -> L40
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Exception -> L40
            r9.<init>()     // Catch: java.lang.Exception -> L40
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Exception -> L40
            r11 = 0
        Lb4:
            boolean r12 = r6.hasNext()     // Catch: java.lang.Exception -> L40
            if (r12 == 0) goto L145
            java.lang.Object r12 = r6.next()     // Catch: java.lang.Exception -> L40
            android.net.wifi.ScanResult r12 = (android.net.wifi.ScanResult) r12     // Catch: java.lang.Exception -> L40
            if (r11 < r8) goto Lc4
            goto L145
        Lc4:
            java.lang.String r13 = r12.BSSID     // Catch: java.lang.Exception -> L40 java.lang.NumberFormatException -> L12b
            java.lang.String r14 = ":"
            java.lang.String r13 = r13.replace(r14, r2)     // Catch: java.lang.Exception -> L40 java.lang.NumberFormatException -> L12b
            r14 = 16
            long r13 = java.lang.Long.parseLong(r13, r14)     // Catch: java.lang.Exception -> L40 java.lang.NumberFormatException -> L12b
            r15 = 0
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 != 0) goto Ldb
            r20 = 0
            goto L129
        Ldb:
            java.lang.Long r13 = java.lang.Long.valueOf(r13)     // Catch: java.lang.Exception -> L40
            r9.add(r13)     // Catch: java.lang.Exception -> L40
            java.lang.String r13 = "%s#%s#%d#%s#%d%s"
            java.lang.String r14 = r12.SSID     // Catch: java.lang.Exception -> L40
            java.lang.String r15 = r12.BSSID     // Catch: java.lang.Exception -> L40
            r20 = 0
            int r10 = r12.level     // Catch: java.lang.Exception -> L40
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Exception -> L40
            java.lang.String r12 = r12.capabilities     // Catch: java.lang.Exception -> L40
            long r16 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L40
            java.lang.Long r16 = java.lang.Long.valueOf(r16)     // Catch: java.lang.Exception -> L40
            if (r11 != 0) goto Lff
            java.lang.String r17 = "#strongest"
            goto L101
        Lff:
            r17 = r2
        L101:
            r7 = 6
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Exception -> L40
            r7[r20] = r14     // Catch: java.lang.Exception -> L40
            r14 = 1
            r7[r14] = r15     // Catch: java.lang.Exception -> L40
            r14 = 2
            r7[r14] = r10     // Catch: java.lang.Exception -> L40
            r10 = 3
            r7[r10] = r12     // Catch: java.lang.Exception -> L40
            r10 = 4
            r7[r10] = r16     // Catch: java.lang.Exception -> L40
            r10 = 5
            r7[r10] = r17     // Catch: java.lang.Exception -> L40
            java.lang.String r7 = java.lang.String.format(r13, r7)     // Catch: java.lang.Exception -> L40
            int r10 = r5.length()     // Catch: java.lang.Exception -> L40
            if (r10 <= 0) goto L124
            java.lang.String r10 = ","
            r5.append(r10)     // Catch: java.lang.Exception -> L40
        L124:
            r5.append(r7)     // Catch: java.lang.Exception -> L40
            int r11 = r11 + 1
        L129:
            r7 = 0
            goto Lb4
        L12b:
            r20 = 0
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L40
            r7.<init>()     // Catch: java.lang.Exception -> L40
            java.lang.String r10 = "wifi:bad_bssid:"
            r7.append(r10)     // Catch: java.lang.Exception -> L40
            java.lang.String r10 = r12.BSSID     // Catch: java.lang.Exception -> L40
            r7.append(r10)     // Catch: java.lang.Exception -> L40
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> L40
            cn.jiguang.commons.w.a.f(r4, r7)     // Catch: java.lang.Exception -> L40
            goto L129
        L145:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L40
            r2.<init>()     // Catch: java.lang.Exception -> L40
            java.lang.String r6 = "wifi:valid="
            r2.append(r6)     // Catch: java.lang.Exception -> L40
            int r6 = r9.size()     // Catch: java.lang.Exception -> L40
            r2.append(r6)     // Catch: java.lang.Exception -> L40
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L40
            cn.jiguang.commons.w.a.a(r4, r2)     // Catch: java.lang.Exception -> L40
            boolean r2 = r9.isEmpty()     // Catch: java.lang.Exception -> L40
            if (r2 != 0) goto L203
            cn.jiguang.commons.J.d$d r2 = new cn.jiguang.commons.J.d$d     // Catch: java.lang.Exception -> L40
            r6 = 0
            r2.<init>(r1, r6)     // Catch: java.lang.Exception -> L40
            java.util.Collections.sort(r9, r2)     // Catch: java.lang.Exception -> L40
            java.util.List r2 = r0.a()     // Catch: java.lang.Exception -> L40
            if (r2 == 0) goto L1eb
            boolean r6 = r2.isEmpty()     // Catch: java.lang.Exception -> L40
            if (r6 != 0) goto L1eb
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Exception -> L40
            r6.<init>(r9)     // Catch: java.lang.Exception -> L40
            r6.retainAll(r2)     // Catch: java.lang.Exception -> L40
            int r7 = r6.size()     // Catch: java.lang.Exception -> L40
            int r7 = r7 * 100
            int r8 = r9.size()     // Catch: java.lang.Exception -> L40
            int r7 = r7 / r8
            int r7 = 100 - r7
            java.lang.String r8 = "new_wifi_percent"
            int r8 = r0.c(r8)     // Catch: java.lang.Exception -> L40
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L40
            r10.<init>()     // Catch: java.lang.Exception -> L40
            java.lang.String r11 = "wifi:chg="
            r10.append(r11)     // Catch: java.lang.Exception -> L40
            r10.append(r7)     // Catch: java.lang.Exception -> L40
            java.lang.String r11 = "%,thresh="
            r10.append(r11)     // Catch: java.lang.Exception -> L40
            r10.append(r8)     // Catch: java.lang.Exception -> L40
            java.lang.String r11 = "%,new="
            r10.append(r11)     // Catch: java.lang.Exception -> L40
            int r11 = r9.size()     // Catch: java.lang.Exception -> L40
            r10.append(r11)     // Catch: java.lang.Exception -> L40
            java.lang.String r11 = ",cache="
            r10.append(r11)     // Catch: java.lang.Exception -> L40
            int r2 = r2.size()     // Catch: java.lang.Exception -> L40
            r10.append(r2)     // Catch: java.lang.Exception -> L40
            java.lang.String r2 = ",inter="
            r10.append(r2)     // Catch: java.lang.Exception -> L40
            int r2 = r6.size()     // Catch: java.lang.Exception -> L40
            r10.append(r2)     // Catch: java.lang.Exception -> L40
            java.lang.String r2 = r10.toString()     // Catch: java.lang.Exception -> L40
            cn.jiguang.commons.w.a.a(r4, r2)     // Catch: java.lang.Exception -> L40
            if (r7 >= r8) goto L1eb
            java.lang.String r0 = "wifi:skip:chg_low"
            cn.jiguang.commons.w.a.a(r4, r0)     // Catch: java.lang.Exception -> L40
            cn.jiguang.commons.A.a r0 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Exception -> L40
            r2 = 3041(0xbe1, float:4.261E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L40
            r0.o(r2)     // Catch: java.lang.Exception -> L40
            goto L22a
        L1eb:
            r0.a(r9)     // Catch: java.lang.Exception -> L40
            int r0 = r5.length()     // Catch: java.lang.Exception -> L40
            if (r0 <= 0) goto L1ff
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Exception -> L40
            r3.add(r0)     // Catch: java.lang.Exception -> L40
            java.lang.String r0 = "wifi:add:ok"
            goto L206
        L1ff:
            java.lang.String r0 = "wifi:builder_empty"
            goto L206
        L203:
            java.lang.String r0 = "wifi:no_valid_bssid"
        L206:
            cn.jiguang.commons.w.a.a(r4, r0)     // Catch: java.lang.Exception -> L40
            goto L22a
        L20a:
            java.lang.String r0 = "wifi:empty"
            cn.jiguang.commons.w.a.a(r4, r0)     // Catch: java.lang.Exception -> L40
            return r3
        L211:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "wifi:err:"
            r2.append(r5)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            cn.jiguang.commons.w.a.c(r4, r0)
        L22a:
            return r3
    }

    static /* synthetic */ void c(cn.jiguang.commons.J.d r0, cn.jiguang.commons.c.m r1, boolean r2, cn.jiguang.commons.J.f r3) {
            r0.c(r1, r2, r3)
            return
    }

    private void c(cn.jiguang.commons.c.m r5, boolean r6, cn.jiguang.commons.J.f r7) {
            r4 = this;
            cn.jiguang.commons.A.a r0 = cn.jiguang.commons.A.a.f()
            r1 = 3003(0xbbb, float:4.208E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.i(r1)
            java.lang.String r0 = "gps_enabled"
            boolean r0 = r5.d(r0)
            r1 = 2
            java.lang.String r2 = "JLocationv2"
            if (r0 != 0) goto L2e
            java.lang.String r5 = "gps disabled by config"
            cn.jiguang.commons.w.a.a(r2, r5)
            cn.jiguang.commons.A.a r5 = cn.jiguang.commons.A.a.f()
            r0 = 3036(0xbdc, float:4.254E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.i(r0)
            r4.a(r1, r6, r7)
            return
        L2e:
            java.lang.String r0 = "last_gps_collection_time"
            java.lang.String r3 = "gps_interval"
            boolean r0 = r4.a(r0, r5, r3)
            if (r0 != 0) goto L4e
            java.lang.String r5 = "gps skip by interval"
            cn.jiguang.commons.w.a.a(r2, r5)
            cn.jiguang.commons.A.a r5 = cn.jiguang.commons.A.a.f()
            r0 = 3037(0xbdd, float:4.256E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.i(r0)
            r4.a(r1, r6, r7)
            return
        L4e:
            cn.jiguang.commons.g.l r0 = cn.jiguang.commons.g.l.a()
            r3 = 1502(0x5de, float:2.105E-42)
            boolean r0 = r0.a(r3)
            if (r0 != 0) goto L63
            java.lang.String r5 = "gps disabled by controller"
            cn.jiguang.commons.w.a.a(r2, r5)
            r4.a(r1, r6, r7)
            return
        L63:
            cn.jiguang.commons.J.a r0 = cn.jiguang.commons.J.a.e()
            cn.jiguang.commons.J.d$a r1 = new cn.jiguang.commons.J.d$a
            r1.<init>(r4, r7, r6)
            r0.c(r5, r1)
            return
    }

    static /* synthetic */ void d(cn.jiguang.commons.J.d r0, cn.jiguang.commons.c.m r1, boolean r2, cn.jiguang.commons.J.f r3) {
            r0.a(r1, r2, r3)
            return
    }

    private void d(cn.jiguang.commons.c.m r7, boolean r8, cn.jiguang.commons.J.f r9) {
            r6 = this;
            r0 = 3001(0xbb9, float:4.205E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            cn.jiguang.commons.A.a r1 = cn.jiguang.commons.A.a.f()
            r2 = 3003(0xbbb, float:4.208E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.o(r2)
            java.lang.String r1 = "wifi_enabled"
            boolean r1 = r7.d(r1)
            r2 = 1
            java.lang.String r3 = "JLocationv2"
            if (r1 != 0) goto L36
            java.lang.String r7 = "wifi disabled by config"
            cn.jiguang.commons.w.a.a(r3, r7)
            cn.jiguang.commons.A.a r7 = cn.jiguang.commons.A.a.f()
            r0 = 3036(0xbdc, float:4.254E-42)
        L2b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7.o(r0)
            r6.a(r2, r8, r9)
            return
        L36:
            java.lang.String r1 = "last_wifi_collection_time"
            java.lang.String r4 = "wifi_interval"
            boolean r1 = r6.a(r1, r7, r4)
            if (r1 != 0) goto L4e
            java.lang.String r7 = "wifi skip by interval"
            cn.jiguang.commons.w.a.a(r3, r7)
            cn.jiguang.commons.A.a r7 = cn.jiguang.commons.A.a.f()
            r0 = 3037(0xbdd, float:4.256E-42)
            goto L2b
        L4e:
            cn.jiguang.commons.g.n r1 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Throwable -> L6a
            r4 = 1505(0x5e1, float:2.109E-42)
            java.util.List r1 = r1.c(r4, r8)     // Catch: java.lang.Throwable -> L6a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6a
            r4.<init>()     // Catch: java.lang.Throwable -> L6a
            java.lang.String r5 = "wifi scan results:"
            r4.append(r5)     // Catch: java.lang.Throwable -> L6a
            if (r1 == 0) goto L6d
            int r5 = r1.size()     // Catch: java.lang.Throwable -> L6a
            goto L6e
        L6a:
            r7 = move-exception
            goto Lec
        L6d:
            r5 = 0
        L6e:
            r4.append(r5)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L6a
            cn.jiguang.commons.w.a.a(r3, r4)     // Catch: java.lang.Throwable -> L6a
            if (r1 == 0) goto Ldb
            boolean r4 = r1.isEmpty()     // Catch: java.lang.Throwable -> L6a
            if (r4 == 0) goto L81
            goto Ldb
        L81:
            java.util.List r7 = r6.c(r7, r1)     // Catch: java.lang.Throwable -> L6a
            if (r7 == 0) goto Lca
            boolean r1 = r7.isEmpty()     // Catch: java.lang.Throwable -> L6a
            if (r1 != 0) goto Lca
            java.util.Iterator r0 = r7.iterator()     // Catch: java.lang.Throwable -> L6a
        L91:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L6a
            if (r1 == 0) goto La1
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L6a
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L6a
            r9.d(r1)     // Catch: java.lang.Throwable -> L6a
            goto L91
        La1:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6a
            r0.<init>()     // Catch: java.lang.Throwable -> L6a
            java.lang.String r1 = "wifi data collected:"
            r0.append(r1)     // Catch: java.lang.Throwable -> L6a
            int r7 = r7.size()     // Catch: java.lang.Throwable -> L6a
            r0.append(r7)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r7 = " entries"
            r0.append(r7)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r7 = r0.toString()     // Catch: java.lang.Throwable -> L6a
            cn.jiguang.commons.w.a.a(r3, r7)     // Catch: java.lang.Throwable -> L6a
            cn.jiguang.commons.A.a r7 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L6a
            r0 = 3000(0xbb8, float:4.204E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L6a
            goto Ld4
        Lca:
            java.lang.String r7 = "wifi:no_data_to_add"
            cn.jiguang.commons.w.a.a(r3, r7)     // Catch: java.lang.Throwable -> L6a
            cn.jiguang.commons.A.a r7 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L6a
        Ld4:
            r7.o(r0)     // Catch: java.lang.Throwable -> L6a
            r6.a(r2, r8, r9)
            return
        Ldb:
            java.lang.String r7 = "wifi scan empty"
            cn.jiguang.commons.w.a.a(r3, r7)     // Catch: java.lang.Throwable -> L6a
            cn.jiguang.commons.A.a r7 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L6a
            r7.o(r0)     // Catch: java.lang.Throwable -> L6a
            r6.a(r2, r8, r9)
            return
        Lec:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L116
            r0.<init>()     // Catch: java.lang.Throwable -> L116
            java.lang.String r1 = "wifi err:"
            r0.append(r1)     // Catch: java.lang.Throwable -> L116
            java.lang.String r7 = r7.getMessage()     // Catch: java.lang.Throwable -> L116
            r0.append(r7)     // Catch: java.lang.Throwable -> L116
            java.lang.String r7 = r0.toString()     // Catch: java.lang.Throwable -> L116
            cn.jiguang.commons.w.a.c(r3, r7)     // Catch: java.lang.Throwable -> L116
            cn.jiguang.commons.A.a r7 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L116
            r0 = 3002(0xbba, float:4.207E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L116
            r7.o(r0)     // Catch: java.lang.Throwable -> L116
            r6.a(r2, r8, r9)
            return
        L116:
            r7 = move-exception
            r6.a(r2, r8, r9)
            throw r7
    }

    @Override // cn.jiguang.commons.a.c
    public java.lang.String a() {
            r1 = this;
            java.lang.String r0 = "JLocationv2"
            return r0
    }

    @Override // cn.jiguang.commons.a.c
    public void a(boolean r3) {
            r2 = this;
            cn.jiguang.commons.J.e r0 = cn.jiguang.commons.J.e.i()     // Catch: java.lang.Throwable -> Ld
            cn.jiguang.commons.J.d$b r1 = new cn.jiguang.commons.J.d$b     // Catch: java.lang.Throwable -> Ld
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> Ld
            r0.c(r1)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r3 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "v2 doBusiness err:"
            r0.append(r1)
            java.lang.String r3 = r3.getMessage()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "JLocationv2"
            cn.jiguang.commons.w.a.f(r0, r3)
            cn.jiguang.commons.A.a r3 = cn.jiguang.commons.A.a.f()
            r0 = 3002(0xbba, float:4.207E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.k(r0)
            return
    }
}
