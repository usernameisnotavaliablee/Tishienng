package com.ss.android.socialbase.downloader.ae;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class m {
    public final int cw;
    public final java.lang.String j;
    private long r;
    private long up;
    public final com.ss.android.socialbase.downloader.g.ae xt;

    public m(java.lang.String r1, com.ss.android.socialbase.downloader.g.ae r2) throws java.io.IOException {
            r0 = this;
            r0.<init>()
            r0.j = r1
            int r1 = r2.xt()
            r0.cw = r1
            r0.xt = r2
            return
    }

    public java.lang.String ae() {
            r2 = this;
            com.ss.android.socialbase.downloader.g.ae r0 = r2.xt
            java.lang.String r1 = "Cache-Control"
            java.lang.String r0 = com.ss.android.socialbase.downloader.az.m.xt(r0, r1)
            return r0
    }

    public java.lang.String cw() {
            r2 = this;
            com.ss.android.socialbase.downloader.g.ae r0 = r2.xt
            java.lang.String r1 = "Etag"
            java.lang.String r0 = r0.j(r1)
            return r0
    }

    public boolean g() {
            r2 = this;
            r0 = 8
            boolean r0 = com.ss.android.socialbase.downloader.az.j.j(r0)
            if (r0 == 0) goto Lf
            com.ss.android.socialbase.downloader.g.ae r0 = r2.xt
            boolean r0 = com.ss.android.socialbase.downloader.az.m.cw(r0)
            return r0
        Lf:
            long r0 = r2.tl()
            boolean r0 = com.ss.android.socialbase.downloader.az.m.xt(r0)
            return r0
    }

    public boolean j() {
            r1 = this;
            int r0 = r1.cw
            boolean r0 = com.ss.android.socialbase.downloader.az.m.cw(r0)
            return r0
    }

    public java.lang.String m() {
            r2 = this;
            com.ss.android.socialbase.downloader.g.ae r0 = r2.xt
            java.lang.String r1 = "last-modified"
            java.lang.String r0 = com.ss.android.socialbase.downloader.az.m.xt(r0, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L16
            com.ss.android.socialbase.downloader.g.ae r0 = r2.xt
            java.lang.String r1 = "Last-Modified"
            java.lang.String r0 = com.ss.android.socialbase.downloader.az.m.xt(r0, r1)
        L16:
            return r0
    }

    public long oq() {
            r5 = this;
            long r0 = r5.up
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L23
            boolean r0 = r5.g()
            if (r0 != 0) goto L1f
            java.lang.String r0 = r5.up()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L23
            long r0 = com.ss.android.socialbase.downloader.az.m.xt(r0)
            r5.up = r0
            goto L23
        L1f:
            r0 = -1
            r5.up = r0
        L23:
            long r0 = r5.up
            return r0
    }

    public long qv() {
            r2 = this;
            java.lang.String r0 = r2.ae()
            long r0 = com.ss.android.socialbase.downloader.az.m.g(r0)
            return r0
    }

    public java.lang.String r() {
            r2 = this;
            com.ss.android.socialbase.downloader.g.ae r0 = r2.xt
            java.lang.String r1 = "Content-Type"
            java.lang.String r0 = r0.j(r1)
            return r0
    }

    public long tl() {
            r5 = this;
            long r0 = r5.r
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L10
            com.ss.android.socialbase.downloader.g.ae r0 = r5.xt
            long r0 = com.ss.android.socialbase.downloader.az.m.j(r0)
            r5.r = r0
        L10:
            long r0 = r5.r
            return r0
    }

    public java.lang.String up() {
            r2 = this;
            com.ss.android.socialbase.downloader.g.ae r0 = r2.xt
            java.lang.String r1 = "Content-Range"
            java.lang.String r0 = com.ss.android.socialbase.downloader.az.m.xt(r0, r1)
            return r0
    }

    public boolean xt() {
            r3 = this;
            int r0 = r3.cw
            com.ss.android.socialbase.downloader.g.ae r1 = r3.xt
            java.lang.String r2 = "Accept-Ranges"
            java.lang.String r1 = r1.j(r2)
            boolean r0 = com.ss.android.socialbase.downloader.az.m.j(r0, r1)
            return r0
    }
}
