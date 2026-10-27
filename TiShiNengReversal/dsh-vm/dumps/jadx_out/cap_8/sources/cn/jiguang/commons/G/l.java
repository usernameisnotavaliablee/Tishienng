package cn.jiguang.commons.g;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class l {
    private java.util.List a;

    /* renamed from: c, reason: collision with root package name */
    private java.util.List f1120c;

    /* renamed from: d, reason: collision with root package name */
    private java.util.concurrent.ConcurrentHashMap f1121d;

    /* renamed from: e, reason: collision with root package name */
    private java.util.List f1122e;

    class a implements java.util.concurrent.Callable {
        final /* synthetic */ int a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ cn.jiguang.commons.g.l f1123b;

        a(cn.jiguang.commons.g.l r1, int r2) {
                r0 = this;
                r0.f1123b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public cn.jiguang.commons.c.c a() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "create control state:"
                r0.append(r1)
                int r1 = r3.a
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "DataCollectionController"
                cn.jiguang.commons.w.a.a(r1, r0)
                cn.jiguang.commons.c.c r0 = new cn.jiguang.commons.c.c
                r0.<init>()
                r1 = 0
                r0.f998e = r1
                r1 = 0
                r0.f1000g = r1
                return r0
        }

        @Override // java.util.concurrent.Callable
        public /* synthetic */ java.lang.Object call() {
                r1 = this;
                cn.jiguang.commons.c.c r0 = r1.a()
                return r0
        }
    }

    private static final class b {
        private static final cn.jiguang.commons.g.l a = null;

        static {
                cn.jiguang.commons.g.l r0 = new cn.jiguang.commons.g.l
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.commons.g.l.b.a = r0
                return
        }

        public b() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.commons.g.l a() {
                cn.jiguang.commons.g.l r0 = cn.jiguang.commons.g.l.b.a
                return r0
        }
    }

    private l() {
            r0 = this;
            r0.<init>()
            r0.c()
            return
    }

    /* synthetic */ l(cn.jiguang.commons.g.l.a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static cn.jiguang.commons.g.l a() {
            cn.jiguang.commons.g.l r0 = cn.jiguang.commons.g.l.b.a()
            return r0
    }

    private boolean a(int r8, cn.jiguang.commons.c.i r9) {
            r7 = this;
            long r0 = r9.c()
            r2 = 0
            r4 = 1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 > 0) goto Lc
            return r4
        Lc:
            cn.jiguang.commons.c.c r9 = r7.d(r8, r9)
            monitor-enter(r9)
            int r2 = r9.f1000g     // Catch: java.lang.Throwable -> L43
            long r5 = (long) r2     // Catch: java.lang.Throwable -> L43
            int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r3 < 0) goto L45
            java.lang.String r2 = "DataCollectionController"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L43
            r3.<init>()     // Catch: java.lang.Throwable -> L43
            java.lang.String r4 = "scd:"
            r3.append(r4)     // Catch: java.lang.Throwable -> L43
            r3.append(r8)     // Catch: java.lang.Throwable -> L43
            java.lang.String r8 = " count limited:"
            r3.append(r8)     // Catch: java.lang.Throwable -> L43
            int r8 = r9.f1000g     // Catch: java.lang.Throwable -> L43
            r3.append(r8)     // Catch: java.lang.Throwable -> L43
            java.lang.String r8 = "/"
            r3.append(r8)     // Catch: java.lang.Throwable -> L43
            r3.append(r0)     // Catch: java.lang.Throwable -> L43
            java.lang.String r8 = r3.toString()     // Catch: java.lang.Throwable -> L43
            cn.jiguang.commons.w.a.a(r2, r8)     // Catch: java.lang.Throwable -> L43
            r8 = 0
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L43
            return r8
        L43:
            r8 = move-exception
            goto L72
        L45:
            int r2 = r2 + r4
            r9.f1000g = r2     // Catch: java.lang.Throwable -> L43
            java.lang.String r2 = "DataCollectionController"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L43
            r3.<init>()     // Catch: java.lang.Throwable -> L43
            java.lang.String r5 = "scd:"
            r3.append(r5)     // Catch: java.lang.Throwable -> L43
            r3.append(r8)     // Catch: java.lang.Throwable -> L43
            java.lang.String r8 = " count check ok:"
            r3.append(r8)     // Catch: java.lang.Throwable -> L43
            int r8 = r9.f1000g     // Catch: java.lang.Throwable -> L43
            r3.append(r8)     // Catch: java.lang.Throwable -> L43
            java.lang.String r8 = "/"
            r3.append(r8)     // Catch: java.lang.Throwable -> L43
            r3.append(r0)     // Catch: java.lang.Throwable -> L43
            java.lang.String r8 = r3.toString()     // Catch: java.lang.Throwable -> L43
            cn.jiguang.commons.w.a.a(r2, r8)     // Catch: java.lang.Throwable -> L43
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L43
            return r4
        L72:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L43
            throw r8
    }

    private boolean a(cn.jiguang.commons.c.i r4) {
            r3 = this;
            cn.jiguang.commons.g.p r0 = cn.jiguang.commons.g.p.e()
            boolean r0 = r0.n()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "fg check:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "DataCollectionController"
            cn.jiguang.commons.w.a.a(r2, r1)
            r1 = 1
            if (r0 == 0) goto L22
            return r1
        L22:
            int r4 = r4.a()
            if (r4 == 0) goto L29
            return r1
        L29:
            r4 = 0
            return r4
    }

    private void c() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r1 = cn.jiguang.commons.f.g.f1111g
            r0.<init>(r1)
            r2.a = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f1120c = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r2.f1121d = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f1122e = r0
            r1 = 1106(0x452, float:1.55E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            return
    }

    private boolean c(int r17, cn.jiguang.commons.c.i r18) {
            r16 = this;
            r0 = r17
            int r1 = r18.h()
            r2 = 1
            if (r1 != 0) goto L25
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "scd:"
            r1.append(r3)
            r1.append(r0)
            java.lang.String r0 = " freq 0"
        L18:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "DataCollectionController"
            cn.jiguang.commons.w.a.a(r1, r0)
            return r2
        L25:
            cn.jiguang.commons.c.c r3 = r16.d(r17, r18)
            long r4 = java.lang.System.currentTimeMillis()
            r6 = -1
            r7 = 0
            if (r1 != r6) goto L65
            java.util.concurrent.atomic.AtomicBoolean r1 = r3.f999f
            boolean r1 = r1.compareAndSet(r7, r2)
            if (r1 == 0) goto L49
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "scd:"
            r1.append(r3)
            r1.append(r0)
            java.lang.String r0 = " freq -1 check ok"
            goto L18
        L49:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "scd:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = " freq -1 collected"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "DataCollectionController"
            cn.jiguang.commons.w.a.a(r1, r0)
            return r7
        L65:
            if (r1 <= 0) goto Ldc
            monitor-enter(r3)
            long r8 = r3.f998e     // Catch: java.lang.Throwable -> La9
            long r8 = r4 - r8
            long r8 = java.lang.Math.abs(r8)     // Catch: java.lang.Throwable -> La9
            r10 = 1000(0x3e8, double:4.94E-321)
            long r10 = r8 / r10
            int r6 = r1 / 1000
            long r12 = (long) r6     // Catch: java.lang.Throwable -> La9
            long r14 = (long) r1     // Catch: java.lang.Throwable -> La9
            int r1 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r1 >= 0) goto Lab
            java.lang.String r1 = "DataCollectionController"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La9
            r2.<init>()     // Catch: java.lang.Throwable -> La9
            java.lang.String r4 = "scd:"
            r2.append(r4)     // Catch: java.lang.Throwable -> La9
            r2.append(r0)     // Catch: java.lang.Throwable -> La9
            java.lang.String r0 = " freq check: elapsed:"
            r2.append(r0)     // Catch: java.lang.Throwable -> La9
            r2.append(r10)     // Catch: java.lang.Throwable -> La9
            java.lang.String r0 = "s, limit:"
            r2.append(r0)     // Catch: java.lang.Throwable -> La9
            r2.append(r12)     // Catch: java.lang.Throwable -> La9
            java.lang.String r0 = "s, result:skip"
            r2.append(r0)     // Catch: java.lang.Throwable -> La9
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> La9
            cn.jiguang.commons.w.a.a(r1, r0)     // Catch: java.lang.Throwable -> La9
            monitor-exit(r3)     // Catch: java.lang.Throwable -> La9
            return r7
        La9:
            r0 = move-exception
            goto Lda
        Lab:
            r3.f998e = r4     // Catch: java.lang.Throwable -> La9
            java.lang.String r1 = "DataCollectionController"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La9
            r4.<init>()     // Catch: java.lang.Throwable -> La9
            java.lang.String r5 = "scd:"
            r4.append(r5)     // Catch: java.lang.Throwable -> La9
            r4.append(r0)     // Catch: java.lang.Throwable -> La9
            java.lang.String r0 = " freq check: elapsed:"
            r4.append(r0)     // Catch: java.lang.Throwable -> La9
            r4.append(r10)     // Catch: java.lang.Throwable -> La9
            java.lang.String r0 = "s, limit:"
            r4.append(r0)     // Catch: java.lang.Throwable -> La9
            r4.append(r12)     // Catch: java.lang.Throwable -> La9
            java.lang.String r0 = "s, result:allow"
            r4.append(r0)     // Catch: java.lang.Throwable -> La9
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> La9
            cn.jiguang.commons.w.a.a(r1, r0)     // Catch: java.lang.Throwable -> La9
            monitor-exit(r3)     // Catch: java.lang.Throwable -> La9
            return r2
        Lda:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> La9
            throw r0
        Ldc:
            return r2
    }

    private boolean c(int r6, boolean r7) {
            r5 = this;
            r0 = 1
            java.lang.String r1 = "DataCollectionController"
            r2 = 0
            if (r7 == 0) goto L13
            cn.jiguang.commons.A.a r7 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L10
            r3 = 3009(0xbc1, float:4.217E-42)
            r7.a(r6, r3)     // Catch: java.lang.Throwable -> L10
            return r0
        L10:
            r6 = move-exception
            goto La1
        L13:
            cn.jiguang.commons.f.j r7 = cn.jiguang.commons.f.j.j()     // Catch: java.lang.Throwable -> L10
            cn.jiguang.commons.c.i r7 = r7.a(r6)     // Catch: java.lang.Throwable -> L10
            java.lang.String r3 = "scd:"
            if (r7 != 0) goto L40
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10
            r7.<init>()     // Catch: java.lang.Throwable -> L10
            r7.append(r3)     // Catch: java.lang.Throwable -> L10
            r7.append(r6)     // Catch: java.lang.Throwable -> L10
            java.lang.String r0 = " disabled"
            r7.append(r0)     // Catch: java.lang.Throwable -> L10
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L10
            cn.jiguang.commons.w.a.a(r1, r7)     // Catch: java.lang.Throwable -> L10
            cn.jiguang.commons.A.a r7 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L10
            r0 = 3010(0xbc2, float:4.218E-42)
            r7.a(r6, r0)     // Catch: java.lang.Throwable -> L10
            return r2
        L40:
            boolean r4 = r5.c(r7)     // Catch: java.lang.Throwable -> L10
            if (r4 == 0) goto L50
            cn.jiguang.commons.A.a r7 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L10
            r0 = 3011(0xbc3, float:4.22E-42)
            r7.a(r6, r0)     // Catch: java.lang.Throwable -> L10
            return r2
        L50:
            boolean r4 = r5.a(r7)     // Catch: java.lang.Throwable -> L10
            if (r4 != 0) goto L77
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10
            r7.<init>()     // Catch: java.lang.Throwable -> L10
            r7.append(r3)     // Catch: java.lang.Throwable -> L10
            r7.append(r6)     // Catch: java.lang.Throwable -> L10
            java.lang.String r0 = " not fg"
            r7.append(r0)     // Catch: java.lang.Throwable -> L10
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L10
            cn.jiguang.commons.w.a.a(r1, r7)     // Catch: java.lang.Throwable -> L10
            cn.jiguang.commons.A.a r7 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L10
            r0 = 3012(0xbc4, float:4.221E-42)
            r7.a(r6, r0)     // Catch: java.lang.Throwable -> L10
            return r2
        L77:
            boolean r3 = r5.c(r6, r7)     // Catch: java.lang.Throwable -> L10
            if (r3 != 0) goto L87
            cn.jiguang.commons.A.a r7 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L10
            r0 = 3013(0xbc5, float:4.222E-42)
            r7.a(r6, r0)     // Catch: java.lang.Throwable -> L10
            return r2
        L87:
            boolean r7 = r5.a(r6, r7)     // Catch: java.lang.Throwable -> L10
            if (r7 != 0) goto L97
            cn.jiguang.commons.A.a r7 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L10
            r0 = 3014(0xbc6, float:4.224E-42)
            r7.a(r6, r0)     // Catch: java.lang.Throwable -> L10
            return r2
        L97:
            cn.jiguang.commons.A.a r7 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L10
            r3 = 3015(0xbc7, float:4.225E-42)
            r7.a(r6, r3)     // Catch: java.lang.Throwable -> L10
            return r0
        La1:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "shouldCollectDataFromService failed: "
            r7.append(r0)
            java.lang.String r6 = r6.getMessage()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            cn.jiguang.commons.w.a.f(r1, r6)
            return r2
    }

    private cn.jiguang.commons.c.c d(int r3, cn.jiguang.commons.c.i r4) {
            r2 = this;
            java.util.concurrent.ConcurrentHashMap r4 = r2.f1121d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            cn.jiguang.commons.g.l$a r1 = new cn.jiguang.commons.g.l$a
            r1.<init>(r2, r3)
            java.lang.Object r3 = cn.jiguang.commons.L.r.a(r4, r0, r1)
            cn.jiguang.commons.c.c r3 = (cn.jiguang.commons.c.c) r3
            return r3
    }

    public int a(java.lang.String r2) {
            r1 = this;
            java.util.Map r0 = cn.jiguang.commons.f.g.f1108d
            java.lang.Object r2 = r0.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto Lf
            int r2 = r2.intValue()
            return r2
        Lf:
            r2 = -1
            return r2
    }

    public long a(java.lang.String r13, int r14, long r15) {
            r12 = this;
            java.lang.String r1 = " scd:"
            java.lang.String r2 = "DataCollectionController"
            cn.jiguang.commons.f.j r0 = cn.jiguang.commons.f.j.j()     // Catch: java.lang.Exception -> L3a
            cn.jiguang.commons.c.i r0 = r0.a(r14)     // Catch: java.lang.Exception -> L3a
            java.lang.String r3 = "tag:"
            r4 = 1000(0x3e8, double:4.94E-321)
            if (r0 != 0) goto L3c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3a
            r0.<init>()     // Catch: java.lang.Exception -> L3a
            r0.append(r3)     // Catch: java.lang.Exception -> L3a
            r0.append(r13)     // Catch: java.lang.Exception -> L3a
            r0.append(r1)     // Catch: java.lang.Exception -> L3a
            r0.append(r14)     // Catch: java.lang.Exception -> L3a
            java.lang.String r3 = " no config, delay:"
            r0.append(r3)     // Catch: java.lang.Exception -> L3a
            long r3 = r15 / r4
            r0.append(r3)     // Catch: java.lang.Exception -> L3a
            java.lang.String r3 = "s"
            r0.append(r3)     // Catch: java.lang.Exception -> L3a
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L3a
            cn.jiguang.commons.w.a.a(r2, r0)     // Catch: java.lang.Exception -> L3a
            return r15
        L3a:
            r0 = move-exception
            goto L8d
        L3c:
            long r6 = r0.e()     // Catch: java.lang.Exception -> L3a
            java.util.List r0 = r12.f1120c     // Catch: java.lang.Exception -> L3a
            boolean r0 = r0.contains(r13)     // Catch: java.lang.Exception -> L3a
            if (r0 == 0) goto L4b
            r6 = 0
            goto L50
        L4b:
            java.util.List r0 = r12.f1120c     // Catch: java.lang.Exception -> L3a
            r0.add(r13)     // Catch: java.lang.Exception -> L3a
        L50:
            long r8 = r6 + r15
            long r10 = r8 / r4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3a
            r0.<init>()     // Catch: java.lang.Exception -> L3a
            r0.append(r3)     // Catch: java.lang.Exception -> L3a
            r0.append(r13)     // Catch: java.lang.Exception -> L3a
            r0.append(r1)     // Catch: java.lang.Exception -> L3a
            r0.append(r14)     // Catch: java.lang.Exception -> L3a
            java.lang.String r3 = " calc delay:"
            r0.append(r3)     // Catch: java.lang.Exception -> L3a
            r0.append(r10)     // Catch: java.lang.Exception -> L3a
            java.lang.String r3 = "s (cold:"
            r0.append(r3)     // Catch: java.lang.Exception -> L3a
            long r6 = r6 / r4
            r0.append(r6)     // Catch: java.lang.Exception -> L3a
            java.lang.String r3 = "s + extra:"
            r0.append(r3)     // Catch: java.lang.Exception -> L3a
            long r3 = r15 / r4
            r0.append(r3)     // Catch: java.lang.Exception -> L3a
            java.lang.String r3 = "s)"
            r0.append(r3)     // Catch: java.lang.Exception -> L3a
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L3a
            cn.jiguang.commons.w.a.a(r2, r0)     // Catch: java.lang.Exception -> L3a
            return r8
        L8d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "calc task delay failed, tag:"
            r3.append(r4)
            r3.append(r13)
            r3.append(r1)
            r3.append(r14)
            java.lang.String r13 = ", err:"
            r3.append(r13)
            java.lang.String r13 = r0.getMessage()
            r3.append(r13)
            java.lang.String r13 = r3.toString()
            cn.jiguang.commons.w.a.c(r2, r13)
            return r15
    }

    public java.lang.Object a(int r3, boolean r4, boolean r5, boolean r6, boolean r7, boolean r8) {
            r2 = this;
            java.lang.String r0 = "DataCollectionController"
            cn.jiguang.commons.g.p r1 = cn.jiguang.commons.g.p.e()     // Catch: java.lang.Throwable -> L2a
            boolean r1 = r1.m()     // Catch: java.lang.Throwable -> L2a
            if (r1 != 0) goto L2c
            java.lang.String r4 = "TopicManager"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2a
            r5.<init>()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r6 = " scd:"
            r5.append(r6)     // Catch: java.lang.Throwable -> L2a
            r5.append(r3)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r3 = " disabled use no auth"
            r5.append(r3)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L2a
            cn.jiguang.commons.w.a.a(r4, r3)     // Catch: java.lang.Throwable -> L2a
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L2a
            return r3
        L2a:
            r3 = move-exception
            goto L90
        L2c:
            if (r4 == 0) goto L3b
            cn.jiguang.commons.f.k r4 = cn.jiguang.commons.f.k.a()     // Catch: java.lang.Throwable -> L2a
            boolean r4 = r4.a(r3)     // Catch: java.lang.Throwable -> L2a
            if (r4 != 0) goto L3b
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L2a
            return r3
        L3b:
            cn.jiguang.commons.f.j r4 = cn.jiguang.commons.f.j.j()     // Catch: java.lang.Throwable -> L2a
            cn.jiguang.commons.c.i r4 = r4.a(r3)     // Catch: java.lang.Throwable -> L2a
            if (r4 != 0) goto L61
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2a
            r4.<init>()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r5 = "scd:"
            r4.append(r5)     // Catch: java.lang.Throwable -> L2a
            r4.append(r3)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r3 = " disabled"
            r4.append(r3)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L2a
            cn.jiguang.commons.w.a.a(r0, r3)     // Catch: java.lang.Throwable -> L2a
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L2a
            return r3
        L61:
            if (r5 == 0) goto L6c
            boolean r5 = r2.c(r4)     // Catch: java.lang.Throwable -> L2a
            if (r5 == 0) goto L6c
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L2a
            return r3
        L6c:
            if (r6 == 0) goto L77
            boolean r5 = r2.a(r4)     // Catch: java.lang.Throwable -> L2a
            if (r5 != 0) goto L77
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L2a
            return r3
        L77:
            if (r7 == 0) goto L82
            boolean r5 = r2.c(r3, r4)     // Catch: java.lang.Throwable -> L2a
            if (r5 != 0) goto L82
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L2a
            return r3
        L82:
            if (r8 == 0) goto L8d
            boolean r3 = r2.c(r3, r4)     // Catch: java.lang.Throwable -> L2a
            if (r3 != 0) goto L8d
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L2a
            return r3
        L8d:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L2a
            return r3
        L90:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "shouldCollectData all enable failed: "
            r4.append(r5)
            java.lang.String r3 = r3.getMessage()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            cn.jiguang.commons.w.a.f(r0, r3)
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            return r3
    }

    public boolean a(int r2) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.a(r2, r0)
            return r2
    }

    public boolean a(int r4, boolean r5) {
            r3 = this;
            r0 = 0
            cn.jiguang.commons.g.p r1 = cn.jiguang.commons.g.p.e()     // Catch: java.lang.Throwable -> L30
            boolean r1 = r1.m()     // Catch: java.lang.Throwable -> L30
            if (r1 != 0) goto L32
            java.lang.String r5 = "TopicManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L30
            r1.<init>()     // Catch: java.lang.Throwable -> L30
            java.lang.String r2 = " scd:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L30
            r1.append(r4)     // Catch: java.lang.Throwable -> L30
            java.lang.String r2 = " disabled use no auth"
            r1.append(r2)     // Catch: java.lang.Throwable -> L30
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L30
            cn.jiguang.commons.w.a.a(r5, r1)     // Catch: java.lang.Throwable -> L30
            cn.jiguang.commons.A.a r5 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L30
            r1 = 3007(0xbbf, float:4.214E-42)
            r5.a(r4, r1)     // Catch: java.lang.Throwable -> L30
            return r0
        L30:
            r4 = move-exception
            goto L4b
        L32:
            cn.jiguang.commons.f.k r1 = cn.jiguang.commons.f.k.a()     // Catch: java.lang.Throwable -> L30
            boolean r1 = r1.a(r4)     // Catch: java.lang.Throwable -> L30
            if (r1 != 0) goto L46
            cn.jiguang.commons.A.a r5 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L30
            r1 = 3008(0xbc0, float:4.215E-42)
            r5.a(r4, r1)     // Catch: java.lang.Throwable -> L30
            return r0
        L46:
            boolean r4 = r3.c(r4, r5)     // Catch: java.lang.Throwable -> L30
            return r4
        L4b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "shouldCollectData failed: "
            r5.append(r1)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "DataCollectionController"
            cn.jiguang.commons.w.a.f(r5, r4)
            return r0
    }

    public boolean a(java.lang.String r14, long r15) {
            r13 = this;
            int r0 = r13.a(r14)
            r1 = -1
            r2 = 0
            java.lang.String r3 = "TopicManager"
            if (r0 != r1) goto L1f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r14)
            java.lang.String r14 = " no config mapping found, result:skip"
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            cn.jiguang.commons.w.a.a(r3, r14)
            return r2
        L1f:
            cn.jiguang.commons.g.p r1 = cn.jiguang.commons.g.p.e()     // Catch: java.lang.Throwable -> L4f
            boolean r1 = r1.m()     // Catch: java.lang.Throwable -> L4f
            java.lang.String r4 = " scd:"
            if (r1 != 0) goto L53
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f
            r1.<init>()     // Catch: java.lang.Throwable -> L4f
            r1.append(r14)     // Catch: java.lang.Throwable -> L4f
            r1.append(r4)     // Catch: java.lang.Throwable -> L4f
            r1.append(r0)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r14 = " disabled use no auth. result:skip"
            r1.append(r14)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r14 = r1.toString()     // Catch: java.lang.Throwable -> L4f
            cn.jiguang.commons.w.a.a(r3, r14)     // Catch: java.lang.Throwable -> L4f
            cn.jiguang.commons.A.a r14 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L4f
            r1 = 3007(0xbbf, float:4.214E-42)
            r14.a(r0, r1)     // Catch: java.lang.Throwable -> L4f
            return r2
        L4f:
            r0 = move-exception
            r14 = r0
            goto L172
        L53:
            cn.jiguang.commons.f.k r1 = cn.jiguang.commons.f.k.a()     // Catch: java.lang.Throwable -> L4f
            boolean r1 = r1.a(r0)     // Catch: java.lang.Throwable -> L4f
            if (r1 != 0) goto L67
            cn.jiguang.commons.A.a r14 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L4f
            r1 = 3008(0xbc0, float:4.215E-42)
            r14.a(r0, r1)     // Catch: java.lang.Throwable -> L4f
            return r2
        L67:
            cn.jiguang.commons.f.j r1 = cn.jiguang.commons.f.j.j()     // Catch: java.lang.Throwable -> L4f
            cn.jiguang.commons.c.i r1 = r1.a(r0)     // Catch: java.lang.Throwable -> L4f
            if (r1 != 0) goto L95
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f
            r1.<init>()     // Catch: java.lang.Throwable -> L4f
            r1.append(r14)     // Catch: java.lang.Throwable -> L4f
            r1.append(r4)     // Catch: java.lang.Throwable -> L4f
            r1.append(r0)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r14 = " disabled, result:skip"
            r1.append(r14)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r14 = r1.toString()     // Catch: java.lang.Throwable -> L4f
            cn.jiguang.commons.w.a.a(r3, r14)     // Catch: java.lang.Throwable -> L4f
            cn.jiguang.commons.A.a r14 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L4f
            r1 = 3010(0xbc2, float:4.218E-42)
            r14.a(r0, r1)     // Catch: java.lang.Throwable -> L4f
            return r2
        L95:
            boolean r5 = r13.c(r1)     // Catch: java.lang.Throwable -> L4f
            if (r5 == 0) goto Lbf
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f
            r1.<init>()     // Catch: java.lang.Throwable -> L4f
            r1.append(r14)     // Catch: java.lang.Throwable -> L4f
            r1.append(r4)     // Catch: java.lang.Throwable -> L4f
            r1.append(r0)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r14 = " disabled in rpp, result:skip"
            r1.append(r14)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r14 = r1.toString()     // Catch: java.lang.Throwable -> L4f
            cn.jiguang.commons.w.a.a(r3, r14)     // Catch: java.lang.Throwable -> L4f
            cn.jiguang.commons.A.a r14 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L4f
            r1 = 3011(0xbc3, float:4.22E-42)
            r14.a(r0, r1)     // Catch: java.lang.Throwable -> L4f
            return r2
        Lbf:
            long r5 = cn.jiguang.commons.a.c.a(r14)     // Catch: java.lang.Throwable -> L4f
            long r7 = r1.d()     // Catch: java.lang.Throwable -> L4f
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 <= 0) goto Ld2
            long r7 = r1.d()     // Catch: java.lang.Throwable -> L4f
            goto Ld5
        Ld2:
            r7 = 86400000(0x5265c00, double:4.2687272E-316)
        Ld5:
            r1 = 1
            r11 = 3015(0xbc7, float:4.225E-42)
            int r12 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r12 != 0) goto Lfe
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f
            r5.<init>()     // Catch: java.lang.Throwable -> L4f
            r5.append(r14)     // Catch: java.lang.Throwable -> L4f
            r5.append(r4)     // Catch: java.lang.Throwable -> L4f
            r5.append(r0)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r14 = " interval check: first, result:allow"
            r5.append(r14)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r14 = r5.toString()     // Catch: java.lang.Throwable -> L4f
            cn.jiguang.commons.w.a.a(r3, r14)     // Catch: java.lang.Throwable -> L4f
            cn.jiguang.commons.A.a r14 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L4f
            r14.a(r0, r11)     // Catch: java.lang.Throwable -> L4f
            return r1
        Lfe:
            long r5 = r15 - r5
            long r5 = java.lang.Math.abs(r5)     // Catch: java.lang.Throwable -> L4f
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L109
            goto L10a
        L109:
            r1 = 0
        L10a:
            r9 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r9
            long r7 = r7 / r9
            java.lang.String r9 = "s, limit:"
            java.lang.String r10 = " interval check: elapsed:"
            if (r1 == 0) goto L142
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f
            r12.<init>()     // Catch: java.lang.Throwable -> L4f
            r12.append(r14)     // Catch: java.lang.Throwable -> L4f
            r12.append(r4)     // Catch: java.lang.Throwable -> L4f
            r12.append(r0)     // Catch: java.lang.Throwable -> L4f
            r12.append(r10)     // Catch: java.lang.Throwable -> L4f
            r12.append(r5)     // Catch: java.lang.Throwable -> L4f
            r12.append(r9)     // Catch: java.lang.Throwable -> L4f
            r12.append(r7)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r14 = "s, result:allow"
            r12.append(r14)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r14 = r12.toString()     // Catch: java.lang.Throwable -> L4f
            cn.jiguang.commons.w.a.a(r3, r14)     // Catch: java.lang.Throwable -> L4f
            cn.jiguang.commons.A.a r14 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L4f
            r14.a(r0, r11)     // Catch: java.lang.Throwable -> L4f
            return r1
        L142:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f
            r11.<init>()     // Catch: java.lang.Throwable -> L4f
            r11.append(r14)     // Catch: java.lang.Throwable -> L4f
            r11.append(r4)     // Catch: java.lang.Throwable -> L4f
            r11.append(r0)     // Catch: java.lang.Throwable -> L4f
            r11.append(r10)     // Catch: java.lang.Throwable -> L4f
            r11.append(r5)     // Catch: java.lang.Throwable -> L4f
            r11.append(r9)     // Catch: java.lang.Throwable -> L4f
            r11.append(r7)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r14 = "s, result:skip"
            r11.append(r14)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r14 = r11.toString()     // Catch: java.lang.Throwable -> L4f
            cn.jiguang.commons.w.a.a(r3, r14)     // Catch: java.lang.Throwable -> L4f
            cn.jiguang.commons.A.a r14 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L4f
            r3 = 3016(0xbc8, float:4.226E-42)
            r14.a(r0, r3)     // Catch: java.lang.Throwable -> L4f
            return r1
        L172:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "shouldCollectTopic failed: "
            r0.append(r1)
            java.lang.String r14 = r14.getMessage()
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            java.lang.String r0 = "DataCollectionController"
            cn.jiguang.commons.w.a.f(r0, r14)
            return r2
    }

    public long c(java.lang.String r3) {
            r2 = this;
            java.util.Map r0 = cn.jiguang.commons.f.g.f1110f
            java.lang.Object r3 = r0.get(r3)
            java.lang.Long r3 = (java.lang.Long) r3
            if (r3 == 0) goto Lf
            long r0 = r3.longValue()
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public boolean c(cn.jiguang.commons.c.i r14) {
            r13 = this;
            int r0 = r14.g()
            long r1 = r14.i()
            java.util.List r14 = r13.f1122e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            boolean r14 = r14.contains(r3)
            if (r14 == 0) goto L1b
            r3 = 604800000(0x240c8400, double:2.988109026E-315)
            long r1 = java.lang.Math.max(r1, r3)
        L1b:
            r14 = 0
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L23
            return r14
        L23:
            cn.jiguang.commons.g.p r5 = cn.jiguang.commons.g.p.e()
            long r5 = r5.c()
            r7 = 1
            java.lang.String r8 = "DataCollectionController"
            java.lang.String r9 = "scd:"
            int r10 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r10 > 0) goto L54
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r9)
            r14.append(r0)
            java.lang.String r0 = " server time <=0,value="
            r14.append(r0)
            r14.append(r5)
            java.lang.String r0 = "result: in rpp"
            r14.append(r0)
            java.lang.String r14 = r14.toString()
            cn.jiguang.commons.w.a.a(r8, r14)
            return r7
        L54:
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r5
            long r3 = java.lang.Math.abs(r3)
            r5 = 1000(0x3e8, double:4.94E-321)
            long r10 = r3 / r5
            long r5 = r1 / r5
            int r12 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r12 >= 0) goto L68
            r14 = 1
        L68:
            if (r14 == 0) goto L91
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r9)
            r1.append(r0)
            java.lang.String r0 = " elapsed:"
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = "s, limit:"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = "s, result: in rpp"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            cn.jiguang.commons.w.a.a(r8, r0)
        L91:
            return r14
    }
}
