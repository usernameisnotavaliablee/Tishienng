package com.ss.android.socialbase.downloader.impls;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class av implements com.ss.android.socialbase.downloader.downloader.az {
    private final com.ss.android.socialbase.downloader.downloader.i cw;
    private final com.ss.android.socialbase.downloader.impls.j j;
    private final boolean r;
    private final com.ss.android.socialbase.downloader.downloader.vl xt;

    public av() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public av(boolean r3) {
            r2 = this;
            r2.<init>()
            com.ss.android.socialbase.downloader.impls.j r0 = com.ss.android.socialbase.downloader.downloader.cw.p()
            r2.j = r0
            com.ss.android.socialbase.downloader.downloader.vl r0 = com.ss.android.socialbase.downloader.downloader.cw.x()
            r2.xt = r0
            if (r3 != 0) goto L18
            com.ss.android.socialbase.downloader.downloader.i r3 = com.ss.android.socialbase.downloader.downloader.cw.ch()
            r2.cw = r3
            goto L1e
        L18:
            com.ss.android.socialbase.downloader.downloader.i r3 = com.ss.android.socialbase.downloader.downloader.cw.s()
            r2.cw = r3
        L1e:
            com.ss.android.socialbase.downloader.jy.j r3 = com.ss.android.socialbase.downloader.jy.j.cw()
            java.lang.String r0 = "service_alive"
            r1 = 0
            boolean r3 = r3.xt(r0, r1)
            r2.r = r3
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public boolean ae() {
            r2 = this;
            boolean r0 = r2.r
            r1 = 0
            if (r0 == 0) goto L11
            com.ss.android.socialbase.downloader.downloader.i r0 = r2.cw
            if (r0 == 0) goto L11
            boolean r0 = r0.j()
            if (r0 == 0) goto L11
            r0 = 1
            return r0
        L11:
            return r1
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public boolean ae(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.impls.j r0 = r1.j
            if (r0 == 0) goto L9
            boolean r2 = r0.j(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public boolean av(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.vl r0 = r1.xt
            boolean r2 = r0.m(r2)
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void az(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.vl r0 = r1.xt
            r0.r(r2)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public java.util.List<com.ss.android.socialbase.downloader.ae.cw> cw(java.lang.String r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.vl r0 = r1.xt
            if (r0 == 0) goto L9
            java.util.List r2 = r0.cw(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void cw(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.impls.j r0 = r1.j
            if (r0 == 0) goto L7
            r0.m(r2)
        L7:
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void cw(int r2, boolean r3) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.r r0 = com.ss.android.socialbase.downloader.downloader.r.j()
            r0.j(r2, r3)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public boolean cw() {
            r1 = this;
            boolean r0 = com.ss.android.socialbase.downloader.downloader.cw.rh()
            return r0
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public boolean cw(com.ss.android.socialbase.downloader.ae.cw r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.vl r0 = r1.xt
            boolean r2 = r0.j(r2)
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public java.util.List<com.ss.android.socialbase.downloader.ae.xt> g(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.vl r0 = r1.xt
            java.util.List r2 = r0.cw(r2)
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public com.ss.android.socialbase.downloader.r.h i(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.impls.j r0 = r1.j
            if (r0 == 0) goto L9
            com.ss.android.socialbase.downloader.r.h r2 = r0.g(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public int j(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            int r1 = com.ss.android.socialbase.downloader.downloader.cw.j(r1, r2)
            return r1
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public java.util.List<com.ss.android.socialbase.downloader.ae.cw> j(java.lang.String r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.impls.j r0 = r1.j
            if (r0 == 0) goto L9
            java.util.List r2 = r0.j(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void j() {
            r1 = this;
            com.ss.android.socialbase.downloader.impls.j r0 = r1.j
            if (r0 == 0) goto L7
            r0.xt()
        L7:
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void j(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.impls.j r0 = r1.j
            if (r0 == 0) goto L7
            r0.up(r2)
        L7:
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void j(int r3, int r4) {
            r2 = this;
            java.util.List r0 = com.ss.android.socialbase.downloader.downloader.cw.r()
            if (r0 == 0) goto L20
            java.util.List r0 = com.ss.android.socialbase.downloader.downloader.cw.r()
            java.util.Iterator r0 = r0.iterator()
        Le:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            com.ss.android.socialbase.downloader.r.n r1 = (com.ss.android.socialbase.downloader.r.n) r1
            if (r1 == 0) goto Le
            r1.j(r4, r3)
            goto Le
        L20:
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void j(int r2, int r3, int r4, int r5) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.vl r0 = r1.xt
            r0.j(r2, r3, r4, r5)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void j(int r7, int r8, int r9, long r10) {
            r6 = this;
            com.ss.android.socialbase.downloader.downloader.vl r0 = r6.xt
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.j(r1, r2, r3, r4)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void j(int r2, int r3, long r4) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.vl r0 = r1.xt
            r0.j(r2, r3, r4)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void j(int r7, int r8, com.ss.android.socialbase.downloader.r.a r9, com.ss.android.socialbase.downloader.xt.tl r10, boolean r11) {
            r6 = this;
            com.ss.android.socialbase.downloader.impls.j r0 = r6.j
            if (r0 == 0) goto Lc
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.xt(r1, r2, r3, r4, r5)
        Lc:
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void j(int r8, int r9, com.ss.android.socialbase.downloader.r.a r10, com.ss.android.socialbase.downloader.xt.tl r11, boolean r12, boolean r13) {
            r7 = this;
            com.ss.android.socialbase.downloader.impls.j r0 = r7.j
            if (r0 == 0) goto Ld
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r0.j(r1, r2, r3, r4, r5, r6)
        Ld:
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void j(int r2, long r3) {
            r1 = this;
            com.ss.android.socialbase.downloader.impls.j r0 = r1.j
            if (r0 == 0) goto L7
            r0.xt(r2, r3)
        L7:
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void j(int r2, android.app.Notification r3) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.i r0 = r1.cw
            if (r0 == 0) goto L7
            r0.j(r2, r3)
        L7:
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void j(int r2, com.ss.android.socialbase.downloader.r.h r3) {
            r1 = this;
            com.ss.android.socialbase.downloader.impls.j r0 = r1.j
            if (r0 == 0) goto L7
            r0.j(r2, r3)
        L7:
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void j(int r2, java.util.List<com.ss.android.socialbase.downloader.ae.xt> r3) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.vl r0 = r1.xt
            r0.j(r2, r3)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void j(int r2, boolean r3) {
            r1 = this;
            com.ss.android.socialbase.downloader.impls.j r0 = r1.j
            if (r0 == 0) goto L7
            r0.j(r2, r3)
        L7:
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void j(com.ss.android.socialbase.downloader.ae.r r6) {
            r5 = this;
            com.ss.android.socialbase.downloader.downloader.i r0 = r5.cw
            if (r0 == 0) goto L8
            r0.xt(r6)
            return
        L8:
            if (r6 == 0) goto L2e
            com.ss.android.socialbase.downloader.r.l r0 = r6.up()
            com.ss.android.socialbase.downloader.ae.cw r1 = r6.j()
            com.ss.android.socialbase.downloader.up.j r2 = new com.ss.android.socialbase.downloader.up.j
            r3 = 1003(0x3eb, float:1.406E-42)
            java.lang.String r4 = "downloadServiceHandler is null"
            r2.<init>(r3, r4)
            com.ss.android.socialbase.downloader.ae.cw r3 = r6.j()
            if (r3 == 0) goto L2a
            com.ss.android.socialbase.downloader.ae.cw r6 = r6.j()
            int r6 = r6.i()
            goto L2b
        L2a:
            r6 = 0
        L2b:
            com.ss.android.socialbase.downloader.tl.j.j(r0, r1, r2, r6)
        L2e:
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void j(com.ss.android.socialbase.downloader.ae.xt r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.vl r0 = r1.xt
            r0.j(r2)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void j(com.ss.android.socialbase.downloader.r.n r1) {
            r0 = this;
            com.ss.android.socialbase.downloader.downloader.cw.j(r1)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void j(java.util.List<java.lang.String> r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.impls.j r0 = r1.j
            if (r0 == 0) goto L7
            r0.j(r2)
        L7:
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void j(boolean r1, boolean r2) {
            r0 = this;
            com.ss.android.socialbase.downloader.downloader.i r1 = r0.cw
            if (r1 == 0) goto L7
            r1.j(r2)
        L7:
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public boolean j(com.ss.android.socialbase.downloader.ae.cw r4) {
            r3 = this;
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            int r0 = r4.i()
            java.lang.String r1 = r4.qv()
            java.lang.String r2 = r4.tl()
            boolean r0 = com.ss.android.socialbase.downloader.az.m.j(r0, r1, r2)
            if (r0 == 0) goto L2e
            r1 = 33554432(0x2000000, float:9.403955E-38)
            boolean r1 = com.ss.android.socialbase.downloader.az.j.j(r1)
            r2 = 1
            if (r1 == 0) goto L27
            int r4 = r4.ae()
            r3.xt(r4, r2)
            return r0
        L27:
            int r4 = r4.ae()
            r3.r(r4, r2)
        L2e:
            return r0
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public int jy(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.r r0 = com.ss.android.socialbase.downloader.downloader.r.j()
            int r2 = r0.j(r2)
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public int m(int r3) {
            r2 = this;
            com.ss.android.socialbase.downloader.impls.j r0 = r2.j
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.ss.android.socialbase.downloader.ae.cw r3 = r0.r(r3)
            if (r3 != 0) goto Ld
            return r1
        Ld:
            int r3 = r3.i()
            return r3
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void m() {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.vl r0 = r1.xt
            r0.cw()
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public com.ss.android.socialbase.downloader.r.tj mi(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.impls.j r0 = r1.j
            if (r0 == 0) goto L9
            com.ss.android.socialbase.downloader.r.tj r2 = r0.oq(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void oq(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.impls.j r0 = r1.j
            if (r0 == 0) goto L7
            r0.jy(r2)
        L7:
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void qv(int r1) {
            r0 = this;
            com.ss.android.socialbase.downloader.m.j.j(r1)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public java.util.List<com.ss.android.socialbase.downloader.ae.cw> r() {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.vl r0 = r1.xt
            if (r0 == 0) goto L9
            java.util.List r0 = r0.xt()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public java.util.List<com.ss.android.socialbase.downloader.ae.cw> r(java.lang.String r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.vl r0 = r1.xt
            if (r0 == 0) goto L9
            java.util.List r2 = r0.r(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void r(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.impls.j r0 = r1.j
            if (r0 == 0) goto L7
            r0.ae(r2)
        L7:
            return
    }

    public void r(int r2, boolean r3) {
            r1 = this;
            com.ss.android.socialbase.downloader.impls.j r0 = r1.j
            if (r0 == 0) goto L7
            r0.cw(r2, r3)
        L7:
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void startService() {
            r0 = this;
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public com.ss.android.socialbase.downloader.ae.cw tl(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.impls.j r0 = r1.j
            if (r0 == 0) goto L9
            com.ss.android.socialbase.downloader.ae.cw r2 = r0.r(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public long up(int r6) {
            r5 = this;
            com.ss.android.socialbase.downloader.downloader.vl r0 = r5.xt
            r1 = 0
            if (r0 != 0) goto L7
            return r1
        L7:
            com.ss.android.socialbase.downloader.ae.cw r0 = r0.xt(r6)
            if (r0 != 0) goto Le
            return r1
        Le:
            int r3 = r0.kj()
            r4 = 1
            if (r3 > r4) goto L1a
            long r0 = r0.uq()
            return r0
        L1a:
            com.ss.android.socialbase.downloader.downloader.vl r0 = r5.xt
            java.util.List r6 = r0.cw(r6)
            if (r6 == 0) goto L2e
            int r0 = r6.size()
            if (r0 == r3) goto L29
            goto L2e
        L29:
            long r0 = com.ss.android.socialbase.downloader.az.m.xt(r6)
            return r0
        L2e:
            return r1
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public java.util.List<com.ss.android.socialbase.downloader.ae.cw> up(java.lang.String r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.impls.j r0 = r1.j
            if (r0 == 0) goto L9
            java.util.List r2 = r0.xt(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public boolean up() {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.vl r0 = r1.xt
            boolean r0 = r0.r()
            return r0
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public boolean vl(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.impls.j r0 = r1.j
            if (r0 == 0) goto L9
            boolean r2 = r0.qv(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public com.ss.android.socialbase.downloader.r.wq w(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.impls.j r0 = r1.j
            if (r0 == 0) goto L9
            com.ss.android.socialbase.downloader.r.wq r2 = r0.tl(r2)
            goto La
        L9:
            r2 = 0
        La:
            if (r2 != 0) goto L10
            com.ss.android.socialbase.downloader.r.wq r2 = com.ss.android.socialbase.downloader.downloader.cw.ed()
        L10:
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public boolean ws(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.vl r0 = r1.xt
            boolean r2 = r0.up(r2)
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public com.ss.android.socialbase.downloader.ae.cw xt(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            int r1 = com.ss.android.socialbase.downloader.downloader.cw.j(r1, r2)
            com.ss.android.socialbase.downloader.ae.cw r1 = r0.tl(r1)
            return r1
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public java.util.List<com.ss.android.socialbase.downloader.ae.cw> xt(java.lang.String r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.vl r0 = r1.xt
            if (r0 == 0) goto L9
            java.util.List r2 = r0.xt(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void xt(int r7, int r8, com.ss.android.socialbase.downloader.r.a r9, com.ss.android.socialbase.downloader.xt.tl r10, boolean r11) {
            r6 = this;
            com.ss.android.socialbase.downloader.impls.j r0 = r6.j
            if (r0 == 0) goto Lc
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.j(r1, r2, r3, r4, r5)
        Lc:
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void xt(int r2, java.util.List<com.ss.android.socialbase.downloader.ae.xt> r3) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.vl r0 = r1.xt
            r0.xt(r2, r3)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void xt(int r2, boolean r3) {
            r1 = this;
            com.ss.android.socialbase.downloader.impls.j r0 = r1.j
            if (r0 == 0) goto L7
            r0.xt(r2, r3)
        L7:
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void xt(com.ss.android.socialbase.downloader.ae.cw r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.vl r0 = r1.xt
            r0.xt(r2)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void xt(com.ss.android.socialbase.downloader.ae.r r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.i r0 = r1.cw
            if (r0 == 0) goto L7
            r0.cw(r2)
        L7:
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public void xt(java.util.List<java.lang.String> r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.impls.j r0 = r1.j
            if (r0 == 0) goto L7
            r0.xt(r2)
        L7:
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public boolean xt() {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.i r0 = r1.cw
            if (r0 == 0) goto L9
            boolean r0 = r0.xt()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.ss.android.socialbase.downloader.downloader.az
    public boolean xt(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.impls.j r0 = r1.j
            if (r0 == 0) goto L9
            boolean r2 = r0.ws(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }
}
