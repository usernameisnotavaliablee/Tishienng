package com.ss.android.socialbase.downloader.impls;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class tl extends com.ss.android.socialbase.downloader.downloader.j {
    private static final java.lang.String up = "tl";

    static {
            return
    }

    public tl() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j, com.ss.android.socialbase.downloader.downloader.i
    public void cw() {
            r2 = this;
            r0 = 262144(0x40000, float:3.67342E-40)
            boolean r0 = com.ss.android.socialbase.downloader.az.j.j(r0)
            if (r0 == 0) goto L1b
            r0 = 1
            r2.xt = r0
            r0 = 0
            r2.r = r0
            boolean r0 = com.ss.android.socialbase.downloader.m.j.j()
            if (r0 == 0) goto L1b
            java.lang.String r0 = com.ss.android.socialbase.downloader.impls.tl.up
            java.lang.String r1 = "onStartCommandOnMainThread"
            com.ss.android.socialbase.downloader.m.j.xt(r0, r1)
        L1b:
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j, com.ss.android.socialbase.downloader.downloader.i
    public void j(android.content.Intent r1, int r2, int r3) {
            r0 = this;
            boolean r1 = com.ss.android.socialbase.downloader.m.j.j()
            if (r1 == 0) goto Ld
            java.lang.String r1 = com.ss.android.socialbase.downloader.impls.tl.up
            java.lang.String r2 = "onStartCommand"
            com.ss.android.socialbase.downloader.m.j.xt(r1, r2)
        Ld:
            r1 = 262144(0x40000, float:3.67342E-40)
            boolean r1 = com.ss.android.socialbase.downloader.az.j.j(r1)
            if (r1 != 0) goto L18
            r1 = 1
            r0.xt = r1
        L18:
            r0.up()
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public void startService(android.content.Context r2, android.content.ServiceConnection r3) {
            r1 = this;
            android.content.Intent r3 = new android.content.Intent     // Catch: java.lang.Throwable -> Lb
            java.lang.Class<com.ss.android.socialbase.downloader.downloader.CSJDownloadService> r0 = com.ss.android.socialbase.downloader.downloader.CSJDownloadService.class
            r3.<init>(r2, r0)     // Catch: java.lang.Throwable -> Lb
            r2.startService(r3)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public void stopService(android.content.Context r2, android.content.ServiceConnection r3) {
            r1 = this;
            android.content.Intent r3 = new android.content.Intent
            java.lang.Class<com.ss.android.socialbase.downloader.downloader.CSJDownloadService> r0 = com.ss.android.socialbase.downloader.downloader.CSJDownloadService.class
            r3.<init>(r2, r0)
            r2.stopService(r3)
            r2 = 0
            r1.xt = r2
            return
    }
}
