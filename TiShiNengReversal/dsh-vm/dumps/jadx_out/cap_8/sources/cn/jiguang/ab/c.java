package cn.jiguang.ab;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c {
    private static java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private static java.util.concurrent.atomic.AtomicBoolean f262b;

    /* renamed from: c, reason: collision with root package name */
    private static java.util.concurrent.atomic.AtomicBoolean f263c;

    public static class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        private static org.json.JSONObject a(int r2, java.lang.String r3) {
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>()
                java.lang.String r1 = "e_code"
                r0.put(r1, r2)
                if (r3 == 0) goto Ld
                goto Lf
            Ld:
                java.lang.String r3 = ""
            Lf:
                java.lang.String r2 = "e_msg"
                r0.put(r2, r3)
                return r0
        }

        public static void a(android.content.Context r2, int r3, java.lang.String r4) {
                if (r2 != 0) goto L6
                android.content.Context r2 = cn.jiguang.av.c.a()
            L6:
                java.lang.String r0 = "ConnectingHelper"
                if (r2 != 0) goto L10
                java.lang.String r2 = "report failed: context is null"
                cn.jiguang.w.f.i(r0, r2)
                return
            L10:
                cn.jiguang.e.a r1 = cn.jiguang.e.a.q()
                java.lang.Object r1 = cn.jiguang.e.b.a(r2, r1)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 == 0) goto L30
                org.json.JSONObject r3 = a(r3, r4)     // Catch: java.lang.Throwable -> L2a
                java.lang.String r4 = "tcp_exception"
                cn.jiguang.z.b.a(r2, r3, r4)     // Catch: java.lang.Throwable -> L2a
                return
            L2a:
                r2 = move-exception
                java.lang.String r3 = "Failed to report TCP exception"
                cn.jiguang.w.f.d(r0, r3, r2)
            L30:
                return
        }
    }

    static {
            return
    }

    public c() {
            r1 = this;
            r1.<init>()
            return
    }

    public static int a(android.content.Context r25, cn.jiguang.ag.a r26) {
            r1 = r25
            java.lang.String r2 = "time"
            java.lang.String r3 = "lat"
            long r6 = cn.jiguang.d.a.f(r1)
            java.lang.String r4 = cn.jiguang.d.a.j(r1)
            java.lang.String r4 = cn.jiguang.av.v.k(r4)
            java.lang.String r5 = ""
            if (r4 != 0) goto L18
            r8 = r5
            goto L19
        L18:
            r8 = r4
        L19:
            java.lang.String r9 = cn.jiguang.d.a.e(r1)
            cn.jiguang.ad.b r4 = cn.jiguang.ad.b.a()
            byte r13 = r4.b(r1)
            java.lang.String r10 = r4.f()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Login with - juid:"
            r11.append(r12)
            r11.append(r6)
            java.lang.String r12 = ", appKey:"
            r11.append(r12)
            r11.append(r9)
            java.lang.String r12 = ", sdkVersion:"
            r11.append(r12)
            r11.append(r10)
            java.lang.String r12 = ", pluginPlatformType:"
            r11.append(r12)
            r11.append(r13)
            java.lang.String r11 = r11.toString()
            java.lang.String r12 = "ConnectingHelper"
            cn.jiguang.w.f.h(r12, r11)
            short r11 = r4.c()
            int r14 = cn.jiguang.av.n.b(r1)
            java.lang.String r15 = cn.jiguang.av.g.a(r1)
            r16 = r5
            java.lang.String r5 = "get_loc_info"
            r17 = r8
            r8 = 0
            java.lang.Object r5 = cn.jiguang.i.a.a(r1, r5, r8)
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            r18 = r9
            boolean r9 = r5 instanceof android.os.Bundle
            if (r9 == 0) goto La0
            android.os.Bundle r5 = (android.os.Bundle) r5     // Catch: java.lang.Throwable -> L9c
            r0 = 4641240890982006784(0x4069000000000000, double:200.0)
            r19 = r12
            r9 = r13
            double r12 = r5.getDouble(r3, r0)     // Catch: java.lang.Throwable -> L9a
            r8.put(r3, r12)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r3 = "lng"
            java.lang.String r12 = "lot"
            double r0 = r5.getDouble(r12, r0)     // Catch: java.lang.Throwable -> L9a
            r8.put(r3, r0)     // Catch: java.lang.Throwable -> L9a
            long r0 = r5.getLong(r2)     // Catch: java.lang.Throwable -> L9a
            r8.put(r2, r0)     // Catch: java.lang.Throwable -> L9a
            goto La3
        L9a:
            goto La3
        L9c:
            r19 = r12
            r9 = r13
            goto L9a
        La0:
            r19 = r12
            r9 = r13
        La3:
            int r0 = r8.length()
            if (r0 <= 0) goto Lae
            java.lang.String r0 = r8.toString()
            goto Lb0
        Lae:
            r0 = r16
        Lb0:
            java.lang.String r1 = k(r25)
            java.util.Locale r2 = java.util.Locale.ENGLISH
            r3 = 0
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.String r1 = java.lang.String.format(r2, r1, r5)
            java.lang.String r1 = cn.jiguang.av.v.b(r1)
            if (r1 != 0) goto Lc6
            r1 = r16
            goto Lca
        Lc6:
            java.lang.String r1 = r1.toUpperCase()
        Lca:
            java.lang.String r2 = cn.jiguang.d.a.d(r25)
            int r5 = cn.jiguang.z.b.a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r12 = "login \n juid:"
            r8.append(r12)
            r8.append(r6)
            java.lang.String r12 = "\n flag:"
            r8.append(r12)
            r8.append(r11)
            java.lang.String r12 = "\n netType:"
            r8.append(r12)
            r8.append(r14)
            java.lang.String r12 = "\n deviceId:"
            r8.append(r12)
            r8.append(r15)
            java.lang.String r12 = "\n locInfo:"
            r8.append(r12)
            r8.append(r0)
            java.lang.String r12 = "\n countryCode:"
            r8.append(r12)
            r8.append(r1)
            java.lang.String r12 = "\n accountId:"
            r8.append(r12)
            r8.append(r2)
            java.lang.String r12 = "\n sdkver:"
            r8.append(r12)
            r8.append(r10)
            java.lang.String r12 = "\n userType :"
            r8.append(r12)
            r8.append(r5)
            java.lang.String r8 = r8.toString()
            r12 = r19
            cn.jiguang.w.f.c(r12, r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r13 = "login with cC:"
            r8.append(r13)
            r8.append(r1)
            java.lang.String r8 = r8.toString()
            cn.jiguang.w.f.e(r12, r8)
            boolean r8 = cn.jiguang.ad.g.f392e
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r22 = 0
            java.lang.String r3 = "login with initPushSdk:"
            r13.append(r3)
            r13.append(r8)
            java.lang.String r3 = r13.toString()
            cn.jiguang.w.f.e(r12, r3)
            r3 = r25
            org.json.JSONArray r4 = r4.a(r3)
            java.lang.String r4 = a(r4)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r19 = r0
            java.lang.String r0 = "login gSdkTypeInfo:"
            r13.append(r0)
            r13.append(r4)
            java.lang.String r0 = r13.toString()
            cn.jiguang.w.f.c(r12, r0)
            r21 = r4
            r0 = r16
            r16 = r19
            r19 = r5
            long r4 = c(r3)
            r20 = r0
            r13 = r1
            long r0 = (long) r11
            r23 = r0
            r1 = r12
            r11 = r23
            r0 = r20
            r20 = r8
            r8 = r17
            r17 = r13
            r13 = r9
            r9 = r18
            r18 = r2
            byte[] r2 = cn.jiguang.af.b.a(r4, r6, r8, r9, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r9 = r13
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "pluginPlatformType:0b"
            r4.append(r5)
            r5 = r9 & 255(0xff, float:3.57E-43)
            java.lang.String r5 = java.lang.Integer.toBinaryString(r5)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            cn.jiguang.w.f.f(r1, r4)
            byte[] r4 = cn.jiguang.af.b.b(r3)
            byte[] r2 = cn.jiguang.af.b.a(r3, r2, r4)
            if (r2 == 0) goto L1c1
            int r4 = r2.length
            r5 = 1
            if (r4 >= r5) goto L1c4
        L1c1:
            r1 = r3
            goto L370
        L1c4:
            r4 = 3
            long r8 = cn.jiguang.al.e.a(r3, r4)
            r10 = r26
            int r11 = r10.a(r2)
            if (r11 == 0) goto L1e4
            r0 = 1101(0x44d, float:1.543E-42)
            java.lang.String r1 = "Login send failed"
            cn.jiguang.ab.c.a.a(r3, r0, r1)
            r5 = 1101(0x44d, float:1.543E-42)
            java.lang.String r6 = "Login send failed"
            r2 = 3
            r1 = r3
            r3 = r8
            cn.jiguang.al.e.a(r1, r2, r3, r5, r6)
            r0 = -2
            return r0
        L1e4:
            cn.jiguang.al.c r11 = cn.jiguang.al.c.a()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = r10.f461h
            r12.append(r13)
            java.lang.String r13 = ":"
            r12.append(r13)
            int r14 = r10.f462i
            r12.append(r14)
            java.lang.String r12 = r12.toString()
            int r2 = r2.length
            long r14 = (long) r2
            java.lang.String r2 = "login"
            r11.b(r12, r2, r14)
            r11 = 20000(0x4e20, float:2.8026E-41)
            java.nio.ByteBuffer r11 = r10.a(r11)     // Catch: cn.jiguang.ad.e -> L348
            if (r11 != 0) goto L225
            java.lang.String r0 = "Login failed - recv buffer null"
            cn.jiguang.w.f.k(r1, r0)
            r1 = 1105(0x451, float:1.548E-42)
            cn.jiguang.ab.c.a.a(r3, r1, r0)
            r5 = 1105(0x451, float:1.548E-42)
            java.lang.String r6 = "Login failed - recv buffer null"
            r2 = 3
            r1 = r3
            r3 = r8
            cn.jiguang.al.e.a(r1, r2, r3, r5, r6)
            r0 = -6
            return r0
        L225:
            byte[] r12 = r11.array()
            android.util.Pair r0 = cn.jiguang.af.a.a(r3, r12, r0)
            if (r0 == 0) goto L30d
            java.lang.Object r12 = r0.first
            if (r12 == 0) goto L30d
            java.lang.Object r14 = r0.second
            if (r14 == 0) goto L30d
            cn.jiguang.af.c r12 = (cn.jiguang.af.c) r12
            int r12 = r12.f432c
            if (r12 == r5) goto L23f
            goto L30d
        L23f:
            cn.jiguang.al.c r12 = cn.jiguang.al.c.a()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = r10.f461h
            r14.append(r15)
            r14.append(r13)
            int r10 = r10.f462i
            r14.append(r10)
            java.lang.String r10 = r14.toString()
            byte[] r11 = r11.array()
            int r11 = r11.length
            long r13 = (long) r11
            r12.c(r10, r2, r13)
            cn.jiguang.af.d r2 = new cn.jiguang.af.d
            java.lang.Object r10 = r0.first
            cn.jiguang.af.c r10 = (cn.jiguang.af.c) r10
            java.lang.Object r0 = r0.second
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            r2.<init>(r10, r0)
            java.lang.String r0 = r2.toString()
            cn.jiguang.w.f.c(r1, r0)
            int r0 = r2.a
            cn.jiguang.e.a r10 = cn.jiguang.e.a.R()
            int r11 = r2.f440d
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            cn.jiguang.e.a r10 = r10.a(r11)
            cn.jiguang.e.a[] r5 = new cn.jiguang.e.a[r5]
            r5[r22] = r10
            cn.jiguang.e.b.a(r3, r5)
            if (r0 != 0) goto L2e0
            int r5 = r2.f438b
            cn.jiguang.internal.JConstants.tcpSessionId = r5
            int r5 = r2.f439c
            long r10 = (long) r5
            r12 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 * r12
            cn.jiguang.z.b.a(r3, r10)
            int r2 = r2.f440d
            cn.jiguang.z.b.a(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "Login succeed - sid:"
            r2.append(r5)
            int r5 = cn.jiguang.internal.JConstants.tcpSessionId
            r2.append(r5)
            java.lang.String r5 = ", serverTime;"
            r2.append(r5)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            cn.jiguang.w.f.g(r1, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "Login  success regID:"
            r2.append(r5)
            java.lang.String r5 = cn.jiguang.d.a.b(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            cn.jiguang.w.f.e(r1, r2)
            a(r3, r6)
            cn.jiguang.al.e.a(r3, r4, r8)
            r5 = r0
            goto L30c
        L2e0:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Login failed with server error - code:"
            r2.append(r4)
            java.lang.String r4 = cn.jiguang.ai.d.a(r0)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            cn.jiguang.w.f.j(r1, r2)
            r1 = 10000(0x2710, float:1.4013E-41)
            if (r1 != r0) goto L303
            r1 = 1104(0x450, float:1.547E-42)
            java.lang.String r2 = "Login err code bytebuffer parse"
            cn.jiguang.ab.c.a.a(r3, r1, r2)
        L303:
            r2 = 3
            java.lang.String r6 = "Login failed with server error"
            r5 = r0
            r1 = r3
            r3 = r8
            cn.jiguang.al.e.a(r1, r2, r3, r5, r6)
        L30c:
            return r5
        L30d:
            java.lang.String r0 = "Login failed - can't parse a Login Response"
            cn.jiguang.w.f.k(r1, r0)
            r1 = 1103(0x44f, float:1.546E-42)
            cn.jiguang.ab.c.a.a(r3, r1, r0)
            r5 = 1103(0x44f, float:1.546E-42)
            java.lang.String r6 = "Login failed - can't parse a Login Response"
            r2 = 3
            r1 = r3
            r3 = r8
            cn.jiguang.al.e.a(r1, r2, r3, r5, r6)
            cn.jiguang.al.c r0 = cn.jiguang.al.c.a()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r10.f461h
            r1.append(r2)
            r1.append(r13)
            int r2 = r10.f462i
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            byte[] r2 = r11.array()
            int r2 = r2.length
            long r2 = (long) r2
            java.lang.String r4 = "unknown_login"
            r0.c(r1, r4, r2)
            r0 = -4
            return r0
        L348:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Login failed - recv msg failed wit error:"
            r2.append(r4)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            cn.jiguang.w.f.k(r1, r0)
            r0 = 1102(0x44e, float:1.544E-42)
            java.lang.String r1 = "Login recv failed"
            cn.jiguang.ab.c.a.a(r3, r0, r1)
            r5 = 1102(0x44e, float:1.544E-42)
            java.lang.String r6 = "Login recv failed"
            r2 = 3
            r1 = r3
            r3 = r8
            cn.jiguang.al.e.a(r1, r2, r3, r5, r6)
            r0 = -3
            return r0
        L370:
            r0 = 1100(0x44c, float:1.541E-42)
            java.lang.String r2 = "Login failed - encrytor reg info failed"
            cn.jiguang.ab.c.a.a(r1, r0, r2)
            r0 = -1
            return r0
    }

    private static java.lang.String a(org.json.JSONArray r3) {
            if (r3 == 0) goto L2c
            int r0 = r3.length()
            if (r0 != 0) goto L9
            goto L2c
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
        Lf:
            int r2 = r3.length()
            if (r1 >= r2) goto L27
            if (r1 <= 0) goto L1d
            java.lang.String r2 = "|"
            r0.append(r2)
        L1d:
            int r2 = r3.optInt(r1)
            r0.append(r2)
            int r1 = r1 + 1
            goto Lf
        L27:
            java.lang.String r3 = r0.toString()
            return r3
        L2c:
            java.lang.String r3 = ""
            return r3
    }

    public static void a(android.content.Context r15) {
            cn.jiguang.e.a r0 = cn.jiguang.e.a.aB()
            r1 = 0
            cn.jiguang.e.a r0 = r0.a(r1)
            cn.jiguang.e.a r2 = cn.jiguang.e.a.aC()
            cn.jiguang.e.a r2 = r2.a(r1)
            r3 = 0
            cn.jiguang.e.a r4 = cn.jiguang.e.a.d(r3)
            cn.jiguang.e.a r4 = r4.a(r1)
            r5 = 1
            cn.jiguang.e.a r6 = cn.jiguang.e.a.d(r5)
            cn.jiguang.e.a r6 = r6.a(r1)
            cn.jiguang.e.a r7 = cn.jiguang.e.a.aG()
            cn.jiguang.e.a r7 = r7.a(r1)
            cn.jiguang.e.a r8 = cn.jiguang.e.a.aD()
            cn.jiguang.e.a r8 = r8.a(r1)
            cn.jiguang.e.a r9 = cn.jiguang.e.a.aE()
            cn.jiguang.e.a r9 = r9.a(r1)
            cn.jiguang.e.a r10 = cn.jiguang.e.a.b(r5)
            cn.jiguang.e.a r10 = r10.a(r1)
            cn.jiguang.e.a r11 = cn.jiguang.e.a.b(r3)
            cn.jiguang.e.a r11 = r11.a(r1)
            cn.jiguang.e.a r12 = cn.jiguang.e.a.c(r5)
            cn.jiguang.e.a r12 = r12.a(r1)
            cn.jiguang.e.a r13 = cn.jiguang.e.a.c(r3)
            cn.jiguang.e.a r13 = r13.a(r1)
            r14 = 11
            cn.jiguang.e.a[] r14 = new cn.jiguang.e.a[r14]
            r14[r3] = r0
            r14[r5] = r2
            r0 = 2
            r14[r0] = r4
            r2 = 3
            r14[r2] = r6
            r4 = 4
            r14[r4] = r7
            r4 = 5
            r14[r4] = r8
            r4 = 6
            r14[r4] = r9
            r4 = 7
            r14[r4] = r10
            r4 = 8
            r14[r4] = r11
            r4 = 9
            r14[r4] = r12
            r4 = 10
            r14[r4] = r13
            cn.jiguang.e.b.a(r15, r14)
            cn.jiguang.e.a r4 = cn.jiguang.e.a.M()
            cn.jiguang.e.a r4 = r4.a(r1)
            cn.jiguang.e.a r6 = cn.jiguang.e.a.N()
            cn.jiguang.e.a r6 = r6.a(r1)
            cn.jiguang.e.a r7 = cn.jiguang.e.a.P()
            cn.jiguang.e.a r1 = r7.a(r1)
            cn.jiguang.e.a[] r2 = new cn.jiguang.e.a[r2]
            r2[r3] = r4
            r2[r5] = r6
            r2[r0] = r1
            cn.jiguang.e.b.a(r15, r2)
            return
    }

    public static void a(android.content.Context r1, int r2) {
            r0 = 1
            a(r1, r2, r0)
            return
    }

    public static void a(android.content.Context r4, int r5, boolean r6) {
            java.lang.String r0 = "ConnectingHelper"
            if (r6 == 0) goto L3e
            java.lang.String r6 = cn.jiguang.ai.d.a(r5)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Register Failed with server error - code:"
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            cn.jiguang.w.f.n(r0, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 != 0) goto L36
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Local error description: "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            cn.jiguang.w.f.k(r0, r1)
        L36:
            cn.jiguang.ad.b r1 = cn.jiguang.ad.b.a()
            r2 = 0
            r1.a(r4, r2, r5, r6)
        L3e:
            java.lang.String r6 = cn.jiguang.d.a.e(r4)
            r1 = 11
            if (r5 == r1) goto Lec
            r1 = 1012(0x3f4, float:1.418E-42)
            if (r5 == r1) goto Le9
            r1 = 10001(0x2711, float:1.4014E-41)
            r2 = -1
            if (r5 == r1) goto Le3
            java.lang.String r1 = "包名: "
            java.lang.String r3 = " AppKey:"
            switch(r5) {
                case 1005: goto Lbe;
                case 1006: goto La2;
                case 1007: goto L9c;
                case 1008: goto L84;
                case 1009: goto L6c;
                default: goto L57;
            }
        L57:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Unhandled server response error code - "
            r4.append(r6)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            cn.jiguang.w.f.h(r0, r4)
            return
        L6c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            r5.append(r6)
            java.lang.String r6 = " 非android AppKey"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            cn.jiguang.av.a.a(r4, r5, r2)
            return
        L84:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            r5.append(r6)
            java.lang.String r6 = " 是无效的AppKey,请确认与JIGUANG web端的AppKey一致"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            cn.jiguang.av.a.a(r4, r5, r2)
            return
        L9c:
            java.lang.String r4 = "IMEI is duplicated reported by server. Give up now. "
            cn.jiguang.w.f.f(r0, r4)
            return
        La2:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            java.lang.String r6 = r4.getPackageName()
            r5.append(r6)
            java.lang.String r6 = " 不存在"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            cn.jiguang.av.a.a(r4, r5, r2)
            return
        Lbe:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            java.lang.String r0 = r4.getPackageName()
            r5.append(r0)
            java.lang.String r0 = " 与 AppKey:"
            r5.append(r0)
            r5.append(r6)
            java.lang.String r6 = "不匹配"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            cn.jiguang.av.a.a(r4, r5, r2)
            return
        Le3:
            java.lang.String r5 = " 未在manifest中配置AppKey"
            cn.jiguang.av.a.a(r4, r5, r2)
            return
        Le9:
            a(r4)
        Lec:
            return
    }

    private static void a(android.content.Context r2, long r3) {
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 <= 0) goto L31
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = ""
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = cn.jiguang.a.a.f243j
            java.lang.String r2 = cn.jiguang.av.t.a(r2, r3)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L31
            java.lang.String r3 = new java.lang.String
            byte[] r2 = r2.getBytes()
            r4 = 2
            byte[] r2 = android.util.Base64.encode(r2, r4)
            r3.<init>(r2)
        L31:
            return
    }

    public static void a(android.content.Context r2, boolean r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "setReportKeyEncrypt state: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ConnectingHelper"
            cn.jiguang.w.f.c(r1, r0)
            cn.jiguang.e.a r0 = cn.jiguang.e.a.j()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            cn.jiguang.e.a r3 = r0.a(r3)
            r0 = 1
            cn.jiguang.e.a[] r0 = new cn.jiguang.e.a[r0]
            r1 = 0
            r0[r1] = r3
            cn.jiguang.e.b.a(r2, r0)
            return
    }

    public static void a(boolean r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "changeLocalConnectTcpSslState, state: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ConnectingHelper"
            cn.jiguang.w.f.c(r1, r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = cn.jiguang.ab.c.f262b
            if (r0 != 0) goto L22
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r2)
            cn.jiguang.ab.c.f262b = r0
            return
        L22:
            r0.set(r2)
            return
    }

    private static synchronized byte[] a(java.lang.String r3, int r4, byte[] r5, boolean r6, int r7) {
            java.lang.Class<cn.jiguang.ab.c> r0 = cn.jiguang.ab.c.class
            monitor-enter(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L49
            if (r1 != 0) goto L4b
            int r1 = r3.length()     // Catch: java.lang.Throwable -> L49
            r2 = 2
            if (r1 != r2) goto L4b
            if (r5 == 0) goto L4b
            int r1 = r5.length     // Catch: java.lang.Throwable -> L49
            if (r1 == 0) goto L4b
            cn.jiguang.ai.b r1 = new cn.jiguang.ai.b     // Catch: java.lang.Throwable -> L49
            r2 = 300(0x12c, float:4.2E-43)
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L49
            r2 = 0
            r1.b(r2)     // Catch: java.lang.Throwable -> L49
            byte[] r3 = r3.getBytes()     // Catch: java.lang.Throwable -> L49
            r1.a(r3)     // Catch: java.lang.Throwable -> L49
            long r3 = (long) r4     // Catch: java.lang.Throwable -> L49
            r1.a(r3)     // Catch: java.lang.Throwable -> L49
            r1.b(r7)     // Catch: java.lang.Throwable -> L49
            r1.a(r5)     // Catch: java.lang.Throwable -> L49
            int r3 = r1.a()     // Catch: java.lang.Throwable -> L49
            r1.b(r3, r2)     // Catch: java.lang.Throwable -> L49
            if (r6 == 0) goto L3c
            r3 = 1
            byte r2 = (byte) r3     // Catch: java.lang.Throwable -> L49
        L3c:
            r3 = r2 | 16
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L49
            r4 = 4
            r1.a(r3, r4)     // Catch: java.lang.Throwable -> L49
            byte[] r3 = r1.b()     // Catch: java.lang.Throwable -> L49
            monitor-exit(r0)
            return r3
        L49:
            r3 = move-exception
            goto L53
        L4b:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L49
            java.lang.String r4 = "flag or body length error"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L49
            throw r3     // Catch: java.lang.Throwable -> L49
        L53:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L49
            throw r3
    }

    public static byte[] a(java.lang.String r7, java.lang.String r8) {
            byte[] r8 = cn.jiguang.av.v.j(r8)
            r0 = 0
            r1 = 1
            byte[] r2 = cn.jiguang.av.x.a(r8)     // Catch: java.io.IOException -> L11
            int r3 = r2.length     // Catch: java.io.IOException -> L11
            int r4 = r8.length     // Catch: java.io.IOException -> L11
            if (r3 >= r4) goto L11
            r8 = r2
            r2 = 1
            goto L12
        L11:
            r2 = 0
        L12:
            int r3 = r8.length
            int r4 = cn.jiguang.av.t.a()
            long r5 = (long) r4
            java.lang.String r5 = cn.jiguang.av.t.a(r5)
            r6 = 16
            java.lang.String r0 = r5.substring(r0, r6)
            byte[] r8 = cn.jiguang.av.t.a(r8, r5, r0, r1)
            byte[] r7 = a(r7, r4, r8, r2, r3)
            return r7
    }

    public static byte[] a(java.net.DatagramSocket r2, java.net.DatagramPacket r3) {
            r0 = 6000(0x1770, float:8.408E-42)
            r2.setSoTimeout(r0)
            r2.send(r3)
            r3 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r3]
            java.net.DatagramPacket r1 = new java.net.DatagramPacket
            r1.<init>(r0, r3)
            java.lang.String r3 = "ConnectingHelper"
            java.lang.String r0 = "udp Receiving..."
            cn.jiguang.w.f.d(r3, r0)
            r2.receive(r1)
            int r2 = r1.getLength()
            byte[] r3 = new byte[r2]
            byte[] r0 = r1.getData()
            r1 = 0
            java.lang.System.arraycopy(r0, r1, r3, r1, r2)
            return r3
    }

    public static byte[] a(byte[] r8) {
            java.lang.String r0 = "decrypt response error"
            r1 = 4
            if (r8 == 0) goto L75
            int r2 = r8.length
            if (r2 == 0) goto L75
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.wrap(r8)     // Catch: java.lang.Throwable -> L59
            r8.getShort()     // Catch: java.lang.Throwable -> L59
            r8.getShort()     // Catch: java.lang.Throwable -> L59
            int r2 = r8.getInt()     // Catch: java.lang.Throwable -> L59
            int r3 = r2 >>> 24
            r4 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r4
            long r4 = (long) r2     // Catch: java.lang.Throwable -> L59
            r8.getShort()     // Catch: java.lang.Throwable -> L59
            int r2 = r8.remaining()     // Catch: java.lang.Throwable -> L59
            byte[] r6 = new byte[r2]     // Catch: java.lang.Throwable -> L59
            r7 = 0
            r8.get(r6, r7, r2)     // Catch: java.lang.Throwable -> L59
            r1 = 0
            int r8 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r8 == 0) goto L4e
            java.lang.String r8 = cn.jiguang.av.t.a(r4)
            r1 = 16
            r2 = 5
            java.lang.String r1 = r8.substring(r7, r1)     // Catch: java.lang.Exception -> L48
            byte[] r6 = cn.jiguang.av.t.a(r6, r8, r1, r7)     // Catch: java.lang.Exception -> L48
            if (r6 == 0) goto L42
            goto L4e
        L42:
            cn.jiguang.ad.e r8 = new cn.jiguang.ad.e     // Catch: java.lang.Exception -> L48
            r8.<init>(r2, r0)     // Catch: java.lang.Exception -> L48
            throw r8     // Catch: java.lang.Exception -> L48
        L48:
            cn.jiguang.ad.e r8 = new cn.jiguang.ad.e
            r8.<init>(r2, r0)
            throw r8
        L4e:
            r8 = 1
            r0 = r3 & 1
            if (r0 != r8) goto L58
            byte[] r8 = cn.jiguang.av.x.b(r6)     // Catch: java.io.IOException -> L58
            return r8
        L58:
            return r6
        L59:
            r8 = move-exception
            cn.jiguang.ad.e r0 = new cn.jiguang.ad.e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "parse head error:"
            r2.append(r3)
            java.lang.String r8 = r8.getMessage()
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            r0.<init>(r1, r8)
            throw r0
        L75:
            cn.jiguang.ad.e r8 = new cn.jiguang.ad.e
            java.lang.String r0 = "response is empty!"
            r8.<init>(r1, r0)
            throw r8
    }

    public static int b(android.content.Context r12, cn.jiguang.ag.a r13) {
            java.lang.String r4 = h(r12)
            cn.jiguang.ai.a r2 = cn.jiguang.ai.a.a(r12)
            java.lang.String r5 = r2.a
            java.lang.String r6 = i(r12)
            java.lang.String r7 = j(r12)
            cn.jiguang.ad.b r2 = cn.jiguang.ad.b.a()
            short r2 = r2.b()
            long r8 = (long) r2
            java.lang.String r10 = cn.jiguang.d.a.d(r12)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Register with: \n key:"
            r2.append(r3)
            r2.append(r4)
            java.lang.String r3 = "\n apkVersion:"
            r2.append(r3)
            r2.append(r5)
            java.lang.String r3 = "\n clientInfo:"
            r2.append(r3)
            r2.append(r6)
            java.lang.String r3 = "\n extKey:"
            r2.append(r3)
            r2.append(r7)
            java.lang.String r3 = "\n reg business:"
            r2.append(r3)
            r2.append(r8)
            java.lang.String r3 = "\n accountId:"
            r2.append(r3)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            java.lang.String r11 = "ConnectingHelper"
            cn.jiguang.w.f.c(r11, r2)
            long r2 = c(r12)
            byte[] r2 = cn.jiguang.af.b.a(r2, r4, r5, r6, r7, r8, r10)
            byte[] r3 = cn.jiguang.af.b.b(r12)
            byte[] r2 = cn.jiguang.af.b.a(r12, r2, r3)
            cn.jiguang.al.c r3 = cn.jiguang.al.c.a()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r13.f461h
            r4.append(r5)
            java.lang.String r5 = ":"
            r4.append(r5)
            int r6 = r13.f462i
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            int r6 = r2.length
            long r6 = (long) r6
            java.lang.String r8 = "register"
            r3.b(r4, r8, r6)
            r3 = 2
            r6 = 2
            long r3 = cn.jiguang.al.e.a(r12, r6)
            int r2 = r13.a(r2)
            if (r2 == 0) goto Lb1
            java.lang.String r0 = "Register failed - send reg info failed"
            cn.jiguang.w.f.k(r11, r0)
            r2 = 1001(0x3e9, float:1.403E-42)
            cn.jiguang.ab.c.a.a(r12, r2, r0)
            r5 = 1001(0x3e9, float:1.403E-42)
            java.lang.String r6 = "Register failed - send reg info failed"
            r2 = 2
            r1 = r12
            cn.jiguang.al.e.a(r1, r2, r3, r5, r6)
            r0 = -2
            return r0
        Lb1:
            r2 = 20000(0x4e20, float:2.8026E-41)
            java.nio.ByteBuffer r2 = r13.a(r2)     // Catch: cn.jiguang.ad.e -> L1e0
            if (r2 != 0) goto Lce
            java.lang.String r0 = "Register failed - recv buffer null"
            cn.jiguang.w.f.k(r11, r0)
            r2 = 1005(0x3ed, float:1.408E-42)
            cn.jiguang.ab.c.a.a(r12, r2, r0)
            r5 = 1005(0x3ed, float:1.408E-42)
            java.lang.String r6 = "Register failed - recv buffer null"
            r2 = 2
            r1 = r12
            cn.jiguang.al.e.a(r1, r2, r3, r5, r6)
            r0 = -6
            return r0
        Lce:
            cn.jiguang.al.e.a(r12, r6, r3)
            byte[] r3 = r2.array()
            java.lang.String r4 = ""
            android.util.Pair r3 = cn.jiguang.af.a.a(r12, r3, r4)
            if (r3 == 0) goto L1af
            java.lang.Object r4 = r3.first
            if (r4 == 0) goto L1af
            java.lang.Object r6 = r3.second
            if (r6 == 0) goto L1af
            cn.jiguang.af.c r4 = (cn.jiguang.af.c) r4
            int r4 = r4.f432c
            if (r4 == 0) goto Led
            goto L1af
        Led:
            cn.jiguang.al.c r4 = cn.jiguang.al.c.a()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r13.f461h
            r6.append(r7)
            r6.append(r5)
            int r0 = r13.f462i
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            byte[] r2 = r2.array()
            int r2 = r2.length
            long r5 = (long) r2
            r4.c(r0, r8, r5)
            cn.jiguang.af.e r0 = new cn.jiguang.af.e
            java.lang.Object r2 = r3.first
            cn.jiguang.af.c r2 = (cn.jiguang.af.c) r2
            java.lang.Object r3 = r3.second
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            r0.<init>(r2, r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "register response:"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            cn.jiguang.w.f.c(r11, r2)
            int r7 = r0.a
            cn.jiguang.e.a r2 = cn.jiguang.e.a.ar()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            cn.jiguang.e.a r2 = r2.a(r3)
            r3 = 1
            cn.jiguang.e.a[] r3 = new cn.jiguang.e.a[r3]
            r4 = 0
            r3[r4] = r2
            cn.jiguang.e.b.a(r12, r3)
            if (r7 != 0) goto L1a3
            long r3 = r0.f446b
            java.lang.String r5 = r0.f447c
            java.lang.String r6 = r0.f448d
            java.lang.String r2 = r0.f449e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r8 = "Register succeed - juid:"
            r0.append(r8)
            r0.append(r3)
            java.lang.String r8 = ", registrationId:"
            r0.append(r8)
            r0.append(r6)
            java.lang.String r8 = ", deviceId:"
            r0.append(r8)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            cn.jiguang.w.f.h(r11, r0)
            boolean r0 = cn.jiguang.av.v.a(r6)
            if (r0 != 0) goto L19c
            r8 = 0
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 != 0) goto L183
            goto L19c
        L183:
            cn.jiguang.z.b.a(r12, r2)
            cn.jiguang.z.b.a(r12, r3, r5, r6)
            r1 = r12
            cn.jiguang.v.k.a(r1, r2, r3, r5, r6)
            cn.jiguang.ai.c r0 = new cn.jiguang.ai.c
            r0.<init>()
            java.lang.String r2 = cn.jiguang.ab.c.a
            cn.jiguang.ai.c r0 = r0.e(r2)
            r0.b(r12)
            return r7
        L19c:
            java.lang.String r0 = "Unexpected: registrationId/juid should not be empty. "
            cn.jiguang.w.f.n(r11, r0)
            r0 = -5
            return r0
        L1a3:
            r0 = 10000(0x2710, float:1.4013E-41)
            if (r0 != r7) goto L1ae
            r0 = 1004(0x3ec, float:1.407E-42)
            java.lang.String r2 = "respCode == 10000, err code bytebuffer parse"
            cn.jiguang.ab.c.a.a(r12, r0, r2)
        L1ae:
            return r7
        L1af:
            java.lang.String r3 = "Register failed - can't parse a Register Response"
            cn.jiguang.w.f.j(r11, r3)
            r4 = 1003(0x3eb, float:1.406E-42)
            cn.jiguang.ab.c.a.a(r12, r4, r3)
            cn.jiguang.al.c r1 = cn.jiguang.al.c.a()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r13.f461h
            r3.append(r4)
            r3.append(r5)
            int r0 = r13.f462i
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            byte[] r2 = r2.array()
            int r2 = r2.length
            long r2 = (long) r2
            java.lang.String r4 = "unknown_register"
            r1.c(r0, r4, r2)
            r0 = -4
            return r0
        L1e0:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "Register failed - recv msg failed with error:"
            r2.append(r5)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            cn.jiguang.w.f.k(r11, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            r6 = 1002(0x3ea, float:1.404E-42)
            cn.jiguang.ab.c.a.a(r12, r6, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r2.append(r0)
            java.lang.String r6 = r2.toString()
            r2 = 2
            r5 = 1002(0x3ea, float:1.404E-42)
            r1 = r12
            cn.jiguang.al.e.a(r1, r2, r3, r5, r6)
            r0 = -3
            return r0
    }

    private static java.lang.String b(java.lang.String r1, java.lang.String r2) {
            boolean r0 = cn.jiguang.av.v.a(r1)
            if (r0 != 0) goto L7
            return r1
        L7:
            return r2
    }

    public static void b(android.content.Context r5) {
            r0 = 1
            cn.jiguang.e.a r1 = cn.jiguang.e.a.c(r0)
            r2 = 0
            cn.jiguang.e.a r1 = r1.a(r2)
            r3 = 0
            cn.jiguang.e.a r4 = cn.jiguang.e.a.c(r3)
            cn.jiguang.e.a r2 = r4.a(r2)
            r4 = 2
            cn.jiguang.e.a[] r4 = new cn.jiguang.e.a[r4]
            r4[r3] = r1
            r4[r0] = r2
            cn.jiguang.e.b.a(r5, r4)
            return
    }

    public static void b(android.content.Context r2, boolean r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "setConnectTcpKeyEncrypt state: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ConnectingHelper"
            cn.jiguang.w.f.c(r1, r0)
            cn.jiguang.e.a r0 = cn.jiguang.e.a.k()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            cn.jiguang.e.a r3 = r0.a(r3)
            r0 = 1
            cn.jiguang.e.a[] r0 = new cn.jiguang.e.a[r0]
            r1 = 0
            r0[r1] = r3
            cn.jiguang.e.b.a(r2, r0)
            return
    }

    public static void b(boolean r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "changeLocalReportTcpSslState, state: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ConnectingHelper"
            cn.jiguang.w.f.c(r1, r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = cn.jiguang.ab.c.f263c
            if (r0 != 0) goto L22
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r2)
            cn.jiguang.ab.c.f263c = r0
            return
        L22:
            r0.set(r2)
            return
    }

    public static synchronized long c(android.content.Context r11) {
            java.lang.Class<cn.jiguang.ab.c> r0 = cn.jiguang.ab.c.class
            monitor-enter(r0)
            cn.jiguang.e.a r1 = cn.jiguang.e.a.az()     // Catch: java.lang.Throwable -> L28
            java.lang.Object r1 = cn.jiguang.e.b.a(r11, r1)     // Catch: java.lang.Throwable -> L28
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.Throwable -> L28
            long r1 = r1.longValue()     // Catch: java.lang.Throwable -> L28
            r3 = -1
            r5 = 10000(0x2710, float:1.4013E-41)
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L2a
            java.security.SecureRandom r1 = new java.security.SecureRandom     // Catch: java.lang.Throwable -> L28
            r1.<init>()     // Catch: java.lang.Throwable -> L28
            int r1 = r1.nextInt(r5)     // Catch: java.lang.Throwable -> L28
            int r1 = java.lang.Math.abs(r1)     // Catch: java.lang.Throwable -> L28
            long r1 = (long) r1     // Catch: java.lang.Throwable -> L28
            goto L2a
        L28:
            r11 = move-exception
            goto L50
        L2a:
            r3 = 2
            long r6 = r1 % r3
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 != 0) goto L36
            r3 = 1
        L36:
            long r1 = r1 + r3
            long r3 = (long) r5     // Catch: java.lang.Throwable -> L28
            long r1 = r1 % r3
            cn.jiguang.e.a r3 = cn.jiguang.e.a.az()     // Catch: java.lang.Throwable -> L28
            java.lang.Long r4 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L28
            cn.jiguang.e.a r3 = r3.a(r4)     // Catch: java.lang.Throwable -> L28
            r4 = 1
            cn.jiguang.e.a[] r4 = new cn.jiguang.e.a[r4]     // Catch: java.lang.Throwable -> L28
            r5 = 0
            r4[r5] = r3     // Catch: java.lang.Throwable -> L28
            cn.jiguang.e.b.a(r11, r4)     // Catch: java.lang.Throwable -> L28
            monitor-exit(r0)
            return r1
        L50:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            throw r11
    }

    public static boolean d(android.content.Context r2) {
            cn.jiguang.e.a r0 = cn.jiguang.e.a.j()
            java.lang.Object r2 = cn.jiguang.e.b.a(r2, r0)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getReportKeyEncrypt report_key_encrypt: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ConnectingHelper"
            cn.jiguang.w.f.c(r1, r0)
            boolean r2 = r2.booleanValue()
            return r2
    }

    public static boolean e(android.content.Context r2) {
            cn.jiguang.e.a r0 = cn.jiguang.e.a.k()
            java.lang.Object r2 = cn.jiguang.e.b.a(r2, r0)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getConnectTcpKeyEncrypt connect_tcp_key_encrypt: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ConnectingHelper"
            cn.jiguang.w.f.c(r1, r0)
            boolean r2 = r2.booleanValue()
            return r2
    }

    public static synchronized boolean f(android.content.Context r3) {
            java.lang.Class<cn.jiguang.ab.c> r0 = cn.jiguang.ab.c.class
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicBoolean r1 = cn.jiguang.ab.c.f262b     // Catch: java.lang.Throwable -> L4c
            if (r1 != 0) goto L5b
            if (r3 != 0) goto Le
            r3 = 0
            android.content.Context r3 = cn.jiguang.av.c.a(r3)     // Catch: java.lang.Throwable -> L4c
        Le:
            cn.jiguang.e.a r1 = cn.jiguang.e.a.l()     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r3 = cn.jiguang.e.b.a(r3, r1)     // Catch: java.lang.Throwable -> L4c
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L4c
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L4c
            if (r3 == 0) goto L28
            java.lang.String r3 = cn.jiguang.v.j.a()     // Catch: java.lang.Throwable -> L4c
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L4c
            r3 = r3 ^ 1
        L28:
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean     // Catch: java.lang.Throwable -> L4c
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L4c
            cn.jiguang.ab.c.f262b = r1     // Catch: java.lang.Throwable -> L4c
            java.lang.String r3 = "ConnectingHelper"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4c
            r1.<init>()     // Catch: java.lang.Throwable -> L4c
            java.lang.String r2 = "use connect tcp ssl state: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L4c
            java.util.concurrent.atomic.AtomicBoolean r2 = cn.jiguang.ab.c.f262b     // Catch: java.lang.Throwable -> L4c
            boolean r2 = r2.get()     // Catch: java.lang.Throwable -> L4c
            r1.append(r2)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L4c
            cn.jiguang.w.f.c(r3, r1)     // Catch: java.lang.Throwable -> L4c
            goto L5b
        L4c:
            java.util.concurrent.atomic.AtomicBoolean r3 = new java.util.concurrent.atomic.AtomicBoolean     // Catch: java.lang.Throwable -> L63
            r1 = 0
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L63
            cn.jiguang.ab.c.f262b = r3     // Catch: java.lang.Throwable -> L63
            java.lang.String r3 = "ConnectingHelper"
            java.lang.String r1 = "use connect tcp ssl default state: false"
            cn.jiguang.w.f.i(r3, r1)     // Catch: java.lang.Throwable -> L63
        L5b:
            java.util.concurrent.atomic.AtomicBoolean r3 = cn.jiguang.ab.c.f262b     // Catch: java.lang.Throwable -> L63
            boolean r3 = r3.get()     // Catch: java.lang.Throwable -> L63
            monitor-exit(r0)
            return r3
        L63:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L63
            throw r3
    }

    public static synchronized boolean g(android.content.Context r3) {
            java.lang.Class<cn.jiguang.ab.c> r0 = cn.jiguang.ab.c.class
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicBoolean r1 = cn.jiguang.ab.c.f263c     // Catch: java.lang.Throwable -> L4c
            if (r1 != 0) goto L5b
            if (r3 != 0) goto Le
            r3 = 0
            android.content.Context r3 = cn.jiguang.av.c.a(r3)     // Catch: java.lang.Throwable -> L4c
        Le:
            cn.jiguang.e.a r1 = cn.jiguang.e.a.m()     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r3 = cn.jiguang.e.b.a(r3, r1)     // Catch: java.lang.Throwable -> L4c
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L4c
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L4c
            if (r3 == 0) goto L28
            java.lang.String r3 = cn.jiguang.v.j.a()     // Catch: java.lang.Throwable -> L4c
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L4c
            r3 = r3 ^ 1
        L28:
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean     // Catch: java.lang.Throwable -> L4c
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L4c
            cn.jiguang.ab.c.f263c = r1     // Catch: java.lang.Throwable -> L4c
            java.lang.String r3 = "ConnectingHelper"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4c
            r1.<init>()     // Catch: java.lang.Throwable -> L4c
            java.lang.String r2 = "use report tcp ssl state: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L4c
            java.util.concurrent.atomic.AtomicBoolean r2 = cn.jiguang.ab.c.f263c     // Catch: java.lang.Throwable -> L4c
            boolean r2 = r2.get()     // Catch: java.lang.Throwable -> L4c
            r1.append(r2)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L4c
            cn.jiguang.w.f.c(r3, r1)     // Catch: java.lang.Throwable -> L4c
            goto L5b
        L4c:
            java.util.concurrent.atomic.AtomicBoolean r3 = new java.util.concurrent.atomic.AtomicBoolean     // Catch: java.lang.Throwable -> L63
            r1 = 0
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L63
            cn.jiguang.ab.c.f263c = r3     // Catch: java.lang.Throwable -> L63
            java.lang.String r3 = "ConnectingHelper"
            java.lang.String r1 = "use report tcp ssl default state: false"
            cn.jiguang.w.f.i(r3, r1)     // Catch: java.lang.Throwable -> L63
        L5b:
            java.util.concurrent.atomic.AtomicBoolean r3 = cn.jiguang.ab.c.f263c     // Catch: java.lang.Throwable -> L63
            boolean r3 = r3.get()     // Catch: java.lang.Throwable -> L63
            monitor-exit(r0)
            return r3
        L63:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L63
            throw r3
    }

    private static java.lang.String h(android.content.Context r4) {
            java.lang.String r0 = cn.jiguang.ai.e.a(r4)
            cn.jiguang.ab.c.a = r0
            cn.jiguang.ai.a r1 = cn.jiguang.ai.a.a(r4)
            java.lang.String r1 = r1.o
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = " "
            java.lang.String r0 = b(r0, r3)
            r2.append(r0)
            java.lang.String r0 = "$$"
            r2.append(r0)
            java.lang.String r1 = b(r1, r3)
            r2.append(r1)
            r2.append(r0)
            java.lang.String r1 = r4.getPackageName()
            r2.append(r1)
            r2.append(r0)
            java.lang.String r4 = cn.jiguang.d.a.e(r4)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            return r4
    }

    private static java.lang.String i(android.content.Context r6) {
            cn.jiguang.ad.b r0 = cn.jiguang.ad.b.a()
            java.lang.String r0 = r0.e()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "regVersion:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "ConnectingHelper"
            cn.jiguang.w.f.c(r2, r1)
            cn.jiguang.ai.a r1 = cn.jiguang.ai.a.a(r6)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r1.f473b
            java.lang.String r4 = " "
            java.lang.String r3 = b(r3, r4)
            r2.append(r3)
            java.lang.String r3 = "$$"
            r2.append(r3)
            java.lang.String r5 = r1.f474c
            java.lang.String r5 = b(r5, r4)
            r2.append(r5)
            r2.append(r3)
            java.lang.String r5 = r1.f475d
            java.lang.String r5 = b(r5, r4)
            r2.append(r5)
            r2.append(r3)
            java.lang.String r5 = r1.f476e
            java.lang.String r5 = b(r5, r4)
            r2.append(r5)
            r2.append(r3)
            java.lang.String r5 = cn.jiguang.d.a.h(r6)
            java.lang.String r4 = b(r5, r4)
            r2.append(r4)
            r2.append(r3)
            r2.append(r0)
            r2.append(r3)
            int r0 = r1.f478g
            r2.append(r0)
            r2.append(r3)
            java.lang.String r0 = r1.f479h
            r2.append(r0)
            r2.append(r3)
            java.lang.String r0 = r1.l
            r2.append(r0)
            r2.append(r3)
            java.lang.String r0 = r1.q
            r2.append(r0)
            java.lang.String r0 = "&"
            r2.append(r0)
            java.lang.String r0 = r1.r
            r2.append(r0)
            r2.append(r3)
            int r6 = cn.jiguang.v.k.a(r6)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            return r6
    }

    private static java.lang.String j(android.content.Context r12) {
            java.lang.String r0 = "$$"
            java.lang.String r1 = ""
            cn.jiguang.ai.a r2 = cn.jiguang.ai.a.a(r12)     // Catch: java.lang.Exception -> Lc0
            java.lang.String r2 = r2.f481j     // Catch: java.lang.Exception -> Lc0
            java.lang.String r3 = "unknown"
            boolean r3 = r3.equalsIgnoreCase(r2)     // Catch: java.lang.Exception -> Lc0
            java.lang.String r4 = " "
            if (r3 == 0) goto L15
            r2 = r4
        L15:
            java.lang.String r3 = cn.jiguang.av.g.a(r12)     // Catch: java.lang.Exception -> Lc0
            int r5 = cn.jiguang.av.g.a     // Catch: java.lang.Exception -> Lc0
            cn.jiguang.ai.a r6 = cn.jiguang.ai.a.a(r12)     // Catch: java.lang.Exception -> Lc0
            java.lang.String r6 = r6.p     // Catch: java.lang.Exception -> Lc0
            cn.jiguang.ai.a r7 = cn.jiguang.ai.a.a(r12)     // Catch: java.lang.Exception -> Lc0
            java.lang.String r7 = r7.f480i     // Catch: java.lang.Exception -> Lc0
            cn.jiguang.av.a r8 = cn.jiguang.av.a.a()     // Catch: java.lang.Exception -> Lc0
            r9 = 0
            java.lang.String r12 = r8.a(r12, r1, r9)     // Catch: java.lang.Exception -> Lc0
            java.lang.String r8 = cn.jiguang.f.b.v()     // Catch: java.lang.Exception -> Lc0
            java.lang.String r9 = cn.jiguang.f.b.w()     // Catch: java.lang.Exception -> Lc0
            org.json.JSONObject r10 = cn.jiguang.f.b.C()     // Catch: java.lang.Throwable -> L45
            if (r10 == 0) goto L45
            java.lang.String r11 = "new_cid_all"
            java.lang.String r10 = r10.optString(r11)     // Catch: java.lang.Throwable -> L45
            goto L46
        L45:
            r10 = r1
        L46:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lc0
            r11.<init>()     // Catch: java.lang.Exception -> Lc0
            r11.append(r5)     // Catch: java.lang.Exception -> Lc0
            r11.append(r0)     // Catch: java.lang.Exception -> Lc0
            java.lang.String r3 = b(r3, r4)     // Catch: java.lang.Exception -> Lc0
            r11.append(r3)     // Catch: java.lang.Exception -> Lc0
            r11.append(r0)     // Catch: java.lang.Exception -> Lc0
            java.lang.String r3 = b(r6, r4)     // Catch: java.lang.Exception -> Lc0
            r11.append(r3)     // Catch: java.lang.Exception -> Lc0
            r11.append(r0)     // Catch: java.lang.Exception -> Lc0
            java.lang.String r3 = b(r7, r4)     // Catch: java.lang.Exception -> Lc0
            r11.append(r3)     // Catch: java.lang.Exception -> Lc0
            r11.append(r0)     // Catch: java.lang.Exception -> Lc0
            java.lang.String r12 = b(r12, r4)     // Catch: java.lang.Exception -> Lc0
            r11.append(r12)     // Catch: java.lang.Exception -> Lc0
            r11.append(r0)     // Catch: java.lang.Exception -> Lc0
            java.lang.String r12 = b(r2, r4)     // Catch: java.lang.Exception -> Lc0
            r11.append(r12)     // Catch: java.lang.Exception -> Lc0
            r11.append(r0)     // Catch: java.lang.Exception -> Lc0
            java.lang.String r12 = b(r1, r4)     // Catch: java.lang.Exception -> Lc0
            r11.append(r12)     // Catch: java.lang.Exception -> Lc0
            r11.append(r0)     // Catch: java.lang.Exception -> Lc0
            java.lang.String r12 = b(r8, r4)     // Catch: java.lang.Exception -> Lc0
            r11.append(r12)     // Catch: java.lang.Exception -> Lc0
            r11.append(r0)     // Catch: java.lang.Exception -> Lc0
            java.lang.String r12 = b(r1, r4)     // Catch: java.lang.Exception -> Lc0
            r11.append(r12)     // Catch: java.lang.Exception -> Lc0
            r11.append(r0)     // Catch: java.lang.Exception -> Lc0
            java.lang.String r12 = b(r1, r4)     // Catch: java.lang.Exception -> Lc0
            r11.append(r12)     // Catch: java.lang.Exception -> Lc0
            r11.append(r0)     // Catch: java.lang.Exception -> Lc0
            java.lang.String r12 = b(r9, r4)     // Catch: java.lang.Exception -> Lc0
            r11.append(r12)     // Catch: java.lang.Exception -> Lc0
            r11.append(r0)     // Catch: java.lang.Exception -> Lc0
            java.lang.String r12 = b(r10, r4)     // Catch: java.lang.Exception -> Lc0
            r11.append(r12)     // Catch: java.lang.Exception -> Lc0
            java.lang.String r1 = r11.toString()     // Catch: java.lang.Exception -> Lc0
        Lc0:
            return r1
    }

    private static java.lang.String k(android.content.Context r2) {
            java.lang.String r0 = cn.jiguang.internal.JConstants.testCountry
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L9
            return r0
        L9:
            cn.jiguang.e.a r0 = cn.jiguang.e.a.V()
            java.lang.Object r0 = cn.jiguang.e.b.a(r2, r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L1a
            return r0
        L1a:
            java.lang.String r2 = cn.jiguang.av.a.h(r2)
            return r2
    }
}
