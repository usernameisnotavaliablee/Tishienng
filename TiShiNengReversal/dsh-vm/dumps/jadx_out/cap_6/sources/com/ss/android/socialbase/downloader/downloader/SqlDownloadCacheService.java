package com.ss.android.socialbase.downloader.downloader;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class SqlDownloadCacheService extends android.app.Service {
    private static final java.lang.String j = "SqlDownloadCacheService";

    static {
            r0 = 41752(0xa318, float:5.8507E-41)
            com.stub.StubApp.interface11(r0)
            return
    }

    public SqlDownloadCacheService() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void j(android.content.Context r2, android.content.ServiceConnection r3) {
            if (r2 == 0) goto L1b
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L13
            java.lang.Class<com.ss.android.socialbase.downloader.downloader.SqlDownloadCacheService> r1 = com.ss.android.socialbase.downloader.downloader.SqlDownloadCacheService.class
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L13
            if (r3 == 0) goto Lf
            r1 = 1
            r2.bindService(r0, r3, r1)     // Catch: java.lang.Throwable -> L13
        Lf:
            r2.startService(r0)     // Catch: java.lang.Throwable -> L13
            return
        L13:
            r2 = move-exception
            java.lang.String r3 = com.ss.android.socialbase.downloader.downloader.SqlDownloadCacheService.j
            java.lang.String r0 = "startServiceAndBind fail"
            com.bytedance.sdk.component.utils.vl.xt(r3, r0, r2)
        L1b:
            return
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.vl r2 = com.ss.android.socialbase.downloader.downloader.cw.x()
            boolean r0 = r2 instanceof com.ss.android.socialbase.downloader.impls.r
            if (r0 == 0) goto Lf
            com.ss.android.socialbase.downloader.impls.r r2 = (com.ss.android.socialbase.downloader.impls.r) r2
            com.ss.android.socialbase.downloader.downloader.tj r2 = r2.m()
            goto L17
        Lf:
            boolean r0 = r2 instanceof com.ss.android.socialbase.downloader.downloader.tj
            if (r0 == 0) goto L16
            com.ss.android.socialbase.downloader.downloader.tj r2 = (com.ss.android.socialbase.downloader.downloader.tj) r2
            goto L17
        L16:
            r2 = 0
        L17:
            boolean r0 = r2 instanceof android.os.IBinder
            if (r0 == 0) goto L1e
            android.os.IBinder r2 = (android.os.IBinder) r2
            return r2
        L1e:
            android.os.Binder r2 = new android.os.Binder
            r2.<init>()
            return r2
    }

    @Override // android.app.Service
    public void onCreate() {
            r1 = this;
            super.onCreate()
            android.content.Context r0 = r1.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            com.ss.android.socialbase.downloader.downloader.cw.j(r0)
            return
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent r1, int r2, int r3) {
            r0 = this;
            int r1 = super.onStartCommand(r1, r2, r3)
            boolean r2 = com.ss.android.socialbase.downloader.downloader.cw.g()
            if (r2 == 0) goto Lb
            r1 = 2
        Lb:
            return r1
    }
}
