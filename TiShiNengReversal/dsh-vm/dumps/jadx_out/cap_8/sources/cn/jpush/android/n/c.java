package cn.jpush.android.n;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c {
    private static long a;

    static {
            return
    }

    public c() {
            r1 = this;
            r1.<init>()
            return
    }

    @android.annotation.SuppressLint({"MissingPermission"})
    public static android.location.Location a(android.content.Context r7, android.location.LocationManager r8, boolean r9) {
            if (r9 == 0) goto L12
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = cn.jpush.android.n.c.a
            long r0 = r0 - r2
            r2 = 30000(0x7530, double:1.4822E-319)
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 >= 0) goto L10
            goto L12
        L10:
            r9 = 0
            goto L13
        L12:
            r9 = 1
        L13:
            if (r8 == 0) goto L9b
            boolean r7 = a(r7, r8)
            if (r7 == 0) goto L9b
            if (r9 == 0) goto L9b
            long r0 = java.lang.System.currentTimeMillis()
            cn.jpush.android.n.c.a = r0
            java.lang.String r7 = "gps"
            android.location.Location r7 = r8.getLastKnownLocation(r7)
            java.lang.String r9 = "network"
            android.location.Location r9 = r8.getLastKnownLocation(r9)
            java.lang.String r0 = "passive"
            android.location.Location r8 = r8.getLastKnownLocation(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "gpsLocation:"
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "GeoLocHelper"
            cn.jpush.android.helper.Logger.v(r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "netLocation:"
            r0.append(r2)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            cn.jpush.android.helper.Logger.v(r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "passLocation:"
            r0.append(r2)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            cn.jpush.android.helper.Logger.v(r1, r0)
            r0 = 0
            if (r7 != 0) goto L79
            r2 = r0
            goto L7d
        L79:
            long r2 = r7.getTime()
        L7d:
            if (r9 != 0) goto L81
            r4 = r0
            goto L85
        L81:
            long r4 = r9.getTime()
        L85:
            if (r8 != 0) goto L88
            goto L8c
        L88:
            long r0 = r8.getTime()
        L8c:
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L95
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r9 <= 0) goto L9a
            return r7
        L95:
            int r7 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r7 <= 0) goto L9a
            return r9
        L9a:
            return r8
        L9b:
            r7 = 0
            return r7
    }

    public static boolean a(android.content.Context r3, android.location.LocationManager r4) {
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r0 = cn.jpush.android.ad.a.a(r3, r0)
            java.lang.String r1 = "GeoLocHelper"
            r2 = 0
            if (r0 != 0) goto L16
            java.lang.String r3 = "Require the permissionandroid.permission.ACCESS_FINE_LOCATION"
            cn.jpush.android.helper.Logger.w(r1, r3)
            java.lang.String r3 = "No location permission!"
            cn.jpush.android.helper.Logger.dd(r1, r3)
            return r2
        L16:
            boolean r0 = cn.jpush.android.local.JPushConstants.canGetLbsInBackGround(r3)
            if (r0 != 0) goto L22
            java.lang.String r3 = "can not get lbs in background"
            cn.jpush.android.helper.Logger.ww(r1, r3)
            return r2
        L22:
            boolean r3 = cn.jpush.android.helper.JCoreHelper.geoEnable(r3)
            if (r3 != 0) goto L2e
            java.lang.String r3 = "lbs is disable by user"
            cn.jpush.android.helper.Logger.ww(r1, r3)
            return r2
        L2e:
            if (r4 == 0) goto L6e
            java.lang.String r3 = "gps"
            boolean r3 = r4.isProviderEnabled(r3)     // Catch: java.lang.Throwable -> L4a java.lang.IllegalArgumentException -> L63 java.lang.SecurityException -> L69
            if (r3 != 0) goto L4c
            java.lang.String r3 = "network"
            boolean r3 = r4.isProviderEnabled(r3)     // Catch: java.lang.Throwable -> L4a java.lang.IllegalArgumentException -> L63 java.lang.SecurityException -> L69
            if (r3 != 0) goto L4c
            java.lang.String r3 = "passive"
            boolean r3 = r4.isProviderEnabled(r3)     // Catch: java.lang.Throwable -> L4a java.lang.IllegalArgumentException -> L63 java.lang.SecurityException -> L69
            if (r3 == 0) goto L49
            goto L4c
        L49:
            return r2
        L4a:
            r3 = move-exception
            goto L4e
        L4c:
            r3 = 1
            return r3
        L4e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Check GPS enable failed:"
            r4.append(r0)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            cn.jpush.android.helper.Logger.ww(r1, r3)
            return r2
        L63:
            java.lang.String r3 = "The provider [gps] is illegal argument!"
            cn.jpush.android.helper.Logger.ww(r1, r3)
            return r2
        L69:
            java.lang.String r3 = "No suitable permission is present when get GPS_PROVIDER!"
            cn.jpush.android.helper.Logger.ww(r1, r3)
        L6e:
            return r2
    }
}
