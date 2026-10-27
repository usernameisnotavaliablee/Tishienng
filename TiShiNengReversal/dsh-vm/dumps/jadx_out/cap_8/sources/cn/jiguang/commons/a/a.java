package cn.jiguang.commons.A;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a {
    private static final java.lang.String p = null;
    private static final java.lang.String q = null;
    private static final java.lang.ThreadLocal r = null;
    private static final java.util.HashMap s = null;
    private android.content.Context a;

    /* renamed from: c, reason: collision with root package name */
    private java.util.concurrent.atomic.AtomicBoolean f745c;

    /* renamed from: d, reason: collision with root package name */
    private final java.util.concurrent.ConcurrentLinkedQueue f746d;

    /* renamed from: e, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicInteger f747e;

    /* renamed from: f, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f748f;

    /* renamed from: g, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicLong f749g;

    /* renamed from: h, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicInteger f750h;

    /* renamed from: i, reason: collision with root package name */
    private volatile java.util.concurrent.ScheduledFuture f751i;

    /* renamed from: j, reason: collision with root package name */
    private final java.lang.Object f752j;

    /* renamed from: k, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f753k;
    private final java.util.concurrent.atomic.AtomicInteger l;
    private final java.util.concurrent.atomic.AtomicInteger m;
    private final java.lang.Runnable n;
    private final java.lang.Runnable o;

    /* renamed from: cn.jiguang.commons.A.a$a, reason: collision with other inner class name */
    class RunnableC0020a implements java.lang.Runnable {
        final /* synthetic */ cn.jiguang.commons.A.a a;

        RunnableC0020a(cn.jiguang.commons.A.a r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r6 = this;
                java.lang.String r0 = "JEXS"
                cn.jiguang.commons.A.a r1 = r6.a
                java.util.concurrent.atomic.AtomicBoolean r1 = cn.jiguang.commons.A.a.a(r1)
                r2 = 0
                r3 = 1
                r1.compareAndSet(r2, r3)
                java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L33
                r1.<init>()     // Catch: java.lang.Throwable -> L33
                r4 = 0
            L13:
                cn.jiguang.commons.A.a r5 = r6.a     // Catch: java.lang.Throwable -> L33
                java.util.concurrent.ConcurrentLinkedQueue r5 = cn.jiguang.commons.A.a.c(r5)     // Catch: java.lang.Throwable -> L33
                java.lang.Object r5 = r5.poll()     // Catch: java.lang.Throwable -> L33
                cn.jiguang.commons.A.a$e r5 = (cn.jiguang.commons.A.a.e) r5     // Catch: java.lang.Throwable -> L33
                if (r5 == 0) goto L35
                r1.add(r5)     // Catch: java.lang.Throwable -> L33
                cn.jiguang.commons.A.a r5 = r6.a     // Catch: java.lang.Throwable -> L33
                java.util.concurrent.atomic.AtomicInteger r5 = cn.jiguang.commons.A.a.f(r5)     // Catch: java.lang.Throwable -> L33
                r5.decrementAndGet()     // Catch: java.lang.Throwable -> L33
                int r4 = r4 + r3
                r5 = 5000(0x1388, float:7.006E-42)
                if (r4 < r5) goto L13
                goto L35
            L33:
                r1 = move-exception
                goto La8
            L35:
                boolean r3 = r1.isEmpty()     // Catch: java.lang.Throwable -> L33
                if (r3 != 0) goto L58
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L33
                r3.<init>()     // Catch: java.lang.Throwable -> L33
                java.lang.String r4 = "queue poll count:"
                r3.append(r4)     // Catch: java.lang.Throwable -> L33
                int r4 = r1.size()     // Catch: java.lang.Throwable -> L33
                r3.append(r4)     // Catch: java.lang.Throwable -> L33
                java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L33
                cn.jiguang.commons.w.a.a(r0, r3)     // Catch: java.lang.Throwable -> L33
                cn.jiguang.commons.A.a r3 = r6.a     // Catch: java.lang.Throwable -> L33
                cn.jiguang.commons.A.a.a(r3, r1)     // Catch: java.lang.Throwable -> L33
            L58:
                cn.jiguang.commons.A.a r1 = r6.a     // Catch: java.lang.Throwable -> L33
                java.util.concurrent.ConcurrentLinkedQueue r1 = cn.jiguang.commons.A.a.c(r1)     // Catch: java.lang.Throwable -> L33
                boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L33
                if (r1 != 0) goto L95
                cn.jiguang.commons.A.a r1 = r6.a     // Catch: java.lang.Throwable -> L33
                java.util.concurrent.atomic.AtomicBoolean r1 = cn.jiguang.commons.A.a.a(r1)     // Catch: java.lang.Throwable -> L33
                r1.set(r2)     // Catch: java.lang.Throwable -> L33
                cn.jiguang.commons.A.a r1 = r6.a     // Catch: java.lang.Throwable -> L33
                java.util.concurrent.atomic.AtomicInteger r1 = cn.jiguang.commons.A.a.f(r1)     // Catch: java.lang.Throwable -> L33
                int r1 = r1.get()     // Catch: java.lang.Throwable -> L33
                if (r1 >= 0) goto L83
                cn.jiguang.commons.A.a r1 = r6.a     // Catch: java.lang.Throwable -> L33
                java.util.concurrent.atomic.AtomicInteger r1 = cn.jiguang.commons.A.a.f(r1)     // Catch: java.lang.Throwable -> L33
                r1.set(r2)     // Catch: java.lang.Throwable -> L33
                r1 = 0
            L83:
                r3 = 500(0x1f4, float:7.0E-43)
                if (r1 < r3) goto L8f
                cn.jiguang.commons.A.a r3 = r6.a     // Catch: java.lang.Throwable -> L33
                r4 = 0
                cn.jiguang.commons.A.a.a(r3, r1, r2, r4)     // Catch: java.lang.Throwable -> L33
                goto L9e
            L8f:
                cn.jiguang.commons.A.a r1 = r6.a     // Catch: java.lang.Throwable -> L33
                cn.jiguang.commons.A.a.g(r1)     // Catch: java.lang.Throwable -> L33
                goto L9e
            L95:
                cn.jiguang.commons.A.a r1 = r6.a     // Catch: java.lang.Throwable -> L33
                java.util.concurrent.atomic.AtomicInteger r1 = cn.jiguang.commons.A.a.h(r1)     // Catch: java.lang.Throwable -> L33
                r1.set(r2)     // Catch: java.lang.Throwable -> L33
            L9e:
                cn.jiguang.commons.A.a r0 = r6.a
                java.util.concurrent.atomic.AtomicBoolean r0 = cn.jiguang.commons.A.a.a(r0)
                r0.set(r2)
                return
            La8:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc1
                r3.<init>()     // Catch: java.lang.Throwable -> Lc1
                java.lang.String r4 = "process bundles err: "
                r3.append(r4)     // Catch: java.lang.Throwable -> Lc1
                java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> Lc1
                r3.append(r1)     // Catch: java.lang.Throwable -> Lc1
                java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> Lc1
                cn.jiguang.commons.w.a.f(r0, r1)     // Catch: java.lang.Throwable -> Lc1
                goto L9e
            Lc1:
                r0 = move-exception
                cn.jiguang.commons.A.a r1 = r6.a
                java.util.concurrent.atomic.AtomicBoolean r1 = cn.jiguang.commons.A.a.a(r1)
                r1.set(r2)
                throw r0
        }
    }

    class b implements java.lang.Runnable {
        final /* synthetic */ cn.jiguang.commons.A.a a;

        b(cn.jiguang.commons.A.a r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r8 = this;
                java.lang.String r0 = "data"
                java.lang.String r1 = "JEXS"
                java.lang.String r2 = cn.jiguang.commons.A.a.a()     // Catch: java.lang.Throwable -> Lfa
                java.lang.String r3 = cn.jiguang.commons.A.a.c()     // Catch: java.lang.Throwable -> Lfa
                cn.jiguang.commons.L.m.a(r2, r3)     // Catch: java.lang.Throwable -> Lfa
                java.lang.String r2 = cn.jiguang.commons.A.a.a()     // Catch: java.lang.Throwable -> Lfa
                cn.jiguang.commons.L.m.d(r2)     // Catch: java.lang.Throwable -> Lfa
                java.lang.String r2 = "file copied to temp"
                cn.jiguang.commons.w.a.a(r1, r2)     // Catch: java.lang.Throwable -> Lfa
                java.lang.String r2 = cn.jiguang.commons.A.a.c()     // Catch: java.lang.Throwable -> L2b
                org.json.JSONObject r2 = cn.jiguang.commons.L.m.i(r2)     // Catch: java.lang.Throwable -> L2b
                if (r2 != 0) goto L2e
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2b
                r2.<init>()     // Catch: java.lang.Throwable -> L2b
                goto L2e
            L2b:
                r0 = move-exception
                goto L114
            L2e:
                org.json.JSONArray r2 = r2.optJSONArray(r0)     // Catch: java.lang.Throwable -> L2b
                if (r2 != 0) goto L39
                org.json.JSONArray r2 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L2b
                r2.<init>()     // Catch: java.lang.Throwable -> L2b
            L39:
                int r3 = r2.length()     // Catch: java.lang.Throwable -> L2b
                if (r3 != 0) goto L43
                java.lang.String r0 = "no data to report"
                goto Lf6
            L43:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2b
                r3.<init>()     // Catch: java.lang.Throwable -> L2b
                java.lang.String r4 = "data types to report:"
                r3.append(r4)     // Catch: java.lang.Throwable -> L2b
                int r4 = r2.length()     // Catch: java.lang.Throwable -> L2b
                r3.append(r4)     // Catch: java.lang.Throwable -> L2b
                java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L2b
                cn.jiguang.commons.w.a.a(r1, r3)     // Catch: java.lang.Throwable -> L2b
                cn.jiguang.commons.A.a r3 = r8.a     // Catch: java.lang.Throwable -> L2b
                cn.jiguang.commons.A.a.a(r3, r2)     // Catch: java.lang.Throwable -> L2b
                java.util.ArrayList r2 = cn.jiguang.commons.L.ad.a(r2)     // Catch: java.lang.Throwable -> L2b
                if (r2 == 0) goto Lf4
                boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> L2b
                if (r3 == 0) goto L6e
                goto Lf4
            L6e:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2b
                r3.<init>()     // Catch: java.lang.Throwable -> L2b
                java.lang.String r4 = "report slices:"
                r3.append(r4)     // Catch: java.lang.Throwable -> L2b
                int r4 = r2.size()     // Catch: java.lang.Throwable -> L2b
                r3.append(r4)     // Catch: java.lang.Throwable -> L2b
                java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L2b
                cn.jiguang.commons.w.a.a(r1, r3)     // Catch: java.lang.Throwable -> L2b
                int r3 = r2.size()     // Catch: java.lang.Throwable -> L2b
                r4 = 0
            L8b:
                if (r4 >= r3) goto Lda
                org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2b
                r5.<init>()     // Catch: java.lang.Throwable -> L2b
                java.lang.Object r6 = r2.get(r4)     // Catch: java.lang.Throwable -> L2b
                org.json.JSONArray r6 = (org.json.JSONArray) r6     // Catch: java.lang.Throwable -> L2b
                java.lang.String r7 = "slice_index"
                int r4 = r4 + 1
                r5.put(r7, r4)     // Catch: java.lang.Throwable -> L2b
                java.lang.String r7 = "slice_count"
                r5.put(r7, r3)     // Catch: java.lang.Throwable -> L2b
                r5.put(r0, r6)     // Catch: java.lang.Throwable -> L2b
                java.lang.String r6 = "sequence"
                java.util.UUID r7 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L2b
                java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L2b
                r5.put(r6, r7)     // Catch: java.lang.Throwable -> L2b
                cn.jiguang.commons.g.p r6 = cn.jiguang.commons.g.p.e()     // Catch: java.lang.Throwable -> L2b
                java.lang.String r7 = "exception_stats"
                r6.a(r5, r7)     // Catch: java.lang.Throwable -> L2b
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2b
                r5.<init>()     // Catch: java.lang.Throwable -> L2b
                java.lang.String r6 = "report slice "
                r5.append(r6)     // Catch: java.lang.Throwable -> L2b
                r5.append(r4)     // Catch: java.lang.Throwable -> L2b
                java.lang.String r6 = "/"
                r5.append(r6)     // Catch: java.lang.Throwable -> L2b
                r5.append(r3)     // Catch: java.lang.Throwable -> L2b
                java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L2b
                cn.jiguang.commons.w.a.a(r1, r5)     // Catch: java.lang.Throwable -> L2b
                goto L8b
            Lda:
                cn.jiguang.commons.L.ac r0 = cn.jiguang.commons.L.ac.a()     // Catch: java.lang.Throwable -> L2b
                java.lang.String r2 = "exception_report_mills"
                long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L2b
                r0.c(r2, r3)     // Catch: java.lang.Throwable -> L2b
                java.lang.String r0 = cn.jiguang.commons.A.a.c()     // Catch: java.lang.Throwable -> L2b
                cn.jiguang.commons.L.m.d(r0)     // Catch: java.lang.Throwable -> L2b
                cn.jiguang.commons.a.c.e(r1)     // Catch: java.lang.Throwable -> L2b
                java.lang.String r0 = "report completed"
                goto Lf6
            Lf4:
                java.lang.String r0 = "partition failed"
            Lf6:
                cn.jiguang.commons.w.a.a(r1, r0)     // Catch: java.lang.Throwable -> L2b
                return
            Lfa:
                r0 = move-exception
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2b
                r2.<init>()     // Catch: java.lang.Throwable -> L2b
                java.lang.String r3 = "file ops err: "
                r2.append(r3)     // Catch: java.lang.Throwable -> L2b
                java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L2b
                r2.append(r0)     // Catch: java.lang.Throwable -> L2b
                java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L2b
                cn.jiguang.commons.w.a.f(r1, r0)     // Catch: java.lang.Throwable -> L2b
                return
            L114:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "report err: "
                r2.append(r3)
                java.lang.String r0 = r0.getMessage()
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                cn.jiguang.commons.w.a.f(r1, r0)
                return
        }
    }

    class c implements java.lang.Runnable {
        final /* synthetic */ cn.jiguang.commons.A.a a;

        c(cn.jiguang.commons.A.a r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                cn.jiguang.commons.A.a r0 = r3.a
                java.lang.Object r0 = cn.jiguang.commons.A.a.d(r0)
                monitor-enter(r0)
                cn.jiguang.commons.A.a r1 = r3.a     // Catch: java.lang.Throwable -> L2c
                r2 = 0
                cn.jiguang.commons.A.a.a(r1, r2)     // Catch: java.lang.Throwable -> L2c
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
                cn.jiguang.commons.A.a r0 = r3.a
                java.util.concurrent.atomic.AtomicBoolean r0 = cn.jiguang.commons.A.a.a(r0)
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L2b
                cn.jiguang.commons.C.a r0 = cn.jiguang.commons.C.a.c()
                cn.jiguang.commons.A.a r1 = r3.a
                java.lang.Runnable r1 = cn.jiguang.commons.A.a.e(r1)
                cn.jiguang.commons.C.a$g r2 = cn.jiguang.commons.C.a.g.f772e
                r0.a(r1, r2)
            L2b:
                return
            L2c:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
                throw r1
        }
    }

    private static final class d {
        private static final cn.jiguang.commons.A.a a = null;

        static {
                cn.jiguang.commons.A.a r0 = new cn.jiguang.commons.A.a
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.commons.A.a.d.a = r0
                return
        }

        public d() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.commons.A.a a() {
                cn.jiguang.commons.A.a r0 = cn.jiguang.commons.A.a.d.a
                return r0
        }
    }

    private static class e {
        final java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        final java.lang.String f754b;

        e(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.f754b = r2
                return
        }
    }

    static {
            java.lang.String r0 = cn.jiguang.commons.a.d.a.o
            cn.jiguang.commons.A.a.p = r0
            java.lang.String r0 = cn.jiguang.commons.a.d.a.p
            cn.jiguang.commons.A.a.q = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            cn.jiguang.commons.A.a.r = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            cn.jiguang.commons.A.a.s = r0
            r1 = 1100(0x44c, float:1.541E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "11"
            r0.put(r1, r2)
            r1 = 1500(0x5dc, float:2.102E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "6"
            r0.put(r1, r2)
            r1 = 1502(0x5de, float:2.105E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "7"
            r0.put(r1, r2)
            r1 = 1505(0x5e1, float:2.109E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "9"
            r0.put(r1, r2)
            r1 = 1501(0x5dd, float:2.103E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "8"
            r0.put(r1, r2)
            r1 = 1614(0x64e, float:2.262E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "14"
            r0.put(r1, r2)
            r1 = 1104(0x450, float:1.547E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "18"
            r0.put(r1, r2)
            r1 = 1112(0x458, float:1.558E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "19"
            r0.put(r1, r2)
            return
    }

    private a() {
            r4 = this;
            r4.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 1
            r0.<init>(r1)
            r4.f745c = r0
            java.util.concurrent.ConcurrentLinkedQueue r0 = new java.util.concurrent.ConcurrentLinkedQueue
            r0.<init>()
            r4.f746d = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 0
            r0.<init>(r1)
            r4.f747e = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r4.f748f = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r2 = 0
            r0.<init>(r2)
            r4.f749g = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>(r1)
            r4.f750h = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r4.f752j = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            r4.f753k = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>(r1)
            r4.l = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>(r1)
            r4.m = r0
            cn.jiguang.commons.A.a$a r0 = new cn.jiguang.commons.A.a$a
            r0.<init>(r4)
            r4.n = r0
            cn.jiguang.commons.A.a$b r0 = new cn.jiguang.commons.A.a$b
            r0.<init>(r4)
            r4.o = r0
            android.content.Context r0 = cn.jiguang.commons.L.h.a()
            r4.a = r0
            return
    }

    /* synthetic */ a(cn.jiguang.commons.A.a.RunnableC0020a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ java.lang.String a() {
            java.lang.String r0 = cn.jiguang.commons.A.a.p
            return r0
    }

    private java.lang.String a(org.json.JSONObject r7) {
            r6 = this;
            java.lang.String r0 = ""
            if (r7 == 0) goto L5b
            int r1 = r7.length()
            if (r1 != 0) goto Lb
            goto L5b
        Lb:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.util.Iterator r2 = r7.keys()     // Catch: java.lang.Throwable -> L29
            r3 = 1
        L15:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L29
            if (r4 == 0) goto L3c
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L29
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L29
            if (r3 != 0) goto L2b
            java.lang.String r3 = "&"
            r1.append(r3)     // Catch: java.lang.Throwable -> L29
            goto L2b
        L29:
            r7 = move-exception
            goto L41
        L2b:
            r3 = 0
            int r5 = r7.optInt(r4, r3)     // Catch: java.lang.Throwable -> L29
            r1.append(r4)     // Catch: java.lang.Throwable -> L29
            java.lang.String r4 = "_"
            r1.append(r4)     // Catch: java.lang.Throwable -> L29
            r1.append(r5)     // Catch: java.lang.Throwable -> L29
            goto L15
        L3c:
            java.lang.String r7 = r1.toString()     // Catch: java.lang.Throwable -> L29
            return r7
        L41:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "convert stats err: "
            r1.append(r2)
            java.lang.String r7 = r7.getMessage()
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            java.lang.String r1 = "JEXS"
            cn.jiguang.commons.w.a.f(r1, r7)
        L5b:
            return r0
    }

    static /* synthetic */ java.util.concurrent.ScheduledFuture a(cn.jiguang.commons.A.a r0, java.util.concurrent.ScheduledFuture r1) {
            r0.f751i = r1
            return r1
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicBoolean a(cn.jiguang.commons.A.a r0) {
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f753k
            return r0
    }

    private org.json.JSONObject a(java.util.HashMap r11) {
            r10 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            if (r11 == 0) goto L97
            boolean r1 = r11.isEmpty()
            if (r1 == 0) goto Lf
            goto L97
        Lf:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L6c
            r1.<init>()     // Catch: java.lang.Throwable -> L6c
            java.util.Set r2 = r11.keySet()     // Catch: java.lang.Throwable -> L6c
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L6c
        L1c:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L6c
            if (r3 == 0) goto L77
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L6c
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r4 = r11.get(r3)     // Catch: java.lang.Throwable -> L6c
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch: java.lang.Throwable -> L6c
            if (r4 == 0) goto L1c
            boolean r5 = r4.isEmpty()     // Catch: java.lang.Throwable -> L6c
            if (r5 == 0) goto L37
            goto L1c
        L37:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L6c
            r5.<init>()     // Catch: java.lang.Throwable -> L6c
            java.lang.String r6 = "exception_type"
            r5.put(r6, r3)     // Catch: java.lang.Throwable -> L6c
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L6c
            r3.<init>()     // Catch: java.lang.Throwable -> L6c
            java.util.Set r6 = r4.keySet()     // Catch: java.lang.Throwable -> L6c
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L6c
        L4e:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> L6c
            if (r7 == 0) goto L6e
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L6c
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r8 = r4.get(r7)     // Catch: java.lang.Throwable -> L6c
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch: java.lang.Throwable -> L6c
            if (r8 == 0) goto L4e
            int r9 = r8.intValue()     // Catch: java.lang.Throwable -> L6c
            if (r9 <= 0) goto L4e
            r3.put(r7, r8)     // Catch: java.lang.Throwable -> L6c
            goto L4e
        L6c:
            r11 = move-exception
            goto L7d
        L6e:
            java.lang.String r4 = "stats"
            r5.put(r4, r3)     // Catch: java.lang.Throwable -> L6c
            r1.put(r5)     // Catch: java.lang.Throwable -> L6c
            goto L1c
        L77:
            java.lang.String r11 = "data"
            r0.put(r11, r1)     // Catch: java.lang.Throwable -> L6c
            return r0
        L7d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "convert map to json err: "
            r1.append(r2)
            java.lang.String r11 = r11.getMessage()
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            java.lang.String r1 = "JEXS"
            cn.jiguang.commons.w.a.f(r1, r11)
        L97:
            return r0
    }

    private void a(int r1, int r2, long r3) {
            r0 = this;
            java.util.concurrent.atomic.AtomicBoolean r2 = r0.f753k
            r3 = 1
            r4 = 0
            boolean r2 = r2.compareAndSet(r4, r3)
            if (r2 != 0) goto Lb
            return
        Lb:
            java.lang.Object r2 = r0.f752j
            monitor-enter(r2)
            java.util.concurrent.ScheduledFuture r3 = r0.f751i     // Catch: java.lang.Throwable -> L23
            if (r3 == 0) goto L25
            java.util.concurrent.ScheduledFuture r3 = r0.f751i     // Catch: java.lang.Throwable -> L23
            boolean r3 = r3.isDone()     // Catch: java.lang.Throwable -> L23
            if (r3 != 0) goto L25
            java.util.concurrent.ScheduledFuture r3 = r0.f751i     // Catch: java.lang.Throwable -> L23
            r3.cancel(r4)     // Catch: java.lang.Throwable -> L23
            r3 = 0
            r0.f751i = r3     // Catch: java.lang.Throwable -> L23
            goto L25
        L23:
            r1 = move-exception
            goto L48
        L25:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L23
            cn.jiguang.commons.C.a r2 = cn.jiguang.commons.C.a.c()
            java.lang.Runnable r3 = r0.n
            cn.jiguang.commons.C.a$g r4 = cn.jiguang.commons.C.a.g.f772e
            r2.a(r3, r4)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "trigger save, qsize:"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "JEXS"
            cn.jiguang.commons.w.a.a(r2, r1)
            return
        L48:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L23
            throw r1
    }

    private void a(long r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r2.f750h
            r1 = 0
            r0.set(r1)
            java.util.concurrent.atomic.AtomicLong r0 = r2.f749g
            r0.set(r3)
            return
    }

    static /* synthetic */ void a(cn.jiguang.commons.A.a r0, int r1, int r2, long r3) {
            r0.a(r1, r2, r3)
            return
    }

    static /* synthetic */ void a(cn.jiguang.commons.A.a r0, java.util.List r1) {
            r0.a(r1)
            return
    }

    static /* synthetic */ void a(cn.jiguang.commons.A.a r0, org.json.JSONArray r1) {
            r0.a(r1)
            return
    }

    private void a(java.util.List r13) {
            r12 = this;
            java.lang.String r0 = "JEXS"
            if (r13 == 0) goto L1d9
            boolean r1 = r13.isEmpty()
            if (r1 == 0) goto Lc
            goto L1d9
        Lc:
            java.util.HashMap r1 = r12.e()     // Catch: java.lang.Throwable -> L40
            java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.Throwable -> L40
            r2.<init>()     // Catch: java.lang.Throwable -> L40
            java.util.Set r3 = r1.keySet()     // Catch: java.lang.Throwable -> L40
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L40
        L1d:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L40
            if (r4 == 0) goto L43
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L40
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L40
            java.lang.Object r5 = r1.get(r4)     // Catch: java.lang.Throwable -> L40
            java.util.HashMap r5 = (java.util.HashMap) r5     // Catch: java.lang.Throwable -> L40
            if (r5 == 0) goto L1d
            boolean r6 = r5.isEmpty()     // Catch: java.lang.Throwable -> L40
            if (r6 != 0) goto L1d
            java.util.HashMap r6 = new java.util.HashMap     // Catch: java.lang.Throwable -> L40
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L40
            r2.put(r4, r6)     // Catch: java.lang.Throwable -> L40
            goto L1d
        L40:
            r13 = move-exception
            goto L1c1
        L43:
            java.util.Iterator r1 = r13.iterator()     // Catch: java.lang.Throwable -> L40
            r3 = 0
            r4 = 0
            r5 = 0
        L4a:
            boolean r6 = r1.hasNext()     // Catch: java.lang.Throwable -> L40
            r7 = 1
            if (r6 == 0) goto L97
            java.lang.Object r6 = r1.next()     // Catch: java.lang.Throwable -> L40
            cn.jiguang.commons.A.a$e r6 = (cn.jiguang.commons.A.a.e) r6     // Catch: java.lang.Throwable -> L40
            if (r6 != 0) goto L5a
            goto L94
        L5a:
            java.lang.String r8 = r6.a     // Catch: java.lang.Throwable -> L40
            java.lang.String r6 = r6.f754b     // Catch: java.lang.Throwable -> L40
            boolean r9 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L40
            if (r9 != 0) goto L94
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L40
            if (r9 == 0) goto L6b
            goto L94
        L6b:
            int r4 = r4 + 1
            java.lang.Object r9 = r2.get(r6)     // Catch: java.lang.Throwable -> L40
            java.util.HashMap r9 = (java.util.HashMap) r9     // Catch: java.lang.Throwable -> L40
            if (r9 != 0) goto L7d
            java.util.HashMap r9 = new java.util.HashMap     // Catch: java.lang.Throwable -> L40
            r9.<init>()     // Catch: java.lang.Throwable -> L40
            r2.put(r6, r9)     // Catch: java.lang.Throwable -> L40
        L7d:
            java.lang.Object r6 = r9.get(r8)     // Catch: java.lang.Throwable -> L40
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: java.lang.Throwable -> L40
            if (r6 == 0) goto L8a
            int r6 = r6.intValue()     // Catch: java.lang.Throwable -> L40
            goto L8b
        L8a:
            r6 = 0
        L8b:
            int r6 = r6 + r7
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L40
            r9.put(r8, r6)     // Catch: java.lang.Throwable -> L40
            goto L4a
        L94:
            int r5 = r5 + 1
            goto L4a
        L97:
            if (r4 != 0) goto L9b
            goto L1d9
        L9b:
            org.json.JSONObject r1 = r12.a(r2)     // Catch: java.lang.Throwable -> L40
            int r6 = r13.size()     // Catch: java.lang.Throwable -> L40
            java.util.HashMap r8 = new java.util.HashMap     // Catch: java.lang.Throwable -> L40
            r8.<init>()     // Catch: java.lang.Throwable -> L40
            java.util.Iterator r9 = r13.iterator()     // Catch: java.lang.Throwable -> L40
        Lac:
            boolean r10 = r9.hasNext()     // Catch: java.lang.Throwable -> L40
            if (r10 == 0) goto Ldd
            java.lang.Object r10 = r9.next()     // Catch: java.lang.Throwable -> L40
            cn.jiguang.commons.A.a$e r10 = (cn.jiguang.commons.A.a.e) r10     // Catch: java.lang.Throwable -> L40
            if (r10 == 0) goto Lac
            java.lang.String r11 = r10.f754b     // Catch: java.lang.Throwable -> L40
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> L40
            if (r11 != 0) goto Lac
            java.lang.String r11 = r10.f754b     // Catch: java.lang.Throwable -> L40
            java.lang.Object r11 = r8.get(r11)     // Catch: java.lang.Throwable -> L40
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch: java.lang.Throwable -> L40
            java.lang.String r10 = r10.f754b     // Catch: java.lang.Throwable -> L40
            if (r11 != 0) goto Ld0
            r11 = 1
            goto Ld5
        Ld0:
            int r11 = r11.intValue()     // Catch: java.lang.Throwable -> L40
            int r11 = r11 + r7
        Ld5:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> L40
            r8.put(r10, r11)     // Catch: java.lang.Throwable -> L40
            goto Lac
        Ldd:
            java.lang.String r7 = cn.jiguang.commons.A.a.p     // Catch: java.lang.Throwable -> L40
            boolean r1 = cn.jiguang.commons.L.m.a(r7, r1)     // Catch: java.lang.Throwable -> L40
            java.lang.String r7 = ", invalid:"
            java.lang.String r8 = ", valid:"
            if (r1 == 0) goto L135
            java.util.concurrent.atomic.AtomicReference r13 = r12.f748f     // Catch: java.lang.Throwable -> L40
            r13.set(r2)     // Catch: java.lang.Throwable -> L40
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L40
            r13.<init>()     // Catch: java.lang.Throwable -> L40
            java.lang.String r1 = "save ok, poll:"
            r13.append(r1)     // Catch: java.lang.Throwable -> L40
            r13.append(r6)     // Catch: java.lang.Throwable -> L40
            r13.append(r8)     // Catch: java.lang.Throwable -> L40
            r13.append(r4)     // Catch: java.lang.Throwable -> L40
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L40
            if (r5 <= 0) goto L119
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L40
            r1.<init>()     // Catch: java.lang.Throwable -> L40
            r1.append(r13)     // Catch: java.lang.Throwable -> L40
            r1.append(r7)     // Catch: java.lang.Throwable -> L40
            r1.append(r5)     // Catch: java.lang.Throwable -> L40
            java.lang.String r13 = r1.toString()     // Catch: java.lang.Throwable -> L40
        L119:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L40
            r1.<init>()     // Catch: java.lang.Throwable -> L40
            r1.append(r13)     // Catch: java.lang.Throwable -> L40
            java.lang.String r13 = ", final size= :"
            r1.append(r13)     // Catch: java.lang.Throwable -> L40
            int r13 = r2.size()     // Catch: java.lang.Throwable -> L40
            r1.append(r13)     // Catch: java.lang.Throwable -> L40
            java.lang.String r13 = r1.toString()     // Catch: java.lang.Throwable -> L40
            cn.jiguang.commons.w.a.a(r0, r13)     // Catch: java.lang.Throwable -> L40
            return
        L135:
            java.util.Iterator r13 = r13.iterator()     // Catch: java.lang.Throwable -> L40
        L139:
            boolean r1 = r13.hasNext()     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L167
            java.lang.Object r1 = r13.next()     // Catch: java.lang.Throwable -> L40
            cn.jiguang.commons.A.a$e r1 = (cn.jiguang.commons.A.a.e) r1     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L139
            java.lang.String r2 = r1.f754b     // Catch: java.lang.Throwable -> L40
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L40
            if (r2 != 0) goto L139
            java.lang.String r2 = r1.a     // Catch: java.lang.Throwable -> L40
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L40
            if (r2 != 0) goto L139
            java.util.concurrent.ConcurrentLinkedQueue r2 = r12.f746d     // Catch: java.lang.Throwable -> L40
            boolean r1 = r2.offer(r1)     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L139
            int r3 = r3 + 1
            java.util.concurrent.atomic.AtomicInteger r1 = r12.f747e     // Catch: java.lang.Throwable -> L40
            r1.incrementAndGet()     // Catch: java.lang.Throwable -> L40
            goto L139
        L167:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L40
            r13.<init>()     // Catch: java.lang.Throwable -> L40
            java.lang.String r1 = "save failed, poll:"
            r13.append(r1)     // Catch: java.lang.Throwable -> L40
            r13.append(r6)     // Catch: java.lang.Throwable -> L40
            r13.append(r8)     // Catch: java.lang.Throwable -> L40
            r13.append(r4)     // Catch: java.lang.Throwable -> L40
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L40
            if (r5 <= 0) goto L192
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L40
            r1.<init>()     // Catch: java.lang.Throwable -> L40
            r1.append(r13)     // Catch: java.lang.Throwable -> L40
            r1.append(r7)     // Catch: java.lang.Throwable -> L40
            r1.append(r5)     // Catch: java.lang.Throwable -> L40
            java.lang.String r13 = r1.toString()     // Catch: java.lang.Throwable -> L40
        L192:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L40
            r1.<init>()     // Catch: java.lang.Throwable -> L40
            r1.append(r13)     // Catch: java.lang.Throwable -> L40
            java.lang.String r13 = ", requeued:"
            r1.append(r13)     // Catch: java.lang.Throwable -> L40
            r1.append(r3)     // Catch: java.lang.Throwable -> L40
            java.lang.String r13 = r1.toString()     // Catch: java.lang.Throwable -> L40
            if (r3 >= r4) goto L1bd
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L40
            r1.<init>()     // Catch: java.lang.Throwable -> L40
            r1.append(r13)     // Catch: java.lang.Throwable -> L40
            java.lang.String r13 = ", requeue failed:"
            r1.append(r13)     // Catch: java.lang.Throwable -> L40
            int r4 = r4 - r3
            r1.append(r4)     // Catch: java.lang.Throwable -> L40
            java.lang.String r13 = r1.toString()     // Catch: java.lang.Throwable -> L40
        L1bd:
            cn.jiguang.commons.w.a.f(r0, r13)     // Catch: java.lang.Throwable -> L40
            return
        L1c1:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "process data err: "
            r1.append(r2)
            java.lang.String r13 = r13.getMessage()
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            cn.jiguang.commons.w.a.f(r0, r13)
        L1d9:
            return
    }

    private void a(org.json.JSONArray r6) {
            r5 = this;
            java.lang.String r0 = "stats"
            if (r6 != 0) goto L5
            goto L31
        L5:
            r1 = 0
        L6:
            int r2 = r6.length()     // Catch: java.lang.Throwable -> L2c
            if (r1 >= r2) goto L31
            org.json.JSONObject r2 = r6.optJSONObject(r1)     // Catch: java.lang.Throwable -> L2c
            if (r2 != 0) goto L13
            goto L2e
        L13:
            org.json.JSONObject r3 = r2.optJSONObject(r0)     // Catch: java.lang.Throwable -> L2c
            if (r3 == 0) goto L2e
            int r4 = r3.length()     // Catch: java.lang.Throwable -> L2c
            if (r4 <= 0) goto L2e
            java.lang.String r4 = "result"
            java.lang.String r3 = r5.a(r3)     // Catch: java.lang.Throwable -> L2c
            r2.put(r4, r3)     // Catch: java.lang.Throwable -> L2c
            r2.remove(r0)     // Catch: java.lang.Throwable -> L2c
            goto L2e
        L2c:
            r6 = move-exception
            goto L32
        L2e:
            int r1 = r1 + 1
            goto L6
        L31:
            return
        L32:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "convert result err: "
            r0.append(r1)
            java.lang.String r6 = r6.getMessage()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "JEXS"
            cn.jiguang.commons.w.a.f(r0, r6)
            return
    }

    static /* synthetic */ java.lang.String c() {
            java.lang.String r0 = cn.jiguang.commons.A.a.q
            return r0
    }

    private java.util.HashMap c(org.json.JSONObject r10) {
            r9 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            if (r10 != 0) goto L8
            goto L5d
        L8:
            java.lang.String r1 = "data"
            org.json.JSONArray r10 = r10.optJSONArray(r1)     // Catch: java.lang.Throwable -> L55
            if (r10 != 0) goto L11
            goto L5d
        L11:
            r1 = 0
            r2 = 0
        L13:
            int r3 = r10.length()     // Catch: java.lang.Throwable -> L55
            if (r2 >= r3) goto L5d
            org.json.JSONObject r3 = r10.optJSONObject(r2)     // Catch: java.lang.Throwable -> L55
            if (r3 != 0) goto L20
            goto L5a
        L20:
            java.lang.String r4 = "exception_type"
            java.lang.String r4 = r3.optString(r4)     // Catch: java.lang.Throwable -> L55
            java.lang.String r5 = "stats"
            org.json.JSONObject r3 = r3.optJSONObject(r5)     // Catch: java.lang.Throwable -> L55
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L55
            if (r5 != 0) goto L5a
            if (r3 == 0) goto L5a
            java.util.HashMap r5 = new java.util.HashMap     // Catch: java.lang.Throwable -> L55
            r5.<init>()     // Catch: java.lang.Throwable -> L55
            java.util.Iterator r6 = r3.keys()     // Catch: java.lang.Throwable -> L55
        L3d:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> L55
            if (r7 == 0) goto L57
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L55
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L55
            int r8 = r3.optInt(r7, r1)     // Catch: java.lang.Throwable -> L55
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L55
            r5.put(r7, r8)     // Catch: java.lang.Throwable -> L55
            goto L3d
        L55:
            r10 = move-exception
            goto L5e
        L57:
            r0.put(r4, r5)     // Catch: java.lang.Throwable -> L55
        L5a:
            int r2 = r2 + 1
            goto L13
        L5d:
            return r0
        L5e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "extract data map err: "
            r1.append(r2)
            java.lang.String r10 = r10.getMessage()
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            java.lang.String r1 = "JEXS"
            cn.jiguang.commons.w.a.f(r1, r10)
            return r0
    }

    static /* synthetic */ java.util.concurrent.ConcurrentLinkedQueue c(cn.jiguang.commons.A.a r0) {
            java.util.concurrent.ConcurrentLinkedQueue r0 = r0.f746d
            return r0
    }

    static /* synthetic */ java.lang.Object d(cn.jiguang.commons.A.a r0) {
            java.lang.Object r0 = r0.f752j
            return r0
    }

    static /* synthetic */ java.lang.Runnable e(cn.jiguang.commons.A.a r0) {
            java.lang.Runnable r0 = r0.n
            return r0
    }

    private java.util.HashMap e() {
            r3 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r3.f748f
            java.lang.Object r0 = r0.get()
            java.util.HashMap r0 = (java.util.HashMap) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            java.lang.String r0 = cn.jiguang.commons.A.a.p     // Catch: java.lang.Throwable -> L19
            org.json.JSONObject r0 = cn.jiguang.commons.L.m.i(r0)     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto L1b
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L19
            r0.<init>()     // Catch: java.lang.Throwable -> L19
            goto L1b
        L19:
            r0 = move-exception
            goto L25
        L1b:
            java.util.HashMap r0 = r3.c(r0)     // Catch: java.lang.Throwable -> L19
            java.util.concurrent.atomic.AtomicReference r1 = r3.f748f     // Catch: java.lang.Throwable -> L19
            r1.set(r0)     // Catch: java.lang.Throwable -> L19
            return r0
        L25:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "get cache err: "
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "JEXS"
            cn.jiguang.commons.w.a.f(r1, r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.concurrent.atomic.AtomicReference r1 = r3.f748f
            r1.set(r0)
            return r0
    }

    public static cn.jiguang.commons.A.a f() {
            cn.jiguang.commons.A.a r0 = cn.jiguang.commons.A.a.d.a()
            return r0
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicInteger f(cn.jiguang.commons.A.a r0) {
            java.util.concurrent.atomic.AtomicInteger r0 = r0.f747e
            return r0
    }

    static /* synthetic */ void g(cn.jiguang.commons.A.a r0) {
            r0.h()
            return
    }

    private boolean g() {
            r1 = this;
            java.lang.ThreadLocal r0 = cn.jiguang.commons.A.a.r
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L12
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicInteger h(cn.jiguang.commons.A.a r0) {
            java.util.concurrent.atomic.AtomicInteger r0 = r0.m
            return r0
    }

    private void h() {
            r6 = this;
            java.lang.Object r0 = r6.f752j
            monitor-enter(r0)
            java.util.concurrent.ScheduledFuture r1 = r6.f751i     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L13
            java.util.concurrent.ScheduledFuture r1 = r6.f751i     // Catch: java.lang.Throwable -> L11
            boolean r1 = r1.isDone()     // Catch: java.lang.Throwable -> L11
            if (r1 != 0) goto L13
        Lf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L11:
            r1 = move-exception
            goto L30
        L13:
            java.util.concurrent.atomic.AtomicBoolean r1 = r6.f753k     // Catch: java.lang.Throwable -> L11
            boolean r1 = r1.get()     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L1c
            goto Lf
        L1c:
            cn.jiguang.commons.C.a r1 = cn.jiguang.commons.C.a.c()     // Catch: java.lang.Throwable -> L11
            cn.jiguang.commons.A.a$c r2 = new cn.jiguang.commons.A.a$c     // Catch: java.lang.Throwable -> L11
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L11
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L11
            r4 = 100
            java.util.concurrent.ScheduledFuture r1 = r1.a(r2, r4, r3)     // Catch: java.lang.Throwable -> L11
            r6.f751i = r1     // Catch: java.lang.Throwable -> L11
            goto Lf
        L30:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1
    }

    private boolean i() {
            r7 = this;
            java.lang.String r0 = "JEXS"
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L3f
            android.content.Context r2 = r7.a     // Catch: java.lang.Throwable -> L3f
            java.io.File r2 = r2.getFilesDir()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r3 = cn.jiguang.commons.A.a.p     // Catch: java.lang.Throwable -> L3f
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L3f
            boolean r2 = r1.exists()     // Catch: java.lang.Throwable -> L3f
            if (r2 == 0) goto L58
            long r2 = r1.length()     // Catch: java.lang.Throwable -> L3f
            r4 = 524288(0x80000, double:2.590327E-318)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L58
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3f
            r2.<init>()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r3 = "data too large: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L3f
            long r3 = r1.length()     // Catch: java.lang.Throwable -> L3f
            r2.append(r3)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r1 = " bytes, force report"
            r2.append(r1)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L3f
            cn.jiguang.commons.w.a.f(r0, r1)     // Catch: java.lang.Throwable -> L3f
            r0 = 1
            return r0
        L3f:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "check file size err: "
            r2.append(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            cn.jiguang.commons.w.a.f(r0, r1)
        L58:
            r0 = 0
            return r0
    }

    private boolean j() {
            r9 = this;
            java.lang.String r0 = "JEXS"
            r1 = 0
            cn.jiguang.commons.f.j r2 = cn.jiguang.commons.f.j.j()     // Catch: java.lang.Exception -> L28
            r3 = 3101(0xc1d, float:4.345E-42)
            cn.jiguang.commons.c.i r2 = r2.a(r3)     // Catch: java.lang.Exception -> L28
            if (r2 != 0) goto L10
            return r1
        L10:
            long r3 = cn.jiguang.commons.a.c.c(r0)     // Catch: java.lang.Exception -> L28
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L28
            long r7 = r2.j()     // Catch: java.lang.Exception -> L28
            long r5 = r5 - r3
            long r2 = java.lang.Math.abs(r5)     // Catch: java.lang.Exception -> L28
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 < 0) goto L27
            r0 = 1
            return r0
        L27:
            return r1
        L28:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "check report interval error: "
            r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            cn.jiguang.commons.w.a.f(r0, r2)
            return r1
    }

    public void a(int r3, int r4) {
            r2 = this;
            java.util.HashMap r0 = cn.jiguang.commons.A.a.s
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r1 = r0.containsKey(r1)
            if (r1 == 0) goto L1d
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r3 = r0.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            r2.a(r4, r3)
        L1d:
            return
    }

    public void a(java.lang.Object r2) {
            r1 = this;
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "18"
            r1.a(r2, r0)
            return
    }

    public void a(java.lang.String r9, java.lang.String r10) {
            r8 = this;
            java.lang.String r0 = "JEXS"
            boolean r1 = android.text.TextUtils.isEmpty(r9)
            if (r1 != 0) goto Lc6
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            if (r1 == 0) goto L10
            goto Lc6
        L10:
            java.util.concurrent.atomic.AtomicBoolean r1 = r8.f745c     // Catch: java.lang.Throwable -> L1e
            boolean r1 = r1.get()     // Catch: java.lang.Throwable -> L1e
            if (r1 != 0) goto L21
            java.lang.String r9 = "stats disabled"
            cn.jiguang.commons.w.a.a(r0, r9)     // Catch: java.lang.Throwable -> L1e
            return
        L1e:
            r9 = move-exception
            goto Lae
        L21:
            cn.jiguang.commons.A.a$e r1 = new cn.jiguang.commons.A.a$e     // Catch: java.lang.Throwable -> L1e
            r1.<init>(r9, r10)     // Catch: java.lang.Throwable -> L1e
            java.util.concurrent.ConcurrentLinkedQueue r9 = r8.f746d     // Catch: java.lang.Throwable -> L1e
            boolean r9 = r9.offer(r1)     // Catch: java.lang.Throwable -> L1e
            if (r9 != 0) goto L49
            java.util.concurrent.atomic.AtomicInteger r9 = r8.l     // Catch: java.lang.Throwable -> L1e
            int r9 = r9.incrementAndGet()     // Catch: java.lang.Throwable -> L1e
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1e
            r10.<init>()     // Catch: java.lang.Throwable -> L1e
            java.lang.String r1 = "queue offer failed, dropped:"
            r10.append(r1)     // Catch: java.lang.Throwable -> L1e
            r10.append(r9)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r9 = r10.toString()     // Catch: java.lang.Throwable -> L1e
            cn.jiguang.commons.w.a.f(r0, r9)     // Catch: java.lang.Throwable -> L1e
            return
        L49:
            java.util.concurrent.atomic.AtomicInteger r9 = r8.f747e     // Catch: java.lang.Throwable -> L1e
            int r9 = r9.incrementAndGet()     // Catch: java.lang.Throwable -> L1e
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L1e
            java.util.concurrent.atomic.AtomicLong r10 = r8.f749g     // Catch: java.lang.Throwable -> L1e
            long r3 = r10.get()     // Catch: java.lang.Throwable -> L1e
            long r3 = r1 - r3
            java.util.concurrent.atomic.AtomicInteger r10 = r8.f750h     // Catch: java.lang.Throwable -> L1e
            int r10 = r10.incrementAndGet()     // Catch: java.lang.Throwable -> L1e
            r5 = 1000(0x3e8, float:1.401E-42)
            if (r9 < r5) goto L98
            java.util.concurrent.atomic.AtomicInteger r6 = r8.m     // Catch: java.lang.Throwable -> L1e
            int r6 = r6.get()     // Catch: java.lang.Throwable -> L1e
            if (r9 == r5) goto L73
            int r5 = r9 % 5000
            if (r5 != 0) goto L94
            if (r9 == r6) goto L94
        L73:
            java.util.concurrent.atomic.AtomicInteger r5 = r8.m     // Catch: java.lang.Throwable -> L1e
            boolean r5 = r5.compareAndSet(r6, r9)     // Catch: java.lang.Throwable -> L1e
            if (r5 == 0) goto L94
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1e
            r5.<init>()     // Catch: java.lang.Throwable -> L1e
            java.lang.String r6 = "queue full, size: "
            r5.append(r6)     // Catch: java.lang.Throwable -> L1e
            r5.append(r9)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r6 = ", trigger save"
            r5.append(r6)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L1e
            cn.jiguang.commons.w.a.f(r0, r5)     // Catch: java.lang.Throwable -> L1e
        L94:
            r8.a(r9, r10, r3)     // Catch: java.lang.Throwable -> L1e
            goto Laa
        L98:
            r5 = 5
            if (r9 >= r5) goto L94
            r5 = 30
            if (r10 >= r5) goto L94
            r5 = 1000(0x3e8, double:4.94E-321)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto La6
            goto L94
        La6:
            r8.h()     // Catch: java.lang.Throwable -> L1e
            return
        Laa:
            r8.a(r1)     // Catch: java.lang.Throwable -> L1e
            return
        Lae:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r1 = "save data err: "
            r10.append(r1)
            java.lang.String r9 = r9.getMessage()
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            cn.jiguang.commons.w.a.f(r0, r9)
        Lc6:
            return
    }

    public void a(boolean r2) {
            r1 = this;
            java.lang.ThreadLocal r0 = cn.jiguang.commons.A.a.r
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.set(r2)
            return
    }

    public void c(java.lang.Object r2) {
            r1 = this;
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "19"
            r1.a(r2, r0)
            return
    }

    public void d() {
            r1 = this;
            java.lang.ThreadLocal r0 = cn.jiguang.commons.A.a.r
            r0.remove()
            return
    }

    public void d(java.lang.Object r2) {
            r1 = this;
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "11"
            r1.a(r2, r0)
            return
    }

    public void e(java.lang.Object r2) {
            r1 = this;
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "14"
            r1.a(r2, r0)
            return
    }

    public void f(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.g()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            if (r0 == 0) goto L10
            java.lang.String r0 = "16"
        Lc:
            r1.a(r2, r0)
            return
        L10:
            java.lang.String r0 = "8"
            goto Lc
    }

    public void g(java.lang.Object r2) {
            r1 = this;
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "16"
            r1.a(r2, r0)
            return
    }

    public void h(java.lang.Object r2) {
            r1 = this;
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "7"
            r1.a(r2, r0)
            return
    }

    public void i(java.lang.Object r2) {
            r1 = this;
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "17"
            r1.a(r2, r0)
            return
    }

    public void j(java.lang.Object r2) {
            r1 = this;
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "6"
            r1.a(r2, r0)
            return
    }

    public void k() {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f745c
            boolean r0 = r0.get()
            java.lang.String r1 = "JEXS"
            if (r0 != 0) goto L10
            java.lang.String r0 = "stats disabled, skip report"
            cn.jiguang.commons.w.a.a(r1, r0)
            return
        L10:
            boolean r0 = r3.j()
            boolean r2 = r3.i()
            if (r0 != 0) goto L1d
            if (r2 != 0) goto L1d
            return
        L1d:
            java.lang.String r0 = "start report"
            cn.jiguang.commons.w.a.a(r1, r0)
            cn.jiguang.commons.C.a r0 = cn.jiguang.commons.C.a.c()
            java.lang.Runnable r1 = r3.o
            cn.jiguang.commons.C.a$g r2 = cn.jiguang.commons.C.a.g.f771d
            r0.a(r1, r2)
            return
    }

    public void k(java.lang.Object r2) {
            r1 = this;
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "10"
            r1.a(r2, r0)
            return
    }

    public void l() {
            r3 = this;
            cn.jiguang.commons.f.j r0 = cn.jiguang.commons.f.j.j()     // Catch: java.lang.Throwable -> L15
            r1 = 3101(0xc1d, float:4.345E-42)
            cn.jiguang.commons.c.i r0 = r0.a(r1)     // Catch: java.lang.Throwable -> L15
            java.util.concurrent.atomic.AtomicBoolean r1 = r3.f745c     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            r1.set(r0)     // Catch: java.lang.Throwable -> L15
            return
        L15:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "update switch err: "
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "JEXS"
            cn.jiguang.commons.w.a.f(r1, r0)
            return
    }

    public void l(java.lang.Object r2) {
            r1 = this;
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "20"
            r1.a(r2, r0)
            return
    }

    public void m(java.lang.Object r2) {
            r1 = this;
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "4"
            r1.a(r2, r0)
            return
    }

    public void n(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.g()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            if (r0 == 0) goto L10
            java.lang.String r0 = "15"
        Lc:
            r1.a(r2, r0)
            return
        L10:
            java.lang.String r0 = "9"
            goto Lc
    }

    public void o(java.lang.Object r2) {
            r1 = this;
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "15"
            r1.a(r2, r0)
            return
    }
}
