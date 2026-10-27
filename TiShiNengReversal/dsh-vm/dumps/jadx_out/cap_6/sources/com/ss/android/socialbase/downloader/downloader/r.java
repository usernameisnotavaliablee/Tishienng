package com.ss.android.socialbase.downloader.downloader;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class r {
    private static volatile com.ss.android.socialbase.downloader.downloader.r j;
    private android.os.Handler cw;
    private volatile java.util.List<java.lang.Object> r;
    private volatile android.util.SparseArray<java.lang.Boolean> xt;


    static {
            return
    }

    public r() {
            r2 = this;
            r2.<init>()
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r2.xt = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.cw = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.r = r0
            return
    }

    public static com.ss.android.socialbase.downloader.downloader.r j() {
            com.ss.android.socialbase.downloader.downloader.r r0 = com.ss.android.socialbase.downloader.downloader.r.j
            if (r0 != 0) goto L13
            java.lang.Class<com.ss.android.socialbase.downloader.downloader.r> r0 = com.ss.android.socialbase.downloader.downloader.r.class
            monitor-enter(r0)
            com.ss.android.socialbase.downloader.downloader.r r1 = new com.ss.android.socialbase.downloader.downloader.r     // Catch: java.lang.Throwable -> L10
            r1.<init>()     // Catch: java.lang.Throwable -> L10
            com.ss.android.socialbase.downloader.downloader.r.j = r1     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            goto L13
        L10:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r1
        L13:
            com.ss.android.socialbase.downloader.downloader.r r0 = com.ss.android.socialbase.downloader.downloader.r.j
            return r0
    }

    private java.util.List<com.ss.android.socialbase.downloader.ae.cw> j(java.util.List<com.ss.android.socialbase.downloader.ae.cw> r4, java.util.List<com.ss.android.socialbase.downloader.ae.cw> r5, android.util.SparseArray<com.ss.android.socialbase.downloader.ae.cw> r6) {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r4 == 0) goto L2b
            java.util.Iterator r4 = r4.iterator()
        Lb:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r4.next()
            com.ss.android.socialbase.downloader.ae.cw r1 = (com.ss.android.socialbase.downloader.ae.cw) r1
            if (r1 == 0) goto Lb
            int r2 = r1.ae()
            java.lang.Object r2 = r6.get(r2)
            if (r2 != 0) goto Lb
            int r2 = r1.ae()
            r6.put(r2, r1)
            goto Lb
        L2b:
            if (r5 == 0) goto L51
            java.util.Iterator r4 = r5.iterator()
        L31:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L51
            java.lang.Object r5 = r4.next()
            com.ss.android.socialbase.downloader.ae.cw r5 = (com.ss.android.socialbase.downloader.ae.cw) r5
            if (r5 == 0) goto L31
            int r1 = r5.ae()
            java.lang.Object r1 = r6.get(r1)
            if (r1 != 0) goto L31
            int r1 = r5.ae()
            r6.put(r1, r5)
            goto L31
        L51:
            r4 = 0
        L52:
            int r5 = r6.size()
            if (r4 >= r5) goto L68
            int r5 = r6.keyAt(r4)
            java.lang.Object r5 = r6.get(r5)
            com.ss.android.socialbase.downloader.ae.cw r5 = (com.ss.android.socialbase.downloader.ae.cw) r5
            r0.add(r5)
            int r4 = r4 + 1
            goto L52
        L68:
            return r0
    }

    private com.ss.android.socialbase.downloader.downloader.az xt(com.ss.android.socialbase.downloader.ae.r r7) {
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            com.ss.android.socialbase.downloader.ae.cw r1 = r7.j()
            if (r1 != 0) goto Lb
            return r0
        Lb:
            boolean r0 = r1.xp()
            boolean r2 = com.ss.android.socialbase.downloader.az.m.cw()
            r3 = 1
            if (r2 != 0) goto L1c
            boolean r2 = com.ss.android.socialbase.downloader.az.m.j()
            if (r2 != 0) goto L1d
        L1c:
            r0 = 1
        L1d:
            int r2 = r1.ae()
            int r2 = r6.j(r2)
            r4 = 0
            if (r2 < 0) goto Lb6
            if (r2 == r0) goto Lb6
            if (r2 != r3) goto L79
            boolean r7 = com.ss.android.socialbase.downloader.az.m.j()     // Catch: java.lang.Throwable -> L53
            if (r7 == 0) goto Lb6
            com.ss.android.socialbase.downloader.downloader.az r7 = com.ss.android.socialbase.downloader.impls.vl.j(r3)     // Catch: java.lang.Throwable -> L53
            int r2 = r1.ae()     // Catch: java.lang.Throwable -> L53
            r7.j(r2)     // Catch: java.lang.Throwable -> L53
            com.ss.android.socialbase.downloader.downloader.az r7 = com.ss.android.socialbase.downloader.impls.vl.j(r3)     // Catch: java.lang.Throwable -> L53
            int r2 = r1.ae()     // Catch: java.lang.Throwable -> L53
            com.ss.android.socialbase.downloader.ae.cw r7 = r7.tl(r2)     // Catch: java.lang.Throwable -> L53
            if (r7 == 0) goto L55
            com.ss.android.socialbase.downloader.downloader.az r2 = com.ss.android.socialbase.downloader.impls.vl.j(r4)     // Catch: java.lang.Throwable -> L53
            r2.xt(r7)     // Catch: java.lang.Throwable -> L53
            goto L55
        L53:
            goto Lb6
        L55:
            int r7 = r7.kj()     // Catch: java.lang.Throwable -> L53
            if (r7 <= r3) goto Lb6
            com.ss.android.socialbase.downloader.downloader.az r7 = com.ss.android.socialbase.downloader.impls.vl.j(r3)     // Catch: java.lang.Throwable -> L53
            int r2 = r1.ae()     // Catch: java.lang.Throwable -> L53
            java.util.List r7 = r7.g(r2)     // Catch: java.lang.Throwable -> L53
            if (r7 == 0) goto Lb6
            java.util.List r7 = com.ss.android.socialbase.downloader.az.m.j(r7)     // Catch: java.lang.Throwable -> L53
            com.ss.android.socialbase.downloader.downloader.az r2 = com.ss.android.socialbase.downloader.impls.vl.j(r4)     // Catch: java.lang.Throwable -> L53
            int r5 = r1.ae()     // Catch: java.lang.Throwable -> L53
            r2.j(r5, r7)     // Catch: java.lang.Throwable -> L53
            goto Lb6
        L79:
            boolean r2 = com.ss.android.socialbase.downloader.az.m.j()     // Catch: java.lang.Throwable -> L53
            if (r2 == 0) goto La8
            com.ss.android.socialbase.downloader.downloader.az r7 = com.ss.android.socialbase.downloader.impls.vl.j(r4)     // Catch: java.lang.Throwable -> L53
            int r2 = r1.ae()     // Catch: java.lang.Throwable -> L53
            r7.j(r2)     // Catch: java.lang.Throwable -> L53
            com.ss.android.socialbase.downloader.downloader.az r7 = com.ss.android.socialbase.downloader.impls.vl.j(r4)     // Catch: java.lang.Throwable -> L53
            int r2 = r1.ae()     // Catch: java.lang.Throwable -> L53
            java.util.List r7 = r7.g(r2)     // Catch: java.lang.Throwable -> L53
            if (r7 == 0) goto Lb6
            java.util.List r7 = com.ss.android.socialbase.downloader.az.m.j(r7)     // Catch: java.lang.Throwable -> L53
            com.ss.android.socialbase.downloader.downloader.az r2 = com.ss.android.socialbase.downloader.impls.vl.j(r3)     // Catch: java.lang.Throwable -> L53
            int r5 = r1.ae()     // Catch: java.lang.Throwable -> L53
            r2.j(r5, r7)     // Catch: java.lang.Throwable -> L53
            goto Lb6
        La8:
            r7.j(r3)     // Catch: java.lang.Throwable -> L53
            com.ss.android.socialbase.downloader.downloader.az r7 = com.ss.android.socialbase.downloader.impls.vl.j(r3)     // Catch: java.lang.Throwable -> L53
            int r2 = r1.ae()     // Catch: java.lang.Throwable -> L53
            r7.j(r3, r2)     // Catch: java.lang.Throwable -> L53
        Lb6:
            int r7 = r1.ae()
            if (r0 != r3) goto Lbe
            r1 = 1
            goto Lbf
        Lbe:
            r1 = 0
        Lbf:
            r6.j(r7, r1)
            if (r0 != r3) goto Lc5
            goto Lc6
        Lc5:
            r3 = 0
        Lc6:
            com.ss.android.socialbase.downloader.downloader.az r7 = com.ss.android.socialbase.downloader.impls.vl.j(r3)
            return r7
    }

    public void ae(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.az r0 = r1.cw(r2)
            if (r0 != 0) goto L7
            return
        L7:
            r0.r(r2)
            return
    }

    public com.ss.android.socialbase.downloader.r.tj az(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.az r0 = r1.cw(r2)
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            com.ss.android.socialbase.downloader.r.tj r2 = r0.mi(r2)
            return r2
    }

    public com.ss.android.socialbase.downloader.downloader.az cw(int r2) {
            r1 = this;
            int r2 = r1.j(r2)
            r0 = 1
            if (r2 != r0) goto Le
            boolean r2 = com.ss.android.socialbase.downloader.az.m.cw()
            if (r2 != 0) goto Le
            goto Lf
        Le:
            r0 = 0
        Lf:
            com.ss.android.socialbase.downloader.downloader.az r2 = com.ss.android.socialbase.downloader.impls.vl.j(r0)
            return r2
    }

    public java.util.List<com.ss.android.socialbase.downloader.ae.cw> cw(java.lang.String r5) {
            r4 = this;
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1 = 0
            com.ss.android.socialbase.downloader.downloader.az r1 = com.ss.android.socialbase.downloader.impls.vl.j(r1)
            r2 = 0
            if (r1 == 0) goto L12
            java.util.List r1 = r1.r(r5)
            goto L13
        L12:
            r1 = r2
        L13:
            r3 = 1
            com.ss.android.socialbase.downloader.downloader.az r3 = com.ss.android.socialbase.downloader.impls.vl.j(r3)
            if (r3 == 0) goto L1e
            java.util.List r2 = r3.r(r5)
        L1e:
            java.util.List r5 = r4.j(r1, r2, r0)
            return r5
    }

    public void cw() {
            r1 = this;
            r0 = 0
            com.ss.android.socialbase.downloader.downloader.az r0 = com.ss.android.socialbase.downloader.impls.vl.j(r0)
            if (r0 == 0) goto La
            r0.j()
        La:
            r0 = 1
            com.ss.android.socialbase.downloader.downloader.az r0 = com.ss.android.socialbase.downloader.impls.vl.j(r0)
            if (r0 == 0) goto L14
            r0.j()
        L14:
            return
    }

    public void cw(int r4, boolean r5) {
            r3 = this;
            boolean r0 = com.ss.android.socialbase.downloader.az.m.j()
            r1 = 1
            if (r0 == 0) goto L36
            r0 = 8388608(0x800000, float:1.1754944E-38)
            boolean r0 = com.ss.android.socialbase.downloader.az.j.j(r0)
            r2 = 0
            if (r0 == 0) goto L23
            com.ss.android.socialbase.downloader.downloader.az r0 = com.ss.android.socialbase.downloader.impls.vl.j(r1)
            if (r0 == 0) goto L19
            r0.j(r4, r5)
        L19:
            com.ss.android.socialbase.downloader.downloader.az r0 = com.ss.android.socialbase.downloader.impls.vl.j(r2)
            if (r0 == 0) goto L35
            r0.j(r4, r5)
            return
        L23:
            com.ss.android.socialbase.downloader.downloader.az r0 = com.ss.android.socialbase.downloader.impls.vl.j(r2)
            if (r0 == 0) goto L2c
            r0.j(r4, r5)
        L2c:
            com.ss.android.socialbase.downloader.downloader.az r0 = com.ss.android.socialbase.downloader.impls.vl.j(r1)
            if (r0 == 0) goto L35
            r0.j(r4, r5)
        L35:
            return
        L36:
            com.ss.android.socialbase.downloader.downloader.az r0 = r3.cw(r4)
            if (r0 == 0) goto L3f
            r0.j(r4, r5)
        L3f:
            com.ss.android.socialbase.downloader.downloader.az r5 = com.ss.android.socialbase.downloader.impls.vl.j(r1)
            r0 = 2
            r5.j(r0, r4)
            return
    }

    public boolean g(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.az r0 = r1.cw(r2)
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            boolean r2 = r0.ae(r2)
            return r2
    }

    public int j(int r3) {
            r2 = this;
            boolean r0 = com.ss.android.socialbase.downloader.downloader.cw.hl()
            if (r0 != 0) goto L8
            r3 = -1
            return r3
        L8:
            boolean r0 = com.ss.android.socialbase.downloader.az.m.cw()
            if (r0 != 0) goto L22
            r0 = 1
            com.ss.android.socialbase.downloader.downloader.az r1 = com.ss.android.socialbase.downloader.impls.vl.j(r0)
            boolean r1 = r1.ae()
            if (r1 == 0) goto L22
            com.ss.android.socialbase.downloader.downloader.az r0 = com.ss.android.socialbase.downloader.impls.vl.j(r0)
            int r3 = r0.jy(r3)
            return r3
        L22:
            int r3 = r2.xt(r3)
            return r3
    }

    public int j(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            int r1 = com.ss.android.socialbase.downloader.downloader.cw.j(r1, r2)
            return r1
    }

    public java.util.List<com.ss.android.socialbase.downloader.ae.cw> j(java.lang.String r3) {
            r2 = this;
            r0 = 0
            com.ss.android.socialbase.downloader.downloader.az r0 = com.ss.android.socialbase.downloader.impls.vl.j(r0)
            java.util.List r0 = r0.j(r3)
            r1 = 1
            com.ss.android.socialbase.downloader.downloader.az r1 = com.ss.android.socialbase.downloader.impls.vl.j(r1)
            java.util.List r3 = r1.j(r3)
            if (r0 != 0) goto L18
            if (r3 != 0) goto L18
            r3 = 0
            return r3
        L18:
            if (r0 == 0) goto L25
            if (r3 == 0) goto L25
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r1.addAll(r3)
            return r1
        L25:
            if (r0 == 0) goto L28
            return r0
        L28:
            return r3
    }

    public void j(int r7, com.ss.android.socialbase.downloader.r.a r8, com.ss.android.socialbase.downloader.xt.tl r9, boolean r10) {
            r6 = this;
            com.ss.android.socialbase.downloader.downloader.az r0 = r6.cw(r7)
            if (r0 != 0) goto L7
            return
        L7:
            if (r8 != 0) goto L10
            r1 = 0
            r2 = 0
            r1 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            goto L19
        L10:
            int r1 = r8.hashCode()
            r2 = r1
            r3 = r8
            r4 = r9
            r5 = r10
            r1 = r7
        L19:
            r0.xt(r1, r2, r3, r4, r5)
            return
    }

    public void j(int r8, com.ss.android.socialbase.downloader.r.a r9, com.ss.android.socialbase.downloader.xt.tl r10, boolean r11, boolean r12) {
            r7 = this;
            com.ss.android.socialbase.downloader.downloader.az r0 = r7.cw(r8)
            if (r0 != 0) goto L7
            return
        L7:
            int r2 = r9.hashCode()
            r1 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r0.j(r1, r2, r3, r4, r5, r6)
            return
    }

    public void j(int r3, boolean r4) {
            r2 = this;
            r2.xt(r3, r4)
            boolean r0 = com.ss.android.socialbase.downloader.downloader.cw.hl()
            if (r0 == 0) goto L21
            boolean r0 = com.ss.android.socialbase.downloader.az.m.cw()
            if (r0 != 0) goto L21
            r0 = 1
            com.ss.android.socialbase.downloader.downloader.az r1 = com.ss.android.socialbase.downloader.impls.vl.j(r0)
            boolean r1 = r1.ae()
            if (r1 == 0) goto L21
            com.ss.android.socialbase.downloader.downloader.az r0 = com.ss.android.socialbase.downloader.impls.vl.j(r0)
            r0.cw(r3, r4)
        L21:
            boolean r4 = com.ss.android.socialbase.downloader.downloader.cw.xt()
            if (r4 != 0) goto L54
            boolean r4 = com.ss.android.socialbase.downloader.az.m.cw()
            if (r4 != 0) goto L54
            boolean r4 = com.ss.android.socialbase.downloader.az.m.j()
            if (r4 != 0) goto L54
            android.content.Intent r4 = new android.content.Intent     // Catch: java.lang.Throwable -> L50
            android.content.Context r0 = com.ss.android.socialbase.downloader.downloader.cw.nd()     // Catch: java.lang.Throwable -> L50
            java.lang.Class<com.ss.android.socialbase.downloader.impls.DownloadHandleService> r1 = com.ss.android.socialbase.downloader.impls.DownloadHandleService.class
            r4.<init>(r0, r1)     // Catch: java.lang.Throwable -> L50
            java.lang.String r0 = "com.ss.android.downloader.action.PROCESS_NOTIFY"
            r4.setAction(r0)     // Catch: java.lang.Throwable -> L50
            java.lang.String r0 = "extra_download_id"
            r4.putExtra(r0, r3)     // Catch: java.lang.Throwable -> L50
            android.content.Context r3 = com.ss.android.socialbase.downloader.downloader.cw.nd()     // Catch: java.lang.Throwable -> L50
            r3.startService(r4)     // Catch: java.lang.Throwable -> L50
            return
        L50:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)
        L54:
            return
    }

    public void j(com.ss.android.socialbase.downloader.ae.r r6) {
            r5 = this;
            com.ss.android.socialbase.downloader.downloader.az r0 = r5.xt(r6)
            if (r0 != 0) goto L2d
            if (r6 == 0) goto L2c
            com.ss.android.socialbase.downloader.r.l r0 = r6.up()
            com.ss.android.socialbase.downloader.ae.cw r1 = r6.j()
            com.ss.android.socialbase.downloader.up.j r2 = new com.ss.android.socialbase.downloader.up.j
            r3 = 1003(0x3eb, float:1.406E-42)
            java.lang.String r4 = "tryDownload but getDownloadHandler failed"
            r2.<init>(r3, r4)
            com.ss.android.socialbase.downloader.ae.cw r3 = r6.j()
            if (r3 == 0) goto L28
            com.ss.android.socialbase.downloader.ae.cw r6 = r6.j()
            int r6 = r6.i()
            goto L29
        L28:
            r6 = 0
        L29:
            com.ss.android.socialbase.downloader.tl.j.j(r0, r1, r2, r6)
        L2c:
            return
        L2d:
            boolean r1 = r6.xt()
            if (r1 == 0) goto L40
            android.os.Handler r1 = r5.cw
            com.ss.android.socialbase.downloader.downloader.r$1 r2 = new com.ss.android.socialbase.downloader.downloader.r$1
            r2.<init>(r5, r0, r6)
            r3 = 500(0x1f4, double:2.47E-321)
            r1.postDelayed(r2, r3)
            return
        L40:
            r0.j(r6)
            return
    }

    public void j(com.ss.android.socialbase.downloader.r.vl r1) {
            r0 = this;
            com.ss.android.socialbase.downloader.downloader.cw.j(r1)
            return
    }

    public void j(java.util.List<java.lang.String> r2) {
            r1 = this;
            r0 = 0
            com.ss.android.socialbase.downloader.downloader.az r0 = com.ss.android.socialbase.downloader.impls.vl.j(r0)
            if (r0 == 0) goto La
            r0.j(r2)
        La:
            r0 = 1
            com.ss.android.socialbase.downloader.downloader.az r0 = com.ss.android.socialbase.downloader.impls.vl.j(r0)
            if (r0 == 0) goto L14
            r0.j(r2)
        L14:
            return
    }

    public boolean j(com.ss.android.socialbase.downloader.ae.cw r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            int r1 = r3.ae()
            com.ss.android.socialbase.downloader.downloader.az r1 = r2.cw(r1)
            if (r1 != 0) goto Lf
            return r0
        Lf:
            boolean r3 = r1.j(r3)
            return r3
    }

    public boolean jy(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.az r0 = r1.cw(r2)
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            boolean r2 = r0.vl(r2)
            return r2
    }

    public void m(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.az r0 = r1.cw(r2)
            if (r0 != 0) goto L7
            return
        L7:
            r0.cw(r2)
            return
    }

    public com.ss.android.socialbase.downloader.ae.cw oq(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.az r0 = r1.cw(r2)
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            com.ss.android.socialbase.downloader.ae.cw r2 = r0.tl(r2)
            return r2
    }

    public com.ss.android.socialbase.downloader.r.h qv(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.az r0 = r1.cw(r2)
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            com.ss.android.socialbase.downloader.r.h r2 = r0.i(r2)
            return r2
    }

    public java.util.List<com.ss.android.socialbase.downloader.ae.cw> r(java.lang.String r5) {
            r4 = this;
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1 = 0
            com.ss.android.socialbase.downloader.downloader.az r1 = com.ss.android.socialbase.downloader.impls.vl.j(r1)
            r2 = 0
            if (r1 == 0) goto L12
            java.util.List r1 = r1.up(r5)
            goto L13
        L12:
            r1 = r2
        L13:
            r3 = 1
            com.ss.android.socialbase.downloader.downloader.az r3 = com.ss.android.socialbase.downloader.impls.vl.j(r3)
            if (r3 == 0) goto L1e
            java.util.List r2 = r3.up(r5)
        L1e:
            java.util.List r5 = r4.j(r1, r2, r0)
            return r5
    }

    public void r(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.az r0 = r1.cw(r2)
            if (r0 != 0) goto L7
            return
        L7:
            r0.j(r2)
            return
    }

    public void r(int r2, boolean r3) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.az r0 = r1.cw(r2)
            if (r0 != 0) goto L7
            return
        L7:
            r0.xt(r2, r3)
            return
    }

    public int tl(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.az r0 = r1.cw(r2)
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            int r2 = r0.m(r2)
            return r2
    }

    public boolean up(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.az r0 = r1.cw(r2)
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            boolean r2 = r0.xt(r2)
            return r2
    }

    public com.ss.android.socialbase.downloader.r.wq vl(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.az r0 = r1.cw(r2)
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            com.ss.android.socialbase.downloader.r.wq r2 = r0.w(r2)
            return r2
    }

    public void ws(int r2) {
            r1 = this;
            if (r2 != 0) goto L3
            goto Ld
        L3:
            r0 = 1
            r1.xt(r2, r0)
            com.ss.android.socialbase.downloader.downloader.az r2 = com.ss.android.socialbase.downloader.impls.vl.j(r0)
            if (r2 != 0) goto Le
        Ld:
            return
        Le:
            r2.startService()
            return
    }

    public synchronized int xt(int r2) {
            r1 = this;
            monitor-enter(r1)
            android.util.SparseArray<java.lang.Boolean> r0 = r1.xt     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L1f
            if (r0 != 0) goto Lc
            monitor-exit(r1)
            r2 = -1
            return r2
        Lc:
            android.util.SparseArray<java.lang.Boolean> r0 = r1.xt     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L1f
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L1f
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r1)
            if (r2 == 0) goto L1d
            r2 = 1
            return r2
        L1d:
            r2 = 0
            return r2
        L1f:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1f
            throw r2
    }

    public com.ss.android.socialbase.downloader.ae.cw xt(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            int r1 = r0.j(r1, r2)
            com.ss.android.socialbase.downloader.downloader.az r2 = r0.cw(r1)
            if (r2 != 0) goto Lc
            r1 = 0
            return r1
        Lc:
            com.ss.android.socialbase.downloader.ae.cw r1 = r2.tl(r1)
            return r1
    }

    public java.util.List<com.ss.android.socialbase.downloader.ae.cw> xt(java.lang.String r5) {
            r4 = this;
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1 = 0
            com.ss.android.socialbase.downloader.downloader.az r1 = com.ss.android.socialbase.downloader.impls.vl.j(r1)
            r2 = 0
            if (r1 == 0) goto L12
            java.util.List r1 = r1.cw(r5)
            goto L13
        L12:
            r1 = r2
        L13:
            r3 = 1
            com.ss.android.socialbase.downloader.downloader.az r3 = com.ss.android.socialbase.downloader.impls.vl.j(r3)
            if (r3 == 0) goto L1e
            java.util.List r2 = r3.cw(r5)
        L1e:
            java.util.List r5 = r4.j(r1, r2, r0)
            return r5
    }

    public void xt() {
            r3 = this;
            java.util.List<java.lang.Object> r0 = r3.r
            monitor-enter(r0)
            java.util.List<java.lang.Object> r1 = r3.r     // Catch: java.lang.Throwable -> L13
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L13
        L9:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L13
            if (r2 == 0) goto L15
            r1.next()     // Catch: java.lang.Throwable -> L13
            goto L9
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
    }

    public void xt(int r7, com.ss.android.socialbase.downloader.r.a r8, com.ss.android.socialbase.downloader.xt.tl r9, boolean r10) {
            r6 = this;
            com.ss.android.socialbase.downloader.downloader.az r0 = r6.cw(r7)
            if (r0 != 0) goto L7
            return
        L7:
            int r2 = r8.hashCode()
            r1 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.j(r1, r2, r3, r4, r5)
            return
    }

    public synchronized void xt(int r2, boolean r3) {
            r1 = this;
            monitor-enter(r1)
            android.util.SparseArray<java.lang.Boolean> r0 = r1.xt     // Catch: java.lang.Throwable -> L8
            if (r3 == 0) goto La
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L8
            goto Lc
        L8:
            r2 = move-exception
            goto L11
        La:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L8
        Lc:
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L11:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r2
    }

    public void xt(java.util.List<java.lang.String> r2) {
            r1 = this;
            r0 = 0
            com.ss.android.socialbase.downloader.downloader.az r0 = com.ss.android.socialbase.downloader.impls.vl.j(r0)
            if (r0 == 0) goto La
            r0.xt(r2)
        La:
            r0 = 1
            com.ss.android.socialbase.downloader.downloader.az r0 = com.ss.android.socialbase.downloader.impls.vl.j(r0)
            if (r0 == 0) goto L14
            r0.xt(r2)
        L14:
            return
    }
}
