package cn.jiguang.al;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a {


    /* renamed from: cn.jiguang.al.a$a, reason: collision with other inner class name */
    public static class C0014a {
        private static long a;

        static {
                return
        }

        public C0014a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ void a(android.content.Context r0) {
                c(r0)
                return
        }

        static /* synthetic */ void a(android.content.Context r0, int r1) {
                b(r0, r1)
                return
        }

        static /* synthetic */ int b(android.content.Context r0) {
                int r0 = d(r0)
                return r0
        }

        private static synchronized void b(android.content.Context r4, int r5) {
                java.lang.Class<cn.jiguang.al.a$a> r0 = cn.jiguang.al.a.C0014a.class
                monitor-enter(r0)
                java.lang.String r1 = "ColdStartMonitorManager"
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L30
                r2.<init>()     // Catch: java.lang.Throwable -> L30
                java.lang.String r3 = "setColdStartCount:"
                r2.append(r3)     // Catch: java.lang.Throwable -> L30
                r2.append(r5)     // Catch: java.lang.Throwable -> L30
                java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L30
                cn.jiguang.w.f.c(r1, r2)     // Catch: java.lang.Throwable -> L30
                cn.jiguang.e.a r1 = cn.jiguang.e.a.G()     // Catch: java.lang.Throwable -> L30
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L30
                cn.jiguang.e.a r5 = r1.a(r5)     // Catch: java.lang.Throwable -> L30
                r1 = 1
                cn.jiguang.e.a[] r1 = new cn.jiguang.e.a[r1]     // Catch: java.lang.Throwable -> L30
                r2 = 0
                r1[r2] = r5     // Catch: java.lang.Throwable -> L30
                cn.jiguang.e.b.a(r4, r1)     // Catch: java.lang.Throwable -> L30
                monitor-exit(r0)
                return
            L30:
                r4 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
                throw r4
        }

        private static synchronized void c(android.content.Context r6) {
                java.lang.Class<cn.jiguang.al.a$a> r0 = cn.jiguang.al.a.C0014a.class
                monitor-enter(r0)
                boolean r1 = cn.jiguang.av.a.b(r6)     // Catch: java.lang.Throwable -> L23
                if (r1 != 0) goto Lb
                monitor-exit(r0)
                return
            Lb:
                long r1 = cn.jiguang.al.a.C0014a.a     // Catch: java.lang.Throwable -> L23
                r3 = 0
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 != 0) goto L25
                long r1 = cn.jiguang.api.JCoreManager.getStartId(r6)     // Catch: java.lang.Throwable -> L23
                cn.jiguang.al.a.C0014a.a = r1     // Catch: java.lang.Throwable -> L23
                int r1 = d(r6)     // Catch: java.lang.Throwable -> L23
                int r1 = r1 + 1
                b(r6, r1)     // Catch: java.lang.Throwable -> L23
                goto L25
            L23:
                r6 = move-exception
                goto L27
            L25:
                monitor-exit(r0)
                return
            L27:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
                throw r6
        }

        private static synchronized int d(android.content.Context r2) {
                java.lang.Class<cn.jiguang.al.a$a> r0 = cn.jiguang.al.a.C0014a.class
                monitor-enter(r0)
                cn.jiguang.e.a r1 = cn.jiguang.e.a.G()     // Catch: java.lang.Throwable -> L13
                java.lang.Object r2 = cn.jiguang.e.b.a(r2, r1)     // Catch: java.lang.Throwable -> L13
                java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> L13
                int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L13
                monitor-exit(r0)
                return r2
            L13:
                r2 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                throw r2
        }
    }

    public static class b {
        private static long a;

        /* renamed from: b, reason: collision with root package name */
        private static long f564b;

        /* renamed from: c, reason: collision with root package name */
        private static boolean f565c;

        /* renamed from: d, reason: collision with root package name */
        private static long f566d;

        static {
                return
        }

        public b() {
                r1 = this;
                r1.<init>()
                return
        }

        public static long a() {
                long r0 = cn.jiguang.al.a.b.f566d
                return r0
        }

        static /* synthetic */ void a(android.content.Context r0) {
                d(r0)
                return
        }

        static /* synthetic */ void a(android.content.Context r0, int r1) {
                c(r0, r1)
                return
        }

        static /* synthetic */ void a(android.content.Context r0, android.os.Bundle r1) {
                b(r0, r1)
                return
        }

        static /* synthetic */ int b(android.content.Context r0) {
                int r0 = e(r0)
                return r0
        }

        static /* synthetic */ void b(android.content.Context r0, int r1) {
                d(r0, r1)
                return
        }

        private static synchronized void b(android.content.Context r8, android.os.Bundle r9) {
                java.lang.Class<cn.jiguang.al.a$b> r0 = cn.jiguang.al.a.b.class
                monitor-enter(r0)
                boolean r1 = cn.jiguang.av.a.b(r8)     // Catch: java.lang.Throwable -> L33
                if (r1 == 0) goto Lb
                monitor-exit(r0)
                return
            Lb:
                d(r8)     // Catch: java.lang.Throwable -> L33
                java.lang.String r1 = "jg_time_start_id"
                r2 = 0
                long r4 = r9.getLong(r1, r2)     // Catch: java.lang.Throwable -> L33
                int r9 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r9 > 0) goto L1c
                monitor-exit(r0)
                return
            L1c:
                long r6 = cn.jiguang.al.a.b.a     // Catch: java.lang.Throwable -> L33
                int r9 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                if (r9 != 0) goto L35
                cn.jiguang.e.a r9 = cn.jiguang.e.a.J()     // Catch: java.lang.Throwable -> L33
                java.lang.Object r9 = cn.jiguang.e.b.a(r8, r9)     // Catch: java.lang.Throwable -> L33
                java.lang.Long r9 = (java.lang.Long) r9     // Catch: java.lang.Throwable -> L33
                long r6 = r9.longValue()     // Catch: java.lang.Throwable -> L33
                cn.jiguang.al.a.b.a = r6     // Catch: java.lang.Throwable -> L33
                goto L35
            L33:
                r8 = move-exception
                goto L68
            L35:
                long r6 = cn.jiguang.al.a.b.a     // Catch: java.lang.Throwable -> L33
                int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r9 == 0) goto L66
                cn.jiguang.al.a.b.a = r4     // Catch: java.lang.Throwable -> L33
                cn.jiguang.e.a r9 = cn.jiguang.e.a.J()     // Catch: java.lang.Throwable -> L33
                java.lang.Long r1 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L33
                cn.jiguang.e.a r9 = r9.a(r1)     // Catch: java.lang.Throwable -> L33
                r1 = 1
                cn.jiguang.e.a[] r4 = new cn.jiguang.e.a[r1]     // Catch: java.lang.Throwable -> L33
                r5 = 0
                r4[r5] = r9     // Catch: java.lang.Throwable -> L33
                cn.jiguang.e.b.a(r8, r4)     // Catch: java.lang.Throwable -> L33
                long r4 = cn.jiguang.al.a.b.f564b     // Catch: java.lang.Throwable -> L33
                int r9 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r9 == 0) goto L66
                boolean r9 = cn.jiguang.al.a.b.f565c     // Catch: java.lang.Throwable -> L33
                if (r9 != 0) goto L66
                cn.jiguang.al.a.b.f565c = r1     // Catch: java.lang.Throwable -> L33
                int r9 = f(r8)     // Catch: java.lang.Throwable -> L33
                int r9 = r9 + r1
                d(r8, r9)     // Catch: java.lang.Throwable -> L33
            L66:
                monitor-exit(r0)
                return
            L68:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
                throw r8
        }

        static /* synthetic */ int c(android.content.Context r0) {
                int r0 = f(r0)
                return r0
        }

        private static synchronized void c(android.content.Context r4, int r5) {
                java.lang.Class<cn.jiguang.al.a$b> r0 = cn.jiguang.al.a.b.class
                monitor-enter(r0)
                java.lang.String r1 = "ColdStartMonitorManager"
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L30
                r2.<init>()     // Catch: java.lang.Throwable -> L30
                java.lang.String r3 = "setSubProcessColdStartCount:"
                r2.append(r3)     // Catch: java.lang.Throwable -> L30
                r2.append(r5)     // Catch: java.lang.Throwable -> L30
                java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L30
                cn.jiguang.w.f.c(r1, r2)     // Catch: java.lang.Throwable -> L30
                cn.jiguang.e.a r1 = cn.jiguang.e.a.H()     // Catch: java.lang.Throwable -> L30
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L30
                cn.jiguang.e.a r5 = r1.a(r5)     // Catch: java.lang.Throwable -> L30
                r1 = 1
                cn.jiguang.e.a[] r1 = new cn.jiguang.e.a[r1]     // Catch: java.lang.Throwable -> L30
                r2 = 0
                r1[r2] = r5     // Catch: java.lang.Throwable -> L30
                cn.jiguang.e.b.a(r4, r1)     // Catch: java.lang.Throwable -> L30
                monitor-exit(r0)
                return
            L30:
                r4 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
                throw r4
        }

        private static synchronized void d(android.content.Context r6) {
                java.lang.Class<cn.jiguang.al.a$b> r0 = cn.jiguang.al.a.b.class
                monitor-enter(r0)
                boolean r1 = cn.jiguang.av.a.b(r6)     // Catch: java.lang.Throwable -> L2c
                if (r1 == 0) goto Lb
                monitor-exit(r0)
                return
            Lb:
                long r1 = cn.jiguang.al.a.b.f564b     // Catch: java.lang.Throwable -> L2c
                r3 = 0
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 != 0) goto L2e
                long r1 = cn.jiguang.api.JCoreManager.getStartId(r6)     // Catch: java.lang.Throwable -> L2c
                cn.jiguang.al.a.b.f564b = r1     // Catch: java.lang.Throwable -> L2c
                long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L2c
                cn.jiguang.al.a.b.f566d = r1     // Catch: java.lang.Throwable -> L2c
                int r1 = e(r6)     // Catch: java.lang.Throwable -> L2c
                int r1 = r1 + 1
                c(r6, r1)     // Catch: java.lang.Throwable -> L2c
                r6 = 0
                cn.jiguang.al.a.b.f565c = r6     // Catch: java.lang.Throwable -> L2c
                goto L2e
            L2c:
                r6 = move-exception
                goto L30
            L2e:
                monitor-exit(r0)
                return
            L30:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
                throw r6
        }

        private static synchronized void d(android.content.Context r4, int r5) {
                java.lang.Class<cn.jiguang.al.a$b> r0 = cn.jiguang.al.a.b.class
                monitor-enter(r0)
                java.lang.String r1 = "ColdStartMonitorManager"
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L30
                r2.<init>()     // Catch: java.lang.Throwable -> L30
                java.lang.String r3 = "setSubProcessColdStartTotalDecrementCount:"
                r2.append(r3)     // Catch: java.lang.Throwable -> L30
                r2.append(r5)     // Catch: java.lang.Throwable -> L30
                java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L30
                cn.jiguang.w.f.c(r1, r2)     // Catch: java.lang.Throwable -> L30
                cn.jiguang.e.a r1 = cn.jiguang.e.a.I()     // Catch: java.lang.Throwable -> L30
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L30
                cn.jiguang.e.a r5 = r1.a(r5)     // Catch: java.lang.Throwable -> L30
                r1 = 1
                cn.jiguang.e.a[] r1 = new cn.jiguang.e.a[r1]     // Catch: java.lang.Throwable -> L30
                r2 = 0
                r1[r2] = r5     // Catch: java.lang.Throwable -> L30
                cn.jiguang.e.b.a(r4, r1)     // Catch: java.lang.Throwable -> L30
                monitor-exit(r0)
                return
            L30:
                r4 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
                throw r4
        }

        private static synchronized int e(android.content.Context r2) {
                java.lang.Class<cn.jiguang.al.a$b> r0 = cn.jiguang.al.a.b.class
                monitor-enter(r0)
                cn.jiguang.e.a r1 = cn.jiguang.e.a.H()     // Catch: java.lang.Throwable -> L13
                java.lang.Object r2 = cn.jiguang.e.b.a(r2, r1)     // Catch: java.lang.Throwable -> L13
                java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> L13
                int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L13
                monitor-exit(r0)
                return r2
            L13:
                r2 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                throw r2
        }

        private static synchronized int f(android.content.Context r2) {
                java.lang.Class<cn.jiguang.al.a$b> r0 = cn.jiguang.al.a.b.class
                monitor-enter(r0)
                cn.jiguang.e.a r1 = cn.jiguang.e.a.I()     // Catch: java.lang.Throwable -> L13
                java.lang.Object r2 = cn.jiguang.e.b.a(r2, r1)     // Catch: java.lang.Throwable -> L13
                java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> L13
                int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L13
                monitor-exit(r0)
                return r2
            L13:
                r2 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                throw r2
        }
    }

    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(android.content.Context r6, long r7, long r9) {
            cn.jiguang.al.a$1 r0 = new cn.jiguang.al.a$1
            r1 = r6
            r2 = r7
            r4 = r9
            r0.<init>(r1, r2, r4)
            java.lang.String r6 = "FUTURE_TASK"
            cn.jiguang.au.d.a(r6, r0)
            return
    }

    public static void a(android.content.Context r1, android.os.Bundle r2) {
            boolean r0 = cn.jiguang.aj.i.a()
            if (r0 != 0) goto Le
            java.lang.String r1 = "ColdStartMonitorManager"
            java.lang.String r2 = "isSentrySample false"
            cn.jiguang.w.f.c(r1, r2)
            return
        Le:
            cn.jiguang.al.a.C0014a.a(r1)
            cn.jiguang.al.a.b.a(r1)
            cn.jiguang.al.a.b.a(r1, r2)
            return
    }
}
