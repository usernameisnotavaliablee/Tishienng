package cn.jiguang.al;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class e {
    private static volatile long a;

    /* renamed from: b, reason: collision with root package name */
    private static final java.lang.Object f587b = null;

    /* renamed from: c, reason: collision with root package name */
    private static final java.lang.Object f588c = null;

    /* renamed from: d, reason: collision with root package name */
    private static java.lang.Boolean f589d;


    private static class a {
        private static final java.util.Map<java.lang.Integer, cn.jiguang.aq.b> a = null;

        static {
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                cn.jiguang.al.e.a.a = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static cn.jiguang.aq.b a(android.content.Context r2, int r3) {
                if (r2 != 0) goto Lb
                java.lang.String r2 = "MonitorCache"
                java.lang.String r3 = "context is null, cannot get monitor"
                cn.jiguang.w.f.i(r2, r3)
                r2 = 0
                return r2
            Lb:
                java.util.Map<java.lang.Integer, cn.jiguang.aq.b> r0 = cn.jiguang.al.e.a.a
                java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
                java.lang.Object r1 = r0.get(r1)
                cn.jiguang.aq.b r1 = (cn.jiguang.aq.b) r1
                if (r1 != 0) goto L3d
                monitor-enter(r0)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L37
                java.lang.Object r1 = r0.get(r1)     // Catch: java.lang.Throwable -> L37
                cn.jiguang.aq.b r1 = (cn.jiguang.aq.b) r1     // Catch: java.lang.Throwable -> L37
                if (r1 != 0) goto L39
                cn.jiguang.aq.b r1 = b(r2, r3)     // Catch: java.lang.Throwable -> L37
                if (r1 == 0) goto L39
                r1.j()     // Catch: java.lang.Throwable -> L37
                java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L37
                r0.put(r2, r1)     // Catch: java.lang.Throwable -> L37
                goto L39
            L37:
                r2 = move-exception
                goto L3b
            L39:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
                return r1
            L3b:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
                throw r2
            L3d:
                return r1
        }

        static void a() {
                java.util.Map<java.lang.Integer, cn.jiguang.aq.b> r0 = cn.jiguang.al.e.a.a
                monitor-enter(r0)
                r0.clear()     // Catch: java.lang.Throwable -> L8
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
                return
            L8:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
                throw r1
        }

        private static cn.jiguang.aq.b b(android.content.Context r2, int r3) {
                long r0 = cn.jiguang.al.e.d(r2)
                cn.jiguang.aq.b r2 = cn.jiguang.al.e.b(r2, r3, r0)
                return r2
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            cn.jiguang.al.e.f587b = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            cn.jiguang.al.e.f588c = r0
            return
    }

    public e() {
            r1 = this;
            r1.<init>()
            return
    }

    public static long a(android.content.Context r4, int r5) {
            r0 = 0
            java.lang.String r2 = "TCPTimeManager"
            if (r4 != 0) goto Lc
            java.lang.String r4 = "context is null, cannot start"
            cn.jiguang.w.f.i(r2, r4)
            return r0
        Lc:
            boolean r3 = f(r4)
            if (r3 != 0) goto L18
            java.lang.String r4 = "TCP time report switch is off, skip start"
            cn.jiguang.w.f.c(r2, r4)
            return r0
        L18:
            e(r4)
            cn.jiguang.aq.b r4 = cn.jiguang.al.e.a.a(r4, r5)
            if (r4 != 0) goto L36
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = "monitor is null for type: "
            r4.append(r3)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            cn.jiguang.w.f.i(r2, r4)
            return r0
        L36:
            long r0 = r4.d()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = "start type: "
            r4.append(r3)
            r4.append(r5)
            java.lang.String r5 = ", id: "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            cn.jiguang.w.f.c(r2, r4)
            return r0
    }

    public static void a(android.content.Context r3) {
            boolean r0 = f(r3)
            if (r0 != 0) goto Le
            java.lang.String r3 = "TCPTimeManager"
            java.lang.String r0 = "TCP time report switch is off, skip endInit"
            cn.jiguang.w.f.c(r3, r0)
            return
        Le:
            r0 = 6
            r1 = 1
            a(r3, r0, r1)
            return
    }

    public static void a(android.content.Context r7, int r8, long r9) {
            java.lang.String r0 = "TCPTimeManager"
            if (r7 != 0) goto La
            java.lang.String r7 = "context is null, cannot end"
            cn.jiguang.w.f.i(r0, r7)
            return
        La:
            boolean r1 = f(r7)
            if (r1 != 0) goto L16
            java.lang.String r7 = "TCP time report switch is off, skip endSucc"
            cn.jiguang.w.f.c(r0, r7)
            return
        L16:
            r1 = 0
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r3 > 0) goto L22
            java.lang.String r7 = "id is invalid, cannot end"
            cn.jiguang.w.f.i(r0, r7)
            return
        L22:
            cn.jiguang.aq.b r3 = cn.jiguang.al.e.a.a(r7, r8)
            if (r3 != 0) goto L3d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = "monitor is null for type: "
            r7.append(r9)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            cn.jiguang.w.f.i(r0, r7)
            return
        L3d:
            long r3 = r3.b(r9)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "endSucc type: "
            r5.append(r6)
            r5.append(r8)
            java.lang.String r6 = ", costTime: "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r6 = "ms, id: "
            r5.append(r6)
            r5.append(r9)
            java.lang.String r9 = r5.toString()
            cn.jiguang.w.f.c(r0, r9)
            r9 = 6
            if (r8 == r9) goto L6f
            int r8 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r8 <= 0) goto L6f
            a(r7, r3)
        L6f:
            return
    }

    public static void a(android.content.Context r7, int r8, long r9, int r11, java.lang.String r12) {
            java.lang.String r0 = "TCPTimeManager"
            if (r7 != 0) goto La
            java.lang.String r7 = "context is null, cannot end"
            cn.jiguang.w.f.i(r0, r7)
            return
        La:
            boolean r1 = f(r7)
            if (r1 != 0) goto L16
            java.lang.String r7 = "TCP time report switch is off, skip endFail"
            cn.jiguang.w.f.c(r0, r7)
            return
        L16:
            r1 = 0
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r3 > 0) goto L22
            java.lang.String r7 = "id is invalid, cannot end"
            cn.jiguang.w.f.i(r0, r7)
            return
        L22:
            cn.jiguang.aq.b r3 = cn.jiguang.al.e.a.a(r7, r8)
            if (r3 != 0) goto L3d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = "monitor is null for type: "
            r7.append(r9)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            cn.jiguang.w.f.i(r0, r7)
            return
        L3d:
            long r3 = r3.a(r9, r11, r12)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "endFail type: "
            r5.append(r6)
            r5.append(r8)
            java.lang.String r6 = ", costTime: "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r6 = "ms, id: "
            r5.append(r6)
            r5.append(r9)
            java.lang.String r9 = ", code: "
            r5.append(r9)
            r5.append(r11)
            java.lang.String r9 = ", msg: "
            r5.append(r9)
            r5.append(r12)
            java.lang.String r9 = r5.toString()
            cn.jiguang.w.f.c(r0, r9)
            r9 = 6
            if (r8 == r9) goto L7f
            int r8 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r8 <= 0) goto L7f
            a(r7, r3)
        L7f:
            return
    }

    public static void a(android.content.Context r6, int r7, java.lang.String r8) {
            boolean r0 = f(r6)
            if (r0 != 0) goto Le
            java.lang.String r6 = "TCPTimeManager"
            java.lang.String r7 = "TCP time report switch is off, skip endInit"
            cn.jiguang.w.f.c(r6, r7)
            return
        Le:
            r1 = 6
            r2 = 1
            r0 = r6
            r4 = r7
            r5 = r8
            a(r0, r1, r2, r4, r5)
            return
    }

    private static void a(android.content.Context r3, long r4) {
            if (r3 == 0) goto L19
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L9
            goto L19
        L9:
            r0 = 6
            cn.jiguang.aq.b r3 = cn.jiguang.al.e.a.a(r3, r0)
            if (r3 == 0) goto L19
            boolean r0 = r3 instanceof cn.jiguang.aq.d
            if (r0 == 0) goto L19
            cn.jiguang.aq.d r3 = (cn.jiguang.aq.d) r3
            r3.d(r4)
        L19:
            return
    }

    public static void a(android.content.Context r6, android.os.Bundle r7) {
            java.lang.String r0 = "startInit"
            java.lang.String r1 = "TCPTimeManager"
            cn.jiguang.w.f.c(r1, r0)
            if (r6 != 0) goto Lf
            java.lang.String r6 = "context is null, cannot start"
            cn.jiguang.w.f.i(r1, r6)
            return
        Lf:
            boolean r0 = f(r6)
            if (r0 != 0) goto L1b
            java.lang.String r6 = "TCP time report switch is off, skip startInit"
            cn.jiguang.w.f.c(r1, r6)
            return
        L1b:
            b(r6)
            if (r7 != 0) goto L26
            java.lang.String r6 = "bundle is null, cannot get start time"
            cn.jiguang.w.f.c(r1, r6)
            return
        L26:
            java.lang.String r0 = "jg_init_start_time"
            r2 = 0
            long r4 = r7.getLong(r0, r2)
            int r7 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r7 > 0) goto L47
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "startTime is invalid: "
            r6.append(r7)
            r6.append(r4)
            java.lang.String r6 = r6.toString()
            cn.jiguang.w.f.c(r1, r6)
            return
        L47:
            cn.jiguang.e.a r7 = cn.jiguang.e.a.aq()
            java.lang.Object r7 = cn.jiguang.e.b.a(r6, r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L5d
            java.lang.String r6 = "tcp has close by active"
            cn.jiguang.w.f.c(r1, r6)
            return
        L5d:
            e(r6)
            r7 = 6
            cn.jiguang.aq.b r6 = cn.jiguang.al.e.a.a(r6, r7)
            if (r6 != 0) goto L6d
            java.lang.String r6 = "monitor is null for type: 6"
            cn.jiguang.w.f.i(r1, r6)
            return
        L6d:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "startInit startTime: "
            r7.append(r0)
            r7.append(r4)
            java.lang.String r7 = r7.toString()
            cn.jiguang.w.f.c(r1, r7)
            r6.a(r4)
            return
    }

    static /* synthetic */ cn.jiguang.aq.b b(android.content.Context r0, int r1, long r2) {
            cn.jiguang.aq.b r0 = c(r0, r1, r2)
            return r0
    }

    public static boolean b(android.content.Context r14) {
            r0 = 0
            if (r14 != 0) goto Lb
            java.lang.String r14 = "TCPTimeManager"
            java.lang.String r1 = "context is null, cannot check report condition"
            cn.jiguang.w.f.i(r14, r1)
            return r0
        Lb:
            boolean r1 = f(r14)
            if (r1 != 0) goto L19
            java.lang.String r14 = "TCPTimeManager"
            java.lang.String r1 = "TCP time report switch is off, skip check report condition"
            cn.jiguang.w.f.c(r14, r1)
            return r0
        L19:
            java.lang.Object r1 = cn.jiguang.al.e.f588c
            monitor-enter(r1)
            cn.jiguang.e.a r2 = cn.jiguang.e.a.F()     // Catch: java.lang.Throwable -> L49
            java.lang.Object r2 = cn.jiguang.e.b.a(r14, r2)     // Catch: java.lang.Throwable -> L49
            java.lang.Long r2 = (java.lang.Long) r2     // Catch: java.lang.Throwable -> L49
            long r2 = r2.longValue()     // Catch: java.lang.Throwable -> L49
            r4 = 1
            r5 = 0
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 > 0) goto L4c
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L49
            cn.jiguang.e.a r7 = cn.jiguang.e.a.F()     // Catch: java.lang.Throwable -> L49
            java.lang.Long r8 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L49
            cn.jiguang.e.a r7 = r7.a(r8)     // Catch: java.lang.Throwable -> L49
            cn.jiguang.e.a[] r8 = new cn.jiguang.e.a[r4]     // Catch: java.lang.Throwable -> L49
            r8[r0] = r7     // Catch: java.lang.Throwable -> L49
            cn.jiguang.e.b.a(r14, r8)     // Catch: java.lang.Throwable -> L49
            goto L4c
        L49:
            r14 = move-exception
            goto L111
        L4c:
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L49
            int r9 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r9 <= 0) goto L7d
            long r9 = r7 - r2
            r11 = 86400000(0x5265c00, double:4.2687272E-316)
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 >= 0) goto L7d
            java.lang.String r14 = "TCPTimeManager"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
            r4.<init>()     // Catch: java.lang.Throwable -> L49
            java.lang.String r5 = "Not yet time to report, last report time: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L49
            r4.append(r2)     // Catch: java.lang.Throwable -> L49
            java.lang.String r2 = ", current time: "
            r4.append(r2)     // Catch: java.lang.Throwable -> L49
            r4.append(r7)     // Catch: java.lang.Throwable -> L49
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> L49
            cn.jiguang.w.f.c(r14, r2)     // Catch: java.lang.Throwable -> L49
        L7b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L49
            return r0
        L7d:
            long r2 = e(r14)     // Catch: java.lang.Throwable -> L49
            int r9 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r9 != 0) goto L8d
            java.lang.String r14 = "TCPTimeManager"
            java.lang.String r2 = "bootTimestamp is 0, cannot prepare report"
            cn.jiguang.w.f.i(r14, r2)     // Catch: java.lang.Throwable -> L49
            goto L7b
        L8d:
            java.lang.String r9 = "TCPTimeManager"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
            r10.<init>()     // Catch: java.lang.Throwable -> L49
            java.lang.String r11 = "Report condition met, preparing report. bootTimestamp: "
            r10.append(r11)     // Catch: java.lang.Throwable -> L49
            r10.append(r2)     // Catch: java.lang.Throwable -> L49
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L49
            cn.jiguang.w.f.c(r9, r10)     // Catch: java.lang.Throwable -> L49
            cn.jiguang.e.a r9 = cn.jiguang.e.a.E()     // Catch: java.lang.Throwable -> L49
            java.lang.Long r10 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L49
            cn.jiguang.e.a r9 = r9.a(r10)     // Catch: java.lang.Throwable -> L49
            cn.jiguang.e.a[] r10 = new cn.jiguang.e.a[r4]     // Catch: java.lang.Throwable -> L49
            r10[r0] = r9     // Catch: java.lang.Throwable -> L49
            cn.jiguang.e.b.a(r14, r10)     // Catch: java.lang.Throwable -> L49
            java.lang.String r9 = "TCPTimeManager"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
            r10.<init>()     // Catch: java.lang.Throwable -> L49
            java.lang.String r11 = "Saved bootTimestamp to report SP: "
            r10.append(r11)     // Catch: java.lang.Throwable -> L49
            r10.append(r2)     // Catch: java.lang.Throwable -> L49
            java.lang.String r2 = r10.toString()     // Catch: java.lang.Throwable -> L49
            cn.jiguang.w.f.c(r9, r2)     // Catch: java.lang.Throwable -> L49
            cn.jiguang.al.e.a.a()     // Catch: java.lang.Throwable -> L49
            java.lang.String r2 = "TCPTimeManager"
            java.lang.String r3 = "Cleared all monitor cache"
            cn.jiguang.w.f.c(r2, r3)     // Catch: java.lang.Throwable -> L49
            java.lang.Object r2 = cn.jiguang.al.e.f587b     // Catch: java.lang.Throwable -> L49
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L49
            cn.jiguang.al.e.a = r5     // Catch: java.lang.Throwable -> L10e
            cn.jiguang.e.a r3 = cn.jiguang.e.a.D()     // Catch: java.lang.Throwable -> L10e
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L10e
            cn.jiguang.e.a r3 = r3.a(r5)     // Catch: java.lang.Throwable -> L10e
            cn.jiguang.e.a[] r5 = new cn.jiguang.e.a[r4]     // Catch: java.lang.Throwable -> L10e
            r5[r0] = r3     // Catch: java.lang.Throwable -> L10e
            cn.jiguang.e.b.a(r14, r5)     // Catch: java.lang.Throwable -> L10e
            java.lang.String r3 = "TCPTimeManager"
            java.lang.String r5 = "Reset bootTimestamp, will generate new one on next call"
            cn.jiguang.w.f.c(r3, r5)     // Catch: java.lang.Throwable -> L10e
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L10e
            cn.jiguang.e.a r2 = cn.jiguang.e.a.F()     // Catch: java.lang.Throwable -> L49
            java.lang.Long r3 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> L49
            cn.jiguang.e.a r2 = r2.a(r3)     // Catch: java.lang.Throwable -> L49
            cn.jiguang.e.a[] r3 = new cn.jiguang.e.a[r4]     // Catch: java.lang.Throwable -> L49
            r3[r0] = r2     // Catch: java.lang.Throwable -> L49
            cn.jiguang.e.b.a(r14, r3)     // Catch: java.lang.Throwable -> L49
            c(r14)     // Catch: java.lang.Throwable -> L49
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L49
            return r4
        L10e:
            r14 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L10e
            throw r14     // Catch: java.lang.Throwable -> L49
        L111:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L49
            throw r14
    }

    private static cn.jiguang.aq.b c(android.content.Context r0, int r1, long r2) {
            switch(r1) {
                case 1: goto L39;
                case 2: goto L33;
                case 3: goto L2d;
                case 4: goto L27;
                case 5: goto L21;
                case 6: goto L1b;
                default: goto L3;
            }
        L3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Unknown type: "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TCPTimeManager"
            cn.jiguang.w.f.i(r1, r0)
            r0 = 0
            return r0
        L1b:
            cn.jiguang.aq.d r1 = new cn.jiguang.aq.d
            r1.<init>(r0, r2)
            return r1
        L21:
            cn.jiguang.aq.a r1 = new cn.jiguang.aq.a
            r1.<init>(r0, r2)
            return r1
        L27:
            cn.jiguang.aq.g r1 = new cn.jiguang.aq.g
            r1.<init>(r0, r2)
            return r1
        L2d:
            cn.jiguang.aq.e r1 = new cn.jiguang.aq.e
            r1.<init>(r0, r2)
            return r1
        L33:
            cn.jiguang.aq.f r1 = new cn.jiguang.aq.f
            r1.<init>(r0, r2)
            return r1
        L39:
            cn.jiguang.aq.c r1 = new cn.jiguang.aq.c
            r1.<init>(r0, r2)
            return r1
    }

    public static void c(android.content.Context r6) {
            java.lang.String r0 = "TCPTimeManager"
            if (r6 != 0) goto La
            java.lang.String r6 = "context is null, cannot report data"
            cn.jiguang.w.f.i(r0, r6)
            return
        La:
            boolean r1 = f(r6)
            if (r1 != 0) goto L16
            java.lang.String r6 = "TCP time report switch is off, not report data"
            cn.jiguang.w.f.c(r0, r6)
            return
        L16:
            cn.jiguang.e.a r1 = cn.jiguang.e.a.E()
            java.lang.Object r1 = cn.jiguang.e.b.a(r6, r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L2b
            goto L46
        L2b:
            cn.jiguang.av.l r3 = cn.jiguang.av.l.a()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "tcp_time_report_task_"
            r4.append(r5)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            boolean r5 = r3.b(r4)
            if (r5 == 0) goto L47
        L46:
            return
        L47:
            cn.jiguang.al.e$1 r5 = new cn.jiguang.al.e$1
            r5.<init>(r1, r6)
            r1 = 3000(0xbb8, double:1.482E-320)
            r3.a(r4, r5, r1)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = "Scheduled report task (delay 3s) with key: "
            r6.append(r1)
            r6.append(r4)
            java.lang.String r6 = r6.toString()
            cn.jiguang.w.f.c(r0, r6)
            return
    }

    static /* synthetic */ long d(android.content.Context r2) {
            long r0 = e(r2)
            return r0
    }

    private static long e(android.content.Context r6) {
            long r0 = cn.jiguang.al.e.a
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L73
            java.lang.Object r0 = cn.jiguang.al.e.f587b
            monitor-enter(r0)
            long r4 = cn.jiguang.al.e.a     // Catch: java.lang.Throwable -> L59
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 != 0) goto L6f
            cn.jiguang.e.a r1 = cn.jiguang.e.a.D()     // Catch: java.lang.Throwable -> L59
            java.lang.Object r1 = cn.jiguang.e.b.a(r6, r1)     // Catch: java.lang.Throwable -> L59
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.Throwable -> L59
            long r4 = r1.longValue()     // Catch: java.lang.Throwable -> L59
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 != 0) goto L5b
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L59
            cn.jiguang.al.e.a = r1     // Catch: java.lang.Throwable -> L59
            cn.jiguang.e.a r1 = cn.jiguang.e.a.D()     // Catch: java.lang.Throwable -> L59
            long r2 = cn.jiguang.al.e.a     // Catch: java.lang.Throwable -> L59
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L59
            cn.jiguang.e.a r1 = r1.a(r2)     // Catch: java.lang.Throwable -> L59
            r2 = 1
            cn.jiguang.e.a[] r2 = new cn.jiguang.e.a[r2]     // Catch: java.lang.Throwable -> L59
            r3 = 0
            r2[r3] = r1     // Catch: java.lang.Throwable -> L59
            cn.jiguang.e.b.a(r6, r2)     // Catch: java.lang.Throwable -> L59
            java.lang.String r6 = "TCPTimeManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L59
            r1.<init>()     // Catch: java.lang.Throwable -> L59
            java.lang.String r2 = "Generated and saved boot timestamp to SP: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L59
            long r2 = cn.jiguang.al.e.a     // Catch: java.lang.Throwable -> L59
            r1.append(r2)     // Catch: java.lang.Throwable -> L59
        L51:
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L59
            cn.jiguang.w.f.c(r6, r1)     // Catch: java.lang.Throwable -> L59
            goto L6f
        L59:
            r6 = move-exception
            goto L71
        L5b:
            cn.jiguang.al.e.a = r4     // Catch: java.lang.Throwable -> L59
            java.lang.String r6 = "TCPTimeManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L59
            r1.<init>()     // Catch: java.lang.Throwable -> L59
            java.lang.String r2 = "Loaded boot timestamp from SP: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L59
            long r2 = cn.jiguang.al.e.a     // Catch: java.lang.Throwable -> L59
            r1.append(r2)     // Catch: java.lang.Throwable -> L59
            goto L51
        L6f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L59
            goto L73
        L71:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L59
            throw r6
        L73:
            long r0 = cn.jiguang.al.e.a
            return r0
    }

    private static boolean f(android.content.Context r2) {
            cn.jiguang.e.a r0 = cn.jiguang.e.a.n()
            java.lang.Object r2 = cn.jiguang.e.b.a(r2, r0)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            java.lang.Boolean r0 = cn.jiguang.al.e.f589d
            if (r0 == 0) goto L14
            boolean r0 = r2.equals(r2)
            if (r0 != 0) goto L2c
        L14:
            cn.jiguang.al.e.f589d = r2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getUseReportTcpTimeSwitch useReportTcpTimeSwitch: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TCPTimeManager"
            cn.jiguang.w.f.c(r1, r0)
        L2c:
            boolean r2 = r2.booleanValue()
            return r2
    }
}
