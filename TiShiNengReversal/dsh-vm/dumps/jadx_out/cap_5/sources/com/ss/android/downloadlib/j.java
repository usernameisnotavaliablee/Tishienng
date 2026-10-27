package com.ss.android.downloadlib;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class j implements y2.b {
    private static java.lang.String b = "j";
    private static volatile com.ss.android.downloadlib.j c;
    private com.ss.android.downloadlib.g a;

    class a implements com.ss.android.downloadlib.up.b.InterfaceC0221b<android.app.Dialog> {
        final /* synthetic */ android.content.Context a;
        final /* synthetic */ java.lang.String b;
        final /* synthetic */ boolean c;
        final /* synthetic */ com.ss.android.j.j.cw.b d;
        final /* synthetic */ com.ss.android.j.j.cw.g e;
        final /* synthetic */ com.ss.android.j.j.cw.c f;
        final /* synthetic */ com.ss.android.j.j.cw.e g;
        final /* synthetic */ int h;
        final /* synthetic */ boolean i;
        final /* synthetic */ v2.h j;
        final /* synthetic */ com.ss.android.downloadlib.j k;

        a(com.ss.android.downloadlib.j r1, android.content.Context r2, java.lang.String r3, boolean r4, com.ss.android.j.j.cw.b r5, com.ss.android.j.j.cw.g r6, com.ss.android.j.j.cw.c r7, com.ss.android.j.j.cw.e r8, int r9, boolean r10, v2.h r11) {
                r0 = this;
                r0.k = r1
                r0.a = r2
                r0.b = r3
                r0.c = r4
                r0.d = r5
                r0.e = r6
                r0.f = r7
                r0.g = r8
                r0.h = r9
                r0.i = r10
                r0.j = r11
                r0.<init>()
                return
        }

        public android.app.Dialog a() {
                r11 = this;
                com.ss.android.downloadlib.j r0 = r11.k
                android.content.Context r1 = r11.a
                java.lang.String r2 = r11.b
                boolean r3 = r11.c
                com.ss.android.j.j.cw.b r4 = r11.d
                com.ss.android.j.j.cw.g r5 = r11.e
                com.ss.android.j.j.cw.c r6 = r11.f
                com.ss.android.j.j.cw.e r7 = r11.g
                int r8 = r11.h
                boolean r9 = r11.i
                v2.h r10 = r11.j
                android.app.Dialog r0 = r0.n(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                return r0
        }

        @Override // com.ss.android.downloadlib.up.b.InterfaceC0221b
        public /* synthetic */ android.app.Dialog xt() {
                r1 = this;
                android.app.Dialog r0 = r1.a()
                return r0
        }
    }

    class b implements com.ss.android.j.j.up.a.c {
        final /* synthetic */ com.ss.android.j.j.cw.b a;
        final /* synthetic */ com.ss.android.j.j.cw.g b;
        final /* synthetic */ com.ss.android.j.j.cw.c c;
        final /* synthetic */ com.ss.android.downloadlib.j d;

        b(com.ss.android.downloadlib.j r1, com.ss.android.j.j.cw.b r2, com.ss.android.j.j.cw.g r3, com.ss.android.j.j.cw.c r4) {
                r0 = this;
                r0.d = r1
                r0.a = r2
                r0.b = r3
                r0.c = r4
                r0.<init>()
                return
        }

        @Override // com.ss.android.j.j.up.a.c
        public void cw(android.content.DialogInterface r5) {
                r4 = this;
                com.ss.android.downloadlib.r.b r5 = com.ss.android.downloadlib.r.b.a()
                com.ss.android.j.j.cw.b r0 = r4.a
                com.ss.android.j.j.cw.g r1 = r4.b
                com.ss.android.j.j.cw.c r2 = r4.c
                java.lang.String r3 = "landing_download_dialog_cancel"
                r5.l(r3, r0, r1, r2)
                return
        }

        @Override // com.ss.android.j.j.up.a.c
        public void j(android.content.DialogInterface r9) {
                r8 = this;
                com.ss.android.downloadlib.j r0 = r8.d
                com.ss.android.downloadlib.g r1 = com.ss.android.downloadlib.j.i(r0)
                com.ss.android.j.j.cw.b r0 = r8.a
                java.lang.String r2 = r0.j()
                com.ss.android.j.j.cw.b r0 = r8.a
                long r3 = r0.r()
                com.ss.android.j.j.cw.g r6 = r8.b
                com.ss.android.j.j.cw.c r7 = r8.c
                r5 = 2
                r1.j(r2, r3, r5, r6, r7)
                com.ss.android.downloadlib.r.b r0 = com.ss.android.downloadlib.r.b.a()
                com.ss.android.j.j.cw.b r1 = r8.a
                com.ss.android.j.j.cw.g r2 = r8.b
                com.ss.android.j.j.cw.c r3 = r8.c
                java.lang.String r4 = "landing_download_dialog_confirm"
                r0.l(r4, r1, r2, r3)
                r9.dismiss()
                return
        }

        @Override // com.ss.android.j.j.up.a.c
        public void xt(android.content.DialogInterface r6) {
                r5 = this;
                com.ss.android.downloadlib.r.b r0 = com.ss.android.downloadlib.r.b.a()
                com.ss.android.j.j.cw.b r1 = r5.a
                com.ss.android.j.j.cw.g r2 = r5.b
                com.ss.android.j.j.cw.c r3 = r5.c
                java.lang.String r4 = "landing_download_dialog_cancel"
                r0.l(r4, r1, r2, r3)
                r6.dismiss()
                return
        }
    }

    class c implements com.ss.android.downloadlib.up.b.InterfaceC0221b<java.lang.Boolean> {
        final /* synthetic */ android.content.Context a;
        final /* synthetic */ android.net.Uri b;
        final /* synthetic */ com.ss.android.j.j.cw.b c;
        final /* synthetic */ com.ss.android.j.j.cw.g d;
        final /* synthetic */ com.ss.android.j.j.cw.c e;
        final /* synthetic */ v2.h f;
        final /* synthetic */ com.ss.android.downloadlib.j g;

        c(com.ss.android.downloadlib.j r1, android.content.Context r2, android.net.Uri r3, com.ss.android.j.j.cw.b r4, com.ss.android.j.j.cw.g r5, com.ss.android.j.j.cw.c r6, v2.h r7) {
                r0 = this;
                r0.g = r1
                r0.a = r2
                r0.b = r3
                r0.c = r4
                r0.d = r5
                r0.e = r6
                r0.f = r7
                r0.<init>()
                return
        }

        public java.lang.Boolean a() {
                r7 = this;
                com.ss.android.downloadlib.j r0 = r7.g
                android.content.Context r1 = r7.a
                android.net.Uri r2 = r7.b
                com.ss.android.j.j.cw.b r3 = r7.c
                com.ss.android.j.j.cw.g r4 = r7.d
                com.ss.android.j.j.cw.c r5 = r7.e
                v2.h r6 = r7.f
                boolean r0 = com.ss.android.downloadlib.j.m(r0, r1, r2, r3, r4, r5, r6)
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
        }

        @Override // com.ss.android.downloadlib.up.b.InterfaceC0221b
        public /* synthetic */ java.lang.Boolean xt() {
                r1 = this;
                java.lang.Boolean r0 = r1.a()
                return r0
        }
    }

    public interface d {
        void j(boolean r1);
    }

    public class e {

        static class a implements com.ss.android.socialbase.downloader.j.j.j {
            final /* synthetic */ com.ss.android.xt.j.xt.b a;
            final /* synthetic */ com.ss.android.downloadlib.guide.install.a b;

            a(com.ss.android.xt.j.xt.b r1, com.ss.android.downloadlib.guide.install.a r2) {
                    r0 = this;
                    r0.a = r1
                    r0.b = r2
                    r0.<init>()
                    return
            }

            public void cw() {
                    r0 = this;
                    return
            }

            public void xt() {
                    r3 = this;
                    java.lang.String r0 = "AppInstallOptimiseHelper"
                    java.lang.String r1 = "AppInstallOptimiseHelper-->onAppForeground"
                    com.ss.android.socialbase.downloader.m.j.xt(r0, r1)
                    com.ss.android.socialbase.downloader.j.j r0 = com.ss.android.socialbase.downloader.j.j.j()
                    r0.xt(r3)
                    com.ss.android.xt.j.xt.b r0 = r3.a
                    boolean r0 = com.ss.android.downloadlib.a.h.M(r0)
                    if (r0 != 0) goto L2c
                    com.ss.android.xt.j.xt.b r0 = r3.a
                    r1 = 1
                    r0.O(r1)
                    com.ss.android.downloadlib.r.b r0 = com.ss.android.downloadlib.r.b.a()
                    java.lang.String r1 = "install_delay_invoke"
                    com.ss.android.xt.j.xt.b r2 = r3.a
                    r0.m(r1, r2)
                    com.ss.android.downloadlib.guide.install.a r0 = r3.b
                    r0.j()
                L2c:
                    return
            }
        }

        public e() {
                r1 = this;
                r1.<init>()
                return
        }

        public static void a(com.ss.android.xt.j.xt.b r3, @androidx.annotation.NonNull com.ss.android.downloadlib.guide.install.a r4) {
                com.ss.android.socialbase.downloader.j.j r0 = com.ss.android.socialbase.downloader.j.j.j()
                boolean r0 = r0.xt()
                if (r0 != 0) goto L13
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 29
                if (r1 < r2) goto L13
                com.ss.android.downloadlib.a.h.c()
            L13:
                com.ss.android.socialbase.downloader.j.j r1 = com.ss.android.socialbase.downloader.j.j.j()
                boolean r1 = r1.xt()
                if (r0 != 0) goto L25
                if (r1 == 0) goto L25
                if (r3 == 0) goto L25
                r0 = 1
                r3.N0(r0)
            L25:
                r4.j()
                java.lang.String r0 = "AppInstallOptimiseHelper-->isAppForegroundSecond:::"
                java.lang.String r2 = java.lang.String.valueOf(r1)
                java.lang.String r0 = r0.concat(r2)
                java.lang.String r2 = "AppInstallOptimiseHelper"
                com.ss.android.socialbase.downloader.m.j.xt(r2, r0)
                if (r1 != 0) goto L45
                com.ss.android.socialbase.downloader.j.j r0 = com.ss.android.socialbase.downloader.j.j.j()
                com.ss.android.downloadlib.j$e$a r1 = new com.ss.android.downloadlib.j$e$a
                r1.<init>(r3, r4)
                r0.j(r1)
            L45:
                return
        }
    }

    public class f {
        public f() {
                r1 = this;
                r1.<init>()
                return
        }

        public static boolean a(@androidx.annotation.NonNull com.ss.android.xt.j.xt.a r2) {
                boolean r0 = com.ss.android.socialbase.appdownloader.m.e.r()
                if (r0 == 0) goto L30
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                if (r0 >= r1) goto L30
                v2.y r0 = com.ss.android.downloadlib.addownload.m.G()
                if (r0 == 0) goto L30
                v2.y r0 = com.ss.android.downloadlib.addownload.m.G()
                boolean r0 = r0.j()
                if (r0 == 0) goto L30
                com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.downloadlib.a.n.k(r2)
                java.lang.String r1 = "invoke_app_form_background_switch"
                int r0 = r0.xt(r1)
                r1 = 1
                if (r0 != r1) goto L30
                boolean r2 = r2.i()
                if (r2 == 0) goto L30
                return r1
            L30:
                r2 = 0
                return r2
        }
    }

    public class g {
        private static final java.lang.String a = "j$g";

        static class a implements com.ss.android.downloadlib.j.InterfaceC0216j {
            final /* synthetic */ org.json.JSONObject a;
            final /* synthetic */ com.ss.android.xt.j.xt.a b;

            a(org.json.JSONObject r1, com.ss.android.xt.j.xt.a r2) {
                    r0 = this;
                    r0.a = r1
                    r0.b = r2
                    r0.<init>()
                    return
            }

            @Override // com.ss.android.downloadlib.j.InterfaceC0216j
            public void j(boolean r5) {
                    r4 = this;
                    com.ss.android.downloadlib.r.b r0 = com.ss.android.downloadlib.r.b.a()
                    if (r5 == 0) goto L9
                    java.lang.String r1 = "deeplink_success"
                    goto Lb
                L9:
                    java.lang.String r1 = "deeplink_failed"
                Lb:
                    org.json.JSONObject r2 = r4.a
                    com.ss.android.xt.j.xt.a r3 = r4.b
                    r0.x(r1, r2, r3)
                    if (r5 == 0) goto L29
                    com.ss.android.downloadlib.addownload.m.C()
                    com.ss.android.downloadlib.addownload.m.getContext()
                    com.ss.android.xt.j.xt.a r5 = r4.b
                    r5.tj()
                    com.ss.android.xt.j.xt.a r5 = r4.b
                    r5.v()
                    com.ss.android.xt.j.xt.a r5 = r4.b
                    r5.f()
                L29:
                    return
            }
        }

        static class b implements com.ss.android.downloadlib.j.InterfaceC0216j {
            final /* synthetic */ org.json.JSONObject a;
            final /* synthetic */ com.ss.android.xt.j.xt.a b;

            b(org.json.JSONObject r1, com.ss.android.xt.j.xt.a r2) {
                    r0 = this;
                    r0.a = r1
                    r0.b = r2
                    r0.<init>()
                    return
            }

            @Override // com.ss.android.downloadlib.j.InterfaceC0216j
            public void j(boolean r5) {
                    r4 = this;
                    com.ss.android.downloadlib.r.b r0 = com.ss.android.downloadlib.r.b.a()
                    if (r5 == 0) goto L9
                    java.lang.String r1 = "deeplink_success"
                    goto Lb
                L9:
                    java.lang.String r1 = "deeplink_failed"
                Lb:
                    org.json.JSONObject r2 = r4.a
                    com.ss.android.xt.j.xt.a r3 = r4.b
                    r0.x(r1, r2, r3)
                    if (r5 == 0) goto L29
                    com.ss.android.downloadlib.addownload.m.C()
                    com.ss.android.downloadlib.addownload.m.getContext()
                    com.ss.android.xt.j.xt.a r5 = r4.b
                    r5.tj()
                    com.ss.android.xt.j.xt.a r5 = r4.b
                    r5.v()
                    com.ss.android.xt.j.xt.a r5 = r4.b
                    r5.f()
                L29:
                    return
            }
        }

        static class c implements com.ss.android.downloadlib.j.InterfaceC0216j {
            final /* synthetic */ java.lang.String a;
            final /* synthetic */ com.ss.android.downloadlib.addownload.o.i b;
            final /* synthetic */ org.json.JSONObject c;

            c(java.lang.String r1, com.ss.android.downloadlib.addownload.o.i r2, org.json.JSONObject r3) {
                    r0 = this;
                    r0.a = r1
                    r0.b = r2
                    r0.c = r3
                    r0.<init>()
                    return
            }

            @Override // com.ss.android.downloadlib.j.InterfaceC0216j
            public void j(boolean r5) {
                    r4 = this;
                    if (r5 != 0) goto L32
                    java.lang.String r0 = "open_market"
                    java.lang.String r1 = r4.a
                    boolean r0 = r0.equals(r1)
                    if (r0 != 0) goto L32
                    android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    java.lang.String r2 = "market://details?id="
                    r1.<init>(r2)
                    com.ss.android.downloadlib.addownload.o$i r2 = r4.b
                    java.lang.String r2 = r2.up()
                    r1.append(r2)
                    java.lang.String r1 = r1.toString()
                    android.net.Uri r1 = android.net.Uri.parse(r1)
                    com.ss.android.downloadlib.addownload.o$b r0 = com.ss.android.downloadlib.a.f.b(r0, r1)
                    com.ss.android.downloadlib.addownload.o$i r1 = r4.b
                    r2 = 0
                    com.ss.android.downloadlib.j.g.a(r0, r1, r2)
                L32:
                    com.ss.android.downloadlib.r.b r0 = com.ss.android.downloadlib.r.b.a()
                    if (r5 == 0) goto L3b
                    java.lang.String r1 = "market_delay_success"
                    goto L3d
                L3b:
                    java.lang.String r1 = "market_delay_failed"
                L3d:
                    org.json.JSONObject r2 = r4.c
                    com.ss.android.downloadlib.addownload.o$i r3 = r4.b
                    r0.r(r1, r2, r3)
                    if (r5 == 0) goto L4c
                    com.ss.android.downloadlib.addownload.m.C()
                    com.ss.android.downloadlib.addownload.m.getContext()
                L4c:
                    return
            }
        }

        static {
                return
        }

        public g() {
                r0 = this;
                r0.<init>()
                return
        }

        public static void a(com.ss.android.downloadlib.addownload.o.b r4, com.ss.android.downloadlib.addownload.o.i r5, boolean r6) {
                java.lang.String r0 = r4.b()
                java.lang.String r1 = "open_market"
                java.lang.String[] r0 = new java.lang.String[]{r0, r1}
                java.lang.String r0 = com.ss.android.downloadlib.a.h.q(r0)
                org.json.JSONObject r1 = new org.json.JSONObject
                r1.<init>()
                java.lang.String r2 = "ttdownloader_type"
                java.lang.String r3 = "backup"
                com.ss.android.downloadlib.a.h.u(r1, r2, r3)
                int r2 = r4.getType()
                r3 = 5
                if (r2 == r3) goto L49
                r6 = 6
                if (r2 == r6) goto L25
                return
            L25:
                int r4 = r4.a()
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                java.lang.String r6 = "error_code"
                com.ss.android.downloadlib.a.h.u(r1, r6, r4)
                int r4 = r5.kt()
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                java.lang.String r6 = "download_scene"
                com.ss.android.downloadlib.a.h.u(r1, r6, r4)
                com.ss.android.downloadlib.r.b r4 = com.ss.android.downloadlib.r.b.a()
                java.lang.String r6 = "market_open_failed"
                r4.x(r6, r1, r5)
                return
            L49:
                d(r0, r1, r5, r6)
                return
        }

        public static void b(@androidx.annotation.NonNull com.ss.android.xt.j.xt.b r6) {
                java.lang.String r0 = r6.m()
                org.json.JSONObject r1 = new org.json.JSONObject
                r1.<init>()
                org.json.JSONObject r1 = com.ss.android.downloadlib.a.i.b(r1, r6)
                java.lang.String r2 = "applink_source"
                java.lang.String r3 = "notify_click_by_sdk"
                com.ss.android.downloadlib.a.h.u(r1, r2, r3)
                com.ss.android.downloadlib.r.b r2 = com.ss.android.downloadlib.r.b.a()
                java.lang.String r3 = "applink_click"
                r2.x(r3, r1, r6)
                com.ss.android.downloadlib.addownload.o$b r2 = com.ss.android.downloadlib.a.f.h(r0, r6)
                int r3 = r2.getType()
                r4 = 2
                java.lang.String r5 = "notify_by_url"
                if (r3 != r4) goto L3f
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L33
                k(r5, r2, r1, r6)
            L33:
                android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
                java.lang.String r2 = r6.up()
                com.ss.android.downloadlib.addownload.o$b r2 = com.ss.android.downloadlib.a.f.e(r0, r2, r6)
            L3f:
                int r0 = r2.getType()
                r3 = 1
                if (r0 == r3) goto L60
                r3 = 3
                java.lang.String r4 = "notify_by_package"
                if (r0 == r3) goto L5c
                r3 = 4
                if (r0 == r3) goto L58
                com.ss.android.downloadlib.up.a r6 = com.ss.android.downloadlib.up.a.a()
                java.lang.String r0 = "AppLinkClickNotification default"
                r6.f(r0)
                return
            L58:
                c(r4, r2, r1, r6)
                return
            L5c:
                e(r4, r1, r6)
                return
            L60:
                l(r5, r1, r6)
                return
        }

        public static void c(java.lang.String r1, @androidx.annotation.NonNull com.ss.android.downloadlib.addownload.o.b r2, @androidx.annotation.NonNull org.json.JSONObject r3, @androidx.annotation.NonNull com.ss.android.xt.j.xt.a r4) {
                java.lang.String r0 = "applink_source"
                com.ss.android.downloadlib.a.h.u(r3, r0, r1)
                int r1 = r2.a()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.String r2 = "error_code"
                com.ss.android.downloadlib.a.h.u(r3, r2, r1)
                int r1 = r4.kt()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.String r2 = "download_scene"
                com.ss.android.downloadlib.a.h.u(r3, r2, r1)
                com.ss.android.downloadlib.r.b r1 = com.ss.android.downloadlib.r.b.a()
                java.lang.String r2 = "deeplink_app_open_fail"
                r1.x(r2, r3, r4)
                return
        }

        public static void d(java.lang.String r4, @androidx.annotation.Nullable org.json.JSONObject r5, com.ss.android.downloadlib.addownload.o.i r6, boolean r7) {
                java.lang.String r0 = "onMarketSuccess"
                if (r5 == 0) goto L5
                goto La
            L5:
                org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Exception -> L28
                r5.<init>()     // Catch: java.lang.Exception -> L28
            La:
                java.lang.String r1 = "applink_source"
                com.ss.android.downloadlib.a.h.u(r5, r1, r4)     // Catch: java.lang.Exception -> L28
                java.lang.String r1 = "download_scene"
                int r2 = r6.kt()     // Catch: java.lang.Exception -> L28
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L28
                com.ss.android.downloadlib.a.h.u(r5, r1, r2)     // Catch: java.lang.Exception -> L28
                if (r7 == 0) goto L2b
                com.ss.android.downloadlib.r.b r7 = com.ss.android.downloadlib.r.b.a()     // Catch: java.lang.Exception -> L28
                java.lang.String r1 = "market_open_success"
                r7.x(r1, r5, r6)     // Catch: java.lang.Exception -> L28
                goto L2b
            L28:
                r4 = move-exception
                goto La9
            L2b:
                org.json.JSONObject r7 = com.ss.android.downloadlib.addownload.m.f()     // Catch: java.lang.Exception -> L28
                java.lang.String r1 = "check_applink_mode"
                int r7 = r7.optInt(r1)     // Catch: java.lang.Exception -> L28
                r1 = 4
                r7 = r7 & r1
                if (r7 == 0) goto L46
                com.ss.android.downloadlib.j$l r7 = com.ss.android.downloadlib.j.l.b()     // Catch: java.lang.Exception -> L28
                com.ss.android.downloadlib.j$g$c r2 = new com.ss.android.downloadlib.j$g$c     // Catch: java.lang.Exception -> L28
                r2.<init>(r4, r6, r5)     // Catch: java.lang.Exception -> L28
                r7.e(r2)     // Catch: java.lang.Exception -> L28
                goto L4c
            L46:
                com.ss.android.downloadlib.addownload.m.K()     // Catch: java.lang.Exception -> L28
                com.ss.android.downloadlib.addownload.m.getContext()     // Catch: java.lang.Exception -> L28
            L4c:
                com.ss.android.downloadlib.addownload.o$f r4 = com.ss.android.downloadlib.addownload.o.f.c()     // Catch: java.lang.Exception -> L28
                com.ss.android.j.j.cw.b r5 = r6.b     // Catch: java.lang.Exception -> L28
                java.lang.String r5 = r5.s()     // Catch: java.lang.Exception -> L28
                com.ss.android.xt.j.xt.b r4 = r4.g(r5)     // Catch: java.lang.Exception -> L28
                if (r4 == 0) goto L68
                com.ss.android.downloadlib.a$o r5 = com.ss.android.downloadlib.a.o.a()     // Catch: java.lang.Exception -> L28
                java.lang.String r7 = com.ss.android.downloadlib.j.g.a     // Catch: java.lang.Exception -> L28
                java.lang.String r2 = "商店场景,缓存中已有NativeDownloadModel记录,进行复用"
                r5.b(r7, r0, r2)     // Catch: java.lang.Exception -> L28
                goto L7e
            L68:
                com.ss.android.downloadlib.a$o r4 = com.ss.android.downloadlib.a.o.a()     // Catch: java.lang.Exception -> L28
                java.lang.String r5 = com.ss.android.downloadlib.j.g.a     // Catch: java.lang.Exception -> L28
                java.lang.String r7 = "商店场景,缓存中没有相应的NativeDownloadModel,需要新建"
                r4.b(r5, r0, r7)     // Catch: java.lang.Exception -> L28
                com.ss.android.xt.j.xt.b r4 = new com.ss.android.xt.j.xt.b     // Catch: java.lang.Exception -> L28
                com.ss.android.j.j.cw.b r5 = r6.b     // Catch: java.lang.Exception -> L28
                com.ss.android.j.j.cw.g r7 = r6.c     // Catch: java.lang.Exception -> L28
                com.ss.android.j.j.cw.c r2 = r6.d     // Catch: java.lang.Exception -> L28
                r4.<init>(r5, r7, r2)     // Catch: java.lang.Exception -> L28
            L7e:
                r5 = 2
                r4.G0(r5)     // Catch: java.lang.Exception -> L28
                long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L28
                r4.V(r2)     // Catch: java.lang.Exception -> L28
                r4.B0(r1)     // Catch: java.lang.Exception -> L28
                r4.y(r5)     // Catch: java.lang.Exception -> L28
                com.ss.android.downloadlib.addownload.o$f r5 = com.ss.android.downloadlib.addownload.o.f.c()     // Catch: java.lang.Exception -> L28
                r5.l(r4)     // Catch: java.lang.Exception -> L28
                com.ss.android.downloadlib.a$o r5 = com.ss.android.downloadlib.a.o.a()     // Catch: java.lang.Exception -> L28
                java.lang.String r7 = com.ss.android.downloadlib.j.g.a     // Catch: java.lang.Exception -> L28
                java.lang.String r1 = "检测到跳商店成功事件,准备开始检测安装行为"
                r5.b(r7, r0, r1)     // Catch: java.lang.Exception -> L28
                com.ss.android.downloadlib.f r5 = com.ss.android.downloadlib.f.a()     // Catch: java.lang.Exception -> L28
                r5.c(r6, r4)     // Catch: java.lang.Exception -> L28
                return
            La9:
                com.ss.android.downloadlib.up.a r5 = com.ss.android.downloadlib.up.a.a()
                r5.j(r4, r0)
                return
        }

        public static void e(java.lang.String r3, @androidx.annotation.NonNull org.json.JSONObject r4, @androidx.annotation.NonNull com.ss.android.xt.j.xt.a r5) {
                java.lang.String r0 = "applink_source"
                com.ss.android.downloadlib.a.h.u(r4, r0, r3)
                int r0 = r5.kt()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                java.lang.String r1 = "download_scene"
                com.ss.android.downloadlib.a.h.u(r4, r1, r0)
                com.ss.android.downloadlib.r.b r0 = com.ss.android.downloadlib.r.b.a()
                java.lang.String r1 = "deeplink_app_open"
                r0.x(r1, r4, r5)
                r3.getClass()
                int r0 = r3.hashCode()
                r1 = 1
                r2 = -1
                switch(r0) {
                    case -1282070764: goto L49;
                    case -441514770: goto L3e;
                    case -185950114: goto L33;
                    case 368401333: goto L28;
                    default: goto L27;
                }
            L27:
                goto L53
            L28:
                java.lang.String r0 = "dialog_by_package"
                boolean r3 = r3.equals(r0)
                if (r3 != 0) goto L31
                goto L53
            L31:
                r2 = 3
                goto L53
            L33:
                java.lang.String r0 = "by_package"
                boolean r3 = r3.equals(r0)
                if (r3 != 0) goto L3c
                goto L53
            L3c:
                r2 = 2
                goto L53
            L3e:
                java.lang.String r0 = "auto_by_package"
                boolean r3 = r3.equals(r0)
                if (r3 != 0) goto L47
                goto L53
            L47:
                r2 = 1
                goto L53
            L49:
                java.lang.String r0 = "notify_by_package"
                boolean r3 = r3.equals(r0)
                if (r3 != 0) goto L52
                goto L53
            L52:
                r2 = 0
            L53:
                switch(r2) {
                    case 0: goto L57;
                    case 1: goto L57;
                    case 2: goto L57;
                    case 3: goto L57;
                    default: goto L56;
                }
            L56:
                return
            L57:
                org.json.JSONObject r3 = com.ss.android.downloadlib.addownload.m.f()
                java.lang.String r0 = "check_applink_mode"
                int r3 = r3.optInt(r0)
                r3 = r3 & r1
                if (r3 == 0) goto L7a
                java.lang.String r3 = "check_applink_result_by_sdk"
                java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
                com.ss.android.downloadlib.a.h.u(r4, r3, r0)
                com.ss.android.downloadlib.j$l r3 = com.ss.android.downloadlib.j.l.b()
                com.ss.android.downloadlib.j$g$a r0 = new com.ss.android.downloadlib.j$g$a
                r0.<init>(r4, r5)
                r3.c(r0)
                return
            L7a:
                com.ss.android.downloadlib.addownload.m.K()
                com.ss.android.downloadlib.addownload.m.getContext()
                r5.tj()
                r5.v()
                r5.f()
                return
        }

        public static boolean f(long r1) {
                com.ss.android.downloadlib.addownload.o$f r0 = com.ss.android.downloadlib.addownload.o.f.c()
                com.ss.android.xt.j.xt.b r1 = r0.q(r1)
                if (r1 != 0) goto Lc
                r1 = 1
                return r1
            Lc:
                r1 = 0
                return r1
        }

        public static boolean g(@androidx.annotation.NonNull com.ss.android.downloadlib.addownload.o.i r10) {
                com.ss.android.j.j.cw.b r0 = r10.b
                com.ss.android.j.j.up.f r0 = r0.l()
                if (r0 != 0) goto La
                r0 = 0
                goto Le
            La:
                java.lang.String r0 = r0.f()
            Le:
                org.json.JSONObject r1 = new org.json.JSONObject
                r1.<init>()
                org.json.JSONObject r1 = com.ss.android.downloadlib.a.i.b(r1, r10)
                java.lang.String r2 = "applink_source"
                java.lang.String r3 = "click_by_sdk"
                com.ss.android.downloadlib.a.h.u(r1, r2, r3)
                com.ss.android.downloadlib.r.b r2 = com.ss.android.downloadlib.r.b.a()
                java.lang.String r3 = "applink_click"
                r2.x(r3, r1, r10)
                com.ss.android.downloadlib.addownload.o$b r2 = com.ss.android.downloadlib.a.f.h(r0, r10)
                int r3 = r2.getType()
                java.lang.String r4 = "by_url"
                r5 = 2
                if (r3 != r5) goto L4b
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L3d
                k(r4, r2, r1, r10)
            L3d:
                android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
                com.ss.android.j.j.cw.b r2 = r10.b
                java.lang.String r2 = r2.s()
                com.ss.android.downloadlib.addownload.o$b r2 = com.ss.android.downloadlib.a.f.e(r0, r2, r10)
            L4b:
                long r6 = r10.a
                boolean r0 = f(r6)
                r3 = 4
                r6 = 0
                r7 = 1
                if (r0 == 0) goto L78
                org.json.JSONObject r0 = com.ss.android.downloadlib.addownload.m.f()
                java.lang.String r8 = "link_ad_click_event"
                int r0 = r0.optInt(r8)
                if (r0 != r7) goto L78
                com.ss.android.j.j.cw.b r0 = r10.b
                boolean r8 = r0 instanceof com.ss.android.xt.j.j.a
                if (r8 == 0) goto L6d
                com.ss.android.xt.j.j.a r0 = (com.ss.android.xt.j.j.a) r0
                r0.e(r3)
            L6d:
                com.ss.android.downloadlib.r.b r0 = com.ss.android.downloadlib.r.b.a()
                long r8 = r10.a
                r0.c(r8, r6)
                r0 = 1
                goto L79
            L78:
                r0 = 0
            L79:
                int r8 = r2.getType()
                if (r8 == r7) goto L99
                r4 = 3
                java.lang.String r9 = "by_package"
                if (r8 == r4) goto L94
                if (r8 == r3) goto L90
                com.ss.android.downloadlib.up.a r1 = com.ss.android.downloadlib.up.a.a()
                java.lang.String r2 = "AppLinkClick default"
                r1.f(r2)
                goto L9d
            L90:
                c(r9, r2, r1, r10)
                goto L9d
            L94:
                e(r9, r1, r10)
            L97:
                r6 = 1
                goto L9d
            L99:
                l(r4, r1, r10)
                goto L97
            L9d:
                if (r6 == 0) goto Ld0
                if (r0 != 0) goto Ld0
                com.ss.android.downloadlib.r.a r0 = com.ss.android.downloadlib.r.a.c()
                boolean r0 = r0.e()
                if (r0 == 0) goto Lbd
                com.ss.android.downloadlib.r.a r0 = com.ss.android.downloadlib.r.a.c()
                long r1 = r10.a
                com.ss.android.j.j.cw.b r3 = r10.b
                java.lang.String r3 = r3.ch()
                boolean r0 = r0.f(r1, r3)
                if (r0 == 0) goto Lc7
            Lbd:
                com.ss.android.downloadlib.r.a r0 = com.ss.android.downloadlib.r.a.c()
                boolean r0 = r0.b()
                if (r0 == 0) goto Ld0
            Lc7:
                com.ss.android.downloadlib.r.b r0 = com.ss.android.downloadlib.r.b.a()
                long r1 = r10.a
                r0.c(r1, r5)
            Ld0:
                return r6
        }

        public static boolean h(@androidx.annotation.NonNull com.ss.android.downloadlib.addownload.o.i r7, int r8) {
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>()
                int r1 = r7.kt()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.String r2 = "download_scene"
                com.ss.android.downloadlib.a.h.u(r0, r2, r1)
                com.ss.android.downloadlib.r.b r1 = com.ss.android.downloadlib.r.b.a()
                java.lang.String r3 = "market_click_open"
                r1.x(r3, r0, r7)
                android.content.Context r1 = com.ss.android.downloadlib.addownload.m.getContext()
                com.ss.android.j.j.cw.b r3 = r7.b
                java.lang.String r3 = r3.s()
                com.ss.android.downloadlib.addownload.o$b r1 = com.ss.android.downloadlib.a.f.c(r1, r7, r3)
                java.lang.String r3 = r1.b()
                java.lang.String r4 = "open_market"
                java.lang.String[] r3 = new java.lang.String[]{r3, r4}
                java.lang.String r3 = com.ss.android.downloadlib.a.h.q(r3)
                int r4 = r1.getType()
                r5 = 5
                r6 = 1
                if (r4 == r5) goto L69
                r3 = 6
                r5 = 0
                if (r4 == r3) goto L47
                r0 = 7
                if (r4 == r0) goto L6c
                return r5
            L47:
                int r8 = r1.a()
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                java.lang.String r1 = "error_code"
                com.ss.android.downloadlib.a.h.u(r0, r1, r8)
                int r8 = r7.kt()
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                com.ss.android.downloadlib.a.h.u(r0, r2, r8)
                com.ss.android.downloadlib.r.b r8 = com.ss.android.downloadlib.r.b.a()
                java.lang.String r1 = "market_open_failed"
                r8.x(r1, r0, r7)
                return r5
            L69:
                d(r3, r0, r7, r6)
            L6c:
                com.ss.android.downloadlib.r.b r0 = com.ss.android.downloadlib.r.b.a()
                long r1 = r7.a
                r0.c(r1, r8)
                return r6
        }

        public static boolean i(java.lang.String r6, @androidx.annotation.NonNull com.ss.android.xt.j.xt.b r7) {
                int r0 = r7.t0()
                boolean r0 = com.ss.android.downloadlib.addownload.d.k(r0)
                r1 = 0
                if (r0 != 0) goto Lc
                return r1
            Lc:
                java.lang.String r0 = r7.m()
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L1d
                boolean r6 = android.text.TextUtils.isEmpty(r6)
                if (r6 == 0) goto L1d
                return r1
            L1d:
                com.ss.android.socialbase.downloader.notification.xt r6 = com.ss.android.socialbase.downloader.notification.xt.j()
                int r0 = r7.mi()
                r6.m(r0)
                org.json.JSONObject r6 = new org.json.JSONObject
                r6.<init>()
                com.ss.android.downloadlib.a.i.b(r6, r7)
                java.lang.String r0 = "applink_source"
                java.lang.String r2 = "auto_click"
                com.ss.android.downloadlib.a.h.u(r6, r0, r2)
                com.ss.android.downloadlib.r.b r0 = com.ss.android.downloadlib.r.b.a()
                java.lang.String r2 = "applink_click"
                r0.w(r2, r7)
                java.lang.String r0 = r7.m()
                java.lang.String r2 = r7.up()
                com.ss.android.downloadlib.addownload.o$b r0 = com.ss.android.downloadlib.a.f.f(r7, r0, r2)
                int r2 = r0.getType()
                java.lang.String r3 = "auto_by_url"
                r4 = 1
                if (r2 == r4) goto L6d
                r5 = 2
                if (r2 == r5) goto L69
                r3 = 3
                java.lang.String r5 = "auto_by_package"
                if (r2 == r3) goto L65
                r3 = 4
                if (r2 == r3) goto L61
                return r1
            L61:
                c(r5, r0, r6, r7)
                return r1
            L65:
                e(r5, r6, r7)
                return r4
            L69:
                k(r3, r0, r6, r7)
                return r1
            L6d:
                l(r3, r6, r7)
                return r4
        }

        public static void j(com.ss.android.xt.j.xt.b r7) {
                if (r7 != 0) goto L3
                return
            L3:
                com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.cw()
                java.lang.String r1 = "app_link_opt"
                int r0 = r0.xt(r1)
                r1 = 1
                if (r0 != r1) goto L15
                java.lang.String r0 = r7.m()
                goto L16
            L15:
                r0 = 0
            L16:
                org.json.JSONObject r2 = new org.json.JSONObject
                r2.<init>()
                org.json.JSONObject r2 = com.ss.android.downloadlib.a.i.b(r2, r7)
                java.lang.String r3 = "applink_source"
                java.lang.String r4 = "dialog_click_by_sdk"
                com.ss.android.downloadlib.a.h.u(r2, r3, r4)
                com.ss.android.downloadlib.r.b r3 = com.ss.android.downloadlib.r.b.a()
                java.lang.String r4 = "applink_click"
                r3.x(r4, r2, r7)
                com.ss.android.downloadlib.addownload.o$b r3 = com.ss.android.downloadlib.a.f.h(r0, r7)
                int r4 = r3.getType()
                r5 = 2
                java.lang.String r6 = "dialog_by_url"
                if (r4 != r5) goto L51
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L45
                k(r6, r3, r2, r7)
            L45:
                android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
                java.lang.String r3 = r7.up()
                com.ss.android.downloadlib.addownload.o$b r3 = com.ss.android.downloadlib.a.f.e(r0, r3, r7)
            L51:
                int r0 = r3.getType()
                if (r0 == r1) goto L71
                r1 = 3
                java.lang.String r4 = "dialog_by_package"
                if (r0 == r1) goto L6d
                r1 = 4
                if (r0 == r1) goto L69
                com.ss.android.downloadlib.up.a r7 = com.ss.android.downloadlib.up.a.a()
                java.lang.String r0 = "AppLinkClickDialog default"
                r7.f(r0)
                return
            L69:
                c(r4, r3, r2, r7)
                return
            L6d:
                e(r4, r2, r7)
                return
            L71:
                l(r6, r2, r7)
                return
        }

        public static void k(java.lang.String r1, @androidx.annotation.NonNull com.ss.android.downloadlib.addownload.o.b r2, @androidx.annotation.NonNull org.json.JSONObject r3, @androidx.annotation.NonNull com.ss.android.xt.j.xt.a r4) {
                java.lang.String r0 = "applink_source"
                com.ss.android.downloadlib.a.h.u(r3, r0, r1)
                int r1 = r2.a()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.String r2 = "error_code"
                com.ss.android.downloadlib.a.h.u(r3, r2, r1)
                int r1 = r4.kt()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.String r2 = "download_scene"
                com.ss.android.downloadlib.a.h.u(r3, r2, r1)
                com.ss.android.downloadlib.r.b r1 = com.ss.android.downloadlib.r.b.a()
                java.lang.String r2 = "deeplink_url_open_fail"
                r1.x(r2, r3, r4)
                return
        }

        public static void l(java.lang.String r3, @androidx.annotation.NonNull org.json.JSONObject r4, @androidx.annotation.NonNull com.ss.android.xt.j.xt.a r5) {
                java.lang.String r0 = "applink_source"
                com.ss.android.downloadlib.a.h.u(r4, r0, r3)
                int r0 = r5.kt()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                java.lang.String r1 = "download_scene"
                com.ss.android.downloadlib.a.h.u(r4, r1, r0)
                com.ss.android.downloadlib.r.b r0 = com.ss.android.downloadlib.r.b.a()
                java.lang.String r1 = "deeplink_url_open"
                r0.x(r1, r4, r5)
                r3.getClass()
                int r0 = r3.hashCode()
                r1 = 1
                r2 = -1
                switch(r0) {
                    case -1721882089: goto L49;
                    case -1374618233: goto L3e;
                    case -129544387: goto L33;
                    case 829750366: goto L28;
                    default: goto L27;
                }
            L27:
                goto L53
            L28:
                java.lang.String r0 = "dialog_by_url"
                boolean r3 = r3.equals(r0)
                if (r3 != 0) goto L31
                goto L53
            L31:
                r2 = 3
                goto L53
            L33:
                java.lang.String r0 = "notify_by_url"
                boolean r3 = r3.equals(r0)
                if (r3 != 0) goto L3c
                goto L53
            L3c:
                r2 = 2
                goto L53
            L3e:
                java.lang.String r0 = "by_url"
                boolean r3 = r3.equals(r0)
                if (r3 != 0) goto L47
                goto L53
            L47:
                r2 = 1
                goto L53
            L49:
                java.lang.String r0 = "auto_by_url"
                boolean r3 = r3.equals(r0)
                if (r3 != 0) goto L52
                goto L53
            L52:
                r2 = 0
            L53:
                switch(r2) {
                    case 0: goto L57;
                    case 1: goto L57;
                    case 2: goto L57;
                    case 3: goto L57;
                    default: goto L56;
                }
            L56:
                return
            L57:
                org.json.JSONObject r3 = com.ss.android.downloadlib.addownload.m.f()
                java.lang.String r0 = "check_applink_mode"
                int r3 = r3.optInt(r0)
                r3 = r3 & r1
                if (r3 == 0) goto L7a
                java.lang.String r3 = "check_applink_result_by_sdk"
                java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
                com.ss.android.downloadlib.a.h.u(r4, r3, r0)
                com.ss.android.downloadlib.j$l r3 = com.ss.android.downloadlib.j.l.b()
                com.ss.android.downloadlib.j$g$b r0 = new com.ss.android.downloadlib.j$g$b
                r0.<init>(r4, r5)
                r3.c(r0)
                return
            L7a:
                com.ss.android.downloadlib.addownload.m.K()
                com.ss.android.downloadlib.addownload.m.getContext()
                r5.tj()
                r5.v()
                r5.f()
                return
        }
    }

    public class h {
        private static android.os.Handler a;

        static class a implements com.ss.android.socialbase.downloader.j.j.j {
            final /* synthetic */ com.ss.android.xt.j.xt.b a;
            final /* synthetic */ long b;
            final /* synthetic */ com.ss.android.downloadlib.j.k c;

            /* renamed from: com.ss.android.downloadlib.j$h$a$a, reason: collision with other inner class name */
            class RunnableC0215a implements java.lang.Runnable {
                final /* synthetic */ com.ss.android.downloadlib.j.h.a a;

                RunnableC0215a(com.ss.android.downloadlib.j.h.a r1) {
                        r0 = this;
                        r0.a = r1
                        r0.<init>()
                        return
                }

                @Override // java.lang.Runnable
                public void run() {
                        r7 = this;
                        com.ss.android.downloadlib.j$h$a r0 = r7.a
                        com.ss.android.xt.j.xt.b r0 = r0.a
                        java.lang.String r0 = r0.up()
                        boolean r0 = com.ss.android.downloadlib.a.h.d(r0)
                        com.ss.android.downloadlib.j$h$a r1 = r7.a
                        com.ss.android.xt.j.xt.b r1 = r1.a
                        long r1 = com.ss.android.downloadlib.j.h.k(r1)
                        if (r0 == 0) goto L25
                        long r3 = java.lang.System.currentTimeMillis()
                        com.ss.android.downloadlib.j$h$a r0 = r7.a
                        long r5 = r0.b
                        long r3 = r3 - r5
                        int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                        if (r0 < 0) goto L24
                        goto L25
                    L24:
                        return
                    L25:
                        com.ss.android.downloadlib.j$h$a r0 = r7.a
                        com.ss.android.xt.j.xt.b r0 = r0.a
                        long r0 = com.ss.android.downloadlib.j.h.g(r0)
                        long r2 = java.lang.System.currentTimeMillis()
                        com.ss.android.downloadlib.j$h$a r4 = r7.a
                        long r5 = r4.b
                        long r2 = r2 - r5
                        int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                        if (r5 <= 0) goto L48
                        com.ss.android.downloadlib.r.b r0 = com.ss.android.downloadlib.r.b.a()
                        com.ss.android.downloadlib.j$h$a r1 = r7.a
                        com.ss.android.xt.j.xt.b r1 = r1.a
                        java.lang.String r2 = "deeplink_delay_timeout"
                        r0.m(r2, r1)
                        return
                    L48:
                        com.ss.android.xt.j.xt.b r0 = r4.a
                        r1 = 1
                        r0.N0(r1)
                        com.ss.android.downloadlib.r.b r0 = com.ss.android.downloadlib.r.b.a()
                        com.ss.android.downloadlib.j$h$a r2 = r7.a
                        com.ss.android.xt.j.xt.b r2 = r2.a
                        java.lang.String r3 = "deeplink_delay_invoke"
                        r0.m(r3, r2)
                        com.ss.android.downloadlib.j$h$a r0 = r7.a
                        com.ss.android.downloadlib.j$k r0 = r0.c
                        r0.j(r1)
                        com.ss.android.downloadlib.j$h$a r0 = r7.a
                        com.ss.android.xt.j.xt.b r0 = r0.a
                        int r1 = com.ss.android.downloadlib.j.h.a(r0)
                        com.ss.android.downloadlib.j.h.d(r0, r1)
                        return
                }
            }

            a(com.ss.android.xt.j.xt.b r1, long r2, com.ss.android.downloadlib.j.k r4) {
                    r0 = this;
                    r0.a = r1
                    r0.b = r2
                    r0.c = r4
                    r0.<init>()
                    return
            }

            public void cw() {
                    r0 = this;
                    return
            }

            public void xt() {
                    r2 = this;
                    com.ss.android.socialbase.downloader.j.j r0 = com.ss.android.socialbase.downloader.j.j.j()
                    r0.xt(r2)
                    com.ss.android.downloadlib.e r0 = com.ss.android.downloadlib.e.c()
                    com.ss.android.downloadlib.j$h$a$a r1 = new com.ss.android.downloadlib.j$h$a$a
                    r1.<init>(r2)
                    r0.d(r1)
                    return
            }
        }

        static class b implements java.lang.Runnable {
            final /* synthetic */ com.ss.android.xt.j.xt.b a;
            final /* synthetic */ int b;

            b(com.ss.android.xt.j.xt.b r1, int r2) {
                    r0 = this;
                    r0.a = r1
                    r0.b = r2
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r4 = this;
                    com.ss.android.xt.j.xt.b r0 = r4.a
                    java.lang.String r0 = r0.up()
                    boolean r0 = com.ss.android.downloadlib.a.h.d(r0)
                    r1 = 1
                    if (r0 == 0) goto L36
                    org.json.JSONObject r0 = new org.json.JSONObject
                    r0.<init>()
                    java.lang.String r2 = "deeplink_source"
                    com.ss.android.xt.j.xt.b r3 = r4.a     // Catch: org.json.JSONException -> L26
                    boolean r3 = r3.P()     // Catch: org.json.JSONException -> L26
                    if (r3 == 0) goto L1d
                    goto L1e
                L1d:
                    r1 = 2
                L1e:
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: org.json.JSONException -> L26
                    r0.putOpt(r2, r1)     // Catch: org.json.JSONException -> L26
                    goto L2a
                L26:
                    r1 = move-exception
                    com.bytedance.sdk.component.utils.vl.j(r1)
                L2a:
                    com.ss.android.downloadlib.r.b r1 = com.ss.android.downloadlib.r.b.a()
                    java.lang.String r2 = "deeplink_success_2"
                    com.ss.android.xt.j.xt.b r3 = r4.a
                    r1.r(r2, r0, r3)
                    return
                L36:
                    int r0 = r4.b
                    int r0 = r0 - r1
                    com.ss.android.xt.j.xt.b r1 = r4.a
                    com.ss.android.downloadlib.j.h.d(r1, r0)
                    return
            }
        }

        static {
                android.os.Handler r0 = new android.os.Handler
                android.os.Looper r1 = android.os.Looper.getMainLooper()
                r0.<init>(r1)
                com.ss.android.downloadlib.j.h.a = r0
                return
        }

        public h() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ int a(com.ss.android.xt.j.xt.b r0) {
                int r0 = h(r0)
                return r0
        }

        public static boolean b(com.ss.android.xt.j.xt.b r1) {
                com.ss.android.socialbase.downloader.jy.j r1 = com.ss.android.downloadlib.a.n.k(r1)
                java.lang.String r0 = "app_link_opt_invoke_switch"
                int r1 = r1.xt(r0)
                r0 = 1
                if (r1 != r0) goto Le
                return r0
            Le:
                r1 = 0
                return r1
        }

        private static int c(com.ss.android.xt.j.xt.b r2) {
                com.ss.android.socialbase.downloader.jy.j r2 = com.ss.android.downloadlib.a.n.k(r2)
                java.lang.String r0 = "app_link_check_delay"
                r1 = 1
                int r2 = r2.j(r0, r1)
                return r2
        }

        static /* synthetic */ void d(com.ss.android.xt.j.xt.b r0, int r1) {
                l(r0, r1)
                return
        }

        public static void e(com.ss.android.xt.j.xt.b r4, @androidx.annotation.NonNull com.ss.android.downloadlib.j.k r5) {
                com.ss.android.socialbase.downloader.j.j r0 = com.ss.android.socialbase.downloader.j.j.j()
                boolean r0 = r0.xt()
                if (r0 != 0) goto L13
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 29
                if (r1 < r2) goto L13
                com.ss.android.downloadlib.a.h.c()
            L13:
                com.ss.android.socialbase.downloader.j.j r1 = com.ss.android.socialbase.downloader.j.j.j()
                boolean r1 = r1.xt()
                if (r0 != 0) goto L21
                if (r1 == 0) goto L21
                r0 = 1
                goto L22
            L21:
                r0 = 0
            L22:
                if (r4 == 0) goto L27
                r4.N0(r0)
            L27:
                r5.j(r0)
                if (r4 != 0) goto L2d
                goto L36
            L2d:
                int r0 = h(r4)
                l(r4, r0)
                if (r1 == 0) goto L37
            L36:
                return
            L37:
                long r0 = java.lang.System.currentTimeMillis()
                com.ss.android.socialbase.downloader.j.j r2 = com.ss.android.socialbase.downloader.j.j.j()
                com.ss.android.downloadlib.j$h$a r3 = new com.ss.android.downloadlib.j$h$a
                r3.<init>(r4, r0, r5)
                r2.j(r3)
                return
        }

        public static boolean f(com.ss.android.xt.j.xt.b r1) {
                com.ss.android.socialbase.downloader.jy.j r1 = com.ss.android.downloadlib.a.n.k(r1)
                java.lang.String r0 = "app_link_opt_switch"
                int r1 = r1.xt(r0)
                r0 = 1
                if (r1 == r0) goto Lf
                r1 = 0
                return r1
            Lf:
                return r0
        }

        static /* synthetic */ long g(com.ss.android.xt.j.xt.b r2) {
                long r0 = j(r2)
                return r0
        }

        private static int h(com.ss.android.xt.j.xt.b r2) {
                com.ss.android.socialbase.downloader.jy.j r2 = com.ss.android.downloadlib.a.n.k(r2)
                java.lang.String r0 = "app_link_check_count"
                r1 = 10
                int r2 = r2.j(r0, r1)
                return r2
        }

        public static boolean i(com.ss.android.xt.j.xt.b r1) {
                com.ss.android.socialbase.downloader.jy.j r1 = com.ss.android.downloadlib.a.n.k(r1)
                java.lang.String r0 = "app_link_opt_dialog_switch"
                int r1 = r1.xt(r0)
                r0 = 1
                if (r1 != r0) goto Le
                return r0
            Le:
                r1 = 0
                return r1
        }

        private static long j(com.ss.android.xt.j.xt.b r3) {
                com.ss.android.socialbase.downloader.jy.j r3 = com.ss.android.downloadlib.a.n.k(r3)
                java.lang.String r0 = "app_link_check_timeout"
                r1 = 300000(0x493e0, double:1.482197E-318)
                long r0 = r3.j(r0, r1)
                return r0
        }

        public static long k(com.ss.android.xt.j.xt.b r2) {
                if (r2 != 0) goto L5
                r0 = 3000(0xbb8, double:1.482E-320)
                return r0
            L5:
                com.ss.android.socialbase.downloader.jy.j r2 = com.ss.android.downloadlib.a.n.k(r2)
                java.lang.String r0 = "app_link_opt_back_time_limit"
                r1 = 3
                int r2 = r2.j(r0, r1)
                int r2 = r2 * 1000
                long r0 = (long) r2
                return r0
        }

        private static void l(@androidx.annotation.NonNull com.ss.android.xt.j.xt.b r3, int r4) {
                if (r4 > 0) goto L3
                return
            L3:
                int r0 = c(r3)
                int r0 = r0 * 1000
                com.ss.android.downloadlib.e r1 = com.ss.android.downloadlib.e.c()
                com.ss.android.downloadlib.j$h$b r2 = new com.ss.android.downloadlib.j$h$b
                r2.<init>(r3, r4)
                long r3 = (long) r0
                r1.e(r2, r3)
                return
        }

        public static boolean m(com.ss.android.xt.j.xt.b r1) {
                com.ss.android.socialbase.downloader.jy.j r1 = com.ss.android.downloadlib.a.n.k(r1)
                java.lang.String r0 = "app_link_opt_install_switch"
                int r1 = r1.xt(r0)
                r0 = 1
                if (r1 != r0) goto Le
                return r0
            Le:
                r1 = 0
                return r1
        }
    }

    public class i {
        public i() {
                r1 = this;
                r1.<init>()
                return
        }

        public static boolean a(android.net.Uri r0) {
                boolean r0 = t2.a.b(r0)
                return r0
        }
    }

    /* renamed from: com.ss.android.downloadlib.j$j, reason: collision with other inner class name */
    public interface InterfaceC0216j {
        void j(boolean r1);
    }

    public interface k {
        void j(boolean r1);
    }

    public class l implements com.ss.android.socialbase.downloader.j.j.j {
        private long a;

        class a implements java.lang.Runnable {
            final /* synthetic */ long a;
            final /* synthetic */ com.ss.android.downloadlib.j.InterfaceC0216j b;
            final /* synthetic */ com.ss.android.downloadlib.j.l c;

            a(com.ss.android.downloadlib.j.l r1, long r2, com.ss.android.downloadlib.j.InterfaceC0216j r4) {
                    r0 = this;
                    r0.c = r1
                    r0.a = r2
                    r0.b = r4
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r5 = this;
                    com.ss.android.socialbase.downloader.j.j r0 = com.ss.android.socialbase.downloader.j.j.j()
                    boolean r0 = r0.cw()
                    if (r0 == 0) goto L23
                    long r0 = java.lang.System.currentTimeMillis()
                    com.ss.android.downloadlib.j$l r2 = r5.c
                    long r2 = com.ss.android.downloadlib.j.l.a(r2)
                    long r0 = r0 - r2
                    long r2 = r5.a
                    int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    if (r4 > 0) goto L1c
                    goto L23
                L1c:
                    com.ss.android.downloadlib.j$j r0 = r5.b
                    r1 = 0
                    r0.j(r1)
                    return
                L23:
                    com.ss.android.downloadlib.j$j r0 = r5.b
                    r1 = 1
                    r0.j(r1)
                    return
            }
        }

        private static class b {
            private static com.ss.android.downloadlib.j.l a;

            static {
                    com.ss.android.downloadlib.j$l r0 = new com.ss.android.downloadlib.j$l
                    r1 = 0
                    r0.<init>(r1)
                    com.ss.android.downloadlib.j.l.b.a = r0
                    return
            }

            public b() {
                    r1 = this;
                    r1.<init>()
                    return
            }

            static /* synthetic */ com.ss.android.downloadlib.j.l a() {
                    com.ss.android.downloadlib.j$l r0 = com.ss.android.downloadlib.j.l.b.a
                    return r0
            }
        }

        private l() {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.a = r0
                com.ss.android.socialbase.downloader.j.j r0 = com.ss.android.socialbase.downloader.j.j.j()
                r0.j(r2)
                return
        }

        /* synthetic */ l(com.ss.android.downloadlib.j.l.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ long a(com.ss.android.downloadlib.j.l r2) {
                long r0 = r2.a
                return r0
        }

        public static com.ss.android.downloadlib.j.l b() {
                com.ss.android.downloadlib.j$l r0 = com.ss.android.downloadlib.j.l.b.a()
                return r0
        }

        public void c(com.ss.android.downloadlib.j.InterfaceC0216j r3) {
                r2 = this;
                r0 = 5000(0x1388, double:2.4703E-320)
                r2.d(r3, r0)
                return
        }

        public void cw() {
                r0 = this;
                return
        }

        public void d(com.ss.android.downloadlib.j.InterfaceC0216j r3, long r4) {
                r2 = this;
                if (r3 != 0) goto L3
                return
            L3:
                com.ss.android.downloadlib.e r0 = com.ss.android.downloadlib.e.c()
                com.ss.android.downloadlib.j$l$a r1 = new com.ss.android.downloadlib.j$l$a
                r1.<init>(r2, r4, r3)
                r0.e(r1, r4)
                return
        }

        public void e(com.ss.android.downloadlib.j.InterfaceC0216j r4) {
                r3 = this;
                if (r4 != 0) goto L3
                return
            L3:
                org.json.JSONObject r0 = com.ss.android.downloadlib.addownload.m.f()
                java.lang.String r1 = "check_an_result_delay"
                r2 = 1200(0x4b0, float:1.682E-42)
                int r0 = r0.optInt(r1, r2)
                if (r0 <= 0) goto L12
                r2 = r0
            L12:
                long r0 = (long) r2
                r3.d(r4, r0)
                return
        }

        public void xt() {
                r2 = this;
                long r0 = java.lang.System.currentTimeMillis()
                r2.a = r0
                return
        }
    }

    public class m {

        class a implements java.lang.Runnable {
            final /* synthetic */ com.ss.android.xt.j.xt.b a;
            final /* synthetic */ com.ss.android.downloadlib.j.d b;
            final /* synthetic */ com.ss.android.downloadlib.j.m c;

            /* renamed from: com.ss.android.downloadlib.j$m$a$a, reason: collision with other inner class name */
            class C0218a implements com.ss.android.downloadlib.j.k {
                final /* synthetic */ com.ss.android.downloadlib.j.m.a a;

                C0218a(com.ss.android.downloadlib.j.m.a r1) {
                        r0 = this;
                        r0.a = r1
                        r0.<init>()
                        return
                }

                @Override // com.ss.android.downloadlib.j.k
                public void j(boolean r2) {
                        r1 = this;
                        com.ss.android.downloadlib.j$m$a r0 = r1.a
                        com.ss.android.downloadlib.j$d r0 = r0.b
                        r0.j(r2)
                        return
                }
            }

            a(com.ss.android.downloadlib.j.m r1, com.ss.android.xt.j.xt.b r2, com.ss.android.downloadlib.j.d r3) {
                    r0 = this;
                    r0.c = r1
                    r0.a = r2
                    r0.b = r3
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r2 = this;
                    com.ss.android.xt.j.xt.b r0 = r2.a
                    boolean r0 = com.ss.android.downloadlib.j.f.a(r0)
                    r1 = 0
                    if (r0 == 0) goto Lf
                    com.ss.android.downloadlib.j$d r0 = r2.b
                    r0.j(r1)
                    return
                Lf:
                    com.ss.android.xt.j.xt.b r0 = r2.a
                    boolean r0 = com.ss.android.downloadlib.j.h.f(r0)
                    if (r0 != 0) goto L1d
                    com.ss.android.downloadlib.j$d r0 = r2.b
                    r0.j(r1)
                    return
                L1d:
                    com.ss.android.xt.j.xt.b r0 = r2.a
                    com.ss.android.downloadlib.j$m$a$a r1 = new com.ss.android.downloadlib.j$m$a$a
                    r1.<init>(r2)
                    com.ss.android.downloadlib.j.h.e(r0, r1)
                    return
            }
        }

        public m() {
                r0 = this;
                r0.<init>()
                return
        }

        public void a(@androidx.annotation.NonNull com.ss.android.xt.j.xt.b r3, @androidx.annotation.NonNull com.ss.android.downloadlib.j.d r4, int r5) {
                r2 = this;
                com.ss.android.downloadlib.e r0 = com.ss.android.downloadlib.e.c()
                com.ss.android.downloadlib.j$m$a r1 = new com.ss.android.downloadlib.j$m$a
                r1.<init>(r2, r3, r4)
                long r3 = (long) r5
                r0.e(r1, r3)
                return
        }
    }

    static {
            return
    }

    private j() {
            r1 = this;
            r1.<init>()
            android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
            com.ss.android.downloadlib.g r0 = com.ss.android.downloadlib.g.c(r0)
            r1.a = r0
            return
    }

    public static com.ss.android.j.j.cw.g f() {
            com.ss.android.xt.j.j.c$a r0 = new com.ss.android.xt.j.j.c$a
            r0.<init>()
            java.lang.String r1 = "landing_h5_download_ad_button"
            com.ss.android.xt.j.j.c$a r0 = r0.g(r1)
            com.ss.android.xt.j.j.c$a r0 = r0.p(r1)
            java.lang.String r1 = "click_start_detail"
            com.ss.android.xt.j.j.c$a r0 = r0.m(r1)
            java.lang.String r1 = "click_pause_detail"
            com.ss.android.xt.j.j.c$a r0 = r0.o(r1)
            java.lang.String r1 = "click_continue_detail"
            com.ss.android.xt.j.j.c$a r0 = r0.k(r1)
            java.lang.String r1 = "click_install_detail"
            com.ss.android.xt.j.j.c$a r0 = r0.a(r1)
            java.lang.String r1 = "click_open_detail"
            com.ss.android.xt.j.j.c$a r0 = r0.n(r1)
            java.lang.String r1 = "storage_deny_detail"
            com.ss.android.xt.j.j.c$a r0 = r0.d(r1)
            r1 = 1
            com.ss.android.xt.j.j.c$a r0 = r0.e(r1)
            r2 = 0
            com.ss.android.xt.j.j.c$a r0 = r0.i(r2)
            com.ss.android.xt.j.j.c$a r0 = r0.r(r1)
            com.ss.android.xt.j.j.c$a r0 = r0.c(r2)
            com.ss.android.xt.j.j.c r0 = r0.j()
            return r0
    }

    static /* synthetic */ com.ss.android.downloadlib.g i(com.ss.android.downloadlib.j r0) {
            com.ss.android.downloadlib.g r0 = r0.a
            return r0
    }

    public static com.ss.android.downloadlib.j j() {
            com.ss.android.downloadlib.j r0 = com.ss.android.downloadlib.j.c
            if (r0 != 0) goto L19
            java.lang.Class<com.ss.android.downloadlib.j> r0 = com.ss.android.downloadlib.j.class
            monitor-enter(r0)
            com.ss.android.downloadlib.j r1 = com.ss.android.downloadlib.j.c     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.ss.android.downloadlib.j r1 = new com.ss.android.downloadlib.j     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.ss.android.downloadlib.j.c = r1     // Catch: java.lang.Throwable -> L13
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
            com.ss.android.downloadlib.j r0 = com.ss.android.downloadlib.j.c
            return r0
    }

    public static com.ss.android.j.j.cw.c k(boolean r3) {
            com.ss.android.xt.j.j.b$a r0 = new com.ss.android.xt.j.j.b$a
            r0.<init>()
            r1 = 0
            com.ss.android.xt.j.j.b$a r0 = r0.e(r1)
            r2 = 1
            com.ss.android.xt.j.j.b$a r0 = r0.h(r2)
            com.ss.android.xt.j.j.b$a r0 = r0.c(r1)
            com.ss.android.xt.j.j.b$a r0 = r0.l(r1)
            if (r3 == 0) goto L1e
            r3 = 2
            r0.o(r3)
            goto L21
        L1e:
            r0.o(r1)
        L21:
            com.ss.android.xt.j.j.b r3 = r0.i()
            return r3
    }

    static /* synthetic */ boolean m(com.ss.android.downloadlib.j r0, android.content.Context r1, android.net.Uri r2, com.ss.android.j.j.cw.b r3, com.ss.android.j.j.cw.g r4, com.ss.android.j.j.cw.c r5, v2.h r6) {
            boolean r0 = r0.q(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public static com.ss.android.j.j.cw.c o() {
            r0 = 0
            com.ss.android.j.j.cw.c r0 = k(r0)
            return r0
    }

    private boolean q(android.content.Context r13, android.net.Uri r14, com.ss.android.j.j.cw.b r15, com.ss.android.j.j.cw.g r16, com.ss.android.j.j.cw.c r17, v2.h r18) {
            r12 = this;
            r0 = r17
            boolean r1 = t2.a.b(r14)
            r6 = 0
            if (r1 != 0) goto La
            return r6
        La:
            org.json.JSONObject r1 = com.ss.android.downloadlib.addownload.m.f()
            java.lang.String r2 = "disable_market"
            int r1 = r1.optInt(r2)
            r7 = 1
            if (r1 != r7) goto L18
            return r6
        L18:
            if (r13 != 0) goto L1e
            android.content.Context r13 = com.ss.android.downloadlib.addownload.m.getContext()
        L1e:
            java.lang.String r8 = t2.a.c(r14)
            r9 = 5
            if (r15 != 0) goto L31
            com.ss.android.downloadlib.addownload.o$b r13 = com.ss.android.downloadlib.a.f.d(r13, r8)
            int r13 = r13.getType()
            if (r13 != r9) goto L30
            return r7
        L30:
            return r6
        L31:
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            if (r1 != 0) goto L41
            boolean r1 = r15 instanceof com.ss.android.xt.j.j.a
            if (r1 == 0) goto L41
            r1 = r15
            com.ss.android.xt.j.j.a r1 = (com.ss.android.xt.j.j.a) r1
            r1.z(r8)
        L41:
            r1 = 2
            if (r0 == 0) goto L49
            r0.j(r1)
        L47:
            r5 = r0
            goto L7c
        L49:
            boolean r0 = r15 instanceof com.ss.android.xt.j.j.a
            if (r0 == 0) goto L66
            java.lang.String r0 = r15.j()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L66
            r0 = r15
            com.ss.android.xt.j.j.a r0 = (com.ss.android.xt.j.j.a) r0
            java.lang.String r2 = r14.toString()
            r0.v(r2)
            com.ss.android.j.j.cw.c r0 = k(r7)
            goto L47
        L66:
            java.lang.String r0 = r15.j()
            java.lang.String r2 = "market"
            boolean r0 = r0.startsWith(r2)
            if (r0 == 0) goto L77
            com.ss.android.j.j.cw.c r0 = k(r7)
            goto L47
        L77:
            com.ss.android.j.j.cw.c r0 = o()
            goto L47
        L7c:
            com.ss.android.downloadlib.addownload.o$i r0 = new com.ss.android.downloadlib.addownload.o$i
            long r10 = r15.r()
            com.ss.android.j.j.cw.g r2 = f()
            com.ss.android.j.j.cw.g[] r1 = new com.ss.android.j.j.cw.g[r1]
            r1[r6] = r16
            r1[r7] = r2
            java.lang.Object r1 = com.ss.android.downloadlib.a.h.n(r1)
            r4 = r1
            com.ss.android.j.j.cw.g r4 = (com.ss.android.j.j.cw.g) r4
            r3 = r15
            r1 = r10
            r0.<init>(r1, r3, r4, r5)
            com.ss.android.downloadlib.addownload.o$f r1 = com.ss.android.downloadlib.addownload.o.f.c()
            com.ss.android.j.j.cw.b r2 = r0.b
            r1.k(r2)
            com.ss.android.downloadlib.addownload.o$f r1 = com.ss.android.downloadlib.addownload.o.f.c()
            long r4 = r0.a
            com.ss.android.j.j.cw.g r2 = r0.c
            r1.j(r4, r2)
            com.ss.android.downloadlib.addownload.o$f r1 = com.ss.android.downloadlib.addownload.o.f.c()
            long r4 = r0.a
            com.ss.android.j.j.cw.c r2 = r0.d
            r1.i(r4, r2)
            boolean r1 = com.ss.android.downloadlib.a.h.z(r15)
            if (r1 == 0) goto Ld0
            com.ss.android.socialbase.downloader.jy.j r1 = com.ss.android.socialbase.downloader.jy.j.cw()
            java.lang.String r2 = "app_link_opt"
            int r1 = r1.xt(r2)
            if (r1 != r7) goto Ld0
            boolean r1 = com.ss.android.downloadlib.j.g.g(r0)
            if (r1 == 0) goto Ld0
            return r7
        Ld0:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "market_url"
            java.lang.String r14 = r14.toString()
            com.ss.android.downloadlib.a.h.u(r1, r2, r14)
            java.lang.String r14 = "download_scene"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            com.ss.android.downloadlib.a.h.u(r1, r14, r2)
            com.ss.android.downloadlib.r.b r14 = com.ss.android.downloadlib.r.b.a()
            java.lang.String r2 = "market_click_open"
            r14.x(r2, r1, r0)
            com.ss.android.downloadlib.addownload.o$b r13 = com.ss.android.downloadlib.a.f.c(r13, r0, r8)
            java.lang.String r14 = r13.b()
            java.lang.String r2 = "open_market"
            java.lang.String[] r14 = new java.lang.String[]{r14, r2}
            java.lang.String r14 = com.ss.android.downloadlib.a.h.q(r14)
            int r2 = r13.getType()
            if (r2 != r9) goto L10c
            com.ss.android.downloadlib.j.g.d(r14, r1, r0, r7)
            return r7
        L10c:
            int r14 = r13.getType()
            r2 = 6
            if (r14 != r2) goto L135
            int r13 = r13.a()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.String r14 = "error_code"
            com.ss.android.downloadlib.a.h.u(r1, r14, r13)
            com.ss.android.downloadlib.r.b r13 = com.ss.android.downloadlib.r.b.a()
            java.lang.String r14 = "market_open_failed"
            r13.x(r14, r1, r0)
            r13 = r18
            boolean r14 = com.ss.android.downloadlib.addownload.d.h(r15, r13)
            if (r14 == 0) goto L134
            r13.j()
        L134:
            return r6
        L135:
            return r7
    }

    public android.app.Dialog a(android.content.Context r11, java.lang.String r12, boolean r13, @androidx.annotation.NonNull com.ss.android.j.j.cw.b r14, com.ss.android.j.j.cw.g r15, com.ss.android.j.j.cw.c r16, com.ss.android.j.j.cw.e r17, int r18) {
            r10 = this;
            r9 = 0
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            android.app.Dialog r11 = r0.g(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r11
    }

    public boolean b(android.content.Context r9, android.net.Uri r10, com.ss.android.j.j.cw.b r11, com.ss.android.j.j.cw.g r12, com.ss.android.j.j.cw.c r13, v2.h r14) {
            r8 = this;
            com.ss.android.downloadlib.j$c r0 = new com.ss.android.downloadlib.j$c
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r9 = com.ss.android.downloadlib.up.b.a(r0)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            return r9
    }

    public boolean c(android.content.Context r8, android.net.Uri r9, com.ss.android.j.j.cw.b r10, com.ss.android.j.j.cw.g r11, com.ss.android.j.j.cw.c r12) {
            r7 = this;
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            boolean r8 = r0.b(r1, r2, r3, r4, r5, r6)
            return r8
    }

    public boolean d(android.content.Context r2, long r3, java.lang.String r5, com.ss.android.j.j.cw.e r6, int r7) {
            r1 = this;
            com.ss.android.downloadlib.addownload.o$f r5 = com.ss.android.downloadlib.addownload.o.f.c()
            com.ss.android.xt.j.xt.b r5 = r5.q(r3)
            r0 = 1
            if (r5 == 0) goto L15
            com.ss.android.downloadlib.g r3 = r1.a
            com.ss.android.xt.j.j.a r4 = r5.h0()
            r3.h(r2, r7, r6, r4)
            return r0
        L15:
            com.ss.android.downloadlib.addownload.o$f r5 = com.ss.android.downloadlib.addownload.o.f.c()
            com.ss.android.j.j.cw.b r3 = r5.d(r3)
            if (r3 == 0) goto L25
            com.ss.android.downloadlib.g r4 = r1.a
            r4.h(r2, r7, r6, r3)
            return r0
        L25:
            r2 = 0
            return r2
    }

    public android.app.Dialog e(android.content.Context r12, java.lang.String r13, boolean r14, @androidx.annotation.NonNull com.ss.android.j.j.cw.b r15, com.ss.android.j.j.cw.g r16, com.ss.android.j.j.cw.c r17, com.ss.android.j.j.cw.e r18, int r19, v2.h r20) {
            r11 = this;
            r9 = 0
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r10 = r20
            android.app.Dialog r12 = r0.h(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r12
    }

    public android.app.Dialog g(android.content.Context r12, java.lang.String r13, boolean r14, @androidx.annotation.NonNull com.ss.android.j.j.cw.b r15, com.ss.android.j.j.cw.g r16, com.ss.android.j.j.cw.c r17, com.ss.android.j.j.cw.e r18, int r19, boolean r20) {
            r11 = this;
            r10 = 0
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            android.app.Dialog r12 = r0.h(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r12
    }

    public android.app.Dialog h(android.content.Context r13, java.lang.String r14, boolean r15, @androidx.annotation.NonNull com.ss.android.j.j.cw.b r16, com.ss.android.j.j.cw.g r17, com.ss.android.j.j.cw.c r18, com.ss.android.j.j.cw.e r19, int r20, boolean r21, v2.h r22) {
            r12 = this;
            com.ss.android.downloadlib.j$a r0 = new com.ss.android.downloadlib.j$a
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r13 = com.ss.android.downloadlib.up.b.a(r0)
            android.app.Dialog r13 = (android.app.Dialog) r13
            return r13
    }

    public boolean j(long r2) {
            r1 = this;
            com.ss.android.downloadlib.addownload.o$f r0 = com.ss.android.downloadlib.addownload.o.f.c()
            com.ss.android.j.j.cw.b r0 = r0.d(r2)
            if (r0 != 0) goto L17
            com.ss.android.downloadlib.addownload.o$f r0 = com.ss.android.downloadlib.addownload.o.f.c()
            com.ss.android.xt.j.xt.b r2 = r0.q(r2)
            if (r2 == 0) goto L15
            goto L17
        L15:
            r2 = 0
            return r2
        L17:
            r2 = 1
            return r2
    }

    public boolean j(long r2, int r4) {
            r1 = this;
            com.ss.android.downloadlib.addownload.o$f r0 = com.ss.android.downloadlib.addownload.o.f.c()
            com.ss.android.j.j.cw.b r2 = r0.d(r2)
            if (r2 == 0) goto L15
            com.ss.android.downloadlib.g r3 = r1.a
            java.lang.String r2 = r2.j()
            r3.i(r2, r4)
            r2 = 1
            return r2
        L15:
            r2 = 0
            return r2
    }

    public void l(long r10, com.ss.android.j.j.cw.g r12, com.ss.android.j.j.cw.c r13) {
            r9 = this;
            com.ss.android.downloadlib.addownload.o$f r0 = com.ss.android.downloadlib.addownload.o.f.c()
            com.ss.android.j.j.cw.b r0 = r0.d(r10)
            com.ss.android.downloadlib.addownload.o$f r1 = com.ss.android.downloadlib.addownload.o.f.c()
            com.ss.android.xt.j.xt.b r1 = r1.q(r10)
            if (r0 != 0) goto L18
            if (r1 == 0) goto L18
            com.ss.android.xt.j.j.a r0 = r1.h0()
        L18:
            if (r0 != 0) goto L1b
            return
        L1b:
            if (r12 == 0) goto L27
            if (r13 == 0) goto L27
            boolean r1 = r12 instanceof com.ss.android.j.j.cw.a
            if (r1 != 0) goto L27
            boolean r1 = r13 instanceof com.ss.android.j.j.cw.d
            if (r1 == 0) goto L29
        L27:
            r4 = r10
            goto L3b
        L29:
            r1 = 1
            r12.j(r1)
            com.ss.android.downloadlib.g r2 = r9.a
            java.lang.String r3 = r0.j()
            r6 = 2
            r4 = r10
            r7 = r12
            r8 = r13
            r2.j(r3, r4, r6, r7, r8)
            return
        L3b:
            r9.p(r4)
            return
    }

    public android.app.Dialog n(android.content.Context r10, java.lang.String r11, boolean r12, com.ss.android.j.j.cw.b r13, com.ss.android.j.j.cw.g r14, com.ss.android.j.j.cw.c r15, com.ss.android.j.j.cw.e r16, int r17, boolean r18, v2.h r19) {
            r9 = this;
            r3 = r15
            long r4 = r13.r()
            boolean r4 = r9.j(r4)
            r5 = 0
            if (r4 == 0) goto L1e
            if (r18 == 0) goto L16
            long r0 = r13.r()
            r9.l(r0, r14, r15)
            goto L1d
        L16:
            long r0 = r13.r()
            r9.p(r0)
        L1d:
            return r5
        L1e:
            if (r10 == 0) goto Lf0
            java.lang.String r4 = r13.j()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L2c
            goto Lf0
        L2c:
            com.ss.android.downloadlib.g r4 = r9.a
            r6 = r16
            r7 = r17
            r4.h(r10, r7, r6, r13)
            com.ss.android.j.j.cw.g r4 = f()
            r6 = 2
            com.ss.android.j.j.cw.g[] r7 = new com.ss.android.j.j.cw.g[r6]
            r8 = 0
            r7[r8] = r14
            r2 = 1
            r7[r2] = r4
            java.lang.Object r4 = com.ss.android.downloadlib.a.h.n(r7)
            com.ss.android.j.j.cw.g r4 = (com.ss.android.j.j.cw.g) r4
            com.ss.android.j.j.cw.c r7 = o()
            com.ss.android.j.j.cw.c[] r6 = new com.ss.android.j.j.cw.c[r6]
            r6[r8] = r3
            r6[r2] = r7
            java.lang.Object r3 = com.ss.android.downloadlib.a.h.n(r6)
            com.ss.android.j.j.cw.c r3 = (com.ss.android.j.j.cw.c) r3
            r4.j(r2)
            org.json.JSONObject r6 = com.ss.android.downloadlib.addownload.m.f()
            java.lang.String r7 = "disable_lp_dialog"
            int r6 = r6.optInt(r7, r8)
            if (r6 != r2) goto L69
            r6 = 1
            goto L6a
        L69:
            r6 = 0
        L6a:
            r6 = r6 | r12
            boolean r7 = r3.vl()
            if (r7 == 0) goto L7c
            com.ss.android.downloadlib.addownload.compliance.f r7 = com.ss.android.downloadlib.addownload.compliance.f.a()
            boolean r7 = r7.g(r13)
            if (r7 == 0) goto L7c
            goto L7d
        L7c:
            r2 = r6
        L7d:
            if (r2 == 0) goto L97
            com.ss.android.downloadlib.g r0 = r9.a
            java.lang.String r2 = r13.j()
            long r6 = r13.r()
            r1 = 2
            r17 = r19
            r10 = r0
            r11 = r2
            r16 = r3
            r15 = r4
            r12 = r6
            r14 = 2
            r10.l(r11, r12, r14, r15, r16, r17)
            return r5
        L97:
            java.lang.String r2 = com.ss.android.downloadlib.j.b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "tryStartDownload show dialog appName:"
            r6.<init>(r7)
            java.lang.String r7 = r13.j()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.ss.android.downloadlib.a.k.d(r2, r6, r5)
            v2.w r2 = com.ss.android.downloadlib.addownload.m.d()
            com.ss.android.j.j.up.a$b r5 = new com.ss.android.j.j.up.a$b
            r5.<init>(r10)
            java.lang.String r0 = r13.tl()
            com.ss.android.j.j.up.a$b r0 = r5.h(r0)
            java.lang.String r5 = "确认要下载此应用吗？"
            com.ss.android.j.j.up.a$b r0 = r0.p(r5)
            java.lang.String r5 = "确认"
            com.ss.android.j.j.up.a$b r0 = r0.b(r5)
            java.lang.String r5 = "取消"
            com.ss.android.j.j.up.a$b r0 = r0.l(r5)
            com.ss.android.downloadlib.j$b r5 = new com.ss.android.downloadlib.j$b
            r5.<init>(r9, r13, r4, r3)
            com.ss.android.j.j.up.a$b r0 = r0.g(r5)
            com.ss.android.j.j.up.a$b r0 = r0.e(r8)
            com.ss.android.j.j.up.a r0 = r0.j()
            android.app.Dialog r0 = r2.xt(r0)
            com.ss.android.downloadlib.r.b r2 = com.ss.android.downloadlib.r.b.a()
            java.lang.String r5 = "landing_download_dialog_show"
            r2.l(r5, r13, r4, r3)
            return r0
        Lf0:
            return r5
    }

    public void p(long r12) {
            r11 = this;
            com.ss.android.downloadlib.addownload.o$f r0 = com.ss.android.downloadlib.addownload.o.f.c()
            com.ss.android.j.j.cw.b r0 = r0.d(r12)
            com.ss.android.downloadlib.addownload.o$f r1 = com.ss.android.downloadlib.addownload.o.f.c()
            com.ss.android.xt.j.xt.b r1 = r1.q(r12)
            if (r0 != 0) goto L18
            if (r1 == 0) goto L18
            com.ss.android.xt.j.j.a r0 = r1.h0()
        L18:
            if (r0 != 0) goto L1b
            return
        L1b:
            com.ss.android.downloadlib.addownload.o$f r2 = com.ss.android.downloadlib.addownload.o.f.c()
            com.ss.android.j.j.cw.g r2 = r2.s(r12)
            com.ss.android.downloadlib.addownload.o$f r3 = com.ss.android.downloadlib.addownload.o.f.c()
            com.ss.android.j.j.cw.c r3 = r3.a(r12)
            boolean r4 = r2 instanceof com.ss.android.j.j.cw.a
            r5 = 0
            if (r4 == 0) goto L31
            r2 = r5
        L31:
            boolean r4 = r3 instanceof com.ss.android.j.j.cw.d
            if (r4 == 0) goto L36
            r3 = r5
        L36:
            if (r1 != 0) goto L47
            if (r2 != 0) goto L3e
            com.ss.android.j.j.cw.g r2 = f()
        L3e:
            if (r3 != 0) goto L44
            com.ss.android.j.j.cw.c r3 = o()
        L44:
            r9 = r2
            r10 = r3
            goto L94
        L47:
            if (r2 != 0) goto L8d
            com.ss.android.xt.j.j.c$a r2 = new com.ss.android.xt.j.j.c$a
            r2.<init>()
            java.lang.String r4 = r1.oq()
            com.ss.android.xt.j.j.c$a r2 = r2.g(r4)
            java.lang.String r4 = r1.g()
            com.ss.android.xt.j.j.c$a r2 = r2.l(r4)
            boolean r4 = r1.jy()
            com.ss.android.xt.j.j.c$a r2 = r2.c(r4)
            r4 = 0
            com.ss.android.xt.j.j.c$a r2 = r2.i(r4)
            java.lang.String r4 = "click_start_detail"
            com.ss.android.xt.j.j.c$a r2 = r2.m(r4)
            java.lang.String r4 = "click_pause_detail"
            com.ss.android.xt.j.j.c$a r2 = r2.o(r4)
            java.lang.String r4 = "click_continue_detail"
            com.ss.android.xt.j.j.c$a r2 = r2.k(r4)
            java.lang.String r4 = "click_install_detail"
            com.ss.android.xt.j.j.c$a r2 = r2.a(r4)
            java.lang.String r4 = "storage_deny_detail"
            com.ss.android.xt.j.j.c$a r2 = r2.d(r4)
            com.ss.android.xt.j.j.c r2 = r2.j()
        L8d:
            if (r3 != 0) goto L44
            com.ss.android.xt.j.j.b r3 = r1.P0()
            goto L44
        L94:
            r1 = 1
            r9.j(r1)
            com.ss.android.downloadlib.g r4 = r11.a
            java.lang.String r5 = r0.j()
            r8 = 2
            r6 = r12
            r4.j(r5, r6, r8, r9, r10)
            return
    }
}
