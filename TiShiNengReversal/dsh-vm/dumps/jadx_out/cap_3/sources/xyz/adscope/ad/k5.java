package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class k5 extends xyz.adscope.ad.t {

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "type")
    private int a;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "ua")
    private java.lang.String b;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "lmt")
    private int c;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "make")
    private java.lang.String d;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "brand")
    private java.lang.String e;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "model")
    private java.lang.String f;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "os")
    private int g;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "osv")
    private java.lang.String h;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "h")
    private int i;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "w")
    private int j;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "ppi")
    private java.lang.String k;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "pxratio")
    private java.lang.String l;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "lang")
    private java.lang.String m;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "carrier")
    private java.lang.String n;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "contype")
    private java.lang.String o;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "hmsCoreVersion")
    private java.lang.String p;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "tzone")
    private java.lang.String q;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "hmsStoreVersion")
    private java.lang.String r;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "country")
    private java.lang.String s;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "ext")
    private xyz.adscope.ad.i5 t;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "geo")
    private xyz.adscope.ad.j5 u;

    public k5(xyz.adscope.common.v2.dev.IDeviceInterface r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L7d
            int r0 = r2.getDeviceType()
            r1.a = r0
            java.lang.String r0 = r2.getUserAgent()
            r1.b = r0
            java.lang.String r0 = r2.getManufacturer()
            r1.d = r0
            java.lang.String r0 = r2.getBrand()
            r1.e = r0
            java.lang.String r0 = r2.getModel()
            r1.f = r0
            int r0 = r2.getOs()
            r1.g = r0
            java.lang.String r0 = r2.getAndroidRelease()
            r1.h = r0
            int r0 = r2.getScreenWidthPX()
            r1.j = r0
            int r0 = r2.getScreenHeightPX()
            r1.i = r0
            int r0 = r2.getDensityDpi()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.k = r0
            float r0 = r2.getDensity()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.l = r0
            java.lang.String r0 = r2.getLanguage()
            r1.m = r0
            java.lang.String r0 = r2.getCarrier()
            r1.n = r0
            int r0 = r2.getConnectType()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.o = r0
            java.lang.String r0 = r2.getHmsCoreVersion()
            r1.p = r0
            java.lang.String r0 = r2.getTimeZone()
            r1.q = r0
            java.lang.String r0 = r2.getHmsStoreVersion()
            r1.r = r0
            java.lang.String r2 = r2.getCountryCode()
            r1.s = r2
        L7d:
            return
    }

    public void a(int r1) {
            r0 = this;
            r0.c = r1
            return
    }

    public void a(xyz.adscope.ad.i5 r1) {
            r0 = this;
            r0.t = r1
            return
    }

    public void a(xyz.adscope.ad.j5 r1) {
            r0 = this;
            r0.u = r1
            return
    }
}
