package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class j1 implements xyz.adscope.ad.p2 {
    private final android.content.Context a;
    private final java.lang.String b;

    public j1(android.content.Context r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    private java.lang.String a(xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r1, java.lang.String r2) {
            r0 = this;
            if (r1 == 0) goto L15
            java.lang.String r1 = r1.toJsonString()
            java.lang.Object r1 = xyz.adscope.common.v2.tool.json.JsonUtil.getObject(r1, r2)
            if (r1 == 0) goto L15
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = xyz.adscope.common.v2.encrypt.impl.MD5Util.md5(r1)
            return r1
        L15:
            java.lang.String r1 = ""
            return r1
    }

    private xyz.adscope.ad.k1 a(android.content.Context r4, java.lang.String r5) {
            r3 = this;
            xyz.adscope.ad.k1 r0 = new xyz.adscope.ad.k1
            r0.<init>()
            long r1 = java.lang.System.currentTimeMillis()
            r0.a(r1)
            r0.b(r5)
            java.lang.String r5 = xyz.adscope.ad.f0.a()
            r0.a(r5)
            xyz.adscope.ad.k r5 = xyz.adscope.ad.k.a()
            java.lang.Object r5 = r5.getOrCreateImplement(r4)
            xyz.adscope.ad.j r5 = (xyz.adscope.ad.j) r5
            if (r5 == 0) goto L27
            xyz.adscope.common.v2.dev.IDeviceInterface r5 = r5.b()
            goto L28
        L27:
            r5 = 0
        L28:
            if (r5 == 0) goto Le1
            java.lang.String r1 = r5.getUserAgent()
            r0.w(r1)
            int r1 = r5.getDeviceType()
            r0.c(r1)
            java.lang.String r1 = r5.getManufacturer()
            r0.k(r1)
            java.lang.String r1 = r5.getBrand()
            r0.c(r1)
            java.lang.String r1 = r5.getModel()
            r0.l(r1)
            int r1 = r5.getOs()
            r0.e(r1)
            java.lang.String r1 = r5.getAndroidRelease()
            r0.n(r1)
            java.lang.String r1 = r5.getCarrier()
            r0.d(r1)
            int r1 = r5.getConnectType()
            r0.a(r1)
            java.lang.String r1 = r5.getLanguage()
            r0.j(r1)
            int r1 = r5.getScreenWidthPX()
            r0.i(r1)
            int r1 = r5.getScreenHeightPX()
            r0.h(r1)
            int r1 = r5.getScreenWidthPX()
            r0.g(r1)
            int r1 = r5.getScreenHeightPX()
            r0.f(r1)
            int r1 = r5.getOrientation()
            r0.d(r1)
            float r1 = r5.getDensity()
            r0.a(r1)
            int r1 = r5.getDensityDpi()
            float r1 = (float) r1
            r0.b(r1)
            java.lang.String r1 = r5.getDeviceUpdateMark()
            r0.u(r1)
            java.lang.String r1 = r5.getPhysicalMemory()
            r0.o(r1)
            java.lang.String r1 = r5.getHardDisk()
            r0.i(r1)
            java.lang.String r1 = r5.getDeviceName()
            r0.f(r1)
            java.lang.String r1 = r5.getCountryCode()
            r0.e(r1)
            java.lang.String r1 = r5.getFileMark()
            r0.g(r1)
            int r5 = r5.getCountryCN()
            r0.b(r5)
            java.lang.String r5 = xyz.adscope.ad.f0.a(r4)
            r0.r(r5)
            java.lang.String r5 = xyz.adscope.ad.f0.a(r4)
            r0.q(r5)
        Le1:
            xyz.adscope.ad.f r5 = xyz.adscope.ad.f.a()
            java.lang.Object r5 = r5.getOrCreateImplement(r4)
            xyz.adscope.ad.e r5 = (xyz.adscope.ad.e) r5
            if (r5 == 0) goto L134
            xyz.adscope.ad.publish.ASNPInitConfig r1 = r5.a()
            if (r1 == 0) goto L109
            boolean r1 = r1.canUseOAIDInfo()
            if (r1 == 0) goto L109
            xyz.adscope.common.v2.dev.oaid.OAIDHelper r1 = xyz.adscope.common.v2.dev.oaid.OAIDHelper.getInstance()
            java.lang.String r4 = r1.getOAID(r4)
            r0.m(r4)
            java.lang.String r4 = ""
            r0.h(r4)
        L109:
            r4 = 0
            xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r4 = r5.a(r4)
            if (r4 == 0) goto L134
            java.lang.String r5 = "update"
            java.lang.String r5 = r3.a(r4, r5)
            r0.v(r5)
            java.lang.String r5 = "requestUrl"
            java.lang.String r5 = r3.a(r4, r5)
            r0.p(r5)
            java.lang.String r5 = "strategy"
            java.lang.String r5 = r3.a(r4, r5)
            r0.t(r5)
            java.lang.String r5 = "statistics"
            java.lang.String r4 = r3.a(r4, r5)
            r0.s(r4)
        L134:
            return r0
    }

    @Override // xyz.adscope.ad.p2
    public java.lang.String a() {
            r2 = this;
            android.content.Context r0 = r2.a
            java.lang.String r1 = r2.b
            xyz.adscope.ad.k1 r0 = r2.a(r0, r1)
            java.lang.String r0 = r0.toJsonString()
            return r0
    }
}
