package com.ss.android.downloadlib.addownload.compliance;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class c {
    private final java.util.concurrent.atomic.AtomicInteger a;

    class a implements java.lang.Runnable {
        final /* synthetic */ com.ss.android.downloadlib.addownload.o.i a;
        final /* synthetic */ com.ss.android.downloadlib.addownload.compliance.d b;
        final /* synthetic */ com.ss.android.downloadlib.addownload.compliance.c c;

        a(com.ss.android.downloadlib.addownload.compliance.c r1, com.ss.android.downloadlib.addownload.o.i r2, com.ss.android.downloadlib.addownload.compliance.d r3) {
                r0 = this;
                r0.c = r1
                r0.a = r2
                r0.b = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r7 = this;
                com.ss.android.downloadlib.addownload.compliance.c r0 = r7.c
                com.ss.android.downloadlib.addownload.o$i r1 = r7.a
                java.lang.String r2 = com.ss.android.downloadlib.addownload.compliance.c.b(r0)
                com.ss.android.downloadlib.addownload.compliance.c r3 = r7.c
                com.ss.android.downloadlib.addownload.o$i r4 = r7.a
                r5 = 1
                r6 = 4
                byte[] r3 = com.ss.android.downloadlib.addownload.compliance.c.k(r3, r4, r5, r6)
                com.ss.android.downloadlib.addownload.compliance.d r4 = r7.b
                com.ss.android.downloadlib.addownload.compliance.c.f(r0, r1, r2, r3, r4)
                return
        }
    }

    class b implements v2.q {
        final /* synthetic */ com.ss.android.downloadlib.addownload.o.i a;
        final /* synthetic */ com.ss.android.downloadlib.addownload.compliance.d b;
        final /* synthetic */ java.lang.String c;
        final /* synthetic */ byte[] d;
        final /* synthetic */ com.ss.android.downloadlib.addownload.compliance.c e;

        b(com.ss.android.downloadlib.addownload.compliance.c r1, com.ss.android.downloadlib.addownload.o.i r2, com.ss.android.downloadlib.addownload.compliance.d r3, java.lang.String r4, byte[] r5) {
                r0 = this;
                r0.e = r1
                r0.a = r2
                r0.b = r3
                r0.c = r4
                r0.d = r5
                r0.<init>()
                return
        }

        public void j(java.lang.String r4) {
                r3 = this;
                com.ss.android.downloadlib.addownload.compliance.c r0 = r3.e
                com.ss.android.downloadlib.addownload.o$i r1 = r3.a
                com.ss.android.downloadlib.addownload.compliance.d r2 = r3.b
                com.ss.android.downloadlib.addownload.compliance.c.e(r0, r1, r4, r2)
                return
        }

        public void j(java.lang.Throwable r5) {
                r4 = this;
                com.ss.android.downloadlib.addownload.compliance.c r5 = r4.e
                com.ss.android.downloadlib.addownload.o$i r0 = r4.a
                java.lang.String r1 = r4.c
                byte[] r2 = r4.d
                com.ss.android.downloadlib.addownload.compliance.d r3 = r4.b
                com.ss.android.downloadlib.addownload.compliance.c.n(r5, r0, r1, r2, r3)
                return
        }
    }

    /* renamed from: com.ss.android.downloadlib.addownload.compliance.c$c, reason: collision with other inner class name */
    class RunnableC0201c implements java.lang.Runnable {
        final /* synthetic */ java.lang.String a;
        final /* synthetic */ com.ss.android.downloadlib.addownload.compliance.c b;

        RunnableC0201c(com.ss.android.downloadlib.addownload.compliance.c r1, java.lang.String r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r7 = this;
                v2.w r0 = com.ss.android.downloadlib.addownload.m.d()
                android.content.Context r2 = com.ss.android.downloadlib.addownload.m.getContext()
                java.lang.String r4 = r7.a
                r5 = 0
                r6 = 0
                r1 = 6
                r3 = 0
                r0.j(r1, r2, r3, r4, r5, r6)
                return
        }
    }

    private static class d {
        private static com.ss.android.downloadlib.addownload.compliance.c a;

        static {
                com.ss.android.downloadlib.addownload.compliance.c r0 = new com.ss.android.downloadlib.addownload.compliance.c
                r1 = 0
                r0.<init>(r1)
                com.ss.android.downloadlib.addownload.compliance.c.d.a = r0
                return
        }

        public d() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.ss.android.downloadlib.addownload.compliance.c a() {
                com.ss.android.downloadlib.addownload.compliance.c r0 = com.ss.android.downloadlib.addownload.compliance.c.d.a
                return r0
        }
    }

    private c() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 0
            r0.<init>(r1)
            r2.a = r0
            return
    }

    /* synthetic */ c(com.ss.android.downloadlib.addownload.compliance.c.a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.ss.android.downloadlib.addownload.compliance.c a() {
            com.ss.android.downloadlib.addownload.compliance.c r0 = com.ss.android.downloadlib.addownload.compliance.c.d.a()
            return r0
    }

    static /* synthetic */ java.lang.String b(com.ss.android.downloadlib.addownload.compliance.c r0) {
            java.lang.String r0 = r0.m()
            return r0
    }

    static /* synthetic */ void e(com.ss.android.downloadlib.addownload.compliance.c r0, com.ss.android.downloadlib.addownload.o.i r1, java.lang.String r2, com.ss.android.downloadlib.addownload.compliance.d r3) {
            r0.h(r1, r2, r3)
            return
    }

    static /* synthetic */ void f(com.ss.android.downloadlib.addownload.compliance.c r0, com.ss.android.downloadlib.addownload.o.i r1, java.lang.String r2, byte[] r3, com.ss.android.downloadlib.addownload.compliance.d r4) {
            r0.o(r1, r2, r3, r4)
            return
    }

    private void h(@androidx.annotation.NonNull com.ss.android.downloadlib.addownload.o.i r3, java.lang.String r4, com.ss.android.downloadlib.addownload.compliance.d r5) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> L18
            if (r0 == 0) goto L1a
            com.ss.android.downloadlib.up.a r4 = com.ss.android.downloadlib.up.a.a()     // Catch: java.lang.Exception -> L18
            java.lang.String r0 = "response content is null"
            r4.c(r0)     // Catch: java.lang.Exception -> L18
            r4 = 404(0x194, float:5.66E-43)
            r2.c(r4, r3)     // Catch: java.lang.Exception -> L18
            r5.j()     // Catch: java.lang.Exception -> L18
            return
        L18:
            r3 = move-exception
            goto L4e
        L1a:
            java.util.concurrent.atomic.AtomicInteger r0 = r2.a     // Catch: java.lang.Exception -> L18
            r1 = 0
            r0.set(r1)     // Catch: java.lang.Exception -> L18
            com.ss.android.downloadlib.addownload.compliance.e r4 = com.ss.android.downloadlib.addownload.compliance.e.a(r4)     // Catch: java.lang.Exception -> L18
            int r0 = r4.e()     // Catch: java.lang.Exception -> L18
            if (r0 == 0) goto L33
            r4 = 403(0x193, float:5.65E-43)
            r2.c(r4, r3)     // Catch: java.lang.Exception -> L18
            r5.j()     // Catch: java.lang.Exception -> L18
            return
        L33:
            java.lang.String r0 = r4.u()     // Catch: java.lang.Exception -> L18
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L18
            if (r0 == 0) goto L46
            r4 = 405(0x195, float:5.68E-43)
            r2.c(r4, r3)     // Catch: java.lang.Exception -> L18
            r5.j()     // Catch: java.lang.Exception -> L18
            return
        L46:
            java.lang.String r3 = r4.u()     // Catch: java.lang.Exception -> L18
            r5.j(r3)     // Catch: java.lang.Exception -> L18
            return
        L4e:
            com.ss.android.downloadlib.up.a r4 = com.ss.android.downloadlib.up.a.a()
            java.lang.String r5 = "DownloadMiuiMarketHelper parseResponse"
            r4.j(r3, r5)
            return
    }

    private void i(com.ss.android.downloadlib.addownload.o.i r3, java.lang.String r4, byte[] r5, com.ss.android.downloadlib.addownload.compliance.d r6) {
            r2 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r2.a
            int r0 = r0.get()
            r1 = 6
            if (r0 >= r1) goto L12
            java.util.concurrent.atomic.AtomicInteger r0 = r2.a
            r0.incrementAndGet()
            r2.o(r3, r4, r5, r6)
            return
        L12:
            java.lang.String r4 = "当前网络不佳，请稍后再试"
            r2.j(r4)
            java.util.concurrent.atomic.AtomicInteger r4 = r2.a
            r5 = 0
            r4.set(r5)
            r4 = 402(0x192, float:5.63E-43)
            r2.c(r4, r3)
            return
    }

    private void j(java.lang.String r3) {
            r2 = this;
            com.ss.android.downloadlib.c r0 = com.ss.android.downloadlib.c.d()
            android.os.Handler r0 = r0.s()
            com.ss.android.downloadlib.addownload.compliance.c$c r1 = new com.ss.android.downloadlib.addownload.compliance.c$c
            r1.<init>(r2, r3)
            r0.post(r1)
            return
    }

    static /* synthetic */ byte[] k(com.ss.android.downloadlib.addownload.compliance.c r0, com.ss.android.downloadlib.addownload.o.i r1, boolean r2, int r3) {
            byte[] r0 = r0.l(r1, r2, r3)
            return r0
    }

    private byte[] l(com.ss.android.downloadlib.addownload.o.i r4, boolean r5, int r6) {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "download_url"
            java.lang.String r2 = r4.j()     // Catch: java.lang.Exception -> L8e
            r0.put(r1, r2)     // Catch: java.lang.Exception -> L8e
            java.lang.String r1 = "package_name"
            java.lang.String r2 = r4.up()     // Catch: java.lang.Exception -> L8e
            r0.put(r1, r2)     // Catch: java.lang.Exception -> L8e
            java.lang.String r1 = "call_scene"
            r2 = 50
            r0.put(r1, r2)     // Catch: java.lang.Exception -> L8e
            if (r5 == 0) goto L40
            java.lang.String r4 = "sender_package_name"
            android.content.Context r5 = com.ss.android.downloadlib.addownload.m.getContext()     // Catch: java.lang.Exception -> L8e
            java.lang.String r5 = r5.getPackageName()     // Catch: java.lang.Exception -> L8e
            r0.put(r4, r5)     // Catch: java.lang.Exception -> L8e
            java.lang.String r4 = "sender_version"
            com.ss.android.j.j.up.b r5 = com.ss.android.downloadlib.addownload.m.z()     // Catch: java.lang.Exception -> L8e
            java.lang.String r5 = r5.e     // Catch: java.lang.Exception -> L8e
            r0.put(r4, r5)     // Catch: java.lang.Exception -> L8e
            if (r6 <= 0) goto L97
            java.lang.String r4 = "store"
            r0.put(r4, r6)     // Catch: java.lang.Exception -> L8e
            goto L97
        L40:
            java.lang.String r5 = "id"
            long r1 = r4.xt()     // Catch: java.lang.Exception -> L8e
            java.lang.String r6 = java.lang.String.valueOf(r1)     // Catch: java.lang.Exception -> L8e
            r0.put(r5, r6)     // Catch: java.lang.Exception -> L8e
            com.ss.android.j.j.cw.b r5 = r4.tj()     // Catch: java.lang.Exception -> L8e
            com.ss.android.j.j.up.f r5 = r5.l()     // Catch: java.lang.Exception -> L8e
            if (r5 == 0) goto L84
            com.ss.android.j.j.cw.b r5 = r4.tj()     // Catch: java.lang.Exception -> L8e
            com.ss.android.j.j.up.f r5 = r5.l()     // Catch: java.lang.Exception -> L8e
            java.lang.String r5 = r5.b()     // Catch: java.lang.Exception -> L8e
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L8e
            if (r5 == 0) goto L72
            com.ss.android.downloadlib.up.a r5 = com.ss.android.downloadlib.up.a.a()     // Catch: java.lang.Exception -> L8e
            java.lang.String r6 = "web_url is null"
            r5.c(r6)     // Catch: java.lang.Exception -> L8e
        L72:
            java.lang.String r5 = "web_url"
            com.ss.android.j.j.cw.b r4 = r4.tj()     // Catch: java.lang.Exception -> L8e
            com.ss.android.j.j.up.f r4 = r4.l()     // Catch: java.lang.Exception -> L8e
            java.lang.String r4 = r4.b()     // Catch: java.lang.Exception -> L8e
            r0.put(r5, r4)     // Catch: java.lang.Exception -> L8e
            goto L97
        L84:
            com.ss.android.downloadlib.up.a r4 = com.ss.android.downloadlib.up.a.a()     // Catch: java.lang.Exception -> L8e
            java.lang.String r5 = "deeplink is null"
            r4.c(r5)     // Catch: java.lang.Exception -> L8e
            goto L97
        L8e:
            com.ss.android.downloadlib.up.a r4 = com.ss.android.downloadlib.up.a.a()
            java.lang.String r5 = "param build error"
            r4.c(r5)
        L97:
            java.lang.String r4 = r0.toString()
            byte[] r4 = r4.getBytes()
            return r4
    }

    private java.lang.String m() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.concurrent.atomic.AtomicInteger r1 = r3.a
            int r1 = r1.get()
            r2 = 3
            if (r1 >= r2) goto L11
            java.lang.String r1 = "https://apps.bytesfield.com"
            goto L13
        L11:
            java.lang.String r1 = "https://apps.bytesfield-b.com"
        L13:
            r0.append(r1)
            java.lang.String r1 = "/customer/api/app/deep_link"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    static /* synthetic */ void n(com.ss.android.downloadlib.addownload.compliance.c r0, com.ss.android.downloadlib.addownload.o.i r1, java.lang.String r2, byte[] r3, com.ss.android.downloadlib.addownload.compliance.d r4) {
            r0.i(r1, r2, r3, r4)
            return
    }

    private void o(@androidx.annotation.NonNull com.ss.android.downloadlib.addownload.o.i r8, java.lang.String r9, byte[] r10, com.ss.android.downloadlib.addownload.compliance.d r11) {
            r7 = this;
            v2.g r0 = com.ss.android.downloadlib.addownload.m.B()
            com.ss.android.downloadlib.addownload.compliance.c$b r1 = new com.ss.android.downloadlib.addownload.compliance.c$b
            r2 = r7
            r3 = r8
            r5 = r9
            r6 = r10
            r4 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            r2 = r5
            r5 = r1
            r1 = r2
            r2 = r6
            java.lang.String r3 = "application/json; charset=utf-8"
            r4 = 0
            r0.j(r1, r2, r3, r4, r5)
            return
    }

    public void c(int r3, com.ss.android.downloadlib.addownload.o.i r4) {
            r2 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "download_miui_market_fail_code"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> Lf
            r0.putOpt(r1, r3)     // Catch: java.lang.Exception -> Lf
            goto L13
        Lf:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)
        L13:
            com.ss.android.downloadlib.r.b r3 = com.ss.android.downloadlib.r.b.a()
            java.lang.String r1 = "get_miui_market_compliance_error"
            r3.r(r1, r0, r4)
            return
    }

    public void d(int r2, com.ss.android.downloadlib.addownload.o.i r3, org.json.JSONObject r4) {
            r1 = this;
            java.lang.String r0 = "download_miui_market_success_result"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> La
            r4.putOpt(r0, r2)     // Catch: java.lang.Exception -> La
            goto Le
        La:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
        Le:
            com.ss.android.downloadlib.r.b r2 = com.ss.android.downloadlib.r.b.a()
            java.lang.String r0 = "get_miui_market_compliance_success"
            r2.r(r0, r4, r3)
            return
    }

    public void g(com.ss.android.downloadlib.addownload.o.i r3, com.ss.android.downloadlib.addownload.compliance.d r4) {
            r2 = this;
            v2.g r0 = com.ss.android.downloadlib.addownload.m.B()
            if (r0 != 0) goto L15
            com.ss.android.downloadlib.up.a r4 = com.ss.android.downloadlib.up.a.a()
            java.lang.String r0 = "getDownloadNetworkFactory == NULL"
            r4.c(r0)
            r4 = 401(0x191, float:5.62E-43)
            r2.c(r4, r3)
            return
        L15:
            com.ss.android.downloadlib.e r0 = com.ss.android.downloadlib.e.c()
            com.ss.android.downloadlib.addownload.compliance.c$a r1 = new com.ss.android.downloadlib.addownload.compliance.c$a
            r1.<init>(r2, r3, r4)
            r0.d(r1)
            return
    }
}
