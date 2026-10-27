package com.ss.android.socialbase.downloader.downloader;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class xt {
    private java.lang.String j;
    private java.lang.String xt;

    xt() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.ss.android.socialbase.downloader.ae.r j(android.content.Context r0) {
            com.ss.android.socialbase.downloader.downloader.ae.xt(r0)
            com.ss.android.socialbase.downloader.ae.r r0 = new com.ss.android.socialbase.downloader.ae.r
            r0.<init>()
            return r0
    }

    private java.io.File j(java.lang.String r3, boolean r4) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L29
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L29
            boolean r3 = r0.exists()     // Catch: java.lang.Throwable -> L28
            if (r3 != 0) goto L17
            r0.mkdirs()     // Catch: java.lang.Throwable -> L28
            return r0
        L17:
            boolean r3 = r0.isDirectory()     // Catch: java.lang.Throwable -> L28
            if (r3 != 0) goto L27
            if (r4 == 0) goto L26
            r0.delete()     // Catch: java.lang.Throwable -> L28
            r0.mkdirs()     // Catch: java.lang.Throwable -> L28
            return r0
        L26:
            return r1
        L27:
            return r0
        L28:
            r1 = r0
        L29:
            return r1
    }

    public boolean ae(int r2) {
            r1 = this;
            r0 = 4194304(0x400000, float:5.877472E-39)
            boolean r0 = com.ss.android.socialbase.downloader.az.j.j(r0)
            if (r0 == 0) goto L16
            monitor-enter(r1)
            com.ss.android.socialbase.downloader.downloader.r r0 = com.ss.android.socialbase.downloader.downloader.r.j()     // Catch: java.lang.Throwable -> L13
            boolean r2 = r0.g(r2)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            return r2
        L13:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            throw r2
        L16:
            com.ss.android.socialbase.downloader.downloader.r r0 = com.ss.android.socialbase.downloader.downloader.r.j()
            boolean r2 = r0.g(r2)
            return r2
    }

    public java.io.File cw() {
            r2 = this;
            java.lang.String r0 = r2.j
            r1 = 1
            java.io.File r0 = r2.j(r0, r1)
            return r0
    }

    public java.util.List<com.ss.android.socialbase.downloader.ae.cw> cw(java.lang.String r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.r r0 = com.ss.android.socialbase.downloader.downloader.r.j()
            java.util.List r2 = r0.cw(r2)
            return r2
    }

    public void cw(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.r r0 = com.ss.android.socialbase.downloader.downloader.r.j()
            r0.m(r2)
            return
    }

    public com.ss.android.socialbase.downloader.r.h g(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.r r0 = com.ss.android.socialbase.downloader.downloader.r.j()
            com.ss.android.socialbase.downloader.r.h r2 = r0.qv(r2)
            return r2
    }

    public int j(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.r r0 = com.ss.android.socialbase.downloader.downloader.r.j()
            int r2 = r0.j(r2, r3)
            return r2
    }

    public java.util.List<com.ss.android.socialbase.downloader.ae.cw> j(java.lang.String r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.r r0 = com.ss.android.socialbase.downloader.downloader.r.j()
            java.util.List r2 = r0.j(r2)
            return r2
    }

    public void j() {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.r r0 = com.ss.android.socialbase.downloader.downloader.r.j()
            r0.cw()
            return
    }

    public void j(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.r r0 = com.ss.android.socialbase.downloader.downloader.r.j()
            r0.r(r2)
            return
    }

    @java.lang.Deprecated
    public void j(int r4, com.ss.android.socialbase.downloader.r.a r5) {
            r3 = this;
            if (r5 != 0) goto L3
            return
        L3:
            com.ss.android.socialbase.downloader.downloader.r r0 = com.ss.android.socialbase.downloader.downloader.r.j()
            com.ss.android.socialbase.downloader.xt.tl r1 = com.ss.android.socialbase.downloader.xt.tl.j
            r2 = 1
            r0.xt(r4, r5, r1, r2)
            return
    }

    @java.lang.Deprecated
    public void j(int r7, com.ss.android.socialbase.downloader.r.a r8, boolean r9) {
            r6 = this;
            if (r8 != 0) goto L3
            return
        L3:
            com.ss.android.socialbase.downloader.downloader.r r0 = com.ss.android.socialbase.downloader.downloader.r.j()
            com.ss.android.socialbase.downloader.xt.tl r3 = com.ss.android.socialbase.downloader.xt.tl.j
            r4 = 1
            r1 = r7
            r2 = r8
            r5 = r9
            r0.j(r1, r2, r3, r4, r5)
            return
    }

    public void j(int r2, boolean r3) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.r r0 = com.ss.android.socialbase.downloader.downloader.r.j()
            r0.cw(r2, r3)
            return
    }

    public void j(com.ss.android.socialbase.downloader.downloader.mi r1) {
            r0 = this;
            com.ss.android.socialbase.downloader.downloader.cw.j(r1)
            return
    }

    public void j(com.ss.android.socialbase.downloader.r.vl r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.r r0 = com.ss.android.socialbase.downloader.downloader.r.j()
            r0.j(r2)
            return
    }

    public void j(java.util.List<java.lang.String> r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.r r0 = com.ss.android.socialbase.downloader.downloader.r.j()
            r0.j(r2)
            return
    }

    public boolean j(com.ss.android.socialbase.downloader.ae.cw r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.r r0 = com.ss.android.socialbase.downloader.downloader.r.j()
            boolean r2 = r0.j(r2)
            return r2
    }

    public boolean jy(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.r r0 = com.ss.android.socialbase.downloader.downloader.r.j()
            com.ss.android.socialbase.downloader.downloader.az r2 = r0.cw(r2)
            boolean r2 = r2.xt()
            return r2
    }

    public int m(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.r r0 = com.ss.android.socialbase.downloader.downloader.r.j()
            int r2 = r0.tl(r2)
            return r2
    }

    public void oq(int r3) {
            r2 = this;
            com.ss.android.socialbase.downloader.downloader.r r0 = com.ss.android.socialbase.downloader.downloader.r.j()
            r1 = 1
            r0.r(r3, r1)
            return
    }

    @java.lang.Deprecated
    public void qv(int r5) {
            r4 = this;
            com.ss.android.socialbase.downloader.downloader.r r0 = com.ss.android.socialbase.downloader.downloader.r.j()
            com.ss.android.socialbase.downloader.xt.tl r1 = com.ss.android.socialbase.downloader.xt.tl.j
            r2 = 1
            r3 = 0
            r0.j(r5, r3, r1, r2)
            return
    }

    public java.io.File r() {
            r2 = this;
            java.lang.String r0 = r2.xt
            r1 = 0
            java.io.File r0 = r2.j(r0, r1)
            return r0
    }

    public java.util.List<com.ss.android.socialbase.downloader.ae.cw> r(java.lang.String r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.r r0 = com.ss.android.socialbase.downloader.downloader.r.j()
            java.util.List r2 = r0.r(r2)
            return r2
    }

    public boolean r(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.r r0 = com.ss.android.socialbase.downloader.downloader.r.j()
            boolean r2 = r0.up(r2)
            return r2
    }

    public com.ss.android.socialbase.downloader.ae.cw tl(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.r r0 = com.ss.android.socialbase.downloader.downloader.r.j()
            com.ss.android.socialbase.downloader.ae.cw r2 = r0.oq(r2)
            return r2
    }

    public void up(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.r r0 = com.ss.android.socialbase.downloader.downloader.r.j()
            r0.ae(r2)
            return
    }

    public void up(java.lang.String r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L8
            r1.j = r2
        L8:
            return
    }

    public com.ss.android.socialbase.downloader.r.tj vl(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.r r0 = com.ss.android.socialbase.downloader.downloader.r.j()
            com.ss.android.socialbase.downloader.r.tj r2 = r0.az(r2)
            return r2
    }

    public com.ss.android.socialbase.downloader.ae.cw xt(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.r r0 = com.ss.android.socialbase.downloader.downloader.r.j()
            com.ss.android.socialbase.downloader.ae.cw r2 = r0.xt(r2, r3)
            return r2
    }

    public com.ss.android.socialbase.downloader.downloader.mi xt() {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.mi r0 = com.ss.android.socialbase.downloader.downloader.cw.hh()
            return r0
    }

    public java.util.List<com.ss.android.socialbase.downloader.ae.cw> xt(java.lang.String r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.r r0 = com.ss.android.socialbase.downloader.downloader.r.j()
            java.util.List r2 = r0.xt(r2)
            return r2
    }

    public void xt(int r2) {
            r1 = this;
            r0 = 1
            r1.j(r2, r0)
            return
    }

    public void xt(java.util.List<java.lang.String> r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.r r0 = com.ss.android.socialbase.downloader.downloader.r.j()
            r0.xt(r2)
            return
    }
}
