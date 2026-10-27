package cn.jiguang.commons.g;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class o {

    /* renamed from: c, reason: collision with root package name */
    private static final java.util.Set f1124c = null;
    private final java.util.concurrent.ConcurrentHashMap a;

    class a implements java.util.concurrent.Callable {
        final /* synthetic */ int a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f1125b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ java.lang.Object[] f1126c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ cn.jiguang.commons.g.o f1127d;

        a(cn.jiguang.commons.g.o r1, int r2, boolean r3, java.lang.Object[] r4) {
                r0 = this;
                r0.f1127d = r1
                r0.a = r2
                r0.f1125b = r3
                r0.f1126c = r4
                r0.<init>()
                return
        }

        @Override // java.util.concurrent.Callable
        public java.lang.Object call() {
                r4 = this;
                cn.jiguang.commons.g.o r0 = r4.f1127d
                int r1 = r4.a
                boolean r2 = r4.f1125b
                java.lang.Object[] r3 = r4.f1126c
                java.lang.Object r0 = cn.jiguang.commons.g.o.a(r0, r1, r2, r3)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "get: "
                r1.append(r2)
                int r2 = r4.a
                r1.append(r2)
                java.lang.String r2 = " ,new val="
                r1.append(r2)
                r1.append(r0)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "DeviceDataCollector"
                cn.jiguang.commons.w.a.a(r2, r1)
                cn.jiguang.commons.d.c r1 = cn.jiguang.commons.d.c.a()
                int r2 = r4.a
                r1.a(r2, r0)
                return r0
        }
    }

    class b implements java.util.concurrent.Callable {
        final /* synthetic */ int a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.util.concurrent.FutureTask f1128b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ cn.jiguang.commons.g.o f1129c;

        b(cn.jiguang.commons.g.o r1, int r2, java.util.concurrent.FutureTask r3) {
                r0 = this;
                r0.f1129c = r1
                r0.a = r2
                r0.f1128b = r3
                r0.<init>()
                return
        }

        public java.util.concurrent.FutureTask a() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "cc:new:"
                r0.append(r1)
                int r1 = r2.a
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "DeviceDataCollector"
                cn.jiguang.commons.w.a.a(r1, r0)
                java.util.concurrent.FutureTask r0 = r2.f1128b
                return r0
        }

        @Override // java.util.concurrent.Callable
        public /* synthetic */ java.lang.Object call() {
                r1 = this;
                java.util.concurrent.FutureTask r0 = r1.a()
                return r0
        }
    }

    private static final class c {
        private static final cn.jiguang.commons.g.o a = null;

        static {
                cn.jiguang.commons.g.o r0 = new cn.jiguang.commons.g.o
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.commons.g.o.c.a = r0
                return
        }

        public c() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.commons.g.o a() {
                cn.jiguang.commons.g.o r0 = cn.jiguang.commons.g.o.c.a
                return r0
        }
    }

    static {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            cn.jiguang.commons.g.o.f1124c = r0
            r1 = 1100(0x44c, float:1.541E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            r1 = 1110(0x456, float:1.555E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            r1 = 1502(0x5de, float:2.105E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            r1 = 1501(0x5dd, float:2.103E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            r1 = 1505(0x5e1, float:2.109E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            r1 = 2801(0xaf1, float:3.925E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            r1 = 2800(0xaf0, float:3.924E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            r1 = 1601(0x641, float:2.243E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            r1 = 1608(0x648, float:2.253E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            r1 = 1602(0x642, float:2.245E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            r1 = 1615(0x64f, float:2.263E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            r1 = 1900(0x76c, float:2.662E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            r1 = 1901(0x76d, float:2.664E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            return
    }

    private o() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.a = r0
            return
    }

    /* synthetic */ o(cn.jiguang.commons.g.o.a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    private java.lang.Object a(int r5, boolean r6, java.lang.Object... r7) {
            r4 = this;
            r0 = 1026(0x402, float:1.438E-42)
            if (r5 == r0) goto L219
            r0 = 1027(0x403, float:1.439E-42)
            java.lang.String r1 = "0"
            java.lang.String r2 = "1"
            if (r5 == r0) goto L211
            r0 = 1113(0x459, float:1.56E-42)
            if (r5 == r0) goto L20c
            r0 = 1114(0x45a, float:1.561E-42)
            if (r5 == r0) goto L207
            r0 = 1900(0x76c, float:2.662E-42)
            if (r5 == r0) goto L202
            r0 = 1901(0x76d, float:2.664E-42)
            if (r5 == r0) goto L1fd
            switch(r5) {
                case 1001: goto L1f8;
                case 1002: goto L1f3;
                case 1003: goto L1ee;
                case 1004: goto L1e9;
                case 1005: goto L1e4;
                case 1006: goto L1df;
                case 1007: goto L1da;
                default: goto L1f;
            }
        L1f:
            r0 = 1022(0x3fe, float:1.432E-42)
            if (r5 == r0) goto L1d5
            r0 = 1036(0x40c, float:1.452E-42)
            if (r5 == r0) goto L1d0
            r0 = 1040(0x410, float:1.457E-42)
            if (r5 == r0) goto L1cb
            r0 = 1100(0x44c, float:1.541E-42)
            r3 = 0
            if (r5 == r0) goto L1c6
            r0 = 1102(0x44e, float:1.544E-42)
            if (r5 == r0) goto L1aa
            r7 = 1110(0x456, float:1.555E-42)
            if (r5 == r7) goto L1a5
            r6 = 1200(0x4b0, float:1.682E-42)
            if (r5 == r6) goto L1a0
            r6 = 1800(0x708, float:2.522E-42)
            if (r5 == r6) goto L194
            r6 = 2001(0x7d1, float:2.804E-42)
            if (r5 == r6) goto L18f
            r6 = 2500(0x9c4, float:3.503E-42)
            if (r5 == r6) goto L187
            r6 = 2004(0x7d4, float:2.808E-42)
            if (r5 == r6) goto L182
            r6 = 2005(0x7d5, float:2.81E-42)
            if (r5 == r6) goto L17d
            r6 = 2800(0xaf0, float:3.924E-42)
            if (r5 == r6) goto L174
            r6 = 2801(0xaf1, float:3.925E-42)
            if (r5 == r6) goto L16f
            switch(r5) {
                case 1009: goto L16a;
                case 1010: goto L165;
                case 1011: goto L160;
                case 1012: goto L15b;
                case 1013: goto L156;
                case 1014: goto L151;
                case 1015: goto L14c;
                case 1016: goto L147;
                case 1017: goto L142;
                case 1018: goto L13d;
                case 1019: goto L138;
                case 1020: goto L133;
                default: goto L5b;
            }
        L5b:
            switch(r5) {
                case 1029: goto L12e;
                case 1030: goto L129;
                case 1031: goto L124;
                case 1032: goto L11f;
                default: goto L5e;
            }
        L5e:
            switch(r5) {
                case 1501: goto L11a;
                case 1502: goto L111;
                case 1503: goto L10c;
                case 1504: goto Lfd;
                case 1505: goto Lf8;
                case 1506: goto Lf3;
                case 1507: goto Lee;
                case 1508: goto Le9;
                case 1509: goto Le4;
                default: goto L61;
            }
        L61:
            r6 = 0
            switch(r5) {
                case 1601: goto Ldf;
                case 1602: goto Lda;
                case 1603: goto Lc5;
                case 1604: goto Lc0;
                case 1605: goto Lb7;
                default: goto L65;
            }
        L65:
            switch(r5) {
                case 1607: goto Lb2;
                case 1608: goto Lad;
                case 1609: goto La8;
                case 1610: goto L9f;
                case 1611: goto L96;
                default: goto L68;
            }
        L68:
            switch(r5) {
                case 1613: goto L91;
                case 1614: goto L8c;
                case 1615: goto L87;
                default: goto L6b;
            }
        L6b:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "get: "
            r7.append(r0)
            r7.append(r5)
            java.lang.String r5 = " not impl"
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            java.lang.String r7 = "DeviceDataCollector"
            cn.jiguang.commons.w.a.a(r7, r5)
            return r6
        L87:
            android.net.wifi.WifiInfo r5 = cn.jiguang.commons.L.ah.s()
            return r5
        L8c:
            java.util.List r5 = cn.jiguang.commons.F.c.e()
            return r5
        L91:
            java.util.List r5 = cn.jiguang.commons.F.c.f()
            return r5
        L96:
            int r5 = cn.jiguang.commons.L.ah.v()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            return r5
        L9f:
            int r5 = cn.jiguang.commons.L.ah.x()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            return r5
        La8:
            java.lang.String r5 = cn.jiguang.commons.L.ah.o()
            return r5
        Lad:
            java.lang.String r5 = cn.jiguang.commons.L.ah.w()
            return r5
        Lb2:
            java.lang.String r5 = cn.jiguang.commons.L.ah.p()
            return r5
        Lb7:
            int r5 = cn.jiguang.commons.L.ah.g()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            return r5
        Lc0:
            java.lang.String r5 = cn.jiguang.commons.L.ah.f()
            return r5
        Lc5:
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch: java.lang.Throwable -> Ld9
            r5.<init>()     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r7 = cn.jiguang.commons.L.ah.d()     // Catch: java.lang.Throwable -> Ld9
            r5.put(r7)     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r7 = cn.jiguang.commons.L.ah.e()     // Catch: java.lang.Throwable -> Ld9
            r5.put(r7)     // Catch: java.lang.Throwable -> Ld9
            return r5
        Ld9:
            return r6
        Lda:
            android.net.DhcpInfo r5 = cn.jiguang.commons.L.ah.a()
            return r5
        Ldf:
            java.lang.String r5 = cn.jiguang.commons.L.ah.q()
            return r5
        Le4:
            java.lang.String r5 = cn.jiguang.commons.L.ae.k()
            return r5
        Le9:
            java.util.List r5 = cn.jiguang.commons.L.ah.r()
            return r5
        Lee:
            java.lang.String r5 = cn.jiguang.commons.L.ae.j()
            return r5
        Lf3:
            java.lang.String r5 = cn.jiguang.commons.L.ae.i()
            return r5
        Lf8:
            java.util.List r5 = cn.jiguang.commons.L.ah.n()
            return r5
        Lfd:
            java.lang.String r5 = cn.jiguang.commons.L.g.c()
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L10b
            java.lang.String r5 = r5.toLowerCase()
        L10b:
            return r5
        L10c:
            java.lang.String r5 = cn.jiguang.commons.L.ah.m()
            return r5
        L111:
            cn.jiguang.commons.L.q r5 = cn.jiguang.commons.L.q.g()
            cn.jiguang.commons.c.j r5 = r5.e()
            return r5
        L11a:
            java.util.List r5 = cn.jiguang.commons.L.ae.c()
            return r5
        L11f:
            java.lang.String r5 = cn.jiguang.commons.L.j.i()
            return r5
        L124:
            java.lang.String r5 = cn.jiguang.commons.L.j.m()
            return r5
        L129:
            java.lang.String r5 = cn.jiguang.commons.L.j.f()
            return r5
        L12e:
            org.json.JSONObject r5 = cn.jiguang.commons.L.j.o()
            return r5
        L133:
            java.lang.String r5 = cn.jiguang.commons.L.j.s()
            return r5
        L138:
            java.lang.String r5 = cn.jiguang.commons.L.j.r()
            return r5
        L13d:
            java.lang.String r5 = r4.g()
            return r5
        L142:
            java.lang.String r5 = cn.jiguang.commons.L.j.q()
            return r5
        L147:
            java.lang.String r5 = r4.f()
            return r5
        L14c:
            java.lang.String r5 = cn.jiguang.commons.L.j.p()
            return r5
        L151:
            java.lang.String r5 = cn.jiguang.commons.L.j.c()
            return r5
        L156:
            java.lang.String r5 = cn.jiguang.commons.L.j.n()
            return r5
        L15b:
            java.lang.String r5 = cn.jiguang.commons.L.ae.f()
            return r5
        L160:
            java.lang.String r5 = cn.jiguang.commons.L.j.l()
            return r5
        L165:
            java.lang.String r5 = cn.jiguang.commons.L.ah.i()
            return r5
        L16a:
            java.lang.String r5 = cn.jiguang.commons.L.j.k()
            return r5
        L16f:
            java.lang.String r5 = cn.jiguang.commons.L.ah.h()
            return r5
        L174:
            cn.jiguang.commons.H.f r5 = cn.jiguang.commons.H.f.e()
            java.lang.String r5 = r5.g()
            return r5
        L17d:
            java.lang.String r5 = cn.jiguang.commons.L.ae.e()
            return r5
        L182:
            java.lang.String r5 = cn.jiguang.commons.L.ae.d()
            return r5
        L187:
            boolean r5 = cn.jiguang.commons.L.y.i()
            if (r5 == 0) goto L18e
            return r2
        L18e:
            return r1
        L18f:
            java.lang.String r5 = cn.jiguang.commons.L.j.e()
            return r5
        L194:
            android.content.Context r5 = cn.jiguang.commons.L.h.a()
            boolean r5 = cn.jiguang.commons.L.s.a(r5)
            if (r5 == 0) goto L19f
            return r2
        L19f:
            return r1
        L1a0:
            cn.jiguang.commons.c.g r5 = cn.jiguang.commons.L.d.c()
            return r5
        L1a5:
            java.util.List r5 = cn.jiguang.commons.L.c.e(r6)
            return r5
        L1aa:
            if (r7 == 0) goto L1c0
            int r5 = r7.length
            if (r5 <= 0) goto L1c0
            r5 = r7[r3]
            boolean r6 = r5 instanceof java.lang.Integer
            if (r6 == 0) goto L1c0
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.util.List r5 = cn.jiguang.commons.L.v.a(r5)
            return r5
        L1c0:
            r5 = 1
            java.util.List r5 = cn.jiguang.commons.L.v.a(r5)
            return r5
        L1c6:
            java.util.List r5 = cn.jiguang.commons.L.c.a(r5, r6, r3)
            return r5
        L1cb:
            org.json.JSONObject r5 = cn.jiguang.commons.L.i.h()
            return r5
        L1d0:
            java.lang.String r5 = cn.jiguang.commons.L.j.j()
            return r5
        L1d5:
            org.json.JSONArray r5 = cn.jiguang.commons.L.ae.l()
            return r5
        L1da:
            java.lang.String r5 = cn.jiguang.commons.L.j.h()
            return r5
        L1df:
            java.lang.String r5 = r4.d()
            return r5
        L1e4:
            org.json.JSONArray r5 = cn.jiguang.commons.L.j.d()
            return r5
        L1e9:
            java.lang.String r5 = r4.c()
            return r5
        L1ee:
            java.lang.String r5 = r4.a()
            return r5
        L1f3:
            java.lang.String r5 = cn.jiguang.commons.L.j.g()
            return r5
        L1f8:
            java.lang.String r5 = cn.jiguang.commons.L.j.a()
            return r5
        L1fd:
            java.lang.String r5 = cn.jiguang.commons.i.e.a()
            return r5
        L202:
            java.lang.String r5 = cn.jiguang.commons.i.e.c()
            return r5
        L207:
            java.util.HashMap r5 = cn.jiguang.commons.L.af.a()
            return r5
        L20c:
            java.util.Map r5 = cn.jiguang.commons.L.ag.e()
            return r5
        L211:
            boolean r5 = cn.jiguang.commons.L.l.k()
            if (r5 == 0) goto L218
            return r2
        L218:
            return r1
        L219:
            java.lang.String r5 = cn.jiguang.commons.L.j.t()
            return r5
    }

    static /* synthetic */ java.lang.Object a(cn.jiguang.commons.g.o r0, int r1, boolean r2, java.lang.Object[] r3) {
            java.lang.Object r0 = r0.a(r1, r2, r3)
            return r0
    }

    private java.lang.String a() {
            r1 = this;
            java.lang.String r0 = ""
            return r0
    }

    private java.lang.String c() {
            r1 = this;
            java.lang.String r0 = ""
            return r0
    }

    private java.lang.Object d(int r6, boolean r7, java.lang.Object... r8) {
            r5 = this;
            java.lang.String r0 = "cc:removed:"
            java.lang.String r1 = "DeviceDataCollector"
            java.util.concurrent.FutureTask r2 = new java.util.concurrent.FutureTask
            cn.jiguang.commons.g.o$a r3 = new cn.jiguang.commons.g.o$a
            r3.<init>(r5, r6, r7, r8)
            r2.<init>(r3)
            java.util.concurrent.ConcurrentHashMap r7 = r5.a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            cn.jiguang.commons.g.o$b r3 = new cn.jiguang.commons.g.o$b
            r3.<init>(r5, r6, r2)
            java.lang.Object r7 = cn.jiguang.commons.L.r.a(r7, r8, r3)
            java.util.concurrent.FutureTask r7 = (java.util.concurrent.FutureTask) r7
            if (r7 != r2) goto L24
            r7.run()
        L24:
            r8 = 0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L63 java.util.concurrent.ExecutionException -> L66 java.lang.InterruptedException -> L68 java.util.concurrent.TimeoutException -> Leb
            r3 = 15
            java.lang.Object r2 = r7.get(r3, r2)     // Catch: java.lang.Throwable -> L63 java.util.concurrent.ExecutionException -> L66 java.lang.InterruptedException -> L68 java.util.concurrent.TimeoutException -> Leb
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L63 java.util.concurrent.ExecutionException -> L66 java.lang.InterruptedException -> L68 java.util.concurrent.TimeoutException -> Leb
            r3.<init>()     // Catch: java.lang.Throwable -> L63 java.util.concurrent.ExecutionException -> L66 java.lang.InterruptedException -> L68 java.util.concurrent.TimeoutException -> Leb
            java.lang.String r4 = "cc:ok:"
            r3.append(r4)     // Catch: java.lang.Throwable -> L63 java.util.concurrent.ExecutionException -> L66 java.lang.InterruptedException -> L68 java.util.concurrent.TimeoutException -> Leb
            r3.append(r6)     // Catch: java.lang.Throwable -> L63 java.util.concurrent.ExecutionException -> L66 java.lang.InterruptedException -> L68 java.util.concurrent.TimeoutException -> Leb
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L63 java.util.concurrent.ExecutionException -> L66 java.lang.InterruptedException -> L68 java.util.concurrent.TimeoutException -> Leb
            cn.jiguang.commons.w.a.a(r1, r3)     // Catch: java.lang.Throwable -> L63 java.util.concurrent.ExecutionException -> L66 java.lang.InterruptedException -> L68 java.util.concurrent.TimeoutException -> Leb
            boolean r7 = r7.isDone()
            if (r7 == 0) goto L62
            java.util.concurrent.ConcurrentHashMap r7 = r5.a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            r7.remove(r8)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r0)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            cn.jiguang.commons.w.a.a(r1, r6)
        L62:
            return r2
        L63:
            r8 = move-exception
            goto L125
        L66:
            r2 = move-exception
            goto La5
        L68:
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L63
            r2.interrupt()     // Catch: java.lang.Throwable -> L63
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L63
            r2.<init>()     // Catch: java.lang.Throwable -> L63
            java.lang.String r3 = "cc:interrupted:"
            r2.append(r3)     // Catch: java.lang.Throwable -> L63
            r2.append(r6)     // Catch: java.lang.Throwable -> L63
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L63
            cn.jiguang.commons.w.a.f(r1, r2)     // Catch: java.lang.Throwable -> L63
            boolean r7 = r7.isDone()
            if (r7 == 0) goto La4
            java.util.concurrent.ConcurrentHashMap r7 = r5.a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r7.remove(r2)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r0)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            cn.jiguang.commons.w.a.a(r1, r6)
        La4:
            return r8
        La5:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L63
            r3.<init>()     // Catch: java.lang.Throwable -> L63
            java.lang.String r4 = "cc:err:"
            r3.append(r4)     // Catch: java.lang.Throwable -> L63
            r3.append(r6)     // Catch: java.lang.Throwable -> L63
            java.lang.String r4 = ":"
            r3.append(r4)     // Catch: java.lang.Throwable -> L63
            java.lang.Throwable r2 = r2.getCause()     // Catch: java.lang.Throwable -> L63
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L63
            r3.append(r2)     // Catch: java.lang.Throwable -> L63
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L63
            cn.jiguang.commons.w.a.f(r1, r2)     // Catch: java.lang.Throwable -> L63
            boolean r7 = r7.isDone()
            if (r7 == 0) goto Lea
            java.util.concurrent.ConcurrentHashMap r7 = r5.a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r7.remove(r2)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r0)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            cn.jiguang.commons.w.a.a(r1, r6)
        Lea:
            return r8
        Leb:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L63
            r2.<init>()     // Catch: java.lang.Throwable -> L63
            java.lang.String r3 = "cc:timeout:"
            r2.append(r3)     // Catch: java.lang.Throwable -> L63
            r2.append(r6)     // Catch: java.lang.Throwable -> L63
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L63
            cn.jiguang.commons.w.a.f(r1, r2)     // Catch: java.lang.Throwable -> L63
            r2 = 1
            r7.cancel(r2)     // Catch: java.lang.Throwable -> L63
            boolean r7 = r7.isDone()
            if (r7 == 0) goto L124
            java.util.concurrent.ConcurrentHashMap r7 = r5.a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r7.remove(r2)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r0)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            cn.jiguang.commons.w.a.a(r1, r6)
        L124:
            return r8
        L125:
            boolean r7 = r7.isDone()
            if (r7 == 0) goto L146
            java.util.concurrent.ConcurrentHashMap r7 = r5.a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r7.remove(r2)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r0)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            cn.jiguang.commons.w.a.a(r1, r6)
        L146:
            throw r8
    }

    private java.lang.String d() {
            r1 = this;
            java.lang.String r0 = ""
            return r0
    }

    public static cn.jiguang.commons.g.o e() {
            cn.jiguang.commons.g.o r0 = cn.jiguang.commons.g.o.c.a()
            return r0
    }

    private java.lang.String f() {
            r1 = this;
            java.lang.String r0 = ""
            return r0
    }

    private java.lang.String g() {
            r1 = this;
            java.lang.String r0 = ""
            return r0
    }

    public java.lang.Object c(int r5, boolean r6, java.lang.Object... r7) {
            r4 = this;
            java.lang.String r0 = "DeviceDataCollector"
            r1 = 0
            cn.jiguang.commons.g.l r2 = cn.jiguang.commons.g.l.a()     // Catch: java.lang.Exception -> L1f
            boolean r2 = r2.a(r5, r6)     // Catch: java.lang.Exception -> L1f
            if (r2 != 0) goto Le
            return r1
        Le:
            java.util.Set r2 = cn.jiguang.commons.g.o.f1124c     // Catch: java.lang.Exception -> L1f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Exception -> L1f
            boolean r2 = r2.contains(r3)     // Catch: java.lang.Exception -> L1f
            if (r2 == 0) goto L21
            java.lang.Object r5 = r4.d(r5, r6, r7)     // Catch: java.lang.Exception -> L1f
            return r5
        L1f:
            r6 = move-exception
            goto L49
        L21:
            java.lang.Object r6 = r4.a(r5, r6, r7)     // Catch: java.lang.Exception -> L1f
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L1f
            r7.<init>()     // Catch: java.lang.Exception -> L1f
            java.lang.String r2 = "get: "
            r7.append(r2)     // Catch: java.lang.Exception -> L1f
            r7.append(r5)     // Catch: java.lang.Exception -> L1f
            java.lang.String r2 = " ,new val="
            r7.append(r2)     // Catch: java.lang.Exception -> L1f
            r7.append(r6)     // Catch: java.lang.Exception -> L1f
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> L1f
            cn.jiguang.commons.w.a.a(r0, r7)     // Catch: java.lang.Exception -> L1f
            cn.jiguang.commons.d.c r7 = cn.jiguang.commons.d.c.a()     // Catch: java.lang.Exception -> L1f
            r7.a(r5, r6)     // Catch: java.lang.Exception -> L1f
            return r6
        L49:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r2 = "collectNewData configId: "
            r7.append(r2)
            r7.append(r5)
            java.lang.String r5 = ", error: "
            r7.append(r5)
            java.lang.String r5 = r6.getMessage()
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            cn.jiguang.commons.w.a.c(r0, r5)
            return r1
    }
}
