package com.ss.android.socialbase.downloader.g.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class cw implements com.ss.android.socialbase.downloader.g.ae {
    private static final java.util.ArrayList<java.lang.String> up = null;
    private int ae;
    protected java.util.List<com.ss.android.socialbase.downloader.ae.up> cw;
    private boolean g;
    protected final java.lang.String j;
    private java.util.Map<java.lang.String, java.lang.String> m;
    private boolean oq;
    private com.ss.android.socialbase.downloader.g.ae qv;
    protected final java.lang.Object r;
    private long tl;
    protected final long xt;

    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 6
            r0.<init>(r1)
            com.ss.android.socialbase.downloader.g.j.cw.up = r0
            java.lang.String r1 = "Content-Length"
            r0.add(r1)
            java.lang.String r1 = "Content-Range"
            r0.add(r1)
            java.lang.String r1 = "Transfer-Encoding"
            r0.add(r1)
            java.lang.String r1 = "Accept-Ranges"
            r0.add(r1)
            java.lang.String r1 = "Etag"
            r0.add(r1)
            java.lang.String r1 = "Content-Disposition"
            r0.add(r1)
            return
    }

    public cw(java.lang.String r2, java.util.List<com.ss.android.socialbase.downloader.ae.up> r3, long r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.m = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.r = r0
            r1.j = r2
            r1.cw = r3
            r1.xt = r4
            return
    }

    private void j(com.ss.android.socialbase.downloader.g.ae r4, java.util.Map<java.lang.String, java.lang.String> r5) {
            r3 = this;
            if (r4 == 0) goto L1f
            if (r5 != 0) goto L5
            goto L1f
        L5:
            java.util.ArrayList<java.lang.String> r0 = com.ss.android.socialbase.downloader.g.j.cw.up
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = r4.j(r1)
            r5.put(r1, r2)
            goto Lb
        L1f:
            return
    }

    public boolean ae() {
            r1 = this;
            boolean r0 = r1.oq
            return r0
    }

    @Override // com.ss.android.socialbase.downloader.g.ae
    public void cw() {
            r1 = this;
            com.ss.android.socialbase.downloader.g.ae r0 = r1.qv
            if (r0 == 0) goto L7
            r0.cw()
        L7:
            return
    }

    public java.util.Map<java.lang.String, java.lang.String> g() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.m
            return r0
    }

    @Override // com.ss.android.socialbase.downloader.g.ae
    public java.lang.String j(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.m
            if (r0 == 0) goto Lb
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            return r2
        Lb:
            com.ss.android.socialbase.downloader.g.ae r0 = r1.qv
            if (r0 == 0) goto L14
            java.lang.String r2 = r0.j(r2)
            return r2
        L14:
            r2 = 0
            return r2
    }

    public void j() throws java.lang.Exception {
            r5 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r5.m
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r1 = 0
            r5.oq = r0     // Catch: java.lang.Throwable -> L4a
            java.lang.String r0 = r5.j     // Catch: java.lang.Throwable -> L4a
            java.util.List<com.ss.android.socialbase.downloader.ae.up> r2 = r5.cw     // Catch: java.lang.Throwable -> L4a
            com.ss.android.socialbase.downloader.g.ae r0 = com.ss.android.socialbase.downloader.downloader.cw.j(r0, r2)     // Catch: java.lang.Throwable -> L4a
            r5.qv = r0     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r0 = r5.r
            monitor-enter(r0)
            com.ss.android.socialbase.downloader.g.ae r2 = r5.qv     // Catch: java.lang.Throwable -> L3d
            if (r2 == 0) goto L3f
            java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.Throwable -> L3d
            r2.<init>()     // Catch: java.lang.Throwable -> L3d
            r5.m = r2     // Catch: java.lang.Throwable -> L3d
            com.ss.android.socialbase.downloader.g.ae r3 = r5.qv     // Catch: java.lang.Throwable -> L3d
            r5.j(r3, r2)     // Catch: java.lang.Throwable -> L3d
            com.ss.android.socialbase.downloader.g.ae r2 = r5.qv     // Catch: java.lang.Throwable -> L3d
            int r2 = r2.xt()     // Catch: java.lang.Throwable -> L3d
            r5.ae = r2     // Catch: java.lang.Throwable -> L3d
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L3d
            r5.tl = r2     // Catch: java.lang.Throwable -> L3d
            int r2 = r5.ae     // Catch: java.lang.Throwable -> L3d
            boolean r2 = r5.j(r2)     // Catch: java.lang.Throwable -> L3d
            r5.g = r2     // Catch: java.lang.Throwable -> L3d
            goto L3f
        L3d:
            r1 = move-exception
            goto L48
        L3f:
            r5.oq = r1     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r1 = r5.r     // Catch: java.lang.Throwable -> L3d
            r1.notifyAll()     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3d
            return
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3d
            throw r1
        L4a:
            r0 = move-exception
            java.lang.Object r2 = r5.r
            monitor-enter(r2)
            com.ss.android.socialbase.downloader.g.ae r3 = r5.qv     // Catch: java.lang.Throwable -> L75
            if (r3 == 0) goto L77
            java.util.HashMap r3 = new java.util.HashMap     // Catch: java.lang.Throwable -> L75
            r3.<init>()     // Catch: java.lang.Throwable -> L75
            r5.m = r3     // Catch: java.lang.Throwable -> L75
            com.ss.android.socialbase.downloader.g.ae r4 = r5.qv     // Catch: java.lang.Throwable -> L75
            r5.j(r4, r3)     // Catch: java.lang.Throwable -> L75
            com.ss.android.socialbase.downloader.g.ae r3 = r5.qv     // Catch: java.lang.Throwable -> L75
            int r3 = r3.xt()     // Catch: java.lang.Throwable -> L75
            r5.ae = r3     // Catch: java.lang.Throwable -> L75
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L75
            r5.tl = r3     // Catch: java.lang.Throwable -> L75
            int r3 = r5.ae     // Catch: java.lang.Throwable -> L75
            boolean r3 = r5.j(r3)     // Catch: java.lang.Throwable -> L75
            r5.g = r3     // Catch: java.lang.Throwable -> L75
            goto L77
        L75:
            r0 = move-exception
            goto L80
        L77:
            r5.oq = r1     // Catch: java.lang.Throwable -> L75
            java.lang.Object r1 = r5.r     // Catch: java.lang.Throwable -> L75
            r1.notifyAll()     // Catch: java.lang.Throwable -> L75
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L75
            throw r0
        L80:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L75
            throw r0
    }

    public boolean j(int r2) {
            r1 = this;
            r0 = 200(0xc8, float:2.8E-43)
            if (r2 < r0) goto La
            r0 = 300(0x12c, float:4.2E-43)
            if (r2 >= r0) goto La
            r2 = 1
            return r2
        La:
            r2 = 0
            return r2
    }

    public boolean m() {
            r5 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r5.tl
            long r0 = r0 - r2
            long r2 = com.ss.android.socialbase.downloader.g.j.xt.xt
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto Lf
            r0 = 1
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public void r() throws java.lang.InterruptedException {
            r2 = this;
            java.lang.Object r0 = r2.r
            monitor-enter(r0)
            boolean r1 = r2.oq     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L13
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.m     // Catch: java.lang.Throwable -> L11
            if (r1 != 0) goto L13
            java.lang.Object r1 = r2.r     // Catch: java.lang.Throwable -> L11
            r1.wait()     // Catch: java.lang.Throwable -> L11
            goto L13
        L11:
            r1 = move-exception
            goto L15
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1
    }

    public java.util.List<com.ss.android.socialbase.downloader.ae.up> tl() {
            r1 = this;
            java.util.List<com.ss.android.socialbase.downloader.ae.up> r0 = r1.cw
            return r0
    }

    public boolean up() {
            r1 = this;
            boolean r0 = r1.g
            return r0
    }

    @Override // com.ss.android.socialbase.downloader.g.ae
    public int xt() throws java.io.IOException {
            r1 = this;
            int r0 = r1.ae
            return r0
    }
}
