package cn.jiguang.aq;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class d extends cn.jiguang.aq.b {

    /* renamed from: c, reason: collision with root package name */
    private boolean f631c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f632d;

    /* renamed from: e, reason: collision with root package name */
    private long f633e;

    /* renamed from: f, reason: collision with root package name */
    private long f634f;

    /* renamed from: cn.jiguang.aq.d$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    private static class a extends cn.jiguang.aq.b.a {
        private long a;

        /* renamed from: b, reason: collision with root package name */
        private long f635b;

        /* renamed from: c, reason: collision with root package name */
        private long f636c;

        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ a(cn.jiguang.aq.d.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public void d(long r1) {
                r0 = this;
                r0.a = r1
                return
        }

        public void e(long r1) {
                r0 = this;
                r0.f635b = r1
                return
        }

        public long f() {
                r2 = this;
                long r0 = r2.a
                return r0
        }

        public void f(long r1) {
                r0 = this;
                r0.f636c = r1
                return
        }

        public long g() {
                r2 = this;
                long r0 = r2.f635b
                return r0
        }

        public long h() {
                r2 = this;
                long r0 = r2.f636c
                return r0
        }
    }

    private static class b extends cn.jiguang.aq.b.C0015b {
        private long a;

        /* renamed from: b, reason: collision with root package name */
        private long f637b;

        /* renamed from: c, reason: collision with root package name */
        private long f638c;

        private b() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ b(cn.jiguang.aq.d.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public void d(long r1) {
                r0 = this;
                r0.a = r1
                return
        }

        public long e() {
                r2 = this;
                long r0 = r2.a
                return r0
        }

        public void e(long r1) {
                r0 = this;
                r0.f637b = r1
                return
        }

        public long f() {
                r2 = this;
                long r0 = r2.f637b
                return r0
        }

        public void f(long r1) {
                r0 = this;
                r0.f638c = r1
                return
        }

        public long g() {
                r2 = this;
                long r0 = r2.f638c
                return r0
        }
    }

    public d(android.content.Context r7, long r8) {
            r6 = this;
            java.lang.String r2 = "TCP_INIT_TIME"
            java.lang.String r3 = "t_init.catch."
            r0 = r6
            r1 = r7
            r4 = r8
            r0.<init>(r1, r2, r3, r4)
            r7 = 0
            r0.f631c = r7
            r0.f632d = r7
            r7 = 0
            r0.f633e = r7
            r0.f634f = r7
            return
    }

    private long a(long r2, boolean r4) {
            r1 = this;
            r0 = 0
            long r2 = r1.a(r2, r4, r0)
            return r2
    }

    private long a(long r11, boolean r13, int r14) {
            r10 = this;
            monitor-enter(r10)
            boolean r11 = r10.f631c     // Catch: java.lang.Throwable -> L5d
            r0 = 0
            if (r11 != 0) goto L14
            java.lang.String r11 = "TCPInitMoniter"
            java.lang.String r12 = "Cannot end: not started yet"
        Lb:
            cn.jiguang.w.f.i(r11, r12)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L10
            return r0
        L10:
            r0 = move-exception
            r11 = r0
            r4 = r10
            goto L60
        L14:
            boolean r11 = r10.f632d     // Catch: java.lang.Throwable -> L5d
            if (r11 == 0) goto L1d
            java.lang.String r11 = "TCPInitMoniter"
            java.lang.String r12 = "Cannot end: already completed once"
            goto Lb
        L1d:
            long r11 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L5d
            long r2 = r10.f633e     // Catch: java.lang.Throwable -> L5d
            long r5 = r11 - r2
            long r11 = r10.f634f     // Catch: java.lang.Throwable -> L5d
            long r8 = r5 - r11
            java.lang.String r11 = "TCPInitMoniter"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5d
            r12.<init>()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r2 = "endInit nonNetworkTime:"
            r12.append(r2)     // Catch: java.lang.Throwable -> L5d
            r12.append(r8)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L5d
            cn.jiguang.w.f.i(r11, r12)     // Catch: java.lang.Throwable -> L5d
            if (r13 == 0) goto L46
            r10.a(r5, r8)     // Catch: java.lang.Throwable -> L10
            r4 = r10
            goto L4b
        L46:
            r4 = r10
            r7 = r14
            r4.a(r5, r7, r8)     // Catch: java.lang.Throwable -> L5a
        L4b:
            r11 = 1
            r4.f632d = r11     // Catch: java.lang.Throwable -> L5a
            r11 = 0
            r4.f631c = r11     // Catch: java.lang.Throwable -> L5a
            r4.f633e = r0     // Catch: java.lang.Throwable -> L5a
            r4.f634f = r0     // Catch: java.lang.Throwable -> L5a
            r10.h()     // Catch: java.lang.Throwable -> L5a
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L5a
            return r5
        L5a:
            r0 = move-exception
        L5b:
            r11 = r0
            goto L60
        L5d:
            r0 = move-exception
            r4 = r10
            goto L5b
        L60:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L5a
            throw r11
    }

    @Override // cn.jiguang.aq.b
    public long a(long r4) {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f632d     // Catch: java.lang.Throwable -> L10
            r1 = 0
            if (r0 == 0) goto L12
            java.lang.String r4 = "TCPInitMoniter"
            java.lang.String r5 = "Already completed one pair, ignoring new start (only one pair per app lifecycle)"
        Lb:
            cn.jiguang.w.f.i(r4, r5)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L10
            return r1
        L10:
            r4 = move-exception
            goto L26
        L12:
            boolean r0 = r3.f631c     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto L1b
            java.lang.String r4 = "TCPInitMoniter"
            java.lang.String r5 = "Previous start not ended, ignoring new start"
            goto Lb
        L1b:
            r3.f633e = r4     // Catch: java.lang.Throwable -> L10
            r4 = 1
            r3.f631c = r4     // Catch: java.lang.Throwable -> L10
            r3.f634f = r1     // Catch: java.lang.Throwable -> L10
            r4 = 1
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L10
            return r4
        L26:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L10
            throw r4
    }

    @Override // cn.jiguang.aq.b
    public long a(long r1, int r3, java.lang.String r4) {
            r0 = this;
            r4 = 0
            long r1 = r0.a(r1, r4, r3)
            return r1
    }

    @Override // cn.jiguang.aq.b, cn.jiguang.am.a
    public org.json.JSONObject a() {
            r13 = this;
            java.lang.String r0 = "c"
            int r1 = r13.e()
            r2 = 0
            if (r1 > 0) goto La
            return r2
        La:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            int r3 = r13.e()     // Catch: java.lang.Throwable -> L72
            r1.put(r0, r3)     // Catch: java.lang.Throwable -> L72
            cn.jiguang.aq.b$b r3 = r13.f()     // Catch: java.lang.Throwable -> L72
            java.lang.String r4 = "n_n_max"
            java.lang.String r5 = "n_n_min"
            java.lang.String r6 = "n_n_avg"
            java.lang.String r7 = "max"
            java.lang.String r8 = "min"
            java.lang.String r9 = "avg"
            if (r3 == 0) goto L74
            cn.jiguang.aq.b$b r3 = r13.f()     // Catch: java.lang.Throwable -> L72
            boolean r3 = r3 instanceof cn.jiguang.aq.d.b     // Catch: java.lang.Throwable -> L72
            if (r3 == 0) goto L74
            cn.jiguang.aq.b$b r3 = r13.f()     // Catch: java.lang.Throwable -> L72
            cn.jiguang.aq.d$b r3 = (cn.jiguang.aq.d.b) r3     // Catch: java.lang.Throwable -> L72
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L72
            r10.<init>()     // Catch: java.lang.Throwable -> L72
            int r11 = r3.a()     // Catch: java.lang.Throwable -> L72
            r10.put(r0, r11)     // Catch: java.lang.Throwable -> L72
            long r11 = r3.b()     // Catch: java.lang.Throwable -> L72
            r10.put(r9, r11)     // Catch: java.lang.Throwable -> L72
            long r11 = r3.c()     // Catch: java.lang.Throwable -> L72
            r10.put(r8, r11)     // Catch: java.lang.Throwable -> L72
            long r11 = r3.d()     // Catch: java.lang.Throwable -> L72
            r10.put(r7, r11)     // Catch: java.lang.Throwable -> L72
            long r11 = r3.e()     // Catch: java.lang.Throwable -> L72
            r10.put(r6, r11)     // Catch: java.lang.Throwable -> L72
            long r11 = r3.f()     // Catch: java.lang.Throwable -> L72
            r10.put(r5, r11)     // Catch: java.lang.Throwable -> L72
            long r11 = r3.g()     // Catch: java.lang.Throwable -> L72
            r10.put(r4, r11)     // Catch: java.lang.Throwable -> L72
            java.lang.String r3 = "s"
            r1.put(r3, r10)     // Catch: java.lang.Throwable -> L72
            goto L74
        L72:
            r0 = move-exception
            goto Le1
        L74:
            cn.jiguang.aq.b$a r3 = r13.g()     // Catch: java.lang.Throwable -> L72
            if (r3 == 0) goto Le0
            cn.jiguang.aq.b$a r3 = r13.g()     // Catch: java.lang.Throwable -> L72
            boolean r3 = r3 instanceof cn.jiguang.aq.d.a     // Catch: java.lang.Throwable -> L72
            if (r3 == 0) goto Le0
            cn.jiguang.aq.b$a r3 = r13.g()     // Catch: java.lang.Throwable -> L72
            cn.jiguang.aq.d$a r3 = (cn.jiguang.aq.d.a) r3     // Catch: java.lang.Throwable -> L72
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L72
            r10.<init>()     // Catch: java.lang.Throwable -> L72
            int r11 = r3.a()     // Catch: java.lang.Throwable -> L72
            r10.put(r0, r11)     // Catch: java.lang.Throwable -> L72
            long r11 = r3.b()     // Catch: java.lang.Throwable -> L72
            r10.put(r9, r11)     // Catch: java.lang.Throwable -> L72
            long r11 = r3.c()     // Catch: java.lang.Throwable -> L72
            r10.put(r8, r11)     // Catch: java.lang.Throwable -> L72
            long r8 = r3.d()     // Catch: java.lang.Throwable -> L72
            r10.put(r7, r8)     // Catch: java.lang.Throwable -> L72
            long r7 = r3.f()     // Catch: java.lang.Throwable -> L72
            r10.put(r6, r7)     // Catch: java.lang.Throwable -> L72
            long r6 = r3.g()     // Catch: java.lang.Throwable -> L72
            r10.put(r5, r6)     // Catch: java.lang.Throwable -> L72
            long r5 = r3.h()     // Catch: java.lang.Throwable -> L72
            r10.put(r4, r5)     // Catch: java.lang.Throwable -> L72
            java.util.Map r0 = r3.e()     // Catch: java.lang.Throwable -> L72
            if (r0 == 0) goto Ldb
            java.util.Map r0 = r3.e()     // Catch: java.lang.Throwable -> L72
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L72
            if (r0 != 0) goto Ldb
            java.lang.String r0 = "t"
            java.util.Map r3 = r3.e()     // Catch: java.lang.Throwable -> L72
            java.lang.String r3 = r13.a(r3)     // Catch: java.lang.Throwable -> L72
            r10.put(r0, r3)     // Catch: java.lang.Throwable -> L72
        Ldb:
            java.lang.String r0 = "f"
            r1.put(r0, r10)     // Catch: java.lang.Throwable -> L72
        Le0:
            return r1
        Le1:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "build getExtraJson data failed, "
            r1.append(r3)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "TCPInitMoniter"
            cn.jiguang.w.f.i(r1, r0)
            return r2
    }

    @Override // cn.jiguang.aq.b
    protected void a(long r7, int r9) {
            r6 = this;
            r4 = 0
            r0 = r6
            r1 = r7
            r3 = r9
            r0.a(r1, r3, r4)
            return
    }

    protected void a(long r11, int r13, long r14) {
            r10 = this;
            java.lang.Object r0 = r10.f619b
            monitor-enter(r0)
            int r1 = r10.e()     // Catch: java.lang.Throwable -> L1e
            r2 = 1
            int r1 = r1 + r2
            r10.a(r1)     // Catch: java.lang.Throwable -> L1e
            cn.jiguang.aq.b$a r1 = r10.g()     // Catch: java.lang.Throwable -> L1e
            cn.jiguang.aq.d$a r1 = (cn.jiguang.aq.d.a) r1     // Catch: java.lang.Throwable -> L1e
            if (r1 != 0) goto L20
            cn.jiguang.aq.d$a r1 = new cn.jiguang.aq.d$a     // Catch: java.lang.Throwable -> L1e
            r3 = 0
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L1e
            r10.a(r1)     // Catch: java.lang.Throwable -> L1e
            goto L20
        L1e:
            r11 = move-exception
            goto L7c
        L20:
            int r3 = r1.a()     // Catch: java.lang.Throwable -> L1e
            int r3 = r3 + r2
            r1.a(r3)     // Catch: java.lang.Throwable -> L1e
            long r4 = r1.b()     // Catch: java.lang.Throwable -> L1e
            long r6 = r11 - r4
            long r8 = (long) r3     // Catch: java.lang.Throwable -> L1e
            long r6 = r6 / r8
            long r4 = r4 + r6
            r1.a(r4)     // Catch: java.lang.Throwable -> L1e
            if (r3 == r2) goto L3e
            long r4 = r1.c()     // Catch: java.lang.Throwable -> L1e
            int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r6 >= 0) goto L41
        L3e:
            r1.b(r11)     // Catch: java.lang.Throwable -> L1e
        L41:
            if (r3 == r2) goto L4b
            long r4 = r1.d()     // Catch: java.lang.Throwable -> L1e
            int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r6 <= 0) goto L4e
        L4b:
            r1.c(r11)     // Catch: java.lang.Throwable -> L1e
        L4e:
            java.lang.String r11 = java.lang.String.valueOf(r13)     // Catch: java.lang.Throwable -> L1e
            r1.a(r11)     // Catch: java.lang.Throwable -> L1e
            long r11 = r1.f()     // Catch: java.lang.Throwable -> L1e
            long r4 = r14 - r11
            long r4 = r4 / r8
            long r11 = r11 + r4
            r1.d(r11)     // Catch: java.lang.Throwable -> L1e
            if (r3 == r2) goto L6a
            long r11 = r1.g()     // Catch: java.lang.Throwable -> L1e
            int r13 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r13 >= 0) goto L6d
        L6a:
            r1.e(r14)     // Catch: java.lang.Throwable -> L1e
        L6d:
            if (r3 == r2) goto L77
            long r11 = r1.h()     // Catch: java.lang.Throwable -> L1e
            int r13 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r13 <= 0) goto L7a
        L77:
            r1.f(r14)     // Catch: java.lang.Throwable -> L1e
        L7a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            return
        L7c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r11
    }

    protected void a(long r11, long r13) {
            r10 = this;
            java.lang.Object r0 = r10.f619b
            monitor-enter(r0)
            int r1 = r10.e()     // Catch: java.lang.Throwable -> L1e
            r2 = 1
            int r1 = r1 + r2
            r10.a(r1)     // Catch: java.lang.Throwable -> L1e
            cn.jiguang.aq.b$b r1 = r10.f()     // Catch: java.lang.Throwable -> L1e
            cn.jiguang.aq.d$b r1 = (cn.jiguang.aq.d.b) r1     // Catch: java.lang.Throwable -> L1e
            if (r1 != 0) goto L20
            cn.jiguang.aq.d$b r1 = new cn.jiguang.aq.d$b     // Catch: java.lang.Throwable -> L1e
            r3 = 0
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L1e
            r10.a(r1)     // Catch: java.lang.Throwable -> L1e
            goto L20
        L1e:
            r11 = move-exception
            goto L75
        L20:
            int r3 = r1.a()     // Catch: java.lang.Throwable -> L1e
            int r3 = r3 + r2
            r1.a(r3)     // Catch: java.lang.Throwable -> L1e
            long r4 = r1.b()     // Catch: java.lang.Throwable -> L1e
            long r6 = r11 - r4
            long r8 = (long) r3     // Catch: java.lang.Throwable -> L1e
            long r6 = r6 / r8
            long r4 = r4 + r6
            r1.a(r4)     // Catch: java.lang.Throwable -> L1e
            if (r3 == r2) goto L3e
            long r4 = r1.c()     // Catch: java.lang.Throwable -> L1e
            int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r6 >= 0) goto L41
        L3e:
            r1.b(r11)     // Catch: java.lang.Throwable -> L1e
        L41:
            if (r3 == r2) goto L4b
            long r4 = r1.d()     // Catch: java.lang.Throwable -> L1e
            int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r6 <= 0) goto L4e
        L4b:
            r1.c(r11)     // Catch: java.lang.Throwable -> L1e
        L4e:
            long r11 = r1.e()     // Catch: java.lang.Throwable -> L1e
            long r4 = r13 - r11
            long r4 = r4 / r8
            long r11 = r11 + r4
            r1.d(r11)     // Catch: java.lang.Throwable -> L1e
            if (r3 == r2) goto L63
            long r11 = r1.f()     // Catch: java.lang.Throwable -> L1e
            int r4 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r4 >= 0) goto L66
        L63:
            r1.e(r13)     // Catch: java.lang.Throwable -> L1e
        L66:
            if (r3 == r2) goto L70
            long r11 = r1.g()     // Catch: java.lang.Throwable -> L1e
            int r2 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r2 <= 0) goto L73
        L70:
            r1.f(r13)     // Catch: java.lang.Throwable -> L1e
        L73:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            return
        L75:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r11
    }

    @Override // cn.jiguang.aq.b
    public long b(long r2) {
            r1 = this;
            r0 = 1
            long r2 = r1.a(r2, r0)
            return r2
    }

    @Override // cn.jiguang.aq.b
    protected void c(long r3) {
            r2 = this;
            r0 = 0
            r2.a(r3, r0)
            return
    }

    @Override // cn.jiguang.aq.b
    public long d() {
            r2 = this;
            java.lang.String r0 = "TCPInitMoniter"
            java.lang.String r1 = "TCPInitMoniter.start() requires startTime parameter, use start(long startTime) instead"
            cn.jiguang.w.f.i(r0, r1)
            r0 = 0
            return r0
    }

    public void d(long r4) {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f631c     // Catch: java.lang.Throwable -> L28
            if (r0 == 0) goto L30
            boolean r0 = r3.f632d     // Catch: java.lang.Throwable -> L28
            if (r0 == 0) goto La
            goto L30
        La:
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L2a
            java.lang.String r0 = "TCPInitMoniter"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L28
            r1.<init>()     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = "Network time cannot be negative: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L28
            r1.append(r4)     // Catch: java.lang.Throwable -> L28
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L28
            cn.jiguang.w.f.i(r0, r4)     // Catch: java.lang.Throwable -> L28
        L26:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L28
            return
        L28:
            r4 = move-exception
            goto L38
        L2a:
            long r0 = r3.f634f     // Catch: java.lang.Throwable -> L28
            long r0 = r0 + r4
            r3.f634f = r0     // Catch: java.lang.Throwable -> L28
            goto L26
        L30:
            java.lang.String r4 = "TCPInitMoniter"
            java.lang.String r5 = "Cannot add network time: not in active state"
            cn.jiguang.w.f.i(r4, r5)     // Catch: java.lang.Throwable -> L28
            goto L26
        L38:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L28
            throw r4
    }

    @Override // cn.jiguang.aq.b
    public boolean j() {
            r17 = this;
            r1 = r17
            java.lang.String r0 = "c"
            java.lang.String r2 = r1.a
            java.lang.String r3 = "TCPInitMoniter"
            r4 = 0
            if (r2 == 0) goto L11
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L16
        L11:
            r12 = r3
            r16 = 0
            goto L141
        L16:
            java.lang.String r2 = r1.a     // Catch: java.lang.Throwable -> L35
            org.json.JSONObject r2 = cn.jiguang.av.i.a(r2)     // Catch: java.lang.Throwable -> L35
            if (r2 != 0) goto L39
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r0.<init>()     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = "No data found in file: "
            r0.append(r2)     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = r1.a     // Catch: java.lang.Throwable -> L35
            r0.append(r2)     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L35
            cn.jiguang.w.f.c(r3, r0)     // Catch: java.lang.Throwable -> L35
            return r4
        L35:
            r0 = move-exception
            r12 = r3
            goto L126
        L39:
            java.lang.String r5 = "extra"
            org.json.JSONObject r2 = r2.optJSONObject(r5)     // Catch: java.lang.Throwable -> L35
            if (r2 != 0) goto L58
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r0.<init>()     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = "No 'extra' field found in file: "
            r0.append(r2)     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = r1.a     // Catch: java.lang.Throwable -> L35
            r0.append(r2)     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L35
            cn.jiguang.w.f.i(r3, r0)     // Catch: java.lang.Throwable -> L35
            return r4
        L58:
            int r5 = r2.optInt(r0, r4)     // Catch: java.lang.Throwable -> L35
            r1.a(r5)     // Catch: java.lang.Throwable -> L35
            java.lang.String r5 = "s"
            org.json.JSONObject r5 = r2.optJSONObject(r5)     // Catch: java.lang.Throwable -> L35
            java.lang.String r6 = "n_n_max"
            java.lang.String r7 = "n_n_min"
            java.lang.String r8 = "n_n_avg"
            java.lang.String r9 = "max"
            java.lang.String r10 = "min"
            java.lang.String r11 = "avg"
            r12 = 0
            r13 = 0
            if (r5 == 0) goto Lb3
            cn.jiguang.aq.d$b r15 = new cn.jiguang.aq.d$b     // Catch: java.lang.Throwable -> L35
            r15.<init>(r12)     // Catch: java.lang.Throwable -> L35
            int r12 = r5.optInt(r0, r4)     // Catch: java.lang.Throwable -> L35
            r15.a(r12)     // Catch: java.lang.Throwable -> L35
            r12 = r3
            long r3 = r5.optLong(r11, r13)     // Catch: java.lang.Throwable -> Lb1
            r15.a(r3)     // Catch: java.lang.Throwable -> Lb1
            long r3 = r5.optLong(r10, r13)     // Catch: java.lang.Throwable -> Lb1
            r15.b(r3)     // Catch: java.lang.Throwable -> Lb1
            long r3 = r5.optLong(r9, r13)     // Catch: java.lang.Throwable -> Lb1
            r15.c(r3)     // Catch: java.lang.Throwable -> Lb1
            long r3 = r5.optLong(r8, r13)     // Catch: java.lang.Throwable -> Lb1
            r15.d(r3)     // Catch: java.lang.Throwable -> Lb1
            long r3 = r5.optLong(r7, r13)     // Catch: java.lang.Throwable -> Lb1
            r15.e(r3)     // Catch: java.lang.Throwable -> Lb1
            long r3 = r5.optLong(r6, r13)     // Catch: java.lang.Throwable -> Lb1
            r15.f(r3)     // Catch: java.lang.Throwable -> Lb1
            r1.a(r15)     // Catch: java.lang.Throwable -> Lb1
            goto Lb4
        Lb1:
            r0 = move-exception
            goto L126
        Lb3:
            r12 = r3
        Lb4:
            java.lang.String r3 = "f"
            org.json.JSONObject r2 = r2.optJSONObject(r3)     // Catch: java.lang.Throwable -> Lb1
            if (r2 == 0) goto L10e
            cn.jiguang.aq.d$a r3 = new cn.jiguang.aq.d$a     // Catch: java.lang.Throwable -> Lb1
            r4 = 0
            r3.<init>(r4)     // Catch: java.lang.Throwable -> Lb1
            r4 = 0
            int r0 = r2.optInt(r0, r4)     // Catch: java.lang.Throwable -> Lb1
            r3.a(r0)     // Catch: java.lang.Throwable -> Lb1
            long r4 = r2.optLong(r11, r13)     // Catch: java.lang.Throwable -> Lb1
            r3.a(r4)     // Catch: java.lang.Throwable -> Lb1
            long r4 = r2.optLong(r10, r13)     // Catch: java.lang.Throwable -> Lb1
            r3.b(r4)     // Catch: java.lang.Throwable -> Lb1
            long r4 = r2.optLong(r9, r13)     // Catch: java.lang.Throwable -> Lb1
            r3.c(r4)     // Catch: java.lang.Throwable -> Lb1
            long r4 = r2.optLong(r8, r13)     // Catch: java.lang.Throwable -> Lb1
            r3.d(r4)     // Catch: java.lang.Throwable -> Lb1
            long r4 = r2.optLong(r7, r13)     // Catch: java.lang.Throwable -> Lb1
            r3.e(r4)     // Catch: java.lang.Throwable -> Lb1
            long r4 = r2.optLong(r6, r13)     // Catch: java.lang.Throwable -> Lb1
            r3.f(r4)     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r0 = "t"
            java.lang.String r4 = ""
            java.lang.String r0 = r2.optString(r0, r4)     // Catch: java.lang.Throwable -> Lb1
            if (r0 == 0) goto L10b
            boolean r2 = r0.isEmpty()     // Catch: java.lang.Throwable -> Lb1
            if (r2 != 0) goto L10b
            java.util.Map r0 = r1.a(r0)     // Catch: java.lang.Throwable -> Lb1
            r3.a(r0)     // Catch: java.lang.Throwable -> Lb1
        L10b:
            r1.a(r3)     // Catch: java.lang.Throwable -> Lb1
        L10e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb1
            r0.<init>()     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r2 = "Successfully loaded monitor data from file: "
            r0.append(r2)     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r2 = r1.a     // Catch: java.lang.Throwable -> Lb1
            r0.append(r2)     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lb1
            cn.jiguang.w.f.c(r12, r0)     // Catch: java.lang.Throwable -> Lb1
            r0 = 1
            return r0
        L126:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Exception while loading monitor data: "
            r2.append(r3)
            java.lang.String r3 = r0.getMessage()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            cn.jiguang.w.f.b(r12, r2, r0)
            r16 = 0
            return r16
        L141:
            java.lang.String r0 = "fileName is null or empty, cannot load"
            cn.jiguang.w.f.i(r12, r0)
            return r16
    }
}
