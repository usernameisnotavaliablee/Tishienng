package com.bxkj.base.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class u {
    public u() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean a(android.content.Context r0) {
            android.content.Context r0 = r0.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            androidx.core.app.NotificationManagerCompat r0 = androidx.core.app.NotificationManagerCompat.from(r0)
            boolean r0 = r0.areNotificationsEnabled()
            return r0
    }

    public static void b(android.app.Activity r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L28
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "android.settings.APP_NOTIFICATION_SETTINGS"
            r0.setAction(r1)
            java.lang.String r1 = "android.provider.extra.APP_PACKAGE"
            java.lang.String r2 = r3.getPackageName()
            r0.putExtra(r1, r2)
            android.content.pm.ApplicationInfo r1 = r3.getApplicationInfo()
            int r1 = r1.uid
            java.lang.String r2 = "android.provider.extra.CHANNEL_ID"
            r0.putExtra(r2, r1)
            r3.startActivity(r0)
            return
        L28:
            com.bxkj.base.util.v.o(r3)
            return
    }

    public static void c(androidx.fragment.app.FragmentActivity r3, t.b.a r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L31
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "android.settings.APP_NOTIFICATION_SETTINGS"
            r0.setAction(r1)
            java.lang.String r1 = "android.provider.extra.APP_PACKAGE"
            java.lang.String r2 = r3.getPackageName()
            r0.putExtra(r1, r2)
            android.content.pm.ApplicationInfo r1 = r3.getApplicationInfo()
            int r1 = r1.uid
            java.lang.String r2 = "android.provider.extra.CHANNEL_ID"
            r0.putExtra(r2, r1)
            t.b r1 = new t.b
            r1.<init>(r3)
            t.b r3 = r1.startActivityForResult(r0)
            r3.c(r4)
            return
        L31:
            com.bxkj.base.util.v.p(r3, r4)
            return
    }
}
