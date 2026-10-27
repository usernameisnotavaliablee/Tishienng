package com.amap.api.location;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class UmidtokenInfo {
    static android.os.Handler a;

    /* renamed from: b, reason: collision with root package name */
    static java.lang.String f4965b;

    /* renamed from: c, reason: collision with root package name */
    static boolean f4966c;

    /* renamed from: d, reason: collision with root package name */
    private static com.amap.api.location.AMapLocationClient f4967d;

    /* renamed from: e, reason: collision with root package name */
    private static long f4968e;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a implements com.amap.api.location.AMapLocationListener {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.amap.api.location.AMapLocationListener
        public final void onLocationChanged(com.amap.api.location.AMapLocation r3) {
                r2 = this;
                com.amap.api.location.AMapLocationClient r3 = com.amap.api.location.UmidtokenInfo.a()     // Catch: java.lang.Throwable -> L14
                if (r3 == 0) goto L16
                android.os.Handler r3 = com.amap.api.location.UmidtokenInfo.a     // Catch: java.lang.Throwable -> L14
                r0 = 0
                r3.removeCallbacksAndMessages(r0)     // Catch: java.lang.Throwable -> L14
                com.amap.api.location.AMapLocationClient r3 = com.amap.api.location.UmidtokenInfo.a()     // Catch: java.lang.Throwable -> L14
                r3.onDestroy()     // Catch: java.lang.Throwable -> L14
                return
            L14:
                r3 = move-exception
                goto L17
            L16:
                return
            L17:
                java.lang.String r0 = "UmidListener"
                java.lang.String r1 = "onLocationChanged"
                com.autonavi.aps.amapapi.utils.b.a(r3, r0, r1)
                return
        }
    }

    static {
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            com.amap.api.location.UmidtokenInfo.a = r0
            r0 = 0
            com.amap.api.location.UmidtokenInfo.f4965b = r0
            r0 = 30000(0x7530, double:1.4822E-319)
            com.amap.api.location.UmidtokenInfo.f4968e = r0
            r0 = 1
            com.amap.api.location.UmidtokenInfo.f4966c = r0
            return
    }

    public UmidtokenInfo() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ com.amap.api.location.AMapLocationClient a() {
            com.amap.api.location.AMapLocationClient r0 = com.amap.api.location.UmidtokenInfo.f4967d
            return r0
    }

    public static java.lang.String getUmidtoken() {
            java.lang.String r0 = com.amap.api.location.UmidtokenInfo.f4965b
            return r0
    }

    public static void setLocAble(boolean r0) {
            com.amap.api.location.UmidtokenInfo.f4966c = r0
            return
    }

    public static synchronized void setUmidtoken(android.content.Context r3, java.lang.String r4) {
            java.lang.Class<com.amap.api.location.UmidtokenInfo> r0 = com.amap.api.location.UmidtokenInfo.class
            monitor-enter(r0)
            com.amap.api.location.UmidtokenInfo.f4965b = r4     // Catch: java.lang.Throwable -> L45
            com.amap.api.col.p0003l.i4.s(r4)     // Catch: java.lang.Throwable -> L45
            com.amap.api.location.AMapLocationClient r4 = com.amap.api.location.UmidtokenInfo.f4967d     // Catch: java.lang.Throwable -> L45
            if (r4 != 0) goto L47
            boolean r4 = com.amap.api.location.UmidtokenInfo.f4966c     // Catch: java.lang.Throwable -> L45
            if (r4 == 0) goto L47
            com.amap.api.location.UmidtokenInfo$a r4 = new com.amap.api.location.UmidtokenInfo$a     // Catch: java.lang.Throwable -> L45
            r4.<init>()     // Catch: java.lang.Throwable -> L45
            com.amap.api.location.AMapLocationClient r1 = new com.amap.api.location.AMapLocationClient     // Catch: java.lang.Throwable -> L45
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L45
            com.amap.api.location.UmidtokenInfo.f4967d = r1     // Catch: java.lang.Throwable -> L45
            com.amap.api.location.AMapLocationClientOption r3 = new com.amap.api.location.AMapLocationClientOption     // Catch: java.lang.Throwable -> L45
            r3.<init>()     // Catch: java.lang.Throwable -> L45
            r1 = 1
            r3.setOnceLocation(r1)     // Catch: java.lang.Throwable -> L45
            r1 = 0
            r3.setNeedAddress(r1)     // Catch: java.lang.Throwable -> L45
            com.amap.api.location.AMapLocationClient r1 = com.amap.api.location.UmidtokenInfo.f4967d     // Catch: java.lang.Throwable -> L45
            r1.setLocationOption(r3)     // Catch: java.lang.Throwable -> L45
            com.amap.api.location.AMapLocationClient r3 = com.amap.api.location.UmidtokenInfo.f4967d     // Catch: java.lang.Throwable -> L45
            r3.setLocationListener(r4)     // Catch: java.lang.Throwable -> L45
            com.amap.api.location.AMapLocationClient r3 = com.amap.api.location.UmidtokenInfo.f4967d     // Catch: java.lang.Throwable -> L45
            r3.startLocation()     // Catch: java.lang.Throwable -> L45
            android.os.Handler r3 = com.amap.api.location.UmidtokenInfo.a     // Catch: java.lang.Throwable -> L45
            com.amap.api.location.UmidtokenInfo$1 r4 = new com.amap.api.location.UmidtokenInfo$1     // Catch: java.lang.Throwable -> L45
            r4.<init>()     // Catch: java.lang.Throwable -> L45
            r1 = 30000(0x7530, double:1.4822E-319)
            r3.postDelayed(r4, r1)     // Catch: java.lang.Throwable -> L45
            goto L47
        L45:
            r3 = move-exception
            goto L49
        L47:
            monitor-exit(r0)
            return
        L49:
            java.lang.String r4 = "UmidListener"
            java.lang.String r1 = "setUmidtoken"
            com.autonavi.aps.amapapi.utils.b.a(r3, r4, r1)     // Catch: java.lang.Throwable -> L52
            monitor-exit(r0)
            return
        L52:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L52
            throw r3
    }
}
