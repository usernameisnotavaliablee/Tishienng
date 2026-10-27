package com.ss.android.socialbase.downloader.downloader;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ae extends com.ss.android.socialbase.downloader.downloader.xt {
    private static volatile com.ss.android.socialbase.downloader.downloader.ae j;

    static {
            com.ss.android.socialbase.downloader.downloader.v r0 = new com.ss.android.socialbase.downloader.downloader.v
            r0.<init>()
            com.ss.android.socialbase.downloader.downloader.cw.j(r0)
            r0 = 0
            com.ss.android.socialbase.downloader.downloader.ae.j = r0
            return
    }

    private ae() {
            r0 = this;
            r0.<init>()
            return
    }

    ae(com.ss.android.socialbase.downloader.downloader.tl r1) {
            r0 = this;
            r0.<init>()
            com.ss.android.socialbase.downloader.downloader.cw.j(r1)
            return
    }

    public static /* bridge */ /* synthetic */ com.ss.android.socialbase.downloader.ae.r j(android.content.Context r0) {
            com.ss.android.socialbase.downloader.ae.r r0 = com.ss.android.socialbase.downloader.downloader.xt.j(r0)
            return r0
    }

    public static synchronized void j(com.ss.android.socialbase.downloader.downloader.tl r2, boolean r3) {
            java.lang.Class<com.ss.android.socialbase.downloader.downloader.ae> r0 = com.ss.android.socialbase.downloader.downloader.ae.class
            monitor-enter(r0)
            if (r2 != 0) goto L7
            monitor-exit(r0)
            return
        L7:
            com.ss.android.socialbase.downloader.downloader.ae r1 = com.ss.android.socialbase.downloader.downloader.ae.j     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.ss.android.socialbase.downloader.downloader.ae r2 = r2.l()     // Catch: java.lang.Throwable -> L13
            com.ss.android.socialbase.downloader.downloader.ae.j = r2     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)
            return
        L13:
            r2 = move-exception
            goto L27
        L15:
            boolean r1 = com.ss.android.socialbase.downloader.downloader.cw.z()     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L20
            com.ss.android.socialbase.downloader.downloader.cw.j(r2)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)
            return
        L20:
            if (r3 == 0) goto L25
            com.ss.android.socialbase.downloader.downloader.cw.xt(r2)     // Catch: java.lang.Throwable -> L13
        L25:
            monitor-exit(r0)
            return
        L27:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r2
    }

    public static com.ss.android.socialbase.downloader.downloader.ae xt(android.content.Context r2) {
            com.ss.android.socialbase.downloader.downloader.ae r0 = com.ss.android.socialbase.downloader.downloader.ae.j
            if (r0 != 0) goto L1c
            java.lang.Class<com.ss.android.socialbase.downloader.downloader.ae> r0 = com.ss.android.socialbase.downloader.downloader.ae.class
            monitor-enter(r0)
            com.ss.android.socialbase.downloader.downloader.ae r1 = com.ss.android.socialbase.downloader.downloader.ae.j     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L18
            com.ss.android.socialbase.downloader.downloader.cw.j(r2)     // Catch: java.lang.Throwable -> L16
            com.ss.android.socialbase.downloader.downloader.ae r2 = new com.ss.android.socialbase.downloader.downloader.ae     // Catch: java.lang.Throwable -> L16
            r2.<init>()     // Catch: java.lang.Throwable -> L16
            com.ss.android.socialbase.downloader.downloader.ae.j = r2     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r2 = move-exception
            goto L1a
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            goto L1c
        L1a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r2
        L1c:
            com.ss.android.socialbase.downloader.downloader.ae r2 = com.ss.android.socialbase.downloader.downloader.ae.j
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.xt
    public /* bridge */ /* synthetic */ boolean ae(int r1) {
            r0 = this;
            boolean r1 = super.ae(r1)
            return r1
    }

    @Override // com.ss.android.socialbase.downloader.downloader.xt
    public /* bridge */ /* synthetic */ java.io.File cw() {
            r1 = this;
            java.io.File r0 = super.cw()
            return r0
    }

    @Override // com.ss.android.socialbase.downloader.downloader.xt
    public /* bridge */ /* synthetic */ java.util.List cw(java.lang.String r1) {
            r0 = this;
            java.util.List r1 = super.cw(r1)
            return r1
    }

    @Override // com.ss.android.socialbase.downloader.downloader.xt
    public /* bridge */ /* synthetic */ void cw(int r1) {
            r0 = this;
            super.cw(r1)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.xt
    public /* bridge */ /* synthetic */ com.ss.android.socialbase.downloader.r.h g(int r1) {
            r0 = this;
            com.ss.android.socialbase.downloader.r.h r1 = super.g(r1)
            return r1
    }

    @Override // com.ss.android.socialbase.downloader.downloader.xt
    public /* bridge */ /* synthetic */ int j(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            int r1 = super.j(r1, r2)
            return r1
    }

    @Override // com.ss.android.socialbase.downloader.downloader.xt
    public /* bridge */ /* synthetic */ java.util.List j(java.lang.String r1) {
            r0 = this;
            java.util.List r1 = super.j(r1)
            return r1
    }

    @Override // com.ss.android.socialbase.downloader.downloader.xt
    public /* bridge */ /* synthetic */ void j() {
            r0 = this;
            super.j()
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.xt
    public /* bridge */ /* synthetic */ void j(int r1) {
            r0 = this;
            super.j(r1)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.xt
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ void j(int r1, com.ss.android.socialbase.downloader.r.a r2) {
            r0 = this;
            super.j(r1, r2)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.xt
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ void j(int r1, com.ss.android.socialbase.downloader.r.a r2, boolean r3) {
            r0 = this;
            super.j(r1, r2, r3)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.xt
    public /* bridge */ /* synthetic */ void j(int r1, boolean r2) {
            r0 = this;
            super.j(r1, r2)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.xt
    public /* bridge */ /* synthetic */ void j(com.ss.android.socialbase.downloader.downloader.mi r1) {
            r0 = this;
            super.j(r1)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.xt
    public /* bridge */ /* synthetic */ void j(com.ss.android.socialbase.downloader.r.vl r1) {
            r0 = this;
            super.j(r1)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.xt
    public /* bridge */ /* synthetic */ void j(java.util.List r1) {
            r0 = this;
            super.j(r1)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.xt
    public /* bridge */ /* synthetic */ boolean j(com.ss.android.socialbase.downloader.ae.cw r1) {
            r0 = this;
            boolean r1 = super.j(r1)
            return r1
    }

    @Override // com.ss.android.socialbase.downloader.downloader.xt
    public /* bridge */ /* synthetic */ boolean jy(int r1) {
            r0 = this;
            boolean r1 = super.jy(r1)
            return r1
    }

    @Override // com.ss.android.socialbase.downloader.downloader.xt
    public /* bridge */ /* synthetic */ int m(int r1) {
            r0 = this;
            int r1 = super.m(r1)
            return r1
    }

    @Override // com.ss.android.socialbase.downloader.downloader.xt
    public /* bridge */ /* synthetic */ void oq(int r1) {
            r0 = this;
            super.oq(r1)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.xt
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ void qv(int r1) {
            r0 = this;
            super.qv(r1)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.xt
    public /* bridge */ /* synthetic */ java.io.File r() {
            r1 = this;
            java.io.File r0 = super.r()
            return r0
    }

    @Override // com.ss.android.socialbase.downloader.downloader.xt
    public /* bridge */ /* synthetic */ java.util.List r(java.lang.String r1) {
            r0 = this;
            java.util.List r1 = super.r(r1)
            return r1
    }

    @Override // com.ss.android.socialbase.downloader.downloader.xt
    public /* bridge */ /* synthetic */ boolean r(int r1) {
            r0 = this;
            boolean r1 = super.r(r1)
            return r1
    }

    @Override // com.ss.android.socialbase.downloader.downloader.xt
    public /* bridge */ /* synthetic */ com.ss.android.socialbase.downloader.ae.cw tl(int r1) {
            r0 = this;
            com.ss.android.socialbase.downloader.ae.cw r1 = super.tl(r1)
            return r1
    }

    @Override // com.ss.android.socialbase.downloader.downloader.xt
    public /* bridge */ /* synthetic */ void up(int r1) {
            r0 = this;
            super.up(r1)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.xt
    public /* bridge */ /* synthetic */ void up(java.lang.String r1) {
            r0 = this;
            super.up(r1)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.xt
    public /* bridge */ /* synthetic */ com.ss.android.socialbase.downloader.r.tj vl(int r1) {
            r0 = this;
            com.ss.android.socialbase.downloader.r.tj r1 = super.vl(r1)
            return r1
    }

    @Override // com.ss.android.socialbase.downloader.downloader.xt
    public /* bridge */ /* synthetic */ com.ss.android.socialbase.downloader.ae.cw xt(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            com.ss.android.socialbase.downloader.ae.cw r1 = super.xt(r1, r2)
            return r1
    }

    @Override // com.ss.android.socialbase.downloader.downloader.xt
    public /* bridge */ /* synthetic */ com.ss.android.socialbase.downloader.downloader.mi xt() {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.mi r0 = super.xt()
            return r0
    }

    @Override // com.ss.android.socialbase.downloader.downloader.xt
    public /* bridge */ /* synthetic */ java.util.List xt(java.lang.String r1) {
            r0 = this;
            java.util.List r1 = super.xt(r1)
            return r1
    }

    @Override // com.ss.android.socialbase.downloader.downloader.xt
    public /* bridge */ /* synthetic */ void xt(int r1) {
            r0 = this;
            super.xt(r1)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.xt
    public /* bridge */ /* synthetic */ void xt(java.util.List r1) {
            r0 = this;
            super.xt(r1)
            return
    }
}
