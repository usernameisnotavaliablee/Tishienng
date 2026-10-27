package com.ss.android.socialbase.downloader.notification;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DownloadNotificationService extends android.app.Service {
    private static volatile long ae = 0;
    private static int cw = -1;
    private static long g = 900;
    private static final java.lang.String j = "DownloadNotificationService";
    private static volatile long m = 0;
    private static boolean r = true;
    private static boolean tl = false;
    private static boolean up = false;
    private static int xt = -1;
    private com.ss.android.socialbase.downloader.ws.ae oq;
    private final android.util.SparseArray<android.app.Notification> qv;



    static {
            r0 = 41869(0xa38d, float:5.8671E-41)
            com.stub.StubApp.interface11(r0)
            return
    }

    public DownloadNotificationService() {
            r2 = this;
            r2.<init>()
            android.util.SparseArray r0 = new android.util.SparseArray
            r1 = 2
            r0.<init>(r1)
            r2.qv = r0
            return
    }

    static /* synthetic */ long cw() {
            long r0 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.g
            return r0
    }

    static /* synthetic */ com.ss.android.socialbase.downloader.ws.ae j(com.ss.android.socialbase.downloader.notification.DownloadNotificationService r0) {
            com.ss.android.socialbase.downloader.ws.ae r0 = r0.oq
            return r0
    }

    private void j(android.app.NotificationManager r4, int r5) {
            r3 = this;
            android.util.SparseArray<android.app.Notification> r0 = r3.qv
            monitor-enter(r0)
            android.util.SparseArray<android.app.Notification> r1 = r3.qv     // Catch: java.lang.Throwable -> L17
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L17
            android.app.Notification r1 = (android.app.Notification) r1     // Catch: java.lang.Throwable -> L17
            android.util.SparseArray<android.app.Notification> r2 = r3.qv     // Catch: java.lang.Throwable -> L17
            r2.remove(r5)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L16
            r3.xt(r4, r5, r1)
        L16:
            return
        L17:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r4
    }

    private void j(android.app.NotificationManager r8, int r9, android.app.Notification r10) {
            r7 = this;
            android.util.SparseArray<android.app.Notification> r0 = r7.qv
            monitor-enter(r0)
            android.util.SparseArray<android.app.Notification> r1 = r7.qv     // Catch: java.lang.Throwable -> L1a
            int r1 = r1.indexOfKey(r9)     // Catch: java.lang.Throwable -> L1a
            if (r1 < 0) goto L1c
            android.util.SparseArray<android.app.Notification> r2 = r7.qv     // Catch: java.lang.Throwable -> L1a
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L1a
            if (r1 >= r2) goto L1c
            android.util.SparseArray<android.app.Notification> r8 = r7.qv     // Catch: java.lang.Throwable -> L1a
            r8.setValueAt(r1, r10)     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            return
        L1a:
            r8 = move-exception
            goto L62
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            long r0 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.g
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.m
            long r2 = r2 - r4
            long r0 = r0 - r2
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L2e
            r0 = r2
        L2e:
            r4 = 20000(0x4e20, double:9.8813E-320)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 <= 0) goto L35
            r0 = r4
        L35:
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 + r0
            com.ss.android.socialbase.downloader.notification.DownloadNotificationService.ae = r4
            com.ss.android.socialbase.downloader.notification.DownloadNotificationService.m = r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L46
            r7.xt(r8, r9, r10)
            return
        L46:
            com.ss.android.socialbase.downloader.ws.ae r2 = r7.oq
            if (r2 == 0) goto L61
            android.util.SparseArray<android.app.Notification> r2 = r7.qv
            monitor-enter(r2)
            android.util.SparseArray<android.app.Notification> r3 = r7.qv     // Catch: java.lang.Throwable -> L5e
            r3.put(r9, r10)     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5e
            com.ss.android.socialbase.downloader.ws.ae r10 = r7.oq
            com.ss.android.socialbase.downloader.notification.DownloadNotificationService$2 r2 = new com.ss.android.socialbase.downloader.notification.DownloadNotificationService$2
            r2.<init>(r7, r8, r9)
            r10.j(r2, r0)
            return
        L5e:
            r8 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5e
            throw r8
        L61:
            return
        L62:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r8
    }

    private void j(android.content.Intent r4) {
            r3 = this;
            if (r4 != 0) goto L3
            goto L1a
        L3:
            java.lang.String r0 = r4.getAction()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto Le
            goto L1a
        Le:
            com.ss.android.socialbase.downloader.ws.ae r1 = r3.oq
            if (r1 == 0) goto L1a
            com.ss.android.socialbase.downloader.notification.DownloadNotificationService$1 r2 = new com.ss.android.socialbase.downloader.notification.DownloadNotificationService$1
            r2.<init>(r3, r4, r0)
            r1.j(r2)
        L1a:
            return
    }

    static /* synthetic */ void j(com.ss.android.socialbase.downloader.notification.DownloadNotificationService r0, android.app.NotificationManager r1, int r2) {
            r0.xt(r1, r2)
            return
    }

    static /* synthetic */ void j(com.ss.android.socialbase.downloader.notification.DownloadNotificationService r0, android.app.NotificationManager r1, int r2, android.app.Notification r3) {
            r0.xt(r1, r2, r3)
            return
    }

    static /* synthetic */ boolean j() {
            boolean r0 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.tl
            return r0
    }

    private boolean j(int r4, android.app.Notification r5) {
            r3 = this;
            boolean r0 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.r
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.xt
            if (r0 == r4) goto L32
            int r2 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.cw
            if (r2 != r4) goto Lf
            goto L32
        Lf:
            if (r0 == 0) goto L14
            if (r2 == 0) goto L14
            return r1
        L14:
            boolean r4 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.up
            if (r4 == 0) goto L1f
            int r4 = r5.flags
            r4 = r4 & 2
            if (r4 != 0) goto L1f
            return r1
        L1f:
            int r4 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r4 < r0) goto L30
            java.lang.String r4 = com.ss.android.socialbase.downloader.notification.a.a(r5)
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L30
            return r1
        L30:
            r4 = 1
            return r4
        L32:
            return r1
    }

    private void r() {
            r2 = this;
            com.ss.android.socialbase.downloader.ws.ae r0 = r2.oq
            if (r0 != 0) goto L10
            com.ss.android.socialbase.downloader.ws.ae r0 = new com.ss.android.socialbase.downloader.ws.ae
            java.lang.String r1 = "DownloaderNotifyThread"
            r0.<init>(r1)
            r2.oq = r0
            r0.j()
        L10:
            return
    }

    static /* synthetic */ long xt() {
            long r0 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.ae
            return r0
    }

    private void xt(android.app.NotificationManager r10, int r11) {
            r9 = this;
            int r0 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.xt
            if (r0 == r11) goto Ld
            int r1 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.cw
            if (r1 != r11) goto L9
            goto Ld
        L9:
            r10.cancel(r11)     // Catch: java.lang.Throwable -> Lc
        Lc:
            return
        Ld:
            r1 = 1
            r2 = 0
            if (r0 != r11) goto L15
            com.ss.android.socialbase.downloader.notification.DownloadNotificationService.xt = r2
            r0 = 0
            goto L18
        L15:
            com.ss.android.socialbase.downloader.notification.DownloadNotificationService.cw = r2
            r0 = 1
        L18:
            com.ss.android.socialbase.downloader.downloader.r r3 = com.ss.android.socialbase.downloader.downloader.r.j()     // Catch: java.lang.Throwable -> L44
            com.ss.android.socialbase.downloader.downloader.az r3 = r3.cw(r11)     // Catch: java.lang.Throwable -> L44
            boolean r4 = r3.xt()     // Catch: java.lang.Throwable -> L44
            java.lang.String r5 = ", isIndependentProcess = "
            if (r4 != 0) goto L46
            com.ss.android.socialbase.downloader.notification.DownloadNotificationService.r = r2     // Catch: java.lang.Throwable -> L44
            java.lang.String r4 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.j     // Catch: java.lang.Throwable -> L44
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L44
            java.lang.String r7 = "try to stopForeground when is not Foreground, id = "
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L44
            r6.append(r11)     // Catch: java.lang.Throwable -> L44
            r6.append(r5)     // Catch: java.lang.Throwable -> L44
            r6.append(r0)     // Catch: java.lang.Throwable -> L44
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L44
            com.ss.android.socialbase.downloader.m.j.r(r4, r6)     // Catch: java.lang.Throwable -> L44
            goto L46
        L44:
            r3 = move-exception
            goto L63
        L46:
            java.lang.String r4 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.j     // Catch: java.lang.Throwable -> L44
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L44
            java.lang.String r7 = "doCancel, ========== stopForeground id = "
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L44
            r6.append(r11)     // Catch: java.lang.Throwable -> L44
            r6.append(r5)     // Catch: java.lang.Throwable -> L44
            r6.append(r0)     // Catch: java.lang.Throwable -> L44
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Throwable -> L44
            com.ss.android.socialbase.downloader.m.j.cw(r4, r5)     // Catch: java.lang.Throwable -> L44
            r3.j(r2, r1)     // Catch: java.lang.Throwable -> L44
            goto L66
        L63:
            com.bytedance.sdk.component.utils.vl.j(r3)
        L66:
            r10.cancel(r11)     // Catch: java.lang.Throwable -> L6a
            goto L6b
        L6a:
        L6b:
            boolean r3 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.r
            if (r3 != 0) goto L71
            goto Leb
        L71:
            com.ss.android.socialbase.downloader.notification.xt r3 = com.ss.android.socialbase.downloader.notification.xt.j()     // Catch: java.lang.Throwable -> Lb5
            android.util.SparseArray r3 = r3.xt()     // Catch: java.lang.Throwable -> Lb5
            r4 = 0
            if (r3 == 0) goto Lbe
            int r5 = r3.size()     // Catch: java.lang.Throwable -> Lb5
            int r5 = r5 - r1
        L81:
            if (r5 < 0) goto Lbe
            java.lang.Object r6 = r3.valueAt(r5)     // Catch: java.lang.Throwable -> Lb5
            com.ss.android.socialbase.downloader.notification.j r6 = (com.ss.android.socialbase.downloader.notification.j) r6     // Catch: java.lang.Throwable -> Lb5
            if (r6 == 0) goto Lbb
            int r7 = r6.j()     // Catch: java.lang.Throwable -> Lb5
            if (r7 == r11) goto Lbb
            int r8 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.xt     // Catch: java.lang.Throwable -> Lb5
            if (r7 == r8) goto Lbb
            int r8 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.cw     // Catch: java.lang.Throwable -> Lb5
            if (r7 == r8) goto Lbb
            boolean r7 = r6.tl()     // Catch: java.lang.Throwable -> Lb5
            if (r7 == 0) goto Lbb
            com.ss.android.socialbase.downloader.downloader.r r7 = com.ss.android.socialbase.downloader.downloader.r.j()     // Catch: java.lang.Throwable -> Lb5
            int r8 = r6.j()     // Catch: java.lang.Throwable -> Lb5
            int r7 = r7.j(r8)     // Catch: java.lang.Throwable -> Lb5
            if (r7 != r1) goto Lb7
            boolean r7 = com.ss.android.socialbase.downloader.az.m.cw()     // Catch: java.lang.Throwable -> Lb5
            if (r7 != 0) goto Lb7
            r7 = 1
            goto Lb8
        Lb5:
            r10 = move-exception
            goto Lec
        Lb7:
            r7 = 0
        Lb8:
            if (r7 != r0) goto Lbb
            goto Lbf
        Lbb:
            int r5 = r5 + (-1)
            goto L81
        Lbe:
            r6 = r4
        Lbf:
            if (r6 == 0) goto Leb
            int r11 = r6.j()     // Catch: java.lang.Throwable -> Lb5
            r10.cancel(r11)     // Catch: java.lang.Throwable -> Lc9
            goto Lcd
        Lc9:
            r10 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r10)     // Catch: java.lang.Throwable -> Lb5
        Lcd:
            com.ss.android.socialbase.downloader.downloader.ae r10 = com.ss.android.socialbase.downloader.downloader.ae.xt(r9)     // Catch: java.lang.Throwable -> Lb5
            int r10 = r10.m(r11)     // Catch: java.lang.Throwable -> Lb5
            if (r10 != r1) goto Ld8
            goto Ld9
        Ld8:
            r1 = 0
        Ld9:
            java.lang.String r10 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.j     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r0 = "doCancel, updateNotification id = "
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r11 = r0.concat(r11)     // Catch: java.lang.Throwable -> Lb5
            com.ss.android.socialbase.downloader.m.j.cw(r10, r11)     // Catch: java.lang.Throwable -> Lb5
            r6.j(r4, r1)     // Catch: java.lang.Throwable -> Lb5
        Leb:
            return
        Lec:
            com.bytedance.sdk.component.utils.vl.j(r10)
            return
    }

    private void xt(android.app.NotificationManager r6, int r7, android.app.Notification r8) {
            r5 = this;
            boolean r0 = r5.j(r7, r8)
            if (r0 == 0) goto L76
            com.ss.android.socialbase.downloader.downloader.r r0 = com.ss.android.socialbase.downloader.downloader.r.j()     // Catch: java.lang.Throwable -> L18
            int r0 = r0.j(r7)     // Catch: java.lang.Throwable -> L18
            r1 = 1
            if (r0 != r1) goto L1a
            boolean r0 = com.ss.android.socialbase.downloader.az.m.cw()     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto L1a
            goto L1b
        L18:
            r0 = move-exception
            goto L72
        L1a:
            r1 = 0
        L1b:
            if (r1 != 0) goto L22
            int r0 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.xt     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto L22
            goto L28
        L22:
            if (r1 == 0) goto L8b
            int r0 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.cw     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto L8b
        L28:
            com.ss.android.socialbase.downloader.downloader.r r0 = com.ss.android.socialbase.downloader.downloader.r.j()     // Catch: java.lang.Throwable -> L18
            com.ss.android.socialbase.downloader.downloader.az r0 = r0.cw(r7)     // Catch: java.lang.Throwable -> L18
            boolean r2 = r0.ae()     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L62
            boolean r2 = r0.xt()     // Catch: java.lang.Throwable -> L18
            if (r2 != 0) goto L62
            java.lang.String r2 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.j     // Catch: java.lang.Throwable -> L18
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L18
            java.lang.String r4 = "doNotify, startForeground, ======== id = "
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L18
            r3.append(r7)     // Catch: java.lang.Throwable -> L18
            java.lang.String r4 = ", isIndependentProcess = "
            r3.append(r4)     // Catch: java.lang.Throwable -> L18
            r3.append(r1)     // Catch: java.lang.Throwable -> L18
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L18
            com.ss.android.socialbase.downloader.m.j.cw(r2, r3)     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L5c
            com.ss.android.socialbase.downloader.notification.DownloadNotificationService.cw = r7     // Catch: java.lang.Throwable -> L18
            goto L5e
        L5c:
            com.ss.android.socialbase.downloader.notification.DownloadNotificationService.xt = r7     // Catch: java.lang.Throwable -> L18
        L5e:
            r0.j(r7, r8)     // Catch: java.lang.Throwable -> L18
            goto L8b
        L62:
            java.lang.String r0 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.j     // Catch: java.lang.Throwable -> L18
            java.lang.String r2 = "doNotify: canStartForeground = true, but proxy can not startForeground, isIndependentProcess = "
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L18
            java.lang.String r1 = r2.concat(r1)     // Catch: java.lang.Throwable -> L18
            com.ss.android.socialbase.downloader.m.j.cw(r0, r1)     // Catch: java.lang.Throwable -> L18
            goto L8b
        L72:
            com.bytedance.sdk.component.utils.vl.j(r0)
            goto L8b
        L76:
            int r0 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.xt
            if (r0 == r7) goto L7e
            int r0 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.cw
            if (r0 != r7) goto L8b
        L7e:
            boolean r0 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.up
            if (r0 == 0) goto L8b
            int r0 = r8.flags
            r0 = r0 & 2
            if (r0 != 0) goto L8b
            r5.xt(r6, r7)
        L8b:
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L9a
            long r2 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.m     // Catch: java.lang.Throwable -> L9a
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 >= 0) goto L97
            com.ss.android.socialbase.downloader.notification.DownloadNotificationService.m = r0     // Catch: java.lang.Throwable -> L9a
        L97:
            r6.notify(r7, r8)     // Catch: java.lang.Throwable -> L9a
        L9a:
            return
    }

    static /* synthetic */ void xt(com.ss.android.socialbase.downloader.notification.DownloadNotificationService r0, android.app.NotificationManager r1, int r2) {
            r0.j(r1, r2)
            return
    }

    static /* synthetic */ void xt(com.ss.android.socialbase.downloader.notification.DownloadNotificationService r0, android.app.NotificationManager r1, int r2, android.app.Notification r3) {
            r0.j(r1, r2, r3)
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
            r7 = this;
            super.onCreate()
            r7.r()
            com.ss.android.socialbase.downloader.downloader.cw.j(r7)
            com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.cw()
            java.lang.String r1 = "download_service_foreground"
            r2 = 0
            int r1 = r0.j(r1, r2)
            r3 = 1
            r4 = -1
            r5 = 3
            if (r1 == r3) goto L1b
            if (r1 != r5) goto L21
        L1b:
            int r3 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.xt
            if (r3 != r4) goto L21
            com.ss.android.socialbase.downloader.notification.DownloadNotificationService.xt = r2
        L21:
            r3 = 2
            if (r1 == r3) goto L26
            if (r1 != r5) goto L2c
        L26:
            int r1 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.cw
            if (r1 != r4) goto L2c
            com.ss.android.socialbase.downloader.notification.DownloadNotificationService.cw = r2
        L2c:
            java.lang.String r1 = "non_going_notification_foreground"
            boolean r1 = r0.xt(r1, r2)
            com.ss.android.socialbase.downloader.notification.DownloadNotificationService.up = r1
            java.lang.String r1 = "notify_too_fast"
            boolean r1 = r0.xt(r1, r2)
            com.ss.android.socialbase.downloader.notification.DownloadNotificationService.tl = r1
            java.lang.String r1 = "notification_time_window"
            r2 = 900(0x384, double:4.447E-321)
            long r0 = r0.j(r1, r2)
            com.ss.android.socialbase.downloader.notification.DownloadNotificationService.g = r0
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 < 0) goto L54
            r4 = 1200(0x4b0, double:5.93E-321)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 <= 0) goto L53
            goto L54
        L53:
            return
        L54:
            com.ss.android.socialbase.downloader.notification.DownloadNotificationService.g = r2
            return
    }

    @Override // android.app.Service
    public void onDestroy() {
            r1 = this;
            super.onDestroy()
            com.ss.android.socialbase.downloader.ws.ae r0 = r1.oq
            if (r0 == 0) goto Ld
            r0.xt()     // Catch: java.lang.Throwable -> La
        La:
            r0 = 0
            r1.oq = r0
        Ld:
            return
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent r1, int r2, int r3) {
            r0 = this;
            r0.j(r1)
            r1 = 2
            return r1
    }
}
