package cn.jiguang.ak;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class i {
    private final java.util.Date a;

    /* renamed from: b, reason: collision with root package name */
    private java.util.Date f549b;

    /* renamed from: c, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicInteger f550c;

    /* renamed from: d, reason: collision with root package name */
    private final java.util.UUID f551d;

    /* renamed from: e, reason: collision with root package name */
    private java.lang.Boolean f552e;

    /* renamed from: f, reason: collision with root package name */
    private cn.jiguang.ak.i.a f553f;

    /* renamed from: g, reason: collision with root package name */
    private java.lang.Long f554g;

    /* renamed from: h, reason: collision with root package name */
    private java.lang.Double f555h;

    /* renamed from: i, reason: collision with root package name */
    private final java.lang.String f556i;

    /* renamed from: j, reason: collision with root package name */
    private java.lang.String f557j;

    /* renamed from: k, reason: collision with root package name */
    private final java.lang.String f558k;
    private final java.lang.Object l;

    public enum a extends java.lang.Enum<cn.jiguang.ak.i.a> {
        public static final cn.jiguang.ak.i.a a = null;

        /* renamed from: b, reason: collision with root package name */
        public static final cn.jiguang.ak.i.a f559b = null;

        /* renamed from: c, reason: collision with root package name */
        public static final cn.jiguang.ak.i.a f560c = null;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ cn.jiguang.ak.i.a[] f561d = null;

        static {
                cn.jiguang.ak.i$a r0 = new cn.jiguang.ak.i$a
                java.lang.String r1 = "Ok"
                r2 = 0
                r0.<init>(r1, r2)
                cn.jiguang.ak.i.a.a = r0
                cn.jiguang.ak.i$a r0 = new cn.jiguang.ak.i$a
                java.lang.String r1 = "Exited"
                r2 = 1
                r0.<init>(r1, r2)
                cn.jiguang.ak.i.a.f559b = r0
                cn.jiguang.ak.i$a r0 = new cn.jiguang.ak.i$a
                java.lang.String r1 = "Crashed"
                r2 = 2
                r0.<init>(r1, r2)
                cn.jiguang.ak.i.a.f560c = r0
                cn.jiguang.ak.i$a[] r0 = a()
                cn.jiguang.ak.i.a.f561d = r0
                return
        }

        a(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        private static /* synthetic */ cn.jiguang.ak.i.a[] a() {
                r0 = 3
                cn.jiguang.ak.i$a[] r0 = new cn.jiguang.ak.i.a[r0]
                cn.jiguang.ak.i$a r1 = cn.jiguang.ak.i.a.a
                r2 = 0
                r0[r2] = r1
                cn.jiguang.ak.i$a r1 = cn.jiguang.ak.i.a.f559b
                r2 = 1
                r0[r2] = r1
                cn.jiguang.ak.i$a r1 = cn.jiguang.ak.i.a.f560c
                r2 = 2
                r0[r2] = r1
                return r0
        }

        public static cn.jiguang.ak.i.a valueOf(java.lang.String r1) {
                java.lang.Class<cn.jiguang.ak.i$a> r0 = cn.jiguang.ak.i.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                cn.jiguang.ak.i$a r1 = (cn.jiguang.ak.i.a) r1
                return r1
        }

        public static cn.jiguang.ak.i.a[] values() {
                cn.jiguang.ak.i$a[] r0 = cn.jiguang.ak.i.a.f561d
                java.lang.Object r0 = r0.clone()
                cn.jiguang.ak.i$a[] r0 = (cn.jiguang.ak.i.a[]) r0
                return r0
        }
    }

    public i() {
            r12 = this;
            cn.jiguang.ak.i$a r1 = cn.jiguang.ak.i.a.a
            java.util.Date r2 = cn.jiguang.av.e.c()
            java.util.Date r3 = cn.jiguang.av.e.c()
            java.util.UUID r5 = java.util.UUID.randomUUID()
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r10 = 0
            java.lang.String r11 = "production"
            r4 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r0 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    public i(cn.jiguang.ak.i.a r2, java.util.Date r3, java.util.Date r4, int r5, java.util.UUID r6, java.lang.Boolean r7, java.lang.Long r8, java.lang.Double r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.l = r0
            r1.f553f = r2
            r1.a = r3
            r1.f549b = r4
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r2.<init>(r5)
            r1.f550c = r2
            r1.f551d = r6
            r1.f552e = r7
            r1.f554g = r8
            r1.f555h = r9
            r1.f556i = r10
            r1.f557j = r11
            r1.f558k = r12
            return
    }

    private double b(java.util.Date r5) {
            r4 = this;
            long r0 = r5.getTime()
            java.util.Date r5 = r4.a
            long r2 = r5.getTime()
            long r0 = r0 - r2
            long r0 = java.lang.Math.abs(r0)
            double r0 = (double) r0
            r2 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r0 = r0 / r2
            return r0
    }

    private long c(java.util.Date r5) {
            r4 = this;
            long r0 = r5.getTime()
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 >= 0) goto Le
            long r0 = java.lang.Math.abs(r0)
        Le:
            return r0
    }

    public java.util.Date a() {
            r1 = this;
            java.util.Date r0 = r1.a
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.Object r0 = r0.clone()
            java.util.Date r0 = (java.util.Date) r0
            return r0
    }

    public void a(java.util.Date r4) {
            r3 = this;
            java.lang.Object r0 = r3.l
            monitor-enter(r0)
            r1 = 0
            r3.f552e = r1     // Catch: java.lang.Throwable -> L11
            cn.jiguang.ak.i$a r1 = r3.f553f     // Catch: java.lang.Throwable -> L11
            cn.jiguang.ak.i$a r2 = cn.jiguang.ak.i.a.a     // Catch: java.lang.Throwable -> L11
            if (r1 != r2) goto L13
            cn.jiguang.ak.i$a r1 = cn.jiguang.ak.i.a.f559b     // Catch: java.lang.Throwable -> L11
            r3.f553f = r1     // Catch: java.lang.Throwable -> L11
            goto L13
        L11:
            r4 = move-exception
            goto L39
        L13:
            if (r4 == 0) goto L18
        L15:
            r3.f549b = r4     // Catch: java.lang.Throwable -> L11
            goto L1d
        L18:
            java.util.Date r4 = cn.jiguang.av.e.c()     // Catch: java.lang.Throwable -> L11
            goto L15
        L1d:
            java.util.Date r4 = r3.f549b     // Catch: java.lang.Throwable -> L11
            if (r4 == 0) goto L37
            double r1 = r3.b(r4)     // Catch: java.lang.Throwable -> L11
            java.lang.Double r4 = java.lang.Double.valueOf(r1)     // Catch: java.lang.Throwable -> L11
            r3.f555h = r4     // Catch: java.lang.Throwable -> L11
            java.util.Date r4 = r3.f549b     // Catch: java.lang.Throwable -> L11
            long r1 = r3.c(r4)     // Catch: java.lang.Throwable -> L11
            java.lang.Long r4 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L11
            r3.f554g = r4     // Catch: java.lang.Throwable -> L11
        L37:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L39:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r4
    }

    public boolean a(cn.jiguang.ak.i.a r3, java.lang.String r4, boolean r5) {
            r2 = this;
            java.lang.Object r0 = r2.l
            monitor-enter(r0)
            r1 = 1
            if (r3 == 0) goto Lc
            r2.f553f = r3     // Catch: java.lang.Throwable -> La
            r3 = 1
            goto Ld
        La:
            r3 = move-exception
            goto L34
        Lc:
            r3 = 0
        Ld:
            if (r4 == 0) goto L12
            r2.f557j = r4     // Catch: java.lang.Throwable -> La
            r3 = 1
        L12:
            if (r5 == 0) goto L1a
            java.util.concurrent.atomic.AtomicInteger r3 = r2.f550c     // Catch: java.lang.Throwable -> La
            r3.addAndGet(r1)     // Catch: java.lang.Throwable -> La
            goto L1b
        L1a:
            r1 = r3
        L1b:
            if (r1 == 0) goto L32
            r3 = 0
            r2.f552e = r3     // Catch: java.lang.Throwable -> La
            java.util.Date r3 = cn.jiguang.av.e.c()     // Catch: java.lang.Throwable -> La
            r2.f549b = r3     // Catch: java.lang.Throwable -> La
            if (r3 == 0) goto L32
            long r3 = r2.c(r3)     // Catch: java.lang.Throwable -> La
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> La
            r2.f554g = r3     // Catch: java.lang.Throwable -> La
        L32:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return r1
        L34:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r3
    }

    public java.util.UUID b() {
            r1 = this;
            java.util.UUID r0 = r1.f551d
            return r0
    }

    public java.lang.Boolean c() {
            r1 = this;
            java.lang.Boolean r0 = r1.f552e
            return r0
    }

    public /* synthetic */ java.lang.Object clone() {
            r1 = this;
            cn.jiguang.ak.i r0 = r1.j()
            return r0
    }

    public int d() {
            r1 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r1.f550c
            int r0 = r0.get()
            return r0
    }

    public cn.jiguang.ak.i.a e() {
            r1 = this;
            cn.jiguang.ak.i$a r0 = r1.f553f
            return r0
    }

    public java.lang.Long f() {
            r1 = this;
            java.lang.Long r0 = r1.f554g
            return r0
    }

    public java.lang.Double g() {
            r1 = this;
            java.lang.Double r0 = r1.f555h
            return r0
    }

    public java.util.Date h() {
            r1 = this;
            java.util.Date r0 = r1.f549b
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r0.clone()
            java.util.Date r0 = (java.util.Date) r0
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public void i() {
            r1 = this;
            java.util.Date r0 = cn.jiguang.av.e.c()
            r1.a(r0)
            return
    }

    public cn.jiguang.ak.i j() {
            r12 = this;
            cn.jiguang.ak.i r0 = new cn.jiguang.ak.i
            cn.jiguang.ak.i$a r1 = r12.f553f
            java.util.Date r2 = r12.a
            java.util.Date r3 = r12.f549b
            java.util.concurrent.atomic.AtomicInteger r4 = r12.f550c
            int r4 = r4.get()
            java.util.UUID r5 = r12.f551d
            java.lang.Boolean r6 = r12.f552e
            java.lang.Long r7 = r12.f554g
            java.lang.Double r8 = r12.f555h
            java.lang.String r9 = r12.f556i
            java.lang.String r10 = r12.f557j
            java.lang.String r11 = r12.f558k
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
    }
}
