package com.beizi.ad.internal.h;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class r {

    /* renamed from: i, reason: collision with root package name */
    private static com.beizi.ad.internal.h.r f6911i;
    public boolean a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f6912b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f6913c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f6914d;

    /* renamed from: e, reason: collision with root package name */
    public long f6915e;

    /* renamed from: f, reason: collision with root package name */
    private com.beizi.ad.model.f.d f6916f;

    /* renamed from: g, reason: collision with root package name */
    private com.beizi.ad.model.f.c f6917g;

    /* renamed from: h, reason: collision with root package name */
    private int f6918h;

    /* renamed from: j, reason: collision with root package name */
    private com.beizi.fusion.model.EnvInfo f6919j;

    static {
            return
    }

    private r() {
            r2 = this;
            r2.<init>()
            com.beizi.ad.model.f$d r0 = com.beizi.ad.model.f.d.f7448f
            r2.f6916f = r0
            com.beizi.ad.model.f$c r0 = com.beizi.ad.model.f.c.f7441e
            r2.f6917g = r0
            r0 = 1
            r2.a = r0
            r0 = -1
            r2.f6918h = r0
            java.lang.String r0 = "WGS84"
            r2.f6914d = r0
            com.beizi.fusion.c.b r0 = com.beizi.fusion.c.b.a()
            android.content.Context r0 = r0.e()
            if (r0 != 0) goto L20
            goto L26
        L20:
            com.beizi.fusion.model.RequestInfo r0 = com.beizi.fusion.model.RequestInfo.getInstance(r0)
            if (r0 != 0) goto L27
        L26:
            return
        L27:
            boolean r1 = r0.isInit
            if (r1 != 0) goto L2e
            r0.init()
        L2e:
            com.beizi.fusion.model.EnvInfo r0 = r0.getEnvInfo()
            r2.f6919j = r0
            return
    }

    public static synchronized com.beizi.ad.internal.h.r a() {
            java.lang.Class<com.beizi.ad.internal.h.r> r0 = com.beizi.ad.internal.h.r.class
            monitor-enter(r0)
            com.beizi.ad.internal.h.r r1 = com.beizi.ad.internal.h.r.f6911i     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L1e
            java.lang.Class<com.beizi.ad.internal.h.r> r1 = com.beizi.ad.internal.h.r.class
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L1c
            com.beizi.ad.internal.h.r r2 = com.beizi.ad.internal.h.r.f6911i     // Catch: java.lang.Throwable -> L16
            if (r2 != 0) goto L18
            com.beizi.ad.internal.h.r r2 = new com.beizi.ad.internal.h.r     // Catch: java.lang.Throwable -> L16
            r2.<init>()     // Catch: java.lang.Throwable -> L16
            com.beizi.ad.internal.h.r.f6911i = r2     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r2 = move-exception
            goto L1a
        L18:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
            goto L1e
        L1a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
            throw r2     // Catch: java.lang.Throwable -> L1c
        L1c:
            r1 = move-exception
            goto L22
        L1e:
            com.beizi.ad.internal.h.r r1 = com.beizi.ad.internal.h.r.f6911i     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)
            return r1
        L22:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            throw r1
    }

    private void e() {
            r2 = this;
            com.beizi.ad.g r0 = com.beizi.ad.f.a()
            if (r0 != 0) goto L7
            goto L11
        L7:
            com.beizi.ad.g r0 = com.beizi.ad.f.a()
            com.beizi.ad.model.BeiZiLocation r0 = r0.b()
            if (r0 != 0) goto L12
        L11:
            return
        L12:
            java.lang.String r1 = r0.getLongitude()
            r2.f6912b = r1
            java.lang.String r1 = r0.getLatitude()
            r2.f6913c = r1
            java.lang.String r1 = r0.getType()
            r2.f6914d = r1
            long r0 = r0.getTime()
            r2.f6915e = r0
            return
    }

    public com.beizi.ad.model.f.d b() {
            r3 = this;
            com.beizi.ad.model.f$d r0 = r3.f6916f
            com.beizi.ad.model.f$d r1 = com.beizi.ad.model.f.d.f7448f
            if (r0 != r1) goto L66
            com.beizi.fusion.model.EnvInfo r0 = r3.f6919j
            if (r0 == 0) goto L5a
            java.lang.String r0 = r0.getNet()
            java.lang.String r2 = "1"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L1b
            com.beizi.ad.model.f$d r0 = com.beizi.ad.model.f.d.f7444b
            r3.f6916f = r0
            goto L66
        L1b:
            java.lang.String r2 = "2"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L28
            com.beizi.ad.model.f$d r0 = com.beizi.ad.model.f.d.f7445c
            r3.f6916f = r0
            goto L66
        L28:
            java.lang.String r2 = "3"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L35
            com.beizi.ad.model.f$d r0 = com.beizi.ad.model.f.d.f7446d
            r3.f6916f = r0
            goto L66
        L35:
            java.lang.String r2 = "4"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L42
            com.beizi.ad.model.f$d r0 = com.beizi.ad.model.f.d.f7447e
            r3.f6916f = r0
            goto L66
        L42:
            java.lang.String r2 = "5"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L4d
            r3.f6916f = r1
            goto L66
        L4d:
            java.lang.String r1 = "6"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L66
            com.beizi.ad.model.f$d r0 = com.beizi.ad.model.f.d.f7449g
            r3.f6916f = r0
            goto L66
        L5a:
            com.beizi.ad.internal.h r0 = com.beizi.ad.internal.h.a()
            android.content.Context r0 = r0.f6837j
            com.beizi.ad.model.f$d r0 = com.beizi.ad.internal.h.s.b(r0)
            r3.f6916f = r0
        L66:
            com.beizi.ad.model.f$d r0 = r3.f6916f
            return r0
    }

    public com.beizi.ad.model.f.c c() {
            r3 = this;
            com.beizi.ad.model.f$c r0 = r3.f6917g
            com.beizi.ad.model.f$c r1 = com.beizi.ad.model.f.c.f7441e
            if (r0 != r1) goto L9f
            com.beizi.fusion.model.EnvInfo r2 = r3.f6919j
            if (r2 == 0) goto L44
            java.lang.String r0 = r2.getIsp()
            java.lang.String r1 = "0"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L1c
            com.beizi.ad.model.f$c r0 = com.beizi.ad.model.f.c.a
            r3.f6917g = r0
            goto L9f
        L1c:
            java.lang.String r1 = "1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L2a
            com.beizi.ad.model.f$c r0 = com.beizi.ad.model.f.c.f7438b
            r3.f6917g = r0
            goto L9f
        L2a:
            java.lang.String r1 = "2"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L37
            com.beizi.ad.model.f$c r0 = com.beizi.ad.model.f.c.f7439c
            r3.f6917g = r0
            goto L9f
        L37:
            java.lang.String r1 = "3"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L9f
            com.beizi.ad.model.f$c r0 = com.beizi.ad.model.f.c.f7440d
            r3.f6917g = r0
            goto L9f
        L44:
            if (r0 != r1) goto L9f
            com.beizi.ad.internal.h r0 = com.beizi.ad.internal.h.a()     // Catch: java.lang.Exception -> L9f
            android.content.Context r0 = r0.f6837j     // Catch: java.lang.Exception -> L9f
            java.lang.String r1 = "phone"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Exception -> L9f
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch: java.lang.Exception -> L9f
            if (r0 == 0) goto L9f
            int r1 = r0.getSimState()     // Catch: java.lang.Exception -> L9f
            r2 = 5
            if (r2 != r1) goto L9f
            java.lang.String r0 = r0.getSimOperator()     // Catch: java.lang.Exception -> L9f
            if (r0 == 0) goto L9b
            java.lang.String r1 = "46000"
            boolean r1 = r0.equals(r1)     // Catch: java.lang.Exception -> L9f
            if (r1 != 0) goto L96
            java.lang.String r1 = "46002"
            boolean r1 = r0.equals(r1)     // Catch: java.lang.Exception -> L9f
            if (r1 != 0) goto L96
            java.lang.String r1 = "46007"
            boolean r1 = r0.equals(r1)     // Catch: java.lang.Exception -> L9f
            if (r1 == 0) goto L7c
            goto L96
        L7c:
            java.lang.String r1 = "46001"
            boolean r1 = r0.equals(r1)     // Catch: java.lang.Exception -> L9f
            if (r1 == 0) goto L89
            com.beizi.ad.model.f$c r0 = com.beizi.ad.model.f.c.f7439c     // Catch: java.lang.Exception -> L9f
            r3.f6917g = r0     // Catch: java.lang.Exception -> L9f
            goto L9f
        L89:
            java.lang.String r1 = "46003"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L9f
            if (r0 == 0) goto L9f
            com.beizi.ad.model.f$c r0 = com.beizi.ad.model.f.c.f7440d     // Catch: java.lang.Exception -> L9f
            r3.f6917g = r0     // Catch: java.lang.Exception -> L9f
            goto L9f
        L96:
            com.beizi.ad.model.f$c r0 = com.beizi.ad.model.f.c.f7438b     // Catch: java.lang.Exception -> L9f
            r3.f6917g = r0     // Catch: java.lang.Exception -> L9f
            goto L9f
        L9b:
            com.beizi.ad.model.f$c r0 = com.beizi.ad.model.f.c.a     // Catch: java.lang.Exception -> L9f
            r3.f6917g = r0     // Catch: java.lang.Exception -> L9f
        L9f:
            com.beizi.ad.model.f$c r0 = r3.f6917g
            return r0
    }

    @android.annotation.SuppressLint({"MissingPermission"})
    public void d() {
            r9 = this;
            java.lang.String r0 = r9.f6912b     // Catch: java.lang.Exception -> Laf
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> Laf
            if (r0 == 0) goto Laf
            java.lang.String r0 = r9.f6913c     // Catch: java.lang.Exception -> Laf
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> Laf
            if (r0 != 0) goto L12
            goto Laf
        L12:
            com.beizi.ad.g r0 = com.beizi.ad.f.a()     // Catch: java.lang.Exception -> Laf
            if (r0 == 0) goto L27
            com.beizi.ad.g r0 = com.beizi.ad.f.a()     // Catch: java.lang.Exception -> Laf
            boolean r0 = r0.a()     // Catch: java.lang.Exception -> Laf
            if (r0 == 0) goto L23
            goto L27
        L23:
            r9.e()     // Catch: java.lang.Exception -> Laf
            return
        L27:
            com.beizi.ad.internal.h r0 = com.beizi.ad.internal.h.a()     // Catch: java.lang.Exception -> Laf
            android.content.Context r0 = r0.e()     // Catch: java.lang.Exception -> Laf
            java.lang.String r1 = "android.permission.ACCESS_FINE_LOCATION"
            int r1 = r0.checkCallingOrSelfPermission(r1)     // Catch: java.lang.Exception -> Laf
            if (r1 == 0) goto L44
            java.lang.String r1 = "android.permission.ACCESS_COARSE_LOCATION"
            int r1 = r0.checkCallingOrSelfPermission(r1)     // Catch: java.lang.Exception -> Laf
            if (r1 != 0) goto L40
            goto L44
        L40:
            r9.e()     // Catch: java.lang.Exception -> Laf
            return
        L44:
            java.lang.String r1 = "location"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Exception -> Laf
            android.location.LocationManager r0 = (android.location.LocationManager) r0     // Catch: java.lang.Exception -> Laf
            if (r0 != 0) goto L4f
            goto Laf
        L4f:
            r1 = 1
            java.util.List r1 = r0.getProviders(r1)     // Catch: java.lang.Exception -> Laf
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> Laf
            r2 = 0
        L59:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Exception -> Laf
            if (r3 == 0) goto L8f
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Exception -> Laf
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> Laf
            android.location.Location r3 = r0.getLastKnownLocation(r3)     // Catch: java.lang.Exception -> Laf
            if (r3 != 0) goto L6c
            goto L59
        L6c:
            if (r2 != 0) goto L6f
            goto L8d
        L6f:
            long r4 = r3.getTime()     // Catch: java.lang.Exception -> Laf
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L59
            long r4 = r2.getTime()     // Catch: java.lang.Exception -> Laf
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L59
            long r4 = r3.getTime()     // Catch: java.lang.Exception -> Laf
            long r6 = r2.getTime()     // Catch: java.lang.Exception -> Laf
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L59
        L8d:
            r2 = r3
            goto L59
        L8f:
            if (r2 == 0) goto Lac
            double r0 = r2.getLongitude()     // Catch: java.lang.Exception -> Laf
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Exception -> Laf
            r9.f6912b = r0     // Catch: java.lang.Exception -> Laf
            double r0 = r2.getLatitude()     // Catch: java.lang.Exception -> Laf
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Exception -> Laf
            r9.f6913c = r0     // Catch: java.lang.Exception -> Laf
            long r0 = r2.getTime()     // Catch: java.lang.Exception -> Laf
            r9.f6915e = r0     // Catch: java.lang.Exception -> Laf
            return
        Lac:
            r9.e()     // Catch: java.lang.Exception -> Laf
        Laf:
            return
    }
}
