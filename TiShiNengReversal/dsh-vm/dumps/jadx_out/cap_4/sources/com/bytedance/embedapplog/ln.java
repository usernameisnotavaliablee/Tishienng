package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ln {
    public ln() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String j(android.content.Context r9) {
            r0 = 0
            if (r9 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "applog_net_cache.dat"
            r2 = 0
            android.content.SharedPreferences r1 = com.bytedance.sdk.openadsdk.api.plugin.xt.xt(r9, r1, r2)
            r2 = 0
            java.lang.String r4 = "start_mills"
            long r2 = r1.getLong(r4, r2)
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r2
            r2 = 900000(0xdbba0, double:4.44659E-318)
            java.lang.String r7 = "access"
            int r8 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r8 >= 0) goto L2c
            java.lang.String r0 = r1.getString(r7, r0)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L2c
            return r0
        L2c:
            java.lang.String r9 = xt(r9)
            android.content.SharedPreferences$Editor r0 = r1.edit()
            boolean r1 = android.text.TextUtils.isEmpty(r9)
            if (r1 != 0) goto L3d
            r0.putString(r7, r9)
        L3d:
            long r1 = java.lang.System.currentTimeMillis()
            r0.putLong(r4, r1)
            r0.apply()
            return r9
    }

    private static java.lang.String xt(android.content.Context r3) {
            r0 = 0
            java.lang.String r1 = "connectivity"
            java.lang.Object r1 = r3.getSystemService(r1)     // Catch: java.lang.Throwable -> Le java.lang.SecurityException -> L10
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1     // Catch: java.lang.Throwable -> Le java.lang.SecurityException -> L10
            android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> Le java.lang.SecurityException -> L10
            goto L15
        Le:
            goto L14
        L10:
            r1 = move-exception
            com.bytedance.embedapplog.uc.xt(r1)
        L14:
            r1 = r0
        L15:
            if (r1 == 0) goto L43
            boolean r2 = r1.isAvailable()
            if (r2 == 0) goto L43
            int r1 = r1.getType()
            r2 = 1
            if (r2 != r1) goto L27
            java.lang.String r0 = "wifi"
            goto L43
        L27:
            if (r1 != 0) goto L43
            java.lang.String r0 = "phone"
            java.lang.Object r3 = r3.getSystemService(r0)
            android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3
            int r3 = r3.getNetworkType()
            switch(r3) {
                case 1: goto L41;
                case 2: goto L41;
                case 3: goto L3e;
                case 4: goto L41;
                case 5: goto L3e;
                case 6: goto L3e;
                case 7: goto L41;
                case 8: goto L3e;
                case 9: goto L3e;
                case 10: goto L3e;
                case 11: goto L41;
                case 12: goto L3e;
                case 13: goto L3b;
                case 14: goto L3e;
                case 15: goto L3e;
                case 16: goto L41;
                case 17: goto L3e;
                case 18: goto L3b;
                case 19: goto L3b;
                default: goto L38;
            }
        L38:
            java.lang.String r0 = "mobile"
            goto L43
        L3b:
            java.lang.String r0 = "4g"
            goto L43
        L3e:
            java.lang.String r0 = "3g"
            goto L43
        L41:
            java.lang.String r0 = "2g"
        L43:
            return r0
    }
}
