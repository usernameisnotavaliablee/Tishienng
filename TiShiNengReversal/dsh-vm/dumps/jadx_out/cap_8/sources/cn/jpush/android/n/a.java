package cn.jpush.android.n;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a {
    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(android.content.Context r9, java.lang.String r10) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onGeofenceReceived,geos:"
            r0.append(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "GeoCallbackHelper"
            cn.jpush.android.helper.Logger.dd(r1, r0)
            r5 = 0
            r7 = 0
            java.lang.String r3 = "cn.jpush.android.intent.GEO_RECEIVED"
            r2 = r9
            r4 = r10
            a(r2, r3, r4, r5, r7)
            return
    }

    public static void a(android.content.Context r9, java.lang.String r10, double r11, double r13) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onGeofenceRegion,geo:"
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = ",lat:"
            r0.append(r1)
            r0.append(r11)
            java.lang.String r1 = ",lng:"
            r0.append(r1)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "GeoCallbackHelper"
            cn.jpush.android.helper.Logger.dd(r1, r0)
            java.lang.String r3 = "cn.jpush.android.intent.GEO_REGION"
            r2 = r9
            r4 = r10
            r5 = r11
            r7 = r13
            a(r2, r3, r4, r5, r7)
            return
    }

    public static void a(android.content.Context r3, java.lang.String r4, java.lang.String r5, double r6, double r8) {
            java.lang.String r0 = "GeoCallbackHelper"
            if (r3 != 0) goto L5
            return
        L5:
            java.lang.String r1 = cn.jpush.android.local.JPushConstants.getMessageReceiverClass(r3)     // Catch: java.lang.Throwable -> L2e
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L2e
            if (r2 != 0) goto L30
            android.content.Intent r2 = new android.content.Intent     // Catch: java.lang.Throwable -> L2e
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L2e
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L2e
            r2.setAction(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r4 = "geo"
            r2.putExtra(r4, r5)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r4 = "geoLat"
            r2.putExtra(r4, r6)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r4 = "geoLng"
            r2.putExtra(r4, r8)     // Catch: java.lang.Throwable -> L2e
            cn.jpush.android.helper.a.a(r3, r2)     // Catch: java.lang.Throwable -> L2e
            return
        L2e:
            r3 = move-exception
            goto L36
        L30:
            java.lang.String r3 = "not found messageReceiver"
            cn.jpush.android.helper.Logger.d(r0, r3)     // Catch: java.lang.Throwable -> L2e
            return
        L36:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "onResult error:"
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            cn.jpush.android.helper.Logger.ww(r0, r3)
            return
    }
}
