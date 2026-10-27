package com.ss.android.downloadlib.addownload;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class l implements com.ss.android.downloadlib.addownload.a, com.ss.android.downloadlib.a.p.InterfaceC0196a {
    private static final java.lang.String u = "l";
    private final com.ss.android.downloadlib.a.p a;
    private com.ss.android.downloadlib.addownload.k b;
    private com.ss.android.downloadlib.addownload.j c;
    private java.lang.ref.WeakReference<android.content.Context> d;
    private final java.util.Map<java.lang.Integer, java.lang.Object> e;
    private com.ss.android.j.j.up.e f;
    private com.ss.android.socialbase.downloader.ae.cw g;
    private com.ss.android.downloadlib.addownload.l.j h;
    private final com.ss.android.socialbase.downloader.r.a i;
    private boolean j;
    private long k;
    private java.lang.String l;
    private long m;
    private com.ss.android.j.j.cw.b n;
    private com.ss.android.j.j.cw.g o;
    private com.ss.android.j.j.cw.c p;
    private java.lang.ref.SoftReference<v2.d> q;
    private boolean r;
    private final boolean s;
    private java.lang.ref.SoftReference<v2.h> t;

    class a implements com.ss.android.downloadlib.addownload.compliance.d {
        final /* synthetic */ int a;
        final /* synthetic */ com.ss.android.downloadlib.addownload.l b;

        a(com.ss.android.downloadlib.addownload.l r1, int r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // com.ss.android.downloadlib.addownload.compliance.d
        public void j() {
                r8 = this;
                int r0 = r8.a
                r1 = 0
                java.lang.String r2 = ",tryPerformButtonClick:"
                java.lang.String r3 = "miui new get miui deeplink fail: handleDownload id:"
                r4 = 1
                if (r0 == r4) goto L30
                r5 = 2
                if (r0 == r5) goto Le
                return
            Le:
                java.lang.String r0 = com.ss.android.downloadlib.addownload.l.K()
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>(r3)
                com.ss.android.downloadlib.addownload.l r3 = r8.b
                long r6 = com.ss.android.downloadlib.addownload.l.m(r3)
                r5.append(r6)
                r5.append(r2)
                java.lang.String r2 = r5.toString()
                com.ss.android.socialbase.downloader.m.j.j(r0, r2, r1)
                com.ss.android.downloadlib.addownload.l r0 = r8.b
                r0.X(r4)
                return
            L30:
                java.lang.String r0 = com.ss.android.downloadlib.addownload.l.K()
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>(r3)
                com.ss.android.downloadlib.addownload.l r3 = r8.b
                long r6 = com.ss.android.downloadlib.addownload.l.m(r3)
                r5.append(r6)
                r5.append(r2)
                java.lang.String r2 = r5.toString()
                com.ss.android.socialbase.downloader.m.j.j(r0, r2, r1)
                com.ss.android.downloadlib.addownload.l r0 = r8.b
                r0.n(r4)
                return
        }

        @Override // com.ss.android.downloadlib.addownload.compliance.d
        public void j(java.lang.String r9) {
                r8 = this;
                r0 = 1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
                org.json.JSONObject r5 = new org.json.JSONObject
                r5.<init>()
                java.lang.String r2 = "download_miui_new_market"
                r5.putOpt(r2, r1)     // Catch: java.lang.Exception -> L74
                java.lang.String r2 = "download_miui_market_deeplink"
                r5.putOpt(r2, r9)     // Catch: java.lang.Exception -> L74
                com.ss.android.downloadlib.addownload.l r2 = r8.b     // Catch: java.lang.Exception -> L74
                android.content.Context r2 = com.ss.android.downloadlib.addownload.l.t(r2)     // Catch: java.lang.Exception -> L74
                com.ss.android.downloadlib.addownload.l r3 = r8.b     // Catch: java.lang.Exception -> L74
                com.ss.android.downloadlib.addownload.k r3 = com.ss.android.downloadlib.addownload.l.V(r3)     // Catch: java.lang.Exception -> L74
                com.ss.android.downloadlib.addownload.o$i r3 = r3.b     // Catch: java.lang.Exception -> L74
                int r7 = r8.a     // Catch: java.lang.Exception -> L74
                r6 = 1
                r4 = r9
                boolean r9 = com.ss.android.downloadlib.a.m.B(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L74
                r2 = 0
                java.lang.String r3 = "download_miui_jump_market_success"
                if (r9 != 0) goto L99
                java.lang.Integer r9 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L74
                r5.putOpt(r3, r9)     // Catch: java.lang.Exception -> L74
                com.ss.android.downloadlib.addownload.compliance.c r9 = com.ss.android.downloadlib.addownload.compliance.c.a()     // Catch: java.lang.Exception -> L74
                com.ss.android.downloadlib.addownload.l r1 = r8.b     // Catch: java.lang.Exception -> L74
                com.ss.android.downloadlib.addownload.k r1 = com.ss.android.downloadlib.addownload.l.V(r1)     // Catch: java.lang.Exception -> L74
                com.ss.android.downloadlib.addownload.o$i r1 = r1.b     // Catch: java.lang.Exception -> L74
                r9.d(r0, r1, r5)     // Catch: java.lang.Exception -> L74
                int r9 = r8.a     // Catch: java.lang.Exception -> L74
                r1 = 0
                java.lang.String r2 = ",tryPerformButtonClick:"
                java.lang.String r3 = "miui new rollback fail: handleDownload id:"
                if (r9 == r0) goto L77
                r4 = 2
                if (r9 == r4) goto L52
                return
            L52:
                java.lang.String r9 = com.ss.android.downloadlib.addownload.l.K()     // Catch: java.lang.Exception -> L74
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L74
                r4.<init>(r3)     // Catch: java.lang.Exception -> L74
                com.ss.android.downloadlib.addownload.l r3 = r8.b     // Catch: java.lang.Exception -> L74
                long r5 = com.ss.android.downloadlib.addownload.l.m(r3)     // Catch: java.lang.Exception -> L74
                r4.append(r5)     // Catch: java.lang.Exception -> L74
                r4.append(r2)     // Catch: java.lang.Exception -> L74
                java.lang.String r2 = r4.toString()     // Catch: java.lang.Exception -> L74
                com.ss.android.socialbase.downloader.m.j.j(r9, r2, r1)     // Catch: java.lang.Exception -> L74
                com.ss.android.downloadlib.addownload.l r9 = r8.b     // Catch: java.lang.Exception -> L74
                r9.X(r0)     // Catch: java.lang.Exception -> L74
                return
            L74:
                r0 = move-exception
                r9 = r0
                goto Lac
            L77:
                java.lang.String r9 = com.ss.android.downloadlib.addownload.l.K()     // Catch: java.lang.Exception -> L74
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L74
                r4.<init>(r3)     // Catch: java.lang.Exception -> L74
                com.ss.android.downloadlib.addownload.l r3 = r8.b     // Catch: java.lang.Exception -> L74
                long r5 = com.ss.android.downloadlib.addownload.l.m(r3)     // Catch: java.lang.Exception -> L74
                r4.append(r5)     // Catch: java.lang.Exception -> L74
                r4.append(r2)     // Catch: java.lang.Exception -> L74
                java.lang.String r2 = r4.toString()     // Catch: java.lang.Exception -> L74
                com.ss.android.socialbase.downloader.m.j.j(r9, r2, r1)     // Catch: java.lang.Exception -> L74
                com.ss.android.downloadlib.addownload.l r9 = r8.b     // Catch: java.lang.Exception -> L74
                r9.n(r0)     // Catch: java.lang.Exception -> L74
                return
            L99:
                r5.putOpt(r3, r1)     // Catch: java.lang.Exception -> L74
                com.ss.android.downloadlib.addownload.compliance.c r9 = com.ss.android.downloadlib.addownload.compliance.c.a()     // Catch: java.lang.Exception -> L74
                com.ss.android.downloadlib.addownload.l r0 = r8.b     // Catch: java.lang.Exception -> L74
                com.ss.android.downloadlib.addownload.k r0 = com.ss.android.downloadlib.addownload.l.V(r0)     // Catch: java.lang.Exception -> L74
                com.ss.android.downloadlib.addownload.o$i r0 = r0.b     // Catch: java.lang.Exception -> L74
                r9.d(r2, r0, r5)     // Catch: java.lang.Exception -> L74
                return
            Lac:
                com.ss.android.downloadlib.up.a r0 = com.ss.android.downloadlib.up.a.a()
                java.lang.String r1 = "generate miui new market param error"
                r0.j(r9, r1)
                return
        }
    }

    class b implements java.lang.Runnable {
        final /* synthetic */ com.ss.android.downloadlib.addownload.l a;

        b(com.ss.android.downloadlib.addownload.l r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                com.ss.android.downloadlib.addownload.l r0 = r3.a
                java.util.Map r0 = com.ss.android.downloadlib.addownload.l.M(r0)
                java.util.List r0 = com.ss.android.downloadlib.addownload.k.g(r0)
                java.util.Iterator r0 = r0.iterator()
            Le:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L24
                java.lang.Object r1 = r0.next()
                com.ss.android.j.j.cw.e r1 = (com.ss.android.j.j.cw.e) r1
                com.ss.android.downloadlib.addownload.l r2 = r3.a
                com.ss.android.j.j.up.e r2 = com.ss.android.downloadlib.addownload.l.Q(r2)
                r1.onInstalled(r2)
                goto Le
            L24:
                return
        }
    }

    class c implements com.ss.android.downloadlib.addownload.l.k {
        final /* synthetic */ int a;
        final /* synthetic */ int b;
        final /* synthetic */ com.ss.android.downloadlib.addownload.l c;

        c(com.ss.android.downloadlib.addownload.l r1, int r2, int r3) {
                r0 = this;
                r0.c = r1
                r0.a = r2
                r0.b = r3
                r0.<init>()
                return
        }

        @Override // com.ss.android.downloadlib.addownload.l.k
        public void j() {
                r4 = this;
                com.ss.android.downloadlib.addownload.l r0 = r4.c
                com.ss.android.downloadlib.addownload.j r0 = com.ss.android.downloadlib.addownload.l.G(r0)
                boolean r0 = r0.o()
                if (r0 == 0) goto Ld
                return
            Ld:
                com.ss.android.downloadlib.addownload.l r0 = r4.c
                int r1 = r4.a
                int r2 = r4.b
                com.ss.android.socialbase.downloader.ae.cw r3 = com.ss.android.downloadlib.addownload.l.g(r0)
                com.ss.android.downloadlib.addownload.l.B(r0, r1, r2, r3)
                return
        }
    }

    class d implements java.lang.Runnable {
        final /* synthetic */ com.ss.android.downloadlib.addownload.l a;

        d(com.ss.android.downloadlib.addownload.l r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r7 = this;
                v2.w r0 = com.ss.android.downloadlib.addownload.m.d()
                android.content.Context r2 = com.ss.android.downloadlib.addownload.m.getContext()
                com.ss.android.downloadlib.addownload.l r1 = r7.a
                com.ss.android.j.j.cw.b r3 = com.ss.android.downloadlib.addownload.l.O(r1)
                r5 = 0
                r6 = 0
                r1 = 13
                java.lang.String r4 = "已恢复下载"
                r0.j(r1, r2, r3, r4, r5, r6)
                return
        }
    }

    class e implements com.ss.android.downloadlib.addownload.j.a {
        final /* synthetic */ com.ss.android.downloadlib.addownload.l a;

        e(com.ss.android.downloadlib.addownload.l r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.ss.android.downloadlib.addownload.j.a
        public void delete() {
                r2 = this;
                com.ss.android.downloadlib.addownload.l r0 = r2.a
                r1 = 1
                r0.j(r1)
                return
        }
    }

    class f implements com.ss.android.downloadlib.addownload.j.o {
        final /* synthetic */ int a;
        final /* synthetic */ boolean b;
        final /* synthetic */ com.ss.android.xt.j.xt.b c;
        final /* synthetic */ int d;
        final /* synthetic */ com.ss.android.downloadlib.addownload.l e;

        f(com.ss.android.downloadlib.addownload.l r1, int r2, boolean r3, com.ss.android.xt.j.xt.b r4, int r5) {
                r0 = this;
                r0.e = r1
                r0.a = r2
                r0.b = r3
                r0.c = r4
                r0.d = r5
                r0.<init>()
                return
        }

        @Override // com.ss.android.downloadlib.addownload.j.o
        public void a(com.ss.android.xt.j.xt.b r4) {
                r3 = this;
                com.ss.android.downloadlib.addownload.l r0 = r3.e
                com.ss.android.socialbase.downloader.ae.cw r0 = com.ss.android.downloadlib.addownload.l.g(r0)
                if (r0 != 0) goto L27
                com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.cw()
                java.lang.String r1 = "fix_handle_pause"
                boolean r0 = r0.j(r1)
                if (r0 == 0) goto L27
                com.ss.android.downloadlib.addownload.l r0 = r3.e
                android.content.Context r1 = com.ss.android.downloadlib.addownload.m.getContext()
                com.ss.android.socialbase.downloader.downloader.ae r1 = com.ss.android.socialbase.downloader.downloader.ae.xt(r1)
                int r2 = r3.a
                com.ss.android.socialbase.downloader.ae.cw r1 = r1.tl(r2)
                com.ss.android.downloadlib.addownload.l.z(r0, r1)
            L27:
                com.ss.android.downloadlib.addownload.l r0 = r3.e
                com.ss.android.downloadlib.addownload.k r0 = com.ss.android.downloadlib.addownload.l.V(r0)
                com.ss.android.downloadlib.addownload.l r1 = r3.e
                com.ss.android.socialbase.downloader.ae.cw r1 = com.ss.android.downloadlib.addownload.l.g(r1)
                boolean r2 = r3.b
                r0.n(r1, r2)
                com.ss.android.downloadlib.addownload.l r0 = r3.e
                com.ss.android.socialbase.downloader.ae.cw r0 = com.ss.android.downloadlib.addownload.l.g(r0)
                if (r0 == 0) goto L6b
                android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
                boolean r0 = com.ss.android.socialbase.downloader.az.m.xt(r0)
                if (r0 == 0) goto L6b
                com.ss.android.downloadlib.addownload.l r0 = r3.e
                com.ss.android.socialbase.downloader.ae.cw r0 = com.ss.android.downloadlib.addownload.l.g(r0)
                boolean r0 = r0.qb()
                if (r0 == 0) goto L6b
                com.ss.android.downloadlib.addownload.l r4 = r3.e
                com.ss.android.socialbase.downloader.ae.cw r4 = com.ss.android.downloadlib.addownload.l.g(r4)
                r4.k()
                com.ss.android.downloadlib.r.b r4 = com.ss.android.downloadlib.r.b.a()
                java.lang.String r0 = "cancel_pause_reserve_wifi_cancel_on_wifi"
                com.ss.android.xt.j.xt.b r1 = r3.c
                r4.m(r0, r1)
                return
            L6b:
                com.ss.android.downloadlib.addownload.i r0 = com.ss.android.downloadlib.addownload.i.b()
                com.ss.android.downloadlib.addownload.l r1 = r3.e
                com.ss.android.j.j.cw.b r1 = com.ss.android.downloadlib.addownload.l.O(r1)
                com.ss.android.downloadlib.addownload.l r2 = r3.e
                com.ss.android.socialbase.downloader.ae.cw r2 = com.ss.android.downloadlib.addownload.l.g(r2)
                r0.d(r1, r2)
                long r0 = java.lang.System.currentTimeMillis()
                r4.m0(r0)
                com.ss.android.downloadlib.addownload.l r4 = r3.e
                int r0 = r3.a
                int r1 = r3.d
                com.ss.android.socialbase.downloader.ae.cw r2 = com.ss.android.downloadlib.addownload.l.g(r4)
                com.ss.android.downloadlib.addownload.l.B(r4, r0, r1, r2)
                return
        }
    }

    class g implements com.ss.android.downloadlib.addownload.j.o {
        final /* synthetic */ int a;
        final /* synthetic */ boolean b;
        final /* synthetic */ com.ss.android.xt.j.xt.b c;
        final /* synthetic */ int d;
        final /* synthetic */ com.ss.android.downloadlib.addownload.l e;

        g(com.ss.android.downloadlib.addownload.l r1, int r2, boolean r3, com.ss.android.xt.j.xt.b r4, int r5) {
                r0 = this;
                r0.e = r1
                r0.a = r2
                r0.b = r3
                r0.c = r4
                r0.d = r5
                r0.<init>()
                return
        }

        @Override // com.ss.android.downloadlib.addownload.j.o
        public void a(com.ss.android.xt.j.xt.b r4) {
                r3 = this;
                com.ss.android.downloadlib.addownload.l r0 = r3.e
                com.ss.android.socialbase.downloader.ae.cw r0 = com.ss.android.downloadlib.addownload.l.g(r0)
                if (r0 != 0) goto L27
                com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.cw()
                java.lang.String r1 = "fix_handle_pause"
                boolean r0 = r0.j(r1)
                if (r0 == 0) goto L27
                com.ss.android.downloadlib.addownload.l r0 = r3.e
                android.content.Context r1 = com.ss.android.downloadlib.addownload.m.getContext()
                com.ss.android.socialbase.downloader.downloader.ae r1 = com.ss.android.socialbase.downloader.downloader.ae.xt(r1)
                int r2 = r3.a
                com.ss.android.socialbase.downloader.ae.cw r1 = r1.tl(r2)
                com.ss.android.downloadlib.addownload.l.z(r0, r1)
            L27:
                com.ss.android.downloadlib.addownload.l r0 = r3.e
                com.ss.android.downloadlib.addownload.k r0 = com.ss.android.downloadlib.addownload.l.V(r0)
                com.ss.android.downloadlib.addownload.l r1 = r3.e
                com.ss.android.socialbase.downloader.ae.cw r1 = com.ss.android.downloadlib.addownload.l.g(r1)
                boolean r2 = r3.b
                r0.n(r1, r2)
                com.ss.android.downloadlib.addownload.l r0 = r3.e
                com.ss.android.socialbase.downloader.ae.cw r0 = com.ss.android.downloadlib.addownload.l.g(r0)
                if (r0 == 0) goto L6b
                android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
                boolean r0 = com.ss.android.socialbase.downloader.az.m.xt(r0)
                if (r0 == 0) goto L6b
                com.ss.android.downloadlib.addownload.l r0 = r3.e
                com.ss.android.socialbase.downloader.ae.cw r0 = com.ss.android.downloadlib.addownload.l.g(r0)
                boolean r0 = r0.qb()
                if (r0 == 0) goto L6b
                com.ss.android.downloadlib.addownload.l r4 = r3.e
                com.ss.android.socialbase.downloader.ae.cw r4 = com.ss.android.downloadlib.addownload.l.g(r4)
                r4.k()
                com.ss.android.downloadlib.r.b r4 = com.ss.android.downloadlib.r.b.a()
                java.lang.String r0 = "pause_reserve_wifi_cancel_on_wifi"
                com.ss.android.xt.j.xt.b r1 = r3.c
                r4.w(r0, r1)
                return
            L6b:
                com.ss.android.downloadlib.addownload.i r0 = com.ss.android.downloadlib.addownload.i.b()
                com.ss.android.downloadlib.addownload.l r1 = r3.e
                com.ss.android.j.j.cw.b r1 = com.ss.android.downloadlib.addownload.l.O(r1)
                com.ss.android.downloadlib.addownload.l r2 = r3.e
                com.ss.android.socialbase.downloader.ae.cw r2 = com.ss.android.downloadlib.addownload.l.g(r2)
                r0.d(r1, r2)
                long r0 = java.lang.System.currentTimeMillis()
                r4.m0(r0)
                com.ss.android.downloadlib.addownload.l r4 = r3.e
                int r0 = r3.a
                int r1 = r3.d
                com.ss.android.socialbase.downloader.ae.cw r2 = com.ss.android.downloadlib.addownload.l.g(r4)
                com.ss.android.downloadlib.addownload.l.B(r4, r0, r1, r2)
                return
        }
    }

    class h implements v2.t {
        final /* synthetic */ boolean a;
        final /* synthetic */ com.ss.android.downloadlib.addownload.l b;

        h(com.ss.android.downloadlib.addownload.l r1, boolean r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void j() {
                r3 = this;
                java.lang.String r0 = com.ss.android.downloadlib.addownload.l.K()
                java.lang.String r1 = "pBCD start download"
                r2 = 0
                com.ss.android.downloadlib.a.k.d(r0, r1, r2)
                com.ss.android.downloadlib.addownload.l r0 = r3.b
                boolean r1 = r3.a
                com.ss.android.downloadlib.addownload.l.C(r0, r1)
                return
        }

        public void j(java.lang.String r3) {
                r2 = this;
                java.lang.String r3 = com.ss.android.downloadlib.addownload.l.K()
                java.lang.String r0 = "pBCD onDenied"
                r1 = 0
                com.ss.android.downloadlib.a.k.d(r3, r0, r1)
                return
        }
    }

    class i implements com.ss.android.downloadlib.addownload.l.k {
        final /* synthetic */ boolean a;
        final /* synthetic */ com.ss.android.downloadlib.addownload.l b;

        i(com.ss.android.downloadlib.addownload.l r1, boolean r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // com.ss.android.downloadlib.addownload.l.k
        public void j() {
                r2 = this;
                com.ss.android.downloadlib.addownload.l r0 = r2.b
                com.ss.android.downloadlib.addownload.j r0 = com.ss.android.downloadlib.addownload.l.G(r0)
                boolean r0 = r0.o()
                if (r0 == 0) goto Ld
                return
            Ld:
                com.ss.android.downloadlib.addownload.l r0 = r2.b
                boolean r1 = r2.a
                com.ss.android.downloadlib.addownload.l.W(r0, r1)
                return
        }
    }

    private class j extends com.bytedance.sdk.component.oq.r.xt<java.lang.String, java.lang.Void, com.ss.android.socialbase.downloader.ae.cw> {
        final /* synthetic */ com.ss.android.downloadlib.addownload.l a;

        private j(com.ss.android.downloadlib.addownload.l r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ j(com.ss.android.downloadlib.addownload.l r1, com.ss.android.downloadlib.addownload.l.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        protected com.ss.android.socialbase.downloader.ae.cw a(java.lang.String... r5) {
                r4 = this;
                r0 = 0
                if (r5 == 0) goto L9e
                int r1 = r5.length
                r2 = 0
                if (r1 <= 0) goto L11
                r1 = r5[r2]
                boolean r1 = android.text.TextUtils.isEmpty(r1)
                if (r1 == 0) goto L11
                goto L9e
            L11:
                int r1 = r5.length
                r3 = 3
                if (r1 < r3) goto L21
                r1 = 2
                r3 = r5[r1]
                boolean r3 = android.text.TextUtils.isEmpty(r3)
                if (r3 != 0) goto L21
                r1 = r5[r1]
                goto L23
            L21:
                java.lang.String r1 = ""
            L23:
                r5 = r5[r2]
                com.ss.android.downloadlib.addownload.l r2 = r4.a
                com.ss.android.j.j.cw.b r2 = com.ss.android.downloadlib.addownload.l.O(r2)
                if (r2 == 0) goto L7c
                com.ss.android.downloadlib.addownload.l r2 = r4.a
                com.ss.android.j.j.cw.b r2 = com.ss.android.downloadlib.addownload.l.O(r2)
                java.lang.String r2 = r2.az()
                boolean r2 = android.text.TextUtils.isEmpty(r2)
                if (r2 != 0) goto L7c
                boolean r0 = android.text.TextUtils.isEmpty(r1)
                if (r0 != 0) goto L66
                android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
                com.ss.android.socialbase.downloader.downloader.ae r0 = com.ss.android.socialbase.downloader.downloader.ae.xt(r0)
                com.ss.android.downloadlib.addownload.l r2 = r4.a
                com.ss.android.j.j.cw.b r2 = com.ss.android.downloadlib.addownload.l.O(r2)
                java.lang.String r2 = r2.az()
                int r0 = r0.j(r1, r2)
                android.content.Context r2 = com.ss.android.downloadlib.addownload.m.getContext()
                com.ss.android.socialbase.downloader.downloader.ae r2 = com.ss.android.socialbase.downloader.downloader.ae.xt(r2)
                com.ss.android.socialbase.downloader.ae.cw r0 = r2.tl(r0)
                goto L7c
            L66:
                android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
                com.ss.android.socialbase.downloader.downloader.ae r0 = com.ss.android.socialbase.downloader.downloader.ae.xt(r0)
                com.ss.android.downloadlib.addownload.l r2 = r4.a
                com.ss.android.j.j.cw.b r2 = com.ss.android.downloadlib.addownload.l.O(r2)
                java.lang.String r2 = r2.az()
                com.ss.android.socialbase.downloader.ae.cw r0 = r0.xt(r5, r2)
            L7c:
                if (r0 != 0) goto L9e
                boolean r0 = android.text.TextUtils.isEmpty(r1)
                if (r0 != 0) goto L91
                com.ss.android.socialbase.appdownloader.f r5 = com.ss.android.socialbase.appdownloader.f.L()
                android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
                com.ss.android.socialbase.downloader.ae.cw r5 = r5.j(r0, r1)
                return r5
            L91:
                com.ss.android.socialbase.appdownloader.f r0 = com.ss.android.socialbase.appdownloader.f.L()
                android.content.Context r1 = com.ss.android.downloadlib.addownload.m.getContext()
                com.ss.android.socialbase.downloader.ae.cw r5 = r0.j(r1, r5)
                return r5
            L9e:
                return r0
        }

        protected void b(com.ss.android.socialbase.downloader.ae.cw r6) {
                r5 = this;
                super/*android.os.AsyncTask*/.onPostExecute(r6)
                boolean r0 = r5.isCancelled()
                if (r0 != 0) goto L1fb
                com.ss.android.downloadlib.addownload.l r0 = r5.a
                com.ss.android.j.j.cw.b r0 = com.ss.android.downloadlib.addownload.l.O(r0)
                if (r0 != 0) goto L13
                goto L1fb
            L13:
                com.ss.android.downloadlib.addownload.l r0 = r5.a     // Catch: java.lang.Exception -> L71
                com.ss.android.j.j.cw.b r0 = com.ss.android.downloadlib.addownload.l.O(r0)     // Catch: java.lang.Exception -> L71
                java.lang.String r0 = r0.s()     // Catch: java.lang.Exception -> L71
                com.ss.android.downloadlib.addownload.l r1 = r5.a     // Catch: java.lang.Exception -> L71
                com.ss.android.j.j.cw.b r1 = com.ss.android.downloadlib.addownload.l.O(r1)     // Catch: java.lang.Exception -> L71
                int r1 = r1.f()     // Catch: java.lang.Exception -> L71
                com.ss.android.downloadlib.addownload.l r2 = r5.a     // Catch: java.lang.Exception -> L71
                com.ss.android.j.j.cw.b r2 = com.ss.android.downloadlib.addownload.l.O(r2)     // Catch: java.lang.Exception -> L71
                java.lang.String r2 = r2.v()     // Catch: java.lang.Exception -> L71
                com.ss.android.downloadlib.addownload.o$c r0 = com.ss.android.downloadlib.a.h.m(r0, r1, r2)     // Catch: java.lang.Exception -> L71
                com.ss.android.downloadlib.addownload.o$h r1 = com.ss.android.downloadlib.addownload.o.h.a()     // Catch: java.lang.Exception -> L71
                com.ss.android.downloadlib.addownload.l r2 = r5.a     // Catch: java.lang.Exception -> L71
                com.ss.android.j.j.cw.b r2 = com.ss.android.downloadlib.addownload.l.O(r2)     // Catch: java.lang.Exception -> L71
                int r2 = r2.f()     // Catch: java.lang.Exception -> L71
                int r3 = r0.c()     // Catch: java.lang.Exception -> L71
                com.ss.android.downloadlib.addownload.o$f r4 = com.ss.android.downloadlib.addownload.o.f.c()     // Catch: java.lang.Exception -> L71
                com.ss.android.xt.j.xt.b r4 = r4.f(r6)     // Catch: java.lang.Exception -> L71
                r1.b(r2, r3, r4)     // Catch: java.lang.Exception -> L71
                boolean r0 = r0.b()     // Catch: java.lang.Exception -> L71
                r1 = 0
                r2 = 0
                if (r6 == 0) goto L103
                int r3 = r6.ae()     // Catch: java.lang.Exception -> L71
                if (r3 == 0) goto L103
                if (r0 != 0) goto L74
                android.content.Context r3 = com.ss.android.downloadlib.addownload.m.getContext()     // Catch: java.lang.Exception -> L71
                com.ss.android.socialbase.downloader.downloader.ae r3 = com.ss.android.socialbase.downloader.downloader.ae.xt(r3)     // Catch: java.lang.Exception -> L71
                boolean r3 = r3.j(r6)     // Catch: java.lang.Exception -> L71
                if (r3 != 0) goto L103
                goto L74
            L71:
                r6 = move-exception
                goto L1f8
            L74:
                android.content.Context r3 = com.ss.android.downloadlib.addownload.m.getContext()     // Catch: java.lang.Exception -> L71
                com.ss.android.socialbase.downloader.downloader.ae r3 = com.ss.android.socialbase.downloader.downloader.ae.xt(r3)     // Catch: java.lang.Exception -> L71
                int r4 = r6.ae()     // Catch: java.lang.Exception -> L71
                r3.qv(r4)     // Catch: java.lang.Exception -> L71
                com.ss.android.downloadlib.addownload.l r3 = r5.a     // Catch: java.lang.Exception -> L71
                com.ss.android.socialbase.downloader.ae.cw r3 = com.ss.android.downloadlib.addownload.l.g(r3)     // Catch: java.lang.Exception -> L71
                if (r3 == 0) goto L9e
                com.ss.android.downloadlib.addownload.l r3 = r5.a     // Catch: java.lang.Exception -> L71
                com.ss.android.socialbase.downloader.ae.cw r3 = com.ss.android.downloadlib.addownload.l.g(r3)     // Catch: java.lang.Exception -> L71
                int r3 = r3.i()     // Catch: java.lang.Exception -> L71
                r4 = -4
                if (r3 != r4) goto L9e
                com.ss.android.downloadlib.addownload.l r6 = r5.a     // Catch: java.lang.Exception -> L71
                com.ss.android.downloadlib.addownload.l.z(r6, r2)     // Catch: java.lang.Exception -> L71
                goto Le2
            L9e:
                com.ss.android.downloadlib.addownload.l r2 = r5.a     // Catch: java.lang.Exception -> L71
                com.ss.android.downloadlib.addownload.l.z(r2, r6)     // Catch: java.lang.Exception -> L71
                com.ss.android.downloadlib.addownload.l r6 = r5.a     // Catch: java.lang.Exception -> L71
                boolean r6 = com.ss.android.downloadlib.addownload.l.r(r6)     // Catch: java.lang.Exception -> L71
                if (r6 == 0) goto Lc7
                android.content.Context r6 = com.ss.android.downloadlib.addownload.m.getContext()     // Catch: java.lang.Exception -> L71
                com.ss.android.socialbase.downloader.downloader.ae r6 = com.ss.android.socialbase.downloader.downloader.ae.xt(r6)     // Catch: java.lang.Exception -> L71
                com.ss.android.downloadlib.addownload.l r2 = r5.a     // Catch: java.lang.Exception -> L71
                com.ss.android.socialbase.downloader.ae.cw r2 = com.ss.android.downloadlib.addownload.l.g(r2)     // Catch: java.lang.Exception -> L71
                int r2 = r2.ae()     // Catch: java.lang.Exception -> L71
                com.ss.android.downloadlib.addownload.l r3 = r5.a     // Catch: java.lang.Exception -> L71
                com.ss.android.socialbase.downloader.r.a r3 = com.ss.android.downloadlib.addownload.l.J(r3)     // Catch: java.lang.Exception -> L71
                r6.j(r2, r3, r1)     // Catch: java.lang.Exception -> L71
                goto Le2
            Lc7:
                android.content.Context r6 = com.ss.android.downloadlib.addownload.m.getContext()     // Catch: java.lang.Exception -> L71
                com.ss.android.socialbase.downloader.downloader.ae r6 = com.ss.android.socialbase.downloader.downloader.ae.xt(r6)     // Catch: java.lang.Exception -> L71
                com.ss.android.downloadlib.addownload.l r1 = r5.a     // Catch: java.lang.Exception -> L71
                com.ss.android.socialbase.downloader.ae.cw r1 = com.ss.android.downloadlib.addownload.l.g(r1)     // Catch: java.lang.Exception -> L71
                int r1 = r1.ae()     // Catch: java.lang.Exception -> L71
                com.ss.android.downloadlib.addownload.l r2 = r5.a     // Catch: java.lang.Exception -> L71
                com.ss.android.socialbase.downloader.r.a r2 = com.ss.android.downloadlib.addownload.l.J(r2)     // Catch: java.lang.Exception -> L71
                r6.j(r1, r2)     // Catch: java.lang.Exception -> L71
            Le2:
                com.ss.android.downloadlib.addownload.l r6 = r5.a     // Catch: java.lang.Exception -> L71
                com.ss.android.downloadlib.addownload.k r6 = com.ss.android.downloadlib.addownload.l.V(r6)     // Catch: java.lang.Exception -> L71
                com.ss.android.downloadlib.addownload.l r1 = r5.a     // Catch: java.lang.Exception -> L71
                com.ss.android.socialbase.downloader.ae.cw r1 = com.ss.android.downloadlib.addownload.l.g(r1)     // Catch: java.lang.Exception -> L71
                com.ss.android.downloadlib.addownload.l r2 = r5.a     // Catch: java.lang.Exception -> L71
                com.ss.android.j.j.up.e r2 = com.ss.android.downloadlib.addownload.l.Q(r2)     // Catch: java.lang.Exception -> L71
                com.ss.android.downloadlib.addownload.l r3 = r5.a     // Catch: java.lang.Exception -> L71
                java.util.Map r3 = com.ss.android.downloadlib.addownload.l.M(r3)     // Catch: java.lang.Exception -> L71
                java.util.List r3 = com.ss.android.downloadlib.addownload.k.g(r3)     // Catch: java.lang.Exception -> L71
                r6.m(r1, r2, r3, r0)     // Catch: java.lang.Exception -> L71
                goto L1e8
            L103:
                if (r6 == 0) goto L123
                android.content.Context r3 = com.ss.android.downloadlib.addownload.m.getContext()     // Catch: java.lang.Exception -> L71
                com.ss.android.socialbase.downloader.downloader.ae r3 = com.ss.android.socialbase.downloader.downloader.ae.xt(r3)     // Catch: java.lang.Exception -> L71
                boolean r3 = r3.j(r6)     // Catch: java.lang.Exception -> L71
                if (r3 == 0) goto L123
                com.ss.android.socialbase.downloader.notification.xt r3 = com.ss.android.socialbase.downloader.notification.xt.j()     // Catch: java.lang.Exception -> L71
                int r6 = r6.ae()     // Catch: java.lang.Exception -> L71
                r3.m(r6)     // Catch: java.lang.Exception -> L71
                com.ss.android.downloadlib.addownload.l r6 = r5.a     // Catch: java.lang.Exception -> L71
                com.ss.android.downloadlib.addownload.l.z(r6, r2)     // Catch: java.lang.Exception -> L71
            L123:
                com.ss.android.downloadlib.addownload.l r6 = r5.a     // Catch: java.lang.Exception -> L71
                com.ss.android.socialbase.downloader.ae.cw r6 = com.ss.android.downloadlib.addownload.l.g(r6)     // Catch: java.lang.Exception -> L71
                if (r6 == 0) goto L183
                android.content.Context r6 = com.ss.android.downloadlib.addownload.m.getContext()     // Catch: java.lang.Exception -> L71
                com.ss.android.socialbase.downloader.downloader.ae r6 = com.ss.android.socialbase.downloader.downloader.ae.xt(r6)     // Catch: java.lang.Exception -> L71
                com.ss.android.downloadlib.addownload.l r3 = r5.a     // Catch: java.lang.Exception -> L71
                com.ss.android.socialbase.downloader.ae.cw r3 = com.ss.android.downloadlib.addownload.l.g(r3)     // Catch: java.lang.Exception -> L71
                int r3 = r3.ae()     // Catch: java.lang.Exception -> L71
                r6.qv(r3)     // Catch: java.lang.Exception -> L71
                com.ss.android.downloadlib.addownload.l r6 = r5.a     // Catch: java.lang.Exception -> L71
                boolean r6 = com.ss.android.downloadlib.addownload.l.r(r6)     // Catch: java.lang.Exception -> L71
                if (r6 == 0) goto L166
                com.ss.android.downloadlib.addownload.l r6 = r5.a     // Catch: java.lang.Exception -> L71
                android.content.Context r6 = com.ss.android.downloadlib.addownload.l.t(r6)     // Catch: java.lang.Exception -> L71
                com.ss.android.socialbase.downloader.downloader.ae r6 = com.ss.android.socialbase.downloader.downloader.ae.xt(r6)     // Catch: java.lang.Exception -> L71
                com.ss.android.downloadlib.addownload.l r3 = r5.a     // Catch: java.lang.Exception -> L71
                com.ss.android.socialbase.downloader.ae.cw r3 = com.ss.android.downloadlib.addownload.l.g(r3)     // Catch: java.lang.Exception -> L71
                int r3 = r3.ae()     // Catch: java.lang.Exception -> L71
                com.ss.android.downloadlib.addownload.l r4 = r5.a     // Catch: java.lang.Exception -> L71
                com.ss.android.socialbase.downloader.r.a r4 = com.ss.android.downloadlib.addownload.l.J(r4)     // Catch: java.lang.Exception -> L71
                r6.j(r3, r4, r1)     // Catch: java.lang.Exception -> L71
                goto L183
            L166:
                com.ss.android.downloadlib.addownload.l r6 = r5.a     // Catch: java.lang.Exception -> L71
                android.content.Context r6 = com.ss.android.downloadlib.addownload.l.t(r6)     // Catch: java.lang.Exception -> L71
                com.ss.android.socialbase.downloader.downloader.ae r6 = com.ss.android.socialbase.downloader.downloader.ae.xt(r6)     // Catch: java.lang.Exception -> L71
                com.ss.android.downloadlib.addownload.l r1 = r5.a     // Catch: java.lang.Exception -> L71
                com.ss.android.socialbase.downloader.ae.cw r1 = com.ss.android.downloadlib.addownload.l.g(r1)     // Catch: java.lang.Exception -> L71
                int r1 = r1.ae()     // Catch: java.lang.Exception -> L71
                com.ss.android.downloadlib.addownload.l r3 = r5.a     // Catch: java.lang.Exception -> L71
                com.ss.android.socialbase.downloader.r.a r3 = com.ss.android.downloadlib.addownload.l.J(r3)     // Catch: java.lang.Exception -> L71
                r6.j(r1, r3)     // Catch: java.lang.Exception -> L71
            L183:
                if (r0 == 0) goto L1c5
                com.ss.android.downloadlib.addownload.l r6 = r5.a     // Catch: java.lang.Exception -> L71
                com.ss.android.socialbase.downloader.ae.cw$j r1 = new com.ss.android.socialbase.downloader.ae.cw$j     // Catch: java.lang.Exception -> L71
                com.ss.android.j.j.cw.b r2 = com.ss.android.downloadlib.addownload.l.O(r6)     // Catch: java.lang.Exception -> L71
                java.lang.String r2 = r2.j()     // Catch: java.lang.Exception -> L71
                r1.<init>(r2)     // Catch: java.lang.Exception -> L71
                com.ss.android.socialbase.downloader.ae.cw r1 = r1.j()     // Catch: java.lang.Exception -> L71
                com.ss.android.downloadlib.addownload.l.z(r6, r1)     // Catch: java.lang.Exception -> L71
                com.ss.android.downloadlib.addownload.l r6 = r5.a     // Catch: java.lang.Exception -> L71
                com.ss.android.socialbase.downloader.ae.cw r6 = com.ss.android.downloadlib.addownload.l.g(r6)     // Catch: java.lang.Exception -> L71
                r1 = -3
                r6.r(r1)     // Catch: java.lang.Exception -> L71
                com.ss.android.downloadlib.addownload.l r6 = r5.a     // Catch: java.lang.Exception -> L71
                com.ss.android.downloadlib.addownload.k r6 = com.ss.android.downloadlib.addownload.l.V(r6)     // Catch: java.lang.Exception -> L71
                com.ss.android.downloadlib.addownload.l r1 = r5.a     // Catch: java.lang.Exception -> L71
                com.ss.android.socialbase.downloader.ae.cw r1 = com.ss.android.downloadlib.addownload.l.g(r1)     // Catch: java.lang.Exception -> L71
                com.ss.android.downloadlib.addownload.l r2 = r5.a     // Catch: java.lang.Exception -> L71
                com.ss.android.j.j.up.e r2 = com.ss.android.downloadlib.addownload.l.Q(r2)     // Catch: java.lang.Exception -> L71
                com.ss.android.downloadlib.addownload.l r3 = r5.a     // Catch: java.lang.Exception -> L71
                java.util.Map r3 = com.ss.android.downloadlib.addownload.l.M(r3)     // Catch: java.lang.Exception -> L71
                java.util.List r3 = com.ss.android.downloadlib.addownload.k.g(r3)     // Catch: java.lang.Exception -> L71
                r6.m(r1, r2, r3, r0)     // Catch: java.lang.Exception -> L71
                goto L1e8
            L1c5:
                com.ss.android.downloadlib.addownload.l r6 = r5.a     // Catch: java.lang.Exception -> L71
                java.util.Map r6 = com.ss.android.downloadlib.addownload.l.M(r6)     // Catch: java.lang.Exception -> L71
                java.util.List r6 = com.ss.android.downloadlib.addownload.k.g(r6)     // Catch: java.lang.Exception -> L71
                java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Exception -> L71
            L1d3:
                boolean r0 = r6.hasNext()     // Catch: java.lang.Exception -> L71
                if (r0 == 0) goto L1e3
                java.lang.Object r0 = r6.next()     // Catch: java.lang.Exception -> L71
                com.ss.android.j.j.cw.e r0 = (com.ss.android.j.j.cw.e) r0     // Catch: java.lang.Exception -> L71
                r0.j()     // Catch: java.lang.Exception -> L71
                goto L1d3
            L1e3:
                com.ss.android.downloadlib.addownload.l r6 = r5.a     // Catch: java.lang.Exception -> L71
                com.ss.android.downloadlib.addownload.l.z(r6, r2)     // Catch: java.lang.Exception -> L71
            L1e8:
                com.ss.android.downloadlib.addownload.l r6 = r5.a     // Catch: java.lang.Exception -> L71
                com.ss.android.downloadlib.addownload.k r6 = com.ss.android.downloadlib.addownload.l.V(r6)     // Catch: java.lang.Exception -> L71
                com.ss.android.downloadlib.addownload.l r0 = r5.a     // Catch: java.lang.Exception -> L71
                com.ss.android.socialbase.downloader.ae.cw r0 = com.ss.android.downloadlib.addownload.l.g(r0)     // Catch: java.lang.Exception -> L71
                r6.a(r0)     // Catch: java.lang.Exception -> L71
                return
            L1f8:
                com.bytedance.sdk.component.utils.vl.j(r6)
            L1fb:
                return
        }

        protected /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] r1) {
                r0 = this;
                java.lang.String[] r1 = (java.lang.String[]) r1
                com.ss.android.socialbase.downloader.ae.cw r1 = r0.a(r1)
                return r1
        }

        protected /* synthetic */ void onPostExecute(java.lang.Object r1) {
                r0 = this;
                com.ss.android.socialbase.downloader.ae.cw r1 = (com.ss.android.socialbase.downloader.ae.cw) r1
                r0.b(r1)
                return
        }
    }

    interface k {
        void j();
    }

    /* renamed from: com.ss.android.downloadlib.addownload.l$l, reason: collision with other inner class name */
    interface InterfaceC0206l {
        void j(long r1);
    }

    static {
            return
    }

    public l() {
            r3 = this;
            r3.<init>()
            com.ss.android.downloadlib.a$p r0 = new com.ss.android.downloadlib.a$p
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1, r3)
            r3.a = r0
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r3.e = r1
            com.ss.android.downloadlib.addownload.k$d r1 = new com.ss.android.downloadlib.addownload.k$d
            r1.<init>(r0)
            r3.i = r1
            r1 = -1
            r3.m = r1
            r1 = 0
            r3.n = r1
            r3.o = r1
            r3.p = r1
            com.ss.android.downloadlib.addownload.k r1 = new com.ss.android.downloadlib.addownload.k
            r1.<init>(r3)
            r3.b = r1
            com.ss.android.downloadlib.addownload.j r1 = new com.ss.android.downloadlib.addownload.j
            r1.<init>(r0)
            r3.c = r1
            com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.cw()
            java.lang.String r1 = "ttdownloader_callback_twice"
            boolean r0 = r0.j(r1)
            r3.s = r0
            return
    }

    private void A(int r2, int r3, @androidx.annotation.NonNull com.ss.android.socialbase.downloader.ae.cw r4) {
            r1 = this;
            com.ss.android.socialbase.downloader.jy.j r4 = com.ss.android.socialbase.downloader.jy.j.cw()
            java.lang.String r0 = "fix_click_start"
            boolean r4 = r4.j(r0)
            if (r4 == 0) goto L2a
            r4 = -3
            if (r3 == r4) goto L1e
            com.ss.android.socialbase.downloader.downloader.r r4 = com.ss.android.socialbase.downloader.downloader.r.j()
            boolean r4 = r4.up(r2)
            if (r4 != 0) goto L1e
            r2 = 0
            r1.E(r2, r2)
            return
        L1e:
            com.ss.android.socialbase.appdownloader.f r4 = com.ss.android.socialbase.appdownloader.f.L()
            android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
            r4.r(r0, r2, r3)
            return
        L2a:
            com.ss.android.socialbase.appdownloader.f r4 = com.ss.android.socialbase.appdownloader.f.L()
            android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
            r4.r(r0, r2, r3)
            return
    }

    static /* synthetic */ void B(com.ss.android.downloadlib.addownload.l r0, int r1, int r2, com.ss.android.socialbase.downloader.ae.cw r3) {
            r0.A(r1, r2, r3)
            return
    }

    static /* synthetic */ void C(com.ss.android.downloadlib.addownload.l r0, boolean r1) {
            r0.i(r1)
            return
    }

    private void D(com.ss.android.socialbase.downloader.ae.cw r3) {
            r2 = this;
            android.os.Message r0 = android.os.Message.obtain()
            r1 = 3
            r0.what = r1
            r0.obj = r3
            com.ss.android.downloadlib.a$p r3 = r2.a
            r3.sendMessage(r0)
            return
    }

    @androidx.annotation.NonNull
    private com.ss.android.j.j.cw.c F() {
            r1 = this;
            com.ss.android.j.j.cw.c r0 = r1.p
            if (r0 != 0) goto Lb
            com.ss.android.j.j.cw.d r0 = new com.ss.android.j.j.cw.d
            r0.<init>()
            r1.p = r0
        Lb:
            com.ss.android.j.j.cw.c r0 = r1.p
            return r0
    }

    static /* synthetic */ com.ss.android.downloadlib.addownload.j G(com.ss.android.downloadlib.addownload.l r0) {
            com.ss.android.downloadlib.addownload.j r0 = r0.c
            return r0
    }

    private void I(boolean r16) {
            r15 = this;
            r3 = r16
            java.lang.String r0 = com.ss.android.downloadlib.addownload.l.u
            java.lang.String r2 = "pBCD"
            r4 = 0
            com.ss.android.downloadlib.a.k.d(r0, r2, r4)
            boolean r2 = r15.l()
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L70
            com.ss.android.downloadlib.addownload.o$f r0 = com.ss.android.downloadlib.addownload.o.f.c()
            long r7 = r15.m
            com.ss.android.downloadlib.addownload.o$i r0 = r0.r(r7)
            boolean r2 = r15.r
            if (r2 == 0) goto L3e
            boolean r2 = r15.q()
            if (r2 == 0) goto L3a
            boolean r2 = r15.N(r5)
            if (r2 == 0) goto L184
            com.ss.android.j.j.cw.c r0 = r0.d
            if (r0 == 0) goto L184
            boolean r0 = r0.jy()
            if (r0 == 0) goto L184
            r15.E(r3, r6)
            return
        L3a:
            r15.E(r3, r6)
            return
        L3e:
            com.ss.android.j.j.cw.b r2 = r15.n
            boolean r2 = r2.x()
            if (r2 == 0) goto L6c
            com.ss.android.j.j.cw.c r2 = r0.d
            if (r2 == 0) goto L6c
            boolean r2 = r2.vl()
            if (r2 == 0) goto L6c
            com.ss.android.j.j.cw.b r2 = r0.b
            if (r2 == 0) goto L6c
            com.ss.android.downloadlib.addownload.compliance.f r2 = com.ss.android.downloadlib.addownload.compliance.f.a()
            com.ss.android.j.j.cw.b r4 = r0.b
            boolean r2 = r2.g(r4)
            if (r2 == 0) goto L6c
            com.ss.android.downloadlib.addownload.compliance.f r2 = com.ss.android.downloadlib.addownload.compliance.f.a()
            boolean r0 = r2.f(r0)
            if (r0 == 0) goto L6c
            goto L184
        L6c:
            r15.E(r3, r6)
            return
        L70:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r7 = "pBCD continue download, status:"
            r2.<init>(r7)
            com.ss.android.socialbase.downloader.ae.cw r7 = r15.g
            int r7 = r7.i()
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            com.ss.android.downloadlib.a.k.d(r0, r2, r4)
            com.ss.android.socialbase.downloader.ae.cw r0 = r15.g
            if (r0 == 0) goto L96
            com.ss.android.j.j.cw.b r2 = r15.n
            if (r2 == 0) goto L96
            boolean r2 = r2.jy()
            r0.r(r2)
        L96:
            com.ss.android.socialbase.downloader.ae.cw r0 = r15.g
            int r0 = r0.i()
            com.ss.android.socialbase.downloader.ae.cw r2 = r15.g
            int r2 = r2.ae()
            com.ss.android.downloadlib.addownload.o$f r4 = com.ss.android.downloadlib.addownload.o.f.c()
            com.ss.android.socialbase.downloader.ae.cw r7 = r15.g
            com.ss.android.xt.j.xt.b r4 = r4.f(r7)
            r14 = -2
            if (r0 == r14) goto L119
            r7 = -1
            if (r0 != r7) goto Lb3
            goto L119
        Lb3:
            boolean r7 = com.ss.android.downloadlib.addownload.b.d(r0)
            if (r7 == 0) goto L10c
            com.ss.android.j.j.cw.b r7 = r15.n
            boolean r7 = r7.b()
            if (r7 != 0) goto Lc3
            goto L184
        Lc3:
            com.ss.android.downloadlib.addownload.j r7 = r15.c
            r7.n(r6)
            com.ss.android.downloadlib.b$i r7 = com.ss.android.downloadlib.b.i.c()
            com.ss.android.downloadlib.addownload.o$f r8 = com.ss.android.downloadlib.addownload.o.f.c()
            long r9 = r15.m
            com.ss.android.xt.j.xt.b r8 = r8.q(r9)
            r7.l(r8)
            com.ss.android.socialbase.downloader.jy.j r7 = com.ss.android.downloadlib.a.n.k(r4)
            java.lang.String r8 = "cancel_pause_optimise_switch"
            int r5 = r7.j(r8, r5)
            if (r5 != r6) goto Lf9
            com.ss.android.downloadlib.addownload.l$e r6 = new com.ss.android.downloadlib.addownload.l$e
            r6.<init>(r15)
            com.ss.android.downloadlib.addownload.j$n r7 = com.ss.android.downloadlib.addownload.j.n.a()
            r5 = r0
            com.ss.android.downloadlib.addownload.l$f r0 = new com.ss.android.downloadlib.addownload.l$f
            r1 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            r7.b(r4, r5, r0, r6)
            return
        Lf9:
            r5 = r0
            com.ss.android.downloadlib.addownload.j$m r6 = com.ss.android.downloadlib.addownload.j.m.a()
            com.ss.android.downloadlib.addownload.l$g r0 = new com.ss.android.downloadlib.addownload.l$g
            r1 = r15
            r3 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            r2 = r0
            r0 = r5
            r6.b(r4, r0, r2)
            return
        L10c:
            com.ss.android.downloadlib.addownload.k r4 = r15.b
            com.ss.android.socialbase.downloader.ae.cw r5 = r15.g
            r4.n(r5, r3)
            com.ss.android.socialbase.downloader.ae.cw r3 = r15.g
            r15.A(r2, r0, r3)
            return
        L119:
            com.ss.android.downloadlib.addownload.k r7 = r15.b
            com.ss.android.socialbase.downloader.ae.cw r8 = r15.g
            r7.n(r8, r3)
            if (r4 == 0) goto L132
            long r7 = java.lang.System.currentTimeMillis()
            r4.C0(r7)
            com.ss.android.socialbase.downloader.ae.cw r3 = r15.g
            long r7 = r3.uq()
            r4.z(r7)
        L132:
            com.ss.android.socialbase.downloader.ae.cw r3 = r15.g
            r3.up(r5)
            com.ss.android.downloadlib.addownload.j r3 = r15.c
            com.ss.android.downloadlib.addownload.o$i r7 = new com.ss.android.downloadlib.addownload.o$i
            long r8 = r15.m
            com.ss.android.j.j.cw.b r10 = r15.n
            com.ss.android.j.j.cw.g r11 = r15.T()
            com.ss.android.j.j.cw.c r12 = r15.F()
            r7.<init>(r8, r10, r11, r12)
            r3.j(r7)
            com.ss.android.downloadlib.addownload.j r7 = r15.c
            com.ss.android.socialbase.downloader.ae.cw r3 = r15.g
            long r9 = r3.uq()
            com.ss.android.socialbase.downloader.ae.cw r3 = r15.g
            long r11 = r3.ka()
            com.ss.android.downloadlib.addownload.l$c r13 = new com.ss.android.downloadlib.addownload.l$c
            r13.<init>(r15, r2, r0)
            r8 = r2
            r7.g(r8, r9, r11, r13)
            if (r0 != r14) goto L184
            com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.downloadlib.a.n.k(r4)
            java.lang.String r2 = "show_pause_continue_toast"
            int r0 = r0.j(r2, r5)
            if (r0 != r6) goto L184
            com.ss.android.downloadlib.c r0 = com.ss.android.downloadlib.c.d()
            android.os.Handler r0 = r0.s()
            com.ss.android.downloadlib.addownload.l$d r2 = new com.ss.android.downloadlib.addownload.l$d
            r2.<init>(r15)
            r3 = 500(0x1f4, double:2.47E-321)
            r0.postDelayed(r2, r3)
        L184:
            return
    }

    static /* synthetic */ com.ss.android.socialbase.downloader.r.a J(com.ss.android.downloadlib.addownload.l r0) {
            com.ss.android.socialbase.downloader.r.a r0 = r0.i
            return r0
    }

    static /* synthetic */ java.lang.String K() {
            java.lang.String r0 = com.ss.android.downloadlib.addownload.l.u
            return r0
    }

    private void L() {
            r4 = this;
            java.lang.ref.SoftReference<v2.d> r0 = r4.q
            if (r0 == 0) goto L23
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L23
            java.lang.ref.SoftReference<v2.d> r0 = r4.q
            java.lang.Object r0 = r0.get()
            v2.d r0 = (v2.d) r0
            com.ss.android.j.j.cw.b r1 = r4.n
            com.ss.android.j.j.cw.g r2 = r4.T()
            com.ss.android.j.j.cw.c r3 = r4.F()
            r0.onItemClick(r1, r2, r3)
            r0 = 0
            r4.q = r0
            return
        L23:
            com.ss.android.downloadlib.addownload.m.K()
            r4.getContext()
            r4.F()
            return
    }

    static /* synthetic */ java.util.Map M(com.ss.android.downloadlib.addownload.l r0) {
            java.util.Map<java.lang.Integer, java.lang.Object> r0 = r0.e
            return r0
    }

    static /* synthetic */ com.ss.android.j.j.cw.b O(com.ss.android.downloadlib.addownload.l r0) {
            com.ss.android.j.j.cw.b r0 = r0.n
            return r0
    }

    private void P(boolean r9) {
            r8 = this;
            java.util.Map<java.lang.Integer, java.lang.Object> r0 = r8.e
            java.util.List r0 = com.ss.android.downloadlib.addownload.k.g(r0)
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            com.ss.android.j.j.cw.e r1 = (com.ss.android.j.j.cw.e) r1
            com.ss.android.j.j.cw.b r2 = r8.n
            com.ss.android.j.j.cw.c r3 = r8.F()
            r1.onDownloadStart(r2, r3)
            goto La
        L20:
            com.ss.android.downloadlib.addownload.k r0 = r8.b
            android.content.Context r1 = com.ss.android.downloadlib.addownload.m.getContext()
            com.ss.android.socialbase.downloader.r.a r2 = r8.i
            int r0 = r0.c(r1, r2)
            java.lang.String r1 = com.ss.android.downloadlib.addownload.l.u
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "beginDown id:"
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            r3 = 0
            com.ss.android.downloadlib.a.k.d(r1, r2, r3)
            if (r0 == 0) goto L64
            com.ss.android.socialbase.downloader.ae.cw r2 = r8.g
            if (r2 == 0) goto L5c
            com.ss.android.socialbase.downloader.jy.j r2 = com.ss.android.socialbase.downloader.jy.j.cw()
            java.lang.String r4 = "fix_click_start"
            boolean r2 = r2.j(r4)
            if (r2 == 0) goto L53
            goto L5c
        L53:
            com.ss.android.downloadlib.addownload.k r9 = r8.b
            com.ss.android.socialbase.downloader.ae.cw r2 = r8.g
            r4 = 0
            r9.n(r2, r4)
            goto L94
        L5c:
            if (r9 == 0) goto L94
            com.ss.android.downloadlib.addownload.k r9 = r8.b
            r9.h()
            goto L94
        L64:
            com.ss.android.socialbase.downloader.ae.cw$j r9 = new com.ss.android.socialbase.downloader.ae.cw$j
            com.ss.android.j.j.cw.b r2 = r8.n
            java.lang.String r2 = r2.j()
            r9.<init>(r2)
            com.ss.android.socialbase.downloader.ae.cw r9 = r9.j()
            r2 = -1
            r9.r(r2)
            r8.D(r9)
            com.ss.android.downloadlib.r.b r9 = com.ss.android.downloadlib.r.b.a()
            long r4 = r8.m
            com.ss.android.socialbase.downloader.up.j r2 = new com.ss.android.socialbase.downloader.up.j
            r6 = 2
            java.lang.String r7 = "start download failed, id=0"
            r2.<init>(r6, r7)
            r9.e(r4, r2)
            com.ss.android.downloadlib.up.a r9 = com.ss.android.downloadlib.up.a.a()
            java.lang.String r2 = "beginDown"
            r9.f(r2)
        L94:
            com.ss.android.downloadlib.addownload.k r9 = r8.b
            boolean r2 = r8.o()
            boolean r9 = r9.s(r2)
            if (r9 == 0) goto Lb4
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r2 = "beginDown IC id:"
            r9.<init>(r2)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            com.ss.android.downloadlib.a.k.d(r1, r9, r3)
            r8.L()
        Lb4:
            return
    }

    static /* synthetic */ com.ss.android.j.j.up.e Q(com.ss.android.downloadlib.addownload.l r0) {
            com.ss.android.j.j.up.e r0 = r0.s()
            return r0
    }

    private void R(boolean r3) {
            r2 = this;
            com.ss.android.j.j.cw.b r0 = r2.n
            com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.downloadlib.a.n.x(r0)
            java.lang.String r1 = "notification_opt_2"
            int r0 = r0.xt(r1)
            r1 = 1
            if (r0 != r1) goto L20
            com.ss.android.socialbase.downloader.ae.cw r0 = r2.g
            if (r0 == 0) goto L20
            com.ss.android.socialbase.downloader.notification.xt r0 = com.ss.android.socialbase.downloader.notification.xt.j()
            com.ss.android.socialbase.downloader.ae.cw r1 = r2.g
            int r1 = r1.ae()
            r0.m(r1)
        L20:
            r2.I(r3)
            return
    }

    @androidx.annotation.NonNull
    private com.ss.android.j.j.cw.g T() {
            r1 = this;
            com.ss.android.j.j.cw.g r0 = r1.o
            if (r0 != 0) goto Ld
            com.ss.android.j.j.cw.a$b r0 = new com.ss.android.j.j.cw.a$b
            r0.<init>()
            com.ss.android.j.j.cw.a r0 = r0.g()
        Ld:
            return r0
    }

    private void U() {
            r4 = this;
            java.lang.String r0 = com.ss.android.downloadlib.addownload.l.u
            java.lang.String r1 = "pICD"
            r2 = 0
            com.ss.android.downloadlib.a.k.d(r0, r1, r2)
            com.ss.android.downloadlib.addownload.k r1 = r4.b
            com.ss.android.socialbase.downloader.ae.cw r3 = r4.g
            boolean r1 = r1.w(r3)
            if (r1 == 0) goto L1c
            java.lang.String r1 = "pICD BC"
            com.ss.android.downloadlib.a.k.d(r0, r1, r2)
            r0 = 0
            r4.I(r0)
            return
        L1c:
            java.lang.String r1 = "pICD IC"
            com.ss.android.downloadlib.a.k.d(r0, r1, r2)
            r4.L()
            return
    }

    static /* synthetic */ com.ss.android.downloadlib.addownload.k V(com.ss.android.downloadlib.addownload.l r0) {
            com.ss.android.downloadlib.addownload.k r0 = r0.b
            return r0
    }

    static /* synthetic */ void W(com.ss.android.downloadlib.addownload.l r0, boolean r1) {
            r0.P(r1)
            return
    }

    static /* synthetic */ com.ss.android.socialbase.downloader.ae.cw g(com.ss.android.downloadlib.addownload.l r0) {
            com.ss.android.socialbase.downloader.ae.cw r0 = r0.g
            return r0
    }

    private android.content.Context getContext() {
            r1 = this;
            java.lang.ref.WeakReference<android.content.Context> r0 = r1.d
            if (r0 == 0) goto L13
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L13
            java.lang.ref.WeakReference<android.content.Context> r0 = r1.d
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            return r0
        L13:
            android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
            return r0
    }

    private void i(boolean r10) {
            r9 = this;
            com.ss.android.downloadlib.addownload.j r0 = r9.c
            com.ss.android.downloadlib.addownload.o$i r1 = new com.ss.android.downloadlib.addownload.o$i
            long r2 = r9.m
            com.ss.android.j.j.cw.b r4 = r9.n
            com.ss.android.j.j.cw.g r5 = r9.T()
            com.ss.android.j.j.cw.c r6 = r9.F()
            r1.<init>(r2, r4, r5, r6)
            r0.j(r1)
            com.ss.android.downloadlib.addownload.j r2 = r9.c
            com.ss.android.downloadlib.addownload.l$i r8 = new com.ss.android.downloadlib.addownload.l$i
            r8.<init>(r9, r10)
            r3 = 0
            r4 = 0
            r6 = 0
            r2.g(r3, r4, r6, r8)
            return
    }

    private void k() {
            r4 = this;
            com.ss.android.downloadlib.addownload.l$j r0 = r4.h
            if (r0 == 0) goto L12
            android.os.AsyncTask$Status r0 = r0.getStatus()
            android.os.AsyncTask$Status r1 = android.os.AsyncTask.Status.FINISHED
            if (r0 == r1) goto L12
            com.ss.android.downloadlib.addownload.l$j r0 = r4.h
            r1 = 1
            r0.cancel(r1)
        L12:
            com.ss.android.downloadlib.addownload.l$j r0 = new com.ss.android.downloadlib.addownload.l$j
            r1 = 0
            r0.<init>(r4, r1)
            r4.h = r0
            java.lang.String r0 = r4.l
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L3a
            com.ss.android.downloadlib.addownload.l$j r0 = r4.h
            com.ss.android.j.j.cw.b r1 = r4.n
            java.lang.String r1 = r1.j()
            com.ss.android.j.j.cw.b r2 = r4.n
            java.lang.String r2 = r2.s()
            java.lang.String r3 = r4.l
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3}
            com.ss.android.downloadlib.a.q.a(r0, r1)
            return
        L3a:
            com.ss.android.downloadlib.addownload.l$j r0 = r4.h
            com.ss.android.j.j.cw.b r1 = r4.n
            java.lang.String r1 = r1.j()
            com.ss.android.j.j.cw.b r2 = r4.n
            java.lang.String r2 = r2.s()
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            com.ss.android.downloadlib.a.q.a(r0, r1)
            return
    }

    private boolean l() {
            r8 = this;
            com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.cw()
            java.lang.String r1 = "fix_click_start"
            boolean r0 = r0.j(r1)
            r1 = 0
            r2 = -3
            r3 = 1
            if (r0 == 0) goto L54
            com.ss.android.socialbase.downloader.ae.cw r0 = r8.g
            if (r0 != 0) goto L14
            return r3
        L14:
            int r0 = r0.i()
            if (r0 != r2) goto L27
            com.ss.android.socialbase.downloader.ae.cw r0 = r8.g
            long r4 = r0.uq()
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 > 0) goto L27
            return r3
        L27:
            com.ss.android.socialbase.downloader.ae.cw r0 = r8.g
            int r0 = r0.i()
            if (r0 == 0) goto L53
            com.ss.android.socialbase.downloader.ae.cw r0 = r8.g
            int r0 = r0.i()
            r2 = -4
            if (r0 != r2) goto L39
            goto L53
        L39:
            com.ss.android.socialbase.downloader.ae.cw r0 = r8.g     // Catch: java.lang.Exception -> L52
            int r0 = r0.i()     // Catch: java.lang.Exception -> L52
            com.ss.android.socialbase.downloader.ae.cw r2 = r8.g     // Catch: java.lang.Exception -> L52
            java.lang.String r2 = r2.qv()     // Catch: java.lang.Exception -> L52
            com.ss.android.socialbase.downloader.ae.cw r4 = r8.g     // Catch: java.lang.Exception -> L52
            java.lang.String r4 = r4.tl()     // Catch: java.lang.Exception -> L52
            boolean r0 = com.ss.android.socialbase.downloader.az.m.j(r0, r2, r4)     // Catch: java.lang.Exception -> L52
            if (r0 == 0) goto L52
            return r3
        L52:
            return r1
        L53:
            return r3
        L54:
            com.ss.android.socialbase.downloader.ae.cw r0 = r8.g
            if (r0 != 0) goto L59
            return r3
        L59:
            int r0 = r0.i()
            if (r0 == r2) goto L74
            android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
            com.ss.android.socialbase.downloader.downloader.ae r0 = com.ss.android.socialbase.downloader.downloader.ae.xt(r0)
            com.ss.android.socialbase.downloader.ae.cw r2 = r8.g
            int r2 = r2.ae()
            boolean r0 = r0.r(r2)
            if (r0 != 0) goto L74
            return r3
        L74:
            com.ss.android.socialbase.downloader.ae.cw r0 = r8.g
            int r0 = r0.i()
            if (r0 != 0) goto L7d
            return r3
        L7d:
            return r1
    }

    static /* synthetic */ long m(com.ss.android.downloadlib.addownload.l r2) {
            long r0 = r2.m
            return r0
    }

    private boolean p(int r6) {
            r5 = this;
            boolean r0 = r5.S()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            com.ss.android.j.j.cw.b r0 = r5.n
            com.ss.android.j.j.up.c r0 = r0.gq()
            java.lang.String r0 = r0.a()
            r2 = 1
            if (r6 == r2) goto L1c
            r2 = 2
            if (r6 == r2) goto L1a
            r2 = -1
            goto L1d
        L1a:
            r2 = 4
            goto L1d
        L1c:
            r2 = 5
        L1d:
            com.ss.android.j.j.cw.b r3 = r5.n
            boolean r4 = r3 instanceof com.ss.android.xt.j.j.a
            if (r4 == 0) goto L29
            com.ss.android.xt.j.j.a r3 = (com.ss.android.xt.j.j.a) r3
            r4 = 3
            r3.e(r4)
        L29:
            android.content.Context r3 = com.ss.android.downloadlib.addownload.m.getContext()
            boolean r0 = com.ss.android.downloadlib.a.f.a(r3, r0)
            if (r0 == 0) goto L58
            com.ss.android.downloadlib.r.b r1 = com.ss.android.downloadlib.r.b.a()
            long r3 = r5.m
            r1.c(r3, r6)
            android.os.Message r6 = android.os.Message.obtain()
            r6.what = r2
            com.ss.android.j.j.cw.b r1 = r5.n
            long r3 = r1.r()
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r6.obj = r1
            com.ss.android.downloadlib.addownload.c r6 = com.ss.android.downloadlib.addownload.c.a()
            com.ss.android.j.j.cw.b r1 = r5.n
            r6.c(r5, r2, r1)
            return r0
        L58:
            com.ss.android.downloadlib.r.b r6 = com.ss.android.downloadlib.r.b.a()
            long r2 = r5.m
            r6.f(r2, r1, r1)
            return r0
    }

    static /* synthetic */ boolean r(com.ss.android.downloadlib.addownload.l r0) {
            boolean r0 = r0.s
            return r0
    }

    private com.ss.android.j.j.up.e s() {
            r1 = this;
            com.ss.android.j.j.up.e r0 = r1.f
            if (r0 != 0) goto Lb
            com.ss.android.j.j.up.e r0 = new com.ss.android.j.j.up.e
            r0.<init>()
            r1.f = r0
        Lb:
            com.ss.android.j.j.up.e r0 = r1.f
            return r0
    }

    static /* synthetic */ android.content.Context t(com.ss.android.downloadlib.addownload.l r0) {
            android.content.Context r0 = r0.getContext()
            return r0
    }

    static /* synthetic */ com.ss.android.socialbase.downloader.ae.cw z(com.ss.android.downloadlib.addownload.l r0, com.ss.android.socialbase.downloader.ae.cw r1) {
            r0.g = r1
            return r1
    }

    public void E(boolean r4, boolean r5) {
            r3 = this;
            if (r4 == 0) goto Lc
            com.ss.android.downloadlib.r.b r4 = com.ss.android.downloadlib.r.b.a()
            long r0 = r3.m
            r2 = 2
            r4.c(r0, r2)
        Lc:
            boolean r4 = com.ss.android.downloadlib.a.h.v()
            if (r4 != 0) goto L30
            java.lang.String r4 = "android.permission.WRITE_EXTERNAL_STORAGE"
            boolean r4 = com.ss.android.downloadlib.a.j.f(r4)
            if (r4 != 0) goto L5d
            com.ss.android.j.j.cw.c r4 = r3.F()
            boolean r4 = r4.ws()
            if (r4 != 0) goto L5d
            com.ss.android.j.j.cw.b r4 = r3.n
            com.ss.android.downloadlib.addownload.k r0 = r3.b
            java.lang.String r0 = r0.z()
            r4.j(r0)
            goto L5d
        L30:
            java.lang.String r4 = "android.permission.READ_MEDIA_IMAGES"
            boolean r4 = com.ss.android.downloadlib.a.j.f(r4)
            if (r4 != 0) goto L5d
            java.lang.String r4 = "android.permission.READ_MEDIA_AUDIO"
            boolean r4 = com.ss.android.downloadlib.a.j.f(r4)
            if (r4 != 0) goto L5d
            java.lang.String r4 = "android.permission.READ_MEDIA_VIDEO"
            boolean r4 = com.ss.android.downloadlib.a.j.f(r4)
            if (r4 != 0) goto L5d
            com.ss.android.j.j.cw.c r4 = r3.F()
            boolean r4 = r4.ws()
            if (r4 != 0) goto L5d
            com.ss.android.j.j.cw.b r4 = r3.n
            com.ss.android.downloadlib.addownload.k r0 = r3.b
            java.lang.String r0 = r0.z()
            r4.j(r0)
        L5d:
            com.ss.android.j.j.cw.b r4 = r3.n
            int r4 = com.ss.android.downloadlib.a.n.c(r4)
            if (r4 != 0) goto L78
            java.lang.String r4 = com.ss.android.downloadlib.addownload.l.u
            java.lang.String r0 = "pBCD not start"
            r1 = 0
            com.ss.android.downloadlib.a.k.d(r4, r0, r1)
            com.ss.android.downloadlib.addownload.k r4 = r3.b
            com.ss.android.downloadlib.addownload.l$h r0 = new com.ss.android.downloadlib.addownload.l$h
            r0.<init>(r3, r5)
            r4.o(r0)
            return
        L78:
            r3.i(r5)
            return
    }

    public void H() {
            r2 = this;
            com.ss.android.downloadlib.a$p r0 = r2.a
            com.ss.android.downloadlib.addownload.l$b r1 = new com.ss.android.downloadlib.addownload.l$b
            r1.<init>(r2)
            r0.post(r1)
            return
    }

    public boolean N(boolean r4) {
            r3 = this;
            java.lang.ref.SoftReference<v2.h> r0 = r3.t
            r1 = 0
            java.lang.String r2 = "mDownloadButtonClickListener has recycled"
            if (r0 == 0) goto L33
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L33
            r0 = 1
            if (r4 != 0) goto L1c
            java.lang.ref.SoftReference<v2.h> r4 = r3.t     // Catch: java.lang.Exception -> L2b
            java.lang.Object r4 = r4.get()     // Catch: java.lang.Exception -> L2b
            v2.h r4 = (v2.h) r4     // Catch: java.lang.Exception -> L2b
            r4.j(r0)     // Catch: java.lang.Exception -> L2b
            goto L27
        L1c:
            java.lang.ref.SoftReference<v2.h> r4 = r3.t     // Catch: java.lang.Exception -> L2b
            java.lang.Object r4 = r4.get()     // Catch: java.lang.Exception -> L2b
            v2.h r4 = (v2.h) r4     // Catch: java.lang.Exception -> L2b
            r4.j()     // Catch: java.lang.Exception -> L2b
        L27:
            r4 = 0
            r3.t = r4     // Catch: java.lang.Exception -> L2b
            return r0
        L2b:
            com.ss.android.downloadlib.up.a r4 = com.ss.android.downloadlib.up.a.a()
            r4.f(r2)
            return r1
        L33:
            com.ss.android.downloadlib.up.a r4 = com.ss.android.downloadlib.up.a.a()
            r4.f(r2)
            return r1
    }

    public boolean S() {
            r5 = this;
            org.json.JSONObject r0 = com.ss.android.downloadlib.addownload.m.f()
            java.lang.String r1 = "quick_app_enable_switch"
            r2 = 0
            int r0 = r0.optInt(r1, r2)
            if (r0 == 0) goto Le
            return r2
        Le:
            com.ss.android.j.j.cw.b r0 = r5.n
            com.ss.android.j.j.up.c r0 = r0.gq()
            if (r0 == 0) goto L4f
            com.ss.android.j.j.cw.b r0 = r5.n
            com.ss.android.j.j.up.c r0 = r0.gq()
            java.lang.String r0 = r0.a()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L4f
            com.ss.android.socialbase.downloader.ae.cw r0 = r5.g
            boolean r0 = com.ss.android.downloadlib.addownload.c.e(r0)
            if (r0 == 0) goto L4f
            android.content.Context r0 = r5.getContext()
            android.content.Intent r1 = new android.content.Intent
            com.ss.android.j.j.cw.b r3 = r5.n
            com.ss.android.j.j.up.c r3 = r3.gq()
            java.lang.String r3 = r3.a()
            android.net.Uri r3 = android.net.Uri.parse(r3)
            java.lang.String r4 = "android.intent.action.VIEW"
            r1.<init>(r4, r3)
            boolean r0 = com.ss.android.downloadlib.a.h.x(r0, r1)
            if (r0 == 0) goto L4f
            r0 = 1
            return r0
        L4f:
            return r2
    }

    public void X(boolean r1) {
            r0 = this;
            r0.R(r1)
            return
    }

    @Override // com.ss.android.downloadlib.addownload.a
    public /* synthetic */ com.ss.android.downloadlib.addownload.a a(com.ss.android.j.j.cw.b r1) {
            r0 = this;
            com.ss.android.downloadlib.addownload.l r1 = r0.w(r1)
            return r1
    }

    @Override // com.ss.android.downloadlib.addownload.a
    public /* synthetic */ com.ss.android.downloadlib.addownload.a b(com.ss.android.j.j.cw.g r1) {
            r0 = this;
            com.ss.android.downloadlib.addownload.l r1 = r0.y(r1)
            return r1
    }

    @Override // com.ss.android.downloadlib.addownload.a
    public /* synthetic */ com.ss.android.downloadlib.addownload.a c(com.ss.android.j.j.cw.c r1) {
            r0 = this;
            com.ss.android.downloadlib.addownload.l r1 = r0.x(r1)
            return r1
    }

    @Override // com.ss.android.downloadlib.addownload.a
    public com.ss.android.downloadlib.addownload.a d(v2.h r2) {
            r1 = this;
            if (r2 != 0) goto L6
            r2 = 0
            r1.t = r2
            return r1
        L6:
            java.lang.ref.SoftReference r0 = new java.lang.ref.SoftReference
            r0.<init>(r2)
            r1.t = r0
            return r1
    }

    @Override // com.ss.android.downloadlib.addownload.a
    public com.ss.android.downloadlib.addownload.a e(v2.d r2) {
            r1 = this;
            if (r2 != 0) goto L6
            r2 = 0
            r1.q = r2
            return r1
        L6:
            java.lang.ref.SoftReference r0 = new java.lang.ref.SoftReference
            r0.<init>(r2)
            r1.q = r0
            return r1
    }

    @Override // com.ss.android.downloadlib.addownload.a
    public /* synthetic */ com.ss.android.downloadlib.addownload.a f(int r1, com.ss.android.j.j.cw.e r2) {
            r0 = this;
            com.ss.android.downloadlib.addownload.l r1 = r0.u(r1, r2)
            return r1
    }

    public void h() {
            r2 = this;
            java.util.Map<java.lang.Integer, java.lang.Object> r0 = r2.e
            int r0 = r0.size()
            if (r0 != 0) goto L9
            goto L2b
        L9:
            java.util.Map<java.lang.Integer, java.lang.Object> r0 = r2.e
            java.util.List r0 = com.ss.android.downloadlib.addownload.k.g(r0)
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()
            com.ss.android.j.j.cw.e r1 = (com.ss.android.j.j.cw.e) r1
            r1.j()
            goto L13
        L23:
            com.ss.android.socialbase.downloader.ae.cw r0 = r2.g
            if (r0 == 0) goto L2b
            r1 = -4
            r0.r(r1)
        L2b:
            return
    }

    @Override // com.ss.android.downloadlib.addownload.a
    public com.ss.android.downloadlib.addownload.a j(long r4) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 == 0) goto L1a
            com.ss.android.downloadlib.addownload.o$f r0 = com.ss.android.downloadlib.addownload.o.f.c()
            com.ss.android.j.j.cw.b r0 = r0.d(r4)
            if (r0 == 0) goto L19
            r3.n = r0
            r3.m = r4
            com.ss.android.downloadlib.addownload.k r0 = r3.b
            r0.i(r4)
        L19:
            return r3
        L1a:
            com.ss.android.downloadlib.up.a r4 = com.ss.android.downloadlib.up.a.a()
            r5 = 0
            java.lang.String r0 = "setModelId"
            r4.d(r5, r0)
            return r3
    }

    @Override // com.ss.android.downloadlib.addownload.a
    public com.ss.android.downloadlib.addownload.a j(java.lang.String r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L8
            r1.l = r2
        L8:
            return r1
    }

    @Override // com.ss.android.downloadlib.addownload.a
    public void j() {
            r5 = this;
            r0 = 1
            r5.j = r0
            com.ss.android.downloadlib.addownload.o$f r1 = com.ss.android.downloadlib.addownload.o.f.c()
            long r2 = r5.m
            com.ss.android.j.j.cw.g r4 = r5.T()
            r1.j(r2, r4)
            com.ss.android.downloadlib.addownload.o$f r1 = com.ss.android.downloadlib.addownload.o.f.c()
            long r2 = r5.m
            com.ss.android.j.j.cw.c r4 = r5.F()
            r1.i(r2, r4)
            com.ss.android.downloadlib.addownload.k r1 = r5.b
            long r2 = r5.m
            r1.i(r2)
            r5.k()
            org.json.JSONObject r1 = com.ss.android.downloadlib.addownload.m.f()
            java.lang.String r2 = "enable_empty_listener"
            int r1 = r1.optInt(r2, r0)
            if (r1 != r0) goto L49
            java.util.Map<java.lang.Integer, java.lang.Object> r0 = r5.e
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.get(r2)
            if (r0 != 0) goto L49
            v2.i r0 = new v2.i
            r0.<init>()
            r5.u(r1, r0)
        L49:
            return
    }

    @Override // com.ss.android.downloadlib.a.p.InterfaceC0196a
    public void j(android.os.Message r4) {
            r3 = this;
            if (r4 == 0) goto L1e
            boolean r0 = r3.j
            if (r0 != 0) goto L7
            goto L1e
        L7:
            int r0 = r4.what
            r1 = 3
            if (r0 == r1) goto Ld
            goto L1e
        Ld:
            java.lang.Object r0 = r4.obj
            com.ss.android.socialbase.downloader.ae.cw r0 = (com.ss.android.socialbase.downloader.ae.cw) r0
            r3.g = r0
            com.ss.android.downloadlib.addownload.k r0 = r3.b
            com.ss.android.j.j.up.e r1 = r3.s()
            java.util.Map<java.lang.Integer, java.lang.Object> r2 = r3.e
            r0.k(r4, r1, r2)
        L1e:
            return
    }

    @Override // com.ss.android.downloadlib.addownload.a
    public void j(boolean r3) {
            r2 = this;
            com.ss.android.socialbase.downloader.ae.cw r0 = r2.g
            if (r0 == 0) goto L4a
            if (r3 == 0) goto L28
            com.ss.android.socialbase.appdownloader.f r3 = com.ss.android.socialbase.appdownloader.f.L()
            w2.m r3 = r3.d()
            if (r3 == 0) goto L15
            com.ss.android.socialbase.downloader.ae.cw r0 = r2.g
            r3.j(r0)
        L15:
            android.content.Context r3 = com.ss.android.socialbase.downloader.downloader.cw.nd()
            com.ss.android.socialbase.downloader.downloader.ae r3 = com.ss.android.socialbase.downloader.downloader.ae.xt(r3)
            com.ss.android.socialbase.downloader.ae.cw r0 = r2.g
            int r0 = r0.ae()
            r1 = 1
            r3.j(r0, r1)
            return
        L28:
            android.content.Intent r3 = new android.content.Intent
            android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
            java.lang.Class<com.ss.android.socialbase.appdownloader.DownloadHandlerService> r1 = com.ss.android.socialbase.appdownloader.DownloadHandlerService.class
            r3.<init>(r0, r1)
            java.lang.String r0 = "android.ss.intent.action.DOWNLOAD_DELETE"
            r3.setAction(r0)
            com.ss.android.socialbase.downloader.ae.cw r0 = r2.g
            int r0 = r0.ae()
            java.lang.String r1 = "extra_click_download_ids"
            r3.putExtra(r1, r0)
            android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
            r0.startService(r3)
        L4a:
            return
    }

    @Override // com.ss.android.downloadlib.addownload.a
    public boolean j(int r5) {
            r4 = this;
            if (r5 != 0) goto L8
            java.util.Map<java.lang.Integer, java.lang.Object> r5 = r4.e
            r5.clear()
            goto L11
        L8:
            java.util.Map<java.lang.Integer, java.lang.Object> r0 = r4.e
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.remove(r5)
        L11:
            java.util.Map<java.lang.Integer, java.lang.Object> r5 = r4.e
            boolean r5 = r5.isEmpty()
            r0 = 0
            r1 = 1
            if (r5 == 0) goto L79
            r4.j = r0
            long r2 = java.lang.System.currentTimeMillis()
            r4.k = r2
            com.ss.android.socialbase.downloader.ae.cw r5 = r4.g
            if (r5 == 0) goto L38
            android.content.Context r5 = com.ss.android.downloadlib.addownload.m.getContext()
            com.ss.android.socialbase.downloader.downloader.ae r5 = com.ss.android.socialbase.downloader.downloader.ae.xt(r5)
            com.ss.android.socialbase.downloader.ae.cw r0 = r4.g
            int r0 = r0.ae()
            r5.qv(r0)
        L38:
            com.ss.android.downloadlib.addownload.l$j r5 = r4.h
            if (r5 == 0) goto L49
            android.os.AsyncTask$Status r5 = r5.getStatus()
            android.os.AsyncTask$Status r0 = android.os.AsyncTask.Status.FINISHED
            if (r5 == r0) goto L49
            com.ss.android.downloadlib.addownload.l$j r5 = r4.h
            r5.cancel(r1)
        L49:
            com.ss.android.downloadlib.addownload.k r5 = r4.b
            com.ss.android.socialbase.downloader.ae.cw r0 = r4.g
            r5.l(r0)
            java.lang.String r5 = com.ss.android.downloadlib.addownload.l.u
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "onUnbind removeCallbacksAndMessages, downloadUrl:"
            r0.<init>(r2)
            com.ss.android.socialbase.downloader.ae.cw r2 = r4.g
            if (r2 != 0) goto L60
            java.lang.String r2 = ""
            goto L64
        L60:
            java.lang.String r2 = r2.oq()
        L64:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r2 = 0
            com.ss.android.downloadlib.a.k.d(r5, r0, r2)
            com.ss.android.downloadlib.a$p r5 = r4.a
            r5.removeCallbacksAndMessages(r2)
            r4.f = r2
            r4.g = r2
            return r1
        L79:
            java.util.Map<java.lang.Integer, java.lang.Object> r5 = r4.e
            int r5 = r5.size()
            if (r5 != r1) goto L96
            java.util.Map<java.lang.Integer, java.lang.Object> r5 = r4.e
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r5 = r5.containsKey(r1)
            if (r5 == 0) goto L96
            com.ss.android.downloadlib.addownload.k r5 = r4.b
            com.ss.android.socialbase.downloader.ae.cw r1 = r4.g
            r5.B(r1)
        L96:
            return r0
    }

    public void n(boolean r4) {
            r3 = this;
            if (r4 == 0) goto Lc
            com.ss.android.downloadlib.r.b r4 = com.ss.android.downloadlib.r.b.a()
            long r0 = r3.m
            r2 = 1
            r4.c(r0, r2)
        Lc:
            r3.U()
            return
    }

    public boolean o() {
            r1 = this;
            com.ss.android.socialbase.downloader.ae.cw r0 = r1.g
            if (r0 == 0) goto Lc
            int r0 = r0.i()
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public boolean q() {
            r2 = this;
            java.lang.ref.SoftReference<v2.h> r0 = r2.t
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            com.ss.android.j.j.cw.b r1 = r2.n
            java.lang.Object r0 = r0.get()
            v2.h r0 = (v2.h) r0
            boolean r0 = com.ss.android.downloadlib.addownload.d.h(r1, r0)
            return r0
    }

    @Override // com.ss.android.downloadlib.addownload.a
    public long r() {
            r2 = this;
            long r0 = r2.k
            return r0
    }

    @Override // com.ss.android.downloadlib.addownload.a
    public void tl() {
            r3 = this;
            com.ss.android.downloadlib.addownload.o$f r0 = com.ss.android.downloadlib.addownload.o.f.c()
            long r1 = r3.m
            r0.p(r1)
            return
    }

    public com.ss.android.downloadlib.addownload.l u(int r4, com.ss.android.j.j.cw.e r5) {
            r3 = this;
            if (r5 == 0) goto L42
            org.json.JSONObject r0 = com.ss.android.downloadlib.addownload.m.f()
            java.lang.String r1 = "back_use_softref_listener"
            int r0 = r0.optInt(r1)
            r1 = 1
            if (r0 != r1) goto L19
            java.util.Map<java.lang.Integer, java.lang.Object> r0 = r3.e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.put(r4, r5)
            return r3
        L19:
            org.json.JSONObject r0 = com.ss.android.downloadlib.addownload.m.f()
            java.lang.String r2 = "use_weakref_listener"
            int r0 = r0.optInt(r2)
            if (r0 != r1) goto L34
            java.util.Map<java.lang.Integer, java.lang.Object> r0 = r3.e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r5)
            r0.put(r4, r1)
            return r3
        L34:
            java.util.Map<java.lang.Integer, java.lang.Object> r0 = r3.e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.ref.SoftReference r1 = new java.lang.ref.SoftReference
            r1.<init>(r5)
            r0.put(r4, r1)
        L42:
            return r3
    }

    public com.ss.android.downloadlib.addownload.l v(android.content.Context r2) {
            r1 = this;
            if (r2 == 0) goto L9
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.d = r0
        L9:
            com.ss.android.downloadlib.addownload.m.L(r2)
            return r1
    }

    public com.ss.android.downloadlib.addownload.l w(com.ss.android.j.j.cw.b r6) {
            r5 = this;
            if (r6 == 0) goto L91
            boolean r0 = r6.x()
            r1 = 0
            if (r0 == 0) goto L26
            long r3 = r6.r()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L1c
            java.lang.String r0 = r6.ch()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L57
        L1c:
            com.ss.android.downloadlib.up.a r0 = com.ss.android.downloadlib.up.a.a()
            java.lang.String r1 = "setDownloadModel ad error"
            r0.c(r1)
            goto L57
        L26:
            long r3 = r6.r()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L57
            boolean r0 = r6 instanceof com.ss.android.xt.j.j.a
            if (r0 == 0) goto L57
            com.ss.android.downloadlib.up.a r0 = com.ss.android.downloadlib.up.a.a()
            r1 = 0
            java.lang.String r2 = "setDownloadModel id=0"
            r0.d(r1, r2)
            com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.cw()
            java.lang.String r1 = "fix_model_id"
            boolean r0 = r0.j(r1)
            if (r0 == 0) goto L57
            r0 = r6
            com.ss.android.xt.j.j.a r0 = (com.ss.android.xt.j.j.a) r0
            java.lang.String r1 = r6.j()
            int r1 = r1.hashCode()
            long r1 = (long) r1
            r0.f(r1)
        L57:
            com.ss.android.downloadlib.addownload.o$f r0 = com.ss.android.downloadlib.addownload.o.f.c()
            r0.k(r6)
            long r0 = r6.r()
            r5.m = r0
            r5.n = r6
            boolean r0 = com.ss.android.downloadlib.addownload.d.g(r6)
            if (r0 == 0) goto L91
            com.ss.android.xt.j.j.a r6 = (com.ss.android.xt.j.j.a) r6
            r0 = 3
            r6.G(r0)
            com.ss.android.downloadlib.addownload.o$f r6 = com.ss.android.downloadlib.addownload.o.f.c()
            long r2 = r5.m
            com.ss.android.xt.j.xt.b r6 = r6.q(r2)
            if (r6 == 0) goto L91
            long r2 = r6.vl()
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L91
            r6.H0(r0)
            com.ss.android.downloadlib.addownload.o$d r0 = com.ss.android.downloadlib.addownload.o.d.c()
            r0.d(r6)
        L91:
            return r5
    }

    public com.ss.android.downloadlib.addownload.l x(com.ss.android.j.j.cw.c r4) {
            r3 = this;
            r3.p = r4
            com.ss.android.j.j.cw.b r4 = r3.n
            com.ss.android.socialbase.downloader.jy.j r4 = com.ss.android.downloadlib.a.n.x(r4)
            java.lang.String r0 = "force_auto_open"
            int r4 = r4.xt(r0)
            r0 = 1
            if (r4 != r0) goto L18
            com.ss.android.j.j.cw.c r4 = r3.F()
            r4.xt(r0)
        L18:
            com.ss.android.socialbase.downloader.jy.j r4 = com.ss.android.socialbase.downloader.jy.j.cw()
            java.lang.String r0 = "fix_show_dialog"
            boolean r4 = r4.j(r0)
            if (r4 == 0) goto L3c
            com.ss.android.j.j.cw.b r4 = r3.n
            org.json.JSONObject r4 = r4.h()
            if (r4 == 0) goto L3c
            java.lang.String r0 = "subprocess"
            int r4 = r4.optInt(r0)
            if (r4 <= 0) goto L3c
            com.ss.android.j.j.cw.c r4 = r3.F()
            r0 = 0
            r4.xt(r0)
        L3c:
            com.ss.android.downloadlib.addownload.o$f r4 = com.ss.android.downloadlib.addownload.o.f.c()
            long r0 = r3.m
            com.ss.android.j.j.cw.c r2 = r3.F()
            r4.i(r0, r2)
            return r3
    }

    @Override // com.ss.android.downloadlib.addownload.a
    public /* synthetic */ com.ss.android.downloadlib.addownload.a xt(android.content.Context r1) {
            r0 = this;
            com.ss.android.downloadlib.addownload.l r1 = r0.v(r1)
            return r1
    }

    @Override // com.ss.android.downloadlib.addownload.a
    public void xt(int r7) {
            r6 = this;
            r0 = 2
            r1 = 1
            if (r7 == r1) goto Lf
            if (r7 != r0) goto L7
            goto Lf
        L7:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "error actionType"
            r7.<init>(r0)
            throw r7
        Lf:
            com.ss.android.downloadlib.addownload.k r2 = r6.b
            long r3 = r6.m
            r2.i(r3)
            com.ss.android.downloadlib.addownload.o$f r2 = com.ss.android.downloadlib.addownload.o.f.c()
            long r3 = r6.m
            com.ss.android.downloadlib.addownload.o$i r2 = r2.r(r3)
            boolean r2 = r2.a()
            if (r2 != 0) goto L2f
            com.ss.android.downloadlib.up.a r2 = com.ss.android.downloadlib.up.a.a()
            java.lang.String r3 = "handleDownload ModelBox !isStrictValid"
            r2.c(r3)
        L2f:
            com.ss.android.downloadlib.addownload.k r2 = r6.b
            com.ss.android.j.j.cw.b r3 = r6.n
            boolean r2 = r2.q(r7, r3)
            if (r2 == 0) goto L4a
            com.ss.android.downloadlib.addownload.compliance.c r0 = com.ss.android.downloadlib.addownload.compliance.c.a()
            com.ss.android.downloadlib.addownload.k r1 = r6.b
            com.ss.android.downloadlib.addownload.o$i r1 = r1.b
            com.ss.android.downloadlib.addownload.l$a r2 = new com.ss.android.downloadlib.addownload.l$a
            r2.<init>(r6, r7)
            r0.g(r1, r2)
            return
        L4a:
            com.ss.android.downloadlib.addownload.k r2 = r6.b
            android.content.Context r3 = r6.getContext()
            boolean r4 = r6.r
            boolean r2 = r2.r(r3, r7, r4)
            if (r2 != 0) goto L9f
            boolean r2 = r6.p(r7)
            r3 = 0
            java.lang.String r4 = "handleDownload id:"
            if (r7 == r1) goto L82
            if (r7 == r0) goto L64
            goto L9f
        L64:
            if (r2 != 0) goto L9f
            java.lang.String r7 = com.ss.android.downloadlib.addownload.l.u
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            long r4 = r6.m
            r0.append(r4)
            java.lang.String r2 = ",pBC:"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.ss.android.downloadlib.a.k.d(r7, r0, r3)
            r6.X(r1)
            return
        L82:
            if (r2 != 0) goto L9f
            java.lang.String r7 = com.ss.android.downloadlib.addownload.l.u
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            long r4 = r6.m
            r0.append(r4)
            java.lang.String r2 = ",pIC:"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.ss.android.downloadlib.a.k.d(r7, r0, r3)
            r6.n(r1)
        L9f:
            return
    }

    @Override // com.ss.android.downloadlib.addownload.a
    public boolean xt() {
            r1 = this;
            boolean r0 = r1.j
            return r0
    }

    public com.ss.android.downloadlib.addownload.l y(com.ss.android.j.j.cw.g r4) {
            r3 = this;
            r3.o = r4
            com.ss.android.j.j.cw.g r4 = r3.T()
            int r4 = r4.qv()
            if (r4 != 0) goto Le
            r4 = 1
            goto Lf
        Le:
            r4 = 0
        Lf:
            r3.r = r4
            com.ss.android.downloadlib.addownload.o$f r4 = com.ss.android.downloadlib.addownload.o.f.c()
            long r0 = r3.m
            com.ss.android.j.j.cw.g r2 = r3.T()
            r4.j(r0, r2)
            return r3
    }
}
