package com.ss.android.socialbase.downloader.oq;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class j implements com.ss.android.socialbase.downloader.oq.xt {
    private com.ss.android.socialbase.downloader.qv.j ae;
    private int av;
    private volatile java.util.concurrent.Future az;
    private final int cw;
    private com.ss.android.socialbase.downloader.qv.j g;
    private final java.lang.Runnable i;
    private final java.io.InputStream j;
    private volatile boolean jy;
    private com.ss.android.socialbase.downloader.qv.j m;
    private com.ss.android.socialbase.downloader.qv.j oq;
    private com.ss.android.socialbase.downloader.qv.j qv;
    private final java.lang.Object r;
    private com.ss.android.socialbase.downloader.qv.j tl;
    private final java.lang.Object up;
    private volatile boolean vl;
    private volatile java.lang.Throwable ws;
    private final int xt;


    public j(java.io.InputStream r2, int r3, int r4) throws java.lang.Throwable {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.r = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.up = r0
            com.ss.android.socialbase.downloader.oq.j$1 r0 = new com.ss.android.socialbase.downloader.oq.j$1
            r0.<init>(r1)
            r1.i = r0
            r1.j = r2
            r1.xt = r3
            if (r4 > 0) goto L20
            r4 = 1
            goto L26
        L20:
            r2 = 64
            if (r4 <= r2) goto L26
            r4 = 64
        L26:
            r1.cw = r4
            r1.cw()
            return
    }

    static /* synthetic */ java.lang.Object cw(com.ss.android.socialbase.downloader.oq.j r0) {
            java.lang.Object r0 = r0.up
            return r0
    }

    private void cw() throws java.lang.Throwable {
            r2 = this;
            java.util.concurrent.ExecutorService r0 = com.ss.android.socialbase.downloader.downloader.cw.av()
            java.lang.Runnable r1 = r2.i
            java.util.concurrent.Future r0 = r0.submit(r1)
            r2.az = r0
            return
    }

    private void cw(com.ss.android.socialbase.downloader.qv.j r3) {
            r2 = this;
            java.lang.Object r0 = r2.up
            monitor-enter(r0)
            com.ss.android.socialbase.downloader.qv.j r1 = r2.oq     // Catch: java.lang.Throwable -> L11
            if (r1 != 0) goto L13
            r2.oq = r3     // Catch: java.lang.Throwable -> L11
            r2.g = r3     // Catch: java.lang.Throwable -> L11
            java.lang.Object r3 = r2.up     // Catch: java.lang.Throwable -> L11
            r3.notify()     // Catch: java.lang.Throwable -> L11
            goto L17
        L11:
            r3 = move-exception
            goto L19
        L13:
            r1.r = r3     // Catch: java.lang.Throwable -> L11
            r2.oq = r3     // Catch: java.lang.Throwable -> L11
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r3
    }

    static /* synthetic */ com.ss.android.socialbase.downloader.qv.j j(com.ss.android.socialbase.downloader.oq.j r0) throws com.ss.android.socialbase.downloader.qv.av, java.lang.InterruptedException {
            com.ss.android.socialbase.downloader.qv.j r0 = r0.r()
            return r0
    }

    static /* synthetic */ java.lang.Throwable j(com.ss.android.socialbase.downloader.oq.j r0, java.lang.Throwable r1) {
            r0.ws = r1
            return r1
    }

    static /* synthetic */ void j(com.ss.android.socialbase.downloader.oq.j r0, com.ss.android.socialbase.downloader.qv.j r1) {
            r0.cw(r1)
            return
    }

    static /* synthetic */ boolean j(com.ss.android.socialbase.downloader.oq.j r0, boolean r1) {
            r0.jy = r1
            return r1
    }

    private void m() throws com.ss.android.socialbase.downloader.up.j {
            r3 = this;
            java.lang.Throwable r0 = r3.ws
            if (r0 == 0) goto L17
            boolean r1 = r0 instanceof com.ss.android.socialbase.downloader.qv.av
            if (r1 == 0) goto L12
            com.ss.android.socialbase.downloader.up.j r0 = new com.ss.android.socialbase.downloader.up.j
            r1 = 1068(0x42c, float:1.497E-42)
            java.lang.String r2 = "async reader closed!"
            r0.<init>(r1, r2)
            throw r0
        L12:
            java.lang.String r1 = "async_read"
            com.ss.android.socialbase.downloader.az.m.j(r0, r1)
        L17:
            com.ss.android.socialbase.downloader.up.j r0 = new com.ss.android.socialbase.downloader.up.j
            r1 = 1069(0x42d, float:1.498E-42)
            java.lang.String r2 = "async reader terminated!"
            r0.<init>(r1, r2)
            throw r0
    }

    private com.ss.android.socialbase.downloader.qv.j r() throws com.ss.android.socialbase.downloader.qv.av, java.lang.InterruptedException {
            r5 = this;
            com.ss.android.socialbase.downloader.qv.j r0 = r5.tl
            r1 = 0
            if (r0 == 0) goto L18
            boolean r2 = r5.vl
            if (r2 != 0) goto L10
            com.ss.android.socialbase.downloader.qv.j r2 = r0.r
            r5.tl = r2
            r0.r = r1
            return r0
        L10:
            com.ss.android.socialbase.downloader.qv.av r0 = new com.ss.android.socialbase.downloader.qv.av
            java.lang.String r1 = ""
            r0.<init>(r1)
            throw r0
        L18:
            java.lang.Object r0 = r5.r
            monitor-enter(r0)
            boolean r2 = r5.vl     // Catch: java.lang.Throwable -> L36
            if (r2 != 0) goto L5a
            com.ss.android.socialbase.downloader.qv.j r2 = r5.m     // Catch: java.lang.Throwable -> L36
            if (r2 != 0) goto L38
            int r3 = r5.av     // Catch: java.lang.Throwable -> L36
            int r4 = r5.cw     // Catch: java.lang.Throwable -> L36
            if (r3 >= r4) goto L38
            int r3 = r3 + 1
            r5.av = r3     // Catch: java.lang.Throwable -> L36
            com.ss.android.socialbase.downloader.qv.j r1 = new com.ss.android.socialbase.downloader.qv.j     // Catch: java.lang.Throwable -> L36
            int r2 = r5.xt     // Catch: java.lang.Throwable -> L36
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            return r1
        L36:
            r1 = move-exception
            goto L62
        L38:
            if (r2 != 0) goto L4e
            java.lang.Object r2 = r5.r     // Catch: java.lang.Throwable -> L36
            r2.wait()     // Catch: java.lang.Throwable -> L36
            boolean r2 = r5.vl     // Catch: java.lang.Throwable -> L36
            if (r2 != 0) goto L46
            com.ss.android.socialbase.downloader.qv.j r2 = r5.m     // Catch: java.lang.Throwable -> L36
            goto L38
        L46:
            com.ss.android.socialbase.downloader.qv.av r1 = new com.ss.android.socialbase.downloader.qv.av     // Catch: java.lang.Throwable -> L36
            java.lang.String r2 = ""
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L36
            throw r1     // Catch: java.lang.Throwable -> L36
        L4e:
            com.ss.android.socialbase.downloader.qv.j r3 = r2.r     // Catch: java.lang.Throwable -> L36
            r5.tl = r3     // Catch: java.lang.Throwable -> L36
            r5.ae = r1     // Catch: java.lang.Throwable -> L36
            r5.m = r1     // Catch: java.lang.Throwable -> L36
            r2.r = r1     // Catch: java.lang.Throwable -> L36
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            return r2
        L5a:
            com.ss.android.socialbase.downloader.qv.av r1 = new com.ss.android.socialbase.downloader.qv.av     // Catch: java.lang.Throwable -> L36
            java.lang.String r2 = ""
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L36
            throw r1     // Catch: java.lang.Throwable -> L36
        L62:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            throw r1
    }

    private com.ss.android.socialbase.downloader.qv.j up() throws com.ss.android.socialbase.downloader.up.j, java.lang.InterruptedException {
            r4 = this;
            com.ss.android.socialbase.downloader.qv.j r0 = r4.qv
            r1 = 0
            if (r0 == 0) goto Lc
            com.ss.android.socialbase.downloader.qv.j r2 = r0.r
            r4.qv = r2
            r0.r = r1
            return r0
        Lc:
            java.lang.Object r0 = r4.up
            monitor-enter(r0)
            com.ss.android.socialbase.downloader.qv.j r2 = r4.g     // Catch: java.lang.Throwable -> L1b
            if (r2 != 0) goto L26
        L13:
            boolean r2 = r4.jy     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L1d
            r4.m()     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r1 = move-exception
            goto L32
        L1d:
            java.lang.Object r2 = r4.up     // Catch: java.lang.Throwable -> L1b
            r2.wait()     // Catch: java.lang.Throwable -> L1b
            com.ss.android.socialbase.downloader.qv.j r2 = r4.g     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L13
        L26:
            com.ss.android.socialbase.downloader.qv.j r3 = r2.r     // Catch: java.lang.Throwable -> L1b
            r4.qv = r3     // Catch: java.lang.Throwable -> L1b
            r4.oq = r1     // Catch: java.lang.Throwable -> L1b
            r4.g = r1     // Catch: java.lang.Throwable -> L1b
            r2.r = r1     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return r2
        L32:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r1
    }

    static /* synthetic */ java.io.InputStream xt(com.ss.android.socialbase.downloader.oq.j r0) {
            java.io.InputStream r0 = r0.j
            return r0
    }

    private void xt(com.ss.android.socialbase.downloader.qv.j r3) {
            r2 = this;
            java.lang.Object r0 = r2.r
            monitor-enter(r0)
            com.ss.android.socialbase.downloader.qv.j r1 = r2.ae     // Catch: java.lang.Throwable -> L11
            if (r1 != 0) goto L13
            r2.ae = r3     // Catch: java.lang.Throwable -> L11
            r2.m = r3     // Catch: java.lang.Throwable -> L11
            java.lang.Object r3 = r2.r     // Catch: java.lang.Throwable -> L11
            r3.notify()     // Catch: java.lang.Throwable -> L11
            goto L17
        L11:
            r3 = move-exception
            goto L19
        L13:
            r1.r = r3     // Catch: java.lang.Throwable -> L11
            r2.ae = r3     // Catch: java.lang.Throwable -> L11
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r3
    }

    @Override // com.ss.android.socialbase.downloader.oq.xt
    public com.ss.android.socialbase.downloader.qv.j j() throws com.ss.android.socialbase.downloader.up.j, java.lang.InterruptedException {
            r1 = this;
            com.ss.android.socialbase.downloader.qv.j r0 = r1.up()
            return r0
    }

    @Override // com.ss.android.socialbase.downloader.oq.xt
    public void j(com.ss.android.socialbase.downloader.qv.j r1) {
            r0 = this;
            r0.xt(r1)
            return
    }

    @Override // com.ss.android.socialbase.downloader.oq.xt
    public void xt() {
            r3 = this;
            java.lang.Object r0 = r3.r
            monitor-enter(r0)
            r1 = 1
            r3.vl = r1     // Catch: java.lang.Throwable -> L17
            java.lang.Object r2 = r3.r     // Catch: java.lang.Throwable -> L17
            r2.notify()     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            java.util.concurrent.Future r0 = r3.az
            if (r0 == 0) goto L16
            r0.cancel(r1)     // Catch: java.lang.Throwable -> L13
        L13:
            r0 = 0
            r3.az = r0
        L16:
            return
        L17:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r1
    }
}
