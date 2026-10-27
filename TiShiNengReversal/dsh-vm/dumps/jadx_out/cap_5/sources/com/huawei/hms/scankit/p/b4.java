package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class b4 {
    public static boolean a;
    public static java.lang.String b;

    static {
            return
    }

    public b4() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a() {
            java.lang.String r0 = android.os.Build.VERSION.RELEASE
            return r0
    }

    public static java.lang.String a(android.content.Context r3) {
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r3.getSystemService(r0)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()
            if (r0 == 0) goto L18
            int r1 = r0.getType()
            r2 = 1
            if (r1 != r2) goto L18
            java.lang.String r3 = "wifi"
            return r3
        L18:
            if (r0 == 0) goto L57
            int r1 = r0.getType()
            if (r1 != 0) goto L57
            java.lang.String r0 = r0.getSubtypeName()
            java.lang.String r1 = "phone"
            java.lang.Object r3 = r3.getSystemService(r1)
            android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3
            int r3 = r3.getNetworkType()
            java.lang.String r1 = "3G"
            switch(r3) {
                case 1: goto L54;
                case 2: goto L54;
                case 3: goto L53;
                case 4: goto L54;
                case 5: goto L53;
                case 6: goto L53;
                case 7: goto L54;
                case 8: goto L53;
                case 9: goto L53;
                case 10: goto L53;
                case 11: goto L54;
                case 12: goto L53;
                case 13: goto L50;
                case 14: goto L53;
                case 15: goto L53;
                default: goto L35;
            }
        L35:
            java.lang.String r3 = "TD-SCDMA"
            boolean r3 = r0.equalsIgnoreCase(r3)
            if (r3 != 0) goto L4f
            java.lang.String r3 = "WCDMA"
            boolean r3 = r0.equalsIgnoreCase(r3)
            if (r3 != 0) goto L4f
            java.lang.String r3 = "CDMA2000"
            boolean r3 = r0.equalsIgnoreCase(r3)
            if (r3 == 0) goto L4e
            goto L4f
        L4e:
            return r0
        L4f:
            return r1
        L50:
            java.lang.String r3 = "4G"
            return r3
        L53:
            return r1
        L54:
            java.lang.String r3 = "2G"
            return r3
        L57:
            java.lang.String r3 = "Unknown"
            return r3
    }

    public static java.lang.String a(android.content.Context r1, boolean r2) {
            com.huawei.hms.scankit.p.a1 r0 = new com.huawei.hms.scankit.p.a1
            r0.<init>(r1, r2)
            java.lang.String r1 = r0.a()
            return r1
    }

    public static java.lang.String b() {
            java.lang.String r0 = ""
            return r0
    }

    public static java.lang.String b(android.content.Context r1) {
            java.lang.String r0 = "phone"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1
            java.lang.String r1 = r1.getNetworkOperator()
            return r1
    }

    public static java.lang.String c() {
            java.lang.String r0 = android.os.Build.MODEL
            return r0
    }

    public static java.lang.String d() {
            java.lang.String r0 = ""
            r1 = 0
            java.lang.String r2 = "android.os.SystemProperties"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L24 java.lang.Throwable -> L25
            java.lang.String r3 = "get"
            r4 = 1
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L24 java.lang.Throwable -> L25
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r7 = 0
            r5[r7] = r6     // Catch: java.lang.Throwable -> L24 java.lang.Throwable -> L25
            java.lang.reflect.Method r3 = r2.getDeclaredMethod(r3, r5)     // Catch: java.lang.Throwable -> L24 java.lang.Throwable -> L25
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L24 java.lang.Throwable -> L25
            java.lang.String r5 = "ro.build.version.emui"
            r4[r7] = r5     // Catch: java.lang.Throwable -> L24 java.lang.Throwable -> L25
            java.lang.Object r2 = r3.invoke(r2, r4)     // Catch: java.lang.Throwable -> L24 java.lang.Throwable -> L25
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L24 java.lang.Throwable -> L25
            return r2
        L24:
            return r0
        L25:
            return r1
    }
}
