package com.ss.android.socialbase.downloader.downloader;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class CSJDownloadService extends android.app.Service {
    private static final java.lang.String xt = "CSJDownloadService";
    protected com.ss.android.socialbase.downloader.downloader.i j;


    static {
            r0 = 41747(0xa313, float:5.85E-41)
            com.stub.StubApp.interface11(r0)
            return
    }

    public CSJDownloadService() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent r4) {
            r3 = this;
            java.lang.String r0 = com.ss.android.socialbase.downloader.downloader.CSJDownloadService.xt
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "onBind downloadServiceHandler != null:"
            r1.<init>(r2)
            com.ss.android.socialbase.downloader.downloader.i r2 = r3.j
            if (r2 == 0) goto Lf
            r2 = 1
            goto L10
        Lf:
            r2 = 0
        L10:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.ss.android.socialbase.downloader.m.j.xt(r0, r1)
            com.ss.android.socialbase.downloader.downloader.i r0 = r3.j
            if (r0 == 0) goto L23
            android.os.IBinder r4 = r0.j(r4)
            return r4
        L23:
            r4 = 0
            return r4
    }

    @Override // android.app.Service
    public void onCreate() {
            r2 = this;
            super.onCreate()
            com.ss.android.socialbase.downloader.downloader.cw.j(r2)
            com.ss.android.socialbase.downloader.downloader.i r0 = com.ss.android.socialbase.downloader.downloader.cw.ch()
            r2.j = r0
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r2)
            r0.j(r1)
            return
    }

    @Override // android.app.Service
    public void onDestroy() {
            r2 = this;
            boolean r0 = com.ss.android.socialbase.downloader.m.j.j()
            if (r0 == 0) goto Ld
            java.lang.String r0 = com.ss.android.socialbase.downloader.downloader.CSJDownloadService.xt
            java.lang.String r1 = "Service onDestroy"
            com.ss.android.socialbase.downloader.m.j.xt(r0, r1)
        Ld:
            com.ss.android.socialbase.downloader.downloader.i r0 = r2.j
            if (r0 == 0) goto L17
            r0.r()
            r0 = 0
            r2.j = r0
        L17:
            super.onDestroy()
            return
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent r3, int r4, int r5) {
            r2 = this;
            boolean r0 = com.ss.android.socialbase.downloader.m.j.j()
            if (r0 == 0) goto Ld
            java.lang.String r0 = com.ss.android.socialbase.downloader.downloader.CSJDownloadService.xt
            java.lang.String r1 = "DownloadService onStartCommand"
            com.ss.android.socialbase.downloader.m.j.xt(r0, r1)
        Ld:
            com.ss.android.socialbase.downloader.downloader.i r0 = r2.j
            r0.cw()
            java.util.concurrent.ExecutorService r0 = com.ss.android.socialbase.downloader.downloader.cw.qv()
            if (r0 == 0) goto L20
            com.ss.android.socialbase.downloader.downloader.CSJDownloadService$1 r1 = new com.ss.android.socialbase.downloader.downloader.CSJDownloadService$1
            r1.<init>(r2, r3, r4, r5)
            r0.execute(r1)
        L20:
            boolean r3 = com.ss.android.socialbase.downloader.downloader.cw.g()
            if (r3 == 0) goto L28
            r3 = 2
            return r3
        L28:
            r3 = 3
            return r3
    }
}
