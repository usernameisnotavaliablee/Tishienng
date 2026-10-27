package com.ss.android.socialbase.downloader.notification;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class j {
    private long ae;
    private long cw;
    private boolean g;
    protected android.app.Notification j;
    private int m;
    private long r;
    private int tl;
    private java.lang.String up;
    private int xt;

    public j(int r2, java.lang.String r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.m = r0
            r1.xt = r2
            r1.up = r3
            return
    }

    public synchronized void ae() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.tl     // Catch: java.lang.Throwable -> L9
            int r0 = r0 + 1
            r1.tl = r0     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return
        L9:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    public long cw() {
            r2 = this;
            long r0 = r2.r
            return r0
    }

    public int j() {
            r1 = this;
            int r0 = r1.xt
            return r0
    }

    public void j(int r2, com.ss.android.socialbase.downloader.up.j r3, boolean r4) {
            r1 = this;
            r0 = 0
            r1.j(r2, r3, r4, r0)
            return
    }

    public void j(int r1, com.ss.android.socialbase.downloader.up.j r2, boolean r3, boolean r4) {
            r0 = this;
            if (r4 != 0) goto L7
            int r4 = r0.m
            if (r4 != r1) goto L7
            return
        L7:
            r0.m = r1
            r0.j(r2, r3)
            return
    }

    public void j(long r1) {
            r0 = this;
            r0.cw = r1
            return
    }

    public void j(long r1, long r3) {
            r0 = this;
            r0.cw = r1
            r0.r = r3
            r1 = 4
            r0.m = r1
            r1 = 0
            r2 = 0
            r0.j(r1, r2)
            return
    }

    public void j(android.app.Notification r4) {
            r3 = this;
            int r0 = r3.xt
            if (r0 == 0) goto L12
            if (r4 != 0) goto L7
            goto L12
        L7:
            com.ss.android.socialbase.downloader.notification.xt r0 = com.ss.android.socialbase.downloader.notification.xt.j()
            int r1 = r3.xt
            int r2 = r3.m
            r0.j(r1, r2, r4)
        L12:
            return
    }

    public void j(com.ss.android.socialbase.downloader.ae.cw r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            int r0 = r2.ae()
            r1.xt = r0
            java.lang.String r2 = r2.g()
            r1.up = r2
            return
    }

    public abstract void j(com.ss.android.socialbase.downloader.up.j r1, boolean r2);

    public long m() {
            r5 = this;
            long r0 = r5.ae
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Le
            long r0 = java.lang.System.currentTimeMillis()
            r5.ae = r0
        Le:
            long r0 = r5.ae
            return r0
    }

    public java.lang.String r() {
            r1 = this;
            java.lang.String r0 = r1.up
            return r0
    }

    public boolean tl() {
            r1 = this;
            boolean r0 = r1.g
            return r0
    }

    public int up() {
            r1 = this;
            int r0 = r1.m
            return r0
    }

    public long xt() {
            r2 = this;
            long r0 = r2.cw
            return r0
    }

    public void xt(long r1) {
            r0 = this;
            r0.r = r1
            return
    }
}
