package com.ss.android.downloadlib;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class d implements com.ss.android.socialbase.appdownloader.j.c, com.ss.android.socialbase.downloader.j.j.j, com.ss.android.socialbase.downloader.r.uf, y2.a {
    private static java.lang.String c = "d";
    private static volatile com.ss.android.downloadlib.d d;
    private long a;
    private com.ss.android.downloadlib.d.f b;

    class a implements com.ss.android.downloadlib.j.d {
        final /* synthetic */ com.ss.android.xt.j.xt.b a;
        final /* synthetic */ java.lang.String b;
        final /* synthetic */ com.ss.android.downloadlib.d c;

        a(com.ss.android.downloadlib.d r1, com.ss.android.xt.j.xt.b r2, java.lang.String r3) {
                r0 = this;
                r0.c = r1
                r0.a = r2
                r0.b = r3
                r0.<init>()
                return
        }

        @Override // com.ss.android.downloadlib.j.d
        public void j(boolean r4) {
                r3 = this;
                java.lang.String r0 = com.ss.android.downloadlib.d.t()
                java.lang.String r1 = "appBackForeground->"
                java.lang.String r2 = java.lang.String.valueOf(r4)
                java.lang.String r1 = r1.concat(r2)
                com.ss.android.socialbase.downloader.m.j.xt(r0, r1)
                r0 = 4
                if (r4 == 0) goto L42
                com.ss.android.xt.j.xt.b r4 = r3.a
                boolean r4 = com.ss.android.downloadlib.j.h.b(r4)
                if (r4 == 0) goto L25
                java.lang.String r4 = r3.b
                com.ss.android.xt.j.xt.b r1 = r3.a
                boolean r4 = com.ss.android.downloadlib.j.g.i(r4, r1)
                goto L26
            L25:
                r4 = 0
            L26:
                if (r4 != 0) goto L5d
                com.ss.android.xt.j.xt.b r4 = r3.a
                boolean r4 = com.ss.android.downloadlib.j.h.i(r4)
                if (r4 == 0) goto L5d
                com.ss.android.xt.j.xt.b r4 = r3.a
                int r4 = r4.l()
                if (r4 != r0) goto L5d
                com.ss.android.downloadlib.addownload.j.b r4 = com.ss.android.downloadlib.addownload.j.b.a()
                com.ss.android.xt.j.xt.b r0 = r3.a
                r4.f(r0)
                return
            L42:
                java.lang.String r4 = r3.b
                com.ss.android.xt.j.xt.b r1 = r3.a
                boolean r4 = com.ss.android.downloadlib.j.g.i(r4, r1)
                if (r4 != 0) goto L5d
                com.ss.android.xt.j.xt.b r4 = r3.a
                int r4 = r4.l()
                if (r4 != r0) goto L5d
                com.ss.android.downloadlib.addownload.j.b r4 = com.ss.android.downloadlib.addownload.j.b.a()
                com.ss.android.xt.j.xt.b r0 = r3.a
                r4.f(r0)
            L5d:
                return
        }
    }

    class b implements java.lang.Runnable {
        final /* synthetic */ long a;
        final /* synthetic */ com.ss.android.downloadlib.d b;

        b(com.ss.android.downloadlib.d r1, long r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                com.ss.android.downloadlib.d r0 = com.ss.android.downloadlib.d.d()
                long r1 = r3.a
                r0.h(r1)
                return
        }
    }

    class c implements java.lang.Runnable {
        final /* synthetic */ java.lang.String a;
        final /* synthetic */ com.ss.android.xt.j.xt.b b;
        final /* synthetic */ com.ss.android.downloadlib.d c;

        c(com.ss.android.downloadlib.d r1, java.lang.String r2, com.ss.android.xt.j.xt.b r3) {
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
                java.lang.String r0 = r4.a
                java.lang.String r0 = com.ss.android.downloadlib.a.g.c(r0)
                boolean r1 = android.text.TextUtils.isEmpty(r0)
                if (r1 == 0) goto Ld
                return
            Ld:
                android.content.Context r1 = com.ss.android.downloadlib.addownload.m.getContext()
                java.lang.String r2 = "sp_ttdownloader_md5"
                r3 = 0
                android.content.SharedPreferences r1 = com.bytedance.sdk.openadsdk.ats.cw.j(r1, r2, r3)
                android.content.SharedPreferences$Editor r1 = r1.edit()
                com.ss.android.xt.j.xt.b r2 = r4.b
                long r2 = r2.xt()
                java.lang.String r2 = java.lang.String.valueOf(r2)
                android.content.SharedPreferences$Editor r0 = r1.putString(r2, r0)
                r0.apply()
                return
        }
    }

    /* renamed from: com.ss.android.downloadlib.d$d, reason: collision with other inner class name */
    class C0212d implements com.ss.android.downloadlib.j.InterfaceC0216j {
        final /* synthetic */ com.ss.android.socialbase.downloader.ae.cw a;
        final /* synthetic */ org.json.JSONObject b;
        final /* synthetic */ com.ss.android.downloadlib.d c;

        C0212d(com.ss.android.downloadlib.d r1, com.ss.android.socialbase.downloader.ae.cw r2, org.json.JSONObject r3) {
                r0 = this;
                r0.c = r1
                r0.a = r2
                r0.b = r3
                r0.<init>()
                return
        }

        @Override // com.ss.android.downloadlib.j.InterfaceC0216j
        public void j(boolean r5) {
                r4 = this;
                if (r5 != 0) goto L39
                com.ss.android.socialbase.downloader.ae.cw r0 = r4.a
                java.util.concurrent.ConcurrentHashMap r0 = r0.vm()
                java.lang.String r1 = "intent"
                java.lang.Object r0 = r0.get(r1)
                android.content.Intent r0 = (android.content.Intent) r0
                java.lang.String r2 = "backup"
                if (r0 == 0) goto L2f
                com.ss.android.socialbase.downloader.ae.cw r3 = r4.a
                java.util.concurrent.ConcurrentHashMap r3 = r3.vm()
                r3.remove(r1)
                android.content.Context r1 = com.ss.android.downloadlib.addownload.m.getContext()
                com.ss.android.socialbase.appdownloader.b.j(r1, r0)
                org.json.JSONObject r0 = r4.b
                r1 = 1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                com.ss.android.downloadlib.a.h.u(r0, r2, r1)
                goto L39
            L2f:
                org.json.JSONObject r0 = r4.b
                r1 = 2
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                com.ss.android.downloadlib.a.h.u(r0, r2, r1)
            L39:
                com.ss.android.downloadlib.addownload.o$f r0 = com.ss.android.downloadlib.addownload.o.f.c()
                com.ss.android.socialbase.downloader.ae.cw r1 = r4.a
                com.ss.android.xt.j.xt.b r0 = r0.f(r1)
                if (r0 == 0) goto L56
                com.ss.android.downloadlib.r.b r1 = com.ss.android.downloadlib.r.b.a()
                if (r5 == 0) goto L4e
                java.lang.String r2 = "installer_delay_success"
                goto L50
            L4e:
                java.lang.String r2 = "installer_delay_failed"
            L50:
                org.json.JSONObject r3 = r4.b
                r1.r(r2, r3, r0)
                goto L5f
            L56:
                com.ss.android.downloadlib.up.a r0 = com.ss.android.downloadlib.up.a.a()
                java.lang.String r1 = "ah nativeModel=null"
                r0.f(r1)
            L5f:
                if (r5 == 0) goto L67
                com.ss.android.downloadlib.addownload.m.C()
                com.ss.android.downloadlib.addownload.m.getContext()
            L67:
                return
        }
    }

    @androidx.annotation.WorkerThread
    private class e implements java.lang.Runnable {
        private final int a;
        final /* synthetic */ com.ss.android.downloadlib.d b;

        public e(com.ss.android.downloadlib.d r1, int r2) {
                r0 = this;
                r0.b = r1
                r0.<init>()
                r0.a = r2
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                com.ss.android.downloadlib.addownload.o$f r0 = com.ss.android.downloadlib.addownload.o.f.c()     // Catch: java.lang.Exception -> L1f
                r0.v()     // Catch: java.lang.Exception -> L1f
                com.ss.android.downloadlib.addownload.o$f r0 = com.ss.android.downloadlib.addownload.o.f.c()     // Catch: java.lang.Exception -> L1f
                java.util.concurrent.ConcurrentHashMap r0 = r0.b()     // Catch: java.lang.Exception -> L1f
                if (r0 == 0) goto L21
                boolean r1 = r0.isEmpty()     // Catch: java.lang.Exception -> L1f
                if (r1 != 0) goto L21
                com.ss.android.downloadlib.d r1 = r3.b     // Catch: java.lang.Exception -> L1f
                int r2 = r3.a     // Catch: java.lang.Exception -> L1f
                com.ss.android.downloadlib.d.k(r1, r0, r2)     // Catch: java.lang.Exception -> L1f
                return
            L1f:
                r0 = move-exception
                goto L22
            L21:
                return
            L22:
                com.bytedance.sdk.component.utils.vl.j(r0)
                return
        }
    }

    private static class f implements java.lang.Runnable {
        private long a;
        private int b;
        private long c;
        private int d;
        private long e;

        private f(long r1, int r3, long r4, int r6) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r3
                r0.c = r4
                r0.d = r6
                return
        }

        /* synthetic */ f(long r1, int r3, long r4, int r6, com.ss.android.downloadlib.d.a r7) {
                r0 = this;
                r0.<init>(r1, r3, r4, r6)
                return
        }

        private int a(boolean r7, com.ss.android.xt.j.xt.b r8, com.ss.android.socialbase.downloader.ae.cw r9, boolean r10, org.json.JSONObject r11) {
                r6 = this;
                int r0 = r9.ae()
                com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.j(r0)
                java.lang.String r1 = "install_failed_check_ttmd5"
                r2 = 1
                int r1 = r0.j(r1, r2)
                if (r1 != r2) goto L25
                int r1 = r9.lo()
                java.lang.String r3 = "ttmd5_status"
                r11.put(r3, r1)     // Catch: java.lang.Throwable -> L1b
                goto L1c
            L1b:
            L1c:
                boolean r1 = com.ss.android.socialbase.downloader.az.m.j(r1)
                if (r1 != 0) goto L25
                r7 = 2005(0x7d5, float:2.81E-42)
                return r7
            L25:
                int r1 = r6.d
                r3 = 2000(0x7d0, float:2.803E-42)
                if (r1 == r3) goto L2c
                return r1
            L2c:
                java.lang.String r1 = "install_failed_check_signature"
                int r0 = r0.j(r1, r2)
                if (r0 != r2) goto L63
                android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
                java.lang.String r1 = r8.up()
                boolean r0 = com.ss.android.downloadlib.a.h.G(r0, r1)
                if (r0 == 0) goto L63
                android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
                java.lang.String r1 = r8.up()
                android.content.pm.Signature[] r0 = com.ss.android.downloadlib.a.h.F(r0, r1)
                android.content.Context r1 = com.ss.android.downloadlib.addownload.m.getContext()
                java.lang.String r9 = r9.ws()
                android.content.pm.Signature[] r9 = com.ss.android.downloadlib.a.h.e(r1, r9)
                boolean r9 = com.ss.android.downloadlib.a.h.B(r9, r0)
                if (r9 != 0) goto L63
                r7 = 2006(0x7d6, float:2.811E-42)
                return r7
            L63:
                if (r7 != 0) goto L68
                r7 = 2002(0x7d2, float:2.805E-42)
                return r7
            L68:
                long r0 = r6.e
                long r4 = r6.c
                int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r7 <= 0) goto L91
                java.lang.String r7 = "install_time"
                long r0 = r0 - r4
                r11.put(r7, r0)     // Catch: java.lang.Throwable -> L88
                java.lang.String r7 = "install_again"
                long r8 = r8.g0()     // Catch: java.lang.Throwable -> L88
                long r0 = r6.c     // Catch: java.lang.Throwable -> L88
                int r3 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r3 <= 0) goto L83
                goto L84
            L83:
                r2 = 0
            L84:
                r11.put(r7, r2)     // Catch: java.lang.Throwable -> L88
                goto L89
            L88:
            L89:
                if (r10 != 0) goto L8e
                r7 = 2003(0x7d3, float:2.807E-42)
                return r7
            L8e:
                r7 = 2004(0x7d4, float:2.808E-42)
                return r7
            L91:
                return r3
        }

        static /* synthetic */ void b(com.ss.android.downloadlib.d.f r0) {
                r0.d()
                return
        }

        private void d() {
                r2 = this;
                long r0 = java.lang.System.currentTimeMillis()
                r2.e = r0
                return
        }

        boolean c() {
                r20 = this;
                r1 = r20
                com.ss.android.downloadlib.addownload.o$f r0 = com.ss.android.downloadlib.addownload.o.f.c()
                long r2 = r1.a
                com.ss.android.xt.j.xt.b r3 = r0.q(r2)
                r0 = 0
                if (r3 == 0) goto L1d
                boolean r2 = com.ss.android.downloadlib.a.h.M(r3)
                if (r2 != 0) goto L1d
                java.util.concurrent.atomic.AtomicBoolean r2 = r3.N
                boolean r2 = r2.get()
                if (r2 == 0) goto L20
            L1d:
                r2 = 0
                goto Lf6
            L20:
                android.content.Context r2 = com.ss.android.downloadlib.addownload.m.getContext()
                com.ss.android.socialbase.downloader.downloader.ae r2 = com.ss.android.socialbase.downloader.downloader.ae.xt(r2)
                int r4 = r3.mi()
                com.ss.android.socialbase.downloader.ae.cw r4 = r2.tl(r4)
                if (r4 != 0) goto L33
                return r0
            L33:
                long r7 = r3.Z()
                java.io.File r2 = android.os.Environment.getDataDirectory()
                long r9 = com.ss.android.downloadlib.a.h.h(r2)
                r5 = 10
                long r5 = r9 / r5
                r11 = 524288000(0x1f400000, double:2.590326893E-315)
                long r5 = java.lang.Math.min(r11, r5)
                long r11 = r4.ka()
                double r5 = (double) r5
                double r13 = (double) r11
                r15 = 4612811918334230528(0x4004000000000000, double:2.5)
                double r15 = r15 * r13
                double r5 = r5 + r15
                r15 = -1
                r17 = 1
                int r2 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
                if (r2 <= 0) goto L68
                int r2 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
                if (r2 <= 0) goto L68
                r2 = 0
                double r0 = (double) r7
                int r15 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                if (r15 >= 0) goto L68
                goto L69
            L68:
                r2 = 1
            L69:
                android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
                boolean r5 = com.ss.android.socialbase.appdownloader.j.n(r0)
                org.json.JSONObject r6 = new org.json.JSONObject
                r6.<init>()
                r1 = r20
                int r0 = r1.a(r2, r3, r4, r5, r6)
                r1.d = r0
                java.lang.String r4 = "fail_status"
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> Lb0
                r6.putOpt(r4, r0)     // Catch: java.lang.Exception -> Lb0
                java.lang.String r0 = "available_space"
                r15 = 1048576(0x100000, double:5.180654E-318)
                long r18 = r7 / r15
                java.lang.Long r4 = java.lang.Long.valueOf(r18)     // Catch: java.lang.Exception -> Lb0
                r6.putOpt(r0, r4)     // Catch: java.lang.Exception -> Lb0
                java.lang.String r0 = "total_space"
                long r9 = r9 / r15
                java.lang.Long r4 = java.lang.Long.valueOf(r9)     // Catch: java.lang.Exception -> Lb0
                r6.putOpt(r0, r4)     // Catch: java.lang.Exception -> Lb0
                r9 = 0
                int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
                if (r0 <= 0) goto Lb2
                java.lang.String r4 = "package_size"
                long r11 = r11 / r15
                java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch: java.lang.Exception -> Lb0
                r6.putOpt(r4, r11)     // Catch: java.lang.Exception -> Lb0
                goto Lb2
            Lb0:
                r0 = move-exception
                goto Le9
            Lb2:
                java.lang.String r4 = "space_enough"
                r11 = 2
                if (r2 == 0) goto Lb9
                r2 = 1
                goto Lba
            Lb9:
                r2 = 2
            Lba:
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> Lb0
                r6.putOpt(r4, r2)     // Catch: java.lang.Exception -> Lb0
                int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r2 <= 0) goto Lce
                if (r0 <= 0) goto Lce
                java.lang.String r0 = "available_space_ratio"
                double r7 = (double) r7     // Catch: java.lang.Exception -> Lb0
                double r7 = r7 / r13
                r6.put(r0, r7)     // Catch: java.lang.Exception -> Lb0
            Lce:
                java.lang.String r0 = "permission_unknown_source_install"
                if (r5 == 0) goto Ld4
                r2 = 1
                goto Ld5
            Ld4:
                r2 = 2
            Ld5:
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> Lb0
                r6.putOpt(r0, r2)     // Catch: java.lang.Exception -> Lb0
                java.lang.String r0 = "is_update_download"
                boolean r2 = r3.i0()     // Catch: java.lang.Exception -> Lb0
                if (r2 == 0) goto Le5
                r11 = 1
            Le5:
                r6.put(r0, r11)     // Catch: java.lang.Exception -> Lb0
                goto Lec
            Le9:
                com.bytedance.sdk.component.utils.vl.j(r0)
            Lec:
                com.ss.android.downloadlib.r.b r0 = com.ss.android.downloadlib.r.b.a()
                java.lang.String r2 = "install_failed"
                r0.x(r2, r6, r3)
                return r17
            Lf6:
                return r2
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                boolean r0 = r4.c()     // Catch: java.lang.Throwable -> L12
                if (r0 == 0) goto L14
                com.ss.android.downloadlib.d r0 = com.ss.android.downloadlib.d.d()     // Catch: java.lang.Throwable -> L12
                long r1 = r4.a     // Catch: java.lang.Throwable -> L12
                int r3 = r4.b     // Catch: java.lang.Throwable -> L12
                r0.i(r1, r3)     // Catch: java.lang.Throwable -> L12
                return
            L12:
                r0 = move-exception
                goto L15
            L14:
                return
            L15:
                com.bytedance.sdk.component.utils.vl.j(r0)
                return
        }
    }

    static {
            return
    }

    private d() {
            r1 = this;
            r1.<init>()
            com.ss.android.socialbase.appdownloader.j.l(r1)
            com.ss.android.socialbase.downloader.j.j r0 = com.ss.android.socialbase.downloader.j.j.j()
            r0.j(r1)
            return
    }

    public static java.lang.String b(@androidx.annotation.NonNull com.ss.android.socialbase.downloader.ae.cw r4, @androidx.annotation.NonNull com.ss.android.xt.j.xt.b r5) {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r4.qv()
            java.lang.String r2 = r4.tl()
            r0.<init>(r1, r2)
            boolean r1 = r0.exists()
            r2 = 0
            if (r1 == 0) goto L31
            android.content.Context r1 = com.ss.android.downloadlib.addownload.m.getContext()     // Catch: java.lang.Exception -> L2d
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Exception -> L2d
            java.lang.String r0 = r0.getAbsolutePath()     // Catch: java.lang.Exception -> L2d
            int r3 = com.ss.android.socialbase.appdownloader.b.e()     // Catch: java.lang.Exception -> L2d
            android.content.pm.PackageInfo r0 = r1.getPackageArchiveInfo(r0, r3)     // Catch: java.lang.Exception -> L2d
            if (r0 == 0) goto L31
            java.lang.String r2 = r0.packageName     // Catch: java.lang.Exception -> L2d
            goto L31
        L2d:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
        L31:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L65
            java.lang.String r0 = r4.la()
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L65
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "real_package_name"
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L55
            java.lang.String r1 = "input_package_name"
            java.lang.String r4 = r4.la()     // Catch: org.json.JSONException -> L55
            r0.put(r1, r4)     // Catch: org.json.JSONException -> L55
            goto L59
        L55:
            r4 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r4)
        L59:
            com.ss.android.downloadlib.r.b r4 = com.ss.android.downloadlib.r.b.a()
            java.lang.String r1 = "embeded_ad"
            java.lang.String r3 = "package_name_error"
            r4.p(r1, r3, r0, r5)
            return r2
        L65:
            java.lang.String r4 = r4.la()
            return r4
    }

    private int c(com.ss.android.xt.j.xt.b r6, com.ss.android.socialbase.downloader.ae.cw r7, java.lang.String r8, org.json.JSONObject r9) {
            r5 = this;
            android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
            int r0 = com.ss.android.socialbase.appdownloader.b.K(r0, r7)
            android.content.Context r1 = com.ss.android.downloadlib.addownload.m.getContext()
            int r1 = com.ss.android.downloadlib.a.h.H(r1, r8)
            if (r0 <= 0) goto L1e
            if (r1 <= 0) goto L1e
            if (r0 == r1) goto L1e
            if (r1 <= r0) goto L1b
            r6 = 3011(0xbc3, float:4.22E-42)
            return r6
        L1b:
            r6 = 3010(0xbc2, float:4.218E-42)
            return r6
        L1e:
            int r0 = r6.mi()
            com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.j(r0)
            java.lang.String r1 = "install_finish_check_ttmd5"
            r2 = 1
            int r0 = r0.j(r1, r2)
            if (r0 != r2) goto L70
            android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
            java.lang.String r1 = "sp_ttdownloader_md5"
            r3 = 0
            android.content.SharedPreferences r0 = com.bytedance.sdk.openadsdk.ats.cw.j(r0, r1, r3)
            long r3 = r6.xt()
            java.lang.String r6 = java.lang.String.valueOf(r3)
            r1 = 0
            java.lang.String r6 = r0.getString(r6, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L57
            if (r7 == 0) goto L57
            java.lang.String r6 = r7.ws()
            java.lang.String r6 = com.ss.android.downloadlib.a.g.c(r6)
        L57:
            java.lang.String r7 = com.ss.android.downloadlib.a.g.f(r8)
            int r6 = com.ss.android.downloadlib.a.g.b(r6, r7)
            java.lang.String r7 = "ttmd5_status"
            r9.put(r7, r6)     // Catch: java.lang.Throwable -> L65
            goto L66
        L65:
        L66:
            if (r6 != 0) goto L6b
            r6 = 3000(0xbb8, float:4.204E-42)
            return r6
        L6b:
            if (r6 != r2) goto L70
            r6 = 3002(0xbba, float:4.207E-42)
            return r6
        L70:
            r6 = 3001(0xbb9, float:4.205E-42)
            return r6
    }

    public static com.ss.android.downloadlib.d d() {
            com.ss.android.downloadlib.d r0 = com.ss.android.downloadlib.d.d
            if (r0 != 0) goto L19
            java.lang.Class<com.ss.android.downloadlib.d> r0 = com.ss.android.downloadlib.d.class
            monitor-enter(r0)
            com.ss.android.downloadlib.d r1 = com.ss.android.downloadlib.d.d     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.ss.android.downloadlib.d r1 = new com.ss.android.downloadlib.d     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.ss.android.downloadlib.d.d = r1     // Catch: java.lang.Throwable -> L13
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
            com.ss.android.downloadlib.d r0 = com.ss.android.downloadlib.d.d
            return r0
    }

    private static com.ss.android.socialbase.downloader.ae.cw e(java.util.List<com.ss.android.socialbase.downloader.ae.cw> r4, java.lang.String r5) {
            r0 = 0
            if (r4 == 0) goto L3c
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L3c
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 == 0) goto L10
            goto L3c
        L10:
            java.util.Iterator r4 = r4.iterator()
        L14:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L3c
            java.lang.Object r1 = r4.next()
            com.ss.android.socialbase.downloader.ae.cw r1 = (com.ss.android.socialbase.downloader.ae.cw) r1
            if (r1 == 0) goto L14
            java.lang.String r2 = r1.la()
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L2d
            goto L3b
        L2d:
            java.lang.String r2 = r1.ws()
            android.content.Context r3 = com.ss.android.downloadlib.addownload.m.getContext()
            boolean r2 = com.ss.android.downloadlib.a.h.y(r3, r2, r5)
            if (r2 == 0) goto L14
        L3b:
            return r1
        L3c:
            return r0
    }

    private org.json.JSONObject f(com.ss.android.xt.j.xt.b r11, java.lang.String r12, int r13) {
            r10 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            android.content.Context r1 = com.ss.android.downloadlib.addownload.m.getContext()     // Catch: java.lang.Throwable -> L51
            com.ss.android.socialbase.downloader.downloader.ae r1 = com.ss.android.socialbase.downloader.downloader.ae.xt(r1)     // Catch: java.lang.Throwable -> L51
            int r2 = r11.mi()     // Catch: java.lang.Throwable -> L51
            com.ss.android.socialbase.downloader.ae.cw r1 = r1.tl(r2)     // Catch: java.lang.Throwable -> L51
            java.lang.String r2 = "scene"
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch: java.lang.Throwable -> L51
            r0.putOpt(r2, r13)     // Catch: java.lang.Throwable -> L51
            int r13 = r11.mi()     // Catch: java.lang.Throwable -> L51
            com.ss.android.downloadlib.a.i.f(r0, r13)     // Catch: java.lang.Throwable -> L51
            com.ss.android.downloadlib.a.i.d(r11, r0)     // Catch: java.lang.Throwable -> L51
            java.lang.String r13 = "is_update_download"
            boolean r2 = r11.i0()     // Catch: java.lang.Throwable -> L51
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L34
            r2 = 1
            goto L35
        L34:
            r2 = 2
        L35:
            r0.put(r13, r2)     // Catch: java.lang.Throwable -> L51
            java.lang.String r13 = "install_after_back_app"
            boolean r2 = r11.x()     // Catch: java.lang.Throwable -> L51
            if (r2 == 0) goto L42
            r2 = 1
            goto L43
        L42:
            r2 = 2
        L43:
            r0.put(r13, r2)     // Catch: java.lang.Throwable -> L51
            java.lang.String r13 = "clean_space_install_params"
            boolean r2 = r11.b1()     // Catch: java.lang.Throwable -> L51
            if (r2 == 0) goto L54
            java.lang.String r2 = "1"
            goto L56
        L51:
            r11 = move-exception
            goto Ldb
        L54:
            java.lang.String r2 = "2"
        L56:
            r0.putOpt(r13, r2)     // Catch: java.lang.Throwable -> L51
            r13 = 0
            if (r1 == 0) goto Lbc
            g(r0, r1)     // Catch: java.lang.Throwable -> L51
            java.lang.String r2 = "uninstall_resume_count"
            int r5 = r1.lc()     // Catch: java.lang.Throwable -> L9e
            r0.put(r2, r5)     // Catch: java.lang.Throwable -> L9e
            long r5 = r11.g0()     // Catch: java.lang.Throwable -> L9e
            r7 = 0
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 <= 0) goto L9e
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L9e
            long r7 = r11.g0()     // Catch: java.lang.Throwable -> L9e
            long r5 = r5 - r7
            java.lang.String r2 = "install_time"
            r0.put(r2, r5)     // Catch: java.lang.Throwable -> L9e
            int r2 = r1.ae()     // Catch: java.lang.Throwable -> L9e
            com.ss.android.socialbase.downloader.jy.j r2 = com.ss.android.socialbase.downloader.jy.j.j(r2)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r7 = "check_install_finish_expired_duration"
            r8 = 86400000(0x5265c00, double:4.2687272E-316)
            long r7 = r2.j(r7, r8)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r2 = "install_expired"
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L9b
            r0.put(r2, r4)     // Catch: java.lang.Throwable -> L9e
            goto L9e
        L9b:
            r0.put(r2, r13)     // Catch: java.lang.Throwable -> L9e
        L9e:
            java.util.concurrent.ConcurrentHashMap r2 = r1.vm()     // Catch: java.lang.Throwable -> L51
            java.lang.String r5 = "ah_attempt"
            java.lang.Object r2 = r2.get(r5)     // Catch: java.lang.Throwable -> L51
            r5 = 0
            java.lang.String r2 = com.ss.android.socialbase.downloader.az.m.j(r2, r5)     // Catch: java.lang.Throwable -> L51
            boolean r5 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L51
            if (r5 != 0) goto Lbc
            com.ss.android.socialbase.appdownloader.d r2 = com.ss.android.socialbase.appdownloader.d.a(r2)     // Catch: java.lang.Throwable -> L51
            if (r2 == 0) goto Lbc
            r2.c(r0)     // Catch: java.lang.Throwable -> L51
        Lbc:
            int r11 = r10.c(r11, r1, r12, r0)     // Catch: java.lang.Throwable -> L51
            java.lang.String r12 = "fail_status"
            r0.put(r12, r11)     // Catch: java.lang.Throwable -> L51
            r12 = 3000(0xbb8, float:4.204E-42)
            java.lang.String r1 = "hijack"
            if (r11 != r12) goto Lcf
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L51
            goto Lde
        Lcf:
            r12 = 3001(0xbb9, float:4.205E-42)
            if (r11 != r12) goto Ld7
            r0.put(r1, r13)     // Catch: java.lang.Throwable -> L51
            goto Lde
        Ld7:
            r0.put(r1, r4)     // Catch: java.lang.Throwable -> L51
            goto Lde
        Ldb:
            com.bytedance.sdk.component.utils.vl.j(r11)
        Lde:
            return r0
    }

    public static org.json.JSONObject g(org.json.JSONObject r8, com.ss.android.socialbase.downloader.ae.cw r9) {
            if (r8 == 0) goto L1fa
            if (r9 != 0) goto L6
            goto L1fa
        L6:
            int r0 = r9.ae()
            com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.j(r0)
            java.lang.String r1 = "download_event_opt"
            r2 = 1
            int r0 = r0.j(r1, r2)
            if (r0 != 0) goto L19
            goto L1fa
        L19:
            java.lang.String r0 = "download_id"
            int r1 = r9.ae()     // Catch: java.lang.Throwable -> Lac
            r8.put(r0, r1)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r0 = "name"
            java.lang.String r1 = r9.tl()     // Catch: java.lang.Throwable -> Lac
            r8.put(r0, r1)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r0 = "cur_bytes"
            long r3 = r9.uq()     // Catch: java.lang.Throwable -> Lac
            r8.put(r0, r3)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r0 = "total_bytes"
            long r3 = r9.ka()     // Catch: java.lang.Throwable -> Lac
            r8.put(r0, r3)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r0 = "network_quality"
            java.lang.String r1 = r9.wo()     // Catch: java.lang.Throwable -> Lac
            r8.put(r0, r1)     // Catch: java.lang.Throwable -> Lac
            com.ss.android.socialbase.downloader.g.vl r0 = com.ss.android.socialbase.downloader.g.vl.j()     // Catch: java.lang.Throwable -> Lac
            com.ss.android.socialbase.downloader.g.jy r0 = r0.xt()     // Catch: java.lang.Throwable -> Lac
            java.lang.String r1 = "current_network_quality"
            java.lang.String r0 = r0.name()     // Catch: java.lang.Throwable -> Lac
            r8.put(r1, r0)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r0 = "only_wifi"
            boolean r1 = r9.x()     // Catch: java.lang.Throwable -> Lac
            r8.put(r0, r1)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r0 = "need_https_degrade"
            boolean r1 = r9.d()     // Catch: java.lang.Throwable -> Lac
            r8.put(r0, r1)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r0 = "https_degrade_retry_used"
            boolean r1 = r9.kt()     // Catch: java.lang.Throwable -> Lac
            r8.put(r0, r1)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r0 = "chunk_count"
            int r1 = r9.kj()     // Catch: java.lang.Throwable -> Lac
            r8.put(r0, r1)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r0 = "retry_count"
            int r1 = r9.c()     // Catch: java.lang.Throwable -> Lac
            r8.put(r0, r1)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r0 = "cur_retry_time"
            int r1 = r9.fx()     // Catch: java.lang.Throwable -> Lac
            r8.put(r0, r1)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r0 = "need_retry_delay"
            boolean r1 = r9.wi()     // Catch: java.lang.Throwable -> Lac
            r8.put(r0, r1)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r0 = "backup_url_used"
            boolean r1 = r9.hh()     // Catch: java.lang.Throwable -> Lac
            r8.put(r0, r1)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r0 = "head_connection_error_msg"
            java.lang.String r1 = r9.cw()     // Catch: java.lang.Throwable -> Lac
            if (r1 == 0) goto Laf
            java.lang.String r1 = r9.cw()     // Catch: java.lang.Throwable -> Lac
            goto Lb1
        Lac:
            r9 = move-exception
            goto L1f7
        Laf:
            java.lang.String r1 = ""
        Lb1:
            r8.put(r0, r1)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r0 = "need_independent_process"
            boolean r1 = r9.xp()     // Catch: java.lang.Throwable -> Lac
            r8.put(r0, r1)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r0 = "total_retry_count"
            int r1 = r9.n()     // Catch: java.lang.Throwable -> Lac
            r8.put(r0, r1)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r0 = "cur_retry_time_in_total"
            int r1 = r9.nd()     // Catch: java.lang.Throwable -> Lac
            r8.put(r0, r1)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r0 = "real_download_time"
            long r3 = r9.lx()     // Catch: java.lang.Throwable -> Lac
            r8.put(r0, r3)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r0 = "first_speed_time"
            long r3 = r9.ch()     // Catch: java.lang.Throwable -> Lac
            r8.put(r0, r3)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r0 = "all_connect_time"
            long r3 = r9.l()     // Catch: java.lang.Throwable -> Lac
            r8.put(r0, r3)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r0 = "download_prepare_time"
            long r3 = r9.p()     // Catch: java.lang.Throwable -> Lac
            r8.put(r0, r3)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r0 = "download_time"
            long r3 = r9.lx()     // Catch: java.lang.Throwable -> Lac
            long r5 = r9.l()     // Catch: java.lang.Throwable -> Lac
            long r3 = r3 + r5
            long r5 = r9.p()     // Catch: java.lang.Throwable -> Lac
            long r3 = r3 + r5
            r8.put(r0, r3)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r0 = "chunk_downgrade_retry_used"
            boolean r1 = r9.qg()     // Catch: java.lang.Throwable -> Lac
            r8.put(r0, r1)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r0 = "need_chunk_downgrade_retry"
            boolean r1 = r9.zs()     // Catch: java.lang.Throwable -> Lac
            r8.put(r0, r1)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r0 = "failed_resume_count"
            int r1 = r9.pm()     // Catch: java.lang.Throwable -> Lac
            r8.put(r0, r1)     // Catch: java.lang.Throwable -> Lac
            int r0 = r9.qf()     // Catch: java.lang.Throwable -> Lac
            java.lang.String r1 = "preconnect_level"
            r8.put(r1, r0)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r0 = "md5"
            java.lang.String r1 = r9.rn()     // Catch: java.lang.Throwable -> Lac
            r8.put(r0, r1)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r0 = "expect_file_length"
            long r3 = r9.wq()     // Catch: java.lang.Throwable -> Lac
            r8.put(r0, r3)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r0 = "retry_schedule_count"
            int r1 = r9.b()     // Catch: java.lang.Throwable -> Lac
            r8.put(r0, r1)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r0 = "rw_concurrent"
            boolean r1 = r9.kc()     // Catch: java.lang.Throwable -> Lac
            r8.put(r0, r1)     // Catch: java.lang.Throwable -> Lac
            long r0 = r9.uq()     // Catch: java.lang.Throwable -> Lac
            double r0 = (double) r0     // Catch: java.lang.Throwable -> Lac
            r3 = 4697254411347427328(0x4130000000000000, double:1048576.0)
            double r0 = r0 / r3
            long r3 = r9.lx()     // Catch: java.lang.Throwable -> Lac
            double r3 = (double) r3
            r5 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r3 = r3 / r5
            r5 = 0
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 <= 0) goto L189
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L189
            double r0 = r0 / r3
            java.lang.String r3 = "download_speed"
            r8.put(r3, r0)     // Catch: java.lang.Throwable -> Lac java.lang.Exception -> L171
        L171:
            java.lang.String r3 = com.ss.android.downloadlib.d.c     // Catch: java.lang.Throwable -> Lac
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lac
            java.lang.String r5 = "download speed : "
            r4.<init>(r5)     // Catch: java.lang.Throwable -> Lac
            r4.append(r0)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r0 = "MB/s"
            r4.append(r0)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> Lac
            com.ss.android.socialbase.downloader.m.j.xt(r3, r0)     // Catch: java.lang.Throwable -> Lac
        L189:
            android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()     // Catch: java.lang.Throwable -> Lac java.lang.Exception -> L19f
            com.ss.android.socialbase.downloader.downloader.ae r0 = com.ss.android.socialbase.downloader.downloader.ae.xt(r0)     // Catch: java.lang.Throwable -> Lac java.lang.Exception -> L19f
            int r1 = r9.ae()     // Catch: java.lang.Throwable -> Lac java.lang.Exception -> L19f
            boolean r0 = r0.jy(r1)     // Catch: java.lang.Throwable -> Lac java.lang.Exception -> L19f
            java.lang.String r1 = "is_download_service_foreground"
            r8.put(r1, r0)     // Catch: java.lang.Throwable -> Lac java.lang.Exception -> L19f
            goto L1a3
        L19f:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)     // Catch: java.lang.Throwable -> Lac
        L1a3:
            java.util.List r0 = r9.ja()     // Catch: java.lang.Throwable -> Lac
            if (r0 == 0) goto L1bf
            java.lang.String r0 = "backup_url_count"
            java.util.List r1 = r9.ja()     // Catch: java.lang.Throwable -> Lac
            int r1 = r1.size()     // Catch: java.lang.Throwable -> Lac
            r8.put(r0, r1)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r0 = "cur_backup_url_index"
            int r1 = r9.mi()     // Catch: java.lang.Throwable -> Lac
            r8.put(r0, r1)     // Catch: java.lang.Throwable -> Lac
        L1bf:
            java.lang.String r0 = "clear_space_restart_times"
            com.ss.android.downloadlib.addownload.c$d r1 = com.ss.android.downloadlib.addownload.c.d.b()     // Catch: java.lang.Throwable -> Lac
            java.lang.String r3 = r9.oq()     // Catch: java.lang.Throwable -> Lac
            int r1 = r1.g(r3)     // Catch: java.lang.Throwable -> Lac
            r8.put(r0, r1)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r0 = "mime_type"
            java.lang.String r1 = r9.xw()     // Catch: java.lang.Throwable -> Lac
            r8.put(r0, r1)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r0 = "network_available"
            android.content.Context r1 = com.ss.android.downloadlib.addownload.m.getContext()     // Catch: java.lang.Throwable -> Lac
            boolean r1 = com.ss.android.socialbase.downloader.az.m.cw(r1)     // Catch: java.lang.Throwable -> Lac
            if (r1 == 0) goto L1e6
            goto L1e7
        L1e6:
            r2 = 2
        L1e7:
            r8.put(r0, r2)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r0 = "status_code"
            int r1 = r9.ll()     // Catch: java.lang.Throwable -> Lac
            r8.put(r0, r1)     // Catch: java.lang.Throwable -> Lac
            w(r8, r9)     // Catch: java.lang.Throwable -> Lac
            goto L1fa
        L1f7:
            com.bytedance.sdk.component.utils.vl.j(r9)
        L1fa:
            return r8
    }

    static /* synthetic */ void k(com.ss.android.downloadlib.d r0, java.util.concurrent.ConcurrentHashMap r1, int r2) {
            r0.r(r1, r2)
            return
    }

    @androidx.annotation.WorkerThread
    public static synchronized void m(com.ss.android.socialbase.downloader.ae.cw r14, com.ss.android.xt.j.xt.b r15) {
            java.lang.Class<com.ss.android.downloadlib.d> r1 = com.ss.android.downloadlib.d.class
            monitor-enter(r1)
            if (r14 != 0) goto L14
            com.ss.android.downloadlib.up.a r14 = com.ss.android.downloadlib.up.a.a()     // Catch: java.lang.Throwable -> L10
            java.lang.String r15 = "onDownloadFinish info null"
            r14.c(r15)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)
            return
        L10:
            r0 = move-exception
            r14 = r0
            goto Le6
        L14:
            if (r15 != 0) goto L21
            com.ss.android.downloadlib.up.a r14 = com.ss.android.downloadlib.up.a.a()     // Catch: java.lang.Throwable -> L10
            java.lang.String r15 = "onDownloadFinish nativeModel null"
            r14.c(r15)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)
            return
        L21:
            int r0 = r15.u0()     // Catch: java.lang.Throwable -> L10
            r2 = 1
            if (r0 == r2) goto L2a
            monitor-exit(r1)
            return
        L2a:
            com.ss.android.downloadlib.b$i r0 = com.ss.android.downloadlib.b.i.c()     // Catch: java.lang.Throwable -> L10
            r0.j(r15)     // Catch: java.lang.Throwable -> L10
            java.lang.String r10 = b(r14, r15)     // Catch: java.lang.Throwable -> L10
            com.ss.android.downloadlib.addownload.o$f r0 = com.ss.android.downloadlib.addownload.o.f.c()     // Catch: java.lang.Throwable -> L10
            java.lang.String r3 = r14.oq()     // Catch: java.lang.Throwable -> L10
            r0.w(r3, r10)     // Catch: java.lang.Throwable -> L10
            com.ss.android.downloadlib.addownload.o$f r0 = com.ss.android.downloadlib.addownload.o.f.c()     // Catch: java.lang.Throwable -> L10
            java.lang.String r3 = r14.oq()     // Catch: java.lang.Throwable -> L10
            java.util.Map r0 = r0.h(r3, r10)     // Catch: java.lang.Throwable -> L10
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L10
            r15.V(r3)     // Catch: java.lang.Throwable -> L10
            r3 = 2
            r15.G0(r3)     // Catch: java.lang.Throwable -> L10
            r15.Y0(r10)     // Catch: java.lang.Throwable -> L10
            long r3 = r15.xt()     // Catch: java.lang.Throwable -> L10
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L10
            r0.put(r3, r15)     // Catch: java.lang.Throwable -> L10
            com.ss.android.downloadlib.addownload.o$d r3 = com.ss.android.downloadlib.addownload.o.d.c()     // Catch: java.lang.Throwable -> L10
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L10
            r3.e(r0)     // Catch: java.lang.Throwable -> L10
            o(r15)     // Catch: java.lang.Throwable -> L10
            com.ss.android.downloadlib.addownload.i r0 = com.ss.android.downloadlib.addownload.i.b()     // Catch: java.lang.Throwable -> L10
            com.ss.android.j.j.cw.b r3 = r15.tj()     // Catch: java.lang.Throwable -> L10
            r0.h(r3, r14)     // Catch: java.lang.Throwable -> L10
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L10
            r15.L0(r3)     // Catch: java.lang.Throwable -> L10
            com.ss.android.downloadlib.c r0 = com.ss.android.downloadlib.c.d()     // Catch: java.lang.Throwable -> L10
            r0.k(r14, r10)     // Catch: java.lang.Throwable -> L10
            java.lang.String r0 = "application/vnd.android.package-archive"
            java.lang.String r3 = r14.xw()     // Catch: java.lang.Throwable -> L10
            boolean r0 = r0.equals(r3)     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto Le4
            com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.downloadlib.a.n.k(r15)     // Catch: java.lang.Throwable -> L10
            java.lang.String r3 = "enable_app_install_receiver"
            int r0 = r0.j(r3, r2)     // Catch: java.lang.Throwable -> L10
            if (r0 == r2) goto Lb7
            org.json.JSONObject r0 = com.ss.android.downloadlib.addownload.m.f()     // Catch: java.lang.Throwable -> L10
            java.lang.String r3 = "enable_app_install_receiver"
            int r0 = r0.optInt(r3, r2)     // Catch: java.lang.Throwable -> L10
            if (r0 == r2) goto Lb7
            com.ss.android.downloadlib.addownload.f r0 = com.ss.android.downloadlib.addownload.f.a()     // Catch: java.lang.Throwable -> L10
            r0.c(r15)     // Catch: java.lang.Throwable -> L10
        Lb7:
            com.ss.android.downloadlib.d r0 = d()     // Catch: java.lang.Throwable -> L10
            r0.x(r14, r15)     // Catch: java.lang.Throwable -> L10
            boolean r0 = r15.D()     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto Le4
            com.ss.android.downloadlib.addownload.j.b r3 = com.ss.android.downloadlib.addownload.j.b.a()     // Catch: java.lang.Throwable -> L10
            int r0 = r14.ae()     // Catch: java.lang.Throwable -> L10
            long r4 = (long) r0     // Catch: java.lang.Throwable -> L10
            long r6 = r15.xt()     // Catch: java.lang.Throwable -> L10
            long r8 = r15.vl()     // Catch: java.lang.Throwable -> L10
            java.lang.String r11 = r14.g()     // Catch: java.lang.Throwable -> L10
            java.lang.String r12 = r15.r()     // Catch: java.lang.Throwable -> L10
            java.lang.String r13 = r14.ws()     // Catch: java.lang.Throwable -> L10
            r3.c(r4, r6, r8, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L10
        Le4:
            monitor-exit(r1)
            return
        Le6:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            throw r14
    }

    private static void o(com.ss.android.xt.j.xt.b r10) {
            if (r10 != 0) goto L3
            return
        L3:
            java.lang.String r0 = r10.b0()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r1 = ""
            if (r0 == 0) goto L11
            r0 = r1
            goto L15
        L11:
            java.lang.String r0 = r10.b0()
        L15:
            android.content.Context r2 = com.ss.android.downloadlib.addownload.m.getContext()
            com.ss.android.socialbase.downloader.downloader.ae r2 = com.ss.android.socialbase.downloader.downloader.ae.xt(r2)
            int r3 = r10.mi()
            com.ss.android.socialbase.downloader.ae.cw r2 = r2.tl(r3)
            r10.M0(r1)
            com.ss.android.downloadlib.addownload.o$d r1 = com.ss.android.downloadlib.addownload.o.d.c()
            r1.d(r10)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            org.json.JSONObject r1 = g(r1, r2)
            java.lang.String r3 = "finish_reason"
            r1.putOpt(r3, r0)     // Catch: org.json.JSONException -> L4b
            java.lang.String r0 = "finish_from_reserve_wifi"
            boolean r3 = r2.e()     // Catch: org.json.JSONException -> L4b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: org.json.JSONException -> L4b
            r1.putOpt(r0, r3)     // Catch: org.json.JSONException -> L4b
            goto L4f
        L4b:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
        L4f:
            com.ss.android.downloadlib.addownload.o$f r0 = com.ss.android.downloadlib.addownload.o.f.c()
            com.ss.android.xt.j.xt.b r0 = r0.f(r2)
            int r3 = r2.ae()
            com.ss.android.downloadlib.a.i.f(r1, r3)
            java.lang.String r3 = "download_failed_times"
            int r4 = r0.T0()     // Catch: java.lang.Throwable -> L98
            r1.put(r3, r4)     // Catch: java.lang.Throwable -> L98
            java.lang.String r3 = "can_show_notification"
            boolean r4 = com.ss.android.socialbase.appdownloader.up.c.e()     // Catch: java.lang.Throwable -> L98
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L73
            r4 = 1
            goto L74
        L73:
            r4 = 2
        L74:
            r1.put(r3, r4)     // Catch: java.lang.Throwable -> L98
            long r3 = r2.wq()     // Catch: java.lang.Throwable -> L98
            r7 = 0
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 <= 0) goto L9a
            long r3 = r2.ka()     // Catch: java.lang.Throwable -> L98
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 <= 0) goto L9a
            long r3 = r2.wq()     // Catch: java.lang.Throwable -> L98
            long r7 = r2.ka()     // Catch: java.lang.Throwable -> L98
            long r3 = r3 - r7
            java.lang.String r7 = "file_length_gap"
            r1.put(r7, r3)     // Catch: java.lang.Throwable -> L98
            goto L9a
        L98:
            r0 = move-exception
            goto Lc3
        L9a:
            java.lang.String r3 = "ttmd5_status"
            int r2 = r2.a()     // Catch: java.lang.Throwable -> L98
            r1.put(r3, r2)     // Catch: java.lang.Throwable -> L98
            java.lang.String r2 = "has_send_download_failed_finally"
            java.util.concurrent.atomic.AtomicBoolean r3 = r0.O     // Catch: java.lang.Throwable -> L98
            boolean r3 = r3.get()     // Catch: java.lang.Throwable -> L98
            if (r3 == 0) goto Laf
            r3 = 1
            goto Lb0
        Laf:
            r3 = 2
        Lb0:
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L98
            java.lang.String r2 = "is_update_download"
            boolean r3 = r0.i0()     // Catch: java.lang.Throwable -> L98
            if (r3 == 0) goto Lbc
            r5 = 1
        Lbc:
            r1.put(r2, r5)     // Catch: java.lang.Throwable -> L98
            com.ss.android.downloadlib.a.i.d(r0, r1)     // Catch: java.lang.Throwable -> L98
            goto Lc6
        Lc3:
            com.bytedance.sdk.component.utils.vl.j(r0)
        Lc6:
            com.ss.android.downloadlib.r.b r0 = com.ss.android.downloadlib.r.b.a()
            java.lang.String r2 = "download_finish"
            r0.x(r2, r1, r10)
            return
    }

    @androidx.annotation.WorkerThread
    private void r(@androidx.annotation.NonNull java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.ss.android.xt.j.xt.b> r11, int r12) {
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            long r1 = java.lang.System.currentTimeMillis()
            java.util.Collection r11 = r11.values()
            java.util.Iterator r11 = r11.iterator()
        L11:
            boolean r3 = r11.hasNext()
            if (r3 == 0) goto L147
            java.lang.Object r3 = r11.next()
            com.ss.android.xt.j.xt.b r3 = (com.ss.android.xt.j.xt.b) r3
            java.util.concurrent.atomic.AtomicBoolean r4 = r3.N
            boolean r4 = r4.get()
            java.lang.String r5 = "start_event_expire_hours"
            r6 = 3600000(0x36ee80, float:5.044674E-39)
            r7 = 168(0xa8, float:2.35E-43)
            if (r4 == 0) goto L51
            long r8 = r3.Q0()
            long r8 = r1 - r8
            int r4 = r3.mi()
            com.ss.android.socialbase.downloader.jy.j r4 = com.ss.android.socialbase.downloader.jy.j.j(r4)
            int r4 = r4.j(r5, r7)
            int r4 = r4 * r6
            long r4 = (long) r4
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 < 0) goto L11
            long r3 = r3.xt()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r0.add(r3)
            goto L11
        L51:
            int r4 = r3.u0()
            r8 = 1
            if (r4 != r8) goto L83
            int r4 = r10.u(r3)
            if (r4 > 0) goto L11
            long r8 = r3.Q0()
            long r8 = r1 - r8
            int r4 = r3.mi()
            com.ss.android.socialbase.downloader.jy.j r4 = com.ss.android.socialbase.downloader.jy.j.j(r4)
            int r4 = r4.j(r5, r7)
            int r4 = r4 * r6
            long r4 = (long) r4
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 < 0) goto L11
            long r3 = r3.xt()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r0.add(r3)
            goto L11
        L83:
            int r4 = r3.u0()
            r5 = 2
            if (r4 != r5) goto L13a
            boolean r4 = r3.y0()
            if (r4 != 0) goto L11
            boolean r4 = com.ss.android.downloadlib.a.h.M(r3)
            r5 = 4
            if (r4 == 0) goto Ld1
            int r4 = r3.l()
            if (r4 != r5) goto Lae
            int r12 = r3.l()
            v2.o r4 = com.ss.android.downloadlib.addownload.m.e()
            if (r4 == 0) goto Lae
            com.ss.android.j.j.cw.b r5 = r3.tj()
            r4.j(r5)
        Lae:
            r4 = 0
            r3.f0(r4)
            java.lang.String r4 = r3.up()
            org.json.JSONObject r4 = r10.f(r3, r4, r12)
            com.ss.android.downloadlib.r.b r5 = com.ss.android.downloadlib.r.b.a()
            r5.s(r4, r3)
            long r4 = r3.xt()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r0.add(r4)
            com.ss.android.downloadlib.addownload.c.d.d(r3)
            goto L11
        Ld1:
            boolean r4 = r3.y0()
            if (r4 == 0) goto Lfb
            int r4 = r3.l()
            if (r4 != r5) goto Lfb
            if (r12 != r8) goto Lfb
            boolean r4 = com.ss.android.downloadlib.a.h.M(r3)
            if (r4 != 0) goto Lfb
            com.ss.android.downloadlib.a$o r4 = com.ss.android.downloadlib.a.o.a()
            java.lang.String r5 = com.ss.android.downloadlib.d.c
            java.lang.String r6 = "trySendAndRefreshAdEvent"
            java.lang.String r7 = "命中兜底逻辑,尝试对广播监听执行冷启兜底逻辑"
            r4.b(r5, r6, r7)
            com.ss.android.downloadlib.f r4 = com.ss.android.downloadlib.f.a()
            r4.d(r3)
            goto L11
        Lfb:
            long r4 = r3.Q0()
            long r4 = r1 - r4
            int r8 = r3.mi()
            com.ss.android.socialbase.downloader.jy.j r8 = com.ss.android.socialbase.downloader.jy.j.j(r8)
            java.lang.String r9 = "finish_event_expire_hours"
            int r7 = r8.j(r9, r7)
            int r7 = r7 * r6
            long r6 = (long) r7
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto L123
            long r3 = r3.xt()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r0.add(r3)
            goto L11
        L123:
            java.lang.String r4 = r3.up()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L11
            long r3 = r3.xt()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r0.add(r3)
            goto L11
        L13a:
            long r3 = r3.xt()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r0.add(r3)
            goto L11
        L147:
            com.ss.android.downloadlib.addownload.o$f r11 = com.ss.android.downloadlib.addownload.o.f.c()
            r11.m(r0)
            return
    }

    static /* synthetic */ java.lang.String t() {
            java.lang.String r0 = com.ss.android.downloadlib.d.c
            return r0
    }

    private int u(com.ss.android.xt.j.xt.b r11) {
            r10 = this;
            int r0 = r11.mi()
            com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.j(r0)
            java.lang.String r1 = "download_failed_finally_hours"
            r2 = 4631952216750555136(0x4048000000000000, double:48.0)
            double r0 = r0.j(r1, r2)
            r2 = 0
            r4 = -1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 > 0) goto L18
            return r4
        L18:
            long r2 = java.lang.System.currentTimeMillis()
            long r5 = r11.Q0()
            long r2 = r2 - r5
            double r2 = (double) r2
            r5 = 4633641066610819072(0x404e000000000000, double:60.0)
            double r0 = r0 * r5
            double r0 = r0 * r5
            r5 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r0 = r0 * r5
            r5 = 1
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 >= 0) goto L35
            return r5
        L35:
            java.util.concurrent.atomic.AtomicBoolean r0 = r11.O
            boolean r0 = r0.get()
            r1 = 0
            if (r0 == 0) goto L3f
            return r1
        L3f:
            android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
            com.ss.android.socialbase.downloader.downloader.ae r0 = com.ss.android.socialbase.downloader.downloader.ae.xt(r0)
            int r2 = r11.mi()
            com.ss.android.socialbase.downloader.ae.cw r0 = r0.tl(r2)
            if (r0 != 0) goto L52
            return r4
        L52:
            int r2 = r0.v()
            r3 = -3
            if (r2 == r3) goto Le1
            r3 = -4
            if (r2 != r3) goto L5e
            goto Le1
        L5e:
            boolean r3 = com.ss.android.socialbase.downloader.xt.m.xt(r2)
            if (r3 == 0) goto L65
            return r5
        L65:
            java.util.concurrent.atomic.AtomicBoolean r3 = r11.O
            boolean r3 = r3.compareAndSet(r1, r5)
            if (r3 == 0) goto Le0
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lb8
            r3.<init>()     // Catch: java.lang.Throwable -> Lb8
            g(r3, r0)     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r4 = "download_status"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> Lb8
            r3.putOpt(r4, r2)     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r2 = "fail_status"
            int r4 = r11.T()     // Catch: java.lang.Throwable -> Lb8
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> Lb8
            r3.putOpt(r2, r4)     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r2 = "fail_msg"
            java.lang.String r4 = r11.C()     // Catch: java.lang.Throwable -> Lb8
            r3.putOpt(r2, r4)     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r2 = "download_failed_times"
            int r4 = r11.T0()     // Catch: java.lang.Throwable -> Lb8
            r3.put(r2, r4)     // Catch: java.lang.Throwable -> Lb8
            long r6 = r0.ka()     // Catch: java.lang.Throwable -> Lb8
            r8 = 0
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 <= 0) goto Lba
            java.lang.String r2 = "download_percent"
            long r6 = r0.uq()     // Catch: java.lang.Throwable -> Lb8
            double r6 = (double) r6     // Catch: java.lang.Throwable -> Lb8
            long r8 = r0.ka()     // Catch: java.lang.Throwable -> Lb8
            double r8 = (double) r8     // Catch: java.lang.Throwable -> Lb8
            double r6 = r6 / r8
            r3.put(r2, r6)     // Catch: java.lang.Throwable -> Lb8
            goto Lba
        Lb8:
            r11 = move-exception
            goto Ldd
        Lba:
            java.lang.String r0 = "is_update_download"
            boolean r2 = r11.i0()     // Catch: java.lang.Throwable -> Lb8
            if (r2 == 0) goto Lc4
            r2 = 1
            goto Lc5
        Lc4:
            r2 = 2
        Lc5:
            r3.put(r0, r2)     // Catch: java.lang.Throwable -> Lb8
            com.ss.android.downloadlib.r.b r0 = com.ss.android.downloadlib.r.b.a()     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r2 = r11.oq()     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r4 = "download_failed_finally"
            r0.p(r2, r4, r3, r11)     // Catch: java.lang.Throwable -> Lb8
            com.ss.android.downloadlib.addownload.o$d r0 = com.ss.android.downloadlib.addownload.o.d.c()     // Catch: java.lang.Throwable -> Lb8
            r0.d(r11)     // Catch: java.lang.Throwable -> Lb8
            return r1
        Ldd:
            com.bytedance.sdk.component.utils.vl.j(r11)
        Le0:
            return r5
        Le1:
            return r4
    }

    private org.json.JSONObject v(@androidx.annotation.NonNull com.ss.android.socialbase.downloader.ae.cw r4, com.ss.android.socialbase.appdownloader.d r5) {
            r3 = this;
            com.ss.android.downloadlib.addownload.o$f r0 = com.ss.android.downloadlib.addownload.o.f.c()
            com.ss.android.xt.j.xt.b r0 = r0.f(r4)
            if (r0 != 0) goto Lc
            r4 = 0
            return r4
        Lc:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            r5.c(r1)
            java.lang.String r5 = "download_id"
            int r2 = r4.ae()     // Catch: java.lang.Throwable -> L27
            r1.put(r5, r2)     // Catch: java.lang.Throwable -> L27
            java.lang.String r5 = "name"
            java.lang.String r2 = r4.tl()     // Catch: java.lang.Throwable -> L27
            r1.put(r5, r2)     // Catch: java.lang.Throwable -> L27
            goto L2b
        L27:
            r5 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r5)
        L2b:
            int r4 = r4.ae()
            com.ss.android.downloadlib.a.i.f(r1, r4)
            com.ss.android.downloadlib.r.b r4 = com.ss.android.downloadlib.r.b.a()
            java.lang.String r5 = "embeded_ad"
            java.lang.String r2 = "ah_result"
            r4.p(r5, r2, r1, r0)
            return r1
    }

    public static org.json.JSONObject w(org.json.JSONObject r13, com.ss.android.socialbase.downloader.ae.cw r14) {
            if (r13 == 0) goto L48
            if (r14 != 0) goto L5
            goto L48
        L5:
            int r0 = r14.ae()
            com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.j(r0)
            java.lang.String r1 = "download_event_opt"
            r2 = 1
            int r0 = r0.j(r1, r2)
            if (r0 != 0) goto L17
            goto L44
        L17:
            r0 = 0
            long r2 = com.ss.android.downloadlib.a.h.I(r0)     // Catch: java.lang.Throwable -> L42
            java.lang.String r4 = "available_space"
            double r5 = (double) r2     // Catch: java.lang.Throwable -> L42
            r7 = 4697254411347427328(0x4130000000000000, double:1048576.0)
            double r9 = r5 / r7
            r13.put(r4, r9)     // Catch: java.lang.Throwable -> L42
            long r9 = r14.ka()     // Catch: java.lang.Throwable -> L42
            java.lang.String r14 = "apk_size"
            double r11 = (double) r9     // Catch: java.lang.Throwable -> L42
            double r7 = r11 / r7
            r13.put(r14, r7)     // Catch: java.lang.Throwable -> L42
            int r14 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r14 <= 0) goto L44
            int r14 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r14 <= 0) goto L44
            java.lang.String r14 = "available_space_ratio"
            double r5 = r5 / r11
            r13.put(r14, r5)     // Catch: java.lang.Throwable -> L42
            return r13
        L42:
            r14 = move-exception
            goto L45
        L44:
            return r13
        L45:
            com.bytedance.sdk.component.utils.vl.j(r14)
        L48:
            return r13
    }

    @Override // com.ss.android.socialbase.appdownloader.j.c
    public void a(com.ss.android.socialbase.downloader.ae.cw r4, com.ss.android.socialbase.appdownloader.d r5) {
            r3 = this;
            if (r4 == 0) goto L31
            if (r5 != 0) goto L5
            goto L31
        L5:
            int r0 = r4.ae()
            com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.j(r0)
            java.lang.String r1 = "ah_report_config"
            org.json.JSONArray r0 = r0.up(r1)
            int r1 = r5.b
            if (r1 == 0) goto L20
            java.util.concurrent.ConcurrentHashMap r1 = r4.vm()
            java.lang.String r2 = "intent"
            r1.remove(r2)
        L20:
            if (r0 == 0) goto L31
            org.json.JSONObject r5 = r3.v(r4, r5)
            if (r5 == 0) goto L31
            java.util.concurrent.ConcurrentHashMap r4 = r4.vm()
            java.lang.String r0 = "ah_ext_json"
            r4.put(r0, r5)
        L31:
            return
    }

    public void cw() {
            r2 = this;
            java.lang.String r0 = com.ss.android.downloadlib.d.c
            java.lang.String r1 = "onAppBackground()"
            com.ss.android.socialbase.downloader.m.j.xt(r0, r1)
            r0 = 6
            r2.j(r0)
            return
    }

    public void h(long r6) {
            r5 = this;
            com.ss.android.downloadlib.addownload.o$f r0 = com.ss.android.downloadlib.addownload.o.f.c()     // Catch: java.lang.Throwable -> L31
            com.ss.android.xt.j.xt.b r6 = r0.q(r6)     // Catch: java.lang.Throwable -> L31
            if (r6 == 0) goto L7c
            boolean r7 = com.ss.android.downloadlib.a.h.M(r6)     // Catch: java.lang.Throwable -> L31
            if (r7 != 0) goto L7c
            java.util.concurrent.atomic.AtomicBoolean r7 = r6.N     // Catch: java.lang.Throwable -> L31
            boolean r7 = r7.get()     // Catch: java.lang.Throwable -> L31
            if (r7 == 0) goto L19
            goto L7c
        L19:
            com.ss.android.downloadlib.addownload.o$g r7 = com.ss.android.downloadlib.addownload.o.g.c()     // Catch: java.lang.Throwable -> L31
            android.util.Pair r7 = r7.f(r6)     // Catch: java.lang.Throwable -> L31
            r0 = -1
            if (r7 == 0) goto L33
            java.lang.Object r1 = r7.first     // Catch: java.lang.Throwable -> L31
            com.ss.android.downloadlib.addownload.o$g$b r1 = (com.ss.android.downloadlib.addownload.o.g.b) r1     // Catch: java.lang.Throwable -> L31
            java.lang.Object r7 = r7.second     // Catch: java.lang.Throwable -> L31
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch: java.lang.Throwable -> L31
            int r7 = r7.intValue()     // Catch: java.lang.Throwable -> L31
            goto L3c
        L31:
            r6 = move-exception
            goto L7d
        L33:
            com.ss.android.downloadlib.addownload.o$g r7 = com.ss.android.downloadlib.addownload.o.g.c()     // Catch: java.lang.Throwable -> L31
            com.ss.android.downloadlib.addownload.o$g$b r1 = r7.b(r6)     // Catch: java.lang.Throwable -> L31
            r7 = -1
        L3c:
            if (r1 != 0) goto L3f
            goto L7c
        L3f:
            com.ss.android.downloadlib.addownload.o$g r2 = com.ss.android.downloadlib.addownload.o.g.c()     // Catch: java.lang.Throwable -> L31
            java.lang.String r3 = r1.a     // Catch: java.lang.Throwable -> L31
            r2.h(r3)     // Catch: java.lang.Throwable -> L31
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L31
            r2.<init>()     // Catch: java.lang.Throwable -> L31
            java.lang.String r3 = "installed_app_name"
            java.lang.String r4 = r1.d     // Catch: java.lang.Throwable -> L31
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L31
            java.lang.String r3 = "installed_pkg_name"
            java.lang.String r1 = r1.a     // Catch: java.lang.Throwable -> L31
            r2.put(r3, r1)     // Catch: java.lang.Throwable -> L31
            if (r7 == r0) goto L73
            java.lang.String r0 = "error_code"
            r2.put(r0, r7)     // Catch: java.lang.Throwable -> L31
            int r7 = r6.mi()     // Catch: java.lang.Throwable -> L31
            com.ss.android.downloadlib.a.i.f(r2, r7)     // Catch: java.lang.Throwable -> L31
            com.ss.android.downloadlib.r.b r7 = com.ss.android.downloadlib.r.b.a()     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = "install_finish_hijack"
            r7.x(r0, r2, r6)     // Catch: java.lang.Throwable -> L31
            return
        L73:
            com.ss.android.downloadlib.r.b r7 = com.ss.android.downloadlib.r.b.a()     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = "install_finish_may_hijack"
            r7.x(r0, r2, r6)     // Catch: java.lang.Throwable -> L31
        L7c:
            return
        L7d:
            com.ss.android.downloadlib.up.a r7 = com.ss.android.downloadlib.up.a.a()
            java.lang.String r0 = "trySendInstallFinishHijack"
            r7.j(r6, r0)
            return
    }

    public void i(long r5, int r7) {
            r4 = this;
            com.ss.android.socialbase.downloader.jy.j r7 = com.ss.android.socialbase.downloader.jy.j.j(r7)
            java.lang.String r0 = "check_install_finish_hijack_delay_time"
            r1 = 900000(0xdbba0, double:4.44659E-318)
            long r0 = r7.j(r0, r1)
            r2 = 0
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 >= 0) goto L14
            return
        L14:
            r2 = 300000(0x493e0, double:1.482197E-318)
            long r0 = java.lang.Math.max(r0, r2)
            com.ss.android.downloadlib.e r7 = com.ss.android.downloadlib.e.c()
            com.ss.android.downloadlib.d$b r2 = new com.ss.android.downloadlib.d$b
            r2.<init>(r4, r5)
            r7.e(r2, r0)
            return
    }

    public void j(int r9) {
            r8 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r8.a
            long r2 = r0 - r2
            r4 = 120000(0x1d4c0, double:5.9288E-319)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L10
            return
        L10:
            com.ss.android.downloadlib.e r2 = com.ss.android.downloadlib.e.c()
            com.ss.android.downloadlib.d$e r3 = new com.ss.android.downloadlib.d$e
            r3.<init>(r8, r9)
            long r4 = r8.a
            r6 = 0
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 <= 0) goto L24
            r4 = 2000(0x7d0, double:9.88E-321)
            goto L26
        L24:
            r4 = 8000(0x1f40, double:3.9525E-320)
        L26:
            r2.e(r3, r4)
            r8.a = r0
            return
    }

    public void j(@androidx.annotation.Nullable com.ss.android.socialbase.downloader.ae.cw r3, @androidx.annotation.Nullable java.lang.String r4) {
            r2 = this;
            if (r3 != 0) goto Lc
            com.ss.android.downloadlib.up.a r3 = com.ss.android.downloadlib.up.a.a()
            java.lang.String r4 = "info is null"
            r3.c(r4)
            return
        Lc:
            com.ss.android.socialbase.downloader.jy.j r4 = com.ss.android.socialbase.downloader.jy.j.j(r3)
            java.lang.String r0 = "check_applink_mode"
            int r4 = r4.xt(r0)
            r4 = r4 & 2
            if (r4 == 0) goto L32
            java.util.concurrent.ConcurrentHashMap r4 = r3.vm()
            java.lang.String r0 = "ah_ext_json"
            java.lang.Object r4 = r4.get(r0)
            org.json.JSONObject r4 = (org.json.JSONObject) r4
            com.ss.android.downloadlib.j$l r0 = com.ss.android.downloadlib.j.l.b()
            com.ss.android.downloadlib.d$d r1 = new com.ss.android.downloadlib.d$d
            r1.<init>(r2, r3, r4)
            r0.e(r1)
        L32:
            return
    }

    public void l(com.ss.android.socialbase.downloader.ae.cw r8, long r9, long r11, long r13, long r15, long r17, boolean r19) {
            r7 = this;
            com.ss.android.downloadlib.addownload.o$f r0 = com.ss.android.downloadlib.addownload.o.f.c()
            com.ss.android.xt.j.xt.b r0 = r0.f(r8)
            if (r0 != 0) goto L14
            com.ss.android.downloadlib.up.a r8 = com.ss.android.downloadlib.up.a.a()
            java.lang.String r9 = "trySendClearSpaceEvent nativeModel null"
            r8.c(r9)
            return
        L14:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L71
            r1.<init>()     // Catch: java.lang.Exception -> L71
            java.lang.String r2 = "space_before"
            double r3 = (double) r9     // Catch: java.lang.Exception -> L71
            r5 = 4697254411347427328(0x4130000000000000, double:1048576.0)
            double r3 = r3 / r5
            java.lang.Double r3 = java.lang.Double.valueOf(r3)     // Catch: java.lang.Exception -> L71
            r1.putOpt(r2, r3)     // Catch: java.lang.Exception -> L71
            java.lang.String r2 = "space_cleaned"
            long r9 = r11 - r9
            double r9 = (double) r9     // Catch: java.lang.Exception -> L71
            double r9 = r9 / r5
            java.lang.Double r9 = java.lang.Double.valueOf(r9)     // Catch: java.lang.Exception -> L71
            r1.putOpt(r2, r9)     // Catch: java.lang.Exception -> L71
            java.lang.String r9 = "clean_up_time_cost"
            java.lang.Long r10 = java.lang.Long.valueOf(r15)     // Catch: java.lang.Exception -> L71
            r1.putOpt(r9, r10)     // Catch: java.lang.Exception -> L71
            java.lang.String r9 = "is_download_restarted"
            java.lang.Integer r10 = java.lang.Integer.valueOf(r19)     // Catch: java.lang.Exception -> L71
            r1.putOpt(r9, r10)     // Catch: java.lang.Exception -> L71
            java.lang.String r9 = "byte_required"
            java.lang.Long r10 = java.lang.Long.valueOf(r13)     // Catch: java.lang.Exception -> L71
            r1.putOpt(r9, r10)     // Catch: java.lang.Exception -> L71
            java.lang.String r9 = "byte_required_after"
            long r11 = r13 - r11
            double r10 = (double) r11     // Catch: java.lang.Exception -> L71
            double r10 = r10 / r5
            java.lang.Double r10 = java.lang.Double.valueOf(r10)     // Catch: java.lang.Exception -> L71
            r1.putOpt(r9, r10)     // Catch: java.lang.Exception -> L71
            java.lang.String r9 = "clear_sleep_time"
            java.lang.Long r10 = java.lang.Long.valueOf(r17)     // Catch: java.lang.Exception -> L71
            r1.putOpt(r9, r10)     // Catch: java.lang.Exception -> L71
            com.ss.android.downloadlib.a.i.a(r8, r1)     // Catch: java.lang.Exception -> L71
            com.ss.android.downloadlib.r.b r8 = com.ss.android.downloadlib.r.b.a()     // Catch: java.lang.Exception -> L71
            java.lang.String r9 = "cleanup"
            r8.r(r9, r1, r0)     // Catch: java.lang.Exception -> L71
            return
        L71:
            r0 = move-exception
            r8 = r0
            com.bytedance.sdk.component.utils.vl.j(r8)
            return
    }

    void n(com.ss.android.socialbase.downloader.ae.cw r11, com.ss.android.xt.j.xt.b r12, int r13) {
            r10 = this;
            if (r11 == 0) goto L62
            if (r12 != 0) goto L5
            goto L62
        L5:
            r10.s()
            long r4 = java.lang.System.currentTimeMillis()
            r12.X0(r4)
            java.io.File r0 = android.os.Environment.getDataDirectory()
            r1 = -1
            long r0 = com.ss.android.downloadlib.a.h.i(r0, r1)
            r12.c(r0)
            r0 = 2000(0x7d0, float:2.803E-42)
            if (r13 == r0) goto L24
            r0 = 2000(0x7d0, double:9.88E-321)
        L22:
            r8 = r0
            goto L43
        L24:
            int r0 = r11.ae()
            com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.j(r0)
            java.lang.String r1 = "check_install_failed_delay_time"
            r2 = 120000(0x1d4c0, double:5.9288E-319)
            long r0 = r0.j(r1, r2)
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 >= 0) goto L3c
            goto L62
        L3c:
            r2 = 30000(0x7530, double:1.4822E-319)
            long r0 = java.lang.Math.max(r0, r2)
            goto L22
        L43:
            com.ss.android.downloadlib.d$f r0 = new com.ss.android.downloadlib.d$f
            long r1 = r12.xt()
            int r3 = r11.ae()
            r7 = 0
            r6 = r13
            r0.<init>(r1, r3, r4, r6, r7)
            com.ss.android.downloadlib.e r11 = com.ss.android.downloadlib.e.c()
            r11.e(r0, r8)
            r10.b = r0
            com.ss.android.downloadlib.addownload.o$d r11 = com.ss.android.downloadlib.addownload.o.d.c()
            r11.d(r12)
        L62:
            return
    }

    @androidx.annotation.WorkerThread
    public synchronized void p(java.lang.String r7) {
            r6 = this;
            monitor-enter(r6)
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L9
            monitor-exit(r6)
            return
        L9:
            boolean r0 = com.ss.android.downloadlib.a.h.K()     // Catch: java.lang.Throwable -> L22
            if (r0 != 0) goto Lca
            com.ss.android.downloadlib.addownload.o$f r0 = com.ss.android.downloadlib.addownload.o.f.c()     // Catch: java.lang.Throwable -> L22
            com.ss.android.xt.j.xt.b r0 = r0.g(r7)     // Catch: java.lang.Throwable -> L22
            if (r0 != 0) goto L25
            com.ss.android.downloadlib.addownload.o$g r0 = com.ss.android.downloadlib.addownload.o.g.c()     // Catch: java.lang.Throwable -> L22
            r0.d(r7)     // Catch: java.lang.Throwable -> L22
            monitor-exit(r6)
            return
        L22:
            r7 = move-exception
            goto Ld2
        L25:
            com.ss.android.downloadlib.c r1 = com.ss.android.downloadlib.c.d()     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = r0.j()     // Catch: java.lang.Throwable -> L22
            com.ss.android.downloadlib.addownload.l r1 = r1.c(r2)     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto L36
            r1.H()     // Catch: java.lang.Throwable -> L22
        L36:
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.N     // Catch: java.lang.Throwable -> L22
            boolean r1 = r1.get()     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto L40
            monitor-exit(r6)
            return
        L40:
            int r1 = r0.mi()     // Catch: java.lang.Throwable -> L22
            com.ss.android.socialbase.downloader.jy.j r1 = com.ss.android.socialbase.downloader.jy.j.j(r1)     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = "notification_opt_2"
            int r1 = r1.xt(r2)     // Catch: java.lang.Throwable -> L22
            r2 = 1
            if (r1 != r2) goto L5c
            com.ss.android.socialbase.downloader.notification.xt r1 = com.ss.android.socialbase.downloader.notification.xt.j()     // Catch: java.lang.Throwable -> L22
            int r3 = r0.mi()     // Catch: java.lang.Throwable -> L22
            r1.m(r3)     // Catch: java.lang.Throwable -> L22
        L5c:
            com.ss.android.downloadlib.j$m r1 = new com.ss.android.downloadlib.j$m     // Catch: java.lang.Throwable -> L22
            r1.<init>()     // Catch: java.lang.Throwable -> L22
            com.ss.android.socialbase.downloader.jy.j r3 = com.ss.android.downloadlib.a.n.k(r0)     // Catch: java.lang.Throwable -> L22
            java.lang.String r4 = "try_applink_delay_after_installed"
            r5 = 0
            int r3 = r3.j(r4, r5)     // Catch: java.lang.Throwable -> L22
            com.ss.android.downloadlib.d$a r4 = new com.ss.android.downloadlib.d$a     // Catch: java.lang.Throwable -> L22
            r4.<init>(r6, r0, r7)     // Catch: java.lang.Throwable -> L22
            r1.a(r0, r4, r3)     // Catch: java.lang.Throwable -> L22
            com.ss.android.downloadlib.b$i r1 = com.ss.android.downloadlib.b.i.c()     // Catch: java.lang.Throwable -> L22
            r1.i(r0)     // Catch: java.lang.Throwable -> L22
            r6.q(r7, r0)     // Catch: java.lang.Throwable -> L22
            com.ss.android.downloadlib.addownload.j.b r0 = com.ss.android.downloadlib.addownload.j.b.a()     // Catch: java.lang.Throwable -> L22
            r0.j(r7)     // Catch: java.lang.Throwable -> L22
            android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()     // Catch: java.lang.Throwable -> L22
            com.ss.android.socialbase.downloader.downloader.ae r0 = com.ss.android.socialbase.downloader.downloader.ae.xt(r0)     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = "application/vnd.android.package-archive"
            java.util.List r0 = r0.xt(r1)     // Catch: java.lang.Throwable -> L22
            com.ss.android.socialbase.downloader.ae.cw r0 = e(r0, r7)     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto Lc0
            int r1 = r0.ae()     // Catch: java.lang.Throwable -> L22
            com.ss.android.socialbase.downloader.jy.j r1 = com.ss.android.socialbase.downloader.jy.j.j(r1)     // Catch: java.lang.Throwable -> L22
            java.lang.String r3 = "no_hide_notification"
            int r1 = r1.xt(r3)     // Catch: java.lang.Throwable -> L22
            if (r1 == r2) goto Lb4
            com.ss.android.socialbase.downloader.notification.xt r1 = com.ss.android.socialbase.downloader.notification.xt.j()     // Catch: java.lang.Throwable -> L22
            int r2 = r0.ae()     // Catch: java.lang.Throwable -> L22
            r1.j(r2)     // Catch: java.lang.Throwable -> L22
        Lb4:
            com.ss.android.downloadlib.c r1 = com.ss.android.downloadlib.c.d()     // Catch: java.lang.Throwable -> L22
            r1.v(r0, r7)     // Catch: java.lang.Throwable -> L22
            com.ss.android.downloadlib.addownload.c.d.c(r0)     // Catch: java.lang.Throwable -> L22
            monitor-exit(r6)
            return
        Lc0:
            com.ss.android.downloadlib.c r0 = com.ss.android.downloadlib.c.d()     // Catch: java.lang.Throwable -> L22
            r1 = 0
            r0.v(r1, r7)     // Catch: java.lang.Throwable -> L22
            monitor-exit(r6)
            return
        Lca:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L22
            java.lang.String r0 = "handleAppInstalled in main thread."
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L22
            throw r7     // Catch: java.lang.Throwable -> L22
        Ld2:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L22
            throw r7
    }

    public void q(java.lang.String r4, com.ss.android.xt.j.xt.b r5) {
            r3 = this;
            if (r5 != 0) goto L3
            goto L42
        L3:
            boolean r0 = com.ss.android.downloadlib.a.h.M(r5)
            if (r0 != 0) goto La
            goto L42
        La:
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.N
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L42
            int r0 = r5.l()
            r1 = 4
            if (r0 != r1) goto L29
            v2.o r0 = com.ss.android.downloadlib.addownload.m.e()
            if (r0 == 0) goto L2a
            com.ss.android.j.j.cw.b r2 = r5.tj()
            r0.j(r2)
            goto L2a
        L29:
            r1 = 3
        L2a:
            org.json.JSONObject r4 = r3.f(r5, r4, r1)
            com.ss.android.downloadlib.r.b r0 = com.ss.android.downloadlib.r.b.a()
            java.lang.String r1 = r5.oq()
            java.lang.String r2 = "install_finish"
            r0.p(r1, r2, r4, r5)
            com.ss.android.downloadlib.addownload.o$d r4 = com.ss.android.downloadlib.addownload.o.d.c()
            r4.d(r5)
        L42:
            return
    }

    synchronized void s() {
            r1 = this;
            monitor-enter(r1)
            com.ss.android.downloadlib.d$f r0 = r1.b     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto Le
            com.ss.android.downloadlib.d.f.b(r0)     // Catch: java.lang.Throwable -> Lc
            r0 = 0
            r1.b = r0     // Catch: java.lang.Throwable -> Lc
            goto Le
        Lc:
            r0 = move-exception
            goto L10
        Le:
            monitor-exit(r1)
            return
        L10:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            throw r0
    }

    public void x(com.ss.android.socialbase.downloader.ae.cw r4, com.ss.android.xt.j.xt.b r5) {
            r3 = this;
            if (r4 == 0) goto L2e
            if (r5 != 0) goto L5
            goto L2e
        L5:
            int r0 = r4.ae()
            com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.j(r0)
            java.lang.String r1 = "install_finish_check_ttmd5"
            r2 = 1
            int r0 = r0.j(r1, r2)
            if (r0 != 0) goto L17
            goto L2e
        L17:
            java.lang.String r4 = r4.ws()
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L22
            goto L2e
        L22:
            com.ss.android.downloadlib.e r0 = com.ss.android.downloadlib.e.c()
            com.ss.android.downloadlib.d$c r1 = new com.ss.android.downloadlib.d$c
            r1.<init>(r3, r4, r5)
            r0.k(r1)
        L2e:
            return
    }

    public void xt() {
            r2 = this;
            java.lang.String r0 = com.ss.android.downloadlib.d.c
            java.lang.String r1 = "onAppForeground()"
            com.ss.android.socialbase.downloader.m.j.xt(r0, r1)
            r2.s()
            r0 = 5
            r2.j(r0)
            return
    }
}
