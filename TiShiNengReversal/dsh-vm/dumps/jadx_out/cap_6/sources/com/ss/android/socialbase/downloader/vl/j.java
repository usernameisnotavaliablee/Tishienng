package com.ss.android.socialbase.downloader.vl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class j {
    private static volatile com.ss.android.socialbase.downloader.vl.j ae;
    private long cw;
    private volatile long j;
    private java.util.concurrent.atomic.AtomicBoolean m;
    private volatile com.ss.android.socialbase.downloader.ws.ae r;
    private final android.util.SparseArray<android.app.Notification> up;
    private volatile long xt;



    public j() {
            r2 = this;
            r2.<init>()
            r0 = 1000(0x3e8, double:4.94E-321)
            r2.cw = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r1 = 2
            r0.<init>(r1)
            r2.up = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2.m = r0
            return
    }

    public static com.ss.android.socialbase.downloader.vl.j j() {
            com.ss.android.socialbase.downloader.vl.j r0 = com.ss.android.socialbase.downloader.vl.j.ae
            if (r0 != 0) goto L19
            java.lang.Class<com.ss.android.socialbase.downloader.vl.j> r0 = com.ss.android.socialbase.downloader.vl.j.class
            monitor-enter(r0)
            com.ss.android.socialbase.downloader.vl.j r1 = com.ss.android.socialbase.downloader.vl.j.ae     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.ss.android.socialbase.downloader.vl.j r1 = new com.ss.android.socialbase.downloader.vl.j     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.ss.android.socialbase.downloader.vl.j.ae = r1     // Catch: java.lang.Throwable -> L13
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
            com.ss.android.socialbase.downloader.vl.j r0 = com.ss.android.socialbase.downloader.vl.j.ae
            return r0
    }

    private void j(android.app.NotificationManager r4, int r5) {
            r3 = this;
            android.util.SparseArray<android.app.Notification> r0 = r3.up
            monitor-enter(r0)
            android.util.SparseArray<android.app.Notification> r1 = r3.up     // Catch: java.lang.Throwable -> L17
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L17
            android.app.Notification r1 = (android.app.Notification) r1     // Catch: java.lang.Throwable -> L17
            android.util.SparseArray<android.app.Notification> r2 = r3.up     // Catch: java.lang.Throwable -> L17
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
            android.util.SparseArray<android.app.Notification> r0 = r7.up
            monitor-enter(r0)
            android.util.SparseArray<android.app.Notification> r1 = r7.up     // Catch: java.lang.Throwable -> L1a
            int r1 = r1.indexOfKey(r9)     // Catch: java.lang.Throwable -> L1a
            if (r1 < 0) goto L1c
            android.util.SparseArray<android.app.Notification> r2 = r7.up     // Catch: java.lang.Throwable -> L1a
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L1a
            if (r1 >= r2) goto L1c
            android.util.SparseArray<android.app.Notification> r8 = r7.up     // Catch: java.lang.Throwable -> L1a
            r8.setValueAt(r1, r10)     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            return
        L1a:
            r8 = move-exception
            goto L62
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            long r0 = r7.cw
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r7.j
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
            r7.xt = r4
            r7.j = r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L46
            r7.xt(r8, r9, r10)
            return
        L46:
            com.ss.android.socialbase.downloader.ws.ae r2 = r7.r
            if (r2 == 0) goto L61
            android.util.SparseArray<android.app.Notification> r2 = r7.up
            monitor-enter(r2)
            android.util.SparseArray<android.app.Notification> r3 = r7.up     // Catch: java.lang.Throwable -> L5e
            r3.put(r9, r10)     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5e
            com.ss.android.socialbase.downloader.ws.ae r10 = r7.r
            com.ss.android.socialbase.downloader.vl.j$2 r2 = new com.ss.android.socialbase.downloader.vl.j$2
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

    static /* synthetic */ void j(com.ss.android.socialbase.downloader.vl.j r0, android.app.NotificationManager r1, int r2) {
            r0.j(r1, r2)
            return
    }

    static /* synthetic */ void j(com.ss.android.socialbase.downloader.vl.j r0, android.content.Intent r1) {
            r0.xt(r1)
            return
    }

    private void xt(android.app.NotificationManager r1, int r2) {
            r0 = this;
            r1.cancel(r2)     // Catch: java.lang.Throwable -> L3
        L3:
            return
    }

    private void xt(android.app.NotificationManager r6, int r7, android.app.Notification r8) {
            r5 = this;
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lf
            long r2 = r5.j     // Catch: java.lang.Throwable -> Lf
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 >= 0) goto Lc
            r5.j = r0     // Catch: java.lang.Throwable -> Lf
        Lc:
            r6.notify(r7, r8)     // Catch: java.lang.Throwable -> Lf
        Lf:
            return
    }

    private void xt(android.content.Intent r9) {
            r8 = this;
            android.content.Context r0 = com.ss.android.socialbase.downloader.downloader.cw.nd()
            if (r0 != 0) goto L8
            goto L105
        L8:
            java.lang.String r1 = r9.getAction()
            java.lang.String r2 = "notification"
            java.lang.Object r2 = r0.getSystemService(r2)
            android.app.NotificationManager r2 = (android.app.NotificationManager) r2
            java.lang.String r3 = "DOWNLOAD_NOTIFICATION_BUNDLE_EXTRA_ID"
            r4 = 0
            int r3 = r9.getIntExtra(r3, r4)
            java.lang.String r5 = "android.ss.intent.action.DOWNLOAD_NOTIFICATION_NOTIFY"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L81
            java.lang.String r0 = "DOWNLOAD_NOTIFICATION_BUNDLE_EXTRA"
            android.os.Parcelable r0 = r9.getParcelableExtra(r0)
            android.app.Notification r0 = (android.app.Notification) r0
            java.lang.String r1 = "DOWNLOAD_NOTIFICATION_EXTRA_STATUS"
            int r9 = r9.getIntExtra(r1, r4)
            if (r3 == 0) goto L105
            if (r0 == 0) goto L105
            if (r2 == 0) goto L105
            r1 = 4
            if (r9 != r1) goto L72
            android.content.Context r9 = com.ss.android.socialbase.downloader.downloader.cw.nd()
            com.ss.android.socialbase.downloader.downloader.ae r9 = com.ss.android.socialbase.downloader.downloader.ae.xt(r9)
            boolean r9 = r9.ae(r3)
            if (r9 != 0) goto L4a
            goto L105
        L4a:
            android.content.Context r9 = com.ss.android.socialbase.downloader.downloader.cw.nd()
            com.ss.android.socialbase.downloader.downloader.ae r9 = com.ss.android.socialbase.downloader.downloader.ae.xt(r9)
            com.ss.android.socialbase.downloader.ae.cw r9 = r9.tl(r3)
            if (r9 == 0) goto L105
            boolean r1 = r9.j()
            if (r1 == 0) goto L105
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = r8.xt
            long r4 = r4 - r6
            long r6 = r8.cw
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 <= 0) goto L105
            r8.xt(r2, r3, r0)
            r9.xt()
            return
        L72:
            r1 = -2
            if (r9 == r1) goto L7d
            r1 = -3
            if (r9 != r1) goto L79
            goto L7d
        L79:
            r8.j(r2, r3, r0)
            return
        L7d:
            r8.j(r2, r3, r0)
            return
        L81:
            java.lang.String r9 = "android.ss.intent.action.DOWNLOAD_NOTIFICATION_CANCEL"
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L8f
            if (r3 == 0) goto L105
            r8.xt(r2, r3)
            return
        L8f:
            java.lang.String r9 = "android.net.conn.CONNECTIVITY_CHANGE"
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto Le4
            java.lang.String r9 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r9 = com.ss.android.socialbase.downloader.az.m.j(r0, r9)     // Catch: java.lang.Exception -> Lca
            if (r9 == 0) goto L105
            java.lang.String r9 = "connectivity"
            java.lang.Object r9 = r0.getSystemService(r9)     // Catch: java.lang.Exception -> Lca
            android.net.ConnectivityManager r9 = (android.net.ConnectivityManager) r9     // Catch: java.lang.Exception -> Lca
            if (r9 != 0) goto Laa
            goto L105
        Laa:
            android.net.NetworkInfo r9 = r9.getActiveNetworkInfo()     // Catch: java.lang.Exception -> Lca
            if (r9 == 0) goto L105
            boolean r9 = r9.isConnected()     // Catch: java.lang.Exception -> Lca
            if (r9 != 0) goto Lb7
            goto L105
        Lb7:
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Exception -> Lca
            r9.<init>()     // Catch: java.lang.Exception -> Lca
            java.lang.String r1 = com.ss.android.socialbase.downloader.xt.up.j     // Catch: java.lang.Exception -> Lca
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> Lca
            if (r1 != 0) goto Lcc
            java.lang.String r1 = com.ss.android.socialbase.downloader.xt.up.j     // Catch: java.lang.Exception -> Lca
            r9.add(r1)     // Catch: java.lang.Exception -> Lca
            goto Lcc
        Lca:
            r9 = move-exception
            goto Le0
        Lcc:
            java.lang.String r1 = "mime_type_plg"
            r9.add(r1)     // Catch: java.lang.Exception -> Lca
            com.ss.android.socialbase.downloader.downloader.ae r1 = com.ss.android.socialbase.downloader.downloader.ae.xt(r0)     // Catch: java.lang.Exception -> Lca
            r1.j(r9)     // Catch: java.lang.Exception -> Lca
            com.ss.android.socialbase.downloader.downloader.ae r0 = com.ss.android.socialbase.downloader.downloader.ae.xt(r0)     // Catch: java.lang.Exception -> Lca
            r0.xt(r9)     // Catch: java.lang.Exception -> Lca
            return
        Le0:
            com.bytedance.sdk.component.utils.vl.j(r9)
            return
        Le4:
            java.lang.String r9 = "android.intent.action.MEDIA_UNMOUNTED"
            boolean r9 = r9.equals(r1)
            if (r9 != 0) goto L106
            java.lang.String r9 = "android.intent.action.MEDIA_REMOVED"
            boolean r9 = r9.equals(r1)
            if (r9 != 0) goto L106
            java.lang.String r9 = "android.intent.action.MEDIA_BAD_REMOVAL"
            boolean r9 = r9.equals(r1)
            if (r9 != 0) goto L106
            java.lang.String r9 = "android.intent.action.MEDIA_EJECT"
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L105
            goto L106
        L105:
            return
        L106:
            android.content.Context r9 = com.ss.android.socialbase.downloader.downloader.cw.nd()     // Catch: java.lang.Exception -> L112
            com.ss.android.socialbase.downloader.downloader.ae r9 = com.ss.android.socialbase.downloader.downloader.ae.xt(r9)     // Catch: java.lang.Exception -> L112
            r9.j()     // Catch: java.lang.Exception -> L112
            return
        L112:
            r9 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r9)
            return
    }

    public void j(android.content.Intent r3) {
            r2 = this;
            if (r3 == 0) goto L1f
            java.lang.String r0 = r3.getAction()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Ld
            goto L1f
        Ld:
            r2.xt()
            com.ss.android.socialbase.downloader.ws.ae r0 = r2.r
            if (r0 != 0) goto L15
            goto L1f
        L15:
            com.ss.android.socialbase.downloader.ws.ae r0 = r2.r
            com.ss.android.socialbase.downloader.vl.j$1 r1 = new com.ss.android.socialbase.downloader.vl.j$1
            r1.<init>(r2, r3)
            r0.j(r1)
        L1f:
            return
    }

    public void xt() {
            r7 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.m
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 != 0) goto Lb
            goto L34
        Lb:
            com.ss.android.socialbase.downloader.ws.ae r0 = new com.ss.android.socialbase.downloader.ws.ae
            java.lang.String r1 = "DownloaderNotifyThread"
            r0.<init>(r1)
            r7.r = r0
            com.ss.android.socialbase.downloader.ws.ae r0 = r7.r
            r0.j()
            com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.cw()
            java.lang.String r1 = "notification_time_window"
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0.j(r1, r2)
            r7.cw = r0
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 < 0) goto L35
            r4 = 1200(0x4b0, double:5.93E-321)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 <= 0) goto L34
            goto L35
        L34:
            return
        L35:
            r7.cw = r2
            return
    }
}
