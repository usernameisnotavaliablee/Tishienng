package com.ss.android.socialbase.appdownloader;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class DownloadHandlerService extends android.app.Service {
    private static final java.lang.String a = "DownloadHandlerService";

    class a implements java.lang.Runnable {
        final /* synthetic */ com.ss.android.socialbase.appdownloader.DownloadHandlerService a;

        a(com.ss.android.socialbase.appdownloader.DownloadHandlerService r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> L1b
                r0.<init>()     // Catch: java.lang.Exception -> L1b
                java.lang.String r1 = "application/vnd.android.package-archive"
                r0.add(r1)     // Catch: java.lang.Exception -> L1b
                java.lang.String r1 = "mime_type_plg"
                r0.add(r1)     // Catch: java.lang.Exception -> L1b
                android.content.Context r1 = com.ss.android.socialbase.downloader.downloader.cw.nd()     // Catch: java.lang.Exception -> L1b
                com.ss.android.socialbase.downloader.downloader.ae r1 = com.ss.android.socialbase.downloader.downloader.ae.xt(r1)     // Catch: java.lang.Exception -> L1b
                r1.j(r0)     // Catch: java.lang.Exception -> L1b
                return
            L1b:
                r0 = move-exception
                com.bytedance.sdk.component.utils.vl.j(r0)
                return
        }
    }

    static class b implements java.lang.Runnable {
        final /* synthetic */ com.ss.android.socialbase.downloader.ae.cw a;
        final /* synthetic */ w2.m b;
        final /* synthetic */ com.ss.android.socialbase.downloader.r.h c;

        b(com.ss.android.socialbase.downloader.ae.cw r1, w2.m r2, com.ss.android.socialbase.downloader.r.h r3) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r10 = this;
                java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L52
                com.ss.android.socialbase.downloader.ae.cw r1 = r10.a     // Catch: java.lang.Exception -> L52
                java.lang.String r1 = r1.qv()     // Catch: java.lang.Exception -> L52
                com.ss.android.socialbase.downloader.ae.cw r2 = r10.a     // Catch: java.lang.Exception -> L52
                java.lang.String r2 = r2.tl()     // Catch: java.lang.Exception -> L52
                r0.<init>(r1, r2)     // Catch: java.lang.Exception -> L52
                boolean r1 = r0.exists()     // Catch: java.lang.Exception -> L52
                if (r1 == 0) goto L54
                android.content.Context r1 = com.ss.android.socialbase.downloader.downloader.cw.nd()     // Catch: java.lang.Exception -> L2b
                java.lang.String r2 = ""
                if (r1 == 0) goto L2d
                com.ss.android.socialbase.downloader.ae.cw r1 = r10.a     // Catch: java.lang.Exception -> L2b
                android.content.pm.PackageInfo r0 = com.ss.android.socialbase.appdownloader.b.m(r1, r0)     // Catch: java.lang.Exception -> L2b
                if (r0 == 0) goto L2d
                java.lang.String r0 = r0.packageName     // Catch: java.lang.Exception -> L2b
                r6 = r0
                goto L2e
            L2b:
                r0 = move-exception
                goto L4e
            L2d:
                r6 = r2
            L2e:
                w2.m r3 = r10.b     // Catch: java.lang.Exception -> L2b
                if (r3 == 0) goto L43
                com.ss.android.socialbase.downloader.ae.cw r0 = r10.a     // Catch: java.lang.Exception -> L2b
                int r4 = r0.ae()     // Catch: java.lang.Exception -> L2b
                com.ss.android.socialbase.downloader.ae.cw r0 = r10.a     // Catch: java.lang.Exception -> L2b
                long r8 = r0.hu()     // Catch: java.lang.Exception -> L2b
                r5 = 3
                r7 = -3
                r3.b(r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L2b
            L43:
                com.ss.android.socialbase.downloader.r.h r0 = r10.c     // Catch: java.lang.Exception -> L2b
                if (r0 == 0) goto L54
                com.ss.android.socialbase.downloader.ae.cw r1 = r10.a     // Catch: java.lang.Exception -> L2b
                r3 = 3
                r0.j(r3, r1, r6, r2)     // Catch: java.lang.Exception -> L2b
                return
            L4e:
                com.bytedance.sdk.component.utils.vl.j(r0)     // Catch: java.lang.Exception -> L52
                goto L54
            L52:
                r0 = move-exception
                goto L55
            L54:
                return
            L55:
                com.bytedance.sdk.component.utils.vl.j(r0)
                return
        }
    }

    static {
            r0 = 41553(0xa251, float:5.8228E-41)
            com.stub.StubApp.interface11(r0)
            return
    }

    public DownloadHandlerService() {
            r0 = this;
            r0.<init>()
            return
    }

    private void a(android.content.Context r8, com.ss.android.socialbase.downloader.ae.cw r9, w2.m r10, com.ss.android.socialbase.downloader.r.h r11) {
            r7 = this;
            int r1 = r9.ae()
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity> r2 = com.ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity.class
            r0.<init>(r8, r2)
            java.lang.String r2 = "extra_click_download_ids"
            r0.putExtra(r2, r1)
            r2 = 268435456(0x10000000, float:2.524355E-29)
            r0.addFlags(r2)
            r8.startActivity(r0)
            com.ss.android.socialbase.downloader.notification.xt r8 = com.ss.android.socialbase.downloader.notification.xt.j()
            r8.j(r1)
            r9.pz()
            if (r10 == 0) goto L33
            int r4 = r9.i()
            long r5 = r9.hu()
            r2 = 7
            java.lang.String r3 = ""
            r0 = r10
            r0.b(r1, r2, r3, r4, r5)
        L33:
            if (r11 == 0) goto L3b
            r8 = 7
            java.lang.String r10 = ""
            r11.j(r8, r9, r10, r10)
        L3b:
            return
    }

    private static void b(android.content.Context r2, int r3, boolean r4) {
            r0 = 0
            if (r4 == 0) goto L20
            com.ss.android.socialbase.downloader.downloader.r r4 = com.ss.android.socialbase.downloader.downloader.r.j()
            com.ss.android.socialbase.downloader.r.wq r4 = r4.vl(r3)
            if (r4 == 0) goto L20
            com.ss.android.socialbase.downloader.downloader.ae r1 = com.ss.android.socialbase.downloader.downloader.ae.xt(r2)     // Catch: java.lang.Throwable -> L1c
            com.ss.android.socialbase.downloader.ae.cw r1 = r1.tl(r3)     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L20
            boolean r4 = r4.xt(r1)     // Catch: java.lang.Throwable -> L1c
            goto L21
        L1c:
            r4 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r4)
        L20:
            r4 = 0
        L21:
            if (r4 == 0) goto L24
            goto L34
        L24:
            r4 = 1
            int r3 = com.ss.android.socialbase.appdownloader.b.h(r2, r3, r4)
            if (r3 != 0) goto L34
            java.lang.String r3 = "Open Fail!"
            android.widget.Toast r2 = android.widget.Toast.makeText(r2, r3, r0)
            r2.show()
        L34:
            return
    }

    private static void c(android.content.Context r0, com.ss.android.socialbase.downloader.ae.cw r1) {
            android.content.Context r0 = r0.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            boolean r0 = com.ss.android.socialbase.downloader.az.m.xt(r0)
            if (r0 == 0) goto L17
            boolean r0 = r1.qb()
            if (r0 == 0) goto L17
            r1.k()
        L17:
            return
    }

    public static void d(android.content.Context r8, com.ss.android.socialbase.downloader.ae.cw r9, w2.m r10, com.ss.android.socialbase.downloader.r.h r11) {
            int r1 = r9.ae()
            com.ss.android.socialbase.downloader.downloader.r r0 = com.ss.android.socialbase.downloader.downloader.r.j()
            com.ss.android.socialbase.downloader.r.wq r0 = r0.vl(r1)
            java.lang.String r2 = "application/vnd.android.package-archive"
            java.lang.String r3 = r9.xw()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L27
            if (r0 == 0) goto L27
            boolean r2 = com.ss.android.socialbase.appdownloader.b.z(r8, r9)
            if (r2 == 0) goto L27
            boolean r0 = r0.cw(r9)
            if (r0 == 0) goto L27
            goto L81
        L27:
            int r0 = r9.i()
            r2 = 0
            r3 = 1
            java.lang.String r7 = ""
            switch(r0) {
                case -4: goto Lb4;
                case -3: goto L82;
                case -2: goto L55;
                case -1: goto Lb4;
                case 0: goto L32;
                case 1: goto L33;
                case 2: goto L33;
                case 3: goto L33;
                case 4: goto L33;
                case 5: goto L33;
                default: goto L32;
            }
        L32:
            goto L81
        L33:
            com.ss.android.socialbase.downloader.downloader.ae r0 = com.ss.android.socialbase.downloader.downloader.ae.xt(r8)
            r0.j(r1)
            c(r8, r9)
            if (r10 == 0) goto L4e
            int r4 = r9.i()
            long r5 = r9.hu()
            r2 = 5
            java.lang.String r3 = ""
            r0 = r10
            r0.b(r1, r2, r3, r4, r5)
        L4e:
            if (r11 == 0) goto L81
            r8 = 5
            r11.j(r8, r9, r7, r7)
            return
        L55:
            r0 = r10
            com.ss.android.socialbase.downloader.downloader.r r10 = com.ss.android.socialbase.downloader.downloader.r.j()
            boolean r10 = r10.up(r1)
            if (r10 == 0) goto L68
            com.ss.android.socialbase.downloader.downloader.ae r8 = com.ss.android.socialbase.downloader.downloader.ae.xt(r8)
            r8.cw(r1)
            goto L6b
        L68:
            com.ss.android.socialbase.appdownloader.b.w(r9, r3, r2)
        L6b:
            if (r0 == 0) goto L7b
            int r4 = r9.i()
            long r5 = r9.hu()
            r2 = 6
            java.lang.String r3 = ""
            r0.b(r1, r2, r3, r4, r5)
        L7b:
            if (r11 == 0) goto L81
            r8 = 6
            r11.j(r8, r9, r7, r7)
        L81:
            return
        L82:
            r0 = r10
            android.content.Context r10 = com.ss.android.socialbase.downloader.downloader.cw.nd()
            b(r10, r1, r3)
            e(r8, r0, r9)
            com.ss.android.socialbase.downloader.jy.j r8 = com.ss.android.socialbase.downloader.jy.j.j(r1)
            java.lang.String r9 = "notification_click_install_auto_cancel"
            int r8 = r8.j(r9, r3)
            if (r8 != 0) goto Lac
            com.ss.android.socialbase.downloader.notification.xt r8 = com.ss.android.socialbase.downloader.notification.xt.j()
            com.ss.android.socialbase.downloader.notification.j r8 = r8.up(r1)
            if (r8 == 0) goto Lac
            r8.ae()
            r9 = -3
            r10 = 0
            r8.j(r9, r10, r2, r3)
            return
        Lac:
            com.ss.android.socialbase.downloader.notification.xt r8 = com.ss.android.socialbase.downloader.notification.xt.j()
            r8.j(r1)
            return
        Lb4:
            com.ss.android.socialbase.downloader.jy.j r10 = com.ss.android.socialbase.downloader.jy.j.j(r1)
            java.lang.String r11 = "enable_notification_ui"
            int r10 = r10.xt(r11)
            r11 = 2
            if (r10 < r11) goto Lca
            boolean r10 = r9.x()
            if (r10 == 0) goto Lca
            r9.r(r2)
        Lca:
            com.ss.android.socialbase.downloader.downloader.ae r8 = com.ss.android.socialbase.downloader.downloader.ae.xt(r8)
            r8.up(r1)
            return
    }

    private static void e(android.content.Context r2, w2.m r3, com.ss.android.socialbase.downloader.ae.cw r4) {
            if (r4 != 0) goto L3
            goto L13
        L3:
            com.ss.android.socialbase.downloader.downloader.ae r2 = com.ss.android.socialbase.downloader.downloader.ae.xt(r2)
            int r0 = r4.ae()
            com.ss.android.socialbase.downloader.r.h r2 = r2.g(r0)
            if (r3 != 0) goto L14
            if (r2 != 0) goto L14
        L13:
            return
        L14:
            java.util.concurrent.ExecutorService r0 = com.ss.android.socialbase.downloader.downloader.cw.qv()
            com.ss.android.socialbase.appdownloader.DownloadHandlerService$b r1 = new com.ss.android.socialbase.appdownloader.DownloadHandlerService$b
            r1.<init>(r4, r3, r2)
            r0.execute(r1)
            return
    }

    private boolean f(android.content.Context r8, android.content.Intent r9) {
            r7 = this;
            r0 = 0
            if (r9 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = r9.getAction()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto Lf
            return r0
        Lf:
            java.lang.String r2 = "extra_click_download_ids"
            int r2 = r9.getIntExtra(r2, r0)
            java.lang.String r3 = "extra_click_download_type"
            r9.getIntExtra(r3, r0)
            com.ss.android.socialbase.appdownloader.f r3 = com.ss.android.socialbase.appdownloader.f.L()
            w2.m r3 = r3.d()
            com.ss.android.socialbase.downloader.downloader.ae r4 = com.ss.android.socialbase.downloader.downloader.ae.xt(r7)
            com.ss.android.socialbase.downloader.r.h r4 = r4.g(r2)
            java.lang.String r5 = "extra_from_notification"
            boolean r9 = r9.getBooleanExtra(r5, r0)
            r5 = 1
            if (r9 == 0) goto L46
            com.ss.android.socialbase.downloader.jy.j r9 = com.ss.android.socialbase.downloader.jy.j.j(r2)
            java.lang.String r6 = "notification_opt_2"
            int r9 = r9.xt(r6)
            if (r9 != r5) goto L46
            com.ss.android.socialbase.downloader.notification.xt r9 = com.ss.android.socialbase.downloader.notification.xt.j()
            r9.m(r2)
        L46:
            com.ss.android.socialbase.downloader.downloader.ae r9 = com.ss.android.socialbase.downloader.downloader.ae.xt(r8)
            com.ss.android.socialbase.downloader.ae.cw r9 = r9.tl(r2)
            if (r9 != 0) goto L51
            return r0
        L51:
            java.lang.String r6 = "android.ss.intent.action.DOWNLOAD_CLICK_CONTENT"
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L5e
            r7.g(r8, r9, r3, r4)
            goto Le4
        L5e:
            java.lang.String r6 = "android.ss.intent.action.DOWNLOAD_OPEN"
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L6b
            d(r8, r9, r3, r4)
            goto Le4
        L6b:
            java.lang.String r6 = "android.ss.intent.action.DOWNLOAD_CLICK_BTN"
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto Lb3
            int r1 = r9.i()
            if (r1 != 0) goto L7a
            return r0
        L7a:
            d(r8, r9, r3, r4)
            boolean r8 = r9.hw()
            if (r8 == 0) goto Le4
            com.ss.android.socialbase.downloader.jy.j r8 = com.ss.android.socialbase.downloader.jy.j.j(r2)
            java.lang.String r1 = "no_hide_notification"
            int r8 = r8.j(r1, r0)
            if (r8 != 0) goto Le4
            com.ss.android.socialbase.downloader.jy.j r8 = com.ss.android.socialbase.downloader.jy.j.j(r2)
            java.lang.String r1 = "enable_notification_ui"
            int r8 = r8.xt(r1)
            r1 = 2
            if (r8 < r1) goto La4
            int r8 = r9.i()
            r9 = -1
            if (r8 != r9) goto La4
            goto Le4
        La4:
            com.ss.android.socialbase.downloader.notification.xt r8 = com.ss.android.socialbase.downloader.notification.xt.j()
            r8.j(r2)
            com.ss.android.socialbase.downloader.notification.xt r8 = com.ss.android.socialbase.downloader.notification.xt.j()
            r8.m(r2)
            goto Le4
        Lb3:
            java.lang.String r6 = "android.ss.intent.action.DOWNLOAD_DELETE"
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto Lbf
            r7.a(r8, r9, r3, r4)
            goto Le4
        Lbf:
            java.lang.String r8 = "android.ss.intent.action.DOWNLOAD_HIDE"
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto Lcf
            com.ss.android.socialbase.downloader.notification.xt r8 = com.ss.android.socialbase.downloader.notification.xt.j()
            r8.j(r2)
            goto Le4
        Lcf:
            java.lang.String r8 = "android.intent.action.MEDIA_MOUNTED"
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto Le4
            java.util.concurrent.ExecutorService r8 = com.ss.android.socialbase.downloader.downloader.cw.qv()
            com.ss.android.socialbase.appdownloader.DownloadHandlerService$a r9 = new com.ss.android.socialbase.appdownloader.DownloadHandlerService$a
            r9.<init>(r7)
            r8.execute(r9)
            return r5
        Le4:
            return r0
    }

    private void g(android.content.Context r9, com.ss.android.socialbase.downloader.ae.cw r10, w2.m r11, com.ss.android.socialbase.downloader.r.h r12) {
            r8 = this;
            int r2 = r10.ae()
            com.ss.android.socialbase.downloader.downloader.r r0 = com.ss.android.socialbase.downloader.downloader.r.j()
            com.ss.android.socialbase.downloader.r.wq r0 = r0.vl(r2)
            if (r0 == 0) goto L17
            boolean r0 = r0.j(r10)     // Catch: java.lang.Throwable -> L13
            goto L18
        L13:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
        L17:
            r0 = 0
        L18:
            if (r0 != 0) goto L51
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity> r1 = com.ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity.class
            r0.<init>(r9, r1)
            java.lang.String r1 = "extra_click_download_ids"
            r0.putExtra(r1, r2)
            r1 = 268435456(0x10000000, float:2.524355E-29)
            r0.addFlags(r1)
            r9.startActivity(r0)
            com.ss.android.socialbase.downloader.notification.xt r9 = com.ss.android.socialbase.downloader.notification.xt.j()
            r9.j(r2)
            r10.pz()
            if (r11 == 0) goto L49
            int r5 = r10.i()
            long r6 = r10.hu()
            r3 = 7
            java.lang.String r4 = ""
            r1 = r11
            r1.b(r2, r3, r4, r5, r6)
        L49:
            if (r12 == 0) goto L51
            r9 = 7
            java.lang.String r11 = ""
            r12.j(r9, r10, r11, r11)
        L51:
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
            boolean r2 = com.ss.android.socialbase.downloader.m.j.j()
            if (r2 == 0) goto L10
            java.lang.String r2 = com.ss.android.socialbase.appdownloader.DownloadHandlerService.a
            java.lang.String r3 = "onStartCommand"
            com.ss.android.socialbase.downloader.m.j.xt(r2, r3)
        L10:
            android.content.Context r2 = com.ss.android.socialbase.downloader.downloader.cw.nd()
            r0.f(r2, r1)
            r0.stopSelf()
            r1 = 2
            return r1
    }
}
