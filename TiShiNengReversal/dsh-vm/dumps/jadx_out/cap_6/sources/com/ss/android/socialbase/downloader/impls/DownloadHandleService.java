package com.ss.android.socialbase.downloader.impls;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DownloadHandleService extends android.app.Service {
    private static final java.lang.String j = "DownloadHandleService";


    static {
            r0 = 41819(0xa35b, float:5.8601E-41)
            com.stub.StubApp.interface11(r0)
            return
    }

    public DownloadHandleService() {
            r0 = this;
            r0.<init>()
            return
    }

    private void j(android.content.Intent r4) {
            r3 = this;
            if (r4 != 0) goto L3
            goto L48
        L3:
            java.lang.String r0 = r4.getAction()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto Le
            goto L48
        Le:
            java.lang.String r1 = "extra_download_id"
            r2 = 0
            int r4 = r4.getIntExtra(r1, r2)
            if (r4 != 0) goto L18
            goto L48
        L18:
            java.lang.String r1 = "com.ss.android.downloader.action.DOWNLOAD_WAKEUP"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L2d
            java.util.concurrent.ExecutorService r0 = com.ss.android.socialbase.downloader.downloader.cw.qv()
            com.ss.android.socialbase.downloader.impls.DownloadHandleService$1 r1 = new com.ss.android.socialbase.downloader.impls.DownloadHandleService$1
            r1.<init>(r3, r4)
            r0.execute(r1)
            return
        L2d:
            java.lang.String r1 = "com.ss.android.downloader.action.PROCESS_NOTIFY"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L3d
            com.ss.android.socialbase.downloader.downloader.r r0 = com.ss.android.socialbase.downloader.downloader.r.j()
            r0.ws(r4)
            return
        L3d:
            java.lang.String r4 = "com.ss.android.downloader.action.MULTI_PROCESS_NOTIFY"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L48
            com.ss.android.socialbase.downloader.downloader.cw.j()
        L48:
            return
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.app.Service
    public void onCreate() {
            r0 = this;
            super.onCreate()
            com.ss.android.socialbase.downloader.downloader.cw.j(r0)
            return
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent r1, int r2, int r3) {
            r0 = this;
            super.onStartCommand(r1, r2, r3)
            r0.j(r1)
            r1 = 2
            return r1
    }
}
