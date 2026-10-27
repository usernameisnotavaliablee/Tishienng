package com.ss.android.downloadlib;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class g {
    private static volatile com.ss.android.downloadlib.g f;
    private final r2.a a;
    private final com.ss.android.downloadlib.c b;
    private final y2.a c;
    private y2.b d;
    private long e;

    static class a implements java.lang.Runnable {
        final /* synthetic */ android.content.Context a;

        a(android.content.Context r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                com.ss.android.downloadlib.g r0 = new com.ss.android.downloadlib.g
                android.content.Context r1 = r3.a
                r2 = 0
                r0.<init>(r1, r2)
                com.ss.android.downloadlib.g.d(r0)
                return
        }
    }

    class b implements java.lang.Runnable {
        final /* synthetic */ java.lang.String a;
        final /* synthetic */ int b;
        final /* synthetic */ com.ss.android.downloadlib.g c;

        b(com.ss.android.downloadlib.g r1, java.lang.String r2, int r3) {
                r0 = this;
                r0.c = r1
                r0.a = r2
                r0.b = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                com.ss.android.downloadlib.g r0 = r3.c
                com.ss.android.downloadlib.c r0 = com.ss.android.downloadlib.g.t(r0)
                java.lang.String r1 = r3.a
                int r2 = r3.b
                r0.l(r1, r2)
                return
        }
    }

    class c implements java.lang.Runnable {
        final /* synthetic */ java.lang.String a;
        final /* synthetic */ boolean b;
        final /* synthetic */ com.ss.android.downloadlib.g c;

        c(com.ss.android.downloadlib.g r1, java.lang.String r2, boolean r3) {
                r0 = this;
                r0.c = r1
                r0.a = r2
                r0.b = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                com.ss.android.downloadlib.g r0 = r3.c
                com.ss.android.downloadlib.c r0 = com.ss.android.downloadlib.g.t(r0)
                java.lang.String r1 = r3.a
                boolean r2 = r3.b
                r0.p(r1, r2)
                return
        }
    }

    class d implements java.lang.Runnable {
        final /* synthetic */ android.content.Context a;
        final /* synthetic */ int b;
        final /* synthetic */ com.ss.android.j.j.cw.e c;
        final /* synthetic */ com.ss.android.j.j.cw.b d;
        final /* synthetic */ com.ss.android.downloadlib.g e;

        d(com.ss.android.downloadlib.g r1, android.content.Context r2, int r3, com.ss.android.j.j.cw.e r4, com.ss.android.j.j.cw.b r5) {
                r0 = this;
                r0.e = r1
                r0.a = r2
                r0.b = r3
                r0.c = r4
                r0.d = r5
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r5 = this;
                com.ss.android.downloadlib.g r0 = r5.e
                com.ss.android.downloadlib.c r0 = com.ss.android.downloadlib.g.t(r0)
                android.content.Context r1 = r5.a
                int r2 = r5.b
                com.ss.android.j.j.cw.e r3 = r5.c
                com.ss.android.j.j.cw.b r4 = r5.d
                r0.f(r1, r2, r3, r4)
                return
        }
    }

    class e implements java.lang.Runnable {
        final /* synthetic */ java.lang.String a;
        final /* synthetic */ long b;
        final /* synthetic */ int c;
        final /* synthetic */ com.ss.android.j.j.cw.g d;
        final /* synthetic */ com.ss.android.j.j.cw.c e;
        final /* synthetic */ v2.d f;
        final /* synthetic */ v2.h g;
        final /* synthetic */ com.ss.android.downloadlib.g h;

        e(com.ss.android.downloadlib.g r1, java.lang.String r2, long r3, int r5, com.ss.android.j.j.cw.g r6, com.ss.android.j.j.cw.c r7, v2.d r8, v2.h r9) {
                r0 = this;
                r0.h = r1
                r0.a = r2
                r0.b = r3
                r0.c = r5
                r0.d = r6
                r0.e = r7
                r0.f = r8
                r0.g = r9
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r10 = this;
                com.ss.android.downloadlib.g r0 = r10.h
                com.ss.android.downloadlib.c r1 = com.ss.android.downloadlib.g.t(r0)
                java.lang.String r2 = r10.a
                long r3 = r10.b
                int r5 = r10.c
                com.ss.android.j.j.cw.g r6 = r10.d
                com.ss.android.j.j.cw.c r7 = r10.e
                v2.d r8 = r10.f
                v2.h r9 = r10.g
                r1.n(r2, r3, r5, r6, r7, r8, r9)
                return
        }
    }

    class f implements java.lang.Runnable {
        final /* synthetic */ java.lang.String a;
        final /* synthetic */ long b;
        final /* synthetic */ int c;
        final /* synthetic */ com.ss.android.j.j.cw.g d;
        final /* synthetic */ com.ss.android.j.j.cw.c e;
        final /* synthetic */ com.ss.android.downloadlib.g f;

        f(com.ss.android.downloadlib.g r1, java.lang.String r2, long r3, int r5, com.ss.android.j.j.cw.g r6, com.ss.android.j.j.cw.c r7) {
                r0 = this;
                r0.f = r1
                r0.a = r2
                r0.b = r3
                r0.c = r5
                r0.d = r6
                r0.e = r7
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r8 = this;
                com.ss.android.downloadlib.g r0 = r8.f
                com.ss.android.downloadlib.c r1 = com.ss.android.downloadlib.g.t(r0)
                java.lang.String r2 = r8.a
                long r3 = r8.b
                int r5 = r8.c
                com.ss.android.j.j.cw.g r6 = r8.d
                com.ss.android.j.j.cw.c r7 = r8.e
                r1.m(r2, r3, r5, r6, r7)
                return
        }
    }

    /* renamed from: com.ss.android.downloadlib.g$g, reason: collision with other inner class name */
    class RunnableC0214g implements java.lang.Runnable {
        final /* synthetic */ java.lang.String a;
        final /* synthetic */ long b;
        final /* synthetic */ int c;
        final /* synthetic */ com.ss.android.j.j.cw.g d;
        final /* synthetic */ com.ss.android.j.j.cw.c e;
        final /* synthetic */ v2.h f;
        final /* synthetic */ com.ss.android.downloadlib.g g;

        RunnableC0214g(com.ss.android.downloadlib.g r1, java.lang.String r2, long r3, int r5, com.ss.android.j.j.cw.g r6, com.ss.android.j.j.cw.c r7, v2.h r8) {
                r0 = this;
                r0.g = r1
                r0.a = r2
                r0.b = r3
                r0.c = r5
                r0.d = r6
                r0.e = r7
                r0.f = r8
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r9 = this;
                com.ss.android.downloadlib.g r0 = r9.g
                com.ss.android.downloadlib.c r1 = com.ss.android.downloadlib.g.t(r0)
                java.lang.String r2 = r9.a
                long r3 = r9.b
                int r5 = r9.c
                com.ss.android.j.j.cw.g r6 = r9.d
                com.ss.android.j.j.cw.c r7 = r9.e
                v2.h r8 = r9.f
                r1.o(r2, r3, r5, r6, r7, r8)
                return
        }
    }

    private g(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            com.ss.android.downloadlib.c r0 = com.ss.android.downloadlib.c.d()
            r2.b = r0
            com.ss.android.downloadlib.a r0 = new com.ss.android.downloadlib.a
            r0.<init>()
            r2.a = r0
            long r0 = java.lang.System.currentTimeMillis()
            r2.e = r0
            r2.v(r3)
            com.ss.android.downloadlib.d r3 = com.ss.android.downloadlib.d.d()
            r2.c = r3
            return
    }

    /* synthetic */ g(android.content.Context r1, com.ss.android.downloadlib.g.a r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static com.ss.android.downloadlib.g c(android.content.Context r2) {
            com.ss.android.downloadlib.g r0 = com.ss.android.downloadlib.g.f
            if (r0 != 0) goto L1a
            java.lang.Class<com.ss.android.downloadlib.g> r0 = com.ss.android.downloadlib.g.class
            monitor-enter(r0)
            com.ss.android.downloadlib.g r1 = com.ss.android.downloadlib.g.f     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L16
            com.ss.android.downloadlib.g$a r1 = new com.ss.android.downloadlib.g$a     // Catch: java.lang.Throwable -> L14
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L14
            com.ss.android.downloadlib.up.b.c(r1)     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            r2 = move-exception
            goto L18
        L16:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            goto L1a
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r2
        L1a:
            com.ss.android.downloadlib.g r2 = com.ss.android.downloadlib.g.f
            return r2
    }

    static /* synthetic */ com.ss.android.downloadlib.g d(com.ss.android.downloadlib.g r0) {
            com.ss.android.downloadlib.g.f = r0
            return r0
    }

    private com.ss.android.downloadlib.c q() {
            r1 = this;
            com.ss.android.downloadlib.c r0 = r1.b
            return r0
    }

    static /* synthetic */ com.ss.android.downloadlib.c t(com.ss.android.downloadlib.g r0) {
            com.ss.android.downloadlib.c r0 = r0.q()
            return r0
    }

    private void v(android.content.Context r8) {
            r7 = this;
            com.ss.android.downloadlib.addownload.m.i(r8)
            android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
            com.ss.android.socialbase.downloader.downloader.ae.xt(r0)
            com.ss.android.downloadlib.addownload.o$f r0 = com.ss.android.downloadlib.addownload.o.f.c()
            r0.v()
            com.ss.android.socialbase.appdownloader.f r1 = com.ss.android.socialbase.appdownloader.f.L()
            android.content.Context r2 = com.ss.android.downloadlib.addownload.m.getContext()
            com.ss.android.downloadlib.b$d r4 = new com.ss.android.downloadlib.b$d
            r4.<init>()
            com.ss.android.downloadlib.b$g r5 = new com.ss.android.downloadlib.b$g
            r5.<init>(r8)
            com.ss.android.downloadlib.b r6 = new com.ss.android.downloadlib.b
            r6.<init>()
            java.lang.String r3 = "misc_config"
            r1.s(r2, r3, r4, r5, r6)
            com.ss.android.downloadlib.b$h r0 = new com.ss.android.downloadlib.b$h
            r0.<init>()
            com.ss.android.socialbase.appdownloader.f r1 = com.ss.android.socialbase.appdownloader.f.L()
            r1.E(r0)
            com.ss.android.socialbase.downloader.downloader.ae r8 = com.ss.android.socialbase.downloader.downloader.ae.xt(r8)
            r8.j(r0)
            com.ss.android.socialbase.appdownloader.f r8 = com.ss.android.socialbase.appdownloader.f.L()
            com.ss.android.downloadlib.addownload.n r0 = new com.ss.android.downloadlib.addownload.n
            r0.<init>()
            r8.w(r0)
            com.ss.android.downloadlib.b$j r8 = new com.ss.android.downloadlib.b$j
            r8.<init>()
            com.ss.android.socialbase.downloader.downloader.cw.j(r8)
            com.ss.android.socialbase.appdownloader.f r8 = com.ss.android.socialbase.appdownloader.f.L()
            com.ss.android.downloadlib.e$c r0 = com.ss.android.downloadlib.e.c.b()
            r8.D(r0)
            return
    }

    public void a() {
            r1 = this;
            com.ss.android.downloadlib.e r0 = com.ss.android.downloadlib.e.c()
            r0.g()
            return
    }

    public void b() {
            r2 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r2.e = r0
            return
    }

    public com.ss.android.socialbase.downloader.ae.cw e(java.lang.String r2, java.lang.String r3, boolean r4) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto Ld
            if (r4 == 0) goto Ld
            com.ss.android.socialbase.downloader.ae.cw r2 = r1.u(r2)
            return r2
        Ld:
            android.content.Context r4 = com.ss.android.downloadlib.addownload.m.getContext()
            com.ss.android.socialbase.downloader.downloader.ae r4 = com.ss.android.socialbase.downloader.downloader.ae.xt(r4)
            com.ss.android.socialbase.downloader.ae.cw r2 = r4.xt(r2, r3)
            return r2
    }

    public r2.a f() {
            r1 = this;
            r2.a r0 = r1.a
            return r0
    }

    public r2.a g(java.lang.String r3) {
            r2 = this;
            com.ss.android.downloadlib.h r0 = com.ss.android.downloadlib.h.a()
            v2.l r0 = r0.b()
            if (r0 == 0) goto L15
            boolean r1 = r0.j(r3)
            if (r1 == 0) goto L15
            r2.a r3 = r0.xt(r3)
            return r3
        L15:
            r2.a r3 = r2.a
            return r3
    }

    @androidx.annotation.MainThread
    public void h(android.content.Context r7, int r8, com.ss.android.j.j.cw.e r9, com.ss.android.j.j.cw.b r10) {
            r6 = this;
            com.ss.android.downloadlib.g$d r0 = new com.ss.android.downloadlib.g$d
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            com.ss.android.downloadlib.up.b.c(r0)
            return
    }

    @androidx.annotation.MainThread
    public void i(java.lang.String r2, int r3) {
            r1 = this;
            com.ss.android.downloadlib.g$b r0 = new com.ss.android.downloadlib.g$b
            r0.<init>(r1, r2, r3)
            com.ss.android.downloadlib.up.b.c(r0)
            return
    }

    @androidx.annotation.MainThread
    public void j(java.lang.String r9, long r10, int r12, com.ss.android.j.j.cw.g r13, com.ss.android.j.j.cw.c r14) {
            r8 = this;
            com.ss.android.downloadlib.g$f r0 = new com.ss.android.downloadlib.g$f
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r12
            r6 = r13
            r7 = r14
            r0.<init>(r1, r2, r3, r5, r6, r7)
            com.ss.android.downloadlib.up.b.c(r0)
            return
    }

    @androidx.annotation.MainThread
    public void k(java.lang.String r11, long r12, int r14, com.ss.android.j.j.cw.g r15, com.ss.android.j.j.cw.c r16, v2.d r17, v2.h r18) {
            r10 = this;
            com.ss.android.downloadlib.g$e r0 = new com.ss.android.downloadlib.g$e
            r1 = r10
            r2 = r11
            r3 = r12
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9)
            com.ss.android.downloadlib.up.b.c(r0)
            return
    }

    @androidx.annotation.MainThread
    public void l(java.lang.String r10, long r11, int r13, com.ss.android.j.j.cw.g r14, com.ss.android.j.j.cw.c r15, v2.h r16) {
            r9 = this;
            com.ss.android.downloadlib.g$g r0 = new com.ss.android.downloadlib.g$g
            r1 = r9
            r2 = r10
            r3 = r11
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r0.<init>(r1, r2, r3, r5, r6, r7, r8)
            com.ss.android.downloadlib.up.b.c(r0)
            return
    }

    @androidx.annotation.MainThread
    public void m(java.lang.String r2, boolean r3) {
            r1 = this;
            com.ss.android.downloadlib.g$c r0 = new com.ss.android.downloadlib.g$c
            r0.<init>(r1, r2, r3)
            com.ss.android.downloadlib.up.b.c(r0)
            return
    }

    public void n(s2.a r2) {
            r1 = this;
            com.ss.android.downloadlib.c r0 = r1.q()
            r0.q(r2)
            return
    }

    public java.lang.String o() {
            r1 = this;
            java.lang.String r0 = com.ss.android.downloadlib.addownload.m.I()
            return r0
    }

    public y2.a p() {
            r1 = this;
            y2.a r0 = r1.c
            return r0
    }

    public y2.b r() {
            r1 = this;
            y2.b r0 = r1.d
            if (r0 != 0) goto La
            com.ss.android.downloadlib.j r0 = com.ss.android.downloadlib.j.j()
            r1.d = r0
        La:
            y2.b r0 = r1.d
            return r0
    }

    public long s() {
            r2 = this;
            long r0 = r2.e
            return r0
    }

    public com.ss.android.socialbase.downloader.ae.cw u(java.lang.String r3) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L8
            r3 = 0
            return r3
        L8:
            com.ss.android.socialbase.appdownloader.f r0 = com.ss.android.socialbase.appdownloader.f.L()
            android.content.Context r1 = com.ss.android.downloadlib.addownload.m.getContext()
            com.ss.android.socialbase.downloader.ae.cw r3 = r0.j(r1, r3)
            return r3
    }
}
