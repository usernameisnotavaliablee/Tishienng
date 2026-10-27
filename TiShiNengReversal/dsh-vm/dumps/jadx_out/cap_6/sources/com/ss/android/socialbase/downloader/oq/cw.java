package com.ss.android.socialbase.downloader.oq;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class cw implements com.ss.android.socialbase.downloader.oq.xt {
    private final java.io.InputStream j;
    private final com.ss.android.socialbase.downloader.qv.j xt;

    public cw(java.io.InputStream r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.j = r1
            com.ss.android.socialbase.downloader.qv.j r1 = new com.ss.android.socialbase.downloader.qv.j
            r1.<init>(r2)
            r0.xt = r1
            return
    }

    @Override // com.ss.android.socialbase.downloader.oq.xt
    public com.ss.android.socialbase.downloader.qv.j j() throws java.io.IOException {
            r3 = this;
            com.ss.android.socialbase.downloader.qv.j r0 = r3.xt
            java.io.InputStream r1 = r3.j
            byte[] r2 = r0.j
            int r1 = r1.read(r2)
            r0.cw = r1
            com.ss.android.socialbase.downloader.qv.j r0 = r3.xt
            return r0
    }

    @Override // com.ss.android.socialbase.downloader.oq.xt
    public void j(com.ss.android.socialbase.downloader.qv.j r1) {
            r0 = this;
            return
    }

    @Override // com.ss.android.socialbase.downloader.oq.xt
    public void xt() {
            r3 = this;
            java.io.InputStream r0 = r3.j
            r1 = 1
            java.io.Closeable[] r1 = new java.io.Closeable[r1]
            r2 = 0
            r1[r2] = r0
            com.ss.android.socialbase.downloader.az.m.j(r1)
            return
    }
}
