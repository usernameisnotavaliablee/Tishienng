package com.ss.android.socialbase.downloader.ae;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class r {
    private final android.util.SparseArray<com.ss.android.socialbase.downloader.r.a> ae;
    private com.ss.android.socialbase.downloader.downloader.kt av;
    private com.ss.android.socialbase.downloader.r.mi az;
    private com.ss.android.socialbase.downloader.downloader.oq cw;
    private boolean f;
    private com.ss.android.socialbase.downloader.r.h g;
    private com.ss.android.socialbase.downloader.r.wq i;
    private com.ss.android.socialbase.downloader.ae.cw j;
    private com.ss.android.socialbase.downloader.ae.cw.j jy;
    private final java.util.List<com.ss.android.socialbase.downloader.r.ws> kt;
    private final android.util.SparseArray<com.ss.android.socialbase.downloader.r.a> m;
    private com.ss.android.socialbase.downloader.r.tj mi;
    private com.ss.android.socialbase.downloader.r.s oq;
    private com.ss.android.socialbase.downloader.r.az qv;
    private final java.util.Map<com.ss.android.socialbase.downloader.xt.tl, com.ss.android.socialbase.downloader.r.a> r;
    private int tj;
    private final android.util.SparseArray<com.ss.android.socialbase.downloader.r.a> tl;
    private final android.util.SparseArray<com.ss.android.socialbase.downloader.xt.tl> up;
    private com.ss.android.socialbase.downloader.r.l vl;
    private boolean w;
    private com.ss.android.socialbase.downloader.r.ch ws;
    private com.ss.android.socialbase.downloader.downloader.g xt;


    public r() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.r = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1.up = r0
            r0 = 0
            r1.w = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.kt = r0
            r0 = 1
            r1.f = r0
            com.ss.android.socialbase.downloader.ae.cw$j r0 = new com.ss.android.socialbase.downloader.ae.cw$j
            r0.<init>()
            r1.jy = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1.m = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1.ae = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1.tl = r0
            return
    }

    public r(com.ss.android.socialbase.downloader.ae.cw r1) {
            r0 = this;
            r0.<init>()
            r0.j = r1
            return
    }

    private void cw(android.util.SparseArray r4, android.util.SparseArray r5) {
            r3 = this;
            if (r4 == 0) goto L16
            if (r5 != 0) goto L5
            goto L16
        L5:
            int r0 = r5.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L16
            int r2 = r5.keyAt(r1)
            r4.remove(r2)
            int r1 = r1 + 1
            goto La
        L16:
            return
    }

    private void f() {
            r5 = this;
            com.ss.android.socialbase.downloader.ae.cw r0 = r5.j
            long r0 = r0.sh()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L14
            com.ss.android.socialbase.downloader.ae.r$1 r0 = new com.ss.android.socialbase.downloader.ae.r$1
            r0.<init>(r5)
            r5.j(r0)
        L14:
            return
    }

    private void j(android.util.SparseArray<com.ss.android.socialbase.downloader.r.a> r4, android.util.SparseArray<com.ss.android.socialbase.downloader.r.a> r5) {
            r3 = this;
            r4.clear()
            r0 = 0
        L4:
            int r1 = r5.size()
            if (r0 >= r1) goto L1c
            int r1 = r5.keyAt(r0)
            java.lang.Object r2 = r5.get(r1)
            com.ss.android.socialbase.downloader.r.a r2 = (com.ss.android.socialbase.downloader.r.a) r2
            if (r2 == 0) goto L19
            r4.put(r1, r2)
        L19:
            int r0 = r0 + 1
            goto L4
        L1c:
            return
    }

    private void r(com.ss.android.socialbase.downloader.xt.tl r7) {
            r6 = this;
            android.util.SparseArray r0 = r6.j(r7)
            monitor-enter(r0)
            r1 = 0
            r2 = 0
        L7:
            int r3 = r0.size()     // Catch: java.lang.Throwable -> L25
            if (r2 >= r3) goto L2a
            int r3 = r0.keyAt(r2)     // Catch: java.lang.Throwable -> L25
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Throwable -> L25
            com.ss.android.socialbase.downloader.r.a r3 = (com.ss.android.socialbase.downloader.r.a) r3     // Catch: java.lang.Throwable -> L25
            if (r3 == 0) goto L27
            com.ss.android.socialbase.downloader.downloader.r r4 = com.ss.android.socialbase.downloader.downloader.r.j()     // Catch: java.lang.Throwable -> L25
            int r5 = r6.i()     // Catch: java.lang.Throwable -> L25
            r4.xt(r5, r3, r7, r1)     // Catch: java.lang.Throwable -> L25
            goto L27
        L25:
            r7 = move-exception
            goto L2c
        L27:
            int r2 = r2 + 1
            goto L7
        L2a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            return
        L2c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            throw r7
    }

    private void xt(android.util.SparseArray r5, android.util.SparseArray r6) {
            r4 = this;
            if (r5 == 0) goto L1a
            if (r6 != 0) goto L5
            goto L1a
        L5:
            int r0 = r5.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L1a
            int r2 = r5.keyAt(r1)
            java.lang.Object r3 = r5.get(r2)
            r6.put(r2, r3)
            int r1 = r1 + 1
            goto La
        L1a:
            return
    }

    public com.ss.android.socialbase.downloader.ae.r ae(java.lang.String r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.ae.cw$j r0 = r1.jy
            r0.tl(r2)
            return r1
    }

    public com.ss.android.socialbase.downloader.ae.r ae(boolean r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.ae.cw$j r0 = r1.jy
            r0.m(r2)
            return r1
    }

    public com.ss.android.socialbase.downloader.downloader.kt ae() {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.kt r0 = r1.av
            return r0
    }

    public int av() {
            r3 = this;
            com.ss.android.socialbase.downloader.ae.cw$j r0 = r3.jy
            com.ss.android.socialbase.downloader.ae.cw r0 = r0.j()
            r3.j = r0
            com.ss.android.socialbase.downloader.downloader.vl r0 = com.ss.android.socialbase.downloader.downloader.cw.x()
            com.ss.android.socialbase.downloader.ae.cw r1 = r3.j
            int r1 = r1.ae()
            com.ss.android.socialbase.downloader.ae.cw r0 = r0.xt(r1)
            r1 = 0
            if (r0 != 0) goto L23
            com.ss.android.socialbase.downloader.ae.cw r0 = r3.j
            r0.om()
            r0 = 0
            com.ss.android.socialbase.downloader.tl.j.j(r3, r0, r1)
            goto L28
        L23:
            com.ss.android.socialbase.downloader.ae.cw r2 = r3.j
            r2.j(r0)
        L28:
            r3.f()
            com.ss.android.socialbase.downloader.downloader.r r0 = com.ss.android.socialbase.downloader.downloader.r.j()
            r0.j(r3)
            com.ss.android.socialbase.downloader.ae.cw r0 = r3.j
            if (r0 != 0) goto L37
            return r1
        L37:
            int r0 = r0.ae()
            return r0
    }

    public com.ss.android.socialbase.downloader.ae.r av(boolean r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.ae.cw$j r0 = r1.jy
            r0.az(r2)
            return r1
    }

    public com.ss.android.socialbase.downloader.ae.r az(boolean r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.ae.cw$j r0 = r1.jy
            r0.ws(r2)
            return r1
    }

    public boolean az() {
            r1 = this;
            com.ss.android.socialbase.downloader.ae.cw r0 = r1.j
            if (r0 == 0) goto L9
            boolean r0 = r0.oy()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public com.ss.android.socialbase.downloader.ae.r cw(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.ae.cw$j r0 = r1.jy
            r0.cw(r2)
            return r1
    }

    public com.ss.android.socialbase.downloader.ae.r cw(int r3, com.ss.android.socialbase.downloader.r.a r4) {
            r2 = this;
            if (r4 == 0) goto L22
            android.util.SparseArray<com.ss.android.socialbase.downloader.r.a> r0 = r2.tl
            monitor-enter(r0)
            android.util.SparseArray<com.ss.android.socialbase.downloader.r.a> r1 = r2.tl     // Catch: java.lang.Throwable -> L1f
            r1.put(r3, r4)     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            java.util.Map<com.ss.android.socialbase.downloader.xt.tl, com.ss.android.socialbase.downloader.r.a> r0 = r2.r
            com.ss.android.socialbase.downloader.xt.tl r1 = com.ss.android.socialbase.downloader.xt.tl.cw
            r0.put(r1, r4)
            android.util.SparseArray<com.ss.android.socialbase.downloader.xt.tl> r4 = r2.up
            monitor-enter(r4)
            android.util.SparseArray<com.ss.android.socialbase.downloader.xt.tl> r0 = r2.up     // Catch: java.lang.Throwable -> L1c
            r0.put(r3, r1)     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1c
            return r2
        L1c:
            r3 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1c
            throw r3
        L1f:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            throw r3
        L22:
            return r2
    }

    public com.ss.android.socialbase.downloader.ae.r cw(java.lang.String r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.ae.cw$j r0 = r1.jy
            r0.cw(r2)
            return r1
    }

    public com.ss.android.socialbase.downloader.ae.r cw(java.util.List<com.ss.android.socialbase.downloader.r.ws> r2) {
            r1 = this;
            if (r2 == 0) goto L1c
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L1c
            java.util.Iterator r2 = r2.iterator()
        Lc:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1c
            java.lang.Object r0 = r2.next()
            com.ss.android.socialbase.downloader.r.ws r0 = (com.ss.android.socialbase.downloader.r.ws) r0
            r1.j(r0)
            goto Lc
        L1c:
            return r1
    }

    public com.ss.android.socialbase.downloader.ae.r cw(boolean r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.ae.cw$j r0 = r1.jy
            r0.xt(r2)
            return r1
    }

    public com.ss.android.socialbase.downloader.r.a cw(com.ss.android.socialbase.downloader.xt.tl r2) {
            r1 = this;
            java.util.Map<com.ss.android.socialbase.downloader.xt.tl, com.ss.android.socialbase.downloader.r.a> r0 = r1.r
            java.lang.Object r2 = r0.get(r2)
            com.ss.android.socialbase.downloader.r.a r2 = (com.ss.android.socialbase.downloader.r.a) r2
            return r2
    }

    public com.ss.android.socialbase.downloader.r.s cw() {
            r1 = this;
            com.ss.android.socialbase.downloader.r.s r0 = r1.oq
            return r0
    }

    public com.ss.android.socialbase.downloader.ae.r g(java.lang.String r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.ae.cw$j r0 = r1.jy
            r0.oq(r2)
            return r1
    }

    public com.ss.android.socialbase.downloader.ae.r g(boolean r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.ae.cw$j r0 = r1.jy
            r0.ae(r2)
            return r1
    }

    public com.ss.android.socialbase.downloader.r.mi g() {
            r1 = this;
            com.ss.android.socialbase.downloader.r.mi r0 = r1.az
            return r0
    }

    public int i() {
            r1 = this;
            com.ss.android.socialbase.downloader.ae.cw r0 = r1.j
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.ae()
            return r0
    }

    public com.ss.android.socialbase.downloader.ae.r i(boolean r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.ae.cw$j r0 = r1.jy
            r0.av(r2)
            return r1
    }

    public android.util.SparseArray<com.ss.android.socialbase.downloader.r.a> j(com.ss.android.socialbase.downloader.xt.tl r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.xt.tl r0 = com.ss.android.socialbase.downloader.xt.tl.j
            if (r2 != r0) goto L7
            android.util.SparseArray<com.ss.android.socialbase.downloader.r.a> r2 = r1.m
            return r2
        L7:
            com.ss.android.socialbase.downloader.xt.tl r0 = com.ss.android.socialbase.downloader.xt.tl.xt
            if (r2 != r0) goto Le
            android.util.SparseArray<com.ss.android.socialbase.downloader.r.a> r2 = r1.ae
            return r2
        Le:
            com.ss.android.socialbase.downloader.xt.tl r0 = com.ss.android.socialbase.downloader.xt.tl.cw
            if (r2 != r0) goto L15
            android.util.SparseArray<com.ss.android.socialbase.downloader.r.a> r2 = r1.tl
            return r2
        L15:
            r2 = 0
            return r2
    }

    public com.ss.android.socialbase.downloader.ae.cw j() {
            r1 = this;
            com.ss.android.socialbase.downloader.ae.cw r0 = r1.j
            return r0
    }

    public com.ss.android.socialbase.downloader.ae.r j(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.ae.cw$j r0 = r1.jy
            r0.j(r2)
            return r1
    }

    public com.ss.android.socialbase.downloader.ae.r j(int r3, com.ss.android.socialbase.downloader.r.a r4) {
            r2 = this;
            if (r4 == 0) goto L22
            android.util.SparseArray<com.ss.android.socialbase.downloader.r.a> r0 = r2.m
            monitor-enter(r0)
            android.util.SparseArray<com.ss.android.socialbase.downloader.r.a> r1 = r2.m     // Catch: java.lang.Throwable -> L1f
            r1.put(r3, r4)     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            java.util.Map<com.ss.android.socialbase.downloader.xt.tl, com.ss.android.socialbase.downloader.r.a> r0 = r2.r
            com.ss.android.socialbase.downloader.xt.tl r1 = com.ss.android.socialbase.downloader.xt.tl.j
            r0.put(r1, r4)
            android.util.SparseArray<com.ss.android.socialbase.downloader.xt.tl> r4 = r2.up
            monitor-enter(r4)
            android.util.SparseArray<com.ss.android.socialbase.downloader.xt.tl> r0 = r2.up     // Catch: java.lang.Throwable -> L1c
            r0.put(r3, r1)     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1c
            return r2
        L1c:
            r3 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1c
            throw r3
        L1f:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            throw r3
        L22:
            return r2
    }

    public com.ss.android.socialbase.downloader.ae.r j(long r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.ae.cw$j r0 = r1.jy
            r0.j(r2)
            return r1
    }

    public com.ss.android.socialbase.downloader.ae.r j(com.ss.android.socialbase.downloader.downloader.g r1) {
            r0 = this;
            r0.xt = r1
            return r0
    }

    public com.ss.android.socialbase.downloader.ae.r j(com.ss.android.socialbase.downloader.downloader.kt r1) {
            r0 = this;
            r0.av = r1
            return r0
    }

    public com.ss.android.socialbase.downloader.ae.r j(com.ss.android.socialbase.downloader.downloader.oq r1) {
            r0 = this;
            r0.cw = r1
            return r0
    }

    public com.ss.android.socialbase.downloader.ae.r j(com.ss.android.socialbase.downloader.r.a r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return r1
        L3:
            int r0 = r2.hashCode()
            com.ss.android.socialbase.downloader.ae.r r2 = r1.j(r0, r2)
            return r2
    }

    public com.ss.android.socialbase.downloader.ae.r j(com.ss.android.socialbase.downloader.r.az r1) {
            r0 = this;
            r0.qv = r1
            return r0
    }

    public com.ss.android.socialbase.downloader.ae.r j(com.ss.android.socialbase.downloader.r.ch r1) {
            r0 = this;
            r0.ws = r1
            return r0
    }

    public com.ss.android.socialbase.downloader.ae.r j(com.ss.android.socialbase.downloader.r.h r1) {
            r0 = this;
            r0.g = r1
            return r0
    }

    public com.ss.android.socialbase.downloader.ae.r j(com.ss.android.socialbase.downloader.r.l r1) {
            r0 = this;
            r0.vl = r1
            return r0
    }

    public com.ss.android.socialbase.downloader.ae.r j(com.ss.android.socialbase.downloader.r.mi r1) {
            r0 = this;
            r0.az = r1
            return r0
    }

    public com.ss.android.socialbase.downloader.ae.r j(com.ss.android.socialbase.downloader.r.s r1) {
            r0 = this;
            r0.oq = r1
            return r0
    }

    public com.ss.android.socialbase.downloader.ae.r j(com.ss.android.socialbase.downloader.r.tj r1) {
            r0 = this;
            r0.mi = r1
            return r0
    }

    public com.ss.android.socialbase.downloader.ae.r j(com.ss.android.socialbase.downloader.r.wq r1) {
            r0 = this;
            r0.i = r1
            return r0
    }

    public com.ss.android.socialbase.downloader.ae.r j(com.ss.android.socialbase.downloader.r.ws r3) {
            r2 = this;
            java.util.List<com.ss.android.socialbase.downloader.r.ws> r0 = r2.kt
            monitor-enter(r0)
            if (r3 == 0) goto L17
            java.util.List<com.ss.android.socialbase.downloader.r.ws> r1 = r2.kt     // Catch: java.lang.Throwable -> L15
            boolean r1 = r1.contains(r3)     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto Le
            goto L17
        Le:
            java.util.List<com.ss.android.socialbase.downloader.r.ws> r1 = r2.kt     // Catch: java.lang.Throwable -> L15
            r1.add(r3)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return r2
        L15:
            r3 = move-exception
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return r2
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r3
    }

    public com.ss.android.socialbase.downloader.ae.r j(com.ss.android.socialbase.downloader.xt.ae r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.ae.cw$j r0 = r1.jy
            r0.j(r2)
            return r1
    }

    public com.ss.android.socialbase.downloader.ae.r j(java.lang.String r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.ae.cw$j r0 = r1.jy
            r0.j(r2)
            return r1
    }

    public com.ss.android.socialbase.downloader.ae.r j(java.util.List<com.ss.android.socialbase.downloader.ae.up> r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.ae.cw$j r0 = r1.jy
            r0.j(r2)
            return r1
    }

    public com.ss.android.socialbase.downloader.ae.r j(org.json.JSONObject r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.ae.cw$j r0 = r1.jy
            r0.j(r2)
            return r1
    }

    public com.ss.android.socialbase.downloader.ae.r j(int[] r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.ae.cw$j r0 = r1.jy
            r0.j(r2)
            return r1
    }

    public com.ss.android.socialbase.downloader.r.a j(com.ss.android.socialbase.downloader.xt.tl r3, int r4) {
            r2 = this;
            android.util.SparseArray r3 = r2.j(r3)
            r0 = 0
            if (r3 == 0) goto L23
            if (r4 >= 0) goto La
            goto L23
        La:
            monitor-enter(r3)
            int r1 = r3.size()     // Catch: java.lang.Throwable -> L1d
            if (r4 >= r1) goto L1f
            int r4 = r3.keyAt(r4)     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r4 = r3.get(r4)     // Catch: java.lang.Throwable -> L1d
            com.ss.android.socialbase.downloader.r.a r4 = (com.ss.android.socialbase.downloader.r.a) r4     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            return r4
        L1d:
            r4 = move-exception
            goto L21
        L1f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            return r0
        L21:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            throw r4
        L23:
            return r0
    }

    public void j(int r2, com.ss.android.socialbase.downloader.r.a r3, com.ss.android.socialbase.downloader.xt.tl r4, boolean r5) {
            r1 = this;
            android.util.SparseArray r0 = r1.j(r4)
            if (r0 != 0) goto L16
            if (r5 == 0) goto L15
            java.util.Map<com.ss.android.socialbase.downloader.xt.tl, com.ss.android.socialbase.downloader.r.a> r2 = r1.r
            boolean r2 = r2.containsKey(r4)
            if (r2 == 0) goto L15
            java.util.Map<com.ss.android.socialbase.downloader.xt.tl, com.ss.android.socialbase.downloader.r.a> r2 = r1.r
            r2.remove(r4)
        L15:
            return
        L16:
            monitor-enter(r0)
            if (r5 == 0) goto L44
            java.util.Map<com.ss.android.socialbase.downloader.xt.tl, com.ss.android.socialbase.downloader.r.a> r2 = r1.r     // Catch: java.lang.Throwable -> L30
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L32
            java.util.Map<com.ss.android.socialbase.downloader.xt.tl, com.ss.android.socialbase.downloader.r.a> r2 = r1.r     // Catch: java.lang.Throwable -> L30
            java.lang.Object r2 = r2.get(r4)     // Catch: java.lang.Throwable -> L30
            r3 = r2
            com.ss.android.socialbase.downloader.r.a r3 = (com.ss.android.socialbase.downloader.r.a) r3     // Catch: java.lang.Throwable -> L30
            java.util.Map<com.ss.android.socialbase.downloader.xt.tl, com.ss.android.socialbase.downloader.r.a> r2 = r1.r     // Catch: java.lang.Throwable -> L30
            r2.remove(r4)     // Catch: java.lang.Throwable -> L30
            goto L32
        L30:
            r2 = move-exception
            goto L6e
        L32:
            if (r3 == 0) goto L6a
            int r2 = r0.indexOfValue(r3)     // Catch: java.lang.Throwable -> L30
            if (r2 < 0) goto L6a
            int r3 = r0.size()     // Catch: java.lang.Throwable -> L30
            if (r2 >= r3) goto L6a
            r0.removeAt(r2)     // Catch: java.lang.Throwable -> L30
            goto L6a
        L44:
            r0.remove(r2)     // Catch: java.lang.Throwable -> L30
            android.util.SparseArray<com.ss.android.socialbase.downloader.xt.tl> r3 = r1.up     // Catch: java.lang.Throwable -> L30
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L30
            android.util.SparseArray<com.ss.android.socialbase.downloader.xt.tl> r4 = r1.up     // Catch: java.lang.Throwable -> L67
            java.lang.Object r4 = r4.get(r2)     // Catch: java.lang.Throwable -> L67
            com.ss.android.socialbase.downloader.xt.tl r4 = (com.ss.android.socialbase.downloader.xt.tl) r4     // Catch: java.lang.Throwable -> L67
            if (r4 == 0) goto L69
            java.util.Map<com.ss.android.socialbase.downloader.xt.tl, com.ss.android.socialbase.downloader.r.a> r5 = r1.r     // Catch: java.lang.Throwable -> L67
            boolean r5 = r5.containsKey(r4)     // Catch: java.lang.Throwable -> L67
            if (r5 == 0) goto L69
            java.util.Map<com.ss.android.socialbase.downloader.xt.tl, com.ss.android.socialbase.downloader.r.a> r5 = r1.r     // Catch: java.lang.Throwable -> L67
            r5.remove(r4)     // Catch: java.lang.Throwable -> L67
            android.util.SparseArray<com.ss.android.socialbase.downloader.xt.tl> r4 = r1.up     // Catch: java.lang.Throwable -> L67
            r4.remove(r2)     // Catch: java.lang.Throwable -> L67
            goto L69
        L67:
            r2 = move-exception
            goto L6c
        L69:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L67
        L6a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            return
        L6c:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L67
            throw r2     // Catch: java.lang.Throwable -> L30
        L6e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            throw r2
    }

    public void j(android.util.SparseArray<com.ss.android.socialbase.downloader.r.a> r2, com.ss.android.socialbase.downloader.xt.tl r3) {
            r1 = this;
            if (r2 != 0) goto L3
            goto L38
        L3:
            com.ss.android.socialbase.downloader.xt.tl r0 = com.ss.android.socialbase.downloader.xt.tl.j     // Catch: java.lang.Throwable -> L14
            if (r3 != r0) goto L16
            android.util.SparseArray<com.ss.android.socialbase.downloader.r.a> r3 = r1.m     // Catch: java.lang.Throwable -> L14
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L14
            android.util.SparseArray<com.ss.android.socialbase.downloader.r.a> r0 = r1.m     // Catch: java.lang.Throwable -> L11
            r1.j(r0, r2)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L11
            return
        L11:
            r2 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L11
            throw r2     // Catch: java.lang.Throwable -> L14
        L14:
            r2 = move-exception
            goto L39
        L16:
            com.ss.android.socialbase.downloader.xt.tl r0 = com.ss.android.socialbase.downloader.xt.tl.xt     // Catch: java.lang.Throwable -> L14
            if (r3 != r0) goto L27
            android.util.SparseArray<com.ss.android.socialbase.downloader.r.a> r3 = r1.ae     // Catch: java.lang.Throwable -> L14
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L14
            android.util.SparseArray<com.ss.android.socialbase.downloader.r.a> r0 = r1.ae     // Catch: java.lang.Throwable -> L24
            r1.j(r0, r2)     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            return
        L24:
            r2 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            throw r2     // Catch: java.lang.Throwable -> L14
        L27:
            com.ss.android.socialbase.downloader.xt.tl r0 = com.ss.android.socialbase.downloader.xt.tl.cw     // Catch: java.lang.Throwable -> L14
            if (r3 != r0) goto L38
            android.util.SparseArray<com.ss.android.socialbase.downloader.r.a> r3 = r1.tl     // Catch: java.lang.Throwable -> L14
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L14
            android.util.SparseArray<com.ss.android.socialbase.downloader.r.a> r0 = r1.tl     // Catch: java.lang.Throwable -> L35
            r1.j(r0, r2)     // Catch: java.lang.Throwable -> L35
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L35
            return
        L35:
            r2 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L35
            throw r2     // Catch: java.lang.Throwable -> L14
        L38:
            return
        L39:
            com.bytedance.sdk.component.utils.vl.j(r2)
            return
    }

    public void j(com.ss.android.socialbase.downloader.ae.r r5) {
            r4 = this;
            java.util.Map<com.ss.android.socialbase.downloader.xt.tl, com.ss.android.socialbase.downloader.r.a> r0 = r5.r
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L32
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            if (r1 == 0) goto La
            java.util.Map<com.ss.android.socialbase.downloader.xt.tl, com.ss.android.socialbase.downloader.r.a> r2 = r4.r
            java.lang.Object r3 = r1.getKey()
            boolean r2 = r2.containsKey(r3)
            if (r2 != 0) goto La
            java.util.Map<com.ss.android.socialbase.downloader.xt.tl, com.ss.android.socialbase.downloader.r.a> r2 = r4.r
            java.lang.Object r3 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            r2.put(r3, r1)
            goto La
        L32:
            android.util.SparseArray<com.ss.android.socialbase.downloader.r.a> r0 = r5.m     // Catch: java.lang.Throwable -> L50
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L50
            if (r0 == 0) goto L52
            android.util.SparseArray<com.ss.android.socialbase.downloader.r.a> r0 = r4.m     // Catch: java.lang.Throwable -> L50
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L50
            android.util.SparseArray<com.ss.android.socialbase.downloader.r.a> r1 = r4.m     // Catch: java.lang.Throwable -> L4d
            android.util.SparseArray<com.ss.android.socialbase.downloader.r.a> r2 = r5.m     // Catch: java.lang.Throwable -> L4d
            r4.cw(r1, r2)     // Catch: java.lang.Throwable -> L4d
            android.util.SparseArray<com.ss.android.socialbase.downloader.r.a> r1 = r5.m     // Catch: java.lang.Throwable -> L4d
            android.util.SparseArray<com.ss.android.socialbase.downloader.r.a> r2 = r4.m     // Catch: java.lang.Throwable -> L4d
            r4.xt(r1, r2)     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4d
            goto L52
        L4d:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4d
            throw r5     // Catch: java.lang.Throwable -> L50
        L50:
            r5 = move-exception
            goto L8f
        L52:
            android.util.SparseArray<com.ss.android.socialbase.downloader.r.a> r0 = r5.ae     // Catch: java.lang.Throwable -> L50
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L50
            if (r0 == 0) goto L70
            android.util.SparseArray<com.ss.android.socialbase.downloader.r.a> r0 = r4.ae     // Catch: java.lang.Throwable -> L50
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L50
            android.util.SparseArray<com.ss.android.socialbase.downloader.r.a> r1 = r4.ae     // Catch: java.lang.Throwable -> L6d
            android.util.SparseArray<com.ss.android.socialbase.downloader.r.a> r2 = r5.ae     // Catch: java.lang.Throwable -> L6d
            r4.cw(r1, r2)     // Catch: java.lang.Throwable -> L6d
            android.util.SparseArray<com.ss.android.socialbase.downloader.r.a> r1 = r5.ae     // Catch: java.lang.Throwable -> L6d
            android.util.SparseArray<com.ss.android.socialbase.downloader.r.a> r2 = r4.ae     // Catch: java.lang.Throwable -> L6d
            r4.xt(r1, r2)     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            goto L70
        L6d:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            throw r5     // Catch: java.lang.Throwable -> L50
        L70:
            android.util.SparseArray<com.ss.android.socialbase.downloader.r.a> r0 = r5.tl     // Catch: java.lang.Throwable -> L50
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L50
            if (r0 == 0) goto L8e
            android.util.SparseArray<com.ss.android.socialbase.downloader.r.a> r0 = r4.tl     // Catch: java.lang.Throwable -> L50
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L50
            android.util.SparseArray<com.ss.android.socialbase.downloader.r.a> r1 = r4.tl     // Catch: java.lang.Throwable -> L8b
            android.util.SparseArray<com.ss.android.socialbase.downloader.r.a> r2 = r5.tl     // Catch: java.lang.Throwable -> L8b
            r4.cw(r1, r2)     // Catch: java.lang.Throwable -> L8b
            android.util.SparseArray<com.ss.android.socialbase.downloader.r.a> r5 = r5.tl     // Catch: java.lang.Throwable -> L8b
            android.util.SparseArray<com.ss.android.socialbase.downloader.r.a> r1 = r4.tl     // Catch: java.lang.Throwable -> L8b
            r4.xt(r5, r1)     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8b
            return
        L8b:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8b
            throw r5     // Catch: java.lang.Throwable -> L50
        L8e:
            return
        L8f:
            com.bytedance.sdk.component.utils.vl.j(r5)
            return
    }

    public void j(boolean r1) {
            r0 = this;
            r0.w = r1
            return
    }

    public com.ss.android.socialbase.downloader.ae.r jy(boolean r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.ae.cw$j r0 = r1.jy
            r0.qv(r2)
            return r1
    }

    public boolean jy() {
            r1 = this;
            boolean r0 = r1.f
            return r0
    }

    public com.ss.android.socialbase.downloader.downloader.g kt() {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.g r0 = r1.xt
            return r0
    }

    public com.ss.android.socialbase.downloader.ae.r m(java.lang.String r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.ae.cw$j r0 = r1.jy
            r0.ae(r2)
            return r1
    }

    public com.ss.android.socialbase.downloader.ae.r m(boolean r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.ae.cw$j r0 = r1.jy
            r0.up(r2)
            return r1
    }

    public com.ss.android.socialbase.downloader.downloader.oq m() {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.oq r0 = r1.cw
            return r0
    }

    public com.ss.android.socialbase.downloader.r.ws m(int r3) {
            r2 = this;
            java.util.List<com.ss.android.socialbase.downloader.r.ws> r0 = r2.kt
            monitor-enter(r0)
            java.util.List<com.ss.android.socialbase.downloader.r.ws> r1 = r2.kt     // Catch: java.lang.Throwable -> L15
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L15
            if (r3 >= r1) goto L17
            java.util.List<com.ss.android.socialbase.downloader.r.ws> r1 = r2.kt     // Catch: java.lang.Throwable -> L15
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.Throwable -> L15
            com.ss.android.socialbase.downloader.r.ws r3 = (com.ss.android.socialbase.downloader.r.ws) r3     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return r3
        L15:
            r3 = move-exception
            goto L1a
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            r3 = 0
            return r3
        L1a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r3
    }

    public synchronized int mi() {
            r1 = this;
            monitor-enter(r1)
            com.ss.android.socialbase.downloader.xt.tl r0 = com.ss.android.socialbase.downloader.xt.tl.j     // Catch: java.lang.Throwable -> L10
            com.ss.android.socialbase.downloader.r.a r0 = r1.cw(r0)     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto L12
            com.ss.android.socialbase.downloader.xt.tl r0 = com.ss.android.socialbase.downloader.xt.tl.xt     // Catch: java.lang.Throwable -> L10
            com.ss.android.socialbase.downloader.r.a r0 = r1.cw(r0)     // Catch: java.lang.Throwable -> L10
            goto L12
        L10:
            r0 = move-exception
            goto L1e
        L12:
            if (r0 == 0) goto L1a
            int r0 = r0.hashCode()     // Catch: java.lang.Throwable -> L10
            r1.tj = r0     // Catch: java.lang.Throwable -> L10
        L1a:
            int r0 = r1.tj     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)
            return r0
        L1e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            throw r0
    }

    public com.ss.android.socialbase.downloader.ae.r oq(java.lang.String r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.ae.cw$j r0 = r1.jy
            r0.vl(r2)
            return r1
    }

    public com.ss.android.socialbase.downloader.ae.r oq(boolean r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.ae.cw$j r0 = r1.jy
            r0.oq(r2)
            return r1
    }

    public com.ss.android.socialbase.downloader.r.h oq() {
            r1 = this;
            com.ss.android.socialbase.downloader.r.h r0 = r1.g
            return r0
    }

    public com.ss.android.socialbase.downloader.ae.r qv(java.lang.String r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.ae.cw$j r0 = r1.jy
            r0.r(r2)
            return r1
    }

    public com.ss.android.socialbase.downloader.ae.r qv(boolean r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.ae.cw$j r0 = r1.jy
            r0.jy(r2)
            return r1
    }

    public com.ss.android.socialbase.downloader.r.wq qv() {
            r1 = this;
            com.ss.android.socialbase.downloader.r.wq r0 = r1.i
            return r0
    }

    public com.ss.android.socialbase.downloader.ae.r r(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.ae.cw$j r0 = r1.jy
            r0.r(r2)
            return r1
    }

    public com.ss.android.socialbase.downloader.ae.r r(java.lang.String r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.ae.cw$j r0 = r1.jy
            r0.up(r2)
            return r1
    }

    public com.ss.android.socialbase.downloader.ae.r r(boolean r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.ae.cw$j r0 = r1.jy
            r0.r(r2)
            return r1
    }

    public com.ss.android.socialbase.downloader.r.az r() {
            r1 = this;
            com.ss.android.socialbase.downloader.r.az r0 = r1.qv
            return r0
    }

    @androidx.annotation.NonNull
    public java.util.List<com.ss.android.socialbase.downloader.r.ws> tj() {
            r1 = this;
            java.util.List<com.ss.android.socialbase.downloader.r.ws> r0 = r1.kt
            return r0
    }

    public com.ss.android.socialbase.downloader.ae.r tl(java.lang.String r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.ae.cw$j r0 = r1.jy
            r0.g(r2)
            return r1
    }

    public com.ss.android.socialbase.downloader.ae.r tl(boolean r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.ae.cw$j r0 = r1.jy
            r0.g(r2)
            return r1
    }

    public com.ss.android.socialbase.downloader.r.ch tl() {
            r1 = this;
            com.ss.android.socialbase.downloader.r.ch r0 = r1.ws
            return r0
    }

    public com.ss.android.socialbase.downloader.ae.r up(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.ae.cw$j r0 = r1.jy
            r0.up(r2)
            return r1
    }

    public com.ss.android.socialbase.downloader.ae.r up(java.lang.String r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.ae.cw$j r0 = r1.jy
            r0.m(r2)
            return r1
    }

    public com.ss.android.socialbase.downloader.ae.r up(boolean r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.ae.cw$j r0 = r1.jy
            r0.cw(r2)
            return r1
    }

    public com.ss.android.socialbase.downloader.r.l up() {
            r1 = this;
            com.ss.android.socialbase.downloader.r.l r0 = r1.vl
            return r0
    }

    public int vl() {
            r1 = this;
            int r0 = r1.tj
            return r0
    }

    public com.ss.android.socialbase.downloader.ae.r vl(java.lang.String r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.ae.cw$j r0 = r1.jy
            r0.qv(r2)
            return r1
    }

    public com.ss.android.socialbase.downloader.ae.r vl(boolean r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.ae.cw$j r0 = r1.jy
            r0.tl(r2)
            return r1
    }

    public void w() {
            r5 = this;
            java.lang.String r0 = "DownloadTask"
            java.lang.String r1 = "same task just tryDownloading, so add listener in last task instead of tryDownload"
            com.ss.android.socialbase.downloader.m.j.xt(r0, r1)
            com.ss.android.socialbase.downloader.ae.cw r0 = r5.j
            if (r0 == 0) goto L17
            boolean r0 = r0.uc()
            if (r0 != 0) goto L17
            com.ss.android.socialbase.downloader.ae.cw r0 = r5.j
            r1 = 1
            r0.j(r1)
        L17:
            com.ss.android.socialbase.downloader.xt.tl r0 = com.ss.android.socialbase.downloader.xt.tl.j
            r5.r(r0)
            com.ss.android.socialbase.downloader.xt.tl r0 = com.ss.android.socialbase.downloader.xt.tl.xt
            r5.r(r0)
            com.ss.android.socialbase.downloader.r.l r0 = r5.vl
            com.ss.android.socialbase.downloader.ae.cw r1 = r5.j
            com.ss.android.socialbase.downloader.up.j r2 = new com.ss.android.socialbase.downloader.up.j
            r3 = 1003(0x3eb, float:1.406E-42)
            java.lang.String r4 = "has another same task, add Listener to old task"
            r2.<init>(r3, r4)
            r3 = 0
            com.ss.android.socialbase.downloader.tl.j.j(r0, r1, r2, r3)
            return
    }

    public com.ss.android.socialbase.downloader.ae.r ws(boolean r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.ae.cw$j r0 = r1.jy
            r0.vl(r2)
            return r1
    }

    public com.ss.android.socialbase.downloader.r.tj ws() {
            r1 = this;
            com.ss.android.socialbase.downloader.r.tj r0 = r1.mi
            return r0
    }

    public int xt(com.ss.android.socialbase.downloader.xt.tl r2) {
            r1 = this;
            android.util.SparseArray r2 = r1.j(r2)
            if (r2 != 0) goto L8
            r2 = 0
            return r2
        L8:
            monitor-enter(r2)
            int r0 = r2.size()     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lf
            return r0
        Lf:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lf
            throw r0
    }

    public com.ss.android.socialbase.downloader.ae.r xt(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.ae.cw$j r0 = r1.jy
            r0.xt(r2)
            return r1
    }

    public com.ss.android.socialbase.downloader.ae.r xt(int r3, com.ss.android.socialbase.downloader.r.a r4) {
            r2 = this;
            if (r4 == 0) goto L22
            android.util.SparseArray<com.ss.android.socialbase.downloader.r.a> r0 = r2.ae
            monitor-enter(r0)
            android.util.SparseArray<com.ss.android.socialbase.downloader.r.a> r1 = r2.ae     // Catch: java.lang.Throwable -> L1f
            r1.put(r3, r4)     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            java.util.Map<com.ss.android.socialbase.downloader.xt.tl, com.ss.android.socialbase.downloader.r.a> r0 = r2.r
            com.ss.android.socialbase.downloader.xt.tl r1 = com.ss.android.socialbase.downloader.xt.tl.xt
            r0.put(r1, r4)
            android.util.SparseArray<com.ss.android.socialbase.downloader.xt.tl> r4 = r2.up
            monitor-enter(r4)
            android.util.SparseArray<com.ss.android.socialbase.downloader.xt.tl> r0 = r2.up     // Catch: java.lang.Throwable -> L1c
            r0.put(r3, r1)     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1c
            return r2
        L1c:
            r3 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1c
            throw r3
        L1f:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            throw r3
        L22:
            return r2
    }

    public com.ss.android.socialbase.downloader.ae.r xt(long r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.ae.cw$j r0 = r1.jy
            r0.xt(r2)
            return r1
    }

    public com.ss.android.socialbase.downloader.ae.r xt(com.ss.android.socialbase.downloader.r.a r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return r1
        L3:
            int r0 = r2.hashCode()
            com.ss.android.socialbase.downloader.ae.r r2 = r1.cw(r0, r2)
            return r2
    }

    public com.ss.android.socialbase.downloader.ae.r xt(java.lang.String r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.ae.cw$j r0 = r1.jy
            r0.xt(r2)
            return r1
    }

    public com.ss.android.socialbase.downloader.ae.r xt(java.util.List<java.lang.String> r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.ae.cw$j r0 = r1.jy
            r0.xt(r2)
            return r1
    }

    public com.ss.android.socialbase.downloader.ae.r xt(boolean r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.ae.cw$j r0 = r1.jy
            r0.j(r2)
            return r1
    }

    public void xt(int r2, com.ss.android.socialbase.downloader.r.a r3, com.ss.android.socialbase.downloader.xt.tl r4, boolean r5) {
            r1 = this;
            if (r3 != 0) goto L3
            goto L1f
        L3:
            if (r5 == 0) goto L19
            java.util.Map<com.ss.android.socialbase.downloader.xt.tl, com.ss.android.socialbase.downloader.r.a> r5 = r1.r
            if (r5 == 0) goto L19
            r5.put(r4, r3)
            android.util.SparseArray<com.ss.android.socialbase.downloader.xt.tl> r5 = r1.up
            monitor-enter(r5)
            android.util.SparseArray<com.ss.android.socialbase.downloader.xt.tl> r0 = r1.up     // Catch: java.lang.Throwable -> L16
            r0.put(r2, r4)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L16
            goto L19
        L16:
            r2 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L16
            throw r2
        L19:
            android.util.SparseArray r4 = r1.j(r4)
            if (r4 != 0) goto L20
        L1f:
            return
        L20:
            monitor-enter(r4)
            r4.put(r2, r3)     // Catch: java.lang.Throwable -> L26
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L26
            return
        L26:
            r2 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L26
            throw r2
    }

    public void xt(com.ss.android.socialbase.downloader.r.h r1) {
            r0 = this;
            r0.g = r1
            return
    }

    public boolean xt() {
            r1 = this;
            boolean r0 = r1.w
            return r0
    }
}
