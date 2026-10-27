package com.ss.android.socialbase.appdownloader;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class g {
    private final java.util.Queue<java.lang.Integer> a;
    private boolean b;
    private long c;
    private long d;
    private java.lang.ref.SoftReference<com.ss.android.socialbase.appdownloader.view.JumpUnknownSourceActivity> e;
    private android.os.Handler f;
    private java.lang.Runnable g;

    class a implements java.lang.Runnable {
        final /* synthetic */ com.ss.android.socialbase.appdownloader.g a;

        a(com.ss.android.socialbase.appdownloader.g r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                com.ss.android.socialbase.appdownloader.g r0 = r1.a
                com.ss.android.socialbase.appdownloader.g.g(r0)
                return
        }
    }

    class b implements com.ss.android.socialbase.downloader.j.j.j {
        final /* synthetic */ com.ss.android.socialbase.appdownloader.g a;

        b(com.ss.android.socialbase.appdownloader.g r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void cw() {
                r0 = this;
                return
        }

        public void xt() {
                r6 = this;
                com.ss.android.socialbase.appdownloader.g r0 = r6.a
                java.util.Queue r0 = com.ss.android.socialbase.appdownloader.g.o(r0)
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto Ld
                goto L4b
            Ld:
                com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.cw()
                java.lang.String r1 = "install_on_resume_install_interval"
                r2 = 120000(0x1d4c0, double:5.9288E-319)
                long r0 = r0.j(r1, r2)
                long r2 = java.lang.System.currentTimeMillis()
                com.ss.android.socialbase.appdownloader.g r4 = r6.a
                long r4 = com.ss.android.socialbase.appdownloader.g.a(r4)
                long r2 = r2 - r4
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 >= 0) goto L4c
                com.ss.android.socialbase.appdownloader.g r4 = r6.a
                android.os.Handler r4 = com.ss.android.socialbase.appdownloader.g.l(r4)
                com.ss.android.socialbase.appdownloader.g r5 = r6.a
                java.lang.Runnable r5 = com.ss.android.socialbase.appdownloader.g.j(r5)
                boolean r4 = com.ss.android.socialbase.appdownloader.h.a(r4, r5)
                if (r4 != 0) goto L4b
                com.ss.android.socialbase.appdownloader.g r4 = r6.a
                android.os.Handler r4 = com.ss.android.socialbase.appdownloader.g.l(r4)
                com.ss.android.socialbase.appdownloader.g r5 = r6.a
                java.lang.Runnable r5 = com.ss.android.socialbase.appdownloader.g.j(r5)
                long r0 = r0 - r2
                r4.postDelayed(r5, r0)
            L4b:
                return
            L4c:
                com.ss.android.socialbase.appdownloader.g r0 = r6.a
                long r1 = java.lang.System.currentTimeMillis()
                com.ss.android.socialbase.appdownloader.g.e(r0, r1)
                com.ss.android.socialbase.appdownloader.g r0 = r6.a
                com.ss.android.socialbase.appdownloader.g.g(r0)
                return
        }
    }

    class c implements java.lang.Runnable {
        final /* synthetic */ android.content.Context a;
        final /* synthetic */ java.lang.Integer b;
        final /* synthetic */ com.ss.android.socialbase.appdownloader.g c;

        c(com.ss.android.socialbase.appdownloader.g r1, android.content.Context r2, java.lang.Integer r3) {
                r0 = this;
                r0.c = r1
                r0.a = r2
                r0.b = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                com.ss.android.socialbase.appdownloader.g r0 = r4.c
                android.content.Context r1 = r4.a
                java.lang.Integer r2 = r4.b
                int r2 = r2.intValue()
                r3 = 0
                com.ss.android.socialbase.appdownloader.g.d(r0, r1, r2, r3)
                return
        }
    }

    class d implements java.lang.Runnable {
        final /* synthetic */ android.content.Context a;
        final /* synthetic */ int b;
        final /* synthetic */ boolean c;
        final /* synthetic */ com.ss.android.socialbase.appdownloader.g d;

        d(com.ss.android.socialbase.appdownloader.g r1, android.content.Context r2, int r3, boolean r4) {
                r0 = this;
                r0.d = r1
                r0.a = r2
                r0.b = r3
                r0.c = r4
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                com.ss.android.socialbase.appdownloader.g r0 = r4.d
                android.content.Context r1 = r4.a
                int r2 = r4.b
                boolean r3 = r4.c
                r0.c(r1, r2, r3)
                return
        }
    }

    private static class e {
        private static final com.ss.android.socialbase.appdownloader.g a = null;

        static {
                com.ss.android.socialbase.appdownloader.g r0 = new com.ss.android.socialbase.appdownloader.g
                r1 = 0
                r0.<init>(r1)
                com.ss.android.socialbase.appdownloader.g.e.a = r0
                return
        }

        public e() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.ss.android.socialbase.appdownloader.g a() {
                com.ss.android.socialbase.appdownloader.g r0 = com.ss.android.socialbase.appdownloader.g.e.a
                return r0
        }
    }

    private g() {
            r2 = this;
            r2.<init>()
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r2.a = r0
            r0 = 0
            r2.b = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.f = r0
            com.ss.android.socialbase.appdownloader.g$a r0 = new com.ss.android.socialbase.appdownloader.g$a
            r0.<init>(r2)
            r2.g = r0
            com.ss.android.socialbase.downloader.j.j r0 = com.ss.android.socialbase.downloader.j.j.j()
            com.ss.android.socialbase.appdownloader.g$b r1 = new com.ss.android.socialbase.appdownloader.g$b
            r1.<init>(r2)
            r0.j(r1)
            return
    }

    /* synthetic */ g(com.ss.android.socialbase.appdownloader.g.a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ long a(com.ss.android.socialbase.appdownloader.g r2) {
            long r0 = r2.d
            return r0
    }

    private void b() {
            r5 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L11
            com.ss.android.socialbase.downloader.j.j r0 = com.ss.android.socialbase.downloader.j.j.j()
            boolean r0 = r0.xt()
            if (r0 != 0) goto L11
            return
        L11:
            java.util.Queue<java.lang.Integer> r0 = r5.a
            monitor-enter(r0)
            java.util.Queue<java.lang.Integer> r1 = r5.a     // Catch: java.lang.Throwable -> L54
            java.lang.Object r1 = r1.poll()     // Catch: java.lang.Throwable -> L54
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L54
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L54
            android.os.Handler r0 = r5.f
            java.lang.Runnable r2 = r5.g
            r0.removeCallbacks(r2)
            r0 = 0
            if (r1 == 0) goto L51
            android.content.Context r2 = com.ss.android.socialbase.downloader.downloader.cw.nd()
            android.os.Looper r3 = android.os.Looper.myLooper()
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            if (r3 == r4) goto L40
            android.os.Handler r0 = r5.f
            com.ss.android.socialbase.appdownloader.g$c r3 = new com.ss.android.socialbase.appdownloader.g$c
            r3.<init>(r5, r2, r1)
            r0.post(r3)
            goto L47
        L40:
            int r1 = r1.intValue()
            r5.m(r2, r1, r0)
        L47:
            android.os.Handler r0 = r5.f
            java.lang.Runnable r1 = r5.g
            r2 = 20000(0x4e20, double:9.8813E-320)
            r0.postDelayed(r1, r2)
            return
        L51:
            r5.b = r0
            return
        L54:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L54
            throw r1
    }

    static /* synthetic */ int d(com.ss.android.socialbase.appdownloader.g r0, android.content.Context r1, int r2, boolean r3) {
            int r0 = r0.m(r1, r2, r3)
            return r0
    }

    static /* synthetic */ long e(com.ss.android.socialbase.appdownloader.g r0, long r1) {
            r0.d = r1
            return r1
    }

    public static com.ss.android.socialbase.appdownloader.g f() {
            com.ss.android.socialbase.appdownloader.g r0 = com.ss.android.socialbase.appdownloader.g.e.a()
            return r0
    }

    static /* synthetic */ void g(com.ss.android.socialbase.appdownloader.g r0) {
            r0.b()
            return
    }

    static /* synthetic */ java.lang.Runnable j(com.ss.android.socialbase.appdownloader.g r0) {
            java.lang.Runnable r0 = r0.g
            return r0
    }

    private boolean k() {
            r5 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r5.c
            long r0 = r0 - r2
            r2 = 1000(0x3e8, double:4.94E-321)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto Lf
            r0 = 1
            return r0
        Lf:
            r0 = 0
            return r0
    }

    static /* synthetic */ android.os.Handler l(com.ss.android.socialbase.appdownloader.g r0) {
            android.os.Handler r0 = r0.f
            return r0
    }

    private int m(android.content.Context r1, int r2, boolean r3) {
            r0 = this;
            int r1 = com.ss.android.socialbase.appdownloader.b.J(r1, r2, r3)
            r2 = 1
            if (r1 != r2) goto L9
            r0.b = r2
        L9:
            long r2 = java.lang.System.currentTimeMillis()
            r0.c = r2
            return r1
    }

    static /* synthetic */ java.util.Queue o(com.ss.android.socialbase.appdownloader.g r0) {
            java.util.Queue<java.lang.Integer> r0 = r0.a
            return r0
    }

    public int c(android.content.Context r5, int r6, boolean r7) {
            r4 = this;
            if (r7 == 0) goto L7
            int r5 = r4.m(r5, r6, r7)
            return r5
        L7:
            boolean r0 = r4.k()
            r1 = 1
            if (r0 == 0) goto L1b
            android.os.Handler r0 = r4.f
            com.ss.android.socialbase.appdownloader.g$d r2 = new com.ss.android.socialbase.appdownloader.g$d
            r2.<init>(r4, r5, r6, r7)
            r5 = 1000(0x3e8, double:4.94E-321)
            r0.postDelayed(r2, r5)
            return r1
        L1b:
            com.ss.android.socialbase.downloader.j.j r0 = com.ss.android.socialbase.downloader.j.j.j()
            boolean r0 = r0.xt()
            if (r0 == 0) goto L31
            java.lang.String r0 = "leaves"
            java.lang.String r1 = "on Foreground"
            com.ss.android.socialbase.downloader.m.j.cw(r0, r1)
            int r5 = r4.m(r5, r6, r7)
            return r5
        L31:
            boolean r0 = com.ss.android.socialbase.appdownloader.j.m()
            if (r0 == 0) goto L38
            return r1
        L38:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r0 >= r2) goto L40
            r0 = 1
            goto L41
        L40:
            r0 = 0
        L41:
            java.util.Queue<java.lang.Integer> r2 = r4.a
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L54
            boolean r2 = r4.b
            if (r2 != 0) goto L54
            if (r0 == 0) goto L54
            int r5 = r4.m(r5, r6, r7)
            return r5
        L54:
            com.ss.android.socialbase.downloader.jy.j r5 = com.ss.android.socialbase.downloader.jy.j.cw()
            java.lang.String r7 = "install_queue_size"
            r2 = 3
            int r5 = r5.j(r7, r2)
            java.util.Queue<java.lang.Integer> r7 = r4.a
            monitor-enter(r7)
        L62:
            java.util.Queue<java.lang.Integer> r2 = r4.a     // Catch: java.lang.Throwable -> L70
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L70
            if (r2 <= r5) goto L72
            java.util.Queue<java.lang.Integer> r2 = r4.a     // Catch: java.lang.Throwable -> L70
            r2.poll()     // Catch: java.lang.Throwable -> L70
            goto L62
        L70:
            r5 = move-exception
            goto Lae
        L72:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L8f
            android.os.Handler r5 = r4.f
            java.lang.Runnable r7 = r4.g
            r5.removeCallbacks(r7)
            com.ss.android.socialbase.downloader.jy.j r5 = com.ss.android.socialbase.downloader.jy.j.j(r6)
            java.lang.String r7 = "install_queue_timeout"
            r2 = 20000(0x4e20, double:9.8813E-320)
            long r2 = r5.j(r7, r2)
            android.os.Handler r5 = r4.f
            java.lang.Runnable r7 = r4.g
            r5.postDelayed(r7, r2)
        L8f:
            java.util.Queue<java.lang.Integer> r5 = r4.a
            monitor-enter(r5)
            java.util.Queue<java.lang.Integer> r7 = r4.a     // Catch: java.lang.Throwable -> La8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> La8
            boolean r7 = r7.contains(r0)     // Catch: java.lang.Throwable -> La8
            if (r7 != 0) goto Laa
            java.util.Queue<java.lang.Integer> r7 = r4.a     // Catch: java.lang.Throwable -> La8
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> La8
            r7.offer(r6)     // Catch: java.lang.Throwable -> La8
            goto Laa
        La8:
            r6 = move-exception
            goto Lac
        Laa:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La8
            return r1
        Lac:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La8
            throw r6
        Lae:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L70
            throw r5
    }

    public void h(com.ss.android.socialbase.appdownloader.view.JumpUnknownSourceActivity r2) {
            r1 = this;
            java.lang.ref.SoftReference r0 = new java.lang.ref.SoftReference
            r0.<init>(r2)
            r1.e = r0
            return
    }

    void i(com.ss.android.socialbase.downloader.ae.cw r1, java.lang.String r2) {
            r0 = this;
            if (r1 == 0) goto Lb
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto Lb
            r0.b()
        Lb:
            return
    }

    public com.ss.android.socialbase.appdownloader.view.JumpUnknownSourceActivity n() {
            r2 = this;
            java.lang.ref.SoftReference<com.ss.android.socialbase.appdownloader.view.JumpUnknownSourceActivity> r0 = r2.e
            r1 = 0
            if (r0 != 0) goto L7
            r0 = r1
            goto Ld
        L7:
            java.lang.Object r0 = r0.get()
            com.ss.android.socialbase.appdownloader.view.JumpUnknownSourceActivity r0 = (com.ss.android.socialbase.appdownloader.view.JumpUnknownSourceActivity) r0
        Ld:
            r2.e = r1
            return r0
    }
}
