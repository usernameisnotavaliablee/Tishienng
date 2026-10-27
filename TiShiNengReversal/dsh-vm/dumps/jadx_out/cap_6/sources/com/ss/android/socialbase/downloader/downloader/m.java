package com.ss.android.socialbase.downloader.downloader;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class m {
    private static final java.lang.String j = "m";
    private android.util.SparseArray<com.ss.android.socialbase.downloader.r.a> ae;
    private com.ss.android.socialbase.downloader.r.az av;
    private long az;
    private com.ss.android.socialbase.downloader.ae.cw cw;
    private android.util.SparseArray<com.ss.android.socialbase.downloader.r.a> g;
    private com.ss.android.socialbase.downloader.r.l i;
    private boolean jy;
    private com.ss.android.socialbase.downloader.ae.r m;
    private boolean oq;
    private volatile long qv;
    private final com.ss.android.socialbase.downloader.downloader.vl r;
    private android.util.SparseArray<com.ss.android.socialbase.downloader.r.a> tl;
    private final android.os.Handler up;
    private final java.util.concurrent.atomic.AtomicLong vl;
    private int ws;
    private final boolean xt;



    static {
            return
    }

    public m(com.ss.android.socialbase.downloader.ae.r r4, android.os.Handler r5) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.oq = r0
            r1 = 0
            r3.qv = r1
            java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
            r1.<init>()
            r3.vl = r1
            r3.jy = r0
            r3.m = r4
            r3.oq()
            r3.up = r5
            com.ss.android.socialbase.downloader.downloader.vl r5 = com.ss.android.socialbase.downloader.downloader.cw.x()
            r3.r = r5
            com.ss.android.socialbase.downloader.ae.cw r4 = r4.j()
            if (r4 == 0) goto L37
            int r4 = r4.ae()
            com.ss.android.socialbase.downloader.jy.j r4 = com.ss.android.socialbase.downloader.jy.j.j(r4)
            java.lang.String r5 = "fix_start_with_file_exist_update_error"
            boolean r4 = r4.j(r5)
            r3.xt = r4
            return
        L37:
            r3.xt = r0
            return
    }

    private com.ss.android.socialbase.downloader.up.j cw(com.ss.android.socialbase.downloader.up.j r4) {
            r3 = this;
            com.ss.android.socialbase.downloader.ae.cw r0 = r3.cw
            int r0 = r0.ae()
            com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.j(r0)
            java.lang.String r1 = "download_failed_check_net"
            r2 = 1
            int r0 = r0.j(r1, r2)
            if (r0 != r2) goto L3c
            boolean r0 = com.ss.android.socialbase.downloader.az.m.g(r4)
            if (r0 == 0) goto L3c
            android.content.Context r0 = com.ss.android.socialbase.downloader.downloader.cw.nd()
            if (r0 == 0) goto L3c
            boolean r0 = com.ss.android.socialbase.downloader.az.m.cw(r0)
            if (r0 != 0) goto L3c
            com.ss.android.socialbase.downloader.up.j r0 = new com.ss.android.socialbase.downloader.up.j
            com.ss.android.socialbase.downloader.ae.cw r1 = r3.cw
            boolean r1 = r1.x()
            if (r1 == 0) goto L32
            r1 = 1013(0x3f5, float:1.42E-42)
            goto L34
        L32:
            r1 = 1049(0x419, float:1.47E-42)
        L34:
            java.lang.String r4 = r4.xt()
            r0.<init>(r1, r4)
            return r0
        L3c:
            return r4
    }

    static /* synthetic */ void cw(com.ss.android.socialbase.downloader.downloader.m r0) {
            r0.vl()
            return
    }

    static /* synthetic */ java.lang.String g() {
            java.lang.String r0 = com.ss.android.socialbase.downloader.downloader.m.j
            return r0
    }

    static /* synthetic */ com.ss.android.socialbase.downloader.ae.cw j(com.ss.android.socialbase.downloader.downloader.m r0) {
            com.ss.android.socialbase.downloader.ae.cw r0 = r0.cw
            return r0
    }

    private void j(int r2, com.ss.android.socialbase.downloader.up.j r3) {
            r1 = this;
            r0 = 1
            r1.j(r2, r3, r0)
            return
    }

    private void j(int r5, com.ss.android.socialbase.downloader.up.j r6, boolean r7) {
            r4 = this;
            com.ss.android.socialbase.downloader.ae.cw r0 = r4.cw
            int r0 = r0.i()
            r1 = 4
            r2 = -3
            if (r0 != r2) goto Le
            if (r5 != r1) goto Le
            goto Le8
        Le:
            r4.oq()
            if (r5 == r1) goto L2a
            boolean r1 = com.ss.android.socialbase.downloader.xt.m.up(r5)
            if (r1 == 0) goto L2a
            com.ss.android.socialbase.downloader.ae.cw r1 = r4.cw
            r3 = 0
            r1.ae(r3)
            boolean r1 = com.ss.android.socialbase.downloader.xt.m.r(r5)
            if (r1 == 0) goto L2a
            com.ss.android.socialbase.downloader.ae.cw r1 = r4.cw
            r1.pz()
        L2a:
            com.ss.android.socialbase.downloader.ae.cw r1 = r4.cw
            boolean r1 = r1.uc()
            if (r1 != 0) goto L37
            com.ss.android.socialbase.downloader.ae.r r1 = r4.m
            com.ss.android.socialbase.downloader.tl.j.j(r1, r6, r5)
        L37:
            r1 = 6
            if (r5 != r1) goto L41
            com.ss.android.socialbase.downloader.ae.cw r1 = r4.cw
            r3 = 2
            r1.r(r3)
            goto L4f
        L41:
            r1 = -6
            if (r5 != r1) goto L4a
            com.ss.android.socialbase.downloader.ae.cw r1 = r4.cw
            r1.r(r2)
            goto L4f
        L4a:
            com.ss.android.socialbase.downloader.ae.cw r1 = r4.cw
            r1.r(r5)
        L4f:
            if (r0 == r2) goto L54
            r1 = -1
            if (r0 != r1) goto L87
        L54:
            com.ss.android.socialbase.downloader.ae.cw r0 = r4.cw
            com.ss.android.socialbase.downloader.xt.g r0 = r0.rs()
            com.ss.android.socialbase.downloader.xt.g r1 = com.ss.android.socialbase.downloader.xt.g.cw
            if (r0 != r1) goto L65
            com.ss.android.socialbase.downloader.ae.cw r0 = r4.cw
            com.ss.android.socialbase.downloader.xt.g r1 = com.ss.android.socialbase.downloader.xt.g.r
            r0.j(r1)
        L65:
            com.ss.android.socialbase.downloader.ae.cw r0 = r4.cw
            com.ss.android.socialbase.downloader.xt.j r0 = r0.jl()
            com.ss.android.socialbase.downloader.xt.j r1 = com.ss.android.socialbase.downloader.xt.j.r
            if (r0 != r1) goto L76
            com.ss.android.socialbase.downloader.ae.cw r0 = r4.cw
            com.ss.android.socialbase.downloader.xt.j r1 = com.ss.android.socialbase.downloader.xt.j.up
            r0.j(r1)
        L76:
            com.ss.android.socialbase.downloader.ae.cw r0 = r4.cw
            com.ss.android.socialbase.downloader.xt.xt r0 = r0.ik()
            com.ss.android.socialbase.downloader.xt.xt r1 = com.ss.android.socialbase.downloader.xt.xt.cw
            if (r0 != r1) goto L87
            com.ss.android.socialbase.downloader.ae.cw r0 = r4.cw
            com.ss.android.socialbase.downloader.xt.xt r1 = com.ss.android.socialbase.downloader.xt.xt.r
            r0.j(r1)
        L87:
            android.util.SparseArray<com.ss.android.socialbase.downloader.r.a> r0 = r4.tl
            r1 = 1
            com.ss.android.socialbase.downloader.ae.cw r2 = r4.cw
            com.ss.android.socialbase.downloader.az.cw.j(r5, r0, r1, r2, r6)
            r0 = -4
            if (r5 != r0) goto L93
            goto Le8
        L93:
            if (r7 == 0) goto Ld3
            android.os.Handler r7 = r4.up
            if (r7 == 0) goto Ld3
            android.util.SparseArray<com.ss.android.socialbase.downloader.r.a> r7 = r4.ae
            if (r7 == 0) goto La3
            int r7 = r7.size()
            if (r7 > 0) goto Lbd
        La3:
            android.util.SparseArray<com.ss.android.socialbase.downloader.r.a> r7 = r4.g
            if (r7 == 0) goto Ld3
            int r7 = r7.size()
            if (r7 <= 0) goto Ld3
            com.ss.android.socialbase.downloader.ae.cw r7 = r4.cw
            boolean r7 = r7.oy()
            if (r7 != 0) goto Lbd
            com.ss.android.socialbase.downloader.ae.cw r7 = r4.cw
            boolean r7 = r7.qe()
            if (r7 == 0) goto Ld3
        Lbd:
            android.os.Handler r7 = r4.up
            com.ss.android.socialbase.downloader.ae.cw r0 = r4.cw
            int r0 = r0.ae()
            com.ss.android.socialbase.downloader.ae.r r1 = r4.m
            int r1 = r1.vl()
            android.os.Message r5 = r7.obtainMessage(r5, r0, r1, r6)
            r5.sendToTarget()
            return
        Ld3:
            com.ss.android.socialbase.downloader.impls.j r6 = com.ss.android.socialbase.downloader.downloader.cw.p()
            if (r6 == 0) goto Le8
            com.ss.android.socialbase.downloader.ae.cw r7 = r4.cw
            int r7 = r7.ae()
            com.ss.android.socialbase.downloader.ae.r r0 = r4.m
            int r0 = r0.vl()
            r6.j(r7, r0, r5)
        Le8:
            return
    }

    static /* synthetic */ void j(com.ss.android.socialbase.downloader.downloader.m r0, int r1, com.ss.android.socialbase.downloader.up.j r2) {
            r0.j(r1, r2)
            return
    }

    private boolean j(long r5, boolean r7) {
            r4 = this;
            com.ss.android.socialbase.downloader.ae.cw r5 = r4.cw
            long r5 = r5.uq()
            com.ss.android.socialbase.downloader.ae.cw r0 = r4.cw
            long r0 = r0.ka()
            r2 = 0
            int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r3 != 0) goto L28
            com.ss.android.socialbase.downloader.downloader.vl r5 = r4.r     // Catch: java.lang.Exception -> L23
            com.ss.android.socialbase.downloader.ae.cw r6 = r4.cw     // Catch: java.lang.Exception -> L23
            int r6 = r6.ae()     // Catch: java.lang.Exception -> L23
            com.ss.android.socialbase.downloader.ae.cw r7 = r4.cw     // Catch: java.lang.Exception -> L23
            long r0 = r7.uq()     // Catch: java.lang.Exception -> L23
            r5.j(r6, r0)     // Catch: java.lang.Exception -> L23
            goto L27
        L23:
            r5 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r5)
        L27:
            return r2
        L28:
            boolean r5 = r4.oq
            r6 = 4
            if (r5 == 0) goto L34
            r4.oq = r2
            com.ss.android.socialbase.downloader.ae.cw r5 = r4.cw
            r5.r(r6)
        L34:
            com.ss.android.socialbase.downloader.ae.cw r5 = r4.cw
            boolean r5 = r5.sf()
            if (r5 == 0) goto L3f
            if (r7 == 0) goto L3f
            r2 = 1
        L3f:
            r5 = 0
            r4.j(r6, r5, r2)
            return r7
    }

    private void jy() throws com.ss.android.socialbase.downloader.up.j {
            r4 = this;
            com.ss.android.socialbase.downloader.ae.r r0 = r4.m
            java.util.List r0 = r0.tj()
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L45
            com.ss.android.socialbase.downloader.ae.cw r1 = r4.cw
            r2 = 11
            r3 = 0
            r4.j(r2, r3)
            com.ss.android.socialbase.downloader.downloader.vl r2 = r4.r
            r2.j(r1)
            java.util.Iterator r0 = r0.iterator()
        L1d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L45
            java.lang.Object r2 = r0.next()
            com.ss.android.socialbase.downloader.r.ws r2 = (com.ss.android.socialbase.downloader.r.ws) r2
            boolean r3 = r2.xt(r1)     // Catch: java.lang.Throwable -> L38 com.ss.android.socialbase.downloader.up.j -> L3a
            if (r3 == 0) goto L1d
            r2.j(r1)     // Catch: java.lang.Throwable -> L38 com.ss.android.socialbase.downloader.up.j -> L3a
            com.ss.android.socialbase.downloader.downloader.vl r2 = r4.r     // Catch: java.lang.Throwable -> L38 com.ss.android.socialbase.downloader.up.j -> L3a
            r2.j(r1)     // Catch: java.lang.Throwable -> L38 com.ss.android.socialbase.downloader.up.j -> L3a
            goto L1d
        L38:
            r0 = move-exception
            goto L3c
        L3a:
            r0 = move-exception
            goto L44
        L3c:
            com.ss.android.socialbase.downloader.up.j r1 = new com.ss.android.socialbase.downloader.up.j
            r2 = 1071(0x42f, float:1.501E-42)
            r1.<init>(r2, r0)
            throw r1
        L44:
            throw r0
        L45:
            return
    }

    private void oq() {
            r2 = this;
            com.ss.android.socialbase.downloader.ae.r r0 = r2.m
            if (r0 == 0) goto L38
            com.ss.android.socialbase.downloader.ae.cw r0 = r0.j()
            r2.cw = r0
            com.ss.android.socialbase.downloader.ae.r r0 = r2.m
            com.ss.android.socialbase.downloader.xt.tl r1 = com.ss.android.socialbase.downloader.xt.tl.j
            android.util.SparseArray r0 = r0.j(r1)
            r2.ae = r0
            com.ss.android.socialbase.downloader.ae.r r0 = r2.m
            com.ss.android.socialbase.downloader.xt.tl r1 = com.ss.android.socialbase.downloader.xt.tl.cw
            android.util.SparseArray r0 = r0.j(r1)
            r2.g = r0
            com.ss.android.socialbase.downloader.ae.r r0 = r2.m
            com.ss.android.socialbase.downloader.xt.tl r1 = com.ss.android.socialbase.downloader.xt.tl.xt
            android.util.SparseArray r0 = r0.j(r1)
            r2.tl = r0
            com.ss.android.socialbase.downloader.ae.r r0 = r2.m
            com.ss.android.socialbase.downloader.r.az r0 = r0.r()
            r2.av = r0
            com.ss.android.socialbase.downloader.ae.r r0 = r2.m
            com.ss.android.socialbase.downloader.r.l r0 = r0.up()
            r2.i = r0
        L38:
            return
    }

    private void qv() {
            r2 = this;
            java.util.concurrent.ExecutorService r0 = com.ss.android.socialbase.downloader.downloader.cw.qv()
            if (r0 == 0) goto Le
            com.ss.android.socialbase.downloader.downloader.m$1 r1 = new com.ss.android.socialbase.downloader.downloader.m$1
            r1.<init>(r2)
            r0.execute(r1)
        Le:
            return
    }

    private void vl() {
            r4 = this;
            java.lang.String r0 = com.ss.android.socialbase.downloader.downloader.m.j     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = "saveFileAsTargetName onSuccess"
            com.ss.android.socialbase.downloader.m.j.xt(r0, r1)     // Catch: java.lang.Throwable -> L42
            r4.jy()     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L44
            com.ss.android.socialbase.downloader.ae.cw r0 = r4.cw     // Catch: java.lang.Throwable -> L42
            r1 = 0
            r0.oq(r1)     // Catch: java.lang.Throwable -> L42
            com.ss.android.socialbase.downloader.ae.cw r0 = r4.cw     // Catch: java.lang.Throwable -> L42
            r0.tl(r1)     // Catch: java.lang.Throwable -> L42
            r0 = -3
            r1 = 0
            r4.j(r0, r1)     // Catch: java.lang.Throwable -> L42
            com.ss.android.socialbase.downloader.downloader.vl r0 = r4.r     // Catch: java.lang.Throwable -> L42
            com.ss.android.socialbase.downloader.ae.cw r1 = r4.cw     // Catch: java.lang.Throwable -> L42
            int r1 = r1.ae()     // Catch: java.lang.Throwable -> L42
            com.ss.android.socialbase.downloader.ae.cw r2 = r4.cw     // Catch: java.lang.Throwable -> L42
            long r2 = r2.ka()     // Catch: java.lang.Throwable -> L42
            r0.cw(r1, r2)     // Catch: java.lang.Throwable -> L42
            com.ss.android.socialbase.downloader.downloader.vl r0 = r4.r     // Catch: java.lang.Throwable -> L42
            com.ss.android.socialbase.downloader.ae.cw r1 = r4.cw     // Catch: java.lang.Throwable -> L42
            int r1 = r1.ae()     // Catch: java.lang.Throwable -> L42
            r0.r(r1)     // Catch: java.lang.Throwable -> L42
            com.ss.android.socialbase.downloader.downloader.vl r0 = r4.r     // Catch: java.lang.Throwable -> L42
            com.ss.android.socialbase.downloader.ae.cw r1 = r4.cw     // Catch: java.lang.Throwable -> L42
            int r1 = r1.ae()     // Catch: java.lang.Throwable -> L42
            r0.jy(r1)     // Catch: java.lang.Throwable -> L42
            return
        L42:
            r0 = move-exception
            goto L49
        L44:
            r0 = move-exception
            r4.j(r0)     // Catch: java.lang.Throwable -> L42
            return
        L49:
            com.ss.android.socialbase.downloader.up.j r1 = new com.ss.android.socialbase.downloader.up.j
            java.lang.String r2 = "onCompleted"
            java.lang.String r0 = com.ss.android.socialbase.downloader.az.m.xt(r0, r2)
            r2 = 1008(0x3f0, float:1.413E-42)
            r1.<init>(r2, r0)
            r4.j(r1)
            return
    }

    static /* synthetic */ com.ss.android.socialbase.downloader.downloader.vl xt(com.ss.android.socialbase.downloader.downloader.m r0) {
            com.ss.android.socialbase.downloader.downloader.vl r0 = r0.r
            return r0
    }

    private void xt(com.ss.android.socialbase.downloader.up.j r5) {
            r4 = this;
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            android.util.Log.getStackTraceString(r0)
            if (r5 == 0) goto L29
            java.lang.Throwable r0 = r5.getCause()
            if (r0 == 0) goto L29
            java.lang.Throwable r0 = r5.getCause()
            boolean r0 = r0 instanceof android.database.sqlite.SQLiteFullException
            if (r0 == 0) goto L29
            com.ss.android.socialbase.downloader.downloader.vl r0 = r4.r     // Catch: android.database.sqlite.SQLiteException -> L24
            com.ss.android.socialbase.downloader.ae.cw r1 = r4.cw     // Catch: android.database.sqlite.SQLiteException -> L24
            int r1 = r1.ae()     // Catch: android.database.sqlite.SQLiteException -> L24
            r0.m(r1)     // Catch: android.database.sqlite.SQLiteException -> L24
            goto L4b
        L24:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
            goto L4b
        L29:
            com.ss.android.socialbase.downloader.downloader.vl r0 = r4.r     // Catch: android.database.sqlite.SQLiteException -> L3b
            com.ss.android.socialbase.downloader.ae.cw r1 = r4.cw     // Catch: android.database.sqlite.SQLiteException -> L3b
            int r1 = r1.ae()     // Catch: android.database.sqlite.SQLiteException -> L3b
            com.ss.android.socialbase.downloader.ae.cw r2 = r4.cw     // Catch: android.database.sqlite.SQLiteException -> L3b
            long r2 = r2.uq()     // Catch: android.database.sqlite.SQLiteException -> L3b
            r0.xt(r1, r2)     // Catch: android.database.sqlite.SQLiteException -> L3b
            goto L4b
        L3b:
            com.ss.android.socialbase.downloader.downloader.vl r0 = r4.r     // Catch: android.database.sqlite.SQLiteException -> L47
            com.ss.android.socialbase.downloader.ae.cw r1 = r4.cw     // Catch: android.database.sqlite.SQLiteException -> L47
            int r1 = r1.ae()     // Catch: android.database.sqlite.SQLiteException -> L47
            r0.m(r1)     // Catch: android.database.sqlite.SQLiteException -> L47
            goto L4b
        L47:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
        L4b:
            com.ss.android.socialbase.downloader.up.j r5 = r4.cw(r5)
            com.ss.android.socialbase.downloader.ae.cw r0 = r4.cw
            r0.j(r5)
            boolean r0 = r5 instanceof com.ss.android.socialbase.downloader.up.m
            if (r0 == 0) goto L5a
            r0 = -2
            goto L5b
        L5a:
            r0 = -1
        L5b:
            r4.j(r0, r5)
            com.ss.android.socialbase.downloader.ae.cw r5 = r4.cw
            int r5 = r5.ae()
            com.ss.android.socialbase.downloader.jy.j r5 = com.ss.android.socialbase.downloader.jy.j.j(r5)
            java.lang.String r0 = "retry_schedule"
            r1 = 0
            int r5 = r5.j(r0, r1)
            if (r5 <= 0) goto L7a
            com.ss.android.socialbase.downloader.impls.w r5 = com.ss.android.socialbase.downloader.impls.w.j()
            com.ss.android.socialbase.downloader.ae.cw r0 = r4.cw
            r5.j(r0)
        L7a:
            return
    }

    private void xt(com.ss.android.socialbase.downloader.up.j r3, boolean r4) {
            r2 = this;
            com.ss.android.socialbase.downloader.downloader.vl r0 = r2.r
            com.ss.android.socialbase.downloader.ae.cw r1 = r2.cw
            int r1 = r1.ae()
            r0.tl(r1)
            if (r4 == 0) goto Lf
            r4 = 7
            goto L10
        Lf:
            r4 = 5
        L10:
            r2.j(r4, r3)
            return
    }

    private boolean xt(long r9) {
            r8 = this;
            boolean r0 = r8.jy
            r1 = 1
            if (r0 != 0) goto L8
            r8.jy = r1
            return r1
        L8:
            long r2 = r8.qv
            long r2 = r9 - r2
            java.util.concurrent.atomic.AtomicLong r0 = r8.vl
            long r4 = r0.get()
            long r6 = r8.az
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L21
            int r0 = r8.ws
            long r4 = (long) r0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L20
            goto L21
        L20:
            r1 = 0
        L21:
            if (r1 == 0) goto L2c
            r8.qv = r9
            java.util.concurrent.atomic.AtomicLong r9 = r8.vl
            r2 = 0
            r9.set(r2)
        L2c:
            return r1
    }

    public void ae() throws com.ss.android.socialbase.downloader.up.j {
            r5 = this;
            boolean r0 = r5.xt
            r1 = 0
            r2 = -3
            r3 = 1
            java.lang.String r4 = "onCompleteForFileExist"
            if (r0 == 0) goto L48
            r5.jy()
            java.lang.String r0 = com.ss.android.socialbase.downloader.downloader.m.j
            com.ss.android.socialbase.downloader.m.j.xt(r0, r4)
            com.ss.android.socialbase.downloader.ae.cw r0 = r5.cw
            r0.tl(r3)
            r5.j(r2, r1)
            com.ss.android.socialbase.downloader.downloader.vl r0 = r5.r
            com.ss.android.socialbase.downloader.ae.cw r1 = r5.cw
            int r1 = r1.ae()
            com.ss.android.socialbase.downloader.ae.cw r2 = r5.cw
            long r2 = r2.ka()
            r0.cw(r1, r2)
            com.ss.android.socialbase.downloader.downloader.vl r0 = r5.r
            com.ss.android.socialbase.downloader.ae.cw r1 = r5.cw
            int r1 = r1.ae()
            r0.r(r1)
            com.ss.android.socialbase.downloader.downloader.vl r0 = r5.r
            com.ss.android.socialbase.downloader.ae.cw r1 = r5.cw
            r0.j(r1)
            com.ss.android.socialbase.downloader.downloader.vl r0 = r5.r
            com.ss.android.socialbase.downloader.ae.cw r1 = r5.cw
            int r1 = r1.ae()
            r0.jy(r1)
            return
        L48:
            r5.jy()
            java.lang.String r0 = com.ss.android.socialbase.downloader.downloader.m.j
            com.ss.android.socialbase.downloader.m.j.xt(r0, r4)
            com.ss.android.socialbase.downloader.ae.cw r0 = r5.cw
            r0.tl(r3)
            r5.j(r2, r1)
            com.ss.android.socialbase.downloader.downloader.vl r0 = r5.r
            com.ss.android.socialbase.downloader.ae.cw r1 = r5.cw
            int r1 = r1.ae()
            com.ss.android.socialbase.downloader.ae.cw r2 = r5.cw
            long r2 = r2.ka()
            r0.cw(r1, r2)
            com.ss.android.socialbase.downloader.downloader.vl r0 = r5.r
            com.ss.android.socialbase.downloader.ae.cw r1 = r5.cw
            int r1 = r1.ae()
            r0.r(r1)
            com.ss.android.socialbase.downloader.downloader.vl r0 = r5.r
            com.ss.android.socialbase.downloader.ae.cw r1 = r5.cw
            int r1 = r1.ae()
            r0.jy(r1)
            return
    }

    public void cw() {
            r2 = this;
            r0 = -4
            r1 = 0
            r2.j(r0, r1)
            return
    }

    public void j() {
            r2 = this;
            com.ss.android.socialbase.downloader.ae.cw r0 = r2.cw
            boolean r0 = r0.ig()
            if (r0 == 0) goto L9
            return
        L9:
            com.ss.android.socialbase.downloader.ae.cw r0 = r2.cw
            r1 = 1
            r0.r(r1)
            r2.qv()
            return
    }

    public void j(long r8, java.lang.String r10, java.lang.String r11) {
            r7 = this;
            com.ss.android.socialbase.downloader.ae.cw r0 = r7.cw
            r0.ae(r8)
            com.ss.android.socialbase.downloader.ae.cw r0 = r7.cw
            r0.up(r10)
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 != 0) goto L21
            com.ss.android.socialbase.downloader.ae.cw r0 = r7.cw
            java.lang.String r0 = r0.tl()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L21
            com.ss.android.socialbase.downloader.ae.cw r0 = r7.cw
            r0.m(r11)
        L21:
            com.ss.android.socialbase.downloader.downloader.vl r1 = r7.r     // Catch: java.lang.Exception -> L33
            com.ss.android.socialbase.downloader.ae.cw r0 = r7.cw     // Catch: java.lang.Exception -> L33
            int r2 = r0.ae()     // Catch: java.lang.Exception -> L33
            r3 = r8
            r5 = r10
            r6 = r11
            r1.j(r2, r3, r5, r6)     // Catch: java.lang.Exception -> L30
            goto L39
        L30:
            r0 = move-exception
        L31:
            r8 = r0
            goto L36
        L33:
            r0 = move-exception
            r3 = r8
            goto L31
        L36:
            com.bytedance.sdk.component.utils.vl.j(r8)
        L39:
            r8 = 3
            r9 = 0
            r7.j(r8, r9)
            com.ss.android.socialbase.downloader.ae.cw r8 = r7.cw
            long r8 = r8.tl(r3)
            r7.az = r8
            com.ss.android.socialbase.downloader.ae.cw r8 = r7.cw
            int r8 = r8.by()
            r7.ws = r8
            r8 = 1
            r7.oq = r8
            com.ss.android.socialbase.downloader.impls.w r8 = com.ss.android.socialbase.downloader.impls.w.j()
            r8.up()
            return
    }

    public void j(com.ss.android.socialbase.downloader.ae.xt r3, com.ss.android.socialbase.downloader.up.j r4, boolean r5) {
            r2 = this;
            com.ss.android.socialbase.downloader.ae.cw r3 = r2.cw
            r0 = 0
            r3.g(r0)
            java.util.concurrent.atomic.AtomicLong r3 = r2.vl
            r0 = 0
            r3.set(r0)
            com.ss.android.socialbase.downloader.downloader.vl r3 = r2.r
            com.ss.android.socialbase.downloader.ae.cw r0 = r2.cw
            int r0 = r0.ae()
            r3.tl(r0)
            if (r5 == 0) goto L1d
            r3 = 10
            goto L1f
        L1d:
            r3 = 9
        L1f:
            r5 = 1
            r2.j(r3, r4, r5)
            return
    }

    public void j(com.ss.android.socialbase.downloader.up.j r3) {
            r2 = this;
            com.ss.android.socialbase.downloader.ae.cw r0 = r2.cw
            r1 = 0
            r0.g(r1)
            r2.xt(r3)
            return
    }

    public void j(com.ss.android.socialbase.downloader.up.j r4, boolean r5) {
            r3 = this;
            com.ss.android.socialbase.downloader.ae.cw r0 = r3.cw
            r1 = 0
            r0.g(r1)
            java.util.concurrent.atomic.AtomicLong r0 = r3.vl
            r1 = 0
            r0.set(r1)
            r3.xt(r4, r5)
            return
    }

    public void j(java.lang.String r6) throws com.ss.android.socialbase.downloader.up.j {
            r5 = this;
            java.lang.String r0 = com.ss.android.socialbase.downloader.downloader.m.j
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "onCompleteForFileExist existTargetFileName is "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r2 = " but curName is "
            r1.append(r2)
            com.ss.android.socialbase.downloader.ae.cw r2 = r5.cw
            java.lang.String r2 = r2.tl()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.ss.android.socialbase.downloader.m.j.xt(r0, r1)
            boolean r0 = r5.xt
            r1 = 0
            r2 = -3
            r3 = 1
            if (r0 == 0) goto L40
            com.ss.android.socialbase.downloader.ae.cw r0 = r5.cw
            com.ss.android.socialbase.downloader.az.m.j(r0, r6)
            r5.jy()
            com.ss.android.socialbase.downloader.ae.cw r6 = r5.cw
            r6.tl(r3)
            r5.j(r2, r1)
            com.ss.android.socialbase.downloader.downloader.vl r6 = r5.r
            com.ss.android.socialbase.downloader.ae.cw r0 = r5.cw
            r6.j(r0)
            return
        L40:
            com.ss.android.socialbase.downloader.downloader.vl r0 = r5.r
            com.ss.android.socialbase.downloader.ae.cw r4 = r5.cw
            r0.j(r4)
            com.ss.android.socialbase.downloader.ae.cw r0 = r5.cw
            com.ss.android.socialbase.downloader.az.m.j(r0, r6)
            com.ss.android.socialbase.downloader.ae.cw r6 = r5.cw
            r6.tl(r3)
            r5.jy()
            r5.j(r2, r1)
            return
    }

    public boolean j(long r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r1.vl
            r0.addAndGet(r2)
            com.ss.android.socialbase.downloader.ae.cw r0 = r1.cw
            r0.m(r2)
            long r2 = android.os.SystemClock.uptimeMillis()
            boolean r0 = r1.xt(r2)
            boolean r2 = r1.j(r2, r0)
            return r2
    }

    public void m() {
            r5 = this;
            com.ss.android.socialbase.downloader.ae.cw r0 = r5.cw
            r1 = 0
            r0.g(r1)
            com.ss.android.socialbase.downloader.ae.cw r0 = r5.cw
            boolean r0 = r0.nt()
            if (r0 != 0) goto L48
            com.ss.android.socialbase.downloader.ae.cw r0 = r5.cw
            long r0 = r0.uq()
            com.ss.android.socialbase.downloader.ae.cw r2 = r5.cw
            long r2 = r2.ka()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L48
            java.lang.String r0 = com.ss.android.socialbase.downloader.downloader.m.j
            com.ss.android.socialbase.downloader.ae.cw r1 = r5.cw
            java.lang.String r1 = r1.r()
            com.ss.android.socialbase.downloader.m.j.xt(r0, r1)
            com.ss.android.socialbase.downloader.up.ae r0 = new com.ss.android.socialbase.downloader.up.ae
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "current bytes is not equals to total bytes, bytes changed with process : "
            r1.<init>(r2)
            com.ss.android.socialbase.downloader.ae.cw r2 = r5.cw
            com.ss.android.socialbase.downloader.xt.xt r2 = r2.ik()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 1027(0x403, float:1.439E-42)
            r0.<init>(r2, r1)
            r5.j(r0)
            return
        L48:
            com.ss.android.socialbase.downloader.ae.cw r0 = r5.cw
            long r0 = r0.uq()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L7e
            java.lang.String r0 = com.ss.android.socialbase.downloader.downloader.m.j
            com.ss.android.socialbase.downloader.ae.cw r1 = r5.cw
            java.lang.String r1 = r1.r()
            com.ss.android.socialbase.downloader.m.j.xt(r0, r1)
            com.ss.android.socialbase.downloader.up.ae r0 = new com.ss.android.socialbase.downloader.up.ae
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "curBytes is 0, bytes changed with process : "
            r1.<init>(r2)
            com.ss.android.socialbase.downloader.ae.cw r2 = r5.cw
            com.ss.android.socialbase.downloader.xt.xt r2 = r2.ik()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 1026(0x402, float:1.438E-42)
            r0.<init>(r2, r1)
            r5.j(r0)
            return
        L7e:
            com.ss.android.socialbase.downloader.ae.cw r0 = r5.cw
            boolean r0 = r0.nt()
            if (r0 != 0) goto Lba
            com.ss.android.socialbase.downloader.ae.cw r0 = r5.cw
            long r0 = r0.ka()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto Lba
            java.lang.String r0 = com.ss.android.socialbase.downloader.downloader.m.j
            com.ss.android.socialbase.downloader.ae.cw r1 = r5.cw
            java.lang.String r1 = r1.r()
            com.ss.android.socialbase.downloader.m.j.xt(r0, r1)
            com.ss.android.socialbase.downloader.up.ae r0 = new com.ss.android.socialbase.downloader.up.ae
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "TotalBytes is 0, bytes changed with process : "
            r1.<init>(r2)
            com.ss.android.socialbase.downloader.ae.cw r2 = r5.cw
            com.ss.android.socialbase.downloader.xt.xt r2 = r2.ik()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 1044(0x414, float:1.463E-42)
            r0.<init>(r2, r1)
            r5.j(r0)
            return
        Lba:
            java.lang.String r0 = com.ss.android.socialbase.downloader.downloader.m.j
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.ss.android.socialbase.downloader.ae.cw r2 = r5.cw
            java.lang.String r2 = r2.tl()
            r1.append(r2)
            java.lang.String r2 = " onCompleted start save file as target name"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.ss.android.socialbase.downloader.m.j.xt(r0, r1)
            com.ss.android.socialbase.downloader.r.l r0 = r5.i
            com.ss.android.socialbase.downloader.ae.r r1 = r5.m
            if (r1 == 0) goto Le0
            com.ss.android.socialbase.downloader.r.l r0 = r1.up()
        Le0:
            com.ss.android.socialbase.downloader.ae.cw r1 = r5.cw
            com.ss.android.socialbase.downloader.downloader.m$2 r2 = new com.ss.android.socialbase.downloader.downloader.m$2
            r2.<init>(r5)
            com.ss.android.socialbase.downloader.az.m.j(r1, r0, r2)
            return
    }

    public void r() {
            r5 = this;
            com.ss.android.socialbase.downloader.ae.cw r0 = r5.cw
            r1 = -2
            r0.r(r1)
            com.ss.android.socialbase.downloader.downloader.vl r0 = r5.r     // Catch: android.database.sqlite.SQLiteException -> L18
            com.ss.android.socialbase.downloader.ae.cw r2 = r5.cw     // Catch: android.database.sqlite.SQLiteException -> L18
            int r2 = r2.ae()     // Catch: android.database.sqlite.SQLiteException -> L18
            com.ss.android.socialbase.downloader.ae.cw r3 = r5.cw     // Catch: android.database.sqlite.SQLiteException -> L18
            long r3 = r3.uq()     // Catch: android.database.sqlite.SQLiteException -> L18
            r0.r(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L18
            goto L1c
        L18:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
        L1c:
            r0 = 0
            r5.j(r1, r0)
            return
    }

    public void tl() {
            r4 = this;
            com.ss.android.socialbase.downloader.ae.cw r0 = r4.cw
            r1 = 8
            r0.r(r1)
            com.ss.android.socialbase.downloader.ae.cw r0 = r4.cw
            com.ss.android.socialbase.downloader.xt.j r2 = com.ss.android.socialbase.downloader.xt.j.xt
            r0.j(r2)
            com.ss.android.socialbase.downloader.impls.j r0 = com.ss.android.socialbase.downloader.downloader.cw.p()
            if (r0 == 0) goto L23
            com.ss.android.socialbase.downloader.ae.cw r2 = r4.cw
            int r2 = r2.ae()
            com.ss.android.socialbase.downloader.ae.r r3 = r4.m
            int r3 = r3.vl()
            r0.j(r2, r3, r1)
        L23:
            return
    }

    public void up() {
            r3 = this;
            com.ss.android.socialbase.downloader.ae.cw r0 = r3.cw
            r1 = -7
            r0.r(r1)
            com.ss.android.socialbase.downloader.downloader.vl r0 = r3.r     // Catch: android.database.sqlite.SQLiteException -> L12
            com.ss.android.socialbase.downloader.ae.cw r2 = r3.cw     // Catch: android.database.sqlite.SQLiteException -> L12
            int r2 = r2.ae()     // Catch: android.database.sqlite.SQLiteException -> L12
            r0.oq(r2)     // Catch: android.database.sqlite.SQLiteException -> L12
            goto L16
        L12:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
        L16:
            r0 = 0
            r3.j(r1, r0)
            return
    }

    public void xt() {
            r2 = this;
            com.ss.android.socialbase.downloader.ae.cw r0 = r2.cw
            boolean r0 = r0.ig()
            if (r0 == 0) goto Le
            com.ss.android.socialbase.downloader.ae.cw r0 = r2.cw
            r0.yb()
            return
        Le:
            com.ss.android.socialbase.downloader.downloader.vl r0 = r2.r
            com.ss.android.socialbase.downloader.ae.cw r1 = r2.cw
            int r1 = r1.ae()
            r0.ae(r1)
            com.ss.android.socialbase.downloader.ae.cw r0 = r2.cw
            boolean r0 = r0.fz()
            r1 = 0
            if (r0 == 0) goto L26
            r0 = 6
            r2.j(r0, r1)
        L26:
            r0 = 2
            r2.j(r0, r1)
            return
    }
}
