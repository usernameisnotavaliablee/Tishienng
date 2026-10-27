package com.ss.android.socialbase.downloader.qv;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class xt implements com.ss.android.socialbase.downloader.qv.cw, com.ss.android.socialbase.downloader.qv.r, com.ss.android.socialbase.downloader.qv.up {
    private com.ss.android.socialbase.downloader.qv.j ae;
    private final java.lang.Object cw;
    private com.ss.android.socialbase.downloader.qv.j g;
    private final int j;
    private com.ss.android.socialbase.downloader.qv.j m;
    private volatile boolean oq;
    private int qv;
    private final java.lang.Object r;
    private com.ss.android.socialbase.downloader.qv.j tl;
    private com.ss.android.socialbase.downloader.qv.j up;
    private final int xt;

    xt(int r2, int r3) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.cw = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.r = r0
            r0 = 64
            if (r2 >= r0) goto L17
            r2 = 64
        L17:
            r0 = 8192(0x2000, float:1.148E-41)
            if (r3 >= r0) goto L1d
            r3 = 8192(0x2000, float:1.148E-41)
        L1d:
            r1.j = r2
            r1.xt = r3
            return
    }

    public void cw() {
            r2 = this;
            r0 = 1
            r2.oq = r0
            java.lang.Object r0 = r2.cw
            monitor-enter(r0)
            java.lang.Object r1 = r2.cw     // Catch: java.lang.Throwable -> L19
            r1.notifyAll()     // Catch: java.lang.Throwable -> L19
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            java.lang.Object r1 = r2.r
            monitor-enter(r1)
            java.lang.Object r0 = r2.r     // Catch: java.lang.Throwable -> L16
            r0.notifyAll()     // Catch: java.lang.Throwable -> L16
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
            return
        L16:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
            throw r0
        L19:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r1
    }

    @Override // com.ss.android.socialbase.downloader.qv.r
    @androidx.annotation.NonNull
    public com.ss.android.socialbase.downloader.qv.j j() throws com.ss.android.socialbase.downloader.qv.av, java.lang.InterruptedException {
            r4 = this;
            com.ss.android.socialbase.downloader.qv.j r0 = r4.g
            r1 = 0
            if (r0 == 0) goto Lc
            com.ss.android.socialbase.downloader.qv.j r2 = r0.r
            r4.g = r2
            r0.r = r1
            return r0
        Lc:
            java.lang.Object r0 = r4.r
            monitor-enter(r0)
            com.ss.android.socialbase.downloader.qv.j r2 = r4.ae     // Catch: java.lang.Throwable -> L1f
        L11:
            if (r2 != 0) goto L29
            boolean r2 = r4.oq     // Catch: java.lang.Throwable -> L1f
            if (r2 != 0) goto L21
            java.lang.Object r2 = r4.r     // Catch: java.lang.Throwable -> L1f
            r2.wait()     // Catch: java.lang.Throwable -> L1f
            com.ss.android.socialbase.downloader.qv.j r2 = r4.ae     // Catch: java.lang.Throwable -> L1f
            goto L11
        L1f:
            r1 = move-exception
            goto L35
        L21:
            com.ss.android.socialbase.downloader.qv.av r1 = new com.ss.android.socialbase.downloader.qv.av     // Catch: java.lang.Throwable -> L1f
            java.lang.String r2 = "read"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1f
            throw r1     // Catch: java.lang.Throwable -> L1f
        L29:
            com.ss.android.socialbase.downloader.qv.j r3 = r2.r     // Catch: java.lang.Throwable -> L1f
            r4.g = r3     // Catch: java.lang.Throwable -> L1f
            r4.tl = r1     // Catch: java.lang.Throwable -> L1f
            r4.ae = r1     // Catch: java.lang.Throwable -> L1f
            r2.r = r1     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            return r2
        L35:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            throw r1
    }

    @Override // com.ss.android.socialbase.downloader.qv.cw
    public void j(@androidx.annotation.NonNull com.ss.android.socialbase.downloader.qv.j r3) {
            r2 = this;
            java.lang.Object r0 = r2.cw
            monitor-enter(r0)
            com.ss.android.socialbase.downloader.qv.j r1 = r2.m     // Catch: java.lang.Throwable -> Lc
            if (r1 != 0) goto Le
            r2.m = r3     // Catch: java.lang.Throwable -> Lc
            r2.up = r3     // Catch: java.lang.Throwable -> Lc
            goto L12
        Lc:
            r3 = move-exception
            goto L19
        Le:
            r1.r = r3     // Catch: java.lang.Throwable -> Lc
            r2.m = r3     // Catch: java.lang.Throwable -> Lc
        L12:
            java.lang.Object r3 = r2.cw     // Catch: java.lang.Throwable -> Lc
            r3.notify()     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r3
    }

    @Override // com.ss.android.socialbase.downloader.qv.cw
    @androidx.annotation.NonNull
    public com.ss.android.socialbase.downloader.qv.j xt() throws com.ss.android.socialbase.downloader.qv.av, java.lang.InterruptedException {
            r4 = this;
            java.lang.Object r0 = r4.cw
            monitor-enter(r0)
            boolean r1 = r4.oq     // Catch: java.lang.Throwable -> L1e
            if (r1 != 0) goto L45
            com.ss.android.socialbase.downloader.qv.j r1 = r4.up     // Catch: java.lang.Throwable -> L1e
            if (r1 != 0) goto L36
            int r1 = r4.qv     // Catch: java.lang.Throwable -> L1e
            int r2 = r4.j     // Catch: java.lang.Throwable -> L1e
            if (r1 >= r2) goto L20
            int r1 = r1 + 1
            r4.qv = r1     // Catch: java.lang.Throwable -> L1e
            com.ss.android.socialbase.downloader.qv.j r1 = new com.ss.android.socialbase.downloader.qv.j     // Catch: java.lang.Throwable -> L1e
            int r2 = r4.xt     // Catch: java.lang.Throwable -> L1e
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            return r1
        L1e:
            r1 = move-exception
            goto L4d
        L20:
            java.lang.Object r1 = r4.cw     // Catch: java.lang.Throwable -> L1e
            r1.wait()     // Catch: java.lang.Throwable -> L1e
            boolean r1 = r4.oq     // Catch: java.lang.Throwable -> L1e
            if (r1 != 0) goto L2e
            com.ss.android.socialbase.downloader.qv.j r1 = r4.up     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L20
            goto L36
        L2e:
            com.ss.android.socialbase.downloader.qv.av r1 = new com.ss.android.socialbase.downloader.qv.av     // Catch: java.lang.Throwable -> L1e
            java.lang.String r2 = "obtain"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1e
            throw r1     // Catch: java.lang.Throwable -> L1e
        L36:
            com.ss.android.socialbase.downloader.qv.j r2 = r1.r     // Catch: java.lang.Throwable -> L1e
            r4.up = r2     // Catch: java.lang.Throwable -> L1e
            com.ss.android.socialbase.downloader.qv.j r2 = r4.m     // Catch: java.lang.Throwable -> L1e
            r3 = 0
            if (r1 != r2) goto L41
            r4.m = r3     // Catch: java.lang.Throwable -> L1e
        L41:
            r1.r = r3     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            return r1
        L45:
            com.ss.android.socialbase.downloader.qv.av r1 = new com.ss.android.socialbase.downloader.qv.av     // Catch: java.lang.Throwable -> L1e
            java.lang.String r2 = "obtain"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1e
            throw r1     // Catch: java.lang.Throwable -> L1e
        L4d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r1
    }

    @Override // com.ss.android.socialbase.downloader.qv.up
    public void xt(@androidx.annotation.NonNull com.ss.android.socialbase.downloader.qv.j r3) {
            r2 = this;
            java.lang.Object r0 = r2.r
            monitor-enter(r0)
            com.ss.android.socialbase.downloader.qv.j r1 = r2.tl     // Catch: java.lang.Throwable -> L11
            if (r1 != 0) goto L13
            r2.tl = r3     // Catch: java.lang.Throwable -> L11
            r2.ae = r3     // Catch: java.lang.Throwable -> L11
            java.lang.Object r3 = r2.r     // Catch: java.lang.Throwable -> L11
            r3.notify()     // Catch: java.lang.Throwable -> L11
            goto L17
        L11:
            r3 = move-exception
            goto L19
        L13:
            r1.r = r3     // Catch: java.lang.Throwable -> L11
            r2.tl = r3     // Catch: java.lang.Throwable -> L11
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r3
    }
}
