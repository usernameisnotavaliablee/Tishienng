package com.ss.android.downloadlib;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
class a implements r2.a {

    /* renamed from: com.ss.android.downloadlib.a$a, reason: collision with other inner class name */
    class C0188a implements com.ss.android.socialbase.downloader.j.j.cw {
        final /* synthetic */ v2.y a;
        final /* synthetic */ com.ss.android.downloadlib.a b;

        C0188a(com.ss.android.downloadlib.a r1, v2.y r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }
    }

    class b implements com.ss.android.socialbase.downloader.r.wq {
        final /* synthetic */ com.ss.android.downloadlib.a a;

        b(com.ss.android.downloadlib.a r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        private boolean a(com.ss.android.socialbase.downloader.ae.cw r4) {
                r3 = this;
                v2.x r0 = com.ss.android.downloadlib.addownload.m.y()
                if (r0 == 0) goto L39
                com.ss.android.downloadlib.addownload.o$f r1 = com.ss.android.downloadlib.addownload.o.f.c()
                com.ss.android.xt.j.xt.b r1 = r1.f(r4)
                if (r1 == 0) goto L26
                boolean r1 = r1.cw()
                if (r1 == 0) goto L26
                int r4 = r4.ae()
                com.ss.android.socialbase.downloader.jy.j r4 = com.ss.android.socialbase.downloader.jy.j.j(r4)
                java.lang.String r1 = "ad_notification_jump_url"
                r2 = 0
                java.lang.String r4 = r4.j(r1, r2)
                goto L2a
            L26:
                java.lang.String r4 = com.ss.android.downloadlib.addownload.d.e(r4)
            L2a:
                boolean r1 = android.text.TextUtils.isEmpty(r4)
                if (r1 != 0) goto L39
                android.content.Context r1 = com.ss.android.downloadlib.addownload.m.getContext()
                boolean r4 = r0.j(r1, r4)
                return r4
            L39:
                r4 = 0
                return r4
        }

        public boolean cw(com.ss.android.socialbase.downloader.ae.cw r3) {
                r2 = this;
                if (r3 != 0) goto L4
                r3 = 0
                return r3
            L4:
                com.ss.android.downloadlib.addownload.o$f r0 = com.ss.android.downloadlib.addownload.o.f.c()
                com.ss.android.xt.j.xt.b r0 = r0.f(r3)
                if (r0 == 0) goto L12
                com.ss.android.downloadlib.j.g.b(r0)
                goto L1d
            L12:
                android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
                java.lang.String r1 = r3.la()
                com.ss.android.downloadlib.a.f.i(r0, r1)
            L1d:
                com.ss.android.socialbase.downloader.notification.xt r0 = com.ss.android.socialbase.downloader.notification.xt.j()
                int r3 = r3.ae()
                r0.m(r3)
                r3 = 1
                return r3
        }

        public boolean j(com.ss.android.socialbase.downloader.ae.cw r5) {
                r4 = this;
                int r0 = r5.ae()
                com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.j(r0)
                java.lang.String r1 = "notification_opt_2"
                int r1 = r0.xt(r1)
                r2 = 1
                if (r1 != r2) goto L38
                int r0 = r5.i()
                r1 = -2
                if (r0 != r1) goto L37
                com.ss.android.socialbase.appdownloader.f r0 = com.ss.android.socialbase.appdownloader.f.L()
                w2.m r0 = r0.d()
                android.content.Context r1 = com.ss.android.downloadlib.addownload.m.getContext()
                com.ss.android.socialbase.downloader.downloader.ae r1 = com.ss.android.socialbase.downloader.downloader.ae.xt(r1)
                int r3 = r5.ae()
                com.ss.android.socialbase.downloader.r.h r1 = r1.g(r3)
                android.content.Context r3 = com.ss.android.downloadlib.addownload.m.getContext()
                com.ss.android.socialbase.appdownloader.DownloadHandlerService.d(r3, r5, r0, r1)
            L37:
                return r2
            L38:
                boolean r5 = r4.a(r5)
                java.lang.String r1 = "disable_delete_dialog"
                r3 = 0
                int r0 = r0.j(r1, r3)
                if (r0 != r2) goto L46
                return r2
            L46:
                return r5
        }

        public boolean xt(com.ss.android.socialbase.downloader.ae.cw r1) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    class c implements java.lang.Runnable {
        final /* synthetic */ com.ss.android.downloadlib.a a;

        c(com.ss.android.downloadlib.a r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                java.lang.String r0 = ""
                com.ss.android.socialbase.appdownloader.m.e.i(r0)
                boolean r0 = com.ss.android.socialbase.appdownloader.m.e.c()
                r1 = 1
                if (r0 == 0) goto Lf
                com.ss.android.socialbase.downloader.downloader.cw.j(r1)
            Lf:
                com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.cw()
                java.lang.String r2 = "disable_security_init"
                int r0 = r0.j(r2, r1)
                if (r0 != r1) goto L22
                android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
                com.ss.android.socialbase.appdownloader.m.c.d(r0)
            L22:
                return
        }
    }

    public class d {
        public d() {
                r1 = this;
                r1.<init>()
                return
        }

        public static long a(java.io.File r3) {
                if (r3 == 0) goto L13
                boolean r0 = r3.exists()
                if (r0 != 0) goto L9
                goto L13
            L9:
                long r0 = r3.lastModified()
                r2 = 0
                long r0 = b(r3, r0, r2)
                return r0
            L13:
                r0 = 0
                return r0
        }

        private static long b(java.io.File r4, long r5, int r7) {
                if (r4 == 0) goto L35
                boolean r0 = r4.exists()
                if (r0 != 0) goto L9
                goto L35
            L9:
                long r0 = r4.lastModified()
                long r5 = java.lang.Math.max(r5, r0)
                int r7 = r7 + 1
                r0 = 50
                if (r7 < r0) goto L18
                goto L35
            L18:
                boolean r0 = r4.isDirectory()
                if (r0 == 0) goto L35
                java.io.File[] r4 = r4.listFiles()
                if (r4 == 0) goto L35
                int r0 = r4.length
                r1 = 0
            L26:
                if (r1 >= r0) goto L35
                r2 = r4[r1]
                long r2 = b(r2, r5, r7)
                long r5 = java.lang.Math.max(r5, r2)
                int r1 = r1 + 1
                goto L26
            L35:
                return r5
        }
    }

    public class e<P, R> implements java.lang.Runnable {
        private P a;
        private R b;
        private int c;
        private java.lang.ref.SoftReference<com.ss.android.downloadlib.a.e.InterfaceC0189a<P, R>> d;
        private com.ss.android.downloadlib.a.e<?, P> e;
        private com.ss.android.downloadlib.a.e<R, ?> f;

        /* renamed from: com.ss.android.downloadlib.a$e$a, reason: collision with other inner class name */
        public interface InterfaceC0189a<PARAM, RESULT> {
            RESULT j(PARAM r1);
        }

        private e(int r1, com.ss.android.downloadlib.a.e.InterfaceC0189a<P, R> r2, P r3) {
                r0 = this;
                r0.<init>()
                r0.c = r1
                java.lang.ref.SoftReference r1 = new java.lang.ref.SoftReference
                r1.<init>(r2)
                r0.d = r1
                r0.a = r3
                return
        }

        public static <P, R> com.ss.android.downloadlib.a.e<P, R> c(com.ss.android.downloadlib.a.e.InterfaceC0189a<P, R> r2, P r3) {
                com.ss.android.downloadlib.a$e r0 = new com.ss.android.downloadlib.a$e
                r1 = 2
                r0.<init>(r1, r2, r3)
                return r0
        }

        private R e() {
                r1 = this;
                R r0 = r1.b
                return r0
        }

        public <NR> com.ss.android.downloadlib.a.e<R, NR> a(int r3, com.ss.android.downloadlib.a.e.InterfaceC0189a<R, NR> r4) {
                r2 = this;
                com.ss.android.downloadlib.a$e r0 = new com.ss.android.downloadlib.a$e
                r1 = 0
                r0.<init>(r3, r4, r1)
                r2.f = r0
                r0.e = r2
                return r0
        }

        public <NR> com.ss.android.downloadlib.a.e<R, NR> b(com.ss.android.downloadlib.a.e.InterfaceC0189a<R, NR> r2) {
                r1 = this;
                r0 = 0
                com.ss.android.downloadlib.a$e r2 = r1.a(r0, r2)
                return r2
        }

        public void d() {
                r1 = this;
                com.ss.android.downloadlib.a$e<?, P> r0 = r1.e
                if (r0 == 0) goto L8
                r0.d()
                return
            L8:
                r1.run()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                int r0 = r2.c
                if (r0 != 0) goto L16
                boolean r0 = com.ss.android.downloadlib.a.h.K()
                if (r0 != 0) goto L16
                com.ss.android.downloadlib.c r0 = com.ss.android.downloadlib.c.d()
                android.os.Handler r0 = r0.s()
                r0.post(r2)
                return
            L16:
                int r0 = r2.c
                r1 = 1
                if (r0 != r1) goto L29
                boolean r0 = com.ss.android.downloadlib.a.h.K()
                if (r0 == 0) goto L29
                com.ss.android.downloadlib.e r0 = com.ss.android.downloadlib.e.c()
                r0.d(r2)
                return
            L29:
                int r0 = r2.c
                r1 = 2
                if (r0 != r1) goto L3c
                boolean r0 = com.ss.android.downloadlib.a.h.K()
                if (r0 == 0) goto L3c
                com.ss.android.downloadlib.e r0 = com.ss.android.downloadlib.e.c()
                r0.k(r2)
                return
            L3c:
                P r0 = r2.a
                if (r0 != 0) goto L4a
                com.ss.android.downloadlib.a$e<?, P> r0 = r2.e
                if (r0 == 0) goto L4a
                java.lang.Object r0 = r0.e()
                r2.a = r0
            L4a:
                java.lang.ref.SoftReference<com.ss.android.downloadlib.a$e$a<P, R>> r0 = r2.d
                java.lang.Object r0 = r0.get()
                com.ss.android.downloadlib.a$e$a r0 = (com.ss.android.downloadlib.a.e.InterfaceC0189a) r0
                if (r0 != 0) goto L55
                goto L64
            L55:
                P r1 = r2.a
                java.lang.Object r0 = r0.j(r1)
                r2.b = r0
                com.ss.android.downloadlib.a$e<R, ?> r0 = r2.f
                if (r0 == 0) goto L64
                r0.run()
            L64:
                return
        }
    }

    public class f {
        public f() {
                r1 = this;
                r1.<init>()
                return
        }

        public static boolean a(android.content.Context r0, java.lang.String r1) {
                boolean r0 = com.ss.android.downloadlib.a.m.e(r0, r1)
                return r0
        }

        public static com.ss.android.downloadlib.addownload.o.b b(android.content.Context r0, android.net.Uri r1) {
                com.ss.android.downloadlib.addownload.o$b r0 = com.ss.android.downloadlib.a.m.i(r0, r1)
                return r0
        }

        public static com.ss.android.downloadlib.addownload.o.b c(android.content.Context r0, com.ss.android.downloadlib.addownload.o.i r1, java.lang.String r2) {
                com.ss.android.downloadlib.addownload.o$b r0 = com.ss.android.downloadlib.a.m.k(r0, r1, r2)
                return r0
        }

        public static com.ss.android.downloadlib.addownload.o.b d(android.content.Context r0, java.lang.String r1) {
                com.ss.android.downloadlib.addownload.o$b r0 = com.ss.android.downloadlib.a.m.l(r0, r1)
                return r0
        }

        public static com.ss.android.downloadlib.addownload.o.b e(android.content.Context r0, java.lang.String r1, com.ss.android.xt.j.xt.a r2) {
                com.ss.android.downloadlib.addownload.o$b r0 = com.ss.android.downloadlib.a.m.m(r0, r1, r2)
                return r0
        }

        public static com.ss.android.downloadlib.addownload.o.b f(@androidx.annotation.NonNull com.ss.android.xt.j.xt.b r0, java.lang.String r1, java.lang.String r2) {
                com.ss.android.downloadlib.addownload.o$b r0 = com.ss.android.downloadlib.a.m.o(r0, r1, r2)
                return r0
        }

        public static com.ss.android.downloadlib.addownload.o.b g(java.lang.String r1) {
                android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
                com.ss.android.downloadlib.addownload.o$b r1 = i(r0, r1)
                return r1
        }

        public static com.ss.android.downloadlib.addownload.o.b h(java.lang.String r0, @androidx.annotation.NonNull com.ss.android.xt.j.xt.a r1) {
                com.ss.android.downloadlib.addownload.o$b r0 = com.ss.android.downloadlib.a.m.K(r0, r1)
                return r0
        }

        public static com.ss.android.downloadlib.addownload.o.b i(android.content.Context r0, java.lang.String r1) {
                com.ss.android.downloadlib.addownload.o$b r0 = com.ss.android.downloadlib.a.m.J(r0, r1)
                return r0
        }
    }

    public class g {

        /* renamed from: com.ss.android.downloadlib.a$g$a, reason: collision with other inner class name */
        static class RunnableC0190a implements java.lang.Runnable {
            RunnableC0190a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r0 = this;
                    com.ss.android.socialbase.appdownloader.m.e.q()
                    com.ss.android.downloadlib.a.g.g()
                    return
            }
        }

        private static class b implements java.lang.reflect.InvocationHandler {
            private java.lang.Object a;

            private b(java.lang.Object r1) {
                    r0 = this;
                    r0.<init>()
                    r0.a = r1
                    return
            }

            /* synthetic */ b(java.lang.Object r1, com.ss.android.downloadlib.a.g.RunnableC0190a r2) {
                    r0 = this;
                    r0.<init>(r1)
                    return
            }

            @Override // java.lang.reflect.InvocationHandler
            public java.lang.Object invoke(java.lang.Object r2, java.lang.reflect.Method r3, java.lang.Object[] r4) throws java.lang.Throwable {
                    r1 = this;
                    java.lang.String r2 = "startActivity"
                    java.lang.String r0 = r3.getName()     // Catch: java.lang.Throwable -> Lf
                    boolean r2 = r2.contains(r0)     // Catch: java.lang.Throwable -> Lf
                    if (r2 == 0) goto Lf
                    com.ss.android.downloadlib.a.g.e(r4)     // Catch: java.lang.Throwable -> Lf
                Lf:
                    java.lang.Object r2 = r1.a
                    java.lang.Object r2 = r3.invoke(r2, r4)
                    return r2
            }
        }

        public g() {
                r1 = this;
                r1.<init>()
                return
        }

        private static void a() {
                int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L5d
                r1 = 26
                if (r0 >= r1) goto L13
                java.lang.String r0 = "android.app.ActivityManagerNative"
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L5d
                java.lang.String r1 = "gDefault"
                java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Throwable -> L5d
                goto L1f
            L13:
                java.lang.String r0 = "android.app.ActivityManager"
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L5d
                java.lang.String r1 = "IActivityManagerSingleton"
                java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Throwable -> L5d
            L1f:
                r1 = 1
                r0.setAccessible(r1)     // Catch: java.lang.Throwable -> L5d
                r2 = 0
                java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L5d
                java.lang.String r3 = "android.util.Singleton"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L5d
                java.lang.String r4 = "mInstance"
                java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch: java.lang.Throwable -> L5d
                r3.setAccessible(r1)     // Catch: java.lang.Throwable -> L5d
                java.lang.Object r4 = r3.get(r0)     // Catch: java.lang.Throwable -> L5d
                if (r4 != 0) goto L3e
                goto L5d
            L3e:
                java.lang.String r5 = "android.app.IActivityManager"
                java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Throwable -> L5d
                com.ss.android.downloadlib.a$g$b r6 = new com.ss.android.downloadlib.a$g$b     // Catch: java.lang.Throwable -> L5d
                r6.<init>(r4, r2)     // Catch: java.lang.Throwable -> L5d
                java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L5d
                java.lang.ClassLoader r2 = r2.getContextClassLoader()     // Catch: java.lang.Throwable -> L5d
                java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L5d
                r4 = 0
                r1[r4] = r5     // Catch: java.lang.Throwable -> L5d
                java.lang.Object r1 = java.lang.reflect.Proxy.newProxyInstance(r2, r1, r6)     // Catch: java.lang.Throwable -> L5d
                r3.set(r0, r1)     // Catch: java.lang.Throwable -> L5d
            L5d:
                return
        }

        public static int b(java.lang.String r1, java.lang.String r2) {
                boolean r0 = android.text.TextUtils.isEmpty(r2)
                if (r0 == 0) goto L8
                r1 = 5
                return r1
            L8:
                java.io.File r0 = new java.io.File
                r0.<init>(r2)
                int r1 = com.ss.android.cw.a.a(r1, r0)
                return r1
        }

        public static java.lang.String c(java.lang.String r1) {
                boolean r0 = android.text.TextUtils.isEmpty(r1)
                if (r0 == 0) goto L8
                r1 = 0
                return r1
            L8:
                java.io.File r0 = new java.io.File
                r0.<init>(r1)
                java.lang.String r1 = com.ss.android.cw.a.g(r0)
                return r1
        }

        public static void d() {
                org.json.JSONObject r0 = com.ss.android.downloadlib.addownload.m.f()
                java.lang.String r1 = "hook"
                r2 = 0
                int r0 = r0.optInt(r1, r2)
                r1 = 1
                if (r0 == r1) goto Lf
                return
            Lf:
                com.ss.android.downloadlib.e r0 = com.ss.android.downloadlib.e.c()
                com.ss.android.downloadlib.a$g$a r1 = new com.ss.android.downloadlib.a$g$a
                r1.<init>()
                r2 = 10000(0x2710, double:4.9407E-320)
                r0.e(r1, r2)
                return
        }

        public static void e(java.lang.Object[] r8) {
                org.json.JSONObject r0 = com.ss.android.downloadlib.addownload.m.f()
                java.lang.String r1 = "hook"
                r2 = 0
                int r0 = r0.optInt(r1, r2)
                r1 = 1
                if (r0 == r1) goto L10
                goto L11e
            L10:
                r0 = r8[r1]
                boolean r0 = r0 instanceof java.lang.String
                if (r0 == 0) goto L11e
                r0 = 2
                r0 = r8[r0]
                boolean r3 = r0 instanceof android.content.Intent
                if (r3 == 0) goto L11e
                android.content.Intent r0 = (android.content.Intent) r0
                java.lang.String r3 = "android.intent.action.VIEW"
                java.lang.String r4 = r0.getAction()
                boolean r3 = r3.equals(r4)
                if (r3 == 0) goto L11e
                java.lang.String r3 = com.ss.android.socialbase.downloader.xt.up.j
                java.lang.String r4 = r0.getType()
                boolean r3 = r3.equals(r4)
                if (r3 == 0) goto L11e
                boolean r3 = com.ss.android.socialbase.appdownloader.m.e.p()
                java.lang.String r4 = "null"
                if (r3 == 0) goto L54
                org.json.JSONObject r0 = com.ss.android.downloadlib.addownload.m.f()
                java.lang.String r2 = "hook_vivo_arg"
                java.lang.String r3 = "com.android.settings"
                java.lang.String r0 = r0.optString(r2, r3)
                boolean r2 = r4.equals(r0)
                if (r2 != 0) goto L11e
                r8[r1] = r0
                return
            L54:
                boolean r3 = com.ss.android.socialbase.appdownloader.m.e.r()
                if (r3 == 0) goto Lf5
                org.json.JSONObject r3 = com.ss.android.downloadlib.addownload.m.f()
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                java.lang.String r6 = "com."
                r5.<init>(r6)
                java.lang.String r6 = com.ss.android.socialbase.downloader.xt.up.cw
                r5.append(r6)
                java.lang.String r6 = ".market"
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                java.lang.String r6 = "hook_kllk_arg1"
                java.lang.String r3 = r3.optString(r6, r5)
                boolean r4 = r4.equals(r3)
                if (r4 != 0) goto L81
                r8[r1] = r3
            L81:
                org.json.JSONObject r8 = com.ss.android.downloadlib.addownload.m.f()
                java.lang.String r3 = "hook_kllk_arg2"
                java.lang.String r4 = "com.android.browser"
                java.lang.String r8 = r8.optString(r3, r4)
                org.json.JSONObject r3 = com.ss.android.downloadlib.addownload.m.f()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r5 = "m.store."
                r4.<init>(r5)
                java.lang.String r5 = com.ss.android.socialbase.downloader.xt.up.cw
                r4.append(r5)
                java.lang.String r5 = "mobile.com"
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                java.lang.String r5 = "hook_kllk_arg3"
                java.lang.String r3 = r3.optString(r5, r4)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = com.ss.android.socialbase.downloader.xt.up.cw
                r4.append(r5)
                java.lang.String r5 = "_extra_pkg_name"
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                r0.putExtra(r4, r8)
                java.lang.String r4 = "refererHost"
                r0.putExtra(r4, r3)
                org.json.JSONObject r6 = com.ss.android.downloadlib.addownload.m.f()
                java.lang.String r7 = "hook_kllk_arg4"
                int r2 = r6.optInt(r7, r2)
                if (r2 != r1) goto Lf4
                android.content.Intent r1 = new android.content.Intent
                r1.<init>()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r6 = com.ss.android.socialbase.downloader.xt.up.cw
                r2.append(r6)
                r2.append(r5)
                java.lang.String r2 = r2.toString()
                r1.putExtra(r2, r8)
                r1.putExtra(r4, r3)
                java.lang.String r8 = "android.intent.extra.INTENT"
                r0.putExtra(r8, r1)
            Lf4:
                return
            Lf5:
                boolean r2 = com.ss.android.socialbase.appdownloader.m.e.h()
                if (r2 == 0) goto L11e
                org.json.JSONObject r2 = com.ss.android.downloadlib.addownload.m.f()
                java.lang.String r3 = "hook_huawei_arg1"
                java.lang.String r5 = "com.huawei.appmarket"
                java.lang.String r2 = r2.optString(r3, r5)
                boolean r3 = r4.equals(r2)
                if (r3 != 0) goto L10f
                r8[r1] = r2
            L10f:
                org.json.JSONObject r8 = com.ss.android.downloadlib.addownload.m.f()
                java.lang.String r1 = "hook_huawei_arg2"
                java.lang.String r8 = r8.optString(r1, r5)
                java.lang.String r1 = "caller_package"
                r0.putExtra(r1, r8)
            L11e:
                return
        }

        public static java.lang.String f(java.lang.String r3) {
                boolean r0 = android.text.TextUtils.isEmpty(r3)
                r1 = 0
                if (r0 == 0) goto L8
                return r1
            L8:
                android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()     // Catch: java.lang.Exception -> L1a
                android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Exception -> L1a
                r2 = 0
                android.content.pm.ApplicationInfo r3 = r0.getApplicationInfo(r3, r2)     // Catch: java.lang.Exception -> L1a
                if (r3 == 0) goto L1a
                java.lang.String r3 = r3.sourceDir     // Catch: java.lang.Exception -> L1a
                return r3
            L1a:
                return r1
        }

        static /* synthetic */ void g() {
                a()
                return
        }
    }

    public class h {
        private static java.lang.Object[] a;
        private static java.lang.Object[] b;
        static final char[] c = null;
        private static java.lang.String d;

        static {
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                com.ss.android.downloadlib.a.h.a = r0
                r0 = 73
                java.lang.Object[] r0 = new java.lang.Object[r0]
                com.ss.android.downloadlib.a.h.b = r0
                r0 = 16
                char[] r0 = new char[r0]
                r0 = {x0018: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102} // fill-array
                com.ss.android.downloadlib.a.h.c = r0
                r0 = 0
                com.ss.android.downloadlib.a.h.d = r0
                return
        }

        public h() {
                r1 = this;
                r1.<init>()
                return
        }

        public static boolean A(java.lang.String r1) {
                boolean r0 = android.text.TextUtils.isEmpty(r1)
                if (r0 != 0) goto L10
                java.io.File r0 = new java.io.File
                r0.<init>(r1)
                boolean r1 = r0.exists()
                return r1
            L10:
                r1 = 0
                return r1
        }

        public static boolean B(android.content.pm.Signature[] r5, android.content.pm.Signature[] r6) {
                r0 = 1
                if (r5 != r6) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 == 0) goto L2a
                if (r6 != 0) goto La
                goto L2a
            La:
                int r2 = r5.length
                int r3 = r6.length
                if (r2 == r3) goto Lf
                return r1
            Lf:
                r2 = 0
            L10:
                int r3 = r5.length
                if (r2 >= r3) goto L29
                r3 = r5[r2]
                if (r3 != 0) goto L1b
                r4 = r6[r2]
                if (r4 != 0) goto L25
            L1b:
                if (r3 == 0) goto L26
                r4 = r6[r2]
                boolean r3 = r3.equals(r4)
                if (r3 != 0) goto L26
            L25:
                return r1
            L26:
                int r2 = r2 + 1
                goto L10
            L29:
                return r0
            L2a:
                return r1
        }

