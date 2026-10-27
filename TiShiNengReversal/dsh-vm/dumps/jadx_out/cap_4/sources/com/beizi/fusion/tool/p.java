package com.beizi.fusion.tool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class p {
    public p() {
            r1 = this;
            r1.<init>()
            return
    }

    public static int a(android.content.Context r2) {
            java.lang.String r0 = "phone"
            java.lang.Object r2 = r2.getSystemService(r0)     // Catch: java.lang.Throwable -> L44
            android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2     // Catch: java.lang.Throwable -> L44
            int r0 = r2.getSimState()     // Catch: java.lang.Throwable -> L44
            r1 = 5
            if (r1 != r0) goto L44
            java.lang.String r2 = r2.getSimOperator()     // Catch: java.lang.Throwable -> L44
            if (r2 == 0) goto L44
            java.lang.String r0 = "46000"
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> L44
            if (r0 != 0) goto L42
            java.lang.String r0 = "46002"
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> L44
            if (r0 != 0) goto L42
            java.lang.String r0 = "46007"
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L2e
            goto L42
        L2e:
            java.lang.String r0 = "46001"
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L38
            r2 = 2
            return r2
        L38:
            java.lang.String r0 = "46003"
            boolean r2 = r2.equals(r0)     // Catch: java.lang.Throwable -> L44
            if (r2 == 0) goto L44
            r2 = 3
            return r2
        L42:
            r2 = 1
            return r2
        L44:
            r2 = 0
            return r2
    }

    public static java.lang.String a() {
            java.lang.String r0 = android.os.Build.BRAND     // Catch: java.lang.Exception -> L3
            return r0
        L3:
            java.lang.String r0 = ""
            return r0
    }

    public static int b(android.content.Context r0) {
            int r0 = c(r0)
            return r0
    }

    public static java.lang.String b() {
            java.lang.String r0 = android.os.Build.MODEL     // Catch: java.lang.Exception -> L3
            return r0
        L3:
            java.lang.String r0 = ""
            return r0
    }

    public static int c(android.content.Context r3) {
            r0 = 5
            if (r3 != 0) goto L4
            return r0
        L4:
            android.content.Context r3 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L54
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)     // Catch: java.lang.Throwable -> L54
            java.lang.String r1 = "connectivity"
            java.lang.Object r3 = r3.getSystemService(r1)     // Catch: java.lang.Throwable -> L54
            android.net.ConnectivityManager r3 = (android.net.ConnectivityManager) r3     // Catch: java.lang.Throwable -> L54
            if (r3 == 0) goto L54
            android.net.NetworkInfo r3 = r3.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> L54
            if (r3 == 0) goto L54
            int r1 = r3.getType()     // Catch: java.lang.Throwable -> L54
            r2 = 1
            if (r2 != r1) goto L25
            r3 = 4
            return r3
        L25:
            if (r1 != 0) goto L54
            int r1 = r3.getSubtype()     // Catch: java.lang.Throwable -> L54
            java.lang.String r3 = r3.getSubtypeName()     // Catch: java.lang.Throwable -> L54
            switch(r1) {
                case 1: goto L52;
                case 2: goto L52;
                case 3: goto L51;
                case 4: goto L52;
                case 5: goto L51;
                case 6: goto L51;
                case 7: goto L52;
                case 8: goto L51;
                case 9: goto L51;
                case 10: goto L51;
                case 11: goto L52;
                case 12: goto L51;
                case 13: goto L4f;
                case 14: goto L51;
                case 15: goto L51;
                case 16: goto L52;
                case 17: goto L51;
                case 18: goto L4f;
                case 19: goto L32;
                case 20: goto L4d;
                default: goto L32;
            }     // Catch: java.lang.Throwable -> L54
        L32:
            java.lang.String r1 = "TD-SCDMA"
            boolean r1 = r3.equalsIgnoreCase(r1)     // Catch: java.lang.Throwable -> L54
            if (r1 != 0) goto L4c
            java.lang.String r1 = "WCDMA"
            boolean r1 = r3.equalsIgnoreCase(r1)     // Catch: java.lang.Throwable -> L54
            if (r1 != 0) goto L4c
            java.lang.String r1 = "CDMA2000"
            boolean r3 = r3.equalsIgnoreCase(r1)     // Catch: java.lang.Throwable -> L54
            if (r3 == 0) goto L4b
            goto L4c
        L4b:
            return r0
        L4c:
            return r2
        L4d:
            r3 = 3
            return r3
        L4f:
            r3 = 2
            return r3
        L51:
            return r2
        L52:
            r3 = 6
            return r3
        L54:
            return r0
    }

    public static java.lang.String c() {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L1e
            r0.<init>()     // Catch: java.lang.Exception -> L1e
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L1e
            r0.append(r1)     // Catch: java.lang.Exception -> L1e
            java.lang.String r1 = "("
            r0.append(r1)     // Catch: java.lang.Exception -> L1e
            java.lang.String r1 = android.os.Build.VERSION.RELEASE     // Catch: java.lang.Exception -> L1e
            r0.append(r1)     // Catch: java.lang.Exception -> L1e
            java.lang.String r1 = ")"
            r0.append(r1)     // Catch: java.lang.Exception -> L1e
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L1e
            return r0
        L1e:
            java.lang.String r0 = ""
            return r0
    }

    public static java.lang.String d() {
            java.lang.String r0 = android.os.Build.MANUFACTURER     // Catch: java.lang.Exception -> L3
            return r0
        L3:
            java.lang.String r0 = ""
            return r0
    }

    public static java.lang.String d(android.content.Context r4) {
            java.lang.String r0 = "2"
            java.lang.String r1 = "1"
            android.content.Context r2 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L1c
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r3 = "phone"
            java.lang.Object r2 = r2.getSystemService(r3)     // Catch: java.lang.Throwable -> L1c
            android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2     // Catch: java.lang.Throwable -> L1c
            int r4 = r2.getPhoneType()     // Catch: java.lang.Throwable -> L1c
            if (r4 == 0) goto L1b
            return r1
        L1b:
            return r0
        L1c:
            android.content.res.Resources r4 = r4.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            int r4 = r4.screenLayout
            r4 = r4 & 15
            r2 = 4
            if (r4 == r2) goto L30
            r2 = 3
            if (r4 == r2) goto L30
            r0 = r1
        L30:
            return r0
    }
}
