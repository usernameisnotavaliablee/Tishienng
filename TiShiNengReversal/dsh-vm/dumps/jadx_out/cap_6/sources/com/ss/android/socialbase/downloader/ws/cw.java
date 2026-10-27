package com.ss.android.socialbase.downloader.ws;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class cw implements com.ss.android.socialbase.downloader.ws.m, java.lang.Runnable {
    private static final java.lang.String j = "cw";
    private com.ss.android.socialbase.downloader.r.mi a;
    private volatile com.ss.android.socialbase.downloader.downloader.up ae;
    private com.ss.android.socialbase.downloader.ae.cw av;
    private final com.ss.android.socialbase.downloader.downloader.vl az;
    private volatile com.ss.android.socialbase.downloader.qv.qv c;
    private com.ss.android.socialbase.downloader.g.ae ch;
    private final com.ss.android.socialbase.downloader.ae.r cw;
    private int ed;
    private final com.ss.android.socialbase.downloader.downloader.m f;
    private boolean g;
    private boolean gq;
    private boolean h;
    private com.ss.android.socialbase.downloader.downloader.oq i;
    private final java.util.concurrent.atomic.AtomicBoolean jy;
    private final com.ss.android.socialbase.downloader.downloader.g kt;
    private volatile int l;
    private java.lang.String la;
    private final java.util.ArrayList<com.ss.android.socialbase.downloader.ws.xt> m;
    private com.ss.android.socialbase.downloader.downloader.g mi;
    private boolean oq;
    private boolean p;
    private boolean qv;
    private volatile boolean r;
    private long rn;
    private com.ss.android.socialbase.downloader.r.ch s;
    private com.ss.android.socialbase.downloader.downloader.kt tj;
    private boolean tl;
    private final com.ss.android.socialbase.downloader.jy.j uf;
    private java.util.concurrent.atomic.AtomicInteger up;
    private volatile com.ss.android.socialbase.downloader.up.j v;
    private boolean vl;
    private final com.ss.android.socialbase.downloader.downloader.oq w;
    private long wq;
    private volatile com.ss.android.socialbase.downloader.xt.oq ws;
    private com.ss.android.socialbase.downloader.g.g x;
    private java.util.concurrent.Future xt;



    static {
            return
    }

    public cw(com.ss.android.socialbase.downloader.ae.r r3, android.os.Handler r4) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.r = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.m = r1
            com.ss.android.socialbase.downloader.xt.oq r1 = com.ss.android.socialbase.downloader.xt.oq.j
            r2.ws = r1
            r1 = 5
            r2.l = r1
            r2.p = r0
            r2.h = r0
            r2.gq = r0
            r2.ed = r0
            r0 = 0
            r2.c = r0
            r2.cw = r3
            if (r3 == 0) goto L54
            com.ss.android.socialbase.downloader.ae.cw r0 = r3.j()
            r2.av = r0
            com.ss.android.socialbase.downloader.downloader.oq r0 = r3.m()
            r2.i = r0
            com.ss.android.socialbase.downloader.downloader.g r0 = r3.kt()
            r2.mi = r0
            com.ss.android.socialbase.downloader.r.ch r0 = r3.tl()
            r2.s = r0
            com.ss.android.socialbase.downloader.r.mi r0 = r3.g()
            r2.a = r0
            com.ss.android.socialbase.downloader.downloader.kt r0 = r2.j(r3)
            r2.tj = r0
            com.ss.android.socialbase.downloader.ae.cw r0 = r2.av
            int r0 = r0.ae()
            com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.j(r0)
            r2.uf = r0
            goto L5a
        L54:
            com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.cw()
            r2.uf = r0
        L5a:
            r2.tl()
            com.ss.android.socialbase.downloader.downloader.vl r0 = com.ss.android.socialbase.downloader.downloader.cw.x()
            r2.az = r0
            com.ss.android.socialbase.downloader.downloader.oq r0 = com.ss.android.socialbase.downloader.downloader.cw.uf()
            r2.w = r0
            com.ss.android.socialbase.downloader.downloader.g r0 = com.ss.android.socialbase.downloader.downloader.cw.c()
            r2.kt = r0
            com.ss.android.socialbase.downloader.downloader.m r0 = new com.ss.android.socialbase.downloader.downloader.m
            r0.<init>(r3, r4)
            r2.f = r0
            java.util.concurrent.atomic.AtomicBoolean r3 = new java.util.concurrent.atomic.AtomicBoolean
            r4 = 1
            r3.<init>(r4)
            r2.jy = r3
            return
    }

    private long a() {
            r3 = this;
            com.ss.android.socialbase.downloader.downloader.kt r0 = r3.tj
            com.ss.android.socialbase.downloader.ae.cw r1 = r3.av
            int r1 = r1.nd()
            com.ss.android.socialbase.downloader.ae.cw r2 = r3.av
            int r2 = r2.n()
            long r0 = r0.j(r1, r2)
            return r0
    }

    private void av() {
            r7 = this;
            java.lang.String r0 = com.ss.android.socialbase.downloader.ws.cw.j
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "endDownloadRunnable::runStatus="
            r1.<init>(r2)
            com.ss.android.socialbase.downloader.xt.oq r2 = r7.ws
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.ss.android.socialbase.downloader.m.j.xt(r0, r1)
            com.ss.android.socialbase.downloader.xt.oq r0 = r7.ws
            com.ss.android.socialbase.downloader.xt.oq r1 = com.ss.android.socialbase.downloader.xt.oq.xt
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L25
            com.ss.android.socialbase.downloader.xt.oq r0 = r7.ws
            com.ss.android.socialbase.downloader.xt.oq r1 = com.ss.android.socialbase.downloader.xt.oq.cw
            if (r0 == r1) goto L25
            r0 = 1
            goto L26
        L25:
            r0 = 0
        L26:
            boolean r1 = r7.v()     // Catch: java.lang.Exception -> L2c
            r4 = 0
            goto L47
        L2c:
            r1 = move-exception
            boolean r4 = r1 instanceof com.ss.android.socialbase.downloader.up.j
            if (r4 == 0) goto L39
            com.ss.android.socialbase.downloader.downloader.m r4 = r7.f
            com.ss.android.socialbase.downloader.up.j r1 = (com.ss.android.socialbase.downloader.up.j) r1
            r4.j(r1)
            goto L45
        L39:
            com.ss.android.socialbase.downloader.downloader.m r4 = r7.f
            com.ss.android.socialbase.downloader.up.j r5 = new com.ss.android.socialbase.downloader.up.j
            r6 = 1046(0x416, float:1.466E-42)
            r5.<init>(r6, r1)
            r4.j(r5)
        L45:
            r1 = 1
            r4 = 1
        L47:
            if (r1 != 0) goto L56
            if (r4 == 0) goto L4c
            goto L56
        L4c:
            r7.p = r2
            java.lang.String r0 = com.ss.android.socialbase.downloader.ws.cw.j
            java.lang.String r1 = "jump to restart"
            com.ss.android.socialbase.downloader.m.j.xt(r0, r1)
            goto L8b
        L56:
            java.util.concurrent.atomic.AtomicBoolean r1 = r7.jy
            r1.set(r3)
            if (r0 == 0) goto L8b
            com.ss.android.socialbase.downloader.impls.j r0 = com.ss.android.socialbase.downloader.downloader.cw.p()     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L8b
            r0.j(r7)     // Catch: java.lang.Throwable -> L67
            goto L8b
        L67:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
            com.ss.android.socialbase.downloader.ae.r r1 = r7.cw
            com.ss.android.socialbase.downloader.r.l r1 = r1.up()
            com.ss.android.socialbase.downloader.ae.cw r2 = r7.av
            com.ss.android.socialbase.downloader.up.j r4 = new com.ss.android.socialbase.downloader.up.j
            java.lang.String r5 = "removeDownloadRunnable"
            java.lang.String r0 = com.ss.android.socialbase.downloader.az.m.xt(r0, r5)
            r5 = 1014(0x3f6, float:1.421E-42)
            r4.<init>(r5, r0)
            com.ss.android.socialbase.downloader.ae.cw r0 = r7.av
            if (r0 == 0) goto L88
            int r3 = r0.i()
        L88:
            com.ss.android.socialbase.downloader.tl.j.j(r1, r2, r4, r3)
        L8b:
            return
    }

    private void az() {
            r3 = this;
            com.ss.android.socialbase.downloader.ae.cw r0 = r3.av
            int r0 = r0.ae()
            com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.j(r0)
            java.lang.String r1 = "reset_retain_retry_times"
            r2 = 0
            int r0 = r0.j(r1, r2)
            r1 = 1
            if (r0 != r1) goto L38
            int r0 = r3.ed
            r2 = 3
            if (r0 >= r2) goto L38
            java.util.concurrent.atomic.AtomicInteger r0 = r3.up
            com.ss.android.socialbase.downloader.ae.cw r2 = r3.av
            boolean r2 = r2.hh()
            if (r2 == 0) goto L2a
            com.ss.android.socialbase.downloader.ae.cw r2 = r3.av
            int r2 = r2.gx()
            goto L30
        L2a:
            com.ss.android.socialbase.downloader.ae.cw r2 = r3.av
            int r2 = r2.c()
        L30:
            r0.set(r2)
            int r0 = r3.ed
            int r0 = r0 + r1
            r3.ed = r0
        L38:
            return
    }

    private boolean c() {
            r1 = this;
            r0 = 0
            return r0
    }

    private boolean ch() {
            r5 = this;
            com.ss.android.socialbase.downloader.ae.cw r0 = r5.av
            boolean r0 = r0.zk()
            if (r0 == 0) goto L11
            com.ss.android.socialbase.downloader.ae.cw r0 = r5.av
            long r1 = r0.uq()
            r0.ae(r1)
        L11:
            java.lang.String r0 = com.ss.android.socialbase.downloader.ws.cw.j
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "checkCompletedByteValid: downloadInfo.getCurBytes() = "
            r1.<init>(r2)
            com.ss.android.socialbase.downloader.ae.cw r2 = r5.av
            long r2 = r2.uq()
            r1.append(r2)
            java.lang.String r2 = ",  downloadInfo.getTotalBytes() = "
            r1.append(r2)
            com.ss.android.socialbase.downloader.ae.cw r2 = r5.av
            long r2 = r2.ka()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.ss.android.socialbase.downloader.m.j.cw(r0, r1)
            com.ss.android.socialbase.downloader.ae.cw r0 = r5.av
            long r0 = r0.uq()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L69
            com.ss.android.socialbase.downloader.ae.cw r0 = r5.av
            boolean r0 = r0.nt()
            if (r0 != 0) goto L67
            com.ss.android.socialbase.downloader.ae.cw r0 = r5.av
            long r0 = r0.ka()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L69
            com.ss.android.socialbase.downloader.ae.cw r0 = r5.av
            long r0 = r0.uq()
            com.ss.android.socialbase.downloader.ae.cw r2 = r5.av
            long r2 = r2.ka()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L67
            goto L69
        L67:
            r0 = 1
            return r0
        L69:
            com.ss.android.socialbase.downloader.ae.cw r0 = r5.av
            com.ss.android.socialbase.downloader.xt.xt r1 = com.ss.android.socialbase.downloader.xt.xt.xt
            r0.j(r1)
            com.ss.android.socialbase.downloader.ae.cw r0 = r5.av
            r0.so()
            com.ss.android.socialbase.downloader.downloader.vl r0 = r5.az
            com.ss.android.socialbase.downloader.ae.cw r1 = r5.av
            r0.j(r1)
            com.ss.android.socialbase.downloader.downloader.vl r0 = r5.az
            com.ss.android.socialbase.downloader.ae.cw r1 = r5.av
            int r1 = r1.ae()
            r0.r(r1)
            com.ss.android.socialbase.downloader.downloader.vl r0 = r5.az
            com.ss.android.socialbase.downloader.ae.cw r1 = r5.av
            int r1 = r1.ae()
            r0.jy(r1)
            com.ss.android.socialbase.downloader.ae.cw r0 = r5.av
            com.ss.android.socialbase.downloader.az.m.j(r0)
            r0 = 0
            return r0
    }

    private void ed() {
            r2 = this;
            boolean r0 = r2.f()
            if (r0 == 0) goto L7
            goto L16
        L7:
            com.ss.android.socialbase.downloader.impls.j r0 = com.ss.android.socialbase.downloader.downloader.cw.p()
            if (r0 == 0) goto L16
            com.ss.android.socialbase.downloader.ae.cw r1 = r2.av
            int r1 = r1.ae()
            r0.vl(r1)
        L16:
            return
    }

    private boolean f() {
            r2 = this;
            boolean r0 = r2.tj()
            r1 = -2
            if (r0 != 0) goto L12
            com.ss.android.socialbase.downloader.ae.cw r0 = r2.av
            int r0 = r0.i()
            if (r0 != r1) goto L10
            goto L12
        L10:
            r0 = 0
            return r0
        L12:
            boolean r0 = r2.tj()
            if (r0 != 0) goto L32
            com.ss.android.socialbase.downloader.ae.cw r0 = r2.av
            int r0 = r0.i()
            if (r0 != r1) goto L25
            com.ss.android.socialbase.downloader.xt.oq r0 = com.ss.android.socialbase.downloader.xt.oq.xt
            r2.ws = r0
            goto L32
        L25:
            com.ss.android.socialbase.downloader.ae.cw r0 = r2.av
            int r0 = r0.i()
            r1 = -4
            if (r0 != r1) goto L32
            com.ss.android.socialbase.downloader.xt.oq r0 = com.ss.android.socialbase.downloader.xt.oq.cw
            r2.ws = r0
        L32:
            r0 = 1
            return r0
    }

    private boolean g() {
            r4 = this;
            com.ss.android.socialbase.downloader.ae.cw r0 = r4.av
            int r0 = r0.i()
            r1 = 1
            if (r0 == r1) goto L31
            com.ss.android.socialbase.downloader.ae.cw r2 = r4.av
            boolean r2 = r2.ig()
            if (r2 != 0) goto L31
            r1 = -2
            if (r0 == r1) goto L2f
            r1 = -4
            if (r0 == r1) goto L2f
            com.ss.android.socialbase.downloader.up.j r1 = new com.ss.android.socialbase.downloader.up.j
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "The download Task can't start, because its status is not prepare:"
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r2 = 1000(0x3e8, float:1.401E-42)
            r1.<init>(r2, r0)
            r4.xt(r1)
        L2f:
            r0 = 0
            return r0
        L31:
            return r1
    }

    private void gq() throws com.ss.android.socialbase.downloader.up.j {
            r7 = this;
            com.ss.android.socialbase.downloader.ae.cw r0 = r7.av
            java.lang.String r0 = r0.qv()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L121
            com.ss.android.socialbase.downloader.ae.cw r0 = r7.av
            java.lang.String r0 = r0.tl()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L117
            java.io.File r0 = new java.io.File
            com.ss.android.socialbase.downloader.ae.cw r1 = r7.av
            java.lang.String r1 = r1.qv()
            r0.<init>(r1)
            boolean r1 = r0.exists()
            if (r1 != 0) goto Lc2
            boolean r1 = r0.mkdirs()
            if (r1 != 0) goto L116
            boolean r2 = r0.exists()
            if (r2 != 0) goto L116
            com.ss.android.socialbase.downloader.ae.cw r2 = r7.av
            int r2 = r2.ae()
            com.ss.android.socialbase.downloader.jy.j r2 = com.ss.android.socialbase.downloader.jy.j.j(r2)
            java.lang.String r3 = "opt_mkdir_failed"
            r4 = 0
            int r2 = r2.j(r3, r4)
            r3 = 1030(0x406, float:1.443E-42)
            r5 = 1
            java.lang.String r6 = "download savePath directory can not created:"
            if (r2 != r5) goto Laa
        L4d:
            if (r1 != 0) goto L60
            int r2 = r4 + 1
            r5 = 3
            if (r4 >= r5) goto L60
            r4 = 10
            java.lang.Thread.sleep(r4)     // Catch: java.lang.InterruptedException -> L5f
            boolean r1 = r0.mkdirs()
            r4 = r2
            goto L4d
        L5f:
        L60:
            if (r1 != 0) goto L116
            boolean r0 = r0.exists()
            if (r0 != 0) goto L116
            com.ss.android.socialbase.downloader.ae.cw r0 = r7.av
            java.lang.String r0 = r0.qv()
            long r0 = com.ss.android.socialbase.downloader.az.m.r(r0)
            r4 = 16384(0x4000, double:8.095E-320)
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 >= 0) goto L92
            com.ss.android.socialbase.downloader.up.j r0 = new com.ss.android.socialbase.downloader.up.j
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r6)
            com.ss.android.socialbase.downloader.ae.cw r2 = r7.av
            java.lang.String r2 = r2.qv()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 1006(0x3ee, float:1.41E-42)
            r0.<init>(r2, r1)
            throw r0
        L92:
            com.ss.android.socialbase.downloader.up.j r0 = new com.ss.android.socialbase.downloader.up.j
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r6)
            com.ss.android.socialbase.downloader.ae.cw r2 = r7.av
            java.lang.String r2 = r2.qv()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r3, r1)
            throw r0
        Laa:
            com.ss.android.socialbase.downloader.up.j r0 = new com.ss.android.socialbase.downloader.up.j
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r6)
            com.ss.android.socialbase.downloader.ae.cw r2 = r7.av
            java.lang.String r2 = r2.qv()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r3, r1)
            throw r0
        Lc2:
            boolean r1 = r0.isDirectory()
            if (r1 != 0) goto L116
            com.ss.android.socialbase.downloader.ae.cw r1 = r7.av
            boolean r1 = com.ss.android.socialbase.downloader.az.r.xt(r1)
            r2 = 1031(0x407, float:1.445E-42)
            if (r1 == 0) goto Lfc
            r0.delete()
            boolean r1 = r0.mkdirs()
            if (r1 != 0) goto L116
            boolean r0 = r0.exists()
            if (r0 == 0) goto Le2
            goto L116
        Le2:
            com.ss.android.socialbase.downloader.up.j r0 = new com.ss.android.socialbase.downloader.up.j
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "download savePath is not directory:path="
            r1.<init>(r3)
            com.ss.android.socialbase.downloader.ae.cw r3 = r7.av
            java.lang.String r3 = r3.qv()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r2, r1)
            throw r0
        Lfc:
            com.ss.android.socialbase.downloader.up.j r0 = new com.ss.android.socialbase.downloader.up.j
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "download savePath is not a directory:"
            r1.<init>(r3)
            com.ss.android.socialbase.downloader.ae.cw r3 = r7.av
            java.lang.String r3 = r3.qv()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r2, r1)
            throw r0
        L116:
            return
        L117:
            com.ss.android.socialbase.downloader.up.j r0 = new com.ss.android.socialbase.downloader.up.j
            r1 = 1029(0x405, float:1.442E-42)
            java.lang.String r2 = "download name can not be empty"
            r0.<init>(r1, r2)
            throw r0
        L121:
            com.ss.android.socialbase.downloader.up.j r0 = new com.ss.android.socialbase.downloader.up.j
            r1 = 1028(0x404, float:1.44E-42)
            java.lang.String r2 = "download savePath can not be empty"
            r0.<init>(r1, r2)
            throw r0
    }

    private void h() throws com.ss.android.socialbase.downloader.up.j {
            r17 = this;
            r0 = r17
            r1 = 0
            com.ss.android.socialbase.downloader.ae.cw r3 = r0.av     // Catch: com.ss.android.socialbase.downloader.up.j -> Lf
            java.lang.String r3 = r3.vl()     // Catch: com.ss.android.socialbase.downloader.up.j -> Lf
            long r3 = com.ss.android.socialbase.downloader.az.m.r(r3)     // Catch: com.ss.android.socialbase.downloader.up.j -> Lf
            goto L11
        Lf:
            r3 = r1
        L11:
            java.lang.String r5 = com.ss.android.socialbase.downloader.ws.cw.j
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "checkSpaceOverflowInProgress: available = "
            r6.<init>(r7)
            double r7 = com.ss.android.socialbase.downloader.az.m.j(r3)
            r6.append(r7)
            java.lang.String r7 = "MB"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.ss.android.socialbase.downloader.m.j.cw(r5, r6)
            int r6 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r6 <= 0) goto L96
            com.ss.android.socialbase.downloader.ae.cw r6 = r0.av
            long r8 = r6.ka()
            com.ss.android.socialbase.downloader.ae.cw r6 = r0.av
            long r10 = r6.uq()
            long r8 = r8 - r10
            int r6 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r6 >= 0) goto L96
            com.ss.android.socialbase.downloader.ae.cw r6 = r0.av
            int r6 = r6.ae()
            com.ss.android.socialbase.downloader.jy.j r6 = com.ss.android.socialbase.downloader.jy.j.j(r6)
            java.lang.String r10 = "space_fill_min_keep_mb"
            r11 = 100
            int r6 = r6.j(r10, r11)
            if (r6 <= 0) goto L96
            long r10 = (long) r6
            r12 = 1048576(0x100000, double:5.180654E-318)
            long r10 = r10 * r12
            long r10 = r3 - r10
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = "checkSpaceOverflowInProgress: minKeep  = "
            r14.<init>(r15)
            r14.append(r6)
            java.lang.String r6 = "MB, canDownload = "
            r14.append(r6)
            r15 = r12
            double r12 = com.ss.android.socialbase.downloader.az.m.j(r10)
            r14.append(r12)
            r14.append(r7)
            java.lang.String r6 = r14.toString()
            com.ss.android.socialbase.downloader.m.j.cw(r5, r6)
            int r5 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r5 <= 0) goto L8e
            com.ss.android.socialbase.downloader.ae.cw r1 = r0.av
            long r1 = r1.uq()
            long r10 = r10 + r15
            long r1 = r1 + r10
            r0.rn = r1
            return
        L8e:
            r0.rn = r1
            com.ss.android.socialbase.downloader.up.up r1 = new com.ss.android.socialbase.downloader.up.up
            r1.<init>(r3, r8)
            throw r1
        L96:
            r0.rn = r1
            return
    }

    private void i() {
            r1 = this;
            com.ss.android.socialbase.downloader.g.ae r0 = r1.ch
            if (r0 == 0) goto La
            r0.cw()
            r0 = 0
            r1.ch = r0
        La:
            return
    }

    private int j(long r7, java.util.List<com.ss.android.socialbase.downloader.ae.xt> r9) {
            r6 = this;
            boolean r0 = r6.p()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L5e
            boolean r0 = r6.g
            if (r0 == 0) goto L1a
            if (r9 == 0) goto L13
            int r9 = r9.size()
            goto L5c
        L13:
            com.ss.android.socialbase.downloader.ae.cw r9 = r6.av
            int r9 = r9.kj()
            goto L5c
        L1a:
            com.ss.android.socialbase.downloader.downloader.oq r9 = r6.i
            if (r9 == 0) goto L23
            int r9 = r9.j(r7)
            goto L29
        L23:
            com.ss.android.socialbase.downloader.downloader.oq r9 = r6.w
            int r9 = r9.j(r7)
        L29:
            com.ss.android.socialbase.downloader.g.vl r0 = com.ss.android.socialbase.downloader.g.vl.j()
            com.ss.android.socialbase.downloader.g.jy r0 = r0.xt()
            java.lang.String r3 = com.ss.android.socialbase.downloader.ws.cw.j
            java.lang.String r4 = r0.name()
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r5[r1] = r4
            java.lang.String r4 = "NetworkQuality is : %s"
            java.lang.String r4 = java.lang.String.format(r4, r5)
            com.ss.android.socialbase.downloader.m.j.xt(r3, r4)
            com.ss.android.socialbase.downloader.ae.cw r3 = r6.av
            java.lang.String r4 = r0.name()
            r3.tl(r4)
            com.ss.android.socialbase.downloader.downloader.g r3 = r6.mi
            if (r3 == 0) goto L56
            int r9 = r3.j(r9, r0)
            goto L5c
        L56:
            com.ss.android.socialbase.downloader.downloader.g r3 = r6.kt
            int r9 = r3.j(r9, r0)
        L5c:
            if (r9 > 0) goto L5f
        L5e:
            r9 = 1
        L5f:
            boolean r0 = com.ss.android.socialbase.downloader.m.j.j()
            if (r0 == 0) goto L88
            java.lang.String r0 = com.ss.android.socialbase.downloader.ws.cw.j
            java.lang.String r3 = java.lang.String.valueOf(r9)
            com.ss.android.socialbase.downloader.ae.cw r4 = r6.av
            java.lang.String r4 = r4.tl()
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r1] = r3
            r8[r2] = r4
            r1 = 2
            r8[r1] = r7
            java.lang.String r7 = "chunk count : %s for %s contentLen:%s"
            java.lang.String r7 = java.lang.String.format(r7, r8)
            com.ss.android.socialbase.downloader.m.j.xt(r0, r7)
        L88:
            return r9
    }

    public static com.ss.android.socialbase.downloader.ae.xt j(com.ss.android.socialbase.downloader.ae.cw r3, long r4) {
            com.ss.android.socialbase.downloader.ae.xt$j r0 = new com.ss.android.socialbase.downloader.ae.xt$j
            int r1 = r3.ae()
            r0.<init>(r1)
            r1 = -1
            com.ss.android.socialbase.downloader.ae.xt$j r0 = r0.j(r1)
            r1 = 0
            com.ss.android.socialbase.downloader.ae.xt$j r0 = r0.j(r1)
            com.ss.android.socialbase.downloader.ae.xt$j r0 = r0.up(r4)
            com.ss.android.socialbase.downloader.ae.xt$j r0 = r0.xt(r4)
            com.ss.android.socialbase.downloader.ae.xt$j r0 = r0.cw(r1)
            long r1 = r3.ka()
            long r1 = r1 - r4
            com.ss.android.socialbase.downloader.ae.xt$j r3 = r0.r(r1)
            com.ss.android.socialbase.downloader.ae.xt r3 = r3.j()
            return r3
    }

    private com.ss.android.socialbase.downloader.ae.xt j(com.ss.android.socialbase.downloader.ae.xt r9, int r10) {
            r8 = this;
            boolean r0 = r9.r()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r0 = 1
            long r2 = r9.cw(r0)
            java.lang.String r4 = com.ss.android.socialbase.downloader.ws.cw.j
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "reuseChunk retainLen:"
            r5.<init>(r6)
            r5.append(r2)
            java.lang.String r6 = " chunkIndex:"
            r5.append(r6)
            r5.append(r10)
            java.lang.String r5 = r5.toString()
            com.ss.android.socialbase.downloader.m.j.xt(r4, r5)
            boolean r4 = r9.m()
            if (r4 != 0) goto L64
            long r4 = com.ss.android.socialbase.downloader.xt.up.m
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L64
            com.ss.android.socialbase.downloader.ae.cw r2 = r8.av
            boolean r2 = r2.av()
            if (r2 == 0) goto L64
            com.ss.android.socialbase.downloader.ae.cw r2 = r8.av
            int r2 = r2.kj()
            com.ss.android.socialbase.downloader.ae.cw r3 = r8.av
            long r3 = r3.ka()
            java.util.List r2 = r9.j(r2, r3)
            if (r2 == 0) goto L6a
            java.util.Iterator r2 = r2.iterator()
        L52:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L6a
            java.lang.Object r3 = r2.next()
            com.ss.android.socialbase.downloader.ae.xt r3 = (com.ss.android.socialbase.downloader.ae.xt) r3
            com.ss.android.socialbase.downloader.downloader.vl r4 = r8.az
            r4.xt(r3)
            goto L52
        L64:
            boolean r2 = r9.m()
            if (r2 == 0) goto L129
        L6a:
            boolean r2 = r9.m()
            if (r2 == 0) goto L129
            r2 = 1
        L71:
            java.util.List r3 = r9.ae()
            int r3 = r3.size()
            if (r2 >= r3) goto Ld9
            java.util.List r3 = r9.ae()
            java.lang.Object r3 = r3.get(r2)
            com.ss.android.socialbase.downloader.ae.xt r3 = (com.ss.android.socialbase.downloader.ae.xt) r3
            if (r3 == 0) goto Ld6
            java.lang.String r4 = com.ss.android.socialbase.downloader.ws.cw.j
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "check can checkUnCompletedChunk -- chunkIndex:"
            r5.<init>(r6)
            int r6 = r3.mi()
            r5.append(r6)
            java.lang.String r6 = " currentOffset:"
            r5.append(r6)
            long r6 = r3.ws()
            r5.append(r6)
            java.lang.String r6 = "  startOffset:"
            r5.append(r6)
            long r6 = r3.vl()
            r5.append(r6)
            java.lang.String r6 = " contentLen:"
            r5.append(r6)
            long r6 = r3.i()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.ss.android.socialbase.downloader.m.j.xt(r4, r5)
            int r4 = r3.mi()
            if (r4 < 0) goto Ld4
            boolean r4 = r3.g()
            if (r4 != 0) goto Ld6
            boolean r4 = r3.cw()
            if (r4 != 0) goto Ld6
        Ld4:
            r1 = r3
            goto Ld9
        Ld6:
            int r2 = r2 + 1
            goto L71
        Ld9:
            if (r1 == 0) goto L129
            long r2 = r9.ws()
            java.lang.String r4 = com.ss.android.socialbase.downloader.ws.cw.j
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "unComplete chunk "
            r5.<init>(r6)
            int r9 = r9.mi()
            r5.append(r9)
            java.lang.String r9 = " curOffset:"
            r5.append(r9)
            r5.append(r2)
            java.lang.String r9 = " reuseChunk chunkIndex:"
            r5.append(r9)
            r5.append(r10)
            java.lang.String r9 = " for subChunk:"
            r5.append(r9)
            int r9 = r1.mi()
            r5.append(r9)
            java.lang.String r9 = r5.toString()
            com.ss.android.socialbase.downloader.m.j.xt(r4, r9)
            com.ss.android.socialbase.downloader.downloader.vl r9 = r8.az
            int r2 = r1.qv()
            int r3 = r1.mi()
            int r4 = r1.xt()
            r9.j(r2, r3, r4, r10)
            r1.cw(r10)
            r1.j(r0)
        L129:
            return r1
    }

    private com.ss.android.socialbase.downloader.downloader.kt j(com.ss.android.socialbase.downloader.ae.r r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.kt r0 = r2.ae()
            if (r0 == 0) goto L7
            return r0
        L7:
            com.ss.android.socialbase.downloader.ae.cw r2 = r2.j()
            if (r2 == 0) goto L1d
            java.lang.String r2 = r2.tk()
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L1d
            com.ss.android.socialbase.downloader.impls.i r0 = new com.ss.android.socialbase.downloader.impls.i
            r0.<init>(r2)
            return r0
        L1d:
            com.ss.android.socialbase.downloader.downloader.kt r2 = com.ss.android.socialbase.downloader.downloader.cw.gx()
            return r2
    }

    private java.util.List<com.ss.android.socialbase.downloader.ae.up> j(com.ss.android.socialbase.downloader.ae.xt r4) {
            r3 = this;
            com.ss.android.socialbase.downloader.ae.cw r0 = r3.av
            java.util.List r0 = r0.uf()
            com.ss.android.socialbase.downloader.ae.cw r1 = r3.av
            java.lang.String r1 = r1.u()
            java.util.List r4 = com.ss.android.socialbase.downloader.az.m.j(r0, r1, r4)
            com.ss.android.socialbase.downloader.ae.cw r0 = r3.av
            boolean r0 = r0.ki()
            if (r0 == 0) goto L57
            boolean r0 = r3.gq
            if (r0 == 0) goto L57
            com.ss.android.socialbase.downloader.ae.cw r0 = r3.av
            java.lang.String r0 = r0.zz()
            if (r0 == 0) goto L57
            com.ss.android.socialbase.downloader.ae.up r0 = new com.ss.android.socialbase.downloader.ae.up
            com.ss.android.socialbase.downloader.ae.cw r1 = r3.av
            java.lang.String r1 = r1.zz()
            java.lang.String r2 = "if-modified-since"
            r0.<init>(r2, r1)
            r4.add(r0)
            com.ss.android.socialbase.downloader.ae.up r0 = new com.ss.android.socialbase.downloader.ae.up
            java.lang.String r1 = "download-tc21-1-15"
            r0.<init>(r1, r1)
            r4.add(r0)
            java.lang.String r0 = com.ss.android.socialbase.downloader.ws.cw.j
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "dcache::add head IF_MODIFIED_SINCE="
            r1.<init>(r2)
            com.ss.android.socialbase.downloader.ae.cw r2 = r3.av
            java.lang.String r2 = r2.zz()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.ss.android.socialbase.downloader.m.j.xt(r0, r1)
        L57:
            return r4
    }

    private void j(int r3, java.util.List<com.ss.android.socialbase.downloader.ae.xt> r4) throws com.ss.android.socialbase.downloader.up.j {
            r2 = this;
            int r0 = r4.size()
            if (r0 != r3) goto L10
            com.ss.android.socialbase.downloader.ae.cw r3 = r2.av
            long r0 = r3.ka()
            r2.j(r4, r0)
            return
        L10:
            com.ss.android.socialbase.downloader.up.j r3 = new com.ss.android.socialbase.downloader.up.j
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>()
            r0 = 1033(0x409, float:1.448E-42)
            r3.<init>(r0, r4)
            throw r3
    }

    private void j(long r18, int r20) throws com.ss.android.socialbase.downloader.up.j {
            r17 = this;
            r0 = r17
            r1 = r18
            r3 = r20
            long r4 = (long) r3
            long r4 = r1 / r4
            com.ss.android.socialbase.downloader.ae.cw r6 = r0.av
            int r6 = r6.ae()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r8 = 0
            r10 = 0
            r11 = r8
        L18:
            if (r10 >= r3) goto L4e
            int r13 = r3 + (-1)
            if (r10 != r13) goto L20
            r13 = r8
            goto L25
        L20:
            long r13 = r11 + r4
            r15 = 1
            long r13 = r13 - r15
        L25:
            com.ss.android.socialbase.downloader.ae.xt$j r15 = new com.ss.android.socialbase.downloader.ae.xt$j
            r15.<init>(r6)
            com.ss.android.socialbase.downloader.ae.xt$j r15 = r15.j(r10)
            com.ss.android.socialbase.downloader.ae.xt$j r15 = r15.j(r11)
            com.ss.android.socialbase.downloader.ae.xt$j r15 = r15.up(r11)
            com.ss.android.socialbase.downloader.ae.xt$j r15 = r15.xt(r11)
            com.ss.android.socialbase.downloader.ae.xt$j r13 = r15.cw(r13)
            com.ss.android.socialbase.downloader.ae.xt r13 = r13.j()
            r7.add(r13)
            com.ss.android.socialbase.downloader.downloader.vl r14 = r0.az
            r14.j(r13)
            long r11 = r11 + r4
            int r10 = r10 + 1
            goto L18
        L4e:
            com.ss.android.socialbase.downloader.ae.cw r4 = r0.av
            r4.up(r3)
            com.ss.android.socialbase.downloader.downloader.vl r4 = r0.az
            r4.j(r6, r3)
            r0.j(r7, r1)
            return
    }

    private void j(com.ss.android.socialbase.downloader.ae.xt r10, java.lang.String r11, com.ss.android.socialbase.downloader.g.g r12) throws com.ss.android.socialbase.downloader.up.j {
            r9 = this;
            com.ss.android.socialbase.downloader.ae.cw r0 = r9.av
            long r0 = r0.ka()
            long r2 = r10.ws()
            long r0 = r0 - r2
            r10.j(r0)
            com.ss.android.socialbase.downloader.ae.cw r0 = r9.av
            r1 = 1
            r0.up(r1)
            com.ss.android.socialbase.downloader.downloader.vl r0 = r9.az
            com.ss.android.socialbase.downloader.ae.cw r2 = r9.av
            int r2 = r2.ae()
            r0.j(r2, r1)
            com.ss.android.socialbase.downloader.downloader.up r3 = new com.ss.android.socialbase.downloader.downloader.up
            com.ss.android.socialbase.downloader.ae.cw r4 = r9.av
            r8 = r9
            r7 = r10
            r5 = r11
            r6 = r12
            r3.<init>(r4, r5, r6, r7, r8)
            r8.ae = r3
            r9.kt()
            return
    }

    static /* synthetic */ void j(com.ss.android.socialbase.downloader.ws.cw r0) {
            r0.ed()
            return
    }

    static /* synthetic */ void j(com.ss.android.socialbase.downloader.ws.cw r0, java.util.List r1) {
            r0.j(r1)
            return
    }

    private void j(java.lang.String r3, java.lang.String r4) throws com.ss.android.socialbase.downloader.up.oq {
            r2 = this;
            com.ss.android.socialbase.downloader.downloader.vl r0 = r2.az
            com.ss.android.socialbase.downloader.ae.cw r1 = r2.av
            int r1 = r1.ae()
            r0.r(r1)
            com.ss.android.socialbase.downloader.downloader.vl r0 = r2.az
            com.ss.android.socialbase.downloader.ae.cw r1 = r2.av
            int r1 = r1.ae()
            r0.jy(r1)
            com.ss.android.socialbase.downloader.ae.cw r0 = r2.av
            com.ss.android.socialbase.downloader.az.m.j(r0)
            r0 = 0
            r2.g = r0
            com.ss.android.socialbase.downloader.ae.cw r0 = r2.av
            r0.vl(r3)
            com.ss.android.socialbase.downloader.downloader.vl r3 = r2.az
            com.ss.android.socialbase.downloader.ae.cw r0 = r2.av
            r3.j(r0)
            com.ss.android.socialbase.downloader.up.oq r3 = new com.ss.android.socialbase.downloader.up.oq
            r3.<init>(r4)
            throw r3
    }

    private void j(java.lang.String r11, java.util.List<com.ss.android.socialbase.downloader.ae.up> r12) throws com.ss.android.socialbase.downloader.up.j, com.ss.android.socialbase.downloader.up.oq {
            r10 = this;
            com.ss.android.socialbase.downloader.g.g r0 = r10.x
            if (r0 == 0) goto L6
            goto Lf7
        L6:
            com.ss.android.socialbase.downloader.ae.cw r0 = r10.av
            int r0 = r0.kj()
            r1 = 1
            if (r0 != r1) goto L18
            com.ss.android.socialbase.downloader.g.j.j r0 = com.ss.android.socialbase.downloader.g.j.j.j()
            com.ss.android.socialbase.downloader.g.j.r r0 = r0.xt(r11, r12)
            goto L19
        L18:
            r0 = 0
        L19:
            if (r0 == 0) goto L2a
            com.ss.android.socialbase.downloader.g.g r11 = r10.x
            r10.j(r11)
            com.ss.android.socialbase.downloader.ae.cw r11 = r10.av
            r12 = 2
            r11.az(r12)
            r10.x = r0
            goto Lf3
        L2a:
            com.ss.android.socialbase.downloader.ae.cw r0 = r10.av     // Catch: com.ss.android.socialbase.downloader.up.j -> L5f java.lang.Throwable -> L63
            boolean r2 = r0.az()     // Catch: com.ss.android.socialbase.downloader.up.j -> L5f java.lang.Throwable -> L63
            com.ss.android.socialbase.downloader.ae.cw r0 = r10.av     // Catch: com.ss.android.socialbase.downloader.up.j -> L5f java.lang.Throwable -> L63
            int r3 = r0.ed()     // Catch: com.ss.android.socialbase.downloader.up.j -> L5f java.lang.Throwable -> L63
            com.ss.android.socialbase.downloader.jy.j r0 = r10.uf     // Catch: com.ss.android.socialbase.downloader.up.j -> L5f java.lang.Throwable -> L63
            java.lang.String r4 = "net_lib_strategy"
            int r7 = r0.xt(r4)     // Catch: com.ss.android.socialbase.downloader.up.j -> L5f java.lang.Throwable -> L63
            com.ss.android.socialbase.downloader.jy.j r0 = r10.uf     // Catch: com.ss.android.socialbase.downloader.up.j -> L5f java.lang.Throwable -> L63
            java.lang.String r4 = "monitor_download_connect"
            r5 = 0
            int r0 = r0.j(r4, r5)     // Catch: com.ss.android.socialbase.downloader.up.j -> L5f java.lang.Throwable -> L63
            if (r0 <= 0) goto L4b
            r8 = 1
            goto L4c
        L4b:
            r8 = 0
        L4c:
            com.ss.android.socialbase.downloader.ae.cw r9 = r10.av     // Catch: com.ss.android.socialbase.downloader.up.j -> L5f java.lang.Throwable -> L63
            r5 = 0
            r4 = r11
            r6 = r12
            com.ss.android.socialbase.downloader.g.g r11 = com.ss.android.socialbase.downloader.downloader.cw.j(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L5c com.ss.android.socialbase.downloader.up.j -> L5f
            r10.x = r11     // Catch: java.lang.Throwable -> L5c com.ss.android.socialbase.downloader.up.j -> L5f
        L57:
            r10.j(r11)
            goto Lf3
        L5c:
            r0 = move-exception
        L5d:
            r11 = r0
            goto L66
        L5f:
            r0 = move-exception
            r11 = r0
            goto L107
        L63:
            r0 = move-exception
            r6 = r12
            goto L5d
        L66:
            com.ss.android.socialbase.downloader.ae.cw r12 = r10.av     // Catch: java.lang.Throwable -> Lb7
            boolean r12 = r12.ki()     // Catch: java.lang.Throwable -> Lb7
            if (r12 == 0) goto Ld0
            boolean r12 = com.ss.android.socialbase.downloader.az.m.ae(r11)     // Catch: java.lang.Throwable -> Lb7
            if (r12 == 0) goto Ld0
            boolean r12 = com.ss.android.socialbase.downloader.az.m.cw(r6)     // Catch: java.lang.Throwable -> Lb7
            if (r12 == 0) goto Ld0
            java.lang.String r11 = com.ss.android.socialbase.downloader.ws.cw.j     // Catch: java.lang.Throwable -> Lb7
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r0 = "dcache=execepiton responseCode=304 lastModified not changed, use local file.. old cacheControl="
            r12.<init>(r0)     // Catch: java.lang.Throwable -> Lb7
            com.ss.android.socialbase.downloader.ae.cw r0 = r10.av     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r0 = r0.ry()     // Catch: java.lang.Throwable -> Lb7
            r12.append(r0)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> Lb7
            com.ss.android.socialbase.downloader.m.j.xt(r11, r12)     // Catch: java.lang.Throwable -> Lb7
            com.ss.android.socialbase.downloader.ae.cw r11 = r10.av     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r11 = r11.ry()     // Catch: java.lang.Throwable -> Lb7
            long r11 = com.ss.android.socialbase.downloader.az.m.g(r11)     // Catch: java.lang.Throwable -> Lb7
            r0 = 0
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 > 0) goto Lba
            com.ss.android.socialbase.downloader.ae.cw r11 = r10.av     // Catch: java.lang.Throwable -> Lb7
            int r11 = r11.ae()     // Catch: java.lang.Throwable -> Lb7
            com.ss.android.socialbase.downloader.jy.j r11 = com.ss.android.socialbase.downloader.jy.j.j(r11)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r12 = "default_304_max_age"
            r0 = 300(0x12c, float:4.2E-43)
            int r11 = r11.j(r12, r0)     // Catch: java.lang.Throwable -> Lb7
            long r11 = (long) r11     // Catch: java.lang.Throwable -> Lb7
            goto Lba
        Lb7:
            r0 = move-exception
            r11 = r0
            goto L108
        Lba:
            com.ss.android.socialbase.downloader.ae.cw r0 = r10.av     // Catch: java.lang.Throwable -> Lb7
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lb7
            r3 = 1000(0x3e8, double:4.94E-321)
            long r11 = r11 * r3
            long r1 = r1 + r11
            r0.r(r1)     // Catch: java.lang.Throwable -> Lb7
            com.ss.android.socialbase.downloader.up.xt r11 = new com.ss.android.socialbase.downloader.up.xt     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r12 = r10.la     // Catch: java.lang.Throwable -> Lb7
            r11.<init>(r12)     // Catch: java.lang.Throwable -> Lb7
            throw r11     // Catch: java.lang.Throwable -> Lb7
        Ld0:
            boolean r12 = com.ss.android.socialbase.downloader.az.m.m(r11)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r0 = ""
            if (r12 == 0) goto Lde
            java.lang.String r11 = "http code 416"
            r10.j(r0, r11)     // Catch: java.lang.Throwable -> Lb7
            goto Lef
        Lde:
            boolean r12 = com.ss.android.socialbase.downloader.az.m.up(r11)     // Catch: java.lang.Throwable -> Lb7
            if (r12 == 0) goto Lea
            java.lang.String r11 = "http code 412"
            r10.j(r0, r11)     // Catch: java.lang.Throwable -> Lb7
            goto Lef
        Lea:
            java.lang.String r12 = "CreateFirstConnection"
            com.ss.android.socialbase.downloader.az.m.j(r11, r12)     // Catch: java.lang.Throwable -> Lb7
        Lef:
            com.ss.android.socialbase.downloader.g.g r11 = r10.x
            goto L57
        Lf3:
            com.ss.android.socialbase.downloader.g.g r11 = r10.x
            if (r11 == 0) goto Lf8
        Lf7:
            return
        Lf8:
            com.ss.android.socialbase.downloader.up.j r11 = new com.ss.android.socialbase.downloader.up.j
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r0 = "download can't continue, firstConnection is null"
            r12.<init>(r0)
            r0 = 1022(0x3fe, float:1.432E-42)
            r11.<init>(r0, r12)
            throw r11
        L107:
            throw r11     // Catch: java.lang.Throwable -> Lb7
        L108:
            com.ss.android.socialbase.downloader.g.g r12 = r10.x
            r10.j(r12)
            throw r11
    }

    private void j(java.lang.String r2, java.util.List<com.ss.android.socialbase.downloader.ae.up> r3, long r4) throws com.ss.android.socialbase.downloader.up.j, com.ss.android.socialbase.downloader.up.oq {
            r1 = this;
            r1.xt(r2, r3, r4)
            com.ss.android.socialbase.downloader.g.ae r0 = r1.ch
            if (r0 == 0) goto Le
            r1.j(r2, r0, r4)     // Catch: java.lang.Throwable -> Lb
            goto Le
        Lb:
            r0 = 1
            r1.h = r0
        Le:
            com.ss.android.socialbase.downloader.g.ae r0 = r1.ch
            if (r0 == 0) goto L16
            boolean r0 = r1.h
            if (r0 == 0) goto L1e
        L16:
            r1.j(r2, r3)
            com.ss.android.socialbase.downloader.g.g r3 = r1.x
            r1.j(r2, r3, r4)
        L1e:
            return
    }

    private void j(java.util.List<java.lang.String> r4) {
            r3 = this;
            if (r4 == 0) goto L26
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L9
            goto L26
        L9:
            com.ss.android.socialbase.downloader.ae.cw r0 = r3.av
            com.ss.android.socialbase.downloader.xt.oq r1 = r3.ws
            com.ss.android.socialbase.downloader.xt.oq r2 = com.ss.android.socialbase.downloader.xt.oq.ae
            if (r1 != r2) goto L13
            r1 = 1
            goto L14
        L13:
            r1 = 0
        L14:
            r0.j(r4, r1)
            com.ss.android.socialbase.downloader.impls.j r4 = com.ss.android.socialbase.downloader.downloader.cw.p()
            if (r4 == 0) goto L26
            com.ss.android.socialbase.downloader.ae.cw r0 = r3.av
            int r0 = r0.ae()
            r4.vl(r0)
        L26:
            return
    }

    private void j(java.util.List<com.ss.android.socialbase.downloader.ae.xt> r8, long r9) throws com.ss.android.socialbase.downloader.up.j {
            r7 = this;
            java.util.Iterator r8 = r8.iterator()
        L4:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L83
            java.lang.Object r0 = r8.next()
            com.ss.android.socialbase.downloader.ae.xt r0 = (com.ss.android.socialbase.downloader.ae.xt) r0
            if (r0 == 0) goto L4
            long r1 = r0.av()
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L23
            long r1 = r0.ws()
            long r1 = r9 - r1
            goto L2f
        L23:
            long r1 = r0.av()
            long r5 = r0.ws()
            long r1 = r1 - r5
            r5 = 1
            long r1 = r1 + r5
        L2f:
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L4
            r0.j(r1)
            com.ss.android.socialbase.downloader.ae.cw r1 = r7.av
            boolean r1 = r1.ln()
            if (r1 == 0) goto L76
            com.ss.android.socialbase.downloader.g.g r1 = r7.x
            if (r1 == 0) goto L76
            com.ss.android.socialbase.downloader.ae.cw r1 = r7.av
            boolean r1 = r1.y()
            if (r1 == 0) goto L4e
            boolean r1 = r7.h
            if (r1 == 0) goto L76
        L4e:
            int r1 = r0.mi()
            if (r1 != 0) goto L63
            com.ss.android.socialbase.downloader.ws.xt r1 = new com.ss.android.socialbase.downloader.ws.xt
            com.ss.android.socialbase.downloader.ae.r r2 = r7.cw
            com.ss.android.socialbase.downloader.g.g r3 = r7.x
            r1.<init>(r0, r2, r3, r7)
            java.util.ArrayList<com.ss.android.socialbase.downloader.ws.xt> r0 = r7.m
            r0.add(r1)
            goto L4
        L63:
            int r1 = r0.mi()
            if (r1 <= 0) goto L4
            com.ss.android.socialbase.downloader.ws.xt r1 = new com.ss.android.socialbase.downloader.ws.xt
            com.ss.android.socialbase.downloader.ae.r r2 = r7.cw
            r1.<init>(r0, r2, r7)
            java.util.ArrayList<com.ss.android.socialbase.downloader.ws.xt> r0 = r7.m
            r0.add(r1)
            goto L4
        L76:
            com.ss.android.socialbase.downloader.ws.xt r1 = new com.ss.android.socialbase.downloader.ws.xt
            com.ss.android.socialbase.downloader.ae.r r2 = r7.cw
            r1.<init>(r0, r2, r7)
            java.util.ArrayList<com.ss.android.socialbase.downloader.ws.xt> r0 = r7.m
            r0.add(r1)
            goto L4
        L83:
            r8 = 64
            boolean r8 = com.ss.android.socialbase.downloader.az.j.j(r8)
            if (r8 == 0) goto L106
            java.util.ArrayList r8 = new java.util.ArrayList
            java.util.ArrayList<com.ss.android.socialbase.downloader.ws.xt> r9 = r7.m
            int r9 = r9.size()
            r8.<init>(r9)
            java.util.ArrayList<com.ss.android.socialbase.downloader.ws.xt> r9 = r7.m
            java.util.Iterator r9 = r9.iterator()
        L9c:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto Lc0
            java.lang.Object r10 = r9.next()
            com.ss.android.socialbase.downloader.ws.xt r10 = (com.ss.android.socialbase.downloader.ws.xt) r10
            com.ss.android.socialbase.downloader.xt.oq r0 = r7.ws
            com.ss.android.socialbase.downloader.xt.oq r1 = com.ss.android.socialbase.downloader.xt.oq.cw
            if (r0 != r1) goto Lb2
            r10.xt()
            goto L9c
        Lb2:
            com.ss.android.socialbase.downloader.xt.oq r0 = r7.ws
            com.ss.android.socialbase.downloader.xt.oq r1 = com.ss.android.socialbase.downloader.xt.oq.xt
            if (r0 != r1) goto Lbc
            r10.j()
            goto L9c
        Lbc:
            r8.add(r10)
            goto L9c
        Lc0:
            r9 = 0
            java.lang.Object r9 = r8.remove(r9)
            java.lang.Runnable r9 = (java.lang.Runnable) r9
            java.util.List r8 = com.ss.android.socialbase.downloader.impls.up.r(r8)     // Catch: java.lang.Throwable -> L145
        Lcb:
            if (r9 == 0) goto Le2
            boolean r10 = r7.f()     // Catch: java.lang.Throwable -> L145
            if (r10 == 0) goto Ld5
            goto L145
        Ld5:
            r9.run()     // Catch: java.lang.Throwable -> Ld9
            goto Ldd
        Ld9:
            r9 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r9)     // Catch: java.lang.Throwable -> L145
        Ldd:
            java.lang.Runnable r9 = com.ss.android.socialbase.downloader.impls.up.up(r8)     // Catch: java.lang.Throwable -> L145
            goto Lcb
        Le2:
            if (r8 == 0) goto L145
            boolean r9 = r8.isEmpty()     // Catch: java.lang.Throwable -> L145
            if (r9 != 0) goto L145
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L145
        Lee:
            boolean r9 = r8.hasNext()     // Catch: java.lang.Throwable -> L145
            if (r9 == 0) goto L145
            java.lang.Object r9 = r8.next()     // Catch: java.lang.Throwable -> L145
            java.util.concurrent.Future r9 = (java.util.concurrent.Future) r9     // Catch: java.lang.Throwable -> L145
            if (r9 == 0) goto Lee
            boolean r10 = r9.isDone()     // Catch: java.lang.Throwable -> L145
            if (r10 != 0) goto Lee
            r9.get()     // Catch: java.lang.Throwable -> Lee
            goto Lee
        L106:
            java.util.ArrayList r8 = new java.util.ArrayList
            java.util.ArrayList<com.ss.android.socialbase.downloader.ws.xt> r9 = r7.m
            int r9 = r9.size()
            r8.<init>(r9)
            java.util.ArrayList<com.ss.android.socialbase.downloader.ws.xt> r9 = r7.m
            java.util.Iterator r9 = r9.iterator()
        L117:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L13f
            java.lang.Object r10 = r9.next()
            com.ss.android.socialbase.downloader.ws.xt r10 = (com.ss.android.socialbase.downloader.ws.xt) r10
            com.ss.android.socialbase.downloader.xt.oq r0 = r7.ws
            com.ss.android.socialbase.downloader.xt.oq r1 = com.ss.android.socialbase.downloader.xt.oq.cw
            if (r0 != r1) goto L12d
            r10.xt()
            goto L117
        L12d:
            com.ss.android.socialbase.downloader.xt.oq r0 = r7.ws
            com.ss.android.socialbase.downloader.xt.oq r1 = com.ss.android.socialbase.downloader.xt.oq.xt
            if (r0 != r1) goto L137
            r10.j()
            goto L117
        L137:
            java.util.concurrent.Callable r10 = java.util.concurrent.Executors.callable(r10)
            r8.add(r10)
            goto L117
        L13f:
            boolean r9 = r7.f()
            if (r9 == 0) goto L146
        L145:
            return
        L146:
            com.ss.android.socialbase.downloader.impls.up.cw(r8)     // Catch: java.lang.InterruptedException -> L14a
            return
        L14a:
            r8 = move-exception
            com.ss.android.socialbase.downloader.up.j r9 = new com.ss.android.socialbase.downloader.up.j
            r10 = 1020(0x3fc, float:1.43E-42)
            r9.<init>(r10, r8)
            throw r9
    }

    private boolean j(int r5, java.lang.String r6, java.lang.String r7) {
            r4 = this;
            r0 = 412(0x19c, float:5.77E-43)
            r1 = 1
            if (r5 != r0) goto L6
            return r1
        L6:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L21
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L21
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L21
            boolean r6 = r4.qv
            if (r6 != 0) goto L20
            boolean r6 = r4.oq
            if (r6 == 0) goto L21
        L20:
            return r1
        L21:
            r6 = 201(0xc9, float:2.82E-43)
            if (r5 == r6) goto L29
            r6 = 416(0x1a0, float:5.83E-43)
            if (r5 != r6) goto L36
        L29:
            com.ss.android.socialbase.downloader.ae.cw r5 = r4.av
            long r5 = r5.uq()
            r2 = 0
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 <= 0) goto L36
            return r1
        L36:
            r5 = 0
            return r5
    }

    private void jy() {
            r3 = this;
            java.lang.String r0 = com.ss.android.socialbase.downloader.ws.cw.j
            java.lang.String r1 = "finishWithFileExist"
            com.ss.android.socialbase.downloader.m.j.xt(r0, r1)
            com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.cw()
            java.lang.String r1 = "fix_end_for_file_exist_error"
            r2 = 1
            boolean r0 = r0.xt(r1, r2)
            if (r0 == 0) goto L2c
            java.lang.String r0 = r3.la
            com.ss.android.socialbase.downloader.ae.cw r1 = r3.av
            java.lang.String r1 = r1.tl()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L27
            com.ss.android.socialbase.downloader.xt.oq r0 = com.ss.android.socialbase.downloader.xt.oq.up
            r3.ws = r0
            return
        L27:
            com.ss.android.socialbase.downloader.xt.oq r0 = com.ss.android.socialbase.downloader.xt.oq.tl
            r3.ws = r0
            return
        L2c:
            java.lang.String r0 = r3.la
            com.ss.android.socialbase.downloader.ae.cw r1 = r3.av
            java.lang.String r1 = r1.ws()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3f
            com.ss.android.socialbase.downloader.xt.oq r0 = com.ss.android.socialbase.downloader.xt.oq.up
            r3.ws = r0
            return
        L3f:
            com.ss.android.socialbase.downloader.xt.oq r0 = com.ss.android.socialbase.downloader.xt.oq.tl
            r3.ws = r0
            return
    }

    private void kt() throws com.ss.android.socialbase.downloader.up.j {
            r2 = this;
            com.ss.android.socialbase.downloader.downloader.up r0 = r2.ae
            if (r0 == 0) goto L2d
            com.ss.android.socialbase.downloader.xt.oq r0 = r2.ws
            com.ss.android.socialbase.downloader.xt.oq r1 = com.ss.android.socialbase.downloader.xt.oq.cw
            if (r0 != r1) goto L16
            com.ss.android.socialbase.downloader.ae.cw r0 = r2.av
            r1 = -4
            r0.r(r1)
            com.ss.android.socialbase.downloader.downloader.up r0 = r2.ae
            r0.cw()
            return
        L16:
            com.ss.android.socialbase.downloader.xt.oq r0 = r2.ws
            com.ss.android.socialbase.downloader.xt.oq r1 = com.ss.android.socialbase.downloader.xt.oq.xt
            if (r0 != r1) goto L28
            com.ss.android.socialbase.downloader.ae.cw r0 = r2.av
            r1 = -2
            r0.r(r1)
            com.ss.android.socialbase.downloader.downloader.up r0 = r2.ae
            r0.xt()
            return
        L28:
            com.ss.android.socialbase.downloader.downloader.up r0 = r2.ae
            r0.r()
        L2d:
            return
    }

    private void l() throws com.ss.android.socialbase.downloader.up.oq, com.ss.android.socialbase.downloader.up.j {
            r5 = this;
            com.ss.android.socialbase.downloader.ae.cw r0 = r5.av
            int r0 = r0.ae()
            com.ss.android.socialbase.downloader.ae.cw r1 = r5.av
            int r1 = com.ss.android.socialbase.downloader.downloader.cw.j(r1)
            com.ss.android.socialbase.downloader.ae.cw r2 = r5.av
            boolean r2 = r2.if()
            if (r2 == 0) goto L2b
            com.ss.android.socialbase.downloader.ae.cw r2 = r5.av
            boolean r2 = r2.ki()
            if (r2 != 0) goto L2b
            boolean r2 = r5.gq
            if (r2 == 0) goto L21
            goto L2b
        L21:
            com.ss.android.socialbase.downloader.up.j r0 = new com.ss.android.socialbase.downloader.up.j
            r1 = 1009(0x3f1, float:1.414E-42)
            java.lang.String r2 = "file has downloaded"
            r0.<init>(r1, r2)
            throw r0
        L2b:
            com.ss.android.socialbase.downloader.downloader.vl r2 = r5.az
            com.ss.android.socialbase.downloader.ae.cw r2 = r2.xt(r1)
            if (r2 == 0) goto La6
            com.ss.android.socialbase.downloader.impls.j r3 = com.ss.android.socialbase.downloader.downloader.cw.p()
            if (r3 == 0) goto La6
            int r4 = r2.ae()
            if (r4 == r0) goto La6
            com.ss.android.socialbase.downloader.ae.cw r4 = r5.av
            boolean r4 = r2.xt(r4)
            if (r4 == 0) goto La6
            int r4 = r2.ae()
            boolean r3 = r3.j(r4)
            if (r3 != 0) goto L97
            com.ss.android.socialbase.downloader.downloader.vl r3 = r5.az
            java.util.List r3 = r3.cw(r1)
            com.ss.android.socialbase.downloader.ae.cw r4 = r5.av
            com.ss.android.socialbase.downloader.az.m.j(r4)
            com.ss.android.socialbase.downloader.downloader.vl r4 = r5.az
            r4.m(r1)
            boolean r1 = r2.xj()
            if (r1 == 0) goto La6
            com.ss.android.socialbase.downloader.ae.cw r1 = r5.av
            r4 = 0
            r1.j(r2, r4)
            com.ss.android.socialbase.downloader.downloader.vl r1 = r5.az
            com.ss.android.socialbase.downloader.ae.cw r2 = r5.av
            r1.j(r2)
            if (r3 == 0) goto L8f
            java.util.Iterator r1 = r3.iterator()
        L7a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L8f
            java.lang.Object r2 = r1.next()
            com.ss.android.socialbase.downloader.ae.xt r2 = (com.ss.android.socialbase.downloader.ae.xt) r2
            r2.xt(r0)
            com.ss.android.socialbase.downloader.downloader.vl r3 = r5.az
            r3.j(r2)
            goto L7a
        L8f:
            com.ss.android.socialbase.downloader.up.oq r0 = new com.ss.android.socialbase.downloader.up.oq
            java.lang.String r1 = "retry task because id generator changed"
            r0.<init>(r1)
            throw r0
        L97:
            com.ss.android.socialbase.downloader.downloader.vl r1 = r5.az
            r1.m(r0)
            com.ss.android.socialbase.downloader.up.j r0 = new com.ss.android.socialbase.downloader.up.j
            r1 = 1025(0x401, float:1.436E-42)
            java.lang.String r2 = "another same task is downloading"
            r0.<init>(r1, r2)
            throw r0
        La6:
            return
    }

    private void la() throws com.ss.android.socialbase.downloader.up.ae {
            r4 = this;
            com.ss.android.socialbase.downloader.ae.cw r0 = r4.av
            boolean r0 = r0.x()
            if (r0 == 0) goto L29
            android.content.Context r0 = com.ss.android.socialbase.downloader.downloader.cw.nd()
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r0 = com.ss.android.socialbase.downloader.az.m.j(r0, r1)
            if (r0 == 0) goto L15
            goto L29
        L15:
            com.ss.android.socialbase.downloader.up.ae r0 = new com.ss.android.socialbase.downloader.up.ae
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r1
            java.lang.String r1 = "download task need permission:%s"
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r2 = 1019(0x3fb, float:1.428E-42)
            r0.<init>(r2, r1)
            throw r0
        L29:
            com.ss.android.socialbase.downloader.ae.cw r0 = r4.av
            boolean r0 = r0.dj()
            if (r0 == 0) goto L40
            com.ss.android.socialbase.downloader.ae.cw r0 = r4.av
            boolean r0 = r0.kk()
            if (r0 == 0) goto L3a
            return
        L3a:
            com.ss.android.socialbase.downloader.up.m r0 = new com.ss.android.socialbase.downloader.up.m
            r0.<init>()
            throw r0
        L40:
            com.ss.android.socialbase.downloader.up.r r0 = new com.ss.android.socialbase.downloader.up.r
            r0.<init>()
            throw r0
    }

    private void mi() {
            r0 = this;
            r0.i()
            r0.w()
            return
    }

    private void oq() throws com.ss.android.socialbase.downloader.up.xt {
            r9 = this;
            java.lang.String r0 = "fix_file_exist_update_download_info"
            r1 = 0
            com.ss.android.socialbase.downloader.ae.cw r2 = r9.av     // Catch: java.lang.Throwable -> L1b com.ss.android.socialbase.downloader.up.xt -> L1f
            int r2 = r2.ae()     // Catch: java.lang.Throwable -> L1b com.ss.android.socialbase.downloader.up.xt -> L1f
            com.ss.android.socialbase.downloader.downloader.vl r3 = r9.az     // Catch: java.lang.Throwable -> L1b com.ss.android.socialbase.downloader.up.xt -> L1f
            if (r3 == 0) goto L94
            r3 = 2048(0x800, float:2.87E-42)
            boolean r3 = com.ss.android.socialbase.downloader.az.j.j(r3)     // Catch: java.lang.Throwable -> L1b com.ss.android.socialbase.downloader.up.xt -> L1f
            if (r3 == 0) goto L23
            com.ss.android.socialbase.downloader.downloader.vl r3 = r9.az     // Catch: java.lang.Throwable -> L1b com.ss.android.socialbase.downloader.up.xt -> L1f
            r3.up()     // Catch: java.lang.Throwable -> L1b com.ss.android.socialbase.downloader.up.xt -> L1f
            goto L23
        L1b:
            r2 = move-exception
        L1c:
            r4 = 0
            goto Laf
        L1f:
            r2 = move-exception
        L20:
            r4 = 0
            goto Lf1
        L23:
            com.ss.android.socialbase.downloader.downloader.vl r3 = r9.az     // Catch: java.lang.Throwable -> L1b com.ss.android.socialbase.downloader.up.xt -> L1f
            com.ss.android.socialbase.downloader.ae.cw r3 = r3.xt(r2)     // Catch: java.lang.Throwable -> L1b com.ss.android.socialbase.downloader.up.xt -> L1f
            r4 = 1
            if (r3 == 0) goto L8e
            boolean r5 = r3.id()     // Catch: java.lang.Throwable -> L1b com.ss.android.socialbase.downloader.up.xt -> L1f
            if (r5 == 0) goto L33
            goto L8e
        L33:
            com.ss.android.socialbase.downloader.ae.cw r5 = r9.av     // Catch: java.lang.Throwable -> L1b com.ss.android.socialbase.downloader.up.xt -> L1f
            java.lang.String r5 = r5.qv()     // Catch: java.lang.Throwable -> L1b com.ss.android.socialbase.downloader.up.xt -> L1f
            com.ss.android.socialbase.downloader.ae.cw r6 = r9.av     // Catch: java.lang.Throwable -> L1b com.ss.android.socialbase.downloader.up.xt -> L1f
            java.lang.String r6 = r6.rn()     // Catch: java.lang.Throwable -> L1b com.ss.android.socialbase.downloader.up.xt -> L1f
            com.ss.android.socialbase.downloader.ae.cw r7 = r9.av     // Catch: java.lang.Throwable -> L1b com.ss.android.socialbase.downloader.up.xt -> L1f
            r7.j(r3, r4)     // Catch: java.lang.Throwable -> L1b com.ss.android.socialbase.downloader.up.xt -> L1f
            r7 = 4096(0x1000, float:5.74E-42)
            boolean r7 = com.ss.android.socialbase.downloader.az.j.j(r7)     // Catch: java.lang.Throwable -> L1b com.ss.android.socialbase.downloader.up.xt -> L1f
            if (r7 == 0) goto L52
            com.ss.android.socialbase.downloader.ae.cw r7 = r9.av     // Catch: java.lang.Throwable -> L1b com.ss.android.socialbase.downloader.up.xt -> L1f
            if (r3 == r7) goto L52
            r7 = 1
            goto L53
        L52:
            r7 = 0
        L53:
            java.lang.String r8 = r3.qv()     // Catch: java.lang.Throwable -> L75 com.ss.android.socialbase.downloader.up.xt -> L78
            boolean r5 = r5.equals(r8)     // Catch: java.lang.Throwable -> L75 com.ss.android.socialbase.downloader.up.xt -> L78
            if (r5 == 0) goto L7b
            boolean r5 = com.ss.android.socialbase.downloader.az.m.j(r3, r1, r6)     // Catch: java.lang.Throwable -> L75 com.ss.android.socialbase.downloader.up.xt -> L78
            if (r5 != 0) goto L64
            goto L7b
        L64:
            com.ss.android.socialbase.downloader.up.xt r1 = new com.ss.android.socialbase.downloader.up.xt     // Catch: java.lang.Throwable -> L6e com.ss.android.socialbase.downloader.up.xt -> L71
            java.lang.String r2 = r3.tl()     // Catch: java.lang.Throwable -> L6e com.ss.android.socialbase.downloader.up.xt -> L71
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L6e com.ss.android.socialbase.downloader.up.xt -> L71
            throw r1     // Catch: java.lang.Throwable -> L6e com.ss.android.socialbase.downloader.up.xt -> L71
        L6e:
            r2 = move-exception
            r1 = r7
            goto Laf
        L71:
            r2 = move-exception
            r1 = r7
            goto Lf1
        L75:
            r2 = move-exception
            r1 = r7
            goto L1c
        L78:
            r2 = move-exception
            r1 = r7
            goto L20
        L7b:
            int r3 = com.ss.android.socialbase.downloader.downloader.cw.j(r3)     // Catch: java.lang.Throwable -> L75 com.ss.android.socialbase.downloader.up.xt -> L78
            if (r3 == r2) goto L8c
            com.ss.android.socialbase.downloader.downloader.vl r3 = r9.az     // Catch: java.lang.Throwable -> L75 com.ss.android.socialbase.downloader.up.xt -> L78 android.database.sqlite.SQLiteException -> L87
            r3.m(r2)     // Catch: java.lang.Throwable -> L75 com.ss.android.socialbase.downloader.up.xt -> L78 android.database.sqlite.SQLiteException -> L87
            goto L95
        L87:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)     // Catch: java.lang.Throwable -> L75 com.ss.android.socialbase.downloader.up.xt -> L78
            goto L95
        L8c:
            r4 = r7
            goto L95
        L8e:
            com.ss.android.socialbase.downloader.ae.cw r2 = r9.av     // Catch: java.lang.Throwable -> L1b com.ss.android.socialbase.downloader.up.xt -> L1f
            r2.so()     // Catch: java.lang.Throwable -> L1b com.ss.android.socialbase.downloader.up.xt -> L1f
            goto L95
        L94:
            r4 = 0
        L95:
            r9.tl()     // Catch: java.lang.Throwable -> La7 com.ss.android.socialbase.downloader.up.xt -> Lab
            if (r4 == 0) goto Lf0
            com.ss.android.socialbase.downloader.downloader.vl r0 = r9.az     // Catch: android.database.sqlite.SQLiteException -> La2
            com.ss.android.socialbase.downloader.ae.cw r1 = r9.av     // Catch: android.database.sqlite.SQLiteException -> La2
            r0.j(r1)     // Catch: android.database.sqlite.SQLiteException -> La2
            goto Lf0
        La2:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
            return
        La7:
            r2 = move-exception
            r1 = r4
            goto L1c
        Lab:
            r2 = move-exception
            r1 = r4
            goto L20
        Laf:
            com.ss.android.socialbase.downloader.ae.r r3 = r9.cw     // Catch: java.lang.Throwable -> Ld4
            if (r3 == 0) goto Ld6
            com.ss.android.socialbase.downloader.ae.cw r5 = r9.av     // Catch: java.lang.Throwable -> Ld4
            if (r5 == 0) goto Ld6
            com.ss.android.socialbase.downloader.r.l r3 = r3.up()     // Catch: java.lang.Throwable -> Ld4
            com.ss.android.socialbase.downloader.ae.cw r5 = r9.av     // Catch: java.lang.Throwable -> Ld4
            com.ss.android.socialbase.downloader.up.j r6 = new com.ss.android.socialbase.downloader.up.j     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r7 = "checkTaskCache"
            java.lang.String r2 = com.ss.android.socialbase.downloader.az.m.xt(r2, r7)     // Catch: java.lang.Throwable -> Ld4
            r7 = 1003(0x3eb, float:1.406E-42)
            r6.<init>(r7, r2)     // Catch: java.lang.Throwable -> Ld4
            com.ss.android.socialbase.downloader.ae.cw r2 = r9.av     // Catch: java.lang.Throwable -> Ld4
            int r2 = r2.i()     // Catch: java.lang.Throwable -> Ld4
            com.ss.android.socialbase.downloader.tl.j.j(r3, r5, r6, r2)     // Catch: java.lang.Throwable -> Ld4
            goto Ld6
        Ld4:
            r2 = move-exception
            goto Lf2
        Ld6:
            if (r1 == 0) goto Lf0
            if (r4 == 0) goto Le5
            com.ss.android.socialbase.downloader.jy.j r1 = r9.uf     // Catch: android.database.sqlite.SQLiteException -> Le3
            boolean r0 = r1.j(r0)     // Catch: android.database.sqlite.SQLiteException -> Le3
            if (r0 == 0) goto Lf0
            goto Le5
        Le3:
            r0 = move-exception
            goto Led
        Le5:
            com.ss.android.socialbase.downloader.downloader.vl r0 = r9.az     // Catch: android.database.sqlite.SQLiteException -> Le3
            com.ss.android.socialbase.downloader.ae.cw r1 = r9.av     // Catch: android.database.sqlite.SQLiteException -> Le3
            r0.j(r1)     // Catch: android.database.sqlite.SQLiteException -> Le3
            goto Lf0
        Led:
            com.bytedance.sdk.component.utils.vl.j(r0)
        Lf0:
            return
        Lf1:
            throw r2     // Catch: java.lang.Throwable -> Ld4
        Lf2:
            if (r1 == 0) goto L10c
            if (r4 == 0) goto L101
            com.ss.android.socialbase.downloader.jy.j r1 = r9.uf     // Catch: android.database.sqlite.SQLiteException -> Lff
            boolean r0 = r1.j(r0)     // Catch: android.database.sqlite.SQLiteException -> Lff
            if (r0 == 0) goto L10c
            goto L101
        Lff:
            r0 = move-exception
            goto L109
        L101:
            com.ss.android.socialbase.downloader.downloader.vl r0 = r9.az     // Catch: android.database.sqlite.SQLiteException -> Lff
            com.ss.android.socialbase.downloader.ae.cw r1 = r9.av     // Catch: android.database.sqlite.SQLiteException -> Lff
            r0.j(r1)     // Catch: android.database.sqlite.SQLiteException -> Lff
            goto L10c
        L109:
            com.bytedance.sdk.component.utils.vl.j(r0)
        L10c:
            throw r2
    }

    private boolean p() {
            r3 = this;
            com.ss.android.socialbase.downloader.ae.cw r0 = r3.av
            r1 = 0
            if (r0 == 0) goto L2a
            boolean r0 = r0.ki()
            if (r0 != 0) goto L2a
            boolean r0 = r3.g
            r2 = 1
            if (r0 == 0) goto L18
            com.ss.android.socialbase.downloader.ae.cw r0 = r3.av
            int r0 = r0.kj()
            if (r0 <= r2) goto L2a
        L18:
            com.ss.android.socialbase.downloader.ae.cw r0 = r3.av
            boolean r0 = r0.qg()
            if (r0 == 0) goto L21
            goto L2a
        L21:
            boolean r0 = r3.oq
            if (r0 == 0) goto L2a
            boolean r0 = r3.vl
            if (r0 != 0) goto L2a
            return r2
        L2a:
            return r1
    }

    private void qv() {
            r7 = this;
            r0 = 10
            android.os.Process.setThreadPriority(r0)
            r0 = 0
            com.ss.android.socialbase.downloader.ae.cw r2 = r7.av     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L1b
            long r3 = r7.wq     // Catch: java.lang.Throwable -> L1b
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 <= 0) goto L1b
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L1b
            long r5 = r7.wq     // Catch: java.lang.Throwable -> L1b
            long r3 = r3 - r5
            r2.cw(r3)     // Catch: java.lang.Throwable -> L1b
        L1b:
            com.ss.android.socialbase.downloader.ae.r r2 = r7.cw     // Catch: java.lang.Throwable -> L2f
            com.ss.android.socialbase.downloader.r.s r2 = r2.cw()     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L33
            boolean r2 = r2.j()     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L33
            com.ss.android.socialbase.downloader.downloader.m r0 = r7.f
            r0.up()
            return
        L2f:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
        L33:
            boolean r2 = r7.g()
            if (r2 != 0) goto L58
            com.ss.android.socialbase.downloader.ae.r r0 = r7.cw
            com.ss.android.socialbase.downloader.r.l r0 = r0.up()
            com.ss.android.socialbase.downloader.ae.cw r1 = r7.av
            com.ss.android.socialbase.downloader.up.j r2 = new com.ss.android.socialbase.downloader.up.j
            r3 = 1003(0x3eb, float:1.406E-42)
            java.lang.String r4 = "task status is invalid"
            r2.<init>(r3, r4)
            com.ss.android.socialbase.downloader.ae.cw r3 = r7.av
            if (r3 == 0) goto L53
            int r3 = r3.i()
            goto L54
        L53:
            r3 = 0
        L54:
            com.ss.android.socialbase.downloader.tl.j.j(r0, r1, r2, r3)
            return
        L58:
            r7.vl()
            boolean r2 = r7.p
            if (r2 == 0) goto L111
            int r2 = r7.l
            if (r2 <= 0) goto L6a
            int r2 = r7.l
            int r2 = r2 + (-1)
            r7.l = r2
            goto L58
        L6a:
            com.ss.android.socialbase.downloader.ae.cw r2 = r7.av
            long r2 = r2.uq()
            com.ss.android.socialbase.downloader.ae.cw r4 = r7.av
            long r4 = r4.ka()
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto La6
            java.lang.String r0 = com.ss.android.socialbase.downloader.ws.cw.j
            com.ss.android.socialbase.downloader.ae.cw r1 = r7.av
            java.lang.String r1 = r1.r()
            com.ss.android.socialbase.downloader.m.j.xt(r0, r1)
            com.ss.android.socialbase.downloader.downloader.m r0 = r7.f
            com.ss.android.socialbase.downloader.up.ae r1 = new com.ss.android.socialbase.downloader.up.ae
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "current bytes is not equals to total bytes, bytes invalid retry status is : "
            r2.<init>(r3)
            com.ss.android.socialbase.downloader.ae.cw r3 = r7.av
            com.ss.android.socialbase.downloader.xt.xt r3 = r3.ik()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 1027(0x403, float:1.439E-42)
            r1.<init>(r3, r2)
            r0.j(r1)
            return
        La6:
            com.ss.android.socialbase.downloader.ae.cw r2 = r7.av
            long r2 = r2.uq()
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 > 0) goto Ldc
            java.lang.String r0 = com.ss.android.socialbase.downloader.ws.cw.j
            com.ss.android.socialbase.downloader.ae.cw r1 = r7.av
            java.lang.String r1 = r1.r()
            com.ss.android.socialbase.downloader.m.j.xt(r0, r1)
            com.ss.android.socialbase.downloader.downloader.m r0 = r7.f
            com.ss.android.socialbase.downloader.up.ae r1 = new com.ss.android.socialbase.downloader.up.ae
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "curBytes is 0, bytes invalid retry status is : "
            r2.<init>(r3)
            com.ss.android.socialbase.downloader.ae.cw r3 = r7.av
            com.ss.android.socialbase.downloader.xt.xt r3 = r3.ik()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 1026(0x402, float:1.438E-42)
            r1.<init>(r3, r2)
            r0.j(r1)
            return
        Ldc:
            com.ss.android.socialbase.downloader.ae.cw r2 = r7.av
            long r2 = r2.ka()
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 > 0) goto L58
            java.lang.String r0 = com.ss.android.socialbase.downloader.ws.cw.j
            com.ss.android.socialbase.downloader.ae.cw r1 = r7.av
            java.lang.String r1 = r1.r()
            com.ss.android.socialbase.downloader.m.j.xt(r0, r1)
            com.ss.android.socialbase.downloader.downloader.m r0 = r7.f
            com.ss.android.socialbase.downloader.up.ae r1 = new com.ss.android.socialbase.downloader.up.ae
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "TotalBytes is 0, bytes invalid retry status is : "
            r2.<init>(r3)
            com.ss.android.socialbase.downloader.ae.cw r3 = r7.av
            com.ss.android.socialbase.downloader.xt.xt r3 = r3.ik()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 1044(0x414, float:1.463E-42)
            r1.<init>(r3, r2)
            r0.j(r1)
        L111:
            return
    }

    private boolean r(com.ss.android.socialbase.downloader.up.j r8) {
            r7 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r7.up
            r1 = 1
            if (r0 == 0) goto Lb7
            int r0 = r0.get()
            r2 = 0
            if (r0 <= 0) goto L17
            if (r8 == 0) goto L72
            int r0 = r8.j()
            r3 = 1070(0x42e, float:1.5E-42)
            if (r0 == r3) goto L17
            goto L72
        L17:
            com.ss.android.socialbase.downloader.ae.cw r0 = r7.av
            boolean r0 = r0.os()
            if (r0 == 0) goto L36
            java.util.concurrent.atomic.AtomicInteger r8 = r7.up
            com.ss.android.socialbase.downloader.ae.cw r0 = r7.av
            int r0 = r0.gx()
            r8.set(r0)
            com.ss.android.socialbase.downloader.ae.cw r8 = r7.av
            java.util.concurrent.atomic.AtomicInteger r0 = r7.up
            int r0 = r0.get()
            r8.g(r0)
            goto L71
        L36:
            if (r8 == 0) goto L86
            int r0 = r8.j()
            r3 = 1011(0x3f3, float:1.417E-42)
            if (r0 == r3) goto L4e
            java.lang.Throwable r0 = r8.getCause()
            if (r0 == 0) goto L86
            java.lang.Throwable r0 = r8.getCause()
            boolean r0 = r0 instanceof javax.net.ssl.SSLHandshakeException
            if (r0 == 0) goto L86
        L4e:
            com.ss.android.socialbase.downloader.ae.cw r0 = r7.av
            boolean r0 = r0.ej()
            if (r0 == 0) goto L86
            java.util.concurrent.atomic.AtomicInteger r8 = r7.up
            com.ss.android.socialbase.downloader.ae.cw r0 = r7.av
            int r0 = r0.c()
            r8.set(r0)
            com.ss.android.socialbase.downloader.ae.cw r8 = r7.av
            java.util.concurrent.atomic.AtomicInteger r0 = r7.up
            int r0 = r0.get()
            r8.g(r0)
            com.ss.android.socialbase.downloader.ae.cw r8 = r7.av
            r8.jy(r1)
        L71:
            r1 = 0
        L72:
            com.ss.android.socialbase.downloader.xt.oq r8 = r7.ws
            com.ss.android.socialbase.downloader.xt.oq r0 = com.ss.android.socialbase.downloader.xt.oq.m
            if (r8 == r0) goto L85
            if (r1 == 0) goto L85
            com.ss.android.socialbase.downloader.ae.cw r8 = r7.av
            java.util.concurrent.atomic.AtomicInteger r0 = r7.up
            int r0 = r0.decrementAndGet()
            r8.g(r0)
        L85:
            return r2
        L86:
            com.ss.android.socialbase.downloader.up.j r0 = new com.ss.android.socialbase.downloader.up.j
            int r3 = r8.j()
            java.util.concurrent.atomic.AtomicInteger r4 = r7.up
            java.lang.String r4 = java.lang.String.valueOf(r4)
            com.ss.android.socialbase.downloader.ae.cw r5 = r7.av
            int r5 = r5.c()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r8 = r8.xt()
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r2] = r4
            r6[r1] = r5
            r2 = 2
            r6[r2] = r8
            java.lang.String r8 = "retry for exception, but current retry time : %s , retry Time %s all used, last error is %s"
            java.lang.String r8 = java.lang.String.format(r8, r6)
            r0.<init>(r3, r8)
            r7.xt(r0)
            return r1
        Lb7:
            com.ss.android.socialbase.downloader.up.j r0 = new com.ss.android.socialbase.downloader.up.j
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "retry for exception, but retain retry time is null, last error is :"
            r2.<init>(r3)
            java.lang.String r8 = r8.xt()
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            r2 = 1043(0x413, float:1.462E-42)
            r0.<init>(r2, r8)
            r7.xt(r0)
            return r1
    }

    private void rn() {
            r7 = this;
            com.ss.android.socialbase.downloader.ae.cw r0 = r7.av
            long r0 = com.ss.android.socialbase.downloader.az.m.m(r0)
            com.ss.android.socialbase.downloader.ae.cw r2 = r7.av
            long r2 = r2.uq()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L2b
            java.lang.String r4 = com.ss.android.socialbase.downloader.ws.cw.j
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "checkTaskCanResume: offset = "
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r6 = ", curBytes = "
            r5.append(r6)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            com.ss.android.socialbase.downloader.m.j.r(r4, r2)
        L2b:
            com.ss.android.socialbase.downloader.ae.cw r2 = r7.av
            r2.up(r0)
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L38
            r0 = 1
            goto L39
        L38:
            r0 = 0
        L39:
            r7.g = r0
            if (r0 != 0) goto L63
            boolean r0 = r7.gq
            if (r0 != 0) goto L63
            java.lang.String r0 = com.ss.android.socialbase.downloader.ws.cw.j
            java.lang.String r1 = "checkTaskCanResume: deleteAllDownloadFiles"
            com.ss.android.socialbase.downloader.m.j.cw(r0, r1)
            com.ss.android.socialbase.downloader.downloader.vl r0 = r7.az
            com.ss.android.socialbase.downloader.ae.cw r1 = r7.av
            int r1 = r1.ae()
            r0.r(r1)
            com.ss.android.socialbase.downloader.downloader.vl r0 = r7.az
            com.ss.android.socialbase.downloader.ae.cw r1 = r7.av
            int r1 = r1.ae()
            r0.jy(r1)
            com.ss.android.socialbase.downloader.ae.cw r0 = r7.av
            com.ss.android.socialbase.downloader.az.m.j(r0)
        L63:
            return
    }

    private void s() {
            r1 = this;
            com.ss.android.socialbase.downloader.xt.oq r0 = com.ss.android.socialbase.downloader.xt.oq.j
            r1.ws = r0
            return
    }

    private boolean tj() {
            r2 = this;
            com.ss.android.socialbase.downloader.xt.oq r0 = r2.ws
            com.ss.android.socialbase.downloader.xt.oq r1 = com.ss.android.socialbase.downloader.xt.oq.cw
            if (r0 == r1) goto Lf
            com.ss.android.socialbase.downloader.xt.oq r0 = r2.ws
            com.ss.android.socialbase.downloader.xt.oq r1 = com.ss.android.socialbase.downloader.xt.oq.xt
            if (r0 != r1) goto Ld
            goto Lf
        Ld:
            r0 = 0
            return r0
        Lf:
            r0 = 1
            return r0
    }

    private void tl() {
            r2 = this;
            com.ss.android.socialbase.downloader.ae.cw r0 = r2.av
            if (r0 != 0) goto L5
            return
        L5:
            int r0 = r0.c()
            com.ss.android.socialbase.downloader.ae.cw r1 = r2.av
            int r1 = r1.fx()
            int r0 = r0 - r1
            if (r0 >= 0) goto L13
            r0 = 0
        L13:
            java.util.concurrent.atomic.AtomicInteger r1 = r2.up
            if (r1 != 0) goto L1f
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
            r1.<init>(r0)
            r2.up = r1
            return
        L1f:
            r1.set(r0)
            return
    }

    private void uf() {
            r4 = this;
            java.util.ArrayList<com.ss.android.socialbase.downloader.ws.xt> r0 = r4.m     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r0 = r0.clone()     // Catch: java.lang.Throwable -> L1e
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> L1e
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L1e
        Lc:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L1e
            com.ss.android.socialbase.downloader.ws.xt r1 = (com.ss.android.socialbase.downloader.ws.xt) r1     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto Lc
            r1.xt()     // Catch: java.lang.Throwable -> L1e
            goto Lc
        L1e:
            r0 = move-exception
            goto L21
        L20:
            return
        L21:
            java.lang.String r1 = com.ss.android.socialbase.downloader.ws.cw.j
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "cancelAllChunkRunnable: "
            r2.<init>(r3)
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.ss.android.socialbase.downloader.m.j.cw(r1, r0)
            return
    }

    private boolean v() {
            r5 = this;
            com.ss.android.socialbase.downloader.xt.oq r0 = r5.ws
            com.ss.android.socialbase.downloader.xt.oq r1 = com.ss.android.socialbase.downloader.xt.oq.r
            r2 = 1
            if (r0 != r1) goto L10
            com.ss.android.socialbase.downloader.downloader.m r0 = r5.f
            com.ss.android.socialbase.downloader.up.j r1 = r5.v
            r0.j(r1)
            goto Laa
        L10:
            com.ss.android.socialbase.downloader.xt.oq r0 = r5.ws
            com.ss.android.socialbase.downloader.xt.oq r1 = com.ss.android.socialbase.downloader.xt.oq.cw
            if (r0 != r1) goto L1d
            com.ss.android.socialbase.downloader.downloader.m r0 = r5.f
            r0.cw()
            goto Laa
        L1d:
            com.ss.android.socialbase.downloader.xt.oq r0 = r5.ws
            com.ss.android.socialbase.downloader.xt.oq r1 = com.ss.android.socialbase.downloader.xt.oq.xt
            if (r0 != r1) goto L2a
            com.ss.android.socialbase.downloader.downloader.m r0 = r5.f
            r0.r()
            goto Laa
        L2a:
            com.ss.android.socialbase.downloader.xt.oq r0 = r5.ws
            com.ss.android.socialbase.downloader.xt.oq r1 = com.ss.android.socialbase.downloader.xt.oq.up
            if (r0 != r1) goto L3e
            com.ss.android.socialbase.downloader.downloader.m r0 = r5.f     // Catch: com.ss.android.socialbase.downloader.up.j -> L37
            r0.ae()     // Catch: com.ss.android.socialbase.downloader.up.j -> L37
            goto Laa
        L37:
            r0 = move-exception
            com.ss.android.socialbase.downloader.downloader.m r1 = r5.f
            r1.j(r0)
            goto Laa
        L3e:
            com.ss.android.socialbase.downloader.xt.oq r0 = r5.ws
            com.ss.android.socialbase.downloader.xt.oq r1 = com.ss.android.socialbase.downloader.xt.oq.tl
            if (r0 != r1) goto L53
            com.ss.android.socialbase.downloader.downloader.m r0 = r5.f     // Catch: com.ss.android.socialbase.downloader.up.j -> L4c
            java.lang.String r1 = r5.la     // Catch: com.ss.android.socialbase.downloader.up.j -> L4c
            r0.j(r1)     // Catch: com.ss.android.socialbase.downloader.up.j -> L4c
            goto Laa
        L4c:
            r0 = move-exception
            com.ss.android.socialbase.downloader.downloader.m r1 = r5.f
            r1.j(r0)
            goto Laa
        L53:
            com.ss.android.socialbase.downloader.xt.oq r0 = r5.ws
            com.ss.android.socialbase.downloader.xt.oq r1 = com.ss.android.socialbase.downloader.xt.oq.g
            r3 = 0
            if (r0 != r1) goto L62
            com.ss.android.socialbase.downloader.downloader.m r0 = r5.f
            com.ss.android.socialbase.downloader.up.j r1 = r5.v
            r0.j(r1, r3)
            return r3
        L62:
            com.ss.android.socialbase.downloader.xt.oq r0 = r5.ws
            com.ss.android.socialbase.downloader.xt.oq r1 = com.ss.android.socialbase.downloader.xt.oq.ae
            if (r0 != r1) goto L69
            return r2
        L69:
            com.ss.android.socialbase.downloader.xt.oq r0 = r5.ws
            com.ss.android.socialbase.downloader.xt.oq r1 = com.ss.android.socialbase.downloader.xt.oq.m
            if (r0 != r1) goto L85
            boolean r0 = r5.x()
            if (r0 != 0) goto L85
            java.lang.String r0 = com.ss.android.socialbase.downloader.ws.cw.j
            java.lang.String r4 = "doTaskStatusHandle retryDelay"
            com.ss.android.socialbase.downloader.m.j.xt(r0, r4)
            r5.s()
            com.ss.android.socialbase.downloader.xt.oq r0 = r5.ws
            if (r0 != r1) goto L84
            return r2
        L84:
            return r3
        L85:
            boolean r0 = r5.ch()     // Catch: java.lang.Throwable -> L99
            if (r0 != 0) goto L8c
            return r3
        L8c:
            com.ss.android.socialbase.downloader.downloader.m r0 = r5.f     // Catch: java.lang.Throwable -> L99
            r0.m()     // Catch: java.lang.Throwable -> L99
            com.ss.android.socialbase.downloader.impls.w r0 = com.ss.android.socialbase.downloader.impls.w.j()     // Catch: java.lang.Throwable -> L99
            r0.r()     // Catch: java.lang.Throwable -> L99
            goto Laa
        L99:
            r0 = move-exception
            com.ss.android.socialbase.downloader.up.j r1 = new com.ss.android.socialbase.downloader.up.j
            java.lang.String r3 = "doTaskStatusHandle onComplete"
            java.lang.String r0 = com.ss.android.socialbase.downloader.az.m.xt(r0, r3)
            r3 = 1008(0x3f0, float:1.413E-42)
            r1.<init>(r3, r0)
            r5.xt(r1)
        Laa:
            return r2
    }

    private void vl() {
            r17 = this;
            r1 = r17
            com.ss.android.socialbase.downloader.xt.oq r0 = com.ss.android.socialbase.downloader.xt.oq.j     // Catch: java.lang.Throwable -> L22
            r1.ws = r0     // Catch: java.lang.Throwable -> L22
            com.ss.android.socialbase.downloader.ae.cw r0 = r1.av     // Catch: java.lang.Throwable -> L22
            r0.z()     // Catch: java.lang.Throwable -> L22
            com.ss.android.socialbase.downloader.ae.cw r0 = r1.av     // Catch: java.lang.Throwable -> L22
            r0.wf()     // Catch: java.lang.Throwable -> L22
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L22
            com.ss.android.socialbase.downloader.ae.cw r0 = r1.av     // Catch: java.lang.Throwable -> L22
            r4 = -1
            r0.j(r4)     // Catch: java.lang.Throwable -> L22
            r4 = 1
            r5 = 0
            r1.oq()     // Catch: java.lang.Throwable -> L22 com.ss.android.socialbase.downloader.up.xt -> L25
            r0 = 0
            goto L44
        L22:
            r0 = move-exception
            goto L30c
        L25:
            r0 = move-exception
            java.lang.String r6 = com.ss.android.socialbase.downloader.ws.cw.j     // Catch: java.lang.Throwable -> L22
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L22
            java.lang.String r8 = "file exist "
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L22
            java.lang.String r8 = r0.r()     // Catch: java.lang.Throwable -> L22
            r7.append(r8)     // Catch: java.lang.Throwable -> L22
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L22
            com.ss.android.socialbase.downloader.m.j.xt(r6, r7)     // Catch: java.lang.Throwable -> L22
            java.lang.String r0 = r0.r()     // Catch: java.lang.Throwable -> L22
            r1.la = r0     // Catch: java.lang.Throwable -> L22
            r0 = 1
        L44:
            boolean r6 = r1.p     // Catch: java.lang.Throwable -> L22
            if (r6 != 0) goto L4d
            com.ss.android.socialbase.downloader.downloader.m r6 = r1.f     // Catch: java.lang.Throwable -> L22
            r6.xt()     // Catch: java.lang.Throwable -> L22
        L4d:
            r1.p = r5     // Catch: java.lang.Throwable -> L22
            boolean r6 = r1.f()     // Catch: java.lang.Throwable -> L22
            if (r6 == 0) goto L59
            r1.av()
            return
        L59:
            java.lang.String r6 = r1.la     // Catch: java.lang.Throwable -> L22
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L22
            if (r6 != 0) goto L7e
            if (r0 == 0) goto L7e
            com.ss.android.socialbase.downloader.ae.cw r0 = r1.av     // Catch: java.lang.Throwable -> L22
            boolean r0 = r0.ki()     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L73
            com.ss.android.socialbase.downloader.ae.cw r0 = r1.av     // Catch: java.lang.Throwable -> L22
            boolean r0 = com.ss.android.socialbase.downloader.az.m.r(r0)     // Catch: java.lang.Throwable -> L22
            r1.gq = r0     // Catch: java.lang.Throwable -> L22
        L73:
            boolean r0 = r1.gq     // Catch: java.lang.Throwable -> L22
            if (r0 != 0) goto L7e
            r1.jy()     // Catch: java.lang.Throwable -> L22
            r1.av()
            return
        L7e:
            boolean r0 = r1.f()     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L88
            r1.av()
            return
        L88:
            r1.gq()     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> Lb7 com.ss.android.socialbase.downloader.up.j -> Lbb com.ss.android.socialbase.downloader.up.xt -> L2ff
            r1.l()     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> Lb7 com.ss.android.socialbase.downloader.up.j -> Lbb com.ss.android.socialbase.downloader.up.xt -> L2ff
            r1.la()     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> Lb7 com.ss.android.socialbase.downloader.up.j -> Lbb com.ss.android.socialbase.downloader.up.xt -> L2ff
            com.ss.android.socialbase.downloader.downloader.vl r0 = r1.az     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> Lb7 com.ss.android.socialbase.downloader.up.j -> Lbb com.ss.android.socialbase.downloader.up.xt -> L2ff
            com.ss.android.socialbase.downloader.ae.cw r8 = r1.av     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> Lb7 com.ss.android.socialbase.downloader.up.j -> Lbb com.ss.android.socialbase.downloader.up.xt -> L2ff
            int r8 = r8.ae()     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> Lb7 com.ss.android.socialbase.downloader.up.j -> Lbb com.ss.android.socialbase.downloader.up.xt -> L2ff
            java.util.List r0 = r0.cw(r8)     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> Lb7 com.ss.android.socialbase.downloader.up.j -> Lbb com.ss.android.socialbase.downloader.up.xt -> L2ff
            r1.rn()     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> Lb7 com.ss.android.socialbase.downloader.up.j -> Lbb com.ss.android.socialbase.downloader.up.xt -> L2ff
            boolean r8 = r1.ws()     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> Lb7 com.ss.android.socialbase.downloader.up.j -> Lbb com.ss.android.socialbase.downloader.up.xt -> L2ff
            if (r8 == 0) goto Lbf
            java.lang.String r0 = com.ss.android.socialbase.downloader.ws.cw.j     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> Lb7 com.ss.android.socialbase.downloader.up.j -> Lbb com.ss.android.socialbase.downloader.up.xt -> L2ff
            java.lang.String r8 = "downloadSegments return"
            com.ss.android.socialbase.downloader.m.j.cw(r0, r8)     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> Lb7 com.ss.android.socialbase.downloader.up.j -> Lbb com.ss.android.socialbase.downloader.up.xt -> L2ff
            r1.mi()     // Catch: java.lang.Throwable -> L22
            r1.av()
            return
        Lb4:
            r0 = move-exception
            goto L1cd
        Lb7:
            r0 = move-exception
            r10 = 0
            goto L1f9
        Lbb:
            r0 = move-exception
            r10 = 0
            goto L2a5
        Lbf:
            com.ss.android.socialbase.downloader.ae.cw r8 = r1.av     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> Lb7 com.ss.android.socialbase.downloader.up.j -> Lbb com.ss.android.socialbase.downloader.up.xt -> L2ff
            java.lang.String r8 = r8.ol()     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> Lb7 com.ss.android.socialbase.downloader.up.j -> Lbb com.ss.android.socialbase.downloader.up.xt -> L2ff
            boolean r9 = r1.f()     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> Lb7 com.ss.android.socialbase.downloader.up.j -> Lbb com.ss.android.socialbase.downloader.up.xt -> L2ff
            if (r9 == 0) goto Ld2
            r1.mi()     // Catch: java.lang.Throwable -> L22
            r1.av()
            return
        Ld2:
            boolean r9 = r1.g     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> Lb7 com.ss.android.socialbase.downloader.up.j -> Lbb com.ss.android.socialbase.downloader.up.xt -> L2ff
            if (r9 == 0) goto Ldd
            com.ss.android.socialbase.downloader.ae.cw r9 = r1.av     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> Lb7 com.ss.android.socialbase.downloader.up.j -> Lbb com.ss.android.socialbase.downloader.up.xt -> L2ff
            long r9 = com.ss.android.socialbase.downloader.az.m.up(r9)     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> Lb7 com.ss.android.socialbase.downloader.up.j -> Lbb com.ss.android.socialbase.downloader.up.xt -> L2ff
            goto Ldf
        Ldd:
            r9 = 0
        Ldf:
            com.ss.android.socialbase.downloader.ae.cw r11 = r1.av     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> Lb7 com.ss.android.socialbase.downloader.up.j -> Lbb com.ss.android.socialbase.downloader.up.xt -> L2ff
            com.ss.android.socialbase.downloader.ae.xt r11 = j(r11, r9)     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> Lb7 com.ss.android.socialbase.downloader.up.j -> Lbb com.ss.android.socialbase.downloader.up.xt -> L2ff
            java.util.List r12 = r1.j(r11)     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> Lb7 com.ss.android.socialbase.downloader.up.j -> Lbb com.ss.android.socialbase.downloader.up.xt -> L2ff
            com.ss.android.socialbase.downloader.ae.cw r13 = r1.av     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> Lb7 com.ss.android.socialbase.downloader.up.j -> Lbb com.ss.android.socialbase.downloader.up.xt -> L2ff
            com.ss.android.socialbase.downloader.az.m.j(r12, r13)     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> Lb7 com.ss.android.socialbase.downloader.up.j -> Lbb com.ss.android.socialbase.downloader.up.xt -> L2ff
            com.ss.android.socialbase.downloader.ae.cw r13 = r1.av     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> Lb7 com.ss.android.socialbase.downloader.up.j -> Lbb com.ss.android.socialbase.downloader.up.xt -> L2ff
            com.ss.android.socialbase.downloader.az.m.xt(r12, r13)     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> Lb7 com.ss.android.socialbase.downloader.up.j -> Lbb com.ss.android.socialbase.downloader.up.xt -> L2ff
            com.ss.android.socialbase.downloader.ae.cw r13 = r1.av     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> Lb7 com.ss.android.socialbase.downloader.up.j -> Lbb com.ss.android.socialbase.downloader.up.xt -> L2ff
            r13.az(r5)     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> Lb7 com.ss.android.socialbase.downloader.up.j -> Lbb com.ss.android.socialbase.downloader.up.xt -> L2ff
            long r13 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> Lb7 com.ss.android.socialbase.downloader.up.j -> Lbb com.ss.android.socialbase.downloader.up.xt -> L2ff
            r1.j(r8, r12, r9)     // Catch: java.lang.Throwable -> L1c0
            com.ss.android.socialbase.downloader.ae.cw r9 = r1.av     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> Lb7 com.ss.android.socialbase.downloader.up.j -> Lbb com.ss.android.socialbase.downloader.up.xt -> L2ff
            long r15 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> Lb7 com.ss.android.socialbase.downloader.up.j -> Lbb com.ss.android.socialbase.downloader.up.xt -> L2ff
            r10 = 0
            long r5 = r15 - r13
            r9.xt(r5)     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> L153 com.ss.android.socialbase.downloader.up.j -> L156 com.ss.android.socialbase.downloader.up.xt -> L2ff
            boolean r5 = r1.f()     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> L153 com.ss.android.socialbase.downloader.up.j -> L156 com.ss.android.socialbase.downloader.up.xt -> L2ff
            if (r5 == 0) goto L118
            r1.mi()     // Catch: java.lang.Throwable -> L22
            r1.av()
            return
        L118:
            com.ss.android.socialbase.downloader.ae.cw r5 = r1.av     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> L153 com.ss.android.socialbase.downloader.up.j -> L156 com.ss.android.socialbase.downloader.up.xt -> L2ff
            long r5 = r5.ka()     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> L153 com.ss.android.socialbase.downloader.up.j -> L156 com.ss.android.socialbase.downloader.up.xt -> L2ff
            r1.j(r5)     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> L153 com.ss.android.socialbase.downloader.up.j -> L156 com.ss.android.socialbase.downloader.up.xt -> L2ff
            int r7 = r1.j(r5, r0)     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> L153 com.ss.android.socialbase.downloader.up.j -> L156 com.ss.android.socialbase.downloader.up.xt -> L2ff
            boolean r9 = r1.f()     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> L153 com.ss.android.socialbase.downloader.up.j -> L156 com.ss.android.socialbase.downloader.up.xt -> L2ff
            if (r9 == 0) goto L132
            r1.mi()     // Catch: java.lang.Throwable -> L22
            r1.av()
            return
        L132:
            if (r7 <= 0) goto L1b6
            if (r7 != r4) goto L138
            r9 = 1
            goto L139
        L138:
            r9 = 0
        L139:
            r1.tl = r9     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> L153 com.ss.android.socialbase.downloader.up.j -> L156 com.ss.android.socialbase.downloader.up.xt -> L2ff
            if (r9 == 0) goto L185
            com.ss.android.socialbase.downloader.g.g r0 = r1.x     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> L153 com.ss.android.socialbase.downloader.up.j -> L156 com.ss.android.socialbase.downloader.up.xt -> L2ff
            if (r0 != 0) goto L165
            long r13 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L159
            r1.j(r8, r12)     // Catch: java.lang.Throwable -> L159
            com.ss.android.socialbase.downloader.ae.cw r0 = r1.av     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> L153 com.ss.android.socialbase.downloader.up.j -> L156 com.ss.android.socialbase.downloader.up.xt -> L2ff
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> L153 com.ss.android.socialbase.downloader.up.j -> L156 com.ss.android.socialbase.downloader.up.xt -> L2ff
            long r5 = r5 - r13
            r0.xt(r5)     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> L153 com.ss.android.socialbase.downloader.up.j -> L156 com.ss.android.socialbase.downloader.up.xt -> L2ff
            goto L165
        L153:
            r0 = move-exception
            goto L1f9
        L156:
            r0 = move-exception
            goto L2a5
        L159:
            r0 = move-exception
            com.ss.android.socialbase.downloader.ae.cw r5 = r1.av     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> L153 com.ss.android.socialbase.downloader.up.j -> L156 com.ss.android.socialbase.downloader.up.xt -> L2ff
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> L153 com.ss.android.socialbase.downloader.up.j -> L156 com.ss.android.socialbase.downloader.up.xt -> L2ff
            long r6 = r6 - r13
            r5.xt(r6)     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> L153 com.ss.android.socialbase.downloader.up.j -> L156 com.ss.android.socialbase.downloader.up.xt -> L2ff
            throw r0     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> L153 com.ss.android.socialbase.downloader.up.j -> L156 com.ss.android.socialbase.downloader.up.xt -> L2ff
        L165:
            boolean r0 = r1.f()     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> L153 com.ss.android.socialbase.downloader.up.j -> L156 com.ss.android.socialbase.downloader.up.xt -> L2ff
            if (r0 == 0) goto L172
            r1.mi()     // Catch: java.lang.Throwable -> L22
            r1.av()
            return
        L172:
            com.ss.android.socialbase.downloader.ae.cw r0 = r1.av     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> L153 com.ss.android.socialbase.downloader.up.j -> L156 com.ss.android.socialbase.downloader.up.xt -> L2ff
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> L153 com.ss.android.socialbase.downloader.up.j -> L156 com.ss.android.socialbase.downloader.up.xt -> L2ff
            long r5 = r5 - r2
            r0.j(r5)     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> L153 com.ss.android.socialbase.downloader.up.j -> L156 com.ss.android.socialbase.downloader.up.xt -> L2ff
            r1.az()     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> L153 com.ss.android.socialbase.downloader.up.j -> L156 com.ss.android.socialbase.downloader.up.xt -> L2ff
            com.ss.android.socialbase.downloader.g.g r0 = r1.x     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> L153 com.ss.android.socialbase.downloader.up.j -> L156 com.ss.android.socialbase.downloader.up.xt -> L2ff
            r1.j(r11, r8, r0)     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> L153 com.ss.android.socialbase.downloader.up.j -> L156 com.ss.android.socialbase.downloader.up.xt -> L2ff
            goto L1f4
        L185:
            com.ss.android.socialbase.downloader.ae.cw r8 = r1.av     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> L153 com.ss.android.socialbase.downloader.up.j -> L156 com.ss.android.socialbase.downloader.up.xt -> L2ff
            boolean r8 = r8.ln()     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> L153 com.ss.android.socialbase.downloader.up.j -> L156 com.ss.android.socialbase.downloader.up.xt -> L2ff
            if (r8 != 0) goto L190
            r1.w()     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> L153 com.ss.android.socialbase.downloader.up.j -> L156 com.ss.android.socialbase.downloader.up.xt -> L2ff
        L190:
            boolean r8 = r1.f()     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> L153 com.ss.android.socialbase.downloader.up.j -> L156 com.ss.android.socialbase.downloader.up.xt -> L2ff
            if (r8 == 0) goto L19d
            r1.mi()     // Catch: java.lang.Throwable -> L22
            r1.av()
            return
        L19d:
            r1.az()     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> L153 com.ss.android.socialbase.downloader.up.j -> L156 com.ss.android.socialbase.downloader.up.xt -> L2ff
            com.ss.android.socialbase.downloader.ae.cw r8 = r1.av     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> L153 com.ss.android.socialbase.downloader.up.j -> L156 com.ss.android.socialbase.downloader.up.xt -> L2ff
            long r11 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> L153 com.ss.android.socialbase.downloader.up.j -> L156 com.ss.android.socialbase.downloader.up.xt -> L2ff
            long r11 = r11 - r2
            r8.j(r11)     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> L153 com.ss.android.socialbase.downloader.up.j -> L156 com.ss.android.socialbase.downloader.up.xt -> L2ff
            boolean r8 = r1.g     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> L153 com.ss.android.socialbase.downloader.up.j -> L156 com.ss.android.socialbase.downloader.up.xt -> L2ff
            if (r8 == 0) goto L1b2
            r1.j(r7, r0)     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> L153 com.ss.android.socialbase.downloader.up.j -> L156 com.ss.android.socialbase.downloader.up.xt -> L2ff
            goto L1f4
        L1b2:
            r1.j(r5, r7)     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> L153 com.ss.android.socialbase.downloader.up.j -> L156 com.ss.android.socialbase.downloader.up.xt -> L2ff
            goto L1f4
        L1b6:
            com.ss.android.socialbase.downloader.up.j r0 = new com.ss.android.socialbase.downloader.up.j     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> L153 com.ss.android.socialbase.downloader.up.j -> L156 com.ss.android.socialbase.downloader.up.xt -> L2ff
            java.lang.String r5 = "chunkCount is 0"
            r6 = 1032(0x408, float:1.446E-42)
            r0.<init>(r6, r5)     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> L153 com.ss.android.socialbase.downloader.up.j -> L156 com.ss.android.socialbase.downloader.up.xt -> L2ff
            throw r0     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> L153 com.ss.android.socialbase.downloader.up.j -> L156 com.ss.android.socialbase.downloader.up.xt -> L2ff
        L1c0:
            r0 = move-exception
            r10 = 0
            com.ss.android.socialbase.downloader.ae.cw r5 = r1.av     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> L153 com.ss.android.socialbase.downloader.up.j -> L156 com.ss.android.socialbase.downloader.up.xt -> L2ff
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> L153 com.ss.android.socialbase.downloader.up.j -> L156 com.ss.android.socialbase.downloader.up.xt -> L2ff
            long r6 = r6 - r13
            r5.xt(r6)     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> L153 com.ss.android.socialbase.downloader.up.j -> L156 com.ss.android.socialbase.downloader.up.xt -> L2ff
            throw r0     // Catch: java.lang.Throwable -> Lb4 com.ss.android.socialbase.downloader.up.oq -> L153 com.ss.android.socialbase.downloader.up.j -> L156 com.ss.android.socialbase.downloader.up.xt -> L2ff
        L1cd:
            java.lang.String r2 = com.ss.android.socialbase.downloader.ws.cw.j     // Catch: java.lang.Throwable -> L1f1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1f1
            java.lang.String r4 = "downloadInner: throwable =  "
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L1f1
            r3.append(r0)     // Catch: java.lang.Throwable -> L1f1
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L1f1
            com.ss.android.socialbase.downloader.m.j.r(r2, r3)     // Catch: java.lang.Throwable -> L1f1
            com.ss.android.socialbase.downloader.xt.oq r2 = r1.ws     // Catch: java.lang.Throwable -> L1f1
            com.ss.android.socialbase.downloader.xt.oq r3 = com.ss.android.socialbase.downloader.xt.oq.xt     // Catch: java.lang.Throwable -> L1f1
            if (r2 == r3) goto L1f4
            com.ss.android.socialbase.downloader.up.j r2 = new com.ss.android.socialbase.downloader.up.j     // Catch: java.lang.Throwable -> L1f1
            r3 = 1045(0x415, float:1.464E-42)
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L1f1
            r1.xt(r2)     // Catch: java.lang.Throwable -> L1f1
            goto L1f4
        L1f1:
            r0 = move-exception
            goto L308
        L1f4:
            r1.mi()     // Catch: java.lang.Throwable -> L22
            goto L304
        L1f9:
            java.lang.String r5 = com.ss.android.socialbase.downloader.ws.cw.j     // Catch: java.lang.Throwable -> L1f1
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1f1
            java.lang.String r7 = "downloadInner: retry throwable for "
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L1f1
            java.lang.String r7 = r0.j()     // Catch: java.lang.Throwable -> L1f1
            r6.append(r7)     // Catch: java.lang.Throwable -> L1f1
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L1f1
            com.ss.android.socialbase.downloader.m.j.r(r5, r6)     // Catch: java.lang.Throwable -> L1f1
            com.ss.android.socialbase.downloader.xt.oq r5 = r1.ws     // Catch: java.lang.Throwable -> L1f1
            com.ss.android.socialbase.downloader.xt.oq r6 = com.ss.android.socialbase.downloader.xt.oq.xt     // Catch: java.lang.Throwable -> L1f1
            if (r5 == r6) goto L1f4
            java.util.concurrent.atomic.AtomicInteger r5 = r1.up     // Catch: java.lang.Throwable -> L1f1
            r6 = 5
            if (r5 == 0) goto L235
            int r5 = r5.get()     // Catch: java.lang.Throwable -> L1f1
            if (r5 <= 0) goto L235
            com.ss.android.socialbase.downloader.ae.cw r0 = r1.av     // Catch: java.lang.Throwable -> L1f1
            java.util.concurrent.atomic.AtomicInteger r5 = r1.up     // Catch: java.lang.Throwable -> L1f1
            int r5 = r5.decrementAndGet()     // Catch: java.lang.Throwable -> L1f1
            r0.g(r5)     // Catch: java.lang.Throwable -> L1f1
            com.ss.android.socialbase.downloader.ae.cw r0 = r1.av     // Catch: java.lang.Throwable -> L1f1
            r0.r(r6)     // Catch: java.lang.Throwable -> L1f1
            goto L25c
        L232:
            r5 = 0
            goto L7e
        L235:
            java.util.concurrent.atomic.AtomicInteger r5 = r1.up     // Catch: java.lang.Throwable -> L1f1
            if (r5 == 0) goto L287
            com.ss.android.socialbase.downloader.ae.cw r5 = r1.av     // Catch: java.lang.Throwable -> L1f1
            boolean r5 = r5.os()     // Catch: java.lang.Throwable -> L1f1
            if (r5 == 0) goto L260
            com.ss.android.socialbase.downloader.ae.cw r0 = r1.av     // Catch: java.lang.Throwable -> L1f1
            r0.r(r6)     // Catch: java.lang.Throwable -> L1f1
            java.util.concurrent.atomic.AtomicInteger r0 = r1.up     // Catch: java.lang.Throwable -> L1f1
            com.ss.android.socialbase.downloader.ae.cw r5 = r1.av     // Catch: java.lang.Throwable -> L1f1
            int r5 = r5.c()     // Catch: java.lang.Throwable -> L1f1
            r0.set(r5)     // Catch: java.lang.Throwable -> L1f1
            com.ss.android.socialbase.downloader.ae.cw r0 = r1.av     // Catch: java.lang.Throwable -> L1f1
            java.util.concurrent.atomic.AtomicInteger r5 = r1.up     // Catch: java.lang.Throwable -> L1f1
            int r5 = r5.get()     // Catch: java.lang.Throwable -> L1f1
            r0.g(r5)     // Catch: java.lang.Throwable -> L1f1
        L25c:
            r1.mi()     // Catch: java.lang.Throwable -> L22
            goto L232
        L260:
            com.ss.android.socialbase.downloader.up.j r2 = new com.ss.android.socialbase.downloader.up.j     // Catch: java.lang.Throwable -> L1f1
            java.lang.String r3 = "retry for Throwable, but retry Time %s all used, last error is %s"
            com.ss.android.socialbase.downloader.ae.cw r5 = r1.av     // Catch: java.lang.Throwable -> L1f1
            int r5 = r5.c()     // Catch: java.lang.Throwable -> L1f1
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L1f1
            java.lang.String r0 = r0.j()     // Catch: java.lang.Throwable -> L1f1
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L1f1
            r6[r10] = r5     // Catch: java.lang.Throwable -> L1f1
            r6[r4] = r0     // Catch: java.lang.Throwable -> L1f1
            java.lang.String r0 = java.lang.String.format(r3, r6)     // Catch: java.lang.Throwable -> L1f1
            r3 = 1018(0x3fa, float:1.427E-42)
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L1f1
            r1.xt(r2)     // Catch: java.lang.Throwable -> L1f1
            goto L1f4
        L287:
            com.ss.android.socialbase.downloader.up.j r2 = new com.ss.android.socialbase.downloader.up.j     // Catch: java.lang.Throwable -> L1f1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1f1
            java.lang.String r4 = "retry for Throwable, but retain retry time is NULL, last error is"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L1f1
            java.lang.String r0 = r0.j()     // Catch: java.lang.Throwable -> L1f1
            r3.append(r0)     // Catch: java.lang.Throwable -> L1f1
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L1f1
            r3 = 1043(0x413, float:1.462E-42)
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L1f1
            r1.xt(r2)     // Catch: java.lang.Throwable -> L1f1
            goto L1f4
        L2a5:
            java.lang.String r5 = com.ss.android.socialbase.downloader.ws.cw.j     // Catch: java.lang.Throwable -> L1f1
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1f1
            java.lang.String r7 = "downloadInner: baseException = "
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L1f1
            r6.append(r0)     // Catch: java.lang.Throwable -> L1f1
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L1f1
            com.ss.android.socialbase.downloader.m.j.r(r5, r6)     // Catch: java.lang.Throwable -> L1f1
            com.ss.android.socialbase.downloader.xt.oq r5 = r1.ws     // Catch: java.lang.Throwable -> L1f1
            com.ss.android.socialbase.downloader.xt.oq r6 = com.ss.android.socialbase.downloader.xt.oq.xt     // Catch: java.lang.Throwable -> L1f1
            if (r5 == r6) goto L1f4
            int r5 = r0.j()     // Catch: java.lang.Throwable -> L1f1
            r6 = 1025(0x401, float:1.436E-42)
            if (r5 == r6) goto L2f4
            int r5 = r0.j()     // Catch: java.lang.Throwable -> L1f1
            r6 = 1009(0x3f1, float:1.414E-42)
            if (r5 != r6) goto L2cf
            goto L2f4
        L2cf:
            boolean r5 = r1.j(r0)     // Catch: java.lang.Throwable -> L1f1
            if (r5 == 0) goto L2ef
            boolean r5 = com.ss.android.socialbase.downloader.az.m.j(r0)     // Catch: java.lang.Throwable -> L1f1
            if (r5 == 0) goto L2de
            r1.wq()     // Catch: java.lang.Throwable -> L1f1
        L2de:
            r5 = 0
            com.ss.android.socialbase.downloader.up.g r0 = r1.j(r0, r5)     // Catch: java.lang.Throwable -> L1f1
            com.ss.android.socialbase.downloader.up.g r5 = com.ss.android.socialbase.downloader.up.g.j     // Catch: java.lang.Throwable -> L1f1
            if (r0 != r5) goto L25c
            r1.mi()     // Catch: java.lang.Throwable -> L22
            r1.av()
            return
        L2ef:
            r1.xt(r0)     // Catch: java.lang.Throwable -> L1f1
            goto L1f4
        L2f4:
            com.ss.android.socialbase.downloader.xt.oq r0 = com.ss.android.socialbase.downloader.xt.oq.up     // Catch: java.lang.Throwable -> L1f1
            r1.ws = r0     // Catch: java.lang.Throwable -> L1f1
            r1.mi()     // Catch: java.lang.Throwable -> L22
            r1.av()
            return
        L2ff:
            r1.jy()     // Catch: java.lang.Throwable -> L1f1
            goto L1f4
        L304:
            r1.av()
            return
        L308:
            r1.mi()     // Catch: java.lang.Throwable -> L22
            throw r0     // Catch: java.lang.Throwable -> L22
        L30c:
            r1.av()
            throw r0
    }

    private void w() {
            r1 = this;
            com.ss.android.socialbase.downloader.g.g r0 = r1.x
            if (r0 == 0) goto La
            r0.r()
            r0 = 0
            r1.x = r0
        La:
            return
    }

    private void wq() {
            r3 = this;
            java.lang.String r0 = com.ss.android.socialbase.downloader.ws.cw.j
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "clearCurrentDownloadData::"
            r1.<init>(r2)
            java.lang.Throwable r2 = new java.lang.Throwable
            r2.<init>()
            java.lang.String r2 = android.util.Log.getStackTraceString(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.ss.android.socialbase.downloader.m.j.r(r0, r1)
            com.ss.android.socialbase.downloader.downloader.vl r0 = r3.az     // Catch: java.lang.Throwable -> L49
            com.ss.android.socialbase.downloader.ae.cw r1 = r3.av     // Catch: java.lang.Throwable -> L49
            int r1 = r1.ae()     // Catch: java.lang.Throwable -> L49
            r0.r(r1)     // Catch: java.lang.Throwable -> L49
            com.ss.android.socialbase.downloader.downloader.vl r0 = r3.az     // Catch: java.lang.Throwable -> L49
            com.ss.android.socialbase.downloader.ae.cw r1 = r3.av     // Catch: java.lang.Throwable -> L49
            int r1 = r1.ae()     // Catch: java.lang.Throwable -> L49
            r0.jy(r1)     // Catch: java.lang.Throwable -> L49
            com.ss.android.socialbase.downloader.ae.cw r0 = r3.av     // Catch: java.lang.Throwable -> L49
            com.ss.android.socialbase.downloader.az.m.j(r0)     // Catch: java.lang.Throwable -> L49
            r0 = 0
            r3.g = r0     // Catch: java.lang.Throwable -> L49
            com.ss.android.socialbase.downloader.ae.cw r0 = r3.av     // Catch: java.lang.Throwable -> L49
            java.lang.String r1 = ""
            r0.vl(r1)     // Catch: java.lang.Throwable -> L49
            com.ss.android.socialbase.downloader.downloader.vl r0 = r3.az     // Catch: java.lang.Throwable -> L49
            com.ss.android.socialbase.downloader.ae.cw r1 = r3.av     // Catch: java.lang.Throwable -> L49
            r0.j(r1)     // Catch: java.lang.Throwable -> L49
            return
        L49:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
            return
    }

    private boolean ws() throws com.ss.android.socialbase.downloader.up.j, java.lang.InterruptedException {
            r9 = this;
            com.ss.android.socialbase.downloader.ae.cw r0 = r9.av
            boolean r0 = r0.ki()
            r1 = 0
            if (r0 == 0) goto La
            return r1
        La:
            com.ss.android.socialbase.downloader.ae.cw r0 = r9.av
            int r0 = r0.kj()
            r2 = 1
            if (r0 != r2) goto L8e
            com.ss.android.socialbase.downloader.ae.cw r0 = r9.av
            long r3 = r0.sh()
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L20
            goto L8e
        L20:
            com.ss.android.socialbase.downloader.ae.cw r0 = r9.av
            int r0 = r0.ae()
            com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.j(r0)
            java.lang.String r3 = "segment_config"
            org.json.JSONObject r0 = r0.r(r3)
            com.ss.android.socialbase.downloader.downloader.vl r3 = r9.az
            com.ss.android.socialbase.downloader.ae.cw r4 = r9.av
            int r4 = r4.ae()
            java.util.List r3 = r3.ws(r4)
            com.ss.android.socialbase.downloader.ae.cw r4 = r9.av
            long r7 = r4.uq()
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 <= 0) goto L58
            if (r3 == 0) goto L57
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L4f
            goto L57
        L4f:
            if (r0 != 0) goto L58
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            goto L58
        L57:
            return r1
        L58:
            if (r0 != 0) goto L5b
            return r1
        L5b:
            com.ss.android.socialbase.downloader.qv.ws r0 = com.ss.android.socialbase.downloader.qv.ws.j(r0)
            com.ss.android.socialbase.downloader.qv.qv r1 = new com.ss.android.socialbase.downloader.qv.qv
            com.ss.android.socialbase.downloader.ae.cw r4 = r9.av
            r1.<init>(r4, r0, r9)
            r9.c = r1
            boolean r0 = r9.f()
            if (r0 == 0) goto L87
            java.lang.String r0 = com.ss.android.socialbase.downloader.ws.cw.j
            java.lang.String r1 = "downloadSegments: is stopped by user"
            com.ss.android.socialbase.downloader.m.j.cw(r0, r1)
            com.ss.android.socialbase.downloader.xt.oq r0 = r9.ws
            com.ss.android.socialbase.downloader.xt.oq r1 = com.ss.android.socialbase.downloader.xt.oq.cw
            if (r0 != r1) goto L81
            com.ss.android.socialbase.downloader.qv.qv r0 = r9.c
            r0.j()
            goto L86
        L81:
            com.ss.android.socialbase.downloader.qv.qv r0 = r9.c
            r0.xt()
        L86:
            return r2
        L87:
            com.ss.android.socialbase.downloader.qv.qv r0 = r9.c
            boolean r0 = r0.j(r3)
            return r0
        L8e:
            return r1
    }

    private boolean x() {
            r7 = this;
            com.ss.android.socialbase.downloader.ae.cw r0 = r7.av
            int r0 = r0.kj()
            r1 = 0
            r2 = 1
            if (r0 > r2) goto L28
            com.ss.android.socialbase.downloader.ae.cw r0 = r7.av
            long r3 = r0.uq()
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L27
            com.ss.android.socialbase.downloader.ae.cw r0 = r7.av
            long r3 = r0.uq()
            com.ss.android.socialbase.downloader.ae.cw r0 = r7.av
            long r5 = r0.ka()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L27
            return r2
        L27:
            return r1
        L28:
            com.ss.android.socialbase.downloader.downloader.vl r0 = r7.az
            com.ss.android.socialbase.downloader.ae.cw r3 = r7.av
            int r3 = r3.ae()
            java.util.List r0 = r0.cw(r3)
            if (r0 == 0) goto L57
            int r3 = r0.size()
            if (r3 > r2) goto L3d
            goto L57
        L3d:
            java.util.Iterator r0 = r0.iterator()
        L41:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L56
            java.lang.Object r3 = r0.next()
            com.ss.android.socialbase.downloader.ae.xt r3 = (com.ss.android.socialbase.downloader.ae.xt) r3
            if (r3 == 0) goto L55
            boolean r3 = r3.g()
            if (r3 != 0) goto L41
        L55:
            return r1
        L56:
            return r2
        L57:
            return r1
    }

    private void xt(java.lang.String r4, java.util.List<com.ss.android.socialbase.downloader.ae.up> r5, long r6) throws com.ss.android.socialbase.downloader.up.j, com.ss.android.socialbase.downloader.up.oq {
            r3 = this;
            com.ss.android.socialbase.downloader.ae.cw r6 = r3.av
            int r6 = r6.kj()
            r7 = 1
            if (r6 != r7) goto L1a
            com.ss.android.socialbase.downloader.g.j.j r6 = com.ss.android.socialbase.downloader.g.j.j.j()
            com.ss.android.socialbase.downloader.g.j.cw r6 = r6.j(r4, r5)
            if (r6 == 0) goto L1a
            r3.ch = r6
            com.ss.android.socialbase.downloader.ae.cw r6 = r3.av
            r6.az(r7)
        L1a:
            com.ss.android.socialbase.downloader.g.ae r6 = r3.ch
            if (r6 != 0) goto L52
            boolean r6 = r3.h
            if (r6 != 0) goto L52
            com.ss.android.socialbase.downloader.ae.cw r6 = r3.av
            boolean r6 = r6.y()
            if (r6 == 0) goto L52
            com.ss.android.socialbase.downloader.jy.j r6 = r3.uf     // Catch: java.lang.Throwable -> L48
            java.lang.String r0 = "net_lib_strategy"
            int r6 = r6.xt(r0)     // Catch: java.lang.Throwable -> L48
            com.ss.android.socialbase.downloader.jy.j r0 = r3.uf     // Catch: java.lang.Throwable -> L48
            java.lang.String r1 = "monitor_download_connect"
            r2 = 0
            int r0 = r0.j(r1, r2)     // Catch: java.lang.Throwable -> L48
            if (r0 <= 0) goto L3e
            goto L3f
        L3e:
            r7 = 0
        L3f:
            com.ss.android.socialbase.downloader.ae.cw r0 = r3.av     // Catch: java.lang.Throwable -> L48
            com.ss.android.socialbase.downloader.g.ae r4 = com.ss.android.socialbase.downloader.downloader.cw.j(r4, r5, r6, r7, r0)     // Catch: java.lang.Throwable -> L48
            r3.ch = r4     // Catch: java.lang.Throwable -> L48
            return
        L48:
            r4 = move-exception
            com.ss.android.socialbase.downloader.ae.cw r5 = r3.av
            java.lang.String r4 = com.ss.android.socialbase.downloader.az.m.oq(r4)
            r5.j(r4)
        L52:
            return
    }

    public java.util.concurrent.Future ae() {
            r1 = this;
            java.util.concurrent.Future r0 = r1.xt
            return r0
    }

    public com.ss.android.socialbase.downloader.ae.r cw() {
            r1 = this;
            com.ss.android.socialbase.downloader.ae.r r0 = r1.cw
            return r0
    }

    @Override // com.ss.android.socialbase.downloader.ws.m
    public void cw(com.ss.android.socialbase.downloader.up.j r3) {
            r2 = this;
            com.ss.android.socialbase.downloader.ae.cw r0 = r2.av
            if (r0 == 0) goto L8
            r1 = 1
            r0.ws(r1)
        L8:
            r0 = 0
            r2.j(r3, r0)
            return
    }

    @Override // com.ss.android.socialbase.downloader.ws.m
    public synchronized com.ss.android.socialbase.downloader.ae.xt j(int r5) {
            r4 = this;
            monitor-enter(r4)
            com.ss.android.socialbase.downloader.ae.cw r0 = r4.av     // Catch: java.lang.Throwable -> L39
            int r0 = r0.kj()     // Catch: java.lang.Throwable -> L39
            r1 = 2
            r2 = 0
            if (r0 >= r1) goto Ld
            monitor-exit(r4)
            return r2
        Ld:
            com.ss.android.socialbase.downloader.downloader.vl r0 = r4.az     // Catch: java.lang.Throwable -> L39
            com.ss.android.socialbase.downloader.ae.cw r1 = r4.av     // Catch: java.lang.Throwable -> L39
            int r1 = r1.ae()     // Catch: java.lang.Throwable -> L39
            java.util.List r0 = r0.cw(r1)     // Catch: java.lang.Throwable -> L39
            if (r0 == 0) goto L40
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L39
            if (r1 == 0) goto L22
            goto L40
        L22:
            r1 = 0
        L23:
            int r3 = r0.size()     // Catch: java.lang.Throwable -> L39
            if (r1 >= r3) goto L3e
            java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L39
            com.ss.android.socialbase.downloader.ae.xt r3 = (com.ss.android.socialbase.downloader.ae.xt) r3     // Catch: java.lang.Throwable -> L39
            if (r3 == 0) goto L3b
            com.ss.android.socialbase.downloader.ae.xt r3 = r4.j(r3, r5)     // Catch: java.lang.Throwable -> L39
            if (r3 == 0) goto L3b
            monitor-exit(r4)
            return r3
        L39:
            r5 = move-exception
            goto L42
        L3b:
            int r1 = r1 + 1
            goto L23
        L3e:
            monitor-exit(r4)
            return r2
        L40:
            monitor-exit(r4)
            return r2
        L42:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L39
            throw r5
    }

    @Override // com.ss.android.socialbase.downloader.ws.m
    public com.ss.android.socialbase.downloader.up.g j(com.ss.android.socialbase.downloader.ae.xt r3, com.ss.android.socialbase.downloader.up.j r4, long r5) {
            r2 = this;
            boolean r0 = r2.tj()
            if (r0 == 0) goto L9
            com.ss.android.socialbase.downloader.up.g r3 = com.ss.android.socialbase.downloader.up.g.j
            return r3
        L9:
            if (r4 == 0) goto L1e
            int r0 = r4.j()
            r1 = 1047(0x417, float:1.467E-42)
            if (r0 == r1) goto L19
            boolean r0 = com.ss.android.socialbase.downloader.az.m.tl(r4)
            if (r0 == 0) goto L1e
        L19:
            com.ss.android.socialbase.downloader.up.g r3 = r2.j(r4, r5)
            return r3
        L1e:
            r2.v = r4
            com.ss.android.socialbase.downloader.ae.cw r0 = r2.av
            long r5 = -r5
            r0.m(r5)
            com.ss.android.socialbase.downloader.downloader.vl r5 = r2.az
            com.ss.android.socialbase.downloader.ae.cw r6 = r2.av
            r5.j(r6)
            boolean r5 = r2.r(r4)
            if (r5 == 0) goto L36
            com.ss.android.socialbase.downloader.up.g r3 = com.ss.android.socialbase.downloader.up.g.j
            return r3
        L36:
            com.ss.android.socialbase.downloader.downloader.m r5 = r2.f
            com.ss.android.socialbase.downloader.xt.oq r6 = r2.ws
            com.ss.android.socialbase.downloader.xt.oq r0 = com.ss.android.socialbase.downloader.xt.oq.m
            if (r6 != r0) goto L40
            r6 = 1
            goto L41
        L40:
            r6 = 0
        L41:
            r5.j(r3, r4, r6)
            com.ss.android.socialbase.downloader.xt.oq r3 = r2.ws
            if (r3 == r0) goto L89
            com.ss.android.socialbase.downloader.ae.cw r3 = r2.av
            boolean r3 = r3.wi()
            if (r3 == 0) goto L89
            long r3 = r2.a()
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L89
            java.lang.String r5 = com.ss.android.socialbase.downloader.ws.cw.j
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "onSingleChunkRetry with delay time "
            r6.<init>(r0)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            com.ss.android.socialbase.downloader.m.j.cw(r5, r6)
            java.lang.Thread.sleep(r3)     // Catch: java.lang.Throwable -> L71
            goto L89
        L71:
            r3 = move-exception
            java.lang.String r4 = com.ss.android.socialbase.downloader.ws.cw.j
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "onSingleChunkRetry:"
            r5.<init>(r6)
            java.lang.String r3 = r3.getMessage()
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            com.ss.android.socialbase.downloader.m.j.r(r4, r3)
        L89:
            com.ss.android.socialbase.downloader.up.g r3 = com.ss.android.socialbase.downloader.up.g.xt
            return r3
    }

    @Override // com.ss.android.socialbase.downloader.ws.m
    public com.ss.android.socialbase.downloader.up.g j(com.ss.android.socialbase.downloader.up.j r7, long r8) {
            r6 = this;
            r6.v = r7
            com.ss.android.socialbase.downloader.ae.cw r0 = r6.av
            long r8 = -r8
            r0.m(r8)
            com.ss.android.socialbase.downloader.downloader.vl r8 = r6.az
            com.ss.android.socialbase.downloader.ae.cw r9 = r6.av
            r8.j(r9)
            boolean r8 = r6.tj()
            if (r8 == 0) goto L18
            com.ss.android.socialbase.downloader.up.g r7 = com.ss.android.socialbase.downloader.up.g.j
            return r7
        L18:
            r8 = 0
            if (r7 == 0) goto L60
            int r9 = r7.j()
            r0 = 1047(0x417, float:1.467E-42)
            if (r9 != r0) goto L60
            com.ss.android.socialbase.downloader.r.ch r9 = r6.s
            if (r9 == 0) goto L57
            com.ss.android.socialbase.downloader.ae.cw r9 = r6.av
            boolean r9 = r9.na()
            if (r9 == 0) goto L30
            goto L57
        L30:
            com.ss.android.socialbase.downloader.ws.cw$1 r9 = new com.ss.android.socialbase.downloader.ws.cw$1
            r9.<init>(r6)
            com.ss.android.socialbase.downloader.r.ch r0 = r6.s
            boolean r0 = r0.j(r9)
            com.ss.android.socialbase.downloader.ae.cw r1 = r6.av
            r1.gr()
            if (r0 == 0) goto Lf4
            boolean r9 = r9.j()
            if (r9 != 0) goto Lfd
            r6.uf()
            com.ss.android.socialbase.downloader.downloader.m r7 = r6.f
            r7.tl()
            com.ss.android.socialbase.downloader.xt.oq r7 = com.ss.android.socialbase.downloader.xt.oq.ae
            r6.ws = r7
            com.ss.android.socialbase.downloader.up.g r7 = com.ss.android.socialbase.downloader.up.g.j
            return r7
        L57:
            boolean r9 = r6.r(r7)
            if (r9 == 0) goto Lf4
            com.ss.android.socialbase.downloader.up.g r7 = com.ss.android.socialbase.downloader.up.g.j
            return r7
        L60:
            boolean r9 = com.ss.android.socialbase.downloader.az.m.tl(r7)
            if (r9 == 0) goto Leb
            com.ss.android.socialbase.downloader.r.mi r9 = r6.a
            if (r9 != 0) goto L70
            r6.xt(r7)
            com.ss.android.socialbase.downloader.up.g r7 = com.ss.android.socialbase.downloader.up.g.j
            return r7
        L70:
            java.util.concurrent.atomic.AtomicBoolean r9 = new java.util.concurrent.atomic.AtomicBoolean
            r9.<init>(r8)
            com.ss.android.socialbase.downloader.ws.cw$2 r5 = new com.ss.android.socialbase.downloader.ws.cw$2
            r5.<init>(r6, r9)
            boolean r0 = r7 instanceof com.ss.android.socialbase.downloader.up.up
            if (r0 == 0) goto L8a
            r0 = r7
            com.ss.android.socialbase.downloader.up.up r0 = (com.ss.android.socialbase.downloader.up.up) r0
            long r1 = r0.r()
            long r3 = r0.up()
            goto L92
        L8a:
            com.ss.android.socialbase.downloader.ae.cw r0 = r6.av
            long r3 = r0.ka()
            r1 = -1
        L92:
            monitor-enter(r6)
            com.ss.android.socialbase.downloader.r.mi r0 = r6.a     // Catch: java.lang.Throwable -> Lb1
            boolean r0 = r0.j(r1, r3, r5)     // Catch: java.lang.Throwable -> Lb1
            if (r0 == 0) goto Ld8
            com.ss.android.socialbase.downloader.ae.cw r0 = r6.av     // Catch: java.lang.Throwable -> Lb1
            int r0 = r0.ae()     // Catch: java.lang.Throwable -> Lb1
            com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.j(r0)     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r1 = "not_delete_when_clean_space"
            boolean r0 = r0.xt(r1, r8)     // Catch: java.lang.Throwable -> Lb1
            if (r0 != 0) goto Lb4
            r6.ch()     // Catch: java.lang.Throwable -> Lb1
            goto Lb4
        Lb1:
            r0 = move-exception
            r7 = r0
            goto Le9
        Lb4:
            boolean r9 = r9.get()     // Catch: java.lang.Throwable -> Lb1
            if (r9 != 0) goto Lce
            com.ss.android.socialbase.downloader.xt.oq r7 = r6.ws     // Catch: java.lang.Throwable -> Lb1
            com.ss.android.socialbase.downloader.xt.oq r8 = com.ss.android.socialbase.downloader.xt.oq.ae     // Catch: java.lang.Throwable -> Lb1
            if (r7 == r8) goto Lca
            r6.ws = r8     // Catch: java.lang.Throwable -> Lb1
            r6.uf()     // Catch: java.lang.Throwable -> Lb1
            com.ss.android.socialbase.downloader.downloader.m r7 = r6.f     // Catch: java.lang.Throwable -> Lb1
            r7.tl()     // Catch: java.lang.Throwable -> Lb1
        Lca:
            com.ss.android.socialbase.downloader.up.g r7 = com.ss.android.socialbase.downloader.up.g.j     // Catch: java.lang.Throwable -> Lb1
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lb1
            return r7
        Lce:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lb1
            boolean r9 = r6.r(r7)
            if (r9 == 0) goto Lfd
            com.ss.android.socialbase.downloader.up.g r7 = com.ss.android.socialbase.downloader.up.g.j
            return r7
        Ld8:
            com.ss.android.socialbase.downloader.xt.oq r8 = r6.ws     // Catch: java.lang.Throwable -> Lb1
            com.ss.android.socialbase.downloader.xt.oq r9 = com.ss.android.socialbase.downloader.xt.oq.ae     // Catch: java.lang.Throwable -> Lb1
            if (r8 != r9) goto Le2
            com.ss.android.socialbase.downloader.up.g r7 = com.ss.android.socialbase.downloader.up.g.j     // Catch: java.lang.Throwable -> Lb1
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lb1
            return r7
        Le2:
            r6.xt(r7)     // Catch: java.lang.Throwable -> Lb1
            com.ss.android.socialbase.downloader.up.g r7 = com.ss.android.socialbase.downloader.up.g.j     // Catch: java.lang.Throwable -> Lb1
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lb1
            return r7
        Le9:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lb1
            throw r7
        Leb:
            boolean r9 = r6.r(r7)
            if (r9 == 0) goto Lf4
            com.ss.android.socialbase.downloader.up.g r7 = com.ss.android.socialbase.downloader.up.g.j
            return r7
        Lf4:
            boolean r9 = r6.c()
            if (r9 == 0) goto Lfd
            r6.uf()
        Lfd:
            com.ss.android.socialbase.downloader.downloader.m r9 = r6.f
            com.ss.android.socialbase.downloader.xt.oq r0 = r6.ws
            com.ss.android.socialbase.downloader.xt.oq r1 = com.ss.android.socialbase.downloader.xt.oq.m
            if (r0 != r1) goto L106
            r8 = 1
        L106:
            r9.j(r7, r8)
            com.ss.android.socialbase.downloader.xt.oq r7 = r6.ws
            if (r7 != r1) goto L110
            com.ss.android.socialbase.downloader.up.g r7 = com.ss.android.socialbase.downloader.up.g.j
            return r7
        L110:
            com.ss.android.socialbase.downloader.up.g r7 = com.ss.android.socialbase.downloader.up.g.xt
            return r7
    }

    public void j() {
            r2 = this;
            com.ss.android.socialbase.downloader.xt.oq r0 = com.ss.android.socialbase.downloader.xt.oq.xt
            r2.ws = r0
            com.ss.android.socialbase.downloader.qv.qv r1 = r2.c
            if (r1 == 0) goto Ld
            com.ss.android.socialbase.downloader.qv.qv r1 = r2.c
            r1.xt()
        Ld:
            com.ss.android.socialbase.downloader.downloader.up r1 = r2.ae
            if (r1 == 0) goto L16
            com.ss.android.socialbase.downloader.downloader.up r1 = r2.ae
            r1.xt()
        L16:
            com.ss.android.socialbase.downloader.qv.qv r1 = r2.c
            if (r1 != 0) goto L26
            com.ss.android.socialbase.downloader.downloader.up r1 = r2.ae
            if (r1 != 0) goto L26
            r2.mi()
            r2.ws = r0
            r2.av()
        L26:
            java.util.ArrayList<com.ss.android.socialbase.downloader.ws.xt> r0 = r2.m     // Catch: java.lang.Throwable -> L44
            java.lang.Object r0 = r0.clone()     // Catch: java.lang.Throwable -> L44
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> L44
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L44
        L32:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto L46
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L44
            com.ss.android.socialbase.downloader.ws.xt r1 = (com.ss.android.socialbase.downloader.ws.xt) r1     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto L32
            r1.j()     // Catch: java.lang.Throwable -> L44
            goto L32
        L44:
            r0 = move-exception
            goto L47
        L46:
            return
        L47:
            com.bytedance.sdk.component.utils.vl.j(r0)
            return
    }

    @Override // com.ss.android.socialbase.downloader.ws.m
    public void j(long r26) throws com.ss.android.socialbase.downloader.up.j {
            r25 = this;
            r1 = r25
            java.lang.String r4 = ", mustSetLength = "
            java.lang.String r0 = "MB"
            com.ss.android.socialbase.downloader.ae.cw r5 = r1.av
            java.lang.String r5 = r5.vl()
            com.ss.android.socialbase.downloader.ae.cw r6 = r1.av
            java.lang.String r6 = r6.jy()
            boolean r7 = com.ss.android.socialbase.downloader.az.m.xt(r26)
            if (r7 == 0) goto L19
            return
        L19:
            com.ss.android.socialbase.downloader.ae.cw r7 = r1.av
            r8 = -1
            com.ss.android.socialbase.downloader.ae.ae r7 = com.ss.android.socialbase.downloader.az.m.j(r7, r5, r6, r8)
            r8 = 0
            java.io.File r10 = new java.io.File     // Catch: java.lang.Throwable -> L66
            r10.<init>(r5, r6)     // Catch: java.lang.Throwable -> L66
            long r10 = r10.length()     // Catch: java.lang.Throwable -> L66
            long r12 = r26 - r10
            long r5 = com.ss.android.socialbase.downloader.az.m.r(r5)     // Catch: java.lang.Throwable -> L66
            com.ss.android.socialbase.downloader.ae.cw r14 = r1.av     // Catch: java.lang.Throwable -> L66
            int r14 = r14.ae()     // Catch: java.lang.Throwable -> L66
            com.ss.android.socialbase.downloader.jy.j r14 = com.ss.android.socialbase.downloader.jy.j.j(r14)     // Catch: java.lang.Throwable -> L66
            java.lang.String r15 = "space_fill_part_download"
            int r15 = r14.j(r15, r8)     // Catch: java.lang.Throwable -> L66
            java.lang.String r8 = " 0"
            java.lang.String r17 = "<"
            java.lang.String r18 = "="
            java.lang.String r9 = "availableSpace "
            r19 = r10
            r10 = 0
            r21 = r12
            r12 = 1
            if (r15 != r12) goto L13b
            r1.rn = r10     // Catch: java.lang.Throwable -> L66
            int r12 = (r21 > r10 ? 1 : (r21 == r10 ? 0 : -1))
            if (r12 > 0) goto L6a
            com.ss.android.socialbase.downloader.ae.cw r12 = r1.av     // Catch: java.lang.Throwable -> L66
            long r12 = r12.ka()     // Catch: java.lang.Throwable -> L66
            com.ss.android.socialbase.downloader.ae.cw r15 = r1.av     // Catch: java.lang.Throwable -> L66
            long r21 = r15.uq()     // Catch: java.lang.Throwable -> L66
            long r12 = r12 - r21
            goto L6c
        L66:
            r0 = move-exception
            r12 = 1
            goto L1d6
        L6a:
            r12 = r21
        L6c:
            int r15 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r15 >= 0) goto L138
            java.lang.String r15 = com.ss.android.socialbase.downloader.ws.cw.j     // Catch: java.lang.Throwable -> L66
            r23 = r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L66
            java.lang.String r11 = "checkSpaceOverflow: contentLength = "
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L66
            double r2 = com.ss.android.socialbase.downloader.az.m.j(r26)     // Catch: java.lang.Throwable -> L66
            r10.append(r2)     // Catch: java.lang.Throwable -> L66
            java.lang.String r2 = "MB, downloaded = "
            r10.append(r2)     // Catch: java.lang.Throwable -> L66
            double r2 = com.ss.android.socialbase.downloader.az.m.j(r19)     // Catch: java.lang.Throwable -> L66
            r10.append(r2)     // Catch: java.lang.Throwable -> L66
            java.lang.String r2 = "MB, required = "
            r10.append(r2)     // Catch: java.lang.Throwable -> L66
            double r2 = com.ss.android.socialbase.downloader.az.m.j(r12)     // Catch: java.lang.Throwable -> L66
            r10.append(r2)     // Catch: java.lang.Throwable -> L66
            java.lang.String r2 = "MB, available = "
            r10.append(r2)     // Catch: java.lang.Throwable -> L66
            double r2 = com.ss.android.socialbase.downloader.az.m.j(r5)     // Catch: java.lang.Throwable -> L66
            r10.append(r2)     // Catch: java.lang.Throwable -> L66
            r10.append(r0)     // Catch: java.lang.Throwable -> L66
            java.lang.String r2 = r10.toString()     // Catch: java.lang.Throwable -> L66
            com.ss.android.socialbase.downloader.m.j.r(r15, r2)     // Catch: java.lang.Throwable -> L66
            int r2 = (r5 > r23 ? 1 : (r5 == r23 ? 0 : -1))
            if (r2 <= 0) goto L10b
            java.lang.String r2 = "space_fill_min_keep_mb"
            r3 = 100
            int r2 = r14.j(r2, r3)     // Catch: java.lang.Throwable -> L66
            if (r2 <= 0) goto Lfb
            long r8 = (long) r2     // Catch: java.lang.Throwable -> L66
            r10 = 1048576(0x100000, double:5.180654E-318)
            long r8 = r8 * r10
            long r8 = r5 - r8
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L66
            java.lang.String r10 = "checkSpaceOverflow: minKeep = "
            r3.<init>(r10)     // Catch: java.lang.Throwable -> L66
            r3.append(r2)     // Catch: java.lang.Throwable -> L66
            java.lang.String r2 = "MB, canDownload = "
            r3.append(r2)     // Catch: java.lang.Throwable -> L66
            double r10 = com.ss.android.socialbase.downloader.az.m.j(r8)     // Catch: java.lang.Throwable -> L66
            r3.append(r10)     // Catch: java.lang.Throwable -> L66
            r3.append(r0)     // Catch: java.lang.Throwable -> L66
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L66
            com.ss.android.socialbase.downloader.m.j.r(r15, r0)     // Catch: java.lang.Throwable -> L66
            int r0 = (r8 > r23 ? 1 : (r8 == r23 ? 0 : -1))
            if (r0 <= 0) goto Lf5
            com.ss.android.socialbase.downloader.ae.cw r0 = r1.av     // Catch: java.lang.Throwable -> L66
            long r2 = r0.uq()     // Catch: java.lang.Throwable -> L66
            long r2 = r2 + r8
            r1.rn = r2     // Catch: java.lang.Throwable -> L66
            r5 = r8
            goto Lfb
        Lf5:
            com.ss.android.socialbase.downloader.up.up r0 = new com.ss.android.socialbase.downloader.up.up     // Catch: java.lang.Throwable -> L66
            r0.<init>(r5, r12)     // Catch: java.lang.Throwable -> L66
            throw r0     // Catch: java.lang.Throwable -> L66
        Lfb:
            int r0 = (r19 > r26 ? 1 : (r19 == r26 ? 0 : -1))
            if (r0 >= 0) goto L105
            long r10 = r19 + r5
            int r0 = (r10 > r26 ? 1 : (r10 == r26 ? 0 : -1))
            if (r0 <= 0) goto L107
        L105:
            r10 = r26
        L107:
            r5 = r26
        L109:
            r2 = 1
            goto L167
        L10b:
            java.lang.String r0 = "download_when_space_negative"
            r3 = 0
            int r0 = r14.j(r0, r3)     // Catch: java.lang.Throwable -> L66
            r12 = 1
            if (r0 != r12) goto L11a
            r5 = r26
            r10 = r5
            r2 = 0
            goto L167
        L11a:
            com.ss.android.socialbase.downloader.up.j r0 = new com.ss.android.socialbase.downloader.up.j     // Catch: java.lang.Throwable -> L66
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L66
            r3.<init>(r9)     // Catch: java.lang.Throwable -> L66
            if (r2 != 0) goto L126
            r2 = r18
            goto L128
        L126:
            r2 = r17
        L128:
            r3.append(r2)     // Catch: java.lang.Throwable -> L66
            r3.append(r8)     // Catch: java.lang.Throwable -> L66
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L66
            r3 = 1052(0x41c, float:1.474E-42)
            r0.<init>(r3, r2)     // Catch: java.lang.Throwable -> L66
            throw r0     // Catch: java.lang.Throwable -> L66
        L138:
            r23 = r10
            goto L163
        L13b:
            r23 = r10
            int r0 = (r5 > r23 ? 1 : (r5 == r23 ? 0 : -1))
            if (r0 > 0) goto L15f
            com.ss.android.socialbase.downloader.up.j r2 = new com.ss.android.socialbase.downloader.up.j     // Catch: java.lang.Throwable -> L66
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L66
            r3.<init>(r9)     // Catch: java.lang.Throwable -> L66
            if (r0 != 0) goto L14d
            r0 = r18
            goto L14f
        L14d:
            r0 = r17
        L14f:
            r3.append(r0)     // Catch: java.lang.Throwable -> L66
            r3.append(r8)     // Catch: java.lang.Throwable -> L66
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L66
            r3 = 1052(0x41c, float:1.474E-42)
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L66
            throw r2     // Catch: java.lang.Throwable -> L66
        L15f:
            int r0 = (r5 > r21 ? 1 : (r5 == r21 ? 0 : -1))
            if (r0 < 0) goto L1ce
        L163:
            r5 = r26
            r10 = r5
            goto L109
        L167:
            r7.xt(r5)     // Catch: java.lang.Throwable -> L16c
        L16a:
            r12 = 1
            goto L1be
        L16c:
            r0 = move-exception
            java.lang.String r3 = com.ss.android.socialbase.downloader.ws.cw.j     // Catch: java.lang.Throwable -> L66
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L66
            java.lang.String r9 = "checkSpaceOverflow: setLength1 e = "
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L66
            r8.append(r0)     // Catch: java.lang.Throwable -> L66
            r8.append(r4)     // Catch: java.lang.Throwable -> L66
            r8.append(r2)     // Catch: java.lang.Throwable -> L66
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L66
            com.ss.android.socialbase.downloader.m.j.up(r3, r8)     // Catch: java.lang.Throwable -> L66
            r3 = 1040(0x410, float:1.457E-42)
            int r8 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r8 >= 0) goto L1bb
            int r5 = (r10 > r23 ? 1 : (r10 == r23 ? 0 : -1))
            if (r5 <= 0) goto L1bb
            int r5 = (r10 > r19 ? 1 : (r10 == r19 ? 0 : -1))
            if (r5 <= 0) goto L1bb
            r7.xt(r10)     // Catch: java.lang.Throwable -> L198
            goto L16a
        L198:
            r0 = move-exception
            java.lang.String r5 = com.ss.android.socialbase.downloader.ws.cw.j     // Catch: java.lang.Throwable -> L66
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L66
            java.lang.String r8 = "checkSpaceOverflow: setLength2 ex = "
            r6.<init>(r8)     // Catch: java.lang.Throwable -> L66
            r6.append(r0)     // Catch: java.lang.Throwable -> L66
            r6.append(r4)     // Catch: java.lang.Throwable -> L66
            r6.append(r2)     // Catch: java.lang.Throwable -> L66
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> L66
            com.ss.android.socialbase.downloader.m.j.up(r5, r4)     // Catch: java.lang.Throwable -> L66
            if (r2 != 0) goto L1b5
            goto L16a
        L1b5:
            com.ss.android.socialbase.downloader.up.j r2 = new com.ss.android.socialbase.downloader.up.j     // Catch: java.lang.Throwable -> L66
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L66
            throw r2     // Catch: java.lang.Throwable -> L66
        L1bb:
            if (r2 != 0) goto L1c8
            goto L16a
        L1be:
            java.io.Closeable[] r0 = new java.io.Closeable[r12]
            r16 = 0
            r0[r16] = r7
            com.ss.android.socialbase.downloader.az.m.j(r0)
            return
        L1c8:
            com.ss.android.socialbase.downloader.up.j r2 = new com.ss.android.socialbase.downloader.up.j     // Catch: java.lang.Throwable -> L66
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L66
            throw r2     // Catch: java.lang.Throwable -> L66
        L1ce:
            com.ss.android.socialbase.downloader.up.up r0 = new com.ss.android.socialbase.downloader.up.up     // Catch: java.lang.Throwable -> L66
            r2 = r21
            r0.<init>(r5, r2)     // Catch: java.lang.Throwable -> L66
            throw r0     // Catch: java.lang.Throwable -> L66
        L1d6:
            java.io.Closeable[] r2 = new java.io.Closeable[r12]
            r16 = 0
            r2[r16] = r7
            com.ss.android.socialbase.downloader.az.m.j(r2)
            throw r0
    }

    @Override // com.ss.android.socialbase.downloader.ws.m
    public void j(com.ss.android.socialbase.downloader.g.ae r2) {
            r1 = this;
            if (r2 == 0) goto L19
            int r2 = r2.xt()     // Catch: java.lang.Throwable -> L15
            com.ss.android.socialbase.downloader.ae.cw r0 = r1.av     // Catch: java.lang.Throwable -> L15
            r0.ae(r2)     // Catch: java.lang.Throwable -> L15
            com.ss.android.socialbase.downloader.ae.cw r0 = r1.av     // Catch: java.lang.Throwable -> L15
            java.lang.String r2 = com.ss.android.socialbase.downloader.az.xt.j(r2)     // Catch: java.lang.Throwable -> L15
            r0.g(r2)     // Catch: java.lang.Throwable -> L15
            return
        L15:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
        L19:
            com.ss.android.socialbase.downloader.ae.cw r2 = r1.av
            r0 = -1
            r2.ae(r0)
            com.ss.android.socialbase.downloader.ae.cw r2 = r1.av
            java.lang.String r0 = ""
            r2.g(r0)
            return
    }

    @Override // com.ss.android.socialbase.downloader.ws.m
    public void j(com.ss.android.socialbase.downloader.up.j r3, boolean r4) {
            r2 = this;
            java.lang.String r0 = com.ss.android.socialbase.downloader.ws.cw.j
            java.lang.String r1 = "onAllChunkRetryWithReset"
            com.ss.android.socialbase.downloader.m.j.xt(r0, r1)
            com.ss.android.socialbase.downloader.xt.oq r0 = com.ss.android.socialbase.downloader.xt.oq.g
            r2.ws = r0
            r2.v = r3
            r2.uf()
            if (r4 == 0) goto L17
            boolean r3 = r2.r(r3)
            goto L18
        L17:
            r3 = 0
        L18:
            if (r3 != 0) goto L1d
            r2.wq()
        L1d:
            return
    }

    @Override // com.ss.android.socialbase.downloader.ws.m
    public void j(com.ss.android.socialbase.downloader.ws.xt r2) {
            r1 = this;
            boolean r0 = r1.tl
            if (r0 != 0) goto Lf
            monitor-enter(r1)
            java.util.ArrayList<com.ss.android.socialbase.downloader.ws.xt> r0 = r1.m     // Catch: java.lang.Throwable -> Lc
            r0.remove(r2)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            throw r2
        Lf:
            return
    }

    @Override // com.ss.android.socialbase.downloader.ws.m
    public void j(java.lang.String r21, com.ss.android.socialbase.downloader.g.ae r22, long r23) throws com.ss.android.socialbase.downloader.up.j, com.ss.android.socialbase.downloader.up.oq {
            r20 = this;
            r1 = r20
            r0 = r22
            r2 = r23
            java.lang.String r4 = " before="
            java.lang.String r5 = " cur="
            java.lang.String r6 = "dcache=responseCode="
            if (r0 != 0) goto L10
            goto L2de
        L10:
            com.ss.android.socialbase.downloader.ae.m r7 = new com.ss.android.socialbase.downloader.ae.m     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            r8 = r21
            r7.<init>(r8, r0)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            int r8 = r7.cw     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            java.lang.String r9 = r7.r()     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            com.ss.android.socialbase.downloader.ae.cw r10 = r1.av     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            java.lang.String r10 = r10.xw()     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            if (r10 == 0) goto L3e
            boolean r10 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            if (r10 != 0) goto L3e
            com.ss.android.socialbase.downloader.ae.cw r10 = r1.av     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            r10.oq(r9)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            goto L3e
        L35:
            r0 = move-exception
            goto L330
        L38:
            r0 = move-exception
            goto L336
        L3b:
            r0 = move-exception
            goto L337
        L3e:
            boolean r9 = r7.xt()     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            r1.oq = r9     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            com.ss.android.socialbase.downloader.ae.cw r10 = r1.av     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            r10.qv(r9)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            boolean r9 = r7.j()     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            r1.qv = r9     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            com.ss.android.socialbase.downloader.ae.cw r9 = r1.av     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            java.lang.String r9 = r9.u()     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            java.lang.String r10 = r7.cw()     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            java.lang.String r11 = r7.m()     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            java.lang.String r12 = r7.ae()     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            java.lang.String r13 = com.ss.android.socialbase.downloader.ws.cw.j     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            r14.<init>(r6)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            r14.append(r8)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            java.lang.String r15 = " last_modified="
            r14.append(r15)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            r14.append(r11)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            java.lang.String r15 = " CACHE_CONTROL="
            r14.append(r15)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            r14.append(r12)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            java.lang.String r15 = " max-age="
            r14.append(r15)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            r21 = r9
            r15 = r10
            long r9 = r7.qv()     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            r14.append(r9)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            java.lang.String r9 = " isDeleteCacheIfCheckFailed="
            r14.append(r9)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            com.ss.android.socialbase.downloader.ae.cw r9 = r1.av     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            boolean r9 = r9.im()     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            r14.append(r9)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            java.lang.String r9 = r14.toString()     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            com.ss.android.socialbase.downloader.m.j.xt(r13, r9)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            java.lang.String r10 = "dcache=firstOffset="
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            r9.append(r2)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            r9.append(r5)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            r9.append(r11)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            r9.append(r4)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            com.ss.android.socialbase.downloader.ae.cw r10 = r1.av     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            java.lang.String r10 = r10.zz()     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            r9.append(r10)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            r9.append(r5)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            long r2 = r7.oq()     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            r9.append(r2)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            r9.append(r4)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            com.ss.android.socialbase.downloader.ae.cw r2 = r1.av     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            long r2 = r2.ka()     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            r9.append(r2)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            java.lang.String r2 = r9.toString()     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            com.ss.android.socialbase.downloader.m.j.xt(r13, r2)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            boolean r2 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            r3 = 0
            if (r2 != 0) goto L100
            com.ss.android.socialbase.downloader.ae.cw r2 = r1.av     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            r2.cw(r12)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            long r9 = r7.qv()     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            int r2 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r2 <= 0) goto L100
            com.ss.android.socialbase.downloader.ae.cw r2 = r1.av     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            long r9 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            long r16 = r7.qv()     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            r18 = 1000(0x3e8, double:4.94E-321)
            long r16 = r16 * r18
            long r9 = r9 + r16
            r2.r(r9)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
        L100:
            com.ss.android.socialbase.downloader.ae.cw r2 = r1.av     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            boolean r2 = r2.ki()     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            if (r2 == 0) goto L15e
            boolean r2 = r1.gq     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            if (r2 == 0) goto L15e
            java.lang.String r2 = r1.la     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            if (r2 != 0) goto L15e
            r2 = 304(0x130, float:4.26E-43)
            if (r8 == r2) goto L13f
            com.ss.android.socialbase.downloader.ae.cw r2 = r1.av     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            java.lang.String r2 = r2.zz()     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            if (r2 == 0) goto L12d
            com.ss.android.socialbase.downloader.ae.cw r2 = r1.av     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            boolean r2 = r2.im()     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            if (r2 == 0) goto L12d
            goto L139
        L12d:
            com.ss.android.socialbase.downloader.ae.cw r2 = r1.av     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            java.lang.String r2 = r2.zz()     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            boolean r2 = android.text.TextUtils.equals(r11, r2)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            if (r2 != 0) goto L13f
        L139:
            com.ss.android.socialbase.downloader.ae.cw r2 = r1.av     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            com.ss.android.socialbase.downloader.az.m.j(r2)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            goto L15e
        L13f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            r0.append(r8)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            java.lang.String r2 = " lastModified not changed, use local file  "
            r0.append(r2)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            r0.append(r11)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            com.ss.android.socialbase.downloader.m.j.xt(r13, r0)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            com.ss.android.socialbase.downloader.up.xt r0 = new com.ss.android.socialbase.downloader.up.xt     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            java.lang.String r2 = r1.la     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            throw r0     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
        L15e:
            java.lang.String r2 = ""
            int r5 = (r23 > r3 ? 1 : (r23 == r3 ? 0 : -1))
            if (r5 <= 0) goto L182
            com.ss.android.socialbase.downloader.ae.cw r6 = r1.av     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            boolean r6 = r6.ki()     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            if (r6 == 0) goto L182
            com.ss.android.socialbase.downloader.ae.cw r6 = r1.av     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            java.lang.String r6 = r6.zz()     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            boolean r6 = android.text.TextUtils.equals(r11, r6)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            if (r6 != 0) goto L182
            java.lang.String r6 = "dcache cdn file change, so retry"
            com.ss.android.socialbase.downloader.m.j.xt(r13, r6)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            java.lang.String r6 = "cdn file changed"
            r1.j(r2, r6)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
        L182:
            boolean r6 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            if (r6 != 0) goto L18d
            com.ss.android.socialbase.downloader.ae.cw r6 = r1.av     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            r6.r(r11)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
        L18d:
            r6 = r21
            boolean r9 = r1.j(r8, r6, r15)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            r10 = 1002(0x3ea, float:1.404E-42)
            if (r9 == 0) goto L1b4
            boolean r9 = r0 instanceof com.ss.android.socialbase.downloader.g.g     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            if (r9 == 0) goto L1ae
            boolean r9 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            if (r9 != 0) goto L1a8
            boolean r6 = r6.equals(r15)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            if (r6 == 0) goto L1a8
            r15 = r2
        L1a8:
            java.lang.String r6 = "eTag of server file changed"
            r1.j(r15, r6)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            goto L1b4
        L1ae:
            com.ss.android.socialbase.downloader.up.cw r0 = new com.ss.android.socialbase.downloader.up.cw     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            r0.<init>(r10, r8, r2)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            throw r0     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
        L1b4:
            boolean r6 = r1.oq     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            r9 = 1004(0x3ec, float:1.407E-42)
            if (r6 != 0) goto L1e1
            boolean r6 = r1.qv     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            if (r6 == 0) goto L1bf
            goto L1e1
        L1bf:
            r0 = 403(0x193, float:5.65E-43)
            if (r8 != r0) goto L1cd
            com.ss.android.socialbase.downloader.up.j r0 = new com.ss.android.socialbase.downloader.up.j     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            java.lang.String r2 = "response code error : 403"
            r3 = 1047(0x417, float:1.467E-42)
            r0.<init>(r3, r2)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            throw r0     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
        L1cd:
            com.ss.android.socialbase.downloader.up.cw r0 = new com.ss.android.socialbase.downloader.up.cw     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            java.lang.String r3 = "response code error : "
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            r2.append(r8)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            r0.<init>(r9, r8, r2)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            throw r0     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
        L1e1:
            boolean r6 = r1.qv     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            if (r6 == 0) goto L1f9
            if (r5 <= 0) goto L1f9
            boolean r5 = r0 instanceof com.ss.android.socialbase.downloader.g.g     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            if (r5 == 0) goto L1f1
            java.lang.String r5 = "http head request not support"
            r1.j(r2, r5)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            goto L1f9
        L1f1:
            com.ss.android.socialbase.downloader.up.j r0 = new com.ss.android.socialbase.downloader.up.j     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            java.lang.String r2 = "isResponseFromBegin but firstOffset > 0"
            r0.<init>(r9, r2)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            throw r0     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
        L1f9:
            long r5 = r7.tl()     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            boolean r11 = r0 instanceof com.ss.android.socialbase.downloader.g.g     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            if (r11 != 0) goto L214
            int r11 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r11 >= 0) goto L214
            com.ss.android.socialbase.downloader.ae.cw r11 = r1.av     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            boolean r11 = com.ss.android.socialbase.downloader.az.r.j(r11)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            if (r11 != 0) goto L20e
            goto L214
        L20e:
            com.ss.android.socialbase.downloader.up.j r0 = new com.ss.android.socialbase.downloader.up.j     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            r0.<init>(r9, r2)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            throw r0     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
        L214:
            com.ss.android.socialbase.downloader.ae.cw r11 = r1.av     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            java.lang.String r11 = r11.tl()     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            if (r11 == 0) goto L22b
            com.ss.android.socialbase.downloader.ae.cw r11 = r1.av     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            java.lang.String r11 = r11.oq()     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            java.lang.String r11 = com.ss.android.socialbase.downloader.az.m.j(r0, r11)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            goto L22c
        L22b:
            r11 = r2
        L22c:
            boolean r7 = r7.g()     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            r1.vl = r7     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            if (r7 != 0) goto L243
            int r12 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r12 != 0) goto L243
            boolean r12 = r0 instanceof com.ss.android.socialbase.downloader.g.g     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            if (r12 == 0) goto L23d
            goto L243
        L23d:
            com.ss.android.socialbase.downloader.up.j r0 = new com.ss.android.socialbase.downloader.up.j     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            r0.<init>(r9, r2)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            throw r0     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
        L243:
            r9 = 1
            if (r7 != 0) goto L2a4
            java.lang.String r7 = "Content-Range"
            java.lang.String r7 = com.ss.android.socialbase.downloader.az.m.xt(r0, r7)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            java.lang.String r14 = "firstConnection: contentRange = "
            r12.<init>(r14)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            r12.append(r7)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            com.ss.android.socialbase.downloader.m.j.cw(r13, r12)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            boolean r12 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            if (r12 != 0) goto L285
            com.ss.android.socialbase.downloader.jy.j r12 = r1.uf     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            java.lang.String r14 = "fix_get_total_bytes"
            boolean r12 = r12.xt(r14, r9)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            if (r12 == 0) goto L285
            long r5 = com.ss.android.socialbase.downloader.az.m.xt(r7)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            java.lang.String r12 = "firstConnection: 1 totalLength = "
            r7.<init>(r12)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            r7.append(r5)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            com.ss.android.socialbase.downloader.m.j.cw(r13, r7)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            r16 = r3
            goto L2a8
        L285:
            r16 = r3
            long r3 = r23 + r5
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            java.lang.String r12 = "firstConnection: 2 totalLength = "
            r7.<init>(r12)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            r7.append(r3)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            java.lang.String r12 = ", contentLength = "
            r7.append(r12)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            r7.append(r5)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            java.lang.String r5 = r7.toString()     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            com.ss.android.socialbase.downloader.m.j.up(r13, r5)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            r5 = r3
            goto L2a8
        L2a4:
            r16 = r3
            r5 = -1
        L2a8:
            com.ss.android.socialbase.downloader.ae.cw r3 = r1.av     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            java.lang.String r3 = r3.s()     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            if (r3 != 0) goto L2d8
            com.ss.android.socialbase.downloader.ae.cw r3 = r1.av     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            long r3 = r3.ka()     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            int r7 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r7 <= 0) goto L2d8
            com.ss.android.socialbase.downloader.ae.cw r3 = r1.av     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            long r3 = r3.ka()     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L2d8
            boolean r0 = r0 instanceof com.ss.android.socialbase.downloader.g.g     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            if (r0 == 0) goto L2d2
            java.lang.String r0 = "file totalLength changed"
            r1.j(r2, r0)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            goto L2d8
        L2d2:
            com.ss.android.socialbase.downloader.up.cw r0 = new com.ss.android.socialbase.downloader.up.cw     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            r0.<init>(r10, r8, r2)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            throw r0     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
        L2d8:
            boolean r0 = r1.f()     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            if (r0 == 0) goto L2df
        L2de:
            return
        L2df:
            com.ss.android.socialbase.downloader.ae.cw r0 = r1.av     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            long r2 = r0.wq()     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            int r0 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r0 <= 0) goto L32a
            com.ss.android.socialbase.downloader.ae.cw r0 = r1.av     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            int r0 = r0.ae()     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.j(r0)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            java.lang.String r2 = "force_check_file_length"
            int r0 = r0.xt(r2)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            if (r0 != r9) goto L32a
            com.ss.android.socialbase.downloader.ae.cw r0 = r1.av     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            long r2 = r0.wq()     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 != 0) goto L306
            goto L32a
        L306:
            com.ss.android.socialbase.downloader.up.j r0 = new com.ss.android.socialbase.downloader.up.j     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            java.lang.String r3 = "expectFileLength = "
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            com.ss.android.socialbase.downloader.ae.cw r3 = r1.av     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            long r3 = r3.wq()     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            r2.append(r3)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            java.lang.String r3 = " , totalLength = "
            r2.append(r3)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            r2.append(r5)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            r3 = 1070(0x42e, float:1.5E-42)
            r0.<init>(r3, r2)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            throw r0     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
        L32a:
            com.ss.android.socialbase.downloader.downloader.m r0 = r1.f     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            r0.j(r5, r15, r11)     // Catch: java.lang.Throwable -> L35 com.ss.android.socialbase.downloader.up.oq -> L38 com.ss.android.socialbase.downloader.up.j -> L3b
            return
        L330:
            java.lang.String r2 = "HandleFirstConnection"
            com.ss.android.socialbase.downloader.az.m.j(r0, r2)
            return
        L336:
            throw r0
        L337:
            throw r0
    }

    public void j(java.util.concurrent.Future r1) {
            r0 = this;
            r0.xt = r1
            return
    }

    @Override // com.ss.android.socialbase.downloader.ws.m
    public boolean j(com.ss.android.socialbase.downloader.up.j r5) {
            r4 = this;
            com.ss.android.socialbase.downloader.qv.qv r0 = r4.c
            r1 = 0
            if (r0 == 0) goto L1a
            boolean r0 = com.ss.android.socialbase.downloader.az.m.g(r5)
            if (r0 == 0) goto L1a
            java.util.concurrent.atomic.AtomicInteger r0 = r4.up
            int r0 = r0.get()
            com.ss.android.socialbase.downloader.ae.cw r2 = r4.av
            int r2 = r2.c()
            if (r0 >= r2) goto L1a
            return r1
        L1a:
            boolean r0 = com.ss.android.socialbase.downloader.az.m.xt(r5)
            r2 = 1
            if (r0 == 0) goto L31
            boolean r5 = r4.tl
            if (r5 == 0) goto L30
            boolean r5 = r4.r
            if (r5 != 0) goto L30
            com.ss.android.socialbase.downloader.ae.cw r5 = r4.av
            com.ss.android.socialbase.downloader.az.m.j(r5)
            r4.r = r2
        L30:
            return r2
        L31:
            java.util.concurrent.atomic.AtomicInteger r0 = r4.up
            if (r0 == 0) goto L3b
            int r0 = r0.get()
            if (r0 > 0) goto L63
        L3b:
            com.ss.android.socialbase.downloader.ae.cw r0 = r4.av
            boolean r0 = r0.to()
            if (r0 != 0) goto L63
            if (r5 == 0) goto L68
            int r0 = r5.j()
            r3 = 1011(0x3f3, float:1.417E-42)
            if (r0 == r3) goto L5b
            java.lang.Throwable r0 = r5.getCause()
            if (r0 == 0) goto L68
            java.lang.Throwable r0 = r5.getCause()
            boolean r0 = r0 instanceof javax.net.ssl.SSLHandshakeException
            if (r0 == 0) goto L68
        L5b:
            com.ss.android.socialbase.downloader.ae.cw r0 = r4.av
            boolean r0 = r0.ej()
            if (r0 == 0) goto L68
        L63:
            boolean r5 = r5 instanceof com.ss.android.socialbase.downloader.up.ae
            if (r5 != 0) goto L68
            return r2
        L68:
            return r1
    }

    public void m() {
            r2 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r2.wq = r0
            com.ss.android.socialbase.downloader.downloader.m r0 = r2.f
            r0.j()
            return
    }

    public boolean r() {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.jy
            boolean r0 = r0.get()
            return r0
    }

    @Override // java.lang.Runnable
    public void run() {
            r2 = this;
            com.ss.android.socialbase.downloader.ae.r r0 = r2.cw
            r1 = 3
            com.ss.android.socialbase.downloader.downloader.cw.j(r0, r1)
            com.ss.android.socialbase.downloader.g.xt r0 = com.ss.android.socialbase.downloader.g.xt.j()     // Catch: java.lang.Throwable -> L1d
            r0.xt()     // Catch: java.lang.Throwable -> L1d
            r2.qv()     // Catch: java.lang.Throwable -> L1d
            com.ss.android.socialbase.downloader.g.xt r0 = com.ss.android.socialbase.downloader.g.xt.j()
            r0.cw()
            com.ss.android.socialbase.downloader.ae.r r0 = r2.cw
            com.ss.android.socialbase.downloader.downloader.cw.xt(r0, r1)
            return
        L1d:
            r0 = move-exception
            com.ss.android.socialbase.downloader.g.xt r1 = com.ss.android.socialbase.downloader.g.xt.j()
            r1.cw()
            throw r0
    }

    public int up() {
            r1 = this;
            com.ss.android.socialbase.downloader.ae.cw r0 = r1.av
            if (r0 == 0) goto L9
            int r0 = r0.ae()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public void xt() {
            r2 = this;
            com.ss.android.socialbase.downloader.xt.oq r0 = com.ss.android.socialbase.downloader.xt.oq.cw
            r2.ws = r0
            com.ss.android.socialbase.downloader.qv.qv r1 = r2.c
            if (r1 == 0) goto Ld
            com.ss.android.socialbase.downloader.qv.qv r1 = r2.c
            r1.j()
        Ld:
            com.ss.android.socialbase.downloader.downloader.up r1 = r2.ae
            if (r1 == 0) goto L16
            com.ss.android.socialbase.downloader.downloader.up r1 = r2.ae
            r1.cw()
        L16:
            com.ss.android.socialbase.downloader.qv.qv r1 = r2.c
            if (r1 != 0) goto L26
            com.ss.android.socialbase.downloader.downloader.up r1 = r2.ae
            if (r1 != 0) goto L26
            r2.mi()
            r2.ws = r0
            r2.av()
        L26:
            r2.uf()
            return
    }

    @Override // com.ss.android.socialbase.downloader.ws.m
    public void xt(com.ss.android.socialbase.downloader.up.j r4) {
            r3 = this;
            java.lang.String r0 = com.ss.android.socialbase.downloader.ws.cw.j
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "onError:"
            r1.<init>(r2)
            java.lang.String r2 = r4.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.ss.android.socialbase.downloader.m.j.xt(r0, r1)
            com.ss.android.socialbase.downloader.xt.oq r0 = com.ss.android.socialbase.downloader.xt.oq.r
            r3.ws = r0
            r3.v = r4
            r3.uf()
            return
    }

    @Override // com.ss.android.socialbase.downloader.ws.m
    public boolean xt(long r6) throws com.ss.android.socialbase.downloader.up.j {
            r5 = this;
            long r0 = r5.rn
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L17
            com.ss.android.socialbase.downloader.ae.cw r0 = r5.av
            long r0 = r0.uq()
            long r2 = r5.rn
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L17
            r5.h()
        L17:
            com.ss.android.socialbase.downloader.downloader.m r0 = r5.f
            boolean r6 = r0.j(r6)
            return r6
    }
}
