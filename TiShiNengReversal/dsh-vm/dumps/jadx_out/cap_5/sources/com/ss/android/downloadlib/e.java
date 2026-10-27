package com.ss.android.downloadlib;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class e {
    private java.util.concurrent.ExecutorService a;
    private java.util.concurrent.ExecutorService b;
    private java.util.concurrent.ScheduledExecutorService c;
    private java.util.concurrent.ExecutorService d;

    class a implements java.lang.Runnable {
        final /* synthetic */ com.ss.android.downloadlib.e a;

        a(com.ss.android.downloadlib.e r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r15 = this;
                java.lang.Class<com.ss.android.downloadlib.e> r1 = com.ss.android.downloadlib.e.class
                monitor-enter(r1)
                java.lang.String r2 = "sp_ad_download_event"
                java.lang.String r3 = "sp_download_finish_cache"
                java.lang.String r4 = "sp_delay_operation_info"
                java.lang.String r5 = "sp_ttdownloader_md5"
                java.lang.String r6 = "sp_name_installed_app"
                java.lang.String r7 = "misc_config"
                java.lang.String r8 = "sp_ad_install_back_dialog"
                java.lang.String r9 = "sp_ttdownloader_clean"
                java.lang.String r10 = "sp_order_download"
                java.lang.String r11 = "sp_a_b_c"
                java.lang.String r12 = "sp_ah_config"
                java.lang.String r13 = "sp_download_info"
                java.lang.String r14 = "sp_appdownloader"
                java.lang.String[] r0 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14}     // Catch: java.lang.Throwable -> L7d
                r2 = 0
                r3 = 0
            L23:
                r4 = 13
                if (r3 >= r4) goto L41
                r4 = r0[r3]     // Catch: java.lang.Throwable -> L7d
                android.content.Context r5 = com.ss.android.downloadlib.addownload.m.getContext()     // Catch: java.lang.Throwable -> L7d
                android.content.SharedPreferences r4 = com.bytedance.sdk.openadsdk.ats.cw.j(r5, r4, r2)     // Catch: java.lang.Throwable -> L7d
                if (r4 == 0) goto L3e
                android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch: java.lang.Throwable -> L7d
                android.content.SharedPreferences$Editor r4 = r4.clear()     // Catch: java.lang.Throwable -> L7d
                r4.apply()     // Catch: java.lang.Throwable -> L7d
            L3e:
                int r3 = r3 + 1
                goto L23
            L41:
                com.ss.android.socialbase.downloader.downloader.vl r0 = com.ss.android.socialbase.downloader.downloader.cw.x()     // Catch: java.lang.Throwable -> L7d
                boolean r2 = r0 instanceof com.ss.android.socialbase.downloader.impls.r     // Catch: java.lang.Throwable -> L7d
                if (r2 != 0) goto L4d
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L4b
                return
            L4b:
                r0 = move-exception
                goto L7f
            L4d:
                com.ss.android.socialbase.downloader.impls.r r0 = (com.ss.android.socialbase.downloader.impls.r) r0     // Catch: java.lang.Throwable -> L7d
                com.ss.android.socialbase.downloader.impls.qv r0 = r0.j()     // Catch: java.lang.Throwable -> L7d
                android.util.SparseArray r0 = r0.j()     // Catch: java.lang.Throwable -> L7d
                int r2 = r0.size()     // Catch: java.lang.Throwable -> L7d
                int r2 = r2 + (-1)
            L5d:
                if (r2 < 0) goto L7d
                int r3 = r0.keyAt(r2)     // Catch: java.lang.Throwable -> L7d
                java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Throwable -> L7d
                com.ss.android.socialbase.downloader.ae.cw r3 = (com.ss.android.socialbase.downloader.ae.cw) r3     // Catch: java.lang.Throwable -> L7d
                if (r3 == 0) goto L7a
                android.content.Context r4 = com.ss.android.downloadlib.addownload.m.getContext()     // Catch: java.lang.Throwable -> L7d
                com.ss.android.socialbase.downloader.downloader.ae r4 = com.ss.android.socialbase.downloader.downloader.ae.xt(r4)     // Catch: java.lang.Throwable -> L7d
                int r3 = r3.ae()     // Catch: java.lang.Throwable -> L7d
                r4.oq(r3)     // Catch: java.lang.Throwable -> L7d
            L7a:
                int r2 = r2 + (-1)
                goto L5d
            L7d:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L4b
                return
            L7f:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L4b
                throw r0
        }
    }

    private static class b {
        private static com.ss.android.downloadlib.e a;

        static {
                com.ss.android.downloadlib.e r0 = new com.ss.android.downloadlib.e
                r1 = 0
                r0.<init>(r1)
                com.ss.android.downloadlib.e.b.a = r0
                return
        }

        public b() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.ss.android.downloadlib.e a() {
                com.ss.android.downloadlib.e r0 = com.ss.android.downloadlib.e.b.a
                return r0
        }
    }

    public class c implements w2.j {
        private static volatile com.ss.android.downloadlib.e.c b;
        private java.util.List<w2.j> a;

        class a implements w2.i {
            final /* synthetic */ int a;
            final /* synthetic */ com.ss.android.socialbase.downloader.ae.cw b;
            final /* synthetic */ w2.i c;
            final /* synthetic */ com.ss.android.downloadlib.e.c d;

            a(com.ss.android.downloadlib.e.c r1, int r2, com.ss.android.socialbase.downloader.ae.cw r3, w2.i r4) {
                    r0 = this;
                    r0.d = r1
                    r0.a = r2
                    r0.b = r3
                    r0.c = r4
                    r0.<init>()
                    return
            }

            public void j() {
                    r4 = this;
                    int r0 = r4.a
                    int r0 = r0 + 1
                    com.ss.android.downloadlib.e$c r1 = r4.d
                    com.ss.android.socialbase.downloader.ae.cw r2 = r4.b
                    w2.i r3 = r4.c
                    com.ss.android.downloadlib.e.c.c(r1, r2, r0, r3)
                    return
            }
        }

        private c() {
                r2 = this;
                r2.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.a = r0
                com.ss.android.downloadlib.e$e r1 = new com.ss.android.downloadlib.e$e
                r1.<init>()
                r0.add(r1)
                java.util.List<w2.j> r0 = r2.a
                com.ss.android.downloadlib.e$d r1 = new com.ss.android.downloadlib.e$d
                r1.<init>()
                r0.add(r1)
                return
        }

        public static com.ss.android.downloadlib.e.c b() {
                com.ss.android.downloadlib.e$c r0 = com.ss.android.downloadlib.e.c.b
                if (r0 != 0) goto L19
                java.lang.Class<com.ss.android.downloadlib.e$c> r0 = com.ss.android.downloadlib.e.c.class
                monitor-enter(r0)
                com.ss.android.downloadlib.e$c r1 = com.ss.android.downloadlib.e.c.b     // Catch: java.lang.Throwable -> L13
                if (r1 != 0) goto L15
                com.ss.android.downloadlib.e$c r1 = new com.ss.android.downloadlib.e$c     // Catch: java.lang.Throwable -> L13
                r1.<init>()     // Catch: java.lang.Throwable -> L13
                com.ss.android.downloadlib.e.c.b = r1     // Catch: java.lang.Throwable -> L13
                goto L15
            L13:
                r1 = move-exception
                goto L17
            L15:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                goto L19
            L17:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                throw r1
            L19:
                com.ss.android.downloadlib.e$c r0 = com.ss.android.downloadlib.e.c.b
                return r0
        }

        static /* synthetic */ void c(com.ss.android.downloadlib.e.c r0, com.ss.android.socialbase.downloader.ae.cw r1, int r2, w2.i r3) {
                r0.d(r1, r2, r3)
                return
        }

        private void d(com.ss.android.socialbase.downloader.ae.cw r3, int r4, w2.i r5) {
                r2 = this;
                java.util.List<w2.j> r0 = r2.a
                int r0 = r0.size()
                if (r4 == r0) goto L1c
                if (r4 >= 0) goto Lb
                goto L1c
            Lb:
                java.util.List<w2.j> r0 = r2.a
                java.lang.Object r0 = r0.get(r4)
                w2.j r0 = (w2.j) r0
                com.ss.android.downloadlib.e$c$a r1 = new com.ss.android.downloadlib.e$c$a
                r1.<init>(r2, r4, r3, r5)
                r0.a(r3, r1)
                return
            L1c:
                r5.j()
                return
        }

        public void a(com.ss.android.socialbase.downloader.ae.cw r2, w2.i r3) {
                r1 = this;
                if (r2 == 0) goto L10
                java.util.List<w2.j> r0 = r1.a
                int r0 = r0.size()
                if (r0 != 0) goto Lb
                goto L10
            Lb:
                r0 = 0
                r1.d(r2, r0, r3)
                return
            L10:
                if (r3 == 0) goto L15
                r3.j()
            L15:
                return
        }
    }

    public class d implements w2.j {

        class a implements com.ss.android.downloadlib.guide.install.a {
            final /* synthetic */ w2.i a;
            final /* synthetic */ com.ss.android.downloadlib.e.d b;

            a(com.ss.android.downloadlib.e.d r1, w2.i r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            @Override // com.ss.android.downloadlib.guide.install.a
            public void j() {
                    r1 = this;
                    w2.i r0 = r1.a
                    r0.j()
                    return
            }
        }

        class b implements com.ss.android.downloadlib.guide.install.a {
            final /* synthetic */ com.ss.android.socialbase.downloader.ae.cw a;
            final /* synthetic */ com.ss.android.downloadlib.guide.install.a b;
            final /* synthetic */ com.ss.android.downloadlib.e.d c;

            b(com.ss.android.downloadlib.e.d r1, com.ss.android.socialbase.downloader.ae.cw r2, com.ss.android.downloadlib.guide.install.a r3) {
                    r0 = this;
                    r0.c = r1
                    r0.a = r2
                    r0.b = r3
                    r0.<init>()
                    return
            }

            @Override // com.ss.android.downloadlib.guide.install.a
            public void j() {
                    r3 = this;
                    com.ss.android.downloadlib.e$d r0 = r3.c
                    com.ss.android.socialbase.downloader.ae.cw r1 = r3.a
                    com.ss.android.downloadlib.guide.install.a r2 = r3.b
                    com.ss.android.downloadlib.e.d.b(r0, r1, r2)
                    return
            }
        }

        class c implements com.ss.android.downloadlib.guide.install.a {
            final /* synthetic */ com.ss.android.downloadlib.guide.install.a a;
            final /* synthetic */ com.ss.android.downloadlib.e.d b;

            c(com.ss.android.downloadlib.e.d r1, com.ss.android.downloadlib.guide.install.a r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            @Override // com.ss.android.downloadlib.guide.install.a
            public void j() {
                    r1 = this;
                    com.ss.android.downloadlib.guide.install.a r0 = r1.a
                    r0.j()
                    return
            }
        }

        public d() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ void b(com.ss.android.downloadlib.e.d r0, com.ss.android.socialbase.downloader.ae.cw r1, com.ss.android.downloadlib.guide.install.a r2) {
                r0.d(r1, r2)
                return
        }

        private void d(com.ss.android.socialbase.downloader.ae.cw r3, @androidx.annotation.NonNull com.ss.android.downloadlib.guide.install.a r4) {
                r2 = this;
                com.ss.android.downloadlib.addownload.o$f r0 = com.ss.android.downloadlib.addownload.o.f.c()
                com.ss.android.xt.j.xt.b r3 = r0.f(r3)
                boolean r0 = com.ss.android.downloadlib.j.h.f(r3)
                boolean r1 = com.ss.android.downloadlib.j.h.m(r3)
                if (r0 == 0) goto L1e
                if (r1 != 0) goto L15
                goto L1e
            L15:
                com.ss.android.downloadlib.e$d$c r0 = new com.ss.android.downloadlib.e$d$c
                r0.<init>(r2, r4)
                com.ss.android.downloadlib.j.e.a(r3, r0)
                return
            L1e:
                r4.j()
                return
        }

        public void a(com.ss.android.socialbase.downloader.ae.cw r2, w2.i r3) {
                r1 = this;
                com.ss.android.downloadlib.e$d$a r0 = new com.ss.android.downloadlib.e$d$a
                r0.<init>(r1, r3)
                r1.c(r2, r0)
                return
        }

        public void c(com.ss.android.socialbase.downloader.ae.cw r3, @androidx.annotation.NonNull com.ss.android.downloadlib.guide.install.a r4) {
                r2 = this;
                com.ss.android.downloadlib.addownload.o$f r0 = com.ss.android.downloadlib.addownload.o.f.c()
                com.ss.android.xt.j.xt.b r0 = r0.f(r3)
                if (r0 == 0) goto L19
                boolean r1 = com.ss.android.downloadlib.j.f.a(r0)
                if (r1 == 0) goto L19
                com.ss.android.downloadlib.e$d$b r1 = new com.ss.android.downloadlib.e$d$b
                r1.<init>(r2, r3, r4)
                com.ss.android.downloadlib.activity.TTDelegateActivity.j(r0, r1)
                return
            L19:
                r2.d(r3, r4)
                return
        }
    }

    /* renamed from: com.ss.android.downloadlib.e$e, reason: collision with other inner class name */
    public class C0213e implements w2.j {
        public C0213e() {
                r0 = this;
                r0.<init>()
                return
        }

        public void a(com.ss.android.socialbase.downloader.ae.cw r2, w2.i r3) {
                r1 = this;
                if (r2 == 0) goto L13
                com.ss.android.downloadlib.addownload.o$f r0 = com.ss.android.downloadlib.addownload.o.f.c()
                com.ss.android.xt.j.xt.b r0 = r0.f(r2)
                if (r0 == 0) goto L13
                int r0 = r0.t0()
                r2.cw(r0)
            L13:
                if (r3 == 0) goto L18
                r3.j()
            L18:
                return
        }
    }

    private e() {
            r0 = this;
            r0.<init>()
            return
    }

    /* synthetic */ e(com.ss.android.downloadlib.e.a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.ss.android.downloadlib.e c() {
            com.ss.android.downloadlib.e r0 = com.ss.android.downloadlib.e.b.a()
            return r0
    }

    public java.util.concurrent.ExecutorService a() {
            r10 = this;
            java.util.concurrent.ExecutorService r0 = r10.b
            if (r0 != 0) goto L42
            java.lang.Class<com.ss.android.downloadlib.e> r1 = com.ss.android.downloadlib.e.class
            monitor-enter(r1)
            java.util.concurrent.ExecutorService r0 = r10.b     // Catch: java.lang.Throwable -> L3c
            if (r0 != 0) goto L3e
            com.bytedance.sdk.component.oq.r.r r2 = new com.bytedance.sdk.component.oq.r.r     // Catch: java.lang.Throwable -> L3c
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L3c
            java.util.concurrent.SynchronousQueue r8 = new java.util.concurrent.SynchronousQueue     // Catch: java.lang.Throwable -> L3c
            r8.<init>()     // Catch: java.lang.Throwable -> L3c
            com.ss.android.socialbase.downloader.ws.j r9 = new com.ss.android.socialbase.downloader.ws.j     // Catch: java.lang.Throwable -> L3c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3c
            r0.<init>()     // Catch: java.lang.Throwable -> L3c
            java.lang.Class<com.ss.android.downloadlib.g> r3 = com.ss.android.downloadlib.g.class
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> L3c
            r0.append(r3)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r3 = "-IOThreadPool"
            r0.append(r3)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L3c
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L3c
            r3 = 0
            r4 = 2147483647(0x7fffffff, float:NaN)
            r5 = 30
            r2.<init>(r3, r4, r5, r7, r8, r9)     // Catch: java.lang.Throwable -> L3c
            r10.b = r2     // Catch: java.lang.Throwable -> L3c
            goto L3e
        L3c:
            r0 = move-exception
            goto L40
        L3e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3c
            goto L42
        L40:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3c
            throw r0
        L42:
            java.util.concurrent.ExecutorService r0 = r10.b
            return r0
    }

    public void b(java.lang.Runnable r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            java.util.concurrent.ExecutorService r0 = r1.i()
            r0.execute(r2)
            return
    }

    public void d(java.lang.Runnable r2) {
            r1 = this;
            r0 = 0
            r1.f(r2, r0)
            return
    }

    public void e(java.lang.Runnable r3, long r4) {
            r2 = this;
            java.util.concurrent.ScheduledExecutorService r0 = r2.h()     // Catch: java.lang.Throwable -> La
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> La
            r0.schedule(r3, r4, r1)     // Catch: java.lang.Throwable -> La
            return
        La:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)
            return
    }

    public void f(java.lang.Runnable r1, boolean r2) {
            r0 = this;
            if (r1 != 0) goto L3
            return
        L3:
            if (r2 == 0) goto Lf
            boolean r2 = com.ss.android.downloadlib.a.h.K()
            if (r2 != 0) goto Lf
            r1.run()
            return
        Lf:
            java.util.concurrent.ExecutorService r2 = r0.j()
            r2.execute(r1)
            return
    }

    public void g() {
            r1 = this;
            com.ss.android.downloadlib.e$a r0 = new com.ss.android.downloadlib.e$a
            r0.<init>(r1)
            r1.d(r0)
            return
    }

    public java.util.concurrent.ScheduledExecutorService h() {
            r5 = this;
            java.util.concurrent.ScheduledExecutorService r0 = r5.c
            if (r0 != 0) goto L36
            java.lang.Class<com.ss.android.downloadlib.e> r0 = com.ss.android.downloadlib.e.class
            monitor-enter(r0)
            java.util.concurrent.ScheduledExecutorService r1 = r5.c     // Catch: java.lang.Throwable -> L30
            if (r1 != 0) goto L32
            com.bytedance.sdk.component.oq.r.up r1 = new com.bytedance.sdk.component.oq.r.up     // Catch: java.lang.Throwable -> L30
            com.ss.android.socialbase.downloader.ws.j r2 = new com.ss.android.socialbase.downloader.ws.j     // Catch: java.lang.Throwable -> L30
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L30
            r3.<init>()     // Catch: java.lang.Throwable -> L30
            java.lang.Class<com.ss.android.downloadlib.g> r4 = com.ss.android.downloadlib.g.class
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> L30
            r3.append(r4)     // Catch: java.lang.Throwable -> L30
            java.lang.String r4 = "-ScheduledThreadPool"
            r3.append(r4)     // Catch: java.lang.Throwable -> L30
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L30
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L30
            r3 = 0
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L30
            r5.c = r1     // Catch: java.lang.Throwable -> L30
            goto L32
        L30:
            r1 = move-exception
            goto L34
        L32:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            goto L36
        L34:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            throw r1
        L36:
            java.util.concurrent.ScheduledExecutorService r0 = r5.c
            return r0
    }

    public java.util.concurrent.ExecutorService i() {
            r10 = this;
            java.util.concurrent.ExecutorService r0 = r10.d
            if (r0 != 0) goto L42
            java.lang.Class<com.ss.android.downloadlib.e> r1 = com.ss.android.downloadlib.e.class
            monitor-enter(r1)
            java.util.concurrent.ExecutorService r0 = r10.d     // Catch: java.lang.Throwable -> L3c
            if (r0 != 0) goto L3e
            com.bytedance.sdk.component.oq.r.r r2 = new com.bytedance.sdk.component.oq.r.r     // Catch: java.lang.Throwable -> L3c
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L3c
            java.util.concurrent.SynchronousQueue r8 = new java.util.concurrent.SynchronousQueue     // Catch: java.lang.Throwable -> L3c
            r8.<init>()     // Catch: java.lang.Throwable -> L3c
            com.ss.android.socialbase.downloader.ws.j r9 = new com.ss.android.socialbase.downloader.ws.j     // Catch: java.lang.Throwable -> L3c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3c
            r0.<init>()     // Catch: java.lang.Throwable -> L3c
            java.lang.Class<com.ss.android.downloadlib.g> r3 = com.ss.android.downloadlib.g.class
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> L3c
            r0.append(r3)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r3 = "-InstallFinishCheckCPUThreadPool"
            r0.append(r3)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L3c
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L3c
            r3 = 5
            r4 = 2147483647(0x7fffffff, float:NaN)
            r5 = 30
            r2.<init>(r3, r4, r5, r7, r8, r9)     // Catch: java.lang.Throwable -> L3c
            r10.d = r2     // Catch: java.lang.Throwable -> L3c
            goto L3e
        L3c:
            r0 = move-exception
            goto L40
        L3e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3c
            goto L42
        L40:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3c
            throw r0
        L42:
            java.util.concurrent.ExecutorService r0 = r10.d
            return r0
    }

    public java.util.concurrent.ExecutorService j() {
            r10 = this;
            java.util.concurrent.ExecutorService r0 = r10.a
            if (r0 != 0) goto L42
            java.lang.Class<com.ss.android.downloadlib.e> r1 = com.ss.android.downloadlib.e.class
            monitor-enter(r1)
            java.util.concurrent.ExecutorService r0 = r10.a     // Catch: java.lang.Throwable -> L3c
            if (r0 != 0) goto L3e
            com.bytedance.sdk.component.oq.r.r r2 = new com.bytedance.sdk.component.oq.r.r     // Catch: java.lang.Throwable -> L3c
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L3c
            java.util.concurrent.SynchronousQueue r8 = new java.util.concurrent.SynchronousQueue     // Catch: java.lang.Throwable -> L3c
            r8.<init>()     // Catch: java.lang.Throwable -> L3c
            com.ss.android.socialbase.downloader.ws.j r9 = new com.ss.android.socialbase.downloader.ws.j     // Catch: java.lang.Throwable -> L3c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3c
            r0.<init>()     // Catch: java.lang.Throwable -> L3c
            java.lang.Class<com.ss.android.downloadlib.g> r3 = com.ss.android.downloadlib.g.class
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> L3c
            r0.append(r3)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r3 = "-CPUThreadPool"
            r0.append(r3)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L3c
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L3c
            r3 = 0
            r4 = 2147483647(0x7fffffff, float:NaN)
            r5 = 30
            r2.<init>(r3, r4, r5, r7, r8, r9)     // Catch: java.lang.Throwable -> L3c
            r10.a = r2     // Catch: java.lang.Throwable -> L3c
            goto L3e
        L3c:
            r0 = move-exception
            goto L40
        L3e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3c
            goto L42
        L40:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3c
            throw r0
        L42:
            java.util.concurrent.ExecutorService r0 = r10.a
            return r0
    }

    public void k(java.lang.Runnable r2) {
            r1 = this;
            r0 = 0
            r1.l(r2, r0)
            return
    }

    public void l(java.lang.Runnable r1, boolean r2) {
            r0 = this;
            if (r1 != 0) goto L3
            return
        L3:
            if (r2 == 0) goto Lf
            boolean r2 = com.ss.android.downloadlib.a.h.K()
            if (r2 != 0) goto Lf
            r1.run()
            return
        Lf:
            java.util.concurrent.ExecutorService r2 = r0.a()
            r2.execute(r1)
            return
    }
}
