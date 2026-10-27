package cn.jiguang.commons.L;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class o {
    private static final java.util.concurrent.atomic.AtomicInteger a = null;

    /* renamed from: c, reason: collision with root package name */
    private static final android.os.Handler f907c = null;

    /* renamed from: d, reason: collision with root package name */
    private static final java.util.concurrent.ConcurrentHashMap f908d = null;

    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    private static class b {
        private static final cn.jiguang.commons.L.o a = null;

        static {
                cn.jiguang.commons.L.o r0 = new cn.jiguang.commons.L.o
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.commons.L.o.b.a = r0
                return
        }

        public b() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.commons.L.o a() {
                cn.jiguang.commons.L.o r0 = cn.jiguang.commons.L.o.b.a
                return r0
        }
    }

    private static final class c implements java.lang.Runnable {
        private final java.lang.Runnable a;

        /* renamed from: b, reason: collision with root package name */
        private final java.lang.String f909b;

        /* renamed from: c, reason: collision with root package name */
        private final java.util.concurrent.atomic.AtomicBoolean f910c;

        c(java.lang.Runnable r3, java.lang.String r4) {
                r2 = this;
                r2.<init>()
                java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
                r1 = 0
                r0.<init>(r1)
                r2.f910c = r0
                r2.a = r3
                r2.f909b = r4
                return
        }

        void a() {
                r2 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r2.f910c
                r1 = 1
                r0.set(r1)
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r2.f910c     // Catch: java.lang.Throwable -> Lf
                boolean r0 = r0.get()     // Catch: java.lang.Throwable -> Lf
                if (r0 != 0) goto Lf
                java.lang.Runnable r0 = r2.a     // Catch: java.lang.Throwable -> Lf
                if (r0 == 0) goto Lf
                r0.run()     // Catch: java.lang.Throwable -> Lf
            Lf:
                java.util.concurrent.ConcurrentHashMap r0 = cn.jiguang.commons.L.o.a()
                java.lang.String r1 = r2.f909b
                r0.remove(r1, r2)
                return
        }
    }

    static {
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 0
            r0.<init>(r1)
            cn.jiguang.commons.L.o.a = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            cn.jiguang.commons.L.o.f907c = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r1 = 32
            r0.<init>(r1)
            cn.jiguang.commons.L.o.f908d = r0
            return
    }

    private o() {
            r0 = this;
            r0.<init>()
            return
    }

    /* synthetic */ o(cn.jiguang.commons.L.o.a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ java.util.concurrent.ConcurrentHashMap a() {
            java.util.concurrent.ConcurrentHashMap r0 = cn.jiguang.commons.L.o.f908d
            return r0
    }

    public static cn.jiguang.commons.L.o c() {
            cn.jiguang.commons.L.o r0 = cn.jiguang.commons.L.o.b.a()
            return r0
    }

    public void a(java.lang.String r4, java.lang.Runnable r5, long r6) {
            r3 = this;
            if (r5 == 0) goto L2a
            if (r4 == 0) goto L2a
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 >= 0) goto Lb
            goto L2a
        Lb:
            java.util.concurrent.ConcurrentHashMap r0 = cn.jiguang.commons.L.o.f908d
            java.lang.Object r1 = r0.get(r4)
            cn.jiguang.commons.L.o$c r1 = (cn.jiguang.commons.L.o.c) r1
            if (r1 == 0) goto L1d
            r1.a()
            android.os.Handler r2 = cn.jiguang.commons.L.o.f907c
            r2.removeCallbacks(r1)
        L1d:
            cn.jiguang.commons.L.o$c r1 = new cn.jiguang.commons.L.o$c
            r1.<init>(r5, r4)
            r0.put(r4, r1)
            android.os.Handler r4 = cn.jiguang.commons.L.o.f907c
            r4.postDelayed(r1, r6)
        L2a:
            return
    }

    public boolean a(java.lang.String r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L10
            java.util.concurrent.ConcurrentHashMap r0 = cn.jiguang.commons.L.o.f908d
            boolean r2 = r0.containsKey(r2)
            if (r2 == 0) goto L10
            r2 = 1
            return r2
        L10:
            r2 = 0
            return r2
    }
}
