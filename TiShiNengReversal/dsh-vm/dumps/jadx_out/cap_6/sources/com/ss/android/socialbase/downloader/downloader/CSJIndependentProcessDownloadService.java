package com.ss.android.socialbase.downloader.downloader;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class CSJIndependentProcessDownloadService extends com.ss.android.socialbase.downloader.downloader.CSJDownloadService {
    public CSJIndependentProcessDownloadService() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.CSJDownloadService, android.app.Service
    public void onCreate() {
            r2 = this;
            super.onCreate()
            com.ss.android.socialbase.downloader.downloader.cw.j(r2)
            com.ss.android.socialbase.downloader.downloader.cw$j r0 = com.ss.android.socialbase.downloader.downloader.cw.b()
            if (r0 != 0) goto L14
            com.ss.android.socialbase.downloader.downloader.v r0 = new com.ss.android.socialbase.downloader.downloader.v
            r0.<init>()
            com.ss.android.socialbase.downloader.downloader.cw.j(r0)
        L14:
            com.ss.android.socialbase.downloader.downloader.i r0 = com.ss.android.socialbase.downloader.downloader.cw.s()
            r2.j = r0
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r2)
            r0.j(r1)
            return
    }
}
