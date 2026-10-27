package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
class d5 extends xyz.adscope.common.analyse.model.IBaseEventReportModel {
    private xyz.adscope.ad.d5.f a;
    private xyz.adscope.ad.d5.b b;
    private xyz.adscope.ad.d5.i c;
    private xyz.adscope.ad.d5.d d;
    private xyz.adscope.ad.d5.h e;
    private xyz.adscope.ad.d5.a f;
    private xyz.adscope.ad.d5.g g;
    private xyz.adscope.ad.d5.e h;
    private xyz.adscope.ad.d5.c i;

    @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__LOG_TIME__")
    private final java.lang.String j;

    @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__EVENT_ID__")
    private final java.lang.String k;

    @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__EVENT_VERSION__")
    private final java.lang.String l;

    @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__EVENT_CODE__")
    private final java.lang.String m;

    @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__EVENT_SPACE__")
    private final java.lang.String n;

    @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__EVENT_TIME__")
    private final java.lang.String o;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a extends xyz.adscope.common.v2.model.IBaseMacrosMappingModel implements xyz.adscope.common.v2.model.IDeepCopyModel {

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__SESSION_ID__")
        private final java.lang.String a;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__COST_TIME__")
        private final java.lang.String b;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__SPACE_ID__")
        private final java.lang.String c;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__AD_SPACE_TYPE__")
        private final java.lang.String d;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__DSP_ID__")
        private final java.lang.String e;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__PRICE__")
        private final java.lang.String f;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__ADN_RENDER_ID__")
        private final java.lang.String g;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__ADN_INTERACTION_ID__")
        private final java.lang.String h;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__CLICK_TYPE__")
        private final java.lang.String i;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__AD_ERROR_CODE__")
        private final java.lang.String j;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__AD_ERROR_INFO__")
        private final java.lang.String k;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__ORDER_ID__")
        private final java.lang.String l;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__MATERIAL_ID__")
        private final java.lang.String m;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__MAX_WAIT_TIME__")
        private final java.lang.String n;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__AD_TYPE__")
        private final java.lang.String o;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__CURRENCY__")
        private final java.lang.String p;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__IS_WIN__")
        private final java.lang.String q;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__WIN_PRICE__")
        private final java.lang.String r;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__EXP_PRICE__")
        private final java.lang.String s;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__QUANTITY__")
        private final java.lang.String t;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__CREATIVE_ID__")
        private final java.lang.String u;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__COMPLAIN__")
        private final java.lang.String v;

        a(xyz.adscope.ad.b1 r5) {
                r4 = this;
                r4.<init>()
                java.lang.String r0 = r5.e()
                r4.v = r0
                java.lang.String r0 = r5.f()
                r4.u = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                int r1 = r5.s()
                r0.append(r1)
                java.lang.String r1 = ""
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r4.t = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                double r2 = r5.q()
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r4.s = r0
                java.lang.String r0 = r5.y()
                r4.r = r0
                java.lang.String r0 = r5.c()
                r4.q = r0
                java.lang.String r0 = r5.g()
                r4.p = r0
                xyz.adscope.ad.c r0 = r5.b()
                java.lang.String r0 = r0.c()
                r4.o = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                long r2 = r5.o()
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r4.n = r0
                java.lang.String r0 = r5.n()
                r4.m = r0
                java.lang.String r0 = r5.p()
                r4.l = r0
                java.lang.String r0 = r5.k()
                r4.k = r0
                int r0 = r5.j()
                r2 = -1
                if (r0 == r2) goto L99
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                int r3 = r5.j()
                r0.append(r3)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                goto L9a
            L99:
                r0 = r1
            L9a:
                r4.j = r0
                int r0 = r5.m()
                if (r0 != r2) goto La4
                r0 = r1
                goto Lb7
            La4:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                int r2 = r5.m()
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
            Lb7:
                r4.i = r0
                java.lang.String r0 = r5.u()
                r4.h = r0
                java.lang.String r0 = r5.u()
                r4.g = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                double r2 = r5.q()
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r4.f = r0
                java.lang.String r0 = r5.i()
                r4.e = r0
                xyz.adscope.ad.c r0 = r5.b()
                java.lang.String r0 = r0.c()
                r4.d = r0
                java.lang.String r0 = r5.w()
                r4.c = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                long r2 = r5.h()
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r4.b = r0
                java.lang.String r5 = r5.t()
                r4.a = r5
                return
        }

        private a(xyz.adscope.ad.d5.a r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = r2.a
                r1.a = r0
                java.lang.String r0 = r2.b
                r1.b = r0
                java.lang.String r0 = r2.c
                r1.c = r0
                java.lang.String r0 = r2.d
                r1.d = r0
                java.lang.String r0 = r2.e
                r1.e = r0
                java.lang.String r0 = r2.f
                r1.f = r0
                java.lang.String r0 = r2.g
                r1.g = r0
                java.lang.String r0 = r2.h
                r1.h = r0
                java.lang.String r0 = r2.i
                r1.i = r0
                java.lang.String r0 = r2.j
                r1.j = r0
                java.lang.String r0 = r2.k
                r1.k = r0
                java.lang.String r0 = r2.l
                r1.l = r0
                java.lang.String r0 = r2.m
                r1.m = r0
                java.lang.String r0 = r2.n
                r1.n = r0
                java.lang.String r0 = r2.o
                r1.o = r0
                java.lang.String r0 = r2.p
                r1.p = r0
                java.lang.String r0 = r2.q
                r1.q = r0
                java.lang.String r0 = r2.r
                r1.r = r0
                java.lang.String r0 = r2.s
                r1.s = r0
                java.lang.String r0 = r2.t
                r1.t = r0
                java.lang.String r0 = r2.u
                r1.u = r0
                java.lang.String r2 = r2.v
                r1.v = r2
                return
        }

        public xyz.adscope.ad.d5.a a() {
                r1 = this;
                xyz.adscope.ad.d5$a r0 = new xyz.adscope.ad.d5$a
                r0.<init>(r1)
                return r0
        }

        @Override // xyz.adscope.common.v2.model.IDeepCopyModel
        public /* bridge */ /* synthetic */ xyz.adscope.common.v2.model.IDeepCopyModel deepCopy() {
                r1 = this;
                xyz.adscope.ad.d5$a r0 = r1.a()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b extends xyz.adscope.common.v2.model.IBaseMacrosMappingModel {

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__APP_VERSION__")
        private final java.lang.String a;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__APP_NAME__")
        private final java.lang.String b;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__BUNDLE_ID__")
        private final java.lang.String c;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__INSTALL_TIME__")
        private final java.lang.String d;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__UPDATE_TIME__")
        private final java.lang.String e;

        b(android.content.Context r5) {
                r4 = this;
                r4.<init>()
                java.lang.String r0 = xyz.adscope.common.v2.dev.info.PackageUtil.getAppVersionName(r5)
                r4.a = r0
                java.lang.String r0 = xyz.adscope.common.v2.dev.info.PackageUtil.getAppName(r5)
                r4.b = r0
                java.lang.String r0 = r5.getPackageName()
                r4.c = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                long r1 = xyz.adscope.common.v2.dev.info.PackageUtil.getAppInstallDate(r5)
                r0.append(r1)
                java.lang.String r1 = ""
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r4.d = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                long r2 = xyz.adscope.common.v2.dev.info.PackageUtil.getAppLastUpdateTime(r5)
                r0.append(r2)
                r0.append(r1)
                java.lang.String r5 = r0.toString()
                r4.e = r5
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class c extends xyz.adscope.common.v2.model.IBaseMacrosMappingModel {

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__APP_INSTALLS__")
        private final java.lang.String a;

        c(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class d extends xyz.adscope.common.v2.model.IBaseMacrosMappingModel {

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__SAID__")
        private final java.lang.String a;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__ACCESS_KEY__")
        private final java.lang.String b;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__ACCESS_TYPE__")
        private final java.lang.String c;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__AD_SDK_VERSION__")
        private final java.lang.String d;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__CUSTOM_LOGGER__")
        private final java.lang.String e;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__CUSTOM_ID__")
        private final java.lang.String f;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__LOG_VERSION__")
        private final java.lang.String g;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__ORG_KEY__")
        private final java.lang.String h;

        d(android.content.Context r1) {
                r0 = this;
                r0.<init>()
                java.lang.String r1 = xyz.adscope.ad.f0.a(r1)
                r0.a = r1
                java.lang.String r1 = xyz.adscope.ad.f0.d()
                r0.c = r1
                java.lang.String r1 = xyz.adscope.ad.f0.c()
                r0.d = r1
                java.lang.String r1 = xyz.adscope.ad.f0.a()
                r0.b = r1
                java.lang.String r1 = xyz.adscope.ad.f0.b()
                r0.e = r1
                java.lang.String r1 = xyz.adscope.ad.f0.e()
                r0.f = r1
                java.lang.String r1 = xyz.adscope.ad.f0.f()
                r0.g = r1
                java.lang.String r1 = xyz.adscope.ad.f0.a()
                r0.h = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class e extends xyz.adscope.common.v2.model.IBaseMacrosMappingModel {

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__AFFILIATED__")
        private final java.lang.String a;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__EXCEPTION__")
        private final java.lang.String b;

        e(xyz.adscope.ad.m1 r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = r2.a()
                r1.a = r0
                java.lang.String r2 = r2.b()
                r1.b = r2
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class f extends xyz.adscope.common.v2.model.IBaseMacrosMappingModel {

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__OAID__")
        private final java.lang.String a;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__GAID__")
        private final java.lang.String b;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__OOAID__")
        private final java.lang.String c;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__OGAID__")
        private final java.lang.String d;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__DEVICE_NAME__")
        private final java.lang.String e;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__DEVICE_TYPE__")
        private final java.lang.String f;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__MAKE__")
        private final java.lang.String g;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__BRAND__")
        private final java.lang.String h;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__MODEL__")
        private final java.lang.String i;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__PHYSICAL_MEMORY__")
        private final java.lang.String j;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__HARD_DISK_SIZE__")
        private final java.lang.String k;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__W__")
        private final java.lang.String l;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__H__")
        private final java.lang.String m;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__DENSITY__")
        private final java.lang.String n;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__ORIENTATION__")
        private final java.lang.String o;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__OS__")
        private final java.lang.String p;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__OSV__")
        private final java.lang.String q;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__USER_AGENT__")
        private final java.lang.String r;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__ZONE__")
        private final java.lang.String s;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__LANG__")
        private final java.lang.String t;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__COUNTRY__")
        private final java.lang.String u;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__CARRIER__")
        private final java.lang.String v;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__UPDATE_MARK__")
        private final java.lang.String w;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__FILE_MARK__")
        private final java.lang.String x;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__CONNECTION_TYPE__")
        private final java.lang.String y;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__ROMVERSION__")
        private final java.lang.String z;

        f(xyz.adscope.common.v2.dev.IDeviceInterface r4) {
                r3 = this;
                r3.<init>()
                java.lang.String r0 = r4.getOAID()
                r3.a = r0
                java.lang.String r0 = r4.getGAID()
                r3.b = r0
                java.lang.String r0 = r4.getOAID()
                r3.c = r0
                java.lang.String r0 = r4.getGAID()
                r3.d = r0
                java.lang.String r0 = r4.getDeviceName()
                r3.e = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                int r1 = r4.getDeviceType()
                r0.append(r1)
                java.lang.String r1 = ""
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.f = r0
                java.lang.String r0 = r4.getManufacturer()
                r3.g = r0
                java.lang.String r0 = r4.getBrand()
                r3.h = r0
                java.lang.String r0 = r4.getModel()
                r3.i = r0
                java.lang.String r0 = r4.getPhysicalMemory()
                r3.j = r0
                java.lang.String r0 = r4.getHardDisk()
                r3.k = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                int r2 = r4.getResolutionWidth()
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.l = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                int r2 = r4.getResolutionHeight()
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.m = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                float r2 = r4.getDensity()
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.n = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                int r2 = r4.getOrientation()
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.o = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                int r2 = r4.getOs()
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.p = r0
                java.lang.String r0 = r4.getAndroidRelease()
                r3.q = r0
                java.lang.String r0 = r4.getUserAgent()
                r3.r = r0
                java.lang.String r0 = r4.getTimeZone()
                r3.s = r0
                java.lang.String r0 = r4.getLanguage()
                r3.t = r0
                java.lang.String r0 = r4.getCountryCode()
                r3.u = r0
                java.lang.String r0 = r4.getCarrier()
                r3.v = r0
                java.lang.String r0 = r4.getDeviceUpdateMark()
                r3.w = r0
                java.lang.String r0 = r4.getFileMark()
                r3.x = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                int r2 = r4.getConnectType()
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.y = r0
                java.lang.String r4 = r4.getOMERomVersion()
                r3.z = r4
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class g extends xyz.adscope.common.v2.model.IBaseMacrosMappingModel implements xyz.adscope.common.v2.model.IDeepCopyModel {

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__UPDATE_MD5__")
        private final java.lang.String a;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__REQUESTURL_MD5__")
        private final java.lang.String b;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__STRATEGY_MD5__")
        private final java.lang.String c;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__TEMPLATE_MD5__")
        private final java.lang.String d;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__STATISTICS_MD5__")
        private final java.lang.String e;

        private g(xyz.adscope.ad.d5.g r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = r2.a
                r1.a = r0
                java.lang.String r0 = r2.b
                r1.b = r0
                java.lang.String r0 = r2.c
                r1.c = r0
                java.lang.String r0 = r2.d
                r1.d = r0
                java.lang.String r2 = r2.e
                r1.e = r2
                return
        }

        g(xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = r2.o()
                r1.a = r0
                java.lang.String r0 = r2.g()
                r1.b = r0
                java.lang.String r0 = r2.k()
                r1.c = r0
                java.lang.String r0 = r2.l()
                r1.d = r0
                java.lang.String r2 = r2.i()
                r1.e = r2
                return
        }

        public xyz.adscope.ad.d5.g a() {
                r1 = this;
                xyz.adscope.ad.d5$g r0 = new xyz.adscope.ad.d5$g
                r0.<init>(r1)
                return r0
        }

        @Override // xyz.adscope.common.v2.model.IDeepCopyModel
        public /* bridge */ /* synthetic */ xyz.adscope.common.v2.model.IDeepCopyModel deepCopy() {
                r1 = this;
                xyz.adscope.ad.d5$g r0 = r1.a()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class h extends xyz.adscope.common.v2.model.IBaseMacrosMappingModel implements xyz.adscope.common.v2.model.IDeepCopyModel {

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__START_ID__")
        private final java.lang.String a;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__COST_TIME__")
        private final java.lang.String b;

        h(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }

        public xyz.adscope.ad.d5.h a() {
                r3 = this;
                xyz.adscope.ad.d5$h r0 = new xyz.adscope.ad.d5$h
                java.lang.String r1 = r3.a
                java.lang.String r2 = r3.b
                r0.<init>(r1, r2)
                return r0
        }

        @Override // xyz.adscope.common.v2.model.IDeepCopyModel
        public /* bridge */ /* synthetic */ xyz.adscope.common.v2.model.IDeepCopyModel deepCopy() {
                r1 = this;
                xyz.adscope.ad.d5$h r0 = r1.a()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class i extends xyz.adscope.common.v2.model.IBaseMacrosMappingModel {

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__USER_ID__")
        private final java.lang.String a;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__COAID__")
        private final java.lang.String b;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__CGAID__")
        private final java.lang.String c;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__LMT__")
        private final java.lang.String d;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__USER_CUSTOM_DATA__")
        private final java.lang.String e;

        @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__APP_ID__")
        private final java.lang.String f;

        i(xyz.adscope.ad.publish.ASNPInitConfig r3) {
                r2 = this;
                r2.<init>()
                java.lang.String r0 = r3.getUserId()
                r2.a = r0
                boolean r0 = r3.canUseOAIDInfo()
                java.lang.String r1 = r3.getCustomOAID()
                r2.b = r1
                java.lang.String r1 = r3.getCustomGAID()
                r2.c = r1
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                java.lang.String r0 = ""
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                r2.d = r0
                java.lang.String r0 = r2.a(r3)
                r2.e = r0
                java.lang.String r3 = r3.getAppId()
                r2.f = r3
                return
        }

        java.lang.String a(xyz.adscope.ad.publish.ASNPInitConfig r1) {
                r0 = this;
                java.util.Map r1 = r1.getOptionFields()
                java.lang.String r1 = xyz.adscope.common.v2.tool.json.JsonUtil.parseMap2JsonStr(r1)
                return r1
        }
    }

    d5(xyz.adscope.common.analyse.model.IStringEventEnum r4) {
            r3 = this;
            r3.<init>(r4)
            java.lang.String r4 = ""
            r3.l = r4
            java.lang.String r0 = r3.getEventCode()
            r3.m = r0
            java.lang.String r0 = "NSDK"
            r3.n = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = java.lang.System.currentTimeMillis()
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.j = r4
            r3.o = r4
            java.lang.String r4 = xyz.adscope.common.v2.tool.str.SerialUtil.generateReportEventID()
            r3.k = r4
            return
    }

    public xyz.adscope.ad.d5 a() {
            r2 = this;
            xyz.adscope.ad.d5 r0 = new xyz.adscope.ad.d5
            xyz.adscope.common.analyse.model.IStringEventEnum r1 = r2.event
            r0.<init>(r1)
            xyz.adscope.ad.d5$f r1 = r2.a
            if (r1 == 0) goto Ld
            r0.a = r1
        Ld:
            xyz.adscope.ad.d5$b r1 = r2.b
            if (r1 == 0) goto L13
            r0.b = r1
        L13:
            xyz.adscope.ad.d5$i r1 = r2.c
            if (r1 == 0) goto L19
            r0.c = r1
        L19:
            xyz.adscope.ad.d5$d r1 = r2.d
            if (r1 == 0) goto L1f
            r0.d = r1
        L1f:
            xyz.adscope.ad.d5$h r1 = r2.e
            if (r1 == 0) goto L29
            xyz.adscope.ad.d5$h r1 = r1.a()
            r0.e = r1
        L29:
            xyz.adscope.ad.d5$a r1 = r2.f
            if (r1 == 0) goto L33
            xyz.adscope.ad.d5$a r1 = r1.a()
            r0.f = r1
        L33:
            xyz.adscope.ad.d5$g r1 = r2.g
            if (r1 == 0) goto L3d
            xyz.adscope.ad.d5$g r1 = r1.a()
            r0.g = r1
        L3d:
            xyz.adscope.ad.d5$e r1 = r2.h
            if (r1 == 0) goto L43
            r0.h = r1
        L43:
            xyz.adscope.ad.d5$c r1 = r2.i
            if (r1 == 0) goto L49
            r0.i = r1
        L49:
            return r0
    }

    void a(xyz.adscope.ad.d5.a r1) {
            r0 = this;
            r0.f = r1
            return
    }

    void a(xyz.adscope.ad.d5.b r1) {
            r0 = this;
            r0.b = r1
            return
    }

    void a(xyz.adscope.ad.d5.c r1) {
            r0 = this;
            r0.i = r1
            return
    }

    void a(xyz.adscope.ad.d5.d r1) {
            r0 = this;
            r0.d = r1
            return
    }

    void a(xyz.adscope.ad.d5.e r1) {
            r0 = this;
            r0.h = r1
            return
    }

    void a(xyz.adscope.ad.d5.f r1) {
            r0 = this;
            r0.a = r1
            return
    }

    void a(xyz.adscope.ad.d5.g r1) {
            r0 = this;
            r0.g = r1
            return
    }

    void a(xyz.adscope.ad.d5.h r1) {
            r0 = this;
            r0.e = r1
            return
    }

    void a(xyz.adscope.ad.d5.i r1) {
            r0 = this;
            r0.c = r1
            return
    }

    @Override // xyz.adscope.common.v2.model.IDeepCopyModel
    public /* bridge */ /* synthetic */ xyz.adscope.common.v2.model.IDeepCopyModel deepCopy() {
            r1 = this;
            xyz.adscope.ad.d5 r0 = r1.a()
            return r0
    }
}
