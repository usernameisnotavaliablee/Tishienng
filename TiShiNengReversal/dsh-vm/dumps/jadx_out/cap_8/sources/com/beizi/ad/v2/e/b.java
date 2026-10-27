package com.beizi.ad.v2.e;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b {
    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    private java.net.HttpURLConnection a(java.net.URL r2) throws java.io.IOException {
            r1 = this;
            java.net.URLConnection r2 = r2.openConnection()
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2
            r0 = 5000(0x1388, float:7.006E-42)
            r2.setConnectTimeout(r0)
            r2.setReadTimeout(r0)
            r0 = 1
            r2.setDoOutput(r0)
            r2.setDoInput(r0)
            r0 = 0
            r2.setUseCaches(r0)
            java.lang.String r0 = "POST"
            r2.setRequestMethod(r0)
            return r2
    }

    private void a(java.net.HttpURLConnection r3, byte[] r4) throws java.io.IOException {
            r2 = this;
            com.beizi.ad.internal.h r0 = com.beizi.ad.internal.h.a()
            java.lang.String r0 = r0.f6835e
            java.lang.String r1 = "User-Agent"
            r3.setRequestProperty(r1, r0)
            java.lang.String r0 = "Content-Type"
            java.lang.String r1 = "application/json"
            r3.setRequestProperty(r0, r1)
            java.lang.String r0 = "Accept"
            r3.setRequestProperty(r0, r1)
            java.lang.String r0 = com.beizi.ad.internal.h.x.a()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L26
            java.lang.String r1 = "Cookie"
            r3.setRequestProperty(r1, r0)
        L26:
            int r0 = r4.length
            java.lang.String r0 = java.lang.Integer.toString(r0)
            java.lang.String r1 = "Connect-Length"
            r3.setRequestProperty(r1, r0)
            int r0 = r4.length
            r3.setFixedLengthStreamingMode(r0)
            java.io.OutputStream r3 = r3.getOutputStream()
            r3.write(r4)
            r3.flush()
            r3.close()
            return
    }

    private boolean a(int r2) {
            r1 = this;
            r0 = 200(0xc8, float:2.8E-43)
            if (r2 == r0) goto L6
            r2 = 0
            return r2
        L6:
            r2 = 1
            return r2
    }

    private byte[] b(com.beizi.ad.model.b r2) {
            r1 = this;
            java.lang.String r2 = r1.a(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto Lc
            r2 = 0
            return r2
        Lc:
            byte[] r2 = r2.getBytes()
            return r2
    }

    public java.lang.String a(com.beizi.ad.model.b r9) {
            r8 = this;
            com.beizi.ad.internal.h r0 = com.beizi.ad.internal.h.a()
            com.beizi.ad.internal.h.a r1 = com.beizi.ad.internal.h.a.a()
            com.beizi.ad.model.e$a$a r2 = new com.beizi.ad.model.e$a$a
            r2.<init>()
            java.lang.String r3 = r1.d()
            com.beizi.ad.model.e$a$a r2 = r2.a(r3)
            java.lang.String r3 = r1.e()
            com.beizi.ad.model.e$a$a r2 = r2.j(r3)
            java.lang.String r3 = r1.w()
            com.beizi.ad.model.e$a$a r2 = r2.l(r3)
            java.lang.String r3 = r1.x()
            com.beizi.ad.model.e$a$a r2 = r2.m(r3)
            java.lang.String r3 = r1.b()
            com.beizi.ad.model.e$a$a r2 = r2.n(r3)
            java.lang.String r3 = ""
            com.beizi.ad.model.e$a$a r2 = r2.b(r3)
            java.lang.String r3 = r1.r()
            com.beizi.ad.model.e$a$a r2 = r2.c(r3)
            com.beizi.ad.model.f$e r3 = com.beizi.ad.model.f.e.f7453c
            com.beizi.ad.model.e$a$a r2 = r2.a(r3)
            com.beizi.ad.model.f$b r3 = r1.n()
            com.beizi.ad.model.e$a$a r2 = r2.a(r3)
            java.lang.String r3 = r1.s()
            com.beizi.ad.model.e$a$a r2 = r2.d(r3)
            java.lang.String r3 = r1.t()
            com.beizi.ad.model.e$a$a r2 = r2.e(r3)
            java.lang.String r3 = r1.u()
            com.beizi.ad.model.e$a$a r2 = r2.f(r3)
            java.lang.String r3 = r1.g()
            com.beizi.ad.model.e$a$a r2 = r2.g(r3)
            java.lang.String r3 = r1.h()
            com.beizi.ad.model.e$a$a r2 = r2.h(r3)
            java.lang.String r3 = r1.v()
            com.beizi.ad.model.e$a$a r2 = r2.i(r3)
            java.lang.String r3 = r1.f()
            com.beizi.ad.model.e$a$a r2 = r2.k(r3)
            java.lang.String r3 = r1.k()
            com.beizi.ad.model.e$a$a r2 = r2.o(r3)
            boolean r3 = r1.m()
            com.beizi.ad.model.e$a$a r2 = r2.a(r3)
            java.lang.String r3 = r1.p()
            com.beizi.ad.model.e$a$a r2 = r2.p(r3)
            java.lang.String r3 = r1.q()
            com.beizi.ad.model.e$a$a r2 = r2.q(r3)
            java.lang.String r3 = r1.o()
            com.beizi.ad.model.e$a$a r2 = r2.r(r3)
            java.lang.String r3 = r1.i()
            com.beizi.ad.model.e$a$a r2 = r2.s(r3)
            java.lang.String r3 = r1.j()
            com.beizi.ad.model.e$a$a r2 = r2.t(r3)
            java.lang.String r3 = r1.l()
            com.beizi.ad.model.e$a$a r2 = r2.u(r3)
            java.lang.String r3 = r1.c()
            com.beizi.ad.model.e$a$a r2 = r2.v(r3)
            com.beizi.ad.internal.h r3 = com.beizi.ad.internal.h.a()
            int r3 = r3.o()
            com.beizi.ad.model.e$a$a r2 = r2.a(r3)
            java.lang.String r3 = r1.D()
            com.beizi.ad.model.e$a$a r2 = r2.w(r3)
            java.lang.String r3 = r1.E()
            com.beizi.ad.model.e$a$a r2 = r2.x(r3)
            com.beizi.ad.model.e$a r2 = r2.a()
            com.beizi.ad.internal.h.r r3 = com.beizi.ad.internal.h.r.a()
            r3.d()
            com.beizi.ad.model.e$c$a r4 = new com.beizi.ad.model.e$c$a
            r4.<init>()
            com.beizi.ad.model.f$d r5 = r3.b()
            r4.a(r5)
            com.beizi.ad.model.f$c r5 = r3.c()
            r4.a(r5)
            java.lang.String r5 = r3.f6912b
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L13f
            java.lang.String r5 = r3.f6913c
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L13f
            com.beizi.ad.model.e$b$a r5 = new com.beizi.ad.model.e$b$a
            r5.<init>()
            java.lang.String r6 = r3.f6913c
            com.beizi.ad.model.e$b$a r5 = r5.b(r6)
            java.lang.String r6 = r3.f6912b
            com.beizi.ad.model.e$b$a r5 = r5.a(r6)
            java.lang.String r6 = r3.f6914d
            com.beizi.ad.model.e$b$a r5 = r5.c(r6)
            long r6 = r3.f6915e
            com.beizi.ad.model.e$b$a r3 = r5.a(r6)
            com.beizi.ad.model.e$b r3 = r3.a()
            r4.a(r3)
        L13f:
            com.beizi.ad.model.a$b$a r3 = new com.beizi.ad.model.a$b$a
            r3.<init>()
            java.lang.String r5 = r1.z()
            com.beizi.ad.model.a$b$a r3 = r3.a(r5)
            com.beizi.ad.model.f$i r5 = com.beizi.ad.model.f.i.f7472b
            com.beizi.ad.model.a$b$a r3 = r3.a(r5)
            com.beizi.ad.model.f$g r5 = com.beizi.ad.model.f.g.f7464b
            com.beizi.ad.model.a$b$a r3 = r3.a(r5)
            long r5 = com.beizi.ad.lance.a.q.c()
            com.beizi.ad.model.a$b$a r3 = r3.a(r5)
            java.lang.String r0 = r0.d()
            com.beizi.ad.model.a$b$a r0 = r3.b(r0)
            com.beizi.ad.model.a$b$a r0 = r0.a(r2)
            com.beizi.ad.model.e$c r2 = r4.a()
            com.beizi.ad.model.a$b$a r0 = r0.a(r2)
            java.lang.String r2 = r1.y()
            com.beizi.ad.model.a$b$a r0 = r0.c(r2)
            java.lang.String r2 = r1.C()
            com.beizi.ad.model.a$b$a r0 = r0.d(r2)
            long r2 = r1.A()
            com.beizi.ad.model.a$b$a r0 = r0.b(r2)
            long r1 = r1.B()
            com.beizi.ad.model.a$b$a r0 = r0.c(r1)
            com.beizi.ad.model.a$a$a r1 = new com.beizi.ad.model.a$a$a
            r1.<init>()
            if (r9 == 0) goto L1bf
            java.lang.String r2 = r9.a()
            r1.a(r2)
            java.lang.String r2 = r9.c()
            r1.c(r2)
            boolean r2 = r9.b()
            if (r2 == 0) goto L1b4
            r2 = 1
            r1.a(r2)
            goto L1b8
        L1b4:
            r2 = 0
            r1.a(r2)
        L1b8:
            java.util.List r9 = r9.d()
            r1.a(r9)
        L1bf:
            com.beizi.ad.model.a$a r9 = r1.a()
            r0.a(r9)
            com.beizi.ad.model.a$b r9 = r0.a()
            java.lang.String r0 = com.beizi.ad.lance.a.l.a()
            java.lang.String r1 = r9.toString()
            java.lang.String r0 = com.beizi.ad.lance.a.a.a(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "sdkRequest:"
            r1.append(r2)
            java.lang.String r9 = r9.toString()
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            java.lang.String r1 = "lance"
            com.beizi.ad.lance.a.m.d(r1, r9)
            return r0
    }

    public java.lang.String a(java.lang.String r8, boolean r9) {
            r7 = this;
            com.beizi.ad.internal.h.a r0 = com.beizi.ad.internal.h.a.a()
            com.beizi.ad.model.e$a$a r1 = new com.beizi.ad.model.e$a$a
            r1.<init>()
            java.lang.String r2 = r0.d()
            com.beizi.ad.model.e$a$a r1 = r1.a(r2)
            java.lang.String r2 = r0.e()
            com.beizi.ad.model.e$a$a r1 = r1.j(r2)
            java.lang.String r2 = r0.w()
            com.beizi.ad.model.e$a$a r1 = r1.l(r2)
            java.lang.String r2 = r0.x()
            com.beizi.ad.model.e$a$a r1 = r1.m(r2)
            java.lang.String r2 = r0.b()
            com.beizi.ad.model.e$a$a r1 = r1.n(r2)
            java.lang.String r2 = ""
            com.beizi.ad.model.e$a$a r1 = r1.b(r2)
            java.lang.String r2 = r0.r()
            com.beizi.ad.model.e$a$a r1 = r1.c(r2)
            com.beizi.ad.model.f$e r2 = com.beizi.ad.model.f.e.f7453c
            com.beizi.ad.model.e$a$a r1 = r1.a(r2)
            com.beizi.ad.model.f$b r2 = r0.n()
            com.beizi.ad.model.e$a$a r1 = r1.a(r2)
            java.lang.String r2 = r0.s()
            com.beizi.ad.model.e$a$a r1 = r1.d(r2)
            java.lang.String r2 = r0.t()
            com.beizi.ad.model.e$a$a r1 = r1.e(r2)
            java.lang.String r2 = r0.u()
            com.beizi.ad.model.e$a$a r1 = r1.f(r2)
            java.lang.String r2 = r0.g()
            com.beizi.ad.model.e$a$a r1 = r1.g(r2)
            java.lang.String r2 = r0.h()
            com.beizi.ad.model.e$a$a r1 = r1.h(r2)
            java.lang.String r2 = r0.v()
            com.beizi.ad.model.e$a$a r1 = r1.i(r2)
            java.lang.String r2 = r0.f()
            com.beizi.ad.model.e$a$a r1 = r1.k(r2)
            java.lang.String r2 = r0.k()
            com.beizi.ad.model.e$a$a r1 = r1.o(r2)
            boolean r2 = r0.m()
            com.beizi.ad.model.e$a$a r1 = r1.a(r2)
            java.lang.String r2 = r0.p()
            com.beizi.ad.model.e$a$a r1 = r1.p(r2)
            java.lang.String r2 = r0.q()
            com.beizi.ad.model.e$a$a r1 = r1.q(r2)
            java.lang.String r2 = r0.o()
            com.beizi.ad.model.e$a$a r1 = r1.r(r2)
            java.lang.String r2 = r0.i()
            com.beizi.ad.model.e$a$a r1 = r1.s(r2)
            java.lang.String r2 = r0.j()
            com.beizi.ad.model.e$a$a r1 = r1.t(r2)
            java.lang.String r2 = r0.l()
            com.beizi.ad.model.e$a$a r1 = r1.u(r2)
            java.lang.String r2 = r0.c()
            com.beizi.ad.model.e$a$a r1 = r1.v(r2)
            com.beizi.ad.internal.h r2 = com.beizi.ad.internal.h.a()
            int r2 = r2.o()
            com.beizi.ad.model.e$a$a r1 = r1.a(r2)
            java.lang.String r2 = r0.D()
            com.beizi.ad.model.e$a$a r1 = r1.w(r2)
            java.lang.String r2 = r0.E()
            com.beizi.ad.model.e$a$a r1 = r1.x(r2)
            com.beizi.ad.model.e$a r1 = r1.a()
            com.beizi.ad.internal.h.r r2 = com.beizi.ad.internal.h.r.a()
            r2.d()
            com.beizi.ad.model.e$c$a r3 = new com.beizi.ad.model.e$c$a
            r3.<init>()
            com.beizi.ad.model.f$d r4 = r2.b()
            r3.a(r4)
            com.beizi.ad.model.f$c r4 = r2.c()
            r3.a(r4)
            java.lang.String r4 = r2.f6912b
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L13b
            java.lang.String r4 = r2.f6913c
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L13b
            com.beizi.ad.model.e$b$a r4 = new com.beizi.ad.model.e$b$a
            r4.<init>()
            java.lang.String r5 = r2.f6913c
            com.beizi.ad.model.e$b$a r4 = r4.b(r5)
            java.lang.String r5 = r2.f6912b
            com.beizi.ad.model.e$b$a r4 = r4.a(r5)
            java.lang.String r5 = r2.f6914d
            com.beizi.ad.model.e$b$a r4 = r4.c(r5)
            long r5 = r2.f6915e
            com.beizi.ad.model.e$b$a r2 = r4.a(r5)
            com.beizi.ad.model.e$b r2 = r2.a()
            r3.a(r2)
        L13b:
            com.beizi.ad.model.a$b$a r2 = new com.beizi.ad.model.a$b$a
            r2.<init>()
            java.lang.String r4 = r0.z()
            com.beizi.ad.model.a$b$a r2 = r2.a(r4)
            com.beizi.ad.model.f$i r4 = com.beizi.ad.model.f.i.f7472b
            com.beizi.ad.model.a$b$a r2 = r2.a(r4)
            com.beizi.ad.model.f$g r4 = com.beizi.ad.model.f.g.f7464b
            com.beizi.ad.model.a$b$a r2 = r2.a(r4)
            long r4 = com.beizi.ad.lance.a.q.c()
            com.beizi.ad.model.a$b$a r2 = r2.a(r4)
            com.beizi.ad.model.a$b$a r1 = r2.a(r1)
            com.beizi.ad.model.e$c r2 = r3.a()
            com.beizi.ad.model.a$b$a r1 = r1.a(r2)
            java.lang.String r2 = r0.y()
            com.beizi.ad.model.a$b$a r1 = r1.c(r2)
            java.lang.String r2 = r0.C()
            com.beizi.ad.model.a$b$a r1 = r1.d(r2)
            long r2 = r0.A()
            com.beizi.ad.model.a$b$a r1 = r1.b(r2)
            long r2 = r0.B()
            com.beizi.ad.model.a$b$a r0 = r1.c(r2)
            com.beizi.ad.model.a$a$a r1 = new com.beizi.ad.model.a$a$a
            r1.<init>()
            com.beizi.ad.model.a$a$a r8 = r1.c(r8)
            com.beizi.ad.model.a$a$a r8 = r8.a(r9)
            com.beizi.ad.model.a$a r8 = r8.a()
            r0.a(r8)
            com.beizi.ad.model.a$b r8 = r0.a()
            java.lang.String r9 = com.beizi.ad.lance.a.l.a()
            java.lang.String r0 = r8.toString()
            java.lang.String r9 = com.beizi.ad.lance.a.a.a(r9, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "sdkRequest:"
            r0.append(r1)
            java.lang.String r8 = r8.toString()
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            java.lang.String r0 = "lance"
            com.beizi.ad.lance.a.m.d(r0, r8)
            return r9
    }

    public void a(com.beizi.ad.model.b r5, com.beizi.ad.v2.e.a r6) {
            r4 = this;
            if (r5 == 0) goto L65
            if (r6 != 0) goto L5
            goto L65
        L5:
            com.beizi.ad.internal.h r0 = com.beizi.ad.internal.h.a()     // Catch: java.lang.Exception -> L65
            java.lang.String r0 = r0.l()     // Catch: java.lang.Exception -> L65
            java.lang.String r1 = "lance"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L65
            r2.<init>()     // Catch: java.lang.Exception -> L65
            java.lang.String r3 = "getRequestBaseUrl:"
            r2.append(r3)     // Catch: java.lang.Exception -> L65
            r2.append(r0)     // Catch: java.lang.Exception -> L65
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L65
            com.beizi.ad.lance.a.m.d(r1, r2)     // Catch: java.lang.Exception -> L65
            java.net.URL r1 = new java.net.URL     // Catch: java.lang.Exception -> L65
            r1.<init>(r0)     // Catch: java.lang.Exception -> L65
            java.net.HttpURLConnection r0 = r4.a(r1)     // Catch: java.lang.Exception -> L65
            byte[] r5 = r4.b(r5)     // Catch: java.lang.Exception -> L65
            if (r5 != 0) goto L37
            r5 = 4
            r6.a(r5)     // Catch: java.lang.Exception -> L65
            return
        L37:
            r4.a(r0, r5)     // Catch: java.lang.Exception -> L65
            r0.connect()     // Catch: java.lang.Exception -> L65
            int r5 = r0.getResponseCode()     // Catch: java.lang.Exception -> L65
            boolean r5 = r4.a(r5)     // Catch: java.lang.Exception -> L65
            if (r5 != 0) goto L4c
            r5 = 2
            r6.a(r5)     // Catch: java.lang.Exception -> L65
            return
        L4c:
            java.io.InputStream r5 = r0.getInputStream()     // Catch: java.lang.Exception -> L65
            java.lang.String r0 = com.beizi.ad.model.c.l.a(r5)     // Catch: java.lang.Exception -> L65
            r5.close()     // Catch: java.lang.Exception -> L65
            boolean r5 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L65
            if (r5 == 0) goto L62
            r5 = 3
            r6.a(r5)     // Catch: java.lang.Exception -> L65
            return
        L62:
            r6.a(r0)     // Catch: java.lang.Exception -> L65
        L65:
            return
    }
}
