package com.ss.android.socialbase.appdownloader.view;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class DownloadHandleNotificationActivity extends android.app.Activity {
    private static final java.lang.String[] b = null;
    private com.ss.android.socialbase.appdownloader.DownloadHandlerService a;

    static {
            r0 = 41636(0xa2a4, float:5.8344E-41)
            com.stub.StubApp.interface11(r0)
            java.lang.String r0 = "android.permission.POST_NOTIFICATIONS"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            com.ss.android.socialbase.appdownloader.view.DownloadHandleNotificationActivity.b = r0
            return
    }

    public DownloadHandleNotificationActivity() {
            r1 = this;
            r1.<init>()
            com.ss.android.socialbase.appdownloader.DownloadHandlerService r0 = new com.ss.android.socialbase.appdownloader.DownloadHandlerService
            r0.<init>()
            r1.a = r0
            return
    }

    private void a() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Le
            r1 = 23
            if (r0 < r1) goto L10
            java.lang.String[] r0 = com.ss.android.socialbase.appdownloader.view.DownloadHandleNotificationActivity.b     // Catch: java.lang.Throwable -> Le
            r1 = 1000(0x3e8, float:1.401E-42)
            com.ss.android.socialbase.appdownloader.view.a.a(r2, r0, r1)     // Catch: java.lang.Throwable -> Le
            return
        Le:
            r0 = move-exception
            goto L11
        L10:
            return
        L11:
            java.lang.String r1 = "requestNotificationPermissionError:"
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r1.concat(r0)
            java.lang.String r1 = "DownloadNotificationJumpActivity"
            com.ss.android.socialbase.downloader.m.j.xt(r1, r0)
            return
    }

    @Override // android.app.Activity
    protected native void onCreate(android.os.Bundle r1);

    @Override // android.app.Activity
    public native void onRequestPermissionsResult(int r1, java.lang.String[] r2, int[] r3);
}
