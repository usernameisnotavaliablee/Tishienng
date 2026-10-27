package com.ss.android.socialbase.downloader.downloader;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DownloadReceiver extends android.content.BroadcastReceiver {
    private static final java.lang.String j = "DownloadReceiver";



    static {
            return
    }

    public DownloadReceiver() {
            r0 = this;
            r0.<init>()
            return
    }

    private void j(android.content.Context r3, java.lang.String r4) {
            r2 = this;
            boolean r0 = com.ss.android.socialbase.downloader.downloader.cw.rn()
            if (r0 != 0) goto L7
            return
        L7:
            com.ss.android.socialbase.downloader.downloader.DownloadReceiver$1 r0 = new com.ss.android.socialbase.downloader.downloader.DownloadReceiver$1
            r0.<init>(r2, r3, r4)
            r3 = 2000(0x7d0, double:9.88E-321)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.ss.android.socialbase.downloader.downloader.cw.j(r0, r3, r1)
            return
    }

    private void xt(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.DownloadReceiver$2 r0 = new com.ss.android.socialbase.downloader.downloader.DownloadReceiver$2
            r0.<init>(r1, r2, r3)
            com.ss.android.socialbase.downloader.downloader.cw.j(r0)
            return
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context r3, android.content.Intent r4) {
            r2 = this;
            if (r3 == 0) goto L4c
            if (r4 != 0) goto L5
            goto L4c
        L5:
            java.lang.String r4 = r4.getAction()
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L10
            goto L4c
        L10:
            java.lang.String r0 = "android.net.conn.CONNECTIVITY_CHANGE"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L29
            boolean r0 = com.ss.android.socialbase.downloader.m.j.j()
            if (r0 == 0) goto L25
            java.lang.String r0 = com.ss.android.socialbase.downloader.downloader.DownloadReceiver.j
            java.lang.String r1 = "Received broadcast intent for android.net.conn.CONNECTIVITY_CHANGE"
            com.ss.android.socialbase.downloader.m.j.j(r0, r1)
        L25:
            r2.j(r3, r4)
            return
        L29:
            java.lang.String r0 = "android.intent.action.MEDIA_UNMOUNTED"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L49
            java.lang.String r0 = "android.intent.action.MEDIA_REMOVED"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L49
            java.lang.String r0 = "android.intent.action.MEDIA_BAD_REMOVAL"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L49
            java.lang.String r0 = "android.intent.action.MEDIA_EJECT"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L4c
        L49:
            r2.xt(r3, r4)
        L4c:
            return
    }
}
