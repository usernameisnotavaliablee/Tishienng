package cn.jiguang.commons.h;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class j {
    private final java.util.concurrent.atomic.AtomicLong a;

    /* renamed from: c, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicLong f1141c;

    /* renamed from: d, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicLong f1142d;

    /* renamed from: e, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicLong f1143e;

    /* renamed from: f, reason: collision with root package name */
    private final android.os.Handler f1144f;

    /* renamed from: g, reason: collision with root package name */
    private final android.os.Handler f1145g;

    /* renamed from: h, reason: collision with root package name */
    private final android.os.HandlerThread f1146h;

    /* renamed from: i, reason: collision with root package name */
    private final cn.jiguang.commons.C.a f1147i;

    /* renamed from: j, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f1148j;

    /* renamed from: k, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f1149k;
    private volatile long l;
    private volatile cn.jiguang.commons.h.j.k m;
    private volatile boolean n;
    private final java.lang.Runnable o;
    private final java.lang.Runnable p;
    private final java.lang.Runnable q;
    private final java.lang.Runnable r;
    private final java.lang.Runnable s;
    private final cn.jiguang.commons.h.j.i t;
    private final cn.jiguang.commons.h.j.h u;

    class a implements java.lang.Runnable {
        final /* synthetic */ cn.jiguang.commons.h.j a;

        a(cn.jiguang.commons.h.j r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                cn.jiguang.commons.h.j r0 = r1.a
                cn.jiguang.commons.h.j.a(r0)
                return
        }
    }

    class b implements java.lang.Runnable {
        final /* synthetic */ cn.jiguang.commons.h.j a;

        b(cn.jiguang.commons.h.j r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                java.lang.String r0 = "PeriodicTaskScheduler"
                cn.jiguang.commons.h.j r1 = r4.a     // Catch: java.lang.Exception -> L22
                cn.jiguang.commons.h.j$k r1 = cn.jiguang.commons.h.j.c(r1)     // Catch: java.lang.Exception -> L22
                if (r1 == 0) goto L39
                cn.jiguang.commons.h.j r1 = r4.a     // Catch: java.lang.Exception -> L22
                boolean r1 = cn.jiguang.commons.h.j.d(r1)     // Catch: java.lang.Exception -> L22
                if (r1 == 0) goto L24
                cn.jiguang.commons.h.j r1 = r4.a     // Catch: java.lang.Exception -> L22
                cn.jiguang.commons.C.a r1 = cn.jiguang.commons.h.j.f(r1)     // Catch: java.lang.Exception -> L22
                cn.jiguang.commons.h.j r2 = r4.a     // Catch: java.lang.Exception -> L22
                java.lang.Runnable r2 = cn.jiguang.commons.h.j.e(r2)     // Catch: java.lang.Exception -> L22
                r1.a(r2)     // Catch: java.lang.Exception -> L22
                goto L39
            L22:
                r1 = move-exception
                goto L44
            L24:
                cn.jiguang.commons.h.j r1 = r4.a     // Catch: java.lang.Exception -> L22
                android.os.Handler r1 = cn.jiguang.commons.h.j.g(r1)     // Catch: java.lang.Exception -> L22
                cn.jiguang.commons.h.j$g r2 = new cn.jiguang.commons.h.j$g     // Catch: java.lang.Exception -> L22
                java.lang.String r3 = "started"
                r2.<init>(r3)     // Catch: java.lang.Exception -> L22
                r3 = 4
                android.os.Message r1 = r1.obtainMessage(r3, r2)     // Catch: java.lang.Exception -> L22
                r1.sendToTarget()     // Catch: java.lang.Exception -> L22
            L39:
                java.lang.String r1 = "triggering first task immediately"
                cn.jiguang.commons.w.a.a(r0, r1)     // Catch: java.lang.Exception -> L22
                cn.jiguang.commons.h.j r1 = r4.a     // Catch: java.lang.Exception -> L22
                cn.jiguang.commons.h.j.a(r1)     // Catch: java.lang.Exception -> L22
                return
            L44:
                java.lang.String r2 = "err in startTaskInternal"
                cn.jiguang.commons.w.a.a(r0, r2, r1)
                cn.jiguang.commons.h.j r0 = r4.a
                java.util.concurrent.atomic.AtomicBoolean r0 = cn.jiguang.commons.h.j.h(r0)
                r1 = 0
                r0.set(r1)
                return
        }
    }

    class c implements java.lang.Runnable {
        final /* synthetic */ cn.jiguang.commons.h.j a;

        c(cn.jiguang.commons.h.j r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                cn.jiguang.commons.h.j r0 = r3.a     // Catch: java.lang.Exception -> L20
                cn.jiguang.commons.h.j$k r0 = cn.jiguang.commons.h.j.c(r0)     // Catch: java.lang.Exception -> L20
                if (r0 == 0) goto L37
                cn.jiguang.commons.h.j r0 = r3.a     // Catch: java.lang.Exception -> L20
                boolean r0 = cn.jiguang.commons.h.j.d(r0)     // Catch: java.lang.Exception -> L20
                if (r0 == 0) goto L22
                cn.jiguang.commons.h.j r0 = r3.a     // Catch: java.lang.Exception -> L20
                cn.jiguang.commons.C.a r0 = cn.jiguang.commons.h.j.f(r0)     // Catch: java.lang.Exception -> L20
                cn.jiguang.commons.h.j r1 = r3.a     // Catch: java.lang.Exception -> L20
                java.lang.Runnable r1 = cn.jiguang.commons.h.j.i(r1)     // Catch: java.lang.Exception -> L20
                r0.a(r1)     // Catch: java.lang.Exception -> L20
                goto L37
            L20:
                r0 = move-exception
                goto L42
            L22:
                cn.jiguang.commons.h.j r0 = r3.a     // Catch: java.lang.Exception -> L20
                android.os.Handler r0 = cn.jiguang.commons.h.j.g(r0)     // Catch: java.lang.Exception -> L20
                cn.jiguang.commons.h.j$g r1 = new cn.jiguang.commons.h.j$g     // Catch: java.lang.Exception -> L20
                java.lang.String r2 = "stopped"
                r1.<init>(r2)     // Catch: java.lang.Exception -> L20
                r2 = 4
                android.os.Message r0 = r0.obtainMessage(r2, r1)     // Catch: java.lang.Exception -> L20
                r0.sendToTarget()     // Catch: java.lang.Exception -> L20
            L37:
                cn.jiguang.commons.h.j r0 = r3.a     // Catch: java.lang.Exception -> L20
                android.os.Handler r0 = cn.jiguang.commons.h.j.j(r0)     // Catch: java.lang.Exception -> L20
                r1 = 0
                r0.removeCallbacksAndMessages(r1)     // Catch: java.lang.Exception -> L20
                return
            L42:
                java.lang.String r1 = "PeriodicTaskScheduler"
                java.lang.String r2 = "err in stopTaskInternal"
                cn.jiguang.commons.w.a.a(r1, r2, r0)
                return
        }
    }

    class d implements java.lang.Runnable {
        final /* synthetic */ cn.jiguang.commons.h.j a;

        d(cn.jiguang.commons.h.j r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                cn.jiguang.commons.h.j r0 = r3.a     // Catch: java.lang.Exception -> L12
                cn.jiguang.commons.h.j$k r0 = cn.jiguang.commons.h.j.c(r0)     // Catch: java.lang.Exception -> L12
                if (r0 == 0) goto L14
                cn.jiguang.commons.h.j r0 = r3.a     // Catch: java.lang.Exception -> L12
                cn.jiguang.commons.h.j$k r0 = cn.jiguang.commons.h.j.c(r0)     // Catch: java.lang.Exception -> L12
                r0.c()     // Catch: java.lang.Exception -> L12
                return
            L12:
                r0 = move-exception
                goto L15
            L14:
                return
            L15:
                java.lang.String r1 = "PeriodicTaskScheduler"
                java.lang.String r2 = "err in started callback"
                cn.jiguang.commons.w.a.a(r1, r2, r0)
                return
        }
    }

    class e implements java.lang.Runnable {
        final /* synthetic */ cn.jiguang.commons.h.j a;

        e(cn.jiguang.commons.h.j r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                cn.jiguang.commons.h.j r0 = r3.a     // Catch: java.lang.Exception -> L12
                cn.jiguang.commons.h.j$k r0 = cn.jiguang.commons.h.j.c(r0)     // Catch: java.lang.Exception -> L12
                if (r0 == 0) goto L14
                cn.jiguang.commons.h.j r0 = r3.a     // Catch: java.lang.Exception -> L12
                cn.jiguang.commons.h.j$k r0 = cn.jiguang.commons.h.j.c(r0)     // Catch: java.lang.Exception -> L12
                r0.a()     // Catch: java.lang.Exception -> L12
                return
            L12:
                r0 = move-exception
                goto L15
            L14:
                return
            L15:
                java.lang.String r1 = "PeriodicTaskScheduler"
                java.lang.String r2 = "err in stopped callback"
                cn.jiguang.commons.w.a.a(r1, r2, r0)
                return
        }
    }

    class f extends android.os.Handler {
        final /* synthetic */ cn.jiguang.commons.h.j a;

        f(cn.jiguang.commons.h.j r1, android.os.Looper r2) {
                r0 = this;
                r0.a = r1
                r0.<init>(r2)
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r2) {
                r1 = this;
                cn.jiguang.commons.h.j r0 = r1.a
                cn.jiguang.commons.h.j.a(r0, r2)
                return
        }
    }

    private static final class g {
        final java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        final long f1150b;

        /* renamed from: c, reason: collision with root package name */
        final java.lang.String f1151c;

        g(java.lang.String r3) {
                r2 = this;
                r2.<init>()
                r2.a = r3
                r0 = 0
                r2.f1150b = r0
                r3 = 0
                r2.f1151c = r3
                return
        }

        g(java.lang.String r1, long r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.f1150b = r2
                r1 = 0
                r0.f1151c = r1
                return
        }

        g(java.lang.String r3, java.lang.String r4) {
                r2 = this;
                r2.<init>()
                r2.a = r3
                r0 = 0
                r2.f1150b = r0
                r2.f1151c = r4
                return
        }
    }

    private final class h implements java.lang.Runnable {
        final /* synthetic */ cn.jiguang.commons.h.j a;

        /* renamed from: b, reason: collision with root package name */
        private java.lang.String f1152b;

        private h(cn.jiguang.commons.h.j r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ h(cn.jiguang.commons.h.j r1, cn.jiguang.commons.h.j.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        void a(java.lang.String r1) {
                r0 = this;
                r0.f1152b = r1
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                cn.jiguang.commons.h.j r0 = r3.a     // Catch: java.lang.Exception -> L14
                cn.jiguang.commons.h.j$k r0 = cn.jiguang.commons.h.j.c(r0)     // Catch: java.lang.Exception -> L14
                if (r0 == 0) goto L16
                cn.jiguang.commons.h.j r0 = r3.a     // Catch: java.lang.Exception -> L14
                cn.jiguang.commons.h.j$k r0 = cn.jiguang.commons.h.j.c(r0)     // Catch: java.lang.Exception -> L14
                java.lang.String r1 = r3.f1152b     // Catch: java.lang.Exception -> L14
                r0.a(r1)     // Catch: java.lang.Exception -> L14
                return
            L14:
                r0 = move-exception
                goto L17
            L16:
                return
            L17:
                java.lang.String r1 = "PeriodicTaskScheduler"
                java.lang.String r2 = "err in async error callback"
                cn.jiguang.commons.w.a.a(r1, r2, r0)
                return
        }
    }

    private final class i implements java.lang.Runnable {
        final /* synthetic */ cn.jiguang.commons.h.j a;

        /* renamed from: b, reason: collision with root package name */
        private long f1153b;

        private i(cn.jiguang.commons.h.j r3) {
                r2 = this;
                r2.a = r3
                r2.<init>()
                r0 = 0
                r2.f1153b = r0
                return
        }

        /* synthetic */ i(cn.jiguang.commons.h.j r1, cn.jiguang.commons.h.j.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        void a(long r1) {
                r0 = this;
                r0.f1153b = r1
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                java.lang.String r0 = "PeriodicTaskScheduler"
                java.lang.String r1 = "executing async task callback"
                cn.jiguang.commons.w.a.a(r0, r1)     // Catch: java.lang.Exception -> L18
                cn.jiguang.commons.h.j r1 = r4.a     // Catch: java.lang.Exception -> L18
                cn.jiguang.commons.h.j$k r1 = cn.jiguang.commons.h.j.c(r1)     // Catch: java.lang.Exception -> L18
                long r2 = r4.f1153b     // Catch: java.lang.Exception -> L18
                r1.a(r2)     // Catch: java.lang.Exception -> L18
                java.lang.String r1 = "async task callback completed"
                cn.jiguang.commons.w.a.a(r0, r1)     // Catch: java.lang.Exception -> L18
                return
            L18:
                r1 = move-exception
                java.lang.String r2 = "err in async callback"
                cn.jiguang.commons.w.a.a(r0, r2, r1)
                cn.jiguang.commons.h.j r0 = r4.a
                java.util.concurrent.atomic.AtomicLong r0 = cn.jiguang.commons.h.j.k(r0)
                r0.incrementAndGet()
                cn.jiguang.commons.h.j r0 = r4.a
                cn.jiguang.commons.h.j$k r0 = cn.jiguang.commons.h.j.c(r0)
                if (r0 == 0) goto L4d
                cn.jiguang.commons.h.j r0 = r4.a
                cn.jiguang.commons.h.j$k r0 = cn.jiguang.commons.h.j.c(r0)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "async callback err: "
                r2.append(r3)
                java.lang.String r1 = r1.getMessage()
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                r0.a(r1)
            L4d:
                return
        }
    }

    public interface k {
        void a();

        void a(long r1);

        void a(java.lang.String r1);

        void c();
    }

    public j(long r4, boolean r6) {
            r3 = this;
            r3.<init>()
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 0
            r0.<init>(r1)
            r3.a = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>(r1)
            r3.f1141c = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>(r1)
            r3.f1142d = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>(r1)
            r3.f1143e = r0
            cn.jiguang.commons.h.j$a r0 = new cn.jiguang.commons.h.j$a
            r0.<init>(r3)
            r3.o = r0
            cn.jiguang.commons.h.j$b r0 = new cn.jiguang.commons.h.j$b
            r0.<init>(r3)
            r3.p = r0
            cn.jiguang.commons.h.j$c r0 = new cn.jiguang.commons.h.j$c
            r0.<init>(r3)
            r3.q = r0
            cn.jiguang.commons.h.j$d r0 = new cn.jiguang.commons.h.j$d
            r0.<init>(r3)
            r3.r = r0
            cn.jiguang.commons.h.j$e r0 = new cn.jiguang.commons.h.j$e
            r0.<init>(r3)
            r3.s = r0
            cn.jiguang.commons.h.j$i r0 = new cn.jiguang.commons.h.j$i
            r1 = 0
            r0.<init>(r3, r1)
            r3.t = r0
            cn.jiguang.commons.h.j$h r0 = new cn.jiguang.commons.h.j$h
            r0.<init>(r3, r1)
            r3.u = r0
            long r4 = r3.c(r4)
            r3.l = r4
            r3.n = r6
            java.util.concurrent.atomic.AtomicBoolean r4 = new java.util.concurrent.atomic.AtomicBoolean
            r5 = 0
            r4.<init>(r5)
            r3.f1148j = r4
            java.util.concurrent.atomic.AtomicBoolean r4 = new java.util.concurrent.atomic.AtomicBoolean
            r4.<init>(r5)
            r3.f1149k = r4
            android.os.Handler r4 = r3.c()
            r3.f1144f = r4
            android.os.HandlerThread r4 = r3.a()
            r3.f1146h = r4
            android.os.Handler r5 = new android.os.Handler
            android.os.Looper r4 = r4.getLooper()
            r5.<init>(r4)
            r3.f1145g = r5
            cn.jiguang.commons.C.a r4 = cn.jiguang.commons.C.a.c()
            r3.f1147i = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "PeriodicTaskScheduler initialized with interval: "
            r4.append(r5)
            long r5 = r3.l
            r4.append(r5)
            java.lang.String r5 = "ms"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "PeriodicTaskScheduler"
            cn.jiguang.commons.w.a.a(r5, r4)
            return
    }

    private android.os.HandlerThread a() {
            r2 = this;
            android.os.HandlerThread r0 = new android.os.HandlerThread
            java.lang.String r1 = "jg_c_hrt"
            r0.<init>(r1)
            r1 = 5
            r0.setPriority(r1)
            r0.start()
            return r0
    }

    private void a(long r4) {
            r3 = this;
            boolean r0 = r3.n
            if (r0 == 0) goto L11
            cn.jiguang.commons.h.j$i r0 = r3.t
            r0.a(r4)
            cn.jiguang.commons.C.a r4 = r3.f1147i
            cn.jiguang.commons.h.j$i r5 = r3.t
            r4.a(r5)
            return
        L11:
            java.lang.String r0 = "PeriodicTaskScheduler"
            java.lang.String r1 = "sending task callback to main thread"
            cn.jiguang.commons.w.a.a(r0, r1)
            android.os.Handler r0 = r3.f1144f
            cn.jiguang.commons.h.j$g r1 = new cn.jiguang.commons.h.j$g
            java.lang.String r2 = "task"
            r1.<init>(r2, r4)
            r4 = 4
            android.os.Message r4 = r0.obtainMessage(r4, r1)
            r4.sendToTarget()
            return
    }

    private void a(android.os.Message r4) {
            r3 = this;
            cn.jiguang.commons.h.j$k r0 = r3.m
            if (r0 != 0) goto L5
            goto L64
        L5:
            java.lang.Object r4 = r4.obj
            cn.jiguang.commons.h.j$g r4 = (cn.jiguang.commons.h.j.g) r4
            if (r4 != 0) goto Lc
            goto L64
        Lc:
            java.lang.String r0 = r4.a     // Catch: java.lang.Exception -> L37
            int r1 = r0.hashCode()     // Catch: java.lang.Exception -> L37
            r2 = -1897185151(0xffffffff8eeb4081, float:-5.7994088E-30)
            if (r1 == r2) goto L57
            r2 = -1884319283(0xffffffff8faf91cd, float:-1.7312493E-29)
            if (r1 == r2) goto L49
            r2 = 3552645(0x363585, float:4.978316E-39)
            if (r1 == r2) goto L39
            r2 = 96784904(0x5c4d208, float:1.8508905E-35)
            if (r1 == r2) goto L27
            goto L64
        L27:
            java.lang.String r1 = "error"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L37
            if (r0 == 0) goto L64
            cn.jiguang.commons.h.j$k r0 = r3.m     // Catch: java.lang.Exception -> L37
            java.lang.String r4 = r4.f1151c     // Catch: java.lang.Exception -> L37
            r0.a(r4)     // Catch: java.lang.Exception -> L37
            return
        L37:
            r4 = move-exception
            goto L65
        L39:
            java.lang.String r1 = "task"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L37
            if (r0 == 0) goto L64
            cn.jiguang.commons.h.j$k r0 = r3.m     // Catch: java.lang.Exception -> L37
            long r1 = r4.f1150b     // Catch: java.lang.Exception -> L37
            r0.a(r1)     // Catch: java.lang.Exception -> L37
            return
        L49:
            java.lang.String r4 = "stopped"
            boolean r4 = r0.equals(r4)     // Catch: java.lang.Exception -> L37
            if (r4 == 0) goto L64
            cn.jiguang.commons.h.j$k r4 = r3.m     // Catch: java.lang.Exception -> L37
            r4.a()     // Catch: java.lang.Exception -> L37
            return
        L57:
            java.lang.String r4 = "started"
            boolean r4 = r0.equals(r4)     // Catch: java.lang.Exception -> L37
            if (r4 == 0) goto L64
            cn.jiguang.commons.h.j$k r4 = r3.m     // Catch: java.lang.Exception -> L37
            r4.c()     // Catch: java.lang.Exception -> L37
        L64:
            return
        L65:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Error in main thread callback: "
            r0.append(r1)
            java.lang.String r1 = r4.getMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "PeriodicTaskScheduler"
            cn.jiguang.commons.w.a.a(r1, r0, r4)
            java.util.concurrent.atomic.AtomicLong r4 = r3.f1143e
            r4.incrementAndGet()
            return
    }

    static /* synthetic */ void a(cn.jiguang.commons.h.j r0) {
            r0.d()
            return
    }

    static /* synthetic */ void a(cn.jiguang.commons.h.j r0, android.os.Message r1) {
            r0.c(r1)
            return
    }

    private void a(java.lang.String r4) {
            r3 = this;
            boolean r0 = r3.n
            if (r0 == 0) goto L11
            cn.jiguang.commons.h.j$h r0 = r3.u
            r0.a(r4)
            cn.jiguang.commons.C.a r4 = r3.f1147i
            cn.jiguang.commons.h.j$h r0 = r3.u
            r4.a(r0)
            return
        L11:
            android.os.Handler r0 = r3.f1144f
            cn.jiguang.commons.h.j$g r1 = new cn.jiguang.commons.h.j$g
            java.lang.String r2 = "error"
            r1.<init>(r2, r4)
            r4 = 4
            android.os.Message r4 = r0.obtainMessage(r4, r1)
            r4.sendToTarget()
            return
    }

    private long c(long r5) {
            r4 = this;
            java.lang.String r0 = "PeriodicTaskScheduler"
            r1 = 30000(0x7530, double:1.4822E-319)
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 >= 0) goto Le
            java.lang.String r5 = "Task interval too small, using minimum: 30000"
        La:
            cn.jiguang.commons.w.a.f(r0, r5)
            return r1
        Le:
            r1 = 300000(0x493e0, double:1.482197E-318)
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 <= 0) goto L18
            java.lang.String r5 = "Task interval too large, using maximum: 300000"
            goto La
        L18:
            return r5
    }

    private android.os.Handler c() {
            r2 = this;
            cn.jiguang.commons.h.j$f r0 = new cn.jiguang.commons.h.j$f
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r2, r1)
            return r0
    }

    static /* synthetic */ cn.jiguang.commons.h.j.k c(cn.jiguang.commons.h.j r0) {
            cn.jiguang.commons.h.j$k r0 = r0.m
            return r0
    }

    private void c(android.os.Message r3) {
            r2 = this;
            int r0 = r3.what     // Catch: java.lang.Exception -> L10
            r1 = 2
            if (r0 == r1) goto L16
            r1 = 3
            if (r0 == r1) goto L12
            r1 = 4
            if (r0 == r1) goto Lc
            return
        Lc:
            r2.a(r3)     // Catch: java.lang.Exception -> L10
            return
        L10:
            r3 = move-exception
            goto L1a
        L12:
            r2.i()     // Catch: java.lang.Exception -> L10
            return
        L16:
            r2.g()     // Catch: java.lang.Exception -> L10
            return
        L1a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Error handling main thread message: "
            r0.append(r1)
            java.lang.String r1 = r3.getMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "PeriodicTaskScheduler"
            cn.jiguang.commons.w.a.a(r1, r0, r3)
            return
    }

    private void d() {
            r10 = this;
            java.lang.String r0 = "ms"
            java.lang.String r1 = "Task execution completed in "
            java.util.concurrent.atomic.AtomicBoolean r2 = r10.f1148j
            boolean r2 = r2.get()
            java.lang.String r3 = "PeriodicTaskScheduler"
            if (r2 != 0) goto L14
            java.lang.String r0 = "Task scheduler not running, skipping task"
            cn.jiguang.commons.w.a.a(r3, r0)
            return
        L14:
            android.os.HandlerThread r2 = r10.f1146h
            boolean r2 = r2.isAlive()
            if (r2 != 0) goto L3c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Background thread is not alive: "
            r0.append(r1)
            android.os.HandlerThread r1 = r10.f1146h
            java.lang.Thread$State r1 = r1.getState()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            cn.jiguang.commons.w.a.c(r3, r0)
            java.util.concurrent.atomic.AtomicLong r0 = r10.f1143e
            r0.incrementAndGet()
            return
        L3c:
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7a
            java.util.concurrent.atomic.AtomicLong r2 = r10.a     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7a
            r2.incrementAndGet()     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7a
            java.util.concurrent.atomic.AtomicLong r2 = r10.f1141c     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7a
            r2.set(r6)     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7a
            r2.<init>()     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7a
            java.lang.String r8 = "Task triggered at: "
            r2.append(r8)     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7a
            r2.append(r6)     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7a
            java.lang.String r8 = ", task count: "
            r2.append(r8)     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7a
            java.util.concurrent.atomic.AtomicLong r8 = r10.a     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7a
            long r8 = r8.get()     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7a
            r2.append(r8)     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7a
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7a
            cn.jiguang.commons.w.a.a(r3, r2)     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7a
            cn.jiguang.commons.h.j$k r2 = r10.m     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7a
            if (r2 == 0) goto L7c
            r10.a(r6)     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7a
            goto L81
        L78:
            r2 = move-exception
            goto Led
        L7a:
            r2 = move-exception
            goto La4
        L7c:
            java.lang.String r2 = "No task callback set"
            cn.jiguang.commons.w.a.a(r3, r2)     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7a
        L81:
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r4
            java.util.concurrent.atomic.AtomicLong r2 = r10.f1142d
            r2.addAndGet(r6)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r6)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            cn.jiguang.commons.w.a.a(r3, r0)
            r10.e()
            return
        La4:
            java.lang.String r6 = "Error in task handling"
            cn.jiguang.commons.w.a.a(r3, r6, r2)     // Catch: java.lang.Throwable -> L78
            java.util.concurrent.atomic.AtomicLong r6 = r10.f1143e     // Catch: java.lang.Throwable -> L78
            r6.incrementAndGet()     // Catch: java.lang.Throwable -> L78
            cn.jiguang.commons.h.j$k r6 = r10.m     // Catch: java.lang.Throwable -> L78
            if (r6 == 0) goto Lca
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L78
            r6.<init>()     // Catch: java.lang.Throwable -> L78
            java.lang.String r7 = "Task error: "
            r6.append(r7)     // Catch: java.lang.Throwable -> L78
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L78
            r6.append(r2)     // Catch: java.lang.Throwable -> L78
            java.lang.String r2 = r6.toString()     // Catch: java.lang.Throwable -> L78
            r10.a(r2)     // Catch: java.lang.Throwable -> L78
        Lca:
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r4
            java.util.concurrent.atomic.AtomicLong r2 = r10.f1142d
            r2.addAndGet(r6)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r6)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            cn.jiguang.commons.w.a.a(r3, r0)
            r10.e()
            return
        Led:
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r4
            java.util.concurrent.atomic.AtomicLong r4 = r10.f1142d
            r4.addAndGet(r6)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            r4.append(r6)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            cn.jiguang.commons.w.a.a(r3, r0)
            r10.e()
            throw r2
    }

    static /* synthetic */ boolean d(cn.jiguang.commons.h.j r0) {
            boolean r0 = r0.n
            return r0
    }

    static /* synthetic */ java.lang.Runnable e(cn.jiguang.commons.h.j r0) {
            java.lang.Runnable r0 = r0.r
            return r0
    }

    private void e() {
            r4 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.f1148j
            boolean r0 = r0.get()
            java.lang.String r1 = "PeriodicTaskScheduler"
            if (r0 == 0) goto L37
            android.os.HandlerThread r0 = r4.f1146h
            boolean r0 = r0.isAlive()
            if (r0 == 0) goto L37
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Scheduling next task in "
            r0.append(r2)
            long r2 = r4.l
            r0.append(r2)
            java.lang.String r2 = "ms"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            cn.jiguang.commons.w.a.a(r1, r0)
            android.os.Handler r0 = r4.f1145g
            java.lang.Runnable r1 = r4.o
            long r2 = r4.l
            r0.postDelayed(r1, r2)
            return
        L37:
            java.lang.String r0 = "Task scheduler not running or background thread dead, skipping next task"
            cn.jiguang.commons.w.a.a(r1, r0)
            return
    }

    static /* synthetic */ cn.jiguang.commons.C.a f(cn.jiguang.commons.h.j r0) {
            cn.jiguang.commons.C.a r0 = r0.f1147i
            return r0
    }

    static /* synthetic */ android.os.Handler g(cn.jiguang.commons.h.j r0) {
            android.os.Handler r0 = r0.f1144f
            return r0
    }

    private void g() {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f1148j
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L2e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Task scheduler started with interval: "
            r0.append(r1)
            long r1 = r3.l
            r0.append(r1)
            java.lang.String r1 = "ms"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "PeriodicTaskScheduler"
            cn.jiguang.commons.w.a.a(r1, r0)
            android.os.Handler r0 = r3.f1145g
            java.lang.Runnable r1 = r3.p
            r0.post(r1)
        L2e:
            return
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicBoolean h(cn.jiguang.commons.h.j r0) {
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f1148j
            return r0
    }

    static /* synthetic */ java.lang.Runnable i(cn.jiguang.commons.h.j r0) {
            java.lang.Runnable r0 = r0.s
            return r0
    }

    private void i() {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f1148j
            r1 = 1
            r2 = 0
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L18
            java.lang.String r0 = "PeriodicTaskScheduler"
            java.lang.String r1 = "Task scheduler stopped"
            cn.jiguang.commons.w.a.a(r0, r1)
            android.os.Handler r0 = r3.f1145g
            java.lang.Runnable r1 = r3.q
            r0.post(r1)
        L18:
            return
    }

    static /* synthetic */ android.os.Handler j(cn.jiguang.commons.h.j r0) {
            android.os.Handler r0 = r0.f1145g
            return r0
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicLong k(cn.jiguang.commons.h.j r0) {
            java.util.concurrent.atomic.AtomicLong r0 = r0.f1143e
            return r0
    }

    public void a(cn.jiguang.commons.h.j.k r1) {
            r0 = this;
            r0.m = r1
            return
    }

    public void f() {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f1149k
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L10
            android.os.Handler r0 = r3.f1144f
            r1 = 2
            r0.sendEmptyMessage(r1)
        L10:
            return
    }

    public void h() {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f1149k
            r1 = 1
            r2 = 0
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L10
            android.os.Handler r0 = r3.f1144f
            r1 = 3
            r0.sendEmptyMessage(r1)
        L10:
            return
    }
}
