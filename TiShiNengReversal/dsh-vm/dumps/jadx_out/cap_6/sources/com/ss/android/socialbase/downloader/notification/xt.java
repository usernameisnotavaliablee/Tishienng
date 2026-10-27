package com.ss.android.socialbase.downloader.notification;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class xt {
    private static volatile com.ss.android.socialbase.downloader.notification.xt cw;
    private static final java.lang.Object up = null;
    private final long j;
    private final android.util.SparseArray<com.ss.android.socialbase.downloader.notification.j> m;
    private final java.util.Set<java.lang.String> r;
    private final java.util.Map<java.lang.Integer, java.lang.Long> xt;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.ss.android.socialbase.downloader.notification.xt.up = r0
            return
    }

    private xt() {
            r2 = this;
            r2.<init>()
            r0 = 1000(0x3e8, double:4.94E-321)
            r2.j = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.xt = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r2.r = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r2.m = r0
            return
    }

    static boolean cw(com.ss.android.socialbase.downloader.ae.cw r1) {
            boolean r0 = r1.hw()
            if (r0 == 0) goto L12
            int r1 = r1.qo()
            boolean r1 = xt(r1)
            if (r1 == 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    public static com.ss.android.socialbase.downloader.notification.xt j() {
            com.ss.android.socialbase.downloader.notification.xt r0 = com.ss.android.socialbase.downloader.notification.xt.cw
            if (r0 != 0) goto L19
            java.lang.Class<com.ss.android.socialbase.downloader.notification.xt> r0 = com.ss.android.socialbase.downloader.notification.xt.class
            monitor-enter(r0)
            com.ss.android.socialbase.downloader.notification.xt r1 = com.ss.android.socialbase.downloader.notification.xt.cw     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.ss.android.socialbase.downloader.notification.xt r1 = new com.ss.android.socialbase.downloader.notification.xt     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.ss.android.socialbase.downloader.notification.xt.cw = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.ss.android.socialbase.downloader.notification.xt r0 = com.ss.android.socialbase.downloader.notification.xt.cw
            return r0
    }

    static boolean xt(int r2) {
            r0 = 1
            if (r2 == r0) goto L9
            r1 = 3
            if (r2 != r1) goto L7
            goto L9
        L7:
            r2 = 0
            return r2
        L9:
            return r0
    }

    public void cw(int r5) {
            r4 = this;
            java.lang.String r0 = "enable_target_34"
            android.content.Context r1 = com.ss.android.socialbase.downloader.downloader.cw.nd()
            if (r1 == 0) goto L48
            if (r5 != 0) goto Lb
            goto L48
        Lb:
            android.content.Intent r2 = new android.content.Intent
            java.lang.Class<com.ss.android.socialbase.downloader.notification.DownloadNotificationService> r3 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.class
            r2.<init>(r1, r3)
            java.lang.String r3 = "android.ss.intent.action.DOWNLOAD_NOTIFICATION_CANCEL"
            r2.setAction(r3)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r3 = "DOWNLOAD_NOTIFICATION_BUNDLE_EXTRA_ID"
            r2.putExtra(r3, r5)     // Catch: java.lang.Throwable -> L2e
            com.ss.android.socialbase.downloader.jy.j r5 = com.ss.android.socialbase.downloader.jy.j.cw()     // Catch: java.lang.Throwable -> L2e
            int r5 = r5.xt(r0)     // Catch: java.lang.Throwable -> L2e
            if (r5 <= 0) goto L30
            com.ss.android.socialbase.downloader.vl.j r5 = com.ss.android.socialbase.downloader.vl.j.j()     // Catch: java.lang.Throwable -> L2e
            r5.j(r2)     // Catch: java.lang.Throwable -> L2e
            return
        L2e:
            r5 = move-exception
            goto L34
        L30:
            r1.startService(r2)     // Catch: java.lang.Throwable -> L2e
            return
        L34:
            com.bytedance.sdk.component.utils.vl.j(r5)
            com.ss.android.socialbase.downloader.jy.j r5 = com.ss.android.socialbase.downloader.jy.j.cw()
            int r5 = r5.xt(r0)
            if (r5 <= 0) goto L48
            com.ss.android.socialbase.downloader.vl.j r5 = com.ss.android.socialbase.downloader.vl.j.j()
            r5.j(r2)
        L48:
            return
    }

    public void j(int r2) {
            r1 = this;
            android.content.Context r0 = com.ss.android.socialbase.downloader.downloader.cw.nd()
            com.ss.android.socialbase.downloader.downloader.ae r0 = com.ss.android.socialbase.downloader.downloader.ae.xt(r0)
            com.ss.android.socialbase.downloader.ae.cw r2 = r0.tl(r2)
            if (r2 != 0) goto Lf
            return
        Lf:
            r1.j(r2)
            r1.xt(r2)
            return
    }

    public void j(int r10, int r11, android.app.Notification r12) {
            r9 = this;
            android.content.Context r0 = com.ss.android.socialbase.downloader.downloader.cw.nd()
            if (r0 == 0) goto L94
            if (r10 == 0) goto L94
            if (r12 != 0) goto Lc
            goto L94
        Lc:
            r1 = 4
            if (r11 != r1) goto L49
            java.util.Map<java.lang.Integer, java.lang.Long> r1 = r9.xt
            monitor-enter(r1)
            java.util.Map<java.lang.Integer, java.lang.Long> r2 = r9.xt     // Catch: java.lang.Throwable -> L36
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L36
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L36
            java.lang.Long r2 = (java.lang.Long) r2     // Catch: java.lang.Throwable -> L36
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L36
            if (r2 == 0) goto L38
            long r5 = r2.longValue()     // Catch: java.lang.Throwable -> L36
            long r5 = r3 - r5
            long r5 = java.lang.Math.abs(r5)     // Catch: java.lang.Throwable -> L36
            r7 = 1000(0x3e8, double:4.94E-321)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 >= 0) goto L38
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L36
            return
        L36:
            r10 = move-exception
            goto L47
        L38:
            java.util.Map<java.lang.Integer, java.lang.Long> r2 = r9.xt     // Catch: java.lang.Throwable -> L36
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L36
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L36
            r2.put(r5, r3)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L36
            goto L49
        L47:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L36
            throw r10
        L49:
            android.content.Intent r1 = new android.content.Intent
            java.lang.Class<com.ss.android.socialbase.downloader.notification.DownloadNotificationService> r2 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.class
            r1.<init>(r0, r2)
            java.lang.String r2 = "android.ss.intent.action.DOWNLOAD_NOTIFICATION_NOTIFY"
            r1.setAction(r2)     // Catch: java.lang.Throwable -> L78
            java.lang.String r2 = "DOWNLOAD_NOTIFICATION_EXTRA_STATUS"
            r1.putExtra(r2, r11)     // Catch: java.lang.Throwable -> L78
            java.lang.String r11 = "DOWNLOAD_NOTIFICATION_BUNDLE_EXTRA_ID"
            r1.putExtra(r11, r10)     // Catch: java.lang.Throwable -> L78
            java.lang.String r10 = "DOWNLOAD_NOTIFICATION_BUNDLE_EXTRA"
            r1.putExtra(r10, r12)     // Catch: java.lang.Throwable -> L78
            com.ss.android.socialbase.downloader.jy.j r10 = com.ss.android.socialbase.downloader.jy.j.cw()     // Catch: java.lang.Throwable -> L78
            java.lang.String r11 = "enable_target_34"
            int r10 = r10.xt(r11)     // Catch: java.lang.Throwable -> L78
            if (r10 <= 0) goto L7a
            com.ss.android.socialbase.downloader.vl.j r10 = com.ss.android.socialbase.downloader.vl.j.j()     // Catch: java.lang.Throwable -> L78
            r10.j(r1)     // Catch: java.lang.Throwable -> L78
            return
        L78:
            r10 = move-exception
            goto L7e
        L7a:
            r0.startService(r1)     // Catch: java.lang.Throwable -> L78
            return
        L7e:
            com.bytedance.sdk.component.utils.vl.j(r10)
            com.ss.android.socialbase.downloader.jy.j r10 = com.ss.android.socialbase.downloader.jy.j.cw()
            java.lang.String r11 = "enable_target_34"
            int r10 = r10.xt(r11)
            if (r10 <= 0) goto L94
            com.ss.android.socialbase.downloader.vl.j r10 = com.ss.android.socialbase.downloader.vl.j.j()
            r10.j(r1)
        L94:
            return
    }

    void j(com.ss.android.socialbase.downloader.ae.cw r3) {
            r2 = this;
            com.ss.android.socialbase.downloader.downloader.vl r0 = com.ss.android.socialbase.downloader.downloader.cw.x()
            if (r0 != 0) goto L7
            goto L19
        L7:
            boolean r1 = r3.hw()
            if (r1 == 0) goto L19
            r1 = 3
            r3.m(r1)
            r0.j(r3)     // Catch: android.database.sqlite.SQLiteException -> L15
            return
        L15:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)
        L19:
            return
    }

    public void j(com.ss.android.socialbase.downloader.notification.j r4) {
            r3 = this;
            if (r4 != 0) goto L3
            return
        L3:
            android.util.SparseArray<com.ss.android.socialbase.downloader.notification.j> r0 = r3.m
            monitor-enter(r0)
            android.util.SparseArray<com.ss.android.socialbase.downloader.notification.j> r1 = r3.m     // Catch: java.lang.Throwable -> L11
            int r2 = r4.j()     // Catch: java.lang.Throwable -> L11
            r1.put(r2, r4)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L11:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r4
    }

    public void m(int r2) {
            r1 = this;
            r1.r(r2)
            if (r2 == 0) goto Lc
            com.ss.android.socialbase.downloader.notification.xt r0 = j()
            r0.cw(r2)
        Lc:
            return
    }

    public com.ss.android.socialbase.downloader.notification.j r(int r4) {
            r3 = this;
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            android.util.SparseArray<com.ss.android.socialbase.downloader.notification.j> r0 = r3.m
            monitor-enter(r0)
            android.util.SparseArray<com.ss.android.socialbase.downloader.notification.j> r1 = r3.m     // Catch: java.lang.Throwable -> L24
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L24
            com.ss.android.socialbase.downloader.notification.j r1 = (com.ss.android.socialbase.downloader.notification.j) r1     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L26
            android.util.SparseArray<com.ss.android.socialbase.downloader.notification.j> r2 = r3.m     // Catch: java.lang.Throwable -> L24
            r2.remove(r4)     // Catch: java.lang.Throwable -> L24
            java.lang.String r2 = "removeNotificationId "
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L24
            java.lang.String r4 = r2.concat(r4)     // Catch: java.lang.Throwable -> L24
            com.ss.android.socialbase.downloader.m.j.j(r4)     // Catch: java.lang.Throwable -> L24
            goto L26
        L24:
            r4 = move-exception
            goto L28
        L26:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            return r1
        L28:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            throw r4
    }

    public com.ss.android.socialbase.downloader.notification.j up(int r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            android.util.SparseArray<com.ss.android.socialbase.downloader.notification.j> r0 = r2.m
            monitor-enter(r0)
            android.util.SparseArray<com.ss.android.socialbase.downloader.notification.j> r1 = r2.m     // Catch: java.lang.Throwable -> L11
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.Throwable -> L11
            com.ss.android.socialbase.downloader.notification.j r3 = (com.ss.android.socialbase.downloader.notification.j) r3     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r3
        L11:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r3
    }

    android.util.SparseArray<com.ss.android.socialbase.downloader.notification.j> xt() {
            r2 = this;
            android.util.SparseArray<com.ss.android.socialbase.downloader.notification.j> r0 = r2.m
            monitor-enter(r0)
            android.util.SparseArray<com.ss.android.socialbase.downloader.notification.j> r1 = r2.m     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    void xt(com.ss.android.socialbase.downloader.ae.cw r2) {
            r1 = this;
            boolean r0 = cw(r2)
            if (r0 == 0) goto Ld
            int r2 = r2.ae()
            r1.m(r2)
        Ld:
            return
    }
}
