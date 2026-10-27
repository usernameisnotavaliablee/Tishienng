package com.ss.android.socialbase.appdownloader;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class b {
    private static int a;
    private static android.app.NotificationChannel b;

    static class a implements w2.i {
        final /* synthetic */ android.content.Context a;
        final /* synthetic */ int b;
        final /* synthetic */ boolean c;

        a(android.content.Context r1, int r2, boolean r3) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.<init>()
                return
        }

        public void j() {
                r3 = this;
                android.content.Context r0 = r3.a
                int r1 = r3.b
                boolean r2 = r3.c
                int r0 = com.ss.android.socialbase.appdownloader.b.a(r0, r1, r2)
                com.ss.android.socialbase.appdownloader.b.I(r0)
                return
        }
    }

    /* renamed from: com.ss.android.socialbase.appdownloader.b$b, reason: collision with other inner class name */
    static class RunnableC0228b implements java.lang.Runnable {
        final /* synthetic */ android.content.Context a;
        final /* synthetic */ int b;
        final /* synthetic */ boolean c;
        final /* synthetic */ com.ss.android.socialbase.downloader.ae.cw d;
        final /* synthetic */ java.io.File e;

        RunnableC0228b(android.content.Context r1, int r2, boolean r3, com.ss.android.socialbase.downloader.ae.cw r4, java.io.File r5) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.d = r4
                r0.e = r5
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r5 = this;
                com.ss.android.socialbase.appdownloader.f r0 = com.ss.android.socialbase.appdownloader.f.L()
                r0.Q()
                android.content.Context r0 = r5.a
                int r1 = r5.b
                boolean r2 = r5.c
                com.ss.android.socialbase.downloader.ae.cw r3 = r5.d
                java.io.File r4 = r5.e
                int r0 = com.ss.android.socialbase.appdownloader.b.i(r0, r1, r2, r3, r4)
                r1 = 1
                if (r0 != r1) goto L30
                com.ss.android.socialbase.appdownloader.f r1 = com.ss.android.socialbase.appdownloader.f.L()
                com.ss.android.socialbase.downloader.r.uf r1 = r1.R()
                if (r1 == 0) goto L30
                com.ss.android.socialbase.appdownloader.f r1 = com.ss.android.socialbase.appdownloader.f.L()
                com.ss.android.socialbase.downloader.r.uf r1 = r1.R()
                com.ss.android.socialbase.downloader.ae.cw r2 = r5.d
                r3 = 0
                r1.j(r2, r3)
            L30:
                com.ss.android.socialbase.downloader.ae.cw r1 = r5.d
                boolean r2 = r5.c
                com.ss.android.socialbase.appdownloader.b.v(r1, r2, r0)
                return
        }
    }

    static {
            return
    }

    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    public static boolean A(android.content.Context r7, com.ss.android.socialbase.downloader.ae.cw r8, android.content.pm.PackageInfo r9) {
            if (r9 == 0) goto L5d
            java.lang.String r0 = r9.packageName
            java.lang.String r1 = r8.la()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5d
            com.ss.android.socialbase.appdownloader.f r0 = com.ss.android.socialbase.appdownloader.f.L()
            w2.m r1 = r0.d()
            r0 = 1
            if (r1 == 0) goto L31
            int r2 = r8.ae()
            java.lang.String r4 = r8.la()
            java.lang.String r5 = r9.packageName
            java.lang.String r6 = ""
            r3 = 8
            r1.a(r2, r3, r4, r5, r6)
            boolean r1 = r1.j()
            if (r1 == 0) goto L31
            return r0
        L31:
            com.ss.android.socialbase.downloader.downloader.ae r7 = com.ss.android.socialbase.downloader.downloader.ae.xt(r7)
            int r1 = r8.ae()
            com.ss.android.socialbase.downloader.r.h r7 = r7.g(r1)
            if (r7 == 0) goto L5d
            java.lang.String r9 = r9.packageName
            java.lang.String r1 = ""
            r2 = 8
            r7.j(r2, r8, r9, r1)
            com.ss.android.socialbase.appdownloader.f r7 = com.ss.android.socialbase.appdownloader.f.L()
            w2.k r7 = r7.X()
            boolean r8 = r7 instanceof w2.f
            if (r8 == 0) goto L5d
            w2.f r7 = (w2.f) r7
            boolean r7 = r7.a()
            if (r7 == 0) goto L5d
            return r0
        L5d:
            r7 = 0
            return r7
    }

    public static boolean B(android.content.Context r3, com.ss.android.socialbase.downloader.ae.cw r4, android.content.pm.PackageInfo r5, boolean r6) {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = r5.packageName
            int r5 = r5.versionCode
            if (r4 == 0) goto Ld
            r4.tl(r5)
        Ld:
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1a
            int r2 = e()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1a
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r1, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1a
            goto L1b
        L1a:
            r3 = 0
        L1b:
            if (r3 != 0) goto L1e
            return r0
        L1e:
            int r3 = r3.versionCode
            r1 = 1
            if (r6 == 0) goto L27
            if (r5 >= r3) goto L26
            return r1
        L26:
            return r0
        L27:
            if (r4 == 0) goto L3d
            int r4 = r4.ae()
            com.ss.android.socialbase.downloader.jy.j r4 = com.ss.android.socialbase.downloader.jy.j.j(r4)
            java.lang.String r6 = "install_with_same_version_code"
            int r4 = r4.j(r6, r0)
            if (r4 != r1) goto L3d
            if (r5 >= r3) goto L3c
            return r1
        L3c:
            return r0
        L3d:
            if (r5 > r3) goto L40
            return r1
        L40:
            return r0
    }

    public static boolean C(android.content.Context r8, com.ss.android.socialbase.downloader.ae.cw r9, java.lang.String r10) {
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> L67
            java.lang.String r2 = r9.qv()     // Catch: java.lang.Exception -> L67
            java.lang.String r3 = r9.tl()     // Catch: java.lang.Exception -> L67
            r1.<init>(r2, r3)     // Catch: java.lang.Exception -> L67
            boolean r2 = r1.exists()     // Catch: java.lang.Exception -> L67
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L73
            java.lang.String r2 = "AppDownloadUtils"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L67
            java.lang.String r6 = "isPackageNameEqualsWithApk fileName:"
            r5.<init>(r6)     // Catch: java.lang.Exception -> L67
            java.lang.String r6 = r9.tl()     // Catch: java.lang.Exception -> L67
            r5.append(r6)     // Catch: java.lang.Exception -> L67
            java.lang.String r6 = " apkFileSize："
            r5.append(r6)     // Catch: java.lang.Exception -> L67
            long r6 = r1.length()     // Catch: java.lang.Exception -> L67
            r5.append(r6)     // Catch: java.lang.Exception -> L67
            java.lang.String r6 = " fileUrl："
            r5.append(r6)     // Catch: java.lang.Exception -> L67
            java.lang.String r6 = r9.oq()     // Catch: java.lang.Exception -> L67
            r5.append(r6)     // Catch: java.lang.Exception -> L67
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L67
            com.bytedance.sdk.component.utils.vl.r(r2, r5)     // Catch: java.lang.Exception -> L67
            android.content.pm.PackageInfo r9 = m(r9, r1)     // Catch: java.lang.Exception -> L67
            if (r9 != 0) goto L4f
            return r0
        L4f:
            java.lang.String r1 = r9.packageName     // Catch: java.lang.Exception -> L67
            boolean r1 = r1.equals(r10)     // Catch: java.lang.Exception -> L67
            if (r1 != 0) goto L58
            return r0
        L58:
            int r9 = r9.versionCode     // Catch: java.lang.Exception -> L67
            android.content.pm.PackageManager r8 = r8.getPackageManager()     // Catch: java.lang.Exception -> L67 android.content.pm.PackageManager.NameNotFoundException -> L69
            int r1 = e()     // Catch: java.lang.Exception -> L67 android.content.pm.PackageManager.NameNotFoundException -> L69
            android.content.pm.PackageInfo r4 = r8.getPackageInfo(r10, r1)     // Catch: java.lang.Exception -> L67 android.content.pm.PackageManager.NameNotFoundException -> L69
            goto L6a
        L67:
            r8 = move-exception
            goto Lc6
        L69:
        L6a:
            if (r4 != 0) goto L6d
            goto Lc9
        L6d:
            int r8 = r4.versionCode     // Catch: java.lang.Exception -> L67
            if (r9 != r8) goto Lc9
        L71:
            r0 = 1
            goto Lc9
        L73:
            int r1 = r9.ae()     // Catch: java.lang.Exception -> L67
            com.ss.android.socialbase.downloader.jy.j r1 = com.ss.android.socialbase.downloader.jy.j.j(r1)     // Catch: java.lang.Exception -> L67
            java.lang.String r2 = "install_callback_error"
            boolean r1 = r1.j(r2)     // Catch: java.lang.Exception -> L67
            if (r1 == 0) goto Lc9
            java.util.concurrent.ConcurrentHashMap r1 = r9.vm()     // Catch: java.lang.Exception -> L67
            java.lang.String r2 = "extra_apk_package_name"
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Exception -> L67
            java.lang.String r1 = com.ss.android.socialbase.downloader.az.m.j(r1, r4)     // Catch: java.lang.Exception -> L67
            java.util.concurrent.ConcurrentHashMap r9 = r9.vm()     // Catch: java.lang.Exception -> L67
            java.lang.String r2 = "extra_apk_version_code"
            java.lang.Object r9 = r9.get(r2)     // Catch: java.lang.Exception -> L67
            int r9 = com.ss.android.socialbase.downloader.az.m.j(r9, r0)     // Catch: java.lang.Exception -> L67
            if (r1 == 0) goto Lc5
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L67
            if (r2 == 0) goto La8
            goto Lc5
        La8:
            boolean r1 = r1.equals(r10)     // Catch: java.lang.Exception -> L67
            if (r1 != 0) goto Laf
            return r0
        Laf:
            android.content.pm.PackageManager r8 = r8.getPackageManager()     // Catch: java.lang.Exception -> L67 android.content.pm.PackageManager.NameNotFoundException -> Lbc
            int r1 = e()     // Catch: java.lang.Exception -> L67 android.content.pm.PackageManager.NameNotFoundException -> Lbc
            android.content.pm.PackageInfo r4 = r8.getPackageInfo(r10, r1)     // Catch: java.lang.Exception -> L67 android.content.pm.PackageManager.NameNotFoundException -> Lbc
            goto Lbd
        Lbc:
        Lbd:
            if (r4 != 0) goto Lc0
            goto Lc9
        Lc0:
            int r8 = r4.versionCode     // Catch: java.lang.Exception -> L67
            if (r9 != r8) goto Lc9
            goto L71
        Lc5:
            return r0
        Lc6:
            com.bytedance.sdk.component.utils.vl.j(r8)
        Lc9:
            return r0
    }

    public static boolean D(android.content.Context r3, com.ss.android.socialbase.downloader.ae.cw r4, boolean r5) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = r4.la()
            int r2 = r4.ov()
            if (r2 > 0) goto L16
            if (r5 != 0) goto L11
            goto L16
        L11:
            boolean r3 = c(r3, r4)
            return r3
        L16:
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            int r5 = e()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r1, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            goto L24
        L23:
            r3 = 0
        L24:
            if (r3 != 0) goto L27
            return r0
        L27:
            int r4 = r4.ae()
            com.ss.android.socialbase.downloader.jy.j r4 = com.ss.android.socialbase.downloader.jy.j.j(r4)
            java.lang.String r5 = "install_with_same_version_code"
            int r4 = r4.j(r5, r0)
            r5 = 1
            if (r4 != r5) goto L3e
            int r3 = r3.versionCode
            if (r2 >= r3) goto L3d
            return r5
        L3d:
            return r0
        L3e:
            int r3 = r3.versionCode
            if (r2 > r3) goto L43
            return r5
        L43:
            return r0
    }

    public static boolean E(com.ss.android.socialbase.downloader.ae.cw r3, java.lang.String r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.String r0 = r3.la()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r2 = 1
            if (r0 != 0) goto L1e
            java.lang.String r0 = r3.la()
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1e
            return r2
        L1e:
            java.lang.String r0 = r3.tl()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L33
            android.content.Context r0 = com.ss.android.socialbase.downloader.downloader.cw.nd()
            boolean r3 = C(r0, r3, r4)
            if (r3 == 0) goto L33
            return r2
        L33:
            return r1
    }

    public static boolean F(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L17
            r0.<init>(r2)     // Catch: org.json.JSONException -> L17
            java.lang.String r2 = "bind_app"
            boolean r2 = r0.optBoolean(r2, r1)     // Catch: org.json.JSONException -> L17
            if (r2 == 0) goto L1b
            r2 = 1
            return r2
        L17:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
        L1b:
            return r1
    }

    private static int G(android.content.Context r4, int r5, boolean r6) {
            com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.j(r5)
            java.lang.String r1 = "notification_opt_2"
            int r0 = r0.xt(r1)
            r1 = 1
            if (r0 != r1) goto L14
            com.ss.android.socialbase.downloader.notification.xt r0 = com.ss.android.socialbase.downloader.notification.xt.j()
            r0.m(r5)
        L14:
            com.ss.android.socialbase.appdownloader.g r0 = com.ss.android.socialbase.appdownloader.g.f()
            com.ss.android.socialbase.appdownloader.view.JumpUnknownSourceActivity r0 = r0.n()
            u(r0)
            com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.j(r5)
            java.lang.String r2 = "install_queue_enable"
            r3 = 0
            int r0 = r0.j(r2, r3)
            if (r0 != r1) goto L35
            com.ss.android.socialbase.appdownloader.g r0 = com.ss.android.socialbase.appdownloader.g.f()
            int r4 = r0.c(r4, r5, r6)
            return r4
        L35:
            int r4 = J(r4, r5, r6)
            return r4
    }

    private static org.json.JSONObject H(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto Lc
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lc
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lc
            return r0
        Lc:
            r1 = 0
            return r1
    }

    static /* synthetic */ int I(int r0) {
            com.ss.android.socialbase.appdownloader.b.a = r0
            return r0
    }

    public static int J(android.content.Context r7, int r8, boolean r9) {
            com.ss.android.socialbase.downloader.downloader.ae r0 = com.ss.android.socialbase.downloader.downloader.ae.xt(r7)
            com.ss.android.socialbase.downloader.ae.cw r5 = r0.tl(r8)
            if (r5 == 0) goto L3d
            java.lang.String r0 = "application/vnd.android.package-archive"
            java.lang.String r1 = r5.xw()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3d
            java.lang.String r0 = r5.qv()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L3d
            java.lang.String r0 = r5.tl()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L3d
            java.io.File r6 = new java.io.File
            java.lang.String r0 = r5.qv()
            java.lang.String r1 = r5.tl()
            r6.<init>(r0, r1)
            boolean r0 = r6.exists()
            if (r0 != 0) goto L3f
        L3d:
            r4 = r9
            goto L4c
        L3f:
            com.ss.android.socialbase.appdownloader.b$b r1 = new com.ss.android.socialbase.appdownloader.b$b
            r2 = r7
            r3 = r8
            r4 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            com.ss.android.socialbase.downloader.downloader.cw.xt(r1)
            r7 = 1
            return r7
        L4c:
            r7 = 2
            O(r5, r4, r7)
            return r7
    }

    public static int K(android.content.Context r3, com.ss.android.socialbase.downloader.ae.cw r4) {
            r0 = 0
            if (r3 == 0) goto L35
            if (r4 == 0) goto L35
            java.lang.String r1 = r4.qv()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L35
            java.lang.String r1 = r4.tl()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L1a
            goto L35
        L1a:
            int r1 = r4.ov()
            if (r1 <= 0) goto L21
            return r1
        L21:
            java.lang.String r1 = r4.qv()     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = r4.tl()     // Catch: java.lang.Throwable -> L35
            android.content.pm.PackageInfo r3 = l(r3, r4, r1, r2)     // Catch: java.lang.Throwable -> L35
            if (r3 == 0) goto L35
            int r3 = r3.versionCode     // Catch: java.lang.Throwable -> L35
            r4.tl(r3)     // Catch: java.lang.Throwable -> L35
            return r3
        L35:
            return r0
    }

    public static java.lang.String L() {
            java.lang.String r0 = com.ss.android.socialbase.downloader.az.m.up()
            return r0
    }

    public static java.lang.String M(long r7) {
            r0 = 5
            long[] r1 = new long[r0]
            r1 = {x0042: FILL_ARRAY_DATA , data: [1099511627776, 1073741824, 1048576, 1024, 1} // fill-array
            java.lang.String r2 = "KB"
            java.lang.String r3 = "B"
            java.lang.String r4 = "TB"
            java.lang.String r5 = "GB"
            java.lang.String r6 = "MB"
            java.lang.String[] r2 = new java.lang.String[]{r4, r5, r6, r2, r3}
            r3 = 1
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 >= 0) goto L2c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "0 "
            r7.<init>(r8)
            r8 = 4
            r8 = r2[r8]
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            return r7
        L2c:
            r3 = 0
        L2d:
            if (r3 >= r0) goto L3f
            r4 = r1[r3]
            int r6 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r6 < 0) goto L3c
            r0 = r2[r3]
            java.lang.String r7 = p(r7, r4, r0)
            return r7
        L3c:
            int r3 = r3 + 1
            goto L2d
        L3f:
            r7 = 0
            return r7
    }

    @android.annotation.TargetApi(26)
    public static java.lang.String N(@androidx.annotation.NonNull android.content.Context r3) {
            java.lang.String r0 = "111111"
            android.app.NotificationChannel r1 = com.ss.android.socialbase.appdownloader.b.b     // Catch: java.lang.Throwable -> L2a
            if (r1 != 0) goto L2e
            cn.jpush.android.f.g.a()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r1 = "channel_appdownloader"
            r2 = 3
            android.app.NotificationChannel r1 = cn.jiguang.av.b0.a(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
            com.ss.android.socialbase.appdownloader.b.b = r1     // Catch: java.lang.Throwable -> L2a
            r2 = 0
            cn.jpush.android.x.q.a(r1, r2, r2)     // Catch: java.lang.Throwable -> L2a
            android.app.NotificationChannel r1 = com.ss.android.socialbase.appdownloader.b.b     // Catch: java.lang.Throwable -> L2a
            r2 = 0
            com.bytedance.sdk.openadsdk.downloadnew.b.a(r1, r2)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r1 = "notification"
            java.lang.Object r3 = r3.getSystemService(r1)     // Catch: java.lang.Throwable -> L2a
            android.app.NotificationManager r3 = (android.app.NotificationManager) r3     // Catch: java.lang.Throwable -> L2a
            android.app.NotificationChannel r1 = com.ss.android.socialbase.appdownloader.b.b     // Catch: java.lang.Throwable -> L2a
            cn.jiguang.av.z.a(r3, r1)     // Catch: java.lang.Throwable -> L2a
            goto L2e
        L2a:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)
        L2e:
            return r0
    }

    private static void O(com.ss.android.socialbase.downloader.ae.cw r2, boolean r3, int r4) {
            if (r2 != 0) goto L3
            return
        L3:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "by_user"
            if (r3 == 0) goto Le
            r3 = 1
            goto Lf
        Le:
            r3 = 2
        Lf:
            r0.put(r1, r3)     // Catch: java.lang.Exception -> L21
            java.lang.String r3 = "view_result"
            r0.put(r3, r4)     // Catch: java.lang.Exception -> L21
            java.lang.String r3 = "real_package_name"
            java.lang.String r4 = r2.gq()     // Catch: java.lang.Exception -> L21
            r0.put(r3, r4)     // Catch: java.lang.Exception -> L21
            goto L25
        L21:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)
        L25:
            com.ss.android.socialbase.downloader.tl.cw r3 = com.ss.android.socialbase.downloader.downloader.cw.ol()
            int r2 = r2.ae()
            java.lang.String r4 = "install_view_result"
            r3.j(r2, r4, r0)
            return
    }

    public static boolean P(android.content.Context r1, com.ss.android.socialbase.downloader.ae.cw r2, android.content.pm.PackageInfo r3) {
            r0 = 0
            boolean r1 = B(r1, r2, r3, r0)
            return r1
    }

    public static boolean Q(java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L1f
            r0.<init>(r3)     // Catch: org.json.JSONException -> L1f
            java.lang.String r3 = "bind_app"
            boolean r3 = r0.optBoolean(r3, r1)     // Catch: org.json.JSONException -> L1f
            r2 = 1
            if (r3 != 0) goto L21
            java.lang.String r3 = "auto_install_with_notification"
            boolean r3 = r0.optBoolean(r3, r2)     // Catch: org.json.JSONException -> L1f
            if (r3 != 0) goto L25
            goto L21
        L1f:
            r3 = move-exception
            goto L22
        L21:
            return r2
        L22:
            com.bytedance.sdk.component.utils.vl.j(r3)
        L25:
            return r1
    }

    static /* synthetic */ int a(android.content.Context r0, int r1, boolean r2) {
            int r0 = G(r0, r1, r2)
            return r0
    }

    public static java.util.List<java.lang.String> b() {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 2
            r0.<init>(r1)
            java.lang.String r1 = "application/vnd.android.package-archive"
            r0.add(r1)
            java.lang.String r1 = "application/ttpatch"
            r0.add(r1)
            return r0
    }

    public static boolean c(android.content.Context r2, com.ss.android.socialbase.downloader.ae.cw r3) {
            if (r2 == 0) goto L2a
            if (r3 == 0) goto L2a
            java.lang.String r0 = r3.qv()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L2a
            java.lang.String r0 = r3.tl()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L19
            goto L2a
        L19:
            java.lang.String r0 = r3.qv()
            java.lang.String r1 = r3.tl()
            android.content.pm.PackageInfo r0 = l(r2, r3, r0, r1)
            boolean r2 = P(r2, r3, r0)
            return r2
        L2a:
            r2 = 0
            return r2
    }

    public static boolean d(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L10
            java.lang.String r0 = "application/vnd.android.package-archive"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L10
            r1 = 1
            return r1
        L10:
            r1 = 0
            return r1
    }

    public static int e() {
            com.ss.android.socialbase.appdownloader.f r0 = com.ss.android.socialbase.appdownloader.f.L()
            boolean r0 = r0.a()
            if (r0 == 0) goto Ld
            r0 = 16384(0x4000, float:2.2959E-41)
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public static int f(int r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            r1 = -2
            if (r3 != r1) goto L9
            r3 = 2
            return r3
        L9:
            r1 = 1
            if (r3 != r1) goto Le
            r3 = 4
            return r3
        Le:
            boolean r2 = com.ss.android.socialbase.downloader.xt.m.xt(r3)
            if (r2 != 0) goto L22
            r2 = 11
            if (r3 != r2) goto L19
            goto L22
        L19:
            boolean r3 = com.ss.android.socialbase.downloader.xt.m.j(r3)
            if (r3 == 0) goto L21
            r3 = 3
            return r3
        L21:
            return r0
        L22:
            return r1
    }

    public static int g(android.content.Context r0, float r1) {
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = r1 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            return r0
    }

    public static int h(android.content.Context r3, int r4, boolean r5) {
            com.ss.android.socialbase.appdownloader.f r0 = com.ss.android.socialbase.appdownloader.f.L()
            w2.j r0 = r0.O()
            if (r0 != 0) goto Lf
            int r3 = G(r3, r4, r5)
            return r3
        Lf:
            com.ss.android.socialbase.downloader.downloader.ae r1 = com.ss.android.socialbase.downloader.downloader.ae.xt(r3)
            com.ss.android.socialbase.downloader.ae.cw r1 = r1.tl(r4)
            r2 = 1
            com.ss.android.socialbase.appdownloader.b.a = r2
            com.ss.android.socialbase.appdownloader.b$a r2 = new com.ss.android.socialbase.appdownloader.b$a
            r2.<init>(r3, r4, r5)
            r0.a(r1, r2)
            int r3 = com.ss.android.socialbase.appdownloader.b.a
            return r3
    }

    public static int i(android.content.Context r5, int r6, boolean r7, com.ss.android.socialbase.downloader.ae.cw r8, java.io.File r9) {
            java.lang.String r0 = r9.getPath()
            java.io.File r1 = android.os.Environment.getDataDirectory()
            java.lang.String r1 = r1.getAbsolutePath()
            boolean r0 = r0.startsWith(r1)
            r1 = 0
            if (r0 == 0) goto L45
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L36
            java.lang.String r2 = "chmod 555 "
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L36
            java.lang.String r2 = r9.getAbsolutePath()     // Catch: java.lang.Throwable -> L36
            r0.append(r2)     // Catch: java.lang.Throwable -> L36
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L36
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L36
            java.lang.Process r0 = r2.exec(r0)     // Catch: java.lang.Throwable -> L36
            r0.waitFor()     // Catch: java.lang.Throwable -> L34
        L30:
            r0.destroy()
            goto L45
        L34:
            r2 = move-exception
            goto L38
        L36:
            r2 = move-exception
            r0 = r1
        L38:
            com.bytedance.sdk.component.utils.vl.j(r2)     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L45
            goto L30
        L3e:
            r5 = move-exception
            if (r0 == 0) goto L44
            r0.destroy()
        L44:
            throw r5
        L45:
            android.content.pm.PackageInfo r0 = m(r8, r9)     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto L53
            java.lang.String r2 = r0.packageName     // Catch: java.lang.Throwable -> L51
            r8.xt(r2)     // Catch: java.lang.Throwable -> L51
            goto L53
        L51:
            r2 = move-exception
            goto L57
        L53:
            r2 = r1
            goto L57
        L55:
            r2 = move-exception
            r0 = r1
        L57:
            com.ss.android.socialbase.appdownloader.f r3 = com.ss.android.socialbase.appdownloader.f.L()
            w2.e r3 = r3.M()
            if (r3 == 0) goto L87
            if (r0 != 0) goto L7a
            com.ss.android.socialbase.downloader.up.j r1 = new com.ss.android.socialbase.downloader.up.j
            r3 = 2001(0x7d1, float:2.804E-42)
            r1.<init>(r3, r2)
            com.ss.android.socialbase.appdownloader.f r2 = com.ss.android.socialbase.appdownloader.f.L()
            w2.e r2 = r2.M()
            int r3 = r1.j()
            r2.j(r8, r1, r3)
            goto L87
        L7a:
            com.ss.android.socialbase.appdownloader.f r2 = com.ss.android.socialbase.appdownloader.f.L()
            w2.e r2 = r2.M()
            r3 = 11
            r2.j(r8, r1, r3)
        L87:
            boolean r1 = A(r5, r8, r0)
            r2 = 2
            if (r1 == 0) goto L8f
            return r2
        L8f:
            if (r0 == 0) goto Lbb
            int r1 = r8.ae()
            com.ss.android.socialbase.downloader.jy.j r1 = com.ss.android.socialbase.downloader.jy.j.j(r1)
            java.lang.String r3 = "install_callback_error"
            boolean r1 = r1.j(r3)
            if (r1 == 0) goto Lbb
            java.util.concurrent.ConcurrentHashMap r1 = r8.vm()
            java.lang.String r3 = "extra_apk_package_name"
            java.lang.String r4 = r0.packageName
            r1.put(r3, r4)
            java.util.concurrent.ConcurrentHashMap r1 = r8.vm()
            int r3 = r0.versionCode
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "extra_apk_version_code"
            r1.put(r4, r3)
        Lbb:
            r1 = 1
            int[] r3 = new int[r1]
            boolean r4 = P(r5, r8, r0)
            if (r4 == 0) goto Lcf
            java.lang.String r6 = r0.packageName
            android.content.pm.PackageManager r9 = r5.getPackageManager()
            android.content.Intent r6 = r9.getLaunchIntentForPackage(r6)
            goto Le7
        Lcf:
            if (r7 != 0) goto Le3
            boolean r6 = y(r5, r6, r9)
            if (r6 == 0) goto Le3
            java.util.concurrent.ConcurrentHashMap r5 = r8.vm()
            java.lang.String r6 = "extra_silent_install_succeed"
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r5.put(r6, r7)
            return r1
        Le3:
            android.content.Intent r6 = k(r5, r8, r9, r7, r3)
        Le7:
            r9 = 0
            if (r6 != 0) goto Lf0
            r5 = r3[r9]
            if (r5 != r1) goto Lef
            return r2
        Lef:
            return r9
        Lf0:
            r0 = 268435456(0x10000000, float:2.524355E-29)
            r6.addFlags(r0)
            int r0 = r8.q()
            if (r0 <= 0) goto L110
            int r0 = r8.ae()
            com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.j(r0)
            java.lang.String r2 = "app_install_return_result"
            int r0 = r0.j(r2, r9)
            if (r0 != r1) goto L110
            java.lang.String r0 = "android.intent.extra.RETURN_RESULT"
            r6.putExtra(r0, r1)
        L110:
            r9 = r3[r9]
            if (r9 != 0) goto L11b
            boolean r7 = com.ss.android.socialbase.appdownloader.j.t(r5, r8, r6, r7)
            if (r7 == 0) goto L11b
            return r1
        L11b:
            int r5 = j(r5, r6)
            return r5
    }

    public static int j(android.content.Context r2, android.content.Intent r3) {
            r0 = 1
            com.ss.android.socialbase.appdownloader.f r1 = com.ss.android.socialbase.appdownloader.f.L()     // Catch: java.lang.Throwable -> L1a
            com.ss.android.socialbase.downloader.r.gq r1 = r1.g()     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L1a
            com.ss.android.socialbase.appdownloader.f r1 = com.ss.android.socialbase.appdownloader.f.L()     // Catch: java.lang.Throwable -> L1a
            com.ss.android.socialbase.downloader.r.gq r1 = r1.g()     // Catch: java.lang.Throwable -> L1a
            boolean r1 = r1.j(r3)     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L1a
            return r0
        L1a:
            r2.startActivity(r3)     // Catch: java.lang.Throwable -> L1e
            return r0
        L1e:
            r2 = 0
            return r2
    }

    private static android.content.Intent k(android.content.Context r4, com.ss.android.socialbase.downloader.ae.cw r5, @androidx.annotation.NonNull java.io.File r6, boolean r7, int[] r8) {
            com.ss.android.socialbase.downloader.downloader.ae r0 = com.ss.android.socialbase.downloader.downloader.ae.xt(r4)
            int r1 = r5.ae()
            com.ss.android.socialbase.downloader.r.tj r0 = r0.vl(r1)
            com.ss.android.socialbase.appdownloader.f r1 = com.ss.android.socialbase.appdownloader.f.L()
            java.lang.String r1 = r1.P()
            int r2 = r5.ae()
            android.net.Uri r6 = n(r2, r0, r4, r1, r6)
            r0 = 0
            if (r6 != 0) goto L20
            return r0
        L20:
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "android.intent.action.VIEW"
            r1.<init>(r2)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r2 < r3) goto L31
            r2 = 1
            r1.addFlags(r2)
        L31:
            java.lang.String r2 = "application/vnd.android.package-archive"
            r1.setDataAndType(r6, r2)
            com.ss.android.socialbase.appdownloader.f r6 = com.ss.android.socialbase.appdownloader.f.L()
            w2.m r6 = r6.d()
            r2 = 0
            if (r6 == 0) goto L4a
            int r3 = r5.ae()
            boolean r6 = r6.j(r3, r7)
            goto L4b
        L4a:
            r6 = 0
        L4b:
            com.ss.android.socialbase.downloader.downloader.ae r4 = com.ss.android.socialbase.downloader.downloader.ae.xt(r4)
            int r5 = r5.ae()
            com.ss.android.socialbase.downloader.r.h r4 = r4.g(r5)
            if (r4 == 0) goto L5d
            boolean r6 = r4.j(r7)
        L5d:
            r8[r2] = r6
            if (r6 == 0) goto L62
            return r0
        L62:
            return r1
    }

    public static android.content.pm.PackageInfo l(android.content.Context r2, com.ss.android.socialbase.downloader.ae.cw r3, java.lang.String r4, java.lang.String r5) {
            boolean r2 = android.text.TextUtils.isEmpty(r4)
            r0 = 0
            if (r2 != 0) goto L42
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 == 0) goto Le
            goto L42
        Le:
            java.io.File r2 = new java.io.File
            r2.<init>(r4, r5)
            boolean r4 = r2.exists()
            if (r4 != 0) goto L1a
            return r0
        L1a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "isApkInstalled apkFileSize：fileName:"
            r4.<init>(r5)
            java.lang.String r5 = r2.getPath()
            r4.append(r5)
            java.lang.String r5 = " apkFileSize"
            r4.append(r5)
            long r0 = r2.length()
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "AppDownloadUtils"
            com.bytedance.sdk.component.utils.vl.r(r5, r4)
            android.content.pm.PackageInfo r2 = m(r3, r2)
            return r2
        L42:
            return r0
    }

    public static android.content.pm.PackageInfo m(com.ss.android.socialbase.downloader.ae.cw r2, java.io.File r3) {
            if (r2 != 0) goto Lf
            android.content.Context r2 = com.ss.android.socialbase.downloader.downloader.cw.nd()
            int r0 = e()
            android.content.pm.PackageInfo r2 = com.ss.android.socialbase.appdownloader.m.j.f.a(r2, r3, r0)
            return r2
        Lf:
            android.content.pm.PackageInfo r0 = r2.ij()
            if (r0 != 0) goto L25
            android.content.Context r0 = com.ss.android.socialbase.downloader.downloader.cw.nd()
            int r1 = e()
            android.content.pm.PackageInfo r3 = com.ss.android.socialbase.appdownloader.m.j.f.a(r0, r3, r1)
            r2.j(r3)
            return r3
        L25:
            return r0
    }

    public static android.net.Uri n(int r1, com.ss.android.socialbase.downloader.r.tj r2, android.content.Context r3, java.lang.String r4, java.io.File r5) {
            if (r2 == 0) goto Lb
            java.lang.String r1 = r5.getAbsolutePath()     // Catch: java.lang.Throwable -> L1e
            android.net.Uri r1 = r2.j(r4, r1)     // Catch: java.lang.Throwable -> L1e
            goto L1f
        Lb:
            com.ss.android.socialbase.appdownloader.f r2 = com.ss.android.socialbase.appdownloader.f.L()
            w2.a r2 = r2.I()
            if (r2 == 0) goto L1e
            java.lang.String r0 = r5.getAbsolutePath()     // Catch: java.lang.Throwable -> L1e
            android.net.Uri r1 = r2.j(r1, r4, r0)     // Catch: java.lang.Throwable -> L1e
            goto L1f
        L1e:
            r1 = 0
        L1f:
            if (r1 != 0) goto L3c
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L32
            r0 = 24
            if (r2 < r0) goto L34
            boolean r2 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L32
            if (r2 != 0) goto L34
            android.net.Uri r1 = androidx.core.content.FileProvider.getUriForFile(r3, r4, r5)     // Catch: java.lang.Throwable -> L32
            goto L3c
        L32:
            r2 = move-exception
            goto L39
        L34:
            android.net.Uri r1 = android.net.Uri.fromFile(r5)     // Catch: java.lang.Throwable -> L32
            goto L3c
        L39:
            com.bytedance.sdk.component.utils.vl.j(r2)
        L3c:
            return r1
    }

    public static java.lang.String o(long r1) {
            r0 = 1
            java.lang.String r1 = r(r1, r0)
            return r1
    }

    private static java.lang.String p(long r3, long r5, java.lang.String r7) {
            r0 = 1
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            double r3 = (double) r3
            if (r2 <= 0) goto L9
            double r5 = (double) r5
            double r3 = r3 / r5
        L9:
            java.lang.String r5 = "MB"
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L2c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.text.DecimalFormat r6 = new java.text.DecimalFormat
            java.lang.String r0 = "#"
            r6.<init>(r0)
            java.lang.String r3 = r6.format(r3)
            r5.append(r3)
            r5.append(r7)
            java.lang.String r3 = r5.toString()
            return r3
        L2c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.text.DecimalFormat r6 = new java.text.DecimalFormat
            java.lang.String r0 = "#.##"
            r6.<init>(r0)
            java.lang.String r3 = r6.format(r3)
            r5.append(r3)
            r5.append(r7)
            java.lang.String r3 = r5.toString()
            return r3
    }

    private static java.lang.String q(long r3, long r5, java.lang.String r7, boolean r8) {
            r0 = 1
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            double r3 = (double) r3
            if (r2 <= 0) goto L9
            double r5 = (double) r5
            double r3 = r3 / r5
        L9:
            java.lang.String r5 = " "
            if (r8 != 0) goto L3c
            java.lang.String r6 = "GB"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L3c
            java.lang.String r6 = "TB"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L1e
            goto L3c
        L1e:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.text.DecimalFormat r8 = new java.text.DecimalFormat
            java.lang.String r0 = "#"
            r8.<init>(r0)
            java.lang.String r3 = r8.format(r3)
            r6.append(r3)
            r6.append(r5)
            r6.append(r7)
            java.lang.String r3 = r6.toString()
            return r3
        L3c:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.text.DecimalFormat r8 = new java.text.DecimalFormat
            java.lang.String r0 = "#.##"
            r8.<init>(r0)
            java.lang.String r3 = r8.format(r3)
            r6.append(r3)
            r6.append(r5)
            r6.append(r7)
            java.lang.String r3 = r6.toString()
            return r3
    }

    public static java.lang.String r(long r10, boolean r12) {
            r0 = 5
            long[] r1 = new long[r0]
            r1 = {x0046: FILL_ARRAY_DATA , data: [1099511627776, 1073741824, 1048576, 1024, 1} // fill-array
            java.lang.String r2 = "KB"
            java.lang.String r3 = "B"
            java.lang.String r4 = "TB"
            java.lang.String r5 = "GB"
            java.lang.String r6 = "MB"
            java.lang.String[] r2 = new java.lang.String[]{r4, r5, r6, r2, r3}
            r3 = 1
            int r5 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r5 >= 0) goto L2c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "0 "
            r10.<init>(r11)
            r11 = 4
            r11 = r2[r11]
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            return r10
        L2c:
            r3 = 0
        L2d:
            if (r3 >= r0) goto L43
            r6 = r1[r3]
            int r4 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r4 < 0) goto L3e
            r8 = r2[r3]
            r4 = r10
            r9 = r12
            java.lang.String r10 = q(r4, r6, r8, r9)
            return r10
        L3e:
            r4 = r10
            r9 = r12
            int r3 = r3 + 1
            goto L2d
        L43:
            r10 = 0
            return r10
    }

    public static java.lang.String s(java.lang.String r2, com.ss.android.socialbase.downloader.jy.j r3) {
            if (r3 == 0) goto L5e
            java.lang.String r0 = "download_dir"
            org.json.JSONObject r3 = r3.r(r0)
            if (r3 == 0) goto L5e
            java.lang.String r0 = "dir_name"
            java.lang.String r3 = r3.optString(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 1
            if (r0 != 0) goto L23
            java.lang.String r0 = "/"
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L23
            java.lang.String r3 = r3.substring(r1)
        L23:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L5d
            java.lang.String r0 = "%s"
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L41
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r2)
            java.lang.String r3 = r0.toString()
            goto L4c
        L41:
            java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L4b
            r1 = 0
            r0[r1] = r2     // Catch: java.lang.Throwable -> L4b
            java.lang.String r3 = java.lang.String.format(r3, r0)     // Catch: java.lang.Throwable -> L4b
            goto L4c
        L4b:
        L4c:
            int r2 = r3.length()
            r0 = 255(0xff, float:3.57E-43)
            if (r2 <= r0) goto L5d
            int r2 = r3.length()
            int r2 = r2 - r0
            java.lang.String r3 = r3.substring(r2)
        L5d:
            return r3
        L5e:
            java.lang.String r2 = ""
            return r2
    }

    public static java.lang.String t(java.lang.String r3, java.lang.String r4, java.lang.String r5, boolean r6) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r1 = ""
            if (r0 == 0) goto L9
            return r1
        L9:
            android.net.Uri r3 = android.net.Uri.parse(r3)
            java.lang.String r0 = "default.apk"
            java.lang.String r2 = ".."
            if (r6 == 0) goto L34
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            if (r6 == 0) goto L5a
            java.lang.String r4 = r3.getLastPathSegment()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L32
            java.lang.String r4 = r3.getLastPathSegment()
            boolean r4 = r4.contains(r2)
            if (r4 != 0) goto L32
            java.lang.String r4 = r3.getLastPathSegment()
            goto L5a
        L32:
            r4 = r0
            goto L5a
        L34:
            java.lang.String r6 = r3.getLastPathSegment()
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L4c
            java.lang.String r6 = r3.getLastPathSegment()
            boolean r6 = r6.contains(r2)
            if (r6 != 0) goto L4c
            java.lang.String r1 = r3.getLastPathSegment()
        L4c:
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 == 0) goto L59
            boolean r3 = android.text.TextUtils.isEmpty(r4)
            if (r3 != 0) goto L32
            goto L5a
        L59:
            r4 = r1
        L5a:
            boolean r3 = d(r5)
            if (r3 == 0) goto L78
            java.lang.String r3 = ".apk"
            boolean r5 = r4.endsWith(r3)
            if (r5 != 0) goto L78
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            return r3
        L78:
            return r4
    }

    public static void u(android.app.Activity r1) {
            if (r1 == 0) goto L10
            boolean r0 = r1.isFinishing()     // Catch: java.lang.Exception -> Lc
            if (r0 != 0) goto L10
            r1.finish()     // Catch: java.lang.Exception -> Lc
            return
        Lc:
            r1 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r1)
        L10:
            return
    }

    static /* synthetic */ void v(com.ss.android.socialbase.downloader.ae.cw r0, boolean r1, int r2) {
            O(r0, r1, r2)
            return
    }

    public static void w(com.ss.android.socialbase.downloader.ae.cw r3, boolean r4, boolean r5) {
            com.ss.android.socialbase.appdownloader.e r0 = new com.ss.android.socialbase.appdownloader.e
            android.content.Context r1 = com.ss.android.socialbase.downloader.downloader.cw.nd()
            java.lang.String r2 = r3.oq()
            r0.<init>(r1, r2)
            java.lang.String r1 = r3.g()
            com.ss.android.socialbase.appdownloader.e r0 = r0.I(r1)
            java.lang.String r1 = r3.tl()
            com.ss.android.socialbase.appdownloader.e r0 = r0.O0(r1)
            java.lang.String r1 = r3.qv()
            com.ss.android.socialbase.appdownloader.e r0 = r0.m(r1)
            boolean r1 = r3.yl()
            com.ss.android.socialbase.appdownloader.e r0 = r0.L(r1)
            boolean r1 = r3.qe()
            com.ss.android.socialbase.appdownloader.e r0 = r0.Q0(r1)
            boolean r1 = r3.x()
            r2 = 1
            if (r1 != 0) goto L41
            if (r5 == 0) goto L3f
            goto L41
        L3f:
            r5 = 0
            goto L42
        L41:
            r5 = 1
        L42:
            com.ss.android.socialbase.appdownloader.e r5 = r0.n(r5)
            java.lang.String r0 = r3.h()
            com.ss.android.socialbase.appdownloader.e r5 = r5.B0(r0)
            java.lang.String r0 = r3.xw()
            com.ss.android.socialbase.appdownloader.e r5 = r5.W(r0)
            java.util.List r0 = r3.uf()
            com.ss.android.socialbase.appdownloader.e r5 = r5.J(r0)
            com.ss.android.socialbase.appdownloader.e r5 = r5.C0(r2)
            int r0 = r3.c()
            com.ss.android.socialbase.appdownloader.e r5 = r5.N0(r0)
            int r0 = r3.gx()
            com.ss.android.socialbase.appdownloader.e r5 = r5.l(r0)
            java.util.List r0 = r3.ja()
            com.ss.android.socialbase.appdownloader.e r5 = r5.P0(r0)
            int r0 = r3.by()
            com.ss.android.socialbase.appdownloader.e r5 = r5.m0(r0)
            int r0 = r3.fs()
            com.ss.android.socialbase.appdownloader.e r5 = r5.A0(r0)
            com.ss.android.socialbase.appdownloader.e r4 = r5.X(r4)
            boolean r5 = r3.d()
            com.ss.android.socialbase.appdownloader.e r4 = r4.o0(r5)
            java.lang.String r5 = r3.la()
            com.ss.android.socialbase.appdownloader.e r4 = r4.b(r5)
            java.lang.String r5 = r3.rn()
            com.ss.android.socialbase.appdownloader.e r4 = r4.w0(r5)
            long r0 = r3.wq()
            com.ss.android.socialbase.appdownloader.e r4 = r4.C(r0)
            boolean r5 = r3.az()
            com.ss.android.socialbase.appdownloader.e r4 = r4.u(r5)
            boolean r5 = r3.ln()
            com.ss.android.socialbase.appdownloader.e r4 = r4.e0(r5)
            boolean r5 = r3.xp()
            com.ss.android.socialbase.appdownloader.e r4 = r4.F0(r5)
            com.ss.android.socialbase.downloader.xt.ae r5 = r3.w()
            com.ss.android.socialbase.appdownloader.e r4 = r4.H(r5)
            boolean r5 = r3.ri()
            com.ss.android.socialbase.appdownloader.e r4 = r4.J0(r5)
            boolean r5 = r3.y()
            com.ss.android.socialbase.appdownloader.e r4 = r4.O(r5)
            boolean r5 = r3.wi()
            com.ss.android.socialbase.appdownloader.e r4 = r4.c(r5)
            java.lang.String r5 = r3.tk()
            com.ss.android.socialbase.appdownloader.e r4 = r4.t(r5)
            java.lang.String r5 = r3.hl()
            org.json.JSONObject r5 = H(r5)
            com.ss.android.socialbase.appdownloader.e r4 = r4.K(r5)
            java.lang.String r5 = r3.et()
            com.ss.android.socialbase.appdownloader.e r4 = r4.j0(r5)
            int r5 = r3.mp()
            com.ss.android.socialbase.appdownloader.e r4 = r4.V(r5)
            boolean r3 = r3.px()
            com.ss.android.socialbase.appdownloader.e r3 = r4.e(r3)
            com.ss.android.socialbase.appdownloader.f r4 = com.ss.android.socialbase.appdownloader.f.L()
            r4.h(r3)
            return
    }

    public static boolean x(android.content.Context r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = com.ss.android.socialbase.appdownloader.i.w()     // Catch: java.lang.Throwable -> L35
            android.content.res.Resources r2 = r4.getResources()     // Catch: java.lang.Throwable -> L35
            int r1 = r2.getColor(r1)     // Catch: java.lang.Throwable -> L35
            int r2 = com.ss.android.socialbase.appdownloader.i.d()     // Catch: java.lang.Throwable -> L35
            int r3 = com.ss.android.socialbase.appdownloader.i.o()     // Catch: java.lang.Throwable -> L35
            int[] r2 = new int[]{r2, r3}     // Catch: java.lang.Throwable -> L35
            int r3 = com.ss.android.socialbase.appdownloader.i.r()     // Catch: java.lang.Throwable -> L35
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r3, r2)     // Catch: java.lang.Throwable -> L35
            int r2 = r4.getColor(r0, r0)     // Catch: java.lang.Throwable -> L33
            if (r1 != r2) goto L2f
            r4.recycle()     // Catch: java.lang.Throwable -> L2d
        L2d:
            r4 = 1
            return r4
        L2f:
            r4.recycle()     // Catch: java.lang.Throwable -> L39
            goto L39
        L33:
            goto L36
        L35:
            r4 = 0
        L36:
            if (r4 == 0) goto L39
            goto L2f
        L39:
            return r0
    }

    public static boolean y(android.content.Context r6, int r7, java.io.File r8) {
            com.ss.android.socialbase.downloader.jy.j r7 = com.ss.android.socialbase.downloader.jy.j.j(r7)
            java.lang.String r0 = "back_miui_silent_install"
            r1 = 1
            int r7 = r7.j(r0, r1)
            r0 = 0
            if (r7 != r1) goto Lf
            return r0
        Lf:
            boolean r7 = com.ss.android.socialbase.appdownloader.m.e.j()
            if (r7 != 0) goto L1c
            boolean r7 = com.ss.android.socialbase.appdownloader.m.e.u()
            if (r7 != 0) goto L1c
            return r0
        L1c:
            java.lang.String r7 = "com.miui.securitycore"
            java.lang.String r2 = "com.miui.enterprise.service.EntInstallService"
            boolean r3 = com.ss.android.socialbase.downloader.az.oq.j(r6, r7, r2)
            if (r3 == 0) goto L5d
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            android.content.ComponentName r4 = new android.content.ComponentName
            r4.<init>(r7, r2)
            r3.setComponent(r4)
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r4 = "userId"
            r2.putInt(r4, r0)
            java.lang.String r4 = "flag"
            r5 = 256(0x100, float:3.59E-43)
            r2.putInt(r4, r5)
            java.lang.String r4 = "apkPath"
            java.lang.String r8 = r8.getPath()
            r2.putString(r4, r8)
            java.lang.String r8 = "installerPkg"
            r2.putString(r8, r7)
            r3.putExtras(r2)
            r6.startService(r3)     // Catch: java.lang.Exception -> L59
            return r1
        L59:
            r6 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r6)
        L5d:
            return r0
    }

    public static boolean z(android.content.Context r1, com.ss.android.socialbase.downloader.ae.cw r2) {
            r0 = 1
            boolean r1 = D(r1, r2, r0)
            return r1
    }
}
