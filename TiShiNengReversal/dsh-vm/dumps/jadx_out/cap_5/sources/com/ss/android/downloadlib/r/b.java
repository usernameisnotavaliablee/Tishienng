package com.ss.android.downloadlib.r;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class b {

    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* renamed from: com.ss.android.downloadlib.r.b$b, reason: collision with other inner class name */
    private static class C0219b {
        private static com.ss.android.downloadlib.r.b a;

        static {
                com.ss.android.downloadlib.r.b r0 = new com.ss.android.downloadlib.r.b
                r1 = 0
                r0.<init>(r1)
                com.ss.android.downloadlib.r.b.C0219b.a = r0
                return
        }

        public C0219b() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.ss.android.downloadlib.r.b a() {
                com.ss.android.downloadlib.r.b r0 = com.ss.android.downloadlib.r.b.C0219b.a
                return r0
        }
    }

    private b() {
            r0 = this;
            r0.<init>()
            return
    }

    /* synthetic */ b(com.ss.android.downloadlib.r.b.a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.ss.android.downloadlib.r.b a() {
            com.ss.android.downloadlib.r.b r0 = com.ss.android.downloadlib.r.b.C0219b.a()
            return r0
    }

    private org.json.JSONObject b(com.ss.android.xt.j.xt.a r4) {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            org.json.JSONObject r1 = r4.ae()     // Catch: java.lang.Exception -> L64
            com.ss.android.downloadlib.a.h.s(r1, r0)     // Catch: java.lang.Exception -> L64
            org.json.JSONObject r1 = r4.av()     // Catch: java.lang.Exception -> L64
            com.ss.android.downloadlib.a.h.s(r1, r0)     // Catch: java.lang.Exception -> L64
            java.lang.String r1 = "download_url"
            java.lang.String r2 = r4.j()     // Catch: java.lang.Exception -> L64
            r0.putOpt(r1, r2)     // Catch: java.lang.Exception -> L64
            java.lang.String r1 = "package_name"
            java.lang.String r2 = r4.up()     // Catch: java.lang.Exception -> L64
            r0.putOpt(r1, r2)     // Catch: java.lang.Exception -> L64
            java.lang.String r1 = "android_int"
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L64
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L64
            r0.putOpt(r1, r2)     // Catch: java.lang.Exception -> L64
            java.lang.String r1 = "rom_name"
            java.lang.String r2 = com.ss.android.socialbase.appdownloader.m.e.q()     // Catch: java.lang.Exception -> L64
            r0.putOpt(r1, r2)     // Catch: java.lang.Exception -> L64
            java.lang.String r1 = "rom_version"
            java.lang.String r2 = com.ss.android.socialbase.appdownloader.m.e.f()     // Catch: java.lang.Exception -> L64
            r0.putOpt(r1, r2)     // Catch: java.lang.Exception -> L64
            java.lang.String r1 = "ttdownloader"
            r2 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L64
            r0.putOpt(r1, r2)     // Catch: java.lang.Exception -> L64
            java.lang.String r1 = "funnel_type"
            int r2 = r4.tl()     // Catch: java.lang.Exception -> L64
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L64
            r0.putOpt(r1, r2)     // Catch: java.lang.Exception -> L64
            int r1 = r4.tl()     // Catch: java.lang.Exception -> L64
            r2 = 2
            if (r1 != r2) goto L66
            com.ss.android.downloadlib.a.i.g(r0, r4)     // Catch: java.lang.Exception -> L64
            goto L66
        L64:
            r4 = move-exception
            goto L70
        L66:
            boolean r4 = com.ss.android.socialbase.appdownloader.m.e.b()     // Catch: java.lang.Exception -> L64
            if (r4 == 0) goto L6f
            com.ss.android.downloadlib.a.i.e(r0)     // Catch: java.lang.Exception -> L64
        L6f:
            return r0
        L70:
            u2.a r1 = com.ss.android.downloadlib.addownload.m.w()
            java.lang.String r2 = "getBaseJson"
            r1.j(r4, r2)
            return r0
    }

    private void g(com.ss.android.j.j.up.d r2) {
            r1 = this;
            v2.a r0 = com.ss.android.downloadlib.addownload.m.h()
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r2.f()
            if (r0 == 0) goto L15
            v2.a r0 = com.ss.android.downloadlib.addownload.m.h()
            r0.j(r2)
            return
        L15:
            v2.a r0 = com.ss.android.downloadlib.addownload.m.h()
            r0.xt(r2)
            return
    }

    private void o(java.lang.String r4, java.lang.String r5, org.json.JSONObject r6, long r7, int r9, com.ss.android.xt.j.xt.a r10) {
            r3 = this;
            if (r10 != 0) goto Lc
            com.ss.android.downloadlib.up.a r4 = com.ss.android.downloadlib.up.a.a()
            java.lang.String r5 = "onEvent data null"
            r4.c(r5)
            return
        Lc:
            boolean r0 = r10 instanceof com.ss.android.downloadlib.addownload.o.i
            if (r0 == 0) goto L23
            r0 = r10
            com.ss.android.downloadlib.addownload.o$i r0 = (com.ss.android.downloadlib.addownload.o.i) r0
            boolean r0 = r0.b()
            if (r0 == 0) goto L23
            com.ss.android.downloadlib.up.a r4 = com.ss.android.downloadlib.up.a.a()
            java.lang.String r5 = "onEvent ModelBox notValid"
            r4.c(r5)
            return
        L23:
            com.ss.android.j.j.up.d$a r0 = new com.ss.android.j.j.up.d$a     // Catch: java.lang.Exception -> Lb2
            r0.<init>()     // Catch: java.lang.Exception -> Lb2
            java.lang.String r1 = r10.oq()     // Catch: java.lang.Exception -> Lb2
            java.lang.String r2 = "embeded_ad"
            java.lang.String[] r4 = new java.lang.String[]{r4, r1, r2}     // Catch: java.lang.Exception -> Lb2
            java.lang.String r4 = com.ss.android.downloadlib.a.h.q(r4)     // Catch: java.lang.Exception -> Lb2
            com.ss.android.j.j.up.d$a r4 = r0.j(r4)     // Catch: java.lang.Exception -> Lb2
            com.ss.android.j.j.up.d$a r4 = r4.A(r5)     // Catch: java.lang.Exception -> Lb2
            boolean r5 = r10.cw()     // Catch: java.lang.Exception -> Lb2
            com.ss.android.j.j.up.d$a r4 = r4.C(r5)     // Catch: java.lang.Exception -> Lb2
            long r0 = r10.xt()     // Catch: java.lang.Exception -> Lb2
            com.ss.android.j.j.up.d$a r4 = r4.h(r0)     // Catch: java.lang.Exception -> Lb2
            java.lang.String r5 = r10.r()     // Catch: java.lang.Exception -> Lb2
            com.ss.android.j.j.up.d$a r4 = r4.d(r5)     // Catch: java.lang.Exception -> Lb2
            r0 = 0
            int r5 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r5 <= 0) goto L5d
            goto L61
        L5d:
            long r7 = r10.vl()     // Catch: java.lang.Exception -> Lb2
        L61:
            com.ss.android.j.j.up.d$a r4 = r4.z(r7)     // Catch: java.lang.Exception -> Lb2
            java.lang.String r5 = r10.g()     // Catch: java.lang.Exception -> Lb2
            com.ss.android.j.j.up.d$a r4 = r4.t(r5)     // Catch: java.lang.Exception -> Lb2
            java.util.List r5 = r10.ws()     // Catch: java.lang.Exception -> Lb2
            com.ss.android.j.j.up.d$a r4 = r4.k(r5)     // Catch: java.lang.Exception -> Lb2
            org.json.JSONObject r5 = r3.b(r10)     // Catch: java.lang.Exception -> Lb2
            r7 = 2
            org.json.JSONObject[] r8 = new org.json.JSONObject[r7]     // Catch: java.lang.Exception -> Lb2
            r0 = 0
            r8[r0] = r5     // Catch: java.lang.Exception -> Lb2
            r5 = 1
            r8[r5] = r6     // Catch: java.lang.Exception -> Lb2
            org.json.JSONObject r5 = com.ss.android.downloadlib.a.h.t(r8)     // Catch: java.lang.Exception -> Lb2
            com.ss.android.j.j.up.d$a r4 = r4.l(r5)     // Catch: java.lang.Exception -> Lb2
            org.json.JSONObject r5 = r10.qv()     // Catch: java.lang.Exception -> Lb2
            com.ss.android.j.j.up.d$a r4 = r4.B(r5)     // Catch: java.lang.Exception -> Lb2
            java.lang.Object r5 = r10.az()     // Catch: java.lang.Exception -> Lb2
            com.ss.android.j.j.up.d$a r4 = r4.i(r5)     // Catch: java.lang.Exception -> Lb2
            if (r9 <= 0) goto L9d
            goto L9e
        L9d:
            r9 = 2
        L9e:
            com.ss.android.j.j.up.d$a r4 = r4.g(r9)     // Catch: java.lang.Exception -> Lb2
            boolean r5 = r10.jy()     // Catch: java.lang.Exception -> Lb2
            com.ss.android.j.j.up.d$a r4 = r4.m(r5)     // Catch: java.lang.Exception -> Lb2
            com.ss.android.j.j.up.d r4 = r4.n()     // Catch: java.lang.Exception -> Lb2
            r3.g(r4)     // Catch: java.lang.Exception -> Lb2
            return
        Lb2:
            r4 = move-exception
            com.ss.android.downloadlib.up.a r5 = com.ss.android.downloadlib.up.a.a()
            java.lang.String r6 = "onEvent"
            r5.j(r4, r6)
            return
    }

    public void c(long r9, int r11) {
            r8 = this;
            com.ss.android.downloadlib.addownload.o$f r0 = com.ss.android.downloadlib.addownload.o.f.c()
            com.ss.android.downloadlib.addownload.o$i r0 = r0.r(r9)
            boolean r1 = r0.b()
            if (r1 == 0) goto L18
            com.ss.android.downloadlib.up.a r9 = com.ss.android.downloadlib.up.a.a()
            java.lang.String r10 = "sendClickEvent ModelBox notValid"
            r9.c(r10)
            return
        L18:
            com.ss.android.j.j.cw.g r1 = r0.c
            boolean r1 = r1.vl()
            if (r1 != 0) goto L22
            goto L95
        L22:
            r1 = 1
            com.ss.android.j.j.cw.g r2 = r0.c
            if (r11 != r1) goto L2c
            java.lang.String r2 = r2.cw()
            goto L30
        L2c:
            java.lang.String r2 = r2.xt()
        L30:
            com.ss.android.j.j.cw.g r3 = r0.c
            java.lang.String r3 = r3.r()
            java.lang.String r4 = "click"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}
            java.lang.String r3 = com.ss.android.downloadlib.a.h.q(r3)
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            java.lang.String r6 = "download_click_type"
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch: org.json.JSONException -> L77
            r5.putOpt(r6, r11)     // Catch: org.json.JSONException -> L77
            java.lang.String r11 = "permission_notification"
            boolean r6 = com.ss.android.socialbase.appdownloader.up.c.e()     // Catch: org.json.JSONException -> L77
            r7 = 2
            if (r6 == 0) goto L59
            r6 = 1
            goto L5a
        L59:
            r6 = 2
        L5a:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: org.json.JSONException -> L77
            r5.putOpt(r11, r6)     // Catch: org.json.JSONException -> L77
            java.lang.String r11 = "network_available"
            android.content.Context r6 = com.ss.android.downloadlib.addownload.m.getContext()     // Catch: org.json.JSONException -> L77
            boolean r6 = com.ss.android.socialbase.downloader.az.m.cw(r6)     // Catch: org.json.JSONException -> L77
            if (r6 == 0) goto L6e
            goto L6f
        L6e:
            r1 = 2
        L6f:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: org.json.JSONException -> L77
            r5.putOpt(r11, r1)     // Catch: org.json.JSONException -> L77
            goto L7b
        L77:
            r11 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r11)
        L7b:
            r8.p(r2, r3, r5, r0)
            boolean r11 = r4.equals(r3)
            if (r11 == 0) goto L95
            com.ss.android.j.j.cw.b r11 = r0.b
            if (r11 == 0) goto L95
            com.ss.android.downloadlib.r.a r11 = com.ss.android.downloadlib.r.a.c()
            com.ss.android.j.j.cw.b r0 = r0.b
            java.lang.String r0 = r0.ch()
            r11.d(r9, r0)
        L95:
            return
    }

    public void d(long r10, int r12, com.ss.android.socialbase.downloader.ae.cw r13) {
            r9 = this;
            com.ss.android.downloadlib.addownload.o$f r0 = com.ss.android.downloadlib.addownload.o.f.c()
            com.ss.android.downloadlib.addownload.o$i r8 = r0.r(r10)
            boolean r10 = r8.b()
            if (r10 == 0) goto L18
            com.ss.android.downloadlib.up.a r10 = com.ss.android.downloadlib.up.a.a()
            java.lang.String r11 = "sendEvent ModelBox notValid"
            r10.c(r11)
            return
        L18:
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            int r10 = r8.kt()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.String r11 = "download_scene"
            com.ss.android.downloadlib.a.h.u(r4, r11, r10)
            r10 = 1
            if (r12 == r10) goto L95
            r10 = 2
            if (r12 == r10) goto L81
            r10 = 3
            if (r12 == r10) goto L6d
            r10 = 4
            if (r12 == r10) goto L59
            r10 = 5
            if (r12 == r10) goto L3c
            r10 = 0
        L3a:
            r3 = r10
            goto La6
        L3c:
            if (r13 == 0) goto L48
            int r10 = r13.ae()     // Catch: java.lang.Throwable -> L48
            com.ss.android.downloadlib.a.i.f(r4, r10)     // Catch: java.lang.Throwable -> L48
            com.ss.android.downloadlib.d.w(r4, r13)     // Catch: java.lang.Throwable -> L48
        L48:
            com.ss.android.j.j.cw.g r10 = r8.c
            java.lang.String r10 = r10.tl()
            java.lang.String r11 = "click_install"
            java.lang.String[] r10 = new java.lang.String[]{r10, r11}
            java.lang.String r10 = com.ss.android.downloadlib.a.h.q(r10)
            goto L3a
        L59:
            com.ss.android.j.j.cw.g r10 = r8.c
            java.lang.String r10 = r10.ae()
            java.lang.String r11 = "click_continue"
            java.lang.String[] r10 = new java.lang.String[]{r10, r11}
            java.lang.String r10 = com.ss.android.downloadlib.a.h.q(r10)
            com.ss.android.downloadlib.a.i.a(r13, r4)
            goto L3a
        L6d:
            com.ss.android.j.j.cw.g r10 = r8.c
            java.lang.String r10 = r10.m()
            java.lang.String r11 = "click_pause"
            java.lang.String[] r10 = new java.lang.String[]{r10, r11}
            java.lang.String r10 = com.ss.android.downloadlib.a.h.q(r10)
            com.ss.android.downloadlib.a.i.h(r13, r4)
            goto L3a
        L81:
            com.ss.android.j.j.cw.g r10 = r8.c
            java.lang.String r10 = r10.up()
            java.lang.String r11 = "click_start"
            java.lang.String[] r10 = new java.lang.String[]{r10, r11}
            java.lang.String r10 = com.ss.android.downloadlib.a.h.q(r10)
            com.ss.android.downloadlib.a.i.c(r13, r4)
            goto L3a
        L95:
            com.ss.android.j.j.cw.g r10 = r8.c
            java.lang.String r10 = r10.g()
            java.lang.String r11 = "storage_deny"
            java.lang.String[] r10 = new java.lang.String[]{r10, r11}
            java.lang.String r10 = com.ss.android.downloadlib.a.h.q(r10)
            goto L3a
        La6:
            r5 = 0
            r7 = 1
            r2 = 0
            r1 = r9
            r1.o(r2, r3, r4, r5, r7, r8)
            return
    }

    public void e(long r3, com.ss.android.socialbase.downloader.up.j r5) {
            r2 = this;
            com.ss.android.downloadlib.addownload.o$f r0 = com.ss.android.downloadlib.addownload.o.f.c()
            com.ss.android.downloadlib.addownload.o$i r3 = r0.r(r3)
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.lang.String r0 = "download_time"
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: org.json.JSONException -> L30
            r4.putOpt(r0, r1)     // Catch: org.json.JSONException -> L30
            if (r5 == 0) goto L34
            java.lang.String r0 = "fail_status"
            int r1 = r5.j()     // Catch: org.json.JSONException -> L30
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: org.json.JSONException -> L30
            r4.putOpt(r0, r1)     // Catch: org.json.JSONException -> L30
            java.lang.String r0 = "fail_msg"
            java.lang.String r5 = r5.xt()     // Catch: org.json.JSONException -> L30
            r4.putOpt(r0, r5)     // Catch: org.json.JSONException -> L30
            goto L34
        L30:
            r5 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r5)
        L34:
            java.lang.String r5 = "download_failed"
            r2.x(r5, r4, r3)
            return
    }

    public void f(long r2, boolean r4, int r5) {
            r1 = this;
            com.ss.android.downloadlib.addownload.o$f r0 = com.ss.android.downloadlib.addownload.o.f.c()
            com.ss.android.downloadlib.addownload.o$i r2 = r0.r(r2)
            boolean r3 = r2.b()
            if (r3 == 0) goto L18
            com.ss.android.downloadlib.up.a r2 = com.ss.android.downloadlib.up.a.a()
            java.lang.String r3 = "sendQuickAppEvent ModelBox notValid"
            r2.c(r3)
            return
        L18:
            com.ss.android.j.j.cw.b r3 = r2.b
            com.ss.android.j.j.up.c r3 = r3.gq()
            if (r3 != 0) goto L21
            return
        L21:
            com.ss.android.j.j.cw.b r3 = r2.b
            boolean r0 = r3 instanceof com.ss.android.xt.j.j.a
            if (r0 == 0) goto L2d
            com.ss.android.xt.j.j.a r3 = (com.ss.android.xt.j.j.a) r3
            r0 = 3
            r3.e(r0)
        L2d:
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r0 = "download_click_type"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: org.json.JSONException -> L3c
            r3.putOpt(r0, r5)     // Catch: org.json.JSONException -> L3c
            goto L40
        L3c:
            r5 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r5)
        L40:
            if (r4 == 0) goto L45
            java.lang.String r4 = "deeplink_quickapp_success"
            goto L47
        L45:
            java.lang.String r4 = "deeplink_quickapp_failed"
        L47:
            r1.x(r4, r3, r2)
            return
    }

    public void h(com.ss.android.socialbase.downloader.ae.cw r5) {
            r4 = this;
            com.ss.android.downloadlib.addownload.o$f r0 = com.ss.android.downloadlib.addownload.o.f.c()
            com.ss.android.xt.j.xt.b r0 = r0.f(r5)
            if (r0 != 0) goto Lb
            return
        Lb:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2b
            r1.<init>()     // Catch: java.lang.Throwable -> L2b
            com.ss.android.downloadlib.a.i.a(r5, r1)     // Catch: java.lang.Throwable -> L2b
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L2b
            r0.J(r2)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r5 = r0.oq()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r2 = "download_resume"
            r4.p(r5, r2, r1, r0)     // Catch: java.lang.Throwable -> L2b
            com.ss.android.downloadlib.addownload.o$d r5 = com.ss.android.downloadlib.addownload.o.d.c()     // Catch: java.lang.Throwable -> L2b
            r5.d(r0)     // Catch: java.lang.Throwable -> L2b
            return
        L2b:
            r5 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r5)
            return
    }

    public void i(com.ss.android.socialbase.downloader.ae.cw r10, com.ss.android.socialbase.downloader.up.j r11) {
            r9 = this;
            if (r10 != 0) goto L3
            goto L16
        L3:
            com.ss.android.downloadlib.addownload.o$f r11 = com.ss.android.downloadlib.addownload.o.f.c()
            com.ss.android.xt.j.xt.b r11 = r11.f(r10)
            if (r11 != 0) goto Le
            goto L16
        Le:
            java.util.concurrent.atomic.AtomicBoolean r0 = r11.N
            boolean r0 = r0.get()
            if (r0 == 0) goto L17
        L16:
            return
        L17:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            com.ss.android.downloadlib.d.g(r0, r10)     // Catch: org.json.JSONException -> L59
            java.lang.String r1 = "fail_status"
            int r2 = r11.T()     // Catch: org.json.JSONException -> L59
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: org.json.JSONException -> L59
            r0.putOpt(r1, r2)     // Catch: org.json.JSONException -> L59
            java.lang.String r1 = "fail_msg"
            java.lang.String r2 = r11.C()     // Catch: org.json.JSONException -> L59
            r0.putOpt(r1, r2)     // Catch: org.json.JSONException -> L59
            java.lang.String r1 = "download_failed_times"
            int r2 = r11.T0()     // Catch: org.json.JSONException -> L59
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L59
            long r1 = r10.ka()     // Catch: org.json.JSONException -> L59
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L5b
            java.lang.String r1 = "download_percent"
            long r5 = r10.uq()     // Catch: org.json.JSONException -> L59
            double r5 = (double) r5     // Catch: org.json.JSONException -> L59
            long r7 = r10.ka()     // Catch: org.json.JSONException -> L59
            double r7 = (double) r7     // Catch: org.json.JSONException -> L59
            double r5 = r5 / r7
            r0.put(r1, r5)     // Catch: org.json.JSONException -> L59
            goto L5b
        L59:
            r10 = move-exception
            goto Lba
        L5b:
            java.lang.String r1 = "download_status"
            int r10 = r10.v()     // Catch: org.json.JSONException -> L59
            r0.put(r1, r10)     // Catch: org.json.JSONException -> L59
            long r1 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> L59
            long r5 = r11.Q0()     // Catch: org.json.JSONException -> L59
            int r10 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r10 <= 0) goto L7b
            java.lang.String r10 = "time_from_start_download"
            long r5 = r11.Q0()     // Catch: org.json.JSONException -> L59
            long r5 = r1 - r5
            r0.put(r10, r5)     // Catch: org.json.JSONException -> L59
        L7b:
            long r5 = r11.S()     // Catch: org.json.JSONException -> L59
            int r10 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r10 <= 0) goto L8d
            java.lang.String r10 = "time_from_download_resume"
            long r3 = r11.S()     // Catch: org.json.JSONException -> L59
            long r1 = r1 - r3
            r0.put(r10, r1)     // Catch: org.json.JSONException -> L59
        L8d:
            java.lang.String r10 = "is_update_download"
            boolean r1 = r11.i0()     // Catch: org.json.JSONException -> L59
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L99
            r1 = 1
            goto L9a
        L99:
            r1 = 2
        L9a:
            r0.put(r10, r1)     // Catch: org.json.JSONException -> L59
            java.lang.String r10 = "can_show_notification"
            boolean r1 = com.ss.android.socialbase.appdownloader.up.c.e()     // Catch: org.json.JSONException -> L59
            if (r1 == 0) goto La7
            r1 = 1
            goto La8
        La7:
            r1 = 2
        La8:
            r0.put(r10, r1)     // Catch: org.json.JSONException -> L59
            java.lang.String r10 = "has_send_download_failed_finally"
            java.util.concurrent.atomic.AtomicBoolean r1 = r11.O     // Catch: org.json.JSONException -> L59
            boolean r1 = r1.get()     // Catch: org.json.JSONException -> L59
            if (r1 == 0) goto Lb6
            r2 = 1
        Lb6:
            r0.put(r10, r2)     // Catch: org.json.JSONException -> L59
            goto Lbd
        Lba:
            com.bytedance.sdk.component.utils.vl.j(r10)
        Lbd:
            java.lang.String r10 = r11.oq()
            java.lang.String r1 = "download_cancel"
            r9.p(r10, r1, r0, r11)
            return
    }

    public void j(java.lang.String r9, int r10, com.ss.android.downloadlib.addownload.o.i r11) {
            r8 = this;
            long r4 = (long) r10
            r6 = 0
            r1 = 0
            r3 = 0
            r0 = r8
            r2 = r9
            r7 = r11
            r0.o(r1, r2, r3, r4, r6, r7)
            return
    }

    public void k(java.lang.String r2, long r3) {
            r1 = this;
            r0 = 0
            r1.q(r2, r0, r3)
            return
    }

    public void l(java.lang.String r7, @androidx.annotation.NonNull com.ss.android.j.j.cw.b r8, @androidx.annotation.NonNull com.ss.android.j.j.cw.g r9, @androidx.annotation.NonNull com.ss.android.j.j.cw.c r10) {
            r6 = this;
            com.ss.android.downloadlib.addownload.o$i r0 = new com.ss.android.downloadlib.addownload.o$i
            long r1 = r8.r()
            r3 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r3, r4, r5)
            r6.w(r7, r0)
            return
    }

    public void m(java.lang.String r2, com.ss.android.xt.j.xt.a r3) {
            r1 = this;
            r0 = 0
            r1.r(r2, r0, r3)
            return
    }

    public void n(java.lang.String r2, java.lang.String r3, com.ss.android.xt.j.xt.a r4) {
            r1 = this;
            r0 = 0
            r1.p(r2, r3, r0, r4)
            return
    }

    public void p(java.lang.String r9, java.lang.String r10, org.json.JSONObject r11, com.ss.android.xt.j.xt.a r12) {
            r8 = this;
            r4 = 0
            r6 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r7 = r12
            r0.o(r1, r2, r3, r4, r6, r7)
            return
    }

    public void q(java.lang.String r2, org.json.JSONObject r3, long r4) {
            r1 = this;
            com.ss.android.downloadlib.addownload.o$f r0 = com.ss.android.downloadlib.addownload.o.f.c()
            com.ss.android.xt.j.xt.b r0 = r0.q(r4)
            if (r0 == 0) goto Le
            r1.r(r2, r3, r0)
            return
        Le:
            com.ss.android.downloadlib.addownload.o$f r0 = com.ss.android.downloadlib.addownload.o.f.c()
            com.ss.android.downloadlib.addownload.o$i r4 = r0.r(r4)
            boolean r5 = r4.b()
            if (r5 == 0) goto L26
            com.ss.android.downloadlib.up.a r2 = com.ss.android.downloadlib.up.a.a()
            java.lang.String r3 = "sendUnityEvent ModelBox notValid"
            r2.c(r3)
            return
        L26:
            r1.r(r2, r3, r4)
            return
    }

    public void r(java.lang.String r3, org.json.JSONObject r4, com.ss.android.xt.j.xt.a r5) {
            r2 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "unity_label"
            com.ss.android.downloadlib.a.h.u(r0, r1, r3)
            java.lang.String r3 = "ttdownloader_unity"
            org.json.JSONObject r4 = com.ss.android.downloadlib.a.h.s(r4, r0)
            java.lang.String r0 = "embeded_ad"
            r2.p(r0, r3, r4, r5)
            return
    }

    public void s(org.json.JSONObject r3, @androidx.annotation.NonNull com.ss.android.xt.j.xt.b r4) {
            r2 = this;
            java.lang.String r0 = r4.oq()
            java.lang.String r1 = "install_finish"
            r2.p(r0, r1, r3, r4)
            return
    }

    public void t(long r2, int r4) {
            r1 = this;
            r0 = 0
            r1.d(r2, r4, r0)
            return
    }

    public void u(com.ss.android.socialbase.downloader.ae.cw r7, com.ss.android.socialbase.downloader.up.j r8) {
            r6 = this;
            if (r7 != 0) goto L3
            goto L1f
        L3:
            com.ss.android.downloadlib.addownload.o$f r0 = com.ss.android.downloadlib.addownload.o.f.c()
            com.ss.android.xt.j.xt.b r0 = r0.f(r7)
            if (r0 != 0) goto L17
            com.ss.android.downloadlib.up.a r7 = com.ss.android.downloadlib.up.a.a()
            java.lang.String r8 = "sendDownloadFailedEvent nativeModel null"
            r7.c(r8)
            return
        L17:
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.N
            boolean r1 = r1.get()
            if (r1 == 0) goto L20
        L1f:
            return
        L20:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            com.ss.android.downloadlib.a.i.a(r7, r1)     // Catch: org.json.JSONException -> L52
            com.ss.android.downloadlib.d.g(r1, r7)     // Catch: org.json.JSONException -> L52
            if (r8 == 0) goto L54
            java.lang.String r2 = "fail_status"
            int r3 = r8.j()     // Catch: org.json.JSONException -> L52
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: org.json.JSONException -> L52
            r1.putOpt(r2, r3)     // Catch: org.json.JSONException -> L52
            java.lang.String r2 = "fail_msg"
            java.lang.String r3 = r8.xt()     // Catch: org.json.JSONException -> L52
            r1.putOpt(r2, r3)     // Catch: org.json.JSONException -> L52
            int r2 = r8.j()     // Catch: org.json.JSONException -> L52
            r0.p0(r2)     // Catch: org.json.JSONException -> L52
            java.lang.String r8 = r8.xt()     // Catch: org.json.JSONException -> L52
            r0.K(r8)     // Catch: org.json.JSONException -> L52
            goto L54
        L52:
            r7 = move-exception
            goto L9c
        L54:
            r0.n()     // Catch: org.json.JSONException -> L52
            java.lang.String r8 = "download_failed_times"
            int r2 = r0.T0()     // Catch: org.json.JSONException -> L52
            r1.put(r8, r2)     // Catch: org.json.JSONException -> L52
            long r2 = r7.ka()     // Catch: org.json.JSONException -> L52
            r4 = 0
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 <= 0) goto L7a
            java.lang.String r8 = "download_percent"
            long r2 = r7.uq()     // Catch: org.json.JSONException -> L52
            double r2 = (double) r2     // Catch: org.json.JSONException -> L52
            long r4 = r7.ka()     // Catch: org.json.JSONException -> L52
            double r4 = (double) r4     // Catch: org.json.JSONException -> L52
            double r2 = r2 / r4
            r1.put(r8, r2)     // Catch: org.json.JSONException -> L52
        L7a:
            java.lang.String r7 = "has_send_download_failed_finally"
            java.util.concurrent.atomic.AtomicBoolean r8 = r0.O     // Catch: org.json.JSONException -> L52
            boolean r8 = r8.get()     // Catch: org.json.JSONException -> L52
            r2 = 2
            r3 = 1
            if (r8 == 0) goto L88
            r8 = 1
            goto L89
        L88:
            r8 = 2
        L89:
            r1.put(r7, r8)     // Catch: org.json.JSONException -> L52
            com.ss.android.downloadlib.a.i.d(r0, r1)     // Catch: org.json.JSONException -> L52
            java.lang.String r7 = "is_update_download"
            boolean r8 = r0.i0()     // Catch: org.json.JSONException -> L52
            if (r8 == 0) goto L98
            r2 = 1
        L98:
            r1.put(r7, r2)     // Catch: org.json.JSONException -> L52
            goto L9f
        L9c:
            com.bytedance.sdk.component.utils.vl.j(r7)
        L9f:
            java.lang.String r7 = r0.oq()
            java.lang.String r8 = "download_failed"
            r6.p(r7, r8, r1, r0)
            com.ss.android.downloadlib.addownload.o$d r7 = com.ss.android.downloadlib.addownload.o.d.c()
            r7.d(r0)
            return
    }

    public void v(java.lang.String r2, long r3) {
            r1 = this;
            com.ss.android.downloadlib.addownload.o$f r0 = com.ss.android.downloadlib.addownload.o.f.c()
            com.ss.android.xt.j.xt.b r0 = r0.q(r3)
            if (r0 == 0) goto Le
            r1.w(r2, r0)
            return
        Le:
            com.ss.android.downloadlib.addownload.o$f r0 = com.ss.android.downloadlib.addownload.o.f.c()
            com.ss.android.downloadlib.addownload.o$i r3 = r0.r(r3)
            r1.w(r2, r3)
            return
    }

    public void w(java.lang.String r2, com.ss.android.xt.j.xt.a r3) {
            r1 = this;
            r0 = 0
            r1.n(r0, r2, r3)
            return
    }

    public void x(java.lang.String r2, org.json.JSONObject r3, com.ss.android.xt.j.xt.a r4) {
            r1 = this;
            r0 = 0
            r1.p(r0, r2, r3, r4)
            return
    }
}