        public static boolean C(android.content.Context r2, java.lang.String r3) {
                r0 = 0
                if (r2 == 0) goto L42
                if (r3 == 0) goto L42
                boolean r1 = android.text.TextUtils.isEmpty(r3)
                if (r1 == 0) goto Lc
                goto L42
            Lc:
                java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> L33
                r1.<init>(r3)     // Catch: java.lang.Exception -> L33
                boolean r3 = r1.exists()     // Catch: java.lang.Exception -> L33
                if (r3 == 0) goto L42
                android.content.pm.PackageManager r3 = r2.getPackageManager()     // Catch: java.lang.Exception -> L33
                java.lang.String r1 = r1.getAbsolutePath()     // Catch: java.lang.Exception -> L33
                android.content.pm.PackageInfo r3 = r3.getPackageArchiveInfo(r1, r0)     // Catch: java.lang.Exception -> L33
                if (r3 != 0) goto L26
                return r0
            L26:
                java.lang.String r1 = r3.packageName     // Catch: java.lang.Exception -> L33
                int r3 = r3.versionCode     // Catch: java.lang.Exception -> L33
                android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Exception -> L33 android.content.pm.PackageManager.NameNotFoundException -> L35
                android.content.pm.PackageInfo r2 = r2.getPackageInfo(r1, r0)     // Catch: java.lang.Exception -> L33 android.content.pm.PackageManager.NameNotFoundException -> L35
                goto L36
            L33:
                r2 = move-exception
                goto L3f
            L35:
                r2 = 0
            L36:
                if (r2 != 0) goto L39
                goto L42
            L39:
                int r2 = r2.versionCode     // Catch: java.lang.Exception -> L33
                if (r3 > r2) goto L42
                r0 = 1
                goto L42
            L3f:
                com.bytedance.sdk.component.utils.vl.j(r2)
            L42:
                return r0
        }

        public static java.io.File D(android.content.Context r2, java.lang.String r3) {
                r0 = 0
                java.io.File r2 = r2.getExternalFilesDir(r0)
                java.io.File r2 = r2.getParentFile()
                if (r2 == 0) goto Lf
                java.lang.String r0 = r2.getParent()
            Lf:
                java.io.File r2 = new java.io.File
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                java.lang.String r0 = java.io.File.separator
                r1.append(r0)
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r2.<init>(r3)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r0 = "getExtDir: file.toString()-->"
                r3.<init>(r0)
                java.lang.String r0 = r2.toString()
                r3.append(r0)
                java.lang.String r3 = r3.toString()
                java.lang.String r0 = "ToolUtils"
                com.ss.android.socialbase.downloader.m.j.xt(r0, r3)
                return r2
        }

        public static android.graphics.drawable.Drawable E(android.content.Context r1, java.lang.String r2) {
                if (r1 == 0) goto L16
                boolean r0 = android.text.TextUtils.isEmpty(r2)
                if (r0 != 0) goto L16
                android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L16
                r0 = 0
                android.content.pm.ApplicationInfo r2 = r1.getApplicationInfo(r2, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L16
                android.graphics.drawable.Drawable r1 = r2.loadIcon(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L16
                return r1
            L16:
                r1 = 0
                return r1
        }

        public static android.content.pm.Signature[] F(android.content.Context r1, java.lang.String r2) {
                android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Throwable -> Lf
                r0 = 64
                android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r0)     // Catch: java.lang.Throwable -> Lf
                if (r1 == 0) goto L13
                android.content.pm.Signature[] r1 = r1.signatures     // Catch: java.lang.Throwable -> Lf
                return r1
            Lf:
                r1 = move-exception
                com.bytedance.sdk.component.utils.vl.j(r1)
            L13:
                r1 = 0
                return r1
        }

        public static boolean G(android.content.Context r2, java.lang.String r3) {
                if (r2 != 0) goto L6
                android.content.Context r2 = com.ss.android.downloadlib.addownload.m.getContext()
            L6:
                r0 = 0
                if (r2 == 0) goto L1b
                boolean r1 = android.text.TextUtils.isEmpty(r3)
                if (r1 != 0) goto L1b
                android.content.pm.PackageManager r2 = r2.getPackageManager()
                android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r0)     // Catch: java.lang.Exception -> L1b
                if (r2 == 0) goto L1b
                r2 = 1
                return r2
            L1b:
                return r0
        }

        public static int H(android.content.Context r1, java.lang.String r2) {
                if (r1 == 0) goto L16
                boolean r0 = android.text.TextUtils.isEmpty(r2)
                if (r0 != 0) goto L16
                android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L16
                r0 = 0
                android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L16
                if (r1 == 0) goto L16
                int r1 = r1.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L16
                return r1
            L16:
                r1 = -1
                return r1
        }

        public static long I(long r1) {
                java.io.File r0 = android.os.Environment.getExternalStorageDirectory()     // Catch: java.lang.Exception -> L9
                long r1 = i(r0, r1)     // Catch: java.lang.Exception -> L9
                return r1
            L9:
                r0 = move-exception
                com.bytedance.sdk.component.utils.vl.j(r0)
                return r1
        }

        @androidx.annotation.NonNull
        public static java.util.HashMap<java.lang.String, java.lang.String> J(org.json.JSONObject r4) {
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                if (r4 == 0) goto L23
                java.util.Iterator r1 = r4.keys()     // Catch: java.lang.Exception -> L1f
            Lb:
                boolean r2 = r1.hasNext()     // Catch: java.lang.Exception -> L1f
                if (r2 == 0) goto L23
                java.lang.Object r2 = r1.next()     // Catch: java.lang.Exception -> L1f
                java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L1f
                java.lang.String r3 = r4.optString(r2)     // Catch: java.lang.Exception -> L1f
                r0.put(r2, r3)     // Catch: java.lang.Exception -> L1f
                goto Lb
            L1f:
                r4 = move-exception
                com.bytedance.sdk.component.utils.vl.j(r4)
            L23:
                return r0
        }

        public static boolean K() {
                android.os.Looper r0 = android.os.Looper.myLooper()
                android.os.Looper r1 = android.os.Looper.getMainLooper()
                if (r0 != r1) goto Lc
                r0 = 1
                return r0
            Lc:
                r0 = 0
                return r0
        }

        public static boolean L(android.content.Context r2, android.content.Intent r3) {
                r0 = 0
                if (r3 != 0) goto L4
                return r0
            L4:
                if (r2 != 0) goto La
                android.content.Context r2 = com.ss.android.downloadlib.addownload.m.getContext()
            La:
                android.content.pm.PackageManager r2 = r2.getPackageManager()
                r1 = 65536(0x10000, float:9.1835E-41)
                java.util.List r2 = r2.queryIntentActivities(r3, r1)
                if (r2 == 0) goto L1e
                int r2 = r2.size()
                if (r2 <= 0) goto L1e
                r2 = 1
                return r2
            L1e:
                return r0
        }

        public static boolean M(com.ss.android.xt.j.xt.b r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = r2.up()
                int r1 = r2.F0()
                java.lang.String r2 = r2.t()
                com.ss.android.downloadlib.addownload.o$c r2 = m(r0, r1, r2)
                boolean r2 = r2.b()
                return r2
        }

        public static boolean N(java.lang.String r2) {
                boolean r0 = android.text.TextUtils.isEmpty(r2)
                r1 = 0
                if (r0 == 0) goto L8
                return r1
            L8:
                java.io.File r0 = new java.io.File
                r0.<init>(r2)
                boolean r2 = r0.exists()
                if (r2 == 0) goto L15
                r2 = 1
                return r2
            L15:
                return r1
        }

        public static android.content.Intent a(android.content.Context r2, java.lang.String r3) {
                android.content.pm.PackageManager r2 = r2.getPackageManager()
                android.content.Intent r2 = r2.getLaunchIntentForPackage(r3)
                r3 = 0
                if (r2 != 0) goto Lc
                return r3
            Lc:
                java.lang.String r0 = "android.intent.category.LAUNCHER"
                boolean r1 = r2.hasCategory(r0)
                if (r1 != 0) goto L17
                r2.addCategory(r0)
            L17:
                r2.setPackage(r3)
                r3 = 2097152(0x200000, float:2.938736E-39)
                r2.addFlags(r3)
                r3 = 268435456(0x10000000, float:2.524355E-29)
                r2.addFlags(r3)
                return r2
        }

        public static java.lang.String b(android.content.Context r1, java.lang.String r2) {
                if (r1 == 0) goto L16
                boolean r0 = android.text.TextUtils.isEmpty(r2)
                if (r0 != 0) goto L16
                android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L16
                r0 = 0
                android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L16
                if (r1 == 0) goto L16
                java.lang.String r1 = r1.versionName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L16
                return r1
            L16:
                java.lang.String r1 = ""
                return r1
        }

        @android.annotation.SuppressLint({"MissingPermission"})
        public static void c() {
                v2.n r0 = com.ss.android.downloadlib.addownload.m.E()     // Catch: java.lang.Exception -> L50
                android.content.Context r1 = com.ss.android.downloadlib.addownload.m.getContext()     // Catch: java.lang.Exception -> L50
                java.lang.String r2 = "android.permission.REORDER_TASKS"
                boolean r0 = r0.j(r1, r2)     // Catch: java.lang.Exception -> L50
                if (r0 != 0) goto L11
                goto L4f
            L11:
                android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()     // Catch: java.lang.Exception -> L50
                java.lang.String r1 = "activity"
                java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Exception -> L50
                android.app.ActivityManager r0 = (android.app.ActivityManager) r0     // Catch: java.lang.Exception -> L50
                r1 = 20
                java.util.List r1 = r0.getRunningTasks(r1)     // Catch: java.lang.Exception -> L50
                java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L50
            L27:
                boolean r2 = r1.hasNext()     // Catch: java.lang.Exception -> L50
                if (r2 == 0) goto L4f
                java.lang.Object r2 = r1.next()     // Catch: java.lang.Exception -> L50
                android.app.ActivityManager$RunningTaskInfo r2 = (android.app.ActivityManager.RunningTaskInfo) r2     // Catch: java.lang.Exception -> L50
                android.content.Context r3 = com.ss.android.downloadlib.addownload.m.getContext()     // Catch: java.lang.Exception -> L50
                java.lang.String r3 = r3.getPackageName()     // Catch: java.lang.Exception -> L50
                android.content.ComponentName r4 = cn.jpush.android.ui.e.a(r2)     // Catch: java.lang.Exception -> L50
                java.lang.String r4 = r4.getPackageName()     // Catch: java.lang.Exception -> L50
                boolean r3 = r3.equals(r4)     // Catch: java.lang.Exception -> L50
                if (r3 == 0) goto L27
                int r1 = r2.id     // Catch: java.lang.Exception -> L50
                r2 = 1
                r0.moveTaskToFront(r1, r2)     // Catch: java.lang.Exception -> L50
            L4f:
                return
            L50:
                r0 = move-exception
                com.bytedance.sdk.component.utils.vl.j(r0)
                return
        }

        @androidx.annotation.WorkerThread
        public static boolean d(java.lang.String r7) {
                android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
                boolean r1 = android.text.TextUtils.isEmpty(r7)
                r2 = 0
                if (r1 == 0) goto Lc
                return r2
            Lc:
                boolean r1 = G(r0, r7)
                if (r1 != 0) goto L13
                return r2
            L13:
                android.content.pm.ApplicationInfo r1 = r0.getApplicationInfo()
                int r1 = r1.targetSdkVersion
                org.json.JSONObject r3 = com.ss.android.downloadlib.addownload.m.f()
                java.lang.String r4 = "get_ext_dir_mode"
                int r3 = r3.optInt(r4)
                r5 = 1
                r6 = 29
                if (r3 != 0) goto L37
                int r3 = android.os.Build.VERSION.SDK_INT
                if (r3 < r6) goto L37
                if (r1 != r6) goto L34
                boolean r3 = com.bumptech.glide.load.model.stream.g.a()
                if (r3 == 0) goto L36
            L34:
                if (r1 <= r6) goto L37
            L36:
                return r5
            L37:
                int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L52
                if (r1 < r6) goto L54
                android.content.pm.ApplicationInfo r1 = r0.getApplicationInfo()     // Catch: java.lang.Exception -> L52
                int r1 = r1.targetSdkVersion     // Catch: java.lang.Exception -> L52
                if (r1 < r6) goto L54
                org.json.JSONObject r1 = com.ss.android.downloadlib.addownload.m.f()     // Catch: java.lang.Exception -> L52
                int r1 = r1.optInt(r4)     // Catch: java.lang.Exception -> L52
                if (r1 != r5) goto L54
                java.io.File r1 = D(r0, r7)     // Catch: java.lang.Exception -> L52
                goto L6b
            L52:
                r7 = move-exception
                goto L88
            L54:
                java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> L52
                java.io.File r3 = android.os.Environment.getExternalStorageDirectory()     // Catch: java.lang.Exception -> L52
                java.lang.String r3 = r3.getPath()     // Catch: java.lang.Exception -> L52
                java.lang.String r4 = "android/data/"
                java.lang.String r6 = java.lang.String.valueOf(r7)     // Catch: java.lang.Exception -> L52
                java.lang.String r4 = r4.concat(r6)     // Catch: java.lang.Exception -> L52
                r1.<init>(r3, r4)     // Catch: java.lang.Exception -> L52
            L6b:
                boolean r3 = r1.exists()     // Catch: java.lang.Exception -> L52
                if (r3 != 0) goto L72
                return r2
            L72:
                long r3 = com.ss.android.downloadlib.a.d.a(r1)     // Catch: java.lang.Exception -> L52
                android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Exception -> L52
                android.content.pm.PackageInfo r7 = r0.getPackageInfo(r7, r2)     // Catch: java.lang.Exception -> L52
                if (r7 == 0) goto L87
                long r0 = r7.lastUpdateTime     // Catch: java.lang.Exception -> L52
                int r7 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r7 >= 0) goto L87
                return r5
            L87:
                return r2
            L88:
                com.bytedance.sdk.component.utils.vl.j(r7)
                return r5
        }

        public static android.content.pm.Signature[] e(android.content.Context r1, java.lang.String r2) {
                android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Throwable -> Lf
                r0 = 64
                android.content.pm.PackageInfo r1 = r1.getPackageArchiveInfo(r2, r0)     // Catch: java.lang.Throwable -> Lf
                if (r1 == 0) goto L13
                android.content.pm.Signature[] r1 = r1.signatures     // Catch: java.lang.Throwable -> Lf
                return r1
            Lf:
                r1 = move-exception
                com.bytedance.sdk.component.utils.vl.j(r1)
            L13:
                r1 = 0
                return r1
        }

        public static int f(android.content.Context r0, float r1) {
                android.content.res.Resources r0 = r0.getResources()
                android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
                float r0 = r0.density
                float r1 = r1 * r0
                r0 = 1056964608(0x3f000000, float:0.5)
                float r1 = r1 + r0
                int r0 = (int) r1
                return r0
        }

        public static int g(java.lang.String r7, java.lang.String r8) {
                java.lang.String r0 = "\\."
                r1 = -2
                boolean r2 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Exception -> L64
                if (r2 != 0) goto L64
                boolean r2 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Exception -> L64
                if (r2 == 0) goto L10
                goto L64
            L10:
                boolean r2 = r7.equals(r8)     // Catch: java.lang.Exception -> L64
                r3 = 0
                if (r2 == 0) goto L18
                return r3
            L18:
                java.lang.String[] r7 = r7.split(r0)     // Catch: java.lang.Exception -> L64
                java.lang.String[] r8 = r8.split(r0)     // Catch: java.lang.Exception -> L64
                int r0 = r7.length     // Catch: java.lang.Exception -> L64
                int r2 = r8.length     // Catch: java.lang.Exception -> L64
                int r0 = java.lang.Math.min(r0, r2)     // Catch: java.lang.Exception -> L64
                r2 = 0
                r4 = 0
            L28:
                if (r2 >= r0) goto L3c
                r4 = r7[r2]     // Catch: java.lang.Exception -> L64
                int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.Exception -> L64
                r5 = r8[r2]     // Catch: java.lang.Exception -> L64
                int r5 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.Exception -> L64
                int r4 = r4 - r5
                if (r4 != 0) goto L3c
                int r2 = r2 + 1
                goto L28
            L3c:
                r0 = -1
                r5 = 1
                if (r4 != 0) goto L60
                r4 = r2
            L41:
                int r6 = r7.length     // Catch: java.lang.Exception -> L64
                if (r4 >= r6) goto L50
                r6 = r7[r4]     // Catch: java.lang.Exception -> L64
                int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.Exception -> L64
                if (r6 <= 0) goto L4d
                return r5
            L4d:
                int r4 = r4 + 1
                goto L41
            L50:
                int r7 = r8.length     // Catch: java.lang.Exception -> L64
                if (r2 >= r7) goto L5f
                r7 = r8[r2]     // Catch: java.lang.Exception -> L64
                int r7 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.Exception -> L64
                if (r7 <= 0) goto L5c
                return r0
            L5c:
                int r2 = r2 + 1
                goto L50
            L5f:
                return r3
            L60:
                if (r4 <= 0) goto L63
                return r5
            L63:
                return r0
            L64:
                return r1
        }

        public static long h(java.io.File r3) {
                r0 = -1
                if (r3 != 0) goto L5
                return r0
            L5:
                android.os.StatFs r2 = new android.os.StatFs     // Catch: java.lang.Throwable -> L13
                java.lang.String r3 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> L13
                r2.<init>(r3)     // Catch: java.lang.Throwable -> L13
                long r0 = r2.getTotalBytes()     // Catch: java.lang.Throwable -> L13
                return r0
            L13:
                r3 = move-exception
                com.bytedance.sdk.component.utils.vl.j(r3)
                return r0
        }

        public static long i(java.io.File r0, long r1) {
                if (r0 != 0) goto L3
                return r1
            L3:
                java.lang.String r0 = r0.getAbsolutePath()     // Catch: java.lang.Exception -> Lc
                long r0 = com.ss.android.socialbase.downloader.az.m.r(r0)     // Catch: java.lang.Exception -> Lc
                return r0
            Lc:
                r0 = move-exception
                com.bytedance.sdk.component.utils.vl.j(r0)
                return r1
        }

        public static long j(org.json.JSONObject r0, java.lang.String r1) {
                long r0 = t2.b.a(r0, r1)
                return r0
        }

        public static android.content.pm.PackageInfo k(com.ss.android.xt.j.xt.b r4) {
                r0 = 0
                if (r4 != 0) goto L4
                return r0
            L4:
                android.content.Context r1 = com.ss.android.downloadlib.addownload.m.getContext()
                com.ss.android.socialbase.downloader.downloader.ae r1 = com.ss.android.socialbase.downloader.downloader.ae.xt(r1)
                int r4 = r4.mi()
                com.ss.android.socialbase.downloader.ae.cw r4 = r1.tl(r4)
                if (r4 != 0) goto L17
                return r0
            L17:
                android.content.Context r1 = com.ss.android.downloadlib.addownload.m.getContext()     // Catch: java.lang.Throwable -> L28
                java.lang.String r2 = r4.qv()     // Catch: java.lang.Throwable -> L28
                java.lang.String r3 = r4.tl()     // Catch: java.lang.Throwable -> L28
                android.content.pm.PackageInfo r4 = com.ss.android.socialbase.appdownloader.b.l(r1, r4, r2, r3)     // Catch: java.lang.Throwable -> L28
                return r4
            L28:
                return r0
        }

        public static android.graphics.drawable.Drawable l(android.content.Context r2, java.lang.String r3) {
                r0 = 0
                if (r2 == 0) goto L24
                boolean r1 = android.text.TextUtils.isEmpty(r3)
                if (r1 == 0) goto La
                goto L24
            La:
                android.content.pm.PackageManager r2 = r2.getPackageManager()
                r1 = 0
                android.content.pm.PackageInfo r1 = r2.getPackageArchiveInfo(r3, r1)
                if (r1 == 0) goto L24
                android.content.pm.ApplicationInfo r1 = r1.applicationInfo
                r1.sourceDir = r3
                r1.publicSourceDir = r3
                android.graphics.drawable.Drawable r2 = r1.loadIcon(r2)     // Catch: java.lang.Exception -> L20
                return r2
            L20:
                r2 = move-exception
                com.bytedance.sdk.component.utils.vl.j(r2)
            L24:
                return r0
        }

        public static com.ss.android.downloadlib.addownload.o.c m(java.lang.String r3, int r4, java.lang.String r5) {
                com.ss.android.downloadlib.addownload.o$c r0 = new com.ss.android.downloadlib.addownload.o$c
                r0.<init>()
                boolean r1 = android.text.TextUtils.isEmpty(r3)
                if (r1 == 0) goto Lc
                goto L43
            Lc:
                android.content.Context r1 = com.ss.android.downloadlib.addownload.m.getContext()     // Catch: java.lang.Exception -> L41
                android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Exception -> L41
                r2 = 0
                android.content.pm.PackageInfo r3 = r1.getPackageInfo(r3, r2)     // Catch: java.lang.Exception -> L41
                if (r3 == 0) goto L43
                int r1 = r3.versionCode     // Catch: java.lang.Exception -> L41
                r0.d(r1)     // Catch: java.lang.Exception -> L41
                int r1 = com.ss.android.downloadlib.addownload.o.c.h     // Catch: java.lang.Exception -> L41
                r0.a(r1)     // Catch: java.lang.Exception -> L41
                v2.v r1 = com.ss.android.downloadlib.addownload.m.a()     // Catch: java.lang.Exception -> L41
                if (r1 == 0) goto L43
                boolean r1 = r1.j()     // Catch: java.lang.Exception -> L41
                if (r1 == 0) goto L43
                int r1 = r3.versionCode     // Catch: java.lang.Exception -> L41
                java.lang.String r3 = r3.versionName     // Catch: java.lang.Exception -> L41
                boolean r3 = w(r1, r4, r3, r5)     // Catch: java.lang.Exception -> L41
                if (r3 != 0) goto L43
                int r3 = com.ss.android.downloadlib.addownload.o.c.i     // Catch: java.lang.Exception -> L41
                r0.a(r3)     // Catch: java.lang.Exception -> L41
                return r0
            L41:
                r3 = move-exception
                goto L44
            L43:
                return r0
            L44:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r5 = "getInstalledAppInfo:"
                r4.<init>(r5)
                java.lang.String r3 = r3.getMessage()
                r4.append(r3)
                java.lang.String r3 = r4.toString()
                java.lang.String r4 = "ToolUtils"
                com.ss.android.socialbase.downloader.m.j.up(r4, r3)
                return r0
        }

        @androidx.annotation.NonNull
        public static <T> T n(T... r4) {
                java.lang.String r0 = "args is null"
                if (r4 == 0) goto L16
                int r1 = r4.length
                r2 = 0
            L6:
                if (r2 >= r1) goto L10
                r3 = r4[r2]
                if (r3 == 0) goto Ld
                return r3
            Ld:
                int r2 = r2 + 1
                goto L6
            L10:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                r4.<init>(r0)
                throw r4
            L16:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                r4.<init>(r0)
                throw r4
        }

