package com.ss.android.socialbase.downloader.g.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class r implements com.ss.android.socialbase.downloader.g.g {
    private com.ss.android.socialbase.downloader.g.g cw;
    protected final java.lang.Object j;
    private java.io.InputStream m;
    private boolean r;
    private long up;
    private final java.util.List<com.ss.android.socialbase.downloader.ae.up> xt;

    public r() {
            r1 = this;
            r1.<init>()
            return
    }

    public boolean ae() {
            r2 = this;
            r0 = 0
            com.ss.android.socialbase.downloader.g.g r1 = r2.cw     // Catch: java.io.IOException -> L11
            if (r1 == 0) goto L13
            int r1 = r1.xt()     // Catch: java.io.IOException -> L11
            boolean r1 = r2.j(r1)     // Catch: java.io.IOException -> L11
            if (r1 == 0) goto L13
            r0 = 1
            return r0
        L11:
            r1 = move-exception
            goto L14
        L13:
            return r0
        L14:
            com.bytedance.sdk.component.utils.vl.j(r1)
            return r0
    }

    @Override // com.ss.android.socialbase.downloader.g.ae
    public void cw() {
            r1 = this;
            com.ss.android.socialbase.downloader.g.g r0 = r1.cw
            if (r0 == 0) goto L7
            r0.cw()
        L7:
            return
    }

    @Override // com.ss.android.socialbase.downloader.g.g
    public java.io.InputStream j() throws java.io.IOException {
            r1 = this;
            java.io.InputStream r0 = r1.m
            if (r0 == 0) goto L5
            return r0
        L5:
            r0 = 0
            return r0
    }

    @Override // com.ss.android.socialbase.downloader.g.ae
    public java.lang.String j(java.lang.String r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.g.g r0 = r1.cw
            if (r0 == 0) goto L9
            java.lang.String r2 = r0.j(r2)
            return r2
        L9:
            r2 = 0
            return r2
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

    public java.util.List<com.ss.android.socialbase.downloader.ae.up> m() {
            r1 = this;
            java.util.List<com.ss.android.socialbase.downloader.ae.up> r0 = r1.xt
            return r0
    }

    @Override // com.ss.android.socialbase.downloader.g.g
    public void r() {
            r1 = this;
            com.ss.android.socialbase.downloader.g.g r0 = r1.cw
            if (r0 == 0) goto L7
            r0.r()
        L7:
            return
    }

    public boolean tl() {
            r5 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r5.up
            long r0 = r0 - r2
            long r2 = com.ss.android.socialbase.downloader.g.j.xt.j
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto Lf
            r0 = 1
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public void up() throws java.lang.InterruptedException {
            r2 = this;
            java.lang.Object r0 = r2.j
            monitor-enter(r0)
            boolean r1 = r2.r     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L13
            com.ss.android.socialbase.downloader.g.g r1 = r2.cw     // Catch: java.lang.Throwable -> L11
            if (r1 != 0) goto L13
            java.lang.Object r1 = r2.j     // Catch: java.lang.Throwable -> L11
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

    @Override // com.ss.android.socialbase.downloader.g.ae
    public int xt() throws java.io.IOException {
            r1 = this;
            com.ss.android.socialbase.downloader.g.g r0 = r1.cw
            if (r0 == 0) goto L9
            int r0 = r0.xt()
            return r0
        L9:
            r0 = 0
            return r0
    }
}
