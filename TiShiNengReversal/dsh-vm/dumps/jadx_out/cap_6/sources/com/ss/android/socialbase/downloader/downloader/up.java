package com.ss.android.socialbase.downloader.downloader;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class up {
    private static java.lang.String xt = "ResponseHandler";
    private long a;
    private com.ss.android.socialbase.downloader.downloader.vl ae;
    private long av;
    private long az;
    private final boolean ch;
    private final com.ss.android.socialbase.downloader.ae.cw cw;
    private final boolean f;
    private com.ss.android.socialbase.downloader.downloader.tj g;
    private volatile long gq;
    private long h;
    private volatile long i;
    boolean j;
    private volatile boolean jy;
    private final com.ss.android.socialbase.downloader.jy.j kt;
    private long l;
    private volatile long la;
    private final com.ss.android.socialbase.downloader.g.g m;
    private final boolean mi;
    private com.ss.android.socialbase.downloader.ae.ae oq;
    private long p;
    private com.ss.android.socialbase.downloader.up.j qv;
    private final java.lang.String r;
    private boolean s;
    private final com.ss.android.socialbase.downloader.j.j tj;
    private com.ss.android.socialbase.downloader.impls.qv tl;
    private final com.ss.android.socialbase.downloader.ae.xt up;
    private final long v;
    private volatile boolean vl;
    private volatile long w;
    private final com.ss.android.socialbase.downloader.ws.m ws;
    private final long x;


    static {
            return
    }

    public up(com.ss.android.socialbase.downloader.ae.cw r6, java.lang.String r7, com.ss.android.socialbase.downloader.g.g r8, com.ss.android.socialbase.downloader.ae.xt r9, com.ss.android.socialbase.downloader.ws.m r10) {
            r5 = this;
            r5.<init>()
            r0 = 0
            r5.j = r0
            r1 = 0
            r5.la = r1
            r5.gq = r1
            r5.cw = r6
            r5.r = r7
            com.ss.android.socialbase.downloader.downloader.vl r7 = com.ss.android.socialbase.downloader.downloader.cw.x()
            r5.ae = r7
            boolean r3 = r7 instanceof com.ss.android.socialbase.downloader.impls.r
            if (r3 == 0) goto L28
            com.ss.android.socialbase.downloader.impls.r r7 = (com.ss.android.socialbase.downloader.impls.r) r7
            com.ss.android.socialbase.downloader.impls.qv r3 = r7.j()
            r5.tl = r3
            com.ss.android.socialbase.downloader.downloader.tj r7 = r7.m()
            r5.g = r7
        L28:
            r5.m = r8
            r5.up = r9
            r5.ws = r10
            long r7 = r9.ws()
            r5.az = r7
            r5.av = r7
            boolean r7 = r9.r()
            if (r7 == 0) goto L43
            long r7 = r9.i()
            r5.w = r7
            goto L49
        L43:
            long r7 = r9.cw(r0)
            r5.w = r7
        L49:
            long r7 = r9.av()
            r5.i = r7
            com.ss.android.socialbase.downloader.j.j r7 = com.ss.android.socialbase.downloader.j.j.j()
            r5.tj = r7
            int r6 = r6.ae()
            com.ss.android.socialbase.downloader.jy.j r6 = com.ss.android.socialbase.downloader.jy.j.j(r6)
            r5.kt = r6
            java.lang.String r7 = "sync_strategy"
            int r7 = r6.j(r7, r0)
            r8 = 1
            if (r7 != r8) goto L6a
            r7 = 1
            goto L6b
        L6a:
            r7 = 0
        L6b:
            r5.f = r7
            if (r7 == 0) goto L90
            java.lang.String r7 = "sync_interval_ms_fg"
            r9 = 5000(0x1388, float:7.006E-42)
            int r7 = r6.j(r7, r9)
            long r9 = (long) r7
            java.lang.String r7 = "sync_interval_ms_bg"
            r1 = 1000(0x3e8, float:1.401E-42)
            int r7 = r6.j(r7, r1)
            long r1 = (long) r7
            r3 = 500(0x1f4, double:2.47E-321)
            long r9 = java.lang.Math.max(r9, r3)
            r5.v = r9
            long r9 = java.lang.Math.max(r1, r3)
            r5.x = r9
            goto L94
        L90:
            r5.v = r1
            r5.x = r1
        L94:
            java.lang.String r7 = "monitor_rw"
            int r6 = r6.xt(r7)
            if (r6 != r8) goto L9d
            r0 = 1
        L9d:
            r5.ch = r0
            r6 = 65536(0x10000, float:9.1835E-41)
            boolean r6 = com.ss.android.socialbase.downloader.az.j.j(r6)
            r5.mi = r6
            return
    }

    private void ae() {
            r2 = this;
            com.ss.android.socialbase.downloader.g.g r0 = r2.m
            if (r0 != 0) goto L5
            goto L13
        L5:
            java.util.concurrent.ExecutorService r0 = com.ss.android.socialbase.downloader.downloader.cw.qv()
            if (r0 == 0) goto L13
            com.ss.android.socialbase.downloader.downloader.up$1 r1 = new com.ss.android.socialbase.downloader.downloader.up$1
            r1.<init>(r2)
            r0.execute(r1)
        L13:
            return
    }

    static /* synthetic */ com.ss.android.socialbase.downloader.g.g j(com.ss.android.socialbase.downloader.downloader.up r0) {
            com.ss.android.socialbase.downloader.g.g r0 = r0.m
            return r0
    }

    private com.ss.android.socialbase.downloader.oq.xt j(java.io.InputStream r9) {
            r8 = this;
            int r0 = com.ss.android.socialbase.downloader.downloader.cw.wq()
            com.ss.android.socialbase.downloader.jy.j r1 = r8.kt
            java.lang.String r2 = "rw_concurrent"
            r3 = 0
            int r1 = r1.j(r2, r3)
            r2 = 1
            if (r1 != r2) goto L3a
            com.ss.android.socialbase.downloader.ae.cw r1 = r8.cw
            int r1 = r1.kj()
            if (r1 != r2) goto L3a
            com.ss.android.socialbase.downloader.ae.cw r1 = r8.cw
            long r4 = r1.ka()
            r6 = 20971520(0x1400000, double:1.03613076E-316)
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 <= 0) goto L3a
            com.ss.android.socialbase.downloader.jy.j r1 = r8.kt
            java.lang.String r4 = "rw_concurrent_max_buffer_count"
            r5 = 4
            int r1 = r1.j(r4, r5)
            com.ss.android.socialbase.downloader.oq.j r4 = new com.ss.android.socialbase.downloader.oq.j     // Catch: java.lang.Throwable -> L36
            r4.<init>(r9, r0, r1)     // Catch: java.lang.Throwable -> L36
            r8.s = r2     // Catch: java.lang.Throwable -> L36
            return r4
        L36:
            r1 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r1)
        L3a:
            com.ss.android.socialbase.downloader.oq.cw r1 = new com.ss.android.socialbase.downloader.oq.cw
            r1.<init>(r9, r0)
            r8.s = r3
            return r1
    }

    private void j(com.ss.android.socialbase.downloader.downloader.vl r10) {
            r9 = this;
            if (r10 != 0) goto L4
            goto Ldb
        L4:
            boolean r0 = r10 instanceof com.ss.android.socialbase.downloader.cw.up
            if (r0 == 0) goto L16
            boolean r1 = com.ss.android.socialbase.downloader.az.m.xt()
            com.ss.android.socialbase.downloader.downloader.az r1 = com.ss.android.socialbase.downloader.impls.vl.j(r1)
            if (r1 != 0) goto L14
            goto Ldb
        L14:
            r2 = r1
            goto L18
        L16:
            r1 = 0
            goto L14
        L18:
            com.ss.android.socialbase.downloader.ae.xt r1 = r9.up
            boolean r1 = r1.r()
            if (r1 == 0) goto L27
            com.ss.android.socialbase.downloader.ae.xt r1 = r9.up
            com.ss.android.socialbase.downloader.ae.xt r1 = r1.up()
            goto L29
        L27:
            com.ss.android.socialbase.downloader.ae.xt r1 = r9.up
        L29:
            if (r1 == 0) goto Lab
            long r3 = r9.az
            r1.xt(r3)
            if (r0 == 0) goto L47
            if (r2 == 0) goto L47
            int r3 = r1.qv()
            int r4 = r1.mi()
            int r5 = r1.xt()
            long r6 = r9.az
            r2.j(r3, r4, r5, r6)
            r3 = r10
            goto L59
        L47:
            int r4 = r1.qv()
            int r5 = r1.mi()
            int r6 = r1.xt()
            long r7 = r9.az
            r3 = r10
            r3.j(r4, r5, r6, r7)
        L59:
            boolean r10 = r1.tl()
            if (r10 == 0) goto Ldb
            boolean r10 = r1.g()
            if (r10 == 0) goto L8b
            long r4 = r1.oq()
            long r6 = r9.az
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 <= 0) goto L8b
            if (r0 == 0) goto L7f
            if (r2 == 0) goto L7f
            int r10 = r1.qv()
            int r0 = r1.xt()
            r2.j(r10, r0, r4)
            goto L8a
        L7f:
            int r10 = r1.qv()
            int r0 = r1.xt()
            r3.j(r10, r0, r4)
        L8a:
            return
        L8b:
            if (r0 == 0) goto L9d
            if (r2 == 0) goto L9d
            int r10 = r1.qv()
            int r0 = r1.xt()
            long r3 = r9.az
            r2.j(r10, r0, r3)
            return
        L9d:
            int r10 = r1.qv()
            int r0 = r1.xt()
            long r1 = r9.az
            r3.j(r10, r0, r1)
            return
        Lab:
            r3 = r10
            com.ss.android.socialbase.downloader.ae.xt r10 = r9.up
            boolean r10 = r10.r()
            if (r10 == 0) goto Ldb
            if (r0 == 0) goto Lca
            if (r2 == 0) goto Lca
            com.ss.android.socialbase.downloader.ae.xt r10 = r9.up
            int r10 = r10.qv()
            com.ss.android.socialbase.downloader.ae.xt r0 = r9.up
            int r0 = r0.mi()
            long r3 = r9.az
            r2.j(r10, r0, r3)
            return
        Lca:
            com.ss.android.socialbase.downloader.ae.xt r10 = r9.up
            int r10 = r10.qv()
            com.ss.android.socialbase.downloader.ae.xt r0 = r9.up
            int r0 = r0.mi()
            long r1 = r9.az
            r3.j(r10, r0, r1)
        Ldb:
            return
    }

    private void j(boolean r9) {
            r8 = this;
            long r0 = android.os.SystemClock.uptimeMillis()
            long r2 = r8.gq
            long r2 = r0 - r2
            boolean r4 = r8.f
            if (r4 == 0) goto L1e
            com.ss.android.socialbase.downloader.j.j r9 = r8.tj
            boolean r9 = r9.xt()
            if (r9 == 0) goto L17
            long r4 = r8.v
            goto L19
        L17:
            long r4 = r8.x
        L19:
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 <= 0) goto L2c
            goto L2d
        L1e:
            long r4 = r8.az
            long r6 = r8.la
            long r4 = r4 - r6
            if (r9 != 0) goto L2d
            boolean r9 = r8.xt(r4, r2)
            if (r9 == 0) goto L2c
            goto L2d
        L2c:
            return
        L2d:
            r8.tl()
            r8.gq = r0
            return
    }

    private boolean m() {
            r1 = this;
            boolean r0 = r1.vl
            if (r0 != 0) goto Lb
            boolean r0 = r1.jy
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            return r0
        Lb:
            r0 = 1
            return r0
    }

    private void tl() {
            r6 = this;
            boolean r0 = r6.ch
            if (r0 == 0) goto L9
            long r0 = java.lang.System.nanoTime()
            goto Lb
        L9:
            r0 = 0
        Lb:
            com.ss.android.socialbase.downloader.ae.ae r2 = r6.oq     // Catch: java.lang.Exception -> L63
            r2.j()     // Catch: java.lang.Exception -> L63
            com.ss.android.socialbase.downloader.ae.cw r2 = r6.cw
            r3 = 1
            r2.ae(r3)
            com.ss.android.socialbase.downloader.ae.cw r2 = r6.cw
            int r2 = r2.kj()
            if (r2 <= r3) goto L1f
            goto L20
        L1f:
            r3 = 0
        L20:
            boolean r2 = com.ss.android.socialbase.downloader.az.m.xt()
            com.ss.android.socialbase.downloader.downloader.az r2 = com.ss.android.socialbase.downloader.impls.vl.j(r2)
            if (r3 == 0) goto L49
            com.ss.android.socialbase.downloader.downloader.tj r3 = r6.g
            r6.j(r3)
            if (r2 == 0) goto L37
            com.ss.android.socialbase.downloader.ae.cw r3 = r6.cw
            r2.cw(r3)
            goto L5e
        L37:
            com.ss.android.socialbase.downloader.downloader.tj r2 = r6.g
            com.ss.android.socialbase.downloader.ae.cw r3 = r6.cw
            int r3 = r3.ae()
            com.ss.android.socialbase.downloader.ae.cw r4 = r6.cw
            long r4 = r4.uq()
            r2.j(r3, r4)
            goto L5e
        L49:
            if (r2 == 0) goto L51
            com.ss.android.socialbase.downloader.ae.cw r3 = r6.cw
            r2.cw(r3)
            goto L5e
        L51:
            com.ss.android.socialbase.downloader.downloader.tj r2 = r6.g
            com.ss.android.socialbase.downloader.ae.xt r3 = r6.up
            int r3 = r3.qv()
            long r4 = r6.az
            r2.j(r3, r4)
        L5e:
            long r2 = r6.az
            r6.la = r2
            goto L64
        L63:
        L64:
            boolean r2 = r6.ch
            if (r2 == 0) goto L72
            long r2 = java.lang.System.nanoTime()
            long r2 = r2 - r0
            long r0 = r6.p
            long r0 = r0 + r2
            r6.p = r0
        L72:
            return
    }

    private boolean xt(long r4, long r6) {
            r3 = this;
            r0 = 65536(0x10000, double:3.2379E-319)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto Lf
            r4 = 500(0x1f4, double:2.47E-321)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto Lf
            r4 = 1
            return r4
        Lf:
            r4 = 0
            return r4
    }

    public void cw() {
            r2 = this;
            boolean r0 = r2.jy
            if (r0 == 0) goto L5
            return
        L5:
            com.ss.android.socialbase.downloader.ws.m r0 = r2.ws
            monitor-enter(r0)
            r1 = 1
            r2.jy = r1     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            r2.ae()
            return
        L10:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r1
    }

    public long j() {
            r2 = this;
            long r0 = r2.az
            return r0
    }

    public void j(long r1, long r3) {
            r0 = this;
            r0.i = r1
            r0.w = r3
            return
    }

    public void j(long r1, long r3, long r5) {
            r0 = this;
            r0.az = r1
            r0.av = r1
            r0.i = r3
            r0.w = r5
            return
    }

    public void r() throws com.ss.android.socialbase.downloader.up.j {
            r35 = this;
            r1 = r35
            boolean r0 = r1.m()
            if (r0 != 0) goto L5ab
            com.ss.android.socialbase.downloader.ae.xt r0 = r1.up
            if (r0 != 0) goto Le
            goto L5ab
        Le:
            com.ss.android.socialbase.downloader.g.g r0 = r1.m
            long r2 = com.ss.android.socialbase.downloader.az.m.j(r0)
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L5a1
            com.ss.android.socialbase.downloader.ae.xt r0 = r1.up
            long r6 = r0.vl()
            long r8 = java.lang.System.nanoTime()
            boolean r10 = r1.ch
            r11 = 1
            r12 = 0
            com.ss.android.socialbase.downloader.ae.cw r0 = r1.cw     // Catch: java.lang.Throwable -> L31a com.ss.android.socialbase.downloader.up.j -> L49e
            java.lang.String r14 = r0.vl()     // Catch: com.ss.android.socialbase.downloader.up.j -> L2e4 java.lang.Throwable -> L31a
            com.ss.android.socialbase.downloader.ae.cw r15 = r1.cw     // Catch: com.ss.android.socialbase.downloader.up.j -> L2e4 java.lang.Throwable -> L31a
            java.lang.String r15 = r15.jy()     // Catch: com.ss.android.socialbase.downloader.up.j -> L2e4 java.lang.Throwable -> L31a
            r29 = r4
            com.ss.android.socialbase.downloader.jy.j r4 = r1.kt     // Catch: java.lang.Throwable -> L2d9 com.ss.android.socialbase.downloader.up.j -> L2e4
            java.lang.String r5 = "flush_buffer_size_byte"
            r13 = -1
            int r4 = r4.j(r5, r13)     // Catch: java.lang.Throwable -> L2d9 com.ss.android.socialbase.downloader.up.j -> L2e4
            com.ss.android.socialbase.downloader.ae.ae r0 = com.ss.android.socialbase.downloader.az.m.j(r0, r14, r15, r4)     // Catch: java.lang.Throwable -> L2d9 com.ss.android.socialbase.downloader.up.j -> L2e4
            r1.oq = r0     // Catch: java.lang.Throwable -> L2d9 com.ss.android.socialbase.downloader.up.j -> L2e4
            long r4 = r1.az     // Catch: java.lang.Throwable -> L2d9 com.ss.android.socialbase.downloader.up.j -> L2e4 java.io.IOException -> L309
            r0.j(r4)     // Catch: java.lang.Throwable -> L2d9 com.ss.android.socialbase.downloader.up.j -> L2e4 java.io.IOException -> L309
            com.ss.android.socialbase.downloader.g.g r0 = r1.m     // Catch: java.lang.Throwable -> L2d9 com.ss.android.socialbase.downloader.up.j -> L2e4
            java.io.InputStream r0 = r0.j()     // Catch: java.lang.Throwable -> L2d9 com.ss.android.socialbase.downloader.up.j -> L2e4
            if (r0 == 0) goto L2ee
            com.ss.android.socialbase.downloader.ae.cw r4 = r1.cw     // Catch: java.lang.Throwable -> L2d9 com.ss.android.socialbase.downloader.up.j -> L2e4
            r4.qa()     // Catch: java.lang.Throwable -> L2d9 com.ss.android.socialbase.downloader.up.j -> L2e4
            com.ss.android.socialbase.downloader.oq.xt r4 = r1.j(r0)     // Catch: java.lang.Throwable -> L2d9 com.ss.android.socialbase.downloader.up.j -> L2e4
            com.ss.android.socialbase.downloader.ae.cw r0 = r1.cw     // Catch: java.lang.Throwable -> L2cb com.ss.android.socialbase.downloader.up.j -> L2d3
            boolean r5 = r1.s     // Catch: java.lang.Throwable -> L2cb com.ss.android.socialbase.downloader.up.j -> L2d3
            r0.m(r5)     // Catch: java.lang.Throwable -> L2cb com.ss.android.socialbase.downloader.up.j -> L2d3
            com.ss.android.socialbase.downloader.ae.cw r0 = r1.cw     // Catch: java.lang.Throwable -> L2cb com.ss.android.socialbase.downloader.up.j -> L2d3
            boolean r0 = r0.mz()     // Catch: java.lang.Throwable -> L2cb com.ss.android.socialbase.downloader.up.j -> L2d3
            r1.j = r0     // Catch: java.lang.Throwable -> L2cb com.ss.android.socialbase.downloader.up.j -> L2d3
            long r14 = com.ss.android.socialbase.downloader.xt.up.r     // Catch: java.lang.Throwable -> L2cb com.ss.android.socialbase.downloader.up.j -> L2d3
            long r16 = com.ss.android.socialbase.downloader.xt.up.up     // Catch: java.lang.Throwable -> L2cb com.ss.android.socialbase.downloader.up.j -> L2d3
            r18 = 1000(0x3e8, double:4.94E-321)
            long r18 = r18 / r16
            long r14 = r14 / r18
            long r18 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L2cb com.ss.android.socialbase.downloader.up.j -> L2d3
            r20 = r29
            r22 = r20
        L7c:
            boolean r0 = r1.m()     // Catch: java.lang.Throwable -> L2cb com.ss.android.socialbase.downloader.up.j -> L2d3
            if (r0 == 0) goto L102
            com.ss.android.socialbase.downloader.g.g r0 = r1.m
            if (r0 == 0) goto L89
            r0.r()
        L89:
            if (r4 == 0) goto L8e
            r4.xt()
        L8e:
            boolean r0 = r1.mi     // Catch: java.lang.Throwable -> Lac
            if (r0 == 0) goto Lae
            com.ss.android.socialbase.downloader.ws.m r2 = r1.ws     // Catch: java.lang.Throwable -> Lac
            monitor-enter(r2)     // Catch: java.lang.Throwable -> Lac
            boolean r0 = r1.jy     // Catch: java.lang.Throwable -> La6
            if (r0 != 0) goto La8
            com.ss.android.socialbase.downloader.impls.qv r0 = r1.tl     // Catch: java.lang.Throwable -> La6
            r1.j(r0)     // Catch: java.lang.Throwable -> La6
            com.ss.android.socialbase.downloader.ae.ae r0 = r1.oq     // Catch: java.lang.Throwable -> La6
            if (r0 == 0) goto La8
            r1.tl()     // Catch: java.lang.Throwable -> La6
            goto La8
        La6:
            r0 = move-exception
            goto Laa
        La8:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La6
            goto Lba
        Laa:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La6
            throw r0     // Catch: java.lang.Throwable -> Lac
        Lac:
            r0 = move-exception
            goto Lf8
        Lae:
            com.ss.android.socialbase.downloader.impls.qv r0 = r1.tl     // Catch: java.lang.Throwable -> Lac
            r1.j(r0)     // Catch: java.lang.Throwable -> Lac
            com.ss.android.socialbase.downloader.ae.ae r0 = r1.oq     // Catch: java.lang.Throwable -> Lac
            if (r0 == 0) goto Lba
            r1.tl()     // Catch: java.lang.Throwable -> Lac
        Lba:
            com.ss.android.socialbase.downloader.ae.ae r0 = r1.oq
            java.io.Closeable[] r2 = new java.io.Closeable[r11]
            r2[r12] = r0
            com.ss.android.socialbase.downloader.az.m.j(r2)
            long r2 = java.lang.System.nanoTime()
            long r2 = r2 - r8
            r1.h = r2
            r21 = r10
        Lcc:
            com.ss.android.socialbase.downloader.jy.j r10 = r1.kt
            com.ss.android.socialbase.downloader.ae.cw r11 = r1.cw
            java.lang.String r12 = r1.r
            com.ss.android.socialbase.downloader.g.g r13 = r1.m
            boolean r14 = r1.vl
            boolean r15 = r1.jy
            com.ss.android.socialbase.downloader.up.j r0 = r1.qv
            long r2 = r1.az
            long r4 = r1.av
            long r17 = r2 - r4
            long r2 = r1.h
            long r4 = r1.a
            long r6 = r1.l
            long r8 = r1.p
            r28 = 0
            r16 = r0
            r19 = r2
            r22 = r4
            r24 = r6
            r26 = r8
            com.ss.android.socialbase.downloader.tl.j.j(r10, r11, r12, r13, r14, r15, r16, r17, r19, r21, r22, r24, r26, r28)
            return
        Lf8:
            com.ss.android.socialbase.downloader.ae.ae r2 = r1.oq
            java.io.Closeable[] r3 = new java.io.Closeable[r11]
            r3[r12] = r2
            com.ss.android.socialbase.downloader.az.m.j(r3)
            throw r0
        L102:
            r24 = r20
            r21 = r10
            if (r21 == 0) goto L11f
            long r24 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L10d com.ss.android.socialbase.downloader.up.j -> L117
            goto L11f
        L10d:
            r0 = move-exception
            r13 = r4
            r31 = r6
            r26 = r8
        L113:
            r5 = 0
            r9 = 1
            goto L31e
        L117:
            r0 = move-exception
            r13 = r4
            r26 = r8
        L11b:
            r33 = 0
            goto L4a6
        L11f:
            com.ss.android.socialbase.downloader.qv.j r0 = r4.j()     // Catch: java.lang.Throwable -> L2bb com.ss.android.socialbase.downloader.up.j -> L2c4
            if (r21 == 0) goto L131
            long r11 = r1.a     // Catch: java.lang.Throwable -> L10d com.ss.android.socialbase.downloader.up.j -> L117
            long r26 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L10d com.ss.android.socialbase.downloader.up.j -> L117
            long r26 = r26 - r24
            long r11 = r11 + r26
            r1.a = r11     // Catch: java.lang.Throwable -> L10d com.ss.android.socialbase.downloader.up.j -> L117
        L131:
            int r11 = r0.cw     // Catch: java.lang.Throwable -> L2bb com.ss.android.socialbase.downloader.up.j -> L2c4
            if (r11 == r13) goto L22a
            com.ss.android.socialbase.downloader.ae.cw r12 = r1.cw     // Catch: com.ss.android.socialbase.downloader.up.j -> L16d java.lang.Throwable -> L225
            boolean r12 = r12.nt()     // Catch: com.ss.android.socialbase.downloader.up.j -> L16d java.lang.Throwable -> L225
            if (r12 != 0) goto L171
            r31 = r6
            long r5 = r1.w     // Catch: java.lang.Throwable -> L169 com.ss.android.socialbase.downloader.up.j -> L16d
            long r12 = r1.az     // Catch: java.lang.Throwable -> L169 com.ss.android.socialbase.downloader.up.j -> L16d
            r26 = r8
            long r7 = r1.av     // Catch: java.lang.Throwable -> L163 com.ss.android.socialbase.downloader.up.j -> L166
            long r12 = r12 - r7
            int r7 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r7 <= 0) goto L175
            long r5 = r1.w     // Catch: java.lang.Throwable -> L163 com.ss.android.socialbase.downloader.up.j -> L166
            long r7 = r1.az     // Catch: java.lang.Throwable -> L163 com.ss.android.socialbase.downloader.up.j -> L166
            long r12 = r1.av     // Catch: java.lang.Throwable -> L163 com.ss.android.socialbase.downloader.up.j -> L166
            long r7 = r7 - r12
            long r12 = (long) r11     // Catch: java.lang.Throwable -> L163 com.ss.android.socialbase.downloader.up.j -> L166
            long r7 = r7 + r12
            int r12 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r12 >= 0) goto L175
            long r5 = r1.w     // Catch: java.lang.Throwable -> L163 com.ss.android.socialbase.downloader.up.j -> L166
            long r7 = r1.az     // Catch: java.lang.Throwable -> L163 com.ss.android.socialbase.downloader.up.j -> L166
            long r11 = r1.av     // Catch: java.lang.Throwable -> L163 com.ss.android.socialbase.downloader.up.j -> L166
            long r7 = r7 - r11
            long r5 = r5 - r7
            int r11 = (int) r5     // Catch: java.lang.Throwable -> L163 com.ss.android.socialbase.downloader.up.j -> L166
            goto L175
        L163:
            r0 = move-exception
        L164:
            r13 = r4
            goto L113
        L166:
            r0 = move-exception
        L167:
            r13 = r4
            goto L11b
        L169:
            r0 = move-exception
        L16a:
            r26 = r8
            goto L164
        L16d:
            r0 = move-exception
            r26 = r8
            goto L167
        L171:
            r31 = r6
            r26 = r8
        L175:
            if (r21 == 0) goto L17d
            long r5 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L163 com.ss.android.socialbase.downloader.up.j -> L166
            r24 = r5
        L17d:
            com.ss.android.socialbase.downloader.ae.ae r5 = r1.oq     // Catch: java.lang.Throwable -> L163 com.ss.android.socialbase.downloader.up.j -> L166
            byte[] r6 = r0.j     // Catch: java.lang.Throwable -> L163 com.ss.android.socialbase.downloader.up.j -> L166
            r12 = 0
            r5.j(r6, r12, r11)     // Catch: java.lang.Throwable -> L163 com.ss.android.socialbase.downloader.up.j -> L166
            if (r21 == 0) goto L192
            long r6 = r1.l     // Catch: java.lang.Throwable -> L163 com.ss.android.socialbase.downloader.up.j -> L166
            long r12 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L163 com.ss.android.socialbase.downloader.up.j -> L166
            long r12 = r12 - r24
            long r6 = r6 + r12
            r1.l = r6     // Catch: java.lang.Throwable -> L163 com.ss.android.socialbase.downloader.up.j -> L166
        L192:
            r4.j(r0)     // Catch: java.lang.Throwable -> L163 com.ss.android.socialbase.downloader.up.j -> L166
            long r6 = r1.az     // Catch: java.lang.Throwable -> L163 com.ss.android.socialbase.downloader.up.j -> L166
            long r11 = (long) r11     // Catch: java.lang.Throwable -> L163 com.ss.android.socialbase.downloader.up.j -> L166
            long r6 = r6 + r11
            r1.az = r6     // Catch: java.lang.Throwable -> L163 com.ss.android.socialbase.downloader.up.j -> L166
            long r22 = r22 + r11
            com.ss.android.socialbase.downloader.ws.m r6 = r1.ws     // Catch: java.lang.Throwable -> L163 com.ss.android.socialbase.downloader.up.j -> L166
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L163 com.ss.android.socialbase.downloader.up.j -> L166
            boolean r0 = r1.mi     // Catch: java.lang.Throwable -> L1a9
            if (r0 == 0) goto L1ac
            boolean r0 = r1.jy     // Catch: java.lang.Throwable -> L1a9
            if (r0 != 0) goto L1ba
            goto L1ac
        L1a9:
            r0 = move-exception
            goto L223
        L1ac:
            com.ss.android.socialbase.downloader.ws.m r0 = r1.ws     // Catch: java.lang.Throwable -> L1a9
            boolean r0 = r0.xt(r11)     // Catch: java.lang.Throwable -> L1a9
            com.ss.android.socialbase.downloader.impls.qv r7 = r1.tl     // Catch: java.lang.Throwable -> L1a9
            r1.j(r7)     // Catch: java.lang.Throwable -> L1a9
            r1.j(r0)     // Catch: java.lang.Throwable -> L1a9
        L1ba:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L1a9
            com.ss.android.socialbase.downloader.ae.cw r0 = r1.cw     // Catch: java.lang.Throwable -> L163 com.ss.android.socialbase.downloader.up.j -> L166
            boolean r0 = r0.dj()     // Catch: java.lang.Throwable -> L163 com.ss.android.socialbase.downloader.up.j -> L166
            if (r0 == 0) goto L21d
            com.ss.android.socialbase.downloader.ae.cw r0 = r1.cw     // Catch: java.lang.Throwable -> L163 com.ss.android.socialbase.downloader.up.j -> L166
            boolean r0 = r0.kk()     // Catch: java.lang.Throwable -> L163 com.ss.android.socialbase.downloader.up.j -> L166
            if (r0 == 0) goto L217
            com.ss.android.socialbase.downloader.ae.cw r0 = r1.cw     // Catch: java.lang.Throwable -> L163 com.ss.android.socialbase.downloader.up.j -> L166
            boolean r0 = r0.nt()     // Catch: java.lang.Throwable -> L163 com.ss.android.socialbase.downloader.up.j -> L166
            if (r0 != 0) goto L1e6
            long r6 = r1.w     // Catch: java.lang.Throwable -> L163 com.ss.android.socialbase.downloader.up.j -> L166
            int r0 = (r6 > r29 ? 1 : (r6 == r29 ? 0 : -1))
            if (r0 < 0) goto L1e6
            long r6 = r1.w     // Catch: java.lang.Throwable -> L163 com.ss.android.socialbase.downloader.up.j -> L166
            long r11 = r1.az     // Catch: java.lang.Throwable -> L163 com.ss.android.socialbase.downloader.up.j -> L166
            r33 = r6
            long r5 = r1.av     // Catch: java.lang.Throwable -> L163 com.ss.android.socialbase.downloader.up.j -> L166
            long r11 = r11 - r5
            int r0 = (r33 > r11 ? 1 : (r33 == r11 ? 0 : -1))
            if (r0 <= 0) goto L22e
        L1e6:
            boolean r0 = r1.j     // Catch: java.lang.Throwable -> L163 com.ss.android.socialbase.downloader.up.j -> L166
            if (r0 == 0) goto L20a
            int r0 = (r22 > r14 ? 1 : (r22 == r14 ? 0 : -1))
            if (r0 <= 0) goto L20a
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L163 com.ss.android.socialbase.downloader.up.j -> L166
            long r5 = r5 - r18
            int r0 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r0 >= 0) goto L202
            long r5 = r16 - r5
            java.lang.Thread.sleep(r5)     // Catch: java.lang.Throwable -> L163 com.ss.android.socialbase.downloader.up.j -> L166 java.lang.InterruptedException -> L1fe
            goto L202
        L1fe:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)     // Catch: java.lang.Throwable -> L163 com.ss.android.socialbase.downloader.up.j -> L166
        L202:
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L163 com.ss.android.socialbase.downloader.up.j -> L166
            r18 = r5
            r22 = r29
        L20a:
            r10 = r21
            r20 = r24
            r8 = r26
            r6 = r31
            r11 = 1
            r12 = 0
            r13 = -1
            goto L7c
        L217:
            com.ss.android.socialbase.downloader.up.m r0 = new com.ss.android.socialbase.downloader.up.m     // Catch: java.lang.Throwable -> L163 com.ss.android.socialbase.downloader.up.j -> L166
            r0.<init>()     // Catch: java.lang.Throwable -> L163 com.ss.android.socialbase.downloader.up.j -> L166
            throw r0     // Catch: java.lang.Throwable -> L163 com.ss.android.socialbase.downloader.up.j -> L166
        L21d:
            com.ss.android.socialbase.downloader.up.r r0 = new com.ss.android.socialbase.downloader.up.r     // Catch: java.lang.Throwable -> L163 com.ss.android.socialbase.downloader.up.j -> L166
            r0.<init>()     // Catch: java.lang.Throwable -> L163 com.ss.android.socialbase.downloader.up.j -> L166
            throw r0     // Catch: java.lang.Throwable -> L163 com.ss.android.socialbase.downloader.up.j -> L166
        L223:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L1a9
            throw r0     // Catch: java.lang.Throwable -> L163 com.ss.android.socialbase.downloader.up.j -> L166
        L225:
            r0 = move-exception
            r31 = r6
            goto L16a
        L22a:
            r31 = r6
            r26 = r8
        L22e:
            com.ss.android.socialbase.downloader.g.g r0 = r1.m
            if (r0 == 0) goto L235
            r0.r()
        L235:
            r4.xt()
            boolean r0 = r1.mi     // Catch: java.lang.Throwable -> L256
            if (r0 == 0) goto L25a
            com.ss.android.socialbase.downloader.ws.m r4 = r1.ws     // Catch: java.lang.Throwable -> L256
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L256
            boolean r0 = r1.jy     // Catch: java.lang.Throwable -> L250
            if (r0 != 0) goto L252
            com.ss.android.socialbase.downloader.impls.qv r0 = r1.tl     // Catch: java.lang.Throwable -> L250
            r1.j(r0)     // Catch: java.lang.Throwable -> L250
            com.ss.android.socialbase.downloader.ae.ae r0 = r1.oq     // Catch: java.lang.Throwable -> L250
            if (r0 == 0) goto L252
            r1.tl()     // Catch: java.lang.Throwable -> L250
            goto L252
        L250:
            r0 = move-exception
            goto L254
        L252:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L250
            goto L266
        L254:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L250
            throw r0     // Catch: java.lang.Throwable -> L256
        L256:
            r0 = move-exception
            r5 = 0
            r9 = 1
            goto L2b1
        L25a:
            com.ss.android.socialbase.downloader.impls.qv r0 = r1.tl     // Catch: java.lang.Throwable -> L256
            r1.j(r0)     // Catch: java.lang.Throwable -> L256
            com.ss.android.socialbase.downloader.ae.ae r0 = r1.oq     // Catch: java.lang.Throwable -> L256
            if (r0 == 0) goto L266
            r1.tl()     // Catch: java.lang.Throwable -> L256
        L266:
            com.ss.android.socialbase.downloader.ae.ae r0 = r1.oq
            r10 = 1
            java.io.Closeable[] r4 = new java.io.Closeable[r10]
            r20 = 0
            r4[r20] = r0
            com.ss.android.socialbase.downloader.az.m.j(r4)
            long r4 = java.lang.System.nanoTime()
            long r4 = r4 - r26
            r1.h = r4
            r4 = 1
            com.ss.android.socialbase.downloader.jy.j r10 = r1.kt
            com.ss.android.socialbase.downloader.ae.cw r11 = r1.cw
            java.lang.String r12 = r1.r
            com.ss.android.socialbase.downloader.g.g r13 = r1.m
            boolean r14 = r1.vl
            boolean r15 = r1.jy
            com.ss.android.socialbase.downloader.up.j r0 = r1.qv
            long r5 = r1.az
            long r7 = r1.av
            long r17 = r5 - r7
            long r5 = r1.h
            long r7 = r1.a
            r22 = r5
            long r4 = r1.l
            r6 = r10
            long r9 = r1.p
            r28 = 0
            r16 = r0
            r24 = r4
            r26 = r9
            r19 = r22
            r5 = 0
            r9 = 1
            r10 = r6
            r22 = r7
            com.ss.android.socialbase.downloader.tl.j.j(r10, r11, r12, r13, r14, r15, r16, r17, r19, r21, r22, r24, r26, r28)
            r8 = 1
            r33 = 0
            goto L421
        L2b1:
            com.ss.android.socialbase.downloader.ae.ae r2 = r1.oq
            java.io.Closeable[] r3 = new java.io.Closeable[r9]
            r3[r5] = r2
            com.ss.android.socialbase.downloader.az.m.j(r3)
            throw r0
        L2bb:
            r0 = move-exception
            r31 = r6
            r26 = r8
        L2c0:
            r5 = 0
            r9 = 1
            r13 = r4
            goto L31e
        L2c4:
            r0 = move-exception
            r26 = r8
        L2c7:
            r5 = 0
            r9 = 1
            goto L167
        L2cb:
            r0 = move-exception
            r31 = r6
            r26 = r8
            r21 = r10
            goto L2c0
        L2d3:
            r0 = move-exception
            r26 = r8
            r21 = r10
            goto L2c7
        L2d9:
            r0 = move-exception
        L2da:
            r31 = r6
            r26 = r8
            r21 = r10
            r5 = 0
            r9 = 1
        L2e2:
            r13 = 0
            goto L31e
        L2e4:
            r0 = move-exception
            r26 = r8
            r21 = r10
            r5 = 0
            r9 = 1
        L2eb:
            r13 = 0
            goto L11b
        L2ee:
            r31 = r6
            r26 = r8
            r21 = r10
            r5 = 0
            r9 = 1
            com.ss.android.socialbase.downloader.up.j r0 = new com.ss.android.socialbase.downloader.up.j     // Catch: java.lang.Throwable -> L305 com.ss.android.socialbase.downloader.up.j -> L307
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L305 com.ss.android.socialbase.downloader.up.j -> L307
            java.lang.String r6 = "inputStream is null"
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L305 com.ss.android.socialbase.downloader.up.j -> L307
            r6 = 1042(0x412, float:1.46E-42)
            r0.<init>(r6, r4)     // Catch: java.lang.Throwable -> L305 com.ss.android.socialbase.downloader.up.j -> L307
            throw r0     // Catch: java.lang.Throwable -> L305 com.ss.android.socialbase.downloader.up.j -> L307
        L305:
            r0 = move-exception
            goto L2e2
        L307:
            r0 = move-exception
            goto L2eb
        L309:
            r0 = move-exception
            r31 = r6
            r26 = r8
            r21 = r10
            r5 = 0
            r9 = 1
            com.ss.android.socialbase.downloader.up.j r4 = new com.ss.android.socialbase.downloader.up.j     // Catch: java.lang.Throwable -> L305 com.ss.android.socialbase.downloader.up.j -> L307
            r6 = 1054(0x41e, float:1.477E-42)
            r4.<init>(r6, r0)     // Catch: java.lang.Throwable -> L305 com.ss.android.socialbase.downloader.up.j -> L307
            throw r4     // Catch: java.lang.Throwable -> L305 com.ss.android.socialbase.downloader.up.j -> L307
        L31a:
            r0 = move-exception
            r29 = r4
            goto L2da
        L31e:
            java.lang.String r4 = com.ss.android.socialbase.downloader.downloader.up.xt     // Catch: java.lang.Throwable -> L392
            java.lang.String r6 = "handleResponse: e = "
            java.lang.String r7 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L392
            java.lang.String r6 = r6.concat(r7)     // Catch: java.lang.Throwable -> L392
            com.ss.android.socialbase.downloader.m.j.r(r4, r6)     // Catch: java.lang.Throwable -> L392
            boolean r4 = r1.m()     // Catch: java.lang.Throwable -> L392
            if (r4 == 0) goto L388
            com.ss.android.socialbase.downloader.g.g r0 = r1.m
            if (r0 == 0) goto L33a
            r0.r()
        L33a:
            if (r13 == 0) goto L33f
            r13.xt()
        L33f:
            boolean r0 = r1.mi     // Catch: java.lang.Throwable -> L35d
            if (r0 == 0) goto L35f
            com.ss.android.socialbase.downloader.ws.m r2 = r1.ws     // Catch: java.lang.Throwable -> L35d
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L35d
            boolean r0 = r1.jy     // Catch: java.lang.Throwable -> L357
            if (r0 != 0) goto L359
            com.ss.android.socialbase.downloader.impls.qv r0 = r1.tl     // Catch: java.lang.Throwable -> L357
            r1.j(r0)     // Catch: java.lang.Throwable -> L357
            com.ss.android.socialbase.downloader.ae.ae r0 = r1.oq     // Catch: java.lang.Throwable -> L357
            if (r0 == 0) goto L359
            r1.tl()     // Catch: java.lang.Throwable -> L357
            goto L359
        L357:
            r0 = move-exception
            goto L35b
        L359:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L357
            goto L36b
        L35b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L357
            throw r0     // Catch: java.lang.Throwable -> L35d
        L35d:
            r0 = move-exception
            goto L37e
        L35f:
            com.ss.android.socialbase.downloader.impls.qv r0 = r1.tl     // Catch: java.lang.Throwable -> L35d
            r1.j(r0)     // Catch: java.lang.Throwable -> L35d
            com.ss.android.socialbase.downloader.ae.ae r0 = r1.oq     // Catch: java.lang.Throwable -> L35d
            if (r0 == 0) goto L36b
            r1.tl()     // Catch: java.lang.Throwable -> L35d
        L36b:
            com.ss.android.socialbase.downloader.ae.ae r0 = r1.oq
            java.io.Closeable[] r2 = new java.io.Closeable[r9]
            r2[r5] = r0
            com.ss.android.socialbase.downloader.az.m.j(r2)
        L374:
            long r2 = java.lang.System.nanoTime()
            long r2 = r2 - r26
            r1.h = r2
            goto Lcc
        L37e:
            com.ss.android.socialbase.downloader.ae.ae r2 = r1.oq
            java.io.Closeable[] r3 = new java.io.Closeable[r9]
            r3[r5] = r2
            com.ss.android.socialbase.downloader.az.m.j(r3)
            throw r0
        L388:
            boolean r4 = com.ss.android.socialbase.downloader.m.j.j()     // Catch: java.lang.Throwable -> L392
            if (r4 == 0) goto L397
            com.bytedance.sdk.component.utils.vl.j(r0)     // Catch: java.lang.Throwable -> L392
            goto L397
        L392:
            r0 = move-exception
            r33 = 0
            goto L520
        L397:
            java.lang.String r4 = "ResponseHandler"
            com.ss.android.socialbase.downloader.az.m.j(r0, r4)     // Catch: java.lang.Throwable -> L392 com.ss.android.socialbase.downloader.up.j -> L495
            com.ss.android.socialbase.downloader.g.g r0 = r1.m
            if (r0 == 0) goto L3a3
            r0.r()
        L3a3:
            if (r13 == 0) goto L3a8
            r13.xt()
        L3a8:
            boolean r0 = r1.mi     // Catch: java.lang.Throwable -> L3c6
            if (r0 == 0) goto L3cc
            com.ss.android.socialbase.downloader.ws.m r4 = r1.ws     // Catch: java.lang.Throwable -> L3c6
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L3c6
            boolean r0 = r1.jy     // Catch: java.lang.Throwable -> L3c0
            if (r0 != 0) goto L3c2
            com.ss.android.socialbase.downloader.impls.qv r0 = r1.tl     // Catch: java.lang.Throwable -> L3c0
            r1.j(r0)     // Catch: java.lang.Throwable -> L3c0
            com.ss.android.socialbase.downloader.ae.ae r0 = r1.oq     // Catch: java.lang.Throwable -> L3c0
            if (r0 == 0) goto L3c2
            r1.tl()     // Catch: java.lang.Throwable -> L3c0
            goto L3c2
        L3c0:
            r0 = move-exception
            goto L3c4
        L3c2:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3c0
            goto L3d8
        L3c4:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3c0
            throw r0     // Catch: java.lang.Throwable -> L3c6
        L3c6:
            r0 = move-exception
            r8 = 1
            r33 = 0
            goto L48a
        L3cc:
            com.ss.android.socialbase.downloader.impls.qv r0 = r1.tl     // Catch: java.lang.Throwable -> L3c6
            r1.j(r0)     // Catch: java.lang.Throwable -> L3c6
            com.ss.android.socialbase.downloader.ae.ae r0 = r1.oq     // Catch: java.lang.Throwable -> L3c6
            if (r0 == 0) goto L3d8
            r1.tl()     // Catch: java.lang.Throwable -> L3c6
        L3d8:
            com.ss.android.socialbase.downloader.ae.ae r0 = r1.oq
            java.io.Closeable[] r4 = new java.io.Closeable[r9]
            r4[r5] = r0
            com.ss.android.socialbase.downloader.az.m.j(r4)
            long r6 = java.lang.System.nanoTime()
            long r6 = r6 - r26
            r1.h = r6
            com.ss.android.socialbase.downloader.jy.j r10 = r1.kt
            com.ss.android.socialbase.downloader.ae.cw r11 = r1.cw
            java.lang.String r12 = r1.r
            com.ss.android.socialbase.downloader.g.g r13 = r1.m
            boolean r14 = r1.vl
            boolean r15 = r1.jy
            com.ss.android.socialbase.downloader.up.j r0 = r1.qv
            long r6 = r1.az
            r16 = r6
            r4 = 0
            long r5 = r1.av
            long r5 = r16 - r5
            long r7 = r1.h
            r17 = r5
            r33 = 0
            long r4 = r1.a
            r16 = r10
            r6 = 1
            long r9 = r1.l
            r19 = r7
            r8 = 1
            long r6 = r1.p
            r28 = 0
            r22 = r4
            r26 = r6
            r24 = r9
            r10 = r16
            r16 = r0
            com.ss.android.socialbase.downloader.tl.j.j(r10, r11, r12, r13, r14, r15, r16, r17, r19, r21, r22, r24, r26, r28)
        L421:
            com.ss.android.socialbase.downloader.ae.cw r0 = r1.cw
            boolean r0 = r0.nt()
            if (r0 == 0) goto L42b
            goto L5ab
        L42b:
            long r4 = r1.az
            long r6 = r1.av
            long r4 = r4 - r6
            int r0 = (r4 > r29 ? 1 : (r4 == r29 ? 0 : -1))
            if (r0 < 0) goto L5ab
            long r6 = r1.w
            int r0 = (r6 > r29 ? 1 : (r6 == r29 ? 0 : -1))
            if (r0 < 0) goto L5ab
            long r6 = r1.w
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L442
            goto L5ab
        L442:
            com.ss.android.socialbase.downloader.up.j r0 = new com.ss.android.socialbase.downloader.up.j
            java.lang.String r6 = "handle data length[%d] != content length[%d] downloadChunkContentLen[%d], range[%d, %d) , current offset[%d] , handle start from %d"
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            long r9 = r1.w
            java.lang.Long r3 = java.lang.Long.valueOf(r9)
            java.lang.Long r5 = java.lang.Long.valueOf(r31)
            long r9 = r1.i
            java.lang.Long r7 = java.lang.Long.valueOf(r9)
            long r9 = r1.az
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            long r10 = r1.av
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r11 = 7
            java.lang.Object[] r11 = new java.lang.Object[r11]
            r11[r33] = r4
            r11[r8] = r2
            r2 = 2
            r11[r2] = r3
            r2 = 3
            r11[r2] = r5
            r2 = 4
            r11[r2] = r7
            r2 = 5
            r11[r2] = r9
            r2 = 6
            r11[r2] = r10
            java.lang.String r2 = java.lang.String.format(r6, r11)
            r3 = 1051(0x41b, float:1.473E-42)
            r0.<init>(r3, r2)
            throw r0
        L48a:
            com.ss.android.socialbase.downloader.ae.ae r2 = r1.oq
            r6 = 1
            java.io.Closeable[] r3 = new java.io.Closeable[r6]
            r3[r33] = r2
            com.ss.android.socialbase.downloader.az.m.j(r3)
            throw r0
        L495:
            r0 = move-exception
            r33 = 0
            r1.qv = r0     // Catch: java.lang.Throwable -> L49b
            throw r0     // Catch: java.lang.Throwable -> L49b
        L49b:
            r0 = move-exception
            goto L520
        L49e:
            r0 = move-exception
            r26 = r8
            r21 = r10
            r33 = 0
            r13 = 0
        L4a6:
            java.lang.String r2 = com.ss.android.socialbase.downloader.downloader.up.xt     // Catch: java.lang.Throwable -> L49b
            java.lang.String r3 = "handleResponse: BaseException e = "
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L49b
            java.lang.String r3 = r3.concat(r4)     // Catch: java.lang.Throwable -> L49b
            com.ss.android.socialbase.downloader.m.j.r(r2, r3)     // Catch: java.lang.Throwable -> L49b
            com.ss.android.socialbase.downloader.jy.j r2 = r1.kt     // Catch: java.lang.Throwable -> L49b
            java.lang.String r3 = "ignore_base_ex_on_stop_status"
            boolean r2 = r2.j(r3)     // Catch: java.lang.Throwable -> L49b
            if (r2 == 0) goto L514
            boolean r2 = r1.m()     // Catch: java.lang.Throwable -> L49b
            if (r2 == 0) goto L514
            com.ss.android.socialbase.downloader.g.g r0 = r1.m
            if (r0 == 0) goto L4cc
            r0.r()
        L4cc:
            if (r13 == 0) goto L4d1
            r13.xt()
        L4d1:
            boolean r0 = r1.mi     // Catch: java.lang.Throwable -> L4ef
            if (r0 == 0) goto L4f1
            com.ss.android.socialbase.downloader.ws.m r2 = r1.ws     // Catch: java.lang.Throwable -> L4ef
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L4ef
            boolean r0 = r1.jy     // Catch: java.lang.Throwable -> L4e9
            if (r0 != 0) goto L4eb
            com.ss.android.socialbase.downloader.impls.qv r0 = r1.tl     // Catch: java.lang.Throwable -> L4e9
            r1.j(r0)     // Catch: java.lang.Throwable -> L4e9
            com.ss.android.socialbase.downloader.ae.ae r0 = r1.oq     // Catch: java.lang.Throwable -> L4e9
            if (r0 == 0) goto L4eb
            r1.tl()     // Catch: java.lang.Throwable -> L4e9
            goto L4eb
        L4e9:
            r0 = move-exception
            goto L4ed
        L4eb:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4e9
            goto L4fd
        L4ed:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4e9
            throw r0     // Catch: java.lang.Throwable -> L4ef
        L4ef:
            r0 = move-exception
            goto L509
        L4f1:
            com.ss.android.socialbase.downloader.impls.qv r0 = r1.tl     // Catch: java.lang.Throwable -> L4ef
            r1.j(r0)     // Catch: java.lang.Throwable -> L4ef
            com.ss.android.socialbase.downloader.ae.ae r0 = r1.oq     // Catch: java.lang.Throwable -> L4ef
            if (r0 == 0) goto L4fd
            r1.tl()     // Catch: java.lang.Throwable -> L4ef
        L4fd:
            com.ss.android.socialbase.downloader.ae.ae r0 = r1.oq
            r6 = 1
            java.io.Closeable[] r2 = new java.io.Closeable[r6]
            r2[r33] = r0
            com.ss.android.socialbase.downloader.az.m.j(r2)
            goto L374
        L509:
            com.ss.android.socialbase.downloader.ae.ae r2 = r1.oq
            r6 = 1
            java.io.Closeable[] r3 = new java.io.Closeable[r6]
            r3[r33] = r2
            com.ss.android.socialbase.downloader.az.m.j(r3)
            throw r0
        L514:
            boolean r2 = com.ss.android.socialbase.downloader.m.j.j()     // Catch: java.lang.Throwable -> L49b
            if (r2 == 0) goto L51d
            com.bytedance.sdk.component.utils.vl.j(r0)     // Catch: java.lang.Throwable -> L49b
        L51d:
            r1.qv = r0     // Catch: java.lang.Throwable -> L49b
            throw r0     // Catch: java.lang.Throwable -> L49b
        L520:
            com.ss.android.socialbase.downloader.g.g r2 = r1.m
            if (r2 == 0) goto L527
            r2.r()
        L527:
            if (r13 == 0) goto L52c
            r13.xt()
        L52c:
            boolean r2 = r1.mi     // Catch: java.lang.Throwable -> L54a
            if (r2 == 0) goto L54c
            com.ss.android.socialbase.downloader.ws.m r2 = r1.ws     // Catch: java.lang.Throwable -> L54a
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L54a
            boolean r3 = r1.jy     // Catch: java.lang.Throwable -> L544
            if (r3 != 0) goto L546
            com.ss.android.socialbase.downloader.impls.qv r3 = r1.tl     // Catch: java.lang.Throwable -> L544
            r1.j(r3)     // Catch: java.lang.Throwable -> L544
            com.ss.android.socialbase.downloader.ae.ae r3 = r1.oq     // Catch: java.lang.Throwable -> L544
            if (r3 == 0) goto L546
            r1.tl()     // Catch: java.lang.Throwable -> L544
            goto L546
        L544:
            r0 = move-exception
            goto L548
        L546:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L544
            goto L558
        L548:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L544
            throw r0     // Catch: java.lang.Throwable -> L54a
        L54a:
            r0 = move-exception
            goto L596
        L54c:
            com.ss.android.socialbase.downloader.impls.qv r2 = r1.tl     // Catch: java.lang.Throwable -> L54a
            r1.j(r2)     // Catch: java.lang.Throwable -> L54a
            com.ss.android.socialbase.downloader.ae.ae r2 = r1.oq     // Catch: java.lang.Throwable -> L54a
            if (r2 == 0) goto L558
            r1.tl()     // Catch: java.lang.Throwable -> L54a
        L558:
            com.ss.android.socialbase.downloader.ae.ae r2 = r1.oq
            r6 = 1
            java.io.Closeable[] r3 = new java.io.Closeable[r6]
            r3[r33] = r2
            com.ss.android.socialbase.downloader.az.m.j(r3)
            long r2 = java.lang.System.nanoTime()
            long r2 = r2 - r26
            r1.h = r2
            com.ss.android.socialbase.downloader.jy.j r10 = r1.kt
            com.ss.android.socialbase.downloader.ae.cw r11 = r1.cw
            java.lang.String r12 = r1.r
            com.ss.android.socialbase.downloader.g.g r13 = r1.m
            boolean r14 = r1.vl
            boolean r15 = r1.jy
            com.ss.android.socialbase.downloader.up.j r2 = r1.qv
            long r3 = r1.az
            long r5 = r1.av
            long r17 = r3 - r5
            long r3 = r1.h
            long r5 = r1.a
            long r7 = r1.l
            r16 = r2
            r19 = r3
            long r2 = r1.p
            r28 = 0
            r26 = r2
            r22 = r5
            r24 = r7
            com.ss.android.socialbase.downloader.tl.j.j(r10, r11, r12, r13, r14, r15, r16, r17, r19, r21, r22, r24, r26, r28)
            throw r0
        L596:
            com.ss.android.socialbase.downloader.ae.ae r2 = r1.oq
            r6 = 1
            java.io.Closeable[] r3 = new java.io.Closeable[r6]
            r3[r33] = r2
            com.ss.android.socialbase.downloader.az.m.j(r3)
            throw r0
        L5a1:
            com.ss.android.socialbase.downloader.up.ae r0 = new com.ss.android.socialbase.downloader.up.ae
            r2 = 1004(0x3ec, float:1.407E-42)
            java.lang.String r3 = "the content-length is 0"
            r0.<init>(r2, r3)
            throw r0
        L5ab:
            return
    }

    public long up() {
            r2 = this;
            long r0 = r2.la
            return r0
    }

    public void xt() {
            r1 = this;
            boolean r0 = r1.vl
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r1.vl = r0
            r1.ae()
            return
    }
}
