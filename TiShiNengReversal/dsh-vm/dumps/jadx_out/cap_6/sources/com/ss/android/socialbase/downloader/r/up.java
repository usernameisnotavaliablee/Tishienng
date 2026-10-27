package com.ss.android.socialbase.downloader.r;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class up extends com.ss.android.socialbase.downloader.r.cw implements com.ss.android.socialbase.downloader.r.kt {
    public up() {
            r0 = this;
            r0.<init>()
            return
    }

    private void j(int r4, com.ss.android.socialbase.downloader.ae.cw r5, com.ss.android.socialbase.downloader.up.j r6, boolean r7) {
            r3 = this;
            if (r5 != 0) goto L3
            goto L3b
        L3:
            boolean r0 = r5.oy()
            if (r0 == 0) goto L3b
            r0 = 4
            if (r4 != r0) goto Ld
            goto L3b
        Ld:
            com.ss.android.socialbase.downloader.notification.xt r0 = com.ss.android.socialbase.downloader.notification.xt.j()
            int r1 = r5.ae()
            com.ss.android.socialbase.downloader.notification.j r0 = r0.up(r1)
            if (r0 != 0) goto L1f
            com.ss.android.socialbase.downloader.notification.j r0 = r3.j()
        L1f:
            long r1 = r5.ka()
            r0.xt(r1)
            r1 = -3
            if (r4 != r1) goto L31
            long r1 = r5.ka()
            r0.j(r1)
            goto L38
        L31:
            long r1 = r5.uq()
            r0.j(r1)
        L38:
            r0.j(r4, r6, r7)
        L3b:
            return
    }

    private void qv(com.ss.android.socialbase.downloader.ae.cw r3) {
            r2 = this;
            if (r3 == 0) goto L26
            boolean r0 = r3.oy()
            if (r0 != 0) goto L9
            goto L26
        L9:
            com.ss.android.socialbase.downloader.notification.xt r0 = com.ss.android.socialbase.downloader.notification.xt.j()
            int r1 = r3.ae()
            com.ss.android.socialbase.downloader.notification.j r0 = r0.up(r1)
            if (r0 != 0) goto L23
            com.ss.android.socialbase.downloader.notification.j r3 = r2.j()
            com.ss.android.socialbase.downloader.notification.xt r0 = com.ss.android.socialbase.downloader.notification.xt.j()
            r0.j(r3)
            return
        L23:
            r0.j(r3)
        L26:
            return
    }

    private void vl(com.ss.android.socialbase.downloader.ae.cw r6) {
            r5 = this;
            if (r6 == 0) goto L2d
            boolean r0 = r6.oy()
            if (r0 == 0) goto L2d
            int r0 = r6.i()
            r1 = 4
            if (r0 == r1) goto L10
            goto L2d
        L10:
            com.ss.android.socialbase.downloader.notification.xt r0 = com.ss.android.socialbase.downloader.notification.xt.j()
            int r1 = r6.ae()
            com.ss.android.socialbase.downloader.notification.j r0 = r0.up(r1)
            if (r0 != 0) goto L22
            com.ss.android.socialbase.downloader.notification.j r0 = r5.j()
        L22:
            long r1 = r6.uq()
            long r3 = r6.ka()
            r0.j(r1, r3)
        L2d:
            return
    }

    @Override // com.ss.android.socialbase.downloader.r.kt
    public void ae(com.ss.android.socialbase.downloader.ae.cw r4) {
            r3 = this;
            if (r4 == 0) goto L10
            boolean r0 = r4.qe()
            if (r0 == 0) goto L9
            goto L10
        L9:
            r0 = 0
            r1 = 1
            r2 = 11
            r3.j(r2, r4, r0, r1)
        L10:
            return
    }

    @Override // com.ss.android.socialbase.downloader.r.cw, com.ss.android.socialbase.downloader.r.a
    public void cw(com.ss.android.socialbase.downloader.ae.cw r1) {
            r0 = this;
            super.cw(r1)
            r0.vl(r1)
            return
    }

    protected abstract com.ss.android.socialbase.downloader.notification.j j();

    @Override // com.ss.android.socialbase.downloader.r.cw, com.ss.android.socialbase.downloader.r.a
    public void j(com.ss.android.socialbase.downloader.ae.cw r3) {
            r2 = this;
            super.j(r3)
            r2.qv(r3)
            r0 = 1
            r1 = 0
            r2.j(r0, r3, r1, r0)
            return
    }

    @Override // com.ss.android.socialbase.downloader.r.cw, com.ss.android.socialbase.downloader.r.a
    public void j(com.ss.android.socialbase.downloader.ae.cw r3, com.ss.android.socialbase.downloader.up.j r4) {
            r2 = this;
            super.j(r3, r4)
            r0 = -1
            r1 = 0
            r2.j(r0, r3, r4, r1)
            return
    }

    @Override // com.ss.android.socialbase.downloader.r.cw, com.ss.android.socialbase.downloader.r.a
    public void r(com.ss.android.socialbase.downloader.ae.cw r4) {
            r3 = this;
            super.r(r4)
            r0 = 0
            r1 = 0
            r2 = -2
            r3.j(r2, r4, r0, r1)
            return
    }

    @Override // com.ss.android.socialbase.downloader.r.cw, com.ss.android.socialbase.downloader.r.a
    public void up(com.ss.android.socialbase.downloader.ae.cw r4) {
            r3 = this;
            super.up(r4)
            r0 = 0
            r1 = 0
            r2 = -3
            r3.j(r2, r4, r0, r1)
            return
    }

    @Override // com.ss.android.socialbase.downloader.r.cw, com.ss.android.socialbase.downloader.r.a
    public void xt(com.ss.android.socialbase.downloader.ae.cw r4) {
            r3 = this;
            super.xt(r4)
            r0 = 0
            r1 = 0
            r2 = 2
            r3.j(r2, r4, r0, r1)
            return
    }
}
