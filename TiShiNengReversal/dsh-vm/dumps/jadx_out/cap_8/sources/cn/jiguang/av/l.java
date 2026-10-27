package cn.jiguang.av;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class l {
    private static final java.util.concurrent.atomic.AtomicInteger a = null;

    /* renamed from: b, reason: collision with root package name */
    private static volatile android.os.Handler f706b;

    /* renamed from: c, reason: collision with root package name */
    private static final java.util.concurrent.ConcurrentHashMap<java.lang.String, cn.jiguang.av.l.b> f707c = null;


    private static class a {
        private static final cn.jiguang.av.l a = null;

        static {
                cn.jiguang.av.l r0 = new cn.jiguang.av.l
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.av.l.a.a = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.av.l a() {
                cn.jiguang.av.l r0 = cn.jiguang.av.l.a.a
                return r0
        }
    }

    private static class b implements java.lang.Runnable {
        private final java.lang.Runnable a;

        /* renamed from: b, reason: collision with root package name */
        private final java.lang.String f710b;

        /* renamed from: c, reason: collision with root package name */
        private final java.util.concurrent.atomic.AtomicBoolean f711c;


        b(java.lang.Runnable r3, java.lang.String r4) {
                r2 = this;
                r2.<init>()
                java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
                r1 = 0
                r0.<init>(r1)
                r2.f711c = r0
                r2.a = r3
                r2.f710b = r4
                return
        }

        static /* synthetic */ java.lang.Runnable a(cn.jiguang.av.l.b r0) {
                java.lang.Runnable r0 = r0.a
                return r0
        }

        void a() {
                r2 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r2.f711c
                r1 = 1
                r0.set(r1)
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r3.f711c     // Catch: java.lang.Throwable -> L13
                boolean r0 = r0.get()     // Catch: java.lang.Throwable -> L13
                if (r0 != 0) goto L15
                java.lang.String r0 = "FUTURE_TASK"
                cn.jiguang.av.l$b$1 r1 = new cn.jiguang.av.l$b$1     // Catch: java.lang.Throwable -> L13
                r1.<init>(r3)     // Catch: java.lang.Throwable -> L13
                cn.jiguang.au.d.a(r0, r1)     // Catch: java.lang.Throwable -> L13
                goto L15
            L13:
                r0 = move-exception
                goto L1f
            L15:
                java.util.concurrent.ConcurrentHashMap r0 = cn.jiguang.av.l.c()
                java.lang.String r1 = r3.f710b
                r0.remove(r1, r3)
                return
            L1f:
                java.util.concurrent.ConcurrentHashMap r1 = cn.jiguang.av.l.c()
                java.lang.String r2 = r3.f710b
                r1.remove(r2, r3)
                throw r0
        }
    }

    static {
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 0
            r0.<init>(r1)
            cn.jiguang.av.l.a = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r1 = 32
            r0.<init>(r1)
            cn.jiguang.av.l.f707c = r0
            return
    }

    private l() {
            r2 = this;
            r2.<init>()
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            cn.jiguang.av.l.f706b = r0
            return
    }

    /* synthetic */ l(cn.jiguang.av.l.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static cn.jiguang.av.l a() {
            cn.jiguang.av.l r0 = cn.jiguang.av.l.a.a()
            return r0
    }

    static /* synthetic */ android.os.Handler b() {
            android.os.Handler r0 = cn.jiguang.av.l.f706b
            return r0
    }

    static /* synthetic */ java.util.concurrent.ConcurrentHashMap c() {
            java.util.concurrent.ConcurrentHashMap<java.lang.String, cn.jiguang.av.l$b> r0 = cn.jiguang.av.l.f707c
            return r0
    }

    public void a(java.lang.String r4, java.lang.Runnable r5, long r6) {
            r3 = this;
            if (r5 == 0) goto L36
            if (r4 != 0) goto L5
            goto L36
        L5:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L19
            java.util.concurrent.ConcurrentHashMap<java.lang.String, cn.jiguang.av.l$b> r0 = cn.jiguang.av.l.f707c
            cn.jiguang.av.l$1 r1 = new cn.jiguang.av.l$1
            r1.<init>(r3, r5, r4)
            java.lang.Object r4 = cn.jiguang.av.e0.a(r0, r4, r1)
            cn.jiguang.av.l$b r4 = (cn.jiguang.av.l.b) r4
            goto L31
        L19:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, cn.jiguang.av.l$b> r0 = cn.jiguang.av.l.f707c
            java.lang.Object r1 = r0.get(r4)
            cn.jiguang.av.l$b r1 = (cn.jiguang.av.l.b) r1
            if (r1 == 0) goto L28
            android.os.Handler r2 = cn.jiguang.av.l.f706b
            r2.removeCallbacks(r1)
        L28:
            cn.jiguang.av.l$b r1 = new cn.jiguang.av.l$b
            r1.<init>(r5, r4)
            r0.put(r4, r1)
            r4 = r1
        L31:
            android.os.Handler r5 = cn.jiguang.av.l.f706b
            r5.postDelayed(r4, r6)
        L36:
            return
    }

    public boolean a(java.lang.String r2) {
            r1 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.String, cn.jiguang.av.l$b> r0 = cn.jiguang.av.l.f707c
            java.lang.Object r2 = r0.remove(r2)
            cn.jiguang.av.l$b r2 = (cn.jiguang.av.l.b) r2
            if (r2 == 0) goto L14
            r2.a()
            android.os.Handler r0 = cn.jiguang.av.l.f706b
            r0.removeCallbacks(r2)
            r2 = 1
            return r2
        L14:
            r2 = 0
            return r2
    }

    public boolean b(java.lang.String r2) {
            r1 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.String, cn.jiguang.av.l$b> r0 = cn.jiguang.av.l.f707c
            boolean r2 = r0.containsKey(r2)
            return r2
    }
}
