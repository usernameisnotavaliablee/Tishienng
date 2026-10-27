package com.ss.android.socialbase.appdownloader;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class f {
    private static final java.lang.String s = "f";
    private static volatile com.ss.android.socialbase.appdownloader.f t;
    private static boolean u;
    private static boolean v;
    private static boolean w;
    private java.lang.String a;
    private java.lang.String b;
    private com.ss.android.socialbase.appdownloader.DownloadReceiver c;
    private java.util.concurrent.Future d;
    private int e;
    private boolean f;
    private boolean g;
    private w2.k h;
    private w2.m i;
    private w2.e j;
    private w2.l k;
    private w2.o l;
    private w2.a m;
    private w2.j n;
    private com.ss.android.socialbase.downloader.r.gq o;
    private com.ss.android.socialbase.downloader.r.uf p;
    private w2.b q;
    private w2.d r;

    class a implements java.lang.Runnable {
        final /* synthetic */ com.ss.android.socialbase.appdownloader.f a;

        a(com.ss.android.socialbase.appdownloader.f r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                com.ss.android.socialbase.appdownloader.f r0 = r1.a
                com.ss.android.socialbase.appdownloader.f.t(r0)
                return
        }
    }

    class b implements java.lang.Runnable {
        final /* synthetic */ com.ss.android.socialbase.appdownloader.f a;

        b(com.ss.android.socialbase.appdownloader.f r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                java.lang.String r0 = com.ss.android.socialbase.appdownloader.f.J()
                java.lang.String r1 = "registerDownloadReceiver tryUnRegisterTempAppInstallDownloadReceiver run inner"
                com.ss.android.socialbase.downloader.m.j.xt(r0, r1)
                com.ss.android.socialbase.appdownloader.f r0 = r2.a
                r0.G()
                com.ss.android.socialbase.appdownloader.f r0 = r2.a
                com.ss.android.socialbase.appdownloader.f.t(r0)
                return
        }
    }

    class c implements com.ss.android.socialbase.downloader.impls.w.xt {
        final /* synthetic */ com.ss.android.socialbase.appdownloader.f a;

        c(com.ss.android.socialbase.appdownloader.f r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void j(com.ss.android.socialbase.downloader.ae.cw r1, long r2, boolean r4, int r5) {
                r0 = this;
                com.ss.android.socialbase.appdownloader.RetryJobSchedulerService.a(r1, r2, r4, r5)
                return
        }
    }

    class d implements com.ss.android.socialbase.downloader.r.az {
        final /* synthetic */ com.ss.android.socialbase.appdownloader.f a;

        d(com.ss.android.socialbase.appdownloader.f r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void j(com.ss.android.socialbase.downloader.ae.cw r2, com.ss.android.socialbase.downloader.up.j r3, int r4) {
                r1 = this;
                com.ss.android.socialbase.appdownloader.f r0 = r1.a
                w2.e r0 = com.ss.android.socialbase.appdownloader.f.W(r0)
                if (r0 == 0) goto L11
                com.ss.android.socialbase.appdownloader.f r0 = r1.a
                w2.e r0 = com.ss.android.socialbase.appdownloader.f.W(r0)
                r0.j(r2, r3, r4)
            L11:
                return
        }
    }

    class e implements w2.c {
        final /* synthetic */ java.lang.String a;
        final /* synthetic */ com.ss.android.socialbase.downloader.ae.r b;
        final /* synthetic */ int c;
        final /* synthetic */ boolean d;
        final /* synthetic */ com.ss.android.socialbase.appdownloader.f e;

        e(com.ss.android.socialbase.appdownloader.f r1, java.lang.String r2, com.ss.android.socialbase.downloader.ae.r r3, int r4, boolean r5) {
                r0 = this;
                r0.e = r1
                r0.a = r2
                r0.b = r3
                r0.c = r4
                r0.d = r5
                r0.<init>()
                return
        }

        public void j() {
                r4 = this;
                java.lang.String r0 = com.ss.android.socialbase.appdownloader.f.J()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "notification permission granted, start download :"
                r1.<init>(r2)
                java.lang.String r2 = r4.a
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.ss.android.socialbase.downloader.m.j.xt(r0, r1)
                com.ss.android.socialbase.appdownloader.f r0 = r4.e
                com.ss.android.socialbase.downloader.ae.r r1 = r4.b
                int r2 = r4.c
                boolean r3 = r4.d
                com.ss.android.socialbase.appdownloader.f.u(r0, r1, r2, r3)
                return
        }

        public void xt() {
                r4 = this;
                java.lang.String r0 = com.ss.android.socialbase.appdownloader.f.J()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "notification permission denied, start download :"
                r1.<init>(r2)
                java.lang.String r2 = r4.a
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.ss.android.socialbase.downloader.m.j.xt(r0, r1)
                com.ss.android.socialbase.appdownloader.f r0 = r4.e
                com.ss.android.socialbase.downloader.ae.r r1 = r4.b
                int r2 = r4.c
                boolean r3 = r4.d
                com.ss.android.socialbase.appdownloader.f.u(r0, r1, r2, r3)
                return
        }
    }

    /* renamed from: com.ss.android.socialbase.appdownloader.f$f, reason: collision with other inner class name */
    class C0229f implements com.ss.android.socialbase.downloader.r.h {
        final /* synthetic */ w2.h a;
        final /* synthetic */ com.ss.android.socialbase.appdownloader.f b;

        C0229f(com.ss.android.socialbase.appdownloader.f r1, w2.h r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public java.lang.String j() {
                r1 = this;
                w2.h r0 = r1.a
                java.lang.String r0 = r0.j()
                return r0
        }

        public void j(int r1, com.ss.android.socialbase.downloader.ae.cw r2, java.lang.String r3, java.lang.String r4) {
                r0 = this;
                r3 = 1
                if (r1 == r3) goto L18
                r3 = 3
                if (r1 == r3) goto L18
                r3 = 9
                if (r1 == r3) goto L14
                r3 = 5
                if (r1 == r3) goto L18
                r3 = 6
                if (r1 == r3) goto L18
                r3 = 7
                if (r1 == r3) goto L18
                return
            L14:
                com.ss.android.socialbase.downloader.downloader.cw.nd()
                return
            L18:
                r2.i()
                return
        }

        public boolean j(boolean r2) {
                r1 = this;
                w2.h r0 = r1.a
                boolean r2 = r0.j(r2)
                return r2
        }
    }

    public class g extends w2.p {
        private android.app.AlertDialog.Builder a;

        private static class a implements w2.n {
            private android.app.AlertDialog a;

            public a(android.app.AlertDialog.Builder r1) {
                    r0 = this;
                    r0.<init>()
                    if (r1 == 0) goto Lb
                    android.app.AlertDialog r1 = r1.show()
                    r0.a = r1
                Lb:
                    return
            }

            public void j() {
                    r1 = this;
                    android.app.AlertDialog r0 = r1.a
                    if (r0 == 0) goto L7
                    r0.show()
                L7:
                    return
            }

            public boolean xt() {
                    r1 = this;
                    android.app.AlertDialog r0 = r1.a
                    if (r0 == 0) goto L9
                    boolean r0 = r0.isShowing()
                    return r0
                L9:
                    r0 = 0
                    return r0
            }
        }

        public g(android.content.Context r2) {
                r1 = this;
                r1.<init>()
                android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
                r0.<init>(r2)
                r1.a = r0
                return
        }

        public w2.g a(int r2, android.content.DialogInterface.OnClickListener r3) {
                r1 = this;
                android.app.AlertDialog$Builder r0 = r1.a
                if (r0 == 0) goto L7
                r0.setNegativeButton(r2, r3)
            L7:
                return r1
        }

        public w2.g b(int r2, android.content.DialogInterface.OnClickListener r3) {
                r1 = this;
                android.app.AlertDialog$Builder r0 = r1.a
                if (r0 == 0) goto L7
                r0.setPositiveButton(r2, r3)
            L7:
                return r1
        }

        public w2.g c(android.content.DialogInterface.OnCancelListener r2) {
                r1 = this;
                android.app.AlertDialog$Builder r0 = r1.a
                if (r0 == 0) goto L7
                r0.setOnCancelListener(r2)
            L7:
                return r1
        }

        public w2.g j(int r2) {
                r1 = this;
                android.app.AlertDialog$Builder r0 = r1.a
                if (r0 == 0) goto L7
                r0.setTitle(r2)
            L7:
                return r1
        }

        public w2.g j(java.lang.String r2) {
                r1 = this;
                android.app.AlertDialog$Builder r0 = r1.a
                if (r0 == 0) goto L7
                r0.setMessage(r2)
            L7:
                return r1
        }

        public w2.n j() {
                r2 = this;
                com.ss.android.socialbase.appdownloader.f$g$a r0 = new com.ss.android.socialbase.appdownloader.f$g$a
                android.app.AlertDialog$Builder r1 = r2.a
                r0.<init>(r1)
                return r0
        }
    }

    public class h implements com.ss.android.socialbase.downloader.downloader.ws {
        private java.util.List<java.lang.Integer> a;
        private android.content.BroadcastReceiver b;

        class a implements java.lang.Runnable {
            final /* synthetic */ java.util.List a;
            final /* synthetic */ int b;
            final /* synthetic */ com.ss.android.socialbase.appdownloader.f.h c;

            a(com.ss.android.socialbase.appdownloader.f.h r1, java.util.List r2, int r3) {
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
                    com.ss.android.socialbase.appdownloader.f$h r0 = r3.c     // Catch: java.lang.Exception -> La
                    java.util.List r1 = r3.a     // Catch: java.lang.Exception -> La
                    int r2 = r3.b     // Catch: java.lang.Exception -> La
                    com.ss.android.socialbase.appdownloader.f.h.e(r0, r1, r2)     // Catch: java.lang.Exception -> La
                    return
                La:
                    r0 = move-exception
                    com.bytedance.sdk.component.utils.vl.j(r0)
                    return
            }
        }

        class b extends android.content.BroadcastReceiver {
            final /* synthetic */ com.ss.android.socialbase.appdownloader.f.h a;

            class a implements java.lang.Runnable {
                final /* synthetic */ android.content.Context a;
                final /* synthetic */ com.ss.android.socialbase.appdownloader.f.h.b b;

                a(com.ss.android.socialbase.appdownloader.f.h.b r1, android.content.Context r2) {
                        r0 = this;
                        r0.b = r1
                        r0.a = r2
                        r0.<init>()
                        return
                }

                @Override // java.lang.Runnable
                public void run() {
                        r8 = this;
                        com.ss.android.socialbase.appdownloader.f$h$b r0 = r8.b     // Catch: java.lang.Exception -> L67
                        com.ss.android.socialbase.appdownloader.f$h r0 = r0.a     // Catch: java.lang.Exception -> L67
                        java.util.List r0 = com.ss.android.socialbase.appdownloader.f.h.b(r0)     // Catch: java.lang.Exception -> L67
                        if (r0 == 0) goto L77
                        com.ss.android.socialbase.appdownloader.f$h$b r0 = r8.b     // Catch: java.lang.Exception -> L67
                        com.ss.android.socialbase.appdownloader.f$h r0 = r0.a     // Catch: java.lang.Exception -> L67
                        java.util.List r0 = com.ss.android.socialbase.appdownloader.f.h.b(r0)     // Catch: java.lang.Exception -> L67
                        boolean r0 = r0.isEmpty()     // Catch: java.lang.Exception -> L67
                        if (r0 == 0) goto L19
                        goto L77
                    L19:
                        com.ss.android.socialbase.appdownloader.f$h$b r0 = r8.b     // Catch: java.lang.Exception -> L67
                        com.ss.android.socialbase.appdownloader.f$h r0 = r0.a     // Catch: java.lang.Exception -> L67
                        java.util.List r0 = com.ss.android.socialbase.appdownloader.f.h.b(r0)     // Catch: java.lang.Exception -> L67
                        int r0 = r0.size()     // Catch: java.lang.Exception -> L67
                        java.lang.Integer[] r1 = new java.lang.Integer[r0]     // Catch: java.lang.Exception -> L67
                        com.ss.android.socialbase.appdownloader.f$h$b r2 = r8.b     // Catch: java.lang.Exception -> L67
                        com.ss.android.socialbase.appdownloader.f$h r2 = r2.a     // Catch: java.lang.Exception -> L67
                        java.util.List r2 = com.ss.android.socialbase.appdownloader.f.h.b(r2)     // Catch: java.lang.Exception -> L67
                        r2.toArray(r1)     // Catch: java.lang.Exception -> L67
                        com.ss.android.socialbase.appdownloader.f$h$b r2 = r8.b     // Catch: java.lang.Exception -> L67
                        com.ss.android.socialbase.appdownloader.f$h r2 = r2.a     // Catch: java.lang.Exception -> L67
                        java.util.List r2 = com.ss.android.socialbase.appdownloader.f.h.b(r2)     // Catch: java.lang.Exception -> L67
                        r2.clear()     // Catch: java.lang.Exception -> L67
                        r2 = 0
                    L3e:
                        if (r2 >= r0) goto L77
                        r3 = r1[r2]     // Catch: java.lang.Exception -> L67
                        android.content.Context r4 = r8.a     // Catch: java.lang.Exception -> L67
                        com.ss.android.socialbase.downloader.downloader.ae r4 = com.ss.android.socialbase.downloader.downloader.ae.xt(r4)     // Catch: java.lang.Exception -> L67
                        int r3 = r3.intValue()     // Catch: java.lang.Exception -> L67
                        com.ss.android.socialbase.downloader.ae.cw r3 = r4.tl(r3)     // Catch: java.lang.Exception -> L67
                        if (r3 == 0) goto L74
                        int r4 = r3.v()     // Catch: java.lang.Exception -> L67
                        r5 = -5
                        if (r4 == r5) goto L69
                        int r4 = r3.v()     // Catch: java.lang.Exception -> L67
                        r5 = -2
                        if (r4 != r5) goto L74
                        boolean r4 = r3.qb()     // Catch: java.lang.Exception -> L67
                        if (r4 == 0) goto L74
                        goto L69
                    L67:
                        r0 = move-exception
                        goto L78
                    L69:
                        com.ss.android.socialbase.appdownloader.f$h$b r4 = r8.b     // Catch: java.lang.Exception -> L67
                        com.ss.android.socialbase.appdownloader.f$h r4 = r4.a     // Catch: java.lang.Exception -> L67
                        android.content.Context r5 = r8.a     // Catch: java.lang.Exception -> L67
                        r6 = 2
                        r7 = 1
                        com.ss.android.socialbase.appdownloader.f.h.d(r4, r5, r3, r7, r6)     // Catch: java.lang.Exception -> L67
                    L74:
                        int r2 = r2 + 1
                        goto L3e
                    L77:
                        return
                    L78:
                        com.bytedance.sdk.component.utils.vl.j(r0)
                        return
                }
            }

            b(com.ss.android.socialbase.appdownloader.f.h r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(android.content.Context r2, android.content.Intent r3) {
                    r1 = this;
                    android.content.Context r2 = r2.getApplicationContext()
                    android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
                    boolean r3 = com.ss.android.socialbase.downloader.az.m.xt(r2)
                    if (r3 != 0) goto Lf
                    return
                Lf:
                    java.lang.String r3 = "LaunchResume"
                    java.lang.String r0 = "onReceive : wifi connected !!!"
                    com.ss.android.socialbase.downloader.m.j.xt(r3, r0)
                    java.util.concurrent.ExecutorService r3 = com.ss.android.socialbase.downloader.downloader.cw.qv()
                    com.ss.android.socialbase.appdownloader.f$h$b$a r0 = new com.ss.android.socialbase.appdownloader.f$h$b$a
                    r0.<init>(r1, r2)
                    r3.execute(r0)
                    com.ss.android.socialbase.appdownloader.f$h r3 = r1.a     // Catch: java.lang.Throwable -> L2c
                    android.content.BroadcastReceiver r3 = com.ss.android.socialbase.appdownloader.f.h.h(r3)     // Catch: java.lang.Throwable -> L2c
                    r2.unregisterReceiver(r3)     // Catch: java.lang.Throwable -> L2c
                    goto L30
                L2c:
                    r2 = move-exception
                    com.bytedance.sdk.component.utils.vl.j(r2)
                L30:
                    com.ss.android.socialbase.appdownloader.f$h r2 = r1.a
                    r3 = 0
                    com.ss.android.socialbase.appdownloader.f.h.a(r2, r3)
                    return
            }
        }

        public h() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ android.content.BroadcastReceiver a(com.ss.android.socialbase.appdownloader.f.h r0, android.content.BroadcastReceiver r1) {
                r0.b = r1
                return r1
        }

        static /* synthetic */ java.util.List b(com.ss.android.socialbase.appdownloader.f.h r0) {
                java.util.List<java.lang.Integer> r0 = r0.a
                return r0
        }

        private void c(android.content.Context r22, com.ss.android.socialbase.downloader.ae.cw r23, boolean r24, int r25) {
                r21 = this;
                r0 = r21
                r1 = r23
                r2 = r25
                if (r1 == 0) goto L263
                boolean r3 = r1.yl()
                if (r3 != 0) goto L10
                goto L263
            L10:
                int r3 = r1.v()
                r4 = -5
                java.lang.String r5 = ", canShowNotification = "
                java.lang.String r6 = "LaunchResume"
                r8 = 4622945017495814144(0x4028000000000000, double:12.0)
                r10 = 4634766966517661696(0x4052000000000000, double:72.0)
                r14 = 0
                if (r3 != r4) goto L131
                java.lang.String r4 = "application/ttpatch"
                r16 = 4704985352480227328(0x414b774000000000, double:3600000.0)
                java.lang.String r12 = r1.xw()
                boolean r4 = r4.equalsIgnoreCase(r12)
                if (r4 != 0) goto L37
                boolean r4 = r1.m14if()
                if (r4 != 0) goto L136
            L37:
                int r3 = r1.ae()
                com.ss.android.socialbase.downloader.jy.j r3 = com.ss.android.socialbase.downloader.jy.j.j(r3)
                java.lang.String r4 = "failed_resume_max_count"
                int r4 = r3.j(r4, r14)
                java.lang.String r12 = "failed_resume_max_hours"
                double r10 = r3.j(r12, r10)
                java.lang.String r12 = "failed_resume_min_hours"
                double r8 = r3.j(r12, r8)
                long r12 = java.lang.System.currentTimeMillis()
                int r7 = r1.pm()
                if (r7 >= r4) goto L77
                long r19 = r1.lg()
                long r14 = r12 - r19
                double r14 = (double) r14
                double r10 = r10 * r16
                int r19 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
                if (r19 >= 0) goto L77
                long r10 = r1.xc()
                long r10 = r12 - r10
                double r10 = (double) r10
                double r8 = r8 * r16
                int r14 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
                if (r14 <= 0) goto L77
                r8 = 1
                goto L78
            L77:
                r8 = 0
            L78:
                boolean r9 = r1.qb()
                if (r9 == 0) goto L81
                if (r24 == 0) goto L81
                r8 = 1
            L81:
                if (r8 == 0) goto Lff
                java.lang.String r9 = "failed_resume_need_wifi"
                r7 = 1
                int r9 = r3.j(r9, r7)
                if (r9 != r7) goto L8e
                r9 = 1
                goto L8f
            L8e:
                r9 = 0
            L8f:
                java.lang.String r10 = "failed_resume_need_wait_wifi"
                r4 = 0
                int r3 = r3.j(r10, r4)
                if (r3 != r7) goto L9a
                r3 = 1
                goto L9b
            L9a:
                r3 = 0
            L9b:
                if (r24 != 0) goto La1
                if (r9 == 0) goto La1
                if (r3 != 0) goto La3
            La1:
                r7 = 1
                goto Ld3
            La3:
                java.util.List<java.lang.Integer> r2 = r0.a
                if (r2 != 0) goto Lae
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                r0.a = r2
            Lae:
                int r2 = r1.ae()
                java.util.List<java.lang.Integer> r3 = r0.a
                java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
                boolean r3 = r3.contains(r9)
                if (r3 != 0) goto Lc7
                java.util.List<java.lang.Integer> r3 = r0.a
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3.add(r2)
            Lc7:
                r7 = 1
                r1.r(r7)
                com.ss.android.socialbase.downloader.impls.w r2 = com.ss.android.socialbase.downloader.impls.w.j()
                r2.j(r1)
                goto Lff
            Ld3:
                com.ss.android.socialbase.appdownloader.b.w(r1, r7, r9)
                r1.g(r12)
                int r3 = r1.pm()
                int r3 = r3 + r7
                r1.qv(r3)
                r1.ay()
                boolean r3 = r1.qb()
                if (r3 == 0) goto Lfd
                if (r24 == 0) goto Lfd
                r1.up(r7)
                com.ss.android.socialbase.appdownloader.f r3 = com.ss.android.socialbase.appdownloader.f.L()
                com.ss.android.socialbase.downloader.downloader.mi r3 = r3.b()
                if (r3 == 0) goto Lfd
                r4 = 5
                r3.j(r1, r4, r2)
            Lfd:
                r14 = 1
                goto L100
            Lff:
                r14 = 0
            L100:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "launchResume, name = "
                r2.<init>(r3)
                java.lang.String r3 = r1.g()
                r2.append(r3)
                r2.append(r5)
                r2.append(r8)
                java.lang.String r3 = ", downloadResumed = "
                r2.append(r3)
                r2.append(r14)
                java.lang.String r2 = r2.toString()
                com.ss.android.socialbase.downloader.m.j.cw(r6, r2)
                com.ss.android.socialbase.appdownloader.f r2 = com.ss.android.socialbase.appdownloader.f.L()
                w2.l r2 = r2.c()
                if (r2 == 0) goto L263
                r2.a(r1, r14)
                return
            L131:
                r16 = 4704985352480227328(0x414b774000000000, double:3600000.0)
            L136:
                r12 = -3
                if (r3 != r12) goto L202
                boolean r12 = r0.g(r1)
                if (r12 == 0) goto L202
                int r2 = r1.ae()
                com.ss.android.socialbase.downloader.jy.j r2 = com.ss.android.socialbase.downloader.jy.j.j(r2)
                boolean r3 = com.ss.android.socialbase.appdownloader.b.z(r22, r23)
                if (r3 == 0) goto L14f
                goto L263
            L14f:
                java.lang.String r3 = "uninstall_resume_max_count"
                r4 = 0
                int r3 = r2.j(r3, r4)
                java.lang.String r12 = "uninstall_resume_max_hours"
                double r10 = r2.j(r12, r10)
                java.lang.String r12 = "uninstall_resume_min_hours"
                double r8 = r2.j(r12, r8)
                long r12 = java.lang.System.currentTimeMillis()
                int r2 = r1.lc()
                if (r2 >= r3) goto L188
                long r2 = r1.lg()
                long r2 = r12 - r2
                double r2 = (double) r2
                double r10 = r10 * r16
                int r14 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
                if (r14 >= 0) goto L188
                long r2 = r1.vu()
                long r2 = r12 - r2
                double r2 = (double) r2
                double r8 = r8 * r16
                int r10 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
                if (r10 <= 0) goto L188
                r2 = 1
                goto L189
            L188:
                r2 = 0
            L189:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r8 = "uninstallResume, name = "
                r3.<init>(r8)
                java.lang.String r8 = r1.g()
                r3.append(r8)
                r3.append(r5)
                r3.append(r2)
                java.lang.String r3 = r3.toString()
                com.ss.android.socialbase.downloader.m.j.cw(r6, r3)
                if (r2 == 0) goto L263
                com.ss.android.socialbase.downloader.notification.xt r2 = com.ss.android.socialbase.downloader.notification.xt.j()
                int r3 = r1.ae()
                com.ss.android.socialbase.downloader.notification.j r2 = r2.up(r3)
                if (r2 != 0) goto L1d8
                com.ss.android.socialbase.appdownloader.up.b r14 = new com.ss.android.socialbase.appdownloader.up.b
                int r16 = r1.ae()
                java.lang.String r17 = r1.g()
                java.lang.String r18 = r1.qv()
                java.lang.String r19 = r1.tl()
                java.lang.String r20 = r1.h()
                r15 = r22
                r14.<init>(r15, r16, r17, r18, r19, r20)
                com.ss.android.socialbase.downloader.notification.xt r2 = com.ss.android.socialbase.downloader.notification.xt.j()
                r2.j(r14)
                r2 = r14
                goto L1db
            L1d8:
                r2.j(r1)
            L1db:
                long r5 = r1.ka()
                r2.xt(r5)
                long r5 = r1.ka()
                r2.j(r5)
                int r3 = r1.i()
                r5 = 0
                r4 = 0
                r2.j(r3, r5, r4, r4)
                r1.oq(r12)
                int r2 = r1.lc()
                r7 = 1
                int r2 = r2 + r7
                r1.vl(r2)
                r1.ay()
                return
            L202:
                r4 = -2
                if (r3 != r4) goto L263
                boolean r3 = r1.qb()
                if (r3 == 0) goto L25e
                if (r24 == 0) goto L233
                r7 = 1
                com.ss.android.socialbase.appdownloader.b.w(r1, r7, r7)
                r1.ay()
                r1.up(r7)
                com.ss.android.socialbase.appdownloader.f r3 = com.ss.android.socialbase.appdownloader.f.L()
                w2.l r3 = r3.c()
                if (r3 == 0) goto L224
                r3.a(r1, r7)
            L224:
                com.ss.android.socialbase.appdownloader.f r3 = com.ss.android.socialbase.appdownloader.f.L()
                com.ss.android.socialbase.downloader.downloader.mi r3 = r3.b()
                if (r3 == 0) goto L263
                r4 = 5
                r3.j(r1, r4, r2)
                return
            L233:
                java.util.List<java.lang.Integer> r2 = r0.a
                if (r2 != 0) goto L23e
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                r0.a = r2
            L23e:
                int r2 = r1.ae()
                java.util.List<java.lang.Integer> r3 = r0.a
                java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
                boolean r3 = r3.contains(r4)
                if (r3 != 0) goto L257
                java.util.List<java.lang.Integer> r3 = r0.a
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3.add(r2)
            L257:
                com.ss.android.socialbase.downloader.impls.w r2 = com.ss.android.socialbase.downloader.impls.w.j()
                r2.j(r1)
            L25e:
                r15 = r22
                r0.f(r1, r15)
            L263:
                return
        }

        static /* synthetic */ void d(com.ss.android.socialbase.appdownloader.f.h r0, android.content.Context r1, com.ss.android.socialbase.downloader.ae.cw r2, boolean r3, int r4) {
                r0.c(r1, r2, r3, r4)
                return
        }

        static /* synthetic */ void e(com.ss.android.socialbase.appdownloader.f.h r0, java.util.List r1, int r2) {
                r0.i(r1, r2)
                return
        }

        private void f(com.ss.android.socialbase.downloader.ae.cw r11, android.content.Context r12) {
                r10 = this;
                int r0 = r11.ae()
                com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.j(r0)
                java.lang.String r1 = "paused_resume_max_count"
                r2 = 0
                int r1 = r0.j(r1, r2)
                java.lang.String r3 = "paused_resume_max_hours"
                r4 = 4634766966517661696(0x4052000000000000, double:72.0)
                double r3 = r0.j(r3, r4)
                int r0 = r11.uh()
                if (r0 >= r1) goto L84
                long r5 = java.lang.System.currentTimeMillis()
                long r7 = r11.lg()
                long r5 = r5 - r7
                double r5 = (double) r5
                r7 = 4704985352480227328(0x414b774000000000, double:3600000.0)
                double r3 = r3 * r7
                int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r1 >= 0) goto L84
                com.ss.android.socialbase.downloader.notification.xt r1 = com.ss.android.socialbase.downloader.notification.xt.j()
                int r3 = r11.ae()
                com.ss.android.socialbase.downloader.notification.j r1 = r1.up(r3)
                if (r1 != 0) goto L63
                com.ss.android.socialbase.appdownloader.up.b r3 = new com.ss.android.socialbase.appdownloader.up.b
                int r5 = r11.ae()
                java.lang.String r6 = r11.g()
                java.lang.String r7 = r11.qv()
                java.lang.String r8 = r11.tl()
                java.lang.String r9 = r11.h()
                r4 = r12
                r3.<init>(r4, r5, r6, r7, r8, r9)
                com.ss.android.socialbase.downloader.notification.xt r12 = com.ss.android.socialbase.downloader.notification.xt.j()
                r12.j(r3)
                r1 = r3
                goto L66
            L63:
                r1.j(r11)
            L66:
                long r3 = r11.ka()
                r1.xt(r3)
                long r3 = r11.uq()
                r1.j(r3)
                int r12 = r11.i()
                r3 = 0
                r1.j(r12, r3, r2, r2)
                int r0 = r0 + 1
                r11.i(r0)
                r11.ay()
            L84:
                return
        }

        private boolean g(com.ss.android.socialbase.downloader.ae.cw r4) {
                r3 = this;
                int r0 = r4.ae()
                com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.j(r0)
                java.lang.String r1 = "uninstall_can_not_resume_for_force_task"
                r2 = 0
                boolean r0 = r0.xt(r1, r2)
                if (r0 == 0) goto L1a
                java.lang.String r0 = r4.rn()
                boolean r4 = com.ss.android.socialbase.downloader.az.m.j(r4, r2, r0)
                return r4
            L1a:
                boolean r4 = r4.m14if()
                return r4
        }

        static /* synthetic */ android.content.BroadcastReceiver h(com.ss.android.socialbase.appdownloader.f.h r0) {
                android.content.BroadcastReceiver r0 = r0.b
                return r0
        }

        private void i(java.util.List<com.ss.android.socialbase.downloader.ae.cw> r4, int r5) {
                r3 = this;
                if (r4 == 0) goto L57
                boolean r0 = r4.isEmpty()
                if (r0 == 0) goto L9
                goto L57
            L9:
                com.ss.android.socialbase.appdownloader.f.L()
                android.content.Context r0 = com.ss.android.socialbase.downloader.downloader.cw.nd()
                if (r0 != 0) goto L13
                goto L57
            L13:
                boolean r1 = com.ss.android.socialbase.downloader.az.m.xt(r0)
                java.util.Iterator r4 = r4.iterator()
            L1b:
                boolean r2 = r4.hasNext()
                if (r2 == 0) goto L2b
                java.lang.Object r2 = r4.next()
                com.ss.android.socialbase.downloader.ae.cw r2 = (com.ss.android.socialbase.downloader.ae.cw) r2
                r3.c(r0, r2, r1, r5)
                goto L1b
            L2b:
                java.util.List<java.lang.Integer> r4 = r3.a
                if (r4 == 0) goto L57
                boolean r4 = r4.isEmpty()
                if (r4 != 0) goto L57
                android.content.BroadcastReceiver r4 = r3.b
                if (r4 != 0) goto L57
                com.ss.android.socialbase.appdownloader.f$h$b r4 = new com.ss.android.socialbase.appdownloader.f$h$b
                r4.<init>(r3)
                r3.b = r4
                android.content.IntentFilter r4 = new android.content.IntentFilter     // Catch: java.lang.Throwable -> L50
                r4.<init>()     // Catch: java.lang.Throwable -> L50
                java.lang.String r5 = "android.net.conn.CONNECTIVITY_CHANGE"
                r4.addAction(r5)     // Catch: java.lang.Throwable -> L50
                android.content.BroadcastReceiver r5 = r3.b     // Catch: java.lang.Throwable -> L50
                r0.registerReceiver(r5, r4)     // Catch: java.lang.Throwable -> L50
                return
            L50:
                r4 = move-exception
                com.bytedance.sdk.component.utils.vl.j(r4)
                r4 = 0
                r3.b = r4
            L57:
                return
        }

        public java.util.List<java.lang.String> j() {
                r1 = this;
                java.util.List r0 = com.ss.android.socialbase.appdownloader.b.b()
                return r0
        }

        public void j(java.util.List<com.ss.android.socialbase.downloader.ae.cw> r3, int r4) {
                r2 = this;
                boolean r0 = com.ss.android.socialbase.downloader.az.m.r()
                if (r0 == 0) goto L13
                java.util.concurrent.ExecutorService r0 = com.ss.android.socialbase.downloader.downloader.cw.qv()
                com.ss.android.socialbase.appdownloader.f$h$a r1 = new com.ss.android.socialbase.appdownloader.f$h$a
                r1.<init>(r2, r3, r4)
                r0.execute(r1)
                return
            L13:
                r2.i(r3, r4)
                return
        }
    }

    static {
            return
    }

    private f() {
            r1 = this;
            r1.<init>()
            com.ss.android.socialbase.appdownloader.DownloadReceiver r0 = new com.ss.android.socialbase.appdownloader.DownloadReceiver
            r0.<init>()
            r1.c = r0
            r0 = 0
            r1.f = r0
            r1.g = r0
            return
    }

    public static boolean F(android.content.Context r1, int r2) {
            r0 = 1
            int r1 = com.ss.android.socialbase.appdownloader.b.h(r1, r2, r0)
            if (r1 != r0) goto L8
            return r0
        L8:
            r1 = 0
            return r1
    }

    private void H() {
            r5 = this;
            com.ss.android.socialbase.appdownloader.DownloadReceiver r0 = r5.c
            monitor-enter(r0)
            boolean r1 = com.ss.android.socialbase.appdownloader.f.v     // Catch: java.lang.Throwable -> L9
            if (r1 == 0) goto Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r1 = move-exception
            goto L55
        Lb:
            android.content.IntentFilter r1 = new android.content.IntentFilter     // Catch: java.lang.Throwable -> L9 java.lang.Exception -> L3a
            r1.<init>()     // Catch: java.lang.Throwable -> L9 java.lang.Exception -> L3a
            java.lang.String r2 = "android.net.conn.CONNECTIVITY_CHANGE"
            r1.addAction(r2)     // Catch: java.lang.Throwable -> L9 java.lang.Exception -> L3a
            android.content.IntentFilter r2 = new android.content.IntentFilter     // Catch: java.lang.Throwable -> L9 java.lang.Exception -> L3a
            r2.<init>()     // Catch: java.lang.Throwable -> L9 java.lang.Exception -> L3a
            java.lang.String r3 = "android.intent.action.MEDIA_MOUNTED"
            r2.addAction(r3)     // Catch: java.lang.Throwable -> L9 java.lang.Exception -> L3a
            java.lang.String r3 = "file"
            r2.addDataScheme(r3)     // Catch: java.lang.Throwable -> L9 java.lang.Exception -> L3a
            android.content.Context r3 = com.ss.android.socialbase.downloader.downloader.cw.nd()     // Catch: java.lang.Throwable -> L9 java.lang.Exception -> L3a
            com.ss.android.socialbase.appdownloader.DownloadReceiver r4 = r5.c     // Catch: java.lang.Throwable -> L9 java.lang.Exception -> L3a
            r3.registerReceiver(r4, r1)     // Catch: java.lang.Throwable -> L9 java.lang.Exception -> L3a
            android.content.Context r1 = com.ss.android.socialbase.downloader.downloader.cw.nd()     // Catch: java.lang.Throwable -> L9 java.lang.Exception -> L3a
            com.ss.android.socialbase.appdownloader.DownloadReceiver r3 = r5.c     // Catch: java.lang.Throwable -> L9 java.lang.Exception -> L3a
            r1.registerReceiver(r3, r2)     // Catch: java.lang.Throwable -> L9 java.lang.Exception -> L3a
            r1 = 1
            com.ss.android.socialbase.appdownloader.f.v = r1     // Catch: java.lang.Throwable -> L9 java.lang.Exception -> L3a
            goto L3e
        L3a:
            r1 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r1)     // Catch: java.lang.Throwable -> L9
        L3e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            java.lang.String r0 = com.ss.android.socialbase.appdownloader.f.s
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "registerDownloadReceiver mIsRegistered:"
            r1.<init>(r2)
            boolean r2 = com.ss.android.socialbase.appdownloader.f.v
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.ss.android.socialbase.downloader.m.j.xt(r0, r1)
            return
        L55:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r1
    }

    static /* synthetic */ java.lang.String J() {
            java.lang.String r0 = com.ss.android.socialbase.appdownloader.f.s
            return r0
    }

    public static com.ss.android.socialbase.appdownloader.f L() {
            com.ss.android.socialbase.appdownloader.f r0 = com.ss.android.socialbase.appdownloader.f.t
            if (r0 != 0) goto L19
            java.lang.Class<com.ss.android.socialbase.appdownloader.f> r0 = com.ss.android.socialbase.appdownloader.f.class
            monitor-enter(r0)
            com.ss.android.socialbase.appdownloader.f r1 = com.ss.android.socialbase.appdownloader.f.t     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.ss.android.socialbase.appdownloader.f r1 = new com.ss.android.socialbase.appdownloader.f     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.ss.android.socialbase.appdownloader.f.t = r1     // Catch: java.lang.Throwable -> L13
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
            com.ss.android.socialbase.appdownloader.f r0 = com.ss.android.socialbase.appdownloader.f.t
            return r0
    }

    private void N() {
            r1 = this;
            com.ss.android.socialbase.appdownloader.f$c r0 = new com.ss.android.socialbase.appdownloader.f$c
            r0.<init>(r1)
            com.ss.android.socialbase.downloader.impls.w.j(r0)
            return
    }

    public static android.util.Pair<android.content.Intent, java.lang.Boolean> T(android.content.Context r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L21
            com.ss.android.socialbase.downloader.jy.j r3 = com.ss.android.socialbase.downloader.jy.j.j(r3)
            java.lang.String r0 = "enable_target_34"
            int r3 = r3.xt(r0)
            if (r3 <= 0) goto L21
            android.content.Intent r3 = new android.content.Intent
            java.lang.Class<com.ss.android.socialbase.appdownloader.view.DownloadHandleNotificationActivity> r0 = com.ss.android.socialbase.appdownloader.view.DownloadHandleNotificationActivity.class
            r3.<init>(r2, r0)
            android.util.Pair r2 = new android.util.Pair
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.<init>(r3, r0)
            return r2
        L21:
            android.content.Intent r3 = new android.content.Intent
            java.lang.Class<com.ss.android.socialbase.appdownloader.DownloadHandlerService> r0 = com.ss.android.socialbase.appdownloader.DownloadHandlerService.class
            r3.<init>(r2, r0)
            android.util.Pair r2 = new android.util.Pair
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r2.<init>(r3, r0)
            return r2
    }

    private com.ss.android.socialbase.downloader.ae.cw U(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.ae r2 = com.ss.android.socialbase.downloader.downloader.ae.xt(r2)
            java.util.List r2 = r2.j(r3)
            if (r2 == 0) goto L23
            java.util.Iterator r2 = r2.iterator()
        Le:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L23
            java.lang.Object r3 = r2.next()
            com.ss.android.socialbase.downloader.ae.cw r3 = (com.ss.android.socialbase.downloader.ae.cw) r3
            if (r3 == 0) goto Le
            boolean r0 = r3.ag()
            if (r0 == 0) goto Le
            return r3
        L23:
            r2 = 0
            return r2
    }

    static /* synthetic */ w2.e W(com.ss.android.socialbase.appdownloader.f r0) {
            w2.e r0 = r0.j
            return r0
    }

    private void Y(int r4) {
            r3 = this;
            com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.cw()
            java.lang.String r1 = "app_install_keep_receiver_time_s"
            r2 = 60
            int r0 = r0.j(r1, r2)
            r3.e = r0
            java.lang.String r0 = com.ss.android.socialbase.appdownloader.f.s
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "tryUnRegisterTempAppInstallDownloadReceiver mAppInstallReceiverKeepTime:"
            r1.<init>(r2)
            int r2 = r3.e
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.ss.android.socialbase.downloader.m.j.xt(r0, r1)
            int r0 = r3.e
            if (r0 > 0) goto L28
            return
        L28:
            if (r4 <= 0) goto L2c
            r3.e = r4
        L2c:
            java.util.concurrent.Future r4 = r3.d
            if (r4 == 0) goto L39
            r0 = 1
            r4.cancel(r0)     // Catch: java.lang.Throwable -> L35
            goto L39
        L35:
            r4 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r4)
        L39:
            com.ss.android.socialbase.appdownloader.f$b r4 = new com.ss.android.socialbase.appdownloader.f$b
            r4.<init>(r3)
            int r0 = r3.e
            long r0 = (long) r0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.Future r4 = com.ss.android.socialbase.downloader.downloader.cw.j(r4, r0, r2)
            r3.d = r4
            return
    }

    private void e(android.content.Context r4) {
            r3 = this;
            if (r4 == 0) goto L30
            boolean r0 = com.ss.android.socialbase.appdownloader.f.u
            if (r0 != 0) goto L30
            java.lang.String r0 = "application/vnd.android.package-archive"
            com.ss.android.socialbase.downloader.xt.up.j(r0)
            com.ss.android.socialbase.downloader.downloader.cw.j(r4)
            com.ss.android.socialbase.appdownloader.f$h r4 = new com.ss.android.socialbase.appdownloader.f$h
            r4.<init>()
            com.ss.android.socialbase.downloader.downloader.cw.j(r4)
            boolean r4 = r3.g
            if (r4 == 0) goto L27
            com.ss.android.socialbase.appdownloader.f$a r4 = new com.ss.android.socialbase.appdownloader.f$a
            r4.<init>(r3)
            r0 = 5
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            com.ss.android.socialbase.downloader.downloader.cw.j(r4, r0, r2)
            goto L2a
        L27:
            r3.H()
        L2a:
            r3.N()
            r4 = 1
            com.ss.android.socialbase.appdownloader.f.u = r4
        L30:
            return
    }

    public static android.app.PendingIntent i(android.content.Context r2, android.util.Pair<android.content.Intent, java.lang.Boolean> r3, int r4) {
            java.lang.Object r0 = r3.second
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 201326592(0xc000000, float:9.8607613E-32)
            if (r0 == 0) goto L15
            java.lang.Object r3 = r3.first
            android.content.Intent r3 = (android.content.Intent) r3
            android.app.PendingIntent r2 = android.app.PendingIntent.getActivity(r2, r4, r3, r1)
            return r2
        L15:
            java.lang.Object r3 = r3.first
            android.content.Intent r3 = (android.content.Intent) r3
            android.app.PendingIntent r2 = android.app.PendingIntent.getService(r2, r4, r3, r1)
            return r2
    }

    private com.ss.android.socialbase.downloader.ae.cw k(android.content.Context r2, java.lang.String r3, java.io.File r4) {
            r1 = this;
            if (r2 == 0) goto L18
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L18
            if (r4 != 0) goto Lb
            goto L18
        Lb:
            com.ss.android.socialbase.downloader.downloader.ae r2 = com.ss.android.socialbase.downloader.downloader.ae.xt(r2)
            java.lang.String r4 = r4.getAbsolutePath()
            com.ss.android.socialbase.downloader.ae.cw r2 = r2.xt(r3, r4)
            return r2
        L18:
            r2 = 0
            return r2
    }

    private com.ss.android.socialbase.downloader.r.h l(w2.h r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            com.ss.android.socialbase.appdownloader.f$f r0 = new com.ss.android.socialbase.appdownloader.f$f
            r0.<init>(r1, r2)
            return r0
    }

    private java.util.List<com.ss.android.socialbase.downloader.ae.up> o(java.util.List<com.ss.android.socialbase.downloader.ae.up> r7) {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "User-Agent"
            r2 = 0
            if (r7 == 0) goto L52
            int r3 = r7.size()
            if (r3 <= 0) goto L52
            java.util.Iterator r7 = r7.iterator()
        L14:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L52
            java.lang.Object r3 = r7.next()
            com.ss.android.socialbase.downloader.ae.up r3 = (com.ss.android.socialbase.downloader.ae.up) r3
            if (r3 == 0) goto L14
            java.lang.String r4 = r3.j()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L14
            java.lang.String r4 = r3.xt()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L14
            java.lang.String r4 = r3.j()
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L41
            r2 = 1
        L41:
            com.ss.android.socialbase.downloader.ae.up r4 = new com.ss.android.socialbase.downloader.ae.up
            java.lang.String r5 = r3.j()
            java.lang.String r3 = r3.xt()
            r4.<init>(r5, r3)
            r0.add(r4)
            goto L14
        L52:
            if (r2 != 0) goto L5e
            com.ss.android.socialbase.downloader.ae.up r7 = new com.ss.android.socialbase.downloader.ae.up
            java.lang.String r2 = x2.a.a
            r7.<init>(r1, r2)
            r0.add(r7)
        L5e:
            return r0
    }

    static /* synthetic */ void t(com.ss.android.socialbase.appdownloader.f r0) {
            r0.H()
            return
    }

    static /* synthetic */ void u(com.ss.android.socialbase.appdownloader.f r0, com.ss.android.socialbase.downloader.ae.r r1, int r2, boolean r3) {
            r0.v(r1, r2, r3)
            return
    }

    private void v(com.ss.android.socialbase.downloader.ae.r r1, int r2, boolean r3) {
            r0 = this;
            if (r1 != 0) goto L3
            goto L16
        L3:
            r1.av()
            com.ss.android.socialbase.downloader.ae.cw r1 = r1.j()
            if (r1 == 0) goto Lf
            r1.ws(r2)
        Lf:
            if (r1 == 0) goto L16
            if (r3 == 0) goto L16
            r1.az(r3)
        L16:
            return
    }

    public void A(w2.a r1) {
            r0 = this;
            r0.m = r1
            return
    }

    public void B(w2.b r1) {
            r0 = this;
            r0.q = r1
            return
    }

    public void C(w2.d r1) {
            r0 = this;
            r0.r = r1
            return
    }

    public void D(w2.j r1) {
            r0 = this;
            r0.n = r1
            return
    }

    public void E(w2.l r1) {
            r0 = this;
            r0.k = r1
            return
    }

    public void G() {
            r3 = this;
            com.ss.android.socialbase.appdownloader.DownloadReceiver r0 = r3.c
            monitor-enter(r0)
            boolean r1 = com.ss.android.socialbase.appdownloader.f.v     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L1e
            if (r1 == 0) goto L22
            android.content.Context r1 = com.ss.android.socialbase.downloader.downloader.cw.nd()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L1e
            com.ss.android.socialbase.appdownloader.DownloadReceiver r2 = r3.c     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L1e
            r1.unregisterReceiver(r2)     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L1e
            boolean r1 = com.ss.android.socialbase.appdownloader.f.w     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L1e
            if (r1 == 0) goto L22
            w2.b r1 = r3.q     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L1e
            if (r1 == 0) goto L22
            r1.xt()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L1e
            goto L22
        L1c:
            r1 = move-exception
            goto L30
        L1e:
            r1 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r1)     // Catch: java.lang.Throwable -> L1c
        L22:
            r1 = 0
            com.ss.android.socialbase.appdownloader.f.v = r1     // Catch: java.lang.Throwable -> L1c
            com.ss.android.socialbase.appdownloader.f.w = r1     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r0 = com.ss.android.socialbase.appdownloader.f.s
            java.lang.String r1 = "registerDownloadReceiver unRegisterDownloadReceiver"
            com.ss.android.socialbase.downloader.m.j.xt(r0, r1)
            return
        L30:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            throw r1
    }

    public w2.a I() {
            r1 = this;
            w2.a r0 = r1.m
            return r0
    }

    public java.lang.String K() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public w2.e M() {
            r1 = this;
            w2.e r0 = r1.j
            return r0
    }

    public w2.j O() {
            r1 = this;
            w2.j r0 = r1.n
            return r0
    }

    public java.lang.String P() {
            r1 = this;
            java.lang.String r0 = r1.b
            return r0
    }

    public void Q() {
            r6 = this;
            com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.cw()
            java.lang.String r1 = "enable_app_install_receiver"
            r2 = 1
            int r0 = r0.j(r1, r2)
            if (r0 > 0) goto L15
            java.lang.String r0 = com.ss.android.socialbase.appdownloader.f.s
            java.lang.String r1 = "disable app install receiver"
            com.ss.android.socialbase.downloader.m.j.xt(r0, r1)
            return
        L15:
            com.ss.android.socialbase.appdownloader.DownloadReceiver r0 = r6.c
            monitor-enter(r0)
            r1 = 0
            boolean r3 = com.ss.android.socialbase.appdownloader.f.w     // Catch: java.lang.Throwable -> L69
            if (r3 == 0) goto L24
            r6.Y(r1)     // Catch: java.lang.Throwable -> L22
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            return
        L22:
            r1 = move-exception
            goto L6e
        L24:
            android.content.IntentFilter r3 = new android.content.IntentFilter     // Catch: java.lang.Throwable -> L4b
            r3.<init>()     // Catch: java.lang.Throwable -> L4b
            java.lang.String r4 = "android.intent.action.PACKAGE_ADDED"
            r3.addAction(r4)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r4 = "android.intent.action.PACKAGE_REPLACED"
            r3.addAction(r4)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r4 = "package"
            r3.addDataScheme(r4)     // Catch: java.lang.Throwable -> L4b
            android.content.Context r4 = com.ss.android.socialbase.downloader.downloader.cw.nd()     // Catch: java.lang.Throwable -> L4b
            com.ss.android.socialbase.appdownloader.DownloadReceiver r5 = r6.c     // Catch: java.lang.Throwable -> L4b
            r4.registerReceiver(r5, r3)     // Catch: java.lang.Throwable -> L4b
            com.ss.android.socialbase.appdownloader.f.w = r2     // Catch: java.lang.Throwable -> L4b
            w2.b r2 = r6.q     // Catch: java.lang.Throwable -> L4b
            if (r2 == 0) goto L4f
            r2.j()     // Catch: java.lang.Throwable -> L4b
            goto L4f
        L4b:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)     // Catch: java.lang.Throwable -> L69
        L4f:
            r6.Y(r1)     // Catch: java.lang.Throwable -> L22
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            java.lang.String r0 = com.ss.android.socialbase.appdownloader.f.s
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "tryRegisterTempAppInstallDownloadReceiver mIsAppInstallRegistered:"
            r1.<init>(r2)
            boolean r2 = com.ss.android.socialbase.appdownloader.f.v
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.ss.android.socialbase.downloader.m.j.xt(r0, r1)
            return
        L69:
            r2 = move-exception
            r6.Y(r1)     // Catch: java.lang.Throwable -> L22
            throw r2     // Catch: java.lang.Throwable -> L22
        L6e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            throw r1
    }

    public com.ss.android.socialbase.downloader.r.uf R() {
            r1 = this;
            com.ss.android.socialbase.downloader.r.uf r0 = r1.p
            return r0
    }

    public w2.o S() {
            r1 = this;
            w2.o r0 = r1.l
            return r0
    }

    public java.util.List<com.ss.android.socialbase.downloader.ae.cw> V(android.content.Context r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.ae r2 = com.ss.android.socialbase.downloader.downloader.ae.xt(r2)
            java.lang.String r0 = "application/vnd.android.package-archive"
            java.util.List r2 = r2.r(r0)
            return r2
    }

    public w2.k X() {
            r1 = this;
            w2.k r0 = r1.h
            return r0
    }

    public void Z(java.lang.String r2) {
            r1 = this;
            android.content.Context r0 = com.ss.android.socialbase.downloader.downloader.cw.nd()
            com.ss.android.socialbase.downloader.downloader.ae r0 = com.ss.android.socialbase.downloader.downloader.ae.xt(r0)
            r0.up(r2)
            return
    }

    public boolean a() {
            r3 = this;
            org.json.JSONObject r0 = com.ss.android.socialbase.downloader.jy.j.xt()
            java.lang.String r1 = "package_flag_config"
            r2 = 1
            int r0 = r0.optInt(r1, r2)
            if (r0 != r2) goto Le
            return r2
        Le:
            r0 = 0
            return r0
    }

    public com.ss.android.socialbase.downloader.downloader.mi b() {
            r1 = this;
            android.content.Context r0 = com.ss.android.socialbase.downloader.downloader.cw.nd()
            com.ss.android.socialbase.downloader.downloader.ae r0 = com.ss.android.socialbase.downloader.downloader.ae.xt(r0)
            com.ss.android.socialbase.downloader.downloader.mi r0 = r0.xt()
            return r0
    }

    public w2.l c() {
            r1 = this;
            w2.l r0 = r1.k
            return r0
    }

    public w2.m d() {
            r1 = this;
            w2.m r0 = r1.i
            return r0
    }

    public java.io.File f() {
            r1 = this;
            android.content.Context r0 = com.ss.android.socialbase.downloader.downloader.cw.nd()
            com.ss.android.socialbase.downloader.downloader.ae r0 = com.ss.android.socialbase.downloader.downloader.ae.xt(r0)
            java.io.File r0 = r0.cw()
            return r0
    }

    public com.ss.android.socialbase.downloader.r.gq g() {
            r1 = this;
            com.ss.android.socialbase.downloader.r.gq r0 = r1.o
            return r0
    }

    public int h(com.ss.android.socialbase.appdownloader.e r20) {
            r19 = this;
            r1 = r19
            r6 = r20
            r7 = 0
            if (r6 == 0) goto Ld
            android.content.Context r0 = r6.getContext()
            if (r0 != 0) goto L10
        Ld:
            r5 = 0
            goto L3cf
        L10:
            r8 = 1
            java.util.List r0 = r6.p0()     // Catch: java.lang.Throwable -> L44
            java.util.List r0 = r1.o(r0)     // Catch: java.lang.Throwable -> L44
            java.lang.String r2 = r6.M()     // Catch: java.lang.Throwable -> L44
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L44
            if (r3 == 0) goto L24
            return r7
        L24:
            int r4 = r6.Z()     // Catch: java.lang.Throwable -> L44
            if (r4 != 0) goto L2c
            r5 = 1
            goto L2d
        L2c:
            r5 = 0
        L2d:
            java.lang.String r3 = r6.x()     // Catch: java.lang.Throwable -> L44
            java.lang.String r9 = r6.R0()     // Catch: java.lang.Throwable -> L44
            boolean r10 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L44
            if (r10 == 0) goto L49
            java.lang.String r3 = r6.G0()     // Catch: java.lang.Throwable -> L44
            java.lang.String r3 = com.ss.android.socialbase.appdownloader.b.t(r2, r9, r3, r5)     // Catch: java.lang.Throwable -> L44
            goto L49
        L44:
            r0 = move-exception
            r17 = 0
            goto L3a9
        L49:
            int r10 = r3.length()     // Catch: java.lang.Throwable -> L44
            r11 = 255(0xff, float:3.57E-43)
            if (r10 <= r11) goto L5a
            int r10 = r3.length()     // Catch: java.lang.Throwable -> L44
            int r10 = r10 - r11
            java.lang.String r3 = r3.substring(r10)     // Catch: java.lang.Throwable -> L44
        L5a:
            r14 = r3
            boolean r3 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L44
            if (r3 == 0) goto L63
            r12 = r14
            goto L64
        L63:
            r12 = r9
        L64:
            java.lang.String r3 = r6.G0()     // Catch: java.lang.Throwable -> L44
            java.lang.String r9 = ".apk"
            boolean r9 = r14.endsWith(r9)     // Catch: java.lang.Throwable -> L44
            if (r9 == 0) goto L7c
            java.lang.String r9 = r6.G0()     // Catch: java.lang.Throwable -> L44
            boolean r9 = com.ss.android.socialbase.appdownloader.b.d(r9)     // Catch: java.lang.Throwable -> L44
            if (r9 != 0) goto L7c
            java.lang.String r3 = "application/vnd.android.package-archive"
        L7c:
            java.lang.String r9 = r6.o()     // Catch: java.lang.Throwable -> L44
            java.lang.String r10 = r6.o()     // Catch: java.lang.Throwable -> L44
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> L44
            if (r10 == 0) goto L8e
            java.lang.String r9 = com.ss.android.socialbase.appdownloader.b.L()     // Catch: java.lang.Throwable -> L44
        L8e:
            r13 = r9
            boolean r9 = android.text.TextUtils.isEmpty(r13)     // Catch: java.lang.Throwable -> L44
            if (r9 != 0) goto L9b
            boolean r9 = android.text.TextUtils.isEmpty(r14)     // Catch: java.lang.Throwable -> L44
            if (r9 == 0) goto L9f
        L9b:
            r17 = 0
            goto L3a8
        L9f:
            java.lang.String r9 = r6.A()     // Catch: java.lang.Throwable -> L44
            boolean r10 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L44
            if (r10 == 0) goto Laa
            r9 = r2
        Laa:
            int r11 = com.ss.android.socialbase.downloader.downloader.cw.j(r9, r13)     // Catch: java.lang.Throwable -> L44
            org.json.JSONObject r9 = r6.R()     // Catch: java.lang.Throwable -> L44
            com.ss.android.socialbase.downloader.jy.j r9 = com.ss.android.socialbase.downloader.jy.j.j(r9)     // Catch: java.lang.Throwable -> L44
            java.lang.String r10 = "resume_task_override_settings"
            boolean r9 = r9.j(r10)     // Catch: java.lang.Throwable -> L44
            if (r9 == 0) goto Ld8
            android.content.Context r9 = com.ss.android.socialbase.downloader.downloader.cw.nd()     // Catch: java.lang.Throwable -> L44
            com.ss.android.socialbase.downloader.downloader.ae r9 = com.ss.android.socialbase.downloader.downloader.ae.xt(r9)     // Catch: java.lang.Throwable -> L44
            com.ss.android.socialbase.downloader.ae.cw r9 = r9.tl(r11)     // Catch: java.lang.Throwable -> L44
            if (r9 == 0) goto Ld8
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r9 = r9.hl()     // Catch: java.lang.Throwable -> Ld8
            r10.<init>(r9)     // Catch: java.lang.Throwable -> Ld8
            r6.K(r10)     // Catch: java.lang.Throwable -> Ld8
        Ld8:
            org.json.JSONObject r9 = r6.R()     // Catch: java.lang.Throwable -> L44
            com.ss.android.socialbase.downloader.jy.j.j(r11, r9)     // Catch: java.lang.Throwable -> L44
            boolean r9 = r6.j()     // Catch: java.lang.Throwable -> L44
            com.ss.android.socialbase.downloader.jy.j r10 = com.ss.android.socialbase.downloader.jy.j.j(r11)     // Catch: java.lang.Throwable -> L44
            java.lang.String r15 = "modify_force"
            int r10 = r10.j(r15, r8)     // Catch: java.lang.Throwable -> L44
            if (r10 != r8) goto L106
            if (r9 != 0) goto L106
            boolean r10 = com.ss.android.socialbase.downloader.az.m.r(r13, r14)     // Catch: java.lang.Throwable -> L44
            if (r10 == 0) goto L106
            android.content.Context r10 = r6.getContext()     // Catch: java.lang.Throwable -> L44
            com.ss.android.socialbase.downloader.downloader.ae r10 = com.ss.android.socialbase.downloader.downloader.ae.xt(r10)     // Catch: java.lang.Throwable -> L44
            com.ss.android.socialbase.downloader.ae.cw r10 = r10.tl(r11)     // Catch: java.lang.Throwable -> L44
            if (r10 != 0) goto L106
            r9 = 1
        L106:
            com.ss.android.socialbase.downloader.r.a r10 = r6.f0()     // Catch: java.lang.Throwable -> L44
            if (r10 != 0) goto L127
            boolean r15 = r6.D0()     // Catch: java.lang.Throwable -> L44
            if (r15 != 0) goto L118
            boolean r15 = r6.Y()     // Catch: java.lang.Throwable -> L44
            if (r15 == 0) goto L127
        L118:
            com.ss.android.socialbase.downloader.notification.j r10 = r6.K0()     // Catch: java.lang.Throwable -> L44
            if (r10 == 0) goto L129
            com.ss.android.socialbase.appdownloader.up.d r10 = new com.ss.android.socialbase.appdownloader.up.d     // Catch: java.lang.Throwable -> L44
            com.ss.android.socialbase.downloader.notification.j r15 = r6.K0()     // Catch: java.lang.Throwable -> L44
            r10.<init>(r15)     // Catch: java.lang.Throwable -> L44
        L127:
            r8 = r9
            goto L13d
        L129:
            r10 = r9
            com.ss.android.socialbase.appdownloader.up.d r9 = new com.ss.android.socialbase.appdownloader.up.d     // Catch: java.lang.Throwable -> L44
            r15 = r10
            android.content.Context r10 = r6.getContext()     // Catch: java.lang.Throwable -> L44
            r16 = r15
            java.lang.String r15 = r6.l0()     // Catch: java.lang.Throwable -> L44
            r8 = r16
            r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L44
            r10 = r9
        L13d:
            com.ss.android.socialbase.downloader.r.az r9 = r6.b0()     // Catch: java.lang.Throwable -> L44
            if (r9 != 0) goto L148
            com.ss.android.socialbase.appdownloader.f$d r9 = new com.ss.android.socialbase.appdownloader.f$d     // Catch: java.lang.Throwable -> L44
            r9.<init>(r1)     // Catch: java.lang.Throwable -> L44
        L148:
            java.util.List r15 = com.ss.android.socialbase.downloader.downloader.cw.a()     // Catch: java.lang.Throwable -> L44
            boolean r16 = r15.isEmpty()     // Catch: java.lang.Throwable -> L44
            if (r16 != 0) goto L16e
            java.util.Iterator r15 = r15.iterator()     // Catch: java.lang.Throwable -> L44
        L156:
            boolean r16 = r15.hasNext()     // Catch: java.lang.Throwable -> L44
            if (r16 == 0) goto L16e
            java.lang.Object r16 = r15.next()     // Catch: java.lang.Throwable -> L44
            r17 = 0
            r7 = r16
            com.ss.android.socialbase.downloader.r.ws r7 = (com.ss.android.socialbase.downloader.r.ws) r7     // Catch: java.lang.Throwable -> L16b
            r6.G(r7)     // Catch: java.lang.Throwable -> L16b
            r7 = 0
            goto L156
        L16b:
            r0 = move-exception
            goto L3a9
        L16e:
            r17 = 0
            java.lang.String r7 = r6.l0()     // Catch: java.lang.Throwable -> L16b
            boolean r15 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L182
            if (r15 != 0) goto L187
            org.json.JSONObject r15 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L182
            r15.<init>(r7)     // Catch: java.lang.Throwable -> L182
        L17f:
            r16 = r4
            goto L18d
        L182:
            r16 = r4
        L184:
            r18 = r5
            goto L1a5
        L187:
            org.json.JSONObject r15 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L182
            r15.<init>()     // Catch: java.lang.Throwable -> L182
            goto L17f
        L18d:
            java.lang.String r4 = "auto_install_with_notification"
            r18 = r5
            boolean r5 = r6.d()     // Catch: java.lang.Throwable -> L1a5
            r15.put(r4, r5)     // Catch: java.lang.Throwable -> L1a5
            java.lang.String r4 = "auto_install_without_notification"
            boolean r5 = r6.Y()     // Catch: java.lang.Throwable -> L1a5
            r15.put(r4, r5)     // Catch: java.lang.Throwable -> L1a5
            java.lang.String r7 = r15.toString()     // Catch: java.lang.Throwable -> L1a5
        L1a5:
            boolean r4 = r6.D0()     // Catch: java.lang.Throwable -> L16b
            if (r4 != 0) goto L1b4
            boolean r4 = r6.Y()     // Catch: java.lang.Throwable -> L16b
            if (r4 == 0) goto L1b2
            goto L1b4
        L1b2:
            r4 = 0
            goto L1b5
        L1b4:
            r4 = 1
        L1b5:
            if (r4 == 0) goto L1ce
            com.ss.android.socialbase.downloader.jy.j r5 = com.ss.android.socialbase.downloader.jy.j.j(r11)     // Catch: java.lang.Throwable -> L16b
            java.lang.String r15 = "enable_notification_ui"
            int r5 = r5.xt(r15)     // Catch: java.lang.Throwable -> L16b
            if (r5 <= 0) goto L1ce
            com.ss.android.socialbase.appdownloader.up.a r5 = com.ss.android.socialbase.appdownloader.up.a.d()     // Catch: java.lang.Throwable -> L16b
            java.lang.String r15 = r6.s()     // Catch: java.lang.Throwable -> L16b
            r5.f(r11, r15)     // Catch: java.lang.Throwable -> L16b
        L1ce:
            android.content.Context r5 = r6.getContext()     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.ae.r r5 = com.ss.android.socialbase.downloader.downloader.ae.j(r5)     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.ae.r r2 = r5.cw(r2)     // Catch: java.lang.Throwable -> L16b
            java.util.List r5 = r6.s0()     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.ae.r r2 = r2.xt(r5)     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.ae.r r2 = r2.j(r14)     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.ae.r r2 = r2.xt(r12)     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.ae.r r2 = r2.r(r13)     // Catch: java.lang.Throwable -> L16b
            boolean r5 = r6.y0()     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.ae.r r2 = r2.xt(r5)     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.ae.r r0 = r2.j(r0)     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.ae.r r0 = r0.j(r9)     // Catch: java.lang.Throwable -> L16b
            int r2 = r6.E0()     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.ae.r r0 = r0.j(r2)     // Catch: java.lang.Throwable -> L16b
            int r2 = r6.L0()     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.ae.r r0 = r0.xt(r2)     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.ae.r r0 = r0.r(r4)     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.ae.r r0 = r0.up(r7)     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.ae.r r0 = r0.m(r3)     // Catch: java.lang.Throwable -> L16b
            int r2 = r6.y()     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.ae.r r0 = r0.r(r2)     // Catch: java.lang.Throwable -> L16b
            int r2 = r6.U()     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.ae.r r0 = r0.cw(r2)     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.r.a r2 = r6.v()     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.ae.r r0 = r0.j(r2)     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.ae.r r0 = r0.xt(r10)     // Catch: java.lang.Throwable -> L16b
            w2.h r2 = r6.q0()     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.r.h r2 = r1.l(r2)     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.ae.r r0 = r0.j(r2)     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.ae.r r0 = r0.cw(r8)     // Catch: java.lang.Throwable -> L16b
            boolean r2 = r6.B()     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.ae.r r0 = r0.m(r2)     // Catch: java.lang.Throwable -> L16b
            boolean r2 = r6.H0()     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.ae.r r0 = r0.ae(r2)     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.downloader.oq r2 = r6.h()     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.ae.r r0 = r0.j(r2)     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.downloader.g r2 = r6.f()     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.ae.r r0 = r0.j(r2)     // Catch: java.lang.Throwable -> L16b
            boolean r2 = r6.P()     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.ae.r r0 = r0.up(r2)     // Catch: java.lang.Throwable -> L16b
            java.lang.String r2 = r6.S()     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.ae.r r0 = r0.ae(r2)     // Catch: java.lang.Throwable -> L16b
            java.lang.String r2 = r6.v0()     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.ae.r r0 = r0.tl(r2)     // Catch: java.lang.Throwable -> L16b
            long r2 = r6.r()     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.ae.r r0 = r0.j(r2)     // Catch: java.lang.Throwable -> L16b
            boolean r2 = r6.k()     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.ae.r r0 = r0.tl(r2)     // Catch: java.lang.Throwable -> L16b
            java.lang.String r2 = r6.t0()     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.ae.r r0 = r0.g(r2)     // Catch: java.lang.Throwable -> L16b
            boolean r2 = r6.a()     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.ae.r r0 = r0.g(r2)     // Catch: java.lang.Throwable -> L16b
            boolean r2 = r6.T()     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.ae.r r0 = r0.oq(r2)     // Catch: java.lang.Throwable -> L16b
            boolean r2 = r6.w()     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.ae.r r0 = r0.vl(r2)     // Catch: java.lang.Throwable -> L16b
            boolean r2 = r6.r0()     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.ae.r r0 = r0.jy(r2)     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.xt.ae r2 = r6.q()     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.ae.r r0 = r0.j(r2)     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.r.l r2 = r6.a0()     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.ae.r r0 = r0.j(r2)     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.downloader.kt r2 = r6.g0()     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.ae.r r0 = r0.j(r2)     // Catch: java.lang.Throwable -> L16b
            boolean r2 = r6.I0()     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.ae.r r0 = r0.ws(r2)     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.r.tj r2 = r6.c0()     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.ae.r r0 = r0.j(r2)     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.r.mi r2 = r6.U0()     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.ae.r r0 = r0.j(r2)     // Catch: java.lang.Throwable -> L16b
            boolean r2 = r6.z0()     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.ae.r r0 = r0.qv(r2)     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.r.wq r2 = r6.z()     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.ae.r r0 = r0.j(r2)     // Catch: java.lang.Throwable -> L16b
            org.json.JSONObject r2 = r6.R()     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.ae.r r0 = r0.j(r2)     // Catch: java.lang.Throwable -> L16b
            java.lang.String r2 = r6.s()     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.ae.r r0 = r0.oq(r2)     // Catch: java.lang.Throwable -> L16b
            boolean r2 = r6.i0()     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.ae.r r0 = r0.az(r2)     // Catch: java.lang.Throwable -> L16b
            java.lang.String r2 = r6.S0()     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.ae.r r0 = r0.vl(r2)     // Catch: java.lang.Throwable -> L16b
            int[] r2 = r6.u0()     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.ae.r r0 = r0.j(r2)     // Catch: java.lang.Throwable -> L16b
            int r2 = r6.p()     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.ae.r r0 = r0.up(r2)     // Catch: java.lang.Throwable -> L16b
            long r2 = r6.h0()     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.ae.r r0 = r0.xt(r2)     // Catch: java.lang.Throwable -> L16b
            boolean r2 = r6.M0()     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.ae.r r0 = r0.av(r2)     // Catch: java.lang.Throwable -> L16b
            java.lang.String r2 = r6.A()     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.ae.r r0 = r0.qv(r2)     // Catch: java.lang.Throwable -> L16b
            boolean r2 = r6.Q()     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.ae.r r3 = r0.i(r2)     // Catch: java.lang.Throwable -> L16b
            if (r3 == 0) goto L359
            java.util.List r0 = r6.T0()     // Catch: java.lang.Throwable -> L16b
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L16b
            if (r0 != 0) goto L359
            java.util.List r0 = r6.T0()     // Catch: java.lang.Throwable -> L16b
            r3.cw(r0)     // Catch: java.lang.Throwable -> L16b
        L359:
            if (r3 == 0) goto L3a7
            if (r4 == 0) goto L38b
            boolean r0 = r6.i()     // Catch: java.lang.Throwable -> L16b
            if (r0 == 0) goto L38b
            android.app.Activity r0 = r6.getActivity()     // Catch: java.lang.Throwable -> L16b
            if (r0 == 0) goto L38b
            android.app.Activity r0 = r6.getActivity()     // Catch: java.lang.Throwable -> L16b
            boolean r0 = r0.isFinishing()     // Catch: java.lang.Throwable -> L16b
            if (r0 != 0) goto L38b
            boolean r0 = com.ss.android.socialbase.appdownloader.up.c.e()     // Catch: java.lang.Throwable -> L16b
            if (r0 != 0) goto L38b
            android.app.Activity r7 = r6.getActivity()     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.appdownloader.f$e r0 = new com.ss.android.socialbase.appdownloader.f$e     // Catch: java.lang.Throwable -> L16b
            r2 = r12
            r4 = r16
            r5 = r18
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.appdownloader.up.c.c(r7, r0)     // Catch: java.lang.Throwable -> L16b
            goto L3a7
        L38b:
            r4 = r16
            r5 = r18
            java.lang.String r0 = com.ss.android.socialbase.appdownloader.f.s     // Catch: java.lang.Throwable -> L16b
            java.lang.String r2 = "notification permission need not request, start download :"
            java.lang.String r7 = java.lang.String.valueOf(r12)     // Catch: java.lang.Throwable -> L16b
            java.lang.String r2 = r2.concat(r7)     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.downloader.m.j.xt(r0, r2)     // Catch: java.lang.Throwable -> L16b
            com.ss.android.socialbase.appdownloader.up.c.b(r11)     // Catch: java.lang.Throwable -> L16b
            r1.v(r3, r4, r5)     // Catch: java.lang.Throwable -> L16b
            r3.j()     // Catch: java.lang.Throwable -> L16b
        L3a7:
            return r11
        L3a8:
            return r17
        L3a9:
            com.ss.android.socialbase.downloader.r.l r2 = r6.a0()
            com.ss.android.socialbase.downloader.up.j r3 = new com.ss.android.socialbase.downloader.up.j
            java.lang.String r4 = "addDownloadTask"
            java.lang.String r4 = com.ss.android.socialbase.downloader.az.m.xt(r0, r4)
            r5 = 1003(0x3eb, float:1.406E-42)
            r3.<init>(r5, r4)
            r4 = 0
            r5 = 0
            com.ss.android.socialbase.downloader.tl.j.j(r2, r4, r3, r5)
            java.lang.String r2 = com.ss.android.socialbase.appdownloader.f.s
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r5] = r0
            java.lang.String r0 = "add download task error:%s"
            java.lang.String r0 = java.lang.String.format(r0, r3)
            com.ss.android.socialbase.downloader.m.j.up(r2, r0)
        L3cf:
            return r5
    }

    public com.ss.android.socialbase.downloader.ae.cw j(android.content.Context r5, java.lang.String r6) {
            r4 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            r1 = 0
            if (r0 != 0) goto L60
            if (r5 != 0) goto La
            goto L60
        La:
            java.io.File r0 = r4.f()     // Catch: java.lang.Throwable -> L1f
            com.ss.android.socialbase.downloader.ae.cw r0 = r4.k(r5, r6, r0)     // Catch: java.lang.Throwable -> L1f
            if (r0 != 0) goto L21
            java.lang.String r0 = android.os.Environment.DIRECTORY_DOWNLOADS     // Catch: java.lang.Throwable -> L1f
            java.io.File r0 = com.bytedance.sdk.openadsdk.api.plugin.xt.j(r5, r0)     // Catch: java.lang.Throwable -> L1f
            com.ss.android.socialbase.downloader.ae.cw r0 = r4.k(r5, r6, r0)     // Catch: java.lang.Throwable -> L1f
            goto L21
        L1f:
            r5 = move-exception
            goto L4b
        L21:
            if (r0 != 0) goto L2d
            java.lang.String r0 = android.os.Environment.DIRECTORY_DOWNLOADS     // Catch: java.lang.Throwable -> L1f
            java.io.File r0 = android.os.Environment.getExternalStoragePublicDirectory(r0)     // Catch: java.lang.Throwable -> L1f
            com.ss.android.socialbase.downloader.ae.cw r0 = r4.k(r5, r6, r0)     // Catch: java.lang.Throwable -> L1f
        L2d:
            if (r0 != 0) goto L37
            java.io.File r0 = com.bytedance.sdk.openadsdk.api.plugin.xt.j(r5)     // Catch: java.lang.Throwable -> L1f
            com.ss.android.socialbase.downloader.ae.cw r0 = r4.k(r5, r6, r0)     // Catch: java.lang.Throwable -> L1f
        L37:
            com.ss.android.socialbase.downloader.jy.j r2 = com.ss.android.socialbase.downloader.jy.j.cw()     // Catch: java.lang.Throwable -> L1f
            java.lang.String r3 = "get_download_info_by_list"
            boolean r2 = r2.j(r3)     // Catch: java.lang.Throwable -> L1f
            if (r0 != 0) goto L4a
            if (r2 == 0) goto L4a
            com.ss.android.socialbase.downloader.ae.cw r5 = r4.U(r5, r6)     // Catch: java.lang.Throwable -> L1f
            return r5
        L4a:
            return r0
        L4b:
            java.lang.String r6 = com.ss.android.socialbase.appdownloader.f.s
            java.lang.String r5 = r5.getMessage()
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            r0[r2] = r5
            java.lang.String r5 = "getAppDownloadInfo error:%s"
            java.lang.String r5 = java.lang.String.format(r5, r0)
            com.ss.android.socialbase.downloader.m.j.xt(r6, r5)
        L60:
            return r1
    }

    public java.lang.String m(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L17
            java.lang.String r0 = ".apk"
            boolean r2 = r2.endsWith(r0)
            if (r2 == 0) goto L17
            boolean r2 = com.ss.android.socialbase.appdownloader.b.d(r3)
            if (r2 != 0) goto L17
            java.lang.String r2 = "application/vnd.android.package-archive"
            return r2
        L17:
            return r3
    }

    public java.util.List<com.ss.android.socialbase.downloader.ae.cw> n(android.content.Context r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.ae r2 = com.ss.android.socialbase.downloader.downloader.ae.xt(r2)
            java.lang.String r0 = "application/vnd.android.package-archive"
            java.util.List r2 = r2.cw(r0)
            return r2
    }

    public w2.d p() {
            r1 = this;
            w2.d r0 = r1.r
            return r0
    }

    public void q(int r4) {
            r3 = this;
            com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.cw()
            java.lang.String r1 = "enable_app_install_receiver"
            r2 = 1
            int r0 = r0.j(r1, r2)
            if (r0 > 0) goto Le
            return
        Le:
            r3.Q()
            r3.Y(r4)
            return
    }

    public void r(android.content.Context r1, int r2, int r3) {
            r0 = this;
            switch(r3) {
                case -4: goto L1b;
                case -3: goto L16;
                case -2: goto Le;
                case -1: goto L1b;
                case 0: goto L3;
                case 1: goto L4;
                case 2: goto L4;
                case 3: goto L4;
                case 4: goto L4;
                case 5: goto L4;
                case 6: goto L3;
                case 7: goto L4;
                case 8: goto L4;
                default: goto L3;
            }
        L3:
            return
        L4:
            com.ss.android.socialbase.downloader.downloader.ae r1 = com.ss.android.socialbase.downloader.downloader.ae.xt(r1)     // Catch: java.lang.Exception -> Lc
            r1.j(r2)     // Catch: java.lang.Exception -> Lc
            return
        Lc:
            r1 = move-exception
            goto L23
        Le:
            com.ss.android.socialbase.downloader.downloader.ae r1 = com.ss.android.socialbase.downloader.downloader.ae.xt(r1)     // Catch: java.lang.Exception -> Lc
            r1.cw(r2)     // Catch: java.lang.Exception -> Lc
            return
        L16:
            r3 = 1
            com.ss.android.socialbase.appdownloader.b.h(r1, r2, r3)     // Catch: java.lang.Exception -> Lc
            return
        L1b:
            com.ss.android.socialbase.downloader.downloader.ae r1 = com.ss.android.socialbase.downloader.downloader.ae.xt(r1)     // Catch: java.lang.Exception -> Lc
            r1.up(r2)     // Catch: java.lang.Exception -> Lc
            return
        L23:
            com.bytedance.sdk.component.utils.vl.j(r1)
            return
    }

    @java.lang.Deprecated
    public void s(android.content.Context r1, java.lang.String r2, w2.k r3, w2.m r4, w2.e r5) {
            r0 = this;
            if (r3 == 0) goto L4
            r0.h = r3
        L4:
            if (r4 == 0) goto L8
            r0.i = r4
        L8:
            if (r5 == 0) goto Lc
            r0.j = r5
        Lc:
            r0.e(r1)
            return
    }

    public void w(com.ss.android.socialbase.downloader.downloader.mi r2) {
            r1 = this;
            android.content.Context r0 = com.ss.android.socialbase.downloader.downloader.cw.nd()
            com.ss.android.socialbase.downloader.downloader.ae r0 = com.ss.android.socialbase.downloader.downloader.ae.xt(r0)
            r0.j(r2)
            return
    }

    public void x(com.ss.android.socialbase.downloader.r.gq r1) {
            r0 = this;
            r0.o = r1
            return
    }

    public void y(com.ss.android.socialbase.downloader.r.uf r1) {
            r0 = this;
            r0.p = r1
            return
    }

    public void z(java.lang.String r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L7
            return
        L7:
            r1.b = r2
            return
    }
}
