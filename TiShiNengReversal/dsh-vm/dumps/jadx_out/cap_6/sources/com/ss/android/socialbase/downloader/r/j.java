package com.ss.android.socialbase.downloader.r;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class j extends com.ss.android.socialbase.downloader.r.cw implements com.ss.android.socialbase.downloader.r.kt {
    private static final java.lang.String j = "j";

    static {
            return
    }

    public j() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.ss.android.socialbase.downloader.r.kt
    public void ae(com.ss.android.socialbase.downloader.ae.cw r4) {
            r3 = this;
            boolean r0 = com.ss.android.socialbase.downloader.m.j.j()
            if (r0 == 0) goto L1f
            if (r4 == 0) goto L1f
            java.lang.String r0 = com.ss.android.socialbase.downloader.r.j.j
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = " onWaitingDownloadCompleteHandler -- "
            r1.<init>(r2)
            java.lang.String r4 = r4.tl()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            com.ss.android.socialbase.downloader.m.j.xt(r0, r4)
        L1f:
            return
    }
}
