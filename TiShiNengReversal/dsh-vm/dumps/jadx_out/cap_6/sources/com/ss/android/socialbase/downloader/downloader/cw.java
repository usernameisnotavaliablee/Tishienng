package com.ss.android.socialbase.downloader.downloader;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class cw {
    private static volatile com.ss.android.socialbase.downloader.downloader.w a;
    private static volatile com.ss.android.socialbase.downloader.downloader.i ae;
    private static volatile java.util.concurrent.ExecutorService av;
    private static volatile java.util.concurrent.ExecutorService az;
    private static final java.util.List<java.lang.Object> b = null;
    private static boolean c;
    private static volatile com.ss.android.socialbase.downloader.downloader.DownloadReceiver ch;
    private static volatile com.ss.android.socialbase.downloader.downloader.jy cw;
    private static int e;
    private static final java.util.List<com.ss.android.socialbase.downloader.r.ws> ed = null;
    private static volatile java.util.concurrent.ExecutorService f;
    private static volatile com.ss.android.socialbase.downloader.downloader.cw.j g;
    private static volatile okhttp3.OkHttpClient gq;
    private static int gx;
    private static volatile java.util.List<com.ss.android.socialbase.downloader.r.n> h;
    private static int hh;
    private static final java.util.List<com.ss.android.socialbase.downloader.r.vl> hl = null;
    private static volatile java.util.concurrent.ExecutorService i;
    private static volatile android.content.Context j;
    private static volatile com.ss.android.socialbase.downloader.g.tl jy;
    private static volatile java.util.concurrent.ExecutorService kt;
    private static volatile com.ss.android.socialbase.downloader.tl.xt l;
    private static volatile boolean la;
    private static volatile com.ss.android.socialbase.downloader.impls.j m;
    private static volatile java.util.concurrent.ExecutorService mi;
    private static final int n = 0;
    private static final int nd = 0;
    private static final int ol = 0;
    private static volatile com.ss.android.socialbase.downloader.g.oq oq;
    private static volatile com.ss.android.socialbase.downloader.r.la p;

    /* renamed from: q, reason: collision with root package name */
    private static boolean f1q;
    private static boolean qb;
    private static volatile com.ss.android.socialbase.downloader.g.tl qv;
    private static volatile com.ss.android.socialbase.downloader.downloader.oq r;
    private static final int rh = 0;
    private static volatile com.ss.android.socialbase.downloader.g.m rn;
    private static volatile com.ss.android.socialbase.downloader.downloader.kt s;
    private static com.ss.android.socialbase.downloader.tl.cw sm;
    private static volatile java.util.concurrent.ExecutorService tj;
    private static volatile com.ss.android.socialbase.downloader.downloader.i tl;
    private static volatile com.ss.android.socialbase.downloader.downloader.f uf;
    private static volatile com.ss.android.socialbase.downloader.r.wq up;
    private static volatile java.util.concurrent.ScheduledExecutorService v;
    private static volatile com.ss.android.socialbase.downloader.g.oq vl;
    private static volatile java.util.concurrent.ExecutorService w;
    private static volatile com.ss.android.socialbase.downloader.g.m wq;
    private static volatile com.ss.android.socialbase.downloader.downloader.ws ws;
    private static volatile com.ss.android.socialbase.downloader.downloader.g x;
    private static volatile boolean xq;
    private static volatile com.ss.android.socialbase.downloader.downloader.vl xt;
    private static com.ss.android.socialbase.downloader.downloader.mi ya;
    private static boolean z;




    public interface j {

        /* renamed from: com.ss.android.socialbase.downloader.downloader.cw$j$j, reason: collision with other inner class name */
        public interface InterfaceC0002j {
            void j();
        }

        com.ss.android.socialbase.downloader.downloader.i j();

        com.ss.android.socialbase.downloader.downloader.tj j(com.ss.android.socialbase.downloader.downloader.cw.j.InterfaceC0002j r1);

        com.ss.android.socialbase.downloader.downloader.az xt();
    }

    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.ss.android.socialbase.downloader.downloader.cw.h = r0
            r0 = 0
            com.ss.android.socialbase.downloader.downloader.cw.la = r0
            r1 = 0
            com.ss.android.socialbase.downloader.downloader.cw.gq = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.ss.android.socialbase.downloader.downloader.cw.ed = r1
            com.ss.android.socialbase.downloader.downloader.cw.c = r0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()
            int r1 = r1.availableProcessors()
            r2 = 1
            int r1 = r1 + r2
            com.ss.android.socialbase.downloader.downloader.cw.n = r1
            java.lang.Runtime r3 = java.lang.Runtime.getRuntime()
            int r3 = r3.availableProcessors()
            int r3 = r3 * 2
            int r3 = r3 + r2
            com.ss.android.socialbase.downloader.downloader.cw.nd = r3
            com.ss.android.socialbase.downloader.downloader.cw.rh = r1
            com.ss.android.socialbase.downloader.downloader.cw.ol = r1
            r1 = 8192(0x2000, float:1.148E-41)
            com.ss.android.socialbase.downloader.downloader.cw.hh = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.ss.android.socialbase.downloader.downloader.cw.hl = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.ss.android.socialbase.downloader.downloader.cw.b = r1
            com.ss.android.socialbase.downloader.downloader.cw.f1q = r2
            com.ss.android.socialbase.downloader.downloader.cw.qb = r0
            com.ss.android.socialbase.downloader.downloader.cw.xq = r0
            return
    }

    private cw() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.util.List<com.ss.android.socialbase.downloader.r.ws> a() {
            java.util.List<com.ss.android.socialbase.downloader.r.ws> r0 = com.ss.android.socialbase.downloader.downloader.cw.ed
            return r0
    }

    public static com.ss.android.socialbase.downloader.g.oq ae() {
            com.ss.android.socialbase.downloader.g.oq r0 = com.ss.android.socialbase.downloader.downloader.cw.vl
            if (r0 != 0) goto L19
            java.lang.Class<com.ss.android.socialbase.downloader.downloader.cw> r0 = com.ss.android.socialbase.downloader.downloader.cw.class
            monitor-enter(r0)
            com.ss.android.socialbase.downloader.g.oq r1 = com.ss.android.socialbase.downloader.downloader.cw.vl     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.ss.android.socialbase.downloader.impls.ae r1 = new com.ss.android.socialbase.downloader.impls.ae     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.ss.android.socialbase.downloader.downloader.cw.vl = r1     // Catch: java.lang.Throwable -> L13
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
            com.ss.android.socialbase.downloader.g.oq r0 = com.ss.android.socialbase.downloader.downloader.cw.vl
            return r0
    }

    private static void ae(java.util.concurrent.ExecutorService r0) {
            if (r0 == 0) goto L4
            com.ss.android.socialbase.downloader.downloader.cw.mi = r0
        L4:
            return
    }

    public static java.util.concurrent.ExecutorService av() {
            java.util.concurrent.ExecutorService r0 = com.ss.android.socialbase.downloader.downloader.cw.tj
            if (r0 != 0) goto L35
            java.lang.Class<com.ss.android.socialbase.downloader.downloader.cw> r1 = com.ss.android.socialbase.downloader.downloader.cw.class
            monitor-enter(r1)
            java.util.concurrent.ExecutorService r0 = com.ss.android.socialbase.downloader.downloader.cw.tj     // Catch: java.lang.Throwable -> L2f
            if (r0 != 0) goto L31
            com.bytedance.sdk.component.oq.r.r r2 = new com.bytedance.sdk.component.oq.r.r     // Catch: java.lang.Throwable -> L2f
            int r3 = com.ss.android.socialbase.downloader.downloader.cw.nd     // Catch: java.lang.Throwable -> L2f
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L2f
            java.util.concurrent.LinkedBlockingQueue r8 = new java.util.concurrent.LinkedBlockingQueue     // Catch: java.lang.Throwable -> L2f
            r8.<init>()     // Catch: java.lang.Throwable -> L2f
            com.ss.android.socialbase.downloader.ws.j r9 = new com.ss.android.socialbase.downloader.ws.j     // Catch: java.lang.Throwable -> L2f
            java.lang.String r0 = "DownloadThreadPool-chunk-fixed"
            r10 = 1
            r9.<init>(r0, r10)     // Catch: java.lang.Throwable -> L2f
            r5 = 15
            r4 = r3
            r2.<init>(r3, r4, r5, r7, r8, r9)     // Catch: java.lang.Throwable -> L2f
            r2.allowCoreThreadTimeOut(r10)     // Catch: java.lang.Throwable -> L28
            goto L2c
        L28:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)     // Catch: java.lang.Throwable -> L2f
        L2c:
            com.ss.android.socialbase.downloader.downloader.cw.tj = r2     // Catch: java.lang.Throwable -> L2f
            goto L31
        L2f:
            r0 = move-exception
            goto L33
        L31:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2f
            goto L35
        L33:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2f
            throw r0
        L35:
            java.util.concurrent.ExecutorService r0 = com.ss.android.socialbase.downloader.downloader.cw.tj
            return r0
    }

    public static java.util.concurrent.ExecutorService az() {
            java.util.concurrent.ExecutorService r0 = com.ss.android.socialbase.downloader.downloader.cw.i
            if (r0 != 0) goto L35
            java.lang.Class<com.ss.android.socialbase.downloader.downloader.cw> r1 = com.ss.android.socialbase.downloader.downloader.cw.class
            monitor-enter(r1)
            java.util.concurrent.ExecutorService r0 = com.ss.android.socialbase.downloader.downloader.cw.i     // Catch: java.lang.Throwable -> L2f
            if (r0 != 0) goto L31
            com.bytedance.sdk.component.oq.r.r r2 = new com.bytedance.sdk.component.oq.r.r     // Catch: java.lang.Throwable -> L2f
            int r3 = com.ss.android.socialbase.downloader.downloader.cw.rh     // Catch: java.lang.Throwable -> L2f
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L2f
            java.util.concurrent.LinkedBlockingQueue r8 = new java.util.concurrent.LinkedBlockingQueue     // Catch: java.lang.Throwable -> L2f
            r8.<init>()     // Catch: java.lang.Throwable -> L2f
            com.ss.android.socialbase.downloader.ws.j r9 = new com.ss.android.socialbase.downloader.ws.j     // Catch: java.lang.Throwable -> L2f
            java.lang.String r0 = "DownloadThreadPool-mix-fixed"
            r10 = 1
            r9.<init>(r0, r10)     // Catch: java.lang.Throwable -> L2f
            r5 = 15
            r4 = r3
            r2.<init>(r3, r4, r5, r7, r8, r9)     // Catch: java.lang.Throwable -> L2f
            r2.allowCoreThreadTimeOut(r10)     // Catch: java.lang.Throwable -> L28
            goto L2c
        L28:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)     // Catch: java.lang.Throwable -> L2f
        L2c:
            com.ss.android.socialbase.downloader.downloader.cw.i = r2     // Catch: java.lang.Throwable -> L2f
            goto L31
        L2f:
            r0 = move-exception
            goto L33
        L31:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2f
            goto L35
        L33:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2f
            throw r0
        L35:
            java.util.concurrent.ExecutorService r0 = com.ss.android.socialbase.downloader.downloader.cw.i
            return r0
    }

    public static com.ss.android.socialbase.downloader.downloader.cw.j b() {
            com.ss.android.socialbase.downloader.downloader.cw$j r0 = com.ss.android.socialbase.downloader.downloader.cw.g
            return r0
    }

    public static com.ss.android.socialbase.downloader.downloader.g c() {
            com.ss.android.socialbase.downloader.downloader.g r0 = com.ss.android.socialbase.downloader.downloader.cw.x
            if (r0 != 0) goto L19
            java.lang.Class<com.ss.android.socialbase.downloader.downloader.cw> r0 = com.ss.android.socialbase.downloader.downloader.cw.class
            monitor-enter(r0)
            com.ss.android.socialbase.downloader.downloader.g r1 = com.ss.android.socialbase.downloader.downloader.cw.x     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.ss.android.socialbase.downloader.impls.xt r1 = new com.ss.android.socialbase.downloader.impls.xt     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.ss.android.socialbase.downloader.downloader.cw.x = r1     // Catch: java.lang.Throwable -> L13
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
            com.ss.android.socialbase.downloader.downloader.g r0 = com.ss.android.socialbase.downloader.downloader.cw.x
            return r0
    }

    public static com.ss.android.socialbase.downloader.downloader.i ch() {
            com.ss.android.socialbase.downloader.downloader.i r0 = com.ss.android.socialbase.downloader.downloader.cw.ae
            if (r0 != 0) goto L19
            java.lang.Class<com.ss.android.socialbase.downloader.downloader.cw> r0 = com.ss.android.socialbase.downloader.downloader.cw.class
            monitor-enter(r0)
            com.ss.android.socialbase.downloader.downloader.i r1 = com.ss.android.socialbase.downloader.downloader.cw.ae     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.ss.android.socialbase.downloader.impls.tl r1 = new com.ss.android.socialbase.downloader.impls.tl     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.ss.android.socialbase.downloader.downloader.cw.ae = r1     // Catch: java.lang.Throwable -> L13
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
            com.ss.android.socialbase.downloader.downloader.i r0 = com.ss.android.socialbase.downloader.downloader.cw.ae
            return r0
    }

    public static com.ss.android.socialbase.downloader.g.oq cw() {
            com.ss.android.socialbase.downloader.g.oq r0 = com.ss.android.socialbase.downloader.downloader.cw.oq
            return r0
    }

    private static void cw(com.ss.android.socialbase.downloader.downloader.tl r2) {
            if (r2 == 0) goto L18c
            android.content.Context r0 = r2.getContext()
            if (r0 == 0) goto Lf
            android.content.Context r0 = r2.getContext()
            j(r0)
        Lf:
            com.ss.android.socialbase.downloader.downloader.vl r0 = r2.j()
            if (r0 == 0) goto L1c
            com.ss.android.socialbase.downloader.downloader.vl r0 = r2.j()
            j(r0)
        L1c:
            com.ss.android.socialbase.downloader.downloader.jy r0 = r2.xt()
            if (r0 == 0) goto L29
            com.ss.android.socialbase.downloader.downloader.jy r0 = r2.xt()
            j(r0)
        L29:
            com.ss.android.socialbase.downloader.downloader.oq r0 = r2.av()
            if (r0 == 0) goto L36
            com.ss.android.socialbase.downloader.downloader.oq r0 = r2.av()
            j(r0)
        L36:
            com.ss.android.socialbase.downloader.r.wq r0 = r2.x()
            if (r0 == 0) goto L43
            com.ss.android.socialbase.downloader.r.wq r0 = r2.x()
            j(r0)
        L43:
            int r0 = r2.az()
            if (r0 == 0) goto L50
            int r0 = r2.az()
            xt(r0)
        L50:
            com.ss.android.socialbase.downloader.g.oq r0 = r2.cw()
            if (r0 == 0) goto L5d
            com.ss.android.socialbase.downloader.g.oq r0 = r2.cw()
            j(r0)
        L5d:
            com.ss.android.socialbase.downloader.g.tl r0 = r2.r()
            if (r0 == 0) goto L6a
            com.ss.android.socialbase.downloader.g.tl r0 = r2.r()
            j(r0)
        L6a:
            com.ss.android.socialbase.downloader.downloader.ws r0 = r2.up()
            if (r0 == 0) goto L77
            com.ss.android.socialbase.downloader.downloader.ws r0 = r2.up()
            j(r0)
        L77:
            java.util.concurrent.ExecutorService r0 = r2.m()
            if (r0 == 0) goto L84
            java.util.concurrent.ExecutorService r0 = r2.m()
            cw(r0)
        L84:
            java.util.concurrent.ExecutorService r0 = r2.ae()
            if (r0 == 0) goto L91
            java.util.concurrent.ExecutorService r0 = r2.ae()
            r(r0)
        L91:
            java.util.concurrent.ExecutorService r0 = r2.tl()
            if (r0 == 0) goto L9e
            java.util.concurrent.ExecutorService r0 = r2.tl()
            up(r0)
        L9e:
            java.util.concurrent.ExecutorService r0 = r2.g()
            if (r0 == 0) goto Lab
            java.util.concurrent.ExecutorService r0 = r2.g()
            m(r0)
        Lab:
            java.util.concurrent.ExecutorService r0 = r2.oq()
            if (r0 == 0) goto Lb8
            java.util.concurrent.ExecutorService r0 = r2.oq()
            ae(r0)
        Lb8:
            java.util.concurrent.ExecutorService r0 = r2.qv()
            if (r0 == 0) goto Lc5
            java.util.concurrent.ExecutorService r0 = r2.qv()
            tl(r0)
        Lc5:
            java.util.concurrent.ExecutorService r0 = r2.vl()
            if (r0 == 0) goto Ld2
            java.util.concurrent.ExecutorService r0 = r2.vl()
            j(r0)
        Ld2:
            java.util.concurrent.ExecutorService r0 = r2.jy()
            if (r0 == 0) goto Ldf
            java.util.concurrent.ExecutorService r0 = r2.jy()
            xt(r0)
        Ldf:
            java.util.List r0 = r2.ws()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lf0
            java.util.List r0 = r2.ws()
            j(r0)
        Lf0:
            com.ss.android.socialbase.downloader.downloader.w r0 = r2.kt()
            if (r0 == 0) goto Lfc
            com.ss.android.socialbase.downloader.downloader.w r0 = r2.kt()
            com.ss.android.socialbase.downloader.downloader.cw.a = r0
        Lfc:
            int r0 = r2.w()
            r1 = 1024(0x400, float:1.435E-42)
            if (r0 <= r1) goto L10a
            int r0 = r2.w()
            com.ss.android.socialbase.downloader.downloader.cw.hh = r0
        L10a:
            com.ss.android.socialbase.downloader.downloader.g r0 = r2.i()
            if (r0 == 0) goto L117
            com.ss.android.socialbase.downloader.downloader.g r0 = r2.i()
            j(r0)
        L117:
            boolean r0 = r2.mi()
            if (r0 == 0) goto L120
            r0 = 1
            com.ss.android.socialbase.downloader.downloader.cw.la = r0
        L120:
            int r0 = r2.tj()
            if (r0 == 0) goto L12c
            int r0 = r2.tj()
            com.ss.android.socialbase.downloader.downloader.cw.e = r0
        L12c:
            com.ss.android.socialbase.downloader.r.la r0 = r2.ch()
            if (r0 == 0) goto L139
            com.ss.android.socialbase.downloader.r.la r0 = r2.ch()
            j(r0)
        L139:
            com.ss.android.socialbase.downloader.g.m r0 = r2.a()
            if (r0 == 0) goto L145
            com.ss.android.socialbase.downloader.g.m r0 = r2.a()
            com.ss.android.socialbase.downloader.downloader.cw.rn = r0
        L145:
            com.ss.android.socialbase.downloader.downloader.f r0 = r2.f()
            if (r0 == 0) goto L178
            com.ss.android.socialbase.downloader.downloader.f r0 = r2.f()
            com.ss.android.socialbase.downloader.downloader.cw.uf = r0
            boolean r0 = r0.j()
            if (r0 == 0) goto L16a
            com.ss.android.socialbase.downloader.downloader.f r0 = com.ss.android.socialbase.downloader.downloader.cw.uf
            com.ss.android.socialbase.downloader.g.oq r0 = r0.xt()
            j(r0)
            com.ss.android.socialbase.downloader.downloader.f r0 = com.ss.android.socialbase.downloader.downloader.cw.uf
            com.ss.android.socialbase.downloader.g.tl r0 = r0.cw()
            j(r0)
            goto L178
        L16a:
            com.ss.android.socialbase.downloader.g.oq r0 = ae()
            j(r0)
            com.ss.android.socialbase.downloader.g.tl r0 = tl()
            j(r0)
        L178:
            boolean r0 = r2.v()
            xt(r0)
            com.ss.android.socialbase.downloader.tl.xt r0 = r2.s()
            if (r0 == 0) goto L18c
            com.ss.android.socialbase.downloader.tl.xt r2 = r2.s()
            j(r2)
        L18c:
            return
    }

    public static void cw(java.lang.Runnable r1) {
            if (r1 != 0) goto L3
            return
        L3:
            boolean r0 = com.ss.android.socialbase.downloader.az.m.r()
            if (r0 != 0) goto Ld
            r1.run()
            return
        Ld:
            java.util.concurrent.ExecutorService r0 = i()
            r0.execute(r1)
            return
    }

    private static void cw(java.util.concurrent.ExecutorService r0) {
            if (r0 == 0) goto L4
            com.ss.android.socialbase.downloader.downloader.cw.az = r0
        L4:
            return
    }

    private static void e() {
            com.ss.android.socialbase.downloader.downloader.DownloadReceiver r0 = com.ss.android.socialbase.downloader.downloader.cw.ch
            if (r0 != 0) goto Lb
            com.ss.android.socialbase.downloader.downloader.DownloadReceiver r0 = new com.ss.android.socialbase.downloader.downloader.DownloadReceiver
            r0.<init>()
            com.ss.android.socialbase.downloader.downloader.cw.ch = r0
        Lb:
            boolean r0 = com.ss.android.socialbase.downloader.downloader.cw.c
            if (r0 == 0) goto L10
            return
        L10:
            android.content.IntentFilter r0 = new android.content.IntentFilter     // Catch: java.lang.Throwable -> L25
            r0.<init>()     // Catch: java.lang.Throwable -> L25
            java.lang.String r1 = "android.net.conn.CONNECTIVITY_CHANGE"
            r0.addAction(r1)     // Catch: java.lang.Throwable -> L25
            android.content.Context r1 = com.ss.android.socialbase.downloader.downloader.cw.j     // Catch: java.lang.Throwable -> L25
            com.ss.android.socialbase.downloader.downloader.DownloadReceiver r2 = com.ss.android.socialbase.downloader.downloader.cw.ch     // Catch: java.lang.Throwable -> L25
            r1.registerReceiver(r2, r0)     // Catch: java.lang.Throwable -> L25
            r0 = 1
            com.ss.android.socialbase.downloader.downloader.cw.c = r0     // Catch: java.lang.Throwable -> L25
            return
        L25:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
            return
    }

    public static com.ss.android.socialbase.downloader.r.wq ed() {
            com.ss.android.socialbase.downloader.r.wq r0 = com.ss.android.socialbase.downloader.downloader.cw.up
            return r0
    }

    public static com.ss.android.socialbase.downloader.g.m f() {
            com.ss.android.socialbase.downloader.g.m r0 = com.ss.android.socialbase.downloader.downloader.cw.wq
            if (r0 != 0) goto L19
            java.lang.Class<com.ss.android.socialbase.downloader.downloader.cw> r0 = com.ss.android.socialbase.downloader.downloader.cw.class
            monitor-enter(r0)
            com.ss.android.socialbase.downloader.g.m r1 = com.ss.android.socialbase.downloader.downloader.cw.wq     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.ss.android.socialbase.downloader.downloader.cw$2 r1 = new com.ss.android.socialbase.downloader.downloader.cw$2     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.ss.android.socialbase.downloader.downloader.cw.wq = r1     // Catch: java.lang.Throwable -> L13
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
            com.ss.android.socialbase.downloader.g.m r0 = com.ss.android.socialbase.downloader.downloader.cw.wq
            return r0
    }

    public static boolean g() {
            com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.cw()
            java.lang.String r1 = "switch_not_auto_boot_service"
            boolean r2 = com.ss.android.socialbase.downloader.downloader.cw.qb
            int r0 = r0.j(r1, r2)
            if (r0 <= 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    public static void gq() {
            java.lang.String r0 = com.ss.android.socialbase.downloader.xt.up.cw
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L12
            java.lang.String r0 = "oppo"
            com.ss.android.socialbase.downloader.xt.up.cw = r0
            java.lang.String r0 = r0.toUpperCase()
            com.ss.android.socialbase.downloader.xt.up.xt = r0
        L12:
            return
    }

    public static com.ss.android.socialbase.downloader.downloader.kt gx() {
            com.ss.android.socialbase.downloader.downloader.kt r0 = com.ss.android.socialbase.downloader.downloader.cw.s
            if (r0 != 0) goto L19
            java.lang.Class<com.ss.android.socialbase.downloader.downloader.cw> r0 = com.ss.android.socialbase.downloader.downloader.cw.class
            monitor-enter(r0)
            com.ss.android.socialbase.downloader.downloader.kt r1 = com.ss.android.socialbase.downloader.downloader.cw.s     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.ss.android.socialbase.downloader.impls.oq r1 = new com.ss.android.socialbase.downloader.impls.oq     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.ss.android.socialbase.downloader.downloader.cw.s = r1     // Catch: java.lang.Throwable -> L13
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
            com.ss.android.socialbase.downloader.downloader.kt r0 = com.ss.android.socialbase.downloader.downloader.cw.s
            return r0
    }

    public static int h() {
            int r0 = com.ss.android.socialbase.downloader.downloader.cw.e
            return r0
    }

    public static com.ss.android.socialbase.downloader.downloader.mi hh() {
            com.ss.android.socialbase.downloader.downloader.mi r0 = com.ss.android.socialbase.downloader.downloader.cw.ya
            return r0
    }

    public static boolean hl() {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "supportMultiProc::="
            r0.<init>(r1)
            com.ss.android.socialbase.downloader.downloader.cw$j r1 = com.ss.android.socialbase.downloader.downloader.cw.g
            r2 = 0
            r3 = 1
            if (r1 == 0) goto Lf
            r1 = 1
            goto L10
        Lf:
            r1 = 0
        L10:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "wjd"
            com.ss.android.socialbase.downloader.m.j.j(r1, r0)
            com.ss.android.socialbase.downloader.downloader.cw$j r0 = com.ss.android.socialbase.downloader.downloader.cw.g
            if (r0 == 0) goto L21
            return r3
        L21:
            return r2
    }

    public static java.util.concurrent.ExecutorService i() {
            java.util.concurrent.ExecutorService r0 = com.ss.android.socialbase.downloader.downloader.cw.kt
            if (r0 != 0) goto L35
            java.lang.Class<com.ss.android.socialbase.downloader.downloader.cw> r1 = com.ss.android.socialbase.downloader.downloader.cw.class
            monitor-enter(r1)
            java.util.concurrent.ExecutorService r0 = com.ss.android.socialbase.downloader.downloader.cw.kt     // Catch: java.lang.Throwable -> L2f
            if (r0 != 0) goto L31
            com.bytedance.sdk.component.oq.r.r r2 = new com.bytedance.sdk.component.oq.r.r     // Catch: java.lang.Throwable -> L2f
            int r3 = com.ss.android.socialbase.downloader.downloader.cw.ol     // Catch: java.lang.Throwable -> L2f
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L2f
            java.util.concurrent.LinkedBlockingQueue r8 = new java.util.concurrent.LinkedBlockingQueue     // Catch: java.lang.Throwable -> L2f
            r8.<init>()     // Catch: java.lang.Throwable -> L2f
            com.ss.android.socialbase.downloader.ws.j r9 = new com.ss.android.socialbase.downloader.ws.j     // Catch: java.lang.Throwable -> L2f
            java.lang.String r0 = "DownloadThreadPool-db-fixed"
            r10 = 1
            r9.<init>(r0, r10)     // Catch: java.lang.Throwable -> L2f
            r5 = 15
            r4 = r3
            r2.<init>(r3, r4, r5, r7, r8, r9)     // Catch: java.lang.Throwable -> L2f
            r2.allowCoreThreadTimeOut(r10)     // Catch: java.lang.Throwable -> L28
            goto L2c
        L28:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)     // Catch: java.lang.Throwable -> L2f
        L2c:
            com.ss.android.socialbase.downloader.downloader.cw.kt = r2     // Catch: java.lang.Throwable -> L2f
            goto L31
        L2f:
            r0 = move-exception
            goto L33
        L31:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2f
            goto L35
        L33:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2f
            throw r0
        L35:
            java.util.concurrent.ExecutorService r0 = com.ss.android.socialbase.downloader.downloader.cw.kt
            return r0
    }

    public static int j(com.ss.android.socialbase.downloader.ae.cw r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = r2.s()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L12
            java.lang.String r0 = r2.oq()
        L12:
            java.lang.String r2 = r2.qv()
            int r2 = j(r0, r2)
            return r2
    }

    public static int j(java.lang.String r1, java.lang.String r2) {
            com.ss.android.socialbase.downloader.downloader.jy r0 = l()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            int r1 = r0.j(r1, r2)
            return r1
    }

    public static com.ss.android.socialbase.downloader.g.ae j(java.lang.String r2, java.util.List<com.ss.android.socialbase.downloader.ae.up> r3) throws java.lang.Exception {
            r0 = 0
            r1 = 0
            com.ss.android.socialbase.downloader.g.ae r2 = j(r2, r3, r0, r0, r1)
            return r2
    }

    public static com.ss.android.socialbase.downloader.g.ae j(java.lang.String r5, java.util.List<com.ss.android.socialbase.downloader.ae.up> r6, int r7, boolean r8, com.ss.android.socialbase.downloader.ae.cw r9) throws java.lang.Exception {
            int[] r7 = j(r7)
            int r0 = r7.length
            r1 = 0
            r2 = 0
            r3 = r1
        L8:
            if (r2 >= r0) goto L17
            r4 = r7[r2]
            com.ss.android.socialbase.downloader.g.ae r4 = xt(r5, r6, r4, r8, r9)     // Catch: java.lang.Exception -> L13
            if (r4 == 0) goto L14
            return r4
        L13:
            r3 = move-exception
        L14:
            int r2 = r2 + 1
            goto L8
        L17:
            if (r3 != 0) goto L1a
            return r1
        L1a:
            throw r3
    }

    private static com.ss.android.socialbase.downloader.g.g j(int r10, java.lang.String r11, java.lang.String r12, java.util.List<com.ss.android.socialbase.downloader.ae.up> r13, int r14, boolean r15, com.ss.android.socialbase.downloader.ae.cw r16) throws com.ss.android.socialbase.downloader.up.j, java.io.IOException {
            r0 = 1
            if (r14 != r0) goto L8
            com.ss.android.socialbase.downloader.g.oq r0 = cw()
            goto Lc
        L8:
            com.ss.android.socialbase.downloader.g.oq r0 = ae()
        Lc:
            if (r0 == 0) goto L50
            r1 = 0
            r2 = 0
            if (r15 == 0) goto L17
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1d
        L17:
            r7 = r1
            goto L20
        L19:
            r0 = move-exception
            r9 = r0
            r7 = r1
            goto L3c
        L1d:
            r0 = move-exception
            r1 = r0
            goto L3b
        L20:
            com.ss.android.socialbase.downloader.g.g r0 = r0.j(r10, r11, r13)     // Catch: java.io.IOException -> L1d java.lang.Throwable -> L38
            if (r15 == 0) goto L37
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r2
            r3 = r4
            java.lang.String r5 = "get"
            r7 = 0
            r1 = r11
            r2 = r12
            r6 = r14
            r8 = r16
            com.ss.android.socialbase.downloader.tl.j.j(r0, r1, r2, r3, r5, r6, r7, r8)
        L37:
            return r0
        L38:
            r0 = move-exception
            r9 = r0
            goto L3c
        L3b:
            throw r1     // Catch: java.lang.Throwable -> L19
        L3c:
            if (r15 == 0) goto L4f
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r2
            java.lang.String r5 = "get"
            r3 = r0
            r0 = 0
            r1 = r11
            r2 = r12
            r6 = r14
            r8 = r16
            com.ss.android.socialbase.downloader.tl.j.j(r0, r1, r2, r3, r5, r6, r7, r8)
        L4f:
            throw r9
        L50:
            com.ss.android.socialbase.downloader.up.j r0 = new com.ss.android.socialbase.downloader.up.j
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "httpService not exist, netLib = "
            r2.<init>(r3)
            r2.append(r14)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            r2 = 1022(0x3fe, float:1.432E-42)
            r0.<init>(r2, r1)
            throw r0
    }

    public static com.ss.android.socialbase.downloader.g.g j(boolean r11, int r12, java.lang.String r13, java.lang.String r14, java.util.List<com.ss.android.socialbase.downloader.ae.up> r15, int r16, boolean r17, com.ss.android.socialbase.downloader.ae.cw r18) throws java.lang.Exception {
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 != 0) goto L1d
            if (r15 != 0) goto Le
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            goto Lf
        Le:
            r11 = r15
        Lf:
            com.ss.android.socialbase.downloader.ae.up r0 = new com.ss.android.socialbase.downloader.ae.up
            java.lang.String r1 = "ss_d_request_host_ip_114"
            r0.<init>(r1, r14)
            r11.add(r0)
            r0 = 1
            r4 = r11
            r11 = 1
            goto L25
        L1d:
            if (r11 != 0) goto L22
            r11 = 2
            r4 = r15
            goto L25
        L22:
            r4 = r15
            r11 = r16
        L25:
            int[] r11 = j(r11)
            int r8 = r11.length
            r9 = 0
            r0 = 0
            r0 = r9
            r10 = 0
        L2e:
            if (r10 >= r8) goto L69
            r5 = r11[r10]
            r1 = r12
            r2 = r13
            r3 = r14
            r6 = r17
            r7 = r18
            com.ss.android.socialbase.downloader.g.g r5 = j(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L40
            if (r5 == 0) goto L66
            return r5
        L40:
            r0 = move-exception
            boolean r1 = r18.ki()
            if (r1 == 0) goto L66
            boolean r1 = com.ss.android.socialbase.downloader.az.m.ae(r0)
            if (r1 == 0) goto L66
            boolean r1 = com.ss.android.socialbase.downloader.az.m.cw(r4)
            if (r1 != 0) goto L54
            goto L66
        L54:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "dcach::http exception 304, throw excepiton, not retry "
            r11.<init>(r12)
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            com.ss.android.socialbase.downloader.m.j.j(r11)
            throw r0
        L66:
            int r10 = r10 + 1
            goto L2e
        L69:
            if (r0 != 0) goto L6c
            return r9
        L6c:
            throw r0
    }

    public static com.ss.android.socialbase.downloader.g.g j(boolean r8, int r9, java.lang.String r10, java.util.List<com.ss.android.socialbase.downloader.ae.up> r11) throws java.lang.Exception {
            r6 = 0
            r7 = 0
            r3 = 0
            r5 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r4 = r11
            com.ss.android.socialbase.downloader.g.g r8 = j(r0, r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    public static java.util.concurrent.Future j(java.lang.Runnable r1, long r2, java.util.concurrent.TimeUnit r4) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            java.util.concurrent.ScheduledExecutorService r0 = mi()
            java.util.concurrent.ScheduledFuture r1 = r0.schedule(r1, r2, r4)
            return r1
    }

    public static synchronized void j() {
            java.lang.Class<com.ss.android.socialbase.downloader.downloader.cw> r0 = com.ss.android.socialbase.downloader.downloader.cw.class
            monitor-enter(r0)
            boolean r1 = com.ss.android.socialbase.downloader.downloader.cw.la     // Catch: java.lang.Throwable -> L3d
            if (r1 == 0) goto L9
            monitor-exit(r0)
            return
        L9:
            r1 = 1
            com.ss.android.socialbase.downloader.downloader.cw.la = r1     // Catch: java.lang.Throwable -> L3d
            android.content.Intent r2 = new android.content.Intent     // Catch: java.lang.Throwable -> L31
            android.content.Context r3 = nd()     // Catch: java.lang.Throwable -> L31
            java.lang.Class<com.ss.android.socialbase.downloader.impls.DownloadHandleService> r4 = com.ss.android.socialbase.downloader.impls.DownloadHandleService.class
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L31
            java.lang.String r3 = "com.ss.android.downloader.action.MULTI_PROCESS_NOTIFY"
            r2.setAction(r3)     // Catch: java.lang.Throwable -> L31
            android.content.Context r3 = nd()     // Catch: java.lang.Throwable -> L31
            r3.startService(r2)     // Catch: java.lang.Throwable -> L31
            boolean r2 = com.ss.android.socialbase.downloader.az.m.cw()     // Catch: java.lang.Throwable -> L31
            if (r2 != 0) goto L33
            com.ss.android.socialbase.downloader.downloader.az r1 = com.ss.android.socialbase.downloader.impls.vl.j(r1)     // Catch: java.lang.Throwable -> L31
            r1.startService()     // Catch: java.lang.Throwable -> L31
            goto L33
        L31:
            r1 = move-exception
            goto L35
        L33:
            monitor-exit(r0)
            return
        L35:
            r2 = 0
            com.ss.android.socialbase.downloader.downloader.cw.la = r2     // Catch: java.lang.Throwable -> L3d
            com.bytedance.sdk.component.utils.vl.j(r1)     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r0)
            return
        L3d:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3d
            throw r1
    }

    public static synchronized void j(android.content.Context r2) {
            java.lang.Class<com.ss.android.socialbase.downloader.downloader.cw> r0 = com.ss.android.socialbase.downloader.downloader.cw.class
            monitor-enter(r0)
            if (r2 == 0) goto L20
            android.content.Context r1 = com.ss.android.socialbase.downloader.downloader.cw.j     // Catch: java.lang.Throwable -> L1d
            if (r1 != 0) goto L20
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L1d
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)     // Catch: java.lang.Throwable -> L1d
            com.ss.android.socialbase.downloader.downloader.cw.j = r2     // Catch: java.lang.Throwable -> L1d
            com.ss.android.socialbase.downloader.j.j r2 = com.ss.android.socialbase.downloader.j.j.j()     // Catch: java.lang.Throwable -> L1d
            android.content.Context r1 = com.ss.android.socialbase.downloader.downloader.cw.j     // Catch: java.lang.Throwable -> L1d
            r2.j(r1)     // Catch: java.lang.Throwable -> L1d
            goto L20
        L1d:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r2
        L20:
            monitor-exit(r0)
            return
    }

    public static void j(com.ss.android.socialbase.downloader.ae.r r1, int r2) {
            java.util.List<java.lang.Object> r1 = com.ss.android.socialbase.downloader.downloader.cw.b
            monitor-enter(r1)
            java.util.Iterator r2 = r1.iterator()     // Catch: java.lang.Throwable -> L11
        L7:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L13
            r2.next()     // Catch: java.lang.Throwable -> L11
            goto L7
        L11:
            r2 = move-exception
            goto L15
        L13:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L11
            return
        L15:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L11
            throw r2
    }

    public static void j(com.ss.android.socialbase.downloader.downloader.cw.j r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "setIndependentServiceCreator::creator="
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "wjd"
            com.ss.android.socialbase.downloader.m.j.j(r1, r0)
            com.ss.android.socialbase.downloader.downloader.cw.g = r2
            return
    }

    private static void j(com.ss.android.socialbase.downloader.downloader.g r0) {
            if (r0 == 0) goto L4
            com.ss.android.socialbase.downloader.downloader.cw.x = r0
        L4:
            return
    }

    private static void j(com.ss.android.socialbase.downloader.downloader.jy r0) {
            if (r0 == 0) goto L4
            com.ss.android.socialbase.downloader.downloader.cw.cw = r0
        L4:
            return
    }

    public static void j(com.ss.android.socialbase.downloader.downloader.mi r0) {
            return
    }

    private static void j(com.ss.android.socialbase.downloader.downloader.oq r0) {
            if (r0 == 0) goto L4
            com.ss.android.socialbase.downloader.downloader.cw.r = r0
        L4:
            return
    }

    static synchronized void j(com.ss.android.socialbase.downloader.downloader.tl r3) {
            java.lang.Class<com.ss.android.socialbase.downloader.downloader.cw> r0 = com.ss.android.socialbase.downloader.downloader.cw.class
            monitor-enter(r0)
            boolean r1 = com.ss.android.socialbase.downloader.downloader.cw.xq     // Catch: java.lang.Throwable -> L10
            if (r1 == 0) goto L13
            java.lang.String r3 = "DownloadComponentManager"
            java.lang.String r1 = "component has init"
            com.ss.android.socialbase.downloader.m.j.up(r3, r1)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)
            return
        L10:
            r3 = move-exception
            goto Lbe
        L13:
            boolean r1 = com.ss.android.socialbase.downloader.downloader.cw.la     // Catch: java.lang.Throwable -> L10
            cw(r3)     // Catch: java.lang.Throwable -> L10
            com.ss.android.socialbase.downloader.downloader.vl r3 = com.ss.android.socialbase.downloader.downloader.cw.xt     // Catch: java.lang.Throwable -> L10
            if (r3 != 0) goto L23
            com.ss.android.socialbase.downloader.impls.r r3 = new com.ss.android.socialbase.downloader.impls.r     // Catch: java.lang.Throwable -> L10
            r3.<init>()     // Catch: java.lang.Throwable -> L10
            com.ss.android.socialbase.downloader.downloader.cw.xt = r3     // Catch: java.lang.Throwable -> L10
        L23:
            com.ss.android.socialbase.downloader.downloader.i r3 = com.ss.android.socialbase.downloader.downloader.cw.ae     // Catch: java.lang.Throwable -> L10
            if (r3 != 0) goto L2e
            com.ss.android.socialbase.downloader.impls.tl r3 = new com.ss.android.socialbase.downloader.impls.tl     // Catch: java.lang.Throwable -> L10
            r3.<init>()     // Catch: java.lang.Throwable -> L10
            com.ss.android.socialbase.downloader.downloader.cw.ae = r3     // Catch: java.lang.Throwable -> L10
        L2e:
            com.ss.android.socialbase.downloader.downloader.i r3 = com.ss.android.socialbase.downloader.downloader.cw.tl     // Catch: java.lang.Throwable -> L10
            if (r3 != 0) goto L3e
            com.ss.android.socialbase.downloader.downloader.cw$j r3 = com.ss.android.socialbase.downloader.downloader.cw.g     // Catch: java.lang.Throwable -> L10
            if (r3 == 0) goto L3e
            com.ss.android.socialbase.downloader.downloader.cw$j r3 = com.ss.android.socialbase.downloader.downloader.cw.g     // Catch: java.lang.Throwable -> L10
            com.ss.android.socialbase.downloader.downloader.i r3 = r3.j()     // Catch: java.lang.Throwable -> L10
            com.ss.android.socialbase.downloader.downloader.cw.tl = r3     // Catch: java.lang.Throwable -> L10
        L3e:
            com.ss.android.socialbase.downloader.downloader.jy r3 = com.ss.android.socialbase.downloader.downloader.cw.cw     // Catch: java.lang.Throwable -> L10
            if (r3 != 0) goto L49
            com.ss.android.socialbase.downloader.impls.g r3 = new com.ss.android.socialbase.downloader.impls.g     // Catch: java.lang.Throwable -> L10
            r3.<init>()     // Catch: java.lang.Throwable -> L10
            com.ss.android.socialbase.downloader.downloader.cw.cw = r3     // Catch: java.lang.Throwable -> L10
        L49:
            com.ss.android.socialbase.downloader.impls.j r3 = com.ss.android.socialbase.downloader.downloader.cw.m     // Catch: java.lang.Throwable -> L10
            if (r3 != 0) goto L54
            com.ss.android.socialbase.downloader.impls.up r3 = new com.ss.android.socialbase.downloader.impls.up     // Catch: java.lang.Throwable -> L10
            r3.<init>()     // Catch: java.lang.Throwable -> L10
            com.ss.android.socialbase.downloader.downloader.cw.m = r3     // Catch: java.lang.Throwable -> L10
        L54:
            com.ss.android.socialbase.downloader.downloader.oq r3 = com.ss.android.socialbase.downloader.downloader.cw.r     // Catch: java.lang.Throwable -> L10
            if (r3 != 0) goto L5f
            com.ss.android.socialbase.downloader.impls.cw r3 = new com.ss.android.socialbase.downloader.impls.cw     // Catch: java.lang.Throwable -> L10
            r3.<init>()     // Catch: java.lang.Throwable -> L10
            com.ss.android.socialbase.downloader.downloader.cw.r = r3     // Catch: java.lang.Throwable -> L10
        L5f:
            com.ss.android.socialbase.downloader.downloader.g r3 = com.ss.android.socialbase.downloader.downloader.cw.x     // Catch: java.lang.Throwable -> L10
            if (r3 != 0) goto L6a
            com.ss.android.socialbase.downloader.impls.xt r3 = new com.ss.android.socialbase.downloader.impls.xt     // Catch: java.lang.Throwable -> L10
            r3.<init>()     // Catch: java.lang.Throwable -> L10
            com.ss.android.socialbase.downloader.downloader.cw.x = r3     // Catch: java.lang.Throwable -> L10
        L6a:
            com.ss.android.socialbase.downloader.downloader.kt r3 = com.ss.android.socialbase.downloader.downloader.cw.s     // Catch: java.lang.Throwable -> L10
            if (r3 != 0) goto L75
            com.ss.android.socialbase.downloader.impls.oq r3 = new com.ss.android.socialbase.downloader.impls.oq     // Catch: java.lang.Throwable -> L10
            r3.<init>()     // Catch: java.lang.Throwable -> L10
            com.ss.android.socialbase.downloader.downloader.cw.s = r3     // Catch: java.lang.Throwable -> L10
        L75:
            int r3 = com.ss.android.socialbase.downloader.downloader.cw.gx     // Catch: java.lang.Throwable -> L10
            if (r3 <= 0) goto L7d
            int r2 = com.ss.android.socialbase.downloader.downloader.cw.n     // Catch: java.lang.Throwable -> L10
            if (r3 <= r2) goto L81
        L7d:
            int r3 = com.ss.android.socialbase.downloader.downloader.cw.n     // Catch: java.lang.Throwable -> L10
            com.ss.android.socialbase.downloader.downloader.cw.gx = r3     // Catch: java.lang.Throwable -> L10
        L81:
            e()     // Catch: java.lang.Throwable -> L10
            boolean r3 = com.ss.android.socialbase.downloader.downloader.cw.la     // Catch: java.lang.Throwable -> L10
            r2 = 1
            if (r3 == 0) goto L99
            if (r1 != 0) goto L99
            boolean r3 = com.ss.android.socialbase.downloader.az.m.cw()     // Catch: java.lang.Throwable -> L10
            if (r3 != 0) goto L99
            com.ss.android.socialbase.downloader.downloader.az r3 = com.ss.android.socialbase.downloader.impls.vl.j(r2)     // Catch: java.lang.Throwable -> L10
            r3.startService()     // Catch: java.lang.Throwable -> L10
            goto Lb7
        L99:
            boolean r3 = com.ss.android.socialbase.downloader.az.m.r()     // Catch: java.lang.Throwable -> L10
            if (r3 == 0) goto Lae
            java.util.concurrent.ExecutorService r3 = vl()     // Catch: java.lang.Throwable -> L10
            if (r3 == 0) goto Lb7
            com.ss.android.socialbase.downloader.downloader.cw$1 r1 = new com.ss.android.socialbase.downloader.downloader.cw$1     // Catch: java.lang.Throwable -> L10
            r1.<init>()     // Catch: java.lang.Throwable -> L10
            r3.execute(r1)     // Catch: java.lang.Throwable -> L10
            goto Lb7
        Lae:
            android.content.Context r3 = nd()     // Catch: java.lang.Throwable -> L10
            if (r3 == 0) goto Lb7
            com.ss.android.socialbase.downloader.az.m.r(r3)     // Catch: java.lang.Throwable -> L10
        Lb7:
            gq()     // Catch: java.lang.Throwable -> L10
            com.ss.android.socialbase.downloader.downloader.cw.xq = r2     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)
            return
        Lbe:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r3
    }

    private static void j(com.ss.android.socialbase.downloader.downloader.vl r0) {
            if (r0 == 0) goto L4
            com.ss.android.socialbase.downloader.downloader.cw.xt = r0
        L4:
            return
    }

    public static synchronized void j(com.ss.android.socialbase.downloader.downloader.ws r1) {
            java.lang.Class<com.ss.android.socialbase.downloader.downloader.cw> r0 = com.ss.android.socialbase.downloader.downloader.cw.class
            monitor-enter(r0)
            if (r1 == 0) goto L18
            com.ss.android.socialbase.downloader.downloader.cw.ws = r1     // Catch: java.lang.Throwable -> L15
            com.ss.android.socialbase.downloader.downloader.vl r1 = com.ss.android.socialbase.downloader.downloader.cw.xt     // Catch: java.lang.Throwable -> L15
            boolean r1 = r1 instanceof com.ss.android.socialbase.downloader.impls.r     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L18
            com.ss.android.socialbase.downloader.downloader.vl r1 = com.ss.android.socialbase.downloader.downloader.cw.xt     // Catch: java.lang.Throwable -> L15
            com.ss.android.socialbase.downloader.impls.r r1 = (com.ss.android.socialbase.downloader.impls.r) r1     // Catch: java.lang.Throwable -> L15
            r1.tl()     // Catch: java.lang.Throwable -> L15
            goto L18
        L15:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r1
        L18:
            monitor-exit(r0)
            return
    }

    public static void j(com.ss.android.socialbase.downloader.g.oq r0) {
            if (r0 == 0) goto L4
            com.ss.android.socialbase.downloader.downloader.cw.oq = r0
        L4:
            com.ss.android.socialbase.downloader.g.oq r0 = com.ss.android.socialbase.downloader.downloader.cw.oq
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            com.ss.android.socialbase.downloader.downloader.cw.z = r0
            return
    }

    public static void j(com.ss.android.socialbase.downloader.g.tl r0) {
            if (r0 == 0) goto L4
            com.ss.android.socialbase.downloader.downloader.cw.qv = r0
        L4:
            return
    }

    public static void j(com.ss.android.socialbase.downloader.r.la r0) {
            com.ss.android.socialbase.downloader.downloader.cw.p = r0
            com.ss.android.socialbase.downloader.jy.j.j()
            return
    }

    public static void j(com.ss.android.socialbase.downloader.r.n r2) {
            if (r2 != 0) goto L3
            return
        L3:
            java.util.List<com.ss.android.socialbase.downloader.r.n> r0 = com.ss.android.socialbase.downloader.downloader.cw.h
            monitor-enter(r0)
            java.util.List<com.ss.android.socialbase.downloader.r.n> r1 = com.ss.android.socialbase.downloader.downloader.cw.h     // Catch: java.lang.Throwable -> Ld
            r1.add(r2)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r2
    }

    public static void j(com.ss.android.socialbase.downloader.r.vl r2) {
            java.util.List<com.ss.android.socialbase.downloader.r.vl> r0 = com.ss.android.socialbase.downloader.downloader.cw.hl
            monitor-enter(r0)
            if (r2 == 0) goto L13
            boolean r1 = r0.contains(r2)     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto Lc
            goto L13
        Lc:
            r0.add(r2)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L11:
            r2 = move-exception
            goto L15
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r2
    }

    public static void j(com.ss.android.socialbase.downloader.r.wq r0) {
            if (r0 == 0) goto L4
            com.ss.android.socialbase.downloader.downloader.cw.up = r0
        L4:
            return
    }

    public static void j(com.ss.android.socialbase.downloader.tl.cw r0) {
            com.ss.android.socialbase.downloader.downloader.cw.sm = r0
            return
    }

    private static void j(com.ss.android.socialbase.downloader.tl.xt r0) {
            if (r0 == 0) goto L4
            com.ss.android.socialbase.downloader.downloader.cw.l = r0
        L4:
            return
    }

    public static void j(com.ss.android.socialbase.downloader.xt.r r4) {
            java.util.List<com.ss.android.socialbase.downloader.r.vl> r0 = com.ss.android.socialbase.downloader.downloader.cw.hl
            monitor-enter(r0)
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> L21
        L7:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L23
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L21
            com.ss.android.socialbase.downloader.r.vl r2 = (com.ss.android.socialbase.downloader.r.vl) r2     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L7
            com.ss.android.socialbase.downloader.xt.r r3 = com.ss.android.socialbase.downloader.xt.r.xt     // Catch: java.lang.Throwable -> L21
            if (r4 == r3) goto L7
            com.ss.android.socialbase.downloader.xt.r r3 = com.ss.android.socialbase.downloader.xt.r.cw     // Catch: java.lang.Throwable -> L21
            if (r4 != r3) goto L7
            r2.j()     // Catch: java.lang.Throwable -> L21
            goto L7
        L21:
            r4 = move-exception
            goto L2e
        L23:
            com.ss.android.socialbase.downloader.xt.r r1 = com.ss.android.socialbase.downloader.xt.r.cw     // Catch: java.lang.Throwable -> L21
            if (r4 != r1) goto L2c
            java.util.List<com.ss.android.socialbase.downloader.r.vl> r4 = com.ss.android.socialbase.downloader.downloader.cw.hl     // Catch: java.lang.Throwable -> L21
            r4.clear()     // Catch: java.lang.Throwable -> L21
        L2c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            return
        L2e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r4
    }

    public static void j(java.lang.Runnable r1) {
            r0 = 0
            j(r1, r0)
            return
    }

    public static void j(java.lang.Runnable r0, boolean r1) {
            if (r0 != 0) goto L3
            return
        L3:
            if (r1 == 0) goto Lf
            boolean r1 = com.ss.android.socialbase.downloader.az.m.r()
            if (r1 != 0) goto Lf
            r0.run()
            return
        Lf:
            java.util.concurrent.ExecutorService r1 = qv()
            r1.execute(r0)
            return
    }

    private static void j(java.util.List<com.ss.android.socialbase.downloader.r.ws> r2) {
            java.util.List<com.ss.android.socialbase.downloader.r.ws> r0 = com.ss.android.socialbase.downloader.downloader.cw.ed
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L11
            monitor-enter(r0)
            r0.addAll(r2)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return
        Le:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r2
        L11:
            return
    }

    public static void j(java.util.concurrent.ExecutorService r0) {
            if (r0 == 0) goto L4
            com.ss.android.socialbase.downloader.downloader.cw.tj = r0
        L4:
            return
    }

    public static void j(boolean r0) {
            com.ss.android.socialbase.downloader.downloader.cw.qb = r0
            return
    }

    private static int[] j(int r3) {
            r0 = 0
            r1 = 1
            if (r3 == r1) goto L19
            r2 = 2
            if (r3 == r2) goto L14
            r2 = 3
            if (r3 == r2) goto Lf
            int[] r3 = new int[]{r1, r0}
            return r3
        Lf:
            int[] r3 = new int[]{r0, r1}
            return r3
        L14:
            int[] r3 = new int[]{r1}
            return r3
        L19:
            int[] r3 = new int[]{r0}
            return r3
    }

    public static java.util.concurrent.ExecutorService jy() {
            java.util.concurrent.ExecutorService r0 = com.ss.android.socialbase.downloader.downloader.cw.w
            if (r0 == 0) goto L7
            java.util.concurrent.ExecutorService r0 = com.ss.android.socialbase.downloader.downloader.cw.w
            return r0
        L7:
            java.util.concurrent.ExecutorService r0 = az()
            return r0
    }

    public static okhttp3.OkHttpClient.Builder kt() {
            okhttp3.OkHttpClient$Builder r0 = new okhttp3.OkHttpClient$Builder
            r0.<init>()
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            r2 = 30000(0x7530, double:1.4822E-319)
            okhttp3.OkHttpClient$Builder r4 = r0.connectTimeout(r2, r1)
            okhttp3.OkHttpClient$Builder r4 = r4.readTimeout(r2, r1)
            okhttp3.OkHttpClient$Builder r1 = r4.writeTimeout(r2, r1)
            r2 = 1
            okhttp3.OkHttpClient$Builder r1 = r1.retryOnConnectionFailure(r2)
            okhttp3.OkHttpClient$Builder r1 = r1.followRedirects(r2)
            okhttp3.Protocol r2 = okhttp3.Protocol.HTTP_1_1
            java.util.List r2 = java.util.Collections.singletonList(r2)
            r1.protocols(r2)
            java.util.concurrent.ExecutorService r1 = com.ss.android.socialbase.downloader.downloader.cw.f
            if (r1 == 0) goto L35
            okhttp3.Dispatcher r1 = new okhttp3.Dispatcher
            java.util.concurrent.ExecutorService r2 = com.ss.android.socialbase.downloader.downloader.cw.f
            r1.<init>(r2)
            r0.dispatcher(r1)
        L35:
            return r0
    }

    public static com.ss.android.socialbase.downloader.downloader.jy l() {
            com.ss.android.socialbase.downloader.downloader.jy r0 = com.ss.android.socialbase.downloader.downloader.cw.cw
            if (r0 != 0) goto L19
            java.lang.Class<com.ss.android.socialbase.downloader.downloader.cw> r0 = com.ss.android.socialbase.downloader.downloader.cw.class
            monitor-enter(r0)
            com.ss.android.socialbase.downloader.downloader.jy r1 = com.ss.android.socialbase.downloader.downloader.cw.cw     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.ss.android.socialbase.downloader.impls.g r1 = new com.ss.android.socialbase.downloader.impls.g     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.ss.android.socialbase.downloader.downloader.cw.cw = r1     // Catch: java.lang.Throwable -> L13
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
            com.ss.android.socialbase.downloader.downloader.jy r0 = com.ss.android.socialbase.downloader.downloader.cw.cw
            return r0
    }

    @androidx.annotation.NonNull
    public static org.json.JSONObject la() {
            com.ss.android.socialbase.downloader.r.la r0 = com.ss.android.socialbase.downloader.downloader.cw.p
            if (r0 == 0) goto L14
            com.ss.android.socialbase.downloader.r.la r0 = com.ss.android.socialbase.downloader.downloader.cw.p
            org.json.JSONObject r0 = r0.j()
            if (r0 != 0) goto Ld
            goto L14
        Ld:
            com.ss.android.socialbase.downloader.r.la r0 = com.ss.android.socialbase.downloader.downloader.cw.p
            org.json.JSONObject r0 = r0.j()
            return r0
        L14:
            org.json.JSONObject r0 = com.ss.android.socialbase.downloader.xt.up.g
            return r0
    }

    public static com.ss.android.socialbase.downloader.tl.xt m() {
            com.ss.android.socialbase.downloader.tl.xt r0 = com.ss.android.socialbase.downloader.downloader.cw.l
            return r0
    }

    private static void m(java.util.concurrent.ExecutorService r0) {
            if (r0 == 0) goto L4
            com.ss.android.socialbase.downloader.downloader.cw.w = r0
        L4:
            return
    }

    public static java.util.concurrent.ScheduledExecutorService mi() {
            java.util.concurrent.ScheduledExecutorService r0 = com.ss.android.socialbase.downloader.downloader.cw.v
            if (r0 != 0) goto L21
            java.lang.Class<com.ss.android.socialbase.downloader.downloader.cw> r0 = com.ss.android.socialbase.downloader.downloader.cw.class
            monitor-enter(r0)
            java.util.concurrent.ScheduledExecutorService r1 = com.ss.android.socialbase.downloader.downloader.cw.v     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto L1d
            com.bytedance.sdk.component.oq.r.up r1 = new com.bytedance.sdk.component.oq.r.up     // Catch: java.lang.Throwable -> L1b
            com.ss.android.socialbase.downloader.ws.j r2 = new com.ss.android.socialbase.downloader.ws.j     // Catch: java.lang.Throwable -> L1b
            java.lang.String r3 = "DownloadThreadPool-Schedule"
            r4 = 1
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L1b
            r1.<init>(r4, r2)     // Catch: java.lang.Throwable -> L1b
            com.ss.android.socialbase.downloader.downloader.cw.v = r1     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r1 = move-exception
            goto L1f
        L1d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            goto L21
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r1
        L21:
            java.util.concurrent.ScheduledExecutorService r0 = com.ss.android.socialbase.downloader.downloader.cw.v
            return r0
    }

    public static com.ss.android.socialbase.downloader.downloader.f n() {
            com.ss.android.socialbase.downloader.downloader.f r0 = com.ss.android.socialbase.downloader.downloader.cw.uf
            if (r0 != 0) goto L19
            java.lang.Class<com.ss.android.socialbase.downloader.downloader.cw> r0 = com.ss.android.socialbase.downloader.downloader.cw.class
            monitor-enter(r0)
            com.ss.android.socialbase.downloader.downloader.f r1 = com.ss.android.socialbase.downloader.downloader.cw.uf     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.ss.android.socialbase.downloader.downloader.f$j r1 = new com.ss.android.socialbase.downloader.downloader.f$j     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.ss.android.socialbase.downloader.downloader.cw.uf = r1     // Catch: java.lang.Throwable -> L13
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
            com.ss.android.socialbase.downloader.downloader.f r0 = com.ss.android.socialbase.downloader.downloader.cw.uf
            return r0
    }

    public static synchronized android.content.Context nd() {
            java.lang.Class<com.ss.android.socialbase.downloader.downloader.cw> r0 = com.ss.android.socialbase.downloader.downloader.cw.class
            monitor-enter(r0)
            android.content.Context r1 = com.ss.android.socialbase.downloader.downloader.cw.j     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    @androidx.annotation.NonNull
    public static com.ss.android.socialbase.downloader.tl.cw ol() {
            com.ss.android.socialbase.downloader.tl.cw r0 = com.ss.android.socialbase.downloader.downloader.cw.sm
            if (r0 != 0) goto Lb
            com.ss.android.socialbase.downloader.downloader.cw$3 r0 = new com.ss.android.socialbase.downloader.downloader.cw$3
            r0.<init>()
            com.ss.android.socialbase.downloader.downloader.cw.sm = r0
        Lb:
            com.ss.android.socialbase.downloader.tl.cw r0 = com.ss.android.socialbase.downloader.downloader.cw.sm
            return r0
    }

    public static synchronized com.ss.android.socialbase.downloader.downloader.w oq() {
            java.lang.Class<com.ss.android.socialbase.downloader.downloader.cw> r0 = com.ss.android.socialbase.downloader.downloader.cw.class
            monitor-enter(r0)
            com.ss.android.socialbase.downloader.downloader.w r1 = com.ss.android.socialbase.downloader.downloader.cw.a     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public static com.ss.android.socialbase.downloader.impls.j p() {
            com.ss.android.socialbase.downloader.impls.j r0 = com.ss.android.socialbase.downloader.downloader.cw.m
            if (r0 != 0) goto L19
            java.lang.Class<com.ss.android.socialbase.downloader.downloader.cw> r0 = com.ss.android.socialbase.downloader.downloader.cw.class
            monitor-enter(r0)
            com.ss.android.socialbase.downloader.impls.j r1 = com.ss.android.socialbase.downloader.downloader.cw.m     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.ss.android.socialbase.downloader.impls.up r1 = new com.ss.android.socialbase.downloader.impls.up     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.ss.android.socialbase.downloader.downloader.cw.m = r1     // Catch: java.lang.Throwable -> L13
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
            com.ss.android.socialbase.downloader.impls.j r0 = com.ss.android.socialbase.downloader.downloader.cw.m
            return r0
    }

    public static java.util.concurrent.ExecutorService qv() {
            java.util.concurrent.ExecutorService r0 = com.ss.android.socialbase.downloader.downloader.cw.az
            if (r0 != 0) goto L35
            java.lang.Class<com.ss.android.socialbase.downloader.downloader.cw> r1 = com.ss.android.socialbase.downloader.downloader.cw.class
            monitor-enter(r1)
            java.util.concurrent.ExecutorService r0 = com.ss.android.socialbase.downloader.downloader.cw.az     // Catch: java.lang.Throwable -> L2f
            if (r0 != 0) goto L31
            com.bytedance.sdk.component.oq.r.r r2 = new com.bytedance.sdk.component.oq.r.r     // Catch: java.lang.Throwable -> L2f
            int r3 = com.ss.android.socialbase.downloader.downloader.cw.n     // Catch: java.lang.Throwable -> L2f
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L2f
            java.util.concurrent.LinkedBlockingQueue r8 = new java.util.concurrent.LinkedBlockingQueue     // Catch: java.lang.Throwable -> L2f
            r8.<init>()     // Catch: java.lang.Throwable -> L2f
            com.ss.android.socialbase.downloader.ws.j r9 = new com.ss.android.socialbase.downloader.ws.j     // Catch: java.lang.Throwable -> L2f
            java.lang.String r0 = "DownloadThreadPool-cpu-fixed"
            r10 = 1
            r9.<init>(r0, r10)     // Catch: java.lang.Throwable -> L2f
            r5 = 15
            r4 = r3
            r2.<init>(r3, r4, r5, r7, r8, r9)     // Catch: java.lang.Throwable -> L2f
            r2.allowCoreThreadTimeOut(r10)     // Catch: java.lang.Throwable -> L28
            goto L2c
        L28:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)     // Catch: java.lang.Throwable -> L2f
        L2c:
            com.ss.android.socialbase.downloader.downloader.cw.az = r2     // Catch: java.lang.Throwable -> L2f
            goto L31
        L2f:
            r0 = move-exception
            goto L33
        L31:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2f
            goto L35
        L33:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2f
            throw r0
        L35:
            java.util.concurrent.ExecutorService r0 = com.ss.android.socialbase.downloader.downloader.cw.az
            return r0
    }

    public static java.util.List<com.ss.android.socialbase.downloader.r.n> r() {
            java.util.List<com.ss.android.socialbase.downloader.r.n> r0 = com.ss.android.socialbase.downloader.downloader.cw.h
            monitor-enter(r0)
            java.util.List<com.ss.android.socialbase.downloader.r.n> r1 = com.ss.android.socialbase.downloader.downloader.cw.h     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    private static void r(java.util.concurrent.ExecutorService r0) {
            if (r0 == 0) goto L4
            com.ss.android.socialbase.downloader.downloader.cw.av = r0
        L4:
            return
    }

    public static synchronized boolean rh() {
            java.lang.Class<com.ss.android.socialbase.downloader.downloader.cw> r0 = com.ss.android.socialbase.downloader.downloader.cw.class
            monitor-enter(r0)
            boolean r1 = com.ss.android.socialbase.downloader.downloader.cw.z     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public static boolean rn() {
            boolean r0 = com.ss.android.socialbase.downloader.downloader.cw.f1q
            return r0
    }

    public static com.ss.android.socialbase.downloader.downloader.i s() {
            com.ss.android.socialbase.downloader.downloader.i r0 = com.ss.android.socialbase.downloader.downloader.cw.tl
            if (r0 != 0) goto L1a
            java.lang.Class<com.ss.android.socialbase.downloader.downloader.cw> r0 = com.ss.android.socialbase.downloader.downloader.cw.class
            monitor-enter(r0)
            com.ss.android.socialbase.downloader.downloader.i r1 = com.ss.android.socialbase.downloader.downloader.cw.tl     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L16
            com.ss.android.socialbase.downloader.downloader.cw$j r1 = com.ss.android.socialbase.downloader.downloader.cw.g     // Catch: java.lang.Throwable -> L14
            com.ss.android.socialbase.downloader.downloader.i r1 = r1.j()     // Catch: java.lang.Throwable -> L14
            com.ss.android.socialbase.downloader.downloader.cw.tl = r1     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            r1 = move-exception
            goto L18
        L16:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            goto L1a
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r1
        L1a:
            com.ss.android.socialbase.downloader.downloader.i r0 = com.ss.android.socialbase.downloader.downloader.cw.tl
            return r0
    }

    public static com.ss.android.socialbase.downloader.g.m tj() {
            com.ss.android.socialbase.downloader.g.m r0 = com.ss.android.socialbase.downloader.downloader.cw.rn
            return r0
    }

    public static com.ss.android.socialbase.downloader.g.tl tl() {
            com.ss.android.socialbase.downloader.g.tl r0 = com.ss.android.socialbase.downloader.downloader.cw.jy
            if (r0 != 0) goto L19
            java.lang.Class<com.ss.android.socialbase.downloader.downloader.cw> r0 = com.ss.android.socialbase.downloader.downloader.cw.class
            monitor-enter(r0)
            com.ss.android.socialbase.downloader.g.tl r1 = com.ss.android.socialbase.downloader.downloader.cw.jy     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.ss.android.socialbase.downloader.impls.m r1 = new com.ss.android.socialbase.downloader.impls.m     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.ss.android.socialbase.downloader.downloader.cw.jy = r1     // Catch: java.lang.Throwable -> L13
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
            com.ss.android.socialbase.downloader.g.tl r0 = com.ss.android.socialbase.downloader.downloader.cw.jy
            return r0
    }

    private static void tl(java.util.concurrent.ExecutorService r0) {
            if (r0 == 0) goto L4
            com.ss.android.socialbase.downloader.downloader.cw.kt = r0
        L4:
            return
    }

    public static com.ss.android.socialbase.downloader.downloader.oq uf() {
            com.ss.android.socialbase.downloader.downloader.oq r0 = com.ss.android.socialbase.downloader.downloader.cw.r
            if (r0 != 0) goto L19
            java.lang.Class<com.ss.android.socialbase.downloader.downloader.cw> r0 = com.ss.android.socialbase.downloader.downloader.cw.class
            monitor-enter(r0)
            com.ss.android.socialbase.downloader.downloader.oq r1 = com.ss.android.socialbase.downloader.downloader.cw.r     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.ss.android.socialbase.downloader.impls.cw r1 = new com.ss.android.socialbase.downloader.impls.cw     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.ss.android.socialbase.downloader.downloader.cw.r = r1     // Catch: java.lang.Throwable -> L13
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
            com.ss.android.socialbase.downloader.downloader.oq r0 = com.ss.android.socialbase.downloader.downloader.cw.r
            return r0
    }

    public static com.ss.android.socialbase.downloader.g.tl up() {
            com.ss.android.socialbase.downloader.g.tl r0 = com.ss.android.socialbase.downloader.downloader.cw.qv
            return r0
    }

    private static void up(java.util.concurrent.ExecutorService r0) {
            if (r0 == 0) goto L4
            com.ss.android.socialbase.downloader.downloader.cw.i = r0
        L4:
            return
    }

    public static synchronized com.ss.android.socialbase.downloader.downloader.ws v() {
            java.lang.Class<com.ss.android.socialbase.downloader.downloader.cw> r0 = com.ss.android.socialbase.downloader.downloader.cw.class
            monitor-enter(r0)
            com.ss.android.socialbase.downloader.downloader.ws r1 = com.ss.android.socialbase.downloader.downloader.cw.ws     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public static java.util.concurrent.ExecutorService vl() {
            java.util.concurrent.ExecutorService r0 = com.ss.android.socialbase.downloader.downloader.cw.av
            if (r0 == 0) goto L7
            java.util.concurrent.ExecutorService r0 = com.ss.android.socialbase.downloader.downloader.cw.av
            return r0
        L7:
            java.util.concurrent.ExecutorService r0 = qv()
            return r0
    }

    public static okhttp3.OkHttpClient w() {
            okhttp3.OkHttpClient r0 = com.ss.android.socialbase.downloader.downloader.cw.gq
            if (r0 != 0) goto L1c
            java.lang.Class<com.ss.android.socialbase.downloader.downloader.cw> r0 = com.ss.android.socialbase.downloader.downloader.cw.class
            monitor-enter(r0)
            okhttp3.OkHttpClient r1 = com.ss.android.socialbase.downloader.downloader.cw.gq     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L18
            okhttp3.OkHttpClient$Builder r1 = kt()     // Catch: java.lang.Throwable -> L16
            okhttp3.OkHttpClient r1 = r1.build()     // Catch: java.lang.Throwable -> L16
            com.ss.android.socialbase.downloader.downloader.cw.gq = r1     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r1 = move-exception
            goto L1a
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            goto L1c
        L1a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r1
        L1c:
            okhttp3.OkHttpClient r0 = com.ss.android.socialbase.downloader.downloader.cw.gq
            return r0
    }

    public static synchronized int wq() {
            java.lang.Class<com.ss.android.socialbase.downloader.downloader.cw> r0 = com.ss.android.socialbase.downloader.downloader.cw.class
            monitor-enter(r0)
            int r1 = com.ss.android.socialbase.downloader.downloader.cw.hh     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public static java.util.concurrent.ExecutorService ws() {
            java.util.concurrent.ExecutorService r0 = com.ss.android.socialbase.downloader.downloader.cw.mi
            if (r0 == 0) goto L7
            java.util.concurrent.ExecutorService r0 = com.ss.android.socialbase.downloader.downloader.cw.mi
            return r0
        L7:
            java.util.concurrent.ExecutorService r0 = az()
            return r0
    }

    public static com.ss.android.socialbase.downloader.downloader.vl x() {
            com.ss.android.socialbase.downloader.downloader.vl r0 = com.ss.android.socialbase.downloader.downloader.cw.xt
            if (r0 != 0) goto L19
            java.lang.Class<com.ss.android.socialbase.downloader.downloader.cw> r0 = com.ss.android.socialbase.downloader.downloader.cw.class
            monitor-enter(r0)
            com.ss.android.socialbase.downloader.downloader.vl r1 = com.ss.android.socialbase.downloader.downloader.cw.xt     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.ss.android.socialbase.downloader.impls.r r1 = new com.ss.android.socialbase.downloader.impls.r     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.ss.android.socialbase.downloader.downloader.cw.xt = r1     // Catch: java.lang.Throwable -> L13
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
            com.ss.android.socialbase.downloader.downloader.vl r0 = com.ss.android.socialbase.downloader.downloader.cw.xt
            return r0
    }

    private static com.ss.android.socialbase.downloader.g.ae xt(java.lang.String r10, java.util.List<com.ss.android.socialbase.downloader.ae.up> r11, int r12, boolean r13, com.ss.android.socialbase.downloader.ae.cw r14) throws com.ss.android.socialbase.downloader.up.j, java.io.IOException {
            r0 = 1
            if (r12 != r0) goto L8
            com.ss.android.socialbase.downloader.g.tl r0 = up()
            goto Lc
        L8:
            com.ss.android.socialbase.downloader.g.tl r0 = tl()
        Lc:
            if (r0 == 0) goto L4f
            r1 = 0
            r2 = 0
            if (r13 == 0) goto L17
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1d
        L17:
            r5 = r1
            goto L20
        L19:
            r0 = move-exception
            r9 = r0
            r7 = r1
            goto L3c
        L1d:
            r0 = move-exception
            r1 = r0
            goto L3b
        L20:
            com.ss.android.socialbase.downloader.g.ae r0 = r0.j(r10, r11)     // Catch: java.io.IOException -> L1d java.lang.Throwable -> L37
            if (r13 == 0) goto L36
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r2
            r3 = r4
            java.lang.String r5 = "head"
            r7 = 0
            r2 = 0
            r1 = r10
            r6 = r12
            r8 = r14
            com.ss.android.socialbase.downloader.tl.j.j(r0, r1, r2, r3, r5, r6, r7, r8)
        L36:
            return r0
        L37:
            r0 = move-exception
            r9 = r0
            r7 = r5
            goto L3c
        L3b:
            throw r1     // Catch: java.lang.Throwable -> L19
        L3c:
            if (r13 == 0) goto L4e
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r2
            java.lang.String r5 = "head"
            r3 = r0
            r0 = 0
            r2 = 0
            r1 = r10
            r6 = r12
            r8 = r14
            com.ss.android.socialbase.downloader.tl.j.j(r0, r1, r2, r3, r5, r6, r7, r8)
        L4e:
            throw r9
        L4f:
            com.ss.android.socialbase.downloader.up.j r0 = new com.ss.android.socialbase.downloader.up.j
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "httpService not exist, netLib = "
            r2.<init>(r3)
            r2.append(r12)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            r2 = 1022(0x3fe, float:1.432E-42)
            r0.<init>(r2, r1)
            throw r0
    }

    private static void xt(int r0) {
            if (r0 <= 0) goto L4
            com.ss.android.socialbase.downloader.downloader.cw.gx = r0
        L4:
            return
    }

    public static void xt(com.ss.android.socialbase.downloader.ae.r r1, int r2) {
            java.util.List<java.lang.Object> r1 = com.ss.android.socialbase.downloader.downloader.cw.b
            monitor-enter(r1)
            java.util.Iterator r2 = r1.iterator()     // Catch: java.lang.Throwable -> L11
        L7:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L13
            r2.next()     // Catch: java.lang.Throwable -> L11
            goto L7
        L11:
            r2 = move-exception
            goto L15
        L13:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L11
            return
        L15:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L11
            throw r2
    }

    static synchronized void xt(com.ss.android.socialbase.downloader.downloader.tl r1) {
            java.lang.Class<com.ss.android.socialbase.downloader.downloader.cw> r0 = com.ss.android.socialbase.downloader.downloader.cw.class
            monitor-enter(r0)
            cw(r1)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r0)
            return
        L8:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            throw r1
    }

    public static void xt(java.lang.Runnable r1) {
            r0 = 0
            xt(r1, r0)
            return
    }

    public static void xt(java.lang.Runnable r0, boolean r1) {
            if (r0 != 0) goto L3
            return
        L3:
            if (r1 == 0) goto Lf
            boolean r1 = com.ss.android.socialbase.downloader.az.m.r()
            if (r1 != 0) goto Lf
            r0.run()
            return
        Lf:
            java.util.concurrent.ExecutorService r1 = vl()
            r1.execute(r0)
            return
    }

    public static void xt(java.util.concurrent.ExecutorService r0) {
            if (r0 == 0) goto L4
            com.ss.android.socialbase.downloader.downloader.cw.f = r0
        L4:
            return
    }

    private static void xt(boolean r0) {
            com.ss.android.socialbase.downloader.downloader.cw.f1q = r0
            return
    }

    public static synchronized boolean xt() {
            java.lang.Class<com.ss.android.socialbase.downloader.downloader.cw> r0 = com.ss.android.socialbase.downloader.downloader.cw.class
            monitor-enter(r0)
            boolean r1 = com.ss.android.socialbase.downloader.downloader.cw.la     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public static boolean z() {
            boolean r0 = com.ss.android.socialbase.downloader.downloader.cw.xq
            return r0
    }
}
