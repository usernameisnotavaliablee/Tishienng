package cn.jiguang.commons.C;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a {
    private volatile java.util.concurrent.ThreadPoolExecutor a;

    /* renamed from: c, reason: collision with root package name */
    private volatile java.util.concurrent.ThreadPoolExecutor f755c;

    /* renamed from: d, reason: collision with root package name */
    private volatile java.util.concurrent.ThreadPoolExecutor f756d;

    /* renamed from: e, reason: collision with root package name */
    private volatile java.util.concurrent.ThreadPoolExecutor f757e;

    /* renamed from: f, reason: collision with root package name */
    private volatile java.util.concurrent.ScheduledThreadPoolExecutor f758f;

    /* renamed from: g, reason: collision with root package name */
    private final java.lang.Object f759g;

    /* renamed from: h, reason: collision with root package name */
    private final java.lang.Object f760h;

    /* renamed from: i, reason: collision with root package name */
    private final java.lang.Object f761i;

    /* renamed from: j, reason: collision with root package name */
    private final java.lang.Object f762j;

    /* renamed from: k, reason: collision with root package name */
    private final java.lang.Object f763k;

    /* renamed from: cn.jiguang.commons.C.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0021a {
        static final /* synthetic */ int[] a = null;

        static {
                cn.jiguang.commons.C.a$g[] r0 = cn.jiguang.commons.C.a.g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                cn.jiguang.commons.C.a.C0021a.a = r0
                cn.jiguang.commons.C.a$g r1 = cn.jiguang.commons.C.a.g.a     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = cn.jiguang.commons.C.a.C0021a.a     // Catch: java.lang.NoSuchFieldError -> L1d
                cn.jiguang.commons.C.a$g r1 = cn.jiguang.commons.C.a.g.f770c     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = cn.jiguang.commons.C.a.C0021a.a     // Catch: java.lang.NoSuchFieldError -> L28
                cn.jiguang.commons.C.a$g r1 = cn.jiguang.commons.C.a.g.f771d     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = cn.jiguang.commons.C.a.C0021a.a     // Catch: java.lang.NoSuchFieldError -> L33
                cn.jiguang.commons.C.a$g r1 = cn.jiguang.commons.C.a.g.f772e     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }

        public C0021a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    private static class b {
        final int a;

        /* renamed from: b, reason: collision with root package name */
        final int f764b;

        /* renamed from: c, reason: collision with root package name */
        final int f765c;

        /* renamed from: d, reason: collision with root package name */
        final long f766d;

        /* renamed from: e, reason: collision with root package name */
        final java.lang.String f767e;

        /* renamed from: f, reason: collision with root package name */
        final boolean f768f;

        b(int r1, int r2, int r3, long r4, java.lang.String r6, boolean r7) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.f764b = r2
                r0.f765c = r3
                r0.f766d = r4
                r0.f767e = r6
                r0.f768f = r7
                return
        }
    }

    private static class c implements java.util.concurrent.RejectedExecutionHandler {
        private c() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ c(cn.jiguang.commons.C.a.C0021a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(java.lang.Runnable r4, java.util.concurrent.ThreadPoolExecutor r5) {
                r3 = this;
                boolean r0 = r5.isShutdown()
                java.lang.String r1 = "SdkThreadPoolManager"
                if (r0 != 0) goto L68
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "task rejected: "
                r0.append(r2)
                java.lang.Class r2 = r4.getClass()
                java.lang.String r2 = r2.getSimpleName()
                r0.append(r2)
                java.lang.String r2 = ", active threads:"
                r0.append(r2)
                int r2 = r5.getActiveCount()
                r0.append(r2)
                java.lang.String r2 = ", pool size:"
                r0.append(r2)
                int r2 = r5.getPoolSize()
                r0.append(r2)
                java.lang.String r2 = ", queue size:"
                r0.append(r2)
                java.util.concurrent.BlockingQueue r2 = r5.getQueue()
                int r2 = r2.size()
                r0.append(r2)
                java.lang.String r2 = ", max pool size:"
                r0.append(r2)
                int r5 = r5.getMaximumPoolSize()
                r0.append(r5)
                java.lang.String r5 = r0.toString()
                cn.jiguang.commons.w.a.f(r1, r5)
                java.lang.String r5 = "task rejected. executing in caller thread."
                cn.jiguang.commons.w.a.f(r1, r5)     // Catch: java.lang.Exception -> L61
                r4.run()     // Catch: java.lang.Exception -> L61
                return
            L61:
                r4 = move-exception
                java.lang.String r5 = "error executing rejected task in caller thread"
            L64:
                cn.jiguang.commons.w.a.a(r1, r5, r4)
                goto L80
            L68:
                java.lang.String r5 = "thread pool shutdown, executing in emergency thread"
                cn.jiguang.commons.w.a.f(r1, r5)
                java.lang.Thread r5 = new java.lang.Thread     // Catch: java.lang.Exception -> L7c
                java.lang.String r0 = "jg_c_emt"
                r5.<init>(r4, r0)     // Catch: java.lang.Exception -> L7c
                r4 = 1
                r5.setDaemon(r4)     // Catch: java.lang.Exception -> L7c
                r5.start()     // Catch: java.lang.Exception -> L7c
                return
            L7c:
                r4 = move-exception
                java.lang.String r5 = "failed to execute task in emergency thread"
                goto L64
            L80:
                return
        }
    }

    private static class d implements java.util.concurrent.ThreadFactory {
        private final java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        private final java.util.concurrent.atomic.AtomicInteger f769b;

        /* renamed from: cn.jiguang.commons.C.a$d$a, reason: collision with other inner class name */
        class C0022a implements java.lang.Thread.UncaughtExceptionHandler {
            final /* synthetic */ cn.jiguang.commons.C.a.d a;

            C0022a(cn.jiguang.commons.C.a.d r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(java.lang.Thread r3, java.lang.Throwable r4) {
                    r2 = this;
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "uncaught exception in thread "
                    r0.append(r1)
                    java.lang.String r3 = r3.getName()
                    r0.append(r3)
                    java.lang.String r3 = r0.toString()
                    java.lang.String r0 = "SdkThreadPoolManager"
                    cn.jiguang.commons.w.a.a(r0, r3, r4)
                    return
            }
        }

        public d(java.lang.String r3) {
                r2 = this;
                r2.<init>()
                java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
                r1 = 1
                r0.<init>(r1)
                r2.f769b = r0
                r2.a = r3
                return
        }

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(java.lang.Runnable r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r2.a
                r0.append(r1)
                java.lang.String r1 = "_"
                r0.append(r1)
                java.util.concurrent.atomic.AtomicInteger r1 = r2.f769b
                int r1 = r1.getAndIncrement()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.Thread r1 = new java.lang.Thread
                r1.<init>(r3, r0)
                r3 = 1
                r1.setDaemon(r3)
                cn.jiguang.commons.C.a$d$a r3 = new cn.jiguang.commons.C.a$d$a
                r3.<init>(r2)
                r1.setUncaughtExceptionHandler(r3)
                return r1
        }
    }

    private static class e {
        private static final cn.jiguang.commons.C.a a = null;

        static {
                cn.jiguang.commons.C.a r0 = new cn.jiguang.commons.C.a
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.commons.C.a.e.a = r0
                return
        }

        public e() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.commons.C.a a() {
                cn.jiguang.commons.C.a r0 = cn.jiguang.commons.C.a.e.a
                return r0
        }
    }

    public enum g extends java.lang.Enum {
        public static final cn.jiguang.commons.C.a.g a = null;

        /* renamed from: c, reason: collision with root package name */
        public static final cn.jiguang.commons.C.a.g f770c = null;

        /* renamed from: d, reason: collision with root package name */
        public static final cn.jiguang.commons.C.a.g f771d = null;

        /* renamed from: e, reason: collision with root package name */
        public static final cn.jiguang.commons.C.a.g f772e = null;

        /* renamed from: f, reason: collision with root package name */
        public static final cn.jiguang.commons.C.a.g f773f = null;

        /* renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ cn.jiguang.commons.C.a.g[] f774g = null;

        static {
                cn.jiguang.commons.C.a$g r0 = new cn.jiguang.commons.C.a$g
                java.lang.String r1 = "LIGHT_TASK"
                r2 = 0
                r0.<init>(r1, r2)
                cn.jiguang.commons.C.a.g.a = r0
                cn.jiguang.commons.C.a$g r0 = new cn.jiguang.commons.C.a$g
                java.lang.String r1 = "APP_COLLECTION"
                r2 = 1
                r0.<init>(r1, r2)
                cn.jiguang.commons.C.a.g.f770c = r0
                cn.jiguang.commons.C.a$g r0 = new cn.jiguang.commons.C.a$g
                java.lang.String r1 = "NETWORK"
                r2 = 2
                r0.<init>(r1, r2)
                cn.jiguang.commons.C.a.g.f771d = r0
                cn.jiguang.commons.C.a$g r0 = new cn.jiguang.commons.C.a$g
                java.lang.String r1 = "DEVICE_INFO"
                r2 = 3
                r0.<init>(r1, r2)
                cn.jiguang.commons.C.a.g.f772e = r0
                cn.jiguang.commons.C.a$g r0 = new cn.jiguang.commons.C.a$g
                java.lang.String r1 = "SCHEDULED"
                r2 = 4
                r0.<init>(r1, r2)
                cn.jiguang.commons.C.a.g.f773f = r0
                cn.jiguang.commons.C.a$g[] r0 = a()
                cn.jiguang.commons.C.a.g.f774g = r0
                return
        }

        g(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        private static /* synthetic */ cn.jiguang.commons.C.a.g[] a() {
                r0 = 5
                cn.jiguang.commons.C.a$g[] r0 = new cn.jiguang.commons.C.a.g[r0]
                cn.jiguang.commons.C.a$g r1 = cn.jiguang.commons.C.a.g.a
                r2 = 0
                r0[r2] = r1
                cn.jiguang.commons.C.a$g r1 = cn.jiguang.commons.C.a.g.f770c
                r2 = 1
                r0[r2] = r1
                cn.jiguang.commons.C.a$g r1 = cn.jiguang.commons.C.a.g.f771d
                r2 = 2
                r0[r2] = r1
                cn.jiguang.commons.C.a$g r1 = cn.jiguang.commons.C.a.g.f772e
                r2 = 3
                r0[r2] = r1
                cn.jiguang.commons.C.a$g r1 = cn.jiguang.commons.C.a.g.f773f
                r2 = 4
                r0[r2] = r1
                return r0
        }

        public static cn.jiguang.commons.C.a.g valueOf(java.lang.String r1) {
                java.lang.Class<cn.jiguang.commons.C.a$g> r0 = cn.jiguang.commons.C.a.g.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                cn.jiguang.commons.C.a$g r1 = (cn.jiguang.commons.C.a.g) r1
                return r1
        }

        public static cn.jiguang.commons.C.a.g[] values() {
                cn.jiguang.commons.C.a$g[] r0 = cn.jiguang.commons.C.a.g.f774g
                java.lang.Object r0 = r0.clone()
                cn.jiguang.commons.C.a$g[] r0 = (cn.jiguang.commons.C.a.g[]) r0
                return r0
        }
    }

    private a() {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.f759g = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.f760h = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.f761i = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.f762j = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.f763k = r0
            return
    }

    /* synthetic */ a(cn.jiguang.commons.C.a.C0021a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    private java.util.concurrent.ThreadPoolExecutor a(cn.jiguang.commons.C.a.b r10) {
            r9 = this;
            java.util.concurrent.LinkedBlockingQueue r6 = new java.util.concurrent.LinkedBlockingQueue
            int r0 = r10.f765c
            r6.<init>(r0)
            cn.jiguang.commons.C.a$d r7 = new cn.jiguang.commons.C.a$d
            java.lang.String r0 = r10.f767e
            r7.<init>(r0)
            cn.jiguang.commons.C.a$c r8 = new cn.jiguang.commons.C.a$c
            r0 = 0
            r8.<init>(r0)
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            int r1 = r10.a
            int r2 = r10.f764b
            long r3 = r10.f766d
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            r0.<init>(r1, r2, r3, r5, r6, r7, r8)
            boolean r1 = r10.f768f
            if (r1 == 0) goto L29
            r1 = 1
            r0.allowCoreThreadTimeOut(r1)
        L29:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r10.f767e
            r1.append(r2)
            java.lang.String r2 = " initialized: core="
            r1.append(r2)
            int r2 = r10.a
            r1.append(r2)
            java.lang.String r2 = ", max="
            r1.append(r2)
            int r2 = r10.f764b
            r1.append(r2)
            java.lang.String r2 = ", queue="
            r1.append(r2)
            int r10 = r10.f765c
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            java.lang.String r1 = "SdkThreadPoolManager"
            cn.jiguang.commons.w.a.a(r1, r10)
            return r0
    }

    private void a() {
            r5 = this;
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = r5.f758f
            if (r0 == 0) goto Le
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = r5.f758f
            boolean r0 = r0.isShutdown()
            if (r0 == 0) goto Ld
            goto Le
        Ld:
            return
        Le:
            java.lang.Object r0 = r5.f763k
            monitor-enter(r0)
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = r5.f758f     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L20
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = r5.f758f     // Catch: java.lang.Throwable -> L1e
            boolean r1 = r1.isShutdown()     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L58
            goto L20
        L1e:
            r1 = move-exception
            goto L5a
        L20:
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = r5.f758f     // Catch: java.lang.Throwable -> L1e
            r2 = 0
            if (r1 == 0) goto L2e
            java.lang.String r1 = "SdkThreadPoolManager"
            java.lang.String r3 = "scheduled pool shutdown, recreating"
            cn.jiguang.commons.w.a.f(r1, r3)     // Catch: java.lang.Throwable -> L1e
            r5.f758f = r2     // Catch: java.lang.Throwable -> L1e
        L2e:
            cn.jiguang.commons.C.a$d r1 = new cn.jiguang.commons.C.a$d     // Catch: java.lang.Throwable -> L1e
            java.lang.String r3 = "jg_c_scheduled"
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L1e
            cn.jiguang.commons.C.a$c r3 = new cn.jiguang.commons.C.a$c     // Catch: java.lang.Throwable -> L1e
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L1e
            java.util.concurrent.ScheduledThreadPoolExecutor r2 = new java.util.concurrent.ScheduledThreadPoolExecutor     // Catch: java.lang.Throwable -> L1e
            r4 = 2
            r2.<init>(r4, r1, r3)     // Catch: java.lang.Throwable -> L1e
            r5.f758f = r2     // Catch: java.lang.Throwable -> L1e
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = r5.f758f     // Catch: java.lang.Throwable -> L1e
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L1e
            r3 = 30
            r1.setKeepAliveTime(r3, r2)     // Catch: java.lang.Throwable -> L1e
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = r5.f758f     // Catch: java.lang.Throwable -> L1e
            r2 = 1
            r1.allowCoreThreadTimeOut(r2)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r1 = "SdkThreadPoolManager"
            java.lang.String r2 = "scheduledthreadpoolexecutor initialized on demand:corePoolSize=2, keepAliveTime=30s"
            cn.jiguang.commons.w.a.a(r1, r2)     // Catch: java.lang.Throwable -> L1e
        L58:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            return
        L5a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r1
    }

    public static cn.jiguang.commons.C.a c() {
            cn.jiguang.commons.C.a r0 = cn.jiguang.commons.C.a.e.a()
            return r0
    }

    private java.util.concurrent.ThreadPoolExecutor d() {
            r10 = this;
            java.util.concurrent.ThreadPoolExecutor r0 = r10.f755c
            if (r0 == 0) goto Lc
            java.util.concurrent.ThreadPoolExecutor r0 = r10.f755c
            boolean r0 = r0.isShutdown()
            if (r0 == 0) goto L41
        Lc:
            java.lang.Object r1 = r10.f760h
            monitor-enter(r1)
            java.util.concurrent.ThreadPoolExecutor r0 = r10.f755c     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L1e
            java.util.concurrent.ThreadPoolExecutor r0 = r10.f755c     // Catch: java.lang.Throwable -> L1c
            boolean r0 = r0.isShutdown()     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L40
            goto L1e
        L1c:
            r0 = move-exception
            goto L44
        L1e:
            java.util.concurrent.ThreadPoolExecutor r0 = r10.f755c     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L2c
            java.lang.String r0 = "SdkThreadPoolManager"
            java.lang.String r2 = "app collection pool shutdown, recreating"
            cn.jiguang.commons.w.a.f(r0, r2)     // Catch: java.lang.Throwable -> L1c
            r0 = 0
            r10.f755c = r0     // Catch: java.lang.Throwable -> L1c
        L2c:
            cn.jiguang.commons.C.a$b r2 = new cn.jiguang.commons.C.a$b     // Catch: java.lang.Throwable -> L1c
            java.lang.String r8 = "jg_c_ac"
            r9 = 1
            r3 = 1
            r4 = 2
            r5 = 20
            r6 = 60
            r2.<init>(r3, r4, r5, r6, r8, r9)     // Catch: java.lang.Throwable -> L1c
            java.util.concurrent.ThreadPoolExecutor r0 = r10.a(r2)     // Catch: java.lang.Throwable -> L1c
            r10.f755c = r0     // Catch: java.lang.Throwable -> L1c
        L40:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1c
        L41:
            java.util.concurrent.ThreadPoolExecutor r0 = r10.f755c
            return r0
        L44:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1c
            throw r0
    }

    private java.util.concurrent.ThreadPoolExecutor e() {
            r10 = this;
            java.util.concurrent.ThreadPoolExecutor r0 = r10.f757e
            if (r0 == 0) goto Lc
            java.util.concurrent.ThreadPoolExecutor r0 = r10.f757e
            boolean r0 = r0.isShutdown()
            if (r0 == 0) goto L41
        Lc:
            java.lang.Object r1 = r10.f762j
            monitor-enter(r1)
            java.util.concurrent.ThreadPoolExecutor r0 = r10.f757e     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L1e
            java.util.concurrent.ThreadPoolExecutor r0 = r10.f757e     // Catch: java.lang.Throwable -> L1c
            boolean r0 = r0.isShutdown()     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L40
            goto L1e
        L1c:
            r0 = move-exception
            goto L44
        L1e:
            java.util.concurrent.ThreadPoolExecutor r0 = r10.f757e     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L2c
            java.lang.String r0 = "SdkThreadPoolManager"
            java.lang.String r2 = "device info pool shutdown, recreating"
            cn.jiguang.commons.w.a.f(r0, r2)     // Catch: java.lang.Throwable -> L1c
            r0 = 0
            r10.f757e = r0     // Catch: java.lang.Throwable -> L1c
        L2c:
            cn.jiguang.commons.C.a$b r2 = new cn.jiguang.commons.C.a$b     // Catch: java.lang.Throwable -> L1c
            java.lang.String r8 = "jg_c_dev"
            r9 = 1
            r3 = 2
            r4 = 3
            r5 = 80
            r6 = 45
            r2.<init>(r3, r4, r5, r6, r8, r9)     // Catch: java.lang.Throwable -> L1c
            java.util.concurrent.ThreadPoolExecutor r0 = r10.a(r2)     // Catch: java.lang.Throwable -> L1c
            r10.f757e = r0     // Catch: java.lang.Throwable -> L1c
        L40:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1c
        L41:
            java.util.concurrent.ThreadPoolExecutor r0 = r10.f757e
            return r0
        L44:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1c
            throw r0
    }

    private java.util.concurrent.ThreadPoolExecutor f() {
            r10 = this;
            java.util.concurrent.ThreadPoolExecutor r0 = r10.a
            if (r0 == 0) goto Lc
            java.util.concurrent.ThreadPoolExecutor r0 = r10.a
            boolean r0 = r0.isShutdown()
            if (r0 == 0) goto L41
        Lc:
            java.lang.Object r1 = r10.f759g
            monitor-enter(r1)
            java.util.concurrent.ThreadPoolExecutor r0 = r10.a     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L1e
            java.util.concurrent.ThreadPoolExecutor r0 = r10.a     // Catch: java.lang.Throwable -> L1c
            boolean r0 = r0.isShutdown()     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L40
            goto L1e
        L1c:
            r0 = move-exception
            goto L44
        L1e:
            java.util.concurrent.ThreadPoolExecutor r0 = r10.a     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L2c
            java.lang.String r0 = "SdkThreadPoolManager"
            java.lang.String r2 = "light task pool shutdown, recreating"
            cn.jiguang.commons.w.a.f(r0, r2)     // Catch: java.lang.Throwable -> L1c
            r0 = 0
            r10.a = r0     // Catch: java.lang.Throwable -> L1c
        L2c:
            cn.jiguang.commons.C.a$b r2 = new cn.jiguang.commons.C.a$b     // Catch: java.lang.Throwable -> L1c
            java.lang.String r8 = "jg_c_lt"
            r9 = 1
            r3 = 1
            r4 = 2
            r5 = 10
            r6 = 30
            r2.<init>(r3, r4, r5, r6, r8, r9)     // Catch: java.lang.Throwable -> L1c
            java.util.concurrent.ThreadPoolExecutor r0 = r10.a(r2)     // Catch: java.lang.Throwable -> L1c
            r10.a = r0     // Catch: java.lang.Throwable -> L1c
        L40:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1c
        L41:
            java.util.concurrent.ThreadPoolExecutor r0 = r10.a
            return r0
        L44:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1c
            throw r0
    }

    private java.util.concurrent.ThreadPoolExecutor g() {
            r10 = this;
            java.util.concurrent.ThreadPoolExecutor r0 = r10.f756d
            if (r0 == 0) goto Lc
            java.util.concurrent.ThreadPoolExecutor r0 = r10.f756d
            boolean r0 = r0.isShutdown()
            if (r0 == 0) goto L41
        Lc:
            java.lang.Object r1 = r10.f761i
            monitor-enter(r1)
            java.util.concurrent.ThreadPoolExecutor r0 = r10.f756d     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L1e
            java.util.concurrent.ThreadPoolExecutor r0 = r10.f756d     // Catch: java.lang.Throwable -> L1c
            boolean r0 = r0.isShutdown()     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L40
            goto L1e
        L1c:
            r0 = move-exception
            goto L44
        L1e:
            java.util.concurrent.ThreadPoolExecutor r0 = r10.f756d     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L2c
            java.lang.String r0 = "SdkThreadPoolManager"
            java.lang.String r2 = "network pool shutdown, recreating"
            cn.jiguang.commons.w.a.f(r0, r2)     // Catch: java.lang.Throwable -> L1c
            r0 = 0
            r10.f756d = r0     // Catch: java.lang.Throwable -> L1c
        L2c:
            cn.jiguang.commons.C.a$b r2 = new cn.jiguang.commons.C.a$b     // Catch: java.lang.Throwable -> L1c
            java.lang.String r8 = "jg_c_net"
            r9 = 1
            r3 = 1
            r4 = 2
            r5 = 10
            r6 = 120(0x78, double:5.93E-322)
            r2.<init>(r3, r4, r5, r6, r8, r9)     // Catch: java.lang.Throwable -> L1c
            java.util.concurrent.ThreadPoolExecutor r0 = r10.a(r2)     // Catch: java.lang.Throwable -> L1c
            r10.f756d = r0     // Catch: java.lang.Throwable -> L1c
        L40:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1c
        L41:
            java.util.concurrent.ThreadPoolExecutor r0 = r10.f756d
            return r0
        L44:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1c
            throw r0
    }

    public java.util.concurrent.ScheduledFuture a(java.lang.Runnable r2, long r3) {
            r1 = this;
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.ScheduledFuture r2 = r1.a(r2, r3, r0)
            return r2
    }

    public java.util.concurrent.ScheduledFuture a(java.lang.Runnable r4, long r5, java.util.concurrent.TimeUnit r7) {
            r3 = this;
            r0 = 0
            java.lang.String r1 = "SdkThreadPoolManager"
            if (r4 != 0) goto Lb
            java.lang.String r4 = "task is null, cannot schedule"
            cn.jiguang.commons.w.a.f(r1, r4)
            return r0
        Lb:
            r3.a()     // Catch: java.lang.Exception -> L18
            java.util.concurrent.ScheduledThreadPoolExecutor r2 = r3.f758f     // Catch: java.lang.Exception -> L18
            if (r2 != 0) goto L1a
            java.lang.String r5 = "scheduled threadpool is null"
            cn.jiguang.commons.w.a.f(r1, r5)     // Catch: java.lang.Exception -> L18
            return r0
        L18:
            r5 = move-exception
            goto L21
        L1a:
            java.util.concurrent.ScheduledThreadPoolExecutor r2 = r3.f758f     // Catch: java.lang.Exception -> L18
            java.util.concurrent.ScheduledFuture r4 = r2.schedule(r4, r5, r7)     // Catch: java.lang.Exception -> L18
            return r4
        L21:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "failed to schedule task:"
            r6.append(r7)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            cn.jiguang.commons.w.a.a(r1, r4, r5)
            return r0
    }

    protected java.util.concurrent.ThreadPoolExecutor a(cn.jiguang.commons.C.a.g r2) {
            r1 = this;
            int[] r0 = cn.jiguang.commons.C.a.C0021a.a
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            if (r2 == r0) goto L28
            r0 = 2
            if (r2 == r0) goto L23
            r0 = 3
            if (r2 == r0) goto L1e
            r0 = 4
            if (r2 == r0) goto L19
            java.util.concurrent.ThreadPoolExecutor r2 = r1.f()
            return r2
        L19:
            java.util.concurrent.ThreadPoolExecutor r2 = r1.e()
            return r2
        L1e:
            java.util.concurrent.ThreadPoolExecutor r2 = r1.g()
            return r2
        L23:
            java.util.concurrent.ThreadPoolExecutor r2 = r1.d()
            return r2
        L28:
            java.util.concurrent.ThreadPoolExecutor r2 = r1.f()
            return r2
    }

    public boolean a(java.lang.Runnable r2) {
            r1 = this;
            cn.jiguang.commons.C.a$g r0 = cn.jiguang.commons.C.a.g.a
            boolean r2 = r1.a(r2, r0)
            return r2
    }

    public boolean a(java.lang.Runnable r5, cn.jiguang.commons.C.a.g r6) {
            r4 = this;
            r0 = 0
            java.lang.String r1 = "SdkThreadPoolManager"
            if (r5 != 0) goto Lb
            java.lang.String r5 = "task is null, cannot execute"
            cn.jiguang.commons.w.a.f(r1, r5)
            return r0
        Lb:
            java.util.concurrent.ThreadPoolExecutor r2 = r4.a(r6)     // Catch: java.lang.Exception -> L2b
            if (r2 != 0) goto L2d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2b
            r2.<init>()     // Catch: java.lang.Exception -> L2b
            java.lang.String r3 = "threadpool for type "
            r2.append(r3)     // Catch: java.lang.Exception -> L2b
            r2.append(r6)     // Catch: java.lang.Exception -> L2b
            java.lang.String r6 = " is null"
            r2.append(r6)     // Catch: java.lang.Exception -> L2b
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Exception -> L2b
            cn.jiguang.commons.w.a.f(r1, r6)     // Catch: java.lang.Exception -> L2b
            return r0
        L2b:
            r6 = move-exception
            goto L32
        L2d:
            r2.execute(r5)     // Catch: java.lang.Exception -> L2b
            r5 = 1
            return r5
        L32:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "failed to submit task:"
            r2.append(r3)
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            cn.jiguang.commons.w.a.a(r1, r5, r6)
            return r0
    }
}
