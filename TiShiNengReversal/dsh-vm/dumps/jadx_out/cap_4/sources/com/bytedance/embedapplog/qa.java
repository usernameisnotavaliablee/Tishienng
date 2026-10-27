package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class qa {
    private static volatile java.lang.String j;

    static {
            return
    }

    public qa() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String j(android.content.Context r5, com.bytedance.embedapplog.rn r6) {
            java.lang.String r0 = com.bytedance.embedapplog.qa.j
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L5c
            java.lang.Class<com.bytedance.embedapplog.qa> r0 = com.bytedance.embedapplog.qa.class
            monitor-enter(r0)
            java.lang.String r1 = com.bytedance.embedapplog.qa.j     // Catch: java.lang.Throwable -> L17
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L19
            java.lang.String r5 = com.bytedance.embedapplog.qa.j     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            return r5
        L17:
            r5 = move-exception
            goto L5a
        L19:
            r1 = 0
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r2 = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(r5)     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L31
            java.lang.String r2 = r2.getId()     // Catch: java.lang.Throwable -> L25
            goto L32
        L25:
            r2 = move-exception
            boolean r3 = r2 instanceof java.lang.ClassNotFoundException     // Catch: java.lang.Throwable -> L17
            if (r3 != 0) goto L31
            boolean r3 = r2 instanceof java.lang.NoClassDefFoundError     // Catch: java.lang.Throwable -> L17
            if (r3 != 0) goto L31
            com.bytedance.sdk.component.utils.vl.j(r2)     // Catch: java.lang.Throwable -> L17
        L31:
            r2 = r1
        L32:
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L17
            if (r3 == 0) goto L43
            android.content.SharedPreferences r5 = r6.r()     // Catch: java.lang.Throwable -> L17
            java.lang.String r6 = "google_aid"
            java.lang.String r2 = r5.getString(r6, r1)     // Catch: java.lang.Throwable -> L17
            goto L56
        L43:
            android.content.SharedPreferences r3 = r6.r()     // Catch: java.lang.Throwable -> L17
            java.lang.String r4 = "google_aid"
            java.lang.String r1 = r3.getString(r4, r1)     // Catch: java.lang.Throwable -> L17
            boolean r1 = android.text.TextUtils.equals(r1, r2)     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L56
            j(r5, r2, r6)     // Catch: java.lang.Throwable -> L17
        L56:
            com.bytedance.embedapplog.qa.j = r2     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            goto L5c
        L5a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r5
        L5c:
            java.lang.String r5 = com.bytedance.embedapplog.qa.j
            return r5
    }

    private static void j(android.content.Context r1, java.lang.String r2, com.bytedance.embedapplog.rn r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L1a
            if (r1 != 0) goto L9
            goto L1a
        L9:
            android.content.SharedPreferences r1 = r3.r()
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r3 = "google_aid"
            android.content.SharedPreferences$Editor r1 = r1.putString(r3, r2)
            r1.apply()
        L1a:
            return
    }
}
