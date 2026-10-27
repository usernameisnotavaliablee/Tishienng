package com.ss.android.socialbase.downloader.impls;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class r implements com.ss.android.socialbase.downloader.downloader.vl {
    private volatile boolean cw;
    private final com.ss.android.socialbase.downloader.impls.qv j;
    private com.ss.android.socialbase.downloader.ws.tl m;
    private volatile boolean r;
    private com.ss.android.socialbase.downloader.ws.tl.j up;
    private com.ss.android.socialbase.downloader.downloader.tj xt;




    public r() {
            r3 = this;
            r3.<init>()
            com.ss.android.socialbase.downloader.impls.r$1 r0 = new com.ss.android.socialbase.downloader.impls.r$1
            r0.<init>(r3)
            r3.up = r0
            r0 = 0
            r3.m = r0
            com.ss.android.socialbase.downloader.impls.qv r0 = new com.ss.android.socialbase.downloader.impls.qv
            r0.<init>()
            r3.j = r0
            com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.cw()
            java.lang.String r1 = "fix_sigbus_downloader_db"
            boolean r0 = r0.j(r1)
            if (r0 == 0) goto L45
            boolean r0 = com.ss.android.socialbase.downloader.az.m.j()
            if (r0 != 0) goto L3d
            boolean r0 = com.ss.android.socialbase.downloader.downloader.cw.hl()
            if (r0 != 0) goto L2d
            goto L3d
        L2d:
            com.ss.android.socialbase.downloader.downloader.cw$j r0 = com.ss.android.socialbase.downloader.downloader.cw.b()
            com.ss.android.socialbase.downloader.impls.r$2 r1 = new com.ss.android.socialbase.downloader.impls.r$2
            r1.<init>(r3)
            com.ss.android.socialbase.downloader.downloader.tj r0 = r0.j(r1)
            r3.xt = r0
            goto L4c
        L3d:
            com.ss.android.socialbase.downloader.cw.up r0 = new com.ss.android.socialbase.downloader.cw.up
            r0.<init>()
            r3.xt = r0
            goto L4c
        L45:
            com.ss.android.socialbase.downloader.cw.up r0 = new com.ss.android.socialbase.downloader.cw.up
            r0.<init>()
            r3.xt = r0
        L4c:
            r0 = 0
            r3.cw = r0
            com.ss.android.socialbase.downloader.ws.tl r0 = new com.ss.android.socialbase.downloader.ws.tl
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            com.ss.android.socialbase.downloader.ws.tl$j r2 = r3.up
            r0.<init>(r1, r2)
            r3.m = r0
            r3.ae()
            return
    }

    private void cw(com.ss.android.socialbase.downloader.ae.cw r2) {
            r1 = this;
            r0 = 1
            r1.j(r2, r0)
            return
    }

    static /* synthetic */ com.ss.android.socialbase.downloader.downloader.tj j(com.ss.android.socialbase.downloader.impls.r r0, com.ss.android.socialbase.downloader.downloader.tj r1) {
            r0.xt = r1
            return r1
    }

    static /* synthetic */ com.ss.android.socialbase.downloader.impls.qv j(com.ss.android.socialbase.downloader.impls.r r0) {
            com.ss.android.socialbase.downloader.impls.qv r0 = r0.j
            return r0
    }

    private void j(com.ss.android.socialbase.downloader.ae.cw r2, boolean r3) {
            r1 = this;
            if (r2 != 0) goto L3
            goto L1b
        L3:
            boolean r0 = com.ss.android.socialbase.downloader.az.m.xt()
            if (r0 == 0) goto L1c
            if (r3 == 0) goto L1b
            r3 = 1
            com.ss.android.socialbase.downloader.downloader.az r3 = com.ss.android.socialbase.downloader.impls.vl.j(r3)
            if (r3 == 0) goto L16
            r3.cw(r2)
            return
        L16:
            com.ss.android.socialbase.downloader.downloader.tj r3 = r1.xt
            r3.j(r2)
        L1b:
            return
        L1c:
            com.ss.android.socialbase.downloader.downloader.tj r3 = r1.xt
            r3.j(r2)
            return
    }

    private void oq() {
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            r1.cw = r0     // Catch: java.lang.Throwable -> L9
            r1.notifyAll()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    static /* synthetic */ void xt(com.ss.android.socialbase.downloader.impls.r r0) {
            r0.oq()
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public com.ss.android.socialbase.downloader.ae.cw ae(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.impls.qv r0 = r1.j
            com.ss.android.socialbase.downloader.ae.cw r2 = r0.ae(r2)
            r1.cw(r2)
            return r2
    }

    public void ae() {
            r8 = this;
            com.ss.android.socialbase.downloader.xt.r r0 = com.ss.android.socialbase.downloader.xt.r.xt
            com.ss.android.socialbase.downloader.downloader.cw.j(r0)
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            com.ss.android.socialbase.downloader.impls.qv r2 = r8.j
            monitor-enter(r2)
            com.ss.android.socialbase.downloader.impls.qv r3 = r8.j     // Catch: java.lang.Throwable -> L32
            android.util.SparseArray r3 = r3.j()     // Catch: java.lang.Throwable -> L32
            r4 = 0
            r5 = 0
        L1a:
            int r6 = r3.size()     // Catch: java.lang.Throwable -> L32
            if (r5 >= r6) goto L37
            int r6 = r3.keyAt(r5)     // Catch: java.lang.Throwable -> L32
            if (r6 == 0) goto L34
            java.lang.Object r7 = r3.get(r6)     // Catch: java.lang.Throwable -> L32
            com.ss.android.socialbase.downloader.ae.cw r7 = (com.ss.android.socialbase.downloader.ae.cw) r7     // Catch: java.lang.Throwable -> L32
            if (r7 == 0) goto L34
            r0.put(r6, r7)     // Catch: java.lang.Throwable -> L32
            goto L34
        L32:
            r0 = move-exception
            goto L68
        L34:
            int r5 = r5 + 1
            goto L1a
        L37:
            com.ss.android.socialbase.downloader.impls.qv r3 = r8.j     // Catch: java.lang.Throwable -> L32
            android.util.SparseArray r3 = r3.m()     // Catch: java.lang.Throwable -> L32
        L3d:
            int r5 = r3.size()     // Catch: java.lang.Throwable -> L32
            if (r4 >= r5) goto L5c
            int r5 = r3.keyAt(r4)     // Catch: java.lang.Throwable -> L32
            if (r5 == 0) goto L59
            java.lang.Object r6 = r3.get(r5)     // Catch: java.lang.Throwable -> L32
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Throwable -> L32
            if (r6 == 0) goto L59
            java.util.concurrent.CopyOnWriteArrayList r7 = new java.util.concurrent.CopyOnWriteArrayList     // Catch: java.lang.Throwable -> L32
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L32
            r1.put(r5, r7)     // Catch: java.lang.Throwable -> L32
        L59:
            int r4 = r4 + 1
            goto L3d
        L5c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L32
            com.ss.android.socialbase.downloader.downloader.tj r2 = r8.xt
            com.ss.android.socialbase.downloader.impls.r$3 r3 = new com.ss.android.socialbase.downloader.impls.r$3
            r3.<init>(r8, r0, r1)
            r2.j(r0, r1, r3)
            return
        L68:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L32
            throw r0
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public com.ss.android.socialbase.downloader.ae.cw cw(int r2, long r3) {
            r1 = this;
            com.ss.android.socialbase.downloader.impls.qv r0 = r1.j
            com.ss.android.socialbase.downloader.ae.cw r3 = r0.cw(r2, r3)
            r4 = 0
            r1.xt(r2, r4)
            return r3
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public java.util.List<com.ss.android.socialbase.downloader.ae.xt> cw(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.impls.qv r0 = r1.j
            java.util.List r2 = r0.cw(r2)
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public java.util.List<com.ss.android.socialbase.downloader.ae.cw> cw(java.lang.String r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.impls.qv r0 = r1.j
            java.util.List r2 = r0.cw(r2)
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public void cw() {
            r1 = this;
            com.ss.android.socialbase.downloader.impls.qv r0 = r1.j     // Catch: android.database.sqlite.SQLiteException -> L6
            r0.cw()     // Catch: android.database.sqlite.SQLiteException -> L6
            goto La
        L6:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
        La:
            boolean r0 = com.ss.android.socialbase.downloader.az.m.xt()
            if (r0 == 0) goto L21
            r0 = 1
            com.ss.android.socialbase.downloader.downloader.az r0 = com.ss.android.socialbase.downloader.impls.vl.j(r0)
            if (r0 == 0) goto L1b
            r0.m()
            return
        L1b:
            com.ss.android.socialbase.downloader.downloader.tj r0 = r1.xt
            r0.cw()
            return
        L21:
            com.ss.android.socialbase.downloader.downloader.tj r0 = r1.xt
            r0.cw()
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public com.ss.android.socialbase.downloader.ae.cw g(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.impls.qv r0 = r1.j
            com.ss.android.socialbase.downloader.ae.cw r2 = r0.g(r2)
            r1.cw(r2)
            return r2
    }

    public void g() {
            r12 = this;
            boolean r0 = r12.cw
            if (r0 != 0) goto L6
            goto Lde
        L6:
            boolean r0 = r12.r
            if (r0 == 0) goto L12
            java.lang.String r0 = "DefaultDownloadCache"
            java.lang.String r1 = "resumeUnCompleteTask: has resumed, return!!!"
            com.ss.android.socialbase.downloader.m.j.xt(r0, r1)
            return
        L12:
            r0 = 1
            r12.r = r0
            boolean r1 = com.ss.android.socialbase.downloader.az.m.j()
            if (r1 != 0) goto L1d
            goto Lde
        L1d:
            com.ss.android.socialbase.downloader.downloader.ws r1 = com.ss.android.socialbase.downloader.downloader.cw.v()
            r2 = 0
            if (r1 == 0) goto L38
            java.util.List r3 = r1.j()
            if (r3 == 0) goto L36
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L36
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            goto L3a
        L36:
            r4 = r2
            goto L3a
        L38:
            r3 = r2
            r4 = r3
        L3a:
            android.util.SparseArray r5 = new android.util.SparseArray
            r5.<init>()
            monitor-enter(r12)
            com.ss.android.socialbase.downloader.impls.qv r6 = r12.j     // Catch: java.lang.Throwable -> L60
            android.util.SparseArray r6 = r6.j()     // Catch: java.lang.Throwable -> L60
            r7 = 0
            r8 = 0
        L48:
            int r9 = r6.size()     // Catch: java.lang.Throwable -> L60
            if (r8 >= r9) goto L66
            int r9 = r6.keyAt(r8)     // Catch: java.lang.Throwable -> L60
            if (r9 == 0) goto L63
            java.lang.Object r10 = r6.get(r9)     // Catch: java.lang.Throwable -> L60
            com.ss.android.socialbase.downloader.ae.cw r10 = (com.ss.android.socialbase.downloader.ae.cw) r10     // Catch: java.lang.Throwable -> L60
            if (r10 == 0) goto L63
            r5.put(r9, r10)     // Catch: java.lang.Throwable -> L60
            goto L63
        L60:
            r0 = move-exception
            goto Ldf
        L63:
            int r8 = r8 + 1
            goto L48
        L66:
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L60
            int r6 = r5.size()
            if (r6 != 0) goto L6f
            goto Lde
        L6f:
            r6 = 0
        L70:
            int r8 = r5.size()
            if (r6 >= r8) goto Ld1
            int r8 = r5.keyAt(r6)
            if (r8 == 0) goto Lce
            java.lang.Object r8 = r5.get(r8)
            com.ss.android.socialbase.downloader.ae.cw r8 = (com.ss.android.socialbase.downloader.ae.cw) r8
            if (r8 == 0) goto Lce
            int r9 = r8.v()
            int r10 = r8.cb()
            if (r10 <= 0) goto L9a
            r11 = 11
            if (r10 > r11) goto L9a
            com.ss.android.socialbase.downloader.tl.xt r10 = com.ss.android.socialbase.downloader.downloader.cw.m()
            r11 = -5
            com.ss.android.socialbase.downloader.tl.j.j(r10, r8, r2, r11)
        L9a:
            if (r3 == 0) goto Lce
            if (r4 == 0) goto Lce
            java.lang.String r10 = r8.xw()
            if (r10 == 0) goto Lce
            java.lang.String r10 = r8.xw()
            boolean r10 = r3.contains(r10)
            if (r10 == 0) goto Lce
            int r10 = r8.ae()
            com.ss.android.socialbase.downloader.jy.j r10 = com.ss.android.socialbase.downloader.jy.j.j(r10)
            java.lang.String r11 = "enable_notification_ui"
            int r10 = r10.xt(r11)
            r11 = 2
            if (r10 >= r11) goto Lc8
            r10 = -2
            if (r9 != r10) goto Lc8
            boolean r9 = r8.qb()
            if (r9 == 0) goto Lce
        Lc8:
            r8.up(r7)
            r4.add(r8)
        Lce:
            int r6 = r6 + 1
            goto L70
        Ld1:
            if (r1 == 0) goto Lde
            if (r4 == 0) goto Lde
            boolean r2 = r4.isEmpty()
            if (r2 != 0) goto Lde
            r1.j(r4, r0)
        Lde:
            return
        Ldf:
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L60
            throw r0
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public com.ss.android.socialbase.downloader.ae.cw j(int r2, int r3) {
            r1 = this;
            com.ss.android.socialbase.downloader.impls.qv r0 = r1.j
            com.ss.android.socialbase.downloader.ae.cw r2 = r0.j(r2, r3)
            r1.cw(r2)
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public com.ss.android.socialbase.downloader.ae.cw j(int r2, long r3) {
            r1 = this;
            com.ss.android.socialbase.downloader.impls.qv r0 = r1.j
            com.ss.android.socialbase.downloader.ae.cw r2 = r0.j(r2, r3)
            r3 = 0
            r1.j(r2, r3)
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public com.ss.android.socialbase.downloader.ae.cw j(int r7, long r8, java.lang.String r10, java.lang.String r11) {
            r6 = this;
            com.ss.android.socialbase.downloader.impls.qv r0 = r6.j
            r1 = r7
            r2 = r8
            r4 = r10
            r5 = r11
            com.ss.android.socialbase.downloader.ae.cw r7 = r0.j(r1, r2, r4, r5)
            r6.cw(r7)
            return r7
    }

    public com.ss.android.socialbase.downloader.impls.qv j() {
            r1 = this;
            com.ss.android.socialbase.downloader.impls.qv r0 = r1.j
            return r0
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public java.util.List<com.ss.android.socialbase.downloader.ae.cw> j(java.lang.String r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.impls.qv r0 = r1.j
            java.util.List r2 = r0.j(r2)
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public void j(int r2, int r3, int r4, int r5) {
            r1 = this;
            boolean r0 = com.ss.android.socialbase.downloader.az.m.xt()
            if (r0 == 0) goto L17
            r0 = 1
            com.ss.android.socialbase.downloader.downloader.az r0 = com.ss.android.socialbase.downloader.impls.vl.j(r0)
            if (r0 == 0) goto L11
            r0.j(r2, r3, r4, r5)
            return
        L11:
            com.ss.android.socialbase.downloader.downloader.tj r0 = r1.xt
            r0.j(r2, r3, r4, r5)
            return
        L17:
            com.ss.android.socialbase.downloader.downloader.tj r0 = r1.xt
            r0.j(r2, r3, r4, r5)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public void j(int r9, int r10, int r11, long r12) {
            r8 = this;
            boolean r0 = com.ss.android.socialbase.downloader.az.m.xt()
            if (r0 == 0) goto L1f
            r0 = 1
            com.ss.android.socialbase.downloader.downloader.az r1 = com.ss.android.socialbase.downloader.impls.vl.j(r0)
            if (r1 == 0) goto L15
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r1.j(r2, r3, r4, r5)
            return
        L15:
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            com.ss.android.socialbase.downloader.downloader.tj r2 = r8.xt
            r2.j(r3, r4, r5, r6)
            return
        L1f:
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            com.ss.android.socialbase.downloader.downloader.tj r2 = r8.xt
            r2.j(r3, r4, r5, r6)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public void j(int r2, int r3, long r4) {
            r1 = this;
            com.ss.android.socialbase.downloader.impls.qv r0 = r1.j
            r0.j(r2, r3, r4)
            boolean r0 = com.ss.android.socialbase.downloader.az.m.xt()
            if (r0 == 0) goto L1c
            r0 = 1
            com.ss.android.socialbase.downloader.downloader.az r0 = com.ss.android.socialbase.downloader.impls.vl.j(r0)
            if (r0 == 0) goto L16
            r0.j(r2, r3, r4)
            return
        L16:
            com.ss.android.socialbase.downloader.downloader.tj r0 = r1.xt
            r0.j(r2, r3, r4)
            return
        L1c:
            com.ss.android.socialbase.downloader.downloader.tj r0 = r1.xt
            r0.j(r2, r3, r4)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public void j(int r2, java.util.List<com.ss.android.socialbase.downloader.ae.xt> r3) {
            r1 = this;
            if (r3 == 0) goto L19
            int r0 = r3.size()
            if (r0 != 0) goto L9
            goto L19
        L9:
            com.ss.android.socialbase.downloader.impls.qv r0 = r1.j
            r0.j(r2, r3)
            boolean r0 = com.ss.android.socialbase.downloader.az.m.cw()
            if (r0 == 0) goto L19
            com.ss.android.socialbase.downloader.downloader.tj r0 = r1.xt
            r0.xt(r2, r3)
        L19:
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public void j(com.ss.android.socialbase.downloader.ae.xt r3) {
            r2 = this;
            com.ss.android.socialbase.downloader.impls.qv r0 = r2.j
            monitor-enter(r0)
            com.ss.android.socialbase.downloader.impls.qv r1 = r2.j     // Catch: java.lang.Throwable -> L26
            r1.j(r3)     // Catch: java.lang.Throwable -> L26
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            boolean r0 = com.ss.android.socialbase.downloader.az.m.xt()
            if (r0 == 0) goto L20
            r0 = 1
            com.ss.android.socialbase.downloader.downloader.az r0 = com.ss.android.socialbase.downloader.impls.vl.j(r0)
            if (r0 == 0) goto L1a
            r0.j(r3)
            return
        L1a:
            com.ss.android.socialbase.downloader.downloader.tj r0 = r2.xt
            r0.j(r3)
            return
        L20:
            com.ss.android.socialbase.downloader.downloader.tj r0 = r2.xt
            r0.j(r3)
            return
        L26:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            throw r3
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public boolean j(int r2, java.util.Map<java.lang.Long, com.ss.android.socialbase.downloader.qv.g> r3) {
            r1 = this;
            com.ss.android.socialbase.downloader.impls.qv r0 = r1.j
            r0.j(r2, r3)
            com.ss.android.socialbase.downloader.downloader.tj r0 = r1.xt
            r0.j(r2, r3)
            r2 = 0
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public boolean j(com.ss.android.socialbase.downloader.ae.cw r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            com.ss.android.socialbase.downloader.impls.qv r0 = r1.j
            boolean r0 = r0.j(r2)
            r1.cw(r2)
            return r0
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public void jy(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.impls.qv r0 = r1.j
            r0.jy(r2)
            com.ss.android.socialbase.downloader.downloader.tj r0 = r1.xt
            r0.jy(r2)
            return
    }

    public com.ss.android.socialbase.downloader.downloader.tj m() {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.tj r0 = r1.xt
            return r0
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public boolean m(int r2) {
            r1 = this;
            boolean r0 = com.ss.android.socialbase.downloader.az.m.xt()
            if (r0 == 0) goto L17
            r0 = 1
            com.ss.android.socialbase.downloader.downloader.az r0 = com.ss.android.socialbase.downloader.impls.vl.j(r0)
            if (r0 == 0) goto L11
            r0.av(r2)
            goto L1c
        L11:
            com.ss.android.socialbase.downloader.downloader.tj r0 = r1.xt
            r0.m(r2)
            goto L1c
        L17:
            com.ss.android.socialbase.downloader.downloader.tj r0 = r1.xt
            r0.m(r2)
        L1c:
            com.ss.android.socialbase.downloader.impls.qv r0 = r1.j
            boolean r2 = r0.m(r2)
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public com.ss.android.socialbase.downloader.ae.cw oq(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.impls.qv r0 = r1.j
            com.ss.android.socialbase.downloader.ae.cw r2 = r0.oq(r2)
            r1.cw(r2)
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public com.ss.android.socialbase.downloader.ae.cw r(int r2, long r3) {
            r1 = this;
            com.ss.android.socialbase.downloader.impls.qv r0 = r1.j
            com.ss.android.socialbase.downloader.ae.cw r3 = r0.r(r2, r3)
            r4 = 0
            r1.xt(r2, r4)
            return r3
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public java.util.List<com.ss.android.socialbase.downloader.ae.cw> r(java.lang.String r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.impls.qv r0 = r1.j
            java.util.List r2 = r0.r(r2)
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public void r(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.impls.qv r0 = r1.j
            r0.r(r2)
            boolean r0 = com.ss.android.socialbase.downloader.az.m.xt()
            if (r0 == 0) goto L1c
            r0 = 1
            com.ss.android.socialbase.downloader.downloader.az r0 = com.ss.android.socialbase.downloader.impls.vl.j(r0)
            if (r0 == 0) goto L16
            r0.az(r2)
            return
        L16:
            com.ss.android.socialbase.downloader.downloader.tj r0 = r1.xt
            r0.r(r2)
            return
        L1c:
            com.ss.android.socialbase.downloader.downloader.tj r0 = r1.xt
            r0.r(r2)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public boolean r() {
            r1 = this;
            boolean r0 = r1.cw
            return r0
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public com.ss.android.socialbase.downloader.ae.cw tl(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.impls.qv r0 = r1.j
            com.ss.android.socialbase.downloader.ae.cw r2 = r0.tl(r2)
            r1.cw(r2)
            return r2
    }

    public void tl() {
            r4 = this;
            com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.cw()
            java.lang.String r1 = "task_resume_delay"
            boolean r0 = r0.j(r1)
            if (r0 == 0) goto Lf
            r0 = 4000(0xfa0, double:1.9763E-320)
            goto L1a
        Lf:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L18
            r0 = 1000(0x3e8, double:4.94E-321)
            goto L1a
        L18:
            r0 = 5000(0x1388, double:2.4703E-320)
        L1a:
            com.ss.android.socialbase.downloader.ws.tl r2 = r4.m
            r3 = 1
            android.os.Message r2 = r2.obtainMessage(r3)
            com.ss.android.socialbase.downloader.ws.tl r3 = r4.m
            r3.sendMessageDelayed(r2, r0)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public boolean up() {
            r2 = this;
            boolean r0 = r2.cw
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            monitor-enter(r2)
            boolean r0 = r2.cw     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto L25
            java.lang.String r0 = "DefaultDownloadCache"
            java.lang.String r1 = "ensureDownloadCacheSyncSuccess: waiting start!!!!"
            com.ss.android.socialbase.downloader.m.j.r(r0, r1)     // Catch: java.lang.Throwable -> L18
            r0 = 5000(0x1388, double:2.4703E-320)
            r2.wait(r0)     // Catch: java.lang.Throwable -> L18 java.lang.InterruptedException -> L1a
            goto L1e
        L18:
            r0 = move-exception
            goto L29
        L1a:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)     // Catch: java.lang.Throwable -> L18
        L1e:
            java.lang.String r0 = "DefaultDownloadCache"
            java.lang.String r1 = "ensureDownloadCacheSyncSuccess: waiting end!!!!"
            com.ss.android.socialbase.downloader.m.j.r(r0, r1)     // Catch: java.lang.Throwable -> L18
        L25:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L18
            boolean r0 = r2.cw
            return r0
        L29:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L18
            throw r0
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public boolean up(int r2) {
            r1 = this;
            boolean r0 = com.ss.android.socialbase.downloader.az.m.xt()     // Catch: android.database.sqlite.SQLiteException -> L11
            if (r0 == 0) goto L19
            r0 = 1
            com.ss.android.socialbase.downloader.downloader.az r0 = com.ss.android.socialbase.downloader.impls.vl.j(r0)     // Catch: android.database.sqlite.SQLiteException -> L11
            if (r0 == 0) goto L13
            r0.ws(r2)     // Catch: android.database.sqlite.SQLiteException -> L11
            goto L22
        L11:
            r0 = move-exception
            goto L1f
        L13:
            com.ss.android.socialbase.downloader.downloader.tj r0 = r1.xt     // Catch: android.database.sqlite.SQLiteException -> L11
            r0.up(r2)     // Catch: android.database.sqlite.SQLiteException -> L11
            goto L22
        L19:
            com.ss.android.socialbase.downloader.downloader.tj r0 = r1.xt     // Catch: android.database.sqlite.SQLiteException -> L11
            r0.up(r2)     // Catch: android.database.sqlite.SQLiteException -> L11
            goto L22
        L1f:
            com.bytedance.sdk.component.utils.vl.j(r0)
        L22:
            com.ss.android.socialbase.downloader.impls.qv r0 = r1.j
            boolean r2 = r0.up(r2)
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public java.util.Map<java.lang.Long, com.ss.android.socialbase.downloader.qv.g> vl(int r3) {
            r2 = this;
            com.ss.android.socialbase.downloader.impls.qv r0 = r2.j
            java.util.Map r0 = r0.vl(r3)
            if (r0 == 0) goto L10
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Lf
            goto L10
        Lf:
            return r0
        L10:
            com.ss.android.socialbase.downloader.downloader.tj r0 = r2.xt
            java.util.Map r0 = r0.vl(r3)
            com.ss.android.socialbase.downloader.impls.qv r1 = r2.j
            r1.j(r3, r0)
            return r0
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public java.util.List<com.ss.android.socialbase.downloader.qv.g> ws(int r3) {
            r2 = this;
            com.ss.android.socialbase.downloader.impls.qv r0 = r2.j
            java.util.List r0 = r0.ws(r3)
            if (r0 == 0) goto L10
            int r1 = r0.size()
            if (r1 != 0) goto Lf
            goto L10
        Lf:
            return r0
        L10:
            com.ss.android.socialbase.downloader.downloader.tj r0 = r2.xt
            java.util.List r3 = r0.ws(r3)
            return r3
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public com.ss.android.socialbase.downloader.ae.cw xt(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.impls.qv r0 = r1.j
            com.ss.android.socialbase.downloader.ae.cw r2 = r0.xt(r2)
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public com.ss.android.socialbase.downloader.ae.cw xt(int r2, long r3) {
            r1 = this;
            com.ss.android.socialbase.downloader.impls.qv r0 = r1.j
            com.ss.android.socialbase.downloader.ae.cw r3 = r0.xt(r2, r3)
            r4 = 0
            r1.xt(r2, r4)
            return r3
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public java.util.List<com.ss.android.socialbase.downloader.ae.cw> xt() {
            r1 = this;
            com.ss.android.socialbase.downloader.impls.qv r0 = r1.j
            java.util.List r0 = r0.xt()
            return r0
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public java.util.List<com.ss.android.socialbase.downloader.ae.cw> xt(java.lang.String r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.impls.qv r0 = r1.j
            java.util.List r2 = r0.xt(r2)
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public void xt(int r2, java.util.List<com.ss.android.socialbase.downloader.ae.xt> r3) {
            r1 = this;
            com.ss.android.socialbase.downloader.impls.qv r0 = r1.j     // Catch: java.lang.Exception -> L12
            com.ss.android.socialbase.downloader.ae.cw r0 = r0.xt(r2)     // Catch: java.lang.Exception -> L12
            r1.j(r0)     // Catch: java.lang.Exception -> L12
            if (r3 != 0) goto L14
            com.ss.android.socialbase.downloader.impls.qv r3 = r1.j     // Catch: java.lang.Exception -> L12
            java.util.List r3 = r3.cw(r2)     // Catch: java.lang.Exception -> L12
            goto L14
        L12:
            r2 = move-exception
            goto L31
        L14:
            boolean r0 = com.ss.android.socialbase.downloader.az.m.xt()     // Catch: java.lang.Exception -> L12
            if (r0 == 0) goto L2b
            r0 = 1
            com.ss.android.socialbase.downloader.downloader.az r0 = com.ss.android.socialbase.downloader.impls.vl.j(r0)     // Catch: java.lang.Exception -> L12
            if (r0 == 0) goto L25
            r0.xt(r2, r3)     // Catch: java.lang.Exception -> L12
            return
        L25:
            com.ss.android.socialbase.downloader.downloader.tj r0 = r1.xt     // Catch: java.lang.Exception -> L12
            r0.xt(r2, r3)     // Catch: java.lang.Exception -> L12
            return
        L2b:
            com.ss.android.socialbase.downloader.downloader.tj r0 = r1.xt     // Catch: java.lang.Exception -> L12
            r0.xt(r2, r3)     // Catch: java.lang.Exception -> L12
            return
        L31:
            com.bytedance.sdk.component.utils.vl.j(r2)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public void xt(com.ss.android.socialbase.downloader.ae.cw r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            com.ss.android.socialbase.downloader.impls.qv r0 = r1.j
            r0.j(r2)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public void xt(com.ss.android.socialbase.downloader.ae.xt r2) {
            r1 = this;
            boolean r0 = com.ss.android.socialbase.downloader.az.m.xt()
            if (r0 == 0) goto L17
            r0 = 1
            com.ss.android.socialbase.downloader.downloader.az r0 = com.ss.android.socialbase.downloader.impls.vl.j(r0)
            if (r0 == 0) goto L11
            r0.j(r2)
            return
        L11:
            com.ss.android.socialbase.downloader.downloader.tj r0 = r1.xt
            r0.j(r2)
            return
        L17:
            com.ss.android.socialbase.downloader.downloader.tj r0 = r1.xt
            r0.j(r2)
            return
    }
}
