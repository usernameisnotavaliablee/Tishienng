package com.ss.android.socialbase.downloader.qv;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class vl implements com.ss.android.socialbase.downloader.qv.up {
    private final com.ss.android.socialbase.downloader.qv.up cw;
    private final com.ss.android.socialbase.downloader.qv.g j;
    private final com.ss.android.socialbase.downloader.ae.ae xt;

    public vl(com.ss.android.socialbase.downloader.ae.cw r1, com.ss.android.socialbase.downloader.qv.xt r2, com.ss.android.socialbase.downloader.qv.g r3) throws com.ss.android.socialbase.downloader.up.j {
            r0 = this;
            r0.<init>()
            r0.j = r3
            com.ss.android.socialbase.downloader.ae.ae r1 = r0.j(r1, r3)
            r0.xt = r1
            com.ss.android.socialbase.downloader.qv.tl r1 = new com.ss.android.socialbase.downloader.qv.tl
            r1.<init>(r2, r0)
            r0.cw = r1
            return
    }

    private com.ss.android.socialbase.downloader.ae.ae j(com.ss.android.socialbase.downloader.ae.cw r6, com.ss.android.socialbase.downloader.qv.g r7) throws com.ss.android.socialbase.downloader.up.j {
            r5 = this;
            java.lang.String r0 = r6.vl()
            java.lang.String r1 = r6.jy()
            int r2 = r6.ae()
            com.ss.android.socialbase.downloader.jy.j r2 = com.ss.android.socialbase.downloader.jy.j.j(r2)
            java.lang.String r3 = "flush_buffer_size_byte"
            r4 = -1
            int r2 = r2.j(r3, r4)
            com.ss.android.socialbase.downloader.ae.ae r6 = com.ss.android.socialbase.downloader.az.m.j(r6, r0, r1, r2)
            long r0 = r7.up()     // Catch: java.io.IOException -> L23
            r6.j(r0)     // Catch: java.io.IOException -> L23
            return r6
        L23:
            r6 = move-exception
            com.ss.android.socialbase.downloader.up.j r7 = new com.ss.android.socialbase.downloader.up.j
            r0 = 1054(0x41e, float:1.477E-42)
            r7.<init>(r0, r6)
            throw r7
    }

    public void cw() throws java.io.IOException {
            r1 = this;
            com.ss.android.socialbase.downloader.ae.ae r0 = r1.xt
            r0.cw()
            return
    }

    public com.ss.android.socialbase.downloader.qv.up j() {
            r1 = this;
            com.ss.android.socialbase.downloader.qv.up r0 = r1.cw
            return r0
    }

    public void r() {
            r3 = this;
            com.ss.android.socialbase.downloader.ae.ae r0 = r3.xt
            r1 = 1
            java.io.Closeable[] r1 = new java.io.Closeable[r1]
            r2 = 0
            r1[r2] = r0
            com.ss.android.socialbase.downloader.az.m.j(r1)
            return
    }

    public com.ss.android.socialbase.downloader.qv.g up() {
            r1 = this;
            com.ss.android.socialbase.downloader.qv.g r0 = r1.j
            return r0
    }

    public void xt() throws java.io.IOException {
            r1 = this;
            com.ss.android.socialbase.downloader.ae.ae r0 = r1.xt
            r0.xt()
            return
    }

    @Override // com.ss.android.socialbase.downloader.qv.up
    public void xt(@androidx.annotation.NonNull com.ss.android.socialbase.downloader.qv.j r5) throws java.io.IOException {
            r4 = this;
            com.ss.android.socialbase.downloader.ae.ae r0 = r4.xt
            byte[] r1 = r5.j
            r2 = 0
            int r3 = r5.cw
            r0.j(r1, r2, r3)
            com.ss.android.socialbase.downloader.qv.g r0 = r4.j
            int r5 = r5.cw
            long r1 = (long) r5
            r0.xt(r1)
            return
    }
}