        public static java.lang.String o(long r5) {
                java.text.DecimalFormat r0 = new java.text.DecimalFormat
                java.lang.String r1 = "0.00"
                r0.<init>(r1)
                r1 = 1073741824(0x40000000, double:5.304989477E-315)
                int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r3 < 0) goto L21
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                long r5 = r5 / r1
                r0.append(r5)
                java.lang.String r5 = "G"
                r0.append(r5)
                java.lang.String r5 = r0.toString()
                return r5
            L21:
                java.lang.String r1 = "M"
                r2 = 1048576(0x100000, double:5.180654E-318)
                int r4 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
                if (r4 < 0) goto L3b
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                long r5 = r5 / r2
                r0.append(r5)
                r0.append(r1)
                java.lang.String r5 = r0.toString()
                return r5
            L3b:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                float r5 = (float) r5
                r6 = 1233125376(0x49800000, float:1048576.0)
                float r5 = r5 / r6
                double r5 = (double) r5
                java.lang.String r5 = r0.format(r5)
                r2.append(r5)
                r2.append(r1)
                java.lang.String r5 = r2.toString()
                return r5
        }

        public static java.lang.String p(java.lang.String r1, int r2) {
                if (r2 != 0) goto L5
                java.lang.String r1 = ""
                return r1
            L5:
                boolean r0 = android.text.TextUtils.isEmpty(r1)
                if (r0 != 0) goto L17
                int r0 = r1.length()
                if (r0 > r2) goto L12
                goto L17
            L12:
                r0 = 0
                java.lang.String r1 = r1.substring(r0, r2)
            L17:
                return r1
        }

        public static java.lang.String q(java.lang.String... r0) {
                java.lang.String r0 = t2.b.b(r0)
                return r0
        }

        @androidx.annotation.NonNull
        public static org.json.JSONObject r(org.json.JSONObject r0) {
                org.json.JSONObject r0 = t2.b.c(r0)
                return r0
        }

        public static org.json.JSONObject s(org.json.JSONObject r0, org.json.JSONObject r1) {
                org.json.JSONObject r0 = t2.b.d(r0, r1)
                return r0
        }

        @androidx.annotation.NonNull
        public static org.json.JSONObject t(org.json.JSONObject... r0) {
                org.json.JSONObject r0 = t2.b.e(r0)
                return r0
        }

        public static void u(org.json.JSONObject r1, java.lang.String r2, java.lang.Object r3) {
                if (r1 == 0) goto L11
                boolean r0 = android.text.TextUtils.isEmpty(r2)
                if (r0 == 0) goto L9
                goto L11
            L9:
                r1.putOpt(r2, r3)     // Catch: org.json.JSONException -> Ld
                return
            Ld:
                r1 = move-exception
                com.bytedance.sdk.component.utils.vl.j(r1)
            L11:
                return
        }

        public static boolean v() {
                r0 = 0
                android.content.Context r1 = com.ss.android.downloadlib.addownload.m.getContext()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
                android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
                android.content.Context r2 = com.ss.android.downloadlib.addownload.m.getContext()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
                java.lang.String r2 = r2.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
                android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
                android.content.pm.ApplicationInfo r1 = r1.applicationInfo     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
                int r1 = r1.targetSdkVersion     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
                r2 = 33
                if (r1 < r2) goto L25
                int r1 = android.os.Build.VERSION.SDK_INT     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
                if (r1 < r2) goto L25
                r0 = 1
                return r0
            L23:
                r1 = move-exception
                goto L26
            L25:
                return r0
            L26:
                com.bytedance.sdk.component.utils.vl.j(r1)
                return r0
        }

        private static boolean w(int r2, int r3, java.lang.String r4, java.lang.String r5) {
                r0 = 1
                if (r3 != 0) goto La
                boolean r1 = android.text.TextUtils.isEmpty(r5)
                if (r1 == 0) goto La
                return r0
            La:
                if (r3 <= 0) goto Lf
                if (r2 < r3) goto Lf
                return r0
            Lf:
                int r2 = g(r4, r5)
                if (r2 < 0) goto L16
                return r0
            L16:
                r2 = 0
                return r2
        }

        public static boolean x(android.content.Context r2, android.content.Intent r3) {
                r0 = 0
                android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Exception -> L15
                r1 = 65536(0x10000, float:9.1835E-41)
                java.util.List r2 = r2.queryIntentActivities(r3, r1)     // Catch: java.lang.Exception -> L15
                if (r2 == 0) goto L15
                boolean r2 = r2.isEmpty()     // Catch: java.lang.Exception -> L15
                if (r2 != 0) goto L15
                r2 = 1
                return r2
            L15:
                return r0
        }

        public static boolean y(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
                r0 = 0
                if (r2 == 0) goto L4d
                boolean r1 = android.text.TextUtils.isEmpty(r3)
                if (r1 != 0) goto L4d
                boolean r1 = android.text.TextUtils.isEmpty(r4)
                if (r1 == 0) goto L10
                goto L4d
            L10:
                java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> L3e
                r1.<init>(r3)     // Catch: java.lang.Exception -> L3e
                boolean r3 = r1.exists()     // Catch: java.lang.Exception -> L3e
                if (r3 == 0) goto L4d
                android.content.pm.PackageManager r3 = r2.getPackageManager()     // Catch: java.lang.Exception -> L3e
                java.lang.String r1 = r1.getAbsolutePath()     // Catch: java.lang.Exception -> L3e
                android.content.pm.PackageInfo r3 = r3.getPackageArchiveInfo(r1, r0)     // Catch: java.lang.Exception -> L3e
                if (r3 != 0) goto L2a
                return r0
            L2a:
                java.lang.String r1 = r3.packageName     // Catch: java.lang.Exception -> L3e
                boolean r1 = r1.equals(r4)     // Catch: java.lang.Exception -> L3e
                if (r1 != 0) goto L33
                return r0
            L33:
                int r3 = r3.versionCode     // Catch: java.lang.Exception -> L3e
                android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Exception -> L3e android.content.pm.PackageManager.NameNotFoundException -> L40
                android.content.pm.PackageInfo r2 = r2.getPackageInfo(r4, r0)     // Catch: java.lang.Exception -> L3e android.content.pm.PackageManager.NameNotFoundException -> L40
                goto L41
            L3e:
                r2 = move-exception
                goto L4a
            L40:
                r2 = 0
            L41:
                if (r2 != 0) goto L44
                goto L4d
            L44:
                int r2 = r2.versionCode     // Catch: java.lang.Exception -> L3e
                if (r3 != r2) goto L4d
                r0 = 1
                goto L4d
            L4a:
                com.bytedance.sdk.component.utils.vl.j(r2)
            L4d:
                return r0
        }

        public static boolean z(com.ss.android.j.j.cw.b r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = r2.s()
                int r1 = r2.f()
                java.lang.String r2 = r2.v()
                com.ss.android.downloadlib.addownload.o$c r2 = m(r0, r1, r2)
                boolean r2 = r2.b()
                return r2
        }
    }

    public class i {
        public i() {
                r1 = this;
                r1.<init>()
                return
        }

        public static void a(com.ss.android.socialbase.downloader.ae.cw r3, org.json.JSONObject r4) {
                if (r3 == 0) goto L82
                java.lang.String r0 = "total_bytes"
                long r1 = r3.ka()     // Catch: java.lang.Exception -> Lc1
                java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Exception -> Lc1
                r4.putOpt(r0, r1)     // Catch: java.lang.Exception -> Lc1
                java.lang.String r0 = "cur_bytes"
                long r1 = r3.uq()     // Catch: java.lang.Exception -> Lc1
                java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Exception -> Lc1
                r4.putOpt(r0, r1)     // Catch: java.lang.Exception -> Lc1
                java.lang.String r0 = "chunk_count"
                int r1 = r3.kj()     // Catch: java.lang.Exception -> Lc1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Exception -> Lc1
                r4.putOpt(r0, r1)     // Catch: java.lang.Exception -> Lc1
                java.lang.String r0 = "app_name"
                java.lang.String r1 = r3.g()     // Catch: java.lang.Exception -> Lc1
                r4.putOpt(r0, r1)     // Catch: java.lang.Exception -> Lc1
                java.lang.String r0 = "network_quality"
                java.lang.String r1 = r3.wo()     // Catch: java.lang.Exception -> Lc1
                r4.putOpt(r0, r1)     // Catch: java.lang.Exception -> Lc1
                java.lang.String r0 = "save_path"
                java.lang.String r1 = r3.qv()     // Catch: java.lang.Exception -> Lc1
                r4.putOpt(r0, r1)     // Catch: java.lang.Exception -> Lc1
                java.lang.String r0 = "file_name"
                java.lang.String r1 = r3.tl()     // Catch: java.lang.Exception -> Lc1
                r4.putOpt(r0, r1)     // Catch: java.lang.Exception -> Lc1
                java.lang.String r0 = "download_status"
                int r1 = r3.v()     // Catch: java.lang.Exception -> Lc1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Exception -> Lc1
                r4.putOpt(r0, r1)     // Catch: java.lang.Exception -> Lc1
                com.ss.android.downloadlib.addownload.o$f r0 = com.ss.android.downloadlib.addownload.o.f.c()     // Catch: java.lang.Exception -> Lc1
                int r3 = r3.ae()     // Catch: java.lang.Exception -> Lc1
                com.ss.android.xt.j.xt.b r3 = r0.e(r3)     // Catch: java.lang.Exception -> Lc1
                if (r3 == 0) goto L82
                java.lang.String r0 = "click_download_time"
                long r1 = r3.k()     // Catch: java.lang.Exception -> Lc1
                java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Exception -> Lc1
                r4.putOpt(r0, r1)     // Catch: java.lang.Exception -> Lc1
                java.lang.String r0 = "click_download_size"
                long r1 = r3.s()     // Catch: java.lang.Exception -> Lc1
                java.lang.Long r3 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Exception -> Lc1
                r4.putOpt(r0, r3)     // Catch: java.lang.Exception -> Lc1
            L82:
                java.lang.String r3 = "permission_notification"
                boolean r0 = com.ss.android.socialbase.appdownloader.up.c.e()     // Catch: java.lang.Exception -> Lc1
                r1 = 2
                r2 = 1
                if (r0 == 0) goto L8e
                r0 = 1
                goto L8f
            L8e:
                r0 = 2
            L8f:
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> Lc1
                r4.putOpt(r3, r0)     // Catch: java.lang.Exception -> Lc1
                java.lang.String r3 = "network_available"
                android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()     // Catch: java.lang.Exception -> Lc1
                boolean r0 = com.ss.android.socialbase.downloader.az.m.cw(r0)     // Catch: java.lang.Exception -> Lc1
                if (r0 == 0) goto La4
                r0 = 1
                goto La5
            La4:
                r0 = 2
            La5:
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> Lc1
                r4.putOpt(r3, r0)     // Catch: java.lang.Exception -> Lc1
                java.lang.String r3 = "network_is_wifi"
                android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()     // Catch: java.lang.Exception -> Lc1
                boolean r0 = com.ss.android.socialbase.downloader.az.m.xt(r0)     // Catch: java.lang.Exception -> Lc1
                if (r0 == 0) goto Lb9
                r1 = 1
            Lb9:
                java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Exception -> Lc1
                r4.putOpt(r3, r0)     // Catch: java.lang.Exception -> Lc1
                return
            Lc1:
                r3 = move-exception
                com.bytedance.sdk.component.utils.vl.j(r3)
                return
        }

        public static org.json.JSONObject b(@androidx.annotation.NonNull org.json.JSONObject r1, com.ss.android.xt.j.xt.a r2) {
                java.lang.String r2 = r2.m()
                java.lang.String r0 = "open_url_not_exist"
                java.lang.String[] r2 = new java.lang.String[]{r2, r0}
                java.lang.String r2 = com.ss.android.downloadlib.a.h.q(r2)
                java.lang.String r0 = "open_url"
                com.ss.android.downloadlib.a.h.u(r1, r0, r2)
                return r1
        }

        public static void c(com.ss.android.socialbase.downloader.ae.cw r2, org.json.JSONObject r3) {
                a(r2, r3)     // Catch: java.lang.Throwable -> L20
                com.ss.android.downloadlib.addownload.o$f r0 = com.ss.android.downloadlib.addownload.o.f.c()     // Catch: java.lang.Throwable -> L20
                com.ss.android.xt.j.xt.b r2 = r0.f(r2)     // Catch: java.lang.Throwable -> L20
                if (r2 != 0) goto Le
                return
            Le:
                java.lang.String r0 = "is_update_download"
                boolean r1 = r2.i0()     // Catch: java.lang.Throwable -> L20
                if (r1 == 0) goto L18
                r1 = 1
                goto L19
            L18:
                r1 = 2
            L19:
                r3.put(r0, r1)     // Catch: java.lang.Throwable -> L20
                d(r2, r3)     // Catch: java.lang.Throwable -> L20
                return
            L20:
                r2 = move-exception
                com.bytedance.sdk.component.utils.vl.j(r2)
                return
        }

        public static void d(com.ss.android.xt.j.xt.b r2, org.json.JSONObject r3) {
                if (r3 != 0) goto L3
                goto L5
            L3:
                if (r2 != 0) goto L6
            L5:
                return
            L6:
                java.lang.String r0 = "is_patch_apply_handled"
                boolean r1 = r2.a1()     // Catch: java.lang.Throwable -> L19
                r3.put(r0, r1)     // Catch: java.lang.Throwable -> L19
                java.lang.String r0 = "origin_mime_type"
                java.lang.String r2 = r2.k0()     // Catch: java.lang.Throwable -> L19
                r3.put(r0, r2)     // Catch: java.lang.Throwable -> L19
                return
            L19:
                r2 = move-exception
                com.bytedance.sdk.component.utils.vl.j(r2)
                return
        }

        public static void e(@androidx.annotation.NonNull org.json.JSONObject r4) {
                java.lang.String r0 = "harmony_api_version"
                java.lang.String r1 = com.ss.android.socialbase.appdownloader.m.d.e()     // Catch: java.lang.Exception -> L75
                r4.putOpt(r0, r1)     // Catch: java.lang.Exception -> L75
                java.lang.String r0 = "harmony_release_type"
                java.lang.String r1 = com.ss.android.socialbase.appdownloader.m.d.c()     // Catch: java.lang.Exception -> L75
                r4.putOpt(r0, r1)     // Catch: java.lang.Exception -> L75
                java.lang.String r0 = "harmony_build_version"
                java.lang.String r1 = com.ss.android.socialbase.appdownloader.m.d.k()     // Catch: java.lang.Exception -> L75
                r4.putOpt(r0, r1)     // Catch: java.lang.Exception -> L75
                java.lang.String r0 = "pure_mode"
                android.content.Context r1 = com.ss.android.downloadlib.addownload.m.getContext()     // Catch: java.lang.Exception -> L75
                boolean r1 = com.ss.android.socialbase.appdownloader.m.d.h(r1)     // Catch: java.lang.Exception -> L75
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2b
                r1 = 1
                goto L2c
            L2b:
                r1 = 2
            L2c:
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Exception -> L75
                r4.putOpt(r0, r1)     // Catch: java.lang.Exception -> L75
                java.lang.String r0 = "pure_mode_enable"
                boolean r1 = com.ss.android.socialbase.appdownloader.m.d.l()     // Catch: java.lang.Exception -> L75
                if (r1 == 0) goto L3d
                r1 = 1
                goto L3e
            L3d:
                r1 = 2
            L3e:
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Exception -> L75
                r4.putOpt(r0, r1)     // Catch: java.lang.Exception -> L75
                java.lang.String r0 = "harmony_version"
                java.lang.String r1 = com.ss.android.socialbase.appdownloader.m.d.m()     // Catch: java.lang.Exception -> L75
                r4.putOpt(r0, r1)     // Catch: java.lang.Exception -> L75
                java.lang.String r0 = "pure_enhanced_mode"
                android.content.Context r1 = com.ss.android.downloadlib.addownload.m.getContext()     // Catch: java.lang.Exception -> L75
                boolean r1 = com.ss.android.socialbase.appdownloader.m.d.n(r1)     // Catch: java.lang.Exception -> L75
                if (r1 == 0) goto L5c
                r1 = 1
                goto L5d
            L5c:
                r1 = 2
            L5d:
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Exception -> L75
                r4.putOpt(r0, r1)     // Catch: java.lang.Exception -> L75
                java.lang.String r0 = "pure_enhanced_mode_enable"
                boolean r1 = com.ss.android.socialbase.appdownloader.m.d.i()     // Catch: java.lang.Exception -> L75
                if (r1 == 0) goto L6d
                r2 = 1
            L6d:
                java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L75
                r4.putOpt(r0, r1)     // Catch: java.lang.Exception -> L75
                return
            L75:
                r4 = move-exception
                com.bytedance.sdk.component.utils.vl.j(r4)
                return
        }

        public static void f(org.json.JSONObject r6, int r7) {
                java.lang.String r0 = "_"
                if (r6 != 0) goto L5
                goto L60
            L5:
                com.ss.android.socialbase.downloader.jy.j r7 = com.ss.android.socialbase.downloader.jy.j.j(r7)
                java.lang.String r1 = "ah_report_config"
                org.json.JSONArray r7 = r7.up(r1)
                if (r7 == 0) goto L4e
                r1 = 0
            L12:
                int r2 = r7.length()     // Catch: java.lang.Throwable -> L46
                if (r1 >= r2) goto L4e
                java.lang.String r2 = r7.getString(r1)     // Catch: java.lang.Throwable -> L46
                com.ss.android.socialbase.appdownloader.a$a r3 = com.ss.android.socialbase.appdownloader.m.b.b(r2)     // Catch: java.lang.Throwable -> L46
                if (r3 == 0) goto L48
                java.lang.String r4 = "\\."
                java.lang.String r2 = r2.replaceAll(r4, r0)     // Catch: java.lang.Throwable -> L46
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L46
                r4.<init>()     // Catch: java.lang.Throwable -> L46
                int r5 = r3.i()     // Catch: java.lang.Throwable -> L46
                r4.append(r5)     // Catch: java.lang.Throwable -> L46
                r4.append(r0)     // Catch: java.lang.Throwable -> L46
                java.lang.String r3 = r3.a()     // Catch: java.lang.Throwable -> L46
                r4.append(r3)     // Catch: java.lang.Throwable -> L46
                java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L46
                r6.put(r2, r3)     // Catch: java.lang.Throwable -> L46
                goto L48
            L46:
                r7 = move-exception
                goto L4b
            L48:
                int r1 = r1 + 1
                goto L12
            L4b:
                com.bytedance.sdk.component.utils.vl.j(r7)
            L4e:
                android.content.Context r7 = com.ss.android.socialbase.downloader.downloader.cw.nd()     // Catch: java.lang.Throwable -> L60
                boolean r7 = com.ss.android.socialbase.appdownloader.j.n(r7)     // Catch: java.lang.Throwable -> L60
                java.lang.String r0 = "is_unknown_source_enabled"
                if (r7 == 0) goto L5c
                r7 = 1
                goto L5d
            L5c:
                r7 = 2
            L5d:
                r6.put(r0, r7)     // Catch: java.lang.Throwable -> L60
            L60:
                return
        }

        public static org.json.JSONObject g(@androidx.annotation.NonNull org.json.JSONObject r4, com.ss.android.xt.j.xt.a r5) {
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r0 = com.ss.android.socialbase.appdownloader.m.e.m()
                java.lang.String r1 = "\\."
                java.lang.String r2 = "_"
                java.lang.String r0 = r0.replaceAll(r1, r2)
                r5.append(r0)
                java.lang.String r0 = " versionCode"
                r5.append(r0)
                java.lang.String r5 = r5.toString()
                android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
                java.lang.String r3 = com.ss.android.socialbase.appdownloader.m.e.m()
                int r0 = com.ss.android.downloadlib.a.h.H(r0, r3)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                com.ss.android.downloadlib.a.h.u(r4, r5, r0)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r0 = com.ss.android.socialbase.appdownloader.m.e.m()
                java.lang.String r0 = r0.replaceAll(r1, r2)
                r5.append(r0)
                java.lang.String r0 = " versionName"
                r5.append(r0)
                java.lang.String r5 = r5.toString()
                android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
                java.lang.String r1 = com.ss.android.socialbase.appdownloader.m.e.m()
                java.lang.String r0 = com.ss.android.downloadlib.a.h.b(r0, r1)
                com.ss.android.downloadlib.a.h.u(r4, r5, r0)
                return r4
        }

        public static void h(com.ss.android.socialbase.downloader.ae.cw r8, org.json.JSONObject r9) {
                if (r9 != 0) goto L3
                goto Ld
            L3:
                com.ss.android.downloadlib.addownload.o$f r0 = com.ss.android.downloadlib.addownload.o.f.c()
                com.ss.android.xt.j.xt.b r0 = r0.f(r8)
                if (r0 != 0) goto Le
            Ld:
                return
            Le:
                a(r8, r9)     // Catch: java.lang.Throwable -> L100
                java.lang.String r1 = "time_after_click"
                long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L100
                long r4 = r0.k()     // Catch: java.lang.Throwable -> L100
                long r2 = r2 - r4
                java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L100
                r9.putOpt(r1, r2)     // Catch: java.lang.Throwable -> L100
                java.lang.String r1 = "click_download_size"
                long r2 = r0.s()     // Catch: java.lang.Throwable -> L100
                java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L100
                r9.putOpt(r1, r2)     // Catch: java.lang.Throwable -> L100
                java.lang.String r1 = "download_length"
                long r2 = r8.uq()     // Catch: java.lang.Throwable -> L100
                java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L100
                r9.putOpt(r1, r2)     // Catch: java.lang.Throwable -> L100
                java.lang.String r1 = "download_apk_size"
                long r2 = r8.ka()     // Catch: java.lang.Throwable -> L100
                java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L100
                r9.putOpt(r1, r2)     // Catch: java.lang.Throwable -> L100
                r0.a()     // Catch: java.lang.Throwable -> L100
                com.ss.android.downloadlib.addownload.o$d r1 = com.ss.android.downloadlib.addownload.o.d.c()     // Catch: java.lang.Throwable -> L100
                r1.d(r0)     // Catch: java.lang.Throwable -> L100
                java.lang.String r1 = "click_pause_times"
                int r2 = r0.x0()     // Catch: java.lang.Throwable -> L100
                r9.put(r1, r2)     // Catch: java.lang.Throwable -> L100
                long r1 = r8.ka()     // Catch: java.lang.Throwable -> L100
                long r3 = r8.uq()     // Catch: java.lang.Throwable -> L100
                r5 = 0
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 < 0) goto L73
                int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r7 <= 0) goto L73
                double r3 = (double) r3     // Catch: java.lang.Throwable -> L100
                double r1 = (double) r1     // Catch: java.lang.Throwable -> L100
                double r3 = r3 / r1
                goto L75
            L73:
                r3 = 0
            L75:
                java.lang.String r1 = "download_percent"
                r9.put(r1, r3)     // Catch: java.lang.Throwable -> L100
                java.lang.String r1 = "download_status"
                int r2 = r8.v()     // Catch: java.lang.Throwable -> L100
                r9.put(r1, r2)     // Catch: java.lang.Throwable -> L100
                long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L100
                long r3 = r0.Q0()     // Catch: java.lang.Throwable -> L100
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 <= 0) goto L96
                java.lang.String r7 = "time_from_start_download"
                long r3 = r1 - r3
                r9.put(r7, r3)     // Catch: java.lang.Throwable -> L100
            L96:
                long r3 = r0.S()     // Catch: java.lang.Throwable -> L100
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 <= 0) goto La4
                java.lang.String r5 = "time_from_download_resume"
                long r1 = r1 - r3
                r9.put(r5, r1)     // Catch: java.lang.Throwable -> L100
            La4:
                java.lang.String r1 = "fail_status"
                int r2 = r0.T()     // Catch: java.lang.Throwable -> L100
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L100
                r9.putOpt(r1, r2)     // Catch: java.lang.Throwable -> L100
                java.lang.String r1 = "fail_msg"
                java.lang.String r2 = r0.C()     // Catch: java.lang.Throwable -> L100
                r9.putOpt(r1, r2)     // Catch: java.lang.Throwable -> L100
                java.lang.String r1 = "download_failed_times"
                int r0 = r0.T0()     // Catch: java.lang.Throwable -> L100
                r9.put(r1, r0)     // Catch: java.lang.Throwable -> L100
                java.lang.String r0 = "can_show_notification"
                boolean r1 = com.ss.android.socialbase.appdownloader.up.c.e()     // Catch: java.lang.Throwable -> L100
                if (r1 == 0) goto Lcd
                r1 = 1
                goto Lce
            Lcd:
                r1 = 2
            Lce:
                r9.put(r0, r1)     // Catch: java.lang.Throwable -> L100
                java.lang.String r0 = "first_speed_time"
                long r1 = r8.ch()     // Catch: java.lang.Throwable -> L100
                r9.put(r0, r1)     // Catch: java.lang.Throwable -> L100
                java.lang.String r0 = "all_connect_time"
                long r1 = r8.l()     // Catch: java.lang.Throwable -> L100
                r9.put(r0, r1)     // Catch: java.lang.Throwable -> L100
                java.lang.String r0 = "download_prepare_time"
                long r1 = r8.p()     // Catch: java.lang.Throwable -> L100
                r9.put(r0, r1)     // Catch: java.lang.Throwable -> L100
                java.lang.String r0 = "download_time"
                long r1 = r8.lx()     // Catch: java.lang.Throwable -> L100
                long r3 = r8.l()     // Catch: java.lang.Throwable -> L100
                long r1 = r1 + r3
                long r3 = r8.p()     // Catch: java.lang.Throwable -> L100
                long r1 = r1 + r3
                r9.put(r0, r1)     // Catch: java.lang.Throwable -> L100
                return
            L100:
                r8 = move-exception
                com.bytedance.sdk.component.utils.vl.j(r8)
                return
        }
    }

    public class j {
        private static java.util.Map<java.lang.String, com.ss.android.downloadlib.a.j.InterfaceC0191a> a;

        /* renamed from: com.ss.android.downloadlib.a$j$a, reason: collision with other inner class name */
        public interface InterfaceC0191a {
            void j();

            void j(java.lang.String r1);
        }

        static {
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
                com.ss.android.downloadlib.a.j.a = r0
                return
        }

        public j() {
                r1 = this;
                r1.<init>()
                return
        }

        private static com.ss.android.downloadlib.a.j.InterfaceC0191a a(java.lang.String r1) {
                boolean r0 = android.text.TextUtils.isEmpty(r1)
                if (r0 == 0) goto L8
                r1 = 0
                return r1
            L8:
                java.util.Map<java.lang.String, com.ss.android.downloadlib.a$j$a> r0 = com.ss.android.downloadlib.a.j.a
                java.lang.Object r1 = r0.remove(r1)
                com.ss.android.downloadlib.a$j$a r1 = (com.ss.android.downloadlib.a.j.InterfaceC0191a) r1
                return r1
        }

        public static void b(java.lang.String r1) {
                boolean r0 = android.text.TextUtils.isEmpty(r1)
                if (r0 == 0) goto L7
                goto Ld
            L7:
                com.ss.android.downloadlib.a$j$a r1 = a(r1)
                if (r1 != 0) goto Le
            Ld:
                return
            Le:
                r1.j()
                return
        }

        private static void c(java.lang.String r1, com.ss.android.downloadlib.a.j.InterfaceC0191a r2) {
                boolean r0 = android.text.TextUtils.isEmpty(r1)
                if (r0 != 0) goto Le
                if (r2 != 0) goto L9
                goto Le
            L9:
                java.util.Map<java.lang.String, com.ss.android.downloadlib.a$j$a> r0 = com.ss.android.downloadlib.a.j.a
                r0.put(r1, r2)
            Le:
                return
        }

        public static void d(java.lang.String r1, java.lang.String r2) {
                boolean r0 = android.text.TextUtils.isEmpty(r1)
                if (r0 == 0) goto L7
                goto Ld
            L7:
                com.ss.android.downloadlib.a$j$a r1 = a(r1)
                if (r1 != 0) goto Le
            Ld:
                return
            Le:
                r1.j(r2)
                return
        }

        public static void e(java.lang.String[] r2, com.ss.android.downloadlib.a.j.InterfaceC0191a r3) {
                if (r2 == 0) goto L14
                int r0 = r2.length
                if (r0 > 0) goto L6
                goto L14
            L6:
                long r0 = java.lang.System.currentTimeMillis()
                java.lang.String r0 = java.lang.String.valueOf(r0)
                c(r0, r3)
                com.ss.android.downloadlib.activity.TTDelegateActivity.s(r0, r2)
            L14:
                return
        }

        public static boolean f(java.lang.String r2) {
                v2.n r0 = com.ss.android.downloadlib.addownload.m.E()
                android.content.Context r1 = com.ss.android.downloadlib.addownload.m.getContext()
                boolean r2 = r0.j(r1, r2)
                return r2
        }
    }

    public class k {
        public k() {
                r1 = this;
                r1.<init>()
                return
        }

        public static void a(java.lang.String r0, java.lang.String r1, org.json.JSONObject r2) {
                com.ss.android.downloadlib.addownload.m.g()
                return
        }

        public static void b(java.lang.String r1) {
                r0 = 0
                a(r0, r1, r0)
                return
        }

        public static void c(java.lang.String r1, java.lang.String r2) {
                r0 = 0
                a(r1, r2, r0)
                return
        }

        public static void d(java.lang.String r0, java.lang.String r1, org.json.JSONObject r2) {
                com.ss.android.downloadlib.addownload.m.g()
                return
        }

        public static void e(java.lang.String r0, java.lang.String r1, org.json.JSONObject r2) {
                com.ss.android.downloadlib.addownload.m.g()
                return
        }
    }

    public class l {
        public l() {
                r1 = this;
                r1.<init>()
                return
        }

        public static java.lang.String a(java.lang.String r2, java.lang.String r3, boolean r4, java.lang.String r5) {
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>()
                java.lang.String r1 = "extra"
                r0.put(r1, r2)     // Catch: org.json.JSONException -> L16
                boolean r2 = android.text.TextUtils.isEmpty(r3)     // Catch: org.json.JSONException -> L16
                if (r2 != 0) goto L18
                java.lang.String r2 = "notification_jump_url"
                r0.put(r2, r3)     // Catch: org.json.JSONException -> L16
                goto L18
            L16:
                r2 = move-exception
                goto L23
            L18:
                java.lang.String r2 = "show_toast"
                r0.put(r2, r4)     // Catch: org.json.JSONException -> L16
                java.lang.String r2 = "business_type"
                r0.put(r2, r5)     // Catch: org.json.JSONException -> L16
                goto L26
            L23:
                com.bytedance.sdk.component.utils.vl.j(r2)
            L26:
                java.lang.String r2 = r0.toString()
                return r2
        }
    }

    public class m {
        private static final java.lang.String a = "a$m";

        /* renamed from: com.ss.android.downloadlib.a$m$a, reason: collision with other inner class name */
        static class RunnableC0192a implements java.lang.Runnable {
            RunnableC0192a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r7 = this;
                    v2.w r0 = com.ss.android.downloadlib.addownload.m.d()
                    android.content.Context r2 = com.ss.android.downloadlib.addownload.m.getContext()
                    r5 = 0
                    r6 = 0
                    r1 = 8
                    r3 = 0
                    java.lang.String r4 = "浏览器跳转失败，正在前往应用商店"
                    r0.j(r1, r2, r3, r4, r5, r6)
                    return
            }
        }

        static class b implements java.lang.Runnable {
            final /* synthetic */ android.content.Context a;
            final /* synthetic */ android.content.Intent b;

            b(android.content.Context r1, android.content.Intent r2) {
                    r0 = this;
                    r0.a = r1
                    r0.b = r2
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r2 = this;
                    android.content.Context r0 = r2.a
                    android.content.Intent r1 = r2.b
                    r0.startActivity(r1)
                    return
            }
        }

        static class c implements java.lang.Runnable {
            c() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r7 = this;
                    v2.w r0 = com.ss.android.downloadlib.addownload.m.d()
                    android.content.Context r2 = com.ss.android.downloadlib.addownload.m.getContext()
                    r5 = 0
                    r6 = 0
                    r1 = 12
                    r3 = 0
                    java.lang.String r4 = "正在前往浏览器下载"
                    r0.j(r1, r2, r3, r4, r5, r6)
                    return
            }
        }

        static class d implements java.lang.Runnable {
            final /* synthetic */ android.content.Context a;
            final /* synthetic */ android.content.Intent b;

            d(android.content.Context r1, android.content.Intent r2) {
                    r0 = this;
                    r0.a = r1
                    r0.b = r2
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r2 = this;
                    android.content.Context r0 = r2.a
                    android.content.Intent r1 = r2.b
                    r0.startActivity(r1)
                    return
            }
        }

        static class e implements java.lang.Runnable {
            final /* synthetic */ android.content.Context a;
            final /* synthetic */ java.lang.String b;
            final /* synthetic */ com.ss.android.downloadlib.addownload.o.i c;

            e(android.content.Context r1, java.lang.String r2, com.ss.android.downloadlib.addownload.o.i r3) {
                    r0 = this;
                    r0.a = r1
                    r0.b = r2
                    r0.c = r3
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r9 = this;
                    android.content.Context r0 = r9.a
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    java.lang.String r2 = "market://details?id="
                    r1.<init>(r2)
                    java.lang.String r3 = r9.b
                    r1.append(r3)
                    java.lang.String r1 = r1.toString()
                    android.net.Uri r1 = android.net.Uri.parse(r1)
                    com.ss.android.downloadlib.addownload.o$b r0 = com.ss.android.downloadlib.a.m.i(r0, r1)
                    com.ss.android.downloadlib.addownload.o$i r1 = r9.c
                    r3 = 1
                    com.ss.android.downloadlib.j.g.a(r0, r1, r3)
                    org.json.JSONObject r0 = new org.json.JSONObject
                    r0.<init>()
                    r1 = 2
                    org.json.JSONObject r4 = com.ss.android.downloadlib.addownload.m.f()     // Catch: java.lang.Throwable -> L85
                    java.lang.String r5 = "m2_delay_millis"
                    r6 = 1000(0x3e8, float:1.401E-42)
                    int r5 = r4.optInt(r5, r6)     // Catch: java.lang.Throwable -> L85
                    long r5 = (long) r5     // Catch: java.lang.Throwable -> L85
                    java.lang.Thread.sleep(r5)     // Catch: java.lang.Throwable -> L85
                    com.ss.android.downloadlib.j.j.a r5 = com.ss.android.downloadlib.j.j.a.c()     // Catch: java.lang.Throwable -> L85
                    android.content.Context r6 = r9.a     // Catch: java.lang.Throwable -> L85
                    r5.f(r6, r3)     // Catch: java.lang.Throwable -> L85
                    com.ss.android.downloadlib.j.j.xt r5 = new com.ss.android.downloadlib.j.j.xt     // Catch: java.lang.Throwable -> L85
                    r5.<init>()     // Catch: java.lang.Throwable -> L85
                    r5.a = r3     // Catch: java.lang.Throwable -> L85
                    r6 = 0
                    r5.b = r6     // Catch: java.lang.Throwable -> L85
                    java.lang.String r7 = "s"
                    java.lang.String r7 = r4.optString(r7)     // Catch: java.lang.Throwable -> L85
                    java.lang.String r8 = "v"
                    java.lang.String r4 = r4.optString(r8)     // Catch: java.lang.Throwable -> L85
                    java.lang.String r4 = com.ss.android.socialbase.appdownloader.m.a.b(r4, r7)     // Catch: java.lang.Throwable -> L85
                    java.lang.String r7 = r9.b     // Catch: java.lang.Throwable -> L85
                    java.lang.Object[] r8 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L85
                    r8[r6] = r7     // Catch: java.lang.Throwable -> L85
                    java.lang.String r7 = java.lang.String.format(r4, r8)     // Catch: java.lang.Throwable -> L85
                    r5.c = r7     // Catch: java.lang.Throwable -> L85
                    com.ss.android.downloadlib.j.j.a r7 = com.ss.android.downloadlib.j.j.a.c()     // Catch: java.lang.Throwable -> L85
                    r8 = 0
                    r7.d(r5, r8)     // Catch: java.lang.Throwable -> L85
                    com.ss.android.downloadlib.j.j.a r5 = com.ss.android.downloadlib.j.j.a.c()     // Catch: java.lang.Throwable -> L85
                    r5.h()     // Catch: java.lang.Throwable -> L85
                    com.ss.android.downloadlib.addownload.o$i r5 = r9.c     // Catch: java.lang.Throwable -> L85
                    java.lang.String r7 = r9.b     // Catch: java.lang.Throwable -> L85
                    java.lang.Object[] r8 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L85
                    r8[r6] = r7     // Catch: java.lang.Throwable -> L85
                    java.lang.String r4 = java.lang.String.format(r4, r8)     // Catch: java.lang.Throwable -> L85
                    r6 = -1
                    com.ss.android.downloadlib.a.m.y(r5, r0, r6, r1, r4)     // Catch: java.lang.Throwable -> L85
                    return
                L85:
                    r4 = move-exception
                    com.bytedance.sdk.component.utils.vl.j(r4)
                    com.ss.android.downloadlib.addownload.o$i r4 = r9.c
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder
                    r5.<init>(r2)
                    java.lang.String r2 = r9.b
                    r5.append(r2)
                    java.lang.String r2 = r5.toString()
                    com.ss.android.downloadlib.a.m.y(r4, r0, r3, r1, r2)
                    return
            }
        }

        static class f implements java.lang.Runnable {
            final /* synthetic */ java.lang.String a;
            final /* synthetic */ android.content.Context b;
            final /* synthetic */ com.ss.android.downloadlib.addownload.o.i c;

            /* renamed from: com.ss.android.downloadlib.a$m$f$a, reason: collision with other inner class name */
            class C0193a implements v2.q {
                final /* synthetic */ org.json.JSONObject a;
                final /* synthetic */ com.ss.android.downloadlib.a.m.f b;

                C0193a(com.ss.android.downloadlib.a.m.f r1, org.json.JSONObject r2) {
                        r0 = this;
                        r0.b = r1
                        r0.a = r2
                        r0.<init>()
                        return
                }

                public void j(java.lang.String r5) {
                        r4 = this;
                        boolean r0 = android.text.TextUtils.isEmpty(r5)
                        if (r0 != 0) goto L26
                        java.lang.String r5 = com.ss.android.downloadlib.a.m.q(r5)
                        boolean r0 = android.text.TextUtils.isEmpty(r5)
                        if (r0 != 0) goto L26
                        java.lang.String r5 = com.ss.android.downloadlib.a.m.L(r5)
                        boolean r0 = android.text.TextUtils.isEmpty(r5)
                        if (r0 != 0) goto L26
                        com.ss.android.downloadlib.a$m$f r0 = r4.b
                        android.content.Context r1 = r0.b
                        com.ss.android.downloadlib.addownload.o$i r2 = r0.c
                        java.lang.String r0 = r0.a
                        com.ss.android.downloadlib.a.m.u(r1, r2, r0, r5)
                        return
                    L26:
                        com.ss.android.downloadlib.a$m$f r5 = r4.b
                        android.content.Context r5 = r5.b
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        java.lang.String r1 = "market://details?id="
                        r0.<init>(r1)
                        com.ss.android.downloadlib.a$m$f r2 = r4.b
                        java.lang.String r2 = r2.a
                        r0.append(r2)
                        java.lang.String r0 = r0.toString()
                        android.net.Uri r0 = android.net.Uri.parse(r0)
                        com.ss.android.downloadlib.addownload.o$b r5 = com.ss.android.downloadlib.a.m.i(r5, r0)
                        com.ss.android.downloadlib.a$m$f r0 = r4.b
                        com.ss.android.downloadlib.addownload.o$i r0 = r0.c
                        r2 = 1
                        com.ss.android.downloadlib.j.g.a(r5, r0, r2)
                        com.ss.android.downloadlib.a$m$f r5 = r4.b
                        com.ss.android.downloadlib.addownload.o$i r5 = r5.c
                        org.json.JSONObject r0 = r4.a
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder
                        r2.<init>(r1)
                        com.ss.android.downloadlib.a$m$f r1 = r4.b
                        java.lang.String r1 = r1.a
                        r2.append(r1)
                        java.lang.String r1 = r2.toString()
                        r2 = 10
                        r3 = 9
                        com.ss.android.downloadlib.a.m.y(r5, r0, r2, r3, r1)
                        return
                }

                public void j(java.lang.Throwable r5) {
                        r4 = this;
                        com.ss.android.downloadlib.a$m$f r0 = r4.b
                        android.content.Context r0 = r0.b
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        java.lang.String r2 = "market://details?id="
                        r1.<init>(r2)
                        com.ss.android.downloadlib.a$m$f r3 = r4.b
                        java.lang.String r3 = r3.a
                        r1.append(r3)
                        java.lang.String r1 = r1.toString()
                        android.net.Uri r1 = android.net.Uri.parse(r1)
                        com.ss.android.downloadlib.addownload.o$b r0 = com.ss.android.downloadlib.a.m.i(r0, r1)
                        com.ss.android.downloadlib.a$m$f r1 = r4.b
                        com.ss.android.downloadlib.addownload.o$i r1 = r1.c
                        r3 = 1
                        com.ss.android.downloadlib.j.g.a(r0, r1, r3)
                        org.json.JSONObject r0 = r4.a
                        if (r5 == 0) goto L2f
                        java.lang.String r5 = r5.getMessage()
                        goto L31
                    L2f:
                        java.lang.String r5 = "null"
                    L31:
                        java.lang.String r1 = "ttdownloader_message"
                        com.ss.android.downloadlib.a.h.u(r0, r1, r5)
                        com.ss.android.downloadlib.a$m$f r5 = r4.b
                        com.ss.android.downloadlib.addownload.o$i r5 = r5.c
                        org.json.JSONObject r0 = r4.a
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>(r2)
                        com.ss.android.downloadlib.a$m$f r2 = r4.b
                        java.lang.String r2 = r2.a
                        r1.append(r2)
                        java.lang.String r1 = r1.toString()
                        r2 = 11
                        r3 = 9
                        com.ss.android.downloadlib.a.m.y(r5, r0, r2, r3, r1)
                        return
                }
            }

            f(java.lang.String r1, android.content.Context r2, com.ss.android.downloadlib.addownload.o.i r3) {
                    r0 = this;
                    r0.a = r1
                    r0.b = r2
                    r0.c = r3
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r6 = this;
                    org.json.JSONObject r0 = com.ss.android.downloadlib.addownload.m.f()
                    org.json.JSONObject r1 = new org.json.JSONObject
                    r1.<init>()
                    java.lang.String r2 = "s"
                    java.lang.String r2 = r0.optString(r2)     // Catch: java.lang.Exception -> L5d
                    java.lang.String r3 = "bw"
                    java.lang.String r3 = r0.optString(r3)     // Catch: java.lang.Exception -> L5d
                    java.lang.String r3 = com.ss.android.socialbase.appdownloader.m.a.b(r3, r2)     // Catch: java.lang.Exception -> L5d
                    java.lang.String r4 = "bx"
                    java.lang.String r4 = r0.optString(r4)     // Catch: java.lang.Exception -> L5d
                    java.lang.String r4 = com.ss.android.socialbase.appdownloader.m.a.b(r4, r2)     // Catch: java.lang.Exception -> L5d
                    java.lang.String r5 = "by"
                    java.lang.String r0 = r0.optString(r5)     // Catch: java.lang.Exception -> L5d
                    java.lang.String r0 = com.ss.android.socialbase.appdownloader.m.a.b(r0, r2)     // Catch: java.lang.Exception -> L5d
                    android.net.Uri$Builder r2 = new android.net.Uri$Builder     // Catch: java.lang.Exception -> L5d
                    r2.<init>()     // Catch: java.lang.Exception -> L5d
                    java.lang.String r5 = "https"
                    android.net.Uri$Builder r5 = r2.scheme(r5)     // Catch: java.lang.Exception -> L5d
                    android.net.Uri$Builder r3 = r5.authority(r3)     // Catch: java.lang.Exception -> L5d
                    android.net.Uri$Builder r3 = r3.appendPath(r4)     // Catch: java.lang.Exception -> L5d
                    java.lang.String r4 = r6.a     // Catch: java.lang.Exception -> L5d
                    r3.appendQueryParameter(r0, r4)     // Catch: java.lang.Exception -> L5d
                    v2.g r0 = com.ss.android.downloadlib.addownload.m.B()     // Catch: java.lang.Exception -> L5d
                    java.lang.String r3 = "GET"
                    android.net.Uri r2 = r2.build()     // Catch: java.lang.Exception -> L5d
                    java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L5d
                    com.ss.android.downloadlib.a$m$f$a r4 = new com.ss.android.downloadlib.a$m$f$a     // Catch: java.lang.Exception -> L5d
                    r4.<init>(r6, r1)     // Catch: java.lang.Exception -> L5d
                    r5 = 0
                    r0.j(r3, r2, r5, r4)     // Catch: java.lang.Exception -> L5d
                    return
                L5d:
                    r0 = move-exception
                    com.bytedance.sdk.component.utils.vl.j(r0)
                    com.ss.android.downloadlib.addownload.o$i r0 = r6.c
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    java.lang.String r3 = "market://details?id="
                    r2.<init>(r3)
                    java.lang.String r3 = r6.a
                    r2.append(r3)
                    java.lang.String r2 = r2.toString()
                    r3 = 4
                    r4 = 9
                    com.ss.android.downloadlib.a.m.y(r0, r1, r3, r4, r2)
                    return
            }
        }

        static class g implements java.lang.Runnable {
            final /* synthetic */ java.lang.String a;
            final /* synthetic */ android.content.Context b;
            final /* synthetic */ com.ss.android.downloadlib.addownload.o.i c;

            /* renamed from: com.ss.android.downloadlib.a$m$g$a, reason: collision with other inner class name */
            class C0194a implements v2.q {
                final /* synthetic */ org.json.JSONObject a;
                final /* synthetic */ com.ss.android.downloadlib.a.m.g b;

                C0194a(com.ss.android.downloadlib.a.m.g r1, org.json.JSONObject r2) {
                        r0 = this;
                        r0.b = r1
                        r0.a = r2
                        r0.<init>()
                        return
                }

                public void j(java.lang.String r5) {
                        r4 = this;
                        com.ss.android.downloadlib.a$m$g r0 = r4.b
                        android.content.Context r1 = r0.b
                        java.lang.String r2 = r0.a
                        com.ss.android.downloadlib.addownload.o$i r0 = r0.c
                        org.json.JSONObject r3 = r4.a
                        com.ss.android.downloadlib.a.m.x(r1, r2, r5, r0, r3)
                        return
                }

                public void j(java.lang.Throwable r5) {
                        r4 = this;
                        com.ss.android.downloadlib.a$m$g r0 = r4.b
                        android.content.Context r0 = r0.b
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        java.lang.String r2 = "market://details?id="
                        r1.<init>(r2)
                        com.ss.android.downloadlib.a$m$g r3 = r4.b
                        java.lang.String r3 = r3.a
                        r1.append(r3)
                        java.lang.String r1 = r1.toString()
                        android.net.Uri r1 = android.net.Uri.parse(r1)
                        com.ss.android.downloadlib.addownload.o$b r0 = com.ss.android.downloadlib.a.m.i(r0, r1)
                        com.ss.android.downloadlib.a$m$g r1 = r4.b
                        com.ss.android.downloadlib.addownload.o$i r1 = r1.c
                        r3 = 1
                        com.ss.android.downloadlib.j.g.a(r0, r1, r3)
                        org.json.JSONObject r0 = r4.a
                        if (r5 == 0) goto L2f
                        java.lang.String r5 = r5.getMessage()
                        goto L31
                    L2f:
                        java.lang.String r5 = "null"
                    L31:
                        java.lang.String r1 = "ttdownloader_message"
                        com.ss.android.downloadlib.a.h.u(r0, r1, r5)
                        com.ss.android.downloadlib.a$m$g r5 = r4.b
                        com.ss.android.downloadlib.addownload.o$i r5 = r5.c
                        org.json.JSONObject r0 = r4.a
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>(r2)
                        com.ss.android.downloadlib.a$m$g r2 = r4.b
                        java.lang.String r2 = r2.a
                        r1.append(r2)
                        java.lang.String r1 = r1.toString()
                        r2 = 7
                        r3 = 5
                        com.ss.android.downloadlib.a.m.y(r5, r0, r2, r3, r1)
                        return
                }
            }

            g(java.lang.String r1, android.content.Context r2, com.ss.android.downloadlib.addownload.o.i r3) {
                    r0 = this;
                    r0.a = r1
                    r0.b = r2
                    r0.c = r3
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r9 = this;
                    org.json.JSONObject r0 = com.ss.android.downloadlib.addownload.m.f()
                    java.lang.String r1 = "s"
                    java.lang.String r1 = r0.optString(r1)
                    org.json.JSONObject r2 = new org.json.JSONObject
                    r2.<init>()
                    java.lang.String r3 = "x"
                    java.lang.String r0 = r0.optString(r3)
                    java.lang.String r4 = com.ss.android.socialbase.appdownloader.m.a.b(r0, r1)
                    org.json.JSONObject r0 = new org.json.JSONObject
                    r0.<init>()
                    java.lang.String r1 = "t"
                    java.lang.String r3 = "v"
                    com.ss.android.downloadlib.a.h.u(r0, r1, r3)
                    java.lang.String r1 = "p"
                    java.lang.String r3 = r9.a
                    com.ss.android.downloadlib.a.h.u(r0, r1, r3)
                    java.lang.String r0 = r0.toString()
                    byte[] r0 = r0.getBytes()
                    v2.k r1 = com.ss.android.downloadlib.addownload.m.H()
                    int r3 = r0.length
                    byte[] r5 = r1.j(r0, r3)
                    v2.g r3 = com.ss.android.downloadlib.addownload.m.B()
                    com.ss.android.downloadlib.a$m$g$a r8 = new com.ss.android.downloadlib.a$m$g$a
                    r8.<init>(r9, r2)
                    java.lang.String r6 = "application/octet-stream;tt-data=a"
                    r7 = 0
                    r3.j(r4, r5, r6, r7, r8)
                    return
            }
        }

        static {
                return
        }

        public m() {
                r0 = this;
                r0.<init>()
                return
        }

        private static boolean A(@androidx.annotation.NonNull android.app.Activity r3, @androidx.annotation.NonNull java.lang.String r4, @androidx.annotation.NonNull java.util.HashMap<java.lang.String, java.lang.String> r5) {
                android.content.Intent r0 = new android.content.Intent
                java.lang.String r1 = "android.intent.action.VIEW"
                r0.<init>(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "market://details?id="
                r1.<init>(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                android.net.Uri r4 = android.net.Uri.parse(r4)
                r0.setData(r4)
                java.lang.String r4 = "start_only_for_android"
                r1 = 1
                r0.putExtra(r4, r1)
                java.lang.String r4 = "param"
                r0.putExtra(r4, r5)
                java.lang.String r4 = com.ss.android.socialbase.appdownloader.m.e.m()
                android.content.Context r5 = com.ss.android.downloadlib.addownload.m.getContext()
                boolean r5 = com.ss.android.downloadlib.a.h.G(r5, r4)
                if (r5 == 0) goto L38
                r0.setPackage(r4)
            L38:
                android.content.Context r4 = com.ss.android.downloadlib.addownload.m.getContext()
                boolean r4 = com.ss.android.downloadlib.a.h.x(r4, r0)
                if (r4 == 0) goto L50
                r3.startActivity(r0)     // Catch: java.lang.Exception -> L46
                return r1
            L46:
                r3 = move-exception
                com.ss.android.downloadlib.up.a r4 = com.ss.android.downloadlib.up.a.a()
                java.lang.String r5 = "start v1"
                r4.j(r3, r5)
            L50:
                r3 = 0
                return r3
        }

        public static boolean B(android.content.Context r4, com.ss.android.downloadlib.addownload.o.i r5, java.lang.String r6, org.json.JSONObject r7, boolean r8, int r9) {
                int r0 = r5.kt()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                java.lang.String r1 = "download_scene"
                com.ss.android.downloadlib.a.h.u(r7, r1, r0)
                com.ss.android.downloadlib.r.b r0 = com.ss.android.downloadlib.r.b.a()
                java.lang.String r2 = "market_click_open"
                r0.x(r2, r7, r5)
                android.net.Uri r6 = android.net.Uri.parse(r6)
                com.ss.android.downloadlib.addownload.o$b r4 = i(r4, r6)
                java.lang.String r6 = r4.b()
                java.lang.String r0 = "open_market"
                java.lang.String[] r6 = new java.lang.String[]{r6, r0}
                java.lang.String r6 = com.ss.android.downloadlib.a.h.q(r6)
                int r0 = r4.getType()
                r2 = 5
                r3 = 1
                if (r0 == r2) goto L5e
                r6 = 6
                r2 = 0
                if (r0 == r6) goto L3c
                r4 = 7
                if (r0 == r4) goto L61
                return r2
            L3c:
                int r4 = r4.a()
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                java.lang.String r6 = "error_code"
                com.ss.android.downloadlib.a.h.u(r7, r6, r4)
                int r4 = r5.kt()
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                com.ss.android.downloadlib.a.h.u(r7, r1, r4)
                com.ss.android.downloadlib.r.b r4 = com.ss.android.downloadlib.r.b.a()
                java.lang.String r6 = "market_open_failed"
                r4.x(r6, r7, r5)
                return r2
            L5e:
                com.ss.android.downloadlib.j.g.d(r6, r7, r5, r3)
            L61:
                if (r8 == 0) goto L6c
                com.ss.android.downloadlib.r.b r4 = com.ss.android.downloadlib.r.b.a()
                long r5 = r5.a
                r4.c(r5, r9)
            L6c:
                return r3
        }

        private static void C(android.content.Context r2, com.ss.android.downloadlib.addownload.o.i r3, java.lang.String r4) {
                com.ss.android.downloadlib.e r0 = com.ss.android.downloadlib.e.c()
                com.ss.android.downloadlib.a$m$f r1 = new com.ss.android.downloadlib.a$m$f
                r1.<init>(r4, r2, r3)
                r0.d(r1)
                return
        }

        private static com.ss.android.downloadlib.addownload.o.b D(android.content.Context r6, com.ss.android.downloadlib.addownload.o.i r7, java.lang.String r8) {
                android.content.Intent r0 = new android.content.Intent
                java.lang.Class<com.ss.android.downloadlib.activity.JumpKllkActivity> r1 = com.ss.android.downloadlib.activity.JumpKllkActivity.class
                r0.<init>(r6, r1)
                r1 = 268435456(0x10000000, float:2.524355E-29)
                r0.addFlags(r1)
                java.lang.String r1 = "dl"
                r2 = 1
                r0.putExtra(r1, r2)
                java.lang.String r1 = "p"
                r0.putExtra(r1, r8)
                java.lang.String r1 = "id"
                long r3 = r7.a
                r0.putExtra(r1, r3)
                int r1 = android.os.Build.VERSION.SDK_INT
                r3 = 29
                java.lang.String r4 = "market://details?id="
                java.lang.String r5 = "bk"
                if (r1 < r3) goto L2e
                java.lang.String r1 = "com.heytap.browser"
                r0.putExtra(r5, r1)
                goto L45
            L2e:
                java.lang.String r1 = "com.android.browser"
                boolean r3 = com.ss.android.downloadlib.a.h.G(r6, r1)
                if (r3 == 0) goto L3a
                r0.putExtra(r5, r1)
                goto L45
            L3a:
                java.lang.String r1 = "com.coloros.browser"
                boolean r3 = com.ss.android.downloadlib.a.h.G(r6, r1)
                if (r3 == 0) goto L80
                r0.putExtra(r5, r1)
            L45:
                java.lang.String r1 = "start_only_for_android"
                r0.putExtra(r1, r2)
                org.json.JSONObject r1 = new org.json.JSONObject
                r1.<init>()
                r6.startActivity(r0)     // Catch: java.lang.Throwable -> L5b
                com.ss.android.downloadlib.addownload.o$b r0 = new com.ss.android.downloadlib.addownload.o$b     // Catch: java.lang.Throwable -> L5b
                java.lang.String r3 = "am_kllk3"
                r5 = 7
                r0.<init>(r5, r3)     // Catch: java.lang.Throwable -> L5b
                return r0
            L5b:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>(r4)
                r0.append(r8)
                java.lang.String r0 = r0.toString()
                r3 = 3
                Q(r7, r1, r2, r3, r0)
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>(r4)
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                android.net.Uri r7 = android.net.Uri.parse(r7)
                com.ss.android.downloadlib.addownload.o$b r6 = i(r6, r7)
                return r6
            L80:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>(r4)
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                android.net.Uri r7 = android.net.Uri.parse(r7)
                com.ss.android.downloadlib.addownload.o$b r6 = i(r6, r7)
                return r6
        }

        private static com.ss.android.downloadlib.addownload.o.b E(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.NonNull java.lang.String r4) {
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3a
                java.lang.String r1 = "https://www.samsungapps.com/appquery/appDetail.as?appId="
                r0.<init>(r1)     // Catch: java.lang.Exception -> L3a
                r0.append(r4)     // Catch: java.lang.Exception -> L3a
                java.lang.String r4 = r0.toString()     // Catch: java.lang.Exception -> L3a
                android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch: java.lang.Exception -> L3a
                android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Exception -> L3a
                r0.<init>()     // Catch: java.lang.Exception -> L3a
                java.lang.String r1 = "com.sec.android.app.samsungapps"
                java.lang.String r2 = "com.sec.android.app.samsungapps.Main"
                r0.setClassName(r1, r2)     // Catch: java.lang.Exception -> L3a
                r0.setData(r4)     // Catch: java.lang.Exception -> L3a
                boolean r4 = r3 instanceof android.app.Activity     // Catch: java.lang.Exception -> L3a
                if (r4 != 0) goto L2a
                r4 = 268435456(0x10000000, float:2.524355E-29)
                r0.addFlags(r4)     // Catch: java.lang.Exception -> L3a
            L2a:
                java.lang.String r4 = "start_only_for_android"
                r1 = 1
                r0.putExtra(r4, r1)     // Catch: java.lang.Exception -> L3a
                r3.startActivity(r0)     // Catch: java.lang.Exception -> L3a
                com.ss.android.downloadlib.addownload.o$b r3 = new com.ss.android.downloadlib.addownload.o$b     // Catch: java.lang.Exception -> L3a
                r4 = 5
                r3.<init>(r4)     // Catch: java.lang.Exception -> L3a
                return r3
            L3a:
                com.ss.android.downloadlib.addownload.o$b r3 = new com.ss.android.downloadlib.addownload.o$b
                r4 = 6
                r0 = 14
                r3.<init>(r4, r0)
                return r3
        }

        private static java.lang.String F(java.lang.String r1) {
                android.net.Uri r1 = android.net.Uri.parse(r1)
                java.util.List r1 = r1.getPathSegments()
                int r0 = r1.size()
                if (r0 <= 0) goto L1b
                int r0 = r1.size()
                int r0 = r0 + (-1)
                java.lang.Object r1 = r1.get(r0)
                java.lang.String r1 = (java.lang.String) r1
                return r1
            L1b:
                r1 = 0
                return r1
        }

        private static void G(android.content.Context r2, com.ss.android.downloadlib.addownload.o.i r3, java.lang.String r4) {
                com.ss.android.downloadlib.e r0 = com.ss.android.downloadlib.e.c()
                com.ss.android.downloadlib.a$m$g r1 = new com.ss.android.downloadlib.a$m$g
                r1.<init>(r4, r2, r3)
                r0.d(r1)
                return
        }

        private static void H(android.content.Context r2, com.ss.android.downloadlib.addownload.o.i r3, java.lang.String r4) {
                com.ss.android.downloadlib.e r0 = com.ss.android.downloadlib.e.c()
                com.ss.android.downloadlib.a$m$e r1 = new com.ss.android.downloadlib.a$m$e
                r1.<init>(r2, r4, r3)
                r0.d(r1)
                return
        }

        private static com.ss.android.downloadlib.addownload.o.b I(android.content.Context r5, com.ss.android.downloadlib.addownload.o.i r6, java.lang.String r7) {
                android.content.Intent r0 = new android.content.Intent
                java.lang.Class<com.ss.android.downloadlib.activity.JumpKllkActivity> r1 = com.ss.android.downloadlib.activity.JumpKllkActivity.class
                r0.<init>(r5, r1)
                r1 = 268435456(0x10000000, float:2.524355E-29)
                r0.addFlags(r1)
                java.lang.String r1 = "p"
                r0.putExtra(r1, r7)
                java.lang.String r1 = "id"
                long r2 = r6.a
                r0.putExtra(r1, r2)
                java.lang.String r1 = "start_only_for_android"
                r2 = 1
                r0.putExtra(r1, r2)
                org.json.JSONObject r1 = new org.json.JSONObject
                r1.<init>()
                r5.startActivity(r0)     // Catch: java.lang.Throwable -> L2f
                com.ss.android.downloadlib.addownload.o$b r0 = new com.ss.android.downloadlib.addownload.o$b     // Catch: java.lang.Throwable -> L2f
                java.lang.String r3 = "am_kllk2"
                r4 = 7
                r0.<init>(r4, r3)     // Catch: java.lang.Throwable -> L2f
                return r0
            L2f:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r3 = "market://details?id="
                r0.<init>(r3)
                r0.append(r7)
                java.lang.String r0 = r0.toString()
                r4 = 3
                Q(r6, r1, r2, r4, r0)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>(r3)
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                android.net.Uri r6 = android.net.Uri.parse(r6)
                com.ss.android.downloadlib.addownload.o$b r5 = i(r5, r6)
                return r5
        }

        static com.ss.android.downloadlib.addownload.o.b J(android.content.Context r3, java.lang.String r4) {
                boolean r0 = android.text.TextUtils.isEmpty(r4)
                r1 = 4
                if (r0 == 0) goto Lf
                com.ss.android.downloadlib.addownload.o$b r3 = new com.ss.android.downloadlib.addownload.o$b
                r4 = 11
                r3.<init>(r1, r4)
                return r3
            Lf:
                if (r3 != 0) goto L15
                android.content.Context r3 = com.ss.android.downloadlib.addownload.m.getContext()
            L15:
                android.content.Intent r4 = com.ss.android.downloadlib.a.h.a(r3, r4)
                if (r4 != 0) goto L23
                com.ss.android.downloadlib.addownload.o$b r3 = new com.ss.android.downloadlib.addownload.o$b
                r4 = 22
                r3.<init>(r1, r4)
                return r3
            L23:
                java.lang.String r0 = "start_only_for_android"
                r2 = 1
                r4.putExtra(r0, r2)
                r3.startActivity(r4)     // Catch: java.lang.Exception -> L33
                com.ss.android.downloadlib.addownload.o$b r3 = new com.ss.android.downloadlib.addownload.o$b
                r4 = 3
                r3.<init>(r4)
                return r3
            L33:
                com.ss.android.downloadlib.addownload.o$b r3 = new com.ss.android.downloadlib.addownload.o$b
                r4 = 23
                r3.<init>(r1, r4)
                return r3
        }

        static com.ss.android.downloadlib.addownload.o.b K(java.lang.String r8, com.ss.android.xt.j.xt.a r9) {
                boolean r0 = android.text.TextUtils.isEmpty(r8)
                r1 = 2
                if (r0 == 0) goto Lf
                com.ss.android.downloadlib.addownload.o$b r8 = new com.ss.android.downloadlib.addownload.o$b
                r9 = 21
                r8.<init>(r1, r9)
                return r8
            Lf:
                android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
                com.ss.android.j.j.cw.b r2 = r9.tj()
                java.lang.String r2 = r2.s()
                boolean r3 = android.text.TextUtils.isEmpty(r2)
                r4 = 1
                if (r3 != 0) goto L40
                com.ss.android.downloadlib.a$o r3 = com.ss.android.downloadlib.a.o.a()
                java.lang.String r5 = com.ss.android.downloadlib.a.m.a
                java.lang.String r6 = "tryOpenByUrl"
                java.lang.String r7 = "获取到跳转中转Activity的intent"
                r3.b(r5, r6, r7)
                android.content.Intent r1 = g(r0, r9, r2, r1, r8)
                if (r1 == 0) goto L40
                com.ss.android.downloadlib.addownload.o$b r1 = h(r0, r1, r9, r4, r8)
                int r2 = r1.getType()
                if (r2 != r4) goto L40
                return r1
            L40:
                android.net.Uri r1 = android.net.Uri.parse(r8)
                android.content.Intent r2 = new android.content.Intent
                java.lang.String r3 = "android.intent.action.VIEW"
                r2.<init>(r3)
                r2.setData(r1)
                r1 = 268435456(0x10000000, float:2.524355E-29)
                r2.addFlags(r1)
                java.lang.String r1 = "open_url"
                r2.putExtra(r1, r8)
                java.lang.String r1 = "start_only_for_android"
                r2.putExtra(r1, r4)
                com.ss.android.socialbase.downloader.jy.j r1 = com.ss.android.socialbase.downloader.jy.j.cw()
                java.lang.String r3 = "fix_app_link_flag"
                boolean r1 = r1.j(r3)
                if (r1 == 0) goto L6e
                r1 = 67108864(0x4000000, float:1.5046328E-36)
                r2.addFlags(r1)
            L6e:
                r1 = 0
                com.ss.android.downloadlib.addownload.o$b r8 = h(r0, r2, r9, r1, r8)
                return r8
        }

        static /* synthetic */ java.lang.String L(java.lang.String r0) {
                java.lang.String r0 = F(r0)
                return r0
        }

        public static void M(@androidx.annotation.NonNull android.app.Activity r6, java.lang.String r7, long r8) {
                com.ss.android.downloadlib.addownload.o$f r0 = com.ss.android.downloadlib.addownload.o.f.c()
                com.ss.android.downloadlib.addownload.o$i r8 = r0.r(r8)
                org.json.JSONObject r9 = new org.json.JSONObject
                r9.<init>()
                com.ss.android.j.j.cw.c r0 = r8.d
                com.ss.android.xt.j.j.b r0 = (com.ss.android.xt.j.j.b) r0
                boolean r0 = r0.b()
                java.util.HashMap r1 = new java.util.HashMap
                r1.<init>()
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
                java.lang.String r3 = "is_button"
                r1.put(r3, r2)
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                com.ss.android.downloadlib.a.h.u(r9, r3, r0)
                com.ss.android.j.j.cw.c r0 = r8.d
                com.ss.android.xt.j.j.b r0 = (com.ss.android.xt.j.j.b) r0
                v2.r r0 = r0.h()
                java.util.Map r0 = r0.j(r1)
                r1 = 1
                r2 = 11
                java.lang.String r3 = "market://details?id="
                if (r0 == 0) goto L69
                java.lang.String r4 = "convert_result"
                java.lang.Object r5 = r0.get(r4)
                if (r5 == 0) goto L69
                java.lang.Object r0 = r0.get(r4)
                java.lang.String r0 = r0.toString()
                boolean r0 = java.lang.Boolean.parseBoolean(r0)
                if (r0 == 0) goto L69
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>(r3)
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                r7 = -1
                Q(r8, r9, r7, r2, r6)
                java.lang.String r6 = "am_kllk4"
                com.ss.android.downloadlib.j.g.d(r6, r9, r8, r1)
                return
            L69:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>(r3)
                r0.append(r7)
                java.lang.String r0 = r0.toString()
                r4 = 15
                Q(r8, r9, r4, r2, r0)
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>(r3)
                r9.append(r7)
                java.lang.String r7 = r9.toString()
                android.net.Uri r7 = android.net.Uri.parse(r7)
                com.ss.android.downloadlib.addownload.o$b r6 = i(r6, r7)
                com.ss.android.downloadlib.j.g.a(r6, r8, r1)
                return
        }

        public static void N(@androidx.annotation.NonNull android.app.Activity r6, java.lang.String r7, long r8, java.lang.String r10) {
                com.ss.android.downloadlib.addownload.o$f r0 = com.ss.android.downloadlib.addownload.o.f.c()
                com.ss.android.downloadlib.addownload.o$i r8 = r0.r(r8)
                org.json.JSONObject r9 = new org.json.JSONObject
                r9.<init>()
                org.json.JSONObject r0 = com.ss.android.downloadlib.addownload.m.f()
                java.lang.String r1 = "s"
                java.lang.String r1 = r0.optString(r1)
                java.lang.String r2 = "bz"
                java.lang.String r2 = r0.optString(r2)
                java.lang.String r2 = com.ss.android.socialbase.appdownloader.m.a.b(r2, r1)
                java.lang.String r3 = "ca"
                java.lang.String r3 = r0.optString(r3)
                java.lang.String r3 = com.ss.android.socialbase.appdownloader.m.a.b(r3, r1)
                java.lang.String r4 = "cb"
                java.lang.String r0 = r0.optString(r4)
                java.lang.String r0 = com.ss.android.socialbase.appdownloader.m.a.b(r0, r1)
                android.net.Uri$Builder r1 = new android.net.Uri$Builder
                r1.<init>()
                java.lang.String r4 = "hiapplink"
                android.net.Uri$Builder r4 = r1.scheme(r4)
                java.lang.String r5 = "com.huawei.appmarket"
                r4.authority(r5)
                boolean r4 = android.text.TextUtils.isEmpty(r2)
                if (r4 != 0) goto L4e
                r1.appendQueryParameter(r2, r10)
            L4e:
                boolean r10 = android.text.TextUtils.isEmpty(r3)
                if (r10 != 0) goto L5d
                boolean r10 = android.text.TextUtils.isEmpty(r0)
                if (r10 != 0) goto L5d
                r1.appendQueryParameter(r3, r0)
            L5d:
                android.net.Uri r10 = r1.build()
                boolean r10 = R(r6, r10)
                r0 = 1
                r1 = 9
                java.lang.String r2 = "market://details?id="
                if (r10 == 0) goto L82
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>(r2)
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                r7 = -1
                Q(r8, r9, r7, r1, r6)
                java.lang.String r6 = "am_hr"
                com.ss.android.downloadlib.j.g.d(r6, r9, r8, r0)
                return
            L82:
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>(r2)
                r10.append(r7)
                java.lang.String r10 = r10.toString()
                r3 = 2
                Q(r8, r9, r3, r1, r10)
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>(r2)
                r9.append(r7)
                java.lang.String r7 = r9.toString()
                android.net.Uri r7 = android.net.Uri.parse(r7)
                com.ss.android.downloadlib.addownload.o$b r6 = i(r6, r7)
                com.ss.android.downloadlib.j.g.a(r6, r8, r0)
                return
        }

        private static void O(android.content.Context r3, @androidx.annotation.NonNull com.ss.android.downloadlib.addownload.o.i r4, @androidx.annotation.NonNull java.lang.String r5, @androidx.annotation.NonNull java.lang.String r6) {
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>()
                long r1 = r4.a     // Catch: java.lang.Exception -> Lb
                com.ss.android.downloadlib.activity.TTDelegateActivity.z(r5, r1, r6)     // Catch: java.lang.Exception -> Lb
                return
            Lb:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                java.lang.String r1 = "market://details?id="
                r6.<init>(r1)
                r6.append(r5)
                java.lang.String r6 = r6.toString()
                android.net.Uri r6 = android.net.Uri.parse(r6)
                com.ss.android.downloadlib.addownload.o$b r3 = i(r3, r6)
                r6 = 1
                com.ss.android.downloadlib.j.g.a(r3, r4, r6)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>(r1)
                r3.append(r5)
                java.lang.String r3 = r3.toString()
                r5 = 12
                r6 = 9
                Q(r4, r0, r5, r6, r3)
                return
        }

        private static void P(android.content.Context r5, java.lang.String r6, java.lang.String r7, @androidx.annotation.NonNull com.ss.android.downloadlib.addownload.o.i r8, @androidx.annotation.NonNull org.json.JSONObject r9) {
                java.lang.String r0 = "market://details?id="
                r1 = 5
                java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
                java.lang.String r3 = "ttdownloader_type"
                com.ss.android.downloadlib.a.h.u(r9, r3, r2)
                r2 = 1
                org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L4f
                r3.<init>(r7)     // Catch: java.lang.Exception -> L4f
                java.lang.String r7 = "a"
                java.lang.String r7 = r3.optString(r7)     // Catch: java.lang.Exception -> L4f
                java.lang.String r7 = com.ss.android.socialbase.appdownloader.m.a.a(r7)     // Catch: java.lang.Exception -> L4f
                boolean r3 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Exception -> L4f
                if (r3 != 0) goto L28
                long r3 = r8.a     // Catch: java.lang.Exception -> L4f
                com.ss.android.downloadlib.activity.TTDelegateActivity.q(r6, r3, r7, r9)     // Catch: java.lang.Exception -> L4f
                return
            L28:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L4f
                r7.<init>(r0)     // Catch: java.lang.Exception -> L4f
                r7.append(r6)     // Catch: java.lang.Exception -> L4f
                java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> L4f
                android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch: java.lang.Exception -> L4f
                com.ss.android.downloadlib.addownload.o$b r7 = i(r5, r7)     // Catch: java.lang.Exception -> L4f
                com.ss.android.downloadlib.j.g.a(r7, r8, r2)     // Catch: java.lang.Exception -> L4f
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L4f
                r7.<init>(r0)     // Catch: java.lang.Exception -> L4f
                r7.append(r6)     // Catch: java.lang.Exception -> L4f
                java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> L4f
                Q(r8, r9, r1, r1, r7)     // Catch: java.lang.Exception -> L4f
                return
            L4f:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>(r0)
                r7.append(r6)
                java.lang.String r7 = r7.toString()
                android.net.Uri r7 = android.net.Uri.parse(r7)
                com.ss.android.downloadlib.addownload.o$b r5 = i(r5, r7)
                com.ss.android.downloadlib.j.g.a(r5, r8, r2)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>(r0)
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                r6 = 6
                Q(r8, r9, r6, r1, r5)
                return
        }

        private static void Q(com.ss.android.downloadlib.addownload.o.i r1, org.json.JSONObject r2, int r3, int r4, java.lang.String r5) {
                java.lang.String r0 = "error_code"
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                com.ss.android.downloadlib.a.h.u(r2, r0, r3)
                java.lang.String r3 = "ttdownloader_type"
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                com.ss.android.downloadlib.a.h.u(r2, r3, r4)
                java.lang.String r3 = "rmu"
                com.ss.android.downloadlib.a.h.u(r2, r3, r5)
                java.lang.String r3 = com.ss.android.socialbase.appdownloader.m.e.m()
                android.content.Context r4 = com.ss.android.downloadlib.addownload.m.getContext()
                java.lang.String r5 = com.ss.android.socialbase.appdownloader.m.e.m()
                int r4 = com.ss.android.downloadlib.a.h.H(r4, r5)
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                com.ss.android.downloadlib.a.h.u(r2, r3, r4)
                com.ss.android.downloadlib.r.b r3 = com.ss.android.downloadlib.r.b.a()
                java.lang.String r4 = "am_result"
                r3.x(r4, r2, r1)
                return
        }

        public static boolean R(@androidx.annotation.NonNull android.app.Activity r3, android.net.Uri r4) {
                android.content.Intent r0 = new android.content.Intent
                java.lang.String r1 = "android.intent.action.VIEW"
                r0.<init>(r1)
                r0.setData(r4)
                java.lang.String r4 = "start_only_for_android"
                r1 = 1
                r0.putExtra(r4, r1)
                java.lang.String r4 = com.ss.android.socialbase.appdownloader.m.e.m()
                android.content.Context r2 = com.ss.android.downloadlib.addownload.m.getContext()
                boolean r2 = com.ss.android.downloadlib.a.h.G(r2, r4)
                if (r2 == 0) goto L21
                r0.setPackage(r4)
            L21:
                android.content.Context r4 = com.ss.android.downloadlib.addownload.m.getContext()
                boolean r4 = com.ss.android.downloadlib.a.h.x(r4, r0)
                if (r4 == 0) goto L39
                r3.startActivity(r0)     // Catch: java.lang.Exception -> L2f
                return r1
            L2f:
                r3 = move-exception
                com.ss.android.downloadlib.up.a r4 = com.ss.android.downloadlib.up.a.a()
                java.lang.String r0 = "start HM1"
                r4.j(r3, r0)
            L39:
                r3 = 0
                return r3
        }

        private static void a(android.content.Context r3, com.ss.android.downloadlib.addownload.o.i r4, java.lang.String r5) {
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>()
                long r1 = r4.a     // Catch: java.lang.Exception -> Lb
                com.ss.android.downloadlib.activity.TTDelegateActivity.o(r5, r1)     // Catch: java.lang.Exception -> Lb
                return
            Lb:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "market://details?id="
                r1.<init>(r2)
                r1.append(r5)
                java.lang.String r1 = r1.toString()
                android.net.Uri r1 = android.net.Uri.parse(r1)
                com.ss.android.downloadlib.addownload.o$b r3 = i(r3, r1)
                r1 = 1
                com.ss.android.downloadlib.j.g.a(r3, r4, r1)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>(r2)
                r3.append(r5)
                java.lang.String r3 = r3.toString()
                r5 = 13
                r1 = 10
                Q(r4, r0, r5, r1, r3)
                return
        }

        private static java.lang.String b(java.lang.String r9) {
                java.lang.String r0 = "<input[\\s\\S]*>\\n"
                java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
                java.util.regex.Matcher r9 = r0.matcher(r9)
                boolean r0 = r9.find()
                if (r0 == 0) goto L15
                java.lang.String r9 = r9.group()
                goto L17
            L15:
                java.lang.String r9 = ""
            L17:
                r0 = 0
                boolean r1 = r9.equals(r0)
                if (r1 != 0) goto L5f
                int r1 = r9.length()
                if (r1 <= 0) goto L5f
                java.lang.String r1 = "\\n"
                java.lang.String[] r9 = r9.split(r1)
                int r1 = r9.length
                r2 = 0
                r3 = 0
            L2d:
                if (r3 >= r1) goto L5f
                r4 = r9[r3]
                java.lang.String r5 = "<input"
                boolean r5 = r4.startsWith(r5)
                if (r5 == 0) goto L5c
                java.lang.String r5 = "\\s"
                java.lang.String[] r4 = r4.split(r5)
                int r5 = r4.length
                r6 = 0
            L41:
                if (r6 >= r5) goto L5c
                r7 = r4[r6]
                java.lang.String r8 = "value"
                boolean r8 = r7.startsWith(r8)
                if (r8 == 0) goto L59
                int r9 = r7.length()
                int r9 = r9 + (-1)
                r0 = 7
                java.lang.String r9 = r7.substring(r0, r9)
                return r9
            L59:
                int r6 = r6 + 1
                goto L41
            L5c:
                int r3 = r3 + 1
                goto L2d
            L5f:
                return r0
        }

        private static void c(android.content.Context r3, com.ss.android.downloadlib.addownload.o.i r4, java.lang.String r5) {
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>()
                long r1 = r4.a     // Catch: java.lang.Exception -> Lb
                com.ss.android.downloadlib.activity.TTDelegateActivity.g(r3, r5, r1)     // Catch: java.lang.Exception -> Lb
                return
            Lb:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "market://details?id="
                r1.<init>(r2)
                r1.append(r5)
                java.lang.String r1 = r1.toString()
                android.net.Uri r1 = android.net.Uri.parse(r1)
                com.ss.android.downloadlib.addownload.o$b r3 = i(r3, r1)
                r1 = 1
                com.ss.android.downloadlib.j.g.a(r3, r4, r1)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>(r2)
                r3.append(r5)
                java.lang.String r3 = r3.toString()
                r5 = 14
                r1 = 11
                Q(r4, r0, r5, r1, r3)
                return
        }

        public static boolean d(@androidx.annotation.NonNull android.app.Activity r3, android.net.Uri r4) {
                android.content.Intent r0 = new android.content.Intent
                java.lang.String r1 = "android.intent.action.VIEW"
                r0.<init>(r1)
                r0.setData(r4)
                java.lang.String r4 = "start_only_for_android"
                r1 = 1
                r0.putExtra(r4, r1)
                java.lang.String r4 = com.ss.android.socialbase.appdownloader.m.e.m()
                android.content.Context r2 = com.ss.android.downloadlib.addownload.m.getContext()
                boolean r2 = com.ss.android.downloadlib.a.h.G(r2, r4)
                if (r2 == 0) goto L21
                r0.setPackage(r4)
            L21:
                android.content.Context r4 = com.ss.android.downloadlib.addownload.m.getContext()
                boolean r4 = com.ss.android.downloadlib.a.h.x(r4, r0)
                if (r4 == 0) goto L39
                r3.startActivity(r0)     // Catch: java.lang.Exception -> L2f
                return r1
            L2f:
                r3 = move-exception
                com.ss.android.downloadlib.up.a r4 = com.ss.android.downloadlib.up.a.a()
                java.lang.String r0 = "start HM2"
                r4.j(r3, r0)
            L39:
                r3 = 0
                return r3
        }

        static boolean e(android.content.Context r4, java.lang.String r5) {
                r0 = 0
                if (r4 != 0) goto L4
                return r0
            L4:
                android.net.Uri r1 = android.net.Uri.parse(r5)     // Catch: java.lang.Throwable -> L26
                android.content.Intent r2 = new android.content.Intent     // Catch: java.lang.Throwable -> L26
                java.lang.String r3 = "android.intent.action.VIEW"
                r2.<init>(r3)     // Catch: java.lang.Throwable -> L26
                r2.setData(r1)     // Catch: java.lang.Throwable -> L26
                r1 = 268435456(0x10000000, float:2.524355E-29)
                r2.addFlags(r1)     // Catch: java.lang.Throwable -> L26
                java.lang.String r1 = "open_url"
                r2.putExtra(r1, r5)     // Catch: java.lang.Throwable -> L26
                java.lang.String r5 = "start_only_for_android"
                r1 = 1
                r2.putExtra(r5, r1)     // Catch: java.lang.Throwable -> L26
                r4.startActivity(r2)     // Catch: java.lang.Throwable -> L26
                return r1
            L26:
                r4 = move-exception
                com.bytedance.sdk.component.utils.vl.j(r4)
                return r0
        }

        private static void f(android.content.Context r4, com.ss.android.downloadlib.addownload.o.i r5, java.lang.String r6) {
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>()
                java.lang.String r1 = "need_comment"
                long r2 = r5.a     // Catch: java.lang.Exception -> Ld
                com.ss.android.downloadlib.activity.TTDelegateActivity.p(r6, r2, r1)     // Catch: java.lang.Exception -> Ld
                return
            Ld:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "market://details?id="
                r1.<init>(r2)
                r1.append(r6)
                java.lang.String r1 = r1.toString()
                android.net.Uri r1 = android.net.Uri.parse(r1)
                com.ss.android.downloadlib.addownload.o$b r4 = i(r4, r1)
                r1 = 1
                com.ss.android.downloadlib.j.g.a(r4, r5, r1)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>(r2)
                r4.append(r6)
                java.lang.String r4 = r4.toString()
                r6 = 9
                r1 = 8
                Q(r5, r0, r6, r1, r4)
                return
        }

        private static android.content.Intent g(android.content.Context r5, com.ss.android.xt.j.xt.a r6, java.lang.String r7, int r8, java.lang.String r9) {
                boolean r0 = r6.cw()
                if (r0 == 0) goto L7c
                com.ss.android.j.j.cw.c r0 = r6.v()
                if (r0 == 0) goto L7c
                com.ss.android.j.j.cw.c r0 = r6.v()
                int r0 = r0.xt()
                r1 = 2
                if (r0 != r1) goto L7c
                com.ss.android.j.j.cw.b r0 = r6.tj()
                if (r0 == 0) goto L7c
                com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.downloadlib.a.n.k(r6)
                java.lang.String r2 = "app_link_market_open_add_info"
                r3 = 0
                int r0 = r0.j(r2, r3)
                r2 = 1
                if (r0 != r2) goto L7c
                com.ss.android.j.j.cw.b r0 = r6.tj()
                java.lang.String r0 = com.ss.android.downloadlib.addownload.d.a(r0)
                com.ss.android.j.j.cw.b r6 = r6.tj()
                java.lang.String r6 = com.ss.android.downloadlib.addownload.d.j(r6)
                android.content.Intent r2 = new android.content.Intent
                r2.<init>()
                java.lang.String r4 = "com.bytedance.ads.convert.BDBridgeActivity"
                r2.setClassName(r7, r4)
                android.content.pm.PackageManager r7 = r5.getPackageManager()
                android.content.pm.ResolveInfo r7 = r7.resolveActivity(r2, r3)
                boolean r3 = android.text.TextUtils.isEmpty(r0)
                if (r3 != 0) goto L7c
                if (r7 == 0) goto L7c
                java.lang.String r7 = "click_id"
                r2.putExtra(r7, r0)
                boolean r5 = r5 instanceof android.app.Activity
                if (r5 != 0) goto L63
                r5 = 268435456(0x10000000, float:2.524355E-29)
                r2.setFlags(r5)
            L63:
                boolean r5 = android.text.TextUtils.isEmpty(r6)
                if (r5 != 0) goto L6e
                java.lang.String r5 = "intent_extra"
                r2.putExtra(r5, r6)
            L6e:
                if (r8 != r1) goto L7b
                boolean r5 = android.text.TextUtils.isEmpty(r9)
                if (r5 != 0) goto L7b
                java.lang.String r5 = "open_url"
                r2.putExtra(r5, r9)
            L7b:
                return r2
            L7c:
                r5 = 0
                return r5
        }

        private static com.ss.android.downloadlib.addownload.o.b h(android.content.Context r4, android.content.Intent r5, com.ss.android.xt.j.xt.a r6, boolean r7, java.lang.String r8) {
                if (r4 != 0) goto L6
                android.content.Context r4 = com.ss.android.downloadlib.addownload.m.getContext()
            L6:
                boolean r0 = com.ss.android.downloadlib.a.h.L(r4, r5)
                r1 = 2
                if (r0 == 0) goto L93
                org.json.JSONObject r0 = com.ss.android.downloadlib.addownload.m.f()
                java.lang.String r2 = "open_url_mode"
                int r0 = r0.optInt(r2)
                r2 = 1
                if (r0 != 0) goto L41
                v2.y r0 = com.ss.android.downloadlib.addownload.m.G()
                if (r0 == 0) goto L41
                v2.y r0 = com.ss.android.downloadlib.addownload.m.G()
                boolean r0 = r0.j()
                if (r0 == 0) goto L41
                int r0 = android.os.Build.VERSION.SDK_INT
                r3 = 26
                if (r0 < r3) goto L41
                boolean r0 = r6.i()
                if (r0 == 0) goto L41
                if (r7 != 0) goto L41
                com.ss.android.downloadlib.activity.TTDelegateActivity.r(r8, r6)
                com.ss.android.downloadlib.addownload.o$b r4 = new com.ss.android.downloadlib.addownload.o$b
                r4.<init>(r2)
                return r4
            L41:
                r4.startActivity(r5)     // Catch: java.lang.Exception -> L4a
                com.ss.android.downloadlib.addownload.o$b r4 = new com.ss.android.downloadlib.addownload.o$b
                r4.<init>(r2)
                return r4
            L4a:
                r4 = move-exception
                java.lang.String r5 = "realTryOpenByUrl"
                if (r7 == 0) goto L72
                com.ss.android.downloadlib.a$o r6 = com.ss.android.downloadlib.a.o.a()
                java.lang.String r7 = com.ss.android.downloadlib.a.m.a
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                java.lang.String r0 = "商店直投注入clickId优化url调起场景，抛出异常，没接转化SDK，回退普通调起"
                r8.<init>(r0)
                java.lang.String r4 = r4.getMessage()
                r8.append(r4)
                java.lang.String r4 = r8.toString()
                r6.c(r7, r5, r4)
                com.ss.android.downloadlib.addownload.o$b r4 = new com.ss.android.downloadlib.addownload.o$b
                r5 = 9
                r4.<init>(r5)
                return r4
            L72:
                com.ss.android.downloadlib.a$o r6 = com.ss.android.downloadlib.a.o.a()
                java.lang.String r7 = com.ss.android.downloadlib.a.m.a
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                java.lang.String r0 = "url调起失败了，抛出异常"
                r8.<init>(r0)
                java.lang.String r4 = r4.getMessage()
                r8.append(r4)
                java.lang.String r4 = r8.toString()
                r6.c(r7, r5, r4)
                com.ss.android.downloadlib.addownload.o$b r4 = new com.ss.android.downloadlib.addownload.o$b
                r4.<init>(r1)
                return r4
            L93:
                com.ss.android.downloadlib.addownload.o$b r4 = new com.ss.android.downloadlib.addownload.o$b
                r5 = 24
                r4.<init>(r1, r5)
                return r4
        }

        public static com.ss.android.downloadlib.addownload.o.b i(android.content.Context r5, android.net.Uri r6) {
                boolean r0 = com.ss.android.socialbase.appdownloader.m.e.e()
                java.lang.String r1 = "market"
                r2 = 6
                if (r0 != 0) goto L1f
                if (r5 == 0) goto L17
                if (r6 == 0) goto L17
                java.lang.String r0 = r6.getScheme()
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L1f
            L17:
                com.ss.android.downloadlib.addownload.o$b r5 = new com.ss.android.downloadlib.addownload.o$b
                r6 = 12
                r5.<init>(r2, r6)
                return r5
            L1f:
                java.lang.String r0 = com.ss.android.socialbase.appdownloader.m.e.m()     // Catch: java.lang.Exception -> Lb5
                boolean r3 = com.ss.android.socialbase.appdownloader.m.e.g()     // Catch: java.lang.Exception -> Lb5
                java.lang.String r4 = "android.intent.action.VIEW"
                if (r3 == 0) goto L4a
                boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> Lb5
                if (r3 != 0) goto L37
                boolean r3 = com.ss.android.downloadlib.a.h.G(r5, r0)     // Catch: java.lang.Exception -> Lb5
                if (r3 != 0) goto L4a
            L37:
                java.lang.String r0 = "com.huawei.appmarket"
                android.net.Uri$Builder r6 = r6.buildUpon()     // Catch: java.lang.Exception -> Lb5
                r6.scheme(r1)     // Catch: java.lang.Exception -> Lb5
                android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Exception -> Lb5
                android.net.Uri r6 = r6.build()     // Catch: java.lang.Exception -> Lb5
                r1.<init>(r4, r6)     // Catch: java.lang.Exception -> Lb5
                goto L4f
            L4a:
                android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Exception -> Lb5
                r1.<init>(r4, r6)     // Catch: java.lang.Exception -> Lb5
            L4f:
                boolean r6 = com.ss.android.downloadlib.a.h.x(r5, r1)     // Catch: java.lang.Exception -> Lb5
                if (r6 != 0) goto L5d
                com.ss.android.downloadlib.addownload.o$b r5 = new com.ss.android.downloadlib.addownload.o$b     // Catch: java.lang.Exception -> Lb5
                r6 = 13
                r5.<init>(r2, r6)     // Catch: java.lang.Exception -> Lb5
                return r5
            L5d:
                boolean r6 = com.ss.android.downloadlib.a.h.G(r5, r0)     // Catch: java.lang.Exception -> Lb5
                if (r6 == 0) goto L6c
                boolean r6 = com.ss.android.socialbase.appdownloader.m.e.a()     // Catch: java.lang.Exception -> Lb5
                if (r6 != 0) goto L6c
                r1.setPackage(r0)     // Catch: java.lang.Exception -> Lb5
            L6c:
                com.ss.android.socialbase.downloader.jy.j r6 = com.ss.android.socialbase.downloader.jy.j.cw()     // Catch: java.lang.Exception -> Lb5
                java.lang.String r0 = "fix_jump_market"
                boolean r6 = r6.j(r0)     // Catch: java.lang.Exception -> Lb5
                if (r6 == 0) goto L7e
                r6 = 335544320(0x14000000, float:6.4623485E-27)
                r1.addFlags(r6)     // Catch: java.lang.Exception -> Lb5
                goto L87
            L7e:
                boolean r6 = r5 instanceof android.app.Activity     // Catch: java.lang.Exception -> Lb5
                if (r6 != 0) goto L87
                r6 = 268435456(0x10000000, float:2.524355E-29)
                r1.addFlags(r6)     // Catch: java.lang.Exception -> Lb5
            L87:
                com.ss.android.socialbase.downloader.jy.j r6 = com.ss.android.socialbase.downloader.jy.j.cw()     // Catch: java.lang.Exception -> Lb5
                java.lang.String r0 = "test_jump_market_failed"
                int r6 = r6.xt(r0)     // Catch: java.lang.Exception -> Lb5
                r0 = 1
                if (r6 != r0) goto La6
                com.ss.android.downloadlib.up.a r5 = com.ss.android.downloadlib.up.a.a()     // Catch: java.lang.Exception -> Lb5
                java.lang.String r6 = "jump market error"
                r0 = 0
                r5.d(r0, r6)     // Catch: java.lang.Exception -> Lb5
                com.ss.android.downloadlib.addownload.o$b r5 = new com.ss.android.downloadlib.addownload.o$b     // Catch: java.lang.Exception -> Lb5
                r6 = 25
                r5.<init>(r2, r6)     // Catch: java.lang.Exception -> Lb5
                return r5
            La6:
                java.lang.String r6 = "start_only_for_android"
                r1.putExtra(r6, r0)     // Catch: java.lang.Exception -> Lb5
                r5.startActivity(r1)     // Catch: java.lang.Exception -> Lb5
                com.ss.android.downloadlib.addownload.o$b r5 = new com.ss.android.downloadlib.addownload.o$b     // Catch: java.lang.Exception -> Lb5
                r6 = 5
                r5.<init>(r6)     // Catch: java.lang.Exception -> Lb5
                return r5
            Lb5:
                com.ss.android.downloadlib.addownload.o$b r5 = new com.ss.android.downloadlib.addownload.o$b
                r6 = 14
                r5.<init>(r2, r6)
                return r5
        }

        public static com.ss.android.downloadlib.addownload.o.b j(android.content.Context r6, android.net.Uri r7, com.ss.android.downloadlib.addownload.o.i r8) {
                r0 = 6
                if (r6 == 0) goto Lad
                boolean r1 = com.ss.android.downloadlib.j.i.a(r7)
                if (r1 != 0) goto Lb
                goto Lad
            Lb:
                android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Exception -> La5
                java.lang.String r2 = "android.intent.action.VIEW"
                r1.<init>(r2, r7)     // Catch: java.lang.Exception -> La5
                boolean r7 = com.ss.android.downloadlib.a.h.x(r6, r1)     // Catch: java.lang.Exception -> La5
                if (r7 != 0) goto L20
                com.ss.android.downloadlib.addownload.o$b r6 = new com.ss.android.downloadlib.addownload.o$b     // Catch: java.lang.Exception -> La5
                r7 = 13
                r6.<init>(r0, r7)     // Catch: java.lang.Exception -> La5
                return r6
            L20:
                java.lang.String r7 = com.ss.android.socialbase.appdownloader.m.e.m()     // Catch: java.lang.Exception -> La5
                boolean r2 = com.ss.android.downloadlib.a.h.G(r6, r7)     // Catch: java.lang.Exception -> La5
                if (r2 == 0) goto L2d
                r1.setPackage(r7)     // Catch: java.lang.Exception -> La5
            L2d:
                r7 = 335544320(0x14000000, float:6.4623485E-27)
                r1.addFlags(r7)     // Catch: java.lang.Exception -> La5
                com.ss.android.socialbase.downloader.jy.j r7 = com.ss.android.socialbase.downloader.jy.j.cw()     // Catch: java.lang.Exception -> La5
                java.lang.String r2 = "test_jump_market_failed"
                int r7 = r7.xt(r2)     // Catch: java.lang.Exception -> La5
                r2 = 1
                if (r7 != r2) goto L5f
                java.lang.String r7 = "local_test"
                com.ss.android.j.j.up.b r3 = com.ss.android.downloadlib.addownload.m.z()     // Catch: java.lang.Exception -> La5
                java.lang.String r3 = r3.c     // Catch: java.lang.Exception -> La5
                boolean r7 = r7.equals(r3)     // Catch: java.lang.Exception -> La5
                if (r7 == 0) goto L5f
                com.ss.android.downloadlib.up.a r6 = com.ss.android.downloadlib.up.a.a()     // Catch: java.lang.Exception -> La5
                java.lang.String r7 = "jump market error"
                r8 = 0
                r6.d(r8, r7)     // Catch: java.lang.Exception -> La5
                com.ss.android.downloadlib.addownload.o$b r6 = new com.ss.android.downloadlib.addownload.o$b     // Catch: java.lang.Exception -> La5
                r7 = 25
                r6.<init>(r0, r7)     // Catch: java.lang.Exception -> La5
                return r6
            L5f:
                java.lang.String r7 = "start_only_for_android"
                r1.putExtra(r7, r2)     // Catch: java.lang.Exception -> La5
                org.json.JSONObject r7 = com.ss.android.downloadlib.addownload.m.f()     // Catch: java.lang.Exception -> La5
                java.lang.String r2 = "market_jump_delay"
                r3 = 1000(0x3e8, double:4.94E-321)
                long r2 = r7.optLong(r2, r3)     // Catch: java.lang.Exception -> La5
                r4 = 0
                int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r7 <= 0) goto L92
                if (r8 == 0) goto L92
                com.ss.android.xt.j.xt.b r7 = r8.e     // Catch: java.lang.Exception -> La5
                if (r7 == 0) goto L92
                boolean r7 = r7.Q()     // Catch: java.lang.Exception -> La5
                if (r7 != 0) goto L92
                com.ss.android.downloadlib.c r7 = com.ss.android.downloadlib.c.d()     // Catch: java.lang.Exception -> La5
                android.os.Handler r7 = r7.s()     // Catch: java.lang.Exception -> La5
                com.ss.android.downloadlib.a$m$a r8 = new com.ss.android.downloadlib.a$m$a     // Catch: java.lang.Exception -> La5
                r8.<init>()     // Catch: java.lang.Exception -> La5
                r7.post(r8)     // Catch: java.lang.Exception -> La5
            L92:
                com.ss.android.downloadlib.e r7 = com.ss.android.downloadlib.e.c()     // Catch: java.lang.Exception -> La5
                com.ss.android.downloadlib.a$m$b r8 = new com.ss.android.downloadlib.a$m$b     // Catch: java.lang.Exception -> La5
                r8.<init>(r6, r1)     // Catch: java.lang.Exception -> La5
                r7.e(r8, r2)     // Catch: java.lang.Exception -> La5
                com.ss.android.downloadlib.addownload.o$b r6 = new com.ss.android.downloadlib.addownload.o$b     // Catch: java.lang.Exception -> La5
                r7 = 5
                r6.<init>(r7)     // Catch: java.lang.Exception -> La5
                return r6
            La5:
                com.ss.android.downloadlib.addownload.o$b r6 = new com.ss.android.downloadlib.addownload.o$b
                r7 = 14
                r6.<init>(r0, r7)
                return r6
            Lad:
                com.ss.android.downloadlib.addownload.o$b r6 = new com.ss.android.downloadlib.addownload.o$b
                r7 = 12
                r6.<init>(r0, r7)
                return r6
        }

        public static com.ss.android.downloadlib.addownload.o.b k(android.content.Context r4, com.ss.android.downloadlib.addownload.o.i r5, java.lang.String r6) {
                if (r4 == 0) goto L158
                boolean r0 = android.text.TextUtils.isEmpty(r6)
                if (r0 == 0) goto La
                goto L158
            La:
                boolean r0 = com.ss.android.socialbase.appdownloader.m.e.a()
                if (r0 == 0) goto L1d
                java.lang.String r0 = "com.sec.android.app.samsungapps"
                boolean r0 = com.ss.android.downloadlib.a.h.G(r4, r0)
                if (r0 == 0) goto L1d
                com.ss.android.downloadlib.addownload.o$b r4 = E(r4, r6)
                return r4
            L1d:
                com.ss.android.j.j.cw.b r0 = r5.b
                boolean r0 = r0.x()
                if (r0 == 0) goto L141
                com.ss.android.j.j.cw.c r0 = r5.d
                boolean r0 = r0.av()
                if (r0 != 0) goto L2f
                goto L141
            L2f:
                org.json.JSONObject r0 = com.ss.android.downloadlib.addownload.m.f()
                java.lang.String r1 = "am_plans"
                org.json.JSONArray r0 = r0.optJSONArray(r1)
                boolean r1 = com.ss.android.socialbase.appdownloader.m.e.r()
                if (r1 == 0) goto L4c
                java.lang.String r1 = "am_3"
                boolean r1 = com.ss.android.socialbase.appdownloader.m.b.d(r0, r1)
                if (r1 == 0) goto L4c
                com.ss.android.downloadlib.addownload.o$b r4 = I(r4, r5, r6)
                return r4
            L4c:
                boolean r1 = com.ss.android.socialbase.appdownloader.m.e.k()
                r2 = 7
                if (r1 == 0) goto L66
                java.lang.String r1 = "am_2"
                boolean r1 = com.ss.android.socialbase.appdownloader.m.b.d(r0, r1)
                if (r1 == 0) goto L66
                H(r4, r5, r6)
                com.ss.android.downloadlib.addownload.o$b r4 = new com.ss.android.downloadlib.addownload.o$b
                java.lang.String r5 = "am_m2"
                r4.<init>(r2, r5)
                return r4
            L66:
                boolean r1 = com.ss.android.socialbase.appdownloader.m.e.p()
                if (r1 == 0) goto L7f
                java.lang.String r1 = "am_5"
                boolean r1 = com.ss.android.socialbase.appdownloader.m.b.d(r0, r1)
                if (r1 == 0) goto L7f
                G(r4, r5, r6)
                com.ss.android.downloadlib.addownload.o$b r4 = new com.ss.android.downloadlib.addownload.o$b
                java.lang.String r5 = "am_v1"
                r4.<init>(r2, r5)
                return r4
            L7f:
                boolean r1 = com.ss.android.socialbase.appdownloader.m.e.r()
                if (r1 == 0) goto La0
                java.lang.String r1 = "am_7"
                boolean r1 = com.ss.android.socialbase.appdownloader.m.b.d(r0, r1)
                if (r1 == 0) goto La0
                com.ss.android.j.j.cw.c r1 = r5.d
                boolean r3 = r1 instanceof com.ss.android.xt.j.j.b
                if (r3 == 0) goto La0
                com.ss.android.xt.j.j.b r1 = (com.ss.android.xt.j.j.b) r1
                boolean r1 = r1.b()
                if (r1 == 0) goto La0
                com.ss.android.downloadlib.addownload.o$b r4 = D(r4, r5, r6)
                return r4
            La0:
                boolean r1 = com.ss.android.socialbase.appdownloader.m.e.p()
                if (r1 == 0) goto Lc7
                java.lang.String r1 = "am_8"
                boolean r1 = com.ss.android.socialbase.appdownloader.m.b.d(r0, r1)
                if (r1 == 0) goto Lc7
                java.lang.String r1 = "com.bbk.appstore"
                java.lang.String r1 = com.ss.android.downloadlib.a.h.b(r4, r1)
                java.lang.String r3 = "8.7.2.0"
                int r1 = com.ss.android.downloadlib.a.h.g(r1, r3)
                if (r1 < 0) goto Lc7
                f(r4, r5, r6)
                com.ss.android.downloadlib.addownload.o$b r4 = new com.ss.android.downloadlib.addownload.o$b
                java.lang.String r5 = "am_v2"
                r4.<init>(r2, r5)
                return r4
            Lc7:
                boolean r1 = com.ss.android.socialbase.appdownloader.m.e.h()
                if (r1 != 0) goto Ld3
                boolean r1 = com.ss.android.socialbase.appdownloader.m.e.w()
                if (r1 == 0) goto Le6
            Ld3:
                java.lang.String r1 = "am_9"
                boolean r1 = com.ss.android.socialbase.appdownloader.m.b.d(r0, r1)
                if (r1 == 0) goto Le6
                C(r4, r5, r6)
                com.ss.android.downloadlib.addownload.o$b r4 = new com.ss.android.downloadlib.addownload.o$b
                java.lang.String r5 = "am_hr"
                r4.<init>(r2, r5)
                return r4
            Le6:
                boolean r1 = com.ss.android.socialbase.appdownloader.m.e.h()
                if (r1 != 0) goto Lf2
                boolean r1 = com.ss.android.socialbase.appdownloader.m.e.w()
                if (r1 == 0) goto L105
            Lf2:
                java.lang.String r1 = "am_10"
                boolean r0 = com.ss.android.socialbase.appdownloader.m.b.d(r0, r1)
                if (r0 == 0) goto L105
                a(r4, r5, r6)
                com.ss.android.downloadlib.addownload.o$b r4 = new com.ss.android.downloadlib.addownload.o$b
                java.lang.String r5 = "am_hr2"
                r4.<init>(r2, r5)
                return r4
            L105:
                com.ss.android.j.j.cw.c r0 = r5.d
                boolean r1 = r0 instanceof com.ss.android.xt.j.j.b
                if (r1 == 0) goto L138
                com.ss.android.xt.j.j.b r0 = (com.ss.android.xt.j.j.b) r0
                boolean r0 = r0.b()
                if (r0 == 0) goto L138
                com.ss.android.j.j.cw.c r0 = r5.d
                com.ss.android.xt.j.j.b r0 = (com.ss.android.xt.j.j.b) r0
                v2.r r0 = r0.h()
                if (r0 == 0) goto L138
                com.ss.android.j.j.cw.b r0 = r5.b
                org.json.JSONObject r0 = r0.w()
                java.lang.String r1 = "is_use_obm_convert"
                r3 = 0
                int r0 = r0.optInt(r1, r3)
                r1 = 1
                if (r0 != r1) goto L138
                c(r4, r5, r6)
                com.ss.android.downloadlib.addownload.o$b r4 = new com.ss.android.downloadlib.addownload.o$b
                java.lang.String r5 = "am_kllk4"
                r4.<init>(r2, r5)
                return r4
            L138:
                android.net.Uri r5 = t2.a.a(r4, r6)
                com.ss.android.downloadlib.addownload.o$b r4 = i(r4, r5)
                return r4
            L141:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                java.lang.String r0 = "market://details?id="
                r5.<init>(r0)
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                android.net.Uri r5 = android.net.Uri.parse(r5)
                com.ss.android.downloadlib.addownload.o$b r4 = i(r4, r5)
                return r4
            L158:
                com.ss.android.downloadlib.addownload.o$b r4 = new com.ss.android.downloadlib.addownload.o$b
                r5 = 6
                r6 = 11
                r4.<init>(r5, r6)
                return r4
        }

        public static com.ss.android.downloadlib.addownload.o.b l(android.content.Context r1, java.lang.String r2) {
                if (r1 == 0) goto L25
                boolean r0 = android.text.TextUtils.isEmpty(r2)
                if (r0 == 0) goto L9
                goto L25
            L9:
                boolean r0 = com.ss.android.socialbase.appdownloader.m.e.a()
                if (r0 == 0) goto L1c
                java.lang.String r0 = "com.sec.android.app.samsungapps"
                boolean r0 = com.ss.android.downloadlib.a.h.G(r1, r0)
                if (r0 == 0) goto L1c
                com.ss.android.downloadlib.addownload.o$b r1 = E(r1, r2)
                return r1
            L1c:
                android.net.Uri r2 = t2.a.a(r1, r2)
                com.ss.android.downloadlib.addownload.o$b r1 = i(r1, r2)
                return r1
            L25:
                com.ss.android.downloadlib.addownload.o$b r1 = new com.ss.android.downloadlib.addownload.o$b
                r2 = 6
                r0 = 11
                r1.<init>(r2, r0)
                return r1
        }

        static com.ss.android.downloadlib.addownload.o.b m(android.content.Context r6, java.lang.String r7, com.ss.android.xt.j.xt.a r8) {
                r0 = 0
                r1 = 1
                android.content.Intent r0 = g(r6, r8, r7, r1, r0)
                if (r0 == 0) goto L21
                com.ss.android.downloadlib.a$o r2 = com.ss.android.downloadlib.a.o.a()
                java.lang.String r3 = com.ss.android.downloadlib.a.m.a
                java.lang.String r4 = "tryOpenByPackage"
                java.lang.String r5 = "成功构造了跳转中转Activity的intent"
                r2.b(r3, r4, r5)
                com.ss.android.downloadlib.addownload.o$b r0 = n(r0, r1, r6, r7, r8)
                int r1 = r0.getType()
                r2 = 3
                if (r1 != r2) goto L21
                return r0
            L21:
                android.content.Intent r0 = com.ss.android.downloadlib.a.h.a(r6, r7)
                if (r0 != 0) goto L30
                com.ss.android.downloadlib.addownload.o$b r6 = new com.ss.android.downloadlib.addownload.o$b
                r7 = 4
                r8 = 22
                r6.<init>(r7, r8)
                return r6
            L30:
                r1 = 0
                com.ss.android.downloadlib.addownload.o$b r6 = n(r0, r1, r6, r7, r8)
                return r6
        }

        private static com.ss.android.downloadlib.addownload.o.b n(android.content.Intent r4, boolean r5, android.content.Context r6, java.lang.String r7, com.ss.android.xt.j.xt.a r8) {
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 26
                r2 = 3
                r3 = 1
                if (r0 < r1) goto L35
                org.json.JSONObject r0 = com.ss.android.downloadlib.addownload.m.f()
                java.lang.String r1 = "open_package_mode"
                int r0 = r0.optInt(r1)
                if (r0 != r3) goto L35
                v2.y r0 = com.ss.android.downloadlib.addownload.m.G()
                if (r0 == 0) goto L35
                v2.y r0 = com.ss.android.downloadlib.addownload.m.G()
                boolean r0 = r0.j()
                if (r0 == 0) goto L35
                boolean r0 = r8.i()
                if (r0 == 0) goto L35
                if (r5 != 0) goto L35
                com.ss.android.downloadlib.activity.TTDelegateActivity.A(r7, r8)
                com.ss.android.downloadlib.addownload.o$b r4 = new com.ss.android.downloadlib.addownload.o$b
                r4.<init>(r2)
                return r4
            L35:
                java.lang.String r7 = "start_only_for_android"
                r4.putExtra(r7, r3)
                r6.startActivity(r4)     // Catch: java.lang.Exception -> L43
                com.ss.android.downloadlib.addownload.o$b r4 = new com.ss.android.downloadlib.addownload.o$b
                r4.<init>(r2)
                return r4
            L43:
                r4 = move-exception
                r6 = 23
                java.lang.String r7 = "realTryOpenByPackage"
                if (r5 == 0) goto L6d
                com.ss.android.downloadlib.a$o r5 = com.ss.android.downloadlib.a.o.a()
                java.lang.String r8 = com.ss.android.downloadlib.a.m.a
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "调起中转Activity出现异常，可能是没接转化SDK，回退普通调起"
                r0.<init>(r1)
                java.lang.String r4 = r4.getMessage()
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r5.c(r8, r7, r4)
                com.ss.android.downloadlib.addownload.o$b r4 = new com.ss.android.downloadlib.addownload.o$b
                r5 = 8
                r4.<init>(r5, r6)
                return r4
            L6d:
                com.ss.android.downloadlib.a$o r5 = com.ss.android.downloadlib.a.o.a()
                java.lang.String r8 = com.ss.android.downloadlib.a.m.a
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "包名调起失败了，抛出异常"
                r0.<init>(r1)
                java.lang.String r4 = r4.getMessage()
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r5.c(r8, r7, r4)
                com.ss.android.downloadlib.addownload.o$b r4 = new com.ss.android.downloadlib.addownload.o$b
                r5 = 4
                r4.<init>(r5, r6)
                return r4
        }

        static com.ss.android.downloadlib.addownload.o.b o(@androidx.annotation.NonNull com.ss.android.xt.j.xt.b r2, java.lang.String r3, java.lang.String r4) {
                com.ss.android.downloadlib.addownload.o$b r3 = K(r3, r2)
                boolean r0 = com.ss.android.downloadlib.j.h.f(r2)
                if (r0 != 0) goto Lb
                return r3
            Lb:
                int r0 = r3.getType()
                r1 = 2
                if (r0 != r1) goto L17
                com.ss.android.downloadlib.addownload.o$b r2 = p(r4, r2)
                return r2
            L17:
                return r3
        }

        static com.ss.android.downloadlib.addownload.o.b p(java.lang.String r1, com.ss.android.xt.j.xt.a r2) {
                android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
                com.ss.android.downloadlib.addownload.o$b r1 = m(r0, r1, r2)
                return r1
        }

        static /* synthetic */ java.lang.String q(java.lang.String r0) {
                java.lang.String r0 = b(r0)
                return r0
        }

        public static void r(@androidx.annotation.NonNull android.app.Activity r5, java.lang.String r6, long r7) {
                com.ss.android.downloadlib.addownload.o$f r0 = com.ss.android.downloadlib.addownload.o.f.c()
                com.ss.android.downloadlib.addownload.o$i r7 = r0.r(r7)
                org.json.JSONObject r8 = new org.json.JSONObject
                r8.<init>()
                org.json.JSONObject r0 = com.ss.android.downloadlib.addownload.m.f()
                java.lang.String r1 = "s"
                java.lang.String r1 = r0.optString(r1)
                java.lang.String r2 = "ca"
                java.lang.String r2 = r0.optString(r2)
                java.lang.String r2 = com.ss.android.socialbase.appdownloader.m.a.b(r2, r1)
                java.lang.String r3 = "cc"
                java.lang.String r0 = r0.optString(r3)
                java.lang.String r0 = com.ss.android.socialbase.appdownloader.m.a.b(r0, r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r3 = "market://details?id="
                r1.<init>(r3)
                boolean r4 = android.text.TextUtils.isEmpty(r2)
                if (r4 != 0) goto L51
                boolean r4 = android.text.TextUtils.isEmpty(r0)
                if (r4 != 0) goto L51
                r1.append(r6)
                java.lang.String r4 = "&"
                r1.append(r4)
                r1.append(r2)
                java.lang.String r2 = "="
                r1.append(r2)
                r1.append(r0)
            L51:
                java.lang.String r0 = r1.toString()
                android.net.Uri r0 = android.net.Uri.parse(r0)
                boolean r0 = d(r5, r0)
                r1 = 1
                r2 = 10
                if (r0 == 0) goto L78
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>(r3)
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                r6 = -1
                Q(r7, r8, r6, r2, r5)
                java.lang.String r5 = "am_hr2"
                com.ss.android.downloadlib.j.g.d(r5, r8, r7, r1)
                return
            L78:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>(r3)
                r0.append(r6)
                java.lang.String r0 = r0.toString()
                r4 = 2
                Q(r7, r8, r4, r2, r0)
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>(r3)
                r8.append(r6)
                java.lang.String r6 = r8.toString()
                android.net.Uri r6 = android.net.Uri.parse(r6)
                com.ss.android.downloadlib.addownload.o$b r5 = i(r5, r6)
                com.ss.android.downloadlib.j.g.a(r5, r7, r1)
                return
        }

        public static void s(@androidx.annotation.NonNull android.app.Activity r4, java.lang.String r5, long r6, java.lang.String r8) {
                com.ss.android.downloadlib.addownload.o$f r0 = com.ss.android.downloadlib.addownload.o.f.c()
                com.ss.android.downloadlib.addownload.o$i r6 = r0.r(r6)
                org.json.JSONObject r7 = new org.json.JSONObject
                r7.<init>()
                org.json.JSONObject r0 = com.ss.android.downloadlib.addownload.m.f()
                java.lang.String r1 = "s"
                java.lang.String r1 = r0.optString(r1)
                java.lang.String r2 = "bv"
                java.lang.String r0 = r0.optString(r2)
                java.lang.String r0 = com.ss.android.socialbase.appdownloader.m.a.b(r0, r1)
                android.net.Uri$Builder r1 = new android.net.Uri$Builder
                r1.<init>()
                java.lang.String r2 = "market"
                android.net.Uri$Builder r2 = r1.scheme(r2)
                java.lang.String r3 = "details"
                android.net.Uri$Builder r2 = r2.authority(r3)
                java.lang.String r3 = "id"
                r2.appendQueryParameter(r3, r5)
                boolean r2 = android.text.TextUtils.isEmpty(r0)
                if (r2 != 0) goto L40
                r1.appendQueryParameter(r0, r8)
            L40:
                android.net.Uri r8 = r1.build()
                boolean r8 = z(r4, r8)
                r0 = 1
                r1 = 8
                java.lang.String r2 = "market://details?id="
                if (r8 == 0) goto L65
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>(r2)
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                r5 = -1
                Q(r6, r7, r5, r1, r4)
                java.lang.String r4 = "am_v2"
                com.ss.android.downloadlib.j.g.d(r4, r7, r6, r0)
                return
            L65:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>(r2)
                r8.append(r5)
                java.lang.String r8 = r8.toString()
                r3 = 2
                Q(r6, r7, r3, r1, r8)
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>(r2)
                r7.append(r5)
                java.lang.String r5 = r7.toString()
                android.net.Uri r5 = android.net.Uri.parse(r5)
                com.ss.android.downloadlib.addownload.o$b r4 = i(r4, r5)
                com.ss.android.downloadlib.j.g.a(r4, r6, r0)
                return
        }

        public static void t(@androidx.annotation.NonNull android.app.Activity r5, java.lang.String r6, long r7, java.lang.String r9, java.lang.String r10) {
                java.lang.String r0 = "market://details?id="
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L8
                r1.<init>(r10)     // Catch: org.json.JSONException -> L8
                goto Ld
            L8:
                org.json.JSONObject r1 = new org.json.JSONObject
                r1.<init>()
            Ld:
                com.ss.android.downloadlib.addownload.o$f r10 = com.ss.android.downloadlib.addownload.o.f.c()
                com.ss.android.downloadlib.addownload.o$i r7 = r10.r(r7)
                r8 = 5
                r10 = 1
                org.json.JSONObject r2 = com.ss.android.downloadlib.addownload.m.f()     // Catch: java.lang.Exception -> L90
                java.lang.String r3 = "s"
                java.lang.String r3 = r2.optString(r3)     // Catch: java.lang.Exception -> L90
                java.lang.String r4 = "bg"
                java.lang.String r4 = r2.optString(r4)     // Catch: java.lang.Exception -> L90
                java.lang.String r3 = com.ss.android.socialbase.appdownloader.m.a.b(r4, r3)     // Catch: java.lang.Exception -> L90
                boolean r2 = com.ss.android.socialbase.appdownloader.m.b.g(r2, r5, r3)     // Catch: java.lang.Exception -> L90
                org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L90
                r3.<init>(r9)     // Catch: java.lang.Exception -> L90
                java.util.HashMap r9 = com.ss.android.downloadlib.a.h.J(r3)     // Catch: java.lang.Exception -> L90
                if (r2 == 0) goto L5c
                boolean r3 = r9.isEmpty()     // Catch: java.lang.Exception -> L90
                if (r3 != 0) goto L5c
                boolean r3 = A(r5, r6, r9)     // Catch: java.lang.Exception -> L90
                if (r3 == 0) goto L5c
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L90
                r5.<init>(r0)     // Catch: java.lang.Exception -> L90
                r5.append(r6)     // Catch: java.lang.Exception -> L90
                java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L90
                r9 = -1
                Q(r7, r1, r9, r8, r5)     // Catch: java.lang.Exception -> L90
                java.lang.String r5 = "am_v1"
                com.ss.android.downloadlib.j.g.d(r5, r1, r7, r10)     // Catch: java.lang.Exception -> L90
                goto L8f
            L5c:
                if (r2 == 0) goto L68
                boolean r9 = r9.isEmpty()     // Catch: java.lang.Exception -> L90
                if (r9 == 0) goto L66
                r9 = 1
                goto L69
            L66:
                r9 = 2
                goto L69
            L68:
                r9 = 3
            L69:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L90
                r2.<init>(r0)     // Catch: java.lang.Exception -> L90
                r2.append(r6)     // Catch: java.lang.Exception -> L90
                java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L90
                Q(r7, r1, r9, r8, r2)     // Catch: java.lang.Exception -> L90
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L90
                r9.<init>(r0)     // Catch: java.lang.Exception -> L90
                r9.append(r6)     // Catch: java.lang.Exception -> L90
                java.lang.String r9 = r9.toString()     // Catch: java.lang.Exception -> L90
                android.net.Uri r9 = android.net.Uri.parse(r9)     // Catch: java.lang.Exception -> L90
                com.ss.android.downloadlib.addownload.o$b r5 = i(r5, r9)     // Catch: java.lang.Exception -> L90
                com.ss.android.downloadlib.j.g.a(r5, r7, r10)     // Catch: java.lang.Exception -> L90
            L8f:
                return
            L90:
                android.content.Context r5 = com.ss.android.downloadlib.addownload.m.getContext()
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>(r0)
                r9.append(r6)
                java.lang.String r9 = r9.toString()
                android.net.Uri r9 = android.net.Uri.parse(r9)
                com.ss.android.downloadlib.addownload.o$b r5 = i(r5, r9)
                com.ss.android.downloadlib.j.g.a(r5, r7, r10)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>(r0)
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                r6 = 4
                Q(r7, r1, r6, r8, r5)
                return
        }

        static /* synthetic */ void u(android.content.Context r0, com.ss.android.downloadlib.addownload.o.i r1, java.lang.String r2, java.lang.String r3) {
                O(r0, r1, r2, r3)
                return
        }

        public static void v(android.content.Context r15, java.lang.String r16, long r17, java.lang.String r19, boolean r20) {
                r0 = r16
                org.json.JSONObject r1 = new org.json.JSONObject
                r1.<init>()
                com.ss.android.downloadlib.addownload.o$f r2 = com.ss.android.downloadlib.addownload.o.f.c()
                r3 = r17
                com.ss.android.downloadlib.addownload.o$i r2 = r2.r(r3)
                r3 = 7
                r4 = 0
                r5 = 1
                org.json.JSONObject r6 = com.ss.android.downloadlib.addownload.m.f()     // Catch: java.lang.Exception -> L9e
                java.lang.String r7 = "s"
                java.lang.String r7 = r6.optString(r7)     // Catch: java.lang.Exception -> L9e
                java.lang.String r8 = "br"
                java.lang.String r8 = r6.optString(r8)     // Catch: java.lang.Exception -> L9e
                java.lang.String r8 = com.ss.android.socialbase.appdownloader.m.a.b(r8, r7)     // Catch: java.lang.Exception -> L9e
                java.lang.String r9 = "bs_1"
                java.lang.String r9 = r6.optString(r9)     // Catch: java.lang.Exception -> L9e
                java.lang.String r9 = com.ss.android.socialbase.appdownloader.m.a.b(r9, r7)     // Catch: java.lang.Exception -> L9e
                java.lang.String r10 = "bs_2"
                java.lang.String r10 = r6.optString(r10)     // Catch: java.lang.Exception -> L9e
                java.lang.String r10 = com.ss.android.socialbase.appdownloader.m.a.b(r10, r7)     // Catch: java.lang.Exception -> L9e
                java.lang.String r11 = "bs_3"
                java.lang.String r11 = r6.optString(r11)     // Catch: java.lang.Exception -> L9e
                java.lang.String r11 = com.ss.android.socialbase.appdownloader.m.a.b(r11, r7)     // Catch: java.lang.Exception -> L9e
                java.lang.String r12 = "bt"
                java.lang.String r12 = r6.optString(r12)     // Catch: java.lang.Exception -> L9e
                java.lang.String r12 = com.ss.android.socialbase.appdownloader.m.a.b(r12, r7)     // Catch: java.lang.Exception -> L9e
                java.lang.String r13 = "bu"
                java.lang.String r6 = r6.optString(r13)     // Catch: java.lang.Exception -> L9e
                java.lang.String r6 = com.ss.android.socialbase.appdownloader.m.a.b(r6, r7)     // Catch: java.lang.Exception -> L9e
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L9e
                java.lang.String r13 = "https://"
                java.lang.Object[] r14 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L9e
                java.lang.String r13 = java.lang.String.format(r13, r14)     // Catch: java.lang.Exception -> L9e
                r7.<init>(r13)     // Catch: java.lang.Exception -> L9e
                r7.append(r8)     // Catch: java.lang.Exception -> L9e
                r7.append(r9)     // Catch: java.lang.Exception -> L9e
                r7.append(r10)     // Catch: java.lang.Exception -> L9e
                r7.append(r11)     // Catch: java.lang.Exception -> L9e
                r7.append(r12)     // Catch: java.lang.Exception -> L9e
                r7.append(r6)     // Catch: java.lang.Exception -> L9e
                android.content.Intent r6 = new android.content.Intent     // Catch: java.lang.Exception -> L9e
                java.lang.String r8 = "android.intent.action.VIEW"
                r6.<init>(r8)     // Catch: java.lang.Exception -> L9e
                r8 = r19
                r6.setPackage(r8)     // Catch: java.lang.Exception -> L9e
                if (r20 == 0) goto La0
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L9e
                java.lang.String r9 = "pkg="
                r8.<init>(r9)     // Catch: java.lang.Exception -> L9e
                r8.append(r0)     // Catch: java.lang.Exception -> L9e
                java.lang.String r8 = r8.toString()     // Catch: java.lang.Exception -> L9e
                r7.append(r8)     // Catch: java.lang.Exception -> L9e
                java.lang.String r8 = "&dl=true"
                r7.append(r8)     // Catch: java.lang.Exception -> L9e
                goto La5
            L9e:
                goto L101
            La0:
                r8 = 335544320(0x14000000, float:6.4623485E-27)
                r6.addFlags(r8)     // Catch: java.lang.Exception -> L9e
            La5:
                java.lang.String r8 = "dl"
                java.lang.Boolean r9 = java.lang.Boolean.valueOf(r20)     // Catch: java.lang.Exception -> L9e
                com.ss.android.downloadlib.a.h.u(r1, r8, r9)     // Catch: java.lang.Exception -> L9e
                java.lang.String r8 = r7.toString()     // Catch: java.lang.Exception -> L9e
                android.net.Uri r8 = android.net.Uri.parse(r8)     // Catch: java.lang.Exception -> L9e
                r6.setData(r8)     // Catch: java.lang.Exception -> L9e
                java.lang.String r8 = "start_only_for_android"
                r6.putExtra(r8, r5)     // Catch: java.lang.Exception -> L9e
                org.json.JSONObject r8 = com.ss.android.downloadlib.addownload.m.f()     // Catch: java.lang.Exception -> L9e
                java.lang.String r9 = "oppo_browser_jump_delay"
                r10 = 1000(0x3e8, double:4.94E-321)
                long r8 = r8.optLong(r9, r10)     // Catch: java.lang.Exception -> L9e
                r10 = 0
                int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r12 <= 0) goto Le0
                com.ss.android.downloadlib.c r10 = com.ss.android.downloadlib.c.d()     // Catch: java.lang.Exception -> L9e
                android.os.Handler r10 = r10.s()     // Catch: java.lang.Exception -> L9e
                com.ss.android.downloadlib.a$m$c r11 = new com.ss.android.downloadlib.a$m$c     // Catch: java.lang.Exception -> L9e
                r11.<init>()     // Catch: java.lang.Exception -> L9e
                r10.post(r11)     // Catch: java.lang.Exception -> L9e
            Le0:
                com.ss.android.downloadlib.e r10 = com.ss.android.downloadlib.e.c()     // Catch: java.lang.Exception -> L9e
                com.ss.android.downloadlib.a$m$d r11 = new com.ss.android.downloadlib.a$m$d     // Catch: java.lang.Exception -> L9e
                r11.<init>(r15, r6)     // Catch: java.lang.Exception -> L9e
                r10.e(r11, r8)     // Catch: java.lang.Exception -> L9e
                com.ss.android.xt.j.xt.b r15 = r2.e     // Catch: java.lang.Exception -> L9e
                if (r15 == 0) goto Lf3
                r15.u(r5)     // Catch: java.lang.Exception -> L9e
            Lf3:
                java.lang.String r15 = "am_kllk3"
                com.ss.android.downloadlib.j.g.d(r15, r1, r2, r5)     // Catch: java.lang.Exception -> L9e
                java.lang.String r15 = r7.toString()     // Catch: java.lang.Exception -> L9e
                r6 = -1
                Q(r2, r1, r6, r3, r15)     // Catch: java.lang.Exception -> L9e
                return
            L101:
                com.ss.android.xt.j.xt.b r15 = r2.e
                if (r15 == 0) goto L108
                r15.u(r4)
            L108:
                android.content.Context r15 = com.ss.android.downloadlib.addownload.m.getContext()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r6 = "market://details?id="
                r4.<init>(r6)
                r4.append(r0)
                java.lang.String r4 = r4.toString()
                android.net.Uri r4 = android.net.Uri.parse(r4)
                com.ss.android.downloadlib.addownload.o$b r15 = j(r15, r4, r2)
                com.ss.android.downloadlib.j.g.a(r15, r2, r5)
                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                r15.<init>(r6)
                r15.append(r0)
                java.lang.String r15 = r15.toString()
                r0 = 2
                Q(r2, r1, r0, r3, r15)
                return
        }

        public static void w(android.content.Context r16, java.lang.String r17, long r18, boolean r20) {
                r0 = r16
                r1 = r17
                org.json.JSONObject r2 = new org.json.JSONObject
                r2.<init>()
                com.ss.android.downloadlib.addownload.o$f r3 = com.ss.android.downloadlib.addownload.o.f.c()
                r4 = r18
                com.ss.android.downloadlib.addownload.o$i r3 = r3.r(r4)
                r4 = 2
                r5 = 1
                r6 = 3
                org.json.JSONObject r7 = com.ss.android.downloadlib.addownload.m.f()     // Catch: java.lang.Exception -> Lba
                java.lang.String r8 = "s"
                java.lang.String r8 = r7.optString(r8)     // Catch: java.lang.Exception -> Lba
                java.lang.String r9 = "aa"
                java.lang.String r9 = r7.optString(r9)     // Catch: java.lang.Exception -> Lba
                java.lang.String r9 = com.ss.android.socialbase.appdownloader.m.a.b(r9, r8)     // Catch: java.lang.Exception -> Lba
                java.lang.String r10 = "ac"
                java.lang.String r10 = r7.optString(r10)     // Catch: java.lang.Exception -> Lba
                java.lang.String r10 = com.ss.android.socialbase.appdownloader.m.a.b(r10, r8)     // Catch: java.lang.Exception -> Lba
                java.lang.String r11 = "af"
                java.lang.String r11 = r7.optString(r11)     // Catch: java.lang.Exception -> Lba
                java.lang.String r11 = com.ss.android.socialbase.appdownloader.m.a.b(r11, r8)     // Catch: java.lang.Exception -> Lba
                boolean r12 = com.ss.android.socialbase.appdownloader.m.b.g(r7, r0, r10)     // Catch: java.lang.Exception -> Lba
                java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lba
                java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> Lba
                r15 = 0
                r14[r15] = r1     // Catch: java.lang.Exception -> Lba
                r14[r5] = r11     // Catch: java.lang.Exception -> Lba
                r14[r4] = r10     // Catch: java.lang.Exception -> Lba
                java.lang.String r9 = java.lang.String.format(r9, r14)     // Catch: java.lang.Exception -> Lba
                r13.<init>(r9)     // Catch: java.lang.Exception -> Lba
                android.content.Intent r9 = new android.content.Intent     // Catch: java.lang.Exception -> Lba
                java.lang.String r10 = "android.intent.action.VIEW"
                r9.<init>(r10)     // Catch: java.lang.Exception -> Lba
                java.lang.String r10 = com.ss.android.socialbase.appdownloader.m.e.m()     // Catch: java.lang.Exception -> Lba
                boolean r11 = com.ss.android.downloadlib.a.h.G(r0, r10)     // Catch: java.lang.Exception -> Lba
                if (r11 == 0) goto L68
                r9.setPackage(r10)     // Catch: java.lang.Exception -> Lba
            L68:
                if (r20 == 0) goto L78
                java.lang.String r10 = "ae"
                java.lang.String r7 = r7.optString(r10)     // Catch: java.lang.Exception -> Lba
                java.lang.String r7 = com.ss.android.socialbase.appdownloader.m.a.b(r7, r8)     // Catch: java.lang.Exception -> Lba
                r13.append(r7)     // Catch: java.lang.Exception -> Lba
                goto L7d
            L78:
                r7 = 335544320(0x14000000, float:6.4623485E-27)
                r9.addFlags(r7)     // Catch: java.lang.Exception -> Lba
            L7d:
                java.lang.String r7 = "mf"
                java.lang.Boolean r8 = java.lang.Boolean.valueOf(r12)     // Catch: java.lang.Exception -> Lba
                com.ss.android.downloadlib.a.h.u(r2, r7, r8)     // Catch: java.lang.Exception -> Lba
                java.lang.String r7 = "if"
                java.lang.Boolean r8 = java.lang.Boolean.valueOf(r20)     // Catch: java.lang.Exception -> Lba
                com.ss.android.downloadlib.a.h.u(r2, r7, r8)     // Catch: java.lang.Exception -> Lba
                java.lang.String r7 = r13.toString()     // Catch: java.lang.Exception -> Lba
                android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch: java.lang.Exception -> Lba
                r9.setData(r7)     // Catch: java.lang.Exception -> Lba
                java.lang.String r7 = "start_only_for_android"
                r9.putExtra(r7, r5)     // Catch: java.lang.Exception -> Lba
                r0.startActivity(r9)     // Catch: java.lang.Exception -> Lba
                java.lang.String r0 = "am_kllk2"
                com.ss.android.downloadlib.j.g.d(r0, r2, r3, r5)     // Catch: java.lang.Exception -> Lba
                if (r12 == 0) goto Lb2
                java.lang.String r0 = r13.toString()     // Catch: java.lang.Exception -> Lba
                r7 = -1
                Q(r3, r2, r7, r6, r0)     // Catch: java.lang.Exception -> Lba
                return
            Lb2:
                java.lang.String r0 = r13.toString()     // Catch: java.lang.Exception -> Lba
                Q(r3, r2, r6, r6, r0)     // Catch: java.lang.Exception -> Lba
                return
            Lba:
                android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                java.lang.String r8 = "market://details?id="
                r7.<init>(r8)
                r7.append(r1)
                java.lang.String r7 = r7.toString()
                android.net.Uri r7 = android.net.Uri.parse(r7)
                com.ss.android.downloadlib.addownload.o$b r0 = i(r0, r7)
                com.ss.android.downloadlib.j.g.a(r0, r3, r5)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>(r8)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                Q(r3, r2, r4, r6, r0)
                return
        }

        static /* synthetic */ void x(android.content.Context r0, java.lang.String r1, java.lang.String r2, com.ss.android.downloadlib.addownload.o.i r3, org.json.JSONObject r4) {
                P(r0, r1, r2, r3, r4)
                return
        }

        static /* synthetic */ void y(com.ss.android.downloadlib.addownload.o.i r0, org.json.JSONObject r1, int r2, int r3, java.lang.String r4) {
                Q(r0, r1, r2, r3, r4)
                return
        }

        public static boolean z(@androidx.annotation.NonNull android.app.Activity r3, android.net.Uri r4) {
                android.content.Intent r0 = new android.content.Intent
                java.lang.String r1 = "android.intent.action.VIEW"
                r0.<init>(r1)
                r0.setData(r4)
                java.lang.String r4 = "start_only_for_android"
                r1 = 1
                r0.putExtra(r4, r1)
                java.lang.String r4 = com.ss.android.socialbase.appdownloader.m.e.m()
                android.content.Context r2 = com.ss.android.downloadlib.addownload.m.getContext()
                boolean r2 = com.ss.android.downloadlib.a.h.G(r2, r4)
                if (r2 == 0) goto L21
                r0.setPackage(r4)
            L21:
                android.content.Context r4 = com.ss.android.downloadlib.addownload.m.getContext()
                boolean r4 = com.ss.android.downloadlib.a.h.x(r4, r0)
                if (r4 == 0) goto L39
                r3.startActivity(r0)     // Catch: java.lang.Exception -> L2f
                return r1
            L2f:
                r3 = move-exception
                com.ss.android.downloadlib.up.a r4 = com.ss.android.downloadlib.up.a.a()
                java.lang.String r0 = "start v2"
                r4.j(r3, r0)
            L39:
                r3 = 0
                return r3
        }
    }

    public class n {
        public n() {
                r1 = this;
                r1.<init>()
                return
        }

        public static boolean A(com.ss.android.xt.j.xt.a r3) {
                com.ss.android.socialbase.downloader.jy.j r0 = k(r3)
                java.lang.String r1 = "pause_reserve_on_wifi"
                r2 = 0
                int r0 = r0.j(r1, r2)
                r1 = 1
                if (r0 != r1) goto L15
                boolean r3 = r3.i()
                if (r3 == 0) goto L15
                return r1
            L15:
                return r2
        }

        public static long a(com.ss.android.xt.j.xt.b r3) {
                com.ss.android.socialbase.downloader.jy.j r3 = k(r3)
                java.lang.String r0 = "ttdownloader_app_install_detect_sum_timestamp"
                r1 = 600000(0x927c0, double:2.964394E-318)
                long r0 = r3.j(r0, r1)
                return r0
        }

        public static boolean b(int r2) {
                com.ss.android.socialbase.downloader.jy.j r2 = com.ss.android.socialbase.downloader.jy.j.j(r2)
                java.lang.String r0 = "clean_app_cache_dir"
                r1 = 0
                int r2 = r2.j(r0, r1)
                r0 = 1
                if (r2 != r0) goto Lf
                return r0
            Lf:
                return r1
        }

        public static int c(@androidx.annotation.NonNull com.ss.android.j.j.cw.b r0) {
                com.ss.android.socialbase.downloader.jy.j r0 = x(r0)
                int r0 = i(r0)
                return r0
        }

        public static long d(int r3) {
                com.ss.android.socialbase.downloader.jy.j r3 = com.ss.android.socialbase.downloader.jy.j.j(r3)
                java.lang.String r0 = "clean_fetch_apk_head_time_out"
                r1 = 800(0x320, double:3.953E-321)
                long r0 = r3.j(r0, r1)
                return r0
        }

        public static boolean e() {
                org.json.JSONObject r0 = com.ss.android.downloadlib.addownload.m.f()
                java.lang.String r1 = "is_enable_start_install_again"
                int r0 = r0.optInt(r1)
                r1 = 1
                if (r0 != r1) goto Le
                return r1
            Le:
                r0 = 0
                return r0
        }

        public static boolean f(com.ss.android.xt.j.xt.a r3) {
                com.ss.android.socialbase.downloader.jy.j r0 = k(r3)
                java.lang.String r1 = "cancel_pause_optimise_wifi_retain_switch"
                r2 = 0
                int r0 = r0.j(r1, r2)
                r1 = 1
                if (r0 != r1) goto L15
                boolean r3 = r3.i()
                if (r3 == 0) goto L15
                return r1
            L15:
                return r2
        }

        public static boolean g(com.ss.android.xt.j.xt.b r4) {
                org.json.JSONObject r0 = com.ss.android.downloadlib.addownload.m.f()
                java.lang.String r1 = "market_install_finish_opt_switch"
                r2 = 0
                int r0 = r0.optInt(r1, r2)
                r3 = 1
                if (r0 == r3) goto L1a
                com.ss.android.socialbase.downloader.jy.j r4 = k(r4)
                int r4 = r4.j(r1, r2)
                if (r4 != r3) goto L19
                goto L1a
            L19:
                return r2
            L1a:
                return r3
        }

        public static double h(int r3) {
                com.ss.android.socialbase.downloader.jy.j r3 = com.ss.android.socialbase.downloader.jy.j.j(r3)
                java.lang.String r0 = "clean_min_install_size"
                r1 = 0
                double r0 = r3.j(r0, r1)
                return r0
        }

        public static int i(@androidx.annotation.NonNull com.ss.android.socialbase.downloader.jy.j r2) {
                java.lang.String r0 = "external_storage_permission_path_type"
                r1 = 0
                int r2 = r2.j(r0, r1)
                return r2
        }

        public static int j(com.ss.android.xt.j.xt.b r2) {
                com.ss.android.socialbase.downloader.jy.j r2 = k(r2)
                java.lang.String r0 = "ttdownloader_app_install_detect_count"
                r1 = 15
                int r2 = r2.j(r0, r1)
                return r2
        }

        @androidx.annotation.NonNull
        public static com.ss.android.socialbase.downloader.jy.j k(com.ss.android.xt.j.xt.a r1) {
                if (r1 != 0) goto L7
                com.ss.android.socialbase.downloader.jy.j r1 = com.ss.android.socialbase.downloader.jy.j.cw()
                return r1
            L7:
                int r0 = r1.mi()
                if (r0 == 0) goto L16
                int r1 = r1.mi()
                com.ss.android.socialbase.downloader.jy.j r1 = com.ss.android.socialbase.downloader.jy.j.j(r1)
                return r1
            L16:
                boolean r0 = r1.cw()
                if (r0 == 0) goto L25
                org.json.JSONObject r1 = l()
                com.ss.android.socialbase.downloader.jy.j r1 = com.ss.android.socialbase.downloader.jy.j.j(r1)
                return r1
            L25:
                org.json.JSONObject r0 = r1.w()
                if (r0 == 0) goto L34
                org.json.JSONObject r1 = r1.w()
                com.ss.android.socialbase.downloader.jy.j r1 = com.ss.android.socialbase.downloader.jy.j.j(r1)
                return r1
            L34:
                com.ss.android.socialbase.downloader.jy.j r1 = com.ss.android.socialbase.downloader.jy.j.cw()
                return r1
        }

        @androidx.annotation.Nullable
        public static org.json.JSONObject l() {
                org.json.JSONObject r0 = com.ss.android.downloadlib.addownload.m.f()
                java.lang.String r1 = "ad"
                org.json.JSONObject r0 = r0.optJSONObject(r1)
                return r0
        }

        public static org.json.JSONObject m(com.ss.android.j.j.cw.b r3) {
                if (r3 != 0) goto L4
                r3 = 0
                return r3
            L4:
                boolean r0 = r3.x()
                if (r0 == 0) goto L20
                org.json.JSONObject r0 = com.ss.android.downloadlib.addownload.m.f()
                org.json.JSONObject r3 = r3.w()
                r1 = 2
                org.json.JSONObject[] r1 = new org.json.JSONObject[r1]
                r2 = 0
                r1[r2] = r0
                r0 = 1
                r1[r0] = r3
                org.json.JSONObject r3 = com.ss.android.downloadlib.a.h.t(r1)
                return r3
            L20:
                org.json.JSONObject r3 = r3.w()
                return r3
        }

        public static int n(com.ss.android.xt.j.xt.b r2) {
                com.ss.android.socialbase.downloader.jy.j r2 = k(r2)
                java.lang.String r0 = "app_install_keep_receiver_time_s"
                r1 = 60
                int r2 = r2.j(r0, r1)
                return r2
        }

        public static boolean o(int r2) {
                com.ss.android.socialbase.downloader.jy.j r2 = com.ss.android.socialbase.downloader.jy.j.j(r2)
                java.lang.String r0 = "clean_space_switch"
                r1 = 0
                int r2 = r2.j(r0, r1)
                r0 = 1
                if (r2 != r0) goto Lf
                return r0
            Lf:
                return r1
        }

        public static long p() {
                org.json.JSONObject r0 = com.ss.android.downloadlib.addownload.m.f()
                java.lang.String r1 = "start_install_interval"
                long r0 = r0.optLong(r1)
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L13
                r0 = 300000(0x493e0, double:1.482197E-318)
            L13:
                return r0
        }

        public static boolean q(int r4) {
                com.ss.android.socialbase.downloader.jy.j r4 = com.ss.android.socialbase.downloader.jy.j.j(r4)
                java.lang.String r0 = "clean_fetch_apk_switch"
                r1 = 0
                long r0 = r4.j(r0, r1)
                r2 = 1
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L14
                r4 = 1
                return r4
            L14:
                r4 = 0
                return r4
        }

        public static boolean r(com.ss.android.xt.j.xt.b r4) {
                org.json.JSONObject r0 = com.ss.android.downloadlib.addownload.m.f()
                java.lang.String r1 = "market_install_finish_opt_broadcast"
                r2 = 0
                int r0 = r0.optInt(r1, r2)
                r3 = 1
                if (r0 == r3) goto L1a
                com.ss.android.socialbase.downloader.jy.j r4 = k(r4)
                int r4 = r4.j(r1, r2)
                if (r4 != r3) goto L19
                goto L1a
            L19:
                return r2
            L1a:
                return r3
        }

        public static long s() {
                org.json.JSONObject r0 = com.ss.android.downloadlib.addownload.m.f()
                java.lang.String r1 = "next_install_min_interval"
                long r0 = r0.optLong(r1)
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L12
                r0 = 10000(0x2710, double:4.9407E-320)
            L12:
                return r0
        }

        public static boolean t(int r4) {
                com.ss.android.socialbase.downloader.jy.j r4 = com.ss.android.socialbase.downloader.jy.j.j(r4)
                java.lang.String r0 = "clean_space_before_download_switch"
                r1 = 0
                long r0 = r4.j(r0, r1)
                r2 = 1
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L14
                r4 = 1
                return r4
            L14:
                r4 = 0
                return r4
        }

        public static boolean u(com.ss.android.xt.j.xt.b r4) {
                org.json.JSONObject r0 = com.ss.android.downloadlib.addownload.m.f()
                java.lang.String r1 = "market_install_finish_opt_polling_thread"
                r2 = 0
                int r0 = r0.optInt(r1, r2)
                r3 = 1
                if (r0 == r3) goto L1a
                com.ss.android.socialbase.downloader.jy.j r4 = k(r4)
                int r4 = r4.j(r1, r2)
                if (r4 != r3) goto L19
                goto L1a
            L19:
                return r2
            L1a:
                return r3
        }

        public static int v(com.ss.android.xt.j.xt.b r2) {
                com.ss.android.socialbase.downloader.jy.j r2 = k(r2)
                java.lang.String r0 = "ttdownloader_app_install_detect_interval_ms"
                r1 = 20000(0x4e20, float:2.8026E-41)
                int r2 = r2.j(r0, r1)
                return r2
        }

        public static long w(int r3) {
                com.ss.android.socialbase.downloader.jy.j r3 = com.ss.android.socialbase.downloader.jy.j.j(r3)
                java.lang.String r0 = "storage_min_size"
                r1 = 0
                long r0 = r3.j(r0, r1)
                return r0
        }

        @androidx.annotation.NonNull
        public static com.ss.android.socialbase.downloader.jy.j x(com.ss.android.j.j.cw.b r0) {
                org.json.JSONObject r0 = m(r0)
                com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.j(r0)
                return r0
        }

        public static boolean y() {
                com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.cw()
                java.lang.String r1 = "fix_notification_anr"
                boolean r0 = r0.j(r1)
                if (r0 == 0) goto Le
                r0 = 1
                return r0
            Le:
                r0 = 0
                return r0
        }

        public static boolean z(com.ss.android.socialbase.downloader.jy.j r2) {
                r0 = 0
                if (r2 == 0) goto Ld
                java.lang.String r1 = "kllk_need_rename_apk"
                int r2 = r2.j(r1, r0)
                r1 = 1
                if (r2 != r1) goto Ld
                return r1
            Ld:
                return r0
        }
    }

    public class o {

        /* renamed from: com.ss.android.downloadlib.a$o$a, reason: collision with other inner class name */
        static /* synthetic */ class C0195a {
            public C0195a() {
                    r1 = this;
                    r1.<init>()
                    return
            }
        }

        private static class b {
            private static com.ss.android.downloadlib.a.o a;

            static {
                    com.ss.android.downloadlib.a$o r0 = new com.ss.android.downloadlib.a$o
                    r1 = 0
                    r0.<init>(r1)
                    com.ss.android.downloadlib.a.o.b.a = r0
                    return
            }

            public b() {
                    r1 = this;
                    r1.<init>()
                    return
            }

            static /* synthetic */ com.ss.android.downloadlib.a.o a() {
                    com.ss.android.downloadlib.a$o r0 = com.ss.android.downloadlib.a.o.b.a
                    return r0
            }
        }

        private o() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ o(com.ss.android.downloadlib.a.o.C0195a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public static com.ss.android.downloadlib.a.o a() {
                com.ss.android.downloadlib.a$o r0 = com.ss.android.downloadlib.a.o.b.a()
                return r0
        }

        public void b(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
                r1 = this;
                boolean r4 = android.text.TextUtils.isEmpty(r2)
                if (r4 != 0) goto L1a
                boolean r4 = android.text.TextUtils.isEmpty(r3)
                if (r4 != 0) goto L1a
                r4 = 2
                java.lang.Object[] r4 = new java.lang.Object[r4]
                r0 = 0
                r4[r0] = r2
                r2 = 1
                r4[r2] = r3
                java.lang.String r2 = "sdk:%s.%s:"
                java.lang.String.format(r2, r4)
            L1a:
                return
        }

        public void c(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
                r2 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r3)
                if (r0 != 0) goto L1c
                boolean r0 = android.text.TextUtils.isEmpty(r4)
                if (r0 != 0) goto L1c
                r0 = 2
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r1 = 0
                r0[r1] = r3
                r3 = 1
                r0[r3] = r4
                java.lang.String r3 = "sdk:%s.%s:"
                java.lang.String r3 = java.lang.String.format(r3, r0)
                goto L1e
            L1c:
                java.lang.String r3 = ""
            L1e:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r3)
                r4.append(r5)
                java.lang.String r3 = r4.toString()
                java.lang.String r4 = "[TTDownloaderLogger]"
                com.bytedance.sdk.component.utils.vl.r(r4, r3)
                return
        }
    }

    public class p extends android.os.Handler {
        java.lang.ref.WeakReference<com.ss.android.downloadlib.a.p.InterfaceC0196a> a;

        /* renamed from: com.ss.android.downloadlib.a$p$a, reason: collision with other inner class name */
        public interface InterfaceC0196a {
            void j(android.os.Message r1);
        }

        public p(android.os.Looper r1, com.ss.android.downloadlib.a.p.InterfaceC0196a r2) {
                r0 = this;
                r0.<init>(r1)
                java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
                r1.<init>(r2)
                r0.a = r1
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r2) {
                r1 = this;
                java.lang.ref.WeakReference<com.ss.android.downloadlib.a$p$a> r0 = r1.a
                java.lang.Object r0 = r0.get()
                com.ss.android.downloadlib.a$p$a r0 = (com.ss.android.downloadlib.a.p.InterfaceC0196a) r0
                if (r0 == 0) goto Lf
                if (r2 == 0) goto Lf
                r0.j(r2)
            Lf:
                return
        }
    }

    public class q {
        static final com.ss.android.downloadlib.a.q.b a = null;

        /* renamed from: com.ss.android.downloadlib.a$q$a, reason: collision with other inner class name */
        static /* synthetic */ class C0197a {
            public C0197a() {
                    r1 = this;
                    r1.<init>()
                    return
            }
        }

        private static class b {
            private b() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            /* synthetic */ b(com.ss.android.downloadlib.a.q.C0197a r1) {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public <T> void a(android.os.AsyncTask<T, ?, ?> r2, T... r3) {
                    r1 = this;
                    java.util.concurrent.Executor r0 = com.bytedance.sdk.component.oq.r.xt.j     // Catch: java.lang.Throwable -> L5
                    r2.executeOnExecutor(r0, r3)     // Catch: java.lang.Throwable -> L5
                L5:
                    return
            }
        }

        @android.annotation.TargetApi(11)
        private static class c extends com.ss.android.downloadlib.a.q.b {
            private c() {
                    r1 = this;
                    r0 = 0
                    r1.<init>(r0)
                    return
            }

            /* synthetic */ c(com.ss.android.downloadlib.a.q.C0197a r1) {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // com.ss.android.downloadlib.a.q.b
            public <T> void a(android.os.AsyncTask<T, ?, ?> r2, T... r3) {
                    r1 = this;
                    java.util.concurrent.Executor r0 = android.os.AsyncTask.THREAD_POOL_EXECUTOR     // Catch: java.lang.Throwable -> L5
                    r2.executeOnExecutor(r0, r3)     // Catch: java.lang.Throwable -> L5
                L5:
                    return
            }
        }

        static {
                com.ss.android.downloadlib.a$q$c r0 = new com.ss.android.downloadlib.a$q$c
                r1 = 0
                r0.<init>(r1)
                com.ss.android.downloadlib.a.q.a = r0
                return
        }

        public q() {
                r1 = this;
                r1.<init>()
                return
        }

        public static <T> void a(android.os.AsyncTask<T, ?, ?> r1, T... r2) {
                com.ss.android.downloadlib.a$q$b r0 = com.ss.android.downloadlib.a.q.a
                r0.a(r1, r2)
                return
        }
    }

    a() {
            r0 = this;
            r0.<init>()
            return
    }

    public r2.a a(com.ss.android.socialbase.downloader.downloader.tl r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.r.wq r0 = r2.x()
            if (r0 != 0) goto Le
            com.ss.android.downloadlib.a$b r0 = new com.ss.android.downloadlib.a$b
            r0.<init>(r1)
            r2.j(r0)
        Le:
            com.ss.android.downloadlib.b$e r0 = new com.ss.android.downloadlib.b$e
            r0.<init>()
            r2.j(r0)
            r0 = 1
            com.ss.android.socialbase.downloader.downloader.ae.j(r2, r0)
            return r1
    }

    public r2.a b(@androidx.annotation.NonNull v2.w r1) {
            r0 = this;
            com.ss.android.downloadlib.addownload.m.s(r1)
            return r0
    }

    public r2.a c(@androidx.annotation.NonNull com.ss.android.j.j.up.b r1) {
            r0 = this;
            com.ss.android.downloadlib.addownload.m.j(r1)
            return r0
    }

    public r2.a d(v2.k r1) {
            r0 = this;
            com.ss.android.downloadlib.addownload.m.o(r1)
            return r0
    }

    public r2.a e(@androidx.annotation.NonNull v2.u r1) {
            r0 = this;
            com.ss.android.downloadlib.addownload.m.r(r1)
            return r0
    }

    public r2.a f(w2.a r2) {
            r1 = this;
            com.ss.android.socialbase.appdownloader.f r0 = com.ss.android.socialbase.appdownloader.f.L()
            r0.A(r2)
            return r1
    }

    public r2.a g(@androidx.annotation.NonNull v2.y r3) {
            r2 = this;
            com.ss.android.downloadlib.addownload.m.t(r3)
            com.ss.android.socialbase.downloader.j.j r0 = com.ss.android.socialbase.downloader.j.j.j()
            com.ss.android.downloadlib.a$a r1 = new com.ss.android.downloadlib.a$a
            r1.<init>(r2, r3)
            r0.j(r1)
            return r2
    }

    public r2.a h(@androidx.annotation.NonNull v2.a r1) {
            r0 = this;
            com.ss.android.downloadlib.addownload.m.m(r1)
            return r0
    }

    public r2.a i(w2.d r1) {
            r0 = this;
            com.ss.android.downloadlib.addownload.m.u(r1)
            return r0
    }

    public r2.a j(java.lang.String r1) {
            r0 = this;
            com.ss.android.downloadlib.addownload.m.k(r1)
            return r0
    }

    public r2.a j(v2.o r1) {
            r0 = this;
            com.ss.android.downloadlib.addownload.m.q(r1)
            return r0
    }

    public void j() {
            r2 = this;
            boolean r0 = com.ss.android.downloadlib.addownload.m.J()
            if (r0 != 0) goto Lf
            com.ss.android.downloadlib.up.a r0 = com.ss.android.downloadlib.up.a.a()
            java.lang.String r1 = "ttdownloader init error"
            r0.c(r1)
        Lf:
            com.ss.android.downloadlib.up.a r0 = com.ss.android.downloadlib.up.a.a()
            com.ss.android.downloadlib.addownload.m.l(r0)
            com.ss.android.socialbase.appdownloader.f r0 = com.ss.android.socialbase.appdownloader.f.L()     // Catch: java.lang.Exception -> L22
            java.lang.String r1 = com.ss.android.downloadlib.addownload.m.F()     // Catch: java.lang.Exception -> L22
            r0.Z(r1)     // Catch: java.lang.Exception -> L22
            goto L26
        L22:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
        L26:
            com.ss.android.socialbase.appdownloader.f r0 = com.ss.android.socialbase.appdownloader.f.L()
            com.ss.android.downloadlib.d r1 = com.ss.android.downloadlib.d.d()
            r0.y(r1)
            com.ss.android.downloadlib.e r0 = com.ss.android.downloadlib.e.c()
            com.ss.android.downloadlib.a$c r1 = new com.ss.android.downloadlib.a$c
            r1.<init>(r2)
            r0.k(r1)
            return
    }

    public r2.a k(@androidx.annotation.NonNull v2.g r1) {
            r0 = this;
            com.ss.android.downloadlib.addownload.m.n(r1)
            return r0
    }

    public r2.a l(@androidx.annotation.NonNull v2.n r1) {
            r0 = this;
            com.ss.android.downloadlib.addownload.m.p(r1)
            return r0
    }
}
