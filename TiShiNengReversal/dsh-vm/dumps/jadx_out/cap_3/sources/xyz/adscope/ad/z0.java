package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class z0 implements xyz.adscope.ad.p2 {
    private xyz.adscope.ad.a2 a;
    private xyz.adscope.ad.publish.ASNPInitConfig b;
    private final android.content.Context c;
    private java.lang.String d;
    private xyz.adscope.common.v2.dev.IDeviceInterface e;
    private xyz.adscope.ad.c f;

    public z0(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r1.c = r2
            xyz.adscope.ad.k r0 = xyz.adscope.ad.k.a()
            java.lang.Object r2 = r0.getOrCreateImplement(r2)
            xyz.adscope.ad.j r2 = (xyz.adscope.ad.j) r2
            if (r2 == 0) goto L17
            xyz.adscope.common.v2.dev.IDeviceInterface r2 = r2.b()
            r1.e = r2
        L17:
            return
    }

    private org.json.JSONArray a(xyz.adscope.ad.publish.ASNPInitConfig r3) {
            r2 = this;
            if (r3 == 0) goto L17
            java.util.Map r3 = r3.getOptionFields()
            if (r3 == 0) goto L17
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L17
            java.lang.String r0 = "id"
            java.lang.String r1 = "name"
            org.json.JSONArray r3 = xyz.adscope.common.v2.tool.json.JsonUtil.parseMap2JsonByKeys(r3, r0, r1)
            return r3
        L17:
            org.json.JSONArray r3 = xyz.adscope.common.v2.tool.json.JsonUtil.emptyJSONArray()
            return r3
    }

    private xyz.adscope.ad.i5 a(xyz.adscope.common.v2.dev.IDeviceInterface r3) {
            r2 = this;
            if (r3 == 0) goto L70
            xyz.adscope.ad.i5 r0 = new xyz.adscope.ad.i5
            r0.<init>()
            java.lang.String r1 = r3.getDeviceName()
            r0.b(r1)
            java.lang.String r1 = r3.getFileMark()
            r0.c(r1)
            java.lang.String r1 = r3.getPhysicalMemory()
            r0.g(r1)
            java.lang.String r1 = r3.getDeviceUpdateMark()
            r0.j(r1)
            java.lang.String r1 = r3.getHardDisk()
            r0.d(r1)
            android.content.Context r1 = r2.c
            java.lang.String r1 = xyz.adscope.ad.f0.a(r1)
            r0.i(r1)
            java.lang.String r1 = r3.getHonorOAID()
            r0.e(r1)
            int r1 = r3.getDeveloperTag()
            r0.a(r1)
            int r1 = r3.getPromptTag()
            r0.b(r1)
            java.lang.String r1 = r3.getOMERomVersion()
            r0.h(r1)
            xyz.adscope.ad.publish.ASNPInitConfig r1 = r2.b
            if (r1 == 0) goto L61
            boolean r1 = r1.canUseOAIDInfo()
            if (r1 == 0) goto L61
            java.lang.String r3 = r3.getOAID()
            r0.f(r3)
            goto L66
        L61:
            java.lang.String r3 = ""
            r0.f(r3)
        L66:
            xyz.adscope.ad.publish.ASNPInitConfig r3 = r2.b
            java.lang.String r3 = r3.getCustomOAID()
            r0.a(r3)
            return r0
        L70:
            r3 = 0
            return r3
    }

    private java.util.List<xyz.adscope.ad.e5> b() {
            r6 = this;
            xyz.adscope.ad.k r0 = xyz.adscope.ad.k.a()
            android.content.Context r1 = r6.c
            java.lang.Object r0 = r0.getOrCreateImplement(r1)
            xyz.adscope.ad.j r0 = (xyz.adscope.ad.j) r0
            java.util.List r0 = r0.a()
            if (r0 == 0) goto L4c
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L4c
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L21:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L4b
            java.lang.Object r2 = r0.next()
            xyz.adscope.ad.c1 r2 = (xyz.adscope.ad.c1) r2
            xyz.adscope.ad.e5 r3 = new xyz.adscope.ad.e5
            r3.<init>()
            java.lang.String r4 = r2.d()
            r3.a(r4)
            java.lang.String r4 = r2.b()
            r3.b(r4)
            long r4 = r2.c()
            r3.a(r4)
            r1.add(r3)
            goto L21
        L4b:
            return r1
        L4c:
            r0 = 0
            return r0
    }

    private xyz.adscope.ad.g5 c() {
            r2 = this;
            xyz.adscope.ad.g5 r0 = new xyz.adscope.ad.g5
            r0.<init>()
            java.util.List r1 = r2.b()
            r0.a(r1)
            return r0
    }

    private xyz.adscope.ad.f5 d() {
            r3 = this;
            xyz.adscope.ad.f5 r0 = new xyz.adscope.ad.f5
            r0.<init>()
            xyz.adscope.ad.publish.ASNPInitConfig r1 = r3.b
            if (r1 == 0) goto Le
            java.lang.String r1 = r1.getAppId()
            goto L10
        Le:
            java.lang.String r1 = ""
        L10:
            r0.a(r1)
            android.content.Context r1 = r3.c
            java.lang.String r1 = r1.getPackageName()
            r0.b(r1)
            android.content.Context r1 = r3.c
            long r1 = xyz.adscope.common.v2.dev.info.PackageUtil.getAppInstallDate(r1)
            r0.a(r1)
            android.content.Context r1 = r3.c
            java.lang.String r1 = xyz.adscope.common.v2.dev.info.PackageUtil.getAppName(r1)
            r0.c(r1)
            android.content.Context r1 = r3.c
            long r1 = xyz.adscope.common.v2.dev.info.PackageUtil.getAppLastUpdateTime(r1)
            r0.b(r1)
            android.content.Context r1 = r3.c
            java.lang.String r1 = xyz.adscope.common.v2.dev.info.PackageUtil.getAppVersionName(r1)
            r0.d(r1)
            return r0
    }

    private xyz.adscope.ad.h5 e() {
            r2 = this;
            xyz.adscope.ad.h5 r0 = new xyz.adscope.ad.h5
            r0.<init>()
            xyz.adscope.ad.f5 r1 = r2.d()
            r0.a(r1)
            xyz.adscope.ad.g5 r1 = r2.c()
            r0.a(r1)
            xyz.adscope.ad.k5 r1 = r2.f()
            r0.a(r1)
            xyz.adscope.ad.m5 r1 = r2.h()
            r0.a(r1)
            xyz.adscope.ad.p5 r1 = r2.i()
            r0.a(r1)
            return r0
    }

    private xyz.adscope.ad.k5 f() {
            r3 = this;
            xyz.adscope.ad.k5 r0 = new xyz.adscope.ad.k5
            xyz.adscope.common.v2.dev.IDeviceInterface r1 = r3.e
            r0.<init>(r1)
            xyz.adscope.common.v2.dev.IDeviceInterface r1 = r3.e
            xyz.adscope.ad.i5 r1 = r3.a(r1)
            r0.a(r1)
            xyz.adscope.common.v2.location.LocationManager r1 = xyz.adscope.common.v2.location.LocationManager.getInstance()
            android.content.Context r2 = r3.c
            java.lang.Object r1 = r1.getOrCreateImplement(r2)
            xyz.adscope.common.v2.location.ILocationHolder r1 = (xyz.adscope.common.v2.location.ILocationHolder) r1
            xyz.adscope.common.v2.location.ILocation r1 = r1.getLastKnownLocation()
            if (r1 == 0) goto L2a
            xyz.adscope.ad.j5 r2 = new xyz.adscope.ad.j5
            r2.<init>(r1)
            r0.a(r2)
        L2a:
            xyz.adscope.ad.publish.ASNPInitConfig r1 = r3.b
            if (r1 == 0) goto L39
            boolean r1 = r1.canUseOAIDInfo()
            if (r1 == 0) goto L39
            r1 = 0
            r0.a(r1)
            return r0
        L39:
            r1 = 1
            r0.a(r1)
            return r0
    }

    private java.util.List<xyz.adscope.ad.l5> g() {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            xyz.adscope.ad.publish.ASNPInitConfig r1 = r5.b
            if (r1 == 0) goto L35
            xyz.adscope.ad.l5 r1 = new xyz.adscope.ad.l5
            r1.<init>()
            r2 = 1
            r1.a(r2)
            xyz.adscope.ad.a2 r3 = r5.a
            if (r3 == 0) goto L1b
            long r3 = r3.getTimeoutMillion()
            goto L1d
        L1b:
            r3 = 5000(0x1388, double:2.4703E-320)
        L1d:
            r1.a(r3)
            xyz.adscope.ad.a2 r3 = r5.a
            if (r3 == 0) goto L28
            int r2 = r3.getAdCount()
        L28:
            r1.b(r2)
            xyz.adscope.ad.o5 r2 = r5.k()
            r1.a(r2)
            r0.add(r1)
        L35:
            return r0
    }

    private xyz.adscope.ad.m5 h() {
            r2 = this;
            xyz.adscope.ad.m5 r0 = new xyz.adscope.ad.m5
            r0.<init>()
            xyz.adscope.ad.publish.ASNPInitConfig r1 = r2.b
            if (r1 == 0) goto L22
            int r1 = r1.getCCPAAuthorise()
            r0.a(r1)
            xyz.adscope.ad.publish.ASNPInitConfig r1 = r2.b
            int r1 = r1.getCOPPAAuthorise()
            r0.b(r1)
            xyz.adscope.ad.publish.ASNPInitConfig r1 = r2.b
            int r1 = r1.getGDPRAuthorise()
            r0.c(r1)
        L22:
            return r0
    }

    private xyz.adscope.ad.p5 i() {
            r2 = this;
            xyz.adscope.ad.p5 r0 = new xyz.adscope.ad.p5
            r0.<init>()
            xyz.adscope.ad.publish.ASNPInitConfig r1 = r2.b
            if (r1 == 0) goto Le
            java.lang.String r1 = r1.getUserId()
            goto L10
        Le:
            java.lang.String r1 = ""
        L10:
            r0.a(r1)
            xyz.adscope.ad.publish.ASNPInitConfig r1 = r2.b
            org.json.JSONArray r1 = r2.a(r1)
            r0.a(r1)
            xyz.adscope.ad.publish.ASNPInitConfig r1 = r2.b
            if (r1 == 0) goto L28
            boolean r1 = r1.isSupportSensor()
            if (r1 == 0) goto L28
            r1 = 0
            goto L29
        L28:
            r1 = 1
        L29:
            r0.a(r1)
            return r0
    }

    private xyz.adscope.ad.n5 j() {
            r3 = this;
            xyz.adscope.ad.n5 r0 = new xyz.adscope.ad.n5
            r0.<init>()
            xyz.adscope.ad.m0 r1 = xyz.adscope.ad.m0.a()
            android.content.Context r2 = r3.c
            java.lang.Object r1 = r1.getOrCreateImplement(r2)
            xyz.adscope.ad.l0 r1 = (xyz.adscope.ad.l0) r1
            if (r1 == 0) goto L1c
            xyz.adscope.ad.c r2 = r3.f
            java.util.List r1 = r1.b(r2)
            r0.a(r1)
        L1c:
            return r0
    }

    private xyz.adscope.ad.o5 k() {
            r2 = this;
            xyz.adscope.ad.o5 r0 = new xyz.adscope.ad.o5
            r0.<init>()
            xyz.adscope.ad.n5 r1 = r2.j()
            r0.a(r1)
            java.lang.String r1 = xyz.adscope.ad.f0.a()
            r0.a(r1)
            java.lang.String r1 = xyz.adscope.ad.f0.c()
            r0.b(r1)
            xyz.adscope.ad.a2 r1 = r2.a
            if (r1 == 0) goto L23
            java.lang.String r1 = r1.getSpaceID()
            goto L25
        L23:
            java.lang.String r1 = ""
        L25:
            r0.c(r1)
            return r0
    }

    @Override // xyz.adscope.ad.p2
    public java.lang.String a() {
            r3 = this;
            xyz.adscope.ad.a2 r0 = r3.a
            if (r0 == 0) goto L61
            xyz.adscope.ad.publish.ASNPInitConfig r0 = r3.b
            if (r0 == 0) goto L61
            xyz.adscope.ad.a1 r0 = new xyz.adscope.ad.a1
            r0.<init>()
            r1 = 1
            r0.a(r1)
            xyz.adscope.ad.h5 r2 = r3.e()
            r0.a(r2)
            xyz.adscope.ad.publish.ASNPInitConfig r2 = r3.b
            java.util.List r2 = r2.getCurrency()
            r0.a(r2)
            java.lang.String r2 = r3.d
            r0.a(r2)
            java.util.List r2 = r3.g()
            r0.b(r2)
            xyz.adscope.ad.publish.ASNPInitConfig r2 = r3.b
            if (r2 == 0) goto L36
            int r2 = r2.getCountryCN()
            goto L45
        L36:
            xyz.adscope.common.v2.dev.IDeviceInterface r2 = r3.e
            if (r2 == 0) goto L3f
            int r2 = r2.getCountryCN()
            goto L45
        L3f:
            xyz.adscope.common.v2.dev.DeviceInfoConstants$CountryType r2 = xyz.adscope.common.v2.dev.DeviceInfoConstants.CountryType.COUNTRY_CHINA_TYPE
            int r2 = r2.getCode()
        L45:
            r0.c(r2)
            xyz.adscope.ad.publish.ASNPInitConfig r2 = r3.b
            if (r2 == 0) goto L53
            boolean r2 = r2.getIsTestAd()
            if (r2 == 0) goto L53
            goto L54
        L53:
            r1 = 0
        L54:
            r0.d(r1)
            r1 = 5000(0x1388, float:7.006E-42)
            r0.b(r1)
            java.lang.String r0 = r0.toJsonString()
            return r0
        L61:
            java.lang.String r0 = ""
            return r0
    }

    public void a(xyz.adscope.ad.a2 r1, xyz.adscope.ad.publish.ASNPInitConfig r2, xyz.adscope.ad.c r3, java.lang.String r4) {
            r0 = this;
            r0.a = r1
            r0.b = r2
            r0.d = r4
            r0.f = r3
            return
    }
}
