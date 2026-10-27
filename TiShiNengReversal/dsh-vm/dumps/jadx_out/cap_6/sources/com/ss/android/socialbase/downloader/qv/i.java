package com.ss.android.socialbase.downloader.qv;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class i {
    private boolean ae;
    final java.lang.String cw;
    private java.lang.String g;
    final java.lang.String j;
    private int m;
    private final java.util.concurrent.atomic.AtomicLong oq;
    final boolean r;
    private int tl;
    private final java.util.List<com.ss.android.socialbase.downloader.qv.jy> up;
    final java.lang.String xt;

    public i(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.up = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>()
            r1.oq = r0
            r1.j = r2
            r2 = 0
            r1.r = r2
            r1.xt = r3
            java.lang.String r2 = r1.j(r3)
            r1.cw = r2
            return
    }

    public i(java.lang.String r2, boolean r3) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.up = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>()
            r1.oq = r0
            r1.j = r2
            r1.r = r3
            r2 = 0
            r1.xt = r2
            r1.cw = r2
            return
    }

    private java.lang.String j(java.lang.String r3) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L1e
            java.lang.String r0 = "."
            int r0 = r3.lastIndexOf(r0)     // Catch: java.lang.Throwable -> L1a
            if (r0 <= 0) goto L1e
            int r1 = r3.length()     // Catch: java.lang.Throwable -> L1a
            if (r0 >= r1) goto L1e
            r1 = 0
            java.lang.String r3 = r3.substring(r1, r0)     // Catch: java.lang.Throwable -> L1a
            return r3
        L1a:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)
        L1e:
            r3 = 0
            return r3
    }

    private java.lang.String up() {
            r3 = this;
            java.lang.String r0 = r3.g
            if (r0 != 0) goto L2a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.j
            r0.append(r1)
            java.lang.String r1 = "_"
            r0.append(r1)
            java.lang.String r2 = r3.xt
            if (r2 != 0) goto L19
            java.lang.String r2 = ""
        L19:
            r0.append(r2)
            r0.append(r1)
            boolean r1 = r3.r
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.g = r0
        L2a:
            java.lang.String r0 = r3.g
            return r0
    }

    public synchronized void cw() {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            r1.ae = r0     // Catch: java.lang.Throwable -> L6
            monitor-exit(r1)
            return
        L6:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6
            throw r0
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof com.ss.android.socialbase.downloader.qv.i
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            java.lang.String r0 = r1.up()
            com.ss.android.socialbase.downloader.qv.i r2 = (com.ss.android.socialbase.downloader.qv.i) r2
            java.lang.String r2 = r2.up()
            boolean r2 = r0.equals(r2)
            return r2
    }

    public int hashCode() {
            r1 = this;
            int r0 = r1.tl
            if (r0 != 0) goto Le
            java.lang.String r0 = r1.up()
            int r0 = r0.hashCode()
            r1.tl = r0
        Le:
            int r0 = r1.tl
            return r0
    }

    public synchronized int j() {
            r1 = this;
            monitor-enter(r1)
            java.util.List<com.ss.android.socialbase.downloader.qv.jy> r0 = r1.up     // Catch: java.lang.Throwable -> L9
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    public void j(long r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r1.oq
            r0.addAndGet(r2)
            return
    }

    public synchronized void j(com.ss.android.socialbase.downloader.qv.jy r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.List<com.ss.android.socialbase.downloader.qv.jy> r0 = r1.up     // Catch: java.lang.Throwable -> L8
            r0.add(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r2
    }

    public synchronized boolean r() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.ae     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "UrlRecord{url='"
            r0.<init>(r1)
            java.lang.String r1 = r3.j
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r2 = ", ip='"
            r0.append(r2)
            java.lang.String r2 = r3.xt
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", ipFamily='"
            r0.append(r2)
            java.lang.String r2 = r3.cw
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = ", isMainUrl="
            r0.append(r1)
            boolean r1 = r3.r
            r0.append(r1)
            java.lang.String r1 = ", failedTimes="
            r0.append(r1)
            int r1 = r3.m
            r0.append(r1)
            java.lang.String r1 = ", isCurrentFailed="
            r0.append(r1)
            boolean r1 = r3.ae
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public synchronized void xt() {
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.m     // Catch: java.lang.Throwable -> Lb
            r1 = 1
            int r0 = r0 + r1
            r2.m = r0     // Catch: java.lang.Throwable -> Lb
            r2.ae = r1     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r2)
            return
        Lb:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lb
            throw r0
    }

    public synchronized void xt(com.ss.android.socialbase.downloader.qv.jy r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.List<com.ss.android.socialbase.downloader.qv.jy> r0 = r1.up     // Catch: java.lang.Throwable -> L8
            r0.remove(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            monitor-exit(r1)
            return
    }
}
